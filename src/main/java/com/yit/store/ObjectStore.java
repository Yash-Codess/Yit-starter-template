package com.yit.store;

import com.yit.constants.Constants;
import com.yit.model.*;
import com.yit.util.FileUtils;
import com.yit.util.HashUtil;

// Content-Addressable Storage - THE core of git
//
// THIS IS THE MOST IMPORTANT CLASS.
//
// Concept: Every object is stored by its SHA-1 hash.
// Hash = Address. Same content = same hash = stored once.
//
// STORAGE ALGORITHM:
// 1. Create header: "<type> <size>\0"
// 2. Concatenate: header + content = store
// 3. Compute SHA-1(store) = hash
// 4. Compress store with zlib
// 5. Write to: .git/objects/<hash[0:2]>/<hash[2:]>
//
// RETRIEVAL ALGORITHM:
// 1. Read from: .git/objects/<hash[0:2]>/<hash[2:]>
// 2. Decompress with zlib
// 3. Find first \0 byte - everything before is header
// 4. Parse header for type and size
// 5. Remaining bytes are content
//
// KEY INSIGHT: The hash is computed BEFORE compression
// The hash is of the uncompressed header+content
//
// TODO: Implement writeObject() and readObject()

public class ObjectStore {

    // Write a git object to the object database
    // Returns the SHA-1 hash of the object
    public String writeObject(GitObject obj) throws Exception {
        // TODO: Get bytes from object
        // TODO: Build header: "<type> <length>\0"
        // TODO: Concatenate header bytes + object bytes
        // TODO: Compute SHA-1 of concatenated bytes
        // TODO: Compress with zlib
        // TODO: Create directory .git/objects/<hash[0:2]>/
        // TODO: Write compressed bytes to .git/objects/<hash[0:2]>/<hash[2:]>
        // TODO: Return hash string
        return null; // TODO: implement
    }

    // Read a git object from the object database
    // Returns the parsed GitObject
    public GitObject readObject(String hash) throws Exception {
        // TODO: Build path: .git/objects/<hash[0:2]>/<hash[2:]>
        // TODO: Read compressed bytes
        // TODO: Decompress with zlib
        // TODO: Find \0 byte position (end of header)
        // TODO: Parse header: split by space -> [type, sizeStr]
        // TODO: Extract content bytes (after \0)
        // TODO: Create appropriate GitObject based on type
        // TODO: Parse content into object fields
        // TODO: Return parsed object
        return null; // TODO: implement
    }

    // Check if an object exists
    public boolean objectExists(String hash) {
        // TODO: Check if file .git/objects/<hash[0:2]>/<hash[2:]> exists
        return false; // TODO: implement
    }

    // Write raw bytes as an object (used by hash-object command)
    public String writeRawObject(String type, byte[] content) throws Exception {
        // TODO: Same as writeObject but takes raw type string and bytes
        // Used when we don't have a GitObject instance yet
        return null; // TODO: implement
    }

    // Helper: Get object path from hash
    private String getObjectPath(String hash) {
        return Constants.OBJECTS_DIR + "/" + hash.substring(0, 2) + "/" + hash.substring(2);
    }
}
