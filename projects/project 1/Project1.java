/*
Project1.java
Cameron Brenner
Software Dev 1
Project 1
March 30, 2017
Project 1
*/
import java.util.*;

public class Project1{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
     
    System.out.println("Length of the first vector: ");
    int lengthA = input.nextInt();
    double[] vecA = new double[lengthA];
    
    System.out.println("Length of the second vector: ");
    int lengthB = input.nextInt();
    double[] vecB = new double[lengthB];

    System.out.println("First vector values: ");
    for (int n = 0; n < lengthA; n++){
        vecA[n] = input.nextDouble();
    }

    System.out.println("Second vector values: ");
    for (int q = 0; q < lengthB; q++){
        vecB[q] = input.nextDouble();
    }

    int[] conVec = convolve(vecA, vecB, lengthA, lengthB);
     
    System.out.print("The convolved vector is: " + Arrays.toString(conVec));
    
    }


  static int[] convolve(double[] vector1, double[] vector2, int veclen1, int veclen2) {
    int[] vectorResult = new int[(veclen1 + veclen2)- 1];
    for(int k = 0; k < vectorResult.length; k++){
      vectorResult[k] = 0;
      for(int u = k, w = 0; w < veclen2; u--,w++){
        if(u < 0 || u >= veclen1){
          vectorResult[k] += 0 * vector2[w];
        }
        else{
          vectorResult[k] += vector1[u] * vector2[w];
        }
      }
    }
      
    return vectorResult;
  }
}