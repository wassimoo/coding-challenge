import { findOddAmount } from "../src/find-odd-amount";

describe('findOddAmount()', () => {
    it('should return number that occurs with an odd frequency', () => {
        expect(findOddAmount([1, 2, 2, 3, 3])).toEqual(1);
        expect(findOddAmount([8, 8, 7, 7, 7])).toEqual(7);
        expect(findOddAmount([10, 3, 3, 10, 6, 10, 6, 1, 1])).toEqual(10);
    });
});