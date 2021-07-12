public class Dog {
    private String Name;
    private String Race;
    private int Age;

    //犬種をコンストラクタで指定
    Dog(String Rc)
    {
        Race = Rc;
    }

    //名前を設定する関数
    public void SetName( String nm)
    {
        Name = nm;
    }

    //年齢を設定する関数
    public void SetAge(int ag)
    {
        Age = ag;
    }

    //プロフィールを表示する関数
    public void ShowProfile()
    {
        System.out.println( "犬種は、" + Race +"です。");
        System.out.println( "名前は、" + Name + "です。" );
        System.out.println( "年齢は、" + Age +"です。");
    }
}
