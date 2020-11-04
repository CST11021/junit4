package com.whz.rule;

import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.IOException;

/**
 */
public class TemporaryFolderRuleTest {

    @ClassRule
    public static TemporaryFolder temporaryFolder = new TemporaryFolder();

    public static File tempFile;

    @BeforeClass
    public static void createTempFile() throws IOException {
        tempFile = temporaryFolder.newFile("tempFile.txt");
    }

    @Test
    public void testJUnitClassRule_One() {
        System.out.println(tempFile.getAbsolutePath());
    }

    @Test
    public void testJUnitClassRule_Two() {
        System.out.println(tempFile.getAbsolutePath());
    }

}