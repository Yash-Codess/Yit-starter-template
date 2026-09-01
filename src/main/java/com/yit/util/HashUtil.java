package com.yit.util;

// Utility for SHA-1 hashing and zlib compression
//
// GIT USES:
// - SHA-1 (or SHA-256 in newer git) for content addressing
// - zlib deflate for compression
//
// TODO: Implement sha1(), compress(), decompress()

public class HashUtil {

    // Compute SHA-1 hash of bytes, return as 40-char hex string
    public static String sha1(byte[] data) throws Exception {
        // TODO: implement
        return null;
    }

    // Compress bytes with zlib
    public static byte[] compress(byte[] data) {
        // TODO: implement
        return null;
    }

    // Decompress bytes with zlib
    public static byte[] decompress(byte[] data) throws Exception {
        // TODO: implement
        return null;
    }

    // Convert hex string to bytes
    public static byte[] hexToBytes(String hex) {
        // TODO: implement
        return null;
    }

    // Convert bytes to hex string
    public static String bytesToHex(byte[] bytes) {
        // TODO: implement
        return null;
    }
}
