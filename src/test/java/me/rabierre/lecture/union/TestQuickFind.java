package me.rabierre.lecture.union;

import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: seojihye
 * Date: 13. 3. 5.
 * Time: 오전 1:03
 * To change this template use File | Settings | File Templates.
 */
public class TestQuickFind {
    @Test
    public void test() {
        QuickFind union = new QuickFind();

        union.union(1,2);
        assertTrue(union.isConnected(1,2));
        assertTrue(union.isConnected(2,1));
        assertFalse(union.isConnected(1,3));

        union.union(2, 3);
        assertTrue(union.isConnected(2, 3));
        assertTrue(union.isConnected(1, 3));
    }
}
