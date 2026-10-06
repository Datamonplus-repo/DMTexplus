package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppaviver extends GXProcedure
{
   public ppaviver( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppaviver.class ), "" );
   }

   public ppaviver( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          String[] aP2 ,
                          int[] aP3 ,
                          byte[] aP4 ,
                          short[] aP5 ,
                          String[] aP6 ,
                          short[] aP7 ,
                          String[] aP8 ,
                          short[] aP9 ,
                          String[] aP10 ,
                          short[] aP11 ,
                          String[] aP12 ,
                          int[] aP13 ,
                          int[] aP14 ,
                          String[] aP15 ,
                          String[] aP16 ,
                          String[] aP17 ,
                          int[] aP18 )
   {
      ppaviver.this.aP19 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19);
      return aP19[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        int[] aP3 ,
                        byte[] aP4 ,
                        short[] aP5 ,
                        String[] aP6 ,
                        short[] aP7 ,
                        String[] aP8 ,
                        short[] aP9 ,
                        String[] aP10 ,
                        short[] aP11 ,
                        String[] aP12 ,
                        int[] aP13 ,
                        int[] aP14 ,
                        String[] aP15 ,
                        String[] aP16 ,
                        String[] aP17 ,
                        int[] aP18 ,
                        int[] aP19 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             int[] aP3 ,
                             byte[] aP4 ,
                             short[] aP5 ,
                             String[] aP6 ,
                             short[] aP7 ,
                             String[] aP8 ,
                             short[] aP9 ,
                             String[] aP10 ,
                             short[] aP11 ,
                             String[] aP12 ,
                             int[] aP13 ,
                             int[] aP14 ,
                             String[] aP15 ,
                             String[] aP16 ,
                             String[] aP17 ,
                             int[] aP18 ,
                             int[] aP19 )
   {
      ppaviver.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppaviver.this.AV8Clicod = aP1[0];
      this.aP1 = aP1;
      ppaviver.this.AV9Barser = aP2[0];
      this.aP2 = aP2;
      ppaviver.this.AV10Fornumcol = aP3[0];
      this.aP3 = aP3;
      ppaviver.this.AV11Bartipcol = aP4[0];
      this.aP4 = aP4;
      ppaviver.this.AV31TipARtCod = aP5[0];
      this.aP5 = aP5;
      ppaviver.this.AV13Bartra1 = aP6[0];
      this.aP6 = aP6;
      ppaviver.this.AV16bartrap1 = aP7[0];
      this.aP7 = aP7;
      ppaviver.this.AV14Bartra2 = aP8[0];
      this.aP8 = aP8;
      ppaviver.this.AV17bartrap2 = aP9[0];
      this.aP9 = aP9;
      ppaviver.this.AV15Bartra3 = aP10[0];
      this.aP10 = aP10;
      ppaviver.this.AV18bartrap3 = aP11[0];
      this.aP11 = aP11;
      ppaviver.this.AV19Fascod = aP12[0];
      this.aP12 = aP12;
      ppaviver.this.AV20Fornumcoli = aP13[0];
      this.aP13 = aP13;
      ppaviver.this.AV21fornumcolf = aP14[0];
      this.aP14 = aP14;
      ppaviver.this.AV22Baracaqui = aP15[0];
      this.aP15 = aP15;
      ppaviver.this.AV23Seccodf = aP16[0];
      this.aP16 = aP16;
      ppaviver.this.AV25AviProcod = aP17[0];
      this.aP17 = aP17;
      ppaviver.this.AV26AviForNfi = aP18[0];
      this.aP18 = aP18;
      ppaviver.this.AV27AviForNff = aP19[0];
      this.aP19 = aP19;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV12Bartipart = (short)(0) ;
      /* Using cursor P03WE2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8Clicod), AV9Barser});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A65ArtCod = P03WE2_A65ArtCod[0] ;
         A252CliCod = P03WE2_A252CliCod[0] ;
         A4295ClasCod = P03WE2_A4295ClasCod[0] ;
         n4295ClasCod = P03WE2_n4295ClasCod[0] ;
         AV12Bartipart = A4295ClasCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV24Num_a = 0 ;
      /* Optimized group. */
      /* Using cursor P03WE3 */
      pr_default.execute(1, new Object[] {A396EmprCod, AV19Fascod, Integer.valueOf(AV8Clicod), AV9Barser, Integer.valueOf(AV10Fornumcol), Byte.valueOf(AV11Bartipcol), Short.valueOf(AV12Bartipart), AV13Bartra1, Short.valueOf(AV16bartrap1), AV14Bartra2, Short.valueOf(AV17bartrap2), AV15Bartra3, Short.valueOf(AV18bartrap3), AV22Baracaqui, AV23Seccodf, Integer.valueOf(AV20Fornumcoli), Integer.valueOf(AV20Fornumcoli), Integer.valueOf(AV21fornumcolf), Integer.valueOf(AV21fornumcolf), AV25AviProcod, Integer.valueOf(AV26AviForNfi), Integer.valueOf(AV26AviForNfi), Integer.valueOf(AV27AviForNff), Integer.valueOf(AV27AviForNff)});
      cV24Num_a = P03WE3_AV24Num_a[0] ;
      pr_default.close(1);
      AV24Num_a = (int)(AV24Num_a+cV24Num_a*1) ;
      /* End optimized group. */
      if ( AV24Num_a > 0 )
      {
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppaviver.this.A396EmprCod;
      this.aP1[0] = ppaviver.this.AV8Clicod;
      this.aP2[0] = ppaviver.this.AV9Barser;
      this.aP3[0] = ppaviver.this.AV10Fornumcol;
      this.aP4[0] = ppaviver.this.AV11Bartipcol;
      this.aP5[0] = ppaviver.this.AV31TipARtCod;
      this.aP6[0] = ppaviver.this.AV13Bartra1;
      this.aP7[0] = ppaviver.this.AV16bartrap1;
      this.aP8[0] = ppaviver.this.AV14Bartra2;
      this.aP9[0] = ppaviver.this.AV17bartrap2;
      this.aP10[0] = ppaviver.this.AV15Bartra3;
      this.aP11[0] = ppaviver.this.AV18bartrap3;
      this.aP12[0] = ppaviver.this.AV19Fascod;
      this.aP13[0] = ppaviver.this.AV20Fornumcoli;
      this.aP14[0] = ppaviver.this.AV21fornumcolf;
      this.aP15[0] = ppaviver.this.AV22Baracaqui;
      this.aP16[0] = ppaviver.this.AV23Seccodf;
      this.aP17[0] = ppaviver.this.AV25AviProcod;
      this.aP18[0] = ppaviver.this.AV26AviForNfi;
      this.aP19[0] = ppaviver.this.AV27AviForNff;
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
      P03WE2_A396EmprCod = new String[] {""} ;
      P03WE2_A65ArtCod = new String[] {""} ;
      P03WE2_A252CliCod = new int[1] ;
      P03WE2_A4295ClasCod = new short[1] ;
      P03WE2_n4295ClasCod = new boolean[] {false} ;
      A65ArtCod = "" ;
      P03WE3_AV24Num_a = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppaviver__default(),
         new Object[] {
             new Object[] {
            P03WE2_A396EmprCod, P03WE2_A65ArtCod, P03WE2_A252CliCod, P03WE2_A4295ClasCod, P03WE2_n4295ClasCod
            }
            , new Object[] {
            P03WE3_AV24Num_a
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV11Bartipcol ;
   private short AV31TipARtCod ;
   private short AV16bartrap1 ;
   private short AV17bartrap2 ;
   private short AV18bartrap3 ;
   private short AV12Bartipart ;
   private short A4295ClasCod ;
   private short Gx_err ;
   private int AV8Clicod ;
   private int AV10Fornumcol ;
   private int AV20Fornumcoli ;
   private int AV21fornumcolf ;
   private int AV26AviForNfi ;
   private int AV27AviForNff ;
   private int A252CliCod ;
   private int AV24Num_a ;
   private int cV24Num_a ;
   private String A396EmprCod ;
   private String AV9Barser ;
   private String AV13Bartra1 ;
   private String AV14Bartra2 ;
   private String AV15Bartra3 ;
   private String AV19Fascod ;
   private String AV22Baracaqui ;
   private String AV23Seccodf ;
   private String AV25AviProcod ;
   private String scmdbuf ;
   private String A65ArtCod ;
   private boolean n4295ClasCod ;
   private int[] aP19 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private int[] aP3 ;
   private byte[] aP4 ;
   private short[] aP5 ;
   private String[] aP6 ;
   private short[] aP7 ;
   private String[] aP8 ;
   private short[] aP9 ;
   private String[] aP10 ;
   private short[] aP11 ;
   private String[] aP12 ;
   private int[] aP13 ;
   private int[] aP14 ;
   private String[] aP15 ;
   private String[] aP16 ;
   private String[] aP17 ;
   private int[] aP18 ;
   private IDataStoreProvider pr_default ;
   private String[] P03WE2_A396EmprCod ;
   private String[] P03WE2_A65ArtCod ;
   private int[] P03WE2_A252CliCod ;
   private short[] P03WE2_A4295ClasCod ;
   private boolean[] P03WE2_n4295ClasCod ;
   private int[] P03WE3_AV24Num_a ;
}

final  class ppaviver__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03WE2", "SELECT EmprCod, ArtCod, CliCod, ClasCod FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P03WE3", "SELECT COUNT(*) FROM (TXPAVI001 T1 INNER JOIN TXPAVI000 T2 ON T2.EmprCod = T1.EmprCod AND T2.AviNumero = T1.AviNumero) WHERE (T1.EmprCod = ? and T1.FasCod = ?) AND (T2.AviCliCod = ? or (T2.AviCliCod = 0)) AND (? = T2.AviBarSer or (rtrim(T2.AviBarSer) IS NULL AND NOT(T2.AviBarSer IS NULL))) AND (? = T2.AviForNum or (T2.AviForNum = 0)) AND (? = T2.AviBarTip or (T2.AviBarTip = 0)) AND (? = T2.AviBarArt or (T2.AviBarArt = 0)) AND (? = T2.AviBarT1 or (rtrim(T2.AviBarT1) IS NULL AND NOT(T2.AviBarT1 IS NULL))) AND (? = T2.AviBarTP1 or (T2.AviBarTP1 = 0)) AND (? = T2.AviBarT2 or (rtrim(T2.AviBarT2) IS NULL AND NOT(T2.AviBarT2 IS NULL))) AND (? = T2.AviBarTP2 or (T2.AviBarTP2 = 0)) AND (? = T2.AviBarT3 or (rtrim(T2.AviBarT3) IS NULL AND NOT(T2.AviBarT3 IS NULL))) AND (? = T2.AviBarTP3 or (T2.AviBarTP3 = 0)) AND (? = T2.AviBarAca or (rtrim(T2.AviBarAca) IS NULL AND NOT(T2.AviBarAca IS NULL))) AND (? = T2.AviSecCod or (rtrim(T2.AviSecCod) IS NULL AND NOT(T2.AviSecCod IS NULL))) AND (T2.AviForNum >= ? or (? = 0)) AND (T2.AviForNum <= ? or (? = 0)) AND (? = T2.AviProcod or (rtrim(T2.AviProcod) IS NULL AND NOT(T2.AviProcod IS NULL))) AND (T2.AviForNfi >= ? or (? = 0)) AND (T2.AviForNff <= ? or (? = 0)) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
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
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setString(8, (String)parms[7], 4);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setString(10, (String)parms[9], 4);
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               stmt.setString(12, (String)parms[11], 4);
               stmt.setShort(13, ((Number) parms[12]).shortValue());
               stmt.setString(14, (String)parms[13], 6);
               stmt.setString(15, (String)parms[14], 2);
               stmt.setInt(16, ((Number) parms[15]).intValue());
               stmt.setInt(17, ((Number) parms[16]).intValue());
               stmt.setInt(18, ((Number) parms[17]).intValue());
               stmt.setInt(19, ((Number) parms[18]).intValue());
               stmt.setString(20, (String)parms[19], 8);
               stmt.setInt(21, ((Number) parms[20]).intValue());
               stmt.setInt(22, ((Number) parms[21]).intValue());
               stmt.setInt(23, ((Number) parms[22]).intValue());
               stmt.setInt(24, ((Number) parms[23]).intValue());
               return;
      }
   }

}

