package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        // Create the Gridpane for displaying the form itself
        GridPane gPane = new GridPane();

        gPane.setHgap(15);
        gPane.setVgap(10);

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
        Label tirePressureLabel = new Label("Tire Pressure(PSI) - ONly req'd if adjusted by more than 5 PSI");
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

        // Add children to the GridPane.
        // Row 0
        gPane.add(OSILabel,0, 0 , 3, 1);
        gPane.add(autoClinicLabel, 3, 0, 3, 1);

        // Row 1
        gPane.add(legendLabel, 0,1);
        gPane.add(okLabel, 2,1);
        gPane.add(repairRequiredLabel, 3,1);
        gPane.add(suggestedPreventiveLabel, 4,1);
        gPane.add(suggestedPerformanceLabel, 5,1);
        gPane.add(commentsLabel, 6,1);

        // Row 2
        gPane.add(section1Label, 0, 2);

        // Row 3
        gPane.add(section2Label, 0, 3);

        // Row 4
        gPane.add(section3Label, 0, 4);

        // Row 5
        gPane.add(leftFrontPadsLabel, 0, 5);

        // Row 6
        gPane.add(rightFrontPadsLabel, 0, 6);

        // Row 7
        gPane.add(leftRearPadsLabel, 0, 7);

        // Row 8
        gPane.add(rightRearPadsLabel, 0 , 8);

        // Row 9
        gPane.add(frontRotorsDrumsLabel, 0 , 9);

        // Row 10
        gPane.add(rearRotorsDrumsLabel, 0 ,10);

        // Row 11
        gPane.add(frontBrakeShoesLabel, 0 ,11);

        // Row 12
        gPane.add(rearBrakeShoesLabel, 0 ,12);

        // Row 13
        gPane.add(section4Label, 0, 13);

        // Row 14
        gPane.add(section5Label, 0 , 14);

        // Row 15
        gPane.add(section6label, 0 , 15);

        // Row 16
        gPane.add(section7Label, 0 , 16);

        // Row 17
        gPane.add(section8Label, 0 , 17);

        // Row 18
        gPane.add(windowTintLabel, 0 ,18);

        // Row 19
        gPane.add(section9Label, 0 , 19);

        // Row 20
        gPane.add(frontTreadDepthLabel, 0 ,20);

        // Row 21
        gPane.add(rearTreadDepthLabel, 0 ,21);

        // Row 22
        gPane.add(tirePressureLabel, 0 ,22);

        // Row 23
        gPane.add(frontLeftLabel, 0 ,23);

        // Row 24
        gPane.add(frontRightLabel, 0, 24);

        // Row 25
        gPane.add(rearLeftLabel, 0 , 25);

        // Row 26
        gPane.add(rearRightLabel, 0 , 26);

        // Row 27
        gPane.add(section10Label, 0 , 27);

        // Row 28
        gPane.add(section11Label, 0 , 28);

        // Row 29
        gPane.add(warningLightsLabel, 0 , 29);

        // Row 30
        gPane.add(ABSLabel, 0, 30);

        // Row 31
        gPane.add(TPMSLabel, 0, 31);

        // Row 32
        gPane.add(checkEngineLabel, 0 , 32);

        // Row 33
        gPane.add(airBagsLabel, 0 , 33);

        // Row 34
        gPane.add(electronicStabilityControlLabel, 0 , 34);

        // Row 35
        gPane.add(otherLightsLabel, 0 , 35);

        // Row 36
        gPane.add(fuelLevelLabel, 0 , 36);

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
