package model;

public class Cube {
    private Face[] faces;

    public Cube() {
        faces = new Face[6];
        char[][] frontInitialState = initializeFaceState('R');
        char[][] backInitialState = initializeFaceState('B');
        char[][] topInitialState = initializeFaceState('G');
        char[][] bottomInitialState = initializeFaceState('O');
        char[][] leftInitialState = initializeFaceState('W');
        char[][] rightInitialState = initializeFaceState('Y');

        faces[0] = new Face(frontInitialState); // 前面（Front）
        faces[1] = new Face(backInitialState); // 后面（Back）
        faces[2] = new Face(topInitialState); // 顶面（Top）
        faces[3] = new Face(bottomInitialState); // 底面（Bottom）
        faces[4] = new Face(leftInitialState); // 左面（Left）
        faces[5] = new Face(rightInitialState); // 右面（Right）
    }


    private char[][] initializeFaceState(char color) {
        char[][] initialState = new char[3][3];
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                initialState[x][y] = color;
            }
        }
        return initialState;
    }

    // 获取魔方的状态
    public char[][][] getCubeState() {
        char[][][] cubeState = new char[6][3][3];
        for (int face = 0; face < 6; face++) {
            cubeState[face] = faces[face].getFaceState();
        }
        return cubeState;
    }

    // 顶面顺时针旋转
    public void rotateTopClockwise() {
        faces[2].rotateClockwise();
        char[] tempRow = new char[3];
        // Save a copy of the bottom row for later use
        for (int i = 0; i < 3; i++) {
            tempRow[i] = faces[3].getFaceState()[2][i];
        }
        // Move Left face to Bottom face
        for (int i = 0; i < 3; i++) {
            faces[3].getFaceState()[2][i] = faces[4].getFaceState()[2 - i][2];
        }
        // Move Right face to Left face
        for (int i = 0; i < 3; i++) {
            faces[4].getFaceState()[i][2] = faces[5].getFaceState()[2 - i][0];
        }
        // Move Top face to Right face
        for (int i = 0; i < 3; i++) {
            faces[5].getFaceState()[i][0] = faces[2].getFaceState()[0][i];
        }
        // Move saved bottom row to Top face
        for (int i = 0; i < 3; i++) {
            faces[2].getFaceState()[0][i] = tempRow[i];
        }
    }

    /**
     * 顶面逆时针旋转
     * 
     */


    public void rotateTopCounterClockwise() {
        
        
    }

    public void rotateBottomClockwise() {
    }

    public void rotateBottomCounterClockwise() {
    }

    public void rotateLeftClockwise() {
    }

    public void rotateLeftCounterClockwise() {
    }

    public void rotateRightClockwise() {
    }

    public void rotateRightCounterClockwise() {
    }

    public void rotateFrontClockwise() {
    }

    public void rotateFrontCounterClockwise() {
    }

    public void rotateBackClockwise() {
    }

    public void rotateBackCounterClockwise() {
    }
}
