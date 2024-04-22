package org.example;

import java.util.ArrayList;
import java.util.List;

public class PostCorrespondenceProblem {
    private final int maxDepth;
    private final List<Rule> rules;
    private final List<Integer> sequence;
    public PostCorrespondenceProblem(int maxDepth, List<Rule> rules){
        this.maxDepth = maxDepth;
        this.rules = rules;
        this.sequence = new ArrayList<>();
    }

    public boolean findSolution(String currentLeft, String currentRight) {
        if (currentLeft.equals(currentRight) && !currentLeft.isEmpty()) {
            System.out.println("Solution found: " + this.sequence);
            printSequence();
            System.out.println("Generated string: " + currentLeft);
            return true;
        }

        if (this.sequence.size() >= this.maxDepth) {
            return false;
        }

        for (int i = 0; i < this.rules.size(); i++) {
            Rule rule = this.rules.get(i);
            this.sequence.add(i + 1);
            if (findSolution(currentLeft + rule.left, currentRight + rule.right)) {
                return true;
            }
            sequence.remove(this.sequence.size() - 1);
        }

        return false;
    }

    public void printSequence(){
        for (int index : sequence){
            System.out.print(rules.get(index - 1).left + "|");
        }
        System.out.println();
        for (int index : sequence){
            System.out.print(rules.get(index - 1).right + "|");
        }
        System.out.println();
    }
}
