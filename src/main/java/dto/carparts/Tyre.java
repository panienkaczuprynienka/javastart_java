package dto.carparts;

public class Tyre extends Part{
  private int size;
  private int width;


  public Tyre(String id, String producerName, String model, String serie, int size, int width) {
    super(id, producerName, model, serie);
    this.size = size;
    this.width = width;
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }

  public int getWidth() {
    return width;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  @Override
  public String toString() {
    return "Tyre{" +
            "id='" + getId() + '\'' +
            ", producerName='" + getProducerName() + '\'' +
            ", model='" + getModel() + '\'' +
            ", serie='" + getSerie() + '\'' +
            ", size=" + size +
            ", width=" + width +
            '}';
  }
}
