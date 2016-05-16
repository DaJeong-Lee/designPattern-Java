package facade.system;

class HelpSystem01 {
	public HelpSystem01(){
		System.out.println("call cunstructor "+ getClass().getSimpleName());
	}
	
	public void process(){
		System.out.println("call process "+ getClass().getSimpleName());
	}
}
