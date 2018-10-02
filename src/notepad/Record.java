package notepad;

public abstract class Record {
    private static int count = 0;
    private int id;

    public Record() {
        count++;
        id = count;
    }

    public int getId() {
        return id;
    }
}
