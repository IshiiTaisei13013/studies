import java.util.Scanner;


public class main {
    public static void main(String... args){

        String name = "Hero";
        WorldMap map = new WorldMap(5,20);
        Player player = new Player(3,3,name,10,10,5,5,4);
        Scanner scanner = new Scanner(System.in);

        //マップ表示
        map.dispMap();

        //死ぬまで終わらない
        while(player.dead == false){
            //入力受け取り
            String input_text = scanner.nextLine();

            //プレイヤー移動
            player.move(KeyBindings.inputToCommand(input_text),map);

            //マップ表示
            map.dispMap();
        }

        scanner.close();

    }


}
