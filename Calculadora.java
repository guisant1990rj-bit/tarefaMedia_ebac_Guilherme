package Media;

public class Calculadora {
	
	public double calcularMedia(Aluno aluno) {
		return(aluno.getNota1() + aluno.getNota2() + aluno.getNota3() + aluno.getNota4())/4;
	}

}
