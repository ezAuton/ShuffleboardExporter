package com.github.ezauton.ezshuffleboard;

import com.github.ezauton.ezshuffleboard.widget.LogExporterWidget;
import edu.wpi.first.shuffleboard.api.plugin.Description;
import edu.wpi.first.shuffleboard.api.plugin.Plugin;
import edu.wpi.first.shuffleboard.api.widget.ComponentType;
import edu.wpi.first.shuffleboard.api.widget.WidgetType;

//import com.example.simplewidget.data.type.PointType;

import java.util.List;

/**
 * An example plugin that provides a custom data type (a 2D point) and a simple widget for viewing such data.
 */
@Description(
    group = "com.ezauton",
    name = "EzAuton Log Exporter",
    version = "1.0.0",
    summary = "Export ezAuton log files"
)
public final class LogExporterPlugin extends Plugin {

//  @Override
//  public List<DataType> getDataTypes() {
//    return List.of(
//        PointType.Instance
//    );
//  }

  @Override
  public List<ComponentType> getComponents() {
    return List.of(
        WidgetType.forAnnotatedWidget(LogExporterWidget.class)
    );
  }

//  @Override
//  public Map<DataType, ComponentType> getDefaultComponents() {
//    return Map.of(
//        PointType.Instance, WidgetType.forAnnotatedWidget(SimplePointWidget.class)
//    );
//  }
}
