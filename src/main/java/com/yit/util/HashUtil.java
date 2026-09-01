package com.yit.util;

import java.io.ByteArrayOutputStream;
import java.security.MessageDigest;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

// Utility for SHA-1 hashing and zlib compression
//
// GIT USES:
// - SHA-1 (or SHA-256 in newer git) for content addressing
// - zlib deflate for compression
//
// SHA-1:
// - Produces 160-bit (20 bytes) hash
// - Represented as 40-char hex string
// - Computed on uncompressed header+content
//
// ZLIB:
// - Deflate for compression (level 1 is fine)
// - Inflate for decompression
// - Applied AFTER hashing
//
// TODO: Implement sha1() and zlibCompress()/zlibDecompress()

public class HashUtil {

    // Compute SHA-1 hash of bytes, return as 40-char hex string
    public static String sha1(byte[] data) throws Exception {
       MessageDigest md = MessageDigest.getInstance("SHA-1");
       byte[] digest = md.digest(data);
       StringBuilder sb = new StringBuilder();
       for (byte b : digest) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }

    // Compress bytes with zlib
    public static byte[] compress(byte[] data) {
        Deflater deflater = new Deflater(Deflater.DEFAULT_COMPRESSION);
        deflater.setInput(data);
        deflater.finish();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        while (!deflater.finished()) {
            int count = deflater.deflate(buffer);
            baos.write(buffer, 0, count);
        }
        deflater.end();
        return baos.toByteArray();
    }

    // Decompress bytes with zlib
    public static byte[] decompress(byte[] data) throws Exception {
        Inflater inflater = new Inflater();
        inflater.setInput(data);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        while (!inflater.finished()) {
            int count = inflater.inflate(buffer);
            baos.write(buffer, 0, count);
        }
        inflater.end();
        return baos.toByteArray();
    }

    // Convert hex string to bytes
    public static byte[] hexToBytes(String hex) {
        byte[] bytes = new byte[hex.length() / 2];
        for (int i = 0; i < bytes.length; i++) {
            bytes[i] = (byte) Integer.parseInt(hex.substring(i * 2, i * 2 + 2), 16);
        }
        return bytes;
    }

    // Convert bytes to hex string
    public static String bytesToHex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }
}
