/**
 * Finds the number in the array that occurs an odd number of times.
 * 
 * This function uses a record (an object) to track the counts of numbers and then finds the number
 * with an odd count. The time complexity is O(n), where n is the number of elements 
 * in the array. The initial assumption is that the first number in the array is the one 
 * occurring an odd number of times. This assumption is then verified in the following 
 * computations.
 * 
 * @returns {number} The number that occurs an odd number of times in the array.
 */
export function findOddAmount(numbers: Array<number>): number {
    const counts: Record<number, number> = {};
    let target = numbers[0];

    for (let number of numbers) {
        if (counts[number]) {
            counts[number]++;
        } else {
            counts[number] = 1;
        }
    }

    for (let number in counts) {
        if (counts[number] % 2 !== 0) {
            target = Number(number);
            break;
        }
    }

    return target;
}
