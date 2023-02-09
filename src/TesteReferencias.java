
public class TesteReferencias {
	public static void main(String[] args) {
		Funcionario gerente = new Gerente();
		gerente.setSalario(5000.0);

		Funcionario funcionario = new Funcionario();
		funcionario.setSalario(2000.0);

		Funcionario editor = new EditorDeVideo();
		editor.setSalario(2500.0);

		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(gerente);
		controle.registra(funcionario);
		controle.registra(editor);
		System.out.println(controle.getSoma());
	}
}
