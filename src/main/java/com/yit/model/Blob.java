package com.yit.model;

import com.yit.constants.Constants;

// BLOB - stores raw file content
//
// A blob is the simplest object - just file contents with a header.
// No filename, no metadata. Just bytes.
//
// FORMAT: "blob <size>\0<raw file bytes>"
//
// KEY INSIGHT: Blobs are content-addressed.
// Same file content = same hash = stored once (deduplication)
// Two different files with same content share the same blob.
//
// TODO: Implement getBytes() that returns the formatted blob content

public class Blob extends GitObject {
    private final byte[] content;

    public Blob(byte[] content) {
        this.type = Constants.BLOB_TYPE;
        this.content = content;
    }

    public byte[] getContent() {
        return content;
    }

    @Override
    public byte[] getBytes() {
        // TODO: Return "blob <length>\0" + content as bytes
        // The header is ASCII text, content is raw bytes
        // Example: content = "Hello".getBytes()
        //          return = "blob 5\0Hello".getBytes()
        //
        // HINT: Use String.format for the header part
        //       Concatenate header bytes + content bytes
        return null; // TODO: implement
    }
}
