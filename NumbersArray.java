import java.util.*;

public class NumbersArray {
    public static void main(String[] args) {
        Integer[] input = {1,2,3,4,1,5};

        System.out.println("Input : " + Arrays.toString(input));
        System.out.println("Max number : " + findMax(input));
        System.out.println("Duplicate numbers : " + Arrays.toString(findDuplicates(input)));
        System.out.println("Unique numbers : " + Arrays.toString(findUnique(input)));       
        
        System.out.println();

        input = new Integer[] {1,2,3,4,1,2,5,3};

        System.out.println("Input : " + Arrays.toString(input));
        System.out.println("Max number : " + findMax(input));
        System.out.println("Duplicate numbers : " + Arrays.toString(findDuplicates(input)));
        System.out.println("Unique numbers : " + Arrays.toString(findUnique(input))); 
    }
    public static int findMax(Integer[] num) {
        int max = -1; 
        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i]; 
            }
        }

        return max; 
    }

    public static Integer[] findDuplicates(Integer[] numbers) {

        int count = 0; 
        Integer[] res; 
        int resCount = 0; 
        
        for (int i = 0; i < numbers.length; i++) { 
            for (int k = i + 1; k < numbers.length; k++) {
                if (numbers[i] == numbers[k]) {
                    count++; 
                }
            } 
        }

        res = new Integer[count]; 
        for (int m = 0; m < numbers.length; m++) {
            boolean alrStored = false;
             for (int l = 1 + m; l < numbers.length; l++) {
                if (numbers[m] == numbers[l]) {
                    alrStored = true; 
                }
            } 
            if (alrStored) {
                res[resCount++] = numbers[m]; 
            }
        }


        return res; 
    }

   public static Integer[] findUnique(Integer[] numbers) {

        int count = 0; 
        Integer[] res; 
        int resCount = 0; 
        
        for (int i = 0; i < numbers.length; i++) { 
            int foundDup = 0; 
     
            for (int k = 0; k < numbers.length; k++) {
                if (numbers[i] == numbers[k]) {
                    foundDup++; 
                }
            } 
            if (foundDup == 1) {
                count++; 
            }
        }

        res = new Integer[count]; 
        for (int m = 0; m < numbers.length; m++) {
            int alrStored = 0;
             for (int l = 0; l < numbers.length; l++) {
                if (numbers[m] == numbers[l]) {
                    alrStored++; 
                }
            } 
            if (alrStored == 1) {
                res[resCount++] = numbers[m]; 
            }
        }


        return res; 
    }
    
}

