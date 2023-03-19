package KataAcademy.oopAndPackages.ClasssAndObject;

import java.math.*;
import java.util.Arrays;

public class Ex3 {
    public static void main(String[] args) {
        Robot robot = new Robot(0,0, Direction.DOWN);
        moveRobot(robot, -10, 20);
    }

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    public static class Robot {
        int x;
        int y;
        Direction dir;

        public Robot (int x, int y, Direction dir) {
            this.x = x;
            this.y = y;
            this.dir = dir;
        }

        public Direction getDirection() {return dir;}

        public int getX() {return x;}

        public int getY() {return y;}

        public void turnLeft() {
            if      (dir == Direction.UP)    {dir = Direction.LEFT;}
            else if (dir == Direction.DOWN)  {dir = Direction.RIGHT;}
            else if (dir == Direction.LEFT)  {dir = Direction.DOWN;}
            else if (dir == Direction.RIGHT) {dir = Direction.UP;}
        }

        public void turnRight() {
            if      (dir == Direction.UP)    {dir = Direction.RIGHT;}
            else if (dir == Direction.DOWN)  {dir = Direction.LEFT;}
            else if (dir == Direction.LEFT)  {dir = Direction.UP;}
            else if (dir == Direction.RIGHT) {dir = Direction.DOWN;}
        }

        public void stepForward() {
            if (dir == Direction.UP)    {y++;}
            if (dir == Direction.DOWN)  {y--;}
            if (dir == Direction.LEFT)  {x--;}
            if (dir == Direction.RIGHT) {x++;}
        }
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        int dX = robot.getX() - toX;
        int dY = robot.getY() - toY;

        Direction directionX = dX > 0 ? Direction.LEFT : Direction.RIGHT;
        Direction directionY = dY > 0 ? Direction.DOWN : Direction.UP;

        dX = Math.abs(dX);
        dY = Math.abs(dY);

        while (robot.getDirection() != directionX) {
            robot.turnRight();
        }
        while (dX-- > 0) {
            robot.stepForward();
        }
        while (robot.getDirection() != directionY) {
            robot.turnRight();
        }
        while (dY-- > 0) {
            robot.stepForward();
        }
    }
}

