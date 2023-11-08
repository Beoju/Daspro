package Jobsheet8;

public class ArrayBilangan02{
    public static void main(String[] args) {
        int [] bil = new int [4];
        
        bil [0] = 5; 
        bil [1] = 13;
        bil [2] = -7;
        bil [3] = 17;
        
        // bil [0] = 5.0; 
        // bil [1] = 12867;
        // bil [2] = 7.5;
        // bil [3] = 2000000;

        // int[] bil = {5.0, 12867, 7.5, 2000000};

        System.out.println(bil[0]);
        System.out.println(bil[1]);
        System.out.println(bil[2]);
        System.out.println(bil[3]);
        
        for (int i = 0; i < 4; i++) {
            System.out.println(bil[i]);
        }


    }
    
}
