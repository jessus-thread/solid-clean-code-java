package com.devtalles.project.namesCorrect;

public class File {
    private int id;
    private boolean flagged;

    public File(int id, boolean flagged) {
        this.id = id;
        this.flagged = flagged;
    }

    public int getId() {
        return id;
    }

    public boolean isFlagged() {
        return flagged;
    }

    public void setFlagged(boolean flagged) {
        this.flagged = flagged;
    }

    @Override
    public String toString() {
        return "File{" +
                "id=" + id +
                ", flagged=" + flagged +
                '}';
    }
}
