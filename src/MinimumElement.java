import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {

    public static void main(String[] args) {

int[] arrayOfNumbers = readIntegers();
       System.out.println(Arrays.toString(arrayOfNumbers));
      System.out.println(findMin(arrayOfNumbers));

reverse(arrayOfNumbers);





    }

    public  static int[]  readIntegers(){

        Scanner scanner = new Scanner(System.in);

            System.out.println("Enter a list of Integers separated by commas");

            String input = scanner.nextLine();

String[] splits = input.split(",");
        int[] arrayIntegers =new int[splits.length];
for (int i= 0;i< splits.length;i++){

    arrayIntegers[i] = Integer.parseInt(splits[i].trim());

}
return arrayIntegers;
        }

        public static int findMin(int... array){

//        int temp =0;
//
//           for (int i=0; i<array.length-1;i++){
//               if (array[i]<array[i+1]){
//                   temp = array[i];
//                   array[i+1]=array[i];
//
//               }
//
//               else{
//                   temp=array[i+1];
//               }
//
//           }
//return temp;

            int min = Integer.MAX_VALUE; //This is another way of getting a minimum value and i could also sort and get the first element
            for (int element : array){

                if(element < min){
                    min = element;
                }

            }
      return min;
       }


       private static void reverse (int[] array){

        int maxIndex = array.length - 1;
                int halfLength = array.length/2;

                for(int i =0; i<halfLength;i++){

                    int temp = array[i];

                    array[i]= array[maxIndex-i];
                    array[maxIndex -i]= temp;

                    System.out.println(Arrays.toString(array));
                }

             }
           }










