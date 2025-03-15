# Práctica 2: Implementación de Estructura de Control `while` y Análisis de Tokens

## Comandos Utilizados

### Generación de los parser y lexer
```bash
antlr4 MiGramatica2.g4
javac MiGramatica2*.java
```

### Análisis de tokens
```bash
grun MiGramatica2 program -tokens ejemplo.txt
```

### Generación del árbol sintáctico
```bash
grun MiGramatica2 program -tree ejemplo.txt
```

### Comandos Git
```bash
git add .
git commit -m "Práctica 2 finalizada"
git push -u origin main
```

## Resultados Obtenidos

### Tokens para la estructura `while`
Tras ejecutar el análisis de tokens, se identificaron los siguientes elementos dentro de la estructura `while`:

```
[@0,8:12='while',<'while'>,1:0]
[@1,14:14='(',<'('>,1:6]
[@2,15:15='x',<ID>,1:7]
[@3,17:17='<',<'<'>,1:9]
[@4,19:19='5',<INT>,1:11]
[@5,20:20=')',<')'>,1:12]
[@6,22:22='{',<'{'>,1:14]
[@7,28:28='x',<ID>,2:4]
[@8,30:30='=',<'='>,2:6]
[@9,32:32='x',<ID>,2:8]
[@10,34:34='+',<'+'>,2:10]
[@11,36:36='1',<INT>,2:12]
[@12,37:37=';',<';'>,2:13]
[@13,39:39='}',<'}'>,3:0]
```

### Árbol de análisis sintáctico
El resultado del árbol generado muestra la siguiente estructura:

```
(program
  (statement
    (assignmentStmt x = (expression (term (factor 0)))) ;)
  (statement
    (whileStmt while (
      (condition (expression (term (factor x))) < (expression (term (factor 5)))) )
      (block {
        (statement
          (assignmentStmt x = (expression (term (factor x)) + (term (factor 1)))) ;)
      })))
)
```

## Cuestionario

1. **¿Qué tokens se generan para la estructura `while (x < 5) { x = x + 1; }`?**
   
   **Respuesta: a) `WHILE`, `(`, `ID`, `<`, `INT`, `)`, `{`, `ID`, `=`, `ID`, `+`, `INT`, `}`**
   
   **Justificación:**  
   El análisis de tokens refleja que cada elemento de la estructura `while` se reconoce de manera independiente. La palabra clave `while` se interpreta como un token reservado, mientras que los paréntesis, identificadores (`ID`), números enteros (`INT`) y operadores (`<`, `=`, `+`) también se tokenizan de forma individual. Esto confirma que cada símbolo dentro de la estructura del bucle se procesa según las reglas definidas en la gramática.

2. **¿Cómo se organiza la estructura `while` en el árbol de análisis sintáctico?**
   
   **Respuesta: c) `while` es el nodo raíz y su condición y cuerpo son nodos secundarios.**
   
   **Justificación:**  
   En la representación del árbol de análisis sintáctico, la estructura `while` se define como un nodo principal (`whileStmt`). A este nodo se le asocian dos elementos secundarios: uno representa la condición del bucle, delimitada por paréntesis, y el otro corresponde al bloque de código que se ejecutará dentro del bucle. Esta organización jerárquica permite visualizar cómo se estructuran y evalúan las instrucciones dentro del `while`.

3. **¿Qué ocurre si en la gramática se omiten las llaves `{}` en la estructura `while`?**
   
   **Respuesta: b) Se genera un error de sintaxis.**
   
   **Justificación:**  
   La gramática establece que una estructura `while` debe contener un bloque de código, el cual está definido explícitamente con llaves `{}`. Si estas llaves se omiten, el parser no podrá interpretar correctamente la estructura del bucle y generará un error de sintaxis. Para permitir `while` sin llaves, sería necesario modificar la gramática para que admita una única declaración sin necesidad de un bloque formal.
