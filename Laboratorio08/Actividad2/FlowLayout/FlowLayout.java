package FlowLayout;
import javax.swing.JFrame;
public class FlowLayout {
    public static void main(String[] args) {
        MarcoFlowLayout marcoFlowLayout = new MarcoFlowLayout();
        marcoFlowLayout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marcoFlowLayout.setSize(300, 75);
        marcoFlowLayout.setVisible(true);
    }
}
