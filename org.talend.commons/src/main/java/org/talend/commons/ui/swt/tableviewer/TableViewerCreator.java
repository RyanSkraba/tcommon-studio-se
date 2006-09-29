// ============================================================================
//
// Talend Community Edition
//
// Copyright (C) 2006 Talend - www.talend.com
//
// This library is free software; you can redistribute it and/or
// modify it under the terms of the GNU Lesser General Public
// License as published by the Free Software Foundation; either
// version 2.1 of the License, or (at your option) any later version.
//
// This library is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
// Lesser General Public License for more details.
//
// You should have received a copy of the GNU General Public License
// along with this program; if not, write to the Free Software
// Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
//
// ============================================================================
package org.talend.commons.ui.swt.tableviewer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.internal.runtime.InternalPlatform;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.util.Assert;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnLayoutData;
import org.eclipse.jface.viewers.ColumnPixelData;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.TableLayout;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.ControlListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Layout;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.osgi.framework.BundleContext;
import org.talend.commons.ui.ws.WindowSystem;
import org.talend.commons.utils.data.list.IListenableListListener;
import org.talend.commons.utils.data.list.ListenableList;
import org.talend.commons.utils.data.list.ListenableListEvent;

/**
 * A concrete Table viewer based on the JFace <code>TableViewer</code> and the SWT <code>Table</code> control.
 * <p>
 * This class is intended to make easier creation and use of a table.
 * 
 * For a basic usage you need create columns with <code>TableViewerCreatorColumn</code> and init a addedObjects of
 * objects. The addedObjects will be introspected to retrieve values of each its objects. Each object of the
 * addedObjects will represent one line in the Table.
 * 
 * The following functions are already implemented : sort, automatic resize of columns (see layoutMode), and basic
 * functions.
 * 
 * You can access directly to instanciated <code>TableViewer</code> and <code>Table</code> to manage, add custom
 * listeners or other usages.
 * 
 * Filtering is not currently implemented, but you can add manually yours.
 * 
 * <p>
 * You can add CellEditor using <code>TableViewerCreatorColumn</code> and <code>setCellEditor()</code> method.
 * According case you will have to override certain methods of <code>CellEditorValueAdapter</code>.
 * </p>
 * 
 * <p>
 * You can add TableEditor using <code>TableViewerCreatorColumn</code> and <code>setTableEditor()</code> method.
 * According case you will have to override certain methods of <code>TableEditorInitializer</code>.
 * </p>
 * 
 * Read the following steps to create a reflect table :
 * <p>
 * 1) instanciate <code>TableViewerCreator</code>
 * </p>
 * <p>
 * 2) configure, the methods below are used to configure internally style of <code>Table</code> object, so if you want
 * use these methods call them before <code>createTable</code> : <br/>- <code>setLineSelection</code> <br/>-
 * <code>setShowSelection</code> <br/>- <code>setCheckboxInFirstColumn</code> <br/>- <code>setBorderVisible</code>
 * <br/>- <code>setHorizontalScroll</code> <br/>- <code>setVerticalScroll</code> <br/>-
 * <code>setHeaderVisible</code> <br/>- <code>setLinesVisible</code>
 * </p>
 * 
 * <p>
 * 3) optionally call <code>createTable</code> if you need initialize <code>Table</code>'s children components
 * before <code>init</code> call.
 * </p>
 * <p>
 * 4) create <code>TableViewerCreatorColumn</code> columns and configure them. <BR/>Description of the main parameters :
 * <BR/> - <code>beanPropertyName</code> represents the property of each object of your addedObjects which will be
 * read (and write). <BR/> - <code>idProperty</code> (optional) represents the <b>unique id</b> of the column, it is
 * by default the value of <code>beanPropertyName</code>. If the unicity is not respected, a assertion is thrown.
 * <BR/> - set a <code>width</code> or a <code>weight</code> value. <BR/> - see others parameters in
 * <code>TableViewerCreatorColumn</code>
 * </p>
 * <p>
 * 5) set commons value for columns as you want, call them before <code>init</code> : <br/>-
 * <code>setAllColumnsMoveable</code> <br/>- <code>setAllColumnsResizable</code> <br/>-
 * <code>setAllColumnsSortable</code> <br/>
 * </p>
 * 
 * <p>
 * 6) call <code>init</code> method with your addedObjects of objects in parameter.
 * </p>
 * 
 * @see org.eclipse.jface.viewers#TableViewer
 * @see org.eclipse.swt.widgets#Table <br/>
 * 
 * <br/>
 * 
 * $Id$
 * 
 * @param <O> type of objects in the input list of <code>TableViewer</code>
 */
