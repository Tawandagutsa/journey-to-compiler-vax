An interpreter is a type of program that reads and executes code line by line, rather than compiling the whole program into machine code first. It translates high-level code (like Python or JavaScript) into actions the computer can perform, making it easier to test and run code interactively.

Main Steps of an Interpreter
1. Scanning / Lexical Analysis – Converts raw code into tokens (e.g., keywords, variables, symbols).

2. Parsing (Syntax Analysis) – Arranges tokens into a structured format (AST).

3. Semantic Analysis – Ensures the code makes logical sense (e.g., type checks, variable scope).

4. Interpretation / Execution – Executes the code directly from the AST or line by line.

5. Runtime Services – Manages things like memory, input/output, and error handling during execution.


🔍 Scanning (Lexical Analysis)
Scanning, also called lexical analysis, is the first step in interpreting code. It reads the raw source code and breaks it down into tokens—the basic building blocks like keywords (if, while), identifiers (x, total), operators (+, =), and punctuation (;, {). These tokens are then passed to the parser for further analysis.
