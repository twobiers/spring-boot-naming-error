package com.example.demo.deeper;

import org.springframework.stereotype.Service;

@Service
public class BarService {
  private final FooService fooService;

  public BarService(FooService fooService) {
    this.fooService = fooService;
  }
}
