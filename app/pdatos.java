package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdatos extends GXProcedure
{
   public pdatos( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdatos.class ), "" );
   }

   public pdatos( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           byte[] aP2 ,
                           String[] aP3 ,
                           int[] aP4 ,
                           String[] aP5 ,
                           String[] aP6 ,
                           String[] aP7 ,
                           String[] aP8 ,
                           short[] aP9 ,
                           String[] aP10 ,
                           String[] aP11 ,
                           short[] aP12 ,
                           short[] aP13 ,
                           String[] aP14 )
   {
      pdatos.this.aP15 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15);
      return aP15[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 ,
                        short[] aP9 ,
                        String[] aP10 ,
                        String[] aP11 ,
                        short[] aP12 ,
                        short[] aP13 ,
                        String[] aP14 ,
                        byte[] aP15 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             short[] aP9 ,
                             String[] aP10 ,
                             String[] aP11 ,
                             short[] aP12 ,
                             short[] aP13 ,
                             String[] aP14 ,
                             byte[] aP15 )
   {
      pdatos.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdatos.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pdatos.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pdatos.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pdatos.this.AV8Clicod = aP4[0];
      this.aP4 = aP4;
      pdatos.this.AV9CliNom = aP5[0];
      this.aP5 = aP5;
      pdatos.this.AV10BarEnccli = aP6[0];
      this.aP6 = aP6;
      pdatos.this.AV11BarSer = aP7[0];
      this.aP7 = aP7;
      pdatos.this.AV12BarSerDsc = aP8[0];
      this.aP8 = aP8;
      pdatos.this.AV13BarTipARt = aP9[0];
      this.aP9 = aP9;
      pdatos.this.AV14TipArtDsc = aP10[0];
      this.aP10 = aP10;
      pdatos.this.AV15Compo = aP11[0];
      this.aP11 = aP11;
      pdatos.this.AV16BarAncAca1 = aP12[0];
      this.aP12 = aP12;
      pdatos.this.AV17BarGraAca = aP13[0];
      this.aP13 = aP13;
      pdatos.this.AV18BarItem5 = aP14[0];
      this.aP14 = aP14;
      pdatos.this.AV19Barcad = aP15[0];
      this.aP15 = aP15;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV19Barcad = (byte)(0) ;
      /* Using cursor P062T2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A125BarAncAca1 = P062T2_A125BarAncAca1[0] ;
         A143BarDisNum = P062T2_A143BarDisNum[0] ;
         A4812BarEncCli = P062T2_A4812BarEncCli[0] ;
         A1909BarGraAca = P062T2_A1909BarGraAca[0] ;
         A9789BarItem5 = P062T2_A9789BarItem5[0] ;
         A212BarSer = P062T2_A212BarSer[0] ;
         A1652BarSerDsc = P062T2_A1652BarSerDsc[0] ;
         A217BarTipArt = P062T2_A217BarTipArt[0] ;
         n217BarTipArt = P062T2_n217BarTipArt[0] ;
         A252CliCod = P062T2_A252CliCod[0] ;
         n252CliCod = P062T2_n252CliCod[0] ;
         A279CliNom = P062T2_A279CliNom[0] ;
         A221BarTra1 = P062T2_A221BarTra1[0] ;
         A224BarTraP1 = P062T2_A224BarTraP1[0] ;
         A222BarTra2 = P062T2_A222BarTra2[0] ;
         A225BarTraP2 = P062T2_A225BarTraP2[0] ;
         A223BarTra3 = P062T2_A223BarTra3[0] ;
         A226BarTraP3 = P062T2_A226BarTraP3[0] ;
         A279CliNom = P062T2_A279CliNom[0] ;
         AV16BarAncAca1 = A125BarAncAca1 ;
         AV10BarEnccli = ((GXutil.strcmp(A4812BarEncCli, " ")!=0) ? A4812BarEncCli : A143BarDisNum) ;
         AV17BarGraAca = A1909BarGraAca ;
         AV18BarItem5 = A9789BarItem5 ;
         AV11BarSer = A212BarSer ;
         AV12BarSerDsc = A1652BarSerDsc ;
         AV13BarTipARt = A217BarTipArt ;
         GXt_char1 = AV14TipArtDsc ;
         GXv_char2[0] = GXt_char1 ;
         new app.ptipartdsc(remoteHandle, context).execute( A396EmprCod, A217BarTipArt, GXv_char2) ;
         pdatos.this.GXt_char1 = GXv_char2[0] ;
         AV14TipArtDsc = GXt_char1 ;
         AV8Clicod = A252CliCod ;
         AV9CliNom = A279CliNom ;
         if ( GXutil.strcmp(A221BarTra1, " ") != 0 )
         {
            AV15Compo = GXutil.trim( GXutil.str( A224BarTraP1, 3, 0)) + "%" + A221BarTra1 ;
         }
         if ( GXutil.strcmp(A222BarTra2, " ") != 0 )
         {
            if ( GXutil.strcmp(AV15Compo, "") == 0 )
            {
               AV15Compo = GXutil.trim( GXutil.str( A225BarTraP2, 3, 0)) + "%" + A222BarTra2 ;
            }
            else
            {
               AV15Compo += " " + GXutil.trim( GXutil.str( A225BarTraP2, 3, 0)) + "%" + A222BarTra2 ;
            }
         }
         if ( GXutil.strcmp(A223BarTra3, " ") != 0 )
         {
            if ( GXutil.strcmp(AV15Compo, "") == 0 )
            {
               AV15Compo = GXutil.trim( GXutil.str( A226BarTraP3, 3, 0)) + "%" + A223BarTra3 ;
            }
            else
            {
               AV15Compo += " " + GXutil.trim( GXutil.str( A226BarTraP3, 3, 0)) + "%" + A223BarTra3 ;
            }
         }
         AV19Barcad = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      Gx_msg = httpContext.getMessage( "&barcad=", "") + GXutil.str( AV19Barcad, 1, 0) ;
      System.out.println( Gx_msg );
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdatos.this.A396EmprCod;
      this.aP1[0] = pdatos.this.A129BarCod;
      this.aP2[0] = pdatos.this.A132BarCodReo;
      this.aP3[0] = pdatos.this.A130BarCodPar;
      this.aP4[0] = pdatos.this.AV8Clicod;
      this.aP5[0] = pdatos.this.AV9CliNom;
      this.aP6[0] = pdatos.this.AV10BarEnccli;
      this.aP7[0] = pdatos.this.AV11BarSer;
      this.aP8[0] = pdatos.this.AV12BarSerDsc;
      this.aP9[0] = pdatos.this.AV13BarTipARt;
      this.aP10[0] = pdatos.this.AV14TipArtDsc;
      this.aP11[0] = pdatos.this.AV15Compo;
      this.aP12[0] = pdatos.this.AV16BarAncAca1;
      this.aP13[0] = pdatos.this.AV17BarGraAca;
      this.aP14[0] = pdatos.this.AV18BarItem5;
      this.aP15[0] = pdatos.this.AV19Barcad;
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
      P062T2_A396EmprCod = new String[] {""} ;
      P062T2_A129BarCod = new int[1] ;
      P062T2_A132BarCodReo = new byte[1] ;
      P062T2_A130BarCodPar = new String[] {""} ;
      P062T2_A125BarAncAca1 = new short[1] ;
      P062T2_A143BarDisNum = new String[] {""} ;
      P062T2_A4812BarEncCli = new String[] {""} ;
      P062T2_A1909BarGraAca = new short[1] ;
      P062T2_A9789BarItem5 = new String[] {""} ;
      P062T2_A212BarSer = new String[] {""} ;
      P062T2_A1652BarSerDsc = new String[] {""} ;
      P062T2_A217BarTipArt = new short[1] ;
      P062T2_n217BarTipArt = new boolean[] {false} ;
      P062T2_A252CliCod = new int[1] ;
      P062T2_n252CliCod = new boolean[] {false} ;
      P062T2_A279CliNom = new String[] {""} ;
      P062T2_A221BarTra1 = new String[] {""} ;
      P062T2_A224BarTraP1 = new short[1] ;
      P062T2_A222BarTra2 = new String[] {""} ;
      P062T2_A225BarTraP2 = new short[1] ;
      P062T2_A223BarTra3 = new String[] {""} ;
      P062T2_A226BarTraP3 = new short[1] ;
      A143BarDisNum = "" ;
      A4812BarEncCli = "" ;
      A9789BarItem5 = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A279CliNom = "" ;
      A221BarTra1 = "" ;
      A222BarTra2 = "" ;
      A223BarTra3 = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      Gx_msg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdatos__default(),
         new Object[] {
             new Object[] {
            P062T2_A396EmprCod, P062T2_A129BarCod, P062T2_A132BarCodReo, P062T2_A130BarCodPar, P062T2_A125BarAncAca1, P062T2_A143BarDisNum, P062T2_A4812BarEncCli, P062T2_A1909BarGraAca, P062T2_A9789BarItem5, P062T2_A212BarSer,
            P062T2_A1652BarSerDsc, P062T2_A217BarTipArt, P062T2_n217BarTipArt, P062T2_A252CliCod, P062T2_n252CliCod, P062T2_A279CliNom, P062T2_A221BarTra1, P062T2_A224BarTraP1, P062T2_A222BarTra2, P062T2_A225BarTraP2,
            P062T2_A223BarTra3, P062T2_A226BarTraP3
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV19Barcad ;
   private short AV13BarTipARt ;
   private short AV16BarAncAca1 ;
   private short AV17BarGraAca ;
   private short A125BarAncAca1 ;
   private short A1909BarGraAca ;
   private short A217BarTipArt ;
   private short A224BarTraP1 ;
   private short A225BarTraP2 ;
   private short A226BarTraP3 ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV8Clicod ;
   private int A252CliCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV9CliNom ;
   private String AV10BarEnccli ;
   private String AV11BarSer ;
   private String AV12BarSerDsc ;
   private String AV14TipArtDsc ;
   private String AV15Compo ;
   private String AV18BarItem5 ;
   private String scmdbuf ;
   private String A143BarDisNum ;
   private String A4812BarEncCli ;
   private String A9789BarItem5 ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A279CliNom ;
   private String A221BarTra1 ;
   private String A222BarTra2 ;
   private String A223BarTra3 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String Gx_msg ;
   private boolean n217BarTipArt ;
   private boolean n252CliCod ;
   private byte[] aP15 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private String[] aP8 ;
   private short[] aP9 ;
   private String[] aP10 ;
   private String[] aP11 ;
   private short[] aP12 ;
   private short[] aP13 ;
   private String[] aP14 ;
   private IDataStoreProvider pr_default ;
   private String[] P062T2_A396EmprCod ;
   private int[] P062T2_A129BarCod ;
   private byte[] P062T2_A132BarCodReo ;
   private String[] P062T2_A130BarCodPar ;
   private short[] P062T2_A125BarAncAca1 ;
   private String[] P062T2_A143BarDisNum ;
   private String[] P062T2_A4812BarEncCli ;
   private short[] P062T2_A1909BarGraAca ;
   private String[] P062T2_A9789BarItem5 ;
   private String[] P062T2_A212BarSer ;
   private String[] P062T2_A1652BarSerDsc ;
   private short[] P062T2_A217BarTipArt ;
   private boolean[] P062T2_n217BarTipArt ;
   private int[] P062T2_A252CliCod ;
   private boolean[] P062T2_n252CliCod ;
   private String[] P062T2_A279CliNom ;
   private String[] P062T2_A221BarTra1 ;
   private short[] P062T2_A224BarTraP1 ;
   private String[] P062T2_A222BarTra2 ;
   private short[] P062T2_A225BarTraP2 ;
   private String[] P062T2_A223BarTra3 ;
   private short[] P062T2_A226BarTraP3 ;
}

final  class pdatos__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P062T2", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarAncAca1, T1.BarDisNum, T1.BarEncCli, T1.BarGraAca, T1.BarItem5, T1.BarSer, T1.BarSerDsc, T1.BarTipArt, T1.CliCod, T2.CliNom, T1.BarTra1, T1.BarTraP1, T1.BarTra2, T1.BarTraP2, T1.BarTra3, T1.BarTraP3 FROM (TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((String[]) buf[6])[0] = rslt.getString(7, 20);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 20);
               ((String[]) buf[9])[0] = rslt.getString(10, 16);
               ((String[]) buf[10])[0] = rslt.getString(11, 26);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(13);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(14, 30);
               ((String[]) buf[16])[0] = rslt.getString(15, 4);
               ((short[]) buf[17])[0] = rslt.getShort(16);
               ((String[]) buf[18])[0] = rslt.getString(17, 4);
               ((short[]) buf[19])[0] = rslt.getShort(18);
               ((String[]) buf[20])[0] = rslt.getString(19, 4);
               ((short[]) buf[21])[0] = rslt.getShort(20);
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
               return;
      }
   }

}

