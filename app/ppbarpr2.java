package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppbarpr2 extends GXProcedure
{
   public ppbarpr2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppbarpr2.class ), "" );
   }

   public ppbarpr2( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          String[] aP1 ,
                          int[] aP2 ,
                          byte[] aP3 ,
                          String[] aP4 ,
                          short[] aP5 )
   {
      ppbarpr2.this.aP6 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        short[] aP5 ,
                        int[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 ,
                             int[] aP6 )
   {
      ppbarpr2.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppbarpr2.this.AV11termicod = aP1[0];
      this.aP1 = aP1;
      ppbarpr2.this.AV8Barcod = aP2[0];
      this.aP2 = aP2;
      ppbarpr2.this.AV12Barcodreo = aP3[0];
      this.aP3 = aP3;
      ppbarpr2.this.AV9barcodpar = aP4[0];
      this.aP4 = aP4;
      ppbarpr2.this.AV13BarLinMaq = aP5[0];
      this.aP5 = aP5;
      ppbarpr2.this.AV14BarPrfvol = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV16noTbarprf ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "BARPRF", "") ;
      GXv_int4[0] = GXt_int1 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_int4) ;
      ppbarpr2.this.A396EmprCod = GXv_char2[0] ;
      ppbarpr2.this.GXt_int1 = GXv_int4[0] ;
      AV16noTbarprf = (byte)(GXt_int1) ;
      GXt_int1 = AV17ConversionLbvsKgs ;
      GXv_int4[0] = GXt_int1 ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "LBVSKG", ""), GXv_int4) ;
      ppbarpr2.this.GXt_int1 = GXv_int4[0] ;
      AV17ConversionLbvsKgs = GXt_int1 ;
      AV18lbvsKgs = ((AV17ConversionLbvsKgs==0) ? DecimalUtil.doubleToDec(1) : DecimalUtil.doubleToDec(AV17ConversionLbvsKgs/ (double) (100))) ;
      /* Using cursor P03BG2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV11termicod, Integer.valueOf(AV8Barcod), Byte.valueOf(AV12Barcodreo), AV9barcodpar, Short.valueOf(AV13BarLinMaq)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2794BarLinMaq = P03BG2_A2794BarLinMaq[0] ;
         A130BarCodPar = P03BG2_A130BarCodPar[0] ;
         A132BarCodReo = P03BG2_A132BarCodReo[0] ;
         A129BarCod = P03BG2_A129BarCod[0] ;
         A2792TermiCod = P03BG2_A2792TermiCod[0] ;
         A7254BarPrfRb = P03BG2_A7254BarPrfRb[0] ;
         n7254BarPrfRb = P03BG2_n7254BarPrfRb[0] ;
         A4869BarPrfVol = P03BG2_A4869BarPrfVol[0] ;
         n4869BarPrfVol = P03BG2_n4869BarPrfVol[0] ;
         A1255BarPrfLin = P03BG2_A1255BarPrfLin[0] ;
         if ( A7254BarPrfRb.doubleValue() == 0 )
         {
            A4869BarPrfVol = AV14BarPrfvol ;
            n4869BarPrfVol = false ;
            GXt_decimal5 = AV15Tkgs ;
            GXv_decimal6[0] = GXt_decimal5 ;
            new app.core.ppkmtot(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_decimal6) ;
            ppbarpr2.this.GXt_decimal5 = GXv_decimal6[0] ;
            AV15Tkgs = GXt_decimal5 ;
            AV15Tkgs = (AV15Tkgs.divide(AV18lbvsKgs, 18, java.math.RoundingMode.DOWN)) ;
            A7254BarPrfRb = DecimalUtil.doubleToDec(0) ;
            n7254BarPrfRb = false ;
            if ( ( AV15Tkgs.doubleValue() > 0 ) && ( DecimalUtil.compareTo((DecimalUtil.doubleToDec(AV14BarPrfvol).divide(AV15Tkgs, 18, java.math.RoundingMode.DOWN)), DecimalUtil.stringToDec("999.99")) <= 0 ) )
            {
               A7254BarPrfRb = DecimalUtil.doubleToDec(AV14BarPrfvol).divide(AV15Tkgs, 18, java.math.RoundingMode.DOWN) ;
               n7254BarPrfRb = false ;
            }
         }
         /* Using cursor P03BG3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n7254BarPrfRb), A7254BarPrfRb, Boolean.valueOf(n4869BarPrfVol), Integer.valueOf(A4869BarPrfVol), A396EmprCod, A2792TermiCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2794BarLinMaq), Short.valueOf(A1255BarPrfLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPR2");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV16noTbarprf == 0 )
      {
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppbarpr2.this.A396EmprCod;
      this.aP1[0] = ppbarpr2.this.AV11termicod;
      this.aP2[0] = ppbarpr2.this.AV8Barcod;
      this.aP3[0] = ppbarpr2.this.AV12Barcodreo;
      this.aP4[0] = ppbarpr2.this.AV9barcodpar;
      this.aP5[0] = ppbarpr2.this.AV13BarLinMaq;
      this.aP6[0] = ppbarpr2.this.AV14BarPrfvol;
      Application.commitDataStores(context, remoteHandle, pr_default, "ppbarpr2");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_char2 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int4 = new int[1] ;
      AV18lbvsKgs = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P03BG2_A396EmprCod = new String[] {""} ;
      P03BG2_A2794BarLinMaq = new short[1] ;
      P03BG2_A130BarCodPar = new String[] {""} ;
      P03BG2_A132BarCodReo = new byte[1] ;
      P03BG2_A129BarCod = new int[1] ;
      P03BG2_A2792TermiCod = new String[] {""} ;
      P03BG2_A7254BarPrfRb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03BG2_n7254BarPrfRb = new boolean[] {false} ;
      P03BG2_A4869BarPrfVol = new int[1] ;
      P03BG2_n4869BarPrfVol = new boolean[] {false} ;
      P03BG2_A1255BarPrfLin = new short[1] ;
      A130BarCodPar = "" ;
      A2792TermiCod = "" ;
      A7254BarPrfRb = DecimalUtil.ZERO ;
      AV15Tkgs = DecimalUtil.ZERO ;
      GXt_decimal5 = DecimalUtil.ZERO ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppbarpr2__default(),
         new Object[] {
             new Object[] {
            P03BG2_A396EmprCod, P03BG2_A2794BarLinMaq, P03BG2_A130BarCodPar, P03BG2_A132BarCodReo, P03BG2_A129BarCod, P03BG2_A2792TermiCod, P03BG2_A7254BarPrfRb, P03BG2_n7254BarPrfRb, P03BG2_A4869BarPrfVol, P03BG2_n4869BarPrfVol,
            P03BG2_A1255BarPrfLin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV12Barcodreo ;
   private byte AV16noTbarprf ;
   private byte A132BarCodReo ;
   private short AV13BarLinMaq ;
   private short A2794BarLinMaq ;
   private short A1255BarPrfLin ;
   private short Gx_err ;
   private int AV8Barcod ;
   private int AV14BarPrfvol ;
   private int AV17ConversionLbvsKgs ;
   private int GXt_int1 ;
   private int GXv_int4[] ;
   private int A129BarCod ;
   private int A4869BarPrfVol ;
   private java.math.BigDecimal AV18lbvsKgs ;
   private java.math.BigDecimal A7254BarPrfRb ;
   private java.math.BigDecimal AV15Tkgs ;
   private java.math.BigDecimal GXt_decimal5 ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private String A396EmprCod ;
   private String AV11termicod ;
   private String AV9barcodpar ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A2792TermiCod ;
   private boolean n7254BarPrfRb ;
   private boolean n4869BarPrfVol ;
   private int[] aP6 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private short[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P03BG2_A396EmprCod ;
   private short[] P03BG2_A2794BarLinMaq ;
   private String[] P03BG2_A130BarCodPar ;
   private byte[] P03BG2_A132BarCodReo ;
   private int[] P03BG2_A129BarCod ;
   private String[] P03BG2_A2792TermiCod ;
   private java.math.BigDecimal[] P03BG2_A7254BarPrfRb ;
   private boolean[] P03BG2_n7254BarPrfRb ;
   private int[] P03BG2_A4869BarPrfVol ;
   private boolean[] P03BG2_n4869BarPrfVol ;
   private short[] P03BG2_A1255BarPrfLin ;
}

final  class ppbarpr2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03BG2", "SELECT EmprCod, BarLinMaq, BarCodPar, BarCodReo, BarCod, TermiCod, BarPrfRb, BarPrfVol, BarPrfLin FROM TXPBARPR2 WHERE EmprCod = ? and TermiCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarLinMaq = ? ORDER BY EmprCod, TermiCod, BarCod, BarCodReo, BarCodPar, BarLinMaq, BarPrfLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03BG3", "UPDATE TXPBARPR2 SET BarPrfRb=?, BarPrfVol=?  WHERE EmprCod = ? AND TermiCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarLinMaq = ? AND BarPrfLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPR2")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 10);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(9);
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
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setString(4, (String)parms[5], 10);
               stmt.setInt(5, ((Number) parms[6]).intValue());
               stmt.setByte(6, ((Number) parms[7]).byteValue());
               stmt.setString(7, (String)parms[8], 1);
               stmt.setShort(8, ((Number) parms[9]).shortValue());
               stmt.setShort(9, ((Number) parms[10]).shortValue());
               return;
      }
   }

}

