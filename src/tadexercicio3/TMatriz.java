package tadexercicio3;

import java.util.Random;
import javax.swing.JOptionPane;

public class TMatriz implements Interface{
    
    private int[][] matriz;
    private int l;
    private int c;
    

    Random gerador = new Random();
    
    
    
    public TMatriz(int l, int c) {
        this.l = l;
        this.c = c;
        
        this.matriz = new int[this.getL()][this.getC()];
        this.setMatriz(matriz);
    }

    
    
    
    
    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }
    

    
    
    
    
    
    
    @Override
    public void soma() {
        
        int linha = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de linhas (2°):"));
        int coluna = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de colunas (2°):"));
        int soma[][] = new int[linha][coluna];
        
        for (int i = 0; i < soma.length; i++) {
            for (int j = 0; j < soma[0].length; j++) {
                    soma[i][j] = gerador.nextInt(3);
            }
        }
        
        for (int i = 0; i < this.getMatriz().length; i++) {
             for (int j = 0; j < this.getMatriz()[0].length; j++) {
                 this.matriz[i][j] = this.matriz[i][j] + soma[i][j];
             }
        }
        
        for (int i = 0; i < this.matriz.length ; i++) {
                for (int j = 0; j < this.matriz[0].length; j++) {
                    System.out.print(this.matriz[i][j] + "");
                }
            System.out.println();
        }
    }  
    
    
    
    
    
    
    
    
    
    @Override
    public void multiplica() {
        
        int linha = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de linhas (2°):"));
        int coluna = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de colunas (2°):"));
        int multiplica[][] = new int[linha][coluna];
        
        for (int i = 0; i < multiplica.length; i++) {
            for (int j = 0; j < multiplica[0].length; j++) {
                    multiplica[i][j] = gerador.nextInt(3);
            }
        }
        
        if(this.matriz[0].length == matriz.length){
            int[][] resultante = new int [this.getL()][coluna]; 
            for (int i = 0; i < this.getL(); i++) {
                  for (int j = 0; j < coluna; j++) {
                      for (int k = 0; k < linha; k++) {
                          resultante[i][j] += this.matriz[i][k] * multiplica[k][j];
                      }
                  } 
            }
            
            for (int i = 0; i < this.getL(); i++) {
                for (int j = 0; j < coluna; j++) {
                    System.out.print(resultante[i][j] + "");
                }
            System.out.println();
            }
        }
        else{
            System.out.println("Não é possivel realizar a multiplicação");
        }
        
        
    }

    @Override
    public void transposta() {
        int transposta[][] = new int[this.getC()][this.getL()];
        
        
        for (int i = 0; i < transposta.length; i++) {
            for (int j = 0; j < transposta[0].length; j++) {
                transposta[i][j] = this.matriz[j][i];
            }
        }
        for (int i = 0; i < transposta.length; i++) {
                for (int j = 0; j < transposta[0].length; j++) {
                    System.out.print(transposta[i][j] + "");
                }
            System.out.println();
        }
    }
  
        

    @Override
    public void imprimir() {
         for (int i = 0; i < this.getMatriz().length; i++) {
            for (int j = 0; j < this.getMatriz()[0].length; j++) {
                System.out.print(this.getMatriz()[i][j]);
            }
            System.out.println();
         }
    }

    @Override
    public void preencher() {
        for (int i = 0; i < this.getMatriz().length; i++) {
            for (int j = 0; j < this.getMatriz()[0].length; j++) {
                    matriz[i][j] = gerador.nextInt(3);
            }
         }
        
    }
    
    
    
    
}
