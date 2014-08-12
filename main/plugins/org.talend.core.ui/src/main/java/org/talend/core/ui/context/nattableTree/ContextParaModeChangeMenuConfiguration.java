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

import org.eclipse.nebula.widgets.nattable.NatTable;
import org.eclipse.nebula.widgets.nattable.config.AbstractUiBindingConfiguration;
import org.eclipse.nebula.widgets.nattable.data.IDataProvider;
import org.eclipse.nebula.widgets.nattable.ui.binding.UiBindingRegistry;
import org.eclipse.nebula.widgets.nattable.ui.matcher.MouseEventMatcher;
import org.eclipse.nebula.widgets.nattable.ui.menu.PopupMenuAction;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.widgets.Menu;

/**
 * created by ldong on Aug 14, 2014 Detailled comment
 * 
 */
public class ContextParaModeChangeMenuConfiguration extends AbstractUiBindingConfiguration {

    private final Menu modeMenu;

    public ContextParaModeChangeMenuConfiguration(NatTable natTable, IDataProvider dataProvider) {
        modeMenu = new ContextPopMenuBuilder(natTable).withChangeModeMenuItem(dataProvider).build();

        natTable.addDisposeListener(new DisposeListener() {

            @Override
            public void widgetDisposed(DisposeEvent e) {
                modeMenu.dispose();
            }
        });
    }

    @Override
    public void configureUiBindings(UiBindingRegistry uiBindingRegistry) {
        // add a mouse binding to pop up "add to build-in" menu item
        uiBindingRegistry.registerMouseDownBinding(new MouseEventMatcher(SWT.NONE, null, 3), new PopupMenuAction(modeMenu));
    }

}
