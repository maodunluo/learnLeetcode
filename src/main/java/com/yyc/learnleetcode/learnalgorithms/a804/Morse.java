package com.yyc.learnleetcode.learnalgorithms.a804;

/**
 * @author yuechao
 */

public enum Morse {
    A('a', ".-"),
    B('b', "-..."),
    C('c', "-.-."),
    D('d', "-.."),
    E('e', "."),
    F('f', "..-."),
    G('g', "--."),
    H('h', "...."),
    I('i', ".."),
    J('j', ".---"),
    K('k', "-.-"),
    L('l', ".-.."),
    M('m', "--"),
    N('n', "-."),
    O('o', "---"),
    P('p', ".--."),
    Q('q', "--.-"),
    R('r', ".-."),
    S('s', "..."),
    T('t', "-"),
    U('u', "..-"),
    V('v', "...-"),
    W('w', ".--"),
    X('x', "-..-"),
    Y('y', "-.--"),
    Z('z', "--..")
    ;
    char character;
    String morseInChar;

    Morse() {
    }

    Morse(char character, String morse) {
        this.character = character;
        this.morseInChar = morse;
    }

    public char getCharacter() {
        return character;
    }

    void setCharacter(char character) {
        this.character = character;
    }

    public String getMorse() {
        return morseInChar;
    }

    void setMorse(String morse) {
        this.morseInChar = morse;
    }
}
