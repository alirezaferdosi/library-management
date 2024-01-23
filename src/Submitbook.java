
import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ariyan
 */
public class Submitbook extends javax.swing.JFrame {
    private static FileReader filereader;
    private static BufferedReader br;
    private static FileWriter fileWriter;
    private static BufferedWriter bw;
    private static FileWriter file;
    private static BufferedWriter submitbook;
    private static FileWriter filetrusts;
    private static BufferedWriter trusts;
    private static FileReader filetrustsreader;
    private static BufferedReader trustsreader;
    private static File createfile;
    private static FileReader filebookname;
    private static BufferedReader booknamereader;

    /**
     * Creates new form Submitbook
     */
    public Submitbook() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 450));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("شماره دانشجویی :");
        jLabel1.setPreferredSize(new java.awt.Dimension(50, 15));
        jLabel1.setRequestFocusEnabled(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("نام کتاب :");
        jLabel2.setPreferredSize(new java.awt.Dimension(50, 15));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("شناسه کتاب :");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("ثبت");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "کامپیوتر", "ریاضی", "فیزیک", "شیمی", "برق", "عمومی" }));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("طبقه بندی کتاب :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("نام دانشجو :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(208, 208, 208))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(122, 122, 122)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1)
                                    .addComponent(jTextField2)
                                    .addComponent(jTextField3)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(122, 122, 122)
                                        .addComponent(jLabel3)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(71, 71, 71))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String NAME = name.getText();
       String Studentnumber = jTextField1.getText();
       String bookname = jTextField2.getText();
       String bookID = jTextField3.getText();
       String category = (String)jComboBox1.getSelectedItem();
       String level = null;
       String Null = "";
       boolean existens1 = false ,existens2 = false;

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// وجود کتاب       
   try {
            filebookname = new FileReader("G:\\جاوا\\LibraryManagement\\Documents\\admin\\bookname.txt");
            booknamereader = new BufferedReader(filebookname);
            String thisline1;
            while((thisline1 = (String)booknamereader.readLine()) != null)
            {
                thisline1 = thisline1.substring(0, thisline1.indexOf("/"));

                if(thisline1.equals(bookname))
                {
                    existens1 = true;
                    break;
                }
                
            }
          
        } catch (FileNotFoundException ex) {
            createfile = new File("G:\\جاوا\\LibraryManagement\\Documents\\admin\\bookname.txt");
                try {
                        createfile.createNewFile();
                    } catch (IOException ex1) {existens1 = true;}
                
            existens1 = true;
        } catch (IOException ex) {
            existens1 = false;
        
        }finally{       

    if(!Studentnumber.equals(Null) && !bookname.equals(Null) && !bookID.equals(Null))
    {        

            try {
                    filetrustsreader = new FileReader("G:\\جاوا\\LibraryManagement\\Documents\\admin\\Trusts.txt");
                } catch (FileNotFoundException ex) {
                    existens2 = true;
                    createfile = new File("G:\\جاوا\\LibraryManagement\\Documents\\admin\\Trusts.txt");
                    try {
                            createfile.createNewFile();
                    } catch (IOException ex1) {}
                } finally{
                
                        createfile = new File("G:\\جاوا\\LibraryManagement\\Documents\\admin\\Trusts.txt");
                        trustsreader = new BufferedReader(filetrustsreader);
                      
                        String thisline2 , thisline3 ,str1,str2;
                        
                try {
                        if((thisline2 = trustsreader.readLine()) != null)
                        {
                            trustsreader.close();
                        
                            createfile = new File("G:\\جاوا\\LibraryManagement\\Documents\\admin\\Trusts.txt");
                            trustsreader = new BufferedReader(filetrustsreader);
                            while((thisline3 = trustsreader.readLine()) != null)
                            {
                                int i = thisline3.indexOf("/");
                                int size = thisline3.length();
                                str1 = thisline3.substring(0, i);
                                str2 = thisline3.substring(i+1, size);
                                if(str2.equals(bookname)) existens2 = false;
                            
                                else existens2 = true;
                            }
                                               
                        }//end of if
                    } catch (IOException ex) {
                        existens2 = true;
                    }finally{
                                if(existens1 == true && existens2 == true)
                                {
    
                                    try {
                                            filereader = new FileReader("G:\\جاوا\\LibraryManagement\\Documents\\Users\\profile" + Studentnumber + ".txt");
                                            br = new BufferedReader(filereader);
                                            int i=0;
                                            while(i<4)
                                            {
                                                level = br.readLine();
                                                i++; 
                                            }
            
                                            if(level.equals("کارشناسی"))
                                            {
                                                file = new FileWriter("G:\\جاوا\\LibraryManagement\\Documents\\Users\\booklist" + Studentnumber + ".txt");
                                                submitbook = new BufferedWriter(new FileWriter("G:\\جاوا\\LibraryManagement\\Documents\\Users\\booklist" + Studentnumber + ".txt",true));
                                                submitbook.write(bookname + "/" + category +"/" + bookID + "/" + "14");
                                                submitbook.close();
                                                jLabel4.setForeground(Color.blue);
                                                jLabel4.setText("درخواست شما ثبت گردید .");                                   
                
                                                filetrusts = new FileWriter("G:\\جاوا\\LibraryManagement\\Documents\\admin\\Trusts.txt");
                                                trusts = new BufferedWriter(filetrusts = new FileWriter("G:\\جاوا\\LibraryManagement\\Documents\\admin\\Trusts.txt",true));
                                                trusts.write(bookname + "/" + category +"/" + bookID + "/" + NAME + "/" + "14");
                                                System.out.println(NAME);
                                                trusts.close();
                                            }
                                            else if (level.equals("کارشناسی ارشد"))
                                            {
                                                file = new FileWriter("G:\\جاوا\\LibraryManagement\\Documents\\Users\\booklist" + Studentnumber + ".txt");
                                                submitbook = new BufferedWriter(new FileWriter("G:\\جاوا\\LibraryManagement\\Documents\\Users\\booklist" + Studentnumber + ".txt",true));
                                                submitbook.write(bookname + "/" + category +"/" + bookID + "/" + "21");
                                                submitbook.close();
                                                jLabel4.setForeground(Color.blue);
                                                jLabel4.setText("درخواست شما ثبت گردید .");
                
                                                filetrusts = new FileWriter("G:\\جاوا\\LibraryManagement\\Documents\\admin\\Trusts.txt");
                                                trusts = new BufferedWriter(filetrusts = new FileWriter("G:\\جاوا\\LibraryManagement\\Documents\\admin\\Trusts.txt",true));
                                                trusts.write(bookname + "/" + category +"/" + bookID + "/" + NAME + "/" + "21");
                                                trusts.close();
                                            }
                                            else
                                            {
                                                file = new FileWriter("G:\\جاوا\\LibraryManagement\\Documents\\Users\\booklist" + Studentnumber + ".txt");
                                                submitbook = new BufferedWriter(new FileWriter("G:\\جاوا\\LibraryManagement\\Documents\\Users\\booklist" + Studentnumber + ".txt",true));
                                                submitbook.write(bookname + "/" + category +"/" + bookID + "/" + "28");
                                                submitbook.close();
                                                jLabel4.setForeground(Color.blue);
                                                jLabel4.setText("درخواست شما ثبت گردید .");
                
                                                filetrusts = new FileWriter("G:\\جاوا\\LibraryManagement\\Documents\\admin\\Trusts.txt");
                                                trusts = new BufferedWriter(filetrusts = new FileWriter("G:\\جاوا\\LibraryManagement\\Documents\\admin\\Trusts.txt",true));
                                                trusts.write(bookname + "/" + category +"/" + bookID + "/" + NAME + "/"  + "28");
                                                trusts.close();
                                            }
                                                br.close();
            
                                            } catch (FileNotFoundException ex) {
                                                JOptionPane.showMessageDialog(this,"چنین کاربری وجود ندارد .","Alert",JOptionPane.OK_OPTION);            
                                            } catch (IOException ex) {
                                            JOptionPane.showMessageDialog(this,"مشکلی به وجود آمد لطفا دوباره امتحان کنید !","Alert",JOptionPane.WARNING_MESSAGE);            
                                            }
                                }
                                else
                                {
                                    JOptionPane.showMessageDialog(this,"در حال حاظر کتاب مورد نظر موجود نیست !","Alert",JOptionPane.OK_OPTION);                            
                                }
               
                }
        }//end of finally 2     
    }
    else
    {
        JOptionPane.showMessageDialog(this,"لطفا تمامی اطلاعات را وارد کنید !","Alert",JOptionPane.WARNING_MESSAGE);          
    }
}//end of finally1
       
       
       
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Submitbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Submitbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Submitbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Submitbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Submitbook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField name;
    // End of variables declaration//GEN-END:variables
}
