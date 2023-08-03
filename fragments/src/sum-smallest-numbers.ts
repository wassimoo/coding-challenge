/**
 * Calculate the sum of the two smallest numbers in the given array.
 * 
 * @returns {number} The sum of the smallest two numbers in the array.
 */
export function sumSmallestNumbers(numbers: Array<number>): number {
    const [first, second] = getSmallestTwoNumbers(numbers);
    return first + second;
}

/**
 * Get the two smallest numbers in the array.
 * 
 * This function currently sorts the array to find the smallest numbers.
 * If this function needs to handle large arrays, 
 * and performance becomes a concern, it could be optimized to find the smallest 
 * two numbers in a single pass, which would have a time complexity of O(n).
 * 
 * @returns {number[]} An array containing the smallest two numbers in the array.
 */
function getSmallestTwoNumbers(numbers: Array<number>): number[] {
    numbers.sort((a, b) => a - b); // Sort ascending
    return [numbers[0], numbers[1]]; // return first two elements
}
