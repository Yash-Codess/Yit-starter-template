package com.yit.model;

// Base class for all git objects (Blob, Tree, Commit)
//
// EVERY OBJECT IN GIT HAS:
// 1. A type ("blob", "tree", "commit")
// 2. Content (bytes)
// 3. A SHA-1 hash computed from: header + content
//
// OBJECT FORMAT ON DISK:
// <type> <size>\0<content>
// Example: "blob 13\0Hello, World!"
//
// The hash is computed BEFORE zlib compression
// The hash IS the address in .git/objects/

public abstract class GitObject {
    protected String type;

    public abstract byte[] getBytes();

    public String getType() {
        return type;
    }
}
