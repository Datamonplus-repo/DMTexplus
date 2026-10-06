package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmasinf2 extends GXProcedure
{
   public pmasinf2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmasinf2.class ), "" );
   }

   public pmasinf2( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             short[] aP8 ,
                             byte[] aP9 ,
                             String[] aP10 ,
                             String[] aP11 ,
                             int[] aP12 ,
                             String[] aP13 ,
                             String[] aP14 ,
                             short[] aP15 ,
                             String[] aP16 ,
                             String[] aP17 ,
                             int[] aP18 ,
                             java.math.BigDecimal[] aP19 ,
                             java.util.Date[] aP20 )
   {
      pmasinf2.this.aP21 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21);
      return aP21[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        short[] aP8 ,
                        byte[] aP9 ,
                        String[] aP10 ,
                        String[] aP11 ,
                        int[] aP12 ,
                        String[] aP13 ,
                        String[] aP14 ,
                        short[] aP15 ,
                        String[] aP16 ,
                        String[] aP17 ,
                        int[] aP18 ,
                        java.math.BigDecimal[] aP19 ,
                        java.util.Date[] aP20 ,
                        String[] aP21 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             short[] aP8 ,
                             byte[] aP9 ,
                             String[] aP10 ,
                             String[] aP11 ,
                             int[] aP12 ,
                             String[] aP13 ,
                             String[] aP14 ,
                             short[] aP15 ,
                             String[] aP16 ,
                             String[] aP17 ,
                             int[] aP18 ,
                             java.math.BigDecimal[] aP19 ,
                             java.util.Date[] aP20 ,
                             String[] aP21 )
   {
      pmasinf2.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmasinf2.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pmasinf2.this.A494ForSer = aP2[0];
      this.aP2 = aP2;
      pmasinf2.this.A482ForColNom = aP3[0];
      this.aP3 = aP3;
      pmasinf2.this.A483ForColNum = aP4[0];
      this.aP4 = aP4;
      pmasinf2.this.A831TipColCod = aP5[0];
      this.aP5 = aP5;
      pmasinf2.this.AV8Intens = aP6[0];
      this.aP6 = aP6;
      pmasinf2.this.AV9Matiz = aP7[0];
      this.aP7 = aP7;
      pmasinf2.this.AV15MatCod = aP8[0];
      this.aP8 = aP8;
      pmasinf2.this.AV10TipColCod = aP9[0];
      this.aP9 = aP9;
      pmasinf2.this.AV11TipCol = aP10[0];
      this.aP10 = aP10;
      pmasinf2.this.AV12Tonalidad = aP11[0];
      this.aP11 = aP11;
      pmasinf2.this.AV16Numcli = aP12[0];
      this.aP12 = aP12;
      pmasinf2.this.AV17ForTonal = aP13[0];
      this.aP13 = aP13;
      pmasinf2.this.AV13DscSol = aP14[0];
      this.aP14 = aP14;
      pmasinf2.this.AV14CodSol = aP15[0];
      this.aP15 = aP15;
      pmasinf2.this.AV18Macprocod = aP16[0];
      this.aP16 = aP16;
      pmasinf2.this.AV19Fornomcli2 = aP17[0];
      this.aP17 = aP17;
      pmasinf2.this.AV20Fornumarc = aP18[0];
      this.aP18 = aP18;
      pmasinf2.this.AV21ForKgTTin = aP19[0];
      this.aP19 = aP19;
      pmasinf2.this.AV23Forfechor = aP20[0];
      this.aP20 = aP20;
      pmasinf2.this.AV22Forusrcod = aP21[0];
      this.aP21 = aP21;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV20Fornumarc = 0 ;
      /* Using cursor P059J2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A583IntCod = P059J2_A583IntCod[0] ;
         A5742ForSerDsc = P059J2_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P059J2_n5742ForSerDsc[0] ;
         A584IntDsc = P059J2_A584IntDsc[0] ;
         n584IntDsc = P059J2_n584IntDsc[0] ;
         A627MatDsc = P059J2_A627MatDsc[0] ;
         n627MatDsc = P059J2_n627MatDsc[0] ;
         A626MatCod = P059J2_A626MatCod[0] ;
         A832TipColDsc = P059J2_A832TipColDsc[0] ;
         n832TipColDsc = P059J2_n832TipColDsc[0] ;
         A1191ForNomCli = P059J2_A1191ForNomCli[0] ;
         n1191ForNomCli = P059J2_n1191ForNomCli[0] ;
         A1192ForNumCli = P059J2_A1192ForNumCli[0] ;
         n1192ForNumCli = P059J2_n1192ForNumCli[0] ;
         A995ForTonal = P059J2_A995ForTonal[0] ;
         n995ForTonal = P059J2_n995ForTonal[0] ;
         A3317DscSol = P059J2_A3317DscSol[0] ;
         n3317DscSol = P059J2_n3317DscSol[0] ;
         A3316CodSol = P059J2_A3316CodSol[0] ;
         n3316CodSol = P059J2_n3316CodSol[0] ;
         A1514MacProCod = P059J2_A1514MacProCod[0] ;
         n1514MacProCod = P059J2_n1514MacProCod[0] ;
         A6379ForNomCli2 = P059J2_A6379ForNomCli2[0] ;
         n6379ForNomCli2 = P059J2_n6379ForNomCli2[0] ;
         A3315ForNumArc = P059J2_A3315ForNumArc[0] ;
         n3315ForNumArc = P059J2_n3315ForNumArc[0] ;
         A4225ForKgTTin = P059J2_A4225ForKgTTin[0] ;
         n4225ForKgTTin = P059J2_n4225ForKgTTin[0] ;
         A5624ForUsrCod = P059J2_A5624ForUsrCod[0] ;
         n5624ForUsrCod = P059J2_n5624ForUsrCod[0] ;
         A5625ForFecHor = P059J2_A5625ForFecHor[0] ;
         n5625ForFecHor = P059J2_n5625ForFecHor[0] ;
         A584IntDsc = P059J2_A584IntDsc[0] ;
         n584IntDsc = P059J2_n584IntDsc[0] ;
         A627MatDsc = P059J2_A627MatDsc[0] ;
         n627MatDsc = P059J2_n627MatDsc[0] ;
         A3317DscSol = P059J2_A3317DscSol[0] ;
         n3317DscSol = P059J2_n3317DscSol[0] ;
         A832TipColDsc = P059J2_A832TipColDsc[0] ;
         n832TipColDsc = P059J2_n832TipColDsc[0] ;
         AV8Intens = A584IntDsc ;
         AV9Matiz = A627MatDsc ;
         AV15MatCod = A626MatCod ;
         AV10TipColCod = A831TipColCod ;
         AV11TipCol = A832TipColDsc ;
         AV12Tonalidad = A1191ForNomCli ;
         AV16Numcli = A1192ForNumCli ;
         AV17ForTonal = A995ForTonal ;
         AV13DscSol = A3317DscSol ;
         AV14CodSol = A3316CodSol ;
         AV18Macprocod = A1514MacProCod ;
         AV19Fornomcli2 = A6379ForNomCli2 ;
         AV20Fornumarc = A3315ForNumArc ;
         AV21ForKgTTin = A4225ForKgTTin ;
         AV22Forusrcod = A5624ForUsrCod ;
         AV23Forfechor = A5625ForFecHor ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmasinf2.this.A396EmprCod;
      this.aP1[0] = pmasinf2.this.A252CliCod;
      this.aP2[0] = pmasinf2.this.A494ForSer;
      this.aP3[0] = pmasinf2.this.A482ForColNom;
      this.aP4[0] = pmasinf2.this.A483ForColNum;
      this.aP5[0] = pmasinf2.this.A831TipColCod;
      this.aP6[0] = pmasinf2.this.AV8Intens;
      this.aP7[0] = pmasinf2.this.AV9Matiz;
      this.aP8[0] = pmasinf2.this.AV15MatCod;
      this.aP9[0] = pmasinf2.this.AV10TipColCod;
      this.aP10[0] = pmasinf2.this.AV11TipCol;
      this.aP11[0] = pmasinf2.this.AV12Tonalidad;
      this.aP12[0] = pmasinf2.this.AV16Numcli;
      this.aP13[0] = pmasinf2.this.AV17ForTonal;
      this.aP14[0] = pmasinf2.this.AV13DscSol;
      this.aP15[0] = pmasinf2.this.AV14CodSol;
      this.aP16[0] = pmasinf2.this.AV18Macprocod;
      this.aP17[0] = pmasinf2.this.AV19Fornomcli2;
      this.aP18[0] = pmasinf2.this.AV20Fornumarc;
      this.aP19[0] = pmasinf2.this.AV21ForKgTTin;
      this.aP20[0] = pmasinf2.this.AV23Forfechor;
      this.aP21[0] = pmasinf2.this.AV22Forusrcod;
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
      P059J2_A583IntCod = new byte[1] ;
      P059J2_A396EmprCod = new String[] {""} ;
      P059J2_A252CliCod = new int[1] ;
      P059J2_A494ForSer = new String[] {""} ;
      P059J2_A482ForColNom = new String[] {""} ;
      P059J2_A483ForColNum = new int[1] ;
      P059J2_A831TipColCod = new byte[1] ;
      P059J2_A5742ForSerDsc = new String[] {""} ;
      P059J2_n5742ForSerDsc = new boolean[] {false} ;
      P059J2_A584IntDsc = new String[] {""} ;
      P059J2_n584IntDsc = new boolean[] {false} ;
      P059J2_A627MatDsc = new String[] {""} ;
      P059J2_n627MatDsc = new boolean[] {false} ;
      P059J2_A626MatCod = new short[1] ;
      P059J2_A832TipColDsc = new String[] {""} ;
      P059J2_n832TipColDsc = new boolean[] {false} ;
      P059J2_A1191ForNomCli = new String[] {""} ;
      P059J2_n1191ForNomCli = new boolean[] {false} ;
      P059J2_A1192ForNumCli = new int[1] ;
      P059J2_n1192ForNumCli = new boolean[] {false} ;
      P059J2_A995ForTonal = new String[] {""} ;
      P059J2_n995ForTonal = new boolean[] {false} ;
      P059J2_A3317DscSol = new String[] {""} ;
      P059J2_n3317DscSol = new boolean[] {false} ;
      P059J2_A3316CodSol = new short[1] ;
      P059J2_n3316CodSol = new boolean[] {false} ;
      P059J2_A1514MacProCod = new String[] {""} ;
      P059J2_n1514MacProCod = new boolean[] {false} ;
      P059J2_A6379ForNomCli2 = new String[] {""} ;
      P059J2_n6379ForNomCli2 = new boolean[] {false} ;
      P059J2_A3315ForNumArc = new int[1] ;
      P059J2_n3315ForNumArc = new boolean[] {false} ;
      P059J2_A4225ForKgTTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P059J2_n4225ForKgTTin = new boolean[] {false} ;
      P059J2_A5624ForUsrCod = new String[] {""} ;
      P059J2_n5624ForUsrCod = new boolean[] {false} ;
      P059J2_A5625ForFecHor = new java.util.Date[] {GXutil.nullDate()} ;
      P059J2_n5625ForFecHor = new boolean[] {false} ;
      A5742ForSerDsc = "" ;
      A584IntDsc = "" ;
      A627MatDsc = "" ;
      A832TipColDsc = "" ;
      A1191ForNomCli = "" ;
      A995ForTonal = "" ;
      A3317DscSol = "" ;
      A1514MacProCod = "" ;
      A6379ForNomCli2 = "" ;
      A4225ForKgTTin = DecimalUtil.ZERO ;
      A5624ForUsrCod = "" ;
      A5625ForFecHor = GXutil.resetTime( GXutil.nullDate() );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmasinf2__default(),
         new Object[] {
             new Object[] {
            P059J2_A583IntCod, P059J2_A396EmprCod, P059J2_A252CliCod, P059J2_A494ForSer, P059J2_A482ForColNom, P059J2_A483ForColNum, P059J2_A831TipColCod, P059J2_A5742ForSerDsc, P059J2_n5742ForSerDsc, P059J2_A584IntDsc,
            P059J2_n584IntDsc, P059J2_A627MatDsc, P059J2_n627MatDsc, P059J2_A626MatCod, P059J2_A832TipColDsc, P059J2_n832TipColDsc, P059J2_A1191ForNomCli, P059J2_n1191ForNomCli, P059J2_A1192ForNumCli, P059J2_n1192ForNumCli,
            P059J2_A995ForTonal, P059J2_n995ForTonal, P059J2_A3317DscSol, P059J2_n3317DscSol, P059J2_A3316CodSol, P059J2_n3316CodSol, P059J2_A1514MacProCod, P059J2_n1514MacProCod, P059J2_A6379ForNomCli2, P059J2_n6379ForNomCli2,
            P059J2_A3315ForNumArc, P059J2_n3315ForNumArc, P059J2_A4225ForKgTTin, P059J2_n4225ForKgTTin, P059J2_A5624ForUsrCod, P059J2_n5624ForUsrCod, P059J2_A5625ForFecHor, P059J2_n5625ForFecHor
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A831TipColCod ;
   private byte AV10TipColCod ;
   private byte A583IntCod ;
   private short AV15MatCod ;
   private short AV14CodSol ;
   private short A626MatCod ;
   private short A3316CodSol ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int AV16Numcli ;
   private int AV20Fornumarc ;
   private int A1192ForNumCli ;
   private int A3315ForNumArc ;
   private java.math.BigDecimal AV21ForKgTTin ;
   private java.math.BigDecimal A4225ForKgTTin ;
   private String A396EmprCod ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private String AV8Intens ;
   private String AV9Matiz ;
   private String AV11TipCol ;
   private String AV12Tonalidad ;
   private String AV17ForTonal ;
   private String AV13DscSol ;
   private String AV18Macprocod ;
   private String AV19Fornomcli2 ;
   private String AV22Forusrcod ;
   private String scmdbuf ;
   private String A5742ForSerDsc ;
   private String A584IntDsc ;
   private String A627MatDsc ;
   private String A832TipColDsc ;
   private String A1191ForNomCli ;
   private String A995ForTonal ;
   private String A3317DscSol ;
   private String A1514MacProCod ;
   private String A6379ForNomCli2 ;
   private String A5624ForUsrCod ;
   private java.util.Date AV23Forfechor ;
   private java.util.Date A5625ForFecHor ;
   private boolean n5742ForSerDsc ;
   private boolean n584IntDsc ;
   private boolean n627MatDsc ;
   private boolean n832TipColDsc ;
   private boolean n1191ForNomCli ;
   private boolean n1192ForNumCli ;
   private boolean n995ForTonal ;
   private boolean n3317DscSol ;
   private boolean n3316CodSol ;
   private boolean n1514MacProCod ;
   private boolean n6379ForNomCli2 ;
   private boolean n3315ForNumArc ;
   private boolean n4225ForKgTTin ;
   private boolean n5624ForUsrCod ;
   private boolean n5625ForFecHor ;
   private String[] aP21 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private short[] aP8 ;
   private byte[] aP9 ;
   private String[] aP10 ;
   private String[] aP11 ;
   private int[] aP12 ;
   private String[] aP13 ;
   private String[] aP14 ;
   private short[] aP15 ;
   private String[] aP16 ;
   private String[] aP17 ;
   private int[] aP18 ;
   private java.math.BigDecimal[] aP19 ;
   private java.util.Date[] aP20 ;
   private IDataStoreProvider pr_default ;
   private byte[] P059J2_A583IntCod ;
   private String[] P059J2_A396EmprCod ;
   private int[] P059J2_A252CliCod ;
   private String[] P059J2_A494ForSer ;
   private String[] P059J2_A482ForColNom ;
   private int[] P059J2_A483ForColNum ;
   private byte[] P059J2_A831TipColCod ;
   private String[] P059J2_A5742ForSerDsc ;
   private boolean[] P059J2_n5742ForSerDsc ;
   private String[] P059J2_A584IntDsc ;
   private boolean[] P059J2_n584IntDsc ;
   private String[] P059J2_A627MatDsc ;
   private boolean[] P059J2_n627MatDsc ;
   private short[] P059J2_A626MatCod ;
   private String[] P059J2_A832TipColDsc ;
   private boolean[] P059J2_n832TipColDsc ;
   private String[] P059J2_A1191ForNomCli ;
   private boolean[] P059J2_n1191ForNomCli ;
   private int[] P059J2_A1192ForNumCli ;
   private boolean[] P059J2_n1192ForNumCli ;
   private String[] P059J2_A995ForTonal ;
   private boolean[] P059J2_n995ForTonal ;
   private String[] P059J2_A3317DscSol ;
   private boolean[] P059J2_n3317DscSol ;
   private short[] P059J2_A3316CodSol ;
   private boolean[] P059J2_n3316CodSol ;
   private String[] P059J2_A1514MacProCod ;
   private boolean[] P059J2_n1514MacProCod ;
   private String[] P059J2_A6379ForNomCli2 ;
   private boolean[] P059J2_n6379ForNomCli2 ;
   private int[] P059J2_A3315ForNumArc ;
   private boolean[] P059J2_n3315ForNumArc ;
   private java.math.BigDecimal[] P059J2_A4225ForKgTTin ;
   private boolean[] P059J2_n4225ForKgTTin ;
   private String[] P059J2_A5624ForUsrCod ;
   private boolean[] P059J2_n5624ForUsrCod ;
   private java.util.Date[] P059J2_A5625ForFecHor ;
   private boolean[] P059J2_n5625ForFecHor ;
}

final  class pmasinf2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P059J2", "SELECT T1.IntCod, T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod, T1.ForSerDsc, T2.IntDsc, T3.MatDsc, T1.MatCod, T5.TipColDsc, T1.ForNomCli, T1.ForNumCli, T1.ForTonal, T4.DscSol, T1.CodSol, T1.MacProCod, T1.ForNomCli2, T1.ForNumArc, T1.ForKgTTin, T1.ForUsrCod, T1.ForFecHor FROM ((((TXPCFORMU T1 INNER JOIN TXPINTENS T2 ON T2.EmprCod = T1.EmprCod AND T2.IntCod = T1.IntCod) INNER JOIN TXPMATICE T3 ON T3.EmprCod = T1.EmprCod AND T3.MatCod = T1.MatCod) LEFT JOIN TXPSOLIDE T4 ON T4.EmprCod = T1.EmprCod AND T4.CodSol = T1.CodSol) INNER JOIN TXPTIPCOL T5 ON T5.EmprCod = T1.EmprCod AND T5.TipColCod = T1.TipColCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ForSer = ? and T1.ForColNom = ? and T1.ForColNum = ? and T1.TipColCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(11);
               ((String[]) buf[14])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(13, 13);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((int[]) buf[18])[0] = rslt.getInt(14);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(15, 20);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(16, 30);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((short[]) buf[24])[0] = rslt.getShort(17);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(18, 6);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(19, 20);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((int[]) buf[30])[0] = rslt.getInt(20);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[32])[0] = rslt.getBigDecimal(21,2);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(22, 8);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[36])[0] = rslt.getGXDateTime(23);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
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
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
      }
   }

}

