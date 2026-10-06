public class NumberProgram {

    /**
     * Returns the largest integer in the array.
     *
     * @param values the array of integers
     * @return the largest value, or Integer.MIN_VALUE if the array is empty
     */
    public static int findResult(int[] values) {
        if (values.length == 0) {
            return Integer.MIN_VALUE;
        }

        int max = values[0];

        for (int i = 1; i < values.length; i++) {
            if (values[i] > max) {
                max = values[i];
            }
        }

        return max;
    }
}