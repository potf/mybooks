package fromxml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.awt.print.Book;

@XmlRootElement(name = "book")
public class BookJAXB {

    private String name;
    private String originalName;
    private String series;
    private int year;
    private String translator;
    private int pages;
    private String isImg;
    private double price;
    private String description;

    public BookJAXB() {
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getOriginalName() {
        return originalName;
    }

    public String getSeries() {
        return series;
    }

    public int getYear() {
        return year;
    }

    public String getTranslator() {
        return translator;
    }

    public int getPages() {
        return pages;
    }

    public String getIsImg() {
        return isImg;
    }

    public String getDescription(){
        return description;
    }

    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    @XmlElement
    public void setOriginalName(String originalName) {
        this.originalName = originalName;
    }

    @XmlElement
    public void setSeries(String series) {
        this.series = series;
    }

    @XmlElement
    public void setYear(int year) {
        this.year = year;
    }

    @XmlElement
    public void setTranslator(String translator) {
        this.translator = translator;
    }

    @XmlElement
    public void setPages(int pages) {
        this.pages = pages;
    }

    @XmlElement
    public void setIsImg(String isImg) {
        this.isImg = isImg;
    }

    @XmlElement
    public void setPrice(double price) {
        this.price = price;
    }

    @XmlElement
    public void setDescription(String description){
        this.description = description;
    }

    @Override
    public String toString() {
        return "fromxml.BookJAXB{" +
                ", name='" + name + '\'' +
                ", originalName='" + originalName + '\'' +
                ", series='" + series + '\'' +
                ", year=" + year +
                ", translator='" + translator + '\'' +
                ", pages=" + pages +
                ", isImg='" + isImg + '\'' +
                ", price=" + price +
                '}';
    }
}
