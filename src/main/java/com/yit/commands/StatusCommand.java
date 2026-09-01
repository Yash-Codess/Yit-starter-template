package com.yit.commands;

import com.yit.index.Index;
import com.yit.model.Tree;
import com.yit.store.ObjectStore;
import com.yit.util.FileUtils;
import java.util.*;

// STATUS - show working tree status
//
// USAGE: yit status
//
// THREE-WAY COMPARISON:
// HEAD (last commit) vs Index (staging) vs Working Directory
//
// OUTPUT SECTIONS:
// "Changes to be committed:"     <- in index but not in HEAD
// "Changes not staged for commit:" <- modified on disk but not in index
// "Untracked files:"             <- on disk but not in index
//
// TODO: Implement execute()

public class StatusCommand implements Command {
    @Override
    public void execute(String[] args) throws Exception {
        // TODO: Load HEAD tree (from last commit)
        // TODO: Load index
        // TODO: Walk working directory files
        //
        // TODO: Compare:
        //   HEAD vs Index -> "Changes to be committed"
        //   Index vs Disk -> "Changes not staged"
        //   Disk only -> "Untracked files"
        //
        // TODO: Print formatted output
    }

    // Get flat map of path -> hash from a tree object
    private Map<String, String> getTreeFiles(String treeHash, ObjectStore store)
            throws Exception {
        // TODO: Recursively read tree and all subtrees
        // TODO: Build map of path -> blob hash
        return new HashMap<>(); // TODO: implement
    }
}
