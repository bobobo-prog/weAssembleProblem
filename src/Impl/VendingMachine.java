package Impl;

import DTOs.Product;
import Service.CoinState;
import Service.InventoryState;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class VendingMachine {
    private CoinState idleState;
    private CoinState acceptingCoinsState;
    private CoinState dispensingProductState;
    private CoinState currentState;

    private InventoryState inventoryState;

    private int currentBalance;
    private Map<String, Product> inventory;

    List<Integer> coinList = Arrays.asList(1,5,10,25,50,100);

    public VendingMachine() {
        idleState = new IdleCoinState(this);
        acceptingCoinsState = new AcceptingCoinsCoinState(this);
        dispensingProductState = new DispensingProductCoinState(this);
        inventoryState = new AcceptingInventoryState(this);
        currentState = idleState;
        currentBalance = 0;
        inventory = new HashMap<>();
        inventory.put("Pepsi",new Product(10,40));
        inventory.put("Coke",new Product(10,40));
        inventory.put("Red Bull",new Product(10,40));
    }

    public void setCurrentState(CoinState currentState) {
        this.currentState = currentState;
    }
    public void setCurrentState(InventoryState inventoryState){this.currentState = currentState;}

    public CoinState getIdleState() {
        return idleState;
    }

    public CoinState getAcceptingCoinsState() {
        return acceptingCoinsState;
    }

    public CoinState getDispensingProductState() {
        return dispensingProductState;
    }

    public InventoryState getInventoryState()
    {
        return  inventoryState;
    }


    public int getCurrentBalance() {
        return currentBalance;
    }

    public void insertCoin(int coin) {
        if(coinList.contains(coin))
        {
            currentBalance += coin;
            System.out.println("Inserted coin: " + coin + " cents");
        }
        else{
            System.out.println("Please insert the following coins only: 1,5,10,25,50,100");
        }

    }

    public void selectProduct(String product) {
        currentState = dispensingProductState;
        if (inventory.containsKey(product)) {
            int price = inventory.get(product).getEachPrice();
            if (currentBalance >= price) {
                System.out.println("Selected product: " + product);
                currentBalance -= price;
                currentState.dispenseProduct(product,currentBalance);
            } else {
                System.out.println("Insufficient balance to purchase " + product);
            }
        } else {
            System.out.println("Product not available: " + product);
        }
    }


    public void dispenseProduct(String product,Integer change) {
        int currQuantity = inventory.get(product).getQuantity();
        inventory.get(product).setQuantity(currQuantity-1);
        System.out.println("Dispensing product...");
        System.out.println("Remaining change = " + change);

    }


    public void updateStock(String productName,Product product) {

        if(inventory.containsKey(productName))
        {
            int existingQuant = inventory.get(productName).getQuantity();
            inventory.get(productName).setQuantity(existingQuant + product.getQuantity());
        }
        else{
            inventory.put(productName, product);
        }



    }


    public void printInventory() {

        inventory.forEach((key, value) -> System.out.println(key + " " + value));

    }
}
