package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rmod005_impl extends GXWebReport
{
   public rmod005_impl( com.genexus.internet.HttpContext context )
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
            AV9PCliCod = (int)(GXutil.lval( httpContext.GetPar( "PCliCod"))) ;
            AV10UCliCod = (int)(GXutil.lval( httpContext.GetPar( "UCliCod"))) ;
            AV11PSerie = httpContext.GetPar( "PSerie") ;
            AV12Userie = httpContext.GetPar( "Userie") ;
            AV15PNumCol = (int)(GXutil.lval( httpContext.GetPar( "PNumCol"))) ;
            AV16UNumCol = (int)(GXutil.lval( httpContext.GetPar( "UNumCol"))) ;
            AV13PColor = httpContext.GetPar( "PColor") ;
            AV14UColor = httpContext.GetPar( "UColor") ;
            AV44Tipcolcodfrom = (byte)(GXutil.lval( httpContext.GetPar( "Tipcolcodfrom"))) ;
            AV45tipcolcodto = (byte)(GXutil.lval( httpContext.GetPar( "tipcolcodto"))) ;
            Gx_out = httpContext.GetPar( "Gx_out") ;
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
         super.Gx_out = this.Gx_out ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
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
         GXv_char1[0] = AV38ContDsc ;
         new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MOD005", ""), GXv_char1) ;
         rmod005_impl.this.AV38ContDsc = GXv_char1[0] ;
         /* Using cursor P06QP2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P06QP2_A407EmprNom[0] ;
            n407EmprNom = P06QP2_n407EmprNom[0] ;
            AV17NomEmp = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         GxHdr3 = true ;
         /* Using cursor P06QP3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV9PCliCod), AV11PSerie, AV13PColor, Integer.valueOf(AV15PNumCol), Byte.valueOf(AV44Tipcolcodfrom), AV12Userie, Integer.valueOf(AV16UNumCol), AV14UColor, Byte.valueOf(AV45tipcolcodto), Integer.valueOf(AV10UCliCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A486ForNumCol = P06QP3_A486ForNumCol[0] ;
            A831TipColCod = P06QP3_A831TipColCod[0] ;
            A483ForColNum = P06QP3_A483ForColNum[0] ;
            A482ForColNom = P06QP3_A482ForColNom[0] ;
            A494ForSer = P06QP3_A494ForSer[0] ;
            A252CliCod = P06QP3_A252CliCod[0] ;
            A485ForFec = P06QP3_A485ForFec[0] ;
            n485ForFec = P06QP3_n485ForFec[0] ;
            A3315ForNumArc = P06QP3_A3315ForNumArc[0] ;
            n3315ForNumArc = P06QP3_n3315ForNumArc[0] ;
            A5742ForSerDsc = P06QP3_A5742ForSerDsc[0] ;
            n5742ForSerDsc = P06QP3_n5742ForSerDsc[0] ;
            A995ForTonal = P06QP3_A995ForTonal[0] ;
            n995ForTonal = P06QP3_n995ForTonal[0] ;
            A279CliNom = P06QP3_A279CliNom[0] ;
            A13918ForTra3 = P06QP3_A13918ForTra3[0] ;
            n13918ForTra3 = P06QP3_n13918ForTra3[0] ;
            A13919ForTraP3 = P06QP3_A13919ForTraP3[0] ;
            n13919ForTraP3 = P06QP3_n13919ForTraP3[0] ;
            A13916ForTra2 = P06QP3_A13916ForTra2[0] ;
            n13916ForTra2 = P06QP3_n13916ForTra2[0] ;
            A13917ForTraP2 = P06QP3_A13917ForTraP2[0] ;
            n13917ForTraP2 = P06QP3_n13917ForTraP2[0] ;
            A13914ForTra1 = P06QP3_A13914ForTra1[0] ;
            n13914ForTra1 = P06QP3_n13914ForTra1[0] ;
            A13915ForTraP1 = P06QP3_A13915ForTraP1[0] ;
            n13915ForTraP1 = P06QP3_n13915ForTraP1[0] ;
            A279CliNom = P06QP3_A279CliNom[0] ;
            A13918ForTra3 = P06QP3_A13918ForTra3[0] ;
            n13918ForTra3 = P06QP3_n13918ForTra3[0] ;
            A13919ForTraP3 = P06QP3_A13919ForTraP3[0] ;
            n13919ForTraP3 = P06QP3_n13919ForTraP3[0] ;
            A13916ForTra2 = P06QP3_A13916ForTra2[0] ;
            n13916ForTra2 = P06QP3_n13916ForTra2[0] ;
            A13917ForTraP2 = P06QP3_A13917ForTraP2[0] ;
            n13917ForTraP2 = P06QP3_n13917ForTraP2[0] ;
            A13914ForTra1 = P06QP3_A13914ForTra1[0] ;
            n13914ForTra1 = P06QP3_n13914ForTra1[0] ;
            A13915ForTraP1 = P06QP3_A13915ForTraP1[0] ;
            n13915ForTraP1 = P06QP3_n13915ForTraP1[0] ;
            AV39FechaC = GXutil.str( GXutil.day( A485ForFec), 2, 0) + " " + localUtil.cmonth( A485ForFec, httpContext.getMessage( "por", "")) + " " + GXutil.str( GXutil.year( A485ForFec), 4, 0) ;
            GXt_char2 = AV47Lb_PedCod ;
            GXv_char1[0] = GXt_char2 ;
            new app.formulaciontinte.itemlb_pedcod(remoteHandle, context).execute( A396EmprCod, A3315ForNumArc, GXv_char1) ;
            rmod005_impl.this.GXt_char2 = GXv_char1[0] ;
            AV47Lb_PedCod = GXt_char2 ;
            AV35p_Tinte = (byte)(0) ;
            AV36v_desc = GXutil.space( (short)(26)) ;
            /* Using cursor P06QP4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A764ProForCod = P06QP4_A764ProForCod[0] ;
               A1160ProForL = P06QP4_A1160ProForL[0] ;
               A766ProForDsc = P06QP4_A766ProForDsc[0] ;
               A766ProForDsc = P06QP4_A766ProForDsc[0] ;
               /* Using cursor P06QP5 */
               pr_default.execute(3, new Object[] {A396EmprCod, A764ProForCod});
               while ( (pr_default.getStatus(3) != 101) )
               {
                  A767ProForLin = P06QP5_A767ProForLin[0] ;
                  A770ProForPrd = P06QP5_A770ProForPrd[0] ;
                  if ( ! (GXutil.strcmp("", A770ProForPrd)==0) )
                  {
                     if ( ( GXutil.strcmp(GXutil.substring( A770ProForPrd, 1, 2), "10") >= 0 ) && ( GXutil.strcmp(GXutil.substring( A770ProForPrd, 1, 2), "79") >= 0 ) )
                     {
                        AV35p_Tinte = (byte)(1) ;
                        /* Exit For each command. Update data (if necessary), close cursors & exit. */
                        if (true) break;
                     }
                  }
                  pr_default.readNext(3);
               }
               pr_default.close(3);
               AV36v_desc = A766ProForDsc ;
               if ( AV35p_Tinte == 1 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
               pr_default.readNext(2);
            }
            pr_default.close(2);
            AV31vCompo = GXutil.trim( GXutil.str( A13915ForTraP1, 3, 0)) + "%" + GXutil.trim( A13914ForTra1) + GXutil.trim( GXutil.str( A13917ForTraP2, 3, 0)) + "%" + GXutil.trim( A13916ForTra2) + GXutil.trim( GXutil.str( A13919ForTraP3, 3, 0)) + "%" + GXutil.trim( A13918ForTra3) ;
            AV43Pinta = httpContext.getMessage( "SI", "") ;
            AV32vFam = GXutil.space( (short)(2)) ;
            AV34vNum_co = (byte)(1) ;
            AV33vTint = httpContext.getMessage( "Tingimento ", "") + GXutil.str( AV34vNum_co, 1, 0) ;
            AV46Ord = (short)(1) ;
            h6QP0( false, 39) ;
            getPrinter().GxDrawRect(59, Gx_line+9, 463, Gx_line+33, 1, 75, 75, 75, 1, 75, 75, 75, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33vTint, "")), 66, Gx_line+14, 142, Gx_line+32, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("%", 395, Gx_line+14, 406, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(590, Gx_line+0, 590, Gx_line+39, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(775, Gx_line+0, 775, Gx_line+39, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+39) ;
            /* Using cursor P06QP6 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A719PrdNum = P06QP6_A719PrdNum[0] ;
               A481ForCan = P06QP6_A481ForCan[0] ;
               A718PrdNom = P06QP6_A718PrdNom[0] ;
               A309ColLin = P06QP6_A309ColLin[0] ;
               A718PrdNom = P06QP6_A718PrdNom[0] ;
               if ( ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 2), AV32vFam) != 0 ) && ! (GXutil.strcmp("", AV32vFam)==0) )
               {
                  AV34vNum_co = (byte)(AV34vNum_co+1) ;
                  AV33vTint = httpContext.getMessage( "Tingimento ", "") + GXutil.str( AV34vNum_co, 1, 0) ;
                  /* Execute user subroutine: 'CAB_COL' */
                  S111 ();
                  if ( returnInSub )
                  {
                     pr_default.close(4);
                     pr_default.close(4);
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
               }
               AV32vFam = GXutil.substring( A719PrdNum, 1, 2) ;
               AV42ForCan = A481ForCan ;
               h6QP0( false, 20) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 66, Gx_line+2, 148, Gx_line+20, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 127, Gx_line+2, 291, Gx_line+20, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV42ForCan, "Z9.99999")), 367, Gx_line+2, 426, Gx_line+20, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(590, Gx_line+0, 590, Gx_line+18, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(775, Gx_line+0, 775, Gx_line+18, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+20) ;
               pr_default.readNext(4);
            }
            pr_default.close(4);
            if ( GXutil.strcmp(AV43Pinta, httpContext.getMessage( "SI", "")) == 0 )
            {
               h6QP0( false, 93) ;
               getPrinter().GxDrawLine(775, Gx_line+0, 775, Gx_line+93, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(590, Gx_line+6, 776, Gx_line+6, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "PADRÃO LDC", ""), 639, Gx_line+16, 728, Gx_line+33, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(590, Gx_line+0, 590, Gx_line+93, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+93) ;
            }
            h6QP0( false, 18) ;
            getPrinter().GxDrawLine(590, Gx_line+0, 590, Gx_line+18, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(775, Gx_line+0, 775, Gx_line+18, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Ordem", ""), 517, Gx_line+0, 563, Gx_line+17, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+18) ;
            /* Using cursor P06QP7 */
            pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
            while ( (pr_default.getStatus(5) != 101) )
            {
               A490ForPrdUMe = P06QP7_A490ForPrdUMe[0] ;
               A488ForPrdDsc = P06QP7_A488ForPrdDsc[0] ;
               n488ForPrdDsc = P06QP7_n488ForPrdDsc[0] ;
               A487ForPrdCan = P06QP7_A487ForPrdCan[0] ;
               A489ForPrdNor = P06QP7_A489ForPrdNor[0] ;
               A718PrdNom = P06QP7_A718PrdNom[0] ;
               A719PrdNum = P06QP7_A719PrdNum[0] ;
               A715PrdLin = P06QP7_A715PrdLin[0] ;
               A718PrdNom = P06QP7_A718PrdNom[0] ;
               A488ForPrdDsc = P06QP7_A488ForPrdDsc[0] ;
               n488ForPrdDsc = P06QP7_n488ForPrdDsc[0] ;
               AV40ForPrdDsc = GXutil.substring( A488ForPrdDsc, 1, 4) ;
               AV41ForPrdCan = A487ForPrdCan ;
               h6QP0( false, 20) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 66, Gx_line+2, 155, Gx_line+20, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 127, Gx_line+2, 318, Gx_line+20, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV41ForPrdCan, "Z9.999")), 376, Gx_line+2, 427, Gx_line+20, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40ForPrdDsc, "")), 442, Gx_line+2, 501, Gx_line+20, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(590, Gx_line+0, 590, Gx_line+18, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(775, Gx_line+0, 775, Gx_line+18, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A489ForPrdNor), "ZZZ9")), 525, Gx_line+0, 559, Gx_line+18, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+20) ;
               AV46Ord = (short)(AV46Ord+1) ;
               pr_default.readNext(5);
            }
            pr_default.close(5);
            pr_default.readNext(1);
         }
         pr_default.close(1);
         GxHdr3 = false ;
         h6QP0( false, 104) ;
         getPrinter().GxAttris("Arial", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38ContDsc, "")), 7, Gx_line+89, 71, Gx_line+102, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 9, true, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Data", ""), 9, Gx_line+59, 38, Gx_line+75, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39FechaC, "")), 48, Gx_line+60, 205, Gx_line+78, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 9, true, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "o LDC", ""), 269, Gx_line+59, 306, Gx_line+75, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawLine(310, Gx_line+71, 584, Gx_line+71, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(4, Gx_line+31, 584, Gx_line+31, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(4, Gx_line+83, 584, Gx_line+83, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(590, Gx_line+0, 590, Gx_line+83, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(775, Gx_line+0, 775, Gx_line+83, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(590, Gx_line+83, 776, Gx_line+83, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "CUSTO DA RECEITA :", ""), 49, Gx_line+36, 180, Gx_line+52, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "€ por Kg", ""), 477, Gx_line+36, 528, Gx_line+52, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawLine(394, Gx_line+51, 468, Gx_line+51, 1, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+104) ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6QP0( true, 0) ;
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
      /* 'CAB_COL' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV43Pinta, httpContext.getMessage( "SI", "")) == 0 )
      {
         h6QP0( false, 34) ;
         getPrinter().GxDrawLine(590, Gx_line+0, 590, Gx_line+34, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(775, Gx_line+0, 775, Gx_line+34, 1, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "PADRÃO LDC", ""), 639, Gx_line+13, 728, Gx_line+30, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawLine(590, Gx_line+5, 776, Gx_line+5, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawRect(59, Gx_line+6, 463, Gx_line+30, 1, 75, 75, 75, 1, 75, 75, 75, 0, 0, 0, 0, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
         getPrinter().GxDrawText("%", 390, Gx_line+10, 401, Gx_line+27, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33vTint, "")), 69, Gx_line+10, 145, Gx_line+28, 0+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+34) ;
         AV43Pinta = httpContext.getMessage( "NO", "") ;
      }
      else
      {
         h6QP0( false, 34) ;
         getPrinter().GxDrawRect(59, Gx_line+6, 463, Gx_line+30, 1, 75, 75, 75, 1, 75, 75, 75, 0, 0, 0, 0, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
         getPrinter().GxDrawText("%", 390, Gx_line+10, 401, Gx_line+27, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33vTint, "")), 69, Gx_line+10, 145, Gx_line+28, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawLine(775, Gx_line+0, 775, Gx_line+34, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(590, Gx_line+0, 590, Gx_line+34, 1, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+34) ;
      }
   }

   public void h6QP0( boolean bFoot ,
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
            if ( GxHdr3 )
            {
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 81, Gx_line+103, 238, Gx_line+118, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A482ForColNom, "")), 81, Gx_line+72, 150, Gx_line+87, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(169, Gx_line+17, 620, Gx_line+51, 1, 128, 128, 128, 1, 128, 128, 128, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "RECEITA COR", ""), 513, Gx_line+26, 604, Gx_line+43, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17NomEmp, "")), 188, Gx_line+26, 377, Gx_line+44, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Código Côr", ""), 4, Gx_line+71, 70, Gx_line+86, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 4, Gx_line+102, 46, Gx_line+117, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Composição", ""), 4, Gx_line+133, 77, Gx_line+148, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Preparação", ""), 4, Gx_line+165, 70, Gx_line+180, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "N/ Código Côr", ""), 339, Gx_line+71, 418, Gx_line+86, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A483ForColNum), "ZZZZZ9")), 420, Gx_line+72, 587, Gx_line+86, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cartaz", ""), 339, Gx_line+102, 376, Gx_line+117, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A995ForTonal, "")), 420, Gx_line+103, 525, Gx_line+118, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31vCompo, "")), 81, Gx_line+134, 238, Gx_line+149, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Tipo", ""), 339, Gx_line+123, 364, Gx_line+138, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36v_desc, "")), 81, Gx_line+166, 291, Gx_line+180, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(4, Gx_line+191, 584, Gx_line+191, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(590, Gx_line+66, 776, Gx_line+66, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(590, Gx_line+66, 590, Gx_line+194, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(775, Gx_line+66, 775, Gx_line+194, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "PADRÃO CLIENTE", ""), 624, Gx_line+79, 742, Gx_line+96, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Malha", ""), 334, Gx_line+134, 368, Gx_line+149, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5742ForSerDsc, "")), 387, Gx_line+134, 551, Gx_line+152, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Caderno Encargos", ""), 300, Gx_line+167, 406, Gx_line+182, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47Lb_PedCod, "")), 415, Gx_line+167, 584, Gx_line+182, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+201) ;
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
      getPrinter().setMetrics("Arial", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Arial", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics2( )
   {
      getPrinter().setMetrics("Microsoft Sans Serif", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics3( )
   {
      getPrinter().setMetrics("Microsoft Sans Serif", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics4( )
   {
      getPrinter().setMetrics("Arial", true, true, 58, 14, 72, 123,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 18, 21, 30, 35, 35, 55, 45, 14, 21, 21, 25, 37, 18, 21, 18, 18, 35, 35, 35, 35, 35, 35, 35, 35, 35, 35, 21, 21, 37, 37, 37, 38, 61, 45, 45, 45, 45, 42, 38, 49, 45, 17, 35, 45, 38, 52, 45, 49, 42, 49, 45, 42, 38, 45, 42, 59, 42, 42, 38, 21, 18, 23, 37, 35, 21, 35, 38, 35, 38, 35, 21, 38, 38, 18, 18, 35, 18, 56, 38, 38, 38, 38, 25, 35, 21, 38, 35, 49, 35, 35, 32, 25, 17, 25, 37, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 18, 21, 36, 35, 35, 35, 17, 35, 21, 46, 23, 35, 37, 21, 46, 35, 25, 35, 21, 21, 21, 36, 35, 21, 21, 21, 23, 35, 53, 53, 53, 38, 45, 45, 45, 45, 45, 45, 63, 45, 42, 42, 42, 42, 18, 18, 18, 18, 45, 45, 49, 49, 49, 49, 49, 37, 49, 45, 45, 45, 45, 42, 42, 38, 35, 35, 35, 35, 35, 35, 56, 35, 35, 35, 35, 35, 18, 18, 18, 18, 38, 38, 38, 38, 38, 38, 38, 35, 38, 38, 38, 38, 38, 35, 38, 35}) ;
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
      AV11PSerie = "" ;
      AV12Userie = "" ;
      AV13PColor = "" ;
      AV14UColor = "" ;
      AV38ContDsc = "" ;
      scmdbuf = "" ;
      P06QP2_A396EmprCod = new String[] {""} ;
      P06QP2_A407EmprNom = new String[] {""} ;
      P06QP2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV17NomEmp = "" ;
      P06QP3_A65ArtCod = new String[] {""} ;
      P06QP3_A396EmprCod = new String[] {""} ;
      P06QP3_A486ForNumCol = new int[1] ;
      P06QP3_A831TipColCod = new byte[1] ;
      P06QP3_A483ForColNum = new int[1] ;
      P06QP3_A482ForColNom = new String[] {""} ;
      P06QP3_A494ForSer = new String[] {""} ;
      P06QP3_A252CliCod = new int[1] ;
      P06QP3_A485ForFec = new java.util.Date[] {GXutil.nullDate()} ;
      P06QP3_n485ForFec = new boolean[] {false} ;
      P06QP3_A3315ForNumArc = new int[1] ;
      P06QP3_n3315ForNumArc = new boolean[] {false} ;
      P06QP3_A5742ForSerDsc = new String[] {""} ;
      P06QP3_n5742ForSerDsc = new boolean[] {false} ;
      P06QP3_A995ForTonal = new String[] {""} ;
      P06QP3_n995ForTonal = new boolean[] {false} ;
      P06QP3_A279CliNom = new String[] {""} ;
      P06QP3_A13918ForTra3 = new String[] {""} ;
      P06QP3_n13918ForTra3 = new boolean[] {false} ;
      P06QP3_A13919ForTraP3 = new short[1] ;
      P06QP3_n13919ForTraP3 = new boolean[] {false} ;
      P06QP3_A13916ForTra2 = new String[] {""} ;
      P06QP3_n13916ForTra2 = new boolean[] {false} ;
      P06QP3_A13917ForTraP2 = new short[1] ;
      P06QP3_n13917ForTraP2 = new boolean[] {false} ;
      P06QP3_A13914ForTra1 = new String[] {""} ;
      P06QP3_n13914ForTra1 = new boolean[] {false} ;
      P06QP3_A13915ForTraP1 = new short[1] ;
      P06QP3_n13915ForTraP1 = new boolean[] {false} ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A485ForFec = GXutil.nullDate() ;
      A5742ForSerDsc = "" ;
      A995ForTonal = "" ;
      A279CliNom = "" ;
      A13918ForTra3 = "" ;
      A13916ForTra2 = "" ;
      A13914ForTra1 = "" ;
      AV39FechaC = "" ;
      AV47Lb_PedCod = "" ;
      GXt_char2 = "" ;
      GXv_char1 = new String[1] ;
      AV36v_desc = "" ;
      P06QP4_A396EmprCod = new String[] {""} ;
      P06QP4_A252CliCod = new int[1] ;
      P06QP4_A494ForSer = new String[] {""} ;
      P06QP4_A482ForColNom = new String[] {""} ;
      P06QP4_A483ForColNum = new int[1] ;
      P06QP4_A831TipColCod = new byte[1] ;
      P06QP4_A764ProForCod = new String[] {""} ;
      P06QP4_A1160ProForL = new short[1] ;
      P06QP4_A766ProForDsc = new String[] {""} ;
      A764ProForCod = "" ;
      A766ProForDsc = "" ;
      P06QP5_A396EmprCod = new String[] {""} ;
      P06QP5_A764ProForCod = new String[] {""} ;
      P06QP5_A767ProForLin = new short[1] ;
      P06QP5_A770ProForPrd = new String[] {""} ;
      A770ProForPrd = "" ;
      AV31vCompo = "" ;
      AV43Pinta = "" ;
      AV32vFam = "" ;
      AV33vTint = "" ;
      P06QP6_A396EmprCod = new String[] {""} ;
      P06QP6_A486ForNumCol = new int[1] ;
      P06QP6_A719PrdNum = new String[] {""} ;
      P06QP6_A481ForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06QP6_A718PrdNom = new String[] {""} ;
      P06QP6_A309ColLin = new short[1] ;
      A719PrdNum = "" ;
      A481ForCan = DecimalUtil.ZERO ;
      A718PrdNom = "" ;
      AV42ForCan = DecimalUtil.ZERO ;
      P06QP7_A490ForPrdUMe = new byte[1] ;
      P06QP7_A396EmprCod = new String[] {""} ;
      P06QP7_A486ForNumCol = new int[1] ;
      P06QP7_A488ForPrdDsc = new String[] {""} ;
      P06QP7_n488ForPrdDsc = new boolean[] {false} ;
      P06QP7_A487ForPrdCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06QP7_A489ForPrdNor = new short[1] ;
      P06QP7_A718PrdNom = new String[] {""} ;
      P06QP7_A719PrdNum = new String[] {""} ;
      P06QP7_A715PrdLin = new short[1] ;
      A488ForPrdDsc = "" ;
      A487ForPrdCan = DecimalUtil.ZERO ;
      AV40ForPrdDsc = "" ;
      AV41ForPrdCan = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.rmod005__default(),
         new Object[] {
             new Object[] {
            P06QP2_A396EmprCod, P06QP2_A407EmprNom, P06QP2_n407EmprNom
            }
            , new Object[] {
            P06QP3_A65ArtCod, P06QP3_A396EmprCod, P06QP3_A486ForNumCol, P06QP3_A831TipColCod, P06QP3_A483ForColNum, P06QP3_A482ForColNom, P06QP3_A494ForSer, P06QP3_A252CliCod, P06QP3_A485ForFec, P06QP3_n485ForFec,
            P06QP3_A3315ForNumArc, P06QP3_n3315ForNumArc, P06QP3_A5742ForSerDsc, P06QP3_n5742ForSerDsc, P06QP3_A995ForTonal, P06QP3_n995ForTonal, P06QP3_A279CliNom, P06QP3_A13918ForTra3, P06QP3_n13918ForTra3, P06QP3_A13919ForTraP3,
            P06QP3_n13919ForTraP3, P06QP3_A13916ForTra2, P06QP3_n13916ForTra2, P06QP3_A13917ForTraP2, P06QP3_n13917ForTraP2, P06QP3_A13914ForTra1, P06QP3_n13914ForTra1, P06QP3_A13915ForTraP1, P06QP3_n13915ForTraP1
            }
            , new Object[] {
            P06QP4_A396EmprCod, P06QP4_A252CliCod, P06QP4_A494ForSer, P06QP4_A482ForColNom, P06QP4_A483ForColNum, P06QP4_A831TipColCod, P06QP4_A764ProForCod, P06QP4_A1160ProForL, P06QP4_A766ProForDsc
            }
            , new Object[] {
            P06QP5_A396EmprCod, P06QP5_A764ProForCod, P06QP5_A767ProForLin, P06QP5_A770ProForPrd
            }
            , new Object[] {
            P06QP6_A396EmprCod, P06QP6_A486ForNumCol, P06QP6_A719PrdNum, P06QP6_A481ForCan, P06QP6_A718PrdNom, P06QP6_A309ColLin
            }
            , new Object[] {
            P06QP7_A490ForPrdUMe, P06QP7_A396EmprCod, P06QP7_A486ForNumCol, P06QP7_A488ForPrdDsc, P06QP7_n488ForPrdDsc, P06QP7_A487ForPrdCan, P06QP7_A489ForPrdNor, P06QP7_A718PrdNom, P06QP7_A719PrdNum, P06QP7_A715PrdLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte AV44Tipcolcodfrom ;
   private byte AV45tipcolcodto ;
   private byte A831TipColCod ;
   private byte AV35p_Tinte ;
   private byte AV34vNum_co ;
   private byte A490ForPrdUMe ;
   private short gxcookieaux ;
   private short A13919ForTraP3 ;
   private short A13917ForTraP2 ;
   private short A13915ForTraP1 ;
   private short A1160ProForL ;
   private short A767ProForLin ;
   private short AV46Ord ;
   private short A309ColLin ;
   private short A489ForPrdNor ;
   private short A715PrdLin ;
   private short Gx_err ;
   private int AV9PCliCod ;
   private int AV10UCliCod ;
   private int AV15PNumCol ;
   private int AV16UNumCol ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A486ForNumCol ;
   private int A483ForColNum ;
   private int A252CliCod ;
   private int A3315ForNumArc ;
   private int Gx_OldLine ;
   private java.math.BigDecimal A481ForCan ;
   private java.math.BigDecimal AV42ForCan ;
   private java.math.BigDecimal A487ForPrdCan ;
   private java.math.BigDecimal AV41ForPrdCan ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV11PSerie ;
   private String AV12Userie ;
   private String AV13PColor ;
   private String AV14UColor ;
   private String AV38ContDsc ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV17NomEmp ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A5742ForSerDsc ;
   private String A995ForTonal ;
   private String A279CliNom ;
   private String A13918ForTra3 ;
   private String A13916ForTra2 ;
   private String A13914ForTra1 ;
   private String AV39FechaC ;
   private String AV47Lb_PedCod ;
   private String GXt_char2 ;
   private String GXv_char1[] ;
   private String AV36v_desc ;
   private String A764ProForCod ;
   private String A766ProForDsc ;
   private String A770ProForPrd ;
   private String AV31vCompo ;
   private String AV43Pinta ;
   private String AV32vFam ;
   private String AV33vTint ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String A488ForPrdDsc ;
   private String AV40ForPrdDsc ;
   private java.util.Date A485ForFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean GxHdr3 ;
   private boolean n485ForFec ;
   private boolean n3315ForNumArc ;
   private boolean n5742ForSerDsc ;
   private boolean n995ForTonal ;
   private boolean n13918ForTra3 ;
   private boolean n13919ForTraP3 ;
   private boolean n13916ForTra2 ;
   private boolean n13917ForTraP2 ;
   private boolean n13914ForTra1 ;
   private boolean n13915ForTraP1 ;
   private boolean returnInSub ;
   private boolean n488ForPrdDsc ;
   private IDataStoreProvider pr_default ;
   private String[] P06QP2_A396EmprCod ;
   private String[] P06QP2_A407EmprNom ;
   private boolean[] P06QP2_n407EmprNom ;
   private String[] P06QP3_A65ArtCod ;
   private String[] P06QP3_A396EmprCod ;
   private int[] P06QP3_A486ForNumCol ;
   private byte[] P06QP3_A831TipColCod ;
   private int[] P06QP3_A483ForColNum ;
   private String[] P06QP3_A482ForColNom ;
   private String[] P06QP3_A494ForSer ;
   private int[] P06QP3_A252CliCod ;
   private java.util.Date[] P06QP3_A485ForFec ;
   private boolean[] P06QP3_n485ForFec ;
   private int[] P06QP3_A3315ForNumArc ;
   private boolean[] P06QP3_n3315ForNumArc ;
   private String[] P06QP3_A5742ForSerDsc ;
   private boolean[] P06QP3_n5742ForSerDsc ;
   private String[] P06QP3_A995ForTonal ;
   private boolean[] P06QP3_n995ForTonal ;
   private String[] P06QP3_A279CliNom ;
   private String[] P06QP3_A13918ForTra3 ;
   private boolean[] P06QP3_n13918ForTra3 ;
   private short[] P06QP3_A13919ForTraP3 ;
   private boolean[] P06QP3_n13919ForTraP3 ;
   private String[] P06QP3_A13916ForTra2 ;
   private boolean[] P06QP3_n13916ForTra2 ;
   private short[] P06QP3_A13917ForTraP2 ;
   private boolean[] P06QP3_n13917ForTraP2 ;
   private String[] P06QP3_A13914ForTra1 ;
   private boolean[] P06QP3_n13914ForTra1 ;
   private short[] P06QP3_A13915ForTraP1 ;
   private boolean[] P06QP3_n13915ForTraP1 ;
   private String[] P06QP4_A396EmprCod ;
   private int[] P06QP4_A252CliCod ;
   private String[] P06QP4_A494ForSer ;
   private String[] P06QP4_A482ForColNom ;
   private int[] P06QP4_A483ForColNum ;
   private byte[] P06QP4_A831TipColCod ;
   private String[] P06QP4_A764ProForCod ;
   private short[] P06QP4_A1160ProForL ;
   private String[] P06QP4_A766ProForDsc ;
   private String[] P06QP5_A396EmprCod ;
   private String[] P06QP5_A764ProForCod ;
   private short[] P06QP5_A767ProForLin ;
   private String[] P06QP5_A770ProForPrd ;
   private String[] P06QP6_A396EmprCod ;
   private int[] P06QP6_A486ForNumCol ;
   private String[] P06QP6_A719PrdNum ;
   private java.math.BigDecimal[] P06QP6_A481ForCan ;
   private String[] P06QP6_A718PrdNom ;
   private short[] P06QP6_A309ColLin ;
   private byte[] P06QP7_A490ForPrdUMe ;
   private String[] P06QP7_A396EmprCod ;
   private int[] P06QP7_A486ForNumCol ;
   private String[] P06QP7_A488ForPrdDsc ;
   private boolean[] P06QP7_n488ForPrdDsc ;
   private java.math.BigDecimal[] P06QP7_A487ForPrdCan ;
   private short[] P06QP7_A489ForPrdNor ;
   private String[] P06QP7_A718PrdNom ;
   private String[] P06QP7_A719PrdNum ;
   private short[] P06QP7_A715PrdLin ;
}

final  class rmod005__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06QP2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06QP3", "SELECT T3.ArtCod, T1.EmprCod, T1.ForNumCol, T1.TipColCod, T1.ForColNum, T1.ForColNom, T1.ForSer, T1.CliCod, T1.ForFec, T1.ForNumArc, T1.ForSerDsc, T1.ForTonal, T2.CliNom, COALESCE( T3.ArtTra3, ' ') AS ForTra3, COALESCE( T3.ArtTraP3, 0) AS ForTraP3, COALESCE( T3.ArtTra2, ' ') AS ForTra2, COALESCE( T3.ArtTraP2, 0) AS ForTraP2, COALESCE( T3.ArtTra1, ' ') AS ForTra1, COALESCE( T3.ArtTraP1, 0) AS ForTraP1 FROM ((TXPCFORMU T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN TXPARTICU T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod AND T3.ArtCod = T1.ForSer) WHERE (T1.EmprCod = ? and T1.CliCod >= ? and T1.ForSer >= ? and T1.ForColNom >= ? and T1.ForColNum >= ? and T1.TipColCod >= ?) AND (T1.ForSer <= ?) AND (T1.ForColNum <= ?) AND (T1.ForColNom <= ?) AND (T1.TipColCod <= ?) AND (T1.CliCod <= ?) ORDER BY T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06QP4", "SELECT T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod, T1.ProForCod, T1.ProForL, T2.ProForDsc FROM (TXPLFORMU T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ForSer = ? and T1.ForColNom = ? and T1.ForColNum = ? and T1.TipColCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06QP5", "SELECT EmprCod, ProForCod, ProForLin, ProForPrd FROM TXPLPROFO WHERE EmprCod = ? and ProForCod = ? ORDER BY EmprCod, ProForCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06QP6", "SELECT T1.EmprCod, T1.ForNumCol, T1.PrdNum, T1.ForCan, T2.PrdNom, T1.ColLin FROM (TXPLDFORM T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.ForNumCol = ? ORDER BY T1.EmprCod, T1.ForNumCol, T1.ColLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06QP7", "SELECT T1.ForPrdUMe, T1.EmprCod, T1.ForNumCol, T3.ForPrdDsc, T1.ForPrdCan, T1.ForPrdNor, T2.PrdNom, T1.PrdNum, T1.PrdLin FROM ((TXPLPRFOR T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod AND T3.ForPrdUMe = T1.ForPrdUMe) WHERE T1.EmprCod = ? and T1.ForNumCol = ? ORDER BY T1.EmprCod, T1.ForNumCol, T1.PrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(11, 26);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(12, 20);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(13, 30);
               ((String[]) buf[17])[0] = rslt.getString(14, 4);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(15);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(16, 4);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((short[]) buf[23])[0] = rslt.getShort(17);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(18, 4);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((short[]) buf[27])[0] = rslt.getShort(19);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 30);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 5 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,5);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 26);
               ((String[]) buf[8])[0] = rslt.getString(8, 6);
               ((short[]) buf[9])[0] = rslt.getShort(9);
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 16);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setString(9, (String)parms[8], 13);
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setInt(11, ((Number) parms[10]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

