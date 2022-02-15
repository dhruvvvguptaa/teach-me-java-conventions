package Test;

import org.junit.Test;
import powerpackage.powerFinder;

public class powerFinderTest {

    @Test
    public void oneRaisedToOneIsOne() {
        assert powerFinder.powerFunction(1,1) == 1;
    }

    @Test
    public void twoRaisedToOneIsTwo() {
        assert powerFinder.powerFunction(2,1) == 2;
    }

    @Test
    public void twoRaisedToTwoIsFour() {
        assert powerFinder.powerFunction(2, 2) == 4;
    }

    @Test
    public void threeRaisedToTwoIsNine() {
        assert powerFinder.powerFunction(3, 2) == 3*3;
    }
}