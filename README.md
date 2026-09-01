# Yit - Build Your Own Git

A minimal Git implementation built from scratch in Java. Zero external dependencies — pure JDK.

## Build

```bash
mvn package
```

## Run

```bash
java -jar target/yit-1.0-SNAPSHOT.jar <command> [args]
```

## Commands to Implement

| Command | Description | Status |
|---------|-------------|--------|
| `init` | Initialize a new repository | TODO |
| `hash-object` | Compute SHA-1 and store a file | TODO |
| `cat-file` | Display object contents | TODO |
| `add` | Stage files to the index | TODO |
| `write-tree` | Create a tree from the index | TODO |
| `commit-tree` | Create a commit object | TODO |
| `log` | Display commit history | TODO |
| `status` | Show working tree status | TODO |
| `diff` | Show changes | TODO |
| `branch` | List/create branches | TODO |
| `checkout` | Switch branches | TODO |
| `merge` | Merge branches | TODO |

## Architecture

- `Main.java` — Entry point, CLI argument parsing
- `Yit.java` — Command dispatcher (singleton + HashMap)
- `commands/` — One class per command (Command pattern)
- `model/` — Git objects: Blob, Tree, Commit
- `store/` — Content-addressable object storage
- `index/` — Staging area
- `util/` — File I/O and SHA-1/zlib utilities
- `constants/` — All paths and type strings
