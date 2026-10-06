package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class partdih extends GXProcedure
{
   public partdih( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( partdih.class ), "" );
   }

   public partdih( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           String[] aP2 ,
                           short[] aP3 ,
                           String[] aP4 ,
                           String[] aP5 ,
                           String[] aP6 ,
                           String[] aP7 ,
                           short[] aP8 ,
                           short[] aP9 ,
                           short[] aP10 ,
                           String[] aP11 ,
                           String[] aP12 ,
                           String[] aP13 ,
                           short[] aP14 ,
                           short[] aP15 ,
                           short[] aP16 ,
                           String[] aP17 ,
                           String[] aP18 ,
                           String[] aP19 ,
                           byte[] aP20 ,
                           short[] aP21 )
   {
      partdih.this.aP22 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22);
      return aP22[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        short[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        short[] aP8 ,
                        short[] aP9 ,
                        short[] aP10 ,
                        String[] aP11 ,
                        String[] aP12 ,
                        String[] aP13 ,
                        short[] aP14 ,
                        short[] aP15 ,
                        short[] aP16 ,
                        String[] aP17 ,
                        String[] aP18 ,
                        String[] aP19 ,
                        byte[] aP20 ,
                        short[] aP21 ,
                        byte[] aP22 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             short[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             short[] aP8 ,
                             short[] aP9 ,
                             short[] aP10 ,
                             String[] aP11 ,
                             String[] aP12 ,
                             String[] aP13 ,
                             short[] aP14 ,
                             short[] aP15 ,
                             short[] aP16 ,
                             String[] aP17 ,
                             String[] aP18 ,
                             String[] aP19 ,
                             byte[] aP20 ,
                             short[] aP21 ,
                             byte[] aP22 )
   {
      partdih.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      partdih.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      partdih.this.A65ArtCod = aP2[0];
      this.aP2 = aP2;
      partdih.this.AV15DisArtTip = aP3[0];
      this.aP3 = aP3;
      partdih.this.AV16DisArtTr1 = aP4[0];
      this.aP4 = aP4;
      partdih.this.AV32DisArtDsc = aP5[0];
      this.aP5 = aP5;
      partdih.this.AV17DisArtTr2 = aP6[0];
      this.aP6 = aP6;
      partdih.this.AV18DisArtTr3 = aP7[0];
      this.aP7 = aP7;
      partdih.this.AV19DisArtPt1 = aP8[0];
      this.aP8 = aP8;
      partdih.this.AV20DisArtPt2 = aP9[0];
      this.aP9 = aP9;
      partdih.this.AV21DisArtPt3 = aP10[0];
      this.aP10 = aP10;
      partdih.this.AV22DisArtUr1 = aP11[0];
      this.aP11 = aP11;
      partdih.this.AV23DisArtUr2 = aP12[0];
      this.aP12 = aP12;
      partdih.this.AV24DisArtUr3 = aP13[0];
      this.aP13 = aP13;
      partdih.this.AV25DisArtPu1 = aP14[0];
      this.aP14 = aP14;
      partdih.this.AV26DisArtPu2 = aP15[0];
      this.aP15 = aP15;
      partdih.this.AV27DisArtPu3 = aP16[0];
      this.aP16 = aP16;
      partdih.this.AV28DisNMtr = aP17[0];
      this.aP17 = aP17;
      partdih.this.AV33DisArtMat = aP18[0];
      this.aP18 = aP18;
      partdih.this.AV29DisCodTex = aP19[0];
      this.aP19 = aP19;
      partdih.this.AV30DisNumTex1 = aP20[0];
      this.aP20 = aP20;
      partdih.this.AV31DisNumTex2 = aP21[0];
      this.aP21 = aP21;
      partdih.this.AV34Flag = aP22[0];
      this.aP22 = aP22;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV34Flag = (byte)(0) ;
      /* Using cursor P006H2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A69ArtDsc = P006H2_A69ArtDsc[0] ;
         n69ArtDsc = P006H2_n69ArtDsc[0] ;
         A829TipArtCod = P006H2_A829TipArtCod[0] ;
         A105ArtTra1 = P006H2_A105ArtTra1[0] ;
         n105ArtTra1 = P006H2_n105ArtTra1[0] ;
         A106ArtTra2 = P006H2_A106ArtTra2[0] ;
         n106ArtTra2 = P006H2_n106ArtTra2[0] ;
         A107ArtTra3 = P006H2_A107ArtTra3[0] ;
         n107ArtTra3 = P006H2_n107ArtTra3[0] ;
         A108ArtTraP1 = P006H2_A108ArtTraP1[0] ;
         n108ArtTraP1 = P006H2_n108ArtTraP1[0] ;
         A109ArtTraP2 = P006H2_A109ArtTraP2[0] ;
         n109ArtTraP2 = P006H2_n109ArtTraP2[0] ;
         A110ArtTraP3 = P006H2_A110ArtTraP3[0] ;
         n110ArtTraP3 = P006H2_n110ArtTraP3[0] ;
         A111ArtUrd1 = P006H2_A111ArtUrd1[0] ;
         n111ArtUrd1 = P006H2_n111ArtUrd1[0] ;
         A112ArtUrd2 = P006H2_A112ArtUrd2[0] ;
         n112ArtUrd2 = P006H2_n112ArtUrd2[0] ;
         A113ArtUrd3 = P006H2_A113ArtUrd3[0] ;
         n113ArtUrd3 = P006H2_n113ArtUrd3[0] ;
         A114ArtUrdP1 = P006H2_A114ArtUrdP1[0] ;
         n114ArtUrdP1 = P006H2_n114ArtUrdP1[0] ;
         A115ArtUrdP2 = P006H2_A115ArtUrdP2[0] ;
         n115ArtUrdP2 = P006H2_n115ArtUrdP2[0] ;
         A116ArtUrdP3 = P006H2_A116ArtUrdP3[0] ;
         n116ArtUrdP3 = P006H2_n116ArtUrdP3[0] ;
         A967ArtNMtr = P006H2_A967ArtNMtr[0] ;
         n967ArtNMtr = P006H2_n967ArtNMtr[0] ;
         A87ArtMat = P006H2_A87ArtMat[0] ;
         n87ArtMat = P006H2_n87ArtMat[0] ;
         A2707NumTexCod = P006H2_A2707NumTexCod[0] ;
         n2707NumTexCod = P006H2_n2707NumTexCod[0] ;
         A2750ArtNumTex1 = P006H2_A2750ArtNumTex1[0] ;
         n2750ArtNumTex1 = P006H2_n2750ArtNumTex1[0] ;
         A2751ArtNumTex2 = P006H2_A2751ArtNumTex2[0] ;
         n2751ArtNumTex2 = P006H2_n2751ArtNumTex2[0] ;
         AV32DisArtDsc = A69ArtDsc ;
         AV15DisArtTip = A829TipArtCod ;
         AV16DisArtTr1 = A105ArtTra1 ;
         AV17DisArtTr2 = A106ArtTra2 ;
         AV18DisArtTr3 = A107ArtTra3 ;
         AV19DisArtPt1 = A108ArtTraP1 ;
         AV20DisArtPt2 = A109ArtTraP2 ;
         AV21DisArtPt3 = A110ArtTraP3 ;
         AV22DisArtUr1 = A111ArtUrd1 ;
         AV23DisArtUr2 = A112ArtUrd2 ;
         AV24DisArtUr3 = A113ArtUrd3 ;
         AV25DisArtPu1 = A114ArtUrdP1 ;
         AV26DisArtPu2 = A115ArtUrdP2 ;
         AV27DisArtPu3 = A116ArtUrdP3 ;
         AV28DisNMtr = A967ArtNMtr ;
         AV33DisArtMat = A87ArtMat ;
         AV29DisCodTex = A2707NumTexCod ;
         AV30DisNumTex1 = A2750ArtNumTex1 ;
         AV31DisNumTex2 = A2751ArtNumTex2 ;
         AV34Flag = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = partdih.this.A396EmprCod;
      this.aP1[0] = partdih.this.A252CliCod;
      this.aP2[0] = partdih.this.A65ArtCod;
      this.aP3[0] = partdih.this.AV15DisArtTip;
      this.aP4[0] = partdih.this.AV16DisArtTr1;
      this.aP5[0] = partdih.this.AV32DisArtDsc;
      this.aP6[0] = partdih.this.AV17DisArtTr2;
      this.aP7[0] = partdih.this.AV18DisArtTr3;
      this.aP8[0] = partdih.this.AV19DisArtPt1;
      this.aP9[0] = partdih.this.AV20DisArtPt2;
      this.aP10[0] = partdih.this.AV21DisArtPt3;
      this.aP11[0] = partdih.this.AV22DisArtUr1;
      this.aP12[0] = partdih.this.AV23DisArtUr2;
      this.aP13[0] = partdih.this.AV24DisArtUr3;
      this.aP14[0] = partdih.this.AV25DisArtPu1;
      this.aP15[0] = partdih.this.AV26DisArtPu2;
      this.aP16[0] = partdih.this.AV27DisArtPu3;
      this.aP17[0] = partdih.this.AV28DisNMtr;
      this.aP18[0] = partdih.this.AV33DisArtMat;
      this.aP19[0] = partdih.this.AV29DisCodTex;
      this.aP20[0] = partdih.this.AV30DisNumTex1;
      this.aP21[0] = partdih.this.AV31DisNumTex2;
      this.aP22[0] = partdih.this.AV34Flag;
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
      P006H2_A396EmprCod = new String[] {""} ;
      P006H2_A252CliCod = new int[1] ;
      P006H2_A65ArtCod = new String[] {""} ;
      P006H2_A69ArtDsc = new String[] {""} ;
      P006H2_n69ArtDsc = new boolean[] {false} ;
      P006H2_A829TipArtCod = new short[1] ;
      P006H2_A105ArtTra1 = new String[] {""} ;
      P006H2_n105ArtTra1 = new boolean[] {false} ;
      P006H2_A106ArtTra2 = new String[] {""} ;
      P006H2_n106ArtTra2 = new boolean[] {false} ;
      P006H2_A107ArtTra3 = new String[] {""} ;
      P006H2_n107ArtTra3 = new boolean[] {false} ;
      P006H2_A108ArtTraP1 = new short[1] ;
      P006H2_n108ArtTraP1 = new boolean[] {false} ;
      P006H2_A109ArtTraP2 = new short[1] ;
      P006H2_n109ArtTraP2 = new boolean[] {false} ;
      P006H2_A110ArtTraP3 = new short[1] ;
      P006H2_n110ArtTraP3 = new boolean[] {false} ;
      P006H2_A111ArtUrd1 = new String[] {""} ;
      P006H2_n111ArtUrd1 = new boolean[] {false} ;
      P006H2_A112ArtUrd2 = new String[] {""} ;
      P006H2_n112ArtUrd2 = new boolean[] {false} ;
      P006H2_A113ArtUrd3 = new String[] {""} ;
      P006H2_n113ArtUrd3 = new boolean[] {false} ;
      P006H2_A114ArtUrdP1 = new short[1] ;
      P006H2_n114ArtUrdP1 = new boolean[] {false} ;
      P006H2_A115ArtUrdP2 = new short[1] ;
      P006H2_n115ArtUrdP2 = new boolean[] {false} ;
      P006H2_A116ArtUrdP3 = new short[1] ;
      P006H2_n116ArtUrdP3 = new boolean[] {false} ;
      P006H2_A967ArtNMtr = new String[] {""} ;
      P006H2_n967ArtNMtr = new boolean[] {false} ;
      P006H2_A87ArtMat = new String[] {""} ;
      P006H2_n87ArtMat = new boolean[] {false} ;
      P006H2_A2707NumTexCod = new String[] {""} ;
      P006H2_n2707NumTexCod = new boolean[] {false} ;
      P006H2_A2750ArtNumTex1 = new byte[1] ;
      P006H2_n2750ArtNumTex1 = new boolean[] {false} ;
      P006H2_A2751ArtNumTex2 = new short[1] ;
      P006H2_n2751ArtNumTex2 = new boolean[] {false} ;
      A69ArtDsc = "" ;
      A105ArtTra1 = "" ;
      A106ArtTra2 = "" ;
      A107ArtTra3 = "" ;
      A111ArtUrd1 = "" ;
      A112ArtUrd2 = "" ;
      A113ArtUrd3 = "" ;
      A967ArtNMtr = "" ;
      A87ArtMat = "" ;
      A2707NumTexCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.partdih__default(),
         new Object[] {
             new Object[] {
            P006H2_A396EmprCod, P006H2_A252CliCod, P006H2_A65ArtCod, P006H2_A69ArtDsc, P006H2_n69ArtDsc, P006H2_A829TipArtCod, P006H2_A105ArtTra1, P006H2_n105ArtTra1, P006H2_A106ArtTra2, P006H2_n106ArtTra2,
            P006H2_A107ArtTra3, P006H2_n107ArtTra3, P006H2_A108ArtTraP1, P006H2_n108ArtTraP1, P006H2_A109ArtTraP2, P006H2_n109ArtTraP2, P006H2_A110ArtTraP3, P006H2_n110ArtTraP3, P006H2_A111ArtUrd1, P006H2_n111ArtUrd1,
            P006H2_A112ArtUrd2, P006H2_n112ArtUrd2, P006H2_A113ArtUrd3, P006H2_n113ArtUrd3, P006H2_A114ArtUrdP1, P006H2_n114ArtUrdP1, P006H2_A115ArtUrdP2, P006H2_n115ArtUrdP2, P006H2_A116ArtUrdP3, P006H2_n116ArtUrdP3,
            P006H2_A967ArtNMtr, P006H2_n967ArtNMtr, P006H2_A87ArtMat, P006H2_n87ArtMat, P006H2_A2707NumTexCod, P006H2_n2707NumTexCod, P006H2_A2750ArtNumTex1, P006H2_n2750ArtNumTex1, P006H2_A2751ArtNumTex2, P006H2_n2751ArtNumTex2
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV30DisNumTex1 ;
   private byte AV34Flag ;
   private byte A2750ArtNumTex1 ;
   private short AV15DisArtTip ;
   private short AV19DisArtPt1 ;
   private short AV20DisArtPt2 ;
   private short AV21DisArtPt3 ;
   private short AV25DisArtPu1 ;
   private short AV26DisArtPu2 ;
   private short AV27DisArtPu3 ;
   private short AV31DisNumTex2 ;
   private short A829TipArtCod ;
   private short A108ArtTraP1 ;
   private short A109ArtTraP2 ;
   private short A110ArtTraP3 ;
   private short A114ArtUrdP1 ;
   private short A115ArtUrdP2 ;
   private short A116ArtUrdP3 ;
   private short A2751ArtNumTex2 ;
   private short Gx_err ;
   private int A252CliCod ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String AV16DisArtTr1 ;
   private String AV32DisArtDsc ;
   private String AV17DisArtTr2 ;
   private String AV18DisArtTr3 ;
   private String AV22DisArtUr1 ;
   private String AV23DisArtUr2 ;
   private String AV24DisArtUr3 ;
   private String AV28DisNMtr ;
   private String AV33DisArtMat ;
   private String AV29DisCodTex ;
   private String scmdbuf ;
   private String A69ArtDsc ;
   private String A105ArtTra1 ;
   private String A106ArtTra2 ;
   private String A107ArtTra3 ;
   private String A111ArtUrd1 ;
   private String A112ArtUrd2 ;
   private String A113ArtUrd3 ;
   private String A967ArtNMtr ;
   private String A87ArtMat ;
   private String A2707NumTexCod ;
   private boolean n69ArtDsc ;
   private boolean n105ArtTra1 ;
   private boolean n106ArtTra2 ;
   private boolean n107ArtTra3 ;
   private boolean n108ArtTraP1 ;
   private boolean n109ArtTraP2 ;
   private boolean n110ArtTraP3 ;
   private boolean n111ArtUrd1 ;
   private boolean n112ArtUrd2 ;
   private boolean n113ArtUrd3 ;
   private boolean n114ArtUrdP1 ;
   private boolean n115ArtUrdP2 ;
   private boolean n116ArtUrdP3 ;
   private boolean n967ArtNMtr ;
   private boolean n87ArtMat ;
   private boolean n2707NumTexCod ;
   private boolean n2750ArtNumTex1 ;
   private boolean n2751ArtNumTex2 ;
   private byte[] aP22 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private short[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private short[] aP8 ;
   private short[] aP9 ;
   private short[] aP10 ;
   private String[] aP11 ;
   private String[] aP12 ;
   private String[] aP13 ;
   private short[] aP14 ;
   private short[] aP15 ;
   private short[] aP16 ;
   private String[] aP17 ;
   private String[] aP18 ;
   private String[] aP19 ;
   private byte[] aP20 ;
   private short[] aP21 ;
   private IDataStoreProvider pr_default ;
   private String[] P006H2_A396EmprCod ;
   private int[] P006H2_A252CliCod ;
   private String[] P006H2_A65ArtCod ;
   private String[] P006H2_A69ArtDsc ;
   private boolean[] P006H2_n69ArtDsc ;
   private short[] P006H2_A829TipArtCod ;
   private String[] P006H2_A105ArtTra1 ;
   private boolean[] P006H2_n105ArtTra1 ;
   private String[] P006H2_A106ArtTra2 ;
   private boolean[] P006H2_n106ArtTra2 ;
   private String[] P006H2_A107ArtTra3 ;
   private boolean[] P006H2_n107ArtTra3 ;
   private short[] P006H2_A108ArtTraP1 ;
   private boolean[] P006H2_n108ArtTraP1 ;
   private short[] P006H2_A109ArtTraP2 ;
   private boolean[] P006H2_n109ArtTraP2 ;
   private short[] P006H2_A110ArtTraP3 ;
   private boolean[] P006H2_n110ArtTraP3 ;
   private String[] P006H2_A111ArtUrd1 ;
   private boolean[] P006H2_n111ArtUrd1 ;
   private String[] P006H2_A112ArtUrd2 ;
   private boolean[] P006H2_n112ArtUrd2 ;
   private String[] P006H2_A113ArtUrd3 ;
   private boolean[] P006H2_n113ArtUrd3 ;
   private short[] P006H2_A114ArtUrdP1 ;
   private boolean[] P006H2_n114ArtUrdP1 ;
   private short[] P006H2_A115ArtUrdP2 ;
   private boolean[] P006H2_n115ArtUrdP2 ;
   private short[] P006H2_A116ArtUrdP3 ;
   private boolean[] P006H2_n116ArtUrdP3 ;
   private String[] P006H2_A967ArtNMtr ;
   private boolean[] P006H2_n967ArtNMtr ;
   private String[] P006H2_A87ArtMat ;
   private boolean[] P006H2_n87ArtMat ;
   private String[] P006H2_A2707NumTexCod ;
   private boolean[] P006H2_n2707NumTexCod ;
   private byte[] P006H2_A2750ArtNumTex1 ;
   private boolean[] P006H2_n2750ArtNumTex1 ;
   private short[] P006H2_A2751ArtNumTex2 ;
   private boolean[] P006H2_n2751ArtNumTex2 ;
}

final  class partdih__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P006H2", "SELECT EmprCod, CliCod, ArtCod, ArtDsc, TipArtCod, ArtTra1, ArtTra2, ArtTra3, ArtTraP1, ArtTraP2, ArtTraP3, ArtUrd1, ArtUrd2, ArtUrd3, ArtUrdP1, ArtUrdP2, ArtUrdP3, ArtNMtr, ArtMat, NumTexCod, ArtNumTex1, ArtNumTex2 FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 4);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 4);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(10);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(11);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(12, 4);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(13, 4);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(14, 4);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((short[]) buf[24])[0] = rslt.getShort(15);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((short[]) buf[26])[0] = rslt.getShort(16);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((short[]) buf[28])[0] = rslt.getShort(17);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(18, 10);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(19, 16);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(20, 4);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((byte[]) buf[36])[0] = rslt.getByte(21);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((short[]) buf[38])[0] = rslt.getShort(22);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
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

