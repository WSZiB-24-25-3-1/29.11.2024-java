package edu.pl.wszib.java.nowosci.java13;

public class App {
    public static void main(String[] args) {
        final String JSON = """
                {
                    "glossary": {
                        "title": "example glossary",
                		"GlossDiv": {
                            "title": "S",
                			"GlossList": {
                                "GlossEntry": {
                                    "ID": "SGML",
                					"SortAs": "SGML",
                					"GlossTerm": "Standard Generalized Markup Language",
                					"Acronym": "SGML",
                					"Abbrev": "ISO 8879:1986",
                					"GlossDef": {
                                        "para": "A meta-markup language, used to create markup languages such as DocBook.",
                						"GlossSeeAlso": ["GML", "XML"]
                                    },
                					"GlossSee": "markup"
                                }
                            }
                        }
                    }
                }
                """;
    }
}
