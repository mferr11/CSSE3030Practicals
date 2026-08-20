public interface InventorySystem {
    boolean hasStock(String item);
    void reduceStock(String item);
}
