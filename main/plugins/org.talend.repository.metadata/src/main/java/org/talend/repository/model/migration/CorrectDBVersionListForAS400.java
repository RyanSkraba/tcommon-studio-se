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
package org.talend.repository.model.migration;

import java.util.Date;
import java.util.GregorianCalendar;

import org.talend.commons.exception.ExceptionHandler;
import org.talend.core.database.EDatabaseTypeName;
import org.talend.core.model.metadata.builder.connection.Connection;
import org.talend.core.model.metadata.builder.connection.DatabaseConnection;
import org.talend.core.model.migration.AbstractItemMigrationTask;
import org.talend.core.model.properties.DatabaseConnectionItem;
import org.talend.core.model.properties.Item;
import org.talend.core.repository.model.ProxyRepositoryFactory;

/**
 * DOC talend class global comment. Detailled comment<br>
 * More information please see: https://jira.talendforge.org/browse/TDI-30337
 */
public class CorrectDBVersionListForAS400 extends AbstractItemMigrationTask {

    private static final String OLD_VERSION = "V5R4 to V6R1"; //$NON-NLS-1$

    private static final String NEW_VERSION = "V5R3 to V6R1"; //$NON-NLS-1$

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.core.model.migration.AbstractItemMigrationTask#execute(org.talend.core.model.properties.Item)
     */
    @Override
    public ExecutionResult execute(Item item) {
        boolean modified = false;
        if (item instanceof DatabaseConnectionItem) {
            Connection conn = ((DatabaseConnectionItem) item).getConnection();
            if (conn instanceof DatabaseConnection) {
                DatabaseConnection dbConn = (DatabaseConnection) conn;
                if (EDatabaseTypeName.AS400.getXmlName().equals(dbConn.getDatabaseType())) {
                    if (OLD_VERSION.equals(dbConn.getDbVersionString())) {
                        dbConn.setDbVersionString(NEW_VERSION);
                        modified = true;
                    }
                }
            }
        }
        try {
            if (modified) {
                ProxyRepositoryFactory factory = ProxyRepositoryFactory.getInstance();
                factory.save(item, true);
            }
            return ExecutionResult.SUCCESS_NO_ALERT;
        } catch (Exception e) {
            ExceptionHandler.process(e);
            return ExecutionResult.FAILURE;
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.migration.IProjectMigrationTask#getOrder()
     */
    @Override
    public Date getOrder() {
        GregorianCalendar gc = new GregorianCalendar(2014, 8, 19, 9, 20, 0);
        return gc.getTime();
    }

}
