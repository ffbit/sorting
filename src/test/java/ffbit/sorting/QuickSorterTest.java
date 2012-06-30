package ffbit.sorting;

public class QuickSorterTest extends SorterTest {

    public QuickSorterTest(int[] sources, int[] expecteds) {
        super(sources, expecteds);
    }

    @Override
    public void initSorter() {
        sorter = new QuickSorter();
    }

}