public class TableViewerCreator<O> {

    private static final String ID_MASKED_COLUMN = "__MASKED_COLUMN__";

    private Composite compositeParent;

    private List<TableViewerCreatorColumn> columns = new ArrayList<TableViewerCreatorColumn>();

    private TableViewer tableViewer;

    private LINE_SELECTION lineSelection;

    private SHOW_SELECTION showSelection;

    /**
     * @see Table#setLinesVisible(boolean)
     */
    private boolean linesVisible;

    /**
     * 
     */
    private Color emptyZoneColor;
    
    /**
     * 
     */
    private boolean emptyZoneLinesVisible;
    
    /**
     * SWT.BORDER style applied to <code>Table</code>.
     * 
     * @see SWT#CHECK
     */
    private boolean borderVisible;

    /**
     * @see Table#setHeaderVisible(boolean)
     */
    private boolean headerVisible;

    /**
     * SWT.CHECK style applied to <code>Table</code>.
     * 
     * @see SWT#CHECK
     */
    private boolean checkboxInFirstColumn;

    private boolean horizontalScroll;

    private boolean verticalScroll;

    private boolean allColumnsMoveable;

    private boolean allColumnsResizable;

    private boolean allColumnsSortable;

    private ICellModifier cellModifier;

    private ITableLabelProvider labelProvider;

    private IStructuredContentProvider contentProvider;

    private ControlListener tableParentResizedListener;

    private Layout layout;

    private int adjustWidthValue;

    private Map<String, TableViewerCreatorColumn> idPropertyToTableViewerCreatorColumn;

    private Table table;

    private ViewerSorter viewerSorter;

    private LAYOUT_MODE layoutMode = LAYOUT_MODE.NONE;

    private boolean firstColumnMasked;

    private boolean initCalled;

    private TableEditorManager tableEditorManager;

    private ModifiedObjectInfo<O> modifiedObjectInfo;

    private TableViewerCreator<O> tableViewerCreator;

    private boolean firstVisibleColumnIsSelection;

    private MouseTableSelectionHelper mouseTableSelectionHelper;

    /**
     * Constructor.
     * 
     * @param compositeParent used to initialize <code>Table</code>.
     */
    public TableViewerCreator(Composite compositeParent) {
        super();
        tableViewerCreator = this;
        this.compositeParent = compositeParent;
    }

    /**
     * 
     * <p>
     * Create a new instance of <code>Table</code> with its <code>TableColumn</code> and create also a new instance
     * of <code>TableViewer</code> if these objects doesn't exist already.
     * </p>
     * 
     * <p>
     * Initialize the <code>TableViewer</code> with by default the <code>DefaultStructuredContentProvider</code>,
     * the <code>DefaultTableLabelProvider</code> and the <code>DefaultTableViewerSorter</code>.
     * </p>
     * 
     */
    public void init() {
        init(null);
    }

    @SuppressWarnings("unchecked")
    public void init(Collection collection) {
        if (collection != null) {
            init(new ArrayList<O>(collection));
        } else {
            init();
        }
    }

