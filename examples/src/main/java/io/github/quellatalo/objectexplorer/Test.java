package io.github.quellatalo.objectexplorer;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import io.github.quellatalo.fx.explr.ObjExplorer;

public class Test extends Application {
    private final String ID = "id";

    @Override
    public void start(Stage primaryStage) throws IOException {
        List<YourClass> classes = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            classes.add(new YourClass(i, UUID.randomUUID().toString(), LocalDateTime.now().plusDays(i)));
        }
        ObjExplorer<List<YourClass>> classObjectExplorer = new ObjExplorer<>(classes);
        Scene scene = new Scene(classObjectExplorer);
        scene.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.F3) {
//                classObjectExplorer.getTvChildren().openFilter();
            }
        });
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
