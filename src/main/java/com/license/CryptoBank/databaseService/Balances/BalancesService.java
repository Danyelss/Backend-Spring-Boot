package com.license.CryptoBank.databaseService.Balances;

import com.license.CryptoBank.databaseEntities.Balances;

import java.util.List;

public interface BalancesService {
    Balances saveBalance(Balances Balances);

    Balances getBalanceByUsername(String username);

    List<Balances> getBalances();

    void saveETH_TransactionLogsToUsername(String username, String log);
    void saveFIAT_TransactionLogsToUsername(String username, String log);

}
