public class Main {

    public static void main(String[] args) {

        System.out.println(new RankOfWord("bac").getRank() == 2);
        System.out.println(new RankOfWord("caba").getRank() == 10);
        System.out.println(new RankOfWord("abba").getRank() == 2);
        System.out.println(new RankOfWord("babca").getRank() == 15);
    }
}
