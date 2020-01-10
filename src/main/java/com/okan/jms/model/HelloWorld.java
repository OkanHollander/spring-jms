package com.okan.jms.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

/**
 * Author:   Okan Hollander
 * Date:     10/01/2020
 * Time:     20:48
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HelloWorld implements Serializable {

    static final long serialVersionUID = 1221954397249361680L;

    private UUID id;
    private String message;
}
