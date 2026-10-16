package uk.ac.westminster.products_api;

public class DigitalProduct extends Product{

    private String downloadUrl;
    private double filesize;

    public DigitalProduct() {
    }

    public DigitalProduct(String downloadUrl, double filesize) {
        this.downloadUrl = downloadUrl;
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
