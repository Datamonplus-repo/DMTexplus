package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rfa00c3_impl extends GXWebReport
{
   public rfa00c3_impl( com.genexus.internet.HttpContext context )
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
            AV8Pfecha = localUtil.parseDateParm( httpContext.GetPar( "Pfecha")) ;
            AV9Ufecha = localUtil.parseDateParm( httpContext.GetPar( "Ufecha")) ;
            AV33PCliCod = (int)(GXutil.lval( httpContext.GetPar( "PCliCod"))) ;
            AV34UCliCod = (int)(GXutil.lval( httpContext.GetPar( "UCliCod"))) ;
            AV48FasCodi = httpContext.GetPar( "FasCodi") ;
            AV49FasCod_f = httpContext.GetPar( "FasCod_f") ;
            AV53barpri = httpContext.GetPar( "barpri") ;
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
      M_bot = 0 ;
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
         P_lines = (int)(gxYPage-(lineHeight*0)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXt_char1 = AV13Lit0 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( AV56Pgmname, (byte)(99), GXv_char2) ;
         rfa00c3_impl.this.GXt_char1 = GXv_char2[0] ;
         AV13Lit0 = GXt_char1 ;
         GXt_char1 = AV11Lit1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         rfa00c3_impl.this.GXt_char1 = GXv_char2[0] ;
         AV11Lit1 = GXt_char1 ;
         GXt_char1 = AV12Lit2 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char2) ;
         rfa00c3_impl.this.GXt_char1 = GXv_char2[0] ;
         AV12Lit2 = GXt_char1 ;
         GXt_char1 = AV14Lit3 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char2) ;
         rfa00c3_impl.this.GXt_char1 = GXv_char2[0] ;
         AV14Lit3 = GXt_char1 ;
         GXt_char1 = AV16Lit4 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2334_", ""), (byte)(99), GXv_char2) ;
         rfa00c3_impl.this.GXt_char1 = GXv_char2[0] ;
         AV16Lit4 = GXt_char1 ;
         GXt_char1 = AV28Lit5 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT263_", ""), (byte)(99), GXv_char2) ;
         rfa00c3_impl.this.GXt_char1 = GXv_char2[0] ;
         AV28Lit5 = GXt_char1 ;
         GXt_char1 = AV17Lit11 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1388_", ""), (byte)(99), GXv_char2) ;
         rfa00c3_impl.this.GXt_char1 = GXv_char2[0] ;
         AV17Lit11 = GXt_char1 ;
         GXt_char1 = AV31Lit6 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN430_", ""), (byte)(99), GXv_char2) ;
         rfa00c3_impl.this.GXt_char1 = GXv_char2[0] ;
         AV31Lit6 = GXt_char1 ;
         if ( GXutil.strcmp(AV13Lit0, httpContext.getMessage( "RFA00C3", "")) == 0 )
         {
            AV13Lit0 = AV57Pgmdesc ;
         }
         GXv_int3[0] = AV29FlagIdioma ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, "100001", GXv_int3) ;
         rfa00c3_impl.this.AV29FlagIdioma = GXv_int3[0] ;
         AV30vMoneda = httpContext.getMessage( "Pesetas", "") ;
         if ( AV29FlagIdioma == 1 )
         {
            AV30vMoneda = httpContext.getMessage( "Escudos", "") ;
         }
         /* Using cursor P06WX2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P06WX2_A407EmprNom[0] ;
            n407EmprNom = P06WX2_n407EmprNom[0] ;
            A3915EmpNumDec = P06WX2_A3915EmpNumDec[0] ;
            n3915EmpNumDec = P06WX2_n3915EmpNumDec[0] ;
            AV10EmprNom = A407EmprNom ;
            if ( A3915EmpNumDec > 0 )
            {
               AV30vMoneda = httpContext.getMessage( "Euros", "") ;
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         h6WX0( false, 113) ;
         getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10EmprNom, "")), 13, Gx_line+6, 264, Gx_line+24, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV11Lit1, "")), 745, Gx_line+6, 782, Gx_line+24, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 796, Gx_line+6, 855, Gx_line+23, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12Lit2, "")), 876, Gx_line+6, 906, Gx_line+24, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 942, Gx_line+6, 1001, Gx_line+23, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV13Lit0, "")), 13, Gx_line+32, 347, Gx_line+50, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14Lit3, "")), 876, Gx_line+32, 921, Gx_line+50, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 949, Gx_line+32, 994, Gx_line+49, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawLine(0, Gx_line+56, 1003, Gx_line+56, 2, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "De:", ""), 11, Gx_line+63, 34, Gx_line+80, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV8Pfecha, "99/99/99"), 48, Gx_line+63, 107, Gx_line+80, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "a", ""), 121, Gx_line+63, 129, Gx_line+80, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV9Ufecha, "99/99/99"), 143, Gx_line+63, 202, Gx_line+80, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV16Lit4, "")), 340, Gx_line+91, 450, Gx_line+109, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawLine(5, Gx_line+109, 1003, Gx_line+109, 1, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30vMoneda, "")), 588, Gx_line+91, 662, Gx_line+109, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31Lit6, "")), 726, Gx_line+91, 800, Gx_line+109, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Clientes:", ""), 229, Gx_line+63, 296, Gx_line+80, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV33PCliCod), "ZZZZZ9")), 302, Gx_line+63, 347, Gx_line+80, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV34UCliCod), "ZZZZZ9")), 360, Gx_line+63, 405, Gx_line+80, 2+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Metros", ""), 891, Gx_line+91, 936, Gx_line+108, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 16, Gx_line+91, 68, Gx_line+108, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV56Pgmname, "")), 408, Gx_line+33, 628, Gx_line+50, 0+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+113) ;
         AV22TotTotal = DecimalUtil.doubleToDec(0) ;
         AV27TotKgsT = DecimalUtil.doubleToDec(0) ;
         AV38TotMtsT = DecimalUtil.doubleToDec(0) ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              AV8Pfecha ,
                                              AV9Ufecha ,
                                              Integer.valueOf(AV33PCliCod) ,
                                              Integer.valueOf(AV34UCliCod) ,
                                              A436FacFch ,
                                              Integer.valueOf(A252CliCod) ,
                                              A450FacPri ,
                                              AV53barpri ,
                                              Byte.valueOf(A1153FacTipFac) ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING
                                              }
         });
         /* Using cursor P06WX3 */
         pr_default.execute(1, new Object[] {A396EmprCod, AV53barpri, AV8Pfecha, AV9Ufecha, Integer.valueOf(AV33PCliCod), Integer.valueOf(AV34UCliCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            brk6WX3 = false ;
            A450FacPri = P06WX3_A450FacPri[0] ;
            A1153FacTipFac = P06WX3_A1153FacTipFac[0] ;
            A449FacPreMts = P06WX3_A449FacPreMts[0] ;
            A447FacMts = P06WX3_A447FacMts[0] ;
            A448FacPreKgs = P06WX3_A448FacPreKgs[0] ;
            A444FacKgs = P06WX3_A444FacKgs[0] ;
            A1296FacBarPar = P06WX3_A1296FacBarPar[0] ;
            A1295FacBarReo = P06WX3_A1295FacBarReo[0] ;
            A1294FacBarCod = P06WX3_A1294FacBarCod[0] ;
            A430FacCod = P06WX3_A430FacCod[0] ;
            A3397FacFasCod = P06WX3_A3397FacFasCod[0] ;
            A436FacFch = P06WX3_A436FacFch[0] ;
            A279CliNom = P06WX3_A279CliNom[0] ;
            A252CliCod = P06WX3_A252CliCod[0] ;
            A3883FacCliCod = P06WX3_A3883FacCliCod[0] ;
            A446FacLin = P06WX3_A446FacLin[0] ;
            A450FacPri = P06WX3_A450FacPri[0] ;
            A1153FacTipFac = P06WX3_A1153FacTipFac[0] ;
            A436FacFch = P06WX3_A436FacFch[0] ;
            A252CliCod = P06WX3_A252CliCod[0] ;
            A279CliNom = P06WX3_A279CliNom[0] ;
            AV44Tot_tc = DecimalUtil.doubleToDec(0) ;
            AV45Tot_kc = DecimalUtil.doubleToDec(0) ;
            AV46Tot_mc = DecimalUtil.doubleToDec(0) ;
            AV47F_cliente = (byte)(0) ;
            while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P06WX3_A396EmprCod[0], A396EmprCod) == 0 ) && ( P06WX3_A252CliCod[0] == A252CliCod ) )
            {
               brk6WX3 = false ;
               A450FacPri = P06WX3_A450FacPri[0] ;
               A1153FacTipFac = P06WX3_A1153FacTipFac[0] ;
               A449FacPreMts = P06WX3_A449FacPreMts[0] ;
               A447FacMts = P06WX3_A447FacMts[0] ;
               A448FacPreKgs = P06WX3_A448FacPreKgs[0] ;
               A444FacKgs = P06WX3_A444FacKgs[0] ;
               A1296FacBarPar = P06WX3_A1296FacBarPar[0] ;
               A1295FacBarReo = P06WX3_A1295FacBarReo[0] ;
               A1294FacBarCod = P06WX3_A1294FacBarCod[0] ;
               A430FacCod = P06WX3_A430FacCod[0] ;
               A3397FacFasCod = P06WX3_A3397FacFasCod[0] ;
               A436FacFch = P06WX3_A436FacFch[0] ;
               A279CliNom = P06WX3_A279CliNom[0] ;
               A446FacLin = P06WX3_A446FacLin[0] ;
               A450FacPri = P06WX3_A450FacPri[0] ;
               A1153FacTipFac = P06WX3_A1153FacTipFac[0] ;
               A436FacFch = P06WX3_A436FacFch[0] ;
               A279CliNom = P06WX3_A279CliNom[0] ;
               if ( GXutil.strcmp(A450FacPri, AV53barpri) == 0 )
               {
                  if ( A1153FacTipFac == 0 )
                  {
                     if ( (GXutil.strcmp("", AV48FasCodi)==0) || ( ( GXutil.strcmp(A3397FacFasCod, AV48FasCodi) >= 0 ) ) )
                     {
                        if ( (GXutil.strcmp("", AV49FasCod_f)==0) || ( ( GXutil.strcmp(A3397FacFasCod, AV49FasCod_f) <= 0 ) ) )
                        {
                           W252CliCod = A252CliCod ;
                           AV15TotFase = DecimalUtil.doubleToDec(0) ;
                           AV26TotKgs = DecimalUtil.doubleToDec(0) ;
                           AV37TotMts = DecimalUtil.doubleToDec(0) ;
                           AV39Kgs_Fra = DecimalUtil.doubleToDec(0) ;
                           AV40FacKgs = DecimalUtil.doubleToDec(0) ;
                           AV43Fac_Hdr = "" ;
                           AV41LastFacHdr = "" ;
                           while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P06WX3_A396EmprCod[0], A396EmprCod) == 0 ) && ( P06WX3_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(P06WX3_A3397FacFasCod[0], A3397FacFasCod) == 0 ) )
                           {
                              brk6WX3 = false ;
                              A449FacPreMts = P06WX3_A449FacPreMts[0] ;
                              A447FacMts = P06WX3_A447FacMts[0] ;
                              A448FacPreKgs = P06WX3_A448FacPreKgs[0] ;
                              A444FacKgs = P06WX3_A444FacKgs[0] ;
                              A1296FacBarPar = P06WX3_A1296FacBarPar[0] ;
                              A1295FacBarReo = P06WX3_A1295FacBarReo[0] ;
                              A1294FacBarCod = P06WX3_A1294FacBarCod[0] ;
                              A430FacCod = P06WX3_A430FacCod[0] ;
                              A446FacLin = P06WX3_A446FacLin[0] ;
                              AV52Total = GXutil.roundDecimal( A444FacKgs.multiply(A448FacPreKgs), 2).add(GXutil.roundDecimal( A447FacMts.multiply(A449FacPreMts), 2)) ;
                              AV15TotFase = AV15TotFase.add((GXutil.roundDecimal( A444FacKgs.multiply(A448FacPreKgs), 2).add(GXutil.roundDecimal( A447FacMts.multiply(A449FacPreMts), 2)))) ;
                              AV43Fac_Hdr = GXutil.str( A430FacCod, 10, 0) + GXutil.str( A1294FacBarCod, 8, 0) + GXutil.str( A1295FacBarReo, 1, 0) + A1296FacBarPar ;
                              AV51FacPreKgs = A448FacPreKgs ;
                              AV50FacPreMts = A449FacPreMts ;
                              if ( GXutil.strcmp(AV43Fac_Hdr, AV41LastFacHdr) != 0 )
                              {
                                 if ( ( A448FacPreKgs.doubleValue() > 0 ) && ( A444FacKgs.doubleValue() > 0 ) )
                                 {
                                    AV26TotKgs = AV26TotKgs.add(A444FacKgs) ;
                                 }
                                 if ( ( A449FacPreMts.doubleValue() > 0 ) && ( A447FacMts.doubleValue() > 0 ) )
                                 {
                                    AV37TotMts = AV37TotMts.add(A447FacMts) ;
                                 }
                              }
                              AV41LastFacHdr = GXutil.str( A430FacCod, 10, 0) + GXutil.str( A1294FacBarCod, 8, 0) + GXutil.str( A1295FacBarReo, 1, 0) + A1296FacBarPar ;
                              brk6WX3 = true ;
                              pr_default.readNext(1);
                           }
                           if ( (GXutil.strcmp("", A3397FacFasCod)==0) )
                           {
                              AV21FasDsc = httpContext.getMessage( "Tinturaria", "") ;
                           }
                           else
                           {
                              AV21FasDsc = " " ;
                              /* Using cursor P06WX4 */
                              pr_default.execute(2, new Object[] {A396EmprCod, A3397FacFasCod});
                              while ( (pr_default.getStatus(2) != 101) )
                              {
                                 A457FasCod = P06WX4_A457FasCod[0] ;
                                 A460FasDsc = P06WX4_A460FasDsc[0] ;
                                 AV21FasDsc = A460FasDsc ;
                                 /* Exiting from a For First loop. */
                                 if (true) break;
                              }
                              pr_default.close(2);
                           }
                           if ( AV47F_cliente == 0 )
                           {
                              AV47F_cliente = (byte)(1) ;
                              h6WX0( false, 18) ;
                              getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21FasDsc, "")), 340, Gx_line+0, 545, Gx_line+17, 0+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV15TotFase, "ZZ,ZZZ,ZZ9.99")), 566, Gx_line+1, 662, Gx_line+18, 2+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV26TotKgs, "ZZZ,ZZZ,ZZ9.99")), 697, Gx_line+1, 800, Gx_line+18, 2+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A3397FacFasCod, "")), 948, Gx_line+1, 1007, Gx_line+18, 0+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV37TotMts, "ZZZ,ZZZ,ZZ9.99")), 832, Gx_line+1, 935, Gx_line+18, 2+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 16, Gx_line+0, 61, Gx_line+17, 2+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 76, Gx_line+1, 296, Gx_line+18, 0+256, 0, 0, 0) ;
                              Gx_OldLine = Gx_line ;
                              Gx_line = (int)(Gx_line+18) ;
                           }
                           else
                           {
                              h6WX0( false, 18) ;
                              getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21FasDsc, "")), 340, Gx_line+0, 545, Gx_line+17, 0+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV15TotFase, "ZZ,ZZZ,ZZ9.99")), 566, Gx_line+1, 662, Gx_line+18, 2+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV26TotKgs, "ZZZ,ZZZ,ZZ9.99")), 697, Gx_line+1, 800, Gx_line+18, 2+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A3397FacFasCod, "")), 948, Gx_line+1, 1007, Gx_line+18, 0+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV37TotMts, "ZZZ,ZZZ,ZZ9.99")), 832, Gx_line+1, 935, Gx_line+18, 2+256, 0, 0, 0) ;
                              Gx_OldLine = Gx_line ;
                              Gx_line = (int)(Gx_line+18) ;
                           }
                           AV22TotTotal = AV22TotTotal.add(AV15TotFase) ;
                           AV27TotKgsT = AV27TotKgsT.add(AV26TotKgs) ;
                           AV38TotMtsT = AV38TotMtsT.add(AV37TotMts) ;
                           AV44Tot_tc = AV44Tot_tc.add(AV15TotFase) ;
                           AV45Tot_kc = AV45Tot_kc.add(AV26TotKgs) ;
                           AV46Tot_mc = AV46Tot_mc.add(AV37TotMts) ;
                           A252CliCod = W252CliCod ;
                        }
                     }
                  }
               }
               if ( ! brk6WX3 )
               {
                  brk6WX3 = true ;
                  pr_default.readNext(1);
               }
            }
            h6WX0( false, 31) ;
            getPrinter().GxAttris("Courier New", 9, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV44Tot_tc, "ZZ,ZZZ,ZZ9.99")), 566, Gx_line+7, 662, Gx_line+25, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV45Tot_kc, "ZZ,ZZZ,ZZ9.99")), 704, Gx_line+7, 800, Gx_line+25, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV46Tot_mc, "ZZ,ZZZ,ZZ9.99")), 840, Gx_line+7, 936, Gx_line+25, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+31) ;
            if ( ! brk6WX3 )
            {
               brk6WX3 = true ;
               pr_default.readNext(1);
            }
         }
         pr_default.close(1);
         h6WX0( false, 21) ;
         getPrinter().GxAttris("Courier New", 9, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV22TotTotal, "ZZ,ZZZ,ZZ9.99")), 566, Gx_line+3, 662, Gx_line+21, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27TotKgsT, "ZZZ,ZZZ,ZZ9.99")), 697, Gx_line+3, 800, Gx_line+21, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV38TotMtsT, "ZZZ,ZZZ,ZZ9.99")), 832, Gx_line+3, 935, Gx_line+21, 2+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+21) ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6WX0( true, 0) ;
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

   public void h6WX0( boolean bFoot ,
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

   public void add_metrics( )
   {
      add_metrics0( ) ;
      add_metrics1( ) ;
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Courier New", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Courier New", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
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
      AV8Pfecha = GXutil.nullDate() ;
      AV9Ufecha = GXutil.nullDate() ;
      AV48FasCodi = "" ;
      AV49FasCod_f = "" ;
      AV53barpri = "" ;
      AV13Lit0 = "" ;
      AV56Pgmname = "" ;
      AV11Lit1 = "" ;
      AV12Lit2 = "" ;
      AV14Lit3 = "" ;
      AV16Lit4 = "" ;
      AV28Lit5 = "" ;
      AV17Lit11 = "" ;
      AV31Lit6 = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV57Pgmdesc = "" ;
      GXv_int3 = new byte[1] ;
      AV30vMoneda = "" ;
      scmdbuf = "" ;
      P06WX2_A396EmprCod = new String[] {""} ;
      P06WX2_A407EmprNom = new String[] {""} ;
      P06WX2_n407EmprNom = new boolean[] {false} ;
      P06WX2_A3915EmpNumDec = new byte[1] ;
      P06WX2_n3915EmpNumDec = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV10EmprNom = "" ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      AV22TotTotal = DecimalUtil.ZERO ;
      AV27TotKgsT = DecimalUtil.ZERO ;
      AV38TotMtsT = DecimalUtil.ZERO ;
      A436FacFch = GXutil.nullDate() ;
      A450FacPri = "" ;
      P06WX3_A396EmprCod = new String[] {""} ;
      P06WX3_A450FacPri = new String[] {""} ;
      P06WX3_A1153FacTipFac = new byte[1] ;
      P06WX3_A449FacPreMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06WX3_A447FacMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06WX3_A448FacPreKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06WX3_A444FacKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06WX3_A1296FacBarPar = new String[] {""} ;
      P06WX3_A1295FacBarReo = new byte[1] ;
      P06WX3_A1294FacBarCod = new int[1] ;
      P06WX3_A430FacCod = new int[1] ;
      P06WX3_A3397FacFasCod = new String[] {""} ;
      P06WX3_A436FacFch = new java.util.Date[] {GXutil.nullDate()} ;
      P06WX3_A279CliNom = new String[] {""} ;
      P06WX3_A252CliCod = new int[1] ;
      P06WX3_A3883FacCliCod = new int[1] ;
      P06WX3_A446FacLin = new int[1] ;
      A449FacPreMts = DecimalUtil.ZERO ;
      A447FacMts = DecimalUtil.ZERO ;
      A448FacPreKgs = DecimalUtil.ZERO ;
      A444FacKgs = DecimalUtil.ZERO ;
      A1296FacBarPar = "" ;
      A3397FacFasCod = "" ;
      A279CliNom = "" ;
      AV44Tot_tc = DecimalUtil.ZERO ;
      AV45Tot_kc = DecimalUtil.ZERO ;
      AV46Tot_mc = DecimalUtil.ZERO ;
      AV15TotFase = DecimalUtil.ZERO ;
      AV26TotKgs = DecimalUtil.ZERO ;
      AV37TotMts = DecimalUtil.ZERO ;
      AV39Kgs_Fra = DecimalUtil.ZERO ;
      AV40FacKgs = DecimalUtil.ZERO ;
      AV43Fac_Hdr = "" ;
      AV41LastFacHdr = "" ;
      AV52Total = DecimalUtil.ZERO ;
      AV51FacPreKgs = DecimalUtil.ZERO ;
      AV50FacPreMts = DecimalUtil.ZERO ;
      AV21FasDsc = "" ;
      P06WX4_A396EmprCod = new String[] {""} ;
      P06WX4_A457FasCod = new String[] {""} ;
      P06WX4_A460FasDsc = new String[] {""} ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.rfa00c3__default(),
         new Object[] {
             new Object[] {
            P06WX2_A396EmprCod, P06WX2_A407EmprNom, P06WX2_n407EmprNom, P06WX2_A3915EmpNumDec, P06WX2_n3915EmpNumDec
            }
            , new Object[] {
            P06WX3_A396EmprCod, P06WX3_A450FacPri, P06WX3_A1153FacTipFac, P06WX3_A449FacPreMts, P06WX3_A447FacMts, P06WX3_A448FacPreKgs, P06WX3_A444FacKgs, P06WX3_A1296FacBarPar, P06WX3_A1295FacBarReo, P06WX3_A1294FacBarCod,
            P06WX3_A430FacCod, P06WX3_A3397FacFasCod, P06WX3_A436FacFch, P06WX3_A279CliNom, P06WX3_A252CliCod, P06WX3_A3883FacCliCod, P06WX3_A446FacLin
            }
            , new Object[] {
            P06WX4_A396EmprCod, P06WX4_A457FasCod, P06WX4_A460FasDsc
            }
         }
      );
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      AV57Pgmdesc = httpContext.getMessage( "Facturacion p/Fases (Clientes)", "") ;
      AV56Pgmname = "Facturacion.RFA00C3" ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      AV57Pgmdesc = httpContext.getMessage( "Facturacion p/Fases (Clientes)", "") ;
      AV56Pgmname = "Facturacion.RFA00C3" ;
      Gx_err = (short)(0) ;
   }

   private byte AV29FlagIdioma ;
   private byte GXv_int3[] ;
   private byte A3915EmpNumDec ;
   private byte A1153FacTipFac ;
   private byte A1295FacBarReo ;
   private byte AV47F_cliente ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int AV33PCliCod ;
   private int AV34UCliCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int A252CliCod ;
   private int A1294FacBarCod ;
   private int A430FacCod ;
   private int A3883FacCliCod ;
   private int A446FacLin ;
   private int W252CliCod ;
   private java.math.BigDecimal AV22TotTotal ;
   private java.math.BigDecimal AV27TotKgsT ;
   private java.math.BigDecimal AV38TotMtsT ;
   private java.math.BigDecimal A449FacPreMts ;
   private java.math.BigDecimal A447FacMts ;
   private java.math.BigDecimal A448FacPreKgs ;
   private java.math.BigDecimal A444FacKgs ;
   private java.math.BigDecimal AV44Tot_tc ;
   private java.math.BigDecimal AV45Tot_kc ;
   private java.math.BigDecimal AV46Tot_mc ;
   private java.math.BigDecimal AV15TotFase ;
   private java.math.BigDecimal AV26TotKgs ;
   private java.math.BigDecimal AV37TotMts ;
   private java.math.BigDecimal AV39Kgs_Fra ;
   private java.math.BigDecimal AV40FacKgs ;
   private java.math.BigDecimal AV52Total ;
   private java.math.BigDecimal AV51FacPreKgs ;
   private java.math.BigDecimal AV50FacPreMts ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV48FasCodi ;
   private String AV49FasCod_f ;
   private String AV53barpri ;
   private String AV13Lit0 ;
   private String AV56Pgmname ;
   private String AV11Lit1 ;
   private String AV12Lit2 ;
   private String AV14Lit3 ;
   private String AV16Lit4 ;
   private String AV28Lit5 ;
   private String AV17Lit11 ;
   private String AV31Lit6 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV57Pgmdesc ;
   private String AV30vMoneda ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV10EmprNom ;
   private String Gx_time ;
   private String A450FacPri ;
   private String A1296FacBarPar ;
   private String A3397FacFasCod ;
   private String A279CliNom ;
   private String AV43Fac_Hdr ;
   private String AV41LastFacHdr ;
   private String AV21FasDsc ;
   private String A457FasCod ;
   private String A460FasDsc ;
   private java.util.Date AV8Pfecha ;
   private java.util.Date AV9Ufecha ;
   private java.util.Date Gx_date ;
   private java.util.Date A436FacFch ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean n3915EmpNumDec ;
   private boolean brk6WX3 ;
   private IDataStoreProvider pr_default ;
   private String[] P06WX2_A396EmprCod ;
   private String[] P06WX2_A407EmprNom ;
   private boolean[] P06WX2_n407EmprNom ;
   private byte[] P06WX2_A3915EmpNumDec ;
   private boolean[] P06WX2_n3915EmpNumDec ;
   private String[] P06WX3_A396EmprCod ;
   private String[] P06WX3_A450FacPri ;
   private byte[] P06WX3_A1153FacTipFac ;
   private java.math.BigDecimal[] P06WX3_A449FacPreMts ;
   private java.math.BigDecimal[] P06WX3_A447FacMts ;
   private java.math.BigDecimal[] P06WX3_A448FacPreKgs ;
   private java.math.BigDecimal[] P06WX3_A444FacKgs ;
   private String[] P06WX3_A1296FacBarPar ;
   private byte[] P06WX3_A1295FacBarReo ;
   private int[] P06WX3_A1294FacBarCod ;
   private int[] P06WX3_A430FacCod ;
   private String[] P06WX3_A3397FacFasCod ;
   private java.util.Date[] P06WX3_A436FacFch ;
   private String[] P06WX3_A279CliNom ;
   private int[] P06WX3_A252CliCod ;
   private int[] P06WX3_A3883FacCliCod ;
   private int[] P06WX3_A446FacLin ;
   private String[] P06WX4_A396EmprCod ;
   private String[] P06WX4_A457FasCod ;
   private String[] P06WX4_A460FasDsc ;
}

