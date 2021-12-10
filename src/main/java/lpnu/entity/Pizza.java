
package lpnu.entity;

        import java.util.Objects;

public class Pizza {
    private Long id;
    private Ingridient ingridient;
   // private int pizzaTotalPrice;

    public Pizza(){

    }

    public Pizza(final Long id, final Ingridient ingridient) {
        this.id = id;
        this.ingridient = ingridient;
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public Ingridient getIngridient() {
        return ingridient;
    }

    public void setIngridient(final Ingridient ingridient) {
        this.ingridient = ingridient;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pizza that = (Pizza) o;
        return Objects.equals(ingridient, that.ingridient);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ingridient);
    }
}