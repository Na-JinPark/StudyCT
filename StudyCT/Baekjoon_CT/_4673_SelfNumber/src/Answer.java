import java.util.ArrayList;
import java.util.HashMap;
public class Answer {

    public static void num(HashMap madenum, Integer i){
        ArrayList<Integer> numlist = new ArrayList<>();
        int result = i;
        int cnt = i;

        do{
            numlist.add(cnt%10);
            cnt= cnt/10;
        }while(cnt != 0);

        for (int j = 0; j < numlist.size(); j++) {
            result +=numlist.get(j);
        }

        if(!madenum.containsKey(i)) madenum.put(i,0);
        if(!madenum.containsKey(result)) madenum.put(result,1);
    }

    public static void main(String[] args) {

        HashMap<Integer,Integer> madenum = new HashMap();
        for (int i = 1; i <= 10000; i++) {
            num(madenum, i);
        }
        madenum.entrySet().stream().filter(x-> x.getValue().equals(0) && x.getKey() < 10000)
                          .forEach(x->{  System.out.println(x.getKey()); });
    }
}