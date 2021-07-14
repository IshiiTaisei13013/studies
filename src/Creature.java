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

    public void move(MoveCommand com){
        switch(com){
            case UP:
                pos_y++;
                break;
            case DOWN:
                pos_y--;
                break;
            case LEFT:
                pos_x++;
                break;
            case RIGHT:
                pos_x--;
                break;
        }
    }

}
