package Test;
import model.Cube;
import model.Face;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class FaceTest {
    private Face face;


    @Before
    public void setUp() {
        char[][] initialState = new char[3][3];
        face = new Face(initialState);
    }

    @Test
    public void testInitializeFace() {
        face.initializeFace();
        char[][] expectedState = {
                {'R', 'B', 'G'},
                {'O', 'W', 'Y'},
                {'R', 'B', 'G'}
        };
        char[][] actualState = face.getFaceState();
        Assert.assertArrayEquals(expectedState, actualState);
    }

    @Test
    public void testRotateClockwise() {
        char[][] initialState = {
                {'R', 'B', 'G'},
                {'O', 'W', 'Y'},
                {'R', 'B', 'G'}
        };
        face = new Face(initialState);
        face.rotateClockwise();

        char[][] expectedState = {
                {'R', 'O', 'R'},
                {'B', 'W', 'B'},
                {'G', 'Y', 'G'}
        };
        char[][] actualState = face.getFaceState();
        Assert.assertArrayEquals(expectedState, actualState);
    }




    @Test
    public void testRotateCounterClockwise() {
        char[][] initialState = {
                {'R', 'B', 'G'},
                {'O', 'W', 'Y'},
                {'R', 'B', 'G'}
        };
        face = new Face(initialState);
        face.rotateCounterClockwise();

        char[][] expectedState = {
                {'G', 'Y', 'G'},
                {'B', 'W', 'B'},
                {'R', 'O', 'R'}
        };
        char[][] actualState = face.getFaceState();
        Assert.assertArrayEquals(expectedState, actualState);
    }

}
