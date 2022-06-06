package ru.unn.phys.javaexampleservice;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Process {

    private int n;

    public Process(int n) {
        this.n = n;
    }

    public double getValue() {

//        double[] integers = new double[n];
//        for (int i = 0; i < n; i++) {
//            integers[i] = ThreadLocalRandom.current().nextDouble();
//        }
//
//        long start = System.nanoTime();
//        Arrays.sort(integers);
//        long stop = System.nanoTime();

//        return (stop - start) / 1_000_000.0;

        return Math.random();
    }
}
