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
            int posY,int posX, //場所
            String name,     //名前
            int hp,int mp,int atk,int def,int spd //ステータス周り
    ){
        super(posY,posX);

        //各種初期化
        this.name = name;
        this.hp = hp;
        this.mp = mp;
        this.atk = atk;
        this.def = def;
        this.spd = spd;
    }

    //クリーチャーの移動と当たり判定を行っている
    public void move(MoveCommand com,WorldMap w){
        switch(com){
            case UP:
                //壁があるか？
                if(w.world[posY - 1][posX] != WorldMap.WorldObj.WALL){
                    //自分がいた地点を道にする
                    w.updateMap(posY,posX, WorldMap.WorldObj.ROAD);

                    posY--;

                    //移動する
                    w.updateMap(posY,posX, WorldMap.WorldObj.PLAYER);
                }
                break;
            case DOWN:
                //壁があるか？
                if(w.world[posY + 1][posX] != WorldMap.WorldObj.WALL){
                    //自分がいた地点を道にする
                    w.updateMap(posY,posX, WorldMap.WorldObj.ROAD);

                    posY++;

                    //移動する
                    w.updateMap(posY,posX, WorldMap.WorldObj.PLAYER);
                }
                break;
            case LEFT:
                //壁があるか？
                if(w.world[posY][posX - 1] != WorldMap.WorldObj.WALL){
                    //自分がいた地点を道にする
                    w.updateMap(posY,posX, WorldMap.WorldObj.ROAD);

                    posX--;

                    //移動する
                    w.updateMap(posY,posX, WorldMap.WorldObj.PLAYER);
                }
                break;
            case RIGHT:
                //壁があるか？
                if(w.world[posY][posX + 1] != WorldMap.WorldObj.WALL){
                    //自分がいた地点を道にする
                    w.updateMap(posY,posX, WorldMap.WorldObj.ROAD);

                    posX++;

                    //移動する
                    w.updateMap(posY,posX, WorldMap.WorldObj.PLAYER);
                }
                break;
        }
    }

    //生きているかどうか
    public boolean isAlive(){
        return hp > 0;
    }

}
