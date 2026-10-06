package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmodpie extends GXProcedure
{
   public pmodpie( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmodpie.class ), "" );
   }

   public pmodpie( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             byte[] aP9 ,
                             byte[] aP10 ,
                             java.math.BigDecimal[] aP11 ,
                             java.math.BigDecimal[] aP12 )
   {
      pmodpie.this.aP13 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
      return aP13[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        java.math.BigDecimal[] aP8 ,
                        byte[] aP9 ,
                        byte[] aP10 ,
                        java.math.BigDecimal[] aP11 ,
                        java.math.BigDecimal[] aP12 ,
                        String[] aP13 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             byte[] aP9 ,
                             byte[] aP10 ,
                             java.math.BigDecimal[] aP11 ,
                             java.math.BigDecimal[] aP12 ,
                             String[] aP13 )
   {
      pmodpie.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmodpie.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pmodpie.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pmodpie.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pmodpie.this.A200BarPieCod = aP4[0];
      this.aP4 = aP4;
      pmodpie.this.AV15KilAct = aP5[0];
      this.aP5 = aP5;
      pmodpie.this.AV16KilOld = aP6[0];
      this.aP6 = aP6;
      pmodpie.this.AV17MetAct = aP7[0];
      this.aP7 = aP7;
      pmodpie.this.AV18MetOld = aP8[0];
      this.aP8 = aP8;
      pmodpie.this.AV19FlagKil = aP9[0];
      this.aP9 = aP9;
      pmodpie.this.AV20FlagMet = aP10[0];
      this.aP10 = aP10;
      pmodpie.this.AV21Kilos = aP11[0];
      this.aP11 = aP11;
      pmodpie.this.AV22Metros = aP12[0];
      this.aP12 = aP12;
      pmodpie.this.AV23Modo = aP13[0];
      this.aP13 = aP13;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV20FlagMet = (byte)(0) ;
      AV19FlagKil = (byte)(0) ;
      /* Using cursor P005A2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A170BarKilLan = P005A2_A170BarKilLan[0] ;
         A203BarPieKil = P005A2_A203BarPieKil[0] ;
         A183BarMetLan = P005A2_A183BarMetLan[0] ;
         A205BarPieMet = P005A2_A205BarPieMet[0] ;
         if ( A203BarPieKil.subtract((AV15KilAct.subtract(AV16KilOld))).subtract(A170BarKilLan).doubleValue() >= 0 )
         {
            A203BarPieKil = A203BarPieKil.subtract((AV15KilAct.subtract(AV16KilOld))) ;
         }
         else
         {
            AV19FlagKil = (byte)(1) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            /* Using cursor P005A3 */
            pr_default.execute(1, new Object[] {A203BarPieKil, A205BarPieMet, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
            if (true) break;
         }
         if ( A205BarPieMet.subtract((AV17MetAct.subtract(AV18MetOld))).subtract(A183BarMetLan).doubleValue() >= 0 )
         {
            A205BarPieMet = A205BarPieMet.subtract((AV17MetAct.subtract(AV18MetOld))) ;
         }
         else
         {
            AV20FlagMet = (byte)(1) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            /* Using cursor P005A4 */
            pr_default.execute(2, new Object[] {A203BarPieKil, A205BarPieMet, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
            if (true) break;
         }
         if ( ( A203BarPieKil.doubleValue() == 0 ) && ( A205BarPieMet.doubleValue() == 0 ) )
         {
            /* Using cursor P005A5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
         }
         /* Using cursor P005A6 */
         pr_default.execute(4, new Object[] {A203BarPieKil, A205BarPieMet, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( ( ( AV19FlagKil == 1 ) || ( AV20FlagMet == 1 ) ) && ( GXutil.strcmp(AV23Modo, httpContext.getMessage( "INS", "")) == 0 ) )
      {
         AV21Kilos = DecimalUtil.ZERO ;
         AV22Metros = DecimalUtil.ZERO ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmodpie.this.A396EmprCod;
      this.aP1[0] = pmodpie.this.A129BarCod;
      this.aP2[0] = pmodpie.this.A132BarCodReo;
      this.aP3[0] = pmodpie.this.A130BarCodPar;
      this.aP4[0] = pmodpie.this.A200BarPieCod;
      this.aP5[0] = pmodpie.this.AV15KilAct;
      this.aP6[0] = pmodpie.this.AV16KilOld;
      this.aP7[0] = pmodpie.this.AV17MetAct;
      this.aP8[0] = pmodpie.this.AV18MetOld;
      this.aP9[0] = pmodpie.this.AV19FlagKil;
      this.aP10[0] = pmodpie.this.AV20FlagMet;
      this.aP11[0] = pmodpie.this.AV21Kilos;
      this.aP12[0] = pmodpie.this.AV22Metros;
      this.aP13[0] = pmodpie.this.AV23Modo;
      Application.commitDataStores(context, remoteHandle, pr_default, "pmodpie");
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
      P005A2_A396EmprCod = new String[] {""} ;
      P005A2_A129BarCod = new int[1] ;
      P005A2_A132BarCodReo = new byte[1] ;
      P005A2_A130BarCodPar = new String[] {""} ;
      P005A2_A200BarPieCod = new String[] {""} ;
      P005A2_A170BarKilLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P005A2_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P005A2_A183BarMetLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P005A2_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A170BarKilLan = DecimalUtil.ZERO ;
      A203BarPieKil = DecimalUtil.ZERO ;
      A183BarMetLan = DecimalUtil.ZERO ;
      A205BarPieMet = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmodpie__default(),
         new Object[] {
             new Object[] {
            P005A2_A396EmprCod, P005A2_A129BarCod, P005A2_A132BarCodReo, P005A2_A130BarCodPar, P005A2_A200BarPieCod, P005A2_A170BarKilLan, P005A2_A203BarPieKil, P005A2_A183BarMetLan, P005A2_A205BarPieMet
            }
            , new Object[] {
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

   private byte A132BarCodReo ;
   private byte AV19FlagKil ;
   private byte AV20FlagMet ;
   private short Gx_err ;
   private int A129BarCod ;
   private java.math.BigDecimal AV15KilAct ;
   private java.math.BigDecimal AV16KilOld ;
   private java.math.BigDecimal AV17MetAct ;
   private java.math.BigDecimal AV18MetOld ;
   private java.math.BigDecimal AV21Kilos ;
   private java.math.BigDecimal AV22Metros ;
   private java.math.BigDecimal A170BarKilLan ;
   private java.math.BigDecimal A203BarPieKil ;
   private java.math.BigDecimal A183BarMetLan ;
   private java.math.BigDecimal A205BarPieMet ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A200BarPieCod ;
   private String AV23Modo ;
   private String scmdbuf ;
   private String[] aP13 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private java.math.BigDecimal[] aP8 ;
   private byte[] aP9 ;
   private byte[] aP10 ;
   private java.math.BigDecimal[] aP11 ;
   private java.math.BigDecimal[] aP12 ;
   private IDataStoreProvider pr_default ;
   private String[] P005A2_A396EmprCod ;
   private int[] P005A2_A129BarCod ;
   private byte[] P005A2_A132BarCodReo ;
   private String[] P005A2_A130BarCodPar ;
   private String[] P005A2_A200BarPieCod ;
   private java.math.BigDecimal[] P005A2_A170BarKilLan ;
   private java.math.BigDecimal[] P005A2_A203BarPieKil ;
   private java.math.BigDecimal[] P005A2_A183BarMetLan ;
   private java.math.BigDecimal[] P005A2_A205BarPieMet ;
}

final  class pmodpie__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P005A2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarKilLan, BarPieKil, BarMetLan, BarPieMet FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P005A3", "UPDATE TXPBARPIE SET BarPieKil=?, BarPieMet=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
         ,new UpdateCursor("P005A4", "UPDATE TXPBARPIE SET BarPieKil=?, BarPieMet=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
         ,new UpdateCursor("P005A5", "DELETE FROM TXPBARPIE  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
         ,new UpdateCursor("P005A6", "UPDATE TXPBARPIE SET BarPieKil=?, BarPieMet=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
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
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
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
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 1 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 9);
               return;
            case 2 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 9);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 4 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 9);
               return;
      }
   }

}

