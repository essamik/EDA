/*
 * UserGUI.java
 *
 * Created on 20 mars 2007, 11:11
 */

package trader;



/**
 *
 */
public class UserGUI extends javax.swing.JFrame {
 
    private int qtty;
    private Trader trader;
    
    
    /** Creates new form UserGUI */
    public UserGUI(String name) {
        //cre un nouveau trader pour l'utilisateur
        trader = new Trader();
        initComponents();
        jLabel1.setText("Portofolio of " + name);
        System.out.println("Trader " + name + " join the market!");
        displayMyStock();
        
        
        
    }
    
    private void displayMyStock(){
        jLabel2.setText(trader.getText(0));
        jLabel3.setText(trader.getText(1));
        jLabel4.setText(trader.getText(2));
        
        jLabel5.setText("Total result: "+ trader.getTotalResult());
    }
    
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jpanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        qttbuypdtField1 = new javax.swing.JTextField();
        qttbuypdtField2 = new javax.swing.JTextField();
        qttbuypdtField3 = new javax.swing.JTextField();
        jBuy1 = new javax.swing.JButton();
        jSell1 = new javax.swing.JButton();
        jBuy2 = new javax.swing.JButton();
        jSell2 = new javax.swing.JButton();
        jBuy3 = new javax.swing.JButton();
        jSell3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        jpanel3.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        jpanel3.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        jpanel3.setRequestFocusEnabled(false);
        jLabel1.setFont(new java.awt.Font("Futura", 0, 24));
        jLabel1.setText("Portfolio");

        jLabel2.setText("pdtLabel1");

        jLabel3.setText("pdtLabel2");

        jLabel4.setText("pdtLabel3");

