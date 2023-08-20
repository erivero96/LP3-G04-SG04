import java.util.Scanner;

public class Principal {
    public static void main(String[] args ) {
        int vida, rp;
        boolean fl = false;
        vida = 0;
        Scanner sc = new Scanner(System.in);
        do {
            vida++;
            System.out.println("Vida: "+ vida + "\tCual es el numero secreto? ");
            rp = sc.nextInt();
            if (rp == 200)
                fl = true;
        } while(vida < 5 && !fl);

        if( fl == true)
        {
            System.out.println("Adivinaste!!!!");
            System.out.println("Ganaste tu premio(nada)");
            System.out.println("Primer Commit");
        }

        else
            System.out.println("ups, perdiste");
    }    
}