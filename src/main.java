public class main {
    public static void main(String args[]){

        String a = "aa";
        String b = "bb";

        StringBuilder builder = new StringBuilder();

        builder.append(a);
        builder.append(b);

        String str = builder.toString();
        System.out.println(str);

        String sentence = "this is a pen.";
        String[] words = sentence.split(" ");

        for(String word : words) {
            System.out.println(word);
        }





    }
}
