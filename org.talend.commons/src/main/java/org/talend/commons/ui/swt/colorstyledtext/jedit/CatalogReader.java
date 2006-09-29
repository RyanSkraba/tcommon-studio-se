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
package org.talend.commons.ui.swt.colorstyledtext.jedit;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.talend.commons.ui.swt.colorstyledtext.scanner.ColoringEditorTools;

/**
 * DOC nrousseau class global comment. Detailled comment <br/>
 * 
 * $Id$
 * 
 */
public class CatalogReader {

    /**
     * 
     */
    private static final int A_50 = 50;

    public CatalogReader() {
        super();
    }

    public Mode[] read(String filename) {
        try {
            return readFile(ColoringEditorTools.getFile(filename));
        } catch (Exception e) {
            // EditorPlugin.logError("Error reading catalog file " + mode.getFile(), e);
            e.printStackTrace();
            return new Mode[0];
        }
    }

    public Mode[] readFile(InputStream file) throws DocumentException, IOException {
        SAXReader reader = new SAXReader();
        Document doc = null;
        doc = reader.read(file);
        Element root = doc.getRootElement();
        List modeE = root.elements("MODE");
        List<Mode> modes = new ArrayList<Mode>(A_50);
        for (Iterator iter = modeE.iterator(); iter.hasNext();) {
            Element modeElement = (Element) iter.next();
            modes.add(newMode(modeElement));
        }
        return (Mode[]) modes.toArray(new Mode[modes.size()]);
    }

    private Mode newMode(Element modeElement) {
        return Mode.newMode(modeElement.attributeValue("NAME"), modeElement.attributeValue("FILE"), modeElement
                .attributeValue("FILE_NAME_GLOB"), modeElement.attributeValue("FIRST_LINE_GLOB"));
    }

    /**
     * This method is used to create the "extensions" attribute for the editor XML.
     */
    // public static void main(String[] args) {
    // Set list = getListOfExtensions();
    // StringBuffer sb = new StringBuffer("extensions=\"");
    // for (Iterator iter = list.iterator(); iter.hasNext();) {
    // String ext = (String) iter.next();
    // sb.append(ext);
    // sb.append(",");
    // }
    // sb.setLength(sb.length() - 1);
    // sb.append("\"");
    // System.out.println(sb.toString());
    // }
    //
    // public static Set getListOfExtensions() {
    // CatalogReader c = new CatalogReader();
    // Mode[] modes = null;
    // try {
    // modes = c.readFile(new File("C:/workspaces/big/cbg.editor/modes/catalog"));
    // } catch (DocumentException e) {
    // // ignore
    // } catch (IOException e) {
    // // ignore
    // }
    // Set list = new TreeSet();
    // for (int i = 0; i < modes.length; i++) {
    // Mode mode = modes[i];
    // mode.appendExtensionsOnto(list);
    // }
    // return list;
    // }
}
