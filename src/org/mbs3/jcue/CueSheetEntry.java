/*
 * Created on Oct 9, 2005
 *
 * TODO Nothing yet.
 */
package org.mbs3.jcue;

import java.io.*;

public class CueSheetEntry implements Comparable
{
    private File myFile;
    private String dataType;
    private String fileType;
    private Integer trackNo;

    public CueSheetEntry (File myFile)
    {
        super();
        this.fileType = "BINARY";
        this.dataType = "CDG";
        this.myFile = myFile;
    }
    
    public CueSheetEntry (File myFile, String datatype)
    {
        super();
        this.fileType = "BINARY";
        this.dataType = "CDG";        
        this.myFile = myFile;
        this.dataType = datatype;
    }

    
    public String getDataType ()
    {
        return this.dataType;
    }

    
    public void setDataType (String dataType)
    {
        this.dataType = dataType;
    }

    
    public String getFilename ()
    {
        return this.myFile.getName();
    }

    
    public Integer getTrackNo ()
    {
        return this.trackNo;
    }

    
    public void setTrackNo (Integer trackNo)
    {
        this.trackNo = trackNo;
    }
    
    public String generateEntry()
    {
        StringBuffer s = new StringBuffer();
        s.append("FILE \""); 
        try { s.append(this.myFile.getCanonicalPath()); } catch (Exception e) {}
        s.append("\" ");
        s.append(this.fileType);
        s.append("\n ");
        s.append("  TRACK ");
        
        if(trackNo.intValue() < 10)
            s.append("0");
        s.append(this.trackNo);
            
        s.append(" ");
        s.append(this.dataType);
        s.append("\n    INDEX 01 00:00:00\n");
        
        return s.toString();
    }

    
    public String getFileType ()
    {
        return this.fileType;
    }

    public int compareTo (Object o)
    {
        CueSheetEntry other = (CueSheetEntry)o;
        return(this.getFilename().compareTo(other.getFilename()));
           
    }
    
    public void setFileType (String fileType)
    {
        this.fileType = fileType;
    }

    
}
