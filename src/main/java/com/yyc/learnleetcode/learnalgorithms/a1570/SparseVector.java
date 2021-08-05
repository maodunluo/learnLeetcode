package com.yyc.learnleetcode.learnalgorithms.a1570;

/**
 * 1570. Dot Product of Two Sparse Vectors
 *
 * @author yuechao
 */
public class SparseVector {

  private int[] indexOfValueIsNotZeroArray;

  SparseVector(int[] nums) {
    indexOfValueIsNotZeroArray = nums;
  }

  /**
   * Return the dotProduct of two sparse vectors
   *
   * @param vec vectors
   * @return dotProduct
   */
  public int dotProduct(SparseVector vec) {
    var dotProduct = 0;
    for (var i = 0; i < indexOfValueIsNotZeroArray.length; i++) {
      dotProduct += indexOfValueIsNotZeroArray[i] * vec.indexOfValueIsNotZeroArray[i];
    }
    return dotProduct;
  }
}
