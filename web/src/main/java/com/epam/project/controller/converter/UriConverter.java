package com.epam.project.controller.converter;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Aliaksandr_Khmurchyk on 15-Feb-18.
 */
public class UriConverter {
    public static Path convertUriToPath(String uri, int notNeedPrefixChars) {
        return Paths.get(uri.substring(notNeedPrefixChars));
    }

}
