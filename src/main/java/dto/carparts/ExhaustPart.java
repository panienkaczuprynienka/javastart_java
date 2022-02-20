package dto.carparts;

public class ExhaustPart extends Part {
  private boolean europeanStandartValidation;


  public ExhaustPart(String id, String producerName, String model, String serie, boolean europeanStandartValidation) {
    super(id, producerName, model, serie);
    this.europeanStandartValidation = europeanStandartValidation;
  }

  public boolean isEuropeanStandartValidation() {
    return europeanStandartValidation;
  }

  public void setEuropeanStandartValidation(boolean europeanStandartValidation) {
    this.europeanStandartValidation = europeanStandartValidation;
  }

  @Override
  public String toString() {
    return "ExhaustPart{" +
            "europeanStandartValidation=" + europeanStandartValidation +
            "id='" + getId() + '\'' +
            ", producerName='" + getProducerName() + '\'' +
            ", model='" + getModel() + '\'' +
            ", serie='" + getSerie() + '\'' +
            '}';
  }
}
