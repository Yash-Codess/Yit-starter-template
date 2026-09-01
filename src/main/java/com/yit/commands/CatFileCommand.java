package com.yit.commands;

import com.yit.model.*;
import com.yit.store.ObjectStore;

// CAT-FILE - display object contents
//
// USAGE:
//   yit cat-file -t <hash>    <- print type ("blob", "tree", "commit")
//   yit cat-file -p <hash>    <- pretty-print contents
//
// For blobs: prints raw file content
// For trees: prints entry list (mode type hash\tname)
// For commits: prints commit details
//
// TODO: Implement execute()

public class CatFileCommand implements Command {
    @Override
    public void execute(String[] args) throws Exception {
        // TODO: Parse args
        //   args[1] = flag ("-t" or "-p")
        //   args[2] = hash
        // TODO: Read object from ObjectStore
        // TODO: If -t, print object.getType()
        // TODO: If -p:
        //   If blob: print content as string
        //   If tree: print formatted entries
        //   If commit: print formatted commit info
    }
}
