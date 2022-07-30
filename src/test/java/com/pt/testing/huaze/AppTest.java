package com.pt.testing.huaze;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testPartition()
    {
        App app = new App();
        assertTrue(Arrays.deepEquals(new int[][]{{1,2}, {3,4}, {5}}, app.partition(new int[]{1,2,3,4,5}, 2)));
        assertTrue(Arrays.deepEquals(new int[][]{{1,2,3}, {4,5}}, app.partition(new int[]{1,2,3,4,5}, 3)));
        assertTrue(Arrays.deepEquals(new int[][]{{1},{2},{3},{4},{5}}, app.partition(new int[]{1,2,3,4,5}, 1)));
        assertTrue(Arrays.deepEquals(new int[][]{{1,2,3,4,5}}, app.partition(new int[]{1,2,3,4,5}, 7)));
    }
}