    /**
     * 
     * <p>
     * Create a new instance of <code>Table</code> with its <code>TableColumn</code>s and create also a new instance
     * of <code>TableViewer</code> if these objects doesn't exist already.
     * </p>
     * 
     * <p>
     * Initialize the <code>TableViewer</code> with by default the <code>DefaultStructuredContentProvider</code>,
     * the <code>DefaultTableLabelProvider</code> and the <code>DefaultTableViewerSorter</code>.
     * </p>
     * 
     * <p>
     * If you use the default ContentProvider, you must set as input an object which extends <code>Collection</code>.
     * </p>
     * 
     * 
     * <p>
     * <b> If it is the second or more time than you call this method, only the input object is loaded. Call methods of
     * <code>TableViewer</code> for others operations. </b>
     * </p>
     * 
     * @param input by default a object which extends <code>Collection</code>.
     */
    public void init(List list) {

        if (!initCalled) {
            initCalled = true;
            if (this.table == null) {
                createTable();
            }
            tableViewer = buildAndLayoutTable();
            attachContentProvider();
            attachLabelProvider();
            attachCellEditors();
            attachViewerSorter();
            addListeners();
        }
        // long time11 = System.currentTimeMillis();
        if (list != null) {
            if (tableEditorManager != null && list instanceof ListenableList) {
                ((ListenableList) list).addListener(new IListenableListListener() {

                    public void handleEvent(ListenableListEvent event) {
                        // we must refresh the table before creating the control to draw cells
                        getTableViewer().refresh();
                        tableEditorManager.init();
                    }

                });
            }
            tableViewer.setInput(list);
        }
        if (tableEditorManager != null) {
            tableEditorManager.init();
        }
    }

    public List getInputList() {
        return (List) tableViewer.getInput();
    }

    /**
     * 
     * Instantiate the <code>Table</code> with the <code>compositeParent</code> as parent, with pre-configured
     * styles and options.
     * 
     * @return
     */
    public Table createTable() {
        if (this.table != null) {
            this.table.dispose();
        }
        this.table = new Table(compositeParent, checkTableStyles());
        tableViewer = new TableViewer(table);
        setTablePreferences();
        return table;
    }

    private void setTablePreferences() {
        table.setHeaderVisible(headerVisible);
        table.setLinesVisible(linesVisible);

        if (this.emptyZoneColor != null || !emptyZoneLinesVisible) {
            table.addListener(SWT.Paint, new Listener() {
                public void handleEvent(Event event) {
                    GC gc = event.gc;
                    Rectangle area = table.getClientArea();
                    
                    Color foregroundColor = gc.getBackground();
                    if (emptyZoneColor != null) {
                        foregroundColor = emptyZoneColor;
                    }
                    gc.setForeground(foregroundColor);
                    int starty = table.getHeaderHeight() + table.getItemCount() * table.getItemHeight();
                    if (starty < area.height) {
                        gc.fillRectangle(0, starty, area.width, area.height);
                    }
                    TableColumn[] tableColumns = table.getColumns();
                    int widthColumns = 0;
                    for (int i = 0; i < tableColumns.length; i++) {
                        widthColumns += tableColumns[i].getWidth();
                    }
                    if (widthColumns < area.width) {
                        gc.fillRectangle(widthColumns+1, 0, area.width, area.height);
                    }
                    
                }
            });     
        }

        
        
    }

    /**
     * 
     * Initiate the style intended for instanciate <code>Table</code>.
     * 
     * @return int style
     */
    private int checkTableStyles() {
        int style = SWT.NONE;
        if (lineSelection != null) {
            style |= lineSelection.getSwtStyle();
        }
        if (showSelection != null) {
            style |= showSelection.getSwtStyle();
        }
        if (checkboxInFirstColumn) {
            style |= SWT.CHECK;
        }
        if (borderVisible) {
            style |= SWT.BORDER;
        }
        if (horizontalScroll) {
            style |= SWT.H_SCROLL;
        }
        if (verticalScroll) {
            style |= SWT.V_SCROLL;
        }
        return style;
    }

    private void addListeners() {
        
        if (this.firstVisibleColumnIsSelection) {
            this.mouseTableSelectionHelper = new MouseTableSelectionHelper(table, this.firstColumnMasked);
        }
        
        if (this.layoutMode == LAYOUT_MODE.CURRENT_WIDTH) {
            this.tableParentResizedListener = new DefaultTableParentResizedListener(this);
            compositeParent.addControlListener(this.tableParentResizedListener);
        }
    }

    private void attachViewerSorter() {

        if (this.viewerSorter == null) {
            this.viewerSorter = new DefaultTableViewerSorter();
        }
        tableViewer.setSorter(this.viewerSorter);
    }

    private void attachLabelProvider() {
        if (this.labelProvider == null) {
            this.labelProvider = new DefaultTableLabelProvider(this);
        }
        tableViewer.setLabelProvider(this.labelProvider);
    }

