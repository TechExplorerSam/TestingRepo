/**
 * Unit tests for example.js module.
 */

const { greet, addNumbers, multiplyNumbers } = require('../src/example.js');

function assert(condition, message) {
    if (!condition) {
        throw new Error(message || "Assertion failed");
    }
}

function testGreet() {
    assert(greet("Alice") === "Hello, Alice!", "greet('Alice') should return 'Hello, Alice!'");
    assert(greet("Bob") === "Hello, Bob!", "greet('Bob') should return 'Hello, Bob!'");
    console.log("✓ testGreet passed");
}

function testAddNumbers() {
    assert(addNumbers(2, 3) === 5, "2 + 3 should equal 5");
    assert(addNumbers(-1, 1) === 0, "-1 + 1 should equal 0");
    assert(addNumbers(0, 0) === 0, "0 + 0 should equal 0");
    assert(addNumbers(10, 20) === 30, "10 + 20 should equal 30");
    console.log("✓ testAddNumbers passed");
}

function testMultiplyNumbers() {
    assert(multiplyNumbers(2, 3) === 6, "2 * 3 should equal 6");
    assert(multiplyNumbers(-1, 5) === -5, "-1 * 5 should equal -5");
    assert(multiplyNumbers(0, 10) === 0, "0 * 10 should equal 0");
    assert(multiplyNumbers(4, 5) === 20, "4 * 5 should equal 20");
    console.log("✓ testMultiplyNumbers passed");
}

function runTests() {
    console.log("Running tests...");
    try {
        testGreet();
        testAddNumbers();
        testMultiplyNumbers();
        console.log("\nAll tests passed! ✓");
    } catch (error) {
        console.error("\n✗ Test failed:", error.message);
        process.exit(1);
    }
}

if (require.main === module) {
    runTests();
}

module.exports = { testGreet, testAddNumbers, testMultiplyNumbers, runTests };
