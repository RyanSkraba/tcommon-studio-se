// ============================================================================
//
// Copyright (C) 2006-2012 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.core.repository.link;

import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.EditorPart;
import org.talend.repository.model.RepositoryNode;
import org.talend.repository.model.RepositoryNodeUtilities;

/**
 * DOC ggu class global comment. Detailled comment <br/>
 * 
 * $Id: talend.epf 55206 2011-02-15 17:32:14Z mhirt $
 * 
 */
public abstract class AbstractEditorInputWithItemIdLinker implements IRepoViewLinker {

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.core.repository.link.IRepoViewLinker#getRelationNode(org.eclipse.ui.IEditorInput)
     */
    @Override
    public RepositoryNode getRelationNode(IEditorInput editorInput) {
        return getRepoNodeFromEditor(getEditor(editorInput));
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.core.repository.link.IRepoViewLinker#isRelation(org.eclipse.ui.IEditorInput, java.lang.String)
     */
    @Override
    public boolean isRelation(IEditorInput editorInput, String repoNodeId) {
        RepositoryNode relationNode = getRelationNode(editorInput);
        if (relationNode != null && repoNodeId != null && repoNodeId.equals(relationNode.getId())) {
            return true;
        }
        return false;
    }

    protected IEditorPart getEditor(IEditorInput editorInput) {
        if (editorInput != null) {
            IWorkbenchWindow activeWorkbenchWindow = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
            if (activeWorkbenchWindow != null) {
                IWorkbenchPage activePage = activeWorkbenchWindow.getActivePage();
                if (activePage != null) {
                    return activePage.findEditor(editorInput);
                }
            }
        }
        return null;
    }

    protected RepositoryNode getRepoNodeFromEditor(IEditorPart editorPart) {
        if (editorPart != null && EditorPart.class.isInstance(editorPart) && isValidEditor((EditorPart) editorPart)) {
            EditorPart editor = ((EditorPart) editorPart);
            String partItemIdKey = getPartItemIdKey();
            if (partItemIdKey != null) {
                String itemId = editor.getPartProperty(partItemIdKey);
                if (itemId != null) {
                    return RepositoryNodeUtilities.getRepositoryNode(itemId);
                }
            }
        }
        return null;
    }

    protected String getPartItemIdKey() {
        return null;
    }

    protected boolean isValidEditor(EditorPart editorPart) {
        return false;
    }

}
