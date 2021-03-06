import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * A frame with a text area to show the contents of a file inside a ZIP archive, a combo
 * box to select different files in the archive, and a menu to load a new archive.
 * Created by dell on 2017/3/22.
 */
public class ZipTestFrame extends JFrame {

    public static final int DEFAULT_WIDTH=400;
    public static final int DEFAULT_HEIGHT=300;
    private JComboBox fileCombo;
    private JTextArea fileText;
    private String zipName;

    public ZipTestFrame(){
        setTitle("ZipTest");
        setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);

        //add the menu and the Open and Exit menu items
        JMenuBar menuBar=new JMenuBar();
        JMenu menu=new JMenu("File");

        JMenuItem openItem=new JMenuItem("Open");
        menu.add(openItem);
        openItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser chooser=new JFileChooser();
                chooser.setCurrentDirectory(new File("E:\\StudentManagementDemo.zip"));
                int r=chooser.showOpenDialog(ZipTestFrame.this);
                if(r==JFileChooser.APPROVE_OPTION){
                    zipName=chooser.getSelectedFile().getPath();
                    fileCombo.removeAllItems();
                    scanZipFile();
                }
            }
        });

        JMenuItem exitItem=new JMenuItem("Exit");
        menu.add(exitItem);
        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        menuBar.add(menu);
        setJMenuBar(menuBar);

        //add the text area and combo box
        fileText=new JTextArea();
        fileCombo=new JComboBox();
        fileCombo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loadZipFile((String)fileCombo.getSelectedItem());
            }
        });

        add(fileCombo, BorderLayout.SOUTH);
        add(new JScrollPane(fileText),BorderLayout.CENTER);
    }

    /**
     * Scans the contents of the ZIP archive and populates the combo box.
     */

    public void scanZipFile() {
        new SwingWorker<Void,String>(){
            @Override
            protected Void doInBackground() throws Exception {
                ZipInputStream zin=new ZipInputStream(new FileInputStream(zipName));
                ZipEntry entry;
                while((entry=zin.getNextEntry())!=null){
                    publish(entry.getName());
                    zin.closeEntry();
                }
                zin.close();
                return null;
            }
            protected void process(List<String> names){
                for(String name:names)
                    fileCombo.addItem(name);
            }
        }.execute();
    }

    /**
     * Loads a file from the ZIP archive into the text area
     * @param name the name of the file in the archive
     */

    public void loadZipFile(final String name){
        fileCombo.setEnabled(false);
        fileText.setText("");
        new SwingWorker<Void,Void>(){

            @Override
            protected Void doInBackground() throws Exception {
                try{
                    ZipInputStream zin=new ZipInputStream(new FileInputStream(zipName));
                    ZipEntry entry;

                    //find entry with matching name in archive
                    while((entry=zin.getNextEntry())!=null){
                        if(entry.getName().equals(name)){
                            //read entry into text area
                            Scanner in=new Scanner(zin);
                            while(in.hasNextLine()){
                                fileText.append(in.nextLine());
                                fileText.append("\n");
                            }
                        }
                        zin.closeEntry();
                    }
                    zin.close();
                }
                catch(IOException e){
                    e.printStackTrace();
                }
                return null;
            }
            protected void done(){
                fileCombo.setEnabled(true);
            }
        }.execute();
    }
}
