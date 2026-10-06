package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pgetresultsetmultiplos extends GXProcedure
{
   public pgetresultsetmultiplos( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pgetresultsetmultiplos.class ), "" );
   }

   public pgetresultsetmultiplos( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 )
   {
      pgetresultsetmultiplos.this.aP1 = new String[] {""};
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
      pgetresultsetmultiplos.this.AV15ComandoSQL = aP0;
      pgetresultsetmultiplos.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* User Code */
         AV16CompiladorIC = 2;
      AV26SelectIC = httpContext.getMessage( "S", "") ;
      AV28StringConexao = httpContext.getMessage( "jdbc:oracle:thin:@localhost:1521:ORCLCDB", "") ;
      AV18DriverClassDS = httpContext.getMessage( "oracle.jdbc.driver.OracleDriver", "") ;
      AV29UsuarioDS = httpContext.getMessage( "TEXPLUSNET", "") ;
      AV27SenhaDS = httpContext.getMessage( "TEXPLUSNET", "") ;
      /* User Code */
      	 Connection conexao;
      /* User Code */
        String strConexao = AV28StringConexao;
      /* User Code */
        String strDriver = AV18DriverClassDS;
      /* User Code */
        String strRetorno = "";
      /* User Code */
        String strRetornoErro = "";
      /* User Code */
              try {
      /* User Code */
                  Class.forName(strDriver);
      /* User Code */
                  conexao = DriverManager.getConnection(strConexao, AV29UsuarioDS, AV27SenhaDS);
      /* User Code */
                  ResultSet resultSet;
      /* User Code */
                  Statement statement = conexao.createStatement();
      /* User Code */
                  resultSet = statement.executeQuery(AV15ComandoSQL);
      /* User Code */
      			java.sql.ResultSetMetaData rsMeta = resultSet.getMetaData();
      /* User Code */
      			int columnCount = rsMeta.getColumnCount();
      /* User Code */
      			for(int x=1;x<=columnCount;x++) {
      /* User Code */
      		    	AV10AtributoDS = rsMeta.getColumnName(x);
      /* User Code */
      			    AV13AtributoTipoDS = rsMeta.getColumnTypeName(x);
      /* Execute user subroutine: 'ADICIONAATRIBUTO' */
      S131 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* User Code */
      	        }
      /* User Code */
      			while(resultSet.next()){
      /* User Code */
      				for(int y=1;y<=columnCount;y++){
      /* User Code */
      					AV11AtributoIndex = y;
      /* Execute user subroutine: 'DEFINETIPOATRIBUTO' */
      S141 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* User Code */
      						if (resultSet.getObject(rsMeta.getColumnName(y)) == null) {
      /* User Code */
      							AV14AtributoValorDS = "";
      /* User Code */
                            	} else {
      /* User Code */
      							AV14AtributoValorDS = resultSet.getString(rsMeta.getColumnName(y));
      /* User Code */
      						}
      /* Execute user subroutine: 'ADICIONAVALOR' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* User Code */
      		    	}
      /* Execute user subroutine: 'ADICIONAREGISTRO' */
      S121 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* User Code */
      	    	}
      /* User Code */
                  conexao.close();
      /* User Code */
                  resultSet.close();
      /* User Code */
              } catch (ClassNotFoundException e) {
      /* User Code */
              	strRetornoErro = "Erro -> " + e.getMessage();
      /* User Code */
              } catch (java.sql.SQLException e){
      /* User Code */
                  strRetornoErro = "Erro -> " + e.getMessage();
      /* User Code */
              }
      /* User Code */
      	AV19ErroMsgDS   = strRetornoErro;
      if ( ! (GXutil.strcmp("", AV19ErroMsgDS)==0) )
      {
         AV24Retorno = AV19ErroMsgDS ;
      }
      else
      {
         AV24Retorno = AV25SDTQueryRecordSet.toxml(false, true, "SDTQueryRecordSet", "TexplusNET") ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'ADICIONAVALOR' Routine */
      returnInSub = false ;
      AV22RegistroAtributoItem = (app.SdtSDTQueryRecordSet_RegistroItem_AtributoItem)new app.SdtSDTQueryRecordSet_RegistroItem_AtributoItem(remoteHandle, context);
      if ( AV8AtributoTipoIC == 0 )
      {
         AV22RegistroAtributoItem.setgxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_String( AV14AtributoValorDS );
      }
      else if ( AV8AtributoTipoIC == 1 )
      {
         if ( GXutil.strSearch( AV14AtributoValorDS, ".", 1) > 0 )
         {
            AV22RegistroAtributoItem.setgxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Valor( CommonUtil.decimalVal( AV14AtributoValorDS, ".") );
         }
         else
         {
            AV22RegistroAtributoItem.setgxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Valor( CommonUtil.decimalVal( AV14AtributoValorDS, ",") );
         }
      }
      else if ( AV8AtributoTipoIC == 2 )
      {
         AV22RegistroAtributoItem.setgxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Numero( GXutil.lval( AV14AtributoValorDS) );
      }
      else if ( AV8AtributoTipoIC == 3 )
      {
         AV9Ano = (short)(GXutil.lval( GXutil.substring( AV14AtributoValorDS, 1, 4))) ;
         AV20Mes = (byte)(GXutil.lval( GXutil.substring( AV14AtributoValorDS, 6, 2))) ;
         AV17Dia = (byte)(GXutil.lval( GXutil.substring( AV14AtributoValorDS, 9, 2))) ;
         AV22RegistroAtributoItem.setgxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Data( localUtil.ymdtod( AV9Ano, AV20Mes, AV17Dia) );
         if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV22RegistroAtributoItem.getgxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Data())) )
         {
            AV22RegistroAtributoItem.setgxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Data( localUtil.ctod( GXutil.substring( AV14AtributoValorDS, 1, 10), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) );
         }
      }
      else
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Valor do Atributo não identificado pelo Tipo -", "")+((app.SdtSDTQueryRecordSet_AtributoItem)AV25SDTQueryRecordSet.getgxTv_SdtSDTQueryRecordSet_Atributo().elementAt(-1+AV11AtributoIndex)).getgxTv_SdtSDTQueryRecordSet_AtributoItem_Atributods());
         AV22RegistroAtributoItem.setgxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_String( AV14AtributoValorDS );
      }
      AV23RegistroItem.getgxTv_SdtSDTQueryRecordSet_RegistroItem_Atributo().add(AV22RegistroAtributoItem, 0);
   }

   public void S121( )
   {
      /* 'ADICIONAREGISTRO' Routine */
      returnInSub = false ;
      AV25SDTQueryRecordSet.getgxTv_SdtSDTQueryRecordSet_Registro().add(AV23RegistroItem, 0);
      AV23RegistroItem = (app.SdtSDTQueryRecordSet_RegistroItem)new app.SdtSDTQueryRecordSet_RegistroItem(remoteHandle, context);
   }

   public void S131( )
   {
      /* 'ADICIONAATRIBUTO' Routine */
      returnInSub = false ;
      AV12AtributoItem = (app.SdtSDTQueryRecordSet_AtributoItem)new app.SdtSDTQueryRecordSet_AtributoItem(remoteHandle, context);
      AV12AtributoItem.setgxTv_SdtSDTQueryRecordSet_AtributoItem_Atributods( AV10AtributoDS );
      AV13AtributoTipoDS = GXutil.lower( AV13AtributoTipoDS) ;
      System.out.println( AV13AtributoTipoDS );
      if ( GXutil.strSearch( AV13AtributoTipoDS, httpContext.getMessage( ".string", ""), 1) > 0 )
      {
         AV12AtributoItem.setgxTv_SdtSDTQueryRecordSet_AtributoItem_Atributotipoic( (short)(0) );
      }
      else if ( GXutil.strSearch( AV13AtributoTipoDS, httpContext.getMessage( "varchar", ""), 1) > 0 )
      {
         AV12AtributoItem.setgxTv_SdtSDTQueryRecordSet_AtributoItem_Atributotipoic( (short)(0) );
      }
      else if ( GXutil.strSearch( AV13AtributoTipoDS, httpContext.getMessage( "char", ""), 1) > 0 )
      {
         AV12AtributoItem.setgxTv_SdtSDTQueryRecordSet_AtributoItem_Atributotipoic( (short)(0) );
      }
      else if ( GXutil.strSearch( AV13AtributoTipoDS, httpContext.getMessage( ".decimal", ""), 1) > 0 )
      {
         AV12AtributoItem.setgxTv_SdtSDTQueryRecordSet_AtributoItem_Atributotipoic( (short)(1) );
      }
      else if ( GXutil.strSearch( AV13AtributoTipoDS, httpContext.getMessage( "decimal", ""), 1) > 0 )
      {
         AV12AtributoItem.setgxTv_SdtSDTQueryRecordSet_AtributoItem_Atributotipoic( (short)(1) );
      }
      else if ( GXutil.strSearch( AV13AtributoTipoDS, httpContext.getMessage( "numeric", ""), 1) > 0 )
      {
         AV12AtributoItem.setgxTv_SdtSDTQueryRecordSet_AtributoItem_Atributotipoic( (short)(1) );
      }
      else if ( GXutil.strSearch( AV13AtributoTipoDS, httpContext.getMessage( ".double", ""), 1) > 0 )
      {
         AV12AtributoItem.setgxTv_SdtSDTQueryRecordSet_AtributoItem_Atributotipoic( (short)(1) );
      }
      else if ( GXutil.strSearch( AV13AtributoTipoDS, httpContext.getMessage( "money", ""), 1) > 0 )
      {
         AV12AtributoItem.setgxTv_SdtSDTQueryRecordSet_AtributoItem_Atributotipoic( (short)(1) );
      }
      else if ( GXutil.strSearch( AV13AtributoTipoDS, httpContext.getMessage( "smallmoney", ""), 1) > 0 )
      {
         AV12AtributoItem.setgxTv_SdtSDTQueryRecordSet_AtributoItem_Atributotipoic( (short)(1) );
      }
      else if ( GXutil.strSearch( AV13AtributoTipoDS, httpContext.getMessage( "int32", ""), 1) > 0 )
      {
         AV12AtributoItem.setgxTv_SdtSDTQueryRecordSet_AtributoItem_Atributotipoic( (short)(2) );
      }
      else if ( GXutil.strSearch( AV13AtributoTipoDS, httpContext.getMessage( "int16", ""), 1) > 0 )
      {
         AV12AtributoItem.setgxTv_SdtSDTQueryRecordSet_AtributoItem_Atributotipoic( (short)(2) );
      }
      else if ( GXutil.strSearch( AV13AtributoTipoDS, httpContext.getMessage( "byte", ""), 1) > 0 )
      {
         AV12AtributoItem.setgxTv_SdtSDTQueryRecordSet_AtributoItem_Atributotipoic( (short)(2) );
      }
      else if ( GXutil.strSearch( AV13AtributoTipoDS, httpContext.getMessage( "smallint", ""), 1) > 0 )
      {
         AV12AtributoItem.setgxTv_SdtSDTQueryRecordSet_AtributoItem_Atributotipoic( (short)(2) );
      }
      else if ( GXutil.strSearch( AV13AtributoTipoDS, httpContext.getMessage( "int", ""), 1) > 0 )
      {
         AV12AtributoItem.setgxTv_SdtSDTQueryRecordSet_AtributoItem_Atributotipoic( (short)(2) );
      }
      else if ( GXutil.strSearch( AV13AtributoTipoDS, httpContext.getMessage( "tinyint", ""), 1) > 0 )
      {
         AV12AtributoItem.setgxTv_SdtSDTQueryRecordSet_AtributoItem_Atributotipoic( (short)(2) );
      }
      else if ( GXutil.strSearch( AV13AtributoTipoDS, httpContext.getMessage( ".date", ""), 1) > 0 )
      {
         AV12AtributoItem.setgxTv_SdtSDTQueryRecordSet_AtributoItem_Atributotipoic( (short)(3) );
      }
      else if ( GXutil.strSearch( AV13AtributoTipoDS, httpContext.getMessage( "datetime", ""), 1) > 0 )
      {
         AV12AtributoItem.setgxTv_SdtSDTQueryRecordSet_AtributoItem_Atributotipoic( (short)(3) );
      }
      else if ( GXutil.strSearch( AV13AtributoTipoDS, httpContext.getMessage( "smalldatetime", ""), 1) > 0 )
      {
         AV12AtributoItem.setgxTv_SdtSDTQueryRecordSet_AtributoItem_Atributotipoic( (short)(3) );
      }
      else
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "tipo de atributo não definido (AdicionaAtributo) -", "")+AV12AtributoItem.getgxTv_SdtSDTQueryRecordSet_AtributoItem_Atributods()+httpContext.getMessage( " Tipo:", "")+AV13AtributoTipoDS);
         AV12AtributoItem.setgxTv_SdtSDTQueryRecordSet_AtributoItem_Atributotipoic( (short)(0) );
      }
      AV25SDTQueryRecordSet.getgxTv_SdtSDTQueryRecordSet_Atributo().add(AV12AtributoItem, 0);
   }

   public void S141( )
   {
      /* 'DEFINETIPOATRIBUTO' Routine */
      returnInSub = false ;
      if ( AV16CompiladorIC == 1 )
      {
         AV11AtributoIndex = (int)(AV11AtributoIndex+1) ;
      }
      AV8AtributoTipoIC = ((app.SdtSDTQueryRecordSet_AtributoItem)AV25SDTQueryRecordSet.getgxTv_SdtSDTQueryRecordSet_Atributo().elementAt(-1+AV11AtributoIndex)).getgxTv_SdtSDTQueryRecordSet_AtributoItem_Atributotipoic() ;
   }

   protected void cleanup( )
   {
      this.aP1[0] = pgetresultsetmultiplos.this.AV24Retorno;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV24Retorno = "" ;
      AV26SelectIC = "" ;
      AV28StringConexao = "" ;
      AV18DriverClassDS = "" ;
      AV29UsuarioDS = "" ;
      AV27SenhaDS = "" ;
      AV10AtributoDS = "" ;
      AV13AtributoTipoDS = "" ;
      AV14AtributoValorDS = "" ;
      AV19ErroMsgDS = "" ;
      AV25SDTQueryRecordSet = new app.SdtSDTQueryRecordSet(remoteHandle, context);
      AV22RegistroAtributoItem = new app.SdtSDTQueryRecordSet_RegistroItem_AtributoItem(remoteHandle, context);
      AV23RegistroItem = new app.SdtSDTQueryRecordSet_RegistroItem(remoteHandle, context);
      AV12AtributoItem = new app.SdtSDTQueryRecordSet_AtributoItem(remoteHandle, context);
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV20Mes ;
   private byte AV17Dia ;
   private short AV16CompiladorIC ;
   private short AV8AtributoTipoIC ;
   private short AV9Ano ;
   private short Gx_err ;
   private int AV11AtributoIndex ;
   private String AV26SelectIC ;
   private boolean returnInSub ;
   private String AV15ComandoSQL ;
   private String AV24Retorno ;
   private String AV28StringConexao ;
   private String AV18DriverClassDS ;
   private String AV29UsuarioDS ;
   private String AV27SenhaDS ;
   private String AV10AtributoDS ;
   private String AV13AtributoTipoDS ;
   private String AV14AtributoValorDS ;
   private String AV19ErroMsgDS ;
   private app.SdtSDTQueryRecordSet AV25SDTQueryRecordSet ;
   private String[] aP1 ;
   private app.SdtSDTQueryRecordSet_AtributoItem AV12AtributoItem ;
   private app.SdtSDTQueryRecordSet_RegistroItem AV23RegistroItem ;
   private app.SdtSDTQueryRecordSet_RegistroItem_AtributoItem AV22RegistroAtributoItem ;
}

