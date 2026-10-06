package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pgenbame extends GXProcedure
{
   public pgenbame( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pgenbame.class ), "" );
   }

   public pgenbame( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          String[] aP2 )
   {
      pgenbame.this.aP3 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        int[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             int[] aP3 )
   {
      pgenbame.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pgenbame.this.AV16DisCod = aP1[0];
      this.aP1 = aP1;
      pgenbame.this.AV17MaqCod = aP2[0];
      this.aP2 = aP2;
      pgenbame.this.AV18BarCod = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_int1[0] = AV25Flag ;
      new app.popcion(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "10207E", ""), GXv_int1) ;
      pgenbame.this.AV25Flag = GXv_int1[0] ;
      /* Using cursor P00ZD3 */
      pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(AV16DisCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A966PartCod = P00ZD3_A966PartCod[0] ;
         n966PartCod = P00ZD3_n966PartCod[0] ;
         A360DisCliNum = P00ZD3_A360DisCliNum[0] ;
         A352DisArtTip = P00ZD3_A352DisArtTip[0] ;
         A375DisNumUni = P00ZD3_A375DisNumUni[0] ;
         A392DisUniMed = P00ZD3_A392DisUniMed[0] ;
         A370DisFecCli = P00ZD3_A370DisFecCli[0] ;
         A371DisFecEnt = P00ZD3_A371DisFecEnt[0] ;
         A341DisArtOpe = P00ZD3_A341DisArtOpe[0] ;
         A359DisArtUrg = P00ZD3_A359DisArtUrg[0] ;
         A340DisArtMat = P00ZD3_A340DisArtMat[0] ;
         A350DisArtRdt = P00ZD3_A350DisArtRdt[0] ;
         A353DisArtTr1 = P00ZD3_A353DisArtTr1[0] ;
         A344DisArtPt1 = P00ZD3_A344DisArtPt1[0] ;
         A354DisArtTr2 = P00ZD3_A354DisArtTr2[0] ;
         A345DisArtPt2 = P00ZD3_A345DisArtPt2[0] ;
         A355DisArtTr3 = P00ZD3_A355DisArtTr3[0] ;
         A346DisArtPt3 = P00ZD3_A346DisArtPt3[0] ;
         A356DisArtUr1 = P00ZD3_A356DisArtUr1[0] ;
         A347DisArtPu1 = P00ZD3_A347DisArtPu1[0] ;
         A357DisArtUr2 = P00ZD3_A357DisArtUr2[0] ;
         A348DisArtPu2 = P00ZD3_A348DisArtPu2[0] ;
         A358DisArtUr3 = P00ZD3_A358DisArtUr3[0] ;
         A349DisArtPu3 = P00ZD3_A349DisArtPu3[0] ;
         n349DisArtPu3 = P00ZD3_n349DisArtPu3[0] ;
         A1232DisArtAcb = P00ZD3_A1232DisArtAcb[0] ;
         A334DisArtAnh = P00ZD3_A334DisArtAnh[0] ;
         A343DisArtPle = P00ZD3_A343DisArtPle[0] ;
         A339DisArtLar = P00ZD3_A339DisArtLar[0] ;
         A351DisArtSua = P00ZD3_A351DisArtSua[0] ;
         A333DisArtAca = P00ZD3_A333DisArtAca[0] ;
         A336DisArtCor = P00ZD3_A336DisArtCor[0] ;
         A338DisArtEnc = P00ZD3_A338DisArtEnc[0] ;
         A757PriCod = P00ZD3_A757PriCod[0] ;
         A342DisArtPes = P00ZD3_A342DisArtPes[0] ;
         A1013DibCli = P00ZD3_A1013DibCli[0] ;
         n1013DibCli = P00ZD3_n1013DibCli[0] ;
         A1014DibInt = P00ZD3_A1014DibInt[0] ;
         n1014DibInt = P00ZD3_n1014DibInt[0] ;
         A337DisArtDsc = P00ZD3_A337DisArtDsc[0] ;
         A9771DisItem1 = P00ZD3_A9771DisItem1[0] ;
         A361DisCod = P00ZD3_A361DisCod[0] ;
         A829TipArtCod = P00ZD3_A829TipArtCod[0] ;
         n829TipArtCod = P00ZD3_n829TipArtCod[0] ;
         A970ProceCod = P00ZD3_A970ProceCod[0] ;
         n970ProceCod = P00ZD3_n970ProceCod[0] ;
         A367DisEst = P00ZD3_A367DisEst[0] ;
         A387DisPiePie = P00ZD3_A387DisPiePie[0] ;
         n387DisPiePie = P00ZD3_n387DisPiePie[0] ;
         A390DisTipCol = P00ZD3_A390DisTipCol[0] ;
         n390DisTipCol = P00ZD3_n390DisTipCol[0] ;
         A363DisColNum = P00ZD3_A363DisColNum[0] ;
         n363DisColNum = P00ZD3_n363DisColNum[0] ;
         A362DisColNom = P00ZD3_A362DisColNom[0] ;
         n362DisColNom = P00ZD3_n362DisColNom[0] ;
         A335DisArtCod = P00ZD3_A335DisArtCod[0] ;
         A252CliCod = P00ZD3_A252CliCod[0] ;
         n252CliCod = P00ZD3_n252CliCod[0] ;
         A396EmprCod = P00ZD3_A396EmprCod[0] ;
         A365DisDes = P00ZD3_A365DisDes[0] ;
         A829TipArtCod = P00ZD3_A829TipArtCod[0] ;
         n829TipArtCod = P00ZD3_n829TipArtCod[0] ;
         A970ProceCod = P00ZD3_A970ProceCod[0] ;
         n970ProceCod = P00ZD3_n970ProceCod[0] ;
         A387DisPiePie = P00ZD3_A387DisPiePie[0] ;
         n387DisPiePie = P00ZD3_n387DisPiePie[0] ;
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
         GXt_char2 = A475FindCol ;
         GXv_char3[0] = GXt_char2 ;
         new app.pedidos.dis_findcol_validate(remoteHandle, context).execute( A396EmprCod, A252CliCod, A335DisArtCod, A362DisColNom, A363DisColNum, A390DisTipCol, GXv_char3) ;
         pgenbame.this.GXt_char2 = GXv_char3[0] ;
         A475FindCol = GXt_char2 ;
         W396EmprCod = A396EmprCod ;
         W361DisCod = A361DisCod ;
         AV24ContVal = 0 ;
         if ( ( GXutil.strcmp(A757PriCod, "0") == 0 ) && ( AV25Flag == 1 ) )
         {
            GXv_int4[0] = AV24ContVal ;
            new app.pnumdoc(remoteHandle, context).execute( AV15EmprCod, "020300", GXv_int4) ;
            pgenbame.this.AV24ContVal = GXv_int4[0] ;
         }
         if ( ( GXutil.strcmp(A757PriCod, "1") == 0 ) && ( AV25Flag == 1 ) )
         {
            GXv_int4[0] = AV24ContVal ;
            new app.pnumdoc(remoteHandle, context).execute( AV15EmprCod, "021300", GXv_int4) ;
            pgenbame.this.AV24ContVal = GXv_int4[0] ;
         }
         AV29DisReo = (byte)(0) ;
         /* Using cursor P00ZD4 */
         pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod), Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n829TipArtCod), Short.valueOf(A829TipArtCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A6263AlbRTartC = P00ZD4_A6263AlbRTartC[0] ;
            n6263AlbRTartC = P00ZD4_n6263AlbRTartC[0] ;
            A55AlbRReo = P00ZD4_A55AlbRReo[0] ;
            A44AlbRecCod = P00ZD4_A44AlbRecCod[0] ;
            if ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "SI", "")) == 0 )
            {
               AV29DisReo = (byte)(1) ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /*
            INSERT RECORD ON TABLE TXPBARCAD

         */
         W396EmprCod = A396EmprCod ;
         W361DisCod = A361DisCod ;
         A396EmprCod = AV15EmprCod ;
         if ( AV25Flag == 0 )
         {
            A129BarCod = A361DisCod ;
            AV18BarCod = A361DisCod ;
         }
         else
         {
            A129BarCod = AV24ContVal ;
            AV18BarCod = AV24ContVal ;
         }
         A132BarCodReo = (byte)(0) ;
         A130BarCodPar = " " ;
         A143BarDisNum = A360DisCliNum ;
         A212BarSer = A335DisArtCod ;
         A217BarTipArt = A352DisArtTip ;
         n217BarTipArt = false ;
         A135BarColNom = A362DisColNom ;
         A136BarColNum = A363DisColNum ;
         A218BarTipCol = A390DisTipCol ;
         A159BarFecGen = GXutil.today( ) ;
         A192BarNumUni = A375DisNumUni ;
         A228BarUniMed = A392DisUniMed ;
         A155BarFecCli = A370DisFecCli ;
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
         {
            A191BarNumPie = A387DisPiePie ;
         }
         else
         {
            A191BarNumPie = A386DisPieNor ;
         }
         A158BarFecFpr = A371DisFecEnt ;
         A180BarMaqCod = AV17MaqCod ;
         if ( GXutil.strcmp(A341DisArtOpe, httpContext.getMessage( "SI", "")) == 0 )
         {
            A193BarOpeEsp = (byte)(1) ;
         }
         else
         {
            if ( ( GXutil.strcmp(A475FindCol, "xxx") == 0 ) || ( AV29DisReo == 1 ) )
            {
               if ( GXutil.strcmp(A475FindCol, "xxx") == 0 )
               {
                  A193BarOpeEsp = (byte)(4) ;
               }
               else
               {
                  if ( AV29DisReo == 1 )
                  {
                     A193BarOpeEsp = (byte)(7) ;
                  }
               }
            }
            else
            {
               A193BarOpeEsp = (byte)(0) ;
            }
         }
         A235BarUrg = A359DisArtUrg ;
         A182BarMat = A340DisArtMat ;
         A211BarRdt = A350DisArtRdt ;
         A221BarTra1 = A353DisArtTr1 ;
         A224BarTraP1 = A344DisArtPt1 ;
         A222BarTra2 = A354DisArtTr2 ;
         A225BarTraP2 = A345DisArtPt2 ;
         A223BarTra3 = A355DisArtTr3 ;
         A226BarTraP3 = A346DisArtPt3 ;
         A229BarUrd1 = A356DisArtUr1 ;
         A232BarUrdP1 = A347DisArtPu1 ;
         A230BarUrd2 = A357DisArtUr2 ;
         A233BarUrdP2 = A348DisArtPu2 ;
         A231BarUrd3 = A358DisArtUr3 ;
         A234BarUrdP3 = A349DisArtPu3 ;
         A127BarAncCru1 = A1232DisArtAcb ;
         A125BarAncAca1 = A334DisArtAnh ;
         A206BarPle = A343DisArtPle ;
         A177BarLar = A339DisArtLar ;
         A214BarSua = A351DisArtSua ;
         A118BarAcaQui = A333DisArtAca ;
         A139BarCorOri = A336DisArtCor ;
         A145BarEncOri = A338DisArtEnc ;
         A146BarEst = (byte)(0) ;
         if ( GXutil.strcmp(A475FindCol, "xxx") == 0 )
         {
            A213BarSit = (byte)(2) ;
            A147BarEstCol = (byte)(0) ;
         }
         else
         {
            A213BarSit = (byte)(1) ;
            A147BarEstCol = (byte)(1) ;
         }
         A209BarPri = A757PriCod ;
         A138BarConReo = (byte)(0) ;
         A137BarConPar = " " ;
         A189BarNumAny = (short)(0) ;
         A141BarCosPro = DecimalUtil.doubleToDec(0) ;
         A140BarCosAny = DecimalUtil.doubleToDec(0) ;
         A169BarKgsFac = DecimalUtil.doubleToDec(0) ;
         if ( AV29DisReo == 1 )
         {
            A148BarEstReo = (byte)(2) ;
         }
         else
         {
            A148BarEstReo = (byte)(0) ;
         }
         A158BarFecFpr = A371DisFecEnt ;
         A120BarAgrEst = httpContext.getMessage( "N", "") ;
         A864BarPes = A342DisArtPes ;
         A1798BarDibCli = A1013DibCli ;
         A1799BarDibInt = A1014DibInt ;
         A1652BarSerDsc = A337DisArtDsc ;
         A2512BarComULin = AV36DisComULin ;
         n2512BarComULin = false ;
         A9775BarItem1 = A9771DisItem1 ;
         /* Using cursor P00ZD5 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A120BarAgrEst, A180BarMaqCod, Integer.valueOf(A361DisCod), A143BarDisNum, A212BarSer, Boolean.valueOf(n217BarTipArt), Short.valueOf(A217BarTipArt), A135BarColNom, Integer.valueOf(A136BarColNum), Byte.valueOf(A218BarTipCol), A159BarFecGen, A192BarNumUni, A228BarUniMed, Byte.valueOf(A148BarEstReo), A155BarFecCli, Short.valueOf(A191BarNumPie), Byte.valueOf(A193BarOpeEsp), Byte.valueOf(A235BarUrg), A182BarMat, A211BarRdt, A221BarTra1, Short.valueOf(A224BarTraP1), A222BarTra2, Short.valueOf(A225BarTraP2), A223BarTra3, Short.valueOf(A226BarTraP3), A229BarUrd1, Short.valueOf(A232BarUrdP1), A230BarUrd2, Short.valueOf(A233BarUrdP2), A231BarUrd3, Short.valueOf(A234BarUrdP3), Short.valueOf(A127BarAncCru1), Short.valueOf(A125BarAncAca1), A206BarPle, A177BarLar, A214BarSua, A118BarAcaQui, A139BarCorOri, A145BarEncOri, Byte.valueOf(A146BarEst), Byte.valueOf(A213BarSit), A209BarPri, Byte.valueOf(A138BarConReo), A137BarConPar, Short.valueOf(A189BarNumAny), A141BarCosPro, A140BarCosAny, A169BarKgsFac, A158BarFecFpr, Byte.valueOf(A147BarEstCol), Short.valueOf(A864BarPes), A1652BarSerDsc, A1798BarDibCli, Integer.valueOf(A1799BarDibInt), Boolean.valueOf(n2512BarComULin), Byte.valueOf(A2512BarComULin), A9775BarItem1, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A365DisDes});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
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
         A361DisCod = W361DisCod ;
         /* End Insert */
         AV36DisComULin = (byte)(0) ;
         /* Using cursor P00ZD6 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A1057DisComAnh = P00ZD6_A1057DisComAnh[0] ;
            n1057DisComAnh = P00ZD6_n1057DisComAnh[0] ;
            A1058DisComMtr = P00ZD6_A1058DisComMtr[0] ;
            n1058DisComMtr = P00ZD6_n1058DisComMtr[0] ;
            A1059DisComPie = P00ZD6_A1059DisComPie[0] ;
            n1059DisComPie = P00ZD6_n1059DisComPie[0] ;
            A1032FonCod = P00ZD6_A1032FonCod[0] ;
            A1056DisComCod = P00ZD6_A1056DisComCod[0] ;
            A2524DisComLin = P00ZD6_A2524DisComLin[0] ;
            W396EmprCod = A396EmprCod ;
            /*
               INSERT RECORD ON TABLE TXPBARCOM

            */
            W396EmprCod = A396EmprCod ;
            A396EmprCod = AV15EmprCod ;
            if ( AV25Flag == 0 )
            {
               A129BarCod = A361DisCod ;
            }
            else
            {
               A129BarCod = AV24ContVal ;
            }
            A132BarCodReo = (byte)(0) ;
            A130BarCodPar = " " ;
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
            /* Using cursor P00ZD7 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod, Boolean.valueOf(n1539BarComAnh), Short.valueOf(A1539BarComAnh), Boolean.valueOf(n1541BarComMtr), A1541BarComMtr, Boolean.valueOf(n1543BarComPie), Short.valueOf(A1543BarComPie), Boolean.valueOf(n1540BarComMLan), A1540BarComMLan, Boolean.valueOf(n1544BarComPLan), Short.valueOf(A1544BarComPLan), Boolean.valueOf(n1542BarComPEst), Byte.valueOf(A1542BarComPEst), Boolean.valueOf(n2069BarComEst), A2069BarComEst, Boolean.valueOf(n2072BarMtrRep), A2072BarMtrRep, Boolean.valueOf(n2071BarMtrEst), A2071BarMtrEst, Boolean.valueOf(n2117RecEstAnh), Short.valueOf(A2117RecEstAnh), Boolean.valueOf(n2073BarNumMol), Short.valueOf(A2073BarNumMol), Boolean.valueOf(n2509BarCodLan), Integer.valueOf(A2509BarCodLan), Boolean.valueOf(n2510BarComPri), A2510BarComPri, Boolean.valueOf(n2131RecObsULin), Byte.valueOf(A2131RecObsULin)});
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
            AV36DisComULin = A2524DisComLin ;
            A396EmprCod = W396EmprCod ;
            pr_default.readNext(3);
         }
         pr_default.close(3);
         GXv_char3[0] = AV15EmprCod ;
         GXv_int4[0] = A361DisCod ;
         GXv_int5[0] = AV18BarCod ;
         new app.pfasbar(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_int5) ;
         pgenbame.this.AV15EmprCod = GXv_char3[0] ;
         pgenbame.this.A361DisCod = GXv_int4[0] ;
         pgenbame.this.AV18BarCod = GXv_int5[0] ;
         A367DisEst = (byte)(3) ;
         /* Using cursor P00ZD9 */
         pr_default.execute(5, new Object[] {AV15EmprCod, Integer.valueOf(A361DisCod)});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A319DefPor = P00ZD9_A319DefPor[0] ;
            A833TipDefCod = P00ZD9_A833TipDefCod[0] ;
            n833TipDefCod = P00ZD9_n833TipDefCod[0] ;
            A396EmprCod = P00ZD9_A396EmprCod[0] ;
            A387DisPiePie = P00ZD9_A387DisPiePie[0] ;
            n387DisPiePie = P00ZD9_n387DisPiePie[0] ;
            A387DisPiePie = P00ZD9_A387DisPiePie[0] ;
            n387DisPiePie = P00ZD9_n387DisPiePie[0] ;
            W396EmprCod = A396EmprCod ;
            /*
               INSERT RECORD ON TABLE TXPHISREO

            */
            W396EmprCod = A396EmprCod ;
            W833TipDefCod = A833TipDefCod ;
            n833TipDefCod = false ;
            W252CliCod = A252CliCod ;
            n252CliCod = false ;
            A396EmprCod = AV15EmprCod ;
            if ( (0==AV24ContVal) )
            {
               A539HisBarCod = A361DisCod ;
            }
            else
            {
               A539HisBarCod = AV24ContVal ;
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
            /* Using cursor P00ZD10 */
            pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A539HisBarCod), Byte.valueOf(A545HisCodReo), A544HisCodPar, Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod), Boolean.valueOf(n571HisTipArt), Short.valueOf(A571HisTipArt), Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n542HisBarSer), A542HisBarSer, Boolean.valueOf(n546HisColNom), A546HisColNom, Boolean.valueOf(n547HisColNum), Integer.valueOf(A547HisColNum), Boolean.valueOf(n572HisTipCol), Byte.valueOf(A572HisTipCol), Boolean.valueOf(n553HisNumPie), Short.valueOf(A553HisNumPie), Boolean.valueOf(n540HisBarKgm), A540HisBarKgm, Boolean.valueOf(n541HisBarMtr), A541HisBarMtr, Boolean.valueOf(n602MaqCod), A602MaqCod, Boolean.valueOf(n569HisReoFec), A569HisReoFec, Boolean.valueOf(n549HisKgmOri), A549HisKgmOri, Boolean.valueOf(n552HisMtrOri), A552HisMtrOri, Boolean.valueOf(n554HisOrdReo), Byte.valueOf(A554HisOrdReo), Boolean.valueOf(n548HisEstReo), Byte.valueOf(A548HisEstReo)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISREO");
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
            A833TipDefCod = W833TipDefCod ;
            n833TipDefCod = false ;
            A252CliCod = W252CliCod ;
            n252CliCod = false ;
            /* End Insert */
            A396EmprCod = W396EmprCod ;
            pr_default.readNext(5);
         }
         pr_default.close(5);
         /* Using cursor P00ZD11 */
         pr_default.execute(7, new Object[] {Byte.valueOf(A367DisEst), A396EmprCod, Integer.valueOf(A361DisCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
         A396EmprCod = W396EmprCod ;
         A361DisCod = W361DisCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pgenbame.this.AV15EmprCod;
      this.aP1[0] = pgenbame.this.AV16DisCod;
      this.aP2[0] = pgenbame.this.AV17MaqCod;
      this.aP3[0] = pgenbame.this.AV18BarCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pgenbame");
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
      /* Using cursor P00ZD12 */
      pr_default.execute(8, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         X595Kilos = P00ZD12_A595Kilos[0] ;
      }
      pr_default.close(8);
      return X595Kilos ;
   }

   public java.math.BigDecimal getDisPieKgm0( String E396EmprCod ,
                                              int E361DisCod )
   {
      X382DisPieKil = DecimalUtil.ZERO ;
      /* Using cursor P00ZD13 */
      pr_default.execute(9, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         X382DisPieKil = P00ZD13_A382DisPieKil[0] ;
      }
      pr_default.close(9);
      return X382DisPieKil ;
   }

   public java.math.BigDecimal getDisPieMtr1( String E396EmprCod ,
                                              int E361DisCod )
   {
      X631Metros = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P00ZD14 */
      pr_default.execute(10, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         X631Metros = P00ZD14_A631Metros[0] ;
      }
      pr_default.close(10);
      return X631Metros ;
   }

   public java.math.BigDecimal getDisPieMtr0( String E396EmprCod ,
                                              int E361DisCod )
   {
      X384DisPieMet = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P00ZD15 */
      pr_default.execute(11, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         X384DisPieMet = P00ZD15_A384DisPieMet[0] ;
      }
      pr_default.close(11);
      return X384DisPieMet ;
   }

   public int getDisPieNor0( String E396EmprCod ,
                             int E361DisCod )
   {
      X673Piezas = 0 ;
      /* Using cursor P00ZD16 */
      pr_default.execute(12, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         X673Piezas = P00ZD16_A673Piezas[0] ;
      }
      pr_default.close(12);
      return X673Piezas ;
   }

   public void initialize( )
   {
      GXv_int1 = new byte[1] ;
      scmdbuf = "" ;
      P00ZD3_A966PartCod = new String[] {""} ;
      P00ZD3_n966PartCod = new boolean[] {false} ;
      P00ZD3_A360DisCliNum = new String[] {""} ;
      P00ZD3_A352DisArtTip = new short[1] ;
      P00ZD3_A375DisNumUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00ZD3_A392DisUniMed = new String[] {""} ;
      P00ZD3_A370DisFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P00ZD3_A371DisFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P00ZD3_A341DisArtOpe = new String[] {""} ;
      P00ZD3_A359DisArtUrg = new byte[1] ;
      P00ZD3_A340DisArtMat = new String[] {""} ;
      P00ZD3_A350DisArtRdt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00ZD3_A353DisArtTr1 = new String[] {""} ;
      P00ZD3_A344DisArtPt1 = new short[1] ;
      P00ZD3_A354DisArtTr2 = new String[] {""} ;
      P00ZD3_A345DisArtPt2 = new short[1] ;
      P00ZD3_A355DisArtTr3 = new String[] {""} ;
      P00ZD3_A346DisArtPt3 = new short[1] ;
      P00ZD3_A356DisArtUr1 = new String[] {""} ;
      P00ZD3_A347DisArtPu1 = new short[1] ;
      P00ZD3_A357DisArtUr2 = new String[] {""} ;
      P00ZD3_A348DisArtPu2 = new short[1] ;
      P00ZD3_A358DisArtUr3 = new String[] {""} ;
      P00ZD3_A349DisArtPu3 = new short[1] ;
      P00ZD3_n349DisArtPu3 = new boolean[] {false} ;
      P00ZD3_A1232DisArtAcb = new short[1] ;
      P00ZD3_A334DisArtAnh = new short[1] ;
      P00ZD3_A343DisArtPle = new String[] {""} ;
      P00ZD3_A339DisArtLar = new String[] {""} ;
      P00ZD3_A351DisArtSua = new String[] {""} ;
      P00ZD3_A333DisArtAca = new String[] {""} ;
      P00ZD3_A336DisArtCor = new String[] {""} ;
      P00ZD3_A338DisArtEnc = new String[] {""} ;
      P00ZD3_A757PriCod = new String[] {""} ;
      P00ZD3_A342DisArtPes = new short[1] ;
      P00ZD3_A1013DibCli = new String[] {""} ;
      P00ZD3_n1013DibCli = new boolean[] {false} ;
      P00ZD3_A1014DibInt = new int[1] ;
      P00ZD3_n1014DibInt = new boolean[] {false} ;
      P00ZD3_A337DisArtDsc = new String[] {""} ;
      P00ZD3_A9771DisItem1 = new String[] {""} ;
      P00ZD3_A361DisCod = new int[1] ;
      P00ZD3_A829TipArtCod = new short[1] ;
      P00ZD3_n829TipArtCod = new boolean[] {false} ;
      P00ZD3_A970ProceCod = new short[1] ;
      P00ZD3_n970ProceCod = new boolean[] {false} ;
      P00ZD3_A367DisEst = new byte[1] ;
      P00ZD3_A387DisPiePie = new short[1] ;
      P00ZD3_n387DisPiePie = new boolean[] {false} ;
      P00ZD3_A390DisTipCol = new byte[1] ;
      P00ZD3_n390DisTipCol = new boolean[] {false} ;
      P00ZD3_A363DisColNum = new int[1] ;
      P00ZD3_n363DisColNum = new boolean[] {false} ;
      P00ZD3_A362DisColNom = new String[] {""} ;
      P00ZD3_n362DisColNom = new boolean[] {false} ;
      P00ZD3_A335DisArtCod = new String[] {""} ;
      P00ZD3_A252CliCod = new int[1] ;
      P00ZD3_n252CliCod = new boolean[] {false} ;
      P00ZD3_A396EmprCod = new String[] {""} ;
      P00ZD3_A365DisDes = new String[] {""} ;
      A966PartCod = "" ;
      A360DisCliNum = "" ;
      A375DisNumUni = DecimalUtil.ZERO ;
      A392DisUniMed = "" ;
      A370DisFecCli = GXutil.nullDate() ;
      A371DisFecEnt = GXutil.nullDate() ;
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
      A757PriCod = "" ;
      A1013DibCli = "" ;
      A337DisArtDsc = "" ;
      A9771DisItem1 = "" ;
      A362DisColNom = "" ;
      A335DisArtCod = "" ;
      A396EmprCod = "" ;
      A365DisDes = "" ;
      A385DisPieMtr = DecimalUtil.ZERO ;
      A381DisPieKgm = DecimalUtil.ZERO ;
      A475FindCol = "" ;
      GXt_char2 = "" ;
      W396EmprCod = "" ;
      P00ZD4_A396EmprCod = new String[] {""} ;
      P00ZD4_A252CliCod = new int[1] ;
      P00ZD4_n252CliCod = new boolean[] {false} ;
      P00ZD4_A970ProceCod = new short[1] ;
      P00ZD4_n970ProceCod = new boolean[] {false} ;
      P00ZD4_A6263AlbRTartC = new short[1] ;
      P00ZD4_n6263AlbRTartC = new boolean[] {false} ;
      P00ZD4_A55AlbRReo = new String[] {""} ;
      P00ZD4_A44AlbRecCod = new int[1] ;
      A55AlbRReo = "" ;
      A130BarCodPar = "" ;
      A143BarDisNum = "" ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A192BarNumUni = DecimalUtil.ZERO ;
      A228BarUniMed = "" ;
      A155BarFecCli = GXutil.nullDate() ;
      A158BarFecFpr = GXutil.nullDate() ;
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
      A209BarPri = "" ;
      A137BarConPar = "" ;
      A141BarCosPro = DecimalUtil.ZERO ;
      A140BarCosAny = DecimalUtil.ZERO ;
      A169BarKgsFac = DecimalUtil.ZERO ;
      A120BarAgrEst = "" ;
      A1798BarDibCli = "" ;
      A1652BarSerDsc = "" ;
      A9775BarItem1 = "" ;
      Gx_emsg = "" ;
      P00ZD6_A396EmprCod = new String[] {""} ;
      P00ZD6_A361DisCod = new int[1] ;
      P00ZD6_A1057DisComAnh = new short[1] ;
      P00ZD6_n1057DisComAnh = new boolean[] {false} ;
      P00ZD6_A1058DisComMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00ZD6_n1058DisComMtr = new boolean[] {false} ;
      P00ZD6_A1059DisComPie = new short[1] ;
      P00ZD6_n1059DisComPie = new boolean[] {false} ;
      P00ZD6_A1032FonCod = new String[] {""} ;
      P00ZD6_A1056DisComCod = new String[] {""} ;
      P00ZD6_A2524DisComLin = new byte[1] ;
      A1058DisComMtr = DecimalUtil.ZERO ;
      A1032FonCod = "" ;
      A1056DisComCod = "" ;
      A1541BarComMtr = DecimalUtil.ZERO ;
      A1540BarComMLan = DecimalUtil.ZERO ;
      A2069BarComEst = "" ;
      A2072BarMtrRep = DecimalUtil.ZERO ;
      A2510BarComPri = "" ;
      A2071BarMtrEst = DecimalUtil.ZERO ;
      GXv_char3 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_int5 = new int[1] ;
      P00ZD9_A361DisCod = new int[1] ;
      P00ZD9_A319DefPor = new short[1] ;
      P00ZD9_A833TipDefCod = new short[1] ;
      P00ZD9_n833TipDefCod = new boolean[] {false} ;
      P00ZD9_A396EmprCod = new String[] {""} ;
      P00ZD9_A387DisPiePie = new short[1] ;
      P00ZD9_n387DisPiePie = new boolean[] {false} ;
      A544HisCodPar = "" ;
      A542HisBarSer = "" ;
      A546HisColNom = "" ;
      A540HisBarKgm = DecimalUtil.ZERO ;
      A541HisBarMtr = DecimalUtil.ZERO ;
      A569HisReoFec = GXutil.nullDate() ;
      A549HisKgmOri = DecimalUtil.ZERO ;
      A552HisMtrOri = DecimalUtil.ZERO ;
      A602MaqCod = "" ;
      X595Kilos = DecimalUtil.ZERO ;
      E396EmprCod = "" ;
      P00ZD12_A595Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      X382DisPieKil = DecimalUtil.ZERO ;
      P00ZD13_A382DisPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      X631Metros = DecimalUtil.ZERO ;
      P00ZD14_A631Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      X384DisPieMet = DecimalUtil.ZERO ;
      P00ZD15_A384DisPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00ZD16_A673Piezas = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pgenbame__default(),
         new Object[] {
             new Object[] {
            P00ZD3_A966PartCod, P00ZD3_n966PartCod, P00ZD3_A360DisCliNum, P00ZD3_A352DisArtTip, P00ZD3_A375DisNumUni, P00ZD3_A392DisUniMed, P00ZD3_A370DisFecCli, P00ZD3_A371DisFecEnt, P00ZD3_A341DisArtOpe, P00ZD3_A359DisArtUrg,
            P00ZD3_A340DisArtMat, P00ZD3_A350DisArtRdt, P00ZD3_A353DisArtTr1, P00ZD3_A344DisArtPt1, P00ZD3_A354DisArtTr2, P00ZD3_A345DisArtPt2, P00ZD3_A355DisArtTr3, P00ZD3_A346DisArtPt3, P00ZD3_A356DisArtUr1, P00ZD3_A347DisArtPu1,
            P00ZD3_A357DisArtUr2, P00ZD3_A348DisArtPu2, P00ZD3_A358DisArtUr3, P00ZD3_A349DisArtPu3, P00ZD3_n349DisArtPu3, P00ZD3_A1232DisArtAcb, P00ZD3_A334DisArtAnh, P00ZD3_A343DisArtPle, P00ZD3_A339DisArtLar, P00ZD3_A351DisArtSua,
            P00ZD3_A333DisArtAca, P00ZD3_A336DisArtCor, P00ZD3_A338DisArtEnc, P00ZD3_A757PriCod, P00ZD3_A342DisArtPes, P00ZD3_A1013DibCli, P00ZD3_n1013DibCli, P00ZD3_A1014DibInt, P00ZD3_n1014DibInt, P00ZD3_A337DisArtDsc,
            P00ZD3_A9771DisItem1, P00ZD3_A361DisCod, P00ZD3_A829TipArtCod, P00ZD3_n829TipArtCod, P00ZD3_A970ProceCod, P00ZD3_n970ProceCod, P00ZD3_A367DisEst, P00ZD3_A387DisPiePie, P00ZD3_n387DisPiePie, P00ZD3_A390DisTipCol,
            P00ZD3_n390DisTipCol, P00ZD3_A363DisColNum, P00ZD3_n363DisColNum, P00ZD3_A362DisColNom, P00ZD3_n362DisColNom, P00ZD3_A335DisArtCod, P00ZD3_A252CliCod, P00ZD3_A396EmprCod, P00ZD3_A365DisDes
            }
            , new Object[] {
            P00ZD4_A396EmprCod, P00ZD4_A252CliCod, P00ZD4_A970ProceCod, P00ZD4_n970ProceCod, P00ZD4_A6263AlbRTartC, P00ZD4_n6263AlbRTartC, P00ZD4_A55AlbRReo, P00ZD4_A44AlbRecCod
            }
            , new Object[] {
            }
            , new Object[] {
            P00ZD6_A396EmprCod, P00ZD6_A361DisCod, P00ZD6_A1057DisComAnh, P00ZD6_n1057DisComAnh, P00ZD6_A1058DisComMtr, P00ZD6_n1058DisComMtr, P00ZD6_A1059DisComPie, P00ZD6_n1059DisComPie, P00ZD6_A1032FonCod, P00ZD6_A1056DisComCod,
            P00ZD6_A2524DisComLin
            }
            , new Object[] {
            }
            , new Object[] {
            P00ZD9_A361DisCod, P00ZD9_A319DefPor, P00ZD9_A833TipDefCod, P00ZD9_A396EmprCod, P00ZD9_A387DisPiePie, P00ZD9_n387DisPiePie
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P00ZD12_A595Kilos
            }
            , new Object[] {
            P00ZD13_A382DisPieKil
            }
            , new Object[] {
            P00ZD14_A631Metros
            }
            , new Object[] {
            P00ZD15_A384DisPieMet
            }
            , new Object[] {
            P00ZD16_A673Piezas
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV25Flag ;
   private byte GXv_int1[] ;
   private byte A359DisArtUrg ;
   private byte A367DisEst ;
   private byte A390DisTipCol ;
   private byte AV29DisReo ;
   private byte A132BarCodReo ;
   private byte A218BarTipCol ;
   private byte A193BarOpeEsp ;
   private byte A235BarUrg ;
   private byte A146BarEst ;
   private byte A213BarSit ;
   private byte A147BarEstCol ;
   private byte A138BarConReo ;
   private byte A148BarEstReo ;
   private byte A2512BarComULin ;
   private byte AV36DisComULin ;
   private byte A2524DisComLin ;
   private byte A1542BarComPEst ;
   private byte A2131RecObsULin ;
   private byte A545HisCodReo ;
   private byte A572HisTipCol ;
   private byte A554HisOrdReo ;
   private byte A548HisEstReo ;
   private short A352DisArtTip ;
   private short A344DisArtPt1 ;
   private short A345DisArtPt2 ;
   private short A346DisArtPt3 ;
   private short A347DisArtPu1 ;
   private short A348DisArtPu2 ;
   private short A349DisArtPu3 ;
   private short A1232DisArtAcb ;
   private short A334DisArtAnh ;
   private short A342DisArtPes ;
   private short A829TipArtCod ;
   private short A970ProceCod ;
   private short A387DisPiePie ;
   private short A386DisPieNor ;
   private short A6263AlbRTartC ;
   private short A217BarTipArt ;
   private short A191BarNumPie ;
   private short A224BarTraP1 ;
   private short A225BarTraP2 ;
   private short A226BarTraP3 ;
   private short A232BarUrdP1 ;
   private short A233BarUrdP2 ;
   private short A234BarUrdP3 ;
   private short A127BarAncCru1 ;
   private short A125BarAncAca1 ;
   private short A189BarNumAny ;
   private short A864BarPes ;
   private short Gx_err ;
   private short A1057DisComAnh ;
   private short A1059DisComPie ;
   private short A1539BarComAnh ;
   private short A1543BarComPie ;
   private short A1544BarComPLan ;
   private short A2117RecEstAnh ;
   private short A2073BarNumMol ;
   private short A319DefPor ;
   private short A833TipDefCod ;
   private short W833TipDefCod ;
   private short A571HisTipArt ;
   private short A553HisNumPie ;
   private int AV16DisCod ;
   private int AV18BarCod ;
   private int A1014DibInt ;
   private int A361DisCod ;
   private int A363DisColNum ;
   private int A252CliCod ;
   private int W361DisCod ;
   private int AV24ContVal ;
   private int A44AlbRecCod ;
   private int GX_INS12 ;
   private int A129BarCod ;
   private int A136BarColNum ;
   private int A1799BarDibInt ;
   private int GX_INS542 ;
   private int A2509BarCodLan ;
   private int GXv_int4[] ;
   private int GXv_int5[] ;
   private int GX_INS60 ;
   private int W252CliCod ;
   private int A539HisBarCod ;
   private int A547HisColNum ;
   private int E361DisCod ;
   private int X673Piezas ;
   private java.math.BigDecimal A375DisNumUni ;
   private java.math.BigDecimal A350DisArtRdt ;
   private java.math.BigDecimal A385DisPieMtr ;
   private java.math.BigDecimal A381DisPieKgm ;
   private java.math.BigDecimal A192BarNumUni ;
   private java.math.BigDecimal A211BarRdt ;
   private java.math.BigDecimal A141BarCosPro ;
   private java.math.BigDecimal A140BarCosAny ;
   private java.math.BigDecimal A169BarKgsFac ;
   private java.math.BigDecimal A1058DisComMtr ;
   private java.math.BigDecimal A1541BarComMtr ;
   private java.math.BigDecimal A1540BarComMLan ;
   private java.math.BigDecimal A2072BarMtrRep ;
   private java.math.BigDecimal A2071BarMtrEst ;
   private java.math.BigDecimal A540HisBarKgm ;
   private java.math.BigDecimal A541HisBarMtr ;
   private java.math.BigDecimal A549HisKgmOri ;
   private java.math.BigDecimal A552HisMtrOri ;
   private java.math.BigDecimal X595Kilos ;
   private java.math.BigDecimal X382DisPieKil ;
   private java.math.BigDecimal X631Metros ;
   private java.math.BigDecimal X384DisPieMet ;
   private String AV15EmprCod ;
   private String AV17MaqCod ;
   private String scmdbuf ;
   private String A966PartCod ;
   private String A360DisCliNum ;
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
   private String A757PriCod ;
   private String A1013DibCli ;
   private String A337DisArtDsc ;
   private String A9771DisItem1 ;
   private String A362DisColNom ;
   private String A335DisArtCod ;
   private String A396EmprCod ;
   private String A365DisDes ;
   private String A475FindCol ;
   private String GXt_char2 ;
   private String W396EmprCod ;
   private String A55AlbRReo ;
   private String A130BarCodPar ;
   private String A143BarDisNum ;
   private String A212BarSer ;
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
   private String A209BarPri ;
   private String A137BarConPar ;
   private String A120BarAgrEst ;
   private String A1798BarDibCli ;
   private String A1652BarSerDsc ;
   private String A9775BarItem1 ;
   private String Gx_emsg ;
   private String A1032FonCod ;
   private String A1056DisComCod ;
   private String A2069BarComEst ;
   private String A2510BarComPri ;
   private String GXv_char3[] ;
   private String A544HisCodPar ;
   private String A542HisBarSer ;
   private String A546HisColNom ;
   private String A602MaqCod ;
   private String E396EmprCod ;
   private java.util.Date A370DisFecCli ;
   private java.util.Date A371DisFecEnt ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date A155BarFecCli ;
   private java.util.Date A158BarFecFpr ;
   private java.util.Date A569HisReoFec ;
   private boolean n966PartCod ;
   private boolean n349DisArtPu3 ;
   private boolean n1013DibCli ;
   private boolean n1014DibInt ;
   private boolean n829TipArtCod ;
   private boolean n970ProceCod ;
   private boolean n387DisPiePie ;
   private boolean n390DisTipCol ;
   private boolean n363DisColNum ;
   private boolean n362DisColNom ;
   private boolean n252CliCod ;
   private boolean n6263AlbRTartC ;
   private boolean n217BarTipArt ;
   private boolean n2512BarComULin ;
   private boolean n1057DisComAnh ;
   private boolean n1058DisComMtr ;
   private boolean n1059DisComPie ;
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
   private boolean n833TipDefCod ;
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
   private boolean n602MaqCod ;
   private int[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P00ZD3_A966PartCod ;
   private boolean[] P00ZD3_n966PartCod ;
   private String[] P00ZD3_A360DisCliNum ;
   private short[] P00ZD3_A352DisArtTip ;
   private java.math.BigDecimal[] P00ZD3_A375DisNumUni ;
   private String[] P00ZD3_A392DisUniMed ;
   private java.util.Date[] P00ZD3_A370DisFecCli ;
   private java.util.Date[] P00ZD3_A371DisFecEnt ;
   private String[] P00ZD3_A341DisArtOpe ;
   private byte[] P00ZD3_A359DisArtUrg ;
   private String[] P00ZD3_A340DisArtMat ;
   private java.math.BigDecimal[] P00ZD3_A350DisArtRdt ;
   private String[] P00ZD3_A353DisArtTr1 ;
   private short[] P00ZD3_A344DisArtPt1 ;
   private String[] P00ZD3_A354DisArtTr2 ;
   private short[] P00ZD3_A345DisArtPt2 ;
   private String[] P00ZD3_A355DisArtTr3 ;
   private short[] P00ZD3_A346DisArtPt3 ;
   private String[] P00ZD3_A356DisArtUr1 ;
   private short[] P00ZD3_A347DisArtPu1 ;
   private String[] P00ZD3_A357DisArtUr2 ;
   private short[] P00ZD3_A348DisArtPu2 ;
   private String[] P00ZD3_A358DisArtUr3 ;
   private short[] P00ZD3_A349DisArtPu3 ;
   private boolean[] P00ZD3_n349DisArtPu3 ;
   private short[] P00ZD3_A1232DisArtAcb ;
   private short[] P00ZD3_A334DisArtAnh ;
   private String[] P00ZD3_A343DisArtPle ;
   private String[] P00ZD3_A339DisArtLar ;
   private String[] P00ZD3_A351DisArtSua ;
   private String[] P00ZD3_A333DisArtAca ;
   private String[] P00ZD3_A336DisArtCor ;
   private String[] P00ZD3_A338DisArtEnc ;
   private String[] P00ZD3_A757PriCod ;
   private short[] P00ZD3_A342DisArtPes ;
   private String[] P00ZD3_A1013DibCli ;
   private boolean[] P00ZD3_n1013DibCli ;
   private int[] P00ZD3_A1014DibInt ;
   private boolean[] P00ZD3_n1014DibInt ;
   private String[] P00ZD3_A337DisArtDsc ;
   private String[] P00ZD3_A9771DisItem1 ;
   private int[] P00ZD3_A361DisCod ;
   private short[] P00ZD3_A829TipArtCod ;
   private boolean[] P00ZD3_n829TipArtCod ;
   private short[] P00ZD3_A970ProceCod ;
   private boolean[] P00ZD3_n970ProceCod ;
   private byte[] P00ZD3_A367DisEst ;
   private short[] P00ZD3_A387DisPiePie ;
   private boolean[] P00ZD3_n387DisPiePie ;
   private byte[] P00ZD3_A390DisTipCol ;
   private boolean[] P00ZD3_n390DisTipCol ;
   private int[] P00ZD3_A363DisColNum ;
   private boolean[] P00ZD3_n363DisColNum ;
   private String[] P00ZD3_A362DisColNom ;
   private boolean[] P00ZD3_n362DisColNom ;
   private String[] P00ZD3_A335DisArtCod ;
   private int[] P00ZD3_A252CliCod ;
   private boolean[] P00ZD3_n252CliCod ;
   private String[] P00ZD3_A396EmprCod ;
   private String[] P00ZD3_A365DisDes ;
   private String[] P00ZD4_A396EmprCod ;
   private int[] P00ZD4_A252CliCod ;
   private boolean[] P00ZD4_n252CliCod ;
   private short[] P00ZD4_A970ProceCod ;
   private boolean[] P00ZD4_n970ProceCod ;
   private short[] P00ZD4_A6263AlbRTartC ;
   private boolean[] P00ZD4_n6263AlbRTartC ;
   private String[] P00ZD4_A55AlbRReo ;
   private int[] P00ZD4_A44AlbRecCod ;
   private String[] P00ZD6_A396EmprCod ;
   private int[] P00ZD6_A361DisCod ;
   private short[] P00ZD6_A1057DisComAnh ;
   private boolean[] P00ZD6_n1057DisComAnh ;
   private java.math.BigDecimal[] P00ZD6_A1058DisComMtr ;
   private boolean[] P00ZD6_n1058DisComMtr ;
   private short[] P00ZD6_A1059DisComPie ;
   private boolean[] P00ZD6_n1059DisComPie ;
   private String[] P00ZD6_A1032FonCod ;
   private String[] P00ZD6_A1056DisComCod ;
   private byte[] P00ZD6_A2524DisComLin ;
   private int[] P00ZD9_A361DisCod ;
   private short[] P00ZD9_A319DefPor ;
   private short[] P00ZD9_A833TipDefCod ;
   private boolean[] P00ZD9_n833TipDefCod ;
   private String[] P00ZD9_A396EmprCod ;
   private short[] P00ZD9_A387DisPiePie ;
   private boolean[] P00ZD9_n387DisPiePie ;
   private java.math.BigDecimal[] P00ZD12_A595Kilos ;
   private java.math.BigDecimal[] P00ZD13_A382DisPieKil ;
   private java.math.BigDecimal[] P00ZD14_A631Metros ;
   private java.math.BigDecimal[] P00ZD15_A384DisPieMet ;
   private int[] P00ZD16_A673Piezas ;
}

final  class pgenbame__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00ZD3", "SELECT T1.PartCod, T1.DisCliNum, T1.DisArtTip, T1.DisNumUni, T1.DisUniMed, T1.DisFecCli, T1.DisFecEnt, T1.DisArtOpe, T1.DisArtUrg, T1.DisArtMat, T1.DisArtRdt, T1.DisArtTr1, T1.DisArtPt1, T1.DisArtTr2, T1.DisArtPt2, T1.DisArtTr3, T1.DisArtPt3, T1.DisArtUr1, T1.DisArtPu1, T1.DisArtUr2, T1.DisArtPu2, T1.DisArtUr3, T1.DisArtPu3, T1.DisArtAcb, T1.DisArtAnh, T1.DisArtPle, T1.DisArtLar, T1.DisArtSua, T1.DisArtAca, T1.DisArtCor, T1.DisArtEnc, T1.PriCod, T1.DisArtPes, T1.DibCli, T1.DibInt, T1.DisArtDsc, T1.DisItem1, T1.DisCod, T2.TipArtCod, T2.ProceCod, T1.DisEst, COALESCE( T3.DisPiePie, 0) AS DisPiePie, T1.DisTipCol, T1.DisColNum, T1.DisColNom, T1.DisArtCod, T1.CliCod, T1.EmprCod, T1.DisDes FROM ((TXPDISPOS T1 LEFT JOIN TXPCPARTI T2 ON T2.EmprCod = T1.EmprCod AND T2.PartCod = T1.PartCod AND T2.CliCod = T1.CliCod) LEFT JOIN (SELECT COUNT(*) AS DisPiePie, EmprCod, DisCod FROM TXPDISALD GROUP BY EmprCod, DisCod ) T3 ON T3.EmprCod = T1.EmprCod AND T3.DisCod = T1.DisCod) WHERE (T1.EmprCod = ? and T1.DisCod = ?) AND (T1.DisEst = 1) ORDER BY T1.EmprCod, T1.DisCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00ZD4", "SELECT EmprCod, CliCod, ProceCod, AlbRTartC, AlbRReo, AlbRecCod FROM TXPALBREC WHERE (EmprCod = ? and ProceCod = ?) AND (CliCod = ?) AND (AlbRTartC = ?) ORDER BY EmprCod, ProceCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00ZD5", "INSERT INTO TXPBARCAD(EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrEst, BarMaqCod, DisCod, BarDisNum, BarSer, BarTipArt, BarColNom, BarColNum, BarTipCol, BarFecGen, BarNumUni, BarUniMed, BarEstReo, BarFecCli, BarNumPie, BarOpeEsp, BarUrg, BarMat, BarRdt, BarTra1, BarTraP1, BarTra2, BarTraP2, BarTra3, BarTraP3, BarUrd1, BarUrdP1, BarUrd2, BarUrdP2, BarUrd3, BarUrdP3, BarAncCru1, BarAncAca1, BarPle, BarLar, BarSua, BarAcaQui, BarCorOri, BarEncOri, BarEst, BarSit, BarPri, BarConReo, BarConPar, BarNumAny, BarCosPro, BarCosAny, BarKgsFac, BarFecFpr, BarEstCol, BarPes, BarSerDsc, BarDibCli, BarDibInt, BarComULin, BarItem1, CliCod, DisDes, BarVolMaq, BarOrdReo, BarFecEnt, BarMaqPro, BarFecSal, BarDiaP, BarAncCru2, BarAncAca2, BarHorCum, BarEstRes, BarNumAso, BarDisOri, BarLis, NotUltLin, TipDefCod, TipDefPor, ObsReoEnt, ObsReoULin, BarReoCod, BarReoReo, BarReoPar, BarFecLan, BarMatiz, BarEncCom, BarEncAnh, BarGraCru, BarNomCli, BarNumCli, BarPesBal, BarLocDis, BarNMtr, BarNMez, BarPart, BarLisInd, BarNumTen, BarCodTN, BarTipDis, BarExt, BarCliDes, BarManCod, BarNumPas, BarFecEnE, BarBulEnE, BarKgEnE, BarEntEnE, BarEnULin, BarFecEnR, BarBulEnR, BarKgEnR, BarTipAca, BarGirar, BarNMont, BarTemSec, BarCal, BarEntAca, BarObsVL, BarGraAca, BarRdoN, BarRdoA, BarColPes, BarPrdPes, BarRDos1, BarRDos2, BarFecIni, BarFecFin, BarConAgu, BarConVap, BarConEle, BarCodTex, BarNumTex1, BarNumTex2, BarSitExt, BarMaqGru, UltLinMaq, BarNumLot, BarKgsLot, BarMtrLot, BarProPer, BarIntPer, BarCoef, BarPlf, BarPle2, BarNumCor, BarAncSal1, BarAncSal2, BarAncSal3, BarGraAca2, BarGraCru2, BarFac, BarManCod1, BarManCod2, BarNumTon, BarMacCod, BarPeg, BarFoa, BarNPed, BarEnvRec, BarFecLRe, BarFecCRe, BarEnv, BarTin, BarInci, BarBot, BarSitEst, BarPelAnh, BarCruMts, BarCruKgs, BarCruEnr, BarLotPza, BarLotMts, BarLotKgs, BarLotMaq, BarAcaFor, BarAcaBak, BarAcaAnh, BarAcaMar, BarMdlCod, BarTam, BarHorEnt, BarPzas, BarHorReg, BarDishCod, BarEncCli, BarAudSup, BarAudObs, BarMacPro, BarCtrPdas, BarNumReo, BarLoteA, BarTipEst, BarGraCob, BarCom, BarEstTip, BarBp12, BarBp13, BarBp14, BarBp15, BarFacAbs, BarAcc, BarTipCor, BarCodBan, BarObsGrm, BarObsAnc, BarAntp, BarAntpT, BarAsi, BarMaqEst, BarFecHis, BarOpeHis, EntSecUlt, barItem2, BarItem3, BarItem4, BarItem5, BarItem6, BarAudFec, BarAudTur, BarAudOpe, BarAudOpeN, BarAudSupN, BarAudNPz, BarAudMDig, BarAudMCue, BarAudULin, BarOrdComp, BarPriTin, BarMaqAma, BarVolAma, BarKilLam, BarRecLis, BarAnyTie, BarUltAny, BarEnvBar, BarKgsPrv, BarMtsPrv, BarPiePrv, BarPieKgl, BarPieMtl, BarEnvLaw, Nxt_Mdlo2, Nxt_Sta2, Nxt_ArtCl2, Nxt_cpeID, Nxt_dpoID, Nxt_desaID, SubRevID, BarTpEstam, BarProdID, BarLocTel, BarLocMol, BarLocCol, BarOEKOTEX, BarLineaID, BarCanalID, BarLinPrd, BarDGUltLi, BarRGB, BarRdto4, BarSerDsc2, BarIdtx2, BarCnoEncO, BarPriorid) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, ' ', 0, 0, ' ', ' ', ' ', 0, 0, ' ', 0, ' ', 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', ' ', 0, 0, ' ', ' ', 0, 0, 0, 0, ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, ' ', 0, 0, 0, ' ', 0, 0, 0, 0, ' ', 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, ' ', 0, 0, ' ', 0, ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', 0, ' ', 0, 0, 0, 0, ' ', 0, 0, 0, ' ', 0, ' ', 0, ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', 0, ' ', ' ', 0, 0, ' ', 0, 0, ' ', ' ', 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', ' ', 0, 0, 0, 0, ' ', 0, ' ', 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', 0, 0, 0, ' ', 0, ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', 0, 0, 0, ' ', ' ', ' ', 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P00ZD6", "SELECT EmprCod, DisCod, DisComAnh, DisComMtr, DisComPie, FonCod, DisComCod, DisComLin FROM TXPDISCOM WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod, DisComLin, DisComCod, FonCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00ZD7", "INSERT INTO TXPBARCOM(EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, BarComAnh, BarComMtr, BarComPie, BarComMLan, BarComPLan, BarComPEst, BarComEst, BarMtrRep, BarMtrEst, RecEstAnh, BarNumMol, BarCodLan, BarComPri, RecObsULin, BarGasOpe, BarGasEst, BarGasEmp, BarGasAca, BarPrcMtr, BarFecEst, RecEstTMaq, BarComRep, BarComFC, BarComObs, BarMaqPor, CodMaqEst, OpeREst, OeStatus, OeFecHis, OeKill, BarFecFima, BarEstFima, BarComDibC, BarComDibI) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, ' ', 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCOM")
         ,new ForEachCursor("P00ZD9", "SELECT T1.DisCod, T1.DefPor, T1.TipDefCod, T1.EmprCod, COALESCE( T2.DisPiePie, 0) AS DisPiePie FROM (TXPDISDEF T1 LEFT JOIN (SELECT COUNT(*) AS DisPiePie, EmprCod, DisCod FROM TXPDISALD GROUP BY EmprCod, DisCod ) T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) WHERE T1.EmprCod = ? and T1.DisCod = ? ORDER BY T1.EmprCod, T1.DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00ZD10", "INSERT INTO TXPHISREO(EmprCod, HisBarCod, HisCodReo, HisCodPar, TipDefCod, HisTipArt, CliCod, HisBarSer, HisColNom, HisColNum, HisTipCol, HisNumPie, HisBarKgm, HisBarMtr, MaqCod, HisReoFec, HisKgmOri, HisMtrOri, HisOrdReo, HisEstReo, HisReoTn, HisReoPza, HisReoDsc, CodCausa, Hisoperar, TipCorCod, HisAcCo, HisAcCot, HisAdEAcCo, HisAdEAcCt, HisAdeSN, HisAdeObs, Rps_Cod, HisUsu, HisHorReo, HisNomCli, HisNumCli, HisOpecod, HisOpeTur, HisMtsCarg, HisMtsImp, HisreoLote) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ' ', ' ', 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, 0, 0, 0, ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHISREO")
         ,new UpdateCursor("P00ZD11", "UPDATE TXPDISPOS SET DisEst=?  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPOS")
         ,new ForEachCursor("P00ZD12", "SELECT SUM(Kilos) AS GXC4 FROM TXPDISALB WHERE EmprCod = ? and DisCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00ZD13", "SELECT SUM(DisPieKil) AS GXC3 FROM TXPDISALD WHERE EmprCod = ? and DisCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00ZD14", "SELECT SUM(Metros) AS GXC7 FROM TXPDISALB WHERE EmprCod = ? and DisCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00ZD15", "SELECT SUM(DisPieMet) AS GXC6 FROM TXPDISALD WHERE EmprCod = ? and DisCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00ZD16", "SELECT SUM(Piezas) AS GXC1 FROM TXPDISALB WHERE EmprCod = ? and DisCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 8);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(6);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 2);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 16);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,2);
               ((String[]) buf[12])[0] = rslt.getString(12, 4);
               ((short[]) buf[13])[0] = rslt.getShort(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 4);
               ((short[]) buf[15])[0] = rslt.getShort(15);
               ((String[]) buf[16])[0] = rslt.getString(16, 4);
               ((short[]) buf[17])[0] = rslt.getShort(17);
               ((String[]) buf[18])[0] = rslt.getString(18, 4);
               ((short[]) buf[19])[0] = rslt.getShort(19);
               ((String[]) buf[20])[0] = rslt.getString(20, 4);
               ((short[]) buf[21])[0] = rslt.getShort(21);
               ((String[]) buf[22])[0] = rslt.getString(22, 4);
               ((short[]) buf[23])[0] = rslt.getShort(23);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((short[]) buf[25])[0] = rslt.getShort(24);
               ((short[]) buf[26])[0] = rslt.getShort(25);
               ((String[]) buf[27])[0] = rslt.getString(26, 10);
               ((String[]) buf[28])[0] = rslt.getString(27, 10);
               ((String[]) buf[29])[0] = rslt.getString(28, 6);
               ((String[]) buf[30])[0] = rslt.getString(29, 6);
               ((String[]) buf[31])[0] = rslt.getString(30, 1);
               ((String[]) buf[32])[0] = rslt.getString(31, 1);
               ((String[]) buf[33])[0] = rslt.getString(32, 1);
               ((short[]) buf[34])[0] = rslt.getShort(33);
               ((String[]) buf[35])[0] = rslt.getString(34, 16);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((int[]) buf[37])[0] = rslt.getInt(35);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(36, 26);
               ((String[]) buf[40])[0] = rslt.getString(37, 20);
               ((int[]) buf[41])[0] = rslt.getInt(38);
               ((short[]) buf[42])[0] = rslt.getShort(39);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((short[]) buf[44])[0] = rslt.getShort(40);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((byte[]) buf[46])[0] = rslt.getByte(41);
               ((short[]) buf[47])[0] = rslt.getShort(42);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((byte[]) buf[49])[0] = rslt.getByte(43);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((int[]) buf[51])[0] = rslt.getInt(44);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getString(45, 13);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((String[]) buf[55])[0] = rslt.getString(46, 16);
               ((int[]) buf[56])[0] = rslt.getInt(47);
               ((String[]) buf[57])[0] = rslt.getString(48, 3);
               ((String[]) buf[58])[0] = rslt.getString(49, 1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 2);
               ((int[]) buf[7])[0] = rslt.getInt(6);
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
               ((String[]) buf[8])[0] = rslt.getString(6, 12);
               ((String[]) buf[9])[0] = rslt.getString(7, 12);
               ((byte[]) buf[10])[0] = rslt.getByte(8);
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 8 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 9 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 10 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 11 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 12 :
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[4]).intValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[6]).shortValue());
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 6);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setString(8, (String)parms[7], 8);
               stmt.setString(9, (String)parms[8], 16);
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[10]).shortValue());
               }
               stmt.setString(11, (String)parms[11], 13);
               stmt.setInt(12, ((Number) parms[12]).intValue());
               stmt.setByte(13, ((Number) parms[13]).byteValue());
               stmt.setDate(14, (java.util.Date)parms[14]);
               stmt.setBigDecimal(15, (java.math.BigDecimal)parms[15], 2);
               stmt.setString(16, (String)parms[16], 1);
               stmt.setByte(17, ((Number) parms[17]).byteValue());
               stmt.setDate(18, (java.util.Date)parms[18]);
               stmt.setShort(19, ((Number) parms[19]).shortValue());
               stmt.setByte(20, ((Number) parms[20]).byteValue());
               stmt.setByte(21, ((Number) parms[21]).byteValue());
               stmt.setString(22, (String)parms[22], 16);
               stmt.setBigDecimal(23, (java.math.BigDecimal)parms[23], 2);
               stmt.setString(24, (String)parms[24], 4);
               stmt.setShort(25, ((Number) parms[25]).shortValue());
               stmt.setString(26, (String)parms[26], 4);
               stmt.setShort(27, ((Number) parms[27]).shortValue());
               stmt.setString(28, (String)parms[28], 4);
               stmt.setShort(29, ((Number) parms[29]).shortValue());
               stmt.setString(30, (String)parms[30], 4);
               stmt.setShort(31, ((Number) parms[31]).shortValue());
               stmt.setString(32, (String)parms[32], 4);
               stmt.setShort(33, ((Number) parms[33]).shortValue());
               stmt.setString(34, (String)parms[34], 4);
               stmt.setShort(35, ((Number) parms[35]).shortValue());
               stmt.setShort(36, ((Number) parms[36]).shortValue());
               stmt.setShort(37, ((Number) parms[37]).shortValue());
               stmt.setString(38, (String)parms[38], 10);
               stmt.setString(39, (String)parms[39], 10);
               stmt.setString(40, (String)parms[40], 6);
               stmt.setString(41, (String)parms[41], 6);
               stmt.setString(42, (String)parms[42], 1);
               stmt.setString(43, (String)parms[43], 1);
               stmt.setByte(44, ((Number) parms[44]).byteValue());
               stmt.setByte(45, ((Number) parms[45]).byteValue());
               stmt.setString(46, (String)parms[46], 1);
               stmt.setByte(47, ((Number) parms[47]).byteValue());
               stmt.setString(48, (String)parms[48], 1);
               stmt.setShort(49, ((Number) parms[49]).shortValue());
               stmt.setBigDecimal(50, (java.math.BigDecimal)parms[50], 2);
               stmt.setBigDecimal(51, (java.math.BigDecimal)parms[51], 2);
               stmt.setBigDecimal(52, (java.math.BigDecimal)parms[52], 2);
               stmt.setDate(53, (java.util.Date)parms[53]);
               stmt.setByte(54, ((Number) parms[54]).byteValue());
               stmt.setShort(55, ((Number) parms[55]).shortValue());
               stmt.setString(56, (String)parms[56], 26);
               stmt.setString(57, (String)parms[57], 16);
               stmt.setInt(58, ((Number) parms[58]).intValue());
               if ( ((Boolean) parms[59]).booleanValue() )
               {
                  stmt.setNull( 59 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(59, ((Number) parms[60]).byteValue());
               }
               stmt.setString(60, (String)parms[61], 20);
               if ( ((Boolean) parms[62]).booleanValue() )
               {
                  stmt.setNull( 61 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(61, ((Number) parms[63]).intValue());
               }
               stmt.setString(62, (String)parms[64], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[8]).shortValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[10], 2);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[12]).shortValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[14], 2);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[16]).shortValue());
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(13, ((Number) parms[18]).byteValue());
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[20], 1);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(15, (java.math.BigDecimal)parms[22], 2);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(16, (java.math.BigDecimal)parms[24], 2);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(17, ((Number) parms[26]).shortValue());
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(18, ((Number) parms[28]).shortValue());
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(19, ((Number) parms[30]).intValue());
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(20, (String)parms[32], 1);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(21, ((Number) parms[34]).byteValue());
               }
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
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
               return;
            case 7 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

