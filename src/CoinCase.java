import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class CoinCase {

    private Map<Integer,Integer> map;

    CoinCase() {
        // Mapの初期化
        map = new HashMap<>();
        map.put(1,0);
        map.put(5,0);
        map.put(10,0);
        map.put(50,0);
        map.put(100,0);
        map.put(500,0);
    }

    //コインを追加する関数
    public void AddCoin(int order,int num){
        map.put(order,map.get(order) + num);
    }

    //コインを表示する関数
    public void ShowCoins(){
        Stream<Map.Entry<Integer,Integer>> stream = map.entrySet().stream();
        stream.forEach(e -> System.out.println(e.getKey() + ":" + e.getValue()));
    }

    //コイン枚数の合計を表示する関数
    public void GetCount(){
        int sum = map.values().stream().reduce(0, Integer::sum);
        System.out.println("コインの合計枚数：" + sum);
    }

    //ケースに入っているコインの種類と金額を表示
    public void GetDetail(){
        Stream<Map.Entry<Integer,Integer>> stream = map.entrySet().stream();
        stream.forEach(e -> System.out.println(e.getKey() + ":" + e.getKey() * e.getValue()));
    }

    //コインケース内の合計金額を表示
    public void GetAmount() {
//        int total = 0;
//
//        for(int i = 0;i<Coins.length;i++){
//            while(Coins[i] > 0){
//                total += map.get(i);
//                Coins[i]--;
//            }
//        }
//        System.out.println(total);
//    }
    }
}
