package br.com.caelum.financas.teste;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.util.JPAUtil;

public class TesteConsultaFuncaoMax {
	public static void main(String[] args) {
		EntityManager manager = new JPAUtil().getEntityManager();
	    Conta conta = manager.find(Conta.class, 2);//id 2 deve existir no banco
	    
	    Query query = manager.createQuery("select max(m.valor) from Movimentacao m where m.conta = :pConta");
	}
}
