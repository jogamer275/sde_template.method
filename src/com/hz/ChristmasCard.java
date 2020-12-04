package com.hz;

public class ChristmasCard extends Card {

    public ChristmasCard(Printer printer) {
        super(printer);
    }

    protected void printHeader() {
        String header = "-----------------------------------------";
        this.printer.printLine(header);
    }

    protected void printMessage() {
        String msg = "Merry Christmas!";
        this.printer.printLine(msg);
    }

    protected void printImage() {

        this.printer.printLine("Art by Shanaka Dias");
        this.printer.printLine("    _\\/_");
        this.printer.printLine("     /\\");
        this.printer.printLine("     /\\");
        this.printer.printLine("    /  \\");
        this.printer.printLine("    /~~\\o");
        this.printer.printLine("   /o   \\");
        this.printer.printLine("  /~~*~~~\\");
        this.printer.printLine(" o/    o \\");
        this.printer.printLine(" /~~~~~~~~\\~`");
        this.printer.printLine("/__*_______\\");
        this.printer.printLine("     ||");
        this.printer.printLine("   \\====/");
        this.printer.printLine("    \\__/");

    }

    protected void printFooter() {
        String footer = "----------------------------------------";
        this.printer.printLine(footer);
    }

}