package Lesson14_testing;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class MainTest {

    @Test
    public void returnNewArray() throws Exception {
        Assert.assertEquals(Arrays.toString(new int[]{1, 7}), Arrays.toString(Main.returnNewArray(new int[]{1, 2, 4, 4, 2, 3, 4, 1, 7})));
        Assert.assertEquals(Arrays.toString(new int[]{3, 2, 2, 3, 6, 1, 7}), Arrays.toString(Main.returnNewArray(new int[]{5, 4, 3, 2, 2, 3, 6, 1, 7})));
        Assert.assertEquals(Arrays.toString(new int[]{2, 3, 0, 1, 7}), Arrays.toString(Main.returnNewArray(new int[]{1, 2, 4, 4, 2, 3, 0, 1, 7})));
        Assert.assertEquals(Arrays.toString(new int[]{}), Arrays.toString(Main.returnNewArray(new int[]{1, 2, 4, 4, 2, 3, 4, 1, 4})));
    }

    @Test
    public void check1_4() {
        Assert.assertFalse(Main.check1_4(new int[]{1, 1, 1, 4, 1, 3, 1, 1,}));
        Assert.assertTrue(Main.check1_4(new int[]{1, 1, 1, 4, 1, 4, 1, 1,}));
        Assert.assertFalse(Main.check1_4(new int[]{1, 1, 1, 1, 1, 1, 1, 1,}));
        Assert.assertFalse(Main.check1_4(new int[]{4, 4, 4, 4, 4, 4, 4, 4,}));
    }
}