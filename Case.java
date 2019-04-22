public class Case {
    public static void main(String[] args) {
        int dayOfWeek = 6;
        switch(dayOfWeek) {
            default:
            System.out.println("Weekday");
            break;
            case 0:
            System.out.println("Sunday");
            break;
            case 6:
            System.out.println("Saturday");
            break;
        }
    }
}