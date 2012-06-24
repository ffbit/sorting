package ffbit.sorting;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ BubbleSorterTest.class, SelectionSorterTest.class,
    InsertionSorterTest.class, ShellSorterTest.class,
    AbstractSorterTest.class, MergeSorterTest.class })
public class AllTests {

}
