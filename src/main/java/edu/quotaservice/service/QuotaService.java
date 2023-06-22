package edu.quotaservice.service;

import edu.quotaservice.model.Quota;

import java.util.List;

public interface QuotaService {
    Quota getByCode(int code);

    List<Quota> getByUserId(int id);

    Quota getByUserIdAndCode(int id, int code);
}
