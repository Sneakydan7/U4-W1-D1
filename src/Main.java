import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int a = 8;
        int b = 9;
        System.out.println(multiply(a , b));

        System.out.println(concatenate("Quack" , 9));

       String[] arr = pushArray(new String[]{"uno" , "due" , "tre" ,"quattro" , "cinque"} , "eccolo");
       System.out.println(Arrays.toString(arr));


    }


    public static int multiply(int a , int b){
        return a*b;
    }

    public static String concatenate(String str, int num){
        return  str + num ;
    }

    public static String[] pushArray(String[] arr , String str){
        String[] array = new String[6];
        for (int i = 0; i < arr.length + 1 ; i++) {
            if(i < 2) {
                array[i] =  arr[i];
            } else if(i == 2) {
                array[i] = str;
            } else {
                array[i] = arr[i - 1];
            }
        }return array;
}
}