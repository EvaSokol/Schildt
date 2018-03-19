
import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;

public class Inversion2 extends Application {

	private String separator = new String(" ");

	Label label1 = new Label("Electric Cloud");
	TextField tf1 = new TextField("Electric Cloud");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	public void start(Stage stage1) {

		stage1.setTitle("INVERSION");
		FlowPane root1 = new FlowPane(10, 10);
		Scene scene1 = new Scene(root1, 250, 250);
		stage1.setScene(scene1);

		Button btnInverse = new Button("Inverse!");

		EventHandler<ActionEvent> ehInverse = new EventHandler<ActionEvent>() {

			public void handle(ActionEvent ae) {

				label1.setText(null);
				String str = new String(tf1.getText());
				String[] strBuf = str.split(separator);

				for (int x = 0; x <= (strBuf.length - 1); ++x) {
					strBuf[x] = new StringBuffer(strBuf[x]).reverse().toString();
				}

				str = String.join(separator, strBuf);
				label1.setText(str);

			}

		};
		
		btnInverse.setOnAction(ehInverse);

		root1.getChildren().addAll(tf1, btnInverse, label1);
		stage1.show();

	}

}
