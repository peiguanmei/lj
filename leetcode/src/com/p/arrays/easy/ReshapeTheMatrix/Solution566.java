package com.p.arrays.easy.ReshapeTheMatrix;


import org.junit.Test;

import java.util.Arrays;

/**
 * <pre>
 *     title :
 *     In MATLAB, there is a very useful function called 'reshape', which can reshape a matrix into a new one with different size
 *     but keep its original data.
 *
 *     You're given a matrix represented by a two-dimensional array, and two positive integers r and c representing the row number
 *     and column number of the wanted reshaped matrix, respectively.
 *
 *     The reshaped matrix need to be filled with all the elements of the original matrix in the same row-traversing order as they were.
 *     If the 'reshape' operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.
 *
 *     Example 1：
 *          Input:
 *               nums = [[1,2],
 *                       [3,4]]
 *               r = 1, c = 4
 *          Output:
 *              [[1,2,3,4]]
 *          Explanation:
 *              The row-traversing of nums is [1,2,3,4]. The new reshaped matrix is a 1 * 4 matrix, fill it row by row by using the previous list.
 *
 *     Example 2：
 *          Input:
 *              nums = [[1,2],
 *                      [3,4]]
 *              r = 2, c = 4
 *          Output:
 *              [[1,2],
 *               [3,4]]
 *          Explanation:
 *              There is no way to reshape a 2 * 2 matrix to a 2 * 4 matrix. So output the original matrix.
 *
 *     note :
 *          The height and width of the given matrix is in range [1, 100].
 *          The given r and c are all positive.
 *
 *     题目大意:
 *          重塑一个矩阵，需要给出新矩阵的行和列，若新矩阵的行和列不符合规则(新矩阵元素个数不等于原矩阵)就返回原矩阵，否则就返回新矩阵。不用排序
 *
 *     重塑矩阵规则：
 * ×          原矩阵从上到下，从左到右取出元素，依次赋值给新矩阵对应位置(从上到下，从左到右)
 *
 *     思路:
 *        先将原数组展开为一维数组，元素个数为m*n, 元素在一维数组中对应的位置i:
 *        原矩阵位置 : [i/m][i%m]
 *        新矩阵位置 : [i/c][i%c]
 * </pre>
 */
public class Solution566 {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int n = nums.length;
        int m = nums[0].length;
        if (m * n != r * c) {
            return nums;
        }
        int[][] result = new int[r][c];
        for (int i = 0; i < r * c; i++) {
            //[[1,2,3][4,5,6]] -> [[1,2][3,4][5.6]]  3x2 -> 2x3     [i/2][i%2]  <- [i/3][i%3]
            //result[0][0]=num[0][0]=1  i=0 以此类推
            //result[0][1]=num[0][1]=2  i=1
            //result[1][0]=num[0][2]=3  i=2
            //result[1][1]=num[1][0]=4  i=3
            result[i / c][i % c] = nums[i / m][i % m];
        }
        return result;
    }

    @Test
    public void TestCase() {
        int nums[][] = {{1,2},{3,4},{5,6}};
        int r = 2 , c =3;
        System.out.println("原数组是:"+Arrays.deepToString(nums));
        System.out.println("新数组是:"+Arrays.deepToString(matrixReshape(nums,r,c)));
/*        int out[][] = matrixReshape(nums, r, c);
        for (int[] ints : out) {
            System.out.println(Arrays.toString(ints));
            for (int obj : ints) {
                System.out.println(obj);
            }
        }*/
        //System.out.println(out);
    }
}
