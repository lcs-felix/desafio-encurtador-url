package com.deveficiente.desafioencurtadorlink;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.stereotype.Component;

@Component
public class TransactionProxy {

	
	@Transactional(value = TxType.REQUIRES_NEW)
	public void executeInNewTransaction(Runnable runnable) {
		runnable.run();
	}

	@Transactional(value = TxType.NEVER)
	public void executeInNewTransactionMandatory(Runnable runnable) {
		System.out.println("=============>  aqui");
		runnable.run();
	}

}
