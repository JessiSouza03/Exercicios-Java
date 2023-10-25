import javax.swing.JOptionPane;

public class agrvai {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número"));
        int n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número"));
        int n4 = Integer.parseInt(JOptionPane.showInputDialog("Digite o quarto número"));
        int menor = 0;
        int meio1 = 0;
        int meio2 = 0;
        int maior = 0;

        if (n1 <= n2 && n1 <= n3 && n1 <= n4) {
            menor = n1;
            if (n2 <= n3 && n2 <= n4) {
                meio1 = n2;
                if (n3 <= n4) {
                    meio2 = n3;
                    maior = n4;
                } else {
                    meio2 = n4;
                    maior = n3;
                }
            } else {
                meio1 = n3;
                meio2 = n4;
                maior = n2;
            }
        } else if (n2 <= n1 && n2 <= n3 && n2 <= n4) {
            menor = n2;
            if (n1 <= n3 && n1 <= n4) {
                meio1 = n1;
                if (n3 <= n4) {
                    meio2 = n3;
                    maior = n4;
                } else {
                    meio2 = n4;
                    maior = n3;
                }
            } else {
                meio1 = n3;
                meio2 = n4;
                maior = n1;
            }
        } else if (n3 <= n1 && n3 <= n2 && n3 <= n4) {
            menor = n3;
            if (n1 <= n2 && n1 <= n4) {
                meio1 = n1;
                if (n2 <= n4) {
                    meio2 = n2;
                    maior = n4;
                } else {
                    meio2 = n4;
                    maior = n2;
                }
            } else {
                meio1 = n4;
                meio2 = n1;
                maior = n2;
            }
        } else {
            menor = n4;
            if (n1 <= n2 && n1 <= n3) {
                meio1 = n1;
                if (n2 >= n3) {
                    meio2 = n3;
                    maior = n2;
                } else {
                    meio2 = n2;
                    maior = n3;
                }
            } else {
                meio1 = n2;
                meio2 = n1;
                maior = n3;
            }
        }

        JOptionPane.showMessageDialog(null, menor + "-" + meio1 + "-" + meio2 + "-" + maior);
    }
}
