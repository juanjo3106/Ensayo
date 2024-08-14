public class RandomMatriz {

    private int matriz[][];

    public int [][] llenadoMatrizAleatoriamente(int n){

        matriz = new int[n][n];

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){

                matriz[i][j] = (int) (Math.random()*19-9);

            }
  
        }


        return matriz;
    }
}