package app.pedidos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class obtenerdatosentradaalmacen extends GXProcedure
{
   public obtenerdatosentradaalmacen( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( obtenerdatosentradaalmacen.class ), "" );
   }

   public obtenerdatosentradaalmacen( int remoteHandle ,
                                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String aP0 ,
                                           int aP1 ,
                                           int aP2 ,
                                           int[] aP3 ,
                                           int[] aP4 ,
                                           String[] aP5 ,
                                           java.math.BigDecimal[] aP6 ,
                                           java.math.BigDecimal[] aP7 ,
                                           java.math.BigDecimal[] aP8 ,
                                           java.math.BigDecimal[] aP9 ,
                                           int[] aP10 ,
                                           String[] aP11 ,
                                           String[] aP12 ,
                                           int[] aP13 ,
                                           short[] aP14 ,
                                           short[] aP15 ,
                                           java.math.BigDecimal[] aP16 ,
                                           int[] aP17 )
   {
      obtenerdatosentradaalmacen.this.aP18 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18);
      return aP18[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        int aP2 ,
                        int[] aP3 ,
                        int[] aP4 ,
                        String[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        java.math.BigDecimal[] aP8 ,
                        java.math.BigDecimal[] aP9 ,
                        int[] aP10 ,
                        String[] aP11 ,
                        String[] aP12 ,
                        int[] aP13 ,
                        short[] aP14 ,
                        short[] aP15 ,
                        java.math.BigDecimal[] aP16 ,
                        int[] aP17 ,
                        java.math.BigDecimal[] aP18 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             int aP2 ,
                             int[] aP3 ,
                             int[] aP4 ,
                             String[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             java.math.BigDecimal[] aP9 ,
                             int[] aP10 ,
                             String[] aP11 ,
                             String[] aP12 ,
                             int[] aP13 ,
                             short[] aP14 ,
                             short[] aP15 ,
                             java.math.BigDecimal[] aP16 ,
                             int[] aP17 ,
                             java.math.BigDecimal[] aP18 )
   {
      obtenerdatosentradaalmacen.this.A396EmprCod = aP0;
      obtenerdatosentradaalmacen.this.A361DisCod = aP1;
      obtenerdatosentradaalmacen.this.AV8ALbreccod = aP2;
      obtenerdatosentradaalmacen.this.aP3 = aP3;
      obtenerdatosentradaalmacen.this.aP4 = aP4;
      obtenerdatosentradaalmacen.this.aP5 = aP5;
      obtenerdatosentradaalmacen.this.aP6 = aP6;
      obtenerdatosentradaalmacen.this.aP7 = aP7;
      obtenerdatosentradaalmacen.this.aP8 = aP8;
      obtenerdatosentradaalmacen.this.aP9 = aP9;
      obtenerdatosentradaalmacen.this.aP10 = aP10;
      obtenerdatosentradaalmacen.this.aP11 = aP11;
      obtenerdatosentradaalmacen.this.aP12 = aP12;
      obtenerdatosentradaalmacen.this.aP13 = aP13;
      obtenerdatosentradaalmacen.this.aP14 = aP14;
      obtenerdatosentradaalmacen.this.aP15 = aP15;
      obtenerdatosentradaalmacen.this.aP16 = aP16;
      obtenerdatosentradaalmacen.this.aP17 = aP17;
      obtenerdatosentradaalmacen.this.aP18 = aP18;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV24AlbPmPPza = DecimalUtil.ZERO ;
      AV9albrunient = DecimalUtil.ZERO ;
      AV10AlbRUniUti = DecimalUtil.ZERO ;
      AV11AlbRUni = "" ;
      AV12AlbRPieEnt = 0 ;
      AV13AlbRPieUti = 0 ;
      AV14kilos = DecimalUtil.ZERO ;
      AV15metros = DecimalUtil.ZERO ;
      AV16Piezas = 0 ;
      AV17ALbRlote = "" ;
      AV18AlbRreo = "NO" ;
      AV19clicod = 0 ;
      AV20albrec = (short)(0) ;
      AV21disalb = (short)(0) ;
      AV22UniEnt = DecimalUtil.ZERO ;
      AV23PieEnt = 0 ;
      AV27GXLvl18 = (byte)(0) ;
      /* Using cursor P0AG92 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(AV8ALbreccod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A44AlbRecCod = P0AG92_A44AlbRecCod[0] ;
         A58AlbRUniEnt = P0AG92_A58AlbRUniEnt[0] ;
         A60AlbRUniUti = P0AG92_A60AlbRUniUti[0] ;
         A56AlbRUni = P0AG92_A56AlbRUni[0] ;
         A52AlbRPieEnt = P0AG92_A52AlbRPieEnt[0] ;
         A54AlbRPieUti = P0AG92_A54AlbRPieUti[0] ;
         A595Kilos = P0AG92_A595Kilos[0] ;
         A631Metros = P0AG92_A631Metros[0] ;
         A673Piezas = P0AG92_A673Piezas[0] ;
         A6463AlbRLote = P0AG92_A6463AlbRLote[0] ;
         A55AlbRReo = P0AG92_A55AlbRReo[0] ;
         A252CliCod = P0AG92_A252CliCod[0] ;
         A4290AlbPmPPza = P0AG92_A4290AlbPmPPza[0] ;
         A58AlbRUniEnt = P0AG92_A58AlbRUniEnt[0] ;
         A60AlbRUniUti = P0AG92_A60AlbRUniUti[0] ;
         A56AlbRUni = P0AG92_A56AlbRUni[0] ;
         A52AlbRPieEnt = P0AG92_A52AlbRPieEnt[0] ;
         A54AlbRPieUti = P0AG92_A54AlbRPieUti[0] ;
         A6463AlbRLote = P0AG92_A6463AlbRLote[0] ;
         A55AlbRReo = P0AG92_A55AlbRReo[0] ;
         A252CliCod = P0AG92_A252CliCod[0] ;
         A4290AlbPmPPza = P0AG92_A4290AlbPmPPza[0] ;
         AV27GXLvl18 = (byte)(1) ;
         AV9albrunient = A58AlbRUniEnt ;
         AV10AlbRUniUti = A60AlbRUniUti ;
         AV11AlbRUni = A56AlbRUni ;
         AV12AlbRPieEnt = A52AlbRPieEnt ;
         AV13AlbRPieUti = A54AlbRPieUti ;
         AV14kilos = A595Kilos ;
         AV15metros = A631Metros ;
         AV16Piezas = A673Piezas ;
         AV17ALbRlote = A6463AlbRLote ;
         AV18AlbRreo = A55AlbRReo ;
         AV19clicod = A252CliCod ;
         AV21disalb = (short)(1) ;
         AV20albrec = (short)(1) ;
         AV22UniEnt = ((GXutil.strcmp(A56AlbRUni, "K")==0) ? A595Kilos : A631Metros) ;
         AV23PieEnt = A673Piezas ;
         AV24AlbPmPPza = A4290AlbPmPPza ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV27GXLvl18 == 0 )
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
      AV20albrec = (short)(0) ;
      /* Using cursor P0AG93 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV8ALbreccod)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A44AlbRecCod = P0AG93_A44AlbRecCod[0] ;
         A52AlbRPieEnt = P0AG93_A52AlbRPieEnt[0] ;
         A54AlbRPieUti = P0AG93_A54AlbRPieUti[0] ;
         A58AlbRUniEnt = P0AG93_A58AlbRUniEnt[0] ;
         A60AlbRUniUti = P0AG93_A60AlbRUniUti[0] ;
         A252CliCod = P0AG93_A252CliCod[0] ;
         A56AlbRUni = P0AG93_A56AlbRUni[0] ;
         A6463AlbRLote = P0AG93_A6463AlbRLote[0] ;
         A55AlbRReo = P0AG93_A55AlbRReo[0] ;
         A4290AlbPmPPza = P0AG93_A4290AlbPmPPza[0] ;
         AV12AlbRPieEnt = A52AlbRPieEnt ;
         AV13AlbRPieUti = A54AlbRPieUti ;
         AV9albrunient = A58AlbRUniEnt ;
         AV10AlbRUniUti = A60AlbRUniUti ;
         AV22UniEnt = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
         AV23PieEnt = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
         AV19clicod = A252CliCod ;
         AV11AlbRUni = A56AlbRUni ;
         AV20albrec = (short)(1) ;
         AV17ALbRlote = A6463AlbRLote ;
         AV18AlbRreo = A55AlbRReo ;
         AV20albrec = (short)(1) ;
         AV24AlbPmPPza = A4290AlbPmPPza ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = obtenerdatosentradaalmacen.this.AV12AlbRPieEnt;
      this.aP4[0] = obtenerdatosentradaalmacen.this.AV13AlbRPieUti;
      this.aP5[0] = obtenerdatosentradaalmacen.this.AV11AlbRUni;
      this.aP6[0] = obtenerdatosentradaalmacen.this.AV9albrunient;
      this.aP7[0] = obtenerdatosentradaalmacen.this.AV10AlbRUniUti;
      this.aP8[0] = obtenerdatosentradaalmacen.this.AV14kilos;
      this.aP9[0] = obtenerdatosentradaalmacen.this.AV15metros;
      this.aP10[0] = obtenerdatosentradaalmacen.this.AV16Piezas;
      this.aP11[0] = obtenerdatosentradaalmacen.this.AV17ALbRlote;
      this.aP12[0] = obtenerdatosentradaalmacen.this.AV18AlbRreo;
      this.aP13[0] = obtenerdatosentradaalmacen.this.AV19clicod;
      this.aP14[0] = obtenerdatosentradaalmacen.this.AV20albrec;
      this.aP15[0] = obtenerdatosentradaalmacen.this.AV21disalb;
      this.aP16[0] = obtenerdatosentradaalmacen.this.AV22UniEnt;
      this.aP17[0] = obtenerdatosentradaalmacen.this.AV23PieEnt;
      this.aP18[0] = obtenerdatosentradaalmacen.this.AV24AlbPmPPza;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV11AlbRUni = "" ;
      AV9albrunient = DecimalUtil.ZERO ;
      AV10AlbRUniUti = DecimalUtil.ZERO ;
      AV14kilos = DecimalUtil.ZERO ;
      AV15metros = DecimalUtil.ZERO ;
      AV17ALbRlote = "" ;
      AV18AlbRreo = "" ;
      AV22UniEnt = DecimalUtil.ZERO ;
      AV24AlbPmPPza = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P0AG92_A396EmprCod = new String[] {""} ;
      P0AG92_A361DisCod = new int[1] ;
      P0AG92_A44AlbRecCod = new int[1] ;
      P0AG92_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AG92_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AG92_A56AlbRUni = new String[] {""} ;
      P0AG92_A52AlbRPieEnt = new int[1] ;
      P0AG92_A54AlbRPieUti = new int[1] ;
      P0AG92_A595Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AG92_A631Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AG92_A673Piezas = new int[1] ;
      P0AG92_A6463AlbRLote = new String[] {""} ;
      P0AG92_A55AlbRReo = new String[] {""} ;
      P0AG92_A252CliCod = new int[1] ;
      P0AG92_A4290AlbPmPPza = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A56AlbRUni = "" ;
      A595Kilos = DecimalUtil.ZERO ;
      A631Metros = DecimalUtil.ZERO ;
      A6463AlbRLote = "" ;
      A55AlbRReo = "" ;
      A4290AlbPmPPza = DecimalUtil.ZERO ;
      P0AG93_A396EmprCod = new String[] {""} ;
      P0AG93_A44AlbRecCod = new int[1] ;
      P0AG93_A52AlbRPieEnt = new int[1] ;
      P0AG93_A54AlbRPieUti = new int[1] ;
      P0AG93_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AG93_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AG93_A252CliCod = new int[1] ;
      P0AG93_A56AlbRUni = new String[] {""} ;
      P0AG93_A6463AlbRLote = new String[] {""} ;
      P0AG93_A55AlbRReo = new String[] {""} ;
      P0AG93_A4290AlbPmPPza = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidos.obtenerdatosentradaalmacen__default(),
         new Object[] {
             new Object[] {
            P0AG92_A396EmprCod, P0AG92_A361DisCod, P0AG92_A44AlbRecCod, P0AG92_A58AlbRUniEnt, P0AG92_A60AlbRUniUti, P0AG92_A56AlbRUni, P0AG92_A52AlbRPieEnt, P0AG92_A54AlbRPieUti, P0AG92_A595Kilos, P0AG92_A631Metros,
            P0AG92_A673Piezas, P0AG92_A6463AlbRLote, P0AG92_A55AlbRReo, P0AG92_A252CliCod, P0AG92_A4290AlbPmPPza
            }
            , new Object[] {
            P0AG93_A396EmprCod, P0AG93_A44AlbRecCod, P0AG93_A52AlbRPieEnt, P0AG93_A54AlbRPieUti, P0AG93_A58AlbRUniEnt, P0AG93_A60AlbRUniUti, P0AG93_A252CliCod, P0AG93_A56AlbRUni, P0AG93_A6463AlbRLote, P0AG93_A55AlbRReo,
            P0AG93_A4290AlbPmPPza
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV27GXLvl18 ;
   private short AV20albrec ;
   private short AV21disalb ;
   private short Gx_err ;
   private int A361DisCod ;
   private int AV8ALbreccod ;
   private int AV12AlbRPieEnt ;
   private int AV13AlbRPieUti ;
   private int AV16Piezas ;
   private int AV19clicod ;
   private int AV23PieEnt ;
   private int A44AlbRecCod ;
   private int A52AlbRPieEnt ;
   private int A54AlbRPieUti ;
   private int A673Piezas ;
   private int A252CliCod ;
   private java.math.BigDecimal AV9albrunient ;
   private java.math.BigDecimal AV10AlbRUniUti ;
   private java.math.BigDecimal AV14kilos ;
   private java.math.BigDecimal AV15metros ;
   private java.math.BigDecimal AV22UniEnt ;
   private java.math.BigDecimal AV24AlbPmPPza ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A595Kilos ;
   private java.math.BigDecimal A631Metros ;
   private java.math.BigDecimal A4290AlbPmPPza ;
   private String A396EmprCod ;
   private String AV11AlbRUni ;
   private String AV17ALbRlote ;
   private String AV18AlbRreo ;
   private String scmdbuf ;
   private String A56AlbRUni ;
   private String A6463AlbRLote ;
   private String A55AlbRReo ;
   private boolean returnInSub ;
   private java.math.BigDecimal[] aP18 ;
   private int[] aP3 ;
   private int[] aP4 ;
   private String[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private java.math.BigDecimal[] aP8 ;
   private java.math.BigDecimal[] aP9 ;
   private int[] aP10 ;
   private String[] aP11 ;
   private String[] aP12 ;
   private int[] aP13 ;
   private short[] aP14 ;
   private short[] aP15 ;
   private java.math.BigDecimal[] aP16 ;
   private int[] aP17 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AG92_A396EmprCod ;
   private int[] P0AG92_A361DisCod ;
   private int[] P0AG92_A44AlbRecCod ;
   private java.math.BigDecimal[] P0AG92_A58AlbRUniEnt ;
   private java.math.BigDecimal[] P0AG92_A60AlbRUniUti ;
   private String[] P0AG92_A56AlbRUni ;
   private int[] P0AG92_A52AlbRPieEnt ;
   private int[] P0AG92_A54AlbRPieUti ;
   private java.math.BigDecimal[] P0AG92_A595Kilos ;
   private java.math.BigDecimal[] P0AG92_A631Metros ;
   private int[] P0AG92_A673Piezas ;
   private String[] P0AG92_A6463AlbRLote ;
   private String[] P0AG92_A55AlbRReo ;
   private int[] P0AG92_A252CliCod ;
   private java.math.BigDecimal[] P0AG92_A4290AlbPmPPza ;
   private String[] P0AG93_A396EmprCod ;
   private int[] P0AG93_A44AlbRecCod ;
   private int[] P0AG93_A52AlbRPieEnt ;
   private int[] P0AG93_A54AlbRPieUti ;
   private java.math.BigDecimal[] P0AG93_A58AlbRUniEnt ;
   private java.math.BigDecimal[] P0AG93_A60AlbRUniUti ;
   private int[] P0AG93_A252CliCod ;
   private String[] P0AG93_A56AlbRUni ;
   private String[] P0AG93_A6463AlbRLote ;
   private String[] P0AG93_A55AlbRReo ;
   private java.math.BigDecimal[] P0AG93_A4290AlbPmPPza ;
}

final  class obtenerdatosentradaalmacen__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AG92", "SELECT T1.EmprCod, T1.DisCod, T1.AlbRecCod, T2.AlbRUniEnt, T2.AlbRUniUti, T2.AlbRUni, T2.AlbRPieEnt, T2.AlbRPieUti, T1.Kilos, T1.Metros, T1.Piezas, T2.AlbRLote, T2.AlbRReo, T2.CliCod, T2.AlbPmPPza FROM (TXPDISALB T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.DisCod = ? and T1.AlbRecCod = ? ORDER BY T1.EmprCod, T1.DisCod, T1.AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AG93", "SELECT EmprCod, AlbRecCod, AlbRPieEnt, AlbRPieUti, AlbRUniEnt, AlbRUniUti, CliCod, AlbRUni, AlbRLote, AlbRReo, AlbPmPPza FROM TXPALBREC WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 20);
               ((String[]) buf[12])[0] = rslt.getString(13, 2);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((String[]) buf[8])[0] = rslt.getString(9, 20);
               ((String[]) buf[9])[0] = rslt.getString(10, 2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,3);
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
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

