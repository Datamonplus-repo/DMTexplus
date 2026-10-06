package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rccestdet_impl extends GXWebReport
{
   public rccestdet_impl( com.genexus.internet.HttpContext context )
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
            AV9BarIni = (int)(GXutil.lval( httpContext.GetPar( "BarIni"))) ;
            AV8BarFin = (int)(GXutil.lval( httpContext.GetPar( "BarFin"))) ;
            AV24ReoIni = (byte)(GXutil.lval( httpContext.GetPar( "ReoIni"))) ;
            AV23ReoFin = (byte)(GXutil.lval( httpContext.GetPar( "ReoFin"))) ;
            AV22ParIni = httpContext.GetPar( "ParIni") ;
            AV21ParFin = httpContext.GetPar( "ParFin") ;
            AV13CliIni = (int)(GXutil.lval( httpContext.GetPar( "CliIni"))) ;
            AV12CliFin = (int)(GXutil.lval( httpContext.GetPar( "CliFin"))) ;
            AV11CCTIni = (int)(GXutil.lval( httpContext.GetPar( "CCTIni"))) ;
            AV10CCTFin = (int)(GXutil.lval( httpContext.GetPar( "CCTFin"))) ;
            AV15FchIni = localUtil.parseDateParm( httpContext.GetPar( "FchIni")) ;
            AV14FchFin = localUtil.parseDateParm( httpContext.GetPar( "FchFin")) ;
            AV17NivIni = httpContext.GetPar( "NivIni") ;
            AV16NivFin = httpContext.GetPar( "NivFin") ;
            AV32TipoCtr = httpContext.GetPar( "TipoCtr") ;
            AV37Barseri = httpContext.GetPar( "Barseri") ;
            AV38barserf = httpContext.GetPar( "barserf") ;
            AV33Barcolnom = httpContext.GetPar( "Barcolnom") ;
            AV34Barcolnomf = httpContext.GetPar( "Barcolnomf") ;
            AV35Barcolnum = (int)(GXutil.lval( httpContext.GetPar( "Barcolnum"))) ;
            AV36Barcolnumf = (int)(GXutil.lval( httpContext.GetPar( "Barcolnumf"))) ;
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
      M_bot = 6 ;
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
         Gx_out = "FIL" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*6)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         AV31Tot = 0 ;
         /* Using cursor P06MW2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV9BarIni), Integer.valueOf(AV9BarIni), Integer.valueOf(AV8BarFin), Integer.valueOf(AV8BarFin), Byte.valueOf(AV24ReoIni), Byte.valueOf(AV24ReoIni), Byte.valueOf(AV23ReoFin), Byte.valueOf(AV23ReoFin), AV22ParIni, AV22ParIni, AV21ParFin, AV21ParFin, Integer.valueOf(AV13CliIni), Integer.valueOf(AV13CliIni), Integer.valueOf(AV12CliFin), Integer.valueOf(AV12CliFin), AV37Barseri, AV37Barseri, AV38barserf, AV38barserf, AV33Barcolnom, AV33Barcolnom, AV34Barcolnomf, AV34Barcolnomf, Integer.valueOf(AV35Barcolnum), Integer.valueOf(AV35Barcolnum), Integer.valueOf(AV36Barcolnumf), Integer.valueOf(AV36Barcolnumf), Integer.valueOf(AV11CCTIni), Integer.valueOf(AV11CCTIni), Integer.valueOf(AV10CCTFin), Integer.valueOf(AV10CCTFin), AV15FchIni, AV15FchIni, AV14FchFin, AV14FchFin, AV17NivIni, AV17NivIni, AV16NivFin, AV16NivFin, AV32TipoCtr});
         while ( (pr_default.getStatus(0) != 101) )
         {
            brk6MW3 = false ;
            A194BarOrdLin = P06MW2_A194BarOrdLin[0] ;
            A4037CCTTpoCtr = P06MW2_A4037CCTTpoCtr[0] ;
            A252CliCod = P06MW2_A252CliCod[0] ;
            n252CliCod = P06MW2_n252CliCod[0] ;
            A212BarSer = P06MW2_A212BarSer[0] ;
            A135BarColNom = P06MW2_A135BarColNom[0] ;
            A136BarColNum = P06MW2_A136BarColNum[0] ;
            A4035CCVal = P06MW2_A4035CCVal[0] ;
            A4043CCTLinDsc = P06MW2_A4043CCTLinDsc[0] ;
            A4034CCTLin = P06MW2_A4034CCTLin[0] ;
            A4033CCFch = P06MW2_A4033CCFch[0] ;
            n4033CCFch = P06MW2_n4033CCFch[0] ;
            A4032CCOpeCod = P06MW2_A4032CCOpeCod[0] ;
            n4032CCOpeCod = P06MW2_n4032CCOpeCod[0] ;
            A4036CCTDsc = P06MW2_A4036CCTDsc[0] ;
            A4031CCTCod = P06MW2_A4031CCTCod[0] ;
            A457FasCod = P06MW2_A457FasCod[0] ;
            A758ProCod = P06MW2_A758ProCod[0] ;
            A130BarCodPar = P06MW2_A130BarCodPar[0] ;
            A132BarCodReo = P06MW2_A132BarCodReo[0] ;
            A129BarCod = P06MW2_A129BarCod[0] ;
            A3281CcObs = P06MW2_A3281CcObs[0] ;
            n3281CcObs = P06MW2_n3281CcObs[0] ;
            A4037CCTTpoCtr = P06MW2_A4037CCTTpoCtr[0] ;
            A4036CCTDsc = P06MW2_A4036CCTDsc[0] ;
            A4043CCTLinDsc = P06MW2_A4043CCTLinDsc[0] ;
            A252CliCod = P06MW2_A252CliCod[0] ;
            n252CliCod = P06MW2_n252CliCod[0] ;
            A212BarSer = P06MW2_A212BarSer[0] ;
            A135BarColNom = P06MW2_A135BarColNom[0] ;
            A136BarColNum = P06MW2_A136BarColNum[0] ;
            A457FasCod = P06MW2_A457FasCod[0] ;
            A4033CCFch = P06MW2_A4033CCFch[0] ;
            n4033CCFch = P06MW2_n4033CCFch[0] ;
            A4032CCOpeCod = P06MW2_A4032CCOpeCod[0] ;
            n4032CCOpeCod = P06MW2_n4032CCOpeCod[0] ;
            A3281CcObs = P06MW2_A3281CcObs[0] ;
            n3281CcObs = P06MW2_n3281CcObs[0] ;
            while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P06MW2_A4035CCVal[0], A4035CCVal) == 0 ) )
            {
               brk6MW3 = false ;
               A194BarOrdLin = P06MW2_A194BarOrdLin[0] ;
               A4037CCTTpoCtr = P06MW2_A4037CCTTpoCtr[0] ;
               A252CliCod = P06MW2_A252CliCod[0] ;
               n252CliCod = P06MW2_n252CliCod[0] ;
               A212BarSer = P06MW2_A212BarSer[0] ;
               A135BarColNom = P06MW2_A135BarColNom[0] ;
               A136BarColNum = P06MW2_A136BarColNum[0] ;
               A4043CCTLinDsc = P06MW2_A4043CCTLinDsc[0] ;
               A4034CCTLin = P06MW2_A4034CCTLin[0] ;
               A4033CCFch = P06MW2_A4033CCFch[0] ;
               n4033CCFch = P06MW2_n4033CCFch[0] ;
               A4032CCOpeCod = P06MW2_A4032CCOpeCod[0] ;
               n4032CCOpeCod = P06MW2_n4032CCOpeCod[0] ;
               A4036CCTDsc = P06MW2_A4036CCTDsc[0] ;
               A4031CCTCod = P06MW2_A4031CCTCod[0] ;
               A457FasCod = P06MW2_A457FasCod[0] ;
               A758ProCod = P06MW2_A758ProCod[0] ;
               A130BarCodPar = P06MW2_A130BarCodPar[0] ;
               A132BarCodReo = P06MW2_A132BarCodReo[0] ;
               A129BarCod = P06MW2_A129BarCod[0] ;
               A3281CcObs = P06MW2_A3281CcObs[0] ;
               n3281CcObs = P06MW2_n3281CcObs[0] ;
               A4037CCTTpoCtr = P06MW2_A4037CCTTpoCtr[0] ;
               A4036CCTDsc = P06MW2_A4036CCTDsc[0] ;
               A4043CCTLinDsc = P06MW2_A4043CCTLinDsc[0] ;
               A252CliCod = P06MW2_A252CliCod[0] ;
               n252CliCod = P06MW2_n252CliCod[0] ;
               A212BarSer = P06MW2_A212BarSer[0] ;
               A135BarColNom = P06MW2_A135BarColNom[0] ;
               A136BarColNum = P06MW2_A136BarColNum[0] ;
               A457FasCod = P06MW2_A457FasCod[0] ;
               A4033CCFch = P06MW2_A4033CCFch[0] ;
               n4033CCFch = P06MW2_n4033CCFch[0] ;
               A4032CCOpeCod = P06MW2_A4032CCOpeCod[0] ;
               n4032CCOpeCod = P06MW2_n4032CCOpeCod[0] ;
               A3281CcObs = P06MW2_A3281CcObs[0] ;
               n3281CcObs = P06MW2_n3281CcObs[0] ;
               if ( GXutil.strcmp(P06MW2_A396EmprCod[0], A396EmprCod) == 0 )
               {
                  if ( ( A252CliCod >= AV13CliIni ) || ( (0==AV13CliIni) ) )
                  {
                     if ( ( A252CliCod <= AV12CliFin ) || ( (0==AV12CliFin) ) )
                     {
                        if ( ( GXutil.strcmp(A212BarSer, AV37Barseri) >= 0 ) || (GXutil.strcmp("", AV37Barseri)==0) )
                        {
                           if ( ( GXutil.strcmp(A212BarSer, AV38barserf) <= 0 ) || (GXutil.strcmp("", AV38barserf)==0) )
                           {
                              if ( ( GXutil.strcmp(A135BarColNom, AV33Barcolnom) >= 0 ) || (GXutil.strcmp("", AV33Barcolnom)==0) )
                              {
                                 if ( ( GXutil.strcmp(A135BarColNom, AV34Barcolnomf) <= 0 ) || (GXutil.strcmp("", AV34Barcolnomf)==0) )
                                 {
                                    if ( ( A136BarColNum >= AV35Barcolnum ) || (0==AV35Barcolnum) )
                                    {
                                       if ( ( A136BarColNum <= AV36Barcolnumf ) || (0==AV36Barcolnumf) )
                                       {
                                          if ( (( GXutil.resetTime(A4033CCFch).after( GXutil.resetTime( AV15FchIni )) ) || ( GXutil.dateCompare(GXutil.resetTime(A4033CCFch), GXutil.resetTime(AV15FchIni)) )) || ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV15FchIni)) ) )
                                          {
                                             if ( (( GXutil.resetTime(A4033CCFch).before( GXutil.resetTime( AV14FchFin )) ) || ( GXutil.dateCompare(GXutil.resetTime(A4033CCFch), GXutil.resetTime(AV14FchFin)) )) || ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV14FchFin)) ) )
                                             {
                                                if ( ( GXutil.strcmp(GXutil.trim( A4035CCVal), AV17NivIni) >= 0 ) || ( (GXutil.strcmp("", AV17NivIni)==0) ) )
                                                {
                                                   if ( ( GXutil.strcmp(GXutil.trim( A4035CCVal), AV16NivFin) <= 0 ) || ( (GXutil.strcmp("", AV16NivFin)==0) ) )
                                                   {
                                                      if ( GXutil.strcmp(A4037CCTTpoCtr, AV32TipoCtr) == 0 )
                                                      {
                                                         if ( ( A129BarCod >= AV9BarIni ) || ( (0==AV9BarIni) ) )
                                                         {
                                                            if ( ( A129BarCod <= AV8BarFin ) || ( (0==AV8BarFin) ) )
                                                            {
                                                               if ( ( A132BarCodReo >= AV24ReoIni ) || ( (0==AV24ReoIni) ) )
                                                               {
                                                                  if ( ( A132BarCodReo <= AV23ReoFin ) || ( (0==AV23ReoFin) ) )
                                                                  {
                                                                     if ( ( GXutil.strcmp(A130BarCodPar, AV22ParIni) >= 0 ) || ( (GXutil.strcmp("", AV22ParIni)==0) ) )
                                                                     {
                                                                        if ( ( GXutil.strcmp(A130BarCodPar, AV21ParFin) <= 0 ) || ( (GXutil.strcmp("", AV21ParFin)==0) ) )
                                                                        {
                                                                           if ( ( A4031CCTCod >= AV11CCTIni ) || ( (0==AV11CCTIni) ) )
                                                                           {
                                                                              if ( ( A4031CCTCod <= AV10CCTFin ) || ( (0==AV10CCTFin) ) )
                                                                              {
                                                                                 AV30TotVal = (long)(AV30TotVal+1) ;
                                                                                 AV47GXLvl91 = (byte)(0) ;
                                                                                 /* Using cursor P06MW3 */
                                                                                 pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin), A4035CCVal});
                                                                                 while ( (pr_default.getStatus(1) != 101) )
                                                                                 {
                                                                                    A4051CCTVal = P06MW3_A4051CCTVal[0] ;
                                                                                    A4050CCTValDsc = P06MW3_A4050CCTValDsc[0] ;
                                                                                    A4049CCTValLin = P06MW3_A4049CCTValLin[0] ;
                                                                                    AV47GXLvl91 = (byte)(1) ;
                                                                                    AV18CCValDsc = A4050CCTValDsc ;
                                                                                    pr_default.readNext(1);
                                                                                 }
                                                                                 pr_default.close(1);
                                                                                 if ( AV47GXLvl91 == 0 )
                                                                                 {
                                                                                    AV18CCValDsc = A4035CCVal ;
                                                                                 }
                                                                                 h6MW0( false, 35) ;
                                                                                 getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                                                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), 0, Gx_line+0, 59, Gx_line+18, 2+256, 0, 0, 0) ;
                                                                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")), 63, Gx_line+0, 71, Gx_line+18, 2+256, 0, 0, 0) ;
                                                                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A130BarCodPar, "")), 75, Gx_line+0, 89, Gx_line+18, 0+256, 0, 0, 0) ;
                                                                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A758ProCod, "")), 93, Gx_line+0, 194, Gx_line+18, 0+256, 0, 0, 0) ;
                                                                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A457FasCod, "@!")), 198, Gx_line+0, 299, Gx_line+18, 0+256, 0, 0, 0) ;
                                                                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4031CCTCod), "ZZZZZ9")), 304, Gx_line+0, 349, Gx_line+18, 2+256, 0, 0, 0) ;
                                                                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4036CCTDsc, "")), 353, Gx_line+0, 542, Gx_line+18, 0+256, 0, 0, 0) ;
                                                                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4032CCOpeCod), "ZZZZZ9")), 545, Gx_line+0, 590, Gx_line+18, 2+256, 0, 0, 0) ;
                                                                                 getPrinter().GxDrawText(localUtil.format( A4033CCFch, "99/99/99"), 311, Gx_line+16, 366, Gx_line+34, 0+256, 0, 0, 0) ;
                                                                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4034CCTLin), "ZZZ9")), 371, Gx_line+16, 401, Gx_line+34, 2+256, 0, 0, 0) ;
                                                                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4043CCTLinDsc, "")), 409, Gx_line+16, 598, Gx_line+34, 0+256, 0, 0, 0) ;
                                                                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18CCValDsc, "")), 605, Gx_line+16, 794, Gx_line+34, 0+256, 0, 0, 0) ;
                                                                                 Gx_OldLine = Gx_line ;
                                                                                 Gx_line = (int)(Gx_line+35) ;
                                                                                 AV25Lins = (byte)(GXutil.gxmlines( A3281CcObs, (short)(100))) ;
                                                                                 AV26N = (byte)(0) ;
                                                                                 while ( AV26N < AV25Lins )
                                                                                 {
                                                                                    AV26N = (byte)(AV26N+1) ;
                                                                                    AV27Txt = GXutil.gxgetmli( A3281CcObs, AV26N, (short)(100)) ;
                                                                                    h6MW0( false, 18) ;
                                                                                    getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                                                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27Txt, "")), 84, Gx_line+0, 710, Gx_line+18, 0+256, 0, 0, 0) ;
                                                                                    Gx_OldLine = Gx_line ;
                                                                                    Gx_line = (int)(Gx_line+18) ;
                                                                                 }
                                                                                 if ( AV26N > 0 )
                                                                                 {
                                                                                    h6MW0( false, 5) ;
                                                                                    getPrinter().GxDrawLine(0, Gx_line+1, 793, Gx_line+1, 1, 0, 0, 0, 0) ;
                                                                                    Gx_OldLine = Gx_line ;
                                                                                    Gx_line = (int)(Gx_line+5) ;
                                                                                 }
                                                                                 h6MW0( false, 21) ;
                                                                                 getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                                                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4031CCTCod), "ZZZZZ9")), 184, Gx_line+0, 229, Gx_line+18, 2+256, 0, 0, 0) ;
                                                                                 getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                                                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4036CCTDsc, "")), 231, Gx_line+0, 420, Gx_line+18, 0+256, 0, 0, 0) ;
                                                                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18CCValDsc, "")), 458, Gx_line+0, 647, Gx_line+18, 0+256, 0, 0, 0) ;
                                                                                 Gx_OldLine = Gx_line ;
                                                                                 Gx_line = (int)(Gx_line+21) ;
                                                                              }
                                                                           }
                                                                        }
                                                                     }
                                                                  }
                                                               }
                                                            }
                                                         }
                                                      }
                                                   }
                                                }
                                             }
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
               brk6MW3 = true ;
               pr_default.readNext(0);
            }
            h6MW0( false, 18) ;
            getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV30TotVal), "ZZZZZZZZZ9")), 544, Gx_line+0, 618, Gx_line+18, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Sub-Total", ""), 444, Gx_line+0, 510, Gx_line+18, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+18) ;
            AV31Tot = (long)(AV31Tot+AV30TotVal) ;
            AV30TotVal = 0 ;
            if ( ! brk6MW3 )
            {
               brk6MW3 = true ;
               pr_default.readNext(0);
            }
         }
         pr_default.close(0);
         h6MW0( false, 18) ;
         getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV31Tot), "ZZZZZZZZZ9")), 544, Gx_line+0, 618, Gx_line+18, 2+256, 0, 0, 0) ;
         getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Total", ""), 471, Gx_line+0, 505, Gx_line+18, 0+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+18) ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6MW0( true, 0) ;
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

   public void h6MW0( boolean bFoot ,
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
            getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "TEXPLUS", ""), 21, Gx_line+1, 78, Gx_line+19, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Estadística de Controles de Calidad", ""), 279, Gx_line+57, 515, Gx_line+75, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(0, Gx_line+65, 267, Gx_line+65, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(526, Gx_line+65, 793, Gx_line+65, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fecha:", ""), 622, Gx_line+1, 667, Gx_line+19, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 723, Gx_line+0, 778, Gx_line+18, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Hora:", ""), 622, Gx_line+17, 661, Gx_line+35, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 677, Gx_line+16, 778, Gx_line+34, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Página:", ""), 622, Gx_line+32, 673, Gx_line+50, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 677, Gx_line+31, 713, Gx_line+48, 2, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "de", ""), 719, Gx_line+31, 737, Gx_line+49, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "{{Pages}}", ""), 741, Gx_line+31, 777, Gx_line+48, 2, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+76) ;
            if ( ! ( (0==AV9BarIni) && (0==AV8BarFin) && (0==AV24ReoIni) && (0==AV23ReoFin) && (GXutil.strcmp("", AV22ParIni)==0) && (GXutil.strcmp("", AV21ParFin)==0) && (0==AV13CliIni) && (0==AV12CliFin) && (0==AV11CCTIni) && (0==AV10CCTFin) && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV15FchIni)) && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV14FchFin)) && (GXutil.strcmp("", AV17NivIni)==0) && (GXutil.strcmp("", AV16NivFin)==0) ) )
            {
               getPrinter().GxDrawLine(0, Gx_line+7, 372, Gx_line+7, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(421, Gx_line+7, 793, Gx_line+7, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Filtros", ""), 376, Gx_line+0, 418, Gx_line+18, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+18) ;
            }
            if ( ! ( (0==AV9BarIni) && (0==AV8BarFin) && (0==AV24ReoIni) && (0==AV23ReoFin) && (GXutil.strcmp("", AV22ParIni)==0) && (GXutil.strcmp("", AV21ParFin)==0) ) )
            {
               getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "HDR", ""), 96, Gx_line+0, 125, Gx_line+18, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+18) ;
               /* Noskip command */
               Gx_line = Gx_OldLine ;
               if ( ! ( (0==AV9BarIni) && (0==AV24ReoIni) && (GXutil.strcmp("", AV22ParIni)==0) ) )
               {
                  getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Inicial", ""), 252, Gx_line+0, 292, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV9BarIni), "ZZZZZZZ9")), 301, Gx_line+0, 360, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV24ReoIni), "9")), 364, Gx_line+0, 372, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22ParIni, "")), 375, Gx_line+0, 389, Gx_line+18, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+18) ;
                  /* Noskip command */
                  Gx_line = Gx_OldLine ;
               }
               if ( ! ( (0==AV8BarFin) && (0==AV23ReoFin) && (GXutil.strcmp("", AV21ParFin)==0) ) )
               {
                  getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Final", ""), 509, Gx_line+0, 539, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV8BarFin), "ZZZZZZZ9")), 549, Gx_line+0, 608, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV23ReoFin), "9")), 610, Gx_line+0, 618, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21ParFin, "")), 621, Gx_line+0, 628, Gx_line+16, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+18) ;
               }
               else
               {
                  Gx_line = (int)(Gx_line+16) ;
               }
            }
            if ( ! ( (0==AV13CliIni) && (0==AV12CliFin) ) )
            {
               getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 96, Gx_line+0, 143, Gx_line+18, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+18) ;
               /* Noskip command */
               Gx_line = Gx_OldLine ;
               if ( ! ( (0==AV13CliIni) ) )
               {
                  getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Inicial", ""), 252, Gx_line+1, 292, Gx_line+19, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV13CliIni), "ZZZZZ9")), 316, Gx_line+0, 361, Gx_line+18, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+19) ;
                  /* Noskip command */
                  Gx_line = Gx_OldLine ;
               }
               if ( ! ( (0==AV12CliFin) ) )
               {
                  getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Final", ""), 509, Gx_line+0, 539, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12CliFin), "ZZZZZ9")), 564, Gx_line+0, 609, Gx_line+18, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+18) ;
               }
               else
               {
                  Gx_line = (int)(Gx_line+16) ;
               }
            }
            if ( ! ( (0==AV11CCTIni) && (0==AV10CCTFin) ) )
            {
               getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Control de Calidad", ""), 96, Gx_line+0, 219, Gx_line+18, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+18) ;
               /* Noskip command */
               Gx_line = Gx_OldLine ;
               if ( ! ( (0==AV11CCTIni) ) )
               {
                  getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Inicial", ""), 252, Gx_line+0, 292, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV11CCTIni), "ZZZZZ9")), 316, Gx_line+0, 361, Gx_line+18, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+18) ;
                  /* Noskip command */
                  Gx_line = Gx_OldLine ;
               }
               if ( ! ( (0==AV10CCTFin) ) )
               {
                  getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Final", ""), 509, Gx_line+0, 539, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV13CliIni), "ZZZZZ9")), 564, Gx_line+0, 609, Gx_line+18, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+18) ;
               }
               else
               {
                  Gx_line = (int)(Gx_line+16) ;
               }
            }
            if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV15FchIni)) && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV14FchFin)) ) )
            {
               getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 96, Gx_line+0, 136, Gx_line+18, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+18) ;
               /* Noskip command */
               Gx_line = Gx_OldLine ;
               if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV15FchIni)) ) )
               {
                  getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Inicial", ""), 252, Gx_line+0, 292, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(localUtil.format( AV15FchIni, "99/99/99"), 305, Gx_line+0, 360, Gx_line+18, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+18) ;
                  /* Noskip command */
                  Gx_line = Gx_OldLine ;
               }
               if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV14FchFin)) ) )
               {
                  getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Final", ""), 509, Gx_line+0, 539, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(localUtil.format( AV14FchFin, "99/99/99"), 553, Gx_line+0, 608, Gx_line+18, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+18) ;
               }
               else
               {
                  Gx_line = (int)(Gx_line+16) ;
               }
            }
            if ( ! ( (GXutil.strcmp("", AV17NivIni)==0) && (GXutil.strcmp("", AV16NivFin)==0) ) )
            {
               getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Nivel", ""), 96, Gx_line+0, 128, Gx_line+18, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+18) ;
               /* Noskip command */
               Gx_line = Gx_OldLine ;
               if ( ! ( (GXutil.strcmp("", AV17NivIni)==0) ) )
               {
                  GXt_char1 = AV19ValIniDsc ;
                  GXv_char2[0] = AV17NivIni ;
                  GXv_char3[0] = GXt_char1 ;
                  new app.controlcalidadhtd.pccivaldsc(remoteHandle, context).execute( GXv_char2, GXv_char3) ;
                  rccestdet_impl.this.AV17NivIni = GXv_char2[0] ;
                  rccestdet_impl.this.GXt_char1 = GXv_char3[0] ;
                  AV19ValIniDsc = GXt_char1 ;
                  getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Inicial", ""), 252, Gx_line+0, 292, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19ValIniDsc, "")), 305, Gx_line+0, 494, Gx_line+18, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+18) ;
                  /* Noskip command */
                  Gx_line = Gx_OldLine ;
               }
               if ( ! ( (GXutil.strcmp("", AV16NivFin)==0) ) )
               {
                  GXt_char1 = AV20ValFinDsc ;
                  GXv_char3[0] = AV16NivFin ;
                  GXv_char2[0] = GXt_char1 ;
                  new app.controlcalidadhtd.pccivaldsc(remoteHandle, context).execute( GXv_char3, GXv_char2) ;
                  rccestdet_impl.this.AV16NivFin = GXv_char3[0] ;
                  rccestdet_impl.this.GXt_char1 = GXv_char2[0] ;
                  AV20ValFinDsc = GXt_char1 ;
                  getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Final", ""), 509, Gx_line+0, 539, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20ValFinDsc, "")), 553, Gx_line+0, 742, Gx_line+18, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+18) ;
               }
               else
               {
                  Gx_line = (int)(Gx_line+16) ;
               }
            }
            if ( ! ( (0==AV9BarIni) && (0==AV8BarFin) && (0==AV13CliIni) && (0==AV12CliFin) && (0==AV11CCTIni) && (0==AV10CCTFin) && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV15FchIni)) && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV14FchFin)) && (GXutil.strcmp("", AV17NivIni)==0) && (GXutil.strcmp("", AV16NivFin)==0) ) )
            {
               getPrinter().GxDrawLine(0, Gx_line+4, 793, Gx_line+4, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+10) ;
            }
            getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "HDR", ""), 30, Gx_line+0, 59, Gx_line+18, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Proceso", ""), 93, Gx_line+0, 148, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fase", ""), 198, Gx_line+0, 229, Gx_line+18, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Control", ""), 353, Gx_line+0, 403, Gx_line+18, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Operario", ""), 545, Gx_line+0, 604, Gx_line+18, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 327, Gx_line+16, 367, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Variable", ""), 409, Gx_line+16, 465, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Valor", ""), 605, Gx_line+16, 641, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(0, Gx_line+34, 793, Gx_line+34, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+40) ;
            getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Control", ""), 231, Gx_line+0, 281, Gx_line+18, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Valor", ""), 458, Gx_line+0, 494, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(0, Gx_line+19, 793, Gx_line+19, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+24) ;
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
      getPrinter().setMetrics("Tahoma", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Tahoma", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
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
      AV22ParIni = "" ;
      AV21ParFin = "" ;
      AV15FchIni = GXutil.nullDate() ;
      AV14FchFin = GXutil.nullDate() ;
      AV17NivIni = "" ;
      AV16NivFin = "" ;
      AV32TipoCtr = "" ;
      AV37Barseri = "" ;
      AV38barserf = "" ;
      AV33Barcolnom = "" ;
      AV34Barcolnomf = "" ;
      scmdbuf = "" ;
      P06MW2_A194BarOrdLin = new short[1] ;
      P06MW2_A396EmprCod = new String[] {""} ;
      P06MW2_A4037CCTTpoCtr = new String[] {""} ;
      P06MW2_A252CliCod = new int[1] ;
      P06MW2_n252CliCod = new boolean[] {false} ;
      P06MW2_A212BarSer = new String[] {""} ;
      P06MW2_A135BarColNom = new String[] {""} ;
      P06MW2_A136BarColNum = new int[1] ;
      P06MW2_A4035CCVal = new String[] {""} ;
      P06MW2_A4043CCTLinDsc = new String[] {""} ;
      P06MW2_A4034CCTLin = new short[1] ;
      P06MW2_A4033CCFch = new java.util.Date[] {GXutil.nullDate()} ;
      P06MW2_n4033CCFch = new boolean[] {false} ;
      P06MW2_A4032CCOpeCod = new int[1] ;
      P06MW2_n4032CCOpeCod = new boolean[] {false} ;
      P06MW2_A4036CCTDsc = new String[] {""} ;
      P06MW2_A4031CCTCod = new int[1] ;
      P06MW2_A457FasCod = new String[] {""} ;
      P06MW2_A758ProCod = new String[] {""} ;
      P06MW2_A130BarCodPar = new String[] {""} ;
      P06MW2_A132BarCodReo = new byte[1] ;
      P06MW2_A129BarCod = new int[1] ;
      P06MW2_A3281CcObs = new String[] {""} ;
      P06MW2_n3281CcObs = new boolean[] {false} ;
      A4037CCTTpoCtr = "" ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A4035CCVal = "" ;
      A4043CCTLinDsc = "" ;
      A4033CCFch = GXutil.nullDate() ;
      A4036CCTDsc = "" ;
      A457FasCod = "" ;
      A758ProCod = "" ;
      A130BarCodPar = "" ;
      A3281CcObs = "" ;
      P06MW3_A396EmprCod = new String[] {""} ;
      P06MW3_A4031CCTCod = new int[1] ;
      P06MW3_A4034CCTLin = new short[1] ;
      P06MW3_A4051CCTVal = new String[] {""} ;
      P06MW3_A4050CCTValDsc = new String[] {""} ;
      P06MW3_A4049CCTValLin = new byte[1] ;
      A4051CCTVal = "" ;
      A4050CCTValDsc = "" ;
      AV18CCValDsc = "" ;
      AV27Txt = "" ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      AV19ValIniDsc = "" ;
      AV20ValFinDsc = "" ;
      GXt_char1 = "" ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.rccestdet__default(),
         new Object[] {
             new Object[] {
            P06MW2_A194BarOrdLin, P06MW2_A396EmprCod, P06MW2_A4037CCTTpoCtr, P06MW2_A252CliCod, P06MW2_n252CliCod, P06MW2_A212BarSer, P06MW2_A135BarColNom, P06MW2_A136BarColNum, P06MW2_A4035CCVal, P06MW2_A4043CCTLinDsc,
            P06MW2_A4034CCTLin, P06MW2_A4033CCFch, P06MW2_n4033CCFch, P06MW2_A4032CCOpeCod, P06MW2_n4032CCOpeCod, P06MW2_A4036CCTDsc, P06MW2_A4031CCTCod, P06MW2_A457FasCod, P06MW2_A758ProCod, P06MW2_A130BarCodPar,
            P06MW2_A132BarCodReo, P06MW2_A129BarCod, P06MW2_A3281CcObs, P06MW2_n3281CcObs
            }
            , new Object[] {
            P06MW3_A396EmprCod, P06MW3_A4031CCTCod, P06MW3_A4034CCTLin, P06MW3_A4051CCTVal, P06MW3_A4050CCTValDsc, P06MW3_A4049CCTValLin
            }
         }
      );
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV24ReoIni ;
   private byte AV23ReoFin ;
   private byte A132BarCodReo ;
   private byte AV47GXLvl91 ;
   private byte A4049CCTValLin ;
   private byte AV25Lins ;
   private byte AV26N ;
   private short gxcookieaux ;
   private short A194BarOrdLin ;
   private short A4034CCTLin ;
   private short Gx_err ;
   private int AV9BarIni ;
   private int AV8BarFin ;
   private int AV13CliIni ;
   private int AV12CliFin ;
   private int AV11CCTIni ;
   private int AV10CCTFin ;
   private int AV35Barcolnum ;
   private int AV36Barcolnumf ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A4032CCOpeCod ;
   private int A4031CCTCod ;
   private int A129BarCod ;
   private int Gx_OldLine ;
   private long AV31Tot ;
   private long AV30TotVal ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV22ParIni ;
   private String AV21ParFin ;
   private String AV17NivIni ;
   private String AV16NivFin ;
   private String AV32TipoCtr ;
   private String AV37Barseri ;
   private String AV38barserf ;
   private String AV33Barcolnom ;
   private String AV34Barcolnomf ;
   private String scmdbuf ;
   private String A4037CCTTpoCtr ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A4035CCVal ;
   private String A4043CCTLinDsc ;
   private String A4036CCTDsc ;
   private String A457FasCod ;
   private String A758ProCod ;
   private String A130BarCodPar ;
   private String A4051CCTVal ;
   private String A4050CCTValDsc ;
   private String AV18CCValDsc ;
   private String AV27Txt ;
   private String Gx_time ;
   private String AV19ValIniDsc ;
   private String AV20ValFinDsc ;
   private String GXt_char1 ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private java.util.Date AV15FchIni ;
   private java.util.Date AV14FchFin ;
   private java.util.Date A4033CCFch ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean brk6MW3 ;
   private boolean n252CliCod ;
   private boolean n4033CCFch ;
   private boolean n4032CCOpeCod ;
   private boolean n3281CcObs ;
   private String A3281CcObs ;
   private IDataStoreProvider pr_default ;
   private short[] P06MW2_A194BarOrdLin ;
   private String[] P06MW2_A396EmprCod ;
   private String[] P06MW2_A4037CCTTpoCtr ;
   private int[] P06MW2_A252CliCod ;
   private boolean[] P06MW2_n252CliCod ;
   private String[] P06MW2_A212BarSer ;
   private String[] P06MW2_A135BarColNom ;
   private int[] P06MW2_A136BarColNum ;
   private String[] P06MW2_A4035CCVal ;
   private String[] P06MW2_A4043CCTLinDsc ;
   private short[] P06MW2_A4034CCTLin ;
   private java.util.Date[] P06MW2_A4033CCFch ;
   private boolean[] P06MW2_n4033CCFch ;
   private int[] P06MW2_A4032CCOpeCod ;
   private boolean[] P06MW2_n4032CCOpeCod ;
   private String[] P06MW2_A4036CCTDsc ;
   private int[] P06MW2_A4031CCTCod ;
   private String[] P06MW2_A457FasCod ;
   private String[] P06MW2_A758ProCod ;
   private String[] P06MW2_A130BarCodPar ;
   private byte[] P06MW2_A132BarCodReo ;
   private int[] P06MW2_A129BarCod ;
   private String[] P06MW2_A3281CcObs ;
   private boolean[] P06MW2_n3281CcObs ;
   private String[] P06MW3_A396EmprCod ;
   private int[] P06MW3_A4031CCTCod ;
   private short[] P06MW3_A4034CCTLin ;
   private String[] P06MW3_A4051CCTVal ;
   private String[] P06MW3_A4050CCTValDsc ;
   private byte[] P06MW3_A4049CCTValLin ;
}

