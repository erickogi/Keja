package com.keja.keja.Models;

import java.util.ArrayList;
import java.util.List;

public class HomesByCategories {
    private int categoryKeyID;
    private int categoryID;
    private String categoryName;
    private List<HomesModel> homesModels;

    public HomesByCategories() {
    }

    public HomesByCategories(int categoryKeyID, int categoryID, String categoryName, List<HomesModel> homesModels) {
        this.categoryKeyID = categoryKeyID;
        this.categoryID = categoryID;
        this.categoryName = categoryName;
        this.homesModels = homesModels;
    }

    public List<HomesModel> getHomesModels() {
        return homesModels;
    }

    public void setHomesModels(List<HomesModel> homesModels) {
        this.homesModels = homesModels;
    }

    public int getCategoryKeyID() {
        return categoryKeyID;
    }

    public void setCategoryKeyID(int categoryKeyID) {
        this.categoryKeyID = categoryKeyID;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
