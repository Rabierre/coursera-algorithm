package me.rabierre.lecture.union;

/**
 * Quick union. find and union best case : O(1), worst case : O(N-1)
 */
public class QuickUnion implements Union {
    private int[] data = new int[10];

    public QuickUnion() {
        for (int i = data.length - 1; i >= 0; i--) {
            data[i] = i;
        }
    }

    @Override
    public void union(int p, int q) {
        while (p != data[p]) {
            p = data[p];
        }
        while (q != data[q]) {
            q = data[q];
        }

        data[p] = data[q];
    }

    @Override
    public boolean isConnected(int p, int q) {
        while (p != data[p]) {
            p = data[p];
        }
        while (q != data[q]) {
            q = data[q];
        }

        return data[p] == data[q];
    }
}
