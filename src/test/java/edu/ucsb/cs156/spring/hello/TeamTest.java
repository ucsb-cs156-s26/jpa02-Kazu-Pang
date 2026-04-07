package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

   
    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)
    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

    @Test
    public void equals_with_same_object() {
        assertTrue(team.equals(team), "same object.equals(same object) should be true");
    }

    @Test
    public void equals_with_different_class() {
        String diff_class = "different class";
        assertFalse(team.equals(diff_class), "class.equals(different class) should be false");
    }

    // May be redundant because of following two tests below
    @Test
    public void equals_with_same_name_and_members() {
        Team same_name = new Team("test-team");
        assertTrue(team.equals(same_name), "class.equals(class with same name and members) should be true");
    }

    @Test
    public void equals_with_different_name() {
        Team diff_name = new Team("different name");
        assertFalse(team.equals(diff_name), "class.equals(class with diff name) should be false");
    }

    @Test
    public void equals_with_different_members() {
        Team diff_members = new Team("test-team");

        ArrayList<String> members = new ArrayList<String>();
        members.add("member that does not exist in original class");
        diff_members.setMembers(members);

        assertFalse(team.equals(diff_members), "class.equals(class with diff members) should be false");
    }

    @Test
    public void hashCode_returns_expected_value() {
        int hash = team.hashCode();
        int expected = -1226298695; 
        assertEquals(hash, expected);
    }
}