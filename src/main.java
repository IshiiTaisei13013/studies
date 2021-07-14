import java.util.Scanner;


public class main {
    public static void main(String... args){

        String name = "Hero";
        WorldMap map = new WorldMap(20,20);
        Player player = new Player(0,0,name,10,10,5,5,4);
        Scanner scanner = new Scanner(System.in);

        while(player.dead == false){
            //入力受け取り
            String input_text = scanner.nextLine();

            //プレイヤー移動
            player.move(KeyBindings.inputToCommand(input_text));

            //マップ更新
            map.updateMap(player.pos_y, player.pos_x, WorldMap.WorldObj.PLAYER);

            //マップ表示
            map.dispMap();
        }

    }


}
