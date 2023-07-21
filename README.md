# Cube
魔方程序
采用Java语言进行开发，并使用MVC（Model-View-Controller）设计模式。

魔方程序
│
├── src
│   ├── controller
│   │   └── CubeController.java
│   │
│   ├── model
│   │   ├── Cube.java
│   │   ├── Face.java
│   │   └── CubeSolver.java
│   │
│   └── view
│       ├── CubeView.java
│       └── Main.java
│
└── resources
    ├── images
    │   ├── face_A.png
    │   ├── face_B.png
    │   └── ...
    └── fxml
        └── cube_view.fxml



controller文件夹：存放与用户交互和控制魔方旋转相关的类。
CubeController.java：控制器类，处理用户交互，并调用模型类的方法进行魔方操作。
model文件夹：存放与魔方的数据结构和算法相关的类。
Cube.java：表示魔方的主要数据结构，包含魔方的状态和旋转方法。
Face.java：表示魔方的一个面，包含面的状态和旋转方法。
CubeSolver.java：魔方求解器，实现自动还原魔方的算法。
view文件夹：存放与图形界面相关的类。
CubeView.java：表示魔方的图形界面，显示魔方状态，并与用户交互。
Main.java：启动应用程序的主类，初始化界面和控制器。
resources文件夹：包含应用程序所需的资源文件，如图像和FXML文件（JavaFX的XML布局文件）。

images文件夹：存放用于表示魔方面的图像文件，每个文件对应不同的颜色或纹理。
fxml文件夹：存放JavaFX的FXML布局文件。
cube_view.fxml：描述魔方图形界面的布局和控件。
