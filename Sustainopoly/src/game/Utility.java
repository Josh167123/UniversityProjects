/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Utility {
       
    public static ChanceCards setUpChanceCards() {
        String[] chanceCards = {
                "Participate in a company training. Gain 1 hour and 2 energy.",
                "Advance to the next meeting. Skip the team lunch. Gain 1 hour and 3 energy.",
                "Volunteer to help with a co-worker's project. Lose 1 hour and gain 5 energy.",
                "Take a break and play a quick game. Lose 1 hour and gain 2 energy.",
                "Attend a networking event. Gain 2 hours and lose 3 energy.",
                "Fix a critical bug in your code. Gain 1 hour and lose 4 energy.",
                "Present your project progress to the team. Gain 1 hour and 2 energy.",
                "Fix unexpected issues with project dependencies. Lose 2 hours and gain 3 energy.",
                "Contribute to the company's open-source project. Gain 1 hour and 2 energy.",
                "Participate in a team building activity. Gain 1 hour and 3 energy.",
                "Research a new technology for the project. Gain 2 hours and lose 2 energy.",
                "Work on project documentation. Gain 1 hour and 2 energy.",
                "Test and debug your code. Lose 2 hours and gain 3 energy.",
                "Participate in a company-wide Scavenger Hunt. Gain 2 hours and lose 2 energy.",
                "Attend a company-wide virtual event. Gain 1 hour and 2 energy."
        };

        ArrayList<Integer> time = new ArrayList<>();
        time.add(1);
        time.add(1);
        time.add(-1);
        time.add(-1);
        time.add(2);
        time.add(1);
        time.add(1);
        time.add(-2);
        time.add(1);
        time.add(1);
        time.add(2);
        time.add(1);
        time.add(-2);
        time.add(2);
        time.add(1);
        

        ArrayList<Integer> energy = new ArrayList<>();
        energy.add(2);
        energy.add(3);
        energy.add(5);
        energy.add(2);
        energy.add(-3);
        energy.add(-4);
        energy.add(2);
        energy.add(3);
        energy.add(2);
        energy.add(3);
        energy.add(-2);
        energy.add(2);
        energy.add(3);
        energy.add(-2);
        energy.add(2);
     
        
       ChanceCards cards = new ChanceCards();

        for (int i= 0; i < chanceCards.length; i++) {
            Chance chance = new Chance(chanceCards[i],energy.get(i),time.get(i));
            cards.addCard(chance);
        }
        
        return cards;
    }
    
    
    public static Board setUpTasks(Board board) {

        ArrayList<String> General = new ArrayList<>();
     General.add( "Discuss strategies and plan");
     General.add(  "Organise scrum meeting");
     General.add("Prepare detailed product roadmap and delivery milestones");
     General.add( "Visit technician");
     General.add("Brainstorm ideas");
     General.add(  "Discuss app specifications and features");
     General.add("Create Gantt chart");
     General.add("Create project documentation");
     General.add( "Conduct market research");
     General.add("Allocate budget and resources");
     General.add("Get ready for launch of app");



        ArrayList<Integer> genralEnergy = new ArrayList<>();
     genralEnergy.add(2);
     genralEnergy.add(3);
     genralEnergy.add(5);
     genralEnergy.add(2);
     genralEnergy.add(2);
     genralEnergy.add(3);
     genralEnergy.add(2);
     genralEnergy.add(3);
     genralEnergy.add(2);
     genralEnergy.add(3);
     genralEnergy.add(2);

     ArrayList<Integer> genralTime = new ArrayList<>();
     genralTime.add(2);
     genralTime.add(3);
     genralTime.add(2);
     genralTime.add(3);
     genralTime.add(5);
     genralTime.add(2);
     genralTime.add(2);
     genralTime.add(3);
     genralTime.add(2);
     genralTime.add(2);
     genralTime.add(3);



     ArrayList<String> Tester = new ArrayList<>();
     Tester.add("Prepare test cases");
     Tester.add("Conduct black box testing");
     Tester.add("Test User interface");
     Tester.add("Perform acceptance testing on the whole system");
     Tester.add("Perform unit testing");
     Tester.add("Perform integration testing");
     Tester.add( "Meet and discuss findings with Developer team");
     Tester.add( "Test security of the system");
     Tester.add( "Conduct platform testing");
     Tester.add( "Retest fixed and corrected bugs");
     Tester.add("Test app on iOS and Android systems");


     int[] testerEnergy = {1, 4, 3, 2, 5, 3, 4, 2, 5, 1, 2, };

     int[] testerTime = {3, 3, 3, 3, 2, 2, 2, 2, 1, 3, 1};



     ArrayList<String> Designer = new ArrayList<>();
     Designer.add( "Sketch different project ideas");
     Designer.add("Create wireframes");
     Designer.add("Choose a font");
     Designer.add("Choose colour scheme and theme");
     Designer.add("Design user interfaces");
     Designer.add( "Design mock-ups for app");
     Designer.add( "Discuss app display design");
     Designer.add("Design app home page layout");
     Designer.add("Meet with front end developers");
     Designer.add("Create user workflow diagrams");
     Designer.add("Add clickable buttons");

     int[] designerEnergy = {1, 2, 5, 2, 5, 3, 5, 2, 1, 2, 5 };

     int[] designerTime = {1, 3, 2, 2, 2, 2, 1, 2, 1, 1, 2};



     ArrayList<String> Developer = new ArrayList<String>();
     Developer.add( "Create UML classes");
     Developer.add("Create use case");
     Developer.add("Create a flowchart");
     Developer.add( "Define technical architecture");
     Developer.add("Draft steps of development process");
     Developer.add("Build prototype system");
     Developer.add("Write source code for your classes");
     Developer.add("Combine all your classes");
     Developer.add( "Develop Back-End server-side and database");
     Developer.add("Start developing API");
     Developer.add("Troubleshoot UX bug");
     Developer.add("Develop front-end code to allow user interaction");
     
     int[] developerEnergy = {5, 2, 5, 3, 5, 2, 1, 2, 5, 3, 1 };

     int[] developerTime = {2, 2, 2, 2, 1, 2, 1, 1, 2, 2, 3};

     
     int[] positionsPart1 = {1, 2, 3, 5, 7, 8, 10, 11, 12,14, 15};
     int[] positionsPart2 = {17, 18, 19, 20};
     
     ArrayList<Square> squares = board.getSquares();
     
     for (int i = 0; i < positionsPart1.length; i++) {
            Task genTsk = new Task(General.get(i), genralEnergy.get(i), genralTime.get(i), PlayerType.GENERAL);
            Task tesTsk = new Task(Tester.get(i), testerEnergy[i], testerTime[i], PlayerType.TESTER);
            Task desTsk = new Task(Designer.get(i), designerEnergy[i], designerTime[i], PlayerType.DESIGNER);
      
            // adding the task to corresponding position
            squares.get(positionsPart1[i]).setTask(genTsk);
            squares.get(positionsPart1[i]).setTask(tesTsk);
            squares.get(positionsPart1[i]).setTask(desTsk);
            
     }
     
     for (int i = 0; i < positionsPart2.length; i++) {
              Task devTsk = new Task(Developer.get(i), developerEnergy[i], developerTime[i], PlayerType.DEVELOPER);
              squares.get(positionsPart2[i]).setTask(devTsk);
     }
     

     
     return board;
    }
    
}
