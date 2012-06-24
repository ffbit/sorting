package ffbit.sorting;

public class MergeSorterTest extends SorterTest {

    public MergeSorterTest(int[] sources, int[] expecteds) {
        super(sources, expecteds);
    }

    @Override
    public void initSorter() {
        sorter = new MergeSorter();
    }

}
