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

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("animal");
        StringBuilder sb3 = new StringBuilder(10);

        System.out.println("_________________________");
        StringBuilder sb4 = new StringBuilder("animals");
        String sub = sb4.substring(sb4.indexOf("a"), sb4.indexOf("al"));
        int len = sb4.length();
        char ch = sb4.charAt(6);
        System.out.println(sub + " " + len + " " + ch);








    }
}