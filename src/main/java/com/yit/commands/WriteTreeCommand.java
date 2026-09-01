package com.yit.commands;

import com.yit.model.Tree;
import com.yit.store.ObjectStore;
import com.yit.index.Index;
import java.util.Map;

// WRITE-TREE - create a tree object from the index
//
// USAGE: yit write-tree
//
// WHAT HAPPENS:
// 1. Read all entries from the index
// 2. Build a nested tree structure (handle subdirectories)
// 3. Write tree objects (deepest first)
// 4. Write root tree
// 5. Print root tree hash
//
// ALGORITHM:
// 1. Group index entries by directory
// 2. For each directory:
//    - If it has subdirectories, create subtree objects first
//    - Create tree object for this directory
// 3. Return root tree hash
//
// KEY INSIGHT: Build trees BOTTOM-UP (deepest first)
// You can't hash "src/" until you know the hash of "src/lib/"
//
// TODO: Implement execute()

public class WriteTreeCommand implements Command {
    @Override
    public void execute(String[] args) throws Exception {
        // TODO: Load index
        // TODO: Build nested tree structure from flat index entries
        // TODO: Write trees bottom-up
        // TODO: Print root tree hash
    }

    // Recursive helper to build a tree from a directory map
    private String buildTree(Map<String, Object> treeMap, ObjectStore store)
            throws Exception {
        // TODO: For each entry in treeMap:
        //   If it's a Map (subdirectory):
        //     Recursively build subtree
        //     Add as tree entry: mode "040000"
        //   If it's an IndexEntry (file):
        //     Add as blob entry: mode from entry
        //
        // TODO: Create Tree object, add all entries
        // TODO: Write to store, return hash
        return null; // TODO: implement
    }
}
