package tadexercicio3;

import javax.swing.JOptionPane;

public class TADExercicio3 {

    public static void main(String[] args) {
        
        
        
        
        int l = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de linhas:"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de colunas:"));
        TMatriz m = new TMatriz(l,c);
        
        m.preencher();
        m.imprimir();
        // m.soma();
        //m.transposta();
        //m.multiplica();
        //m.imprimir();
    }
    
}
