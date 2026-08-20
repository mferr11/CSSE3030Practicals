import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

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
        fail("Not yet implemented: complete TODOs 1-4 below.");

        // TODO 1: create a mock InventorySystem
        InventorySystem inventory = null;

        // TODO 2: stub hasStock("kayak") to return true

        // TODO 3: inject the mock into a Checkout instance and call purchase("kayak")
        Checkout checkout = new Checkout();

        // TODO 4: verify that reduceStock("kayak") was called exactly once
    }
}
