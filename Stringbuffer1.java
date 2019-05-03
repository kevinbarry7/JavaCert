public class Stringbuffer1 {
    public static void main(String[] args) {
        String alpha = "";
        for(char current = 'a'; current <= 'z'; current++) {
            alpha += current;
            
        }System.out.print(alpha);
        System.out.println();
        System.out.println("_________________________");

        StringBuilder alpha1 = new StringBuilder();
        for(char current1 = 'a'; current1 <= 'z'; current1++) {
            alpha1.append(current1);
            System.out.print(alpha1);
            
        }
        System.out.println();
        System.out.println("_________________________");

        StringBuilder sb = new StringBuilder("start");
        sb.append("+middle");
        StringBuilder same = sb.append("+end");
        System.out.println(same);
        System.out.println(sb); //both same and sb point to the same object
        if(same == sb) {
            System.out.println("Same and Sb are the same object.");
        }
        System.out.println("_________________________");
        StringBuilder a = new StringBuilder("abc");
        StringBuilder b = a.append("de");
        b = b.append("f").append("g");
        System.out.println("a= " + a);
        System.out.println("b= " + b);
        System.out.println("_________________________");

        // 3 ways to construct a StringBuilder

        //StringBuilder sb1 = new StringBuilder();
        //StringBuilder sb2 = new StringBuilder("animal");
        //StringBuilder sb3 = new StringBuilder(10);

        System.out.println("_________________________");
        StringBuilder sb4 = new StringBuilder("animals");
        String sub = sb4.substring(sb4.indexOf("a"), sb4.indexOf("al"));
        int len = sb4.length();
        char ch = sb4.charAt(6);
        System.out.println(sub + " " + len + " " + ch);
        System.out.println("_________________________");

        //append()
        StringBuilder sb5 = new StringBuilder().append(1).append('c');
        sb5.append("-").append(true);
        System.out.println(sb5);
        System.out.println("_________________________");

        //insert()
        StringBuilder sb6 = new StringBuilder("animals");
        sb6.insert(7, "-");
        sb6.insert(0, "-");
        sb6.insert(4, "-");
        System.out.println(sb6);
        System.out.println("_________________________");

        //delete and deleteCharAt()
        StringBuilder sb7 = new StringBuilder("abcdef");
        sb7.delete(1, 3);
        sb7.deleteCharAt(2);
        System.out.println(sb7);
        System.out.println("_________________________");

        //reverse()
        StringBuilder sb8 = new StringBuilder("ABC");
        sb8.reverse();
        System.out.println(sb8);
        System.out.println("_________________________");

        //toString()

        String s = sb8.toString();
        System.out.println(s);
        System.out.println("_________________________");

        //understanding equality

        StringBuilder one = new StringBuilder();
        StringBuilder two = new StringBuilder();
        StringBuilder three = one.append("a");
        System.out.println(one == two);
        System.out.println(one == three);
        System.out.println("_________________________");

        //object equality

        String x = "Hello World";
        String y = "Hello World";
        System.out.println(x == y);

        String x1 = new String("Hello World");
        String y1 = "Hello World";
        System.out.println(x1 == y1);

        //logical equality

        String x2 = "Hello World";
        String y2 = " Hello World ".trim();
        System.out.println(x2.equals(y2));








    }
}