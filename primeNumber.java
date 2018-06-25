
import java.util.Scanner;

public class hello{
    public static void main(String[] args){
        System.out.println("Please input the number between 0 and 9!");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[] arr = new int[num];
        int cnt = 0;
        OUT:
        for(int j = 2;cnt<num;j++){
            for(int k = 2;k<=j/2;k++){
                if(j%k==0){
                    continue OUT;
                }
            }
            arr[cnt++]=j;
        }
        for(int t= 0 ;t<num;t++){
            System.out.print(arr[t]+" ");
        }

    }
}
