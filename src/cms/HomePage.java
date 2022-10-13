package cms;




import com.mysql.jdbc.Connection;
import function.DBConnection;
import function.validate;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JInternalFrame;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Computer
 */
public class HomePage extends javax.swing.JFrame {
    /**
     * Creates new form HomePage
     */
    public HomePage() {
        initComponents();
        this.setResizable(false);
        //this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    
    }
    
    Color clicked = new Color(153,153,255);
    Color notClicked = new Color(153,204,255);
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DesktopPane = new javax.swing.JDesktopPane();
        new_courier = new javax.swing.JPanel();
        new_courier_label = new javax.swing.JLabel();
        manage_order = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        manage_order_label = new javax.swing.JLabel();
        employee1 = new javax.swing.JPanel();
        employee_label = new javax.swing.JLabel();
        customer1 = new javax.swing.JPanel();
        customer_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("COURIER MANAGEMENT SYSTEM");
        setBackground(new java.awt.Color(153, 204, 255));

        javax.swing.GroupLayout DesktopPaneLayout = new javax.swing.GroupLayout(DesktopPane);
        DesktopPane.setLayout(DesktopPaneLayout);
        DesktopPaneLayout.setHorizontalGroup(
            DesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 745, Short.MAX_VALUE)
        );
        DesktopPaneLayout.setVerticalGroup(
            DesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 456, Short.MAX_VALUE)
        );

        new_courier.setBackground(new java.awt.Color(153, 204, 255));
        new_courier.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0)));
        new_courier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                new_courierMouseClicked(evt);
            }
        });

        new_courier_label.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        new_courier_label.setForeground(new java.awt.Color(0, 0, 0));
        new_courier_label.setText(" NEW COURIER");
        new_courier_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                new_courier_labelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout new_courierLayout = new javax.swing.GroupLayout(new_courier);
        new_courier.setLayout(new_courierLayout);
        new_courierLayout.setHorizontalGroup(
            new_courierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, new_courierLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(new_courier_label)
                .addGap(16, 16, 16))
        );
        new_courierLayout.setVerticalGroup(
            new_courierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, new_courierLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(new_courier_label)
                .addContainerGap())
        );

        manage_order.setBackground(new java.awt.Color(153, 204, 255));
        manage_order.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0)));
        manage_order.setPreferredSize(new java.awt.Dimension(206, 45));
        manage_order.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manage_orderMouseClicked(evt);
            }
        });

        jLabel3.setText("jLabel3");

        manage_order_label.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        manage_order_label.setForeground(new java.awt.Color(0, 0, 0));
        manage_order_label.setText("Manage Order");
        manage_order_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manage_order_labelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout manage_orderLayout = new javax.swing.GroupLayout(manage_order);
        manage_order.setLayout(manage_orderLayout);
        manage_orderLayout.setHorizontalGroup(
            manage_orderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manage_orderLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(manage_order_label)
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        manage_orderLayout.setVerticalGroup(
            manage_orderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manage_orderLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(manage_orderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(manage_order_label)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        employee1.setBackground(new java.awt.Color(153, 204, 255));
        employee1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0)));
        employee1.setPreferredSize(new java.awt.Dimension(120, 45));
        employee1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                employee1MouseClicked(evt);
            }
        });

        employee_label.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        employee_label.setForeground(new java.awt.Color(0, 0, 0));
        employee_label.setText("EMPLOYEE");
        employee_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                employee_labelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout employee1Layout = new javax.swing.GroupLayout(employee1);
        employee1.setLayout(employee1Layout);
        employee1Layout.setHorizontalGroup(
            employee1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(employee1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(employee_label)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        employee1Layout.setVerticalGroup(
            employee1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(employee1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(employee_label, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addContainerGap())
        );

        customer1.setBackground(new java.awt.Color(153, 204, 255));
        customer1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        customer1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customer1MouseClicked(evt);
            }
        });

        customer_label.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        customer_label.setForeground(new java.awt.Color(0, 0, 0));
        customer_label.setText("CUSTOMER");
        customer_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customer_labelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout customer1Layout = new javax.swing.GroupLayout(customer1);
        customer1.setLayout(customer1Layout);
        customer1Layout.setHorizontalGroup(
            customer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customer1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(customer_label)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        customer1Layout.setVerticalGroup(
            customer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customer1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(customer_label)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(new_courier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(employee1, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                    .addComponent(manage_order, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customer1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24)
                .addComponent(DesktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(new_courier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(customer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(employee1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(manage_order, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(DesktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(954, 498));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private java.sql.Connection myconn1= null;
    private void new_courier_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_new_courier_labelMouseClicked
        // TODO add your handling code here:
        validate.setValue(1);
         checkDisposeAll();
        try {
            java.sql.Connection myconn2 = DBConnection.getConnection();
            myconn2.setAutoCommit(false);
            myconn1 =myconn2;
            
            customer c =new customer(myconn2);
            showJframe(c,new_courier);
        } catch (SQLException ex) {
            Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }//GEN-LAST:event_new_courier_labelMouseClicked

    private void customer_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customer_labelMouseClicked
        // TODO add your handling code here:
        validate.setValue(0);
        checkDisposeAll();
        customer c =new customer();
        showJframe(c,customer1);
       
    }//GEN-LAST:event_customer_labelMouseClicked

    private void customer1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customer1MouseClicked
        // TODO add your handling code here:
        validate.setValue(0);
        checkDisposeAll();
         customer c =new customer();
         showJframe(c,customer1);   
    }//GEN-LAST:event_customer1MouseClicked

    private void employee_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employee_labelMouseClicked
        // TODO add your handling code here:
        checkDisposeAll();
        employee c =new employee();
        
         showJframe(c,employee1);
    }//GEN-LAST:event_employee_labelMouseClicked

    private void employee1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employee1MouseClicked
        // TODO add your handling code here:
           checkDisposeAll();
         employee b =new employee();
         showJframe(b,employee1);
         
         
    }//GEN-LAST:event_employee1MouseClicked

    private void new_courierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_new_courierMouseClicked
        // TODO add your handling code here:
        validate.setValue(1);
        checkDisposeAll();
          try {
            java.sql.Connection myconn2 = DBConnection.getConnection();
            myconn2.setAutoCommit(false);
            myconn1 =myconn2;
            customer c =new customer(myconn2);
            showJframe(c,new_courier);
        } catch (SQLException ex) {
            Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_new_courierMouseClicked

    private void manage_orderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manage_orderMouseClicked
        // TODO add your handling code here:
        validate.setValueC(1);
        checkDisposeAll();
        courier c =new courier();
         showJframe(c,manage_order);
    }//GEN-LAST:event_manage_orderMouseClicked

    private void manage_order_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manage_order_labelMouseClicked
        // TODO add your handling code here:
        validate.setValueC(1);
        checkDisposeAll();
        courier c =new courier();
         showJframe(c,manage_order);
    }//GEN-LAST:event_manage_order_labelMouseClicked
    
    public void checkDisposeAll(){
        JInternalFrame[] frames = DesktopPane.getAllFrames();
        for (int i = 0; i < frames.length; i++) {
            String title = frames[i].getTitle();
            //System.out.print(title+" this frame dispose()\n");
            
            if(title.equals("Courier Detail")){
                
               // c.deleteCourierDetails();
            }
           frames[i].dispose();
        }
        if(myconn1!=null){
        try {
            
            boolean closed1 = myconn1.isClosed();
            if(!closed1){
            try {
                myconn1.rollback();
                myconn1.close();
            } catch (SQLException ex) {
                Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        } catch (SQLException ex) {
            Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
    }
    public void showJframe(javax.swing.JInternalFrame c,javax.swing.JPanel a){
         DesktopPane.add(c);
         c.setVisible(true);
         customer1.setBackground(notClicked);
           employee1.setBackground(notClicked);
           new_courier.setBackground(notClicked);
           manage_order.setBackground(notClicked);
        a.setBackground(clicked);
    }
    
    
    
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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                HomePage h =new HomePage();
                h.setVisible(true);
                h.setDefaultCloseOperation(h.DO_NOTHING_ON_CLOSE);
                h.addWindowListener(new WindowAdapter() {
                 public void windowClosing(WindowEvent e) {
                        // call terminate
                        h.checkDisposeAll();
                        h.dispose();
                        System.exit(0);
                }
                 
                 
});
                
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JDesktopPane DesktopPane;
    private javax.swing.JPanel customer1;
    private javax.swing.JLabel customer_label;
    private javax.swing.JPanel employee1;
    private javax.swing.JLabel employee_label;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel manage_order;
    private javax.swing.JLabel manage_order_label;
    private javax.swing.JPanel new_courier;
    private javax.swing.JLabel new_courier_label;
    // End of variables declaration//GEN-END:variables
}