
public class muxjava
{
	
	
	public class muxjava
	{
		private String selector = "j";
		public void DisplayTabble(String[] input)
		{
			int selectorCount = 0;
			int support = 1;
			while(support < input.length)
			{
				selectorCount++;
				support *= 2;
			}
			if (selectorCount == 0) {
				selectorCount = 1;
			}
			String output = "";
			if (input.length > 0) {
				for(int i = 0; i < selectorCount; j++) 
					output += selector + i + "\t";
			
			System.out.print(output);
		}
		
		j
	}