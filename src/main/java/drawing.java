
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class drawing extends javax.swing.JFrame implements MouseListener {

    int[] xPoints = {100, 200, 300};
    int[] yPoints = {400, 300, 400};
    int npoints = 3;
    int x, y;
    int points[] = new int[4];

    public drawing() {
        initComponents();
        /*  there is this. is used becaused to set shapes in specific locations*/
        this.addMouseListener(this);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RBRED = new javax.swing.JRadioButton();
        RBGREEN = new javax.swing.JRadioButton();
        RBBLUE = new javax.swing.JRadioButton();
        RBBLACK = new javax.swing.JRadioButton();
        RBYELLOW = new javax.swing.JRadioButton();
        MENU = new javax.swing.JComboBox<>();
        BOARD = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RBRED.setText("Red");
        RBRED.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBREDActionPerformed(evt);
            }
        });
        getContentPane().add(RBRED, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 60, 30));

        RBGREEN.setText("Green");
        getContentPane().add(RBGREEN, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 70, 30));

        RBBLUE.setText("Blue");
        getContentPane().add(RBBLUE, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 60, 30));

        RBBLACK.setText("Black");
        getContentPane().add(RBBLACK, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 60, 30));

        RBYELLOW.setText("Yellow");
        getContentPane().add(RBYELLOW, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, 70, 30));

        MENU.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Circle", "Squre", "Rectangle", "Triangle" }));
        getContentPane().add(MENU, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 150, -1));

        BOARD.setBackground(new java.awt.Color(204, 204, 204));
        BOARD.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));
        BOARD.setLayout(new javax.swing.BoxLayout(BOARD, javax.swing.BoxLayout.LINE_AXIS));
        getContentPane().add(BOARD, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 630, 210));

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setLabelFor(MENU);
        jLabel1.setText("Select Colours With Shapes");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 204, 204), null, null));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 200, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RBREDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBREDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RBREDActionPerformed

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
            java.util.logging.Logger.getLogger(drawing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(drawing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(drawing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(drawing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new drawing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BOARD;
    private javax.swing.JComboBox<String> MENU;
    private javax.swing.JRadioButton RBBLACK;
    private javax.swing.JRadioButton RBBLUE;
    private javax.swing.JRadioButton RBGREEN;
    private javax.swing.JRadioButton RBRED;
    private javax.swing.JRadioButton RBYELLOW;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (MENU.getSelectedItem().toString().equals("line")) {
            points[0] = e.getX();
            points[1] = e.getY();
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if (MENU.getSelectedItem().toString().equals("line")) {
            points[2] = e.getX();
            points[3] = e.getY();
            repaint();
        } else if (MENU.getSelectedItem().toString().equals("Squre")) {
            x = e.getX();
            y = e.getY();
            repaint();
        } else if (MENU.getSelectedItem().toString().equals("Circle")) {
            x = e.getX();
            y = e.getY();
            repaint();
        } else if (MENU.getSelectedItem().toString().equals("Rectangle")) {
            x = e.getX();
            y = e.getY();
            repaint();
        } else if (MENU.getSelectedItem().toString().equals("Triangle")) {
            x = e.getX();
            y = e.getY();
            repaint();

        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    public void paint(Graphics g) {
        super.paint(g);
        if (RBRED.isSelected()) {
            g.setColor(Color.red);
        } else if (RBGREEN.isSelected()) {
            g.setColor(Color.green);
        } else if (RBBLUE.isSelected()) {
            g.setColor(Color.blue);
        } else if (RBBLACK.isSelected()) {
            g.setColor(Color.black);
        } else if (RBYELLOW.isSelected()) {
            g.setColor(Color.yellow);
        }
        if (MENU.getSelectedItem().toString().equals("line")) {
            g.drawLine(points[0], points[1], points[2], points[3]);

        } else if (MENU.getSelectedItem().toString().equals("Squre")) {
            g.fillRect(x, y, 80, 80);
        } else if (MENU.getSelectedItem().toString().equals("Circle")) {
            g.fillOval(x, y, 80, 80);
        } else if (MENU.getSelectedItem().toString().equals("Rectangle")) {
            g.fill3DRect(x, y, 140, 50, rootPaneCheckingEnabled);
        } else if (MENU.getSelectedItem().toString().equals("Triangle")) {
            g.fillPolygon(xPoints, yPoints, npoints);
        } else if (MENU.getSelectedItem().toString() == null) {

        }
    }
}
