package ru.unisuite.jdbc.wrapper;

import java.net.URL;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.ResultSet;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.ResultSetMetaData;
import java.sql.RowId;
import java.sql.Array;
import java.io.InputStream;
import java.math.BigDecimal;
import java.io.Reader;
import java.sql.Date;
import java.sql.NClob;
import java.sql.ParameterMetaData;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Ref;
import java.sql.Time;
import java.sql.Timestamp;

/**
* delegator for PreparedStatement class
*/

public class MyPreparedStatementWrapper extends MyStatementWrapper implements PreparedStatement {

	private PreparedStatement preparedStatement;
	
	private Logger logger = Logger.getLogger(MyPreparedStatementWrapper.class.getName());

	public MyPreparedStatementWrapper(PreparedStatement preparedStatement) {
		super(preparedStatement);
		this.preparedStatement = preparedStatement;
	}

	public ParameterMetaData getParameterMetaData() throws SQLException {
		return preparedStatement.getParameterMetaData();
	}

	 
	public ResultSet executeQuery(String sql) throws SQLException {

		try {
			return preparedStatement.executeQuery(sql);
		} catch (SQLException e) {
			if (WrapperUtils.reExecutionRequired(e)) {
				logger.log(Level.WARNING, "code:" + e.getErrorCode() + ", sql state: " + e.getSQLState(), e);
				logger.log(Level.INFO, "re-executing package ");
				return preparedStatement.executeQuery(sql);
			} else
				throw e;
		}
	}

	@Override
	public int executeUpdate(String sql) throws SQLException {
		try {
			return preparedStatement.executeUpdate(sql);
		} catch (SQLException e) {
			if (WrapperUtils.reExecutionRequired(e)) {
				logger.log(Level.WARNING, "code:" + e.getErrorCode() + ", sql state: " + e.getSQLState(), e);
				logger.log(Level.INFO, "re-executing package ");
				return preparedStatement.executeUpdate(sql);
			} else
				throw e;
		}
	}

	@Override
	public void close() throws SQLException {
		preparedStatement.close();
	}

	@Override
	public int getMaxFieldSize() throws SQLException {
		return preparedStatement.getMaxFieldSize();
	}

	@Override
	public void setMaxFieldSize(int max) throws SQLException {
		preparedStatement.setMaxFieldSize(max);
	}

	@Override
	public int getMaxRows() throws SQLException {
		return preparedStatement.getMaxRows();
	}

	@Override
	public void setMaxRows(int max) throws SQLException {
		preparedStatement.setMaxRows(max);
	}

	@Override
	public void setEscapeProcessing(boolean enable) throws SQLException {
		preparedStatement.setEscapeProcessing(enable);
	}

	@Override
	public int getQueryTimeout() throws SQLException {
		return preparedStatement.getQueryTimeout();
	}

	@Override
	public void setQueryTimeout(int seconds) throws SQLException {
		preparedStatement.setQueryTimeout(seconds);
	}

	@Override
	public void cancel() throws SQLException {
		preparedStatement.cancel();
	}

	@Override
	public SQLWarning getWarnings() throws SQLException {
		return preparedStatement.getWarnings();
	}

	@Override
	public void clearWarnings() throws SQLException {
		preparedStatement.clearWarnings();
	}

	@Override
	public void setCursorName(String name) throws SQLException {
		preparedStatement.setCursorName(name);
	}

	@Override
	public boolean execute(String sql) throws SQLException {
		try {
			return preparedStatement.execute(sql);
		} catch (SQLException e) {
			if (WrapperUtils.reExecutionRequired(e)) {
				logger.log(Level.WARNING, "code:" + e.getErrorCode() + ", sql state: " + e.getSQLState(), e);
				logger.log(Level.INFO, "re-executing package ");
				return preparedStatement.execute(sql);
			} else
				throw e;
		}
	}

	@Override
	public ResultSet getResultSet() throws SQLException {
		return preparedStatement.getResultSet();
	}

	@Override
	public int getUpdateCount() throws SQLException {
		return preparedStatement.getUpdateCount();
	}

	@Override
	public boolean getMoreResults() throws SQLException {
		return preparedStatement.getMoreResults();
	}

	@Override
	public void setFetchDirection(int direction) throws SQLException {
		preparedStatement.setFetchDirection(direction);
	}

	@Override
	public int getFetchDirection() throws SQLException {
		return preparedStatement.getFetchDirection();
	}

	@Override
	public void setFetchSize(int rows) throws SQLException {
		preparedStatement.setFetchSize(rows);
	}

	@Override
	public int getFetchSize() throws SQLException {
		return preparedStatement.getFetchSize();
	}

	@Override
	public int getResultSetConcurrency() throws SQLException {
		return preparedStatement.getResultSetConcurrency();
	}