    private void attachContentProvider() {
        if (this.contentProvider == null) {
            this.contentProvider = new DefaultStructuredContentProvider(this);
        }
        tableViewer.setContentProvider(this.contentProvider);
    }

    private TableViewer buildAndLayoutTable() {
        if (this.layoutMode == LAYOUT_MODE.DEFAULT || this.layoutMode == LAYOUT_MODE.SHOW_ALWAYS_ALL_COLUMNS
                || this.layoutMode == LAYOUT_MODE.CONTINUOUS_CURRENT) {
            TableViewerCreatorLayout currentTableLayout = new TableViewerCreatorLayout(tableViewerCreator, 50);
            currentTableLayout.setWidthAdjustValue(this.adjustWidthValue);
            currentTableLayout.setShowAlwaysAllColumns(this.layoutMode == LAYOUT_MODE.SHOW_ALWAYS_ALL_COLUMNS);
            currentTableLayout.setContinuousLayout(this.layoutMode == LAYOUT_MODE.SHOW_ALWAYS_ALL_COLUMNS
                    || this.layoutMode == LAYOUT_MODE.CONTINUOUS_CURRENT);
            this.layout = currentTableLayout;
        }

        idPropertyToTableViewerCreatorColumn = new HashMap<String, TableViewerCreatorColumn>(columns.size());

        if (firstColumnMasked || columns.size() == 0) {
            TableViewerCreatorColumn maskedTableViewerCreatorColumn = new TableViewerCreatorColumn();
            maskedTableViewerCreatorColumn.setId(ID_MASKED_COLUMN);
            columns.add(0, maskedTableViewerCreatorColumn);
        }

        int size = columns.size();
        for (int i = 0; i < size; i++) {
            final TableViewerCreatorColumn column = columns.get(i);
            TableColumn tableColumn = column.getTableColumn();
            if (WindowSystem.isGTK() 
                    && column.getWidth() == 0 
                    && column.getWeight() == 0) { // bug with GTK for cell edition when width == 0
                column.setWidth(1);
            }
            initColumnLayout(column);
            if (tableColumn == null) {
                tableColumn = createTableColumn(column);
                column.setTableColumn(tableColumn);
            } else {
                Assert.isTrue(tableColumn.getParent() == this.table, "The TableColumn of TableEditorColumn with idProperty '"
                        + column.getId() + "' has not the correct Table parent");
            }
            Assert.isTrue(idPropertyToTableViewerCreatorColumn.get(column.getId()) == null,
                    "You must change the idProperty of one of your column, the idProperty must be unique for each column for one Table.");

            idPropertyToTableViewerCreatorColumn.put(column.getId(), column);
        }
        if (layout != null) {
            table.setLayout(layout);
            table.layout();
        }
        return tableViewer;
    }

    /**
     * DOC amaumont Comment method "initColumnLayout".
     * 
     * @param column
     */
    private void initColumnLayout(final TableViewerCreatorColumn column) {
        ColumnLayoutData columnLayoutData = null;
        if (column.getWeight() > 0) {
            columnLayoutData = new ColumnWeightData(column.getWeight(), column.getMinimumWidth(), column.isResizable());
        } else {
            columnLayoutData = new ColumnPixelData(column.getWidth(), column.isResizable(), false);
        }
        if (layout instanceof TableViewerCreatorLayout) {
            ((TableViewerCreatorLayout) layout).addColumnData(columnLayoutData);
        } else if (layout instanceof TableLayout) {
            ((TableLayout) layout).addColumnData(columnLayoutData);
        }
    }

