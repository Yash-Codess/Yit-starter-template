package com.yit.index;

import com.yit.constants.Constants;
import com.yit.util.FileUtils;
import java.util.*;
import java.io.File;

// Index (Staging Area) - tracks what will be in the next commit
//
// THE INDEX IS A MIDDLE LAYER between working directory and repository:
//   Working Directory -> Index (staging) -> Repository (commit)
//
// The index stores:
// - File path
// - Blob SHA-1 hash
// - File mode (100644, 040000, etc.)
//
// SIMPLE IMPLEMENTATION (JSON format for learning):
// Store as JSON: {"path": {"hash": "abc123", "mode": "100644"}}
//
// REAL GIT uses a binary format (.git/index) but JSON is fine for learning
//
// WHY DOES THE INDEX EXIST?
// 1. Allows staging specific files (git add file.txt)
// 2. Enables partial commits (only staged changes)
// 3. Fast status checks (compare index vs working dir)
//
// TODO: Implement load(), save(), addEntry(), removeEntry()

public class Index {
    // In-memory representation of the index
    // Key: file path (relative to repo root)
    // Value: IndexEntry (hash + mode)
    private final Map<String, IndexEntry> entries = new LinkedHashMap<>();

    // Load index from .git/index file
    public void load() {
        // TODO: Check if .git/index exists
        // TODO: Read JSON from .git/index
        // TODO: Parse JSON into entries map
        // HINT: You can use a simple text format instead of JSON:
        //   Line format: "<mode> <hash> <path>"
        //   One entry per line
    }

    // Save index to .git/index file
    public void save() {
        // TODO: Serialize entries to text/JSON
        // TODO: Write to .git/index
    }

    // Add a file to the index
    public void addEntry(String path, String hash, String mode) {
        entries.put(path, new IndexEntry(hash, mode));
    }

    // Remove a file from the index
    public void removeEntry(String path) {
        entries.remove(path);
    }

    // Check if a path is in the index
    public boolean hasEntry(String path) {
        return entries.containsKey(path);
    }

    // Get entry for a path
    public IndexEntry getEntry(String path) {
        return entries.get(path);
    }

    // Get all entries
    public Map<String, IndexEntry> getEntries() {
        return entries;
    }

    // Clear the index
    public void clear() {
        entries.clear();
    }

    // Inner class for index entries
    public static class IndexEntry {
        public final String hash;
        public final String mode;

        public IndexEntry(String hash, String mode) {
            this.hash = hash;
            this.mode = mode;
        }
    }
}
