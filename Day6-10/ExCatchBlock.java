package pack1;
	public class ExCatchBlock{
		public static void main(String[] args){
			try{
				int x= 12/0;
			}catch(ArithmeticException ae){
				System.out.println("ArithmeticExceptiopn Caught hers: "+ae);
				try{
					String str=null;
					int str_length = str.length();
				}catch(NullPointerException ne){
					System.out.println("NullPointerException Occured");
				}
			}
			finally{
				System.out.println("Finally block executed...."); 
			}
	
		}
	}