package org.amel.playground.solver;

import org.amel.playground.model.Vote;

import java.util.List;

public interface VoteSolver {
    List<String> solve(List<Vote> votes);
}
