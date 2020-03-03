package Application;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import db.DbException;

public class Programa {

	public static void main(String[] args) {
		
		Connection conn = null;
		Statement st = null;
		
		try {
			
			conn = DB.getConnection();
			
			conn.setAutoCommit(false);
			
			st = conn.createStatement();
			
			String query1 = "UPDATE seller SET basesalary = 2090 where departmentid = 1";
			String query2 = "UPDATE seller SET basesalary = 4090 where departmentid = 2";

			int rows1 = st.executeUpdate(query1);
			/*
			int x = 1;
			
			if (x < 2) {
				throw new SQLException("Fake error");
			}
			*/
			int rows2 = st.executeUpdate(query2);
			
			conn.commit();
			
			System.out.println("Rowns1 " + rows1);
			System.out.println("Rowns2 " + rows2);
			
		} catch (SQLException e) {
			try {
				conn.rollback();
				throw new DbException("ERRO## Transação não realizada, erro causado por : " + e.getMessage());
			} catch (SQLException e1) {
				throw new DbException("Erro ao tentar realizar o rollback, erro ocasionado por : " + e.getMessage());
			}
		}finally {
			DB.closeStatement(st);
			DB.getConnection();
		}

	}

}

