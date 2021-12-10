
package lpnu.dto;

        import lpnu.entity.Ingridient;

        import java.util.Objects;

public class PizzaDTO {
    private Long id;
    private Ingridient ingridient;


    private PizzaDTO(){

    }

    public PizzaDTO(final Long id, final Ingridient word) {
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

    public void setIngridient(Ingridient ingridient) {
        this.ingridient = ingridient;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PizzaDTO that = (PizzaDTO) o;
        return Objects.equals(ingridient, that.ingridient);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ingridient);
    }
}