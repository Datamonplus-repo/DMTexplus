package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class arcentcos_impl extends GXWebReport
{
   public arcentcos_impl( com.genexus.internet.HttpContext context )
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
            AV8PCcoco = (short)(GXutil.lval( httpContext.GetPar( "PCcoco"))) ;
            AV9UCcoco = (short)(GXutil.lval( httpContext.GetPar( "UCcoco"))) ;
            AV10PFecha = localUtil.parseDateParm( httpContext.GetPar( "PFecha")) ;
            AV11UFecha = localUtil.parseDateParm( httpContext.GetPar( "UFecha")) ;
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
      M_bot = 1 ;
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
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*1)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXt_char1 = AV20Lit0 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char2) ;
         arcentcos_impl.this.GXt_char1 = GXv_char2[0] ;
         AV20Lit0 = GXt_char1 ;
         GXt_char1 = AV21Lit1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT406_", ""), (byte)(99), GXv_char2) ;
         arcentcos_impl.this.GXt_char1 = GXv_char2[0] ;
         AV21Lit1 = GXt_char1 ;
         GXt_char1 = AV21Lit1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char2) ;
         arcentcos_impl.this.GXt_char1 = GXv_char2[0] ;
         AV21Lit1 = GXutil.trim( AV21Lit1) + "-" + GXutil.trim( GXt_char1) ;
         GXt_char1 = AV22Lit2 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( AV30Pgmname, (byte)(99), GXv_char2) ;
         arcentcos_impl.this.GXt_char1 = GXv_char2[0] ;
         AV22Lit2 = GXt_char1 ;
         GXt_char1 = AV23Lit3 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN121_", ""), (byte)(99), GXv_char2) ;
         arcentcos_impl.this.GXt_char1 = GXv_char2[0] ;
         AV23Lit3 = GXt_char1 ;
         GXt_char1 = AV24Lit4 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1480_", ""), (byte)(99), GXv_char2) ;
         arcentcos_impl.this.GXt_char1 = GXv_char2[0] ;
         AV24Lit4 = GXt_char1 ;
         GXt_char1 = AV25Lit5 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2043_", ""), (byte)(99), GXv_char2) ;
         arcentcos_impl.this.GXt_char1 = GXv_char2[0] ;
         AV25Lit5 = GXt_char1 ;
         AV25Lit5 = GXutil.trim( AV25Lit5) + httpContext.getMessage( "(kg)", "") ;
         GXt_char1 = AV26Lit6 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WCFL063_", ""), (byte)(99), GXv_char2) ;
         arcentcos_impl.this.GXt_char1 = GXv_char2[0] ;
         AV26Lit6 = GXt_char1 ;
         GXt_char1 = AV27Lit7 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1304_", ""), (byte)(99), GXv_char2) ;
         arcentcos_impl.this.GXt_char1 = GXv_char2[0] ;
         AV27Lit7 = GXt_char1 ;
         /* Using cursor P06Z52 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P06Z52_A407EmprNom[0] ;
            n407EmprNom = P06Z52_n407EmprNom[0] ;
            AV12EmprNom = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV18Total_sg = DecimalUtil.doubleToDec(0) ;
         AV19Total_vg = DecimalUtil.doubleToDec(0) ;
         /* Using cursor P06Z53 */
         pr_default.execute(1, new Object[] {Short.valueOf(AV8PCcoco), A396EmprCod, Short.valueOf(AV9UCcoco)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            brk6Z54 = false ;
            A3344CCStkCanS = P06Z53_A3344CCStkCanS[0] ;
            A3349CCStkPre = P06Z53_A3349CCStkPre[0] ;
            A3345TipMovCc = P06Z53_A3345TipMovCc[0] ;
            A3348CCStkFec = P06Z53_A3348CCStkFec[0] ;
            A3840CcoDsc = P06Z53_A3840CcoDsc[0] ;
            n3840CcoDsc = P06Z53_n3840CcoDsc[0] ;
            A3839CcoCod = P06Z53_A3839CcoCod[0] ;
            A718PrdNom = P06Z53_A718PrdNom[0] ;
            A719PrdNum = P06Z53_A719PrdNum[0] ;
            A3343CCStkCanE = P06Z53_A3343CCStkCanE[0] ;
            A3342CCStkLin = P06Z53_A3342CCStkLin[0] ;
            A3840CcoDsc = P06Z53_A3840CcoDsc[0] ;
            n3840CcoDsc = P06Z53_n3840CcoDsc[0] ;
            A718PrdNom = P06Z53_A718PrdNom[0] ;
            AV13F_cab = (byte)(0) ;
            AV16Total_s = DecimalUtil.doubleToDec(0) ;
            AV17Total_v = DecimalUtil.doubleToDec(0) ;
            while ( (pr_default.getStatus(1) != 101) && ( P06Z53_A3839CcoCod[0] == A3839CcoCod ) )
            {
               brk6Z54 = false ;
               A3344CCStkCanS = P06Z53_A3344CCStkCanS[0] ;
               A3349CCStkPre = P06Z53_A3349CCStkPre[0] ;
               A3345TipMovCc = P06Z53_A3345TipMovCc[0] ;
               A3348CCStkFec = P06Z53_A3348CCStkFec[0] ;
               A3840CcoDsc = P06Z53_A3840CcoDsc[0] ;
               n3840CcoDsc = P06Z53_n3840CcoDsc[0] ;
               A718PrdNom = P06Z53_A718PrdNom[0] ;
               A719PrdNum = P06Z53_A719PrdNum[0] ;
               A3342CCStkLin = P06Z53_A3342CCStkLin[0] ;
               A3840CcoDsc = P06Z53_A3840CcoDsc[0] ;
               n3840CcoDsc = P06Z53_n3840CcoDsc[0] ;
               A718PrdNom = P06Z53_A718PrdNom[0] ;
               if ( GXutil.strcmp(P06Z53_A396EmprCod[0], A396EmprCod) == 0 )
               {
                  if ( (( GXutil.resetTime(A3348CCStkFec).after( GXutil.resetTime( AV10PFecha )) ) || ( GXutil.dateCompare(GXutil.resetTime(A3348CCStkFec), GXutil.resetTime(AV10PFecha)) )) && (( GXutil.resetTime(A3348CCStkFec).before( GXutil.resetTime( AV11UFecha )) ) || ( GXutil.dateCompare(GXutil.resetTime(A3348CCStkFec), GXutil.resetTime(AV11UFecha)) )) )
                  {
                     if ( ( GXutil.strcmp(A3345TipMovCc, "SM") == 0 ) || ( GXutil.strcmp(A3345TipMovCc, "PP") == 0 ) )
                     {
                        AV14CCSTKCANS = DecimalUtil.doubleToDec(0) ;
                        AV15Valors = DecimalUtil.doubleToDec(0) ;
                        while ( (pr_default.getStatus(1) != 101) && ( P06Z53_A3839CcoCod[0] == A3839CcoCod ) && ( GXutil.strcmp(P06Z53_A719PrdNum[0], A719PrdNum) == 0 ) )
                        {
                           brk6Z54 = false ;
                           A3344CCStkCanS = P06Z53_A3344CCStkCanS[0] ;
                           A3349CCStkPre = P06Z53_A3349CCStkPre[0] ;
                           A3345TipMovCc = P06Z53_A3345TipMovCc[0] ;
                           A3348CCStkFec = P06Z53_A3348CCStkFec[0] ;
                           A3342CCStkLin = P06Z53_A3342CCStkLin[0] ;
                           if ( GXutil.strcmp(P06Z53_A396EmprCod[0], A396EmprCod) == 0 )
                           {
                              if ( (( GXutil.resetTime(A3348CCStkFec).after( GXutil.resetTime( AV10PFecha )) ) || ( GXutil.dateCompare(GXutil.resetTime(A3348CCStkFec), GXutil.resetTime(AV10PFecha)) )) && (( GXutil.resetTime(A3348CCStkFec).before( GXutil.resetTime( AV11UFecha )) ) || ( GXutil.dateCompare(GXutil.resetTime(A3348CCStkFec), GXutil.resetTime(AV11UFecha)) )) )
                              {
                                 if ( ( GXutil.strcmp(A3345TipMovCc, "SM") == 0 ) || ( GXutil.strcmp(A3345TipMovCc, "PP") == 0 ) )
                                 {
                                    AV14CCSTKCANS = AV14CCSTKCANS.add(A3344CCStkCanS) ;
                                    AV15Valors = AV15Valors.add((GXutil.roundDecimal( A3344CCStkCanS.multiply(A3349CCStkPre), 2))) ;
                                 }
                              }
                           }
                           brk6Z54 = true ;
                           pr_default.readNext(1);
                        }
                        if ( AV13F_cab == 0 )
                        {
                           AV13F_cab = (byte)(1) ;
                           h6Z50( false, 39) ;
                           getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3839CcoCod), "ZZ9")), 228, Gx_line+11, 251, Gx_line+28, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A3840CcoDsc, "")), 264, Gx_line+11, 484, Gx_line+28, 0+256, 0, 0, 0) ;
                           getPrinter().GxAttris("Microsoft Sans Serif", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26Lit6, "")), 100, Gx_line+13, 195, Gx_line+30, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawRect(83, Gx_line+4, 493, Gx_line+34, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                           Gx_OldLine = Gx_line ;
                           Gx_line = (int)(Gx_line+39) ;
                        }
                        if ( AV14CCSTKCANS.doubleValue() > 0 )
                        {
                           h6Z50( false, 17) ;
                           getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 25, Gx_line+0, 70, Gx_line+17, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 157, Gx_line+0, 348, Gx_line+17, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV14CCSTKCANS, "Z,ZZZ,ZZ9.9999")), 373, Gx_line+0, 476, Gx_line+17, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV15Valors, "ZZ,ZZZ,ZZ9.99")), 502, Gx_line+1, 605, Gx_line+18, 2+256, 0, 0, 0) ;
                           Gx_OldLine = Gx_line ;
                           Gx_line = (int)(Gx_line+17) ;
                           AV16Total_s = AV16Total_s.add(AV14CCSTKCANS) ;
                           AV17Total_v = AV17Total_v.add(AV15Valors) ;
                           AV18Total_sg = AV18Total_sg.add(AV14CCSTKCANS) ;
                           AV19Total_vg = AV19Total_vg.add(AV15Valors) ;
                        }
                     }
                  }
               }
               if ( ! brk6Z54 )
               {
                  brk6Z54 = true ;
                  pr_default.readNext(1);
               }
            }
            if ( ( AV16Total_s.doubleValue() == 0 ) && ( AV17Total_v.doubleValue() == 0 ) )
            {
            }
            else
            {
               h6Z50( false, 34) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV16Total_s, "Z,ZZZ,ZZ9.9999")), 373, Gx_line+7, 476, Gx_line+24, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV17Total_v, "ZZZ,ZZZ,ZZ9.99")), 500, Gx_line+7, 603, Gx_line+24, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+34) ;
            }
            if ( ! brk6Z54 )
            {
               brk6Z54 = true ;
               pr_default.readNext(1);
            }
         }
         pr_default.close(1);
         if ( ( AV18Total_sg.doubleValue() == 0 ) && ( AV19Total_vg.doubleValue() == 0 ) )
         {
         }
         else
         {
            h6Z50( false, 50) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV18Total_sg, "Z,ZZZ,ZZ9.9999")), 373, Gx_line+16, 476, Gx_line+33, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV19Total_vg, "ZZZ,ZZZ,ZZ9.99")), 500, Gx_line+16, 603, Gx_line+33, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+50) ;
         }
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6Z50( true, 0) ;
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

   public void h6Z50( boolean bFoot ,
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
            getPrinter().GxAttris("Courier New", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12EmprNom, "")), 27, Gx_line+14, 341, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(23, Gx_line+77, 719, Gx_line+77, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Valor (€)", ""), 550, Gx_line+109, 601, Gx_line+123, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(25, Gx_line+125, 126, Gx_line+125, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(157, Gx_line+125, 347, Gx_line+125, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(391, Gx_line+125, 475, Gx_line+125, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(520, Gx_line+125, 604, Gx_line+125, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Lit3, "")), 25, Gx_line+109, 126, Gx_line+126, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24Lit4, "")), 157, Gx_line+109, 221, Gx_line+126, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25Lit5, "")), 413, Gx_line+109, 477, Gx_line+126, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20Lit0, "")), 604, Gx_line+57, 668, Gx_line+74, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 674, Gx_line+56, 719, Gx_line+73, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21Lit1, "")), 439, Gx_line+16, 565, Gx_line+33, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 584, Gx_line+15, 643, Gx_line+32, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 655, Gx_line+15, 714, Gx_line+32, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22Lit2, "")), 28, Gx_line+54, 446, Gx_line+76, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27Lit7, "")), 25, Gx_line+88, 89, Gx_line+105, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( AV10PFecha, "99/99/99"), 96, Gx_line+86, 155, Gx_line+103, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( AV11UFecha, "99/99/99"), 176, Gx_line+86, 235, Gx_line+103, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+129) ;
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
      getPrinter().setMetrics("Microsoft Sans Serif", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
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
      AV10PFecha = GXutil.nullDate() ;
      AV11UFecha = GXutil.nullDate() ;
      AV20Lit0 = "" ;
      AV21Lit1 = "" ;
      AV22Lit2 = "" ;
      AV30Pgmname = "" ;
      AV23Lit3 = "" ;
      AV24Lit4 = "" ;
      AV25Lit5 = "" ;
      AV26Lit6 = "" ;
      AV27Lit7 = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      scmdbuf = "" ;
      P06Z52_A396EmprCod = new String[] {""} ;
      P06Z52_A407EmprNom = new String[] {""} ;
      P06Z52_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV12EmprNom = "" ;
      AV18Total_sg = DecimalUtil.ZERO ;
      AV19Total_vg = DecimalUtil.ZERO ;
      P06Z53_A396EmprCod = new String[] {""} ;
      P06Z53_A3344CCStkCanS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06Z53_A3349CCStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06Z53_A3345TipMovCc = new String[] {""} ;
      P06Z53_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P06Z53_A3840CcoDsc = new String[] {""} ;
      P06Z53_n3840CcoDsc = new boolean[] {false} ;
      P06Z53_A3839CcoCod = new short[1] ;
      P06Z53_A718PrdNom = new String[] {""} ;
      P06Z53_A719PrdNum = new String[] {""} ;
      P06Z53_A3343CCStkCanE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06Z53_A3342CCStkLin = new long[1] ;
      A3344CCStkCanS = DecimalUtil.ZERO ;
      A3349CCStkPre = DecimalUtil.ZERO ;
      A3345TipMovCc = "" ;
      A3348CCStkFec = GXutil.nullDate() ;
      A3840CcoDsc = "" ;
      A718PrdNom = "" ;
      A719PrdNum = "" ;
      A3343CCStkCanE = DecimalUtil.ZERO ;
      AV16Total_s = DecimalUtil.ZERO ;
      AV17Total_v = DecimalUtil.ZERO ;
      AV14CCSTKCANS = DecimalUtil.ZERO ;
      AV15Valors = DecimalUtil.ZERO ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.arcentcos__default(),
         new Object[] {
             new Object[] {
            P06Z52_A396EmprCod, P06Z52_A407EmprNom, P06Z52_n407EmprNom
            }
            , new Object[] {
            P06Z53_A396EmprCod, P06Z53_A3344CCStkCanS, P06Z53_A3349CCStkPre, P06Z53_A3345TipMovCc, P06Z53_A3348CCStkFec, P06Z53_A3840CcoDsc, P06Z53_n3840CcoDsc, P06Z53_A3839CcoCod, P06Z53_A718PrdNom, P06Z53_A719PrdNum,
            P06Z53_A3343CCStkCanE, P06Z53_A3342CCStkLin
            }
         }
      );
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      AV30Pgmname = "ARCENTCOS" ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      AV30Pgmname = "ARCENTCOS" ;
      Gx_err = (short)(0) ;
   }

   private byte AV13F_cab ;
   private short gxcookieaux ;
   private short AV8PCcoco ;
   private short AV9UCcoco ;
   private short A3839CcoCod ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private long A3342CCStkLin ;
   private java.math.BigDecimal AV18Total_sg ;
   private java.math.BigDecimal AV19Total_vg ;
   private java.math.BigDecimal A3344CCStkCanS ;
   private java.math.BigDecimal A3349CCStkPre ;
   private java.math.BigDecimal A3343CCStkCanE ;
   private java.math.BigDecimal AV16Total_s ;
   private java.math.BigDecimal AV17Total_v ;
   private java.math.BigDecimal AV14CCSTKCANS ;
   private java.math.BigDecimal AV15Valors ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV20Lit0 ;
   private String AV21Lit1 ;
   private String AV22Lit2 ;
   private String AV30Pgmname ;
   private String AV23Lit3 ;
   private String AV24Lit4 ;
   private String AV25Lit5 ;
   private String AV26Lit6 ;
   private String AV27Lit7 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV12EmprNom ;
   private String A3345TipMovCc ;
   private String A3840CcoDsc ;
   private String A718PrdNom ;
   private String A719PrdNum ;
   private String Gx_time ;
   private java.util.Date AV10PFecha ;
   private java.util.Date AV11UFecha ;
   private java.util.Date A3348CCStkFec ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean brk6Z54 ;
   private boolean n3840CcoDsc ;
   private IDataStoreProvider pr_default ;
   private String[] P06Z52_A396EmprCod ;
   private String[] P06Z52_A407EmprNom ;
   private boolean[] P06Z52_n407EmprNom ;
   private String[] P06Z53_A396EmprCod ;
   private java.math.BigDecimal[] P06Z53_A3344CCStkCanS ;
   private java.math.BigDecimal[] P06Z53_A3349CCStkPre ;
   private String[] P06Z53_A3345TipMovCc ;
   private java.util.Date[] P06Z53_A3348CCStkFec ;
   private String[] P06Z53_A3840CcoDsc ;
   private boolean[] P06Z53_n3840CcoDsc ;
   private short[] P06Z53_A3839CcoCod ;
   private String[] P06Z53_A718PrdNom ;
   private String[] P06Z53_A719PrdNum ;
   private java.math.BigDecimal[] P06Z53_A3343CCStkCanE ;
   private long[] P06Z53_A3342CCStkLin ;
}

final  class arcentcos__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06Z52", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06Z53", "SELECT T1.EmprCod, T1.CCStkCanS, T1.CCStkPre, T1.TipMovCc, T1.CCStkFec, T2.CcoDsc, T1.CcoCod, T3.PrdNom, T1.PrdNum, T1.CCStkCanE, T1.CCStkLin FROM ((TXPCCSTKS T1 INNER JOIN TXPCENTCO T2 ON T2.CcoCod = T1.CcoCod) INNER JOIN TXPPRODUC T3 ON T3.EmprCod = T1.EmprCod AND T3.PrdNum = T1.PrdNum) WHERE (T1.CcoCod >= ?) AND (T1.EmprCod = ?) AND (T1.TipMovCc = 'SM' or T1.TipMovCc = 'PP') AND (T1.CcoCod <= ?) ORDER BY T1.CcoCod, T1.PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((String[]) buf[3])[0] = rslt.getString(4, 2);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 26);
               ((String[]) buf[9])[0] = rslt.getString(9, 6);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,4);
               ((long[]) buf[11])[0] = rslt.getLong(11);
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
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
   }

}

