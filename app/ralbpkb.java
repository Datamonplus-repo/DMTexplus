package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class ralbpkb extends GXReport
{
   public ralbpkb( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ralbpkb.class ), "" );
   }

   public ralbpkb( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public long executeUdp( String[] aP0 )
   {
      ralbpkb.this.aP1 = new long[] {0};
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
      ralbpkb.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ralbpkb.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      M_top = 0 ;
      M_bot = 0 ;
      P_lines = (int)(66-M_bot) ;
      getPrinter().GxClearAttris() ;
      lineHeight = 15 ;
      PrtOffset = 0 ;
      gxXPage = 100 ;
      gxYPage = 100 ;
      try
      {
         Gx_out = "PRN" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "REPGRAF", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("PACKING LIST S.A. BROS") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*0)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXt_int1 = AV46Clisend ;
         GXv_int2[0] = GXt_int1 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CLISED", ""), GXv_int2) ;
         ralbpkb.this.GXt_int1 = GXv_int2[0] ;
         AV46Clisend = GXt_int1 ;
         GxHdr2 = true ;
         /* Using cursor P071W2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A1253EmprGuiRem = P071W2_A1253EmprGuiRem[0] ;
            A781PrvCod = P071W2_A781PrvCod[0] ;
            n781PrvCod = P071W2_n781PrvCod[0] ;
            A1243GuiRemCli = P071W2_A1243GuiRemCli[0] ;
            A1259AlbDomEnv = P071W2_A1259AlbDomEnv[0] ;
            n1259AlbDomEnv = P071W2_n1259AlbDomEnv[0] ;
            A10016AlbDomEv = P071W2_A10016AlbDomEv[0] ;
            n10016AlbDomEv = P071W2_n10016AlbDomEv[0] ;
            A34AlbProfch = P071W2_A34AlbProfch[0] ;
            A840TrnCod = P071W2_A840TrnCod[0] ;
            A787PrvDsc = P071W2_A787PrvDsc[0] ;
            n787PrvDsc = P071W2_n787PrvDsc[0] ;
            A295CliPob = P071W2_A295CliPob[0] ;
            n295CliPob = P071W2_n295CliPob[0] ;
            A260CliDom = P071W2_A260CliDom[0] ;
            n260CliDom = P071W2_n260CliDom[0] ;
            A256CliCp = P071W2_A256CliCp[0] ;
            n256CliCp = P071W2_n256CliCp[0] ;
            A841TrnNom = P071W2_A841TrnNom[0] ;
            n841TrnNom = P071W2_n841TrnNom[0] ;
            A409EmprTel = P071W2_A409EmprTel[0] ;
            n409EmprTel = P071W2_n409EmprTel[0] ;
            A405EmprFax = P071W2_A405EmprFax[0] ;
            n405EmprFax = P071W2_n405EmprFax[0] ;
            A408EmprPob = P071W2_A408EmprPob[0] ;
            n408EmprPob = P071W2_n408EmprPob[0] ;
            A403EmprCpo = P071W2_A403EmprCpo[0] ;
            n403EmprCpo = P071W2_n403EmprCpo[0] ;
            A404EmprDir = P071W2_A404EmprDir[0] ;
            n404EmprDir = P071W2_n404EmprDir[0] ;
            A407EmprNom = P071W2_A407EmprNom[0] ;
            n407EmprNom = P071W2_n407EmprNom[0] ;
            A781PrvCod = P071W2_A781PrvCod[0] ;
            n781PrvCod = P071W2_n781PrvCod[0] ;
            A295CliPob = P071W2_A295CliPob[0] ;
            n295CliPob = P071W2_n295CliPob[0] ;
            A260CliDom = P071W2_A260CliDom[0] ;
            n260CliDom = P071W2_n260CliDom[0] ;
            A256CliCp = P071W2_A256CliCp[0] ;
            n256CliCp = P071W2_n256CliCp[0] ;
            A787PrvDsc = P071W2_A787PrvDsc[0] ;
            n787PrvDsc = P071W2_n787PrvDsc[0] ;
            A409EmprTel = P071W2_A409EmprTel[0] ;
            n409EmprTel = P071W2_n409EmprTel[0] ;
            A405EmprFax = P071W2_A405EmprFax[0] ;
            n405EmprFax = P071W2_n405EmprFax[0] ;
            A408EmprPob = P071W2_A408EmprPob[0] ;
            n408EmprPob = P071W2_n408EmprPob[0] ;
            A403EmprCpo = P071W2_A403EmprCpo[0] ;
            n403EmprCpo = P071W2_n403EmprCpo[0] ;
            A404EmprDir = P071W2_A404EmprDir[0] ;
            n404EmprDir = P071W2_n404EmprDir[0] ;
            A407EmprNom = P071W2_A407EmprNom[0] ;
            n407EmprNom = P071W2_n407EmprNom[0] ;
            A841TrnNom = P071W2_A841TrnNom[0] ;
            n841TrnNom = P071W2_n841TrnNom[0] ;
            AV14CliCod = A1243GuiRemCli ;
            AV29AlbDomEnv = A1259AlbDomEnv ;
            AV45Albdomev = A10016AlbDomEv ;
            /* Execute user subroutine: 'ENVIO' */
            S111 ();
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
            AV25Dia = (byte)(GXutil.day( A34AlbProfch)) ;
            AV26Mes = localUtil.cmonth( A34AlbProfch, httpContext.getMessage( "spa", "")) ;
            AV27Anyo = (short)(GXutil.year( A34AlbProfch)) ;
            AV28litfech = GXutil.str( AV25Dia, 2, 0) + httpContext.getMessage( " de ", "") + GXutil.trim( AV26Mes) + httpContext.getMessage( " de ", "") + GXutil.str( AV27Anyo, 4, 0) ;
            AV24AlbCod = GXutil.str( A30AlbProCod, 10, 0) ;
            AV41TrnCod = A840TrnCod ;
            /* Using cursor P071W3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               brk71W4 = false ;
               A3622AlbPckCaj = P071W3_A3622AlbPckCaj[0] ;
               n3622AlbPckCaj = P071W3_n3622AlbPckCaj[0] ;
               A3623AlbPckKn = P071W3_A3623AlbPckKn[0] ;
               n3623AlbPckKn = P071W3_n3623AlbPckKn[0] ;
               A3625AlbPckTar = P071W3_A3625AlbPckTar[0] ;
               n3625AlbPckTar = P071W3_n3625AlbPckTar[0] ;
               A3624AlbPckKb = P071W3_A3624AlbPckKb[0] ;
               n3624AlbPckKb = P071W3_n3624AlbPckKb[0] ;
               A3626AlbPckUni = P071W3_A3626AlbPckUni[0] ;
               n3626AlbPckUni = P071W3_n3626AlbPckUni[0] ;
               A212BarSer = P071W3_A212BarSer[0] ;
               A130BarCodPar = P071W3_A130BarCodPar[0] ;
               A132BarCodReo = P071W3_A132BarCodReo[0] ;
               A129BarCod = P071W3_A129BarCod[0] ;
               A10024AlbPckM3 = P071W3_A10024AlbPckM3[0] ;
               n10024AlbPckM3 = P071W3_n10024AlbPckM3[0] ;
               A10023AlbPckM2 = P071W3_A10023AlbPckM2[0] ;
               n10023AlbPckM2 = P071W3_n10023AlbPckM2[0] ;
               A10022AlbPckM1 = P071W3_A10022AlbPckM1[0] ;
               n10022AlbPckM1 = P071W3_n10022AlbPckM1[0] ;
               A3621AlbPckLin = P071W3_A3621AlbPckLin[0] ;
               A212BarSer = P071W3_A212BarSer[0] ;
               A10025AlbPckVol = (A10022AlbPckM1.multiply(A10023AlbPckM2).multiply(A10024AlbPckM3)) ;
               while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P071W3_A396EmprCod[0], A396EmprCod) == 0 ) && ( P071W3_A30AlbProCod[0] == A30AlbProCod ) )
               {
                  brk71W4 = false ;
                  A3622AlbPckCaj = P071W3_A3622AlbPckCaj[0] ;
                  n3622AlbPckCaj = P071W3_n3622AlbPckCaj[0] ;
                  A3623AlbPckKn = P071W3_A3623AlbPckKn[0] ;
                  n3623AlbPckKn = P071W3_n3623AlbPckKn[0] ;
                  A3625AlbPckTar = P071W3_A3625AlbPckTar[0] ;
                  n3625AlbPckTar = P071W3_n3625AlbPckTar[0] ;
                  A3624AlbPckKb = P071W3_A3624AlbPckKb[0] ;
                  n3624AlbPckKb = P071W3_n3624AlbPckKb[0] ;
                  A3626AlbPckUni = P071W3_A3626AlbPckUni[0] ;
                  n3626AlbPckUni = P071W3_n3626AlbPckUni[0] ;
                  A212BarSer = P071W3_A212BarSer[0] ;
                  A130BarCodPar = P071W3_A130BarCodPar[0] ;
                  A132BarCodReo = P071W3_A132BarCodReo[0] ;
                  A129BarCod = P071W3_A129BarCod[0] ;
                  A10024AlbPckM3 = P071W3_A10024AlbPckM3[0] ;
                  n10024AlbPckM3 = P071W3_n10024AlbPckM3[0] ;
                  A10023AlbPckM2 = P071W3_A10023AlbPckM2[0] ;
                  n10023AlbPckM2 = P071W3_n10023AlbPckM2[0] ;
                  A10022AlbPckM1 = P071W3_A10022AlbPckM1[0] ;
                  n10022AlbPckM1 = P071W3_n10022AlbPckM1[0] ;
                  A3621AlbPckLin = P071W3_A3621AlbPckLin[0] ;
                  A212BarSer = P071W3_A212BarSer[0] ;
                  A10025AlbPckVol = (A10022AlbPckM1.multiply(A10023AlbPckM2).multiply(A10024AlbPckM3)) ;
                  if ( AV23FlagMat == 1 )
                  {
                     h71W0( false, 10) ;
                     getPrinter().GxDrawLine(269, Gx_line+4, 775, Gx_line+4, 1, 0, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+10) ;
                  }
                  AV43BarCodReo = A132BarCodReo ;
                  h71W0( false, 18) ;
                  getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV43BarCodReo), "Z")), 90, Gx_line+1, 99, Gx_line+19, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A130BarCodPar, "")), 100, Gx_line+1, 109, Gx_line+19, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), 20, Gx_line+1, 88, Gx_line+19, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A212BarSer, "")), 117, Gx_line+1, 251, Gx_line+19, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+18) ;
                  /* Noskip command */
                  Gx_line = Gx_OldLine ;
                  AV23FlagMat = (byte)(0) ;
                  AV44Tot_vol = DecimalUtil.doubleToDec(0) ;
                  while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P071W3_A396EmprCod[0], A396EmprCod) == 0 ) && ( P071W3_A30AlbProCod[0] == A30AlbProCod ) && ( P071W3_A129BarCod[0] == A129BarCod ) && ( P071W3_A132BarCodReo[0] == A132BarCodReo ) )
                  {
                     if ( ! ( ( GXutil.strcmp(P071W3_A130BarCodPar[0], A130BarCodPar) == 0 ) ) )
                     {
                        if (true) break;
                     }
                     brk71W4 = false ;
                     A3622AlbPckCaj = P071W3_A3622AlbPckCaj[0] ;
                     n3622AlbPckCaj = P071W3_n3622AlbPckCaj[0] ;
                     A3623AlbPckKn = P071W3_A3623AlbPckKn[0] ;
                     n3623AlbPckKn = P071W3_n3623AlbPckKn[0] ;
                     A3625AlbPckTar = P071W3_A3625AlbPckTar[0] ;
                     n3625AlbPckTar = P071W3_n3625AlbPckTar[0] ;
                     A3624AlbPckKb = P071W3_A3624AlbPckKb[0] ;
                     n3624AlbPckKb = P071W3_n3624AlbPckKb[0] ;
                     A3626AlbPckUni = P071W3_A3626AlbPckUni[0] ;
                     n3626AlbPckUni = P071W3_n3626AlbPckUni[0] ;
                     A10024AlbPckM3 = P071W3_A10024AlbPckM3[0] ;
                     n10024AlbPckM3 = P071W3_n10024AlbPckM3[0] ;
                     A10023AlbPckM2 = P071W3_A10023AlbPckM2[0] ;
                     n10023AlbPckM2 = P071W3_n10023AlbPckM2[0] ;
                     A10022AlbPckM1 = P071W3_A10022AlbPckM1[0] ;
                     n10022AlbPckM1 = P071W3_n10022AlbPckM1[0] ;
                     A3621AlbPckLin = P071W3_A3621AlbPckLin[0] ;
                     A10025AlbPckVol = (A10022AlbPckM1.multiply(A10023AlbPckM2).multiply(A10024AlbPckM3)) ;
                     AV42AlbPckCaj = GXutil.trim( A3622AlbPckCaj) ;
                     h71W0( false, 18) ;
                     getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42AlbPckCaj, "")), 271, Gx_line+0, 372, Gx_line+18, 2+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3626AlbPckUni), "ZZZ9")), 411, Gx_line+0, 445, Gx_line+18, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A3624AlbPckKb, "ZZZZZ9.99")), 471, Gx_line+0, 547, Gx_line+18, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A3625AlbPckTar, "ZZZZZ9.99")), 577, Gx_line+0, 653, Gx_line+18, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A3623AlbPckKn, "ZZZZZ9.99")), 684, Gx_line+0, 760, Gx_line+18, 2+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+18) ;
                     AV23FlagMat = (byte)(1) ;
                     AV30TotLinHdr = (short)(AV30TotLinHdr+1) ;
                     AV31TotUniHdr = (int)(AV31TotUniHdr+A3626AlbPckUni) ;
                     AV32TotKgNHdr = AV32TotKgNHdr.add(A3623AlbPckKn) ;
                     AV33TotKgBHdr = AV33TotKgBHdr.add(A3624AlbPckKb) ;
                     AV34TotTarHdr = AV34TotTarHdr.add(A3625AlbPckTar) ;
                     AV44Tot_vol = AV44Tot_vol.add(A10025AlbPckVol) ;
                     brk71W4 = true ;
                     pr_default.readNext(1);
                  }
                  if ( AV23FlagMat == 0 )
                  {
                     h71W0( false, 18) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+18) ;
                  }
                  if ( AV30TotLinHdr != 0 )
                  {
                     h71W0( false, 28) ;
                     getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "TOTAL NOF", ""), 196, Gx_line+8, 263, Gx_line+24, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV30TotLinHdr), "ZZZ9")), 338, Gx_line+8, 372, Gx_line+26, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV33TotKgBHdr, "Z,ZZZ,ZZ9.99")), 449, Gx_line+8, 550, Gx_line+26, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV32TotKgNHdr, "Z,ZZZ,ZZ9.99")), 659, Gx_line+8, 760, Gx_line+26, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV34TotTarHdr, "Z,ZZZ,ZZ9.99")), 555, Gx_line+8, 656, Gx_line+26, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV31TotUniHdr), "ZZZZZZ9")), 386, Gx_line+8, 445, Gx_line+26, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawLine(269, Gx_line+0, 775, Gx_line+0, 1, 0, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+28) ;
                  }
                  AV18TotalLin = (short)(AV18TotalLin+AV30TotLinHdr) ;
                  AV19TotUni = (int)(AV19TotUni+AV31TotUniHdr) ;
                  AV20TotKgN = AV20TotKgN.add(AV32TotKgNHdr) ;
                  AV21TotKgB = AV21TotKgB.add(AV33TotKgBHdr) ;
                  AV22TotTara = AV22TotTara.add(AV34TotTarHdr) ;
                  AV30TotLinHdr = (short)(0) ;
                  AV31TotUniHdr = 0 ;
                  AV32TotKgNHdr = DecimalUtil.doubleToDec(0) ;
                  AV33TotKgBHdr = DecimalUtil.doubleToDec(0) ;
                  AV34TotTarHdr = DecimalUtil.doubleToDec(0) ;
                  if ( ! brk71W4 )
                  {
                     brk71W4 = true ;
                     pr_default.readNext(1);
                  }
               }
               if ( ! brk71W4 )
               {
                  brk71W4 = true ;
                  pr_default.readNext(1);
               }
            }
            pr_default.close(1);
            if ( AV18TotalLin != 0 )
            {
               h71W0( false, 38) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "TOTAL PACKING", ""), 63, Gx_line+11, 158, Gx_line+27, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV18TotalLin), "ZZZ9")), 338, Gx_line+11, 372, Gx_line+29, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV21TotKgB, "Z,ZZZ,ZZ9.99")), 449, Gx_line+11, 550, Gx_line+29, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV20TotKgN, "Z,ZZZ,ZZ9.99")), 659, Gx_line+11, 760, Gx_line+29, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV22TotTara, "Z,ZZZ,ZZ9.99")), 555, Gx_line+11, 656, Gx_line+29, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV19TotUni), "ZZZ,ZZ9")), 386, Gx_line+11, 445, Gx_line+29, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(9, Gx_line+3, 775, Gx_line+35, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+38) ;
            }
            if ( AV44Tot_vol.doubleValue() > 0 )
            {
               h71W0( false, 28) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "TOTAL VOLUMEN", ""), 63, Gx_line+5, 165, Gx_line+21, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV44Tot_vol, "ZZ9.99")), 338, Gx_line+5, 389, Gx_line+23, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "m3", ""), 395, Gx_line+5, 416, Gx_line+22, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(9, Gx_line+3, 775, Gx_line+24, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+28) ;
            }
            AV18TotalLin = (short)(0) ;
            AV19TotUni = 0 ;
            AV20TotKgN = DecimalUtil.doubleToDec(0) ;
            AV21TotKgB = DecimalUtil.doubleToDec(0) ;
            AV22TotTara = DecimalUtil.doubleToDec(0) ;
            AV44Tot_vol = DecimalUtil.doubleToDec(0) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         GxHdr2 = false ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h71W0( true, 0) ;
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
      /* 'ENVIO' Routine */
      returnInSub = false ;
      AV9CliENom = "" ;
      AV10CliEDom = "" ;
      AV11CliEcp = "" ;
      AV12CliEPob = "" ;
      AV13CliEPrv = "" ;
      if ( ( ( AV29AlbDomEnv != 0 ) ) || ( ( AV45Albdomev != 0 ) ) )
      {
         if ( AV46Clisend == 0 )
         {
            /* Using cursor P071W4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV14CliCod), Byte.valueOf(AV29AlbDomEnv)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A266CliEnvLin = P071W4_A266CliEnvLin[0] ;
               A252CliCod = P071W4_A252CliCod[0] ;
               A267CliEnvNom = P071W4_A267CliEnvNom[0] ;
               A265CliEnvDom = P071W4_A265CliEnvDom[0] ;
               A264CliEnvCp = P071W4_A264CliEnvCp[0] ;
               A268CliEnvPob = P071W4_A268CliEnvPob[0] ;
               A270CliEnvPrv = P071W4_A270CliEnvPrv[0] ;
               AV47Clienv = (byte)(1) ;
               AV9CliENom = A267CliEnvNom ;
               AV10CliEDom = A265CliEnvDom ;
               AV11CliEcp = GXutil.trim( A264CliEnvCp) ;
               AV12CliEPob = A268CliEnvPob ;
               AV17CodPrv = A270CliEnvPrv ;
               /* Execute user subroutine: 'PROVIN' */
               S127 ();
               if ( returnInSub )
               {
                  pr_default.close(2);
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
            pr_default.close(2);
         }
         else
         {
            /* Using cursor P071W5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV14CliCod), Short.valueOf(AV45Albdomev)});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A10062CliEvLin = P071W5_A10062CliEvLin[0] ;
               A252CliCod = P071W5_A252CliCod[0] ;
               A10063CliEvNom = P071W5_A10063CliEvNom[0] ;
               n10063CliEvNom = P071W5_n10063CliEvNom[0] ;
               A10064CliEvDom = P071W5_A10064CliEvDom[0] ;
               n10064CliEvDom = P071W5_n10064CliEvDom[0] ;
               A10066CliEvCp = P071W5_A10066CliEvCp[0] ;
               n10066CliEvCp = P071W5_n10066CliEvCp[0] ;
               A10065CliEvPob = P071W5_A10065CliEvPob[0] ;
               n10065CliEvPob = P071W5_n10065CliEvPob[0] ;
               A10067CliEvPrv = P071W5_A10067CliEvPrv[0] ;
               n10067CliEvPrv = P071W5_n10067CliEvPrv[0] ;
               AV47Clienv = (byte)(1) ;
               AV9CliENom = A10063CliEvNom ;
               AV10CliEDom = A10064CliEvDom ;
               AV11CliEcp = GXutil.trim( A10066CliEvCp) ;
               AV12CliEPob = A10065CliEvPob ;
               AV17CodPrv = A10067CliEvPrv ;
               /* Execute user subroutine: 'PROVIN' */
               S127 ();
               if ( returnInSub )
               {
                  pr_default.close(3);
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
            pr_default.close(3);
         }
      }
   }

   public void S127( ) throws ProcessInterruptedException
   {
      /* 'PROVIN' Routine */
      returnInSub = false ;
      /* Using cursor P071W6 */
      pr_default.execute(4, new Object[] {Short.valueOf(AV17CodPrv)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A781PrvCod = P071W6_A781PrvCod[0] ;
         n781PrvCod = P071W6_n781PrvCod[0] ;
         A787PrvDsc = P071W6_A787PrvDsc[0] ;
         n787PrvDsc = P071W6_n787PrvDsc[0] ;
         AV13CliEPrv = A787PrvDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
   }

   public void h71W0( boolean bFoot ,
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
            if ( GxHdr2 )
            {
               getPrinter().GxDrawRect(17, Gx_line+11, 437, Gx_line+128, 1, 192, 192, 192, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 11, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A407EmprNom, "")), 27, Gx_line+29, 247, Gx_line+49, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A404EmprDir, "")), 27, Gx_line+50, 283, Gx_line+70, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A403EmprCpo, "")), 27, Gx_line+72, 93, Gx_line+90, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A408EmprPob, "")), 91, Gx_line+72, 347, Gx_line+92, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A405EmprFax, "")), 269, Gx_line+95, 379, Gx_line+115, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A409EmprTel, "")), 69, Gx_line+95, 210, Gx_line+113, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Tel.", ""), 27, Gx_line+95, 55, Gx_line+114, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Fax.", ""), 225, Gx_line+95, 256, Gx_line+114, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Nº  BULTOS", ""), 303, Gx_line+405, 371, Gx_line+421, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "CONOS", ""), 406, Gx_line+405, 451, Gx_line+421, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "BRUTO", ""), 504, Gx_line+405, 547, Gx_line+421, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "TARA", ""), 620, Gx_line+405, 652, Gx_line+421, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "NETO", ""), 727, Gx_line+405, 760, Gx_line+421, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 14, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "PACKING LIST", ""), 572, Gx_line+17, 713, Gx_line+40, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "ENTREGADO A :", ""), 19, Gx_line+156, 125, Gx_line+173, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9CliENom, "")), 151, Gx_line+253, 402, Gx_line+271, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10CliEDom, "")), 151, Gx_line+273, 435, Gx_line+291, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV11CliEcp, "")), 151, Gx_line+293, 202, Gx_line+311, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12CliEPob, "")), 211, Gx_line+293, 462, Gx_line+311, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "ENVIO PARA :", ""), 19, Gx_line+253, 111, Gx_line+270, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV13CliEPrv, "@!")), 151, Gx_line+313, 402, Gx_line+331, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "TRANSPORTISTA :", ""), 19, Gx_line+349, 142, Gx_line+366, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV41TrnCod), "ZZZZ")), 151, Gx_line+349, 185, Gx_line+367, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A841TrnNom, "")), 191, Gx_line+349, 442, Gx_line+367, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "SERIE", ""), 117, Gx_line+405, 158, Gx_line+422, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(549, Gx_line+75, 712, Gx_line+115, 1, 192, 192, 192, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 14, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Nº", ""), 561, Gx_line+83, 583, Gx_line+106, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 12, false, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24AlbCod, "")), 593, Gx_line+85, 698, Gx_line+105, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28litfech, "")), 477, Gx_line+126, 711, Gx_line+144, 2, 0, 0, 0) ;
               getPrinter().GxDrawRect(9, Gx_line+394, 775, Gx_line+433, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "NOF", ""), 27, Gx_line+405, 56, Gx_line+422, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 151, Gx_line+156, 202, Gx_line+174, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 211, Gx_line+156, 462, Gx_line+174, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A256CliCp, "")), 151, Gx_line+196, 202, Gx_line+214, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A260CliDom, "")), 151, Gx_line+176, 435, Gx_line+194, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A295CliPob, "")), 211, Gx_line+196, 462, Gx_line+214, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A787PrvDsc, "@!")), 151, Gx_line+217, 402, Gx_line+235, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+436) ;
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
      this.aP0[0] = ralbpkb.this.A396EmprCod;
      this.aP1[0] = ralbpkb.this.A30AlbProCod;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int2 = new byte[1] ;
      scmdbuf = "" ;
      P071W2_A1253EmprGuiRem = new String[] {""} ;
      P071W2_A781PrvCod = new short[1] ;
      P071W2_n781PrvCod = new boolean[] {false} ;
      P071W2_A396EmprCod = new String[] {""} ;
      P071W2_A30AlbProCod = new long[1] ;
      P071W2_A1243GuiRemCli = new int[1] ;
      P071W2_A1259AlbDomEnv = new byte[1] ;
      P071W2_n1259AlbDomEnv = new boolean[] {false} ;
      P071W2_A10016AlbDomEv = new short[1] ;
      P071W2_n10016AlbDomEv = new boolean[] {false} ;
      P071W2_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P071W2_A840TrnCod = new short[1] ;
      P071W2_A787PrvDsc = new String[] {""} ;
      P071W2_n787PrvDsc = new boolean[] {false} ;
      P071W2_A295CliPob = new String[] {""} ;
      P071W2_n295CliPob = new boolean[] {false} ;
      P071W2_A260CliDom = new String[] {""} ;
      P071W2_n260CliDom = new boolean[] {false} ;
      P071W2_A256CliCp = new String[] {""} ;
      P071W2_n256CliCp = new boolean[] {false} ;
      P071W2_A841TrnNom = new String[] {""} ;
      P071W2_n841TrnNom = new boolean[] {false} ;
      P071W2_A409EmprTel = new String[] {""} ;
      P071W2_n409EmprTel = new boolean[] {false} ;
      P071W2_A405EmprFax = new String[] {""} ;
      P071W2_n405EmprFax = new boolean[] {false} ;
      P071W2_A408EmprPob = new String[] {""} ;
      P071W2_n408EmprPob = new boolean[] {false} ;
      P071W2_A403EmprCpo = new String[] {""} ;
      P071W2_n403EmprCpo = new boolean[] {false} ;
      P071W2_A404EmprDir = new String[] {""} ;
      P071W2_n404EmprDir = new boolean[] {false} ;
      P071W2_A407EmprNom = new String[] {""} ;
      P071W2_n407EmprNom = new boolean[] {false} ;
      A1253EmprGuiRem = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      A787PrvDsc = "" ;
      A295CliPob = "" ;
      A260CliDom = "" ;
      A256CliCp = "" ;
      A841TrnNom = "" ;
      A409EmprTel = "" ;
      A405EmprFax = "" ;
      A408EmprPob = "" ;
      A403EmprCpo = "" ;
      A404EmprDir = "" ;
      A407EmprNom = "" ;
      AV26Mes = "" ;
      AV28litfech = "" ;
      AV24AlbCod = "" ;
      P071W3_A396EmprCod = new String[] {""} ;
      P071W3_A30AlbProCod = new long[1] ;
      P071W3_A3622AlbPckCaj = new String[] {""} ;
      P071W3_n3622AlbPckCaj = new boolean[] {false} ;
      P071W3_A3623AlbPckKn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P071W3_n3623AlbPckKn = new boolean[] {false} ;
      P071W3_A3625AlbPckTar = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P071W3_n3625AlbPckTar = new boolean[] {false} ;
      P071W3_A3624AlbPckKb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P071W3_n3624AlbPckKb = new boolean[] {false} ;
      P071W3_A3626AlbPckUni = new short[1] ;
      P071W3_n3626AlbPckUni = new boolean[] {false} ;
      P071W3_A212BarSer = new String[] {""} ;
      P071W3_A130BarCodPar = new String[] {""} ;
      P071W3_A132BarCodReo = new byte[1] ;
      P071W3_A129BarCod = new int[1] ;
      P071W3_A10024AlbPckM3 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P071W3_n10024AlbPckM3 = new boolean[] {false} ;
      P071W3_A10023AlbPckM2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P071W3_n10023AlbPckM2 = new boolean[] {false} ;
      P071W3_A10022AlbPckM1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P071W3_n10022AlbPckM1 = new boolean[] {false} ;
      P071W3_A3621AlbPckLin = new short[1] ;
      A3622AlbPckCaj = "" ;
      A3623AlbPckKn = DecimalUtil.ZERO ;
      A3625AlbPckTar = DecimalUtil.ZERO ;
      A3624AlbPckKb = DecimalUtil.ZERO ;
      A212BarSer = "" ;
      A130BarCodPar = "" ;
      A10024AlbPckM3 = DecimalUtil.ZERO ;
      A10023AlbPckM2 = DecimalUtil.ZERO ;
      A10022AlbPckM1 = DecimalUtil.ZERO ;
      A10025AlbPckVol = DecimalUtil.ZERO ;
      AV44Tot_vol = DecimalUtil.ZERO ;
      AV42AlbPckCaj = "" ;
      AV32TotKgNHdr = DecimalUtil.ZERO ;
      AV33TotKgBHdr = DecimalUtil.ZERO ;
      AV34TotTarHdr = DecimalUtil.ZERO ;
      AV20TotKgN = DecimalUtil.ZERO ;
      AV21TotKgB = DecimalUtil.ZERO ;
      AV22TotTara = DecimalUtil.ZERO ;
      AV9CliENom = "" ;
      AV10CliEDom = "" ;
      AV11CliEcp = "" ;
      AV12CliEPob = "" ;
      AV13CliEPrv = "" ;
      P071W4_A396EmprCod = new String[] {""} ;
      P071W4_A266CliEnvLin = new byte[1] ;
      P071W4_A252CliCod = new int[1] ;
      P071W4_A267CliEnvNom = new String[] {""} ;
      P071W4_A265CliEnvDom = new String[] {""} ;
      P071W4_A264CliEnvCp = new String[] {""} ;
      P071W4_A268CliEnvPob = new String[] {""} ;
      P071W4_A270CliEnvPrv = new short[1] ;
      A267CliEnvNom = "" ;
      A265CliEnvDom = "" ;
      A264CliEnvCp = "" ;
      A268CliEnvPob = "" ;
      P071W5_A396EmprCod = new String[] {""} ;
      P071W5_A10062CliEvLin = new short[1] ;
      P071W5_A252CliCod = new int[1] ;
      P071W5_A10063CliEvNom = new String[] {""} ;
      P071W5_n10063CliEvNom = new boolean[] {false} ;
      P071W5_A10064CliEvDom = new String[] {""} ;
      P071W5_n10064CliEvDom = new boolean[] {false} ;
      P071W5_A10066CliEvCp = new String[] {""} ;
      P071W5_n10066CliEvCp = new boolean[] {false} ;
      P071W5_A10065CliEvPob = new String[] {""} ;
      P071W5_n10065CliEvPob = new boolean[] {false} ;
      P071W5_A10067CliEvPrv = new short[1] ;
      P071W5_n10067CliEvPrv = new boolean[] {false} ;
      A10063CliEvNom = "" ;
      A10064CliEvDom = "" ;
      A10066CliEvCp = "" ;
      A10065CliEvPob = "" ;
      P071W6_A781PrvCod = new short[1] ;
      P071W6_n781PrvCod = new boolean[] {false} ;
      P071W6_A787PrvDsc = new String[] {""} ;
      P071W6_n787PrvDsc = new boolean[] {false} ;
      A279CliNom = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ralbpkb__default(),
         new Object[] {
             new Object[] {
            P071W2_A1253EmprGuiRem, P071W2_A781PrvCod, P071W2_n781PrvCod, P071W2_A396EmprCod, P071W2_A30AlbProCod, P071W2_A1243GuiRemCli, P071W2_A1259AlbDomEnv, P071W2_n1259AlbDomEnv, P071W2_A10016AlbDomEv, P071W2_n10016AlbDomEv,
            P071W2_A34AlbProfch, P071W2_A840TrnCod, P071W2_A787PrvDsc, P071W2_n787PrvDsc, P071W2_A295CliPob, P071W2_n295CliPob, P071W2_A260CliDom, P071W2_n260CliDom, P071W2_A256CliCp, P071W2_n256CliCp,
            P071W2_A841TrnNom, P071W2_n841TrnNom, P071W2_A409EmprTel, P071W2_n409EmprTel, P071W2_A405EmprFax, P071W2_n405EmprFax, P071W2_A408EmprPob, P071W2_n408EmprPob, P071W2_A403EmprCpo, P071W2_n403EmprCpo,
            P071W2_A404EmprDir, P071W2_n404EmprDir, P071W2_A407EmprNom, P071W2_n407EmprNom
            }
            , new Object[] {
            P071W3_A396EmprCod, P071W3_A30AlbProCod, P071W3_A3622AlbPckCaj, P071W3_n3622AlbPckCaj, P071W3_A3623AlbPckKn, P071W3_n3623AlbPckKn, P071W3_A3625AlbPckTar, P071W3_n3625AlbPckTar, P071W3_A3624AlbPckKb, P071W3_n3624AlbPckKb,
            P071W3_A3626AlbPckUni, P071W3_n3626AlbPckUni, P071W3_A212BarSer, P071W3_A130BarCodPar, P071W3_A132BarCodReo, P071W3_A129BarCod, P071W3_A10024AlbPckM3, P071W3_n10024AlbPckM3, P071W3_A10023AlbPckM2, P071W3_n10023AlbPckM2,
            P071W3_A10022AlbPckM1, P071W3_n10022AlbPckM1, P071W3_A3621AlbPckLin
            }
            , new Object[] {
            P071W4_A396EmprCod, P071W4_A266CliEnvLin, P071W4_A252CliCod, P071W4_A267CliEnvNom, P071W4_A265CliEnvDom, P071W4_A264CliEnvCp, P071W4_A268CliEnvPob, P071W4_A270CliEnvPrv
            }
            , new Object[] {
            P071W5_A396EmprCod, P071W5_A10062CliEvLin, P071W5_A252CliCod, P071W5_A10063CliEvNom, P071W5_n10063CliEvNom, P071W5_A10064CliEvDom, P071W5_n10064CliEvDom, P071W5_A10066CliEvCp, P071W5_n10066CliEvCp, P071W5_A10065CliEvPob,
            P071W5_n10065CliEvPob, P071W5_A10067CliEvPrv, P071W5_n10067CliEvPrv
            }
            , new Object[] {
            P071W6_A781PrvCod, P071W6_A787PrvDsc, P071W6_n787PrvDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte AV46Clisend ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte A1259AlbDomEnv ;
   private byte AV29AlbDomEnv ;
   private byte AV25Dia ;
   private byte A132BarCodReo ;
   private byte AV23FlagMat ;
   private byte AV43BarCodReo ;
   private byte A266CliEnvLin ;
   private byte AV47Clienv ;
   private short A781PrvCod ;
   private short A10016AlbDomEv ;
   private short A840TrnCod ;
   private short AV45Albdomev ;
   private short AV27Anyo ;
   private short AV41TrnCod ;
   private short A3626AlbPckUni ;
   private short A3621AlbPckLin ;
   private short AV30TotLinHdr ;
   private short AV18TotalLin ;
   private short A270CliEnvPrv ;
   private short AV17CodPrv ;
   private short A10062CliEvLin ;
   private short A10067CliEvPrv ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A1243GuiRemCli ;
   private int AV14CliCod ;
   private int A129BarCod ;
   private int Gx_OldLine ;
   private int AV31TotUniHdr ;
   private int AV19TotUni ;
   private int A252CliCod ;
   private long A30AlbProCod ;
   private java.math.BigDecimal A3623AlbPckKn ;
   private java.math.BigDecimal A3625AlbPckTar ;
   private java.math.BigDecimal A3624AlbPckKb ;
   private java.math.BigDecimal A10024AlbPckM3 ;
   private java.math.BigDecimal A10023AlbPckM2 ;
   private java.math.BigDecimal A10022AlbPckM1 ;
   private java.math.BigDecimal A10025AlbPckVol ;
   private java.math.BigDecimal AV44Tot_vol ;
   private java.math.BigDecimal AV32TotKgNHdr ;
   private java.math.BigDecimal AV33TotKgBHdr ;
   private java.math.BigDecimal AV34TotTarHdr ;
   private java.math.BigDecimal AV20TotKgN ;
   private java.math.BigDecimal AV21TotKgB ;
   private java.math.BigDecimal AV22TotTara ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A1253EmprGuiRem ;
   private String A787PrvDsc ;
   private String A295CliPob ;
   private String A260CliDom ;
   private String A256CliCp ;
   private String A841TrnNom ;
   private String A409EmprTel ;
   private String A405EmprFax ;
   private String A408EmprPob ;
   private String A403EmprCpo ;
   private String A404EmprDir ;
   private String A407EmprNom ;
   private String AV26Mes ;
   private String AV28litfech ;
   private String AV24AlbCod ;
   private String A3622AlbPckCaj ;
   private String A212BarSer ;
   private String A130BarCodPar ;
   private String AV42AlbPckCaj ;
   private String AV9CliENom ;
   private String AV10CliEDom ;
   private String AV11CliEcp ;
   private String AV12CliEPob ;
   private String AV13CliEPrv ;
   private String A267CliEnvNom ;
   private String A265CliEnvDom ;
   private String A264CliEnvCp ;
   private String A268CliEnvPob ;
   private String A10063CliEvNom ;
   private String A10064CliEvDom ;
   private String A10066CliEvCp ;
   private String A10065CliEvPob ;
   private String A279CliNom ;
   private java.util.Date A34AlbProfch ;
   private boolean GxHdr2 ;
   private boolean n781PrvCod ;
   private boolean n1259AlbDomEnv ;
   private boolean n10016AlbDomEv ;
   private boolean n787PrvDsc ;
   private boolean n295CliPob ;
   private boolean n260CliDom ;
   private boolean n256CliCp ;
   private boolean n841TrnNom ;
   private boolean n409EmprTel ;
   private boolean n405EmprFax ;
   private boolean n408EmprPob ;
   private boolean n403EmprCpo ;
   private boolean n404EmprDir ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean brk71W4 ;
   private boolean n3622AlbPckCaj ;
   private boolean n3623AlbPckKn ;
   private boolean n3625AlbPckTar ;
   private boolean n3624AlbPckKb ;
   private boolean n3626AlbPckUni ;
   private boolean n10024AlbPckM3 ;
   private boolean n10023AlbPckM2 ;
   private boolean n10022AlbPckM1 ;
   private boolean n10063CliEvNom ;
   private boolean n10064CliEvDom ;
   private boolean n10066CliEvCp ;
   private boolean n10065CliEvPob ;
   private boolean n10067CliEvPrv ;
   private long[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P071W2_A1253EmprGuiRem ;
   private short[] P071W2_A781PrvCod ;
   private boolean[] P071W2_n781PrvCod ;
   private String[] P071W2_A396EmprCod ;
   private long[] P071W2_A30AlbProCod ;
   private int[] P071W2_A1243GuiRemCli ;
   private byte[] P071W2_A1259AlbDomEnv ;
   private boolean[] P071W2_n1259AlbDomEnv ;
   private short[] P071W2_A10016AlbDomEv ;
   private boolean[] P071W2_n10016AlbDomEv ;
   private java.util.Date[] P071W2_A34AlbProfch ;
   private short[] P071W2_A840TrnCod ;
   private String[] P071W2_A787PrvDsc ;
   private boolean[] P071W2_n787PrvDsc ;
   private String[] P071W2_A295CliPob ;
   private boolean[] P071W2_n295CliPob ;
   private String[] P071W2_A260CliDom ;
   private boolean[] P071W2_n260CliDom ;
   private String[] P071W2_A256CliCp ;
   private boolean[] P071W2_n256CliCp ;
   private String[] P071W2_A841TrnNom ;
   private boolean[] P071W2_n841TrnNom ;
   private String[] P071W2_A409EmprTel ;
   private boolean[] P071W2_n409EmprTel ;
   private String[] P071W2_A405EmprFax ;
   private boolean[] P071W2_n405EmprFax ;
   private String[] P071W2_A408EmprPob ;
   private boolean[] P071W2_n408EmprPob ;
   private String[] P071W2_A403EmprCpo ;
   private boolean[] P071W2_n403EmprCpo ;
   private String[] P071W2_A404EmprDir ;
   private boolean[] P071W2_n404EmprDir ;
   private String[] P071W2_A407EmprNom ;
   private boolean[] P071W2_n407EmprNom ;
   private String[] P071W3_A396EmprCod ;
   private long[] P071W3_A30AlbProCod ;
   private String[] P071W3_A3622AlbPckCaj ;
   private boolean[] P071W3_n3622AlbPckCaj ;
   private java.math.BigDecimal[] P071W3_A3623AlbPckKn ;
   private boolean[] P071W3_n3623AlbPckKn ;
   private java.math.BigDecimal[] P071W3_A3625AlbPckTar ;
   private boolean[] P071W3_n3625AlbPckTar ;
   private java.math.BigDecimal[] P071W3_A3624AlbPckKb ;
   private boolean[] P071W3_n3624AlbPckKb ;
   private short[] P071W3_A3626AlbPckUni ;
   private boolean[] P071W3_n3626AlbPckUni ;
   private String[] P071W3_A212BarSer ;
   private String[] P071W3_A130BarCodPar ;
   private byte[] P071W3_A132BarCodReo ;
   private int[] P071W3_A129BarCod ;
   private java.math.BigDecimal[] P071W3_A10024AlbPckM3 ;
   private boolean[] P071W3_n10024AlbPckM3 ;
   private java.math.BigDecimal[] P071W3_A10023AlbPckM2 ;
   private boolean[] P071W3_n10023AlbPckM2 ;
   private java.math.BigDecimal[] P071W3_A10022AlbPckM1 ;
   private boolean[] P071W3_n10022AlbPckM1 ;
   private short[] P071W3_A3621AlbPckLin ;
   private String[] P071W4_A396EmprCod ;
   private byte[] P071W4_A266CliEnvLin ;
   private int[] P071W4_A252CliCod ;
   private String[] P071W4_A267CliEnvNom ;
   private String[] P071W4_A265CliEnvDom ;
   private String[] P071W4_A264CliEnvCp ;
   private String[] P071W4_A268CliEnvPob ;
   private short[] P071W4_A270CliEnvPrv ;
   private String[] P071W5_A396EmprCod ;
   private short[] P071W5_A10062CliEvLin ;
   private int[] P071W5_A252CliCod ;
   private String[] P071W5_A10063CliEvNom ;
   private boolean[] P071W5_n10063CliEvNom ;
   private String[] P071W5_A10064CliEvDom ;
   private boolean[] P071W5_n10064CliEvDom ;
   private String[] P071W5_A10066CliEvCp ;
   private boolean[] P071W5_n10066CliEvCp ;
   private String[] P071W5_A10065CliEvPob ;
   private boolean[] P071W5_n10065CliEvPob ;
   private short[] P071W5_A10067CliEvPrv ;
   private boolean[] P071W5_n10067CliEvPrv ;
   private short[] P071W6_A781PrvCod ;
   private boolean[] P071W6_n781PrvCod ;
   private String[] P071W6_A787PrvDsc ;
   private boolean[] P071W6_n787PrvDsc ;
}

final  class ralbpkb__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P071W2", "SELECT T1.EmprGuiRem AS EmprGuiRem, T2.PrvCod, T1.EmprCod, T1.AlbProCod, T1.GuiRemCli AS GuiRemCli, T1.AlbDomEnv, T1.AlbDomEv, T1.AlbProfch, T1.TrnCod, T3.PrvDsc, T2.CliPob, T2.CliDom, T2.CliCp, T5.TrnNom, T4.EmprTel, T4.EmprFax, T4.EmprPob, T4.EmprCpo, T4.EmprDir, T4.EmprNom FROM ((((TXPCALPRD T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprGuiRem AND T2.CliCod = T1.GuiRemCli) LEFT JOIN TXPPROVIN T3 ON T3.PrvCod = T2.PrvCod) INNER JOIN TXPEMPRES T4 ON T4.EmprCod = T1.EmprCod) INNER JOIN TXPTRANSP T5 ON T5.EmprCod = T1.EmprCod AND T5.TrnCod = T1.TrnCod) WHERE T1.EmprCod = ? and T1.AlbProCod = ? ORDER BY T1.EmprCod, T1.AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P071W3", "SELECT T1.EmprCod, T1.AlbProCod, T1.AlbPckCaj, T1.AlbPckKn, T1.AlbPckTar, T1.AlbPckKb, T1.AlbPckUni, T2.BarSer, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.AlbPckM3, T1.AlbPckM2, T1.AlbPckM1, T1.AlbPckLin FROM (TXPALBPCK T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.AlbProCod = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P071W4", "SELECT EmprCod, CliEnvLin, CliCod, CliEnvNom, CliEnvDom, CliEnvCp, CliEnvPob, CliEnvPrv FROM TXPCLIENV WHERE EmprCod = ? and CliCod = ? and CliEnvLin = ? ORDER BY EmprCod, CliCod, CliEnvLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P071W5", "SELECT EmprCod, CliEvLin, CliCod, CliEvNom, CliEvDom, CliEvCp, CliEvPob, CliEvPrv FROM TXPCLISEN WHERE EmprCod = ? and CliCod = ? and CliEvLin = ? ORDER BY EmprCod, CliCod, CliEvLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P071W6", "SELECT PrvCod, PrvDsc FROM TXPPROVIN WHERE PrvCod = ? ORDER BY PrvCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((long[]) buf[4])[0] = rslt.getLong(4);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(8);
               ((short[]) buf[11])[0] = rslt.getShort(9);
               ((String[]) buf[12])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(12, 34);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(13, 6);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(15, 15);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(16, 15);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(17, 35);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(18, 7);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(19, 35);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(20, 30);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 16);
               ((String[]) buf[13])[0] = rslt.getString(9, 1);
               ((byte[]) buf[14])[0] = rslt.getByte(10);
               ((int[]) buf[15])[0] = rslt.getInt(11);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((short[]) buf[22])[0] = rslt.getShort(15);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 34);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 80);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 80);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 12);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 80);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
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
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 4 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
      }
   }

}