    /**
     * Create a <code>TableColumn</code> and intialize it from <code>TableViewerCreatorColumn</code>'s properties.
     * 
     * @param column
     */
    private TableColumn createTableColumn(final TableViewerCreatorColumn column) {
        boolean isMaskedColumn = false;
        if (column.getId().equals(ID_MASKED_COLUMN)) {
            isMaskedColumn = true;
        }
        TableColumn tableColumn;
        tableColumn = new TableColumn(this.table, column.getAlignment().getSwtAlignment());
        if (isMaskedColumn) {
            tableColumn.setMoveable(false);
            tableColumn.setResizable(false);
        } else {
            tableColumn.setImage(column.getImage());
            tableColumn.setText(column.getTitle() != null ? column.getTitle() : column.getId());
            tableColumn.setToolTipText(column.getToolTipText());

            if (column.getTableEditorContent() != null) {
                if (tableEditorManager == null) {
                    tableEditorManager = new TableEditorManager(this);
                }
            }

            if (this.allColumnsMoveable) {
                tableColumn.setMoveable(true);
            } else {
                tableColumn.setMoveable(column.isMoveable());
            }
            if (this.allColumnsResizable) {
                tableColumn.setResizable(true);
            } else {
                tableColumn.setResizable(column.isResizable());
            }
            if (this.allColumnsSortable) {
                column.setSortable(true);
            }
            if (column.isSortable()) {
                ITableColumnSelectionListener columnSelectionListener = null;
                if (column.getTableColumnSelectionListener() == null) {
                    columnSelectionListener = new DefaultHeaderColumnSelectionListener(column, this);
                    column.setTableColumnSelectionListener(columnSelectionListener);
                } else {
                    columnSelectionListener = column.getTableColumnSelectionListener();
                }
                tableColumn.addSelectionListener(columnSelectionListener);
            }
        }
        return tableColumn;
    }

    private void attachCellEditors() {
        if (cellModifier == null) {
            cellModifier = new DefaultCellModifier(this);
        }
        tableViewer.setCellModifier(cellModifier);

        String[] properties = new String[columns.size()];
        CellEditor[] cellEditors = new CellEditor[columns.size()];
        int size = columns.size();
        for (int i = 0; i < size; i++) {
            TableViewerCreatorColumn column = columns.get(i);
            properties[i] = column.getId();
            cellEditors[i] = column.getCellEditor();
        }
        tableViewer.setColumnProperties(properties);
        tableViewer.setCellEditors(cellEditors);
    }

    public TableViewerCreatorColumn getColumn(String idProperty) {
        return idPropertyToTableViewerCreatorColumn.get(idProperty);
    }

    public boolean isHeaderVisible() {
        if (table != null) {
            return table.getHeaderVisible();
        }
        return headerVisible;
    }

    public void setHeaderVisible(boolean headerVisible) {
        if (table != null) {
            table.setHeaderVisible(headerVisible);
        } else {
            this.headerVisible = headerVisible;
        }
    }

    public void addColumn(TableViewerCreatorColumn tableEditorColumn) {
        columns.add(tableEditorColumn);
    }

    /**
     * Line selection mode for SWT Table. <br/>
     * 
     * @see SWT.SINGLE
     * @see SWT.MULTI
     * 
     */
    public enum LINE_SELECTION implements ISwtStyle {
        SINGLE(SWT.SINGLE),
        MULTI(SWT.MULTI);

        private int swtStyle = SWT.NONE;

        LINE_SELECTION(int swtStyle) {
            this.swtStyle = swtStyle;
        }

        public int getSwtStyle() {
            return swtStyle;
        }
    };

    /**
     * Show selection mode of a <code>Table</code>'s row. <br/>
     * 
     * @see SWT.FULL_SELECTION
     * @see SWT.HIDE_SELECTION
     * 
     */
    public enum SHOW_SELECTION implements ISwtStyle {
        FULL(SWT.FULL_SELECTION),
        HIDE(SWT.HIDE_SELECTION);

        private int swtStyle = SWT.NONE;

        SHOW_SELECTION(int swtStyle) {
            this.swtStyle = swtStyle;
        }

        public int getSwtStyle() {
            return swtStyle;
        }
    }

