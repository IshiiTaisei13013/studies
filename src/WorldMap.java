import java.util.Arrays;

public class WorldMap {

    private int map_size_x;
    private int map_size_y;
    public WorldObj[][] world;

    public static enum WorldObj{
        ROAD,
        WALL,
        PLAYER,
        GOAL
    };

    //コンストラクタ
    WorldMap(int size_y,int size_x){
        map_size_x = size_x;
        map_size_y = size_y;
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
                //画面端を壁にする
                if(i == 0 || j == 0 || i == (size_y - 1) || j == (size_x - 1) ){
                    world[i][j] = WorldObj.WALL;
                }
            }
        }
    }

    //指定した座標のシンボルを上書きする
    public void updateMap(int posY,int posX,WorldObj obj){
        world [posY][posX] = obj;
    }

    //マップを表示する関数
    public void dispMap(){
        for(int i = 0; i<map_size_y; i++){
            for(int j = 0; j<map_size_x; j++){
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
