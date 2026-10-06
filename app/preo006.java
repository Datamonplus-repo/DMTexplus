package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class preo006 extends GXProcedure
{
   public preo006( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( preo006.class ), "" );
   }

   public preo006( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             int[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             byte[] aP8 ,
                             java.math.BigDecimal[] aP9 ,
                             java.math.BigDecimal[] aP10 ,
                             short[] aP11 ,
                             String[] aP12 ,
                             int[] aP13 ,
                             int[] aP14 ,
                             String[] aP15 ,
                             String[] aP16 ,
                             java.math.BigDecimal[] aP17 ,
                             java.math.BigDecimal[] aP18 ,
                             byte[] aP19 ,
                             short[] aP20 ,
                             short[] aP21 ,
                             java.math.BigDecimal[] aP22 ,
                             String[] aP23 )
   {
      preo006.this.aP24 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22, aP23, aP24);
      return aP24[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        int[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        byte[] aP8 ,
                        java.math.BigDecimal[] aP9 ,
                        java.math.BigDecimal[] aP10 ,
                        short[] aP11 ,
                        String[] aP12 ,
                        int[] aP13 ,
                        int[] aP14 ,
                        String[] aP15 ,
                        String[] aP16 ,
                        java.math.BigDecimal[] aP17 ,
                        java.math.BigDecimal[] aP18 ,
                        byte[] aP19 ,
                        short[] aP20 ,
                        short[] aP21 ,
                        java.math.BigDecimal[] aP22 ,
                        String[] aP23 ,
                        String[] aP24 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22, aP23, aP24);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             int[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             byte[] aP8 ,
                             java.math.BigDecimal[] aP9 ,
                             java.math.BigDecimal[] aP10 ,
                             short[] aP11 ,
                             String[] aP12 ,
                             int[] aP13 ,
                             int[] aP14 ,
                             String[] aP15 ,
                             String[] aP16 ,
                             java.math.BigDecimal[] aP17 ,
                             java.math.BigDecimal[] aP18 ,
                             byte[] aP19 ,
                             short[] aP20 ,
                             short[] aP21 ,
                             java.math.BigDecimal[] aP22 ,
                             String[] aP23 ,
                             String[] aP24 )
   {
      preo006.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      preo006.this.AV16BarCod = aP1[0];
      this.aP1 = aP1;
      preo006.this.AV17BarCodReo = aP2[0];
      this.aP2 = aP2;
      preo006.this.AV18BarCodPar = aP3[0];
      this.aP3 = aP3;
      preo006.this.AV19BarPieCod = aP4[0];
      this.aP4 = aP4;
      preo006.this.AV20AlbRecCod = aP5[0];
      this.aP5 = aP5;
      preo006.this.AV21BarPieKil = aP6[0];
      this.aP6 = aP6;
      preo006.this.AV22BarPieMet = aP7[0];
      this.aP7 = aP7;
      preo006.this.AV23BarPieEst = aP8[0];
      this.aP8 = aP8;
      preo006.this.AV24BarKilLan = aP9[0];
      this.aP9 = aP9;
      preo006.this.AV25BarMetLan = aP10[0];
      this.aP10 = aP10;
      preo006.this.AV26BarPConTro = aP11[0];
      this.aP11 = aP11;
      preo006.this.AV27PieOriCod = aP12[0];
      this.aP12 = aP12;
      preo006.this.AV28BarPieLzd = aP13[0];
      this.aP13 = aP13;
      preo006.this.AV29BarPiePie = aP14[0];
      this.aP14 = aP14;
      preo006.this.AV33BarPieLoc = aP15[0];
      this.aP15 = aP15;
      preo006.this.AV43PzaB80 = aP16[0];
      this.aP16 = aP16;
      preo006.this.AV44BarPiek1 = aP17[0];
      this.aP17 = aP17;
      preo006.this.AV45barPieK2 = aP18[0];
      this.aP18 = aP18;
      preo006.this.AV46BarNpes = aP19[0];
      this.aP19 = aP19;
      preo006.this.AV47BarPieanc = aP20[0];
      this.aP20 = aP20;
      preo006.this.AV48BarPieAncc = aP21[0];
      this.aP21 = aP21;
      preo006.this.AV49BarPiePda = aP22[0];
      this.aP22 = aP22;
      preo006.this.AV50Bapieobs = aP23[0];
      this.aP23 = aP23;
      preo006.this.AV51Codbarpz = aP24[0];
      this.aP24 = aP24;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV30FlagHil = (byte)(0) ;
      GXv_int1[0] = AV30FlagHil ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "HILO", ""), GXv_int1) ;
      preo006.this.AV30FlagHil = GXv_int1[0] ;
      AV31FlagBros = (byte)(0) ;
      GXv_int1[0] = AV31FlagBros ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "BROS", ""), GXv_int1) ;
      preo006.this.AV31FlagBros = GXv_int1[0] ;
      GXt_char2 = AV40ContDsc ;
      GXv_char3[0] = AV15EmprCod ;
      GXv_char4[0] = httpContext.getMessage( "CLISKP", "") ;
      GXv_char5[0] = GXt_char2 ;
      new app.pbusdsc(remoteHandle, context).execute( GXv_char3, GXv_char4, GXv_char5) ;
      preo006.this.AV15EmprCod = GXv_char3[0] ;
      preo006.this.GXt_char2 = GXv_char5[0] ;
      AV40ContDsc = GXt_char2 ;
      AV38CliPropio = (int)(GXutil.lval( GXutil.trim( AV40ContDsc))) ;
      GXt_int6 = AV41Vincolor ;
      GXv_int1[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "VINCOL", ""), GXv_int1) ;
      preo006.this.GXt_int6 = GXv_int1[0] ;
      AV41Vincolor = GXt_int6 ;
      GXt_int6 = AV52Torient ;
      GXv_int1[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "TORIEN", ""), GXv_int1) ;
      preo006.this.GXt_int6 = GXv_int1[0] ;
      AV52Torient = GXt_int6 ;
      GXt_int6 = AV53IniDatosPzaExpAut ;
      GXv_int1[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "INIEPA", ""), GXv_int1) ;
      preo006.this.GXt_int6 = GXv_int1[0] ;
      AV53IniDatosPzaExpAut = GXt_int6 ;
      /*
         INSERT RECORD ON TABLE TXPBARPIE

      */
      A396EmprCod = AV15EmprCod ;
      A129BarCod = AV16BarCod ;
      A132BarCodReo = AV17BarCodReo ;
      A130BarCodPar = AV18BarCodPar ;
      A200BarPieCod = AV19BarPieCod ;
      A44AlbRecCod = AV20AlbRecCod ;
      A203BarPieKil = AV21BarPieKil ;
      A205BarPieMet = AV22BarPieMet ;
      A201BarPieEst = AV23BarPieEst ;
      A170BarKilLan = AV24BarKilLan ;
      A183BarMetLan = AV25BarMetLan ;
      A197BarPConTro = AV26BarPConTro ;
      A908PieOriCod = AV27PieOriCod ;
      A1271BarPieLzd = AV28BarPieLzd ;
      A1501BarPiePie = AV29BarPiePie ;
      A2186BarPieLoc = AV33BarPieLoc ;
      n2186BarPieLoc = false ;
      A6489BarPieIdPz = "" ;
      n6489BarPieIdPz = false ;
      if ( AV41Vincolor == 1 )
      {
         A6489BarPieIdPz = GXutil.str( AV16BarCod, 8, 0) + GXutil.str( AV17BarCodReo, 1, 0) + AV18BarCodPar ;
         n6489BarPieIdPz = false ;
      }
      A8907PzaB80 = AV43PzaB80 ;
      n8907PzaB80 = false ;
      A9795BarPieK1 = AV44BarPiek1 ;
      n9795BarPieK1 = false ;
      A9796BarPieK2 = AV45barPieK2 ;
      n9796BarPieK2 = false ;
      A9800BarNPes = AV46BarNpes ;
      n9800BarNPes = false ;
      A1691BarPieAnc = AV47BarPieanc ;
      n1691BarPieAnc = false ;
      A9846BarPieAncc = AV48BarPieAncc ;
      n9846BarPieAncc = false ;
      A9984BarPiePda = AV49BarPiePda ;
      n9984BarPiePda = false ;
      A8707BapieObs = AV50Bapieobs ;
      n8707BapieObs = false ;
      A8838CodBarPz = AV51Codbarpz ;
      n8838CodBarPz = false ;
      if ( AV52Torient == 1 )
      {
         A3275BarKgsAut = DecimalUtil.doubleToDec(0) ;
         n3275BarKgsAut = false ;
         A3276BarMtsAut = DecimalUtil.doubleToDec(0) ;
         n3276BarMtsAut = false ;
         A8707BapieObs = " " ;
         n8707BapieObs = false ;
         A8838CodBarPz = " " ;
         n8838CodBarPz = false ;
         A9800BarNPes = (byte)(0) ;
         n9800BarNPes = false ;
      }
      if ( AV53IniDatosPzaExpAut == 1 )
      {
         A6489BarPieIdPz = "" ;
         n6489BarPieIdPz = false ;
         A1691BarPieAnc = (short)(0) ;
         n1691BarPieAnc = false ;
         A8707BapieObs = " " ;
         n8707BapieObs = false ;
         A1919BarPieObs = " " ;
         n1919BarPieObs = false ;
         A1642BarPieOrd = 0 ;
         n1642BarPieOrd = false ;
         A12911BarPieFep = GXutil.nullDate() ;
         n12911BarPieFep = false ;
         A2186BarPieLoc = " " ;
         n2186BarPieLoc = false ;
         A12113BarPieCLd = (byte)(0) ;
         n12113BarPieCLd = false ;
         A12920BarPieColD = " " ;
         n12920BarPieColD = false ;
         A12921BarPieColN = 0 ;
         n12921BarPieColN = false ;
         A12926BarPieCoCI = " " ;
         n12926BarPieCoCI = false ;
         A12927BarPieCoCN = 0 ;
         n12927BarPieCoCN = false ;
         A12923BarPieArtD = " " ;
         n12923BarPieArtD = false ;
         A12922BarPieArtI = " " ;
         n12922BarPieArtI = false ;
         A12924BarPieCliI = 0 ;
         n12924BarPieCliI = false ;
         A12925BarPieCliN = " " ;
         n12925BarPieCliN = false ;
         A3275BarKgsAut = DecimalUtil.doubleToDec(0) ;
         n3275BarKgsAut = false ;
         A3276BarMtsAut = DecimalUtil.doubleToDec(0) ;
         n3276BarMtsAut = false ;
         A9800BarNPes = (byte)(0) ;
         n9800BarNPes = false ;
         A8838CodBarPz = " " ;
         n8838CodBarPz = false ;
      }
      /* Using cursor P04R22 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Integer.valueOf(A44AlbRecCod), A203BarPieKil, A205BarPieMet, Byte.valueOf(A201BarPieEst), A170BarKilLan, A183BarMetLan, Short.valueOf(A197BarPConTro), A908PieOriCod, Integer.valueOf(A1271BarPieLzd), Integer.valueOf(A1501BarPiePie), Boolean.valueOf(n1691BarPieAnc), Short.valueOf(A1691BarPieAnc), Boolean.valueOf(n2186BarPieLoc), A2186BarPieLoc, Boolean.valueOf(n3275BarKgsAut), A3275BarKgsAut, Boolean.valueOf(n3276BarMtsAut), A3276BarMtsAut, Boolean.valueOf(n6489BarPieIdPz), A6489BarPieIdPz, Boolean.valueOf(n8707BapieObs), A8707BapieObs, Boolean.valueOf(n8838CodBarPz), A8838CodBarPz, Boolean.valueOf(n8907PzaB80), A8907PzaB80, Boolean.valueOf(n9795BarPieK1), A9795BarPieK1, Boolean.valueOf(n9796BarPieK2), A9796BarPieK2, Boolean.valueOf(n9800BarNPes), Byte.valueOf(A9800BarNPes), Boolean.valueOf(n9846BarPieAncc), Short.valueOf(A9846BarPieAncc), Boolean.valueOf(n9984BarPiePda), A9984BarPiePda, Boolean.valueOf(n1919BarPieObs), A1919BarPieObs, Boolean.valueOf(n1642BarPieOrd), Integer.valueOf(A1642BarPieOrd), Boolean.valueOf(n12113BarPieCLd), Byte.valueOf(A12113BarPieCLd), Boolean.valueOf(n12911BarPieFep), A12911BarPieFep, Boolean.valueOf(n12920BarPieColD), A12920BarPieColD, Boolean.valueOf(n12921BarPieColN), Integer.valueOf(A12921BarPieColN), Boolean.valueOf(n12922BarPieArtI), A12922BarPieArtI, Boolean.valueOf(n12923BarPieArtD), A12923BarPieArtD, Boolean.valueOf(n12924BarPieCliI), Integer.valueOf(A12924BarPieCliI), Boolean.valueOf(n12925BarPieCliN), A12925BarPieCliN, Boolean.valueOf(n12926BarPieCoCI), A12926BarPieCoCI, Boolean.valueOf(n12927BarPieCoCN), Integer.valueOf(A12927BarPieCoCN)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
      if ( (pr_default.getStatus(0) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = preo006.this.AV15EmprCod;
      this.aP1[0] = preo006.this.AV16BarCod;
      this.aP2[0] = preo006.this.AV17BarCodReo;
      this.aP3[0] = preo006.this.AV18BarCodPar;
      this.aP4[0] = preo006.this.AV19BarPieCod;
      this.aP5[0] = preo006.this.AV20AlbRecCod;
      this.aP6[0] = preo006.this.AV21BarPieKil;
      this.aP7[0] = preo006.this.AV22BarPieMet;
      this.aP8[0] = preo006.this.AV23BarPieEst;
      this.aP9[0] = preo006.this.AV24BarKilLan;
      this.aP10[0] = preo006.this.AV25BarMetLan;
      this.aP11[0] = preo006.this.AV26BarPConTro;
      this.aP12[0] = preo006.this.AV27PieOriCod;
      this.aP13[0] = preo006.this.AV28BarPieLzd;
      this.aP14[0] = preo006.this.AV29BarPiePie;
      this.aP15[0] = preo006.this.AV33BarPieLoc;
      this.aP16[0] = preo006.this.AV43PzaB80;
      this.aP17[0] = preo006.this.AV44BarPiek1;
      this.aP18[0] = preo006.this.AV45barPieK2;
      this.aP19[0] = preo006.this.AV46BarNpes;
      this.aP20[0] = preo006.this.AV47BarPieanc;
      this.aP21[0] = preo006.this.AV48BarPieAncc;
      this.aP22[0] = preo006.this.AV49BarPiePda;
      this.aP23[0] = preo006.this.AV50Bapieobs;
      this.aP24[0] = preo006.this.AV51Codbarpz;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV40ContDsc = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_int1 = new byte[1] ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A200BarPieCod = "" ;
      A203BarPieKil = DecimalUtil.ZERO ;
      A205BarPieMet = DecimalUtil.ZERO ;
      A170BarKilLan = DecimalUtil.ZERO ;
      A183BarMetLan = DecimalUtil.ZERO ;
      A908PieOriCod = "" ;
      A2186BarPieLoc = "" ;
      A6489BarPieIdPz = "" ;
      A8907PzaB80 = "" ;
      A9795BarPieK1 = DecimalUtil.ZERO ;
      A9796BarPieK2 = DecimalUtil.ZERO ;
      A9984BarPiePda = DecimalUtil.ZERO ;
      A8707BapieObs = "" ;
      A8838CodBarPz = "" ;
      A3275BarKgsAut = DecimalUtil.ZERO ;
      A3276BarMtsAut = DecimalUtil.ZERO ;
      A1919BarPieObs = "" ;
      A12911BarPieFep = GXutil.nullDate() ;
      A12920BarPieColD = "" ;
      A12926BarPieCoCI = "" ;
      A12923BarPieArtD = "" ;
      A12922BarPieArtI = "" ;
      A12925BarPieCliN = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.preo006__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17BarCodReo ;
   private byte AV23BarPieEst ;
   private byte AV46BarNpes ;
   private byte AV30FlagHil ;
   private byte AV31FlagBros ;
   private byte AV41Vincolor ;
   private byte AV52Torient ;
   private byte AV53IniDatosPzaExpAut ;
   private byte GXt_int6 ;
   private byte GXv_int1[] ;
   private byte A132BarCodReo ;
   private byte A201BarPieEst ;
   private byte A9800BarNPes ;
   private byte A12113BarPieCLd ;
   private short AV26BarPConTro ;
   private short AV47BarPieanc ;
   private short AV48BarPieAncc ;
   private short A197BarPConTro ;
   private short A1691BarPieAnc ;
   private short A9846BarPieAncc ;
   private short Gx_err ;
   private int AV16BarCod ;
   private int AV20AlbRecCod ;
   private int AV28BarPieLzd ;
   private int AV29BarPiePie ;
   private int AV38CliPropio ;
   private int GX_INS18 ;
   private int A129BarCod ;
   private int A44AlbRecCod ;
   private int A1271BarPieLzd ;
   private int A1501BarPiePie ;
   private int A1642BarPieOrd ;
   private int A12921BarPieColN ;
   private int A12927BarPieCoCN ;
   private int A12924BarPieCliI ;
   private java.math.BigDecimal AV21BarPieKil ;
   private java.math.BigDecimal AV22BarPieMet ;
   private java.math.BigDecimal AV24BarKilLan ;
   private java.math.BigDecimal AV25BarMetLan ;
   private java.math.BigDecimal AV44BarPiek1 ;
   private java.math.BigDecimal AV45barPieK2 ;
   private java.math.BigDecimal AV49BarPiePda ;
   private java.math.BigDecimal A203BarPieKil ;
   private java.math.BigDecimal A205BarPieMet ;
   private java.math.BigDecimal A170BarKilLan ;
   private java.math.BigDecimal A183BarMetLan ;
   private java.math.BigDecimal A9795BarPieK1 ;
   private java.math.BigDecimal A9796BarPieK2 ;
   private java.math.BigDecimal A9984BarPiePda ;
   private java.math.BigDecimal A3275BarKgsAut ;
   private java.math.BigDecimal A3276BarMtsAut ;
   private String AV15EmprCod ;
   private String AV18BarCodPar ;
   private String AV19BarPieCod ;
   private String AV27PieOriCod ;
   private String AV33BarPieLoc ;
   private String AV43PzaB80 ;
   private String AV50Bapieobs ;
   private String AV51Codbarpz ;
   private String AV40ContDsc ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A200BarPieCod ;
   private String A908PieOriCod ;
   private String A2186BarPieLoc ;
   private String A6489BarPieIdPz ;
   private String A8907PzaB80 ;
   private String A8707BapieObs ;
   private String A8838CodBarPz ;
   private String A1919BarPieObs ;
   private String A12920BarPieColD ;
   private String A12926BarPieCoCI ;
   private String A12923BarPieArtD ;
   private String A12922BarPieArtI ;
   private String A12925BarPieCliN ;
   private String Gx_emsg ;
   private java.util.Date A12911BarPieFep ;
   private boolean n2186BarPieLoc ;
   private boolean n6489BarPieIdPz ;
   private boolean n8907PzaB80 ;
   private boolean n9795BarPieK1 ;
   private boolean n9796BarPieK2 ;
   private boolean n9800BarNPes ;
   private boolean n1691BarPieAnc ;
   private boolean n9846BarPieAncc ;
   private boolean n9984BarPiePda ;
   private boolean n8707BapieObs ;
   private boolean n8838CodBarPz ;
   private boolean n3275BarKgsAut ;
   private boolean n3276BarMtsAut ;
   private boolean n1919BarPieObs ;
   private boolean n1642BarPieOrd ;
   private boolean n12911BarPieFep ;
   private boolean n12113BarPieCLd ;
   private boolean n12920BarPieColD ;
   private boolean n12921BarPieColN ;
   private boolean n12926BarPieCoCI ;
   private boolean n12927BarPieCoCN ;
   private boolean n12923BarPieArtD ;
   private boolean n12922BarPieArtI ;
   private boolean n12924BarPieCliI ;
   private boolean n12925BarPieCliN ;
   private String[] aP24 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private int[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private byte[] aP8 ;
   private java.math.BigDecimal[] aP9 ;
   private java.math.BigDecimal[] aP10 ;
   private short[] aP11 ;
   private String[] aP12 ;
   private int[] aP13 ;
   private int[] aP14 ;
   private String[] aP15 ;
   private String[] aP16 ;
   private java.math.BigDecimal[] aP17 ;
   private java.math.BigDecimal[] aP18 ;
   private byte[] aP19 ;
   private short[] aP20 ;
   private short[] aP21 ;
   private java.math.BigDecimal[] aP22 ;
   private String[] aP23 ;
   private IDataStoreProvider pr_default ;
}

final  class preo006__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P04R22", "INSERT INTO TXPBARPIE(EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, AlbRecCod, BarPieKil, BarPieMet, BarPieEst, BarKilLan, BarMetLan, BarPConTro, PieOriCod, BarPieLzd, BarPiePie, BarPieAnc, BarPieLoc, BarKgsAut, BarMtsAut, BarPieIdPz, BapieObs, CodBarPz, PzaB80, BarPieK1, BarPieK2, BarNPes, BarPieAncc, BarPiePda, BarPieObs, BarPieOrd, BarPieCLd, BarPieFep, BarPieColD, BarPieColN, BarPieArtI, BarPieArtD, BarPieCliI, BarPieCliN, BarPieCoCI, BarPieCoCN, BarPieAut, BarPieImp, BarPz1, BarPz2, BarTara, BarUniB, BarPieFdv, BarPieUsu, BarPieUltD, BarPieEncC, BarPieTono, BarPieSecu, BarPieOpe, BarPieDest, BarPieEmp, BarPieLote, BarPieST, BarPieTurn, BarPieMq, BarPieVtx) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ' ', 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, ' ', ' ', ' ', 0, 0, 0, ' ', ' ', 0, ' ', ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
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
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 2);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 2);
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[9], 2);
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[10], 2);
               stmt.setShort(12, ((Number) parms[11]).shortValue());
               stmt.setString(13, (String)parms[12], 9);
               stmt.setInt(14, ((Number) parms[13]).intValue());
               stmt.setInt(15, ((Number) parms[14]).intValue());
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(16, ((Number) parms[16]).shortValue());
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[18], 10);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(18, (java.math.BigDecimal)parms[20], 2);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(19, (java.math.BigDecimal)parms[22], 2);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(20, (String)parms[24], 15);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[26], 40);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[28], 20);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[30], 9);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(24, (java.math.BigDecimal)parms[32], 2);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(25, (java.math.BigDecimal)parms[34], 2);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(26, ((Number) parms[36]).byteValue());
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(27, ((Number) parms[38]).shortValue());
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(28, (java.math.BigDecimal)parms[40], 2);
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(29, (String)parms[42], 60);
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(30, ((Number) parms[44]).intValue());
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(31, ((Number) parms[46]).byteValue());
               }
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.DATE );
               }
               else
               {
                  stmt.setDate(32, (java.util.Date)parms[48]);
               }
               if ( ((Boolean) parms[49]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(33, (String)parms[50], 13);
               }
               if ( ((Boolean) parms[51]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(34, ((Number) parms[52]).intValue());
               }
               if ( ((Boolean) parms[53]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(35, (String)parms[54], 16);
               }
               if ( ((Boolean) parms[55]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(36, (String)parms[56], 26);
               }
               if ( ((Boolean) parms[57]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(37, ((Number) parms[58]).intValue());
               }
               if ( ((Boolean) parms[59]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(38, (String)parms[60], 60);
               }
               if ( ((Boolean) parms[61]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(39, (String)parms[62], 13);
               }
               if ( ((Boolean) parms[63]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(40, ((Number) parms[64]).intValue());
               }
               return;
      }
   }

}

