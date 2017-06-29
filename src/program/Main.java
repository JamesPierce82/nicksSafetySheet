package program;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        // Create the Gridpane for displaying the form itself
        GridPane gPane = new GridPane();

        gPane.setHgap(15);
        gPane.setVgap(5);

        // Sets the alignment of each column
        ColumnConstraints column0 = new ColumnConstraints();
        column0.setHalignment(HPos.LEFT);
        ColumnConstraints column1 = new ColumnConstraints();
        column1.setHalignment(HPos.CENTER);
        ColumnConstraints column2 = new ColumnConstraints();
        column2.setHalignment(HPos.CENTER);
        ColumnConstraints column3 = new ColumnConstraints();
        column3.setHalignment(HPos.CENTER);
        ColumnConstraints column4 = new ColumnConstraints();
        column4.setHalignment(HPos.CENTER);
        ColumnConstraints column5 = new ColumnConstraints();
        column5.setHalignment(HPos.CENTER);
        gPane.getColumnConstraints().addAll(column0, column1, column2, column3, column4, column5);


        // Show the grid lines - Not really necessary
//        gPane.setGridLinesVisible(true);
//        gPane.setStyle("-fx-background-color: #DDFFFF;");

        // Create a ScrollPane to host the GridPane inside.
        ScrollPane sPane = new ScrollPane(gPane);


        // Create children to be placed in gPane
        Label OSILabel = new Label("Ontario Safety Inspection");
        Label autoClinicLabel = new Label("Nick's Auto Clinic");

        // Header labels
        Label legendLabel = new Label("***Legend***\nOK = PASS\nREPAIR REQUIRED = FAIL");
        Label okLabel = new Label("OK\n  ");
        Label repairRequiredLabel = new Label("REPAIR\nREQUIRED");
        Label suggestedPreventiveLabel = new Label("SUGGESTED\nPREVENTIVE");
        Label suggestedPerformanceLabel = new Label("SUGGESTED\nPERFORMANCE");
        Label commentsLabel = new Label("\nComments");

        // Row labels
        Label inspectionResultLabel = new Label("INSPECTION RESULT");
        Label s1Label = new Label("SECTION 1. POWERTRAIN");
        Label s2Label = new Label("SECTION 2. SUSPENSION");
        Label s3Label = new Label("SECTION 3. BRAKE SYSTEMS");
        Label lfpLabel = new Label("Left Front Pads(mm)");
        Label rfpLabel = new Label("RIght Front Pads(mm)");
        Label lrpLabel = new Label("Left Rear Pads(mm)");
        Label rrpLabel = new Label("Right Rear Pads(mm)");
        Label frdLabel = new Label("Front Rotors or Drums(mm)");
        Label rrdLabel = new Label("Rear Rotors or Drums(mm)");
        Label fbsLabel = new Label("Front Brake Shoes(mm)");
        Label rbsLabel = new Label("Rear Brake Shoes(mm)");
        Label s4Label = new Label("SECTION 4. STEERING");
        Label s5Label = new Label("SECTION 5. INSTRUMENTS AND AUXILIARY EQUIPMENT");
        Label s6label = new Label("SECTION 6. LAMPS");
        Label s7Label  = new Label("SECTION 7. ELECTRICAL SYSTEMS");
        Label s8Label  = new Label("SECTION 8. BODY");
        Label wtLabel  = new Label("Window Tint");
        Label s9Label = new Label("SECTION 9. TIRE AND WHEEL");
        Label ftdLabel  = new Label("Front Tread Depth");
        Label rtdLabel  = new Label("Rear Tread Depth");
        Label tpLabel = new Label("Tire Pressure(PSI) - Only req'd if adjusted by more than 5 PSI");
        Label flLabel  = new Label("Front Left");
        Label frLabel  = new Label("Front Right");
        Label rlLabel = new Label("Rear left");
        Label rrLabel  = new Label("Rear Right");
        Label s10Label = new Label("SECTION 10. COUPLING DEVICES");
        Label s11Label = new Label("SECTION 11. ROAD TEST");
        Label wlLabel = new Label("Warning Lights(tell-tales)");
        Label ABSLabel = new Label("ABS");
        Label TPMSLabel = new Label("TPMS");
        Label checkEngineLabel = new Label("Check Engine");
        Label airBagsLabel  = new Label("Air bags(SRS)");
        Label electronicStabilityControlLabel = new Label("Electronic Stability Control");
        Label otherLightsLabel = new Label("Other Lights");
        Label fuelLevelLabel = new Label("Fuel Level");

        // Add the CheckBoxes for inspections
        ToggleGroup s1TGroup = new ToggleGroup();
        RadioButton[] RBs1Array = {new RadioButton(), new RadioButton(), new RadioButton(), new RadioButton()};
        for(int i = 0; i < 4; i++){RBs1Array[i].setToggleGroup(s1TGroup);}

        ToggleGroup s2TGroup = new ToggleGroup();
        RadioButton[] RBs2Array = {new RadioButton(), new RadioButton(), new RadioButton(), new RadioButton()};
        for(int i = 0; i < 4; i++){RBs2Array[i].setToggleGroup(s2TGroup);}

        ToggleGroup s3TGroup = new ToggleGroup();
        RadioButton[] RBs3Array = {new RadioButton(), new RadioButton(), new RadioButton(), new RadioButton()};
        for(int i = 0; i < 4; i++){RBs3Array[i].setToggleGroup(s3TGroup);}

        ToggleGroup lfpTGroup = new ToggleGroup();
        RadioButton[] RBlfpArray = {new RadioButton(), new RadioButton(), new RadioButton(), new RadioButton()};
        for(int i = 0; i < 4; i++){RBlfpArray[i].setToggleGroup(lfpTGroup); }

        ToggleGroup rfpTGroup = new ToggleGroup();
        RadioButton[] RBrfpArray = {new RadioButton(), new RadioButton(), new RadioButton(), new RadioButton()};
        for(int i = 0; i < 4; i++){ RBrfpArray[i].setToggleGroup(rfpTGroup); }

        ToggleGroup lrpTGroup = new ToggleGroup();
        RadioButton[] RBlrpArray = { new RadioButton(), new RadioButton(), new RadioButton(), new RadioButton()};
        for(int i = 0; i < 4; i++){ RBlrpArray[i].setToggleGroup(lrpTGroup);}

        ToggleGroup rrpTGroup = new ToggleGroup();
        RadioButton[] RBrrpArray = { new RadioButton(), new RadioButton(), new RadioButton(), new RadioButton()};
        for(int i = 0; i < 4; i++){ RBrrpArray[i].setToggleGroup(rrpTGroup);}

        ToggleGroup frdTGroup = new ToggleGroup();
        RadioButton[] RBfrdArray = { new RadioButton(), new RadioButton(), new RadioButton(), new RadioButton()};
        for(int i = 0; i < 4; i++){ RBfrdArray[i].setToggleGroup(frdTGroup);}

        ToggleGroup rrdTGroup = new ToggleGroup();
        RadioButton[] RBrrdArray = {new RadioButton(), new RadioButton(), new RadioButton(), new RadioButton()};
        for(int i = 0; i < 4; i++){RBrrdArray[i].setToggleGroup(rrdTGroup);}

        ToggleGroup fbsTGroup = new ToggleGroup();
        RadioButton[] RBfbsArray = {new RadioButton(), new RadioButton(), new RadioButton(), new RadioButton()};
        for(int i = 0; i < 4; i++){RBfbsArray[i].setToggleGroup(fbsTGroup);}

        ToggleGroup rbsTGroup = new ToggleGroup();
        RadioButton[] RBrbsArray = {new RadioButton(), new RadioButton(), new RadioButton(), new RadioButton()};
        for(int i = 0; i < 4; i++){RBrbsArray[i].setToggleGroup(rbsTGroup);}

        ToggleGroup s4TGroup = new ToggleGroup();
        RadioButton[] RBs4Array = {new RadioButton(), new RadioButton(), new RadioButton(), new RadioButton()};
        for(int i = 0; i < 4; i++){RBs4Array[i].setToggleGroup(s4TGroup);}

        ToggleGroup s5TGroup = new ToggleGroup();
        RadioButton[] RBs5Array = {new RadioButton(), new RadioButton(), new RadioButton(), new RadioButton()};
        for(int i = 0; i < 4; i++){RBs5Array[i].setToggleGroup(s5TGroup);}

        ToggleGroup s6TGroup = new ToggleGroup();
        RadioButton[] RBs6Array = {new RadioButton(), new RadioButton(), new RadioButton(), new RadioButton()};
        for(int i = 0; i < 4; i++){RBs6Array[i].setToggleGroup(s6TGroup);}

        ToggleGroup s7TGroup = new ToggleGroup();
        RadioButton[] RBs7Array = {new RadioButton(), new RadioButton(), new RadioButton(), new RadioButton()};
        for(int i = 0; i < 4; i++){RBs7Array[i].setToggleGroup(s7TGroup);}

        ToggleGroup s8TGroup = new ToggleGroup();
        RadioButton[] RBs8Array = {new RadioButton(), new RadioButton(), new RadioButton(), new RadioButton()};
        for(int i = 0; i < 4; i++){RBs8Array[i].setToggleGroup(s8TGroup);}

        ToggleGroup wtTGroup = new ToggleGroup();
        RadioButton[] RBwtArray = {new RadioButton(), new RadioButton(), new RadioButton(), new RadioButton()};
        for(int i = 0; i < 4; i++){RBwtArray[i].setToggleGroup(wtTGroup);}

        ToggleGroup s9TGroup = new ToggleGroup();
        RadioButton[] RBs9Array = {new RadioButton(), new RadioButton(), new RadioButton(), new RadioButton()};
        for(int i = 0; i < 4; i++){RBs9Array[i].setToggleGroup(s9TGroup);}

        ToggleGroup ftdTGroup = new ToggleGroup();
        RadioButton[] RBftdArray = {new RadioButton(), new RadioButton(), new RadioButton(), new RadioButton()};
        for(int i = 0; i < 4; i++){RBftdArray[i].setToggleGroup(ftdTGroup);}

        ToggleGroup rtdTGroup = new ToggleGroup();
        RadioButton[] RBrtdArray = {new RadioButton(), new RadioButton(), new RadioButton(), new RadioButton()};
        for(int i = 0; i < 4; i++){RBrtdArray[i].setToggleGroup(rtdTGroup);}

        ToggleGroup s10TGroup = new ToggleGroup();
        RadioButton[] RBs10Array = {new RadioButton(), new RadioButton(), new RadioButton(), new RadioButton()};
        for(int i = 0; i < 4; i++){RBs10Array[i].setToggleGroup(s10TGroup);}

        ToggleGroup s11TGroup = new ToggleGroup();
        RadioButton[] RBs11Array = {new RadioButton(), new RadioButton(), new RadioButton(), new RadioButton()};
        for(int i = 0; i < 4; i++){RBs11Array[i].setToggleGroup(s11TGroup);}

        // Add the assorted choice options for Column 1
        ChoiceBox inspectionResultChoiceBox = new ChoiceBox(FXCollections.observableArrayList("Fail", "Pass"));

        // Add the TextFields for the form
        TextArea s1Comment = new TextArea();
        s1Comment.setPrefRowCount(1);
        s1Comment.setPrefColumnCount(13);
        s1Comment.setWrapText(true);
        TextArea s2Comment = new TextArea();
        s2Comment.setPrefRowCount(1);
        s2Comment.setPrefColumnCount(13);
        s2Comment.setWrapText(true);
        TextArea s3Comment = new TextArea();
        s3Comment.setPrefRowCount(1);
        s3Comment.setPrefColumnCount(13);
        s3Comment.setWrapText(true);
        TextArea lfpComment = new TextArea();
        lfpComment.setPrefRowCount(1);
        lfpComment.setPrefColumnCount(13);
        lfpComment.setWrapText(true);
        TextArea rfpComment = new TextArea();
        rfpComment.setPrefRowCount(1);
        rfpComment.setPrefColumnCount(13);
        rfpComment.setWrapText(true);
        TextArea lrpComment = new TextArea();
        lrpComment.setPrefRowCount(1);
        lrpComment.setPrefColumnCount(13);
        lrpComment.setWrapText(true);
        TextArea rrpComment = new TextArea();
        rrpComment.setPrefRowCount(1);
        rrpComment.setPrefColumnCount(13);
        rrpComment.setWrapText(true);
        TextArea frdComment = new TextArea();
        frdComment.setPrefRowCount(1);
        frdComment.setPrefColumnCount(13);
        frdComment.setWrapText(true);
        TextArea rrdComment = new TextArea();
        rrdComment.setPrefRowCount(1);
        rrdComment.setPrefColumnCount(13);
        rrdComment.setWrapText(true);
        TextArea fbsComment = new TextArea();
        fbsComment.setPrefRowCount(1);
        fbsComment.setPrefColumnCount(13);
        fbsComment.setWrapText(true);
        TextArea rbsComment = new TextArea();
        rbsComment.setPrefRowCount(1);
        rbsComment.setPrefColumnCount(13);
        rbsComment.setWrapText(true);
        TextArea s4Comment = new TextArea();
        s4Comment.setPrefRowCount(1);
        s4Comment.setPrefColumnCount(13);
        s4Comment.setWrapText(true);
        TextArea s5Comment = new TextArea();
        s5Comment.setPrefRowCount(1);
        s5Comment.setPrefColumnCount(13);
        s5Comment.setWrapText(true);
        TextArea s6Comment = new TextArea();
        s6Comment.setPrefRowCount(1);
        s6Comment.setPrefColumnCount(13);
        s6Comment.setWrapText(true);
        TextArea s7Comment = new TextArea();
        s7Comment.setPrefRowCount(1);
        s7Comment.setPrefColumnCount(13);
        s7Comment.setWrapText(true);
        TextArea s8Comment = new TextArea();
        s8Comment.setPrefRowCount(1);
        s8Comment.setPrefColumnCount(13);
        s8Comment.setWrapText(true);
        TextArea wtComment = new TextArea();
        wtComment.setPrefRowCount(1);
        wtComment.setPrefColumnCount(13);
        wtComment.setWrapText(true);
        TextArea s9Comment = new TextArea();
        s9Comment.setPrefRowCount(1);
        s9Comment.setPrefColumnCount(13);
        s9Comment.setWrapText(true);
        TextArea ftdComment = new TextArea();
        ftdComment.setPrefRowCount(1);
        ftdComment.setPrefColumnCount(13);
        ftdComment.setWrapText(true);
        TextArea rtdComment = new TextArea();
        rtdComment.setPrefRowCount(1);
        rtdComment.setPrefColumnCount(13);
        rtdComment.setWrapText(true);
        TextArea tpComment = new TextArea();
        tpComment.setPrefRowCount(1);
        tpComment.setPrefColumnCount(13);
        tpComment.setWrapText(true);
        TextArea flComment = new TextArea();
        flComment.setPrefRowCount(1);
        flComment.setPrefColumnCount(13);
        flComment.setWrapText(true);
        TextArea frComment = new TextArea();
        frComment.setPrefRowCount(1);
        frComment.setPrefColumnCount(13);
        frComment.setWrapText(true);
        TextArea rlComment = new TextArea();
        rlComment.setPrefRowCount(1);
        rlComment.setPrefColumnCount(13);
        rlComment.setWrapText(true);
        TextArea rrComment = new TextArea();
        rrComment.setPrefRowCount(1);
        rrComment.setPrefColumnCount(13);
        rrComment.setWrapText(true);
        TextArea s10Comment = new TextArea();
        s10Comment.setPrefRowCount(1);
        s10Comment.setPrefColumnCount(13);
        s10Comment.setWrapText(true);
        TextArea s11Comment = new TextArea();
        s11Comment.setPrefRowCount(1);
        s11Comment.setPrefColumnCount(13);
        s11Comment.setWrapText(true);


        // Add children to the GridPane.
        gPane.add(OSILabel,0, 0 , 3, 1);
        gPane.add(autoClinicLabel, 3, 0, 3, 1);

        gPane.addRow(1, legendLabel, new Text(), okLabel, repairRequiredLabel, suggestedPreventiveLabel, suggestedPerformanceLabel, commentsLabel);

        gPane.addRow(2, inspectionResultLabel, inspectionResultChoiceBox);

        gPane.addRow(3, s1Label, new Text(), RBs1Array[0], RBs1Array[1], RBs1Array[2], RBs1Array[3], s1Comment);

        gPane.addRow(4, s2Label, new Text(), RBs2Array[0], RBs2Array[1], RBs2Array[2], RBs2Array[3], s2Comment);

        gPane.addRow(5, s3Label, new Text(), RBs3Array[0], RBs3Array[1], RBs3Array[2], RBs3Array[3], s3Comment);


        TextField lfpInnerTF = new TextField();
        Label lfpInnerLabel = new Label("Inner");
        HBox lfpInnerHBox = new HBox(lfpInnerTF, lfpInnerLabel);
        lfpInnerHBox.setAlignment(Pos.CENTER_LEFT);
        TextField lfpOuterTF = new TextField();
        Label lfpOuterLabel = new Label("Outer");
        HBox lfpOuterHBox = new HBox(lfpOuterTF, lfpOuterLabel);
        lfpOuterHBox.setAlignment(Pos.CENTER_LEFT);
        VBox lfpVBox = new VBox(lfpInnerHBox, lfpOuterHBox);
        lfpVBox.setSpacing(2);

        gPane.addRow(6, lfpLabel, lfpVBox, RBlfpArray[0], RBlfpArray[1], RBlfpArray[2], RBlfpArray[3], lfpComment);

        TextField rfpInnerTF = new TextField();
        Label rfpInnerLabel = new Label("Inner");
        HBox rfpInnerHBox = new HBox(rfpInnerTF, rfpInnerLabel);
        rfpInnerHBox.setAlignment(Pos.CENTER_LEFT);
        TextField rfpOuterTF = new TextField();
        Label rfpOuterLabel = new Label("Outer");
        HBox rfpOuterHBox = new HBox(rfpOuterTF, rfpOuterLabel);
        rfpOuterHBox.setAlignment(Pos.CENTER_LEFT);
        VBox rfpVBox = new VBox(rfpInnerHBox, rfpOuterHBox);
        rfpVBox.setSpacing(2);

        gPane.addRow(7, rfpLabel, rfpVBox, RBrfpArray[0], RBrfpArray[1], RBrfpArray[2], RBrfpArray[3], rfpComment);

        CheckBox lrpCB = new CheckBox("- N/A");
        TextField lrpInnerTF = new TextField();
        Label lrpInnerLabel = new Label("Inner");
        HBox lrpInnerHBox = new HBox(lrpInnerTF, lrpInnerLabel);
        lrpInnerHBox.setAlignment(Pos.CENTER_LEFT);
        TextField lrpOuterTF = new TextField();
        Label lrpOuterLabel = new Label("Outer");
        HBox lrpOuterHBox = new HBox(lrpOuterTF, lrpOuterLabel);
        lrpOuterHBox.setAlignment(Pos.CENTER_LEFT);
        VBox lrpVBox = new VBox(lrpCB, lrpInnerHBox, lrpOuterHBox);
        lrpVBox.setSpacing(2);

        gPane.addRow(8, lrpLabel, lrpVBox, RBlrpArray[0], RBlrpArray[1], RBlrpArray[2], RBlrpArray[3], lrpComment);

        CheckBox rrpCB = new CheckBox("- N/A");
        TextField rrpInnerTF = new TextField();
        Label rrpInnerLabel = new Label("Inner");
        HBox rrpInnerHBox = new HBox(rrpInnerTF, rrpInnerLabel);
        rrpInnerHBox.setAlignment(Pos.CENTER_LEFT);
        TextField rrpOuterTF = new TextField();
        Label rrpOuterLabel = new Label("Outer");
        HBox rrpOuterHBox = new HBox(rrpOuterTF, rrpOuterLabel);
        rrpOuterHBox.setAlignment(Pos.CENTER_LEFT);
        VBox rrpVBox = new VBox(rrpCB, rrpInnerHBox, rrpOuterHBox);
        rrpVBox.setSpacing(2);

        gPane.addRow(9,rrpLabel, rrpVBox, RBrrpArray[0], RBrrpArray[1], RBrrpArray[2], RBrrpArray[3], rrpComment);

        TextField frdLeftTF = new TextField();
        Label frdLeftLabel = new Label("Left");
        HBox frdLeftHBox = new HBox(frdLeftTF, frdLeftLabel);
        frdLeftHBox.setAlignment(Pos.CENTER_LEFT);
        TextField frdRightTF = new TextField();
        Label frdRightLabel = new Label("Right");
        HBox frdRightHBox = new HBox(frdRightTF, frdRightLabel);
        frdRightHBox.setAlignment(Pos.CENTER_LEFT);
        VBox frdVBox = new VBox(frdLeftHBox, frdRightHBox);
        frdVBox.setSpacing(2);

        gPane.addRow(10, frdLabel, frdVBox, RBfrdArray[0], RBfrdArray[1], RBfrdArray[2], RBfrdArray[3], frdComment);

        TextField rrdLeftTF = new TextField();
        Label rrdLeftLabel = new Label("Left");
        HBox rrdLeftHBox = new HBox(rrdLeftTF, rrdLeftLabel);
        rrdLeftHBox.setAlignment(Pos.CENTER_LEFT);
        TextField rrdRightTF = new TextField();
        Label rrdRightLabel = new Label("Right");
        HBox rrdRightHBox = new HBox(rrdRightTF, rrdRightLabel);
        rrdRightHBox.setAlignment(Pos.CENTER_LEFT);
        VBox rrdVBox = new VBox(rrdLeftHBox, rrdRightHBox);
        rrdVBox.setSpacing(2);

        gPane.addRow(11,rrdLabel, rrdVBox, RBrrdArray[0], RBrrdArray[1], RBrrdArray[2], RBrrdArray[3], rrdComment);

        CheckBox fbsCB = new CheckBox("- N/A");
        TextField fbsLeftTF = new TextField();
        Label fbsLeftLabel = new Label("Left");
        HBox fbsLeftHBox = new HBox(fbsLeftTF, fbsLeftLabel);
        fbsLeftHBox.setAlignment(Pos.CENTER_LEFT);
        TextField fbsRightTF = new TextField();
        Label fbsRightLabel = new Label("Right");
        HBox fbsRightHBox = new HBox(fbsRightTF, fbsRightLabel);
        fbsRightHBox.setAlignment(Pos.CENTER_LEFT);
        VBox fbsVBox = new VBox(fbsCB, fbsLeftHBox, fbsRightHBox);
        fbsVBox.setSpacing(2);

        gPane.addRow(12, fbsLabel, fbsVBox, RBfbsArray[0], RBfbsArray[1], RBfbsArray[2], RBfbsArray[3], fbsComment);

        CheckBox rbsCB = new CheckBox("- N/A");
        TextField rbsLeftTF = new TextField();
        Label rbsLeftLabel = new Label("Left");
        HBox rbsLeftHBox = new HBox(rbsLeftTF, rbsLeftLabel);
        rbsLeftHBox.setAlignment(Pos.CENTER_LEFT);
        TextField rbsRightTF = new TextField();
        Label rbsRightLabel = new Label("Right");
        HBox rbsRightHBox = new HBox(rbsRightTF, rbsRightLabel);
        rbsRightHBox.setAlignment(Pos.CENTER_LEFT);
        VBox rbsVBox = new VBox(rbsCB, rbsLeftHBox, rbsRightHBox);
        rbsVBox.setSpacing(2);

        gPane.addRow(13, rbsLabel, rbsVBox, RBrbsArray[0], RBrbsArray[1], RBrbsArray[2], RBrbsArray[3], rbsComment);

        gPane.addRow(14, s4Label, new Text(), RBs4Array[0], RBs4Array[1], RBs4Array[2], RBs4Array[3], s4Comment);

        gPane.add(s5Label, 0 , 15, 2, 1);
        gPane.addRow(15, RBs5Array[0], RBs5Array[1], RBs5Array[2], RBs5Array[3], s5Comment);

        gPane.addRow(16, s6label, new Text(), RBs6Array[0], RBs6Array[1], RBs6Array[2], RBs6Array[3], s6Comment);

        gPane.add(s7Label, 0 , 17,2, 1);
        gPane.addRow(17, RBs7Array[0], RBs7Array[1], RBs7Array[2], RBs7Array[3], s7Comment);

        gPane.addRow(18, s8Label, new Text(), RBs8Array[0], RBs8Array[1], RBs8Array[2], RBs8Array[3], s8Comment);

        CheckBox wtCB = new CheckBox("N/A");

        gPane.addRow(19,wtLabel, wtCB, RBwtArray[0], RBwtArray[1], RBwtArray[2], RBwtArray[3], wtComment);

        gPane.add(s9Label, 0 , 20, 2 ,1);
        gPane.addRow(20, RBs9Array[0], RBs9Array[1], RBs9Array[2], RBs9Array[3], s9Comment);

        TextField ftdLeftTF = new TextField();
        Label ftdLeftLabel = new Label("/32nds Left");
        HBox ftdLeftHBox = new HBox(ftdLeftTF, ftdLeftLabel);
        ftdLeftHBox.setAlignment(Pos.CENTER_LEFT);
        TextField ftdRightTF = new TextField();
        Label ftdRightLabel = new Label("/32nds Right");
        HBox ftdRightHBox = new HBox(ftdRightTF, ftdRightLabel);
        ftdRightHBox.setAlignment(Pos.CENTER_LEFT);
        VBox ftdVBox = new VBox(ftdLeftHBox, ftdRightHBox);
        ftdVBox.setSpacing(2);

        gPane.addRow(21, ftdLabel, ftdVBox, RBftdArray[0], RBftdArray[1], RBftdArray[2], RBftdArray[3], ftdComment);

        TextField rtdLeftTF = new TextField();
        Label rtdLeftLabel = new Label("/32nds Left");
        HBox rtdLeftHBox = new HBox(rtdLeftTF, rtdLeftLabel);
        rtdLeftHBox.setAlignment(Pos.CENTER_LEFT);
        TextField rtdRightTF = new TextField();
        Label rtdRightLabel = new Label("/32nds Right");
        HBox rtdRightHBox = new HBox(rtdRightTF, rtdRightLabel);
        rtdRightHBox.setAlignment(Pos.CENTER_LEFT);
        VBox rtdVBox = new VBox(rtdLeftHBox, rtdRightHBox);
        rtdVBox.setSpacing(2);

        gPane.addRow(22, rtdLabel, rtdVBox, RBrtdArray[0], RBrtdArray[1], RBrtdArray[2], RBrtdArray[3], rtdComment);

        gPane.add(tpLabel, 0 ,23, 2, 1);
        gPane.add(tpComment, 6, 23, 1, 1);

        CheckBox flCB = new CheckBox("- N/A");
        TextField flAfterTF = new TextField();
        Label flAfterLabel = new Label("After");
        HBox flAfterHBox = new HBox(flAfterTF, flAfterLabel);
        flAfterHBox.setAlignment(Pos.CENTER_LEFT);
        TextField flBeforeTF = new TextField();
        Label flBeforeLabel = new Label("Before");
        HBox flBeforeHBox = new HBox(flBeforeTF, flBeforeLabel);
        flBeforeHBox.setAlignment(Pos.CENTER_LEFT);
        VBox flVBox = new VBox(flCB, flAfterHBox, flBeforeHBox);
        flVBox.setSpacing(2);

        gPane.addRow(24, flLabel, flVBox);
        gPane.add(flComment, 6, 24, 1,1);

        CheckBox frCB = new CheckBox("- N/A");
        TextField frAfterTF = new TextField();
        Label frAfterLabel = new Label("After");
        HBox frAfterHBox = new HBox(frAfterTF, frAfterLabel);
        frAfterHBox.setAlignment(Pos.CENTER_LEFT);
        TextField frBeforeTF = new TextField();
        Label frBeforeLabel = new Label("Before");
        HBox frBeforeHBox = new HBox(frBeforeTF, frBeforeLabel);
        frBeforeHBox.setAlignment(Pos.CENTER_LEFT);
        VBox frVBox = new VBox(frCB, frAfterHBox, frBeforeHBox);
        frVBox.setSpacing(2);

        gPane.addRow(25, frLabel, frVBox);
        gPane.add(frComment, 6, 25, 1,1);

        CheckBox rlCB = new CheckBox("- N/A");
        TextField rlAfterTF = new TextField();
        Label rlAfterLabel = new Label("After");
        HBox rlAfterHBox = new HBox(rlAfterTF, rlAfterLabel);
        rlAfterHBox.setAlignment(Pos.CENTER_LEFT);
        TextField rlBeforeTF = new TextField();
        Label rlBeforeLabel = new Label("Before");
        HBox rlBeforeHBox = new HBox(rlBeforeTF, rlBeforeLabel);
        rlBeforeHBox.setAlignment(Pos.CENTER_LEFT);
        VBox rlVBox = new VBox(rlCB, rlAfterHBox, rlBeforeHBox);
        rlVBox.setSpacing(2);

        gPane.addRow(26, rlLabel, rlVBox);
        gPane.add(rlComment, 6, 26, 1,1);

        CheckBox rrCB = new CheckBox("- N/A");
        TextField rrAfterTF = new TextField();
        Label rrAfterLabel = new Label("After");
        HBox rrAfterHBox = new HBox(rrAfterTF, rrAfterLabel);
        rrAfterHBox.setAlignment(Pos.CENTER_LEFT);
        TextField rrBeforeTF = new TextField();
        Label rrBeforeLabel = new Label("Before");
        HBox rrBeforeHBox = new HBox(rrBeforeTF, rrBeforeLabel);
        rrBeforeHBox.setAlignment(Pos.CENTER_LEFT);
        VBox rrVBox = new VBox(rlCB, rrAfterHBox, rrBeforeHBox);
        rrVBox.setSpacing(2);

        gPane.addRow(27, rrLabel, rrVBox);
        gPane.add(rrComment, 6, 27, 1,1);

        gPane.add(s10Label, 0 , 28, 2, 1);
        gPane.addRow(28, RBs10Array[0], RBs10Array[1], RBs10Array[2], RBs10Array[3], s10Comment);

        gPane.addRow(29, s11Label, new Text(), RBs11Array[0], RBs11Array[1], RBs11Array[2], RBs11Array[3], s11Comment);

        gPane.addRow(30, wlLabel, new Text());

        gPane.addRow(31, ABSLabel, new Text());

        gPane.addRow(32, TPMSLabel, new Text());

        gPane.addRow(33, checkEngineLabel, new Text());

        gPane.addRow(34, airBagsLabel, new Text());

        gPane.addRow(35, electronicStabilityControlLabel, new Text());

        gPane.addRow(36, otherLightsLabel, new Text());

        gPane.addRow(37, fuelLevelLabel, new Text());

        //*** TESTING ***
        Button bt = new Button("This is a test");
        gPane.add(bt, 0, 40);
        bt.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                /* *** THIS IS IMPORTANT
                 * This is how I will determine which box was clicked upon submission.
                 * 1 = OK
                 * 2 = REPAIR REQUIRED
                 * 3 = SUGGESTED PREVENTIVE
                 * 4 = SUGGESTED PERFORMANCE
                 */
                //TODO Be careful, if a RadioButton is left unchecked, this causes an error.
                //TODO Could wrap all of the checks in if statements, or look into using error reporting.
                //TODO Error reporting could allow for a notice before saving that something was left unfinished.
                System.out.println(s2TGroup.getSelectedToggle().getProperties().get("gridpane-column"));
                System.out.println(s1Comment.getText());
            }
        });

        sPane.setStyle("-fx-padding: 10px;");
        // Create the scene, and show the window
        Scene scene = new Scene(sPane, 1024, 768);
        primaryStage.setTitle("Nick's Auto Clinic - Ontario Safety Inspection Report");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
