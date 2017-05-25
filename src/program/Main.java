package program;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
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
        RadioButton section1okRB = new RadioButton();
        RadioButton section1rrRB = new RadioButton();
        RadioButton section1sprRB = new RadioButton();
        RadioButton section1speRB = new RadioButton();

        section1okRB.setToggleGroup(section1TGroup);
        section1rrRB.setToggleGroup(section1TGroup);
        section1sprRB.setToggleGroup(section1TGroup);
        section1speRB.setToggleGroup(section1TGroup);

        ToggleGroup section2TGroup = new ToggleGroup();
        RadioButton section2okRB = new RadioButton();
        RadioButton section2rrRB = new RadioButton();
        RadioButton section2sprRB = new RadioButton();
        RadioButton section2speRB = new RadioButton();

        section2okRB.setToggleGroup(section2TGroup);
        section2rrRB.setToggleGroup(section2TGroup);
        section2sprRB.setToggleGroup(section2TGroup);
        section2speRB.setToggleGroup(section2TGroup);

        ToggleGroup section3TGroup = new ToggleGroup();
        RadioButton section3okRB = new RadioButton();
        RadioButton section3rrRB = new RadioButton();
        RadioButton section3sprRB = new RadioButton();
        RadioButton section3speRB = new RadioButton();

        section3okRB.setToggleGroup(section3TGroup);
        section3rrRB.setToggleGroup(section3TGroup);
        section3sprRB.setToggleGroup(section3TGroup);
        section3speRB.setToggleGroup(section3TGroup);

        ToggleGroup leftFrontPadsTGroup = new ToggleGroup();
        RadioButton leftFrontPadsokRB = new RadioButton();
        RadioButton leftFrontPadsrrRB = new RadioButton();
        RadioButton leftFrontPadssprRB = new RadioButton();
        RadioButton leftFrontPadsspeRB = new RadioButton();

        leftFrontPadsokRB.setToggleGroup(leftFrontPadsTGroup);
        leftFrontPadsrrRB.setToggleGroup(leftFrontPadsTGroup);
        leftFrontPadssprRB.setToggleGroup(leftFrontPadsTGroup);
        leftFrontPadsspeRB.setToggleGroup(leftFrontPadsTGroup);

        ToggleGroup rightFrontPadsTGroup = new ToggleGroup();
        RadioButton rightFrontPadsokRB = new RadioButton();
        RadioButton rightFrontPadsrrRB = new RadioButton();
        RadioButton rightFrontPadssprRB = new RadioButton();
        RadioButton rightFrontPadsspeRB = new RadioButton();

        rightFrontPadsokRB.setToggleGroup(rightFrontPadsTGroup);
        rightFrontPadsrrRB.setToggleGroup(rightFrontPadsTGroup);
        rightFrontPadssprRB.setToggleGroup(rightFrontPadsTGroup);
        rightFrontPadsspeRB.setToggleGroup(rightFrontPadsTGroup);

        ToggleGroup leftRearPadsTGroup = new ToggleGroup();
        RadioButton leftRearPadsokRB = new RadioButton();
        RadioButton leftRearPadsrrRB = new RadioButton();
        RadioButton leftRearPadssprRB = new RadioButton();
        RadioButton leftRearPadsspeRB = new RadioButton();

        leftRearPadsokRB.setToggleGroup(leftRearPadsTGroup);
        leftRearPadsrrRB.setToggleGroup(leftRearPadsTGroup);
        leftRearPadssprRB.setToggleGroup(leftRearPadsTGroup);
        leftRearPadsspeRB.setToggleGroup(leftRearPadsTGroup);

        ToggleGroup rightRearPadsTGroup = new ToggleGroup();
        RadioButton rightRearPadsokRB = new RadioButton();
        RadioButton rightRearPadsrrRB = new RadioButton();
        RadioButton rightRearPadssprRB = new RadioButton();
        RadioButton rightRearPadsspeRB = new RadioButton();

        rightRearPadsokRB.setToggleGroup(rightRearPadsTGroup);
        rightRearPadsrrRB.setToggleGroup(rightRearPadsTGroup);
        rightRearPadssprRB.setToggleGroup(rightRearPadsTGroup);
        rightRearPadsspeRB.setToggleGroup(rightRearPadsTGroup);

        ToggleGroup frontRotorsDrumsTGroup = new ToggleGroup();
        RadioButton frontRotorsDrumsokRB = new RadioButton();
        RadioButton frontRotorsDrumsrrRB = new RadioButton();
        RadioButton frontRotorsDrumssprRB = new RadioButton();
        RadioButton frontRotorsDrumsspeRB = new RadioButton();

        frontRotorsDrumsokRB.setToggleGroup(frontRotorsDrumsTGroup);
        frontRotorsDrumsrrRB.setToggleGroup(frontRotorsDrumsTGroup);
        frontRotorsDrumssprRB.setToggleGroup(frontRotorsDrumsTGroup);
        frontRotorsDrumsspeRB.setToggleGroup(frontRotorsDrumsTGroup);

        ToggleGroup rearRotorsDrumsTGroup = new ToggleGroup();
        RadioButton rearRotorsDrumsokRB = new RadioButton();
        RadioButton rearRotorsDrumsrrRB = new RadioButton();
        RadioButton rearRotorsDrumssprRB = new RadioButton();
        RadioButton rearRotorsDrumsspeRB = new RadioButton();

        rearRotorsDrumsokRB.setToggleGroup(rearRotorsDrumsTGroup);
        rearRotorsDrumsrrRB.setToggleGroup(rearRotorsDrumsTGroup);
        rearRotorsDrumssprRB.setToggleGroup(rearRotorsDrumsTGroup);
        rearRotorsDrumsspeRB.setToggleGroup(rearRotorsDrumsTGroup);

        ToggleGroup frontBrakeShoesTGroup = new ToggleGroup();
        RadioButton frontBrakeShoesokRB = new RadioButton();
        RadioButton frontBrakeShoesrrRB = new RadioButton();
        RadioButton frontBrakeShoessprRB = new RadioButton();
        RadioButton frontBrakeShoesspeRB = new RadioButton();

        frontBrakeShoesokRB.setToggleGroup(frontBrakeShoesTGroup);
        frontBrakeShoesrrRB.setToggleGroup(frontBrakeShoesTGroup);
        frontBrakeShoessprRB.setToggleGroup(frontBrakeShoesTGroup);
        frontBrakeShoesspeRB.setToggleGroup(frontBrakeShoesTGroup);

        ToggleGroup rearBrakeShoesTGroup = new ToggleGroup();
        RadioButton rearBrakeShoesokRB = new RadioButton();
        RadioButton rearBrakeShoesrrRB = new RadioButton();
        RadioButton rearBrakeShoessprRB = new RadioButton();
        RadioButton rearBrakeShoesspeRB = new RadioButton();

        rearBrakeShoesokRB.setToggleGroup(rearBrakeShoesTGroup);
        rearBrakeShoesrrRB.setToggleGroup(rearBrakeShoesTGroup);
        rearBrakeShoessprRB.setToggleGroup(rearBrakeShoesTGroup);
        rearBrakeShoesspeRB.setToggleGroup(rearBrakeShoesTGroup);

        ToggleGroup section4TGroup = new ToggleGroup();
        RadioButton section4okRB = new RadioButton();
        RadioButton section4rrRB = new RadioButton();
        RadioButton section4sprRB = new RadioButton();
        RadioButton section4speRB = new RadioButton();

        section4okRB.setToggleGroup(section4TGroup);
        section4rrRB.setToggleGroup(section4TGroup);
        section4sprRB.setToggleGroup(section4TGroup);
        section4speRB.setToggleGroup(section4TGroup);

        ToggleGroup section5TGroup = new ToggleGroup();
        RadioButton section5okRB = new RadioButton();
        RadioButton section5rrRB = new RadioButton();
        RadioButton section5sprRB = new RadioButton();
        RadioButton section5speRB = new RadioButton();

        section5okRB.setToggleGroup(section5TGroup);
        section5rrRB.setToggleGroup(section5TGroup);
        section5sprRB.setToggleGroup(section5TGroup);
        section5speRB.setToggleGroup(section5TGroup);

        ToggleGroup section6TGroup = new ToggleGroup();
        RadioButton section6okRB = new RadioButton();
        RadioButton section6rrRB = new RadioButton();
        RadioButton section6sprRB = new RadioButton();
        RadioButton section6speRB = new RadioButton();

        section6okRB.setToggleGroup(section6TGroup);
        section6rrRB.setToggleGroup(section6TGroup);
        section6sprRB.setToggleGroup(section6TGroup);
        section6speRB.setToggleGroup(section6TGroup);

