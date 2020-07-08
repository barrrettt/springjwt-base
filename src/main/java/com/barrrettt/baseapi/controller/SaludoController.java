package com.barrrettt.baseapi.controller;

import java.util.concurrent.atomic.AtomicLong;

import com.barrrettt.baseapi.model.Saludo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController {
    private static final String template = "Hola %s!";
    private final AtomicLong counter = new AtomicLong();
    
    @GetMapping("/saludo")
	public Saludo greeting(@RequestParam(value = "nombre", defaultValue = "World") String name) {
		return new Saludo(counter.incrementAndGet(), String.format(template, name));
	}
}
