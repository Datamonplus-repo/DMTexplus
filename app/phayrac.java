package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class phayrac extends GXProcedure
{
   public phayrac( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( phayrac.class ), "" );
   }

   public phayrac( int remoteHandle ,
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
                             String[] aP5 )
   {
      phayrac.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 )
   {
      phayrac.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      phayrac.this.AV15Barcod = aP1[0];
      this.aP1 = aP1;
      phayrac.this.AV16Barcodreo = aP2[0];
      this.aP2 = aP2;
      phayrac.this.AV17Barcodpar = aP3[0];
      this.aP3 = aP3;
      phayrac.this.AV26Procod = aP4[0];
      this.aP4 = aP4;
      phayrac.this.AV27ProcRec = aP5[0];
      this.aP5 = aP5;
      phayrac.this.Gx_msg = aP6[0];
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
      phayrac.this.GXt_char1 = GXv_char2[0] ;
      AV11Msgt = GXt_char1 ;
      GXt_char1 = AV14Msga ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN046", ""), (byte)(99), GXv_char2) ;
      phayrac.this.GXt_char1 = GXv_char2[0] ;
      AV14Msga = GXt_char1 ;
      AV18Barcoda = AV15Barcod ;
      AV19Barcodreoa = AV16Barcodreo ;
      AV20Barcodpara = AV17Barcodpar ;
      AV10FlagRec = (byte)(0) ;
      AV12Recta = httpContext.getMessage( "N", "") ;
      /* Using cursor P03WW2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV18Barcoda), Byte.valueOf(AV19Barcodreoa), AV20Barcodpara});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A6039RecAcab = P03WW2_A6039RecAcab[0] ;
         n6039RecAcab = P03WW2_n6039RecAcab[0] ;
         A130BarCodPar = P03WW2_A130BarCodPar[0] ;
         A132BarCodReo = P03WW2_A132BarCodReo[0] ;
         A129BarCod = P03WW2_A129BarCod[0] ;
         A2805RecVolPrd = P03WW2_A2805RecVolPrd[0] ;
         A4258RecMaqFas = P03WW2_A4258RecMaqFas[0] ;
         n4258RecMaqFas = P03WW2_n4258RecMaqFas[0] ;
         A4268RecOrdLin = P03WW2_A4268RecOrdLin[0] ;
         n4268RecOrdLin = P03WW2_n4268RecOrdLin[0] ;
         A2804RecLinMaq = P03WW2_A2804RecLinMaq[0] ;
         if ( GXutil.strcmp(A6039RecAcab, httpContext.getMessage( "S", "")) == 0 )
         {
            AV24RecMaqFas = A4258RecMaqFas ;
            AV25RecOrdlin = A4268RecOrdLin ;
            AV12Recta = httpContext.getMessage( "S", "") ;
            AV10FlagRec = (byte)(1) ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV10FlagRec == 1 )
      {
         AV27ProcRec = httpContext.getMessage( "N", "") ;
         AV32GXLvl31 = (byte)(0) ;
         /* Using cursor P03WW3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV18Barcoda), Byte.valueOf(AV19Barcodreoa), AV20Barcodpara, AV26Procod, Short.valueOf(AV25RecOrdlin)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A194BarOrdLin = P03WW3_A194BarOrdLin[0] ;
            A758ProCod = P03WW3_A758ProCod[0] ;
            A130BarCodPar = P03WW3_A130BarCodPar[0] ;
            A132BarCodReo = P03WW3_A132BarCodReo[0] ;
            A129BarCod = P03WW3_A129BarCod[0] ;
            AV32GXLvl31 = (byte)(1) ;
            AV27ProcRec = httpContext.getMessage( "S", "") ;
            Gx_msg = GXutil.trim( AV14Msga) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         if ( AV32GXLvl31 == 0 )
         {
            AV12Recta = httpContext.getMessage( "N", "") ;
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = phayrac.this.A396EmprCod;
      this.aP1[0] = phayrac.this.AV15Barcod;
      this.aP2[0] = phayrac.this.AV16Barcodreo;
      this.aP3[0] = phayrac.this.AV17Barcodpar;
      this.aP4[0] = phayrac.this.AV26Procod;
      this.aP5[0] = phayrac.this.AV27ProcRec;
      this.aP6[0] = phayrac.this.Gx_msg;
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
      AV12Recta = "" ;
      scmdbuf = "" ;
      P03WW2_A396EmprCod = new String[] {""} ;
      P03WW2_A6039RecAcab = new String[] {""} ;
      P03WW2_n6039RecAcab = new boolean[] {false} ;
      P03WW2_A130BarCodPar = new String[] {""} ;
      P03WW2_A132BarCodReo = new byte[1] ;
      P03WW2_A129BarCod = new int[1] ;
      P03WW2_A2805RecVolPrd = new int[1] ;
      P03WW2_A4258RecMaqFas = new String[] {""} ;
      P03WW2_n4258RecMaqFas = new boolean[] {false} ;
      P03WW2_A4268RecOrdLin = new short[1] ;
      P03WW2_n4268RecOrdLin = new boolean[] {false} ;
      P03WW2_A2804RecLinMaq = new short[1] ;
      A6039RecAcab = "" ;
      A130BarCodPar = "" ;
      A4258RecMaqFas = "" ;
      AV24RecMaqFas = "" ;
      P03WW3_A396EmprCod = new String[] {""} ;
      P03WW3_A194BarOrdLin = new short[1] ;
      P03WW3_A758ProCod = new String[] {""} ;
      P03WW3_A130BarCodPar = new String[] {""} ;
      P03WW3_A132BarCodReo = new byte[1] ;
      P03WW3_A129BarCod = new int[1] ;
      A758ProCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.phayrac__default(),
         new Object[] {
             new Object[] {
            P03WW2_A396EmprCod, P03WW2_A6039RecAcab, P03WW2_n6039RecAcab, P03WW2_A130BarCodPar, P03WW2_A132BarCodReo, P03WW2_A129BarCod, P03WW2_A2805RecVolPrd, P03WW2_A4258RecMaqFas, P03WW2_n4258RecMaqFas, P03WW2_A4268RecOrdLin,
            P03WW2_n4268RecOrdLin, P03WW2_A2804RecLinMaq
            }
            , new Object[] {
            P03WW3_A396EmprCod, P03WW3_A194BarOrdLin, P03WW3_A758ProCod, P03WW3_A130BarCodPar, P03WW3_A132BarCodReo, P03WW3_A129BarCod
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
   private byte AV32GXLvl31 ;
   private short A4268RecOrdLin ;
   private short A2804RecLinMaq ;
   private short AV25RecOrdlin ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int AV15Barcod ;
   private int AV18Barcoda ;
   private int A129BarCod ;
   private int A2805RecVolPrd ;
   private String A396EmprCod ;
   private String AV17Barcodpar ;
   private String AV26Procod ;
   private String AV27ProcRec ;
   private String Gx_msg ;
   private String AV11Msgt ;
   private String AV14Msga ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV20Barcodpara ;
   private String AV12Recta ;
   private String scmdbuf ;
   private String A6039RecAcab ;
   private String A130BarCodPar ;
   private String A4258RecMaqFas ;
   private String AV24RecMaqFas ;
   private String A758ProCod ;
   private boolean n6039RecAcab ;
   private boolean n4258RecMaqFas ;
   private boolean n4268RecOrdLin ;
   private String[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P03WW2_A396EmprCod ;
   private String[] P03WW2_A6039RecAcab ;
   private boolean[] P03WW2_n6039RecAcab ;
   private String[] P03WW2_A130BarCodPar ;
   private byte[] P03WW2_A132BarCodReo ;
   private int[] P03WW2_A129BarCod ;
   private int[] P03WW2_A2805RecVolPrd ;
   private String[] P03WW2_A4258RecMaqFas ;
   private boolean[] P03WW2_n4258RecMaqFas ;
   private short[] P03WW2_A4268RecOrdLin ;
   private boolean[] P03WW2_n4268RecOrdLin ;
   private short[] P03WW2_A2804RecLinMaq ;
   private String[] P03WW3_A396EmprCod ;
   private short[] P03WW3_A194BarOrdLin ;
   private String[] P03WW3_A758ProCod ;
   private String[] P03WW3_A130BarCodPar ;
   private byte[] P03WW3_A132BarCodReo ;
   private int[] P03WW3_A129BarCod ;
}

final  class phayrac__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03WW2", "SELECT EmprCod, RecAcab, BarCodPar, BarCodReo, BarCod, RecVolPrd, RecMaqFas, RecOrdLin, RecLinMaq FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03WW3", "SELECT * FROM (SELECT EmprCod, BarOrdLin, ProCod, BarCodPar, BarCodReo, BarCod FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[7])[0] = rslt.getString(7, 8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(9);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
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
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
      }
   }

}

