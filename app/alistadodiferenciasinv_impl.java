package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class alistadodiferenciasinv_impl extends GXWebReport
{
   public alistadodiferenciasinv_impl( com.genexus.internet.HttpContext context )
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
            AV22ImpCod = httpContext.GetPar( "ImpCod") ;
            AV65UFecha = localUtil.parseDateParm( httpContext.GetPar( "UFecha")) ;
            AV59Prdnum1 = httpContext.GetPar( "Prdnum1") ;
            AV60Prdnum2 = httpContext.GetPar( "Prdnum2") ;
            AV8desvios = httpContext.GetPar( "desvios") ;
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
         Gx_out = "FIL" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 1, 256, 16834, 11909, 0, 1, 1, 0, 1, 1) )
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
         AV19FlagDifN = (byte)(0) ;
         GXv_int1[0] = AV19FlagDifN ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "DIFNEG", ""), GXv_int1) ;
         alistadodiferenciasinv_impl.this.AV19FlagDifN = GXv_int1[0] ;
         AV20FlagPreMed = (byte)(0) ;
         GXv_int1[0] = AV20FlagPreMed ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PREMED", ""), GXv_int1) ;
         alistadodiferenciasinv_impl.this.AV20FlagPreMed = GXv_int1[0] ;
         /* Using cursor P09IT2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P09IT2_A407EmprNom[0] ;
            n407EmprNom = P09IT2_n407EmprNom[0] ;
            AV55NomEmp = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         /* Using cursor P09IT3 */
         pr_default.execute(1, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A810RecFec = P09IT3_A810RecFec[0] ;
            A719PrdNum = P09IT3_A719PrdNum[0] ;
            if ( GXutil.resetTime(A810RecFec).before( GXutil.resetTime( AV65UFecha )) )
            {
               AV56PFecha = A810RecFec ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         AV67ValAlmCol = DecimalUtil.ZERO ;
         AV68ValAlmTot = DecimalUtil.ZERO ;
         AV70ValCCCol = DecimalUtil.ZERO ;
         AV71ValCCTot = DecimalUtil.ZERO ;
         pr_default.dynParam(2, new Object[]{ new Object[]{
                                              AV59Prdnum1 ,
                                              AV60Prdnum2 ,
                                              A719PrdNum ,
                                              A396EmprCod ,
                                              AV65UFecha ,
                                              A810RecFec } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE
                                              }
         });
         /* Using cursor P09IT4 */
         pr_default.execute(2, new Object[] {A396EmprCod, AV65UFecha, AV59Prdnum1, AV60Prdnum2});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A719PrdNum = P09IT4_A719PrdNum[0] ;
            A810RecFec = P09IT4_A810RecFec[0] ;
            A807RecExiRea = P09IT4_A807RecExiRea[0] ;
            A809RecExiTeo = P09IT4_A809RecExiTeo[0] ;
            A724PrdPreAct = P09IT4_A724PrdPreAct[0] ;
            A726PrdPreMed = P09IT4_A726PrdPreMed[0] ;
            A3915EmpNumDec = P09IT4_A3915EmpNumDec[0] ;
            n3915EmpNumDec = P09IT4_n3915EmpNumDec[0] ;
            A718PrdNom = P09IT4_A718PrdNom[0] ;
            A3915EmpNumDec = P09IT4_A3915EmpNumDec[0] ;
            n3915EmpNumDec = P09IT4_n3915EmpNumDec[0] ;
            A724PrdPreAct = P09IT4_A724PrdPreAct[0] ;
            A726PrdPreMed = P09IT4_A726PrdPreMed[0] ;
            A718PrdNom = P09IT4_A718PrdNom[0] ;
            AV9DifAlm = A809RecExiTeo.subtract(A807RecExiRea) ;
            if ( ( AV9DifAlm.doubleValue() < 0 ) && (0==AV19FlagDifN) )
            {
               AV10DifAlm2 = AV9DifAlm.negate() ;
            }
            else
            {
               AV10DifAlm2 = AV9DifAlm ;
            }
            if ( A809RecExiTeo.doubleValue() != 0 )
            {
               AV11DifAlmPor = AV10DifAlm2.multiply(DecimalUtil.doubleToDec(100)).divide(A809RecExiTeo, 18, java.math.RoundingMode.DOWN) ;
            }
            else
            {
               AV11DifAlmPor = DecimalUtil.doubleToDec(0) ;
            }
            AV61PreProd = A724PrdPreAct ;
            if ( AV20FlagPreMed == 1 )
            {
               AV61PreProd = A726PrdPreMed ;
            }
            if ( A3915EmpNumDec == 0 )
            {
               AV66ValAlm = GXutil.roundDecimal( AV10DifAlm2.multiply(AV61PreProd), 1) ;
            }
            else
            {
               if ( A3915EmpNumDec == 2 )
               {
                  AV66ValAlm = GXutil.roundDecimal( AV10DifAlm2.multiply(AV61PreProd), 0) ;
               }
            }
            if ( ( GXutil.strcmp(AV63TipCol, GXutil.substring( A719PrdNum, 1, 1)) != 0 ) && ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "8") == 0 ) && ! (GXutil.strcmp("", AV63TipCol)==0) )
            {
               /* Execute user subroutine: 'TOTAL' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(2);
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
            AV67ValAlmCol = AV67ValAlmCol.add(AV66ValAlm) ;
            AV68ValAlmTot = AV68ValAlmTot.add(AV66ValAlm) ;
            if ( ( A807RecExiRea.doubleValue() != 0 ) && ( A809RecExiTeo.doubleValue() != 0 ) )
            {
               AV58PrdNum = A719PrdNum ;
               /* Execute user subroutine: 'ENTALM' */
               S121 ();
               if ( returnInSub )
               {
                  pr_default.close(2);
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
               AV57PorComp = (short)(0) ;
               if ( AV15EntUnient.doubleValue() > 0 )
               {
                  AV57PorComp = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( (AV9DifAlm.divide(AV15EntUnient, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)), 2))) ;
               }
               if ( ( ( AV9DifAlm.doubleValue() != 0 ) && ( GXutil.strcmp(AV8desvios, httpContext.getMessage( "S", "")) == 0 ) ) || ( ( GXutil.strcmp(AV8desvios, httpContext.getMessage( "N", "")) == 0 ) ) )
               {
                  h9IT0( false, 27) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV57PorComp), "ZZZ9")), 760, Gx_line+0, 786, Gx_line+15, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV15EntUnient, "ZZZZZ9.99")), 687, Gx_line+0, 744, Gx_line+15, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV66ValAlm, "ZZZZZZZZ9.99")), 593, Gx_line+0, 669, Gx_line+15, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV11DifAlmPor, "ZZZ9.99")), 540, Gx_line+0, 585, Gx_line+15, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV9DifAlm, "ZZZZZZ9.9999")), 447, Gx_line+0, 523, Gx_line+15, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A807RecExiRea, "ZZZZZZ9.9999")), 353, Gx_line+0, 429, Gx_line+15, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A809RecExiTeo, "ZZZZZZ9.9999")), 260, Gx_line+0, 336, Gx_line+15, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 67, Gx_line+0, 203, Gx_line+15, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 13, Gx_line+0, 83, Gx_line+15, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+27) ;
               }
            }
            AV63TipCol = GXutil.substring( A719PrdNum, 1, 1) ;
            pr_default.readNext(2);
         }
         pr_default.close(2);
         /* Execute user subroutine: 'TOTAL' */
         S111 ();
         if ( returnInSub )
         {
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( AV68ValAlmTot.doubleValue() != 0 )
         {
            h9IT0( false, 36) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Total", ""), 540, Gx_line+13, 587, Gx_line+27, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(587, Gx_line+13, 682, Gx_line+13, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV68ValAlmTot, "ZZZZZZZZZZ.ZZ")), 587, Gx_line+13, 669, Gx_line+28, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+36) ;
         }
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h9IT0( true, 0) ;
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
      /* 'TOTAL' Routine */
      returnInSub = false ;
      if ( AV67ValAlmCol.doubleValue() != 0 )
      {
         h9IT0( false, 54) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Colorantes", ""), 473, Gx_line+27, 573, Gx_line+41, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Total", ""), 420, Gx_line+27, 466, Gx_line+41, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(580, Gx_line+13, 675, Gx_line+13, 1, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV67ValAlmCol, "ZZZZZZZZZZ.ZZ")), 580, Gx_line+27, 676, Gx_line+42, 2, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+54) ;
      }
      AV67ValAlmCol = DecimalUtil.ZERO ;
      AV70ValCCCol = DecimalUtil.ZERO ;
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'ENTALM' Routine */
      returnInSub = false ;
      GXv_decimal2[0] = AV15EntUnient ;
      new app.pcalexi(remoteHandle, context).execute( A396EmprCod, AV58PrdNum, AV16FecIni, AV56PFecha, AV65UFecha, GXv_decimal2) ;
      alistadodiferenciasinv_impl.this.AV15EntUnient = GXv_decimal2[0] ;
   }

   public void h9IT0( boolean bFoot ,
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
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Valor", ""), 633, Gx_line+107, 659, Gx_line+121, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Desv.", ""), 513, Gx_line+107, 543, Gx_line+121, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Diferen", ""), 447, Gx_line+107, 483, Gx_line+121, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "A L M A C E N ", ""), 353, Gx_line+93, 473, Gx_line+107, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "St.Real", ""), 380, Gx_line+107, 417, Gx_line+121, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "St.Teorica", ""), 280, Gx_line+107, 332, Gx_line+121, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Pagina", ""), 633, Gx_line+40, 692, Gx_line+56, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "LISTADO DE DIFERENCIAS DE RECUENTO", ""), 20, Gx_line+67, 400, Gx_line+84, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Hora", ""), 640, Gx_line+13, 665, Gx_line+27, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 460, Gx_line+13, 507, Gx_line+27, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(760, Gx_line+133, 789, Gx_line+133, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("%", 767, Gx_line+107, 775, Gx_line+124, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(687, Gx_line+133, 753, Gx_line+133, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Compras", ""), 700, Gx_line+107, 752, Gx_line+124, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( AV56PFecha, "99/99/99"), 480, Gx_line+67, 529, Gx_line+82, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV76Pgmname, "")), 567, Gx_line+67, 724, Gx_line+82, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(153, Gx_line+107, 310, Gx_line+107, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(613, Gx_line+107, 761, Gx_line+107, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(540, Gx_line+133, 591, Gx_line+133, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(593, Gx_line+133, 681, Gx_line+133, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(447, Gx_line+133, 535, Gx_line+133, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(353, Gx_line+133, 441, Gx_line+133, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(260, Gx_line+133, 348, Gx_line+133, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(13, Gx_line+133, 257, Gx_line+133, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(7, Gx_line+94, 802, Gx_line+94, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(7, Gx_line+1, 802, Gx_line+1, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( AV65UFecha, "99/99/99"), 407, Gx_line+67, 456, Gx_line+82, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A10146Codigo, "")), 13, Gx_line+107, 80, Gx_line+125, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("%", 553, Gx_line+107, 561, Gx_line+124, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 707, Gx_line+40, 746, Gx_line+55, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(":", 693, Gx_line+40, 697, Gx_line+54, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 687, Gx_line+13, 780, Gx_line+28, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 527, Gx_line+13, 576, Gx_line+28, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55NomEmp, "")), 13, Gx_line+13, 233, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(":", 673, Gx_line+13, 677, Gx_line+27, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(":", 513, Gx_line+13, 517, Gx_line+27, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+148) ;
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
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Microsoft Sans Serif", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Courier New", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics2( )
   {
      getPrinter().setMetrics("Courier New", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
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
      AV22ImpCod = "" ;
      AV65UFecha = GXutil.nullDate() ;
      AV59Prdnum1 = "" ;
      AV60Prdnum2 = "" ;
      AV8desvios = "" ;
      GXv_int1 = new byte[1] ;
      scmdbuf = "" ;
      P09IT2_A396EmprCod = new String[] {""} ;
      P09IT2_A407EmprNom = new String[] {""} ;
      P09IT2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV55NomEmp = "" ;
      P09IT3_A396EmprCod = new String[] {""} ;
      P09IT3_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09IT3_A719PrdNum = new String[] {""} ;
      A810RecFec = GXutil.nullDate() ;
      A719PrdNum = "" ;
      AV56PFecha = GXutil.nullDate() ;
      AV67ValAlmCol = DecimalUtil.ZERO ;
      AV68ValAlmTot = DecimalUtil.ZERO ;
      AV70ValCCCol = DecimalUtil.ZERO ;
      AV71ValCCTot = DecimalUtil.ZERO ;
      P09IT4_A396EmprCod = new String[] {""} ;
      P09IT4_A719PrdNum = new String[] {""} ;
      P09IT4_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09IT4_A807RecExiRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09IT4_A809RecExiTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09IT4_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09IT4_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09IT4_A3915EmpNumDec = new byte[1] ;
      P09IT4_n3915EmpNumDec = new boolean[] {false} ;
      P09IT4_A718PrdNom = new String[] {""} ;
      A807RecExiRea = DecimalUtil.ZERO ;
      A809RecExiTeo = DecimalUtil.ZERO ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A726PrdPreMed = DecimalUtil.ZERO ;
      A718PrdNom = "" ;
      AV9DifAlm = DecimalUtil.ZERO ;
      AV10DifAlm2 = DecimalUtil.ZERO ;
      AV11DifAlmPor = DecimalUtil.ZERO ;
      AV61PreProd = DecimalUtil.ZERO ;
      AV66ValAlm = DecimalUtil.ZERO ;
      AV63TipCol = "" ;
      AV58PrdNum = "" ;
      AV15EntUnient = DecimalUtil.ZERO ;
      AV16FecIni = GXutil.nullDate() ;
      GXv_decimal2 = new java.math.BigDecimal[1] ;
      AV76Pgmname = "" ;
      A10146Codigo = "" ;
      Gx_time = "" ;
      Gx_date = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.alistadodiferenciasinv__default(),
         new Object[] {
             new Object[] {
            P09IT2_A396EmprCod, P09IT2_A407EmprNom, P09IT2_n407EmprNom
            }
            , new Object[] {
            P09IT3_A396EmprCod, P09IT3_A810RecFec, P09IT3_A719PrdNum
            }
            , new Object[] {
            P09IT4_A396EmprCod, P09IT4_A719PrdNum, P09IT4_A810RecFec, P09IT4_A807RecExiRea, P09IT4_A809RecExiTeo, P09IT4_A724PrdPreAct, P09IT4_A726PrdPreMed, P09IT4_A3915EmpNumDec, P09IT4_n3915EmpNumDec, P09IT4_A718PrdNom
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      Gx_time = GXutil.time( ) ;
      AV76Pgmname = "AListadoDiferenciasInv" ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      Gx_time = GXutil.time( ) ;
      AV76Pgmname = "AListadoDiferenciasInv" ;
      Gx_err = (short)(0) ;
   }

   private byte AV19FlagDifN ;
   private byte AV20FlagPreMed ;
   private byte GXv_int1[] ;
   private byte A3915EmpNumDec ;
   private short gxcookieaux ;
   private short AV57PorComp ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private java.math.BigDecimal AV67ValAlmCol ;
   private java.math.BigDecimal AV68ValAlmTot ;
   private java.math.BigDecimal AV70ValCCCol ;
   private java.math.BigDecimal AV71ValCCTot ;
   private java.math.BigDecimal A807RecExiRea ;
   private java.math.BigDecimal A809RecExiTeo ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A726PrdPreMed ;
   private java.math.BigDecimal AV9DifAlm ;
   private java.math.BigDecimal AV10DifAlm2 ;
   private java.math.BigDecimal AV11DifAlmPor ;
   private java.math.BigDecimal AV61PreProd ;
   private java.math.BigDecimal AV66ValAlm ;
   private java.math.BigDecimal AV15EntUnient ;
   private java.math.BigDecimal GXv_decimal2[] ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV22ImpCod ;
   private String AV59Prdnum1 ;
   private String AV60Prdnum2 ;
   private String AV8desvios ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV55NomEmp ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String AV63TipCol ;
   private String AV58PrdNum ;
   private String AV76Pgmname ;
   private String A10146Codigo ;
   private String Gx_time ;
   private java.util.Date AV65UFecha ;
   private java.util.Date A810RecFec ;
   private java.util.Date AV56PFecha ;
   private java.util.Date AV16FecIni ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean n3915EmpNumDec ;
   private boolean returnInSub ;
   private IDataStoreProvider pr_default ;
   private String[] P09IT2_A396EmprCod ;
   private String[] P09IT2_A407EmprNom ;
   private boolean[] P09IT2_n407EmprNom ;
   private String[] P09IT3_A396EmprCod ;
   private java.util.Date[] P09IT3_A810RecFec ;
   private String[] P09IT3_A719PrdNum ;
   private String[] P09IT4_A396EmprCod ;
   private String[] P09IT4_A719PrdNum ;
   private java.util.Date[] P09IT4_A810RecFec ;
   private java.math.BigDecimal[] P09IT4_A807RecExiRea ;
   private java.math.BigDecimal[] P09IT4_A809RecExiTeo ;
   private java.math.BigDecimal[] P09IT4_A724PrdPreAct ;
   private java.math.BigDecimal[] P09IT4_A726PrdPreMed ;
   private byte[] P09IT4_A3915EmpNumDec ;
   private boolean[] P09IT4_n3915EmpNumDec ;
   private String[] P09IT4_A718PrdNom ;
}

final  class alistadodiferenciasinv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09IT4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV59Prdnum1 ,
                                          String AV60Prdnum2 ,
                                          String A719PrdNum ,
                                          String A396EmprCod ,
                                          java.util.Date AV65UFecha ,
                                          java.util.Date A810RecFec )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int3 = new byte[4];
      Object[] GXv_Object4 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.PrdNum, T1.RecFec, T1.RecExiRea, T1.RecExiTeo, T3.PrdPreAct, T3.PrdPreMed, T2.EmpNumDec, T3.PrdNom FROM ((TXPRECUEN T1 INNER JOIN TXPEMPRES" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN TXPPRODUC T3 ON T3.EmprCod = T1.EmprCod AND T3.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.RecFec = ?)");
      if ( ! (GXutil.strcmp("", AV59Prdnum1)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum >= ?)");
      }
      else
      {
         GXv_int3[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Prdnum2)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum <= ?)");
      }
      else
      {
         GXv_int3[3] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.RecFec, T1.PrdNum" ;
      GXv_Object4[0] = scmdbuf ;
      GXv_Object4[1] = GXv_int3 ;
      return GXv_Object4 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.IHttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 2 :
                  return conditional_P09IT4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09IT2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09IT3", "SELECT EmprCod, RecFec, PrdNum FROM TXPRECUEN WHERE EmprCod = ? ORDER BY EmprCod, RecFec DESC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09IT4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 26);
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
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[4], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[5]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[6], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 6);
               }
               return;
      }
   }

}

