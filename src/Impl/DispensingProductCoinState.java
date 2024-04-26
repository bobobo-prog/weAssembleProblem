package Impl;

import Service.CoinState;

public class DispensingProductCoinState implements CoinState {
    private VendingMachine vendingMachine;

    public DispensingProductCoinState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin(int coin) {
        System.out.println("Already dispensing product. Please wait.");
    }

    @Override
    public void selectProduct(String product) {
        System.out.println("Already dispensing product. Please wait.");
    }

    @Override
    public void dispenseProduct(String product,Integer change) {
        vendingMachine.dispenseProduct(product,change);
    }
}