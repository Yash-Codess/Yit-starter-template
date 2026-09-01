package com.yit.model;

import com.yit.constants.Constants;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// TREE - stores a directory listing
//
// A tree object is a list of entries, each pointing to a blob or subtree.
//
// BINARY FORMAT (per entry):
// <mode> <name>\0<20-byte-raw-sha1>
//
// EXAMPLE:
// Entry 1: "100644 README.md\0" + <20 bytes of hash>
// Entry 2: "040000 src\0" + <20 bytes of hash>
//
// CRITICAL DETAILS:
// 1. Mode is ASCII string, NOT binary
// 2. Name has NO path separators - just filename
// 3. Hash is 20 BINARY bytes (not 64-char hex string!)
// 4. Entries are SORTED: directories get trailing "/" for comparison
//    "foo" (dir) sorts as "foo/" which comes AFTER "foo-bar" (file)
//
// SORTING RULE:
// if (entry is directory) sortKey = name + "/";
// else sortKey = name;
// Sort by sortKey
//
// TODO: Implement getBytes() that encodes tree in binary format

public class Tree extends GitObject {
    private final List<TreeEntry> entries = new ArrayList<>();

    public Tree() {
        this.type = Constants.TREE_TYPE;
    }

    public void addEntry(String mode, String name, String hash) {
        entries.add(new TreeEntry(mode, name, hash));
    }

    @Override
    public byte[] getBytes() {
        // TODO: Sort entries using the directory trailing-slash rule
        // TODO: For each entry:
        //   1. Create string: "<mode> <name>\0"
        //   2. Convert hash hex string to 20 binary bytes
        //   3. Concatenate: header bytes + hash bytes
        // TODO: Return all entries concatenated
        //
        // HINT: Use Comparator.comparing with a custom sort key
        // HINT: Use Integer.parseInt(hash, 16) or manual hex conversion
        return null; // TODO: implement
    }

    // Parse a tree object's bytes into this tree's entries
    public void parseFromBytes(byte[] data) {
        // TODO: Parse binary format
        // The data is a sequence of entries:
        //   - Read until space: mode (ASCII)
        //   - Read until \0: name (ASCII)
        //   - Read next 20 bytes: hash (binary -> convert to hex)
        //   - Repeat until end of data
        //
        // HINT: Track position index, scan for ' ' and '\0' bytes
    }

    public List<TreeEntry> getEntries() {
        return entries;
    }

    // Inner class for tree entries
    public static class TreeEntry {
        public final String mode;
        public final String name;
        public final String hash;  // hex string

        public TreeEntry(String mode, String name, String hash) {
            this.mode = mode;
            this.name = name;
            this.hash = hash;
        }

        public boolean isDir() {
            return Constants.DIR_MODE.equals(mode);
        }
    }
}
