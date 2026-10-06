package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pgetresultset extends GXProcedure
{
   public pgetresultset( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pgetresultset.class ), "" );
   }

   public pgetresultset( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 )
   {
      pgetresultset.this.aP1 = new String[] {""};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             String[] aP1 )
   {
      pgetresultset.this.AV8ComandoSQL = aP0;
      pgetresultset.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* User Code */
         AV9CompiladorIC = 2;
      AV13SelectIC = httpContext.getMessage( "S", "") ;
      AV15StringConexao = httpContext.getMessage( "jdbc:oracle:thin:@localhost:1521:ORCLCDB", "") ;
      AV10DriverClassDS = httpContext.getMessage( "oracle.jdbc.driver.OracleDriver", "") ;
      AV16UsuarioDS = httpContext.getMessage( "TEXPLUSNET", "") ;
      AV14SenhaDS = httpContext.getMessage( "TEXPLUSNET", "") ;
      /* User Code */
              java.sql.Connection objConexao;
      /* User Code */
              String strComandoSql = AV8ComandoSQL;
      /* User Code */
              String strSelectIC = AV13SelectIC;
      /* User Code */
              String strConexao = AV15StringConexao;
      /* User Code */
              String strDriver = AV10DriverClassDS;
      /* User Code */
              String strRetorno = "";
      /* User Code */
              String strRetornoErro = "";
      /* User Code */
              try {
      /* User Code */
                  Class.forName(strDriver);
      /* User Code */
                  objConexao = java.sql.DriverManager.getConnection(strConexao, AV16UsuarioDS, AV14SenhaDS);
      /* User Code */
                  java.sql.ResultSet objRs;
      /* User Code */
                  java.sql.Statement objStmt = objConexao.createStatement();
      /* User Code */
                  if(strComandoSql.trim().toLowerCase().contains("select")) {
      /* User Code */
                  if (strSelectIC == "S") {
      /* User Code */
                      objRs = objStmt.executeQuery(strComandoSql);
      /* User Code */
                      if(objRs.wasNull()) {
      /* User Code */
                          strRetorno = "";
      /* User Code */
                      } else {
      /* User Code */
                          while (objRs.next()) {
      /* User Code */
      							if (objRs.getObject(1) == null) {
      /* User Code */
      								    strRetorno = "";
      /* User Code */
                                      } else {
      /* User Code */
      								strRetorno = objRs.getObject(1).toString();
      /* User Code */
      							}
      /* User Code */
                          }
      /* User Code */
                      }
      /* User Code */
      				objRs.close();
      /* User Code */
                   }
      /* User Code */
                  } else {
      /* User Code */
                      int intLinhasAfetadas = objStmt.executeUpdate(strComandoSql);
      /* User Code */
                      strRetorno = intLinhasAfetadas + " linhas afetadas!";
      /* User Code */
                  }
      /* User Code */
                  objConexao.close();
      /* User Code */
              } catch (java.lang.ClassNotFoundException ex) {
      /* User Code */
                  strRetornoErro = "Erro -> " + ex.getMessage();
      /* User Code */
              } catch (java.sql.SQLException ex){
      /* User Code */
                  strRetornoErro = "Erro -> " + ex.getMessage();
      /* User Code */
              }
      /* User Code */
              AV11ErroMsgDS   = strRetornoErro;
      /* User Code */
              AV12Retorno = strRetorno;
      if ( ! (GXutil.strcmp("", AV11ErroMsgDS)==0) )
      {
         AV12Retorno = AV11ErroMsgDS ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = pgetresultset.this.AV12Retorno;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV12Retorno = "" ;
      AV13SelectIC = "" ;
      AV15StringConexao = "" ;
      AV10DriverClassDS = "" ;
      AV16UsuarioDS = "" ;
      AV14SenhaDS = "" ;
      AV11ErroMsgDS = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV9CompiladorIC ;
   private short Gx_err ;
   private String AV13SelectIC ;
   private String AV8ComandoSQL ;
   private String AV12Retorno ;
   private String AV15StringConexao ;
   private String AV10DriverClassDS ;
   private String AV16UsuarioDS ;
   private String AV14SenhaDS ;
   private String AV11ErroMsgDS ;
   private String[] aP1 ;
}

