package com.yit.commands;

import com.yit.model.Blob;
import com.yit.store.ObjectStore;
import com.yit.util.FileUtils;

// HASH-OBJECT - compute hash and optionally store a file
//
// USAGE:
//   yit hash-object <file>           <- print hash, don't store
//   yit hash-object -w <file>        <- print hash AND store
//
// This command:
// 1. Reads the file
// 2. Creates a blob object
// 3. Computes SHA-1 hash
// 4. Optionally writes to object store
//
// TODO: Implement execute()

public class HashObjectCommand implements Command {
    @Override
    public void execute(String[] args) throws Exception {
        // TODO: Parse args
        //   Check if args[1] is "-w" (write flag)
        //   File is args[1] or args[2] depending on -w
        // TODO: Read file bytes
        // TODO: Create Blob from bytes
        // TODO: If -w flag, write to ObjectStore
        // TODO: Print the hash to stdout
    }
}
