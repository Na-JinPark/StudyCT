import java.util.Scanner;
public class Main {
    public static boolean result (int num){
        int cnt = 0;
        for (int j = 2; j < num; j++) {
            if(num%j==0) {
                cnt++;
                break;
            }
        }
        if (cnt!=0) return true;
        else return  false;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int result = 0;
        for (int i =0; i < n; i++) {
            int num = input.nextInt();
            if(num==0 ||num==1)continue;
            if(!result(num)) result++;
        }
        System.out.println(result);

    }
}