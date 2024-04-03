package com.example.CycleSharingSystemBackend.repository;

import com.example.CycleSharingSystemBackend.model.Bikes;
import com.example.CycleSharingSystemBackend.model.ResultDTO;

public interface QRService {
//    ResultDTO processQR();

    ResultDTO processQR(Bikes bike);
}
