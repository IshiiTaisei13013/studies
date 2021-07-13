public class main {
    public static void main(String args[]){

        CoinCase Yen = new CoinCase();

        Yen.AddCoin(1,4);
        Yen.AddCoin(5,3);
        Yen.AddCoin(500,1);
        Yen.AddCoin(100,2);

        Yen.ShowCoins();

        Yen.GetCount();
        Yen.GetDetail();

        Yen.GetAmount();


    }
}
