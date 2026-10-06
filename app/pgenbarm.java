package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pgenbarm extends GXProcedure
{
   public pgenbarm( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pgenbarm.class ), "" );
   }

   public pgenbarm( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String aP0 ,
                          int aP1 ,
                          String aP2 )
   {
      pgenbarm.this.aP3 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        int[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             int[] aP3 )
   {
      pgenbarm.this.AV15EmprCod = aP0;
      pgenbarm.this.AV16DisCod = aP1;
      pgenbarm.this.AV32MaqCod = aP2;
      pgenbarm.this.AV31BarCodPar = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Execute user subroutine: 'PRINCIPAL' */
      S111 ();
      if ( returnInSub )
      {
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'PRINCIPAL' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LECTURAS' */
      S121 ();
      if (returnInSub) return;
      /* Using cursor P000G3 */
      pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(AV16DisCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A9772DisItem2 = P000G3_A9772DisItem2[0] ;
         A9773DisItem3 = P000G3_A9773DisItem3[0] ;
         A9774DisItem4 = P000G3_A9774DisItem4[0] ;
         A9786DisItem5 = P000G3_A9786DisItem5[0] ;
         A9787DisItem6 = P000G3_A9787DisItem6[0] ;
         A10887Cod_Idtx = P000G3_A10887Cod_Idtx[0] ;
         n10887Cod_Idtx = P000G3_n10887Cod_Idtx[0] ;
         A8886DisDest = P000G3_A8886DisDest[0] ;
         A11659MarcaId = P000G3_A11659MarcaId[0] ;
         n11659MarcaId = P000G3_n11659MarcaId[0] ;
         A11661DisOrdComp = P000G3_A11661DisOrdComp[0] ;
         A7739DisExp = P000G3_A7739DisExp[0] ;
         A1002DisNumTen = P000G3_A1002DisNumTen[0] ;
         n1002DisNumTen = P000G3_n1002DisNumTen[0] ;
         A11734DisCnoEncO = P000G3_A11734DisCnoEncO[0] ;
         A11864Nxt_artcli = P000G3_A11864Nxt_artcli[0] ;
         A11859Nxt_modelo = P000G3_A11859Nxt_modelo[0] ;
         A11861Nxt_statio = P000G3_A11861Nxt_statio[0] ;
         A11860CpteId = P000G3_A11860CpteId[0] ;
         n11860CpteId = P000G3_n11860CpteId[0] ;
         A11863DptoID = P000G3_A11863DptoID[0] ;
         n11863DptoID = P000G3_n11863DptoID[0] ;
         A11862DesaID = P000G3_A11862DesaID[0] ;
         n11862DesaID = P000G3_n11862DesaID[0] ;
         A12328RevenID = P000G3_A12328RevenID[0] ;
         n12328RevenID = P000G3_n12328RevenID[0] ;
         A12768DisTpEstam = P000G3_A12768DisTpEstam[0] ;
         A12765DisPriorid = P000G3_A12765DisPriorid[0] ;
         A12772DisProdID = P000G3_A12772DisProdID[0] ;
         n12772DisProdID = P000G3_n12772DisProdID[0] ;
         A12880DisOEKOTEX = P000G3_A12880DisOEKOTEX[0] ;
         n12880DisOEKOTEX = P000G3_n12880DisOEKOTEX[0] ;
         A13068DisLineaID = P000G3_A13068DisLineaID[0] ;
         n13068DisLineaID = P000G3_n13068DisLineaID[0] ;
         A13069DisCanalID = P000G3_A13069DisCanalID[0] ;
         n13069DisCanalID = P000G3_n13069DisCanalID[0] ;
         A13076DisLinPrd = P000G3_A13076DisLinPrd[0] ;
         n13076DisLinPrd = P000G3_n13076DisLinPrd[0] ;
         A13987DisArtDsc2 = P000G3_A13987DisArtDsc2[0] ;
         A13233DisRGB = P000G3_A13233DisRGB[0] ;
         A1430DisLoc = P000G3_A1430DisLoc[0] ;
         A13986DisIdtx2 = P000G3_A13986DisIdtx2[0] ;
         n13986DisIdtx2 = P000G3_n13986DisIdtx2[0] ;
         A13080DisDGUltli = P000G3_A13080DisDGUltli[0] ;
         A361DisCod = P000G3_A361DisCod[0] ;
         A367DisEst = P000G3_A367DisEst[0] ;
         A387DisPiePie = P000G3_A387DisPiePie[0] ;
         n387DisPiePie = P000G3_n387DisPiePie[0] ;
         A390DisTipCol = P000G3_A390DisTipCol[0] ;
         n390DisTipCol = P000G3_n390DisTipCol[0] ;
         A363DisColNum = P000G3_A363DisColNum[0] ;
         n363DisColNum = P000G3_n363DisColNum[0] ;
         A362DisColNom = P000G3_A362DisColNom[0] ;
         n362DisColNom = P000G3_n362DisColNom[0] ;
         A335DisArtCod = P000G3_A335DisArtCod[0] ;
         A252CliCod = P000G3_A252CliCod[0] ;
         n252CliCod = P000G3_n252CliCod[0] ;
         A396EmprCod = P000G3_A396EmprCod[0] ;
         A365DisDes = P000G3_A365DisDes[0] ;
         A360DisCliNum = P000G3_A360DisCliNum[0] ;
         A337DisArtDsc = P000G3_A337DisArtDsc[0] ;
         A352DisArtTip = P000G3_A352DisArtTip[0] ;
         A369DisFec = P000G3_A369DisFec[0] ;
         A375DisNumUni = P000G3_A375DisNumUni[0] ;
         A392DisUniMed = P000G3_A392DisUniMed[0] ;
         A370DisFecCli = P000G3_A370DisFecCli[0] ;
         A374DisNumPie = P000G3_A374DisNumPie[0] ;
         A341DisArtOpe = P000G3_A341DisArtOpe[0] ;
         A359DisArtUrg = P000G3_A359DisArtUrg[0] ;
         A340DisArtMat = P000G3_A340DisArtMat[0] ;
         A350DisArtRdt = P000G3_A350DisArtRdt[0] ;
         A353DisArtTr1 = P000G3_A353DisArtTr1[0] ;
         A344DisArtPt1 = P000G3_A344DisArtPt1[0] ;
         A354DisArtTr2 = P000G3_A354DisArtTr2[0] ;
         A345DisArtPt2 = P000G3_A345DisArtPt2[0] ;
         A355DisArtTr3 = P000G3_A355DisArtTr3[0] ;
         A346DisArtPt3 = P000G3_A346DisArtPt3[0] ;
         A356DisArtUr1 = P000G3_A356DisArtUr1[0] ;
         A347DisArtPu1 = P000G3_A347DisArtPu1[0] ;
         A357DisArtUr2 = P000G3_A357DisArtUr2[0] ;
         A348DisArtPu2 = P000G3_A348DisArtPu2[0] ;
         A358DisArtUr3 = P000G3_A358DisArtUr3[0] ;
         A349DisArtPu3 = P000G3_A349DisArtPu3[0] ;
         n349DisArtPu3 = P000G3_n349DisArtPu3[0] ;
         A1232DisArtAcb = P000G3_A1232DisArtAcb[0] ;
         A1233DisArtAc2 = P000G3_A1233DisArtAc2[0] ;
         A334DisArtAnh = P000G3_A334DisArtAnh[0] ;
         A1231DisArtAn1 = P000G3_A1231DisArtAn1[0] ;
         A343DisArtPle = P000G3_A343DisArtPle[0] ;
         A339DisArtLar = P000G3_A339DisArtLar[0] ;
         A351DisArtSua = P000G3_A351DisArtSua[0] ;
         A333DisArtAca = P000G3_A333DisArtAca[0] ;
         A336DisArtCor = P000G3_A336DisArtCor[0] ;
         A338DisArtEnc = P000G3_A338DisArtEnc[0] ;
         A2831DisNumLot = P000G3_A2831DisNumLot[0] ;
         A2832DisKgsLot = P000G3_A2832DisKgsLot[0] ;
         A2833DisMtrLot = P000G3_A2833DisMtrLot[0] ;
         A4014DisTin = P000G3_A4014DisTin[0] ;
         A757PriCod = P000G3_A757PriCod[0] ;
         A371DisFecEnt = P000G3_A371DisFecEnt[0] ;
         A342DisArtPes = P000G3_A342DisArtPes[0] ;
         A1225DisGraCru = P000G3_A1225DisGraCru[0] ;
         A1195DisNomCli = P000G3_A1195DisNomCli[0] ;
         A1196DisNumCli = P000G3_A1196DisNumCli[0] ;
         A1197DisEncCom = P000G3_A1197DisEncCom[0] ;
         A1198DisEncAnh = P000G3_A1198DisEncAnh[0] ;
         A1502DisPart = P000G3_A1502DisPart[0] ;
         A2310DisCliDes = P000G3_A2310DisCliDes[0] ;
         A2009DisTipDis = P000G3_A2009DisTipDis[0] ;
         n2009DisTipDis = P000G3_n2009DisTipDis[0] ;
         A2835DisPle2 = P000G3_A2835DisPle2[0] ;
         A5025DisGraCob = P000G3_A5025DisGraCob[0] ;
         A5024DisTipEst = P000G3_A5024DisTipEst[0] ;
         A2926DisPla = P000G3_A2926DisPla[0] ;
         A3127DisNumCor = P000G3_A3127DisNumCor[0] ;
         A3128DisAncSal1 = P000G3_A3128DisAncSal1[0] ;
         A3129DisAncSal2 = P000G3_A3129DisAncSal2[0] ;
         A3130DisAncSal3 = P000G3_A3130DisAncSal3[0] ;
         A3131DisGraAca2 = P000G3_A3131DisGraAca2[0] ;
         A3132DisGraCru2 = P000G3_A3132DisGraCru2[0] ;
         A1906DisGraAca = P000G3_A1906DisGraAca[0] ;
         A1907DisRdoN = P000G3_A1907DisRdoN[0] ;
         A1908DisRdoA = P000G3_A1908DisRdoA[0] ;
         A1013DibCli = P000G3_A1013DibCli[0] ;
         n1013DibCli = P000G3_n1013DibCli[0] ;
         A1014DibInt = P000G3_A1014DibInt[0] ;
         n1014DibInt = P000G3_n1014DibInt[0] ;
         A4468DisPelAnh = P000G3_A4468DisPelAnh[0] ;
         A4469DisCruMts = P000G3_A4469DisCruMts[0] ;
         A4470DisCruKgs = P000G3_A4470DisCruKgs[0] ;
         A4471DisCruEnr = P000G3_A4471DisCruEnr[0] ;
         A4472DisLotPza = P000G3_A4472DisLotPza[0] ;
         n4472DisLotPza = P000G3_n4472DisLotPza[0] ;
         A4473DisLotMts = P000G3_A4473DisLotMts[0] ;
         A4474DisLotKgs = P000G3_A4474DisLotKgs[0] ;
         A4475DisLotMaq = P000G3_A4475DisLotMaq[0] ;
         n4475DisLotMaq = P000G3_n4475DisLotMaq[0] ;
         A4476DisAcaFor = P000G3_A4476DisAcaFor[0] ;
         n4476DisAcaFor = P000G3_n4476DisAcaFor[0] ;
         A4477DisAcaBak = P000G3_A4477DisAcaBak[0] ;
         A4478DisAcaAnh = P000G3_A4478DisAcaAnh[0] ;
         A4479DisAcaMar = P000G3_A4479DisAcaMar[0] ;
         A2402DisManCod = P000G3_A2402DisManCod[0] ;
         A3307DisManCod1 = P000G3_A3307DisManCod1[0] ;
         A3308DisManCod2 = P000G3_A3308DisManCod2[0] ;
         A4614DisMdlCod = P000G3_A4614DisMdlCod[0] ;
         A4293DisNPzas = P000G3_A4293DisNPzas[0] ;
         n4293DisNPzas = P000G3_n4293DisNPzas[0] ;
         A4616DisHorEnt = P000G3_A4616DisHorEnt[0] ;
         n4616DisHorEnt = P000G3_n4616DisHorEnt[0] ;
         A4813DisEncCli = P000G3_A4813DisEncCli[0] ;
         A4720DisDishCod = P000G3_A4720DisDishCod[0] ;
         A5031DisCom = P000G3_A5031DisCom[0] ;
         n5031DisCom = P000G3_n5031DisCom[0] ;
         A5032DisEstTip = P000G3_A5032DisEstTip[0] ;
         A5252DisAcc = P000G3_A5252DisAcc[0] ;
         A5350DisObsAnc = P000G3_A5350DisObsAnc[0] ;
         A5349DisObsGrm = P000G3_A5349DisObsGrm[0] ;
         A5366DisAntp = P000G3_A5366DisAntp[0] ;
         A5405DisAntpT = P000G3_A5405DisAntpT[0] ;
         A1052DisObs = P000G3_A1052DisObs[0] ;
         A3627DisFecLan = P000G3_A3627DisFecLan[0] ;
         n3627DisFecLan = P000G3_n3627DisFecLan[0] ;
         A998DisNMtr = P000G3_A998DisNMtr[0] ;
         A7738DisMaqEst = P000G3_A7738DisMaqEst[0] ;
         A4615DisTam = P000G3_A4615DisTam[0] ;
         A2743DisNumTex1 = P000G3_A2743DisNumTex1[0] ;
         A7523DisRec = P000G3_A7523DisRec[0] ;
         A4785DisNroCor = P000G3_A4785DisNroCor[0] ;
         A9771DisItem1 = P000G3_A9771DisItem1[0] ;
         A387DisPiePie = P000G3_A387DisPiePie[0] ;
         n387DisPiePie = P000G3_n387DisPiePie[0] ;
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A386DisPieNor = (short)(getDisPieNor0( A396EmprCod, A361DisCod)) ;
         }
         else
         {
            A386DisPieNor = (short)(0) ;
         }
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
         {
            A385DisPieMtr = getDisPieMtr0( A396EmprCod, A361DisCod) ;
         }
         else
         {
            if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
            {
               A385DisPieMtr = getDisPieMtr1( A396EmprCod, A361DisCod) ;
            }
            else
            {
               A385DisPieMtr = DecimalUtil.doubleToDec(0) ;
            }
         }
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
         {
            A381DisPieKgm = getDisPieKgm0( A396EmprCod, A361DisCod) ;
         }
         else
         {
            if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
            {
               A381DisPieKgm = getDisPieKgm1( A396EmprCod, A361DisCod) ;
            }
            else
            {
               A381DisPieKgm = DecimalUtil.doubleToDec(0) ;
            }
         }
         GXt_char1 = A475FindCol ;
         GXv_char2[0] = GXt_char1 ;
         new app.pedidos.dis_findcol_validate(remoteHandle, context).execute( A396EmprCod, A252CliCod, A335DisArtCod, A362DisColNom, A363DisColNum, A390DisTipCol, GXv_char2) ;
         pgenbarm.this.GXt_char1 = GXv_char2[0] ;
         A475FindCol = GXt_char1 ;
         W396EmprCod = A396EmprCod ;
         W361DisCod = A361DisCod ;
         AV17ContVal = 0 ;
         if ( ( GXutil.strcmp(A757PriCod, "0") == 0 ) && ( AV18Flag == 1 ) )
         {
            GXv_int3[0] = AV17ContVal ;
            new app.pnumdoc(remoteHandle, context).execute( AV15EmprCod, "020300", GXv_int3) ;
            pgenbarm.this.AV17ContVal = GXv_int3[0] ;
         }
         if ( ( GXutil.strcmp(A757PriCod, "1") == 0 ) && ( AV18Flag == 1 ) )
         {
            GXv_int3[0] = AV17ContVal ;
            new app.pnumdoc(remoteHandle, context).execute( AV15EmprCod, "021300", GXv_int3) ;
            pgenbarm.this.AV17ContVal = GXv_int3[0] ;
         }
         AV68DisReo = (byte)(0) ;
         AV19Disacc = A5252DisAcc ;
         /* Using cursor P000G4 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A673Piezas = P000G4_A673Piezas[0] ;
            A55AlbRReo = P000G4_A55AlbRReo[0] ;
            A44AlbRecCod = P000G4_A44AlbRecCod[0] ;
            A55AlbRReo = P000G4_A55AlbRReo[0] ;
            if ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "SI", "")) == 0 )
            {
               AV68DisReo = (byte)(1) ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Execute user subroutine: 'LOCALIZACIONHELIPUERTO' */
         S132 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         AV20TipDefCod = (short)(0) ;
         if ( AV68DisReo == 1 )
         {
            /* Using cursor P000G5 */
            pr_default.execute(2, new Object[] {AV15EmprCod, Integer.valueOf(AV16DisCod)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A361DisCod = P000G5_A361DisCod[0] ;
               A396EmprCod = P000G5_A396EmprCod[0] ;
               A833TipDefCod = P000G5_A833TipDefCod[0] ;
               n833TipDefCod = P000G5_n833TipDefCod[0] ;
               AV20TipDefCod = A833TipDefCod ;
               pr_default.readNext(2);
            }
            pr_default.close(2);
         }
         GXv_char2[0] = A396EmprCod ;
         GXv_int3[0] = A252CliCod ;
         GXv_char4[0] = A335DisArtCod ;
         GXv_char5[0] = A362DisColNom ;
         GXv_int6[0] = A363DisColNum ;
         GXv_int7[0] = A390DisTipCol ;
         GXv_int8[0] = AV74Matiz ;
         GXv_int9[0] = AV21IntCod ;
         new app.pbuscma2(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_char4, GXv_char5, GXv_int6, GXv_int7, GXv_int8, GXv_int9) ;
         pgenbarm.this.A396EmprCod = GXv_char2[0] ;
         pgenbarm.this.A252CliCod = GXv_int3[0] ;
         pgenbarm.this.A335DisArtCod = GXv_char4[0] ;
         pgenbarm.this.A362DisColNom = GXv_char5[0] ;
         pgenbarm.this.A363DisColNum = GXv_int6[0] ;
         pgenbarm.this.A390DisTipCol = GXv_int7[0] ;
         pgenbarm.this.AV74Matiz = GXv_int8[0] ;
         pgenbarm.this.AV21IntCod = GXv_int9[0] ;
         AV22DisComULin = (byte)(0) ;
         AV23DisDGUltlin = (byte)(0) ;
         /* Using cursor P000G6 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A1057DisComAnh = P000G6_A1057DisComAnh[0] ;
            n1057DisComAnh = P000G6_n1057DisComAnh[0] ;
            A1058DisComMtr = P000G6_A1058DisComMtr[0] ;
            n1058DisComMtr = P000G6_n1058DisComMtr[0] ;
            A1059DisComPie = P000G6_A1059DisComPie[0] ;
            n1059DisComPie = P000G6_n1059DisComPie[0] ;
            A7735DisComObs = P000G6_A7735DisComObs[0] ;
            n7735DisComObs = P000G6_n7735DisComObs[0] ;
            A13072DisComDibC = P000G6_A13072DisComDibC[0] ;
            n13072DisComDibC = P000G6_n13072DisComDibC[0] ;
            A13073DisComDibI = P000G6_A13073DisComDibI[0] ;
            n13073DisComDibI = P000G6_n13073DisComDibI[0] ;
            A1032FonCod = P000G6_A1032FonCod[0] ;
            A1056DisComCod = P000G6_A1056DisComCod[0] ;
            A2524DisComLin = P000G6_A2524DisComLin[0] ;
            W396EmprCod = A396EmprCod ;
            /*
               INSERT RECORD ON TABLE TXPBARCOM

            */
            W396EmprCod = A396EmprCod ;
            A396EmprCod = AV15EmprCod ;
            A129BarCod = ((AV18Flag==0) ? A361DisCod : AV17ContVal) ;
            n129BarCod = false ;
            A132BarCodReo = (byte)(0) ;
            n132BarCodReo = false ;
            A130BarCodPar = " " ;
            n130BarCodPar = false ;
            A1539BarComAnh = A1057DisComAnh ;
            n1539BarComAnh = false ;
            A1541BarComMtr = A1058DisComMtr ;
            n1541BarComMtr = false ;
            A1543BarComPie = A1059DisComPie ;
            n1543BarComPie = false ;
            A1540BarComMLan = DecimalUtil.ZERO ;
            n1540BarComMLan = false ;
            A1544BarComPLan = (short)(0) ;
            n1544BarComPLan = false ;
            A1542BarComPEst = (byte)(0) ;
            n1542BarComPEst = false ;
            A2069BarComEst = httpContext.getMessage( "N", "") ;
            n2069BarComEst = false ;
            A2117RecEstAnh = (short)(0) ;
            n2117RecEstAnh = false ;
            A2072BarMtrRep = DecimalUtil.ZERO ;
            n2072BarMtrRep = false ;
            A2073BarNumMol = (short)(0) ;
            n2073BarNumMol = false ;
            A2509BarCodLan = 0 ;
            n2509BarCodLan = false ;
            A2510BarComPri = "" ;
            n2510BarComPri = false ;
            A2131RecObsULin = (byte)(0) ;
            n2131RecObsULin = false ;
            A2071BarMtrEst = DecimalUtil.ZERO ;
            n2071BarMtrEst = false ;
            A7734BarComObs = A7735DisComObs ;
            n7734BarComObs = false ;
            A13074BarComDibC = A13072DisComDibC ;
            n13074BarComDibC = false ;
            A13075BarComDibI = A13073DisComDibI ;
            n13075BarComDibI = false ;
            /* Using cursor P000G7 */
            pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod, Boolean.valueOf(n1539BarComAnh), Short.valueOf(A1539BarComAnh), Boolean.valueOf(n1541BarComMtr), A1541BarComMtr, Boolean.valueOf(n1543BarComPie), Short.valueOf(A1543BarComPie), Boolean.valueOf(n1540BarComMLan), A1540BarComMLan, Boolean.valueOf(n1544BarComPLan), Short.valueOf(A1544BarComPLan), Boolean.valueOf(n1542BarComPEst), Byte.valueOf(A1542BarComPEst), Boolean.valueOf(n2069BarComEst), A2069BarComEst, Boolean.valueOf(n2072BarMtrRep), A2072BarMtrRep, Boolean.valueOf(n2071BarMtrEst), A2071BarMtrEst, Boolean.valueOf(n2117RecEstAnh), Short.valueOf(A2117RecEstAnh), Boolean.valueOf(n2073BarNumMol), Short.valueOf(A2073BarNumMol), Boolean.valueOf(n2509BarCodLan), Integer.valueOf(A2509BarCodLan), Boolean.valueOf(n2510BarComPri), A2510BarComPri, Boolean.valueOf(n2131RecObsULin), Byte.valueOf(A2131RecObsULin), Boolean.valueOf(n7734BarComObs), A7734BarComObs, Boolean.valueOf(n13074BarComDibC), A13074BarComDibC, Boolean.valueOf(n13075BarComDibI), Integer.valueOf(A13075BarComDibI)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCOM");
            if ( (pr_default.getStatus(4) == 1) )
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
            /* End Insert */
            AV22DisComULin = A2524DisComLin ;
            A396EmprCod = W396EmprCod ;
            pr_default.readNext(3);
         }
         pr_default.close(3);
         /* Using cursor P000G8 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A13081DisDGLin = P000G8_A13081DisDGLin[0] ;
            A13082DisDGDibCl = P000G8_A13082DisDGDibCl[0] ;
            A13083DisDGDibIn = P000G8_A13083DisDGDibIn[0] ;
            A13085DisDGFondo = P000G8_A13085DisDGFondo[0] ;
            A13084DisDGComb = P000G8_A13084DisDGComb[0] ;
            A13091DisDGObs = P000G8_A13091DisDGObs[0] ;
            A13086DisDGMts = P000G8_A13086DisDGMts[0] ;
            A13087DisDGPzs = P000G8_A13087DisDGPzs[0] ;
            A13088DisDGAnc = P000G8_A13088DisDGAnc[0] ;
            W396EmprCod = A396EmprCod ;
            /*
               INSERT RECORD ON TABLE TXPDIGBAR

            */
            W396EmprCod = A396EmprCod ;
            A396EmprCod = AV15EmprCod ;
            A129BarCod = ((AV18Flag==0) ? A361DisCod : AV17ContVal) ;
            n129BarCod = false ;
            A132BarCodReo = (byte)(0) ;
            n132BarCodReo = false ;
            A130BarCodPar = " " ;
            n130BarCodPar = false ;
            A13093BarDGLin = A13081DisDGLin ;
            A13094BarDGDibCl = A13082DisDGDibCl ;
            A13095BarDGDibIn = A13083DisDGDibIn ;
            A13097BarDGFOndo = A13085DisDGFondo ;
            A13096BarDGComb = A13084DisDGComb ;
            A13098BarDGObs = A13091DisDGObs ;
            A13100BarDGMts = A13086DisDGMts ;
            A13099BarDGPzs = (short)(A13087DisDGPzs) ;
            A13101BarDGAncho = A13088DisDGAnc ;
            /* Using cursor P000G9 */
            pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Byte.valueOf(A13093BarDGLin), A13094BarDGDibCl, Integer.valueOf(A13095BarDGDibIn), A13096BarDGComb, A13097BarDGFOndo, A13098BarDGObs, Short.valueOf(A13099BarDGPzs), A13100BarDGMts, Short.valueOf(A13101BarDGAncho)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDIGBAR");
            if ( (pr_default.getStatus(6) == 1) )
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
            /* End Insert */
            AV23DisDGUltlin = A13080DisDGUltli ;
            A396EmprCod = W396EmprCod ;
            pr_default.readNext(5);
         }
         pr_default.close(5);
         AV89Cont_not = (byte)(0) ;
         if ( AV112Vincolor == 0 )
         {
            if ( ( AV87F_carvema == 1 ) || ( AV155WorkNotas == 1 ) )
            {
               AV88CodPar = "" ;
               /* Using cursor P000G10 */
               pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
               while ( (pr_default.getStatus(7) != 101) )
               {
                  A376DisObsLin = P000G10_A376DisObsLin[0] ;
                  A377DisObsTxt = P000G10_A377DisObsTxt[0] ;
                  W396EmprCod = A396EmprCod ;
                  /*
                     INSERT RECORD ON TABLE TXPBARNOT

                  */
                  W396EmprCod = A396EmprCod ;
                  A129BarCod = ((AV18Flag==0) ? A361DisCod : AV17ContVal) ;
                  n129BarCod = false ;
                  A132BarCodReo = (byte)(0) ;
                  n132BarCodReo = false ;
                  n130BarCodPar = false ;
                  A188BarNotLin = A376DisObsLin ;
                  A187BarNotDsc = A377DisObsTxt ;
                  /* Using cursor P000G11 */
                  pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Byte.valueOf(A188BarNotLin), A187BarNotDsc});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARNOT");
                  if ( (pr_default.getStatus(8) == 1) )
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
                  /* End Insert */
                  AV89Cont_not = A376DisObsLin ;
                  A396EmprCod = W396EmprCod ;
                  pr_default.readNext(7);
               }
               pr_default.close(7);
            }
         }
         AV24CliCod = A252CliCod ;
         AV25DisArtCod = A335DisArtCod ;
         /* Execute user subroutine: 'ARTICU' */
         S142 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         if ( AV112Vincolor == 1 )
         {
            AV26ForColNom = A362DisColNom ;
            AV27ForColNum = A363DisColNum ;
            AV28TipColCod = A390DisTipCol ;
            GXv_char5[0] = AV15EmprCod ;
            GXv_int6[0] = AV24CliCod ;
            GXv_char4[0] = AV25DisArtCod ;
            GXv_char2[0] = AV26ForColNom ;
            GXv_int3[0] = AV27ForColNum ;
            GXv_int9[0] = AV28TipColCod ;
            GXv_int10[0] = AV16DisCod ;
            GXv_int11[0] = AV17ContVal ;
            GXv_int7[0] = AV18Flag ;
            new app.pobsvin(remoteHandle, context).execute( GXv_char5, GXv_int6, GXv_char4, GXv_char2, GXv_int3, GXv_int9, GXv_int10, GXv_int11, GXv_int7) ;
            pgenbarm.this.AV15EmprCod = GXv_char5[0] ;
            pgenbarm.this.AV24CliCod = GXv_int6[0] ;
            pgenbarm.this.AV25DisArtCod = GXv_char4[0] ;
            pgenbarm.this.AV26ForColNom = GXv_char2[0] ;
            pgenbarm.this.AV27ForColNum = GXv_int3[0] ;
            pgenbarm.this.AV28TipColCod = GXv_int9[0] ;
            pgenbarm.this.AV16DisCod = GXv_int10[0] ;
            pgenbarm.this.AV17ContVal = GXv_int11[0] ;
            pgenbarm.this.AV18Flag = GXv_int7[0] ;
         }
         AV29DisArtTip = A352DisArtTip ;
         /* Execute user subroutine: 'TIPARTRB' */
         S152 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         /*
            INSERT RECORD ON TABLE TXPBARCAD

         */
         W396EmprCod = A396EmprCod ;
         W361DisCod = A361DisCod ;
         A396EmprCod = AV15EmprCod ;
         if ( AV18Flag == 0 )
         {
            A129BarCod = AV16DisCod ;
            n129BarCod = false ;
            AV30BarCod = AV16DisCod ;
            AV31BarCodPar = AV16DisCod ;
            AV75Mensa = GXutil.concat( httpContext.getMessage( "Generando Hoja de Ruta", ""), GXutil.str( AV30BarCod, 8, 0), " ") ;
            System.out.println( AV75Mensa );
         }
         else
         {
            A129BarCod = AV17ContVal ;
            n129BarCod = false ;
            AV30BarCod = AV17ContVal ;
            AV31BarCodPar = AV17ContVal ;
            AV75Mensa = GXutil.concat( httpContext.getMessage( "Generando Hoja de Ruta", ""), GXutil.str( AV17ContVal, 8, 0), " ") ;
            System.out.println( AV75Mensa );
         }
         A132BarCodReo = (byte)(0) ;
         n132BarCodReo = false ;
         A130BarCodPar = " " ;
         n130BarCodPar = false ;
         A361DisCod = AV16DisCod ;
         A143BarDisNum = A360DisCliNum ;
         A212BarSer = A335DisArtCod ;
         A1652BarSerDsc = A337DisArtDsc ;
         A217BarTipArt = A352DisArtTip ;
         n217BarTipArt = false ;
         A135BarColNom = A362DisColNom ;
         A136BarColNum = A363DisColNum ;
         A218BarTipCol = A390DisTipCol ;
         if ( ( AV131Sequeiro == 1 ) || ( AV133Suprema == 1 ) || ( AV165fabricato == 1 ) )
         {
            if ( AV133Suprema == 1 )
            {
               A2497BarFecIni = Gx_date ;
            }
            A159BarFecGen = A369DisFec ;
         }
         else
         {
            A159BarFecGen = Gx_date ;
         }
         A192BarNumUni = A375DisNumUni ;
         A228BarUniMed = A392DisUniMed ;
         A155BarFecCli = A370DisFecCli ;
         A191BarNumPie = ((GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", ""))==0) ? A387DisPiePie : ((A386DisPieNor==0) ? A374DisNumPie : A386DisPieNor)) ;
         A180BarMaqCod = AV32MaqCod ;
         A236BarVolMaq = AV33MaqVolMed ;
         A193BarOpeEsp = (byte)(((GXutil.strcmp(A341DisArtOpe, httpContext.getMessage( "SI", ""))==0) ? 1 : ((GXutil.strcmp(A475FindCol, "xxx")==0) ? 4 : ((AV68DisReo==1) ? 7 : 0)))) ;
         A235BarUrg = A359DisArtUrg ;
         A182BarMat = A340DisArtMat ;
         A211BarRdt = A350DisArtRdt ;
         A221BarTra1 = GXutil.substring( A353DisArtTr1, 1, 3) ;
         A224BarTraP1 = A344DisArtPt1 ;
         A222BarTra2 = GXutil.substring( A354DisArtTr2, 1, 3) ;
         A225BarTraP2 = A345DisArtPt2 ;
         A223BarTra3 = GXutil.substring( A355DisArtTr3, 1, 3) ;
         A226BarTraP3 = A346DisArtPt3 ;
         A229BarUrd1 = A356DisArtUr1 ;
         A232BarUrdP1 = A347DisArtPu1 ;
         A230BarUrd2 = A357DisArtUr2 ;
         A233BarUrdP2 = A348DisArtPu2 ;
         A231BarUrd3 = A358DisArtUr3 ;
         A234BarUrdP3 = A349DisArtPu3 ;
         A127BarAncCru1 = A1232DisArtAcb ;
         A128BarAncCru2 = A1233DisArtAc2 ;
         A125BarAncAca1 = A334DisArtAnh ;
         A126BarAncAca2 = A1231DisArtAn1 ;
         A206BarPle = A343DisArtPle ;
         A177BarLar = A339DisArtLar ;
         A214BarSua = A351DisArtSua ;
         A118BarAcaQui = A333DisArtAca ;
         A139BarCorOri = A336DisArtCor ;
         A145BarEncOri = A338DisArtEnc ;
         A146BarEst = (byte)(0) ;
         A2826BarNumLot = A2831DisNumLot ;
         A2827BarKgsLot = A2832DisKgsLot ;
         A2828BarMtrLot = A2833DisMtrLot ;
         A213BarSit = (byte)(((GXutil.strcmp(A475FindCol, "xxx")==0) ? 2 : (((AV91TintSN==1)&&(GXutil.strcmp(A4014DisTin, httpContext.getMessage( "N", ""))==0))||((GXutil.strcmp(A4014DisTin, httpContext.getMessage( "N", ""))==0)&&(AV91TintSN==0)) ? 5 : 1))) ;
         A147BarEstCol = (byte)(((GXutil.strcmp(A475FindCol, "xxx")==0) ? 0 : 1)) ;
         AV34Inc_obs = ((GXutil.strcmp(A475FindCol, "xxx")==0) ? A475FindCol+httpContext.getMessage( " Generacion HDR. Situacion -> ", "")+"2" : (((AV91TintSN==1)&&(GXutil.strcmp(A4014DisTin, httpContext.getMessage( "N", ""))==0))||((GXutil.strcmp(A4014DisTin, httpContext.getMessage( "N", ""))==0)&&(AV91TintSN==0)) ? A475FindCol+httpContext.getMessage( " Generacion HDR. Situacion -> ", "")+"5" : A475FindCol+httpContext.getMessage( " Generacion HDR. Situacion -> ", "")+"1")) + GXutil.newLine( ) ;
         AV34Inc_obs += httpContext.getMessage( "PML =", "") + GXutil.str( AV35Barpes, 4, 0) + GXutil.newLine( ) ;
         if ( AV163endutex == 1 )
         {
            AV34Inc_obs += httpContext.getMessage( "Loc =", "") + AV162Disloc + GXutil.newLine( ) ;
         }
         A209BarPri = A757PriCod ;
         A138BarConReo = (byte)(0) ;
         A137BarConPar = " " ;
         A189BarNumAny = (short)(0) ;
         A141BarCosPro = DecimalUtil.doubleToDec(0) ;
         A140BarCosAny = DecimalUtil.doubleToDec(0) ;
         A169BarKgsFac = DecimalUtil.doubleToDec(0) ;
         if ( AV68DisReo == 1 )
         {
            A148BarEstReo = (byte)(2) ;
            AV80Num_fic = 0 ;
            GXv_int11[0] = AV80Num_fic ;
            new app.pnumdoc(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "NOTAE", ""), GXv_int11) ;
            pgenbarm.this.AV80Num_fic = GXv_int11[0] ;
         }
         else
         {
            A148BarEstReo = (byte)(0) ;
         }
         A196BarOrdReo = (byte)(0) ;
         A158BarFecFpr = A371DisFecEnt ;
         A120BarAgrEst = httpContext.getMessage( "N", "") ;
         AV39disartpes = A342DisArtPes ;
         if ( AV39disartpes < 0 )
         {
            AV39disartpes = (short)(0) ;
         }
         A864BarPes = AV39disartpes ;
         A1226BarGraCru = A1225DisGraCru ;
         A921BarMatiz = AV74Matiz ;
         A1234BarNomCli = A1195DisNomCli ;
         A1235BarNumCli = A1196DisNumCli ;
         A1223BarEncCom = A1197DisEncCom ;
         A1224BarEncAnh = A1198DisEncAnh ;
         A178BarLis = (byte)(0) ;
         A1503BarPart = A1502DisPart ;
         A2311BarCliDes = A2310DisCliDes ;
         A2010BarTipDis = A2009DisTipDis ;
         A2485BarColPes = httpContext.getMessage( "N", "") ;
         A2498BarPrdPes = httpContext.getMessage( "N", "") ;
         A2499BarRDos1 = httpContext.getMessage( "N", "") ;
         A2500BarRDos2 = httpContext.getMessage( "N", "") ;
         A2836BarPle2 = A2835DisPle2 ;
         A2830BarIntPer = (byte)(((AV150Velluts==1) ? A5024DisTipEst : ((AV144erfoc==1) ? A5025DisGraCob : 0))) ;
         A3030BarPlf = A2926DisPla ;
         A3133BarNumCor = A3127DisNumCor ;
         A3134BarAncSal1 = A3128DisAncSal1 ;
         A3135BarAncSal2 = A3129DisAncSal2 ;
         A3136BarAncSal3 = A3130DisAncSal3 ;
         A3137BarGraAca2 = A3131DisGraAca2 ;
         A3138BarGraCru2 = A3132DisGraCru2 ;
         A1909BarGraAca = A1906DisGraAca ;
         A1910BarRdoN = A1907DisRdoN ;
         A1911BarRdoA = A1908DisRdoA ;
         A1798BarDibCli = A1013DibCli ;
         A1799BarDibInt = A1014DibInt ;
         A2512BarComULin = AV22DisComULin ;
         n2512BarComULin = false ;
         A13092BarDGUltLi = AV23DisDGUltlin ;
         n13092BarDGUltLi = false ;
         A833TipDefCod = AV20TipDefCod ;
         n833TipDefCod = false ;
         A4016BarTin = A4014DisTin ;
         A4400BarSitEst = (byte)(2) ;
         A4456BarPelAnh = A4468DisPelAnh ;
         A4457BarCruMts = A4469DisCruMts ;
         n4457BarCruMts = false ;
         A4458BarCruKgs = A4470DisCruKgs ;
         n4458BarCruKgs = false ;
         A4459BarCruEnr = A4471DisCruEnr ;
         A4460BarLotPza = A4472DisLotPza ;
         n4460BarLotPza = false ;
         A4461BarLotMts = A4473DisLotMts ;
         A4462BarLotKgs = A4474DisLotKgs ;
         A4463BarLotMaq = A4475DisLotMaq ;
         n4463BarLotMaq = false ;
         A4464BarAcaFor = A4476DisAcaFor ;
         n4464BarAcaFor = false ;
         A4465BarAcaBak = A4477DisAcaBak ;
         n4465BarAcaBak = false ;
         A4466BarAcaAnh = A4478DisAcaAnh ;
         A4467BarAcaMar = A4479DisAcaMar ;
         A833TipDefCod = AV20TipDefCod ;
         n833TipDefCod = false ;
         A2400BarManCod = A2402DisManCod ;
         A3311BarManCod1 = A3307DisManCod1 ;
         A3312BarManCod2 = A3308DisManCod2 ;
         A4609BarMdlCod = A4614DisMdlCod ;
         A4612BarPzas = A4293DisNPzas ;
         n4612BarPzas = false ;
         A4611BarHorEnt = A4616DisHorEnt ;
         n4611BarHorEnt = false ;
         A4613BarHorReg = GXutil.resetDate(GXutil.serverNow( context, remoteHandle, pr_default)) ;
         n4613BarHorReg = false ;
         A4812BarEncCli = A4813DisEncCli ;
         A2460BarTipAca = GXutil.space( (short)(1)) ;
         A4975BarNumReo = (short)(0) ;
         A5026BarTipEst = A5024DisTipEst ;
         A5027BarGraCob = A5025DisGraCob ;
         A4716BarDishCod = A4720DisDishCod ;
         A5033BarCom = A5031DisCom ;
         A5034BarEstTip = A5032DisEstTip ;
         A5253BarAcc = ((AV143Prec_uni==1)||(AV94F_moda21==1)||(AV149Tintex==1) ? A4477DisAcaBak : A5252DisAcc) ;
         A144BarDisOri = A361DisCod ;
         A5352BarObsAnc = A5350DisObsAnc ;
         A5351BarObsGrm = A5349DisObsGrm ;
         A5367BarAntp = A5366DisAntp ;
         A5406BarAntpT = A5405DisAntpT ;
         A646NotUltLin = AV89Cont_not ;
         n646NotUltLin = false ;
         A2454BarGirar = ((AV90F_pais==1)||(AV133Suprema==1)||(AV142Coloretto==1) ? GXutil.substring( A1052DisObs, 1, 20) : "") ;
         if ( AV92F_lavand == 1 )
         {
            GXv_char5[0] = AV15EmprCod ;
            GXv_int11[0] = A361DisCod ;
            GXv_int8[0] = A374DisNumPie ;
            GXv_decimal12[0] = A375DisNumUni ;
            GXv_int13[0] = AV93Tiempo_a ;
            new app.phorala(remoteHandle, context).execute( GXv_char5, GXv_int11, GXv_int8, GXv_decimal12, GXv_int13) ;
            pgenbarm.this.AV15EmprCod = GXv_char5[0] ;
            pgenbarm.this.A361DisCod = GXv_int11[0] ;
            pgenbarm.this.A374DisNumPie = GXv_int8[0] ;
            pgenbarm.this.A375DisNumUni = GXv_decimal12[0] ;
            pgenbarm.this.AV93Tiempo_a = GXv_int13[0] ;
            A5054BarBp13 = AV93Tiempo_a ;
            n5054BarBp13 = false ;
            A4462BarLotKgs = A375DisNumUni ;
            A4460BarLotPza = A374DisNumPie ;
            n4460BarLotPza = false ;
            A4400BarSitEst = (byte)(0) ;
         }
         if ( ( AV94F_moda21 == 1 ) && ( A213BarSit == 1 ) )
         {
            GXv_char5[0] = A396EmprCod ;
            GXv_int11[0] = A252CliCod ;
            GXv_char4[0] = A212BarSer ;
            GXv_char2[0] = A135BarColNom ;
            GXv_int10[0] = A136BarColNum ;
            GXv_int9[0] = A218BarTipCol ;
            GXv_date14[0] = AV40ForPreFec ;
            new app.palacol(remoteHandle, context).execute( GXv_char5, GXv_int11, GXv_char4, GXv_char2, GXv_int10, GXv_int9, GXv_date14) ;
            pgenbarm.this.A396EmprCod = GXv_char5[0] ;
            pgenbarm.this.A252CliCod = GXv_int11[0] ;
            pgenbarm.this.A212BarSer = GXv_char4[0] ;
            pgenbarm.this.A135BarColNom = GXv_char2[0] ;
            pgenbarm.this.A136BarColNum = GXv_int10[0] ;
            pgenbarm.this.A218BarTipCol = GXv_int9[0] ;
            pgenbarm.this.AV40ForPreFec = GXv_date14[0] ;
            if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV40ForPreFec)) )
            {
               AV95Dias_a = (short)(GXutil.ddiff(Gx_date,AV40ForPreFec)) ;
               AV97Dias_ac = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec((AV96AlaCol*365)/ (double) (12)), 0))) ;
               if ( AV95Dias_a >= AV97Dias_ac )
               {
                  A3030BarPlf = httpContext.getMessage( "S", "") ;
               }
            }
         }
         if ( ( AV98F_tinamar == 1 ) || ( AV123FlagTint == 1 ) || ( AV125Kohler == 1 ) || ( AV128CtrlUsu == 1 ) )
         {
            AV99Usurcod_a = AV37UsurCod ;
            AV100Fecha_a = localUtil.dtoc( Gx_date, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
            A4835BarAudOpeN = AV37UsurCod + " " + AV100Fecha_a + " " + Gx_time ;
            n4835BarAudOpeN = false ;
         }
         if ( ( AV107Induyco == 1 ) || ( AV133Suprema == 1 ) )
         {
            if ( ( AV133Suprema == 1 ) || ( AV107Induyco == 1 ) )
            {
               A1003BarFecLan = A3627DisFecLan ;
               n1003BarFecLan = false ;
            }
            A3594BarPriTin = (byte)(0) ;
            A4837BarAudSupN = "" ;
            n4837BarAudSupN = false ;
         }
         else
         {
            A3594BarPriTin = (byte)(((AV156Tintutex==0) ? 80 : 99)) ;
         }
         A1500BarNMtr = A998DisNMtr ;
         A4845BarAudObs = ((AV133Suprema==1) ? A360DisCliNum : " ") ;
         n4845BarAudObs = false ;
         A161BarFecSal = GXutil.nullDate() ;
         A7733BarMaqEst = A7738DisMaqEst ;
         A5293BarCodBan = " " ;
         A4610BarTam = A4615DisTam ;
         A8097BarFecHis = ((AV139Eliot==1)||(AV112Vincolor==1) ? GXutil.serverNow( context, remoteHandle, pr_default) : GXutil.nullDate()) ;
         A2752BarNumTex1 = (byte)(((AV139Eliot==1)||(AV112Vincolor==1) ? A2743DisNumTex1 : 0)) ;
         A6434BarAsi = (byte)(((GXutil.strcmp(A5252DisAcc, httpContext.getMessage( "S", ""))!=0)&&(AV154SinCrudo==1) ? 1 : 0)) ;
         A3746BarNPed = ((AV87F_carvema==1)||(AV150Velluts==1) ? A7523DisRec : " ") ;
         A2459BarTemSec = (short)(0) ;
         A2458BarObsVL = (short)(0) ;
         n2458BarObsVL = false ;
         A4836BarAudSup = ((AV94F_moda21==1) ? A4785DisNroCor : 0) ;
         A9775BarItem1 = A9771DisItem1 ;
         A9776barItem2 = A9772DisItem2 ;
         A9777BarItem3 = A9773DisItem3 ;
         A9778BarItem4 = A9774DisItem4 ;
         A9789BarItem5 = A9786DisItem5 ;
         A9790BarItem6 = A9787DisItem6 ;
         A1878BarNumTen = GXutil.space( (short)(1)) ;
         A2829BarProPer = A10887Cod_Idtx ;
         if ( AV76FlagPer == 1 )
         {
            GXv_char5[0] = AV15EmprCod ;
            GXv_int11[0] = AV16DisCod ;
            GXv_char4[0] = AV41BarProPer ;
            new app.pbusdl(remoteHandle, context).execute( GXv_char5, GXv_int11, GXv_char4) ;
            pgenbarm.this.AV15EmprCod = GXv_char5[0] ;
            pgenbarm.this.AV16DisCod = GXv_int11[0] ;
            pgenbarm.this.AV41BarProPer = GXv_char4[0] ;
            if ( (0==AV21IntCod) )
            {
               A2830BarIntPer = (byte)(0) ;
            }
            else
            {
               A2830BarIntPer = AV21IntCod ;
            }
            A2829BarProPer = AV41BarProPer ;
         }
         A2445BarEntEnE = A8886DisDest ;
         A181BarMaqPro = A11659MarcaId ;
         A11662BarOrdComp = A11661DisOrdComp ;
         A5291BarTipCor = ((AV153Moda21==0)&&(AV158Exportar==0) ? A5291BarTipCor : ((GXutil.strcmp(A7739DisExp, httpContext.getMessage( "E", ""))==0) ? httpContext.getMessage( "SI", "") : httpContext.getMessage( "NO", ""))) ;
         A2459BarTemSec = (short)(((AV123FlagTint==0) ? 0 : ((GXutil.strcmp(A5291BarTipCor, " ")==0) ? 0 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( A5291BarTipCor, ".")))))) ;
         A1878BarNumTen = A1002DisNumTen ;
         A14329BarCnoEncO = A11734DisCnoEncO ;
         A11852Nxt_ArtCl2 = A11864Nxt_artcli ;
         A11850Nxt_Mdlo2 = A11859Nxt_modelo ;
         A11851Nxt_Sta2 = A11861Nxt_statio ;
         A11853Nxt_cpeID = A11860CpteId ;
         n11853Nxt_cpeID = false ;
         A11855Nxt_dpoID = A11863DptoID ;
         n11855Nxt_dpoID = false ;
         A11857Nxt_desaID = A11862DesaID ;
         n11857Nxt_desaID = false ;
         A12329SubRevID = A12328RevenID ;
         n12329SubRevID = false ;
         A12767BarTpEstam = A12768DisTpEstam ;
         A14330BarPriorid = A12765DisPriorid ;
         A12774BarProdID = A12772DisProdID ;
         A12881BarOEKOTEX = A12880DisOEKOTEX ;
         n12881BarOEKOTEX = false ;
         A13070BarLineaID = A13068DisLineaID ;
         A13071BarCanalID = A13069DisCanalID ;
         A13077BarLinPrd = A13076DisLinPrd ;
         GXv_char5[0] = A396EmprCod ;
         GXv_int11[0] = A252CliCod ;
         GXv_char4[0] = A335DisArtCod ;
         GXv_char2[0] = A362DisColNom ;
         GXv_int10[0] = A363DisColNum ;
         GXv_int9[0] = A390DisTipCol ;
         GXv_int15[0] = AV161selected ;
         new app.pbusrgb(remoteHandle, context).execute( GXv_char5, GXv_int11, GXv_char4, GXv_char2, GXv_int10, GXv_int9, GXv_int15) ;
         pgenbarm.this.A396EmprCod = GXv_char5[0] ;
         pgenbarm.this.A252CliCod = GXv_int11[0] ;
         pgenbarm.this.A335DisArtCod = GXv_char4[0] ;
         pgenbarm.this.A362DisColNom = GXv_char2[0] ;
         pgenbarm.this.A363DisColNum = GXv_int10[0] ;
         pgenbarm.this.A390DisTipCol = GXv_int9[0] ;
         pgenbarm.this.AV161selected = GXv_int15[0] ;
         A13907BarSerDsc2 = A13987DisArtDsc2 ;
         n13907BarSerDsc2 = false ;
         if ( AV165fabricato == 1 )
         {
            A2830BarIntPer = A12765DisPriorid ;
            A921BarMatiz = A12768DisTpEstam ;
            A3595BarMacCod = A2831DisNumLot ;
         }
         A13234BarRGB = ((AV165fabricato==1) ? A13233DisRGB : ((AV161selected<0) ? 16777215 : AV161selected)) ;
         A12809BarLocTel = ((0==AV163endutex) ? "" : AV162Disloc) ;
         A1431BarLocDis = ((0==AV164localizacionhelipuerto) ? A1430DisLoc : AV162Disloc) ;
         A13908BarIdtx2 = A13986DisIdtx2 ;
         n13908BarIdtx2 = false ;
         /* Using cursor P000G12 */
         pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, A120BarAgrEst, A180BarMaqCod, Integer.valueOf(A236BarVolMaq), Integer.valueOf(A361DisCod), A143BarDisNum, A212BarSer, Boolean.valueOf(n217BarTipArt), Short.valueOf(A217BarTipArt), A135BarColNom, Integer.valueOf(A136BarColNum), Byte.valueOf(A218BarTipCol), A159BarFecGen, A192BarNumUni, A228BarUniMed, Byte.valueOf(A148BarEstReo), A155BarFecCli, Short.valueOf(A191BarNumPie), Byte.valueOf(A196BarOrdReo), A181BarMaqPro, Byte.valueOf(A193BarOpeEsp), A161BarFecSal, Byte.valueOf(A235BarUrg), A182BarMat, A211BarRdt, A221BarTra1, Short.valueOf(A224BarTraP1), A222BarTra2, Short.valueOf(A225BarTraP2), A223BarTra3, Short.valueOf(A226BarTraP3), A229BarUrd1, Short.valueOf(A232BarUrdP1), A230BarUrd2, Short.valueOf(A233BarUrdP2), A231BarUrd3, Short.valueOf(A234BarUrdP3), Short.valueOf(A127BarAncCru1), Short.valueOf(A128BarAncCru2), Short.valueOf(A125BarAncAca1), Short.valueOf(A126BarAncAca2), A206BarPle, A177BarLar, A214BarSua, A118BarAcaQui, A139BarCorOri, A145BarEncOri, Byte.valueOf(A146BarEst), Byte.valueOf(A213BarSit), A209BarPri, Byte.valueOf(A138BarConReo), A137BarConPar, Short.valueOf(A189BarNumAny), A141BarCosPro, A140BarCosAny, A169BarKgsFac, A158BarFecFpr, Byte.valueOf(A147BarEstCol), Integer.valueOf(A144BarDisOri), Byte.valueOf(A178BarLis), Boolean.valueOf(n646NotUltLin), Byte.valueOf(A646NotUltLin), Short.valueOf(A864BarPes), Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod), Boolean.valueOf(n1003BarFecLan), A1003BarFecLan, Short.valueOf(A921BarMatiz), A1223BarEncCom, A1224BarEncAnh, Short.valueOf(A1226BarGraCru), A1234BarNomCli, Integer.valueOf(A1235BarNumCli), A1431BarLocDis, A1500BarNMtr, Short.valueOf(A1503BarPart), A1652BarSerDsc, A1878BarNumTen, A2010BarTipDis, Integer.valueOf(A2311BarCliDes), Short.valueOf(A2400BarManCod), A2445BarEntEnE, A2460BarTipAca, A2454BarGirar, Short.valueOf(A2459BarTemSec), Boolean.valueOf(n2458BarObsVL), Short.valueOf(A2458BarObsVL), Short.valueOf(A1909BarGraAca), A1910BarRdoN, A1911BarRdoA, A2485BarColPes, A2498BarPrdPes, A2499BarRDos1, A2500BarRDos2, A2497BarFecIni, Byte.valueOf(A2752BarNumTex1), Integer.valueOf(A2826BarNumLot), A2827BarKgsLot, A2828BarMtrLot, A2829BarProPer, Byte.valueOf(A2830BarIntPer), A3030BarPlf, A2836BarPle2, Short.valueOf(A3133BarNumCor), Short.valueOf(A3134BarAncSal1), Short.valueOf(A3135BarAncSal2), Short.valueOf(A3136BarAncSal3), Short.valueOf(A3137BarGraAca2), Short.valueOf(A3138BarGraCru2), Short.valueOf(A3311BarManCod1), Short.valueOf(A3312BarManCod2), Integer.valueOf(A3595BarMacCod), A3746BarNPed, A1798BarDibCli, Integer.valueOf(A1799BarDibInt), Boolean.valueOf(n2512BarComULin),
         Byte.valueOf(A2512BarComULin), A4016BarTin, Byte.valueOf(A4400BarSitEst), Short.valueOf(A4456BarPelAnh), Boolean.valueOf(n4457BarCruMts), A4457BarCruMts, Boolean.valueOf(n4458BarCruKgs), A4458BarCruKgs, A4459BarCruEnr, Boolean.valueOf(n4460BarLotPza), Short.valueOf(A4460BarLotPza), A4461BarLotMts, A4462BarLotKgs, Boolean.valueOf(n4463BarLotMaq), A4463BarLotMaq, Boolean.valueOf(n4464BarAcaFor), Integer.valueOf(A4464BarAcaFor), Boolean.valueOf(n4465BarAcaBak), A4465BarAcaBak, Short.valueOf(A4466BarAcaAnh), A4467BarAcaMar, A4609BarMdlCod, A4610BarTam, Boolean.valueOf(n4611BarHorEnt), A4611BarHorEnt, Boolean.valueOf(n4612BarPzas), Integer.valueOf(A4612BarPzas), Boolean.valueOf(n4613BarHorReg), A4613BarHorReg, A4716BarDishCod, A4812BarEncCli, Integer.valueOf(A4836BarAudSup), Boolean.valueOf(n4845BarAudObs), A4845BarAudObs, Short.valueOf(A4975BarNumReo), Byte.valueOf(A5026BarTipEst), Byte.valueOf(A5027BarGraCob), A5033BarCom, A5034BarEstTip, Boolean.valueOf(n5054BarBp13), Short.valueOf(A5054BarBp13), A5253BarAcc, A5291BarTipCor, A5293BarCodBan, A5351BarObsGrm, A5352BarObsAnc, A5367BarAntp, A5406BarAntpT, Byte.valueOf(A6434BarAsi), A7733BarMaqEst, A8097BarFecHis, A9775BarItem1, A9776barItem2, A9777BarItem3, A9778BarItem4, A9789BarItem5, A9790BarItem6, Boolean.valueOf(n4835BarAudOpeN), A4835BarAudOpeN, Boolean.valueOf(n4837BarAudSupN), A4837BarAudSupN, A11662BarOrdComp, Byte.valueOf(A3594BarPriTin), A11850Nxt_Mdlo2, A11851Nxt_Sta2, A11852Nxt_ArtCl2, Boolean.valueOf(n11853Nxt_cpeID), Short.valueOf(A11853Nxt_cpeID), Boolean.valueOf(n11855Nxt_dpoID), Short.valueOf(A11855Nxt_dpoID), Boolean.valueOf(n11857Nxt_desaID), Short.valueOf(A11857Nxt_desaID), Boolean.valueOf(n12329SubRevID), A12329SubRevID, Byte.valueOf(A12767BarTpEstam), A12774BarProdID, A12809BarLocTel, Boolean.valueOf(n12881BarOEKOTEX), A12881BarOEKOTEX, Short.valueOf(A13070BarLineaID), Integer.valueOf(A13071BarCanalID), A13077BarLinPrd, Boolean.valueOf(n13092BarDGUltLi), Byte.valueOf(A13092BarDGUltLi), Long.valueOf(A13234BarRGB), Boolean.valueOf(n13907BarSerDsc2), A13907BarSerDsc2, Boolean.valueOf(n13908BarIdtx2), A13908BarIdtx2, A14329BarCnoEncO, Byte.valueOf(A14330BarPriorid), Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A365DisDes});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         if ( (pr_default.getStatus(9) == 1) )
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
         A361DisCod = W361DisCod ;
         /* End Insert */
         /* Execute user subroutine: 'LMACRO' */
         S162 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         /*
            INSERT RECORD ON TABLE TXPDISBAR

         */
         A1146DisDisCod = AV16DisCod ;
         if ( AV18Flag == 0 )
         {
            A1139DisBarCod = AV16DisCod ;
         }
         else
         {
            A1139DisBarCod = AV17ContVal ;
         }
         A1140DisBarReo = (byte)(0) ;
         A1141DisBarPar = " " ;
         /* Using cursor P000G13 */
         pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A1146DisDisCod), Integer.valueOf(A1139DisBarCod), Byte.valueOf(A1140DisBarReo), A1141DisBarPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISBAR");
         if ( (pr_default.getStatus(10) == 1) )
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
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
         {
            AV73ContPie = 0 ;
            /* Using cursor P000G14 */
            pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
            while ( (pr_default.getStatus(11) != 101) )
            {
               A380DisPieCod = P000G14_A380DisPieCod[0] ;
               A382DisPieKil = P000G14_A382DisPieKil[0] ;
               A384DisPieMet = P000G14_A384DisPieMet[0] ;
               A2184DisPieLoc = P000G14_A2184DisPieLoc[0] ;
               A2185DisPieAnc = P000G14_A2185DisPieAnc[0] ;
               A6490DisPieIdPz = P000G14_A6490DisPieIdPz[0] ;
               n6490DisPieIdPz = P000G14_n6490DisPieIdPz[0] ;
               A8839DisPieCodB = P000G14_A8839DisPieCodB[0] ;
               n8839DisPieCodB = P000G14_n8839DisPieCodB[0] ;
               A44AlbRecCod = P000G14_A44AlbRecCod[0] ;
               W396EmprCod = A396EmprCod ;
               AV42AlbRecCod = A44AlbRecCod ;
               /*
                  INSERT RECORD ON TABLE TXPBARPIE

               */
               W396EmprCod = A396EmprCod ;
               W44AlbRecCod = A44AlbRecCod ;
               A396EmprCod = AV15EmprCod ;
               A129BarCod = AV30BarCod ;
               n129BarCod = false ;
               A132BarCodReo = (byte)(0) ;
               n132BarCodReo = false ;
               A130BarCodPar = " " ;
               n130BarCodPar = false ;
               A44AlbRecCod = AV42AlbRecCod ;
               A200BarPieCod = A380DisPieCod ;
               A203BarPieKil = ((AV160anahuac==1) ? (A384DisPieMet.multiply(DecimalUtil.doubleToDec(AV35Barpes))).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) : A382DisPieKil) ;
               A205BarPieMet = A384DisPieMet ;
               A2186BarPieLoc = A2184DisPieLoc ;
               n2186BarPieLoc = false ;
               A1691BarPieAnc = A2185DisPieAnc ;
               n1691BarPieAnc = false ;
               A201BarPieEst = (byte)(0) ;
               if ( AV139Eliot == 1 )
               {
                  A6489BarPieIdPz = " " ;
                  n6489BarPieIdPz = false ;
                  A8907PzaB80 = A6490DisPieIdPz ;
                  n8907PzaB80 = false ;
               }
               else
               {
                  A6489BarPieIdPz = A6490DisPieIdPz ;
                  n6489BarPieIdPz = false ;
               }
               if ( ( AV112Vincolor == 1 ) && (GXutil.strcmp("", A6490DisPieIdPz)==0) )
               {
                  A6489BarPieIdPz = GXutil.trim( GXutil.str( AV30BarCod, 8, 0)) ;
                  n6489BarPieIdPz = false ;
               }
               A8838CodBarPz = A8839DisPieCodB ;
               n8838CodBarPz = false ;
               A9800BarNPes = (byte)(0) ;
               n9800BarNPes = false ;
               A13988BarPieVtx = " " ;
               /* Using cursor P000G15 */
               pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, A200BarPieCod, Integer.valueOf(A44AlbRecCod), A203BarPieKil, A205BarPieMet, Byte.valueOf(A201BarPieEst), Boolean.valueOf(n1691BarPieAnc), Short.valueOf(A1691BarPieAnc), Boolean.valueOf(n2186BarPieLoc), A2186BarPieLoc, Boolean.valueOf(n6489BarPieIdPz), A6489BarPieIdPz, Boolean.valueOf(n8838CodBarPz), A8838CodBarPz, Boolean.valueOf(n8907PzaB80), A8907PzaB80, Boolean.valueOf(n9800BarNPes), Byte.valueOf(A9800BarNPes), A13988BarPieVtx});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
               if ( (pr_default.getStatus(12) == 1) )
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
               A44AlbRecCod = W44AlbRecCod ;
               /* End Insert */
               AV73ContPie = (int)(AV73ContPie+1) ;
               A396EmprCod = W396EmprCod ;
               pr_default.readNext(11);
            }
            pr_default.close(11);
            AV34Inc_obs += httpContext.getMessage( "Tabla BArpie,registros ", "") + GXutil.trim( GXutil.str( AV73ContPie, 6, 0)) ;
         }
         else
         {
            AV71TotKil = DecimalUtil.doubleToDec(0) ;
            AV72TotMet = DecimalUtil.doubleToDec(0) ;
            if ( ( AV103VERTIC == 1 ) || ( AV148StkInt == 1 ) )
            {
               /* Execute user subroutine: 'STKINT' */
               S172 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
            else
            {
               AV102HRStkInt = httpContext.getMessage( "N", "") ;
            }
            if ( GXutil.strcmp(AV102HRStkInt, httpContext.getMessage( "N", "")) == 0 )
            {
               AV73ContPie = 0 ;
               /* Using cursor P000G16 */
               pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
               while ( (pr_default.getStatus(13) != 101) )
               {
                  A595Kilos = P000G16_A595Kilos[0] ;
                  A631Metros = P000G16_A631Metros[0] ;
                  A673Piezas = P000G16_A673Piezas[0] ;
                  A44AlbRecCod = P000G16_A44AlbRecCod[0] ;
                  W396EmprCod = A396EmprCod ;
                  /*
                     INSERT RECORD ON TABLE TXPBARPIE

                  */
                  W396EmprCod = A396EmprCod ;
                  A396EmprCod = AV15EmprCod ;
                  A129BarCod = AV30BarCod ;
                  n129BarCod = false ;
                  A132BarCodReo = (byte)(0) ;
                  n132BarCodReo = false ;
                  A130BarCodPar = " " ;
                  n130BarCodPar = false ;
                  A200BarPieCod = GXutil.str( A44AlbRecCod, 8, 0) ;
                  A203BarPieKil = A595Kilos ;
                  A205BarPieMet = A631Metros ;
                  A1501BarPiePie = A673Piezas ;
                  A201BarPieEst = (byte)(0) ;
                  if ( GXutil.strcmp(AV19Disacc, httpContext.getMessage( "S", "")) == 0 )
                  {
                     A6489BarPieIdPz = GXutil.trim( GXutil.str( A44AlbRecCod, 8, 0)) ;
                     n6489BarPieIdPz = false ;
                     if ( AV132Tejido == 0 )
                     {
                        A2186BarPieLoc = httpContext.getMessage( "Sem Malha", "") ;
                        n2186BarPieLoc = false ;
                     }
                     else
                     {
                        A2186BarPieLoc = httpContext.getMessage( "Sem TELA", "") ;
                        n2186BarPieLoc = false ;
                     }
                  }
                  /* Using cursor P000G17 */
                  pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, A200BarPieCod, Integer.valueOf(A44AlbRecCod), A203BarPieKil, A205BarPieMet, Byte.valueOf(A201BarPieEst), Integer.valueOf(A1501BarPiePie), Boolean.valueOf(n2186BarPieLoc), A2186BarPieLoc, Boolean.valueOf(n6489BarPieIdPz), A6489BarPieIdPz});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
                  if ( (pr_default.getStatus(14) == 1) )
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
                  /* End Insert */
                  AV71TotKil = AV71TotKil.add(A595Kilos) ;
                  AV72TotMet = AV72TotMet.add(A631Metros) ;
                  if ( AV81F_nr == 1 )
                  {
                     GXv_char5[0] = AV15EmprCod ;
                     GXv_int11[0] = A44AlbRecCod ;
                     GXv_int10[0] = AV30BarCod ;
                     GXv_int9[0] = (byte)(0) ;
                     GXv_char4[0] = " " ;
                     GXv_int6[0] = AV16DisCod ;
                     new app.phdrnr(remoteHandle, context).execute( GXv_char5, GXv_int11, GXv_int10, GXv_int9, GXv_char4, GXv_int6) ;
                     pgenbarm.this.AV15EmprCod = GXv_char5[0] ;
                     pgenbarm.this.A44AlbRecCod = GXv_int11[0] ;
                     pgenbarm.this.AV30BarCod = GXv_int10[0] ;
                     pgenbarm.this.AV16DisCod = GXv_int6[0] ;
                  }
                  AV73ContPie = (int)(AV73ContPie+1) ;
                  A396EmprCod = W396EmprCod ;
                  pr_default.readNext(13);
               }
               pr_default.close(13);
               AV34Inc_obs += httpContext.getMessage( "Tabla Barpie.Sin detalle,registros ", "") + GXutil.trim( GXutil.str( AV73ContPie, 6, 0)) ;
               AV73ContPie = 0 ;
            }
         }
         GXv_char5[0] = AV15EmprCod ;
         GXv_int11[0] = AV16DisCod ;
         GXv_int10[0] = AV30BarCod ;
         new app.pfasbar(remoteHandle, context).execute( GXv_char5, GXv_int11, GXv_int10) ;
         pgenbarm.this.AV15EmprCod = GXv_char5[0] ;
         pgenbarm.this.AV16DisCod = GXv_int11[0] ;
         pgenbarm.this.AV30BarCod = GXv_int10[0] ;
         AV34Inc_obs += httpContext.getMessage( "Tabla Barpro,BarFas", "") ;
         if ( AV133Suprema == 1 )
         {
            AV43Barcodreo = (byte)(0) ;
            AV134BarCodparp = " " ;
            GXv_char5[0] = AV15EmprCod ;
            GXv_int11[0] = AV30BarCod ;
            GXv_int9[0] = AV43Barcodreo ;
            GXv_char4[0] = AV134BarCodparp ;
            new app.psimop5(remoteHandle, context).execute( GXv_char5, GXv_int11, GXv_int9, GXv_char4) ;
            pgenbarm.this.AV15EmprCod = GXv_char5[0] ;
            pgenbarm.this.AV30BarCod = GXv_int11[0] ;
            pgenbarm.this.AV43Barcodreo = GXv_int9[0] ;
            pgenbarm.this.AV134BarCodparp = GXv_char4[0] ;
         }
         if ( AV79VERTI3 == 1 )
         {
            GXv_char5[0] = AV15EmprCod ;
            GXv_int11[0] = AV16DisCod ;
            GXv_int10[0] = AV30BarCod ;
            new app.pfasba2(remoteHandle, context).execute( GXv_char5, GXv_int11, GXv_int10) ;
            pgenbarm.this.AV15EmprCod = GXv_char5[0] ;
            pgenbarm.this.AV16DisCod = GXv_int11[0] ;
            pgenbarm.this.AV30BarCod = GXv_int10[0] ;
         }
         A367DisEst = (byte)(3) ;
         AV44Nr_codigo = 0 ;
         AV45Nr_opecod = 0 ;
         AV106TipCSClq = (short)(0) ;
         /* Using cursor P000G18 */
         pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         while ( (pr_default.getStatus(15) != 101) )
         {
            A44AlbRecCod = P000G18_A44AlbRecCod[0] ;
            A673Piezas = P000G18_A673Piezas[0] ;
            /* Using cursor P000G19 */
            pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
            while ( (pr_default.getStatus(16) != 101) )
            {
               A5206Nr_albrecc = P000G19_A5206Nr_albrecc[0] ;
               n5206Nr_albrecc = P000G19_n5206Nr_albrecc[0] ;
               A5198Nr_codigo = P000G19_A5198Nr_codigo[0] ;
               A5906Nr_OpeCod = P000G19_A5906Nr_OpeCod[0] ;
               n5906Nr_OpeCod = P000G19_n5906Nr_OpeCod[0] ;
               A5904Nr_TipCsCL = P000G19_A5904Nr_TipCsCL[0] ;
               n5904Nr_TipCsCL = P000G19_n5904Nr_TipCsCL[0] ;
               AV44Nr_codigo = A5198Nr_codigo ;
               AV45Nr_opecod = A5906Nr_OpeCod ;
               AV106TipCSClq = A5904Nr_TipCsCL ;
               pr_default.readNext(16);
            }
            pr_default.close(16);
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(15);
         }
         pr_default.close(15);
         /* Using cursor P000G21 */
         pr_default.execute(17, new Object[] {AV15EmprCod, Integer.valueOf(AV16DisCod)});
         while ( (pr_default.getStatus(17) != 101) )
         {
            A319DefPor = P000G21_A319DefPor[0] ;
            A14357DefMaqcod = P000G21_A14357DefMaqcod[0] ;
            n14357DefMaqcod = P000G21_n14357DefMaqcod[0] ;
            A14358DefCausa = P000G21_A14358DefCausa[0] ;
            n14358DefCausa = P000G21_n14358DefCausa[0] ;
            A14359DefResp = P000G21_A14359DefResp[0] ;
            n14359DefResp = P000G21_n14359DefResp[0] ;
            A833TipDefCod = P000G21_A833TipDefCod[0] ;
            n833TipDefCod = P000G21_n833TipDefCod[0] ;
            A361DisCod = P000G21_A361DisCod[0] ;
            A396EmprCod = P000G21_A396EmprCod[0] ;
            A387DisPiePie = P000G21_A387DisPiePie[0] ;
            n387DisPiePie = P000G21_n387DisPiePie[0] ;
            A387DisPiePie = P000G21_A387DisPiePie[0] ;
            n387DisPiePie = P000G21_n387DisPiePie[0] ;
            W396EmprCod = A396EmprCod ;
            if ( AV44Nr_codigo > 0 )
            {
               AV80Num_fic = AV44Nr_codigo ;
            }
            /*
               INSERT RECORD ON TABLE TXPHISREO

            */
            W396EmprCod = A396EmprCod ;
            W833TipDefCod = A833TipDefCod ;
            n833TipDefCod = false ;
            W252CliCod = A252CliCod ;
            n252CliCod = false ;
            W602MaqCod = A602MaqCod ;
            n602MaqCod = false ;
            A396EmprCod = AV15EmprCod ;
            if ( (0==AV17ContVal) )
            {
               A539HisBarCod = AV16DisCod ;
            }
            else
            {
               A539HisBarCod = AV17ContVal ;
            }
            A545HisCodReo = (byte)(0) ;
            A544HisCodPar = " " ;
            n833TipDefCod = false ;
            A571HisTipArt = A352DisArtTip ;
            n571HisTipArt = false ;
            n252CliCod = false ;
            A542HisBarSer = A335DisArtCod ;
            n542HisBarSer = false ;
            A546HisColNom = A362DisColNom ;
            n546HisColNom = false ;
            A547HisColNum = A363DisColNum ;
            n547HisColNum = false ;
            A572HisTipCol = A390DisTipCol ;
            n572HisTipCol = false ;
            if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
            {
               A553HisNumPie = A387DisPiePie ;
               n553HisNumPie = false ;
            }
            else
            {
               A553HisNumPie = A386DisPieNor ;
               n553HisNumPie = false ;
            }
            A540HisBarKgm = A381DisPieKgm.multiply(DecimalUtil.doubleToDec(A319DefPor)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
            n540HisBarKgm = false ;
            A541HisBarMtr = A385DisPieMtr.multiply(DecimalUtil.doubleToDec(A319DefPor)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
            n541HisBarMtr = false ;
            A569HisReoFec = GXutil.today( ) ;
            n569HisReoFec = false ;
            A549HisKgmOri = A381DisPieKgm ;
            n549HisKgmOri = false ;
            A552HisMtrOri = A385DisPieMtr ;
            n552HisMtrOri = false ;
            A554HisOrdReo = (byte)(0) ;
            n554HisOrdReo = false ;
            A548HisEstReo = (byte)(2) ;
            n548HisEstReo = false ;
            A2297HisReoTn = AV80Num_fic ;
            n2297HisReoTn = false ;
            A2299HisReoDsc = A337DisArtDsc ;
            n2299HisReoDsc = false ;
            A5356Hisoperar = AV45Nr_opecod ;
            n5356Hisoperar = false ;
            A5085CodCausa = AV106TipCSClq ;
            n5085CodCausa = false ;
            A8889HisNomCli = A1195DisNomCli ;
            n8889HisNomCli = false ;
            A8890HisNumCli = A1196DisNumCli ;
            n8890HisNumCli = false ;
            A13698HisreoLote = " " ;
            n13698HisreoLote = false ;
            A602MaqCod = ((GXutil.strcmp("", A14357DefMaqcod)==0) ? " " : A14357DefMaqcod) ;
            n602MaqCod = false ;
            A5085CodCausa = ((A14358DefCausa>0) ? A14358DefCausa : AV106TipCSClq) ;
            n5085CodCausa = false ;
            A7000Rps_Cod = A14359DefResp ;
            n7000Rps_Cod = false ;
            /* Using cursor P000G22 */
            pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A539HisBarCod), Byte.valueOf(A545HisCodReo), A544HisCodPar, Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod), Boolean.valueOf(n571HisTipArt), Short.valueOf(A571HisTipArt), Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n542HisBarSer), A542HisBarSer, Boolean.valueOf(n546HisColNom), A546HisColNom, Boolean.valueOf(n547HisColNum), Integer.valueOf(A547HisColNum), Boolean.valueOf(n572HisTipCol), Byte.valueOf(A572HisTipCol), Boolean.valueOf(n553HisNumPie), Short.valueOf(A553HisNumPie), Boolean.valueOf(n540HisBarKgm), A540HisBarKgm, Boolean.valueOf(n541HisBarMtr), A541HisBarMtr, Boolean.valueOf(n602MaqCod), A602MaqCod, Boolean.valueOf(n569HisReoFec), A569HisReoFec, Boolean.valueOf(n549HisKgmOri), A549HisKgmOri, Boolean.valueOf(n552HisMtrOri), A552HisMtrOri, Boolean.valueOf(n554HisOrdReo), Byte.valueOf(A554HisOrdReo), Boolean.valueOf(n548HisEstReo), Byte.valueOf(A548HisEstReo), Boolean.valueOf(n2297HisReoTn), Integer.valueOf(A2297HisReoTn), Boolean.valueOf(n2299HisReoDsc), A2299HisReoDsc, Boolean.valueOf(n5085CodCausa), Short.valueOf(A5085CodCausa), Boolean.valueOf(n5356Hisoperar), Integer.valueOf(A5356Hisoperar), Boolean.valueOf(n7000Rps_Cod), Short.valueOf(A7000Rps_Cod), Boolean.valueOf(n8889HisNomCli), A8889HisNomCli, Boolean.valueOf(n8890HisNumCli), Integer.valueOf(A8890HisNumCli), Boolean.valueOf(n13698HisreoLote), A13698HisreoLote});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISREO");
            if ( (pr_default.getStatus(18) == 1) )
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
            A833TipDefCod = W833TipDefCod ;
            n833TipDefCod = false ;
            A252CliCod = W252CliCod ;
            n252CliCod = false ;
            A602MaqCod = W602MaqCod ;
            n602MaqCod = false ;
            /* End Insert */
            A396EmprCod = W396EmprCod ;
            pr_default.readNext(17);
         }
         pr_default.close(17);
         /* Using cursor P000G23 */
         pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         while ( (pr_default.getStatus(19) != 101) )
         {
            A13376DisTraID = P000G23_A13376DisTraID[0] ;
            W396EmprCod = A396EmprCod ;
            /*
               INSERT RECORD ON TABLE TXPBARTTI

            */
            W396EmprCod = A396EmprCod ;
            A129BarCod = AV30BarCod ;
            n129BarCod = false ;
            A132BarCodReo = (byte)(0) ;
            n132BarCodReo = false ;
            A130BarCodPar = " " ;
            n130BarCodPar = false ;
            A13905BarTraID = A13376DisTraID ;
            /* Using cursor P000G24 */
            pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, A13905BarTraID});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARTTI");
            if ( (pr_default.getStatus(20) == 1) )
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
            /* End Insert */
            A396EmprCod = W396EmprCod ;
            pr_default.readNext(19);
         }
         pr_default.close(19);
         /* Using cursor P000G25 */
         pr_default.execute(21, new Object[] {Byte.valueOf(A367DisEst), A396EmprCod, Integer.valueOf(A361DisCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
         A396EmprCod = W396EmprCod ;
         A361DisCod = W361DisCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV182Pgmname, AV37UsurCod, AV38Station, AV34Inc_obs, AV30BarCod, (byte)(0), "") ;
      /* Execute user subroutine: 'FIN' */
      S181 ();
      if (returnInSub) return;
   }

   public void S181( )
   {
      /* 'FIN' Routine */
      returnInSub = false ;
      if ( ( AV137Artextil.doubleValue() == 1 ) || ( AV157shablones == 1 ) )
      {
         /* Execute user subroutine: 'ARTEXTIL' */
         S191 ();
         if (returnInSub) return;
      }
   }

   public void S191( )
   {
      /* 'ARTEXTIL' Routine */
      returnInSub = false ;
      AV183GXLvl601 = (byte)(0) ;
      /* Using cursor P000G26 */
      pr_default.execute(22, new Object[] {AV15EmprCod, Integer.valueOf(AV16DisCod), Integer.valueOf(AV30BarCod)});
      while ( (pr_default.getStatus(22) != 101) )
      {
         brk0G23 = false ;
         A252CliCod = P000G26_A252CliCod[0] ;
         n252CliCod = P000G26_n252CliCod[0] ;
         A334DisArtAnh = P000G26_A334DisArtAnh[0] ;
         A1013DibCli = P000G26_A1013DibCli[0] ;
         n1013DibCli = P000G26_n1013DibCli[0] ;
         A1014DibInt = P000G26_A1014DibInt[0] ;
         n1014DibInt = P000G26_n1014DibInt[0] ;
         A130BarCodPar = P000G26_A130BarCodPar[0] ;
         n130BarCodPar = P000G26_n130BarCodPar[0] ;
         A132BarCodReo = P000G26_A132BarCodReo[0] ;
         n132BarCodReo = P000G26_n132BarCodReo[0] ;
         A129BarCod = P000G26_A129BarCod[0] ;
         n129BarCod = P000G26_n129BarCod[0] ;
         A361DisCod = P000G26_A361DisCod[0] ;
         A396EmprCod = P000G26_A396EmprCod[0] ;
         A6841DibDsc = P000G26_A6841DibDsc[0] ;
         n6841DibDsc = P000G26_n6841DibDsc[0] ;
         A3911TipMqnCod = P000G26_A3911TipMqnCod[0] ;
         n3911TipMqnCod = P000G26_n3911TipMqnCod[0] ;
         A1607DibMed = P000G26_A1607DibMed[0] ;
         n1607DibMed = P000G26_n1607DibMed[0] ;
         A1606DibTipRas = P000G26_A1606DibTipRas[0] ;
         n1606DibTipRas = P000G26_n1606DibTipRas[0] ;
         A7516DisGraTam = P000G26_A7516DisGraTam[0] ;
         n7516DisGraTam = P000G26_n7516DisGraTam[0] ;
         A2009DisTipDis = P000G26_A2009DisTipDis[0] ;
         n2009DisTipDis = P000G26_n2009DisTipDis[0] ;
         A7514DisOrdGra = P000G26_A7514DisOrdGra[0] ;
         A334DisArtAnh = P000G26_A334DisArtAnh[0] ;
         A1013DibCli = P000G26_A1013DibCli[0] ;
         n1013DibCli = P000G26_n1013DibCli[0] ;
         A1014DibInt = P000G26_A1014DibInt[0] ;
         n1014DibInt = P000G26_n1014DibInt[0] ;
         A7516DisGraTam = P000G26_A7516DisGraTam[0] ;
         n7516DisGraTam = P000G26_n7516DisGraTam[0] ;
         A2009DisTipDis = P000G26_A2009DisTipDis[0] ;
         n2009DisTipDis = P000G26_n2009DisTipDis[0] ;
         A7514DisOrdGra = P000G26_A7514DisOrdGra[0] ;
         A6841DibDsc = P000G26_A6841DibDsc[0] ;
         n6841DibDsc = P000G26_n6841DibDsc[0] ;
         A3911TipMqnCod = P000G26_A3911TipMqnCod[0] ;
         n3911TipMqnCod = P000G26_n3911TipMqnCod[0] ;
         A1607DibMed = P000G26_A1607DibMed[0] ;
         n1607DibMed = P000G26_n1607DibMed[0] ;
         A1606DibTipRas = P000G26_A1606DibTipRas[0] ;
         n1606DibTipRas = P000G26_n1606DibTipRas[0] ;
         if ( GXutil.strcmp(A2009DisTipDis, httpContext.getMessage( "S", "")) == 0 )
         {
            W129BarCod = A129BarCod ;
            n129BarCod = false ;
            AV183GXLvl601 = (byte)(1) ;
            while ( (pr_default.getStatus(22) != 101) && ( GXutil.strcmp(P000G26_A396EmprCod[0], A396EmprCod) == 0 ) && ( P000G26_A361DisCod[0] == A361DisCod ) && ( P000G26_A129BarCod[0] == A129BarCod ) && ( P000G26_A132BarCodReo[0] == A132BarCodReo ) )
            {
               if ( ! ( ( GXutil.strcmp(P000G26_A130BarCodPar[0], A130BarCodPar) == 0 ) ) )
               {
                  if (true) break;
               }
               brk0G23 = false ;
               A252CliCod = P000G26_A252CliCod[0] ;
               n252CliCod = P000G26_n252CliCod[0] ;
               A1013DibCli = P000G26_A1013DibCli[0] ;
               n1013DibCli = P000G26_n1013DibCli[0] ;
               A1014DibInt = P000G26_A1014DibInt[0] ;
               n1014DibInt = P000G26_n1014DibInt[0] ;
               A6841DibDsc = P000G26_A6841DibDsc[0] ;
               n6841DibDsc = P000G26_n6841DibDsc[0] ;
               A3911TipMqnCod = P000G26_A3911TipMqnCod[0] ;
               n3911TipMqnCod = P000G26_n3911TipMqnCod[0] ;
               A1607DibMed = P000G26_A1607DibMed[0] ;
               n1607DibMed = P000G26_n1607DibMed[0] ;
               A1606DibTipRas = P000G26_A1606DibTipRas[0] ;
               n1606DibTipRas = P000G26_n1606DibTipRas[0] ;
               A7516DisGraTam = P000G26_A7516DisGraTam[0] ;
               n7516DisGraTam = P000G26_n7516DisGraTam[0] ;
               A1013DibCli = P000G26_A1013DibCli[0] ;
               n1013DibCli = P000G26_n1013DibCli[0] ;
               A1014DibInt = P000G26_A1014DibInt[0] ;
               n1014DibInt = P000G26_n1014DibInt[0] ;
               A7516DisGraTam = P000G26_A7516DisGraTam[0] ;
               n7516DisGraTam = P000G26_n7516DisGraTam[0] ;
               A6841DibDsc = P000G26_A6841DibDsc[0] ;
               n6841DibDsc = P000G26_n6841DibDsc[0] ;
               A3911TipMqnCod = P000G26_A3911TipMqnCod[0] ;
               n3911TipMqnCod = P000G26_n3911TipMqnCod[0] ;
               A1607DibMed = P000G26_A1607DibMed[0] ;
               n1607DibMed = P000G26_n1607DibMed[0] ;
               A1606DibTipRas = P000G26_A1606DibTipRas[0] ;
               n1606DibTipRas = P000G26_n1606DibTipRas[0] ;
               AV46DibDsc = A6841DibDsc ;
               AV47TipMqnCod = A3911TipMqnCod ;
               AV48DibMed = A1607DibMed ;
               AV49DibTipRas = A1606DibTipRas ;
               AV50DisGraTam = A7516DisGraTam ;
               brk0G23 = true ;
               pr_default.readNext(22);
            }
            /*
               INSERT RECORD ON TABLE TXPShaGra

            */
            W129BarCod = A129BarCod ;
            n129BarCod = false ;
            W132BarCodReo = A132BarCodReo ;
            n132BarCodReo = false ;
            W130BarCodPar = A130BarCodPar ;
            n130BarCodPar = false ;
            GXt_int16 = A7049OGSCod ;
            GXv_int11[0] = GXt_int16 ;
            new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ORGRSH", ""), GXv_int11) ;
            pgenbarm.this.GXt_int16 = GXv_int11[0] ;
            A7049OGSCod = GXt_int16 ;
            A7050OGSEst = httpContext.getMessage( "N", "") ;
            n7050OGSEst = false ;
            A7051OGSUsuCre = AV37UsurCod ;
            n7051OGSUsuCre = false ;
            A7052OGSFchCre = GXutil.now( ) ;
            n7052OGSFchCre = false ;
            A7054OGSFchRea = GXutil.resetTime( GXutil.nullDate() );
            n7054OGSFchRea = false ;
            AV51OGSObs = "" ;
            /* Execute user subroutine: 'OBS' */
            S2025 ();
            if ( returnInSub )
            {
               pr_default.close(22);
               pr_default.close(22);
               pr_default.close(22);
               returnInSub = true;
               if (true) return;
            }
            A7055OGSObs = AV51OGSObs ;
            n7055OGSObs = false ;
            n129BarCod = false ;
            n132BarCodReo = false ;
            n130BarCodPar = false ;
            A7521OGSDsc = AV46DibDsc ;
            n7521OGSDsc = false ;
            A7519OGSMaq = AV47TipMqnCod ;
            n7519OGSMaq = false ;
            A7520OGSSeg = AV49DibTipRas ;
            n7520OGSSeg = false ;
            A7141OGSAnc = DecimalUtil.doubleToDec(A334DisArtAnh/ (double) (100)) ;
            n7141OGSAnc = false ;
            A7522OGSTam = AV50DisGraTam ;
            n7522OGSTam = false ;
            A10885OGSDibC = A1013DibCli ;
            n10885OGSDibC = false ;
            A10886OGSDibI = A1014DibInt ;
            n10886OGSDibI = false ;
            /* Using cursor P000G27 */
            pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A7049OGSCod), Boolean.valueOf(n7050OGSEst), A7050OGSEst, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n7051OGSUsuCre), A7051OGSUsuCre, Boolean.valueOf(n7052OGSFchCre), A7052OGSFchCre, Boolean.valueOf(n7054OGSFchRea), A7054OGSFchRea, Boolean.valueOf(n7055OGSObs), A7055OGSObs, Boolean.valueOf(n7141OGSAnc), A7141OGSAnc, Boolean.valueOf(n7519OGSMaq), Byte.valueOf(A7519OGSMaq), Boolean.valueOf(n7520OGSSeg), A7520OGSSeg, Boolean.valueOf(n7521OGSDsc), A7521OGSDsc, Boolean.valueOf(n7522OGSTam), A7522OGSTam, Boolean.valueOf(n10885OGSDibC), A10885OGSDibC, Boolean.valueOf(n10886OGSDibI), Integer.valueOf(A10886OGSDibI)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPShaGra");
            if ( (pr_default.getStatus(23) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
               System.out.println( httpContext.getMessage( "Orden de Grabación duplicada", "") );
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            A129BarCod = W129BarCod ;
            n129BarCod = false ;
            A132BarCodReo = W132BarCodReo ;
            n132BarCodReo = false ;
            A130BarCodPar = W130BarCodPar ;
            n130BarCodPar = false ;
            /* End Insert */
            A129BarCod = W129BarCod ;
            n129BarCod = false ;
         }
         if ( ! brk0G23 )
         {
            brk0G23 = true ;
            pr_default.readNext(22);
         }
      }
      pr_default.close(22);
      if ( AV183GXLvl601 == 0 )
      {
         /* Using cursor P000G28 */
         pr_default.execute(24, new Object[] {AV15EmprCod, Integer.valueOf(AV16DisCod)});
         while ( (pr_default.getStatus(24) != 101) )
         {
            A7514DisOrdGra = P000G28_A7514DisOrdGra[0] ;
            A361DisCod = P000G28_A361DisCod[0] ;
            A396EmprCod = P000G28_A396EmprCod[0] ;
            System.out.println( httpContext.getMessage( "Se solicito la Orden de Grabación, pero no puede ser realizada.", "") );
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(24);
      }
      AV186GXLvl650 = (byte)(0) ;
      /* Using cursor P000G29 */
      pr_default.execute(25, new Object[] {AV15EmprCod, Integer.valueOf(AV16DisCod), Integer.valueOf(AV30BarCod)});
      while ( (pr_default.getStatus(25) != 101) )
      {
         A334DisArtAnh = P000G29_A334DisArtAnh[0] ;
         A7511DisFacSep = P000G29_A7511DisFacSep[0] ;
         n7511DisFacSep = P000G29_n7511DisFacSep[0] ;
         A130BarCodPar = P000G29_A130BarCodPar[0] ;
         n130BarCodPar = P000G29_n130BarCodPar[0] ;
         A132BarCodReo = P000G29_A132BarCodReo[0] ;
         n132BarCodReo = P000G29_n132BarCodReo[0] ;
         A129BarCod = P000G29_A129BarCod[0] ;
         n129BarCod = P000G29_n129BarCod[0] ;
         A396EmprCod = P000G29_A396EmprCod[0] ;
         A2009DisTipDis = P000G29_A2009DisTipDis[0] ;
         n2009DisTipDis = P000G29_n2009DisTipDis[0] ;
         A7513DisOrdSep = P000G29_A7513DisOrdSep[0] ;
         A361DisCod = P000G29_A361DisCod[0] ;
         A334DisArtAnh = P000G29_A334DisArtAnh[0] ;
         A7511DisFacSep = P000G29_A7511DisFacSep[0] ;
         n7511DisFacSep = P000G29_n7511DisFacSep[0] ;
         A2009DisTipDis = P000G29_A2009DisTipDis[0] ;
         n2009DisTipDis = P000G29_n2009DisTipDis[0] ;
         A7513DisOrdSep = P000G29_A7513DisOrdSep[0] ;
         if ( GXutil.strcmp(A2009DisTipDis, httpContext.getMessage( "S", "")) == 0 )
         {
            W129BarCod = A129BarCod ;
            n129BarCod = false ;
            AV186GXLvl650 = (byte)(1) ;
            /*
               INSERT RECORD ON TABLE TXPShaSep

            */
            W129BarCod = A129BarCod ;
            n129BarCod = false ;
            W132BarCodReo = A132BarCodReo ;
            n132BarCodReo = false ;
            W130BarCodPar = A130BarCodPar ;
            n130BarCodPar = false ;
            GXt_int16 = A7145OSSCod ;
            GXv_int11[0] = GXt_int16 ;
            new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ORSESH", ""), GXv_int11) ;
            pgenbarm.this.GXt_int16 = GXv_int11[0] ;
            A7145OSSCod = GXt_int16 ;
            A7146OSSEst = httpContext.getMessage( "N", "") ;
            n7146OSSEst = false ;
            A7147OSSUsuCre = AV37UsurCod ;
            n7147OSSUsuCre = false ;
            A7148OSSFchCre = GXutil.now( ) ;
            n7148OSSFchCre = false ;
            A7150OSSFchRea = GXutil.resetTime( GXutil.nullDate() );
            n7150OSSFchRea = false ;
            AV52OSSObs = "" ;
            /* Execute user subroutine: 'OBS2' */
            S2128 ();
            if ( returnInSub )
            {
               pr_default.close(25);
               pr_default.close(25);
               returnInSub = true;
               if (true) return;
            }
            A7158OSSObs = AV52OSSObs ;
            n7158OSSObs = false ;
            n129BarCod = false ;
            n132BarCodReo = false ;
            n130BarCodPar = false ;
            A7151OSSAnc = DecimalUtil.doubleToDec(A334DisArtAnh/ (double) (1000)) ;
            n7151OSSAnc = false ;
            A7152OSSFac = ((A7511DisFacSep==1) ? httpContext.getMessage( "S", "") : httpContext.getMessage( "N", "")) ;
            n7152OSSFac = false ;
            /* Using cursor P000G30 */
            pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A7145OSSCod), Boolean.valueOf(n7146OSSEst), A7146OSSEst, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n7147OSSUsuCre), A7147OSSUsuCre, Boolean.valueOf(n7148OSSFchCre), A7148OSSFchCre, Boolean.valueOf(n7150OSSFchRea), A7150OSSFchRea, Boolean.valueOf(n7151OSSAnc), A7151OSSAnc, Boolean.valueOf(n7152OSSFac), A7152OSSFac, Boolean.valueOf(n7158OSSObs), A7158OSSObs});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPShaSep");
            if ( (pr_default.getStatus(26) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
               System.out.println( httpContext.getMessage( "Orden de Separación duplicada", "") );
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            A129BarCod = W129BarCod ;
            n129BarCod = false ;
            A132BarCodReo = W132BarCodReo ;
            n132BarCodReo = false ;
            A130BarCodPar = W130BarCodPar ;
            n130BarCodPar = false ;
            /* End Insert */
            A129BarCod = W129BarCod ;
            n129BarCod = false ;
         }
         pr_default.readNext(25);
      }
      pr_default.close(25);
      if ( AV186GXLvl650 == 0 )
      {
         /* Using cursor P000G31 */
         pr_default.execute(27, new Object[] {AV15EmprCod, Integer.valueOf(AV16DisCod)});
         while ( (pr_default.getStatus(27) != 101) )
         {
            A7513DisOrdSep = P000G31_A7513DisOrdSep[0] ;
            A361DisCod = P000G31_A361DisCod[0] ;
            A396EmprCod = P000G31_A396EmprCod[0] ;
            System.out.println( httpContext.getMessage( "Se solicito la Orden de Separación, pero no puede ser realizada.", "") );
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(27);
      }
      if ( AV157shablones == 0 )
      {
         /* Using cursor P000G32 */
         pr_default.execute(28, new Object[] {AV15EmprCod, Integer.valueOf(AV16DisCod)});
         while ( (pr_default.getStatus(28) != 101) )
         {
            A361DisCod = P000G32_A361DisCod[0] ;
            A396EmprCod = P000G32_A396EmprCod[0] ;
            A1196DisNumCli = P000G32_A1196DisNumCli[0] ;
            A1195DisNomCli = P000G32_A1195DisNomCli[0] ;
            A390DisTipCol = P000G32_A390DisTipCol[0] ;
            n390DisTipCol = P000G32_n390DisTipCol[0] ;
            A363DisColNum = P000G32_A363DisColNum[0] ;
            n363DisColNum = P000G32_n363DisColNum[0] ;
            A362DisColNom = P000G32_A362DisColNom[0] ;
            n362DisColNom = P000G32_n362DisColNom[0] ;
            A335DisArtCod = P000G32_A335DisArtCod[0] ;
            A252CliCod = P000G32_A252CliCod[0] ;
            n252CliCod = P000G32_n252CliCod[0] ;
            GXt_int17 = AV138ArtValPrd ;
            GXv_char5[0] = A396EmprCod ;
            GXv_int11[0] = A252CliCod ;
            GXv_char4[0] = A335DisArtCod ;
            GXv_char2[0] = A362DisColNom ;
            GXv_int10[0] = A363DisColNum ;
            GXv_int9[0] = A390DisTipCol ;
            GXv_char18[0] = A1195DisNomCli ;
            GXv_int6[0] = A1196DisNumCli ;
            GXv_int7[0] = GXt_int17 ;
            new app.partvalp(remoteHandle, context).execute( GXv_char5, GXv_int11, GXv_char4, GXv_char2, GXv_int10, GXv_int9, GXv_char18, GXv_int6, GXv_int7) ;
            pgenbarm.this.A396EmprCod = GXv_char5[0] ;
            pgenbarm.this.A252CliCod = GXv_int11[0] ;
            pgenbarm.this.A335DisArtCod = GXv_char4[0] ;
            pgenbarm.this.A362DisColNom = GXv_char2[0] ;
            pgenbarm.this.A363DisColNum = GXv_int10[0] ;
            pgenbarm.this.A390DisTipCol = GXv_int9[0] ;
            pgenbarm.this.A1195DisNomCli = GXv_char18[0] ;
            pgenbarm.this.A1196DisNumCli = GXv_int6[0] ;
            pgenbarm.this.GXt_int17 = GXv_int7[0] ;
            AV138ArtValPrd = GXt_int17 ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(28);
         /* Using cursor P000G33 */
         pr_default.execute(29, new Object[] {AV15EmprCod, Integer.valueOf(AV16DisCod), Integer.valueOf(AV30BarCod), Byte.valueOf(AV138ArtValPrd)});
         while ( (pr_default.getStatus(29) != 101) )
         {
            A213BarSit = P000G33_A213BarSit[0] ;
            A130BarCodPar = P000G33_A130BarCodPar[0] ;
            n130BarCodPar = P000G33_n130BarCodPar[0] ;
            A132BarCodReo = P000G33_A132BarCodReo[0] ;
            n132BarCodReo = P000G33_n132BarCodReo[0] ;
            A129BarCod = P000G33_A129BarCod[0] ;
            n129BarCod = P000G33_n129BarCod[0] ;
            A7515DisDesCol = P000G33_A7515DisDesCol[0] ;
            n7515DisDesCol = P000G33_n7515DisDesCol[0] ;
            A361DisCod = P000G33_A361DisCod[0] ;
            A396EmprCod = P000G33_A396EmprCod[0] ;
            A7515DisDesCol = P000G33_A7515DisDesCol[0] ;
            n7515DisDesCol = P000G33_n7515DisDesCol[0] ;
            A213BarSit = (byte)(3) ;
            /* Using cursor P000G34 */
            pr_default.execute(30, new Object[] {Byte.valueOf(A213BarSit), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
            pr_default.readNext(29);
         }
         pr_default.close(29);
      }
   }

   public void S172( )
   {
      /* 'STKINT' Routine */
      returnInSub = false ;
      AV190GXLvl714 = (byte)(0) ;
      /* Using cursor P000G35 */
      pr_default.execute(31, new Object[] {AV15EmprCod, Integer.valueOf(AV16DisCod)});
      while ( (pr_default.getStatus(31) != 101) )
      {
         A3608DisRefAlbR = P000G35_A3608DisRefAlbR[0] ;
         n3608DisRefAlbR = P000G35_n3608DisRefAlbR[0] ;
         A3401DisRefKgs = P000G35_A3401DisRefKgs[0] ;
         n3401DisRefKgs = P000G35_n3401DisRefKgs[0] ;
         A3402DisRefMts = P000G35_A3402DisRefMts[0] ;
         n3402DisRefMts = P000G35_n3402DisRefMts[0] ;
         A3403DisRefPie = P000G35_A3403DisRefPie[0] ;
         n3403DisRefPie = P000G35_n3403DisRefPie[0] ;
         A361DisCod = P000G35_A361DisCod[0] ;
         A396EmprCod = P000G35_A396EmprCod[0] ;
         A5861DisRefPzII = P000G35_A5861DisRefPzII[0] ;
         n5861DisRefPzII = P000G35_n5861DisRefPzII[0] ;
         A3398DisRefBarC = P000G35_A3398DisRefBarC[0] ;
         A3399DisRefBCRe = P000G35_A3399DisRefBCRe[0] ;
         A3400DisRefBCPa = P000G35_A3400DisRefBCPa[0] ;
         A3607DisRefBPie = P000G35_A3607DisRefBPie[0] ;
         W396EmprCod = A396EmprCod ;
         AV190GXLvl714 = (byte)(1) ;
         AV102HRStkInt = httpContext.getMessage( "S", "") ;
         AV104DupliPz = httpContext.getMessage( "S", "") ;
         AV53DisRefAlbR = A3608DisRefAlbR ;
         while ( GXutil.strcmp(AV104DupliPz, httpContext.getMessage( "S", "")) == 0 )
         {
            AV104DupliPz = httpContext.getMessage( "N", "") ;
            /*
               INSERT RECORD ON TABLE TXPBARPIE

            */
            W396EmprCod = A396EmprCod ;
            A396EmprCod = AV15EmprCod ;
            A129BarCod = AV30BarCod ;
            n129BarCod = false ;
            A132BarCodReo = (byte)(0) ;
            n132BarCodReo = false ;
            A130BarCodPar = " " ;
            n130BarCodPar = false ;
            A200BarPieCod = GXutil.str( AV53DisRefAlbR, 8, 0) ;
            A44AlbRecCod = A3608DisRefAlbR ;
            A203BarPieKil = A3401DisRefKgs ;
            A205BarPieMet = A3402DisRefMts ;
            A1501BarPiePie = A3403DisRefPie ;
            A201BarPieEst = (byte)(0) ;
            A13988BarPieVtx = " " ;
            /* Using cursor P000G36 */
            pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, A200BarPieCod, Integer.valueOf(A44AlbRecCod), A203BarPieKil, A205BarPieMet, Byte.valueOf(A201BarPieEst), Integer.valueOf(A1501BarPiePie), A13988BarPieVtx});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
            if ( (pr_default.getStatus(32) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
               AV104DupliPz = httpContext.getMessage( "S", "") ;
               AV53DisRefAlbR = (int)(AV53DisRefAlbR+1) ;
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            A396EmprCod = W396EmprCod ;
            /* End Insert */
         }
         A5861DisRefPzII = GXutil.str( AV53DisRefAlbR, 8, 0) ;
         n5861DisRefPzII = false ;
         AV71TotKil = AV71TotKil.add(A3401DisRefKgs) ;
         AV72TotMet = AV72TotMet.add(A3402DisRefMts) ;
         if ( AV81F_nr == 1 )
         {
            GXv_char18[0] = AV15EmprCod ;
            GXv_int11[0] = A3608DisRefAlbR ;
            GXv_int10[0] = AV30BarCod ;
            GXv_int9[0] = (byte)(0) ;
            GXv_char5[0] = " " ;
            GXv_int6[0] = AV16DisCod ;
            new app.phdrnr(remoteHandle, context).execute( GXv_char18, GXv_int11, GXv_int10, GXv_int9, GXv_char5, GXv_int6) ;
            pgenbarm.this.AV15EmprCod = GXv_char18[0] ;
            pgenbarm.this.A3608DisRefAlbR = GXv_int11[0] ;
            pgenbarm.this.AV30BarCod = GXv_int10[0] ;
            pgenbarm.this.AV16DisCod = GXv_int6[0] ;
         }
         /* Using cursor P000G37 */
         pr_default.execute(33, new Object[] {Boolean.valueOf(n5861DisRefPzII), A5861DisRefPzII, A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A3398DisRefBarC), Byte.valueOf(A3399DisRefBCRe), A3400DisRefBCPa, A3607DisRefBPie});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISREF");
         A396EmprCod = W396EmprCod ;
         pr_default.readNext(31);
      }
      pr_default.close(31);
      if ( AV190GXLvl714 == 0 )
      {
         AV102HRStkInt = httpContext.getMessage( "N", "") ;
      }
   }

   public void S152( )
   {
      /* 'TIPARTRB' Routine */
      returnInSub = false ;
      AV54TIPARTRB = DecimalUtil.doubleToDec(0) ;
      AV55TipArtVmn = 0 ;
      AV56TipArtVmx = 0 ;
      /* Using cursor P000G38 */
      pr_default.execute(34, new Object[] {AV15EmprCod, Short.valueOf(AV29DisArtTip), AV32MaqCod});
      while ( (pr_default.getStatus(34) != 101) )
      {
         A602MaqCod = P000G38_A602MaqCod[0] ;
         n602MaqCod = P000G38_n602MaqCod[0] ;
         A6188MaqTArt = P000G38_A6188MaqTArt[0] ;
         A396EmprCod = P000G38_A396EmprCod[0] ;
         A6190TipArtRb = P000G38_A6190TipArtRb[0] ;
         n6190TipArtRb = P000G38_n6190TipArtRb[0] ;
         A6233TipArtVmn = P000G38_A6233TipArtVmn[0] ;
         n6233TipArtVmn = P000G38_n6233TipArtVmn[0] ;
         A6234TipArtVmx = P000G38_A6234TipArtVmx[0] ;
         n6234TipArtVmx = P000G38_n6234TipArtVmx[0] ;
         AV54TIPARTRB = A6190TipArtRb ;
         AV55TipArtVmn = A6233TipArtVmn ;
         AV56TipArtVmx = A6234TipArtVmx ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(34);
   }

   public void S162( )
   {
      /* 'LMACRO' Routine */
      returnInSub = false ;
      /* Using cursor P000G39 */
      pr_default.execute(35, new Object[] {AV15EmprCod, Integer.valueOf(AV16DisCod)});
      while ( (pr_default.getStatus(35) != 101) )
      {
         A1202MacDisCod = P000G39_A1202MacDisCod[0] ;
         A396EmprCod = P000G39_A396EmprCod[0] ;
         A1203MacBarCod = P000G39_A1203MacBarCod[0] ;
         A1204MacBarReo = P000G39_A1204MacBarReo[0] ;
         A1205MacBarPar = P000G39_A1205MacBarPar[0] ;
         A1199MacCod = P000G39_A1199MacCod[0] ;
         A1201MacLin = P000G39_A1201MacLin[0] ;
         A1203MacBarCod = AV31BarCodPar ;
         A1204MacBarReo = (byte)(0) ;
         A1205MacBarPar = " " ;
         AV34Inc_obs += httpContext.getMessage( "Accesorios.Actualizo HDR, Nº ", "") + GXutil.str( A1199MacCod, 8, 0) + GXutil.newLine( ) ;
         AV34Inc_obs += httpContext.getMessage( "N Disp Interna ", "") + GXutil.str( AV16DisCod, 8, 0) + GXutil.newLine( ) ;
         AV34Inc_obs += httpContext.getMessage( "Hdr            ", "") + GXutil.str( AV31BarCodPar, 8, 0) + GXutil.newLine( ) ;
         /* Using cursor P000G40 */
         pr_default.execute(36, new Object[] {Integer.valueOf(A1203MacBarCod), Byte.valueOf(A1204MacBarReo), A1205MacBarPar, A396EmprCod, Integer.valueOf(A1199MacCod), Short.valueOf(A1201MacLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMACRO");
         pr_default.readNext(35);
      }
      pr_default.close(35);
   }

   public void S121( )
   {
      /* 'LECTURAS' Routine */
      returnInSub = false ;
      GXt_char1 = AV38Station ;
      GXv_char18[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char18) ;
      pgenbarm.this.GXt_char1 = GXv_char18[0] ;
      AV38Station = GXt_char1 ;
      GXt_int17 = AV115PLinea ;
      GXv_int9[0] = GXt_int17 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "PLINEA", ""), GXv_int9) ;
      pgenbarm.this.GXt_int17 = GXv_int9[0] ;
      AV115PLinea = GXt_int17 ;
      GXt_int17 = AV120Salayet ;
      GXv_int9[0] = GXt_int17 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "SALAYE", ""), GXv_int9) ;
      pgenbarm.this.GXt_int17 = GXv_int9[0] ;
      AV120Salayet = GXt_int17 ;
      if ( ( AV115PLinea == 1 ) || ( AV120Salayet == 1 ) )
      {
         GXv_char18[0] = AV38Station ;
         GXv_char5[0] = AV37UsurCod ;
         new app.pleousu(remoteHandle, context).execute( GXv_char18, GXv_char5) ;
         pgenbarm.this.AV38Station = GXv_char18[0] ;
         pgenbarm.this.AV37UsurCod = GXv_char5[0] ;
      }
      else
      {
         GXv_char18[0] = AV15EmprCod ;
         GXv_char5[0] = AV57EmprNom ;
         GXv_char4[0] = AV37UsurCod ;
         new app.pbusemp(remoteHandle, context).execute( AV38Station, GXv_char18, GXv_char5, GXv_char4) ;
         pgenbarm.this.AV15EmprCod = GXv_char18[0] ;
         pgenbarm.this.AV57EmprNom = GXv_char5[0] ;
         pgenbarm.this.AV37UsurCod = GXv_char4[0] ;
      }
      GXv_int9[0] = AV130Pizarro ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "PIZARR", ""), GXv_int9) ;
      pgenbarm.this.AV130Pizarro = GXv_int9[0] ;
      GXv_int9[0] = AV78FlagVTab ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "CTRUSE", ""), GXv_int9) ;
      pgenbarm.this.AV78FlagVTab = GXv_int9[0] ;
      GXv_int9[0] = AV18Flag ;
      new app.popcion(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "10207E", ""), GXv_int9) ;
      pgenbarm.this.AV18Flag = GXv_int9[0] ;
      GXv_int9[0] = AV76FlagPer ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "PERTEX", ""), GXv_int9) ;
      pgenbarm.this.AV76FlagPer = GXv_int9[0] ;
      GXt_int17 = AV132Tejido ;
      GXv_int9[0] = GXt_int17 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "TEJIDO", ""), GXv_int9) ;
      pgenbarm.this.GXt_int17 = GXv_int9[0] ;
      AV132Tejido = GXt_int17 ;
      GXv_int9[0] = AV79VERTI3 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "VERTI3", ""), GXv_int9) ;
      pgenbarm.this.AV79VERTI3 = GXv_int9[0] ;
      GXt_int17 = AV133Suprema ;
      GXv_int9[0] = GXt_int17 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "SUPREM", ""), GXv_int9) ;
      pgenbarm.this.GXt_int17 = GXv_int9[0] ;
      AV133Suprema = GXt_int17 ;
      GXt_int17 = AV81F_nr ;
      GXv_int9[0] = GXt_int17 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "NOTREC", ""), GXv_int9) ;
      pgenbarm.this.GXt_int17 = GXv_int9[0] ;
      AV81F_nr = GXt_int17 ;
      AV82Hidro = (byte)(0) ;
      GXv_int9[0] = AV82Hidro ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "HIDRO", ""), GXv_int9) ;
      pgenbarm.this.AV82Hidro = GXv_int9[0] ;
      AV83Fidel = (byte)(0) ;
      GXv_int9[0] = AV83Fidel ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "FIDEL", ""), GXv_int9) ;
      pgenbarm.this.AV83Fidel = GXv_int9[0] ;
      AV87F_carvema = (byte)(0) ;
      GXv_int9[0] = AV87F_carvema ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "CARVEM", ""), GXv_int9) ;
      pgenbarm.this.AV87F_carvema = GXv_int9[0] ;
      GXv_int9[0] = AV90F_pais ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, "100001", GXv_int9) ;
      pgenbarm.this.AV90F_pais = GXv_int9[0] ;
      GXt_int17 = AV128CtrlUsu ;
      GXv_int9[0] = GXt_int17 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "CRTLOS", ""), GXv_int9) ;
      pgenbarm.this.GXt_int17 = GXv_int9[0] ;
      AV128CtrlUsu = GXt_int17 ;
      GXt_int17 = AV91TintSN ;
      GXv_int9[0] = GXt_int17 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "TINTSN", ""), GXv_int9) ;
      pgenbarm.this.GXt_int17 = GXv_int9[0] ;
      AV91TintSN = GXt_int17 ;
      GXv_int9[0] = AV92F_lavand ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "LAVAND", ""), GXv_int9) ;
      pgenbarm.this.AV92F_lavand = GXv_int9[0] ;
      GXv_int9[0] = AV94F_moda21 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int9) ;
      pgenbarm.this.AV94F_moda21 = GXv_int9[0] ;
      GXv_int11[0] = AV96AlaCol ;
      new app.pbuscon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "ALACOL", ""), GXv_int11) ;
      pgenbarm.this.AV96AlaCol = (short)((short)(GXv_int11[0])) ;
      GXt_int17 = AV98F_tinamar ;
      GXv_int9[0] = GXt_int17 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "TINAMA", ""), GXv_int9) ;
      pgenbarm.this.GXt_int17 = GXv_int9[0] ;
      AV98F_tinamar = GXt_int17 ;
      GXt_int17 = AV103VERTIC ;
      GXv_int9[0] = GXt_int17 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "VERTIC", ""), GXv_int9) ;
      pgenbarm.this.GXt_int17 = GXv_int9[0] ;
      AV103VERTIC = GXt_int17 ;
      GXt_int17 = AV105Vtabuas ;
      GXv_int9[0] = GXt_int17 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "VTABUA", ""), GXv_int9) ;
      pgenbarm.this.GXt_int17 = GXv_int9[0] ;
      AV105Vtabuas = GXt_int17 ;
      GXt_int17 = AV112Vincolor ;
      GXv_int9[0] = GXt_int17 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "VINCOL", ""), GXv_int9) ;
      pgenbarm.this.GXt_int17 = GXv_int9[0] ;
      AV112Vincolor = GXt_int17 ;
      GXt_int17 = AV123FlagTint ;
      GXv_int9[0] = GXt_int17 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "TINTUT", ""), GXv_int9) ;
      pgenbarm.this.GXt_int17 = GXv_int9[0] ;
      AV123FlagTint = GXt_int17 ;
      GXt_int17 = AV125Kohler ;
      GXv_int9[0] = GXt_int17 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "KOHLER", ""), GXv_int9) ;
      pgenbarm.this.GXt_int17 = GXv_int9[0] ;
      AV125Kohler = GXt_int17 ;
      GXt_int17 = AV129Staack ;
      GXv_int9[0] = GXt_int17 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "STAACK", ""), GXv_int9) ;
      pgenbarm.this.GXt_int17 = GXv_int9[0] ;
      AV129Staack = GXt_int17 ;
      GXt_int17 = AV131Sequeiro ;
      GXv_int9[0] = GXt_int17 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "SEQUEI", ""), GXv_int9) ;
      pgenbarm.this.GXt_int17 = GXv_int9[0] ;
      AV131Sequeiro = GXt_int17 ;
      GXt_int17 = AV136Magosa ;
      GXv_int9[0] = GXt_int17 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "MAGOSA", ""), GXv_int9) ;
      pgenbarm.this.GXt_int17 = GXv_int9[0] ;
      AV136Magosa = GXt_int17 ;
      GXt_int17 = (byte)(DecimalUtil.decToDouble(AV137Artextil)) ;
      GXv_int9[0] = GXt_int17 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "ARTEXT", ""), GXv_int9) ;
      pgenbarm.this.GXt_int17 = GXv_int9[0] ;
      AV137Artextil = DecimalUtil.doubleToDec(GXt_int17) ;
      GXv_char18[0] = AV15EmprCod ;
      GXv_int11[0] = AV16DisCod ;
      GXv_char5[0] = AV32MaqCod ;
      GXv_int10[0] = AV58maqVolMax ;
      GXv_int6[0] = AV59MaqVolMin ;
      GXv_int3[0] = AV33MaqVolMed ;
      GXv_decimal12[0] = AV127Kgs ;
      new app.pmqvokg(remoteHandle, context).execute( GXv_char18, GXv_int11, GXv_char5, GXv_int10, GXv_int6, GXv_int3, GXv_decimal12) ;
      pgenbarm.this.AV15EmprCod = GXv_char18[0] ;
      pgenbarm.this.AV16DisCod = GXv_int11[0] ;
      pgenbarm.this.AV32MaqCod = GXv_char5[0] ;
      pgenbarm.this.AV58maqVolMax = GXv_int10[0] ;
      pgenbarm.this.AV59MaqVolMin = GXv_int6[0] ;
      pgenbarm.this.AV33MaqVolMed = GXv_int3[0] ;
      pgenbarm.this.AV127Kgs = GXv_decimal12[0] ;
      GXt_int17 = AV139Eliot ;
      GXv_int9[0] = GXt_int17 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "ELIOT", ""), GXv_int9) ;
      pgenbarm.this.GXt_int17 = GXv_int9[0] ;
      AV139Eliot = GXt_int17 ;
      GXv_int9[0] = AV141Cladd ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "CLADD", ""), GXv_int9) ;
      pgenbarm.this.AV141Cladd = GXv_int9[0] ;
      GXt_int17 = AV142Coloretto ;
      GXv_int9[0] = GXt_int17 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "COLORT", ""), GXv_int9) ;
      pgenbarm.this.GXt_int17 = GXv_int9[0] ;
      AV142Coloretto = GXt_int17 ;
      GXt_int17 = AV143Prec_uni ;
      GXv_int9[0] = GXt_int17 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "PREUNI", ""), GXv_int9) ;
      pgenbarm.this.GXt_int17 = GXv_int9[0] ;
      AV143Prec_uni = GXt_int17 ;
      GXt_int17 = AV144erfoc ;
      GXv_int9[0] = GXt_int17 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "ERFOC", ""), GXv_int9) ;
      pgenbarm.this.GXt_int17 = GXv_int9[0] ;
      AV144erfoc = GXt_int17 ;
      GXt_int17 = AV148StkInt ;
      GXv_int9[0] = GXt_int17 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "INTSTK", ""), GXv_int9) ;
      pgenbarm.this.GXt_int17 = GXv_int9[0] ;
      AV148StkInt = GXt_int17 ;
      GXt_int17 = AV149Tintex ;
      GXv_int9[0] = GXt_int17 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "TINTEX", ""), GXv_int9) ;
      pgenbarm.this.GXt_int17 = GXv_int9[0] ;
      AV149Tintex = GXt_int17 ;
      GXt_int17 = AV153Moda21 ;
      GXv_int9[0] = GXt_int17 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int9) ;
      pgenbarm.this.GXt_int17 = GXv_int9[0] ;
      AV153Moda21 = GXt_int17 ;
      GXt_int17 = AV154SinCrudo ;
      GXv_int9[0] = GXt_int17 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "SCRUDO", ""), GXv_int9) ;
      pgenbarm.this.GXt_int17 = GXv_int9[0] ;
      AV154SinCrudo = GXt_int17 ;
      GXt_int17 = AV155WorkNotas ;
      GXv_int9[0] = GXt_int17 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "WWNOTA", ""), GXv_int9) ;
      pgenbarm.this.GXt_int17 = GXv_int9[0] ;
      AV155WorkNotas = GXt_int17 ;
      GXt_int17 = AV156Tintutex ;
      GXv_int9[0] = GXt_int17 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "TINTUT", ""), GXv_int9) ;
      pgenbarm.this.GXt_int17 = GXv_int9[0] ;
      AV156Tintutex = GXt_int17 ;
      GXt_int17 = AV157shablones ;
      GXv_int9[0] = GXt_int17 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "SHABLO", ""), GXv_int9) ;
      pgenbarm.this.GXt_int17 = GXv_int9[0] ;
      AV157shablones = GXt_int17 ;
      GXt_int17 = AV158Exportar ;
      GXv_int9[0] = GXt_int17 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "EXPENC", ""), GXv_int9) ;
      pgenbarm.this.GXt_int17 = GXv_int9[0] ;
      AV158Exportar = GXt_int17 ;
      GXt_int17 = AV159DatosArticulo ;
      GXv_int9[0] = GXt_int17 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "DATART", ""), GXv_int9) ;
      pgenbarm.this.GXt_int17 = GXv_int9[0] ;
      AV159DatosArticulo = GXt_int17 ;
      GXt_int17 = AV160anahuac ;
      GXv_int9[0] = GXt_int17 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "ANAHUA", ""), GXv_int9) ;
      pgenbarm.this.GXt_int17 = GXv_int9[0] ;
      AV160anahuac = GXt_int17 ;
      GXt_int17 = (byte)(AV165fabricato) ;
      GXv_int9[0] = GXt_int17 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "FABRIC", ""), GXv_int9) ;
      pgenbarm.this.GXt_int17 = GXv_int9[0] ;
      AV165fabricato = GXt_int17 ;
      GXt_int17 = (byte)(AV163endutex) ;
      GXv_int9[0] = GXt_int17 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "ENDTEX", ""), GXv_int9) ;
      pgenbarm.this.GXt_int17 = GXv_int9[0] ;
      AV163endutex = GXt_int17 ;
      GXt_int17 = (byte)(AV164localizacionhelipuerto) ;
      GXv_int9[0] = GXt_int17 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "UBIHEL", ""), GXv_int9) ;
      pgenbarm.this.GXt_int17 = GXv_int9[0] ;
      AV164localizacionhelipuerto = GXt_int17 ;
   }

   public void S2025( )
   {
      /* 'OBS' Routine */
      returnInSub = false ;
      /* Using cursor P000G41 */
      pr_default.execute(37, new Object[] {AV15EmprCod, Integer.valueOf(AV16DisCod)});
      while ( (pr_default.getStatus(37) != 101) )
      {
         A377DisObsTxt = P000G41_A377DisObsTxt[0] ;
         A361DisCod = P000G41_A361DisCod[0] ;
         A396EmprCod = P000G41_A396EmprCod[0] ;
         A376DisObsLin = P000G41_A376DisObsLin[0] ;
         if ( GXutil.like( A377DisObsTxt , GXutil.padr( httpContext.getMessage( "GRA:%", "") , 254 , "%"),  ' ' ) )
         {
            AV51OGSObs += A377DisObsTxt + GXutil.chr( (short)(13)) + GXutil.chr( (short)(10)) ;
         }
         pr_default.readNext(37);
      }
      pr_default.close(37);
   }

   public void S2128( )
   {
      /* 'OBS2' Routine */
      returnInSub = false ;
      /* Using cursor P000G42 */
      pr_default.execute(38, new Object[] {AV15EmprCod, Integer.valueOf(AV16DisCod)});
      while ( (pr_default.getStatus(38) != 101) )
      {
         A377DisObsTxt = P000G42_A377DisObsTxt[0] ;
         A361DisCod = P000G42_A361DisCod[0] ;
         A396EmprCod = P000G42_A396EmprCod[0] ;
         A376DisObsLin = P000G42_A376DisObsLin[0] ;
         if ( GXutil.like( A377DisObsTxt , GXutil.padr( httpContext.getMessage( "SEP:%", "") , 254 , "%"),  ' ' ) )
         {
            AV52OSSObs += A377DisObsTxt + GXutil.chr( (short)(13)) + GXutil.chr( (short)(10)) ;
         }
         pr_default.readNext(38);
      }
      pr_default.close(38);
   }

   public void S142( )
   {
      /* 'ARTICU' Routine */
      returnInSub = false ;
      AV35Barpes = (short)(0) ;
      /* Using cursor P000G43 */
      pr_default.execute(39, new Object[] {Integer.valueOf(AV24CliCod), AV25DisArtCod});
      while ( (pr_default.getStatus(39) != 101) )
      {
         A65ArtCod = P000G43_A65ArtCod[0] ;
         A252CliCod = P000G43_A252CliCod[0] ;
         n252CliCod = P000G43_n252CliCod[0] ;
         A7415ArtPmlCru = P000G43_A7415ArtPmlCru[0] ;
         n7415ArtPmlCru = P000G43_n7415ArtPmlCru[0] ;
         A396EmprCod = P000G43_A396EmprCod[0] ;
         AV35Barpes = A7415ArtPmlCru ;
         pr_default.readNext(39);
      }
      pr_default.close(39);
   }

   public void S132( )
   {
      /* 'LOCALIZACIONHELIPUERTO' Routine */
      returnInSub = false ;
      AV162Disloc = "" ;
      /* Using cursor P000G44 */
      pr_default.execute(40, new Object[] {AV15EmprCod, Integer.valueOf(AV16DisCod)});
      while ( (pr_default.getStatus(40) != 101) )
      {
         A361DisCod = P000G44_A361DisCod[0] ;
         A396EmprCod = P000G44_A396EmprCod[0] ;
         A673Piezas = P000G44_A673Piezas[0] ;
         A50AlbRLoc = P000G44_A50AlbRLoc[0] ;
         A44AlbRecCod = P000G44_A44AlbRecCod[0] ;
         A50AlbRLoc = P000G44_A50AlbRLoc[0] ;
         AV162Disloc = A50AlbRLoc ;
         pr_default.readNext(40);
      }
      pr_default.close(40);
   }

   protected void cleanup( )
   {
      this.aP3[0] = pgenbarm.this.AV31BarCodPar;
      Application.commitDataStores(context, remoteHandle, pr_default, "pgenbarm");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public java.math.BigDecimal getDisPieKgm1( String E396EmprCod ,
                                              int E361DisCod )
   {
      X595Kilos = DecimalUtil.ZERO ;
      /* Using cursor P000G45 */
      pr_default.execute(41, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(41) != 101) )
      {
         X595Kilos = P000G45_A595Kilos[0] ;
      }
      pr_default.close(41);
      return X595Kilos ;
   }

   public java.math.BigDecimal getDisPieKgm0( String E396EmprCod ,
                                              int E361DisCod )
   {
      X382DisPieKil = DecimalUtil.ZERO ;
      /* Using cursor P000G46 */
      pr_default.execute(42, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(42) != 101) )
      {
         X382DisPieKil = P000G46_A382DisPieKil[0] ;
      }
      pr_default.close(42);
      return X382DisPieKil ;
   }

   public java.math.BigDecimal getDisPieMtr1( String E396EmprCod ,
                                              int E361DisCod )
   {
      X631Metros = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P000G47 */
      pr_default.execute(43, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(43) != 101) )
      {
         X631Metros = P000G47_A631Metros[0] ;
      }
      pr_default.close(43);
      return X631Metros ;
   }

   public java.math.BigDecimal getDisPieMtr0( String E396EmprCod ,
                                              int E361DisCod )
   {
      X384DisPieMet = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P000G48 */
      pr_default.execute(44, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(44) != 101) )
      {
         X384DisPieMet = P000G48_A384DisPieMet[0] ;
      }
      pr_default.close(44);
      return X384DisPieMet ;
   }

   public int getDisPieNor0( String E396EmprCod ,
                             int E361DisCod )
   {
      X673Piezas = 0 ;
      /* Using cursor P000G49 */
      pr_default.execute(45, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(45) != 101) )
      {
         X673Piezas = P000G49_A673Piezas[0] ;
      }
      pr_default.close(45);
      return X673Piezas ;
   }

   public void initialize( )
   {
      A396EmprCod = "" ;
      scmdbuf = "" ;
      P000G3_A9772DisItem2 = new String[] {""} ;
      P000G3_A9773DisItem3 = new String[] {""} ;
      P000G3_A9774DisItem4 = new String[] {""} ;
      P000G3_A9786DisItem5 = new String[] {""} ;
      P000G3_A9787DisItem6 = new String[] {""} ;
      P000G3_A10887Cod_Idtx = new String[] {""} ;
      P000G3_n10887Cod_Idtx = new boolean[] {false} ;
      P000G3_A8886DisDest = new String[] {""} ;
      P000G3_A11659MarcaId = new String[] {""} ;
      P000G3_n11659MarcaId = new boolean[] {false} ;
      P000G3_A11661DisOrdComp = new String[] {""} ;
      P000G3_A7739DisExp = new String[] {""} ;
      P000G3_A1002DisNumTen = new String[] {""} ;
      P000G3_n1002DisNumTen = new boolean[] {false} ;
      P000G3_A11734DisCnoEncO = new String[] {""} ;
      P000G3_A11864Nxt_artcli = new String[] {""} ;
      P000G3_A11859Nxt_modelo = new String[] {""} ;
      P000G3_A11861Nxt_statio = new String[] {""} ;
      P000G3_A11860CpteId = new short[1] ;
      P000G3_n11860CpteId = new boolean[] {false} ;
      P000G3_A11863DptoID = new short[1] ;
      P000G3_n11863DptoID = new boolean[] {false} ;
      P000G3_A11862DesaID = new short[1] ;
      P000G3_n11862DesaID = new boolean[] {false} ;
      P000G3_A12328RevenID = new String[] {""} ;
      P000G3_n12328RevenID = new boolean[] {false} ;
      P000G3_A12768DisTpEstam = new byte[1] ;
      P000G3_A12765DisPriorid = new byte[1] ;
      P000G3_A12772DisProdID = new String[] {""} ;
      P000G3_n12772DisProdID = new boolean[] {false} ;
      P000G3_A12880DisOEKOTEX = new String[] {""} ;
      P000G3_n12880DisOEKOTEX = new boolean[] {false} ;
      P000G3_A13068DisLineaID = new short[1] ;
      P000G3_n13068DisLineaID = new boolean[] {false} ;
      P000G3_A13069DisCanalID = new int[1] ;
      P000G3_n13069DisCanalID = new boolean[] {false} ;
      P000G3_A13076DisLinPrd = new String[] {""} ;
      P000G3_n13076DisLinPrd = new boolean[] {false} ;
      P000G3_A13987DisArtDsc2 = new String[] {""} ;
      P000G3_A13233DisRGB = new long[1] ;
      P000G3_A1430DisLoc = new String[] {""} ;
      P000G3_A13986DisIdtx2 = new String[] {""} ;
      P000G3_n13986DisIdtx2 = new boolean[] {false} ;
      P000G3_A13080DisDGUltli = new byte[1] ;
      P000G3_A361DisCod = new int[1] ;
      P000G3_A367DisEst = new byte[1] ;
      P000G3_A387DisPiePie = new short[1] ;
      P000G3_n387DisPiePie = new boolean[] {false} ;
      P000G3_A390DisTipCol = new byte[1] ;
      P000G3_n390DisTipCol = new boolean[] {false} ;
      P000G3_A363DisColNum = new int[1] ;
      P000G3_n363DisColNum = new boolean[] {false} ;
      P000G3_A362DisColNom = new String[] {""} ;
      P000G3_n362DisColNom = new boolean[] {false} ;
      P000G3_A335DisArtCod = new String[] {""} ;
      P000G3_A252CliCod = new int[1] ;
      P000G3_n252CliCod = new boolean[] {false} ;
      P000G3_A396EmprCod = new String[] {""} ;
      P000G3_A365DisDes = new String[] {""} ;
      P000G3_A360DisCliNum = new String[] {""} ;
      P000G3_A337DisArtDsc = new String[] {""} ;
      P000G3_A352DisArtTip = new short[1] ;
      P000G3_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      P000G3_A375DisNumUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000G3_A392DisUniMed = new String[] {""} ;
      P000G3_A370DisFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P000G3_A374DisNumPie = new short[1] ;
      P000G3_A341DisArtOpe = new String[] {""} ;
      P000G3_A359DisArtUrg = new byte[1] ;
      P000G3_A340DisArtMat = new String[] {""} ;
      P000G3_A350DisArtRdt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000G3_A353DisArtTr1 = new String[] {""} ;
      P000G3_A344DisArtPt1 = new short[1] ;
      P000G3_A354DisArtTr2 = new String[] {""} ;
      P000G3_A345DisArtPt2 = new short[1] ;
      P000G3_A355DisArtTr3 = new String[] {""} ;
      P000G3_A346DisArtPt3 = new short[1] ;
      P000G3_A356DisArtUr1 = new String[] {""} ;
      P000G3_A347DisArtPu1 = new short[1] ;
      P000G3_A357DisArtUr2 = new String[] {""} ;
      P000G3_A348DisArtPu2 = new short[1] ;
      P000G3_A358DisArtUr3 = new String[] {""} ;
      P000G3_A349DisArtPu3 = new short[1] ;
      P000G3_n349DisArtPu3 = new boolean[] {false} ;
      P000G3_A1232DisArtAcb = new short[1] ;
      P000G3_A1233DisArtAc2 = new short[1] ;
      P000G3_A334DisArtAnh = new short[1] ;
      P000G3_A1231DisArtAn1 = new short[1] ;
      P000G3_A343DisArtPle = new String[] {""} ;
      P000G3_A339DisArtLar = new String[] {""} ;
      P000G3_A351DisArtSua = new String[] {""} ;
      P000G3_A333DisArtAca = new String[] {""} ;
      P000G3_A336DisArtCor = new String[] {""} ;
      P000G3_A338DisArtEnc = new String[] {""} ;
      P000G3_A2831DisNumLot = new int[1] ;
      P000G3_A2832DisKgsLot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000G3_A2833DisMtrLot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000G3_A4014DisTin = new String[] {""} ;
      P000G3_A757PriCod = new String[] {""} ;
      P000G3_A371DisFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P000G3_A342DisArtPes = new short[1] ;
      P000G3_A1225DisGraCru = new short[1] ;
      P000G3_A1195DisNomCli = new String[] {""} ;
      P000G3_A1196DisNumCli = new int[1] ;
      P000G3_A1197DisEncCom = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000G3_A1198DisEncAnh = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000G3_A1502DisPart = new short[1] ;
      P000G3_A2310DisCliDes = new int[1] ;
      P000G3_A2009DisTipDis = new String[] {""} ;
      P000G3_n2009DisTipDis = new boolean[] {false} ;
      P000G3_A2835DisPle2 = new String[] {""} ;
      P000G3_A5025DisGraCob = new byte[1] ;
      P000G3_A5024DisTipEst = new byte[1] ;
      P000G3_A2926DisPla = new String[] {""} ;
      P000G3_A3127DisNumCor = new short[1] ;
      P000G3_A3128DisAncSal1 = new short[1] ;
      P000G3_A3129DisAncSal2 = new short[1] ;
      P000G3_A3130DisAncSal3 = new short[1] ;
      P000G3_A3131DisGraAca2 = new short[1] ;
      P000G3_A3132DisGraCru2 = new short[1] ;
      P000G3_A1906DisGraAca = new short[1] ;
      P000G3_A1907DisRdoN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000G3_A1908DisRdoA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000G3_A1013DibCli = new String[] {""} ;
      P000G3_n1013DibCli = new boolean[] {false} ;
      P000G3_A1014DibInt = new int[1] ;
      P000G3_n1014DibInt = new boolean[] {false} ;
      P000G3_A4468DisPelAnh = new short[1] ;
      P000G3_A4469DisCruMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000G3_A4470DisCruKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000G3_A4471DisCruEnr = new String[] {""} ;
      P000G3_A4472DisLotPza = new short[1] ;
      P000G3_n4472DisLotPza = new boolean[] {false} ;
      P000G3_A4473DisLotMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000G3_A4474DisLotKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000G3_A4475DisLotMaq = new String[] {""} ;
      P000G3_n4475DisLotMaq = new boolean[] {false} ;
      P000G3_A4476DisAcaFor = new int[1] ;
      P000G3_n4476DisAcaFor = new boolean[] {false} ;
      P000G3_A4477DisAcaBak = new String[] {""} ;
      P000G3_A4478DisAcaAnh = new short[1] ;
      P000G3_A4479DisAcaMar = new String[] {""} ;
      P000G3_A2402DisManCod = new short[1] ;
      P000G3_A3307DisManCod1 = new short[1] ;
      P000G3_A3308DisManCod2 = new short[1] ;
      P000G3_A4614DisMdlCod = new String[] {""} ;
      P000G3_A4293DisNPzas = new int[1] ;
      P000G3_n4293DisNPzas = new boolean[] {false} ;
      P000G3_A4616DisHorEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P000G3_n4616DisHorEnt = new boolean[] {false} ;
      P000G3_A4813DisEncCli = new String[] {""} ;
      P000G3_A4720DisDishCod = new String[] {""} ;
      P000G3_A5031DisCom = new String[] {""} ;
      P000G3_n5031DisCom = new boolean[] {false} ;
      P000G3_A5032DisEstTip = new String[] {""} ;
      P000G3_A5252DisAcc = new String[] {""} ;
      P000G3_A5350DisObsAnc = new String[] {""} ;
      P000G3_A5349DisObsGrm = new String[] {""} ;
      P000G3_A5366DisAntp = new String[] {""} ;
      P000G3_A5405DisAntpT = new String[] {""} ;
      P000G3_A1052DisObs = new String[] {""} ;
      P000G3_A3627DisFecLan = new java.util.Date[] {GXutil.nullDate()} ;
      P000G3_n3627DisFecLan = new boolean[] {false} ;
      P000G3_A998DisNMtr = new String[] {""} ;
      P000G3_A7738DisMaqEst = new String[] {""} ;
      P000G3_A4615DisTam = new String[] {""} ;
      P000G3_A2743DisNumTex1 = new byte[1] ;
      P000G3_A7523DisRec = new String[] {""} ;
      P000G3_A4785DisNroCor = new int[1] ;
      P000G3_A9771DisItem1 = new String[] {""} ;
      A9772DisItem2 = "" ;
      A9773DisItem3 = "" ;
      A9774DisItem4 = "" ;
      A9786DisItem5 = "" ;
      A9787DisItem6 = "" ;
      A10887Cod_Idtx = "" ;
      A8886DisDest = "" ;
      A11659MarcaId = "" ;
      A11661DisOrdComp = "" ;
      A7739DisExp = "" ;
      A1002DisNumTen = "" ;
      A11734DisCnoEncO = "" ;
      A11864Nxt_artcli = "" ;
      A11859Nxt_modelo = "" ;
      A11861Nxt_statio = "" ;
      A12328RevenID = "" ;
      A12772DisProdID = "" ;
      A12880DisOEKOTEX = "" ;
      A13076DisLinPrd = "" ;
      A13987DisArtDsc2 = "" ;
      A1430DisLoc = "" ;
      A13986DisIdtx2 = "" ;
      A362DisColNom = "" ;
      A335DisArtCod = "" ;
      A365DisDes = "" ;
      A360DisCliNum = "" ;
      A337DisArtDsc = "" ;
      A369DisFec = GXutil.nullDate() ;
      A375DisNumUni = DecimalUtil.ZERO ;
      A392DisUniMed = "" ;
      A370DisFecCli = GXutil.nullDate() ;
      A341DisArtOpe = "" ;
      A340DisArtMat = "" ;
      A350DisArtRdt = DecimalUtil.ZERO ;
      A353DisArtTr1 = "" ;
      A354DisArtTr2 = "" ;
      A355DisArtTr3 = "" ;
      A356DisArtUr1 = "" ;
      A357DisArtUr2 = "" ;
      A358DisArtUr3 = "" ;
      A343DisArtPle = "" ;
      A339DisArtLar = "" ;
      A351DisArtSua = "" ;
      A333DisArtAca = "" ;
      A336DisArtCor = "" ;
      A338DisArtEnc = "" ;
      A2832DisKgsLot = DecimalUtil.ZERO ;
      A2833DisMtrLot = DecimalUtil.ZERO ;
      A4014DisTin = "" ;
      A757PriCod = "" ;
      A371DisFecEnt = GXutil.nullDate() ;
      A1195DisNomCli = "" ;
      A1197DisEncCom = DecimalUtil.ZERO ;
      A1198DisEncAnh = DecimalUtil.ZERO ;
      A2009DisTipDis = "" ;
      A2835DisPle2 = "" ;
      A2926DisPla = "" ;
      A1907DisRdoN = DecimalUtil.ZERO ;
      A1908DisRdoA = DecimalUtil.ZERO ;
      A1013DibCli = "" ;
      A4469DisCruMts = DecimalUtil.ZERO ;
      A4470DisCruKgs = DecimalUtil.ZERO ;
      A4471DisCruEnr = "" ;
      A4473DisLotMts = DecimalUtil.ZERO ;
      A4474DisLotKgs = DecimalUtil.ZERO ;
      A4475DisLotMaq = "" ;
      A4477DisAcaBak = "" ;
      A4479DisAcaMar = "" ;
      A4614DisMdlCod = "" ;
      A4616DisHorEnt = GXutil.resetTime( GXutil.nullDate() );
      A4813DisEncCli = "" ;
      A4720DisDishCod = "" ;
      A5031DisCom = "" ;
      A5032DisEstTip = "" ;
      A5252DisAcc = "" ;
      A5350DisObsAnc = "" ;
      A5349DisObsGrm = "" ;
      A5366DisAntp = "" ;
      A5405DisAntpT = "" ;
      A1052DisObs = "" ;
      A3627DisFecLan = GXutil.nullDate() ;
      A998DisNMtr = "" ;
      A7738DisMaqEst = "" ;
      A4615DisTam = "" ;
      A7523DisRec = "" ;
      A9771DisItem1 = "" ;
      A385DisPieMtr = DecimalUtil.ZERO ;
      A381DisPieKgm = DecimalUtil.ZERO ;
      A475FindCol = "" ;
      W396EmprCod = "" ;
      AV19Disacc = "" ;
      P000G4_A396EmprCod = new String[] {""} ;
      P000G4_A361DisCod = new int[1] ;
      P000G4_A673Piezas = new int[1] ;
      P000G4_A55AlbRReo = new String[] {""} ;
      P000G4_A44AlbRecCod = new int[1] ;
      A55AlbRReo = "" ;
      P000G5_A361DisCod = new int[1] ;
      P000G5_A396EmprCod = new String[] {""} ;
      P000G5_A833TipDefCod = new short[1] ;
      P000G5_n833TipDefCod = new boolean[] {false} ;
      P000G6_A396EmprCod = new String[] {""} ;
      P000G6_A361DisCod = new int[1] ;
      P000G6_A1057DisComAnh = new short[1] ;
      P000G6_n1057DisComAnh = new boolean[] {false} ;
      P000G6_A1058DisComMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000G6_n1058DisComMtr = new boolean[] {false} ;
      P000G6_A1059DisComPie = new short[1] ;
      P000G6_n1059DisComPie = new boolean[] {false} ;
      P000G6_A7735DisComObs = new String[] {""} ;
      P000G6_n7735DisComObs = new boolean[] {false} ;
      P000G6_A13072DisComDibC = new String[] {""} ;
      P000G6_n13072DisComDibC = new boolean[] {false} ;
      P000G6_A13073DisComDibI = new int[1] ;
      P000G6_n13073DisComDibI = new boolean[] {false} ;
      P000G6_A1032FonCod = new String[] {""} ;
      P000G6_A1056DisComCod = new String[] {""} ;
      P000G6_A2524DisComLin = new byte[1] ;
      A1058DisComMtr = DecimalUtil.ZERO ;
      A7735DisComObs = "" ;
      A13072DisComDibC = "" ;
      A1032FonCod = "" ;
      A1056DisComCod = "" ;
      A130BarCodPar = "" ;
      A1541BarComMtr = DecimalUtil.ZERO ;
      A1540BarComMLan = DecimalUtil.ZERO ;
      A2069BarComEst = "" ;
      A2072BarMtrRep = DecimalUtil.ZERO ;
      A2510BarComPri = "" ;
      A2071BarMtrEst = DecimalUtil.ZERO ;
      A7734BarComObs = "" ;
      A13074BarComDibC = "" ;
      Gx_emsg = "" ;
      P000G8_A396EmprCod = new String[] {""} ;
      P000G8_A361DisCod = new int[1] ;
      P000G8_A13081DisDGLin = new byte[1] ;
      P000G8_A13082DisDGDibCl = new String[] {""} ;
      P000G8_A13083DisDGDibIn = new int[1] ;
      P000G8_A13085DisDGFondo = new String[] {""} ;
      P000G8_A13084DisDGComb = new String[] {""} ;
      P000G8_A13091DisDGObs = new String[] {""} ;
      P000G8_A13086DisDGMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000G8_A13087DisDGPzs = new int[1] ;
      P000G8_A13088DisDGAnc = new short[1] ;
      A13082DisDGDibCl = "" ;
      A13085DisDGFondo = "" ;
      A13084DisDGComb = "" ;
      A13091DisDGObs = "" ;
      A13086DisDGMts = DecimalUtil.ZERO ;
      A13094BarDGDibCl = "" ;
      A13097BarDGFOndo = "" ;
      A13096BarDGComb = "" ;
      A13098BarDGObs = "" ;
      A13100BarDGMts = DecimalUtil.ZERO ;
      AV88CodPar = "" ;
      P000G10_A396EmprCod = new String[] {""} ;
      P000G10_A361DisCod = new int[1] ;
      P000G10_A376DisObsLin = new byte[1] ;
      P000G10_A377DisObsTxt = new String[] {""} ;
      A377DisObsTxt = "" ;
      A187BarNotDsc = "" ;
      AV25DisArtCod = "" ;
      AV26ForColNom = "" ;
      AV75Mensa = "" ;
      A143BarDisNum = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A2497BarFecIni = GXutil.nullDate() ;
      Gx_date = GXutil.nullDate() ;
      A159BarFecGen = GXutil.nullDate() ;
      A192BarNumUni = DecimalUtil.ZERO ;
      A228BarUniMed = "" ;
      A155BarFecCli = GXutil.nullDate() ;
      A180BarMaqCod = "" ;
      A182BarMat = "" ;
      A211BarRdt = DecimalUtil.ZERO ;
      A221BarTra1 = "" ;
      A222BarTra2 = "" ;
      A223BarTra3 = "" ;
      A229BarUrd1 = "" ;
      A230BarUrd2 = "" ;
      A231BarUrd3 = "" ;
      A206BarPle = "" ;
      A177BarLar = "" ;
      A214BarSua = "" ;
      A118BarAcaQui = "" ;
      A139BarCorOri = "" ;
      A145BarEncOri = "" ;
      A2827BarKgsLot = DecimalUtil.ZERO ;
      A2828BarMtrLot = DecimalUtil.ZERO ;
      AV34Inc_obs = "" ;
      AV162Disloc = "" ;
      A209BarPri = "" ;
      A137BarConPar = "" ;
      A141BarCosPro = DecimalUtil.ZERO ;
      A140BarCosAny = DecimalUtil.ZERO ;
      A169BarKgsFac = DecimalUtil.ZERO ;
      A158BarFecFpr = GXutil.nullDate() ;
      A120BarAgrEst = "" ;
      A1234BarNomCli = "" ;
      A1223BarEncCom = DecimalUtil.ZERO ;
      A1224BarEncAnh = DecimalUtil.ZERO ;
      A2010BarTipDis = "" ;
      A2485BarColPes = "" ;
      A2498BarPrdPes = "" ;
      A2499BarRDos1 = "" ;
      A2500BarRDos2 = "" ;
      A2836BarPle2 = "" ;
      A3030BarPlf = "" ;
      A1910BarRdoN = DecimalUtil.ZERO ;
      A1911BarRdoA = DecimalUtil.ZERO ;
      A1798BarDibCli = "" ;
      A4016BarTin = "" ;
      A4457BarCruMts = DecimalUtil.ZERO ;
      A4458BarCruKgs = DecimalUtil.ZERO ;
      A4459BarCruEnr = "" ;
      A4461BarLotMts = DecimalUtil.ZERO ;
      A4462BarLotKgs = DecimalUtil.ZERO ;
      A4463BarLotMaq = "" ;
      A4465BarAcaBak = "" ;
      A4467BarAcaMar = "" ;
      A4609BarMdlCod = "" ;
      A4611BarHorEnt = GXutil.resetTime( GXutil.nullDate() );
      A4613BarHorReg = GXutil.resetTime( GXutil.nullDate() );
      A4812BarEncCli = "" ;
      A2460BarTipAca = "" ;
      A4716BarDishCod = "" ;
      A5033BarCom = "" ;
      A5034BarEstTip = "" ;
      A5253BarAcc = "" ;
      A5352BarObsAnc = "" ;
      A5351BarObsGrm = "" ;
      A5367BarAntp = "" ;
      A5406BarAntpT = "" ;
      A2454BarGirar = "" ;
      GXv_int8 = new short[1] ;
      GXv_int13 = new short[1] ;
      AV40ForPreFec = GXutil.nullDate() ;
      GXv_date14 = new java.util.Date[1] ;
      AV99Usurcod_a = "" ;
      AV37UsurCod = "" ;
      AV100Fecha_a = "" ;
      A4835BarAudOpeN = "" ;
      Gx_time = "" ;
      A1003BarFecLan = GXutil.nullDate() ;
      A4837BarAudSupN = "" ;
      A1500BarNMtr = "" ;
      A4845BarAudObs = "" ;
      A161BarFecSal = GXutil.nullDate() ;
      A7733BarMaqEst = "" ;
      A5293BarCodBan = "" ;
      A4610BarTam = "" ;
      A8097BarFecHis = GXutil.resetTime( GXutil.nullDate() );
      A3746BarNPed = "" ;
      A9775BarItem1 = "" ;
      A9776barItem2 = "" ;
      A9777BarItem3 = "" ;
      A9778BarItem4 = "" ;
      A9789BarItem5 = "" ;
      A9790BarItem6 = "" ;
      A1878BarNumTen = "" ;
      A2829BarProPer = "" ;
      AV41BarProPer = "" ;
      A2445BarEntEnE = "" ;
      A181BarMaqPro = "" ;
      A11662BarOrdComp = "" ;
      A5291BarTipCor = "" ;
      A14329BarCnoEncO = "" ;
      A11852Nxt_ArtCl2 = "" ;
      A11850Nxt_Mdlo2 = "" ;
      A11851Nxt_Sta2 = "" ;
      A12329SubRevID = "" ;
      A12774BarProdID = "" ;
      A12881BarOEKOTEX = "" ;
      A13077BarLinPrd = "" ;
      GXv_int15 = new long[1] ;
      A13907BarSerDsc2 = "" ;
      A12809BarLocTel = "" ;
      A1431BarLocDis = "" ;
      A13908BarIdtx2 = "" ;
      A1141DisBarPar = "" ;
      P000G14_A396EmprCod = new String[] {""} ;
      P000G14_A361DisCod = new int[1] ;
      P000G14_A380DisPieCod = new String[] {""} ;
      P000G14_A382DisPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000G14_A384DisPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000G14_A2184DisPieLoc = new String[] {""} ;
      P000G14_A2185DisPieAnc = new short[1] ;
      P000G14_A6490DisPieIdPz = new String[] {""} ;
      P000G14_n6490DisPieIdPz = new boolean[] {false} ;
      P000G14_A8839DisPieCodB = new String[] {""} ;
      P000G14_n8839DisPieCodB = new boolean[] {false} ;
      P000G14_A44AlbRecCod = new int[1] ;
      A380DisPieCod = "" ;
      A382DisPieKil = DecimalUtil.ZERO ;
      A384DisPieMet = DecimalUtil.ZERO ;
      A2184DisPieLoc = "" ;
      A6490DisPieIdPz = "" ;
      A8839DisPieCodB = "" ;
      A200BarPieCod = "" ;
      A203BarPieKil = DecimalUtil.ZERO ;
      A205BarPieMet = DecimalUtil.ZERO ;
      A2186BarPieLoc = "" ;
      A6489BarPieIdPz = "" ;
      A8907PzaB80 = "" ;
      A8838CodBarPz = "" ;
      A13988BarPieVtx = "" ;
      AV71TotKil = DecimalUtil.ZERO ;
      AV72TotMet = DecimalUtil.ZERO ;
      AV102HRStkInt = "" ;
      P000G16_A396EmprCod = new String[] {""} ;
      P000G16_A361DisCod = new int[1] ;
      P000G16_A595Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000G16_A631Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000G16_A673Piezas = new int[1] ;
      P000G16_A44AlbRecCod = new int[1] ;
      A595Kilos = DecimalUtil.ZERO ;
      A631Metros = DecimalUtil.ZERO ;
      AV134BarCodparp = "" ;
      P000G18_A396EmprCod = new String[] {""} ;
      P000G18_A361DisCod = new int[1] ;
      P000G18_A44AlbRecCod = new int[1] ;
      P000G18_A673Piezas = new int[1] ;
      P000G19_A396EmprCod = new String[] {""} ;
      P000G19_A5206Nr_albrecc = new int[1] ;
      P000G19_n5206Nr_albrecc = new boolean[] {false} ;
      P000G19_A5198Nr_codigo = new int[1] ;
      P000G19_A5906Nr_OpeCod = new int[1] ;
      P000G19_n5906Nr_OpeCod = new boolean[] {false} ;
      P000G19_A5904Nr_TipCsCL = new short[1] ;
      P000G19_n5904Nr_TipCsCL = new boolean[] {false} ;
      P000G21_A319DefPor = new short[1] ;
      P000G21_A14357DefMaqcod = new String[] {""} ;
      P000G21_n14357DefMaqcod = new boolean[] {false} ;
      P000G21_A14358DefCausa = new short[1] ;
      P000G21_n14358DefCausa = new boolean[] {false} ;
      P000G21_A14359DefResp = new short[1] ;
      P000G21_n14359DefResp = new boolean[] {false} ;
      P000G21_A833TipDefCod = new short[1] ;
      P000G21_n833TipDefCod = new boolean[] {false} ;
      P000G21_A361DisCod = new int[1] ;
      P000G21_A396EmprCod = new String[] {""} ;
      P000G21_A387DisPiePie = new short[1] ;
      P000G21_n387DisPiePie = new boolean[] {false} ;
      A14357DefMaqcod = "" ;
      W602MaqCod = "" ;
      A602MaqCod = "" ;
      A544HisCodPar = "" ;
      A542HisBarSer = "" ;
      A546HisColNom = "" ;
      A540HisBarKgm = DecimalUtil.ZERO ;
      A541HisBarMtr = DecimalUtil.ZERO ;
      A569HisReoFec = GXutil.nullDate() ;
      A549HisKgmOri = DecimalUtil.ZERO ;
      A552HisMtrOri = DecimalUtil.ZERO ;
      A2299HisReoDsc = "" ;
      A8889HisNomCli = "" ;
      A13698HisreoLote = "" ;
      P000G23_A396EmprCod = new String[] {""} ;
      P000G23_A361DisCod = new int[1] ;
      P000G23_A13376DisTraID = new String[] {""} ;
      A13376DisTraID = "" ;
      A13905BarTraID = "" ;
      AV182Pgmname = "" ;
      AV38Station = "" ;
      AV137Artextil = DecimalUtil.ZERO ;
      P000G26_A252CliCod = new int[1] ;
      P000G26_n252CliCod = new boolean[] {false} ;
      P000G26_A334DisArtAnh = new short[1] ;
      P000G26_A1013DibCli = new String[] {""} ;
      P000G26_n1013DibCli = new boolean[] {false} ;
      P000G26_A1014DibInt = new int[1] ;
      P000G26_n1014DibInt = new boolean[] {false} ;
      P000G26_A130BarCodPar = new String[] {""} ;
      P000G26_n130BarCodPar = new boolean[] {false} ;
      P000G26_A132BarCodReo = new byte[1] ;
      P000G26_n132BarCodReo = new boolean[] {false} ;
      P000G26_A129BarCod = new int[1] ;
      P000G26_n129BarCod = new boolean[] {false} ;
      P000G26_A361DisCod = new int[1] ;
      P000G26_A396EmprCod = new String[] {""} ;
      P000G26_A6841DibDsc = new String[] {""} ;
      P000G26_n6841DibDsc = new boolean[] {false} ;
      P000G26_A3911TipMqnCod = new byte[1] ;
      P000G26_n3911TipMqnCod = new boolean[] {false} ;
      P000G26_A1607DibMed = new String[] {""} ;
      P000G26_n1607DibMed = new boolean[] {false} ;
      P000G26_A1606DibTipRas = new String[] {""} ;
      P000G26_n1606DibTipRas = new boolean[] {false} ;
      P000G26_A7516DisGraTam = new String[] {""} ;
      P000G26_n7516DisGraTam = new boolean[] {false} ;
      P000G26_A2009DisTipDis = new String[] {""} ;
      P000G26_n2009DisTipDis = new boolean[] {false} ;
      P000G26_A7514DisOrdGra = new byte[1] ;
      A6841DibDsc = "" ;
      A1607DibMed = "" ;
      A1606DibTipRas = "" ;
      A7516DisGraTam = "" ;
      AV46DibDsc = "" ;
      AV48DibMed = "" ;
      AV49DibTipRas = "" ;
      AV50DisGraTam = "" ;
      W130BarCodPar = "" ;
      A7050OGSEst = "" ;
      A7051OGSUsuCre = "" ;
      A7052OGSFchCre = GXutil.resetTime( GXutil.nullDate() );
      A7054OGSFchRea = GXutil.resetTime( GXutil.nullDate() );
      AV51OGSObs = "" ;
      A7055OGSObs = "" ;
      A7521OGSDsc = "" ;
      A7520OGSSeg = "" ;
      A7141OGSAnc = DecimalUtil.ZERO ;
      A7522OGSTam = "" ;
      A10885OGSDibC = "" ;
      P000G28_A7514DisOrdGra = new byte[1] ;
      P000G28_A361DisCod = new int[1] ;
      P000G28_A396EmprCod = new String[] {""} ;
      P000G29_A334DisArtAnh = new short[1] ;
      P000G29_A7511DisFacSep = new byte[1] ;
      P000G29_n7511DisFacSep = new boolean[] {false} ;
      P000G29_A130BarCodPar = new String[] {""} ;
      P000G29_n130BarCodPar = new boolean[] {false} ;
      P000G29_A132BarCodReo = new byte[1] ;
      P000G29_n132BarCodReo = new boolean[] {false} ;
      P000G29_A129BarCod = new int[1] ;
      P000G29_n129BarCod = new boolean[] {false} ;
      P000G29_A396EmprCod = new String[] {""} ;
      P000G29_A2009DisTipDis = new String[] {""} ;
      P000G29_n2009DisTipDis = new boolean[] {false} ;
      P000G29_A7513DisOrdSep = new byte[1] ;
      P000G29_A361DisCod = new int[1] ;
      A7146OSSEst = "" ;
      A7147OSSUsuCre = "" ;
      A7148OSSFchCre = GXutil.resetTime( GXutil.nullDate() );
      A7150OSSFchRea = GXutil.resetTime( GXutil.nullDate() );
      AV52OSSObs = "" ;
      A7158OSSObs = "" ;
      A7151OSSAnc = DecimalUtil.ZERO ;
      A7152OSSFac = "" ;
      P000G31_A7513DisOrdSep = new byte[1] ;
      P000G31_A361DisCod = new int[1] ;
      P000G31_A396EmprCod = new String[] {""} ;
      P000G32_A361DisCod = new int[1] ;
      P000G32_A396EmprCod = new String[] {""} ;
      P000G32_A1196DisNumCli = new int[1] ;
      P000G32_A1195DisNomCli = new String[] {""} ;
      P000G32_A390DisTipCol = new byte[1] ;
      P000G32_n390DisTipCol = new boolean[] {false} ;
      P000G32_A363DisColNum = new int[1] ;
      P000G32_n363DisColNum = new boolean[] {false} ;
      P000G32_A362DisColNom = new String[] {""} ;
      P000G32_n362DisColNom = new boolean[] {false} ;
      P000G32_A335DisArtCod = new String[] {""} ;
      P000G32_A252CliCod = new int[1] ;
      P000G32_n252CliCod = new boolean[] {false} ;
      GXv_char2 = new String[1] ;
      GXv_int7 = new byte[1] ;
      P000G33_A213BarSit = new byte[1] ;
      P000G33_A130BarCodPar = new String[] {""} ;
      P000G33_n130BarCodPar = new boolean[] {false} ;
      P000G33_A132BarCodReo = new byte[1] ;
      P000G33_n132BarCodReo = new boolean[] {false} ;
      P000G33_A129BarCod = new int[1] ;
      P000G33_n129BarCod = new boolean[] {false} ;
      P000G33_A7515DisDesCol = new byte[1] ;
      P000G33_n7515DisDesCol = new boolean[] {false} ;
      P000G33_A361DisCod = new int[1] ;
      P000G33_A396EmprCod = new String[] {""} ;
      A3401DisRefKgs = DecimalUtil.ZERO ;
      A3402DisRefMts = DecimalUtil.ZERO ;
      A5861DisRefPzII = "" ;
      P000G35_A3608DisRefAlbR = new int[1] ;
      P000G35_n3608DisRefAlbR = new boolean[] {false} ;
      P000G35_A3401DisRefKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000G35_n3401DisRefKgs = new boolean[] {false} ;
      P000G35_A3402DisRefMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000G35_n3402DisRefMts = new boolean[] {false} ;
      P000G35_A3403DisRefPie = new short[1] ;
      P000G35_n3403DisRefPie = new boolean[] {false} ;
      P000G35_A361DisCod = new int[1] ;
      P000G35_A396EmprCod = new String[] {""} ;
      P000G35_A5861DisRefPzII = new String[] {""} ;
      P000G35_n5861DisRefPzII = new boolean[] {false} ;
      P000G35_A3398DisRefBarC = new int[1] ;
      P000G35_A3399DisRefBCRe = new byte[1] ;
      P000G35_A3400DisRefBCPa = new String[] {""} ;
      P000G35_A3607DisRefBPie = new String[] {""} ;
      A3400DisRefBCPa = "" ;
      A3607DisRefBPie = "" ;
      AV104DupliPz = "" ;
      AV54TIPARTRB = DecimalUtil.ZERO ;
      P000G38_A602MaqCod = new String[] {""} ;
      P000G38_n602MaqCod = new boolean[] {false} ;
      P000G38_A6188MaqTArt = new short[1] ;
      P000G38_A396EmprCod = new String[] {""} ;
      P000G38_A6190TipArtRb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000G38_n6190TipArtRb = new boolean[] {false} ;
      P000G38_A6233TipArtVmn = new int[1] ;
      P000G38_n6233TipArtVmn = new boolean[] {false} ;
      P000G38_A6234TipArtVmx = new int[1] ;
      P000G38_n6234TipArtVmx = new boolean[] {false} ;
      A6190TipArtRb = DecimalUtil.ZERO ;
      P000G39_A1202MacDisCod = new int[1] ;
      P000G39_A396EmprCod = new String[] {""} ;
      P000G39_A1203MacBarCod = new int[1] ;
      P000G39_A1204MacBarReo = new byte[1] ;
      P000G39_A1205MacBarPar = new String[] {""} ;
      P000G39_A1199MacCod = new int[1] ;
      P000G39_A1201MacLin = new short[1] ;
      A1205MacBarPar = "" ;
      GXt_char1 = "" ;
      AV57EmprNom = "" ;
      GXv_char4 = new String[1] ;
      GXv_char18 = new String[1] ;
      GXv_int11 = new int[1] ;
      GXv_char5 = new String[1] ;
      GXv_int10 = new int[1] ;
      GXv_int6 = new int[1] ;
      GXv_int3 = new int[1] ;
      AV127Kgs = DecimalUtil.ZERO ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      GXv_int9 = new byte[1] ;
      P000G41_A377DisObsTxt = new String[] {""} ;
      P000G41_A361DisCod = new int[1] ;
      P000G41_A396EmprCod = new String[] {""} ;
      P000G41_A376DisObsLin = new byte[1] ;
      P000G42_A377DisObsTxt = new String[] {""} ;
      P000G42_A361DisCod = new int[1] ;
      P000G42_A396EmprCod = new String[] {""} ;
      P000G42_A376DisObsLin = new byte[1] ;
      P000G43_A65ArtCod = new String[] {""} ;
      P000G43_A252CliCod = new int[1] ;
      P000G43_n252CliCod = new boolean[] {false} ;
      P000G43_A7415ArtPmlCru = new short[1] ;
      P000G43_n7415ArtPmlCru = new boolean[] {false} ;
      P000G43_A396EmprCod = new String[] {""} ;
      A65ArtCod = "" ;
      P000G44_A361DisCod = new int[1] ;
      P000G44_A396EmprCod = new String[] {""} ;
      P000G44_A673Piezas = new int[1] ;
      P000G44_A50AlbRLoc = new String[] {""} ;
      P000G44_A44AlbRecCod = new int[1] ;
      A50AlbRLoc = "" ;
      X595Kilos = DecimalUtil.ZERO ;
      E396EmprCod = "" ;
      P000G45_A595Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      X382DisPieKil = DecimalUtil.ZERO ;
      P000G46_A382DisPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      X631Metros = DecimalUtil.ZERO ;
      P000G47_A631Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      X384DisPieMet = DecimalUtil.ZERO ;
      P000G48_A384DisPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000G49_A673Piezas = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pgenbarm__default(),
         new Object[] {
             new Object[] {
            P000G3_A9772DisItem2, P000G3_A9773DisItem3, P000G3_A9774DisItem4, P000G3_A9786DisItem5, P000G3_A9787DisItem6, P000G3_A10887Cod_Idtx, P000G3_n10887Cod_Idtx, P000G3_A8886DisDest, P000G3_A11659MarcaId, P000G3_n11659MarcaId,
            P000G3_A11661DisOrdComp, P000G3_A7739DisExp, P000G3_A1002DisNumTen, P000G3_n1002DisNumTen, P000G3_A11734DisCnoEncO, P000G3_A11864Nxt_artcli, P000G3_A11859Nxt_modelo, P000G3_A11861Nxt_statio, P000G3_A11860CpteId, P000G3_n11860CpteId,
            P000G3_A11863DptoID, P000G3_n11863DptoID, P000G3_A11862DesaID, P000G3_n11862DesaID, P000G3_A12328RevenID, P000G3_n12328RevenID, P000G3_A12768DisTpEstam, P000G3_A12765DisPriorid, P000G3_A12772DisProdID, P000G3_n12772DisProdID,
            P000G3_A12880DisOEKOTEX, P000G3_n12880DisOEKOTEX, P000G3_A13068DisLineaID, P000G3_n13068DisLineaID, P000G3_A13069DisCanalID, P000G3_n13069DisCanalID, P000G3_A13076DisLinPrd, P000G3_n13076DisLinPrd, P000G3_A13987DisArtDsc2, P000G3_A13233DisRGB,
            P000G3_A1430DisLoc, P000G3_A13986DisIdtx2, P000G3_n13986DisIdtx2, P000G3_A13080DisDGUltli, P000G3_A361DisCod, P000G3_A367DisEst, P000G3_A387DisPiePie, P000G3_n387DisPiePie, P000G3_A390DisTipCol, P000G3_n390DisTipCol,
            P000G3_A363DisColNum, P000G3_n363DisColNum, P000G3_A362DisColNom, P000G3_n362DisColNom, P000G3_A335DisArtCod, P000G3_A252CliCod, P000G3_A396EmprCod, P000G3_A365DisDes, P000G3_A360DisCliNum, P000G3_A337DisArtDsc,
            P000G3_A352DisArtTip, P000G3_A369DisFec, P000G3_A375DisNumUni, P000G3_A392DisUniMed, P000G3_A370DisFecCli, P000G3_A374DisNumPie, P000G3_A341DisArtOpe, P000G3_A359DisArtUrg, P000G3_A340DisArtMat, P000G3_A350DisArtRdt,
            P000G3_A353DisArtTr1, P000G3_A344DisArtPt1, P000G3_A354DisArtTr2, P000G3_A345DisArtPt2, P000G3_A355DisArtTr3, P000G3_A346DisArtPt3, P000G3_A356DisArtUr1, P000G3_A347DisArtPu1, P000G3_A357DisArtUr2, P000G3_A348DisArtPu2,
            P000G3_A358DisArtUr3, P000G3_A349DisArtPu3, P000G3_n349DisArtPu3, P000G3_A1232DisArtAcb, P000G3_A1233DisArtAc2, P000G3_A334DisArtAnh, P000G3_A1231DisArtAn1, P000G3_A343DisArtPle, P000G3_A339DisArtLar, P000G3_A351DisArtSua,
            P000G3_A333DisArtAca, P000G3_A336DisArtCor, P000G3_A338DisArtEnc, P000G3_A2831DisNumLot, P000G3_A2832DisKgsLot, P000G3_A2833DisMtrLot, P000G3_A4014DisTin, P000G3_A757PriCod, P000G3_A371DisFecEnt, P000G3_A342DisArtPes,
            P000G3_A1225DisGraCru, P000G3_A1195DisNomCli, P000G3_A1196DisNumCli, P000G3_A1197DisEncCom, P000G3_A1198DisEncAnh, P000G3_A1502DisPart, P000G3_A2310DisCliDes, P000G3_A2009DisTipDis, P000G3_n2009DisTipDis, P000G3_A2835DisPle2,
            P000G3_A5025DisGraCob, P000G3_A5024DisTipEst, P000G3_A2926DisPla, P000G3_A3127DisNumCor, P000G3_A3128DisAncSal1, P000G3_A3129DisAncSal2, P000G3_A3130DisAncSal3, P000G3_A3131DisGraAca2, P000G3_A3132DisGraCru2, P000G3_A1906DisGraAca,
            P000G3_A1907DisRdoN, P000G3_A1908DisRdoA, P000G3_A1013DibCli, P000G3_n1013DibCli, P000G3_A1014DibInt, P000G3_n1014DibInt, P000G3_A4468DisPelAnh, P000G3_A4469DisCruMts, P000G3_A4470DisCruKgs, P000G3_A4471DisCruEnr,
            P000G3_A4472DisLotPza, P000G3_n4472DisLotPza, P000G3_A4473DisLotMts, P000G3_A4474DisLotKgs, P000G3_A4475DisLotMaq, P000G3_n4475DisLotMaq, P000G3_A4476DisAcaFor, P000G3_n4476DisAcaFor, P000G3_A4477DisAcaBak, P000G3_A4478DisAcaAnh,
            P000G3_A4479DisAcaMar, P000G3_A2402DisManCod, P000G3_A3307DisManCod1, P000G3_A3308DisManCod2, P000G3_A4614DisMdlCod, P000G3_A4293DisNPzas, P000G3_n4293DisNPzas, P000G3_A4616DisHorEnt, P000G3_n4616DisHorEnt, P000G3_A4813DisEncCli,
            P000G3_A4720DisDishCod, P000G3_A5031DisCom, P000G3_n5031DisCom, P000G3_A5032DisEstTip, P000G3_A5252DisAcc, P000G3_A5350DisObsAnc, P000G3_A5349DisObsGrm, P000G3_A5366DisAntp, P000G3_A5405DisAntpT, P000G3_A1052DisObs,
            P000G3_A3627DisFecLan, P000G3_n3627DisFecLan, P000G3_A998DisNMtr, P000G3_A7738DisMaqEst, P000G3_A4615DisTam, P000G3_A2743DisNumTex1, P000G3_A7523DisRec, P000G3_A4785DisNroCor, P000G3_A9771DisItem1
            }
            , new Object[] {
            P000G4_A396EmprCod, P000G4_A361DisCod, P000G4_A673Piezas, P000G4_A55AlbRReo, P000G4_A44AlbRecCod
            }
            , new Object[] {
            P000G5_A361DisCod, P000G5_A396EmprCod, P000G5_A833TipDefCod
            }
            , new Object[] {
            P000G6_A396EmprCod, P000G6_A361DisCod, P000G6_A1057DisComAnh, P000G6_n1057DisComAnh, P000G6_A1058DisComMtr, P000G6_n1058DisComMtr, P000G6_A1059DisComPie, P000G6_n1059DisComPie, P000G6_A7735DisComObs, P000G6_n7735DisComObs,
            P000G6_A13072DisComDibC, P000G6_n13072DisComDibC, P000G6_A13073DisComDibI, P000G6_n13073DisComDibI, P000G6_A1032FonCod, P000G6_A1056DisComCod, P000G6_A2524DisComLin
            }
            , new Object[] {
            }
            , new Object[] {
            P000G8_A396EmprCod, P000G8_A361DisCod, P000G8_A13081DisDGLin, P000G8_A13082DisDGDibCl, P000G8_A13083DisDGDibIn, P000G8_A13085DisDGFondo, P000G8_A13084DisDGComb, P000G8_A13091DisDGObs, P000G8_A13086DisDGMts, P000G8_A13087DisDGPzs,
            P000G8_A13088DisDGAnc
            }
            , new Object[] {
            }
            , new Object[] {
            P000G10_A396EmprCod, P000G10_A361DisCod, P000G10_A376DisObsLin, P000G10_A377DisObsTxt
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P000G14_A396EmprCod, P000G14_A361DisCod, P000G14_A380DisPieCod, P000G14_A382DisPieKil, P000G14_A384DisPieMet, P000G14_A2184DisPieLoc, P000G14_A2185DisPieAnc, P000G14_A6490DisPieIdPz, P000G14_n6490DisPieIdPz, P000G14_A8839DisPieCodB,
            P000G14_n8839DisPieCodB, P000G14_A44AlbRecCod
            }
            , new Object[] {
            }
            , new Object[] {
            P000G16_A396EmprCod, P000G16_A361DisCod, P000G16_A595Kilos, P000G16_A631Metros, P000G16_A673Piezas, P000G16_A44AlbRecCod
            }
            , new Object[] {
            }
            , new Object[] {
            P000G18_A396EmprCod, P000G18_A361DisCod, P000G18_A44AlbRecCod, P000G18_A673Piezas
            }
            , new Object[] {
            P000G19_A396EmprCod, P000G19_A5206Nr_albrecc, P000G19_n5206Nr_albrecc, P000G19_A5198Nr_codigo, P000G19_A5906Nr_OpeCod, P000G19_n5906Nr_OpeCod, P000G19_A5904Nr_TipCsCL, P000G19_n5904Nr_TipCsCL
            }
            , new Object[] {
            P000G21_A319DefPor, P000G21_A14357DefMaqcod, P000G21_n14357DefMaqcod, P000G21_A14358DefCausa, P000G21_n14358DefCausa, P000G21_A14359DefResp, P000G21_n14359DefResp, P000G21_A833TipDefCod, P000G21_A361DisCod, P000G21_A396EmprCod,
            P000G21_A387DisPiePie, P000G21_n387DisPiePie
            }
            , new Object[] {
            }
            , new Object[] {
            P000G23_A396EmprCod, P000G23_A361DisCod, P000G23_A13376DisTraID
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P000G26_A252CliCod, P000G26_n252CliCod, P000G26_A334DisArtAnh, P000G26_A1013DibCli, P000G26_n1013DibCli, P000G26_A1014DibInt, P000G26_n1014DibInt, P000G26_A130BarCodPar, P000G26_A132BarCodReo, P000G26_A129BarCod,
            P000G26_A361DisCod, P000G26_A396EmprCod, P000G26_A6841DibDsc, P000G26_n6841DibDsc, P000G26_A3911TipMqnCod, P000G26_n3911TipMqnCod, P000G26_A1607DibMed, P000G26_n1607DibMed, P000G26_A1606DibTipRas, P000G26_n1606DibTipRas,
            P000G26_A7516DisGraTam, P000G26_n7516DisGraTam, P000G26_A2009DisTipDis, P000G26_n2009DisTipDis, P000G26_A7514DisOrdGra
            }
            , new Object[] {
            }
            , new Object[] {
            P000G28_A7514DisOrdGra, P000G28_A361DisCod, P000G28_A396EmprCod
            }
            , new Object[] {
            P000G29_A334DisArtAnh, P000G29_A7511DisFacSep, P000G29_n7511DisFacSep, P000G29_A130BarCodPar, P000G29_A132BarCodReo, P000G29_A129BarCod, P000G29_A396EmprCod, P000G29_A2009DisTipDis, P000G29_n2009DisTipDis, P000G29_A7513DisOrdSep,
            P000G29_A361DisCod
            }
            , new Object[] {
            }
            , new Object[] {
            P000G31_A7513DisOrdSep, P000G31_A361DisCod, P000G31_A396EmprCod
            }
            , new Object[] {
            P000G32_A361DisCod, P000G32_A396EmprCod, P000G32_A1196DisNumCli, P000G32_A1195DisNomCli, P000G32_A390DisTipCol, P000G32_n390DisTipCol, P000G32_A363DisColNum, P000G32_n363DisColNum, P000G32_A362DisColNom, P000G32_n362DisColNom,
            P000G32_A335DisArtCod, P000G32_A252CliCod
            }
            , new Object[] {
            P000G33_A213BarSit, P000G33_A130BarCodPar, P000G33_A132BarCodReo, P000G33_A129BarCod, P000G33_A7515DisDesCol, P000G33_n7515DisDesCol, P000G33_A361DisCod, P000G33_A396EmprCod
            }
            , new Object[] {
            }
            , new Object[] {
            P000G35_A3608DisRefAlbR, P000G35_n3608DisRefAlbR, P000G35_A3401DisRefKgs, P000G35_n3401DisRefKgs, P000G35_A3402DisRefMts, P000G35_n3402DisRefMts, P000G35_A3403DisRefPie, P000G35_n3403DisRefPie, P000G35_A361DisCod, P000G35_A396EmprCod,
            P000G35_A5861DisRefPzII, P000G35_n5861DisRefPzII, P000G35_A3398DisRefBarC, P000G35_A3399DisRefBCRe, P000G35_A3400DisRefBCPa, P000G35_A3607DisRefBPie
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P000G38_A602MaqCod, P000G38_A6188MaqTArt, P000G38_A396EmprCod, P000G38_A6190TipArtRb, P000G38_n6190TipArtRb, P000G38_A6233TipArtVmn, P000G38_n6233TipArtVmn, P000G38_A6234TipArtVmx, P000G38_n6234TipArtVmx
            }
            , new Object[] {
            P000G39_A1202MacDisCod, P000G39_A396EmprCod, P000G39_A1203MacBarCod, P000G39_A1204MacBarReo, P000G39_A1205MacBarPar, P000G39_A1199MacCod, P000G39_A1201MacLin
            }
            , new Object[] {
            }
            , new Object[] {
            P000G41_A377DisObsTxt, P000G41_A361DisCod, P000G41_A396EmprCod, P000G41_A376DisObsLin
            }
            , new Object[] {
            P000G42_A377DisObsTxt, P000G42_A361DisCod, P000G42_A396EmprCod, P000G42_A376DisObsLin
            }
            , new Object[] {
            P000G43_A65ArtCod, P000G43_A252CliCod, P000G43_A7415ArtPmlCru, P000G43_n7415ArtPmlCru, P000G43_A396EmprCod
            }
            , new Object[] {
            P000G44_A361DisCod, P000G44_A396EmprCod, P000G44_A673Piezas, P000G44_A50AlbRLoc, P000G44_A44AlbRecCod
            }
            , new Object[] {
            P000G45_A595Kilos
            }
            , new Object[] {
            P000G46_A382DisPieKil
            }
            , new Object[] {
            P000G47_A631Metros
            }
            , new Object[] {
            P000G48_A384DisPieMet
            }
            , new Object[] {
            P000G49_A673Piezas
            }
         }
      );
      AV182Pgmname = "PGENBARM" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      AV182Pgmname = "PGENBARM" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte A12768DisTpEstam ;
   private byte A12765DisPriorid ;
   private byte A13080DisDGUltli ;
   private byte A367DisEst ;
   private byte A390DisTipCol ;
   private byte A359DisArtUrg ;
   private byte A5025DisGraCob ;
   private byte A5024DisTipEst ;
   private byte A2743DisNumTex1 ;
   private byte AV18Flag ;
   private byte AV68DisReo ;
   private byte AV21IntCod ;
   private byte AV22DisComULin ;
   private byte AV23DisDGUltlin ;
   private byte A2524DisComLin ;
   private byte A132BarCodReo ;
   private byte A1542BarComPEst ;
   private byte A2131RecObsULin ;
   private byte A13081DisDGLin ;
   private byte A13093BarDGLin ;
   private byte AV89Cont_not ;
   private byte AV112Vincolor ;
   private byte AV87F_carvema ;
   private byte AV155WorkNotas ;
   private byte A376DisObsLin ;
   private byte A188BarNotLin ;
   private byte AV28TipColCod ;
   private byte A218BarTipCol ;
   private byte AV131Sequeiro ;
   private byte AV133Suprema ;
   private byte A193BarOpeEsp ;
   private byte A235BarUrg ;
   private byte A146BarEst ;
   private byte A213BarSit ;
   private byte AV91TintSN ;
   private byte A147BarEstCol ;
   private byte A138BarConReo ;
   private byte A148BarEstReo ;
   private byte A196BarOrdReo ;
   private byte A178BarLis ;
   private byte A2830BarIntPer ;
   private byte AV150Velluts ;
   private byte AV144erfoc ;
   private byte A2512BarComULin ;
   private byte A13092BarDGUltLi ;
   private byte A4400BarSitEst ;
   private byte A5026BarTipEst ;
   private byte A5027BarGraCob ;
   private byte AV143Prec_uni ;
   private byte AV94F_moda21 ;
   private byte AV149Tintex ;
   private byte A646NotUltLin ;
   private byte AV90F_pais ;
   private byte AV142Coloretto ;
   private byte AV92F_lavand ;
   private byte AV98F_tinamar ;
   private byte AV123FlagTint ;
   private byte AV125Kohler ;
   private byte AV128CtrlUsu ;
   private byte AV107Induyco ;
   private byte A3594BarPriTin ;
   private byte AV156Tintutex ;
   private byte AV139Eliot ;
   private byte A2752BarNumTex1 ;
   private byte A6434BarAsi ;
   private byte AV154SinCrudo ;
   private byte AV76FlagPer ;
   private byte AV153Moda21 ;
   private byte AV158Exportar ;
   private byte A12767BarTpEstam ;
   private byte A14330BarPriorid ;
   private byte A1140DisBarReo ;
   private byte AV160anahuac ;
   private byte A201BarPieEst ;
   private byte A9800BarNPes ;
   private byte AV103VERTIC ;
   private byte AV148StkInt ;
   private byte AV132Tejido ;
   private byte AV81F_nr ;
   private byte AV43Barcodreo ;
   private byte AV79VERTI3 ;
   private byte A545HisCodReo ;
   private byte A572HisTipCol ;
   private byte A554HisOrdReo ;
   private byte A548HisEstReo ;
   private byte AV157shablones ;
   private byte AV183GXLvl601 ;
   private byte A3911TipMqnCod ;
   private byte A7514DisOrdGra ;
   private byte AV47TipMqnCod ;
   private byte W132BarCodReo ;
   private byte A7519OGSMaq ;
   private byte AV186GXLvl650 ;
   private byte A7511DisFacSep ;
   private byte A7513DisOrdSep ;
   private byte AV138ArtValPrd ;
   private byte GXv_int7[] ;
   private byte A7515DisDesCol ;
   private byte AV190GXLvl714 ;
   private byte A3399DisRefBCRe ;
   private byte A1204MacBarReo ;
   private byte AV115PLinea ;
   private byte AV120Salayet ;
   private byte AV130Pizarro ;
   private byte AV78FlagVTab ;
   private byte AV82Hidro ;
   private byte AV83Fidel ;
   private byte AV105Vtabuas ;
   private byte AV129Staack ;
   private byte AV136Magosa ;
   private byte AV141Cladd ;
   private byte AV159DatosArticulo ;
   private byte GXt_int17 ;
   private byte GXv_int9[] ;
   private short A11860CpteId ;
   private short A11863DptoID ;
   private short A11862DesaID ;
   private short A13068DisLineaID ;
   private short A387DisPiePie ;
   private short A352DisArtTip ;
   private short A374DisNumPie ;
   private short A344DisArtPt1 ;
   private short A345DisArtPt2 ;
   private short A346DisArtPt3 ;
   private short A347DisArtPu1 ;
   private short A348DisArtPu2 ;
   private short A349DisArtPu3 ;
   private short A1232DisArtAcb ;
   private short A1233DisArtAc2 ;
   private short A334DisArtAnh ;
   private short A1231DisArtAn1 ;
   private short A342DisArtPes ;
   private short A1225DisGraCru ;
   private short A1502DisPart ;
   private short A3127DisNumCor ;
   private short A3128DisAncSal1 ;
   private short A3129DisAncSal2 ;
   private short A3130DisAncSal3 ;
   private short A3131DisGraAca2 ;
   private short A3132DisGraCru2 ;
   private short A1906DisGraAca ;
   private short A4468DisPelAnh ;
   private short A4472DisLotPza ;
   private short A4478DisAcaAnh ;
   private short A2402DisManCod ;
   private short A3307DisManCod1 ;
   private short A3308DisManCod2 ;
   private short A386DisPieNor ;
   private short AV20TipDefCod ;
   private short A833TipDefCod ;
   private short AV74Matiz ;
   private short A1057DisComAnh ;
   private short A1059DisComPie ;
   private short A1539BarComAnh ;
   private short A1543BarComPie ;
   private short A1544BarComPLan ;
   private short A2117RecEstAnh ;
   private short A2073BarNumMol ;
   private short Gx_err ;
   private short A13088DisDGAnc ;
   private short A13099BarDGPzs ;
   private short A13101BarDGAncho ;
   private short AV29DisArtTip ;
   private short A217BarTipArt ;
   private short AV165fabricato ;
   private short A191BarNumPie ;
   private short A224BarTraP1 ;
   private short A225BarTraP2 ;
   private short A226BarTraP3 ;
   private short A232BarUrdP1 ;
   private short A233BarUrdP2 ;
   private short A234BarUrdP3 ;
   private short A127BarAncCru1 ;
   private short A128BarAncCru2 ;
   private short A125BarAncAca1 ;
   private short A126BarAncAca2 ;
   private short AV35Barpes ;
   private short AV163endutex ;
   private short A189BarNumAny ;
   private short AV39disartpes ;
   private short A864BarPes ;
   private short A1226BarGraCru ;
   private short A921BarMatiz ;
   private short A1503BarPart ;
   private short A3133BarNumCor ;
   private short A3134BarAncSal1 ;
   private short A3135BarAncSal2 ;
   private short A3136BarAncSal3 ;
   private short A3137BarGraAca2 ;
   private short A3138BarGraCru2 ;
   private short A1909BarGraAca ;
   private short A4456BarPelAnh ;
   private short A4460BarLotPza ;
   private short A4466BarAcaAnh ;
   private short A2400BarManCod ;
   private short A3311BarManCod1 ;
   private short A3312BarManCod2 ;
   private short A4975BarNumReo ;
   private short GXv_int8[] ;
   private short AV93Tiempo_a ;
   private short GXv_int13[] ;
   private short A5054BarBp13 ;
   private short AV95Dias_a ;
   private short AV97Dias_ac ;
   private short AV96AlaCol ;
   private short A2459BarTemSec ;
   private short A2458BarObsVL ;
   private short A11853Nxt_cpeID ;
   private short A11855Nxt_dpoID ;
   private short A11857Nxt_desaID ;
   private short A13070BarLineaID ;
   private short AV164localizacionhelipuerto ;
   private short A2185DisPieAnc ;
   private short A1691BarPieAnc ;
   private short AV106TipCSClq ;
   private short A5904Nr_TipCsCL ;
   private short A319DefPor ;
   private short A14358DefCausa ;
   private short A14359DefResp ;
   private short W833TipDefCod ;
   private short A571HisTipArt ;
   private short A553HisNumPie ;
   private short A5085CodCausa ;
   private short A7000Rps_Cod ;
   private short A3403DisRefPie ;
   private short A6188MaqTArt ;
   private short A1201MacLin ;
   private short A7415ArtPmlCru ;
   private int AV16DisCod ;
   private int AV31BarCodPar ;
   private int A13069DisCanalID ;
   private int A361DisCod ;
   private int A363DisColNum ;
   private int A252CliCod ;
   private int A2831DisNumLot ;
   private int A1196DisNumCli ;
   private int A2310DisCliDes ;
   private int A1014DibInt ;
   private int A4476DisAcaFor ;
   private int A4293DisNPzas ;
   private int A4785DisNroCor ;
   private int W361DisCod ;
   private int AV17ContVal ;
   private int A673Piezas ;
   private int A44AlbRecCod ;
   private int A13073DisComDibI ;
   private int GX_INS542 ;
   private int A129BarCod ;
   private int A2509BarCodLan ;
   private int A13075BarComDibI ;
   private int A13083DisDGDibIn ;
   private int A13087DisDGPzs ;
   private int GX_INS1793 ;
   private int A13095BarDGDibIn ;
   private int GX_INS17 ;
   private int AV24CliCod ;
   private int AV27ForColNum ;
   private int GX_INS12 ;
   private int AV30BarCod ;
   private int A136BarColNum ;
   private int A236BarVolMaq ;
   private int AV33MaqVolMed ;
   private int A2826BarNumLot ;
   private int AV80Num_fic ;
   private int A1235BarNumCli ;
   private int A2311BarCliDes ;
   private int A1799BarDibInt ;
   private int A4464BarAcaFor ;
   private int A4612BarPzas ;
   private int A144BarDisOri ;
   private int A4836BarAudSup ;
   private int A13071BarCanalID ;
   private int A3595BarMacCod ;
   private int GX_INS153 ;
   private int A1146DisDisCod ;
   private int A1139DisBarCod ;
   private int AV73ContPie ;
   private int AV42AlbRecCod ;
   private int GX_INS18 ;
   private int W44AlbRecCod ;
   private int A1501BarPiePie ;
   private int AV44Nr_codigo ;
   private int AV45Nr_opecod ;
   private int A5206Nr_albrecc ;
   private int A5198Nr_codigo ;
   private int A5906Nr_OpeCod ;
   private int GX_INS60 ;
   private int W252CliCod ;
   private int A539HisBarCod ;
   private int A547HisColNum ;
   private int A2297HisReoTn ;
   private int A5356Hisoperar ;
   private int A8890HisNumCli ;
   private int GX_INS1877 ;
   private int W129BarCod ;
   private int GX_INS996 ;
   private int A7049OGSCod ;
   private int A10886OGSDibI ;
   private int GX_INS1014 ;
   private int A7145OSSCod ;
   private int GXt_int16 ;
   private int A3608DisRefAlbR ;
   private int A3398DisRefBarC ;
   private int AV53DisRefAlbR ;
   private int AV55TipArtVmn ;
   private int AV56TipArtVmx ;
   private int A6233TipArtVmn ;
   private int A6234TipArtVmx ;
   private int A1202MacDisCod ;
   private int A1203MacBarCod ;
   private int A1199MacCod ;
   private int GXv_int11[] ;
   private int AV58maqVolMax ;
   private int GXv_int10[] ;
   private int AV59MaqVolMin ;
   private int GXv_int6[] ;
   private int GXv_int3[] ;
   private int E361DisCod ;
   private int X673Piezas ;
   private long A13233DisRGB ;
   private long AV161selected ;
   private long GXv_int15[] ;
   private long A13234BarRGB ;
   private java.math.BigDecimal A375DisNumUni ;
   private java.math.BigDecimal A350DisArtRdt ;
   private java.math.BigDecimal A2832DisKgsLot ;
   private java.math.BigDecimal A2833DisMtrLot ;
   private java.math.BigDecimal A1197DisEncCom ;
   private java.math.BigDecimal A1198DisEncAnh ;
   private java.math.BigDecimal A1907DisRdoN ;
   private java.math.BigDecimal A1908DisRdoA ;
   private java.math.BigDecimal A4469DisCruMts ;
   private java.math.BigDecimal A4470DisCruKgs ;
   private java.math.BigDecimal A4473DisLotMts ;
   private java.math.BigDecimal A4474DisLotKgs ;
   private java.math.BigDecimal A385DisPieMtr ;
   private java.math.BigDecimal A381DisPieKgm ;
   private java.math.BigDecimal A1058DisComMtr ;
   private java.math.BigDecimal A1541BarComMtr ;
   private java.math.BigDecimal A1540BarComMLan ;
   private java.math.BigDecimal A2072BarMtrRep ;
   private java.math.BigDecimal A2071BarMtrEst ;
   private java.math.BigDecimal A13086DisDGMts ;
   private java.math.BigDecimal A13100BarDGMts ;
   private java.math.BigDecimal A192BarNumUni ;
   private java.math.BigDecimal A211BarRdt ;
   private java.math.BigDecimal A2827BarKgsLot ;
   private java.math.BigDecimal A2828BarMtrLot ;
   private java.math.BigDecimal A141BarCosPro ;
   private java.math.BigDecimal A140BarCosAny ;
   private java.math.BigDecimal A169BarKgsFac ;
   private java.math.BigDecimal A1223BarEncCom ;
   private java.math.BigDecimal A1224BarEncAnh ;
   private java.math.BigDecimal A1910BarRdoN ;
   private java.math.BigDecimal A1911BarRdoA ;
   private java.math.BigDecimal A4457BarCruMts ;
   private java.math.BigDecimal A4458BarCruKgs ;
   private java.math.BigDecimal A4461BarLotMts ;
   private java.math.BigDecimal A4462BarLotKgs ;
   private java.math.BigDecimal A382DisPieKil ;
   private java.math.BigDecimal A384DisPieMet ;
   private java.math.BigDecimal A203BarPieKil ;
   private java.math.BigDecimal A205BarPieMet ;
   private java.math.BigDecimal AV71TotKil ;
   private java.math.BigDecimal AV72TotMet ;
   private java.math.BigDecimal A595Kilos ;
   private java.math.BigDecimal A631Metros ;
   private java.math.BigDecimal A540HisBarKgm ;
   private java.math.BigDecimal A541HisBarMtr ;
   private java.math.BigDecimal A549HisKgmOri ;
   private java.math.BigDecimal A552HisMtrOri ;
   private java.math.BigDecimal AV137Artextil ;
   private java.math.BigDecimal A7141OGSAnc ;
   private java.math.BigDecimal A7151OSSAnc ;
   private java.math.BigDecimal A3401DisRefKgs ;
   private java.math.BigDecimal A3402DisRefMts ;
   private java.math.BigDecimal AV54TIPARTRB ;
   private java.math.BigDecimal A6190TipArtRb ;
   private java.math.BigDecimal AV127Kgs ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private java.math.BigDecimal X595Kilos ;
   private java.math.BigDecimal X382DisPieKil ;
   private java.math.BigDecimal X631Metros ;
   private java.math.BigDecimal X384DisPieMet ;
   private String AV15EmprCod ;
   private String AV32MaqCod ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A9772DisItem2 ;
   private String A9773DisItem3 ;
   private String A9774DisItem4 ;
   private String A9786DisItem5 ;
   private String A9787DisItem6 ;
   private String A10887Cod_Idtx ;
   private String A8886DisDest ;
   private String A11659MarcaId ;
   private String A7739DisExp ;
   private String A1002DisNumTen ;
   private String A11864Nxt_artcli ;
   private String A11859Nxt_modelo ;
   private String A11861Nxt_statio ;
   private String A12328RevenID ;
   private String A12772DisProdID ;
   private String A12880DisOEKOTEX ;
   private String A13076DisLinPrd ;
   private String A1430DisLoc ;
   private String A13986DisIdtx2 ;
   private String A362DisColNom ;
   private String A335DisArtCod ;
   private String A365DisDes ;
   private String A360DisCliNum ;
   private String A337DisArtDsc ;
   private String A392DisUniMed ;
   private String A341DisArtOpe ;
   private String A340DisArtMat ;
   private String A353DisArtTr1 ;
   private String A354DisArtTr2 ;
   private String A355DisArtTr3 ;
   private String A356DisArtUr1 ;
   private String A357DisArtUr2 ;
   private String A358DisArtUr3 ;
   private String A343DisArtPle ;
   private String A339DisArtLar ;
   private String A351DisArtSua ;
   private String A333DisArtAca ;
   private String A336DisArtCor ;
   private String A338DisArtEnc ;
   private String A4014DisTin ;
   private String A757PriCod ;
   private String A1195DisNomCli ;
   private String A2009DisTipDis ;
   private String A2835DisPle2 ;
   private String A2926DisPla ;
   private String A1013DibCli ;
   private String A4471DisCruEnr ;
   private String A4475DisLotMaq ;
   private String A4477DisAcaBak ;
   private String A4479DisAcaMar ;
   private String A4614DisMdlCod ;
   private String A4813DisEncCli ;
   private String A4720DisDishCod ;
   private String A5031DisCom ;
   private String A5032DisEstTip ;
   private String A5252DisAcc ;
   private String A5350DisObsAnc ;
   private String A5349DisObsGrm ;
   private String A5366DisAntp ;
   private String A5405DisAntpT ;
   private String A1052DisObs ;
   private String A998DisNMtr ;
   private String A7738DisMaqEst ;
   private String A4615DisTam ;
   private String A7523DisRec ;
   private String A9771DisItem1 ;
   private String A475FindCol ;
   private String W396EmprCod ;
   private String AV19Disacc ;
   private String A55AlbRReo ;
   private String A7735DisComObs ;
   private String A13072DisComDibC ;
   private String A1032FonCod ;
   private String A1056DisComCod ;
   private String A130BarCodPar ;
   private String A2069BarComEst ;
   private String A2510BarComPri ;
   private String A7734BarComObs ;
   private String A13074BarComDibC ;
   private String Gx_emsg ;
   private String A13082DisDGDibCl ;
   private String A13085DisDGFondo ;
   private String A13084DisDGComb ;
   private String A13091DisDGObs ;
   private String A13094BarDGDibCl ;
   private String A13097BarDGFOndo ;
   private String A13096BarDGComb ;
   private String A13098BarDGObs ;
   private String AV88CodPar ;
   private String A377DisObsTxt ;
   private String A187BarNotDsc ;
   private String AV25DisArtCod ;
   private String AV26ForColNom ;
   private String AV75Mensa ;
   private String A143BarDisNum ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A228BarUniMed ;
   private String A180BarMaqCod ;
   private String A182BarMat ;
   private String A221BarTra1 ;
   private String A222BarTra2 ;
   private String A223BarTra3 ;
   private String A229BarUrd1 ;
   private String A230BarUrd2 ;
   private String A231BarUrd3 ;
   private String A206BarPle ;
   private String A177BarLar ;
   private String A214BarSua ;
   private String A118BarAcaQui ;
   private String A139BarCorOri ;
   private String A145BarEncOri ;
   private String AV162Disloc ;
   private String A209BarPri ;
   private String A137BarConPar ;
   private String A120BarAgrEst ;
   private String A1234BarNomCli ;
   private String A2010BarTipDis ;
   private String A2485BarColPes ;
   private String A2498BarPrdPes ;
   private String A2499BarRDos1 ;
   private String A2500BarRDos2 ;
   private String A2836BarPle2 ;
   private String A3030BarPlf ;
   private String A1798BarDibCli ;
   private String A4016BarTin ;
   private String A4459BarCruEnr ;
   private String A4463BarLotMaq ;
   private String A4465BarAcaBak ;
   private String A4467BarAcaMar ;
   private String A4609BarMdlCod ;
   private String A4812BarEncCli ;
   private String A2460BarTipAca ;
   private String A4716BarDishCod ;
   private String A5033BarCom ;
   private String A5034BarEstTip ;
   private String A5253BarAcc ;
   private String A5352BarObsAnc ;
   private String A5351BarObsGrm ;
   private String A5367BarAntp ;
   private String A5406BarAntpT ;
   private String A2454BarGirar ;
   private String AV99Usurcod_a ;
   private String AV37UsurCod ;
   private String AV100Fecha_a ;
   private String A4835BarAudOpeN ;
   private String Gx_time ;
   private String A4837BarAudSupN ;
   private String A1500BarNMtr ;
   private String A7733BarMaqEst ;
   private String A5293BarCodBan ;
   private String A4610BarTam ;
   private String A3746BarNPed ;
   private String A9775BarItem1 ;
   private String A9776barItem2 ;
   private String A9777BarItem3 ;
   private String A9778BarItem4 ;
   private String A9789BarItem5 ;
   private String A9790BarItem6 ;
   private String A1878BarNumTen ;
   private String A2829BarProPer ;
   private String AV41BarProPer ;
   private String A2445BarEntEnE ;
   private String A181BarMaqPro ;
   private String A5291BarTipCor ;
   private String A11852Nxt_ArtCl2 ;
   private String A11850Nxt_Mdlo2 ;
   private String A11851Nxt_Sta2 ;
   private String A12329SubRevID ;
   private String A12774BarProdID ;
   private String A12881BarOEKOTEX ;
   private String A13077BarLinPrd ;
   private String A12809BarLocTel ;
   private String A1431BarLocDis ;
   private String A13908BarIdtx2 ;
   private String A1141DisBarPar ;
   private String A380DisPieCod ;
   private String A2184DisPieLoc ;
   private String A6490DisPieIdPz ;
   private String A8839DisPieCodB ;
   private String A200BarPieCod ;
   private String A2186BarPieLoc ;
   private String A6489BarPieIdPz ;
   private String A8907PzaB80 ;
   private String A8838CodBarPz ;
   private String A13988BarPieVtx ;
   private String AV102HRStkInt ;
   private String AV134BarCodparp ;
   private String A14357DefMaqcod ;
   private String W602MaqCod ;
   private String A602MaqCod ;
   private String A544HisCodPar ;
   private String A542HisBarSer ;
   private String A546HisColNom ;
   private String A2299HisReoDsc ;
   private String A8889HisNomCli ;
   private String A13698HisreoLote ;
   private String A13376DisTraID ;
   private String A13905BarTraID ;
   private String AV182Pgmname ;
   private String AV38Station ;
   private String A6841DibDsc ;
   private String A1607DibMed ;
   private String A1606DibTipRas ;
   private String A7516DisGraTam ;
   private String AV46DibDsc ;
   private String AV48DibMed ;
   private String AV49DibTipRas ;
   private String AV50DisGraTam ;
   private String W130BarCodPar ;
   private String A7050OGSEst ;
   private String A7051OGSUsuCre ;
   private String A7521OGSDsc ;
   private String A7520OGSSeg ;
   private String A7522OGSTam ;
   private String A10885OGSDibC ;
   private String A7146OSSEst ;
   private String A7147OSSUsuCre ;
   private String A7152OSSFac ;
   private String GXv_char2[] ;
   private String A5861DisRefPzII ;
   private String A3400DisRefBCPa ;
   private String A3607DisRefBPie ;
   private String AV104DupliPz ;
   private String A1205MacBarPar ;
   private String GXt_char1 ;
   private String AV57EmprNom ;
   private String GXv_char4[] ;
   private String GXv_char18[] ;
   private String GXv_char5[] ;
   private String A65ArtCod ;
   private String A50AlbRLoc ;
   private String E396EmprCod ;
   private java.util.Date A4616DisHorEnt ;
   private java.util.Date A4611BarHorEnt ;
   private java.util.Date A4613BarHorReg ;
   private java.util.Date A8097BarFecHis ;
   private java.util.Date A7052OGSFchCre ;
   private java.util.Date A7054OGSFchRea ;
   private java.util.Date A7148OSSFchCre ;
   private java.util.Date A7150OSSFchRea ;
   private java.util.Date A369DisFec ;
   private java.util.Date A370DisFecCli ;
   private java.util.Date A371DisFecEnt ;
   private java.util.Date A3627DisFecLan ;
   private java.util.Date A2497BarFecIni ;
   private java.util.Date Gx_date ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date A155BarFecCli ;
   private java.util.Date A158BarFecFpr ;
   private java.util.Date AV40ForPreFec ;
   private java.util.Date GXv_date14[] ;
   private java.util.Date A1003BarFecLan ;
   private java.util.Date A161BarFecSal ;
   private java.util.Date A569HisReoFec ;
   private boolean returnInSub ;
   private boolean n10887Cod_Idtx ;
   private boolean n11659MarcaId ;
   private boolean n1002DisNumTen ;
   private boolean n11860CpteId ;
   private boolean n11863DptoID ;
   private boolean n11862DesaID ;
   private boolean n12328RevenID ;
   private boolean n12772DisProdID ;
   private boolean n12880DisOEKOTEX ;
   private boolean n13068DisLineaID ;
   private boolean n13069DisCanalID ;
   private boolean n13076DisLinPrd ;
   private boolean n13986DisIdtx2 ;
   private boolean n387DisPiePie ;
   private boolean n390DisTipCol ;
   private boolean n363DisColNum ;
   private boolean n362DisColNom ;
   private boolean n252CliCod ;
   private boolean n349DisArtPu3 ;
   private boolean n2009DisTipDis ;
   private boolean n1013DibCli ;
   private boolean n1014DibInt ;
   private boolean n4472DisLotPza ;
   private boolean n4475DisLotMaq ;
   private boolean n4476DisAcaFor ;
   private boolean n4293DisNPzas ;
   private boolean n4616DisHorEnt ;
   private boolean n5031DisCom ;
   private boolean n3627DisFecLan ;
   private boolean n833TipDefCod ;
   private boolean n1057DisComAnh ;
   private boolean n1058DisComMtr ;
   private boolean n1059DisComPie ;
   private boolean n7735DisComObs ;
   private boolean n13072DisComDibC ;
   private boolean n13073DisComDibI ;
   private boolean n129BarCod ;
   private boolean n132BarCodReo ;
   private boolean n130BarCodPar ;
   private boolean n1539BarComAnh ;
   private boolean n1541BarComMtr ;
   private boolean n1543BarComPie ;
   private boolean n1540BarComMLan ;
   private boolean n1544BarComPLan ;
   private boolean n1542BarComPEst ;
   private boolean n2069BarComEst ;
   private boolean n2117RecEstAnh ;
   private boolean n2072BarMtrRep ;
   private boolean n2073BarNumMol ;
   private boolean n2509BarCodLan ;
   private boolean n2510BarComPri ;
   private boolean n2131RecObsULin ;
   private boolean n2071BarMtrEst ;
   private boolean n7734BarComObs ;
   private boolean n13074BarComDibC ;
   private boolean n13075BarComDibI ;
   private boolean n217BarTipArt ;
   private boolean n2512BarComULin ;
   private boolean n13092BarDGUltLi ;
   private boolean n4457BarCruMts ;
   private boolean n4458BarCruKgs ;
   private boolean n4460BarLotPza ;
   private boolean n4463BarLotMaq ;
   private boolean n4464BarAcaFor ;
   private boolean n4465BarAcaBak ;
   private boolean n4612BarPzas ;
   private boolean n4611BarHorEnt ;
   private boolean n4613BarHorReg ;
   private boolean n646NotUltLin ;
   private boolean n5054BarBp13 ;
   private boolean n4835BarAudOpeN ;
   private boolean n1003BarFecLan ;
   private boolean n4837BarAudSupN ;
   private boolean n4845BarAudObs ;
   private boolean n2458BarObsVL ;
   private boolean n11853Nxt_cpeID ;
   private boolean n11855Nxt_dpoID ;
   private boolean n11857Nxt_desaID ;
   private boolean n12329SubRevID ;
   private boolean n12881BarOEKOTEX ;
   private boolean n13907BarSerDsc2 ;
   private boolean n13908BarIdtx2 ;
   private boolean n6490DisPieIdPz ;
   private boolean n8839DisPieCodB ;
   private boolean n2186BarPieLoc ;
   private boolean n1691BarPieAnc ;
   private boolean n6489BarPieIdPz ;
   private boolean n8907PzaB80 ;
   private boolean n8838CodBarPz ;
   private boolean n9800BarNPes ;
   private boolean n5206Nr_albrecc ;
   private boolean n5906Nr_OpeCod ;
   private boolean n5904Nr_TipCsCL ;
   private boolean n14357DefMaqcod ;
   private boolean n14358DefCausa ;
   private boolean n14359DefResp ;
   private boolean n602MaqCod ;
   private boolean n571HisTipArt ;
   private boolean n542HisBarSer ;
   private boolean n546HisColNom ;
   private boolean n547HisColNum ;
   private boolean n572HisTipCol ;
   private boolean n553HisNumPie ;
   private boolean n540HisBarKgm ;
   private boolean n541HisBarMtr ;
   private boolean n569HisReoFec ;
   private boolean n549HisKgmOri ;
   private boolean n552HisMtrOri ;
   private boolean n554HisOrdReo ;
   private boolean n548HisEstReo ;
   private boolean n2297HisReoTn ;
   private boolean n2299HisReoDsc ;
   private boolean n5356Hisoperar ;
   private boolean n5085CodCausa ;
   private boolean n8889HisNomCli ;
   private boolean n8890HisNumCli ;
   private boolean n13698HisreoLote ;
   private boolean n7000Rps_Cod ;
   private boolean brk0G23 ;
   private boolean n6841DibDsc ;
   private boolean n3911TipMqnCod ;
   private boolean n1607DibMed ;
   private boolean n1606DibTipRas ;
   private boolean n7516DisGraTam ;
   private boolean n7050OGSEst ;
   private boolean n7051OGSUsuCre ;
   private boolean n7052OGSFchCre ;
   private boolean n7054OGSFchRea ;
   private boolean n7055OGSObs ;
   private boolean n7521OGSDsc ;
   private boolean n7519OGSMaq ;
   private boolean n7520OGSSeg ;
   private boolean n7141OGSAnc ;
   private boolean n7522OGSTam ;
   private boolean n10885OGSDibC ;
   private boolean n10886OGSDibI ;
   private boolean n7511DisFacSep ;
   private boolean n7146OSSEst ;
   private boolean n7147OSSUsuCre ;
   private boolean n7148OSSFchCre ;
   private boolean n7150OSSFchRea ;
   private boolean n7158OSSObs ;
   private boolean n7151OSSAnc ;
   private boolean n7152OSSFac ;
   private boolean n7515DisDesCol ;
   private boolean n3608DisRefAlbR ;
   private boolean n3401DisRefKgs ;
   private boolean n3402DisRefMts ;
   private boolean n3403DisRefPie ;
   private boolean n5861DisRefPzII ;
   private boolean n6190TipArtRb ;
   private boolean n6233TipArtVmn ;
   private boolean n6234TipArtVmx ;
   private boolean n7415ArtPmlCru ;
   private String AV51OGSObs ;
   private String A7055OGSObs ;
   private String AV52OSSObs ;
   private String A7158OSSObs ;
   private String A11661DisOrdComp ;
   private String A11734DisCnoEncO ;
   private String A13987DisArtDsc2 ;
   private String AV34Inc_obs ;
   private String A4845BarAudObs ;
   private String A11662BarOrdComp ;
   private String A14329BarCnoEncO ;
   private String A13907BarSerDsc2 ;
   private int[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P000G3_A9772DisItem2 ;
   private String[] P000G3_A9773DisItem3 ;
   private String[] P000G3_A9774DisItem4 ;
   private String[] P000G3_A9786DisItem5 ;
   private String[] P000G3_A9787DisItem6 ;
   private String[] P000G3_A10887Cod_Idtx ;
   private boolean[] P000G3_n10887Cod_Idtx ;
   private String[] P000G3_A8886DisDest ;
   private String[] P000G3_A11659MarcaId ;
   private boolean[] P000G3_n11659MarcaId ;
   private String[] P000G3_A11661DisOrdComp ;
   private String[] P000G3_A7739DisExp ;
   private String[] P000G3_A1002DisNumTen ;
   private boolean[] P000G3_n1002DisNumTen ;
   private String[] P000G3_A11734DisCnoEncO ;
   private String[] P000G3_A11864Nxt_artcli ;
   private String[] P000G3_A11859Nxt_modelo ;
   private String[] P000G3_A11861Nxt_statio ;
   private short[] P000G3_A11860CpteId ;
   private boolean[] P000G3_n11860CpteId ;
   private short[] P000G3_A11863DptoID ;
   private boolean[] P000G3_n11863DptoID ;
   private short[] P000G3_A11862DesaID ;
   private boolean[] P000G3_n11862DesaID ;
   private String[] P000G3_A12328RevenID ;
   private boolean[] P000G3_n12328RevenID ;
   private byte[] P000G3_A12768DisTpEstam ;
   private byte[] P000G3_A12765DisPriorid ;
   private String[] P000G3_A12772DisProdID ;
   private boolean[] P000G3_n12772DisProdID ;
   private String[] P000G3_A12880DisOEKOTEX ;
   private boolean[] P000G3_n12880DisOEKOTEX ;
   private short[] P000G3_A13068DisLineaID ;
   private boolean[] P000G3_n13068DisLineaID ;
   private int[] P000G3_A13069DisCanalID ;
   private boolean[] P000G3_n13069DisCanalID ;
   private String[] P000G3_A13076DisLinPrd ;
   private boolean[] P000G3_n13076DisLinPrd ;
   private String[] P000G3_A13987DisArtDsc2 ;
   private long[] P000G3_A13233DisRGB ;
   private String[] P000G3_A1430DisLoc ;
   private String[] P000G3_A13986DisIdtx2 ;
   private boolean[] P000G3_n13986DisIdtx2 ;
   private byte[] P000G3_A13080DisDGUltli ;
   private int[] P000G3_A361DisCod ;
   private byte[] P000G3_A367DisEst ;
   private short[] P000G3_A387DisPiePie ;
   private boolean[] P000G3_n387DisPiePie ;
   private byte[] P000G3_A390DisTipCol ;
   private boolean[] P000G3_n390DisTipCol ;
   private int[] P000G3_A363DisColNum ;
   private boolean[] P000G3_n363DisColNum ;
   private String[] P000G3_A362DisColNom ;
   private boolean[] P000G3_n362DisColNom ;
   private String[] P000G3_A335DisArtCod ;
   private int[] P000G3_A252CliCod ;
   private boolean[] P000G3_n252CliCod ;
   private String[] P000G3_A396EmprCod ;
   private String[] P000G3_A365DisDes ;
   private String[] P000G3_A360DisCliNum ;
   private String[] P000G3_A337DisArtDsc ;
   private short[] P000G3_A352DisArtTip ;
   private java.util.Date[] P000G3_A369DisFec ;
   private java.math.BigDecimal[] P000G3_A375DisNumUni ;
   private String[] P000G3_A392DisUniMed ;
   private java.util.Date[] P000G3_A370DisFecCli ;
   private short[] P000G3_A374DisNumPie ;
   private String[] P000G3_A341DisArtOpe ;
   private byte[] P000G3_A359DisArtUrg ;
   private String[] P000G3_A340DisArtMat ;
   private java.math.BigDecimal[] P000G3_A350DisArtRdt ;
   private String[] P000G3_A353DisArtTr1 ;
   private short[] P000G3_A344DisArtPt1 ;
   private String[] P000G3_A354DisArtTr2 ;
   private short[] P000G3_A345DisArtPt2 ;
   private String[] P000G3_A355DisArtTr3 ;
   private short[] P000G3_A346DisArtPt3 ;
   private String[] P000G3_A356DisArtUr1 ;
   private short[] P000G3_A347DisArtPu1 ;
   private String[] P000G3_A357DisArtUr2 ;
   private short[] P000G3_A348DisArtPu2 ;
   private String[] P000G3_A358DisArtUr3 ;
   private short[] P000G3_A349DisArtPu3 ;
   private boolean[] P000G3_n349DisArtPu3 ;
   private short[] P000G3_A1232DisArtAcb ;
   private short[] P000G3_A1233DisArtAc2 ;
   private short[] P000G3_A334DisArtAnh ;
   private short[] P000G3_A1231DisArtAn1 ;
   private String[] P000G3_A343DisArtPle ;
   private String[] P000G3_A339DisArtLar ;
   private String[] P000G3_A351DisArtSua ;
   private String[] P000G3_A333DisArtAca ;
   private String[] P000G3_A336DisArtCor ;
   private String[] P000G3_A338DisArtEnc ;
   private int[] P000G3_A2831DisNumLot ;
   private java.math.BigDecimal[] P000G3_A2832DisKgsLot ;
   private java.math.BigDecimal[] P000G3_A2833DisMtrLot ;
   private String[] P000G3_A4014DisTin ;
   private String[] P000G3_A757PriCod ;
   private java.util.Date[] P000G3_A371DisFecEnt ;
   private short[] P000G3_A342DisArtPes ;
   private short[] P000G3_A1225DisGraCru ;
   private String[] P000G3_A1195DisNomCli ;
   private int[] P000G3_A1196DisNumCli ;
   private java.math.BigDecimal[] P000G3_A1197DisEncCom ;
   private java.math.BigDecimal[] P000G3_A1198DisEncAnh ;
   private short[] P000G3_A1502DisPart ;
   private int[] P000G3_A2310DisCliDes ;
   private String[] P000G3_A2009DisTipDis ;
   private boolean[] P000G3_n2009DisTipDis ;
   private String[] P000G3_A2835DisPle2 ;
   private byte[] P000G3_A5025DisGraCob ;
   private byte[] P000G3_A5024DisTipEst ;
   private String[] P000G3_A2926DisPla ;
   private short[] P000G3_A3127DisNumCor ;
   private short[] P000G3_A3128DisAncSal1 ;
   private short[] P000G3_A3129DisAncSal2 ;
   private short[] P000G3_A3130DisAncSal3 ;
   private short[] P000G3_A3131DisGraAca2 ;
   private short[] P000G3_A3132DisGraCru2 ;
   private short[] P000G3_A1906DisGraAca ;
   private java.math.BigDecimal[] P000G3_A1907DisRdoN ;
   private java.math.BigDecimal[] P000G3_A1908DisRdoA ;
   private String[] P000G3_A1013DibCli ;
   private boolean[] P000G3_n1013DibCli ;
   private int[] P000G3_A1014DibInt ;
   private boolean[] P000G3_n1014DibInt ;
   private short[] P000G3_A4468DisPelAnh ;
   private java.math.BigDecimal[] P000G3_A4469DisCruMts ;
   private java.math.BigDecimal[] P000G3_A4470DisCruKgs ;
   private String[] P000G3_A4471DisCruEnr ;
   private short[] P000G3_A4472DisLotPza ;
   private boolean[] P000G3_n4472DisLotPza ;
   private java.math.BigDecimal[] P000G3_A4473DisLotMts ;
   private java.math.BigDecimal[] P000G3_A4474DisLotKgs ;
   private String[] P000G3_A4475DisLotMaq ;
   private boolean[] P000G3_n4475DisLotMaq ;
   private int[] P000G3_A4476DisAcaFor ;
   private boolean[] P000G3_n4476DisAcaFor ;
   private String[] P000G3_A4477DisAcaBak ;
   private short[] P000G3_A4478DisAcaAnh ;
   private String[] P000G3_A4479DisAcaMar ;
   private short[] P000G3_A2402DisManCod ;
   private short[] P000G3_A3307DisManCod1 ;
   private short[] P000G3_A3308DisManCod2 ;
   private String[] P000G3_A4614DisMdlCod ;
   private int[] P000G3_A4293DisNPzas ;
   private boolean[] P000G3_n4293DisNPzas ;
   private java.util.Date[] P000G3_A4616DisHorEnt ;
   private boolean[] P000G3_n4616DisHorEnt ;
   private String[] P000G3_A4813DisEncCli ;
   private String[] P000G3_A4720DisDishCod ;
   private String[] P000G3_A5031DisCom ;
   private boolean[] P000G3_n5031DisCom ;
   private String[] P000G3_A5032DisEstTip ;
   private String[] P000G3_A5252DisAcc ;
   private String[] P000G3_A5350DisObsAnc ;
   private String[] P000G3_A5349DisObsGrm ;
   private String[] P000G3_A5366DisAntp ;
   private String[] P000G3_A5405DisAntpT ;
   private String[] P000G3_A1052DisObs ;
   private java.util.Date[] P000G3_A3627DisFecLan ;
   private boolean[] P000G3_n3627DisFecLan ;
   private String[] P000G3_A998DisNMtr ;
   private String[] P000G3_A7738DisMaqEst ;
   private String[] P000G3_A4615DisTam ;
   private byte[] P000G3_A2743DisNumTex1 ;
   private String[] P000G3_A7523DisRec ;
   private int[] P000G3_A4785DisNroCor ;
   private String[] P000G3_A9771DisItem1 ;
   private String[] P000G4_A396EmprCod ;
   private int[] P000G4_A361DisCod ;
   private int[] P000G4_A673Piezas ;
   private String[] P000G4_A55AlbRReo ;
   private int[] P000G4_A44AlbRecCod ;
   private int[] P000G5_A361DisCod ;
   private String[] P000G5_A396EmprCod ;
   private short[] P000G5_A833TipDefCod ;
   private boolean[] P000G5_n833TipDefCod ;
   private String[] P000G6_A396EmprCod ;
   private int[] P000G6_A361DisCod ;
   private short[] P000G6_A1057DisComAnh ;
   private boolean[] P000G6_n1057DisComAnh ;
   private java.math.BigDecimal[] P000G6_A1058DisComMtr ;
   private boolean[] P000G6_n1058DisComMtr ;
   private short[] P000G6_A1059DisComPie ;
   private boolean[] P000G6_n1059DisComPie ;
   private String[] P000G6_A7735DisComObs ;
   private boolean[] P000G6_n7735DisComObs ;
   private String[] P000G6_A13072DisComDibC ;
   private boolean[] P000G6_n13072DisComDibC ;
   private int[] P000G6_A13073DisComDibI ;
   private boolean[] P000G6_n13073DisComDibI ;
   private String[] P000G6_A1032FonCod ;
   private String[] P000G6_A1056DisComCod ;
   private byte[] P000G6_A2524DisComLin ;
   private String[] P000G8_A396EmprCod ;
   private int[] P000G8_A361DisCod ;
   private byte[] P000G8_A13081DisDGLin ;
   private String[] P000G8_A13082DisDGDibCl ;
   private int[] P000G8_A13083DisDGDibIn ;
   private String[] P000G8_A13085DisDGFondo ;
   private String[] P000G8_A13084DisDGComb ;
   private String[] P000G8_A13091DisDGObs ;
   private java.math.BigDecimal[] P000G8_A13086DisDGMts ;
   private int[] P000G8_A13087DisDGPzs ;
   private short[] P000G8_A13088DisDGAnc ;
   private String[] P000G10_A396EmprCod ;
   private int[] P000G10_A361DisCod ;
   private byte[] P000G10_A376DisObsLin ;
   private String[] P000G10_A377DisObsTxt ;
   private String[] P000G14_A396EmprCod ;
   private int[] P000G14_A361DisCod ;
   private String[] P000G14_A380DisPieCod ;
   private java.math.BigDecimal[] P000G14_A382DisPieKil ;
   private java.math.BigDecimal[] P000G14_A384DisPieMet ;
   private String[] P000G14_A2184DisPieLoc ;
   private short[] P000G14_A2185DisPieAnc ;
   private String[] P000G14_A6490DisPieIdPz ;
   private boolean[] P000G14_n6490DisPieIdPz ;
   private String[] P000G14_A8839DisPieCodB ;
   private boolean[] P000G14_n8839DisPieCodB ;
   private int[] P000G14_A44AlbRecCod ;
   private String[] P000G16_A396EmprCod ;
   private int[] P000G16_A361DisCod ;
   private java.math.BigDecimal[] P000G16_A595Kilos ;
   private java.math.BigDecimal[] P000G16_A631Metros ;
   private int[] P000G16_A673Piezas ;
   private int[] P000G16_A44AlbRecCod ;
   private String[] P000G18_A396EmprCod ;
   private int[] P000G18_A361DisCod ;
   private int[] P000G18_A44AlbRecCod ;
   private int[] P000G18_A673Piezas ;
   private String[] P000G19_A396EmprCod ;
   private int[] P000G19_A5206Nr_albrecc ;
   private boolean[] P000G19_n5206Nr_albrecc ;
   private int[] P000G19_A5198Nr_codigo ;
   private int[] P000G19_A5906Nr_OpeCod ;
   private boolean[] P000G19_n5906Nr_OpeCod ;
   private short[] P000G19_A5904Nr_TipCsCL ;
   private boolean[] P000G19_n5904Nr_TipCsCL ;
   private short[] P000G21_A319DefPor ;
   private String[] P000G21_A14357DefMaqcod ;
   private boolean[] P000G21_n14357DefMaqcod ;
   private short[] P000G21_A14358DefCausa ;
   private boolean[] P000G21_n14358DefCausa ;
   private short[] P000G21_A14359DefResp ;
   private boolean[] P000G21_n14359DefResp ;
   private short[] P000G21_A833TipDefCod ;
   private boolean[] P000G21_n833TipDefCod ;
   private int[] P000G21_A361DisCod ;
   private String[] P000G21_A396EmprCod ;
   private short[] P000G21_A387DisPiePie ;
   private boolean[] P000G21_n387DisPiePie ;
   private String[] P000G23_A396EmprCod ;
   private int[] P000G23_A361DisCod ;
   private String[] P000G23_A13376DisTraID ;
   private int[] P000G26_A252CliCod ;
   private boolean[] P000G26_n252CliCod ;
   private short[] P000G26_A334DisArtAnh ;
   private String[] P000G26_A1013DibCli ;
   private boolean[] P000G26_n1013DibCli ;
   private int[] P000G26_A1014DibInt ;
   private boolean[] P000G26_n1014DibInt ;
   private String[] P000G26_A130BarCodPar ;
   private boolean[] P000G26_n130BarCodPar ;
   private byte[] P000G26_A132BarCodReo ;
   private boolean[] P000G26_n132BarCodReo ;
   private int[] P000G26_A129BarCod ;
   private boolean[] P000G26_n129BarCod ;
   private int[] P000G26_A361DisCod ;
   private String[] P000G26_A396EmprCod ;
   private String[] P000G26_A6841DibDsc ;
   private boolean[] P000G26_n6841DibDsc ;
   private byte[] P000G26_A3911TipMqnCod ;
   private boolean[] P000G26_n3911TipMqnCod ;
   private String[] P000G26_A1607DibMed ;
   private boolean[] P000G26_n1607DibMed ;
   private String[] P000G26_A1606DibTipRas ;
   private boolean[] P000G26_n1606DibTipRas ;
   private String[] P000G26_A7516DisGraTam ;
   private boolean[] P000G26_n7516DisGraTam ;
   private String[] P000G26_A2009DisTipDis ;
   private boolean[] P000G26_n2009DisTipDis ;
   private byte[] P000G26_A7514DisOrdGra ;
   private byte[] P000G28_A7514DisOrdGra ;
   private int[] P000G28_A361DisCod ;
   private String[] P000G28_A396EmprCod ;
   private short[] P000G29_A334DisArtAnh ;
   private byte[] P000G29_A7511DisFacSep ;
   private boolean[] P000G29_n7511DisFacSep ;
   private String[] P000G29_A130BarCodPar ;
   private boolean[] P000G29_n130BarCodPar ;
   private byte[] P000G29_A132BarCodReo ;
   private boolean[] P000G29_n132BarCodReo ;
   private int[] P000G29_A129BarCod ;
   private boolean[] P000G29_n129BarCod ;
   private String[] P000G29_A396EmprCod ;
   private String[] P000G29_A2009DisTipDis ;
   private boolean[] P000G29_n2009DisTipDis ;
   private byte[] P000G29_A7513DisOrdSep ;
   private int[] P000G29_A361DisCod ;
   private byte[] P000G31_A7513DisOrdSep ;
   private int[] P000G31_A361DisCod ;
   private String[] P000G31_A396EmprCod ;
   private int[] P000G32_A361DisCod ;
   private String[] P000G32_A396EmprCod ;
   private int[] P000G32_A1196DisNumCli ;
   private String[] P000G32_A1195DisNomCli ;
   private byte[] P000G32_A390DisTipCol ;
   private boolean[] P000G32_n390DisTipCol ;
   private int[] P000G32_A363DisColNum ;
   private boolean[] P000G32_n363DisColNum ;
   private String[] P000G32_A362DisColNom ;
   private boolean[] P000G32_n362DisColNom ;
   private String[] P000G32_A335DisArtCod ;
   private int[] P000G32_A252CliCod ;
   private boolean[] P000G32_n252CliCod ;
   private byte[] P000G33_A213BarSit ;
   private String[] P000G33_A130BarCodPar ;
   private boolean[] P000G33_n130BarCodPar ;
   private byte[] P000G33_A132BarCodReo ;
   private boolean[] P000G33_n132BarCodReo ;
   private int[] P000G33_A129BarCod ;
   private boolean[] P000G33_n129BarCod ;
   private byte[] P000G33_A7515DisDesCol ;
   private boolean[] P000G33_n7515DisDesCol ;
   private int[] P000G33_A361DisCod ;
   private String[] P000G33_A396EmprCod ;
   private int[] P000G35_A3608DisRefAlbR ;
   private boolean[] P000G35_n3608DisRefAlbR ;
   private java.math.BigDecimal[] P000G35_A3401DisRefKgs ;
   private boolean[] P000G35_n3401DisRefKgs ;
   private java.math.BigDecimal[] P000G35_A3402DisRefMts ;
   private boolean[] P000G35_n3402DisRefMts ;
   private short[] P000G35_A3403DisRefPie ;
   private boolean[] P000G35_n3403DisRefPie ;
   private int[] P000G35_A361DisCod ;
   private String[] P000G35_A396EmprCod ;
   private String[] P000G35_A5861DisRefPzII ;
   private boolean[] P000G35_n5861DisRefPzII ;
   private int[] P000G35_A3398DisRefBarC ;
   private byte[] P000G35_A3399DisRefBCRe ;
   private String[] P000G35_A3400DisRefBCPa ;
   private String[] P000G35_A3607DisRefBPie ;
   private String[] P000G38_A602MaqCod ;
   private boolean[] P000G38_n602MaqCod ;
   private short[] P000G38_A6188MaqTArt ;
   private String[] P000G38_A396EmprCod ;
   private java.math.BigDecimal[] P000G38_A6190TipArtRb ;
   private boolean[] P000G38_n6190TipArtRb ;
   private int[] P000G38_A6233TipArtVmn ;
   private boolean[] P000G38_n6233TipArtVmn ;
   private int[] P000G38_A6234TipArtVmx ;
   private boolean[] P000G38_n6234TipArtVmx ;
   private int[] P000G39_A1202MacDisCod ;
   private String[] P000G39_A396EmprCod ;
   private int[] P000G39_A1203MacBarCod ;
   private byte[] P000G39_A1204MacBarReo ;
   private String[] P000G39_A1205MacBarPar ;
   private int[] P000G39_A1199MacCod ;
   private short[] P000G39_A1201MacLin ;
   private String[] P000G41_A377DisObsTxt ;
   private int[] P000G41_A361DisCod ;
   private String[] P000G41_A396EmprCod ;
   private byte[] P000G41_A376DisObsLin ;
   private String[] P000G42_A377DisObsTxt ;
   private int[] P000G42_A361DisCod ;
   private String[] P000G42_A396EmprCod ;
   private byte[] P000G42_A376DisObsLin ;
   private String[] P000G43_A65ArtCod ;
   private int[] P000G43_A252CliCod ;
   private boolean[] P000G43_n252CliCod ;
   private short[] P000G43_A7415ArtPmlCru ;
   private boolean[] P000G43_n7415ArtPmlCru ;
   private String[] P000G43_A396EmprCod ;
   private int[] P000G44_A361DisCod ;
   private String[] P000G44_A396EmprCod ;
   private int[] P000G44_A673Piezas ;
   private String[] P000G44_A50AlbRLoc ;
   private int[] P000G44_A44AlbRecCod ;
   private java.math.BigDecimal[] P000G45_A595Kilos ;
   private java.math.BigDecimal[] P000G46_A382DisPieKil ;
   private java.math.BigDecimal[] P000G47_A631Metros ;
   private java.math.BigDecimal[] P000G48_A384DisPieMet ;
   private int[] P000G49_A673Piezas ;
}

