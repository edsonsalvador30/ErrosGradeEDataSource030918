package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela PRODUTO
 * @generated
 */
@Entity
@Table(name = "\"PRODUTO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Produto")
public class Produto implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

  /**
  * @generated
  */
  @Column(name = "nome_produto", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String nome_produto;

  /**
  * @generated
  */
  @Column(name = "valor", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double valor;

  /**
  * @generated
  */
  @Column(name = "qtd", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer qtd;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "vencimento", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date vencimento;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_pedido", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Pedido pedido;

  /**
   * Construtor
   * @generated
   */
  public Produto(){
  }


  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.lang.String getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public Produto setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém nome_produto
   * return nome_produto
   * @generated
   */
  
  public java.lang.String getNome_produto(){
    return this.nome_produto;
  }

  /**
   * Define nome_produto
   * @param nome_produto nome_produto
   * @generated
   */
  public Produto setNome_produto(java.lang.String nome_produto){
    this.nome_produto = nome_produto;
    return this;
  }

  /**
   * Obtém valor
   * return valor
   * @generated
   */
  
  public java.lang.Double getValor(){
    return this.valor;
  }

  /**
   * Define valor
   * @param valor valor
   * @generated
   */
  public Produto setValor(java.lang.Double valor){
    this.valor = valor;
    return this;
  }

  /**
   * Obtém qtd
   * return qtd
   * @generated
   */
  
  public java.lang.Integer getQtd(){
    return this.qtd;
  }

  /**
   * Define qtd
   * @param qtd qtd
   * @generated
   */
  public Produto setQtd(java.lang.Integer qtd){
    this.qtd = qtd;
    return this;
  }

  /**
   * Obtém vencimento
   * return vencimento
   * @generated
   */
  
  public java.util.Date getVencimento(){
    return this.vencimento;
  }

  /**
   * Define vencimento
   * @param vencimento vencimento
   * @generated
   */
  public Produto setVencimento(java.util.Date vencimento){
    this.vencimento = vencimento;
    return this;
  }

  /**
   * Obtém pedido
   * return pedido
   * @generated
   */
  
  public Pedido getPedido(){
    return this.pedido;
  }

  /**
   * Define pedido
   * @param pedido pedido
   * @generated
   */
  public Produto setPedido(Pedido pedido){
    this.pedido = pedido;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Produto object = (Produto)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

}
