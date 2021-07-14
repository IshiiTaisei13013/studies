import java.util.Arrays;

public class WorldMap {

    WorldObj[][] world;

    public static enum WorldObj{
        ROAD,
        WALL,
        PLAYER,
        GOAL
    };

    //コンストラクタ
    WorldMap(int size_y,int size_x){
        world = new WorldObj[size_y][size_x];

        //全部を道にする。
        for(int i = 0;i<size_y;i++){
            for(int j = 0;j<size_x;j++){
                world[i][j] = WorldObj.ROAD;
            }
        }
    }

    //マップを表示する関数
    public void DispMap(){

        //マップの大きさを取得
        int size_y = world.length;
        int size_x = world[0].length;

        for(int i = 0; i<size_y; i++){
            for(int j = 0; j<size_x; j++){
                switch(world[i][j]){
                    case ROAD:
                        System.out.println(" ");
                        break;
                    case WALL:
                        System.out.println("■");
                        break;
                    case PLAYER:
                        System.out.println("@");
                        break;
                    case GOAL:
                        System.out.println("G");
                        break;
                    default:
                        System.out.println("E");
                        break;
                }
            }
        }
    }
}
