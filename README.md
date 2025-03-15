# Evento1_Evaluativo_Compiladores-

Intgrantes: Diego Fernando Guerrero Perez, Lina Marisol Viveros 
 
 Evaluación de Expresiones con Variables y Prioridad de Operaciones
 
# Práctica 1: Evaluación de Expresiones con Variables y Prioridad de Operaciones

Este proyecto implementa un evaluador de expresiones aritméticas que permite asignaciones de múltiples variables, respetando la prioridad de operadores y analizando la estructura del código mediante tokens y árboles de análisis sintáctico.

## Estructura del Proyecto
- **MiGramatica.g4**: Archivo de gramática ANTLR4
- **MiGramaticaEvaluator.java**: Clase que evalúa las expresiones
- **MiGramatica.java**: Clase principal para ejecutar el evaluador
- **input.txt**: Archivo de ejemplo con expresiones

## Comandos Utilizados
### Generación de código a partir de la gramática
```sh
antlr4 MiGramatica.g4
javac *.java
```
### Ejecución del programa
```sh
java MiGramatica input.txt
```
### Para obtener solo los tokens
```sh
antlr4 MiGramatica.g4
javac *.java
java org.antlr.v4.gui.TestRig MiGramatica program -tokens input.txt
```
### Para visualizar el árbol sintáctico
```sh
antlr4 MiGramatica.g4
javac *.java
java org.antlr.v4.gui.TestRig MiGramatica program -tree input.txt
```

## Resultados obtenidos
### Tokens generados
```
6 : a
7 : =
8 : 10
10 : ;
6 : b
7 : =
8 : 5
3 : +
6 : a
5 : *
8 : 2
10 : ;
6 : c
7 : =
1 : (
6 : b
4 : -
8 : 3
2 : )
6 : /
8 : 2
10 : ;
-1 : <EOF>
```
### Árbol de Análisis Sintáctico
```
(program 
  (statement 
    (assignment a = 
      (expr 10)) ;) 
  (statement 
    (assignment b = 
      (expr 
        (expr 5) + 
        (expr 
          (expr a) * 
          (expr 2)))) ;) 
  (statement 
    (assignment c = 
      (expr 
        (expr ( 
          (expr 
            (expr b) - 
            (expr 3)) )) / 
        (expr 2))) ;) <EOF>)
```
### Resultados de la evaluación
```
a = 10
b = 25
c = 11
```

Cuestionario desarrollado

Pregunta 1:  
Respuesta Correcta: b) Como operadores aritméticos específicos.

En la gramática MiGramatica.g4, cada operador aritmético se define con un token propio, como ADD para +, SUB para -, MUL para * y DIV para /. Durante el análisis léxico, estos símbolos se identifican y se agrupan en distintas categorías de operadores aritméticos. Así, en la secuencia de tokens generada, cada operador recibe un identificador único, por ejemplo, 3 para +, 4 para -, 5 para * y 6 para /.

Pregunta 2: 

Respuesta correcta: d) * se evalúa antes que +, organizando el árbol en función de la precedencia.

Justificación: La multiplicación (*) tiene una prioridad mayor que la suma (+). Por esta razón, cuando se evalúa la expresión a * 2 + 5, primero se agrupa a * 2 en un subárbol, que posteriormente se une con 5. Esto se refleja en la estructura jerárquica del árbol sintáctico, donde * se encuentra en un nivel más profundo, lo que indica que debe resolverse antes que +.

Pregunta 3: 

Respuesta correcta: d) Todas las anteriores.

Justificación: 

La representación visual de los tokens y del árbol sintáctico es útil porque:
Facilita la comprensión de cómo el compilador procesa y traduce las instrucciones.
Permite optimizar la generación de código.
Ayuda a verificar que la gramática está correctamente definida y que el código fuente se interpreta adecuadamente.

Pregunta 4: ¿Cómo se representan los operadores en el árbol de análisis sintáctico?
Respuesta: Los operadores actúan como nodos intermedios dentro del árbol, conectando las expresiones que operan entre sí. Por ejemplo, en la expresión 5 + a * 2, el nodo + vincula 5 con la subexpresión a * 2, lo que refleja la jerarquía de evaluación determinada por la precedencia de operadores.


Pregunta 5: ¿Qué reglas de la gramática determinan la prioridad de operaciones?
Respuesta: La jerarquía de operaciones se establece según el orden de las reglas dentro de la gramática. En este caso, la regla que define la multiplicación y división (MulDiv) aparece antes que la de suma y resta (AddSub). Esto significa que las operaciones de multiplicación y división se evalúan antes que las de suma y resta.

Pregunta 6: ¿Cómo maneja la gramática las asignaciones consecutivas?
Respuesta: Las asignaciones consecutivas se gestionan a través de la regla program: statement+ EOF;, donde el operador + indica que se pueden incluir una o más declaraciones. Cada una de estas declaraciones corresponde a una asignación seguida de un punto y coma, lo que permite que el código contenga múltiples asignaciones de forma estructurada.

Pregunta 7: ¿Qué componentes de la gramática permiten la evaluación de expresiones con paréntesis?
Respuesta: La evaluación de expresiones que incluyen paréntesis se realiza mediante la regla expr: LPAREN expr RPAREN # Parens. Esta regla asegura que cualquier operación dentro de paréntesis se procese antes que las demás, manteniendo así la jerarquía de evaluación establecida por el uso de paréntesis en expresiones matemáticas.


