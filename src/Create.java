
import java.awt.Color;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Logger;
import javax.swing.JFrame;
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
public class Create extends javax.swing.JFrame{
    
    private static File folder ;
    private static File file1;
    private static File file2;
    private static File file3;
    private static BufferedWriter input;
    private static BufferedWriter inputnames;
    private static Account closed;

    /**
     * Creates new form Create
     */
    public Create() {
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

        jButton1 = new javax.swing.JButton();
        StudentNumber = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Studentnumtext = new javax.swing.JLabel();
        Nametext = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        Familynametext = new javax.swing.JLabel();
        Familyname = new javax.swing.JTextField();
        LevelCm = new javax.swing.JComboBox<>();
        Level = new javax.swing.JLabel();
        Collegename = new javax.swing.JLabel();
        CollegeCm = new javax.swing.JComboBox<>();
        Password = new javax.swing.JLabel();
        RepeatPasswrod = new javax.swing.JLabel();
        RepeatPasswrodtext = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        OK1 = new javax.swing.JToggleButton();
        Errortext = new javax.swing.JLabel();
        error = new javax.swing.JLabel();
        Passwordtext = new javax.swing.JPasswordField();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ساخت حساب کاربری");
        setPreferredSize(new java.awt.Dimension(500, 500));
        setResizable(false);

        StudentNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentNumberActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("لطفا اطلاعات مورد نظر را وارد کنید .");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        Studentnumtext.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Studentnumtext.setText("شماره دانشجویی :");

        Nametext.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Nametext.setText("نام :");

        Familynametext.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Familynametext.setText("نام خانوادگی :");

        LevelCm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "کارشناسی", "کارشناسی ارشد", "دکتری" }));
        LevelCm.setToolTipText("");
        LevelCm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LevelCm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LevelCmActionPerformed(evt);
            }
        });

        Level.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Level.setText("مقطع تحصیلی :");

        Collegename.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Collegename.setText("نام دانشکده :");

        CollegeCm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "مهندسی کامپیوتر", "مهندسی برق", "علوم پایه" }));

        Password.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Password.setText("رمز عبور :");

        RepeatPasswrod.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RepeatPasswrod.setText("تکرار رمز عبور :");

        jLabel2.setForeground(new java.awt.Color(255, 0, 51));

        OK1.setText("تایید");
        OK1.setToolTipText("پس از پر کردن فیلد های بالا برای ذخیره سازی اطلاعات اینجا کلیک کنید .");
        OK1.setBorder(null);
        OK1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        OK1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OK1ActionPerformed(evt);
            }
        });

        Errortext.setForeground(new java.awt.Color(255, 0, 0));
        Errortext.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        error.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        error.setForeground(new java.awt.Color(255, 0, 0));
        error.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(127, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(RepeatPasswrodtext, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(StudentNumber)
                            .addComponent(Name)
                            .addComponent(Familyname)
                            .addComponent(LevelCm, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CollegeCm, 0, 195, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(OK1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jLabel2))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(Errortext, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(error, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Passwordtext, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(34, 34, 34)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(Nametext)
                                        .addComponent(Familynametext)
                                        .addComponent(Studentnumtext)
                                        .addComponent(Level)
                                        .addComponent(Collegename)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(85, 85, 85)
                                    .addComponent(Password)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(RepeatPasswrod)))))
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nametext))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Familynametext, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Familyname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(StudentNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Studentnumtext, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Level, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LevelCm, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Collegename, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CollegeCm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Password)
                    .addComponent(Passwordtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RepeatPasswrod)
                    .addComponent(RepeatPasswrodtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(OK1, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Errortext)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void StudentNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StudentNumberActionPerformed

    private void LevelCmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LevelCmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LevelCmActionPerformed

    private void OK1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OK1ActionPerformed
        String name , familyname , studentNumber , LevelStudent , Colleg , password , repeatpasword , Null = "" ;
        
        name = Name.getText();
        familyname = Familyname.getText();
        studentNumber = StudentNumber.getText();
        LevelStudent = (String)LevelCm.getSelectedItem();
        Colleg = (String)CollegeCm.getSelectedItem();
        password = Passwordtext.getText();
        repeatpasword = RepeatPasswrodtext.getText();
        String namefamily = name + familyname;

        if( name.equals(Null) || familyname.equals(Null) ||  studentNumber.equals(Null) || password.equals(Null) || repeatpasword.equals(Null) || !password.equals(repeatpasword))        
        {
            JOptionPane.showMessageDialog(this,"لطفا اطلاعات را به درستی وراد کنید .","Alert",JOptionPane.WARNING_MESSAGE);    
        }
        else 
        {
            //for create a new folder .

            folder = new File("G:\\جاوا\\LibraryManagement\\Documents\\Users");
            new File("G:\\جاوا\\LibraryManagement\\Documents\\Users\\").mkdir();
             
            //for create a new txt file
            file1 = new File("G:\\جاوا\\LibraryManagement\\Documents\\Users\\profile" + studentNumber + ".txt");
            file2 = new File("G:\\جاوا\\LibraryManagement\\Documents\\Users\\booklist" + studentNumber + ".txt");
            
            try {
                file1.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(Create.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            try {
                file2.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(Create.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
           
            
            try {
                input = new BufferedWriter(new FileWriter("G:\\جاوا\\LibraryManagement\\Documents\\Users\\profile" + studentNumber + ".txt"));
                input.write(name);
                input.newLine();
                input.write(familyname);
                input.newLine();
                input.write(studentNumber);
                input.newLine();
                input.write(LevelStudent);
                input.newLine();
                input.write(Colleg);
                input.newLine();
                input.write(password);
                input.newLine();
                input.close();
                
                error.setText("اطلاعات با موفقیت ذخیره شد .");
                error.setForeground(Color.blue);
                closed = new Account();
                closed.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                
                
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Create.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Create.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            
            file3 = new File("G:\\جاوا\\LibraryManagement\\Documents\\admin\\studentname.txt");
            try {
                inputnames = new BufferedWriter(new FileWriter("G:\\جاوا\\LibraryManagement\\Documents\\admin\\studentname.txt",true));
                inputnames.write(namefamily);
                inputnames.newLine();
                inputnames.close();
            } catch (IOException ex) {
                Logger.getLogger(Create.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            
                       
        }

    }//GEN-LAST:event_OK1ActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Create.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Create().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CollegeCm;
    private javax.swing.JLabel Collegename;
    private javax.swing.JLabel Errortext;
    private javax.swing.JTextField Familyname;
    private javax.swing.JLabel Familynametext;
    private javax.swing.JLabel Level;
    private javax.swing.JComboBox<String> LevelCm;
    private javax.swing.JTextField Name;
    private javax.swing.JLabel Nametext;
    private javax.swing.JToggleButton OK1;
    private javax.swing.JLabel Password;
    private javax.swing.JPasswordField Passwordtext;
    private javax.swing.JLabel RepeatPasswrod;
    private javax.swing.JPasswordField RepeatPasswrodtext;
    private javax.swing.JTextField StudentNumber;
    private javax.swing.JLabel Studentnumtext;
    private javax.swing.JLabel error;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
