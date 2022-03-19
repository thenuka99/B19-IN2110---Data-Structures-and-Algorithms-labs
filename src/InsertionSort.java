
class InsertionSort {
    void sort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }


    public static void main(String args[])
    {
        int arr[] = { 32, 4, 7, 15, 5 };

        InsertionSort ob = new InsertionSort();
        ob.sort(arr);

        printArray(arr);

        long startTime = System.nanoTime();
        ob.sort(arr);
        long stopTime = System.nanoTime();
        System.out.println(stopTime - startTime);




    }


}
