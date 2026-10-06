package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class prenlcol extends GXProcedure
{
   public prenlcol( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( prenlcol.class ), "" );
   }

   public prenlcol( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             int aP1 )
   {
      prenlcol.this.A396EmprCod = aP0;
      prenlcol.this.AV8FORNUMCOL = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P02G62 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8FORNUMCOL)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A309ColLin = P02G62_A309ColLin[0] ;
         A486ForNumCol = P02G62_A486ForNumCol[0] ;
         A13926ColFibra = P02G62_A13926ColFibra[0] ;
         n13926ColFibra = P02G62_n13926ColFibra[0] ;
         A6193ForClaCol = P02G62_A6193ForClaCol[0] ;
         A838TotLinCol = P02G62_A838TotLinCol[0] ;
         A481ForCan = P02G62_A481ForCan[0] ;
         A490ForPrdUMe = P02G62_A490ForPrdUMe[0] ;
         A719PrdNum = P02G62_A719PrdNum[0] ;
         W396EmprCod = A396EmprCod ;
         W486ForNumCol = A486ForNumCol ;
         AV9Collin = (short)(AV9Collin+10) ;
         /*
            INSERT RECORD ON TABLE TXPLDFORM

         */
         W396EmprCod = A396EmprCod ;
         W486ForNumCol = A486ForNumCol ;
         W309ColLin = A309ColLin ;
         W719PrdNum = A719PrdNum ;
         W490ForPrdUMe = A490ForPrdUMe ;
         W481ForCan = A481ForCan ;
         W838TotLinCol = A838TotLinCol ;
         W6193ForClaCol = A6193ForClaCol ;
         A486ForNumCol = 99999999 ;
         A309ColLin = AV9Collin ;
         /* Using cursor P02G63 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol), Short.valueOf(A309ColLin), A719PrdNum, Byte.valueOf(A490ForPrdUMe), A481ForCan, A838TotLinCol, A6193ForClaCol, Boolean.valueOf(n13926ColFibra), A13926ColFibra});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLDFORM");
         if ( (pr_default.getStatus(1) == 1) )
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
         A486ForNumCol = W486ForNumCol ;
         A309ColLin = W309ColLin ;
         A719PrdNum = W719PrdNum ;
         A490ForPrdUMe = W490ForPrdUMe ;
         A481ForCan = W481ForCan ;
         A838TotLinCol = W838TotLinCol ;
         A6193ForClaCol = W6193ForClaCol ;
         /* End Insert */
         A396EmprCod = W396EmprCod ;
         A486ForNumCol = W486ForNumCol ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      Application.commitDataStores(context, remoteHandle, pr_default, "prenlcol");
      /* Optimized DELETE. */
      /* Using cursor P02G64 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV8FORNUMCOL)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLDFORM");
      /* End optimized DELETE. */
      Application.commitDataStores(context, remoteHandle, pr_default, "prenlcol");
      /* Using cursor P02G65 */
      pr_default.execute(3, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A486ForNumCol = P02G65_A486ForNumCol[0] ;
         A13926ColFibra = P02G65_A13926ColFibra[0] ;
         n13926ColFibra = P02G65_n13926ColFibra[0] ;
         A6193ForClaCol = P02G65_A6193ForClaCol[0] ;
         A838TotLinCol = P02G65_A838TotLinCol[0] ;
         A481ForCan = P02G65_A481ForCan[0] ;
         A490ForPrdUMe = P02G65_A490ForPrdUMe[0] ;
         A719PrdNum = P02G65_A719PrdNum[0] ;
         A309ColLin = P02G65_A309ColLin[0] ;
         W396EmprCod = A396EmprCod ;
         /*
            INSERT RECORD ON TABLE TXPLDFORM

         */
         W396EmprCod = A396EmprCod ;
         W486ForNumCol = A486ForNumCol ;
         W309ColLin = A309ColLin ;
         W719PrdNum = A719PrdNum ;
         W490ForPrdUMe = A490ForPrdUMe ;
         W481ForCan = A481ForCan ;
         W838TotLinCol = A838TotLinCol ;
         W6193ForClaCol = A6193ForClaCol ;
         A486ForNumCol = AV8FORNUMCOL ;
         /* Using cursor P02G66 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol), Short.valueOf(A309ColLin), A719PrdNum, Byte.valueOf(A490ForPrdUMe), A481ForCan, A838TotLinCol, A6193ForClaCol, Boolean.valueOf(n13926ColFibra), A13926ColFibra});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLDFORM");
         if ( (pr_default.getStatus(4) == 1) )
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
         A486ForNumCol = W486ForNumCol ;
         A309ColLin = W309ColLin ;
         A719PrdNum = W719PrdNum ;
         A490ForPrdUMe = W490ForPrdUMe ;
         A481ForCan = W481ForCan ;
         A838TotLinCol = W838TotLinCol ;
         A6193ForClaCol = W6193ForClaCol ;
         /* End Insert */
         A396EmprCod = W396EmprCod ;
         pr_default.readNext(3);
      }
      pr_default.close(3);
      Application.commitDataStores(context, remoteHandle, pr_default, "prenlcol");
      /* Optimized UPDATE. */
      /* Using cursor P02G67 */
      pr_default.execute(5, new Object[] {Short.valueOf(AV9Collin), A396EmprCod, Integer.valueOf(AV8FORNUMCOL)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCDFORM");
      /* End optimized UPDATE. */
      Application.commitDataStores(context, remoteHandle, pr_default, "prenlcol");
      /* Optimized DELETE. */
      /* Using cursor P02G68 */
      pr_default.execute(6, new Object[] {A396EmprCod});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLDFORM");
      /* End optimized DELETE. */
      Application.commitDataStores(context, remoteHandle, pr_default, "prenlcol");
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "prenlcol");
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
      P02G62_A396EmprCod = new String[] {""} ;
      P02G62_A309ColLin = new short[1] ;
      P02G62_A486ForNumCol = new int[1] ;
      P02G62_A13926ColFibra = new String[] {""} ;
      P02G62_n13926ColFibra = new boolean[] {false} ;
      P02G62_A6193ForClaCol = new String[] {""} ;
      P02G62_A838TotLinCol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02G62_A481ForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02G62_A490ForPrdUMe = new byte[1] ;
      P02G62_A719PrdNum = new String[] {""} ;
      A13926ColFibra = "" ;
      A6193ForClaCol = "" ;
      A838TotLinCol = DecimalUtil.ZERO ;
      A481ForCan = DecimalUtil.ZERO ;
      A719PrdNum = "" ;
      W396EmprCod = "" ;
      W719PrdNum = "" ;
      W481ForCan = DecimalUtil.ZERO ;
      W838TotLinCol = DecimalUtil.ZERO ;
      W6193ForClaCol = "" ;
      Gx_emsg = "" ;
      P02G65_A396EmprCod = new String[] {""} ;
      P02G65_A486ForNumCol = new int[1] ;
      P02G65_A13926ColFibra = new String[] {""} ;
      P02G65_n13926ColFibra = new boolean[] {false} ;
      P02G65_A6193ForClaCol = new String[] {""} ;
      P02G65_A838TotLinCol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02G65_A481ForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02G65_A490ForPrdUMe = new byte[1] ;
      P02G65_A719PrdNum = new String[] {""} ;
      P02G65_A309ColLin = new short[1] ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.prenlcol__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.prenlcol__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.prenlcol__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.prenlcol__default(),
         new Object[] {
             new Object[] {
            P02G62_A396EmprCod, P02G62_A309ColLin, P02G62_A486ForNumCol, P02G62_A13926ColFibra, P02G62_n13926ColFibra, P02G62_A6193ForClaCol, P02G62_A838TotLinCol, P02G62_A481ForCan, P02G62_A490ForPrdUMe, P02G62_A719PrdNum
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P02G65_A396EmprCod, P02G65_A486ForNumCol, P02G65_A13926ColFibra, P02G65_n13926ColFibra, P02G65_A6193ForClaCol, P02G65_A838TotLinCol, P02G65_A481ForCan, P02G65_A490ForPrdUMe, P02G65_A719PrdNum, P02G65_A309ColLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A490ForPrdUMe ;
   private byte W490ForPrdUMe ;
   private short A309ColLin ;
   private short AV9Collin ;
   private short W309ColLin ;
   private short Gx_err ;
   private short A310ColUltLin ;
   private int AV8FORNUMCOL ;
   private int A486ForNumCol ;
   private int W486ForNumCol ;
   private int GX_INS33 ;
   private java.math.BigDecimal A838TotLinCol ;
   private java.math.BigDecimal A481ForCan ;
   private java.math.BigDecimal W481ForCan ;
   private java.math.BigDecimal W838TotLinCol ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A13926ColFibra ;
   private String A6193ForClaCol ;
   private String A719PrdNum ;
   private String W396EmprCod ;
   private String W719PrdNum ;
   private String W6193ForClaCol ;
   private String Gx_emsg ;
   private boolean n13926ColFibra ;
   private IDataStoreProvider pr_default ;
   private String[] P02G62_A396EmprCod ;
   private short[] P02G62_A309ColLin ;
   private int[] P02G62_A486ForNumCol ;
   private String[] P02G62_A13926ColFibra ;
   private boolean[] P02G62_n13926ColFibra ;
   private String[] P02G62_A6193ForClaCol ;
   private java.math.BigDecimal[] P02G62_A838TotLinCol ;
   private java.math.BigDecimal[] P02G62_A481ForCan ;
   private byte[] P02G62_A490ForPrdUMe ;
   private String[] P02G62_A719PrdNum ;
   private String[] P02G65_A396EmprCod ;
   private int[] P02G65_A486ForNumCol ;
   private String[] P02G65_A13926ColFibra ;
   private boolean[] P02G65_n13926ColFibra ;
   private String[] P02G65_A6193ForClaCol ;
   private java.math.BigDecimal[] P02G65_A838TotLinCol ;
   private java.math.BigDecimal[] P02G65_A481ForCan ;
   private byte[] P02G65_A490ForPrdUMe ;
   private String[] P02G65_A719PrdNum ;
   private short[] P02G65_A309ColLin ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class prenlcol__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
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
      }
   }

   public String getDataStoreName( )
   {
      return "VERTEX";
   }

}

