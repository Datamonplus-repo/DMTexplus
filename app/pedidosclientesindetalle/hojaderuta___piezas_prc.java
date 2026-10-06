package app.pedidosclientesindetalle ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class hojaderuta___piezas_prc extends GXProcedure
{
   public hojaderuta___piezas_prc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( hojaderuta___piezas_prc.class ), "" );
   }

   public hojaderuta___piezas_prc( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String aP0 ,
                                           int aP1 ,
                                           byte aP2 ,
                                           String aP3 ,
                                           int aP4 ,
                                           String aP5 ,
                                           java.math.BigDecimal[] aP6 ,
                                           java.math.BigDecimal[] aP7 ,
                                           int[] aP8 ,
                                           short[] aP9 ,
                                           short[] aP10 ,
                                           java.math.BigDecimal[] aP11 ,
                                           int[] aP12 ,
                                           java.math.BigDecimal[] aP13 ,
                                           int[] aP14 ,
                                           int[] aP15 ,
                                           java.math.BigDecimal[] aP16 ,
                                           java.math.BigDecimal[] aP17 ,
                                           int[] aP18 )
   {
      hojaderuta___piezas_prc.this.aP19 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19);
      return aP19[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        int aP4 ,
                        String aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        int[] aP8 ,
                        short[] aP9 ,
                        short[] aP10 ,
                        java.math.BigDecimal[] aP11 ,
                        int[] aP12 ,
                        java.math.BigDecimal[] aP13 ,
                        int[] aP14 ,
                        int[] aP15 ,
                        java.math.BigDecimal[] aP16 ,
                        java.math.BigDecimal[] aP17 ,
                        int[] aP18 ,
                        java.math.BigDecimal[] aP19 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             int aP4 ,
                             String aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             int[] aP8 ,
                             short[] aP9 ,
                             short[] aP10 ,
                             java.math.BigDecimal[] aP11 ,
                             int[] aP12 ,
                             java.math.BigDecimal[] aP13 ,
                             int[] aP14 ,
                             int[] aP15 ,
                             java.math.BigDecimal[] aP16 ,
                             java.math.BigDecimal[] aP17 ,
                             int[] aP18 ,
                             java.math.BigDecimal[] aP19 )
   {
      hojaderuta___piezas_prc.this.AV8emprcod = aP0;
      hojaderuta___piezas_prc.this.AV9barcod = aP1;
      hojaderuta___piezas_prc.this.AV10barcodreo = aP2;
      hojaderuta___piezas_prc.this.AV11barcodpar = aP3;
      hojaderuta___piezas_prc.this.AV12ALbreccod = aP4;
      hojaderuta___piezas_prc.this.AV15BarUnimed = aP5;
      hojaderuta___piezas_prc.this.aP6 = aP6;
      hojaderuta___piezas_prc.this.aP7 = aP7;
      hojaderuta___piezas_prc.this.aP8 = aP8;
      hojaderuta___piezas_prc.this.aP9 = aP9;
      hojaderuta___piezas_prc.this.aP10 = aP10;
      hojaderuta___piezas_prc.this.aP11 = aP11;
      hojaderuta___piezas_prc.this.aP12 = aP12;
      hojaderuta___piezas_prc.this.aP13 = aP13;
      hojaderuta___piezas_prc.this.aP14 = aP14;
      hojaderuta___piezas_prc.this.aP15 = aP15;
      hojaderuta___piezas_prc.this.aP16 = aP16;
      hojaderuta___piezas_prc.this.aP17 = aP17;
      hojaderuta___piezas_prc.this.aP18 = aP18;
      hojaderuta___piezas_prc.this.aP19 = aP19;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV19barpie = (short)(0) ;
      AV20ALbrec = (short)(0) ;
      AV24oldbarpiekil = DecimalUtil.doubleToDec(0) ;
      AV23oldbarpiemet = DecimalUtil.doubleToDec(0) ;
      AV25oldbarpiepie = 0 ;
      AV13Barpiekil = DecimalUtil.doubleToDec(0) ;
      AV14barpiemet = DecimalUtil.doubleToDec(0) ;
      AV16Barpiepie = 0 ;
      AV26Albrunient = DecimalUtil.doubleToDec(0) ;
      AV28AlbRPieent = 0 ;
      AV21AlbRUniUti = DecimalUtil.doubleToDec(0) ;
      AV22AlbRPieUti = 0 ;
      AV31GXLvl13 = (byte)(0) ;
      /* Using cursor P0AGN2 */
      pr_default.execute(0, new Object[] {AV8emprcod, Integer.valueOf(AV9barcod), Byte.valueOf(AV10barcodreo), AV11barcodpar, Integer.valueOf(AV12ALbreccod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A44AlbRecCod = P0AGN2_A44AlbRecCod[0] ;
         A130BarCodPar = P0AGN2_A130BarCodPar[0] ;
         A132BarCodReo = P0AGN2_A132BarCodReo[0] ;
         A129BarCod = P0AGN2_A129BarCod[0] ;
         A396EmprCod = P0AGN2_A396EmprCod[0] ;
         A203BarPieKil = P0AGN2_A203BarPieKil[0] ;
         A205BarPieMet = P0AGN2_A205BarPieMet[0] ;
         A1501BarPiePie = P0AGN2_A1501BarPiePie[0] ;
         A54AlbRPieUti = P0AGN2_A54AlbRPieUti[0] ;
         A52AlbRPieEnt = P0AGN2_A52AlbRPieEnt[0] ;
         A60AlbRUniUti = P0AGN2_A60AlbRUniUti[0] ;
         A58AlbRUniEnt = P0AGN2_A58AlbRUniEnt[0] ;
         A200BarPieCod = P0AGN2_A200BarPieCod[0] ;
         A54AlbRPieUti = P0AGN2_A54AlbRPieUti[0] ;
         A52AlbRPieEnt = P0AGN2_A52AlbRPieEnt[0] ;
         A60AlbRUniUti = P0AGN2_A60AlbRUniUti[0] ;
         A58AlbRUniEnt = P0AGN2_A58AlbRUniEnt[0] ;
         A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
         {
            A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
         }
         else
         {
            if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            }
            else
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            }
         }
         AV31GXLvl13 = (byte)(1) ;
         AV13Barpiekil = A203BarPieKil ;
         AV14barpiemet = A205BarPieMet ;
         AV16Barpiepie = A1501BarPiePie ;
         AV24oldbarpiekil = A203BarPieKil ;
         AV23oldbarpiemet = A205BarPieMet ;
         AV25oldbarpiepie = A1501BarPiePie ;
         AV19barpie = (short)(1) ;
         AV20ALbrec = (short)(1) ;
         AV26Albrunient = A58AlbRUniEnt ;
         AV28AlbRPieent = A52AlbRPieEnt ;
         AV21AlbRUniUti = A60AlbRUniUti ;
         AV22AlbRPieUti = A54AlbRPieUti ;
         AV17Albrunidis = A57AlbRUniDis ;
         AV18albrpiedis = A51AlbRPieDis ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV31GXLvl13 == 0 )
      {
         /* Execute user subroutine: 'ALBREC' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'ALBREC' Routine */
      returnInSub = false ;
      /* Using cursor P0AGN3 */
      pr_default.execute(1, new Object[] {AV8emprcod, Integer.valueOf(AV12ALbreccod)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A44AlbRecCod = P0AGN3_A44AlbRecCod[0] ;
         A396EmprCod = P0AGN3_A396EmprCod[0] ;
         A54AlbRPieUti = P0AGN3_A54AlbRPieUti[0] ;
         A52AlbRPieEnt = P0AGN3_A52AlbRPieEnt[0] ;
         A60AlbRUniUti = P0AGN3_A60AlbRUniUti[0] ;
         A58AlbRUniEnt = P0AGN3_A58AlbRUniEnt[0] ;
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
         {
            A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
         }
         else
         {
            if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            }
            else
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            }
         }
         A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
         AV26Albrunient = A58AlbRUniEnt ;
         AV28AlbRPieent = A52AlbRPieEnt ;
         AV17Albrunidis = A57AlbRUniDis ;
         AV18albrpiedis = A51AlbRPieDis ;
         AV21AlbRUniUti = A60AlbRUniUti ;
         AV22AlbRPieUti = A54AlbRPieUti ;
         AV19barpie = (short)(0) ;
         AV20ALbrec = (short)(1) ;
         System.out.println( httpContext.getMessage( "Dentro de ALBREC", "") );
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      AV16Barpiepie = AV18albrpiedis ;
      if ( GXutil.strcmp(AV15BarUnimed, "K") == 0 )
      {
         AV13Barpiekil = AV17Albrunidis ;
         AV14barpiemet = DecimalUtil.doubleToDec(0) ;
      }
      else
      {
         AV14barpiemet = AV17Albrunidis ;
         AV13Barpiekil = DecimalUtil.doubleToDec(0) ;
      }
   }

   protected void cleanup( )
   {
      this.aP6[0] = hojaderuta___piezas_prc.this.AV13Barpiekil;
      this.aP7[0] = hojaderuta___piezas_prc.this.AV14barpiemet;
      this.aP8[0] = hojaderuta___piezas_prc.this.AV16Barpiepie;
      this.aP9[0] = hojaderuta___piezas_prc.this.AV20ALbrec;
      this.aP10[0] = hojaderuta___piezas_prc.this.AV19barpie;
      this.aP11[0] = hojaderuta___piezas_prc.this.AV26Albrunient;
      this.aP12[0] = hojaderuta___piezas_prc.this.AV28AlbRPieent;
      this.aP13[0] = hojaderuta___piezas_prc.this.AV21AlbRUniUti;
      this.aP14[0] = hojaderuta___piezas_prc.this.AV22AlbRPieUti;
      this.aP15[0] = hojaderuta___piezas_prc.this.AV25oldbarpiepie;
      this.aP16[0] = hojaderuta___piezas_prc.this.AV24oldbarpiekil;
      this.aP17[0] = hojaderuta___piezas_prc.this.AV23oldbarpiemet;
      this.aP18[0] = hojaderuta___piezas_prc.this.AV18albrpiedis;
      this.aP19[0] = hojaderuta___piezas_prc.this.AV17Albrunidis;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV13Barpiekil = DecimalUtil.ZERO ;
      AV14barpiemet = DecimalUtil.ZERO ;
      AV26Albrunient = DecimalUtil.ZERO ;
      AV21AlbRUniUti = DecimalUtil.ZERO ;
      AV24oldbarpiekil = DecimalUtil.ZERO ;
      AV23oldbarpiemet = DecimalUtil.ZERO ;
      AV17Albrunidis = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P0AGN2_A44AlbRecCod = new int[1] ;
      P0AGN2_A130BarCodPar = new String[] {""} ;
      P0AGN2_A132BarCodReo = new byte[1] ;
      P0AGN2_A129BarCod = new int[1] ;
      P0AGN2_A396EmprCod = new String[] {""} ;
      P0AGN2_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGN2_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGN2_A1501BarPiePie = new int[1] ;
      P0AGN2_A54AlbRPieUti = new int[1] ;
      P0AGN2_A52AlbRPieEnt = new int[1] ;
      P0AGN2_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGN2_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGN2_A200BarPieCod = new String[] {""} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A203BarPieKil = DecimalUtil.ZERO ;
      A205BarPieMet = DecimalUtil.ZERO ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A200BarPieCod = "" ;
      A57AlbRUniDis = DecimalUtil.ZERO ;
      P0AGN3_A44AlbRecCod = new int[1] ;
      P0AGN3_A396EmprCod = new String[] {""} ;
      P0AGN3_A54AlbRPieUti = new int[1] ;
      P0AGN3_A52AlbRPieEnt = new int[1] ;
      P0AGN3_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGN3_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidosclientesindetalle.hojaderuta___piezas_prc__default(),
         new Object[] {
             new Object[] {
            P0AGN2_A44AlbRecCod, P0AGN2_A130BarCodPar, P0AGN2_A132BarCodReo, P0AGN2_A129BarCod, P0AGN2_A396EmprCod, P0AGN2_A203BarPieKil, P0AGN2_A205BarPieMet, P0AGN2_A1501BarPiePie, P0AGN2_A54AlbRPieUti, P0AGN2_A52AlbRPieEnt,
            P0AGN2_A60AlbRUniUti, P0AGN2_A58AlbRUniEnt, P0AGN2_A200BarPieCod
            }
            , new Object[] {
            P0AGN3_A44AlbRecCod, P0AGN3_A396EmprCod, P0AGN3_A54AlbRPieUti, P0AGN3_A52AlbRPieEnt, P0AGN3_A60AlbRUniUti, P0AGN3_A58AlbRUniEnt
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10barcodreo ;
   private byte AV31GXLvl13 ;
   private byte A132BarCodReo ;
   private short AV20ALbrec ;
   private short AV19barpie ;
   private short Gx_err ;
   private int AV9barcod ;
   private int AV12ALbreccod ;
   private int AV16Barpiepie ;
   private int AV28AlbRPieent ;
   private int AV22AlbRPieUti ;
   private int AV25oldbarpiepie ;
   private int AV18albrpiedis ;
   private int A44AlbRecCod ;
   private int A129BarCod ;
   private int A1501BarPiePie ;
   private int A54AlbRPieUti ;
   private int A52AlbRPieEnt ;
   private int A51AlbRPieDis ;
   private java.math.BigDecimal AV13Barpiekil ;
   private java.math.BigDecimal AV14barpiemet ;
   private java.math.BigDecimal AV26Albrunient ;
   private java.math.BigDecimal AV21AlbRUniUti ;
   private java.math.BigDecimal AV24oldbarpiekil ;
   private java.math.BigDecimal AV23oldbarpiemet ;
   private java.math.BigDecimal AV17Albrunidis ;
   private java.math.BigDecimal A203BarPieKil ;
   private java.math.BigDecimal A205BarPieMet ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A57AlbRUniDis ;
   private String AV8emprcod ;
   private String AV11barcodpar ;
   private String AV15BarUnimed ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A200BarPieCod ;
   private boolean returnInSub ;
   private java.math.BigDecimal[] aP19 ;
   private java.math.BigDecimal[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private int[] aP8 ;
   private short[] aP9 ;
   private short[] aP10 ;
   private java.math.BigDecimal[] aP11 ;
   private int[] aP12 ;
   private java.math.BigDecimal[] aP13 ;
   private int[] aP14 ;
   private int[] aP15 ;
   private java.math.BigDecimal[] aP16 ;
   private java.math.BigDecimal[] aP17 ;
   private int[] aP18 ;
   private IDataStoreProvider pr_default ;
   private int[] P0AGN2_A44AlbRecCod ;
   private String[] P0AGN2_A130BarCodPar ;
   private byte[] P0AGN2_A132BarCodReo ;
   private int[] P0AGN2_A129BarCod ;
   private String[] P0AGN2_A396EmprCod ;
   private java.math.BigDecimal[] P0AGN2_A203BarPieKil ;
   private java.math.BigDecimal[] P0AGN2_A205BarPieMet ;
   private int[] P0AGN2_A1501BarPiePie ;
   private int[] P0AGN2_A54AlbRPieUti ;
   private int[] P0AGN2_A52AlbRPieEnt ;
   private java.math.BigDecimal[] P0AGN2_A60AlbRUniUti ;
   private java.math.BigDecimal[] P0AGN2_A58AlbRUniEnt ;
   private String[] P0AGN2_A200BarPieCod ;
   private int[] P0AGN3_A44AlbRecCod ;
   private String[] P0AGN3_A396EmprCod ;
   private int[] P0AGN3_A54AlbRPieUti ;
   private int[] P0AGN3_A52AlbRPieEnt ;
   private java.math.BigDecimal[] P0AGN3_A60AlbRUniUti ;
   private java.math.BigDecimal[] P0AGN3_A58AlbRUniEnt ;
}

final  class hojaderuta___piezas_prc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AGN2", "SELECT T1.AlbRecCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T1.BarPieKil, T1.BarPieMet, T1.BarPiePie, T2.AlbRPieUti, T2.AlbRPieEnt, T2.AlbRUniUti, T2.AlbRUniEnt, T1.BarPieCod FROM (TXPBARPIE T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.AlbRecCod = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AGN3", "SELECT AlbRecCod, EmprCod, AlbRPieUti, AlbRPieEnt, AlbRUniUti, AlbRUniEnt FROM TXPALBREC WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,2);
               ((String[]) buf[12])[0] = rslt.getString(13, 9);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
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
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

