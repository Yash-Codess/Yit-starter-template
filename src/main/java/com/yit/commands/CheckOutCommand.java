package com.yit.commands;

import com.yit.model.*;
import com.yit.store.ObjectStore;
import com.yit.index.Index;
import com.yit.constants.Constants;
import com.yit.util.FileUtils;
import java.util.*;

// CHECKOUT - switch branches or restore files
//
// USAGE:
//   yit checkout <branch>     <- switch to branch
//   yit checkout <commit>     <- detached HEAD
//   yit checkout -- <file>    <- restore file from HEAD
//
// WHAT HAPPENS (branch switch):
// 1. Read target commit
// 2. Get target tree
// 3. Remove files not in target
// 4. Write files from target
// 5. Update index
// 6. Update HEAD
//
// TODO: Implement execute()

public class CheckOutCommand implements Command {
    @Override
    public void execute(String[] args) throws Exception {
        // TODO: Parse args
        //   If args[1] is "--": checkout file
        //   Else: checkout branch/commit
        //
        // For branch checkout:
        //   TODO: Resolve target to commit hash
        //   TODO: Read target commit
        //   TODO: Read target tree (recursively)
        //   TODO: Read current tree (from HEAD)
        //   TODO: Delete files in current but not in target
        //   TODO: Write files from target
        //   TODO: Update index
        //   TODO: Update HEAD (symbolic ref for branch, direct hash for commit)
    }

    // Recursively read tree into flat map: path -> blob content
    private Map<String, byte[]> getTreeContents(String treeHash, ObjectStore store)
            throws Exception {
        // TODO: Recursively traverse tree
        // TODO: For each blob, read content
        // TODO: Build map of relative path -> file bytes
        return new HashMap<>(); // TODO: implement
    }
}
