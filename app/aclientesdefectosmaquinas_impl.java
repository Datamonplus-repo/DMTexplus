package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class aclientesdefectosmaquinas_impl extends GXWebReport
{
   public aclientesdefectosmaquinas_impl( com.genexus.internet.HttpContext context )
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
      gxfirstwebparm = httpContext.GetNextPar( ) ;
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
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
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 1, 256, 16834, 11909, 0, 1, 1, 0, 1, 1) )
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
         AV12Emprcod = "001" ;
         AV13HisEstReo = (byte)(1) ;
         AV9ClicodIni = 0 ;
         AV10FechaFin = GXutil.resetTime(GXutil.now( )) ;
         AV11FechaIni = GXutil.addmth( AV10FechaFin, (short)(-3)) ;
         h87X0( false, 60) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 33, Gx_line+33, 67, Gx_line+47, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Maquina", ""), 258, Gx_line+33, 302, Gx_line+47, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Kilos", ""), 691, Gx_line+33, 715, Gx_line+47, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(localUtil.format( AV11FechaIni, "99/99/99"), 700, Gx_line+0, 749, Gx_line+15, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(localUtil.format( AV10FechaFin, "99/99/99"), 758, Gx_line+0, 807, Gx_line+15, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Defecto", ""), 442, Gx_line+33, 483, Gx_line+47, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawLine(33, Gx_line+50, 190, Gx_line+50, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(258, Gx_line+50, 425, Gx_line+50, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(442, Gx_line+50, 642, Gx_line+50, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(658, Gx_line+50, 715, Gx_line+50, 1, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+60) ;
         AV14KilosCliente = DecimalUtil.doubleToDec(0) ;
         AV15MetrosCliente = DecimalUtil.doubleToDec(0) ;
         /* Using cursor P087X2 */
         pr_default.execute(0, new Object[] {AV12Emprcod, AV11FechaIni, AV10FechaFin, Integer.valueOf(AV9ClicodIni), Integer.valueOf(AV9ClicodIni), Byte.valueOf(AV13HisEstReo)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            brk87X2 = false ;
            A834TipDefDsc = P087X2_A834TipDefDsc[0] ;
            n834TipDefDsc = P087X2_n834TipDefDsc[0] ;
            A833TipDefCod = P087X2_A833TipDefCod[0] ;
            A606MaqDsc = P087X2_A606MaqDsc[0] ;
            n606MaqDsc = P087X2_n606MaqDsc[0] ;
            A602MaqCod = P087X2_A602MaqCod[0] ;
            n602MaqCod = P087X2_n602MaqCod[0] ;
            A252CliCod = P087X2_A252CliCod[0] ;
            n252CliCod = P087X2_n252CliCod[0] ;
            A396EmprCod = P087X2_A396EmprCod[0] ;
            A540HisBarKgm = P087X2_A540HisBarKgm[0] ;
            n540HisBarKgm = P087X2_n540HisBarKgm[0] ;
            A279CliNom = P087X2_A279CliNom[0] ;
            A548HisEstReo = P087X2_A548HisEstReo[0] ;
            n548HisEstReo = P087X2_n548HisEstReo[0] ;
            A569HisReoFec = P087X2_A569HisReoFec[0] ;
            n569HisReoFec = P087X2_n569HisReoFec[0] ;
            A539HisBarCod = P087X2_A539HisBarCod[0] ;
            A545HisCodReo = P087X2_A545HisCodReo[0] ;
            A544HisCodPar = P087X2_A544HisCodPar[0] ;
            A279CliNom = P087X2_A279CliNom[0] ;
            A606MaqDsc = P087X2_A606MaqDsc[0] ;
            n606MaqDsc = P087X2_n606MaqDsc[0] ;
            A834TipDefDsc = P087X2_A834TipDefDsc[0] ;
            n834TipDefDsc = P087X2_n834TipDefDsc[0] ;
            while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P087X2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P087X2_A252CliCod[0] == A252CliCod ) )
            {
               brk87X2 = false ;
               A834TipDefDsc = P087X2_A834TipDefDsc[0] ;
               n834TipDefDsc = P087X2_n834TipDefDsc[0] ;
               A833TipDefCod = P087X2_A833TipDefCod[0] ;
               A606MaqDsc = P087X2_A606MaqDsc[0] ;
               n606MaqDsc = P087X2_n606MaqDsc[0] ;
               A602MaqCod = P087X2_A602MaqCod[0] ;
               n602MaqCod = P087X2_n602MaqCod[0] ;
               A540HisBarKgm = P087X2_A540HisBarKgm[0] ;
               n540HisBarKgm = P087X2_n540HisBarKgm[0] ;
               A279CliNom = P087X2_A279CliNom[0] ;
               A539HisBarCod = P087X2_A539HisBarCod[0] ;
               A545HisCodReo = P087X2_A545HisCodReo[0] ;
               A544HisCodPar = P087X2_A544HisCodPar[0] ;
               A279CliNom = P087X2_A279CliNom[0] ;
               A606MaqDsc = P087X2_A606MaqDsc[0] ;
               n606MaqDsc = P087X2_n606MaqDsc[0] ;
               A834TipDefDsc = P087X2_A834TipDefDsc[0] ;
               n834TipDefDsc = P087X2_n834TipDefDsc[0] ;
               h87X0( false, 17) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 33, Gx_line+0, 190, Gx_line+15, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               /* Noskip command */
               Gx_line = Gx_OldLine ;
               while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P087X2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P087X2_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(P087X2_A602MaqCod[0], A602MaqCod) == 0 ) )
               {
                  brk87X2 = false ;
                  A834TipDefDsc = P087X2_A834TipDefDsc[0] ;
                  n834TipDefDsc = P087X2_n834TipDefDsc[0] ;
                  A833TipDefCod = P087X2_A833TipDefCod[0] ;
                  A606MaqDsc = P087X2_A606MaqDsc[0] ;
                  n606MaqDsc = P087X2_n606MaqDsc[0] ;
                  A540HisBarKgm = P087X2_A540HisBarKgm[0] ;
                  n540HisBarKgm = P087X2_n540HisBarKgm[0] ;
                  A539HisBarCod = P087X2_A539HisBarCod[0] ;
                  A545HisCodReo = P087X2_A545HisCodReo[0] ;
                  A544HisCodPar = P087X2_A544HisCodPar[0] ;
                  A606MaqDsc = P087X2_A606MaqDsc[0] ;
                  n606MaqDsc = P087X2_n606MaqDsc[0] ;
                  A834TipDefDsc = P087X2_A834TipDefDsc[0] ;
                  n834TipDefDsc = P087X2_n834TipDefDsc[0] ;
                  AV16KilosMaquina = DecimalUtil.doubleToDec(0) ;
                  AV17MetrosMaquina = DecimalUtil.doubleToDec(0) ;
                  while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P087X2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P087X2_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(P087X2_A602MaqCod[0], A602MaqCod) == 0 ) )
                  {
                     brk87X2 = false ;
                     A834TipDefDsc = P087X2_A834TipDefDsc[0] ;
                     n834TipDefDsc = P087X2_n834TipDefDsc[0] ;
                     A833TipDefCod = P087X2_A833TipDefCod[0] ;
                     A606MaqDsc = P087X2_A606MaqDsc[0] ;
                     n606MaqDsc = P087X2_n606MaqDsc[0] ;
                     A540HisBarKgm = P087X2_A540HisBarKgm[0] ;
                     n540HisBarKgm = P087X2_n540HisBarKgm[0] ;
                     A539HisBarCod = P087X2_A539HisBarCod[0] ;
                     A545HisCodReo = P087X2_A545HisCodReo[0] ;
                     A544HisCodPar = P087X2_A544HisCodPar[0] ;
                     A606MaqDsc = P087X2_A606MaqDsc[0] ;
                     n606MaqDsc = P087X2_n606MaqDsc[0] ;
                     A834TipDefDsc = P087X2_A834TipDefDsc[0] ;
                     n834TipDefDsc = P087X2_n834TipDefDsc[0] ;
                     h87X0( false, 16) ;
                     getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A606MaqDsc, "")), 342, Gx_line+0, 426, Gx_line+15, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A602MaqCod, "")), 258, Gx_line+0, 328, Gx_line+15, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+16) ;
                     /* Noskip command */
                     Gx_line = Gx_OldLine ;
                     while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P087X2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P087X2_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(P087X2_A602MaqCod[0], A602MaqCod) == 0 ) && ( P087X2_A833TipDefCod[0] == A833TipDefCod ) )
                     {
                        brk87X2 = false ;
                        A834TipDefDsc = P087X2_A834TipDefDsc[0] ;
                        n834TipDefDsc = P087X2_n834TipDefDsc[0] ;
                        A540HisBarKgm = P087X2_A540HisBarKgm[0] ;
                        n540HisBarKgm = P087X2_n540HisBarKgm[0] ;
                        A539HisBarCod = P087X2_A539HisBarCod[0] ;
                        A545HisCodReo = P087X2_A545HisCodReo[0] ;
                        A544HisCodPar = P087X2_A544HisCodPar[0] ;
                        A834TipDefDsc = P087X2_A834TipDefDsc[0] ;
                        n834TipDefDsc = P087X2_n834TipDefDsc[0] ;
                        AV20KilosDefecto = DecimalUtil.doubleToDec(0) ;
                        while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P087X2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P087X2_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(P087X2_A602MaqCod[0], A602MaqCod) == 0 ) && ( P087X2_A833TipDefCod[0] == A833TipDefCod ) )
                        {
                           brk87X2 = false ;
                           A540HisBarKgm = P087X2_A540HisBarKgm[0] ;
                           n540HisBarKgm = P087X2_n540HisBarKgm[0] ;
                           A539HisBarCod = P087X2_A539HisBarCod[0] ;
                           A545HisCodReo = P087X2_A545HisCodReo[0] ;
                           A544HisCodPar = P087X2_A544HisCodPar[0] ;
                           AV20KilosDefecto = AV20KilosDefecto.add(A540HisBarKgm) ;
                           brk87X2 = true ;
                           pr_default.readNext(0);
                        }
                        h87X0( false, 17) ;
                        getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A833TipDefCod), "ZZZ9")), 442, Gx_line+0, 468, Gx_line+15, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A834TipDefDsc, "")), 483, Gx_line+0, 640, Gx_line+15, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV20KilosDefecto, "ZZZZZ9.99")), 658, Gx_line+0, 715, Gx_line+15, 2+256, 0, 0, 0) ;
                        Gx_OldLine = Gx_line ;
                        Gx_line = (int)(Gx_line+17) ;
                        AV16KilosMaquina = AV16KilosMaquina.add(AV20KilosDefecto) ;
                        AV20KilosDefecto = DecimalUtil.doubleToDec(0) ;
                        if ( ! brk87X2 )
                        {
                           brk87X2 = true ;
                           pr_default.readNext(0);
                        }
                     }
                     if ( ! brk87X2 )
                     {
                        brk87X2 = true ;
                        pr_default.readNext(0);
                     }
                  }
                  AV14KilosCliente = AV14KilosCliente.add(AV16KilosMaquina) ;
                  AV15MetrosCliente = AV15MetrosCliente.add(AV17MetrosMaquina) ;
                  AV16KilosMaquina = DecimalUtil.doubleToDec(0) ;
                  AV17MetrosMaquina = DecimalUtil.doubleToDec(0) ;
                  if ( ! brk87X2 )
                  {
                     brk87X2 = true ;
                     pr_default.readNext(0);
                  }
               }
               if ( ! brk87X2 )
               {
                  brk87X2 = true ;
                  pr_default.readNext(0);
               }
            }
            AV14KilosCliente = DecimalUtil.doubleToDec(0) ;
            AV15MetrosCliente = DecimalUtil.doubleToDec(0) ;
            if ( ! brk87X2 )
            {
               brk87X2 = true ;
               pr_default.readNext(0);
            }
         }
         pr_default.close(0);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h87X0( true, 0) ;
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

   public void h87X0( boolean bFoot ,
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
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Microsoft Sans Serif", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
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
      AV12Emprcod = "" ;
      AV10FechaFin = GXutil.nullDate() ;
      AV11FechaIni = GXutil.nullDate() ;
      AV14KilosCliente = DecimalUtil.ZERO ;
      AV15MetrosCliente = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P087X2_A834TipDefDsc = new String[] {""} ;
      P087X2_n834TipDefDsc = new boolean[] {false} ;
      P087X2_A833TipDefCod = new short[1] ;
      P087X2_A606MaqDsc = new String[] {""} ;
      P087X2_n606MaqDsc = new boolean[] {false} ;
      P087X2_A602MaqCod = new String[] {""} ;
      P087X2_n602MaqCod = new boolean[] {false} ;
      P087X2_A252CliCod = new int[1] ;
      P087X2_n252CliCod = new boolean[] {false} ;
      P087X2_A396EmprCod = new String[] {""} ;
      P087X2_A540HisBarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P087X2_n540HisBarKgm = new boolean[] {false} ;
      P087X2_A279CliNom = new String[] {""} ;
      P087X2_A548HisEstReo = new byte[1] ;
      P087X2_n548HisEstReo = new boolean[] {false} ;
      P087X2_A569HisReoFec = new java.util.Date[] {GXutil.nullDate()} ;
      P087X2_n569HisReoFec = new boolean[] {false} ;
      P087X2_A539HisBarCod = new int[1] ;
      P087X2_A545HisCodReo = new byte[1] ;
      P087X2_A544HisCodPar = new String[] {""} ;
      A834TipDefDsc = "" ;
      A606MaqDsc = "" ;
      A602MaqCod = "" ;
      A396EmprCod = "" ;
      A540HisBarKgm = DecimalUtil.ZERO ;
      A279CliNom = "" ;
      A569HisReoFec = GXutil.nullDate() ;
      A544HisCodPar = "" ;
      AV16KilosMaquina = DecimalUtil.ZERO ;
      AV17MetrosMaquina = DecimalUtil.ZERO ;
      AV20KilosDefecto = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.aclientesdefectosmaquinas__default(),
         new Object[] {
             new Object[] {
            P087X2_A834TipDefDsc, P087X2_n834TipDefDsc, P087X2_A833TipDefCod, P087X2_A606MaqDsc, P087X2_n606MaqDsc, P087X2_A602MaqCod, P087X2_n602MaqCod, P087X2_A252CliCod, P087X2_n252CliCod, P087X2_A396EmprCod,
            P087X2_A540HisBarKgm, P087X2_n540HisBarKgm, P087X2_A279CliNom, P087X2_A548HisEstReo, P087X2_n548HisEstReo, P087X2_A569HisReoFec, P087X2_n569HisReoFec, P087X2_A539HisBarCod, P087X2_A545HisCodReo, P087X2_A544HisCodPar
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte AV13HisEstReo ;
   private byte A548HisEstReo ;
   private byte A545HisCodReo ;
   private short gxcookieaux ;
   private short A833TipDefCod ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int AV9ClicodIni ;
   private int Gx_OldLine ;
   private int A252CliCod ;
   private int A539HisBarCod ;
   private java.math.BigDecimal AV14KilosCliente ;
   private java.math.BigDecimal AV15MetrosCliente ;
   private java.math.BigDecimal A540HisBarKgm ;
   private java.math.BigDecimal AV16KilosMaquina ;
   private java.math.BigDecimal AV17MetrosMaquina ;
   private java.math.BigDecimal AV20KilosDefecto ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV12Emprcod ;
   private String scmdbuf ;
   private String A834TipDefDsc ;
   private String A606MaqDsc ;
   private String A602MaqCod ;
   private String A396EmprCod ;
   private String A279CliNom ;
   private String A544HisCodPar ;
   private java.util.Date AV10FechaFin ;
   private java.util.Date AV11FechaIni ;
   private java.util.Date A569HisReoFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean brk87X2 ;
   private boolean n834TipDefDsc ;
   private boolean n606MaqDsc ;
   private boolean n602MaqCod ;
   private boolean n252CliCod ;
   private boolean n540HisBarKgm ;
   private boolean n548HisEstReo ;
   private boolean n569HisReoFec ;
   private IDataStoreProvider pr_default ;
   private String[] P087X2_A834TipDefDsc ;
   private boolean[] P087X2_n834TipDefDsc ;
   private short[] P087X2_A833TipDefCod ;
   private String[] P087X2_A606MaqDsc ;
   private boolean[] P087X2_n606MaqDsc ;
   private String[] P087X2_A602MaqCod ;
   private boolean[] P087X2_n602MaqCod ;
   private int[] P087X2_A252CliCod ;
   private boolean[] P087X2_n252CliCod ;
   private String[] P087X2_A396EmprCod ;
   private java.math.BigDecimal[] P087X2_A540HisBarKgm ;
   private boolean[] P087X2_n540HisBarKgm ;
   private String[] P087X2_A279CliNom ;
   private byte[] P087X2_A548HisEstReo ;
   private boolean[] P087X2_n548HisEstReo ;
   private java.util.Date[] P087X2_A569HisReoFec ;
   private boolean[] P087X2_n569HisReoFec ;
   private int[] P087X2_A539HisBarCod ;
   private byte[] P087X2_A545HisCodReo ;
   private String[] P087X2_A544HisCodPar ;
}

final  class aclientesdefectosmaquinas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P087X2", "SELECT T4.TipDefDsc, T1.TipDefCod, T3.MaqDsc, T1.MaqCod, T1.CliCod, T1.EmprCod, T1.HisBarKgm, T2.CliNom, T1.HisEstReo, T1.HisReoFec, T1.HisBarCod, T1.HisCodReo, T1.HisCodPar FROM (((TXPHISREO T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN TXPMAQUIN T3 ON T3.EmprCod = T1.EmprCod AND T3.MaqCod = T1.MaqCod) INNER JOIN TXPTIPDEF T4 ON T4.EmprCod = T1.EmprCod AND T4.TipDefCod = T1.TipDefCod) WHERE (T1.EmprCod = ?) AND (T1.HisReoFec >= ?) AND (T1.HisReoFec <= ?) AND (T1.CliCod = ? or (? = 0)) AND (T1.HisEstReo = ?) ORDER BY T1.EmprCod, T1.CliCod, T1.MaqCod, T1.TipDefCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 3);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 30);
               ((byte[]) buf[13])[0] = rslt.getByte(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(11);
               ((byte[]) buf[18])[0] = rslt.getByte(12);
               ((String[]) buf[19])[0] = rslt.getString(13, 1);
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
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
      }
   }

}

