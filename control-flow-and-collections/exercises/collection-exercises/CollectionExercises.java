
public class CollectionExercises {
    public static void main(String[] args) {
        int [] someIntsArray ={1, 1, 2, 3, 5, 8};
        for (int ints : someIntsArray) {
            System.out.println(ints);
        }
        System.out.println("Odd Numbers Only: ");
        for (int ints : someIntsArray) {
            if (ints % 2 !=0) {
                System.out.println(ints);
            }
        }
    }

}

