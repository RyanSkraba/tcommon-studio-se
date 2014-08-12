// ============================================================================
//
// Copyright (C) 2006-2014 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.core.ui.context.nattableTree;

import org.eclipse.gef.commands.Command;
import org.eclipse.nebula.widgets.nattable.NatTable;
import org.eclipse.nebula.widgets.nattable.data.IDataProvider;
import org.eclipse.nebula.widgets.nattable.extension.glazedlists.GlazedListsDataProvider;
import org.eclipse.nebula.widgets.nattable.ui.NatEventData;
import org.eclipse.nebula.widgets.nattable.ui.menu.IMenuItemProvider;
import org.eclipse.nebula.widgets.nattable.ui.menu.MenuItemProviders;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.talend.core.model.process.IContextParameter;
import org.talend.core.ui.context.ContextTreeTable;
import org.talend.core.ui.context.IContextModelManager;
import org.talend.core.ui.context.ContextTreeTable.ContextTreeNode;
import org.talend.core.ui.context.model.table.ContextTableTabChildModel;

/**
 * created by ldong on Aug 14, 2014 Detailled comment
 * 
 */
public class ContextMenuItemProviders extends MenuItemProviders {

    // the item of change the context parameter's mode such as from repositroy to build-in
    public static IMenuItemProvider changeModeMenuItemProvider(final IDataProvider dataProvider) {
        return new IMenuItemProvider() {

            @Override
            public void addMenuItem(NatTable natTable, Menu popupMenu) {
                MenuItem changeModeMenuItem = new MenuItem(popupMenu, SWT.PUSH);
                changeModeMenuItem.setText("Add to build-in"); //$NON-NLS-1$
                changeModeMenuItem.setEnabled(true);

                changeModeMenuItem.addSelectionListener(new SelectionAdapter() {

                    @Override
                    public void widgetSelected(SelectionEvent e) {
                        NatEventData natEventData = getNatEventData(e);
                        NatTable nt = natEventData.getNatTable();
                        int rowPosition = natEventData.getRowPosition();
                        int rowIndex = nt.getRowIndexByPosition(rowPosition);
                        @SuppressWarnings("unchecked")
                        ContextTreeNode treeNode = ((GlazedListsDataProvider<ContextTreeNode>) dataProvider)
                                .getRowObject(rowIndex);
                        IContextModelManager manager = treeNode.getManager();
                        if (treeNode.getTreeData() instanceof ContextTableTabChildModel) {
                            ContextTableTabChildModel paraModel = (ContextTableTabChildModel) treeNode.getTreeData();
                            String sourceId = paraModel.getSourceId();
                            if (manager.getContextManager() != null) {
                                if (!sourceId.equals(IContextParameter.BUILT_IN)) {
                                    Command cmd = new ContextParaChangeModeCommand(manager, treeNode, paraModel
                                            .getContextParameter());
                                    if (manager.getCommandStack() == null) {
                                        cmd.execute();
                                    } else {
                                        manager.getCommandStack().execute(cmd);
                                    }
                                }
                            }
                        }
                    }
                });
            }
        };
    }
}
