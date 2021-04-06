package br.oracle.acs.noleak;

import java.util.ArrayList;
import java.util.Date;

public class LeakMock {

    private ArrayList<String> alist = new ArrayList<>();

    public void fillHeap(int percent_max, int max) {
        int total = max;
        int percenttotal = (percent_max / 100) * total;
        for (int n = 0; n < percenttotal; n++) {
            alist.add(new Date().toString());
        }
    }

    public void offByOneList(int count) {

        for (int n = 0; n < count; n++) {
            alist.add(new Date().toString());
        }

        // typical one off C style programming error
        // should be n>=0, here element 0 is missed!
        for (int n = count - 1; n > 0; n--) {
            alist.remove(n);
        }
        // ergo better use Java 5 style iterator() with hasNext()!

    }
}