    /**
     * Layout mode of the <code>TableViewer</code>. LAYOUT_DATA : a layout based on the default layout of
     * <code>TableViewer</code>, but different because it layout the columns dynamically. CURRENT_WIDTH : a layout
     * based on the default layout of <code>TableViewer</code>. <br/>
     * <ul>
        <li> DEFAULT : the default layout of the <code>TableViewer</code>.
        </li> 
        <li>SHOW_ALWAYS_ALL_COLUMNS : force always to show all columns, resize columns automatically. 
        Use <code>adjustWidthValue</code> property to adjust the maximum width of columns and to don't show scrollbars.
        </li>
        <li>CONTINUOUS_CURRENT : resize columns automatically from current width or weight of each column, scollbars can be visible.
        Use <code>adjustWidthValue</code> property to adjust the width of columns and to don't show scrollbars in normal conditions.
        Adjust the last column width to fill free space.
        </li>
        <li>CURRENT_WIDTH : resize columns automatically from current width (not weight) of each column. 
        </li>
        <li>NONE : no layout.
        </li>
        </ul>
     * 
     */
    public enum LAYOUT_MODE {
        DEFAULT(),
        SHOW_ALWAYS_ALL_COLUMNS(),
        CONTINUOUS_CURRENT,
        CURRENT_WIDTH(),
        NONE(), ;

        LAYOUT_MODE() {
        }
    };

    public boolean isCheckboxInFirstColumn() {
        return this.checkboxInFirstColumn;
    }

    public void setCheckboxInFirstColumn(boolean checkboxInFirstColumn) {
        this.checkboxInFirstColumn = checkboxInFirstColumn;
    }

    public List<TableViewerCreatorColumn> getColumns() {
        return (List<TableViewerCreatorColumn>) Collections.unmodifiableList(columns);
    }

    public void setColumns(List<TableViewerCreatorColumn> columns) {
        this.columns = columns;
    }

    public LINE_SELECTION getLineSelection() {
        return lineSelection;
    }

    public void setLineSelection(LINE_SELECTION lineSelection) {
        this.lineSelection = lineSelection;
    }

    /**
     * 
     * 
     * @see Table#getLinesVisible()
     */
    public boolean isLinesVisible() {
        if (table != null) {
            return table.getLinesVisible();
        }
        return this.linesVisible;
    }

    /**
     * @see Table#setLinesVisible(boolean)
     */
    public void setLinesVisible(boolean linesVisible) {
        if (table != null) {
            table.setLinesVisible(linesVisible);
        } else {
            this.linesVisible = linesVisible;
        }
    }

    public SHOW_SELECTION getShowSelection() {
        return showSelection;
    }

    public void setShowSelection(SHOW_SELECTION showSelection) {
        this.showSelection = showSelection;
    }

    /**
     * 
     * The <code>TableViewer</code> is instanciate at same time than <code>Table</code>.
     * 
     * @return
     */
    public TableViewer getTableViewer() {
        return tableViewer;
    }

    public void setTableViewer(TableViewer tableViewer) {
        this.tableViewer = tableViewer;
    }

    public boolean isBorderVisible() {
        return borderVisible;
    }

    public void setBorderVisible(boolean borderVisible) {
        this.borderVisible = borderVisible;
    }

    public boolean isHorizontalScroll() {
        return horizontalScroll;
    }

    public void setHorizontalScroll(boolean horizontalScroll) {
        this.horizontalScroll = horizontalScroll;
    }

    public boolean isVerticalScroll() {
        return verticalScroll;
    }

    public void setVerticalScroll(boolean verticalScroll) {
        this.verticalScroll = verticalScroll;
    }

    public ICellModifier getCellModifier() {
        return cellModifier;
    }

    public void setCellModifier(ICellModifier cellModifier) {
        this.cellModifier = cellModifier;
    }

    public ITableLabelProvider getLabelProvider() {
        return labelProvider;
    }

    public void setLabelProvider(ITableLabelProvider tableLabelProvider) {
        this.labelProvider = tableLabelProvider;
    }

    public IStructuredContentProvider getContentProvider() {
        return contentProvider;
    }

    public void setContentProvider(IStructuredContentProvider contentProvider) {
        this.contentProvider = contentProvider;
    }

    public Table getTable() {
        return table;
    };

    /**
     * Sort mode. <br/>
     * 
     */
    public enum SORT {
        ASC,
        DESC,
        NONE,
    }

    public ControlListener getTableParentResizedListener() {
        return this.tableParentResizedListener;
    }

    public void setTableParentResizedListener(ControlListener tableParentResizedListener) {
        this.tableParentResizedListener = tableParentResizedListener;
    }

    public void packColumns() {
        for (int i = 0, n = table.getColumnCount(); i < n; i++) {
            table.getColumn(i).pack();
        }
    }

    public boolean isAllColumnsMoveable() {
        return this.allColumnsMoveable;
    }

