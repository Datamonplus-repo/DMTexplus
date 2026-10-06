package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pupdarticulohdr extends GXProcedure
{
   public pupdarticulohdr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pupdarticulohdr.class ), "" );
   }

   public pupdarticulohdr( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
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
                             short[] aP16 )
   {
      pupdarticulohdr.this.aP17 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17);
      return aP17[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
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
                        String[] aP17 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
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
                             String[] aP17 )
   {
      pupdarticulohdr.this.A396EmprCod = aP0;
      pupdarticulohdr.this.A252CliCod = aP1;
      pupdarticulohdr.this.A65ArtCod = aP2;
      pupdarticulohdr.this.aP3 = aP3;
      pupdarticulohdr.this.aP4 = aP4;
      pupdarticulohdr.this.aP5 = aP5;
      pupdarticulohdr.this.aP6 = aP6;
      pupdarticulohdr.this.aP7 = aP7;
      pupdarticulohdr.this.aP8 = aP8;
      pupdarticulohdr.this.aP9 = aP9;
      pupdarticulohdr.this.aP10 = aP10;
      pupdarticulohdr.this.aP11 = aP11;
      pupdarticulohdr.this.aP12 = aP12;
      pupdarticulohdr.this.aP13 = aP13;
      pupdarticulohdr.this.aP14 = aP14;
      pupdarticulohdr.this.aP15 = aP15;
      pupdarticulohdr.this.aP16 = aP16;
      pupdarticulohdr.this.aP17 = aP17;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV16BarSerdsc = "" ;
      AV17Bartipart = (short)(0) ;
      AV18BarTra1 = " " ;
      AV19BarTra2 = " " ;
      AV20BarTra3 = " " ;
      AV21BarTraP1 = (short)(0) ;
      AV22BarTraP2 = (short)(0) ;
      AV23BarTraP3 = (short)(0) ;
      AV24BarUrd1 = " " ;
      AV25BarUrd2 = " " ;
      AV26BarUrd3 = " " ;
      AV27BarUrdP1 = (short)(0) ;
      AV28BarUrdP2 = (short)(0) ;
      AV29BarUrdP3 = (short)(0) ;
      AV33GXLvl16 = (byte)(0) ;
      /* Using cursor P05GA2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A69ArtDsc = P05GA2_A69ArtDsc[0] ;
         n69ArtDsc = P05GA2_n69ArtDsc[0] ;
         A829TipArtCod = P05GA2_A829TipArtCod[0] ;
         A105ArtTra1 = P05GA2_A105ArtTra1[0] ;
         n105ArtTra1 = P05GA2_n105ArtTra1[0] ;
         A106ArtTra2 = P05GA2_A106ArtTra2[0] ;
         n106ArtTra2 = P05GA2_n106ArtTra2[0] ;
         A107ArtTra3 = P05GA2_A107ArtTra3[0] ;
         n107ArtTra3 = P05GA2_n107ArtTra3[0] ;
         A108ArtTraP1 = P05GA2_A108ArtTraP1[0] ;
         n108ArtTraP1 = P05GA2_n108ArtTraP1[0] ;
         A109ArtTraP2 = P05GA2_A109ArtTraP2[0] ;
         n109ArtTraP2 = P05GA2_n109ArtTraP2[0] ;
         A110ArtTraP3 = P05GA2_A110ArtTraP3[0] ;
         n110ArtTraP3 = P05GA2_n110ArtTraP3[0] ;
         A111ArtUrd1 = P05GA2_A111ArtUrd1[0] ;
         n111ArtUrd1 = P05GA2_n111ArtUrd1[0] ;
         A112ArtUrd2 = P05GA2_A112ArtUrd2[0] ;
         n112ArtUrd2 = P05GA2_n112ArtUrd2[0] ;
         A113ArtUrd3 = P05GA2_A113ArtUrd3[0] ;
         n113ArtUrd3 = P05GA2_n113ArtUrd3[0] ;
         A114ArtUrdP1 = P05GA2_A114ArtUrdP1[0] ;
         n114ArtUrdP1 = P05GA2_n114ArtUrdP1[0] ;
         A115ArtUrdP2 = P05GA2_A115ArtUrdP2[0] ;
         n115ArtUrdP2 = P05GA2_n115ArtUrdP2[0] ;
         A116ArtUrdP3 = P05GA2_A116ArtUrdP3[0] ;
         n116ArtUrdP3 = P05GA2_n116ArtUrdP3[0] ;
         A87ArtMat = P05GA2_A87ArtMat[0] ;
         n87ArtMat = P05GA2_n87ArtMat[0] ;
         AV33GXLvl16 = (byte)(1) ;
         AV16BarSerdsc = A69ArtDsc ;
         AV17Bartipart = A829TipArtCod ;
         AV18BarTra1 = A105ArtTra1 ;
         AV19BarTra2 = A106ArtTra2 ;
         AV20BarTra3 = A107ArtTra3 ;
         AV21BarTraP1 = A108ArtTraP1 ;
         AV22BarTraP2 = A109ArtTraP2 ;
         AV23BarTraP3 = A110ArtTraP3 ;
         AV24BarUrd1 = A111ArtUrd1 ;
         AV25BarUrd2 = A112ArtUrd2 ;
         AV26BarUrd3 = A113ArtUrd3 ;
         AV27BarUrdP1 = A114ArtUrdP1 ;
         AV28BarUrdP2 = A115ArtUrdP2 ;
         AV29BarUrdP3 = A116ArtUrdP3 ;
         AV30BarMat = A87ArtMat ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV33GXLvl16 == 0 )
      {
         AV16BarSerdsc = httpContext.getMessage( "Error", "") ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = pupdarticulohdr.this.AV16BarSerdsc;
      this.aP4[0] = pupdarticulohdr.this.AV17Bartipart;
      this.aP5[0] = pupdarticulohdr.this.AV18BarTra1;
      this.aP6[0] = pupdarticulohdr.this.AV19BarTra2;
      this.aP7[0] = pupdarticulohdr.this.AV20BarTra3;
      this.aP8[0] = pupdarticulohdr.this.AV21BarTraP1;
      this.aP9[0] = pupdarticulohdr.this.AV22BarTraP2;
      this.aP10[0] = pupdarticulohdr.this.AV23BarTraP3;
      this.aP11[0] = pupdarticulohdr.this.AV24BarUrd1;
      this.aP12[0] = pupdarticulohdr.this.AV25BarUrd2;
      this.aP13[0] = pupdarticulohdr.this.AV26BarUrd3;
      this.aP14[0] = pupdarticulohdr.this.AV27BarUrdP1;
      this.aP15[0] = pupdarticulohdr.this.AV28BarUrdP2;
      this.aP16[0] = pupdarticulohdr.this.AV29BarUrdP3;
      this.aP17[0] = pupdarticulohdr.this.AV30BarMat;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV16BarSerdsc = "" ;
      AV18BarTra1 = "" ;
      AV19BarTra2 = "" ;
      AV20BarTra3 = "" ;
      AV24BarUrd1 = "" ;
      AV25BarUrd2 = "" ;
      AV26BarUrd3 = "" ;
      AV30BarMat = "" ;
      scmdbuf = "" ;
      P05GA2_A396EmprCod = new String[] {""} ;
      P05GA2_A252CliCod = new int[1] ;
      P05GA2_A65ArtCod = new String[] {""} ;
      P05GA2_A69ArtDsc = new String[] {""} ;
      P05GA2_n69ArtDsc = new boolean[] {false} ;
      P05GA2_A829TipArtCod = new short[1] ;
      P05GA2_A105ArtTra1 = new String[] {""} ;
      P05GA2_n105ArtTra1 = new boolean[] {false} ;
      P05GA2_A106ArtTra2 = new String[] {""} ;
      P05GA2_n106ArtTra2 = new boolean[] {false} ;
      P05GA2_A107ArtTra3 = new String[] {""} ;
      P05GA2_n107ArtTra3 = new boolean[] {false} ;
      P05GA2_A108ArtTraP1 = new short[1] ;
      P05GA2_n108ArtTraP1 = new boolean[] {false} ;
      P05GA2_A109ArtTraP2 = new short[1] ;
      P05GA2_n109ArtTraP2 = new boolean[] {false} ;
      P05GA2_A110ArtTraP3 = new short[1] ;
      P05GA2_n110ArtTraP3 = new boolean[] {false} ;
      P05GA2_A111ArtUrd1 = new String[] {""} ;
      P05GA2_n111ArtUrd1 = new boolean[] {false} ;
      P05GA2_A112ArtUrd2 = new String[] {""} ;
      P05GA2_n112ArtUrd2 = new boolean[] {false} ;
      P05GA2_A113ArtUrd3 = new String[] {""} ;
      P05GA2_n113ArtUrd3 = new boolean[] {false} ;
      P05GA2_A114ArtUrdP1 = new short[1] ;
      P05GA2_n114ArtUrdP1 = new boolean[] {false} ;
      P05GA2_A115ArtUrdP2 = new short[1] ;
      P05GA2_n115ArtUrdP2 = new boolean[] {false} ;
      P05GA2_A116ArtUrdP3 = new short[1] ;
      P05GA2_n116ArtUrdP3 = new boolean[] {false} ;
      P05GA2_A87ArtMat = new String[] {""} ;
      P05GA2_n87ArtMat = new boolean[] {false} ;
      A69ArtDsc = "" ;
      A105ArtTra1 = "" ;
      A106ArtTra2 = "" ;
      A107ArtTra3 = "" ;
      A111ArtUrd1 = "" ;
      A112ArtUrd2 = "" ;
      A113ArtUrd3 = "" ;
      A87ArtMat = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pupdarticulohdr__default(),
         new Object[] {
             new Object[] {
            P05GA2_A396EmprCod, P05GA2_A252CliCod, P05GA2_A65ArtCod, P05GA2_A69ArtDsc, P05GA2_n69ArtDsc, P05GA2_A829TipArtCod, P05GA2_A105ArtTra1, P05GA2_n105ArtTra1, P05GA2_A106ArtTra2, P05GA2_n106ArtTra2,
            P05GA2_A107ArtTra3, P05GA2_n107ArtTra3, P05GA2_A108ArtTraP1, P05GA2_n108ArtTraP1, P05GA2_A109ArtTraP2, P05GA2_n109ArtTraP2, P05GA2_A110ArtTraP3, P05GA2_n110ArtTraP3, P05GA2_A111ArtUrd1, P05GA2_n111ArtUrd1,
            P05GA2_A112ArtUrd2, P05GA2_n112ArtUrd2, P05GA2_A113ArtUrd3, P05GA2_n113ArtUrd3, P05GA2_A114ArtUrdP1, P05GA2_n114ArtUrdP1, P05GA2_A115ArtUrdP2, P05GA2_n115ArtUrdP2, P05GA2_A116ArtUrdP3, P05GA2_n116ArtUrdP3,
            P05GA2_A87ArtMat, P05GA2_n87ArtMat
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV33GXLvl16 ;
   private short AV17Bartipart ;
   private short AV21BarTraP1 ;
   private short AV22BarTraP2 ;
   private short AV23BarTraP3 ;
   private short AV27BarUrdP1 ;
   private short AV28BarUrdP2 ;
   private short AV29BarUrdP3 ;
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
   private String AV16BarSerdsc ;
   private String AV18BarTra1 ;
   private String AV19BarTra2 ;
   private String AV20BarTra3 ;
   private String AV24BarUrd1 ;
   private String AV25BarUrd2 ;
   private String AV26BarUrd3 ;
   private String AV30BarMat ;
   private String scmdbuf ;
   private String A69ArtDsc ;
   private String A105ArtTra1 ;
   private String A106ArtTra2 ;
   private String A107ArtTra3 ;
   private String A111ArtUrd1 ;
   private String A112ArtUrd2 ;
   private String A113ArtUrd3 ;
   private String A87ArtMat ;
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
   private boolean n87ArtMat ;
   private String[] aP17 ;
   private String[] aP3 ;
   private short[] aP4 ;
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
   private IDataStoreProvider pr_default ;
   private String[] P05GA2_A396EmprCod ;
   private int[] P05GA2_A252CliCod ;
   private String[] P05GA2_A65ArtCod ;
   private String[] P05GA2_A69ArtDsc ;
   private boolean[] P05GA2_n69ArtDsc ;
   private short[] P05GA2_A829TipArtCod ;
   private String[] P05GA2_A105ArtTra1 ;
   private boolean[] P05GA2_n105ArtTra1 ;
   private String[] P05GA2_A106ArtTra2 ;
   private boolean[] P05GA2_n106ArtTra2 ;
   private String[] P05GA2_A107ArtTra3 ;
   private boolean[] P05GA2_n107ArtTra3 ;
   private short[] P05GA2_A108ArtTraP1 ;
   private boolean[] P05GA2_n108ArtTraP1 ;
   private short[] P05GA2_A109ArtTraP2 ;
   private boolean[] P05GA2_n109ArtTraP2 ;
   private short[] P05GA2_A110ArtTraP3 ;
   private boolean[] P05GA2_n110ArtTraP3 ;
   private String[] P05GA2_A111ArtUrd1 ;
   private boolean[] P05GA2_n111ArtUrd1 ;
   private String[] P05GA2_A112ArtUrd2 ;
   private boolean[] P05GA2_n112ArtUrd2 ;
   private String[] P05GA2_A113ArtUrd3 ;
   private boolean[] P05GA2_n113ArtUrd3 ;
   private short[] P05GA2_A114ArtUrdP1 ;
   private boolean[] P05GA2_n114ArtUrdP1 ;
   private short[] P05GA2_A115ArtUrdP2 ;
   private boolean[] P05GA2_n115ArtUrdP2 ;
   private short[] P05GA2_A116ArtUrdP3 ;
   private boolean[] P05GA2_n116ArtUrdP3 ;
   private String[] P05GA2_A87ArtMat ;
   private boolean[] P05GA2_n87ArtMat ;
}

final  class pupdarticulohdr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05GA2", "SELECT EmprCod, CliCod, ArtCod, ArtDsc, TipArtCod, ArtTra1, ArtTra2, ArtTra3, ArtTraP1, ArtTraP2, ArtTraP3, ArtUrd1, ArtUrd2, ArtUrd3, ArtUrdP1, ArtUrdP2, ArtUrdP3, ArtMat FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[30])[0] = rslt.getString(18, 16);
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

