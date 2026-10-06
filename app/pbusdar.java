package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbusdar extends GXProcedure
{
   public pbusdar( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbusdar.class ), "" );
   }

   public pbusdar( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            String[] aP2 ,
                            String[] aP3 ,
                            String[] aP4 ,
                            String[] aP5 ,
                            short[] aP6 ,
                            short[] aP7 ,
                            short[] aP8 ,
                            String[] aP9 ,
                            String[] aP10 ,
                            String[] aP11 ,
                            short[] aP12 ,
                            short[] aP13 )
   {
      pbusdar.this.aP14 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14);
      return aP14[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        short[] aP6 ,
                        short[] aP7 ,
                        short[] aP8 ,
                        String[] aP9 ,
                        String[] aP10 ,
                        String[] aP11 ,
                        short[] aP12 ,
                        short[] aP13 ,
                        short[] aP14 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             short[] aP6 ,
                             short[] aP7 ,
                             short[] aP8 ,
                             String[] aP9 ,
                             String[] aP10 ,
                             String[] aP11 ,
                             short[] aP12 ,
                             short[] aP13 ,
                             short[] aP14 )
   {
      pbusdar.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pbusdar.this.AV17CliOri = aP1[0];
      this.aP1 = aP1;
      pbusdar.this.AV16ArtOri = aP2[0];
      this.aP2 = aP2;
      pbusdar.this.AV19ArtTra1 = aP3[0];
      this.aP3 = aP3;
      pbusdar.this.AV20ArtTra2 = aP4[0];
      this.aP4 = aP4;
      pbusdar.this.AV21ArtTra3 = aP5[0];
      this.aP5 = aP5;
      pbusdar.this.AV22ArtTraP1 = aP6[0];
      this.aP6 = aP6;
      pbusdar.this.AV23ArtTraP2 = aP7[0];
      this.aP7 = aP7;
      pbusdar.this.AV24ArtTraP3 = aP8[0];
      this.aP8 = aP8;
      pbusdar.this.AV25ArtUrd1 = aP9[0];
      this.aP9 = aP9;
      pbusdar.this.AV26ArtUrd2 = aP10[0];
      this.aP10 = aP10;
      pbusdar.this.AV27ArtUrd3 = aP11[0];
      this.aP11 = aP11;
      pbusdar.this.AV28ArtUrdP1 = aP12[0];
      this.aP12 = aP12;
      pbusdar.this.AV29ArtUrdP2 = aP13[0];
      this.aP13 = aP13;
      pbusdar.this.AV30ArtUrdP3 = aP14[0];
      this.aP14 = aP14;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00T42 */
      pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(AV17CliOri), AV16ArtOri});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A65ArtCod = P00T42_A65ArtCod[0] ;
         A252CliCod = P00T42_A252CliCod[0] ;
         A396EmprCod = P00T42_A396EmprCod[0] ;
         A105ArtTra1 = P00T42_A105ArtTra1[0] ;
         n105ArtTra1 = P00T42_n105ArtTra1[0] ;
         A106ArtTra2 = P00T42_A106ArtTra2[0] ;
         n106ArtTra2 = P00T42_n106ArtTra2[0] ;
         A107ArtTra3 = P00T42_A107ArtTra3[0] ;
         n107ArtTra3 = P00T42_n107ArtTra3[0] ;
         A108ArtTraP1 = P00T42_A108ArtTraP1[0] ;
         n108ArtTraP1 = P00T42_n108ArtTraP1[0] ;
         A109ArtTraP2 = P00T42_A109ArtTraP2[0] ;
         n109ArtTraP2 = P00T42_n109ArtTraP2[0] ;
         A110ArtTraP3 = P00T42_A110ArtTraP3[0] ;
         n110ArtTraP3 = P00T42_n110ArtTraP3[0] ;
         A111ArtUrd1 = P00T42_A111ArtUrd1[0] ;
         n111ArtUrd1 = P00T42_n111ArtUrd1[0] ;
         A112ArtUrd2 = P00T42_A112ArtUrd2[0] ;
         n112ArtUrd2 = P00T42_n112ArtUrd2[0] ;
         A113ArtUrd3 = P00T42_A113ArtUrd3[0] ;
         n113ArtUrd3 = P00T42_n113ArtUrd3[0] ;
         A114ArtUrdP1 = P00T42_A114ArtUrdP1[0] ;
         n114ArtUrdP1 = P00T42_n114ArtUrdP1[0] ;
         A115ArtUrdP2 = P00T42_A115ArtUrdP2[0] ;
         n115ArtUrdP2 = P00T42_n115ArtUrdP2[0] ;
         A116ArtUrdP3 = P00T42_A116ArtUrdP3[0] ;
         n116ArtUrdP3 = P00T42_n116ArtUrdP3[0] ;
         AV19ArtTra1 = A105ArtTra1 ;
         AV20ArtTra2 = A106ArtTra2 ;
         AV21ArtTra3 = A107ArtTra3 ;
         AV22ArtTraP1 = A108ArtTraP1 ;
         AV23ArtTraP2 = A109ArtTraP2 ;
         AV24ArtTraP3 = A110ArtTraP3 ;
         AV25ArtUrd1 = A111ArtUrd1 ;
         AV26ArtUrd2 = A112ArtUrd2 ;
         AV27ArtUrd3 = A113ArtUrd3 ;
         AV28ArtUrdP1 = A114ArtUrdP1 ;
         AV29ArtUrdP2 = A115ArtUrdP2 ;
         AV30ArtUrdP3 = A116ArtUrdP3 ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbusdar.this.AV15EmprCod;
      this.aP1[0] = pbusdar.this.AV17CliOri;
      this.aP2[0] = pbusdar.this.AV16ArtOri;
      this.aP3[0] = pbusdar.this.AV19ArtTra1;
      this.aP4[0] = pbusdar.this.AV20ArtTra2;
      this.aP5[0] = pbusdar.this.AV21ArtTra3;
      this.aP6[0] = pbusdar.this.AV22ArtTraP1;
      this.aP7[0] = pbusdar.this.AV23ArtTraP2;
      this.aP8[0] = pbusdar.this.AV24ArtTraP3;
      this.aP9[0] = pbusdar.this.AV25ArtUrd1;
      this.aP10[0] = pbusdar.this.AV26ArtUrd2;
      this.aP11[0] = pbusdar.this.AV27ArtUrd3;
      this.aP12[0] = pbusdar.this.AV28ArtUrdP1;
      this.aP13[0] = pbusdar.this.AV29ArtUrdP2;
      this.aP14[0] = pbusdar.this.AV30ArtUrdP3;
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
      P00T42_A65ArtCod = new String[] {""} ;
      P00T42_A252CliCod = new int[1] ;
      P00T42_A396EmprCod = new String[] {""} ;
      P00T42_A105ArtTra1 = new String[] {""} ;
      P00T42_n105ArtTra1 = new boolean[] {false} ;
      P00T42_A106ArtTra2 = new String[] {""} ;
      P00T42_n106ArtTra2 = new boolean[] {false} ;
      P00T42_A107ArtTra3 = new String[] {""} ;
      P00T42_n107ArtTra3 = new boolean[] {false} ;
      P00T42_A108ArtTraP1 = new short[1] ;
      P00T42_n108ArtTraP1 = new boolean[] {false} ;
      P00T42_A109ArtTraP2 = new short[1] ;
      P00T42_n109ArtTraP2 = new boolean[] {false} ;
      P00T42_A110ArtTraP3 = new short[1] ;
      P00T42_n110ArtTraP3 = new boolean[] {false} ;
      P00T42_A111ArtUrd1 = new String[] {""} ;
      P00T42_n111ArtUrd1 = new boolean[] {false} ;
      P00T42_A112ArtUrd2 = new String[] {""} ;
      P00T42_n112ArtUrd2 = new boolean[] {false} ;
      P00T42_A113ArtUrd3 = new String[] {""} ;
      P00T42_n113ArtUrd3 = new boolean[] {false} ;
      P00T42_A114ArtUrdP1 = new short[1] ;
      P00T42_n114ArtUrdP1 = new boolean[] {false} ;
      P00T42_A115ArtUrdP2 = new short[1] ;
      P00T42_n115ArtUrdP2 = new boolean[] {false} ;
      P00T42_A116ArtUrdP3 = new short[1] ;
      P00T42_n116ArtUrdP3 = new boolean[] {false} ;
      A65ArtCod = "" ;
      A396EmprCod = "" ;
      A105ArtTra1 = "" ;
      A106ArtTra2 = "" ;
      A107ArtTra3 = "" ;
      A111ArtUrd1 = "" ;
      A112ArtUrd2 = "" ;
      A113ArtUrd3 = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbusdar__default(),
         new Object[] {
             new Object[] {
            P00T42_A65ArtCod, P00T42_A252CliCod, P00T42_A396EmprCod, P00T42_A105ArtTra1, P00T42_n105ArtTra1, P00T42_A106ArtTra2, P00T42_n106ArtTra2, P00T42_A107ArtTra3, P00T42_n107ArtTra3, P00T42_A108ArtTraP1,
            P00T42_n108ArtTraP1, P00T42_A109ArtTraP2, P00T42_n109ArtTraP2, P00T42_A110ArtTraP3, P00T42_n110ArtTraP3, P00T42_A111ArtUrd1, P00T42_n111ArtUrd1, P00T42_A112ArtUrd2, P00T42_n112ArtUrd2, P00T42_A113ArtUrd3,
            P00T42_n113ArtUrd3, P00T42_A114ArtUrdP1, P00T42_n114ArtUrdP1, P00T42_A115ArtUrdP2, P00T42_n115ArtUrdP2, P00T42_A116ArtUrdP3, P00T42_n116ArtUrdP3
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV22ArtTraP1 ;
   private short AV23ArtTraP2 ;
   private short AV24ArtTraP3 ;
   private short AV28ArtUrdP1 ;
   private short AV29ArtUrdP2 ;
   private short AV30ArtUrdP3 ;
   private short A108ArtTraP1 ;
   private short A109ArtTraP2 ;
   private short A110ArtTraP3 ;
   private short A114ArtUrdP1 ;
   private short A115ArtUrdP2 ;
   private short A116ArtUrdP3 ;
   private short Gx_err ;
   private int AV17CliOri ;
   private int A252CliCod ;
   private String AV15EmprCod ;
   private String AV16ArtOri ;
   private String AV19ArtTra1 ;
   private String AV20ArtTra2 ;
   private String AV21ArtTra3 ;
   private String AV25ArtUrd1 ;
   private String AV26ArtUrd2 ;
   private String AV27ArtUrd3 ;
   private String scmdbuf ;
   private String A65ArtCod ;
   private String A396EmprCod ;
   private String A105ArtTra1 ;
   private String A106ArtTra2 ;
   private String A107ArtTra3 ;
   private String A111ArtUrd1 ;
   private String A112ArtUrd2 ;
   private String A113ArtUrd3 ;
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
   private short[] aP14 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private short[] aP6 ;
   private short[] aP7 ;
   private short[] aP8 ;
   private String[] aP9 ;
   private String[] aP10 ;
   private String[] aP11 ;
   private short[] aP12 ;
   private short[] aP13 ;
   private IDataStoreProvider pr_default ;
   private String[] P00T42_A65ArtCod ;
   private int[] P00T42_A252CliCod ;
   private String[] P00T42_A396EmprCod ;
   private String[] P00T42_A105ArtTra1 ;
   private boolean[] P00T42_n105ArtTra1 ;
   private String[] P00T42_A106ArtTra2 ;
   private boolean[] P00T42_n106ArtTra2 ;
   private String[] P00T42_A107ArtTra3 ;
   private boolean[] P00T42_n107ArtTra3 ;
   private short[] P00T42_A108ArtTraP1 ;
   private boolean[] P00T42_n108ArtTraP1 ;
   private short[] P00T42_A109ArtTraP2 ;
   private boolean[] P00T42_n109ArtTraP2 ;
   private short[] P00T42_A110ArtTraP3 ;
   private boolean[] P00T42_n110ArtTraP3 ;
   private String[] P00T42_A111ArtUrd1 ;
   private boolean[] P00T42_n111ArtUrd1 ;
   private String[] P00T42_A112ArtUrd2 ;
   private boolean[] P00T42_n112ArtUrd2 ;
   private String[] P00T42_A113ArtUrd3 ;
   private boolean[] P00T42_n113ArtUrd3 ;
   private short[] P00T42_A114ArtUrdP1 ;
   private boolean[] P00T42_n114ArtUrdP1 ;
   private short[] P00T42_A115ArtUrdP2 ;
   private boolean[] P00T42_n115ArtUrdP2 ;
   private short[] P00T42_A116ArtUrdP3 ;
   private boolean[] P00T42_n116ArtUrdP3 ;
}

final  class pbusdar__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00T42", "SELECT ArtCod, CliCod, EmprCod, ArtTra1, ArtTra2, ArtTra3, ArtTraP1, ArtTraP2, ArtTraP3, ArtUrd1, ArtUrd2, ArtUrd3, ArtUrdP1, ArtUrdP2, ArtUrdP3 FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[3])[0] = rslt.getString(4, 4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 4);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(10, 4);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(11, 4);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(12, 4);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(13);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((short[]) buf[23])[0] = rslt.getShort(14);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((short[]) buf[25])[0] = rslt.getShort(15);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
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

