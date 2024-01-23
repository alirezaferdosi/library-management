
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ariyan
 */
public class mybooks {
    private static FileReader file;
    private static BufferedReader br;
    private static JFrame frame;
    private static JTable table;
    private static JScrollPane js;
    private static Login L;
    
    void initComponent() throws FileNotFoundException{
        
        try {
            file = new FileReader("G:\\جاوا\\LibraryManagement\\Documents\\Users\\booklist" + Login.NUMBER + ".txt");
            br = new BufferedReader(file);
            
            int i=0;
            String thisline;
            while((thisline = br.readLine()) != null)
            {
                i++;
            }
            br.close();
            
            String[][] data = new String[i][4];
            
            file = new FileReader("G:\\جاوا\\LibraryManagement\\Documents\\Users\\booklist" + Login.NUMBER + ".txt");
            br = new BufferedReader(file);
                       
            thisline = "";
            int j=0;
            while((thisline = br.readLine()) != null)
            {
                if(j==i) break;
                
                String str1 ,str2 ,str3 ,str4 ,thisline1 ,thisline2;
                
                str1 = thisline.substring(0, thisline.indexOf("/"));
                thisline = thisline.substring(thisline.indexOf("/")+1);
                str2 = thisline.substring(0, thisline.indexOf("/"));
                thisline = thisline.substring(thisline.indexOf("/")+1);
                str3 = thisline.substring(0, thisline.indexOf("/"));
                str4 = thisline.substring(thisline.indexOf("/")+1);
                
                
                data[j][0] = str1;//نام
                data[j][1] = str2;//طبقه بندی
                data[j][2] = str3;//شناسه
                data[j][3] =  str4 + "روز پس از دریافت ";//زمان تحویل
                j++ ;
            }
            String[] title = {"نام کتاب","طبقه بندی","شناسه","زمان تحویل"};
            table = new JTable(data,title);
            table.setFillsViewportHeight(true);
            js = new JScrollPane(table);
            frame = new JFrame();
            frame.add(js);
            frame.setBounds(400, 200, 600, 500);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(frame,"کتابی موجود نیست .","Alert",JOptionPane.WARNING_MESSAGE);
        }
        
    
    }
    
    
    
}
