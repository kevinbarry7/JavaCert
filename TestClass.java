import java.io.File;

public class TestClass {
    public static void main(String[] args) {
        //float value1 = 102;
        //float value2 = (int) 102.0;
        //float value3 = 1f * 0.0f;
        //float value4 = 1f * (short)0.0;
        //float value5 = 1f * (boolean)0;
        short x = 10;
        short y = 3;
        System.out.println(x + y);

        boolean z = true;
        System.out.println(z);
        z = !z;
        System.out.println(z);

        boolean a = true;
        boolean b = false;
        System.out.println(a ^ b);

        //boolean c = false;
        //boolean d = (c = true);
        //System.out.println(d);

        File x1 = new File("myFile.txt");
        File y1 = new File("myFile.txt");
        File z1 = x1;
        System.out.println(x1 == y1);
        System.out.println(x1 == z1);
    }
}