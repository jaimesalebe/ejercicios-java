package com.jaimesalebe.crudmysql.Services;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface IStorageService {

    //Metodo auxiliar para preparar todo lo necesario
    void init() throws IOException;

    //Almacenar archivo
    String store(MultipartFile file);

    //Cargar archivo
    Resource loadAsResource(String fileName);

    String saveImage(MultipartFile file);
}
