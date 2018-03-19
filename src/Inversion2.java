
import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;

public class Inversion2 extends Application {

	private String separator = " ";

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
				String str = tf1.getText();

				label1.setText(revertor(str, separator));
			}
		};
		
		btnInverse.setOnAction(ehInverse);

		root1.getChildren().addAll(tf1, btnInverse, label1);
		stage1.show();

	}

	private String revertor(String str, String separator){
		String[] strBuf = str.split(separator);

		for (int x = 0; x <= (strBuf.length - 1); ++x) {
			strBuf[x] = new StringBuffer(strBuf[x]).reverse().toString();
		}
		return String.join(separator, strBuf);

//		String newstr = "";
//		String[] z = str.split(separator);
//		for (String littleStr : z){
//			char[] barray = littleStr.toCharArray();
//			for (int i = barray.length-1; i>=0; i--) {
//				newstr = newstr +  barray[i];
//			}
//			newstr += separator;
//		}
//		return newstr;

	}

}
