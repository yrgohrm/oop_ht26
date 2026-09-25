package se.yrgo.oop;

import java.io.*;

import org.jline.terminal.*;

public class App {
    public static void main(String[] args) throws IOException {
        // Let JLine automatically select the best provider
        Terminal autoTerminal = TerminalBuilder.builder().system(true).build();
        System.out.println("Auto-selected provider: " + autoTerminal.getClass().getSimpleName());

        // Explicitly specify the JNA provider
        Terminal jnaTerminal = TerminalBuilder.builder()
                .system(true)
                .provider("jna") // Explicitly select JNA provider
                .build();
        System.out.println("JNA provider: " + jnaTerminal.getClass().getSimpleName());

        // Explicitly specify the Jansi provider
        Terminal jansiTerminal = TerminalBuilder.builder()
                .system(true)
                .provider("jansi") // Explicitly select Jansi provider
                .build();
        System.out.println("Jansi provider: " + jansiTerminal.getClass().getSimpleName());

        // Close the terminals
        autoTerminal.close();
        jnaTerminal.close();
        jansiTerminal.close();
    }
}
