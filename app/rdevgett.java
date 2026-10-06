package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class rdevgett extends GXReport
{
   public rdevgett( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rdevgett.class ), "" );
   }

   public rdevgett( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      rdevgett.this.aP3 = new String[] {""};
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
      rdevgett.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      rdevgett.this.A1453DevGenHil = aP1[0];
      this.aP1 = aP1;
      rdevgett.this.AV15ImpCod = aP2[0];
      this.aP2 = aP2;
      rdevgett.this.AV38Puerto = aP3[0];
      this.aP3 = aP3;
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
         Gx_out = "SCR" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "REPGRAF", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("DEVOLUCION PARTIDOS") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*0)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXt_char1 = AV17Lit0 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2322_", ""), (byte)(99), GXv_char2) ;
         rdevgett.this.GXt_char1 = GXv_char2[0] ;
         AV17Lit0 = GXt_char1 ;
         GXt_char1 = AV18Lit1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2301_", ""), (byte)(99), GXv_char2) ;
         rdevgett.this.GXt_char1 = GXv_char2[0] ;
         AV18Lit1 = GXt_char1 ;
         GXt_char1 = AV19Lit2 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         rdevgett.this.GXt_char1 = GXv_char2[0] ;
         AV19Lit2 = GXt_char1 ;
         GXt_char1 = AV20Lit3 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN073_", ""), (byte)(99), GXv_char2) ;
         rdevgett.this.GXt_char1 = GXv_char2[0] ;
         AV20Lit3 = GXt_char1 ;
         GXt_char1 = AV21Lit4 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN074_", ""), (byte)(99), GXv_char2) ;
         rdevgett.this.GXt_char1 = GXv_char2[0] ;
         AV21Lit4 = GXt_char1 ;
         GXt_char1 = AV22Lit5 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1301_", ""), (byte)(99), GXv_char2) ;
         rdevgett.this.GXt_char1 = GXv_char2[0] ;
         AV22Lit5 = GXt_char1 ;
         GXt_char1 = AV23Lit6 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2103_", ""), (byte)(99), GXv_char2) ;
         rdevgett.this.GXt_char1 = GXv_char2[0] ;
         AV23Lit6 = GXt_char1 ;
         GXt_char1 = AV24Lit7 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1288_", ""), (byte)(99), GXv_char2) ;
         rdevgett.this.GXt_char1 = GXv_char2[0] ;
         AV24Lit7 = GXt_char1 ;
         GXt_char1 = AV25Lit8 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2102_", ""), (byte)(99), GXv_char2) ;
         rdevgett.this.GXt_char1 = GXv_char2[0] ;
         AV25Lit8 = GXt_char1 ;
         GXt_char1 = AV26Lit9 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN145_", ""), (byte)(99), GXv_char2) ;
         rdevgett.this.GXt_char1 = GXv_char2[0] ;
         AV26Lit9 = GXt_char1 ;
         GXt_char1 = AV27Lit10 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2060_", ""), (byte)(99), GXv_char2) ;
         rdevgett.this.GXt_char1 = GXv_char2[0] ;
         AV27Lit10 = GXt_char1 ;
         GXt_char1 = AV28Lit11 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN440_", ""), (byte)(99), GXv_char2) ;
         rdevgett.this.GXt_char1 = GXv_char2[0] ;
         AV28Lit11 = GXt_char1 ;
         GXt_char1 = AV29Lit12 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WMSG269_", ""), (byte)(99), GXv_char2) ;
         rdevgett.this.GXt_char1 = GXv_char2[0] ;
         AV29Lit12 = GXt_char1 ;
         /* Using cursor P06WW2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P06WW2_A407EmprNom[0] ;
            n407EmprNom = P06WW2_n407EmprNom[0] ;
            A404EmprDir = P06WW2_A404EmprDir[0] ;
            n404EmprDir = P06WW2_n404EmprDir[0] ;
            A409EmprTel = P06WW2_A409EmprTel[0] ;
            n409EmprTel = P06WW2_n409EmprTel[0] ;
            A405EmprFax = P06WW2_A405EmprFax[0] ;
            n405EmprFax = P06WW2_n405EmprFax[0] ;
            A403EmprCpo = P06WW2_A403EmprCpo[0] ;
            n403EmprCpo = P06WW2_n403EmprCpo[0] ;
            A408EmprPob = P06WW2_A408EmprPob[0] ;
            n408EmprPob = P06WW2_n408EmprPob[0] ;
            AV16NomEmp = A407EmprNom ;
            AV30DomEmp = A404EmprDir ;
            AV31TelEmp = A409EmprTel ;
            AV32FaxEmp = A405EmprFax ;
            AV33CpEmp = A403EmprCpo ;
            AV34PobEmp = A408EmprPob ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         /* Using cursor P06WW3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A1453DevGenHil)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A781PrvCod = P06WW3_A781PrvCod[0] ;
            A787PrvDsc = P06WW3_A787PrvDsc[0] ;
            n787PrvDsc = P06WW3_n787PrvDsc[0] ;
            A295CliPob = P06WW3_A295CliPob[0] ;
            A256CliCp = P06WW3_A256CliCp[0] ;
            A260CliDom = P06WW3_A260CliDom[0] ;
            A279CliNom = P06WW3_A279CliNom[0] ;
            A252CliCod = P06WW3_A252CliCod[0] ;
            n252CliCod = P06WW3_n252CliCod[0] ;
            A1452DevGenHFec = P06WW3_A1452DevGenHFec[0] ;
            n1452DevGenHFec = P06WW3_n1452DevGenHFec[0] ;
            A1456ParArtCod = P06WW3_A1456ParArtCod[0] ;
            n1456ParArtCod = P06WW3_n1456ParArtCod[0] ;
            A1454DevGenHPie = P06WW3_A1454DevGenHPie[0] ;
            n1454DevGenHPie = P06WW3_n1454DevGenHPie[0] ;
            A1455DevGenHUni = P06WW3_A1455DevGenHUni[0] ;
            n1455DevGenHUni = P06WW3_n1455DevGenHUni[0] ;
            A1457ParNMtr = P06WW3_A1457ParNMtr[0] ;
            n1457ParNMtr = P06WW3_n1457ParNMtr[0] ;
            A966PartCod = P06WW3_A966PartCod[0] ;
            n966PartCod = P06WW3_n966PartCod[0] ;
            A781PrvCod = P06WW3_A781PrvCod[0] ;
            A295CliPob = P06WW3_A295CliPob[0] ;
            A256CliCp = P06WW3_A256CliCp[0] ;
            A260CliDom = P06WW3_A260CliDom[0] ;
            A279CliNom = P06WW3_A279CliNom[0] ;
            A787PrvDsc = P06WW3_A787PrvDsc[0] ;
            n787PrvDsc = P06WW3_n787PrvDsc[0] ;
            A1456ParArtCod = P06WW3_A1456ParArtCod[0] ;
            n1456ParArtCod = P06WW3_n1456ParArtCod[0] ;
            A1457ParNMtr = P06WW3_A1457ParNMtr[0] ;
            n1457ParNMtr = P06WW3_n1457ParNMtr[0] ;
            h6WW0( false, 167) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1453DevGenHil), "ZZZZZZZ9")), 139, Gx_line+100, 198, Gx_line+117, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( A1452DevGenHFec, "99/99/99"), 139, Gx_line+117, 198, Gx_line+134, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 153, Gx_line+133, 198, Gx_line+150, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 292, Gx_line+100, 512, Gx_line+117, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A260CliDom, "")), 292, Gx_line+117, 541, Gx_line+134, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A256CliCp, "")), 292, Gx_line+133, 337, Gx_line+150, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A295CliPob, "")), 343, Gx_line+133, 563, Gx_line+150, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A787PrvDsc, "@!")), 292, Gx_line+150, 512, Gx_line+167, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42EmprNom, "")), 15, Gx_line+0, 235, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43EmprDir, "")), 15, Gx_line+17, 198, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44EmprPob, "")), 15, Gx_line+33, 271, Gx_line+50, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45eMPRCIF, "")), 66, Gx_line+67, 176, Gx_line+84, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "NIF :", ""), 15, Gx_line+67, 52, Gx_line+84, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "NOTA DE DEVOLUCIO", ""), 569, Gx_line+17, 694, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "N Albara", ""), 7, Gx_line+100, 66, Gx_line+117, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Data", ""), 7, Gx_line+117, 37, Gx_line+134, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Client", ""), 7, Gx_line+133, 52, Gx_line+150, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(":", 102, Gx_line+133, 110, Gx_line+150, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(":", 102, Gx_line+117, 110, Gx_line+134, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(":", 102, Gx_line+100, 110, Gx_line+117, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+167) ;
            AV36CliCod = A252CliCod ;
            AV37ArtCod = A1456ParArtCod ;
            /* Execute user subroutine: 'LEOARTICU' */
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
            AV40LinObs = (byte)(0) ;
            GX_I = 1 ;
            while ( GX_I <= 4 )
            {
               AV39ObsLin[GX_I-1] = "" ;
               GX_I = (int)(GX_I+1) ;
            }
            /* Using cursor P06WW4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A1453DevGenHil)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A3330DevObsH = P06WW4_A3330DevObsH[0] ;
               n3330DevObsH = P06WW4_n3330DevObsH[0] ;
               A3329DevLinH = P06WW4_A3329DevLinH[0] ;
               AV40LinObs = (byte)(AV40LinObs+1) ;
               AV39ObsLin[AV40LinObs-1] = A3330DevObsH ;
               if ( AV40LinObs == 4 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
               pr_default.readNext(2);
            }
            pr_default.close(2);
            h6WW0( false, 250) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Materia                           N.H.", ""), 263, Gx_line+0, 541, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText("-------------------------------------------------------------------------------", 7, Gx_line+17, 584, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1456ParArtCod, "")), 7, Gx_line+33, 125, Gx_line+50, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A966PartCod, "")), 131, Gx_line+33, 249, Gx_line+50, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35Mater, "")), 263, Gx_line+33, 505, Gx_line+50, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1457ParNMtr, "")), 510, Gx_line+33, 584, Gx_line+50, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("-------------------------------------------------------------------------------", 7, Gx_line+83, 584, Gx_line+100, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24Lit7, "")), 7, Gx_line+67, 103, Gx_line+84, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("-----", 430, Gx_line+167, 467, Gx_line+184, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25Lit8, "")), 131, Gx_line+67, 278, Gx_line+84, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("---", 547, Gx_line+167, 570, Gx_line+184, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Lit6, "")), 474, Gx_line+167, 541, Gx_line+184, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("-------------------------------------------------------------------------------", 7, Gx_line+200, 584, Gx_line+217, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26Lit9, "")), 430, Gx_line+183, 467, Gx_line+200, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27Lit10, "")), 532, Gx_line+183, 569, Gx_line+200, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A1455DevGenHUni, "ZZZZZ9.99")), 430, Gx_line+217, 497, Gx_line+234, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1454DevGenHPie), "ZZZ9")), 540, Gx_line+217, 570, Gx_line+234, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39ObsLin[1-1], "")), 7, Gx_line+100, 446, Gx_line+117, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39ObsLin[2-1], "")), 7, Gx_line+117, 446, Gx_line+134, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39ObsLin[3-1], "")), 7, Gx_line+133, 446, Gx_line+150, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39ObsLin[4-1], "")), 7, Gx_line+150, 446, Gx_line+167, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "ARTICLE", ""), 7, Gx_line+0, 59, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "LOT", ""), 131, Gx_line+0, 154, Gx_line+17, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+250) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6WW0( true, 0) ;
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
      /* 'LEOARTICU' Routine */
      returnInSub = false ;
      AV35Mater = "" ;
      /* Using cursor P06WW5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV36CliCod), AV37ArtCod});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A65ArtCod = P06WW5_A65ArtCod[0] ;
         A252CliCod = P06WW5_A252CliCod[0] ;
         n252CliCod = P06WW5_n252CliCod[0] ;
         A114ArtUrdP1 = P06WW5_A114ArtUrdP1[0] ;
         n114ArtUrdP1 = P06WW5_n114ArtUrdP1[0] ;
         A111ArtUrd1 = P06WW5_A111ArtUrd1[0] ;
         n111ArtUrd1 = P06WW5_n111ArtUrd1[0] ;
         A110ArtTraP3 = P06WW5_A110ArtTraP3[0] ;
         n110ArtTraP3 = P06WW5_n110ArtTraP3[0] ;
         A107ArtTra3 = P06WW5_A107ArtTra3[0] ;
         n107ArtTra3 = P06WW5_n107ArtTra3[0] ;
         A109ArtTraP2 = P06WW5_A109ArtTraP2[0] ;
         n109ArtTraP2 = P06WW5_n109ArtTraP2[0] ;
         A106ArtTra2 = P06WW5_A106ArtTra2[0] ;
         n106ArtTra2 = P06WW5_n106ArtTra2[0] ;
         A108ArtTraP1 = P06WW5_A108ArtTraP1[0] ;
         n108ArtTraP1 = P06WW5_n108ArtTraP1[0] ;
         A105ArtTra1 = P06WW5_A105ArtTra1[0] ;
         n105ArtTra1 = P06WW5_n105ArtTra1[0] ;
         AV35Mater = A105ArtTra1 + " " + GXutil.str( A108ArtTraP1, 3, 0) + " " + A106ArtTra2 + " " + GXutil.str( A109ArtTraP2, 3, 0) + " " + A107ArtTra3 + " " + GXutil.str( A110ArtTraP3, 3, 0) + " " + A111ArtUrd1 + " " + GXutil.str( A114ArtUrdP1, 3, 0) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
   }

   public void h6WW0( boolean bFoot ,
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
      this.aP0[0] = rdevgett.this.A396EmprCod;
      this.aP1[0] = rdevgett.this.A1453DevGenHil;
      this.aP2[0] = rdevgett.this.AV15ImpCod;
      this.aP3[0] = rdevgett.this.AV38Puerto;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV17Lit0 = "" ;
      AV18Lit1 = "" ;
      AV19Lit2 = "" ;
      AV20Lit3 = "" ;
      AV21Lit4 = "" ;
      AV22Lit5 = "" ;
      AV23Lit6 = "" ;
      AV24Lit7 = "" ;
      AV25Lit8 = "" ;
      AV26Lit9 = "" ;
      AV27Lit10 = "" ;
      AV28Lit11 = "" ;
      AV29Lit12 = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      scmdbuf = "" ;
      P06WW2_A396EmprCod = new String[] {""} ;
      P06WW2_A407EmprNom = new String[] {""} ;
      P06WW2_n407EmprNom = new boolean[] {false} ;
      P06WW2_A404EmprDir = new String[] {""} ;
      P06WW2_n404EmprDir = new boolean[] {false} ;
      P06WW2_A409EmprTel = new String[] {""} ;
      P06WW2_n409EmprTel = new boolean[] {false} ;
      P06WW2_A405EmprFax = new String[] {""} ;
      P06WW2_n405EmprFax = new boolean[] {false} ;
      P06WW2_A403EmprCpo = new String[] {""} ;
      P06WW2_n403EmprCpo = new boolean[] {false} ;
      P06WW2_A408EmprPob = new String[] {""} ;
      P06WW2_n408EmprPob = new boolean[] {false} ;
      A407EmprNom = "" ;
      A404EmprDir = "" ;
      A409EmprTel = "" ;
      A405EmprFax = "" ;
      A403EmprCpo = "" ;
      A408EmprPob = "" ;
      AV16NomEmp = "" ;
      AV30DomEmp = "" ;
      AV31TelEmp = "" ;
      AV32FaxEmp = "" ;
      AV33CpEmp = "" ;
      AV34PobEmp = "" ;
      P06WW3_A781PrvCod = new short[1] ;
      P06WW3_A396EmprCod = new String[] {""} ;
      P06WW3_A1453DevGenHil = new int[1] ;
      P06WW3_A787PrvDsc = new String[] {""} ;
      P06WW3_n787PrvDsc = new boolean[] {false} ;
      P06WW3_A295CliPob = new String[] {""} ;
      P06WW3_A256CliCp = new String[] {""} ;
      P06WW3_A260CliDom = new String[] {""} ;
      P06WW3_A279CliNom = new String[] {""} ;
      P06WW3_A252CliCod = new int[1] ;
      P06WW3_n252CliCod = new boolean[] {false} ;
      P06WW3_A1452DevGenHFec = new java.util.Date[] {GXutil.nullDate()} ;
      P06WW3_n1452DevGenHFec = new boolean[] {false} ;
      P06WW3_A1456ParArtCod = new String[] {""} ;
      P06WW3_n1456ParArtCod = new boolean[] {false} ;
      P06WW3_A1454DevGenHPie = new short[1] ;
      P06WW3_n1454DevGenHPie = new boolean[] {false} ;
      P06WW3_A1455DevGenHUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06WW3_n1455DevGenHUni = new boolean[] {false} ;
      P06WW3_A1457ParNMtr = new String[] {""} ;
      P06WW3_n1457ParNMtr = new boolean[] {false} ;
      P06WW3_A966PartCod = new String[] {""} ;
      P06WW3_n966PartCod = new boolean[] {false} ;
      A787PrvDsc = "" ;
      A295CliPob = "" ;
      A256CliCp = "" ;
      A260CliDom = "" ;
      A279CliNom = "" ;
      A1452DevGenHFec = GXutil.nullDate() ;
      A1456ParArtCod = "" ;
      A1455DevGenHUni = DecimalUtil.ZERO ;
      A1457ParNMtr = "" ;
      A966PartCod = "" ;
      AV42EmprNom = "" ;
      AV43EmprDir = "" ;
      AV44EmprPob = "" ;
      AV45eMPRCIF = "" ;
      AV37ArtCod = "" ;
      AV39ObsLin = new String[4] ;
      GX_I = 1 ;
      while ( GX_I <= 4 )
      {
         AV39ObsLin[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P06WW4_A396EmprCod = new String[] {""} ;
      P06WW4_A1453DevGenHil = new int[1] ;
      P06WW4_A3330DevObsH = new String[] {""} ;
      P06WW4_n3330DevObsH = new boolean[] {false} ;
      P06WW4_A3329DevLinH = new byte[1] ;
      A3330DevObsH = "" ;
      AV35Mater = "" ;
      P06WW5_A396EmprCod = new String[] {""} ;
      P06WW5_A65ArtCod = new String[] {""} ;
      P06WW5_A252CliCod = new int[1] ;
      P06WW5_n252CliCod = new boolean[] {false} ;
      P06WW5_A114ArtUrdP1 = new short[1] ;
      P06WW5_n114ArtUrdP1 = new boolean[] {false} ;
      P06WW5_A111ArtUrd1 = new String[] {""} ;
      P06WW5_n111ArtUrd1 = new boolean[] {false} ;
      P06WW5_A110ArtTraP3 = new short[1] ;
      P06WW5_n110ArtTraP3 = new boolean[] {false} ;
      P06WW5_A107ArtTra3 = new String[] {""} ;
      P06WW5_n107ArtTra3 = new boolean[] {false} ;
      P06WW5_A109ArtTraP2 = new short[1] ;
      P06WW5_n109ArtTraP2 = new boolean[] {false} ;
      P06WW5_A106ArtTra2 = new String[] {""} ;
      P06WW5_n106ArtTra2 = new boolean[] {false} ;
      P06WW5_A108ArtTraP1 = new short[1] ;
      P06WW5_n108ArtTraP1 = new boolean[] {false} ;
      P06WW5_A105ArtTra1 = new String[] {""} ;
      P06WW5_n105ArtTra1 = new boolean[] {false} ;
      A65ArtCod = "" ;
      A111ArtUrd1 = "" ;
      A107ArtTra3 = "" ;
      A106ArtTra2 = "" ;
      A105ArtTra1 = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rdevgett__default(),
         new Object[] {
             new Object[] {
            P06WW2_A396EmprCod, P06WW2_A407EmprNom, P06WW2_n407EmprNom, P06WW2_A404EmprDir, P06WW2_n404EmprDir, P06WW2_A409EmprTel, P06WW2_n409EmprTel, P06WW2_A405EmprFax, P06WW2_n405EmprFax, P06WW2_A403EmprCpo,
            P06WW2_n403EmprCpo, P06WW2_A408EmprPob, P06WW2_n408EmprPob
            }
            , new Object[] {
            P06WW3_A781PrvCod, P06WW3_A396EmprCod, P06WW3_A1453DevGenHil, P06WW3_A787PrvDsc, P06WW3_n787PrvDsc, P06WW3_A295CliPob, P06WW3_A256CliCp, P06WW3_A260CliDom, P06WW3_A279CliNom, P06WW3_A252CliCod,
            P06WW3_n252CliCod, P06WW3_A1452DevGenHFec, P06WW3_n1452DevGenHFec, P06WW3_A1456ParArtCod, P06WW3_n1456ParArtCod, P06WW3_A1454DevGenHPie, P06WW3_n1454DevGenHPie, P06WW3_A1455DevGenHUni, P06WW3_n1455DevGenHUni, P06WW3_A1457ParNMtr,
            P06WW3_n1457ParNMtr, P06WW3_A966PartCod, P06WW3_n966PartCod
            }
            , new Object[] {
            P06WW4_A396EmprCod, P06WW4_A1453DevGenHil, P06WW4_A3330DevObsH, P06WW4_n3330DevObsH, P06WW4_A3329DevLinH
            }
            , new Object[] {
            P06WW5_A396EmprCod, P06WW5_A65ArtCod, P06WW5_A252CliCod, P06WW5_A114ArtUrdP1, P06WW5_n114ArtUrdP1, P06WW5_A111ArtUrd1, P06WW5_n111ArtUrd1, P06WW5_A110ArtTraP3, P06WW5_n110ArtTraP3, P06WW5_A107ArtTra3,
            P06WW5_n107ArtTra3, P06WW5_A109ArtTraP2, P06WW5_n109ArtTraP2, P06WW5_A106ArtTra2, P06WW5_n106ArtTra2, P06WW5_A108ArtTraP1, P06WW5_n108ArtTraP1, P06WW5_A105ArtTra1, P06WW5_n105ArtTra1
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte AV40LinObs ;
   private byte A3329DevLinH ;
   private short A781PrvCod ;
   private short A1454DevGenHPie ;
   private short A114ArtUrdP1 ;
   private short A110ArtTraP3 ;
   private short A109ArtTraP2 ;
   private short A108ArtTraP1 ;
   private short Gx_err ;
   private int A1453DevGenHil ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A252CliCod ;
   private int Gx_OldLine ;
   private int AV36CliCod ;
   private int GX_I ;
   private java.math.BigDecimal A1455DevGenHUni ;
   private String A396EmprCod ;
   private String AV15ImpCod ;
   private String AV38Puerto ;
   private String AV17Lit0 ;
   private String AV18Lit1 ;
   private String AV19Lit2 ;
   private String AV20Lit3 ;
   private String AV21Lit4 ;
   private String AV22Lit5 ;
   private String AV23Lit6 ;
   private String AV24Lit7 ;
   private String AV25Lit8 ;
   private String AV26Lit9 ;
   private String AV27Lit10 ;
   private String AV28Lit11 ;
   private String AV29Lit12 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String A404EmprDir ;
   private String A409EmprTel ;
   private String A405EmprFax ;
   private String A403EmprCpo ;
   private String A408EmprPob ;
   private String AV16NomEmp ;
   private String AV30DomEmp ;
   private String AV31TelEmp ;
   private String AV32FaxEmp ;
   private String AV33CpEmp ;
   private String AV34PobEmp ;
   private String A787PrvDsc ;
   private String A295CliPob ;
   private String A256CliCp ;
   private String A260CliDom ;
   private String A279CliNom ;
   private String A1456ParArtCod ;
   private String A1457ParNMtr ;
   private String A966PartCod ;
   private String AV42EmprNom ;
   private String AV43EmprDir ;
   private String AV44EmprPob ;
   private String AV45eMPRCIF ;
   private String AV37ArtCod ;
   private String AV39ObsLin[] ;
   private String A3330DevObsH ;
   private String AV35Mater ;
   private String A65ArtCod ;
   private String A111ArtUrd1 ;
   private String A107ArtTra3 ;
   private String A106ArtTra2 ;
   private String A105ArtTra1 ;
   private java.util.Date A1452DevGenHFec ;
   private boolean n407EmprNom ;
   private boolean n404EmprDir ;
   private boolean n409EmprTel ;
   private boolean n405EmprFax ;
   private boolean n403EmprCpo ;
   private boolean n408EmprPob ;
   private boolean n787PrvDsc ;
   private boolean n252CliCod ;
   private boolean n1452DevGenHFec ;
   private boolean n1456ParArtCod ;
   private boolean n1454DevGenHPie ;
   private boolean n1455DevGenHUni ;
   private boolean n1457ParNMtr ;
   private boolean n966PartCod ;
   private boolean returnInSub ;
   private boolean n3330DevObsH ;
   private boolean n114ArtUrdP1 ;
   private boolean n111ArtUrd1 ;
   private boolean n110ArtTraP3 ;
   private boolean n107ArtTra3 ;
   private boolean n109ArtTraP2 ;
   private boolean n106ArtTra2 ;
   private boolean n108ArtTraP1 ;
   private boolean n105ArtTra1 ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P06WW2_A396EmprCod ;
   private String[] P06WW2_A407EmprNom ;
   private boolean[] P06WW2_n407EmprNom ;
   private String[] P06WW2_A404EmprDir ;
   private boolean[] P06WW2_n404EmprDir ;
   private String[] P06WW2_A409EmprTel ;
   private boolean[] P06WW2_n409EmprTel ;
   private String[] P06WW2_A405EmprFax ;
   private boolean[] P06WW2_n405EmprFax ;
   private String[] P06WW2_A403EmprCpo ;
   private boolean[] P06WW2_n403EmprCpo ;
   private String[] P06WW2_A408EmprPob ;
   private boolean[] P06WW2_n408EmprPob ;
   private short[] P06WW3_A781PrvCod ;
   private String[] P06WW3_A396EmprCod ;
   private int[] P06WW3_A1453DevGenHil ;
   private String[] P06WW3_A787PrvDsc ;
   private boolean[] P06WW3_n787PrvDsc ;
   private String[] P06WW3_A295CliPob ;
   private String[] P06WW3_A256CliCp ;
   private String[] P06WW3_A260CliDom ;
   private String[] P06WW3_A279CliNom ;
   private int[] P06WW3_A252CliCod ;
   private boolean[] P06WW3_n252CliCod ;
   private java.util.Date[] P06WW3_A1452DevGenHFec ;
   private boolean[] P06WW3_n1452DevGenHFec ;
   private String[] P06WW3_A1456ParArtCod ;
   private boolean[] P06WW3_n1456ParArtCod ;
   private short[] P06WW3_A1454DevGenHPie ;
   private boolean[] P06WW3_n1454DevGenHPie ;
   private java.math.BigDecimal[] P06WW3_A1455DevGenHUni ;
   private boolean[] P06WW3_n1455DevGenHUni ;
   private String[] P06WW3_A1457ParNMtr ;
   private boolean[] P06WW3_n1457ParNMtr ;
   private String[] P06WW3_A966PartCod ;
   private boolean[] P06WW3_n966PartCod ;
   private String[] P06WW4_A396EmprCod ;
   private int[] P06WW4_A1453DevGenHil ;
   private String[] P06WW4_A3330DevObsH ;
   private boolean[] P06WW4_n3330DevObsH ;
   private byte[] P06WW4_A3329DevLinH ;
   private String[] P06WW5_A396EmprCod ;
   private String[] P06WW5_A65ArtCod ;
   private int[] P06WW5_A252CliCod ;
   private boolean[] P06WW5_n252CliCod ;
   private short[] P06WW5_A114ArtUrdP1 ;
   private boolean[] P06WW5_n114ArtUrdP1 ;
   private String[] P06WW5_A111ArtUrd1 ;
   private boolean[] P06WW5_n111ArtUrd1 ;
   private short[] P06WW5_A110ArtTraP3 ;
   private boolean[] P06WW5_n110ArtTraP3 ;
   private String[] P06WW5_A107ArtTra3 ;
   private boolean[] P06WW5_n107ArtTra3 ;
   private short[] P06WW5_A109ArtTraP2 ;
   private boolean[] P06WW5_n109ArtTraP2 ;
   private String[] P06WW5_A106ArtTra2 ;
   private boolean[] P06WW5_n106ArtTra2 ;
   private short[] P06WW5_A108ArtTraP1 ;
   private boolean[] P06WW5_n108ArtTraP1 ;
   private String[] P06WW5_A105ArtTra1 ;
   private boolean[] P06WW5_n105ArtTra1 ;
}

final  class rdevgett__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06WW2", "SELECT EmprCod, EmprNom, EmprDir, EmprTel, EmprFax, EmprCpo, EmprPob FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06WW3", "SELECT T2.PrvCod, T1.EmprCod, T1.DevGenHil, T3.PrvDsc, T2.CliPob, T2.CliCp, T2.CliDom, T2.CliNom, T1.CliCod, T1.DevGenHFec, T4.ParArtCod, T1.DevGenHPie, T1.DevGenHUni, T4.ParNMtr, T1.PartCod FROM (((TXPDEVGEH T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN TXPPROVIN T3 ON T3.PrvCod = T2.PrvCod) LEFT JOIN TXPCPARTI T4 ON T4.EmprCod = T1.EmprCod AND T4.PartCod = T1.PartCod AND T4.CliCod = T1.CliCod) WHERE T1.EmprCod = ? and T1.DevGenHil = ? ORDER BY T1.EmprCod, T1.DevGenHil ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06WW4", "SELECT EmprCod, DevGenHil, DevObsH, DevLinH FROM TXPDEVOBH WHERE EmprCod = ? and DevGenHil = ? ORDER BY EmprCod, DevGenHil ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06WW5", "SELECT EmprCod, ArtCod, CliCod, ArtUrdP1, ArtUrd1, ArtTraP3, ArtTra3, ArtTraP2, ArtTra2, ArtTraP1, ArtTra1 FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((String[]) buf[6])[0] = rslt.getString(6, 6);
               ((String[]) buf[7])[0] = rslt.getString(7, 34);
               ((String[]) buf[8])[0] = rslt.getString(8, 30);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 16);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(12);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(14, 10);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(15, 16);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
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
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 4);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 4);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(11, 4);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
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
               stmt.setString(3, (String)parms[2], 16);
               return;
      }
   }

}

