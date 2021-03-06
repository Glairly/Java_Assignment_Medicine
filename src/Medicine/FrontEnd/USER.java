package Medicine.FrontEnd;

import Medicine.BackEnd.*;
import Medicine.BackEnd.Drug;
import com.sun.javafx.sg.prism.NGTriangleMesh;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
// TEst Push by dink

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dunkdink
 */
public class USER extends Application {

    ArrayList<String> type = new ArrayList<>();
    List<List<String>> name = new ArrayList<>();
  
    
    HBox suggestionBox = new HBox();
    VBox accountBox = new VBox(3);
    VBox gaiyangBox = new VBox(3);
    Scene sugges = new Scene(suggestionBox, 300, 300, Color.BLUE);

    Button button;
    Button logoutBtn = new Button("Logout");
    Button readDiagBtn = new Button("อ่านข้อความ");
    Button backBtn = new Button("ย้อนกลับ");
    Button deleteBtn = new Button("ลบข้อความ");

    //comment
    Comment third;

    public static void main(String[] args) {
        launch(args);
    }

    public boolean isDuplicate(Drug dg, ArrayList<String> kind) {
        int ch = 0;
        for (int i = 0; i < kind.size(); i++) {
            if (kind.get(i).equals(dg.getKind())) {
                ch = 1;
            }
        }
        if (ch == 1) {
            return true; // duplicate
        } else {
            return false;
        }

    }

    public boolean isDup2(Drug dg, List<String> temp) {
        int ch = 0;
        for (int i = 0; i < temp.size(); i++) {
            if (temp.get(i).equals(dg.getName())) {
                ch = 1;
            }
        }
        if (ch == 1) {
            return true;
        } else {
            return false;
        }

    }

    public void ReadDATA2() {
        String line = new String();
        List<String> temp = new ArrayList<>();
        //  ArrayList chtype = new ArrayList<>();
        int[][] a = new int[50][50];
        int[] chtype = new int[50];
        int first = 0;
        //First Line is type
        ArrayList<Drug> arr = API.getAllDrug();
        for (int i = 0; i < arr.size(); i++) {
            temp.clear();
            System.out.println("LoopI");
            if (first == 0) {
                type.add(arr.get(i).getKind());
                System.out.println("Add First");
                first = 1;
            } else {

                if (!isDuplicate(arr.get(i), type)) {
                    type.add(arr.get(i).getKind());
                    System.out.println("Added");
                }
            }
            System.out.println(type);
        }
        for (int i = 0; i < type.size(); i++) {
            temp = new ArrayList<>();
            for (int j = 0; j < arr.size(); j++) {
                if (type.get(i).equals(arr.get(j).getKind()) && !isDup2(arr.get(j), temp)) {
                    temp.add(arr.get(j).getName());
                }

                System.out.print("temp= " + temp);

            }
            name.add(temp);

            System.out.println("NAme= " + name);
        }

    }

    @Override
    public void start(Stage userStage) throws Exception { // this is main!
        userStage.initStyle(StageStyle.UNDECORATED);
         userStage.setScene(Setscene(userStage));
        userStage.centerOnScreen();
        userStage.show();
       

    }

