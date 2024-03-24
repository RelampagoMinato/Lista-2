public class Exercicio10 {
    
    public static void executar(){

    int[] vetora = new int[5];
    int[] vetorb = new int[5];

    System.out.println("Preencha vetor A: ");
        for(int i = 0; i<5; i++){
            System.out.println("Posição"+(i+1)+": ");
            vetora[i]= Prompt.lerInteiro();
        }
        for(int i = 0; i <5; i++){
        vetorb[i] = vetora[4-i];
        }
       
        for(int i = 0; i <5; i++){
        System.out.println(vetorb[i]+" ");
        }

    }
}
