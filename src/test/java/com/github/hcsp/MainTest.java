package com.github.hcsp;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void importStringUtilsCorrectly() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos, true));

        Main.main(null);

        assertTrue(new String(baos.toByteArray()).contains("aaa+bbb=aaabbb"));
        assertTrue(new String(baos.toByteArray()).contains("cat+dog=catdog"));
    }

    @Test
    public void hasAddMethod() throws Exception {
        Main.class.getDeclaredMethod("add", String.class, String.class);
    }
}
