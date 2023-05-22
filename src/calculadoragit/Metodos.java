/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoragit;

/**
 *
 * @author Usuario
 */
public class Metodos {

  public void suma(int x, int y) {
    int suma = x + y;
    System.out.println("La suma es igual a " + suma);
  }

  public void resta(int x, int y) {
    int resta = x - y;
    System.out.println("La resta es igual a " + resta);
  }

  public void multiplicar(int x, int y) {
    int multi = x * y;
    System.out.println("La multiplicacion es igual a " + multi);
  }

  public void dividir(int x, int y) {
    int div = x / y;
    System.out.println("La división es igual a " + div);
  }

  public void modulo(int x, int y) {
    int modulo = x % y;
    System.out.println("El modulo de la division es " + modulo);
  }
}
