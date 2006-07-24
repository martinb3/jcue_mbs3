/*
 * Created on Oct 9, 2005
 *
 * TODO Nothing yet.
 */
package org.mbs3.jcue;

import java.util.Vector;
import java.util.Iterator;
import java.util.Collections;
import java.io.*;

public class CueSheet
{
    private Vector myCueSheet;

    public CueSheet ()
    {
        super();
        myCueSheet = new Vector(10);

    }
    
    public CueSheet (String path)
    {
        super();
        myCueSheet = new Vector(10);
        this.createFromFolder(path);
    }

    public CueSheet (File path)
    {
        super();
        myCueSheet = new Vector(10);
        this.createFromFolder(path);
    }
    
    public boolean isEmpty()
    {
        return myCueSheet.isEmpty();
    }
    
    public void addItem(String filename)
    {
        CueSheetEntry c = new CueSheetEntry(new File(filename));
        myCueSheet.add(c);
    }
    
    public void addItem(String filename, String datatype)
    {
        CueSheetEntry c = new CueSheetEntry(new File(filename), datatype);
        myCueSheet.add(c);
    }
    
    public void createFromFolder(String path)
    {
        File dir = new File(path);
        File files[] = dir.listFiles();
        
        if(files.length < 1)
        {
            return;
        } else {
            for(int i = 0; i < files.length; i++) {
                if(files[i].getName().toUpperCase().endsWith("BIN"))
                    myCueSheet.add(new CueSheetEntry(files[i].getAbsoluteFile()));
            }
                
        }
        
    }
    
    public void createFromFolder(File path)
    {
        File dir = path;
        File files[] = dir.listFiles();
        
        if(files.length < 1)
        {
            return;
        } else {
            for(int i = 0; i < files.length; i++) {
                if(files[i].getName().toUpperCase().endsWith("BIN"))
                    myCueSheet.add(new CueSheetEntry(files[i].getAbsoluteFile()));
            }
                
        }
        
    }

    
    private void layoutDisc()
    {
        Collections.sort(myCueSheet);
        for(int i = 0; i < myCueSheet.size(); i++)
            ((CueSheetEntry)myCueSheet.get(i)).setTrackNo(new Integer(i+1));
    }
    
    public String generateCue()
    {
        this.layoutDisc();
        StringBuffer s = new StringBuffer();
        
        Iterator i = myCueSheet.iterator();
        while(i.hasNext())
        {
            CueSheetEntry c = (CueSheetEntry)i.next();
            s.append(c.generateEntry());
        }
        
        return s.toString().toUpperCase();
    }

}
