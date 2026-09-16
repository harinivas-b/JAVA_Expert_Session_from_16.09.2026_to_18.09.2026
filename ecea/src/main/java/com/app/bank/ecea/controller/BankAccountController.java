import com.app.bank.ecea.component.BankAccount;
import org.apache.coyote.Response;
import org.apache.tomcat.util.digester.SystemPropertySource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public class BankAccountController {
    @GetMapping("bankaccount")
    public ResponseEntity<com.app.bank.ecea.component.BankAccount>getBankAccount(){
        com.app.bank.ecea.component.BankAccount bankAccount = new com.app.bank.ecea.component.BankAccount(1, "Ram" ,1000);
        return new ResponseEntity<>(bankAccount, HttpStatus.OK);
    }
    @GetMapping("{id}/{name}/{amount}")
    public ResponseEntity<BankAccount> setBankAccount(@PathVariable("id") int id,
                                                      @PathVariable("name") String name,
                                                      @PathVariable("amount") int amount)
    {
        BankAccount bankAccount = new BankAccount(id, name, amount);
        return new ResponseEntity<>(bankAccount, HttpStatus.OK);
    }
}
@GetMapping("query")
public ResponseEntity<BankAccount> bankAccountQueery(@RequestParam("id") int id,
                                                     @RequestParam("name") String name,
                                                     @RequestParam("amount") int amount){
    BankAccount bankAccount = new BankAccount(id, name, amount);
    return new ResponseEntity<>(bankAccount, HttpStatus.OK);
}
@PostMapping("create")
public ResponseEntity<BankAccount> createAccount(@RequestBody BankAccount ba){
    System.out.println(ba.getId() + " " + ba.getName() + " " + ba.getAmount());
    return new ResponseEntity<>(ba, HttpStatus.OK);
}

void main() {
}