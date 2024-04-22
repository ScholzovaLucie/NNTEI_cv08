package org.example;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Rule> rules = new ArrayList<>();
        rules.add(new Rule("b", "bbb"));
        rules.add(new Rule("babbb", "ba"));
        rules.add(new Rule("ba", "a"));

        int maxDepth = 10;
        PostCorrespondenceProblem pkp = new PostCorrespondenceProblem(maxDepth, rules);
        pkp.findSolution("", "");

        System.out.println("------------");
        // Druhý test
        rules = new ArrayList<>();
        rules.add(new Rule("a", "aa"));
        rules.add(new Rule("bb", "b"));
        rules.add(new Rule("aab", "ab"));
        rules.add(new Rule("bba", "ba"));
        rules.add(new Rule("aba", "aab"));

        pkp = new PostCorrespondenceProblem(maxDepth, rules);
        pkp.findSolution("", "");
    }
}