package draft.draft1;

import java.util.Arrays;

public class SecondDraft {

    public static void main(String[] args) {
        int[] a = {5, 6, 7, 8};

        for (int i = 0; i < a.length; i++) {

            if (a[i] % 2 == 0) {

                continue;

            }
            System.out.printf(String.valueOf(i));
        }
    }
}
