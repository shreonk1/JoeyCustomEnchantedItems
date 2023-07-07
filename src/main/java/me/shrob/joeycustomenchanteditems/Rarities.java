package me.shrob.joeycustomenchanteditems;

public enum Rarities {
    COMMON("&7&lCOMMON"),
    UNCOMMON("&2&lUNCOMMON"),
    RARE("&9&lRARE"),
    EPIC("&5&lEPIC"),
    LEGENDARY("&6&lLEGENDARY"),
    MYTHIC("&d&lMYTHIC");

    String string;

    Rarities(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }
}
