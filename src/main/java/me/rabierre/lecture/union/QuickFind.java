package me.rabierre.lecture.union;

/**
 * Quick Find Union. Quick in find slow in union.
 */
public class QuickFind implements Union{
    private int[] data = new int[10];

    public QuickFind() {
        for (int i = data.length - 1; i >= 0; i--) {
            data[i] = i;
        }
    }

    @Override
    public void union(int p, int q) {
        if (data[p] == data[q]) return;

        int index = data[p];
        for (int i = data.length - 1; i >= 0; i--) {
            if (data[i] == index)
                data[i] = data[q];
        }
    }

    @Override
    public boolean isConnected(int p, int q) {
        if (data[p] == data[q]) return true;

        return false;
    }
}
