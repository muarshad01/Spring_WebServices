package com.in28minutes.learnspring.framework;

import org.springframework.boot.SpringApplication;
// import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.in28minutes.learnspring.framework.enterprise.example.web.MyWebController;
import com.in28minutes.learnspring.framework.game.GameRunner;
import com.in28minutes.learnspring.framework.game.GamingConsole;
import com.in28minutes.learnspring.framework.game.MarioGame;
import com.in28minutes.learnspring.framework.game.PacmanGame;
import com.in28minutes.learnspring.framework.game.SuperContraGame;

@SpringBootApplication
public class Application {


	public static void main(String[] args) {
		
		// MarioGame game = new MarioGame();
		// SuperContraGame game = new SuperContraGame();
		// PacmanGame game = new PacmanGame();
		
		// GamingConsole game = new PacmanGame();
		// GameRunner runner = new GameRunner(game);
		
		ConfigurableApplicationContext context
			= SpringApplication.run(Application.class, args);
		
		GameRunner runner = context.getBean(GameRunner.class);
		runner.run();
		
		// MyWebController controller = context.getBean(MyWebController.class);
		// System.out.println(controller.returnValueFromBusinessService());
	}
}
