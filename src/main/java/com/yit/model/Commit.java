package com.yit.model;

import com.yit.constants.Constants;

// COMMIT - stores a snapshot with metadata
//
// A commit is plain text pointing to a tree and parent(s).
//
// FORMAT:
// tree <tree-sha1>
// parent <parent-sha1>        (zero or more)
// author <name> <email> <timestamp> <timezone>
// committer <name> <email> <timestamp> <timezone>
//
// <blank line>
// <commit message>
//
// EXAMPLE:
// tree 4b825dc642cb6eb9a060e54bf8d69288fbee4904
// parent a1b2c3d4e5f6a1b2c3d4e5f6a1b2c3d4e5f6a1b2
// author Yash <yash@email.com> 1700000000 +0000
// committer Yash <yash@email.com> 1700000000 +0000
//
// Initial commit
//
// KEY INSIGHT: Commits form a DAG (Directed Acyclic Graph)
// Each commit points to its parent(s), creating a chain of history
//
// TODO: Implement getBytes() and parsing

public class Commit extends GitObject {
    private String treeHash;
    private String parentHash;  // null for first commit
    private String author;
    private String committer;
    private String message;

    public Commit() {
        this.type = Constants.COMMIT_TYPE;
    }

    // Full constructor for creating commits
    public Commit(String treeHash, String parentHash,
                  String author, String committer, String message) {
        this.type = Constants.COMMIT_TYPE;
        this.treeHash = treeHash;
        this.parentHash = parentHash;
        this.author = author;
        this.committer = committer;
        this.message = message;
    }

    @Override
    public byte[] getBytes() {
        // TODO: Build commit string in exact format
        // Lines separated by \n
        // Blank line between headers and message
        // Timestamp: System.currentTimeMillis() / 1000
        // Timezone: offset from UTC in +HHMM or -HHMM format
        //
        // FORMAT:
        // "tree " + treeHash + "\n"
        // "parent " + parentHash + "\n"  (only if parentHash != null)
        // "author " + author + " " + timestamp + " " + timezone + "\n"
        // "committer " + committer + " " + timestamp + " " + timezone + "\n"
        // "\n"
        // message + "\n"
        return null; // TODO: implement
    }

    // Parse commit bytes into fields
    public void parseFromBytes(byte[] data) {
        // TODO: Parse commit format
        // Split by \n
        // Lines before blank line are headers (key-value)
        // Lines after blank line are the message
        //
        // Header parsing:
        // "tree abc123..." -> treeHash = "abc123..."
        // "parent def456..." -> parentHash = "def456..."
        // "author Yash <yash@email.com> 1700000000 +0000" -> parse author
    }

    // Getters and setters
    public String getTreeHash() { return treeHash; }
    public String getParentHash() { return parentHash; }
    public String getAuthor() { return author; }
    public String getCommitter() { return committer; }
    public String getMessage() { return message; }
}
