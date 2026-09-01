package com.yit.util;

import java.io.*;
import java.nio.file.*;
import java.util.List;

// File system utility methods
//
// TODO: Implement all methods

public class FileUtils {

    // Read all bytes from a file
    public static byte[] readBytes(String path) throws IOException {
        // TODO: implement
        return null;
    }

    // Write bytes to a file (create parent dirs if needed)
    public static void writeBytes(String path, byte[] data) throws IOException {
        // TODO: implement
    }

    // Read all text from a file
    public static String readText(String path) throws IOException {
        // TODO: implement
        return null;
    }

    // Write text to a file
    public static void writeText(String path, String text) throws IOException {
        // TODO: implement
    }

    // Create directory and all parent directories
    public static void mkdirs(String path) {
        // TODO: implement
    }

    // Check if a file/directory exists
    public static boolean exists(String path) {
        // TODO: implement
        return false;
    }

    // Delete a file
    public static void delete(String path) throws IOException {
        // TODO: implement
    }

    // List files in a directory (non-recursive)
    public static List<String> listDir(String path) {
        // TODO: implement
        return null;
    }

    // Walk a directory tree recursively, return all file paths
    // Exclude .git directory
    public static List<String> walkFiles(String rootDir) {
        // TODO: implement
        return null;
    }

    // Get file size
    public static long fileSize(String path) {
        // TODO: implement
        return 0;
    }

    // Read file as text lines
    public static List<String> readLines(String path) throws IOException {
        // TODO: implement
        return null;
    }

    // Write text lines to file
    public static void writeLines(String path, List<String> lines) throws IOException {
        // TODO: implement
    }
}
