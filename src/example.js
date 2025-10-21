/**
 * Example JavaScript module for testing purposes.
 */

/**
 * Return a greeting message
 * @param {string} name - The name to greet
 * @returns {string} A greeting message
 */
function greet(name) {
    return `Hello, ${name}!`;
}

/**
 * Add two numbers together
 * @param {number} a - First number
 * @param {number} b - Second number
 * @returns {number} Sum of the two numbers
 */
function addNumbers(a, b) {
    return a + b;
}

/**
 * Multiply two numbers together
 * @param {number} a - First number
 * @param {number} b - Second number
 * @returns {number} Product of the two numbers
 */
function multiplyNumbers(a, b) {
    return a * b;
}

// Export functions for testing
if (typeof module !== 'undefined' && module.exports) {
    module.exports = {
        greet,
        addNumbers,
        multiplyNumbers
    };
}

// Example usage
if (require.main === module) {
    console.log(greet("World"));
    console.log(`2 + 3 = ${addNumbers(2, 3)}`);
    console.log(`4 * 5 = ${multiplyNumbers(4, 5)}`);
}
