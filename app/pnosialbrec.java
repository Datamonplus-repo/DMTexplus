package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pnosialbrec extends GXProcedure
{
   public pnosialbrec( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pnosialbrec.class ), "" );
   }

   public pnosialbrec( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 )
   {
      pnosialbrec.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      pnosialbrec.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pnosialbrec.this.AV8AlbRecCod = aP1[0];
      this.aP1 = aP1;
      pnosialbrec.this.AV9Hdr = aP2[0];
      this.aP2 = aP2;
      pnosialbrec.this.AV10Opcion = aP3[0];
      this.aP3 = aP3;
      pnosialbrec.this.AV15Usurcod = aP4[0];
      this.aP4 = aP4;
      pnosialbrec.this.AV16Station = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      if ( AV10Opcion == 1 )
      {
         AV9Hdr = " " ;
         /* Using cursor P04GI2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8AlbRecCod)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A44AlbRecCod = P04GI2_A44AlbRecCod[0] ;
            A203BarPieKil = P04GI2_A203BarPieKil[0] ;
            A130BarCodPar = P04GI2_A130BarCodPar[0] ;
            A132BarCodReo = P04GI2_A132BarCodReo[0] ;
            A129BarCod = P04GI2_A129BarCod[0] ;
            A200BarPieCod = P04GI2_A200BarPieCod[0] ;
            AV9Hdr = GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
            pr_default.readNext(0);
         }
         pr_default.close(0);
      }
      if ( AV10Opcion == 2 )
      {
         AV11Barcod = (int)(GXutil.lval( GXutil.substring( AV9Hdr, 1, 8))) ;
         AV12Barcodreo = (byte)(GXutil.lval( GXutil.substring( AV9Hdr, 10, 1))) ;
         AV13Barcodpar = GXutil.substring( AV9Hdr, 11, 1) ;
         /* Optimized UPDATE. */
         /* Using cursor P04GI3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV11Barcod), Byte.valueOf(AV12Barcodreo), AV13Barcodpar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* End optimized UPDATE. */
         /* Optimized DELETE. */
         /* Using cursor P04GI4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV11Barcod), Byte.valueOf(AV12Barcodreo), AV13Barcodpar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISREO");
         /* End optimized DELETE. */
         /* Using cursor P04GI5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV8AlbRecCod)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A5206Nr_albrecc = P04GI5_A5206Nr_albrecc[0] ;
            n5206Nr_albrecc = P04GI5_n5206Nr_albrecc[0] ;
            A5198Nr_codigo = P04GI5_A5198Nr_codigo[0] ;
            /* Optimized DELETE. */
            /* Using cursor P04GI6 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A5198Nr_codigo)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPNOTRCO");
            /* End optimized DELETE. */
            /* Optimized DELETE. */
            /* Using cursor P04GI7 */
            pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A5198Nr_codigo)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPNOTRE1");
            /* End optimized DELETE. */
            /* Optimized DELETE. */
            /* Using cursor P04GI8 */
            pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A5198Nr_codigo)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPNOTRTE");
            /* End optimized DELETE. */
            /* Optimized DELETE. */
            /* Using cursor P04GI9 */
            pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A5198Nr_codigo)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPNOTRET");
            /* End optimized DELETE. */
            /* Using cursor P04GI10 */
            pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A5198Nr_codigo)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPNOTREC");
            pr_default.readNext(3);
         }
         pr_default.close(3);
         AV14Inc_obs = httpContext.getMessage( "Cambiamos Os de RE a Normal", "") + GXutil.newLine( ) + httpContext.getMessage( "Eliminamos tabla HISREO", "") + GXutil.newLine( ) + httpContext.getMessage( "Eliminamos tabla NOTREC...", "") + GXutil.newLine( ) ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV27Pgmname, AV15Usurcod, AV16Station, AV14Inc_obs, AV11Barcod, AV12Barcodreo, AV13Barcodpar) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pnosialbrec.this.A396EmprCod;
      this.aP1[0] = pnosialbrec.this.AV8AlbRecCod;
      this.aP2[0] = pnosialbrec.this.AV9Hdr;
      this.aP3[0] = pnosialbrec.this.AV10Opcion;
      this.aP4[0] = pnosialbrec.this.AV15Usurcod;
      this.aP5[0] = pnosialbrec.this.AV16Station;
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
      P04GI2_A396EmprCod = new String[] {""} ;
      P04GI2_A44AlbRecCod = new int[1] ;
      P04GI2_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04GI2_A130BarCodPar = new String[] {""} ;
      P04GI2_A132BarCodReo = new byte[1] ;
      P04GI2_A129BarCod = new int[1] ;
      P04GI2_A200BarPieCod = new String[] {""} ;
      A203BarPieKil = DecimalUtil.ZERO ;
      A130BarCodPar = "" ;
      A200BarPieCod = "" ;
      AV13Barcodpar = "" ;
      P04GI5_A396EmprCod = new String[] {""} ;
      P04GI5_A5206Nr_albrecc = new int[1] ;
      P04GI5_n5206Nr_albrecc = new boolean[] {false} ;
      P04GI5_A5198Nr_codigo = new int[1] ;
      AV14Inc_obs = "" ;
      AV27Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pnosialbrec__default(),
         new Object[] {
             new Object[] {
            P04GI2_A396EmprCod, P04GI2_A44AlbRecCod, P04GI2_A203BarPieKil, P04GI2_A130BarCodPar, P04GI2_A132BarCodReo, P04GI2_A129BarCod, P04GI2_A200BarPieCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P04GI5_A396EmprCod, P04GI5_A5206Nr_albrecc, P04GI5_n5206Nr_albrecc, P04GI5_A5198Nr_codigo
            }
            , new Object[] {
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
      AV27Pgmname = "PNosiAlbrec" ;
      /* GeneXus formulas. */
      AV27Pgmname = "PNosiAlbrec" ;
      Gx_err = (short)(0) ;
   }

   private byte AV10Opcion ;
   private byte A132BarCodReo ;
   private byte AV12Barcodreo ;
   private short Gx_err ;
   private int AV8AlbRecCod ;
   private int A44AlbRecCod ;
   private int A129BarCod ;
   private int AV11Barcod ;
   private int A5206Nr_albrecc ;
   private int A5198Nr_codigo ;
   private java.math.BigDecimal A203BarPieKil ;
   private String A396EmprCod ;
   private String AV9Hdr ;
   private String AV15Usurcod ;
   private String AV16Station ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A200BarPieCod ;
   private String AV13Barcodpar ;
   private String AV27Pgmname ;
   private boolean n5206Nr_albrecc ;
   private String AV14Inc_obs ;
   private String[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P04GI2_A396EmprCod ;
   private int[] P04GI2_A44AlbRecCod ;
   private java.math.BigDecimal[] P04GI2_A203BarPieKil ;
   private String[] P04GI2_A130BarCodPar ;
   private byte[] P04GI2_A132BarCodReo ;
   private int[] P04GI2_A129BarCod ;
   private String[] P04GI2_A200BarPieCod ;
   private String[] P04GI5_A396EmprCod ;
   private int[] P04GI5_A5206Nr_albrecc ;
   private boolean[] P04GI5_n5206Nr_albrecc ;
   private int[] P04GI5_A5198Nr_codigo ;
}

final  class pnosialbrec__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04GI2", "SELECT EmprCod, AlbRecCod, BarPieKil, BarCodPar, BarCodReo, BarCod, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04GI3", "UPDATE TXPBARCAD SET BarEstReo=0  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new UpdateCursor("P04GI4", "DELETE FROM TXPHISREO  WHERE EmprCod = ? and HisBarCod = ? and HisCodReo = ? and HisCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHISREO")
         ,new ForEachCursor("P04GI5", "SELECT EmprCod, Nr_albrecc, Nr_codigo FROM TXPNOTREC WHERE EmprCod = ? and Nr_albrecc = ? ORDER BY EmprCod, Nr_albrecc ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04GI6", "DELETE FROM TXPNOTRCO  WHERE EmprCod = ? and Nr_codigo = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPNOTRCO")
         ,new UpdateCursor("P04GI7", "DELETE FROM TXPNOTRE1  WHERE EmprCod = ? and Nr_codigo = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPNOTRE1")
         ,new UpdateCursor("P04GI8", "DELETE FROM TXPNOTRTE  WHERE EmprCod = ? and Nr_codigo = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPNOTRTE")
         ,new UpdateCursor("P04GI9", "DELETE FROM TXPNOTRET  WHERE EmprCod = ? and Nr_codigo = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPNOTRET")
         ,new UpdateCursor("P04GI10", "DELETE FROM TXPNOTREC  WHERE EmprCod = ? AND Nr_codigo = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPNOTREC")
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
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 9);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

