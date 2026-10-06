package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apcaltic extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apcaltic pgm = new apcaltic (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {
      String[] aP0 = new String[] {""};
      int[] aP1 = new int[] {0};
      byte[] aP2 = new byte[] {0};
      String[] aP3 = new String[] {""};

      try
      {
         aP0[0] = (String) args[0];
         aP1[0] = (int) GXutil.lval( args[1]);
         aP2[0] = (byte) GXutil.lval( args[2]);
         aP3[0] = (String) args[3];
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1, aP2, aP3);
   }

   public apcaltic( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apcaltic.class ), "" );
   }

   public apcaltic( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 )
   {
      apcaltic.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      apcaltic.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      apcaltic.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      apcaltic.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      apcaltic.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P018K2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A153BarFasEst = P018K2_A153BarFasEst[0] ;
         A457FasCod = P018K2_A457FasCod[0] ;
         A162BarFecTeo = P018K2_A162BarFecTeo[0] ;
         A216BarTieTeo = P018K2_A216BarTieTeo[0] ;
         A194BarOrdLin = P018K2_A194BarOrdLin[0] ;
         A758ProCod = P018K2_A758ProCod[0] ;
         GXv_char1[0] = A396EmprCod ;
         GXv_int2[0] = A129BarCod ;
         GXv_int3[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         GXv_char5[0] = A457FasCod ;
         GXv_date6[0] = AV17FecTeo ;
         GXv_decimal7[0] = AV18TieTeo ;
         GXv_decimal8[0] = AV19Decalaje ;
         GXv_decimal9[0] = AV20Resto ;
         new app.pcalcul(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4, GXv_char5, GXv_date6, GXv_decimal7, GXv_decimal8, GXv_decimal9) ;
         apcaltic.this.A396EmprCod = GXv_char1[0] ;
         apcaltic.this.A129BarCod = GXv_int2[0] ;
         apcaltic.this.A132BarCodReo = GXv_int3[0] ;
         apcaltic.this.A130BarCodPar = GXv_char4[0] ;
         apcaltic.this.A457FasCod = GXv_char5[0] ;
         apcaltic.this.AV17FecTeo = GXv_date6[0] ;
         apcaltic.this.AV18TieTeo = GXv_decimal7[0] ;
         apcaltic.this.AV19Decalaje = GXv_decimal8[0] ;
         apcaltic.this.AV20Resto = GXv_decimal9[0] ;
         A162BarFecTeo = AV17FecTeo ;
         A216BarTieTeo = AV18TieTeo ;
         /* Using cursor P018K3 */
         pr_default.execute(1, new Object[] {A162BarFecTeo, A216BarTieTeo, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pcaltic.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      this.aP0[0] = apcaltic.this.A396EmprCod;
      this.aP1[0] = apcaltic.this.A129BarCod;
      this.aP2[0] = apcaltic.this.A132BarCodReo;
      this.aP3[0] = apcaltic.this.A130BarCodPar;
      Application.commitDataStores(context, remoteHandle, pr_default, "apcaltic");
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
      P018K2_A396EmprCod = new String[] {""} ;
      P018K2_A129BarCod = new int[1] ;
      P018K2_A132BarCodReo = new byte[1] ;
      P018K2_A130BarCodPar = new String[] {""} ;
      P018K2_A153BarFasEst = new byte[1] ;
      P018K2_A457FasCod = new String[] {""} ;
      P018K2_A162BarFecTeo = new java.util.Date[] {GXutil.nullDate()} ;
      P018K2_A216BarTieTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P018K2_A194BarOrdLin = new short[1] ;
      P018K2_A758ProCod = new String[] {""} ;
      A457FasCod = "" ;
      A162BarFecTeo = GXutil.nullDate() ;
      A216BarTieTeo = DecimalUtil.ZERO ;
      A758ProCod = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_int3 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_char5 = new String[1] ;
      AV17FecTeo = GXutil.nullDate() ;
      GXv_date6 = new java.util.Date[1] ;
      AV18TieTeo = DecimalUtil.ZERO ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      AV19Decalaje = DecimalUtil.ZERO ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      AV20Resto = DecimalUtil.ZERO ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apcaltic__default(),
         new Object[] {
             new Object[] {
            P018K2_A396EmprCod, P018K2_A129BarCod, P018K2_A132BarCodReo, P018K2_A130BarCodPar, P018K2_A153BarFasEst, P018K2_A457FasCod, P018K2_A162BarFecTeo, P018K2_A216BarTieTeo, P018K2_A194BarOrdLin, P018K2_A758ProCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A153BarFasEst ;
   private byte GXv_int3[] ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private int GXv_int2[] ;
   private java.math.BigDecimal A216BarTieTeo ;
   private java.math.BigDecimal AV18TieTeo ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal AV19Decalaje ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal AV20Resto ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A457FasCod ;
   private String A758ProCod ;
   private String GXv_char1[] ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private java.util.Date A162BarFecTeo ;
   private java.util.Date AV17FecTeo ;
   private java.util.Date GXv_date6[] ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P018K2_A396EmprCod ;
   private int[] P018K2_A129BarCod ;
   private byte[] P018K2_A132BarCodReo ;
   private String[] P018K2_A130BarCodPar ;
   private byte[] P018K2_A153BarFasEst ;
   private String[] P018K2_A457FasCod ;
   private java.util.Date[] P018K2_A162BarFecTeo ;
   private java.math.BigDecimal[] P018K2_A216BarTieTeo ;
   private short[] P018K2_A194BarOrdLin ;
   private String[] P018K2_A758ProCod ;
}

final  class apcaltic__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P018K2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarFasEst, FasCod, BarFecTeo, BarTieTeo, BarOrdLin, ProCod FROM TXPBARFAS WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (BarFasEst = 0) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P018K3", "UPDATE TXPBARFAS SET BarFecTeo=?, BarTieTeo=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFAS")
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
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 8);
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
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 8);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
      }
   }

}

