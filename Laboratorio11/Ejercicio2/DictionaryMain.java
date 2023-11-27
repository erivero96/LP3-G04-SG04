public class DictionaryMain {
    public static void main(String[] args) {
        Dictionary<String, String, OrderedPair<String, String>> diccionario = new Dictionary<>();
        OrderedPair<String, String> par1 = new OrderedPair<>("Hola", "Hello");
        OrderedPair<String, String> par2 = new OrderedPair<>("Adios", "Goodbye");
        OrderedPair<String, String> par3 = new OrderedPair<>("Perro", "Dog");
        OrderedPair<String, String> par4 = new OrderedPair<>("Gato", "Cat");
        OrderedPair<String, String> par5 = new OrderedPair<>("Casa", "House");
        diccionario.add(par1);
        diccionario.add(par2);
        diccionario.add(par3);
        diccionario.add(par4);
        diccionario.add(par5);
        System.out.println(diccionario.toString());
        System.out.println(diccionario.getValue("Jose"));
        System.out.println(diccionario.delete("Perro"));
        System.out.println(diccionario.toString());
    }
}
