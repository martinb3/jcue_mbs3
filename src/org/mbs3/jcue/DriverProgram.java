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
