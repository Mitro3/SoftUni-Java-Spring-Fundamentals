package bg.softuni.mobilele.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class UserRegisterDTO {

   @NotEmpty
   @Email
   private String email;

   @NotEmpty
   @Size(min = 2, max = 20)
   private String firstName;

   @NotEmpty
   @Size(min = 2, max = 20)
   private String lastName;

   @NotEmpty
   @Size(min = 5)
   private String password;

   @NotEmpty
   private String confirmPassword;

   public String getFirstName() {
      return firstName;
   }

   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   public String getLastName() {
      return lastName;
   }

   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   public String getConfirmPassword() {
      return confirmPassword;
   }

   public void setConfirmPassword(String confirmPassword) {
      this.confirmPassword = confirmPassword;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }
}
