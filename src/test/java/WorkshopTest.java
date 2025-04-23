
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


import java.util.List;

//import static org.junit.Assert.*;

//import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

//import JUNIT 4



public class WorkshopTest {

    private final Workshop tester = new Workshop();

    @Test
    //Test para el area del circulo
    public void testAreaCirculo() {
        assertEquals(Math.PI, tester.areaCirculo(1), 0.001);
        assertEquals((Math.PI*10), tester.areaCirculo(10), 0.001);;
        assertEquals(0, tester.areaCirculo(0), 0.001);
    }

    @Test
    public void testZoodiac() {
        assertEquals("Aries", tester.zoodiac(9,4));
        assertNotEquals("Pisces",tester.zoodiac(30,2));
        assertEquals("Invalid Date", tester.zoodiac(31,2));
        assertEquals("Gemini", tester.zoodiac(14,6));
        assertEquals("Cancer", tester.zoodiac(22,6));
        assertNotEquals("Leo",tester.zoodiac(30,8));
    }


    // Test para el método sumarDosNumeros
    @Test
    public void testSumarDosNumeros() {
        // Test 1: Suma positiva
        assertEquals(8, tester.sumarDosNumeros(3, 5));
        // Test 2: Suma con cero
        assertEquals(7, tester.sumarDosNumeros(7, 0));
        // Test 3: Suma negativa
        assertEquals(-2, tester.sumarDosNumeros(-1, -1));
    }

    // Test para el método mayorDeTresNumeros
    @Test
    public void testMayorDeTresNumeros() {
        // Test 1: Todos positivos, el mayor es 10
        assertEquals(10, tester.mayorDeTresNumeros(5, 7, 10));
        // Test 2: Incluye números negativos, el mayor es 3
        assertEquals(3, tester.mayorDeTresNumeros(-5, -7, 3));
        // Test 3: Todos negativos, el mayor es -1
        assertEquals(-1, tester.mayorDeTresNumeros(-10, -5, -1));
    }

    // Test para el método tablaMultiplicar
    @Test
    public void testTablaMultiplicar() {
        // Test 1: Tabla de multiplicar de 2 hasta 5
        assertArrayEquals(new int[]{2, 4, 6, 8, 10}, tester.tablaMultiplicar(2, 5));
        // Test 2: Tabla de multiplicar de 3 hasta 3
        assertArrayEquals(new int[]{3}, tester.tablaMultiplicar(3, 1));
        // Test 3: Tabla de multiplicar de 0
        assertArrayEquals(new int[]{0, 0, 0, 0, 0}, tester.tablaMultiplicar(0, 5));
    }

    // Test para el método factorial
    @Test
    public void testFactorial() {
        // Test 1: Factorial de 5
        assertEquals(120, tester.factorial(5));
        // Test 2: Factorial de 0
        assertEquals(1, tester.factorial(0));
        // Test 3: Factorial de 1
        assertEquals(1, tester.factorial(1));
    }

    // Test para el método esPrimo
    @Test
    public void testEsPrimo() {
        // Test 1: Número primo
        assertTrue(tester.esPrimo(7));
        // Test 2: Número no primo
        assertFalse(tester.esPrimo(4));
        // Test 3: Número negativo
        assertFalse(tester.esPrimo(-3));
    }

    // Test para el método serieFibonacci
    @Test
    public void testSerieFibonacci() {
        // Test 1: Serie Fibonacci de 5 términos
        assertArrayEquals(new int[]{0, 1, 1, 2, 3}, tester.serieFibonacci(5));
        // Test 2: Serie Fibonacci de 1 término
        assertArrayEquals(new int[]{0}, tester.serieFibonacci(1));
        // Test 3: Serie Fibonacci de 0 términos
        assertArrayEquals(new int[]{}, tester.serieFibonacci(0));
    }

    // Test para el método sumaElementos
    @Test
    public void testSumaElementos() {
        // Test 1: Suma de elementos positivos
        assertEquals(15, tester.sumaElementos(new int[]{1, 2, 3, 4, 5}));
        // Test 2: Suma con elementos negativos
        assertEquals(-15, tester.sumaElementos(new int[]{-1, -2, -3, -4, -5}));
        // Test 3: Suma de elementos con cero
        assertEquals(0, tester.sumaElementos(new int[]{0, 0, 0, 0}));
    }

