package com.yit;

import com.yit.commands.*;
import java.util.HashMap;
import java.util.Map;

// Singleton orchestrator - routes commands to implementations
//
// COMMAND REGISTRY:
// Maps command names (strings) to Command implementations
// "init" -> InitCommand
// "add" -> AddCommand
// etc.
//
// TODO: Create HashMap<String, Command> and register all commands
// TODO: execute(String[] args) method that looks up command and runs it

public class Yit {
    private static final Yit INSTANCE = new Yit();
    private final Map<String, Command> commands = new HashMap<>();

    private Yit() {
        commands.put("init", new InitCommand());
        // TODO: Register all commands here as you implement them
    }

    public void execute(String[] args) throws Exception {
        String commandName = args[0];
        Command command = commands.get(commandName);
        if (command == null) {
            System.out.println("Unknown command: " + commandName);
            return;
        }
        command.execute(args);
    }

    public static Yit getInstance() { return INSTANCE; }
}
