package com.yit;

// Entry point - parses CLI args and delegates to Yit.java
//
// HOW IT WORKS:
// java -jar yit.jar <command> [args...]
// Example: java -jar yit.jar init
//          java -jar yit.jar add file1.txt file2.txt
//
// TODO: Parse args and call Yit.getInstance().execute(args)

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: yit <command> [args]");
            System.out.println("Commands: init, add, commit, log, ...");
            return;
        }
        try {
            Yit.getInstance().execute(args);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
