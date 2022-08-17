package ru.netology.manager;

import ru.netology.AfficheItem.AfficheItem;


public class AfficheManager {
    private int resultLengthForLast;
    private AfficheItem[] items = new AfficheItem[0];
    public AfficheManager() {
        this.resultLengthForLast = 10;
    }
    public AfficheManager(int resultLengthForLast) {
        this.resultLengthForLast = resultLengthForLast;
    }




    public void add(AfficheItem item) {
        int length = items.length + 1;
        AfficheItem tmp[] = new AfficheItem[length];

        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastFilm = tmp.length - 1;
        tmp[lastFilm] = item;
        items = tmp;

    }


    public AfficheItem[] findAll() {
        AfficheItem[] allResult = new AfficheItem[items.length];
        for (int i = 0; i < allResult.length; i++) {
            int index = i;
            allResult[i] = items[index];
        }
        return allResult;
    }


    public AfficheItem[] findLast() {
        int resultLength = resultLengthForLast;
        AfficheItem[] result = new AfficheItem[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }

        return result;
    }
}



