package BorderLayout;
import javax.swing.JFrame;
public class BorderLayout {
    public static void main(String[] args) {
        MarcoBorderLayout marcoBorderLayout = new MarcoBorderLayout();
        marcoBorderLayout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marcoBorderLayout.setSize(300, 200);
        marcoBorderLayout.setVisible(true);
    }
}
