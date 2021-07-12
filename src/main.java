public class main {
    public static void main(String args[]){

        CoinCase Yen = new CoinCase();

        Yen.AddCoin(1,4);
        Yen.AddCoin(2,3);
        Yen.AddCoin(5,1);
        Yen.AddCoin(0,2);

        Yen.ShowCoins();

        Yen.GetCount();


        Yen.GetAmount();


    }
}
