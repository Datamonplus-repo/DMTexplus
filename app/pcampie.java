package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcampie extends GXProcedure
{
   public pcampie( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcampie.class ), "" );
   }

   public pcampie( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             int[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             int[] aP9 )
   {
      pcampie.this.aP10 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
      return aP10[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        int[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        java.math.BigDecimal[] aP8 ,
                        int[] aP9 ,
                        String[] aP10 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             int[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             int[] aP9 ,
                             String[] aP10 )
   {
      pcampie.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcampie.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pcampie.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pcampie.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pcampie.this.AV15Kilos = aP4[0];
      this.aP4 = aP4;
      pcampie.this.AV16Metros = aP5[0];
      this.aP5 = aP5;
      pcampie.this.AV17Piezas = aP6[0];
      this.aP6 = aP6;
      pcampie.this.AV18KilAnt = aP7[0];
      this.aP7 = aP7;
      pcampie.this.AV19MtrAnt = aP8[0];
      this.aP8 = aP8;
      pcampie.this.AV20PieAnt = aP9[0];
      this.aP9 = aP9;
      pcampie.this.AV21Modo = aP10[0];
      this.aP10 = aP10;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gx_msg = httpContext.getMessage( "Programa : ", "") + AV33Pgmname + GXutil.chr( (short)(13)) ;
      Gx_msg += httpContext.getMessage( "Empresa : ", "") + A396EmprCod + GXutil.chr( (short)(13)) ;
      Gx_msg += httpContext.getMessage( "HDR : ", "") + GXutil.trim( GXutil.str( A129BarCod, 10, 0)) + "/" + GXutil.trim( GXutil.str( A132BarCodReo, 10, 0)) + A130BarCodPar + GXutil.chr( (short)(13)) ;
      Gx_msg += httpContext.getMessage( "Kilos, Metros y Piezas a modificar : ", "") + GXutil.trim( GXutil.str( AV15Kilos, 10, 0)) + "," + GXutil.trim( GXutil.str( AV16Metros, 10, 0)) + "," + GXutil.trim( GXutil.str( AV17Piezas, 10, 0)) + GXutil.chr( (short)(13)) ;
      Gx_msg += httpContext.getMessage( "Kilos, Metros y Piezas actuales : ", "") + GXutil.trim( GXutil.str( AV18KilAnt, 10, 0)) + "," + GXutil.trim( GXutil.str( AV19MtrAnt, 10, 0)) + "," + GXutil.trim( GXutil.str( AV20PieAnt, 10, 0)) + GXutil.chr( (short)(13)) ;
      Gx_msg += httpContext.getMessage( "Modo : ", "") + AV21Modo + GXutil.chr( (short)(13)) ;
      /* Using cursor P008D2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A365DisDes = P008D2_A365DisDes[0] ;
         A1271BarPieLzd = P008D2_A1271BarPieLzd[0] ;
         A183BarMetLan = P008D2_A183BarMetLan[0] ;
         A170BarKilLan = P008D2_A170BarKilLan[0] ;
         A200BarPieCod = P008D2_A200BarPieCod[0] ;
         A365DisDes = P008D2_A365DisDes[0] ;
         Gx_msg += httpContext.getMessage( "Desgloce : ", "") + A365DisDes + GXutil.chr( (short)(13)) ;
         Gx_msg += "-----------------------------------------------------------" + GXutil.chr( (short)(13)) ;
         Gx_msg += httpContext.getMessage( "Kilos, Metros y Piezas leidos : ", "") + GXutil.trim( GXutil.str( A170BarKilLan, 10, 0)) + "," + GXutil.trim( GXutil.str( A183BarMetLan, 10, 0)) + "," + GXutil.trim( GXutil.str( A1271BarPieLzd, 10, 0)) + GXutil.chr( (short)(13)) ;
         if ( GXutil.strcmp(AV21Modo, httpContext.getMessage( "DEL", "")) == 0 )
         {
            if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
            {
               A170BarKilLan = A170BarKilLan.subtract((AV15Kilos.divide(DecimalUtil.doubleToDec(AV17Piezas), 18, java.math.RoundingMode.DOWN))) ;
               A183BarMetLan = A183BarMetLan.subtract((AV16Metros.divide(DecimalUtil.doubleToDec(AV17Piezas), 18, java.math.RoundingMode.DOWN))) ;
            }
            else
            {
               A170BarKilLan = A170BarKilLan.subtract(AV15Kilos) ;
               A183BarMetLan = A183BarMetLan.subtract(AV16Metros) ;
               A1271BarPieLzd = (int)(A1271BarPieLzd-AV17Piezas) ;
            }
         }
         if ( GXutil.strcmp(AV21Modo, httpContext.getMessage( "UPD", "")) == 0 )
         {
            if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
            {
               A170BarKilLan = A170BarKilLan.subtract((AV18KilAnt.divide(DecimalUtil.doubleToDec(AV20PieAnt), 18, java.math.RoundingMode.DOWN))).add((AV15Kilos.divide(DecimalUtil.doubleToDec(AV17Piezas), 18, java.math.RoundingMode.DOWN))) ;
               A183BarMetLan = A183BarMetLan.subtract((AV19MtrAnt.divide(DecimalUtil.doubleToDec(AV20PieAnt), 18, java.math.RoundingMode.DOWN))).add((AV16Metros.divide(DecimalUtil.doubleToDec(AV17Piezas), 18, java.math.RoundingMode.DOWN))) ;
            }
            else
            {
               A170BarKilLan = A170BarKilLan.subtract(AV18KilAnt).add(AV15Kilos) ;
               A183BarMetLan = A183BarMetLan.subtract(AV19MtrAnt).add(AV16Metros) ;
               A1271BarPieLzd = (int)(A1271BarPieLzd-AV20PieAnt+AV17Piezas) ;
            }
         }
         if ( GXutil.strcmp(AV21Modo, httpContext.getMessage( "INS", "")) == 0 )
         {
            if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
            {
               if ( AV22TotPie <= 0 )
               {
                  AV22TotPie = 1 ;
               }
               A170BarKilLan = A170BarKilLan.add((AV15Kilos.divide(DecimalUtil.doubleToDec(AV22TotPie), 18, java.math.RoundingMode.DOWN))) ;
               A183BarMetLan = A183BarMetLan.add((AV16Metros.divide(DecimalUtil.doubleToDec(AV22TotPie), 18, java.math.RoundingMode.DOWN))) ;
            }
            else
            {
               A170BarKilLan = A170BarKilLan.add(AV15Kilos) ;
               A183BarMetLan = A183BarMetLan.add(AV16Metros) ;
               A1271BarPieLzd = (int)(A1271BarPieLzd+AV17Piezas) ;
            }
         }
         Gx_msg += httpContext.getMessage( "Kilos, Metros y Piezas guardados : ", "") + GXutil.trim( GXutil.str( A170BarKilLan, 10, 0)) + "," + GXutil.trim( GXutil.str( A183BarMetLan, 10, 0)) + "," + GXutil.trim( GXutil.str( A1271BarPieLzd, 10, 0)) + GXutil.chr( (short)(13)) ;
         Gx_msg += "-----------------------------------------------------------" ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         /* Using cursor P008D3 */
         pr_default.execute(1, new Object[] {Integer.valueOf(A1271BarPieLzd), A183BarMetLan, A170BarKilLan, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
         if (true) break;
         /* Using cursor P008D4 */
         pr_default.execute(2, new Object[] {Integer.valueOf(A1271BarPieLzd), A183BarMetLan, A170BarKilLan, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcampie.this.A396EmprCod;
      this.aP1[0] = pcampie.this.A129BarCod;
      this.aP2[0] = pcampie.this.A132BarCodReo;
      this.aP3[0] = pcampie.this.A130BarCodPar;
      this.aP4[0] = pcampie.this.AV15Kilos;
      this.aP5[0] = pcampie.this.AV16Metros;
      this.aP6[0] = pcampie.this.AV17Piezas;
      this.aP7[0] = pcampie.this.AV18KilAnt;
      this.aP8[0] = pcampie.this.AV19MtrAnt;
      this.aP9[0] = pcampie.this.AV20PieAnt;
      this.aP10[0] = pcampie.this.AV21Modo;
      Application.commitDataStores(context, remoteHandle, pr_default, "pcampie");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gx_msg = "" ;
      AV33Pgmname = "" ;
      scmdbuf = "" ;
      P008D2_A396EmprCod = new String[] {""} ;
      P008D2_A129BarCod = new int[1] ;
      P008D2_A132BarCodReo = new byte[1] ;
      P008D2_A130BarCodPar = new String[] {""} ;
      P008D2_A365DisDes = new String[] {""} ;
      P008D2_A1271BarPieLzd = new int[1] ;
      P008D2_A183BarMetLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008D2_A170BarKilLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008D2_A200BarPieCod = new String[] {""} ;
      A365DisDes = "" ;
      A183BarMetLan = DecimalUtil.ZERO ;
      A170BarKilLan = DecimalUtil.ZERO ;
      A200BarPieCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcampie__default(),
         new Object[] {
             new Object[] {
            P008D2_A396EmprCod, P008D2_A129BarCod, P008D2_A132BarCodReo, P008D2_A130BarCodPar, P008D2_A365DisDes, P008D2_A1271BarPieLzd, P008D2_A183BarMetLan, P008D2_A170BarKilLan, P008D2_A200BarPieCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      AV33Pgmname = "PCAMPIE" ;
      /* GeneXus formulas. */
      AV33Pgmname = "PCAMPIE" ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV17Piezas ;
   private int AV20PieAnt ;
   private int A1271BarPieLzd ;
   private int AV22TotPie ;
   private java.math.BigDecimal AV15Kilos ;
   private java.math.BigDecimal AV16Metros ;
   private java.math.BigDecimal AV18KilAnt ;
   private java.math.BigDecimal AV19MtrAnt ;
   private java.math.BigDecimal A183BarMetLan ;
   private java.math.BigDecimal A170BarKilLan ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV21Modo ;
   private String Gx_msg ;
   private String AV33Pgmname ;
   private String scmdbuf ;
   private String A365DisDes ;
   private String A200BarPieCod ;
   private String[] aP10 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private int[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private java.math.BigDecimal[] aP8 ;
   private int[] aP9 ;
   private IDataStoreProvider pr_default ;
   private String[] P008D2_A396EmprCod ;
   private int[] P008D2_A129BarCod ;
   private byte[] P008D2_A132BarCodReo ;
   private String[] P008D2_A130BarCodPar ;
   private String[] P008D2_A365DisDes ;
   private int[] P008D2_A1271BarPieLzd ;
   private java.math.BigDecimal[] P008D2_A183BarMetLan ;
   private java.math.BigDecimal[] P008D2_A170BarKilLan ;
   private String[] P008D2_A200BarPieCod ;
}

final  class pcampie__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P008D2", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.DisDes, T1.BarPieLzd, T1.BarMetLan, T1.BarKilLan, T1.BarPieCod FROM (TXPBARPIE T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P008D3", "UPDATE TXPBARPIE SET BarPieLzd=?, BarMetLan=?, BarKilLan=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
         ,new UpdateCursor("P008D4", "UPDATE TXPBARPIE SET BarPieLzd=?, BarMetLan=?, BarKilLan=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
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
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[8])[0] = rslt.getString(9, 9);
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
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               stmt.setString(8, (String)parms[7], 9);
               return;
            case 2 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               stmt.setString(8, (String)parms[7], 9);
               return;
      }
   }

}