//        ToggleGroup TGroup = new ToggleGroup();
//        RadioButton okRB = new RadioButton();
//        RadioButton rrRB = new RadioButton();
//        RadioButton sprRB = new RadioButton();
//        RadioButton speRB = new RadioButton();
//
//        okRB.setToggleGroup(TGroup);
//        rrRB.setToggleGroup(TGroup);
//        sprRB.setToggleGroup(TGroup);
//        speRB.setToggleGroup(TGroup);
//
//        ToggleGroup TGroup = new ToggleGroup();
//        RadioButton okRB = new RadioButton();
//        RadioButton rrRB = new RadioButton();
//        RadioButton sprRB = new RadioButton();
//        RadioButton speRB = new RadioButton();
//
//        okRB.setToggleGroup(TGroup);
//        rrRB.setToggleGroup(TGroup);
//        sprRB.setToggleGroup(TGroup);
//        speRB.setToggleGroup(TGroup);
//
//        ToggleGroup TGroup = new ToggleGroup();
//        RadioButton okRB = new RadioButton();
//        RadioButton rrRB = new RadioButton();
//        RadioButton sprRB = new RadioButton();
//        RadioButton speRB = new RadioButton();
//
//        okRB.setToggleGroup(TGroup);
//        rrRB.setToggleGroup(TGroup);
//        sprRB.setToggleGroup(TGroup);
//        speRB.setToggleGroup(TGroup);
//
//        ToggleGroup TGroup = new ToggleGroup();
//        RadioButton okRB = new RadioButton();
//        RadioButton rrRB = new RadioButton();
//        RadioButton sprRB = new RadioButton();
//        RadioButton speRB = new RadioButton();
//
//        okRB.setToggleGroup(TGroup);
//        rrRB.setToggleGroup(TGroup);
//        sprRB.setToggleGroup(TGroup);
//        speRB.setToggleGroup(TGroup);
//
//        ToggleGroup TGroup = new ToggleGroup();
//        RadioButton okRB = new RadioButton();
//        RadioButton rrRB = new RadioButton();
//        RadioButton sprRB = new RadioButton();
//        RadioButton speRB = new RadioButton();
//
//        okRB.setToggleGroup(TGroup);
//        rrRB.setToggleGroup(TGroup);
//        sprRB.setToggleGroup(TGroup);
//        speRB.setToggleGroup(TGroup);
//
//        ToggleGroup TGroup = new ToggleGroup();
//        RadioButton okRB = new RadioButton();
//        RadioButton rrRB = new RadioButton();
//        RadioButton sprRB = new RadioButton();
//        RadioButton speRB = new RadioButton();
//
//        okRB.setToggleGroup(TGroup);
//        rrRB.setToggleGroup(TGroup);
//        sprRB.setToggleGroup(TGroup);
//        speRB.setToggleGroup(TGroup);
//
//        ToggleGroup TGroup = new ToggleGroup();
//        RadioButton okRB = new RadioButton();
//        RadioButton rrRB = new RadioButton();
//        RadioButton sprRB = new RadioButton();
//        RadioButton speRB = new RadioButton();
//
//        okRB.setToggleGroup(TGroup);
//        rrRB.setToggleGroup(TGroup);
//        sprRB.setToggleGroup(TGroup);
//        speRB.setToggleGroup(TGroup);
//
//        ToggleGroup TGroup = new ToggleGroup();
//        RadioButton okRB = new RadioButton();
//        RadioButton rrRB = new RadioButton();
//        RadioButton sprRB = new RadioButton();
//        RadioButton speRB = new RadioButton();
//
//        okRB.setToggleGroup(TGroup);
//        rrRB.setToggleGroup(TGroup);
//        sprRB.setToggleGroup(TGroup);
//        speRB.setToggleGroup(TGroup);
//
//        ToggleGroup TGroup = new ToggleGroup();
//        RadioButton okRB = new RadioButton();
//        RadioButton rrRB = new RadioButton();
//        RadioButton sprRB = new RadioButton();
//        RadioButton speRB = new RadioButton();
//
//        okRB.setToggleGroup(TGroup);
//        rrRB.setToggleGroup(TGroup);
//        sprRB.setToggleGroup(TGroup);
//        speRB.setToggleGroup(TGroup);
//
//        ToggleGroup TGroup = new ToggleGroup();
//        RadioButton okRB = new RadioButton();
//        RadioButton rrRB = new RadioButton();
//        RadioButton sprRB = new RadioButton();
//        RadioButton speRB = new RadioButton();
//
//        okRB.setToggleGroup(TGroup);
//        rrRB.setToggleGroup(TGroup);
//        sprRB.setToggleGroup(TGroup);
//        speRB.setToggleGroup(TGroup);
//
//        ToggleGroup TGroup = new ToggleGroup();
//        RadioButton okRB = new RadioButton();
//        RadioButton rrRB = new RadioButton();
//        RadioButton sprRB = new RadioButton();
//        RadioButton speRB = new RadioButton();
//
//        okRB.setToggleGroup(TGroup);
//        rrRB.setToggleGroup(TGroup);
//        sprRB.setToggleGroup(TGroup);
//        speRB.setToggleGroup(TGroup);
//
//        ToggleGroup TGroup = new ToggleGroup();
//        RadioButton okRB = new RadioButton();
//        RadioButton rrRB = new RadioButton();
//        RadioButton sprRB = new RadioButton();
//        RadioButton speRB = new RadioButton();
//
//        okRB.setToggleGroup(TGroup);
//        rrRB.setToggleGroup(TGroup);
//        sprRB.setToggleGroup(TGroup);
//        speRB.setToggleGroup(TGroup);
//
//        ToggleGroup TGroup = new ToggleGroup();
//        RadioButton okRB = new RadioButton();
//        RadioButton rrRB = new RadioButton();
//        RadioButton sprRB = new RadioButton();
//        RadioButton speRB = new RadioButton();
//
//        okRB.setToggleGroup(TGroup);
//        rrRB.setToggleGroup(TGroup);
//        sprRB.setToggleGroup(TGroup);
//        speRB.setToggleGroup(TGroup);
//
//        ToggleGroup TGroup = new ToggleGroup();
//        RadioButton okRB = new RadioButton();
//        RadioButton rrRB = new RadioButton();
//        RadioButton sprRB = new RadioButton();
//        RadioButton speRB = new RadioButton();
//
//        okRB.setToggleGroup(TGroup);
//        rrRB.setToggleGroup(TGroup);
//        sprRB.setToggleGroup(TGroup);
//        speRB.setToggleGroup(TGroup);
//
//        ToggleGroup TGroup = new ToggleGroup();
//        RadioButton okRB = new RadioButton();
//        RadioButton rrRB = new RadioButton();
//        RadioButton sprRB = new RadioButton();
//        RadioButton speRB = new RadioButton();
//
//        okRB.setToggleGroup(TGroup);
//        rrRB.setToggleGroup(TGroup);
//        sprRB.setToggleGroup(TGroup);
//        speRB.setToggleGroup(TGroup);
//
//        ToggleGroup TGroup = new ToggleGroup();
//        RadioButton okRB = new RadioButton();
//        RadioButton rrRB = new RadioButton();
//        RadioButton sprRB = new RadioButton();
//        RadioButton speRB = new RadioButton();
//
//        okRB.setToggleGroup(TGroup);
//        rrRB.setToggleGroup(TGroup);
//        sprRB.setToggleGroup(TGroup);
//        speRB.setToggleGroup(TGroup);
//
//        ToggleGroup TGroup = new ToggleGroup();
//        RadioButton okRB = new RadioButton();
//        RadioButton rrRB = new RadioButton();
//        RadioButton sprRB = new RadioButton();
//        RadioButton speRB = new RadioButton();
//
//        okRB.setToggleGroup(TGroup);
//        rrRB.setToggleGroup(TGroup);
//        sprRB.setToggleGroup(TGroup);
//        speRB.setToggleGroup(TGroup);

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

        gPane.add(section1Label, 0, 3);
        gPane.add(section1okRB, 2, 3);
        gPane.add(section1rrRB, 3, 3);
        gPane.add(section1sprRB, 4, 3);
        gPane.add(section1speRB, 5, 3);


        // *** THIS IS THE BETTER WAY THAN ONE LINE AT A TIME
        // TODO
        gPane.addRow(4, section2Label, new Label(), section2okRB, section2rrRB, section2sprRB, section2speRB);
