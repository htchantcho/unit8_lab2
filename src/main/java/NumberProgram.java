public class NumberProgram {

    /**
     * Returns the largest integer in the array.
     *
     * @param values the array of integers
     * @return the largest value in the array
     */
    public static int findResult(int[] values) {
        int max = values[0];

        for (int i = 1; i < values.length; i++) {
            if (values[i] > max) {
                max = values[i];
            }
        }

        return max;
    }
}