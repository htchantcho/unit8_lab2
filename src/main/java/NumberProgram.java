public class NumberProgram {
    public class NumberProgram {

        /**
         * Calculates the sum of all values in the array.
         *
         * @param values the array of integers
         * @return the sum of all elements, or 0 if the array is empty
         */
        public static int findResult(int[] values) {
            int sum = 0;

            for (int value : values) {
                sum += value;
            }

            return sum;
        }
    }