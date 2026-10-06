package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class phayracf extends GXProcedure
{
   public phayracf( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( phayracf.class ), "" );
   }

   public phayracf( int remoteHandle ,
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
                             String[] aP5 )
   {
      phayracf.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 )
   {
      phayracf.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      phayracf.this.AV15Barcod = aP1[0];
      this.aP1 = aP1;
      phayracf.this.AV16Barcodreo = aP2[0];
      this.aP2 = aP2;
      phayracf.this.AV17Barcodpar = aP3[0];
      this.aP3 = aP3;
      phayracf.this.AV28Barordlin = aP4[0];
      this.aP4 = aP4;
      phayracf.this.AV12Recta = aP5[0];
      this.aP5 = aP5;
      phayracf.this.Gx_msg = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV11Msgt ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN045", ""), (byte)(99), GXv_char2) ;
      phayracf.this.GXt_char1 = GXv_char2[0] ;
      AV11Msgt = GXt_char1 ;
      GXt_char1 = AV14Msga ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN046", ""), (byte)(99), GXv_char2) ;
      phayracf.this.GXt_char1 = GXv_char2[0] ;
      AV14Msga = GXt_char1 ;
      AV18Barcoda = AV15Barcod ;
      AV19Barcodreoa = AV16Barcodreo ;
      AV20Barcodpara = AV17Barcodpar ;
      AV10FlagRec = (byte)(0) ;
      AV12Recta = httpContext.getMessage( "N", "") ;
      Gx_msg = " " ;
      /* Using cursor P03WX2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV18Barcoda), Byte.valueOf(AV19Barcodreoa), AV20Barcodpara, Short.valueOf(AV28Barordlin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A6039RecAcab = P03WX2_A6039RecAcab[0] ;
         n6039RecAcab = P03WX2_n6039RecAcab[0] ;
         A4268RecOrdLin = P03WX2_A4268RecOrdLin[0] ;
         n4268RecOrdLin = P03WX2_n4268RecOrdLin[0] ;
         A130BarCodPar = P03WX2_A130BarCodPar[0] ;
         A132BarCodReo = P03WX2_A132BarCodReo[0] ;
         A129BarCod = P03WX2_A129BarCod[0] ;
         A2805RecVolPrd = P03WX2_A2805RecVolPrd[0] ;
         A4258RecMaqFas = P03WX2_A4258RecMaqFas[0] ;
         n4258RecMaqFas = P03WX2_n4258RecMaqFas[0] ;
         A2804RecLinMaq = P03WX2_A2804RecLinMaq[0] ;
         if ( GXutil.strcmp(A6039RecAcab, httpContext.getMessage( "S", "")) == 0 )
         {
            AV24RecMaqFas = A4258RecMaqFas ;
            AV25RecOrdlin = A4268RecOrdLin ;
            AV12Recta = httpContext.getMessage( "S", "") ;
            AV10FlagRec = (byte)(1) ;
            Gx_msg = GXutil.trim( AV14Msga) ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = phayracf.this.A396EmprCod;
      this.aP1[0] = phayracf.this.AV15Barcod;
      this.aP2[0] = phayracf.this.AV16Barcodreo;
      this.aP3[0] = phayracf.this.AV17Barcodpar;
      this.aP4[0] = phayracf.this.AV28Barordlin;
      this.aP5[0] = phayracf.this.AV12Recta;
      this.aP6[0] = phayracf.this.Gx_msg;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV11Msgt = "" ;
      AV14Msga = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV20Barcodpara = "" ;
      scmdbuf = "" ;
      P03WX2_A396EmprCod = new String[] {""} ;
      P03WX2_A6039RecAcab = new String[] {""} ;
      P03WX2_n6039RecAcab = new boolean[] {false} ;
      P03WX2_A4268RecOrdLin = new short[1] ;
      P03WX2_n4268RecOrdLin = new boolean[] {false} ;
      P03WX2_A130BarCodPar = new String[] {""} ;
      P03WX2_A132BarCodReo = new byte[1] ;
      P03WX2_A129BarCod = new int[1] ;
      P03WX2_A2805RecVolPrd = new int[1] ;
      P03WX2_A4258RecMaqFas = new String[] {""} ;
      P03WX2_n4258RecMaqFas = new boolean[] {false} ;
      P03WX2_A2804RecLinMaq = new short[1] ;
      A6039RecAcab = "" ;
      A130BarCodPar = "" ;
      A4258RecMaqFas = "" ;
      AV24RecMaqFas = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.phayracf__default(),
         new Object[] {
             new Object[] {
            P03WX2_A396EmprCod, P03WX2_A6039RecAcab, P03WX2_n6039RecAcab, P03WX2_A4268RecOrdLin, P03WX2_n4268RecOrdLin, P03WX2_A130BarCodPar, P03WX2_A132BarCodReo, P03WX2_A129BarCod, P03WX2_A2805RecVolPrd, P03WX2_A4258RecMaqFas,
            P03WX2_n4258RecMaqFas, P03WX2_A2804RecLinMaq
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV16Barcodreo ;
   private byte AV19Barcodreoa ;
   private byte AV10FlagRec ;
   private byte A132BarCodReo ;
   private short AV28Barordlin ;
   private short A4268RecOrdLin ;
   private short A2804RecLinMaq ;
   private short AV25RecOrdlin ;
   private short Gx_err ;
   private int AV15Barcod ;
   private int AV18Barcoda ;
   private int A129BarCod ;
   private int A2805RecVolPrd ;
   private String A396EmprCod ;
   private String AV17Barcodpar ;
   private String AV12Recta ;
   private String Gx_msg ;
   private String AV11Msgt ;
   private String AV14Msga ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV20Barcodpara ;
   private String scmdbuf ;
   private String A6039RecAcab ;
   private String A130BarCodPar ;
   private String A4258RecMaqFas ;
   private String AV24RecMaqFas ;
   private boolean n6039RecAcab ;
   private boolean n4268RecOrdLin ;
   private boolean n4258RecMaqFas ;
   private String[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P03WX2_A396EmprCod ;
   private String[] P03WX2_A6039RecAcab ;
   private boolean[] P03WX2_n6039RecAcab ;
   private short[] P03WX2_A4268RecOrdLin ;
   private boolean[] P03WX2_n4268RecOrdLin ;
   private String[] P03WX2_A130BarCodPar ;
   private byte[] P03WX2_A132BarCodReo ;
   private int[] P03WX2_A129BarCod ;
   private int[] P03WX2_A2805RecVolPrd ;
   private String[] P03WX2_A4258RecMaqFas ;
   private boolean[] P03WX2_n4258RecMaqFas ;
   private short[] P03WX2_A2804RecLinMaq ;
}

final  class phayracf__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03WX2", "SELECT EmprCod, RecAcab, RecOrdLin, BarCodPar, BarCodReo, BarCod, RecVolPrd, RecMaqFas, RecLinMaq FROM TXPRECMAQ WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (RecOrdLin = ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(9);
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
               return;
      }
   }

}

