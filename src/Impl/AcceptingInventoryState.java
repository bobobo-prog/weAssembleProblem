package Impl;

import DTOs.Product;
import Service.InventoryState;

import java.util.Map;

public class AcceptingInventoryState implements InventoryState {
    private VendingMachine vendingMachine;
    public AcceptingInventoryState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertProducts(String productName, Product prod) {
            vendingMachine.setCurrentState(vendingMachine.getInventoryState());
            vendingMachine.updateStock(productName, prod);
    }


}
