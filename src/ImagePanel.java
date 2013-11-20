public class ImagePanel extends javax.swing.JFrame {

    public ImagePanel() {
        initComponents();
    }

    private void initComponents() {
        jLabel1 = new javax.swing.JLabel();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("1.png")));
        jLabel1.setText("Foreign Cat!!!");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        getContentPane().add(jLabel1, java.awt.BorderLayout.CENTER);
        pack();
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ImagePanel().setVisible(true);
            }
        });
    }

    private javax.swing.JLabel jLabel1;
}