package dto.carparts;

public class Part {
  private String id;
  private  String producerName;
  private String model;
  private String serie;

  public Part(String id, String producerName, String model, String serie) {
    this.id = id;
    this.producerName = producerName;
    this.model = model;
    this.serie = serie;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getProducerName() {
    return producerName;
  }

  public void setProducerName(String producerName) {
    this.producerName = producerName;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getSerie() {
    return serie;
  }

  public void setSerie(String serie) {
    this.serie = serie;
  }
}
