package com.javafxtest.app;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

@SpringBootApplication
public class AppApplication extends Application {
	private ConfigurableApplicationContext context;

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
		launch(args);
	}

	@Override
	public void init() {
		context = SpringApplication.run(AppApplication.class);
	}

	@Override
	public void start(Stage primaryStage) throws IOException {
		System.out.println(getClass().getResource("/gridteste.fxml"));
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/gridteste.fxml"));
		System.out.println("a");
		Parent root = fxmlLoader.load();
		System.out.println("a");
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setTitle("JavaFX Application");
		primaryStage.show();
	}

	@Override
	public void stop() {
		context.close();
	}

}
