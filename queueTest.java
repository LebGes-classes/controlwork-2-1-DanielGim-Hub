//Гимаев Даниэль Рустемович уч.группа 11-305 вариант-1
package cr;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class queueTest {

    @Test
    public void testAdd() {
        queue<Integer> myQueue = new queue<>();

        myQueue.add(10);
        myQueue.add(20);
        myQueue.add(30);
        assertEquals(30, myQueue.get(2)); // Проверяем что элементы добавлены правильно
        assertEquals(3, myQueue.size()); // проверка что размер очереди будет ожидаемому
    }

    @Test
    public void testRemove() {
        queue<String> myQueue = new queue<>();
        myQueue.add("первый эл");
        myQueue.add("второй эл");
        myQueue.add("третий эл");

        assertEquals("первый эл", myQueue.remove()); // Проверяем удаление первого элемента
        assertEquals("второй эл", myQueue.peek()); // Проверяем что второй элемент стал первым после удаления
        assertEquals(2, myQueue.size()); // Проверяем что размер очереди уменьшился на 1
    }

    @Test
    public void testPeek() {
        queue<Character> myQueue = new queue<>();

        myQueue.add('1');
        myQueue.add('2');
        myQueue.add('3');
        assertEquals('1', myQueue.peek()); // Проверяем что метод peek возвращает правильный первый элемент
        assertEquals(3, myQueue.size()); // Проверяем что размер очереди не изменился
    }

    @Test
    public void testGet() {
        queue<Integer> myQueue = new queue<>();

        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);
        assertEquals(2, myQueue.get(1)); // Проверяем получение элемента по индексу
        assertEquals(3, myQueue.size()); // Проверяем что размер очереди не изменился
    }
}
