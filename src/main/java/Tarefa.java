
public class Tarefa {
     long id;
     String descricao;
     boolean completa;

    public Tarefa() {}

    public Tarefa(long id, String descricao, boolean completa) {
        this.id = id;
        this.descricao = descricao;
        this.completa = completa;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;

    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isCompleta() {
        return completa;
    }

    public void setCompleta(boolean completa) {
        this.completa = completa;
    }
}
