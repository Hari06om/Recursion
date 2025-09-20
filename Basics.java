import java.util.*;

public class Basics {

    public static void printdec(int a){

        if(a == 1){
            System.out.print(a);
            return;
        }
        System.out.print(a + " ");
        printdec(a-1);
    }
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();

            printdec(a);
    }
}
