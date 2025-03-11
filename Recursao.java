public class Recursao {

    // Método recursivo para calcular o fatorial de um número
    public static int fatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * fatorial(n - 1);
    }

    // Método recursivo para calcular o somatório de um número até 0
    public static int somatorio(int n) {
        if (n == 0) {
            return 0;
        }
        return n + somatorio(n > 0 ? n - 1 : n + 1);
    }

    // Método recursivo para calcular o n-ésimo número da sequência de Fibonacci
    public static int fibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Método recursivo para calcular o somatório entre dois números k e j
    public static int soma(int k, int j) {
        if (k == j) {
            return k;
        }
        if (k > j) {
            return soma(j, k); // Garante que k seja sempre menor ou igual a j
        }
        return k + soma(k + 1, j);
    }

    /*
     * Modele e implemente um método recursivo que recebe um String em retorna true se este String for um palíndrome, false caso contrário.
    ``` 
         boolean isPal(String s) 
    ```
    Modele e implemente um método recursivo que recebe um inteiro zero ou positivo e retorna um String com o número em binário.
    ``` 
         String convBase2(int n) 
    ``` 
    Modele e implemente um método recursivo que calcule o somatório dos números contidos em um ArrayList de inteiros, passado como parâmetro.

    Modele e implemente um método recursivo para encontrar o maior elemento de um ArrayList.
    ``` 
         int findBiggest(ArrayList<Integer> ar) 
    ``` 

    Implemente um método recursivo para determinar se um string ocorre dentro de outro.
	  ``` 
         boolean findSubStr(String str, String match)
	  ``` 
    Faça um método recursivo que determina o número de dígitos de um inteiro.
	  ``` 
         int nroDigit(int n)
	  ``` 
    Implemente um métodos que recebe um String e retorna um ArrayList com todas as permutações deste String.
	  ``` 
     */

    public static void main(String[] args) {
        // Testando os métodos
        System.out.println("Fatorial de 5: " + fatorial(5));
        System.out.println("Somatório de 5 até 0: " + somatorio(5));
        System.out.println("10º número da sequência de Fibonacci: " + fibonacci(10));
        System.out.println("Somatório entre 3 e 7: " + soma(3, 7));
    }
}
