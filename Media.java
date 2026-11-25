/**
 * 
 */
package Media;

/**
 * 
 */
public class Media {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno aluno = new Aluno();
		aluno.setNota1(4.0);
		aluno.setNota2(8.0);
		aluno.setNota3(9.0);
		aluno.setNota4(7.0);
		
		Calculadora calc = new Calculadora();
		double media = calc.calcularMedia(aluno);
		
		System.out.println("Media: " + media);
	}

}
