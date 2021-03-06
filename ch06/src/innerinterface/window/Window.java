package innerinterface.window;

public class Window {
	Button button1 = new Button();
	Button button2 = new Button();
	
	//필드 - 익명 객체로 구현
	Button.OnClickListener listener = new Button.OnClickListener() {
		
		@Override
		public void onClick() {
			System.out.println("전화를 겁니다.");
		}
	};
	
	//생성자
	Window(){
		button1.setOnClickListener(listener);
		button2.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("메시지를 보냅니다.");
			}
		});
	}
}
