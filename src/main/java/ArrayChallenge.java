import java.util.Arrays;
import java.util.Scanner;

public class ArrayChallenge {



    public static void main(String[] args) {

        int[] unsortedArray = getIntegers(3);
        printArray(unsortedArray);
        int[] sortedArray = sortIntegers(unsortedArray);
        System.out.println(Arrays.toString(sortedArray));

//   int[] unsortedArray = getRandomNumbers(3);
//        System.out.println("--->"+ Arrays.toString(unsortedArray));
//
//        int[]sortedArray = sortIntegers(unsortedArray);
//        System.out.println("--->"+ Arrays.toString(sortedArray));
    }


//    public static int[] getRandomNumbers(int len) {
//
//Random random = new Random();
//int[] randomArray = new  int[len];
//for (int i=0;i<len;i++){
//    randomArray[i]= random.nextInt(1000);
//
//}
//return randomArray;
//        }



//public static int[] sortIntegers (int[] array) {
//    int[] sortedArray = Arrays.copyOf(array, array.length);
//    boolean flag = true;
//    int temp = 0;
//
//    while (flag) {
//        flag = false;
//        for (int i = 0; i < sortedArray.length ; i++) {
//            System.out.println(i);
//            if (sortedArray[i] < sortedArray[i + 1]) {
//                System.out.println(sortedArray[i]);
//                System.out.println(sortedArray[i+1]);
//                temp = sortedArray[i];
//                sortedArray[i] = sortedArray[i + 1];
//                sortedArray[i + 1] = temp;
//                flag = true;
//
//            }
//
//        }
//
//
//    }
//    return sortedArray;
//}



        public static int[] getIntegers(int len){
            int[] userInput = new int[len];
            Scanner scanner = new Scanner(System.in);
            for(int i=0; i<len; i++ ){


                System.out.println("Enter your array number");
                userInput[i]= scanner.nextInt();


            }
            System.out.println("User Input Array "+ Arrays.toString(userInput));
            return userInput;

        }

        public static void printArray(int[] array){
            int index=0;

            for(int element: array){

                System.out.println("Element"+ index +" contents "+element);
                index++;
            }
        }
        public static int[] sortIntegers(int[] array){

            int[] sortedArray = Arrays.copyOf(array, array.length);
            System.out.println( "Copy of the unsorted Array "+ Arrays.toString(sortedArray));

            boolean flag = true;
            int temp =0;

            while(flag){

                flag=false;
                for(int i=0; i<sortedArray.length-1; i++){
                    if(sortedArray[i]<sortedArray[i+1]){

                        temp= sortedArray[i];
                        sortedArray[i]= sortedArray[i+1];
                        sortedArray[i+1]=temp;
                        flag=true;
                    }
                }

            }
            System.out.println("Sorted Array "+ Arrays.toString(sortedArray));
            return sortedArray;




        }

    }






