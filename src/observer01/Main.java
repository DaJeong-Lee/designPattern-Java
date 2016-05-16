package observer01;

import observer01.Button.OnClickListener;

public class Main {
	public static void main(String[] args) {
		Button button = new Button();
		
		//익명 이너 클래스 
		button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(Button button) {
				System.out.println(button+" is clicked");
				
			}
		});
		
		button.onClick();
	}
}