final  class rfa00c3__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P06WX3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV8Pfecha ,
                                          java.util.Date AV9Ufecha ,
                                          int AV33PCliCod ,
                                          int AV34UCliCod ,
                                          java.util.Date A436FacFch ,
                                          int A252CliCod ,
                                          String A450FacPri ,
                                          String AV53barpri ,
                                          byte A1153FacTipFac ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[6];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T2.FacPri, T2.FacTipFac, T1.FacPreMts, T1.FacMts, T1.FacPreKgs, T1.FacKgs, T1.FacBarPar, T1.FacBarReo, T1.FacBarCod, T1.FacCod, T1.FacFasCod," ;
      scmdbuf += " T2.FacFch, T3.CliNom, T2.CliCod, T1.FacCliCod, T1.FacLin FROM ((TXPLFAVEN T1 INNER JOIN TXPCFAVEN T2 ON T2.EmprCod = T1.EmprCod AND T2.FacCod = T1.FacCod) LEFT" ;
      scmdbuf += " JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T2.FacPri = ?)");
      addWhere(sWhereString, "(T2.FacTipFac = 0)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV8Pfecha)) )
      {
         addWhere(sWhereString, "(T2.FacFch >= ?)");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV9Ufecha)) )
      {
         addWhere(sWhereString, "(T2.FacFch <= ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( ! (0==AV33PCliCod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (0==AV34UCliCod) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T2.CliCod, T1.FacFasCod, T1.FacCod, T1.FacBarCod, T1.FacBarReo, T1.FacBarPar" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.IHttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 1 :
                  return conditional_P06WX3(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (java.util.Date)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).byteValue() , (String)dynConstraints[9] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06WX2", "SELECT EmprCod, EmprNom, EmpNumDec FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06WX3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06WX4", "SELECT EmprCod, FasCod, FasDsc FROM TXPFASPRO WHERE EmprCod = ? and FasCod = ? ORDER BY EmprCod, FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 8);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 30);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               ((int[]) buf[15])[0] = rslt.getInt(16);
               ((int[]) buf[16])[0] = rslt.getInt(17);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 28);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      short sIdx;
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[6], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[8]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[9]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[10]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[11]).intValue());
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
      }
   }

}

