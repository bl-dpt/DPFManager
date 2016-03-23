package dpfmanager.shell.interfaces.gui.component.show;

import dpfmanager.shell.core.config.GuiConfig;
import dpfmanager.shell.core.messages.ReportsMessage;
import dpfmanager.shell.core.messages.UiMessage;
import dpfmanager.shell.core.mvc.DpfController;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonParser;

import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Adrià Llorens on 17/03/2016.
 */
public class ShowController extends DpfController<ShowModel, ShowView> {

  public ShowController(){

  }

  public void showSingleReport(String type, String path) {
    System.out.println("Showing report...");
    switch (type) {
      case "html":
        getView().showWebView(path);
        break;
      case "xml":
        getView().showTextArea(getContent(path));
        break;
      case "json":
        String content = getContent(path);
        content = new GsonBuilder().setPrettyPrinting().create().toJson(new JsonParser().parse(content));
        getView().showTextArea(content);
        break;
      case "pdf":
        try {
          getView().getContext().send(GuiConfig.PRESPECTIVE_REPORTS,new UiMessage());
          Desktop.getDesktop().open(new File(path));
        } catch (IOException e) {
          e.printStackTrace();
        }
        break;
      default:
        break;
    }
  }

  private String getContent(String path) {
    String content = "";
    try {
      BufferedReader input = new BufferedReader(new FileReader(path));
      try {
        String line;
        while ((line = input.readLine()) != null) {
          if (!content.equals("")) {
            content += "\n";
          }
          content += line;
        }
      } finally {
        input.close();
      }
    } catch (IOException ex) {
      ex.printStackTrace();
    }
    return content;
  }

}