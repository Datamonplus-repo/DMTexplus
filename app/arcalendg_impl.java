package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class arcalendg_impl extends GXWebReport
{
   public arcalendg_impl( com.genexus.internet.HttpContext context )
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
            AV16PMaqCod = httpContext.GetPar( "PMaqCod") ;
            AV17UMaqCod = httpContext.GetPar( "UMaqCod") ;
            AV18PAny = (short)(GXutil.lval( httpContext.GetPar( "PAny"))) ;
            AV19UAny = (short)(GXutil.lval( httpContext.GetPar( "UAny"))) ;
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
         GXt_char1 = AV32Lit0 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN116_", ""), (byte)(99), GXv_char2) ;
         arcalendg_impl.this.GXt_char1 = GXv_char2[0] ;
         AV32Lit0 = GXt_char1 ;
         GXt_char1 = AV33Lit1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN113_", ""), (byte)(99), GXv_char2) ;
         arcalendg_impl.this.GXt_char1 = GXv_char2[0] ;
         AV33Lit1 = GXt_char1 ;
         GXt_char1 = AV34Lit2 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN824_", ""), (byte)(99), GXv_char2) ;
         arcalendg_impl.this.GXt_char1 = GXv_char2[0] ;
         AV34Lit2 = GXt_char1 ;
         GXt_char1 = AV35Lit3 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN825_", ""), (byte)(99), GXv_char2) ;
         arcalendg_impl.this.GXt_char1 = GXv_char2[0] ;
         AV35Lit3 = GXt_char1 ;
         GXt_char1 = AV36Lit4 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN826_", ""), (byte)(99), GXv_char2) ;
         arcalendg_impl.this.GXt_char1 = GXv_char2[0] ;
         AV36Lit4 = GXt_char1 ;
         GXt_char1 = AV37Lit5 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN827_", ""), (byte)(99), GXv_char2) ;
         arcalendg_impl.this.GXt_char1 = GXv_char2[0] ;
         AV37Lit5 = GXt_char1 ;
         GXt_char1 = AV53Lit18 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN828_", ""), (byte)(99), GXv_char2) ;
         arcalendg_impl.this.GXt_char1 = GXv_char2[0] ;
         AV53Lit18 = GXt_char1 ;
         GXt_char1 = AV54Lit19 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN830_", ""), (byte)(99), GXv_char2) ;
         arcalendg_impl.this.GXt_char1 = GXv_char2[0] ;
         AV54Lit19 = GXt_char1 ;
         GXt_char1 = AV55Lit20 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN831_", ""), (byte)(99), GXv_char2) ;
         arcalendg_impl.this.GXt_char1 = GXv_char2[0] ;
         AV55Lit20 = GXt_char1 ;
         GXt_char1 = AV38Lit6 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2125_", ""), (byte)(99), GXv_char2) ;
         arcalendg_impl.this.GXt_char1 = GXv_char2[0] ;
         AV38Lit6 = GXt_char1 ;
         GXt_char1 = AV39Lit7 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2165_", ""), (byte)(99), GXv_char2) ;
         arcalendg_impl.this.GXt_char1 = GXv_char2[0] ;
         AV39Lit7 = GXt_char1 ;
         GXt_char1 = AV40Lit8 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2281_", ""), (byte)(99), GXv_char2) ;
         arcalendg_impl.this.GXt_char1 = GXv_char2[0] ;
         AV40Lit8 = GXt_char1 ;
         GXt_char1 = AV41Lit9 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2003_", ""), (byte)(99), GXv_char2) ;
         arcalendg_impl.this.GXt_char1 = GXv_char2[0] ;
         AV41Lit9 = GXt_char1 ;
         GXt_char1 = AV42Lit10 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2287_", ""), (byte)(99), GXv_char2) ;
         arcalendg_impl.this.GXt_char1 = GXv_char2[0] ;
         AV42Lit10 = GXt_char1 ;
         GXt_char1 = AV43Lit11 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2211_", ""), (byte)(99), GXv_char2) ;
         arcalendg_impl.this.GXt_char1 = GXv_char2[0] ;
         AV43Lit11 = GXt_char1 ;
         GXt_char1 = AV44Lit12 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2209_", ""), (byte)(99), GXv_char2) ;
         arcalendg_impl.this.GXt_char1 = GXv_char2[0] ;
         AV44Lit12 = GXt_char1 ;
         GXt_char1 = AV45Lit13 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2010_", ""), (byte)(99), GXv_char2) ;
         arcalendg_impl.this.GXt_char1 = GXv_char2[0] ;
         AV45Lit13 = GXt_char1 ;
         GXt_char1 = AV46Lit14 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2426_", ""), (byte)(99), GXv_char2) ;
         arcalendg_impl.this.GXt_char1 = GXv_char2[0] ;
         AV46Lit14 = GXt_char1 ;
         GXt_char1 = AV47Lit15 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2331_", ""), (byte)(99), GXv_char2) ;
         arcalendg_impl.this.GXt_char1 = GXv_char2[0] ;
         AV47Lit15 = GXt_char1 ;
         GXt_char1 = AV48Lit16 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2325_", ""), (byte)(99), GXv_char2) ;
         arcalendg_impl.this.GXt_char1 = GXv_char2[0] ;
         AV48Lit16 = GXt_char1 ;
         GXt_char1 = AV49Lit17 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2109_", ""), (byte)(99), GXv_char2) ;
         arcalendg_impl.this.GXt_char1 = GXv_char2[0] ;
         AV49Lit17 = GXt_char1 ;
         AV50Mes_01 = GXutil.trim( AV34Lit2) + " " + GXutil.trim( AV35Lit3) + " " + GXutil.trim( AV36Lit4) + GXutil.trim( AV37Lit5) + " " + GXutil.trim( AV53Lit18) + " " + GXutil.trim( AV54Lit19) + " " + GXutil.trim( AV55Lit20) ;
         AV51Mes_02 = GXutil.trim( AV34Lit2) + " " + GXutil.trim( AV35Lit3) + " " + GXutil.trim( AV36Lit4) + GXutil.trim( AV37Lit5) + " " + GXutil.trim( AV53Lit18) + " " + GXutil.trim( AV54Lit19) + " " + GXutil.trim( AV55Lit20) ;
         AV52Mes_03 = GXutil.trim( AV34Lit2) + " " + GXutil.trim( AV35Lit3) + " " + GXutil.trim( AV36Lit4) + GXutil.trim( AV37Lit5) + " " + GXutil.trim( AV53Lit18) + " " + GXutil.trim( AV54Lit19) + " " + GXutil.trim( AV55Lit20) ;
         GxHdr2 = true ;
         /* Using cursor P07042 */
         pr_default.execute(0, new Object[] {A396EmprCod, AV16PMaqCod, AV17UMaqCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A602MaqCod = P07042_A602MaqCod[0] ;
            A606MaqDsc = P07042_A606MaqDsc[0] ;
            n606MaqDsc = P07042_n606MaqDsc[0] ;
            AV30Exist = (byte)(0) ;
            /* Using cursor P07043 */
            pr_default.execute(1, new Object[] {A396EmprCod, A602MaqCod, Short.valueOf(AV18PAny), Short.valueOf(AV19UAny)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A599MaqAny = P07043_A599MaqAny[0] ;
               A614MaqMes = P07043_A614MaqMes[0] ;
               AV30Exist = (byte)(1) ;
               pr_default.readNext(1);
            }
            pr_default.close(1);
            if ( AV30Exist == 1 )
            {
               AV24Anyo = AV18PAny ;
               while ( AV24Anyo <= AV19UAny )
               {
                  AV25Mes = (byte)(1) ;
                  while ( AV25Mes <= 12 )
                  {
                     GXv_char2[0] = A396EmprCod ;
                     GXv_char3[0] = A602MaqCod ;
                     GXv_int4[0] = AV25Mes ;
                     GXv_int5[0] = AV24Anyo ;
                     new app.pcalenda(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_int4, GXv_int5, AV20CALENDARI, AV21HNPROD) ;
                     arcalendg_impl.this.A396EmprCod = GXv_char2[0] ;
                     arcalendg_impl.this.A602MaqCod = GXv_char3[0] ;
                     arcalendg_impl.this.AV25Mes = GXv_int4[0] ;
                     arcalendg_impl.this.AV24Anyo = GXv_int5[0] ;
                     if ( ( AV25Mes == 1 ) || ( AV25Mes == 4 ) || ( AV25Mes == 7 ) || ( AV25Mes == 10 ) )
                     {
                        AV26FilaIni = (byte)(1) ;
                        AV27ColIni = (byte)(1) ;
                     }
                     if ( ( AV25Mes == 2 ) || ( AV25Mes == 5 ) || ( AV25Mes == 8 ) || ( AV25Mes == 11 ) )
                     {
                        AV26FilaIni = (byte)(1) ;
                        AV27ColIni = (byte)(8) ;
                     }
                     if ( ( AV25Mes == 3 ) || ( AV25Mes == 6 ) || ( AV25Mes == 9 ) || ( AV25Mes == 12 ) )
                     {
                        AV26FilaIni = (byte)(1) ;
                        AV27ColIni = (byte)(15) ;
                     }
                     if ( AV25Mes == 1 )
                     {
                        h7040( false, 65) ;
                        getPrinter().GxDrawLine(13, Gx_line+51, 374, Gx_line+51, 2, 0, 0, 0, 0) ;
                        getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38Lit6, "")), 153, Gx_line+9, 233, Gx_line+25, 1, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39Lit7, "")), 530, Gx_line+9, 603, Gx_line+25, 1, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40Lit8, "")), 904, Gx_line+9, 977, Gx_line+25, 1, 0, 0, 0) ;
                        getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50Mes_01, "")), 13, Gx_line+29, 374, Gx_line+45, 1, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51Mes_02, "")), 385, Gx_line+29, 746, Gx_line+45, 1, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52Mes_03, "")), 759, Gx_line+29, 1120, Gx_line+45, 1, 0, 0, 0) ;
                        getPrinter().GxDrawLine(759, Gx_line+51, 1120, Gx_line+51, 2, 0, 0, 0, 0) ;
                        getPrinter().GxDrawLine(385, Gx_line+51, 746, Gx_line+51, 2, 0, 0, 0, 0) ;
                        Gx_OldLine = Gx_line ;
                        Gx_line = (int)(Gx_line+65) ;
                     }
                     if ( AV25Mes == 4 )
                     {
                        h7040( false, 65) ;
                        getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50Mes_01, "")), 13, Gx_line+28, 374, Gx_line+44, 1, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51Mes_02, "")), 385, Gx_line+28, 746, Gx_line+44, 1, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52Mes_03, "")), 759, Gx_line+28, 1120, Gx_line+44, 1, 0, 0, 0) ;
                        getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42Lit10, "")), 530, Gx_line+8, 603, Gx_line+24, 1, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43Lit11, "")), 904, Gx_line+8, 977, Gx_line+24, 1, 0, 0, 0) ;
                        getPrinter().GxAttris("Microsoft Sans Serif", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41Lit9, "")), 157, Gx_line+8, 230, Gx_line+24, 1, 0, 0, 0) ;
                        getPrinter().GxDrawLine(13, Gx_line+50, 374, Gx_line+50, 2, 0, 0, 0, 0) ;
                        getPrinter().GxDrawLine(385, Gx_line+50, 746, Gx_line+50, 2, 0, 0, 0, 0) ;
                        getPrinter().GxDrawLine(759, Gx_line+50, 1120, Gx_line+50, 2, 0, 0, 0, 0) ;
                        Gx_OldLine = Gx_line ;
                        Gx_line = (int)(Gx_line+65) ;
                     }
                     if ( AV25Mes == 7 )
                     {
                        h7040( false, 65) ;
                        getPrinter().GxDrawLine(13, Gx_line+51, 374, Gx_line+51, 2, 0, 0, 0, 0) ;
                        getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44Lit12, "")), 163, Gx_line+9, 227, Gx_line+26, 1+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45Lit13, "")), 535, Gx_line+9, 599, Gx_line+26, 1+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46Lit14, "")), 909, Gx_line+9, 973, Gx_line+26, 1+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50Mes_01, "")), 13, Gx_line+29, 374, Gx_line+45, 1, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51Mes_02, "")), 385, Gx_line+29, 746, Gx_line+45, 1, 0, 0, 0) ;
                        getPrinter().GxDrawLine(385, Gx_line+51, 746, Gx_line+51, 2, 0, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52Mes_03, "")), 759, Gx_line+29, 1120, Gx_line+45, 1, 0, 0, 0) ;
                        getPrinter().GxDrawLine(759, Gx_line+51, 1120, Gx_line+51, 2, 0, 0, 0, 0) ;
                        Gx_OldLine = Gx_line ;
                        Gx_line = (int)(Gx_line+65) ;
                     }
                     if ( AV25Mes == 10 )
                     {
                        h7040( false, 65) ;
                        getPrinter().GxDrawLine(13, Gx_line+50, 374, Gx_line+50, 2, 0, 0, 0, 0) ;
                        getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47Lit15, "")), 163, Gx_line+8, 227, Gx_line+25, 1+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48Lit16, "")), 535, Gx_line+8, 599, Gx_line+25, 1+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49Lit17, "")), 909, Gx_line+8, 973, Gx_line+25, 1+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50Mes_01, "")), 13, Gx_line+28, 374, Gx_line+44, 1, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51Mes_02, "")), 385, Gx_line+28, 746, Gx_line+44, 1, 0, 0, 0) ;
                        getPrinter().GxDrawLine(385, Gx_line+50, 746, Gx_line+50, 2, 0, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52Mes_03, "")), 759, Gx_line+28, 1120, Gx_line+44, 1, 0, 0, 0) ;
                        getPrinter().GxDrawLine(759, Gx_line+50, 1120, Gx_line+50, 2, 0, 0, 0, 0) ;
                        Gx_OldLine = Gx_line ;
                        Gx_line = (int)(Gx_line+65) ;
                     }
                     AV28Fila = (byte)(0) ;
                     AV29Col = (byte)(0) ;
                     while ( AV28Fila <= 5 )
                     {
                        while ( AV29Col <= 6 )
                        {
                           AV22CALEND[AV26FilaIni+AV28Fila-1][AV27ColIni+AV29Col-1] = AV20CALENDARI[AV28Fila+1-1][AV29Col+1-1] ;
                           AV23HNP[AV26FilaIni+AV28Fila-1][AV27ColIni+AV29Col-1] = AV21HNPROD[AV28Fila+1-1][AV29Col+1-1] ;
                           AV29Col = (byte)(AV29Col+1) ;
                        }
                        AV29Col = (byte)(0) ;
                        AV28Fila = (byte)(AV28Fila+1) ;
                     }
                     if ( ( AV25Mes == 3 ) || ( AV25Mes == 6 ) || ( AV25Mes == 9 ) || ( AV25Mes == 12 ) )
                     {
                        h7040( false, 255) ;
                        getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[1-1][1-1], "")), 24, Gx_line+0, 69, Gx_line+17, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[1-1][2-1], "")), 75, Gx_line+0, 120, Gx_line+17, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[1-1][3-1], "")), 126, Gx_line+0, 171, Gx_line+17, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[1-1][4-1], "")), 177, Gx_line+0, 222, Gx_line+17, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[1-1][5-1], "")), 228, Gx_line+0, 273, Gx_line+17, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[1-1][6-1], "")), 279, Gx_line+0, 324, Gx_line+17, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[1-1][7-1], "")), 330, Gx_line+0, 375, Gx_line+17, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[1-1][8-1], "")), 397, Gx_line+0, 442, Gx_line+17, 0+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[1-1][9-1], "")), 448, Gx_line+0, 492, Gx_line+16, 0, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[1-1][10-1], "")), 499, Gx_line+0, 543, Gx_line+16, 0, 0, 0, 0) ;
                        getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[1-1][11-1], "")), 550, Gx_line+0, 595, Gx_line+17, 0+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[1-1][12-1], "")), 601, Gx_line+0, 645, Gx_line+16, 0, 0, 0, 0) ;
                        getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[1-1][13-1], "")), 652, Gx_line+0, 697, Gx_line+17, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[1-1][14-1], "")), 703, Gx_line+0, 748, Gx_line+17, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[1-1][15-1], "")), 771, Gx_line+0, 816, Gx_line+17, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[1-1][16-1], "")), 822, Gx_line+0, 867, Gx_line+17, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[1-1][17-1], "")), 873, Gx_line+0, 918, Gx_line+17, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[1-1][18-1], "")), 924, Gx_line+0, 969, Gx_line+17, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[1-1][19-1], "")), 975, Gx_line+0, 1020, Gx_line+17, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[1-1][20-1], "")), 1026, Gx_line+0, 1071, Gx_line+17, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[1-1][21-1], "")), 1077, Gx_line+0, 1122, Gx_line+17, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[2-1][1-1], "")), 24, Gx_line+39, 69, Gx_line+56, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[2-1][2-1], "")), 75, Gx_line+39, 120, Gx_line+56, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[2-1][3-1], "")), 126, Gx_line+39, 171, Gx_line+56, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[2-1][4-1], "")), 177, Gx_line+39, 222, Gx_line+56, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[2-1][5-1], "")), 228, Gx_line+39, 273, Gx_line+56, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[2-1][6-1], "")), 279, Gx_line+39, 324, Gx_line+56, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[2-1][7-1], "")), 330, Gx_line+39, 375, Gx_line+56, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[2-1][8-1], "")), 397, Gx_line+39, 442, Gx_line+56, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[2-1][9-1], "")), 448, Gx_line+39, 493, Gx_line+56, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[2-1][10-1], "")), 499, Gx_line+39, 544, Gx_line+56, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[2-1][11-1], "")), 550, Gx_line+39, 595, Gx_line+56, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[2-1][12-1], "")), 601, Gx_line+39, 646, Gx_line+56, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[2-1][13-1], "")), 652, Gx_line+39, 697, Gx_line+56, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[2-1][14-1], "")), 703, Gx_line+39, 748, Gx_line+56, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[2-1][15-1], "")), 771, Gx_line+39, 816, Gx_line+56, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[2-1][16-1], "")), 822, Gx_line+39, 867, Gx_line+56, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[2-1][17-1], "")), 873, Gx_line+39, 918, Gx_line+56, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[2-1][18-1], "")), 924, Gx_line+39, 969, Gx_line+56, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[2-1][19-1], "")), 975, Gx_line+39, 1020, Gx_line+56, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[2-1][20-1], "")), 1026, Gx_line+39, 1071, Gx_line+56, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[2-1][21-1], "")), 1077, Gx_line+39, 1122, Gx_line+56, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[3-1][1-1], "")), 24, Gx_line+79, 69, Gx_line+96, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[3-1][2-1], "")), 75, Gx_line+79, 120, Gx_line+96, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[3-1][3-1], "")), 126, Gx_line+79, 171, Gx_line+96, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[3-1][4-1], "")), 177, Gx_line+79, 222, Gx_line+96, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[3-1][5-1], "")), 228, Gx_line+79, 273, Gx_line+96, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[3-1][6-1], "")), 279, Gx_line+79, 324, Gx_line+96, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[3-1][7-1], "")), 330, Gx_line+79, 375, Gx_line+96, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[3-1][8-1], "")), 397, Gx_line+79, 442, Gx_line+96, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[3-1][9-1], "")), 448, Gx_line+79, 493, Gx_line+96, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[3-1][10-1], "")), 499, Gx_line+79, 544, Gx_line+96, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[3-1][11-1], "")), 550, Gx_line+79, 595, Gx_line+96, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[3-1][12-1], "")), 604, Gx_line+79, 649, Gx_line+96, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[3-1][13-1], "")), 652, Gx_line+79, 697, Gx_line+96, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[3-1][14-1], "")), 703, Gx_line+79, 748, Gx_line+96, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[3-1][15-1], "")), 771, Gx_line+79, 816, Gx_line+96, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[3-1][16-1], "")), 822, Gx_line+79, 867, Gx_line+96, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[3-1][17-1], "")), 873, Gx_line+79, 918, Gx_line+96, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[3-1][18-1], "")), 924, Gx_line+79, 969, Gx_line+96, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[3-1][19-1], "")), 975, Gx_line+79, 1020, Gx_line+96, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[3-1][20-1], "")), 1026, Gx_line+79, 1071, Gx_line+96, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[3-1][21-1], "")), 1077, Gx_line+79, 1122, Gx_line+96, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[4-1][1-1], "")), 24, Gx_line+119, 69, Gx_line+136, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[4-1][2-1], "")), 75, Gx_line+119, 120, Gx_line+136, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[4-1][3-1], "")), 126, Gx_line+119, 171, Gx_line+136, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[4-1][4-1], "")), 177, Gx_line+119, 222, Gx_line+136, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[4-1][5-1], "")), 228, Gx_line+119, 273, Gx_line+136, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[4-1][6-1], "")), 279, Gx_line+119, 324, Gx_line+136, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[4-1][7-1], "")), 330, Gx_line+119, 375, Gx_line+136, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[4-1][8-1], "")), 397, Gx_line+119, 442, Gx_line+136, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[4-1][9-1], "")), 448, Gx_line+119, 493, Gx_line+136, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[4-1][10-1], "")), 499, Gx_line+119, 544, Gx_line+136, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[4-1][11-1], "")), 550, Gx_line+119, 595, Gx_line+136, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[4-1][12-1], "")), 604, Gx_line+119, 649, Gx_line+136, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[4-1][13-1], "")), 652, Gx_line+119, 697, Gx_line+136, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[4-1][14-1], "")), 703, Gx_line+119, 748, Gx_line+136, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[4-1][15-1], "")), 771, Gx_line+119, 816, Gx_line+136, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[4-1][16-1], "")), 822, Gx_line+119, 867, Gx_line+136, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[4-1][17-1], "")), 873, Gx_line+119, 918, Gx_line+136, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[4-1][18-1], "")), 924, Gx_line+119, 969, Gx_line+136, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[4-1][19-1], "")), 975, Gx_line+119, 1020, Gx_line+136, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[4-1][20-1], "")), 1026, Gx_line+119, 1071, Gx_line+136, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[4-1][21-1], "")), 1077, Gx_line+119, 1122, Gx_line+136, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[5-1][1-1], "")), 24, Gx_line+158, 69, Gx_line+175, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[5-1][2-1], "")), 75, Gx_line+158, 120, Gx_line+175, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[5-1][3-1], "")), 126, Gx_line+158, 171, Gx_line+175, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[5-1][4-1], "")), 177, Gx_line+158, 222, Gx_line+175, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[5-1][5-1], "")), 228, Gx_line+158, 273, Gx_line+175, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[5-1][6-1], "")), 279, Gx_line+158, 324, Gx_line+175, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[5-1][7-1], "")), 330, Gx_line+158, 375, Gx_line+175, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[5-1][8-1], "")), 397, Gx_line+158, 442, Gx_line+175, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[5-1][9-1], "")), 448, Gx_line+158, 493, Gx_line+175, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[5-1][10-1], "")), 499, Gx_line+158, 544, Gx_line+175, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[5-1][11-1], "")), 550, Gx_line+158, 595, Gx_line+175, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[5-1][12-1], "")), 604, Gx_line+158, 649, Gx_line+175, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[5-1][13-1], "")), 652, Gx_line+158, 697, Gx_line+175, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[5-1][14-1], "")), 703, Gx_line+158, 748, Gx_line+175, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[5-1][15-1], "")), 771, Gx_line+158, 816, Gx_line+175, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[5-1][16-1], "")), 822, Gx_line+158, 867, Gx_line+175, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[5-1][17-1], "")), 873, Gx_line+158, 918, Gx_line+175, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[5-1][18-1], "")), 924, Gx_line+158, 969, Gx_line+175, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[5-1][19-1], "")), 975, Gx_line+158, 1020, Gx_line+175, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[5-1][20-1], "")), 1026, Gx_line+158, 1071, Gx_line+175, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[5-1][21-1], "")), 1077, Gx_line+158, 1122, Gx_line+175, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[6-1][1-1], "")), 24, Gx_line+197, 69, Gx_line+214, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[6-1][2-1], "")), 75, Gx_line+197, 120, Gx_line+214, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[6-1][3-1], "")), 126, Gx_line+197, 171, Gx_line+214, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[6-1][4-1], "")), 177, Gx_line+197, 222, Gx_line+214, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[6-1][5-1], "")), 228, Gx_line+197, 273, Gx_line+214, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[6-1][6-1], "")), 279, Gx_line+197, 324, Gx_line+214, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[6-1][7-1], "")), 330, Gx_line+197, 375, Gx_line+214, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[6-1][8-1], "")), 397, Gx_line+197, 442, Gx_line+214, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[6-1][9-1], "")), 448, Gx_line+197, 493, Gx_line+214, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[6-1][10-1], "")), 499, Gx_line+197, 544, Gx_line+214, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[6-1][11-1], "")), 550, Gx_line+197, 595, Gx_line+214, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[6-1][12-1], "")), 604, Gx_line+197, 649, Gx_line+214, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[6-1][13-1], "")), 652, Gx_line+197, 697, Gx_line+214, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[6-1][14-1], "")), 703, Gx_line+197, 748, Gx_line+214, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[6-1][15-1], "")), 771, Gx_line+197, 816, Gx_line+214, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[6-1][16-1], "")), 822, Gx_line+197, 867, Gx_line+214, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[6-1][17-1], "")), 873, Gx_line+197, 918, Gx_line+214, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[6-1][18-1], "")), 924, Gx_line+197, 969, Gx_line+214, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[6-1][19-1], "")), 975, Gx_line+197, 1020, Gx_line+214, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[6-1][20-1], "")), 1026, Gx_line+197, 1071, Gx_line+214, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22CALEND[6-1][21-1], "")), 1077, Gx_line+197, 1122, Gx_line+214, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawLine(13, Gx_line+240, 374, Gx_line+240, 2, 0, 0, 0, 0) ;
                        getPrinter().GxDrawLine(385, Gx_line+240, 746, Gx_line+240, 2, 0, 0, 0, 0) ;
                        getPrinter().GxDrawLine(759, Gx_line+240, 1120, Gx_line+240, 2, 0, 0, 0, 0) ;
                        getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[1-1][7-1], "")), 330, Gx_line+19, 375, Gx_line+37, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[1-1][8-1], "")), 397, Gx_line+19, 442, Gx_line+37, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[1-1][9-1], "")), 448, Gx_line+19, 493, Gx_line+37, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[1-1][10-1], "")), 499, Gx_line+19, 544, Gx_line+37, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[1-1][11-1], "")), 550, Gx_line+19, 595, Gx_line+37, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[1-1][12-1], "")), 601, Gx_line+19, 646, Gx_line+37, 0+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[1-1][13-1], "")), 652, Gx_line+19, 697, Gx_line+37, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[1-1][14-1], "")), 703, Gx_line+19, 748, Gx_line+37, 0+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[1-1][1-1], "")), 24, Gx_line+19, 69, Gx_line+37, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[1-1][2-1], "")), 75, Gx_line+19, 120, Gx_line+37, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[1-1][3-1], "")), 126, Gx_line+19, 171, Gx_line+37, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[1-1][4-1], "")), 177, Gx_line+19, 222, Gx_line+37, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[1-1][5-1], "")), 228, Gx_line+19, 273, Gx_line+37, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[1-1][6-1], "")), 279, Gx_line+19, 324, Gx_line+37, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[2-1][7-1], "")), 330, Gx_line+58, 375, Gx_line+76, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[2-1][8-1], "")), 397, Gx_line+58, 442, Gx_line+76, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[2-1][9-1], "")), 448, Gx_line+58, 493, Gx_line+76, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[2-1][10-1], "")), 499, Gx_line+58, 544, Gx_line+76, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[2-1][11-1], "")), 550, Gx_line+58, 595, Gx_line+76, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[2-1][12-1], "")), 601, Gx_line+58, 646, Gx_line+76, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[2-1][13-1], "")), 652, Gx_line+58, 697, Gx_line+76, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[2-1][14-1], "")), 703, Gx_line+58, 748, Gx_line+76, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[2-1][1-1], "")), 24, Gx_line+58, 69, Gx_line+76, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[2-1][2-1], "")), 75, Gx_line+58, 120, Gx_line+76, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[2-1][3-1], "")), 126, Gx_line+58, 171, Gx_line+76, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[2-1][4-1], "")), 177, Gx_line+58, 222, Gx_line+76, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[2-1][5-1], "")), 228, Gx_line+58, 273, Gx_line+76, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[2-1][6-1], "")), 279, Gx_line+58, 324, Gx_line+76, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[3-1][7-1], "")), 330, Gx_line+99, 375, Gx_line+117, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[3-1][8-1], "")), 397, Gx_line+99, 442, Gx_line+117, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[3-1][9-1], "")), 448, Gx_line+99, 493, Gx_line+117, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[3-1][10-1], "")), 499, Gx_line+99, 544, Gx_line+117, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[3-1][11-1], "")), 550, Gx_line+99, 595, Gx_line+117, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[3-1][12-1], "")), 601, Gx_line+99, 646, Gx_line+117, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[3-1][13-1], "")), 652, Gx_line+99, 697, Gx_line+117, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[3-1][14-1], "")), 703, Gx_line+99, 748, Gx_line+117, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[3-1][1-1], "")), 24, Gx_line+99, 69, Gx_line+117, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[3-1][2-1], "")), 75, Gx_line+99, 120, Gx_line+117, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[3-1][3-1], "")), 126, Gx_line+99, 171, Gx_line+117, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[3-1][4-1], "")), 177, Gx_line+99, 222, Gx_line+117, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[3-1][5-1], "")), 228, Gx_line+99, 273, Gx_line+117, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[3-1][6-1], "")), 279, Gx_line+99, 324, Gx_line+117, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[4-1][7-1], "")), 330, Gx_line+138, 375, Gx_line+156, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[4-1][8-1], "")), 397, Gx_line+138, 442, Gx_line+156, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[4-1][9-1], "")), 448, Gx_line+138, 493, Gx_line+156, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[4-1][10-1], "")), 499, Gx_line+138, 544, Gx_line+156, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[4-1][11-1], "")), 550, Gx_line+138, 595, Gx_line+156, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[4-1][12-1], "")), 601, Gx_line+138, 646, Gx_line+156, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[4-1][13-1], "")), 652, Gx_line+138, 697, Gx_line+156, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[4-1][14-1], "")), 703, Gx_line+138, 748, Gx_line+156, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[4-1][1-1], "")), 24, Gx_line+138, 69, Gx_line+156, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[4-1][2-1], "")), 75, Gx_line+138, 120, Gx_line+156, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[4-1][3-1], "")), 126, Gx_line+138, 171, Gx_line+156, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[4-1][4-1], "")), 177, Gx_line+138, 222, Gx_line+156, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[4-1][5-1], "")), 228, Gx_line+138, 273, Gx_line+156, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[4-1][6-1], "")), 279, Gx_line+138, 324, Gx_line+156, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[5-1][7-1], "")), 330, Gx_line+177, 375, Gx_line+195, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[5-1][8-1], "")), 397, Gx_line+177, 442, Gx_line+195, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[5-1][9-1], "")), 448, Gx_line+177, 493, Gx_line+195, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[5-1][10-1], "")), 499, Gx_line+177, 544, Gx_line+195, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[5-1][11-1], "")), 550, Gx_line+177, 595, Gx_line+195, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[5-1][12-1], "")), 601, Gx_line+177, 646, Gx_line+195, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[5-1][13-1], "")), 652, Gx_line+177, 697, Gx_line+195, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[5-1][14-1], "")), 703, Gx_line+177, 748, Gx_line+195, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[5-1][1-1], "")), 24, Gx_line+177, 69, Gx_line+195, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[5-1][2-1], "")), 75, Gx_line+177, 120, Gx_line+195, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[5-1][3-1], "")), 126, Gx_line+177, 171, Gx_line+195, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[5-1][4-1], "")), 177, Gx_line+177, 222, Gx_line+195, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[5-1][5-1], "")), 228, Gx_line+177, 273, Gx_line+195, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[5-1][6-1], "")), 279, Gx_line+177, 324, Gx_line+195, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[6-1][7-1], "")), 330, Gx_line+217, 375, Gx_line+235, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[6-1][8-1], "")), 397, Gx_line+217, 442, Gx_line+235, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[6-1][9-1], "")), 448, Gx_line+217, 493, Gx_line+235, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[6-1][10-1], "")), 499, Gx_line+217, 544, Gx_line+235, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[6-1][11-1], "")), 550, Gx_line+217, 595, Gx_line+235, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[6-1][12-1], "")), 601, Gx_line+217, 646, Gx_line+235, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[6-1][13-1], "")), 652, Gx_line+217, 697, Gx_line+235, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[6-1][14-1], "")), 703, Gx_line+217, 748, Gx_line+235, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[6-1][1-1], "")), 24, Gx_line+217, 69, Gx_line+235, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[6-1][2-1], "")), 75, Gx_line+217, 120, Gx_line+235, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[6-1][3-1], "")), 126, Gx_line+217, 171, Gx_line+235, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[6-1][4-1], "")), 177, Gx_line+217, 222, Gx_line+235, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[6-1][5-1], "")), 228, Gx_line+217, 273, Gx_line+235, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[6-1][6-1], "")), 279, Gx_line+217, 324, Gx_line+235, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[1-1][15-1], "")), 771, Gx_line+19, 816, Gx_line+37, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[1-1][16-1], "")), 822, Gx_line+19, 867, Gx_line+37, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[1-1][17-1], "")), 873, Gx_line+19, 918, Gx_line+37, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[1-1][18-1], "")), 924, Gx_line+19, 969, Gx_line+37, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[1-1][19-1], "")), 975, Gx_line+19, 1020, Gx_line+37, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[1-1][20-1], "")), 1026, Gx_line+19, 1071, Gx_line+37, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[1-1][21-1], "")), 1077, Gx_line+19, 1122, Gx_line+37, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[2-1][15-1], "")), 771, Gx_line+58, 816, Gx_line+76, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[2-1][16-1], "")), 822, Gx_line+58, 867, Gx_line+76, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[2-1][17-1], "")), 873, Gx_line+58, 918, Gx_line+76, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[2-1][18-1], "")), 924, Gx_line+58, 969, Gx_line+76, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[2-1][19-1], "")), 975, Gx_line+58, 1020, Gx_line+76, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[2-1][20-1], "")), 1026, Gx_line+58, 1071, Gx_line+76, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[2-1][21-1], "")), 1077, Gx_line+58, 1122, Gx_line+76, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[3-1][15-1], "")), 771, Gx_line+99, 816, Gx_line+117, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[3-1][16-1], "")), 822, Gx_line+99, 867, Gx_line+117, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[3-1][17-1], "")), 873, Gx_line+99, 918, Gx_line+117, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[3-1][18-1], "")), 924, Gx_line+99, 969, Gx_line+117, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[3-1][19-1], "")), 975, Gx_line+99, 1020, Gx_line+117, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[3-1][20-1], "")), 1026, Gx_line+99, 1071, Gx_line+117, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[3-1][21-1], "")), 1077, Gx_line+99, 1122, Gx_line+117, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[4-1][15-1], "")), 771, Gx_line+138, 816, Gx_line+156, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[4-1][16-1], "")), 822, Gx_line+138, 867, Gx_line+156, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[4-1][17-1], "")), 873, Gx_line+138, 918, Gx_line+156, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[4-1][18-1], "")), 924, Gx_line+138, 969, Gx_line+156, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[4-1][19-1], "")), 975, Gx_line+138, 1020, Gx_line+156, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[4-1][20-1], "")), 1026, Gx_line+138, 1071, Gx_line+156, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[4-1][21-1], "")), 1077, Gx_line+138, 1122, Gx_line+156, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[5-1][15-1], "")), 771, Gx_line+177, 816, Gx_line+195, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[5-1][16-1], "")), 822, Gx_line+177, 867, Gx_line+195, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[5-1][17-1], "")), 873, Gx_line+177, 918, Gx_line+195, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[5-1][18-1], "")), 924, Gx_line+177, 969, Gx_line+195, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[5-1][19-1], "")), 975, Gx_line+177, 1020, Gx_line+195, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[5-1][20-1], "")), 1026, Gx_line+177, 1071, Gx_line+195, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[5-1][21-1], "")), 1077, Gx_line+177, 1122, Gx_line+195, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[6-1][15-1], "")), 771, Gx_line+217, 816, Gx_line+235, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[6-1][16-1], "")), 822, Gx_line+217, 867, Gx_line+235, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[6-1][17-1], "")), 873, Gx_line+217, 918, Gx_line+235, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[6-1][18-1], "")), 924, Gx_line+217, 969, Gx_line+235, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[6-1][19-1], "")), 975, Gx_line+217, 1020, Gx_line+235, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[6-1][20-1], "")), 1026, Gx_line+217, 1071, Gx_line+235, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23HNP[6-1][21-1], "")), 1077, Gx_line+217, 1122, Gx_line+235, 0+256, 0, 0, 0) ;
                        Gx_OldLine = Gx_line ;
                        Gx_line = (int)(Gx_line+255) ;
                        if ( ( AV25Mes == 6 ) || ( AV25Mes == 12 ) )
                        {
                           /* Eject command */
                           Gx_OldLine = Gx_line ;
                           Gx_line = (int)(P_lines+1) ;
                        }
                     }
                     AV25Mes = (byte)(AV25Mes+1) ;
                  }
                  AV24Anyo = (short)(AV24Anyo+1) ;
               }
            }
            pr_default.readNext(0);
         }
         pr_default.close(0);
         GxHdr2 = false ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h7040( true, 0) ;
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

   public void h7040( boolean bFoot ,
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
            if ( GxHdr2 )
            {
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A602MaqCod, "")), 139, Gx_line+21, 215, Gx_line+38, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A606MaqDsc, "")), 224, Gx_line+21, 325, Gx_line+38, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV24Anyo), "ZZZ9")), 434, Gx_line+21, 464, Gx_line+38, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(0, Gx_line+42, 1153, Gx_line+42, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32Lit0, "")), 58, Gx_line+21, 116, Gx_line+37, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33Lit1, "")), 397, Gx_line+21, 426, Gx_line+37, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 123, Gx_line+21, 127, Gx_line+37, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 428, Gx_line+21, 432, Gx_line+37, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+58) ;
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
      add_metrics4( ) ;
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Arial", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Courier New", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics2( )
   {
      getPrinter().setMetrics("Microsoft Sans Serif", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics3( )
   {
      getPrinter().setMetrics("Courier New", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics4( )
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
      AV16PMaqCod = "" ;
      AV17UMaqCod = "" ;
      AV32Lit0 = "" ;
      AV33Lit1 = "" ;
      AV34Lit2 = "" ;
      AV35Lit3 = "" ;
      AV36Lit4 = "" ;
      AV37Lit5 = "" ;
      AV53Lit18 = "" ;
      AV54Lit19 = "" ;
      AV55Lit20 = "" ;
      AV38Lit6 = "" ;
      AV39Lit7 = "" ;
      AV40Lit8 = "" ;
      AV41Lit9 = "" ;
      AV42Lit10 = "" ;
      AV43Lit11 = "" ;
      AV44Lit12 = "" ;
      AV45Lit13 = "" ;
      AV46Lit14 = "" ;
      AV47Lit15 = "" ;
      AV48Lit16 = "" ;
      AV49Lit17 = "" ;
      GXt_char1 = "" ;
      AV50Mes_01 = "" ;
      AV51Mes_02 = "" ;
      AV52Mes_03 = "" ;
      scmdbuf = "" ;
      P07042_A396EmprCod = new String[] {""} ;
      P07042_A602MaqCod = new String[] {""} ;
      P07042_A606MaqDsc = new String[] {""} ;
      P07042_n606MaqDsc = new boolean[] {false} ;
      A602MaqCod = "" ;
      A606MaqDsc = "" ;
      P07043_A396EmprCod = new String[] {""} ;
      P07043_A602MaqCod = new String[] {""} ;
      P07043_A599MaqAny = new short[1] ;
      P07043_A614MaqMes = new byte[1] ;
      GXv_char2 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int4 = new byte[1] ;
      GXv_int5 = new short[1] ;
      AV20CALENDARI = new String[6][7] ;
      GX_I = 1 ;
      while ( GX_I <= 6 )
      {
         GX_J = 1 ;
         while ( GX_J <= 7 )
         {
            AV20CALENDARI[GX_I-1][GX_J-1] = "" ;
            GX_J = (int)(GX_J+1) ;
         }
         GX_I = (int)(GX_I+1) ;
      }
      AV21HNPROD = new String[6][7] ;
      GX_I = 1 ;
      while ( GX_I <= 6 )
      {
         GX_J = 1 ;
         while ( GX_J <= 7 )
         {
            AV21HNPROD[GX_I-1][GX_J-1] = "" ;
            GX_J = (int)(GX_J+1) ;
         }
         GX_I = (int)(GX_I+1) ;
      }
      AV22CALEND = new String[6][21] ;
      GX_I = 1 ;
      while ( GX_I <= 6 )
      {
         GX_J = 1 ;
         while ( GX_J <= 21 )
         {
            AV22CALEND[GX_I-1][GX_J-1] = "" ;
            GX_J = (int)(GX_J+1) ;
         }
         GX_I = (int)(GX_I+1) ;
      }
      AV23HNP = new String[6][21] ;
      GX_I = 1 ;
      while ( GX_I <= 6 )
      {
         GX_J = 1 ;
         while ( GX_J <= 21 )
         {
            AV23HNP[GX_I-1][GX_J-1] = "" ;
            GX_J = (int)(GX_J+1) ;
         }
         GX_I = (int)(GX_I+1) ;
      }
      pr_default = new DataStoreProvider(context, remoteHandle, new app.arcalendg__default(),
         new Object[] {
             new Object[] {
            P07042_A396EmprCod, P07042_A602MaqCod, P07042_A606MaqDsc, P07042_n606MaqDsc
            }
            , new Object[] {
            P07043_A396EmprCod, P07043_A602MaqCod, P07043_A599MaqAny, P07043_A614MaqMes
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte AV30Exist ;
   private byte A614MaqMes ;
   private byte AV25Mes ;
   private byte GXv_int4[] ;
   private byte AV26FilaIni ;
   private byte AV27ColIni ;
   private byte AV28Fila ;
   private byte AV29Col ;
   private short gxcookieaux ;
   private short AV18PAny ;
   private short AV19UAny ;
   private short A599MaqAny ;
   private short AV24Anyo ;
   private short GXv_int5[] ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int GX_I ;
   private int GX_J ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV16PMaqCod ;
   private String AV17UMaqCod ;
   private String AV32Lit0 ;
   private String AV33Lit1 ;
   private String AV34Lit2 ;
   private String AV35Lit3 ;
   private String AV36Lit4 ;
   private String AV37Lit5 ;
   private String AV53Lit18 ;
   private String AV54Lit19 ;
   private String AV55Lit20 ;
   private String AV38Lit6 ;
   private String AV39Lit7 ;
   private String AV40Lit8 ;
   private String AV41Lit9 ;
   private String AV42Lit10 ;
   private String AV43Lit11 ;
   private String AV44Lit12 ;
   private String AV45Lit13 ;
   private String AV46Lit14 ;
   private String AV47Lit15 ;
   private String AV48Lit16 ;
   private String AV49Lit17 ;
   private String GXt_char1 ;
   private String AV50Mes_01 ;
   private String AV51Mes_02 ;
   private String AV52Mes_03 ;
   private String scmdbuf ;
   private String A602MaqCod ;
   private String A606MaqDsc ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String AV20CALENDARI[][] ;
   private String AV21HNPROD[][] ;
   private String AV22CALEND[][] ;
   private String AV23HNP[][] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean GxHdr2 ;
   private boolean n606MaqDsc ;
   private IDataStoreProvider pr_default ;
   private String[] P07042_A396EmprCod ;
   private String[] P07042_A602MaqCod ;
   private String[] P07042_A606MaqDsc ;
   private boolean[] P07042_n606MaqDsc ;
   private String[] P07043_A396EmprCod ;
   private String[] P07043_A602MaqCod ;
   private short[] P07043_A599MaqAny ;
   private byte[] P07043_A614MaqMes ;
}

final  class arcalendg__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07042", "SELECT EmprCod, MaqCod, MaqDsc FROM TXPMAQUIN WHERE (EmprCod = ? and MaqCod >= ?) AND (MaqCod <= ?) ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07043", "SELECT EmprCod, MaqCod, MaqAny, MaqMes FROM TXPMAQHNP WHERE (EmprCod = ? and MaqCod = ? and MaqAny >= ?) AND (MaqAny <= ?) ORDER BY EmprCod, MaqCod, MaqAny ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
      }
   }

}

