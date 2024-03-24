public class Exercicio04 {

    public static void executar(){           
      int[] vetor = new int[5];
  
      System.out.println("Informe um valor N: ");
      int n = Prompt.lerInteiro();
  
      System.out.println("Informe valores: ");
      for(int i = 0; i < 5; i++){
          System.out.println("Valor"+(i+1)+":");
          vetor[i] = Prompt.lerInteiro();
      }
  
      System.out.println("----------------------------");
      System.out.println("Valor N:"+ n);
  
      for(int i = 0; i < 5; i++){
      if(vetor[i] < n)
        System.out.println("Posição"+(i+1)+":"+ vetor[i] +"  inferior a valor N!" ); 
       
      }  
  
    }  
}
  