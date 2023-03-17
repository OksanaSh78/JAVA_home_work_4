import java.util.LinkedList;

// Пусть дан LinkedList с несколькими элементами. 
// Реализуйте метод(не void), который вернет “перевернутый” список.

public class N_1 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            ll.add(getRandomNumber());
        }
        System.out.println(ll);

        for (int i = 0; i < 5; i++) {
            System.out.print(ll.getLast() + ", ");
            ll.removeLast();

        }
    }

    public static int getRandomNumber() { 
        double x = (Math.random() * 21);
        int num = (int) x;
        return num;
    }
}