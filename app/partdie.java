package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class partdie extends GXProcedure
{
   public partdie( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( partdie.class ), "" );
   }

   public partdie( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           String[] aP2 ,
                           String[] aP3 ,
                           String[] aP4 ,
                           short[] aP5 ,
                           String[] aP6 ,
                           String[] aP7 ,
                           String[] aP8 ,
                           short[] aP9 ,
                           short[] aP10 ,
                           short[] aP11 ,
                           short[] aP12 ,
                           String[] aP13 ,
                           short[] aP14 )
   {
      partdie.this.aP15 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15);
      return aP15[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        short[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 ,
                        short[] aP9 ,
                        short[] aP10 ,
                        short[] aP11 ,
                        short[] aP12 ,
                        String[] aP13 ,
                        short[] aP14 ,
                        byte[] aP15 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             short[] aP9 ,
                             short[] aP10 ,
                             short[] aP11 ,
                             short[] aP12 ,
                             String[] aP13 ,
                             short[] aP14 ,
                             byte[] aP15 )
   {
      partdie.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      partdie.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      partdie.this.A65ArtCod = aP2[0];
      this.aP2 = aP2;
      partdie.this.AV15DisArtMat = aP3[0];
      this.aP3 = aP3;
      partdie.this.AV24DisArtLar = aP4[0];
      this.aP4 = aP4;
      partdie.this.AV23DisArtTip = aP5[0];
      this.aP5 = aP5;
      partdie.this.AV17DisArtTr1 = aP6[0];
      this.aP6 = aP6;
      partdie.this.AV18DisArtTr2 = aP7[0];
      this.aP7 = aP7;
      partdie.this.AV19DisArtTr3 = aP8[0];
      this.aP8 = aP8;
      partdie.this.AV20DisArtPt1 = aP9[0];
      this.aP9 = aP9;
      partdie.this.AV21DisArtPt2 = aP10[0];
      this.aP10 = aP10;
      partdie.this.AV22DisArtPt3 = aP11[0];
      this.aP11 = aP11;
      partdie.this.AV16DisArtAnh = aP12[0];
      this.aP12 = aP12;
      partdie.this.AV25DisArtDsc = aP13[0];
      this.aP13 = aP13;
      partdie.this.AV26DisArtAcb = aP14[0];
      this.aP14 = aP14;
      partdie.this.AV27Flag = aP15[0];
      this.aP15 = aP15;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV27Flag = (byte)(0) ;
      /* Using cursor P00XZ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A87ArtMat = P00XZ2_A87ArtMat[0] ;
         n87ArtMat = P00XZ2_n87ArtMat[0] ;
         A829TipArtCod = P00XZ2_A829TipArtCod[0] ;
         A63ArtAcaMin = P00XZ2_A63ArtAcaMin[0] ;
         n63ArtAcaMin = P00XZ2_n63ArtAcaMin[0] ;
         A68ArtCruMin = P00XZ2_A68ArtCruMin[0] ;
         n68ArtCruMin = P00XZ2_n68ArtCruMin[0] ;
         A100ArtTipLar = P00XZ2_A100ArtTipLar[0] ;
         n100ArtTipLar = P00XZ2_n100ArtTipLar[0] ;
         A105ArtTra1 = P00XZ2_A105ArtTra1[0] ;
         n105ArtTra1 = P00XZ2_n105ArtTra1[0] ;
         A106ArtTra2 = P00XZ2_A106ArtTra2[0] ;
         n106ArtTra2 = P00XZ2_n106ArtTra2[0] ;
         A107ArtTra3 = P00XZ2_A107ArtTra3[0] ;
         n107ArtTra3 = P00XZ2_n107ArtTra3[0] ;
         A108ArtTraP1 = P00XZ2_A108ArtTraP1[0] ;
         n108ArtTraP1 = P00XZ2_n108ArtTraP1[0] ;
         A109ArtTraP2 = P00XZ2_A109ArtTraP2[0] ;
         n109ArtTraP2 = P00XZ2_n109ArtTraP2[0] ;
         A110ArtTraP3 = P00XZ2_A110ArtTraP3[0] ;
         n110ArtTraP3 = P00XZ2_n110ArtTraP3[0] ;
         A69ArtDsc = P00XZ2_A69ArtDsc[0] ;
         n69ArtDsc = P00XZ2_n69ArtDsc[0] ;
         AV15DisArtMat = A87ArtMat ;
         AV23DisArtTip = A829TipArtCod ;
         AV16DisArtAnh = A63ArtAcaMin ;
         AV26DisArtAcb = A68ArtCruMin ;
         AV24DisArtLar = A100ArtTipLar ;
         AV17DisArtTr1 = A105ArtTra1 ;
         AV18DisArtTr2 = A106ArtTra2 ;
         AV19DisArtTr3 = A107ArtTra3 ;
         AV20DisArtPt1 = A108ArtTraP1 ;
         AV21DisArtPt2 = A109ArtTraP2 ;
         AV22DisArtPt3 = A110ArtTraP3 ;
         AV25DisArtDsc = A69ArtDsc ;
         AV27Flag = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = partdie.this.A396EmprCod;
      this.aP1[0] = partdie.this.A252CliCod;
      this.aP2[0] = partdie.this.A65ArtCod;
      this.aP3[0] = partdie.this.AV15DisArtMat;
      this.aP4[0] = partdie.this.AV24DisArtLar;
      this.aP5[0] = partdie.this.AV23DisArtTip;
      this.aP6[0] = partdie.this.AV17DisArtTr1;
      this.aP7[0] = partdie.this.AV18DisArtTr2;
      this.aP8[0] = partdie.this.AV19DisArtTr3;
      this.aP9[0] = partdie.this.AV20DisArtPt1;
      this.aP10[0] = partdie.this.AV21DisArtPt2;
      this.aP11[0] = partdie.this.AV22DisArtPt3;
      this.aP12[0] = partdie.this.AV16DisArtAnh;
      this.aP13[0] = partdie.this.AV25DisArtDsc;
      this.aP14[0] = partdie.this.AV26DisArtAcb;
      this.aP15[0] = partdie.this.AV27Flag;
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
      P00XZ2_A396EmprCod = new String[] {""} ;
      P00XZ2_A252CliCod = new int[1] ;
      P00XZ2_A65ArtCod = new String[] {""} ;
      P00XZ2_A87ArtMat = new String[] {""} ;
      P00XZ2_n87ArtMat = new boolean[] {false} ;
      P00XZ2_A829TipArtCod = new short[1] ;
      P00XZ2_A63ArtAcaMin = new short[1] ;
      P00XZ2_n63ArtAcaMin = new boolean[] {false} ;
      P00XZ2_A68ArtCruMin = new short[1] ;
      P00XZ2_n68ArtCruMin = new boolean[] {false} ;
      P00XZ2_A100ArtTipLar = new String[] {""} ;
      P00XZ2_n100ArtTipLar = new boolean[] {false} ;
      P00XZ2_A105ArtTra1 = new String[] {""} ;
      P00XZ2_n105ArtTra1 = new boolean[] {false} ;
      P00XZ2_A106ArtTra2 = new String[] {""} ;
      P00XZ2_n106ArtTra2 = new boolean[] {false} ;
      P00XZ2_A107ArtTra3 = new String[] {""} ;
      P00XZ2_n107ArtTra3 = new boolean[] {false} ;
      P00XZ2_A108ArtTraP1 = new short[1] ;
      P00XZ2_n108ArtTraP1 = new boolean[] {false} ;
      P00XZ2_A109ArtTraP2 = new short[1] ;
      P00XZ2_n109ArtTraP2 = new boolean[] {false} ;
      P00XZ2_A110ArtTraP3 = new short[1] ;
      P00XZ2_n110ArtTraP3 = new boolean[] {false} ;
      P00XZ2_A69ArtDsc = new String[] {""} ;
      P00XZ2_n69ArtDsc = new boolean[] {false} ;
      A87ArtMat = "" ;
      A100ArtTipLar = "" ;
      A105ArtTra1 = "" ;
      A106ArtTra2 = "" ;
      A107ArtTra3 = "" ;
      A69ArtDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.partdie__default(),
         new Object[] {
             new Object[] {
            P00XZ2_A396EmprCod, P00XZ2_A252CliCod, P00XZ2_A65ArtCod, P00XZ2_A87ArtMat, P00XZ2_n87ArtMat, P00XZ2_A829TipArtCod, P00XZ2_A63ArtAcaMin, P00XZ2_n63ArtAcaMin, P00XZ2_A68ArtCruMin, P00XZ2_n68ArtCruMin,
            P00XZ2_A100ArtTipLar, P00XZ2_n100ArtTipLar, P00XZ2_A105ArtTra1, P00XZ2_n105ArtTra1, P00XZ2_A106ArtTra2, P00XZ2_n106ArtTra2, P00XZ2_A107ArtTra3, P00XZ2_n107ArtTra3, P00XZ2_A108ArtTraP1, P00XZ2_n108ArtTraP1,
            P00XZ2_A109ArtTraP2, P00XZ2_n109ArtTraP2, P00XZ2_A110ArtTraP3, P00XZ2_n110ArtTraP3, P00XZ2_A69ArtDsc, P00XZ2_n69ArtDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV27Flag ;
   private short AV23DisArtTip ;
   private short AV20DisArtPt1 ;
   private short AV21DisArtPt2 ;
   private short AV22DisArtPt3 ;
   private short AV16DisArtAnh ;
   private short AV26DisArtAcb ;
   private short A829TipArtCod ;
   private short A63ArtAcaMin ;
   private short A68ArtCruMin ;
   private short A108ArtTraP1 ;
   private short A109ArtTraP2 ;
   private short A110ArtTraP3 ;
   private short Gx_err ;
   private int A252CliCod ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String AV15DisArtMat ;
   private String AV24DisArtLar ;
   private String AV17DisArtTr1 ;
   private String AV18DisArtTr2 ;
   private String AV19DisArtTr3 ;
   private String AV25DisArtDsc ;
   private String scmdbuf ;
   private String A87ArtMat ;
   private String A100ArtTipLar ;
   private String A105ArtTra1 ;
   private String A106ArtTra2 ;
   private String A107ArtTra3 ;
   private String A69ArtDsc ;
   private boolean n87ArtMat ;
   private boolean n63ArtAcaMin ;
   private boolean n68ArtCruMin ;
   private boolean n100ArtTipLar ;
   private boolean n105ArtTra1 ;
   private boolean n106ArtTra2 ;
   private boolean n107ArtTra3 ;
   private boolean n108ArtTraP1 ;
   private boolean n109ArtTraP2 ;
   private boolean n110ArtTraP3 ;
   private boolean n69ArtDsc ;
   private byte[] aP15 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private short[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private String[] aP8 ;
   private short[] aP9 ;
   private short[] aP10 ;
   private short[] aP11 ;
   private short[] aP12 ;
   private String[] aP13 ;
   private short[] aP14 ;
   private IDataStoreProvider pr_default ;
   private String[] P00XZ2_A396EmprCod ;
   private int[] P00XZ2_A252CliCod ;
   private String[] P00XZ2_A65ArtCod ;
   private String[] P00XZ2_A87ArtMat ;
   private boolean[] P00XZ2_n87ArtMat ;
   private short[] P00XZ2_A829TipArtCod ;
   private short[] P00XZ2_A63ArtAcaMin ;
   private boolean[] P00XZ2_n63ArtAcaMin ;
   private short[] P00XZ2_A68ArtCruMin ;
   private boolean[] P00XZ2_n68ArtCruMin ;
   private String[] P00XZ2_A100ArtTipLar ;
   private boolean[] P00XZ2_n100ArtTipLar ;
   private String[] P00XZ2_A105ArtTra1 ;
   private boolean[] P00XZ2_n105ArtTra1 ;
   private String[] P00XZ2_A106ArtTra2 ;
   private boolean[] P00XZ2_n106ArtTra2 ;
   private String[] P00XZ2_A107ArtTra3 ;
   private boolean[] P00XZ2_n107ArtTra3 ;
   private short[] P00XZ2_A108ArtTraP1 ;
   private boolean[] P00XZ2_n108ArtTraP1 ;
   private short[] P00XZ2_A109ArtTraP2 ;
   private boolean[] P00XZ2_n109ArtTraP2 ;
   private short[] P00XZ2_A110ArtTraP3 ;
   private boolean[] P00XZ2_n110ArtTraP3 ;
   private String[] P00XZ2_A69ArtDsc ;
   private boolean[] P00XZ2_n69ArtDsc ;
}

final  class partdie__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00XZ2", "SELECT EmprCod, CliCod, ArtCod, ArtMat, TipArtCod, ArtAcaMin, ArtCruMin, ArtTipLar, ArtTra1, ArtTra2, ArtTra3, ArtTraP1, ArtTraP2, ArtTraP3, ArtDsc FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 4);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(10, 4);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 4);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(12);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((short[]) buf[20])[0] = rslt.getShort(13);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((short[]) buf[22])[0] = rslt.getShort(14);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(15, 26);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
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

