public class LinkedList {
    private Node head; // Головной узел списка

    private class Node {
        int data; // Значение узла
        Node next; // Ссылка на следующий узел

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    // Метод добавления элемента в конец списка
    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            // Если список пуст, новый узел становится головным
            head = newNode;
        } else {
            // Проходим до последнего узла
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }

            // Добавляем новый узел в конец списка
            currentNode.next = newNode;
        }
    }

    // Метод получения элемента по индексу
    public int get(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        Node currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }

        return currentNode.data;
    }

    // Метод удаления элемента по индексу
    public void remove(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        if (index == 0) {
            // Если удаляем головной узел, переназначаем голову на следующий узел
            head = head.next;
        } else {
            // Ищем предыдущий узел перед удаляемым
            Node previousNode = head;
            for (int i = 0; i < index - 1; i++) {
                previousNode = previousNode.next;
            }

            // Удаляем ссылку на узел по индексу
            previousNode.next = previousNode.next.next;
        }
    }

    // Метод получения размера списка
    public int size() {
        int count = 0;
        Node currentNode = head;
        while (currentNode != null) {
            count++;
            currentNode = currentNode.next;
        }
        return count;

    }

    // Возвращает строковое представление списка
    public String toString() {
        StringBuilder sb = new StringBuilder(); // Создаем StringBuilder для построения строки
        sb.append("[");
        Node currentNode = head; // Начинаем с головного узла
        while (currentNode != null) {
            sb.append(currentNode.data); // Добавляем значение текущего узла в StringBuilder
            if (currentNode.next != null) {
                sb.append(", ");
            }
            currentNode = currentNode.next; // Переходим к следующему узлу
        }
        sb.append("]");
        return sb.toString();
    }
}
