package model;

public class Face {
    private char[][] state;

    public Face(char[][] initialState) {
        state = initialState;
    }


    public void initializeFace() {
        char[] colors = {'R', 'B', 'G', 'O', 'W', 'Y'};
        int colorIndex = 0;

        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                state[x][y] = colors[colorIndex% colors.length];
                colorIndex++;
            }
        }
    }

    // 获取面的状态
    public char[][] getFaceState() {
        return state;
    }

    // 顺时针旋转
    public void rotateClockwise() {
        char[][] newState = new char[3][3];
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                newState[x][y] = state[2 - y][x];
            }
        }
        state = newState;
    }


    // 逆时针旋转
    public void rotateCounterClockwise() {
        // 旋转面的代码实现
        char[][] newState = new char[3][3];
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                newState[x][y] = state[y][2 - x];
            }
        }
        state = newState;
    }
}



