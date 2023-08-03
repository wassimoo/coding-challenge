/**
 * Checks if the input string contains the same amount of 'x' and 'o' characters.
 * The function is case-insensitive.
 * 
 * Note: This function could be written in a simpler way using built-in 
 * array functions, but the current implementation provides a fairly straightforward and 
 * optimized solution with a time complexity of O(n).
 *
 * @returns {boolean} True if the number of 'x' and 'o' characters are equal, false otherwise.
 */
export function sameXOAmount(str: string): boolean {
    let xCount = 0;
    let oCount = 0;

    for (const char of str.toLowerCase()) {
        if (char === 'x') {
            xCount++;
        } else if (char === 'o') {
            oCount++;
        }
    }

    return xCount === oCount;
}