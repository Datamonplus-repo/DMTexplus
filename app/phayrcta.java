package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class phayrcta extends GXProcedure
{
   public phayrcta( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( phayrcta.class ), "" );
   }

   public phayrcta( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             byte[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 )
   {
      phayrcta.this.aP7 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        byte[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             byte[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 )
   {
      phayrcta.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      phayrcta.this.AV15Barcod = aP1[0];
      this.aP1 = aP1;
      phayrcta.this.AV16Barcodreo = aP2[0];
      this.aP2 = aP2;
      phayrcta.this.AV17Barcodpar = aP3[0];
      this.aP3 = aP3;
      phayrcta.this.aP4 = aP4;
      phayrcta.this.aP5 = aP5;
      phayrcta.this.aP6 = aP6;
      phayrcta.this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10FlagRec = (byte)(0) ;
      GXt_char1 = AV11Msgt ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN045", ""), (byte)(99), GXv_char2) ;
      phayrcta.this.GXt_char1 = GXv_char2[0] ;
      AV11Msgt = GXt_char1 ;
      GXt_char1 = AV14Msga ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN046", ""), (byte)(99), GXv_char2) ;
      phayrcta.this.GXt_char1 = GXv_char2[0] ;
      AV14Msga = GXt_char1 ;
      Gx_msg = " " ;
      AV12Recta = " " ;
      AV13Rectt = " " ;
      AV18Barcoda = AV15Barcod ;
      AV19Barcodreoa = AV16Barcodreo ;
      AV20Barcodpara = AV17Barcodpar ;
      AV21Barcodm = AV15Barcod ;
      AV22Barcodreom = AV16Barcodreo ;
      AV23Barcodparm = AV17Barcodpar ;
      new app.pminagr(remoteHandle, context).execute( A396EmprCod, AV21Barcodm, AV22Barcodreom, AV23Barcodparm) ;
      /* Using cursor P02NE2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV21Barcodm), Byte.valueOf(AV22Barcodreom), AV23Barcodparm});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A6039RecAcab = P02NE2_A6039RecAcab[0] ;
         n6039RecAcab = P02NE2_n6039RecAcab[0] ;
         A130BarCodPar = P02NE2_A130BarCodPar[0] ;
         A132BarCodReo = P02NE2_A132BarCodReo[0] ;
         A129BarCod = P02NE2_A129BarCod[0] ;
         A2805RecVolPrd = P02NE2_A2805RecVolPrd[0] ;
         A2804RecLinMaq = P02NE2_A2804RecLinMaq[0] ;
         if ( GXutil.strcmp(A6039RecAcab, httpContext.getMessage( "S", "")) != 0 )
         {
            AV13Rectt = httpContext.getMessage( "S", "") ;
            AV10FlagRec = (byte)(1) ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Using cursor P02NE3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV18Barcoda), Byte.valueOf(AV19Barcodreoa), AV20Barcodpara});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A6039RecAcab = P02NE3_A6039RecAcab[0] ;
         n6039RecAcab = P02NE3_n6039RecAcab[0] ;
         A130BarCodPar = P02NE3_A130BarCodPar[0] ;
         A132BarCodReo = P02NE3_A132BarCodReo[0] ;
         A129BarCod = P02NE3_A129BarCod[0] ;
         A2805RecVolPrd = P02NE3_A2805RecVolPrd[0] ;
         A2804RecLinMaq = P02NE3_A2804RecLinMaq[0] ;
         if ( GXutil.strcmp(A6039RecAcab, httpContext.getMessage( "S", "")) == 0 )
         {
            AV12Recta = httpContext.getMessage( "S", "") ;
            AV10FlagRec = (byte)(1) ;
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
      if ( ( GXutil.strcmp(AV12Recta, httpContext.getMessage( "S", "")) == 0 ) && ( GXutil.strcmp(AV13Rectt, httpContext.getMessage( "S", "")) == 0 ) )
      {
         Gx_msg = GXutil.trim( AV11Msgt) + GXutil.newLine( ) + GXutil.trim( AV14Msga) + GXutil.newLine( ) ;
      }
      if ( ( GXutil.strcmp(AV12Recta, httpContext.getMessage( "S", "")) == 0 ) && ( GXutil.strcmp(AV13Rectt, "") == 0 ) )
      {
         Gx_msg = GXutil.trim( AV14Msga) + GXutil.newLine( ) ;
      }
      if ( ( GXutil.strcmp(AV12Recta, "") == 0 ) && ( GXutil.strcmp(AV13Rectt, httpContext.getMessage( "S", "")) == 0 ) )
      {
         Gx_msg = GXutil.trim( AV11Msgt) + GXutil.newLine( ) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = phayrcta.this.A396EmprCod;
      this.aP1[0] = phayrcta.this.AV15Barcod;
      this.aP2[0] = phayrcta.this.AV16Barcodreo;
      this.aP3[0] = phayrcta.this.AV17Barcodpar;
      this.aP4[0] = phayrcta.this.AV10FlagRec;
      this.aP5[0] = phayrcta.this.Gx_msg;
      this.aP6[0] = phayrcta.this.AV12Recta;
      this.aP7[0] = phayrcta.this.AV13Rectt;
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
      AV12Recta = "" ;
      AV13Rectt = "" ;
      AV11Msgt = "" ;
      AV14Msga = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV20Barcodpara = "" ;
      AV23Barcodparm = "" ;
      scmdbuf = "" ;
      P02NE2_A396EmprCod = new String[] {""} ;
      P02NE2_A6039RecAcab = new String[] {""} ;
      P02NE2_n6039RecAcab = new boolean[] {false} ;
      P02NE2_A130BarCodPar = new String[] {""} ;
      P02NE2_A132BarCodReo = new byte[1] ;
      P02NE2_A129BarCod = new int[1] ;
      P02NE2_A2805RecVolPrd = new int[1] ;
      P02NE2_A2804RecLinMaq = new short[1] ;
      A6039RecAcab = "" ;
      A130BarCodPar = "" ;
      P02NE3_A396EmprCod = new String[] {""} ;
      P02NE3_A6039RecAcab = new String[] {""} ;
      P02NE3_n6039RecAcab = new boolean[] {false} ;
      P02NE3_A130BarCodPar = new String[] {""} ;
      P02NE3_A132BarCodReo = new byte[1] ;
      P02NE3_A129BarCod = new int[1] ;
      P02NE3_A2805RecVolPrd = new int[1] ;
      P02NE3_A2804RecLinMaq = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.phayrcta__default(),
         new Object[] {
             new Object[] {
            P02NE2_A396EmprCod, P02NE2_A6039RecAcab, P02NE2_n6039RecAcab, P02NE2_A130BarCodPar, P02NE2_A132BarCodReo, P02NE2_A129BarCod, P02NE2_A2805RecVolPrd, P02NE2_A2804RecLinMaq
            }
            , new Object[] {
            P02NE3_A396EmprCod, P02NE3_A6039RecAcab, P02NE3_n6039RecAcab, P02NE3_A130BarCodPar, P02NE3_A132BarCodReo, P02NE3_A129BarCod, P02NE3_A2805RecVolPrd, P02NE3_A2804RecLinMaq
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV16Barcodreo ;
   private byte AV10FlagRec ;
   private byte AV19Barcodreoa ;
   private byte AV22Barcodreom ;
   private byte A132BarCodReo ;
   private short A2804RecLinMaq ;
   private short Gx_err ;
   private int AV15Barcod ;
   private int AV18Barcoda ;
   private int AV21Barcodm ;
   private int A129BarCod ;
   private int A2805RecVolPrd ;
   private String A396EmprCod ;
   private String AV17Barcodpar ;
   private String Gx_msg ;
   private String AV12Recta ;
   private String AV13Rectt ;
   private String AV11Msgt ;
   private String AV14Msga ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV20Barcodpara ;
   private String AV23Barcodparm ;
   private String scmdbuf ;
   private String A6039RecAcab ;
   private String A130BarCodPar ;
   private boolean n6039RecAcab ;
   private String[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private byte[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P02NE2_A396EmprCod ;
   private String[] P02NE2_A6039RecAcab ;
   private boolean[] P02NE2_n6039RecAcab ;
   private String[] P02NE2_A130BarCodPar ;
   private byte[] P02NE2_A132BarCodReo ;
   private int[] P02NE2_A129BarCod ;
   private int[] P02NE2_A2805RecVolPrd ;
   private short[] P02NE2_A2804RecLinMaq ;
   private String[] P02NE3_A396EmprCod ;
   private String[] P02NE3_A6039RecAcab ;
   private boolean[] P02NE3_n6039RecAcab ;
   private String[] P02NE3_A130BarCodPar ;
   private byte[] P02NE3_A132BarCodReo ;
   private int[] P02NE3_A129BarCod ;
   private int[] P02NE3_A2805RecVolPrd ;
   private short[] P02NE3_A2804RecLinMaq ;
}

final  class phayrcta__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02NE2", "SELECT EmprCod, RecAcab, BarCodPar, BarCodReo, BarCod, RecVolPrd, RecLinMaq FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02NE3", "SELECT EmprCod, RecAcab, BarCodPar, BarCodReo, BarCod, RecVolPrd, RecLinMaq FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((short[]) buf[7])[0] = rslt.getShort(7);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

