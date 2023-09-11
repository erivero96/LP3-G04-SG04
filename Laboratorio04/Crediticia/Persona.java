public class Persona {
    private int sexo;
    private int trabajo;
    private int sueldo;

    Persona(int sexo, int trabajo, int sueldo) {
        this.sexo = sexo;
        this.trabajo = trabajo;
        if (trabajo == 1) {
            if (sueldo >= 950 && sueldo <= 3000) {
                this.sueldo = sueldo;
            } else {
                this.sueldo = 950;
            }
        } else {
            this.sueldo = 0;
        }
    }

    Persona() {
        this.sexo = (int) (Math.random() * 2) + 1;
        this.trabajo = (int) (Math.random() * 2) + 1;
        if (this.trabajo == 2) {
            this.sueldo = (int) (Math.random() * (3000 - 950 + 1)) + 950;
        } else {
            this.sueldo = 0;
        }
    }

    public int getSexo() {
        return sexo;
    }

    public int getTrabajo() {
        return trabajo;
    }

    public int getSueldo() {
        return sueldo;
    }
}
