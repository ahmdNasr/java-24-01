import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Product {
    private String name;
    private String description;
    private float price;
    private String articleNr;
    private Category category;

    // Example: produts.csv
    // Content
    // name,description,price,articleNr,category
    // Rolex,Rolex uhr,18000.0,R393,SCHMUCK
    // Pinzette,pinzette zum haare zupfen,5.29,P478,KOSMETIK
    // Monitor,monitor um ein bild zu sehen,120.0,M478,TECH
    // MILCH,was trinkt die kuh? wasser,1.69,MILCH1,ESSEN
    public static List<Product> parseProductListCsv(String csv) {
        String[] lines = csv.split("\n");
        return Arrays
                .stream(lines)
                .skip(1)
                .map(line -> {
                    String[] data = line.split(",");
                    if(data.length < 5) throw new IllegalArgumentException("CSV row " + line + " has missing data");
                    return new Product(data[0], data[1], Float.parseFloat(data[2]), data[3], Category.valueOf(data[4]));
                }).collect(Collectors.toList());
    }

    public Product(String name, String description, float price, String articleNr, Category category) {
        this.setName(name);
        this.setDescription(description);
        this.setPrice(price);
        this.setArticleNr(articleNr);
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null || name.trim().length() == 0) throw new IllegalArgumentException("Name must be set");
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if(description == null || description.trim().length() == 0) throw new IllegalArgumentException("Description must be set");
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        if(price < 0.0f) throw new IllegalArgumentException("Price must be positive.");
        this.price = price;
    }

    public String getArticleNr() {
        return articleNr;
    }

    public void setArticleNr(String articleNr) {
        if(articleNr == null || articleNr.trim().length() == 0) throw new IllegalArgumentException("ArticleNumber must be set");
        this.articleNr = articleNr;
    }

    public Category getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", articleNr='" + articleNr + '\'' +
                '}';
    }
}
