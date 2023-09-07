public class ByTwos implements Series {
    int val;

    ByTwos() {
        val = 0;
    }

    @Override
    public int getNext() {
        val+=2;
        return val;
    }


}
