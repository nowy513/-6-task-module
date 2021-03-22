package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SettingsFileEngineTestSuite {

    private static SettingsFileEngine settingsFileEngine;

    @BeforeAll
    public static void openSettingFile(){
        settingsFileEngine = SettingsFileEngine.INSTANCE;
        settingsFileEngine.open("myapp.settings");
    }

    @AfterAll
    public static void closeSettingFile(){
        settingsFileEngine.close();
    }

    @Test
    void testGetFileName(){
//        Given
//        When
        String filename = settingsFileEngine.getFileName();
        System.out.println("Opened: " + filename);
//        then
        assertEquals("myapp.settings", filename);
    }

    @Test
    void testLoadSettings(){
//        Given
//        When
        boolean result = settingsFileEngine.loadSetting();
//        Then
        assertTrue(result);
    }

    @Test
    void testSaveSetting(){
//        Given
//        Then
        boolean result = settingsFileEngine.saveSetting();
//        Then
        assertTrue(result);
    }
}