    public void setAllColumnsMoveable(boolean allColumnsMoveable) {
        this.allColumnsMoveable = allColumnsMoveable;
    }

    public boolean isAllColumnsResizable() {
        return this.allColumnsResizable;
    }

    public void setAllColumnsResizable(boolean allColumnsResizable) {
        this.allColumnsResizable = allColumnsResizable;
    }

    public boolean isAllColumnsSortable() {
        return this.allColumnsSortable;
    }

    public void setAllColumnsSortable(boolean allColumnsSortable) {
        this.allColumnsSortable = allColumnsSortable;
    }

    public int getAdjustWidthValue() {
        return this.adjustWidthValue;
    }

    public void setAdjustWidthValue(int adjustWidthValue) {
        this.adjustWidthValue = adjustWidthValue;
    }

    public ViewerSorter getViewerSorter() {
        return this.viewerSorter;
    }

    public void setViewerSorter(ViewerSorter viewerSorter) {
        this.viewerSorter = viewerSorter;
    }

    public LAYOUT_MODE getLayoutMode() {
        return this.layoutMode;
    }

    public void setLayoutMode(LAYOUT_MODE layoutMode) {
        this.layoutMode = layoutMode;
    }

    public void layout() {
        Layout currentLayout = table.getLayout();
        if (currentLayout instanceof TableViewerCreatorLayout) {
            ((TableViewerCreatorLayout) currentLayout).forceLayout(table);
        } else if (currentLayout instanceof TableLayout) {
            ((TableLayout) currentLayout).layout(table, true);
        }
    }

    public Layout getLayout() {
        return this.layout;
    }

    public void setLayout(Layout layout) {
        this.layout = layout;
    }

    /**
     * DOC amaumont Comment method "maskFirstColumn".
     * 
     * @param firstColumnMasked
     */
    public void maskFirstColumn(boolean isFirstColumnMasked) {
        this.firstColumnMasked = isFirstColumnMasked;
    }

    /**
     * DOC amaumont Comment method "getModifiedObjectInfo".
     * 
     * @return always a instance of ModifiedObjectInfo
     */
    public ModifiedObjectInfo<O> getModifiedObjectInfo() {
        if (this.modifiedObjectInfo == null) {
            this.modifiedObjectInfo = new ModifiedObjectInfo<O>();
        }
        return this.modifiedObjectInfo;
    }

    
    public Color getEmptyZoneColor() {
        return this.emptyZoneColor;
    }

    
    public void setEmptyColor(Color emptyZoneColor) {
        this.emptyZoneColor = emptyZoneColor;
    }

    
    protected boolean isEmptyZoneLinesVisible() {
        return this.emptyZoneLinesVisible;
    }

    
    protected void setEmptyZoneLinesVisible(boolean emptyZoneLinesVisible) {
        this.emptyZoneLinesVisible = emptyZoneLinesVisible;
    }
    
    public void refreshTableEditorControls() {
        tableEditorManager.refresh();
    }

    /**
     * Setter for firstVisibleColumnIsSelection.
     * @param firstVisibleColumnIsSelection
     */
    public void setFirstVisibleColumnIsSelection(boolean firstVisibleColumnIsSelection) {
        this.firstVisibleColumnIsSelection = firstVisibleColumnIsSelection;
    }

    
    /**
     * Getter for firstVisibleColumnIsSelection.
     * @return the firstVisibleColumnIsSelection
     */
    public boolean isFirstVisibleColumnIsSelection() {
        return this.firstVisibleColumnIsSelection;
    }

    
    
