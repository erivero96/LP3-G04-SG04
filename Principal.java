import java.util.Scanner;

public class Principal {
    public static void main(String[] args ) {
        int vida, rp;
        boolean fl = false;
        String premio = "nada";
        vida = 0;
        Scanner sc = new Scanner(System.in);
        do {
            vida++;
            System.out.println("Vida: "+ vida + "\tCual es el numero secreto? ");
            rp = sc.nextInt();
            if (rp == 200)
                fl = true;
        } while(vida < 2 && !fl);

        if( fl == true)
        {
            System.out.println("Adivinaste!!!!");
            System.out.println("Ganaste tu gran premio: " + premio);
        }

        else
            System.out.println("ups, perdiste");
    }    
}