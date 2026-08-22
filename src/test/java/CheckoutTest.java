import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

/**
 * Question 5: Mockito and Interaction-Based Testing
 *
 * Write a JUnit test, using Mockito, that:
 * 1. creates a mock InventorySystem;
 * 2. stubs hasStock("kayak") to return true;
 * 3. injects the mock into a Checkout instance and calls purchase("kayak");
 * 4. verifies that reduceStock("kayak") was called exactly once.
 */
class CheckoutTest {

    @Test
    void purchaseReducesStockWhenItemIsAvailable() {
        // Remove this line once you've implemented the test below.
        fail("Not yet implemented: complete TODOs below.");

        // TODO: create a mock InventorySystem
        InventorySystem inventory = null;

        // TODO: stub hasStock("kayak") to return true

        // TODO: inject the mock into a Checkout instance and call purchase("kayak")
        Checkout checkout = new Checkout();

        // TODO: verify that reduceStock("kayak") was called exactly once
    }
}
