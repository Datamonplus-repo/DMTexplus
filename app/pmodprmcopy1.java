package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmodprmcopy1 extends GXProcedure
{
   public pmodprmcopy1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmodprmcopy1.class ), "" );
   }

   public pmodprmcopy1( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             java.util.Date[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             String[] aP6 )
   {
      pmodprmcopy1.this.aP7 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        java.util.Date[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             java.util.Date[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 )
   {
      pmodprmcopy1.this.AV11emprcod = aP0[0];
      this.aP0 = aP0;
      pmodprmcopy1.this.AV13prdprv = aP1[0];
      this.aP1 = aP1;
      pmodprmcopy1.this.AV12prdnum = aP2[0];
      this.aP2 = aP2;
      pmodprmcopy1.this.AV8Precio = aP3[0];
      this.aP3 = aP3;
      pmodprmcopy1.this.AV9FecPre = aP4[0];
      this.aP4 = aP4;
      pmodprmcopy1.this.AV10PrdPreAnt = aP5[0];
      this.aP5 = aP5;
      pmodprmcopy1.this.AV14usurcod = aP6[0];
      this.aP6 = aP6;
      pmodprmcopy1.this.AV15station = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV16Inc_obs = "" ;
      /* Using cursor P09RW2 */
      pr_default.execute(0, new Object[] {AV11emprcod, AV12prdnum, Integer.valueOf(AV13prdprv)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A6158PrdPrv = P09RW2_A6158PrdPrv[0] ;
         A719PrdNum = P09RW2_A719PrdNum[0] ;
         A396EmprCod = P09RW2_A396EmprCod[0] ;
         A7240PrdPrea = P09RW2_A7240PrdPrea[0] ;
         AV16Inc_obs = httpContext.getMessage( "Cambio en PROPRV.", "") + GXutil.newLine( ) ;
         AV16Inc_obs += httpContext.getMessage( "Proveedor ", "") + GXutil.trim( GXutil.str( AV13prdprv, 6, 0)) + GXutil.newLine( ) ;
         AV16Inc_obs += httpContext.getMessage( "Producto  ", "") + AV12prdnum + GXutil.newLine( ) ;
         AV16Inc_obs += httpContext.getMessage( "Precio old ", "") + GXutil.trim( GXutil.str( A7240PrdPrea, 14, 5)) + httpContext.getMessage( " Precio new ", "") + GXutil.trim( GXutil.str( AV8Precio, 14, 5)) + GXutil.newLine( ) ;
         A7240PrdPrea = AV8Precio ;
         /* Using cursor P09RW3 */
         pr_default.execute(1, new Object[] {A7240PrdPrea, A396EmprCod, A719PrdNum, Integer.valueOf(A6158PrdPrv)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPROPRV");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( ! (GXutil.strcmp("", AV16Inc_obs)==0) )
      {
         new app.pctrinc(remoteHandle, context).execute( AV11emprcod, AV20Pgmname, AV14usurcod, AV15station, AV16Inc_obs, 123456, (byte)(0), "") ;
      }
      AV16Inc_obs = "" ;
      /* Using cursor P09RW4 */
      pr_default.execute(2, new Object[] {AV11emprcod, AV12prdnum, Integer.valueOf(AV13prdprv)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A795PrvNum = P09RW4_A795PrvNum[0] ;
         A719PrdNum = P09RW4_A719PrdNum[0] ;
         A396EmprCod = P09RW4_A396EmprCod[0] ;
         A724PrdPreAct = P09RW4_A724PrdPreAct[0] ;
         A725PrdPreAnt = P09RW4_A725PrdPreAnt[0] ;
         A709PrdFecPre = P09RW4_A709PrdFecPre[0] ;
         AV16Inc_obs = httpContext.getMessage( "Cambio en PRODUC. Proveedor Actual", "") + GXutil.newLine( ) ;
         AV16Inc_obs += httpContext.getMessage( "Proveedor ", "") + GXutil.trim( GXutil.str( AV13prdprv, 6, 0)) + GXutil.newLine( ) ;
         AV16Inc_obs += httpContext.getMessage( "Producto  ", "") + AV12prdnum + GXutil.newLine( ) ;
         AV16Inc_obs += httpContext.getMessage( "Precio actual old ", "") + GXutil.trim( GXutil.str( A724PrdPreAct, 14, 5)) + httpContext.getMessage( " Precio actual new ", "") + GXutil.trim( GXutil.str( AV8Precio, 14, 5)) + GXutil.newLine( ) ;
         AV16Inc_obs += httpContext.getMessage( "Precio anterior old ", "") + GXutil.trim( GXutil.str( A725PrdPreAnt, 14, 5)) + httpContext.getMessage( " Precio anterior new ", "") + GXutil.trim( GXutil.str( A724PrdPreAct, 14, 5)) + GXutil.newLine( ) ;
         A725PrdPreAnt = A724PrdPreAct ;
         A724PrdPreAct = AV8Precio ;
         A709PrdFecPre = AV9FecPre ;
         /* Using cursor P09RW5 */
         pr_default.execute(3, new Object[] {A724PrdPreAct, A725PrdPreAnt, A709PrdFecPre, A396EmprCod, A719PrdNum});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      if ( ! (GXutil.strcmp("", AV16Inc_obs)==0) )
      {
         new app.pctrinc(remoteHandle, context).execute( AV11emprcod, AV20Pgmname, AV14usurcod, AV15station, AV16Inc_obs, 123456, (byte)(0), "") ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmodprmcopy1.this.AV11emprcod;
      this.aP1[0] = pmodprmcopy1.this.AV13prdprv;
      this.aP2[0] = pmodprmcopy1.this.AV12prdnum;
      this.aP3[0] = pmodprmcopy1.this.AV8Precio;
      this.aP4[0] = pmodprmcopy1.this.AV9FecPre;
      this.aP5[0] = pmodprmcopy1.this.AV10PrdPreAnt;
      this.aP6[0] = pmodprmcopy1.this.AV14usurcod;
      this.aP7[0] = pmodprmcopy1.this.AV15station;
      Application.commitDataStores(context, remoteHandle, pr_default, "pmodprmcopy1");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV16Inc_obs = "" ;
      scmdbuf = "" ;
      P09RW2_A6158PrdPrv = new int[1] ;
      P09RW2_A719PrdNum = new String[] {""} ;
      P09RW2_A396EmprCod = new String[] {""} ;
      P09RW2_A7240PrdPrea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A719PrdNum = "" ;
      A396EmprCod = "" ;
      A7240PrdPrea = DecimalUtil.ZERO ;
      AV20Pgmname = "" ;
      P09RW4_A795PrvNum = new int[1] ;
      P09RW4_A719PrdNum = new String[] {""} ;
      P09RW4_A396EmprCod = new String[] {""} ;
      P09RW4_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09RW4_A725PrdPreAnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09RW4_A709PrdFecPre = new java.util.Date[] {GXutil.nullDate()} ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A725PrdPreAnt = DecimalUtil.ZERO ;
      A709PrdFecPre = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmodprmcopy1__default(),
         new Object[] {
             new Object[] {
            P09RW2_A6158PrdPrv, P09RW2_A719PrdNum, P09RW2_A396EmprCod, P09RW2_A7240PrdPrea
            }
            , new Object[] {
            }
            , new Object[] {
            P09RW4_A795PrvNum, P09RW4_A719PrdNum, P09RW4_A396EmprCod, P09RW4_A724PrdPreAct, P09RW4_A725PrdPreAnt, P09RW4_A709PrdFecPre
            }
            , new Object[] {
            }
         }
      );
      AV20Pgmname = "PMODPRMCopy1" ;
      /* GeneXus formulas. */
      AV20Pgmname = "PMODPRMCopy1" ;
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV13prdprv ;
   private int A6158PrdPrv ;
   private int A795PrvNum ;
   private java.math.BigDecimal AV8Precio ;
   private java.math.BigDecimal AV10PrdPreAnt ;
   private java.math.BigDecimal A7240PrdPrea ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A725PrdPreAnt ;
   private String AV11emprcod ;
   private String AV12prdnum ;
   private String AV14usurcod ;
   private String AV15station ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A396EmprCod ;
   private String AV20Pgmname ;
   private java.util.Date AV9FecPre ;
   private java.util.Date A709PrdFecPre ;
   private String AV16Inc_obs ;
   private String[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private java.math.BigDecimal[] aP3 ;
   private java.util.Date[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private String[] aP6 ;
   private IDataStoreProvider pr_default ;
   private int[] P09RW2_A6158PrdPrv ;
   private String[] P09RW2_A719PrdNum ;
   private String[] P09RW2_A396EmprCod ;
   private java.math.BigDecimal[] P09RW2_A7240PrdPrea ;
   private int[] P09RW4_A795PrvNum ;
   private String[] P09RW4_A719PrdNum ;
   private String[] P09RW4_A396EmprCod ;
   private java.math.BigDecimal[] P09RW4_A724PrdPreAct ;
   private java.math.BigDecimal[] P09RW4_A725PrdPreAnt ;
   private java.util.Date[] P09RW4_A709PrdFecPre ;
}

final  class pmodprmcopy1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09RW2", "SELECT PrdPrv, PrdNum, EmprCod, PrdPrea FROM TXPPROPRV WHERE EmprCod = ? and PrdNum = ? and PrdPrv = ? ORDER BY EmprCod, PrdNum, PrdPrv ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P09RW3", "UPDATE TXPPROPRV SET PrdPrea=?  WHERE EmprCod = ? AND PrdNum = ? AND PrdPrv = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPROPRV")
         ,new ForEachCursor("P09RW4", "SELECT PrvNum, PrdNum, EmprCod, PrdPreAct, PrdPreAnt, PrdFecPre FROM TXPPRODUC WHERE (EmprCod = ? and PrdNum = ?) AND (PrvNum = ?) ORDER BY EmprCod, PrdNum ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P09RW5", "UPDATE TXPPRODUC SET PrdPreAct=?, PrdPreAnt=?, PrdFecPre=?  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRODUC")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
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
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 1 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 5);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 3 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 5);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 5);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setString(5, (String)parms[4], 6);
               return;
      }
   }

}

