import java.util.ArrayList;
import java.util.Objects;

public class Banco {
    private String nome;
    private String cnpj;
    private ArrayList<Cliente> cliente = new ArrayList();

    public Banco() {
    }

    public Banco(String nome, String cnpj, ArrayList<Cliente> cliente) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.cliente = cliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public ArrayList<Cliente> getCliente() {
        return cliente;
    }

    public void setCliente(ArrayList<Cliente> cliente) {
        this.cliente = cliente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Banco banco = (Banco) o;
        return Objects.equals(nome, banco.nome) && Objects.equals(cnpj, banco.cnpj) && Objects.equals(cliente, banco.cliente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cnpj, cliente);
    }

    @Override
    public String toString() {
        return "Banco{" +
                "nome='" + nome + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", cliente=" + cliente +
                '}';
    }
}
