import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){
        Scanner scanning = new Scanner(System.in);
        String[] strInput = new String[3];
        strInput[0] = scanning.nextLine();
        strInput[1] = scanning.nextLine();
        strInput[2]= scanning.nextLine();
        System.out.println(strInput[0]+ strInput[1] + strInput[2] );
        System.out.println(strInput[2] + strInput[1] + strInput[0]);
    }


}
