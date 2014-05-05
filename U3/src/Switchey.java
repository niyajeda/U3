
public class Switchey {
	public static void main(String[] args)
	{
		int i = -1;
		out: while(true){
			i++;
			int j = -i;
			if (i > 6) 
				break;
			if(j<-3)
				continue;
			i += 1;
			in: while( i == -1){
				i = -1;
				break out;
			}
		}
	}
}
