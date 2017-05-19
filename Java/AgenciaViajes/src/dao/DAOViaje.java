package dao;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import db.DB;
import modelos.Viaje;

public class DAOViaje {

	public ArrayList<Viaje> listar (){
		
		ArrayList<Viaje> lista=new ArrayList<Viaje>();
		
		String sql="select * from viajes order by nombre_destino asc";
		
		try(Connection con=DB.getConexion();Statement stm=con.createStatement();
				ResultSet rs=stm.executeQuery(sql);){
			
			while(rs.next()){
				Viaje v=new Viaje(rs.getInt("id"), rs.getString("nombre_destino"),
									rs.getInt("duracion_viaje"),rs.getDouble("precio_persona"));
				lista.add(v);
			}
			
			rs.close();
			
		}catch(SQLException sqle){
			sqle.printStackTrace();
		}
		return lista;
	}
	
	public ArrayList<Viaje> buscar(String buscar_palabra){
		ArrayList<Viaje> lista=new ArrayList<Viaje>();
	
	String sql="select * from viajes where nombre_destino like ?";
	
	
	try(Connection con=DB.getConexion();PreparedStatement ps=con.prepareStatement(sql);){
		
		ps.setString(1, "%"+buscar_palabra+"%");
		ResultSet rs=ps.executeQuery();
		
		while(rs.next()){
			Viaje v=new Viaje(rs.getInt("id"), rs.getString("nombre_destino"),
					rs.getInt("duracion_viaje"), rs.getDouble("precio_persona"));
				lista.add(v);	
		}
		rs.close();
	}
	
	catch(SQLException sqle){
		sqle.printStackTrace();
	}
	return lista;
	}
	
	public Viaje getViaje(int id){
		
		Viaje v=null;
		
		String sql="select nombre_destino,duracion_viaje,precio_persona form viajes where id=?";
	
		try(Connection con=DB.getConexion();PreparedStatement ps=con.prepareStatement(sql);){
			
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()){
				
				v=new Viaje(id, rs.getString("nombre_destino"),
						rs.getInt("duracion_viaje"), rs.getDouble("precio_persona"));		
			}
			rs.close();
		}
		catch(SQLException sqle){
			sqle.printStackTrace();
		}
		
		return v;
	}
}
		
		
		
		
		
		