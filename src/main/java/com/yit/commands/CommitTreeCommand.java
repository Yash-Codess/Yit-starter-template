package com.yit.commands;

import com.yit.model.Commit;
import com.yit.store.ObjectStore;

// COMMIT-TREE - create a commit object from a tree
//
// USAGE: yit commit-tree <tree-hash> -m "message"
//        yit commit-tree <tree-hash> -p <parent-hash> -m "message"
//
// WHAT HAPPENS:
// 1. Read tree hash and optional parent hash
// 2. Get author info (from env or default)
// 3. Create commit object
// 4. Write to object store
// 5. Print commit hash
//
// TODO: Implement execute()

public class CommitTreeCommand implements Command {
    @Override
    public void execute(String[] args) throws Exception {
        // TODO: Parse args
        //   args[1] = tree hash
        //   args[2] = "-m" or "-p"
        //   args[3] = message or parent hash
        //   If "-p", args[4] = "-m", args[5] = message
        //
        // TODO: Get author info
        //   Check env: GIT_AUTHOR_NAME, GIT_AUTHOR_EMAIL
        //   Or use default: "Yash <yash@example.com>"
        //
        // TODO: Get current timestamp and timezone
        //
        // TODO: Create Commit object
        //
        // TODO: Write to ObjectStore
        //
        // TODO: Print commit hash
    }
}
