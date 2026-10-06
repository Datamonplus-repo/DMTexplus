package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rpr0027dt_impl extends GXWebReport
{
   public rpr0027dt_impl( com.genexus.internet.HttpContext context )
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
            AV15Pmaq = httpContext.GetPar( "Pmaq") ;
            AV16Umaq = httpContext.GetPar( "Umaq") ;
            AV17Pfec = localUtil.parseDateParm( httpContext.GetPar( "Pfec")) ;
            AV18Ufec = localUtil.parseDateParm( httpContext.GetPar( "Ufec")) ;
            AV19Pparo = (short)(GXutil.lval( httpContext.GetPar( "Pparo"))) ;
            AV20Uparo = (short)(GXutil.lval( httpContext.GetPar( "Uparo"))) ;
            AV41Hisprodti = localUtil.parseDTimeParm( httpContext.GetPar( "Hisprodti")) ;
            AV42Hisprodtf = localUtil.parseDTimeParm( httpContext.GetPar( "Hisprodtf")) ;
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
         Gx_out = "SCR" ;
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
         GXt_char1 = AV26Lit0 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         rpr0027dt_impl.this.GXt_char1 = GXv_char2[0] ;
         AV26Lit0 = GXt_char1 ;
         GXt_char1 = AV27Lit1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char2) ;
         rpr0027dt_impl.this.GXt_char1 = GXv_char2[0] ;
         AV27Lit1 = GXt_char1 ;
         GXt_char1 = AV28Lit3 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char2) ;
         rpr0027dt_impl.this.GXt_char1 = GXv_char2[0] ;
         AV28Lit3 = GXt_char1 ;
         GXv_int3[0] = AV38FlagTiReal ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TIREAL", ""), GXv_int3) ;
         rpr0027dt_impl.this.AV38FlagTiReal = GXv_int3[0] ;
         /* Using cursor P07SA2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P07SA2_A407EmprNom[0] ;
            n407EmprNom = P07SA2_n407EmprNom[0] ;
            AV24NomEmp = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV36Nvecest = 0 ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              AV41Hisprodti ,
                                              AV42Hisprodtf ,
                                              Short.valueOf(AV19Pparo) ,
                                              Short.valueOf(AV20Uparo) ,
                                              AV15Pmaq ,
                                              AV16Umaq ,
                                              A4441HisProDTF ,
                                              Short.valueOf(A656ParCod) ,
                                              A602MaqCod ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                              TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         /* Using cursor P07SA3 */
         pr_default.execute(1, new Object[] {A396EmprCod, AV41Hisprodti, AV42Hisprodtf, Short.valueOf(AV19Pparo), Short.valueOf(AV20Uparo), AV15Pmaq, AV16Umaq});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A602MaqCod = P07SA3_A602MaqCod[0] ;
            A656ParCod = P07SA3_A656ParCod[0] ;
            n656ParCod = P07SA3_n656ParCod[0] ;
            A4441HisProDTF = P07SA3_A4441HisProDTF[0] ;
            n4441HisProDTF = P07SA3_n4441HisProDTF[0] ;
            A556HisProEst = P07SA3_A556HisProEst[0] ;
            A558HisProFec = P07SA3_A558HisProFec[0] ;
            A561HisProLin = P07SA3_A561HisProLin[0] ;
            if ( ! (0==A556HisProEst) )
            {
               AV36Nvecest = (int)(AV36Nvecest+1) ;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         pr_default.dynParam(2, new Object[]{ new Object[]{
                                              AV41Hisprodti ,
                                              AV42Hisprodtf ,
                                              Short.valueOf(AV19Pparo) ,
                                              Short.valueOf(AV20Uparo) ,
                                              AV15Pmaq ,
                                              AV16Umaq ,
                                              A4441HisProDTF ,
                                              Short.valueOf(A656ParCod) ,
                                              A602MaqCod ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                              TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         /* Using cursor P07SA4 */
         pr_default.execute(2, new Object[] {A396EmprCod, AV41Hisprodti, AV42Hisprodtf, Short.valueOf(AV19Pparo), Short.valueOf(AV20Uparo), AV15Pmaq, AV16Umaq});
         while ( (pr_default.getStatus(2) != 101) )
         {
            brk7SA5 = false ;
            A561HisProLin = P07SA4_A561HisProLin[0] ;
            A556HisProEst = P07SA4_A556HisProEst[0] ;
            A3610HisProLot = P07SA4_A3610HisProLot[0] ;
            A602MaqCod = P07SA4_A602MaqCod[0] ;
            A656ParCod = P07SA4_A656ParCod[0] ;
            n656ParCod = P07SA4_n656ParCod[0] ;
            A558HisProFec = P07SA4_A558HisProFec[0] ;
            A867ParCodNom = P07SA4_A867ParCodNom[0] ;
            n867ParCodNom = P07SA4_n867ParCodNom[0] ;
            A606MaqDsc = P07SA4_A606MaqDsc[0] ;
            n606MaqDsc = P07SA4_n606MaqDsc[0] ;
            A4440HisProDTI = P07SA4_A4440HisProDTI[0] ;
            n4440HisProDTI = P07SA4_n4440HisProDTI[0] ;
            A4441HisProDTF = P07SA4_A4441HisProDTF[0] ;
            n4441HisProDTF = P07SA4_n4441HisProDTF[0] ;
            A563HisProMin = P07SA4_A563HisProMin[0] ;
            A560HisProHin = P07SA4_A560HisProHin[0] ;
            A562HisProMfi = P07SA4_A562HisProMfi[0] ;
            A559HisProHfi = P07SA4_A559HisProHfi[0] ;
            A606MaqDsc = P07SA4_A606MaqDsc[0] ;
            n606MaqDsc = P07SA4_n606MaqDsc[0] ;
            A867ParCodNom = P07SA4_A867ParCodNom[0] ;
            n867ParCodNom = P07SA4_n867ParCodNom[0] ;
            if ( A560HisProHin <= A559HisProHfi )
            {
               A564HisProTre = (short)(((A559HisProHfi*60)+A562HisProMfi)-((A560HisProHin)*60+A563HisProMin)) ;
            }
            else
            {
               A564HisProTre = (short)((((A559HisProHfi+24)*60)+A562HisProMfi)-((A560HisProHin)*60+A563HisProMin)) ;
            }
            if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( A4440HisProDTI ) && ( ( GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI) / (double) ( 60 ) ) <= 9999 ) )
            {
               A5605HisProTr2 = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)), 0))) ;
            }
            else
            {
               A5605HisProTr2 = (short)(0) ;
            }
            while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P07SA4_A602MaqCod[0], A602MaqCod) == 0 ) )
            {
               brk7SA5 = false ;
               A561HisProLin = P07SA4_A561HisProLin[0] ;
               A556HisProEst = P07SA4_A556HisProEst[0] ;
               A3610HisProLot = P07SA4_A3610HisProLot[0] ;
               A656ParCod = P07SA4_A656ParCod[0] ;
               n656ParCod = P07SA4_n656ParCod[0] ;
               A558HisProFec = P07SA4_A558HisProFec[0] ;
               A867ParCodNom = P07SA4_A867ParCodNom[0] ;
               n867ParCodNom = P07SA4_n867ParCodNom[0] ;
               A606MaqDsc = P07SA4_A606MaqDsc[0] ;
               n606MaqDsc = P07SA4_n606MaqDsc[0] ;
               A4440HisProDTI = P07SA4_A4440HisProDTI[0] ;
               n4440HisProDTI = P07SA4_n4440HisProDTI[0] ;
               A4441HisProDTF = P07SA4_A4441HisProDTF[0] ;
               n4441HisProDTF = P07SA4_n4441HisProDTF[0] ;
               A563HisProMin = P07SA4_A563HisProMin[0] ;
               A560HisProHin = P07SA4_A560HisProHin[0] ;
               A562HisProMfi = P07SA4_A562HisProMfi[0] ;
               A559HisProHfi = P07SA4_A559HisProHfi[0] ;
               A606MaqDsc = P07SA4_A606MaqDsc[0] ;
               n606MaqDsc = P07SA4_n606MaqDsc[0] ;
               A867ParCodNom = P07SA4_A867ParCodNom[0] ;
               n867ParCodNom = P07SA4_n867ParCodNom[0] ;
               if ( GXutil.strcmp(P07SA4_A396EmprCod[0], A396EmprCod) == 0 )
               {
                  if ( ! (0==A656ParCod) )
                  {
                     if ( A560HisProHin <= A559HisProHfi )
                     {
                        A564HisProTre = (short)(((A559HisProHfi*60)+A562HisProMfi)-((A560HisProHin)*60+A563HisProMin)) ;
                     }
                     else
                     {
                        A564HisProTre = (short)((((A559HisProHfi+24)*60)+A562HisProMfi)-((A560HisProHin)*60+A563HisProMin)) ;
                     }
                     if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( A4440HisProDTI ) && ( ( GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI) / (double) ( 60 ) ) <= 9999 ) )
                     {
                        A5605HisProTr2 = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)), 0))) ;
                     }
                     else
                     {
                        A5605HisProTr2 = (short)(0) ;
                     }
                     AV33Time1 = DecimalUtil.ZERO ;
                     AV34Nveces1 = 0 ;
                     AV40LastLote = " " ;
                     while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P07SA4_A602MaqCod[0], A602MaqCod) == 0 ) && ( P07SA4_A656ParCod[0] == A656ParCod ) )
                     {
                        brk7SA5 = false ;
                        A561HisProLin = P07SA4_A561HisProLin[0] ;
                        A556HisProEst = P07SA4_A556HisProEst[0] ;
                        A3610HisProLot = P07SA4_A3610HisProLot[0] ;
                        A558HisProFec = P07SA4_A558HisProFec[0] ;
                        A4440HisProDTI = P07SA4_A4440HisProDTI[0] ;
                        n4440HisProDTI = P07SA4_n4440HisProDTI[0] ;
                        A4441HisProDTF = P07SA4_A4441HisProDTF[0] ;
                        n4441HisProDTF = P07SA4_n4441HisProDTF[0] ;
                        A563HisProMin = P07SA4_A563HisProMin[0] ;
                        A560HisProHin = P07SA4_A560HisProHin[0] ;
                        A562HisProMfi = P07SA4_A562HisProMfi[0] ;
                        A559HisProHfi = P07SA4_A559HisProHfi[0] ;
                        if ( GXutil.strcmp(P07SA4_A396EmprCod[0], A396EmprCod) == 0 )
                        {
                           if ( A560HisProHin <= A559HisProHfi )
                           {
                              A564HisProTre = (short)(((A559HisProHfi*60)+A562HisProMfi)-((A560HisProHin)*60+A563HisProMin)) ;
                           }
                           else
                           {
                              A564HisProTre = (short)((((A559HisProHfi+24)*60)+A562HisProMfi)-((A560HisProHin)*60+A563HisProMin)) ;
                           }
                           if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( A4440HisProDTI ) && ( ( GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI) / (double) ( 60 ) ) <= 9999 ) )
                           {
                              A5605HisProTr2 = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)), 0))) ;
                           }
                           else
                           {
                              A5605HisProTr2 = (short)(0) ;
                           }
                           if ( ! (0==A556HisProEst) )
                           {
                              if ( AV38FlagTiReal == 0 )
                              {
                                 AV39HisProTr2 = A564HisProTre ;
                              }
                              else
                              {
                                 AV39HisProTr2 = A5605HisProTr2 ;
                              }
                              if ( GXutil.strcmp(AV40LastLote, A3610HisProLot) != 0 )
                              {
                                 AV34Nveces1 = (int)(AV34Nveces1+1) ;
                                 AV33Time1 = AV33Time1.add(DecimalUtil.doubleToDec(AV39HisProTr2)) ;
                              }
                           }
                           AV40LastLote = A3610HisProLot ;
                        }
                        brk7SA5 = true ;
                        pr_default.readNext(2);
                     }
                     AV32ParDsc = A867ParCodNom ;
                     AV29HorMin = AV33Time1.divide(DecimalUtil.doubleToDec(60), 18, java.math.RoundingMode.DOWN) ;
                     AV35Media = DecimalUtil.ZERO ;
                     if ( ! (0==AV34Nveces1) )
                     {
                        AV35Media = AV33Time1.divide(DecimalUtil.doubleToDec(AV34Nveces1), 18, java.math.RoundingMode.DOWN) ;
                     }
                     AV31HorMM = AV35Media.divide(DecimalUtil.doubleToDec(60), 18, java.math.RoundingMode.DOWN) ;
                     AV37Por = (short)(0) ;
                     if ( AV36Nvecest > 0 )
                     {
                        AV37Por = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec((AV34Nveces1/ (double) (AV36Nvecest))*100), 0))) ;
                     }
                     h7SA0( false, 17) ;
                     getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A602MaqCod, "")), 7, Gx_line+0, 58, Gx_line+18, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A606MaqDsc, "")), 64, Gx_line+0, 198, Gx_line+18, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A656ParCod), "ZZZ9")), 273, Gx_line+0, 307, Gx_line+18, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32ParDsc, "")), 322, Gx_line+0, 490, Gx_line+18, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV29HorMin, "ZZZ9.99")), 518, Gx_line+0, 577, Gx_line+18, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV34Nveces1), "ZZZZZ9")), 618, Gx_line+0, 669, Gx_line+18, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV31HorMM, "ZZZ9.99")), 710, Gx_line+0, 769, Gx_line+18, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV37Por), "ZZ9")), 676, Gx_line+0, 702, Gx_line+18, 2+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+17) ;
                  }
               }
               if ( ! brk7SA5 )
               {
                  brk7SA5 = true ;
                  pr_default.readNext(2);
               }
            }
            if ( ! brk7SA5 )
            {
               brk7SA5 = true ;
               pr_default.readNext(2);
            }
         }
         pr_default.close(2);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h7SA0( true, 0) ;
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

   public void h7SA0( boolean bFoot ,
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
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "LISTADO PAROS II", ""), 7, Gx_line+50, 130, Gx_line+67, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24NomEmp, "")), 7, Gx_line+17, 227, Gx_line+35, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26Lit0, "")), 457, Gx_line+17, 531, Gx_line+35, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 543, Gx_line+17, 611, Gx_line+35, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27Lit1, "")), 633, Gx_line+17, 692, Gx_line+35, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 700, Gx_line+17, 768, Gx_line+35, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28Lit3, "")), 613, Gx_line+50, 702, Gx_line+68, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 710, Gx_line+50, 761, Gx_line+68, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Periodo", ""), 7, Gx_line+83, 60, Gx_line+100, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(7, Gx_line+73, 773, Gx_line+73, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Maquina", ""), 7, Gx_line+120, 65, Gx_line+137, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Paro", ""), 273, Gx_line+120, 305, Gx_line+137, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Tiempo", ""), 520, Gx_line+120, 571, Gx_line+137, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Repet.", ""), 619, Gx_line+120, 663, Gx_line+137, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Media", ""), 723, Gx_line+120, 765, Gx_line+137, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(7, Gx_line+136, 193, Gx_line+136, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(273, Gx_line+136, 490, Gx_line+136, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(518, Gx_line+136, 576, Gx_line+136, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(609, Gx_line+136, 667, Gx_line+136, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(710, Gx_line+136, 768, Gx_line+136, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText("%", 681, Gx_line+120, 692, Gx_line+137, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(676, Gx_line+136, 701, Gx_line+136, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( AV41Hisprodti, "99/99/99 99:99:99"), 70, Gx_line+83, 213, Gx_line+101, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( AV42Hisprodtf, "99/99/99 99:99:99"), 221, Gx_line+83, 364, Gx_line+101, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+143) ;
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
      getPrinter().setMetrics("Courier New", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Arial", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics2( )
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
      AV15Pmaq = "" ;
      AV16Umaq = "" ;
      AV17Pfec = GXutil.nullDate() ;
      AV18Ufec = GXutil.nullDate() ;
      AV41Hisprodti = GXutil.resetTime( GXutil.nullDate() );
      AV42Hisprodtf = GXutil.resetTime( GXutil.nullDate() );
      AV26Lit0 = "" ;
      AV27Lit1 = "" ;
      AV28Lit3 = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_int3 = new byte[1] ;
      scmdbuf = "" ;
      P07SA2_A396EmprCod = new String[] {""} ;
      P07SA2_A407EmprNom = new String[] {""} ;
      P07SA2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV24NomEmp = "" ;
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A602MaqCod = "" ;
      P07SA3_A396EmprCod = new String[] {""} ;
      P07SA3_A602MaqCod = new String[] {""} ;
      P07SA3_A656ParCod = new short[1] ;
      P07SA3_n656ParCod = new boolean[] {false} ;
      P07SA3_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P07SA3_n4441HisProDTF = new boolean[] {false} ;
      P07SA3_A556HisProEst = new byte[1] ;
      P07SA3_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P07SA3_A561HisProLin = new int[1] ;
      A558HisProFec = GXutil.nullDate() ;
      P07SA4_A396EmprCod = new String[] {""} ;
      P07SA4_A561HisProLin = new int[1] ;
      P07SA4_A556HisProEst = new byte[1] ;
      P07SA4_A3610HisProLot = new String[] {""} ;
      P07SA4_A602MaqCod = new String[] {""} ;
      P07SA4_A656ParCod = new short[1] ;
      P07SA4_n656ParCod = new boolean[] {false} ;
      P07SA4_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P07SA4_A867ParCodNom = new String[] {""} ;
      P07SA4_n867ParCodNom = new boolean[] {false} ;
      P07SA4_A606MaqDsc = new String[] {""} ;
      P07SA4_n606MaqDsc = new boolean[] {false} ;
      P07SA4_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P07SA4_n4440HisProDTI = new boolean[] {false} ;
      P07SA4_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P07SA4_n4441HisProDTF = new boolean[] {false} ;
      P07SA4_A563HisProMin = new byte[1] ;
      P07SA4_A560HisProHin = new byte[1] ;
      P07SA4_A562HisProMfi = new byte[1] ;
      P07SA4_A559HisProHfi = new byte[1] ;
      A3610HisProLot = "" ;
      A867ParCodNom = "" ;
      A606MaqDsc = "" ;
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      AV33Time1 = DecimalUtil.ZERO ;
      AV40LastLote = "" ;
      AV32ParDsc = "" ;
      AV29HorMin = DecimalUtil.ZERO ;
      AV35Media = DecimalUtil.ZERO ;
      AV31HorMM = DecimalUtil.ZERO ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rpr0027dt__default(),
         new Object[] {
             new Object[] {
            P07SA2_A396EmprCod, P07SA2_A407EmprNom, P07SA2_n407EmprNom
            }
            , new Object[] {
            P07SA3_A396EmprCod, P07SA3_A602MaqCod, P07SA3_A656ParCod, P07SA3_n656ParCod, P07SA3_A4441HisProDTF, P07SA3_n4441HisProDTF, P07SA3_A556HisProEst, P07SA3_A558HisProFec, P07SA3_A561HisProLin
            }
            , new Object[] {
            P07SA4_A396EmprCod, P07SA4_A561HisProLin, P07SA4_A556HisProEst, P07SA4_A3610HisProLot, P07SA4_A602MaqCod, P07SA4_A656ParCod, P07SA4_n656ParCod, P07SA4_A558HisProFec, P07SA4_A867ParCodNom, P07SA4_n867ParCodNom,
            P07SA4_A606MaqDsc, P07SA4_n606MaqDsc, P07SA4_A4440HisProDTI, P07SA4_n4440HisProDTI, P07SA4_A4441HisProDTF, P07SA4_n4441HisProDTF, P07SA4_A563HisProMin, P07SA4_A560HisProHin, P07SA4_A562HisProMfi, P07SA4_A559HisProHfi
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

   private byte AV38FlagTiReal ;
   private byte GXv_int3[] ;
   private byte A556HisProEst ;
   private byte A563HisProMin ;
   private byte A560HisProHin ;
   private byte A562HisProMfi ;
   private byte A559HisProHfi ;
   private short gxcookieaux ;
   private short AV19Pparo ;
   private short AV20Uparo ;
   private short A656ParCod ;
   private short A564HisProTre ;
   private short A5605HisProTr2 ;
   private short AV39HisProTr2 ;
   private short AV37Por ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int AV36Nvecest ;
   private int A561HisProLin ;
   private int AV34Nveces1 ;
   private int Gx_OldLine ;
   private java.math.BigDecimal AV33Time1 ;
   private java.math.BigDecimal AV29HorMin ;
   private java.math.BigDecimal AV35Media ;
   private java.math.BigDecimal AV31HorMM ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV15Pmaq ;
   private String AV16Umaq ;
   private String AV26Lit0 ;
   private String AV27Lit1 ;
   private String AV28Lit3 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV24NomEmp ;
   private String A602MaqCod ;
   private String A3610HisProLot ;
   private String A867ParCodNom ;
   private String A606MaqDsc ;
   private String AV40LastLote ;
   private String AV32ParDsc ;
   private String Gx_time ;
   private java.util.Date AV41Hisprodti ;
   private java.util.Date AV42Hisprodtf ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date AV17Pfec ;
   private java.util.Date AV18Ufec ;
   private java.util.Date A558HisProFec ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean n656ParCod ;
   private boolean n4441HisProDTF ;
   private boolean brk7SA5 ;
   private boolean n867ParCodNom ;
   private boolean n606MaqDsc ;
   private boolean n4440HisProDTI ;
   private IDataStoreProvider pr_default ;
   private String[] P07SA2_A396EmprCod ;
   private String[] P07SA2_A407EmprNom ;
   private boolean[] P07SA2_n407EmprNom ;
   private String[] P07SA3_A396EmprCod ;
   private String[] P07SA3_A602MaqCod ;
   private short[] P07SA3_A656ParCod ;
   private boolean[] P07SA3_n656ParCod ;
   private java.util.Date[] P07SA3_A4441HisProDTF ;
   private boolean[] P07SA3_n4441HisProDTF ;
   private byte[] P07SA3_A556HisProEst ;
   private java.util.Date[] P07SA3_A558HisProFec ;
   private int[] P07SA3_A561HisProLin ;
   private String[] P07SA4_A396EmprCod ;
   private int[] P07SA4_A561HisProLin ;
   private byte[] P07SA4_A556HisProEst ;
   private String[] P07SA4_A3610HisProLot ;
   private String[] P07SA4_A602MaqCod ;
   private short[] P07SA4_A656ParCod ;
   private boolean[] P07SA4_n656ParCod ;
   private java.util.Date[] P07SA4_A558HisProFec ;
   private String[] P07SA4_A867ParCodNom ;
   private boolean[] P07SA4_n867ParCodNom ;
   private String[] P07SA4_A606MaqDsc ;
   private boolean[] P07SA4_n606MaqDsc ;
   private java.util.Date[] P07SA4_A4440HisProDTI ;
   private boolean[] P07SA4_n4440HisProDTI ;
   private java.util.Date[] P07SA4_A4441HisProDTF ;
   private boolean[] P07SA4_n4441HisProDTF ;
   private byte[] P07SA4_A563HisProMin ;
   private byte[] P07SA4_A560HisProHin ;
   private byte[] P07SA4_A562HisProMfi ;
   private byte[] P07SA4_A559HisProHfi ;
}

final  class rpr0027dt__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P07SA3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV41Hisprodti ,
                                          java.util.Date AV42Hisprodtf ,
                                          short AV19Pparo ,
                                          short AV20Uparo ,
                                          String AV15Pmaq ,
                                          String AV16Umaq ,
                                          java.util.Date A4441HisProDTF ,
                                          short A656ParCod ,
                                          String A602MaqCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[7];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT EmprCod, MaqCod, ParCod, HisProDTF, HisProEst, HisProFec, HisProLin FROM TXPLHIPRO" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(Not (ParCod = 0))");
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV41Hisprodti) )
      {
         addWhere(sWhereString, "(HisProDTF >= ?)");
      }
      else
      {
         GXv_int4[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV42Hisprodtf) )
      {
         addWhere(sWhereString, "(HisProDTF <= ?)");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( ! (0==AV19Pparo) )
      {
         addWhere(sWhereString, "(ParCod >= ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( ! (0==AV20Uparo) )
      {
         addWhere(sWhereString, "(ParCod <= ?)");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV15Pmaq)==0) )
      {
         addWhere(sWhereString, "(MaqCod >= ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV16Umaq)==0) )
      {
         addWhere(sWhereString, "(MaqCod <= ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, MaqCod" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P07SA4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV41Hisprodti ,
                                          java.util.Date AV42Hisprodtf ,
                                          short AV19Pparo ,
                                          short AV20Uparo ,
                                          String AV15Pmaq ,
                                          String AV16Umaq ,
                                          java.util.Date A4441HisProDTF ,
                                          short A656ParCod ,
                                          String A602MaqCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[7];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.HisProLin, T1.HisProEst, T1.HisProLot, T1.MaqCod, T1.ParCod, T1.HisProFec, T3.ParCodNom, T2.MaqDsc, T1.HisProDTI, T1.HisProDTF, T1.HisProMin," ;
      scmdbuf += " T1.HisProHin, T1.HisProMfi, T1.HisProHfi FROM ((TXPLHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod) LEFT JOIN TXPCODPAR T3" ;
      scmdbuf += " ON T3.EmprCod = T1.EmprCod AND T3.ParCod = T1.ParCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(Not (T1.ParCod = 0))");
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV41Hisprodti) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int6[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV42Hisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF <= ?)");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
      }
      if ( ! (0==AV19Pparo) )
      {
         addWhere(sWhereString, "(T1.ParCod >= ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( ! (0==AV20Uparo) )
      {
         addWhere(sWhereString, "(T1.ParCod <= ?)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV15Pmaq)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod >= ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV16Umaq)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod <= ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.MaqCod, T1.ParCod, T1.HisProLot" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
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
                  return conditional_P07SA3(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.util.Date)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , (String)dynConstraints[8] , (String)dynConstraints[9] );
            case 2 :
                  return conditional_P07SA4(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.util.Date)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , (String)dynConstraints[8] , (String)dynConstraints[9] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07SA2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07SA3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07SA4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(6);
               ((int[]) buf[8])[0] = rslt.getInt(7);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 16);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDateTime(11);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((byte[]) buf[16])[0] = rslt.getByte(12);
               ((byte[]) buf[17])[0] = rslt.getByte(13);
               ((byte[]) buf[18])[0] = rslt.getByte(14);
               ((byte[]) buf[19])[0] = rslt.getByte(15);
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
                  stmt.setString(sIdx, (String)parms[7], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[8], false);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[9], false);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[10]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[11]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 6);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[8], false);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[9], false);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[10]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[11]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 6);
               }
               return;
      }
   }

}

