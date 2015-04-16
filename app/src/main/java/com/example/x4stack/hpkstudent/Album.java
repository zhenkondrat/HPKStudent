package com.example.x4stack.hpkstudent;

public class Album {
    private String albumName;
    private String albumDescription;
    private int countPhotos;
    private String imageURL;
    private String albumLink;

    Album(String albumName, String albumDescription, int countPhotos, String imageURL, String albumLink) {
        this.albumName = albumName;
        this.albumDescription = albumDescription;
        this.countPhotos = countPhotos;
        this.imageURL = imageURL;
        this.albumLink = albumLink;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public String getAlbumDescription() {
        return albumDescription;
    }

    public void setAlbumDescription(String albumDescription) {
        this.albumDescription = albumDescription;
    }

    public int getCountPhotos() {
        return countPhotos;
    }

    public void setCountPhotos(int countPhotos) {
        this.countPhotos = countPhotos;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getAlbumLink() {
        return albumLink;
    }

    public void setAlbumLink(String albumLink) {
        this.albumLink = albumLink;
    }
}