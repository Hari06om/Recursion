import java.util.Scanner;

public class printincreorder {

    public static void  printinc(int a ){
        if(a ==1){
            System.out.print(a + " ");
            return;
        }
            printinc(a-1);
            System.out.print(a+ " ");
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        printinc(a);

    }
}
