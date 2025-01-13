import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //int[] arrayToSort = {4, 6,1,2};

        // int[] sortedArray = bubbleSort( arrayToSort);
        //System.out.println( Arrays.toString( sortedArray ));

        //mit Zeitmessung Vergleich BubbleSort / Quicksort und 20000 Werte
        int[] arrayToSort = getRandomArray(100000);
        int[] arrayToSort2 = Arrays.copyOf(arrayToSort,arrayToSort.length);
        long timeStart = System.currentTimeMillis();
        int[] sortedArray = bubbleSort( arrayToSort);

        long timeEnd = System.currentTimeMillis();
        System.out.println("Dauer der Sortierung: " + (timeEnd - timeStart) + " Millisek.");
        //System.out.println( Arrays.toString( sortedArray ));

        timeStart = System.currentTimeMillis();
        Arrays.sort(arrayToSort2);

        timeEnd = System.currentTimeMillis();
        System.out.println("Dauer der Sortierung: " + (timeEnd - timeStart) + " Millisek.");
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

                    //(sortArray[i], sortArray[i+1]) = (sortArray[i+1], sortArray[i]);

                    sorted = false;
                }
            }
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