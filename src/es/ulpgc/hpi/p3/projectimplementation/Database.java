package es.ulpgc.hpi.p3.projectimplementation;

import java.util.Date;

public class Database {
    private static int ID = 0;
    private final int id;

    private Boolean isTidy;

    private final int size;
    private final String sourcePath;
    private final Date lastUpdate;

    private FileType fileType;

    public Database(Boolean isTidy, int size, String sourcePath, Date lastUpdate, FileType fileType) {
        this.id = ++ID;
        this.isTidy = isTidy;
        this.size = size;
        this.sourcePath = sourcePath;
        this.lastUpdate = lastUpdate;
        this.fileType = fileType;
    }

    public int getId() {
        return id;
    }

    public Boolean getTidy() {
        return isTidy;
    }

    public int getSize() {
        return size;
    }

    public String getSourcePath() {
        return sourcePath;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public FileType getFileType() {
        return fileType;
    }


    public void cleanData() {
        if (this.isTidy) {
            System.out.println("Database (ID: " + id + ") is already tidy. No action needed.");
        } else {
            System.out.println("Cleaning data from: " + sourcePath + "...");
            this.isTidy = true;
            System.out.println("Data cleaning completed. Status set to Tidy.");
        }
    }


    public void filterBy(String criteria) {
        if (!this.isTidy) {
            System.out.println("Warning: Filtering untidy data might yield incorrect results.");
        }
        System.out.println("Filtering database (ID: " + id + ") by criteria: [" + criteria + "]");
        System.out.println("Filter applied. Returning subset of " + size + " rows.");
    }
}