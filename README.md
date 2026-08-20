# CSSE3030 Practical Resources

## Part 1: JaCoCo & Code Coverage

`GradeCalculator` converts a numeric score to a letter grade. `GradeCalculatorTest`
intentionally covers only some of its branches — the C range, the D range, the
invalid-score exception path, and `isPassing()` are left untested.

Run: `./gradlew jacocoTestReport`


Then open `build/reports/jacoco/test/html/index.html` to see JaCoCo flag the
gaps in coverage, and add tests to close them.

## Part 2, Question 5: Combinatorial Testing

`CheckoutPractical.isSupported(...)` encodes a set of constraints over five
enum inputs (`Browser`, `Device`, `Payment`, `Account`, `Delivery`) that
together decide whether a checkout configuration is supported.

Using ACTS (or the combinatorial testing tool covered in the practical),
generate a constrained test suite that respects these rules, then paste the
generated rows into `GENERATED_TESTS` in the order
`Browser, Device, Payment, Account, Delivery`. Running the class validates
each row against `isSupported` and reports any that violate a constraint:

`./gradlew run`