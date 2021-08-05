package com.yyc.learnleetcode.learnalgorithms.a1570;

/**
 * @author yuechao
 */
public class App {

  public static void main(String[] args) {
    var v1 = new SparseVector(new int[]{1, 0, 0, 2, 3});
    var v2 = new SparseVector(new int[]{0, 3, 0, 4, 0});
    int ans = v1.dotProduct(v2);
    System.out.println(ans);
  }

  public static int executeDotProduct(int[] vector1, int[] vector2) {
    var v1 = new SparseVector(vector1);
    var v2 = new SparseVector(vector2);
    return v1.dotProduct(v2);
  }

}
