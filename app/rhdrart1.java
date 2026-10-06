package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class rhdrart1 extends GXReport
{
   public rhdrart1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rhdrart1.class ), "" );
   }

   public rhdrart1( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      rhdrart1.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      rhdrart1.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      rhdrart1.this.AV127BarCod = aP1[0];
      this.aP1 = aP1;
      rhdrart1.this.AV128BarCodReo = aP2[0];
      this.aP2 = aP2;
      rhdrart1.this.AV129BarCodPar = aP3[0];
      this.aP3 = aP3;
      rhdrart1.this.Gx_out = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      M_top = 0 ;
      M_bot = 4 ;
      P_lines = (int)(66-M_bot) ;
      getPrinter().GxClearAttris() ;
      lineHeight = 15 ;
      PrtOffset = 0 ;
      gxXPage = 100 ;
      gxYPage = 100 ;
      try
      {
         super.Gx_out = this.Gx_out ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "HDRART", "", 2, 1, 1, 15840, 12240, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("HDR Artextil (1) Actual") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*4)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         /* Execute user subroutine: 'PRINCIPAL' */
         S111 ();
         if ( returnInSub )
         {
         }
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h7830( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void S111( ) throws ProcessInterruptedException
   {
      /* 'PRINCIPAL' Routine */
      returnInSub = false ;
      GXt_int1 = AV155detalle ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "DETROL", ""), GXv_int2) ;
      rhdrart1.this.GXt_int1 = GXv_int2[0] ;
      AV155detalle = GXt_int1 ;
      /* Using cursor P07833 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV127BarCod), Byte.valueOf(AV128BarCodReo), AV129BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A833TipDefCod = P07833_A833TipDefCod[0] ;
         n833TipDefCod = P07833_n833TipDefCod[0] ;
         A858ZonGeoCod = P07833_A858ZonGeoCod[0] ;
         A361DisCod = P07833_A361DisCod[0] ;
         A1014DibInt = P07833_A1014DibInt[0] ;
         n1014DibInt = P07833_n1014DibInt[0] ;
         A1013DibCli = P07833_A1013DibCli[0] ;
         n1013DibCli = P07833_n1013DibCli[0] ;
         A1823DibTipMaq = P07833_A1823DibTipMaq[0] ;
         n1823DibTipMaq = P07833_n1823DibTipMaq[0] ;
         A130BarCodPar = P07833_A130BarCodPar[0] ;
         A132BarCodReo = P07833_A132BarCodReo[0] ;
         A129BarCod = P07833_A129BarCod[0] ;
         A1607DibMed = P07833_A1607DibMed[0] ;
         n1607DibMed = P07833_n1607DibMed[0] ;
         A1605DibLocal = P07833_A1605DibLocal[0] ;
         n1605DibLocal = P07833_n1605DibLocal[0] ;
         A1798BarDibCli = P07833_A1798BarDibCli[0] ;
         A252CliCod = P07833_A252CliCod[0] ;
         n252CliCod = P07833_n252CliCod[0] ;
         A212BarSer = P07833_A212BarSer[0] ;
         A135BarColNom = P07833_A135BarColNom[0] ;
         A136BarColNum = P07833_A136BarColNum[0] ;
         A218BarTipCol = P07833_A218BarTipCol[0] ;
         A148BarEstReo = P07833_A148BarEstReo[0] ;
         A217BarTipArt = P07833_A217BarTipArt[0] ;
         n217BarTipArt = P07833_n217BarTipArt[0] ;
         A1431BarLocDis = P07833_A1431BarLocDis[0] ;
         A125BarAncAca1 = P07833_A125BarAncAca1[0] ;
         A126BarAncAca2 = P07833_A126BarAncAca2[0] ;
         A211BarRdt = P07833_A211BarRdt[0] ;
         A1909BarGraAca = P07833_A1909BarGraAca[0] ;
         A3307DisManCod1 = P07833_A3307DisManCod1[0] ;
         A3308DisManCod2 = P07833_A3308DisManCod2[0] ;
         A224BarTraP1 = P07833_A224BarTraP1[0] ;
         A225BarTraP2 = P07833_A225BarTraP2[0] ;
         A226BarTraP3 = P07833_A226BarTraP3[0] ;
         A232BarUrdP1 = P07833_A232BarUrdP1[0] ;
         A233BarUrdP2 = P07833_A233BarUrdP2[0] ;
         A234BarUrdP3 = P07833_A234BarUrdP3[0] ;
         A4832BarAudFec = P07833_A4832BarAudFec[0] ;
         n4832BarAudFec = P07833_n4832BarAudFec[0] ;
         A159BarFecGen = P07833_A159BarFecGen[0] ;
         A7523DisRec = P07833_A7523DisRec[0] ;
         A1360ZonGeoNom = P07833_A1360ZonGeoNom[0] ;
         n1360ZonGeoNom = P07833_n1360ZonGeoNom[0] ;
         A4348DisUsrCod = P07833_A4348DisUsrCod[0] ;
         A834TipDefDsc = P07833_A834TipDefDsc[0] ;
         n834TipDefDsc = P07833_n834TipDefDsc[0] ;
         A177BarLar = P07833_A177BarLar[0] ;
         A1235BarNumCli = P07833_A1235BarNumCli[0] ;
         A1234BarNomCli = P07833_A1234BarNomCli[0] ;
         A1606DibTipRas = P07833_A1606DibTipRas[0] ;
         n1606DibTipRas = P07833_n1606DibTipRas[0] ;
         A139BarCorOri = P07833_A139BarCorOri[0] ;
         A206BarPle = P07833_A206BarPle[0] ;
         A145BarEncOri = P07833_A145BarEncOri[0] ;
         A1652BarSerDsc = P07833_A1652BarSerDsc[0] ;
         A143BarDisNum = P07833_A143BarDisNum[0] ;
         A9771DisItem1 = P07833_A9771DisItem1[0] ;
         A158BarFecFpr = P07833_A158BarFecFpr[0] ;
         A369DisFec = P07833_A369DisFec[0] ;
         A231BarUrd3 = P07833_A231BarUrd3[0] ;
         A230BarUrd2 = P07833_A230BarUrd2[0] ;
         A229BarUrd1 = P07833_A229BarUrd1[0] ;
         A223BarTra3 = P07833_A223BarTra3[0] ;
         A222BarTra2 = P07833_A222BarTra2[0] ;
         A221BarTra1 = P07833_A221BarTra1[0] ;
         A2010BarTipDis = P07833_A2010BarTipDis[0] ;
         A1799BarDibInt = P07833_A1799BarDibInt[0] ;
         A166BarKgm = P07833_A166BarKgm[0] ;
         A184BarMtr = P07833_A184BarMtr[0] ;
         A199BarPie1 = P07833_A199BarPie1[0] ;
         A365DisDes = P07833_A365DisDes[0] ;
         A898BarPieNDes = P07833_A898BarPieNDes[0] ;
         A1014DibInt = P07833_A1014DibInt[0] ;
         n1014DibInt = P07833_n1014DibInt[0] ;
         A1013DibCli = P07833_A1013DibCli[0] ;
         n1013DibCli = P07833_n1013DibCli[0] ;
         A3307DisManCod1 = P07833_A3307DisManCod1[0] ;
         A3308DisManCod2 = P07833_A3308DisManCod2[0] ;
         A7523DisRec = P07833_A7523DisRec[0] ;
         A4348DisUsrCod = P07833_A4348DisUsrCod[0] ;
         A9771DisItem1 = P07833_A9771DisItem1[0] ;
         A369DisFec = P07833_A369DisFec[0] ;
         A858ZonGeoCod = P07833_A858ZonGeoCod[0] ;
         A1823DibTipMaq = P07833_A1823DibTipMaq[0] ;
         n1823DibTipMaq = P07833_n1823DibTipMaq[0] ;
         A1607DibMed = P07833_A1607DibMed[0] ;
         n1607DibMed = P07833_n1607DibMed[0] ;
         A1605DibLocal = P07833_A1605DibLocal[0] ;
         n1605DibLocal = P07833_n1605DibLocal[0] ;
         A1606DibTipRas = P07833_A1606DibTipRas[0] ;
         n1606DibTipRas = P07833_n1606DibTipRas[0] ;
         A834TipDefDsc = P07833_A834TipDefDsc[0] ;
         n834TipDefDsc = P07833_n834TipDefDsc[0] ;
         A1360ZonGeoNom = P07833_A1360ZonGeoNom[0] ;
         n1360ZonGeoNom = P07833_n1360ZonGeoNom[0] ;
         A166BarKgm = P07833_A166BarKgm[0] ;
         A184BarMtr = P07833_A184BarMtr[0] ;
         A199BarPie1 = P07833_A199BarPie1[0] ;
         A898BarPieNDes = P07833_A898BarPieNDes[0] ;
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A198BarPie = A898BarPieNDes ;
         }
         else
         {
            A198BarPie = A199BarPie1 ;
         }
         AV151Fpdsc = " " ;
         /* Using cursor P07834 */
         pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A497FpgCod = P07834_A497FpgCod[0] ;
            A498FpgDsc = P07834_A498FpgDsc[0] ;
            n498FpgDsc = P07834_n498FpgDsc[0] ;
            A297CliPri = P07834_A297CliPri[0] ;
            A498FpgDsc = P07834_A498FpgDsc[0] ;
            n498FpgDsc = P07834_n498FpgDsc[0] ;
            AV151Fpdsc = A498FpgDsc ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         GXt_char3 = AV137CliNom ;
         GXv_char4[0] = GXt_char3 ;
         new app.pclinom(remoteHandle, context).execute( A396EmprCod, A252CliCod, GXv_char4) ;
         rhdrart1.this.GXt_char3 = GXv_char4[0] ;
         AV137CliNom = GXt_char3 ;
         AV96MacCod = 0 ;
         GXv_int5[0] = AV96MacCod ;
         new app.pbusmac(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_int5) ;
         rhdrart1.this.AV96MacCod = GXv_int5[0] ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int5[0] = A129BarCod ;
         GXv_int2[0] = A132BarCodReo ;
         GXv_char6[0] = A130BarCodPar ;
         GXv_int7[0] = AV96MacCod ;
         new app.partmacagr(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_int2, GXv_char6, GXv_int7, AV97HdrA, AV131HdrAgr, AV133BarLocDis) ;
         rhdrart1.this.A396EmprCod = GXv_char4[0] ;
         rhdrart1.this.A129BarCod = GXv_int5[0] ;
         rhdrart1.this.A132BarCodReo = GXv_int2[0] ;
         rhdrart1.this.A130BarCodPar = GXv_char6[0] ;
         rhdrart1.this.AV96MacCod = GXv_int7[0] ;
         AV35HojRut = GXutil.str( A129BarCod, 8, 0) + " " + GXutil.str( A132BarCodReo, 1, 0) + " " + A130BarCodPar ;
         AV87Ceros8 = "00000000" ;
         AV88HdrAlfa = GXutil.str( A129BarCod, 8, 0) ;
         AV88HdrAlfa = GXutil.ltrim( GXutil.rtrim( AV88HdrAlfa)) ;
         AV89LenVar = (byte)(GXutil.len( AV88HdrAlfa)) ;
         AV89LenVar = (byte)(8-AV89LenVar) ;
         AV88HdrAlfa = GXutil.substring( AV87Ceros8, 1, AV89LenVar) + AV88HdrAlfa ;
         if ( GXutil.strcmp(A130BarCodPar, " ") == 0 )
         {
            AV86Hdr = "*" + AV88HdrAlfa + GXutil.str( A132BarCodReo, 1, 0) + "*" ;
         }
         else
         {
            AV86Hdr = "*" + AV88HdrAlfa + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + "*" ;
         }
         AV36CliCod = A252CliCod ;
         AV34BarSer = A212BarSer ;
         AV31EmprCod = A396EmprCod ;
         AV39ForColNom = A135BarColNom ;
         AV40ForColNum = A136BarColNum ;
         AV59TipColCod = A218BarTipCol ;
         AV62TextoReop = "" ;
         if ( A148BarEstReo == 2 )
         {
            AV62TextoReop = httpContext.getMessage( "REOPERADO EXTERIOR", "") ;
         }
         AV79BarSer9 = GXutil.substring( A212BarSer, 1, 9) ;
         AV63TipArtCod = A217BarTipArt ;
         /* Execute user subroutine: 'TIPART' */
         S122 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            if (true) return;
         }
         /* Execute user subroutine: 'OBS' */
         S132 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            if (true) return;
         }
         if ( A132BarCodReo > 0 )
         {
            AV130ReoTxt = httpContext.getMessage( "Reproc. Interno", "") ;
         }
         /* Execute user subroutine: 'RECEP' */
         S142 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            if (true) return;
         }
         AV119AlbRLocs = A1431BarLocDis ;
         AV60DisCod = A361DisCod ;
         /* Execute user subroutine: 'STKI' */
         S152 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            if (true) return;
         }
         AV99BarAncAca1 = ((0==A125BarAncAca1) ? "" : GXutil.trim( GXutil.str( A125BarAncAca1, 10, 0))) ;
         AV100BarAncAca2 = ((0==A126BarAncAca2) ? "" : GXutil.trim( GXutil.str( A126BarAncAca2, 10, 0))) ;
         AV104Comma = ((0==A126BarAncAca2) ? "" : ",") ;
         AV101BarRdt = ((DecimalUtil.compareTo(DecimalUtil.ZERO, A211BarRdt)==0) ? "" : GXutil.trim( GXutil.str( A211BarRdt, 6, 2))) ;
         AV105BarGraAca = (short)(GXutil.lval( ((0==A1909BarGraAca) ? "" : GXutil.trim( GXutil.str( A1909BarGraAca, 10, 0))))) ;
         AV102BarKgm = ((DecimalUtil.compareTo(DecimalUtil.ZERO, A166BarKgm)==0) ? "" : GXutil.trim( GXutil.str( A166BarKgm, 9, 2))) ;
         AV106BarMtr = ((DecimalUtil.compareTo(DecimalUtil.ZERO, A184BarMtr)==0) ? "" : GXutil.trim( GXutil.str( A184BarMtr, 9, 2))) ;
         AV103BarPie = ((0==A198BarPie) ? "" : GXutil.trim( GXutil.str( A198BarPie, 10, 0))) ;
         if ( A3307DisManCod1 == 0 )
         {
            AV135Estampar = httpContext.getMessage( "Sin Especif.", "") ;
         }
         else if ( A3307DisManCod1 == 1 )
         {
            AV134Colorido = httpContext.getMessage( "Colorido s/Muestra", "") ;
         }
         else if ( A3307DisManCod1 == 2 )
         {
            AV134Colorido = httpContext.getMessage( "Colorido p/Código", "") ;
         }
         if ( A3308DisManCod2 == 0 )
         {
            AV135Estampar = httpContext.getMessage( "Sin Especif.", "") ;
         }
         else if ( A3308DisManCod2 == 1 )
         {
            AV135Estampar = httpContext.getMessage( "Estampar p/Metros", "") ;
         }
         else if ( A3308DisManCod2 == 2 )
         {
            AV135Estampar = httpContext.getMessage( "Estampar p/Rollos", "") ;
         }
         else if ( A3308DisManCod2 == 3 )
         {
            AV135Estampar = httpContext.getMessage( "Estampar h/Agotar", "") ;
         }
         AV107BarTraP1 = ((0==A224BarTraP1) ? "" : GXutil.trim( GXutil.str( A224BarTraP1, 10, 0))) ;
         AV108BarTraP2 = ((0==A225BarTraP2) ? "" : GXutil.trim( GXutil.str( A225BarTraP2, 10, 0))) ;
         AV109BarTraP3 = ((0==A226BarTraP3) ? "" : GXutil.trim( GXutil.str( A226BarTraP3, 10, 0))) ;
         AV110BarUrdP1 = ((0==A232BarUrdP1) ? "" : GXutil.trim( GXutil.str( A232BarUrdP1, 10, 0))) ;
         AV111BarUrdP2 = ((0==A233BarUrdP2) ? "" : GXutil.trim( GXutil.str( A233BarUrdP2, 10, 0))) ;
         AV112BarUrdP3 = ((0==A234BarUrdP3) ? "" : GXutil.trim( GXutil.str( A234BarUrdP3, 10, 0))) ;
         AV113Porc[1-1] = ((GXutil.strcmp("", AV107BarTraP1)==0) ? "" : "%") ;
         AV113Porc[2-1] = ((GXutil.strcmp("", AV108BarTraP2)==0) ? "" : "%") ;
         AV113Porc[3-1] = ((GXutil.strcmp("", AV109BarTraP3)==0) ? "" : "%") ;
         AV113Porc[4-1] = ((GXutil.strcmp("", AV110BarUrdP1)==0) ? "" : "%") ;
         AV113Porc[5-1] = ((GXutil.strcmp("", AV111BarUrdP2)==0) ? "" : "%") ;
         AV113Porc[6-1] = ((GXutil.strcmp("", AV112BarUrdP3)==0) ? "" : "%") ;
         /* Execute user subroutine: 'INTENS' */
         S162 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            if (true) return;
         }
         /* Execute user subroutine: 'PROVIN' */
         S172 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            if (true) return;
         }
         /* Execute user subroutine: 'CRUDO' */
         S182 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            if (true) return;
         }
         h7830( false, 372) ;
         getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( A369DisFec, "99/99/99"), 152, Gx_line+4, 205, Gx_line+22, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(localUtil.format( A158BarFecFpr, "99/99/99"), 152, Gx_line+24, 205, Gx_line+42, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9771DisItem1, "")), 151, Gx_line+97, 277, Gx_line+115, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV137CliNom, "")), 209, Gx_line+58, 398, Gx_line+76, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A143BarDisNum, "")), 151, Gx_line+175, 260, Gx_line+193, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A198BarPie), "ZZZZZ9")), 209, Gx_line+273, 253, Gx_line+290, 2, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A166BarKgm, "ZZZZZ9.99")), 376, Gx_line+274, 443, Gx_line+292, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A184BarMtr, "ZZZZZ9.99")), 582, Gx_line+274, 649, Gx_line+292, 2+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35HojRut, "")), 590, Gx_line+9, 674, Gx_line+30, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "MATERIA ", ""), 14, Gx_line+315, 76, Gx_line+332, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "ANCHO", ""), 227, Gx_line+315, 276, Gx_line+332, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "RDTO.", ""), 314, Gx_line+315, 356, Gx_line+332, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "GRM", ""), 367, Gx_line+315, 399, Gx_line+332, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "ARTICULO :", ""), 24, Gx_line+194, 99, Gx_line+211, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV64TipARtDsc, "")), 14, Gx_line+347, 203, Gx_line+365, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV99BarAncAca1, "")), 203, Gx_line+347, 245, Gx_line+365, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV101BarRdt, "")), 264, Gx_line+347, 360, Gx_line+365, 2+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV105BarGraAca), "ZZZ9")), 369, Gx_line+347, 399, Gx_line+365, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawRect(491, Gx_line+4, 780, Gx_line+38, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "HDR", ""), 501, Gx_line+10, 537, Gx_line+29, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "FECHA ENTRADA :", ""), 24, Gx_line+4, 145, Gx_line+21, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "FECHA SALIDA", ""), 24, Gx_line+24, 122, Gx_line+41, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "CLIENTE:", ""), 24, Gx_line+59, 84, Gx_line+76, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "DISP. CLIENTE:", ""), 24, Gx_line+174, 122, Gx_line+191, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "TOTAL UTILIZADO PIEZAS:", ""), 24, Gx_line+274, 193, Gx_line+291, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "TOTAL KILOS:", ""), 270, Gx_line+274, 360, Gx_line+291, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "TOTAL METROS:", ""), 458, Gx_line+274, 565, Gx_line+291, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawLine(9, Gx_line+310, 777, Gx_line+310, 2, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A212BarSer, "")), 151, Gx_line+194, 252, Gx_line+212, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawLine(11, Gx_line+334, 779, Gx_line+334, 1, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV97HdrA[1-1], "")), 642, Gx_line+43, 700, Gx_line+60, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV97HdrA[2-1], "")), 505, Gx_line+59, 563, Gx_line+76, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV97HdrA[3-1], "")), 642, Gx_line+59, 700, Gx_line+76, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV97HdrA[4-1], "")), 505, Gx_line+76, 563, Gx_line+93, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV97HdrA[5-1], "")), 642, Gx_line+76, 700, Gx_line+93, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Hdr Relacionadas:", ""), 499, Gx_line+42, 610, Gx_line+59, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawRect(491, Gx_line+39, 780, Gx_line+96, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV100BarAncAca2, "")), 257, Gx_line+347, 299, Gx_line+365, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV104Comma, "")), 244, Gx_line+347, 259, Gx_line+365, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), 264, Gx_line+194, 427, Gx_line+211, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV116AlbREnts, "")), 582, Gx_line+173, 770, Gx_line+190, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "REMISION CLIENTE:", ""), 442, Gx_line+173, 572, Gx_line+190, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "REMISION ACATEX:", ""), 442, Gx_line+213, 567, Gx_line+230, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV115AlbRecs, "")), 582, Gx_line+213, 771, Gx_line+231, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "ENG. ORI.", ""), 407, Gx_line+315, 473, Gx_line+332, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A145BarEncOri, "@!")), 445, Gx_line+347, 460, Gx_line+365, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "COR. ORI.", ""), 483, Gx_line+315, 549, Gx_line+332, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "SUAVIZADO", ""), 557, Gx_line+315, 634, Gx_line+332, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A206BarPle, "")), 572, Gx_line+347, 636, Gx_line+365, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A139BarCorOri, "@!")), 521, Gx_line+347, 536, Gx_line+365, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "LOCALIZACION", ""), 442, Gx_line+193, 539, Gx_line+210, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV119AlbRLocs, "")), 582, Gx_line+193, 770, Gx_line+210, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "SEGMENTO", ""), 264, Gx_line+174, 342, Gx_line+191, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1606DibTipRas, "")), 346, Gx_line+174, 441, Gx_line+192, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV123HDRs, "")), 582, Gx_line+232, 770, Gx_line+249, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "HDRS STKi :", ""), 442, Gx_line+232, 522, Gx_line+249, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "COLOR :", ""), 24, Gx_line+213, 80, Gx_line+230, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A135BarColNom, "")), 151, Gx_line+214, 233, Gx_line+232, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9")), 264, Gx_line+214, 309, Gx_line+232, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1234BarNomCli, "")), 151, Gx_line+233, 233, Gx_line+251, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1235BarNumCli), "ZZZZZ9")), 264, Gx_line+233, 309, Gx_line+251, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A177BarLar, "")), 689, Gx_line+347, 753, Gx_line+365, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "PRESENTACION", ""), 646, Gx_line+315, 751, Gx_line+332, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV130ReoTxt, "")), 24, Gx_line+117, 134, Gx_line+134, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV131HdrAgr[2-1], "")), 505, Gx_line+116, 563, Gx_line+133, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV131HdrAgr[3-1], "")), 642, Gx_line+116, 700, Gx_line+133, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV131HdrAgr[4-1], "")), 505, Gx_line+132, 563, Gx_line+149, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV131HdrAgr[5-1], "")), 642, Gx_line+132, 700, Gx_line+149, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Hdr Agrupadas:", ""), 499, Gx_line+97, 593, Gx_line+114, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawRect(491, Gx_line+95, 780, Gx_line+152, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV131HdrAgr[1-1], "")), 642, Gx_line+98, 700, Gx_line+115, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV133BarLocDis[1-1], "")), 713, Gx_line+43, 766, Gx_line+60, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV133BarLocDis[2-1], "")), 576, Gx_line+59, 629, Gx_line+76, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV133BarLocDis[3-1], "")), 713, Gx_line+59, 766, Gx_line+76, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV133BarLocDis[4-1], "")), 576, Gx_line+76, 629, Gx_line+93, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV133BarLocDis[5-1], "")), 713, Gx_line+76, 766, Gx_line+93, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV133BarLocDis[6-1], "")), 713, Gx_line+98, 766, Gx_line+115, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV133BarLocDis[7-1], "")), 576, Gx_line+116, 629, Gx_line+133, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV133BarLocDis[8-1], "")), 713, Gx_line+116, 766, Gx_line+133, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV133BarLocDis[9-1], "")), 576, Gx_line+132, 629, Gx_line+149, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV133BarLocDis[10-1], "")), 713, Gx_line+132, 766, Gx_line+149, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV135Estampar, "")), 357, Gx_line+155, 483, Gx_line+173, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV134Colorido, "")), 357, Gx_line+117, 483, Gx_line+135, 2+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A834TipDefDsc, "")), 151, Gx_line+117, 340, Gx_line+135, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29IntDsc, "")), 332, Gx_line+214, 427, Gx_line+232, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4348DisUsrCod, "")), 375, Gx_line+4, 484, Gx_line+22, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Crea", ""), 339, Gx_line+4, 368, Gx_line+21, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1360ZonGeoNom, "")), 24, Gx_line+135, 213, Gx_line+153, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV136PrvDsc, "@!")), 24, Gx_line+155, 213, Gx_line+173, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "RECOGER :", ""), 24, Gx_line+254, 101, Gx_line+271, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A7523DisRec, "")), 151, Gx_line+253, 339, Gx_line+270, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "GENERACIÓN:", ""), 265, Gx_line+24, 360, Gx_line+41, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( A159BarFecGen, "99/99/99"), 375, Gx_line+24, 428, Gx_line+42, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV146AlbDetPie), "ZZZ9")), 224, Gx_line+292, 254, Gx_line+310, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV147AlbDetKgm, "ZZZZZ9.99")), 376, Gx_line+292, 443, Gx_line+310, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV148AlbDetMtr, "ZZZZZ9.99")), 582, Gx_line+292, 649, Gx_line+310, 2+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "TOTAL KILOS:", ""), 270, Gx_line+292, 360, Gx_line+309, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "TOTAL METROS:", ""), 458, Gx_line+292, 565, Gx_line+309, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "TOTAL CRUDO PIEZAS:", ""), 24, Gx_line+292, 174, Gx_line+309, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV151Fpdsc, "")), 151, Gx_line+78, 340, Gx_line+96, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "FORMA DE PAGO:", ""), 24, Gx_line+78, 143, Gx_line+95, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "PEDIDO CLIENTE:", ""), 24, Gx_line+97, 140, Gx_line+114, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 151, Gx_line+58, 196, Gx_line+76, 2+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "FECHA COMP PLN", ""), 24, Gx_line+42, 145, Gx_line+59, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( A4832BarAudFec, "99/99/99"), 152, Gx_line+42, 205, Gx_line+60, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "REMITO #:", ""), 504, Gx_line+155, 572, Gx_line+172, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV156Remitos, "")), 582, Gx_line+155, 708, Gx_line+173, 0+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+372) ;
         AV107BarTraP1 = ((0==A224BarTraP1) ? "" : GXutil.trim( GXutil.str( A224BarTraP1, 10, 0))) ;
         AV108BarTraP2 = ((0==A225BarTraP2) ? "" : GXutil.trim( GXutil.str( A225BarTraP2, 10, 0))) ;
         AV109BarTraP3 = ((0==A226BarTraP3) ? "" : GXutil.trim( GXutil.str( A226BarTraP3, 10, 0))) ;
         AV110BarUrdP1 = ((0==A232BarUrdP1) ? "" : GXutil.trim( GXutil.str( A232BarUrdP1, 10, 0))) ;
         AV111BarUrdP2 = ((0==A233BarUrdP2) ? "" : GXutil.trim( GXutil.str( A233BarUrdP2, 10, 0))) ;
         AV112BarUrdP3 = ((0==A234BarUrdP3) ? "" : GXutil.trim( GXutil.str( A234BarUrdP3, 10, 0))) ;
         AV113Porc[1-1] = ((GXutil.strcmp("", AV107BarTraP1)==0) ? "" : "%") ;
         AV113Porc[2-1] = ((GXutil.strcmp("", AV108BarTraP2)==0) ? "" : "%") ;
         AV113Porc[3-1] = ((GXutil.strcmp("", AV109BarTraP3)==0) ? "" : "%") ;
         AV113Porc[4-1] = ((GXutil.strcmp("", AV110BarUrdP1)==0) ? "" : "%") ;
         AV113Porc[5-1] = ((GXutil.strcmp("", AV111BarUrdP2)==0) ? "" : "%") ;
         AV113Porc[6-1] = ((GXutil.strcmp("", AV112BarUrdP3)==0) ? "" : "%") ;
         h7830( false, 19) ;
         getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A221BarTra1, "")), 19, Gx_line+0, 74, Gx_line+18, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A222BarTra2, "")), 135, Gx_line+0, 190, Gx_line+18, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A223BarTra3, "")), 251, Gx_line+0, 306, Gx_line+18, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A229BarUrd1, "")), 368, Gx_line+0, 423, Gx_line+18, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A230BarUrd2, "")), 497, Gx_line+0, 552, Gx_line+18, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A231BarUrd3, "")), 627, Gx_line+0, 682, Gx_line+18, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV107BarTraP1, "")), 67, Gx_line+0, 109, Gx_line+18, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV108BarTraP2, "")), 183, Gx_line+0, 225, Gx_line+18, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV109BarTraP3, "")), 299, Gx_line+0, 341, Gx_line+18, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV110BarUrdP1, "")), 429, Gx_line+0, 471, Gx_line+18, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV111BarUrdP2, "")), 558, Gx_line+0, 600, Gx_line+18, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV112BarUrdP3, "")), 689, Gx_line+0, 731, Gx_line+18, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV113Porc[1-1], "")), 115, Gx_line+0, 130, Gx_line+18, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV113Porc[2-1], "")), 231, Gx_line+0, 246, Gx_line+18, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV113Porc[3-1], "")), 347, Gx_line+0, 362, Gx_line+18, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV113Porc[4-1], "")), 477, Gx_line+0, 492, Gx_line+18, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV113Porc[5-1], "")), 606, Gx_line+0, 621, Gx_line+18, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV113Porc[6-1], "")), 733, Gx_line+0, 748, Gx_line+18, 0+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+19) ;
         h7830( false, 29) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 24, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV86Hdr, "")), 277, Gx_line+0, 453, Gx_line+40, 0+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+29) ;
         if ( GXutil.strcmp(A2010BarTipDis, httpContext.getMessage( "S", "")) == 0 )
         {
            h7830( false, 23) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "DIBUJO", ""), 85, Gx_line+1, 134, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "PINTA", ""), 198, Gx_line+1, 237, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "PIEZAS", ""), 418, Gx_line+1, 467, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "METROS", ""), 482, Gx_line+1, 540, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(11, Gx_line+17, 779, Gx_line+17, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "FONDO", ""), 314, Gx_line+1, 363, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "UBICACION", ""), 568, Gx_line+0, 642, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "ANCHO", ""), 663, Gx_line+0, 712, Gx_line+17, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+23) ;
            AV140SerEst = A212BarSer ;
            AV172GXLvl124 = (byte)(0) ;
            /* Using cursor P07835 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A1056DisComCod = P07835_A1056DisComCod[0] ;
               A1032FonCod = P07835_A1032FonCod[0] ;
               A2524DisComLin = P07835_A2524DisComLin[0] ;
               A1543BarComPie = P07835_A1543BarComPie[0] ;
               n1543BarComPie = P07835_n1543BarComPie[0] ;
               A1541BarComMtr = P07835_A1541BarComMtr[0] ;
               n1541BarComMtr = P07835_n1541BarComMtr[0] ;
               A7734BarComObs = P07835_A7734BarComObs[0] ;
               n7734BarComObs = P07835_n7734BarComObs[0] ;
               AV172GXLvl124 = (byte)(1) ;
               AV138DisComCod = A1056DisComCod ;
               AV139FonCod = A1032FonCod ;
               h7830( false, 18) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A1541BarComMtr, "ZZZZZ9.99")), 474, Gx_line+1, 541, Gx_line+19, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1543BarComPie), "ZZZ9")), 436, Gx_line+1, 466, Gx_line+19, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1056DisComCod, "")), 198, Gx_line+1, 311, Gx_line+18, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2524DisComLin), "Z9")), 54, Gx_line+1, 70, Gx_line+19, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1032FonCod, "")), 314, Gx_line+1, 427, Gx_line+18, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1798BarDibCli, "")), 77, Gx_line+1, 190, Gx_line+18, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1605DibLocal, "")), 547, Gx_line+1, 642, Gx_line+19, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1607DibMed, "")), 648, Gx_line+1, 712, Gx_line+19, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+18) ;
               if ( GXutil.strcmp(A7734BarComObs, "") != 0 )
               {
                  h7830( false, 22) ;
                  getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Obs:", ""), 74, Gx_line+2, 104, Gx_line+19, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A7734BarComObs, "")), 119, Gx_line+2, 558, Gx_line+20, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+22) ;
               }
               pr_default.readNext(2);
            }
            pr_default.close(2);
            if ( AV172GXLvl124 == 0 )
            {
               h7830( false, 18) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1798BarDibCli, "")), 94, Gx_line+0, 207, Gx_line+17, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Sin Pintas", ""), 215, Gx_line+0, 279, Gx_line+17, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+18) ;
            }
            h7830( false, 23) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "MOLDE", ""), 35, Gx_line+1, 84, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "UBICACION", ""), 469, Gx_line+1, 543, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "ANCHO", ""), 558, Gx_line+1, 607, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(11, Gx_line+17, 779, Gx_line+17, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "SHABLON", ""), 388, Gx_line+1, 454, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "MALLA", ""), 636, Gx_line+1, 682, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "% COB.", ""), 290, Gx_line+1, 341, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "GALGA", ""), 710, Gx_line+1, 758, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "ACT", ""), 351, Gx_line+1, 378, Gx_line+18, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+23) ;
            /* Using cursor P07836 */
            pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt)});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A7507DibOrgLin = P07836_A7507DibOrgLin[0] ;
               n7507DibOrgLin = P07836_n7507DibOrgLin[0] ;
               A7505DibOrgInt = P07836_A7505DibOrgInt[0] ;
               n7505DibOrgInt = P07836_n7505DibOrgInt[0] ;
               A7506DibOrgCli = P07836_A7506DibOrgCli[0] ;
               n7506DibOrgCli = P07836_n7506DibOrgCli[0] ;
               A1809DibOrdMol = P07836_A1809DibOrdMol[0] ;
               n1809DibOrdMol = P07836_n1809DibOrdMol[0] ;
               A6839DibMolCod = P07836_A6839DibMolCod[0] ;
               n6839DibMolCod = P07836_n6839DibMolCod[0] ;
               A2092DibRelMC2 = P07836_A2092DibRelMC2[0] ;
               n2092DibRelMC2 = P07836_n2092DibRelMC2[0] ;
               A5381DibPrcCobM = P07836_A5381DibPrcCobM[0] ;
               n5381DibPrcCobM = P07836_n5381DibPrcCobM[0] ;
               A1029DibLin = P07836_A1029DibLin[0] ;
               if ( GXutil.strcmp(A1823DibTipMaq, httpContext.getMessage( "P", "")) == 0 )
               {
                  /* Using cursor P07837 */
                  pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), AV140SerEst, Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt), AV138DisComCod, AV139FonCod, Boolean.valueOf(n1809DibOrdMol), Byte.valueOf(A1809DibOrdMol)});
                  while ( (pr_default.getStatus(4) != 101) )
                  {
                     A2098MolCod = P07837_A2098MolCod[0] ;
                     A2074ColCom = P07837_A2074ColCom[0] ;
                     A2141SerEst = P07837_A2141SerEst[0] ;
                     A2078ColFon = P07837_A2078ColFon[0] ;
                     A2648MolForEst = P07837_A2648MolForEst[0] ;
                     n2648MolForEst = P07837_n2648MolForEst[0] ;
                     AV141MolForEst = A2648MolForEst ;
                     /* Using cursor P07838 */
                     pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A2141SerEst, Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Byte.valueOf(A2098MolCod)});
                     while ( (pr_default.getStatus(5) != 101) )
                     {
                        A2107PasCod = P07838_A2107PasCod[0] ;
                        n2107PasCod = P07838_n2107PasCod[0] ;
                        A2654PasForLin = P07838_A2654PasForLin[0] ;
                        if ( new app.core.ascan(remoteHandle, context).executeUdp( AV142PasDsc, A2107PasCod) == 0 )
                        {
                           Cond_result = true ;
                        }
                        else
                        {
                           Cond_result = false ;
                        }
                        if ( Cond_result )
                        {
                           AV143TotPas = (long)(AV143TotPas+1) ;
                           AV142PasDsc[(int)(AV143TotPas)-1] = A2107PasCod ;
                        }
                        pr_default.readNext(5);
                     }
                     pr_default.close(5);
                     /* Exiting from a For First loop. */
                     if (true) break;
                  }
                  pr_default.close(4);
                  h7830( false, 18) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1809DibOrdMol), "Z9")), 19, Gx_line+0, 35, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A5381DibPrcCobM, "ZZ9.99")), 290, Gx_line+0, 335, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2092DibRelMC2, "")), 35, Gx_line+0, 148, Gx_line+17, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV141MolForEst, "")), 359, Gx_line+0, 374, Gx_line+18, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+18) ;
                  /* Noskip command */
                  Gx_line = Gx_OldLine ;
                  AV176GXLvl163 = (byte)(0) ;
                  /* Using cursor P07839 */
                  pr_default.execute(6, new Object[] {A396EmprCod});
                  while ( (pr_default.getStatus(6) != 101) )
                  {
                     A7036ShaGrb = P07839_A7036ShaGrb[0] ;
                     n7036ShaGrb = P07839_n7036ShaGrb[0] ;
                     A7043ShaOrd = P07839_A7043ShaOrd[0] ;
                     n7043ShaOrd = P07839_n7043ShaOrd[0] ;
                     A7042ShaDibInt = P07839_A7042ShaDibInt[0] ;
                     A7041ShaDibCli = P07839_A7041ShaDibCli[0] ;
                     A7031ShaCod = P07839_A7031ShaCod[0] ;
                     A7034ShaGal = P07839_A7034ShaGal[0] ;
                     n7034ShaGal = P07839_n7034ShaGal[0] ;
                     A7035ShaUbi = P07839_A7035ShaUbi[0] ;
                     n7035ShaUbi = P07839_n7035ShaUbi[0] ;
                     A7033ShaAnc = P07839_A7033ShaAnc[0] ;
                     n7033ShaAnc = P07839_n7033ShaAnc[0] ;
                     A7032ShaMal = P07839_A7032ShaMal[0] ;
                     n7032ShaMal = P07839_n7032ShaMal[0] ;
                     if ( ( ( GXutil.strcmp(A7041ShaDibCli, A1013DibCli) == 0 ) && ! GXutil.like( A1013DibCli , GXutil.padr( httpContext.getMessage( "_MX%", "") , 254 , "%"),  ' ' ) ) || ( ( GXutil.strcmp(A7041ShaDibCli, A7506DibOrgCli) == 0 ) && GXutil.like( A1013DibCli , GXutil.padr( httpContext.getMessage( "_MX%", "") , 254 , "%"),  ' ' ) ) )
                     {
                        if ( ( ( A7042ShaDibInt == A1014DibInt ) && ! GXutil.like( A1013DibCli , GXutil.padr( httpContext.getMessage( "_MX%", "") , 254 , "%"),  ' ' ) ) || ( ( A7042ShaDibInt == A7505DibOrgInt ) && GXutil.like( A1013DibCli , GXutil.padr( httpContext.getMessage( "_MX%", "") , 254 , "%"),  ' ' ) ) )
                        {
                           if ( ( ( A7043ShaOrd == A1809DibOrdMol ) && ! GXutil.like( A1013DibCli , GXutil.padr( httpContext.getMessage( "_MX%", "") , 254 , "%"),  ' ' ) ) || ( ( A7043ShaOrd == A7507DibOrgLin ) && GXutil.like( A1013DibCli , GXutil.padr( httpContext.getMessage( "_MX%", "") , 254 , "%"),  ' ' ) ) )
                           {
                              if ( GXutil.strcmp(A7036ShaGrb, httpContext.getMessage( "S", "")) == 0 )
                              {
                                 AV176GXLvl163 = (byte)(1) ;
                                 h7830( false, 18) ;
                                 getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A7032ShaMal, "")), 636, Gx_line+1, 700, Gx_line+19, 0+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A7033ShaAnc, "")), 558, Gx_line+1, 622, Gx_line+19, 0+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A7035ShaUbi, "")), 469, Gx_line+1, 533, Gx_line+19, 0+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A7032ShaMal, "")), 710, Gx_line+1, 774, Gx_line+19, 0+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A7034ShaGal, "")), 710, Gx_line+1, 774, Gx_line+19, 0+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A7031ShaCod, "")), 388, Gx_line+1, 452, Gx_line+19, 0+256, 0, 0, 0) ;
                                 Gx_OldLine = Gx_line ;
                                 Gx_line = (int)(Gx_line+18) ;
                              }
                           }
                        }
                     }
                     pr_default.readNext(6);
                  }
                  pr_default.close(6);
                  if ( AV176GXLvl163 == 0 )
                  {
                     h7830( false, 18) ;
                     getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "NO SE ENCONTRO SHABLON", ""), 395, Gx_line+0, 587, Gx_line+17, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+18) ;
                  }
               }
               pr_default.readNext(3);
            }
            pr_default.close(3);
            /* Using cursor P078310 */
            pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt)});
            while ( (pr_default.getStatus(7) != 101) )
            {
               A10510DibOrgLi = P078310_A10510DibOrgLi[0] ;
               n10510DibOrgLi = P078310_n10510DibOrgLi[0] ;
               A10508DibOrgIn = P078310_A10508DibOrgIn[0] ;
               n10508DibOrgIn = P078310_n10508DibOrgIn[0] ;
               A10509DibOrgCl = P078310_A10509DibOrgCl[0] ;
               n10509DibOrgCl = P078310_n10509DibOrgCl[0] ;
               A1808DibOrdCil = P078310_A1808DibOrdCil[0] ;
               n1808DibOrdCil = P078310_n1808DibOrdCil[0] ;
               A1030DibRelMC = P078310_A1030DibRelMC[0] ;
               n1030DibRelMC = P078310_n1030DibRelMC[0] ;
               A4860DibPrcCob = P078310_A4860DibPrcCob[0] ;
               n4860DibPrcCob = P078310_n4860DibPrcCob[0] ;
               A1807DibLinCil = P078310_A1807DibLinCil[0] ;
               if ( GXutil.strcmp(A1823DibTipMaq, httpContext.getMessage( "R", "")) == 0 )
               {
                  /* Using cursor P078311 */
                  pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), AV140SerEst, Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt), AV138DisComCod, AV139FonCod, Boolean.valueOf(n1808DibOrdCil), Byte.valueOf(A1808DibOrdCil)});
                  while ( (pr_default.getStatus(8) != 101) )
                  {
                     A2098MolCod = P078311_A2098MolCod[0] ;
                     A2074ColCom = P078311_A2074ColCom[0] ;
                     A2141SerEst = P078311_A2141SerEst[0] ;
                     A2078ColFon = P078311_A2078ColFon[0] ;
                     A2648MolForEst = P078311_A2648MolForEst[0] ;
                     n2648MolForEst = P078311_n2648MolForEst[0] ;
                     AV141MolForEst = A2648MolForEst ;
                     /* Using cursor P078312 */
                     pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A2141SerEst, Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Byte.valueOf(A2098MolCod)});
                     while ( (pr_default.getStatus(9) != 101) )
                     {
                        A2107PasCod = P078312_A2107PasCod[0] ;
                        n2107PasCod = P078312_n2107PasCod[0] ;
                        A2654PasForLin = P078312_A2654PasForLin[0] ;
                        if ( new app.core.ascan(remoteHandle, context).executeUdp( AV142PasDsc, A2107PasCod) == 0 )
                        {
                           Cond_result = true ;
                        }
                        else
                        {
                           Cond_result = false ;
                        }
                        if ( Cond_result )
                        {
                           AV143TotPas = (long)(AV143TotPas+1) ;
                           AV142PasDsc[(int)(AV143TotPas)-1] = A2107PasCod ;
                        }
                        pr_default.readNext(9);
                     }
                     pr_default.close(9);
                     /* Exit For each command. Update data (if necessary), close cursors & exit. */
                     if (true) break;
                     /* Exiting from a For First loop. */
                     if (true) break;
                  }
                  pr_default.close(8);
                  h7830( false, 18) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1808DibOrdCil), "Z9")), 19, Gx_line+1, 35, Gx_line+19, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A4860DibPrcCob, "ZZ9.99")), 290, Gx_line+1, 335, Gx_line+19, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1030DibRelMC, "")), 35, Gx_line+1, 148, Gx_line+18, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV141MolForEst, "")), 358, Gx_line+1, 373, Gx_line+19, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+18) ;
                  /* Noskip command */
                  Gx_line = Gx_OldLine ;
                  AV180GXLvl196 = (byte)(0) ;
                  /* Using cursor P078313 */
                  pr_default.execute(10, new Object[] {A396EmprCod});
                  while ( (pr_default.getStatus(10) != 101) )
                  {
                     A7036ShaGrb = P078313_A7036ShaGrb[0] ;
                     n7036ShaGrb = P078313_n7036ShaGrb[0] ;
                     A7043ShaOrd = P078313_A7043ShaOrd[0] ;
                     n7043ShaOrd = P078313_n7043ShaOrd[0] ;
                     A7042ShaDibInt = P078313_A7042ShaDibInt[0] ;
                     A7041ShaDibCli = P078313_A7041ShaDibCli[0] ;
                     A7031ShaCod = P078313_A7031ShaCod[0] ;
                     A7034ShaGal = P078313_A7034ShaGal[0] ;
                     n7034ShaGal = P078313_n7034ShaGal[0] ;
                     A7035ShaUbi = P078313_A7035ShaUbi[0] ;
                     n7035ShaUbi = P078313_n7035ShaUbi[0] ;
                     A7033ShaAnc = P078313_A7033ShaAnc[0] ;
                     n7033ShaAnc = P078313_n7033ShaAnc[0] ;
                     A7032ShaMal = P078313_A7032ShaMal[0] ;
                     n7032ShaMal = P078313_n7032ShaMal[0] ;
                     if ( ( ( GXutil.strcmp(A7041ShaDibCli, A1013DibCli) == 0 ) && ! GXutil.like( A1013DibCli , GXutil.padr( httpContext.getMessage( "_MX%", "") , 254 , "%"),  ' ' ) ) || ( ( GXutil.strcmp(A7041ShaDibCli, A10509DibOrgCl) == 0 ) && GXutil.like( A1013DibCli , GXutil.padr( httpContext.getMessage( "_MX%", "") , 254 , "%"),  ' ' ) ) )
                     {
                        if ( ( ( A7042ShaDibInt == A1014DibInt ) && ! GXutil.like( A1013DibCli , GXutil.padr( httpContext.getMessage( "_MX%", "") , 254 , "%"),  ' ' ) ) || ( ( A7042ShaDibInt == A10508DibOrgIn ) && GXutil.like( A1013DibCli , GXutil.padr( httpContext.getMessage( "_MX%", "") , 254 , "%"),  ' ' ) ) )
                        {
                           if ( ( ( A7043ShaOrd == A1808DibOrdCil ) && ! GXutil.like( A1013DibCli , GXutil.padr( httpContext.getMessage( "_MX%", "") , 254 , "%"),  ' ' ) ) || ( ( A7043ShaOrd == A10510DibOrgLi ) && GXutil.like( A1013DibCli , GXutil.padr( httpContext.getMessage( "_MX%", "") , 254 , "%"),  ' ' ) ) )
                           {
                              if ( GXutil.strcmp(A7036ShaGrb, httpContext.getMessage( "S", "")) == 0 )
                              {
                                 AV180GXLvl196 = (byte)(1) ;
                                 h7830( false, 18) ;
                                 getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A7032ShaMal, "")), 636, Gx_line+1, 700, Gx_line+19, 0+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A7033ShaAnc, "")), 558, Gx_line+1, 622, Gx_line+19, 0+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A7035ShaUbi, "")), 469, Gx_line+1, 533, Gx_line+19, 0+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A7034ShaGal, "")), 710, Gx_line+0, 774, Gx_line+18, 0+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A7031ShaCod, "")), 388, Gx_line+0, 452, Gx_line+18, 0+256, 0, 0, 0) ;
                                 Gx_OldLine = Gx_line ;
                                 Gx_line = (int)(Gx_line+18) ;
                              }
                           }
                        }
                     }
                     pr_default.readNext(10);
                  }
                  pr_default.close(10);
                  if ( AV180GXLvl196 == 0 )
                  {
                     h7830( false, 18) ;
                     getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "NO SE ENCONTRO SHABLON", ""), 395, Gx_line+0, 587, Gx_line+17, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+18) ;
                  }
               }
               pr_default.readNext(7);
            }
            pr_default.close(7);
            AV144k = 0 ;
            AV145PasDsc1 = "" ;
            while ( AV144k < AV143TotPas )
            {
               AV144k = (long)(AV144k+1) ;
               AV145PasDsc1 += ((AV144k==1) ? "" : ", ") ;
               AV145PasDsc1 += GXutil.trim( AV142PasDsc[(int)(AV144k)-1]) ;
            }
            h7830( false, 18) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Pastas :", ""), 27, Gx_line+1, 79, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV145PasDsc1, "")), 99, Gx_line+1, 765, Gx_line+18, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+18) ;
         }
         else
         {
            h7830( false, 18) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A135BarColNom, "")), 99, Gx_line+0, 181, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1234BarNomCli, "")), 207, Gx_line+0, 289, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "COLOR :", ""), 27, Gx_line+0, 83, Gx_line+17, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+18) ;
         }
         h7830( false, 24) ;
         getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "ARTICULO", ""), 19, Gx_line+0, 86, Gx_line+17, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawLine(11, Gx_line+17, 779, Gx_line+17, 1, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+24) ;
         AV69i = (byte)(1) ;
         while ( ( GXutil.strcmp(AV93Obstxt[AV69i-1], "") != 0 ) || ( GXutil.strcmp(AV93Obstxt[AV69i+1-1], "") != 0 ) )
         {
            h7830( false, 18) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV93Obstxt[AV69i-1], "")), 18, Gx_line+0, 394, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV93Obstxt[AV69i+1-1], "")), 396, Gx_line+0, 772, Gx_line+18, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+18) ;
            AV69i = (byte)(AV69i+2) ;
         }
         h7830( false, 20) ;
         getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "OPERACIONES", ""), 19, Gx_line+0, 119, Gx_line+17, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawLine(11, Gx_line+17, 779, Gx_line+17, 1, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV181Saveline = Gx_line ;
         AV183Savepage = Gx_page ;
         /* Using cursor P078314 */
         pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(11) != 101) )
         {
            A758ProCod = P078314_A758ProCod[0] ;
            A759ProDsc = P078314_A759ProDsc[0] ;
            A759ProDsc = P078314_A759ProDsc[0] ;
            h7830( false, 22) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A758ProCod, "")), 93, Gx_line+0, 194, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Proceso", ""), 19, Gx_line+0, 70, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A759ProDsc, "")), 218, Gx_line+0, 393, Gx_line+17, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+22) ;
            /* Using cursor P078315 */
            pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod});
            while ( (pr_default.getStatus(12) != 101) )
            {
               A7744FasPreObl = P078315_A7744FasPreObl[0] ;
               n7744FasPreObl = P078315_n7744FasPreObl[0] ;
               A361DisCod = P078315_A361DisCod[0] ;
               A603MaqCodBis = P078315_A603MaqCodBis[0] ;
               A457FasCod = P078315_A457FasCod[0] ;
               A460FasDsc = P078315_A460FasDsc[0] ;
               A194BarOrdLin = P078315_A194BarOrdLin[0] ;
               A7744FasPreObl = P078315_A7744FasPreObl[0] ;
               n7744FasPreObl = P078315_n7744FasPreObl[0] ;
               A460FasDsc = P078315_A460FasDsc[0] ;
               A361DisCod = P078315_A361DisCod[0] ;
               AV32MaqCod = A603MaqCodBis ;
               /* Execute user subroutine: 'MAQUIN' */
               S1914 ();
               if ( returnInSub )
               {
                  pr_default.close(12);
                  pr_default.close(12);
                  pr_default.close(12);
                  pr_default.close(11);
                  pr_default.close(11);
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  getPrinter().GxEndPage() ;
                  /* Close printer file */
                  getPrinter().GxEndDocument() ;
                  endPrinter();
                  returnInSub = true;
                  if (true) return;
               }
               h7830( false, 17) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A460FasDsc, "")), 132, Gx_line+0, 308, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A603MaqCodBis, "")), 311, Gx_line+0, 393, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A457FasCod, "@!")), 18, Gx_line+0, 127, Gx_line+18, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               AV118ProCod = A758ProCod ;
               AV117FasCod = A457FasCod ;
               /* Execute user subroutine: 'PARAMETROS' */
               S2014 ();
               if ( returnInSub )
               {
                  pr_default.close(12);
                  pr_default.close(12);
                  pr_default.close(12);
                  pr_default.close(11);
                  pr_default.close(11);
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  getPrinter().GxEndPage() ;
                  /* Close printer file */
                  getPrinter().GxEndDocument() ;
                  endPrinter();
                  returnInSub = true;
                  if (true) return;
               }
               /* Using cursor P078316 */
               pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Boolean.valueOf(n7744FasPreObl), Byte.valueOf(A7744FasPreObl), A457FasCod});
               while ( (pr_default.getStatus(13) != 101) )
               {
                  A368DisFasLin = P078316_A368DisFasLin[0] ;
                  A457FasCod = P078316_A457FasCod[0] ;
                  /* Using cursor P078317 */
                  pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
                  while ( (pr_default.getStatus(14) != 101) )
                  {
                     A7727ArtAdiCod = P078317_A7727ArtAdiCod[0] ;
                     A7728ArtAdiDsc = P078317_A7728ArtAdiDsc[0] ;
                     n7728ArtAdiDsc = P078317_n7728ArtAdiDsc[0] ;
                     A7728ArtAdiDsc = P078317_A7728ArtAdiDsc[0] ;
                     n7728ArtAdiDsc = P078317_n7728ArtAdiDsc[0] ;
                     h7830( false, 18) ;
                     getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A7728ArtAdiDsc, "")), 132, Gx_line+0, 321, Gx_line+18, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+18) ;
                     pr_default.readNext(14);
                  }
                  pr_default.close(14);
                  pr_default.readNext(13);
               }
               pr_default.close(13);
               pr_default.readNext(12);
            }
            pr_default.close(12);
            pr_default.readNext(11);
         }
         pr_default.close(11);
         AV189Saveline2 = Gx_line ;
         AV190Savepage2 = Gx_page ;
         Gx_line = AV181Saveline ;
         Gx_page = AV183Savepage ;
         h7830( false, 18) ;
         getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Facturación", ""), 476, Gx_line+0, 548, Gx_line+17, 0+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+18) ;
         /* Using cursor P078318 */
         pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         while ( (pr_default.getStatus(15) != 101) )
         {
            A368DisFasLin = P078318_A368DisFasLin[0] ;
            A758ProCod = P078318_A758ProCod[0] ;
            A7740DisFasPre = P078318_A7740DisFasPre[0] ;
            n7740DisFasPre = P078318_n7740DisFasPre[0] ;
            A457FasCod = P078318_A457FasCod[0] ;
            AV192GXLvl254 = (byte)(0) ;
            /* Using cursor P078319 */
            pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
            while ( (pr_default.getStatus(16) != 101) )
            {
               A7736ArtAdiPre = P078319_A7736ArtAdiPre[0] ;
               n7736ArtAdiPre = P078319_n7736ArtAdiPre[0] ;
               A7727ArtAdiCod = P078319_A7727ArtAdiCod[0] ;
               AV192GXLvl254 = (byte)(1) ;
               AV193Ok = (byte)(1) ;
               pr_default.readNext(16);
            }
            pr_default.close(16);
            if ( AV192GXLvl254 == 0 )
            {
               AV193Ok = (byte)(0) ;
            }
            if ( ( A7740DisFasPre.doubleValue() > 0 ) || ( AV193Ok == 1 ) )
            {
               h7830( false, 18) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A457FasCod, "@!")), 439, Gx_line+0, 548, Gx_line+18, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+18) ;
               /* Noskip command */
               Gx_line = Gx_OldLine ;
               AV194GXLvl263 = (byte)(0) ;
               /* Using cursor P078320 */
               pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
               while ( (pr_default.getStatus(17) != 101) )
               {
                  A7727ArtAdiCod = P078320_A7727ArtAdiCod[0] ;
                  A7736ArtAdiPre = P078320_A7736ArtAdiPre[0] ;
                  n7736ArtAdiPre = P078320_n7736ArtAdiPre[0] ;
                  A7728ArtAdiDsc = P078320_A7728ArtAdiDsc[0] ;
                  n7728ArtAdiDsc = P078320_n7728ArtAdiDsc[0] ;
                  A7728ArtAdiDsc = P078320_A7728ArtAdiDsc[0] ;
                  n7728ArtAdiDsc = P078320_n7728ArtAdiDsc[0] ;
                  AV194GXLvl263 = (byte)(1) ;
                  h7830( false, 18) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A7728ArtAdiDsc, "")), 592, Gx_line+0, 781, Gx_line+18, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+18) ;
                  pr_default.readNext(17);
               }
               pr_default.close(17);
               if ( AV194GXLvl263 == 0 )
               {
                  h7830( false, 18) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+18) ;
               }
            }
            pr_default.readNext(15);
         }
         pr_default.close(15);
         if ( Gx_page < AV190Savepage2 )
         {
            Gx_page = AV190Savepage2 ;
            Gx_line = AV189Saveline2 ;
         }
         else
         {
            if ( Gx_page == AV190Savepage2 )
            {
               if ( Gx_line < AV189Saveline2 )
               {
                  Gx_line = AV189Saveline2 ;
               }
            }
         }
         /* Execute user subroutine: 'OBSERV' */
         S212 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            if (true) return;
         }
         /* Execute user subroutine: 'OBS_ALBREC' */
         S222 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            if (true) return;
         }
         /* Execute user subroutine: 'PIEZAS' */
         S232 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            if (true) return;
         }
         AV165BarDibCli = A1798BarDibCli ;
         AV166BarDibInt = A1799BarDibInt ;
         /* Execute user subroutine: 'CILMOL' */
         S242 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            if (true) return;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
   }

   public void S242( ) throws ProcessInterruptedException
   {
      /* 'CILMOL' Routine */
      returnInSub = false ;
      AV164InicioCilMod = (byte)(0) ;
      /* Using cursor P078321 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(AV127BarCod), Byte.valueOf(AV128BarCodReo), AV129BarCodPar});
      while ( (pr_default.getStatus(18) != 101) )
      {
         A130BarCodPar = P078321_A130BarCodPar[0] ;
         A132BarCodReo = P078321_A132BarCodReo[0] ;
         A129BarCod = P078321_A129BarCod[0] ;
         A5104RecMolTotK = P078321_A5104RecMolTotK[0] ;
         n5104RecMolTotK = P078321_n5104RecMolTotK[0] ;
         A2122RecEstTMaq = P078321_A2122RecEstTMaq[0] ;
         n2122RecEstTMaq = P078321_n2122RecEstTMaq[0] ;
         A9535RecMolCodC = P078321_A9535RecMolCodC[0] ;
         n9535RecMolCodC = P078321_n9535RecMolCodC[0] ;
         A2124RecMolCod = P078321_A2124RecMolCod[0] ;
         A1032FonCod = P078321_A1032FonCod[0] ;
         A1056DisComCod = P078321_A1056DisComCod[0] ;
         A2524DisComLin = P078321_A2524DisComLin[0] ;
         A2122RecEstTMaq = P078321_A2122RecEstTMaq[0] ;
         n2122RecEstTMaq = P078321_n2122RecEstTMaq[0] ;
         if ( GXutil.strcmp(A2122RecEstTMaq, httpContext.getMessage( "R", "")) == 0 )
         {
            GXt_decimal8 = AV163MolPrcCob ;
            GXv_decimal9[0] = GXt_decimal8 ;
            new app.core.pporcob(remoteHandle, context).execute( A396EmprCod, AV165BarDibCli, AV36CliCod, AV166BarDibInt, A2124RecMolCod, GXv_decimal9) ;
            rhdrart1.this.GXt_decimal8 = GXv_decimal9[0] ;
            AV163MolPrcCob = GXt_decimal8 ;
         }
         else
         {
            GXt_decimal8 = AV163MolPrcCob ;
            GXv_decimal9[0] = GXt_decimal8 ;
            new app.core.pporcobp(remoteHandle, context).execute( A396EmprCod, AV165BarDibCli, AV36CliCod, AV166BarDibInt, A2124RecMolCod, GXv_decimal9) ;
            rhdrart1.this.GXt_decimal8 = GXv_decimal9[0] ;
            AV163MolPrcCob = GXt_decimal8 ;
         }
         GXv_char6[0] = A396EmprCod ;
         GXv_int7[0] = 1 ;
         GXv_char4[0] = A9535RecMolCodC ;
         GXv_char10[0] = AV161EstColDsc ;
         GXv_int11[0] = AV162EstColRGB ;
         new app.pestcoldsc(remoteHandle, context).execute( GXv_char6, GXv_int7, GXv_char4, GXv_char10, GXv_int11) ;
         rhdrart1.this.A396EmprCod = GXv_char6[0] ;
         rhdrart1.this.A9535RecMolCodC = GXv_char4[0] ;
         rhdrart1.this.AV161EstColDsc = GXv_char10[0] ;
         rhdrart1.this.AV162EstColRGB = GXv_int11[0] ;
         if ( AV164InicioCilMod == 0 )
         {
            h7830( false, 40) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cilindro", ""), 25, Gx_line+17, 71, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cobertura (%)", ""), 171, Gx_line+17, 255, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Color", ""), 299, Gx_line+17, 331, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 441, Gx_line+17, 513, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(25, Gx_line+34, 70, Gx_line+34, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(171, Gx_line+34, 254, Gx_line+34, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(300, Gx_line+34, 425, Gx_line+34, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(440, Gx_line+34, 628, Gx_line+34, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(11, Gx_line+4, 779, Gx_line+4, 2, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+40) ;
            AV164InicioCilMod = (byte)(1) ;
         }
         h7830( false, 18) ;
         getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2124RecMolCod), "Z9")), 27, Gx_line+1, 43, Gx_line+19, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV163MolPrcCob, "Z9.99")), 171, Gx_line+0, 208, Gx_line+18, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9535RecMolCodC, "")), 298, Gx_line+0, 424, Gx_line+18, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV161EstColDsc, "")), 438, Gx_line+0, 627, Gx_line+18, 0+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+18) ;
         pr_default.readNext(18);
      }
      pr_default.close(18);
   }

   public void S212( ) throws ProcessInterruptedException
   {
      /* 'OBSERV' Routine */
      returnInSub = false ;
      /* Using cursor P078322 */
      pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(AV127BarCod), Byte.valueOf(AV128BarCodReo), AV129BarCodPar});
      while ( (pr_default.getStatus(19) != 101) )
      {
         A361DisCod = P078322_A361DisCod[0] ;
         A130BarCodPar = P078322_A130BarCodPar[0] ;
         A132BarCodReo = P078322_A132BarCodReo[0] ;
         A129BarCod = P078322_A129BarCod[0] ;
         h7830( false, 18) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+18) ;
         AV90FlagObs = (byte)(0) ;
         /* Using cursor P078323 */
         pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         while ( (pr_default.getStatus(20) != 101) )
         {
            brk78322 = false ;
            A377DisObsTxt = P078323_A377DisObsTxt[0] ;
            A376DisObsLin = P078323_A376DisObsLin[0] ;
            h7830( false, 73) ;
            getPrinter().GxDrawRect(11, Gx_line+4, 779, Gx_line+70, 1, 0, 0, 0, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 14, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "OBSERVACIONES IMPORTANTES", ""), 233, Gx_line+8, 558, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "La omisión en cumplimiento de las observaciones indicadas en la HDR se considera una falta grave", ""), 102, Gx_line+35, 701, Gx_line+52, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "la cual podrá dar inicio a procedimiento disciplinario. Seamos disciplinados y evitemos llegar a esta instancia.", ""), 71, Gx_line+51, 732, Gx_line+68, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(11, Gx_line+69, 11, Gx_line+73, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(778, Gx_line+69, 778, Gx_line+73, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+73) ;
            while ( (pr_default.getStatus(20) != 101) && ( GXutil.strcmp(P078323_A396EmprCod[0], A396EmprCod) == 0 ) && ( P078323_A361DisCod[0] == A361DisCod ) )
            {
               brk78322 = false ;
               A377DisObsTxt = P078323_A377DisObsTxt[0] ;
               A376DisObsLin = P078323_A376DisObsLin[0] ;
               if ( ! (GXutil.strcmp("", A377DisObsTxt)==0) )
               {
                  h7830( false, 18) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A377DisObsTxt, "")), 28, Gx_line+1, 404, Gx_line+19, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(11, Gx_line+0, 11, Gx_line+18, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(778, Gx_line+0, 778, Gx_line+18, 1, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+18) ;
               }
               brk78322 = true ;
               pr_default.readNext(20);
            }
            if ( ! brk78322 )
            {
               brk78322 = true ;
               pr_default.readNext(20);
            }
         }
         pr_default.close(20);
         if ( AV90FlagObs == 1 )
         {
            h7830( false, 11) ;
            getPrinter().GxDrawLine(11, Gx_line+0, 11, Gx_line+9, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(11, Gx_line+9, 779, Gx_line+9, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(778, Gx_line+0, 778, Gx_line+9, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+11) ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(19);
   }

   public void S232( ) throws ProcessInterruptedException
   {
      /* 'PIEZAS' Routine */
      returnInSub = false ;
      /* Using cursor P078324 */
      pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(AV127BarCod), Byte.valueOf(AV128BarCodReo), AV129BarCodPar});
      while ( (pr_default.getStatus(21) != 101) )
      {
         A365DisDes = P078324_A365DisDes[0] ;
         A125BarAncAca1 = P078324_A125BarAncAca1[0] ;
         A130BarCodPar = P078324_A130BarCodPar[0] ;
         A132BarCodReo = P078324_A132BarCodReo[0] ;
         A129BarCod = P078324_A129BarCod[0] ;
         if ( AV155detalle == 0 )
         {
            h7830( false, 50) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "RDTO.", ""), 571, Gx_line+17, 613, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "RDTO.", ""), 189, Gx_line+17, 231, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "N.", ""), 21, Gx_line+17, 36, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "OBS", ""), 274, Gx_line+17, 304, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "ANC", ""), 55, Gx_line+17, 84, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "KGS.", ""), 102, Gx_line+17, 136, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "MTS.", ""), 146, Gx_line+17, 179, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "N.", ""), 407, Gx_line+17, 422, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(11, Gx_line+8, 779, Gx_line+41, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(43, Gx_line+8, 43, Gx_line+50, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(91, Gx_line+8, 91, Gx_line+50, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(138, Gx_line+8, 138, Gx_line+50, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(391, Gx_line+8, 391, Gx_line+50, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(399, Gx_line+8, 399, Gx_line+50, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(778, Gx_line+41, 778, Gx_line+50, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(11, Gx_line+40, 11, Gx_line+50, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "OBS", ""), 274, Gx_line+17, 304, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "ANC", ""), 55, Gx_line+17, 84, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "MTS.", ""), 146, Gx_line+17, 179, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(91, Gx_line+8, 91, Gx_line+50, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(138, Gx_line+8, 138, Gx_line+50, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "KGS.", ""), 102, Gx_line+17, 136, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(391, Gx_line+8, 391, Gx_line+50, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "OBS", ""), 657, Gx_line+17, 687, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "ANC", ""), 439, Gx_line+17, 468, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "KGS.", ""), 485, Gx_line+17, 519, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "MTS.", ""), 529, Gx_line+17, 562, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(426, Gx_line+8, 426, Gx_line+50, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(474, Gx_line+8, 474, Gx_line+50, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(521, Gx_line+8, 521, Gx_line+50, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(774, Gx_line+8, 774, Gx_line+50, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "OBS", ""), 657, Gx_line+17, 687, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "ANC", ""), 439, Gx_line+17, 468, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(568, Gx_line+8, 568, Gx_line+50, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(474, Gx_line+8, 474, Gx_line+50, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(521, Gx_line+8, 521, Gx_line+50, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "KGS.", ""), 485, Gx_line+17, 519, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(774, Gx_line+8, 774, Gx_line+50, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "MTS.", ""), 529, Gx_line+17, 562, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(231, Gx_line+8, 231, Gx_line+50, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(184, Gx_line+8, 184, Gx_line+50, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(614, Gx_line+8, 614, Gx_line+50, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+50) ;
         }
         else
         {
            h7830( false, 43) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "N.", ""), 21, Gx_line+8, 36, Gx_line+25, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "N.", ""), 407, Gx_line+8, 422, Gx_line+25, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(11, Gx_line+0, 779, Gx_line+33, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(43, Gx_line+0, 43, Gx_line+42, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(391, Gx_line+0, 391, Gx_line+42, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(399, Gx_line+0, 399, Gx_line+42, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(778, Gx_line+32, 778, Gx_line+41, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(11, Gx_line+31, 11, Gx_line+41, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(391, Gx_line+0, 391, Gx_line+42, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(774, Gx_line+0, 774, Gx_line+42, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(774, Gx_line+0, 774, Gx_line+42, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "N Pieza", ""), 56, Gx_line+8, 105, Gx_line+25, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Kilos", ""), 156, Gx_line+8, 187, Gx_line+25, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Metros", ""), 220, Gx_line+8, 263, Gx_line+25, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Ubicacion", ""), 282, Gx_line+8, 342, Gx_line+25, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(426, Gx_line+1, 426, Gx_line+43, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(138, Gx_line+0, 138, Gx_line+42, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(205, Gx_line+0, 205, Gx_line+42, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(273, Gx_line+0, 273, Gx_line+42, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "N Pieza", ""), 436, Gx_line+8, 485, Gx_line+25, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Kilos", ""), 535, Gx_line+8, 566, Gx_line+25, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Metros", ""), 600, Gx_line+8, 643, Gx_line+25, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Ubicacion", ""), 673, Gx_line+8, 733, Gx_line+25, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(516, Gx_line+1, 516, Gx_line+43, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(585, Gx_line+1, 585, Gx_line+43, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(660, Gx_line+1, 660, Gx_line+43, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+43) ;
         }
         GX_I = 1 ;
         while ( GX_I <= 50 )
         {
            AV65Pieza[GX_I-1] = "" ;
            GX_I = (int)(GX_I+1) ;
         }
         GX_I = 1 ;
         while ( GX_I <= 50 )
         {
            AV66KgsP[GX_I-1] = DecimalUtil.ZERO ;
            GX_I = (int)(GX_I+1) ;
         }
         GX_I = 1 ;
         while ( GX_I <= 50 )
         {
            AV67MtsP[GX_I-1] = DecimalUtil.ZERO ;
            GX_I = (int)(GX_I+1) ;
         }
         GX_I = 1 ;
         while ( GX_I <= 50 )
         {
            AV68AnchoP[GX_I-1] = (short)(0) ;
            GX_I = (int)(GX_I+1) ;
         }
         GX_I = 1 ;
         while ( GX_I <= 50 )
         {
            AV152Local[GX_I-1] = "" ;
            GX_I = (int)(GX_I+1) ;
         }
         AV69i = (byte)(1) ;
         /* Using cursor P078325 */
         pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(22) != 101) )
         {
            A203BarPieKil = P078325_A203BarPieKil[0] ;
            A205BarPieMet = P078325_A205BarPieMet[0] ;
            A2186BarPieLoc = P078325_A2186BarPieLoc[0] ;
            n2186BarPieLoc = P078325_n2186BarPieLoc[0] ;
            A200BarPieCod = P078325_A200BarPieCod[0] ;
            if ( AV69i > 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            AV58BarPieCod = A200BarPieCod ;
            if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
            {
               AV58BarPieCod = httpContext.getMessage( "NO PIEZAS", "") ;
            }
            AV65Pieza[AV69i-1] = AV58BarPieCod ;
            AV66KgsP[AV69i-1] = A203BarPieKil ;
            AV67MtsP[AV69i-1] = A205BarPieMet ;
            AV68AnchoP[AV69i-1] = A125BarAncAca1 ;
            AV152Local[AV69i-1] = A2186BarPieLoc ;
            /* Execute user subroutine: 'COLOR_PIEZA' */
            S2525 ();
            if ( returnInSub )
            {
               pr_default.close(22);
               pr_default.close(21);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               if (true) return;
            }
            AV69i = (byte)(AV69i+1) ;
            pr_default.readNext(22);
         }
         pr_default.close(22);
         AV69i = (byte)(AV69i-1) ;
         if ( ( GXutil.Int( AV69i/ (double) (2)) == ( AV69i / (double) ( 2 ) ) ) )
         {
            AV81Npiezas = (byte)(AV69i/ (double) (2)) ;
         }
         else
         {
            AV81Npiezas = (byte)(2*GXutil.Int( AV69i/ (double) (2))+2) ;
            AV81Npiezas = (byte)(AV81Npiezas/ (double) (2)) ;
         }
         AV69i = (byte)(1) ;
         AV70t = (byte)(AV81Npiezas+1) ;
         AV82p = (byte)(1) ;
         AV54Linea2 = (byte)(1) ;
         while ( AV82p < 50 )
         {
            if ( AV69i > AV81Npiezas )
            {
               AV82p = (byte)(50) ;
            }
            else
            {
               AV71Pieza1 = AV65Pieza[AV69i-1] ;
               AV73Kgs1 = AV66KgsP[AV69i-1] ;
               AV75Mts1 = AV67MtsP[AV69i-1] ;
               AV77Anc1 = AV68AnchoP[AV69i-1] ;
               AV121Col1 = AV120ColP[AV69i-1] ;
               AV153LOcal1 = AV152Local[AV69i-1] ;
               AV72Pieza2 = AV65Pieza[AV70t-1] ;
               AV74Kgs2 = AV66KgsP[AV70t-1] ;
               AV76Mts2 = AV67MtsP[AV70t-1] ;
               AV78Anc2 = AV68AnchoP[AV70t-1] ;
               AV122Col2 = AV120ColP[AV70t-1] ;
               AV154LOcal2 = AV152Local[AV70t-1] ;
               AV83i1 = AV69i ;
               AV84t2 = AV70t ;
               if ( (GXutil.strcmp("", AV72Pieza2)==0) )
               {
                  AV84t2 = (byte)(0) ;
               }
               if ( AV155detalle == 0 )
               {
                  h7830( false, 17) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV83i1), "Z9")), 21, Gx_line+0, 37, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV84t2), "ZZ")), 407, Gx_line+0, 423, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(43, Gx_line+0, 43, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(91, Gx_line+0, 91, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(138, Gx_line+0, 138, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(391, Gx_line+0, 391, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(399, Gx_line+0, 399, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(778, Gx_line+0, 778, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(11, Gx_line+0, 11, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(91, Gx_line+0, 91, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(138, Gx_line+0, 138, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(391, Gx_line+0, 391, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(426, Gx_line+0, 426, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(474, Gx_line+0, 474, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(521, Gx_line+0, 521, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(774, Gx_line+0, 774, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(568, Gx_line+0, 568, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(474, Gx_line+0, 474, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(521, Gx_line+0, 521, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(568, Gx_line+0, 568, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(774, Gx_line+0, 774, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(231, Gx_line+0, 231, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(184, Gx_line+0, 184, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(614, Gx_line+0, 614, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(614, Gx_line+0, 614, Gx_line+17, 1, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+17) ;
               }
               else
               {
                  h7830( false, 18) ;
                  getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV71Pieza1, "")), 56, Gx_line+1, 132, Gx_line+19, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV73Kgs1, "ZZZZ.ZZ")), 143, Gx_line+0, 202, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV75Mts1, "ZZZZ.ZZ")), 211, Gx_line+0, 270, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV153LOcal1, "")), 282, Gx_line+0, 366, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV83i1), "Z9")), 21, Gx_line+0, 37, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV84t2), "ZZ")), 407, Gx_line+0, 423, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV72Pieza2, "")), 434, Gx_line+0, 510, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV74Kgs2, "ZZZZ.ZZ")), 522, Gx_line+0, 581, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV76Mts2, "ZZZZ.ZZ")), 590, Gx_line+0, 649, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV154LOcal2, "")), 671, Gx_line+0, 755, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(138, Gx_line+0, 138, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(43, Gx_line+0, 43, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(11, Gx_line+0, 11, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(205, Gx_line+0, 205, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(273, Gx_line+0, 273, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(391, Gx_line+0, 391, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(399, Gx_line+0, 399, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(426, Gx_line+0, 426, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(585, Gx_line+0, 585, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(660, Gx_line+0, 660, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(774, Gx_line+0, 774, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(778, Gx_line+0, 778, Gx_line+17, 1, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+18) ;
               }
               AV54Linea2 = (byte)(AV54Linea2+1) ;
               AV69i = (byte)(AV69i+1) ;
               AV70t = (byte)(AV69i+AV81Npiezas) ;
               AV82p = (byte)(AV82p+1) ;
            }
         }
         h7830( false, 2) ;
         getPrinter().GxDrawLine(11, Gx_line+0, 779, Gx_line+0, 1, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+2) ;
         AV54Linea2 = (byte)(AV54Linea2+1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(21);
   }

   public void S142( ) throws ProcessInterruptedException
   {
      /* 'RECEP' Routine */
      returnInSub = false ;
      AV115AlbRecs = "" ;
      AV116AlbREnts = "" ;
      /* Using cursor P078326 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(AV127BarCod), Byte.valueOf(AV128BarCodReo), AV129BarCodPar});
      while ( (pr_default.getStatus(23) != 101) )
      {
         brk78326 = false ;
         A130BarCodPar = P078326_A130BarCodPar[0] ;
         A132BarCodReo = P078326_A132BarCodReo[0] ;
         A129BarCod = P078326_A129BarCod[0] ;
         A44AlbRecCod = P078326_A44AlbRecCod[0] ;
         A200BarPieCod = P078326_A200BarPieCod[0] ;
         A46AlbREnt = P078326_A46AlbREnt[0] ;
         A55AlbRReo = P078326_A55AlbRReo[0] ;
         A46AlbREnt = P078326_A46AlbREnt[0] ;
         A55AlbRReo = P078326_A55AlbRReo[0] ;
         AV115AlbRecs += ((GXutil.strcmp(AV115AlbRecs, "")==0) ? "" : ", ") ;
         AV116AlbREnts += ((GXutil.strcmp(AV116AlbREnts, "")==0) ? "" : ", ") ;
         AV119AlbRLocs += ((GXutil.strcmp(AV119AlbRLocs, "")==0) ? "" : ", ") ;
         AV115AlbRecs += GXutil.trim( GXutil.str( A44AlbRecCod, 10, 0)) ;
         AV116AlbREnts += GXutil.trim( A46AlbREnt) ;
         if ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "SI", "")) == 0 )
         {
            AV130ReoTxt = httpContext.getMessage( "Reproc. Externo", "") ;
         }
         while ( (pr_default.getStatus(23) != 101) && ( GXutil.strcmp(P078326_A396EmprCod[0], A396EmprCod) == 0 ) && ( P078326_A129BarCod[0] == A129BarCod ) && ( P078326_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(P078326_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            if ( ! ( ( P078326_A44AlbRecCod[0] == A44AlbRecCod ) ) )
            {
               if (true) break;
            }
            brk78326 = false ;
            A200BarPieCod = P078326_A200BarPieCod[0] ;
            brk78326 = true ;
            pr_default.readNext(23);
         }
         if ( ! brk78326 )
         {
            brk78326 = true ;
            pr_default.readNext(23);
         }
      }
      pr_default.close(23);
   }

   public void S222( ) throws ProcessInterruptedException
   {
      /* 'OBS_ALBREC' Routine */
      returnInSub = false ;
      /* Using cursor P078327 */
      pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(AV127BarCod), Byte.valueOf(AV128BarCodReo), AV129BarCodPar});
      while ( (pr_default.getStatus(24) != 101) )
      {
         brk78328 = false ;
         A130BarCodPar = P078327_A130BarCodPar[0] ;
         A132BarCodReo = P078327_A132BarCodReo[0] ;
         A129BarCod = P078327_A129BarCod[0] ;
         A200BarPieCod = P078327_A200BarPieCod[0] ;
         A52AlbRPieEnt = P078327_A52AlbRPieEnt[0] ;
         A50AlbRLoc = P078327_A50AlbRLoc[0] ;
         A46AlbREnt = P078327_A46AlbREnt[0] ;
         A44AlbRecCod = P078327_A44AlbRecCod[0] ;
         A52AlbRPieEnt = P078327_A52AlbRPieEnt[0] ;
         A50AlbRLoc = P078327_A50AlbRLoc[0] ;
         A46AlbREnt = P078327_A46AlbREnt[0] ;
         h7830( false, 34) ;
         getPrinter().GxDrawRect(11, Gx_line+0, 779, Gx_line+34, 1, 0, 0, 0, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Observaciones Crudo", ""), 325, Gx_line+9, 467, Gx_line+26, 0+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+34) ;
         while ( (pr_default.getStatus(24) != 101) && ( GXutil.strcmp(P078327_A396EmprCod[0], A396EmprCod) == 0 ) && ( P078327_A129BarCod[0] == A129BarCod ) && ( P078327_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(P078327_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            brk78328 = false ;
            A200BarPieCod = P078327_A200BarPieCod[0] ;
            A52AlbRPieEnt = P078327_A52AlbRPieEnt[0] ;
            A50AlbRLoc = P078327_A50AlbRLoc[0] ;
            A46AlbREnt = P078327_A46AlbREnt[0] ;
            A44AlbRecCod = P078327_A44AlbRecCod[0] ;
            A52AlbRPieEnt = P078327_A52AlbRPieEnt[0] ;
            A50AlbRLoc = P078327_A50AlbRLoc[0] ;
            A46AlbREnt = P078327_A46AlbREnt[0] ;
            if ( A129BarCod == AV127BarCod )
            {
               if ( A132BarCodReo == AV128BarCodReo )
               {
                  if ( GXutil.strcmp(A130BarCodPar, AV129BarCodPar) == 0 )
                  {
                     h7830( false, 18) ;
                     getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Recepción", ""), 89, Gx_line+1, 154, Gx_line+18, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Rec. Cliente", ""), 232, Gx_line+1, 307, Gx_line+18, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9")), 163, Gx_line+1, 222, Gx_line+19, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A46AlbREnt, "")), 318, Gx_line+1, 427, Gx_line+19, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawLine(11, Gx_line+0, 11, Gx_line+19, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A50AlbRLoc, "")), 523, Gx_line+1, 587, Gx_line+19, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Localización", ""), 436, Gx_line+1, 512, Gx_line+18, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A52AlbRPieEnt), "ZZZZZ9")), 650, Gx_line+1, 695, Gx_line+19, 2+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Piezas", ""), 598, Gx_line+1, 641, Gx_line+18, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+18) ;
                     /* Using cursor P078328 */
                     pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
                     while ( (pr_default.getStatus(25) != 101) )
                     {
                        A1300AlbRObs = P078328_A1300AlbRObs[0] ;
                        A1299AlbRLin = P078328_A1299AlbRLin[0] ;
                        h7830( false, 18) ;
                        getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1300AlbRObs, "")), 89, Gx_line+1, 465, Gx_line+19, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawLine(11, Gx_line+0, 11, Gx_line+19, 1, 0, 0, 0, 0) ;
                        getPrinter().GxDrawLine(778, Gx_line+0, 778, Gx_line+19, 1, 0, 0, 0, 0) ;
                        Gx_OldLine = Gx_line ;
                        Gx_line = (int)(Gx_line+18) ;
                        pr_default.readNext(25);
                     }
                     pr_default.close(25);
                     while ( (pr_default.getStatus(24) != 101) && ( GXutil.strcmp(P078327_A396EmprCod[0], A396EmprCod) == 0 ) && ( P078327_A129BarCod[0] == A129BarCod ) && ( P078327_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(P078327_A130BarCodPar[0], A130BarCodPar) == 0 ) )
                     {
                        if ( ! ( ( P078327_A44AlbRecCod[0] == A44AlbRecCod ) ) )
                        {
                           if (true) break;
                        }
                        brk78328 = false ;
                        A200BarPieCod = P078327_A200BarPieCod[0] ;
                        brk78328 = true ;
                        pr_default.readNext(24);
                     }
                  }
               }
            }
            if ( ! brk78328 )
            {
               brk78328 = true ;
               pr_default.readNext(24);
            }
         }
         h7830( false, 8) ;
         getPrinter().GxDrawLine(11, Gx_line+0, 779, Gx_line+0, 1, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+8) ;
         if ( ! brk78328 )
         {
            brk78328 = true ;
            pr_default.readNext(24);
         }
      }
      pr_default.close(24);
   }

   public void S1914( ) throws ProcessInterruptedException
   {
      /* 'MAQUIN' Routine */
      returnInSub = false ;
      AV30MaqDsc = "" ;
      /* Using cursor P078329 */
      pr_default.execute(26, new Object[] {A396EmprCod, AV32MaqCod});
      while ( (pr_default.getStatus(26) != 101) )
      {
         A602MaqCod = P078329_A602MaqCod[0] ;
         A620MaqTip = P078329_A620MaqTip[0] ;
         n620MaqTip = P078329_n620MaqTip[0] ;
         A606MaqDsc = P078329_A606MaqDsc[0] ;
         n606MaqDsc = P078329_n606MaqDsc[0] ;
         AV30MaqDsc = A606MaqDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(26);
   }

   public void S122( ) throws ProcessInterruptedException
   {
      /* 'TIPART' Routine */
      returnInSub = false ;
      AV64TipARtDsc = "" ;
      /* Using cursor P078330 */
      pr_default.execute(27, new Object[] {A396EmprCod, Short.valueOf(AV63TipArtCod)});
      while ( (pr_default.getStatus(27) != 101) )
      {
         A829TipArtCod = P078330_A829TipArtCod[0] ;
         A830TipArtDsc = P078330_A830TipArtDsc[0] ;
         n830TipArtDsc = P078330_n830TipArtDsc[0] ;
         AV64TipARtDsc = A830TipArtDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(27);
   }

   public void S132( ) throws ProcessInterruptedException
   {
      /* 'OBS' Routine */
      returnInSub = false ;
      AV90FlagObs = (byte)(0) ;
      /* Using cursor P078331 */
      pr_default.execute(28, new Object[] {AV31EmprCod, Integer.valueOf(AV36CliCod), AV34BarSer});
      while ( (pr_default.getStatus(28) != 101) )
      {
         A3072ArtObsLon = P078331_A3072ArtObsLon[0] ;
         n3072ArtObsLon = P078331_n3072ArtObsLon[0] ;
         A65ArtCod = P078331_A65ArtCod[0] ;
         A252CliCod = P078331_A252CliCod[0] ;
         n252CliCod = P078331_n252CliCod[0] ;
         AV90FlagObs = (byte)(1) ;
         AV91Nlin = (short)(GXutil.gxmlines( A3072ArtObsLon, (short)(60))) ;
         AV92j = (short)(1) ;
         AV94z = (short)(1) ;
         while ( AV92j <= AV91Nlin )
         {
            if ( AV94z < 10 )
            {
               AV93Obstxt[AV94z-1] = GXutil.gxgetmli( A3072ArtObsLon, AV92j, (short)(60)) ;
            }
            AV92j = (short)(AV92j+1) ;
            AV94z = (short)(AV94z+1) ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(28);
   }

   public void S2014( ) throws ProcessInterruptedException
   {
      /* 'PARAMETROS' Routine */
      returnInSub = false ;
      /* Using cursor P078332 */
      pr_default.execute(29, new Object[] {A396EmprCod, Integer.valueOf(AV36CliCod), AV34BarSer, AV118ProCod, AV117FasCod});
      while ( (pr_default.getStatus(29) != 101) )
      {
         A457FasCod = P078332_A457FasCod[0] ;
         A758ProCod = P078332_A758ProCod[0] ;
         A65ArtCod = P078332_A65ArtCod[0] ;
         A252CliCod = P078332_A252CliCod[0] ;
         n252CliCod = P078332_n252CliCod[0] ;
         A1665ParFasDsc = P078332_A1665ParFasDsc[0] ;
         n1665ParFasDsc = P078332_n1665ParFasDsc[0] ;
         A1668ParFasVal = P078332_A1668ParFasVal[0] ;
         A1673ParFasObs = P078332_A1673ParFasObs[0] ;
         A1664ParFasCod = P078332_A1664ParFasCod[0] ;
         A1665ParFasDsc = P078332_A1665ParFasDsc[0] ;
         n1665ParFasDsc = P078332_n1665ParFasDsc[0] ;
         h7830( false, 18) ;
         getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1664ParFasCod), "ZZZ9")), 9, Gx_line+0, 39, Gx_line+18, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1673ParFasObs, "")), 404, Gx_line+1, 780, Gx_line+19, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1668ParFasVal, "")), 273, Gx_line+0, 382, Gx_line+18, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1665ParFasDsc, "")), 63, Gx_line+1, 252, Gx_line+19, 0+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+18) ;
         pr_default.readNext(29);
      }
      pr_default.close(29);
   }

   public void S152( ) throws ProcessInterruptedException
   {
      /* 'STKI' Routine */
      returnInSub = false ;
      AV123HDRs = "" ;
      AV156Remitos = " " ;
      AV211GXLvl522 = (byte)(0) ;
      /* Using cursor P078333 */
      pr_default.execute(30, new Object[] {A396EmprCod, Integer.valueOf(AV60DisCod)});
      while ( (pr_default.getStatus(30) != 101) )
      {
         brk78336 = false ;
         A361DisCod = P078333_A361DisCod[0] ;
         A3400DisRefBCPa = P078333_A3400DisRefBCPa[0] ;
         A3399DisRefBCRe = P078333_A3399DisRefBCRe[0] ;
         A3398DisRefBarC = P078333_A3398DisRefBarC[0] ;
         A3607DisRefBPie = P078333_A3607DisRefBPie[0] ;
         AV211GXLvl522 = (byte)(1) ;
         AV123HDRs += ((GXutil.strcmp(AV123HDRs, "")==0) ? "" : ", ") ;
         AV123HDRs += GXutil.trim( GXutil.str( A3398DisRefBarC, 10, 0)) + GXutil.trim( GXutil.str( A3399DisRefBCRe, 10, 0)) + GXutil.trim( A3400DisRefBCPa) ;
         AV157Barcod1 = A3398DisRefBarC ;
         AV158barcodreo1 = A3399DisRefBCRe ;
         AV159barcodpar1 = A3400DisRefBCPa ;
         /* Execute user subroutine: 'ALBBAR' */
         S2636 ();
         if ( returnInSub )
         {
            pr_default.close(30);
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            if (true) return;
         }
         while ( (pr_default.getStatus(30) != 101) && ( GXutil.strcmp(P078333_A396EmprCod[0], A396EmprCod) == 0 ) && ( P078333_A361DisCod[0] == A361DisCod ) && ( P078333_A3398DisRefBarC[0] == A3398DisRefBarC ) && ( P078333_A3399DisRefBCRe[0] == A3399DisRefBCRe ) )
         {
            if ( ! ( ( GXutil.strcmp(P078333_A3400DisRefBCPa[0], A3400DisRefBCPa) == 0 ) ) )
            {
               if (true) break;
            }
            brk78336 = false ;
            A3607DisRefBPie = P078333_A3607DisRefBPie[0] ;
            brk78336 = true ;
            pr_default.readNext(30);
         }
         if ( ! brk78336 )
         {
            brk78336 = true ;
            pr_default.readNext(30);
         }
      }
      pr_default.close(30);
      if ( AV211GXLvl522 == 0 )
      {
         AV123HDRs = httpContext.getMessage( "No Stki", "") ;
      }
   }

   public void S2636( ) throws ProcessInterruptedException
   {
      /* 'ALBBAR' Routine */
      returnInSub = false ;
      /* Using cursor P078334 */
      pr_default.execute(31, new Object[] {A396EmprCod, Integer.valueOf(AV157Barcod1), Byte.valueOf(AV158barcodreo1), AV159barcodpar1});
      while ( (pr_default.getStatus(31) != 101) )
      {
         A130BarCodPar = P078334_A130BarCodPar[0] ;
         A132BarCodReo = P078334_A132BarCodReo[0] ;
         A129BarCod = P078334_A129BarCod[0] ;
         A30AlbProCod = P078334_A30AlbProCod[0] ;
         AV156Remitos += ((GXutil.strcmp(AV156Remitos, "")==0) ? "" : ", ") ;
         AV156Remitos += GXutil.str( A30AlbProCod, 10, 0) ;
         pr_default.readNext(31);
      }
      pr_default.close(31);
   }

   public void S2525( ) throws ProcessInterruptedException
   {
      /* 'COLOR_PIEZA' Routine */
      returnInSub = false ;
      /* Using cursor P078335 */
      pr_default.execute(32, new Object[] {A396EmprCod, AV58BarPieCod});
      while ( (pr_default.getStatus(32) != 101) )
      {
         A3607DisRefBPie = P078335_A3607DisRefBPie[0] ;
         A3398DisRefBarC = P078335_A3398DisRefBarC[0] ;
         A3399DisRefBCRe = P078335_A3399DisRefBCRe[0] ;
         A3400DisRefBCPa = P078335_A3400DisRefBCPa[0] ;
         A361DisCod = P078335_A361DisCod[0] ;
         AV124DisRefBarC = A3398DisRefBarC ;
         AV125DisRefBCR = A3399DisRefBCRe ;
         AV126DisRefBCP = A3400DisRefBCPa ;
         pr_default.readNext(32);
      }
      pr_default.close(32);
      /* Using cursor P078336 */
      pr_default.execute(33, new Object[] {A396EmprCod, Integer.valueOf(AV124DisRefBarC), Byte.valueOf(AV125DisRefBCR), AV126DisRefBCP});
      while ( (pr_default.getStatus(33) != 101) )
      {
         A130BarCodPar = P078336_A130BarCodPar[0] ;
         A132BarCodReo = P078336_A132BarCodReo[0] ;
         A129BarCod = P078336_A129BarCod[0] ;
         A135BarColNom = P078336_A135BarColNom[0] ;
         AV120ColP[AV69i-1] = A135BarColNom ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(33);
   }

   public void S162( ) throws ProcessInterruptedException
   {
      /* 'INTENS' Routine */
      returnInSub = false ;
      /* Using cursor P078337 */
      pr_default.execute(34, new Object[] {A396EmprCod, Integer.valueOf(AV36CliCod), AV34BarSer, AV39ForColNom, Integer.valueOf(AV40ForColNum), Byte.valueOf(AV59TipColCod)});
      while ( (pr_default.getStatus(34) != 101) )
      {
         A583IntCod = P078337_A583IntCod[0] ;
         A831TipColCod = P078337_A831TipColCod[0] ;
         A483ForColNum = P078337_A483ForColNum[0] ;
         A482ForColNom = P078337_A482ForColNom[0] ;
         A494ForSer = P078337_A494ForSer[0] ;
         A252CliCod = P078337_A252CliCod[0] ;
         n252CliCod = P078337_n252CliCod[0] ;
         A584IntDsc = P078337_A584IntDsc[0] ;
         n584IntDsc = P078337_n584IntDsc[0] ;
         A584IntDsc = P078337_A584IntDsc[0] ;
         n584IntDsc = P078337_n584IntDsc[0] ;
         AV29IntDsc = A584IntDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(34);
   }

   public void S172( ) throws ProcessInterruptedException
   {
      /* 'PROVIN' Routine */
      returnInSub = false ;
      /* Using cursor P078338 */
      pr_default.execute(35, new Object[] {A396EmprCod, Integer.valueOf(AV36CliCod)});
      while ( (pr_default.getStatus(35) != 101) )
      {
         A781PrvCod = P078338_A781PrvCod[0] ;
         A252CliCod = P078338_A252CliCod[0] ;
         n252CliCod = P078338_n252CliCod[0] ;
         A787PrvDsc = P078338_A787PrvDsc[0] ;
         n787PrvDsc = P078338_n787PrvDsc[0] ;
         A787PrvDsc = P078338_A787PrvDsc[0] ;
         n787PrvDsc = P078338_n787PrvDsc[0] ;
         AV136PrvDsc = A787PrvDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(35);
   }

   public void S182( ) throws ProcessInterruptedException
   {
      /* 'CRUDO' Routine */
      returnInSub = false ;
      /* Using cursor P078339 */
      pr_default.execute(36, new Object[] {A396EmprCod, Integer.valueOf(AV127BarCod), Byte.valueOf(AV128BarCodReo), AV129BarCodPar});
      while ( (pr_default.getStatus(36) != 101) )
      {
         A130BarCodPar = P078339_A130BarCodPar[0] ;
         A132BarCodReo = P078339_A132BarCodReo[0] ;
         A129BarCod = P078339_A129BarCod[0] ;
         A200BarPieCod = P078339_A200BarPieCod[0] ;
         A44AlbRecCod = P078339_A44AlbRecCod[0] ;
         AV149AlbRecPie = A200BarPieCod ;
         AV150AlbRecCod = A44AlbRecCod ;
         /* Execute user subroutine: 'PIEZAS_CRUDO' */
         S2743 ();
         if ( returnInSub )
         {
            pr_default.close(36);
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            if (true) return;
         }
         pr_default.readNext(36);
      }
      pr_default.close(36);
   }

   public void S2743( ) throws ProcessInterruptedException
   {
      /* 'PIEZAS_CRUDO' Routine */
      returnInSub = false ;
      /* Optimized group. */
      /* Using cursor P078340 */
      pr_default.execute(37, new Object[] {A396EmprCod, Integer.valueOf(AV150AlbRecCod), AV149AlbRecPie});
      c2155AlbRecKgm = P078340_A2155AlbRecKgm[0] ;
      c2157AlbRecMtr = P078340_A2157AlbRecMtr[0] ;
      cV146AlbDetPie = P078340_AV146AlbDetPie[0] ;
      pr_default.close(37);
      AV147AlbDetKgm = AV147AlbDetKgm.add(c2155AlbRecKgm) ;
      AV148AlbDetMtr = AV148AlbDetMtr.add(c2157AlbRecMtr) ;
      AV146AlbDetPie = (short)(AV146AlbDetPie+cV146AlbDetPie*1) ;
      /* End optimized group. */
   }

   public void h7830( boolean bFoot ,
                      int Inc )
   {
      /* Skip the required number of lines */
      while ( ( ToSkip > 0 ) || ( Gx_line + Inc > P_lines ) )
      {
         if ( Gx_line + Inc >= P_lines )
         {
            if ( Gx_page > 0 )
            {
               /* Print footers */
               Gx_line = P_lines ;
               getPrinter().GxEndPage() ;
               if ( bFoot )
               {
                  return  ;
               }
            }
            ToSkip = 0 ;
            Gx_line = 0 ;
            Gx_page = (int)(Gx_page+1) ;
            /* Skip Margin Top Lines */
            Gx_line = (int)(Gx_line+(M_top*lineHeight)) ;
            /* Print headers */
            getPrinter().GxStartPage() ;
            getPrinter().setPage(Gx_page);
            if (true) break;
         }
         else
         {
            PrtOffset = 0 ;
            Gx_line = (int)(Gx_line+1) ;
         }
         ToSkip = (int)(ToSkip-1) ;
      }
      getPrinter().setPage(Gx_page);
   }

   protected void cleanup( )
   {
      this.aP0[0] = rhdrart1.this.A396EmprCod;
      this.aP1[0] = rhdrart1.this.AV127BarCod;
      this.aP2[0] = rhdrart1.this.AV128BarCodReo;
      this.aP3[0] = rhdrart1.this.AV129BarCodPar;
      this.aP4[0] = rhdrart1.this.Gx_out;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A758ProCod = "" ;
      A759ProDsc = "" ;
      A7740DisFasPre = DecimalUtil.ZERO ;
      A457FasCod = "" ;
      A7728ArtAdiDsc = "" ;
      A1798BarDibCli = "" ;
      scmdbuf = "" ;
      P07833_A833TipDefCod = new short[1] ;
      P07833_n833TipDefCod = new boolean[] {false} ;
      P07833_A858ZonGeoCod = new short[1] ;
      P07833_A396EmprCod = new String[] {""} ;
      P07833_A361DisCod = new int[1] ;
      P07833_A1014DibInt = new int[1] ;
      P07833_n1014DibInt = new boolean[] {false} ;
      P07833_A1013DibCli = new String[] {""} ;
      P07833_n1013DibCli = new boolean[] {false} ;
      P07833_A1823DibTipMaq = new String[] {""} ;
      P07833_n1823DibTipMaq = new boolean[] {false} ;
      P07833_A130BarCodPar = new String[] {""} ;
      P07833_A132BarCodReo = new byte[1] ;
      P07833_A129BarCod = new int[1] ;
      P07833_A1607DibMed = new String[] {""} ;
      P07833_n1607DibMed = new boolean[] {false} ;
      P07833_A1605DibLocal = new String[] {""} ;
      P07833_n1605DibLocal = new boolean[] {false} ;
      P07833_A1798BarDibCli = new String[] {""} ;
      P07833_A252CliCod = new int[1] ;
      P07833_n252CliCod = new boolean[] {false} ;
      P07833_A212BarSer = new String[] {""} ;
      P07833_A135BarColNom = new String[] {""} ;
      P07833_A136BarColNum = new int[1] ;
      P07833_A218BarTipCol = new byte[1] ;
      P07833_A148BarEstReo = new byte[1] ;
      P07833_A217BarTipArt = new short[1] ;
      P07833_n217BarTipArt = new boolean[] {false} ;
      P07833_A1431BarLocDis = new String[] {""} ;
      P07833_A125BarAncAca1 = new short[1] ;
      P07833_A126BarAncAca2 = new short[1] ;
      P07833_A211BarRdt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07833_A1909BarGraAca = new short[1] ;
      P07833_A3307DisManCod1 = new short[1] ;
      P07833_A3308DisManCod2 = new short[1] ;
      P07833_A224BarTraP1 = new short[1] ;
      P07833_A225BarTraP2 = new short[1] ;
      P07833_A226BarTraP3 = new short[1] ;
      P07833_A232BarUrdP1 = new short[1] ;
      P07833_A233BarUrdP2 = new short[1] ;
      P07833_A234BarUrdP3 = new short[1] ;
      P07833_A4832BarAudFec = new java.util.Date[] {GXutil.nullDate()} ;
      P07833_n4832BarAudFec = new boolean[] {false} ;
      P07833_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P07833_A7523DisRec = new String[] {""} ;
      P07833_A1360ZonGeoNom = new String[] {""} ;
      P07833_n1360ZonGeoNom = new boolean[] {false} ;
      P07833_A4348DisUsrCod = new String[] {""} ;
      P07833_A834TipDefDsc = new String[] {""} ;
      P07833_n834TipDefDsc = new boolean[] {false} ;
      P07833_A177BarLar = new String[] {""} ;
      P07833_A1235BarNumCli = new int[1] ;
      P07833_A1234BarNomCli = new String[] {""} ;
      P07833_A1606DibTipRas = new String[] {""} ;
      P07833_n1606DibTipRas = new boolean[] {false} ;
      P07833_A139BarCorOri = new String[] {""} ;
      P07833_A206BarPle = new String[] {""} ;
      P07833_A145BarEncOri = new String[] {""} ;
      P07833_A1652BarSerDsc = new String[] {""} ;
      P07833_A143BarDisNum = new String[] {""} ;
      P07833_A9771DisItem1 = new String[] {""} ;
      P07833_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P07833_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      P07833_A231BarUrd3 = new String[] {""} ;
      P07833_A230BarUrd2 = new String[] {""} ;
      P07833_A229BarUrd1 = new String[] {""} ;
      P07833_A223BarTra3 = new String[] {""} ;
      P07833_A222BarTra2 = new String[] {""} ;
      P07833_A221BarTra1 = new String[] {""} ;
      P07833_A2010BarTipDis = new String[] {""} ;
      P07833_A1799BarDibInt = new int[1] ;
      P07833_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07833_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07833_A199BarPie1 = new short[1] ;
      P07833_A365DisDes = new String[] {""} ;
      P07833_A898BarPieNDes = new int[1] ;
      A1013DibCli = "" ;
      A1823DibTipMaq = "" ;
      A130BarCodPar = "" ;
      A1607DibMed = "" ;
      A1605DibLocal = "" ;
      A212BarSer = "" ;
      A1431BarLocDis = "" ;
      A211BarRdt = DecimalUtil.ZERO ;
      A4832BarAudFec = GXutil.nullDate() ;
      A159BarFecGen = GXutil.nullDate() ;
      A7523DisRec = "" ;
      A1360ZonGeoNom = "" ;
      A4348DisUsrCod = "" ;
      A834TipDefDsc = "" ;
      A177BarLar = "" ;
      A1606DibTipRas = "" ;
      A139BarCorOri = "" ;
      A206BarPle = "" ;
      A145BarEncOri = "" ;
      A1652BarSerDsc = "" ;
      A143BarDisNum = "" ;
      A9771DisItem1 = "" ;
      A158BarFecFpr = GXutil.nullDate() ;
      A369DisFec = GXutil.nullDate() ;
      A231BarUrd3 = "" ;
      A230BarUrd2 = "" ;
      A229BarUrd1 = "" ;
      A223BarTra3 = "" ;
      A222BarTra2 = "" ;
      A221BarTra1 = "" ;
      A2010BarTipDis = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A365DisDes = "" ;
      AV151Fpdsc = "" ;
      P07834_A497FpgCod = new String[] {""} ;
      P07834_A396EmprCod = new String[] {""} ;
      P07834_A252CliCod = new int[1] ;
      P07834_n252CliCod = new boolean[] {false} ;
      P07834_A498FpgDsc = new String[] {""} ;
      P07834_n498FpgDsc = new boolean[] {false} ;
      P07834_A297CliPri = new String[] {""} ;
      A497FpgCod = "" ;
      A498FpgDsc = "" ;
      A297CliPri = "" ;
      AV137CliNom = "" ;
      GXt_char3 = "" ;
      GXv_int5 = new int[1] ;
      GXv_int2 = new byte[1] ;
      AV97HdrA = new String[10] ;
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV97HdrA[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV131HdrAgr = new String[6] ;
      GX_I = 1 ;
      while ( GX_I <= 6 )
      {
         AV131HdrAgr[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV133BarLocDis = new String[10] ;
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV133BarLocDis[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV35HojRut = "" ;
      AV87Ceros8 = "" ;
      AV88HdrAlfa = "" ;
      AV86Hdr = "" ;
      AV34BarSer = "" ;
      AV31EmprCod = "" ;
      AV39ForColNom = "" ;
      AV62TextoReop = "" ;
      AV79BarSer9 = "" ;
      AV130ReoTxt = "" ;
      AV119AlbRLocs = "" ;
      AV99BarAncAca1 = "" ;
      AV100BarAncAca2 = "" ;
      AV104Comma = "" ;
      AV101BarRdt = "" ;
      AV102BarKgm = "" ;
      AV106BarMtr = "" ;
      AV103BarPie = "" ;
      AV135Estampar = "" ;
      AV134Colorido = "" ;
      AV107BarTraP1 = "" ;
      AV108BarTraP2 = "" ;
      AV109BarTraP3 = "" ;
      AV110BarUrdP1 = "" ;
      AV111BarUrdP2 = "" ;
      AV112BarUrdP3 = "" ;
      AV113Porc = new String[6] ;
      GX_I = 1 ;
      while ( GX_I <= 6 )
      {
         AV113Porc[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV64TipARtDsc = "" ;
      AV116AlbREnts = "" ;
      AV115AlbRecs = "" ;
      AV123HDRs = "" ;
      AV29IntDsc = "" ;
      AV136PrvDsc = "" ;
      AV147AlbDetKgm = DecimalUtil.ZERO ;
      AV148AlbDetMtr = DecimalUtil.ZERO ;
      AV156Remitos = "" ;
      AV140SerEst = "" ;
      P07835_A396EmprCod = new String[] {""} ;
      P07835_A129BarCod = new int[1] ;
      P07835_A132BarCodReo = new byte[1] ;
      P07835_A130BarCodPar = new String[] {""} ;
      P07835_A1056DisComCod = new String[] {""} ;
      P07835_A1032FonCod = new String[] {""} ;
      P07835_A2524DisComLin = new byte[1] ;
      P07835_A1543BarComPie = new short[1] ;
      P07835_n1543BarComPie = new boolean[] {false} ;
      P07835_A1541BarComMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07835_n1541BarComMtr = new boolean[] {false} ;
      P07835_A7734BarComObs = new String[] {""} ;
      P07835_n7734BarComObs = new boolean[] {false} ;
      A1056DisComCod = "" ;
      A1032FonCod = "" ;
      A1541BarComMtr = DecimalUtil.ZERO ;
      A7734BarComObs = "" ;
      AV138DisComCod = "" ;
      AV139FonCod = "" ;
      P07836_A396EmprCod = new String[] {""} ;
      P07836_A1013DibCli = new String[] {""} ;
      P07836_n1013DibCli = new boolean[] {false} ;
      P07836_A252CliCod = new int[1] ;
      P07836_n252CliCod = new boolean[] {false} ;
      P07836_A1014DibInt = new int[1] ;
      P07836_n1014DibInt = new boolean[] {false} ;
      P07836_A7507DibOrgLin = new short[1] ;
      P07836_n7507DibOrgLin = new boolean[] {false} ;
      P07836_A7505DibOrgInt = new int[1] ;
      P07836_n7505DibOrgInt = new boolean[] {false} ;
      P07836_A7506DibOrgCli = new String[] {""} ;
      P07836_n7506DibOrgCli = new boolean[] {false} ;
      P07836_A1809DibOrdMol = new byte[1] ;
      P07836_n1809DibOrdMol = new boolean[] {false} ;
      P07836_A6839DibMolCod = new String[] {""} ;
      P07836_n6839DibMolCod = new boolean[] {false} ;
      P07836_A2092DibRelMC2 = new String[] {""} ;
      P07836_n2092DibRelMC2 = new boolean[] {false} ;
      P07836_A5381DibPrcCobM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07836_n5381DibPrcCobM = new boolean[] {false} ;
      P07836_A1029DibLin = new short[1] ;
      A7506DibOrgCli = "" ;
      A6839DibMolCod = "" ;
      A2092DibRelMC2 = "" ;
      A5381DibPrcCobM = DecimalUtil.ZERO ;
      P07837_A396EmprCod = new String[] {""} ;
      P07837_A252CliCod = new int[1] ;
      P07837_n252CliCod = new boolean[] {false} ;
      P07837_A1013DibCli = new String[] {""} ;
      P07837_n1013DibCli = new boolean[] {false} ;
      P07837_A1014DibInt = new int[1] ;
      P07837_n1014DibInt = new boolean[] {false} ;
      P07837_A2098MolCod = new byte[1] ;
      P07837_A2074ColCom = new String[] {""} ;
      P07837_A2141SerEst = new String[] {""} ;
      P07837_A2078ColFon = new String[] {""} ;
      P07837_A2648MolForEst = new String[] {""} ;
      P07837_n2648MolForEst = new boolean[] {false} ;
      A2074ColCom = "" ;
      A2141SerEst = "" ;
      A2078ColFon = "" ;
      A2648MolForEst = "" ;
      AV141MolForEst = "" ;
      P07838_A396EmprCod = new String[] {""} ;
      P07838_A252CliCod = new int[1] ;
      P07838_n252CliCod = new boolean[] {false} ;
      P07838_A2141SerEst = new String[] {""} ;
      P07838_A1013DibCli = new String[] {""} ;
      P07838_n1013DibCli = new boolean[] {false} ;
      P07838_A1014DibInt = new int[1] ;
      P07838_n1014DibInt = new boolean[] {false} ;
      P07838_A2074ColCom = new String[] {""} ;
      P07838_A2078ColFon = new String[] {""} ;
      P07838_A2098MolCod = new byte[1] ;
      P07838_A2107PasCod = new String[] {""} ;
      P07838_n2107PasCod = new boolean[] {false} ;
      P07838_A2654PasForLin = new short[1] ;
      A2107PasCod = "" ;
      AV142PasDsc = new String[20] ;
      GX_I = 1 ;
      while ( GX_I <= 20 )
      {
         AV142PasDsc[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P07839_A396EmprCod = new String[] {""} ;
      P07839_A7036ShaGrb = new String[] {""} ;
      P07839_n7036ShaGrb = new boolean[] {false} ;
      P07839_A7043ShaOrd = new byte[1] ;
      P07839_n7043ShaOrd = new boolean[] {false} ;
      P07839_A7042ShaDibInt = new int[1] ;
      P07839_A7041ShaDibCli = new String[] {""} ;
      P07839_A7031ShaCod = new String[] {""} ;
      P07839_A7034ShaGal = new String[] {""} ;
      P07839_n7034ShaGal = new boolean[] {false} ;
      P07839_A7035ShaUbi = new String[] {""} ;
      P07839_n7035ShaUbi = new boolean[] {false} ;
      P07839_A7033ShaAnc = new String[] {""} ;
      P07839_n7033ShaAnc = new boolean[] {false} ;
      P07839_A7032ShaMal = new String[] {""} ;
      P07839_n7032ShaMal = new boolean[] {false} ;
      A7036ShaGrb = "" ;
      A7041ShaDibCli = "" ;
      A7031ShaCod = "" ;
      A7034ShaGal = "" ;
      A7035ShaUbi = "" ;
      A7033ShaAnc = "" ;
      A7032ShaMal = "" ;
      P078310_A396EmprCod = new String[] {""} ;
      P078310_A1013DibCli = new String[] {""} ;
      P078310_n1013DibCli = new boolean[] {false} ;
      P078310_A252CliCod = new int[1] ;
      P078310_n252CliCod = new boolean[] {false} ;
      P078310_A1014DibInt = new int[1] ;
      P078310_n1014DibInt = new boolean[] {false} ;
      P078310_A10510DibOrgLi = new short[1] ;
      P078310_n10510DibOrgLi = new boolean[] {false} ;
      P078310_A10508DibOrgIn = new int[1] ;
      P078310_n10508DibOrgIn = new boolean[] {false} ;
      P078310_A10509DibOrgCl = new String[] {""} ;
      P078310_n10509DibOrgCl = new boolean[] {false} ;
      P078310_A1808DibOrdCil = new byte[1] ;
      P078310_n1808DibOrdCil = new boolean[] {false} ;
      P078310_A1030DibRelMC = new String[] {""} ;
      P078310_n1030DibRelMC = new boolean[] {false} ;
      P078310_A4860DibPrcCob = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P078310_n4860DibPrcCob = new boolean[] {false} ;
      P078310_A1807DibLinCil = new short[1] ;
      A10509DibOrgCl = "" ;
      A1030DibRelMC = "" ;
      A4860DibPrcCob = DecimalUtil.ZERO ;
      P078311_A396EmprCod = new String[] {""} ;
      P078311_A252CliCod = new int[1] ;
      P078311_n252CliCod = new boolean[] {false} ;
      P078311_A1013DibCli = new String[] {""} ;
      P078311_n1013DibCli = new boolean[] {false} ;
      P078311_A1014DibInt = new int[1] ;
      P078311_n1014DibInt = new boolean[] {false} ;
      P078311_A2098MolCod = new byte[1] ;
      P078311_A2074ColCom = new String[] {""} ;
      P078311_A2141SerEst = new String[] {""} ;
      P078311_A2078ColFon = new String[] {""} ;
      P078311_A2648MolForEst = new String[] {""} ;
      P078311_n2648MolForEst = new boolean[] {false} ;
      P078312_A396EmprCod = new String[] {""} ;
      P078312_A252CliCod = new int[1] ;
      P078312_n252CliCod = new boolean[] {false} ;
      P078312_A2141SerEst = new String[] {""} ;
      P078312_A1013DibCli = new String[] {""} ;
      P078312_n1013DibCli = new boolean[] {false} ;
      P078312_A1014DibInt = new int[1] ;
      P078312_n1014DibInt = new boolean[] {false} ;
      P078312_A2074ColCom = new String[] {""} ;
      P078312_A2078ColFon = new String[] {""} ;
      P078312_A2098MolCod = new byte[1] ;
      P078312_A2107PasCod = new String[] {""} ;
      P078312_n2107PasCod = new boolean[] {false} ;
      P078312_A2654PasForLin = new short[1] ;
      P078313_A396EmprCod = new String[] {""} ;
      P078313_A7036ShaGrb = new String[] {""} ;
      P078313_n7036ShaGrb = new boolean[] {false} ;
      P078313_A7043ShaOrd = new byte[1] ;
      P078313_n7043ShaOrd = new boolean[] {false} ;
      P078313_A7042ShaDibInt = new int[1] ;
      P078313_A7041ShaDibCli = new String[] {""} ;
      P078313_A7031ShaCod = new String[] {""} ;
      P078313_A7034ShaGal = new String[] {""} ;
      P078313_n7034ShaGal = new boolean[] {false} ;
      P078313_A7035ShaUbi = new String[] {""} ;
      P078313_n7035ShaUbi = new boolean[] {false} ;
      P078313_A7033ShaAnc = new String[] {""} ;
      P078313_n7033ShaAnc = new boolean[] {false} ;
      P078313_A7032ShaMal = new String[] {""} ;
      P078313_n7032ShaMal = new boolean[] {false} ;
      AV145PasDsc1 = "" ;
      AV93Obstxt = new String[10] ;
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV93Obstxt[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P078314_A396EmprCod = new String[] {""} ;
      P078314_A129BarCod = new int[1] ;
      P078314_A132BarCodReo = new byte[1] ;
      P078314_A130BarCodPar = new String[] {""} ;
      P078314_A758ProCod = new String[] {""} ;
      P078314_A759ProDsc = new String[] {""} ;
      P078315_A396EmprCod = new String[] {""} ;
      P078315_A129BarCod = new int[1] ;
      P078315_A132BarCodReo = new byte[1] ;
      P078315_A130BarCodPar = new String[] {""} ;
      P078315_A758ProCod = new String[] {""} ;
      P078315_A7744FasPreObl = new byte[1] ;
      P078315_n7744FasPreObl = new boolean[] {false} ;
      P078315_A361DisCod = new int[1] ;
      P078315_A603MaqCodBis = new String[] {""} ;
      P078315_A457FasCod = new String[] {""} ;
      P078315_A460FasDsc = new String[] {""} ;
      P078315_A194BarOrdLin = new short[1] ;
      A603MaqCodBis = "" ;
      A460FasDsc = "" ;
      AV32MaqCod = "" ;
      AV118ProCod = "" ;
      AV117FasCod = "" ;
      P078316_A396EmprCod = new String[] {""} ;
      P078316_A361DisCod = new int[1] ;
      P078316_A758ProCod = new String[] {""} ;
      P078316_A7744FasPreObl = new byte[1] ;
      P078316_n7744FasPreObl = new boolean[] {false} ;
      P078316_A368DisFasLin = new short[1] ;
      P078316_A457FasCod = new String[] {""} ;
      P078317_A7727ArtAdiCod = new short[1] ;
      P078317_A396EmprCod = new String[] {""} ;
      P078317_A361DisCod = new int[1] ;
      P078317_A758ProCod = new String[] {""} ;
      P078317_A368DisFasLin = new short[1] ;
      P078317_A7728ArtAdiDsc = new String[] {""} ;
      P078317_n7728ArtAdiDsc = new boolean[] {false} ;
      P078318_A396EmprCod = new String[] {""} ;
      P078318_A361DisCod = new int[1] ;
      P078318_A368DisFasLin = new short[1] ;
      P078318_A758ProCod = new String[] {""} ;
      P078318_A7740DisFasPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P078318_n7740DisFasPre = new boolean[] {false} ;
      P078318_A457FasCod = new String[] {""} ;
      P078319_A396EmprCod = new String[] {""} ;
      P078319_A361DisCod = new int[1] ;
      P078319_A758ProCod = new String[] {""} ;
      P078319_A368DisFasLin = new short[1] ;
      P078319_A7736ArtAdiPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P078319_n7736ArtAdiPre = new boolean[] {false} ;
      P078319_A7727ArtAdiCod = new short[1] ;
      A7736ArtAdiPre = DecimalUtil.ZERO ;
      P078320_A7727ArtAdiCod = new short[1] ;
      P078320_A396EmprCod = new String[] {""} ;
      P078320_A361DisCod = new int[1] ;
      P078320_A758ProCod = new String[] {""} ;
      P078320_A368DisFasLin = new short[1] ;
      P078320_A7736ArtAdiPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P078320_n7736ArtAdiPre = new boolean[] {false} ;
      P078320_A7728ArtAdiDsc = new String[] {""} ;
      P078320_n7728ArtAdiDsc = new boolean[] {false} ;
      AV165BarDibCli = "" ;
      P078321_A396EmprCod = new String[] {""} ;
      P078321_A130BarCodPar = new String[] {""} ;
      P078321_A132BarCodReo = new byte[1] ;
      P078321_A129BarCod = new int[1] ;
      P078321_A5104RecMolTotK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P078321_n5104RecMolTotK = new boolean[] {false} ;
      P078321_A2122RecEstTMaq = new String[] {""} ;
      P078321_n2122RecEstTMaq = new boolean[] {false} ;
      P078321_A9535RecMolCodC = new String[] {""} ;
      P078321_n9535RecMolCodC = new boolean[] {false} ;
      P078321_A2124RecMolCod = new byte[1] ;
      P078321_A1032FonCod = new String[] {""} ;
      P078321_A1056DisComCod = new String[] {""} ;
      P078321_A2524DisComLin = new byte[1] ;
      A5104RecMolTotK = DecimalUtil.ZERO ;
      A2122RecEstTMaq = "" ;
      A9535RecMolCodC = "" ;
      AV163MolPrcCob = DecimalUtil.ZERO ;
      GXt_decimal8 = DecimalUtil.ZERO ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_char6 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_char4 = new String[1] ;
      AV161EstColDsc = "" ;
      GXv_char10 = new String[1] ;
      GXv_int11 = new long[1] ;
      P078322_A396EmprCod = new String[] {""} ;
      P078322_A361DisCod = new int[1] ;
      P078322_A130BarCodPar = new String[] {""} ;
      P078322_A132BarCodReo = new byte[1] ;
      P078322_A129BarCod = new int[1] ;
      P078323_A396EmprCod = new String[] {""} ;
      P078323_A361DisCod = new int[1] ;
      P078323_A377DisObsTxt = new String[] {""} ;
      P078323_A376DisObsLin = new byte[1] ;
      A377DisObsTxt = "" ;
      P078324_A396EmprCod = new String[] {""} ;
      P078324_A365DisDes = new String[] {""} ;
      P078324_A125BarAncAca1 = new short[1] ;
      P078324_A130BarCodPar = new String[] {""} ;
      P078324_A132BarCodReo = new byte[1] ;
      P078324_A129BarCod = new int[1] ;
      AV65Pieza = new String[50] ;
      GX_I = 1 ;
      while ( GX_I <= 50 )
      {
         AV65Pieza[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV66KgsP = new java.math.BigDecimal[50] ;
      GX_I = 1 ;
      while ( GX_I <= 50 )
      {
         AV66KgsP[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV67MtsP = new java.math.BigDecimal[50] ;
      GX_I = 1 ;
      while ( GX_I <= 50 )
      {
         AV67MtsP[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV68AnchoP = new short[50] ;
      AV152Local = new String[50] ;
      GX_I = 1 ;
      while ( GX_I <= 50 )
      {
         AV152Local[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P078325_A396EmprCod = new String[] {""} ;
      P078325_A129BarCod = new int[1] ;
      P078325_A132BarCodReo = new byte[1] ;
      P078325_A130BarCodPar = new String[] {""} ;
      P078325_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P078325_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P078325_A2186BarPieLoc = new String[] {""} ;
      P078325_n2186BarPieLoc = new boolean[] {false} ;
      P078325_A200BarPieCod = new String[] {""} ;
      A203BarPieKil = DecimalUtil.ZERO ;
      A205BarPieMet = DecimalUtil.ZERO ;
      A2186BarPieLoc = "" ;
      A200BarPieCod = "" ;
      AV58BarPieCod = "" ;
      AV71Pieza1 = "" ;
      AV73Kgs1 = DecimalUtil.ZERO ;
      AV75Mts1 = DecimalUtil.ZERO ;
      AV121Col1 = "" ;
      AV120ColP = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV120ColP[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV153LOcal1 = "" ;
      AV72Pieza2 = "" ;
      AV74Kgs2 = DecimalUtil.ZERO ;
      AV76Mts2 = DecimalUtil.ZERO ;
      AV122Col2 = "" ;
      AV154LOcal2 = "" ;
      P078326_A396EmprCod = new String[] {""} ;
      P078326_A130BarCodPar = new String[] {""} ;
      P078326_A132BarCodReo = new byte[1] ;
      P078326_A129BarCod = new int[1] ;
      P078326_A44AlbRecCod = new int[1] ;
      P078326_A200BarPieCod = new String[] {""} ;
      P078326_A46AlbREnt = new String[] {""} ;
      P078326_A55AlbRReo = new String[] {""} ;
      A46AlbREnt = "" ;
      A55AlbRReo = "" ;
      P078327_A396EmprCod = new String[] {""} ;
      P078327_A130BarCodPar = new String[] {""} ;
      P078327_A132BarCodReo = new byte[1] ;
      P078327_A129BarCod = new int[1] ;
      P078327_A200BarPieCod = new String[] {""} ;
      P078327_A52AlbRPieEnt = new int[1] ;
      P078327_A50AlbRLoc = new String[] {""} ;
      P078327_A46AlbREnt = new String[] {""} ;
      P078327_A44AlbRecCod = new int[1] ;
      A50AlbRLoc = "" ;
      P078328_A396EmprCod = new String[] {""} ;
      P078328_A44AlbRecCod = new int[1] ;
      P078328_A1300AlbRObs = new String[] {""} ;
      P078328_A1299AlbRLin = new byte[1] ;
      A1300AlbRObs = "" ;
      AV30MaqDsc = "" ;
      P078329_A396EmprCod = new String[] {""} ;
      P078329_A602MaqCod = new String[] {""} ;
      P078329_A620MaqTip = new String[] {""} ;
      P078329_n620MaqTip = new boolean[] {false} ;
      P078329_A606MaqDsc = new String[] {""} ;
      P078329_n606MaqDsc = new boolean[] {false} ;
      A602MaqCod = "" ;
      A620MaqTip = "" ;
      A606MaqDsc = "" ;
      P078330_A396EmprCod = new String[] {""} ;
      P078330_A829TipArtCod = new short[1] ;
      P078330_A830TipArtDsc = new String[] {""} ;
      P078330_n830TipArtDsc = new boolean[] {false} ;
      A830TipArtDsc = "" ;
      P078331_A3072ArtObsLon = new String[] {""} ;
      P078331_n3072ArtObsLon = new boolean[] {false} ;
      P078331_A65ArtCod = new String[] {""} ;
      P078331_A252CliCod = new int[1] ;
      P078331_n252CliCod = new boolean[] {false} ;
      P078331_A396EmprCod = new String[] {""} ;
      A3072ArtObsLon = "" ;
      A65ArtCod = "" ;
      P078332_A396EmprCod = new String[] {""} ;
      P078332_A457FasCod = new String[] {""} ;
      P078332_A758ProCod = new String[] {""} ;
      P078332_A65ArtCod = new String[] {""} ;
      P078332_A252CliCod = new int[1] ;
      P078332_n252CliCod = new boolean[] {false} ;
      P078332_A1665ParFasDsc = new String[] {""} ;
      P078332_n1665ParFasDsc = new boolean[] {false} ;
      P078332_A1668ParFasVal = new String[] {""} ;
      P078332_A1673ParFasObs = new String[] {""} ;
      P078332_A1664ParFasCod = new short[1] ;
      A1665ParFasDsc = "" ;
      A1668ParFasVal = "" ;
      A1673ParFasObs = "" ;
      A3400DisRefBCPa = "" ;
      P078333_A396EmprCod = new String[] {""} ;
      P078333_A361DisCod = new int[1] ;
      P078333_A3400DisRefBCPa = new String[] {""} ;
      P078333_A3399DisRefBCRe = new byte[1] ;
      P078333_A3398DisRefBarC = new int[1] ;
      P078333_A3607DisRefBPie = new String[] {""} ;
      A3607DisRefBPie = "" ;
      AV159barcodpar1 = "" ;
      P078334_A396EmprCod = new String[] {""} ;
      P078334_A130BarCodPar = new String[] {""} ;
      P078334_A132BarCodReo = new byte[1] ;
      P078334_A129BarCod = new int[1] ;
      P078334_A30AlbProCod = new long[1] ;
      P078335_A396EmprCod = new String[] {""} ;
      P078335_A3607DisRefBPie = new String[] {""} ;
      P078335_A3398DisRefBarC = new int[1] ;
      P078335_A3399DisRefBCRe = new byte[1] ;
      P078335_A3400DisRefBCPa = new String[] {""} ;
      P078335_A361DisCod = new int[1] ;
      AV126DisRefBCP = "" ;
      P078336_A396EmprCod = new String[] {""} ;
      P078336_A130BarCodPar = new String[] {""} ;
      P078336_A132BarCodReo = new byte[1] ;
      P078336_A129BarCod = new int[1] ;
      P078336_A135BarColNom = new String[] {""} ;
      P078337_A583IntCod = new byte[1] ;
      P078337_A396EmprCod = new String[] {""} ;
      P078337_A831TipColCod = new byte[1] ;
      P078337_A483ForColNum = new int[1] ;
      P078337_A482ForColNom = new String[] {""} ;
      P078337_A494ForSer = new String[] {""} ;
      P078337_A252CliCod = new int[1] ;
      P078337_n252CliCod = new boolean[] {false} ;
      P078337_A584IntDsc = new String[] {""} ;
      P078337_n584IntDsc = new boolean[] {false} ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A584IntDsc = "" ;
      P078338_A781PrvCod = new short[1] ;
      P078338_A396EmprCod = new String[] {""} ;
      P078338_A252CliCod = new int[1] ;
      P078338_n252CliCod = new boolean[] {false} ;
      P078338_A787PrvDsc = new String[] {""} ;
      P078338_n787PrvDsc = new boolean[] {false} ;
      A787PrvDsc = "" ;
      P078339_A396EmprCod = new String[] {""} ;
      P078339_A130BarCodPar = new String[] {""} ;
      P078339_A132BarCodReo = new byte[1] ;
      P078339_A129BarCod = new int[1] ;
      P078339_A200BarPieCod = new String[] {""} ;
      P078339_A44AlbRecCod = new int[1] ;
      AV149AlbRecPie = "" ;
      c2155AlbRecKgm = DecimalUtil.ZERO ;
      c2157AlbRecMtr = DecimalUtil.ZERO ;
      P078340_A2155AlbRecKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P078340_A2157AlbRecMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P078340_AV146AlbDetPie = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rhdrart1__default(),
         new Object[] {
             new Object[] {
            P07833_A833TipDefCod, P07833_n833TipDefCod, P07833_A858ZonGeoCod, P07833_A396EmprCod, P07833_A361DisCod, P07833_A1014DibInt, P07833_n1014DibInt, P07833_A1013DibCli, P07833_n1013DibCli, P07833_A1823DibTipMaq,
            P07833_n1823DibTipMaq, P07833_A130BarCodPar, P07833_A132BarCodReo, P07833_A129BarCod, P07833_A1607DibMed, P07833_n1607DibMed, P07833_A1605DibLocal, P07833_n1605DibLocal, P07833_A1798BarDibCli, P07833_A252CliCod,
            P07833_n252CliCod, P07833_A212BarSer, P07833_A135BarColNom, P07833_A136BarColNum, P07833_A218BarTipCol, P07833_A148BarEstReo, P07833_A217BarTipArt, P07833_n217BarTipArt, P07833_A1431BarLocDis, P07833_A125BarAncAca1,
            P07833_A126BarAncAca2, P07833_A211BarRdt, P07833_A1909BarGraAca, P07833_A3307DisManCod1, P07833_A3308DisManCod2, P07833_A224BarTraP1, P07833_A225BarTraP2, P07833_A226BarTraP3, P07833_A232BarUrdP1, P07833_A233BarUrdP2,
            P07833_A234BarUrdP3, P07833_A4832BarAudFec, P07833_n4832BarAudFec, P07833_A159BarFecGen, P07833_A7523DisRec, P07833_A1360ZonGeoNom, P07833_n1360ZonGeoNom, P07833_A4348DisUsrCod, P07833_A834TipDefDsc, P07833_n834TipDefDsc,
            P07833_A177BarLar, P07833_A1235BarNumCli, P07833_A1234BarNomCli, P07833_A1606DibTipRas, P07833_n1606DibTipRas, P07833_A139BarCorOri, P07833_A206BarPle, P07833_A145BarEncOri, P07833_A1652BarSerDsc, P07833_A143BarDisNum,
            P07833_A9771DisItem1, P07833_A158BarFecFpr, P07833_A369DisFec, P07833_A231BarUrd3, P07833_A230BarUrd2, P07833_A229BarUrd1, P07833_A223BarTra3, P07833_A222BarTra2, P07833_A221BarTra1, P07833_A2010BarTipDis,
            P07833_A1799BarDibInt, P07833_A166BarKgm, P07833_A184BarMtr, P07833_A199BarPie1, P07833_A365DisDes, P07833_A898BarPieNDes
            }
            , new Object[] {
            P07834_A497FpgCod, P07834_A396EmprCod, P07834_A252CliCod, P07834_A498FpgDsc, P07834_n498FpgDsc, P07834_A297CliPri
            }
            , new Object[] {
            P07835_A396EmprCod, P07835_A129BarCod, P07835_A132BarCodReo, P07835_A130BarCodPar, P07835_A1056DisComCod, P07835_A1032FonCod, P07835_A2524DisComLin, P07835_A1543BarComPie, P07835_n1543BarComPie, P07835_A1541BarComMtr,
            P07835_n1541BarComMtr, P07835_A7734BarComObs, P07835_n7734BarComObs
            }
            , new Object[] {
            P07836_A396EmprCod, P07836_A1013DibCli, P07836_A252CliCod, P07836_A1014DibInt, P07836_A7507DibOrgLin, P07836_n7507DibOrgLin, P07836_A7505DibOrgInt, P07836_n7505DibOrgInt, P07836_A7506DibOrgCli, P07836_n7506DibOrgCli,
            P07836_A1809DibOrdMol, P07836_n1809DibOrdMol, P07836_A6839DibMolCod, P07836_n6839DibMolCod, P07836_A2092DibRelMC2, P07836_n2092DibRelMC2, P07836_A5381DibPrcCobM, P07836_n5381DibPrcCobM, P07836_A1029DibLin
            }
            , new Object[] {
            P07837_A396EmprCod, P07837_A252CliCod, P07837_A1013DibCli, P07837_A1014DibInt, P07837_A2098MolCod, P07837_A2074ColCom, P07837_A2141SerEst, P07837_A2078ColFon, P07837_A2648MolForEst, P07837_n2648MolForEst
            }
            , new Object[] {
            P07838_A396EmprCod, P07838_A252CliCod, P07838_A2141SerEst, P07838_A1013DibCli, P07838_A1014DibInt, P07838_A2074ColCom, P07838_A2078ColFon, P07838_A2098MolCod, P07838_A2107PasCod, P07838_n2107PasCod,
            P07838_A2654PasForLin
            }
            , new Object[] {
            P07839_A396EmprCod, P07839_A7036ShaGrb, P07839_n7036ShaGrb, P07839_A7043ShaOrd, P07839_n7043ShaOrd, P07839_A7042ShaDibInt, P07839_A7041ShaDibCli, P07839_A7031ShaCod, P07839_A7034ShaGal, P07839_n7034ShaGal,
            P07839_A7035ShaUbi, P07839_n7035ShaUbi, P07839_A7033ShaAnc, P07839_n7033ShaAnc, P07839_A7032ShaMal, P07839_n7032ShaMal
            }
            , new Object[] {
            P078310_A396EmprCod, P078310_A1013DibCli, P078310_A252CliCod, P078310_A1014DibInt, P078310_A10510DibOrgLi, P078310_n10510DibOrgLi, P078310_A10508DibOrgIn, P078310_n10508DibOrgIn, P078310_A10509DibOrgCl, P078310_n10509DibOrgCl,
            P078310_A1808DibOrdCil, P078310_n1808DibOrdCil, P078310_A1030DibRelMC, P078310_n1030DibRelMC, P078310_A4860DibPrcCob, P078310_n4860DibPrcCob, P078310_A1807DibLinCil
            }
            , new Object[] {
            P078311_A396EmprCod, P078311_A252CliCod, P078311_A1013DibCli, P078311_A1014DibInt, P078311_A2098MolCod, P078311_A2074ColCom, P078311_A2141SerEst, P078311_A2078ColFon, P078311_A2648MolForEst, P078311_n2648MolForEst
            }
            , new Object[] {
            P078312_A396EmprCod, P078312_A252CliCod, P078312_A2141SerEst, P078312_A1013DibCli, P078312_A1014DibInt, P078312_A2074ColCom, P078312_A2078ColFon, P078312_A2098MolCod, P078312_A2107PasCod, P078312_n2107PasCod,
            P078312_A2654PasForLin
            }
            , new Object[] {
            P078313_A396EmprCod, P078313_A7036ShaGrb, P078313_n7036ShaGrb, P078313_A7043ShaOrd, P078313_n7043ShaOrd, P078313_A7042ShaDibInt, P078313_A7041ShaDibCli, P078313_A7031ShaCod, P078313_A7034ShaGal, P078313_n7034ShaGal,
            P078313_A7035ShaUbi, P078313_n7035ShaUbi, P078313_A7033ShaAnc, P078313_n7033ShaAnc, P078313_A7032ShaMal, P078313_n7032ShaMal
            }
            , new Object[] {
            P078314_A396EmprCod, P078314_A129BarCod, P078314_A132BarCodReo, P078314_A130BarCodPar, P078314_A758ProCod, P078314_A759ProDsc
            }
            , new Object[] {
            P078315_A396EmprCod, P078315_A129BarCod, P078315_A132BarCodReo, P078315_A130BarCodPar, P078315_A758ProCod, P078315_A7744FasPreObl, P078315_n7744FasPreObl, P078315_A361DisCod, P078315_A603MaqCodBis, P078315_A457FasCod,
            P078315_A460FasDsc, P078315_A194BarOrdLin
            }
            , new Object[] {
            P078316_A396EmprCod, P078316_A361DisCod, P078316_A758ProCod, P078316_A7744FasPreObl, P078316_n7744FasPreObl, P078316_A368DisFasLin, P078316_A457FasCod
            }
            , new Object[] {
            P078317_A7727ArtAdiCod, P078317_A396EmprCod, P078317_A361DisCod, P078317_A758ProCod, P078317_A368DisFasLin, P078317_A7728ArtAdiDsc, P078317_n7728ArtAdiDsc
            }
            , new Object[] {
            P078318_A396EmprCod, P078318_A361DisCod, P078318_A368DisFasLin, P078318_A758ProCod, P078318_A7740DisFasPre, P078318_n7740DisFasPre, P078318_A457FasCod
            }
            , new Object[] {
            P078319_A396EmprCod, P078319_A361DisCod, P078319_A758ProCod, P078319_A368DisFasLin, P078319_A7736ArtAdiPre, P078319_n7736ArtAdiPre, P078319_A7727ArtAdiCod
            }
            , new Object[] {
            P078320_A7727ArtAdiCod, P078320_A396EmprCod, P078320_A361DisCod, P078320_A758ProCod, P078320_A368DisFasLin, P078320_A7736ArtAdiPre, P078320_n7736ArtAdiPre, P078320_A7728ArtAdiDsc, P078320_n7728ArtAdiDsc
            }
            , new Object[] {
            P078321_A396EmprCod, P078321_A130BarCodPar, P078321_A132BarCodReo, P078321_A129BarCod, P078321_A5104RecMolTotK, P078321_n5104RecMolTotK, P078321_A2122RecEstTMaq, P078321_n2122RecEstTMaq, P078321_A9535RecMolCodC, P078321_n9535RecMolCodC,
            P078321_A2124RecMolCod, P078321_A1032FonCod, P078321_A1056DisComCod, P078321_A2524DisComLin
            }
            , new Object[] {
            P078322_A396EmprCod, P078322_A361DisCod, P078322_A130BarCodPar, P078322_A132BarCodReo, P078322_A129BarCod
            }
            , new Object[] {
            P078323_A396EmprCod, P078323_A361DisCod, P078323_A377DisObsTxt, P078323_A376DisObsLin
            }
            , new Object[] {
            P078324_A396EmprCod, P078324_A365DisDes, P078324_A125BarAncAca1, P078324_A130BarCodPar, P078324_A132BarCodReo, P078324_A129BarCod
            }
            , new Object[] {
            P078325_A396EmprCod, P078325_A129BarCod, P078325_A132BarCodReo, P078325_A130BarCodPar, P078325_A203BarPieKil, P078325_A205BarPieMet, P078325_A2186BarPieLoc, P078325_n2186BarPieLoc, P078325_A200BarPieCod
            }
            , new Object[] {
            P078326_A396EmprCod, P078326_A130BarCodPar, P078326_A132BarCodReo, P078326_A129BarCod, P078326_A44AlbRecCod, P078326_A200BarPieCod, P078326_A46AlbREnt, P078326_A55AlbRReo
            }
            , new Object[] {
            P078327_A396EmprCod, P078327_A130BarCodPar, P078327_A132BarCodReo, P078327_A129BarCod, P078327_A200BarPieCod, P078327_A52AlbRPieEnt, P078327_A50AlbRLoc, P078327_A46AlbREnt, P078327_A44AlbRecCod
            }
            , new Object[] {
            P078328_A396EmprCod, P078328_A44AlbRecCod, P078328_A1300AlbRObs, P078328_A1299AlbRLin
            }
            , new Object[] {
            P078329_A396EmprCod, P078329_A602MaqCod, P078329_A620MaqTip, P078329_n620MaqTip, P078329_A606MaqDsc, P078329_n606MaqDsc
            }
            , new Object[] {
            P078330_A396EmprCod, P078330_A829TipArtCod, P078330_A830TipArtDsc, P078330_n830TipArtDsc
            }
            , new Object[] {
            P078331_A3072ArtObsLon, P078331_n3072ArtObsLon, P078331_A65ArtCod, P078331_A252CliCod, P078331_A396EmprCod
            }
            , new Object[] {
            P078332_A396EmprCod, P078332_A457FasCod, P078332_A758ProCod, P078332_A65ArtCod, P078332_A252CliCod, P078332_A1665ParFasDsc, P078332_n1665ParFasDsc, P078332_A1668ParFasVal, P078332_A1673ParFasObs, P078332_A1664ParFasCod
            }
            , new Object[] {
            P078333_A396EmprCod, P078333_A361DisCod, P078333_A3400DisRefBCPa, P078333_A3399DisRefBCRe, P078333_A3398DisRefBarC, P078333_A3607DisRefBPie
            }
            , new Object[] {
            P078334_A396EmprCod, P078334_A130BarCodPar, P078334_A132BarCodReo, P078334_A129BarCod, P078334_A30AlbProCod
            }
            , new Object[] {
            P078335_A396EmprCod, P078335_A3607DisRefBPie, P078335_A3398DisRefBarC, P078335_A3399DisRefBCRe, P078335_A3400DisRefBCPa, P078335_A361DisCod
            }
            , new Object[] {
            P078336_A396EmprCod, P078336_A130BarCodPar, P078336_A132BarCodReo, P078336_A129BarCod, P078336_A135BarColNom
            }
            , new Object[] {
            P078337_A583IntCod, P078337_A396EmprCod, P078337_A831TipColCod, P078337_A483ForColNum, P078337_A482ForColNom, P078337_A494ForSer, P078337_A252CliCod, P078337_A584IntDsc, P078337_n584IntDsc
            }
            , new Object[] {
            P078338_A781PrvCod, P078338_A396EmprCod, P078338_A252CliCod, P078338_A787PrvDsc, P078338_n787PrvDsc
            }
            , new Object[] {
            P078339_A396EmprCod, P078339_A130BarCodPar, P078339_A132BarCodReo, P078339_A129BarCod, P078339_A200BarPieCod, P078339_A44AlbRecCod
            }
            , new Object[] {
            P078340_A2155AlbRecKgm, P078340_A2157AlbRecMtr, P078340_AV146AlbDetPie
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte AV128BarCodReo ;
   private byte AV155detalle ;
   private byte GXt_int1 ;
   private byte A132BarCodReo ;
   private byte A218BarTipCol ;
   private byte A148BarEstReo ;
   private byte GXv_int2[] ;
   private byte AV89LenVar ;
   private byte AV59TipColCod ;
   private byte AV172GXLvl124 ;
   private byte A2524DisComLin ;
   private byte A1809DibOrdMol ;
   private byte A2098MolCod ;
   private byte AV176GXLvl163 ;
   private byte A7043ShaOrd ;
   private byte A1808DibOrdCil ;
   private byte AV180GXLvl196 ;
   private byte AV69i ;
   private byte A7744FasPreObl ;
   private byte AV192GXLvl254 ;
   private byte AV193Ok ;
   private byte AV194GXLvl263 ;
   private byte AV164InicioCilMod ;
   private byte A2124RecMolCod ;
   private byte AV90FlagObs ;
   private byte A376DisObsLin ;
   private byte AV81Npiezas ;
   private byte AV70t ;
   private byte AV82p ;
   private byte AV54Linea2 ;
   private byte AV83i1 ;
   private byte AV84t2 ;
   private byte A1299AlbRLin ;
   private byte A3399DisRefBCRe ;
   private byte AV211GXLvl522 ;
   private byte AV158barcodreo1 ;
   private byte AV125DisRefBCR ;
   private byte A583IntCod ;
   private byte A831TipColCod ;
   private short A833TipDefCod ;
   private short A858ZonGeoCod ;
   private short A217BarTipArt ;
   private short A125BarAncAca1 ;
   private short A126BarAncAca2 ;
   private short A1909BarGraAca ;
   private short A3307DisManCod1 ;
   private short A3308DisManCod2 ;
   private short A224BarTraP1 ;
   private short A225BarTraP2 ;
   private short A226BarTraP3 ;
   private short A232BarUrdP1 ;
   private short A233BarUrdP2 ;
   private short A234BarUrdP3 ;
   private short A199BarPie1 ;
   private short AV63TipArtCod ;
   private short AV105BarGraAca ;
   private short AV146AlbDetPie ;
   private short A1543BarComPie ;
   private short A7507DibOrgLin ;
   private short A1029DibLin ;
   private short A2654PasForLin ;
   private short A10510DibOrgLi ;
   private short A1807DibLinCil ;
   private short A194BarOrdLin ;
   private short A368DisFasLin ;
   private short A7727ArtAdiCod ;
   private short AV68AnchoP[] ;
   private short AV77Anc1 ;
   private short AV78Anc2 ;
   private short A829TipArtCod ;
   private short AV91Nlin ;
   private short AV92j ;
   private short AV94z ;
   private short A1664ParFasCod ;
   private short A781PrvCod ;
   private short cV146AlbDetPie ;
   private short Gx_err ;
   private int AV127BarCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A1799BarDibInt ;
   private int A361DisCod ;
   private int A1014DibInt ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A1235BarNumCli ;
   private int A898BarPieNDes ;
   private int A198BarPie ;
   private int AV96MacCod ;
   private int GXv_int5[] ;
   private int AV36CliCod ;
   private int AV40ForColNum ;
   private int AV60DisCod ;
   private int Gx_OldLine ;
   private int A7505DibOrgInt ;
   private int A7042ShaDibInt ;
   private int A10508DibOrgIn ;
   private int AV181Saveline ;
   private int AV183Savepage ;
   private int AV189Saveline2 ;
   private int AV190Savepage2 ;
   private int AV166BarDibInt ;
   private int GXv_int7[] ;
   private int GX_I ;
   private int A44AlbRecCod ;
   private int A52AlbRPieEnt ;
   private int A3398DisRefBarC ;
   private int AV157Barcod1 ;
   private int AV124DisRefBarC ;
   private int A483ForColNum ;
   private int AV150AlbRecCod ;
   private long AV143TotPas ;
   private long AV144k ;
   private long AV162EstColRGB ;
   private long GXv_int11[] ;
   private long A30AlbProCod ;
   private java.math.BigDecimal A7740DisFasPre ;
   private java.math.BigDecimal A211BarRdt ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal AV147AlbDetKgm ;
   private java.math.BigDecimal AV148AlbDetMtr ;
   private java.math.BigDecimal A1541BarComMtr ;
   private java.math.BigDecimal A5381DibPrcCobM ;
   private java.math.BigDecimal A4860DibPrcCob ;
   private java.math.BigDecimal A7736ArtAdiPre ;
   private java.math.BigDecimal A5104RecMolTotK ;
   private java.math.BigDecimal AV163MolPrcCob ;
   private java.math.BigDecimal GXt_decimal8 ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal AV66KgsP[] ;
   private java.math.BigDecimal AV67MtsP[] ;
   private java.math.BigDecimal A203BarPieKil ;
   private java.math.BigDecimal A205BarPieMet ;
   private java.math.BigDecimal AV73Kgs1 ;
   private java.math.BigDecimal AV75Mts1 ;
   private java.math.BigDecimal AV74Kgs2 ;
   private java.math.BigDecimal AV76Mts2 ;
   private java.math.BigDecimal c2155AlbRecKgm ;
   private java.math.BigDecimal c2157AlbRecMtr ;
   private String A396EmprCod ;
   private String AV129BarCodPar ;
   private String Gx_out ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A758ProCod ;
   private String A759ProDsc ;
   private String A457FasCod ;
   private String A7728ArtAdiDsc ;
   private String A1798BarDibCli ;
   private String scmdbuf ;
   private String A1013DibCli ;
   private String A1823DibTipMaq ;
   private String A130BarCodPar ;
   private String A1607DibMed ;
   private String A1605DibLocal ;
   private String A212BarSer ;
   private String A1431BarLocDis ;
   private String A7523DisRec ;
   private String A1360ZonGeoNom ;
   private String A4348DisUsrCod ;
   private String A834TipDefDsc ;
   private String A177BarLar ;
   private String A1606DibTipRas ;
   private String A139BarCorOri ;
   private String A206BarPle ;
   private String A145BarEncOri ;
   private String A1652BarSerDsc ;
   private String A143BarDisNum ;
   private String A9771DisItem1 ;
   private String A231BarUrd3 ;
   private String A230BarUrd2 ;
   private String A229BarUrd1 ;
   private String A223BarTra3 ;
   private String A222BarTra2 ;
   private String A221BarTra1 ;
   private String A2010BarTipDis ;
   private String A365DisDes ;
   private String AV151Fpdsc ;
   private String A497FpgCod ;
   private String A498FpgDsc ;
   private String A297CliPri ;
   private String AV137CliNom ;
   private String GXt_char3 ;
   private String AV97HdrA[] ;
   private String AV131HdrAgr[] ;
   private String AV133BarLocDis[] ;
   private String AV35HojRut ;
   private String AV87Ceros8 ;
   private String AV88HdrAlfa ;
   private String AV86Hdr ;
   private String AV34BarSer ;
   private String AV31EmprCod ;
   private String AV39ForColNom ;
   private String AV62TextoReop ;
   private String AV79BarSer9 ;
   private String AV130ReoTxt ;
   private String AV119AlbRLocs ;
   private String AV99BarAncAca1 ;
   private String AV100BarAncAca2 ;
   private String AV104Comma ;
   private String AV101BarRdt ;
   private String AV102BarKgm ;
   private String AV106BarMtr ;
   private String AV103BarPie ;
   private String AV135Estampar ;
   private String AV134Colorido ;
   private String AV107BarTraP1 ;
   private String AV108BarTraP2 ;
   private String AV109BarTraP3 ;
   private String AV110BarUrdP1 ;
   private String AV111BarUrdP2 ;
   private String AV112BarUrdP3 ;
   private String AV113Porc[] ;
   private String AV64TipARtDsc ;
   private String AV116AlbREnts ;
   private String AV115AlbRecs ;
   private String AV123HDRs ;
   private String AV29IntDsc ;
   private String AV136PrvDsc ;
   private String AV156Remitos ;
   private String AV140SerEst ;
   private String A1056DisComCod ;
   private String A1032FonCod ;
   private String A7734BarComObs ;
   private String AV138DisComCod ;
   private String AV139FonCod ;
   private String A7506DibOrgCli ;
   private String A6839DibMolCod ;
   private String A2092DibRelMC2 ;
   private String A2074ColCom ;
   private String A2141SerEst ;
   private String A2078ColFon ;
   private String A2648MolForEst ;
   private String AV141MolForEst ;
   private String A2107PasCod ;
   private String AV142PasDsc[] ;
   private String A7036ShaGrb ;
   private String A7041ShaDibCli ;
   private String A7031ShaCod ;
   private String A7034ShaGal ;
   private String A7035ShaUbi ;
   private String A7033ShaAnc ;
   private String A7032ShaMal ;
   private String A10509DibOrgCl ;
   private String A1030DibRelMC ;
   private String AV145PasDsc1 ;
   private String AV93Obstxt[] ;
   private String A603MaqCodBis ;
   private String A460FasDsc ;
   private String AV32MaqCod ;
   private String AV118ProCod ;
   private String AV117FasCod ;
   private String AV165BarDibCli ;
   private String A2122RecEstTMaq ;
   private String A9535RecMolCodC ;
   private String GXv_char6[] ;
   private String GXv_char4[] ;
   private String AV161EstColDsc ;
   private String GXv_char10[] ;
   private String A377DisObsTxt ;
   private String AV65Pieza[] ;
   private String AV152Local[] ;
   private String A2186BarPieLoc ;
   private String A200BarPieCod ;
   private String AV58BarPieCod ;
   private String AV71Pieza1 ;
   private String AV121Col1 ;
   private String AV120ColP[] ;
   private String AV153LOcal1 ;
   private String AV72Pieza2 ;
   private String AV122Col2 ;
   private String AV154LOcal2 ;
   private String A46AlbREnt ;
   private String A55AlbRReo ;
   private String A50AlbRLoc ;
   private String A1300AlbRObs ;
   private String AV30MaqDsc ;
   private String A602MaqCod ;
   private String A620MaqTip ;
   private String A606MaqDsc ;
   private String A830TipArtDsc ;
   private String A65ArtCod ;
   private String A1665ParFasDsc ;
   private String A1668ParFasVal ;
   private String A1673ParFasObs ;
   private String A3400DisRefBCPa ;
   private String A3607DisRefBPie ;
   private String AV159barcodpar1 ;
   private String AV126DisRefBCP ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A584IntDsc ;
   private String A787PrvDsc ;
   private String AV149AlbRecPie ;
   private java.util.Date A4832BarAudFec ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date A158BarFecFpr ;
   private java.util.Date A369DisFec ;
   private boolean returnInSub ;
   private boolean n833TipDefCod ;
   private boolean n1014DibInt ;
   private boolean n1013DibCli ;
   private boolean n1823DibTipMaq ;
   private boolean n1607DibMed ;
   private boolean n1605DibLocal ;
   private boolean n252CliCod ;
   private boolean n217BarTipArt ;
   private boolean n4832BarAudFec ;
   private boolean n1360ZonGeoNom ;
   private boolean n834TipDefDsc ;
   private boolean n1606DibTipRas ;
   private boolean n498FpgDsc ;
   private boolean n1543BarComPie ;
   private boolean n1541BarComMtr ;
   private boolean n7734BarComObs ;
   private boolean n7507DibOrgLin ;
   private boolean n7505DibOrgInt ;
   private boolean n7506DibOrgCli ;
   private boolean n1809DibOrdMol ;
   private boolean n6839DibMolCod ;
   private boolean n2092DibRelMC2 ;
   private boolean n5381DibPrcCobM ;
   private boolean n2648MolForEst ;
   private boolean n2107PasCod ;
   private boolean Cond_result ;
   private boolean n7036ShaGrb ;
   private boolean n7043ShaOrd ;
   private boolean n7034ShaGal ;
   private boolean n7035ShaUbi ;
   private boolean n7033ShaAnc ;
   private boolean n7032ShaMal ;
   private boolean n10510DibOrgLi ;
   private boolean n10508DibOrgIn ;
   private boolean n10509DibOrgCl ;
   private boolean n1808DibOrdCil ;
   private boolean n1030DibRelMC ;
   private boolean n4860DibPrcCob ;
   private boolean n7744FasPreObl ;
   private boolean n7728ArtAdiDsc ;
   private boolean n7740DisFasPre ;
   private boolean n7736ArtAdiPre ;
   private boolean n5104RecMolTotK ;
   private boolean n2122RecEstTMaq ;
   private boolean n9535RecMolCodC ;
   private boolean brk78322 ;
   private boolean n2186BarPieLoc ;
   private boolean brk78326 ;
   private boolean brk78328 ;
   private boolean n620MaqTip ;
   private boolean n606MaqDsc ;
   private boolean n830TipArtDsc ;
   private boolean n3072ArtObsLon ;
   private boolean n1665ParFasDsc ;
   private boolean brk78336 ;
   private boolean n584IntDsc ;
   private boolean n787PrvDsc ;
   private String A3072ArtObsLon ;
   private String[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private short[] P07833_A833TipDefCod ;
   private boolean[] P07833_n833TipDefCod ;
   private short[] P07833_A858ZonGeoCod ;
   private String[] P07833_A396EmprCod ;
   private int[] P07833_A361DisCod ;
   private int[] P07833_A1014DibInt ;
   private boolean[] P07833_n1014DibInt ;
   private String[] P07833_A1013DibCli ;
   private boolean[] P07833_n1013DibCli ;
   private String[] P07833_A1823DibTipMaq ;
   private boolean[] P07833_n1823DibTipMaq ;
   private String[] P07833_A130BarCodPar ;
   private byte[] P07833_A132BarCodReo ;
   private int[] P07833_A129BarCod ;
   private String[] P07833_A1607DibMed ;
   private boolean[] P07833_n1607DibMed ;
   private String[] P07833_A1605DibLocal ;
   private boolean[] P07833_n1605DibLocal ;
   private String[] P07833_A1798BarDibCli ;
   private int[] P07833_A252CliCod ;
   private boolean[] P07833_n252CliCod ;
   private String[] P07833_A212BarSer ;
   private String[] P07833_A135BarColNom ;
   private int[] P07833_A136BarColNum ;
   private byte[] P07833_A218BarTipCol ;
   private byte[] P07833_A148BarEstReo ;
   private short[] P07833_A217BarTipArt ;
   private boolean[] P07833_n217BarTipArt ;
   private String[] P07833_A1431BarLocDis ;
   private short[] P07833_A125BarAncAca1 ;
   private short[] P07833_A126BarAncAca2 ;
   private java.math.BigDecimal[] P07833_A211BarRdt ;
   private short[] P07833_A1909BarGraAca ;
   private short[] P07833_A3307DisManCod1 ;
   private short[] P07833_A3308DisManCod2 ;
   private short[] P07833_A224BarTraP1 ;
   private short[] P07833_A225BarTraP2 ;
   private short[] P07833_A226BarTraP3 ;
   private short[] P07833_A232BarUrdP1 ;
   private short[] P07833_A233BarUrdP2 ;
   private short[] P07833_A234BarUrdP3 ;
   private java.util.Date[] P07833_A4832BarAudFec ;
   private boolean[] P07833_n4832BarAudFec ;
   private java.util.Date[] P07833_A159BarFecGen ;
   private String[] P07833_A7523DisRec ;
   private String[] P07833_A1360ZonGeoNom ;
   private boolean[] P07833_n1360ZonGeoNom ;
   private String[] P07833_A4348DisUsrCod ;
   private String[] P07833_A834TipDefDsc ;
   private boolean[] P07833_n834TipDefDsc ;
   private String[] P07833_A177BarLar ;
   private int[] P07833_A1235BarNumCli ;
   private String[] P07833_A1234BarNomCli ;
   private String[] P07833_A1606DibTipRas ;
   private boolean[] P07833_n1606DibTipRas ;
   private String[] P07833_A139BarCorOri ;
   private String[] P07833_A206BarPle ;
   private String[] P07833_A145BarEncOri ;
   private String[] P07833_A1652BarSerDsc ;
   private String[] P07833_A143BarDisNum ;
   private String[] P07833_A9771DisItem1 ;
   private java.util.Date[] P07833_A158BarFecFpr ;
   private java.util.Date[] P07833_A369DisFec ;
   private String[] P07833_A231BarUrd3 ;
   private String[] P07833_A230BarUrd2 ;
   private String[] P07833_A229BarUrd1 ;
   private String[] P07833_A223BarTra3 ;
   private String[] P07833_A222BarTra2 ;
   private String[] P07833_A221BarTra1 ;
   private String[] P07833_A2010BarTipDis ;
   private int[] P07833_A1799BarDibInt ;
   private java.math.BigDecimal[] P07833_A166BarKgm ;
   private java.math.BigDecimal[] P07833_A184BarMtr ;
   private short[] P07833_A199BarPie1 ;
   private String[] P07833_A365DisDes ;
   private int[] P07833_A898BarPieNDes ;
   private String[] P07834_A497FpgCod ;
   private String[] P07834_A396EmprCod ;
   private int[] P07834_A252CliCod ;
   private boolean[] P07834_n252CliCod ;
   private String[] P07834_A498FpgDsc ;
   private boolean[] P07834_n498FpgDsc ;
   private String[] P07834_A297CliPri ;
   private String[] P07835_A396EmprCod ;
   private int[] P07835_A129BarCod ;
   private byte[] P07835_A132BarCodReo ;
   private String[] P07835_A130BarCodPar ;
   private String[] P07835_A1056DisComCod ;
   private String[] P07835_A1032FonCod ;
   private byte[] P07835_A2524DisComLin ;
   private short[] P07835_A1543BarComPie ;
   private boolean[] P07835_n1543BarComPie ;
   private java.math.BigDecimal[] P07835_A1541BarComMtr ;
   private boolean[] P07835_n1541BarComMtr ;
   private String[] P07835_A7734BarComObs ;
   private boolean[] P07835_n7734BarComObs ;
   private String[] P07836_A396EmprCod ;
   private String[] P07836_A1013DibCli ;
   private boolean[] P07836_n1013DibCli ;
   private int[] P07836_A252CliCod ;
   private boolean[] P07836_n252CliCod ;
   private int[] P07836_A1014DibInt ;
   private boolean[] P07836_n1014DibInt ;
   private short[] P07836_A7507DibOrgLin ;
   private boolean[] P07836_n7507DibOrgLin ;
   private int[] P07836_A7505DibOrgInt ;
   private boolean[] P07836_n7505DibOrgInt ;
   private String[] P07836_A7506DibOrgCli ;
   private boolean[] P07836_n7506DibOrgCli ;
   private byte[] P07836_A1809DibOrdMol ;
   private boolean[] P07836_n1809DibOrdMol ;
   private String[] P07836_A6839DibMolCod ;
   private boolean[] P07836_n6839DibMolCod ;
   private String[] P07836_A2092DibRelMC2 ;
   private boolean[] P07836_n2092DibRelMC2 ;
   private java.math.BigDecimal[] P07836_A5381DibPrcCobM ;
   private boolean[] P07836_n5381DibPrcCobM ;
   private short[] P07836_A1029DibLin ;
   private String[] P07837_A396EmprCod ;
   private int[] P07837_A252CliCod ;
   private boolean[] P07837_n252CliCod ;
   private String[] P07837_A1013DibCli ;
   private boolean[] P07837_n1013DibCli ;
   private int[] P07837_A1014DibInt ;
   private boolean[] P07837_n1014DibInt ;
   private byte[] P07837_A2098MolCod ;
   private String[] P07837_A2074ColCom ;
   private String[] P07837_A2141SerEst ;
   private String[] P07837_A2078ColFon ;
   private String[] P07837_A2648MolForEst ;
   private boolean[] P07837_n2648MolForEst ;
   private String[] P07838_A396EmprCod ;
   private int[] P07838_A252CliCod ;
   private boolean[] P07838_n252CliCod ;
   private String[] P07838_A2141SerEst ;
   private String[] P07838_A1013DibCli ;
   private boolean[] P07838_n1013DibCli ;
   private int[] P07838_A1014DibInt ;
   private boolean[] P07838_n1014DibInt ;
   private String[] P07838_A2074ColCom ;
   private String[] P07838_A2078ColFon ;
   private byte[] P07838_A2098MolCod ;
   private String[] P07838_A2107PasCod ;
   private boolean[] P07838_n2107PasCod ;
   private short[] P07838_A2654PasForLin ;
   private String[] P07839_A396EmprCod ;
   private String[] P07839_A7036ShaGrb ;
   private boolean[] P07839_n7036ShaGrb ;
   private byte[] P07839_A7043ShaOrd ;
   private boolean[] P07839_n7043ShaOrd ;
   private int[] P07839_A7042ShaDibInt ;
   private String[] P07839_A7041ShaDibCli ;
   private String[] P07839_A7031ShaCod ;
   private String[] P07839_A7034ShaGal ;
   private boolean[] P07839_n7034ShaGal ;
   private String[] P07839_A7035ShaUbi ;
   private boolean[] P07839_n7035ShaUbi ;
   private String[] P07839_A7033ShaAnc ;
   private boolean[] P07839_n7033ShaAnc ;
   private String[] P07839_A7032ShaMal ;
   private boolean[] P07839_n7032ShaMal ;
   private String[] P078310_A396EmprCod ;
   private String[] P078310_A1013DibCli ;
   private boolean[] P078310_n1013DibCli ;
   private int[] P078310_A252CliCod ;
   private boolean[] P078310_n252CliCod ;
   private int[] P078310_A1014DibInt ;
   private boolean[] P078310_n1014DibInt ;
   private short[] P078310_A10510DibOrgLi ;
   private boolean[] P078310_n10510DibOrgLi ;
   private int[] P078310_A10508DibOrgIn ;
   private boolean[] P078310_n10508DibOrgIn ;
   private String[] P078310_A10509DibOrgCl ;
   private boolean[] P078310_n10509DibOrgCl ;
   private byte[] P078310_A1808DibOrdCil ;
   private boolean[] P078310_n1808DibOrdCil ;
   private String[] P078310_A1030DibRelMC ;
   private boolean[] P078310_n1030DibRelMC ;
   private java.math.BigDecimal[] P078310_A4860DibPrcCob ;
   private boolean[] P078310_n4860DibPrcCob ;
   private short[] P078310_A1807DibLinCil ;
   private String[] P078311_A396EmprCod ;
   private int[] P078311_A252CliCod ;
   private boolean[] P078311_n252CliCod ;
   private String[] P078311_A1013DibCli ;
   private boolean[] P078311_n1013DibCli ;
   private int[] P078311_A1014DibInt ;
   private boolean[] P078311_n1014DibInt ;
   private byte[] P078311_A2098MolCod ;
   private String[] P078311_A2074ColCom ;
   private String[] P078311_A2141SerEst ;
   private String[] P078311_A2078ColFon ;
   private String[] P078311_A2648MolForEst ;
   private boolean[] P078311_n2648MolForEst ;
   private String[] P078312_A396EmprCod ;
   private int[] P078312_A252CliCod ;
   private boolean[] P078312_n252CliCod ;
   private String[] P078312_A2141SerEst ;
   private String[] P078312_A1013DibCli ;
   private boolean[] P078312_n1013DibCli ;
   private int[] P078312_A1014DibInt ;
   private boolean[] P078312_n1014DibInt ;
   private String[] P078312_A2074ColCom ;
   private String[] P078312_A2078ColFon ;
   private byte[] P078312_A2098MolCod ;
   private String[] P078312_A2107PasCod ;
   private boolean[] P078312_n2107PasCod ;
   private short[] P078312_A2654PasForLin ;
   private String[] P078313_A396EmprCod ;
   private String[] P078313_A7036ShaGrb ;
   private boolean[] P078313_n7036ShaGrb ;
   private byte[] P078313_A7043ShaOrd ;
   private boolean[] P078313_n7043ShaOrd ;
   private int[] P078313_A7042ShaDibInt ;
   private String[] P078313_A7041ShaDibCli ;
   private String[] P078313_A7031ShaCod ;
   private String[] P078313_A7034ShaGal ;
   private boolean[] P078313_n7034ShaGal ;
   private String[] P078313_A7035ShaUbi ;
   private boolean[] P078313_n7035ShaUbi ;
   private String[] P078313_A7033ShaAnc ;
   private boolean[] P078313_n7033ShaAnc ;
   private String[] P078313_A7032ShaMal ;
   private boolean[] P078313_n7032ShaMal ;
   private String[] P078314_A396EmprCod ;
   private int[] P078314_A129BarCod ;
   private byte[] P078314_A132BarCodReo ;
   private String[] P078314_A130BarCodPar ;
   private String[] P078314_A758ProCod ;
   private String[] P078314_A759ProDsc ;
   private String[] P078315_A396EmprCod ;
   private int[] P078315_A129BarCod ;
   private byte[] P078315_A132BarCodReo ;
   private String[] P078315_A130BarCodPar ;
   private String[] P078315_A758ProCod ;
   private byte[] P078315_A7744FasPreObl ;
   private boolean[] P078315_n7744FasPreObl ;
   private int[] P078315_A361DisCod ;
   private String[] P078315_A603MaqCodBis ;
   private String[] P078315_A457FasCod ;
   private String[] P078315_A460FasDsc ;
   private short[] P078315_A194BarOrdLin ;
   private String[] P078316_A396EmprCod ;
   private int[] P078316_A361DisCod ;
   private String[] P078316_A758ProCod ;
   private byte[] P078316_A7744FasPreObl ;
   private boolean[] P078316_n7744FasPreObl ;
   private short[] P078316_A368DisFasLin ;
   private String[] P078316_A457FasCod ;
   private short[] P078317_A7727ArtAdiCod ;
   private String[] P078317_A396EmprCod ;
   private int[] P078317_A361DisCod ;
   private String[] P078317_A758ProCod ;
   private short[] P078317_A368DisFasLin ;
   private String[] P078317_A7728ArtAdiDsc ;
   private boolean[] P078317_n7728ArtAdiDsc ;
   private String[] P078318_A396EmprCod ;
   private int[] P078318_A361DisCod ;
   private short[] P078318_A368DisFasLin ;
   private String[] P078318_A758ProCod ;
   private java.math.BigDecimal[] P078318_A7740DisFasPre ;
   private boolean[] P078318_n7740DisFasPre ;
   private String[] P078318_A457FasCod ;
   private String[] P078319_A396EmprCod ;
   private int[] P078319_A361DisCod ;
   private String[] P078319_A758ProCod ;
   private short[] P078319_A368DisFasLin ;
   private java.math.BigDecimal[] P078319_A7736ArtAdiPre ;
   private boolean[] P078319_n7736ArtAdiPre ;
   private short[] P078319_A7727ArtAdiCod ;
   private short[] P078320_A7727ArtAdiCod ;
   private String[] P078320_A396EmprCod ;
   private int[] P078320_A361DisCod ;
   private String[] P078320_A758ProCod ;
   private short[] P078320_A368DisFasLin ;
   private java.math.BigDecimal[] P078320_A7736ArtAdiPre ;
   private boolean[] P078320_n7736ArtAdiPre ;
   private String[] P078320_A7728ArtAdiDsc ;
   private boolean[] P078320_n7728ArtAdiDsc ;
   private String[] P078321_A396EmprCod ;
   private String[] P078321_A130BarCodPar ;
   private byte[] P078321_A132BarCodReo ;
   private int[] P078321_A129BarCod ;
   private java.math.BigDecimal[] P078321_A5104RecMolTotK ;
   private boolean[] P078321_n5104RecMolTotK ;
   private String[] P078321_A2122RecEstTMaq ;
   private boolean[] P078321_n2122RecEstTMaq ;
   private String[] P078321_A9535RecMolCodC ;
   private boolean[] P078321_n9535RecMolCodC ;
   private byte[] P078321_A2124RecMolCod ;
   private String[] P078321_A1032FonCod ;
   private String[] P078321_A1056DisComCod ;
   private byte[] P078321_A2524DisComLin ;
   private String[] P078322_A396EmprCod ;
   private int[] P078322_A361DisCod ;
   private String[] P078322_A130BarCodPar ;
   private byte[] P078322_A132BarCodReo ;
   private int[] P078322_A129BarCod ;
   private String[] P078323_A396EmprCod ;
   private int[] P078323_A361DisCod ;
   private String[] P078323_A377DisObsTxt ;
   private byte[] P078323_A376DisObsLin ;
   private String[] P078324_A396EmprCod ;
   private String[] P078324_A365DisDes ;
   private short[] P078324_A125BarAncAca1 ;
   private String[] P078324_A130BarCodPar ;
   private byte[] P078324_A132BarCodReo ;
   private int[] P078324_A129BarCod ;
   private String[] P078325_A396EmprCod ;
   private int[] P078325_A129BarCod ;
   private byte[] P078325_A132BarCodReo ;
   private String[] P078325_A130BarCodPar ;
   private java.math.BigDecimal[] P078325_A203BarPieKil ;
   private java.math.BigDecimal[] P078325_A205BarPieMet ;
   private String[] P078325_A2186BarPieLoc ;
   private boolean[] P078325_n2186BarPieLoc ;
   private String[] P078325_A200BarPieCod ;
   private String[] P078326_A396EmprCod ;
   private String[] P078326_A130BarCodPar ;
   private byte[] P078326_A132BarCodReo ;
   private int[] P078326_A129BarCod ;
   private int[] P078326_A44AlbRecCod ;
   private String[] P078326_A200BarPieCod ;
   private String[] P078326_A46AlbREnt ;
   private String[] P078326_A55AlbRReo ;
   private String[] P078327_A396EmprCod ;
   private String[] P078327_A130BarCodPar ;
   private byte[] P078327_A132BarCodReo ;
   private int[] P078327_A129BarCod ;
   private String[] P078327_A200BarPieCod ;
   private int[] P078327_A52AlbRPieEnt ;
   private String[] P078327_A50AlbRLoc ;
   private String[] P078327_A46AlbREnt ;
   private int[] P078327_A44AlbRecCod ;
   private String[] P078328_A396EmprCod ;
   private int[] P078328_A44AlbRecCod ;
   private String[] P078328_A1300AlbRObs ;
   private byte[] P078328_A1299AlbRLin ;
   private String[] P078329_A396EmprCod ;
   private String[] P078329_A602MaqCod ;
   private String[] P078329_A620MaqTip ;
   private boolean[] P078329_n620MaqTip ;
   private String[] P078329_A606MaqDsc ;
   private boolean[] P078329_n606MaqDsc ;
   private String[] P078330_A396EmprCod ;
   private short[] P078330_A829TipArtCod ;
   private String[] P078330_A830TipArtDsc ;
   private boolean[] P078330_n830TipArtDsc ;
   private String[] P078331_A3072ArtObsLon ;
   private boolean[] P078331_n3072ArtObsLon ;
   private String[] P078331_A65ArtCod ;
   private int[] P078331_A252CliCod ;
   private boolean[] P078331_n252CliCod ;
   private String[] P078331_A396EmprCod ;
   private String[] P078332_A396EmprCod ;
   private String[] P078332_A457FasCod ;
   private String[] P078332_A758ProCod ;
   private String[] P078332_A65ArtCod ;
   private int[] P078332_A252CliCod ;
   private boolean[] P078332_n252CliCod ;
   private String[] P078332_A1665ParFasDsc ;
   private boolean[] P078332_n1665ParFasDsc ;
   private String[] P078332_A1668ParFasVal ;
   private String[] P078332_A1673ParFasObs ;
   private short[] P078332_A1664ParFasCod ;
   private String[] P078333_A396EmprCod ;
   private int[] P078333_A361DisCod ;
   private String[] P078333_A3400DisRefBCPa ;
   private byte[] P078333_A3399DisRefBCRe ;
   private int[] P078333_A3398DisRefBarC ;
   private String[] P078333_A3607DisRefBPie ;
   private String[] P078334_A396EmprCod ;
   private String[] P078334_A130BarCodPar ;
   private byte[] P078334_A132BarCodReo ;
   private int[] P078334_A129BarCod ;
   private long[] P078334_A30AlbProCod ;
   private String[] P078335_A396EmprCod ;
   private String[] P078335_A3607DisRefBPie ;
   private int[] P078335_A3398DisRefBarC ;
   private byte[] P078335_A3399DisRefBCRe ;
   private String[] P078335_A3400DisRefBCPa ;
   private int[] P078335_A361DisCod ;
   private String[] P078336_A396EmprCod ;
   private String[] P078336_A130BarCodPar ;
   private byte[] P078336_A132BarCodReo ;
   private int[] P078336_A129BarCod ;
   private String[] P078336_A135BarColNom ;
   private byte[] P078337_A583IntCod ;
   private String[] P078337_A396EmprCod ;
   private byte[] P078337_A831TipColCod ;
   private int[] P078337_A483ForColNum ;
   private String[] P078337_A482ForColNom ;
   private String[] P078337_A494ForSer ;
   private int[] P078337_A252CliCod ;
   private boolean[] P078337_n252CliCod ;
   private String[] P078337_A584IntDsc ;
   private boolean[] P078337_n584IntDsc ;
   private short[] P078338_A781PrvCod ;
   private String[] P078338_A396EmprCod ;
   private int[] P078338_A252CliCod ;
   private boolean[] P078338_n252CliCod ;
   private String[] P078338_A787PrvDsc ;
   private boolean[] P078338_n787PrvDsc ;
   private String[] P078339_A396EmprCod ;
   private String[] P078339_A130BarCodPar ;
   private byte[] P078339_A132BarCodReo ;
   private int[] P078339_A129BarCod ;
   private String[] P078339_A200BarPieCod ;
   private int[] P078339_A44AlbRecCod ;
   private java.math.BigDecimal[] P078340_A2155AlbRecKgm ;
   private java.math.BigDecimal[] P078340_A2157AlbRecMtr ;
   private short[] P078340_AV146AlbDetPie ;
}

final  class rhdrart1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07833", "SELECT T1.TipDefCod, T3.ZonGeoCod, T1.EmprCod, T1.DisCod, T2.DibInt, T2.DibCli, T4.DibTipMaq, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T4.DibMed, T4.DibLocal, T1.BarDibCli, T1.CliCod, T1.BarSer, T1.BarColNom, T1.BarColNum, T1.BarTipCol, T1.BarEstReo, T1.BarTipArt, T1.BarLocDis, T1.BarAncAca1, T1.BarAncAca2, T1.BarRdt, T1.BarGraAca, T2.DisManCod1, T2.DisManCod2, T1.BarTraP1, T1.BarTraP2, T1.BarTraP3, T1.BarUrdP1, T1.BarUrdP2, T1.BarUrdP3, T1.BarAudFec, T1.BarFecGen, T2.DisRec, T6.ZonGeoNom, T2.DisUsrCod, T5.TipDefDsc, T1.BarLar, T1.BarNumCli, T1.BarNomCli, T4.DibTipRas, T1.BarCorOri, T1.BarPle, T1.BarEncOri, T1.BarSerDsc, T1.BarDisNum, T2.DisItem1, T1.BarFecFpr, T2.DisFec, T1.BarUrd3, T1.BarUrd2, T1.BarUrd1, T1.BarTra3, T1.BarTra2, T1.BarTra1, T1.BarTipDis, T1.BarDibInt, COALESCE( T7.BarKgm, 0) AS BarKgm, COALESCE( T7.BarMtr, 0) AS BarMtr, COALESCE( T7.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T7.BarPieNDes, 0) AS BarPieNDes FROM ((((((TXPBARCAD T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) LEFT JOIN TXPCDIBUJ T4 ON T4.EmprCod = T1.EmprCod AND T4.DibCli = T2.DibCli AND T4.CliCod = T1.CliCod AND T4.DibInt = T2.DibInt) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod) LEFT JOIN TXPZONGEO T6 ON T6.EmprCod = T1.EmprCod AND T6.ZonGeoCod = T3.ZonGeoCod) LEFT JOIN TXPTIPDEF T5 ON T5.EmprCod = T1.EmprCod AND T5.TipDefCod = T1.TipDefCod) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod = T1.EmprCod AND T7.BarCod = T1.BarCod AND T7.BarCodReo = T1.BarCodReo AND T7.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07834", "SELECT T1.FpgCod, T1.EmprCod, T1.CliCod, T2.FpgDsc, T1.CliPri FROM (TXPCLIFPG T1 INNER JOIN TXPFORPAG T2 ON T2.EmprCod = T1.EmprCod AND T2.FpgCod = T1.FpgCod) WHERE T1.EmprCod = ? and T1.CliCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.CliPri ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07835", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, DisComCod, FonCod, DisComLin, BarComPie, BarComMtr, BarComObs FROM TXPBARCOM WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07836", "SELECT EmprCod, DibCli, CliCod, DibInt, DibOrgLin, DibOrgInt, DibOrgCli, DibOrdMol, DibMolCod, DibRelMC2, DibPrcCobM, DibLin FROM TXPLDIBUJ WHERE EmprCod = ? and DibCli = ? and CliCod = ? and DibInt = ? ORDER BY EmprCod, DibCli, CliCod, DibInt ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07837", "SELECT EmprCod, CliCod, DibCli, DibInt, MolCod, ColCom, SerEst, ColFon, MolForEst FROM TXPMFORES WHERE EmprCod = ? and CliCod = ? and SerEst = ? and DibCli = ? and DibInt = ? and ColCom = ? and ColFon = ? and MolCod = ? ORDER BY EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07838", "SELECT EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod, PasCod, PasForLin FROM TXPPASFOR WHERE EmprCod = ? and CliCod = ? and SerEst = ? and DibCli = ? and DibInt = ? and ColCom = ? and ColFon = ? and MolCod = ? ORDER BY EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07839", "SELECT EmprCod, ShaGrb, ShaOrd, ShaDibInt, ShaDibCli, ShaCod, ShaGal, ShaUbi, ShaAnc, ShaMal FROM TXPShablo WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P078310", "SELECT EmprCod, DibCli, CliCod, DibInt, DibOrgLi, DibOrgIn, DibOrgCl, DibOrdCil, DibRelMC, DibPrcCob, DibLinCil FROM TXPLDIBUC WHERE EmprCod = ? and DibCli = ? and CliCod = ? and DibInt = ? ORDER BY EmprCod, DibCli, CliCod, DibInt ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P078311", "SELECT * FROM (SELECT EmprCod, CliCod, DibCli, DibInt, MolCod, ColCom, SerEst, ColFon, MolForEst FROM TXPMFORES WHERE EmprCod = ? and CliCod = ? and SerEst = ? and DibCli = ? and DibInt = ? and ColCom = ? and ColFon = ? and MolCod = ? ORDER BY EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P078312", "SELECT EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod, PasCod, PasForLin FROM TXPPASFOR WHERE EmprCod = ? and CliCod = ? and SerEst = ? and DibCli = ? and DibInt = ? and ColCom = ? and ColFon = ? and MolCod = ? ORDER BY EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P078313", "SELECT EmprCod, ShaGrb, ShaOrd, ShaDibInt, ShaDibCli, ShaCod, ShaGal, ShaUbi, ShaAnc, ShaMal FROM TXPShablo WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P078314", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T2.ProDsc FROM (TXPBARPRO T1 INNER JOIN TXPPROCES T2 ON T2.EmprCod = T1.EmprCod AND T2.ProCod = T1.ProCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P078315", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T2.FasPreObl, T3.DisCod, T1.MaqCodBis, T1.FasCod, T2.FasDsc, T1.BarOrdLin FROM ((TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.ProCod = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P078316", "SELECT EmprCod, DisCod, ProCod, FasPreObl, DisFasLin, FasCod FROM TXPDISFAS WHERE (EmprCod = ? and DisCod = ? and ProCod = ?) AND (FasPreObl = ?) AND (FasCod = ?) ORDER BY EmprCod, DisCod, ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P078317", "SELECT T1.ArtAdiCod, T1.EmprCod, T1.DisCod, T1.ProCod, T1.DisFasLin, T2.ArtAdiDsc FROM (TXPDisFPA T1 INNER JOIN TXPArtAdi T2 ON T2.EmprCod = T1.EmprCod AND T2.ArtAdiCod = T1.ArtAdiCod) WHERE T1.EmprCod = ? and T1.DisCod = ? and T1.ProCod = ? and T1.DisFasLin = ? ORDER BY T1.EmprCod, T1.DisCod, T1.ProCod, T1.DisFasLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P078318", "SELECT EmprCod, DisCod, DisFasLin, ProCod, DisFasPre, FasCod FROM TXPDISFAS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P078319", "SELECT EmprCod, DisCod, ProCod, DisFasLin, ArtAdiPre, ArtAdiCod FROM TXPDisFPA WHERE EmprCod = ? and DisCod = ? and ProCod = ? and DisFasLin = ? ORDER BY EmprCod, DisCod, ProCod, DisFasLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P078320", "SELECT T1.ArtAdiCod, T1.EmprCod, T1.DisCod, T1.ProCod, T1.DisFasLin, T1.ArtAdiPre, T2.ArtAdiDsc FROM (TXPDisFPA T1 INNER JOIN TXPArtAdi T2 ON T2.EmprCod = T1.EmprCod AND T2.ArtAdiCod = T1.ArtAdiCod) WHERE T1.EmprCod = ? and T1.DisCod = ? and T1.ProCod = ? and T1.DisFasLin = ? ORDER BY T1.EmprCod, T1.DisCod, T1.ProCod, T1.DisFasLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P078321", "SELECT T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.RecMolTotK, T2.RecEstTMaq, T1.RecMolCodC, T1.RecMolCod, T1.FonCod, T1.DisComCod, T1.DisComLin FROM (TXPRECMOL T1 INNER JOIN TXPBARCOM T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar AND T2.DisComLin = T1.DisComLin AND T2.DisComCod = T1.DisComCod AND T2.FonCod = T1.FonCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.DisComLin, T1.DisComCod, T1.FonCod, T1.RecMolCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P078322", "SELECT EmprCod, DisCod, BarCodPar, BarCodReo, BarCod FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P078323", "SELECT EmprCod, DisCod, DisObsTxt, DisObsLin FROM TXPOBSERV WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P078324", "SELECT EmprCod, DisDes, BarAncAca1, BarCodPar, BarCodReo, BarCod FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P078325", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieKil, BarPieMet, BarPieLoc, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P078326", "SELECT T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.AlbRecCod, T1.BarPieCod, T2.AlbREnt, T2.AlbRReo FROM (TXPBARPIE T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P078327", "SELECT T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.BarPieCod, T2.AlbRPieEnt, T2.AlbRLoc, T2.AlbREnt, T1.AlbRecCod FROM (TXPBARPIE T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P078328", "SELECT EmprCod, AlbRecCod, AlbRObs, AlbRLin FROM TXPALBROB WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P078329", "SELECT EmprCod, MaqCod, MaqTip, MaqDsc FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P078330", "SELECT EmprCod, TipArtCod, TipArtDsc FROM TXPTIPART WHERE EmprCod = ? and TipArtCod = ? ORDER BY EmprCod, TipArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P078331", "SELECT ArtObsLon, ArtCod, CliCod, EmprCod FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P078332", "SELECT T1.EmprCod, T1.FasCod, T1.ProCod, T1.ArtCod, T1.CliCod, T2.ParFasDsc, T1.ParFasVal, T1.ParFasObs, T1.ParFasCod FROM (TXPSERPAR T1 INNER JOIN TXPPARFAS T2 ON T2.EmprCod = T1.EmprCod AND T2.ParFasCod = T1.ParFasCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ArtCod = ? and T1.ProCod = ? and T1.FasCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod, T1.ProCod, T1.FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P078333", "SELECT EmprCod, DisCod, DisRefBCPa, DisRefBCRe, DisRefBarC, DisRefBPie FROM TXPDISREF WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod, DisRefBarC, DisRefBCRe, DisRefBCPa ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P078334", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, AlbProCod FROM TXPALBBAR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P078335", "SELECT EmprCod, DisRefBPie, DisRefBarC, DisRefBCRe, DisRefBCPa, DisCod FROM TXPDISREF WHERE (EmprCod = ?) AND (DisRefBPie = ?) ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P078336", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarColNom FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P078337", "SELECT T1.IntCod, T1.EmprCod, T1.TipColCod, T1.ForColNum, T1.ForColNom, T1.ForSer, T1.CliCod, T2.IntDsc FROM (TXPCFORMU T1 INNER JOIN TXPINTENS T2 ON T2.EmprCod = T1.EmprCod AND T2.IntCod = T1.IntCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ForSer = ? and T1.ForColNom = ? and T1.ForColNum = ? and T1.TipColCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P078338", "SELECT T1.PrvCod, T1.EmprCod, T1.CliCod, T2.PrvDsc FROM (TXPCLIENT T1 INNER JOIN TXPPROVIN T2 ON T2.PrvCod = T1.PrvCod) WHERE T1.EmprCod = ? and T1.CliCod = ? ORDER BY T1.EmprCod, T1.CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P078339", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarPieCod, AlbRecCod FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P078340", "SELECT SUM(AlbRecKgm), SUM(AlbRecMtr), COUNT(*) FROM TXPALBDET WHERE EmprCod = ? and AlbRecCod = ? and AlbRecPie = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 16);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 1);
               ((byte[]) buf[12])[0] = rslt.getByte(9);
               ((int[]) buf[13])[0] = rslt.getInt(10);
               ((String[]) buf[14])[0] = rslt.getString(11, 10);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(12, 15);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(13, 16);
               ((int[]) buf[19])[0] = rslt.getInt(14);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(15, 16);
               ((String[]) buf[22])[0] = rslt.getString(16, 13);
               ((int[]) buf[23])[0] = rslt.getInt(17);
               ((byte[]) buf[24])[0] = rslt.getByte(18);
               ((byte[]) buf[25])[0] = rslt.getByte(19);
               ((short[]) buf[26])[0] = rslt.getShort(20);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(21, 10);
               ((short[]) buf[29])[0] = rslt.getShort(22);
               ((short[]) buf[30])[0] = rslt.getShort(23);
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(24,2);
               ((short[]) buf[32])[0] = rslt.getShort(25);
               ((short[]) buf[33])[0] = rslt.getShort(26);
               ((short[]) buf[34])[0] = rslt.getShort(27);
               ((short[]) buf[35])[0] = rslt.getShort(28);
               ((short[]) buf[36])[0] = rslt.getShort(29);
               ((short[]) buf[37])[0] = rslt.getShort(30);
               ((short[]) buf[38])[0] = rslt.getShort(31);
               ((short[]) buf[39])[0] = rslt.getShort(32);
               ((short[]) buf[40])[0] = rslt.getShort(33);
               ((java.util.Date[]) buf[41])[0] = rslt.getGXDate(34);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[43])[0] = rslt.getGXDate(35);
               ((String[]) buf[44])[0] = rslt.getString(36, 30);
               ((String[]) buf[45])[0] = rslt.getString(37, 30);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getString(38, 8);
               ((String[]) buf[48])[0] = rslt.getString(39, 30);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((String[]) buf[50])[0] = rslt.getString(40, 10);
               ((int[]) buf[51])[0] = rslt.getInt(41);
               ((String[]) buf[52])[0] = rslt.getString(42, 13);
               ((String[]) buf[53])[0] = rslt.getString(43, 15);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((String[]) buf[55])[0] = rslt.getString(44, 1);
               ((String[]) buf[56])[0] = rslt.getString(45, 10);
               ((String[]) buf[57])[0] = rslt.getString(46, 1);
               ((String[]) buf[58])[0] = rslt.getString(47, 26);
               ((String[]) buf[59])[0] = rslt.getString(48, 8);
               ((String[]) buf[60])[0] = rslt.getString(49, 20);
               ((java.util.Date[]) buf[61])[0] = rslt.getGXDate(50);
               ((java.util.Date[]) buf[62])[0] = rslt.getGXDate(51);
               ((String[]) buf[63])[0] = rslt.getString(52, 4);
               ((String[]) buf[64])[0] = rslt.getString(53, 4);
               ((String[]) buf[65])[0] = rslt.getString(54, 4);
               ((String[]) buf[66])[0] = rslt.getString(55, 4);
               ((String[]) buf[67])[0] = rslt.getString(56, 4);
               ((String[]) buf[68])[0] = rslt.getString(57, 4);
               ((String[]) buf[69])[0] = rslt.getString(58, 1);
               ((int[]) buf[70])[0] = rslt.getInt(59);
               ((java.math.BigDecimal[]) buf[71])[0] = rslt.getBigDecimal(60,2);
               ((java.math.BigDecimal[]) buf[72])[0] = rslt.getBigDecimal(61,2);
               ((short[]) buf[73])[0] = rslt.getShort(62);
               ((String[]) buf[74])[0] = rslt.getString(63, 1);
               ((int[]) buf[75])[0] = rslt.getInt(64);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 70);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 16);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 5);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(10, 20);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(12);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(10);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((String[]) buf[6])[0] = rslt.getString(5, 16);
               ((String[]) buf[7])[0] = rslt.getString(6, 10);
               ((String[]) buf[8])[0] = rslt.getString(7, 10);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(10, 10);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 16);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 20);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(11);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(10);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((String[]) buf[6])[0] = rslt.getString(5, 16);
               ((String[]) buf[7])[0] = rslt.getString(6, 10);
               ((String[]) buf[8])[0] = rslt.getString(7, 10);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(10, 10);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 40);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 6);
               ((String[]) buf[9])[0] = rslt.getString(9, 8);
               ((String[]) buf[10])[0] = rslt.getString(10, 28);
               ((short[]) buf[11])[0] = rslt.getShort(11);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 8);
               return;
            case 14 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 8);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               return;
            case 17 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 20);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(8);
               ((String[]) buf[11])[0] = rslt.getString(9, 12);
               ((String[]) buf[12])[0] = rslt.getString(10, 12);
               ((byte[]) buf[13])[0] = rslt.getByte(11);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getString(7, 10);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 9);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((String[]) buf[7])[0] = rslt.getString(8, 2);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 10);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 16);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 8);
               ((String[]) buf[8])[0] = rslt.getString(8, 60);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               return;
      }
      getresults30( cursor, rslt, buf) ;
   }

   public void getresults30( int cursor ,
                             IFieldGetter rslt ,
                             Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 30 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 9);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               return;
            case 34 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 35 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 37 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 16);
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
                  stmt.setInt(4, ((Number) parms[6]).intValue());
               }
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
               stmt.setString(3, (String)parms[3], 16);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[5], 16);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[7]).intValue());
               }
               stmt.setString(6, (String)parms[8], 12);
               stmt.setString(7, (String)parms[9], 12);
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(8, ((Number) parms[11]).byteValue());
               }
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 16);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[5], 16);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[7]).intValue());
               }
               stmt.setString(6, (String)parms[8], 12);
               stmt.setString(7, (String)parms[9], 12);
               stmt.setByte(8, ((Number) parms[10]).byteValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 16);
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
                  stmt.setInt(4, ((Number) parms[6]).intValue());
               }
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
               stmt.setString(3, (String)parms[3], 16);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[5], 16);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[7]).intValue());
               }
               stmt.setString(6, (String)parms[8], 12);
               stmt.setString(7, (String)parms[9], 12);
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(8, ((Number) parms[11]).byteValue());
               }
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
               stmt.setString(3, (String)parms[3], 16);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[5], 16);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[7]).intValue());
               }
               stmt.setString(6, (String)parms[8], 12);
               stmt.setString(7, (String)parms[9], 12);
               stmt.setByte(8, ((Number) parms[10]).byteValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[4]).byteValue());
               }
               stmt.setString(5, (String)parms[5], 8);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 9);
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 36 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 37 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               return;
      }
   }

}

