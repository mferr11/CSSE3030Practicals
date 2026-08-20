public class Checkout {
    private InventorySystem inventory;

    public void setInventorySystem(InventorySystem inventory) {
        this.inventory = inventory;
    }

    public boolean purchase(String item) {
        if (inventory.hasStock(item)) {
            inventory.reduceStock(item);
            return true;
        }
        return false;
    }
}
