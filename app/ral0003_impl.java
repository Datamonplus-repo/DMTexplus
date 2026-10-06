package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ral0003_impl extends GXWebReport
{
   public ral0003_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public void webExecute( )
   {
      if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
      {
         gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", httpContext.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(httpContext.getHttpSecure( ))) ;
      }
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      entryPointCalled = false ;
      gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( ! entryPointCalled )
      {
         A396EmprCod = gxfirstwebparm ;
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV15ImpCod = httpContext.GetPar( "ImpCod") ;
            AV16Prio = httpContext.GetPar( "Prio") ;
            AV17PCliCod = (int)(GXutil.lval( httpContext.GetPar( "PCliCod"))) ;
            AV18UCliCod = (int)(GXutil.lval( httpContext.GetPar( "UCliCod"))) ;
            AV19PFecha = localUtil.parseDateParm( httpContext.GetPar( "PFecha")) ;
            AV20UFecha = localUtil.parseDateParm( httpContext.GetPar( "UFecha")) ;
            AV62PBarSer = httpContext.GetPar( "PBarSer") ;
            AV63UBarSer = httpContext.GetPar( "UBarSer") ;
            AV125AlbEncCli = httpContext.GetPar( "AlbEncCli") ;
            AV126AlbEncCli_to = httpContext.GetPar( "AlbEncCli_to") ;
            AV48Fuente = (byte)(GXutil.lval( httpContext.GetPar( "Fuente"))) ;
            AV70Barcodi = (int)(GXutil.lval( httpContext.GetPar( "Barcodi"))) ;
            AV71Barcodreof = (byte)(GXutil.lval( httpContext.GetPar( "Barcodreof"))) ;
            AV72Barcodparf = httpContext.GetPar( "Barcodparf") ;
            AV73Barcolnomi = httpContext.GetPar( "Barcolnomi") ;
            AV74Barcolnomf = httpContext.GetPar( "Barcolnomf") ;
            AV75Barcolnumi = (int)(GXutil.lval( httpContext.GetPar( "Barcolnumi"))) ;
            AV76Barcolnumf = (int)(GXutil.lval( httpContext.GetPar( "Barcolnumf"))) ;
            AV88BarMaqEst1 = httpContext.GetPar( "BarMaqEst1") ;
            AV89BarMaqEst2 = httpContext.GetPar( "BarMaqEst2") ;
            AV90Serie = httpContext.GetPar( "Serie") ;
            AV99Nfi = (int)(GXutil.lval( httpContext.GetPar( "Nfi"))) ;
            AV100Nff = (int)(GXutil.lval( httpContext.GetPar( "Nff"))) ;
            AV103Barlar = httpContext.GetPar( "Barlar") ;
            AV116Tipdiscod = httpContext.GetPar( "Tipdiscod") ;
            AV117Barestreo = (byte)(GXutil.lval( httpContext.GetPar( "Barestreo"))) ;
            AV121DetalleRollos = (byte)(GXutil.lval( httpContext.GetPar( "DetalleRollos"))) ;
         }
      }
      if ( toggleJsOutput )
      {
      }
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      M_top = 0 ;
      M_bot = 3 ;
      P_lines = (int)(66-M_bot) ;
      getPrinter().GxClearAttris() ;
      add_metrics( ) ;
      lineHeight = 15 ;
      PrtOffset = 0 ;
      gxXPage = 100 ;
      gxYPage = 100 ;
      getPrinter().GxSetDocName("") ;
      try
      {
         Gx_out = "SCR" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 2, 9, 11909, 16834, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*3)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXt_char1 = AV25Lit0 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2240_", ""), (byte)(99), GXv_char2) ;
         ral0003_impl.this.GXt_char1 = GXv_char2[0] ;
         AV25Lit0 = GXt_char1 ;
         GXt_char1 = AV26Lit1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         ral0003_impl.this.GXt_char1 = GXv_char2[0] ;
         AV26Lit1 = GXt_char1 ;
         GXt_char1 = AV27Lit2 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char2) ;
         ral0003_impl.this.GXt_char1 = GXv_char2[0] ;
         AV27Lit2 = GXt_char1 ;
         GXt_char1 = AV28Lit3 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char2) ;
         ral0003_impl.this.GXt_char1 = GXv_char2[0] ;
         AV28Lit3 = GXt_char1 ;
         GXt_char1 = AV29Lit4 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2097_", ""), (byte)(99), GXv_char2) ;
         ral0003_impl.this.GXt_char1 = GXv_char2[0] ;
         AV29Lit4 = GXt_char1 ;
         GXt_char1 = AV30Lit5 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2187_", ""), (byte)(99), GXv_char2) ;
         ral0003_impl.this.GXt_char1 = GXv_char2[0] ;
         AV30Lit5 = GXt_char1 ;
         GXt_char1 = AV31Lit6 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1040_", ""), (byte)(99), GXv_char2) ;
         ral0003_impl.this.GXt_char1 = GXv_char2[0] ;
         AV31Lit6 = GXt_char1 ;
         GXt_char1 = AV32Lit7 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN389_", ""), (byte)(99), GXv_char2) ;
         ral0003_impl.this.GXt_char1 = GXv_char2[0] ;
         AV32Lit7 = GXt_char1 ;
         GXt_char1 = AV33Lit8 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1355_", ""), (byte)(99), GXv_char2) ;
         ral0003_impl.this.GXt_char1 = GXv_char2[0] ;
         AV33Lit8 = GXt_char1 ;
         GXt_char1 = AV34Lit9 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN310_", ""), (byte)(99), GXv_char2) ;
         ral0003_impl.this.GXt_char1 = GXv_char2[0] ;
         AV34Lit9 = GXt_char1 ;
         GXt_char1 = AV35Lit10 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2301_", ""), (byte)(99), GXv_char2) ;
         ral0003_impl.this.GXt_char1 = GXv_char2[0] ;
         AV35Lit10 = GXt_char1 ;
         GXt_char1 = AV36Lit11 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN387_", ""), (byte)(99), GXv_char2) ;
         ral0003_impl.this.GXt_char1 = GXv_char2[0] ;
         AV36Lit11 = GXt_char1 ;
         GXt_char1 = AV37Lit12 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN386_", ""), (byte)(99), GXv_char2) ;
         ral0003_impl.this.GXt_char1 = GXv_char2[0] ;
         AV37Lit12 = GXt_char1 ;
         GXt_char1 = AV38Lit13 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$KILOS", ""), (byte)(99), GXv_char2) ;
         ral0003_impl.this.GXt_char1 = GXv_char2[0] ;
         AV38Lit13 = GXt_char1 ;
         GXt_char1 = AV39Lit14 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$METROS", ""), (byte)(99), GXv_char2) ;
         ral0003_impl.this.GXt_char1 = GXv_char2[0] ;
         AV39Lit14 = GXt_char1 ;
         GXt_char1 = AV40Lit15 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1498_", ""), (byte)(99), GXv_char2) ;
         ral0003_impl.this.GXt_char1 = GXv_char2[0] ;
         AV40Lit15 = GXt_char1 ;
         GXt_char1 = AV41Lit16 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1388_", ""), (byte)(99), GXv_char2) ;
         ral0003_impl.this.GXt_char1 = GXv_char2[0] ;
         AV41Lit16 = GXt_char1 ;
         GXt_char1 = AV46Lit17 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN206_", ""), (byte)(99), GXv_char2) ;
         ral0003_impl.this.GXt_char1 = GXv_char2[0] ;
         AV46Lit17 = GXt_char1 ;
         GXt_char1 = AV47Lit18 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN323_", ""), (byte)(99), GXv_char2) ;
         ral0003_impl.this.GXt_char1 = GXv_char2[0] ;
         AV47Lit18 = GXt_char1 ;
         GXt_char1 = AV58Lit21 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         ral0003_impl.this.GXt_char1 = GXv_char2[0] ;
         AV58Lit21 = GXt_char1 ;
         AV52Lit19 = "" ;
         AV53Lit20 = "" ;
         AV84Lit22 = "" ;
         GXt_char1 = AV92Lit23 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT40_", ""), (byte)(99), GXv_char2) ;
         ral0003_impl.this.GXt_char1 = GXv_char2[0] ;
         AV92Lit23 = GXt_char1 ;
         GXt_char1 = AV96Lit31 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$KG", ""), (byte)(99), GXv_char2) ;
         ral0003_impl.this.GXt_char1 = GXv_char2[0] ;
         AV96Lit31 = GXt_char1 + httpContext.getMessage( " Cru", "") ;
         GXt_char1 = AV124Litkg ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$KILOS", ""), (byte)(99), GXv_char2) ;
         ral0003_impl.this.GXt_char1 = GXv_char2[0] ;
         AV124Litkg = GXt_char1 ;
         AV124Litkg += httpContext.getMessage( " Cru", "") ;
         AV59FlagTtx = (byte)(0) ;
         GXt_int3 = AV67Kohler ;
         GXv_int4[0] = GXt_int3 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "KOHLER", ""), GXv_int4) ;
         ral0003_impl.this.GXt_int3 = GXv_int4[0] ;
         AV67Kohler = GXt_int3 ;
         AV51FlagPT = (byte)(0) ;
         GXv_int4[0] = AV51FlagPT ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PIETRZ", ""), GXv_int4) ;
         ral0003_impl.this.AV51FlagPT = GXv_int4[0] ;
         GXt_int3 = AV78Salayet ;
         GXv_int4[0] = GXt_int3 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "SALAYE", ""), GXv_int4) ;
         ral0003_impl.this.GXt_int3 = GXv_int4[0] ;
         AV78Salayet = GXt_int3 ;
         GXt_int3 = AV79PLinea ;
         GXv_int4[0] = GXt_int3 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PLINEA", ""), GXv_int4) ;
         ral0003_impl.this.GXt_int3 = GXv_int4[0] ;
         AV79PLinea = GXt_int3 ;
         GXt_int3 = AV85Tintex ;
         GXv_int4[0] = GXt_int3 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TINTEX", ""), GXv_int4) ;
         ral0003_impl.this.GXt_int3 = GXv_int4[0] ;
         AV85Tintex = GXt_int3 ;
         GXt_int3 = AV93Moda21 ;
         GXv_int4[0] = GXt_int3 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int4) ;
         ral0003_impl.this.GXt_int3 = GXv_int4[0] ;
         AV93Moda21 = GXt_int3 ;
         GXt_int3 = AV97Coloretto ;
         GXv_int4[0] = GXt_int3 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "COLORE", ""), GXv_int4) ;
         ral0003_impl.this.GXt_int3 = GXv_int4[0] ;
         AV97Coloretto = GXt_int3 ;
         GXt_int3 = AV98Staack ;
         GXv_int4[0] = GXt_int3 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "STAACK", ""), GXv_int4) ;
         ral0003_impl.this.GXt_int3 = GXv_int4[0] ;
         AV98Staack = GXt_int3 ;
         GXt_int3 = AV107Fatelca ;
         GXv_int4[0] = GXt_int3 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FATELC", ""), GXv_int4) ;
         ral0003_impl.this.GXt_int3 = GXv_int4[0] ;
         AV107Fatelca = GXt_int3 ;
         GXt_int3 = AV109Termilenio ;
         GXv_int4[0] = GXt_int3 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TERMIL", ""), GXv_int4) ;
         ral0003_impl.this.GXt_int3 = GXv_int4[0] ;
         AV109Termilenio = GXt_int3 ;
         if ( AV109Termilenio == 1 )
         {
            AV96Lit31 = httpContext.getMessage( "K Fact", "") ;
         }
         if ( AV51FlagPT == 1 )
         {
            GXt_char1 = AV52Lit19 ;
            GXv_char2[0] = GXt_char1 ;
            new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGINGPIE02", ""), (byte)(99), GXv_char2) ;
            ral0003_impl.this.GXt_char1 = GXv_char2[0] ;
            AV52Lit19 = GXt_char1 ;
            AV53Lit20 = "------" ;
         }
         /* Using cursor P06LV2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P06LV2_A407EmprNom[0] ;
            n407EmprNom = P06LV2_n407EmprNom[0] ;
            AV44NomEmp = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV118TipDisDsc = httpContext.getMessage( "Todo", "") ;
         /* Using cursor P06LV3 */
         pr_default.execute(1, new Object[] {A396EmprCod, AV116Tipdiscod});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A5098TipDisCod = P06LV3_A5098TipDisCod[0] ;
            A5097TipDisDsc = P06LV3_A5097TipDisDsc[0] ;
            n5097TipDisDsc = P06LV3_n5097TipDisDsc[0] ;
            AV118TipDisDsc = A5097TipDisDsc ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         AV119TipProd = httpContext.getMessage( "Todo", "") ;
         if ( AV117Barestreo == 0 )
         {
            AV119TipProd = httpContext.getMessage( "Prod Normal", "") ;
         }
         else if ( AV117Barestreo == 1 )
         {
            AV119TipProd = httpContext.getMessage( "Prod Ri", "") ;
         }
         else if ( AV117Barestreo == 2 )
         {
            AV119TipProd = httpContext.getMessage( "Prod Re", "") ;
         }
         AV21TotKil = DecimalUtil.doubleToDec(0) ;
         AV22TotMet = DecimalUtil.doubleToDec(0) ;
         AV49TotPie = 0 ;
         AV54TotTrz = 0 ;
         AV81TotKilDis = DecimalUtil.doubleToDec(0) ;
         AV80TotMetDis = DecimalUtil.doubleToDec(0) ;
         AV122Barestreoi = (byte)(0) ;
         AV123BarEstreof = (byte)(2) ;
         if ( AV117Barestreo == 2 )
         {
            AV122Barestreoi = (byte)(2) ;
            AV123BarEstreof = (byte)(2) ;
         }
         if ( AV117Barestreo == 0 )
         {
            AV122Barestreoi = (byte)(0) ;
            AV123BarEstreof = (byte)(1) ;
         }
         /* Using cursor P06LV4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV17PCliCod), AV19PFecha, AV20UFecha, AV16Prio, AV16Prio, Integer.valueOf(AV99Nfi), Integer.valueOf(AV100Nff), Integer.valueOf(AV18UCliCod)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            brk6LV5 = false ;
            A840TrnCod = P06LV4_A840TrnCod[0] ;
            A30AlbProCod = P06LV4_A30AlbProCod[0] ;
            A1243GuiRemCli = P06LV4_A1243GuiRemCli[0] ;
            A3869AlbCliDes = P06LV4_A3869AlbCliDes[0] ;
            A39AlbProPri = P06LV4_A39AlbProPri[0] ;
            A34AlbProfch = P06LV4_A34AlbProfch[0] ;
            A841TrnNom = P06LV4_A841TrnNom[0] ;
            n841TrnNom = P06LV4_n841TrnNom[0] ;
            A841TrnNom = P06LV4_A841TrnNom[0] ;
            n841TrnNom = P06LV4_n841TrnNom[0] ;
            AV43CliCod = A1243GuiRemCli ;
            AV102TrnNom = A841TrnNom ;
            /* Execute user subroutine: 'CLIENTE' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(2);
               pr_default.close(2);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P06LV4_A396EmprCod[0], A396EmprCod) == 0 ) && ( P06LV4_A1243GuiRemCli[0] == A1243GuiRemCli ) )
            {
               brk6LV5 = false ;
               A30AlbProCod = P06LV4_A30AlbProCod[0] ;
               A3869AlbCliDes = P06LV4_A3869AlbCliDes[0] ;
               A39AlbProPri = P06LV4_A39AlbProPri[0] ;
               A34AlbProfch = P06LV4_A34AlbProfch[0] ;
               if ( (( GXutil.resetTime(A34AlbProfch).before( GXutil.resetTime( AV20UFecha )) ) || ( GXutil.dateCompare(GXutil.resetTime(A34AlbProfch), GXutil.resetTime(AV20UFecha)) )) )
               {
                  if ( (( GXutil.resetTime(A34AlbProfch).after( GXutil.resetTime( AV19PFecha )) ) || ( GXutil.dateCompare(GXutil.resetTime(A34AlbProfch), GXutil.resetTime(AV19PFecha)) )) )
                  {
                     if ( ( GXutil.strcmp(A39AlbProPri, AV16Prio) == 0 ) || ( GXutil.strcmp(AV16Prio, "2") == 0 ) )
                     {
                        if ( ( A3869AlbCliDes >= AV99Nfi ) && ( A3869AlbCliDes <= AV100Nff ) )
                        {
                           AV91Serie2 = "%" + AV90Serie ;
                           AV108CliCoddest = A3869AlbCliDes ;
                           lV91Serie2 = GXutil.padr( GXutil.rtrim( AV91Serie2), 16, "%") ;
                           /* Using cursor P06LV6 */
                           pr_default.execute(3, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), AV62PBarSer, AV63UBarSer, AV90Serie, lV91Serie2, AV90Serie, AV73Barcolnomi, AV74Barcolnomf, Integer.valueOf(AV75Barcolnumi), Integer.valueOf(AV76Barcolnumf), Integer.valueOf(AV70Barcodi), Integer.valueOf(AV70Barcodi), Byte.valueOf(AV71Barcodreof), Byte.valueOf(AV71Barcodreof), AV72Barcodparf, AV72Barcodparf, AV88BarMaqEst1, AV88BarMaqEst1, Byte.valueOf(AV85Tintex), Byte.valueOf(AV85Tintex), AV89BarMaqEst2, AV89BarMaqEst2, Byte.valueOf(AV85Tintex), Byte.valueOf(AV85Tintex), AV103Barlar, AV103Barlar, Byte.valueOf(AV122Barestreoi), Byte.valueOf(AV123BarEstreof), AV116Tipdiscod, AV116Tipdiscod});
                           while ( (pr_default.getStatus(3) != 101) )
                           {
                              A130BarCodPar = P06LV6_A130BarCodPar[0] ;
                              A132BarCodReo = P06LV6_A132BarCodReo[0] ;
                              A129BarCod = P06LV6_A129BarCod[0] ;
                              A2010BarTipDis = P06LV6_A2010BarTipDis[0] ;
                              A148BarEstReo = P06LV6_A148BarEstReo[0] ;
                              A206BarPle = P06LV6_A206BarPle[0] ;
                              A7733BarMaqEst = P06LV6_A7733BarMaqEst[0] ;
                              A136BarColNum = P06LV6_A136BarColNum[0] ;
                              A135BarColNom = P06LV6_A135BarColNom[0] ;
                              A212BarSer = P06LV6_A212BarSer[0] ;
                              A1261BarAlbKgmE = P06LV6_A1261BarAlbKgmE[0] ;
                              A1263BarAlbMtrE = P06LV6_A1263BarAlbMtrE[0] ;
                              A2243BarKgsCli = P06LV6_A2243BarKgsCli[0] ;
                              n2243BarKgsCli = P06LV6_n2243BarKgsCli[0] ;
                              A1461BarAlbPN = P06LV6_A1461BarAlbPN[0] ;
                              A1265BarAlbPie = P06LV6_A1265BarAlbPie[0] ;
                              A1234BarNomCli = P06LV6_A1234BarNomCli[0] ;
                              A1235BarNumCli = P06LV6_A1235BarNumCli[0] ;
                              A1652BarSerDsc = P06LV6_A1652BarSerDsc[0] ;
                              A155BarFecCli = P06LV6_A155BarFecCli[0] ;
                              A166BarKgm = P06LV6_A166BarKgm[0] ;
                              A184BarMtr = P06LV6_A184BarMtr[0] ;
                              A143BarDisNum = P06LV6_A143BarDisNum[0] ;
                              A4812BarEncCli = P06LV6_A4812BarEncCli[0] ;
                              A2010BarTipDis = P06LV6_A2010BarTipDis[0] ;
                              A148BarEstReo = P06LV6_A148BarEstReo[0] ;
                              A206BarPle = P06LV6_A206BarPle[0] ;
                              A7733BarMaqEst = P06LV6_A7733BarMaqEst[0] ;
                              A136BarColNum = P06LV6_A136BarColNum[0] ;
                              A135BarColNom = P06LV6_A135BarColNom[0] ;
                              A212BarSer = P06LV6_A212BarSer[0] ;
                              A1234BarNomCli = P06LV6_A1234BarNomCli[0] ;
                              A1235BarNumCli = P06LV6_A1235BarNumCli[0] ;
                              A1652BarSerDsc = P06LV6_A1652BarSerDsc[0] ;
                              A155BarFecCli = P06LV6_A155BarFecCli[0] ;
                              A143BarDisNum = P06LV6_A143BarDisNum[0] ;
                              A4812BarEncCli = P06LV6_A4812BarEncCli[0] ;
                              A166BarKgm = P06LV6_A166BarKgm[0] ;
                              A184BarMtr = P06LV6_A184BarMtr[0] ;
                              GXt_char1 = A13878PedidoClie ;
                              GXv_char2[0] = A396EmprCod ;
                              GXv_char5[0] = A4812BarEncCli ;
                              GXv_char6[0] = A143BarDisNum ;
                              GXv_char7[0] = GXt_char1 ;
                              new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char2, GXv_char5, GXv_char6, GXv_char7) ;
                              ral0003_impl.this.A396EmprCod = GXv_char2[0] ;
                              ral0003_impl.this.A4812BarEncCli = GXv_char5[0] ;
                              ral0003_impl.this.A143BarDisNum = GXv_char6[0] ;
                              ral0003_impl.this.GXt_char1 = GXv_char7[0] ;
                              A13878PedidoClie = GXt_char1 ;
                              if ( ( GXutil.strcmp(A13878PedidoClie, AV125AlbEncCli) >= 0 ) && ( GXutil.strcmp(A13878PedidoClie, AV126AlbEncCli_to) <= 0 ) )
                              {
                                 if ( (0==A132BarCodReo) )
                                 {
                                    AV45BarNum = GXutil.str( A129BarCod, 8, 0) + "  " + A130BarCodPar ;
                                 }
                                 else
                                 {
                                    AV45BarNum = GXutil.str( A129BarCod, 8, 0) + " " + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
                                 }
                                 AV56Trozos = (short)(0) ;
                                 if ( AV51FlagPT == 1 )
                                 {
                                    /* Optimized group. */
                                    /* Using cursor P06LV7 */
                                    pr_default.execute(4, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                                    cV56Trozos = P06LV7_AV56Trozos[0] ;
                                    pr_default.close(4);
                                    AV56Trozos = (short)(AV56Trozos+cV56Trozos*1) ;
                                    /* End optimized group. */
                                 }
                                 AV94BarAlbKgmE = A1261BarAlbKgmE ;
                                 AV95BarAlbMtrE = A1263BarAlbMtrE ;
                                 if ( AV93Moda21 == 1 )
                                 {
                                    if ( A2243BarKgsCli.doubleValue() != 0 )
                                    {
                                       AV94BarAlbKgmE = A2243BarKgsCli ;
                                    }
                                    if ( A1461BarAlbPN.doubleValue() != 0 )
                                    {
                                       AV95BarAlbMtrE = A1461BarAlbPN ;
                                    }
                                 }
                                 AV23TotKilC = AV23TotKilC.add(AV94BarAlbKgmE) ;
                                 AV24TotMetC = AV24TotMetC.add(AV95BarAlbMtrE) ;
                                 AV50TotPieC = (int)(AV50TotPieC+A1265BarAlbPie) ;
                                 AV55TotTrzC = (short)(AV55TotTrzC+AV56Trozos) ;
                                 AV83TotKilCD = AV83TotKilCD.add(A166BarKgm) ;
                                 AV82TotMetCD = AV82TotMetCD.add(A184BarMtr) ;
                                 AV21TotKil = AV21TotKil.add(AV94BarAlbKgmE) ;
                                 AV22TotMet = AV22TotMet.add(AV95BarAlbMtrE) ;
                                 AV49TotPie = (int)(AV49TotPie+A1265BarAlbPie) ;
                                 AV54TotTrz = (int)(AV54TotTrz+AV56Trozos) ;
                                 AV81TotKilDis = AV81TotKilDis.add(A166BarKgm) ;
                                 AV80TotMetDis = AV80TotMetDis.add(A184BarMtr) ;
                                 if ( AV59FlagTtx == 0 )
                                 {
                                    AV60BarColNom = A135BarColNom ;
                                    AV61BarColNum = A136BarColNum ;
                                    AV77barNomcli = A1234BarNomCli ;
                                 }
                                 else
                                 {
                                    AV60BarColNom = A1234BarNomCli ;
                                    AV61BarColNum = A1235BarNumCli ;
                                    AV77barNomcli = " " ;
                                 }
                                 AV68Barser6 = GXutil.substring( A212BarSer, 1, 4) ;
                                 AV69BarSerDsc = GXutil.substring( A1652BarSerDsc, 1, 20) ;
                                 if ( AV66Client == 0 )
                                 {
                                    AV66Client = (byte)(1) ;
                                    h6LV0( false, 24) ;
                                    getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV43CliCod), "ZZZZZ9")), 100, Gx_line+2, 145, Gx_line+19, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42CliNom, "")), 151, Gx_line+2, 340, Gx_line+19, 0+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32Lit7, "")), 32, Gx_line+2, 83, Gx_line+19, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(":", 85, Gx_line+2, 93, Gx_line+19, 0+256, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+24) ;
                                 }
                                 if ( AV85Tintex == 1 )
                                 {
                                    AV86BarMaqEst = A7733BarMaqEst ;
                                    AV87LitBar = GXutil.trim( A206BarPle) ;
                                 }
                                 else
                                 {
                                    AV86BarMaqEst = "" ;
                                    AV87LitBar = "" ;
                                 }
                                 AV101BarKgm = A166BarKgm ;
                                 AV111Barcod = A129BarCod ;
                                 AV112BarCodreo = A132BarCodReo ;
                                 AV113Barcodpar = A130BarCodPar ;
                                 AV120ALbProcod = A30AlbProCod ;
                                 if ( AV109Termilenio == 1 )
                                 {
                                    AV114KgsT = DecimalUtil.doubleToDec(0) ;
                                    AV115MtsT = DecimalUtil.doubleToDec(0) ;
                                    /* Using cursor P06LV8 */
                                    pr_default.execute(5, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                                    while ( (pr_default.getStatus(5) != 101) )
                                    {
                                       A200BarPieCod = P06LV8_A200BarPieCod[0] ;
                                       AV110BarPiecod = A200BarPieCod ;
                                       /* Execute user subroutine: 'BARPIE' */
                                       S131 ();
                                       if ( returnInSub )
                                       {
                                          pr_default.close(5);
                                          pr_default.close(3);
                                          pr_default.close(3);
                                          pr_default.close(3);
                                          pr_default.close(2);
                                          pr_default.close(2);
                                          getPrinter().GxEndPage() ;
                                          /* Close printer file */
                                          getPrinter().GxEndDocument() ;
                                          endPrinter();
                                          returnInSub = true;
                                          cleanup();
                                          if (true) return;
                                       }
                                       pr_default.readNext(5);
                                    }
                                    pr_default.close(5);
                                    AV101BarKgm = AV114KgsT ;
                                 }
                                 if ( AV107Fatelca == 0 )
                                 {
                                    h6LV0( false, 17) ;
                                    getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A212BarSer, "")), 363, Gx_line+0, 481, Gx_line+17, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9")), 7, Gx_line+0, 81, Gx_line+17, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV60BarColNom, "")), 579, Gx_line+0, 675, Gx_line+17, 0+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV61BarColNum), "ZZZZZ9")), 672, Gx_line+0, 717, Gx_line+17, 0+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV94BarAlbKgmE, "ZZZZZ9.99")), 782, Gx_line+0, 849, Gx_line+17, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV95BarAlbMtrE, "ZZZZZ9.99")), 852, Gx_line+0, 919, Gx_line+17, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1265BarAlbPie), "ZZZZZ9")), 924, Gx_line+0, 969, Gx_line+17, 2+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45BarNum, "")), 276, Gx_line+0, 357, Gx_line+17, 2+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A143BarDisNum, "")), 149, Gx_line+0, 208, Gx_line+17, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(localUtil.format( A34AlbProfch, "99/99/99"), 84, Gx_line+0, 143, Gx_line+17, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(localUtil.format( A155BarFecCli, "99/99/99"), 211, Gx_line+0, 270, Gx_line+17, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV56Trozos), "ZZZZ")), 992, Gx_line+0, 1022, Gx_line+17, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV77barNomcli, "")), 484, Gx_line+0, 580, Gx_line+17, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV86BarMaqEst, "")), 1075, Gx_line+0, 1120, Gx_line+17, 0+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV87LitBar, "")), 1026, Gx_line+0, 1071, Gx_line+18, 0+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1265BarAlbPie), "ZZZZZ9")), 924, Gx_line+0, 969, Gx_line+17, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV101BarKgm, "ZZZZ9.99")), 720, Gx_line+0, 779, Gx_line+17, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9")), 7, Gx_line+0, 81, Gx_line+17, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(localUtil.format( A34AlbProfch, "99/99/99"), 84, Gx_line+0, 143, Gx_line+17, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A143BarDisNum, "")), 149, Gx_line+0, 208, Gx_line+17, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(localUtil.format( A155BarFecCli, "99/99/99"), 211, Gx_line+0, 270, Gx_line+17, 0+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45BarNum, "")), 276, Gx_line+0, 357, Gx_line+17, 2+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A212BarSer, "")), 363, Gx_line+0, 481, Gx_line+17, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV77barNomcli, "")), 484, Gx_line+0, 580, Gx_line+17, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV60BarColNom, "")), 579, Gx_line+0, 675, Gx_line+17, 0+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV61BarColNum), "ZZZZZ9")), 672, Gx_line+0, 717, Gx_line+17, 0+256, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+17) ;
                                 }
                                 else
                                 {
                                    /* Execute user subroutine: 'CLIENTEDESTINO' */
                                    S121 ();
                                    if ( returnInSub )
                                    {
                                       pr_default.close(3);
                                       pr_default.close(3);
                                       pr_default.close(3);
                                       pr_default.close(2);
                                       pr_default.close(2);
                                       getPrinter().GxEndPage() ;
                                       /* Close printer file */
                                       getPrinter().GxEndDocument() ;
                                       endPrinter();
                                       returnInSub = true;
                                       cleanup();
                                       if (true) return;
                                    }
                                    h6LV0( false, 18) ;
                                    getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV61BarColNum), "ZZZZZ9")), 672, Gx_line+0, 717, Gx_line+17, 0+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV60BarColNom, "")), 579, Gx_line+0, 675, Gx_line+17, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV77barNomcli, "")), 484, Gx_line+0, 580, Gx_line+17, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A212BarSer, "")), 363, Gx_line+0, 481, Gx_line+17, 0+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45BarNum, "")), 276, Gx_line+0, 357, Gx_line+17, 2+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(localUtil.format( A155BarFecCli, "99/99/99"), 211, Gx_line+0, 270, Gx_line+17, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A143BarDisNum, "")), 149, Gx_line+0, 208, Gx_line+17, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(localUtil.format( A34AlbProfch, "99/99/99"), 84, Gx_line+0, 143, Gx_line+17, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9")), 7, Gx_line+0, 81, Gx_line+17, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV101BarKgm, "ZZZZ9.99")), 720, Gx_line+0, 779, Gx_line+17, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV94BarAlbKgmE, "ZZZZZ9.99")), 782, Gx_line+0, 849, Gx_line+17, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV95BarAlbMtrE, "ZZZZZ9.99")), 852, Gx_line+0, 919, Gx_line+17, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1265BarAlbPie), "ZZZZZ9")), 924, Gx_line+0, 969, Gx_line+17, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV106CliNomD, "")), 973, Gx_line+0, 1120, Gx_line+17, 0+256, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+18) ;
                                 }
                                 if ( AV121DetalleRollos == 1 )
                                 {
                                    /* Execute user subroutine: 'DETALLE' */
                                    S141 ();
                                    if ( returnInSub )
                                    {
                                       pr_default.close(3);
                                       pr_default.close(3);
                                       pr_default.close(3);
                                       pr_default.close(2);
                                       pr_default.close(2);
                                       getPrinter().GxEndPage() ;
                                       /* Close printer file */
                                       getPrinter().GxEndDocument() ;
                                       endPrinter();
                                       returnInSub = true;
                                       cleanup();
                                       if (true) return;
                                    }
                                 }
                                 if ( AV97Coloretto == 1 )
                                 {
                                    h6LV0( false, 18) ;
                                    getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), 363, Gx_line+0, 486, Gx_line+16, 0, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+18) ;
                                 }
                              }
                              pr_default.readNext(3);
                           }
                           pr_default.close(3);
                        }
                     }
                  }
               }
               brk6LV5 = true ;
               pr_default.readNext(2);
            }
            if ( ( AV23TotKilC.doubleValue() == 0 ) && ( AV24TotMetC.doubleValue() == 0 ) && ( AV50TotPieC == 0 ) )
            {
            }
            else
            {
               if ( ( AV79PLinea == 1 ) || ( AV78Salayet == 1 ) )
               {
                  h6LV0( false, 24) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Total Cliente  :", ""), 559, Gx_line+3, 641, Gx_line+19, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV23TotKilC, "ZZZZZZ9.99")), 1044, Gx_line+6, 1118, Gx_line+23, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV24TotMetC, "ZZZZZZ9.99")), 845, Gx_line+6, 919, Gx_line+23, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV50TotPieC), "ZZZZZ9")), 924, Gx_line+6, 969, Gx_line+23, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(924, Gx_line+2, 968, Gx_line+2, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(768, Gx_line+2, 841, Gx_line+2, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(1044, Gx_line+2, 1117, Gx_line+2, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(845, Gx_line+2, 918, Gx_line+2, 1, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV82TotMetCD, "ZZZZZZ9.99")), 768, Gx_line+6, 842, Gx_line+23, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV83TotKilCD, "ZZZZZZ9.99")), 973, Gx_line+6, 1047, Gx_line+23, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(973, Gx_line+2, 1046, Gx_line+2, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(924, Gx_line+2, 968, Gx_line+2, 1, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV50TotPieC), "ZZZZZ9")), 924, Gx_line+6, 969, Gx_line+23, 2+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+24) ;
               }
               else
               {
                  if ( AV55TotTrzC == 0 )
                  {
                     h6LV0( false, 24) ;
                     getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Total Cliente  :", ""), 564, Gx_line+6, 646, Gx_line+22, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV23TotKilC, "ZZZZZZ9.99")), 768, Gx_line+6, 842, Gx_line+23, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV24TotMetC, "ZZZZZZ9.99")), 845, Gx_line+6, 919, Gx_line+23, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV50TotPieC), "ZZZZZ9")), 924, Gx_line+6, 969, Gx_line+23, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawLine(924, Gx_line+2, 968, Gx_line+2, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(768, Gx_line+2, 841, Gx_line+2, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(845, Gx_line+2, 918, Gx_line+2, 1, 0, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+24) ;
                  }
                  else
                  {
                     h6LV0( false, 24) ;
                     getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Total Cliente  :", ""), 564, Gx_line+6, 646, Gx_line+22, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV23TotKilC, "ZZZZZZ9.99")), 768, Gx_line+6, 842, Gx_line+23, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV24TotMetC, "ZZZZZZ9.99")), 845, Gx_line+6, 919, Gx_line+23, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV50TotPieC), "ZZZZZ9")), 924, Gx_line+6, 969, Gx_line+23, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV55TotTrzC), "ZZZZ")), 992, Gx_line+6, 1022, Gx_line+23, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawLine(924, Gx_line+2, 968, Gx_line+2, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(768, Gx_line+2, 841, Gx_line+2, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(845, Gx_line+2, 918, Gx_line+2, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(984, Gx_line+2, 1020, Gx_line+2, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV83TotKilCD, "ZZZZZZ9.99")), 693, Gx_line+6, 767, Gx_line+23, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawLine(693, Gx_line+2, 766, Gx_line+2, 1, 0, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+24) ;
                  }
               }
            }
            AV23TotKilC = DecimalUtil.doubleToDec(0) ;
            AV24TotMetC = DecimalUtil.doubleToDec(0) ;
            AV50TotPieC = 0 ;
            AV55TotTrzC = (short)(0) ;
            AV83TotKilCD = DecimalUtil.doubleToDec(0) ;
            AV82TotMetCD = DecimalUtil.doubleToDec(0) ;
            AV66Client = (byte)(0) ;
            if ( ! brk6LV5 )
            {
               brk6LV5 = true ;
               pr_default.readNext(2);
            }
         }
         pr_default.close(2);
         if ( ( AV79PLinea == 1 ) || ( AV78Salayet == 1 ) )
         {
            h6LV0( false, 24) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV21TotKil, "ZZZZZZ9.99")), 1044, Gx_line+5, 1118, Gx_line+22, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV22TotMet, "ZZZZZZ9.99")), 845, Gx_line+5, 919, Gx_line+22, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV49TotPie), "ZZZZZ9")), 924, Gx_line+5, 969, Gx_line+22, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(924, Gx_line+1, 968, Gx_line+1, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(768, Gx_line+1, 841, Gx_line+1, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(1044, Gx_line+1, 1117, Gx_line+1, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(845, Gx_line+1, 918, Gx_line+1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV80TotMetDis, "ZZZZZZ9.99")), 768, Gx_line+5, 842, Gx_line+22, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV81TotKilDis, "ZZZZZZ9.99")), 967, Gx_line+5, 1041, Gx_line+22, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(967, Gx_line+1, 1040, Gx_line+1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41Lit16, "")), 600, Gx_line+5, 636, Gx_line+22, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(":", 639, Gx_line+5, 647, Gx_line+22, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+24) ;
         }
         else
         {
            if ( AV54TotTrz == 0 )
            {
               h6LV0( false, 24) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41Lit16, "")), 599, Gx_line+5, 635, Gx_line+22, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV21TotKil, "ZZZZZZ9.99")), 768, Gx_line+5, 842, Gx_line+22, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV22TotMet, "ZZZZZZ9.99")), 845, Gx_line+5, 919, Gx_line+22, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(":", 639, Gx_line+5, 647, Gx_line+22, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV49TotPie), "ZZZZZ9")), 924, Gx_line+5, 969, Gx_line+22, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(924, Gx_line+1, 968, Gx_line+1, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(768, Gx_line+1, 841, Gx_line+1, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(845, Gx_line+1, 918, Gx_line+1, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+24) ;
            }
            else
            {
               h6LV0( false, 24) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41Lit16, "")), 599, Gx_line+5, 635, Gx_line+22, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV21TotKil, "ZZZZZZ9.99")), 768, Gx_line+5, 842, Gx_line+22, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV22TotMet, "ZZZZZZ9.99")), 845, Gx_line+5, 919, Gx_line+22, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(":", 639, Gx_line+5, 647, Gx_line+22, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV49TotPie), "ZZZZZ9")), 924, Gx_line+5, 969, Gx_line+22, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV54TotTrz), "ZZZZZ")), 984, Gx_line+5, 1021, Gx_line+22, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(924, Gx_line+1, 968, Gx_line+1, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(768, Gx_line+1, 841, Gx_line+1, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(845, Gx_line+1, 918, Gx_line+1, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(984, Gx_line+1, 1020, Gx_line+1, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV81TotKilDis, "ZZZZZZ9.99")), 690, Gx_line+5, 764, Gx_line+22, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(691, Gx_line+1, 764, Gx_line+1, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+24) ;
            }
         }
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6LV0( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      if ( httpContext.willRedirect( ) )
      {
         httpContext.redirect( httpContext.wjLoc );
         httpContext.wjLoc = "" ;
      }
      cleanup();
   }

   public void S111( ) throws ProcessInterruptedException
   {
      /* 'CLIENTE' Routine */
      returnInSub = false ;
      /* Using cursor P06LV9 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(AV43CliCod)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A252CliCod = P06LV9_A252CliCod[0] ;
         A279CliNom = P06LV9_A279CliNom[0] ;
         AV42CliNom = A279CliNom ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(6);
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'CLIENTEDESTINO' Routine */
      returnInSub = false ;
      AV106CliNomD = " " ;
      /* Using cursor P06LV10 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(AV108CliCoddest)});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A252CliCod = P06LV10_A252CliCod[0] ;
         A279CliNom = P06LV10_A279CliNom[0] ;
         AV106CliNomD = GXutil.substring( A279CliNom, 1, 20) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(7);
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'BARPIE' Routine */
      returnInSub = false ;
      /* Optimized group. */
      /* Using cursor P06LV11 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(AV111Barcod), Byte.valueOf(AV112BarCodreo), AV113Barcodpar, AV110BarPiecod});
      c203BarPieKil = P06LV11_A203BarPieKil[0] ;
      c205BarPieMet = P06LV11_A205BarPieMet[0] ;
      pr_default.close(8);
      AV114KgsT = AV114KgsT.add(c203BarPieKil) ;
      AV115MtsT = AV115MtsT.add(c205BarPieMet) ;
      /* End optimized group. */
   }

   public void S141( ) throws ProcessInterruptedException
   {
      /* 'DETALLE' Routine */
      returnInSub = false ;
      h6LV0( false, 18) ;
      getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "N Pieza", ""), 672, Gx_line+0, 724, Gx_line+17, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Kilos", ""), 780, Gx_line+0, 817, Gx_line+17, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Metros", ""), 853, Gx_line+0, 898, Gx_line+17, 0+256, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+18) ;
      /* Using cursor P06LV12 */
      pr_default.execute(9, new Object[] {A396EmprCod, Long.valueOf(AV120ALbProcod), Integer.valueOf(AV111Barcod), Byte.valueOf(AV112BarCodreo), AV113Barcodpar});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A130BarCodPar = P06LV12_A130BarCodPar[0] ;
         A132BarCodReo = P06LV12_A132BarCodReo[0] ;
         A129BarCod = P06LV12_A129BarCod[0] ;
         A30AlbProCod = P06LV12_A30AlbProCod[0] ;
         A1270AlbPMtrEnt = P06LV12_A1270AlbPMtrEnt[0] ;
         A27AlbPKilEnt = P06LV12_A27AlbPKilEnt[0] ;
         A200BarPieCod = P06LV12_A200BarPieCod[0] ;
         h6LV0( false, 17) ;
         getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A27AlbPKilEnt, "ZZZZZ9.99")), 782, Gx_line+0, 849, Gx_line+17, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A1270AlbPMtrEnt, "ZZZZZ9.99")), 852, Gx_line+0, 919, Gx_line+17, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A200BarPieCod, "")), 672, Gx_line+0, 739, Gx_line+17, 0+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+17) ;
         pr_default.readNext(9);
      }
      pr_default.close(9);
   }

   public void h6LV0( boolean bFoot ,
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
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV124Litkg, "")), 714, Gx_line+108, 778, Gx_line+125, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(":", 752, Gx_line+8, 760, Gx_line+25, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(":", 943, Gx_line+8, 951, Gx_line+25, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(":", 943, Gx_line+42, 951, Gx_line+59, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25Lit0, "")), 7, Gx_line+42, 133, Gx_line+60, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26Lit1, "")), 716, Gx_line+8, 752, Gx_line+24, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 767, Gx_line+8, 826, Gx_line+25, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27Lit2, "")), 899, Gx_line+8, 928, Gx_line+24, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 950, Gx_line+8, 1009, Gx_line+25, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28Lit3, "")), 899, Gx_line+42, 943, Gx_line+58, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 965, Gx_line+42, 1010, Gx_line+59, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(":", 95, Gx_line+78, 103, Gx_line+95, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29Lit4, "")), 51, Gx_line+78, 87, Gx_line+95, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( AV19PFecha, "99/99/99"), 109, Gx_line+78, 167, Gx_line+95, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30Lit5, "")), 182, Gx_line+78, 218, Gx_line+95, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( AV20UFecha, "99/99/99"), 238, Gx_line+78, 296, Gx_line+95, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(":", 226, Gx_line+78, 234, Gx_line+95, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44NomEmp, "")), 7, Gx_line+8, 196, Gx_line+26, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV134Pgmname, "")), 716, Gx_line+42, 774, Gx_line+58, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(0, Gx_line+64, 1119, Gx_line+64, 2, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35Lit10, "")), 15, Gx_line+108, 81, Gx_line+124, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV58Lit21, "")), 84, Gx_line+108, 142, Gx_line+124, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33Lit8, "")), 363, Gx_line+108, 399, Gx_line+124, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36Lit11, "")), 579, Gx_line+108, 615, Gx_line+124, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37Lit12, "")), 656, Gx_line+108, 706, Gx_line+124, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38Lit13, "")), 782, Gx_line+108, 848, Gx_line+124, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39Lit14, "")), 852, Gx_line+108, 918, Gx_line+124, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46Lit17, "")), 211, Gx_line+108, 269, Gx_line+124, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47Lit18, "")), 149, Gx_line+108, 207, Gx_line+124, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34Lit9, "")), 276, Gx_line+108, 358, Gx_line+125, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52Lit19, "")), 980, Gx_line+108, 1046, Gx_line+124, 2, 0, 0, 0) ;
            getPrinter().GxDrawLine(0, Gx_line+127, 1119, Gx_line+127, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV84Lit22, "")), 1051, Gx_line+108, 1117, Gx_line+124, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV92Lit23, "")), 484, Gx_line+108, 559, Gx_line+124, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40Lit15, "")), 924, Gx_line+108, 968, Gx_line+124, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV118TipDisDsc, "")), 204, Gx_line+42, 424, Gx_line+59, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV119TipProd, "")), 489, Gx_line+42, 636, Gx_line+59, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+131) ;
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

   public void add_metrics( )
   {
      add_metrics0( ) ;
      add_metrics1( ) ;
      add_metrics2( ) ;
      add_metrics3( ) ;
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Arial", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Courier New", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics2( )
   {
      getPrinter().setMetrics("Courier New", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics3( )
   {
      getPrinter().setMetrics("Arial", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   protected int getOutputType( )
   {
      return OUTPUT_PDF;
   }

   protected java.io.OutputStream getOutputStream( )
   {
      return httpContext.getOutputStream();
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      super.cleanup();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXKey = "" ;
      gxfirstwebparm = "" ;
      A396EmprCod = "" ;
      AV15ImpCod = "" ;
      AV16Prio = "" ;
      AV19PFecha = GXutil.nullDate() ;
      AV20UFecha = GXutil.nullDate() ;
      AV62PBarSer = "" ;
      AV63UBarSer = "" ;
      AV125AlbEncCli = "" ;
      AV126AlbEncCli_to = "" ;
      AV72Barcodparf = "" ;
      AV73Barcolnomi = "" ;
      AV74Barcolnomf = "" ;
      AV88BarMaqEst1 = "" ;
      AV89BarMaqEst2 = "" ;
      AV90Serie = "" ;
      AV103Barlar = "" ;
      AV116Tipdiscod = "" ;
      AV25Lit0 = "" ;
      AV26Lit1 = "" ;
      AV27Lit2 = "" ;
      AV28Lit3 = "" ;
      AV29Lit4 = "" ;
      AV30Lit5 = "" ;
      AV31Lit6 = "" ;
      AV32Lit7 = "" ;
      AV33Lit8 = "" ;
      AV34Lit9 = "" ;
      AV35Lit10 = "" ;
      AV36Lit11 = "" ;
      AV37Lit12 = "" ;
      AV38Lit13 = "" ;
      AV39Lit14 = "" ;
      AV40Lit15 = "" ;
      AV41Lit16 = "" ;
      AV46Lit17 = "" ;
      AV47Lit18 = "" ;
      AV58Lit21 = "" ;
      AV52Lit19 = "" ;
      AV53Lit20 = "" ;
      AV84Lit22 = "" ;
      AV92Lit23 = "" ;
      AV96Lit31 = "" ;
      AV124Litkg = "" ;
      GXv_int4 = new byte[1] ;
      scmdbuf = "" ;
      P06LV2_A396EmprCod = new String[] {""} ;
      P06LV2_A407EmprNom = new String[] {""} ;
      P06LV2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV44NomEmp = "" ;
      AV118TipDisDsc = "" ;
      P06LV3_A396EmprCod = new String[] {""} ;
      P06LV3_A5098TipDisCod = new String[] {""} ;
      P06LV3_A5097TipDisDsc = new String[] {""} ;
      P06LV3_n5097TipDisDsc = new boolean[] {false} ;
      A5098TipDisCod = "" ;
      A5097TipDisDsc = "" ;
      AV119TipProd = "" ;
      AV21TotKil = DecimalUtil.ZERO ;
      AV22TotMet = DecimalUtil.ZERO ;
      AV81TotKilDis = DecimalUtil.ZERO ;
      AV80TotMetDis = DecimalUtil.ZERO ;
      P06LV4_A840TrnCod = new short[1] ;
      P06LV4_A396EmprCod = new String[] {""} ;
      P06LV4_A30AlbProCod = new long[1] ;
      P06LV4_A1243GuiRemCli = new int[1] ;
      P06LV4_A3869AlbCliDes = new int[1] ;
      P06LV4_A39AlbProPri = new String[] {""} ;
      P06LV4_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P06LV4_A841TrnNom = new String[] {""} ;
      P06LV4_n841TrnNom = new boolean[] {false} ;
      A39AlbProPri = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      A841TrnNom = "" ;
      AV102TrnNom = "" ;
      AV91Serie2 = "" ;
      lV91Serie2 = "" ;
      P06LV6_A30AlbProCod = new long[1] ;
      P06LV6_A130BarCodPar = new String[] {""} ;
      P06LV6_A132BarCodReo = new byte[1] ;
      P06LV6_A129BarCod = new int[1] ;
      P06LV6_A2010BarTipDis = new String[] {""} ;
      P06LV6_A148BarEstReo = new byte[1] ;
      P06LV6_A206BarPle = new String[] {""} ;
      P06LV6_A7733BarMaqEst = new String[] {""} ;
      P06LV6_A136BarColNum = new int[1] ;
      P06LV6_A135BarColNom = new String[] {""} ;
      P06LV6_A212BarSer = new String[] {""} ;
      P06LV6_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06LV6_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06LV6_A2243BarKgsCli = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06LV6_n2243BarKgsCli = new boolean[] {false} ;
      P06LV6_A1461BarAlbPN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06LV6_A1265BarAlbPie = new int[1] ;
      P06LV6_A1234BarNomCli = new String[] {""} ;
      P06LV6_A1235BarNumCli = new int[1] ;
      P06LV6_A1652BarSerDsc = new String[] {""} ;
      P06LV6_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P06LV6_A396EmprCod = new String[] {""} ;
      P06LV6_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06LV6_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06LV6_A143BarDisNum = new String[] {""} ;
      P06LV6_A4812BarEncCli = new String[] {""} ;
      A130BarCodPar = "" ;
      A2010BarTipDis = "" ;
      A206BarPle = "" ;
      A7733BarMaqEst = "" ;
      A135BarColNom = "" ;
      A212BarSer = "" ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      A2243BarKgsCli = DecimalUtil.ZERO ;
      A1461BarAlbPN = DecimalUtil.ZERO ;
      A1234BarNomCli = "" ;
      A1652BarSerDsc = "" ;
      A155BarFecCli = GXutil.nullDate() ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A143BarDisNum = "" ;
      A4812BarEncCli = "" ;
      A13878PedidoClie = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_char6 = new String[1] ;
      GXv_char7 = new String[1] ;
      AV45BarNum = "" ;
      P06LV7_AV56Trozos = new short[1] ;
      AV94BarAlbKgmE = DecimalUtil.ZERO ;
      AV95BarAlbMtrE = DecimalUtil.ZERO ;
      AV23TotKilC = DecimalUtil.ZERO ;
      AV24TotMetC = DecimalUtil.ZERO ;
      AV83TotKilCD = DecimalUtil.ZERO ;
      AV82TotMetCD = DecimalUtil.ZERO ;
      AV60BarColNom = "" ;
      AV77barNomcli = "" ;
      AV68Barser6 = "" ;
      AV69BarSerDsc = "" ;
      AV42CliNom = "" ;
      AV86BarMaqEst = "" ;
      AV87LitBar = "" ;
      AV101BarKgm = DecimalUtil.ZERO ;
      AV113Barcodpar = "" ;
      AV114KgsT = DecimalUtil.ZERO ;
      AV115MtsT = DecimalUtil.ZERO ;
      P06LV8_A396EmprCod = new String[] {""} ;
      P06LV8_A30AlbProCod = new long[1] ;
      P06LV8_A129BarCod = new int[1] ;
      P06LV8_A132BarCodReo = new byte[1] ;
      P06LV8_A130BarCodPar = new String[] {""} ;
      P06LV8_A200BarPieCod = new String[] {""} ;
      A200BarPieCod = "" ;
      AV110BarPiecod = "" ;
      AV106CliNomD = "" ;
      P06LV9_A396EmprCod = new String[] {""} ;
      P06LV9_A252CliCod = new int[1] ;
      P06LV9_A279CliNom = new String[] {""} ;
      A279CliNom = "" ;
      P06LV10_A396EmprCod = new String[] {""} ;
      P06LV10_A252CliCod = new int[1] ;
      P06LV10_A279CliNom = new String[] {""} ;
      c203BarPieKil = DecimalUtil.ZERO ;
      c205BarPieMet = DecimalUtil.ZERO ;
      P06LV11_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06LV11_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06LV12_A396EmprCod = new String[] {""} ;
      P06LV12_A130BarCodPar = new String[] {""} ;
      P06LV12_A132BarCodReo = new byte[1] ;
      P06LV12_A129BarCod = new int[1] ;
      P06LV12_A30AlbProCod = new long[1] ;
      P06LV12_A1270AlbPMtrEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06LV12_A27AlbPKilEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06LV12_A200BarPieCod = new String[] {""} ;
      A1270AlbPMtrEnt = DecimalUtil.ZERO ;
      A27AlbPKilEnt = DecimalUtil.ZERO ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      AV134Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ral0003__default(),
         new Object[] {
             new Object[] {
            P06LV2_A396EmprCod, P06LV2_A407EmprNom, P06LV2_n407EmprNom
            }
            , new Object[] {
            P06LV3_A396EmprCod, P06LV3_A5098TipDisCod, P06LV3_A5097TipDisDsc, P06LV3_n5097TipDisDsc
            }
            , new Object[] {
            P06LV4_A840TrnCod, P06LV4_A396EmprCod, P06LV4_A30AlbProCod, P06LV4_A1243GuiRemCli, P06LV4_A3869AlbCliDes, P06LV4_A39AlbProPri, P06LV4_A34AlbProfch, P06LV4_A841TrnNom, P06LV4_n841TrnNom
            }
            , new Object[] {
            P06LV6_A30AlbProCod, P06LV6_A130BarCodPar, P06LV6_A132BarCodReo, P06LV6_A129BarCod, P06LV6_A2010BarTipDis, P06LV6_A148BarEstReo, P06LV6_A206BarPle, P06LV6_A7733BarMaqEst, P06LV6_A136BarColNum, P06LV6_A135BarColNom,
            P06LV6_A212BarSer, P06LV6_A1261BarAlbKgmE, P06LV6_A1263BarAlbMtrE, P06LV6_A2243BarKgsCli, P06LV6_n2243BarKgsCli, P06LV6_A1461BarAlbPN, P06LV6_A1265BarAlbPie, P06LV6_A1234BarNomCli, P06LV6_A1235BarNumCli, P06LV6_A1652BarSerDsc,
            P06LV6_A155BarFecCli, P06LV6_A396EmprCod, P06LV6_A166BarKgm, P06LV6_A184BarMtr, P06LV6_A143BarDisNum, P06LV6_A4812BarEncCli
            }
            , new Object[] {
            P06LV7_AV56Trozos
            }
            , new Object[] {
            P06LV8_A396EmprCod, P06LV8_A30AlbProCod, P06LV8_A129BarCod, P06LV8_A132BarCodReo, P06LV8_A130BarCodPar, P06LV8_A200BarPieCod
            }
            , new Object[] {
            P06LV9_A396EmprCod, P06LV9_A252CliCod, P06LV9_A279CliNom
            }
            , new Object[] {
            P06LV10_A396EmprCod, P06LV10_A252CliCod, P06LV10_A279CliNom
            }
            , new Object[] {
            P06LV11_A203BarPieKil, P06LV11_A205BarPieMet
            }
            , new Object[] {
            P06LV12_A396EmprCod, P06LV12_A130BarCodPar, P06LV12_A132BarCodReo, P06LV12_A129BarCod, P06LV12_A30AlbProCod, P06LV12_A1270AlbPMtrEnt, P06LV12_A27AlbPKilEnt, P06LV12_A200BarPieCod
            }
         }
      );
      AV134Pgmname = "RAL0003" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      AV134Pgmname = "RAL0003" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV48Fuente ;
   private byte AV71Barcodreof ;
   private byte AV117Barestreo ;
   private byte AV121DetalleRollos ;
   private byte AV59FlagTtx ;
   private byte AV67Kohler ;
   private byte AV51FlagPT ;
   private byte AV78Salayet ;
   private byte AV79PLinea ;
   private byte AV85Tintex ;
   private byte AV93Moda21 ;
   private byte AV97Coloretto ;
   private byte AV98Staack ;
   private byte AV107Fatelca ;
   private byte AV109Termilenio ;
   private byte GXt_int3 ;
   private byte GXv_int4[] ;
   private byte AV122Barestreoi ;
   private byte AV123BarEstreof ;
   private byte A132BarCodReo ;
   private byte A148BarEstReo ;
   private byte AV66Client ;
   private byte AV112BarCodreo ;
   private short gxcookieaux ;
   private short A840TrnCod ;
   private short AV56Trozos ;
   private short cV56Trozos ;
   private short AV55TotTrzC ;
   private short Gx_err ;
   private int AV17PCliCod ;
   private int AV18UCliCod ;
   private int AV70Barcodi ;
   private int AV75Barcolnumi ;
   private int AV76Barcolnumf ;
   private int AV99Nfi ;
   private int AV100Nff ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int AV49TotPie ;
   private int AV54TotTrz ;
   private int A1243GuiRemCli ;
   private int A3869AlbCliDes ;
   private int AV43CliCod ;
   private int AV108CliCoddest ;
   private int A129BarCod ;
   private int A136BarColNum ;
   private int A1265BarAlbPie ;
   private int A1235BarNumCli ;
   private int AV50TotPieC ;
   private int AV61BarColNum ;
   private int Gx_OldLine ;
   private int AV111Barcod ;
   private int A252CliCod ;
   private long A30AlbProCod ;
   private long AV120ALbProcod ;
   private java.math.BigDecimal AV21TotKil ;
   private java.math.BigDecimal AV22TotMet ;
   private java.math.BigDecimal AV81TotKilDis ;
   private java.math.BigDecimal AV80TotMetDis ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal A2243BarKgsCli ;
   private java.math.BigDecimal A1461BarAlbPN ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal AV94BarAlbKgmE ;
   private java.math.BigDecimal AV95BarAlbMtrE ;
   private java.math.BigDecimal AV23TotKilC ;
   private java.math.BigDecimal AV24TotMetC ;
   private java.math.BigDecimal AV83TotKilCD ;
   private java.math.BigDecimal AV82TotMetCD ;
   private java.math.BigDecimal AV101BarKgm ;
   private java.math.BigDecimal AV114KgsT ;
   private java.math.BigDecimal AV115MtsT ;
   private java.math.BigDecimal c203BarPieKil ;
   private java.math.BigDecimal c205BarPieMet ;
   private java.math.BigDecimal A1270AlbPMtrEnt ;
   private java.math.BigDecimal A27AlbPKilEnt ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV15ImpCod ;
   private String AV16Prio ;
   private String AV62PBarSer ;
   private String AV63UBarSer ;
   private String AV125AlbEncCli ;
   private String AV126AlbEncCli_to ;
   private String AV72Barcodparf ;
   private String AV73Barcolnomi ;
   private String AV74Barcolnomf ;
   private String AV88BarMaqEst1 ;
   private String AV89BarMaqEst2 ;
   private String AV90Serie ;
   private String AV103Barlar ;
   private String AV116Tipdiscod ;
   private String AV25Lit0 ;
   private String AV26Lit1 ;
   private String AV27Lit2 ;
   private String AV28Lit3 ;
   private String AV29Lit4 ;
   private String AV30Lit5 ;
   private String AV31Lit6 ;
   private String AV32Lit7 ;
   private String AV33Lit8 ;
   private String AV34Lit9 ;
   private String AV35Lit10 ;
   private String AV36Lit11 ;
   private String AV37Lit12 ;
   private String AV38Lit13 ;
   private String AV39Lit14 ;
   private String AV40Lit15 ;
   private String AV41Lit16 ;
   private String AV46Lit17 ;
   private String AV47Lit18 ;
   private String AV58Lit21 ;
   private String AV52Lit19 ;
   private String AV53Lit20 ;
   private String AV84Lit22 ;
   private String AV92Lit23 ;
   private String AV96Lit31 ;
   private String AV124Litkg ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV44NomEmp ;
   private String AV118TipDisDsc ;
   private String A5098TipDisCod ;
   private String A5097TipDisDsc ;
   private String AV119TipProd ;
   private String A39AlbProPri ;
   private String A841TrnNom ;
   private String AV102TrnNom ;
   private String AV91Serie2 ;
   private String lV91Serie2 ;
   private String A130BarCodPar ;
   private String A2010BarTipDis ;
   private String A206BarPle ;
   private String A7733BarMaqEst ;
   private String A135BarColNom ;
   private String A212BarSer ;
   private String A1234BarNomCli ;
   private String A1652BarSerDsc ;
   private String A143BarDisNum ;
   private String A4812BarEncCli ;
   private String A13878PedidoClie ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXv_char5[] ;
   private String GXv_char6[] ;
   private String GXv_char7[] ;
   private String AV45BarNum ;
   private String AV60BarColNom ;
   private String AV77barNomcli ;
   private String AV68Barser6 ;
   private String AV69BarSerDsc ;
   private String AV42CliNom ;
   private String AV86BarMaqEst ;
   private String AV87LitBar ;
   private String AV113Barcodpar ;
   private String A200BarPieCod ;
   private String AV110BarPiecod ;
   private String AV106CliNomD ;
   private String A279CliNom ;
   private String Gx_time ;
   private String AV134Pgmname ;
   private java.util.Date AV19PFecha ;
   private java.util.Date AV20UFecha ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date A155BarFecCli ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean n5097TipDisDsc ;
   private boolean brk6LV5 ;
   private boolean n841TrnNom ;
   private boolean returnInSub ;
   private boolean n2243BarKgsCli ;
   private IDataStoreProvider pr_default ;
   private String[] P06LV2_A396EmprCod ;
   private String[] P06LV2_A407EmprNom ;
   private boolean[] P06LV2_n407EmprNom ;
   private String[] P06LV3_A396EmprCod ;
   private String[] P06LV3_A5098TipDisCod ;
   private String[] P06LV3_A5097TipDisDsc ;
   private boolean[] P06LV3_n5097TipDisDsc ;
   private short[] P06LV4_A840TrnCod ;
   private String[] P06LV4_A396EmprCod ;
   private long[] P06LV4_A30AlbProCod ;
   private int[] P06LV4_A1243GuiRemCli ;
   private int[] P06LV4_A3869AlbCliDes ;
   private String[] P06LV4_A39AlbProPri ;
   private java.util.Date[] P06LV4_A34AlbProfch ;
   private String[] P06LV4_A841TrnNom ;
   private boolean[] P06LV4_n841TrnNom ;
   private long[] P06LV6_A30AlbProCod ;
   private String[] P06LV6_A130BarCodPar ;
   private byte[] P06LV6_A132BarCodReo ;
   private int[] P06LV6_A129BarCod ;
   private String[] P06LV6_A2010BarTipDis ;
   private byte[] P06LV6_A148BarEstReo ;
   private String[] P06LV6_A206BarPle ;
   private String[] P06LV6_A7733BarMaqEst ;
   private int[] P06LV6_A136BarColNum ;
   private String[] P06LV6_A135BarColNom ;
   private String[] P06LV6_A212BarSer ;
   private java.math.BigDecimal[] P06LV6_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] P06LV6_A1263BarAlbMtrE ;
   private java.math.BigDecimal[] P06LV6_A2243BarKgsCli ;
   private boolean[] P06LV6_n2243BarKgsCli ;
   private java.math.BigDecimal[] P06LV6_A1461BarAlbPN ;
   private int[] P06LV6_A1265BarAlbPie ;
   private String[] P06LV6_A1234BarNomCli ;
   private int[] P06LV6_A1235BarNumCli ;
   private String[] P06LV6_A1652BarSerDsc ;
   private java.util.Date[] P06LV6_A155BarFecCli ;
   private String[] P06LV6_A396EmprCod ;
   private java.math.BigDecimal[] P06LV6_A166BarKgm ;
   private java.math.BigDecimal[] P06LV6_A184BarMtr ;
   private String[] P06LV6_A143BarDisNum ;
   private String[] P06LV6_A4812BarEncCli ;
   private short[] P06LV7_AV56Trozos ;
   private String[] P06LV8_A396EmprCod ;
   private long[] P06LV8_A30AlbProCod ;
   private int[] P06LV8_A129BarCod ;
   private byte[] P06LV8_A132BarCodReo ;
   private String[] P06LV8_A130BarCodPar ;
   private String[] P06LV8_A200BarPieCod ;
   private String[] P06LV9_A396EmprCod ;
   private int[] P06LV9_A252CliCod ;
   private String[] P06LV9_A279CliNom ;
   private String[] P06LV10_A396EmprCod ;
   private int[] P06LV10_A252CliCod ;
   private String[] P06LV10_A279CliNom ;
   private java.math.BigDecimal[] P06LV11_A203BarPieKil ;
   private java.math.BigDecimal[] P06LV11_A205BarPieMet ;
   private String[] P06LV12_A396EmprCod ;
   private String[] P06LV12_A130BarCodPar ;
   private byte[] P06LV12_A132BarCodReo ;
   private int[] P06LV12_A129BarCod ;
   private long[] P06LV12_A30AlbProCod ;
   private java.math.BigDecimal[] P06LV12_A1270AlbPMtrEnt ;
   private java.math.BigDecimal[] P06LV12_A27AlbPKilEnt ;
   private String[] P06LV12_A200BarPieCod ;
}

final  class ral0003__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06LV2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06LV3", "SELECT EmprCod, TipDisCod, TipDisDsc FROM TXPTIPDIS WHERE EmprCod = ? and TipDisCod = ? ORDER BY EmprCod, TipDisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06LV4", "SELECT T1.TrnCod, T1.EmprCod, T1.AlbProCod, T1.GuiRemCli, T1.AlbCliDes, T1.AlbProPri, T1.AlbProfch, T2.TrnNom FROM (TXPCALPRD T1 INNER JOIN TXPTRANSP T2 ON T2.EmprCod = T1.EmprCod AND T2.TrnCod = T1.TrnCod) WHERE (T1.EmprCod = ? and T1.GuiRemCli >= ? and T1.AlbProfch >= ?) AND (T1.AlbProfch <= ?) AND (T1.AlbProPri = ? or ? = '2') AND (T1.AlbCliDes >= ? and T1.AlbCliDes <= ?) AND (T1.GuiRemCli <= ?) ORDER BY T1.EmprCod, T1.GuiRemCli, T1.AlbProfch ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06LV6", "SELECT T1.AlbProCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T2.BarTipDis, T2.BarEstReo, T2.BarPle, T2.BarMaqEst, T2.BarColNum, T2.BarColNom, T2.BarSer, T1.BarAlbKgmE, T1.BarAlbMtrE, T1.BarKgsCli, T1.BarAlbPN, T1.BarAlbPie, T2.BarNomCli, T2.BarNumCli, T2.BarSerDsc, T2.BarFecCli, T1.EmprCod, COALESCE( T3.BarKgm, 0) AS BarKgm, COALESCE( T3.BarMtr, 0) AS BarMtr, T2.BarDisNum, T2.BarEncCli FROM ((TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ? and T1.AlbProCod = ?) AND (( ( T2.BarSer >= ? and T2.BarSer <= ?) and (rtrim(?) IS NULL)) or ( T2.BarSer like ? and Not (rtrim(?) IS NULL))) AND (T2.BarColNom >= ? and T2.BarColNom <= ?) AND (T2.BarColNum >= ? and T2.BarColNum <= ?) AND (T1.BarCod = ? or (? = 0)) AND (T1.BarCodReo = ? or (? = 0)) AND (T1.BarCodPar = ? or (rtrim(?) IS NULL)) AND (( ( T2.BarMaqEst >= ? or (rtrim(?) IS NULL)) and ? = 1) or ( ? = 0)) AND (( ( T2.BarMaqEst <= ? or (rtrim(?) IS NULL)) and ? = 1) or ( ? = 0)) AND (T2.BarPle = ? or (rtrim(?) IS NULL)) AND (T2.BarEstReo >= ?) AND (T2.BarEstReo <= ?) AND (T2.BarTipDis = ? or ? = '*') ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06LV7", "SELECT COUNT(*) FROM TXPLALTRZ WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06LV8", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPLALPRD WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06LV9", "SELECT EmprCod, CliCod, CliNom FROM TXPCLIENT WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06LV10", "SELECT EmprCod, CliCod, CliNom FROM TXPCLIENT WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06LV11", "SELECT SUM(BarPieKil) AS BarKgm, SUM(BarPieMet) AS BarMtr FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06LV12", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, AlbProCod, AlbPMtrEnt, AlbPKilEnt, BarPieCod FROM TXPLALPRD WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 10);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 13);
               ((String[]) buf[10])[0] = rslt.getString(11, 16);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,2);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,2);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(15,2);
               ((int[]) buf[16])[0] = rslt.getInt(16);
               ((String[]) buf[17])[0] = rslt.getString(17, 13);
               ((int[]) buf[18])[0] = rslt.getInt(18);
               ((String[]) buf[19])[0] = rslt.getString(19, 26);
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(20);
               ((String[]) buf[21])[0] = rslt.getString(21, 3);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(22,2);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(23,2);
               ((String[]) buf[24])[0] = rslt.getString(24, 8);
               ((String[]) buf[25])[0] = rslt.getString(25, 20);
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               return;
            case 8 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 9);
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
               stmt.setString(2, (String)parms[1], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 1);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setString(5, (String)parms[4], 16);
               stmt.setString(6, (String)parms[5], 16);
               stmt.setString(7, (String)parms[6], 16);
               stmt.setString(8, (String)parms[7], 13);
               stmt.setString(9, (String)parms[8], 13);
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setInt(11, ((Number) parms[10]).intValue());
               stmt.setInt(12, ((Number) parms[11]).intValue());
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setByte(14, ((Number) parms[13]).byteValue());
               stmt.setByte(15, ((Number) parms[14]).byteValue());
               stmt.setString(16, (String)parms[15], 1);
               stmt.setString(17, (String)parms[16], 1);
               stmt.setString(18, (String)parms[17], 6);
               stmt.setString(19, (String)parms[18], 6);
               stmt.setByte(20, ((Number) parms[19]).byteValue());
               stmt.setByte(21, ((Number) parms[20]).byteValue());
               stmt.setString(22, (String)parms[21], 6);
               stmt.setString(23, (String)parms[22], 6);
               stmt.setByte(24, ((Number) parms[23]).byteValue());
               stmt.setByte(25, ((Number) parms[24]).byteValue());
               stmt.setString(26, (String)parms[25], 10);
               stmt.setString(27, (String)parms[26], 10);
               stmt.setByte(28, ((Number) parms[27]).byteValue());
               stmt.setByte(29, ((Number) parms[28]).byteValue());
               stmt.setString(30, (String)parms[29], 1);
               stmt.setString(31, (String)parms[30], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

