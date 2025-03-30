class Token {
    
     TokenType type = null;
     String lexeme = "";
     Object literal = null;
     int line = 0;
    
    
    Token(TokenType type, String lexeme, Object literal, int line) {
        this.type = type;
        this.lexeme = lexeme;
        this.literal = literal;
        this.line = line;
    }

    public String toString() {
        return type + " " + lexeme + " " + literal;
    }

    }
