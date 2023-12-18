package com.example.datageneratormicroservice.web.dto;

import com.example.datageneratormicroservice.model.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//Конфигурация для автоматической отправки сообщения
@NoArgsConstructor
@Getter
@Setter
public class DataTestOptionsDto {

    private int delayInSeconds;
    //Типы измерений, которые мы хотим создавать автоматически
    private Data.MeasurementType[] measurementTypes;

}
