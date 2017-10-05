package com.company;

import com.googlecode.lanterna.*;
import com.googlecode.lanterna.input.Key;
import com.googlecode.lanterna.terminal.Terminal;
import com.googlecode.lanterna.terminal.TerminalSize;
import java.nio.charset.Charset;

public class Main {
    public static void main(String[] args) throws InterruptedException {


        Terminal terminal = TerminalFacade.createTerminal(System.in, System.out, Charset.forName("UTF8"));
        terminal.enterPrivateMode();


        // Make board object
        Board board = new Board();



        // Make player object



        // Make monster objects



        // Run game until player dead

        while(true){

            //wait for a key to be pressed

            Key key;
            do{
                Thread.sleep(5);
                key = terminal.readInput();
            } while (key ==null);

            System.out.println(key.getCharacter() + " " + key.getKind());
        }


        // Game over


    }
}
