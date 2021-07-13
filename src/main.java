public class main {
    public static void main(String... args){

        //宣言
        CoinCase Yen = new CoinCase();

        //コインを追加
        Yen.AddCoin(1,4);
        Yen.AddCoin(5,3);
        Yen.AddCoin(10,5);
        Yen.AddCoin(50,2);
        Yen.AddCoin(100,2);
        Yen.AddCoin(500,1);

        //コインケースを表示
        Yen.ShowCoins();

        //合計枚数を表示
        Yen.GetCount();

        //コインごとの内訳金額を表示
        Yen.GetDetail();

        //総額を表示
        Yen.GetAmount();


    }
}
