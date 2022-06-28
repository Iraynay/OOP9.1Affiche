import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.AfficheItem.AfficheItem;
import ru.netology.manager.AfficheManager;

public class AfficheManagerTest {

    AfficheItem first = new AfficheItem(1,"Бладшот");
    AfficheItem second = new AfficheItem(2, "Вперед");
    AfficheItem third = new AfficheItem(3,"Отель Белград");
    AfficheItem fourth = new AfficheItem(4, "Джентельмены");
    AfficheItem fifth = new AfficheItem(5, "Человек-невидимка");
    @Test
            public void managerFindLastTest() {
        AfficheManager testManager = new AfficheManager();

        testManager.add(first);
        testManager.add(second);
        testManager.add(third);
        testManager.add(fourth);
        testManager.add(fifth);
        testManager.findLast(3);

        AfficheItem[] actual = testManager.findLast(3);
        AfficheItem[] expected = {fifth, fourth, third};

        Assertions.assertArrayEquals (expected, actual);
    }
    @Test
    public void managerFindAllTest() {
        AfficheManager testManager = new AfficheManager();

        testManager.add(first);
        testManager.add(second);
        testManager.add(third);
        testManager.add(fourth);
        testManager.add(fifth);
        testManager.findAll();

        AfficheItem[] actual = testManager.findAll();
        AfficheItem[] expected = {first, second, third, fourth, fifth};

        Assertions.assertArrayEquals (expected, actual);
    }
}
