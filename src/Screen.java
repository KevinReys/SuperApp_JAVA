import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

//Tela inicial: Boas vindas.
public class Screen extends JFrame {
    public Screen() {
        setTitle("SuperApp");
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);

        // Criação do JLabel para exibir a imagem de plano de fundo
        JLabel background = new JLabel(new ImageIcon("img_backg/back_screen.jpg"));
        add(background);
        background.setLayout(new FlowLayout());

        // Configuração do botão 1 - LOGIN
        JButton jButton = new JButton("Login");
        jButton.setFont(new Font("Arial", Font.BOLD, 15));
        jButton.setForeground(Color.BLACK);
        jButton.setBackground(new Color(255, 255, 255));
        // Configuração do botão 2 - CADASTRO
        JButton jButton2 = new JButton("Cadastro");
        jButton2.setFont(new Font("Arial", Font.BOLD, 15));
        jButton2.setForeground(Color.BLACK);
        jButton2.setBackground(new Color(255, 255, 255));


        // Adiciona os botões ao JLabel
        background.add(jButton);
        background.add(jButton2);

        // Adiciona os listeners aos botões
        jButton.addActionListener(e -> openNewWindow("Login"));
        jButton2.addActionListener(e -> openNewWindow("Cadastro"));

        setVisible(true);
    }

    private void openNewWindow(String title) {
        JFrame newWindow = new JFrame(title);
        newWindow.setSize(800, 500);
        newWindow.setLocationRelativeTo(null);
        newWindow.setVisible(true);

        // Botão de voltar à nova janela
        JButton backButton = new JButton("Voltar");
        backButton.addActionListener(e -> {
            newWindow.dispose(); // Fecha a nova janela
            setVisible(true);   // Torna a tela principal visível novamente
        });
        newWindow.add(backButton, BorderLayout.SOUTH);

        newWindow.setVisible(true);
    }

    public static void main(String[] args) {
        new Screen();
    }
}
