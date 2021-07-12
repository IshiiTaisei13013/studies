public class main {
    public static void main(String args[]){
        Dog dog1 = new Dog("ボーダーコリー");
        Dog dog2 = new Dog("ダルメシアン");
        String name = "AA";
        int age = 2;

        dog1.SetName(name);
        dog1.SetAge(age);
        dog1.ShowProfile();

        dog2.SetName(name);
        dog2.SetAge(age);
        dog2.ShowProfile();

    }
}
