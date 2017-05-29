package program;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        // Create the Gridpane for displaying the form itself
        GridPane gPane = new GridPane();

        gPane.setHgap(15);
        gPane.setVgap(10);

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

        // Show the gridlines (this also shows gridlines around the hgap and vgap segments
//        gPane.setGridLinesVisible(true);


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
        Label section1Label = new Label("SECTION 1. POWERTRAIN");
        Label section2Label = new Label("SECTION 2. SUSPENSION");
        Label section3Label = new Label("SECTION 3. BRAKE SYSTEMS");
        Label leftFrontPadsLabel = new Label("Left Front Pads(mm)");
        Label rightFrontPadsLabel = new Label("RIght Front Pads(mm)");
        Label leftRearPadsLabel = new Label("Left Rear Pads(mm)");
        Label rightRearPadsLabel = new Label("Right Rear Pads(mm)");
        Label frontRotorsDrumsLabel = new Label("Front Rotors or Drums(mm)");
        Label rearRotorsDrumsLabel = new Label("Rear Rotors or Drums(mm)");
        Label frontBrakeShoesLabel = new Label("Front Brake Shoes(mm)");
        Label rearBrakeShoesLabel = new Label("Rear Brake Shoes(mm)");
        Label section4Label = new Label("SECTION 4. STEERING");
        Label section5Label = new Label("SECTION 5. INSTRUMENTS AND AUXILIARY EQUIPMENT");
        Label section6label = new Label("SECTION 6. LAMPS");
        Label section7Label  = new Label("SECTION 7. ELECTRICAL SYSTEMS");
        Label section8Label  = new Label("SECTION 8. BODY");
        Label windowTintLabel  = new Label("Window Tint");
        Label section9Label = new Label("SECTION 9. TIRE AND WHEEL");
        Label frontTreadDepthLabel  = new Label("Front Tread Depth");
        Label rearTreadDepthLabel  = new Label("Rear Tread Depth");
        Label tirePressureLabel = new Label("Tire Pressure(PSI) - Only req'd if adjusted by more than 5 PSI");
        Label frontLeftLabel  = new Label("Front Left");
        Label frontRightLabel  = new Label("Front Right");
        Label rearLeftLabel = new Label("Rear left");
        Label rearRightLabel  = new Label("Rear Right");
        Label section10Label = new Label("SECTION 10. COUPLING DEVICES");
        Label section11Label = new Label("SECTION 11. ROAD TEST");
        Label warningLightsLabel = new Label("Warning Lights(tell-tales)");
        Label ABSLabel = new Label("ABS");
        Label TPMSLabel = new Label("TPMS");
        Label checkEngineLabel = new Label("Check Engine");
        Label airBagsLabel  = new Label("Air bags(SRS)");
        Label electronicStabilityControlLabel = new Label("Electronic Stability Control");
        Label otherLightsLabel = new Label("Other Lights");
        Label fuelLevelLabel = new Label("Fuel Level");

        // Add other features such as checkboxes and comment boxes
        ChoiceBox inspectionResultChoiceBox = new ChoiceBox(FXCollections.observableArrayList("Fail", "Pass"));

        ToggleGroup section1TGroup = new ToggleGroup();
        RadioButton[] RBsection1Array = {new RadioButton(), new RadioButton(), new RadioButton(), new RadioButton()};
        for(int i = 0; i < 4; i++){RBsection1Array[i].setToggleGroup(section1TGroup);}

        ToggleGroup section2TGroup = new ToggleGroup();
        RadioButton[] RBsection2Array = {new RadioButton(), new RadioButton(), new RadioButton(), new RadioButton()};
        for(int i = 0; i < 4; i++){RBsection2Array[i].setToggleGroup(section2TGroup);}

        ToggleGroup section3TGroup = new ToggleGroup();
        RadioButton[] RBsection3Array = {new RadioButton(), new RadioButton(), new RadioButton(), new RadioButton()};
        for(int i = 0; i < 4; i++){RBsection3Array[i].setToggleGroup(section3TGroup);}

        ToggleGroup leftFrontPadsTGroup = new ToggleGroup();
        RadioButton[] RBleftFrontPadsArray = {new RadioButton(), new RadioButton(), new RadioButton(), new RadioButton()};
        for(int i = 0; i < 4; i++){RBleftFrontPadsArray[i].setToggleGroup(leftFrontPadsTGroup); }

        ToggleGroup rightFrontPadsTGroup = new ToggleGroup();
        RadioButton[] RBrightFrontPadsArray = {new RadioButton(), new RadioButton(), new RadioButton(), new RadioButton()};
        for(int i = 0; i < 4; i++){ RBrightFrontPadsArray[i].setToggleGroup(rightFrontPadsTGroup); }

        ToggleGroup leftRearPadsTGroup = new ToggleGroup();
        RadioButton[] RBleftRearPadsArray = { new RadioButton(), new RadioButton(), new RadioButton(), new RadioButton()};
        for(int i = 0; i < 4; i++){ RBleftRearPadsArray[i].setToggleGroup(leftRearPadsTGroup);}

        ToggleGroup rightRearPadsTGroup = new ToggleGroup();
        RadioButton[] RBrightRearPadsArray = { new RadioButton(), new RadioButton(), new RadioButton(), new RadioButton()};
        for(int i = 0; i < 4; i++){ RBrightRearPadsArray[i].setToggleGroup(rightRearPadsTGroup);}

        ToggleGroup frontRotorsDrumsTGroup = new ToggleGroup();
        RadioButton[] RBfrontRotorsDrumsArray = { new RadioButton(), new RadioButton(), new RadioButton(), new RadioButton()};
        for(int i = 0; i < 4; i++){ RBfrontRotorsDrumsArray[i].setToggleGroup(frontRotorsDrumsTGroup);}

        ToggleGroup rearRotorsDrumsTGroup = new ToggleGroup();
        RadioButton[] RBrearRotorsDrumsArray = {new RadioButton(), new RadioButton(), new RadioButton(), new RadioButton()};
        for(int i = 0; i < 4; i++){RBrearRotorsDrumsArray[i].setToggleGroup(rearRotorsDrumsTGroup);}

        ToggleGroup frontBrakeShoesTGroup = new ToggleGroup();
        RadioButton[] RBfrontBrakeShoesArray = {new RadioButton(), new RadioButton(), new RadioButton(), new RadioButton()};
        for(int i = 0; i < 4; i++){RBfrontBrakeShoesArray[i].setToggleGroup(frontBrakeShoesTGroup);}

        ToggleGroup rearBrakeShoesTGroup = new ToggleGroup();
        RadioButton[] RBrearBrakeShoesArray = {new RadioButton(), new RadioButton(), new RadioButton(), new RadioButton()};
        for(int i = 0; i < 4; i++){RBrearBrakeShoesArray[i].setToggleGroup(rearBrakeShoesTGroup);}

        ToggleGroup section4TGroup = new ToggleGroup();
        RadioButton[] RBsection4Array = {new RadioButton(), new RadioButton(), new RadioButton(), new RadioButton()};
        for(int i = 0; i < 4; i++){RBsection4Array[i].setToggleGroup(section4TGroup);}

        ToggleGroup section5TGroup = new ToggleGroup();
        RadioButton[] RBsection5Array = {new RadioButton(), new RadioButton(), new RadioButton(), new RadioButton()};
        for(int i = 0; i < 4; i++){RBsection5Array[i].setToggleGroup(section5TGroup);}

        ToggleGroup section6TGroup = new ToggleGroup();
        RadioButton[] RBsection6Array = {new RadioButton(), new RadioButton(), new RadioButton(), new RadioButton()};
        for(int i = 0; i < 4; i++){RBsection6Array[i].setToggleGroup(section6TGroup);}

        ToggleGroup section7TGroup = new ToggleGroup();
        RadioButton[] RBsection7Array = {new RadioButton(), new RadioButton(), new RadioButton(), new RadioButton()};
        for(int i = 0; i < 4; i++){RBsection7Array[i].setToggleGroup(section7TGroup);}

        ToggleGroup section8TGroup = new ToggleGroup();
        RadioButton[] RBsection8Array = {new RadioButton(), new RadioButton(), new RadioButton(), new RadioButton()};
        for(int i = 0; i < 4; i++){RBsection8Array[i].setToggleGroup(section8TGroup);}

        ToggleGroup windowTintTGroup = new ToggleGroup();
        RadioButton[] RBwindowTintArray = {new RadioButton(), new RadioButton(), new RadioButton(), new RadioButton()};
        for(int i = 0; i < 4; i++){RBwindowTintArray[i].setToggleGroup(windowTintTGroup);}

        ToggleGroup section9TGroup = new ToggleGroup();
        RadioButton[] RBsection9Array = {new RadioButton(), new RadioButton(), new RadioButton(), new RadioButton()};
        for(int i = 0; i < 4; i++){RBsection9Array[i].setToggleGroup(section9TGroup);}

        ToggleGroup frontTreadDepthTGroup = new ToggleGroup();
        RadioButton[] RBfrontTreadDepthArray = {new RadioButton(), new RadioButton(), new RadioButton(), new RadioButton()};
        for(int i = 0; i < 4; i++){RBfrontTreadDepthArray[i].setToggleGroup(frontTreadDepthTGroup);}

        ToggleGroup rearTreadDepthTGroup = new ToggleGroup();
        RadioButton[] RBrearTreadDepthArray = {new RadioButton(), new RadioButton(), new RadioButton(), new RadioButton()};
        for(int i = 0; i < 4; i++){RBrearTreadDepthArray[i].setToggleGroup(rearTreadDepthTGroup);}

        ToggleGroup tirePressureTGroup = new ToggleGroup();
        RadioButton[] RBtirePressureArray = {new RadioButton(), new RadioButton(), new RadioButton(), new RadioButton()};
        for(int i = 0; i < 4; i++){RBtirePressureArray[i].setToggleGroup(tirePressureTGroup);}

        ToggleGroup section10TGroup = new ToggleGroup();
        RadioButton[] RBsection10Array = {new RadioButton(), new RadioButton(), new RadioButton(), new RadioButton()};
        for(int i = 0; i < 4; i++){RBsection10Array[i].setToggleGroup(section10TGroup);}

        ToggleGroup section11TGroup = new ToggleGroup();
        RadioButton[] RBsection11Array = {new RadioButton(), new RadioButton(), new RadioButton(), new RadioButton()};
        for(int i = 0; i < 4; i++){RBsection11Array[i].setToggleGroup(section11TGroup);}

        // Add children to the GridPane.
        gPane.add(OSILabel,0, 0 , 3, 1);
        gPane.add(autoClinicLabel, 3, 0, 3, 1);

        gPane.add(legendLabel, 0,1);
        gPane.add(okLabel, 2,1);
        gPane.add(repairRequiredLabel, 3,1);
        gPane.add(suggestedPreventiveLabel, 4,1);
        gPane.add(suggestedPerformanceLabel, 5,1);
        gPane.add(commentsLabel, 6,1);

        gPane.add(inspectionResultLabel, 0, 2);
        gPane.add(inspectionResultChoiceBox, 1, 2);



        // *** THIS IS THE BETTER WAY THAN ONE LINE AT A TIME
        // TODO
        gPane.addRow(3, section1Label, new Text(), RBsection1Array[0], RBsection1Array[1], RBsection1Array[2], RBsection1Array[3]);

        gPane.addRow(4, section2Label, new Text(), RBsection2Array[0], RBsection2Array[1], RBsection2Array[2], RBsection2Array[3]);

        gPane.addRow(5, section3Label, new Text(), RBsection3Array[0], RBsection3Array[1], RBsection3Array[2], RBsection3Array[3]);

        gPane.addRow(6, leftFrontPadsLabel, new Text(), RBleftFrontPadsArray[0], RBleftFrontPadsArray[1], RBleftFrontPadsArray[2], RBleftFrontPadsArray[3]);

        gPane.addRow(7, rightFrontPadsLabel, new Text(), RBrightFrontPadsArray[0], RBrightFrontPadsArray[1], RBrightFrontPadsArray[2], RBrightFrontPadsArray[3]);

        gPane.addRow(8, leftRearPadsLabel, new Text(), RBleftRearPadsArray[0], RBleftRearPadsArray[1], RBleftRearPadsArray[2], RBleftRearPadsArray[3]);

        gPane.addRow(9,rightRearPadsLabel, new Text(), RBrightRearPadsArray[0], RBrightRearPadsArray[1], RBrightRearPadsArray[2], RBrightRearPadsArray[3]);

        gPane.addRow(10, frontRotorsDrumsLabel, new Text(), RBfrontRotorsDrumsArray[0], RBfrontRotorsDrumsArray[1], RBfrontRotorsDrumsArray[2], RBfrontRotorsDrumsArray[3]);

        gPane.addRow(11,rearRotorsDrumsLabel, new Text(), RBrearRotorsDrumsArray[0], RBrearRotorsDrumsArray[1], RBrearRotorsDrumsArray[2], RBrearRotorsDrumsArray[3]);

        gPane.addRow(12, frontBrakeShoesLabel, new Text(), RBfrontBrakeShoesArray[0], RBfrontBrakeShoesArray[1], RBfrontBrakeShoesArray[2], RBfrontBrakeShoesArray[3]);

        gPane.addRow(13, rearBrakeShoesLabel, new Text(), RBrearBrakeShoesArray[0], RBrearBrakeShoesArray[1], RBrearBrakeShoesArray[2], RBrearBrakeShoesArray[3]);

        gPane.addRow(14, section4Label, new Text(), RBsection4Array[0], RBsection4Array[1], RBsection4Array[2], RBsection4Array[3]);

        gPane.addRow(section5Label, 0 , 15, 2, 1);

        gPane.addRow(section6label, 0 , 16);

        gPane.addRow(section7Label, 0 , 17,2, 1);

        gPane.addRow(section8Label, 0 , 18);

        gPane.addRow(windowTintLabel, 0 ,19);

        gPane.addRow(section9Label, 0 , 20, 2 ,1);

        gPane.addRow(frontTreadDepthLabel, 0 ,21);

        gPane.addRow(rearTreadDepthLabel, 0 ,22);

        gPane.addRow(tirePressureLabel, 0 ,23, 2, 1);

        gPane.addRow(frontLeftLabel, 0 ,24);

        gPane.addRow(frontRightLabel, 0, 25);

        gPane.addRow(rearLeftLabel, 0 , 26);

        gPane.addRow(rearRightLabel, 0 , 27);

        gPane.addRow(section10Label, 0 , 28, 2, 1);

        gPane.addRow(section11Label, 0 , 29);

        gPane.addRow(warningLightsLabel, 0 , 30);

        gPane.addRow(ABSLabel, 0, 31);

        gPane.addRow(TPMSLabel, 0, 32);

        gPane.addRow(checkEngineLabel, 0 , 33);

        gPane.addRow(airBagsLabel, 0 , 34);

        gPane.addRow(electronicStabilityControlLabel, 0 , 35);

        gPane.addRow(otherLightsLabel, 0 , 38);

        gPane.addRow(fuelLevelLabel, 0 , 39);

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
                System.out.println(section2TGroup.getSelectedToggle().getProperties().get(new String("gridpane-column")));
            }
        });

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
