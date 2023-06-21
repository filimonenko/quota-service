package edu.quotaservice;

import edu.quotaservice.model.Quota;
import edu.quotaservice.service.QuotaService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/quotas")
@RequiredArgsConstructor
public class QuotaController {

    private static  QuotaService quotaService;

    @GetMapping("/{code}")
    public Quota getQuotaByCode(@PathVariable int code) {
        return  quotaService.getByCode(code);
    }

    @GetMapping("/{userid}")
    public List<Quota> getQuotasByUserId(@PathVariable int userid) {
        return  quotaService.getByUserId(userid);
    }

    @PostMapping("/{userid}")
    public Quota getQuotasByUserIdAndCode(@PathVariable int userid, @RequestBody int code ) {
        return quotaService.getByUserIdAndCode(userid, code);
    }

}
