package utils;
import static java.awt.event.KeyEvent.*;
import static java.awt.event.KeyEvent.VK_1;
import static java.awt.event.KeyEvent.VK_2;
import static java.awt.event.KeyEvent.VK_3;
import static java.awt.event.KeyEvent.VK_4;
import static java.awt.event.KeyEvent.VK_5;
import static java.awt.event.KeyEvent.VK_6;
import static java.awt.event.KeyEvent.VK_7;
import static java.awt.event.KeyEvent.VK_8;
import static java.awt.event.KeyEvent.VK_9;
import static java.awt.event.KeyEvent.VK_A;
import static java.awt.event.KeyEvent.VK_AMPERSAND;
import static java.awt.event.KeyEvent.VK_ASTERISK;
import static java.awt.event.KeyEvent.VK_AT;
import static java.awt.event.KeyEvent.VK_B;
import static java.awt.event.KeyEvent.VK_BACK_QUOTE;
import static java.awt.event.KeyEvent.VK_BACK_SLASH;
import static java.awt.event.KeyEvent.VK_C;
import static java.awt.event.KeyEvent.VK_CIRCUMFLEX;
import static java.awt.event.KeyEvent.VK_CLOSE_BRACKET;
import static java.awt.event.KeyEvent.VK_COLON;
import static java.awt.event.KeyEvent.VK_COMMA;
import static java.awt.event.KeyEvent.VK_D;
import static java.awt.event.KeyEvent.VK_DOLLAR;
import static java.awt.event.KeyEvent.VK_E;
import static java.awt.event.KeyEvent.VK_ENTER;
import static java.awt.event.KeyEvent.VK_EQUALS;
import static java.awt.event.KeyEvent.VK_EXCLAMATION_MARK;
import static java.awt.event.KeyEvent.VK_F;
import static java.awt.event.KeyEvent.VK_G;
import static java.awt.event.KeyEvent.VK_H;
import static java.awt.event.KeyEvent.VK_I;
import static java.awt.event.KeyEvent.VK_J;
import static java.awt.event.KeyEvent.VK_K;
import static java.awt.event.KeyEvent.VK_L;
import static java.awt.event.KeyEvent.VK_LEFT_PARENTHESIS;
import static java.awt.event.KeyEvent.VK_M;
import static java.awt.event.KeyEvent.VK_MINUS;
import static java.awt.event.KeyEvent.VK_N;
import static java.awt.event.KeyEvent.VK_NUMBER_SIGN;
import static java.awt.event.KeyEvent.VK_O;
import static java.awt.event.KeyEvent.VK_OPEN_BRACKET;
import static java.awt.event.KeyEvent.VK_P;
import static java.awt.event.KeyEvent.VK_PERIOD;
import static java.awt.event.KeyEvent.VK_PLUS;
import static java.awt.event.KeyEvent.VK_Q;
import static java.awt.event.KeyEvent.VK_QUOTE;
import static java.awt.event.KeyEvent.VK_QUOTEDBL;
import static java.awt.event.KeyEvent.VK_R;
import static java.awt.event.KeyEvent.VK_RIGHT_PARENTHESIS;
import static java.awt.event.KeyEvent.VK_S;
import static java.awt.event.KeyEvent.VK_SEMICOLON;
import static java.awt.event.KeyEvent.VK_SHIFT;
import static java.awt.event.KeyEvent.VK_SLASH;
import static java.awt.event.KeyEvent.VK_SPACE;
import static java.awt.event.KeyEvent.VK_T;
import static java.awt.event.KeyEvent.VK_TAB;
import static java.awt.event.KeyEvent.VK_U;
import static java.awt.event.KeyEvent.VK_UNDERSCORE;
import static java.awt.event.KeyEvent.VK_V;
import static java.awt.event.KeyEvent.VK_W;
import static java.awt.event.KeyEvent.VK_X;
import static java.awt.event.KeyEvent.VK_Y;
import static java.awt.event.KeyEvent.VK_Z;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

/**
 * Description : Keyboard Utility Functions
 * @author Sangam
 * 
*/

public class KeyboardUtils {

	public static void main(String... args) throws Exception {
		KeyboardUtils keyboard = new KeyboardUtils();
		keyboard.type("Hello there, how are you?");
		String filePath = "C:\\Users\\sanga\\OneDrive\\Documents\\Automation_Class\\Images\\profile.png";
		new KeyboardUtils().type(filePath);
	}

