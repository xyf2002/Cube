package Conroller;// CubeController.java

import model.Cube;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;


public class CubeController {
    @FXML
    private GridPane cubeGridPane;

    private Cube cube;

    public CubeController() {
        cube = new Cube();
    }

    // Method to initialize the graphical representation of the cube
    @FXML
    private void initialize() {
        updateCubeView();
    }

    // Method to handle the rotation of the top face clockwise
    @FXML
    private void rotateTopClockwise() {
        cube.rotateTopClockwise();
        updateCubeView();
    }

    // Method to handle the rotation of the top face counter-clockwise
    @FXML
    private void rotateTopCounterClockwise() {
        cube.rotateTopCounterClockwise();
        updateCubeView();
    }

    // Method to handle the rotation of the bottom face clockwise
    @FXML
    private void rotateBottomClockwise() {
        cube.rotateBottomClockwise();
        updateCubeView();
    }

    // Method to handle the rotation of the bottom face counter-clockwise
    @FXML
    private void rotateBottomCounterClockwise() {
        cube.rotateBottomCounterClockwise();
        updateCubeView();
    }

    // Method to handle the rotation of the left face clockwise
    @FXML
    private void rotateLeftClockwise() {
        cube.rotateLeftClockwise();
        updateCubeView();
    }

    // Method to handle the rotation of the left face counter-clockwise
    @FXML
    private void rotateLeftCounterClockwise() {
        cube.rotateLeftCounterClockwise();
        updateCubeView();
    }

    // Method to handle the rotation of the right face clockwise
    @FXML
    private void rotateRightClockwise() {
        cube.rotateRightClockwise();
        updateCubeView();
    }

    // Method to handle the rotation of the right face counter-clockwise
    @FXML
    private void rotateRightCounterClockwise() {
        cube.rotateRightCounterClockwise();
        updateCubeView();
    }

    // Method to handle the rotation of the front face clockwise
    @FXML
    private void rotateFrontClockwise() {
        cube.rotateFrontClockwise();
        updateCubeView();
    }

    // Method to handle the rotation of the front face counter-clockwise
    @FXML
    private void rotateFrontCounterClockwise() {
        cube.rotateFrontCounterClockwise();
        updateCubeView();
    }

    // Method to handle the rotation of the back face clockwise
    @FXML
    private void rotateBackClockwise() {
        cube.rotateBackClockwise();
        updateCubeView();
    }

    // Method to handle the rotation of the back face counter-clockwise
    @FXML
    private void rotateBackCounterClockwise() {
        cube.rotateBackCounterClockwise();
        updateCubeView();
    }

    // Method to update the graphical representation of the cube
    private void updateCubeView() {
        char[][][] cubeState = cube.getCubeState();
        // TODO: Update the graphical representation of the cube based on the cubeState
    }
}

