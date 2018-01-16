public class LongestDictionaryWord {	
	public static void main(String a[]) 
	{
	
		String s1 =  "abppplee";
		String[] s2= {"able", "ale", "apple", "bale", "kangaroo"};
		
		int count[] = new int[100];
		int ccheck[] = new int[100];
		for(int i=0;i<100;i++)
		    {
			count[i] = 0;
			ccheck[i] = 0;
		    }
		for (int k=0; k<s2.length;k++)
		{
			count[k] = s2[k].length();
			
			for(int q=0;q<s2[k].length();q++)
				{
					
					for(int j=0;j<s1.length();j++)
					{
						if(s1.charAt(j)== s2[k].charAt(q))
							{
								ccheck[k] = ccheck[k]+1;
								//System.out.println(s1.charAt(q)+ "\t Found");
								break;
							}
					}
				}
		}
		int temp;
		for(int y=0;y<ccheck.length - 1;y++)
			{
				for(int z=1;z<ccheck.length - 1;z++)
				{
					if(ccheck[y]<ccheck[z])
					{
					temp = ccheck[y];
					ccheck[y] = ccheck[z];
					ccheck[z]=temp;
					}
				}
			}
		for (int l=0; l<s2.length;l++)
			{
				if(ccheck[0] == s2[l].length())
				{
					//System.out.println(ccheck[0]);
					System.out.println(s2[l] +"\t string is the largest substring of \t"+s1);
					continue;
				}
			}
	}
}
	
	
