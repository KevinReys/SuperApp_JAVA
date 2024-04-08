import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Screen extends JFrame {
    public Screen() {

        setTitle("SuperApp");
        setVisible(true);
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Fechar programa
        setResizable(false); //Evita mudar tamanho da tela e expandir
        setLocationRelativeTo(null); //Quando ele inicializa, fica no meio da tela

        setLayout(null);

        JButton jButton = new JButton();
        jButton.setText("Clique 1");
        jButton.setBounds(240, 200, 200, 70);
        jButton.setFont(new Font("Arial", Font.BOLD, 20));
        jButton.setForeground(new Color(255, 255, 255)); // COR DA FONTE DA LETRA
        jButton.setBackground(new Color(9, 10, 9 )); // COR DO BACKGROUND DO BOTÃO

        add(jButton);
        jButton.addActionListener(this::outroteste);



        JButton jButton2 = new JButton();
        jButton2.setText("Clique 2");
        jButton2.setBounds(475, 200, 200, 70);
        jButton2.setFont(new Font("Arial", Font.BOLD, 20));
        jButton2.setForeground(new Color(255, 255, 255));
        jButton2.setBackground(new Color(9, 10, 9 ));

        add(jButton2);
        jButton2.addActionListener(this::teste);

    }

    private void teste(ActionEvent actionEvent) {
        JOptionPane.showMessageDialog(null, "Mensagem do título 1", "Título 1",
                JOptionPane.INFORMATION_MESSAGE);
    }

    private void outroteste(ActionEvent actionEvent) {
        JOptionPane.showMessageDialog(null, "Mensagem do título 2", "Título 2",
                JOptionPane.WARNING_MESSAGE);
    }


    public static void main(String[] args) {
        // Criar uma instância da classe Screen para mostrar a tela
        new Screen();
    }
}