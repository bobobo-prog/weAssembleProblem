package Service;

public interface CoinState {

    void insertCoin(int coin);
    void selectProduct(String product);
    void dispenseProduct(String product,Integer change);
}
