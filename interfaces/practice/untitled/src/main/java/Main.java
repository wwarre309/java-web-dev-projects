public class Main {
    public static void main(String[] args) {
        ByTwos twos = new ByTwos();
        ByThrees threes = new ByThrees();

        for (int i = 0; i <5; i++){
            System.out.println(threes.getNext());
        }

        for (int i = 0; i < 5; i++){
            System.out.println(twos.getNext());
        }
    }
}
