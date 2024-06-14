package domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "grupo_automovel")
public class GrupoAutomovel {

    @Id
    @Column
    private String nome;
    @Column
    private int numero_portas;
    @Column
    private String classe;

    public GrupoAutomovel() {
    }

    public GrupoAutomovel(String nome, int numero_portas, String classe) {
        this.nome = nome;
        this.numero_portas = numero_portas;
        this.classe = classe;
    }

    public String getNome() {
        return nome;
    }

    public int getNumero_portas() {
        return numero_portas;
    }

    public String getClasse() {
        return classe;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GrupoAutomovel{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", numero_portas=").append(numero_portas);
        sb.append(", classe='").append(classe).append('\'');
        sb.append('}');
        return sb.toString();
    }
}