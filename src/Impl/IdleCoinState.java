package Impl;

import Service.CoinState;

public class IdleCoinState implements CoinState {
    private VendingMachine vendingMachine;

    public IdleCoinState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin(int coin) {
        vendingMachine.setCurrentState(vendingMachine.getAcceptingCoinsState());
        vendingMachine.insertCoin(coin);
    }

    @Override
    public void selectProduct(String product) {
        System.out.println("Please insert coins first.");
    }

    @Override
    public void dispenseProduct(String product,Integer change) {
        System.out.println("Please select a product first.");
    }
}