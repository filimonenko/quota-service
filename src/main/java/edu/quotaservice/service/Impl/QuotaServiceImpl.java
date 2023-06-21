package edu.quotaservice.service.Impl;

import edu.quotaservice.model.Quota;
import edu.quotaservice.repository.QuotaRepository;
import edu.quotaservice.service.QuotaService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
public class QuotaServiceImpl implements QuotaService {

    private final QuotaRepository quotaRepository;

    @Override
    public Quota getByCode(int code) {
        return quotaRepository.findByCode(code);
    }

    @Override
    public List<Quota> getByUserId(int id) {
        return quotaRepository.findByUserId(id);
    }

    @Override
    public Quota getByUserIdAndCode(int id, int code) {
        return quotaRepository.findByUserIdAndCode(id, code);
    }
}
