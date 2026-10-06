package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class pgrmetx extends GXReport
{
   public pgrmetx( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pgrmetx.class ), "" );
   }

   public pgrmetx( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             long[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      pgrmetx.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      pgrmetx.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pgrmetx.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      pgrmetx.this.AV15ImpCod = aP2[0];
      this.aP2 = aP2;
      pgrmetx.this.AV51TextoCopia = aP3[0];
      this.aP3 = aP3;
      pgrmetx.this.Gx_out = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      M_top = 0 ;
      M_bot = 14 ;
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
         getPrinter().GxSetDocName("GUIA REMESSA, ENDUTEX") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*14)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXv_char1[0] = AV60ContDsc ;
         new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "GRMETX", ""), GXv_char1) ;
         pgrmetx.this.AV60ContDsc = GXv_char1[0] ;
         AV68Flag_tubos = (byte)(0) ;
         GxHdr2 = true ;
         /* Using cursor P01EN2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), A396EmprCod, Long.valueOf(A30AlbProCod)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A1253EmprGuiRem = P01EN2_A1253EmprGuiRem[0] ;
            A840TrnCod = P01EN2_A840TrnCod[0] ;
            A1259AlbDomEnv = P01EN2_A1259AlbDomEnv[0] ;
            n1259AlbDomEnv = P01EN2_n1259AlbDomEnv[0] ;
            A39AlbProPri = P01EN2_A39AlbProPri[0] ;
            A3868AlbMat = P01EN2_A3868AlbMat[0] ;
            A3865AlbHorSal = P01EN2_A3865AlbHorSal[0] ;
            A1879AlbProEnt = P01EN2_A1879AlbProEnt[0] ;
            n1879AlbProEnt = P01EN2_n1879AlbProEnt[0] ;
            A33AlbProEst = P01EN2_A33AlbProEst[0] ;
            A1782AlbProEso = P01EN2_A1782AlbProEso[0] ;
            A34AlbProfch = P01EN2_A34AlbProfch[0] ;
            A1243GuiRemCli = P01EN2_A1243GuiRemCli[0] ;
            /* Using cursor P01EN3 */
            pr_default.execute(1, new Object[] {A396EmprCod});
            A953IvaCod = P01EN3_A953IvaCod[0] ;
            n953IvaCod = P01EN3_n953IvaCod[0] ;
            A407EmprNom = P01EN3_A407EmprNom[0] ;
            n407EmprNom = P01EN3_n407EmprNom[0] ;
            /* Using cursor P01EN4 */
            pr_default.execute(2, new Object[] {Boolean.valueOf(n953IvaCod), A953IvaCod});
            A588IvaPor = P01EN4_A588IvaPor[0] ;
            n588IvaPor = P01EN4_n588IvaPor[0] ;
            /* Using cursor P01EN5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Short.valueOf(A840TrnCod)});
            A841TrnNom = P01EN5_A841TrnNom[0] ;
            n841TrnNom = P01EN5_n841TrnNom[0] ;
            /* Using cursor P01EN6 */
            pr_default.execute(4, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli)});
            A4828CliCp2 = P01EN6_A4828CliCp2[0] ;
            n4828CliCp2 = P01EN6_n4828CliCp2[0] ;
            A256CliCp = P01EN6_A256CliCp[0] ;
            n256CliCp = P01EN6_n256CliCp[0] ;
            A295CliPob = P01EN6_A295CliPob[0] ;
            n295CliPob = P01EN6_n295CliPob[0] ;
            A260CliDom = P01EN6_A260CliDom[0] ;
            n260CliDom = P01EN6_n260CliDom[0] ;
            AV16CliCod = A1243GuiRemCli ;
            AV22CliEnvDom = A1259AlbDomEnv ;
            AV29Prioridad = A39AlbProPri ;
            AV64IvaPor = A588IvaPor ;
            AV65AlbMat = A3868AlbMat ;
            AV66AlbHorSal = A3865AlbHorSal ;
            AV69Cp_1_2 = GXutil.trim( A256CliCp) + "-" + GXutil.trim( GXutil.substring( A4828CliCp2, 1, 4)) ;
            /* Execute user subroutine: 'CLIENTE' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(4);
               pr_default.close(3);
               pr_default.close(2);
               pr_default.close(1);
               pr_default.close(0);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV21EmprNom = A407EmprNom ;
            AV57VDoc = httpContext.getMessage( "Guia de Remessa", "") ;
            if ( GXutil.strcmp(A39AlbProPri, "0") == 0 )
            {
               AV57VDoc = httpContext.getMessage( "Guia de Transito", "") ;
            }
            if ( AV49Copias == 1 )
            {
               AV46vCopia = httpContext.getMessage( "DUPLICADO", "") ;
            }
            AV58i = (byte)(1) ;
            GX_I = 1 ;
            while ( GX_I <= 2 )
            {
               AV59vObs[GX_I-1] = "" ;
               GX_I = (int)(GX_I+1) ;
            }
            /* Using cursor P01EN7 */
            pr_default.execute(5, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
            while ( (pr_default.getStatus(5) != 101) )
            {
               A916AlbPObs = P01EN7_A916AlbPObs[0] ;
               A915AlbPObsLin = P01EN7_A915AlbPObsLin[0] ;
               if ( AV58i > 2 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
               AV59vObs[AV58i-1] = A916AlbPObs ;
               AV58i = (byte)(AV58i+1) ;
               pr_default.readNext(5);
            }
            pr_default.close(5);
            AV48ContLine = (byte)(0) ;
            AV52Matricula = GXutil.substring( A1879AlbProEnt, 1, 10) ;
            /* Using cursor P01EN9 */
            pr_default.execute(6, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
            while ( (pr_default.getStatus(6) != 101) )
            {
               A1206TubCod = P01EN9_A1206TubCod[0] ;
               n1206TubCod = P01EN9_n1206TubCod[0] ;
               A130BarCodPar = P01EN9_A130BarCodPar[0] ;
               A132BarCodReo = P01EN9_A132BarCodReo[0] ;
               A129BarCod = P01EN9_A129BarCod[0] ;
               A136BarColNum = P01EN9_A136BarColNum[0] ;
               A1207TubNom = P01EN9_A1207TubNom[0] ;
               n1207TubNom = P01EN9_n1207TubNom[0] ;
               A1235BarNumCli = P01EN9_A1235BarNumCli[0] ;
               A1234BarNomCli = P01EN9_A1234BarNomCli[0] ;
               A1652BarSerDsc = P01EN9_A1652BarSerDsc[0] ;
               A3271AlbHdrAnc = P01EN9_A3271AlbHdrAnc[0] ;
               A2827BarKgsLot = P01EN9_A2827BarKgsLot[0] ;
               A1266BarAlbTub = P01EN9_A1266BarAlbTub[0] ;
               A143BarDisNum = P01EN9_A143BarDisNum[0] ;
               A1261BarAlbKgmE = P01EN9_A1261BarAlbKgmE[0] ;
               A1265BarAlbPie = P01EN9_A1265BarAlbPie[0] ;
               A166BarKgm = P01EN9_A166BarKgm[0] ;
               n166BarKgm = P01EN9_n166BarKgm[0] ;
               A136BarColNum = P01EN9_A136BarColNum[0] ;
               A1235BarNumCli = P01EN9_A1235BarNumCli[0] ;
               A1234BarNomCli = P01EN9_A1234BarNomCli[0] ;
               A1652BarSerDsc = P01EN9_A1652BarSerDsc[0] ;
               A2827BarKgsLot = P01EN9_A2827BarKgsLot[0] ;
               A143BarDisNum = P01EN9_A143BarDisNum[0] ;
               A1207TubNom = P01EN9_A1207TubNom[0] ;
               n1207TubNom = P01EN9_n1207TubNom[0] ;
               A166BarKgm = P01EN9_A166BarKgm[0] ;
               n166BarKgm = P01EN9_n166BarKgm[0] ;
               AV50barcolnum = A136BarColNum ;
               AV55Hdr = httpContext.getMessage( "O/S ", "") + GXutil.str( A129BarCod, 8, 0) + " " + " " + A130BarCodPar ;
               AV56KgsE = A166BarKgm ;
               AV61TubNom_1 = GXutil.substring( A1207TubNom, 5, 7) ;
               AV62Color_cli = A1234BarNomCli + GXutil.str( A1235BarNumCli, 6, 0) ;
               if ( A1235BarNumCli == 0 )
               {
                  AV62Color_cli = A1234BarNomCli ;
               }
               AV63SerDsc_1 = GXutil.substring( A1652BarSerDsc, 1, 20) ;
               AV67Ancho_s = A3271AlbHdrAnc ;
               if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A2827BarKgsLot)==0) )
               {
                  AV72Var_kgs = "( " + GXutil.str( AV73Kilos_ini, 9, 2) + " )" ;
               }
               else
               {
                  AV72Var_kgs = GXutil.space( (short)(13)) ;
               }
               if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A2827BarKgsLot)==0) )
               {
                  h1EN0( false, 16) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55Hdr, "")), 371, Gx_line+0, 481, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A1261BarAlbKgmE, "ZZZZZ9.99")), 682, Gx_line+0, 749, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV63SerDsc_1, "")), 223, Gx_line+0, 370, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A143BarDisNum, "")), 70, Gx_line+0, 129, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV61TubNom_1, "")), 132, Gx_line+0, 184, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1266BarAlbTub), "ZZZ9")), 186, Gx_line+0, 231, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV67Ancho_s), "ZZZZ")), 646, Gx_line+0, 676, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV62Color_cli, "")), 493, Gx_line+0, 640, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Kg", ""), 751, Gx_line+0, 767, Gx_line+16, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+16) ;
               }
               else
               {
                  h1EN0( false, 33) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55Hdr, "")), 371, Gx_line+0, 481, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A1261BarAlbKgmE, "ZZZZZ9.99")), 682, Gx_line+0, 749, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV63SerDsc_1, "")), 223, Gx_line+0, 370, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A143BarDisNum, "")), 70, Gx_line+0, 129, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV61TubNom_1, "")), 132, Gx_line+0, 184, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1266BarAlbTub), "ZZZ9")), 186, Gx_line+0, 231, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV67Ancho_s), "ZZZZ")), 646, Gx_line+0, 676, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV62Color_cli, "")), 493, Gx_line+0, 640, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Kg", ""), 751, Gx_line+0, 767, Gx_line+16, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV72Var_kgs, "")), 675, Gx_line+17, 771, Gx_line+34, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+33) ;
               }
               AV48ContLine = (byte)(AV48ContLine+1) ;
               AV53TotPzas = (int)(AV53TotPzas+A1265BarAlbPie) ;
               AV54TotKgs = AV54TotKgs.add(A1261BarAlbKgmE) ;
               /* Using cursor P01EN10 */
               pr_default.execute(7, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
               while ( (pr_default.getStatus(7) != 101) )
               {
                  A457FasCod = P01EN10_A457FasCod[0] ;
                  A1275FasKgm = P01EN10_A1275FasKgm[0] ;
                  A460FasDsc = P01EN10_A460FasDsc[0] ;
                  A1240GuiFasLin = P01EN10_A1240GuiFasLin[0] ;
                  A460FasDsc = P01EN10_A460FasDsc[0] ;
                  h1EN0( false, 17) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A460FasDsc, "")), 223, Gx_line+0, 428, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A1275FasKgm, "ZZZZZ9.99")), 682, Gx_line+0, 749, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Kg", ""), 751, Gx_line+0, 767, Gx_line+16, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+17) ;
                  AV48ContLine = (byte)(AV48ContLine+1) ;
                  pr_default.readNext(7);
               }
               pr_default.close(7);
               pr_default.readNext(6);
            }
            pr_default.close(6);
            AV68Flag_tubos = (byte)(1) ;
            GXv_char1[0] = A396EmprCod ;
            GXv_int2[0] = A30AlbProCod ;
            GXv_char3[0] = Gx_msg ;
            new app.ptubetx(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_char3) ;
            pgrmetx.this.A396EmprCod = GXv_char1[0] ;
            pgrmetx.this.A30AlbProCod = GXv_int2[0] ;
            pgrmetx.this.Gx_msg = GXv_char3[0] ;
            if ( ( AV68Flag_tubos == 1 ) && ! (GXutil.strcmp("", Gx_msg)==0) )
            {
               h1EN0( false, 27) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Embalagens:", ""), 59, Gx_line+4, 137, Gx_line+20, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_msg, "")), 146, Gx_line+4, 657, Gx_line+21, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(55, Gx_line+1, 765, Gx_line+24, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+27) ;
            }
            if ( A33AlbProEst == 0 )
            {
               A33AlbProEst = (byte)(1) ;
               A1782AlbProEso = (byte)(1) ;
            }
            /* Using cursor P01EN11 */
            pr_default.execute(8, new Object[] {Byte.valueOf(A33AlbProEst), Byte.valueOf(A1782AlbProEso), A396EmprCod, Long.valueOf(A30AlbProCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         pr_default.close(4);
         pr_default.close(1);
         pr_default.close(2);
         pr_default.close(3);
         GxHdr2 = false ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h1EN0( true, 0) ;
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
      /* 'CLIENTE' Routine */
      returnInSub = false ;
      AV17CliNom = "" ;
      AV18CliDom = "" ;
      AV19Clicp = "" ;
      AV20CliPob = "" ;
      AV47CliNif = "" ;
      AV23CliENom = "" ;
      AV24CliEDom = "" ;
      AV25CliEcp = "" ;
      AV26CliEPob = "" ;
      /* Using cursor P01EN12 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(AV16CliCod)});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A781PrvCod = P01EN12_A781PrvCod[0] ;
         A252CliCod = P01EN12_A252CliCod[0] ;
         A279CliNom = P01EN12_A279CliNom[0] ;
         A260CliDom = P01EN12_A260CliDom[0] ;
         n260CliDom = P01EN12_n260CliDom[0] ;
         A256CliCp = P01EN12_A256CliCp[0] ;
         n256CliCp = P01EN12_n256CliCp[0] ;
         A295CliPob = P01EN12_A295CliPob[0] ;
         n295CliPob = P01EN12_n295CliPob[0] ;
         A278CliNif = P01EN12_A278CliNif[0] ;
         A787PrvDsc = P01EN12_A787PrvDsc[0] ;
         n787PrvDsc = P01EN12_n787PrvDsc[0] ;
         A787PrvDsc = P01EN12_A787PrvDsc[0] ;
         n787PrvDsc = P01EN12_n787PrvDsc[0] ;
         AV17CliNom = A279CliNom ;
         AV18CliDom = A260CliDom ;
         AV19Clicp = A256CliCp ;
         AV20CliPob = A295CliPob ;
         AV47CliNif = A278CliNif ;
         AV23CliENom = A279CliNom ;
         AV24CliEDom = A260CliDom ;
         AV25CliEcp = A256CliCp ;
         AV26CliEPob = A295CliPob ;
         AV70PrvDsc = A787PrvDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(9);
      /* Execute user subroutine: 'ENVIO' */
      S121 ();
      if (returnInSub) return;
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'ENVIO' Routine */
      returnInSub = false ;
      /* Using cursor P01EN13 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(AV16CliCod), Byte.valueOf(AV22CliEnvDom)});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A266CliEnvLin = P01EN13_A266CliEnvLin[0] ;
         A252CliCod = P01EN13_A252CliCod[0] ;
         A267CliEnvNom = P01EN13_A267CliEnvNom[0] ;
         A265CliEnvDom = P01EN13_A265CliEnvDom[0] ;
         A264CliEnvCp = P01EN13_A264CliEnvCp[0] ;
         A268CliEnvPob = P01EN13_A268CliEnvPob[0] ;
         A270CliEnvPrv = P01EN13_A270CliEnvPrv[0] ;
         AV23CliENom = A267CliEnvNom ;
         AV24CliEDom = A265CliEnvDom ;
         AV25CliEcp = A264CliEnvCp ;
         AV26CliEPob = A268CliEnvPob ;
         AV71CodPrv = A270CliEnvPrv ;
         /* Execute user subroutine: 'PROVIN' */
         S139 ();
         if ( returnInSub )
         {
            pr_default.close(10);
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
      pr_default.close(10);
   }

   public void S139( ) throws ProcessInterruptedException
   {
      /* 'PROVIN' Routine */
      returnInSub = false ;
      /* Using cursor P01EN14 */
      pr_default.execute(11, new Object[] {Short.valueOf(AV71CodPrv)});
      while ( (pr_default.getStatus(11) != 101) )
      {
         A781PrvCod = P01EN14_A781PrvCod[0] ;
         A787PrvDsc = P01EN14_A787PrvDsc[0] ;
         n787PrvDsc = P01EN14_n787PrvDsc[0] ;
         AV70PrvDsc = A787PrvDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(11);
   }

   public void h1EN0( boolean bFoot ,
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
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Observaçôes:", ""), 63, Gx_line+8, 143, Gx_line+24, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV59vObs[1-1], "")), 157, Gx_line+8, 523, Gx_line+25, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV59vObs[2-1], "")), 157, Gx_line+27, 523, Gx_line+44, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV60ContDsc, "")), 55, Gx_line+184, 201, Gx_line+199, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "VILAR - S.JOÃO das CALDAS AP.90 CALDAS de VIZELA CODEX", ""), 254, Gx_line+185, 608, Gx_line+199, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Local de Carga:", ""), 64, Gx_line+52, 156, Gx_line+68, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "VILAR", ""), 158, Gx_line+52, 194, Gx_line+68, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "S. JOAO DAS CALDAS", ""), 158, Gx_line+71, 288, Gx_line+87, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Partida:", ""), 528, Gx_line+52, 573, Gx_line+68, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( A34AlbProfch, "99/99/99"), 578, Gx_line+52, 629, Gx_line+69, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV66AlbHorSal, "")), 669, Gx_line+52, 762, Gx_line+69, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Hora:", ""), 652, Gx_line+104, 684, Gx_line+120, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Matricula:", ""), 528, Gx_line+71, 583, Gx_line+87, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV65AlbMat, "")), 590, Gx_line+71, 695, Gx_line+88, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Local de Descarga:", ""), 64, Gx_line+102, 176, Gx_line+118, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24CliEDom, "")), 178, Gx_line+103, 356, Gx_line+120, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26CliEPob, "")), 178, Gx_line+122, 335, Gx_line+139, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25CliEcp, "")), 178, Gx_line+140, 248, Gx_line+157, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Chegada:     /     /", ""), 528, Gx_line+104, 623, Gx_line+120, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Hora:", ""), 639, Gx_line+52, 671, Gx_line+68, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "RECEBIDO POR", ""), 591, Gx_line+132, 688, Gx_line+148, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(534, Gx_line+175, 744, Gx_line+175, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawRect(55, Gx_line+2, 765, Gx_line+182, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70PrvDsc, "@!")), 251, Gx_line+140, 408, Gx_line+157, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+199) ;
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
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 456, Gx_line+243, 645, Gx_line+261, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A260CliDom, "")), 456, Gx_line+266, 670, Gx_line+284, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A295CliPob, "")), 456, Gx_line+286, 645, Gx_line+304, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51TextoCopia, "")), 49, Gx_line+235, 144, Gx_line+253, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Nº Cliente:", ""), 55, Gx_line+314, 116, Gx_line+330, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Nº Contibuinte:", ""), 55, Gx_line+336, 141, Gx_line+352, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1243GuiRemCli), "ZZZZZ9")), 160, Gx_line+314, 205, Gx_line+331, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( A34AlbProfch, "99/99/99"), 611, Gx_line+67, 664, Gx_line+85, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47CliNif, "@!")), 160, Gx_line+335, 265, Gx_line+352, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9")), 611, Gx_line+83, 685, Gx_line+101, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57VDoc, "")), 561, Gx_line+44, 729, Gx_line+65, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "969bc018-2e69-44a8-9a51-2bdb92ccce51", "", context.getHttpContext().getTheme( )), 49, Gx_line+29, 272, Gx_line+207) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Nº", ""), 561, Gx_line+83, 577, Gx_line+100, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "DATA", ""), 561, Gx_line+67, 596, Gx_line+84, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Via Expediçao", ""), 55, Gx_line+368, 136, Gx_line+384, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Vendedor", ""), 55, Gx_line+388, 110, Gx_line+404, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, true, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Processado por computador", ""), 55, Gx_line+418, 201, Gx_line+433, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(55, Gx_line+448, 765, Gx_line+475, 1, 128, 128, 128, 1, 128, 128, 128, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "V/ENC.", ""), 70, Gx_line+453, 112, Gx_line+469, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "EMBALAGEM", ""), 139, Gx_line+453, 215, Gx_line+469, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "DESCRIÇAO", ""), 316, Gx_line+453, 391, Gx_line+469, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "COR", ""), 549, Gx_line+453, 578, Gx_line+469, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "LARG", ""), 645, Gx_line+453, 679, Gx_line+469, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "QTD", ""), 722, Gx_line+453, 749, Gx_line+469, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Taxa IVA - ", ""), 622, Gx_line+418, 678, Gx_line+434, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV64IvaPor), "Z9")), 681, Gx_line+418, 697, Gx_line+435, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(130, Gx_line+448, 130, Gx_line+475, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(220, Gx_line+448, 220, Gx_line+475, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(483, Gx_line+448, 483, Gx_line+475, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(642, Gx_line+448, 642, Gx_line+475, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(679, Gx_line+448, 679, Gx_line+475, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV69Cp_1_2, "")), 456, Gx_line+308, 514, Gx_line+325, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70PrvDsc, "@!")), 547, Gx_line+308, 704, Gx_line+325, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A841TrnNom, "")), 160, Gx_line+368, 379, Gx_line+384, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "DAM - MERC.INTERNO", ""), 160, Gx_line+388, 291, Gx_line+405, 0, 0, 0, 0) ;
               getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "55cb65a2-e05c-428a-878e-320846a693a8", "", context.getHttpContext().getTheme( )), 309, Gx_line+115, 402, Gx_line+208) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+479) ;
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
      this.aP0[0] = pgrmetx.this.A396EmprCod;
      this.aP1[0] = pgrmetx.this.A30AlbProCod;
      this.aP2[0] = pgrmetx.this.AV15ImpCod;
      this.aP3[0] = pgrmetx.this.AV51TextoCopia;
      this.aP4[0] = pgrmetx.this.Gx_out;
      Application.commitDataStores(context, remoteHandle, pr_default, "pgrmetx");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV60ContDsc = "" ;
      scmdbuf = "" ;
      P01EN2_A1253EmprGuiRem = new String[] {""} ;
      P01EN2_A840TrnCod = new short[1] ;
      P01EN2_A396EmprCod = new String[] {""} ;
      P01EN2_A30AlbProCod = new long[1] ;
      P01EN2_A1259AlbDomEnv = new byte[1] ;
      P01EN2_n1259AlbDomEnv = new boolean[] {false} ;
      P01EN2_A39AlbProPri = new String[] {""} ;
      P01EN2_A3868AlbMat = new String[] {""} ;
      P01EN2_A3865AlbHorSal = new String[] {""} ;
      P01EN2_A1879AlbProEnt = new String[] {""} ;
      P01EN2_n1879AlbProEnt = new boolean[] {false} ;
      P01EN2_A33AlbProEst = new byte[1] ;
      P01EN2_A1782AlbProEso = new byte[1] ;
      P01EN2_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P01EN2_A1243GuiRemCli = new int[1] ;
      A1253EmprGuiRem = "" ;
      A39AlbProPri = "" ;
      A3868AlbMat = "" ;
      A3865AlbHorSal = "" ;
      A1879AlbProEnt = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      P01EN3_A953IvaCod = new String[] {""} ;
      P01EN3_n953IvaCod = new boolean[] {false} ;
      P01EN3_A407EmprNom = new String[] {""} ;
      P01EN3_n407EmprNom = new boolean[] {false} ;
      A953IvaCod = "" ;
      A407EmprNom = "" ;
      P01EN4_A588IvaPor = new byte[1] ;
      P01EN4_n588IvaPor = new boolean[] {false} ;
      P01EN5_A841TrnNom = new String[] {""} ;
      P01EN5_n841TrnNom = new boolean[] {false} ;
      A841TrnNom = "" ;
      P01EN6_A4828CliCp2 = new String[] {""} ;
      P01EN6_n4828CliCp2 = new boolean[] {false} ;
      P01EN6_A256CliCp = new String[] {""} ;
      P01EN6_n256CliCp = new boolean[] {false} ;
      P01EN6_A295CliPob = new String[] {""} ;
      P01EN6_n295CliPob = new boolean[] {false} ;
      P01EN6_A260CliDom = new String[] {""} ;
      P01EN6_n260CliDom = new boolean[] {false} ;
      A4828CliCp2 = "" ;
      A256CliCp = "" ;
      A295CliPob = "" ;
      A260CliDom = "" ;
      AV29Prioridad = "" ;
      AV65AlbMat = "" ;
      AV66AlbHorSal = "" ;
      AV69Cp_1_2 = "" ;
      AV21EmprNom = "" ;
      AV57VDoc = "" ;
      AV46vCopia = "" ;
      AV59vObs = new String[2] ;
      GX_I = 1 ;
      while ( GX_I <= 2 )
      {
         AV59vObs[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P01EN7_A396EmprCod = new String[] {""} ;
      P01EN7_A30AlbProCod = new long[1] ;
      P01EN7_A916AlbPObs = new String[] {""} ;
      P01EN7_A915AlbPObsLin = new byte[1] ;
      A916AlbPObs = "" ;
      AV52Matricula = "" ;
      P01EN9_A1206TubCod = new short[1] ;
      P01EN9_n1206TubCod = new boolean[] {false} ;
      P01EN9_A396EmprCod = new String[] {""} ;
      P01EN9_A30AlbProCod = new long[1] ;
      P01EN9_A130BarCodPar = new String[] {""} ;
      P01EN9_A132BarCodReo = new byte[1] ;
      P01EN9_A129BarCod = new int[1] ;
      P01EN9_A136BarColNum = new int[1] ;
      P01EN9_A1207TubNom = new String[] {""} ;
      P01EN9_n1207TubNom = new boolean[] {false} ;
      P01EN9_A1235BarNumCli = new int[1] ;
      P01EN9_A1234BarNomCli = new String[] {""} ;
      P01EN9_A1652BarSerDsc = new String[] {""} ;
      P01EN9_A3271AlbHdrAnc = new short[1] ;
      P01EN9_A2827BarKgsLot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01EN9_A1266BarAlbTub = new int[1] ;
      P01EN9_A143BarDisNum = new String[] {""} ;
      P01EN9_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01EN9_A1265BarAlbPie = new int[1] ;
      P01EN9_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01EN9_n166BarKgm = new boolean[] {false} ;
      A130BarCodPar = "" ;
      A1207TubNom = "" ;
      A1234BarNomCli = "" ;
      A1652BarSerDsc = "" ;
      A2827BarKgsLot = DecimalUtil.ZERO ;
      A143BarDisNum = "" ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A166BarKgm = DecimalUtil.ZERO ;
      AV55Hdr = "" ;
      AV56KgsE = DecimalUtil.ZERO ;
      AV61TubNom_1 = "" ;
      AV62Color_cli = "" ;
      AV63SerDsc_1 = "" ;
      AV72Var_kgs = "" ;
      AV73Kilos_ini = DecimalUtil.ZERO ;
      AV54TotKgs = DecimalUtil.ZERO ;
      P01EN10_A457FasCod = new String[] {""} ;
      P01EN10_A396EmprCod = new String[] {""} ;
      P01EN10_A30AlbProCod = new long[1] ;
      P01EN10_A129BarCod = new int[1] ;
      P01EN10_A132BarCodReo = new byte[1] ;
      P01EN10_A130BarCodPar = new String[] {""} ;
      P01EN10_A1275FasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01EN10_A460FasDsc = new String[] {""} ;
      P01EN10_A1240GuiFasLin = new short[1] ;
      A457FasCod = "" ;
      A1275FasKgm = DecimalUtil.ZERO ;
      A460FasDsc = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new long[1] ;
      Gx_msg = "" ;
      GXv_char3 = new String[1] ;
      AV17CliNom = "" ;
      AV18CliDom = "" ;
      AV19Clicp = "" ;
      AV20CliPob = "" ;
      AV47CliNif = "" ;
      AV23CliENom = "" ;
      AV24CliEDom = "" ;
      AV25CliEcp = "" ;
      AV26CliEPob = "" ;
      P01EN12_A781PrvCod = new short[1] ;
      P01EN12_A396EmprCod = new String[] {""} ;
      P01EN12_A252CliCod = new int[1] ;
      P01EN12_A279CliNom = new String[] {""} ;
      P01EN12_A260CliDom = new String[] {""} ;
      P01EN12_n260CliDom = new boolean[] {false} ;
      P01EN12_A256CliCp = new String[] {""} ;
      P01EN12_n256CliCp = new boolean[] {false} ;
      P01EN12_A295CliPob = new String[] {""} ;
      P01EN12_n295CliPob = new boolean[] {false} ;
      P01EN12_A278CliNif = new String[] {""} ;
      P01EN12_A787PrvDsc = new String[] {""} ;
      P01EN12_n787PrvDsc = new boolean[] {false} ;
      A279CliNom = "" ;
      A278CliNif = "" ;
      A787PrvDsc = "" ;
      AV70PrvDsc = "" ;
      P01EN13_A396EmprCod = new String[] {""} ;
      P01EN13_A266CliEnvLin = new byte[1] ;
      P01EN13_A252CliCod = new int[1] ;
      P01EN13_A267CliEnvNom = new String[] {""} ;
      P01EN13_A265CliEnvDom = new String[] {""} ;
      P01EN13_A264CliEnvCp = new String[] {""} ;
      P01EN13_A268CliEnvPob = new String[] {""} ;
      P01EN13_A270CliEnvPrv = new short[1] ;
      A267CliEnvNom = "" ;
      A265CliEnvDom = "" ;
      A264CliEnvCp = "" ;
      A268CliEnvPob = "" ;
      P01EN14_A781PrvCod = new short[1] ;
      P01EN14_A787PrvDsc = new String[] {""} ;
      P01EN14_n787PrvDsc = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pgrmetx__default(),
         new Object[] {
             new Object[] {
            P01EN2_A1253EmprGuiRem, P01EN2_A840TrnCod, P01EN2_A396EmprCod, P01EN2_A30AlbProCod, P01EN2_A1259AlbDomEnv, P01EN2_n1259AlbDomEnv, P01EN2_A39AlbProPri, P01EN2_A3868AlbMat, P01EN2_A3865AlbHorSal, P01EN2_A1879AlbProEnt,
            P01EN2_n1879AlbProEnt, P01EN2_A33AlbProEst, P01EN2_A1782AlbProEso, P01EN2_A34AlbProfch, P01EN2_A1243GuiRemCli
            }
            , new Object[] {
            P01EN3_A953IvaCod, P01EN3_n953IvaCod, P01EN3_A407EmprNom, P01EN3_n407EmprNom
            }
            , new Object[] {
            P01EN4_A588IvaPor, P01EN4_n588IvaPor
            }
            , new Object[] {
            P01EN5_A841TrnNom, P01EN5_n841TrnNom
            }
            , new Object[] {
            P01EN6_A4828CliCp2, P01EN6_n4828CliCp2, P01EN6_A256CliCp, P01EN6_n256CliCp, P01EN6_A295CliPob, P01EN6_n295CliPob, P01EN6_A260CliDom, P01EN6_n260CliDom
            }
            , new Object[] {
            P01EN7_A396EmprCod, P01EN7_A30AlbProCod, P01EN7_A916AlbPObs, P01EN7_A915AlbPObsLin
            }
            , new Object[] {
            P01EN9_A1206TubCod, P01EN9_n1206TubCod, P01EN9_A396EmprCod, P01EN9_A30AlbProCod, P01EN9_A130BarCodPar, P01EN9_A132BarCodReo, P01EN9_A129BarCod, P01EN9_A136BarColNum, P01EN9_A1207TubNom, P01EN9_n1207TubNom,
            P01EN9_A1235BarNumCli, P01EN9_A1234BarNomCli, P01EN9_A1652BarSerDsc, P01EN9_A3271AlbHdrAnc, P01EN9_A2827BarKgsLot, P01EN9_A1266BarAlbTub, P01EN9_A143BarDisNum, P01EN9_A1261BarAlbKgmE, P01EN9_A1265BarAlbPie, P01EN9_A166BarKgm,
            P01EN9_n166BarKgm
            }
            , new Object[] {
            P01EN10_A457FasCod, P01EN10_A396EmprCod, P01EN10_A30AlbProCod, P01EN10_A129BarCod, P01EN10_A132BarCodReo, P01EN10_A130BarCodPar, P01EN10_A1275FasKgm, P01EN10_A460FasDsc, P01EN10_A1240GuiFasLin
            }
            , new Object[] {
            }
            , new Object[] {
            P01EN12_A781PrvCod, P01EN12_A396EmprCod, P01EN12_A252CliCod, P01EN12_A279CliNom, P01EN12_A260CliDom, P01EN12_A256CliCp, P01EN12_A295CliPob, P01EN12_A278CliNif, P01EN12_A787PrvDsc, P01EN12_n787PrvDsc
            }
            , new Object[] {
            P01EN13_A396EmprCod, P01EN13_A266CliEnvLin, P01EN13_A252CliCod, P01EN13_A267CliEnvNom, P01EN13_A265CliEnvDom, P01EN13_A264CliEnvCp, P01EN13_A268CliEnvPob, P01EN13_A270CliEnvPrv
            }
            , new Object[] {
            P01EN14_A781PrvCod, P01EN14_A787PrvDsc, P01EN14_n787PrvDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte AV68Flag_tubos ;
   private byte A1259AlbDomEnv ;
   private byte A33AlbProEst ;
   private byte A1782AlbProEso ;
   private byte A588IvaPor ;
   private byte AV22CliEnvDom ;
   private byte AV64IvaPor ;
   private byte AV49Copias ;
   private byte AV58i ;
   private byte A915AlbPObsLin ;
   private byte AV48ContLine ;
   private byte A132BarCodReo ;
   private byte A266CliEnvLin ;
   private short A840TrnCod ;
   private short A1206TubCod ;
   private short A3271AlbHdrAnc ;
   private short AV67Ancho_s ;
   private short A1240GuiFasLin ;
   private short A781PrvCod ;
   private short A270CliEnvPrv ;
   private short AV71CodPrv ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A1243GuiRemCli ;
   private int AV16CliCod ;
   private int GX_I ;
   private int A129BarCod ;
   private int A136BarColNum ;
   private int A1235BarNumCli ;
   private int A1266BarAlbTub ;
   private int A1265BarAlbPie ;
   private int AV50barcolnum ;
   private int Gx_OldLine ;
   private int AV53TotPzas ;
   private int A252CliCod ;
   private long A30AlbProCod ;
   private long GXv_int2[] ;
   private java.math.BigDecimal A2827BarKgsLot ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal AV56KgsE ;
   private java.math.BigDecimal AV73Kilos_ini ;
   private java.math.BigDecimal AV54TotKgs ;
   private java.math.BigDecimal A1275FasKgm ;
   private String A396EmprCod ;
   private String AV15ImpCod ;
   private String AV51TextoCopia ;
   private String Gx_out ;
   private String AV60ContDsc ;
   private String scmdbuf ;
   private String A1253EmprGuiRem ;
   private String A39AlbProPri ;
   private String A3868AlbMat ;
   private String A3865AlbHorSal ;
   private String A1879AlbProEnt ;
   private String A953IvaCod ;
   private String A407EmprNom ;
   private String A841TrnNom ;
   private String A4828CliCp2 ;
   private String A256CliCp ;
   private String A295CliPob ;
   private String A260CliDom ;
   private String AV29Prioridad ;
   private String AV65AlbMat ;
   private String AV66AlbHorSal ;
   private String AV69Cp_1_2 ;
   private String AV21EmprNom ;
   private String AV57VDoc ;
   private String AV46vCopia ;
   private String AV59vObs[] ;
   private String A916AlbPObs ;
   private String AV52Matricula ;
   private String A130BarCodPar ;
   private String A1207TubNom ;
   private String A1234BarNomCli ;
   private String A1652BarSerDsc ;
   private String A143BarDisNum ;
   private String AV55Hdr ;
   private String AV61TubNom_1 ;
   private String AV62Color_cli ;
   private String AV63SerDsc_1 ;
   private String AV72Var_kgs ;
   private String A457FasCod ;
   private String A460FasDsc ;
   private String GXv_char1[] ;
   private String Gx_msg ;
   private String GXv_char3[] ;
   private String AV17CliNom ;
   private String AV18CliDom ;
   private String AV19Clicp ;
   private String AV20CliPob ;
   private String AV47CliNif ;
   private String AV23CliENom ;
   private String AV24CliEDom ;
   private String AV25CliEcp ;
   private String AV26CliEPob ;
   private String A279CliNom ;
   private String A278CliNif ;
   private String A787PrvDsc ;
   private String AV70PrvDsc ;
   private String A267CliEnvNom ;
   private String A265CliEnvDom ;
   private String A264CliEnvCp ;
   private String A268CliEnvPob ;
   private java.util.Date A34AlbProfch ;
   private boolean GxHdr2 ;
   private boolean n1259AlbDomEnv ;
   private boolean n1879AlbProEnt ;
   private boolean n953IvaCod ;
   private boolean n407EmprNom ;
   private boolean n588IvaPor ;
   private boolean n841TrnNom ;
   private boolean n4828CliCp2 ;
   private boolean n256CliCp ;
   private boolean n295CliPob ;
   private boolean n260CliDom ;
   private boolean returnInSub ;
   private boolean n1206TubCod ;
   private boolean n1207TubNom ;
   private boolean n166BarKgm ;
   private boolean n787PrvDsc ;
   private String[] aP4 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P01EN2_A1253EmprGuiRem ;
   private short[] P01EN2_A840TrnCod ;
   private String[] P01EN2_A396EmprCod ;
   private long[] P01EN2_A30AlbProCod ;
   private byte[] P01EN2_A1259AlbDomEnv ;
   private boolean[] P01EN2_n1259AlbDomEnv ;
   private String[] P01EN2_A39AlbProPri ;
   private String[] P01EN2_A3868AlbMat ;
   private String[] P01EN2_A3865AlbHorSal ;
   private String[] P01EN2_A1879AlbProEnt ;
   private boolean[] P01EN2_n1879AlbProEnt ;
   private byte[] P01EN2_A33AlbProEst ;
   private byte[] P01EN2_A1782AlbProEso ;
   private java.util.Date[] P01EN2_A34AlbProfch ;
   private int[] P01EN2_A1243GuiRemCli ;
   private String[] P01EN3_A953IvaCod ;
   private boolean[] P01EN3_n953IvaCod ;
   private String[] P01EN3_A407EmprNom ;
   private boolean[] P01EN3_n407EmprNom ;
   private byte[] P01EN4_A588IvaPor ;
   private boolean[] P01EN4_n588IvaPor ;
   private String[] P01EN5_A841TrnNom ;
   private boolean[] P01EN5_n841TrnNom ;
   private String[] P01EN6_A4828CliCp2 ;
   private boolean[] P01EN6_n4828CliCp2 ;
   private String[] P01EN6_A256CliCp ;
   private boolean[] P01EN6_n256CliCp ;
   private String[] P01EN6_A295CliPob ;
   private boolean[] P01EN6_n295CliPob ;
   private String[] P01EN6_A260CliDom ;
   private boolean[] P01EN6_n260CliDom ;
   private String[] P01EN7_A396EmprCod ;
   private long[] P01EN7_A30AlbProCod ;
   private String[] P01EN7_A916AlbPObs ;
   private byte[] P01EN7_A915AlbPObsLin ;
   private short[] P01EN9_A1206TubCod ;
   private boolean[] P01EN9_n1206TubCod ;
   private String[] P01EN9_A396EmprCod ;
   private long[] P01EN9_A30AlbProCod ;
   private String[] P01EN9_A130BarCodPar ;
   private byte[] P01EN9_A132BarCodReo ;
   private int[] P01EN9_A129BarCod ;
   private int[] P01EN9_A136BarColNum ;
   private String[] P01EN9_A1207TubNom ;
   private boolean[] P01EN9_n1207TubNom ;
   private int[] P01EN9_A1235BarNumCli ;
   private String[] P01EN9_A1234BarNomCli ;
   private String[] P01EN9_A1652BarSerDsc ;
   private short[] P01EN9_A3271AlbHdrAnc ;
   private java.math.BigDecimal[] P01EN9_A2827BarKgsLot ;
   private int[] P01EN9_A1266BarAlbTub ;
   private String[] P01EN9_A143BarDisNum ;
   private java.math.BigDecimal[] P01EN9_A1261BarAlbKgmE ;
   private int[] P01EN9_A1265BarAlbPie ;
   private java.math.BigDecimal[] P01EN9_A166BarKgm ;
   private boolean[] P01EN9_n166BarKgm ;
   private String[] P01EN10_A457FasCod ;
   private String[] P01EN10_A396EmprCod ;
   private long[] P01EN10_A30AlbProCod ;
   private int[] P01EN10_A129BarCod ;
   private byte[] P01EN10_A132BarCodReo ;
   private String[] P01EN10_A130BarCodPar ;
   private java.math.BigDecimal[] P01EN10_A1275FasKgm ;
   private String[] P01EN10_A460FasDsc ;
   private short[] P01EN10_A1240GuiFasLin ;
   private short[] P01EN12_A781PrvCod ;
   private String[] P01EN12_A396EmprCod ;
   private int[] P01EN12_A252CliCod ;
   private String[] P01EN12_A279CliNom ;
   private String[] P01EN12_A260CliDom ;
   private boolean[] P01EN12_n260CliDom ;
   private String[] P01EN12_A256CliCp ;
   private boolean[] P01EN12_n256CliCp ;
   private String[] P01EN12_A295CliPob ;
   private boolean[] P01EN12_n295CliPob ;
   private String[] P01EN12_A278CliNif ;
   private String[] P01EN12_A787PrvDsc ;
   private boolean[] P01EN12_n787PrvDsc ;
   private String[] P01EN13_A396EmprCod ;
   private byte[] P01EN13_A266CliEnvLin ;
   private int[] P01EN13_A252CliCod ;
   private String[] P01EN13_A267CliEnvNom ;
   private String[] P01EN13_A265CliEnvDom ;
   private String[] P01EN13_A264CliEnvCp ;
   private String[] P01EN13_A268CliEnvPob ;
   private short[] P01EN13_A270CliEnvPrv ;
   private short[] P01EN14_A781PrvCod ;
   private String[] P01EN14_A787PrvDsc ;
   private boolean[] P01EN14_n787PrvDsc ;
}

final  class pgrmetx__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01EN2", "SELECT EmprGuiRem, TrnCod, EmprCod, AlbProCod, AlbDomEnv, AlbProPri, AlbMat, AlbHorSal, AlbProEnt, AlbProEst, AlbProEso, AlbProfch, GuiRemCli FROM TXPCALPRD WHERE (EmprCod = ? AND AlbProCod = ?) AND (EmprCod = ? and AlbProCod = ?)  FOR UPDATE OF AlbProEst, AlbProEso NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01EN3", "SELECT IvaCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01EN4", "SELECT IvaPor FROM TXPTIPIVA WHERE IvaCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01EN5", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01EN6", "SELECT CliCp2, CliCp, CliPob, CliDom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01EN7", "SELECT EmprCod, AlbProCod, AlbPObs, AlbPObsLin FROM TXPOBSALB WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01EN9", "SELECT T1.TubCod, T1.EmprCod, T1.AlbProCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T2.BarColNum, T3.TubNom, T2.BarNumCli, T2.BarNomCli, T2.BarSerDsc, T1.AlbHdrAnc, T2.BarKgsLot, T1.BarAlbTub, T2.BarDisNum, T1.BarAlbKgmE, T1.BarAlbPie, COALESCE( T4.BarKgm, 0) AS BarKgm FROM ((((TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPTUBOS T3 ON T3.EmprCod = T1.EmprCod AND T3.TubCod = T1.TubCod) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) INNER JOIN TXPCALPRD T5 ON T5.EmprCod = T1.EmprCod AND T5.AlbProCod = T1.AlbProCod) WHERE T1.EmprCod = ? and T1.AlbProCod = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01EN10", "SELECT T1.FasCod, T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.FasKgm, T2.FasDsc, T1.GuiFasLin FROM ((TXPALBFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) INNER JOIN TXPCALPRD T3 ON T3.EmprCod = T1.EmprCod AND T3.AlbProCod = T1.AlbProCod) WHERE T1.EmprCod = ? and T1.AlbProCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.GuiFasLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01EN11", "UPDATE TXPCALPRD SET AlbProEst=?, AlbProEso=?  WHERE EmprCod = ? AND AlbProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALPRD")
         ,new ForEachCursor("P01EN12", "SELECT T1.PrvCod, T1.EmprCod, T1.CliCod, T1.CliNom, T1.CliDom, T1.CliCp, T1.CliPob, T1.CliNif, T2.PrvDsc FROM (TXPCLIENT T1 INNER JOIN TXPPROVIN T2 ON T2.PrvCod = T1.PrvCod) WHERE T1.EmprCod = ? and T1.CliCod = ? ORDER BY T1.EmprCod, T1.CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01EN13", "SELECT EmprCod, CliEnvLin, CliCod, CliEnvNom, CliEnvDom, CliEnvCp, CliEnvPob, CliEnvPrv FROM TXPCLIENV WHERE EmprCod = ? and CliCod = ? and CliEnvLin = ? ORDER BY EmprCod, CliCod, CliEnvLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01EN14", "SELECT PrvCod, PrvDsc FROM TXPPROVIN WHERE PrvCod = ? ORDER BY PrvCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((long[]) buf[3])[0] = rslt.getLong(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((String[]) buf[7])[0] = rslt.getString(7, 20);
               ((String[]) buf[8])[0] = rslt.getString(8, 8);
               ((String[]) buf[9])[0] = rslt.getString(9, 40);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(10);
               ((byte[]) buf[12])[0] = rslt.getByte(11);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(12);
               ((int[]) buf[14])[0] = rslt.getInt(13);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 34);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 50);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((long[]) buf[3])[0] = rslt.getLong(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(9);
               ((String[]) buf[11])[0] = rslt.getString(10, 13);
               ((String[]) buf[12])[0] = rslt.getString(11, 26);
               ((short[]) buf[13])[0] = rslt.getShort(12);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(13,2);
               ((int[]) buf[15])[0] = rslt.getInt(14);
               ((String[]) buf[16])[0] = rslt.getString(15, 8);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(16,2);
               ((int[]) buf[18])[0] = rslt.getInt(17);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 28);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               return;
            case 9 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 34);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((String[]) buf[7])[0] = rslt.getString(8, 20);
               ((String[]) buf[8])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 34);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 11 :
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
               stmt.setString(3, (String)parms[2], 3);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 8 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 11 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
      }
   }

}

