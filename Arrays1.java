import java.util.*;
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

        String [][] rectangle = new String[3][2];
        rectangle[0][1] = "set";
        System.out.println(rectangle[0][1]);
        System.out.println("_________________________");

        int[][] twoD = new int[3] [2];
        for(int i = 0; i < twoD.length; i++){
            for(int j = 0; j < twoD[i].length; j++)
                System.out.print(twoD[i][j] + " ");
            System.out.println();
        }
        System.out.println("_________________________");

        int [][] twoDs = new int[4][2];
        for(int[] inner : twoDs) {
            for(int num: inner)
                System.out.print(num + " ");
            System.out.println();
        }
        System.out.println("_________________________");

        ArrayList list1 = new ArrayList(); //old declaration but still valid
        ArrayList list2 = new ArrayList(10); //old declaration but still valid
        ArrayList list3 = new ArrayList(list2); //old declaration but still valid

        ArrayList<String> list4 = new ArrayList<String>(); //current preferred declaration
        ArrayList<String> list5 = new ArrayList<>(); //also a version of the current preferred dec

        ArrayList list = new ArrayList<>();
        list.add("hawk");
        list.add(Boolean.TRUE);
        list.add('1');
        System.out.println(list);
        System.out.println("_________________________");

        ArrayList<String> safer = new ArrayList<>();

        //add() // add method

        safer.add("sparrow");
        //safer.add(Boolean.TRUE); //won't compile since safer is defined as String

        List<String> birds = new ArrayList<>();
        birds.add("hawk");
        birds.add(1, "robin");
        birds.add(0, "blue jay");
        birds.add(1, "cardinal");
        System.out.println(birds);

        //remove() // remove method

        birds.add("thrush");
        birds.add("thrush");
        System.out.println(birds);
        birds.remove("thrush");
        System.out.println(birds.remove("hawk"));
        System.out.println(birds.remove(1));
        System.out.println(birds);

        //set()
        ArrayList<String> bird = new ArrayList<>();
        bird.add("hawk");
        System.out.println(bird.size());
        bird.set(0, "black bird");
        //bird.set(1, "thrush"); //won't compile, IndexOutOfBoundsException
        System.out.println(bird);

        System.out.println(bird.isEmpty()); //isEmpty()
        System.out.println(bird.size()); //size()
        System.out.println(bird.contains("black bird")); //contains()
        System.out.println(bird.contains("robin"));
        

        bird.clear();
        System.out.println(bird.isEmpty()); //isEmpty()
        System.out.println(bird.size()); //size()

















    }
}