import java.util.Scanner;


public class main {
    public static void main(String... args){

        String name = "Hero";
        WorldMap map = new WorldMap(20,20);
        Player player = new Player(0,0,name,10,10,5,5,4);
        Scanner scanner = new Scanner(System.in);


        while(player.dead){
            String input_text = scanner.nextLine();

            player.move(KeyBindings.inputToCommand(input_text));

        }

    }


}