        jBuy1.setText("Buy");
        jBuy1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuy1ActionPerformed(evt);
            }
        });

        jSell1.setText("Sell");
        jSell1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSell1ActionPerformed(evt);
            }
        });

        jBuy2.setText("Buy");
        jBuy2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuy2ActionPerformed(evt);
            }
        });

        jSell2.setText("Sell");
        jSell2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSell2ActionPerformed(evt);
            }
        });

        jBuy3.setText("Buy");
        jBuy3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuy3ActionPerformed(evt);
            }
        });

        jSell3.setText("Sell");
        jSell3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSell3ActionPerformed(evt);
            }
        });

        jLabel5.setText("totalLabel");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/images.jpg")));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoMockStock.jpg")));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logodop.gif")));

        org.jdesktop.layout.GroupLayout jpanel3Layout = new org.jdesktop.layout.GroupLayout(jpanel3);
        jpanel3.setLayout(jpanel3Layout);
        jpanel3Layout.setHorizontalGroup(
            jpanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jpanel3Layout.createSequentialGroup()
                .add(jpanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jpanel3Layout.createSequentialGroup()
                        .add(jLabel8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 259, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(111, 111, 111)
                        .add(jLabel6))
                    .add(jpanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jpanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jpanel3Layout.createSequentialGroup()
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jLabel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                                .add(4, 4, 4)
                                .add(jSeparator1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE))
                            .add(jpanel3Layout.createSequentialGroup()
                                .add(jpanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, jLabel5)
                                    .add(jLabel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, jLabel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, jLabel4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jpanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                    .add(qttbuypdtField3)
                                    .add(qttbuypdtField2)
                                    .add(qttbuypdtField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 81, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(34, 34, 34)
                                .add(jpanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jpanel3Layout.createSequentialGroup()
                                        .add(jpanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                            .add(jBuy1)
                                            .add(jBuy2))
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(jpanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                            .add(jSell2)
                                            .add(jSell1)))
                                    .add(jpanel3Layout.createSequentialGroup()
                                        .add(jBuy3)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(jSell3)))
                                .add(11, 11, 11)))))
                .addContainerGap(21, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jpanel3Layout.createSequentialGroup()
                .addContainerGap(346, Short.MAX_VALUE)
                .add(jLabel7)
                .add(46, 46, 46))
        );
        jpanel3Layout.setVerticalGroup(
            jpanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jpanel3Layout.createSequentialGroup()
                .addContainerGap()
                .add(jpanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 153, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 120, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(jpanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jpanel3Layout.createSequentialGroup()
                        .add(29, 29, 29)
                        .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jpanel3Layout.createSequentialGroup()
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jLabel1)))
                .add(18, 18, 18)
                .add(jpanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jSell1)
                    .add(jBuy1)
                    .add(qttbuypdtField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .add(23, 23, 23)
                .add(jpanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jBuy2)
                    .add(jSell2)
                    .add(qttbuypdtField2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .add(19, 19, 19)
                .add(jpanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jBuy3)
                    .add(jSell3)
                    .add(qttbuypdtField3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .add(27, 27, 27)
                .add(jLabel5)
                .add(33, 33, 33)
                .add(jLabel7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 80, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(jpanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jpanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jSell3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSell3ActionPerformed
        String type = "sell";
        int stockID = 2;
        if (!qttbuypdtField3.getText().trim().equals("")) {
            qtty = new Integer(qttbuypdtField3.getText().trim()).intValue();
            trader.update(qtty, stockID, type);
            qttbuypdtField3.setText("");
            displayMyStock();
        }
    }//GEN-LAST:event_jSell3ActionPerformed
    
    private void jBuy3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuy3ActionPerformed
        String type = "buy";
        int stockID = 2;
        if (!qttbuypdtField3.getText().trim().equals("")) {
            qtty = new Integer(qttbuypdtField3.getText().trim()).intValue();
            trader.update(qtty, stockID, type);
            qttbuypdtField3.setText("");
            displayMyStock();
        }
    }//GEN-LAST:event_jBuy3ActionPerformed
    
    private void jSell2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSell2ActionPerformed
        String type = "sell";
        int stockID = 1;
        if (!qttbuypdtField2.getText().trim().equals("")) {
            qtty = new Integer(qttbuypdtField2.getText().trim()).intValue();
            trader.update(qtty, stockID, type);
            qttbuypdtField2.setText("");
            displayMyStock();
        }
    }//GEN-LAST:event_jSell2ActionPerformed
    
    private void jBuy2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuy2ActionPerformed
        String type = "buy";
        int stockID = 1;
        if (!qttbuypdtField2.getText().trim().equals("")) {
            qtty = new Integer(qttbuypdtField2.getText().trim()).intValue();
            trader.update(qtty, stockID, type);
            qttbuypdtField2.setText("");
            displayMyStock();
        }
    }//GEN-LAST:event_jBuy2ActionPerformed
    
    private void jSell1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSell1ActionPerformed
        String type = "sell";
        int stockID = 0;
        if (!qttbuypdtField1.getText().trim().equals("")) {
            qtty = new Integer(qttbuypdtField1.getText().trim()).intValue();
            trader.update(qtty, stockID, type);
            qttbuypdtField1.setText("");
            displayMyStock();
        }
    }//GEN-LAST:event_jSell1ActionPerformed
    
    private void jBuy1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuy1ActionPerformed
        String type = "buy";
        int stockID = 0;
        if (!qttbuypdtField1.getText().trim().equals("")) {
            qtty = new Integer(qttbuypdtField1.getText().trim()).intValue();
            trader.update(qtty, stockID, type);
            qttbuypdtField1.setText("");
            displayMyStock();
        }
    }//GEN-LAST:event_jBuy1ActionPerformed
    
    /**
     * @param args the command line arguments
     */
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBuy1;
    private javax.swing.JButton jBuy2;
    private javax.swing.JButton jBuy3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton jSell1;
    private javax.swing.JButton jSell2;
    private javax.swing.JButton jSell3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel jpanel3;
    private javax.swing.JTextField qttbuypdtField1;
    private javax.swing.JTextField qttbuypdtField2;
    private javax.swing.JTextField qttbuypdtField3;
    // End of variables declaration//GEN-END:variables
    
}
