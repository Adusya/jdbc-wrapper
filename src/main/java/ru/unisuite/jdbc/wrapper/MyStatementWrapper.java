package ru.unisuite.jdbc.wrapper;

import java.sql.Connection;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.SQLWarning;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
* delegator for Statement class
* this class overrides three methods: execute, executeQuery and executeUpdate
* other methods were delegated
*/

public class MyStatementWrapper implements Statement {
		
	private Statement statement;
	
	private Logger logger = Logger.getLogger(MyStatementWrapper.class.getName());

	public MyStatementWrapper(Statement statement) {
		this.statement = statement;
	}
	
	public ResultSet executeQuery(String sql) throws SQLException {

		try {
			return statement.executeQuery(sql);
		} catch (SQLException e) {
			if (WrapperUtils.reExecutionRequired(e)) {
				logger.log(Level.WARNING, "code:" + e.getErrorCode() + ", sql state: " + e.getSQLState(), e);
				logger.log(Level.INFO, "re-executing package ");
				return statement.executeQuery(sql);
			} else
				throw e;
		}		
	}

	public int executeUpdate(String sql) throws SQLException {

		try {
			return statement.executeUpdate(sql);
		} catch (SQLException e) {
			if (WrapperUtils.reExecutionRequired(e)) {
				logger.log(Level.WARNING, "code:" + e.getErrorCode() + ", sql state: " + e.getSQLState(), e);
				logger.log(Level.INFO, "re-executing package ");
				return statement.executeUpdate(sql);
			} else
				throw e;
		}
	}
	
	public boolean execute(String sql) throws SQLException {

		try {
			return statement.execute(sql);
		} catch (SQLException e) {
			if (WrapperUtils.reExecutionRequired(e)) {
				logger.log(Level.WARNING, "code:" + e.getErrorCode() + ", sql state: " + e.getSQLState(), e);
				logger.log(Level.INFO, "re-executing package ");
				return statement.execute(sql);
			} else
				throw e;
		}

	}
	
	public int executeUpdate(String sql, int autoGeneratedKeys) throws SQLException {
		try {
			return statement.executeUpdate(sql, autoGeneratedKeys);
		} catch (SQLException e) {
			if (WrapperUtils.reExecutionRequired(e)) {
				logger.log(Level.WARNING, "code:" + e.getErrorCode() + ", sql state: " + e.getSQLState(), e);
				logger.log(Level.INFO, "re-executing package ");
				return statement.executeUpdate(sql, autoGeneratedKeys);
			} else
				throw e;
		}
	}

	public int executeUpdate(String sql, int[] columnIndexes) throws SQLException {
		try {
			return statement.executeUpdate(sql, columnIndexes);
		} catch (SQLException e) {
			if (WrapperUtils.reExecutionRequired(e)) {
				logger.log(Level.WARNING, "code:" + e.getErrorCode() + ", sql state: " + e.getSQLState(), e);
				logger.log(Level.INFO, "re-executing package ");
				return statement.executeUpdate(sql, columnIndexes);
			} else
				throw e;
		}
	}

	public int executeUpdate(String sql, String[] columnNames) throws SQLException {

		try {
			return statement.executeUpdate(sql, columnNames);
		} catch (SQLException e) {
			if (WrapperUtils.reExecutionRequired(e)) {
				logger.log(Level.WARNING, "code:" + e.getErrorCode() + ", sql state: " + e.getSQLState(), e);
				logger.log(Level.INFO, "re-executing package ");
				return statement.executeUpdate(sql, columnNames);
			} else
				throw e;
		}
	}

	public boolean execute(String sql, int autoGeneratedKeys) throws SQLException {

		try {
			return statement.execute(sql, autoGeneratedKeys);
		} catch (SQLException e) {
			if (WrapperUtils.reExecutionRequired(e)) {
				logger.log(Level.WARNING, "code:" + e.getErrorCode() + ", sql state: " + e.getSQLState(), e);
				logger.log(Level.INFO, "re-executing package ");
				return statement.execute(sql, autoGeneratedKeys);
			} else
				throw e;
		}
	}

