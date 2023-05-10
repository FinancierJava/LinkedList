public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("Размер списка: " + list.size());
        System.out.println("Элемент по индексу 1: " + list.get(1));

        list.remove(1);
        System.out.println("Размер списка после удаления: " + list.size());
        System.out.println("Элемент по индексу 1 после удаления: " + list.get(1));
        System.out.println(list.toString());
    }
}