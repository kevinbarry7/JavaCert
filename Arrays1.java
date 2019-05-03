import java.util.Arrays;
public class Arrays1 {
    public static void main(String[] args) {
        int[] numbers1 = new int[3];
        System.out.println(numbers1[0]);

        int[] numbers2 = new int[] {42, 55, 99};
        System.out.println(numbers2[1]);
        System.out.println("_________________________");

        int[] numbers3 = {42, 55, 99}; //declarations for numbers2 and numbers3 are identical

        // all the following are valid declarations

        int[] numAnimals;
        int [] numAnimals2;
        int numAnimals3[];
        int numAnimals4 [];

        int[] ids, types; // creates two arrays of type int[]
        int ids1[], types1; //create an int[] called ids1, and an int variable types1

        String [] bugs = {"cricket", "beetle", "ladybug"};
        int[] numbers = {1,2,3,4};
        String [] alias = bugs;
        System.out.println(bugs.equals(alias));
        System.out.println(numbers.toString());
        System.out.println(bugs.toString());
        System.out.println("_________________________");

        String[] strings = {"stringValue"}; //ok
        Object[] objects = strings; //ok, objects is a broader type than String
        String[] againStrings = (String[]) objects; 
        //againStrings[0] = new StringBuilder(); //won't compile againString[] on allows strings not StringBuilder
        //objects[0] = new StringBuilder();
        System.out.println("_________________________");

        String[] mammals = {"monkey", "chimp", "donkey"};
        System.out.println(mammals.length);
        System.out.println(mammals[0]);
        System.out.println(mammals[1]);
        System.out.println(mammals[2]);
        System.out.println();
        for(int i = 0; i < 3; i++){
            System.out.println(mammals[i]);
        }
        System.out.println("Done!!!");
        System.out.println("_________________________");

        int[] numbers4 = {6, 9, 1};
        Arrays.sort(numbers4);
        for(int z = 0; z < 3; z++) {
            System.out.print(numbers4[z] + " ");
        }
        System.out.println();
        System.out.println("_________________________");

        String[] strings1 = {"10", "9", "100"};
        Arrays.sort(strings1);
        for(String string: strings1){ //enhanced for loop
            System.out.println(string + " ");
        }
        System.out.println("_________________________");

        





    }
}