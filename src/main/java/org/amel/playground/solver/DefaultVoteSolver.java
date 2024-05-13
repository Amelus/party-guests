package org.amel.playground.solver;

import org.amel.playground.model.Vote;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class DefaultVoteSolver implements VoteSolver {
    @Override
    public List<String> solve(List<Vote> votes) {
        List<String> result = new LinkedList<>();

        votes.stream()
                .sorted(Comparator.comparing(Vote::name, String.CASE_INSENSITIVE_ORDER).thenComparing(Vote::date))
                .forEachOrdered(vote -> {
                    if (result.contains(vote.name().toUpperCase())) {
                        if (!vote.participating()) {
                            result.remove(vote.name().toUpperCase());
                        }
                    } else {
                        if (vote.participating()) {
                            result.add(vote.name().toUpperCase());
                        }
                    }
                });

        return result;
    }
}
