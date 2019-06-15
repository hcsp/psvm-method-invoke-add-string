package com.github.hcsp;

import com.github.blindpirate.extensions.CaptureSystemOutput;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    @CaptureSystemOutput
    public void importStringUtilsCorrectly(CaptureSystemOutput.OutputCapture capture) {
        capture.expect(Matchers.containsStringIgnoringCase("aaa+bbb=aaabbb"));
        capture.expect(Matchers.containsStringIgnoringCase("cat+dog=catdog"));
        Main.main(null);
    }

    @Test
    public void hasAddMethod() throws Exception {
        Main.class.getDeclaredMethod("add", String.class, String.class);
    }
}
