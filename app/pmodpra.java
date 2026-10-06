package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmodpra extends GXProcedure
{
   public pmodpra( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmodpra.class ), "" );
   }

   public pmodpra( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             java.math.BigDecimal[] aP2 ,
                             String[] aP3 )
   {
      pmodpra.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        java.math.BigDecimal[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             java.math.BigDecimal[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      pmodpra.this.AV19EmprCod = aP0[0];
      this.aP0 = aP0;
      pmodpra.this.AV21PrvNum = aP1[0];
      this.aP1 = aP1;
      pmodpra.this.AV15Porcen = aP2[0];
      this.aP2 = aP2;
      pmodpra.this.AV25usurcod = aP3[0];
      this.aP3 = aP3;
      pmodpra.this.AV26station = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = (byte)(AV20Nprov) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV19EmprCod, httpContext.getMessage( "PROPRV", ""), GXv_int2) ;
      pmodpra.this.GXt_int1 = GXv_int2[0] ;
      AV20Nprov = GXt_int1 ;
      if ( (0==AV20Nprov) )
      {
         AV23Productospproveedor = (short)(0) ;
         /* Using cursor P001H2 */
         pr_default.execute(0, new Object[] {AV19EmprCod, Integer.valueOf(AV21PrvNum)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A795PrvNum = P001H2_A795PrvNum[0] ;
            A396EmprCod = P001H2_A396EmprCod[0] ;
            A724PrdPreAct = P001H2_A724PrdPreAct[0] ;
            A709PrdFecPre = P001H2_A709PrdFecPre[0] ;
            A725PrdPreAnt = P001H2_A725PrdPreAnt[0] ;
            A719PrdNum = P001H2_A719PrdNum[0] ;
            AV16PrdPreAnt = A724PrdPreAct ;
            A724PrdPreAct = GXutil.roundDecimal( A724PrdPreAct.multiply((DecimalUtil.doubleToDec(1).add((AV15Porcen.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))))), 2) ;
            A709PrdFecPre = Gx_date ;
            A725PrdPreAnt = AV16PrdPreAnt ;
            AV23Productospproveedor = (short)(AV23Productospproveedor+1) ;
            /* Using cursor P001H3 */
            pr_default.execute(1, new Object[] {A724PrdPreAct, A709PrdFecPre, A725PrdPreAnt, A396EmprCod, A719PrdNum});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
            pr_default.readNext(0);
         }
         pr_default.close(0);
         AV24inc_obs = httpContext.getMessage( "Tabla PRODUC.Proveedor ", "") + GXutil.trim( GXutil.str( AV21PrvNum, 6, 0)) + GXutil.newLine( ) ;
         AV24inc_obs += httpContext.getMessage( "Productos actualizados ", "") + GXutil.trim( GXutil.str( AV23Productospproveedor, 4, 0)) ;
         new app.pctrinc(remoteHandle, context).execute( AV19EmprCod, AV31Pgmname, AV25usurcod, AV26station, AV24inc_obs, AV21PrvNum, (byte)(0), "") ;
      }
      else
      {
         AV23Productospproveedor = (short)(0) ;
         /* Using cursor P001H4 */
         pr_default.execute(2, new Object[] {AV19EmprCod, Integer.valueOf(AV21PrvNum)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A396EmprCod = P001H4_A396EmprCod[0] ;
            A6158PrdPrv = P001H4_A6158PrdPrv[0] ;
            A7240PrdPrea = P001H4_A7240PrdPrea[0] ;
            A719PrdNum = P001H4_A719PrdNum[0] ;
            A7240PrdPrea = GXutil.roundDecimal( A7240PrdPrea.multiply((DecimalUtil.doubleToDec(1).add((AV15Porcen.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))))), 2) ;
            AV23Productospproveedor = (short)(AV23Productospproveedor+1) ;
            /* Using cursor P001H5 */
            pr_default.execute(3, new Object[] {A7240PrdPrea, A396EmprCod, A719PrdNum, Integer.valueOf(A6158PrdPrv)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPROPRV");
            pr_default.readNext(2);
         }
         pr_default.close(2);
         AV24inc_obs = httpContext.getMessage( "Tabla PROPRV.Proveedor ", "") + GXutil.trim( GXutil.str( AV21PrvNum, 6, 0)) + GXutil.newLine( ) ;
         AV24inc_obs += httpContext.getMessage( "Productos actualizados ", "") + GXutil.trim( GXutil.str( AV23Productospproveedor, 4, 0)) ;
         new app.pctrinc(remoteHandle, context).execute( AV19EmprCod, AV31Pgmname, AV25usurcod, AV26station, AV24inc_obs, AV21PrvNum, (byte)(0), "") ;
         AV23Productospproveedor = (short)(0) ;
         /* Using cursor P001H6 */
         pr_default.execute(4, new Object[] {AV19EmprCod, Integer.valueOf(AV21PrvNum)});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A795PrvNum = P001H6_A795PrvNum[0] ;
            A396EmprCod = P001H6_A396EmprCod[0] ;
            A724PrdPreAct = P001H6_A724PrdPreAct[0] ;
            A709PrdFecPre = P001H6_A709PrdFecPre[0] ;
            A725PrdPreAnt = P001H6_A725PrdPreAnt[0] ;
            A719PrdNum = P001H6_A719PrdNum[0] ;
            AV16PrdPreAnt = A724PrdPreAct ;
            A724PrdPreAct = GXutil.roundDecimal( A724PrdPreAct.multiply((DecimalUtil.doubleToDec(1).add((AV15Porcen.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))))), 2) ;
            A709PrdFecPre = Gx_date ;
            A725PrdPreAnt = AV16PrdPreAnt ;
            AV23Productospproveedor = (short)(AV23Productospproveedor+1) ;
            /* Using cursor P001H7 */
            pr_default.execute(5, new Object[] {A724PrdPreAct, A709PrdFecPre, A725PrdPreAnt, A396EmprCod, A719PrdNum});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
            pr_default.readNext(4);
         }
         pr_default.close(4);
         AV24inc_obs = httpContext.getMessage( "Tabla PRODUC.Proveedor ", "") + GXutil.trim( GXutil.str( AV21PrvNum, 6, 0)) + GXutil.newLine( ) ;
         AV24inc_obs += httpContext.getMessage( "Productos actualizados ", "") + GXutil.trim( GXutil.str( AV23Productospproveedor, 4, 0)) ;
         new app.pctrinc(remoteHandle, context).execute( AV19EmprCod, AV31Pgmname, AV25usurcod, AV26station, AV24inc_obs, AV21PrvNum, (byte)(0), "") ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmodpra.this.AV19EmprCod;
      this.aP1[0] = pmodpra.this.AV21PrvNum;
      this.aP2[0] = pmodpra.this.AV15Porcen;
      this.aP3[0] = pmodpra.this.AV25usurcod;
      this.aP4[0] = pmodpra.this.AV26station;
      Application.commitDataStores(context, remoteHandle, pr_default, "pmodpra");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int2 = new byte[1] ;
      scmdbuf = "" ;
      P001H2_A795PrvNum = new int[1] ;
      P001H2_A396EmprCod = new String[] {""} ;
      P001H2_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001H2_A709PrdFecPre = new java.util.Date[] {GXutil.nullDate()} ;
      P001H2_A725PrdPreAnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001H2_A719PrdNum = new String[] {""} ;
      A396EmprCod = "" ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A709PrdFecPre = GXutil.nullDate() ;
      A725PrdPreAnt = DecimalUtil.ZERO ;
      A719PrdNum = "" ;
      AV16PrdPreAnt = DecimalUtil.ZERO ;
      Gx_date = GXutil.nullDate() ;
      AV24inc_obs = "" ;
      AV31Pgmname = "" ;
      P001H4_A396EmprCod = new String[] {""} ;
      P001H4_A6158PrdPrv = new int[1] ;
      P001H4_A7240PrdPrea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001H4_A719PrdNum = new String[] {""} ;
      A7240PrdPrea = DecimalUtil.ZERO ;
      P001H6_A795PrvNum = new int[1] ;
      P001H6_A396EmprCod = new String[] {""} ;
      P001H6_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001H6_A709PrdFecPre = new java.util.Date[] {GXutil.nullDate()} ;
      P001H6_A725PrdPreAnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001H6_A719PrdNum = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmodpra__default(),
         new Object[] {
             new Object[] {
            P001H2_A795PrvNum, P001H2_A396EmprCod, P001H2_A724PrdPreAct, P001H2_A709PrdFecPre, P001H2_A725PrdPreAnt, P001H2_A719PrdNum
            }
            , new Object[] {
            }
            , new Object[] {
            P001H4_A396EmprCod, P001H4_A6158PrdPrv, P001H4_A7240PrdPrea, P001H4_A719PrdNum
            }
            , new Object[] {
            }
            , new Object[] {
            P001H6_A795PrvNum, P001H6_A396EmprCod, P001H6_A724PrdPreAct, P001H6_A709PrdFecPre, P001H6_A725PrdPreAnt, P001H6_A719PrdNum
            }
            , new Object[] {
            }
         }
      );
      AV31Pgmname = "PMODPRA" ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      AV31Pgmname = "PMODPRA" ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private short AV20Nprov ;
   private short AV23Productospproveedor ;
   private short Gx_err ;
   private int AV21PrvNum ;
   private int A795PrvNum ;
   private int A6158PrdPrv ;
   private java.math.BigDecimal AV15Porcen ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A725PrdPreAnt ;
   private java.math.BigDecimal AV16PrdPreAnt ;
   private java.math.BigDecimal A7240PrdPrea ;
   private String AV19EmprCod ;
   private String AV25usurcod ;
   private String AV26station ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String AV31Pgmname ;
   private java.util.Date A709PrdFecPre ;
   private java.util.Date Gx_date ;
   private String AV24inc_obs ;
   private String[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private java.math.BigDecimal[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private int[] P001H2_A795PrvNum ;
   private String[] P001H2_A396EmprCod ;
   private java.math.BigDecimal[] P001H2_A724PrdPreAct ;
   private java.util.Date[] P001H2_A709PrdFecPre ;
   private java.math.BigDecimal[] P001H2_A725PrdPreAnt ;
   private String[] P001H2_A719PrdNum ;
   private String[] P001H4_A396EmprCod ;
   private int[] P001H4_A6158PrdPrv ;
   private java.math.BigDecimal[] P001H4_A7240PrdPrea ;
   private String[] P001H4_A719PrdNum ;
   private int[] P001H6_A795PrvNum ;
   private String[] P001H6_A396EmprCod ;
   private java.math.BigDecimal[] P001H6_A724PrdPreAct ;
   private java.util.Date[] P001H6_A709PrdFecPre ;
   private java.math.BigDecimal[] P001H6_A725PrdPreAnt ;
   private String[] P001H6_A719PrdNum ;
}

final  class pmodpra__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P001H2", "SELECT PrvNum, EmprCod, PrdPreAct, PrdFecPre, PrdPreAnt, PrdNum FROM TXPPRODUC WHERE EmprCod = ? and PrvNum = ? ORDER BY EmprCod, PrvNum ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P001H3", "UPDATE TXPPRODUC SET PrdPreAct=?, PrdFecPre=?, PrdPreAnt=?  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRODUC")
         ,new ForEachCursor("P001H4", "SELECT EmprCod, PrdPrv, PrdPrea, PrdNum FROM TXPPROPRV WHERE EmprCod = ? and PrdPrv = ? ORDER BY EmprCod, PrdPrv ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P001H5", "UPDATE TXPPROPRV SET PrdPrea=?  WHERE EmprCod = ? AND PrdNum = ? AND PrdPrv = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPROPRV")
         ,new ForEachCursor("P001H6", "SELECT PrvNum, EmprCod, PrdPreAct, PrdFecPre, PrdPreAnt, PrdNum FROM TXPPRODUC WHERE EmprCod = ? and PrvNum = ? ORDER BY EmprCod, PrvNum ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P001H7", "UPDATE TXPPRODUC SET PrdPreAct=?, PrdFecPre=?, PrdPreAnt=?  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRODUC")
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
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
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
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 5);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 5);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setString(5, (String)parms[4], 6);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 5);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 5);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 5);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setString(5, (String)parms[4], 6);
               return;
      }
   }

}

