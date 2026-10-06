package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class recetatinte92__prc extends GXProcedure
{
   public recetatinte92__prc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( recetatinte92__prc.class ), "" );
   }

   public recetatinte92__prc( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        short aP4 ,
                        byte aP5 ,
                        short aP6 ,
                        String aP7 ,
                        String aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             short aP4 ,
                             byte aP5 ,
                             short aP6 ,
                             String aP7 ,
                             String aP8 )
   {
      recetatinte92__prc.this.AV14EmprCod = aP0;
      recetatinte92__prc.this.AV13BarCod = aP1;
      recetatinte92__prc.this.AV12BarCodReo = aP2;
      recetatinte92__prc.this.AV11BarCodPar = aP3;
      recetatinte92__prc.this.AV10RecLinMaq = aP4;
      recetatinte92__prc.this.AV8RecLinPro = aP5;
      recetatinte92__prc.this.AV9RecLin = aP6;
      recetatinte92__prc.this.AV34Usurcod = aP7;
      recetatinte92__prc.this.AV35station = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV36Inc_obs = " " ;
      /* Using cursor P0AH22 */
      pr_default.execute(0, new Object[] {AV14EmprCod, Integer.valueOf(AV13BarCod), Byte.valueOf(AV12BarCodReo), AV11BarCodPar, Short.valueOf(AV10RecLinMaq), Byte.valueOf(AV8RecLinPro), Short.valueOf(AV9RecLin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A811RecLin = P0AH22_A811RecLin[0] ;
         A1273RecLinPro = P0AH22_A1273RecLinPro[0] ;
         A2804RecLinMaq = P0AH22_A2804RecLinMaq[0] ;
         A130BarCodPar = P0AH22_A130BarCodPar[0] ;
         A132BarCodReo = P0AH22_A132BarCodReo[0] ;
         A129BarCod = P0AH22_A129BarCod[0] ;
         A396EmprCod = P0AH22_A396EmprCod[0] ;
         A872RecPrdNum = P0AH22_A872RecPrdNum[0] ;
         A431FacCon = P0AH22_A431FacCon[0] ;
         A686PrdCant = P0AH22_A686PrdCant[0] ;
         A238CanRes = A686PrdCant.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
         GXv_char1[0] = AV14EmprCod ;
         GXv_char2[0] = A872RecPrdNum ;
         GXv_decimal3[0] = DecimalUtil.doubleToDec(0) ;
         GXv_decimal4[0] = A238CanRes ;
         new app.mantenimientoderecetasregistro_modificocantreservada(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_decimal3, GXv_decimal4) ;
         recetatinte92__prc.this.AV14EmprCod = GXv_char1[0] ;
         recetatinte92__prc.this.A872RecPrdNum = GXv_char2[0] ;
         recetatinte92__prc.this.A238CanRes = GXv_decimal4[0] ;
         /* Using cursor P0AH23 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro), Short.valueOf(A811RecLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLRECET");
         AV36Inc_obs = httpContext.getMessage( "LinMaq ", "") + GXutil.trim( GXutil.str( A2804RecLinMaq, 4, 0)) + httpContext.getMessage( " Linpro ", "") + GXutil.trim( GXutil.str( A1273RecLinPro, 2, 0)) + httpContext.getMessage( " Linea ", "") + GXutil.trim( GXutil.str( A811RecLin, 4, 0)) + httpContext.getMessage( " eliminada", "") + GXutil.newLine( ) ;
         AV36Inc_obs += httpContext.getMessage( "Producto ", "") + GXutil.trim( A872RecPrdNum) + httpContext.getMessage( "Factor ", "") + GXutil.trim( GXutil.str( A431FacCon, 11, 5)) + httpContext.getMessage( " Cantidad ", "") + GXutil.trim( GXutil.str( A686PrdCant, 11, 3)) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( GXutil.strcmp(AV36Inc_obs, " ") != 0 )
      {
         new app.pctrinc(remoteHandle, context).execute( AV14EmprCod, AV40Pgmname, AV34Usurcod, AV35station, AV36Inc_obs, AV13BarCod, AV12BarCodReo, AV11BarCodPar) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "recetatinte92__prc");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV36Inc_obs = "" ;
      scmdbuf = "" ;
      P0AH22_A811RecLin = new short[1] ;
      P0AH22_A1273RecLinPro = new byte[1] ;
      P0AH22_A2804RecLinMaq = new short[1] ;
      P0AH22_A130BarCodPar = new String[] {""} ;
      P0AH22_A132BarCodReo = new byte[1] ;
      P0AH22_A129BarCod = new int[1] ;
      P0AH22_A396EmprCod = new String[] {""} ;
      P0AH22_A872RecPrdNum = new String[] {""} ;
      P0AH22_A431FacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AH22_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A872RecPrdNum = "" ;
      A431FacCon = DecimalUtil.ZERO ;
      A686PrdCant = DecimalUtil.ZERO ;
      A238CanRes = DecimalUtil.ZERO ;
      GXv_char1 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_decimal3 = new java.math.BigDecimal[1] ;
      GXv_decimal4 = new java.math.BigDecimal[1] ;
      AV40Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.recetatinte92__prc__default(),
         new Object[] {
             new Object[] {
            P0AH22_A811RecLin, P0AH22_A1273RecLinPro, P0AH22_A2804RecLinMaq, P0AH22_A130BarCodPar, P0AH22_A132BarCodReo, P0AH22_A129BarCod, P0AH22_A396EmprCod, P0AH22_A872RecPrdNum, P0AH22_A431FacCon, P0AH22_A686PrdCant
            }
            , new Object[] {
            }
         }
      );
      AV40Pgmname = "RecetaTinte92__PRC" ;
      /* GeneXus formulas. */
      AV40Pgmname = "RecetaTinte92__PRC" ;
      Gx_err = (short)(0) ;
   }

   private byte AV12BarCodReo ;
   private byte AV8RecLinPro ;
   private byte A1273RecLinPro ;
   private byte A132BarCodReo ;
   private short AV10RecLinMaq ;
   private short AV9RecLin ;
   private short A811RecLin ;
   private short A2804RecLinMaq ;
   private short Gx_err ;
   private int AV13BarCod ;
   private int A129BarCod ;
   private java.math.BigDecimal A431FacCon ;
   private java.math.BigDecimal A686PrdCant ;
   private java.math.BigDecimal A238CanRes ;
   private java.math.BigDecimal GXv_decimal3[] ;
   private java.math.BigDecimal GXv_decimal4[] ;
   private String AV14EmprCod ;
   private String AV11BarCodPar ;
   private String AV34Usurcod ;
   private String AV35station ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A872RecPrdNum ;
   private String GXv_char1[] ;
   private String GXv_char2[] ;
   private String AV40Pgmname ;
   private String AV36Inc_obs ;
   private IDataStoreProvider pr_default ;
   private short[] P0AH22_A811RecLin ;
   private byte[] P0AH22_A1273RecLinPro ;
   private short[] P0AH22_A2804RecLinMaq ;
   private String[] P0AH22_A130BarCodPar ;
   private byte[] P0AH22_A132BarCodReo ;
   private int[] P0AH22_A129BarCod ;
   private String[] P0AH22_A396EmprCod ;
   private String[] P0AH22_A872RecPrdNum ;
   private java.math.BigDecimal[] P0AH22_A431FacCon ;
   private java.math.BigDecimal[] P0AH22_A686PrdCant ;
}

final  class recetatinte92__prc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AH22", "SELECT RecLin, RecLinPro, RecLinMaq, BarCodPar, BarCodReo, BarCod, EmprCod, RecPrdNum, FacCon, PrdCant FROM TXPLRECET WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? and RecLinPro = ? and RecLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P0AH23", "DELETE FROM TXPLRECET  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ? AND RecLinPro = ? AND RecLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLRECET")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,5);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,3);
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
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
      }
   }

}

