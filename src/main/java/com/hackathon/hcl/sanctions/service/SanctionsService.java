package com.hackathon.hcl.sanctions.service;

import com.hackathon.hcl.sanctions.entity.Sanctions;

public interface SanctionsService {
    Sanctions getSanction(int id);
    Sanctions getSanctions();
}
