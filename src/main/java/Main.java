import ru.netology.manager.AfficheManager;
import ru.netology.AfficheItem.AfficheItem;

public class Main {

    public static void main(String[] Args) {
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


        AfficheManager manager = new AfficheManager();

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);


        AfficheItem[] all = manager.findAll();
        AfficheItem[] all1 = manager.findLast(4);

    }
}
