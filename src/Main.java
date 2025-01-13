import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //mit Zeitmessung Vergleich BubbleSort / SelectionSort / Quicksort und 10000 Werte
        int[] arrayToSort = getRandomArray(10000);
        int[] arrayToSort2 = Arrays.copyOf(arrayToSort,arrayToSort.length);
        int[] arrayToSort3 = Arrays.copyOf(arrayToSort,arrayToSort.length);

        //Messung BubbleSort
        long timeStart = System.currentTimeMillis();
        int[] sortedArray = bubbleSort( arrayToSort);

        long timeEnd = System.currentTimeMillis();
        System.out.println("Dauer BubbleSort: " + (timeEnd - timeStart) + " Millisek.");
        //System.out.println( Arrays.toString( sortedArray ));

        //Messung SelectionSort
        timeStart = System.currentTimeMillis();
        int[] sortedArray2 = selectionSort(arrayToSort2);

        timeEnd = System.currentTimeMillis();
        System.out.println("Dauer SelectionSort: " + (timeEnd - timeStart) + " Millisek.");
        //System.out.println( Arrays.toString( sortedArray2 ));

        //Messung QuickSort
        timeStart = System.currentTimeMillis();
        Arrays.sort(arrayToSort3);

        timeEnd = System.currentTimeMillis();
        System.out.println("Dauer QuickSort: " + (timeEnd - timeStart) + " Millisek.");
        //System.out.println( Arrays.toString( arrayToSort2 ));
    }

    private static int[] bubbleSort( int[] sortArray ){

        boolean sorted = false;

        while( !sorted ){

            sorted = true;

            for( int i = 0; i < sortArray.length - 1; i++){

                if( sortArray[i] > sortArray[i+1]){

                    int temp = sortArray[i+1]; //nächsten Wert merken
                    sortArray[i+1] = sortArray[i];
                    sortArray[i] = temp;

                    sorted = false;
                }
            }
        }

        return sortArray;
    }

    private static int[] selectionSort( int[] sortArray ){

        for(int i=0; i < sortArray.length; i++){
            int min = i;

            for(int j= i+1; j < sortArray.length; j++){

                if (sortArray[j] < sortArray[min]) {
                    min = j;
                }

            }
            int temp = sortArray[min];
            sortArray[min] = sortArray[i];
            sortArray[i] = temp;
        }
        return sortArray;
    }



    private static int[] getRandomArray( int length ){

            int[] array = new int[ length ];

            for( int i = 0; i < array.length; i++){
                array[i] = (int)(Math.random() * 999999);
            }

            return array;
    }




}