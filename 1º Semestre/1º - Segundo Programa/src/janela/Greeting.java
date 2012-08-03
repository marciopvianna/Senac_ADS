package janela;

// importa os pacotes
import java.awt.*;
import javax.swing.*;

// define a classe greeting
public class Greeting extends JFrame {

	// declara��o do atributo "label"
	private JLabel label;

	// m�todo construtor
	public Greeting() {
		// define o tamanho da janela, largura x altura, em pixels
		setSize(300, 200);
		// 
		createGUI();
		// torna a janela visivel
		setVisible(true);
	}

	private void createGUI() {
		// fecha o programa para finalizar
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// existe um objeto "container" com v�rios outros objetos
		// especifica um "container"
		Container window = getContentPane();
		// comando para visualizar a interface gr�fica "layout"
		window.setLayout(new FlowLayout());
		// define um texto qualquer no r�tuto ou label
		label = new JLabel("Hello World!");
		// adiciona o rotulo na janela
		window.add(label);
	}
}
