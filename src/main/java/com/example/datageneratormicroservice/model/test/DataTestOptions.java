package com.example.datageneratormicroservice.model.test;

import com.example.datageneratormicroservice.model.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//Конфигурация для автоматической отправки сообщения
@NoArgsConstructor
@Getter
@Setter
public class DataTestOptions {

    private int delayInSeconds;
    //Типы измерений, которые мы хотим создавать автоматически
    private Data.MeasurementType[] measurementTypes;


}
