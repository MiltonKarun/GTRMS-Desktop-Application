
//Code written by Milton Karun Kumar Tennambedu - W22072238 (Northumbria University, London Campus)

package GTRMS.View;

import javax.swing.*;


public class CustomerView extends javax.swing.JFrame {

   
    public CustomerView() {
        //default constructor
    }
    
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        repassbox = new javax.swing.JPasswordField();
        idnumber = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        namebox = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        passbox = new javax.swing.JPasswordField();
        registerbutton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("New User");

        jPanel1.setLayout(null);

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(80, 420, 140, 50);

        jLabel7.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jLabel7.setText("New User Account");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(150, 20, 340, 40);
        jPanel1.add(repassbox);
        repassbox.setBounds(210, 280, 220, 30);
        jPanel1.add(idnumber);
        idnumber.setBounds(210, 200, 220, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Phone");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(90, 290, 112, 15);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Password");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(90, 210, 90, 15);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Last Name");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(90, 170, 70, 15);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Gender");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(90, 250, 50, 15);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("First Name");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(90, 130, 70, 15);
        jPanel1.add(namebox);
        namebox.setBounds(210, 120, 220, 30);
        jPanel1.add(username);
        username.setBounds(210, 160, 220, 30);
        jPanel1.add(passbox);
        passbox.setBounds(210, 240, 220, 30);

        registerbutton.setBackground(new java.awt.Color(204, 204, 255));
        registerbutton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        registerbutton.setText("Register");
        registerbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(registerbutton);
        registerbutton.setBounds(380, 420, 140, 50);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/otherim.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 0, 570, 525);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerbuttonActionPerformed
        
           //perform registration action
            
    }//GEN-LAST:event_registerbuttonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        //perform login action
    }//GEN-LAST:event_jButton1ActionPerformed

 
    public static void main(String args[]) {
       //main method to invoke all the functionalities
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField idnumber;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField namebox;
    private javax.swing.JPasswordField passbox;
    private javax.swing.JButton registerbutton;
    private javax.swing.JPasswordField repassbox;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
