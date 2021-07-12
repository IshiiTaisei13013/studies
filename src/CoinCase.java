import java.util.HashMap;
import java.util.Map;

public class CoinCase {

    private int[] Coins = new int[6];
    private static final Map<Integer,Integer> map;

    //最初にコインを定義
    static {
        map = new HashMap<>();
        map.put(0,1);
        map.put(1,5);
        map.put(2,10);
        map.put(3,50);
        map.put(4,100);
        map.put(5,500);
    }

    //コインを追加する関数
    public void AddCoin(int order,int num){
        Coins[order] += num;
    }

    //コインを表示する関数
    public void ShowCoins(){
        for(int i=0;i<Coins.length;i++){
            System.out.println(map.get(i) + ":" + Coins[i]);
        }
    }

    //コイン全部を表示する関数
    public void GetCount(int order){
        System.out.println(Coins[order]);
//        return Coins[order];
    }

    public void GetAmount(){
        int total = 0;

        for(int i = 0;i<Coins.length;i++){
            while(Coins[i] > 0){
                total += map.get(i);
                Coins[i]--;
            }
        }
        System.out.println(total);
//        return total;
    }
}
