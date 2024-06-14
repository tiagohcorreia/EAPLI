package GA.GA;

import GARepo.GARepo.ContratoRepository;
import domain.ContratoAluguer;

import java.util.List;

public class ContratoAluguerController {

    public List<ContratoAluguer> listarContratos(){

        ContratoRepository repository = new ContratoRepository();

        return repository.findAll();
    }
}
