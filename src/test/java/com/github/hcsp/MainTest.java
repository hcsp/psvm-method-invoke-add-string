package com.github.hcsp;

import static org.hamcrest.Matchers.containsStringIgnoringCase;

import com.github.blindpirate.extensions.CaptureSystemOutput;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    @CaptureSystemOutput
    public void importStringUtilsCorrectly(CaptureSystemOutput.OutputCapture capture) {
        capture.expect(containsStringIgnoringCase("aaa+bbb=aaabbb"));
        capture.expect(containsStringIgnoringCase("cat+dog=catdog"));
        Main.main(null);
    }

    @Test
    public void hasAddMethod() throws Exception {
        Main.class.getDeclaredMethod("add", String.class, String.class);
    }
}
