public class Statements {
    public static void main(String[] args) {
        int hourOfDay = 3;
        if(hourOfDay == 5) {
            System.out.println("Good evening!!!");
        } else if(hourOfDay < 5) {
            System.out.println("Good afternoon!!");}
        System.out.println("Hey");
        System.out.println("Hey");

        int y = 10;
        //int x;
        if(y > 5){
            x = 2 * y;
        } else {
            x = 3 * y;
        }

        int y1 = 10;
        int x1 = (y1 > 10)? (2 * y1) : (3 * y1);
        System.out.println(x1);

    }
}