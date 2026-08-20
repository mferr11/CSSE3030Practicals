# CSSE3030 Practical Resources

## Part 5: Mockito & Interaction-Based Testing

This week introduces mock objects for testing interactions between collaborating
classes, using [Mockito](https://site.mockito.org/).

`Checkout` depends on an `InventorySystem` collaborator:

- `Checkout.purchase(item)` checks `inventory.hasStock(item)`. If the item is in
  stock, it calls `inventory.reduceStock(item)` and returns `true`; otherwise it
  returns `false` without reducing stock.

### Pre-Question Check

`RepositorySetupTest` confirms your environment is set up correctly (JUnit and
Mockito are both resolving and working). Run it with: `./gradlew test`


### Question 5

Complete `CheckoutTest` (`src/test/java/CheckoutTest.java`). Following the TODOs:

1. Create a mock `InventorySystem`.
2. Stub `hasStock("kayak")` to return `true`.
3. Inject the mock into a `Checkout` instance and call `purchase("kayak")`.
4. Verify `reduceStock("kayak")` was called exactly once.

Remove the `fail(...)` placeholder line once your test is implemented, then run: `./gradlew testQ5`



