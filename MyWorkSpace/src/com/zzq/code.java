package com.zzq;

import java.io.File;

public class code {
    public static void main(String[] args) {
        File file = new File("/usr/local/TestDir");
        file.mkdir();
        System.err.println("11234");
    }
}
