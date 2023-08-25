package com.github.singlerr.apringframework;

import java.io.*;
import java.nio.charset.StandardCharsets;

public abstract class CheckStyleUtil {

    public static String getCheckstyleConfig(String resourcePath) throws IOException {
        InputStream in = CheckStyleUtil.class.getResourceAsStream(resourcePath);

        StringBuilder sb = new StringBuilder();
        try (Reader reader = new BufferedReader(new InputStreamReader(in, StandardCharsets.UTF_8))) {
            int c;
            while ((c = reader.read()) != -1) {
                sb.append((char) c);
            }
        }
        return sb.toString();
    }
}
