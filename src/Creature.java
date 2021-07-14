public class Creature extends Actor{

    String name;

    private int hp;
    private int mp;
    private int atk;
    private int def;
    private int spd;

    boolean dead;

    //移動用のコマンド
    public static enum MoveCommand{
        UP,
        DOWN,
        LEFT,
        RIGHT
    };

    //コンストラクタ
    Creature (
            int pos_y,int pos_x, //場所
            String new_name,     //名前
            int new_hp,int new_mp,int new_atk,int new_def,int new_spd //ステータス周り
    ){
        super(pos_y,pos_x);

        //各種初期化
        name = new_name;
        hp = new_hp;
        mp = new_mp;
        atk = new_atk;
        def = new_def;
        spd = new_spd;

        //生まれたときは生きている
        dead = false;
    }

    //クリーチャーの移動と当たり判定を行っている
    public void move(MoveCommand com,WorldMap w){
        switch(com){
            case UP:
                //壁があるか？
                if(w.world[pos_y - 1][pos_x] != WorldMap.WorldObj.WALL){
                    //自分がいた地点を道にする
                    w.updateMap(pos_y,pos_x, WorldMap.WorldObj.ROAD);

                    pos_y--;

                    //移動する
                    w.updateMap(pos_y,pos_x, WorldMap.WorldObj.PLAYER);
                }
                break;
            case DOWN:
                //壁があるか？
                if(w.world[pos_y + 1][pos_x] != WorldMap.WorldObj.WALL){
                    //自分がいた地点を道にする
                    w.updateMap(pos_y,pos_x, WorldMap.WorldObj.ROAD);

                    pos_y++;

                    //移動する
                    w.updateMap(pos_y,pos_x, WorldMap.WorldObj.PLAYER);
                }
                break;
            case LEFT:
                //壁があるか？
                if(w.world[pos_y][pos_x - 1] != WorldMap.WorldObj.WALL){
                    //自分がいた地点を道にする
                    w.updateMap(pos_y,pos_x, WorldMap.WorldObj.ROAD);

                    pos_x--;

                    //移動する
                    w.updateMap(pos_y,pos_x, WorldMap.WorldObj.PLAYER);
                }
                break;
            case RIGHT:
                //壁があるか？
                if(w.world[pos_y][pos_x + 1] != WorldMap.WorldObj.WALL){
                    //自分がいた地点を道にする
                    w.updateMap(pos_y,pos_x, WorldMap.WorldObj.ROAD);

                    pos_x++;

                    //移動する
                    w.updateMap(pos_y,pos_x, WorldMap.WorldObj.PLAYER);
                }
                break;
        }
    }

}
