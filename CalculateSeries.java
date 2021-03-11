import java.util.*;

public class CalculateSeries {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        // ArrayList<Integer> arr = new ArrayList<>();
        //     int even =0;
        //     int odd =1;
        //     for (int i = 0; i <n; i++) {
        //        if(i==0)
        //             arr.add(0);
        //         else if(i==1)
        //             arr.add(0);
        //         else if((i&1) !=1){
        //             even+=2;
        //             arr.add(even);
        //         }
        //         else if(i == 3){
        //             arr.add(odd);
        //         }
        //         else if((i&1)==1){
        //             odd+=2;
        //             arr.add(odd);
        //         }

        //     }
      
        // System.out.println(arr.get(n-1));

        // second way 
        if(n==0 || n==1)
            System.out.println(0);
        else if((n&1)!=1)
            System.out.println(n-3);
        else if((n&1)==1)
            System.out.println(n-1);

        scan.close();
    }
}