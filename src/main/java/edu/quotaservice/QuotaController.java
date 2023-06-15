package edu.quotaservice;

import edu.quotaservice.model.Quota;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/quotas")
@RequiredArgsConstructor
public class QuotaController {

    @GetMapping("/{code}")
    public Quota getQuotasByCode(@PathVariable int code) {
        return  new Quota(); //TODO
    }

    @GetMapping("/{userid}")
    public List<Quota> getQuotasByUserId(@PathVariable int userid) {
        return  new ArrayList<Quota>(); //TODO
    }

    @PostMapping("/{userid}")
    public Quota getQuotasByUserIdAndCode(@PathVariable int userid, @RequestBody int code ) {
        return  new Quota(); //TODO
    }

}
