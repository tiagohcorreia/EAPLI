package domain;

import javax.persistence.*;

@Entity
@Table(name = "contrato_aluguer")
public class ContratoAluguer {

    @Id
    @GeneratedValue
    private int id;
    @ManyToOne
    @JoinColumn(name = "automovel_id")
    private Automovel automovel;

    public Automovel getAutomovel() {
        return automovel;
    }

    public void setAutomovel(Automovel automovel) {
        this.automovel = automovel;
    }

    protected ContratoAluguer() {
    }


}