    /**
     * DOC amaumont Comment method "method".
     * 
     * @param tableColumn
     */
    // private void method(Control tableColumn) {
    // final TableColumn[] lastMoved = new TableColumn[1];
    // final boolean[] dragging = new boolean[1];
    // final boolean[] draggingOffCalled = new boolean[1];
    // final boolean[] cancelDraggingOff = new boolean[1];
    //
    // tableColumn.addControlListener(new ControlListener() {
    //
    // private int[] previousSize;
    // private int indexCurrentColumn;
    //
    // public void controlMoved(ControlEvent e) {
    // System.out.println("COntrol moved");
    // }
    //
    // private TableColumn searchRightNeighbourColumn(TableColumn currentTableColumn) {
    //
    // TableColumn[] columns = tableViewerCreator.getTable().getColumns();
    // for (int i = 0; i < columns.length; i++) {
    // if (columns[i] == currentTableColumn) {
    // if (i == columns.length - 1) {
    // return null;
    // } else {
    // return table.getColumn(i + 1);
    // }
    // }
    // }
    // int[] columnOrder = tableViewerCreator.getTable().getColumnOrder();
    // for (int i = 0; i < columnOrder.length; i++) {
    // if (columnOrder[i] == indexCurrentColumn) {
    // if (i == columnOrder.length - 1) {
    // return null;
    // } else {
    // return table.getColumn(columnOrder[i + 1]);
    // }
    // }
    // }
    // return null;
    // }
    //
    // public void controlResized(ControlEvent e) {
    // System.out.println("TableColumn controlResized");
    // final TableColumn currentTableColumn = (TableColumn) e.widget;
    // System.out.println("dragging=" + dragging[0]);
    // // e.display.
    // System.out.println("current=" + currentTableColumn.getText());
    // if (lastMoved[0] != null) {
    // System.out.println("lastMoved=" + lastMoved[0].getText());
    // }
    //
    // if (dragging[0] == false && lastMoved[0] != currentTableColumn) {
    // dragging[0] = true;
    // previousSize[0] = currentTableColumn.getWidth();
    // lastMoved[0] = currentTableColumn;
    // } else if (dragging[0] && currentTableColumn != lastMoved[0]) {
    // return;
    // } else if (dragging[0] && lastMoved[0] == currentTableColumn) {
    // int diff = currentTableColumn.getWidth() - previousSize[0];
    // TableColumn neighbourColumn = searchRightNeighbourColumn(currentTableColumn);
    // if (neighbourColumn != null) {
    // System.out.println("next2=" + neighbourColumn.getText());
    // }
    //
    // if (diff != 0) {
    // if (neighbourColumn == null) {
    // currentTableColumn.setWidth(currentTableColumn.getWidth() - diff);
    // } else {
    // neighbourColumn.setWidth(neighbourColumn.getWidth() - diff);
    // currentTableColumn.setWidth(currentTableColumn.getWidth() + diff);
    // }
    // }
    // previousSize[0] = currentTableColumn.getWidth();
    //
    // if (!draggingOffCalled[0]) {
    // lastMoved[0] = currentTableColumn;
    //
    // new Thread() {
    //
    // public void run() {
    // try {
    // Thread.sleep(200);
    // } catch (InterruptedException e) {
    // e.printStackTrace();
    // }
    // if (!cancelDraggingOff[0]) {
    // dragging[0] = false;
    // lastMoved[0] = null;
    // } else {
    // draggingOffCalled[0] = false;
    // }
    // cancelDraggingOff[0] = false;
    // }
    // }.start();
    // draggingOffCalled[0] = true;
    // cancelDraggingOff[0] = false;
    // } else {
    // cancelDraggingOff[0] = true;
    // }
    // } else {
    // dragging[0] = false;
    // lastMoved[0] = null;
    // }
    // }
    //
    // });
    // // TODO Auto-generated method stub
    //
    // }
}

// tableColumn.addListener(SWT.MouseUp, new Listener() {
//
// public void handleEvent(Event event) {
// //System.out.println("Listener");
// }
//                    
// });
// tableColumn.addSelectionListener(new SelectionListener() {
//
// public void widgetDefaultSelected(SelectionEvent e) {
// //System.out.println("widgetDefaultSelected");
// }
//
// public void widgetSelected(SelectionEvent e) {
// //System.out.println("widgetSelected");
// }
//                    
// });
//                
// final TableViewerCreator tableViewerCreator = this;
//                
// tableViewerCreator.getTable().addControlListener(new ControlListener() {
//
// public void controlMoved(ControlEvent e) {
// // TODO Auto-generated method stub
// //System.out.println("Table controlmoved");
//                        
// }
//
// public void controlResized(ControlEvent e) {
// //System.out.println("Table controlResized");
// // TODO Auto-generated method stub
//                        
// }
//                    
// });
//                

