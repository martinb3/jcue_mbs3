package org.mbs3.jcue;
import java.io.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JList;

import javax.swing.JSeparator;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.ListModel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class jCueGUI extends javax.swing.JFrame {

    private JMenuItem helpMenuItem;
    private JMenu jMenu5;
    private JMenuItem deleteMenuItem;
    private JSeparator jSeparator1;
    private JMenuItem pasteMenuItem;
    private JButton jButton1;
    private JFileChooser jFileChooser1;
    private JPanel jPanel2;
    private JPanel jPanel1;
    private JMenuItem copyMenuItem;
    private JMenuItem cutMenuItem;
    private JMenu jMenu4;
    private JMenuItem exitMenuItem;
    private JSeparator jSeparator2;
    private JMenuItem closeFileMenuItem;
    private JMenuItem saveAsMenuItem;
    private JMenuItem saveMenuItem;
    private JMenuItem openFileMenuItem;
    private JMenuItem newFileMenuItem;
    private JMenu jMenu3;
    private JMenuBar jMenuBar1;
    public static final long serialVersionUID=1;

    /**
    * Auto-generated main method to display this JFrame
    */
    public static void main(String[] args) {
        jCueGUI inst = new jCueGUI();
        inst.setVisible(true);
    }
    
    public jCueGUI() {
        super();
        initGUI();
    }
    
    private void initGUI() {
        try {
            this.setSize(616, 443);
            {
                jMenuBar1 = new JMenuBar();
                setJMenuBar(jMenuBar1);
                {
                    jMenu3 = new JMenu();
                    jMenuBar1.add(jMenu3);
                    jMenu3.setText("File");
                    {
                        newFileMenuItem = new JMenuItem();
                        jMenu3.add(newFileMenuItem);
                        newFileMenuItem.setText("New");
                    }
                    {
                        openFileMenuItem = new JMenuItem();
                        jMenu3.add(openFileMenuItem);
                        openFileMenuItem.setText("Open");
                    }
                    {
                        saveMenuItem = new JMenuItem();
                        jMenu3.add(saveMenuItem);
                        saveMenuItem.setText("Save");
                    }
                    {
                        saveAsMenuItem = new JMenuItem();
                        jMenu3.add(saveAsMenuItem);
                        saveAsMenuItem.setText("Save As ...");
                    }
                    {
                        closeFileMenuItem = new JMenuItem();
                        jMenu3.add(closeFileMenuItem);
                        closeFileMenuItem.setText("Close");
                    }
                    {
                        jSeparator2 = new JSeparator();
                        jMenu3.add(jSeparator2);
                    }
                    {
                        exitMenuItem = new JMenuItem();
                        jMenu3.add(exitMenuItem);
                        exitMenuItem.setText("Exit");
                    }
                }
                {
                    jMenu4 = new JMenu();
                    jMenuBar1.add(jMenu4);
                    jMenu4.setText("Edit");
                    {
                        cutMenuItem = new JMenuItem();
                        jMenu4.add(cutMenuItem);
                        cutMenuItem.setText("Cut");
                    }
                    {
                        copyMenuItem = new JMenuItem();
                        jMenu4.add(copyMenuItem);
                        copyMenuItem.setText("Copy");
                    }
                    {
                        pasteMenuItem = new JMenuItem();
                        jMenu4.add(pasteMenuItem);
                        pasteMenuItem.setText("Paste");
                    }
                    {
                        jSeparator1 = new JSeparator();
                        jMenu4.add(jSeparator1);
                    }
                    {
                        deleteMenuItem = new JMenuItem();
                        jMenu4.add(deleteMenuItem);
                        deleteMenuItem.setText("Delete");
                    }
                }
                {
                    jMenu5 = new JMenu();
                    jMenuBar1.add(jMenu5);
                    jMenu5.setText("Help");
                    {
                        helpMenuItem = new JMenuItem();
                        {
                            jPanel1 = new JPanel();
                            this.getContentPane().add(jPanel1, BorderLayout.CENTER);
                            GridBagLayout jPanel1Layout = new GridBagLayout();
                            jPanel1Layout.columnWeights = new double[] {0.1};
                            jPanel1Layout.columnWidths = new int[] {7};
                            jPanel1Layout.rowWeights = new double[] {0.1,0.1};
                            jPanel1Layout.rowHeights = new int[] {7,7};
                            jPanel1.setLayout(jPanel1Layout);
                            jPanel1.setPreferredSize(new java.awt.Dimension(608, 334));
                            {
                                jPanel2 = new JPanel();
                                GridLayout jPanel2Layout = new GridLayout(1, 2);
                                jPanel2Layout.setColumns(2);
                                jPanel2.setLayout(jPanel2Layout);
                                jPanel1.add(jPanel2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0, GridBagConstraints.SOUTH, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
                                {
                                    jButton1 = new JButton();
                                    jPanel2.add(jButton1);
                                    jButton1.setText("Read Files and Create Cue");
                                    jButton1
                                        .addMouseListener(new MouseAdapter() {
                                        public void mouseClicked(MouseEvent evt) {
                                            jButton1MouseClicked(evt);
                                        }
                                        });
                                }
                            }
                            {
                                jFileChooser1 = new JFileChooser();
                                jPanel1.add(
                                    jFileChooser1,
                                    new GridBagConstraints(
                                        0,
                                        0,
                                        1,
                                        1,
                                        0.0,
                                        0.0,
                                        GridBagConstraints.CENTER,
                                        GridBagConstraints.NONE,
                                        new Insets(0, 0, 0, 0),
                                        0,
                                        0));
                                jFileChooser1.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                                jFileChooser1.setControlButtonsAreShown(false);
                                jFileChooser1.setMultiSelectionEnabled(true);
                            }
                        }
                        jMenu5.add(helpMenuItem);
                        helpMenuItem.setText("Help");
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void jButton1MouseClicked(MouseEvent evt) {
        //System.out.println("jButton1.mouseClicked, event=" + evt);
        //TODO add your code for jButton1.mouseClicked
        File f[] = jFileChooser1.getSelectedFiles();
        for(int i = 0; i < f.length; i++) {
            CueSheet c = new CueSheet(f[i]);
        
            String a = c.generateCue();
            try {
                File outfile = new File(f[i].getCanonicalPath() + "\\jCueOutput.cue");
                BufferedWriter out = new BufferedWriter(new FileWriter(outfile));
                out.write(a);
                out.close();
            } catch (IOException e) {
            }
        }
        
        //System.out.print(a);
        
    }

}
