package me.rabierre.lecture.union;

import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: seojihye
 * Date: 13. 3. 5.
 * Time: 오전 1:27
 * To change this template use File | Settings | File Templates.
 */
public class TestWeightedQuickUnion {
    @Test
    public void test() {
        WeightedQuickUnion union = new WeightedQuickUnion();

        union.union(1, 2);
        assertTrue(union.isConnected(1, 2));

        union.union(2, 3);
        assertTrue(union.isConnected(1, 3));
        assertTrue(union.isConnected(2, 3));

        union.union(4, 5);
        assertTrue(union.isConnected(4, 5));
        assertFalse(union.isConnected(1, 4));

        // data[5]가 3이 되어야함
        union.union(1, 4);
        assertTrue(union.isConnected(1, 4));
    }
}
