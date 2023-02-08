/**
 * 选择排序
 */

public class SelectionSort<E extends Comparable> extends Sort<E> {
    @Override
    protected void sort() {
        for (int end = array.length-1; end > 0 ; end--) {
            int maxIndex = 0;
            for (int begin = 1; begin <= end ; begin++) {
                if (cmp(maxIndex, begin) <= 0) {    // if (array[maxIndex] <= array[begin])
                    maxIndex = begin;
                }
            }
            swap(maxIndex, end);
        }
    }
}
