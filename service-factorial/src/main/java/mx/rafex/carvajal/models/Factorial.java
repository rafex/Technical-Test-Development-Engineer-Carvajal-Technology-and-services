package mx.rafex.carvajal.models;

import java.util.Objects;

public class Factorial {

  private long id;

  private Integer number;

  private Integer value;

  public Factorial() {
    super();
  }

  /**
   * @param id
   * @param number
   * @param value
   */
  public Factorial(final long id, final Integer number, final Integer value) {
    this.id = id;
    this.number = number;
    this.value = value;
  }

  /**
   * @return the id
   */
  public long getId() {
    return id;
  }

  /**
   * @param id the id to set
   */
  public void setId(final long id) {
    this.id = id;
  }

  /**
   * @return the number
   */
  public Integer getNumber() {
    return number;
  }

  /**
   * @param number the number to set
   */
  public void setNumber(final Integer number) {
    this.number = number;
  }

  /**
   * @return the value
   */
  public Integer getValue() {
    return value;
  }

  /**
   * @param value the value to set
   */
  public void setValue(final Integer value) {
    this.value = value;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, number, value);
  }

  @Override
  public boolean equals(final Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof Factorial)) {
      return false;
    }
    final Factorial other = (Factorial) obj;
    return id == other.id && Objects.equals(number, other.number) && Objects.equals(value, other.value);
  }

  @Override
  public String toString() {
    final StringBuilder builder = new StringBuilder();
    builder.append("Factorial [id=");
    builder.append(id);
    builder.append(", number=");
    builder.append(number);
    builder.append(", value=");
    builder.append(value);
    builder.append("]");
    return builder.toString();
  }
  
}
