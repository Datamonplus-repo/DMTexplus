package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class rdevgebg extends GXReport
{
   public rdevgebg( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rdevgebg.class ), "" );
   }

   public rdevgebg( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      rdevgebg.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      rdevgebg.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      rdevgebg.this.A1453DevGenHil = aP1[0];
      this.aP1 = aP1;
      rdevgebg.this.AV15ImpCod = aP2[0];
      this.aP2 = aP2;
      rdevgebg.this.AV25Puerto = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      M_top = 0 ;
      M_bot = 6 ;
      P_lines = (int)(66-M_bot) ;
      getPrinter().GxClearAttris() ;
      lineHeight = 15 ;
      PrtOffset = 0 ;
      gxXPage = 100 ;
      gxYPage = 100 ;
      try
      {
         Gx_out = "SCR" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "REPGRAF", "", 2, 1, 256, 17280, 12960, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("DEVOLUCION GRAFICO") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*6)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXt_int1 = AV36Clisend ;
         GXv_int2[0] = GXt_int1 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CLISED", ""), GXv_int2) ;
         rdevgebg.this.GXt_int1 = GXv_int2[0] ;
         AV36Clisend = GXt_int1 ;
         /* Using cursor P07N52 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P07N52_A407EmprNom[0] ;
            n407EmprNom = P07N52_n407EmprNom[0] ;
            A404EmprDir = P07N52_A404EmprDir[0] ;
            n404EmprDir = P07N52_n404EmprDir[0] ;
            A409EmprTel = P07N52_A409EmprTel[0] ;
            n409EmprTel = P07N52_n409EmprTel[0] ;
            A405EmprFax = P07N52_A405EmprFax[0] ;
            n405EmprFax = P07N52_n405EmprFax[0] ;
            A403EmprCpo = P07N52_A403EmprCpo[0] ;
            n403EmprCpo = P07N52_n403EmprCpo[0] ;
            A408EmprPob = P07N52_A408EmprPob[0] ;
            n408EmprPob = P07N52_n408EmprPob[0] ;
            AV16NomEmp = GXutil.substring( A407EmprNom, 1, 22) ;
            AV17DomEmp = A404EmprDir ;
            AV18TelEmp = A409EmprTel ;
            AV19FaxEmp = A405EmprFax ;
            AV20CpEmp = A403EmprCpo ;
            AV21PobEmp = A408EmprPob ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         /* Using cursor P07N53 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A1453DevGenHil)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A781PrvCod = P07N53_A781PrvCod[0] ;
            A256CliCp = P07N53_A256CliCp[0] ;
            A260CliDom = P07N53_A260CliDom[0] ;
            A279CliNom = P07N53_A279CliNom[0] ;
            A295CliPob = P07N53_A295CliPob[0] ;
            A787PrvDsc = P07N53_A787PrvDsc[0] ;
            n787PrvDsc = P07N53_n787PrvDsc[0] ;
            A10964DevDomEv = P07N53_A10964DevDomEv[0] ;
            n10964DevDomEv = P07N53_n10964DevDomEv[0] ;
            A3634DevDomEnv = P07N53_A3634DevDomEnv[0] ;
            n3634DevDomEnv = P07N53_n3634DevDomEnv[0] ;
            A252CliCod = P07N53_A252CliCod[0] ;
            n252CliCod = P07N53_n252CliCod[0] ;
            A1452DevGenHFec = P07N53_A1452DevGenHFec[0] ;
            n1452DevGenHFec = P07N53_n1452DevGenHFec[0] ;
            A1456ParArtCod = P07N53_A1456ParArtCod[0] ;
            n1456ParArtCod = P07N53_n1456ParArtCod[0] ;
            A1457ParNMtr = P07N53_A1457ParNMtr[0] ;
            n1457ParNMtr = P07N53_n1457ParNMtr[0] ;
            A966PartCod = P07N53_A966PartCod[0] ;
            n966PartCod = P07N53_n966PartCod[0] ;
            A1454DevGenHPie = P07N53_A1454DevGenHPie[0] ;
            n1454DevGenHPie = P07N53_n1454DevGenHPie[0] ;
            A1455DevGenHUni = P07N53_A1455DevGenHUni[0] ;
            n1455DevGenHUni = P07N53_n1455DevGenHUni[0] ;
            A781PrvCod = P07N53_A781PrvCod[0] ;
            A256CliCp = P07N53_A256CliCp[0] ;
            A260CliDom = P07N53_A260CliDom[0] ;
            A279CliNom = P07N53_A279CliNom[0] ;
            A295CliPob = P07N53_A295CliPob[0] ;
            A787PrvDsc = P07N53_A787PrvDsc[0] ;
            n787PrvDsc = P07N53_n787PrvDsc[0] ;
            A1456ParArtCod = P07N53_A1456ParArtCod[0] ;
            n1456ParArtCod = P07N53_n1456ParArtCod[0] ;
            A1457ParNMtr = P07N53_A1457ParNMtr[0] ;
            n1457ParNMtr = P07N53_n1457ParNMtr[0] ;
            AV31CliCp = A256CliCp ;
            AV29CliDom = A260CliDom ;
            AV28CliNom = A279CliNom ;
            AV30CliPob = A295CliPob ;
            AV32PrvDsc = A787PrvDsc ;
            if ( ! (0==A3634DevDomEnv) || ! (0==A10964DevDomEv) )
            {
               AV23CliCod = A252CliCod ;
               AV27DevDomEnv = A3634DevDomEnv ;
               AV35DevDomEv = A10964DevDomEv ;
               /* Execute user subroutine: 'ENVIO' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(1);
                  pr_default.close(1);
                  pr_default.close(1);
                  pr_default.close(1);
                  getPrinter().GxEndPage() ;
                  /* Close printer file */
                  getPrinter().GxEndDocument() ;
                  endPrinter();
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
            }
            h7N50( false, 200) ;
            getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV16NomEmp, "")), 7, Gx_line+0, 237, Gx_line+20, 1+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "TELEFONS", ""), 7, Gx_line+33, 69, Gx_line+49, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17DomEmp, "")), 7, Gx_line+17, 263, Gx_line+33, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "FAX.", ""), 7, Gx_line+50, 33, Gx_line+66, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18TelEmp, "")), 73, Gx_line+33, 183, Gx_line+49, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19FaxEmp, "")), 73, Gx_line+50, 183, Gx_line+66, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20CpEmp, "")), 7, Gx_line+67, 59, Gx_line+83, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21PobEmp, "")), 66, Gx_line+67, 322, Gx_line+83, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1453DevGenHil), "ZZZZZZZ9")), 109, Gx_line+133, 168, Gx_line+150, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( A1452DevGenHFec, "99/99/99"), 109, Gx_line+150, 168, Gx_line+167, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 124, Gx_line+167, 169, Gx_line+184, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28CliNom, "")), 372, Gx_line+133, 592, Gx_line+150, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29CliDom, "")), 372, Gx_line+150, 621, Gx_line+167, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31CliCp, "")), 372, Gx_line+167, 417, Gx_line+184, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30CliPob, "")), 423, Gx_line+167, 643, Gx_line+184, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32PrvDsc, "@!")), 372, Gx_line+183, 592, Gx_line+200, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(":", 88, Gx_line+133, 96, Gx_line+150, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(":", 88, Gx_line+167, 96, Gx_line+184, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(":", 88, Gx_line+150, 96, Gx_line+167, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "NOTA DEVOLUCIO", ""), 430, Gx_line+17, 580, Gx_line+37, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "N.Albara", ""), 15, Gx_line+133, 66, Gx_line+149, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Data", ""), 15, Gx_line+150, 43, Gx_line+166, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Client", ""), 15, Gx_line+167, 49, Gx_line+183, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+200) ;
            AV23CliCod = A252CliCod ;
            AV24ArtCod = A1456ParArtCod ;
            h7N50( false, 117) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1456ParArtCod, "")), 15, Gx_line+33, 133, Gx_line+50, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A966PartCod, "")), 299, Gx_line+33, 417, Gx_line+50, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1457ParNMtr, "")), 160, Gx_line+33, 234, Gx_line+50, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "ARTICLE", ""), 15, Gx_line+0, 66, Gx_line+16, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "LOT", ""), 160, Gx_line+0, 185, Gx_line+16, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "OBSERVACIONS", ""), 7, Gx_line+67, 103, Gx_line+83, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Devolucio de genere", ""), 7, Gx_line+100, 147, Gx_line+117, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(15, Gx_line+24, 614, Gx_line+24, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(7, Gx_line+83, 606, Gx_line+83, 2, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+117) ;
            AV26ContLin = (byte)(1) ;
            /* Using cursor P07N54 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A1453DevGenHil)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A3330DevObsH = P07N54_A3330DevObsH[0] ;
               n3330DevObsH = P07N54_n3330DevObsH[0] ;
               A3329DevLinH = P07N54_A3329DevLinH[0] ;
               if ( AV26ContLin == 5 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
               h7N50( false, 17) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A3330DevObsH, "")), 160, Gx_line+0, 599, Gx_line+17, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               AV26ContLin = (byte)(AV26ContLin+1) ;
               pr_default.readNext(2);
            }
            pr_default.close(2);
            while ( AV26ContLin <= 5 )
            {
               h7N50( false, 17) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               AV26ContLin = (byte)(AV26ContLin+1) ;
            }
            h7N50( false, 50) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A1455DevGenHUni, "ZZZZZ9.99")), 423, Gx_line+33, 490, Gx_line+50, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1454DevGenHPie), "ZZZ9")), 513, Gx_line+33, 543, Gx_line+50, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "RETORNATS        QUILOS    CONOS", ""), 343, Gx_line+0, 543, Gx_line+16, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(7, Gx_line+17, 606, Gx_line+17, 2, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+50) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h7N50( true, 0) ;
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
      if ( AV36Clisend == 0 )
      {
         /* Using cursor P07N55 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV23CliCod), Byte.valueOf(AV27DevDomEnv)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A266CliEnvLin = P07N55_A266CliEnvLin[0] ;
            A252CliCod = P07N55_A252CliCod[0] ;
            n252CliCod = P07N55_n252CliCod[0] ;
            A264CliEnvCp = P07N55_A264CliEnvCp[0] ;
            A265CliEnvDom = P07N55_A265CliEnvDom[0] ;
            A267CliEnvNom = P07N55_A267CliEnvNom[0] ;
            A268CliEnvPob = P07N55_A268CliEnvPob[0] ;
            A270CliEnvPrv = P07N55_A270CliEnvPrv[0] ;
            AV43Clienv = (byte)(1) ;
            AV31CliCp = A264CliEnvCp ;
            AV29CliDom = A265CliEnvDom ;
            AV28CliNom = A267CliEnvNom ;
            AV30CliPob = A268CliEnvPob ;
            AV33CliEnvPrv = A270CliEnvPrv ;
            /* Execute user subroutine: 'PROVIN' */
            S125 ();
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
      else
      {
         /* Using cursor P07N56 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV23CliCod), Short.valueOf(AV35DevDomEv)});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A10062CliEvLin = P07N56_A10062CliEvLin[0] ;
            A252CliCod = P07N56_A252CliCod[0] ;
            n252CliCod = P07N56_n252CliCod[0] ;
            A10066CliEvCp = P07N56_A10066CliEvCp[0] ;
            n10066CliEvCp = P07N56_n10066CliEvCp[0] ;
            A10064CliEvDom = P07N56_A10064CliEvDom[0] ;
            n10064CliEvDom = P07N56_n10064CliEvDom[0] ;
            A10063CliEvNom = P07N56_A10063CliEvNom[0] ;
            n10063CliEvNom = P07N56_n10063CliEvNom[0] ;
            A10065CliEvPob = P07N56_A10065CliEvPob[0] ;
            n10065CliEvPob = P07N56_n10065CliEvPob[0] ;
            A10067CliEvPrv = P07N56_A10067CliEvPrv[0] ;
            n10067CliEvPrv = P07N56_n10067CliEvPrv[0] ;
            AV43Clienv = (byte)(1) ;
            AV31CliCp = A10066CliEvCp ;
            AV29CliDom = A10064CliEvDom ;
            AV28CliNom = A10063CliEvNom ;
            AV30CliPob = A10065CliEvPob ;
            AV33CliEnvPrv = A10067CliEvPrv ;
            /* Execute user subroutine: 'PROVIN' */
            S125 ();
            if ( returnInSub )
            {
               pr_default.close(4);
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
         pr_default.close(4);
      }
   }

   public void S125( ) throws ProcessInterruptedException
   {
      /* 'PROVIN' Routine */
      returnInSub = false ;
      /* Using cursor P07N57 */
      pr_default.execute(5, new Object[] {Short.valueOf(AV33CliEnvPrv)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A781PrvCod = P07N57_A781PrvCod[0] ;
         A787PrvDsc = P07N57_A787PrvDsc[0] ;
         n787PrvDsc = P07N57_n787PrvDsc[0] ;
         AV32PrvDsc = A787PrvDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(5);
   }

   public void h7N50( boolean bFoot ,
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
      this.aP0[0] = rdevgebg.this.A396EmprCod;
      this.aP1[0] = rdevgebg.this.A1453DevGenHil;
      this.aP2[0] = rdevgebg.this.AV15ImpCod;
      this.aP3[0] = rdevgebg.this.AV25Puerto;
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
      P07N52_A396EmprCod = new String[] {""} ;
      P07N52_A407EmprNom = new String[] {""} ;
      P07N52_n407EmprNom = new boolean[] {false} ;
      P07N52_A404EmprDir = new String[] {""} ;
      P07N52_n404EmprDir = new boolean[] {false} ;
      P07N52_A409EmprTel = new String[] {""} ;
      P07N52_n409EmprTel = new boolean[] {false} ;
      P07N52_A405EmprFax = new String[] {""} ;
      P07N52_n405EmprFax = new boolean[] {false} ;
      P07N52_A403EmprCpo = new String[] {""} ;
      P07N52_n403EmprCpo = new boolean[] {false} ;
      P07N52_A408EmprPob = new String[] {""} ;
      P07N52_n408EmprPob = new boolean[] {false} ;
      A407EmprNom = "" ;
      A404EmprDir = "" ;
      A409EmprTel = "" ;
      A405EmprFax = "" ;
      A403EmprCpo = "" ;
      A408EmprPob = "" ;
      AV16NomEmp = "" ;
      AV17DomEmp = "" ;
      AV18TelEmp = "" ;
      AV19FaxEmp = "" ;
      AV20CpEmp = "" ;
      AV21PobEmp = "" ;
      P07N53_A781PrvCod = new short[1] ;
      P07N53_A396EmprCod = new String[] {""} ;
      P07N53_A1453DevGenHil = new int[1] ;
      P07N53_A256CliCp = new String[] {""} ;
      P07N53_A260CliDom = new String[] {""} ;
      P07N53_A279CliNom = new String[] {""} ;
      P07N53_A295CliPob = new String[] {""} ;
      P07N53_A787PrvDsc = new String[] {""} ;
      P07N53_n787PrvDsc = new boolean[] {false} ;
      P07N53_A10964DevDomEv = new short[1] ;
      P07N53_n10964DevDomEv = new boolean[] {false} ;
      P07N53_A3634DevDomEnv = new byte[1] ;
      P07N53_n3634DevDomEnv = new boolean[] {false} ;
      P07N53_A252CliCod = new int[1] ;
      P07N53_n252CliCod = new boolean[] {false} ;
      P07N53_A1452DevGenHFec = new java.util.Date[] {GXutil.nullDate()} ;
      P07N53_n1452DevGenHFec = new boolean[] {false} ;
      P07N53_A1456ParArtCod = new String[] {""} ;
      P07N53_n1456ParArtCod = new boolean[] {false} ;
      P07N53_A1457ParNMtr = new String[] {""} ;
      P07N53_n1457ParNMtr = new boolean[] {false} ;
      P07N53_A966PartCod = new String[] {""} ;
      P07N53_n966PartCod = new boolean[] {false} ;
      P07N53_A1454DevGenHPie = new short[1] ;
      P07N53_n1454DevGenHPie = new boolean[] {false} ;
      P07N53_A1455DevGenHUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07N53_n1455DevGenHUni = new boolean[] {false} ;
      A256CliCp = "" ;
      A260CliDom = "" ;
      A279CliNom = "" ;
      A295CliPob = "" ;
      A787PrvDsc = "" ;
      A1452DevGenHFec = GXutil.nullDate() ;
      A1456ParArtCod = "" ;
      A1457ParNMtr = "" ;
      A966PartCod = "" ;
      A1455DevGenHUni = DecimalUtil.ZERO ;
      AV31CliCp = "" ;
      AV29CliDom = "" ;
      AV28CliNom = "" ;
      AV30CliPob = "" ;
      AV32PrvDsc = "" ;
      AV24ArtCod = "" ;
      P07N54_A396EmprCod = new String[] {""} ;
      P07N54_A1453DevGenHil = new int[1] ;
      P07N54_A3330DevObsH = new String[] {""} ;
      P07N54_n3330DevObsH = new boolean[] {false} ;
      P07N54_A3329DevLinH = new byte[1] ;
      A3330DevObsH = "" ;
      P07N55_A396EmprCod = new String[] {""} ;
      P07N55_A266CliEnvLin = new byte[1] ;
      P07N55_A252CliCod = new int[1] ;
      P07N55_n252CliCod = new boolean[] {false} ;
      P07N55_A264CliEnvCp = new String[] {""} ;
      P07N55_A265CliEnvDom = new String[] {""} ;
      P07N55_A267CliEnvNom = new String[] {""} ;
      P07N55_A268CliEnvPob = new String[] {""} ;
      P07N55_A270CliEnvPrv = new short[1] ;
      A264CliEnvCp = "" ;
      A265CliEnvDom = "" ;
      A267CliEnvNom = "" ;
      A268CliEnvPob = "" ;
      P07N56_A396EmprCod = new String[] {""} ;
      P07N56_A10062CliEvLin = new short[1] ;
      P07N56_A252CliCod = new int[1] ;
      P07N56_n252CliCod = new boolean[] {false} ;
      P07N56_A10066CliEvCp = new String[] {""} ;
      P07N56_n10066CliEvCp = new boolean[] {false} ;
      P07N56_A10064CliEvDom = new String[] {""} ;
      P07N56_n10064CliEvDom = new boolean[] {false} ;
      P07N56_A10063CliEvNom = new String[] {""} ;
      P07N56_n10063CliEvNom = new boolean[] {false} ;
      P07N56_A10065CliEvPob = new String[] {""} ;
      P07N56_n10065CliEvPob = new boolean[] {false} ;
      P07N56_A10067CliEvPrv = new short[1] ;
      P07N56_n10067CliEvPrv = new boolean[] {false} ;
      A10066CliEvCp = "" ;
      A10064CliEvDom = "" ;
      A10063CliEvNom = "" ;
      A10065CliEvPob = "" ;
      P07N57_A781PrvCod = new short[1] ;
      P07N57_A787PrvDsc = new String[] {""} ;
      P07N57_n787PrvDsc = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rdevgebg__default(),
         new Object[] {
             new Object[] {
            P07N52_A396EmprCod, P07N52_A407EmprNom, P07N52_n407EmprNom, P07N52_A404EmprDir, P07N52_n404EmprDir, P07N52_A409EmprTel, P07N52_n409EmprTel, P07N52_A405EmprFax, P07N52_n405EmprFax, P07N52_A403EmprCpo,
            P07N52_n403EmprCpo, P07N52_A408EmprPob, P07N52_n408EmprPob
            }
            , new Object[] {
            P07N53_A781PrvCod, P07N53_A396EmprCod, P07N53_A1453DevGenHil, P07N53_A256CliCp, P07N53_A260CliDom, P07N53_A279CliNom, P07N53_A295CliPob, P07N53_A787PrvDsc, P07N53_n787PrvDsc, P07N53_A10964DevDomEv,
            P07N53_n10964DevDomEv, P07N53_A3634DevDomEnv, P07N53_n3634DevDomEnv, P07N53_A252CliCod, P07N53_n252CliCod, P07N53_A1452DevGenHFec, P07N53_n1452DevGenHFec, P07N53_A1456ParArtCod, P07N53_n1456ParArtCod, P07N53_A1457ParNMtr,
            P07N53_n1457ParNMtr, P07N53_A966PartCod, P07N53_n966PartCod, P07N53_A1454DevGenHPie, P07N53_n1454DevGenHPie, P07N53_A1455DevGenHUni, P07N53_n1455DevGenHUni
            }
            , new Object[] {
            P07N54_A396EmprCod, P07N54_A1453DevGenHil, P07N54_A3330DevObsH, P07N54_n3330DevObsH, P07N54_A3329DevLinH
            }
            , new Object[] {
            P07N55_A396EmprCod, P07N55_A266CliEnvLin, P07N55_A252CliCod, P07N55_A264CliEnvCp, P07N55_A265CliEnvDom, P07N55_A267CliEnvNom, P07N55_A268CliEnvPob, P07N55_A270CliEnvPrv
            }
            , new Object[] {
            P07N56_A396EmprCod, P07N56_A10062CliEvLin, P07N56_A252CliCod, P07N56_A10066CliEvCp, P07N56_n10066CliEvCp, P07N56_A10064CliEvDom, P07N56_n10064CliEvDom, P07N56_A10063CliEvNom, P07N56_n10063CliEvNom, P07N56_A10065CliEvPob,
            P07N56_n10065CliEvPob, P07N56_A10067CliEvPrv, P07N56_n10067CliEvPrv
            }
            , new Object[] {
            P07N57_A781PrvCod, P07N57_A787PrvDsc, P07N57_n787PrvDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte AV36Clisend ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte A3634DevDomEnv ;
   private byte AV27DevDomEnv ;
   private byte AV26ContLin ;
   private byte A3329DevLinH ;
   private byte A266CliEnvLin ;
   private byte AV43Clienv ;
   private short A781PrvCod ;
   private short A10964DevDomEv ;
   private short A1454DevGenHPie ;
   private short AV35DevDomEv ;
   private short A270CliEnvPrv ;
   private short AV33CliEnvPrv ;
   private short A10062CliEvLin ;
   private short A10067CliEvPrv ;
   private short Gx_err ;
   private int A1453DevGenHil ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A252CliCod ;
   private int AV23CliCod ;
   private int Gx_OldLine ;
   private java.math.BigDecimal A1455DevGenHUni ;
   private String A396EmprCod ;
   private String AV15ImpCod ;
   private String AV25Puerto ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String A404EmprDir ;
   private String A409EmprTel ;
   private String A405EmprFax ;
   private String A403EmprCpo ;
   private String A408EmprPob ;
   private String AV16NomEmp ;
   private String AV17DomEmp ;
   private String AV18TelEmp ;
   private String AV19FaxEmp ;
   private String AV20CpEmp ;
   private String AV21PobEmp ;
   private String A256CliCp ;
   private String A260CliDom ;
   private String A279CliNom ;
   private String A295CliPob ;
   private String A787PrvDsc ;
   private String A1456ParArtCod ;
   private String A1457ParNMtr ;
   private String A966PartCod ;
   private String AV31CliCp ;
   private String AV29CliDom ;
   private String AV28CliNom ;
   private String AV30CliPob ;
   private String AV32PrvDsc ;
   private String AV24ArtCod ;
   private String A3330DevObsH ;
   private String A264CliEnvCp ;
   private String A265CliEnvDom ;
   private String A267CliEnvNom ;
   private String A268CliEnvPob ;
   private String A10066CliEvCp ;
   private String A10064CliEvDom ;
   private String A10063CliEvNom ;
   private String A10065CliEvPob ;
   private java.util.Date A1452DevGenHFec ;
   private boolean n407EmprNom ;
   private boolean n404EmprDir ;
   private boolean n409EmprTel ;
   private boolean n405EmprFax ;
   private boolean n403EmprCpo ;
   private boolean n408EmprPob ;
   private boolean n787PrvDsc ;
   private boolean n10964DevDomEv ;
   private boolean n3634DevDomEnv ;
   private boolean n252CliCod ;
   private boolean n1452DevGenHFec ;
   private boolean n1456ParArtCod ;
   private boolean n1457ParNMtr ;
   private boolean n966PartCod ;
   private boolean n1454DevGenHPie ;
   private boolean n1455DevGenHUni ;
   private boolean returnInSub ;
   private boolean n3330DevObsH ;
   private boolean n10066CliEvCp ;
   private boolean n10064CliEvDom ;
   private boolean n10063CliEvNom ;
   private boolean n10065CliEvPob ;
   private boolean n10067CliEvPrv ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P07N52_A396EmprCod ;
   private String[] P07N52_A407EmprNom ;
   private boolean[] P07N52_n407EmprNom ;
   private String[] P07N52_A404EmprDir ;
   private boolean[] P07N52_n404EmprDir ;
   private String[] P07N52_A409EmprTel ;
   private boolean[] P07N52_n409EmprTel ;
   private String[] P07N52_A405EmprFax ;
   private boolean[] P07N52_n405EmprFax ;
   private String[] P07N52_A403EmprCpo ;
   private boolean[] P07N52_n403EmprCpo ;
   private String[] P07N52_A408EmprPob ;
   private boolean[] P07N52_n408EmprPob ;
   private short[] P07N53_A781PrvCod ;
   private String[] P07N53_A396EmprCod ;
   private int[] P07N53_A1453DevGenHil ;
   private String[] P07N53_A256CliCp ;
   private String[] P07N53_A260CliDom ;
   private String[] P07N53_A279CliNom ;
   private String[] P07N53_A295CliPob ;
   private String[] P07N53_A787PrvDsc ;
   private boolean[] P07N53_n787PrvDsc ;
   private short[] P07N53_A10964DevDomEv ;
   private boolean[] P07N53_n10964DevDomEv ;
   private byte[] P07N53_A3634DevDomEnv ;
   private boolean[] P07N53_n3634DevDomEnv ;
   private int[] P07N53_A252CliCod ;
   private boolean[] P07N53_n252CliCod ;
   private java.util.Date[] P07N53_A1452DevGenHFec ;
   private boolean[] P07N53_n1452DevGenHFec ;
   private String[] P07N53_A1456ParArtCod ;
   private boolean[] P07N53_n1456ParArtCod ;
   private String[] P07N53_A1457ParNMtr ;
   private boolean[] P07N53_n1457ParNMtr ;
   private String[] P07N53_A966PartCod ;
   private boolean[] P07N53_n966PartCod ;
   private short[] P07N53_A1454DevGenHPie ;
   private boolean[] P07N53_n1454DevGenHPie ;
   private java.math.BigDecimal[] P07N53_A1455DevGenHUni ;
   private boolean[] P07N53_n1455DevGenHUni ;
   private String[] P07N54_A396EmprCod ;
   private int[] P07N54_A1453DevGenHil ;
   private String[] P07N54_A3330DevObsH ;
   private boolean[] P07N54_n3330DevObsH ;
   private byte[] P07N54_A3329DevLinH ;
   private String[] P07N55_A396EmprCod ;
   private byte[] P07N55_A266CliEnvLin ;
   private int[] P07N55_A252CliCod ;
   private boolean[] P07N55_n252CliCod ;
   private String[] P07N55_A264CliEnvCp ;
   private String[] P07N55_A265CliEnvDom ;
   private String[] P07N55_A267CliEnvNom ;
   private String[] P07N55_A268CliEnvPob ;
   private short[] P07N55_A270CliEnvPrv ;
   private String[] P07N56_A396EmprCod ;
   private short[] P07N56_A10062CliEvLin ;
   private int[] P07N56_A252CliCod ;
   private boolean[] P07N56_n252CliCod ;
   private String[] P07N56_A10066CliEvCp ;
   private boolean[] P07N56_n10066CliEvCp ;
   private String[] P07N56_A10064CliEvDom ;
   private boolean[] P07N56_n10064CliEvDom ;
   private String[] P07N56_A10063CliEvNom ;
   private boolean[] P07N56_n10063CliEvNom ;
   private String[] P07N56_A10065CliEvPob ;
   private boolean[] P07N56_n10065CliEvPob ;
   private short[] P07N56_A10067CliEvPrv ;
   private boolean[] P07N56_n10067CliEvPrv ;
   private short[] P07N57_A781PrvCod ;
   private String[] P07N57_A787PrvDsc ;
   private boolean[] P07N57_n787PrvDsc ;
}

final  class rdevgebg__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07N52", "SELECT EmprCod, EmprNom, EmprDir, EmprTel, EmprFax, EmprCpo, EmprPob FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07N53", "SELECT T2.PrvCod, T1.EmprCod, T1.DevGenHil, T2.CliCp, T2.CliDom, T2.CliNom, T2.CliPob, T3.PrvDsc, T1.DevDomEv, T1.DevDomEnv, T1.CliCod, T1.DevGenHFec, T4.ParArtCod, T4.ParNMtr, T1.PartCod, T1.DevGenHPie, T1.DevGenHUni FROM (((TXPDEVGEH T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN TXPPROVIN T3 ON T3.PrvCod = T2.PrvCod) LEFT JOIN TXPCPARTI T4 ON T4.EmprCod = T1.EmprCod AND T4.PartCod = T1.PartCod AND T4.CliCod = T1.CliCod) WHERE T1.EmprCod = ? and T1.DevGenHil = ? ORDER BY T1.EmprCod, T1.DevGenHil ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07N54", "SELECT EmprCod, DevGenHil, DevObsH, DevLinH FROM TXPDEVOBH WHERE EmprCod = ? and DevGenHil = ? ORDER BY EmprCod, DevGenHil, DevLinH ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07N55", "SELECT EmprCod, CliEnvLin, CliCod, CliEnvCp, CliEnvDom, CliEnvNom, CliEnvPob, CliEnvPrv FROM TXPCLIENV WHERE EmprCod = ? and CliCod = ? and CliEnvLin = ? ORDER BY EmprCod, CliCod, CliEnvLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07N56", "SELECT EmprCod, CliEvLin, CliCod, CliEvCp, CliEvDom, CliEvNom, CliEvPob, CliEvPrv FROM TXPCLISEN WHERE EmprCod = ? and CliCod = ? and CliEvLin = ? ORDER BY EmprCod, CliCod, CliEvLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07N57", "SELECT PrvCod, PrvDsc FROM TXPPROVIN WHERE PrvCod = ? ORDER BY PrvCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 35);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 15);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 15);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 35);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((String[]) buf[4])[0] = rslt.getString(5, 34);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(11);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(12);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(13, 16);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(14, 10);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(15, 16);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((short[]) buf[23])[0] = rslt.getShort(16);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(17,2);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((String[]) buf[4])[0] = rslt.getString(5, 34);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 80);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 80);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 80);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               return;
            case 5 :
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 5 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
      }
   }

}

