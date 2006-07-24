package org.mbs3.jcue;

/*
 * Created on Oct 9, 2005
 *
 * TODO Nothing yet.
 */

import org.mbs3.jcue.*;

public class DriverProgram
{

    /**
     * @param args
     */
    public static void main (String[] args)
    {
        CueSheet c = new CueSheet("C:\\Documents and Settings\\Martin Smith\\Desktop\\Karaoke\\CU001");
        System.out.print(c.generateCue());

    }

}
