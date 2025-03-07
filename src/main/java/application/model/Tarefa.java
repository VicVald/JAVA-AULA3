package application.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "tarefas")
public class Tarefa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String descricao;

    public void setId(long id){
        this.id = id;
    }

    public long getId(){
        return this.id;
    }
    
    public void setDescricao(String descricao){
        this.descricao= descricao;
    }

    public String getDescricao(){
        return descricao;
    }
}
