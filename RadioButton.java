import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class RadioButton {

    public static void main(String[] args) {

        // Criar Janela
        JFrame janela = new JFrame("Janela RadioButton");
        janela.setSize(1200, 720);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Criar Painel
        JPanel painel = new JPanel();
        painel.setLayout(null);

        // Criar Texto
        JLabel textoT1 = new JLabel("🍕 PIZZARIA 2INFO 🍕");
        JLabel textoT2 = new JLabel("SELECIONE O SABOR DA PIZZA:");
        JLabel textoT3 = new JLabel("Aguardando...");
        // Adicionando os RadioButton
        JRadioButton r1 = new JRadioButton("calabresa");
        JRadioButton r2 = new JRadioButton("Portuguesa");
        JRadioButton r3 = new JRadioButton("Queijo");

        // Adicionando o Botao
        JButton salvar = new JButton("Salvar");

        // Label da imagem
        JLabel imagem = new JLabel();


        // Grupo Logico
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(r1);
        grupo.add(r2);
        grupo.add(r3);

        painel.setBackground(Color.yellow);

        r1.addActionListener(e -> {
            imagem.setIcon(new ImageIcon(
                    RadioButton.class.getResource("/calabresa_r1.png")));
        });

        r2.addActionListener(e -> {
            imagem.setIcon(new ImageIcon(
                    RadioButton.class.getResource("/portuguesa.png")));
        });

        r3.addActionListener(e -> {
            imagem.setIcon(new ImageIcon(
                    RadioButton.class.getResource("/queijo.png")));
        });

        salvar.addActionListener(e -> {
            textoT3.setText("Pedido salvo!");
        });


        // Definir posição: setBounds(X, Y, Largura, Altura)
        r1.setBounds(100, 200, 100, 50);
        r2.setBounds(100, 280, 100, 50);
        r3.setBounds(100, 360, 100, 50);
        textoT1.setBounds(500, 0, 200, 50);
        textoT2.setBounds(100, 120, 500, 50);
        textoT3.setBounds(100, 480, 100, 50);
        salvar.setBounds(100, 420, 100, 50);
        imagem.setBounds(600, 150, 400, 400);


        // Define a fonte
        textoT1.setFont(new Font("Arial", Font.PLAIN, 24));
        textoT2.setFont(new Font("Arial", Font.PLAIN, 24));


        painel.add(r1);
        painel.add(r2);
        painel.add(r3);
        painel.add(textoT1);
        painel.add(textoT2);
        painel.add(imagem);
        painel.add(salvar);
        painel.add(textoT3);
        janela.add(painel);
        janela.setVisible(true);

    }

}
