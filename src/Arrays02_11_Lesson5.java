import java.util.Arrays;

public class Arrays02_11_Lesson5 {

    public static void main(String[] arg) {

        int a = 1;
        int b = 2;

        int[] array = {1, 2, 3, 4, 50, -1};
        //System.out.println(array[3]);



           array[1] = 6;

           for( int i = 0; i < array.length; i++){
               array[i] = array[i] + 1;
               System.out.println(array[i]);
           }
        System.out.println( Arrays.toString(array));
        System.out.println( array.length);

        int[] arr1 = {15, 20, 30};
        int[] arr2 = arr1;
        arr2[1] = 25;
        System.out.println(Arrays.toString(arr1));

        System.out.println(Arrays.toString(arr2));

        String str1 = "Hello world!";

        String str2 = str1.replace('l', '-');
        System.out.println(str1.charAt(2));
        String str3 = str1.substring(2,7);//"последний, 7й не включает"
        System.out.println(str3);
        System.out.println(str1);
        System.out.println(str2);

        System.out.println(arr1.length);

        int[] arr = new int[100];
        for(int i = 1; i < arr.length; i++){
            arr[i] = i++;
        }
        System.out.println(Arrays.toString(arr));
    }

}

