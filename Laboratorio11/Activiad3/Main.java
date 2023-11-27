public class Main4 {
    public static void main(String[] args) {
        Bag<Goodies> bag = new Bag(5);

       Goodies goodies = new Goodies(1, "Chocolate", 1.5f);
       Biscuits biscuits = new Biscuits(2, "Galleta", 0.5f, 1);
       Sweet sweet = new Sweet(3, "Caramelo", 0.1f, 1, 1);
       Soda soda = new Soda(3, "Sin Azucar", 1.5f, 1, "Fanta");
       Chocolates chocolate = new Chocolates(0, "DSODS", 1.5f, "de Peru" );
    
       try{
            bag.add(goodies);
            bag.add(biscuits);
            bag.add(sweet);
            bag.add(soda);
            bag.add(chocolate);
            System.out.println(bag.getIndexOf(chocolate));
            System.out.println(bag.getObjects());
            

            System.out.println(bag.toString());
            bag.remove(chocolate);
       } catch (Exception e) {
           System.out.println(e.getMessage());}

            
    }
}
