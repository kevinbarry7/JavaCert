public class Egg {
    public Egg() {
        number = 5;
    }
    public static void main(String[] args) {
        float Floats = 123.34f;
        int million1 = 1000000;
        int million2 = 1000_000;
        //String s = null;
        //String s1 = "1", s2;
        double amount = 0xE;
        //float value = 102.0f;



        String t = "hello";
        int len = t.length();
        System.out.println(len);
        //int y = null;


        Egg egg = new Egg();
        System.out.println(egg.number);
        System.out.println(0b11);
        System.out.println(017);
        System.out.println(0x12FF);
        System.out.println(Floats);
        System.out.println(million1);
        System.out.println(million2);
        System.out.println(amount);

    }

    private int number = 3;
    //System.out.println(number);
    {number = 4;}
}