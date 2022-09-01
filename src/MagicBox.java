import java.util.Random;

public class MagicBox<T> {
    protected T[] items;
    protected int maxObject;

    public MagicBox(int maxObject) {
        this.maxObject = maxObject;
        this.items = (T[]) new Object[maxObject];
    }

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                break;
            } else {
                continue;
            }
        }
        return true;
    }

    public <T> T pick() throws RuntimeException {
        int tmp = 0;
        T randomT = (T) new Object();
        for (Object item : items) {
            if (item != null) {
                tmp++;
                continue;
            } else {
                throw new RuntimeException("The box isn't full, you need to fill " +
                        (maxObject - tmp) + " cells");
            }

        }

        Random random = new Random();
        int randomInt = random.nextInt(items.length);
        randomT = (T) items[randomInt];


        System.out.println(randomT);
        return randomT;
    }


}
