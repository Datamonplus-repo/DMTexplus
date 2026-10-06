package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class rdevges extends GXReport
{
   public rdevges( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rdevges.class ), "" );
   }

   public rdevges( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            String[] aP2 )
   {
      rdevges.this.aP3 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        short[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             short[] aP3 )
   {
      rdevges.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      rdevges.this.A2080DevEstCod = aP1[0];
      this.aP1 = aP1;
      rdevges.this.AV15ImpCod = aP2[0];
      this.aP2 = aP2;
      rdevges.this.AV16ProceCod = aP3[0];
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
         Gx_out = "PRN" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "REPGRAF", "", 2, 1, 256, 17280, 14400, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("ALBARAN DEVOLUCION ESTAMPACION") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*0)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXt_char1 = AV20Lit0 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2322_", ""), (byte)(99), GXv_char2) ;
         rdevges.this.GXt_char1 = GXv_char2[0] ;
         AV20Lit0 = GXt_char1 ;
         GXt_char1 = AV21Lit1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1017_", ""), (byte)(9), GXv_char2) ;
         rdevges.this.GXt_char1 = GXv_char2[0] ;
         AV21Lit1 = GXt_char1 ;
         GXt_char1 = AV22Lit2 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(9), GXv_char2) ;
         rdevges.this.GXt_char1 = GXv_char2[0] ;
         AV22Lit2 = GXt_char1 ;
         GXt_char1 = AV23Lit3 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1514_", ""), (byte)(9), GXv_char2) ;
         rdevges.this.GXt_char1 = GXv_char2[0] ;
         AV23Lit3 = GXt_char1 ;
         GXt_char1 = AV24Lit4 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1479_", ""), (byte)(99), GXv_char2) ;
         rdevges.this.GXt_char1 = GXv_char2[0] ;
         AV24Lit4 = GXt_char1 ;
         GXt_char1 = AV25Lit5 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1180_", ""), (byte)(99), GXv_char2) ;
         rdevges.this.GXt_char1 = GXv_char2[0] ;
         AV25Lit5 = GXt_char1 ;
         GXt_char1 = AV26Lit6 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2103_", ""), (byte)(99), GXv_char2) ;
         rdevges.this.GXt_char1 = GXv_char2[0] ;
         AV26Lit6 = GXt_char1 ;
         GXt_char1 = AV27Lit7 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1288_", ""), (byte)(99), GXv_char2) ;
         rdevges.this.GXt_char1 = GXv_char2[0] ;
         AV27Lit7 = GXt_char1 ;
         GXt_char1 = AV28Lit8 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2102_", ""), (byte)(99), GXv_char2) ;
         rdevges.this.GXt_char1 = GXv_char2[0] ;
         AV28Lit8 = GXt_char1 ;
         GXt_char1 = AV29Lit9 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN442_", ""), (byte)(99), GXv_char2) ;
         rdevges.this.GXt_char1 = GXv_char2[0] ;
         AV29Lit9 = GXt_char1 ;
         GXt_char1 = AV30Lit10 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN440_", ""), (byte)(99), GXv_char2) ;
         rdevges.this.GXt_char1 = GXv_char2[0] ;
         AV30Lit10 = GXt_char1 ;
         GXt_char1 = AV39Lit13 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2367_", ""), (byte)(14), GXv_char2) ;
         rdevges.this.GXt_char1 = GXv_char2[0] ;
         AV39Lit13 = GXt_char1 ;
         /* Using cursor P06IN2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P06IN2_A407EmprNom[0] ;
            n407EmprNom = P06IN2_n407EmprNom[0] ;
            A404EmprDir = P06IN2_A404EmprDir[0] ;
            n404EmprDir = P06IN2_n404EmprDir[0] ;
            A409EmprTel = P06IN2_A409EmprTel[0] ;
            n409EmprTel = P06IN2_n409EmprTel[0] ;
            A405EmprFax = P06IN2_A405EmprFax[0] ;
            n405EmprFax = P06IN2_n405EmprFax[0] ;
            A403EmprCpo = P06IN2_A403EmprCpo[0] ;
            n403EmprCpo = P06IN2_n403EmprCpo[0] ;
            A408EmprPob = P06IN2_A408EmprPob[0] ;
            n408EmprPob = P06IN2_n408EmprPob[0] ;
            AV17NomEmp = A407EmprNom ;
            AV33DomEmp = A404EmprDir ;
            AV34TelEmp = A409EmprTel ;
            AV35FaxEmp = A405EmprFax ;
            AV36CpEmp = A403EmprCpo ;
            AV37PobEmp = A408EmprPob ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         /* Using cursor P06IN3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A2080DevEstCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A781PrvCod = P06IN3_A781PrvCod[0] ;
            n781PrvCod = P06IN3_n781PrvCod[0] ;
            A2082DevEstFec = P06IN3_A2082DevEstFec[0] ;
            n2082DevEstFec = P06IN3_n2082DevEstFec[0] ;
            A2520DevEstEnv = P06IN3_A2520DevEstEnv[0] ;
            n2520DevEstEnv = P06IN3_n2520DevEstEnv[0] ;
            A787PrvDsc = P06IN3_A787PrvDsc[0] ;
            n787PrvDsc = P06IN3_n787PrvDsc[0] ;
            A295CliPob = P06IN3_A295CliPob[0] ;
            A256CliCp = P06IN3_A256CliCp[0] ;
            A260CliDom = P06IN3_A260CliDom[0] ;
            A279CliNom = P06IN3_A279CliNom[0] ;
            A252CliCod = P06IN3_A252CliCod[0] ;
            n252CliCod = P06IN3_n252CliCod[0] ;
            A988ProcePob = P06IN3_A988ProcePob[0] ;
            n988ProcePob = P06IN3_n988ProcePob[0] ;
            A989PoceCp = P06IN3_A989PoceCp[0] ;
            n989PoceCp = P06IN3_n989PoceCp[0] ;
            A994ProceDom = P06IN3_A994ProceDom[0] ;
            n994ProceDom = P06IN3_n994ProceDom[0] ;
            A971ProceNom = P06IN3_A971ProceNom[0] ;
            n971ProceNom = P06IN3_n971ProceNom[0] ;
            A970ProceCod = P06IN3_A970ProceCod[0] ;
            n970ProceCod = P06IN3_n970ProceCod[0] ;
            A2085DevEstPie = P06IN3_A2085DevEstPie[0] ;
            n2085DevEstPie = P06IN3_n2085DevEstPie[0] ;
            A2087DevEstUni = P06IN3_A2087DevEstUni[0] ;
            n2087DevEstUni = P06IN3_n2087DevEstUni[0] ;
            A1032FonCod = P06IN3_A1032FonCod[0] ;
            n1032FonCod = P06IN3_n1032FonCod[0] ;
            A1031EmpesCod = P06IN3_A1031EmpesCod[0] ;
            n1031EmpesCod = P06IN3_n1031EmpesCod[0] ;
            A781PrvCod = P06IN3_A781PrvCod[0] ;
            n781PrvCod = P06IN3_n781PrvCod[0] ;
            A295CliPob = P06IN3_A295CliPob[0] ;
            A256CliCp = P06IN3_A256CliCp[0] ;
            A260CliDom = P06IN3_A260CliDom[0] ;
            A279CliNom = P06IN3_A279CliNom[0] ;
            A787PrvDsc = P06IN3_A787PrvDsc[0] ;
            n787PrvDsc = P06IN3_n787PrvDsc[0] ;
            A970ProceCod = P06IN3_A970ProceCod[0] ;
            n970ProceCod = P06IN3_n970ProceCod[0] ;
            A988ProcePob = P06IN3_A988ProcePob[0] ;
            n988ProcePob = P06IN3_n988ProcePob[0] ;
            A989PoceCp = P06IN3_A989PoceCp[0] ;
            n989PoceCp = P06IN3_n989PoceCp[0] ;
            A994ProceDom = P06IN3_A994ProceDom[0] ;
            n994ProceDom = P06IN3_n994ProceDom[0] ;
            A971ProceNom = P06IN3_A971ProceNom[0] ;
            n971ProceNom = P06IN3_n971ProceNom[0] ;
            h6IN0( false, 217) ;
            getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17NomEmp, "")), 7, Gx_line+33, 258, Gx_line+51, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Tel.", ""), 7, Gx_line+67, 37, Gx_line+84, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33DomEmp, "")), 7, Gx_line+50, 263, Gx_line+68, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fax.", ""), 7, Gx_line+83, 37, Gx_line+100, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34TelEmp, "")), 44, Gx_line+67, 154, Gx_line+85, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35FaxEmp, "")), 44, Gx_line+83, 154, Gx_line+101, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36CpEmp, "")), 7, Gx_line+100, 59, Gx_line+118, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37PobEmp, "")), 66, Gx_line+100, 322, Gx_line+118, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20Lit0, "")), 452, Gx_line+100, 562, Gx_line+118, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21Lit1, "")), 430, Gx_line+150, 497, Gx_line+167, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2080DevEstCod), "ZZZZZZZ9")), 503, Gx_line+150, 562, Gx_line+167, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22Lit2, "")), 430, Gx_line+167, 497, Gx_line+184, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( A2082DevEstFec, "99/99/99"), 503, Gx_line+167, 562, Gx_line+184, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+217) ;
            if ( A2520DevEstEnv == 0 )
            {
               h6IN0( false, 83) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Lit3, "")), 7, Gx_line+0, 74, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 80, Gx_line+0, 125, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 131, Gx_line+0, 351, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A260CliDom, "")), 131, Gx_line+17, 380, Gx_line+34, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A256CliCp, "")), 131, Gx_line+33, 176, Gx_line+50, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A295CliPob, "")), 182, Gx_line+33, 402, Gx_line+50, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A787PrvDsc, "@!")), 131, Gx_line+50, 351, Gx_line+67, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+83) ;
            }
            else
            {
               if ( (0==AV16ProceCod) )
               {
                  h6IN0( false, 67) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Lit3, "")), 0, Gx_line+0, 67, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A970ProceCod), "ZZZ9")), 66, Gx_line+0, 96, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A971ProceNom, "")), 102, Gx_line+0, 322, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39Lit13, "")), 335, Gx_line+0, 438, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 445, Gx_line+0, 665, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A994ProceDom, "")), 102, Gx_line+17, 351, Gx_line+34, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A260CliDom, "")), 445, Gx_line+17, 694, Gx_line+34, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A989PoceCp, "")), 102, Gx_line+33, 147, Gx_line+50, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A988ProcePob, "")), 153, Gx_line+33, 373, Gx_line+50, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A256CliCp, "")), 445, Gx_line+33, 490, Gx_line+50, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A295CliPob, "")), 489, Gx_line+33, 709, Gx_line+50, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A787PrvDsc, "@!")), 102, Gx_line+50, 322, Gx_line+67, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A787PrvDsc, "@!")), 445, Gx_line+50, 665, Gx_line+67, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+67) ;
               }
               else
               {
                  AV19EmprCod = A396EmprCod ;
                  /* Execute user subroutine: 'PROCEDE' */
                  S111 ();
                  if ( returnInSub )
                  {
                     pr_default.close(1);
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
                  h6IN0( false, 67) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Lit3, "")), 0, Gx_line+0, 67, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV16ProceCod), "ZZZ9")), 66, Gx_line+0, 96, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18ProceNom, "")), 102, Gx_line+0, 322, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39Lit13, "")), 335, Gx_line+0, 438, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 445, Gx_line+0, 665, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40ProceDom, "")), 102, Gx_line+17, 351, Gx_line+34, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A260CliDom, "")), 445, Gx_line+17, 694, Gx_line+34, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41ProceCp, "")), 102, Gx_line+33, 147, Gx_line+50, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42ProcePob, "")), 153, Gx_line+33, 373, Gx_line+50, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A256CliCp, "")), 445, Gx_line+33, 490, Gx_line+50, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A295CliPob, "")), 489, Gx_line+33, 709, Gx_line+50, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43ProcePrv, "@!")), 102, Gx_line+50, 322, Gx_line+67, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A787PrvDsc, "@!")), 445, Gx_line+50, 665, Gx_line+67, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+67) ;
               }
            }
            h6IN0( false, 150) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("------", 452, Gx_line+17, 497, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText("------", 561, Gx_line+17, 606, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26Lit6, "")), 496, Gx_line+17, 563, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("-----------------------------------------------------------------------------------", 7, Gx_line+50, 613, Gx_line+67, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24Lit4, "")), 15, Gx_line+33, 74, Gx_line+50, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25Lit5, "")), 160, Gx_line+33, 212, Gx_line+50, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29Lit9, "")), 452, Gx_line+33, 497, Gx_line+50, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30Lit10, "")), 561, Gx_line+33, 606, Gx_line+50, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("-----------------------------------------------------------------------------------", 7, Gx_line+117, 613, Gx_line+134, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1031EmpesCod, "")), 15, Gx_line+83, 133, Gx_line+100, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1032FonCod, "")), 160, Gx_line+83, 249, Gx_line+100, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2087DevEstUni, "ZZZZZZZ9.99")), 452, Gx_line+83, 533, Gx_line+100, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2085DevEstPie), "ZZZZZ9")), 561, Gx_line+83, 606, Gx_line+100, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+150) ;
            AV38Flag = (byte)(0) ;
            /* Using cursor P06IN4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A2080DevEstCod)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A2084DevEstObs = P06IN4_A2084DevEstObs[0] ;
               n2084DevEstObs = P06IN4_n2084DevEstObs[0] ;
               A2083DevEstLin = P06IN4_A2083DevEstLin[0] ;
               if ( (0==AV38Flag) )
               {
                  h6IN0( false, 17) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27Lit7, "")), 7, Gx_line+0, 103, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2084DevEstObs, "")), 109, Gx_line+0, 548, Gx_line+17, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+17) ;
                  AV38Flag = (byte)(1) ;
               }
               else
               {
                  h6IN0( false, 17) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2084DevEstObs, "")), 109, Gx_line+0, 548, Gx_line+17, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+17) ;
               }
               pr_default.readNext(2);
            }
            pr_default.close(2);
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6IN0( true, 0) ;
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
      /* 'PROCEDE' Routine */
      returnInSub = false ;
      AV18ProceNom = "" ;
      AV40ProceDom = "" ;
      AV42ProcePob = "" ;
      AV43ProcePrv = "" ;
      AV41ProceCp = "" ;
      /* Using cursor P06IN5 */
      pr_default.execute(3, new Object[] {AV19EmprCod, Short.valueOf(AV16ProceCod)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A781PrvCod = P06IN5_A781PrvCod[0] ;
         n781PrvCod = P06IN5_n781PrvCod[0] ;
         A970ProceCod = P06IN5_A970ProceCod[0] ;
         n970ProceCod = P06IN5_n970ProceCod[0] ;
         A971ProceNom = P06IN5_A971ProceNom[0] ;
         n971ProceNom = P06IN5_n971ProceNom[0] ;
         A994ProceDom = P06IN5_A994ProceDom[0] ;
         n994ProceDom = P06IN5_n994ProceDom[0] ;
         A989PoceCp = P06IN5_A989PoceCp[0] ;
         n989PoceCp = P06IN5_n989PoceCp[0] ;
         A988ProcePob = P06IN5_A988ProcePob[0] ;
         n988ProcePob = P06IN5_n988ProcePob[0] ;
         A787PrvDsc = P06IN5_A787PrvDsc[0] ;
         n787PrvDsc = P06IN5_n787PrvDsc[0] ;
         A787PrvDsc = P06IN5_A787PrvDsc[0] ;
         n787PrvDsc = P06IN5_n787PrvDsc[0] ;
         AV18ProceNom = A971ProceNom ;
         AV40ProceDom = A994ProceDom ;
         AV41ProceCp = A989PoceCp ;
         AV42ProcePob = A988ProcePob ;
         AV43ProcePrv = A787PrvDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
   }

   public void h6IN0( boolean bFoot ,
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
      this.aP0[0] = rdevges.this.A396EmprCod;
      this.aP1[0] = rdevges.this.A2080DevEstCod;
      this.aP2[0] = rdevges.this.AV15ImpCod;
      this.aP3[0] = rdevges.this.AV16ProceCod;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV20Lit0 = "" ;
      AV21Lit1 = "" ;
      AV22Lit2 = "" ;
      AV23Lit3 = "" ;
      AV24Lit4 = "" ;
      AV25Lit5 = "" ;
      AV26Lit6 = "" ;
      AV27Lit7 = "" ;
      AV28Lit8 = "" ;
      AV29Lit9 = "" ;
      AV30Lit10 = "" ;
      AV39Lit13 = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      scmdbuf = "" ;
      P06IN2_A396EmprCod = new String[] {""} ;
      P06IN2_A407EmprNom = new String[] {""} ;
      P06IN2_n407EmprNom = new boolean[] {false} ;
      P06IN2_A404EmprDir = new String[] {""} ;
      P06IN2_n404EmprDir = new boolean[] {false} ;
      P06IN2_A409EmprTel = new String[] {""} ;
      P06IN2_n409EmprTel = new boolean[] {false} ;
      P06IN2_A405EmprFax = new String[] {""} ;
      P06IN2_n405EmprFax = new boolean[] {false} ;
      P06IN2_A403EmprCpo = new String[] {""} ;
      P06IN2_n403EmprCpo = new boolean[] {false} ;
      P06IN2_A408EmprPob = new String[] {""} ;
      P06IN2_n408EmprPob = new boolean[] {false} ;
      A407EmprNom = "" ;
      A404EmprDir = "" ;
      A409EmprTel = "" ;
      A405EmprFax = "" ;
      A403EmprCpo = "" ;
      A408EmprPob = "" ;
      AV17NomEmp = "" ;
      AV33DomEmp = "" ;
      AV34TelEmp = "" ;
      AV35FaxEmp = "" ;
      AV36CpEmp = "" ;
      AV37PobEmp = "" ;
      P06IN3_A781PrvCod = new short[1] ;
      P06IN3_n781PrvCod = new boolean[] {false} ;
      P06IN3_A396EmprCod = new String[] {""} ;
      P06IN3_A2080DevEstCod = new int[1] ;
      P06IN3_A2082DevEstFec = new java.util.Date[] {GXutil.nullDate()} ;
      P06IN3_n2082DevEstFec = new boolean[] {false} ;
      P06IN3_A2520DevEstEnv = new byte[1] ;
      P06IN3_n2520DevEstEnv = new boolean[] {false} ;
      P06IN3_A787PrvDsc = new String[] {""} ;
      P06IN3_n787PrvDsc = new boolean[] {false} ;
      P06IN3_A295CliPob = new String[] {""} ;
      P06IN3_A256CliCp = new String[] {""} ;
      P06IN3_A260CliDom = new String[] {""} ;
      P06IN3_A279CliNom = new String[] {""} ;
      P06IN3_A252CliCod = new int[1] ;
      P06IN3_n252CliCod = new boolean[] {false} ;
      P06IN3_A988ProcePob = new String[] {""} ;
      P06IN3_n988ProcePob = new boolean[] {false} ;
      P06IN3_A989PoceCp = new String[] {""} ;
      P06IN3_n989PoceCp = new boolean[] {false} ;
      P06IN3_A994ProceDom = new String[] {""} ;
      P06IN3_n994ProceDom = new boolean[] {false} ;
      P06IN3_A971ProceNom = new String[] {""} ;
      P06IN3_n971ProceNom = new boolean[] {false} ;
      P06IN3_A970ProceCod = new short[1] ;
      P06IN3_n970ProceCod = new boolean[] {false} ;
      P06IN3_A2085DevEstPie = new int[1] ;
      P06IN3_n2085DevEstPie = new boolean[] {false} ;
      P06IN3_A2087DevEstUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06IN3_n2087DevEstUni = new boolean[] {false} ;
      P06IN3_A1032FonCod = new String[] {""} ;
      P06IN3_n1032FonCod = new boolean[] {false} ;
      P06IN3_A1031EmpesCod = new String[] {""} ;
      P06IN3_n1031EmpesCod = new boolean[] {false} ;
      A2082DevEstFec = GXutil.nullDate() ;
      A787PrvDsc = "" ;
      A295CliPob = "" ;
      A256CliCp = "" ;
      A260CliDom = "" ;
      A279CliNom = "" ;
      A988ProcePob = "" ;
      A989PoceCp = "" ;
      A994ProceDom = "" ;
      A971ProceNom = "" ;
      A2087DevEstUni = DecimalUtil.ZERO ;
      A1032FonCod = "" ;
      A1031EmpesCod = "" ;
      AV19EmprCod = "" ;
      AV18ProceNom = "" ;
      AV40ProceDom = "" ;
      AV41ProceCp = "" ;
      AV42ProcePob = "" ;
      AV43ProcePrv = "" ;
      P06IN4_A396EmprCod = new String[] {""} ;
      P06IN4_A2080DevEstCod = new int[1] ;
      P06IN4_A2084DevEstObs = new String[] {""} ;
      P06IN4_n2084DevEstObs = new boolean[] {false} ;
      P06IN4_A2083DevEstLin = new short[1] ;
      A2084DevEstObs = "" ;
      P06IN5_A781PrvCod = new short[1] ;
      P06IN5_n781PrvCod = new boolean[] {false} ;
      P06IN5_A970ProceCod = new short[1] ;
      P06IN5_n970ProceCod = new boolean[] {false} ;
      P06IN5_A396EmprCod = new String[] {""} ;
      P06IN5_A971ProceNom = new String[] {""} ;
      P06IN5_n971ProceNom = new boolean[] {false} ;
      P06IN5_A994ProceDom = new String[] {""} ;
      P06IN5_n994ProceDom = new boolean[] {false} ;
      P06IN5_A989PoceCp = new String[] {""} ;
      P06IN5_n989PoceCp = new boolean[] {false} ;
      P06IN5_A988ProcePob = new String[] {""} ;
      P06IN5_n988ProcePob = new boolean[] {false} ;
      P06IN5_A787PrvDsc = new String[] {""} ;
      P06IN5_n787PrvDsc = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rdevges__default(),
         new Object[] {
             new Object[] {
            P06IN2_A396EmprCod, P06IN2_A407EmprNom, P06IN2_n407EmprNom, P06IN2_A404EmprDir, P06IN2_n404EmprDir, P06IN2_A409EmprTel, P06IN2_n409EmprTel, P06IN2_A405EmprFax, P06IN2_n405EmprFax, P06IN2_A403EmprCpo,
            P06IN2_n403EmprCpo, P06IN2_A408EmprPob, P06IN2_n408EmprPob
            }
            , new Object[] {
            P06IN3_A781PrvCod, P06IN3_n781PrvCod, P06IN3_A396EmprCod, P06IN3_A2080DevEstCod, P06IN3_A2082DevEstFec, P06IN3_n2082DevEstFec, P06IN3_A2520DevEstEnv, P06IN3_n2520DevEstEnv, P06IN3_A787PrvDsc, P06IN3_n787PrvDsc,
            P06IN3_A295CliPob, P06IN3_A256CliCp, P06IN3_A260CliDom, P06IN3_A279CliNom, P06IN3_A252CliCod, P06IN3_n252CliCod, P06IN3_A988ProcePob, P06IN3_n988ProcePob, P06IN3_A989PoceCp, P06IN3_n989PoceCp,
            P06IN3_A994ProceDom, P06IN3_n994ProceDom, P06IN3_A971ProceNom, P06IN3_n971ProceNom, P06IN3_A970ProceCod, P06IN3_n970ProceCod, P06IN3_A2085DevEstPie, P06IN3_n2085DevEstPie, P06IN3_A2087DevEstUni, P06IN3_n2087DevEstUni,
            P06IN3_A1032FonCod, P06IN3_n1032FonCod, P06IN3_A1031EmpesCod, P06IN3_n1031EmpesCod
            }
            , new Object[] {
            P06IN4_A396EmprCod, P06IN4_A2080DevEstCod, P06IN4_A2084DevEstObs, P06IN4_n2084DevEstObs, P06IN4_A2083DevEstLin
            }
            , new Object[] {
            P06IN5_A781PrvCod, P06IN5_n781PrvCod, P06IN5_A970ProceCod, P06IN5_A396EmprCod, P06IN5_A971ProceNom, P06IN5_n971ProceNom, P06IN5_A994ProceDom, P06IN5_n994ProceDom, P06IN5_A989PoceCp, P06IN5_n989PoceCp,
            P06IN5_A988ProcePob, P06IN5_n988ProcePob, P06IN5_A787PrvDsc, P06IN5_n787PrvDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte A2520DevEstEnv ;
   private byte AV38Flag ;
   private short AV16ProceCod ;
   private short A781PrvCod ;
   private short A970ProceCod ;
   private short A2083DevEstLin ;
   private short Gx_err ;
   private int A2080DevEstCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A252CliCod ;
   private int A2085DevEstPie ;
   private int Gx_OldLine ;
   private java.math.BigDecimal A2087DevEstUni ;
   private String A396EmprCod ;
   private String AV15ImpCod ;
   private String AV20Lit0 ;
   private String AV21Lit1 ;
   private String AV22Lit2 ;
   private String AV23Lit3 ;
   private String AV24Lit4 ;
   private String AV25Lit5 ;
   private String AV26Lit6 ;
   private String AV27Lit7 ;
   private String AV28Lit8 ;
   private String AV29Lit9 ;
   private String AV30Lit10 ;
   private String AV39Lit13 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String A404EmprDir ;
   private String A409EmprTel ;
   private String A405EmprFax ;
   private String A403EmprCpo ;
   private String A408EmprPob ;
   private String AV17NomEmp ;
   private String AV33DomEmp ;
   private String AV34TelEmp ;
   private String AV35FaxEmp ;
   private String AV36CpEmp ;
   private String AV37PobEmp ;
   private String A787PrvDsc ;
   private String A295CliPob ;
   private String A256CliCp ;
   private String A260CliDom ;
   private String A279CliNom ;
   private String A988ProcePob ;
   private String A989PoceCp ;
   private String A994ProceDom ;
   private String A971ProceNom ;
   private String A1032FonCod ;
   private String A1031EmpesCod ;
   private String AV19EmprCod ;
   private String AV18ProceNom ;
   private String AV40ProceDom ;
   private String AV41ProceCp ;
   private String AV42ProcePob ;
   private String AV43ProcePrv ;
   private String A2084DevEstObs ;
   private java.util.Date A2082DevEstFec ;
   private boolean n407EmprNom ;
   private boolean n404EmprDir ;
   private boolean n409EmprTel ;
   private boolean n405EmprFax ;
   private boolean n403EmprCpo ;
   private boolean n408EmprPob ;
   private boolean n781PrvCod ;
   private boolean n2082DevEstFec ;
   private boolean n2520DevEstEnv ;
   private boolean n787PrvDsc ;
   private boolean n252CliCod ;
   private boolean n988ProcePob ;
   private boolean n989PoceCp ;
   private boolean n994ProceDom ;
   private boolean n971ProceNom ;
   private boolean n970ProceCod ;
   private boolean n2085DevEstPie ;
   private boolean n2087DevEstUni ;
   private boolean n1032FonCod ;
   private boolean n1031EmpesCod ;
   private boolean returnInSub ;
   private boolean n2084DevEstObs ;
   private short[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P06IN2_A396EmprCod ;
   private String[] P06IN2_A407EmprNom ;
   private boolean[] P06IN2_n407EmprNom ;
   private String[] P06IN2_A404EmprDir ;
   private boolean[] P06IN2_n404EmprDir ;
   private String[] P06IN2_A409EmprTel ;
   private boolean[] P06IN2_n409EmprTel ;
   private String[] P06IN2_A405EmprFax ;
   private boolean[] P06IN2_n405EmprFax ;
   private String[] P06IN2_A403EmprCpo ;
   private boolean[] P06IN2_n403EmprCpo ;
   private String[] P06IN2_A408EmprPob ;
   private boolean[] P06IN2_n408EmprPob ;
   private short[] P06IN3_A781PrvCod ;
   private boolean[] P06IN3_n781PrvCod ;
   private String[] P06IN3_A396EmprCod ;
   private int[] P06IN3_A2080DevEstCod ;
   private java.util.Date[] P06IN3_A2082DevEstFec ;
   private boolean[] P06IN3_n2082DevEstFec ;
   private byte[] P06IN3_A2520DevEstEnv ;
   private boolean[] P06IN3_n2520DevEstEnv ;
   private String[] P06IN3_A787PrvDsc ;
   private boolean[] P06IN3_n787PrvDsc ;
   private String[] P06IN3_A295CliPob ;
   private String[] P06IN3_A256CliCp ;
   private String[] P06IN3_A260CliDom ;
   private String[] P06IN3_A279CliNom ;
   private int[] P06IN3_A252CliCod ;
   private boolean[] P06IN3_n252CliCod ;
   private String[] P06IN3_A988ProcePob ;
   private boolean[] P06IN3_n988ProcePob ;
   private String[] P06IN3_A989PoceCp ;
   private boolean[] P06IN3_n989PoceCp ;
   private String[] P06IN3_A994ProceDom ;
   private boolean[] P06IN3_n994ProceDom ;
   private String[] P06IN3_A971ProceNom ;
   private boolean[] P06IN3_n971ProceNom ;
   private short[] P06IN3_A970ProceCod ;
   private boolean[] P06IN3_n970ProceCod ;
   private int[] P06IN3_A2085DevEstPie ;
   private boolean[] P06IN3_n2085DevEstPie ;
   private java.math.BigDecimal[] P06IN3_A2087DevEstUni ;
   private boolean[] P06IN3_n2087DevEstUni ;
   private String[] P06IN3_A1032FonCod ;
   private boolean[] P06IN3_n1032FonCod ;
   private String[] P06IN3_A1031EmpesCod ;
   private boolean[] P06IN3_n1031EmpesCod ;
   private String[] P06IN4_A396EmprCod ;
   private int[] P06IN4_A2080DevEstCod ;
   private String[] P06IN4_A2084DevEstObs ;
   private boolean[] P06IN4_n2084DevEstObs ;
   private short[] P06IN4_A2083DevEstLin ;
   private short[] P06IN5_A781PrvCod ;
   private boolean[] P06IN5_n781PrvCod ;
   private short[] P06IN5_A970ProceCod ;
   private boolean[] P06IN5_n970ProceCod ;
   private String[] P06IN5_A396EmprCod ;
   private String[] P06IN5_A971ProceNom ;
   private boolean[] P06IN5_n971ProceNom ;
   private String[] P06IN5_A994ProceDom ;
   private boolean[] P06IN5_n994ProceDom ;
   private String[] P06IN5_A989PoceCp ;
   private boolean[] P06IN5_n989PoceCp ;
   private String[] P06IN5_A988ProcePob ;
   private boolean[] P06IN5_n988ProcePob ;
   private String[] P06IN5_A787PrvDsc ;
   private boolean[] P06IN5_n787PrvDsc ;
}

final  class rdevges__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06IN2", "SELECT EmprCod, EmprNom, EmprDir, EmprTel, EmprFax, EmprCpo, EmprPob FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06IN3", "SELECT T2.PrvCod, T1.EmprCod, T1.DevEstCod, T1.DevEstFec, T1.DevEstEnv, T3.PrvDsc, T2.CliPob, T2.CliCp, T2.CliDom, T2.CliNom, T1.CliCod, T5.ProcePob, T5.PoceCp, T5.ProceDom, T5.ProceNom, T4.ProceCod, T1.DevEstPie, T1.DevEstUni, T1.FonCod, T1.EmpesCod FROM ((((TXPDEVEST T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN TXPPROVIN T3 ON T3.PrvCod = T2.PrvCod) LEFT JOIN TXPCEMPES T4 ON T4.EmprCod = T1.EmprCod AND T4.EmpesCod = T1.EmpesCod AND T4.CliCod = T1.CliCod AND T4.FonCod = T1.FonCod) LEFT JOIN TXPPROCED T5 ON T5.EmprCod = T1.EmprCod AND T5.ProceCod = T4.ProceCod) WHERE T1.EmprCod = ? and T1.DevEstCod = ? ORDER BY T1.EmprCod, T1.DevEstCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06IN4", "SELECT EmprCod, DevEstCod, DevEstObs, DevEstLin FROM TXPDEVOBE WHERE EmprCod = ? and DevEstCod = ? ORDER BY EmprCod, DevEstCod, DevEstLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06IN5", "SELECT T1.PrvCod, T1.ProceCod, T1.EmprCod, T1.ProceNom, T1.ProceDom, T1.PoceCp, T1.ProcePob, T2.PrvDsc FROM (TXPPROCED T1 LEFT JOIN TXPPROVIN T2 ON T2.PrvCod = T1.PrvCod) WHERE T1.EmprCod = ? and T1.ProceCod = ? ORDER BY T1.EmprCod, T1.ProceCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 30);
               ((String[]) buf[11])[0] = rslt.getString(8, 6);
               ((String[]) buf[12])[0] = rslt.getString(9, 34);
               ((String[]) buf[13])[0] = rslt.getString(10, 30);
               ((int[]) buf[14])[0] = rslt.getInt(11);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(13, 6);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(14, 34);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(15, 30);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((short[]) buf[24])[0] = rslt.getShort(16);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((int[]) buf[26])[0] = rslt.getInt(17);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(19, 12);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(20, 16);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 34);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
      }
   }

}

