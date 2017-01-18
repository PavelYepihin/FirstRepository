package collections;

/**
 * Created by Администратор on 18.01.2017.
 */
public class Stack extends UniCollections {
    private String stArr[];
    private int capacity;

    public Stack(int size) {
        stArr = new String[size];
        capacity = 0;
    }

    private String[] resize() {
        String tmpArr[] = new String[capacity + 10];
//        for (int i = 0; i < capacity-1; i++) {
//            tmpArr[i] = stArr[i];
//        }
        System.arraycopy(stArr, 0, tmpArr, 0, stArr.length);
        return tmpArr;
    }

    private void rewrite(int index) {
//        for (int i = index; i < capacity-2; i++) {
//            stArr[i] = stArr[i+1];
//        }
        System.arraycopy(stArr, index+1, stArr, index, capacity-index);
    }

    @Override
    public void add(String str) {
        capacity++;
        if (capacity > stArr.length) {
            stArr = resize();
        }
        stArr[capacity-1] = str;
    }

    @Override
    public String pop() {
        if (capacity > 0) {
            String str = stArr[capacity - 1];
            removeFirst();
            return str;
        }
        return "стек пуст!";
    }

    @Override
    public String get(int index) {
        if (capacity > 0) {
            if ((index > capacity-1) | (index < 0))
            {
                return "Ошибка доступа к элементу стека";
            }
            capacity--;
            String str = stArr[capacity - index];
            if (index == 0) {
                stArr[capacity] = null;
                return str;
            }
            rewrite(capacity - index);
            stArr[capacity] = null;
            return str;
        }
        return "стек пуст!";
    }

    @Override
    public void removeLast() {
        capacity--;
        rewrite(0);
        stArr[capacity] = null;
    }

    @Override
    public void removeFirst() {
        capacity--;
        stArr[capacity] = null;
    }

    @Override
    public int getAmount() {
        return capacity;
    }
}
