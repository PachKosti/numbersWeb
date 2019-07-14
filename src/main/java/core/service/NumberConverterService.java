package core.service;

import org.springframework.stereotype.Service;

@Service
public interface NumberConverterService {

    String convert2Words(int num, String language);

}
