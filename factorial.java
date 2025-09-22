import java.util.*;
public class factorial {


    public static int fact(int a){

        if( a==0){
            return 1;
        }
        int fn01 =  fact(a-1);

        int fn= a*fact(a-1);
        return fn;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();

        System.out.print(fact(a));
    }
}
