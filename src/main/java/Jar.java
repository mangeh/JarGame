import java.util.Random;

/**
 * Created by Magnus on 2016-09-28.
 */
public class Jar {


    private Integer maximumAllowed;


    private Integer amountInJar;
    private String item;


    public Jar(String item, int maximumAllowed) {
        setItem(item);
        setMaximumAllowed(maximumAllowed);
        fill();
    }

    public Integer getMaximumAllowed() {
        return maximumAllowed;
    }

    public void setMaximumAllowed(Integer maximumAllowed) {
        this.maximumAllowed = maximumAllowed;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Integer getAmountInJar() {
        return amountInJar;
    }

    public void setAmountInJar(Integer amountInJar) {
        this.amountInJar = amountInJar;
    }

    public void fill() {
        Random random = new Random();
        int maxItemsAllowed = getMaximumAllowed();
        setAmountInJar(random.nextInt(maxItemsAllowed+1)+1);
    }


}
