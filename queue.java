//Гимаев Даниэль Рустемович уч.группа 11-305 вариант-1
package cr;
public class queue<E> {
    private static class Node<E> {
        private E data;
        private Node<E> next;

        public Node(E data) {
            this.data = data;
        }
    }
    private Node<E> head;
    private Node<E> tail;
    private int size = 0;

    // Метод добавления элемента
    public void add(E item) {
        Node<E> newNode = new Node<>(item);
        if (tail != null) {
            tail.next = newNode;
        }
        tail = newNode;
        if (head == null) {
            head = tail;
        }
        size++;
    }

    // Метод удаления и возврата элемента с начала очереди
    public E remove() {
        if (head == null)
            throw new IllegalStateException();
        E data = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return data;
    }

    // Метод возврата элемента без удаления
    public E peek() {
        if (head == null)
            throw new IllegalStateException();
        return head.data;
    }

    // Метод получения элемента по индексу
    public E get(int ind) {
        if (ind < 0 || ind >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node<E> curr = head;
        for (int i = 0; i < ind; i++) {
            curr = curr.next;
        }
        return curr.data;
    }
    // Размер для тестов
    public int size() {
        return size;
    }
}
