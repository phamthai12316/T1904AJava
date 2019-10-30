package labsession6;

public class News implements INews{
    public int id;
    public String title;
    public String publishDate;
    public String author;
    public String content;
    public float averageRate;
    public int[] rateList = new int[3];

    public News() {
    }

    public News(int id, String title, String publishDate, String author, String content) {
        this.id = id;
        this.title = title;
        this.publishDate = publishDate;
        this.author = author;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public float getAverageRate() {
        return averageRate;
    }

    @Override
    public void Display() {
        System.out.println(this.getId());
        System.out.println(this.getTitle());
        System.out.println(this.getAuthor());
        System.out.println(this.getPublishDate());
        System.out.println(this.getContent());
        System.out.println(this.getAverageRate());
    }

    public void Calculate(){
        float f = 0;
        for (int r: rateList){
            f += r;
        }
        this.averageRate = f/3;
    }
}