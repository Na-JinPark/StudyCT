import java.util.*;

public class Main {
    public static Boolean groupwordchk(String chk){
        String[] word = chk.split("");
        Set check = new HashSet();
        String beforewo = "";
        for(String wo : word){
            if(beforewo.equals(wo)) continue;
            if(!check.contains((wo))) check.add(wo);
            else return  false;
            beforewo = wo;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int result = 0;
        sc.nextLine();
        for (int i = 0; i < cnt; i++) {
            String chk = sc.nextLine();
            if(groupwordchk(chk)) result ++;
        }
        System.out.println(result);
    }
}