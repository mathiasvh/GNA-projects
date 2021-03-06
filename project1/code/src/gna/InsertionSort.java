package gna;

/**
 * Performs sort by using the Selection Sort algorithm.
 * 
 * @author Mathias Van Herreweghe
 */
public class InsertionSort implements libpract.SortingAlgorithm {

	/**
	 * Sorts the given array using insertion sort.
	 * 
	 * @return The number of comparisons (i.e. calls to compareTo) performed by
	 *         the algorithm.
	 */
	public <T extends Comparable<T>> int sort(T[] array) {
		counter = 0;
		if (array == null)
			return counter;
		int N = array.length;
		for (int i = 1; i < N; i++) {
			for (int j = i; j > 0 && less(array[j], array[j - 1]); j--)
				swap(array, j, j - 1);
		}
		return counter;
	}

	/**
	 * Compares two given objects whether the first parameter is less than the second 
	 * parameter.
	 * @param	v
	 * 			The first object to compare.
	 * @param	w
	 * 			The second object to compare.
	 * @return	True if and only if v is strict less than w.
	 */
	private static <T extends Comparable<T>> boolean less(T v, T w) {
		counter++;
		return v.compareTo(w) < 0;
	}

	/**
	 * Swaps two elements in the given array.
	 * @param	array
	 * 			The array to perform the swap in.
	 * @param	i
	 * 			The index of the first element to be swapped.
	 * @param	j
	 * 			The index of the second element to be swapped.
	 */
	private static <T extends Comparable<T>> void swap(T[] array, int i, int j) {
		T tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
	}

	/**
	 * Constructor.
	 */
	public InsertionSort() {
	}

	/**
	 * Variable registering the amount of compares.
	 */
	private static int counter;
}
