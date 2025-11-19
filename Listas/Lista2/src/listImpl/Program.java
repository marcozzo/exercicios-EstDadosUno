package listImpl;

public class Program {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        list.addAtEnd(-1);
        list.addAtStart(21);
        list.addAtStart(60);
        list.addAtEnd(1);
        list.addAtEnd(10);
        list.addAtPosition(100, 3);
        list.addAtPosition(200, 1);
        list.addAtPosition(300, 0);
        list.addAtPosition(400, 8);

        System.out.println(list);

        System.out.println("Index of 21: " + list.indexOf(21));

        System.out.println("Contains 100? " + list.contains(100));
        System.out.println("Contains 101? " + list.contains(101));

        list.removeAtPosition(0);
        System.out.println(list);
        list.removeAtPosition(7);
        System.out.println(list);

        list.removeAtPosition(2);
        System.out.println(list);
    }
}
