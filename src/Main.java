public class Main {
    public static void main(String[] args) {
        Integer[] array1 = {100, 2, 30, 20, 40, 1, 10, 9, 399, 20};
        Integer[] array2 = array1.clone();
        Integer[] array3 = array1.clone();
        Double[] array4 = {100.01, 2.03, 30.02, 20.01, 40.13, 1.33, 10.22, 9.33, 399.22, 20.31};

        testSorts(array4, new BubbleSort1(), new SelectionSort(), new HeapSort());
    }

    static void testSorts(Double[] array, Sort... sorts) {
        for (Sort sort : sorts) {
            sort.sort(array.clone());
            System.out.println(sort);
        }
    }

}