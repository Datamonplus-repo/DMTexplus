package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdelalb extends GXProcedure
{
   public pdelalb( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdelalb.class ), "" );
   }

   public pdelalb( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public long executeUdp( String[] aP0 )
   {
      pdelalb.this.aP1 = new long[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 )
   {
      pdelalb.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdelalb.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15FlagIniTrz = (byte)(0) ;
      GXv_int1[0] = AV15FlagIniTrz ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "INITRZ", ""), GXv_int1) ;
      pdelalb.this.AV15FlagIniTrz = GXv_int1[0] ;
      GXt_int2 = AV25SiRemito ;
      GXv_int1[0] = GXt_int2 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "SIREMI", ""), GXv_int1) ;
      pdelalb.this.GXt_int2 = GXv_int1[0] ;
      AV25SiRemito = GXt_int2 ;
      GXt_int2 = AV30Velluts ;
      GXv_int1[0] = GXt_int2 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "VELLUT", ""), GXv_int1) ;
      pdelalb.this.GXt_int2 = GXv_int1[0] ;
      AV30Velluts = GXt_int2 ;
      GXt_int2 = AV31VertexRmto ;
      GXv_int1[0] = GXt_int2 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "VTXRTO", ""), GXv_int1) ;
      pdelalb.this.GXt_int2 = GXv_int1[0] ;
      AV31VertexRmto = GXt_int2 ;
      AV27Station = context.getWorkstationId( remoteHandle) ;
      GXv_char3[0] = A396EmprCod ;
      GXv_char4[0] = AV28EmprNom ;
      GXv_char5[0] = AV29Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV27Station, GXv_char3, GXv_char4, GXv_char5) ;
      pdelalb.this.A396EmprCod = GXv_char3[0] ;
      pdelalb.this.AV28EmprNom = GXv_char4[0] ;
      pdelalb.this.AV29Usurcod = GXv_char5[0] ;
      /* Using cursor P008F2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A39AlbProPri = P008F2_A39AlbProPri[0] ;
         A5140AlbMarca = P008F2_A5140AlbMarca[0] ;
         A914AlbPObsCon = P008F2_A914AlbPObsCon[0] ;
         A12183DltUltob = P008F2_A12183DltUltob[0] ;
         W396EmprCod = A396EmprCod ;
         W30AlbProCod = A30AlbProCod ;
         /* Using cursor P008F3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), A396EmprCod, Long.valueOf(A30AlbProCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A1261BarAlbKgmE = P008F3_A1261BarAlbKgmE[0] ;
            A1263BarAlbMtrE = P008F3_A1263BarAlbMtrE[0] ;
            A1265BarAlbPie = P008F3_A1265BarAlbPie[0] ;
            A1458BarAlbBul = P008F3_A1458BarAlbBul[0] ;
            A1266BarAlbTub = P008F3_A1266BarAlbTub[0] ;
            A5019AlbHdrgm2 = P008F3_A5019AlbHdrgm2[0] ;
            A3271AlbHdrAnc = P008F3_A3271AlbHdrAnc[0] ;
            A2396BarAlbObs = P008F3_A2396BarAlbObs[0] ;
            A2763AlbHdrUlin = P008F3_A2763AlbHdrUlin[0] ;
            A1248GuiFasULin = P008F3_A1248GuiFasULin[0] ;
            A1262BarPreKgm = P008F3_A1262BarPreKgm[0] ;
            A1264BarPreMtr = P008F3_A1264BarPreMtr[0] ;
            A130BarCodPar = P008F3_A130BarCodPar[0] ;
            A132BarCodReo = P008F3_A132BarCodReo[0] ;
            A129BarCod = P008F3_A129BarCod[0] ;
            /* Using cursor P008F4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            A212BarSer = P008F4_A212BarSer[0] ;
            A1652BarSerDsc = P008F4_A1652BarSerDsc[0] ;
            A135BarColNom = P008F4_A135BarColNom[0] ;
            A136BarColNum = P008F4_A136BarColNum[0] ;
            A218BarTipCol = P008F4_A218BarTipCol[0] ;
            A1234BarNomCli = P008F4_A1234BarNomCli[0] ;
            A1235BarNumCli = P008F4_A1235BarNumCli[0] ;
            A4812BarEncCli = P008F4_A4812BarEncCli[0] ;
            A213BarSit = P008F4_A213BarSit[0] ;
            A3786BarEnvBar = P008F4_A3786BarEnvBar[0] ;
            A161BarFecSal = P008F4_A161BarFecSal[0] ;
            W396EmprCod = A396EmprCod ;
            W30AlbProCod = A30AlbProCod ;
            AV18BarCod = A129BarCod ;
            AV19BarCodReo = A132BarCodReo ;
            AV20BarCodPar = A130BarCodPar ;
            /* Using cursor P008F5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A200BarPieCod = P008F5_A200BarPieCod[0] ;
               A27AlbPKilEnt = P008F5_A27AlbPKilEnt[0] ;
               A1270AlbPMtrEnt = P008F5_A1270AlbPMtrEnt[0] ;
               /* Using cursor P008F6 */
               pr_default.execute(4, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
               /* Using cursor P008F7 */
               pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
               A170BarKilLan = P008F7_A170BarKilLan[0] ;
               A183BarMetLan = P008F7_A183BarMetLan[0] ;
               A201BarPieEst = P008F7_A201BarPieEst[0] ;
               A1271BarPieLzd = P008F7_A1271BarPieLzd[0] ;
               A197BarPConTro = P008F7_A197BarPConTro[0] ;
               W396EmprCod = A396EmprCod ;
               W30AlbProCod = A30AlbProCod ;
               A170BarKilLan = A170BarKilLan.subtract(A27AlbPKilEnt) ;
               A183BarMetLan = A183BarMetLan.subtract(A1270AlbPMtrEnt) ;
               A201BarPieEst = (byte)(0) ;
               A1271BarPieLzd = (int)(A1271BarPieLzd-1) ;
               if ( A1271BarPieLzd < 0 )
               {
                  A1271BarPieLzd = 0 ;
               }
               if ( A170BarKilLan.doubleValue() < 0 )
               {
                  A170BarKilLan = DecimalUtil.ZERO ;
               }
               if ( A183BarMetLan.doubleValue() < 0 )
               {
                  A183BarMetLan = DecimalUtil.ZERO ;
               }
               AV21BarPieCod = A200BarPieCod ;
               AV23ExisTro = (byte)(0) ;
               /* Using cursor P008F8 */
               pr_default.execute(6, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
               while ( (pr_default.getStatus(6) != 101) )
               {
                  A42AlbPTroCod = P008F8_A42AlbPTroCod[0] ;
                  A5303AlbPTroKil = P008F8_A5303AlbPTroKil[0] ;
                  A43AlbPTroMet = P008F8_A43AlbPTroMet[0] ;
                  W396EmprCod = A396EmprCod ;
                  W30AlbProCod = A30AlbProCod ;
                  AV22BarTroCod = A42AlbPTroCod ;
                  /* Execute user subroutine: 'BARTRO' */
                  S111 ();
                  if ( returnInSub )
                  {
                     pr_default.close(6);
                     pr_default.close(5);
                     pr_default.close(4);
                     pr_default.close(3);
                     pr_default.close(2);
                     pr_default.close(1);
                     returnInSub = true;
                     cleanup();
                     if (true) return;
                  }
                  if ( AV25SiRemito == 1 )
                  {
                     /*
                        INSERT RECORD ON TABLE TXPDLT003

                     */
                     W396EmprCod = A396EmprCod ;
                     W30AlbProCod = A30AlbProCod ;
                     A12176DltHdr = A129BarCod ;
                     A12177DltR = A132BarCodReo ;
                     A12178DltP = A130BarCodPar ;
                     A12180DltNPieza = A200BarPieCod ;
                     A12181DltNTrozo = A42AlbPTroCod ;
                     A12169DltKgsTrz = A5303AlbPTroKil ;
                     n12169DltKgsTrz = false ;
                     A12170DltMtsTrz = A43AlbPTroMet ;
                     n12170DltMtsTrz = false ;
                     /* Using cursor P008F9 */
                     pr_default.execute(7, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A12176DltHdr), Byte.valueOf(A12177DltR), A12178DltP, A12180DltNPieza, Short.valueOf(A12181DltNTrozo), Boolean.valueOf(n12169DltKgsTrz), A12169DltKgsTrz, Boolean.valueOf(n12170DltMtsTrz), A12170DltMtsTrz});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDLT003");
                     if ( (pr_default.getStatus(7) == 1) )
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
                     A30AlbProCod = W30AlbProCod ;
                     /* End Insert */
                  }
                  /* Using cursor P008F10 */
                  pr_default.execute(8, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A42AlbPTroCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLALTRZ");
                  A396EmprCod = W396EmprCod ;
                  A30AlbProCod = W30AlbProCod ;
                  pr_default.readNext(6);
               }
               pr_default.close(6);
               if ( ( AV15FlagIniTrz == 1 ) && ( AV23ExisTro == 0 ) )
               {
                  A197BarPConTro = (short)(0) ;
               }
               /* Using cursor P008F11 */
               pr_default.execute(9, new Object[] {A170BarKilLan, A183BarMetLan, Byte.valueOf(A201BarPieEst), Integer.valueOf(A1271BarPieLzd), Short.valueOf(A197BarPConTro), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
               A396EmprCod = W396EmprCod ;
               A30AlbProCod = W30AlbProCod ;
               pr_default.readNext(3);
            }
            pr_default.close(3);
            pr_default.close(5);
            pr_default.close(4);
            if ( A213BarSit == 9 )
            {
               if ( AV30Velluts == 1 )
               {
                  AV26Inc_obs = httpContext.getMessage( "Delete ALBARAN = ", "") + GXutil.str( A30AlbProCod, 10, 0) + GXutil.newLine( ) ;
                  AV26Inc_obs += httpContext.getMessage( "Cambio Situacion para poder ser vista en listados y ser enviada a INFOTINT", "") + GXutil.newLine( ) ;
                  AV26Inc_obs += httpContext.getMessage( "Situacion      ", "") + GXutil.str( A213BarSit, 2, 0) + " <- " + "5" + GXutil.newLine( ) ;
                  AV26Inc_obs += httpContext.getMessage( "Envio Infotint ", "") + A3786BarEnvBar + " <- " + " " ;
                  new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV38Pgmname, AV29Usurcod, AV27Station, AV26Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
                  A213BarSit = (byte)(5) ;
               }
               else
               {
                  A213BarSit = (byte)(6) ;
               }
            }
            /* Using cursor P008F12 */
            pr_default.execute(10, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(10) != 101) )
            {
               A200BarPieCod = P008F12_A200BarPieCod[0] ;
               A27AlbPKilEnt = P008F12_A27AlbPKilEnt[0] ;
               A1270AlbPMtrEnt = P008F12_A1270AlbPMtrEnt[0] ;
               A3117AlbPreAnc = P008F12_A3117AlbPreAnc[0] ;
               n3117AlbPreAnc = P008F12_n3117AlbPreAnc[0] ;
               W396EmprCod = A396EmprCod ;
               W30AlbProCod = A30AlbProCod ;
               if ( AV25SiRemito == 1 )
               {
                  /*
                     INSERT RECORD ON TABLE TXPDLT002

                  */
                  W396EmprCod = A396EmprCod ;
                  W30AlbProCod = A30AlbProCod ;
                  A12176DltHdr = A129BarCod ;
                  A12177DltR = A132BarCodReo ;
                  A12178DltP = A130BarCodPar ;
                  A12180DltNPieza = A200BarPieCod ;
                  A12166DltKgsPz = A27AlbPKilEnt ;
                  n12166DltKgsPz = false ;
                  A12167DltMtsPz = A1270AlbPMtrEnt ;
                  n12167DltMtsPz = false ;
                  A12168DltAncPz = A3117AlbPreAnc ;
                  n12168DltAncPz = false ;
                  /* Using cursor P008F13 */
                  pr_default.execute(11, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A12176DltHdr), Byte.valueOf(A12177DltR), A12178DltP, A12180DltNPieza, Boolean.valueOf(n12166DltKgsPz), A12166DltKgsPz, Boolean.valueOf(n12167DltMtsPz), A12167DltMtsPz, Boolean.valueOf(n12168DltAncPz), Short.valueOf(A12168DltAncPz)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDLT002");
                  if ( (pr_default.getStatus(11) == 1) )
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
                  A30AlbProCod = W30AlbProCod ;
                  /* End Insert */
               }
               /* Using cursor P008F14 */
               pr_default.execute(12, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLALPRD");
               if ( AV31VertexRmto == 1 )
               {
                  GXv_char5[0] = A396EmprCod ;
                  GXv_int6[0] = A129BarCod ;
                  GXv_int1[0] = A132BarCodReo ;
                  GXv_char4[0] = A130BarCodPar ;
                  GXv_char3[0] = A200BarPieCod ;
                  GXv_char7[0] = "" ;
                  GXv_char8[0] = httpContext.getMessage( "PZV", "") ;
                  new app.pvxgrain(remoteHandle, context).execute( GXv_char5, GXv_int6, GXv_int1, GXv_char4, GXv_char3, GXv_char7, GXv_char8) ;
                  pdelalb.this.A396EmprCod = GXv_char5[0] ;
                  pdelalb.this.A129BarCod = GXv_int6[0] ;
                  pdelalb.this.A132BarCodReo = GXv_int1[0] ;
                  pdelalb.this.A130BarCodPar = GXv_char4[0] ;
                  pdelalb.this.A200BarPieCod = GXv_char3[0] ;
               }
               A396EmprCod = W396EmprCod ;
               A30AlbProCod = W30AlbProCod ;
               pr_default.readNext(10);
            }
            pr_default.close(10);
            if ( AV25SiRemito == 1 )
            {
               /*
                  INSERT RECORD ON TABLE TXPDLT001

               */
               W396EmprCod = A396EmprCod ;
               W30AlbProCod = A30AlbProCod ;
               A12176DltHdr = A129BarCod ;
               A12177DltR = A132BarCodReo ;
               A12178DltP = A130BarCodPar ;
               A12145DltKgs = A1261BarAlbKgmE ;
               n12145DltKgs = false ;
               A12146DltMts = A1263BarAlbMtrE ;
               n12146DltMts = false ;
               A12147DltPzs = A1265BarAlbPie ;
               n12147DltPzs = false ;
               A12148DltBultos = A1458BarAlbBul ;
               n12148DltBultos = false ;
               A12149DltTubos = A1266BarAlbTub ;
               n12149DltTubos = false ;
               A12150DltArtCod = A212BarSer ;
               n12150DltArtCod = false ;
               A12151DltArtDsc = A1652BarSerDsc ;
               n12151DltArtDsc = false ;
               A12152DltColNom = A135BarColNom ;
               n12152DltColNom = false ;
               A12153DltColNum = A136BarColNum ;
               n12153DltColNum = false ;
               A12154DltTc = A218BarTipCol ;
               n12154DltTc = false ;
               A12155DltColClNm = A1234BarNomCli ;
               n12155DltColClNm = false ;
               A12156DltColClNr = A1235BarNumCli ;
               n12156DltColClNr = false ;
               A12157DltGrm2 = A5019AlbHdrgm2 ;
               n12157DltGrm2 = false ;
               A12158DltAnc = A3271AlbHdrAnc ;
               n12158DltAnc = false ;
               A12159DltAlbObs = A2396BarAlbObs ;
               n12159DltAlbObs = false ;
               A12160DltUltTxt = A2763AlbHdrUlin ;
               n12160DltUltTxt = false ;
               A12161DltUltFs = A1248GuiFasULin ;
               n12161DltUltFs = false ;
               A12163DltPreKg = A1262BarPreKgm ;
               n12163DltPreKg = false ;
               A12164DltPreMt = A1264BarPreMtr ;
               n12164DltPreMt = false ;
               A12162DltEncCli = A4812BarEncCli ;
               n12162DltEncCli = false ;
               /* Using cursor P008F15 */
               pr_default.execute(13, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A12176DltHdr), Byte.valueOf(A12177DltR), A12178DltP, Boolean.valueOf(n12145DltKgs), A12145DltKgs, Boolean.valueOf(n12146DltMts), A12146DltMts, Boolean.valueOf(n12147DltPzs), Integer.valueOf(A12147DltPzs), Boolean.valueOf(n12148DltBultos), Short.valueOf(A12148DltBultos), Boolean.valueOf(n12149DltTubos), Integer.valueOf(A12149DltTubos), Boolean.valueOf(n12150DltArtCod), A12150DltArtCod, Boolean.valueOf(n12151DltArtDsc), A12151DltArtDsc, Boolean.valueOf(n12152DltColNom), A12152DltColNom, Boolean.valueOf(n12153DltColNum), Integer.valueOf(A12153DltColNum), Boolean.valueOf(n12154DltTc), Byte.valueOf(A12154DltTc), Boolean.valueOf(n12155DltColClNm), A12155DltColClNm, Boolean.valueOf(n12156DltColClNr), Integer.valueOf(A12156DltColClNr), Boolean.valueOf(n12157DltGrm2), Short.valueOf(A12157DltGrm2), Boolean.valueOf(n12158DltAnc), Short.valueOf(A12158DltAnc), Boolean.valueOf(n12159DltAlbObs), A12159DltAlbObs, Boolean.valueOf(n12160DltUltTxt), Short.valueOf(A12160DltUltTxt), Boolean.valueOf(n12161DltUltFs), Short.valueOf(A12161DltUltFs), Boolean.valueOf(n12162DltEncCli), A12162DltEncCli, Boolean.valueOf(n12163DltPreKg), A12163DltPreKg, Boolean.valueOf(n12164DltPreMt), A12164DltPreMt});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDLT001");
               if ( (pr_default.getStatus(13) == 1) )
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
               A30AlbProCod = W30AlbProCod ;
               /* End Insert */
            }
            /* Using cursor P008F16 */
            pr_default.execute(14, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
            GXv_char8[0] = A396EmprCod ;
            GXv_int6[0] = AV18BarCod ;
            GXv_int1[0] = AV19BarCodReo ;
            GXv_char7[0] = AV20BarCodPar ;
            GXv_date9[0] = AV16FecSal ;
            GXv_int10[0] = AV17ExisteHdr ;
            new app.pfchalb(remoteHandle, context).execute( GXv_char8, GXv_int6, GXv_int1, GXv_char7, GXv_date9, GXv_int10) ;
            pdelalb.this.A396EmprCod = GXv_char8[0] ;
            pdelalb.this.AV18BarCod = GXv_int6[0] ;
            pdelalb.this.AV19BarCodReo = GXv_int1[0] ;
            pdelalb.this.AV20BarCodPar = GXv_char7[0] ;
            pdelalb.this.AV16FecSal = GXv_date9[0] ;
            pdelalb.this.AV17ExisteHdr = GXv_int10[0] ;
            if ( AV17ExisteHdr == 0 )
            {
               A161BarFecSal = GXutil.nullDate() ;
            }
            else
            {
               A161BarFecSal = AV16FecSal ;
            }
            /* Using cursor P008F17 */
            pr_default.execute(15, new Object[] {Byte.valueOf(A213BarSit), A161BarFecSal, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
            A396EmprCod = W396EmprCod ;
            A30AlbProCod = W30AlbProCod ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         pr_default.close(2);
         /* Using cursor P008F18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         while ( (pr_default.getStatus(16) != 101) )
         {
            A129BarCod = P008F18_A129BarCod[0] ;
            A132BarCodReo = P008F18_A132BarCodReo[0] ;
            A130BarCodPar = P008F18_A130BarCodPar[0] ;
            A1240GuiFasLin = P008F18_A1240GuiFasLin[0] ;
            A1275FasKgm = P008F18_A1275FasKgm[0] ;
            A1276FasMtr = P008F18_A1276FasMtr[0] ;
            A1241GuiFasPKg = P008F18_A1241GuiFasPKg[0] ;
            W396EmprCod = A396EmprCod ;
            W30AlbProCod = A30AlbProCod ;
            if ( AV25SiRemito == 1 )
            {
               /*
                  INSERT RECORD ON TABLE TXPDLT004

               */
               W396EmprCod = A396EmprCod ;
               W30AlbProCod = A30AlbProCod ;
               A12176DltHdr = A129BarCod ;
               A12177DltR = A132BarCodReo ;
               A12178DltP = A130BarCodPar ;
               A12182DltLin = A1240GuiFasLin ;
               A12174DltKgsFs = A1275FasKgm ;
               n12174DltKgsFs = false ;
               A12175DltMtsFs = A1276FasMtr ;
               n12175DltMtsFs = false ;
               /* Using cursor P008F19 */
               pr_default.execute(17, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A12176DltHdr), Byte.valueOf(A12177DltR), A12178DltP, Short.valueOf(A12182DltLin), Boolean.valueOf(n12174DltKgsFs), A12174DltKgsFs, Boolean.valueOf(n12175DltMtsFs), A12175DltMtsFs});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDLT004");
               if ( (pr_default.getStatus(17) == 1) )
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
               A30AlbProCod = W30AlbProCod ;
               /* End Insert */
            }
            /* Using cursor P008F20 */
            pr_default.execute(18, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A1240GuiFasLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBFAS");
            A396EmprCod = W396EmprCod ;
            A30AlbProCod = W30AlbProCod ;
            pr_default.readNext(16);
         }
         pr_default.close(16);
         /* Optimized DELETE. */
         /* Using cursor P008F21 */
         pr_default.execute(19, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBPRD");
         /* End optimized DELETE. */
         /* Using cursor P008F22 */
         pr_default.execute(20, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         while ( (pr_default.getStatus(20) != 101) )
         {
            A915AlbPObsLin = P008F22_A915AlbPObsLin[0] ;
            A916AlbPObs = P008F22_A916AlbPObs[0] ;
            W396EmprCod = A396EmprCod ;
            W30AlbProCod = A30AlbProCod ;
            if ( AV25SiRemito == 1 )
            {
               /*
                  INSERT RECORD ON TABLE TXPDLT005

               */
               W396EmprCod = A396EmprCod ;
               W30AlbProCod = A30AlbProCod ;
               A12185DltLinObs = A915AlbPObsLin ;
               A12184DltObs = A916AlbPObs ;
               n12184DltObs = false ;
               /* Using cursor P008F23 */
               pr_default.execute(21, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Byte.valueOf(A12185DltLinObs), Boolean.valueOf(n12184DltObs), A12184DltObs});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDLT005");
               if ( (pr_default.getStatus(21) == 1) )
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
               A30AlbProCod = W30AlbProCod ;
               /* End Insert */
            }
            /* Using cursor P008F24 */
            pr_default.execute(22, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Byte.valueOf(A915AlbPObsLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOBSALB");
            A396EmprCod = W396EmprCod ;
            A30AlbProCod = W30AlbProCod ;
            pr_default.readNext(20);
         }
         pr_default.close(20);
         if ( AV25SiRemito == 1 )
         {
            A5140AlbMarca = httpContext.getMessage( "A", "") ;
            A12183DltUltob = A914AlbPObsCon ;
            AV26Inc_obs = httpContext.getMessage( "PDELALB-ALBARAN ELIMINADO", "") + GXutil.newLine( ) + httpContext.getMessage( "Albaran=", "") + GXutil.str( A30AlbProCod, 10, 0) + GXutil.newLine( ) ;
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV38Pgmname, AV29Usurcod, AV27Station, AV26Inc_obs, (int)(A30AlbProCod), (byte)(0), "") ;
         }
         else
         {
            AV26Inc_obs = httpContext.getMessage( "PDELALB-ALBARAN ELIMINADO", "") + GXutil.newLine( ) + httpContext.getMessage( "Albaran=", "") + GXutil.str( A30AlbProCod, 10, 0) + GXutil.newLine( ) ;
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV38Pgmname, AV29Usurcod, AV27Station, AV26Inc_obs, (int)(A30AlbProCod), (byte)(0), "") ;
            /* Using cursor P008F25 */
            pr_default.execute(23, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
         }
         /* Using cursor P008F26 */
         pr_default.execute(24, new Object[] {A5140AlbMarca, Byte.valueOf(A12183DltUltob), A396EmprCod, Long.valueOf(A30AlbProCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
         A396EmprCod = W396EmprCod ;
         A30AlbProCod = W30AlbProCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'BARTRO' Routine */
      returnInSub = false ;
      /* Using cursor P008F27 */
      pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(AV18BarCod), Byte.valueOf(AV19BarCodReo), AV20BarCodPar, AV21BarPieCod, Short.valueOf(AV22BarTroCod)});
      while ( (pr_default.getStatus(25) != 101) )
      {
         A3858BarTroCod = P008F27_A3858BarTroCod[0] ;
         A200BarPieCod = P008F27_A200BarPieCod[0] ;
         A130BarCodPar = P008F27_A130BarCodPar[0] ;
         A132BarCodReo = P008F27_A132BarCodReo[0] ;
         A129BarCod = P008F27_A129BarCod[0] ;
         A3864BarTroEst = P008F27_A3864BarTroEst[0] ;
         n3864BarTroEst = P008F27_n3864BarTroEst[0] ;
         A3864BarTroEst = (byte)(0) ;
         n3864BarTroEst = false ;
         AV23ExisTro = (byte)(1) ;
         /* Using cursor P008F28 */
         pr_default.execute(26, new Object[] {Boolean.valueOf(n3864BarTroEst), Byte.valueOf(A3864BarTroEst), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A3858BarTroCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARTRO");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(25);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdelalb.this.A396EmprCod;
      this.aP1[0] = pdelalb.this.A30AlbProCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pdelalb");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV27Station = "" ;
      AV28EmprNom = "" ;
      AV29Usurcod = "" ;
      scmdbuf = "" ;
      P008F2_A396EmprCod = new String[] {""} ;
      P008F2_A30AlbProCod = new long[1] ;
      P008F2_A39AlbProPri = new String[] {""} ;
      P008F2_A5140AlbMarca = new String[] {""} ;
      P008F2_A914AlbPObsCon = new byte[1] ;
      P008F2_A12183DltUltob = new byte[1] ;
      A39AlbProPri = "" ;
      A5140AlbMarca = "" ;
      W396EmprCod = "" ;
      P008F3_A396EmprCod = new String[] {""} ;
      P008F3_A30AlbProCod = new long[1] ;
      P008F3_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008F3_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008F3_A1265BarAlbPie = new int[1] ;
      P008F3_A1458BarAlbBul = new short[1] ;
      P008F3_A1266BarAlbTub = new int[1] ;
      P008F3_A5019AlbHdrgm2 = new short[1] ;
      P008F3_A3271AlbHdrAnc = new short[1] ;
      P008F3_A2396BarAlbObs = new String[] {""} ;
      P008F3_A2763AlbHdrUlin = new short[1] ;
      P008F3_A1248GuiFasULin = new short[1] ;
      P008F3_A1262BarPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008F3_A1264BarPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008F3_A130BarCodPar = new String[] {""} ;
      P008F3_A132BarCodReo = new byte[1] ;
      P008F3_A129BarCod = new int[1] ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      A2396BarAlbObs = "" ;
      A1262BarPreKgm = DecimalUtil.ZERO ;
      A1264BarPreMtr = DecimalUtil.ZERO ;
      A130BarCodPar = "" ;
      P008F4_A212BarSer = new String[] {""} ;
      P008F4_A1652BarSerDsc = new String[] {""} ;
      P008F4_A135BarColNom = new String[] {""} ;
      P008F4_A136BarColNum = new int[1] ;
      P008F4_A218BarTipCol = new byte[1] ;
      P008F4_A1234BarNomCli = new String[] {""} ;
      P008F4_A1235BarNumCli = new int[1] ;
      P008F4_A4812BarEncCli = new String[] {""} ;
      P008F4_A213BarSit = new byte[1] ;
      P008F4_A3786BarEnvBar = new String[] {""} ;
      P008F4_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A4812BarEncCli = "" ;
      A3786BarEnvBar = "" ;
      A161BarFecSal = GXutil.nullDate() ;
      AV20BarCodPar = "" ;
      P008F5_A396EmprCod = new String[] {""} ;
      P008F5_A30AlbProCod = new long[1] ;
      P008F5_A129BarCod = new int[1] ;
      P008F5_A132BarCodReo = new byte[1] ;
      P008F5_A130BarCodPar = new String[] {""} ;
      P008F5_A200BarPieCod = new String[] {""} ;
      P008F5_A27AlbPKilEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008F5_A1270AlbPMtrEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A200BarPieCod = "" ;
      A27AlbPKilEnt = DecimalUtil.ZERO ;
      A1270AlbPMtrEnt = DecimalUtil.ZERO ;
      P008F6_A396EmprCod = new String[] {""} ;
      P008F7_A170BarKilLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008F7_A183BarMetLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008F7_A201BarPieEst = new byte[1] ;
      P008F7_A1271BarPieLzd = new int[1] ;
      P008F7_A197BarPConTro = new short[1] ;
      A170BarKilLan = DecimalUtil.ZERO ;
      A183BarMetLan = DecimalUtil.ZERO ;
      AV21BarPieCod = "" ;
      P008F8_A396EmprCod = new String[] {""} ;
      P008F8_A30AlbProCod = new long[1] ;
      P008F8_A129BarCod = new int[1] ;
      P008F8_A132BarCodReo = new byte[1] ;
      P008F8_A130BarCodPar = new String[] {""} ;
      P008F8_A200BarPieCod = new String[] {""} ;
      P008F8_A42AlbPTroCod = new short[1] ;
      P008F8_A5303AlbPTroKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008F8_A43AlbPTroMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A5303AlbPTroKil = DecimalUtil.ZERO ;
      A43AlbPTroMet = DecimalUtil.ZERO ;
      A12178DltP = "" ;
      A12180DltNPieza = "" ;
      A12169DltKgsTrz = DecimalUtil.ZERO ;
      A12170DltMtsTrz = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      AV26Inc_obs = "" ;
      AV38Pgmname = "" ;
      P008F12_A396EmprCod = new String[] {""} ;
      P008F12_A30AlbProCod = new long[1] ;
      P008F12_A129BarCod = new int[1] ;
      P008F12_A132BarCodReo = new byte[1] ;
      P008F12_A130BarCodPar = new String[] {""} ;
      P008F12_A200BarPieCod = new String[] {""} ;
      P008F12_A27AlbPKilEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008F12_A1270AlbPMtrEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008F12_A3117AlbPreAnc = new short[1] ;
      P008F12_n3117AlbPreAnc = new boolean[] {false} ;
      A12166DltKgsPz = DecimalUtil.ZERO ;
      A12167DltMtsPz = DecimalUtil.ZERO ;
      GXv_char5 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      A12145DltKgs = DecimalUtil.ZERO ;
      A12146DltMts = DecimalUtil.ZERO ;
      A12150DltArtCod = "" ;
      A12151DltArtDsc = "" ;
      A12152DltColNom = "" ;
      A12155DltColClNm = "" ;
      A12159DltAlbObs = "" ;
      A12163DltPreKg = DecimalUtil.ZERO ;
      A12164DltPreMt = DecimalUtil.ZERO ;
      A12162DltEncCli = "" ;
      GXv_char8 = new String[1] ;
      GXv_int6 = new int[1] ;
      GXv_int1 = new byte[1] ;
      GXv_char7 = new String[1] ;
      AV16FecSal = GXutil.nullDate() ;
      GXv_date9 = new java.util.Date[1] ;
      GXv_int10 = new byte[1] ;
      P008F18_A396EmprCod = new String[] {""} ;
      P008F18_A30AlbProCod = new long[1] ;
      P008F18_A129BarCod = new int[1] ;
      P008F18_A132BarCodReo = new byte[1] ;
      P008F18_A130BarCodPar = new String[] {""} ;
      P008F18_A1240GuiFasLin = new short[1] ;
      P008F18_A1275FasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008F18_A1276FasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008F18_A1241GuiFasPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A1275FasKgm = DecimalUtil.ZERO ;
      A1276FasMtr = DecimalUtil.ZERO ;
      A1241GuiFasPKg = DecimalUtil.ZERO ;
      A12174DltKgsFs = DecimalUtil.ZERO ;
      A12175DltMtsFs = DecimalUtil.ZERO ;
      P008F22_A396EmprCod = new String[] {""} ;
      P008F22_A30AlbProCod = new long[1] ;
      P008F22_A915AlbPObsLin = new byte[1] ;
      P008F22_A916AlbPObs = new String[] {""} ;
      A916AlbPObs = "" ;
      A12184DltObs = "" ;
      P008F27_A396EmprCod = new String[] {""} ;
      P008F27_A3858BarTroCod = new short[1] ;
      P008F27_A200BarPieCod = new String[] {""} ;
      P008F27_A130BarCodPar = new String[] {""} ;
      P008F27_A132BarCodReo = new byte[1] ;
      P008F27_A129BarCod = new int[1] ;
      P008F27_A3864BarTroEst = new byte[1] ;
      P008F27_n3864BarTroEst = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdelalb__default(),
         new Object[] {
             new Object[] {
            P008F2_A396EmprCod, P008F2_A30AlbProCod, P008F2_A39AlbProPri, P008F2_A5140AlbMarca, P008F2_A914AlbPObsCon, P008F2_A12183DltUltob
            }
            , new Object[] {
            P008F3_A396EmprCod, P008F3_A30AlbProCod, P008F3_A1261BarAlbKgmE, P008F3_A1263BarAlbMtrE, P008F3_A1265BarAlbPie, P008F3_A1458BarAlbBul, P008F3_A1266BarAlbTub, P008F3_A5019AlbHdrgm2, P008F3_A3271AlbHdrAnc, P008F3_A2396BarAlbObs,
            P008F3_A2763AlbHdrUlin, P008F3_A1248GuiFasULin, P008F3_A1262BarPreKgm, P008F3_A1264BarPreMtr, P008F3_A130BarCodPar, P008F3_A132BarCodReo, P008F3_A129BarCod
            }
            , new Object[] {
            P008F4_A212BarSer, P008F4_A1652BarSerDsc, P008F4_A135BarColNom, P008F4_A136BarColNum, P008F4_A218BarTipCol, P008F4_A1234BarNomCli, P008F4_A1235BarNumCli, P008F4_A4812BarEncCli, P008F4_A213BarSit, P008F4_A3786BarEnvBar,
            P008F4_A161BarFecSal
            }
            , new Object[] {
            P008F5_A396EmprCod, P008F5_A30AlbProCod, P008F5_A129BarCod, P008F5_A132BarCodReo, P008F5_A130BarCodPar, P008F5_A200BarPieCod, P008F5_A27AlbPKilEnt, P008F5_A1270AlbPMtrEnt
            }
            , new Object[] {
            P008F6_A396EmprCod
            }
            , new Object[] {
            P008F7_A170BarKilLan, P008F7_A183BarMetLan, P008F7_A201BarPieEst, P008F7_A1271BarPieLzd, P008F7_A197BarPConTro
            }
            , new Object[] {
            P008F8_A396EmprCod, P008F8_A30AlbProCod, P008F8_A129BarCod, P008F8_A132BarCodReo, P008F8_A130BarCodPar, P008F8_A200BarPieCod, P008F8_A42AlbPTroCod, P008F8_A5303AlbPTroKil, P008F8_A43AlbPTroMet
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P008F12_A396EmprCod, P008F12_A30AlbProCod, P008F12_A129BarCod, P008F12_A132BarCodReo, P008F12_A130BarCodPar, P008F12_A200BarPieCod, P008F12_A27AlbPKilEnt, P008F12_A1270AlbPMtrEnt, P008F12_A3117AlbPreAnc, P008F12_n3117AlbPreAnc
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P008F18_A396EmprCod, P008F18_A30AlbProCod, P008F18_A129BarCod, P008F18_A132BarCodReo, P008F18_A130BarCodPar, P008F18_A1240GuiFasLin, P008F18_A1275FasKgm, P008F18_A1276FasMtr, P008F18_A1241GuiFasPKg
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P008F22_A396EmprCod, P008F22_A30AlbProCod, P008F22_A915AlbPObsLin, P008F22_A916AlbPObs
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P008F27_A396EmprCod, P008F27_A3858BarTroCod, P008F27_A200BarPieCod, P008F27_A130BarCodPar, P008F27_A132BarCodReo, P008F27_A129BarCod, P008F27_A3864BarTroEst, P008F27_n3864BarTroEst
            }
            , new Object[] {
            }
         }
      );
      AV38Pgmname = "PDELALB" ;
      /* GeneXus formulas. */
      AV38Pgmname = "PDELALB" ;
      Gx_err = (short)(0) ;
   }

   private byte AV15FlagIniTrz ;
   private byte AV25SiRemito ;
   private byte AV30Velluts ;
   private byte AV31VertexRmto ;
   private byte GXt_int2 ;
   private byte A914AlbPObsCon ;
   private byte A12183DltUltob ;
   private byte A132BarCodReo ;
   private byte A218BarTipCol ;
   private byte A213BarSit ;
   private byte AV19BarCodReo ;
   private byte A201BarPieEst ;
   private byte AV23ExisTro ;
   private byte A12177DltR ;
   private byte A12154DltTc ;
   private byte GXv_int1[] ;
   private byte AV17ExisteHdr ;
   private byte GXv_int10[] ;
   private byte A915AlbPObsLin ;
   private byte A12185DltLinObs ;
   private byte A3864BarTroEst ;
   private short A1458BarAlbBul ;
   private short A5019AlbHdrgm2 ;
   private short A3271AlbHdrAnc ;
   private short A2763AlbHdrUlin ;
   private short A1248GuiFasULin ;
   private short A197BarPConTro ;
   private short A42AlbPTroCod ;
   private short AV22BarTroCod ;
   private short A12181DltNTrozo ;
   private short Gx_err ;
   private short A3117AlbPreAnc ;
   private short A12168DltAncPz ;
   private short A12148DltBultos ;
   private short A12157DltGrm2 ;
   private short A12158DltAnc ;
   private short A12160DltUltTxt ;
   private short A12161DltUltFs ;
   private short A1240GuiFasLin ;
   private short A12182DltLin ;
   private short A3858BarTroCod ;
   private int A1265BarAlbPie ;
   private int A1266BarAlbTub ;
   private int A129BarCod ;
   private int A136BarColNum ;
   private int A1235BarNumCli ;
   private int AV18BarCod ;
   private int A1271BarPieLzd ;
   private int GX_INS1691 ;
   private int A12176DltHdr ;
   private int GX_INS1690 ;
   private int GX_INS1688 ;
   private int A12147DltPzs ;
   private int A12149DltTubos ;
   private int A12153DltColNum ;
   private int A12156DltColClNr ;
   private int GXv_int6[] ;
   private int GX_INS1692 ;
   private int GX_INS1693 ;
   private long A30AlbProCod ;
   private long W30AlbProCod ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal A1262BarPreKgm ;
   private java.math.BigDecimal A1264BarPreMtr ;
   private java.math.BigDecimal A27AlbPKilEnt ;
   private java.math.BigDecimal A1270AlbPMtrEnt ;
   private java.math.BigDecimal A170BarKilLan ;
   private java.math.BigDecimal A183BarMetLan ;
   private java.math.BigDecimal A5303AlbPTroKil ;
   private java.math.BigDecimal A43AlbPTroMet ;
   private java.math.BigDecimal A12169DltKgsTrz ;
   private java.math.BigDecimal A12170DltMtsTrz ;
   private java.math.BigDecimal A12166DltKgsPz ;
   private java.math.BigDecimal A12167DltMtsPz ;
   private java.math.BigDecimal A12145DltKgs ;
   private java.math.BigDecimal A12146DltMts ;
   private java.math.BigDecimal A12163DltPreKg ;
   private java.math.BigDecimal A12164DltPreMt ;
   private java.math.BigDecimal A1275FasKgm ;
   private java.math.BigDecimal A1276FasMtr ;
   private java.math.BigDecimal A1241GuiFasPKg ;
   private java.math.BigDecimal A12174DltKgsFs ;
   private java.math.BigDecimal A12175DltMtsFs ;
   private String A396EmprCod ;
   private String AV27Station ;
   private String AV28EmprNom ;
   private String AV29Usurcod ;
   private String scmdbuf ;
   private String A39AlbProPri ;
   private String A5140AlbMarca ;
   private String W396EmprCod ;
   private String A2396BarAlbObs ;
   private String A130BarCodPar ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A4812BarEncCli ;
   private String A3786BarEnvBar ;
   private String AV20BarCodPar ;
   private String A200BarPieCod ;
   private String AV21BarPieCod ;
   private String A12178DltP ;
   private String A12180DltNPieza ;
   private String Gx_emsg ;
   private String AV38Pgmname ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String A12150DltArtCod ;
   private String A12151DltArtDsc ;
   private String A12152DltColNom ;
   private String A12155DltColClNm ;
   private String A12159DltAlbObs ;
   private String A12162DltEncCli ;
   private String GXv_char8[] ;
   private String GXv_char7[] ;
   private String A916AlbPObs ;
   private String A12184DltObs ;
   private java.util.Date A161BarFecSal ;
   private java.util.Date AV16FecSal ;
   private java.util.Date GXv_date9[] ;
   private boolean returnInSub ;
   private boolean n12169DltKgsTrz ;
   private boolean n12170DltMtsTrz ;
   private boolean n3117AlbPreAnc ;
   private boolean n12166DltKgsPz ;
   private boolean n12167DltMtsPz ;
   private boolean n12168DltAncPz ;
   private boolean n12145DltKgs ;
   private boolean n12146DltMts ;
   private boolean n12147DltPzs ;
   private boolean n12148DltBultos ;
   private boolean n12149DltTubos ;
   private boolean n12150DltArtCod ;
   private boolean n12151DltArtDsc ;
   private boolean n12152DltColNom ;
   private boolean n12153DltColNum ;
   private boolean n12154DltTc ;
   private boolean n12155DltColClNm ;
   private boolean n12156DltColClNr ;
   private boolean n12157DltGrm2 ;
   private boolean n12158DltAnc ;
   private boolean n12159DltAlbObs ;
   private boolean n12160DltUltTxt ;
   private boolean n12161DltUltFs ;
   private boolean n12163DltPreKg ;
   private boolean n12164DltPreMt ;
   private boolean n12162DltEncCli ;
   private boolean n12174DltKgsFs ;
   private boolean n12175DltMtsFs ;
   private boolean n12184DltObs ;
   private boolean n3864BarTroEst ;
   private String AV26Inc_obs ;
   private long[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P008F2_A396EmprCod ;
   private long[] P008F2_A30AlbProCod ;
   private String[] P008F2_A39AlbProPri ;
   private String[] P008F2_A5140AlbMarca ;
   private byte[] P008F2_A914AlbPObsCon ;
   private byte[] P008F2_A12183DltUltob ;
   private String[] P008F3_A396EmprCod ;
   private long[] P008F3_A30AlbProCod ;
   private java.math.BigDecimal[] P008F3_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] P008F3_A1263BarAlbMtrE ;
   private int[] P008F3_A1265BarAlbPie ;
   private short[] P008F3_A1458BarAlbBul ;
   private int[] P008F3_A1266BarAlbTub ;
   private short[] P008F3_A5019AlbHdrgm2 ;
   private short[] P008F3_A3271AlbHdrAnc ;
   private String[] P008F3_A2396BarAlbObs ;
   private short[] P008F3_A2763AlbHdrUlin ;
   private short[] P008F3_A1248GuiFasULin ;
   private java.math.BigDecimal[] P008F3_A1262BarPreKgm ;
   private java.math.BigDecimal[] P008F3_A1264BarPreMtr ;
   private String[] P008F3_A130BarCodPar ;
   private byte[] P008F3_A132BarCodReo ;
   private int[] P008F3_A129BarCod ;
   private String[] P008F4_A212BarSer ;
   private String[] P008F4_A1652BarSerDsc ;
   private String[] P008F4_A135BarColNom ;
   private int[] P008F4_A136BarColNum ;
   private byte[] P008F4_A218BarTipCol ;
   private String[] P008F4_A1234BarNomCli ;
   private int[] P008F4_A1235BarNumCli ;
   private String[] P008F4_A4812BarEncCli ;
   private byte[] P008F4_A213BarSit ;
   private String[] P008F4_A3786BarEnvBar ;
   private java.util.Date[] P008F4_A161BarFecSal ;
   private String[] P008F5_A396EmprCod ;
   private long[] P008F5_A30AlbProCod ;
   private int[] P008F5_A129BarCod ;
   private byte[] P008F5_A132BarCodReo ;
   private String[] P008F5_A130BarCodPar ;
   private String[] P008F5_A200BarPieCod ;
   private java.math.BigDecimal[] P008F5_A27AlbPKilEnt ;
   private java.math.BigDecimal[] P008F5_A1270AlbPMtrEnt ;
   private String[] P008F6_A396EmprCod ;
   private java.math.BigDecimal[] P008F7_A170BarKilLan ;
   private java.math.BigDecimal[] P008F7_A183BarMetLan ;
   private byte[] P008F7_A201BarPieEst ;
   private int[] P008F7_A1271BarPieLzd ;
   private short[] P008F7_A197BarPConTro ;
   private String[] P008F8_A396EmprCod ;
   private long[] P008F8_A30AlbProCod ;
   private int[] P008F8_A129BarCod ;
   private byte[] P008F8_A132BarCodReo ;
   private String[] P008F8_A130BarCodPar ;
   private String[] P008F8_A200BarPieCod ;
   private short[] P008F8_A42AlbPTroCod ;
   private java.math.BigDecimal[] P008F8_A5303AlbPTroKil ;
   private java.math.BigDecimal[] P008F8_A43AlbPTroMet ;
   private String[] P008F12_A396EmprCod ;
   private long[] P008F12_A30AlbProCod ;
   private int[] P008F12_A129BarCod ;
   private byte[] P008F12_A132BarCodReo ;
   private String[] P008F12_A130BarCodPar ;
   private String[] P008F12_A200BarPieCod ;
   private java.math.BigDecimal[] P008F12_A27AlbPKilEnt ;
   private java.math.BigDecimal[] P008F12_A1270AlbPMtrEnt ;
   private short[] P008F12_A3117AlbPreAnc ;
   private boolean[] P008F12_n3117AlbPreAnc ;
   private String[] P008F18_A396EmprCod ;
   private long[] P008F18_A30AlbProCod ;
   private int[] P008F18_A129BarCod ;
   private byte[] P008F18_A132BarCodReo ;
   private String[] P008F18_A130BarCodPar ;
   private short[] P008F18_A1240GuiFasLin ;
   private java.math.BigDecimal[] P008F18_A1275FasKgm ;
   private java.math.BigDecimal[] P008F18_A1276FasMtr ;
   private java.math.BigDecimal[] P008F18_A1241GuiFasPKg ;
   private String[] P008F22_A396EmprCod ;
   private long[] P008F22_A30AlbProCod ;
   private byte[] P008F22_A915AlbPObsLin ;
   private String[] P008F22_A916AlbPObs ;
   private String[] P008F27_A396EmprCod ;
   private short[] P008F27_A3858BarTroCod ;
   private String[] P008F27_A200BarPieCod ;
   private String[] P008F27_A130BarCodPar ;
   private byte[] P008F27_A132BarCodReo ;
   private int[] P008F27_A129BarCod ;
   private byte[] P008F27_A3864BarTroEst ;
   private boolean[] P008F27_n3864BarTroEst ;
}

final  class pdelalb__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P008F2", "SELECT EmprCod, AlbProCod, AlbProPri, AlbMarca, AlbPObsCon, DltUltob FROM TXPCALPRD WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P008F3", "SELECT EmprCod, AlbProCod, BarAlbKgmE, BarAlbMtrE, BarAlbPie, BarAlbBul, BarAlbTub, AlbHdrgm2, AlbHdrAnc, BarAlbObs, AlbHdrUlin, GuiFasULin, BarPreKgm, BarPreMtr, BarCodPar, BarCodReo, BarCod FROM TXPALBBAR WHERE (EmprCod = ? AND AlbProCod = ?) AND (EmprCod = ? and AlbProCod = ?) ORDER BY EmprCod, AlbProCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P008F4", "SELECT BarSer, BarSerDsc, BarColNom, BarColNum, BarTipCol, BarNomCli, BarNumCli, BarEncCli, BarSit, BarEnvBar, BarFecSal FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P008F5", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod, AlbPKilEnt, AlbPMtrEnt FROM TXPLALPRD WHERE (EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) AND (EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P008F6", "SELECT EmprCod FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P008F7", "SELECT BarKilLan, BarMetLan, BarPieEst, BarPieLzd, BarPConTro FROM TXPBARPIE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P008F8", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod, AlbPTroCod, AlbPTroKil, AlbPTroMet FROM TXPLALTRZ WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P008F9", "INSERT INTO TXPDLT003(EmprCod, AlbProCod, DltHdr, DltR, DltP, DltNPieza, DltNTrozo, DltKgsTrz, DltMtsTrz, DltAncTrz) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDLT003")
         ,new UpdateCursor("P008F10", "DELETE FROM TXPLALTRZ  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? AND AlbPTroCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLALTRZ")
         ,new UpdateCursor("P008F11", "UPDATE TXPBARPIE SET BarKilLan=?, BarMetLan=?, BarPieEst=?, BarPieLzd=?, BarPConTro=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
         ,new ForEachCursor("P008F12", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod, AlbPKilEnt, AlbPMtrEnt, AlbPreAnc FROM TXPLALPRD WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P008F13", "INSERT INTO TXPDLT002(EmprCod, AlbProCod, DltHdr, DltR, DltP, DltNPieza, DltKgsPz, DltMtsPz, DltAncPz) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDLT002")
         ,new UpdateCursor("P008F14", "DELETE FROM TXPLALPRD  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLALPRD")
         ,new UpdateCursor("P008F15", "INSERT INTO TXPDLT001(EmprCod, AlbProCod, DltHdr, DltR, DltP, DltKgs, DltMts, DltPzs, DltBultos, DltTubos, DltArtCod, DltArtDsc, DltColNom, DltColNum, DltTc, DltColClNm, DltColClNr, DltGrm2, DltAnc, DltAlbObs, DltUltTxt, DltUltFs, DltEncCli, DltPreKg, DltPreMt, DltKgsCli, DltTubo, DltTuboN, DltModCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, ' ', ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDLT001")
         ,new UpdateCursor("P008F16", "DELETE FROM TXPALBBAR  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBBAR")
         ,new UpdateCursor("P008F17", "UPDATE TXPBARCAD SET BarSit=?, BarFecSal=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P008F18", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, GuiFasLin, FasKgm, FasMtr, GuiFasPKg FROM TXPALBFAS WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P008F19", "INSERT INTO TXPDLT004(EmprCod, AlbProCod, DltHdr, DltR, DltP, DltLin, DltKgsFs, DltMtsFs, DltFascod, DltFasDsc, DltPrKFs, DltPrMFs, DltPrKBFs, DltPrMBFs) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ' ', ' ', 0, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDLT004")
         ,new UpdateCursor("P008F20", "DELETE FROM TXPALBFAS  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND GuiFasLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBFAS")
         ,new UpdateCursor("P008F21", "DELETE FROM TXPALBPRD  WHERE EmprCod = ? and AlbProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBPRD")
         ,new ForEachCursor("P008F22", "SELECT EmprCod, AlbProCod, AlbPObsLin, AlbPObs FROM TXPOBSALB WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P008F23", "INSERT INTO TXPDLT005(EmprCod, AlbProCod, DltLinObs, DltObs) VALUES(?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDLT005")
         ,new UpdateCursor("P008F24", "DELETE FROM TXPOBSALB  WHERE EmprCod = ? AND AlbProCod = ? AND AlbPObsLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPOBSALB")
         ,new UpdateCursor("P008F25", "DELETE FROM TXPCALPRD  WHERE EmprCod = ? AND AlbProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALPRD")
         ,new UpdateCursor("P008F26", "UPDATE TXPCALPRD SET AlbMarca=?, DltUltob=?  WHERE EmprCod = ? AND AlbProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALPRD")
         ,new ForEachCursor("P008F27", "SELECT EmprCod, BarTroCod, BarPieCod, BarCodPar, BarCodReo, BarCod, BarTroEst FROM TXPBARTRO WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ? and BarTroCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarTroCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P008F28", "UPDATE TXPBARTRO SET BarTroEst=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? AND BarTroCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARTRO")
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 30);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,5);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,5);
               ((String[]) buf[14])[0] = rslt.getString(15, 1);
               ((byte[]) buf[15])[0] = rslt.getByte(16);
               ((int[]) buf[16])[0] = rslt.getInt(17);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 20);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(11);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 5 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,5);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 50);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 3);
               stmt.setLong(7, ((Number) parms[6]).longValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setString(10, (String)parms[9], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[8], 2);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[10], 2);
               }
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 9 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 3);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setString(9, (String)parms[8], 1);
               stmt.setString(10, (String)parms[9], 9);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[7], 2);
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
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[6], 2);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[8], 2);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[10]).intValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[12]).shortValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[14]).intValue());
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[16], 16);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[18], 26);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[20], 13);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(14, ((Number) parms[22]).intValue());
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(15, ((Number) parms[24]).byteValue());
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[26], 13);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(17, ((Number) parms[28]).intValue());
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(18, ((Number) parms[30]).shortValue());
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(19, ((Number) parms[32]).shortValue());
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(20, (String)parms[34], 30);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(21, ((Number) parms[36]).shortValue());
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(22, ((Number) parms[38]).shortValue());
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[40], 20);
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(24, (java.math.BigDecimal)parms[42], 5);
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(25, (java.math.BigDecimal)parms[44], 5);
               }
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 15 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[7], 2);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[9], 2);
               }
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[4], 50);
               }
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 26 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 1);
               stmt.setString(6, (String)parms[6], 9);
               stmt.setShort(7, ((Number) parms[7]).shortValue());
               return;
      }
   }

}

