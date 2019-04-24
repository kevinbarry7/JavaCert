public class Break1 {
    public static void main(String[] args) {
        int[][] list = {{1, 13, 5}, {1,2,5}, {2,7,2}};
        int searchValue = 2;
        int positionX = -1;
        int positionY = -1;

        PARENT_LOOP: for(int i = 0; i<list.length; i++) {
            for(int j = 0; j<list[i].length; j++) {
                if(list[i][j]==searchValue){
                    positionX = i;
                    positionY = j;
                    break PARENT_LOOP;
                }
            }
        }
        if(positionX== -1 || positionY== -1) {
            System.out.println("Value " + searchValue+" not found");
        } else {
            System.out.println("Value "+ searchValue+" found at: " + "("+positionX+","+positionY+")");

        }

        byte x1 = 5;
        byte y = 10;
        int z = x1 + y;
        System.out.println(z);

        // int x = 0;
        // while (x++ < 10) {}
        // String message = x>10 ? "Greater than": false;
        // System.out.println(message+","+x);

        long x2 = 10;
        int y2 = 2 * (int)x2;

        java.util.List<Integer> list1 = new java.util.ArrayList<Integer>();
        list1.add(10);
        list1.add(14);
        for(int x3 : list1) {
            System.out.println(x3 + ", ");
            break;
        }

        String s1 = "1";
        String s2 = s1.concat("2");
        System.out.println("S2 is " +s2);
        s2.concat("3");
        System.out.println("S2 is " +s2);





        
    }
}