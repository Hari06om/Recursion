import java.util.*;
public class fabonacci{

    public static int fab(int a){
        if(a == 0 || a ==1){
            return a;
        }
        int fb1 = fab(a-1);
        int fb2 = fab(a-2);

        int fn = fb1 + fb2;
        return fn;
        
    }
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
            System.out.print(fab(a));

    }

}