package uk.ac.westminster.products_api;

public class DigitalProduct extends Product{

    private String downloadUrl;
    private double filesize;

    public DigitalProduct() {
    }

    public DigitalProduct(Long id, String name, double price, String downloadUrl, double filesize) {
        super(id, name, price); //super class must be in the first line of the constructor
        this.downloadUrl = downloadUrl;
        this.filesize = filesize;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public double getFilesize() {
        return filesize;
    }

    public void setFilesize(double filesize) {
        this.filesize = filesize;
    }

}
