package ffbit.sorting;

public class ShellSorterTest extends SorterTest {

    public ShellSorterTest(int[] sources, int[] expecteds) {
        super(sources, expecteds);
    }

    @Override
    public void initSorter() {
        sorter = new ShellSorter();
    }

}
