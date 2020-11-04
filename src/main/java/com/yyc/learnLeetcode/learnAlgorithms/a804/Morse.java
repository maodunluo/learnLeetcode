package com.yyc.learnLeetcode.learnAlgorithms.a804;

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
    String morse;

    Morse() {
    }

    Morse(char character, String morse) {
        this.character = character;
        this.morse = morse;
    }

    public char getCharacter() {
        return character;
    }

    public void setCharacter(char character) {
        this.character = character;
    }

    public String getMorse() {
        return morse;
    }

    public void setMorse(String morse) {
        this.morse = morse;
    }
}
