package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class rhdrdo extends GXReport
{
   public rhdrdo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rhdrdo.class ), "" );
   }

   public rhdrdo( int remoteHandle ,
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
      rhdrdo.this.aP4 = new String[] {""};
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
      rhdrdo.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      rhdrdo.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      rhdrdo.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      rhdrdo.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      rhdrdo.this.Gx_out = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      M_top = 0 ;
      M_bot = 15 ;
      P_lines = (int)(66-M_bot) ;
      getPrinter().GxClearAttris() ;
      lineHeight = 15 ;
      PrtOffset = 0 ;
      gxXPage = 100 ;
      gxYPage = 100 ;
      try
      {
         super.Gx_out = this.Gx_out ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "REPGRAF", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("IMPRESION HDR") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*15)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GxHdr2 = true ;
         /* Using cursor P07RK3 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A833TipDefCod = P07RK3_A833TipDefCod[0] ;
            n833TipDefCod = P07RK3_n833TipDefCod[0] ;
            A125BarAncAca1 = P07RK3_A125BarAncAca1[0] ;
            A361DisCod = P07RK3_A361DisCod[0] ;
            A218BarTipCol = P07RK3_A218BarTipCol[0] ;
            A148BarEstReo = P07RK3_A148BarEstReo[0] ;
            A834TipDefDsc = P07RK3_A834TipDefDsc[0] ;
            n834TipDefDsc = P07RK3_n834TipDefDsc[0] ;
            A217BarTipArt = P07RK3_A217BarTipArt[0] ;
            n217BarTipArt = P07RK3_n217BarTipArt[0] ;
            A2311BarCliDes = P07RK3_A2311BarCliDes[0] ;
            A5253BarAcc = P07RK3_A5253BarAcc[0] ;
            A126BarAncAca2 = P07RK3_A126BarAncAca2[0] ;
            A211BarRdt = P07RK3_A211BarRdt[0] ;
            A3137BarGraAca2 = P07RK3_A3137BarGraAca2[0] ;
            A1909BarGraAca = P07RK3_A1909BarGraAca[0] ;
            A1652BarSerDsc = P07RK3_A1652BarSerDsc[0] ;
            A145BarEncOri = P07RK3_A145BarEncOri[0] ;
            A139BarCorOri = P07RK3_A139BarCorOri[0] ;
            A206BarPle = P07RK3_A206BarPle[0] ;
            A1234BarNomCli = P07RK3_A1234BarNomCli[0] ;
            A180BarMaqCod = P07RK3_A180BarMaqCod[0] ;
            A212BarSer = P07RK3_A212BarSer[0] ;
            A136BarColNum = P07RK3_A136BarColNum[0] ;
            A135BarColNom = P07RK3_A135BarColNom[0] ;
            A4812BarEncCli = P07RK3_A4812BarEncCli[0] ;
            A279CliNom = P07RK3_A279CliNom[0] ;
            A252CliCod = P07RK3_A252CliCod[0] ;
            n252CliCod = P07RK3_n252CliCod[0] ;
            A158BarFecFpr = P07RK3_A158BarFecFpr[0] ;
            A369DisFec = P07RK3_A369DisFec[0] ;
            A224BarTraP1 = P07RK3_A224BarTraP1[0] ;
            A225BarTraP2 = P07RK3_A225BarTraP2[0] ;
            A226BarTraP3 = P07RK3_A226BarTraP3[0] ;
            A232BarUrdP1 = P07RK3_A232BarUrdP1[0] ;
            A233BarUrdP2 = P07RK3_A233BarUrdP2[0] ;
            A234BarUrdP3 = P07RK3_A234BarUrdP3[0] ;
            A166BarKgm = P07RK3_A166BarKgm[0] ;
            A184BarMtr = P07RK3_A184BarMtr[0] ;
            A199BarPie1 = P07RK3_A199BarPie1[0] ;
            A365DisDes = P07RK3_A365DisDes[0] ;
            A898BarPieNDes = P07RK3_A898BarPieNDes[0] ;
            A369DisFec = P07RK3_A369DisFec[0] ;
            A834TipDefDsc = P07RK3_A834TipDefDsc[0] ;
            n834TipDefDsc = P07RK3_n834TipDefDsc[0] ;
            A279CliNom = P07RK3_A279CliNom[0] ;
            A166BarKgm = P07RK3_A166BarKgm[0] ;
            A184BarMtr = P07RK3_A184BarMtr[0] ;
            A199BarPie1 = P07RK3_A199BarPie1[0] ;
            A898BarPieNDes = P07RK3_A898BarPieNDes[0] ;
            if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
            {
               A198BarPie = A898BarPieNDes ;
            }
            else
            {
               A198BarPie = A199BarPie1 ;
            }
            GX_I = 1 ;
            while ( GX_I <= 10 )
            {
               AV91HdrA[GX_I-1] = "" ;
               GX_I = (int)(GX_I+1) ;
            }
            AV92ContHr = (byte)(1) ;
            /* Using cursor P07RK4 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A122BarAgrPar = P07RK4_A122BarAgrPar[0] ;
               A124BarAgrReo = P07RK4_A124BarAgrReo[0] ;
               A119BarAgrCod = P07RK4_A119BarAgrCod[0] ;
               if ( AV92ContHr <= 10 )
               {
                  AV91HdrA[AV92ContHr-1] = GXutil.str( A119BarAgrCod, 8, 0) + "-" + GXutil.str( A124BarAgrReo, 1, 0) + A122BarAgrPar ;
               }
               AV92ContHr = (byte)(AV92ContHr+1) ;
               pr_default.readNext(1);
            }
            pr_default.close(1);
            AV29HojRut = GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + " " + A130BarCodPar ;
            AV81Ceros8 = "00000000" ;
            AV82HdrAlfa = GXutil.str( A129BarCod, 8, 0) ;
            AV82HdrAlfa = GXutil.ltrim( GXutil.rtrim( AV82HdrAlfa)) ;
            AV83LenVar = (byte)(GXutil.len( AV82HdrAlfa)) ;
            AV83LenVar = (byte)(8-AV83LenVar) ;
            AV82HdrAlfa = GXutil.substring( AV81Ceros8, 1, AV83LenVar) + AV82HdrAlfa ;
            if ( GXutil.strcmp(A130BarCodPar, " ") == 0 )
            {
               AV80Hdr = "*" + AV82HdrAlfa + GXutil.str( A132BarCodReo, 1, 0) + "*" ;
            }
            else
            {
               AV80Hdr = "*" + AV82HdrAlfa + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + "*" ;
            }
            AV30CliCod = A252CliCod ;
            AV28BarSer = A212BarSer ;
            AV25EmprCod = A396EmprCod ;
            AV33ForColNom = A135BarColNom ;
            AV34ForColNum = A136BarColNum ;
            AV53TipColCod = A218BarTipCol ;
            AV56TextoReop = "" ;
            AV109TipDefdsc = "" ;
            if ( A148BarEstReo == 2 )
            {
               AV56TextoReop = httpContext.getMessage( "REOPERADO EXTERIOR", "") ;
               AV109TipDefdsc = A834TipDefDsc ;
            }
            if ( A148BarEstReo == 1 )
            {
               AV56TextoReop = httpContext.getMessage( "REOPERADO INTERIOR", "") ;
               AV109TipDefdsc = A834TipDefDsc ;
            }
            AV73BarSer9 = GXutil.substring( A212BarSer, 1, 9) ;
            AV57TipArtCod = A217BarTipArt ;
            AV114BarCliDes = A2311BarCliDes ;
            AV53TipColCod = A218BarTipCol ;
            GXv_char1[0] = A396EmprCod ;
            GXv_int2[0] = A252CliCod ;
            GXv_char3[0] = A212BarSer ;
            GXv_char4[0] = A135BarColNom ;
            GXv_int5[0] = A136BarColNum ;
            GXv_int6[0] = A218BarTipCol ;
            GXv_int7[0] = AV22IntCod ;
            GXv_char8[0] = AV23IntDsc ;
            GXv_char9[0] = " " ;
            GXv_int10[0] = 0 ;
            new app.pbusint(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_char3, GXv_char4, GXv_int5, GXv_int6, GXv_int7, GXv_char8, GXv_char9, GXv_int10) ;
            rhdrdo.this.A396EmprCod = GXv_char1[0] ;
            rhdrdo.this.A252CliCod = GXv_int2[0] ;
            rhdrdo.this.A212BarSer = GXv_char3[0] ;
            rhdrdo.this.A135BarColNom = GXv_char4[0] ;
            rhdrdo.this.A136BarColNum = GXv_int5[0] ;
            rhdrdo.this.A218BarTipCol = GXv_int6[0] ;
            rhdrdo.this.AV22IntCod = GXv_int7[0] ;
            rhdrdo.this.AV23IntDsc = GXv_char8[0] ;
            /* Execute user subroutine: 'TIPCOL' */
            S141 ();
            if ( returnInSub )
            {
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
               cleanup();
               if (true) return;
            }
            /* Execute user subroutine: 'TIPART' */
            S121 ();
            if ( returnInSub )
            {
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
               cleanup();
               if (true) return;
            }
            /* Execute user subroutine: 'OBS' */
            S131 ();
            if ( returnInSub )
            {
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
               cleanup();
               if (true) return;
            }
            GXv_int10[0] = AV116barmaccod ;
            new app.pbusmace(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int10) ;
            rhdrdo.this.AV116barmaccod = GXv_int10[0] ;
            AV117Texo_st = "" ;
            if ( GXutil.strcmp(A5253BarAcc, httpContext.getMessage( "S", "")) == 0 )
            {
               AV117Texo_st = httpContext.getMessage( "SIN TELA...", "") ;
            }
            GXv_char9[0] = "" ;
            GXv_char8[0] = "" ;
            GXv_int11[0] = (short)(0) ;
            GXv_int7[0] = (byte)(0) ;
            GXv_char4[0] = "" ;
            GXv_char3[0] = "" ;
            GXv_int10[0] = 0 ;
            GXv_char1[0] = AV131fortonal ;
            GXv_char12[0] = "" ;
            GXv_int13[0] = (short)(0) ;
            GXv_char14[0] = "" ;
            GXv_char15[0] = "" ;
            new app.pmasinf(remoteHandle, context).execute( A396EmprCod, A252CliCod, A212BarSer, A135BarColNom, A136BarColNum, A218BarTipCol, GXv_char9, GXv_char8, GXv_int11, GXv_int7, GXv_char4, GXv_char3, GXv_int10, GXv_char1, GXv_char12, GXv_int13, GXv_char14, GXv_char15) ;
            rhdrdo.this.AV131fortonal = GXv_char1[0] ;
            h7RK0( false, 63) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "OBSERVACIONES:", ""), 19, Gx_line+0, 141, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV87Obstxt[1-1], "")), 18, Gx_line+22, 394, Gx_line+40, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV87Obstxt[2-1], "")), 396, Gx_line+22, 772, Gx_line+40, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV87Obstxt[3-1], "")), 18, Gx_line+43, 394, Gx_line+61, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV87Obstxt[4-1], "")), 396, Gx_line+43, 772, Gx_line+61, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(11, Gx_line+17, 779, Gx_line+17, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+63) ;
            h7RK0( false, 20) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "OPERACIONES:", ""), 19, Gx_line+0, 123, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(11, Gx_line+17, 779, Gx_line+17, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
            /* Using cursor P07RK5 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A759ProDsc = P07RK5_A759ProDsc[0] ;
               A758ProCod = P07RK5_A758ProCod[0] ;
               A759ProDsc = P07RK5_A759ProDsc[0] ;
               h7RK0( false, 22) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A758ProCod, "")), 143, Gx_line+3, 244, Gx_line+20, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Proceso", ""), 76, Gx_line+3, 127, Gx_line+20, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A759ProDsc, "")), 272, Gx_line+3, 523, Gx_line+21, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(11, Gx_line+19, 779, Gx_line+19, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+22) ;
               pr_default.readNext(2);
            }
            pr_default.close(2);
            /* Using cursor P07RK6 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A194BarOrdLin = P07RK6_A194BarOrdLin[0] ;
               A758ProCod = P07RK6_A758ProCod[0] ;
               A6173BarFasSec = P07RK6_A6173BarFasSec[0] ;
               n6173BarFasSec = P07RK6_n6173BarFasSec[0] ;
               A603MaqCodBis = P07RK6_A603MaqCodBis[0] ;
               A457FasCod = P07RK6_A457FasCod[0] ;
               A472FasVelPro = P07RK6_A472FasVelPro[0] ;
               n472FasVelPro = P07RK6_n472FasVelPro[0] ;
               A152BarFasCon = P07RK6_A152BarFasCon[0] ;
               A460FasDsc = P07RK6_A460FasDsc[0] ;
               A4905BarFasAcab = P07RK6_A4905BarFasAcab[0] ;
               A472FasVelPro = P07RK6_A472FasVelPro[0] ;
               n472FasVelPro = P07RK6_n472FasVelPro[0] ;
               A460FasDsc = P07RK6_A460FasDsc[0] ;
               if ( GXutil.strcmp(A6173BarFasSec, httpContext.getMessage( "OR", "")) == 0 )
               {
               }
               else
               {
                  AV26MaqCod = A603MaqCodBis ;
                  /* Execute user subroutine: 'MAQUIN' */
                  S111 ();
                  if ( returnInSub )
                  {
                     pr_default.close(3);
                     pr_default.close(3);
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
                     cleanup();
                     if (true) return;
                  }
                  AV124Procod = A758ProCod ;
                  AV125fascod = A457FasCod ;
                  /* Execute user subroutine: 'SERPAU' */
                  S151 ();
                  if ( returnInSub )
                  {
                     pr_default.close(3);
                     pr_default.close(3);
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
                     cleanup();
                     if (true) return;
                  }
                  if ( AV126Velocidad.doubleValue() == 0 )
                  {
                     AV126Velocidad = A472FasVelPro ;
                  }
                  h7RK0( false, 17) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A460FasDsc, "")), 102, Gx_line+0, 278, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A603MaqCodBis, "")), 405, Gx_line+0, 487, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24MaqDsc, "")), 497, Gx_line+0, 598, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A194BarOrdLin), "ZZZ9")), 40, Gx_line+0, 70, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A152BarFasCon, "@!")), 670, Gx_line+0, 685, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV126Velocidad, "ZZZ.Z")), 717, Gx_line+0, 754, Gx_line+18, 2+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+17) ;
                  if ( GXutil.strcmp(A4905BarFasAcab, httpContext.getMessage( "S", "")) == 0 )
                  {
                     AV121Texto_ra = httpContext.getMessage( "Fase de Acabado ", "") ;
                     AV139GXLvl113 = (byte)(0) ;
                     /* Using cursor P07RK7 */
                     pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
                     while ( (pr_default.getStatus(4) != 101) )
                     {
                        A764ProForCod = P07RK7_A764ProForCod[0] ;
                        A5371FasQuiLin = P07RK7_A5371FasQuiLin[0] ;
                        AV139GXLvl113 = (byte)(1) ;
                        AV121Texto_ra += httpContext.getMessage( "con Proceso =", "") + A764ProForCod ;
                        pr_default.readNext(4);
                     }
                     pr_default.close(4);
                     if ( AV139GXLvl113 == 0 )
                     {
                        AV121Texto_ra += httpContext.getMessage( "sin Proceso Quimico", "") ;
                     }
                     h7RK0( false, 18) ;
                     getPrinter().GxAttris("Arial", 10, true, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV121Texto_ra, "")), 102, Gx_line+0, 291, Gx_line+18, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+18) ;
                  }
               }
               pr_default.readNext(3);
            }
            pr_default.close(3);
            AV84FlagObs = (byte)(0) ;
            /* Using cursor P07RK8 */
            pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
            while ( (pr_default.getStatus(5) != 101) )
            {
               A377DisObsTxt = P07RK8_A377DisObsTxt[0] ;
               A376DisObsLin = P07RK8_A376DisObsLin[0] ;
               if ( AV84FlagObs == 0 )
               {
                  AV84FlagObs = (byte)(1) ;
                  h7RK0( false, 38) ;
                  getPrinter().GxDrawRect(11, Gx_line+5, 779, Gx_line+30, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "OBSERVACIONES", ""), 340, Gx_line+9, 458, Gx_line+26, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(11, Gx_line+28, 11, Gx_line+37, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(778, Gx_line+28, 778, Gx_line+37, 1, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+38) ;
               }
               if ( GXutil.strcmp(A377DisObsTxt, " ") != 0 )
               {
                  h7RK0( false, 18) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A377DisObsTxt, "")), 28, Gx_line+1, 404, Gx_line+19, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(11, Gx_line+0, 11, Gx_line+18, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(778, Gx_line+0, 778, Gx_line+18, 1, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+18) ;
               }
               pr_default.readNext(5);
            }
            pr_default.close(5);
            if ( AV84FlagObs == 1 )
            {
               h7RK0( false, 11) ;
               getPrinter().GxDrawLine(11, Gx_line+0, 11, Gx_line+9, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(11, Gx_line+9, 779, Gx_line+9, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(778, Gx_line+0, 778, Gx_line+9, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+11) ;
            }
            h7RK0( false, 50) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "PIEZA", ""), 43, Gx_line+17, 83, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "KILOS", ""), 121, Gx_line+17, 162, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "PIEZA", ""), 296, Gx_line+17, 336, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "KILOS", ""), 383, Gx_line+17, 424, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(11, Gx_line+8, 779, Gx_line+41, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(11, Gx_line+8, 11, Gx_line+50, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(113, Gx_line+8, 113, Gx_line+50, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(165, Gx_line+8, 165, Gx_line+50, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(227, Gx_line+8, 227, Gx_line+50, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(227, Gx_line+8, 227, Gx_line+49, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(367, Gx_line+9, 367, Gx_line+50, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(428, Gx_line+8, 428, Gx_line+50, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(778, Gx_line+41, 778, Gx_line+50, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(11, Gx_line+40, 11, Gx_line+50, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "PIEZA", ""), 564, Gx_line+17, 604, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "KILOS", ""), 635, Gx_line+17, 676, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(491, Gx_line+8, 491, Gx_line+50, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(491, Gx_line+8, 491, Gx_line+50, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(632, Gx_line+8, 632, Gx_line+50, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "METROS", ""), 168, Gx_line+17, 226, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "METROS", ""), 431, Gx_line+17, 489, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "METROS", ""), 684, Gx_line+17, 742, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(682, Gx_line+8, 682, Gx_line+50, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "ANC", ""), 231, Gx_line+17, 260, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(261, Gx_line+8, 261, Gx_line+49, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(529, Gx_line+8, 529, Gx_line+50, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "ANC", ""), 496, Gx_line+17, 525, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(742, Gx_line+8, 742, Gx_line+50, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "ANC", ""), 746, Gx_line+17, 775, Gx_line+34, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+50) ;
            GX_I = 1 ;
            while ( GX_I <= 10 )
            {
               AV89AlbrLoc[GX_I-1] = "" ;
               GX_I = (int)(GX_I+1) ;
            }
            AV63i = (byte)(1) ;
            /* Using cursor P07RK9 */
            pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
            while ( (pr_default.getStatus(6) != 101) )
            {
               A44AlbRecCod = P07RK9_A44AlbRecCod[0] ;
               A3700MetrosUti = P07RK9_A3700MetrosUti[0] ;
               n3700MetrosUti = P07RK9_n3700MetrosUti[0] ;
               A50AlbRLoc = P07RK9_A50AlbRLoc[0] ;
               A50AlbRLoc = P07RK9_A50AlbRLoc[0] ;
               if ( AV63i > 10 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
               AV89AlbrLoc[AV63i-1] = A50AlbRLoc ;
               AV63i = (byte)(AV63i+1) ;
               pr_default.readNext(6);
            }
            pr_default.close(6);
            GX_I = 1 ;
            while ( GX_I <= 100 )
            {
               AV59Pieza[GX_I-1] = "" ;
               GX_I = (int)(GX_I+1) ;
            }
            GX_I = 1 ;
            while ( GX_I <= 100 )
            {
               AV60KgsP[GX_I-1] = DecimalUtil.ZERO ;
               GX_I = (int)(GX_I+1) ;
            }
            GX_I = 1 ;
            while ( GX_I <= 100 )
            {
               AV61MtsP[GX_I-1] = DecimalUtil.ZERO ;
               GX_I = (int)(GX_I+1) ;
            }
            GX_I = 1 ;
            while ( GX_I <= 100 )
            {
               AV62AnchoP[GX_I-1] = (short)(0) ;
               GX_I = (int)(GX_I+1) ;
            }
            AV63i = (byte)(1) ;
            /* Using cursor P07RK10 */
            pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(7) != 101) )
            {
               A44AlbRecCod = P07RK10_A44AlbRecCod[0] ;
               A203BarPieKil = P07RK10_A203BarPieKil[0] ;
               A205BarPieMet = P07RK10_A205BarPieMet[0] ;
               A200BarPieCod = P07RK10_A200BarPieCod[0] ;
               if ( AV63i > 100 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
               AV52BarPieCod = A200BarPieCod ;
               AV128albreccod = A44AlbRecCod ;
               /* Execute user subroutine: 'ALBDET' */
               S161 ();
               if ( returnInSub )
               {
                  pr_default.close(7);
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
                  cleanup();
                  if (true) return;
               }
               if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
               {
                  if ( GXutil.strcmp(GXutil.substring( AV52BarPieCod, 1, 1), httpContext.getMessage( "H", "")) != 0 )
                  {
                     AV52BarPieCod = httpContext.getMessage( "SIN TELA", "") ;
                  }
               }
               AV59Pieza[AV63i-1] = AV52BarPieCod ;
               AV60KgsP[AV63i-1] = A203BarPieKil ;
               AV61MtsP[AV63i-1] = A205BarPieMet ;
               AV62AnchoP[AV63i-1] = ((AV129AlbRecAnh>0) ? AV129AlbRecAnh : A125BarAncAca1) ;
               AV63i = (byte)(AV63i+1) ;
               pr_default.readNext(7);
            }
            pr_default.close(7);
            AV63i = (byte)(AV63i-1) ;
            if ( ( GXutil.Int( AV63i/ (double) (3)) == ( AV63i / (double) ( 3 ) ) ) )
            {
               AV75Npiezas = (byte)(AV63i/ (double) (3)) ;
            }
            else
            {
               AV75Npiezas = (byte)(3*GXutil.Int( AV63i/ (double) (3))+3) ;
               AV75Npiezas = (byte)(AV75Npiezas/ (double) (3)) ;
            }
            AV63i = (byte)(1) ;
            AV64t = (byte)(AV75Npiezas+1) ;
            AV110y = (byte)(AV64t+AV75Npiezas) ;
            AV76p = (byte)(1) ;
            AV48Linea2 = (byte)(1) ;
            while ( AV76p < 100 )
            {
               if ( AV63i > AV75Npiezas )
               {
                  AV76p = (byte)(100) ;
               }
               else
               {
                  AV65Pieza1 = GXutil.substring( AV59Pieza[AV63i-1], 1, 7) ;
                  AV67Kgs1 = AV60KgsP[AV63i-1] ;
                  AV69Mts1 = AV61MtsP[AV63i-1] ;
                  AV71Anc1 = AV62AnchoP[AV63i-1] ;
                  AV66Pieza2 = GXutil.substring( AV59Pieza[AV64t-1], 1, 7) ;
                  AV68Kgs2 = AV60KgsP[AV64t-1] ;
                  AV70Mts2 = AV61MtsP[AV64t-1] ;
                  AV72Anc2 = AV62AnchoP[AV64t-1] ;
                  AV112Pieza3 = AV59Pieza[AV110y-1] ;
                  AV113Kgs3 = AV60KgsP[AV110y-1] ;
                  AV127Mts3 = AV61MtsP[AV110y-1] ;
                  AV130Anc3 = AV62AnchoP[AV110y-1] ;
                  AV77i1 = AV63i ;
                  AV78t2 = AV64t ;
                  AV111y2 = AV110y ;
                  if ( (GXutil.strcmp("", AV66Pieza2)==0) )
                  {
                     AV78t2 = (byte)(0) ;
                     AV111y2 = (byte)(0) ;
                  }
                  if ( (GXutil.strcmp("", AV112Pieza3)==0) )
                  {
                     AV111y2 = (byte)(0) ;
                  }
                  h7RK0( false, 17) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV65Pieza1, "")), 15, Gx_line+0, 111, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV67Kgs1, "ZZZ.ZZ")), 117, Gx_line+0, 162, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV66Pieza2, "")), 268, Gx_line+0, 364, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(11, Gx_line+0, 11, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(113, Gx_line+0, 113, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(165, Gx_line+0, 165, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(227, Gx_line+0, 227, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(227, Gx_line+0, 227, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(368, Gx_line+0, 368, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(428, Gx_line+0, 428, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(778, Gx_line+0, 778, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(11, Gx_line+0, 11, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV68Kgs2, "ZZZ.ZZ")), 372, Gx_line+0, 417, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV112Pieza3, "")), 535, Gx_line+0, 631, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV113Kgs3, "ZZZ.ZZ")), 635, Gx_line+0, 680, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(491, Gx_line+0, 491, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(491, Gx_line+0, 491, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(632, Gx_line+0, 632, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV69Mts1, "ZZZZ.ZZ")), 171, Gx_line+0, 223, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV70Mts2, "ZZZZ.ZZ")), 431, Gx_line+0, 483, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV127Mts3, "ZZZZ.ZZ")), 688, Gx_line+0, 740, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(682, Gx_line+0, 682, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV71Anc1), "ZZZ")), 230, Gx_line+0, 253, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(261, Gx_line+0, 261, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV72Anc2), "ZZZ")), 496, Gx_line+0, 519, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(529, Gx_line+0, 529, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV130Anc3), "ZZZ")), 749, Gx_line+0, 772, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(742, Gx_line+0, 742, Gx_line+17, 1, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+17) ;
                  AV48Linea2 = (byte)(AV48Linea2+1) ;
                  AV63i = (byte)(AV63i+1) ;
                  AV64t = (byte)(AV63i+AV75Npiezas) ;
                  AV110y = (byte)(AV64t+AV75Npiezas) ;
                  AV76p = (byte)(AV76p+1) ;
               }
            }
            h7RK0( false, 2) ;
            getPrinter().GxDrawLine(11, Gx_line+0, 779, Gx_line+0, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+2) ;
            AV48Linea2 = (byte)(AV48Linea2+1) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         GxHdr2 = false ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h7RK0( true, 0) ;
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
      /* 'MAQUIN' Routine */
      returnInSub = false ;
      AV24MaqDsc = "" ;
      /* Using cursor P07RK11 */
      pr_default.execute(8, new Object[] {A396EmprCod, AV26MaqCod});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A602MaqCod = P07RK11_A602MaqCod[0] ;
         A620MaqTip = P07RK11_A620MaqTip[0] ;
         n620MaqTip = P07RK11_n620MaqTip[0] ;
         A606MaqDsc = P07RK11_A606MaqDsc[0] ;
         n606MaqDsc = P07RK11_n606MaqDsc[0] ;
         AV24MaqDsc = A606MaqDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(8);
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'TIPART' Routine */
      returnInSub = false ;
      AV58TipARtDsc = "" ;
      /* Using cursor P07RK12 */
      pr_default.execute(9, new Object[] {A396EmprCod, Short.valueOf(AV57TipArtCod)});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A829TipArtCod = P07RK12_A829TipArtCod[0] ;
         A830TipArtDsc = P07RK12_A830TipArtDsc[0] ;
         n830TipArtDsc = P07RK12_n830TipArtDsc[0] ;
         AV58TipARtDsc = A830TipArtDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(9);
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'OBS' Routine */
      returnInSub = false ;
      AV84FlagObs = (byte)(0) ;
      /* Using cursor P07RK13 */
      pr_default.execute(10, new Object[] {AV25EmprCod, Integer.valueOf(AV30CliCod), AV28BarSer});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A3072ArtObsLon = P07RK13_A3072ArtObsLon[0] ;
         n3072ArtObsLon = P07RK13_n3072ArtObsLon[0] ;
         A65ArtCod = P07RK13_A65ArtCod[0] ;
         A252CliCod = P07RK13_A252CliCod[0] ;
         n252CliCod = P07RK13_n252CliCod[0] ;
         AV84FlagObs = (byte)(1) ;
         AV85Nlin = (short)(GXutil.gxmlines( A3072ArtObsLon, (short)(60))) ;
         AV86j = (short)(1) ;
         AV88z = (short)(1) ;
         while ( AV86j <= AV85Nlin )
         {
            if ( AV88z < 10 )
            {
               AV87Obstxt[AV88z-1] = GXutil.gxgetmli( A3072ArtObsLon, AV86j, (short)(60)) ;
            }
            AV86j = (short)(AV86j+1) ;
            AV88z = (short)(AV88z+1) ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(10);
   }

   public void S141( ) throws ProcessInterruptedException
   {
      /* 'TIPCOL' Routine */
      returnInSub = false ;
      AV21TipColDsc = " " ;
      /* Using cursor P07RK14 */
      pr_default.execute(11, new Object[] {A396EmprCod, Byte.valueOf(AV53TipColCod)});
      while ( (pr_default.getStatus(11) != 101) )
      {
         A831TipColCod = P07RK14_A831TipColCod[0] ;
         A832TipColDsc = P07RK14_A832TipColDsc[0] ;
         n832TipColDsc = P07RK14_n832TipColDsc[0] ;
         AV21TipColDsc = A832TipColDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(11);
   }

   public void S151( ) throws ProcessInterruptedException
   {
      /* 'SERPAU' Routine */
      returnInSub = false ;
      AV126Velocidad = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P07RK15 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(AV30CliCod), AV28BarSer, AV124Procod, AV125fascod});
      while ( (pr_default.getStatus(12) != 101) )
      {
         A457FasCod = P07RK15_A457FasCod[0] ;
         A758ProCod = P07RK15_A758ProCod[0] ;
         A65ArtCod = P07RK15_A65ArtCod[0] ;
         A252CliCod = P07RK15_A252CliCod[0] ;
         n252CliCod = P07RK15_n252CliCod[0] ;
         A8560ArtFasFac = P07RK15_A8560ArtFasFac[0] ;
         AV126Velocidad = A8560ArtFasFac ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(12);
   }

   public void S161( ) throws ProcessInterruptedException
   {
      /* 'ALBDET' Routine */
      returnInSub = false ;
      AV129AlbRecAnh = (short)(0) ;
      /* Using cursor P07RK16 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(AV128albreccod), AV52BarPieCod});
      while ( (pr_default.getStatus(13) != 101) )
      {
         A2159AlbRecPie = P07RK16_A2159AlbRecPie[0] ;
         A44AlbRecCod = P07RK16_A44AlbRecCod[0] ;
         A2154AlbRecAnh = P07RK16_A2154AlbRecAnh[0] ;
         AV129AlbRecAnh = A2154AlbRecAnh ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(13);
   }

   public void h7RK0( boolean bFoot ,
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
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Ph Inicial _________", ""), 19, Gx_line+22, 145, Gx_line+39, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Responsable __________", ""), 19, Gx_line+63, 175, Gx_line+80, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Ph Final _________", ""), 188, Gx_line+22, 309, Gx_line+39, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Responsable __________", ""), 188, Gx_line+63, 344, Gx_line+80, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "APROBACION TONO", ""), 350, Gx_line+5, 482, Gx_line+22, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Fecha _____", ""), 350, Gx_line+22, 429, Gx_line+39, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Nombre _________", ""), 451, Gx_line+22, 569, Gx_line+39, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Nombre _________", ""), 657, Gx_line+22, 775, Gx_line+39, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(11, Gx_line+0, 779, Gx_line+84, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(181, Gx_line+0, 181, Gx_line+84, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Fecha _____", ""), 576, Gx_line+22, 655, Gx_line+39, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(344, Gx_line+0, 344, Gx_line+84, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "APROBACION SOLIDEZ", ""), 350, Gx_line+43, 501, Gx_line+60, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Fecha _____", ""), 350, Gx_line+63, 429, Gx_line+80, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Nombre _________", ""), 450, Gx_line+63, 568, Gx_line+80, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Fecha _____", ""), 575, Gx_line+63, 654, Gx_line+80, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Nombre _________", ""), 656, Gx_line+63, 774, Gx_line+80, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+84) ;
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
            if ( GxHdr2 )
            {
               AV93BarAncAca1 = ((0==A125BarAncAca1) ? "" : GXutil.trim( GXutil.str( A125BarAncAca1, 10, 0))) ;
               AV94BarAncAca2 = ((0==A126BarAncAca2) ? "" : GXutil.trim( GXutil.str( A126BarAncAca2, 10, 0))) ;
               AV98Comma = ((0==A126BarAncAca2) ? "" : ",") ;
               AV95BarRdt = ((DecimalUtil.compareTo(DecimalUtil.ZERO, A211BarRdt)==0) ? "" : GXutil.trim( GXutil.str( A211BarRdt, 6, 2))) ;
               AV99BarGraAca = GXutil.trim( GXutil.str( A1909BarGraAca, 4, 0)) + "-" + GXutil.trim( GXutil.str( A3137BarGraAca2, 4, 0)) ;
               AV96BarKgm = ((DecimalUtil.compareTo(DecimalUtil.ZERO, A166BarKgm)==0) ? "" : GXutil.trim( GXutil.str( A166BarKgm, 9, 2))) ;
               AV100BarMtr = ((DecimalUtil.compareTo(DecimalUtil.ZERO, A184BarMtr)==0) ? "" : GXutil.trim( GXutil.str( A184BarMtr, 9, 2))) ;
               AV97BarPie = ((0==A198BarPie) ? "" : GXutil.trim( GXutil.str( A198BarPie, 10, 0))) ;
               AV118BarSerdsc = A1652BarSerDsc ;
               AV119bAReNCORI = A145BarEncOri ;
               AV120BARCORORI = A139BarCorOri ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( A369DisFec, "99/99/99"), 148, Gx_line+17, 201, Gx_line+35, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( A158BarFecFpr, "99/99/99"), 148, Gx_line+43, 201, Gx_line+61, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 81, Gx_line+149, 126, Gx_line+167, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 138, Gx_line+149, 327, Gx_line+167, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4812BarEncCli, "")), 81, Gx_line+170, 207, Gx_line+188, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A135BarColNom, "")), 506, Gx_line+110, 588, Gx_line+128, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9")), 599, Gx_line+110, 644, Gx_line+128, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A198BarPie), "ZZZZZ9")), 118, Gx_line+192, 163, Gx_line+210, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A166BarKgm, "ZZZZZ9.99")), 279, Gx_line+192, 346, Gx_line+210, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A184BarMtr, "ZZZZZ9.99")), 489, Gx_line+192, 556, Gx_line+210, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29HojRut, "")), 323, Gx_line+10, 407, Gx_line+31, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "DESCRIPCION/COMPOSICION", ""), 14, Gx_line+219, 207, Gx_line+236, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "KILOS", ""), 413, Gx_line+219, 454, Gx_line+236, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "METROS", ""), 484, Gx_line+219, 542, Gx_line+236, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "NP", ""), 552, Gx_line+219, 572, Gx_line+236, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "ARTICULO", ""), 617, Gx_line+217, 684, Gx_line+234, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV118BarSerdsc, "")), 14, Gx_line+247, 178, Gx_line+264, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV96BarKgm, "")), 365, Gx_line+247, 454, Gx_line+264, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV100BarMtr, "")), 453, Gx_line+247, 542, Gx_line+264, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(259, Gx_line+4, 779, Gx_line+36, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "HDR", ""), 272, Gx_line+11, 308, Gx_line+30, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "FECHA ENTRADA:", ""), 27, Gx_line+17, 145, Gx_line+34, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "FECHA COMPRO:", ""), 27, Gx_line+43, 142, Gx_line+60, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "CLIENTE:", ""), 15, Gx_line+149, 75, Gx_line+166, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "COLOR", ""), 433, Gx_line+110, 481, Gx_line+127, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "PEDIDO", ""), 15, Gx_line+170, 67, Gx_line+187, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "TOTAL PIEZAS:", ""), 15, Gx_line+192, 113, Gx_line+209, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "TOTAL KILOS:", ""), 180, Gx_line+192, 270, Gx_line+209, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "TOTAL METROS:", ""), 368, Gx_line+192, 475, Gx_line+209, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(0, Gx_line+215, 768, Gx_line+215, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A212BarSer, "")), 617, Gx_line+245, 718, Gx_line+262, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(11, Gx_line+239, 779, Gx_line+239, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV91HdrA[1-1], "")), 551, Gx_line+42, 609, Gx_line+59, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV91HdrA[2-1], "")), 625, Gx_line+42, 683, Gx_line+59, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV91HdrA[3-1], "")), 698, Gx_line+42, 756, Gx_line+59, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV91HdrA[4-1], "")), 551, Gx_line+61, 609, Gx_line+78, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV91HdrA[5-1], "")), 625, Gx_line+61, 683, Gx_line+78, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV91HdrA[6-1], "")), 698, Gx_line+61, 756, Gx_line+78, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Hdr(s) agrupadas:", ""), 438, Gx_line+42, 546, Gx_line+59, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(426, Gx_line+39, 779, Gx_line+104, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV97BarPie, "")), 543, Gx_line+247, 582, Gx_line+264, 1+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV116barmaccod), "ZZZZZZZ9")), 503, Gx_line+10, 579, Gx_line+31, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Partida", ""), 438, Gx_line+11, 492, Gx_line+30, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV91HdrA[7-1], "")), 551, Gx_line+82, 609, Gx_line+99, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV91HdrA[8-1], "")), 625, Gx_line+82, 683, Gx_line+99, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV91HdrA[9-1], "")), 698, Gx_line+84, 756, Gx_line+101, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Maquina", ""), 607, Gx_line+11, 671, Gx_line+30, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A180BarMaqCod, "")), 681, Gx_line+10, 776, Gx_line+31, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(15, Gx_line+95, 416, Gx_line+143, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV56TextoReop, "")), 24, Gx_line+99, 150, Gx_line+117, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV109TipDefdsc, "")), 24, Gx_line+118, 213, Gx_line+136, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "CORTAR ORILLOS", ""), 424, Gx_line+149, 541, Gx_line+166, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "ENGOMAR ORILLOS", ""), 409, Gx_line+170, 541, Gx_line+187, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV119bAReNCORI, "@!")), 567, Gx_line+170, 582, Gx_line+188, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV120BARCORORI, "@!")), 567, Gx_line+149, 582, Gx_line+167, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "CRUDO", ""), 572, Gx_line+192, 621, Gx_line+209, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV123VxArtDsc, "")), 645, Gx_line+192, 809, Gx_line+210, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21TipColDsc, "")), 433, Gx_line+128, 590, Gx_line+144, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(426, Gx_line+105, 779, Gx_line+146, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("3 of 9 Barcode", 20, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV80Hdr, "")), 215, Gx_line+70, 416, Gx_line+92, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1234BarNomCli, "")), 659, Gx_line+110, 741, Gx_line+128, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Tipo Art", ""), 14, Gx_line+264, 61, Gx_line+281, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV58TipARtDsc, "")), 14, Gx_line+286, 203, Gx_line+304, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "ANCHO", ""), 238, Gx_line+217, 287, Gx_line+234, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A125BarAncAca1), "ZZ9")), 238, Gx_line+247, 261, Gx_line+265, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A126BarAncAca2), "ZZ9")), 263, Gx_line+247, 286, Gx_line+265, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A211BarRdt, "ZZ9.99")), 294, Gx_line+247, 339, Gx_line+265, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "RDTO", ""), 301, Gx_line+217, 338, Gx_line+234, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Tipo Plegado", ""), 238, Gx_line+264, 317, Gx_line+281, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A206BarPle, "")), 238, Gx_line+286, 302, Gx_line+304, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(11, Gx_line+281, 779, Gx_line+281, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23IntDsc, "")), 684, Gx_line+128, 763, Gx_line+144, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV22IntCod), "Z9")), 664, Gx_line+128, 678, Gx_line+144, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV131fortonal, "")), 635, Gx_line+170, 761, Gx_line+188, 1+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "COD LIST.", ""), 666, Gx_line+149, 731, Gx_line+166, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+317) ;
               AV101BarTraP1 = ((0==A224BarTraP1) ? "" : GXutil.trim( GXutil.str( A224BarTraP1, 10, 0))) ;
               AV102BarTraP2 = ((0==A225BarTraP2) ? "" : GXutil.trim( GXutil.str( A225BarTraP2, 10, 0))) ;
               AV103BarTraP3 = ((0==A226BarTraP3) ? "" : GXutil.trim( GXutil.str( A226BarTraP3, 10, 0))) ;
               AV104BarUrdP1 = ((0==A232BarUrdP1) ? "" : GXutil.trim( GXutil.str( A232BarUrdP1, 10, 0))) ;
               AV105BarUrdP2 = ((0==A233BarUrdP2) ? "" : GXutil.trim( GXutil.str( A233BarUrdP2, 10, 0))) ;
               AV106BarUrdP3 = ((0==A234BarUrdP3) ? "" : GXutil.trim( GXutil.str( A234BarUrdP3, 10, 0))) ;
               AV107Porc[1-1] = ((GXutil.strcmp("", AV101BarTraP1)==0) ? "" : "%") ;
               AV107Porc[2-1] = ((GXutil.strcmp("", AV102BarTraP2)==0) ? "" : "%") ;
               AV107Porc[3-1] = ((GXutil.strcmp("", AV103BarTraP3)==0) ? "" : "%") ;
               AV107Porc[4-1] = ((GXutil.strcmp("", AV104BarUrdP1)==0) ? "" : "%") ;
               AV107Porc[5-1] = ((GXutil.strcmp("", AV105BarUrdP2)==0) ? "" : "%") ;
               AV107Porc[6-1] = ((GXutil.strcmp("", AV106BarUrdP3)==0) ? "" : "%") ;
            }
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
      this.aP0[0] = rhdrdo.this.A396EmprCod;
      this.aP1[0] = rhdrdo.this.A129BarCod;
      this.aP2[0] = rhdrdo.this.A132BarCodReo;
      this.aP3[0] = rhdrdo.this.A130BarCodPar;
      this.aP4[0] = rhdrdo.this.Gx_out;
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
      P07RK3_A833TipDefCod = new short[1] ;
      P07RK3_n833TipDefCod = new boolean[] {false} ;
      P07RK3_A396EmprCod = new String[] {""} ;
      P07RK3_A129BarCod = new int[1] ;
      P07RK3_A132BarCodReo = new byte[1] ;
      P07RK3_A130BarCodPar = new String[] {""} ;
      P07RK3_A125BarAncAca1 = new short[1] ;
      P07RK3_A361DisCod = new int[1] ;
      P07RK3_A218BarTipCol = new byte[1] ;
      P07RK3_A148BarEstReo = new byte[1] ;
      P07RK3_A834TipDefDsc = new String[] {""} ;
      P07RK3_n834TipDefDsc = new boolean[] {false} ;
      P07RK3_A217BarTipArt = new short[1] ;
      P07RK3_n217BarTipArt = new boolean[] {false} ;
      P07RK3_A2311BarCliDes = new int[1] ;
      P07RK3_A5253BarAcc = new String[] {""} ;
      P07RK3_A126BarAncAca2 = new short[1] ;
      P07RK3_A211BarRdt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07RK3_A3137BarGraAca2 = new short[1] ;
      P07RK3_A1909BarGraAca = new short[1] ;
      P07RK3_A1652BarSerDsc = new String[] {""} ;
      P07RK3_A145BarEncOri = new String[] {""} ;
      P07RK3_A139BarCorOri = new String[] {""} ;
      P07RK3_A206BarPle = new String[] {""} ;
      P07RK3_A1234BarNomCli = new String[] {""} ;
      P07RK3_A180BarMaqCod = new String[] {""} ;
      P07RK3_A212BarSer = new String[] {""} ;
      P07RK3_A136BarColNum = new int[1] ;
      P07RK3_A135BarColNom = new String[] {""} ;
      P07RK3_A4812BarEncCli = new String[] {""} ;
      P07RK3_A279CliNom = new String[] {""} ;
      P07RK3_A252CliCod = new int[1] ;
      P07RK3_n252CliCod = new boolean[] {false} ;
      P07RK3_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P07RK3_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      P07RK3_A224BarTraP1 = new short[1] ;
      P07RK3_A225BarTraP2 = new short[1] ;
      P07RK3_A226BarTraP3 = new short[1] ;
      P07RK3_A232BarUrdP1 = new short[1] ;
      P07RK3_A233BarUrdP2 = new short[1] ;
      P07RK3_A234BarUrdP3 = new short[1] ;
      P07RK3_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07RK3_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07RK3_A199BarPie1 = new short[1] ;
      P07RK3_A365DisDes = new String[] {""} ;
      P07RK3_A898BarPieNDes = new int[1] ;
      A834TipDefDsc = "" ;
      A5253BarAcc = "" ;
      A211BarRdt = DecimalUtil.ZERO ;
      A1652BarSerDsc = "" ;
      A145BarEncOri = "" ;
      A139BarCorOri = "" ;
      A206BarPle = "" ;
      A1234BarNomCli = "" ;
      A180BarMaqCod = "" ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A4812BarEncCli = "" ;
      A279CliNom = "" ;
      A158BarFecFpr = GXutil.nullDate() ;
      A369DisFec = GXutil.nullDate() ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A365DisDes = "" ;
      AV91HdrA = new String[10] ;
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV91HdrA[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P07RK4_A396EmprCod = new String[] {""} ;
      P07RK4_A129BarCod = new int[1] ;
      P07RK4_A132BarCodReo = new byte[1] ;
      P07RK4_A130BarCodPar = new String[] {""} ;
      P07RK4_A122BarAgrPar = new String[] {""} ;
      P07RK4_A124BarAgrReo = new byte[1] ;
      P07RK4_A119BarAgrCod = new int[1] ;
      A122BarAgrPar = "" ;
      AV29HojRut = "" ;
      AV81Ceros8 = "" ;
      AV82HdrAlfa = "" ;
      AV80Hdr = "" ;
      AV28BarSer = "" ;
      AV25EmprCod = "" ;
      AV33ForColNom = "" ;
      AV56TextoReop = "" ;
      AV109TipDefdsc = "" ;
      AV73BarSer9 = "" ;
      GXv_int2 = new int[1] ;
      GXv_int5 = new int[1] ;
      GXv_int6 = new byte[1] ;
      AV23IntDsc = "" ;
      AV117Texo_st = "" ;
      GXv_char9 = new String[1] ;
      GXv_char8 = new String[1] ;
      GXv_int11 = new short[1] ;
      GXv_int7 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int10 = new int[1] ;
      AV131fortonal = "" ;
      GXv_char1 = new String[1] ;
      GXv_char12 = new String[1] ;
      GXv_int13 = new short[1] ;
      GXv_char14 = new String[1] ;
      GXv_char15 = new String[1] ;
      AV87Obstxt = new String[10] ;
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV87Obstxt[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P07RK5_A396EmprCod = new String[] {""} ;
      P07RK5_A129BarCod = new int[1] ;
      P07RK5_A132BarCodReo = new byte[1] ;
      P07RK5_A130BarCodPar = new String[] {""} ;
      P07RK5_A759ProDsc = new String[] {""} ;
      P07RK5_A758ProCod = new String[] {""} ;
      A759ProDsc = "" ;
      A758ProCod = "" ;
      P07RK6_A396EmprCod = new String[] {""} ;
      P07RK6_A129BarCod = new int[1] ;
      P07RK6_A132BarCodReo = new byte[1] ;
      P07RK6_A130BarCodPar = new String[] {""} ;
      P07RK6_A194BarOrdLin = new short[1] ;
      P07RK6_A758ProCod = new String[] {""} ;
      P07RK6_A6173BarFasSec = new String[] {""} ;
      P07RK6_n6173BarFasSec = new boolean[] {false} ;
      P07RK6_A603MaqCodBis = new String[] {""} ;
      P07RK6_A457FasCod = new String[] {""} ;
      P07RK6_A472FasVelPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07RK6_n472FasVelPro = new boolean[] {false} ;
      P07RK6_A152BarFasCon = new String[] {""} ;
      P07RK6_A460FasDsc = new String[] {""} ;
      P07RK6_A4905BarFasAcab = new String[] {""} ;
      A6173BarFasSec = "" ;
      A603MaqCodBis = "" ;
      A457FasCod = "" ;
      A472FasVelPro = DecimalUtil.ZERO ;
      A152BarFasCon = "" ;
      A460FasDsc = "" ;
      A4905BarFasAcab = "" ;
      AV26MaqCod = "" ;
      AV124Procod = "" ;
      AV125fascod = "" ;
      AV126Velocidad = DecimalUtil.ZERO ;
      AV24MaqDsc = "" ;
      AV121Texto_ra = "" ;
      P07RK7_A396EmprCod = new String[] {""} ;
      P07RK7_A129BarCod = new int[1] ;
      P07RK7_A132BarCodReo = new byte[1] ;
      P07RK7_A130BarCodPar = new String[] {""} ;
      P07RK7_A758ProCod = new String[] {""} ;
      P07RK7_A194BarOrdLin = new short[1] ;
      P07RK7_A764ProForCod = new String[] {""} ;
      P07RK7_A5371FasQuiLin = new short[1] ;
      A764ProForCod = "" ;
      P07RK8_A396EmprCod = new String[] {""} ;
      P07RK8_A361DisCod = new int[1] ;
      P07RK8_A377DisObsTxt = new String[] {""} ;
      P07RK8_A376DisObsLin = new byte[1] ;
      A377DisObsTxt = "" ;
      AV89AlbrLoc = new String[10] ;
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV89AlbrLoc[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P07RK9_A44AlbRecCod = new int[1] ;
      P07RK9_A396EmprCod = new String[] {""} ;
      P07RK9_A361DisCod = new int[1] ;
      P07RK9_A3700MetrosUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07RK9_n3700MetrosUti = new boolean[] {false} ;
      P07RK9_A50AlbRLoc = new String[] {""} ;
      A3700MetrosUti = DecimalUtil.ZERO ;
      A50AlbRLoc = "" ;
      AV59Pieza = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV59Pieza[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV60KgsP = new java.math.BigDecimal[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV60KgsP[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV61MtsP = new java.math.BigDecimal[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV61MtsP[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV62AnchoP = new short[100] ;
      P07RK10_A396EmprCod = new String[] {""} ;
      P07RK10_A129BarCod = new int[1] ;
      P07RK10_A132BarCodReo = new byte[1] ;
      P07RK10_A130BarCodPar = new String[] {""} ;
      P07RK10_A44AlbRecCod = new int[1] ;
      P07RK10_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07RK10_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07RK10_A200BarPieCod = new String[] {""} ;
      A203BarPieKil = DecimalUtil.ZERO ;
      A205BarPieMet = DecimalUtil.ZERO ;
      A200BarPieCod = "" ;
      AV52BarPieCod = "" ;
      AV65Pieza1 = "" ;
      AV67Kgs1 = DecimalUtil.ZERO ;
      AV69Mts1 = DecimalUtil.ZERO ;
      AV66Pieza2 = "" ;
      AV68Kgs2 = DecimalUtil.ZERO ;
      AV70Mts2 = DecimalUtil.ZERO ;
      AV112Pieza3 = "" ;
      AV113Kgs3 = DecimalUtil.ZERO ;
      AV127Mts3 = DecimalUtil.ZERO ;
      P07RK11_A396EmprCod = new String[] {""} ;
      P07RK11_A602MaqCod = new String[] {""} ;
      P07RK11_A620MaqTip = new String[] {""} ;
      P07RK11_n620MaqTip = new boolean[] {false} ;
      P07RK11_A606MaqDsc = new String[] {""} ;
      P07RK11_n606MaqDsc = new boolean[] {false} ;
      A602MaqCod = "" ;
      A620MaqTip = "" ;
      A606MaqDsc = "" ;
      AV58TipARtDsc = "" ;
      P07RK12_A396EmprCod = new String[] {""} ;
      P07RK12_A829TipArtCod = new short[1] ;
      P07RK12_A830TipArtDsc = new String[] {""} ;
      P07RK12_n830TipArtDsc = new boolean[] {false} ;
      A830TipArtDsc = "" ;
      P07RK13_A3072ArtObsLon = new String[] {""} ;
      P07RK13_n3072ArtObsLon = new boolean[] {false} ;
      P07RK13_A65ArtCod = new String[] {""} ;
      P07RK13_A252CliCod = new int[1] ;
      P07RK13_n252CliCod = new boolean[] {false} ;
      P07RK13_A396EmprCod = new String[] {""} ;
      A3072ArtObsLon = "" ;
      A65ArtCod = "" ;
      AV21TipColDsc = "" ;
      P07RK14_A396EmprCod = new String[] {""} ;
      P07RK14_A831TipColCod = new byte[1] ;
      P07RK14_A832TipColDsc = new String[] {""} ;
      P07RK14_n832TipColDsc = new boolean[] {false} ;
      A832TipColDsc = "" ;
      P07RK15_A396EmprCod = new String[] {""} ;
      P07RK15_A457FasCod = new String[] {""} ;
      P07RK15_A758ProCod = new String[] {""} ;
      P07RK15_A65ArtCod = new String[] {""} ;
      P07RK15_A252CliCod = new int[1] ;
      P07RK15_n252CliCod = new boolean[] {false} ;
      P07RK15_A8560ArtFasFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A8560ArtFasFac = DecimalUtil.ZERO ;
      P07RK16_A396EmprCod = new String[] {""} ;
      P07RK16_A2159AlbRecPie = new String[] {""} ;
      P07RK16_A44AlbRecCod = new int[1] ;
      P07RK16_A2154AlbRecAnh = new short[1] ;
      A2159AlbRecPie = "" ;
      AV93BarAncAca1 = "" ;
      AV94BarAncAca2 = "" ;
      AV98Comma = "" ;
      AV95BarRdt = "" ;
      AV99BarGraAca = "" ;
      AV96BarKgm = "" ;
      AV100BarMtr = "" ;
      AV97BarPie = "" ;
      AV118BarSerdsc = "" ;
      AV119bAReNCORI = "" ;
      AV120BARCORORI = "" ;
      AV123VxArtDsc = "" ;
      AV101BarTraP1 = "" ;
      AV102BarTraP2 = "" ;
      AV103BarTraP3 = "" ;
      AV104BarUrdP1 = "" ;
      AV105BarUrdP2 = "" ;
      AV106BarUrdP3 = "" ;
      AV107Porc = new String[6] ;
      GX_I = 1 ;
      while ( GX_I <= 6 )
      {
         AV107Porc[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rhdrdo__default(),
         new Object[] {
             new Object[] {
            P07RK3_A833TipDefCod, P07RK3_n833TipDefCod, P07RK3_A396EmprCod, P07RK3_A129BarCod, P07RK3_A132BarCodReo, P07RK3_A130BarCodPar, P07RK3_A125BarAncAca1, P07RK3_A361DisCod, P07RK3_A218BarTipCol, P07RK3_A148BarEstReo,
            P07RK3_A834TipDefDsc, P07RK3_n834TipDefDsc, P07RK3_A217BarTipArt, P07RK3_n217BarTipArt, P07RK3_A2311BarCliDes, P07RK3_A5253BarAcc, P07RK3_A126BarAncAca2, P07RK3_A211BarRdt, P07RK3_A3137BarGraAca2, P07RK3_A1909BarGraAca,
            P07RK3_A1652BarSerDsc, P07RK3_A145BarEncOri, P07RK3_A139BarCorOri, P07RK3_A206BarPle, P07RK3_A1234BarNomCli, P07RK3_A180BarMaqCod, P07RK3_A212BarSer, P07RK3_A136BarColNum, P07RK3_A135BarColNom, P07RK3_A4812BarEncCli,
            P07RK3_A279CliNom, P07RK3_A252CliCod, P07RK3_n252CliCod, P07RK3_A158BarFecFpr, P07RK3_A369DisFec, P07RK3_A224BarTraP1, P07RK3_A225BarTraP2, P07RK3_A226BarTraP3, P07RK3_A232BarUrdP1, P07RK3_A233BarUrdP2,
            P07RK3_A234BarUrdP3, P07RK3_A166BarKgm, P07RK3_A184BarMtr, P07RK3_A199BarPie1, P07RK3_A365DisDes, P07RK3_A898BarPieNDes
            }
            , new Object[] {
            P07RK4_A396EmprCod, P07RK4_A129BarCod, P07RK4_A132BarCodReo, P07RK4_A130BarCodPar, P07RK4_A122BarAgrPar, P07RK4_A124BarAgrReo, P07RK4_A119BarAgrCod
            }
            , new Object[] {
            P07RK5_A396EmprCod, P07RK5_A129BarCod, P07RK5_A132BarCodReo, P07RK5_A130BarCodPar, P07RK5_A759ProDsc, P07RK5_A758ProCod
            }
            , new Object[] {
            P07RK6_A396EmprCod, P07RK6_A129BarCod, P07RK6_A132BarCodReo, P07RK6_A130BarCodPar, P07RK6_A194BarOrdLin, P07RK6_A758ProCod, P07RK6_A6173BarFasSec, P07RK6_n6173BarFasSec, P07RK6_A603MaqCodBis, P07RK6_A457FasCod,
            P07RK6_A472FasVelPro, P07RK6_n472FasVelPro, P07RK6_A152BarFasCon, P07RK6_A460FasDsc, P07RK6_A4905BarFasAcab
            }
            , new Object[] {
            P07RK7_A396EmprCod, P07RK7_A129BarCod, P07RK7_A132BarCodReo, P07RK7_A130BarCodPar, P07RK7_A758ProCod, P07RK7_A194BarOrdLin, P07RK7_A764ProForCod, P07RK7_A5371FasQuiLin
            }
            , new Object[] {
            P07RK8_A396EmprCod, P07RK8_A361DisCod, P07RK8_A377DisObsTxt, P07RK8_A376DisObsLin
            }
            , new Object[] {
            P07RK9_A44AlbRecCod, P07RK9_A396EmprCod, P07RK9_A361DisCod, P07RK9_A3700MetrosUti, P07RK9_n3700MetrosUti, P07RK9_A50AlbRLoc
            }
            , new Object[] {
            P07RK10_A396EmprCod, P07RK10_A129BarCod, P07RK10_A132BarCodReo, P07RK10_A130BarCodPar, P07RK10_A44AlbRecCod, P07RK10_A203BarPieKil, P07RK10_A205BarPieMet, P07RK10_A200BarPieCod
            }
            , new Object[] {
            P07RK11_A396EmprCod, P07RK11_A602MaqCod, P07RK11_A620MaqTip, P07RK11_n620MaqTip, P07RK11_A606MaqDsc, P07RK11_n606MaqDsc
            }
            , new Object[] {
            P07RK12_A396EmprCod, P07RK12_A829TipArtCod, P07RK12_A830TipArtDsc, P07RK12_n830TipArtDsc
            }
            , new Object[] {
            P07RK13_A3072ArtObsLon, P07RK13_n3072ArtObsLon, P07RK13_A65ArtCod, P07RK13_A252CliCod, P07RK13_A396EmprCod
            }
            , new Object[] {
            P07RK14_A396EmprCod, P07RK14_A831TipColCod, P07RK14_A832TipColDsc, P07RK14_n832TipColDsc
            }
            , new Object[] {
            P07RK15_A396EmprCod, P07RK15_A457FasCod, P07RK15_A758ProCod, P07RK15_A65ArtCod, P07RK15_A252CliCod, P07RK15_A8560ArtFasFac
            }
            , new Object[] {
            P07RK16_A396EmprCod, P07RK16_A2159AlbRecPie, P07RK16_A44AlbRecCod, P07RK16_A2154AlbRecAnh
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A218BarTipCol ;
   private byte A148BarEstReo ;
   private byte AV92ContHr ;
   private byte A124BarAgrReo ;
   private byte AV83LenVar ;
   private byte AV53TipColCod ;
   private byte GXv_int6[] ;
   private byte AV22IntCod ;
   private byte GXv_int7[] ;
   private byte AV139GXLvl113 ;
   private byte AV84FlagObs ;
   private byte A376DisObsLin ;
   private byte AV63i ;
   private byte AV75Npiezas ;
   private byte AV64t ;
   private byte AV110y ;
   private byte AV76p ;
   private byte AV48Linea2 ;
   private byte AV77i1 ;
   private byte AV78t2 ;
   private byte AV111y2 ;
   private byte A831TipColCod ;
   private short A833TipDefCod ;
   private short A125BarAncAca1 ;
   private short A217BarTipArt ;
   private short A126BarAncAca2 ;
   private short A3137BarGraAca2 ;
   private short A1909BarGraAca ;
   private short A224BarTraP1 ;
   private short A225BarTraP2 ;
   private short A226BarTraP3 ;
   private short A232BarUrdP1 ;
   private short A233BarUrdP2 ;
   private short A234BarUrdP3 ;
   private short A199BarPie1 ;
   private short AV57TipArtCod ;
   private short GXv_int11[] ;
   private short GXv_int13[] ;
   private short A194BarOrdLin ;
   private short A5371FasQuiLin ;
   private short AV62AnchoP[] ;
   private short AV129AlbRecAnh ;
   private short AV71Anc1 ;
   private short AV72Anc2 ;
   private short AV130Anc3 ;
   private short A829TipArtCod ;
   private short AV85Nlin ;
   private short AV86j ;
   private short AV88z ;
   private short A2154AlbRecAnh ;
   private short Gx_err ;
   private int A129BarCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A361DisCod ;
   private int A2311BarCliDes ;
   private int A136BarColNum ;
   private int A252CliCod ;
   private int A898BarPieNDes ;
   private int A198BarPie ;
   private int GX_I ;
   private int A119BarAgrCod ;
   private int AV30CliCod ;
   private int AV34ForColNum ;
   private int AV114BarCliDes ;
   private int GXv_int2[] ;
   private int GXv_int5[] ;
   private int AV116barmaccod ;
   private int GXv_int10[] ;
   private int Gx_OldLine ;
   private int A44AlbRecCod ;
   private int AV128albreccod ;
   private java.math.BigDecimal A211BarRdt ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal A472FasVelPro ;
   private java.math.BigDecimal AV126Velocidad ;
   private java.math.BigDecimal A3700MetrosUti ;
   private java.math.BigDecimal AV60KgsP[] ;
   private java.math.BigDecimal AV61MtsP[] ;
   private java.math.BigDecimal A203BarPieKil ;
   private java.math.BigDecimal A205BarPieMet ;
   private java.math.BigDecimal AV67Kgs1 ;
   private java.math.BigDecimal AV69Mts1 ;
   private java.math.BigDecimal AV68Kgs2 ;
   private java.math.BigDecimal AV70Mts2 ;
   private java.math.BigDecimal AV113Kgs3 ;
   private java.math.BigDecimal AV127Mts3 ;
   private java.math.BigDecimal A8560ArtFasFac ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String Gx_out ;
   private String scmdbuf ;
   private String A834TipDefDsc ;
   private String A5253BarAcc ;
   private String A1652BarSerDsc ;
   private String A145BarEncOri ;
   private String A139BarCorOri ;
   private String A206BarPle ;
   private String A1234BarNomCli ;
   private String A180BarMaqCod ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A4812BarEncCli ;
   private String A279CliNom ;
   private String A365DisDes ;
   private String AV91HdrA[] ;
   private String A122BarAgrPar ;
   private String AV29HojRut ;
   private String AV81Ceros8 ;
   private String AV82HdrAlfa ;
   private String AV80Hdr ;
   private String AV28BarSer ;
   private String AV25EmprCod ;
   private String AV33ForColNom ;
   private String AV56TextoReop ;
   private String AV109TipDefdsc ;
   private String AV73BarSer9 ;
   private String AV23IntDsc ;
   private String AV117Texo_st ;
   private String GXv_char9[] ;
   private String GXv_char8[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String AV131fortonal ;
   private String GXv_char1[] ;
   private String GXv_char12[] ;
   private String GXv_char14[] ;
   private String GXv_char15[] ;
   private String AV87Obstxt[] ;
   private String A759ProDsc ;
   private String A758ProCod ;
   private String A6173BarFasSec ;
   private String A603MaqCodBis ;
   private String A457FasCod ;
   private String A152BarFasCon ;
   private String A460FasDsc ;
   private String A4905BarFasAcab ;
   private String AV26MaqCod ;
   private String AV124Procod ;
   private String AV125fascod ;
   private String AV24MaqDsc ;
   private String AV121Texto_ra ;
   private String A764ProForCod ;
   private String A377DisObsTxt ;
   private String AV89AlbrLoc[] ;
   private String A50AlbRLoc ;
   private String AV59Pieza[] ;
   private String A200BarPieCod ;
   private String AV52BarPieCod ;
   private String AV65Pieza1 ;
   private String AV66Pieza2 ;
   private String AV112Pieza3 ;
   private String A602MaqCod ;
   private String A620MaqTip ;
   private String A606MaqDsc ;
   private String AV58TipARtDsc ;
   private String A830TipArtDsc ;
   private String A65ArtCod ;
   private String AV21TipColDsc ;
   private String A832TipColDsc ;
   private String A2159AlbRecPie ;
   private String AV93BarAncAca1 ;
   private String AV94BarAncAca2 ;
   private String AV98Comma ;
   private String AV95BarRdt ;
   private String AV99BarGraAca ;
   private String AV96BarKgm ;
   private String AV100BarMtr ;
   private String AV97BarPie ;
   private String AV118BarSerdsc ;
   private String AV119bAReNCORI ;
   private String AV120BARCORORI ;
   private String AV123VxArtDsc ;
   private String AV101BarTraP1 ;
   private String AV102BarTraP2 ;
   private String AV103BarTraP3 ;
   private String AV104BarUrdP1 ;
   private String AV105BarUrdP2 ;
   private String AV106BarUrdP3 ;
   private String AV107Porc[] ;
   private java.util.Date A158BarFecFpr ;
   private java.util.Date A369DisFec ;
   private boolean GxHdr2 ;
   private boolean n833TipDefCod ;
   private boolean n834TipDefDsc ;
   private boolean n217BarTipArt ;
   private boolean n252CliCod ;
   private boolean returnInSub ;
   private boolean n6173BarFasSec ;
   private boolean n472FasVelPro ;
   private boolean n3700MetrosUti ;
   private boolean n620MaqTip ;
   private boolean n606MaqDsc ;
   private boolean n830TipArtDsc ;
   private boolean n3072ArtObsLon ;
   private boolean n832TipColDsc ;
   private String A3072ArtObsLon ;
   private String[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private short[] P07RK3_A833TipDefCod ;
   private boolean[] P07RK3_n833TipDefCod ;
   private String[] P07RK3_A396EmprCod ;
   private int[] P07RK3_A129BarCod ;
   private byte[] P07RK3_A132BarCodReo ;
   private String[] P07RK3_A130BarCodPar ;
   private short[] P07RK3_A125BarAncAca1 ;
   private int[] P07RK3_A361DisCod ;
   private byte[] P07RK3_A218BarTipCol ;
   private byte[] P07RK3_A148BarEstReo ;
   private String[] P07RK3_A834TipDefDsc ;
   private boolean[] P07RK3_n834TipDefDsc ;
   private short[] P07RK3_A217BarTipArt ;
   private boolean[] P07RK3_n217BarTipArt ;
   private int[] P07RK3_A2311BarCliDes ;
   private String[] P07RK3_A5253BarAcc ;
   private short[] P07RK3_A126BarAncAca2 ;
   private java.math.BigDecimal[] P07RK3_A211BarRdt ;
   private short[] P07RK3_A3137BarGraAca2 ;
   private short[] P07RK3_A1909BarGraAca ;
   private String[] P07RK3_A1652BarSerDsc ;
   private String[] P07RK3_A145BarEncOri ;
   private String[] P07RK3_A139BarCorOri ;
   private String[] P07RK3_A206BarPle ;
   private String[] P07RK3_A1234BarNomCli ;
   private String[] P07RK3_A180BarMaqCod ;
   private String[] P07RK3_A212BarSer ;
   private int[] P07RK3_A136BarColNum ;
   private String[] P07RK3_A135BarColNom ;
   private String[] P07RK3_A4812BarEncCli ;
   private String[] P07RK3_A279CliNom ;
   private int[] P07RK3_A252CliCod ;
   private boolean[] P07RK3_n252CliCod ;
   private java.util.Date[] P07RK3_A158BarFecFpr ;
   private java.util.Date[] P07RK3_A369DisFec ;
   private short[] P07RK3_A224BarTraP1 ;
   private short[] P07RK3_A225BarTraP2 ;
   private short[] P07RK3_A226BarTraP3 ;
   private short[] P07RK3_A232BarUrdP1 ;
   private short[] P07RK3_A233BarUrdP2 ;
   private short[] P07RK3_A234BarUrdP3 ;
   private java.math.BigDecimal[] P07RK3_A166BarKgm ;
   private java.math.BigDecimal[] P07RK3_A184BarMtr ;
   private short[] P07RK3_A199BarPie1 ;
   private String[] P07RK3_A365DisDes ;
   private int[] P07RK3_A898BarPieNDes ;
   private String[] P07RK4_A396EmprCod ;
   private int[] P07RK4_A129BarCod ;
   private byte[] P07RK4_A132BarCodReo ;
   private String[] P07RK4_A130BarCodPar ;
   private String[] P07RK4_A122BarAgrPar ;
   private byte[] P07RK4_A124BarAgrReo ;
   private int[] P07RK4_A119BarAgrCod ;
   private String[] P07RK5_A396EmprCod ;
   private int[] P07RK5_A129BarCod ;
   private byte[] P07RK5_A132BarCodReo ;
   private String[] P07RK5_A130BarCodPar ;
   private String[] P07RK5_A759ProDsc ;
   private String[] P07RK5_A758ProCod ;
   private String[] P07RK6_A396EmprCod ;
   private int[] P07RK6_A129BarCod ;
   private byte[] P07RK6_A132BarCodReo ;
   private String[] P07RK6_A130BarCodPar ;
   private short[] P07RK6_A194BarOrdLin ;
   private String[] P07RK6_A758ProCod ;
   private String[] P07RK6_A6173BarFasSec ;
   private boolean[] P07RK6_n6173BarFasSec ;
   private String[] P07RK6_A603MaqCodBis ;
   private String[] P07RK6_A457FasCod ;
   private java.math.BigDecimal[] P07RK6_A472FasVelPro ;
   private boolean[] P07RK6_n472FasVelPro ;
   private String[] P07RK6_A152BarFasCon ;
   private String[] P07RK6_A460FasDsc ;
   private String[] P07RK6_A4905BarFasAcab ;
   private String[] P07RK7_A396EmprCod ;
   private int[] P07RK7_A129BarCod ;
   private byte[] P07RK7_A132BarCodReo ;
   private String[] P07RK7_A130BarCodPar ;
   private String[] P07RK7_A758ProCod ;
   private short[] P07RK7_A194BarOrdLin ;
   private String[] P07RK7_A764ProForCod ;
   private short[] P07RK7_A5371FasQuiLin ;
   private String[] P07RK8_A396EmprCod ;
   private int[] P07RK8_A361DisCod ;
   private String[] P07RK8_A377DisObsTxt ;
   private byte[] P07RK8_A376DisObsLin ;
   private int[] P07RK9_A44AlbRecCod ;
   private String[] P07RK9_A396EmprCod ;
   private int[] P07RK9_A361DisCod ;
   private java.math.BigDecimal[] P07RK9_A3700MetrosUti ;
   private boolean[] P07RK9_n3700MetrosUti ;
   private String[] P07RK9_A50AlbRLoc ;
   private String[] P07RK10_A396EmprCod ;
   private int[] P07RK10_A129BarCod ;
   private byte[] P07RK10_A132BarCodReo ;
   private String[] P07RK10_A130BarCodPar ;
   private int[] P07RK10_A44AlbRecCod ;
   private java.math.BigDecimal[] P07RK10_A203BarPieKil ;
   private java.math.BigDecimal[] P07RK10_A205BarPieMet ;
   private String[] P07RK10_A200BarPieCod ;
   private String[] P07RK11_A396EmprCod ;
   private String[] P07RK11_A602MaqCod ;
   private String[] P07RK11_A620MaqTip ;
   private boolean[] P07RK11_n620MaqTip ;
   private String[] P07RK11_A606MaqDsc ;
   private boolean[] P07RK11_n606MaqDsc ;
   private String[] P07RK12_A396EmprCod ;
   private short[] P07RK12_A829TipArtCod ;
   private String[] P07RK12_A830TipArtDsc ;
   private boolean[] P07RK12_n830TipArtDsc ;
   private String[] P07RK13_A3072ArtObsLon ;
   private boolean[] P07RK13_n3072ArtObsLon ;
   private String[] P07RK13_A65ArtCod ;
   private int[] P07RK13_A252CliCod ;
   private boolean[] P07RK13_n252CliCod ;
   private String[] P07RK13_A396EmprCod ;
   private String[] P07RK14_A396EmprCod ;
   private byte[] P07RK14_A831TipColCod ;
   private String[] P07RK14_A832TipColDsc ;
   private boolean[] P07RK14_n832TipColDsc ;
   private String[] P07RK15_A396EmprCod ;
   private String[] P07RK15_A457FasCod ;
   private String[] P07RK15_A758ProCod ;
   private String[] P07RK15_A65ArtCod ;
   private int[] P07RK15_A252CliCod ;
   private boolean[] P07RK15_n252CliCod ;
   private java.math.BigDecimal[] P07RK15_A8560ArtFasFac ;
   private String[] P07RK16_A396EmprCod ;
   private String[] P07RK16_A2159AlbRecPie ;
   private int[] P07RK16_A44AlbRecCod ;
   private short[] P07RK16_A2154AlbRecAnh ;
}

final  class rhdrdo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07RK3", "SELECT T1.TipDefCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarAncAca1, T1.DisCod, T1.BarTipCol, T1.BarEstReo, T3.TipDefDsc, T1.BarTipArt, T1.BarCliDes, T1.BarAcc, T1.BarAncAca2, T1.BarRdt, T1.BarGraAca2, T1.BarGraAca, T1.BarSerDsc, T1.BarEncOri, T1.BarCorOri, T1.BarPle, T1.BarNomCli, T1.BarMaqCod, T1.BarSer, T1.BarColNum, T1.BarColNom, T1.BarEncCli, T4.CliNom, T1.CliCod, T1.BarFecFpr, T2.DisFec, T1.BarTraP1, T1.BarTraP2, T1.BarTraP3, T1.BarUrdP1, T1.BarUrdP2, T1.BarUrdP3, COALESCE( T5.BarKgm, 0) AS BarKgm, COALESCE( T5.BarMtr, 0) AS BarMtr, COALESCE( T5.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T5.BarPieNDes, 0) AS BarPieNDes FROM ((((TXPBARCAD T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) LEFT JOIN TXPTIPDEF T3 ON T3.EmprCod = T1.EmprCod AND T3.TipDefCod = T1.TipDefCod) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T1.CliCod) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod = T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07RK4", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrPar, BarAgrReo, BarAgrCod FROM TXPBARAGR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07RK5", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.ProDsc, T1.ProCod FROM (TXPBARPRO T1 INNER JOIN TXPPROCES T2 ON T2.EmprCod = T1.EmprCod AND T2.ProCod = T1.ProCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07RK6", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarOrdLin, T1.ProCod, T1.BarFasSec, T1.MaqCodBis, T1.FasCod, T2.FasVelPro, T1.BarFasCon, T2.FasDsc, T1.BarFasAcab FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07RK7", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, ProForCod, FasQuiLin FROM TXPFASQUI WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, FasQuiLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07RK8", "SELECT EmprCod, DisCod, DisObsTxt, DisObsLin FROM TXPOBSERV WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod, DisObsLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07RK9", "SELECT T1.AlbRecCod, T1.EmprCod, T1.DisCod, T1.MetrosUti, T2.AlbRLoc FROM (TXPDISALB T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.DisCod = ? ORDER BY T1.EmprCod, T1.DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07RK10", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, AlbRecCod, BarPieKil, BarPieMet, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07RK11", "SELECT EmprCod, MaqCod, MaqTip, MaqDsc FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07RK12", "SELECT EmprCod, TipArtCod, TipArtDsc FROM TXPTIPART WHERE EmprCod = ? and TipArtCod = ? ORDER BY EmprCod, TipArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07RK13", "SELECT ArtObsLon, ArtCod, CliCod, EmprCod FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07RK14", "SELECT EmprCod, TipColCod, TipColDsc FROM TXPTIPCOL WHERE EmprCod = ? and TipColCod = ? ORDER BY EmprCod, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07RK15", "SELECT EmprCod, FasCod, ProCod, ArtCod, CliCod, ArtFasFac FROM TXPSERPAU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ProCod = ? and FasCod = ? ORDER BY EmprCod, CliCod, ArtCod, ProCod, FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07RK16", "SELECT EmprCod, AlbRecPie, AlbRecCod, AlbRecAnh FROM TXPALBDET WHERE EmprCod = ? and AlbRecCod = ? and AlbRecPie = ? ORDER BY EmprCod, AlbRecCod, AlbRecPie ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(11);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(12);
               ((String[]) buf[15])[0] = rslt.getString(13, 1);
               ((short[]) buf[16])[0] = rslt.getShort(14);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(15,2);
               ((short[]) buf[18])[0] = rslt.getShort(16);
               ((short[]) buf[19])[0] = rslt.getShort(17);
               ((String[]) buf[20])[0] = rslt.getString(18, 26);
               ((String[]) buf[21])[0] = rslt.getString(19, 1);
               ((String[]) buf[22])[0] = rslt.getString(20, 1);
               ((String[]) buf[23])[0] = rslt.getString(21, 10);
               ((String[]) buf[24])[0] = rslt.getString(22, 13);
               ((String[]) buf[25])[0] = rslt.getString(23, 6);
               ((String[]) buf[26])[0] = rslt.getString(24, 16);
               ((int[]) buf[27])[0] = rslt.getInt(25);
               ((String[]) buf[28])[0] = rslt.getString(26, 13);
               ((String[]) buf[29])[0] = rslt.getString(27, 20);
               ((String[]) buf[30])[0] = rslt.getString(28, 30);
               ((int[]) buf[31])[0] = rslt.getInt(29);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[33])[0] = rslt.getGXDate(30);
               ((java.util.Date[]) buf[34])[0] = rslt.getGXDate(31);
               ((short[]) buf[35])[0] = rslt.getShort(32);
               ((short[]) buf[36])[0] = rslt.getShort(33);
               ((short[]) buf[37])[0] = rslt.getShort(34);
               ((short[]) buf[38])[0] = rslt.getShort(35);
               ((short[]) buf[39])[0] = rslt.getShort(36);
               ((short[]) buf[40])[0] = rslt.getShort(37);
               ((java.math.BigDecimal[]) buf[41])[0] = rslt.getBigDecimal(38,2);
               ((java.math.BigDecimal[]) buf[42])[0] = rslt.getBigDecimal(39,2);
               ((short[]) buf[43])[0] = rslt.getShort(40);
               ((String[]) buf[44])[0] = rslt.getString(41, 1);
               ((int[]) buf[45])[0] = rslt.getInt(42);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 40);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((String[]) buf[6])[0] = rslt.getString(7, 2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 6);
               ((String[]) buf[9])[0] = rslt.getString(9, 8);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(11, 1);
               ((String[]) buf[13])[0] = rslt.getString(12, 28);
               ((String[]) buf[14])[0] = rslt.getString(13, 1);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 10);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 9);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 16);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 9);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
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
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               return;
      }
   }

}

