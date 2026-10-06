package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class rdevggh extends GXReport
{
   public rdevggh( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rdevggh.class ), "" );
   }

   public rdevggh( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      rdevggh.this.aP1 = new int[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 )
   {
      rdevggh.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      rdevggh.this.A1453DevGenHil = aP1[0];
      this.aP1 = aP1;
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
         Gx_out = "PRN" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "REPGRAF", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("Devolución genero GRAFICO") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*6)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXt_char1 = AV16Lit0 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2322_", ""), (byte)(99), GXv_char2) ;
         rdevggh.this.GXt_char1 = GXv_char2[0] ;
         AV16Lit0 = GXt_char1 ;
         GXt_char1 = AV17Lit1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2301_", ""), (byte)(99), GXv_char2) ;
         rdevggh.this.GXt_char1 = GXv_char2[0] ;
         AV17Lit1 = GXt_char1 ;
         GXt_char1 = AV18Lit2 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         rdevggh.this.GXt_char1 = GXv_char2[0] ;
         AV18Lit2 = GXt_char1 ;
         GXt_char1 = AV19Lit3 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN073_", ""), (byte)(99), GXv_char2) ;
         rdevggh.this.GXt_char1 = GXv_char2[0] ;
         AV19Lit3 = GXt_char1 ;
         GXt_char1 = AV20Lit4 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN074_", ""), (byte)(99), GXv_char2) ;
         rdevggh.this.GXt_char1 = GXv_char2[0] ;
         AV20Lit4 = GXt_char1 ;
         GXt_char1 = AV21Lit5 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1301_", ""), (byte)(99), GXv_char2) ;
         rdevggh.this.GXt_char1 = GXv_char2[0] ;
         AV21Lit5 = GXt_char1 ;
         GXt_char1 = AV22Lit6 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2103_", ""), (byte)(99), GXv_char2) ;
         rdevggh.this.GXt_char1 = GXv_char2[0] ;
         AV22Lit6 = GXt_char1 ;
         GXt_char1 = AV23Lit7 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1288_", ""), (byte)(99), GXv_char2) ;
         rdevggh.this.GXt_char1 = GXv_char2[0] ;
         AV23Lit7 = GXt_char1 ;
         GXt_char1 = AV24Lit8 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2102_", ""), (byte)(99), GXv_char2) ;
         rdevggh.this.GXt_char1 = GXv_char2[0] ;
         AV24Lit8 = GXt_char1 ;
         GXt_char1 = AV25Lit9 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN145_", ""), (byte)(99), GXv_char2) ;
         rdevggh.this.GXt_char1 = GXv_char2[0] ;
         AV25Lit9 = GXt_char1 ;
         GXt_char1 = AV26Lit10 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2060_", ""), (byte)(99), GXv_char2) ;
         rdevggh.this.GXt_char1 = GXv_char2[0] ;
         AV26Lit10 = GXt_char1 ;
         GXt_char1 = AV27Lit11 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN440_", ""), (byte)(99), GXv_char2) ;
         rdevggh.this.GXt_char1 = GXv_char2[0] ;
         AV27Lit11 = GXt_char1 ;
         GXt_char1 = AV28Lit12 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WMSG269_", ""), (byte)(99), GXv_char2) ;
         rdevggh.this.GXt_char1 = GXv_char2[0] ;
         AV28Lit12 = GXt_char1 ;
         /* Using cursor P06OQ2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P06OQ2_A407EmprNom[0] ;
            n407EmprNom = P06OQ2_n407EmprNom[0] ;
            A404EmprDir = P06OQ2_A404EmprDir[0] ;
            n404EmprDir = P06OQ2_n404EmprDir[0] ;
            A409EmprTel = P06OQ2_A409EmprTel[0] ;
            n409EmprTel = P06OQ2_n409EmprTel[0] ;
            A405EmprFax = P06OQ2_A405EmprFax[0] ;
            n405EmprFax = P06OQ2_n405EmprFax[0] ;
            A403EmprCpo = P06OQ2_A403EmprCpo[0] ;
            n403EmprCpo = P06OQ2_n403EmprCpo[0] ;
            A408EmprPob = P06OQ2_A408EmprPob[0] ;
            n408EmprPob = P06OQ2_n408EmprPob[0] ;
            AV15NomEmp = A407EmprNom ;
            AV29DomEmp = A404EmprDir ;
            AV30TelEmp = A409EmprTel ;
            AV31FaxEmp = A405EmprFax ;
            AV32CpEmp = A403EmprCpo ;
            AV33PobEmp = A408EmprPob ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         /* Using cursor P06OQ3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A1453DevGenHil)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A279CliNom = P06OQ3_A279CliNom[0] ;
            A260CliDom = P06OQ3_A260CliDom[0] ;
            A295CliPob = P06OQ3_A295CliPob[0] ;
            A256CliCp = P06OQ3_A256CliCp[0] ;
            A3634DevDomEnv = P06OQ3_A3634DevDomEnv[0] ;
            n3634DevDomEnv = P06OQ3_n3634DevDomEnv[0] ;
            A252CliCod = P06OQ3_A252CliCod[0] ;
            n252CliCod = P06OQ3_n252CliCod[0] ;
            A1452DevGenHFec = P06OQ3_A1452DevGenHFec[0] ;
            n1452DevGenHFec = P06OQ3_n1452DevGenHFec[0] ;
            A1456ParArtCod = P06OQ3_A1456ParArtCod[0] ;
            n1456ParArtCod = P06OQ3_n1456ParArtCod[0] ;
            A1454DevGenHPie = P06OQ3_A1454DevGenHPie[0] ;
            n1454DevGenHPie = P06OQ3_n1454DevGenHPie[0] ;
            A1455DevGenHUni = P06OQ3_A1455DevGenHUni[0] ;
            n1455DevGenHUni = P06OQ3_n1455DevGenHUni[0] ;
            A1457ParNMtr = P06OQ3_A1457ParNMtr[0] ;
            n1457ParNMtr = P06OQ3_n1457ParNMtr[0] ;
            A966PartCod = P06OQ3_A966PartCod[0] ;
            n966PartCod = P06OQ3_n966PartCod[0] ;
            A279CliNom = P06OQ3_A279CliNom[0] ;
            A260CliDom = P06OQ3_A260CliDom[0] ;
            A295CliPob = P06OQ3_A295CliPob[0] ;
            A256CliCp = P06OQ3_A256CliCp[0] ;
            A1456ParArtCod = P06OQ3_A1456ParArtCod[0] ;
            n1456ParArtCod = P06OQ3_n1456ParArtCod[0] ;
            A1457ParNMtr = P06OQ3_A1457ParNMtr[0] ;
            n1457ParNMtr = P06OQ3_n1457ParNMtr[0] ;
            AV41CliENom = A279CliNom ;
            AV42CliEDom = A260CliDom ;
            AV43CliEPob = A295CliPob ;
            AV45CliEPrn = A256CliCp ;
            if ( ! (0==A3634DevDomEnv) )
            {
               AV35CliCod = A252CliCod ;
               AV40CliEnvLin = A3634DevDomEnv ;
               /* Execute user subroutine: 'ENVIO' */
               S121 ();
               if ( returnInSub )
               {
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
            h6OQ0( false, 283) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV15NomEmp, "")), 40, Gx_line+0, 229, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Tel.", ""), 39, Gx_line+40, 69, Gx_line+57, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29DomEmp, "")), 40, Gx_line+20, 223, Gx_line+37, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fax.", ""), 39, Gx_line+56, 69, Gx_line+73, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30TelEmp, "")), 75, Gx_line+40, 185, Gx_line+57, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31FaxEmp, "")), 75, Gx_line+56, 185, Gx_line+73, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32CpEmp, "")), 39, Gx_line+73, 91, Gx_line+90, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33PobEmp, "")), 97, Gx_line+73, 353, Gx_line+90, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV16Lit0, "")), 429, Gx_line+69, 623, Gx_line+89, 1, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17Lit1, "")), 69, Gx_line+155, 136, Gx_line+172, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1453DevGenHil), "ZZZZZZZ9")), 161, Gx_line+155, 220, Gx_line+172, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18Lit2, "")), 69, Gx_line+172, 106, Gx_line+189, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( A1452DevGenHFec, "99/99/99"), 161, Gx_line+172, 220, Gx_line+189, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19Lit3, "")), 69, Gx_line+189, 121, Gx_line+206, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 176, Gx_line+189, 221, Gx_line+206, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41CliENom, "")), 360, Gx_line+139, 580, Gx_line+156, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42CliEDom, "")), 360, Gx_line+155, 609, Gx_line+172, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44CliECp, "")), 360, Gx_line+172, 405, Gx_line+189, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43CliEPob, "")), 411, Gx_line+172, 631, Gx_line+189, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45CliEPrn, "@!")), 360, Gx_line+189, 580, Gx_line+206, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(":", 140, Gx_line+188, 148, Gx_line+205, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(":", 140, Gx_line+171, 148, Gx_line+188, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(":", 140, Gx_line+154, 148, Gx_line+171, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(342, Gx_line+128, 650, Gx_line+225, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawRect(64, Gx_line+128, 317, Gx_line+225, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+283) ;
            AV35CliCod = A252CliCod ;
            AV36ArtCod = A1456ParArtCod ;
            /* Execute user subroutine: 'LEOARTICU' */
            S111 ();
            if ( returnInSub )
            {
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
            AV38LinObs = (byte)(0) ;
            GX_I = 1 ;
            while ( GX_I <= 4 )
            {
               AV37ObsLin[GX_I-1] = "" ;
               GX_I = (int)(GX_I+1) ;
            }
            /* Using cursor P06OQ4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A1453DevGenHil)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A3330DevObsH = P06OQ4_A3330DevObsH[0] ;
               n3330DevObsH = P06OQ4_n3330DevObsH[0] ;
               A3329DevLinH = P06OQ4_A3329DevLinH[0] ;
               AV38LinObs = (byte)(AV38LinObs+1) ;
               AV37ObsLin[AV38LinObs-1] = A3330DevObsH ;
               if ( AV38LinObs == 4 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
               pr_default.readNext(2);
            }
            pr_default.close(2);
            h6OQ0( false, 332) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Materia", ""), 323, Gx_line+5, 375, Gx_line+22, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20Lit4, "")), 69, Gx_line+5, 128, Gx_line+23, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21Lit5, "")), 192, Gx_line+5, 244, Gx_line+23, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1456ParArtCod, "")), 69, Gx_line+33, 187, Gx_line+50, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A966PartCod, "")), 193, Gx_line+33, 311, Gx_line+50, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34Mater, "")), 324, Gx_line+33, 566, Gx_line+50, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1457ParNMtr, "")), 572, Gx_line+33, 646, Gx_line+50, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Lit7, "")), 69, Gx_line+93, 165, Gx_line+111, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24Lit8, "")), 190, Gx_line+93, 337, Gx_line+111, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22Lit6, "")), 529, Gx_line+230, 596, Gx_line+248, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25Lit9, "")), 492, Gx_line+247, 529, Gx_line+265, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26Lit10, "")), 594, Gx_line+247, 631, Gx_line+265, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A1455DevGenHUni, "ZZZZZ9.99")), 471, Gx_line+277, 538, Gx_line+294, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1454DevGenHPie), "ZZZ9")), 601, Gx_line+277, 631, Gx_line+294, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37ObsLin[1-1], "")), 69, Gx_line+126, 508, Gx_line+143, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37ObsLin[2-1], "")), 69, Gx_line+143, 508, Gx_line+160, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37ObsLin[3-1], "")), 69, Gx_line+159, 508, Gx_line+176, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37ObsLin[4-1], "")), 69, Gx_line+176, 508, Gx_line+193, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(64, Gx_line+2, 650, Gx_line+63, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(64, Gx_line+25, 649, Gx_line+25, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "N.H.", ""), 584, Gx_line+5, 614, Gx_line+22, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(64, Gx_line+84, 649, Gx_line+201, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(64, Gx_line+111, 649, Gx_line+111, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawRect(454, Gx_line+223, 649, Gx_line+307, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(455, Gx_line+266, 648, Gx_line+266, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(561, Gx_line+266, 561, Gx_line+308, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+332) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6OQ0( true, 0) ;
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
      AV34Mater = "" ;
      /* Using cursor P06OQ5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV35CliCod), AV36ArtCod});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A65ArtCod = P06OQ5_A65ArtCod[0] ;
         A252CliCod = P06OQ5_A252CliCod[0] ;
         n252CliCod = P06OQ5_n252CliCod[0] ;
         A114ArtUrdP1 = P06OQ5_A114ArtUrdP1[0] ;
         n114ArtUrdP1 = P06OQ5_n114ArtUrdP1[0] ;
         A111ArtUrd1 = P06OQ5_A111ArtUrd1[0] ;
         n111ArtUrd1 = P06OQ5_n111ArtUrd1[0] ;
         A110ArtTraP3 = P06OQ5_A110ArtTraP3[0] ;
         n110ArtTraP3 = P06OQ5_n110ArtTraP3[0] ;
         A107ArtTra3 = P06OQ5_A107ArtTra3[0] ;
         n107ArtTra3 = P06OQ5_n107ArtTra3[0] ;
         A109ArtTraP2 = P06OQ5_A109ArtTraP2[0] ;
         n109ArtTraP2 = P06OQ5_n109ArtTraP2[0] ;
         A106ArtTra2 = P06OQ5_A106ArtTra2[0] ;
         n106ArtTra2 = P06OQ5_n106ArtTra2[0] ;
         A108ArtTraP1 = P06OQ5_A108ArtTraP1[0] ;
         n108ArtTraP1 = P06OQ5_n108ArtTraP1[0] ;
         A105ArtTra1 = P06OQ5_A105ArtTra1[0] ;
         n105ArtTra1 = P06OQ5_n105ArtTra1[0] ;
         AV34Mater = A105ArtTra1 + " " + GXutil.str( A108ArtTraP1, 3, 0) + " " + A106ArtTra2 + " " + GXutil.str( A109ArtTraP2, 3, 0) + " " + A107ArtTra3 + " " + GXutil.str( A110ArtTraP3, 3, 0) + " " + A111ArtUrd1 + " " + GXutil.str( A114ArtUrdP1, 3, 0) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'ENVIO' Routine */
      returnInSub = false ;
      AV41CliENom = "" ;
      AV42CliEDom = "" ;
      AV44CliECp = "" ;
      AV43CliEPob = "" ;
      AV45CliEPrn = "" ;
      /* Using cursor P06OQ6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV35CliCod), Byte.valueOf(AV40CliEnvLin)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A270CliEnvPrv = P06OQ6_A270CliEnvPrv[0] ;
         A266CliEnvLin = P06OQ6_A266CliEnvLin[0] ;
         A252CliCod = P06OQ6_A252CliCod[0] ;
         n252CliCod = P06OQ6_n252CliCod[0] ;
         A267CliEnvNom = P06OQ6_A267CliEnvNom[0] ;
         A265CliEnvDom = P06OQ6_A265CliEnvDom[0] ;
         A264CliEnvCp = P06OQ6_A264CliEnvCp[0] ;
         A268CliEnvPob = P06OQ6_A268CliEnvPob[0] ;
         A269CliEnvPrn = P06OQ6_A269CliEnvPrn[0] ;
         n269CliEnvPrn = P06OQ6_n269CliEnvPrn[0] ;
         A269CliEnvPrn = P06OQ6_A269CliEnvPrn[0] ;
         n269CliEnvPrn = P06OQ6_n269CliEnvPrn[0] ;
         AV41CliENom = A267CliEnvNom ;
         AV42CliEDom = A265CliEnvDom ;
         AV44CliECp = A264CliEnvCp ;
         AV43CliEPob = A268CliEnvPob ;
         AV45CliEPrn = A269CliEnvPrn ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
   }

   public void h6OQ0( boolean bFoot ,
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
      this.aP0[0] = rdevggh.this.A396EmprCod;
      this.aP1[0] = rdevggh.this.A1453DevGenHil;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV16Lit0 = "" ;
      AV17Lit1 = "" ;
      AV18Lit2 = "" ;
      AV19Lit3 = "" ;
      AV20Lit4 = "" ;
      AV21Lit5 = "" ;
      AV22Lit6 = "" ;
      AV23Lit7 = "" ;
      AV24Lit8 = "" ;
      AV25Lit9 = "" ;
      AV26Lit10 = "" ;
      AV27Lit11 = "" ;
      AV28Lit12 = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      scmdbuf = "" ;
      P06OQ2_A396EmprCod = new String[] {""} ;
      P06OQ2_A407EmprNom = new String[] {""} ;
      P06OQ2_n407EmprNom = new boolean[] {false} ;
      P06OQ2_A404EmprDir = new String[] {""} ;
      P06OQ2_n404EmprDir = new boolean[] {false} ;
      P06OQ2_A409EmprTel = new String[] {""} ;
      P06OQ2_n409EmprTel = new boolean[] {false} ;
      P06OQ2_A405EmprFax = new String[] {""} ;
      P06OQ2_n405EmprFax = new boolean[] {false} ;
      P06OQ2_A403EmprCpo = new String[] {""} ;
      P06OQ2_n403EmprCpo = new boolean[] {false} ;
      P06OQ2_A408EmprPob = new String[] {""} ;
      P06OQ2_n408EmprPob = new boolean[] {false} ;
      A407EmprNom = "" ;
      A404EmprDir = "" ;
      A409EmprTel = "" ;
      A405EmprFax = "" ;
      A403EmprCpo = "" ;
      A408EmprPob = "" ;
      AV15NomEmp = "" ;
      AV29DomEmp = "" ;
      AV30TelEmp = "" ;
      AV31FaxEmp = "" ;
      AV32CpEmp = "" ;
      AV33PobEmp = "" ;
      P06OQ3_A396EmprCod = new String[] {""} ;
      P06OQ3_A1453DevGenHil = new int[1] ;
      P06OQ3_A279CliNom = new String[] {""} ;
      P06OQ3_A260CliDom = new String[] {""} ;
      P06OQ3_A295CliPob = new String[] {""} ;
      P06OQ3_A256CliCp = new String[] {""} ;
      P06OQ3_A3634DevDomEnv = new byte[1] ;
      P06OQ3_n3634DevDomEnv = new boolean[] {false} ;
      P06OQ3_A252CliCod = new int[1] ;
      P06OQ3_n252CliCod = new boolean[] {false} ;
      P06OQ3_A1452DevGenHFec = new java.util.Date[] {GXutil.nullDate()} ;
      P06OQ3_n1452DevGenHFec = new boolean[] {false} ;
      P06OQ3_A1456ParArtCod = new String[] {""} ;
      P06OQ3_n1456ParArtCod = new boolean[] {false} ;
      P06OQ3_A1454DevGenHPie = new short[1] ;
      P06OQ3_n1454DevGenHPie = new boolean[] {false} ;
      P06OQ3_A1455DevGenHUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06OQ3_n1455DevGenHUni = new boolean[] {false} ;
      P06OQ3_A1457ParNMtr = new String[] {""} ;
      P06OQ3_n1457ParNMtr = new boolean[] {false} ;
      P06OQ3_A966PartCod = new String[] {""} ;
      P06OQ3_n966PartCod = new boolean[] {false} ;
      A279CliNom = "" ;
      A260CliDom = "" ;
      A295CliPob = "" ;
      A256CliCp = "" ;
      A1452DevGenHFec = GXutil.nullDate() ;
      A1456ParArtCod = "" ;
      A1455DevGenHUni = DecimalUtil.ZERO ;
      A1457ParNMtr = "" ;
      A966PartCod = "" ;
      AV41CliENom = "" ;
      AV42CliEDom = "" ;
      AV43CliEPob = "" ;
      AV45CliEPrn = "" ;
      AV44CliECp = "" ;
      AV36ArtCod = "" ;
      AV37ObsLin = new String[4] ;
      GX_I = 1 ;
      while ( GX_I <= 4 )
      {
         AV37ObsLin[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P06OQ4_A396EmprCod = new String[] {""} ;
      P06OQ4_A1453DevGenHil = new int[1] ;
      P06OQ4_A3330DevObsH = new String[] {""} ;
      P06OQ4_n3330DevObsH = new boolean[] {false} ;
      P06OQ4_A3329DevLinH = new byte[1] ;
      A3330DevObsH = "" ;
      AV34Mater = "" ;
      P06OQ5_A396EmprCod = new String[] {""} ;
      P06OQ5_A65ArtCod = new String[] {""} ;
      P06OQ5_A252CliCod = new int[1] ;
      P06OQ5_n252CliCod = new boolean[] {false} ;
      P06OQ5_A114ArtUrdP1 = new short[1] ;
      P06OQ5_n114ArtUrdP1 = new boolean[] {false} ;
      P06OQ5_A111ArtUrd1 = new String[] {""} ;
      P06OQ5_n111ArtUrd1 = new boolean[] {false} ;
      P06OQ5_A110ArtTraP3 = new short[1] ;
      P06OQ5_n110ArtTraP3 = new boolean[] {false} ;
      P06OQ5_A107ArtTra3 = new String[] {""} ;
      P06OQ5_n107ArtTra3 = new boolean[] {false} ;
      P06OQ5_A109ArtTraP2 = new short[1] ;
      P06OQ5_n109ArtTraP2 = new boolean[] {false} ;
      P06OQ5_A106ArtTra2 = new String[] {""} ;
      P06OQ5_n106ArtTra2 = new boolean[] {false} ;
      P06OQ5_A108ArtTraP1 = new short[1] ;
      P06OQ5_n108ArtTraP1 = new boolean[] {false} ;
      P06OQ5_A105ArtTra1 = new String[] {""} ;
      P06OQ5_n105ArtTra1 = new boolean[] {false} ;
      A65ArtCod = "" ;
      A111ArtUrd1 = "" ;
      A107ArtTra3 = "" ;
      A106ArtTra2 = "" ;
      A105ArtTra1 = "" ;
      P06OQ6_A270CliEnvPrv = new short[1] ;
      P06OQ6_A396EmprCod = new String[] {""} ;
      P06OQ6_A266CliEnvLin = new byte[1] ;
      P06OQ6_A252CliCod = new int[1] ;
      P06OQ6_n252CliCod = new boolean[] {false} ;
      P06OQ6_A267CliEnvNom = new String[] {""} ;
      P06OQ6_A265CliEnvDom = new String[] {""} ;
      P06OQ6_A264CliEnvCp = new String[] {""} ;
      P06OQ6_A268CliEnvPob = new String[] {""} ;
      P06OQ6_A269CliEnvPrn = new String[] {""} ;
      P06OQ6_n269CliEnvPrn = new boolean[] {false} ;
      A267CliEnvNom = "" ;
      A265CliEnvDom = "" ;
      A264CliEnvCp = "" ;
      A268CliEnvPob = "" ;
      A269CliEnvPrn = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rdevggh__default(),
         new Object[] {
             new Object[] {
            P06OQ2_A396EmprCod, P06OQ2_A407EmprNom, P06OQ2_n407EmprNom, P06OQ2_A404EmprDir, P06OQ2_n404EmprDir, P06OQ2_A409EmprTel, P06OQ2_n409EmprTel, P06OQ2_A405EmprFax, P06OQ2_n405EmprFax, P06OQ2_A403EmprCpo,
            P06OQ2_n403EmprCpo, P06OQ2_A408EmprPob, P06OQ2_n408EmprPob
            }
            , new Object[] {
            P06OQ3_A396EmprCod, P06OQ3_A1453DevGenHil, P06OQ3_A279CliNom, P06OQ3_A260CliDom, P06OQ3_A295CliPob, P06OQ3_A256CliCp, P06OQ3_A3634DevDomEnv, P06OQ3_n3634DevDomEnv, P06OQ3_A252CliCod, P06OQ3_n252CliCod,
            P06OQ3_A1452DevGenHFec, P06OQ3_n1452DevGenHFec, P06OQ3_A1456ParArtCod, P06OQ3_n1456ParArtCod, P06OQ3_A1454DevGenHPie, P06OQ3_n1454DevGenHPie, P06OQ3_A1455DevGenHUni, P06OQ3_n1455DevGenHUni, P06OQ3_A1457ParNMtr, P06OQ3_n1457ParNMtr,
            P06OQ3_A966PartCod, P06OQ3_n966PartCod
            }
            , new Object[] {
            P06OQ4_A396EmprCod, P06OQ4_A1453DevGenHil, P06OQ4_A3330DevObsH, P06OQ4_n3330DevObsH, P06OQ4_A3329DevLinH
            }
            , new Object[] {
            P06OQ5_A396EmprCod, P06OQ5_A65ArtCod, P06OQ5_A252CliCod, P06OQ5_A114ArtUrdP1, P06OQ5_n114ArtUrdP1, P06OQ5_A111ArtUrd1, P06OQ5_n111ArtUrd1, P06OQ5_A110ArtTraP3, P06OQ5_n110ArtTraP3, P06OQ5_A107ArtTra3,
            P06OQ5_n107ArtTra3, P06OQ5_A109ArtTraP2, P06OQ5_n109ArtTraP2, P06OQ5_A106ArtTra2, P06OQ5_n106ArtTra2, P06OQ5_A108ArtTraP1, P06OQ5_n108ArtTraP1, P06OQ5_A105ArtTra1, P06OQ5_n105ArtTra1
            }
            , new Object[] {
            P06OQ6_A270CliEnvPrv, P06OQ6_A396EmprCod, P06OQ6_A266CliEnvLin, P06OQ6_A252CliCod, P06OQ6_A267CliEnvNom, P06OQ6_A265CliEnvDom, P06OQ6_A264CliEnvCp, P06OQ6_A268CliEnvPob, P06OQ6_A269CliEnvPrn, P06OQ6_n269CliEnvPrn
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte A3634DevDomEnv ;
   private byte AV40CliEnvLin ;
   private byte AV38LinObs ;
   private byte A3329DevLinH ;
   private byte A266CliEnvLin ;
   private short A1454DevGenHPie ;
   private short A114ArtUrdP1 ;
   private short A110ArtTraP3 ;
   private short A109ArtTraP2 ;
   private short A108ArtTraP1 ;
   private short A270CliEnvPrv ;
   private short Gx_err ;
   private int A1453DevGenHil ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A252CliCod ;
   private int AV35CliCod ;
   private int Gx_OldLine ;
   private int GX_I ;
   private java.math.BigDecimal A1455DevGenHUni ;
   private String A396EmprCod ;
   private String AV16Lit0 ;
   private String AV17Lit1 ;
   private String AV18Lit2 ;
   private String AV19Lit3 ;
   private String AV20Lit4 ;
   private String AV21Lit5 ;
   private String AV22Lit6 ;
   private String AV23Lit7 ;
   private String AV24Lit8 ;
   private String AV25Lit9 ;
   private String AV26Lit10 ;
   private String AV27Lit11 ;
   private String AV28Lit12 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String A404EmprDir ;
   private String A409EmprTel ;
   private String A405EmprFax ;
   private String A403EmprCpo ;
   private String A408EmprPob ;
   private String AV15NomEmp ;
   private String AV29DomEmp ;
   private String AV30TelEmp ;
   private String AV31FaxEmp ;
   private String AV32CpEmp ;
   private String AV33PobEmp ;
   private String A279CliNom ;
   private String A260CliDom ;
   private String A295CliPob ;
   private String A256CliCp ;
   private String A1456ParArtCod ;
   private String A1457ParNMtr ;
   private String A966PartCod ;
   private String AV41CliENom ;
   private String AV42CliEDom ;
   private String AV43CliEPob ;
   private String AV45CliEPrn ;
   private String AV44CliECp ;
   private String AV36ArtCod ;
   private String AV37ObsLin[] ;
   private String A3330DevObsH ;
   private String AV34Mater ;
   private String A65ArtCod ;
   private String A111ArtUrd1 ;
   private String A107ArtTra3 ;
   private String A106ArtTra2 ;
   private String A105ArtTra1 ;
   private String A267CliEnvNom ;
   private String A265CliEnvDom ;
   private String A264CliEnvCp ;
   private String A268CliEnvPob ;
   private String A269CliEnvPrn ;
   private java.util.Date A1452DevGenHFec ;
   private boolean n407EmprNom ;
   private boolean n404EmprDir ;
   private boolean n409EmprTel ;
   private boolean n405EmprFax ;
   private boolean n403EmprCpo ;
   private boolean n408EmprPob ;
   private boolean n3634DevDomEnv ;
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
   private boolean n269CliEnvPrn ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P06OQ2_A396EmprCod ;
   private String[] P06OQ2_A407EmprNom ;
   private boolean[] P06OQ2_n407EmprNom ;
   private String[] P06OQ2_A404EmprDir ;
   private boolean[] P06OQ2_n404EmprDir ;
   private String[] P06OQ2_A409EmprTel ;
   private boolean[] P06OQ2_n409EmprTel ;
   private String[] P06OQ2_A405EmprFax ;
   private boolean[] P06OQ2_n405EmprFax ;
   private String[] P06OQ2_A403EmprCpo ;
   private boolean[] P06OQ2_n403EmprCpo ;
   private String[] P06OQ2_A408EmprPob ;
   private boolean[] P06OQ2_n408EmprPob ;
   private String[] P06OQ3_A396EmprCod ;
   private int[] P06OQ3_A1453DevGenHil ;
   private String[] P06OQ3_A279CliNom ;
   private String[] P06OQ3_A260CliDom ;
   private String[] P06OQ3_A295CliPob ;
   private String[] P06OQ3_A256CliCp ;
   private byte[] P06OQ3_A3634DevDomEnv ;
   private boolean[] P06OQ3_n3634DevDomEnv ;
   private int[] P06OQ3_A252CliCod ;
   private boolean[] P06OQ3_n252CliCod ;
   private java.util.Date[] P06OQ3_A1452DevGenHFec ;
   private boolean[] P06OQ3_n1452DevGenHFec ;
   private String[] P06OQ3_A1456ParArtCod ;
   private boolean[] P06OQ3_n1456ParArtCod ;
   private short[] P06OQ3_A1454DevGenHPie ;
   private boolean[] P06OQ3_n1454DevGenHPie ;
   private java.math.BigDecimal[] P06OQ3_A1455DevGenHUni ;
   private boolean[] P06OQ3_n1455DevGenHUni ;
   private String[] P06OQ3_A1457ParNMtr ;
   private boolean[] P06OQ3_n1457ParNMtr ;
   private String[] P06OQ3_A966PartCod ;
   private boolean[] P06OQ3_n966PartCod ;
   private String[] P06OQ4_A396EmprCod ;
   private int[] P06OQ4_A1453DevGenHil ;
   private String[] P06OQ4_A3330DevObsH ;
   private boolean[] P06OQ4_n3330DevObsH ;
   private byte[] P06OQ4_A3329DevLinH ;
   private String[] P06OQ5_A396EmprCod ;
   private String[] P06OQ5_A65ArtCod ;
   private int[] P06OQ5_A252CliCod ;
   private boolean[] P06OQ5_n252CliCod ;
   private short[] P06OQ5_A114ArtUrdP1 ;
   private boolean[] P06OQ5_n114ArtUrdP1 ;
   private String[] P06OQ5_A111ArtUrd1 ;
   private boolean[] P06OQ5_n111ArtUrd1 ;
   private short[] P06OQ5_A110ArtTraP3 ;
   private boolean[] P06OQ5_n110ArtTraP3 ;
   private String[] P06OQ5_A107ArtTra3 ;
   private boolean[] P06OQ5_n107ArtTra3 ;
   private short[] P06OQ5_A109ArtTraP2 ;
   private boolean[] P06OQ5_n109ArtTraP2 ;
   private String[] P06OQ5_A106ArtTra2 ;
   private boolean[] P06OQ5_n106ArtTra2 ;
   private short[] P06OQ5_A108ArtTraP1 ;
   private boolean[] P06OQ5_n108ArtTraP1 ;
   private String[] P06OQ5_A105ArtTra1 ;
   private boolean[] P06OQ5_n105ArtTra1 ;
   private short[] P06OQ6_A270CliEnvPrv ;
   private String[] P06OQ6_A396EmprCod ;
   private byte[] P06OQ6_A266CliEnvLin ;
   private int[] P06OQ6_A252CliCod ;
   private boolean[] P06OQ6_n252CliCod ;
   private String[] P06OQ6_A267CliEnvNom ;
   private String[] P06OQ6_A265CliEnvDom ;
   private String[] P06OQ6_A264CliEnvCp ;
   private String[] P06OQ6_A268CliEnvPob ;
   private String[] P06OQ6_A269CliEnvPrn ;
   private boolean[] P06OQ6_n269CliEnvPrn ;
}

final  class rdevggh__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06OQ2", "SELECT EmprCod, EmprNom, EmprDir, EmprTel, EmprFax, EmprCpo, EmprPob FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06OQ3", "SELECT T1.EmprCod, T1.DevGenHil, T2.CliNom, T2.CliDom, T2.CliPob, T2.CliCp, T1.DevDomEnv, T1.CliCod, T1.DevGenHFec, T3.ParArtCod, T1.DevGenHPie, T1.DevGenHUni, T3.ParNMtr, T1.PartCod FROM ((TXPDEVGEH T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN TXPCPARTI T3 ON T3.EmprCod = T1.EmprCod AND T3.PartCod = T1.PartCod AND T3.CliCod = T1.CliCod) WHERE T1.EmprCod = ? and T1.DevGenHil = ? ORDER BY T1.EmprCod, T1.DevGenHil ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06OQ4", "SELECT EmprCod, DevGenHil, DevObsH, DevLinH FROM TXPDEVOBH WHERE EmprCod = ? and DevGenHil = ? ORDER BY EmprCod, DevGenHil ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06OQ5", "SELECT EmprCod, ArtCod, CliCod, ArtUrdP1, ArtUrd1, ArtTraP3, ArtTra3, ArtTraP2, ArtTra2, ArtTraP1, ArtTra1 FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06OQ6", "SELECT T1.CliEnvPrv AS CliEnvPrv, T1.EmprCod, T1.CliEnvLin, T1.CliCod, T1.CliEnvNom, T1.CliEnvDom, T1.CliEnvCp, T1.CliEnvPob, T2.PrvDsc AS CliEnvPrn FROM (TXPCLIENV T1 INNER JOIN TXPPROVIN T2 ON T2.PrvCod = T1.CliEnvPrv) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.CliEnvLin = ? ORDER BY T1.EmprCod, T1.CliCod, T1.CliEnvLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 34);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 16);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(11);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(13, 10);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(14, 16);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
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
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((String[]) buf[5])[0] = rslt.getString(6, 34);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((String[]) buf[8])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
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
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
      }
   }

}

