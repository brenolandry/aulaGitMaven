/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.aulas.prat_mavengit;

import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aluno
 */
public class AppLabTest {

    public AppLabTest() {
    }

    /**
     * Test oflerJSONmethod, ofclassAppLab.
     */
    @Test
    public void testLerJSON() throws Exception {
        System.out.println("lerJSON");
        String url = "http://time.jsontest.com/"; // esta URL gera um conteúdo JSON
        String result = AppLab.lerJSON(url);
        assertTrue(result.length() > 0);
    }
}
