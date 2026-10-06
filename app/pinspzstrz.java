package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pinspzstrz extends GXProcedure
{
   public pinspzstrz( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pinspzstrz.class ), "" );
   }

   public pinspzstrz( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 )
   {
      pinspzstrz.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 )
   {
      pinspzstrz.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pinspzstrz.this.AV21AlbProcod = aP1[0];
      this.aP1 = aP1;
      pinspzstrz.this.AV18Barcod = aP2[0];
      this.aP2 = aP2;
      pinspzstrz.this.AV19Barcodreo = aP3[0];
      this.aP3 = aP3;
      pinspzstrz.this.AV20Barcodpar = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV25BarALbMtre = DecimalUtil.doubleToDec(0) ;
      AV26BarAlbKgme = DecimalUtil.doubleToDec(0) ;
      AV24BarALbPie = 0 ;
      /* Using cursor P05E32 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV18Barcod), Byte.valueOf(AV19Barcodreo), AV20Barcodpar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1691BarPieAnc = P05E32_A1691BarPieAnc[0] ;
         n1691BarPieAnc = P05E32_n1691BarPieAnc[0] ;
         A200BarPieCod = P05E32_A200BarPieCod[0] ;
         A130BarCodPar = P05E32_A130BarCodPar[0] ;
         A132BarCodReo = P05E32_A132BarCodReo[0] ;
         A129BarCod = P05E32_A129BarCod[0] ;
         A201BarPieEst = P05E32_A201BarPieEst[0] ;
         A170BarKilLan = P05E32_A170BarKilLan[0] ;
         A183BarMetLan = P05E32_A183BarMetLan[0] ;
         W396EmprCod = A396EmprCod ;
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         AV22AlbPKilEnt = DecimalUtil.doubleToDec(0) ;
         AV23AlbPMtrEnt = DecimalUtil.doubleToDec(0) ;
         /* Using cursor P05E33 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A3858BarTroCod = P05E33_A3858BarTroCod[0] ;
            A3860BarTroMet = P05E33_A3860BarTroMet[0] ;
            n3860BarTroMet = P05E33_n3860BarTroMet[0] ;
            A6556BarTroKil = P05E33_A6556BarTroKil[0] ;
            n6556BarTroKil = P05E33_n6556BarTroKil[0] ;
            A3861BarTroAnc = P05E33_A3861BarTroAnc[0] ;
            n3861BarTroAnc = P05E33_n3861BarTroAnc[0] ;
            W396EmprCod = A396EmprCod ;
            W129BarCod = A129BarCod ;
            W132BarCodReo = A132BarCodReo ;
            W130BarCodPar = A130BarCodPar ;
            W200BarPieCod = A200BarPieCod ;
            /*
               INSERT RECORD ON TABLE TXPLALTRZ

            */
            W396EmprCod = A396EmprCod ;
            W129BarCod = A129BarCod ;
            W132BarCodReo = A132BarCodReo ;
            W130BarCodPar = A130BarCodPar ;
            W200BarPieCod = A200BarPieCod ;
            W3733AlbTar = A3733AlbTar ;
            n3733AlbTar = false ;
            A30AlbProCod = AV21AlbProcod ;
            A129BarCod = AV18Barcod ;
            A132BarCodReo = AV19Barcodreo ;
            A130BarCodPar = AV20Barcodpar ;
            A42AlbPTroCod = A3858BarTroCod ;
            A43AlbPTroMet = A3860BarTroMet ;
            A5303AlbPTroKil = A6556BarTroKil ;
            A3118AlbPTroAnc = A3861BarTroAnc ;
            A3733AlbTar = "" ;
            n3733AlbTar = false ;
            A3969AlbPTroTrn = (short)(0) ;
            A3970AlbPTroFEn = GXutil.nullDate() ;
            /* Using cursor P05E34 */
            pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A42AlbPTroCod), A43AlbPTroMet, Short.valueOf(A3118AlbPTroAnc), Boolean.valueOf(n3733AlbTar), A3733AlbTar, A5303AlbPTroKil, Short.valueOf(A3969AlbPTroTrn), A3970AlbPTroFEn});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLALTRZ");
            if ( (pr_default.getStatus(2) == 1) )
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
            A3733AlbTar = W3733AlbTar ;
            n3733AlbTar = false ;
            /* End Insert */
            AV22AlbPKilEnt = AV22AlbPKilEnt.add(A6556BarTroKil) ;
            AV23AlbPMtrEnt = AV23AlbPMtrEnt.add(A3860BarTroMet) ;
            A396EmprCod = W396EmprCod ;
            A129BarCod = W129BarCod ;
            A132BarCodReo = W132BarCodReo ;
            A130BarCodPar = W130BarCodPar ;
            A200BarPieCod = W200BarPieCod ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /*
            INSERT RECORD ON TABLE TXPLALPRD

         */
         W396EmprCod = A396EmprCod ;
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         W200BarPieCod = A200BarPieCod ;
         A30AlbProCod = AV21AlbProcod ;
         A129BarCod = AV18Barcod ;
         A132BarCodReo = AV19Barcodreo ;
         A130BarCodPar = AV20Barcodpar ;
         A27AlbPKilEnt = AV22AlbPKilEnt ;
         A1270AlbPMtrEnt = AV23AlbPMtrEnt ;
         A2848AlbPieDsc = " " ;
         A3117AlbPreAnc = A1691BarPieAnc ;
         n3117AlbPreAnc = false ;
         A3395AlbPKilNet = DecimalUtil.doubleToDec(0) ;
         n3395AlbPKilNet = false ;
         A3396AlbPMtrNet = DecimalUtil.doubleToDec(0) ;
         n3396AlbPMtrNet = false ;
         A10131AlbPreAncc = (short)(0) ;
         n10131AlbPreAncc = false ;
         A10132AlbPrePgd = DecimalUtil.doubleToDec(0) ;
         n10132AlbPrePgd = false ;
         A3965AlbTarAlb = "" ;
         A3966AlbPTrnCod = (short)(0) ;
         A3967AlbPTrnFec = GXutil.nullDate() ;
         /* Using cursor P05E35 */
         pr_default.execute(3, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, A27AlbPKilEnt, A1270AlbPMtrEnt, A2848AlbPieDsc, Boolean.valueOf(n3117AlbPreAnc), Short.valueOf(A3117AlbPreAnc), Boolean.valueOf(n3395AlbPKilNet), A3395AlbPKilNet, Boolean.valueOf(n3396AlbPMtrNet), A3396AlbPMtrNet, Boolean.valueOf(n10131AlbPreAncc), Short.valueOf(A10131AlbPreAncc), Boolean.valueOf(n10132AlbPrePgd), A10132AlbPrePgd, A3965AlbTarAlb, Short.valueOf(A3966AlbPTrnCod), A3967AlbPTrnFec});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLALPRD");
         if ( (pr_default.getStatus(3) == 1) )
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
         /* End Insert */
         A201BarPieEst = (byte)(((A201BarPieEst==0) ? 1 : A201BarPieEst)) ;
         A170BarKilLan = AV22AlbPKilEnt ;
         A183BarMetLan = AV23AlbPMtrEnt ;
         AV26BarAlbKgme = AV26BarAlbKgme.add(AV22AlbPKilEnt) ;
         AV25BarALbMtre = AV25BarALbMtre.add(AV23AlbPMtrEnt) ;
         AV24BarALbPie = (int)(AV24BarALbPie+1) ;
         /* Using cursor P05E36 */
         pr_default.execute(4, new Object[] {Byte.valueOf(A201BarPieEst), A170BarKilLan, A183BarMetLan, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
         A396EmprCod = W396EmprCod ;
         A129BarCod = W129BarCod ;
         A132BarCodReo = W132BarCodReo ;
         A130BarCodPar = W130BarCodPar ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      GXv_char1[0] = A396EmprCod ;
      GXv_int2[0] = AV21AlbProcod ;
      GXv_int3[0] = AV18Barcod ;
      GXv_int4[0] = AV19Barcodreo ;
      GXv_char5[0] = AV20Barcodpar ;
      new app.pupdalbbar(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_int4, GXv_char5) ;
      pinspzstrz.this.A396EmprCod = GXv_char1[0] ;
      pinspzstrz.this.AV21AlbProcod = GXv_int2[0] ;
      pinspzstrz.this.AV18Barcod = GXv_int3[0] ;
      pinspzstrz.this.AV19Barcodreo = GXv_int4[0] ;
      pinspzstrz.this.AV20Barcodpar = GXv_char5[0] ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pinspzstrz.this.A396EmprCod;
      this.aP1[0] = pinspzstrz.this.AV21AlbProcod;
      this.aP2[0] = pinspzstrz.this.AV18Barcod;
      this.aP3[0] = pinspzstrz.this.AV19Barcodreo;
      this.aP4[0] = pinspzstrz.this.AV20Barcodpar;
      Application.commitDataStores(context, remoteHandle, pr_default, "pinspzstrz");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV25BarALbMtre = DecimalUtil.ZERO ;
      AV26BarAlbKgme = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P05E32_A396EmprCod = new String[] {""} ;
      P05E32_A1691BarPieAnc = new short[1] ;
      P05E32_n1691BarPieAnc = new boolean[] {false} ;
      P05E32_A200BarPieCod = new String[] {""} ;
      P05E32_A130BarCodPar = new String[] {""} ;
      P05E32_A132BarCodReo = new byte[1] ;
      P05E32_A129BarCod = new int[1] ;
      P05E32_A201BarPieEst = new byte[1] ;
      P05E32_A170BarKilLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05E32_A183BarMetLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A200BarPieCod = "" ;
      A130BarCodPar = "" ;
      A170BarKilLan = DecimalUtil.ZERO ;
      A183BarMetLan = DecimalUtil.ZERO ;
      W396EmprCod = "" ;
      W130BarCodPar = "" ;
      AV22AlbPKilEnt = DecimalUtil.ZERO ;
      AV23AlbPMtrEnt = DecimalUtil.ZERO ;
      P05E33_A396EmprCod = new String[] {""} ;
      P05E33_A129BarCod = new int[1] ;
      P05E33_A132BarCodReo = new byte[1] ;
      P05E33_A130BarCodPar = new String[] {""} ;
      P05E33_A200BarPieCod = new String[] {""} ;
      P05E33_A3858BarTroCod = new short[1] ;
      P05E33_A3860BarTroMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05E33_n3860BarTroMet = new boolean[] {false} ;
      P05E33_A6556BarTroKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05E33_n6556BarTroKil = new boolean[] {false} ;
      P05E33_A3861BarTroAnc = new short[1] ;
      P05E33_n3861BarTroAnc = new boolean[] {false} ;
      A3860BarTroMet = DecimalUtil.ZERO ;
      A6556BarTroKil = DecimalUtil.ZERO ;
      W200BarPieCod = "" ;
      W3733AlbTar = "" ;
      A3733AlbTar = "" ;
      A43AlbPTroMet = DecimalUtil.ZERO ;
      A5303AlbPTroKil = DecimalUtil.ZERO ;
      A3970AlbPTroFEn = GXutil.nullDate() ;
      Gx_emsg = "" ;
      A27AlbPKilEnt = DecimalUtil.ZERO ;
      A1270AlbPMtrEnt = DecimalUtil.ZERO ;
      A2848AlbPieDsc = "" ;
      A3395AlbPKilNet = DecimalUtil.ZERO ;
      A3396AlbPMtrNet = DecimalUtil.ZERO ;
      A10132AlbPrePgd = DecimalUtil.ZERO ;
      A3965AlbTarAlb = "" ;
      A3967AlbPTrnFec = GXutil.nullDate() ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new long[1] ;
      GXv_int3 = new int[1] ;
      GXv_int4 = new byte[1] ;
      GXv_char5 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pinspzstrz__default(),
         new Object[] {
             new Object[] {
            P05E32_A396EmprCod, P05E32_A1691BarPieAnc, P05E32_n1691BarPieAnc, P05E32_A200BarPieCod, P05E32_A130BarCodPar, P05E32_A132BarCodReo, P05E32_A129BarCod, P05E32_A201BarPieEst, P05E32_A170BarKilLan, P05E32_A183BarMetLan
            }
            , new Object[] {
            P05E33_A396EmprCod, P05E33_A129BarCod, P05E33_A132BarCodReo, P05E33_A130BarCodPar, P05E33_A200BarPieCod, P05E33_A3858BarTroCod, P05E33_A3860BarTroMet, P05E33_n3860BarTroMet, P05E33_A6556BarTroKil, P05E33_n6556BarTroKil,
            P05E33_A3861BarTroAnc, P05E33_n3861BarTroAnc
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV19Barcodreo ;
   private byte A132BarCodReo ;
   private byte A201BarPieEst ;
   private byte W132BarCodReo ;
   private byte GXv_int4[] ;
   private short A1691BarPieAnc ;
   private short A3858BarTroCod ;
   private short A3861BarTroAnc ;
   private short A42AlbPTroCod ;
   private short A3118AlbPTroAnc ;
   private short A3969AlbPTroTrn ;
   private short Gx_err ;
   private short A3117AlbPreAnc ;
   private short A10131AlbPreAncc ;
   private short A3966AlbPTrnCod ;
   private int AV18Barcod ;
   private int AV24BarALbPie ;
   private int A129BarCod ;
   private int W129BarCod ;
   private int GX_INS198 ;
   private int GX_INS197 ;
   private int GXv_int3[] ;
   private long AV21AlbProcod ;
   private long A30AlbProCod ;
   private long GXv_int2[] ;
   private java.math.BigDecimal AV25BarALbMtre ;
   private java.math.BigDecimal AV26BarAlbKgme ;
   private java.math.BigDecimal A170BarKilLan ;
   private java.math.BigDecimal A183BarMetLan ;
   private java.math.BigDecimal AV22AlbPKilEnt ;
   private java.math.BigDecimal AV23AlbPMtrEnt ;
   private java.math.BigDecimal A3860BarTroMet ;
   private java.math.BigDecimal A6556BarTroKil ;
   private java.math.BigDecimal A43AlbPTroMet ;
   private java.math.BigDecimal A5303AlbPTroKil ;
   private java.math.BigDecimal A27AlbPKilEnt ;
   private java.math.BigDecimal A1270AlbPMtrEnt ;
   private java.math.BigDecimal A3395AlbPKilNet ;
   private java.math.BigDecimal A3396AlbPMtrNet ;
   private java.math.BigDecimal A10132AlbPrePgd ;
   private String A396EmprCod ;
   private String AV20Barcodpar ;
   private String scmdbuf ;
   private String A200BarPieCod ;
   private String A130BarCodPar ;
   private String W396EmprCod ;
   private String W130BarCodPar ;
   private String W200BarPieCod ;
   private String W3733AlbTar ;
   private String A3733AlbTar ;
   private String Gx_emsg ;
   private String A2848AlbPieDsc ;
   private String A3965AlbTarAlb ;
   private String GXv_char1[] ;
   private String GXv_char5[] ;
   private java.util.Date A3970AlbPTroFEn ;
   private java.util.Date A3967AlbPTrnFec ;
   private boolean n1691BarPieAnc ;
   private boolean n3860BarTroMet ;
   private boolean n6556BarTroKil ;
   private boolean n3861BarTroAnc ;
   private boolean n3733AlbTar ;
   private boolean n3117AlbPreAnc ;
   private boolean n3395AlbPKilNet ;
   private boolean n3396AlbPMtrNet ;
   private boolean n10131AlbPreAncc ;
   private boolean n10132AlbPrePgd ;
   private String[] aP4 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P05E32_A396EmprCod ;
   private short[] P05E32_A1691BarPieAnc ;
   private boolean[] P05E32_n1691BarPieAnc ;
   private String[] P05E32_A200BarPieCod ;
   private String[] P05E32_A130BarCodPar ;
   private byte[] P05E32_A132BarCodReo ;
   private int[] P05E32_A129BarCod ;
   private byte[] P05E32_A201BarPieEst ;
   private java.math.BigDecimal[] P05E32_A170BarKilLan ;
   private java.math.BigDecimal[] P05E32_A183BarMetLan ;
   private String[] P05E33_A396EmprCod ;
   private int[] P05E33_A129BarCod ;
   private byte[] P05E33_A132BarCodReo ;
   private String[] P05E33_A130BarCodPar ;
   private String[] P05E33_A200BarPieCod ;
   private short[] P05E33_A3858BarTroCod ;
   private java.math.BigDecimal[] P05E33_A3860BarTroMet ;
   private boolean[] P05E33_n3860BarTroMet ;
   private java.math.BigDecimal[] P05E33_A6556BarTroKil ;
   private boolean[] P05E33_n6556BarTroKil ;
   private short[] P05E33_A3861BarTroAnc ;
   private boolean[] P05E33_n3861BarTroAnc ;
}

final  class pinspzstrz__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05E32", "SELECT EmprCod, BarPieAnc, BarPieCod, BarCodPar, BarCodReo, BarCod, BarPieEst, BarKilLan, BarMetLan FROM TXPBARPIE WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (BarPieEst = 0) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05E33", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarTroCod, BarTroMet, BarTroKil, BarTroAnc FROM TXPBARTRO WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05E34", "INSERT INTO TXPLALTRZ(EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod, AlbPTroCod, AlbPTroMet, AlbPTroAnc, AlbTar, AlbPTroKil, AlbPTroTrn, AlbPTroFEn, AlbPTroCar, AlbPTroEst) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLALTRZ")
         ,new UpdateCursor("P05E35", "INSERT INTO TXPLALPRD(EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod, AlbPKilEnt, AlbPMtrEnt, AlbPieDsc, AlbPreAnc, AlbPKilNet, AlbPMtrNet, AlbPreAncc, AlbPrePgd, AlbTarAlb, AlbPTrnCod, AlbPTrnFec) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLALPRD")
         ,new UpdateCursor("P05E36", "UPDATE TXPBARPIE SET BarPieEst=?, BarKilLan=?, BarMetLan=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 9);
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 2);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[10], 2);
               }
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[11], 2);
               stmt.setShort(12, ((Number) parms[12]).shortValue());
               stmt.setDate(13, (java.util.Date)parms[13]);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 2);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 2);
               stmt.setString(9, (String)parms[8], 20);
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[10]).shortValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[12], 2);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[14], 2);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(13, ((Number) parms[16]).shortValue());
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(14, (java.math.BigDecimal)parms[18], 2);
               }
               stmt.setString(15, (String)parms[19], 2);
               stmt.setShort(16, ((Number) parms[20]).shortValue());
               stmt.setDate(17, (java.util.Date)parms[21]);
               return;
            case 4 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               stmt.setString(8, (String)parms[7], 9);
               return;
      }
   }

}