	// Press TAB
	public static void Key_Tab() throws AWTException, InterruptedException
	{		
		Thread.sleep(1000);
		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_TAB); 
		r.keyRelease(KeyEvent.VK_TAB);
	}
	
	

	public  void Key_BrowserBack() throws AWTException, InterruptedException
	{		
		Thread.sleep(1000);
		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_ALT); 
		r.keyPress(KeyEvent.VK_LEFT);
		r.keyRelease(KeyEvent.VK_ALT); 
		r.keyRelease(KeyEvent.VK_LEFT);
	}
	public  void Key_ZoomOut(int n) throws AWTException, InterruptedException
	{		
		Thread.sleep(1000);
		Robot r = new Robot();
		for (int i = 0; i < n; i++) {
			r.keyPress(KeyEvent.VK_CONTROL); 
			r.keyPress(KeyEvent.VK_MINUS);
			r.keyRelease(KeyEvent.VK_CONTROL); 
			r.keyRelease(KeyEvent.VK_MINUS);
		}

	}
	public  void Key_ZoomIn(int n) throws AWTException, InterruptedException
	{		
		Thread.sleep(1000);
		Robot r = new Robot();
		for (int i = 0; i < n; i++) {
			r.keyPress(KeyEvent.VK_CONTROL); 
			r.keyPress(KeyEvent.VK_PLUS);
			r.keyRelease(KeyEvent.VK_CONTROL); 
			r.keyRelease(KeyEvent.VK_PLUS);
		}

	}
	public  void Key_ZoomReset() throws AWTException, InterruptedException
	{		
		Thread.sleep(1000);
		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_CONTROL); 
		r.keyPress(KeyEvent.VK_0);
		r.keyRelease(KeyEvent.VK_CONTROL); 
		r.keyRelease(KeyEvent.VK_0);
	}
	public  void Key_ScrollLock() throws AWTException, InterruptedException
	{		
		Thread.sleep(1000);
		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_SCROLL_LOCK); 
		r.keyRelease(KeyEvent.VK_SCROLL_LOCK);
	}
	public  void Key_Pause() throws AWTException, InterruptedException
	{		
		Thread.sleep(1000);
		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_PAUSE); 
		r.keyRelease(KeyEvent.VK_PAUSE);
	}
	public  void Key_Tab(int n) throws AWTException, InterruptedException
	{		
		Thread.sleep(1000);
		Robot r = new Robot();

		for (int i = 0; i < n; i++) {
			r.keyPress(KeyEvent.VK_TAB); 
			r.keyRelease(KeyEvent.VK_TAB);
			Thread.sleep(1000);

		}
		System.out.println("+ Key_Tab...");	
	}

	public  void Key_ScrollLock(int n) throws AWTException, InterruptedException
	{		
		Thread.sleep(1000);
		Robot r = new Robot();

		for (int i = 0; i < n; i++) {
			r.keyPress(KeyEvent.VK_SCROLL_LOCK); 
			r.keyRelease(KeyEvent.VK_SCROLL_LOCK);
			Thread.sleep(1000);


		}
		System.out.println("+ Key_ScrollLock...");	
	}


	public  void Key_Pause(int n) throws AWTException, InterruptedException
	{		
		Thread.sleep(1000);
		Robot r = new Robot();

		for (int i = 0; i < n; i++) {
			r.keyPress(KeyEvent.VK_PAUSE); 
			r.keyRelease(KeyEvent.VK_PAUSE);
			Thread.sleep(1000);


		}
		System.out.println("+ Key_Pause...");	
	}
	// Press ESC
	public  void Key_Esc() throws Exception
	{
		Thread.sleep(500);
		System.out.println("Key_Esc");
		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_ESCAPE); 
		r.keyRelease(KeyEvent.VK_ESCAPE);
	}

	// Press Key_COLON
	public  void Key_Colon() throws AWTException
	{
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_COLON);
		robot.keyRelease(KeyEvent.VK_COLON);        
		robot.keyRelease(KeyEvent.VK_SHIFT);
	}

	// Press Key_ScrollDown
	public  void Key_ScrollDown() throws AWTException
	{
		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_PAGE_DOWN); 
		r.keyRelease(KeyEvent.VK_PAGE_DOWN); 

	}

	// Press Key_Enter
	public static void Key_Enter() throws InterruptedException, AWTException
	{
		Robot r = new Robot();

		Thread.sleep(1000);

		r.keyPress(KeyEvent.VK_ENTER); 
		r.keyRelease(KeyEvent.VK_ENTER); 
		Thread.sleep(500);

	}
	// Press Key_Space
	public  void Key_Space() throws InterruptedException, AWTException
	{
		System.out.println("Key_Space");
		Robot r = new Robot();

		Thread.sleep(1000);

		r.keyPress(KeyEvent.VK_SPACE); 
		r.keyRelease(KeyEvent.VK_SPACE); 

	}

	// Press Key_Any with KeyEvent as arg
	public  void Key_Any(int keyCode_Eg_KeyEventDotVK_A) throws InterruptedException, AWTException
	{
		Robot r = new Robot();

		Thread.sleep(1000);

		r.keyPress(keyCode_Eg_KeyEventDotVK_A); //KeyEvent.VK_A
		r.keyRelease(keyCode_Eg_KeyEventDotVK_A); //KeyEvent.VK_A

	}
	public  void Key_TabsNEnter(int n) throws AWTException
	{
		Robot r = new Robot();

		System.out.println("+ Key_Tab...");	

		for (int i = 0; i < n; i++) {
			r.keyPress(KeyEvent.VK_TAB); 
			r.keyRelease(KeyEvent.VK_TAB);
		}
		r.keyPress(KeyEvent.VK_ENTER); 
		r.keyRelease(KeyEvent.VK_ENTER); 
	}

	public  void Key_TabsNType(int n, CharSequence value) throws AWTException
	{
		Robot r = new Robot();

		System.out.println("+ Key_TabsNType...");	

		for (int i = 0; i < n; i++) {
			r.keyPress(KeyEvent.VK_TAB); 
			r.keyRelease(KeyEvent.VK_TAB);
		}

		type(value);
		//	r.keyPress(KeyEvent.VK_ENTER); 
		//	r.keyRelease(KeyEvent.VK_ENTER); 
	}

	public  void Key_TabsNTypeNEnter(int n, CharSequence value) throws AWTException
	{
		Robot r = new Robot();

		System.out.println("+ Key_TabsNTypeNEnter...");	

		for (int i = 0; i < n; i++) {
			r.keyPress(KeyEvent.VK_TAB); 
			r.keyRelease(KeyEvent.VK_TAB);
		}

		type(value);
		r.keyPress(KeyEvent.VK_ENTER); 
		r.keyRelease(KeyEvent.VK_ENTER); 
	}
	// Press Key_ScrollDown
	public static void Key_ScrollDown(int n) throws AWTException
	{
		Robot r = new Robot();

		for (int i = 0; i < n; i++) 
			r.keyPress(KeyEvent.VK_PAGE_DOWN); 
		r.keyRelease(KeyEvent.VK_PAGE_DOWN); 
	}
	// Press Key_ScrollUp
	public static void Key_ScrollUp(int n) throws AWTException
	{
		Robot r = new Robot();

		for (int i = 0; i < n; i++) 
			r.keyPress(KeyEvent.VK_PAGE_UP); 
		r.keyRelease(KeyEvent.VK_PAGE_UP); 
	}
	// Press Key_Down
	public static void Key_Down(int n) throws AWTException
	{
		Robot r = new Robot();

		for (int i = 0; i < n; i++) 
			r.keyPress(KeyEvent.VK_DOWN); 
		r.keyRelease(KeyEvent.VK_DOWN); 
	}

	// Press Key_Up
	public static void Key_Up(int n) throws AWTException
	{
		Robot r = new Robot();

		for (int i = 0; i < n; i++) 
			r.keyPress(KeyEvent.VK_UP); 
		r.keyRelease(KeyEvent.VK_UP); 
	}

	// Press Key_Left
	public static void Key_Left(int n) throws AWTException
	{
		Robot r = new Robot();

		for (int i = 0; i < n; i++) 
			r.keyPress(KeyEvent.VK_LEFT); 
		r.keyRelease(KeyEvent.VK_LEFT); 
	}

	// Press Key_Right
	public static void Key_Right(int n) throws AWTException
	{
		Robot r = new Robot();

		for (int i = 0; i < n; i++) 
			r.keyPress(KeyEvent.VK_RIGHT); 
		r.keyRelease(KeyEvent.VK_RIGHT); 
	}
	// Press Key_Home
	public static void Key_Home(int n) throws AWTException
	{
		Robot r = new Robot();

		for (int i = 0; i < n; i++) 
			r.keyPress(KeyEvent.VK_HOME); 
		r.keyRelease(KeyEvent.VK_HOME); 
	}

	// Press Key_End
	public static void Key_End(int n) throws AWTException
	{
		Robot r = new Robot();

		for (int i = 0; i < n; i++) 
			r.keyPress(KeyEvent.VK_END); 
		r.keyRelease(KeyEvent.VK_END); 
	}

	// Press Key_Alt_Press
	public static void Key_Alt_Press() throws AWTException
	{
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ALT); 
	}

	// Press Key_Alt_Release
	public static void Key_Alt_Release() throws AWTException
	{
		Robot r = new Robot();
		r.keyRelease(KeyEvent.VK_ALT); 
	}

	// Press Key_Ctrl_Press
	public static void Key_Ctrl_Press() throws AWTException
	{
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL); 
	}

	// Press Key_Ctrl_Release
	public static void Key_Ctrl_Release() throws AWTException
	{
		Robot r = new Robot();
		r.keyRelease(KeyEvent.VK_CONTROL); 
	}

	// Press Key_ContextMenu
	public static void Key_RightClick() throws AWTException
	{
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTEXT_MENU); 
		r.keyRelease(KeyEvent.VK_CONTEXT_MENU); 
	}
	/*public KeyboardUtils() throws AWTException {
		Robot r = new Robot();

		this.r = new Robot();
	}*/

	/*public KeyboardUtils(Robot robot) {
		Robot r = new Robot();

		this.r = robot;
	}*/

	
	//WORKING : call this and pass a string which is taken as charsequence
	public void type(CharSequence characters) throws AWTException {
		int length = characters.length();
		for (int i = 0; i < length; i++) {
			char character = characters.charAt(i);
			type(character);
		}
	}

	//In case of any letter not working, just add its case (add shift if needed)
	public void type(char character) throws AWTException {
		switch (character) {
		case 'a': doType(VK_A); break;
		case 'b': doType(VK_B); break;
		case 'c': doType(VK_C); break;
		case 'd': doType(VK_D); break;
		case 'e': doType(VK_E); break;
		case 'f': doType(VK_F); break;
		case 'g': doType(VK_G); break;
		case 'h': doType(VK_H); break;
		case 'i': doType(VK_I); break;
		case 'j': doType(VK_J); break;
		case 'k': doType(VK_K); break;
		case 'l': doType(VK_L); break;
		case 'm': doType(VK_M); break;
		case 'n': doType(VK_N); break;
		case 'o': doType(VK_O); break;
		case 'p': doType(VK_P); break;
		case 'q': doType(VK_Q); break;
		case 'r': doType(VK_R); break;
		case 's': doType(VK_S); break;
		case 't': doType(VK_T); break;
		case 'u': doType(VK_U); break;
		case 'v': doType(VK_V); break;
		case 'w': doType(VK_W); break;
		case 'x': doType(VK_X); break;
		case 'y': doType(VK_Y); break;
		case 'z': doType(VK_Z); break;
		case 'A': doType(VK_SHIFT, VK_A); break;
		case 'B': doType(VK_SHIFT, VK_B); break;
		case 'C': doType(VK_SHIFT, VK_C); break;
		case 'D': doType(VK_SHIFT, VK_D); break;
		case 'E': doType(VK_SHIFT, VK_E); break;
		case 'F': doType(VK_SHIFT, VK_F); break;
		case 'G': doType(VK_SHIFT, VK_G); break;
		case 'H': doType(VK_SHIFT, VK_H); break;
		case 'I': doType(VK_SHIFT, VK_I); break;
		case 'J': doType(VK_SHIFT, VK_J); break;
		case 'K': doType(VK_SHIFT, VK_K); break;
		case 'L': doType(VK_SHIFT, VK_L); break;
		case 'M': doType(VK_SHIFT, VK_M); break;
		case 'N': doType(VK_SHIFT, VK_N); break;
		case 'O': doType(VK_SHIFT, VK_O); break;
		case 'P': doType(VK_SHIFT, VK_P); break;
		case 'Q': doType(VK_SHIFT, VK_Q); break;
		case 'R': doType(VK_SHIFT, VK_R); break;
		case 'S': doType(VK_SHIFT, VK_S); break;
		case 'T': doType(VK_SHIFT, VK_T); break;
		case 'U': doType(VK_SHIFT, VK_U); break;
		case 'V': doType(VK_SHIFT, VK_V); break;
		case 'W': doType(VK_SHIFT, VK_W); break;
		case 'X': doType(VK_SHIFT, VK_X); break;
		case 'Y': doType(VK_SHIFT, VK_Y); break;
		case 'Z': doType(VK_SHIFT, VK_Z); break;
		case '`': doType(VK_BACK_QUOTE); break;
		case '0': doType(VK_0); break;
		case '1': doType(VK_1); break;
		case '2': doType(VK_2); break;
		case '3': doType(VK_3); break;
		case '4': doType(VK_4); break;
		case '5': doType(VK_5); break;
		case '6': doType(VK_6); break;
		case '7': doType(VK_7); break;
		case '8': doType(VK_8); break;
		case '9': doType(VK_9); break;
		case '-': doType(VK_MINUS); break;
		case '=': doType(VK_EQUALS); break;
		case '~': doType(VK_SHIFT, VK_BACK_QUOTE); break;
		case '!': doType(VK_SHIFT,VK_1); break;//VK_EXCLAMATION_MARK
		case '@': doType(VK_SHIFT,VK_2); break; // correct
		case '#': doType(VK_SHIFT,VK_3); break;//VK_NUMBER_SIGN
		case '$': doType(VK_SHIFT,VK_4); break;//VK_DOLLAR
		case '%': doType(VK_SHIFT, VK_5); break;
		case '^': doType(VK_SHIFT,VK_6); break;//VK_CIRCUMFLEX
		case '&': doType(VK_SHIFT,VK_7); break;//VK_AMPERSAND
		case '*': doType(VK_SHIFT,VK_8); break;//VK_ASTERISK
		case '(': doType(VK_SHIFT,VK_9); break;//VK_LEFT_PARENTHESIS
		case ')': doType(VK_SHIFT,VK_0); break;//VK_RIGHT_PARENTHESIS
		case '_': doType(VK_SHIFT, VK_MINUS); break; //VK_UNDERSCORE
		case '+': doType(VK_SHIFT,VK_EQUALS); break;//VK_PLUS
		case '\t': doType(VK_TAB); break;
		case '\n': doType(VK_ENTER); break;
		case '[': doType(VK_OPEN_BRACKET); break;
		case ']': doType(VK_CLOSE_BRACKET); break;
		case '\\': doType(VK_BACK_SLASH); break;
		case '{': doType(VK_SHIFT, VK_OPEN_BRACKET); break;
		case '}': doType(VK_SHIFT, VK_CLOSE_BRACKET); break;
		case '|': doType(VK_SHIFT, VK_BACK_SLASH); break;
		case ';': doType(VK_SEMICOLON); break;
		case ':': doType(VK_SHIFT, VK_SEMICOLON); break; //VK_COLON
		case '\'': doType(VK_QUOTE); break;
		case '"': doType(VK_QUOTEDBL); break;
		case ',': doType(VK_COMMA); break;
		case '<': doType(VK_SHIFT, VK_COMMA); break;
		case '.': doType(VK_PERIOD); break;
		case '>': doType(VK_SHIFT, VK_PERIOD); break;
		case '/': doType(VK_SLASH); break;
		case '?': doType(VK_SHIFT, VK_SLASH); break;
		case ' ': doType(VK_SPACE); break;
		default:
			throw new IllegalArgumentException("Cannot type character " + character);
		}
	}

	protected void doType(int... keyCodes) throws AWTException {
		doType(keyCodes, 0, keyCodes.length);
	}

	private void doType(int[] keyCodes, int offset, int length) throws AWTException {
		Robot r = new Robot();

		if (length == 0) {
			return;
		}

		r.keyPress(keyCodes[offset]);
		doType(keyCodes, offset + 1, length - 1);
		r.keyRelease(keyCodes[offset]);
	}

	//NOTWORKING: call type(charsequence)
	
	public static void typeString(String s)
	{
		try {
			Robot robik = new Robot();
			byte[] bytes = s.getBytes();
			for (byte b : bytes)
			{
				int code = b;
				// keycode only handles [A-Z] (which is ASCII decimal [65-90])
				if (code > 96 && code < 123) code = code - 32;
				robik.delay(40);
				robik.keyPress(code);
				robik.keyRelease(code);
			}
		} catch (AWTException e){
		}
	}
}