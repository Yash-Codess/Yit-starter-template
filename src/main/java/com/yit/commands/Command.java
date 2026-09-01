package com.yit.commands;

// Interface for all git commands
//
// Each command implements this interface
// execute() receives the full args array from CLI
//   args[0] = command name ("init", "add", etc.)
//   args[1...] = command-specific arguments
//
// Example for "add file1.txt file2.txt":
//   args = ["add", "file1.txt", "file2.txt"]

public interface Command {
    void execute(String[] args) throws Exception;
}
