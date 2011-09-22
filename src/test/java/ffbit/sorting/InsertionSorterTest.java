package ffbit.sorting;

public class InsertionSorterTest extends SorterTest {

    public InsertionSorterTest(int[] sources, int[] expecteds) {
        super(sources, expecteds);
    }

    @Override
    public void initSorter() {
        sorter = new InsertionSorter();
    }

}
