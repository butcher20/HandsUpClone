package com.presentech.handsup.presentationfile;


import java.io.Serializable;
import java.util.List;

/**
 * Created by Alex Butcher on 22/02/2016.
 */
public class PresentationFile implements Serializable {
    /* Document Info */
//    String title;
//    String author;
//    String version;
//    String Comment;
    DocumentInfo documentInfo;


    /* Defaults */
//    String defBackgroundColour;
//    String defFont;
//    int defFontSize;
//    String defFontColour;
//    String defLineColour;
//    String defFillColour;
    Defaults defaults;

    List<Slide> slides;

    public PresentationFile(DocumentInfo documentInfo, Defaults defaults, List<Slide> slides) {
        this.documentInfo = documentInfo;
        this.defaults = defaults;
        this.slides = slides;
    }


    public DocumentInfo getDocumentInfo() {
        return documentInfo;
    }

    public Defaults getDefaults() {
        return defaults;
    }

    public List<Slide> getSlides() {
        return slides;
    }

}
