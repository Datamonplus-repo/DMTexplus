package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class preceta2 extends GXProcedure
{
   public preceta2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( preceta2.class ), "" );
   }

   public preceta2( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            int[] aP2 ,
                            byte[] aP3 ,
                            String[] aP4 ,
                            String[] aP5 ,
                            String[] aP6 ,
                            byte[] aP7 ,
                            String[] aP8 ,
                            String[] aP9 ,
                            int[] aP10 ,
                            String[] aP11 )
   {
      preceta2.this.aP12 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
      return aP12[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        byte[] aP7 ,
                        String[] aP8 ,
                        String[] aP9 ,
                        int[] aP10 ,
                        String[] aP11 ,
                        short[] aP12 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             byte[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             int[] aP10 ,
                             String[] aP11 ,
                             short[] aP12 )
   {
      preceta2.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      preceta2.this.AV15Cliente = aP1[0];
      this.aP1 = aP1;
      preceta2.this.AV16BarCod = aP2[0];
      this.aP2 = aP2;
      preceta2.this.AV17BarCodReo = aP3[0];
      this.aP3 = aP3;
      preceta2.this.AV18BarCodPar = aP4[0];
      this.aP4 = aP4;
      preceta2.this.AV19Intens = aP5[0];
      this.aP5 = aP5;
      preceta2.this.AV20Matiz = aP6[0];
      this.aP6 = aP6;
      preceta2.this.AV21TipColCod = aP7[0];
      this.aP7 = aP7;
      preceta2.this.AV22TipCol = aP8[0];
      this.aP8 = aP8;
      preceta2.this.AV23Tonalidad = aP9[0];
      this.aP9 = aP9;
      preceta2.this.AV24NumCli = aP10[0];
      this.aP10 = aP10;
      preceta2.this.AV25Serie = aP11[0];
      this.aP11 = aP11;
      preceta2.this.AV26MatCod = aP12[0];
      this.aP12 = aP12;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P005Y2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P005Y2_A130BarCodPar[0] ;
         A132BarCodReo = P005Y2_A132BarCodReo[0] ;
         A129BarCod = P005Y2_A129BarCod[0] ;
         A252CliCod = P005Y2_A252CliCod[0] ;
         n252CliCod = P005Y2_n252CliCod[0] ;
         A212BarSer = P005Y2_A212BarSer[0] ;
         A135BarColNom = P005Y2_A135BarColNom[0] ;
         A136BarColNum = P005Y2_A136BarColNum[0] ;
         A218BarTipCol = P005Y2_A218BarTipCol[0] ;
         A1652BarSerDsc = P005Y2_A1652BarSerDsc[0] ;
         AV15Cliente = A252CliCod ;
         AV31ArtCod = A212BarSer ;
         AV27ForSer = A212BarSer ;
         AV28ForColNom = A135BarColNom ;
         AV29ForColNum = A136BarColNum ;
         AV21TipColCod = A218BarTipCol ;
         AV25Serie = A1652BarSerDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Execute user subroutine: 'BUSFOR' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Using cursor P005Y3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV15Cliente), AV31ArtCod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A252CliCod = P005Y3_A252CliCod[0] ;
         n252CliCod = P005Y3_n252CliCod[0] ;
         A65ArtCod = P005Y3_A65ArtCod[0] ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      cleanup();
   }

   public void S111( )
   {
      /* 'BUSFOR' Routine */
      returnInSub = false ;
      /* Using cursor P005Y4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV15Cliente), AV27ForSer, AV28ForColNom, Integer.valueOf(AV29ForColNum), Byte.valueOf(AV21TipColCod)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A583IntCod = P005Y4_A583IntCod[0] ;
         A831TipColCod = P005Y4_A831TipColCod[0] ;
         A483ForColNum = P005Y4_A483ForColNum[0] ;
         A482ForColNom = P005Y4_A482ForColNom[0] ;
         A494ForSer = P005Y4_A494ForSer[0] ;
         A252CliCod = P005Y4_A252CliCod[0] ;
         n252CliCod = P005Y4_n252CliCod[0] ;
         A584IntDsc = P005Y4_A584IntDsc[0] ;
         n584IntDsc = P005Y4_n584IntDsc[0] ;
         A627MatDsc = P005Y4_A627MatDsc[0] ;
         n627MatDsc = P005Y4_n627MatDsc[0] ;
         A626MatCod = P005Y4_A626MatCod[0] ;
         A832TipColDsc = P005Y4_A832TipColDsc[0] ;
         n832TipColDsc = P005Y4_n832TipColDsc[0] ;
         A1191ForNomCli = P005Y4_A1191ForNomCli[0] ;
         n1191ForNomCli = P005Y4_n1191ForNomCli[0] ;
         A1192ForNumCli = P005Y4_A1192ForNumCli[0] ;
         n1192ForNumCli = P005Y4_n1192ForNumCli[0] ;
         A584IntDsc = P005Y4_A584IntDsc[0] ;
         n584IntDsc = P005Y4_n584IntDsc[0] ;
         A627MatDsc = P005Y4_A627MatDsc[0] ;
         n627MatDsc = P005Y4_n627MatDsc[0] ;
         A832TipColDsc = P005Y4_A832TipColDsc[0] ;
         n832TipColDsc = P005Y4_n832TipColDsc[0] ;
         AV19Intens = A584IntDsc ;
         AV20Matiz = A627MatDsc ;
         AV26MatCod = A626MatCod ;
         AV21TipColCod = A831TipColCod ;
         AV22TipCol = A832TipColDsc ;
         AV23Tonalidad = A1191ForNomCli ;
         AV24NumCli = A1192ForNumCli ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP0[0] = preceta2.this.A396EmprCod;
      this.aP1[0] = preceta2.this.AV15Cliente;
      this.aP2[0] = preceta2.this.AV16BarCod;
      this.aP3[0] = preceta2.this.AV17BarCodReo;
      this.aP4[0] = preceta2.this.AV18BarCodPar;
      this.aP5[0] = preceta2.this.AV19Intens;
      this.aP6[0] = preceta2.this.AV20Matiz;
      this.aP7[0] = preceta2.this.AV21TipColCod;
      this.aP8[0] = preceta2.this.AV22TipCol;
      this.aP9[0] = preceta2.this.AV23Tonalidad;
      this.aP10[0] = preceta2.this.AV24NumCli;
      this.aP11[0] = preceta2.this.AV25Serie;
      this.aP12[0] = preceta2.this.AV26MatCod;
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
      P005Y2_A396EmprCod = new String[] {""} ;
      P005Y2_A130BarCodPar = new String[] {""} ;
      P005Y2_A132BarCodReo = new byte[1] ;
      P005Y2_A129BarCod = new int[1] ;
      P005Y2_A252CliCod = new int[1] ;
      P005Y2_n252CliCod = new boolean[] {false} ;
      P005Y2_A212BarSer = new String[] {""} ;
      P005Y2_A135BarColNom = new String[] {""} ;
      P005Y2_A136BarColNum = new int[1] ;
      P005Y2_A218BarTipCol = new byte[1] ;
      P005Y2_A1652BarSerDsc = new String[] {""} ;
      A130BarCodPar = "" ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A1652BarSerDsc = "" ;
      AV31ArtCod = "" ;
      AV27ForSer = "" ;
      AV28ForColNom = "" ;
      P005Y3_A396EmprCod = new String[] {""} ;
      P005Y3_A252CliCod = new int[1] ;
      P005Y3_n252CliCod = new boolean[] {false} ;
      P005Y3_A65ArtCod = new String[] {""} ;
      A65ArtCod = "" ;
      P005Y4_A583IntCod = new byte[1] ;
      P005Y4_A396EmprCod = new String[] {""} ;
      P005Y4_A831TipColCod = new byte[1] ;
      P005Y4_A483ForColNum = new int[1] ;
      P005Y4_A482ForColNom = new String[] {""} ;
      P005Y4_A494ForSer = new String[] {""} ;
      P005Y4_A252CliCod = new int[1] ;
      P005Y4_n252CliCod = new boolean[] {false} ;
      P005Y4_A584IntDsc = new String[] {""} ;
      P005Y4_n584IntDsc = new boolean[] {false} ;
      P005Y4_A627MatDsc = new String[] {""} ;
      P005Y4_n627MatDsc = new boolean[] {false} ;
      P005Y4_A626MatCod = new short[1] ;
      P005Y4_A832TipColDsc = new String[] {""} ;
      P005Y4_n832TipColDsc = new boolean[] {false} ;
      P005Y4_A1191ForNomCli = new String[] {""} ;
      P005Y4_n1191ForNomCli = new boolean[] {false} ;
      P005Y4_A1192ForNumCli = new int[1] ;
      P005Y4_n1192ForNumCli = new boolean[] {false} ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A584IntDsc = "" ;
      A627MatDsc = "" ;
      A832TipColDsc = "" ;
      A1191ForNomCli = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.preceta2__default(),
         new Object[] {
             new Object[] {
            P005Y2_A396EmprCod, P005Y2_A130BarCodPar, P005Y2_A132BarCodReo, P005Y2_A129BarCod, P005Y2_A252CliCod, P005Y2_n252CliCod, P005Y2_A212BarSer, P005Y2_A135BarColNom, P005Y2_A136BarColNum, P005Y2_A218BarTipCol,
            P005Y2_A1652BarSerDsc
            }
            , new Object[] {
            P005Y3_A396EmprCod, P005Y3_A252CliCod, P005Y3_A65ArtCod
            }
            , new Object[] {
            P005Y4_A583IntCod, P005Y4_A396EmprCod, P005Y4_A831TipColCod, P005Y4_A483ForColNum, P005Y4_A482ForColNom, P005Y4_A494ForSer, P005Y4_A252CliCod, P005Y4_A584IntDsc, P005Y4_n584IntDsc, P005Y4_A627MatDsc,
            P005Y4_n627MatDsc, P005Y4_A626MatCod, P005Y4_A832TipColDsc, P005Y4_n832TipColDsc, P005Y4_A1191ForNomCli, P005Y4_n1191ForNomCli, P005Y4_A1192ForNumCli, P005Y4_n1192ForNumCli
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17BarCodReo ;
   private byte AV21TipColCod ;
   private byte A132BarCodReo ;
   private byte A218BarTipCol ;
   private byte A583IntCod ;
   private byte A831TipColCod ;
   private short AV26MatCod ;
   private short A626MatCod ;
   private short Gx_err ;
   private int AV15Cliente ;
   private int AV16BarCod ;
   private int AV24NumCli ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int AV29ForColNum ;
   private int A483ForColNum ;
   private int A1192ForNumCli ;
   private String A396EmprCod ;
   private String AV18BarCodPar ;
   private String AV19Intens ;
   private String AV20Matiz ;
   private String AV22TipCol ;
   private String AV23Tonalidad ;
   private String AV25Serie ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A1652BarSerDsc ;
   private String AV31ArtCod ;
   private String AV27ForSer ;
   private String AV28ForColNom ;
   private String A65ArtCod ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A584IntDsc ;
   private String A627MatDsc ;
   private String A832TipColDsc ;
   private String A1191ForNomCli ;
   private boolean n252CliCod ;
   private boolean returnInSub ;
   private boolean n584IntDsc ;
   private boolean n627MatDsc ;
   private boolean n832TipColDsc ;
   private boolean n1191ForNomCli ;
   private boolean n1192ForNumCli ;
   private short[] aP12 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private byte[] aP7 ;
   private String[] aP8 ;
   private String[] aP9 ;
   private int[] aP10 ;
   private String[] aP11 ;
   private IDataStoreProvider pr_default ;
   private String[] P005Y2_A396EmprCod ;
   private String[] P005Y2_A130BarCodPar ;
   private byte[] P005Y2_A132BarCodReo ;
   private int[] P005Y2_A129BarCod ;
   private int[] P005Y2_A252CliCod ;
   private boolean[] P005Y2_n252CliCod ;
   private String[] P005Y2_A212BarSer ;
   private String[] P005Y2_A135BarColNom ;
   private int[] P005Y2_A136BarColNum ;
   private byte[] P005Y2_A218BarTipCol ;
   private String[] P005Y2_A1652BarSerDsc ;
   private String[] P005Y3_A396EmprCod ;
   private int[] P005Y3_A252CliCod ;
   private boolean[] P005Y3_n252CliCod ;
   private String[] P005Y3_A65ArtCod ;
   private byte[] P005Y4_A583IntCod ;
   private String[] P005Y4_A396EmprCod ;
   private byte[] P005Y4_A831TipColCod ;
   private int[] P005Y4_A483ForColNum ;
   private String[] P005Y4_A482ForColNom ;
   private String[] P005Y4_A494ForSer ;
   private int[] P005Y4_A252CliCod ;
   private boolean[] P005Y4_n252CliCod ;
   private String[] P005Y4_A584IntDsc ;
   private boolean[] P005Y4_n584IntDsc ;
   private String[] P005Y4_A627MatDsc ;
   private boolean[] P005Y4_n627MatDsc ;
   private short[] P005Y4_A626MatCod ;
   private String[] P005Y4_A832TipColDsc ;
   private boolean[] P005Y4_n832TipColDsc ;
   private String[] P005Y4_A1191ForNomCli ;
   private boolean[] P005Y4_n1191ForNomCli ;
   private int[] P005Y4_A1192ForNumCli ;
   private boolean[] P005Y4_n1192ForNumCli ;
}

final  class preceta2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P005Y2", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, CliCod, BarSer, BarColNom, BarColNum, BarTipCol, BarSerDsc FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P005Y3", "SELECT EmprCod, CliCod, ArtCod FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P005Y4", "SELECT T1.IntCod, T1.EmprCod, T1.TipColCod, T1.ForColNum, T1.ForColNom, T1.ForSer, T1.CliCod, T2.IntDsc, T3.MatDsc, T1.MatCod, T4.TipColDsc, T1.ForNomCli, T1.ForNumCli FROM (((TXPCFORMU T1 INNER JOIN TXPINTENS T2 ON T2.EmprCod = T1.EmprCod AND T2.IntCod = T1.IntCod) INNER JOIN TXPMATICE T3 ON T3.EmprCod = T1.EmprCod AND T3.MatCod = T1.MatCod) INNER JOIN TXPTIPCOL T4 ON T4.EmprCod = T1.EmprCod AND T4.TipColCod = T1.TipColCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ForSer = ? and T1.ForColNom = ? and T1.ForColNum = ? and T1.TipColCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((String[]) buf[7])[0] = rslt.getString(7, 13);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 26);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(10);
               ((String[]) buf[12])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(12, 13);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(13);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
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
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
      }
   }

}

