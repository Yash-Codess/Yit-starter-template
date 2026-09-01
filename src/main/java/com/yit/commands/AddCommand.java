package com.yit.commands;

import com.yit.index.Index;
import com.yit.model.Blob;
import com.yit.store.ObjectStore;
import com.yit.util.FileUtils;
import java.io.File;

// ADD - stage files to the index
//
// USAGE:
//   yit add <file1> <file2> ...    <- stage specific files
//   yit add .                       <- stage all files
//
// WHAT HAPPENS:
// 1. For each file:
//    a. Read file contents
//    b. Create blob object
//    c. Write blob to object store
//    d. Add file + hash to index
// 2. Save index to .git/index
//
// TODO: Implement execute()

public class AddCommand implements Command {
    @Override
    public void execute(String[] args) throws Exception {
        // TODO: Load existing index
        // TODO: For each file path in args (skip args[0] which is "add"):
        //   If path is ".": add all files in current directory
        //   Else: add specific file
        //
        // For each file:
        //   TODO: Read file bytes
        //   TODO: Create Blob
        //   TODO: Write to ObjectStore (get hash back)
        //   TODO: Add to index: path, hash, "100644"
        //
        // TODO: Save index
        // TODO: Print added files
    }
}
