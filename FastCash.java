import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abhishek
 */
public class FastCash extends javax.swing.JFrame {
             
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    /**
     * Creates new form FastCash
     */
        public FastCash(String str) {
        initComponents();
         setLocationRelativeTo(null);
         conn = JavaConnect.dbConnector();
          cardnum=str;
         speak.start();
        }
        public void close()
    {
        WindowEvent WindowClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(WindowClosingEvent);
    }
         Thread speak = new Thread()
        {
            public void run()
            {
            new Speak("Please select your transaction option"); }
        };

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("                                                                                            FAST CASH");

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.setText("1500");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText(" SELECT WITHDRAWL AMOUNT");

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton7.setText("BACK");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setText("100");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton4.setText("5000");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton3.setText("500");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton5.setText("1000");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton6.setText("10000");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton8.setText("EXIT");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3)
                            .addComponent(jButton5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 192, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(64, 64, 64))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jButton7)
                        .addGap(76, 76, 76)
                        .addComponent(jButton8)))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2, jButton3, jButton4, jButton5, jButton6, jButton7, jButton8});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton8))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, jButton2, jButton3, jButton4, jButton5, jButton6, jButton7, jButton8});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(54, 54, 54))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        cardno = Integer.parseInt(cardnum);
                     
        try{
            String sql="SELECT amount FROM account_info WHERE cardno=cardno";
            pst=conn.prepareStatement(sql);
            rs = pst.executeQuery();
             amount=rs.getInt(1);
             withdrawl=5000;
             if(withdrawl<=amount)
             {
            amount=rs.getInt(1)-5000;
              sql = "UPDATE account_info SET amount=? WHERE cardno=cardno";
            pst=conn.prepareStatement(sql);
            pst.setString(1,Integer.toString(amount));
            pst.execute();
            JOptionPane.showMessageDialog(null, "Kindly collect your cash");
             }
             else
             {
                  JOptionPane.showMessageDialog(null, "Insufficient Fund!!");
             }
              pst.close();
              rs.close();
        }
             catch(Exception e)
                     {
                     
                     }
         new Atm().setVisible(true);         
        close();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
         try{
                    pst.close();
                    rs.close();
                    }
                    catch(Exception e){}
        new Transaction(cardnum).setVisible(true);
        close();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
         cardno = Integer.parseInt(cardnum);
                     
        try{
            String sql="SELECT amount FROM account_info WHERE cardno=cardno";
            pst=conn.prepareStatement(sql);
            rs = pst.executeQuery();
             amount=rs.getInt(1);
             withdrawl=100;
             if(withdrawl<=amount)
             {
            amount=rs.getInt(1)-100;
              sql = "UPDATE account_info SET amount=? WHERE cardno=cardno";
            pst=conn.prepareStatement(sql);
            pst.setString(1,Integer.toString(amount));
            pst.execute();
        JOptionPane.showMessageDialog(null, "Kindly collect your cash");
             }
             else
             {
                  JOptionPane.showMessageDialog(null, "Insufficient Fund!!");
             }
             
        }
             catch(Exception e)
                     {
                     
                     }
        finally{
         try{
                    pst.close();
                    rs.close();
                    }
                    catch(Exception e){}
         new Atm().setVisible(true);
         close();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        cardno = Integer.parseInt(cardnum);
                     
        try{
            String sql="SELECT amount FROM account_info WHERE cardno=cardno";
            pst=conn.prepareStatement(sql);
            rs = pst.executeQuery();
             amount=rs.getInt(1);
             withdrawl=1500;
             if(withdrawl<=amount)
             {
            amount=rs.getInt(1)-1500;
              sql = "UPDATE account_info SET amount=? WHERE cardno=cardno";
            pst=conn.prepareStatement(sql);
            pst.setString(1,Integer.toString(amount));
            pst.execute();
        JOptionPane.showMessageDialog(null, "Kindly collect your cash");
             }
             else
             {
                  JOptionPane.showMessageDialog(null, "Insufficient Fund!!");
             }
            
        }
             catch(Exception e)
                     {
                     
                     }
         finally{
         try{
                    pst.close();
                    rs.close();
                    }
                    catch(Exception e){}
         new Atm().setVisible(true);
         close();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        cardno = Integer.parseInt(cardnum);
                     
        try{
            String sql="SELECT amount FROM account_info WHERE cardno=cardno";
            pst=conn.prepareStatement(sql);
            rs = pst.executeQuery();
             amount=rs.getInt(1);
             withdrawl=500;
             if(withdrawl<=amount)
             {
            amount=rs.getInt(1)-500;
              sql = "UPDATE account_info SET amount=? WHERE cardno=cardno";
            pst=conn.prepareStatement(sql);
            pst.setString(1,Integer.toString(amount));
            pst.execute();
        JOptionPane.showMessageDialog(null, "Kindly collect your cash");
             }
             else
             {
                  JOptionPane.showMessageDialog(null, "Insufficient Fund!!");
             }
             pst.close();
             rs.close();
        }
             catch(Exception e)
                     {
                     
                     }
          finally{
         try{
                    pst.close();
                    rs.close();
                    }
                    catch(Exception e){}
         new Atm().setVisible(true);
         close();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        cardno = Integer.parseInt(cardnum);
                     
        try{
            String sql="SELECT amount FROM account_info WHERE cardno=cardno";
            pst=conn.prepareStatement(sql);
            rs = pst.executeQuery();
             amount=rs.getInt(1);
             withdrawl=1000;
             if(withdrawl<=amount)
             {
            amount=rs.getInt(1)-1000;
              sql = "UPDATE account_info SET amount=? WHERE cardno=cardno";
            pst=conn.prepareStatement(sql);
            pst.setString(1,Integer.toString(amount));
            pst.execute();
        JOptionPane.showMessageDialog(null, "Kindly collect your cash");
             }
             else
             {
                  JOptionPane.showMessageDialog(null, "Insufficient Fund!!");
             }
             rs.close();
             pst.close();
        }
             catch(Exception e)
                     {
                     
                     }
         finally{
         try{
                    pst.close();
                    rs.close();
                    }
                    catch(Exception e){}
         new Atm().setVisible(true);
         close();
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        cardno = Integer.parseInt(cardnum);
                     
        try{
            String sql="SELECT amount FROM account_info WHERE cardno=cardno";
            pst=conn.prepareStatement(sql);
            rs = pst.executeQuery();
             amount=rs.getInt(1);
             withdrawl=10000;
             if(withdrawl<=amount)
             {
            amount=rs.getInt(1)-10000;
              sql = "UPDATE account_info SET amount=? WHERE cardno=cardno";
            pst=conn.prepareStatement(sql);
            pst.setString(1,Integer.toString(amount));
            pst.execute();
        JOptionPane.showMessageDialog(null, "Kindly collect your cash");
             }
             else
             {
                  JOptionPane.showMessageDialog(null, "Insufficient Fund!!");
             }
              rs.close();
              pst.close();
        }
             catch(Exception e)
                     {
                     
                     }
          
          finally{
         try{
                    pst.close();
                    rs.close();
                    }
                    catch(Exception e){}
         new Atm().setVisible(true);
         close();
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        
                try{
                    pst.close();
                    rs.close();
                    }
                    catch(Exception e){}
         new Atm().setVisible(true);
         close();
        
    }//GEN-LAST:event_jButton8ActionPerformed

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
            java.util.logging.Logger.getLogger(FastCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FastCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FastCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FastCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FastCash("").setVisible(true);
            }
        });
    }
    public String cardnum;
    public int cardno;
    private int amount;
    private int withdrawl;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
