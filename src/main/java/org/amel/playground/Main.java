package org.amel.playground;

import org.amel.playground.reader.VoteReader;
import org.amel.playground.solver.DefaultVoteSolver;

import java.io.IOException;

public class Main {
    private static final String CSV_FILE = "/sample.csv";

    public static void main(String[] args) throws IOException {
        new DefaultVoteSolver().solve(VoteReader.read(CSV_FILE)).forEach(System.out::println);
    }
}