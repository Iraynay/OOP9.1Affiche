import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.AfficheItem.AfficheItem;
import ru.netology.manager.AfficheManager;

public class AfficheManagerTest {

    AfficheItem first = new AfficheItem(1, "Бладшот");
    AfficheItem second = new AfficheItem(2, "Вперед");
    AfficheItem third = new AfficheItem(3, "Отель Белград");
    AfficheItem fourth = new AfficheItem(4, "Джентельмены");
    AfficheItem fifth = new AfficheItem(5, "Человек-невидимка");
    AfficheItem sixth = new AfficheItem(6, "Тролли.Мировой тур");
    AfficheItem seventh = new AfficheItem(7, "Номер один");
    AfficheItem eighth = new AfficheItem(8, "Молодой человек");
    AfficheItem ninth = new AfficheItem(9, "Дикая");
    AfficheItem tenth = new AfficheItem(10, "Одна");
    AfficheItem eleventh = new AfficheItem(11, "Пропавшая");

    @Test
    public void managerFindLastWOSetLimitExactlyTest() {
        AfficheManager testManager = new AfficheManager();

        testManager.add(first);
        testManager.add(second);
        testManager.add(third);
        testManager.add(fourth);
        testManager.add(fifth);
        testManager.add(sixth);
        testManager.add(seventh);
        testManager.add(eighth);
        testManager.add(ninth);
        testManager.add(tenth);


        AfficheItem[] actual = testManager.findLast();
        AfficheItem[] expected = {tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void managerFindLastWOSetLimitOverTest() {
        AfficheManager testManager = new AfficheManager();

        testManager.add(first);
        testManager.add(second);
        testManager.add(third);
        testManager.add(fourth);
        testManager.add(fifth);
        testManager.add(sixth);
        testManager.add(seventh);
        testManager.add(eighth);
        testManager.add(ninth);
        testManager.add(tenth);
        testManager.add(eleventh);


        AfficheItem[] actual = testManager.findLast();
        AfficheItem[] expected = {eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void managerFindLastSetLimitOverTest() {
        AfficheManager testManager = new AfficheManager(5);

        testManager.add(first);
        testManager.add(second);
        testManager.add(third);
        testManager.add(fourth);
        testManager.add(fifth);
        testManager.add(sixth);
        testManager.add(seventh);
        testManager.add(eighth);
        testManager.add(ninth);
        testManager.add(tenth);
        testManager.add(eleventh);


        AfficheItem[] actual = testManager.findLast();
        AfficheItem[] expected = {eleventh, tenth, ninth, eighth, seventh};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void managerFindLastSetLimitLessTest() {
        AfficheManager testManager = new AfficheManager(5);

        testManager.add(first);
        testManager.add(second);
        testManager.add(third);
        testManager.add(fourth);
        testManager.add(fifth);
        testManager.add(sixth);


        AfficheItem[] actual = testManager.findLast();
        AfficheItem[] expected = {sixth, fifth, fourth, third, second,};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void managerFindLastSetLimitExactlyTest() {
        AfficheManager testManager = new AfficheManager(4);

        testManager.add(first);
        testManager.add(second);
        testManager.add(third);
        testManager.add(fourth);
        testManager.add(fifth);
        testManager.add(sixth);
        testManager.add(seventh);
        testManager.add(eighth);
        testManager.add(ninth);
        testManager.add(tenth);


        AfficheItem[] actual = testManager.findLast();
        AfficheItem[] expected = {tenth, ninth, eighth, seventh};

        Assertions.assertArrayEquals(expected, actual);
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

        Assertions.assertArrayEquals(expected, actual);
    }

}
//    @Test
//    public void managerFindLastWOSetLimitLessTest() {
//        AfficheManager testManager = new AfficheManager();
//
//        testManager.add(first);
//        testManager.add(second);
//        testManager.add(third);
//        testManager.add(fourth);
//        testManager.add(fifth);
//
//
//        AfficheItem[] actual = testManager.findLast();
//        AfficheItem[] expected = {fifth, fourth, third, second, first};
//
//        Assertions.assertArrayEquals(expected, actual);
//    }