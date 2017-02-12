package tutorials.hackro.com.dagger4.language;

/**
 * Created by hackro on 11/02/17.
 */
public class language {

    private String name;

    public language(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "language{" +
                "name='" + name + '\'' +
                '}';
    }
}
