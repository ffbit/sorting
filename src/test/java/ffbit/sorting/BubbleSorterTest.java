package ffbit.sorting;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BubbleSorterTest {
    private int[] sources;
    private int[] expecteds;
    private BubbleSorter sorter;
    
    public BubbleSorterTest(int[] sources, int[] expecteds) {
        this.sources = sources;
        this.expecteds = expecteds;
    }
    
    @Parameters
    public static Collection<?> init() {
        return Arrays.asList(new Object[][] {
                {new int[] {2, 1}, new int[] {1, 2}},
                {new int[] {3, 1, 2}, new int[] {1, 2, 3}}
        });
    }
    
    @Before
    public void initSorter() {
        sorter = new BubbleSorter();
    }

    @Test
    public void testSort() {
        sorter.sort(sources);
        assertArrayEquals(expecteds, sources);
    }
    
}
