package arrayinjava2;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int abc[][]= {{2,4,5},{3,0,7},{1,2,9}};
		int min=abc[0][0];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(abc[i][j]<min)
				{
					min=abc[i][j];
					int mincoloumn = j;
				}
			}
		}
		int mincoloumn;
		int max=abc[0][mincoloumn];
		int k=0;
		while(k<3)
		{
			if(abc[k][mincoloumn]>max)
			{
				max=[k][mincoloumn];
			}
			k++;
		}
	}

}
