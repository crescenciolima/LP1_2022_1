package aula_11_04;

public class AlunoTeste {

	public static void main(String[] args) {
		Curso C1 = new Curso(1, "BSI");
		C1.imprimirCurso();
		Aluno N1 = new Aluno(123, "Maria", 23, C1);
		N1.imprimirAluno();
		Aluno A2 = new Aluno();
		A2.imprimirAluno();
		
	}

}
