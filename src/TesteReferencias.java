
public class TesteReferencias {
	public static void main(String[] args) {
		
		Funcionario gerente = new Gerente();
		gerente.setSalario(5000.0);

		Funcionario funcionario = new Funcionario();
		funcionario.setSalario(2000.0);

		Funcionario editor = new EditorDeVideo();
		editor.setSalario(2500.0);

		Funcionario designer = new Designer();
		designer.setSalario(3000);

		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(gerente);
		controle.registra(funcionario);
		controle.registra(editor);
		controle.registra(designer);
		
		double esperado = 6550;
		if (controle.getSoma() == esperado) {
			System.out.println("Sucesso, a soma de bonificações bateu com o esperado.");
		}else {
			System.out.println("Erro, a soma de bonificações não bateu com o esperado.");
		}
	}
}