final  class pgenbarm__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P000G3", "SELECT T1.DisItem2, T1.DisItem3, T1.DisItem4, T1.DisItem5, T1.DisItem6, T1.Cod_Idtx, T1.DisDest, T1.MarcaId, T1.DisOrdComp, T1.DisExp, T1.DisNumTen, T1.DisCnoEncO, T1.Nxt_artcli, T1.Nxt_modelo, T1.Nxt_statio, T1.CpteId, T1.DptoID, T1.DesaID, T1.RevenID, T1.DisTpEstam, T1.DisPriorid, T1.DisProdID, T1.DisOEKOTEX, T1.DisLineaID, T1.DisCanalID, T1.DisLinPrd, T1.DisArtDsc2, T1.DisRGB, T1.DisLoc, T1.DisIdtx2, T1.DisDGUltli, T1.DisCod, T1.DisEst, COALESCE( T2.DisPiePie, 0) AS DisPiePie, T1.DisTipCol, T1.DisColNum, T1.DisColNom, T1.DisArtCod, T1.CliCod, T1.EmprCod, T1.DisDes, T1.DisCliNum, T1.DisArtDsc, T1.DisArtTip, T1.DisFec, T1.DisNumUni, T1.DisUniMed, T1.DisFecCli, T1.DisNumPie, T1.DisArtOpe, T1.DisArtUrg, T1.DisArtMat, T1.DisArtRdt, T1.DisArtTr1, T1.DisArtPt1, T1.DisArtTr2, T1.DisArtPt2, T1.DisArtTr3, T1.DisArtPt3, T1.DisArtUr1, T1.DisArtPu1, T1.DisArtUr2, T1.DisArtPu2, T1.DisArtUr3, T1.DisArtPu3, T1.DisArtAcb, T1.DisArtAc2, T1.DisArtAnh, T1.DisArtAn1, T1.DisArtPle, T1.DisArtLar, T1.DisArtSua, T1.DisArtAca, T1.DisArtCor, T1.DisArtEnc, T1.DisNumLot, T1.DisKgsLot, T1.DisMtrLot, T1.DisTin, T1.PriCod, T1.DisFecEnt, T1.DisArtPes, T1.DisGraCru, T1.DisNomCli, T1.DisNumCli, T1.DisEncCom, T1.DisEncAnh, T1.DisPart, T1.DisCliDes, T1.DisTipDis, T1.DisPle2, T1.DisGraCob, T1.DisTipEst, T1.DisPla, T1.DisNumCor, T1.DisAncSal1, T1.DisAncSal2, T1.DisAncSal3, T1.DisGraAca2, T1.DisGraCru2, T1.DisGraAca, T1.DisRdoN, T1.DisRdoA, T1.DibCli, T1.DibInt, T1.DisPelAnh, T1.DisCruMts, T1.DisCruKgs, T1.DisCruEnr, T1.DisLotPza, T1.DisLotMts, T1.DisLotKgs, T1.DisLotMaq, T1.DisAcaFor, T1.DisAcaBak, T1.DisAcaAnh, T1.DisAcaMar, T1.DisManCod, T1.DisManCod1, T1.DisManCod2, T1.DisMdlCod, T1.DisNPzas, T1.DisHorEnt, T1.DisEncCli, T1.DisDishCod, T1.DisCom, T1.DisEstTip, T1.DisAcc, T1.DisObsAnc, T1.DisObsGrm, T1.DisAntp, T1.DisAntpT, T1.DisObs, T1.DisFecLan, T1.DisNMtr, T1.DisMaqEst, T1.DisTam, T1.DisNumTex1, T1.DisRec, T1.DisNroCor, T1.DisItem1 FROM (TXPDISPOS T1 LEFT JOIN (SELECT COUNT(*) AS DisPiePie, EmprCod, DisCod FROM TXPDISALD GROUP BY EmprCod, DisCod ) T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) WHERE (T1.EmprCod = ? and T1.DisCod = ?) AND (T1.DisEst = 1) ORDER BY T1.EmprCod, T1.DisCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P000G4", "SELECT T1.EmprCod, T1.DisCod, T1.Piezas, T2.AlbRReo, T1.AlbRecCod FROM (TXPDISALB T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.DisCod = ? ORDER BY T1.EmprCod, T1.DisCod, T1.AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P000G5", "SELECT DisCod, EmprCod, TipDefCod FROM TXPDISDEF WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod, TipDefCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P000G6", "SELECT EmprCod, DisCod, DisComAnh, DisComMtr, DisComPie, DisComObs, DisComDibC, DisComDibI, FonCod, DisComCod, DisComLin FROM TXPDISCOM WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod, DisComLin, DisComCod, FonCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P000G7", "INSERT INTO TXPBARCOM(EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, BarComAnh, BarComMtr, BarComPie, BarComMLan, BarComPLan, BarComPEst, BarComEst, BarMtrRep, BarMtrEst, RecEstAnh, BarNumMol, BarCodLan, BarComPri, RecObsULin, BarComObs, BarComDibC, BarComDibI, BarGasOpe, BarGasEst, BarGasEmp, BarGasAca, BarPrcMtr, BarFecEst, RecEstTMaq, BarComRep, BarComFC, BarMaqPor, CodMaqEst, OpeREst, OeStatus, OeFecHis, OeKill, BarFecFima, BarEstFima) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCOM")
         ,new ForEachCursor("P000G8", "SELECT EmprCod, DisCod, DisDGLin, DisDGDibCl, DisDGDibIn, DisDGFondo, DisDGComb, DisDGObs, DisDGMts, DisDGPzs, DisDGAnc FROM TXPDIGCOM WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod, DisDGLin, DisDGDibCl, DisDGDibIn, DisDGComb, DisDGFondo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P000G9", "INSERT INTO TXPDIGBAR(EmprCod, BarCod, BarCodReo, BarCodPar, BarDGLin, BarDGDibCl, BarDGDibIn, BarDGComb, BarDGFOndo, BarDGObs, BarDGPzs, BarDGMts, BarDGAncho, BarDGEstad) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDIGBAR")
         ,new ForEachCursor("P000G10", "SELECT EmprCod, DisCod, DisObsLin, DisObsTxt FROM TXPOBSERV WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod, DisObsLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P000G11", "INSERT INTO TXPBARNOT(EmprCod, BarCod, BarCodReo, BarCodPar, BarNotLin, BarNotDsc) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARNOT")
         ,new UpdateCursor("P000G12", "INSERT INTO TXPBARCAD(EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrEst, BarMaqCod, BarVolMaq, DisCod, BarDisNum, BarSer, BarTipArt, BarColNom, BarColNum, BarTipCol, BarFecGen, BarNumUni, BarUniMed, BarEstReo, BarFecCli, BarNumPie, BarOrdReo, BarMaqPro, BarOpeEsp, BarFecSal, BarUrg, BarMat, BarRdt, BarTra1, BarTraP1, BarTra2, BarTraP2, BarTra3, BarTraP3, BarUrd1, BarUrdP1, BarUrd2, BarUrdP2, BarUrd3, BarUrdP3, BarAncCru1, BarAncCru2, BarAncAca1, BarAncAca2, BarPle, BarLar, BarSua, BarAcaQui, BarCorOri, BarEncOri, BarEst, BarSit, BarPri, BarConReo, BarConPar, BarNumAny, BarCosPro, BarCosAny, BarKgsFac, BarFecFpr, BarEstCol, BarDisOri, BarLis, NotUltLin, BarPes, TipDefCod, BarFecLan, BarMatiz, BarEncCom, BarEncAnh, BarGraCru, BarNomCli, BarNumCli, BarLocDis, BarNMtr, BarPart, BarSerDsc, BarNumTen, BarTipDis, BarCliDes, BarManCod, BarEntEnE, BarTipAca, BarGirar, BarTemSec, BarObsVL, BarGraAca, BarRdoN, BarRdoA, BarColPes, BarPrdPes, BarRDos1, BarRDos2, BarFecIni, BarNumTex1, BarNumLot, BarKgsLot, BarMtrLot, BarProPer, BarIntPer, BarPlf, BarPle2, BarNumCor, BarAncSal1, BarAncSal2, BarAncSal3, BarGraAca2, BarGraCru2, BarManCod1, BarManCod2, BarMacCod, BarNPed, BarDibCli, BarDibInt, BarComULin, BarTin, BarSitEst, BarPelAnh, BarCruMts, BarCruKgs, BarCruEnr, BarLotPza, BarLotMts, BarLotKgs, BarLotMaq, BarAcaFor, BarAcaBak, BarAcaAnh, BarAcaMar, BarMdlCod, BarTam, BarHorEnt, BarPzas, BarHorReg, BarDishCod, BarEncCli, BarAudSup, BarAudObs, BarNumReo, BarTipEst, BarGraCob, BarCom, BarEstTip, BarBp13, BarAcc, BarTipCor, BarCodBan, BarObsGrm, BarObsAnc, BarAntp, BarAntpT, BarAsi, BarMaqEst, BarFecHis, BarItem1, barItem2, BarItem3, BarItem4, BarItem5, BarItem6, BarAudOpeN, BarAudSupN, BarOrdComp, BarPriTin, Nxt_Mdlo2, Nxt_Sta2, Nxt_ArtCl2, Nxt_cpeID, Nxt_dpoID, Nxt_desaID, SubRevID, BarTpEstam, BarProdID, BarLocTel, BarOEKOTEX, BarLineaID, BarCanalID, BarLinPrd, BarDGUltLi, BarRGB, BarSerDsc2, BarIdtx2, BarCnoEncO, BarPriorid, CliCod, DisDes, BarFecEnt, BarDiaP, BarHorCum, BarEstRes, BarNumAso, TipDefPor, ObsReoEnt, ObsReoULin, BarReoCod, BarReoReo, BarReoPar, BarPesBal, BarNMez, BarLisInd, BarCodTN, BarExt, BarNumPas, BarFecEnE, BarBulEnE, BarKgEnE, BarEnULin, BarFecEnR, BarBulEnR, BarKgEnR, BarNMont, BarCal, BarEntAca, BarFecFin, BarConAgu, BarConVap, BarConEle, BarCodTex, BarNumTex2, BarSitExt, BarMaqGru, UltLinMaq, BarCoef, BarFac, BarNumTon, BarPeg, BarFoa, BarEnvRec, BarFecLRe, BarFecCRe, BarEnv, BarInci, BarBot, BarMacPro, BarCtrPdas, BarLoteA, BarBp12, BarBp14, BarBp15, BarFacAbs, BarOpeHis, EntSecUlt, BarAudFec, BarAudTur, BarAudOpe, BarAudNPz, BarAudMDig, BarAudMCue, BarAudULin, BarMaqAma, BarVolAma, BarKilLam, BarRecLis, BarAnyTie, BarUltAny, BarEnvBar, BarKgsPrv, BarMtsPrv, BarPiePrv, BarPieKgl, BarPieMtl, BarEnvLaw, BarLocMol, BarLocCol, BarRdto4) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, ' ', 0, 0, 0, ' ', 0, ' ', 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, ' ', 0, 0, ' ', 0, 0, ' ', ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', ' ', 0, ' ', 0, 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, ' ', ' ', ' ', 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new UpdateCursor("P000G13", "INSERT INTO TXPDISBAR(EmprCod, DisDisCod, DisBarCod, DisBarReo, DisBarPar, DisNumPda) VALUES(?, ?, ?, ?, ?, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISBAR")
         ,new ForEachCursor("P000G14", "SELECT EmprCod, DisCod, DisPieCod, DisPieKil, DisPieMet, DisPieLoc, DisPieAnc, DisPieIdPz, DisPieCodB, AlbRecCod FROM TXPDISALD WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P000G15", "INSERT INTO TXPBARPIE(EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, AlbRecCod, BarPieKil, BarPieMet, BarPieEst, BarPieAnc, BarPieLoc, BarPieIdPz, CodBarPz, PzaB80, BarNPes, BarPieVtx, BarKilLan, BarMetLan, BarPConTro, PieOriCod, BarPieLzd, BarPiePie, BarKgsAut, BarMtsAut, BarPieAut, BarPieImp, BapieObs, BarPieK1, BarPieK2, BarPz1, BarPz2, BarPieAncc, BarPiePda, BarPieObs, BarTara, BarUniB, BarPieOrd, BarPieCLd, BarPieFdv, BarPieUsu, BarPieFep, BarPieUltD, BarPieColD, BarPieColN, BarPieArtI, BarPieArtD, BarPieCliI, BarPieCliN, BarPieCoCI, BarPieCoCN, BarPieEncC, BarPieTono, BarPieSecu, BarPieOpe, BarPieDest, BarPieEmp, BarPieLote, BarPieST, BarPieTurn, BarPieMq) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, ' ', 0, 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', 0, ' ', ' ', 0, ' ', ' ', 0, ' ', ' ', ' ', 0, 0, 0, ' ', ' ', 0, ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
         ,new ForEachCursor("P000G16", "SELECT EmprCod, DisCod, Kilos, Metros, Piezas, AlbRecCod FROM TXPDISALB WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P000G17", "INSERT INTO TXPBARPIE(EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, AlbRecCod, BarPieKil, BarPieMet, BarPieEst, BarPiePie, BarPieLoc, BarPieIdPz, BarKilLan, BarMetLan, BarPConTro, PieOriCod, BarPieLzd, BarPieAnc, BarKgsAut, BarMtsAut, BarPieAut, BarPieImp, BapieObs, CodBarPz, PzaB80, BarPieK1, BarPieK2, BarPz1, BarPz2, BarNPes, BarPieAncc, BarPiePda, BarPieObs, BarTara, BarUniB, BarPieOrd, BarPieCLd, BarPieFdv, BarPieUsu, BarPieFep, BarPieUltD, BarPieColD, BarPieColN, BarPieArtI, BarPieArtD, BarPieCliI, BarPieCliN, BarPieCoCI, BarPieCoCN, BarPieEncC, BarPieTono, BarPieSecu, BarPieOpe, BarPieDest, BarPieEmp, BarPieLote, BarPieST, BarPieTurn, BarPieMq, BarPieVtx) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, ' ', 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', 0, ' ', ' ', 0, ' ', ' ', 0, ' ', ' ', ' ', 0, 0, 0, ' ', ' ', 0, ' ', ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
         ,new ForEachCursor("P000G18", "SELECT * FROM (SELECT EmprCod, DisCod, AlbRecCod, Piezas FROM TXPDISALB WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P000G19", "SELECT EmprCod, Nr_albrecc, Nr_codigo, Nr_OpeCod, Nr_TipCsCL FROM TXPNOTREC WHERE EmprCod = ? and Nr_albrecc = ? ORDER BY EmprCod, Nr_albrecc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P000G21", "SELECT T1.DefPor, T1.DefMaqcod, T1.DefCausa, T1.DefResp, T1.TipDefCod, T1.DisCod, T1.EmprCod, COALESCE( T2.DisPiePie, 0) AS DisPiePie FROM (TXPDISDEF T1 LEFT JOIN (SELECT COUNT(*) AS DisPiePie, EmprCod, DisCod FROM TXPDISALD GROUP BY EmprCod, DisCod ) T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) WHERE T1.EmprCod = ? and T1.DisCod = ? ORDER BY T1.EmprCod, T1.DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P000G22", "INSERT INTO TXPHISREO(EmprCod, HisBarCod, HisCodReo, HisCodPar, TipDefCod, HisTipArt, CliCod, HisBarSer, HisColNom, HisColNum, HisTipCol, HisNumPie, HisBarKgm, HisBarMtr, MaqCod, HisReoFec, HisKgmOri, HisMtrOri, HisOrdReo, HisEstReo, HisReoTn, HisReoDsc, CodCausa, Hisoperar, Rps_Cod, HisNomCli, HisNumCli, HisreoLote, HisReoPza, TipCorCod, HisAcCo, HisAcCot, HisAdEAcCo, HisAdEAcCt, HisAdeSN, HisAdeObs, HisUsu, HisHorReo, HisOpecod, HisOpeTur, HisMtsCarg, HisMtsImp) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHISREO")
         ,new ForEachCursor("P000G23", "SELECT EmprCod, DisCod, DisTraID FROM TXPDISATI WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod, DisTraID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P000G24", "INSERT INTO TXPBARTTI(EmprCod, BarCod, BarCodReo, BarCodPar, BarTraID) VALUES(?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARTTI")
         ,new UpdateCursor("P000G25", "UPDATE TXPDISPOS SET DisEst=?  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPOS")
         ,new ForEachCursor("P000G26", "SELECT T1.CliCod, T2.DisArtAnh, T2.DibCli, T2.DibInt, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.DisCod, T1.EmprCod, T3.DibDsc, T3.TipMqnCod, T3.DibMed, T3.DibTipRas, T2.DisGraTam, T2.DisTipDis, T2.DisOrdGra FROM ((TXPBARCAD T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) LEFT JOIN TXPCDIBUJ T3 ON T3.EmprCod = T1.EmprCod AND T3.DibCli = T2.DibCli AND T3.CliCod = T1.CliCod AND T3.DibInt = T2.DibInt) WHERE (T1.EmprCod = ? and T1.DisCod = ? and T1.BarCod = ? and T1.BarCodReo = 0 and T1.BarCodPar = ' ') AND (T2.DisOrdGra = 1) ORDER BY T1.EmprCod, T1.DisCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P000G27", "INSERT INTO TXPShaGra(EmprCod, OGSCod, OGSEst, BarCod, BarCodReo, BarCodPar, OGSUsuCre, OGSFchCre, OGSFchRea, OGSObs, OGSAnc, OGSMaq, OGSSeg, OGSDsc, OGSTam, OGSDibC, OGSDibI, OGSUsuRea, OGSGal, OGSUbi, OGSTpo) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, ' ', ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPShaGra")
         ,new ForEachCursor("P000G28", "SELECT DisOrdGra, DisCod, EmprCod FROM TXPDISPOS WHERE (EmprCod = ? and DisCod = ?) AND (DisOrdGra = 1) ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P000G29", "SELECT T2.DisArtAnh, T2.DisFacSep, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T2.DisTipDis, T2.DisOrdSep, T1.DisCod FROM (TXPBARCAD T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) WHERE (T1.EmprCod = ? and T1.DisCod = ? and T1.BarCod = ? and T1.BarCodReo = 0 and T1.BarCodPar = ' ') AND (T2.DisOrdSep = 1) ORDER BY T1.EmprCod, T1.DisCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P000G30", "INSERT INTO TXPShaSep(EmprCod, OSSCod, OSSEst, BarCod, BarCodReo, BarCodPar, OSSUsuCre, OSSFchCre, OSSFchRea, OSSAnc, OSSFac, OSSObs, OSSUsuRea, OSSTpo, OSSMue, OSSDib, OSSImp, OSSPrd) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', ' ', ' ', ' ', ' ', ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPShaSep")
         ,new ForEachCursor("P000G31", "SELECT DisOrdSep, DisCod, EmprCod FROM TXPDISPOS WHERE (EmprCod = ? and DisCod = ?) AND (DisOrdSep = 1) ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P000G32", "SELECT DisCod, EmprCod, DisNumCli, DisNomCli, DisTipCol, DisColNum, DisColNom, DisArtCod, CliCod FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P000G33", "SELECT T1.BarSit, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T2.DisDesCol, T1.DisCod, T1.EmprCod FROM (TXPBARCAD T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) WHERE (T1.EmprCod = ? and T1.DisCod = ? and T1.BarCod = ? and T1.BarCodReo = 0 and T1.BarCodPar = ' ') AND (T1.BarSit = 2 or ? = 0) AND (T2.DisDesCol = 1) ORDER BY T1.EmprCod, T1.DisCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P000G34", "UPDATE TXPBARCAD SET BarSit=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P000G35", "SELECT DisRefAlbR, DisRefKgs, DisRefMts, DisRefPie, DisCod, EmprCod, DisRefPzII, DisRefBarC, DisRefBCRe, DisRefBCPa, DisRefBPie FROM TXPDISREF WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P000G36", "INSERT INTO TXPBARPIE(EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, AlbRecCod, BarPieKil, BarPieMet, BarPieEst, BarPiePie, BarPieVtx, BarKilLan, BarMetLan, BarPConTro, PieOriCod, BarPieLzd, BarPieAnc, BarPieLoc, BarKgsAut, BarMtsAut, BarPieAut, BarPieImp, BarPieIdPz, BapieObs, CodBarPz, PzaB80, BarPieK1, BarPieK2, BarPz1, BarPz2, BarNPes, BarPieAncc, BarPiePda, BarPieObs, BarTara, BarUniB, BarPieOrd, BarPieCLd, BarPieFdv, BarPieUsu, BarPieFep, BarPieUltD, BarPieColD, BarPieColN, BarPieArtI, BarPieArtD, BarPieCliI, BarPieCliN, BarPieCoCI, BarPieCoCN, BarPieEncC, BarPieTono, BarPieSecu, BarPieOpe, BarPieDest, BarPieEmp, BarPieLote, BarPieST, BarPieTurn, BarPieMq) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, ' ', 0, 0, ' ', 0, 0, 0, ' ', ' ', ' ', ' ', ' ', 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', 0, ' ', ' ', 0, ' ', ' ', 0, ' ', ' ', ' ', 0, 0, 0, ' ', ' ', 0, ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
         ,new UpdateCursor("P000G37", "UPDATE TXPDISREF SET DisRefPzII=?  WHERE EmprCod = ? AND DisCod = ? AND DisRefBarC = ? AND DisRefBCRe = ? AND DisRefBCPa = ? AND DisRefBPie = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISREF")
         ,new ForEachCursor("P000G38", "SELECT MaqCod, MaqTArt, EmprCod, TipArtRb, TipArtVmn, TipArtVmx FROM TXPTARTM1 WHERE EmprCod = ? and MaqTArt = ? and MaqCod = ? ORDER BY EmprCod, MaqTArt, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P000G39", "SELECT MacDisCod, EmprCod, MacBarCod, MacBarReo, MacBarPar, MacCod, MacLin FROM TXPLMACRO WHERE EmprCod = ? and MacDisCod = ? ORDER BY EmprCod, MacDisCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P000G40", "UPDATE TXPLMACRO SET MacBarCod=?, MacBarReo=?, MacBarPar=?  WHERE EmprCod = ? AND MacCod = ? AND MacLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLMACRO")
         ,new ForEachCursor("P000G41", "SELECT DisObsTxt, DisCod, EmprCod, DisObsLin FROM TXPOBSERV WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P000G42", "SELECT DisObsTxt, DisCod, EmprCod, DisObsLin FROM TXPOBSERV WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P000G43", "SELECT ArtCod, CliCod, ArtPmlCru, EmprCod FROM TXPARTICU WHERE (CliCod = ?) AND (ArtCod = ?) ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P000G44", "SELECT T1.DisCod, T1.EmprCod, T1.Piezas, T2.AlbRLoc, T1.AlbRecCod FROM (TXPDISALB T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.DisCod = ? ORDER BY T1.EmprCod, T1.DisCod, T1.AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P000G45", "SELECT SUM(Kilos) AS GXC4 FROM TXPDISALB WHERE EmprCod = ? and DisCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P000G46", "SELECT SUM(DisPieKil) AS GXC3 FROM TXPDISALD WHERE EmprCod = ? and DisCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P000G47", "SELECT SUM(Metros) AS GXC7 FROM TXPDISALB WHERE EmprCod = ? and DisCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P000G48", "SELECT SUM(DisPieMet) AS GXC6 FROM TXPDISALD WHERE EmprCod = ? and DisCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P000G49", "SELECT SUM(Piezas) AS GXC1 FROM TXPDISALB WHERE EmprCod = ? and DisCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((String[]) buf[5])[0] = rslt.getString(6, 4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 30);
               ((String[]) buf[8])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(9);
               ((String[]) buf[11])[0] = rslt.getString(10, 1);
               ((String[]) buf[12])[0] = rslt.getString(11, 10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(12);
               ((String[]) buf[15])[0] = rslt.getString(13, 30);
               ((String[]) buf[16])[0] = rslt.getString(14, 30);
               ((String[]) buf[17])[0] = rslt.getString(15, 4);
               ((short[]) buf[18])[0] = rslt.getShort(16);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((short[]) buf[20])[0] = rslt.getShort(17);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((short[]) buf[22])[0] = rslt.getShort(18);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(19, 10);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((byte[]) buf[26])[0] = rslt.getByte(20);
               ((byte[]) buf[27])[0] = rslt.getByte(21);
               ((String[]) buf[28])[0] = rslt.getString(22, 6);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(23, 1);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((short[]) buf[32])[0] = rslt.getShort(24);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((int[]) buf[34])[0] = rslt.getInt(25);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getString(26, 4);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getVarchar(27);
               ((long[]) buf[39])[0] = rslt.getLong(28);
               ((String[]) buf[40])[0] = rslt.getString(29, 10);
               ((String[]) buf[41])[0] = rslt.getString(30, 4);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((byte[]) buf[43])[0] = rslt.getByte(31);
               ((int[]) buf[44])[0] = rslt.getInt(32);
               ((byte[]) buf[45])[0] = rslt.getByte(33);
               ((short[]) buf[46])[0] = rslt.getShort(34);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((byte[]) buf[48])[0] = rslt.getByte(35);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((int[]) buf[50])[0] = rslt.getInt(36);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((String[]) buf[52])[0] = rslt.getString(37, 13);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((String[]) buf[54])[0] = rslt.getString(38, 16);
               ((int[]) buf[55])[0] = rslt.getInt(39);
               ((String[]) buf[56])[0] = rslt.getString(40, 3);
               ((String[]) buf[57])[0] = rslt.getString(41, 1);
               ((String[]) buf[58])[0] = rslt.getString(42, 8);
               ((String[]) buf[59])[0] = rslt.getString(43, 26);
               ((short[]) buf[60])[0] = rslt.getShort(44);
               ((java.util.Date[]) buf[61])[0] = rslt.getGXDate(45);
               ((java.math.BigDecimal[]) buf[62])[0] = rslt.getBigDecimal(46,2);
               ((String[]) buf[63])[0] = rslt.getString(47, 1);
               ((java.util.Date[]) buf[64])[0] = rslt.getGXDate(48);
               ((short[]) buf[65])[0] = rslt.getShort(49);
               ((String[]) buf[66])[0] = rslt.getString(50, 2);
               ((byte[]) buf[67])[0] = rslt.getByte(51);
               ((String[]) buf[68])[0] = rslt.getString(52, 16);
               ((java.math.BigDecimal[]) buf[69])[0] = rslt.getBigDecimal(53,2);
               ((String[]) buf[70])[0] = rslt.getString(54, 4);
               ((short[]) buf[71])[0] = rslt.getShort(55);
               ((String[]) buf[72])[0] = rslt.getString(56, 4);
               ((short[]) buf[73])[0] = rslt.getShort(57);
               ((String[]) buf[74])[0] = rslt.getString(58, 4);
               ((short[]) buf[75])[0] = rslt.getShort(59);
               ((String[]) buf[76])[0] = rslt.getString(60, 4);
               ((short[]) buf[77])[0] = rslt.getShort(61);
               ((String[]) buf[78])[0] = rslt.getString(62, 4);
               ((short[]) buf[79])[0] = rslt.getShort(63);
               ((String[]) buf[80])[0] = rslt.getString(64, 4);
               ((short[]) buf[81])[0] = rslt.getShort(65);
               ((boolean[]) buf[82])[0] = rslt.wasNull();
               ((short[]) buf[83])[0] = rslt.getShort(66);
               ((short[]) buf[84])[0] = rslt.getShort(67);
               ((short[]) buf[85])[0] = rslt.getShort(68);
               ((short[]) buf[86])[0] = rslt.getShort(69);
               ((String[]) buf[87])[0] = rslt.getString(70, 10);
               ((String[]) buf[88])[0] = rslt.getString(71, 10);
               ((String[]) buf[89])[0] = rslt.getString(72, 6);
               ((String[]) buf[90])[0] = rslt.getString(73, 6);
               ((String[]) buf[91])[0] = rslt.getString(74, 1);
               ((String[]) buf[92])[0] = rslt.getString(75, 1);
               ((int[]) buf[93])[0] = rslt.getInt(76);
               ((java.math.BigDecimal[]) buf[94])[0] = rslt.getBigDecimal(77,2);
               ((java.math.BigDecimal[]) buf[95])[0] = rslt.getBigDecimal(78,2);
               ((String[]) buf[96])[0] = rslt.getString(79, 1);
               ((String[]) buf[97])[0] = rslt.getString(80, 1);
               ((java.util.Date[]) buf[98])[0] = rslt.getGXDate(81);
               ((short[]) buf[99])[0] = rslt.getShort(82);
               ((short[]) buf[100])[0] = rslt.getShort(83);
               ((String[]) buf[101])[0] = rslt.getString(84, 13);
               ((int[]) buf[102])[0] = rslt.getInt(85);
               ((java.math.BigDecimal[]) buf[103])[0] = rslt.getBigDecimal(86,2);
               ((java.math.BigDecimal[]) buf[104])[0] = rslt.getBigDecimal(87,2);
               ((short[]) buf[105])[0] = rslt.getShort(88);
               ((int[]) buf[106])[0] = rslt.getInt(89);
               ((String[]) buf[107])[0] = rslt.getString(90, 1);
               ((boolean[]) buf[108])[0] = rslt.wasNull();
               ((String[]) buf[109])[0] = rslt.getString(91, 30);
               ((byte[]) buf[110])[0] = rslt.getByte(92);
               ((byte[]) buf[111])[0] = rslt.getByte(93);
               ((String[]) buf[112])[0] = rslt.getString(94, 1);
               ((short[]) buf[113])[0] = rslt.getShort(95);
               ((short[]) buf[114])[0] = rslt.getShort(96);
               ((short[]) buf[115])[0] = rslt.getShort(97);
               ((short[]) buf[116])[0] = rslt.getShort(98);
               ((short[]) buf[117])[0] = rslt.getShort(99);
               ((short[]) buf[118])[0] = rslt.getShort(100);
               ((short[]) buf[119])[0] = rslt.getShort(101);
               ((java.math.BigDecimal[]) buf[120])[0] = rslt.getBigDecimal(102,2);
               ((java.math.BigDecimal[]) buf[121])[0] = rslt.getBigDecimal(103,2);
               ((String[]) buf[122])[0] = rslt.getString(104, 16);
               ((boolean[]) buf[123])[0] = rslt.wasNull();
               ((int[]) buf[124])[0] = rslt.getInt(105);
               ((boolean[]) buf[125])[0] = rslt.wasNull();
               ((short[]) buf[126])[0] = rslt.getShort(106);
               ((java.math.BigDecimal[]) buf[127])[0] = rslt.getBigDecimal(107,2);
               ((java.math.BigDecimal[]) buf[128])[0] = rslt.getBigDecimal(108,2);
               ((String[]) buf[129])[0] = rslt.getString(109, 1);
               ((short[]) buf[130])[0] = rslt.getShort(110);
               ((boolean[]) buf[131])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[132])[0] = rslt.getBigDecimal(111,2);
               ((java.math.BigDecimal[]) buf[133])[0] = rslt.getBigDecimal(112,2);
               ((String[]) buf[134])[0] = rslt.getString(113, 6);
               ((boolean[]) buf[135])[0] = rslt.wasNull();
               ((int[]) buf[136])[0] = rslt.getInt(114);
               ((boolean[]) buf[137])[0] = rslt.wasNull();
               ((String[]) buf[138])[0] = rslt.getString(115, 1);
               ((short[]) buf[139])[0] = rslt.getShort(116);
               ((String[]) buf[140])[0] = rslt.getString(117, 1);
               ((short[]) buf[141])[0] = rslt.getShort(118);
               ((short[]) buf[142])[0] = rslt.getShort(119);
               ((short[]) buf[143])[0] = rslt.getShort(120);
               ((String[]) buf[144])[0] = rslt.getString(121, 13);
               ((int[]) buf[145])[0] = rslt.getInt(122);
               ((boolean[]) buf[146])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[147])[0] = GXutil.resetDate(rslt.getGXDateTime(123));
               ((boolean[]) buf[148])[0] = rslt.wasNull();
               ((String[]) buf[149])[0] = rslt.getString(124, 20);
               ((String[]) buf[150])[0] = rslt.getString(125, 12);
               ((String[]) buf[151])[0] = rslt.getString(126, 12);
               ((boolean[]) buf[152])[0] = rslt.wasNull();
               ((String[]) buf[153])[0] = rslt.getString(127, 1);
               ((String[]) buf[154])[0] = rslt.getString(128, 1);
               ((String[]) buf[155])[0] = rslt.getString(129, 20);
               ((String[]) buf[156])[0] = rslt.getString(130, 20);
               ((String[]) buf[157])[0] = rslt.getString(131, 1);
               ((String[]) buf[158])[0] = rslt.getString(132, 1);
               ((String[]) buf[159])[0] = rslt.getString(133, 30);
               ((java.util.Date[]) buf[160])[0] = rslt.getGXDate(134);
               ((boolean[]) buf[161])[0] = rslt.wasNull();
               ((String[]) buf[162])[0] = rslt.getString(135, 10);
               ((String[]) buf[163])[0] = rslt.getString(136, 6);
               ((String[]) buf[164])[0] = rslt.getString(137, 4);
               ((byte[]) buf[165])[0] = rslt.getByte(138);
               ((String[]) buf[166])[0] = rslt.getString(139, 30);
               ((int[]) buf[167])[0] = rslt.getInt(140);
               ((String[]) buf[168])[0] = rslt.getString(141, 20);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 2);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 70);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 16);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(9, 12);
               ((String[]) buf[15])[0] = rslt.getString(10, 12);
               ((byte[]) buf[16])[0] = rslt.getByte(11);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 70);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 60);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[5])[0] = rslt.getString(6, 10);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 15);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 20);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(10);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 17 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((String[]) buf[9])[0] = rslt.getString(7, 3);
               ((short[]) buf[10])[0] = rslt.getShort(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 22 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 1);
               ((byte[]) buf[8])[0] = rslt.getByte(6);
               ((int[]) buf[9])[0] = rslt.getInt(7);
               ((int[]) buf[10])[0] = rslt.getInt(8);
               ((String[]) buf[11])[0] = rslt.getString(9, 3);
               ((String[]) buf[12])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((byte[]) buf[14])[0] = rslt.getByte(11);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(12, 10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(13, 15);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(14, 1);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(15, 1);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((byte[]) buf[24])[0] = rslt.getByte(16);
               return;
            case 24 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               return;
            case 25 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 3);
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(8);
               ((int[]) buf[10])[0] = rslt.getInt(9);
               return;
            case 27 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               return;
            case 28 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 13);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 16);
               ((int[]) buf[11])[0] = rslt.getInt(9);
               return;
            case 29 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 3);
               return;
            case 31 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(5);
               ((String[]) buf[9])[0] = rslt.getString(6, 3);
               ((String[]) buf[10])[0] = rslt.getString(7, 9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(8);
               ((byte[]) buf[13])[0] = rslt.getByte(9);
               ((String[]) buf[14])[0] = rslt.getString(10, 1);
               ((String[]) buf[15])[0] = rslt.getString(11, 9);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 35 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 60);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 60);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 40 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 41 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 42 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 43 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 44 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 45 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 1);
               }
               stmt.setByte(5, ((Number) parms[7]).byteValue());
               stmt.setString(6, (String)parms[8], 12);
               stmt.setString(7, (String)parms[9], 12);
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[11]).shortValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[13], 2);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[15]).shortValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[17], 2);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[19]).shortValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(13, ((Number) parms[21]).byteValue());
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[23], 1);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(15, (java.math.BigDecimal)parms[25], 2);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(16, (java.math.BigDecimal)parms[27], 2);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(17, ((Number) parms[29]).shortValue());
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(18, ((Number) parms[31]).shortValue());
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(19, ((Number) parms[33]).intValue());
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(20, (String)parms[35], 1);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(21, ((Number) parms[37]).byteValue());
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[39], 70);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[41], 16);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(24, ((Number) parms[43]).intValue());
               }
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 1);
               }
               stmt.setByte(5, ((Number) parms[7]).byteValue());
               stmt.setString(6, (String)parms[8], 16);
               stmt.setInt(7, ((Number) parms[9]).intValue());
               stmt.setString(8, (String)parms[10], 12);
               stmt.setString(9, (String)parms[11], 12);
               stmt.setString(10, (String)parms[12], 70);
               stmt.setShort(11, ((Number) parms[13]).shortValue());
               stmt.setBigDecimal(12, (java.math.BigDecimal)parms[14], 2);
               stmt.setShort(13, ((Number) parms[15]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 1);
               }
               stmt.setByte(5, ((Number) parms[7]).byteValue());
               stmt.setString(6, (String)parms[8], 65);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 1);
               }
               stmt.setString(5, (String)parms[7], 1);
               stmt.setString(6, (String)parms[8], 6);
               stmt.setInt(7, ((Number) parms[9]).intValue());
               stmt.setInt(8, ((Number) parms[10]).intValue());
               stmt.setString(9, (String)parms[11], 8);
               stmt.setString(10, (String)parms[12], 16);
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[14]).shortValue());
               }
               stmt.setString(12, (String)parms[15], 13);
               stmt.setInt(13, ((Number) parms[16]).intValue());
               stmt.setByte(14, ((Number) parms[17]).byteValue());
               stmt.setDate(15, (java.util.Date)parms[18]);
               stmt.setBigDecimal(16, (java.math.BigDecimal)parms[19], 2);
               stmt.setString(17, (String)parms[20], 1);
               stmt.setByte(18, ((Number) parms[21]).byteValue());
               stmt.setDate(19, (java.util.Date)parms[22]);
               stmt.setShort(20, ((Number) parms[23]).shortValue());
               stmt.setByte(21, ((Number) parms[24]).byteValue());
               stmt.setString(22, (String)parms[25], 6);
               stmt.setByte(23, ((Number) parms[26]).byteValue());
               stmt.setDate(24, (java.util.Date)parms[27]);
               stmt.setByte(25, ((Number) parms[28]).byteValue());
               stmt.setString(26, (String)parms[29], 16);
               stmt.setBigDecimal(27, (java.math.BigDecimal)parms[30], 2);
               stmt.setString(28, (String)parms[31], 4);
               stmt.setShort(29, ((Number) parms[32]).shortValue());
               stmt.setString(30, (String)parms[33], 4);
               stmt.setShort(31, ((Number) parms[34]).shortValue());
               stmt.setString(32, (String)parms[35], 4);
               stmt.setShort(33, ((Number) parms[36]).shortValue());
               stmt.setString(34, (String)parms[37], 4);
               stmt.setShort(35, ((Number) parms[38]).shortValue());
               stmt.setString(36, (String)parms[39], 4);
               stmt.setShort(37, ((Number) parms[40]).shortValue());
               stmt.setString(38, (String)parms[41], 4);
               stmt.setShort(39, ((Number) parms[42]).shortValue());
               stmt.setShort(40, ((Number) parms[43]).shortValue());
               stmt.setShort(41, ((Number) parms[44]).shortValue());
               stmt.setShort(42, ((Number) parms[45]).shortValue());
               stmt.setShort(43, ((Number) parms[46]).shortValue());
               stmt.setString(44, (String)parms[47], 10);
               stmt.setString(45, (String)parms[48], 10);
               stmt.setString(46, (String)parms[49], 6);
               stmt.setString(47, (String)parms[50], 6);
               stmt.setString(48, (String)parms[51], 1);
               stmt.setString(49, (String)parms[52], 1);
               stmt.setByte(50, ((Number) parms[53]).byteValue());
               stmt.setByte(51, ((Number) parms[54]).byteValue());
               stmt.setString(52, (String)parms[55], 1);
               stmt.setByte(53, ((Number) parms[56]).byteValue());
               stmt.setString(54, (String)parms[57], 1);
               stmt.setShort(55, ((Number) parms[58]).shortValue());
               stmt.setBigDecimal(56, (java.math.BigDecimal)parms[59], 2);
               stmt.setBigDecimal(57, (java.math.BigDecimal)parms[60], 2);
               stmt.setBigDecimal(58, (java.math.BigDecimal)parms[61], 2);
               stmt.setDate(59, (java.util.Date)parms[62]);
               stmt.setByte(60, ((Number) parms[63]).byteValue());
               stmt.setInt(61, ((Number) parms[64]).intValue());
               stmt.setByte(62, ((Number) parms[65]).byteValue());
               if ( ((Boolean) parms[66]).booleanValue() )
               {
                  stmt.setNull( 63 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(63, ((Number) parms[67]).byteValue());
               }
               stmt.setShort(64, ((Number) parms[68]).shortValue());
               if ( ((Boolean) parms[69]).booleanValue() )
               {
                  stmt.setNull( 65 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(65, ((Number) parms[70]).shortValue());
               }
               if ( ((Boolean) parms[71]).booleanValue() )
               {
                  stmt.setNull( 66 , Types.DATE );
               }
               else
               {
                  stmt.setDate(66, (java.util.Date)parms[72]);
               }
               stmt.setShort(67, ((Number) parms[73]).shortValue());
               stmt.setBigDecimal(68, (java.math.BigDecimal)parms[74], 2);
               stmt.setBigDecimal(69, (java.math.BigDecimal)parms[75], 2);
               stmt.setShort(70, ((Number) parms[76]).shortValue());
               stmt.setString(71, (String)parms[77], 13);
               stmt.setInt(72, ((Number) parms[78]).intValue());
               stmt.setString(73, (String)parms[79], 10);
               stmt.setString(74, (String)parms[80], 10);
               stmt.setShort(75, ((Number) parms[81]).shortValue());
               stmt.setString(76, (String)parms[82], 26);
               stmt.setString(77, (String)parms[83], 10);
               stmt.setString(78, (String)parms[84], 1);
               stmt.setInt(79, ((Number) parms[85]).intValue());
               stmt.setShort(80, ((Number) parms[86]).shortValue());
               stmt.setString(81, (String)parms[87], 30);
               stmt.setString(82, (String)parms[88], 1);
               stmt.setString(83, (String)parms[89], 20);
               stmt.setShort(84, ((Number) parms[90]).shortValue());
               if ( ((Boolean) parms[91]).booleanValue() )
               {
                  stmt.setNull( 85 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(85, ((Number) parms[92]).shortValue());
               }
               stmt.setShort(86, ((Number) parms[93]).shortValue());
               stmt.setBigDecimal(87, (java.math.BigDecimal)parms[94], 2);
               stmt.setBigDecimal(88, (java.math.BigDecimal)parms[95], 2);
               stmt.setString(89, (String)parms[96], 1);
               stmt.setString(90, (String)parms[97], 1);
               stmt.setString(91, (String)parms[98], 1);
               stmt.setString(92, (String)parms[99], 1);
               stmt.setDate(93, (java.util.Date)parms[100]);
               stmt.setByte(94, ((Number) parms[101]).byteValue());
               stmt.setInt(95, ((Number) parms[102]).intValue());
               stmt.setBigDecimal(96, (java.math.BigDecimal)parms[103], 2);
               stmt.setBigDecimal(97, (java.math.BigDecimal)parms[104], 2);
               stmt.setString(98, (String)parms[105], 8);
               stmt.setByte(99, ((Number) parms[106]).byteValue());
               stmt.setString(100, (String)parms[107], 1);
               stmt.setString(101, (String)parms[108], 30);
               stmt.setShort(102, ((Number) parms[109]).shortValue());
               stmt.setShort(103, ((Number) parms[110]).shortValue());
               stmt.setShort(104, ((Number) parms[111]).shortValue());
               stmt.setShort(105, ((Number) parms[112]).shortValue());
               stmt.setShort(106, ((Number) parms[113]).shortValue());
               stmt.setShort(107, ((Number) parms[114]).shortValue());
               stmt.setShort(108, ((Number) parms[115]).shortValue());
               stmt.setShort(109, ((Number) parms[116]).shortValue());
               stmt.setInt(110, ((Number) parms[117]).intValue());
               stmt.setString(111, (String)parms[118], 20);
               stmt.setString(112, (String)parms[119], 16);
               stmt.setInt(113, ((Number) parms[120]).intValue());
               if ( ((Boolean) parms[121]).booleanValue() )
               {
                  stmt.setNull( 114 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(114, ((Number) parms[122]).byteValue());
               }
               stmt.setString(115, (String)parms[123], 1);
               stmt.setByte(116, ((Number) parms[124]).byteValue());
               stmt.setShort(117, ((Number) parms[125]).shortValue());
               if ( ((Boolean) parms[126]).booleanValue() )
               {
                  stmt.setNull( 118 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(118, (java.math.BigDecimal)parms[127], 2);
               }
               if ( ((Boolean) parms[128]).booleanValue() )
               {
                  stmt.setNull( 119 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(119, (java.math.BigDecimal)parms[129], 2);
               }
               stmt.setString(120, (String)parms[130], 1);
               if ( ((Boolean) parms[131]).booleanValue() )
               {
                  stmt.setNull( 121 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(121, ((Number) parms[132]).shortValue());
               }
               stmt.setBigDecimal(122, (java.math.BigDecimal)parms[133], 2);
               stmt.setBigDecimal(123, (java.math.BigDecimal)parms[134], 2);
               if ( ((Boolean) parms[135]).booleanValue() )
               {
                  stmt.setNull( 124 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(124, (String)parms[136], 6);
               }
               if ( ((Boolean) parms[137]).booleanValue() )
               {
                  stmt.setNull( 125 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(125, ((Number) parms[138]).intValue());
               }
               if ( ((Boolean) parms[139]).booleanValue() )
               {
                  stmt.setNull( 126 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(126, (String)parms[140], 1);
               }
               stmt.setShort(127, ((Number) parms[141]).shortValue());
               stmt.setString(128, (String)parms[142], 1);
               stmt.setString(129, (String)parms[143], 13);
               stmt.setString(130, (String)parms[144], 4);
               if ( ((Boolean) parms[145]).booleanValue() )
               {
                  stmt.setNull( 131 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(131, (java.util.Date)parms[146], true);
               }
               if ( ((Boolean) parms[147]).booleanValue() )
               {
                  stmt.setNull( 132 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(132, ((Number) parms[148]).intValue());
               }
               if ( ((Boolean) parms[149]).booleanValue() )
               {
                  stmt.setNull( 133 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(133, (java.util.Date)parms[150], true);
               }
               stmt.setString(134, (String)parms[151], 12);
               stmt.setString(135, (String)parms[152], 20);
               stmt.setInt(136, ((Number) parms[153]).intValue());
               if ( ((Boolean) parms[154]).booleanValue() )
               {
                  stmt.setNull( 137 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(137, (String)parms[155], 400);
               }
               stmt.setShort(138, ((Number) parms[156]).shortValue());
               stmt.setByte(139, ((Number) parms[157]).byteValue());
               stmt.setByte(140, ((Number) parms[158]).byteValue());
               stmt.setString(141, (String)parms[159], 12);
               stmt.setString(142, (String)parms[160], 1);
               if ( ((Boolean) parms[161]).booleanValue() )
               {
                  stmt.setNull( 143 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(143, ((Number) parms[162]).shortValue());
               }
               stmt.setString(144, (String)parms[163], 1);
               stmt.setString(145, (String)parms[164], 2);
               stmt.setString(146, (String)parms[165], 15);
               stmt.setString(147, (String)parms[166], 20);
               stmt.setString(148, (String)parms[167], 20);
               stmt.setString(149, (String)parms[168], 1);
               stmt.setString(150, (String)parms[169], 1);
               stmt.setByte(151, ((Number) parms[170]).byteValue());
               stmt.setString(152, (String)parms[171], 6);
               stmt.setDateTime(153, (java.util.Date)parms[172], false);
               stmt.setString(154, (String)parms[173], 20);
               stmt.setString(155, (String)parms[174], 20);
               stmt.setString(156, (String)parms[175], 20);
               stmt.setString(157, (String)parms[176], 20);
               stmt.setString(158, (String)parms[177], 20);
               stmt.setString(159, (String)parms[178], 20);
               if ( ((Boolean) parms[179]).booleanValue() )
               {
                  stmt.setNull( 160 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(160, (String)parms[180], 30);
               }
               if ( ((Boolean) parms[181]).booleanValue() )
               {
                  stmt.setNull( 161 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(161, (String)parms[182], 30);
               }
               stmt.setVarchar(162, (String)parms[183], 200, false);
               stmt.setByte(163, ((Number) parms[184]).byteValue());
               stmt.setString(164, (String)parms[185], 30);
               stmt.setString(165, (String)parms[186], 4);
               stmt.setString(166, (String)parms[187], 30);
               if ( ((Boolean) parms[188]).booleanValue() )
               {
                  stmt.setNull( 167 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(167, ((Number) parms[189]).shortValue());
               }
               if ( ((Boolean) parms[190]).booleanValue() )
               {
                  stmt.setNull( 168 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(168, ((Number) parms[191]).shortValue());
               }
               if ( ((Boolean) parms[192]).booleanValue() )
               {
                  stmt.setNull( 169 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(169, ((Number) parms[193]).shortValue());
               }
               if ( ((Boolean) parms[194]).booleanValue() )
               {
                  stmt.setNull( 170 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(170, (String)parms[195], 10);
               }
               stmt.setByte(171, ((Number) parms[196]).byteValue());
               stmt.setString(172, (String)parms[197], 6);
               stmt.setString(173, (String)parms[198], 10);
               if ( ((Boolean) parms[199]).booleanValue() )
               {
                  stmt.setNull( 174 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(174, (String)parms[200], 1);
               }
               stmt.setShort(175, ((Number) parms[201]).shortValue());
               stmt.setInt(176, ((Number) parms[202]).intValue());
               stmt.setString(177, (String)parms[203], 4);
               if ( ((Boolean) parms[204]).booleanValue() )
               {
                  stmt.setNull( 178 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(178, ((Number) parms[205]).byteValue());
               }
               stmt.setLong(179, ((Number) parms[206]).longValue());
               if ( ((Boolean) parms[207]).booleanValue() )
               {
                  stmt.setNull( 180 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(180, (String)parms[208], 60);
               }
               if ( ((Boolean) parms[209]).booleanValue() )
               {
                  stmt.setNull( 181 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(181, (String)parms[210], 4);
               }
               stmt.setVarchar(182, (String)parms[211], 600, false);
               stmt.setByte(183, ((Number) parms[212]).byteValue());
               if ( ((Boolean) parms[213]).booleanValue() )
               {
                  stmt.setNull( 184 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(184, ((Number) parms[214]).intValue());
               }
               stmt.setString(185, (String)parms[215], 1);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 1);
               }
               stmt.setString(5, (String)parms[7], 9);
               stmt.setInt(6, ((Number) parms[8]).intValue());
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[9], 2);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[10], 2);
               stmt.setByte(9, ((Number) parms[11]).byteValue());
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[13]).shortValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[15], 10);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[17], 15);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[19], 20);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[21], 9);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(15, ((Number) parms[23]).byteValue());
               }
               stmt.setString(16, (String)parms[24], 20);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 1);
               }
               stmt.setString(5, (String)parms[7], 9);
               stmt.setInt(6, ((Number) parms[8]).intValue());
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[9], 2);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[10], 2);
               stmt.setByte(9, ((Number) parms[11]).byteValue());
               stmt.setInt(10, ((Number) parms[12]).intValue());
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[14], 10);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[16], 15);
               }
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[5]).shortValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[7]).shortValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[9]).intValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[11], 16);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[13], 13);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[15]).intValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(11, ((Number) parms[17]).byteValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[19]).shortValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[21], 2);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(14, (java.math.BigDecimal)parms[23], 2);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[25], 6);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.DATE );
               }
               else
               {
                  stmt.setDate(16, (java.util.Date)parms[27]);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(17, (java.math.BigDecimal)parms[29], 2);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(18, (java.math.BigDecimal)parms[31], 2);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(19, ((Number) parms[33]).byteValue());
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(20, ((Number) parms[35]).byteValue());
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(21, ((Number) parms[37]).intValue());
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[39], 26);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(23, ((Number) parms[41]).shortValue());
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(24, ((Number) parms[43]).intValue());
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(25, ((Number) parms[45]).shortValue());
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(26, (String)parms[47], 13);
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(27, ((Number) parms[49]).intValue());
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(28, (String)parms[51], 20);
               }
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 1);
               }
               stmt.setString(5, (String)parms[7], 4);
               return;
            case 21 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 1);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[5]).intValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(5, ((Number) parms[7]).byteValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[9], 1);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[11], 10);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(8, (java.util.Date)parms[13], false);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(9, (java.util.Date)parms[15], false);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(10, (String)parms[17]);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[19], 2);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(12, ((Number) parms[21]).byteValue());
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[23], 15);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[25], 30);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[27], 1);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[29], 16);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(17, ((Number) parms[31]).intValue());
               }
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 1);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[5]).intValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(5, ((Number) parms[7]).byteValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[9], 1);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[11], 10);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(8, (java.util.Date)parms[13], false);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(9, (java.util.Date)parms[15], false);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[17], 2);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[19], 1);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(12, (String)parms[21]);
               }
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
      }
      setparameters30( cursor, stmt, parms) ;
   }

   public void setparameters30( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 30 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[7], 1);
               }
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 1);
               }
               stmt.setString(5, (String)parms[7], 9);
               stmt.setInt(6, ((Number) parms[8]).intValue());
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[9], 2);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[10], 2);
               stmt.setByte(9, ((Number) parms[11]).byteValue());
               stmt.setInt(10, ((Number) parms[12]).intValue());
               stmt.setString(11, (String)parms[13], 20);
               return;
            case 33 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 9);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setByte(5, ((Number) parms[5]).byteValue());
               stmt.setString(6, (String)parms[6], 1);
               stmt.setString(7, (String)parms[7], 9);
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 36 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 37 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 38 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 39 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 16);
               return;
            case 40 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 41 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 42 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 43 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 44 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 45 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

