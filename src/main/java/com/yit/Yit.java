package com.yit;

import com.yit.commands.*;

// Singleton orchestrator - routes commands to implementations
//
// TODO: Create HashMap<String, Command> and register all commands
// TODO: execute(String[] args) method that looks up command and runs it

public class Yit {
    private static final Yit INSTANCE = new Yit();

    private Yit() {
        // TODO: Register commands here
    }

    public void execute(String[] args) throws Exception {
        // TODO: implement
    }

    public static Yit getInstance() { return INSTANCE; }
}
