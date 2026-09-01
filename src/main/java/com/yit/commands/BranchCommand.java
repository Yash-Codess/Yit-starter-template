package com.yit.commands;

import com.yit.constants.Constants;
import com.yit.util.FileUtils;

// BRANCH - list, create, or delete branches
//
// USAGE:
//   yit branch              <- list all branches
//   yit branch <name>       <- create new branch at HEAD
//   yit branch -d <name>    <- delete branch
//
// WHAT IS A BRANCH?
// A branch is just a file containing a commit hash!
// .git/refs/heads/main contains the hash of the latest commit on main
//
// BRANCHING IS FAST because it's just writing a 40-char string to a file
//
// TODO: Implement execute()

public class BranchCommand implements Command {
    @Override
    public void execute(String[] args) throws Exception {
        // TODO: If no args: list branches
        //   Read all files in .git/refs/heads/
        //   Print each branch name
        //   Mark current branch with "* "
        //
        // TODO: If args[1] is not "-d": create branch
        //   Resolve HEAD to commit hash
        //   Write hash to .git/refs/heads/<name>
        //
        // TODO: If args[1] is "-d": delete branch
        //   Delete .git/refs/heads/<name>
    }

    // Get current branch name from HEAD
    private String getCurrentBranch() throws Exception {
        // TODO: Read .git/HEAD
        //   If "ref: refs/heads/main", return "main"
        return null; // TODO: implement
    }
}
