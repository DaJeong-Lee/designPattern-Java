package composite;

public class Main {
	public static void main(String[] args) {
		Folder 
		root = new Folder("root")
		, A= new Folder("A")
		, B= new Folder("B")
		, B_1= new Folder("B_1")
		, C= new Folder("C")
		, D= new Folder("D");
		
		File 
		A_1 = new File("A_1")
		, B_1_1= new File("B_1_1")
		, B_2_1= new File("B_2_1")
		, C_1= new File("C_1")
		, D_1= new File("D_1");

		root.addComponent(A);
			A.addComponent(B);
				B.addComponent(C);
					C.addComponent(D);
				B.addComponent(B_1_1);
				B.addComponent(B_2_1);
			A.addComponent(B_1);
			A.addComponent(A_1);
			
		Main.show(root);
	}
	
	private static void show(Component component){
		System.out.println(component.getClass().getName()+"|"+component.getName());
		if(component instanceof Folder){
			for (Component c : ((Folder)component).getChildren()) {
					show(c);
			}
		}
		
	}
	
	
}
