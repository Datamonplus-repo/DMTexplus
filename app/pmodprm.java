package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmodprm extends GXProcedure
{
   public pmodprm( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmodprm.class ), "" );
   }

   public pmodprm( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             java.math.BigDecimal[] aP2 ,
                             java.util.Date[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             String[] aP5 )
   {
      pmodprm.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        java.math.BigDecimal[] aP2 ,
                        java.util.Date[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             java.math.BigDecimal[] aP2 ,
                             java.util.Date[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 )
   {
      pmodprm.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmodprm.this.A719PrdNum = aP1[0];
      this.aP1 = aP1;
      pmodprm.this.AV15Precio = aP2[0];
      this.aP2 = aP2;
      pmodprm.this.AV16FecPre = aP3[0];
      this.aP3 = aP3;
      pmodprm.this.AV17PrdPreAnt = aP4[0];
      this.aP4 = aP4;
      pmodprm.this.AV19usurcod = aP5[0];
      this.aP5 = aP5;
      pmodprm.this.AV20station = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV18Inc_obs = "" ;
      /* Using cursor P001G2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A719PrdNum});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A724PrdPreAct = P001G2_A724PrdPreAct[0] ;
         A725PrdPreAnt = P001G2_A725PrdPreAnt[0] ;
         A709PrdFecPre = P001G2_A709PrdFecPre[0] ;
         AV18Inc_obs = httpContext.getMessage( "Cambio en PRODUC. Proveedor Actual", "") + GXutil.newLine( ) ;
         AV18Inc_obs += httpContext.getMessage( "Proveedor ", "") + GXutil.trim( GXutil.str( AV21prdprv, 6, 0)) + GXutil.newLine( ) ;
         AV18Inc_obs += httpContext.getMessage( "Producto  ", "") + AV22prdnum + GXutil.newLine( ) ;
         AV18Inc_obs += httpContext.getMessage( "Precio actual old ", "") + GXutil.trim( GXutil.str( A724PrdPreAct, 14, 5)) + httpContext.getMessage( " Precio actual new ", "") + GXutil.trim( GXutil.str( AV15Precio, 14, 5)) + GXutil.newLine( ) ;
         AV18Inc_obs += httpContext.getMessage( "Precio anterior old ", "") + GXutil.trim( GXutil.str( A725PrdPreAnt, 14, 5)) + httpContext.getMessage( " Precio anterior new ", "") + GXutil.trim( GXutil.str( A724PrdPreAct, 14, 5)) + GXutil.newLine( ) ;
         A725PrdPreAnt = A724PrdPreAct ;
         A724PrdPreAct = AV15Precio ;
         A709PrdFecPre = AV16FecPre ;
         /* Using cursor P001G3 */
         pr_default.execute(1, new Object[] {A724PrdPreAct, A725PrdPreAnt, A709PrdFecPre, A396EmprCod, A719PrdNum});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( ! (GXutil.strcmp("", AV18Inc_obs)==0) )
      {
         new app.pctrinc(remoteHandle, context).execute( AV23emprcod, AV27Pgmname, AV19usurcod, AV20station, AV18Inc_obs, 123456, (byte)(0), "") ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmodprm.this.A396EmprCod;
      this.aP1[0] = pmodprm.this.A719PrdNum;
      this.aP2[0] = pmodprm.this.AV15Precio;
      this.aP3[0] = pmodprm.this.AV16FecPre;
      this.aP4[0] = pmodprm.this.AV17PrdPreAnt;
      this.aP5[0] = pmodprm.this.AV19usurcod;
      this.aP6[0] = pmodprm.this.AV20station;
      Application.commitDataStores(context, remoteHandle, pr_default, "pmodprm");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV18Inc_obs = "" ;
      scmdbuf = "" ;
      P001G2_A396EmprCod = new String[] {""} ;
      P001G2_A719PrdNum = new String[] {""} ;
      P001G2_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001G2_A725PrdPreAnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001G2_A709PrdFecPre = new java.util.Date[] {GXutil.nullDate()} ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A725PrdPreAnt = DecimalUtil.ZERO ;
      A709PrdFecPre = GXutil.nullDate() ;
      AV22prdnum = "" ;
      AV23emprcod = "" ;
      AV27Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmodprm__default(),
         new Object[] {
             new Object[] {
            P001G2_A396EmprCod, P001G2_A719PrdNum, P001G2_A724PrdPreAct, P001G2_A725PrdPreAnt, P001G2_A709PrdFecPre
            }
            , new Object[] {
            }
         }
      );
      AV27Pgmname = "PMODPRM" ;
      /* GeneXus formulas. */
      AV27Pgmname = "PMODPRM" ;
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV21prdprv ;
   private java.math.BigDecimal AV15Precio ;
   private java.math.BigDecimal AV17PrdPreAnt ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A725PrdPreAnt ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String AV19usurcod ;
   private String AV20station ;
   private String scmdbuf ;
   private String AV22prdnum ;
   private String AV23emprcod ;
   private String AV27Pgmname ;
   private java.util.Date AV16FecPre ;
   private java.util.Date A709PrdFecPre ;
   private String AV18Inc_obs ;
   private String[] aP6 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private java.math.BigDecimal[] aP2 ;
   private java.util.Date[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P001G2_A396EmprCod ;
   private String[] P001G2_A719PrdNum ;
   private java.math.BigDecimal[] P001G2_A724PrdPreAct ;
   private java.math.BigDecimal[] P001G2_A725PrdPreAnt ;
   private java.util.Date[] P001G2_A709PrdFecPre ;
}

final  class pmodprm__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P001G2", "SELECT EmprCod, PrdNum, PrdPreAct, PrdPreAnt, PrdFecPre FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P001G3", "UPDATE TXPPRODUC SET PrdPreAct=?, PrdPreAnt=?, PrdFecPre=?  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRODUC")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
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
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 5);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 5);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setString(5, (String)parms[4], 6);
               return;
      }
   }

}

