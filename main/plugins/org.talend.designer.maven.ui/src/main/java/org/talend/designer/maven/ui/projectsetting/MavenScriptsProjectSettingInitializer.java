// ============================================================================
//
// Copyright (C) 2006-2015 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.designer.maven.ui.projectsetting;

import java.io.IOException;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.designer.maven.template.IProjectSettingPreferenceConstants;
import org.talend.designer.maven.template.MavenTemplateConstants;
import org.talend.designer.maven.template.MavenTemplateManager;

/**
 * DOC ggu class global comment. Detailled comment
 * 
 */
public class MavenScriptsProjectSettingInitializer extends AbstractPreferenceInitializer {

    @Override
    public void initializeDefaultPreferences() {
        IPreferenceStore preferenceStore = MavenProjectSettingPreferenceManager.getInstance().getProjectPreferenceManager()
                .getPreferenceStore();

        try {
            String pomJobContent = MavenTemplateManager.getBundleTemplateContent(MavenTemplateConstants.POM_JOB_TEMPLATE_FILE_NAME);
            preferenceStore.setDefault(IProjectSettingPreferenceConstants.MAVEN_SCRIPT_AUTONOMOUSJOB_TEMPLATE, pomJobContent);

            String assemblyContent = MavenTemplateManager
                    .getBundleTemplateContent(MavenTemplateConstants.ASSEMBLY_JOB_TEMPLATE_FILE_NAME);
            preferenceStore.setDefault(IProjectSettingPreferenceConstants.MAVEN_SCRIPT_AUTONOMOUSJOB_ASSEMBLY_TEMPLATE,
                    assemblyContent);
        } catch (IOException e) {
            ExceptionHandler.process(e);
        }

    }

}