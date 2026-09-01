package com.yit.constants;

// All constants used across the project
//
// GIT DIRECTORY STRUCTURE:
// .git/
//   HEAD          - points to current branch (e.g., "ref: refs/heads/main")
//   config        - repository configuration
//   index         - staging area (binary file)
//   objects/      - object database (blobs, trees, commits)
//     xx/         - first 2 chars of SHA-1 hash
//       xxxxxxx... - remaining 38 chars
//   refs/
//     heads/      - branch references
//     tags/       - tag references
//
// OBJECT TYPES:
// "blob"   - file content
// "tree"   - directory listing
// "commit" - snapshot with metadata
//
// FILE MODES (stored as strings in tree objects):
// "100644" - regular file
// "100755" - executable file
// "040000" - directory (tree object)
// "120000" - symlink

public final class Constants {
    private Constants() {}

    // Directory structure
    public static final String GIT_DIR = ".git";
    public static final String HEADS_DIR = GIT_DIR + "/refs/heads";
    public static final String TAGS_DIR = GIT_DIR + "/refs/tags";
    public static final String OBJECTS_DIR = GIT_DIR + "/objects";
    public static final String PACK_DIR = OBJECTS_DIR + "/pack";
    public static final String INFO_DIR = OBJECTS_DIR + "/info";

    // Special files
    public static final String HEAD_FILE = GIT_DIR + "/HEAD";
    public static final String INDEX_FILE = GIT_DIR + "/index";
    public static final String CONFIG_FILE = GIT_DIR + "/config";
    public static final String DESCRIPTION_FILE = GIT_DIR + "/description";

    // Object types
    public static final String BLOB_TYPE = "blob";
    public static final String TREE_TYPE = "tree";
    public static final String COMMIT_TYPE = "commit";

    // File modes
    public static final String FILE_MODE = "100644";
    public static final String EXECUTABLE_MODE = "100755";
    public static final String DIR_MODE = "040000";
    public static final String SYMLINK_MODE = "120000";

    // HEAD content
    public static final String DEFAULT_BRANCH = "main";
    public static final String HEAD_CONTENT = "ref: refs/heads/" + DEFAULT_BRANCH + "\n";

    // Object format: "<type> <size>\0<content>"
    public static final String OBJECT_FORMAT = "%s %d\0";
}