    public Scene Setscene(Stage userStage) {

        Symptom sym = new Symptom(userStage);

        userStage.setResizable(false);
       
        third = new Comment(userStage);
        ReadDATA2(); // Call Function
        userStage.setTitle("Pharmacy Information System");

        Button button = new Button();
        button.setText("Ctegory1");

        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                System.out.println("Click! 1");
            }
        });

        Button button2 = new Button("ดูข้อมูลของยา");
        Button button4 = new Button("สอบถามอาการเบื้องต้น");
        //Button button3 = new Button("ขอความคิดเห็นเกี่ยวกับโปรแกรม");

      
        ComboBox cb1 = new ComboBox();
        ComboBox cb2 = new ComboBox();
        cb1.setMinSize(200, 30);
        cb2.setMinSize(200, 30);
        cb1.setPromptText("เลือกประเภทยา");
        cb2.setPromptText("เลือกยา");

       
        cb1.getItems().addAll(type);

        BorderPane layout = new BorderPane();
        VBox vbox = new VBox();
       
        
        vbox.getChildren().addAll(cb1, cb2, button2, button4, readDiagBtn, logoutBtn);
        //INSERT TOP LEFT BOTTON RIGHT
        VBox.setMargin(cb1, new Insets(10, 0, 5, 0)); // set Margin btn1
        VBox.setMargin(cb2, new Insets(10, 0, 5, 0)); // set Margin btn2
        vbox.setAlignment(Pos.CENTER);
        layout.setCenter(vbox);
        layout.setTop(GLOBALBAR(userStage));
        Scene scene = new Scene(layout, 400, 250);
         userStage.setScene(scene);
        //userStage.show();

        //Event zone
        cb1.setOnAction(new EventHandler<ActionEvent>() { // if cb1 change value = change value in cb 2 ...
            @Override
            public void handle(ActionEvent e) {
                cb2.getItems().clear(); // Clear old member
                int index = type.indexOf(cb1.getValue()); // Find index of (A,B,C) in type

                cb2.getItems().addAll(name.get(index)); // it mean name[i] -> but use .get(i)
            }
        });

        button2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                if (cb1.getValue() != null && cb2.getValue() != null) {
                    System.out.println(String.format("Select %s -> %s", cb1.getValue(), cb2.getValue()));
                    API.InitDrugInform();
                    String s = String.format("%s", cb2.getValue());
                    System.out.println(API.getCustom("Drugs"));
                    System.out.println(s);
                    int index = Drug.getIdxDrug(s);
                    Drug dg = Database.getDrug().get(index);
                    System.out.println(dg);
                    System.out.print("price = " + dg.getPrice());

                    //System.out.println(indx);
                    final Stage dialog = new Stage();
                    dialog.initModality(Modality.APPLICATION_MODAL);
                    dialog.initOwner(userStage);
                    VBox dialogVbox = new VBox(20);                 
                   dialogVbox.getChildren().add(new Text(String.format("\n\n\n      Kind : %s\n\n      Name : %s\n\n      Description : %s\n\n      Price : %s\n", dg.getKind(), dg.getName(), dg.getDescription(), dg.getPrice())));
                  // dialogVbox.getChildren().add(textshow);
                   Scene dialogScene = new Scene(dialogVbox, 650, 180);
                    dialog.setScene(dialogScene);
                    dialog.show();
                } else {
                    System.out.println("Error!");
                }
            }
        });

        button4.setOnAction((ActionEvent ex) -> {
            sym.show();
            userStage.hide();
        });

        deleteBtn.setOnAction((ActionEvent ex) -> {
            User us = User.getById(Register.usrname);
            String l = Register.usrname;
            Text a = new Text();
            Database db = new Database();
            db.setFile("Suggestions");
            ArrayList<Suggestion> arr = API.getAllSug();
            System.out.println("arr>>");
            System.out.println(arr);
            System.out.println("<<");
            db.write(null);
            suggestionBox.getChildren().clear();
            accountBox.getChildren().clear();
            gaiyangBox.getChildren().clear();
            int t = arr.size();
            for (int i = arr.size() - 1; i >= 0; i--) {
                //System.out.println("Name="+name);
                if (arr.get(i).getReceiver().equals(l)) {
                    System.out.println("First");
                    arr.remove(i);
                }
            }
            db.write(arr);
            for (int i = 0; i < arr.size(); i++) {
                if (arr.get(i).getReceiver().equals(l)) {
                    
                    a.setText(arr.get(i).getMessage());
                   // suggestionBox.getChildren().addAll(new Text(arr.get(i).getMessage()));
                }
            }
            System.out.println(arr);
            accountBox.getChildren().add(new Text(String.format("ชื่อ : %s\n นามสกุล : %s\nอายุ : %s\nเพศ : %s", us.getFirstName(),us.getLastName(),us.getAge(),us.getGender())));
            gaiyangBox.getChildren().addAll(accountBox,new Text("คำแนะนำจากเภสัชกร : "), a , deleteBtn, backBtn );
            gaiyangBox.setAlignment(Pos.CENTER);
            suggestionBox.getChildren().addAll(gaiyangBox);
            suggestionBox.setAlignment(Pos.CENTER);
        });
            
        backBtn.setOnAction((ActionEvent ex) -> {
            userStage.setScene(scene);
        });

        readDiagBtn.setOnAction((ActionEvent ex) -> {
            User us = User.getById(Register.usrname);
            
            String name = Register.getusrname();
            String ms = new String();
            for (int i = 0; i < API.getAllSug().size(); i++) {
                if (API.getAllSug().get(i).getReceiver().equals(name)) {
                    ms = API.getAllSug().get(i).getMessage();
                }
            }
            System.out.println(ms);
            suggestionBox.getChildren().clear();
            accountBox.getChildren().clear();
            gaiyangBox.getChildren().clear();
            accountBox.getChildren().add(new Text(String.format("ชื่อ : %s\nนามสกุล : %s\nอายุ : %s\nเพศ : %s", us.getFirstName(),us.getLastName(),us.getAge(),us.getGender())));
            gaiyangBox.getChildren().addAll(accountBox, new Text("คำแนะนำจากเภสัชกร : " + ms), deleteBtn, backBtn );
            gaiyangBox.setAlignment(Pos.CENTER);
            suggestionBox.getChildren().addAll(gaiyangBox);
            suggestionBox.setAlignment(Pos.CENTER);
            
            
            userStage.setScene(sugges);

        });

        return scene;

    }
  public HBox GLOBALBAR(Stage a) {
        HBox loginBar = new HBox();
        loginBar.setStyle("-fx-background-color:rgb(187,88,35) ");
        try {

            ImageView minImage = new ImageView(new Image(new FileInputStream("src/Medicine/FrontEnd/Images/min1.png")));
            loginBar.getChildren().add(minImage);
            minImage.setOnMouseClicked((t) -> {
                a.setIconified(true);
            });
            loginBar.setAlignment(Pos.CENTER_RIGHT);

            ImageView closeImage = new ImageView(new Image(new FileInputStream("src/Medicine/FrontEnd/Images/cancle1.png")));
            loginBar.getChildren().add(closeImage);
            closeImage.setOnMouseClicked((t) -> {
                System.exit(0);
            });
            loginBar.setAlignment(Pos.CENTER_RIGHT);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return loginBar;
    }

}
