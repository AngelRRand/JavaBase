public class Operators {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;


        // Operadores aritmeticos


        // Operador de suma: suma dos números
        int suma = num1 + num2; // Resultado: 15

        // Operador de resta: resta el segundo número del primero
        int resta = num1 - num2; // Resultado: 5

        // Operador de multiplicación: multiplica dos números
        int multiplicacion = num1 * num2; // Resultado: 50

        // Operador de división: divide el primer número por el segundo
        int division = num1 / num2; // Resultado: 2

        // Operador de módulo: devuelve el resto de la división
        int modulo = num1 % num2; // Resultado: 0 (porque 10 / 5 = 2 sin resto)

        // Operador de incremento: aumenta en 1 el valor de la variable
        num1++; // Ahora num1 es igual a 11

        // Operador de decremento: disminuye en 1 el valor de la variable
        num2--; // Ahora num2 es igual a 4

        System.out.println(suma);
        System.out.println(resta);
        System.out.println(multiplicacion);
        System.out.println(division);
        System.out.println(modulo);

        // Operador de igualdad: comprueba si dos valores son iguales
        boolean igualdad = (num1 == num2); // Resultado: false

        // Operador de desigualdad: comprueba si dos valores son diferentes
        boolean desigualdad = (num1 != num2); // Resultado: true

        // Operador mayor que: comprueba si el primer número es mayor que el segundo
        boolean mayorQue = (num1 > num2); // Resultado: true

        // Operador menor que: comprueba si el primer número es menor que el segundo
        boolean menorQue = (num1 < num2); // Resultado: false

        // Operador mayor o igual que: comprueba si el primer número es mayor o igual al segundo
        boolean mayorIgualQue = (num1 >= num2); // Resultado: true

        // Operador menor o igual que: comprueba si el primer número es menor o igual al segundo
        boolean menorIgualQue = (num1 <= num2); // Resultado: false


        System.out.println(igualdad);
        System.out.println(desigualdad);
        System.out.println(mayorQue);
        System.out.println(menorQue);
        System.out.println(mayorIgualQue);
        System.out.println(menorIgualQue);



        boolean A = true;
        boolean B = false;

        // Operador AND (&&): Retorna true si ambas condiciones son verdaderas
        boolean resultadoAND = (A && B);

        // Operador OR (||): Retorna true si al menos una condición es verdadera
        boolean resultadoOR = (A || B);

        // Operador NOT (!): Niega la condición, convierte true en false y viceversa
        boolean resultadoNOT_A = !A;
        boolean resultadoNOT_B = !B;

        System.out.println(resultadoAND);

        System.out.println(resultadoOR);
        System.out.println(resultadoNOT_A);
        System.out.println(resultadoNOT_B);

    }
}
