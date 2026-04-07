package edu.ucsb.cs156.spring.hello;

/**
 * A class with static methods to provide information about the developer.
 */

public class Developer {

    // This class is not meant to be instantiated
    // so we make the constructor private

    private Developer() {}
    
    /**
     * Get the name of the developer
     */

    public static String getName() {
        return "Kazu";
    }

    /**
     * Get the github id of the developer
     * @return github id of the developer
     */

    public static String getGithubId() {
        return "Kazu-Pang";
    }

    /**
     * Get the developers team
     * @return developers team as a Java object
     */
    
    public static Team getTeam() {
        Team team = new Team("s26-10");
        team.addMember("Alex Y.");
        team.addMember("Amit");
        team.addMember("Kazu");
        team.addMember("Om");
        team.addMember("Srish");
        team.addMember("Yuhang");
        return team;
    }
}