	@Override
	public int getResultSetType() throws SQLException {
		return preparedStatement.getResultSetType();
	}

	@Override
	public void clearBatch() throws SQLException {
		preparedStatement.clearBatch();
	}

	@Override
	public int[] executeBatch() throws SQLException {
		return preparedStatement.executeBatch();
	}

	@Override
	public Connection getConnection() throws SQLException {
		return preparedStatement.getConnection();
	}

	@Override
	public boolean getMoreResults(int current) throws SQLException {
		return preparedStatement.getMoreResults(current);
	}

	@Override
	public ResultSet getGeneratedKeys() throws SQLException {
		return preparedStatement.getGeneratedKeys();
	}

	@Override
	public int executeUpdate(String sql, int autoGeneratedKeys) throws SQLException {
		try {
			return preparedStatement.executeUpdate(sql, autoGeneratedKeys);
		} catch (SQLException e) {
			if (WrapperUtils.reExecutionRequired(e)) {
				logger.log(Level.WARNING, "code:" + e.getErrorCode() + ", sql state: " + e.getSQLState(), e);
				logger.log(Level.INFO, "re-executing package ");
				return preparedStatement.executeUpdate(sql, autoGeneratedKeys);
			} else
				throw e;
		}
	}

	@Override
	public int executeUpdate(String sql, int[] columnIndexes) throws SQLException {
		try {
			return preparedStatement.executeUpdate(sql, columnIndexes);
		} catch (SQLException e) {
			if (WrapperUtils.reExecutionRequired(e)) {
				logger.log(Level.WARNING, "code:" + e.getErrorCode() + ", sql state: " + e.getSQLState(), e);
				logger.log(Level.INFO, "re-executing package ");
				return preparedStatement.executeUpdate(sql, columnIndexes);
			} else
				throw e;
		}
	}

	@Override
	public int executeUpdate(String sql, String[] columnNames) throws SQLException {
		try {
			return preparedStatement.executeUpdate(sql, columnNames);
		} catch (SQLException e) {
			if (WrapperUtils.reExecutionRequired(e)) {
				logger.log(Level.WARNING, "code:" + e.getErrorCode() + ", sql state: " + e.getSQLState(), e);
				logger.log(Level.INFO, "re-executing package ");
				return preparedStatement.executeUpdate(sql, columnNames);
			} else
				throw e;
		}
	}

	@Override
	public boolean execute(String sql, int autoGeneratedKeys) throws SQLException {
		try {
			return preparedStatement.execute(sql, autoGeneratedKeys);
		} catch (SQLException e) {
			if (WrapperUtils.reExecutionRequired(e)) {
				logger.log(Level.WARNING, "code:" + e.getErrorCode() + ", sql state: " + e.getSQLState(), e);
				logger.log(Level.INFO, "re-executing package ");
				return preparedStatement.execute(sql, autoGeneratedKeys);
			} else
				throw e;
		}
	}

	@Override
	public boolean execute(String sql, int[] columnIndexes) throws SQLException {
		try {
			return preparedStatement.execute(sql, columnIndexes);
		} catch (SQLException e) {
			if (WrapperUtils.reExecutionRequired(e)) {
				logger.log(Level.WARNING, "code:" + e.getErrorCode() + ", sql state: " + e.getSQLState(), e);
				logger.log(Level.INFO, "re-executing package ");
				return preparedStatement.execute(sql, columnIndexes);
			} else
				throw e;
		}
	}

	@Override
	public boolean execute(String sql, String[] columnNames) throws SQLException {
		try {
			return preparedStatement.execute(sql, columnNames);
		} catch (SQLException e) {
			if (WrapperUtils.reExecutionRequired(e)) {
				logger.log(Level.WARNING, "code:" + e.getErrorCode() + ", sql state: " + e.getSQLState(), e);
				logger.log(Level.INFO, "re-executing package ");
				return preparedStatement.execute(sql, columnNames);
			} else
				throw e;
		}
	}

	@Override
	public int getResultSetHoldability() throws SQLException {
		return preparedStatement.getResultSetHoldability();
	}

	@Override
	public boolean isClosed() throws SQLException {
		return preparedStatement.isClosed();
	}

	@Override
	public void setPoolable(boolean poolable) throws SQLException {
		preparedStatement.setPoolable(poolable);
	}

	@Override
	public boolean isPoolable() throws SQLException {
		return preparedStatement.isPoolable();
	}

	@Override
	public void closeOnCompletion() throws SQLException {
		preparedStatement.closeOnCompletion();
	}

	@Override
	public boolean isCloseOnCompletion() throws SQLException {
		return preparedStatement.isCloseOnCompletion();
	}

