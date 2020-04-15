package com.codeout.lrnprogpro;

public class PDFModel {
    String Name;
    String URL;
    long id;
    public PDFModel(){
        //for firebase
    }

    public PDFModel(String Name, String URL) {
        this.Name = Name;
        this.URL = URL;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }
    public long getID() {
        return id;
    }


}
