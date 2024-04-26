package Impl;

import Service.CoinState;

public class AcceptingCoinsCoinState implements CoinState {
    private VendingMachine vendingMachine;

    public AcceptingCoinsCoinState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin(int coin) {
        vendingMachine.insertCoin(coin);
    }

    @Override
    public void selectProduct(String product) {
        vendingMachine.setCurrentState(vendingMachine.getDispensingProductState());
        vendingMachine.selectProduct(product);
    }

    @Override
    public void dispenseProduct(String product,Integer change) {
        System.out.println("Please select a product first.");

    }
}