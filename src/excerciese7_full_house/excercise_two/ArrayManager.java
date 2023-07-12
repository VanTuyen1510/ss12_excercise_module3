package excerciese7_full_house.excercise_two;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class ArrayManager {
    public static int[] array;

    public ArrayManager() {
    }

    public ArrayManager(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getTotal() {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    public int getMean() {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        int average = sum / array.length;
        return average;
    }

    public int getMax() {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public int getMin() {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    @Override
    public String toString() {
        return "ArrayManager { " + array + "}";
    }
}
