package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pnuepie extends GXProcedure
{
   public pnuepie( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pnuepie.class ), "" );
   }

   public pnuepie( int remoteHandle ,
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
      pnuepie.this.aP24 = new String[] {""};
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
      pnuepie.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pnuepie.this.AV16BarCod = aP1[0];
      this.aP1 = aP1;
      pnuepie.this.AV17BarCodReo = aP2[0];
      this.aP2 = aP2;
      pnuepie.this.AV18BarCodPar = aP3[0];
      this.aP3 = aP3;
      pnuepie.this.AV19BarPieCod = aP4[0];
      this.aP4 = aP4;
      pnuepie.this.AV20AlbRecCod = aP5[0];
      this.aP5 = aP5;
      pnuepie.this.AV21BarPieKil = aP6[0];
      this.aP6 = aP6;
      pnuepie.this.AV22BarPieMet = aP7[0];
      this.aP7 = aP7;
      pnuepie.this.AV23BarPieEst = aP8[0];
      this.aP8 = aP8;
      pnuepie.this.AV24BarKilLan = aP9[0];
      this.aP9 = aP9;
      pnuepie.this.AV25BarMetLan = aP10[0];
      this.aP10 = aP10;
      pnuepie.this.AV26BarPConTro = aP11[0];
      this.aP11 = aP11;
      pnuepie.this.AV27PieOriCod = aP12[0];
      this.aP12 = aP12;
      pnuepie.this.AV28BarPieLzd = aP13[0];
      this.aP13 = aP13;
      pnuepie.this.AV29BarPiePie = aP14[0];
      this.aP14 = aP14;
      pnuepie.this.AV33BarPieLoc = aP15[0];
      this.aP15 = aP15;
      pnuepie.this.AV43PzaB80 = aP16[0];
      this.aP16 = aP16;
      pnuepie.this.AV44BarPiek1 = aP17[0];
      this.aP17 = aP17;
      pnuepie.this.AV45barPieK2 = aP18[0];
      this.aP18 = aP18;
      pnuepie.this.AV46BarNpes = aP19[0];
      this.aP19 = aP19;
      pnuepie.this.AV47BarPieanc = aP20[0];
      this.aP20 = aP20;
      pnuepie.this.AV48BarPieAncc = aP21[0];
      this.aP21 = aP21;
      pnuepie.this.AV49BarPiePda = aP22[0];
      this.aP22 = aP22;
      pnuepie.this.AV50Bapieobs = aP23[0];
      this.aP23 = aP23;
      pnuepie.this.AV51Codbarpz = aP24[0];
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
      pnuepie.this.AV30FlagHil = GXv_int1[0] ;
      AV31FlagBros = (byte)(0) ;
      GXv_int1[0] = AV31FlagBros ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "BROS", ""), GXv_int1) ;
      pnuepie.this.AV31FlagBros = GXv_int1[0] ;
      GXt_char2 = AV40ContDsc ;
      GXv_char3[0] = AV15EmprCod ;
      GXv_char4[0] = httpContext.getMessage( "CLISKP", "") ;
      GXv_char5[0] = GXt_char2 ;
      new app.pbusdsc(remoteHandle, context).execute( GXv_char3, GXv_char4, GXv_char5) ;
      pnuepie.this.AV15EmprCod = GXv_char3[0] ;
      pnuepie.this.GXt_char2 = GXv_char5[0] ;
      AV40ContDsc = GXt_char2 ;
      AV38CliPropio = (int)(GXutil.lval( GXutil.trim( AV40ContDsc))) ;
      GXt_int6 = AV41Vincolor ;
      GXv_int1[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "VINCOL", ""), GXv_int1) ;
      pnuepie.this.GXt_int6 = GXv_int1[0] ;
      AV41Vincolor = GXt_int6 ;
      GXt_int6 = AV52Torient ;
      GXv_int1[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "TORIEN", ""), GXv_int1) ;
      pnuepie.this.GXt_int6 = GXv_int1[0] ;
      AV52Torient = GXt_int6 ;
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
      /* Using cursor P009J2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Integer.valueOf(A44AlbRecCod), A203BarPieKil, A205BarPieMet, Byte.valueOf(A201BarPieEst), A170BarKilLan, A183BarMetLan, Short.valueOf(A197BarPConTro), A908PieOriCod, Integer.valueOf(A1271BarPieLzd), Integer.valueOf(A1501BarPiePie), Boolean.valueOf(n1691BarPieAnc), Short.valueOf(A1691BarPieAnc), Boolean.valueOf(n2186BarPieLoc), A2186BarPieLoc, Boolean.valueOf(n3275BarKgsAut), A3275BarKgsAut, Boolean.valueOf(n3276BarMtsAut), A3276BarMtsAut, Boolean.valueOf(n6489BarPieIdPz), A6489BarPieIdPz, Boolean.valueOf(n8707BapieObs), A8707BapieObs, Boolean.valueOf(n8838CodBarPz), A8838CodBarPz, Boolean.valueOf(n8907PzaB80), A8907PzaB80, Boolean.valueOf(n9795BarPieK1), A9795BarPieK1, Boolean.valueOf(n9796BarPieK2), A9796BarPieK2, Boolean.valueOf(n9800BarNPes), Byte.valueOf(A9800BarNPes), Boolean.valueOf(n9846BarPieAncc), Short.valueOf(A9846BarPieAncc), Boolean.valueOf(n9984BarPiePda), A9984BarPiePda});
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
      if ( AV30FlagHil == 1 )
      {
         /* Using cursor P009J3 */
         pr_default.execute(1, new Object[] {AV15EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A130BarCodPar = P009J3_A130BarCodPar[0] ;
            A132BarCodReo = P009J3_A132BarCodReo[0] ;
            A129BarCod = P009J3_A129BarCod[0] ;
            A396EmprCod = P009J3_A396EmprCod[0] ;
            A212BarSer = P009J3_A212BarSer[0] ;
            A361DisCod = P009J3_A361DisCod[0] ;
            A966PartCod = P009J3_A966PartCod[0] ;
            n966PartCod = P009J3_n966PartCod[0] ;
            A252CliCod = P009J3_A252CliCod[0] ;
            n252CliCod = P009J3_n252CliCod[0] ;
            A5253BarAcc = P009J3_A5253BarAcc[0] ;
            A966PartCod = P009J3_A966PartCod[0] ;
            n966PartCod = P009J3_n966PartCod[0] ;
            AV34DisCod = A361DisCod ;
            AV37PartCod = A966PartCod ;
            AV35CliCod = A252CliCod ;
            AV36BarAcc = A5253BarAcc ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         if ( ! (0==AV38CliPropio) && ( GXutil.strcmp(AV36BarAcc, httpContext.getMessage( "P", "")) == 0 ) )
         {
            AV39CliPdo = AV38CliPropio ;
         }
         else
         {
            AV39CliPdo = AV35CliCod ;
         }
         /* Using cursor P009J4 */
         pr_default.execute(2, new Object[] {AV15EmprCod, AV37PartCod, Integer.valueOf(AV39CliPdo), Integer.valueOf(AV34DisCod)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A981PartAlbDis = P009J4_A981PartAlbDis[0] ;
            n981PartAlbDis = P009J4_n981PartAlbDis[0] ;
            A980PartLinTip = P009J4_A980PartLinTip[0] ;
            n980PartLinTip = P009J4_n980PartLinTip[0] ;
            A252CliCod = P009J4_A252CliCod[0] ;
            n252CliCod = P009J4_n252CliCod[0] ;
            A966PartCod = P009J4_A966PartCod[0] ;
            n966PartCod = P009J4_n966PartCod[0] ;
            A396EmprCod = P009J4_A396EmprCod[0] ;
            A986KilUti = P009J4_A986KilUti[0] ;
            n986KilUti = P009J4_n986KilUti[0] ;
            A987ConUti = P009J4_A987ConUti[0] ;
            n987ConUti = P009J4_n987ConUti[0] ;
            A979PartLin = P009J4_A979PartLin[0] ;
            if ( GXutil.strcmp(A980PartLinTip, httpContext.getMessage( "B", "")) == 0 )
            {
               A986KilUti = AV21BarPieKil ;
               n986KilUti = false ;
               A987ConUti = (short)(AV29BarPiePie) ;
               n987ConUti = false ;
               AV32FlagPar = (byte)(1) ;
               /* Using cursor P009J5 */
               pr_default.execute(3, new Object[] {Boolean.valueOf(n986KilUti), A986KilUti, Boolean.valueOf(n987ConUti), Short.valueOf(A987ConUti), A396EmprCod, Boolean.valueOf(n966PartCod), A966PartCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Integer.valueOf(A979PartLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPARTI");
            }
            pr_default.readNext(2);
         }
         pr_default.close(2);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pnuepie.this.AV15EmprCod;
      this.aP1[0] = pnuepie.this.AV16BarCod;
      this.aP2[0] = pnuepie.this.AV17BarCodReo;
      this.aP3[0] = pnuepie.this.AV18BarCodPar;
      this.aP4[0] = pnuepie.this.AV19BarPieCod;
      this.aP5[0] = pnuepie.this.AV20AlbRecCod;
      this.aP6[0] = pnuepie.this.AV21BarPieKil;
      this.aP7[0] = pnuepie.this.AV22BarPieMet;
      this.aP8[0] = pnuepie.this.AV23BarPieEst;
      this.aP9[0] = pnuepie.this.AV24BarKilLan;
      this.aP10[0] = pnuepie.this.AV25BarMetLan;
      this.aP11[0] = pnuepie.this.AV26BarPConTro;
      this.aP12[0] = pnuepie.this.AV27PieOriCod;
      this.aP13[0] = pnuepie.this.AV28BarPieLzd;
      this.aP14[0] = pnuepie.this.AV29BarPiePie;
      this.aP15[0] = pnuepie.this.AV33BarPieLoc;
      this.aP16[0] = pnuepie.this.AV43PzaB80;
      this.aP17[0] = pnuepie.this.AV44BarPiek1;
      this.aP18[0] = pnuepie.this.AV45barPieK2;
      this.aP19[0] = pnuepie.this.AV46BarNpes;
      this.aP20[0] = pnuepie.this.AV47BarPieanc;
      this.aP21[0] = pnuepie.this.AV48BarPieAncc;
      this.aP22[0] = pnuepie.this.AV49BarPiePda;
      this.aP23[0] = pnuepie.this.AV50Bapieobs;
      this.aP24[0] = pnuepie.this.AV51Codbarpz;
      Application.commitDataStores(context, remoteHandle, pr_default, "pnuepie");
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
      Gx_emsg = "" ;
      scmdbuf = "" ;
      P009J3_A130BarCodPar = new String[] {""} ;
      P009J3_A132BarCodReo = new byte[1] ;
      P009J3_A129BarCod = new int[1] ;
      P009J3_A396EmprCod = new String[] {""} ;
      P009J3_A212BarSer = new String[] {""} ;
      P009J3_A361DisCod = new int[1] ;
      P009J3_A966PartCod = new String[] {""} ;
      P009J3_n966PartCod = new boolean[] {false} ;
      P009J3_A252CliCod = new int[1] ;
      P009J3_n252CliCod = new boolean[] {false} ;
      P009J3_A5253BarAcc = new String[] {""} ;
      A212BarSer = "" ;
      A966PartCod = "" ;
      A5253BarAcc = "" ;
      AV37PartCod = "" ;
      AV36BarAcc = "" ;
      P009J4_A981PartAlbDis = new int[1] ;
      P009J4_n981PartAlbDis = new boolean[] {false} ;
      P009J4_A980PartLinTip = new String[] {""} ;
      P009J4_n980PartLinTip = new boolean[] {false} ;
      P009J4_A252CliCod = new int[1] ;
      P009J4_n252CliCod = new boolean[] {false} ;
      P009J4_A966PartCod = new String[] {""} ;
      P009J4_n966PartCod = new boolean[] {false} ;
      P009J4_A396EmprCod = new String[] {""} ;
      P009J4_A986KilUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P009J4_n986KilUti = new boolean[] {false} ;
      P009J4_A987ConUti = new short[1] ;
      P009J4_n987ConUti = new boolean[] {false} ;
      P009J4_A979PartLin = new int[1] ;
      A980PartLinTip = "" ;
      A986KilUti = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pnuepie__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            P009J3_A130BarCodPar, P009J3_A132BarCodReo, P009J3_A129BarCod, P009J3_A396EmprCod, P009J3_A212BarSer, P009J3_A361DisCod, P009J3_A966PartCod, P009J3_n966PartCod, P009J3_A252CliCod, P009J3_n252CliCod,
            P009J3_A5253BarAcc
            }
            , new Object[] {
            P009J4_A981PartAlbDis, P009J4_n981PartAlbDis, P009J4_A980PartLinTip, P009J4_n980PartLinTip, P009J4_A252CliCod, P009J4_A966PartCod, P009J4_A396EmprCod, P009J4_A986KilUti, P009J4_n986KilUti, P009J4_A987ConUti,
            P009J4_n987ConUti, P009J4_A979PartLin
            }
            , new Object[] {
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
   private byte GXt_int6 ;
   private byte GXv_int1[] ;
   private byte A132BarCodReo ;
   private byte A201BarPieEst ;
   private byte A9800BarNPes ;
   private byte AV32FlagPar ;
   private short AV26BarPConTro ;
   private short AV47BarPieanc ;
   private short AV48BarPieAncc ;
   private short A197BarPConTro ;
   private short A1691BarPieAnc ;
   private short A9846BarPieAncc ;
   private short Gx_err ;
   private short A987ConUti ;
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
   private int A361DisCod ;
   private int A252CliCod ;
   private int AV34DisCod ;
   private int AV35CliCod ;
   private int AV39CliPdo ;
   private int A981PartAlbDis ;
   private int A979PartLin ;
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
   private java.math.BigDecimal A986KilUti ;
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
   private String Gx_emsg ;
   private String scmdbuf ;
   private String A212BarSer ;
   private String A966PartCod ;
   private String A5253BarAcc ;
   private String AV37PartCod ;
   private String AV36BarAcc ;
   private String A980PartLinTip ;
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
   private boolean n966PartCod ;
   private boolean n252CliCod ;
   private boolean n981PartAlbDis ;
   private boolean n980PartLinTip ;
   private boolean n986KilUti ;
   private boolean n987ConUti ;
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
   private String[] P009J3_A130BarCodPar ;
   private byte[] P009J3_A132BarCodReo ;
   private int[] P009J3_A129BarCod ;
   private String[] P009J3_A396EmprCod ;
   private String[] P009J3_A212BarSer ;
   private int[] P009J3_A361DisCod ;
   private String[] P009J3_A966PartCod ;
   private boolean[] P009J3_n966PartCod ;
   private int[] P009J3_A252CliCod ;
   private boolean[] P009J3_n252CliCod ;
   private String[] P009J3_A5253BarAcc ;
   private int[] P009J4_A981PartAlbDis ;
   private boolean[] P009J4_n981PartAlbDis ;
   private String[] P009J4_A980PartLinTip ;
   private boolean[] P009J4_n980PartLinTip ;
   private int[] P009J4_A252CliCod ;
   private boolean[] P009J4_n252CliCod ;
   private String[] P009J4_A966PartCod ;
   private boolean[] P009J4_n966PartCod ;
   private String[] P009J4_A396EmprCod ;
   private java.math.BigDecimal[] P009J4_A986KilUti ;
   private boolean[] P009J4_n986KilUti ;
   private short[] P009J4_A987ConUti ;
   private boolean[] P009J4_n987ConUti ;
   private int[] P009J4_A979PartLin ;
}

final  class pnuepie__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P009J2", "INSERT INTO TXPBARPIE(EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, AlbRecCod, BarPieKil, BarPieMet, BarPieEst, BarKilLan, BarMetLan, BarPConTro, PieOriCod, BarPieLzd, BarPiePie, BarPieAnc, BarPieLoc, BarKgsAut, BarMtsAut, BarPieIdPz, BapieObs, CodBarPz, PzaB80, BarPieK1, BarPieK2, BarNPes, BarPieAncc, BarPiePda, BarPieAut, BarPieImp, BarPz1, BarPz2, BarPieObs, BarTara, BarUniB, BarPieOrd, BarPieCLd, BarPieFdv, BarPieUsu, BarPieFep, BarPieUltD, BarPieColD, BarPieColN, BarPieArtI, BarPieArtD, BarPieCliI, BarPieCliN, BarPieCoCI, BarPieCoCN, BarPieEncC, BarPieTono, BarPieSecu, BarPieOpe, BarPieDest, BarPieEmp, BarPieLote, BarPieST, BarPieTurn, BarPieMq, BarPieVtx) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ' ', 0, 0, ' ', 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', 0, ' ', ' ', 0, ' ', ' ', 0, ' ', ' ', ' ', 0, 0, 0, ' ', ' ', 0, ' ', ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
         ,new ForEachCursor("P009J3", "SELECT T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T1.BarSer, T1.DisCod, T2.PartCod, T1.CliCod, T1.BarAcc FROM (TXPBARCAD T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P009J4", "SELECT PartAlbDis, PartLinTip, CliCod, PartCod, EmprCod, KilUti, ConUti, PartLin FROM TXPLPARTI WHERE (EmprCod = ? and PartCod = ? and CliCod = ?) AND (PartAlbDis = ?) ORDER BY EmprCod, PartCod, CliCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P009J5", "UPDATE TXPLPARTI SET KilUti=?, ConUti=?  WHERE EmprCod = ? AND PartCod = ? AND CliCod = ? AND PartLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPARTI")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 1);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(3);
               ((String[]) buf[5])[0] = rslt.getString(4, 16);
               ((String[]) buf[6])[0] = rslt.getString(5, 3);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(8);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[3]).shortValue());
               }
               stmt.setString(3, (String)parms[4], 3);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 16);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               stmt.setInt(6, ((Number) parms[9]).intValue());
               return;
      }
   }

}

