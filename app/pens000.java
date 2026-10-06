package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pens000 extends GXProcedure
{
   public pens000( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pens000.class ), "" );
   }

   public pens000( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            String[] aP2 ,
                            String[] aP3 ,
                            short[] aP4 ,
                            String[] aP5 ,
                            String[] aP6 ,
                            String[] aP7 ,
                            String[] aP8 ,
                            String[] aP9 ,
                            String[] aP10 ,
                            String[] aP11 ,
                            short[] aP12 ,
                            short[] aP13 ,
                            short[] aP14 ,
                            short[] aP15 ,
                            short[] aP16 )
   {
      pens000.this.aP17 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17);
      return aP17[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 ,
                        String[] aP9 ,
                        String[] aP10 ,
                        String[] aP11 ,
                        short[] aP12 ,
                        short[] aP13 ,
                        short[] aP14 ,
                        short[] aP15 ,
                        short[] aP16 ,
                        short[] aP17 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             String[] aP10 ,
                             String[] aP11 ,
                             short[] aP12 ,
                             short[] aP13 ,
                             short[] aP14 ,
                             short[] aP15 ,
                             short[] aP16 ,
                             short[] aP17 )
   {
      pens000.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pens000.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pens000.this.A65ArtCod = aP2[0];
      this.aP2 = aP2;
      pens000.this.AV22Lb_artdsc = aP3[0];
      this.aP3 = aP3;
      pens000.this.AV20Lb_tipArt = aP4[0];
      this.aP4 = aP4;
      pens000.this.AV21Lb_DscArt = aP5[0];
      this.aP5 = aP5;
      pens000.this.AV23Lb_Tra1 = aP6[0];
      this.aP6 = aP6;
      pens000.this.AV24Lb_Tra2 = aP7[0];
      this.aP7 = aP7;
      pens000.this.AV25Lb_Tra3 = aP8[0];
      this.aP8 = aP8;
      pens000.this.AV26Lb_Tra4 = aP9[0];
      this.aP9 = aP9;
      pens000.this.AV27Lb_Tra5 = aP10[0];
      this.aP10 = aP10;
      pens000.this.AV28Lb_Tra6 = aP11[0];
      this.aP11 = aP11;
      pens000.this.AV29Lb_TraP1 = aP12[0];
      this.aP12 = aP12;
      pens000.this.AV30Lb_TraP2 = aP13[0];
      this.aP13 = aP13;
      pens000.this.AV31Lb_TraP3 = aP14[0];
      this.aP14 = aP14;
      pens000.this.AV32Lb_TraP4 = aP15[0];
      this.aP15 = aP15;
      pens000.this.AV33Lb_TraP5 = aP16[0];
      this.aP16 = aP16;
      pens000.this.AV34Lb_TraP6 = aP17[0];
      this.aP17 = aP17;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV21Lb_DscArt = "" ;
      AV22Lb_artdsc = "" ;
      AV20Lb_tipArt = (short)(0) ;
      /* Using cursor P01T32 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A829TipArtCod = P01T32_A829TipArtCod[0] ;
         A830TipArtDsc = P01T32_A830TipArtDsc[0] ;
         n830TipArtDsc = P01T32_n830TipArtDsc[0] ;
         A69ArtDsc = P01T32_A69ArtDsc[0] ;
         n69ArtDsc = P01T32_n69ArtDsc[0] ;
         A105ArtTra1 = P01T32_A105ArtTra1[0] ;
         n105ArtTra1 = P01T32_n105ArtTra1[0] ;
         A106ArtTra2 = P01T32_A106ArtTra2[0] ;
         n106ArtTra2 = P01T32_n106ArtTra2[0] ;
         A107ArtTra3 = P01T32_A107ArtTra3[0] ;
         n107ArtTra3 = P01T32_n107ArtTra3[0] ;
         A111ArtUrd1 = P01T32_A111ArtUrd1[0] ;
         n111ArtUrd1 = P01T32_n111ArtUrd1[0] ;
         A112ArtUrd2 = P01T32_A112ArtUrd2[0] ;
         n112ArtUrd2 = P01T32_n112ArtUrd2[0] ;
         A113ArtUrd3 = P01T32_A113ArtUrd3[0] ;
         n113ArtUrd3 = P01T32_n113ArtUrd3[0] ;
         A108ArtTraP1 = P01T32_A108ArtTraP1[0] ;
         n108ArtTraP1 = P01T32_n108ArtTraP1[0] ;
         A109ArtTraP2 = P01T32_A109ArtTraP2[0] ;
         n109ArtTraP2 = P01T32_n109ArtTraP2[0] ;
         A110ArtTraP3 = P01T32_A110ArtTraP3[0] ;
         n110ArtTraP3 = P01T32_n110ArtTraP3[0] ;
         A114ArtUrdP1 = P01T32_A114ArtUrdP1[0] ;
         n114ArtUrdP1 = P01T32_n114ArtUrdP1[0] ;
         A115ArtUrdP2 = P01T32_A115ArtUrdP2[0] ;
         n115ArtUrdP2 = P01T32_n115ArtUrdP2[0] ;
         A116ArtUrdP3 = P01T32_A116ArtUrdP3[0] ;
         n116ArtUrdP3 = P01T32_n116ArtUrdP3[0] ;
         A830TipArtDsc = P01T32_A830TipArtDsc[0] ;
         n830TipArtDsc = P01T32_n830TipArtDsc[0] ;
         AV20Lb_tipArt = A829TipArtCod ;
         AV21Lb_DscArt = A830TipArtDsc ;
         AV22Lb_artdsc = A69ArtDsc ;
         AV23Lb_Tra1 = A105ArtTra1 ;
         AV24Lb_Tra2 = A106ArtTra2 ;
         AV25Lb_Tra3 = A107ArtTra3 ;
         AV26Lb_Tra4 = A111ArtUrd1 ;
         AV27Lb_Tra5 = A112ArtUrd2 ;
         AV28Lb_Tra6 = A113ArtUrd3 ;
         AV29Lb_TraP1 = A108ArtTraP1 ;
         AV30Lb_TraP2 = A109ArtTraP2 ;
         AV31Lb_TraP3 = A110ArtTraP3 ;
         AV32Lb_TraP4 = A114ArtUrdP1 ;
         AV33Lb_TraP5 = A115ArtUrdP2 ;
         AV34Lb_TraP6 = A116ArtUrdP3 ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pens000.this.A396EmprCod;
      this.aP1[0] = pens000.this.A252CliCod;
      this.aP2[0] = pens000.this.A65ArtCod;
      this.aP3[0] = pens000.this.AV22Lb_artdsc;
      this.aP4[0] = pens000.this.AV20Lb_tipArt;
      this.aP5[0] = pens000.this.AV21Lb_DscArt;
      this.aP6[0] = pens000.this.AV23Lb_Tra1;
      this.aP7[0] = pens000.this.AV24Lb_Tra2;
      this.aP8[0] = pens000.this.AV25Lb_Tra3;
      this.aP9[0] = pens000.this.AV26Lb_Tra4;
      this.aP10[0] = pens000.this.AV27Lb_Tra5;
      this.aP11[0] = pens000.this.AV28Lb_Tra6;
      this.aP12[0] = pens000.this.AV29Lb_TraP1;
      this.aP13[0] = pens000.this.AV30Lb_TraP2;
      this.aP14[0] = pens000.this.AV31Lb_TraP3;
      this.aP15[0] = pens000.this.AV32Lb_TraP4;
      this.aP16[0] = pens000.this.AV33Lb_TraP5;
      this.aP17[0] = pens000.this.AV34Lb_TraP6;
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
      P01T32_A396EmprCod = new String[] {""} ;
      P01T32_A252CliCod = new int[1] ;
      P01T32_A65ArtCod = new String[] {""} ;
      P01T32_A829TipArtCod = new short[1] ;
      P01T32_A830TipArtDsc = new String[] {""} ;
      P01T32_n830TipArtDsc = new boolean[] {false} ;
      P01T32_A69ArtDsc = new String[] {""} ;
      P01T32_n69ArtDsc = new boolean[] {false} ;
      P01T32_A105ArtTra1 = new String[] {""} ;
      P01T32_n105ArtTra1 = new boolean[] {false} ;
      P01T32_A106ArtTra2 = new String[] {""} ;
      P01T32_n106ArtTra2 = new boolean[] {false} ;
      P01T32_A107ArtTra3 = new String[] {""} ;
      P01T32_n107ArtTra3 = new boolean[] {false} ;
      P01T32_A111ArtUrd1 = new String[] {""} ;
      P01T32_n111ArtUrd1 = new boolean[] {false} ;
      P01T32_A112ArtUrd2 = new String[] {""} ;
      P01T32_n112ArtUrd2 = new boolean[] {false} ;
      P01T32_A113ArtUrd3 = new String[] {""} ;
      P01T32_n113ArtUrd3 = new boolean[] {false} ;
      P01T32_A108ArtTraP1 = new short[1] ;
      P01T32_n108ArtTraP1 = new boolean[] {false} ;
      P01T32_A109ArtTraP2 = new short[1] ;
      P01T32_n109ArtTraP2 = new boolean[] {false} ;
      P01T32_A110ArtTraP3 = new short[1] ;
      P01T32_n110ArtTraP3 = new boolean[] {false} ;
      P01T32_A114ArtUrdP1 = new short[1] ;
      P01T32_n114ArtUrdP1 = new boolean[] {false} ;
      P01T32_A115ArtUrdP2 = new short[1] ;
      P01T32_n115ArtUrdP2 = new boolean[] {false} ;
      P01T32_A116ArtUrdP3 = new short[1] ;
      P01T32_n116ArtUrdP3 = new boolean[] {false} ;
      A830TipArtDsc = "" ;
      A69ArtDsc = "" ;
      A105ArtTra1 = "" ;
      A106ArtTra2 = "" ;
      A107ArtTra3 = "" ;
      A111ArtUrd1 = "" ;
      A112ArtUrd2 = "" ;
      A113ArtUrd3 = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pens000__default(),
         new Object[] {
             new Object[] {
            P01T32_A396EmprCod, P01T32_A252CliCod, P01T32_A65ArtCod, P01T32_A829TipArtCod, P01T32_A830TipArtDsc, P01T32_n830TipArtDsc, P01T32_A69ArtDsc, P01T32_n69ArtDsc, P01T32_A105ArtTra1, P01T32_n105ArtTra1,
            P01T32_A106ArtTra2, P01T32_n106ArtTra2, P01T32_A107ArtTra3, P01T32_n107ArtTra3, P01T32_A111ArtUrd1, P01T32_n111ArtUrd1, P01T32_A112ArtUrd2, P01T32_n112ArtUrd2, P01T32_A113ArtUrd3, P01T32_n113ArtUrd3,
            P01T32_A108ArtTraP1, P01T32_n108ArtTraP1, P01T32_A109ArtTraP2, P01T32_n109ArtTraP2, P01T32_A110ArtTraP3, P01T32_n110ArtTraP3, P01T32_A114ArtUrdP1, P01T32_n114ArtUrdP1, P01T32_A115ArtUrdP2, P01T32_n115ArtUrdP2,
            P01T32_A116ArtUrdP3, P01T32_n116ArtUrdP3
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV20Lb_tipArt ;
   private short AV29Lb_TraP1 ;
   private short AV30Lb_TraP2 ;
   private short AV31Lb_TraP3 ;
   private short AV32Lb_TraP4 ;
   private short AV33Lb_TraP5 ;
   private short AV34Lb_TraP6 ;
   private short A829TipArtCod ;
   private short A108ArtTraP1 ;
   private short A109ArtTraP2 ;
   private short A110ArtTraP3 ;
   private short A114ArtUrdP1 ;
   private short A115ArtUrdP2 ;
   private short A116ArtUrdP3 ;
   private short Gx_err ;
   private int A252CliCod ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String AV22Lb_artdsc ;
   private String AV21Lb_DscArt ;
   private String AV23Lb_Tra1 ;
   private String AV24Lb_Tra2 ;
   private String AV25Lb_Tra3 ;
   private String AV26Lb_Tra4 ;
   private String AV27Lb_Tra5 ;
   private String AV28Lb_Tra6 ;
   private String scmdbuf ;
   private String A830TipArtDsc ;
   private String A69ArtDsc ;
   private String A105ArtTra1 ;
   private String A106ArtTra2 ;
   private String A107ArtTra3 ;
   private String A111ArtUrd1 ;
   private String A112ArtUrd2 ;
   private String A113ArtUrd3 ;
   private boolean n830TipArtDsc ;
   private boolean n69ArtDsc ;
   private boolean n105ArtTra1 ;
   private boolean n106ArtTra2 ;
   private boolean n107ArtTra3 ;
   private boolean n111ArtUrd1 ;
   private boolean n112ArtUrd2 ;
   private boolean n113ArtUrd3 ;
   private boolean n108ArtTraP1 ;
   private boolean n109ArtTraP2 ;
   private boolean n110ArtTraP3 ;
   private boolean n114ArtUrdP1 ;
   private boolean n115ArtUrdP2 ;
   private boolean n116ArtUrdP3 ;
   private short[] aP17 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private String[] aP8 ;
   private String[] aP9 ;
   private String[] aP10 ;
   private String[] aP11 ;
   private short[] aP12 ;
   private short[] aP13 ;
   private short[] aP14 ;
   private short[] aP15 ;
   private short[] aP16 ;
   private IDataStoreProvider pr_default ;
   private String[] P01T32_A396EmprCod ;
   private int[] P01T32_A252CliCod ;
   private String[] P01T32_A65ArtCod ;
   private short[] P01T32_A829TipArtCod ;
   private String[] P01T32_A830TipArtDsc ;
   private boolean[] P01T32_n830TipArtDsc ;
   private String[] P01T32_A69ArtDsc ;
   private boolean[] P01T32_n69ArtDsc ;
   private String[] P01T32_A105ArtTra1 ;
   private boolean[] P01T32_n105ArtTra1 ;
   private String[] P01T32_A106ArtTra2 ;
   private boolean[] P01T32_n106ArtTra2 ;
   private String[] P01T32_A107ArtTra3 ;
   private boolean[] P01T32_n107ArtTra3 ;
   private String[] P01T32_A111ArtUrd1 ;
   private boolean[] P01T32_n111ArtUrd1 ;
   private String[] P01T32_A112ArtUrd2 ;
   private boolean[] P01T32_n112ArtUrd2 ;
   private String[] P01T32_A113ArtUrd3 ;
   private boolean[] P01T32_n113ArtUrd3 ;
   private short[] P01T32_A108ArtTraP1 ;
   private boolean[] P01T32_n108ArtTraP1 ;
   private short[] P01T32_A109ArtTraP2 ;
   private boolean[] P01T32_n109ArtTraP2 ;
   private short[] P01T32_A110ArtTraP3 ;
   private boolean[] P01T32_n110ArtTraP3 ;
   private short[] P01T32_A114ArtUrdP1 ;
   private boolean[] P01T32_n114ArtUrdP1 ;
   private short[] P01T32_A115ArtUrdP2 ;
   private boolean[] P01T32_n115ArtUrdP2 ;
   private short[] P01T32_A116ArtUrdP3 ;
   private boolean[] P01T32_n116ArtUrdP3 ;
}

final  class pens000__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01T32", "SELECT T1.EmprCod, T1.CliCod, T1.ArtCod, T1.TipArtCod, T2.TipArtDsc, T1.ArtDsc, T1.ArtTra1, T1.ArtTra2, T1.ArtTra3, T1.ArtUrd1, T1.ArtUrd2, T1.ArtUrd3, T1.ArtTraP1, T1.ArtTraP2, T1.ArtTraP3, T1.ArtUrdP1, T1.ArtUrdP2, T1.ArtUrdP3 FROM (TXPARTICU T1 INNER JOIN TXPTIPART T2 ON T2.EmprCod = T1.EmprCod AND T2.TipArtCod = T1.TipArtCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ArtCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 26);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 4);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 4);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 4);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(10, 4);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 4);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(12, 4);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((short[]) buf[20])[0] = rslt.getShort(13);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((short[]) buf[22])[0] = rslt.getShort(14);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((short[]) buf[24])[0] = rslt.getShort(15);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((short[]) buf[26])[0] = rslt.getShort(16);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((short[]) buf[28])[0] = rslt.getShort(17);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((short[]) buf[30])[0] = rslt.getShort(18);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
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
      }
   }

}

