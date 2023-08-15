package controller;

public class DivResto {
	public DivResto() {
		super();
	}

	public int FuncDivResto(int A, int B) {
		//Condição de parada -> Se o resultado da subtração de A e B der um resultado negativo, ele irá retornar o resultado A,
		//antes dele ficar negativo
		if (A-B < 0) {
			return A;
		}
		
		return FuncDivResto(A-B,B);

		/*
		 * Primeiramente a função recebe A e B informados pelo usuário como parâmetros, em seguida começa a realizar a divisão
		 * inteira de A por B de forma recursiva, ou seja, Subtraíndo A por B a cada chamada de função até chegar na condição
		 * de parada. Isto é, até que a subtração desses termos possa dar um valor negativo ou zero, ele retorna o resto da
		 * divisão para o usuário.
		 */
	}
}