    // Test para el método promedioElementos
    @Test
    public void testPromedioElementos() {
        // Test 1: Promedio de elementos positivos
        assertEquals(3.0, tester.promedioElementos(new int[]{1, 2, 3, 4, 5}));
        // Test 2: Promedio con elementos negativos
        assertEquals(-3.0, tester.promedioElementos(new int[]{-1, -2, -3, -4, -5}));
        // Test 3: Promedio de elementos con cero
        assertEquals(0.0, tester.promedioElementos(new int[]{0, 0, 0, 0}));
    }

    // Test para el método encontrarElementoMayor
    @Test
    public void testEncontrarElementoMayor() {
        // Test 1: Elemento mayor en arreglo positivo
        assertEquals(10, tester.encontrarElementoMayor(new int[]{1, 2, 3, 10, 5}));
        // Test 2: Elemento mayor en arreglo con negativos
        assertEquals(3, tester.encontrarElementoMayor(new int[]{-1, -2, -3, 3, -5}));
        // Test 3: Elemento mayor en arreglo con un solo elemento
        assertEquals(7, tester.encontrarElementoMayor(new int[]{7}));
    }

    // Test para el método encontrarElementoMenor
    @Test
    public void testEncontrarElementoMenor() {
        // Test 1: Elemento menor en arreglo positivo
        assertEquals(1, tester.encontrarElementoMenor(new int[]{1, 2, 3, 10, 5}));
        // Test 2: Elemento menor en arreglo con negativos
        assertEquals(-5, tester.encontrarElementoMenor(new int[]{-1, -2, -3, -5, -4}));
        // Test 3: Elemento menor en arreglo con un solo elemento
        assertEquals(7, tester.encontrarElementoMenor(new int[]{7}));
    }

    // Test para el método buscarElemento
    @Test
    public void testBuscarElemento() {
        // Test 1: Elemento presente en arreglo
        assertTrue(tester.buscarElemento(new int[]{1, 2, 3, 4, 5}, 3));
        // Test 2: Elemento no presente en arreglo
        assertFalse(tester.buscarElemento(new int[]{1, 2, 3, 4, 5}, 6));
        // Test 3: Buscar en arreglo vacío
        assertFalse(tester.buscarElemento(new int[]{}, 1));
    }

