package me.rabierre.lecture.union;

/**
 * Weighted Quick Union. Improved from Quick Union
 */
public class WeightedQuickUnion implements Union {
    private int[] data = new int[10];
    private int[] treeSize = new int[10];

    public WeightedQuickUnion() {
        for (int i = data.length - 1; i >= 0; i--) {
            data[i] = i;
        }
        for (int i = treeSize.length - 1; i >= 0; i--) {
            treeSize[i] = 1;
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

        if (treeSize[p] > treeSize[q]) {
            data[q] = data[p];  // q's root become root of p's child
            treeSize[p] += treeSize[q];
        } else {
            data[p] = data[q];  // p's root become root of q's child
            treeSize[q] += treeSize[p];
        }
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
