package com.prueba.pedidos.model;


import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "pedidos")
public class Pedido {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull
    @Basic(optional = false)
    @Column(name = "id_pedidos")
    private Integer idPedidos;
    @Size(min = 1, max = 45)
    @Column(name = "estadopedido")
    private String estadopedido;
    @Basic(optional = true)
    @Column(name = "fecha_pedido")
    @CreationTimestamp
    private Date fechaPedido;
    @Column(name = "Cantidad")
    private Integer cantidad;
    @Column(name = "Cantidad1")
    private Integer cantidad1;
    @Column(name = "Cantidad2")
    private Integer cantidad2;
    @Column(name = "Cantidad3")
    private Integer cantidad3;
    @Column(name = "Cantidad4")
    private Integer cantidad4;
    @JoinColumn(name = "Productos_id_producto", referencedColumnName = "id_producto")
    @ManyToOne(optional = true)
    private Producto productosidproducto;
    @JoinColumn(name = "Productos_id_producto1", referencedColumnName = "id_producto")
    @ManyToOne(optional = true)
    private Producto productosidproducto1;
    @JoinColumn(name = "Productos_id_producto2", referencedColumnName = "id_producto")
    @ManyToOne(optional = true)
    private Producto productosidproducto2;
    @JoinColumn(name = "Productos_id_producto3", referencedColumnName = "id_producto")
    @ManyToOne(optional = true)
    private Producto productosidproducto3;
    @JoinColumn(name = "Productos_id_producto4", referencedColumnName = "id_producto")
    @ManyToOne(optional = true)
    private Producto productosidproducto4;
    @JoinColumn(name = "Proveedores_id_proveedor", referencedColumnName = "id_proveedor")
    @ManyToOne(optional = true)
    private Proveedor proveedoresidproveedor;
	
    public Integer getIdPedidos() {
		return idPedidos;
	}
	public void setIdPedidos(Integer idPedidos) {
		this.idPedidos = idPedidos;
	}
	public String getEstadopedido() {
		return estadopedido;
	}
	public void setEstadopedido(String estadopedido) {
		this.estadopedido = estadopedido;
	}
	public Date getFechaPedido() {
		return fechaPedido;
	}
	public void setFechaPedido(Date fechaPedido) {
		this.fechaPedido = fechaPedido;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public Integer getCantidad1() {
		return cantidad1;
	}
	public void setCantidad1(Integer cantidad1) {
		this.cantidad1 = cantidad1;
	}
	public Integer getCantidad2() {
		return cantidad2;
	}
	public void setCantidad2(Integer cantidad2) {
		this.cantidad2 = cantidad2;
	}
	public Integer getCantidad3() {
		return cantidad3;
	}
	public void setCantidad3(Integer cantidad3) {
		this.cantidad3 = cantidad3;
	}
	public Integer getCantidad4() {
		return cantidad4;
	}
	public void setCantidad4(Integer cantidad4) {
		this.cantidad4 = cantidad4;
	}
	public Producto getProductosidproducto() {
		return productosidproducto;
	}
	public void setProductosidproducto(Producto productosidproducto) {
		this.productosidproducto = productosidproducto;
	}
	public Producto getProductosidproducto1() {
		return productosidproducto1;
	}
	public void setProductosidproducto1(Producto productosidproducto1) {
		this.productosidproducto1 = productosidproducto1;
	}
	public Producto getProductosidproducto2() {
		return productosidproducto2;
	}
	public void setProductosidproducto2(Producto productosidproducto2) {
		this.productosidproducto2 = productosidproducto2;
	}
	public Producto getProductosidproducto3() {
		return productosidproducto3;
	}
	public void setProductosidproducto3(Producto productosidproducto3) {
		this.productosidproducto3 = productosidproducto3;
	}
	public Producto getProductosidproducto4() {
		return productosidproducto4;
	}
	public void setProductosidproducto4(Producto productosidproducto4) {
		this.productosidproducto4 = productosidproducto4;
	}
	public Proveedor getProveedoresidproveedor() {
		return proveedoresidproveedor;
	}
	public void setProveedoresidproveedor(Proveedor proveedoresidproveedor) {
		this.proveedoresidproveedor = proveedoresidproveedor;
	}
}
