package org.epic.perleditor.editors;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.ITypedRegion;
import org.eclipse.jface.text.TextSelection;
import org.eclipse.jface.text.hyperlink.IHyperlink;
import org.eclipse.jface.text.hyperlink.IHyperlinkDetector;
import org.epic.perleditor.popupmenus.OpenDeclaration;

/**
 * Installed in the PerlEditor to detect subroutine names whose declarations
 * can be navigated to by clicking them.
 * 
 * @see org.epic.perleditor.popupmenus.OpenDeclaration
 * @author jploski
 */
public class PerlSubHyperlinkDetector implements IHyperlinkDetector
{
    private final PerlEditor editor;
    
    public PerlSubHyperlinkDetector(PerlEditor editor)
    {
        this.editor = editor;
    }
    
    public IHyperlink[] detectHyperlinks(
        ITextViewer textViewer,
        IRegion region,
        boolean canShowMultipleHyperlinks)
    {
        if (region == null) return null;
        
        IDocument document = textViewer.getDocument();
        if (document == null) return null;
        
        return detectHyperlinks(document, region.getOffset());
    }
    
    private IHyperlink[] detectHyperlinks(IDocument doc, int offset)
    {   
        // Check that the offset is located inside of a partition that can
        // represent a subroutine invocation
        ITypedRegion partition;
        
        try
        {
            partition = (ITypedRegion) doc.getPartition(offset);
            if (!PartitionTypes.DEFAULT.equals(partition.getType())) return null;
        }
        catch (BadLocationException e) { return null; }
        
        // If we get here, our partition type seems ok.
        // Create a PerlSubHyperlink for the partition:
        try
        {
            return new IHyperlink[] {
                new PerlSubHyperlink(
                    editor,
                    doc.get(partition.getOffset(), partition.getLength()),
                    partition)
                };
        }
        catch (BadLocationException e)
        {
            // should never occur
            return null;
        }
    }
    
    private static class PerlSubHyperlink implements IHyperlink
    {
        private final PerlEditor editor;
        private final String subName;
        private final IRegion subNameRegion;
        
        public PerlSubHyperlink(
            PerlEditor editor, String subName, IRegion subNameRegion)
        {
            this.editor = editor;
            this.subName = subName;
            this.subNameRegion = subNameRegion;
        }
        
        public IRegion getHyperlinkRegion()
        {
            return subNameRegion;
        }

        public String getTypeLabel()
        {
            return null;
        }

        public String getHyperlinkText()
        {
            return null;
        }

        public void open()
        {
            OpenDeclaration action =
                (OpenDeclaration) editor.getAction(PerlEditorActionIds.OPEN_SUB);
            
            if (action != null) action.run(
                new TextSelection(subNameRegion.getOffset(), subNameRegion.getLength()));
        }
    }
}
