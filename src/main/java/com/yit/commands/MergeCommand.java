package com.yit.commands;

import com.yit.model.*;
import com.yit.store.ObjectStore;
import com.yit.index.Index;
import com.yit.util.FileUtils;
import java.util.*;

// MERGE - join two branches together
//
// USAGE: yit merge <branch>
//
// THREE TYPES OF MERGE:
//
// 1. FAST-FORWARD:
//    If current branch is ancestor of target, just move pointer
//    Before: A -> B -> C (main)
//                       \-> D -> E (feature)
//    After:  A -> B -> C -> D -> E (main)
//
// 2. THREE-WAY MERGE (no conflict):
//    Both branches diverged, find common ancestor, combine
//    Result: auto-merged content
//
// 3. MERGE CONFLICT:
//    Same lines changed on both sides
//    Result: conflict markers in file
//    <<<<<<< HEAD
//    our version
//    =======
//    their version
//    >>>>>>> branch-name
//
// TODO: Implement execute()

public class MergeCommand implements Command {
    @Override
    public void execute(String[] args) throws Exception {
        // TODO: Get current branch tip (HEAD)
        // TODO: Get target branch tip (args[1])
        // TODO: Find common ancestor (merge base)
        //
        // TODO: Check if fast-forward possible:
        //   If current is ancestor of target -> fast-forward
        //   Else -> three-way merge
        //
        // For fast-forward:
        //   TODO: Just update HEAD to target hash
        //
        // For three-way merge:
        //   TODO: Read base tree, ours tree, theirs tree
        //   TODO: For each file:
        //     If same on both sides: keep ours
        //     If only we changed: keep ours
        //     If only they changed: keep theirs
        //     If both changed: attempt merge or mark conflict
        //   TODO: Create merge commit (two parents)
    }

    // Find common ancestor of two commits
    private String findMergeBase(String commit1, String commit2, ObjectStore store)
            throws Exception {
        // TODO: BFS from commit1, collect all ancestors
        // TODO: BFS from commit2, find first commit in commit1's ancestors
        //
        // HINT: Use a Set to track visited commits
        // HINT: Follow parent pointers
        return null; // TODO: implement
    }

    // Check if maybe_ancestor is an ancestor of commit
    private boolean isAncestor(String maybeAncestor, String commit, ObjectStore store)
            throws Exception {
        // TODO: BFS from commit
        // TODO: If we reach maybeAncestor, return true
        // TODO: If queue empty, return false
        return false; // TODO: implement
    }

    // Three-way merge a single file
    private String mergeFile(String baseContent, String oursContent,
                              String theirsContent, String fileName) {
        // TODO: If ours == theirs: return ours
        // TODO: If base == ours: return theirs (they changed, we didn't)
        // TODO: If base == theirs: return ours (we changed, they didn't)
        // TODO: If all different: return conflict markers
        //
        // CONFLICT MARKERS FORMAT:
        // "<<<<<<< HEAD\n"
        // oursContent + "\n"
        // "=======\n"
        // theirsContent + "\n"
        // ">>>>>>> " + branchName + "\n"
        return null; // TODO: implement
    }
}
