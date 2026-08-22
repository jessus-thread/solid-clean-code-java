package com.devtalles.project.namesCorrect;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/*
    
*/

public class NamesCorrect {
    public static void main(String[] args) {
        final int LIMIT_FILES = 100_000;
        List<File> filesToEvaluate = getFiles(LIMIT_FILES);
        List<File> filesToDelete = getFilesFlagged(filesToEvaluate);

        for (File file : filesToDelete) {
            System.out.println(file);
        }
    }

    private static List<File> getFilesFlagged(List<File> files) {
        List<File> filesFlagged = new ArrayList<>();

        for (File file : files) {
            if (!file.isFlagged()) continue;

            filesFlagged.add(file);
        }

        return filesFlagged;
    }

    private static List<File> getFiles(int limitFiles) {
        List<File> files = new ArrayList<>();

        for (int index = 1; index <= limitFiles; index++) {
            File file = new File(index, getRandomBoolean());

            files.add(file);
        }

        return files;
    }

    private static boolean getRandomBoolean() {
        return ThreadLocalRandom.current().nextBoolean();
    }

    private static int getRandomNumber(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }
}
