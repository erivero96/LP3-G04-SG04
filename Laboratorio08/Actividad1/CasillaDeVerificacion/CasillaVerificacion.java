package CasillaDeVerificacion;

import javax.swing.JFrame;

public class CasillaVerificacion {
    public static void main(String[] args) {
        MarcoCasillaVerificacion marcoCasillaVerificacion = new MarcoCasillaVerificacion(); 
        marcoCasillaVerificacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marcoCasillaVerificacion.setSize(275, 100); 
        marcoCasillaVerificacion.setVisible(true);
    }
}
