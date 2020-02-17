import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

import java.util.List;

import javax.persistence.*;

/**
 * Empresa
 */
@Entity
@Table(name = "empresa")
public class Empresa implements Serializable {
    
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private Long id;
    private String razaoSocial;
    private String CNPJ;
    private Date dataCriacao;
    private Date dataAtualizacao;
    private List<Object> funcionarios;
    public Empresa(){
       
    }

    @Id//seta qual vai ser o id no banco
    @GeneratedValue(strategy = GenerationType.AUTO)//auto increment no id
    public Long getId(){
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    @Column(name = "razao_social",nullable = false)//nome da coluna na tabela e nao nula
    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    @Column(name = "cnpj",nullable = false)
    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String cNPJ) {
        CNPJ = cNPJ;
    }
    @Column(name = "data_criacao",nullable = false)
    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    @Column(name = "data_atualizacao",nullable = false)
    public Date getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(Date dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }
    @OneToMany(mappedBy = "empresa", fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    public List<Object> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Object> funcionarios) {
        this.funcionarios = funcionarios;
    }

    @PreUpdate
    public void PreUpdate(){
        dataAtualizacao = new Date();
    }

    @PrePersist
    public void PrePersist() {
        final Date atual = new Date();
        dataCriacao = atual;
        dataAtualizacao = atual;
    }

    @Override
    public String toString() {
        return "Empresa [CNPJ=" + CNPJ + ", dataAtualizacao=" + dataAtualizacao + ", dataCriacao=" + dataCriacao
                + ", id=" + id + ", razaoSocial=" + razaoSocial + "]";
    }
}