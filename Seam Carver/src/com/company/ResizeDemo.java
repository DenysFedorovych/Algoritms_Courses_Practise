package com.company;

import edu.princeton.cs.algs4.Picture;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Stopwatch;

import java.util.Scanner;

public class ResizeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("For example we are seaming picture of chameleon, here it is");
        Picture inputImg = new Picture("chameleon.png");
        inputImg.show();
        StdOut.printf("Image is %d columns by %d rows\n", inputImg.width(), inputImg.height());
        System.out.println("What resulting height of image should be? (write)");
        int removeRows = scanner.nextInt();
        System.out.println("What resulting width of image should be? (write)");
        int removeColumns = scanner.nextInt();
        System.out.println("Wait a minute");
        SeamCarver sc = new SeamCarver(inputImg);

        //Stopwatch sw = new Stopwatch();

        for (int i = 0; i < inputImg.height()-removeRows; i++) {
            int[] horizontalSeam = sc.findHorizontalSeam();
            sc.removeHorizontalSeam(horizontalSeam);
        }

        for (int i = 0; i < inputImg.width()-removeColumns; i++) {
            int[] verticalSeam = sc.findVerticalSeam();
            sc.removeVerticalSeam(verticalSeam);
        }
        Picture outputImg = sc.picture();
        System.out.println("Here we are!");
        outputImg.show();
    }

}
