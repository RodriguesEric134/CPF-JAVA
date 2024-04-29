package view;

import javax.swing.*;

public class Menu_GUI {
    public static void menu(){
        int op = 0;
        while (op != 3) {
            String x = JOptionPane.showInputDialog(null, "Opções\n1- Gerar CPF\n2- Validar CPF\n3- Sair");
            op = Integer.parseInt(x);

            switch (op){
                case 1:
                    model.Funcoes_DAO.gerar();
                    break;
                case 2:
                    model.Funcoes_DAO.validar();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Encerrando o sistema...");                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida, tente novamente");
                    break;
            }
        }
    }
}
