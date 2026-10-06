package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class prec2 extends GXProcedure
{
   public prec2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( prec2.class ), "" );
   }

   public prec2( int remoteHandle ,
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
                             short[] aP5 ,
                             String[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             int[] aP8 ,
                             java.math.BigDecimal[] aP9 ,
                             String[] aP10 ,
                             String[] aP11 ,
                             int[] aP12 ,
                             int[] aP13 ,
                             int[] aP14 )
   {
      prec2.this.aP15 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15);
      return aP15[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        short[] aP5 ,
                        String[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        int[] aP8 ,
                        java.math.BigDecimal[] aP9 ,
                        String[] aP10 ,
                        String[] aP11 ,
                        int[] aP12 ,
                        int[] aP13 ,
                        int[] aP14 ,
                        String[] aP15 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 ,
                             String[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             int[] aP8 ,
                             java.math.BigDecimal[] aP9 ,
                             String[] aP10 ,
                             String[] aP11 ,
                             int[] aP12 ,
                             int[] aP13 ,
                             int[] aP14 ,
                             String[] aP15 )
   {
      prec2.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      prec2.this.AV8BarCod = aP1[0];
      this.aP1 = aP1;
      prec2.this.AV9Barcodreo = aP2[0];
      this.aP2 = aP2;
      prec2.this.AV10Barcodpar = aP3[0];
      this.aP3 = aP3;
      prec2.this.AV11usurcod = aP4[0];
      this.aP4 = aP4;
      prec2.this.AV12Reclinmaq = aP5[0];
      this.aP5 = aP5;
      prec2.this.AV13Msg_v = aP6[0];
      this.aP6 = aP6;
      prec2.this.AV14Rectotkgm = aP7[0];
      this.aP7 = aP7;
      prec2.this.AV16Rectotpie = aP8[0];
      this.aP8 = aP8;
      prec2.this.AV15RecTotMtr = aP9[0];
      this.aP9 = aP9;
      prec2.this.AV17OldMaqcod = aP10[0];
      this.aP10 = aP10;
      prec2.this.AV18Maqcod = aP11[0];
      this.aP11 = aP11;
      prec2.this.AV19RecVolMx = aP12[0];
      this.aP12 = aP12;
      prec2.this.AV20RecVolMn = aP13[0];
      this.aP13 = aP13;
      prec2.this.AV25Recvolprd = aP14[0];
      this.aP14 = aP14;
      prec2.this.Gx_mode = aP15[0];
      this.aP15 = aP15;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV26Centra ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CENTRA", ""), GXv_int2) ;
      prec2.this.GXt_int1 = GXv_int2[0] ;
      AV26Centra = GXt_int1 ;
      AV21Volmx = (byte)(0) ;
      AV22Volmn = (byte)(0) ;
      /* Using cursor P03DR2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV18Maqcod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A602MaqCod = P03DR2_A602MaqCod[0] ;
         A623MaqVolMax = P03DR2_A623MaqVolMax[0] ;
         n623MaqVolMax = P03DR2_n623MaqVolMax[0] ;
         A625MaqVolMin = P03DR2_A625MaqVolMin[0] ;
         n625MaqVolMin = P03DR2_n625MaqVolMin[0] ;
         A624MaqVolMed = P03DR2_A624MaqVolMed[0] ;
         n624MaqVolMed = P03DR2_n624MaqVolMed[0] ;
         AV19RecVolMx = A623MaqVolMax ;
         AV20RecVolMn = A625MaqVolMin ;
         AV24RecVolMd = A624MaqVolMed ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV23Msg_cv = " " ;
      if ( GXutil.strcmp(AV18Maqcod, AV17OldMaqcod) == 0 )
      {
         AV23Msg_cv = "" ;
      }
      else
      {
         AV23Msg_cv = httpContext.getMessage( "Ha habido cambio de Maquina. Revise los volumenes de los Procesos¡¡¡", "") + GXutil.chr( (short)(13)) ;
         /* Using cursor P03DR3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV8BarCod), Byte.valueOf(AV9Barcodreo), AV10Barcodpar, Short.valueOf(AV12Reclinmaq)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A2804RecLinMaq = P03DR3_A2804RecLinMaq[0] ;
            A130BarCodPar = P03DR3_A130BarCodPar[0] ;
            A132BarCodReo = P03DR3_A132BarCodReo[0] ;
            A129BarCod = P03DR3_A129BarCod[0] ;
            A4695RecVolPrf = P03DR3_A4695RecVolPrf[0] ;
            A1273RecLinPro = P03DR3_A1273RecLinPro[0] ;
            if ( ( A4695RecVolPrf > AV19RecVolMx ) && ( AV21Volmx == 0 ) )
            {
               AV23Msg_cv += httpContext.getMessage( "Se ha encontrado un Volumen Superior al Maximo de la maquina.", "") + GXutil.chr( (short)(13)) ;
               AV21Volmx = (byte)(1) ;
            }
            if ( ( A4695RecVolPrf < AV20RecVolMn ) && ( AV22Volmn == 0 ) )
            {
               AV23Msg_cv += httpContext.getMessage( "Se ha encontrado un Volumen inferior al Minimo de la maquina.", "") + GXutil.chr( (short)(13)) ;
               AV22Volmn = (byte)(1) ;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         if ( ( AV22Volmn == 0 ) && ( AV21Volmx == 0 ) )
         {
            AV23Msg_cv += httpContext.getMessage( "Se ha realizado control a los volumens de los procesos. Ok¡¡¡", "") + GXutil.chr( (short)(13)) ;
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = prec2.this.A396EmprCod;
      this.aP1[0] = prec2.this.AV8BarCod;
      this.aP2[0] = prec2.this.AV9Barcodreo;
      this.aP3[0] = prec2.this.AV10Barcodpar;
      this.aP4[0] = prec2.this.AV11usurcod;
      this.aP5[0] = prec2.this.AV12Reclinmaq;
      this.aP6[0] = prec2.this.AV13Msg_v;
      this.aP7[0] = prec2.this.AV14Rectotkgm;
      this.aP8[0] = prec2.this.AV16Rectotpie;
      this.aP9[0] = prec2.this.AV15RecTotMtr;
      this.aP10[0] = prec2.this.AV17OldMaqcod;
      this.aP11[0] = prec2.this.AV18Maqcod;
      this.aP12[0] = prec2.this.AV19RecVolMx;
      this.aP13[0] = prec2.this.AV20RecVolMn;
      this.aP14[0] = prec2.this.AV25Recvolprd;
      this.aP15[0] = prec2.this.Gx_mode;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int2 = new byte[1] ;
      scmdbuf = "" ;
      P03DR2_A396EmprCod = new String[] {""} ;
      P03DR2_A602MaqCod = new String[] {""} ;
      P03DR2_A623MaqVolMax = new int[1] ;
      P03DR2_n623MaqVolMax = new boolean[] {false} ;
      P03DR2_A625MaqVolMin = new int[1] ;
      P03DR2_n625MaqVolMin = new boolean[] {false} ;
      P03DR2_A624MaqVolMed = new int[1] ;
      P03DR2_n624MaqVolMed = new boolean[] {false} ;
      A602MaqCod = "" ;
      AV23Msg_cv = "" ;
      P03DR3_A396EmprCod = new String[] {""} ;
      P03DR3_A2804RecLinMaq = new short[1] ;
      P03DR3_A130BarCodPar = new String[] {""} ;
      P03DR3_A132BarCodReo = new byte[1] ;
      P03DR3_A129BarCod = new int[1] ;
      P03DR3_A4695RecVolPrf = new int[1] ;
      P03DR3_A1273RecLinPro = new byte[1] ;
      A130BarCodPar = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.prec2__default(),
         new Object[] {
             new Object[] {
            P03DR2_A396EmprCod, P03DR2_A602MaqCod, P03DR2_A623MaqVolMax, P03DR2_n623MaqVolMax, P03DR2_A625MaqVolMin, P03DR2_n625MaqVolMin, P03DR2_A624MaqVolMed, P03DR2_n624MaqVolMed
            }
            , new Object[] {
            P03DR3_A396EmprCod, P03DR3_A2804RecLinMaq, P03DR3_A130BarCodPar, P03DR3_A132BarCodReo, P03DR3_A129BarCod, P03DR3_A4695RecVolPrf, P03DR3_A1273RecLinPro
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV9Barcodreo ;
   private byte AV26Centra ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte AV21Volmx ;
   private byte AV22Volmn ;
   private byte A132BarCodReo ;
   private byte A1273RecLinPro ;
   private short AV12Reclinmaq ;
   private short A2804RecLinMaq ;
   private short Gx_err ;
   private int AV8BarCod ;
   private int AV16Rectotpie ;
   private int AV19RecVolMx ;
   private int AV20RecVolMn ;
   private int AV25Recvolprd ;
   private int A623MaqVolMax ;
   private int A625MaqVolMin ;
   private int A624MaqVolMed ;
   private int AV24RecVolMd ;
   private int A129BarCod ;
   private int A4695RecVolPrf ;
   private java.math.BigDecimal AV14Rectotkgm ;
   private java.math.BigDecimal AV15RecTotMtr ;
   private String A396EmprCod ;
   private String AV10Barcodpar ;
   private String AV11usurcod ;
   private String AV13Msg_v ;
   private String AV17OldMaqcod ;
   private String AV18Maqcod ;
   private String Gx_mode ;
   private String scmdbuf ;
   private String A602MaqCod ;
   private String AV23Msg_cv ;
   private String A130BarCodPar ;
   private boolean n623MaqVolMax ;
   private boolean n625MaqVolMin ;
   private boolean n624MaqVolMed ;
   private String[] aP15 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private short[] aP5 ;
   private String[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private int[] aP8 ;
   private java.math.BigDecimal[] aP9 ;
   private String[] aP10 ;
   private String[] aP11 ;
   private int[] aP12 ;
   private int[] aP13 ;
   private int[] aP14 ;
   private IDataStoreProvider pr_default ;
   private String[] P03DR2_A396EmprCod ;
   private String[] P03DR2_A602MaqCod ;
   private int[] P03DR2_A623MaqVolMax ;
   private boolean[] P03DR2_n623MaqVolMax ;
   private int[] P03DR2_A625MaqVolMin ;
   private boolean[] P03DR2_n625MaqVolMin ;
   private int[] P03DR2_A624MaqVolMed ;
   private boolean[] P03DR2_n624MaqVolMed ;
   private String[] P03DR3_A396EmprCod ;
   private short[] P03DR3_A2804RecLinMaq ;
   private String[] P03DR3_A130BarCodPar ;
   private byte[] P03DR3_A132BarCodReo ;
   private int[] P03DR3_A129BarCod ;
   private int[] P03DR3_A4695RecVolPrf ;
   private byte[] P03DR3_A1273RecLinPro ;
}

final  class prec2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03DR2", "SELECT EmprCod, MaqCod, MaqVolMax, MaqVolMin, MaqVolMed FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P03DR3", "SELECT EmprCod, RecLinMaq, BarCodPar, BarCodReo, BarCod, RecVolPrf, RecLinPro FROM TXPCRECET WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
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
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
      }
   }

}

