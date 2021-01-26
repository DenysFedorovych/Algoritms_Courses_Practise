//package com.company;

import java.util.Comparator;
import edu.princeton.cs.algs4.StdDraw;

public class Point implements Comparable<Point> {

    private final int x;     // x-coordinate of this point
    private final int y;     // y-coordinate of this point

    public Point(int x, int y) {
        /* DO NOT MODIFY */
        this.x = x;
        this.y = y;
    }

    public void draw() {
        /* DO NOT MODIFY */
        StdDraw.point(x, y);
    }

    public void drawTo(Point that) {
        /* DO NOT MODIFY */
        StdDraw.line(this.x, this.y, that.x, that.y);
    }

    /**
     * Returns the slope between this point and the specified point.
     * Formally, if the two points are (x0, y0) and (x1, y1), then the slope
     * is (y1 - y0) / (x1 - x0). For completeness, the slope is defined to be
     * +0.0 if the line segment connecting the two points is horizontal;
     *  if the line segment is vertical;
     * and Double.NEGATIVE_INFINITY if (x0, y0) and (x1, y1) are equal.
     *
     * @param  that the other point
     * @return the slope between this point and the specified point
     */
    public double slopeTo(Point that) {
        if (that.x == this.x && that.y != this.y)
        return Double.POSITIVE_INFINITY;
        else {
            if (that.y == this.y && that.x == this.x)
            return Double.NEGATIVE_INFINITY;
            if(that.y == this.y && that.x != this.x)
                return 0.0;
            else
            {double k = (double) (that.y - this.y)/(that.x - this.x);
                return  k;}
        }


    }

    /**
     * Compares two points by y-coordinate, breaking ties by x-coordinate.
     * Formally, the invoking point (x0, y0) is less than the argument point
     * (x1, y1) if and only if either y0 < y1 or if y0 = y1 and x0 < x1.
     *
     * @param  that the other point
     * @return the value <tt>0</tt> if this point is equal to the argument
     *         point (x0 = x1 and y0 = y1);
     *         a negative integer if this point is less than the argument
     *         point; and a positive integer if this point is greater than the
     *         argument point
     */
    public int compareTo(Point that) {
        if (this.y < that.y || (this.y == that.y && this.x < that.x))
            return -1;
        else {
            if (that.y == this.y && that.x == this.x)
                return 0;
            else
            return 1;
        }

    }

    /**
     * Compares two points by the slope they make with this point.
     * The slope is defined as in the slopeTo() method.
     *
     * @return the Comparator that defines this ordering on points
     * The slopeOrder() method should return a comparator that compares its two argument points by the slopes they make
     * with the invoking point (x0, y0).
     * Formally, the point (x1, y1) is less than the point (x2, y2) if and only
     * if the slope (y1 − y0) / (x1 − x0) is less than the slope (y2 − y0) / (x2 − x0).
     * Treat horizontal, vertical, and degenerate line segments as in the slopeTo() method.
     */
    private class sortPoint implements Comparator<Point> {
        Point p;
        private sortPoint(Point p){this.p = p;}
            //@override
            public int compare(Point a, Point b)
            {
                if (p.slopeTo(a) <p.slopeTo(b))
                    return -1;
                else {
                    if (p.slopeTo(a) == p.slopeTo(b))
                        return 0;
                    else
                        return 1;
                }
            }
        }

    public Comparator<Point> slopeOrder() {
        return new sortPoint(this);
    }


    /**
     * Returns a string representation of this point.
     * This method is provide for debugging;
     * your program should not rely on the format of the string representation.
     *
     * @return a string representation of this point
     */
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    /**
     * Unit tests the Point data type.
     */
    public static void main(String[] args) {
        /* YOUR CODE HERE */
    }
}