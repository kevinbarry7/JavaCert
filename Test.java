public class Test {
    private String str = new String("hello");
    public void print() {
        int i = 0;
        while(i++ < 10){
            System.out.println(this.str);
        }
    }
    public static void main(String[] args) {
        Test t = new Test();
        t.print();
    }
}