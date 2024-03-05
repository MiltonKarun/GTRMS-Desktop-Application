//Code written by Milton Karun Kumar Tennambedu - W22072238 (Northumbria University, London Campus)


package GTRMS.View;

import javax.swing.*;



public class LoginView extends javax.swing.JFrame {
   
    
    public LoginView() {
        //Default constructor
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        uname1 = new javax.swing.JTextField();
        uname = new javax.swing.JTextField();
        labal = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Loging");

        jPanel3.setLayout(null);

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("Create a New User Account");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);
        jButton2.setBounds(20, 450, 390, 40);

        uname1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        uname1.setText("Enter Email Address");
        uname1.setBorder(null);
        jPanel3.add(uname1);
        uname1.setBounds(70, 200, 280, 40);

        uname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        uname.setText("Enter Password");
        uname.setBorder(null);
        jPanel3.add(uname);
        uname.setBounds(70, 270, 280, 40);

        labal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/loginim.jpg"))); // NOI18N
        labal.setText("jLabel4");
        jPanel3.add(labal);
        labal.setBounds(0, 0, 970, 590);

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(70, 373, 290, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 849, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

       //registration code

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

       //login code
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       //Main method to invoke all functionalities
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labal;
    private javax.swing.JTextField uname;
    private javax.swing.JTextField uname1;
    // End of variables declaration//GEN-END:variables
}
