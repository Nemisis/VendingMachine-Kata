package com.ariets.kata.ui.vending;

import com.ariets.kata.model.Coin;

public interface VendingMachineContract {

    interface View {

    }

    interface Presenter<View> {
        void attachView(View view);

        void detachView();

        void insertCoin(Coin coin);
    }

}