package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rens026_impl extends GXWebReport
{
   public rens026_impl( com.genexus.internet.HttpContext context )
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
            AV13PCliCod = (int)(GXutil.lval( httpContext.GetPar( "PCliCod"))) ;
            AV14UCliCod = (int)(GXutil.lval( httpContext.GetPar( "UCliCod"))) ;
            AV8Fechaei = localUtil.parseDateParm( httpContext.GetPar( "Fechaei")) ;
            AV9Fechaef = localUtil.parseDateParm( httpContext.GetPar( "Fechaef")) ;
            AV30TipLis = (byte)(GXutil.lval( httpContext.GetPar( "TipLis"))) ;
            AV28PTipo = httpContext.GetPar( "PTipo") ;
            AV29UTipo = httpContext.GetPar( "UTipo") ;
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
         GXt_char1 = AV18Lit1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         rens026_impl.this.GXt_char1 = GXv_char2[0] ;
         AV18Lit1 = GXt_char1 ;
         GXt_char1 = AV19Lit2 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char2) ;
         rens026_impl.this.GXt_char1 = GXv_char2[0] ;
         AV19Lit2 = GXt_char1 ;
         AV20Lit3 = GXutil.trim( AV18Lit1) + " - " + GXutil.trim( AV19Lit2) ;
         GXt_char1 = AV21Lit4 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "RENS026", ""), (byte)(99), GXv_char2) ;
         rens026_impl.this.GXt_char1 = GXv_char2[0] ;
         AV21Lit4 = GXt_char1 ;
         GXt_char1 = AV22Lit5 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char2) ;
         rens026_impl.this.GXt_char1 = GXv_char2[0] ;
         AV22Lit5 = GXt_char1 ;
         GXt_char1 = AV23Lit6 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN073_", ""), (byte)(99), GXv_char2) ;
         rens026_impl.this.GXt_char1 = GXv_char2[0] ;
         AV23Lit6 = GXt_char1 ;
         GXt_char1 = AV24Lit7 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN205", ""), (byte)(99), GXv_char2) ;
         rens026_impl.this.GXt_char1 = GXv_char2[0] ;
         AV24Lit7 = GXutil.trim( GXt_char1) ;
         GXt_char1 = AV25Lit8 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN227", ""), (byte)(99), GXv_char2) ;
         rens026_impl.this.GXt_char1 = GXv_char2[0] ;
         AV25Lit8 = GXt_char1 ;
         GXt_char1 = AV26Lit9 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN228", ""), (byte)(99), GXv_char2) ;
         rens026_impl.this.GXt_char1 = GXv_char2[0] ;
         AV26Lit9 = GXt_char1 ;
         GXt_char1 = AV27Lit10 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN208", ""), (byte)(99), GXv_char2) ;
         rens026_impl.this.GXt_char1 = GXv_char2[0] ;
         AV27Lit10 = GXt_char1 ;
         GXt_char1 = AV31Lit11 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN073_", ""), (byte)(99), GXv_char2) ;
         rens026_impl.this.GXt_char1 = GXv_char2[0] ;
         AV31Lit11 = GXt_char1 ;
         GXt_char1 = AV32Lit12 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN051", ""), (byte)(99), GXv_char2) ;
         rens026_impl.this.GXt_char1 = GXv_char2[0] ;
         AV32Lit12 = GXt_char1 ;
         GXt_char1 = AV33Lit13 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WCFL123_", ""), (byte)(99), GXv_char2) ;
         rens026_impl.this.GXt_char1 = GXv_char2[0] ;
         AV33Lit13 = GXt_char1 ;
         GXt_char1 = AV34Lit14 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN687_", ""), (byte)(99), GXv_char2) ;
         rens026_impl.this.GXt_char1 = GXv_char2[0] ;
         AV34Lit14 = GXt_char1 ;
         /* Using cursor P06XL2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P06XL2_A407EmprNom[0] ;
            n407EmprNom = P06XL2_n407EmprNom[0] ;
            AV10EmprNom = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV16Num_et = 0 ;
         AV17Num_eat = 0 ;
         /* Using cursor P06XL3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV13PCliCod), Integer.valueOf(AV14UCliCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A279CliNom = P06XL3_A279CliNom[0] ;
            A252CliCod = P06XL3_A252CliCod[0] ;
            AV11Num_e = 0 ;
            AV12Num_ea = 0 ;
            if ( AV30TipLis == 1 )
            {
               /* Using cursor P06XL4 */
               pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), AV8Fechaei, AV9Fechaef, AV28PTipo, AV29UTipo});
               while ( (pr_default.getStatus(2) != 101) )
               {
                  A5532Lb_numero = P06XL4_A5532Lb_numero[0] ;
                  A5570Lb_Tipo = P06XL4_A5570Lb_Tipo[0] ;
                  A5541Lb_FechaE = P06XL4_A5541Lb_FechaE[0] ;
                  AV11Num_e = (int)(AV11Num_e+1) ;
                  /* Using cursor P06XL5 */
                  pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
                  while ( (pr_default.getStatus(3) != 101) )
                  {
                     A5563Lb_FechaR = P06XL5_A5563Lb_FechaR[0] ;
                     A5555Lb_opcion = P06XL5_A5555Lb_opcion[0] ;
                     if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A5563Lb_FechaR)) )
                     {
                        AV12Num_ea = (int)(AV12Num_ea+1) ;
                     }
                     pr_default.readNext(3);
                  }
                  pr_default.close(3);
                  pr_default.readNext(2);
               }
               pr_default.close(2);
               AV15Por = (short)(0) ;
               if ( AV11Num_e > 0 )
               {
                  AV15Por = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec((AV12Num_ea/ (double) (AV11Num_e))*100), 0))) ;
               }
               if ( AV11Num_e > 0 )
               {
                  h6XL0( false, 17) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 31, Gx_line+0, 76, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 78, Gx_line+0, 298, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV11Num_e), "ZZZZZZZ9")), 388, Gx_line+0, 447, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12Num_ea), "ZZZZZZZ9")), 479, Gx_line+0, 538, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV15Por), "ZZ9")), 558, Gx_line+0, 581, Gx_line+17, 2+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+17) ;
                  AV17Num_eat = (int)(AV17Num_eat+AV12Num_ea) ;
                  AV16Num_et = (int)(AV16Num_et+AV11Num_e) ;
               }
            }
            else
            {
               /* Using cursor P06XL6 */
               pr_default.execute(4, new Object[] {AV28PTipo, A396EmprCod, Integer.valueOf(A252CliCod), AV8Fechaei, AV9Fechaef, AV29UTipo});
               while ( (pr_default.getStatus(4) != 101) )
               {
                  brk6XL7 = false ;
                  A5532Lb_numero = P06XL6_A5532Lb_numero[0] ;
                  A5570Lb_Tipo = P06XL6_A5570Lb_Tipo[0] ;
                  A5541Lb_FechaE = P06XL6_A5541Lb_FechaE[0] ;
                  while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P06XL6_A5570Lb_Tipo[0], A5570Lb_Tipo) == 0 ) )
                  {
                     brk6XL7 = false ;
                     A5532Lb_numero = P06XL6_A5532Lb_numero[0] ;
                     if ( GXutil.strcmp(P06XL6_A396EmprCod[0], A396EmprCod) == 0 )
                     {
                        if ( P06XL6_A252CliCod[0] == A252CliCod )
                        {
                           AV11Num_e = (int)(AV11Num_e+1) ;
                           /* Using cursor P06XL7 */
                           pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
                           while ( (pr_default.getStatus(5) != 101) )
                           {
                              A5563Lb_FechaR = P06XL7_A5563Lb_FechaR[0] ;
                              A5555Lb_opcion = P06XL7_A5555Lb_opcion[0] ;
                              if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A5563Lb_FechaR)) )
                              {
                                 AV12Num_ea = (int)(AV12Num_ea+1) ;
                              }
                              pr_default.readNext(5);
                           }
                           pr_default.close(5);
                        }
                     }
                     brk6XL7 = true ;
                     pr_default.readNext(4);
                  }
                  AV15Por = (short)(0) ;
                  if ( AV11Num_e > 0 )
                  {
                     AV15Por = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec((AV12Num_ea/ (double) (AV11Num_e))*100), 0))) ;
                  }
                  if ( AV11Num_e > 0 )
                  {
                     if ( GXutil.strcmp(A5570Lb_Tipo, httpContext.getMessage( "C", "")) == 0 )
                     {
                        AV35Txt_Tipo = AV31Lit11 ;
                     }
                     else if ( GXutil.strcmp(A5570Lb_Tipo, httpContext.getMessage( "P", "")) == 0 )
                     {
                        AV35Txt_Tipo = AV32Lit12 ;
                     }
                     else if ( GXutil.strcmp(A5570Lb_Tipo, httpContext.getMessage( "M", "")) == 0 )
                     {
                        AV35Txt_Tipo = AV33Lit13 ;
                     }
                     else if ( GXutil.strcmp(A5570Lb_Tipo, httpContext.getMessage( "R", "")) == 0 )
                     {
                        AV35Txt_Tipo = AV34Lit14 ;
                     }
                     else
                     {
                        AV35Txt_Tipo = "" ;
                     }
                     h6XL0( false, 17) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 26, Gx_line+0, 71, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 73, Gx_line+0, 293, Gx_line+17, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV11Num_e), "ZZZZZZZ9")), 466, Gx_line+0, 525, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12Num_ea), "ZZZZZZZ9")), 557, Gx_line+0, 616, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV15Por), "ZZ9")), 636, Gx_line+0, 659, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5570Lb_Tipo, "")), 336, Gx_line+0, 344, Gx_line+17, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35Txt_Tipo, "")), 352, Gx_line+0, 426, Gx_line+17, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText("-", 345, Gx_line+1, 350, Gx_line+15, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+17) ;
                     AV17Num_eat = (int)(AV17Num_eat+AV12Num_ea) ;
                     AV16Num_et = (int)(AV16Num_et+AV11Num_e) ;
                     AV11Num_e = 0 ;
                     AV12Num_ea = 0 ;
                  }
                  if ( ! brk6XL7 )
                  {
                     brk6XL7 = true ;
                     pr_default.readNext(4);
                  }
               }
               pr_default.close(4);
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         if ( AV16Num_et > 0 )
         {
            AV15Por = (short)(0) ;
            if ( AV16Num_et > 0 )
            {
               AV15Por = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec((AV17Num_eat/ (double) (AV16Num_et))*100), 0))) ;
            }
            if ( AV30TipLis == 1 )
            {
               h6XL0( false, 20) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV16Num_et), "ZZZZZZZ9")), 391, Gx_line+3, 450, Gx_line+20, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17Num_eat), "ZZZZZZZ9")), 482, Gx_line+3, 541, Gx_line+20, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV15Por), "ZZ9")), 561, Gx_line+3, 584, Gx_line+20, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(383, Gx_line+0, 449, Gx_line+0, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(478, Gx_line+0, 541, Gx_line+0, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(561, Gx_line+0, 583, Gx_line+0, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+20) ;
            }
            else
            {
               h6XL0( false, 20) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV16Num_et), "ZZZZZZZ9")), 466, Gx_line+3, 525, Gx_line+20, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17Num_eat), "ZZZZZZZ9")), 557, Gx_line+3, 616, Gx_line+20, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV15Por), "ZZ9")), 636, Gx_line+3, 659, Gx_line+20, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(458, Gx_line+0, 524, Gx_line+0, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(553, Gx_line+0, 616, Gx_line+0, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(636, Gx_line+0, 658, Gx_line+0, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+20) ;
            }
         }
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6XL0( true, 0) ;
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

   public void h6XL0( boolean bFoot ,
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
            getPrinter().GxAttris("Arial", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10EmprNom, "")), 6, Gx_line+11, 226, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 634, Gx_line+13, 693, Gx_line+30, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 707, Gx_line+13, 766, Gx_line+30, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("-", 697, Gx_line+14, 702, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 723, Gx_line+48, 768, Gx_line+65, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(7, Gx_line+69, 792, Gx_line+69, 2, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21Lit4, "")), 7, Gx_line+44, 341, Gx_line+65, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20Lit3, "")), 540, Gx_line+14, 625, Gx_line+30, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22Lit5, "")), 641, Gx_line+48, 705, Gx_line+65, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( AV9Fechaef, "99/99/99"), 425, Gx_line+17, 476, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( AV8Fechaei, "99/99/99"), 359, Gx_line+17, 409, Gx_line+34, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("(", 349, Gx_line+16, 355, Gx_line+35, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(")", 478, Gx_line+16, 484, Gx_line+35, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("-", 418, Gx_line+15, 421, Gx_line+35, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42Pgmname, "")), 367, Gx_line+50, 587, Gx_line+67, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+125) ;
            if ( AV30TipLis == 1 )
            {
               getPrinter().GxDrawLine(46, Gx_line+36, 312, Gx_line+36, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText("%", 565, Gx_line+18, 575, Gx_line+34, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(380, Gx_line+6, 446, Gx_line+6, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(519, Gx_line+6, 580, Gx_line+6, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(380, Gx_line+36, 446, Gx_line+36, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(475, Gx_line+36, 538, Gx_line+36, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(558, Gx_line+36, 580, Gx_line+36, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Lit6, "")), 46, Gx_line+18, 110, Gx_line+35, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24Lit7, "")), 450, Gx_line+0, 514, Gx_line+17, 1+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25Lit8, "")), 383, Gx_line+18, 447, Gx_line+35, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26Lit9, "")), 475, Gx_line+18, 539, Gx_line+35, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+40) ;
            }
            else
            {
               getPrinter().GxDrawLine(51, Gx_line+35, 317, Gx_line+35, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText("%", 643, Gx_line+18, 653, Gx_line+34, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(458, Gx_line+6, 524, Gx_line+6, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(597, Gx_line+6, 658, Gx_line+6, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(458, Gx_line+35, 524, Gx_line+35, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(553, Gx_line+35, 616, Gx_line+35, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(636, Gx_line+35, 658, Gx_line+35, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Lit6, "")), 51, Gx_line+18, 115, Gx_line+35, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24Lit7, "")), 528, Gx_line+0, 592, Gx_line+17, 1+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25Lit8, "")), 461, Gx_line+18, 525, Gx_line+35, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26Lit9, "")), 553, Gx_line+18, 617, Gx_line+35, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27Lit10, "")), 336, Gx_line+18, 425, Gx_line+34, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(336, Gx_line+35, 425, Gx_line+35, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+40) ;
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

   public void add_metrics( )
   {
      add_metrics0( ) ;
      add_metrics1( ) ;
      add_metrics2( ) ;
      add_metrics3( ) ;
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Courier New", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Microsoft Sans Serif", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics2( )
   {
      getPrinter().setMetrics("Arial", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics3( )
   {
      getPrinter().setMetrics("Arial", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
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
      AV8Fechaei = GXutil.nullDate() ;
      AV9Fechaef = GXutil.nullDate() ;
      AV28PTipo = "" ;
      AV29UTipo = "" ;
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
      AV31Lit11 = "" ;
      AV32Lit12 = "" ;
      AV33Lit13 = "" ;
      AV34Lit14 = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      scmdbuf = "" ;
      P06XL2_A396EmprCod = new String[] {""} ;
      P06XL2_A407EmprNom = new String[] {""} ;
      P06XL2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV10EmprNom = "" ;
      P06XL3_A396EmprCod = new String[] {""} ;
      P06XL3_A279CliNom = new String[] {""} ;
      P06XL3_A252CliCod = new int[1] ;
      A279CliNom = "" ;
      P06XL4_A396EmprCod = new String[] {""} ;
      P06XL4_A252CliCod = new int[1] ;
      P06XL4_A5532Lb_numero = new int[1] ;
      P06XL4_A5570Lb_Tipo = new String[] {""} ;
      P06XL4_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      A5570Lb_Tipo = "" ;
      A5541Lb_FechaE = GXutil.nullDate() ;
      P06XL5_A396EmprCod = new String[] {""} ;
      P06XL5_A5532Lb_numero = new int[1] ;
      P06XL5_A5563Lb_FechaR = new java.util.Date[] {GXutil.nullDate()} ;
      P06XL5_A5555Lb_opcion = new String[] {""} ;
      A5563Lb_FechaR = GXutil.nullDate() ;
      A5555Lb_opcion = "" ;
      P06XL6_A396EmprCod = new String[] {""} ;
      P06XL6_A252CliCod = new int[1] ;
      P06XL6_A5532Lb_numero = new int[1] ;
      P06XL6_A5570Lb_Tipo = new String[] {""} ;
      P06XL6_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      P06XL7_A396EmprCod = new String[] {""} ;
      P06XL7_A5532Lb_numero = new int[1] ;
      P06XL7_A5563Lb_FechaR = new java.util.Date[] {GXutil.nullDate()} ;
      P06XL7_A5555Lb_opcion = new String[] {""} ;
      AV35Txt_Tipo = "" ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      AV42Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.rens026__default(),
         new Object[] {
             new Object[] {
            P06XL2_A396EmprCod, P06XL2_A407EmprNom, P06XL2_n407EmprNom
            }
            , new Object[] {
            P06XL3_A396EmprCod, P06XL3_A279CliNom, P06XL3_A252CliCod
            }
            , new Object[] {
            P06XL4_A396EmprCod, P06XL4_A252CliCod, P06XL4_A5532Lb_numero, P06XL4_A5570Lb_Tipo, P06XL4_A5541Lb_FechaE
            }
            , new Object[] {
            P06XL5_A396EmprCod, P06XL5_A5532Lb_numero, P06XL5_A5563Lb_FechaR, P06XL5_A5555Lb_opcion
            }
            , new Object[] {
            P06XL6_A396EmprCod, P06XL6_A252CliCod, P06XL6_A5532Lb_numero, P06XL6_A5570Lb_Tipo, P06XL6_A5541Lb_FechaE
            }
            , new Object[] {
            P06XL7_A396EmprCod, P06XL7_A5532Lb_numero, P06XL7_A5563Lb_FechaR, P06XL7_A5555Lb_opcion
            }
         }
      );
      AV42Pgmname = "GestionLaboratorio.RENS026" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      AV42Pgmname = "GestionLaboratorio.RENS026" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV30TipLis ;
   private short gxcookieaux ;
   private short AV15Por ;
   private short Gx_err ;
   private int AV13PCliCod ;
   private int AV14UCliCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int AV16Num_et ;
   private int AV17Num_eat ;
   private int A252CliCod ;
   private int AV11Num_e ;
   private int AV12Num_ea ;
   private int A5532Lb_numero ;
   private int Gx_OldLine ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV28PTipo ;
   private String AV29UTipo ;
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
   private String AV31Lit11 ;
   private String AV32Lit12 ;
   private String AV33Lit13 ;
   private String AV34Lit14 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV10EmprNom ;
   private String A279CliNom ;
   private String A5570Lb_Tipo ;
   private String A5555Lb_opcion ;
   private String AV35Txt_Tipo ;
   private String Gx_time ;
   private String AV42Pgmname ;
   private java.util.Date AV8Fechaei ;
   private java.util.Date AV9Fechaef ;
   private java.util.Date A5541Lb_FechaE ;
   private java.util.Date A5563Lb_FechaR ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean brk6XL7 ;
   private IDataStoreProvider pr_default ;
   private String[] P06XL2_A396EmprCod ;
   private String[] P06XL2_A407EmprNom ;
   private boolean[] P06XL2_n407EmprNom ;
   private String[] P06XL3_A396EmprCod ;
   private String[] P06XL3_A279CliNom ;
   private int[] P06XL3_A252CliCod ;
   private String[] P06XL4_A396EmprCod ;
   private int[] P06XL4_A252CliCod ;
   private int[] P06XL4_A5532Lb_numero ;
   private String[] P06XL4_A5570Lb_Tipo ;
   private java.util.Date[] P06XL4_A5541Lb_FechaE ;
   private String[] P06XL5_A396EmprCod ;
   private int[] P06XL5_A5532Lb_numero ;
   private java.util.Date[] P06XL5_A5563Lb_FechaR ;
   private String[] P06XL5_A5555Lb_opcion ;
   private String[] P06XL6_A396EmprCod ;
   private int[] P06XL6_A252CliCod ;
   private int[] P06XL6_A5532Lb_numero ;
   private String[] P06XL6_A5570Lb_Tipo ;
   private java.util.Date[] P06XL6_A5541Lb_FechaE ;
   private String[] P06XL7_A396EmprCod ;
   private int[] P06XL7_A5532Lb_numero ;
   private java.util.Date[] P06XL7_A5563Lb_FechaR ;
   private String[] P06XL7_A5555Lb_opcion ;
}

final  class rens026__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06XL2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06XL3", "SELECT EmprCod, CliNom, CliCod FROM TXPCLIENT WHERE (EmprCod = ? and CliCod >= ?) AND (CliCod <= ?) ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06XL4", "SELECT EmprCod, CliCod, Lb_numero, Lb_Tipo, Lb_FechaE FROM TXPENS001 WHERE (EmprCod = ? and CliCod = ?) AND (Lb_FechaE >= ? and Lb_FechaE <= ?) AND (Lb_Tipo >= ? and Lb_Tipo <= ?) ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06XL5", "SELECT EmprCod, Lb_numero, Lb_FechaR, Lb_opcion FROM TXPENS002 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06XL6", "SELECT EmprCod, CliCod, Lb_numero, Lb_Tipo, Lb_FechaE FROM TXPENS001 WHERE (Lb_Tipo >= ?) AND (EmprCod = ?) AND (CliCod = ?) AND (Lb_FechaE >= ? and Lb_FechaE <= ?) AND (Lb_Tipo <= ?) ORDER BY Lb_Tipo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06XL7", "SELECT EmprCod, Lb_numero, Lb_FechaR, Lb_opcion FROM TXPENS002 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
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
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setDate(5, (java.util.Date)parms[4]);
               stmt.setString(6, (String)parms[5], 1);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

