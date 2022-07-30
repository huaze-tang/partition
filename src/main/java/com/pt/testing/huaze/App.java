package com.pt.testing.huaze;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public int[][] partition(int[] list, int taille){
        //int [][] res = new int[0][0]; 
        if(taille == 0 || list.length == 0){
            return new int[][]{};
        }
        int index = 0;
        ArrayList<int[]> resList = new ArrayList<int[]>();
        while(index < list.length){
            int a[] = Arrays.copyOfRange(list, index, (index + taille)>list.length? list.length: index + taille);
            resList.add(a);
            index += taille;
        }
        int[][] res = resList.toArray(new int[resList.size()][]);
        //int[][] res = new int[resList.size()][];
        return res;
    }
}
