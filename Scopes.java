public class Scopes {
    private String name;
    //static String name = "rob";

    public static void main(String[] args) {
        for(int i = 0; i <10; i++){
            String name = "john";
        }
        String name = "bob";
        System.out.println(name);
        
    }
}