import java.io.IOException;
import javax.swing.JFrame;

public class PruebaJFileChooser {
    
    public static void main(String[] args) throws IOException {
        DemoJFileChooser demo = new DemoJFileChooser();
        demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        demo.setSize(400, 400);
        demo.setVisible(true);
    }
}
