package com.example;

import com.example.Constant.constant;
import com.example.view.InputView;

public class Delete {
    public static void deleteItem() {
        InputView.getItemSeller();
        InputView.getDeleteItemIndex();
    }

    public static void deleteCheck(String input, int indexForDelete) {
        if(input.equals("Yes")) {
            deleteExecute(indexForDelete);
        }
    }

    public static void deleteExecute(int indexForDelete) {
        Item.items.remove(indexForDelete - constant.ONE);
    }
}
