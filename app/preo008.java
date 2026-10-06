package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class preo008 extends GXProcedure
{
   public preo008( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( preo008.class ), "" );
   }

   public preo008( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 )
   {
      preo008.this.aP7 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 )
   {
      preo008.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      preo008.this.AV8barcod = aP1[0];
      this.aP1 = aP1;
      preo008.this.AV9barcodreo = aP2[0];
      this.aP2 = aP2;
      preo008.this.AV10barcodpar = aP3[0];
      this.aP3 = aP3;
      preo008.this.AV11barcodnew = aP4[0];
      this.aP4 = aP4;
      preo008.this.AV12barcodreonew = aP5[0];
      this.aP5 = aP5;
      preo008.this.AV13barcodparnew = aP6[0];
      this.aP6 = aP6;
      preo008.this.AV14barpiecod = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P05JE2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8barcod), Byte.valueOf(AV9barcodreo), AV10barcodpar, AV14barpiecod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5623BarTroObs = P05JE2_A5623BarTroObs[0] ;
         n5623BarTroObs = P05JE2_n5623BarTroObs[0] ;
         A200BarPieCod = P05JE2_A200BarPieCod[0] ;
         A130BarCodPar = P05JE2_A130BarCodPar[0] ;
         A132BarCodReo = P05JE2_A132BarCodReo[0] ;
         A129BarCod = P05JE2_A129BarCod[0] ;
         A13253BarTroHor = P05JE2_A13253BarTroHor[0] ;
         n13253BarTroHor = P05JE2_n13253BarTroHor[0] ;
         A13231BarTroOb = P05JE2_A13231BarTroOb[0] ;
         n13231BarTroOb = P05JE2_n13231BarTroOb[0] ;
         A12840BarTroCarr = P05JE2_A12840BarTroCarr[0] ;
         n12840BarTroCarr = P05JE2_n12840BarTroCarr[0] ;
         A6556BarTroKil = P05JE2_A6556BarTroKil[0] ;
         n6556BarTroKil = P05JE2_n6556BarTroKil[0] ;
         A5622BarTroJau = P05JE2_A5622BarTroJau[0] ;
         n5622BarTroJau = P05JE2_n5622BarTroJau[0] ;
         A4992BarTroUltD = P05JE2_A4992BarTroUltD[0] ;
         n4992BarTroUltD = P05JE2_n4992BarTroUltD[0] ;
         A4991BarTroOpeC = P05JE2_A4991BarTroOpeC[0] ;
         n4991BarTroOpeC = P05JE2_n4991BarTroOpeC[0] ;
         A4990BarTroCal = P05JE2_A4990BarTroCal[0] ;
         n4990BarTroCal = P05JE2_n4990BarTroCal[0] ;
         A3864BarTroEst = P05JE2_A3864BarTroEst[0] ;
         n3864BarTroEst = P05JE2_n3864BarTroEst[0] ;
         A3863BarTroFinP = P05JE2_A3863BarTroFinP[0] ;
         n3863BarTroFinP = P05JE2_n3863BarTroFinP[0] ;
         A3733AlbTar = P05JE2_A3733AlbTar[0] ;
         n3733AlbTar = P05JE2_n3733AlbTar[0] ;
         A3862BarTroIden = P05JE2_A3862BarTroIden[0] ;
         n3862BarTroIden = P05JE2_n3862BarTroIden[0] ;
         A3861BarTroAnc = P05JE2_A3861BarTroAnc[0] ;
         n3861BarTroAnc = P05JE2_n3861BarTroAnc[0] ;
         A3860BarTroMet = P05JE2_A3860BarTroMet[0] ;
         n3860BarTroMet = P05JE2_n3860BarTroMet[0] ;
         A3859BarTroFec = P05JE2_A3859BarTroFec[0] ;
         n3859BarTroFec = P05JE2_n3859BarTroFec[0] ;
         A3858BarTroCod = P05JE2_A3858BarTroCod[0] ;
         W396EmprCod = A396EmprCod ;
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         W200BarPieCod = A200BarPieCod ;
         /*
            INSERT RECORD ON TABLE TXPBARTRO

         */
         W396EmprCod = A396EmprCod ;
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         W200BarPieCod = A200BarPieCod ;
         W3858BarTroCod = A3858BarTroCod ;
         A129BarCod = AV11barcodnew ;
         A132BarCodReo = AV12barcodreonew ;
         A130BarCodPar = AV13barcodparnew ;
         A200BarPieCod = AV14barpiecod ;
         /* Using cursor P05JE3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A3858BarTroCod), Boolean.valueOf(n3859BarTroFec), A3859BarTroFec, Boolean.valueOf(n3860BarTroMet), A3860BarTroMet, Boolean.valueOf(n3861BarTroAnc), Short.valueOf(A3861BarTroAnc), Boolean.valueOf(n3862BarTroIden), A3862BarTroIden, Boolean.valueOf(n3733AlbTar), A3733AlbTar, Boolean.valueOf(n3863BarTroFinP), Byte.valueOf(A3863BarTroFinP), Boolean.valueOf(n3864BarTroEst), Byte.valueOf(A3864BarTroEst), Boolean.valueOf(n4990BarTroCal), Byte.valueOf(A4990BarTroCal), Boolean.valueOf(n4991BarTroOpeC), Integer.valueOf(A4991BarTroOpeC), Boolean.valueOf(n4992BarTroUltD), Short.valueOf(A4992BarTroUltD), Boolean.valueOf(n5622BarTroJau), Byte.valueOf(A5622BarTroJau), Boolean.valueOf(n5623BarTroObs), A5623BarTroObs, Boolean.valueOf(n6556BarTroKil), A6556BarTroKil, Boolean.valueOf(n12840BarTroCarr), Short.valueOf(A12840BarTroCarr), Boolean.valueOf(n13231BarTroOb), A13231BarTroOb, Boolean.valueOf(n13253BarTroHor), A13253BarTroHor});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARTRO");
         if ( (pr_default.getStatus(1) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         A396EmprCod = W396EmprCod ;
         A129BarCod = W129BarCod ;
         A132BarCodReo = W132BarCodReo ;
         A130BarCodPar = W130BarCodPar ;
         A200BarPieCod = W200BarPieCod ;
         A3858BarTroCod = W3858BarTroCod ;
         /* End Insert */
         A396EmprCod = W396EmprCod ;
         A129BarCod = W129BarCod ;
         A132BarCodReo = W132BarCodReo ;
         A130BarCodPar = W130BarCodPar ;
         A200BarPieCod = W200BarPieCod ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = preo008.this.A396EmprCod;
      this.aP1[0] = preo008.this.AV8barcod;
      this.aP2[0] = preo008.this.AV9barcodreo;
      this.aP3[0] = preo008.this.AV10barcodpar;
      this.aP4[0] = preo008.this.AV11barcodnew;
      this.aP5[0] = preo008.this.AV12barcodreonew;
      this.aP6[0] = preo008.this.AV13barcodparnew;
      this.aP7[0] = preo008.this.AV14barpiecod;
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
      P05JE2_A5623BarTroObs = new String[] {""} ;
      P05JE2_n5623BarTroObs = new boolean[] {false} ;
      P05JE2_A396EmprCod = new String[] {""} ;
      P05JE2_A200BarPieCod = new String[] {""} ;
      P05JE2_A130BarCodPar = new String[] {""} ;
      P05JE2_A132BarCodReo = new byte[1] ;
      P05JE2_A129BarCod = new int[1] ;
      P05JE2_A13253BarTroHor = new java.util.Date[] {GXutil.nullDate()} ;
      P05JE2_n13253BarTroHor = new boolean[] {false} ;
      P05JE2_A13231BarTroOb = new String[] {""} ;
      P05JE2_n13231BarTroOb = new boolean[] {false} ;
      P05JE2_A12840BarTroCarr = new short[1] ;
      P05JE2_n12840BarTroCarr = new boolean[] {false} ;
      P05JE2_A6556BarTroKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05JE2_n6556BarTroKil = new boolean[] {false} ;
      P05JE2_A5622BarTroJau = new byte[1] ;
      P05JE2_n5622BarTroJau = new boolean[] {false} ;
      P05JE2_A4992BarTroUltD = new short[1] ;
      P05JE2_n4992BarTroUltD = new boolean[] {false} ;
      P05JE2_A4991BarTroOpeC = new int[1] ;
      P05JE2_n4991BarTroOpeC = new boolean[] {false} ;
      P05JE2_A4990BarTroCal = new byte[1] ;
      P05JE2_n4990BarTroCal = new boolean[] {false} ;
      P05JE2_A3864BarTroEst = new byte[1] ;
      P05JE2_n3864BarTroEst = new boolean[] {false} ;
      P05JE2_A3863BarTroFinP = new byte[1] ;
      P05JE2_n3863BarTroFinP = new boolean[] {false} ;
      P05JE2_A3733AlbTar = new String[] {""} ;
      P05JE2_n3733AlbTar = new boolean[] {false} ;
      P05JE2_A3862BarTroIden = new String[] {""} ;
      P05JE2_n3862BarTroIden = new boolean[] {false} ;
      P05JE2_A3861BarTroAnc = new short[1] ;
      P05JE2_n3861BarTroAnc = new boolean[] {false} ;
      P05JE2_A3860BarTroMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05JE2_n3860BarTroMet = new boolean[] {false} ;
      P05JE2_A3859BarTroFec = new java.util.Date[] {GXutil.nullDate()} ;
      P05JE2_n3859BarTroFec = new boolean[] {false} ;
      P05JE2_A3858BarTroCod = new short[1] ;
      A5623BarTroObs = "" ;
      A200BarPieCod = "" ;
      A130BarCodPar = "" ;
      A13253BarTroHor = GXutil.resetTime( GXutil.nullDate() );
      A13231BarTroOb = "" ;
      A6556BarTroKil = DecimalUtil.ZERO ;
      A3733AlbTar = "" ;
      A3862BarTroIden = "" ;
      A3860BarTroMet = DecimalUtil.ZERO ;
      A3859BarTroFec = GXutil.nullDate() ;
      W396EmprCod = "" ;
      W130BarCodPar = "" ;
      W200BarPieCod = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.preo008__default(),
         new Object[] {
             new Object[] {
            P05JE2_A5623BarTroObs, P05JE2_n5623BarTroObs, P05JE2_A396EmprCod, P05JE2_A200BarPieCod, P05JE2_A130BarCodPar, P05JE2_A132BarCodReo, P05JE2_A129BarCod, P05JE2_A13253BarTroHor, P05JE2_n13253BarTroHor, P05JE2_A13231BarTroOb,
            P05JE2_n13231BarTroOb, P05JE2_A12840BarTroCarr, P05JE2_n12840BarTroCarr, P05JE2_A6556BarTroKil, P05JE2_n6556BarTroKil, P05JE2_A5622BarTroJau, P05JE2_n5622BarTroJau, P05JE2_A4992BarTroUltD, P05JE2_n4992BarTroUltD, P05JE2_A4991BarTroOpeC,
            P05JE2_n4991BarTroOpeC, P05JE2_A4990BarTroCal, P05JE2_n4990BarTroCal, P05JE2_A3864BarTroEst, P05JE2_n3864BarTroEst, P05JE2_A3863BarTroFinP, P05JE2_n3863BarTroFinP, P05JE2_A3733AlbTar, P05JE2_n3733AlbTar, P05JE2_A3862BarTroIden,
            P05JE2_n3862BarTroIden, P05JE2_A3861BarTroAnc, P05JE2_n3861BarTroAnc, P05JE2_A3860BarTroMet, P05JE2_n3860BarTroMet, P05JE2_A3859BarTroFec, P05JE2_n3859BarTroFec, P05JE2_A3858BarTroCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV9barcodreo ;
   private byte AV12barcodreonew ;
   private byte A132BarCodReo ;
   private byte A5622BarTroJau ;
   private byte A4990BarTroCal ;
   private byte A3864BarTroEst ;
   private byte A3863BarTroFinP ;
   private byte W132BarCodReo ;
   private short A12840BarTroCarr ;
   private short A4992BarTroUltD ;
   private short A3861BarTroAnc ;
   private short A3858BarTroCod ;
   private short W3858BarTroCod ;
   private short Gx_err ;
   private int AV8barcod ;
   private int AV11barcodnew ;
   private int A129BarCod ;
   private int A4991BarTroOpeC ;
   private int W129BarCod ;
   private int GX_INS531 ;
   private java.math.BigDecimal A6556BarTroKil ;
   private java.math.BigDecimal A3860BarTroMet ;
   private String A396EmprCod ;
   private String AV10barcodpar ;
   private String AV13barcodparnew ;
   private String AV14barpiecod ;
   private String scmdbuf ;
   private String A200BarPieCod ;
   private String A130BarCodPar ;
   private String A13231BarTroOb ;
   private String A3733AlbTar ;
   private String A3862BarTroIden ;
   private String W396EmprCod ;
   private String W130BarCodPar ;
   private String W200BarPieCod ;
   private String Gx_emsg ;
   private java.util.Date A13253BarTroHor ;
   private java.util.Date A3859BarTroFec ;
   private boolean n5623BarTroObs ;
   private boolean n13253BarTroHor ;
   private boolean n13231BarTroOb ;
   private boolean n12840BarTroCarr ;
   private boolean n6556BarTroKil ;
   private boolean n5622BarTroJau ;
   private boolean n4992BarTroUltD ;
   private boolean n4991BarTroOpeC ;
   private boolean n4990BarTroCal ;
   private boolean n3864BarTroEst ;
   private boolean n3863BarTroFinP ;
   private boolean n3733AlbTar ;
   private boolean n3862BarTroIden ;
   private boolean n3861BarTroAnc ;
   private boolean n3860BarTroMet ;
   private boolean n3859BarTroFec ;
   private String A5623BarTroObs ;
   private String[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private String[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P05JE2_A5623BarTroObs ;
   private boolean[] P05JE2_n5623BarTroObs ;
   private String[] P05JE2_A396EmprCod ;
   private String[] P05JE2_A200BarPieCod ;
   private String[] P05JE2_A130BarCodPar ;
   private byte[] P05JE2_A132BarCodReo ;
   private int[] P05JE2_A129BarCod ;
   private java.util.Date[] P05JE2_A13253BarTroHor ;
   private boolean[] P05JE2_n13253BarTroHor ;
   private String[] P05JE2_A13231BarTroOb ;
   private boolean[] P05JE2_n13231BarTroOb ;
   private short[] P05JE2_A12840BarTroCarr ;
   private boolean[] P05JE2_n12840BarTroCarr ;
   private java.math.BigDecimal[] P05JE2_A6556BarTroKil ;
   private boolean[] P05JE2_n6556BarTroKil ;
   private byte[] P05JE2_A5622BarTroJau ;
   private boolean[] P05JE2_n5622BarTroJau ;
   private short[] P05JE2_A4992BarTroUltD ;
   private boolean[] P05JE2_n4992BarTroUltD ;
   private int[] P05JE2_A4991BarTroOpeC ;
   private boolean[] P05JE2_n4991BarTroOpeC ;
   private byte[] P05JE2_A4990BarTroCal ;
   private boolean[] P05JE2_n4990BarTroCal ;
   private byte[] P05JE2_A3864BarTroEst ;
   private boolean[] P05JE2_n3864BarTroEst ;
   private byte[] P05JE2_A3863BarTroFinP ;
   private boolean[] P05JE2_n3863BarTroFinP ;
   private String[] P05JE2_A3733AlbTar ;
   private boolean[] P05JE2_n3733AlbTar ;
   private String[] P05JE2_A3862BarTroIden ;
   private boolean[] P05JE2_n3862BarTroIden ;
   private short[] P05JE2_A3861BarTroAnc ;
   private boolean[] P05JE2_n3861BarTroAnc ;
   private java.math.BigDecimal[] P05JE2_A3860BarTroMet ;
   private boolean[] P05JE2_n3860BarTroMet ;
   private java.util.Date[] P05JE2_A3859BarTroFec ;
   private boolean[] P05JE2_n3859BarTroFec ;
   private short[] P05JE2_A3858BarTroCod ;
}

final  class preo008__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05JE2", "SELECT BarTroObs, EmprCod, BarPieCod, BarCodPar, BarCodReo, BarCod, BarTroHor, BarTroOb, BarTroCarr, BarTroKil, BarTroJau, BarTroUltD, BarTroOpeC, BarTroCal, BarTroEst, BarTroFinP, AlbTar, BarTroIden, BarTroAnc, BarTroMet, BarTroFec, BarTroCod FROM TXPBARTRO WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarTroCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05JE3", "INSERT INTO TXPBARTRO(EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarTroCod, BarTroFec, BarTroMet, BarTroAnc, BarTroIden, AlbTar, BarTroFinP, BarTroEst, BarTroCal, BarTroOpeC, BarTroUltD, BarTroJau, BarTroObs, BarTroKil, BarTroCarr, BarTroOb, BarTroHor) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARTRO")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getString(3, 9);
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 100);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(9);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(11);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(12);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(13);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((byte[]) buf[21])[0] = rslt.getByte(14);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((byte[]) buf[23])[0] = rslt.getByte(15);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((byte[]) buf[25])[0] = rslt.getByte(16);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(17, 2);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(18, 15);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((short[]) buf[31])[0] = rslt.getShort(19);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(20,2);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[35])[0] = rslt.getGXDate(21);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((short[]) buf[37])[0] = rslt.getShort(22);
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
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DATE );
               }
               else
               {
                  stmt.setDate(7, (java.util.Date)parms[7]);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[9], 2);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[11]).shortValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[13], 15);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[15], 2);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(12, ((Number) parms[17]).byteValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(13, ((Number) parms[19]).byteValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(14, ((Number) parms[21]).byteValue());
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(15, ((Number) parms[23]).intValue());
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(16, ((Number) parms[25]).shortValue());
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(17, ((Number) parms[27]).byteValue());
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(18, (String)parms[29]);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(19, (java.math.BigDecimal)parms[31], 2);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(20, ((Number) parms[33]).shortValue());
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[35], 100);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(22, (java.util.Date)parms[37], false);
               }
               return;
      }
   }

}