	@Override
	public <T> T unwrap(Class<T> iface) throws SQLException {
		return preparedStatement.unwrap(iface);
	}

	@Override
	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		return preparedStatement.isWrapperFor(iface);
	}

	public ResultSet executeQuery() throws SQLException {
		try {
			return preparedStatement.executeQuery();
		} catch (SQLException e) {
			if (WrapperUtils.reExecutionRequired(e)) {
				logger.log(Level.WARNING, "code:" + e.getErrorCode() + ", sql state: " + e.getSQLState(), e);
				logger.log(Level.INFO, "re-executing package ");
				return preparedStatement.executeQuery();
			} else
				throw e;
		}
	}

	 
	public int executeUpdate() throws SQLException {
		try {
			return preparedStatement.executeUpdate();
		} catch (SQLException e) {
			if (WrapperUtils.reExecutionRequired(e)) {
				logger.log(Level.WARNING, "code:" + e.getErrorCode() + ", sql state: " + e.getSQLState(), e);
				logger.log(Level.INFO, "re-executing package ");
				return preparedStatement.executeUpdate();
			} else
				throw e;
		}
	}

	 
	public void setNull(int parameterIndex, int sqlType) throws SQLException {
		preparedStatement.setNull(parameterIndex, sqlType);
	}

	 
	public void setBoolean(int parameterIndex, boolean x) throws SQLException {
		preparedStatement.setBoolean(parameterIndex, x);
	}

	 
	public void setByte(int parameterIndex, byte x) throws SQLException {
		preparedStatement.setByte(parameterIndex, x);
	}

	 
	public void setShort(int parameterIndex, short x) throws SQLException {
		preparedStatement.setShort(parameterIndex, x);
	}

	 
	public void setInt(int parameterIndex, int x) throws SQLException {
		preparedStatement.setInt(parameterIndex, x);
	}

	 
	public void setLong(int parameterIndex, long x) throws SQLException {
		preparedStatement.setLong(parameterIndex, x);
	}

	 
	public void setFloat(int parameterIndex, float x) throws SQLException {
		preparedStatement.setFloat(parameterIndex, x);
	}

	 
	public void setDouble(int parameterIndex, double x) throws SQLException {
		preparedStatement.setDouble(parameterIndex, x);
	}

	 
	public void setBigDecimal(int parameterIndex, BigDecimal x) throws SQLException {
		preparedStatement.setBigDecimal(parameterIndex, x);
	}

	 
	public void setString(int parameterIndex, String x) throws SQLException {
		preparedStatement.setString(parameterIndex, x);
	}

	 
	public void setBytes(int parameterIndex, byte[] x) throws SQLException {
		preparedStatement.setBytes(parameterIndex, x);
	}

	 
	public void setDate(int parameterIndex, Date x) throws SQLException {
		preparedStatement.setDate(parameterIndex, x);
	}

	 
	public void setTime(int parameterIndex, Time x) throws SQLException {
		preparedStatement.setTime(parameterIndex, x);
	}

	 
	public void setTimestamp(int parameterIndex, Timestamp x) throws SQLException {
		preparedStatement.setTimestamp(parameterIndex, x);
	}

	 
	public void setAsciiStream(int parameterIndex, InputStream x, int length) throws SQLException {
		preparedStatement.setAsciiStream(parameterIndex, x, length);
	}

	 
	public void setUnicodeStream(int parameterIndex, InputStream x, int length) throws SQLException {
		preparedStatement.setUnicodeStream(parameterIndex, x, length);
	}

	 
	public void setBinaryStream(int parameterIndex, InputStream x, int length) throws SQLException {
		preparedStatement.setBinaryStream(parameterIndex, x, length);
	}

	 
	public void clearParameters() throws SQLException {
		preparedStatement.clearParameters();
	}

	 
	public void setObject(int parameterIndex, Object x, int targetSqlType) throws SQLException {
		preparedStatement.setObject(parameterIndex, x, targetSqlType);
	}

	 
	public void setObject(int parameterIndex, Object x) throws SQLException {
		preparedStatement.setObject(parameterIndex, x);
	}

	 
	public boolean execute() throws SQLException {
		try {
			return preparedStatement.execute();
		} catch (SQLException e) {
			if (WrapperUtils.reExecutionRequired(e)) {
				logger.log(Level.WARNING, "code:" + e.getErrorCode() + ", sql state: " + e.getSQLState(), e);
				logger.log(Level.INFO, "re-executing package ");
				return preparedStatement.execute();
			} else
				throw e;
		}
	}

	 
	public void addBatch() throws SQLException {
		preparedStatement.addBatch();
	}

	 
	public void setCharacterStream(int parameterIndex, Reader reader, int length) throws SQLException {
		preparedStatement.setCharacterStream(parameterIndex, reader, length);
	}

	 
	public void setRef(int parameterIndex, Ref x) throws SQLException {
		preparedStatement.setRef(parameterIndex, x);
	}

	 
	public void setBlob(int parameterIndex, Blob x) throws SQLException {
		preparedStatement.setBlob(parameterIndex, x);
	}

	 
	public void setClob(int parameterIndex, Clob x) throws SQLException {
		preparedStatement.setClob(parameterIndex, x);
	}

	 
	public void setArray(int parameterIndex, Array x) throws SQLException {
		preparedStatement.setArray(parameterIndex, x);
	}

	 
	public ResultSetMetaData getMetaData() throws SQLException {
		return preparedStatement.getMetaData();
	}

	 
	public void setDate(int parameterIndex, Date x, Calendar cal) throws SQLException {
		preparedStatement.setDate(parameterIndex, x, cal);
	}

	 
	public void setTime(int parameterIndex, Time x, Calendar cal) throws SQLException {
		preparedStatement.setTime(parameterIndex, x, cal);
	}

	 
	public void setTimestamp(int parameterIndex, Timestamp x, Calendar cal) throws SQLException {
		preparedStatement.setTimestamp(parameterIndex, x, cal);
	}

	 
	public void setNull(int parameterIndex, int sqlType, String typeName) throws SQLException {
		preparedStatement.setNull(parameterIndex, sqlType, typeName);
	}

	 
	public void setURL(int parameterIndex, URL x) throws SQLException {
		preparedStatement.setURL(parameterIndex, x);
	}

	 
	public void setRowId(int parameterIndex, RowId x) throws SQLException {
		preparedStatement.setRowId(parameterIndex, x);
	}

	 
	public void setNString(int parameterIndex, String value) throws SQLException {
		preparedStatement.setNString(parameterIndex, value);
	}

	 
	public void setNCharacterStream(int parameterIndex, Reader value, long length) throws SQLException {
		preparedStatement.setNCharacterStream(parameterIndex, value, length);
	}

	 
	public void setNClob(int parameterIndex, NClob value) throws SQLException {
		preparedStatement.setNClob(parameterIndex, value);
	}

	 
	public void setClob(int parameterIndex, Reader reader, long length) throws SQLException {
		preparedStatement.setClob(parameterIndex, reader, length);
	}

	 
	public void setBlob(int parameterIndex, InputStream inputStream, long length) throws SQLException {
		preparedStatement.setBlob(parameterIndex, inputStream, length);
	}

	 
	public void setNClob(int parameterIndex, Reader reader, long length) throws SQLException {
		preparedStatement.setNClob(parameterIndex, reader, length);
	}

	 
	public void setSQLXML(int parameterIndex, SQLXML xmlObject) throws SQLException {
		preparedStatement.setSQLXML(parameterIndex, xmlObject);
	}

	 
	public void setObject(int parameterIndex, Object x, int targetSqlType, int scaleOrLength) throws SQLException {
		preparedStatement.setObject(parameterIndex, x, targetSqlType, scaleOrLength);
	}

	 
	public void setAsciiStream(int parameterIndex, InputStream x, long length) throws SQLException {
		preparedStatement.setAsciiStream(parameterIndex, x, length);
	}

	 
	public void setBinaryStream(int parameterIndex, InputStream x, long length) throws SQLException {
		preparedStatement.setBinaryStream(parameterIndex, x, length);
	}

	 
	public void setCharacterStream(int parameterIndex, Reader reader, long length) throws SQLException {
		preparedStatement.setCharacterStream(parameterIndex, reader, length);
	}

	 
	public void setAsciiStream(int parameterIndex, InputStream x) throws SQLException {
		preparedStatement.setAsciiStream(parameterIndex, x);
	}

	 
	public void setBinaryStream(int parameterIndex, InputStream x) throws SQLException {
		preparedStatement.setBinaryStream(parameterIndex, x);
	}

	 
	public void setCharacterStream(int parameterIndex, Reader reader) throws SQLException {
		preparedStatement.setCharacterStream(parameterIndex, reader);
	}

	 
	public void setNCharacterStream(int parameterIndex, Reader value) throws SQLException {
		preparedStatement.setNCharacterStream(parameterIndex, value);
	}

	 
	public void setClob(int parameterIndex, Reader reader) throws SQLException {
		preparedStatement.setClob(parameterIndex, reader);
	}

	 
	public void setBlob(int parameterIndex, InputStream inputStream) throws SQLException {
		preparedStatement.setBlob(parameterIndex, inputStream);
	}

	 
	public void setNClob(int parameterIndex, Reader reader) throws SQLException {
		preparedStatement.setNClob(parameterIndex, reader);
	}

}
