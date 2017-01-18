package collections;

/**
 * Created by Администратор on 18.01.2017.
 */
public class Main {
    public static void main(String[] args) {
        UniCollections stack = new Stack(2);
        UniCollections queue = new Queue(2);

        int i = 0;
        do {
            stack.add(""+i); // добавляем в стек, произойдет расширение стека.
            queue.add(""+i); // добавляем в стек, произойдет расширение стека.
        } while (i++ < 5);

        System.out.println("        Стек");
        System.out.println("Стек содержит " + stack.getAmount() + " элементов");
        System.out.println(stack.get(-1)); // ошибка
        stack.removeLast(); // удаляем последний элемент в стеке (первый в массиве) 0
        System.out.println(stack.get(1)); // выводим 2-й элемент стека (предпоследний в массиве) 4
        stack.removeFirst(); // удаляем первый элемент в стеке 5

        for (i = 0; i < 6; i++) {
            System.out.println(stack.pop());
        }

        System.out.println("        Очередь");
        System.out.println("Очередь содержит " + queue.getAmount() + " элементов");
        System.out.println(queue.get(-1)); // ошибка
        queue.removeLast(); // удаляем последний элемент из очереди (последний в массиве) 5
        System.out.println(queue.get(1)); // выводим 2-й элемент очереди (второй в массиве) 1
        queue.removeFirst(); // удаляем первый элемент из очереди 0

        for (i = 0; i < 6; i++) {
            System.out.println(queue.pop()); //
        }
    }
}