	public boolean execute(String sql, int[] columnIndexes) throws SQLException {

		try {
			return statement.execute(sql, columnIndexes);
		} catch (SQLException e) {
			if (WrapperUtils.reExecutionRequired(e)) {
				logger.log(Level.WARNING, "code:" + e.getErrorCode() + ", sql state: " + e.getSQLState(), e);
				logger.log(Level.INFO, "re-executing package ");
				return statement.execute(sql, columnIndexes);
			} else
				throw e;
		}

	}

	public boolean execute(String sql, String[] columnNames) throws SQLException {
		try {
			return statement.execute(sql, columnNames);
		} catch (SQLException e) {
			if (WrapperUtils.reExecutionRequired(e)) {
				logger.log(Level.WARNING, "code:" + e.getErrorCode() + ", sql state: " + e.getSQLState(), e);
				logger.log(Level.INFO, "re-executing package ");
				return statement.execute(sql, columnNames);
			} else
				throw e;
		}
	}
	
	
// delegated methods below ================================================ 

	public void addBatch(String sql) throws SQLException {
		statement.addBatch(sql);
	}

	
	public <T> T unwrap(Class<T> iface) throws SQLException {
		return statement.unwrap(iface);
	}

	
	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		return statement.isWrapperFor(iface);
	}
	
	public void close() throws SQLException {
		statement.close();
	}

	
	public int getMaxFieldSize() throws SQLException {
		return statement.getMaxFieldSize();
	}

	
	public void setMaxFieldSize(int max) throws SQLException {
		statement.setMaxFieldSize(max);
	}

	
	public int getMaxRows() throws SQLException {
		return statement.getMaxRows();
	}

	
	public void setMaxRows(int max) throws SQLException {
		statement.setMaxRows(max);
	}

	
	public void setEscapeProcessing(boolean enable) throws SQLException {
		statement.setEscapeProcessing(enable);
	}

	
	public int getQueryTimeout() throws SQLException {
		return statement.getQueryTimeout();
	}

	
	public void setQueryTimeout(int seconds) throws SQLException {
		statement.setQueryTimeout(seconds);
	}

	
	public void cancel() throws SQLException {
		statement.cancel();
	}

	
	public SQLWarning getWarnings() throws SQLException {
		return statement.getWarnings();
	}

	
	public void clearWarnings() throws SQLException {
		statement.clearWarnings();
	}

	
	public void setCursorName(String name) throws SQLException {
		statement.setCursorName(name);
	}
	
	public ResultSet getResultSet() throws SQLException {
		return statement.getResultSet();
	}

	
	public int getUpdateCount() throws SQLException {
		return statement.getUpdateCount();
	}

	
	public boolean getMoreResults() throws SQLException {
		return statement.getMoreResults();
	}

	
	public void setFetchDirection(int direction) throws SQLException {
		statement.setFetchDirection(direction);
	}

	
	public int getFetchDirection() throws SQLException {
		return statement.getFetchDirection();
	}

	
	public void setFetchSize(int rows) throws SQLException {
		statement.setFetchSize(rows);
	}

	
	public int getFetchSize() throws SQLException {
		return statement.getFetchSize();
	}

	
	public int getResultSetConcurrency() throws SQLException {
		return statement.getResultSetConcurrency();
	}

	
	public int getResultSetType() throws SQLException {
		return statement.getResultSetType();
	}

	
	public void clearBatch() throws SQLException {
		statement.clearBatch();
	}

	
	public int[] executeBatch() throws SQLException {
		return statement.executeBatch();
	}

	
	public Connection getConnection() throws SQLException {
		return statement.getConnection();
	}

	
	public boolean getMoreResults(int current) throws SQLException {
		return statement.getMoreResults(current);
	}

	public ResultSet getGeneratedKeys() throws SQLException {
		return statement.getGeneratedKeys();
	}

	public int getResultSetHoldability() throws SQLException {
		return statement.getResultSetHoldability();
	}

	public boolean isClosed() throws SQLException {
		return statement.isClosed();
	}

	public void setPoolable(boolean poolable) throws SQLException {
		statement.setPoolable(poolable);
	}

	public boolean isPoolable() throws SQLException {
		return statement.isPoolable();
	}

	public void closeOnCompletion() throws SQLException {
		statement.closeOnCompletion();
	}

	public boolean isCloseOnCompletion() throws SQLException {
		return statement.isCloseOnCompletion();
	}

}
