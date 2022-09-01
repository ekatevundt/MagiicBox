public class Main {
    public static  void main(String[] args) throws Exception {
        MagicBox <String> magicBox1 = new MagicBox<>(3);
        magicBox1.add("Cat");
        magicBox1.add("Dog");
        magicBox1.add("Frog");;
        magicBox1.pick();
        MagicBox <Integer> magicBox2 = new MagicBox<>(5);
        magicBox2.add(2);
        magicBox2.add(3);
        magicBox2.add(8);
        magicBox2.pick();


    }
}