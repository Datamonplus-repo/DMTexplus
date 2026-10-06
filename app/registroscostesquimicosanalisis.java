package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class registroscostesquimicosanalisis extends GXProcedure
{
   public registroscostesquimicosanalisis( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( registroscostesquimicosanalisis.class ), "" );
   }

   public registroscostesquimicosanalisis( int remoteHandle ,
                                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public long executeUdp( String aP0 ,
                           String aP1 ,
                           java.util.Date aP2 ,
                           java.util.Date aP3 ,
                           short aP4 ,
                           int aP5 ,
                           byte aP6 ,
                           String aP7 ,
                           String aP8 ,
                           String aP9 ,
                           String aP10 ,
                           String aP11 ,
                           int aP12 ,
                           int aP13 ,
                           int aP14 ,
                           int aP15 ,
                           byte aP16 ,
                           byte aP17 ,
                           short aP18 ,
                           short aP19 ,
                           byte aP20 ,
                           byte aP21 )
   {
      registroscostesquimicosanalisis.this.aP22 = new long[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22);
      return aP22[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        java.util.Date aP2 ,
                        java.util.Date aP3 ,
                        short aP4 ,
                        int aP5 ,
                        byte aP6 ,
                        String aP7 ,
                        String aP8 ,
                        String aP9 ,
                        String aP10 ,
                        String aP11 ,
                        int aP12 ,
                        int aP13 ,
                        int aP14 ,
                        int aP15 ,
                        byte aP16 ,
                        byte aP17 ,
                        short aP18 ,
                        short aP19 ,
                        byte aP20 ,
                        byte aP21 ,
                        long[] aP22 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             java.util.Date aP2 ,
                             java.util.Date aP3 ,
                             short aP4 ,
                             int aP5 ,
                             byte aP6 ,
                             String aP7 ,
                             String aP8 ,
                             String aP9 ,
                             String aP10 ,
                             String aP11 ,
                             int aP12 ,
                             int aP13 ,
                             int aP14 ,
                             int aP15 ,
                             byte aP16 ,
                             byte aP17 ,
                             short aP18 ,
                             short aP19 ,
                             byte aP20 ,
                             byte aP21 ,
                             long[] aP22 )
   {
      registroscostesquimicosanalisis.this.AV14Emprcod = aP0;
      registroscostesquimicosanalisis.this.AV31HreRacab = aP1;
      registroscostesquimicosanalisis.this.AV16Fecha = aP2;
      registroscostesquimicosanalisis.this.AV17Fecha_to = aP3;
      registroscostesquimicosanalisis.this.AV21Calculo = aP4;
      registroscostesquimicosanalisis.this.AV18barcod = aP5;
      registroscostesquimicosanalisis.this.AV19barcodreo = aP6;
      registroscostesquimicosanalisis.this.AV20barcodpar = aP7;
      registroscostesquimicosanalisis.this.AV22ARtcod = aP8;
      registroscostesquimicosanalisis.this.AV23ARtcod_to = aP9;
      registroscostesquimicosanalisis.this.AV24Forcolnom = aP10;
      registroscostesquimicosanalisis.this.AV25Forcolnom_to = aP11;
      registroscostesquimicosanalisis.this.AV26Forcolnum = aP12;
      registroscostesquimicosanalisis.this.AV27Forcolnum_to = aP13;
      registroscostesquimicosanalisis.this.AV32Clicod = aP14;
      registroscostesquimicosanalisis.this.AV33Clicod_to = aP15;
      registroscostesquimicosanalisis.this.AV30Intcod = aP16;
      registroscostesquimicosanalisis.this.AV13Intcod_to = aP17;
      registroscostesquimicosanalisis.this.AV12TipArtCod = aP18;
      registroscostesquimicosanalisis.this.AV11TipArtCod_to = aP19;
      registroscostesquimicosanalisis.this.AV10Tipcolcod = aP20;
      registroscostesquimicosanalisis.this.AV9Tipcolcod_to = aP21;
      registroscostesquimicosanalisis.this.aP22 = aP22;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8NumeroRegistros = 0 ;
      /* Optimized group. */
      /* Using cursor P099W2 */
      pr_default.execute(0, new Object[] {AV14Emprcod, AV16Fecha, AV31HreRacab, AV31HreRacab, Integer.valueOf(AV32Clicod), Integer.valueOf(AV33Clicod_to), AV22ARtcod, AV23ARtcod_to, Short.valueOf(AV12TipArtCod), Short.valueOf(AV11TipArtCod_to), AV24Forcolnom, AV25Forcolnom_to, Integer.valueOf(AV26Forcolnum), Integer.valueOf(AV27Forcolnum_to), Byte.valueOf(AV10Tipcolcod), Byte.valueOf(AV9Tipcolcod_to), Byte.valueOf(AV30Intcod), Byte.valueOf(AV13Intcod_to), Integer.valueOf(AV18barcod), Integer.valueOf(AV18barcod), Byte.valueOf(AV19barcodreo), Byte.valueOf(AV19barcodreo), AV20barcodpar, AV20barcodpar, AV17Fecha_to});
      cV8NumeroRegistros = P099W2_AV8NumeroRegistros[0] ;
      pr_default.close(0);
      AV8NumeroRegistros = (long)(AV8NumeroRegistros+cV8NumeroRegistros*1) ;
      /* End optimized group. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP22[0] = registroscostesquimicosanalisis.this.AV8NumeroRegistros;
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
      P099W2_AV8NumeroRegistros = new long[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.registroscostesquimicosanalisis__default(),
         new Object[] {
             new Object[] {
            P099W2_AV8NumeroRegistros
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV19barcodreo ;
   private byte AV30Intcod ;
   private byte AV13Intcod_to ;
   private byte AV10Tipcolcod ;
   private byte AV9Tipcolcod_to ;
   private short AV21Calculo ;
   private short AV12TipArtCod ;
   private short AV11TipArtCod_to ;
   private short Gx_err ;
   private int AV18barcod ;
   private int AV26Forcolnum ;
   private int AV27Forcolnum_to ;
   private int AV32Clicod ;
   private int AV33Clicod_to ;
   private long AV8NumeroRegistros ;
   private long cV8NumeroRegistros ;
   private String AV14Emprcod ;
   private String AV31HreRacab ;
   private String AV20barcodpar ;
   private String AV22ARtcod ;
   private String AV23ARtcod_to ;
   private String AV24Forcolnom ;
   private String AV25Forcolnom_to ;
   private String scmdbuf ;
   private java.util.Date AV16Fecha ;
   private java.util.Date AV17Fecha_to ;
   private long[] aP22 ;
   private IDataStoreProvider pr_default ;
   private long[] P099W2_AV8NumeroRegistros ;
}

final  class registroscostesquimicosanalisis__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P099W2", "SELECT COUNT(*) FROM TXPHISREH WHERE (EmprCod = ? and HreFecTin >= ?) AND (HreRacab = ? or ? = 'T') AND (CliCod >= ?) AND (CliCod <= ?) AND (HreBarSer >= ?) AND (HreBarSer <= ?) AND (HreTipArt >= ?) AND (HreTipArt <= ?) AND (HreColNom >= ?) AND (HreColNom <= ?) AND (HreColNum >= ?) AND (HreColNum <= ?) AND (HreTipCol >= ?) AND (HreTipCol <= ?) AND (HreIntCod >= ?) AND (HreIntCod <= ?) AND (HreBarCod = ? or (? = 0)) AND (HreBarReo = ? or (? = 0)) AND (HreBarPar = ? or (rtrim(?) IS NULL)) AND (HreFecTin <= ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
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
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setString(3, (String)parms[2], 1);
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setString(7, (String)parms[6], 16);
               stmt.setString(8, (String)parms[7], 16);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               stmt.setString(11, (String)parms[10], 13);
               stmt.setString(12, (String)parms[11], 13);
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setInt(14, ((Number) parms[13]).intValue());
               stmt.setByte(15, ((Number) parms[14]).byteValue());
               stmt.setByte(16, ((Number) parms[15]).byteValue());
               stmt.setByte(17, ((Number) parms[16]).byteValue());
               stmt.setByte(18, ((Number) parms[17]).byteValue());
               stmt.setInt(19, ((Number) parms[18]).intValue());
               stmt.setInt(20, ((Number) parms[19]).intValue());
               stmt.setByte(21, ((Number) parms[20]).byteValue());
               stmt.setByte(22, ((Number) parms[21]).byteValue());
               stmt.setString(23, (String)parms[22], 1);
               stmt.setString(24, (String)parms[23], 1);
               stmt.setDate(25, (java.util.Date)parms[24]);
               return;
      }
   }

}

