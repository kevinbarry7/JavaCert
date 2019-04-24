public class ForEach{
    public static void main(String[] args) {
        final String[] names = new String[3];
        names[0] = "Lisa";
        names[1] = "Kevin";
        names[2] = "April";

        for(String name: names) {
            System.out.print(name + ", ");
        }

        int x = 20;
        while(x>0) {
            do {
                x -= 2;
            } while (x>5);
            x--;
            System.out.print(x + "\t");
        }
    }
}