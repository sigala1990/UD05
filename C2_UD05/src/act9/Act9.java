package act9;

public class Act9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int i = 0;
			while(i<100) {//condicion, mientras sea mas peq que 100
				i++;//autoincrement
				if(i % 2 == 0 || i % 3 == 0) {// mira si son disibles  entre 2 o 3
					System.out.println(i);	
				}
				
			}
	}

}
