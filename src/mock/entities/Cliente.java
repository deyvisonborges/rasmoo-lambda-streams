package mock.entities;

import java.time.LocalDate;
import java.time.Period;
import java.util.UUID;

public class Cliente {
  private UUID id;
  private String name;
  private LocalDate birthDate;

  public Cliente(String name, LocalDate birthDate) {
    this.id = UUID.randomUUID();
    this.name = name;
    this.birthDate = birthDate;
  }

  public UUID getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public int getAge() {
    return Period.between(this.birthDate, LocalDate.now()).getYears();
  }


  public LocalDate getBirthDate() {
    return this.birthDate;
  }

  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }

  @Override
  public String toString() {
    return "{ name='" + name + "', birthDate=" + birthDate + " }";
  }
}
