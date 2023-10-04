package ejercicio2;
public class Motor{
    private int numMotor;
    private int revPorMin;

    public Motor(int num, int rev){
      this.numMotor = num;
      this.revPorMin = rev;
    }
    public int getNumMotor(){
      return this.numMotor;
    }
    public int getRevPorMin(){
      return this.revPorMin;
    }

    public void setNumMotor(int numMotor) {
        this.numMotor = numMotor;
    }

    public void setRevPorMin(int revPorMin) {
        this.revPorMin = revPorMin;
    }
  }
