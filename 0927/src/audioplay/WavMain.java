package audioplay;

import java.io.FileInputStream;

import javazoom.jl.player.Player;

public class WavMain {

	public static void main(String[] args) {
		try{
												/*
												 //로컬 파일의 URL
												 
												URL url = new URL
														//현재 디렉토리
														//("file:./pottery_workshop.wav");
														//절대경로
														("file:////Users/tjoeun304/eclipse/0902/0927/pottery_workshop.wav");
												AudioClip audio = Applet.newAudioClip(url);
												audio.play();
												*/
			Player player = new Player(new FileInputStream("./y2.mp3"));
				player.play();
			//mp3 재생은 javafx 패키지의 MediaPlayer 클래스로도 가능
			/*
		javafx.scene.media.Mida = m
		new javarx.scene.media.Widia("파)
			
			
			
			*/
		}catch (Exception e) {
			System.out.printf("%s\n", e.getMessage());
			
		}

	}

}
