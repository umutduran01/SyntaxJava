package class30;

public class Entry {
    private int key;
    private String value;

    public Entry(int key, String value) {
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() { //Obje adı yazdırırken bunu tanımladığımızda gerçek çıktıyı görürüz, kodlar değil.
        return "Entry{" +
                "key=" + key +
                ", value='" + value + '\'' +
                '}';
    }
}
