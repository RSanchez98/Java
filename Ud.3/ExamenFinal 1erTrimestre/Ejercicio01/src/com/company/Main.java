package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int[]a1={1,3,5,7};
        int[]a2={2,3,4,5,6,7};
        int[]a3={1,2,3,4,5};
        elementosComunes3(a1,a2,a3);
    }
    public static void elementosComunes3(int[]a1,int[]a2,int[]a3)
    {
        int i, j, k;
        for (i = 0; i<a1.length; i++)
        {
            for (j = 0; j<a2.length; j++)
            {
                if (a1[i]==a2[j])
                {
                    for (k = 0; k<a3.length; k++)
                    {
                        if (a1[i]==a3[k])
                        {
                            System.out.print(a1[i]+" ");
                        }
                    }
                }
            }
        }
    }
}
