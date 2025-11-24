import javax.swing.JFrame;
import javax.swing.JSplitPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

public class Lab5App {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            setNimbusLookAndFeel();

            JFrame frame = new JFrame("Control Sistem + Monitorizare Resurse");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(900, 500);
            frame.setLocationRelativeTo(null);

            JSplitPane splitPane = new JSplitPane(
                    JSplitPane.HORIZONTAL_SPLIT,
                    new Task1(),
                    new Task2()
            );
            splitPane.setDividerLocation(450);

            frame.setContentPane(splitPane);
            frame.setVisible(true);
        });
    }

    private static void setNimbusLookAndFeel() {
        try {
            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            // leave default look and feel
        }
    }
}
