package org.example;

public class Rule {
    String left;
    String right;

    Rule(String left, String right) {
        this.left = left;
        this.right = right;
    }

   public String toString(){
        return "Left: " + left + ", Right: " + right;
    }
}
