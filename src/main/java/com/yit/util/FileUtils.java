package com.yit.util;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

// File system utility methods
//
// Provides simple wrappers around Java NIO for:
// - Reading/writing files
// - Creating directories
// - Walking directory trees
// - Getting file info
//
// TODO: Implement all methods

public class FileUtils {

    // Read all bytes from a file
    public static byte[] readBytes(String path) throws IOException {
        // TODO: Use Files.readAllBytes(Path.of(path))
        return Files.readAllBytes(Path.of(path));
    }

    // Write bytes to a file (create parent dirs if needed)
    public static void writeBytes(String path, byte[] data) throws IOException {
        File file = new File(path);
        file.getParentFile().mkdirs(); // Create folders if missing
        Files.write(Path.of(path), data);
    }

    // Read all text from a file
    public static String readText(String path) throws IOException {
        byte[] bytes = readBytes(path);
        return new String(bytes, StandardCharsets.UTF_8);
    }

    // Write text to a file
    public static void writeText(String path, String text) throws IOException {
        writeBytes(path, text.getBytes(StandardCharsets.UTF_8));
    }

    // Create directory and all parent directories
    public static void mkdirs(String path) {
        new File(path).mkdirs();
    }

    // Check if a file/directory exists
    public static boolean exists(String path) {
        return new File(path).exists();
    }

    // Delete a file
    public static void delete(String path) throws IOException {
        Files.delete(Path.of(path));
    }

    // List files in a directory (non-recursive)
    public static List<String> listDir(String path) {
        File dir = new File(path);
        File[] files = dir.listFiles();
        if(files == null) return new ArrayList<>();
        List<String> result = new ArrayList<>();
        for(File f : files) {
            result.add(f.getName());
        }
        return result;
    }

    // Walk a directory tree recursively, return all file paths
    // Exclude .git directory

    public static void WalkHelper(File dir, String root, List<String> result) {
        File[] files = dir.listFiles();
        if (files == null) return;
        for(File f : files) {
            if(f.isDirectory()) {
                if(f.getName().equals(".git")) continue;
                WalkHelper(f, root, result);
            } else {
                String relativePath = new File(root).toPath().relativize(f.toPath()).toString();
                result.add(relativePath);
            }
        }
    }

    public static List<String> walkFiles(String rootDir) {
        List<String> result = new ArrayList<>();
        File root = new File(rootDir);
        WalkHelper(root, root.getAbsolutePath(), result);
        return result;
    }

    // Get file size
    public static long fileSize(String path) {
        return new File(path).length();
    }

    // Read file as text lines
    public static List<String> readLines(String path) throws IOException {
        String text = readText(path);
        return Arrays.asList(text.split("\n"));
    }

    // Write text lines to file
    public static void writeLines(String path, List<String> lines) throws IOException {
        String text = String.join("\n", lines);
        writeText(path, text);
    }
}