final  class rccestdet__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06MW2", "SELECT T1.BarOrdLin, T1.EmprCod, T2.CCTTpoCtr, T4.CliCod, T4.BarSer, T4.BarColNom, T4.BarColNum, T1.CCVal, T3.CCTLinDsc, T1.CCTLin, T6.CCFch, T6.CCOpeCod, T2.CCTDsc, T1.CCTCod, T5.FasCod, T1.ProCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T6.CcObs FROM (((((TXPCC1 T1 INNER JOIN TXPCCDef T2 ON T2.EmprCod = T1.EmprCod AND T2.CCTCod = T1.CCTCod) INNER JOIN TXPCCDef1 T3 ON T3.EmprCod = T1.EmprCod AND T3.CCTCod = T1.CCTCod AND T3.CCTLin = T1.CCTLin) INNER JOIN TXPBARCAD T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) INNER JOIN TXPBARFAS T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod = T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar AND T5.ProCod = T1.ProCod AND T5.BarOrdLin = T1.BarOrdLin) INNER JOIN TXPCC T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar AND T6.ProCod = T1.ProCod AND T6.BarOrdLin = T1.BarOrdLin AND T6.CCTCod = T1.CCTCod) WHERE (T1.EmprCod = ?) AND (T1.BarCod >= ? or ( (? = 0))) AND (T1.BarCod <= ? or ( (? = 0))) AND (T1.BarCodReo >= ? or ( (? = 0))) AND (T1.BarCodReo <= ? or ( (? = 0))) AND (T1.BarCodPar >= ? or ( (rtrim(?) IS NULL))) AND (T1.BarCodPar <= ? or ( (rtrim(?) IS NULL))) AND (T4.CliCod >= ? or ( (? = 0))) AND (T4.CliCod <= ? or ( (? = 0))) AND (T4.BarSer >= ? or (rtrim(?) IS NULL)) AND (T4.BarSer <= ? or (rtrim(?) IS NULL)) AND (T4.BarColNom >= ? or (rtrim(?) IS NULL)) AND (T4.BarColNom <= ? or (rtrim(?) IS NULL)) AND (T4.BarColNum >= ? or (? = 0)) AND (T4.BarColNum <= ? or (? = 0)) AND (T1.CCTCod >= ? or ( (? = 0))) AND (T1.CCTCod <= ? or ( (? = 0))) AND (T6.CCFch >= ? or ( (? = TO_DATE('0001-01-01', 'YYYY-MM-DD')))) AND (T6.CCFch <= ? or ( (? = TO_DATE('0001-01-01', 'YYYY-MM-DD')))) AND (RTRIM(LTRIM(T1.CCVal)) >= ? or ( (rtrim(?) IS NULL))) AND (RTRIM(LTRIM(T1.CCVal)) <= ? or ( (rtrim(?) IS NULL))) AND (T2.CCTTpoCtr = ?) ORDER BY T1.CCVal ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06MW3", "SELECT EmprCod, CCTCod, CCTLin, CCTVal, CCTValDsc, CCTValLin FROM TXPCCDef2 WHERE (EmprCod = ? and CCTCod = ? and CCTLin = ?) AND (CCTVal = ?) ORDER BY EmprCod, CCTCod, CCTLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 16);
               ((String[]) buf[6])[0] = rslt.getString(6, 13);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 40);
               ((String[]) buf[9])[0] = rslt.getString(9, 30);
               ((short[]) buf[10])[0] = rslt.getShort(10);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(11);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(12);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(13, 30);
               ((int[]) buf[16])[0] = rslt.getInt(14);
               ((String[]) buf[17])[0] = rslt.getString(15, 8);
               ((String[]) buf[18])[0] = rslt.getString(16, 8);
               ((String[]) buf[19])[0] = rslt.getString(17, 1);
               ((byte[]) buf[20])[0] = rslt.getByte(18);
               ((int[]) buf[21])[0] = rslt.getInt(19);
               ((String[]) buf[22])[0] = rslt.getVarchar(20);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
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
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setString(10, (String)parms[9], 1);
               stmt.setString(11, (String)parms[10], 1);
               stmt.setString(12, (String)parms[11], 1);
               stmt.setString(13, (String)parms[12], 1);
               stmt.setInt(14, ((Number) parms[13]).intValue());
               stmt.setInt(15, ((Number) parms[14]).intValue());
               stmt.setInt(16, ((Number) parms[15]).intValue());
               stmt.setInt(17, ((Number) parms[16]).intValue());
               stmt.setString(18, (String)parms[17], 16);
               stmt.setString(19, (String)parms[18], 16);
               stmt.setString(20, (String)parms[19], 16);
               stmt.setString(21, (String)parms[20], 16);
               stmt.setString(22, (String)parms[21], 13);
               stmt.setString(23, (String)parms[22], 13);
               stmt.setString(24, (String)parms[23], 13);
               stmt.setString(25, (String)parms[24], 13);
               stmt.setInt(26, ((Number) parms[25]).intValue());
               stmt.setInt(27, ((Number) parms[26]).intValue());
               stmt.setInt(28, ((Number) parms[27]).intValue());
               stmt.setInt(29, ((Number) parms[28]).intValue());
               stmt.setInt(30, ((Number) parms[29]).intValue());
               stmt.setInt(31, ((Number) parms[30]).intValue());
               stmt.setInt(32, ((Number) parms[31]).intValue());
               stmt.setInt(33, ((Number) parms[32]).intValue());
               stmt.setDate(34, (java.util.Date)parms[33]);
               stmt.setDate(35, (java.util.Date)parms[34]);
               stmt.setDate(36, (java.util.Date)parms[35]);
               stmt.setDate(37, (java.util.Date)parms[36]);
               stmt.setString(38, (String)parms[37], 1);
               stmt.setString(39, (String)parms[38], 1);
               stmt.setString(40, (String)parms[39], 1);
               stmt.setString(41, (String)parms[40], 1);
               stmt.setString(42, (String)parms[41], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 40);
               return;
      }
   }

}

