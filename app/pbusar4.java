package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbusar4 extends GXProcedure
{
   public pbusar4( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbusar4.class ), "" );
   }

   public pbusar4( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           String[] aP2 ,
                                           String[] aP3 ,
                                           String[] aP4 ,
                                           short[] aP5 )
   {
      pbusar4.this.aP6 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        short[] aP5 ,
                        java.math.BigDecimal[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 ,
                             java.math.BigDecimal[] aP6 )
   {
      pbusar4.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pbusar4.this.AV17CliOri = aP1[0];
      this.aP1 = aP1;
      pbusar4.this.AV16ArtOri = aP2[0];
      this.aP2 = aP2;
      pbusar4.this.AV19TArtDsc = aP3[0];
      this.aP3 = aP3;
      pbusar4.this.AV20Compos = aP4[0];
      this.aP4 = aP4;
      pbusar4.this.AV21TipArtCod = aP5[0];
      this.aP5 = aP5;
      pbusar4.this.AV22ArtLu = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV19TArtDsc = GXutil.space( (short)(30)) ;
      AV20Compos = "" ;
      /* Using cursor P02BE2 */
      pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(AV17CliOri), AV16ArtOri});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A65ArtCod = P02BE2_A65ArtCod[0] ;
         A252CliCod = P02BE2_A252CliCod[0] ;
         A396EmprCod = P02BE2_A396EmprCod[0] ;
         A829TipArtCod = P02BE2_A829TipArtCod[0] ;
         A830TipArtDsc = P02BE2_A830TipArtDsc[0] ;
         n830TipArtDsc = P02BE2_n830TipArtDsc[0] ;
         A105ArtTra1 = P02BE2_A105ArtTra1[0] ;
         n105ArtTra1 = P02BE2_n105ArtTra1[0] ;
         A108ArtTraP1 = P02BE2_A108ArtTraP1[0] ;
         n108ArtTraP1 = P02BE2_n108ArtTraP1[0] ;
         A106ArtTra2 = P02BE2_A106ArtTra2[0] ;
         n106ArtTra2 = P02BE2_n106ArtTra2[0] ;
         A109ArtTraP2 = P02BE2_A109ArtTraP2[0] ;
         n109ArtTraP2 = P02BE2_n109ArtTraP2[0] ;
         A107ArtTra3 = P02BE2_A107ArtTra3[0] ;
         n107ArtTra3 = P02BE2_n107ArtTra3[0] ;
         A110ArtTraP3 = P02BE2_A110ArtTraP3[0] ;
         n110ArtTraP3 = P02BE2_n110ArtTraP3[0] ;
         A111ArtUrd1 = P02BE2_A111ArtUrd1[0] ;
         n111ArtUrd1 = P02BE2_n111ArtUrd1[0] ;
         A114ArtUrdP1 = P02BE2_A114ArtUrdP1[0] ;
         n114ArtUrdP1 = P02BE2_n114ArtUrdP1[0] ;
         A112ArtUrd2 = P02BE2_A112ArtUrd2[0] ;
         n112ArtUrd2 = P02BE2_n112ArtUrd2[0] ;
         A115ArtUrdP2 = P02BE2_A115ArtUrdP2[0] ;
         n115ArtUrdP2 = P02BE2_n115ArtUrdP2[0] ;
         A113ArtUrd3 = P02BE2_A113ArtUrd3[0] ;
         n113ArtUrd3 = P02BE2_n113ArtUrd3[0] ;
         A116ArtUrdP3 = P02BE2_A116ArtUrdP3[0] ;
         n116ArtUrdP3 = P02BE2_n116ArtUrdP3[0] ;
         A6462ArtLu = P02BE2_A6462ArtLu[0] ;
         n6462ArtLu = P02BE2_n6462ArtLu[0] ;
         A830TipArtDsc = P02BE2_A830TipArtDsc[0] ;
         n830TipArtDsc = P02BE2_n830TipArtDsc[0] ;
         AV21TipArtCod = A829TipArtCod ;
         AV19TArtDsc = A830TipArtDsc ;
         AV20Compos = GXutil.str( A108ArtTraP1, 3, 0) + " " + GXutil.trim( A105ArtTra1) + " " ;
         if ( ! (GXutil.strcmp("", A106ArtTra2)==0) )
         {
            AV20Compos += GXutil.str( A109ArtTraP2, 3, 0) + " " + GXutil.trim( A106ArtTra2) + " " ;
         }
         if ( ! (GXutil.strcmp("", A107ArtTra3)==0) )
         {
            AV20Compos += GXutil.str( A110ArtTraP3, 3, 0) + " " + GXutil.trim( A107ArtTra3) + " " ;
         }
         if ( ! (GXutil.strcmp("", A111ArtUrd1)==0) )
         {
            AV20Compos += "-" + GXutil.str( A114ArtUrdP1, 3, 0) + " " + GXutil.trim( A111ArtUrd1) + " " ;
         }
         if ( ! (GXutil.strcmp("", A112ArtUrd2)==0) )
         {
            AV20Compos += GXutil.str( A115ArtUrdP2, 3, 0) + " " + GXutil.trim( A112ArtUrd2) + " " ;
         }
         if ( ! (GXutil.strcmp("", A113ArtUrd3)==0) )
         {
            AV20Compos += GXutil.str( A116ArtUrdP3, 3, 0) + " " + GXutil.trim( A113ArtUrd3) + " " ;
         }
         AV22ArtLu = A6462ArtLu ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbusar4.this.AV15EmprCod;
      this.aP1[0] = pbusar4.this.AV17CliOri;
      this.aP2[0] = pbusar4.this.AV16ArtOri;
      this.aP3[0] = pbusar4.this.AV19TArtDsc;
      this.aP4[0] = pbusar4.this.AV20Compos;
      this.aP5[0] = pbusar4.this.AV21TipArtCod;
      this.aP6[0] = pbusar4.this.AV22ArtLu;
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
      P02BE2_A65ArtCod = new String[] {""} ;
      P02BE2_A252CliCod = new int[1] ;
      P02BE2_A396EmprCod = new String[] {""} ;
      P02BE2_A829TipArtCod = new short[1] ;
      P02BE2_A830TipArtDsc = new String[] {""} ;
      P02BE2_n830TipArtDsc = new boolean[] {false} ;
      P02BE2_A105ArtTra1 = new String[] {""} ;
      P02BE2_n105ArtTra1 = new boolean[] {false} ;
      P02BE2_A108ArtTraP1 = new short[1] ;
      P02BE2_n108ArtTraP1 = new boolean[] {false} ;
      P02BE2_A106ArtTra2 = new String[] {""} ;
      P02BE2_n106ArtTra2 = new boolean[] {false} ;
      P02BE2_A109ArtTraP2 = new short[1] ;
      P02BE2_n109ArtTraP2 = new boolean[] {false} ;
      P02BE2_A107ArtTra3 = new String[] {""} ;
      P02BE2_n107ArtTra3 = new boolean[] {false} ;
      P02BE2_A110ArtTraP3 = new short[1] ;
      P02BE2_n110ArtTraP3 = new boolean[] {false} ;
      P02BE2_A111ArtUrd1 = new String[] {""} ;
      P02BE2_n111ArtUrd1 = new boolean[] {false} ;
      P02BE2_A114ArtUrdP1 = new short[1] ;
      P02BE2_n114ArtUrdP1 = new boolean[] {false} ;
      P02BE2_A112ArtUrd2 = new String[] {""} ;
      P02BE2_n112ArtUrd2 = new boolean[] {false} ;
      P02BE2_A115ArtUrdP2 = new short[1] ;
      P02BE2_n115ArtUrdP2 = new boolean[] {false} ;
      P02BE2_A113ArtUrd3 = new String[] {""} ;
      P02BE2_n113ArtUrd3 = new boolean[] {false} ;
      P02BE2_A116ArtUrdP3 = new short[1] ;
      P02BE2_n116ArtUrdP3 = new boolean[] {false} ;
      P02BE2_A6462ArtLu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02BE2_n6462ArtLu = new boolean[] {false} ;
      A65ArtCod = "" ;
      A396EmprCod = "" ;
      A830TipArtDsc = "" ;
      A105ArtTra1 = "" ;
      A106ArtTra2 = "" ;
      A107ArtTra3 = "" ;
      A111ArtUrd1 = "" ;
      A112ArtUrd2 = "" ;
      A113ArtUrd3 = "" ;
      A6462ArtLu = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbusar4__default(),
         new Object[] {
             new Object[] {
            P02BE2_A65ArtCod, P02BE2_A252CliCod, P02BE2_A396EmprCod, P02BE2_A829TipArtCod, P02BE2_A830TipArtDsc, P02BE2_n830TipArtDsc, P02BE2_A105ArtTra1, P02BE2_n105ArtTra1, P02BE2_A108ArtTraP1, P02BE2_n108ArtTraP1,
            P02BE2_A106ArtTra2, P02BE2_n106ArtTra2, P02BE2_A109ArtTraP2, P02BE2_n109ArtTraP2, P02BE2_A107ArtTra3, P02BE2_n107ArtTra3, P02BE2_A110ArtTraP3, P02BE2_n110ArtTraP3, P02BE2_A111ArtUrd1, P02BE2_n111ArtUrd1,
            P02BE2_A114ArtUrdP1, P02BE2_n114ArtUrdP1, P02BE2_A112ArtUrd2, P02BE2_n112ArtUrd2, P02BE2_A115ArtUrdP2, P02BE2_n115ArtUrdP2, P02BE2_A113ArtUrd3, P02BE2_n113ArtUrd3, P02BE2_A116ArtUrdP3, P02BE2_n116ArtUrdP3,
            P02BE2_A6462ArtLu, P02BE2_n6462ArtLu
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV21TipArtCod ;
   private short A829TipArtCod ;
   private short A108ArtTraP1 ;
   private short A109ArtTraP2 ;
   private short A110ArtTraP3 ;
   private short A114ArtUrdP1 ;
   private short A115ArtUrdP2 ;
   private short A116ArtUrdP3 ;
   private short Gx_err ;
   private int AV17CliOri ;
   private int A252CliCod ;
   private java.math.BigDecimal AV22ArtLu ;
   private java.math.BigDecimal A6462ArtLu ;
   private String AV15EmprCod ;
   private String AV16ArtOri ;
   private String AV19TArtDsc ;
   private String AV20Compos ;
   private String scmdbuf ;
   private String A65ArtCod ;
   private String A396EmprCod ;
   private String A830TipArtDsc ;
   private String A105ArtTra1 ;
   private String A106ArtTra2 ;
   private String A107ArtTra3 ;
   private String A111ArtUrd1 ;
   private String A112ArtUrd2 ;
   private String A113ArtUrd3 ;
   private boolean n830TipArtDsc ;
   private boolean n105ArtTra1 ;
   private boolean n108ArtTraP1 ;
   private boolean n106ArtTra2 ;
   private boolean n109ArtTraP2 ;
   private boolean n107ArtTra3 ;
   private boolean n110ArtTraP3 ;
   private boolean n111ArtUrd1 ;
   private boolean n114ArtUrdP1 ;
   private boolean n112ArtUrd2 ;
   private boolean n115ArtUrdP2 ;
   private boolean n113ArtUrd3 ;
   private boolean n116ArtUrdP3 ;
   private boolean n6462ArtLu ;
   private java.math.BigDecimal[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private short[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P02BE2_A65ArtCod ;
   private int[] P02BE2_A252CliCod ;
   private String[] P02BE2_A396EmprCod ;
   private short[] P02BE2_A829TipArtCod ;
   private String[] P02BE2_A830TipArtDsc ;
   private boolean[] P02BE2_n830TipArtDsc ;
   private String[] P02BE2_A105ArtTra1 ;
   private boolean[] P02BE2_n105ArtTra1 ;
   private short[] P02BE2_A108ArtTraP1 ;
   private boolean[] P02BE2_n108ArtTraP1 ;
   private String[] P02BE2_A106ArtTra2 ;
   private boolean[] P02BE2_n106ArtTra2 ;
   private short[] P02BE2_A109ArtTraP2 ;
   private boolean[] P02BE2_n109ArtTraP2 ;
   private String[] P02BE2_A107ArtTra3 ;
   private boolean[] P02BE2_n107ArtTra3 ;
   private short[] P02BE2_A110ArtTraP3 ;
   private boolean[] P02BE2_n110ArtTraP3 ;
   private String[] P02BE2_A111ArtUrd1 ;
   private boolean[] P02BE2_n111ArtUrd1 ;
   private short[] P02BE2_A114ArtUrdP1 ;
   private boolean[] P02BE2_n114ArtUrdP1 ;
   private String[] P02BE2_A112ArtUrd2 ;
   private boolean[] P02BE2_n112ArtUrd2 ;
   private short[] P02BE2_A115ArtUrdP2 ;
   private boolean[] P02BE2_n115ArtUrdP2 ;
   private String[] P02BE2_A113ArtUrd3 ;
   private boolean[] P02BE2_n113ArtUrd3 ;
   private short[] P02BE2_A116ArtUrdP3 ;
   private boolean[] P02BE2_n116ArtUrdP3 ;
   private java.math.BigDecimal[] P02BE2_A6462ArtLu ;
   private boolean[] P02BE2_n6462ArtLu ;
}

final  class pbusar4__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02BE2", "SELECT T1.ArtCod, T1.CliCod, T1.EmprCod, T1.TipArtCod, T2.TipArtDsc, T1.ArtTra1, T1.ArtTraP1, T1.ArtTra2, T1.ArtTraP2, T1.ArtTra3, T1.ArtTraP3, T1.ArtUrd1, T1.ArtUrdP1, T1.ArtUrd2, T1.ArtUrdP2, T1.ArtUrd3, T1.ArtUrdP3, T1.ArtLu FROM (TXPARTICU T1 INNER JOIN TXPTIPART T2 ON T2.EmprCod = T1.EmprCod AND T2.TipArtCod = T1.TipArtCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ArtCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 4);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(10, 4);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(11);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(12, 4);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((short[]) buf[20])[0] = rslt.getShort(13);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(14, 4);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((short[]) buf[24])[0] = rslt.getShort(15);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(16, 4);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((short[]) buf[28])[0] = rslt.getShort(17);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(18,2);
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

