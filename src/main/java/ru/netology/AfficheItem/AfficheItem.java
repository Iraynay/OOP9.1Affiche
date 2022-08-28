package ru.netology.AfficheItem;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data

public class AfficheItem {
    private int id;
    private String name;


    @Override
    public String toString() {
        return id + ":" + name;
    }
}
