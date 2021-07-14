import java.util.Arrays;

public class WorldMap {

    public WorldObj[][] world;

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
        //壁を囲む
        for(int i = 0;i<size_y;i++){
            for(int j = 0;j<size_x;j++){
                if(i == 0 || j == 0) {
                    world[i][j] = WorldObj.WALL;
                }
            }
        }
    }

    //指定した座標のシンボルを上書きする
    public void updateMap(int pos_y,int pos_x,WorldObj obj){
        world [pos_y][pos_x] = obj;
    }

    //マップを表示する関数
    public void dispMap(){

        //マップの大きさを取得
        int size_y = world.length;
        int size_x = world[0].length;

        for(int i = 0; i<size_y; i++){
            for(int j = 0; j<size_x; j++){
                switch(world[i][j]){
                    case ROAD:
                        System.out.print(" ");
                        break;
                    case WALL:
                        System.out.print("■");
                        break;
                    case PLAYER:
                        System.out.print("@");
                        break;
                    case GOAL:
                        System.out.print("G");
                        break;
                    default:
                        System.out.print("E");
                        break;
                }
            }
            System.out.println();
        }
    }
}
