package com.yit.commands;

import com.yit.index.Index;
import com.yit.store.ObjectStore;
import com.yit.util.FileUtils;
import java.util.*;

// DIFF - show differences
//
// USAGE:
//   yit diff              <- diff between index and working directory
//   yit diff --staged     <- diff between HEAD and index
//
// OUTPUT FORMAT (unified diff):
// diff --git a/file.txt b/file.txt
// index abc123..def456 100644
// --- a/file.txt
// +++ b/file.txt
// @@ -1,4 +1,5 @@
//  unchanged line
// -removed line
// +added line
//
// SIMPLE IMPLEMENTATION: line-by-line comparison
// (Real git uses Myers diff algorithm - more complex)
//
// TODO: Implement execute()

public class DiffCommand implements Command {
    @Override
    public void execute(String[] args) throws Exception {
        // TODO: Determine diff mode (index vs disk, or HEAD vs index)
        // TODO: For each file that differs:
        //   Show unified diff format
    }

    // Compare two versions of a file line by line
    private List<String> diffLines(List<String> oldLines, List<String> newLines) {
        // TODO: Simple line-by-line diff
        // Compare line by line
        // Lines only in old: prefixed with "-"
        // Lines only in new: prefixed with "+"
        // Same lines: prefixed with " "
        //
        // HINT: Can use a simple approach:
        //   For each line, check if it exists in the other version
        //   Or implement a proper LCS (Longest Common Subsequence) algorithm
        return new ArrayList<>(); // TODO: implement
    }
}
