package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdltlmetpi extends GXProcedure
{
   public pdltlmetpi( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdltlmetpi.class ), "" );
   }

   public pdltlmetpi( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 ,
                             java.util.Date[] aP6 ,
                             String[] aP7 )
   {
      pdltlmetpi.this.aP8 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        String[] aP5 ,
                        java.util.Date[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 ,
                             java.util.Date[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 )
   {
      pdltlmetpi.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdltlmetpi.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pdltlmetpi.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pdltlmetpi.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pdltlmetpi.this.AV8BarOrdlin = aP4[0];
      this.aP4 = aP4;
      pdltlmetpi.this.AV9Maqcod = aP5[0];
      this.aP5 = aP5;
      pdltlmetpi.this.AV12Hisprofec = aP6[0];
      this.aP6 = aP6;
      pdltlmetpi.this.AV10Usurcod = aP7[0];
      this.aP7 = aP7;
      pdltlmetpi.this.AV11station = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV18Var1 = A396EmprCod + AV9Maqcod + localUtil.dtoc( AV12Hisprofec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + GXutil.str( AV8BarOrdlin, 8, 0) ;
      GX_I = 1 ;
      while ( GX_I <= 10000 )
      {
         AV21Tab_pz[GX_I-1] = " " ;
         GX_I = (int)(GX_I+1) ;
      }
      AV22i = 1 ;
      /* Using cursor P05PZ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4917MetPieObs = P05PZ2_A4917MetPieObs[0] ;
         A2815MetPieMet = P05PZ2_A2815MetPieMet[0] ;
         A2813MetPieCod = P05PZ2_A2813MetPieCod[0] ;
         A2809MetTerCod = P05PZ2_A2809MetTerCod[0] ;
         AV19Var2 = GXutil.gxgetmli( A4917MetPieObs, (short)(1), (short)(200)) ;
         if ( GXutil.strcmp(AV18Var1, AV19Var2) == 0 )
         {
            AV21Tab_pz[AV22i-1] = A2813MetPieCod + GXutil.str( A2815MetPieMet, 9, 2) ;
            AV22i = (int)(AV22i+1) ;
            /* Using cursor P05PZ3 */
            pr_default.execute(1, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMETPI");
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV22i = 1 ;
      while ( AV22i <= 10000 )
      {
         if ( GXutil.strcmp(AV21Tab_pz[AV22i-1], " ") == 0 )
         {
            if (true) break;
         }
         AV23MetPieCod = GXutil.substring( AV21Tab_pz[AV22i-1], 1, 9) ;
         AV24MetPieMet = CommonUtil.decimalVal( GXutil.substring( AV21Tab_pz[AV22i-1], 10, 9), ".") ;
         AV13Inc_obs = httpContext.getMessage( "Eliminacion Rollos, Maquina ", "") + AV9Maqcod + httpContext.getMessage( " Orden ", "") + GXutil.str( AV8BarOrdlin, 4, 0) + httpContext.getMessage( " Dia ", "") + localUtil.dtoc( AV12Hisprofec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + GXutil.newLine( ) ;
         AV13Inc_obs += httpContext.getMessage( "Rollo N ", "") + AV23MetPieCod + GXutil.newLine( ) ;
         AV13Inc_obs += httpContext.getMessage( "Metros  ", "") + GXutil.str( AV24MetPieMet, 9, 2) + GXutil.newLine( ) ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV28Pgmname, AV10Usurcod, AV11station, AV13Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         AV22i = (int)(AV22i+1) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdltlmetpi.this.A396EmprCod;
      this.aP1[0] = pdltlmetpi.this.A129BarCod;
      this.aP2[0] = pdltlmetpi.this.A132BarCodReo;
      this.aP3[0] = pdltlmetpi.this.A130BarCodPar;
      this.aP4[0] = pdltlmetpi.this.AV8BarOrdlin;
      this.aP5[0] = pdltlmetpi.this.AV9Maqcod;
      this.aP6[0] = pdltlmetpi.this.AV12Hisprofec;
      this.aP7[0] = pdltlmetpi.this.AV10Usurcod;
      this.aP8[0] = pdltlmetpi.this.AV11station;
      Application.commitDataStores(context, remoteHandle, pr_default, "pdltlmetpi");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV18Var1 = "" ;
      AV21Tab_pz = new String[10000] ;
      GX_I = 1 ;
      while ( GX_I <= 10000 )
      {
         AV21Tab_pz[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      scmdbuf = "" ;
      P05PZ2_A396EmprCod = new String[] {""} ;
      P05PZ2_A129BarCod = new int[1] ;
      P05PZ2_A132BarCodReo = new byte[1] ;
      P05PZ2_A130BarCodPar = new String[] {""} ;
      P05PZ2_A4917MetPieObs = new String[] {""} ;
      P05PZ2_A2815MetPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05PZ2_A2813MetPieCod = new String[] {""} ;
      P05PZ2_A2809MetTerCod = new String[] {""} ;
      A4917MetPieObs = "" ;
      A2815MetPieMet = DecimalUtil.ZERO ;
      A2813MetPieCod = "" ;
      A2809MetTerCod = "" ;
      AV19Var2 = "" ;
      AV23MetPieCod = "" ;
      AV24MetPieMet = DecimalUtil.ZERO ;
      AV13Inc_obs = "" ;
      AV28Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdltlmetpi__default(),
         new Object[] {
             new Object[] {
            P05PZ2_A396EmprCod, P05PZ2_A129BarCod, P05PZ2_A132BarCodReo, P05PZ2_A130BarCodPar, P05PZ2_A4917MetPieObs, P05PZ2_A2815MetPieMet, P05PZ2_A2813MetPieCod, P05PZ2_A2809MetTerCod
            }
            , new Object[] {
            }
         }
      );
      AV28Pgmname = "PDLTLmetpi" ;
      /* GeneXus formulas. */
      AV28Pgmname = "PDLTLmetpi" ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short AV8BarOrdlin ;
   private short Gx_err ;
   private int A129BarCod ;
   private int GX_I ;
   private int AV22i ;
   private java.math.BigDecimal A2815MetPieMet ;
   private java.math.BigDecimal AV24MetPieMet ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV9Maqcod ;
   private String AV10Usurcod ;
   private String AV11station ;
   private String AV21Tab_pz[] ;
   private String scmdbuf ;
   private String A2813MetPieCod ;
   private String A2809MetTerCod ;
   private String AV23MetPieCod ;
   private String AV28Pgmname ;
   private java.util.Date AV12Hisprofec ;
   private String AV18Var1 ;
   private String A4917MetPieObs ;
   private String AV19Var2 ;
   private String AV13Inc_obs ;
   private String[] aP8 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private String[] aP5 ;
   private java.util.Date[] aP6 ;
   private String[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P05PZ2_A396EmprCod ;
   private int[] P05PZ2_A129BarCod ;
   private byte[] P05PZ2_A132BarCodReo ;
   private String[] P05PZ2_A130BarCodPar ;
   private String[] P05PZ2_A4917MetPieObs ;
   private java.math.BigDecimal[] P05PZ2_A2815MetPieMet ;
   private String[] P05PZ2_A2813MetPieCod ;
   private String[] P05PZ2_A2809MetTerCod ;
}

final  class pdltlmetpi__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05PZ2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, MetPieObs, MetPieMet, MetPieCod, MetTerCod FROM TXPLMETPI WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05PZ3", "DELETE FROM TXPLMETPI  WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MetPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLMETPI")
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getString(7, 9);
               ((String[]) buf[7])[0] = rslt.getString(8, 10);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
      }
   }

}

