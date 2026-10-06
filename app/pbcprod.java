package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbcprod extends GXProcedure
{
   public pbcprod( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbcprod.class ), "" );
   }

   public pbcprod( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      pbcprod.this.aP1 = new String[] {""};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 )
   {
      pbcprod.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbcprod.this.A719PrdNum = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P06162 */
      pr_default.execute(0, new Object[] {A396EmprCod, A719PrdNum});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A795PrvNum = P06162_A795PrvNum[0] ;
         A718PrdNom = P06162_A718PrdNom[0] ;
         A724PrdPreAct = P06162_A724PrdPreAct[0] ;
         A742PrdUniCom = P06162_A742PrdUniCom[0] ;
         A793PrvNif = P06162_A793PrvNif[0] ;
         n793PrvNif = P06162_n793PrvNif[0] ;
         A856ValCod = P06162_A856ValCod[0] ;
         A3936PrdEqLP = P06162_A3936PrdEqLP[0] ;
         A793PrvNif = P06162_A793PrvNif[0] ;
         n793PrvNif = P06162_n793PrvNif[0] ;
         W396EmprCod = A396EmprCod ;
         /*
            INSERT RECORD ON TABLE PRODUCTO

         */
         W396EmprCod = A396EmprCod ;
         A13478BCProducto = A719PrdNum ;
         A13479BCDescripc = A718PrdNom ;
         n13479BCDescripc = false ;
         A13480BCPrecio = A724PrdPreAct ;
         n13480BCPrecio = false ;
         A13481BCUndComp = (short)(((A742PrdUniCom==3) ? 2 : A742PrdUniCom)) ;
         n13481BCUndComp = false ;
         A13482BCProveedo = ((GXutil.strcmp("", A793PrvNif)==0) ? httpContext.getMessage( "NO NIF", "") : A793PrvNif) ;
         n13482BCProveedo = false ;
         A13483BCProcesad = (short)(0) ;
         n13483BCProcesad = false ;
         A13484BCError = (short)(0) ;
         n13484BCError = false ;
         A13485BCDescErro = " " ;
         n13485BCDescErro = false ;
         A13487BCPilaErro = " " ;
         n13487BCPilaErro = false ;
         A13486BCFechErro = GXutil.resetTime( GXutil.nullDate() );
         n13486BCFechErro = false ;
         /* Using cursor P06163 */
         pr_ekamat.execute(0, new Object[] {A396EmprCod, A13478BCProducto, Boolean.valueOf(n13479BCDescripc), A13479BCDescripc, Boolean.valueOf(n13480BCPrecio), A13480BCPrecio, Boolean.valueOf(n13481BCUndComp), Short.valueOf(A13481BCUndComp), Boolean.valueOf(n13482BCProveedo), A13482BCProveedo, Boolean.valueOf(n13483BCProcesad), Short.valueOf(A13483BCProcesad), Boolean.valueOf(n13484BCError), Short.valueOf(A13484BCError), Boolean.valueOf(n13485BCDescErro), A13485BCDescErro, Boolean.valueOf(n13486BCFechErro), A13486BCFechErro, Boolean.valueOf(n13487BCPilaErro), A13487BCPilaErro});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("Producto");
         if ( (pr_ekamat.getStatus(0) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         A396EmprCod = W396EmprCod ;
         /* End Insert */
         A3936PrdEqLP = httpContext.getMessage( "BC", "") ;
         /* Using cursor P06164 */
         pr_default.execute(1, new Object[] {A3936PrdEqLP, A396EmprCod, A719PrdNum});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
         A396EmprCod = W396EmprCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbcprod.this.A396EmprCod;
      this.aP1[0] = pbcprod.this.A719PrdNum;
      Application.commitDataStores(context, remoteHandle, pr_default, "pbcprod");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P06162_A795PrvNum = new int[1] ;
      P06162_A396EmprCod = new String[] {""} ;
      P06162_A719PrdNum = new String[] {""} ;
      P06162_A718PrdNom = new String[] {""} ;
      P06162_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06162_A742PrdUniCom = new byte[1] ;
      P06162_A793PrvNif = new String[] {""} ;
      P06162_n793PrvNif = new boolean[] {false} ;
      P06162_A856ValCod = new byte[1] ;
      P06162_A3936PrdEqLP = new String[] {""} ;
      A718PrdNom = "" ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A793PrvNif = "" ;
      A3936PrdEqLP = "" ;
      W396EmprCod = "" ;
      A13478BCProducto = "" ;
      A13479BCDescripc = "" ;
      A13480BCPrecio = DecimalUtil.ZERO ;
      A13482BCProveedo = "" ;
      A13485BCDescErro = "" ;
      A13487BCPilaErro = "" ;
      A13486BCFechErro = GXutil.resetTime( GXutil.nullDate() );
      Gx_emsg = "" ;
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.pbcprod__ekamat(),
         new Object[] {
             new Object[] {
            }
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbcprod__default(),
         new Object[] {
             new Object[] {
            P06162_A795PrvNum, P06162_A396EmprCod, P06162_A719PrdNum, P06162_A718PrdNom, P06162_A724PrdPreAct, P06162_A742PrdUniCom, P06162_A793PrvNif, P06162_n793PrvNif, P06162_A856ValCod, P06162_A3936PrdEqLP
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A742PrdUniCom ;
   private byte A856ValCod ;
   private short A13481BCUndComp ;
   private short A13483BCProcesad ;
   private short A13484BCError ;
   private short Gx_err ;
   private int A795PrvNum ;
   private int GX_INS1844 ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A13480BCPrecio ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String scmdbuf ;
   private String A718PrdNom ;
   private String A793PrvNif ;
   private String A3936PrdEqLP ;
   private String W396EmprCod ;
   private String A13478BCProducto ;
   private String A13479BCDescripc ;
   private String A13482BCProveedo ;
   private String Gx_emsg ;
   private java.util.Date A13486BCFechErro ;
   private boolean n793PrvNif ;
   private boolean n13479BCDescripc ;
   private boolean n13480BCPrecio ;
   private boolean n13481BCUndComp ;
   private boolean n13482BCProveedo ;
   private boolean n13483BCProcesad ;
   private boolean n13484BCError ;
   private boolean n13485BCDescErro ;
   private boolean n13487BCPilaErro ;
   private boolean n13486BCFechErro ;
   private String A13485BCDescErro ;
   private String A13487BCPilaErro ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private int[] P06162_A795PrvNum ;
   private String[] P06162_A396EmprCod ;
   private String[] P06162_A719PrdNum ;
   private String[] P06162_A718PrdNom ;
   private java.math.BigDecimal[] P06162_A724PrdPreAct ;
   private byte[] P06162_A742PrdUniCom ;
   private String[] P06162_A793PrvNif ;
   private boolean[] P06162_n793PrvNif ;
   private byte[] P06162_A856ValCod ;
   private String[] P06162_A3936PrdEqLP ;
   private IDataStoreProvider pr_ekamat ;
}

final  class pbcprod__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P06163", "INSERT INTO [Producto]([Emprcod], [Producto], [Descripción], [Precio], [Unidad Compra], [Proveedor], [Procesado], [Error], [Descripción error], [Fecha y hora error], [Pila error]) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK)
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 26);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[5], 5);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[7]).shortValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[9], 20);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[11]).shortValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[13]).shortValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[15], 200);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(10, (java.util.Date)parms[17], false);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[19], 200);
               }
               return;
      }
   }

   public String getDataStoreName( )
   {
      return "EKAMAT";
   }

}

final  class pbcprod__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06162", "SELECT T1.PrvNum, T1.EmprCod, T1.PrdNum, T1.PrdNom, T1.PrdPreAct, T1.PrdUniCom, T2.PrvNif, T1.ValCod, T1.PrdEqLP FROM (TXPPRODUC T1 INNER JOIN TXPPRVGEN T2 ON T2.EmprCod = T1.EmprCod AND T2.PrvNum = T1.PrvNum) WHERE (T1.EmprCod = ? and T1.PrdNum = ?) AND (T1.ValCod = 1) ORDER BY T1.EmprCod, T1.PrdNum ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P06164", "UPDATE TXPPRODUC SET PrdEqLP=?  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRODUC")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 20);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 6);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               return;
      }
   }

}