final  class prenlcol__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
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
      }
   }

   public String getDataStoreName( )
   {
      return "COLORSERVICE";
   }

}

final  class prenlcol__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
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
      }
   }

   public String getDataStoreName( )
   {
      return "EKAMAT";
   }

}

final  class prenlcol__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02G62", "SELECT EmprCod, ColLin, ForNumCol, ColFibra, ForClaCol, TotLinCol, ForCan, ForPrdUMe, PrdNum FROM TXPLDFORM WHERE EmprCod = ? and ForNumCol = ? ORDER BY EmprCod, ForNumCol, ColLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02G63", "INSERT INTO TXPLDFORM(EmprCod, ForNumCol, ColLin, PrdNum, ForPrdUMe, ForCan, TotLinCol, ForClaCol, ColFibra) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLDFORM")
         ,new UpdateCursor("P02G64", "DELETE FROM TXPLDFORM  WHERE EmprCod = ? and ForNumCol = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLDFORM")
         ,new ForEachCursor("P02G65", "SELECT EmprCod, ForNumCol, ColFibra, ForClaCol, TotLinCol, ForCan, ForPrdUMe, PrdNum, ColLin FROM TXPLDFORM WHERE EmprCod = ? and ForNumCol = 99999999 ORDER BY EmprCod, ForNumCol, ColLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02G66", "INSERT INTO TXPLDFORM(EmprCod, ForNumCol, ColLin, PrdNum, ForPrdUMe, ForCan, TotLinCol, ForClaCol, ColFibra) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLDFORM")
         ,new UpdateCursor("P02G67", "UPDATE TXPCDFORM SET ColUltLin=?  WHERE EmprCod = ? and ForNumCol = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCDFORM")
         ,new UpdateCursor("P02G68", "DELETE FROM TXPLDFORM  WHERE EmprCod = ? and ForNumCol = 99999999", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLDFORM")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 16);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,5);
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 6);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 16);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,5);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 6);
               ((short[]) buf[9])[0] = rslt.getShort(9);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 6);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 5);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 2);
               stmt.setString(8, (String)parms[7], 16);
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[9], 4);
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 6);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 5);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 2);
               stmt.setString(8, (String)parms[7], 16);
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[9], 4);
               }
               return;
            case 5 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

