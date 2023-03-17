import java.util.LinkedList;

// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

public class N_2 {
    public static void main(String[] args) {
        int[] list = { 1, 2, 3, 4, 5 };
        LinkedList<Integer> linkList = new LinkedList<>();
        for (Integer temp : list) {
            linkList.add(temp);
        }
        System.out.println(linkList);
        enqueue(linkList, 100);
        System.out.println(linkList);
        System.out.println(dequeue(linkList));
        System.out.println(linkList);
        System.out.println(first(linkList));
    }
    public static void enqueue(LinkedList<Integer> list, int num) {
        list.addLast(num);
    }
    public static int dequeue(LinkedList<Integer> list) {
        int num = 0;
        num = list.get(0);
        list.remove(0);
        return num;
    }
    public static int first(LinkedList<Integer> list) {
        int num = 0;
        num = list.get(0);
        return num;
    }
}    