import java.util.Scanner;

public class Sol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        
        int[][] b = new int[m][n];
        int[][] a = new int[m][n];
        int[][] c = new int[m][n];


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                b[i][j] = scanner.nextInt();
                a[i][j] = 1;
                c[i][j] = 0;
            }
        }


        for (int i = 0; i < m; ++i)
            {
                for (int j = 0; j < n; ++j)
                {
                    if (b[i][j] == 0)
                    {
                        for (int k = 0; k < n; ++k)
                        {
                            a[i][k] = 0;
                        }
                        for (int k = 0; k < m; ++k)
                        {
                            a[k][j] = 0;
                        }

                    }
                }
            }
        for (int i = 0; i < m; ++i)
            {
                for (int j = 0; j < n; ++j)
                {
                    if (a[i][j]==1 )
                    {
                        for (int k = 0; k < n; ++k)
                        {
                            c[i][k] = 1;
                        }
                        for (int k = 0; k < m; ++k)
                        {
                            c[k][j] = 1;
                        }

                    }
                }
            }


    for (int i = 0; i < m; ++i)
    {
    	for (int j = 0; j < n; ++j)
    	{
    		if (c[i][j] != b[i][j])
    		{
                System.out.println("NO");
                return;
    		}
    	}
    }

        System.out.println("YES");


    for (int i = 0; i < m; ++i)
    {
    	for (int j = 0; j < n; ++j)
    	{
                    System.out.print(a[i][j] + " ");

    	}
        System.out.println();
    }
        scanner.close();
    }
}
