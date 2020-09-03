package io.github.quellatalo.objectexplorer;

import io.github.quellatalo.fx.explr.ObjExplorer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Test extends Application {
    private final String ID = "id";

    @Override
    public void start(Stage primaryStage) throws IOException {
        List<YourInterface> classes = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            classes.add(new YourClass(i, UUID.randomUUID().toString(), LocalDateTime.now().plusDays(i)));
        }
        for (int i = 5; i < 10; i++) {
            classes.add(new YourOtherClass(i, UUID.randomUUID().toString()));
        }
        YourContainer container = new YourContainer();
        container.setClasses(classes);
//        ObjExplorer classObjectExplorer = new ObjExplorer(classes);
        ObjExplorer classObjectExplorer = new ObjExplorer(container);
        Scene scene = new Scene(classObjectExplorer);
        scene.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.F3) {
                classObjectExplorer.getTvChildren().openFilter();
            }
        });
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
