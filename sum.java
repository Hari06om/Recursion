import java.util.*;

public class sum {
    public static int sm(int a){
        if(a==1){
            return 1;
        }
           int sm1 = sm(a-1);
           int smn = a + sm1;
           return smn;
        
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print(sm(a));
    }

    
}