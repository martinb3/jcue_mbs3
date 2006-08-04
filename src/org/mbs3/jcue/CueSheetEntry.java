/*
 *   Copyright 2006 Martin B. Smith
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
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
