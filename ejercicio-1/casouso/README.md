## Caso de Uso
**Caso de uso:** Una panadería quiere registrar las ventas del día (hasta 7 días) y calcular el total y promedio de ingresos semanales.

## Reglas para ejercicio

* Cada día, se ingresa el total de ventas en pesos.
* Al finalizar los 7 días:

  * Mostrar cada venta por día.
  * Calcular el total semanal.
  * Calcular el promedio diario.
* Todo el cálculo debe estar en un **método estático** separado.


## Ejemplo de creación de Objetos a partir de un Clase

Nota: Una clase es un molde que me permite crear objetos 

```java

class AutoMovil {
  // Atributos de la clase AutoMovil
  private String marca;
  private String modelo;
  private int anio;
  private String color;
  // Constructor de la clase AutoMovil
  public AutoMovil(String marca, String modelo, int anio, String color) {
    this.marca = marca;
    this.modelo = modelo;
    this.anio = anio;
    this.color = color;
  }

  // Métodos de la clase AutoMovil
  public void arrancar() {
    System.out.println("El auto " + marca + " " + modelo + " está arrancando.");
  }
  public void detener() {
    System.out.println("El auto " + marca + " " + modelo + " se ha detenido.");
  }

  // Metodo estatico
  public static void mostrarInformacion() {
    System.out.println("Esta es una clase de automóviles.");
  }

}

Auto auto1 = new AutoMovil("Toyota", "Corolla", 2020, "Rojo");

auto1.arrancar(); // auto1 Toyota Corolla está arrancando.
auto1.detener(); // auto1 Toyota Corolla se ha detenido.

AutoMovil.mostrarInformacion(); // Esta es una clase de automóviles.
```

## Valores de los primitivos por defecto

```java
byte: 0
short: 0
int: 0
long: 0L
float: 0.0f
double: 0.0d
char: '\u0000' (carácter nulo)
boolean: false
```

## Wrappers (Envoltorios las clases)

- Double
- Integer
- Boolean
- String

**Su valor por defecto como son clases es null**


```java
String [] nombres = new String [5]; // es una clase, no un tipo primitivo
// el valor por defecto de un String es null
// Optional isPresent = Optional.ofNullable(nombres[0]); // si es null, no se ejecuta el if
char [] letras = new char [5]; // el char si es un tipo primitivo  

```