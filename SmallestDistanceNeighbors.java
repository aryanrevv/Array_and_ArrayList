public class SmallestDistanceNeighbors {
    public static int findSmallestDistanceIndex(int[] array) {
        if (array == null || array.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements.");
        }

        int minDistance = Integer.MAX_VALUE;
        int index = 0;

        for (int i = 0; i < array.length - 1; i++) {
            int distance = Math.abs(array[i] - array[i + 1]);
            if (distance < minDistance) {
                minDistance = distance;
                index = i;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        int[] array = {4, 8, 6, 1, 2, 9, 4};
        int index = findSmallestDistanceIndex(array);
        System.out.println("Index of the first number with the smallest distance: " + index);
    }
}