    // Test para el método invertirArreglo
    @Test
    public void testInvertirArreglo() {
        // Test 1: Invertir un arreglo con elementos
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, tester.invertirArreglo(new int[]{1, 2, 3, 4, 5}));
        // Test 2: Invertir arreglo con un solo elemento
        assertArrayEquals(new int[]{7}, tester.invertirArreglo(new int[]{7}));
        // Test 3: Invertir arreglo vacío
        assertArrayEquals(new int[]{}, tester.invertirArreglo(new int[]{}));
    }

    // Test para el método ordenarArreglo
    @Test
    public void testOrdenarArreglo() {
        // Test 1: Ordenar arreglo desordenado
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, tester.ordenarArreglo(new int[]{5, 4, 3, 2, 1}));
        // Test 2: Ordenar arreglo ya ordenado
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, tester.ordenarArreglo(new int[]{1, 2, 3, 4, 5}));
        // Test 3: Ordenar arreglo con elementos repetidos
        assertArrayEquals(new int[]{1, 1, 2, 3, 3}, tester.ordenarArreglo(new int[]{3, 1, 2, 1, 3}));
    }

    // Test para el método eliminarDuplicados
    @Test
    public void testEliminarDuplicados() {
        // Test 1: Eliminar duplicados en arreglo
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, tester.eliminarDuplicados(new int[]{1, 2, 2, 3, 4, 4, 5}));
        // Test 2: Eliminar duplicados en arreglo con todos elementos iguales
        assertArrayEquals(new int[]{1}, tester.eliminarDuplicados(new int[]{1, 1, 1, 1}));
        // Test 3: Eliminar duplicados en arreglo vacío
        assertArrayEquals(new int[]{}, tester.eliminarDuplicados(new int[]{}));
    }

    // Test para el método combinarArreglos
    @Test
    public void testCombinarArreglos() {
        // Test 1: Combinar dos arreglos
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, tester.combinarArreglos(new int[]{1, 2, 3, 4}, new int[]{5, 6, 7, 8}));
        // Test 2: Combinar arreglo con vacío
        assertArrayEquals(new int[]{1, 2, 3}, tester.combinarArreglos(new int[]{1, 2, 3}, new int[]{}));
        // Test 3: Combinar dos arreglos vacíos
        assertArrayEquals(new int[]{}, tester.combinarArreglos(new int[]{}, new int[]{}));
    }

    // Test para el método rotarArreglo
    @Test
    public void testRotarArreglo() {
        // Test 1: Rotar arreglo a la derecha
        assertArrayEquals(new int[]{4, 5, 1, 2, 3}, tester.rotarArreglo(new int[]{1, 2, 3, 4, 5}, 2));
        // Test 2: Rotar arreglo a la izquierda
        assertArrayEquals(new int[]{3, 4, 5, 1, 2}, tester.rotarArreglo(new int[]{1, 2, 3, 4, 5}, -2));
        // Test 3: Rotar arreglo con tamaño 1
        assertArrayEquals(new int[]{1}, tester.rotarArreglo(new int[]{1}, 3));
    }

    // Test para el método contarCaracteres
    @Test
    public void testContarCaracteres() {
        // Test 1: Contar caracteres en cadena
        assertEquals(13, tester.contarCaracteres("Hola mundo"));
        // Test 2: Contar caracteres en cadena vacía
        assertEquals(0, tester.contarCaracteres(""));
        // Test 3: Contar caracteres en cadena con espacios
        assertEquals(14, tester.contarCaracteres("Hola   mundo"));
    }

    // Test para el método invertirCadena
    @Test
    public void testInvertirCadena() {
        // Test 1: Invertir cadena normal
        assertEquals("odnum aloH", tester.invertirCadena("Hola mundo"));
        // Test 2: Invertir cadena vacía
        assertEquals("", tester.invertirCadena(""));
        // Test 3: Invertir cadena con caracteres especiales
        assertEquals("!@#321", tester.invertirCadena("123@#!"));
    }

    // Test para el método esPalindromo
    @Test
    public void testEsPalindromo() {
        // Test 1: Cadena palíndroma
        assertTrue(tester.esPalindromo("reconocer"));
        // Test 2: Cadena no palíndroma
        assertFalse(tester.esPalindromo("hola"));
        // Test 3: Cadena vacía (considerada palíndroma)
        assertTrue(tester.esPalindromo(""));
        assertTrue(tester.esPalindromo("Anita lava la tina"));
    }

    // Test para el método contarPalabras
    @Test
    public void testContarPalabras() {
        // Test 1: Contar palabras en cadena normal
        assertEquals(3, tester.contarPalabras("Hola mundo hoy"));
        // Test 2: Contar palabras en cadena vacía
        assertEquals(0, tester.contarPalabras(""));
        // Test 3: Contar palabras con múltiples espacios
        assertEquals(4, tester.contarPalabras("Hola   mundo  hoy"));
    }

    // Test para el método convertirAMayusculas
    @Test
    public void testConvertirAMayusculas() {
        // Test 1: Convertir a mayúsculas
        assertEquals("HOLA MUNDO", tester.convertirAMayusculas("Hola mundo"));
        // Test 2: Convertir cadena ya en mayúsculas
        assertEquals("HOLA MUNDO", tester.convertirAMayusculas("HOLA MUNDO"));
        // Test 3: Convertir cadena vacía
        assertEquals("", tester.convertirAMayusculas(""));
    }

    // Test para el método convertirAMinusculas
    @Test
    public void testConvertirAMinusculas() {
        // Test 1: Convertir a minúsculas
        assertEquals("hola mundo", tester.convertirAMinusculas("Hola Mundo"));
        // Test 2: Convertir cadena ya en minúsculas
        assertEquals("hola mundo", tester.convertirAMinusculas("hola mundo"));
        // Test 3: Convertir cadena vacía
        assertEquals("", tester.convertirAMinusculas(""));
    }

    // Test para el método reemplazarSubcadena
    @Test
    public void testReemplazarSubcadena() {
        // Test 1: Reemplazar subcadena
        assertEquals("Hola a todos", tester.reemplazarSubcadena("Hola mundo", "mundo", "a todos"));
        // Test 2: Reemplazar subcadena que no existe
        assertEquals("Hola mundo", tester.reemplazarSubcadena("Hola mundo", "noexiste", "nuevo"));
        // Test 3: Reemplazar en cadena vacía
        assertEquals("", tester.reemplazarSubcadena("", "viejo", "nuevo"));
    }

    // Test para el método buscarSubcadena
    @Test
    public void testBuscarSubcadena() {
        // Test 1: Buscar subcadena que existe
        assertEquals(5, tester.buscarSubcadena("Hola mundo", "mundo"));
        // Test 2: Buscar subcadena que no existe
        assertEquals(-1, tester.buscarSubcadena("Hola mundo", "noexiste"));
        // Test 3: Buscar en cadena vacía
        assertEquals(-1, tester.buscarSubcadena("", "subcadena"));
    }



    // Test para el método promedioLista
    @Test
    public void testPromedioLista() {
        // Test 1: Promedio de lista de números
        assertEquals(3.0, tester.promedioLista(List.of(1, 2, 3, 4, 5)));
        // Test 2: Promedio de lista con un solo número
        assertEquals(7.0, tester.promedioLista(List.of(7)));
        // Test 3: Promedio de lista vacía
        assertEquals(0.0, tester.promedioLista(List.of()));
    }

    // Test para el método convertirABinario
    @Test
    public void testConvertirABinario() {
        // Test 1: Convertir número a binario
        assertEquals("1010", tester.convertirABinario(10));
        // Test 2: Convertir número cero a binario
        assertEquals("0", tester.convertirABinario(0));
        // Test 3: Convertir número negativo (debe manejarse correctamente)
        assertEquals("-1010", tester.convertirABinario(-10));
    }

    // Test para el método convertirAHexadecimal
    @Test
    public void testConvertirAHexadecimal() {
        // Test 1: Convertir número a hexadecimal
        assertEquals("FF", tester.convertirAHexadecimal(255));
        // Test 2: Convertir número cero a hexadecimal
        assertEquals("0", tester.convertirAHexadecimal(0));
        // Test 3: Convertir número negativo (debe manejarse correctamente)
        assertEquals("-FF", tester.convertirAHexadecimal(-255));
    }

    // Test para el método jugarPiedraPapelTijeraLagartoSpock
    @Test
    public void testJugarPiedraPapelTijeraLagartoSpock() {
        // Test 1: Elección del usuario es Piedra
        // Se debe ajustar el resultado dependiendo de la elección aleatoria de la computadora
        assertTrue(tester.jugarPiedraPapelTijeraLagartoSpock("Piedra").equals("Ganaste") ||
                tester.jugarPiedraPapelTijeraLagartoSpock("Piedra").equals("Perdiste") ||
                tester.jugarPiedraPapelTijeraLagartoSpock("Piedra").equals("Empate"));
        // Test 2: Elección del usuario es Papel
        assertTrue(tester.jugarPiedraPapelTijeraLagartoSpock("Papel").equals("Ganaste") ||
                tester.jugarPiedraPapelTijeraLagartoSpock("Papel").equals("Perdiste") ||
                tester.jugarPiedraPapelTijeraLagartoSpock("Papel").equals("Empate"));
           }


    @Test
    public void testValidarCorreoElectronico() {
        // Test 1: Correo electrónico válido
        assertTrue(tester.validarCorreoElectronico("test@example.com"));

        // Test 2: Correo electrónico sin @
        assertFalse(tester.validarCorreoElectronico("testexample.com"));

        // Test 3: Correo electrónico con espacio en blanco
        assertFalse(tester.validarCorreoElectronico("test@example .com"));

        // Test 4: Correo electrónico con caracteres especiales inválidos
        assertFalse(tester.validarCorreoElectronico("test$%^&*()@example.com"));
    }


    @Test
    public void testPPTLS2()
    {
        assertEquals("Player 2", tester.pptls2(new String []{"P","S"}));
        assertEquals("Empate", tester.pptls2(new String []{"S","S"}));
        assertEquals("Player 1", tester.pptls2(new String []{"V","S"}));
        assertEquals("Player 2", tester.pptls2(new String []{"R","V"}));
        assertEquals("Empate", tester.pptls2(new String []{"P","P"}));
        assertEquals("Player 1", tester.pptls2(new String []{"L","P"}));
    }
}