//        gPane.add(section2Label, 0, 4);
//        gPane.add(section2okRB, 2, 4);
//        gPane.add(section2rrRB, 3, 4);
//        gPane.add(section2sprRB, 4, 4);
//        gPane.add(section2speRB, 5, 4);

        gPane.add(section3Label, 0, 5);

        gPane.add(leftFrontPadsLabel, 0, 6);

        gPane.add(rightFrontPadsLabel, 0, 7);

        gPane.add(leftRearPadsLabel, 0, 8);

        gPane.add(rightRearPadsLabel, 0 , 9);

        gPane.add(frontRotorsDrumsLabel, 0 , 10);

        gPane.add(rearRotorsDrumsLabel, 0 ,11);

        gPane.add(frontBrakeShoesLabel, 0 ,12);

        gPane.add(rearBrakeShoesLabel, 0 ,13);

        gPane.add(section4Label, 0, 14);

        gPane.add(section5Label, 0 , 15, 2, 1);

        gPane.add(section6label, 0 , 16);

        gPane.add(section7Label, 0 , 17,2, 1);

        gPane.add(section8Label, 0 , 18);

        gPane.add(windowTintLabel, 0 ,19);

        gPane.add(section9Label, 0 , 20, 2 ,1);

        gPane.add(frontTreadDepthLabel, 0 ,21);

        gPane.add(rearTreadDepthLabel, 0 ,22);

        gPane.add(tirePressureLabel, 0 ,23, 2, 1);

        gPane.add(frontLeftLabel, 0 ,24);

        gPane.add(frontRightLabel, 0, 25);

        gPane.add(rearLeftLabel, 0 , 26);

        gPane.add(rearRightLabel, 0 , 27);

        gPane.add(section10Label, 0 , 28, 2, 1);

        gPane.add(section11Label, 0 , 29);

        gPane.add(warningLightsLabel, 0 , 30);

        gPane.add(ABSLabel, 0, 31);

        gPane.add(TPMSLabel, 0, 32);

        gPane.add(checkEngineLabel, 0 , 33);

        gPane.add(airBagsLabel, 0 , 34);

        gPane.add(electronicStabilityControlLabel, 0 , 35);

        gPane.add(otherLightsLabel, 0 , 38);

        gPane.add(fuelLevelLabel, 0 , 39);

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
