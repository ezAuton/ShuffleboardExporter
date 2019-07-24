package com.github.ezauton.ezshuffleboard.widget;

import edu.wpi.first.shuffleboard.api.data.types.NoneType;
import edu.wpi.first.shuffleboard.api.widget.Description;
import edu.wpi.first.shuffleboard.api.widget.ParametrizedController;
import edu.wpi.first.shuffleboard.api.widget.SimpleAnnotatedWidget;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

@Description(
    name = "Export logs",
    dataTypes = NoneType.class,
    summary = "Exports logs"
)
@ParametrizedController("SimplePointWidget.fxml")
public final class LogExporterWidget extends SimpleAnnotatedWidget<NoneType> {

  @FXML
  private Pane root;
//  @FXML
//  private Label xCoordinateView;
//  @FXML
//  private Label yCoordinateView;

  @FXML
  private void initialize() {
    // Bind the text in the labels to the data
    // If you are unfamiliar with the -> notation used here, read the Oracle tutorial on lambda expressions:
    // https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html
//    xCoordinateView.textProperty().bind(dataOrDefault.map(point -> point.getX()).map(x -> "X: " + x));
//    yCoordinateView.textProperty().bind(dataOrDefault.map(point -> point.getY()).map(y -> "Y: " + y));
  }

  @FXML
  private void onExportLog(ActionEvent e) {
    System.out.println("fds");
  }

  @Override
  public Pane getView() {
    return root;
  }
}
