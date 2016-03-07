package model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "pedidos")
public class Pedido implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long idPedido;
	private Cliente cliente;
	private Date dataPedido;
	private BigDecimal valorPedido;
	private int quantidadePedido;
	private BigDecimal totalPedido;

	@Id
	@GeneratedValue
	public Long getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(Long idPedido) {
		this.idPedido = idPedido;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "data_pedido", nullable = false)
	public Date getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}

	@Column(precision = 10, scale = 2)
	public BigDecimal getValorPedido() {
		return valorPedido;
	}

	public void setValorPedido(BigDecimal valorPedido) {
		this.valorPedido = valorPedido;
	}

	@Column(length = 100)
	public int getQuantidadePedido() {
		return quantidadePedido;
	}

	public void setQuantidadePedido(int quantidadePedido) {
		this.quantidadePedido = quantidadePedido;
	}

	@Column(precision = 10, scale = 2)
	public BigDecimal getTotalPedido() {
		return totalPedido;
	}

	public void setTotalPedido(BigDecimal totalPedido) {
		this.totalPedido = totalPedido;
	}

	@OneToOne(optional = false)
	@JoinColumn(name = "cliente_id")
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cliente == null) ? 0 : cliente.hashCode());
		result = prime * result + ((dataPedido == null) ? 0 : dataPedido.hashCode());
		result = prime * result + ((idPedido == null) ? 0 : idPedido.hashCode());
		result = prime * result + quantidadePedido;
		result = prime * result + ((totalPedido == null) ? 0 : totalPedido.hashCode());
		result = prime * result + ((valorPedido == null) ? 0 : valorPedido.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		if (cliente == null) {
			if (other.cliente != null)
				return false;
		} else if (!cliente.equals(other.cliente))
			return false;
		if (dataPedido == null) {
			if (other.dataPedido != null)
				return false;
		} else if (!dataPedido.equals(other.dataPedido))
			return false;
		if (idPedido == null) {
			if (other.idPedido != null)
				return false;
		} else if (!idPedido.equals(other.idPedido))
			return false;	
		if (quantidadePedido != other.quantidadePedido)
			return false;
		if (totalPedido == null) {
			if (other.totalPedido != null)
				return false;
		} else if (!totalPedido.equals(other.totalPedido))
			return false;
		if (valorPedido == null) {
			if (other.valorPedido != null)
				return false;
		} else if (!valorPedido.equals(other.valorPedido))
			return false;
		return true;
	}

	
	

}
