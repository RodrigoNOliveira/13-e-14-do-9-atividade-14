import javax.swing.JOptionPane;

class App {
    public static void main(String[] args) {

        String numeroS = JOptionPane.showInputDialog(null, "Digite o número desejado ", "Quadrado e raiz",
                JOptionPane.QUESTION_MESSAGE);
        double numero = Double.parseDouble(numeroS);

        if (numero >= 0) {

            double raiz = Math.sqrt(numero);
            double potencia = Math.pow(numero, 2);
            String msg = String.format("%.2f", raiz);

            JOptionPane.showMessageDialog(null,
                    "A raíz de " + numero + " é: " + msg + "\nA potencia de " + numero + " ao quadrado é: " + potencia,
                    "Resultados", JOptionPane.INFORMATION_MESSAGE);
                    
        }

        else {
            JOptionPane.showMessageDialog(null, "Número não positivo", "Quadrado e raiz",
                    JOptionPane.INFORMATION_MESSAGE);
        }

    }
}