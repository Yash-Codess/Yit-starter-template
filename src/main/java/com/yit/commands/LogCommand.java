package com.yit.commands;

import com.yit.model.Commit;
import com.yit.store.ObjectStore;

// LOG - display commit history
//
// USAGE: yit log
//        yit log <hash>
//
// WHAT HAPPENS:
// 1. Start from HEAD (or given hash)
// 2. Read commit object
// 3. Print formatted commit info
// 4. Follow parent pointer to previous commit
// 5. Repeat until no parent
//
// OUTPUT FORMAT:
// commit <hash>
// Author: <author>
// Date: <formatted date>
//
//     <message>
//
// TODO: Implement execute()

public class LogCommand implements Command {
    @Override
    public void execute(String[] args) throws Exception {
        // TODO: Determine starting hash
        //   If args[1] exists, use that hash
        //   Else, resolve HEAD -> branch ref -> commit hash
        //
        // TODO: Loop:
        //   Read commit from store
        //   Print formatted commit
        //   If commit has parent, continue with parent hash
        //   Else, stop
    }

    // Resolve HEAD to a commit hash
    private String resolveHead() throws Exception {
        // TODO: Read .git/HEAD
        //   If starts with "ref: ":
        //     Extract ref path (e.g., "refs/heads/main")
        //     Read .git/refs/heads/main -> get hash
        //   Else:
        //     It's a direct hash (detached HEAD)
        return null; // TODO: implement
    }

    // Format commit for display
    private String formatCommit(Commit commit, String hash) {
        // TODO: Format as:
        // "commit " + hash + "\n"
        // "Author: " + commit.getAuthor() + "\n"
        // "Date: " + formattedDate + "\n"
        // "\n"
        // "    " + commit.getMessage() + "\n"
        return null; // TODO: implement
    }
}
