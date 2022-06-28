package ru.netology.manager;

import ru.netology.AfficheItem.AfficheItem;


public class AfficheManager {
    public int resultLengthForLast = 10;


    private AfficheItem[] items = new AfficheItem[0];

    public void add(AfficheItem item) {
        int length = items.length + 1;
        ;
        AfficheItem tmp[] = new AfficheItem[length];

        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastFilm = tmp.length - 1;
        tmp[lastFilm] = item;
        items = tmp;

    }


    public AfficheItem[] findAll() {
        AfficheItem[] allResult = new AfficheItem[items.length];
        for (int i = 0; i< allResult.length; i++) {
            int index = i;
            allResult[i] = items [index];
        }
        return allResult;
    }


    public AfficheItem[] findLast(int resultLengthForLast) {
        int resultLength = resultLengthForLast;
         AfficheItem[] result = new AfficheItem[resultLength];
            for (int i = 0; i < result.length; i++) {
                int index = items.length - i - 1;
                result[i] = items[index];
            }
            return result;
        }
    }



