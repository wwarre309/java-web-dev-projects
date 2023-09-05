package technology;

public abstract class AbstractEntity {
    private static int idCounter = 1;
    protected int id;

    public AbstractEntity() {
        this.id = idCounter++;
    }

    public int getId() {
        return id;
    }
}
