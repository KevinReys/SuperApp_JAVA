import javax.swing.*;

public class Screen {
    public Screen() {
        JFrame jFrame = new JFrame();
        jFrame.setTitle("SuperApp");
        jFrame.setVisible(true); // Aqui corrigi o "JFrame." para "jFrame."
        jFrame.setSize(800, 500); // Aqui corrigi "width:" e "height:" para apenas números.
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Fechar programa
        jFrame.setResizable(false); //Evita mudar tamanho da tela e expandir
        jFrame.setLocationRelativeTo(null); //Quando ele inicializa, fica no meio da tela
    }

    public static void main(String[] args) {
        // Criar uma instância da classe Screen para mostrar a tela
        new Screen();
    }
}
