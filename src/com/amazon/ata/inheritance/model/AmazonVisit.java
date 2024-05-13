package com.amazon.ata.inheritance.model;

public class AmazonVisit extends Visit {

    @Override
    public char getVisitCharacter() {
        return '@';
    }

    @Override
    public VisitColor getVisitColor() {
        return VisitColor.AMAZON_VISITOR_COLOR;
    }
}