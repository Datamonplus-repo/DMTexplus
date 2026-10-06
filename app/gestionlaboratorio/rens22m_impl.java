package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rens22m_impl extends GXWebReport
{
   public rens22m_impl( com.genexus.internet.HttpContext context )
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
            A5532Lb_numero = (int)(GXutil.lval( httpContext.GetPar( "Lb_numero"))) ;
            AV50Lb_opcion = httpContext.GetPar( "Lb_opcion") ;
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
         super.Gx_out = this.Gx_out ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
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
         GXv_char1[0] = AV38ContDsc ;
         new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ENS022", ""), GXv_char1) ;
         rens22m_impl.this.AV38ContDsc = GXv_char1[0] ;
         AV47UsurCod = " " ;
         GXt_char2 = AV45Station ;
         GXv_char1[0] = GXt_char2 ;
         new app.obtenerwrkst(remoteHandle, context).execute( GXv_char1) ;
         rens22m_impl.this.GXt_char2 = GXv_char1[0] ;
         AV45Station = GXt_char2 ;
         GXv_char1[0] = A396EmprCod ;
         GXv_char3[0] = AV46EmprNom ;
         GXv_char4[0] = AV47UsurCod ;
         new app.pbusemp(remoteHandle, context).execute( AV45Station, GXv_char1, GXv_char3, GXv_char4) ;
         rens22m_impl.this.A396EmprCod = GXv_char1[0] ;
         rens22m_impl.this.AV46EmprNom = GXv_char3[0] ;
         rens22m_impl.this.AV47UsurCod = GXv_char4[0] ;
         /* Using cursor P076Y2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P076Y2_A407EmprNom[0] ;
            n407EmprNom = P076Y2_n407EmprNom[0] ;
            AV17NomEmp = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         GxHdr3 = true ;
         /* Using cursor P076Y3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A5540Lb_Cartaz = P076Y3_A5540Lb_Cartaz[0] ;
            A252CliCod = P076Y3_A252CliCod[0] ;
            A5533Lb_ArtCod = P076Y3_A5533Lb_ArtCod[0] ;
            A5537Lb_ColNum = P076Y3_A5537Lb_ColNum[0] ;
            A5536Lb_ColNom = P076Y3_A5536Lb_ColNom[0] ;
            A279CliNom = P076Y3_A279CliNom[0] ;
            A279CliNom = P076Y3_A279CliNom[0] ;
            AV39FechaC = GXutil.str( GXutil.day( Gx_date), 2, 0) + " " + localUtil.cmonth( Gx_date, httpContext.getMessage( "por", "")) + " " + GXutil.str( GXutil.year( Gx_date), 4, 0) ;
            AV43ForTonal = A5540Lb_Cartaz ;
            AV35p_Tinte = (byte)(0) ;
            AV36v_desc = GXutil.space( (short)(26)) ;
            /* Using cursor P076Y4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A5553Lb_ForCod = P076Y4_A5553Lb_ForCod[0] ;
               A5551Lb_lineaPq = P076Y4_A5551Lb_lineaPq[0] ;
               AV49ProFor_3 = GXutil.substring( A5553Lb_ForCod, 1, 3) ;
               /* Using cursor P076Y5 */
               pr_default.execute(3, new Object[] {A396EmprCod, A5553Lb_ForCod});
               while ( (pr_default.getStatus(3) != 101) )
               {
                  A764ProForCod = P076Y5_A764ProForCod[0] ;
                  A5523ProForTip = P076Y5_A5523ProForTip[0] ;
                  A766ProForDsc = P076Y5_A766ProForDsc[0] ;
                  if ( GXutil.like( A764ProForCod , GXutil.padr( httpContext.getMessage( "%DES%", "") , 254 , "%"),  ' ' ) || GXutil.like( A764ProForCod , GXutil.padr( httpContext.getMessage( "%MBR%", "") , 254 , "%"),  ' ' ) || ( GXutil.strcmp(A5523ProForTip, httpContext.getMessage( "P", "")) == 0 ) )
                  {
                     AV36v_desc = A766ProForDsc ;
                     /* Exit For each command. Update data (if necessary), close cursors & exit. */
                     if (true) break;
                  }
                  /* Exiting from a For First loop. */
                  if (true) break;
               }
               pr_default.close(3);
               pr_default.readNext(2);
            }
            pr_default.close(2);
            GXv_char4[0] = A396EmprCod ;
            GXv_int5[0] = A252CliCod ;
            GXv_char3[0] = A5533Lb_ArtCod ;
            GXv_char1[0] = AV18ArtTra1 ;
            GXv_char6[0] = AV20ArtTra2 ;
            GXv_char7[0] = AV22ArtTra3 ;
            GXv_int8[0] = AV19ArtTraP1 ;
            GXv_int9[0] = AV21ArtTraP2 ;
            GXv_int10[0] = AV23ArtTraP3 ;
            GXv_char11[0] = AV29ArtUrd1 ;
            GXv_char12[0] = AV27ArtUrd2 ;
            GXv_char13[0] = AV25ArtUrd3 ;
            GXv_int14[0] = AV28ArtUrdP1 ;
            GXv_int15[0] = AV26ArtUrdP2 ;
            GXv_int16[0] = AV24ArtUrdP3 ;
            new app.pbusdar(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_char3, GXv_char1, GXv_char6, GXv_char7, GXv_int8, GXv_int9, GXv_int10, GXv_char11, GXv_char12, GXv_char13, GXv_int14, GXv_int15, GXv_int16) ;
            rens22m_impl.this.A396EmprCod = GXv_char4[0] ;
            rens22m_impl.this.A252CliCod = GXv_int5[0] ;
            rens22m_impl.this.A5533Lb_ArtCod = GXv_char3[0] ;
            rens22m_impl.this.AV18ArtTra1 = GXv_char1[0] ;
            rens22m_impl.this.AV20ArtTra2 = GXv_char6[0] ;
            rens22m_impl.this.AV22ArtTra3 = GXv_char7[0] ;
            rens22m_impl.this.AV19ArtTraP1 = GXv_int8[0] ;
            rens22m_impl.this.AV21ArtTraP2 = GXv_int9[0] ;
            rens22m_impl.this.AV23ArtTraP3 = GXv_int10[0] ;
            rens22m_impl.this.AV29ArtUrd1 = GXv_char11[0] ;
            rens22m_impl.this.AV27ArtUrd2 = GXv_char12[0] ;
            rens22m_impl.this.AV25ArtUrd3 = GXv_char13[0] ;
            rens22m_impl.this.AV28ArtUrdP1 = GXv_int14[0] ;
            rens22m_impl.this.AV26ArtUrdP2 = GXv_int15[0] ;
            rens22m_impl.this.AV24ArtUrdP3 = GXv_int16[0] ;
            GXv_char13[0] = A396EmprCod ;
            GXv_int5[0] = A252CliCod ;
            GXv_char12[0] = A5533Lb_ArtCod ;
            GXv_char11[0] = AV30TArtDsc ;
            new app.pbusar2(remoteHandle, context).execute( GXv_char13, GXv_int5, GXv_char12, GXv_char11) ;
            rens22m_impl.this.A396EmprCod = GXv_char13[0] ;
            rens22m_impl.this.A252CliCod = GXv_int5[0] ;
            rens22m_impl.this.A5533Lb_ArtCod = GXv_char12[0] ;
            rens22m_impl.this.AV30TArtDsc = GXv_char11[0] ;
            GXv_char13[0] = AV37ARtDsc ;
            new app.pfartdsc(remoteHandle, context).execute( A396EmprCod, A252CliCod, A5533Lb_ArtCod, GXv_char13) ;
            rens22m_impl.this.AV37ARtDsc = GXv_char13[0] ;
            AV37ARtDsc = GXutil.substring( AV37ARtDsc, 1, 20) ;
            AV31vCompo = GXutil.trim( GXutil.str( AV19ArtTraP1, 3, 0)) + "%" + GXutil.trim( AV18ArtTra1) + "+" + GXutil.trim( GXutil.str( AV21ArtTraP2, 3, 0)) + "%" + GXutil.trim( AV20ArtTra2) + "+" + GXutil.trim( GXutil.str( AV23ArtTraP3, 3, 0)) + "%" + GXutil.trim( AV22ArtTra3) ;
            AV43ForTonal = GXutil.substring( A5540Lb_Cartaz, 1, 10) ;
            AV32vFam = GXutil.space( (short)(2)) ;
            AV34vNum_co = (byte)(1) ;
            AV33vTint = httpContext.getMessage( "Tingimento ", "") + GXutil.str( AV34vNum_co, 1, 0) ;
            h76Y0( false, 39) ;
            getPrinter().GxDrawRect(59, Gx_line+9, 463, Gx_line+33, 1, 75, 75, 75, 1, 75, 75, 75, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33vTint, "")), 66, Gx_line+14, 142, Gx_line+32, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("%", 395, Gx_line+14, 406, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(575, Gx_line+0, 575, Gx_line+39, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(775, Gx_line+0, 775, Gx_line+39, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+39) ;
            AV44Num_lin = (short)(0) ;
            /* Using cursor P076Y6 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), AV50Lb_opcion});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A5555Lb_opcion = P076Y6_A5555Lb_opcion[0] ;
               A719PrdNum = P076Y6_A719PrdNum[0] ;
               A5558LB_CantC = P076Y6_A5558LB_CantC[0] ;
               A718PrdNom = P076Y6_A718PrdNom[0] ;
               A5557Lb_LineaC = P076Y6_A5557Lb_LineaC[0] ;
               A718PrdNom = P076Y6_A718PrdNom[0] ;
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
               AV42ForCan = A5558LB_CantC ;
               h76Y0( false, 22) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 66, Gx_line+2, 117, Gx_line+20, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 127, Gx_line+2, 345, Gx_line+20, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV42ForCan, "Z9.99999")), 367, Gx_line+2, 435, Gx_line+20, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(575, Gx_line+0, 575, Gx_line+18, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(775, Gx_line+0, 775, Gx_line+18, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+22) ;
               AV44Num_lin = (short)(AV44Num_lin+1) ;
               pr_default.readNext(4);
            }
            pr_default.close(4);
            h76Y0( false, 18) ;
            getPrinter().GxDrawLine(575, Gx_line+0, 575, Gx_line+18, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(775, Gx_line+0, 775, Gx_line+18, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+18) ;
            AV44Num_lin = (short)(AV44Num_lin+1) ;
            /* Using cursor P076Y7 */
            pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), AV50Lb_opcion});
            while ( (pr_default.getStatus(5) != 101) )
            {
               A490ForPrdUMe = P076Y7_A490ForPrdUMe[0] ;
               A5555Lb_opcion = P076Y7_A5555Lb_opcion[0] ;
               A488ForPrdDsc = P076Y7_A488ForPrdDsc[0] ;
               n488ForPrdDsc = P076Y7_n488ForPrdDsc[0] ;
               A5561LB_CantP = P076Y7_A5561LB_CantP[0] ;
               A718PrdNom = P076Y7_A718PrdNom[0] ;
               A719PrdNum = P076Y7_A719PrdNum[0] ;
               A5560Lb_LineaPr = P076Y7_A5560Lb_LineaPr[0] ;
               A718PrdNom = P076Y7_A718PrdNom[0] ;
               A488ForPrdDsc = P076Y7_A488ForPrdDsc[0] ;
               n488ForPrdDsc = P076Y7_n488ForPrdDsc[0] ;
               AV40ForPrdDsc = GXutil.substring( A488ForPrdDsc, 1, 4) ;
               AV41ForPrdCan = A5561LB_CantP ;
               h76Y0( false, 21) ;
               getPrinter().GxAttris("Courier New", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 66, Gx_line+2, 123, Gx_line+21, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 127, Gx_line+2, 372, Gx_line+21, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV41ForPrdCan, "Z9.999")), 376, Gx_line+2, 433, Gx_line+21, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40ForPrdDsc, "")), 442, Gx_line+2, 481, Gx_line+21, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(575, Gx_line+0, 575, Gx_line+18, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(775, Gx_line+0, 775, Gx_line+18, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+21) ;
               AV44Num_lin = (short)(AV44Num_lin+1) ;
               pr_default.readNext(5);
            }
            pr_default.close(5);
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         GxHdr3 = false ;
         while ( AV44Num_lin < 13 )
         {
            h76Y0( false, 18) ;
            getPrinter().GxDrawLine(575, Gx_line+0, 575, Gx_line+18, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(775, Gx_line+0, 775, Gx_line+18, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+18) ;
            AV44Num_lin = (short)(AV44Num_lin+1) ;
         }
         h76Y0( false, 2) ;
         getPrinter().GxDrawLine(575, Gx_line+0, 776, Gx_line+0, 1, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+2) ;
         h76Y0( false, 68) ;
         getPrinter().GxAttris("Arial", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38ContDsc, "")), 16, Gx_line+55, 80, Gx_line+68, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Data", ""), 17, Gx_line+26, 48, Gx_line+43, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39FechaC, "")), 55, Gx_line+27, 212, Gx_line+45, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawLine(16, Gx_line+17, 775, Gx_line+17, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(16, Gx_line+50, 775, Gx_line+50, 1, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+68) ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h76Y0( true, 0) ;
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
      h76Y0( false, 34) ;
      getPrinter().GxDrawRect(59, Gx_line+5, 463, Gx_line+29, 1, 75, 75, 75, 1, 75, 75, 75, 0, 0, 0, 0, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(575, Gx_line+0, 575, Gx_line+34, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(775, Gx_line+0, 775, Gx_line+34, 1, 0, 0, 0, 0) ;
      getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
      getPrinter().GxDrawText("%", 390, Gx_line+9, 401, Gx_line+26, 0+256, 0, 0, 0) ;
      getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33vTint, "")), 69, Gx_line+9, 145, Gx_line+27, 0+256, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+34) ;
      AV44Num_lin = (short)(AV44Num_lin+2) ;
   }

   public void h76Y0( boolean bFoot ,
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
               getPrinter().GxAttris("Microsoft Sans Serif", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 100, Gx_line+100, 289, Gx_line+118, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5536Lb_ColNom, "")), 100, Gx_line+67, 182, Gx_line+85, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(25, Gx_line+17, 420, Gx_line+51, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "RECEITA COR", ""), 313, Gx_line+26, 404, Gx_line+43, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17NomEmp, "")), 44, Gx_line+26, 294, Gx_line+43, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Côr", ""), 16, Gx_line+66, 40, Gx_line+83, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 16, Gx_line+99, 64, Gx_line+116, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Composição", ""), 16, Gx_line+132, 98, Gx_line+149, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Preparação", ""), 16, Gx_line+172, 94, Gx_line+189, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "N/ Código Côr", ""), 351, Gx_line+66, 444, Gx_line+83, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5537Lb_ColNum), "ZZZZZ9")), 456, Gx_line+67, 501, Gx_line+85, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cartaz", ""), 351, Gx_line+99, 395, Gx_line+116, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43ForTonal, "")), 401, Gx_line+100, 569, Gx_line+118, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30TArtDsc, "")), 100, Gx_line+133, 257, Gx_line+151, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Tipo Malha", ""), 319, Gx_line+132, 394, Gx_line+149, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37ARtDsc, "")), 401, Gx_line+132, 569, Gx_line+150, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36v_desc, "")), 100, Gx_line+172, 264, Gx_line+190, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(575, Gx_line+17, 575, Gx_line+194, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(575, Gx_line+17, 776, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(775, Gx_line+17, 775, Gx_line+194, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(16, Gx_line+191, 576, Gx_line+191, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50Lb_opcion, "@!")), 529, Gx_line+67, 544, Gx_line+85, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText("/", 516, Gx_line+66, 521, Gx_line+83, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+194) ;
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
      getPrinter().setMetrics("Courier New", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics3( )
   {
      getPrinter().setMetrics("Courier New", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics4( )
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
      A396EmprCod = "" ;
      AV50Lb_opcion = "" ;
      AV38ContDsc = "" ;
      AV47UsurCod = "" ;
      AV45Station = "" ;
      GXt_char2 = "" ;
      AV46EmprNom = "" ;
      scmdbuf = "" ;
      P076Y2_A396EmprCod = new String[] {""} ;
      P076Y2_A407EmprNom = new String[] {""} ;
      P076Y2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV17NomEmp = "" ;
      P076Y3_A396EmprCod = new String[] {""} ;
      P076Y3_A5532Lb_numero = new int[1] ;
      P076Y3_A5540Lb_Cartaz = new String[] {""} ;
      P076Y3_A252CliCod = new int[1] ;
      P076Y3_A5533Lb_ArtCod = new String[] {""} ;
      P076Y3_A5537Lb_ColNum = new int[1] ;
      P076Y3_A5536Lb_ColNom = new String[] {""} ;
      P076Y3_A279CliNom = new String[] {""} ;
      A5540Lb_Cartaz = "" ;
      A5533Lb_ArtCod = "" ;
      A5536Lb_ColNom = "" ;
      A279CliNom = "" ;
      AV39FechaC = "" ;
      Gx_date = GXutil.nullDate() ;
      AV43ForTonal = "" ;
      AV36v_desc = "" ;
      P076Y4_A396EmprCod = new String[] {""} ;
      P076Y4_A5532Lb_numero = new int[1] ;
      P076Y4_A5553Lb_ForCod = new String[] {""} ;
      P076Y4_A5551Lb_lineaPq = new short[1] ;
      A5553Lb_ForCod = "" ;
      AV49ProFor_3 = "" ;
      P076Y5_A396EmprCod = new String[] {""} ;
      P076Y5_A764ProForCod = new String[] {""} ;
      P076Y5_A5523ProForTip = new String[] {""} ;
      P076Y5_A766ProForDsc = new String[] {""} ;
      A764ProForCod = "" ;
      A5523ProForTip = "" ;
      A766ProForDsc = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      AV18ArtTra1 = "" ;
      GXv_char1 = new String[1] ;
      AV20ArtTra2 = "" ;
      GXv_char6 = new String[1] ;
      AV22ArtTra3 = "" ;
      GXv_char7 = new String[1] ;
      GXv_int8 = new short[1] ;
      GXv_int9 = new short[1] ;
      GXv_int10 = new short[1] ;
      AV29ArtUrd1 = "" ;
      AV27ArtUrd2 = "" ;
      AV25ArtUrd3 = "" ;
      GXv_int14 = new short[1] ;
      GXv_int15 = new short[1] ;
      GXv_int16 = new short[1] ;
      GXv_int5 = new int[1] ;
      GXv_char12 = new String[1] ;
      AV30TArtDsc = "" ;
      GXv_char11 = new String[1] ;
      AV37ARtDsc = "" ;
      GXv_char13 = new String[1] ;
      AV31vCompo = "" ;
      AV32vFam = "" ;
      AV33vTint = "" ;
      P076Y6_A396EmprCod = new String[] {""} ;
      P076Y6_A5532Lb_numero = new int[1] ;
      P076Y6_A5555Lb_opcion = new String[] {""} ;
      P076Y6_A719PrdNum = new String[] {""} ;
      P076Y6_A5558LB_CantC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P076Y6_A718PrdNom = new String[] {""} ;
      P076Y6_A5557Lb_LineaC = new short[1] ;
      A5555Lb_opcion = "" ;
      A719PrdNum = "" ;
      A5558LB_CantC = DecimalUtil.ZERO ;
      A718PrdNom = "" ;
      AV42ForCan = DecimalUtil.ZERO ;
      P076Y7_A490ForPrdUMe = new byte[1] ;
      P076Y7_A396EmprCod = new String[] {""} ;
      P076Y7_A5532Lb_numero = new int[1] ;
      P076Y7_A5555Lb_opcion = new String[] {""} ;
      P076Y7_A488ForPrdDsc = new String[] {""} ;
      P076Y7_n488ForPrdDsc = new boolean[] {false} ;
      P076Y7_A5561LB_CantP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P076Y7_A718PrdNom = new String[] {""} ;
      P076Y7_A719PrdNum = new String[] {""} ;
      P076Y7_A5560Lb_LineaPr = new short[1] ;
      A488ForPrdDsc = "" ;
      A5561LB_CantP = DecimalUtil.ZERO ;
      AV40ForPrdDsc = "" ;
      AV41ForPrdCan = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.rens22m__default(),
         new Object[] {
             new Object[] {
            P076Y2_A396EmprCod, P076Y2_A407EmprNom, P076Y2_n407EmprNom
            }
            , new Object[] {
            P076Y3_A396EmprCod, P076Y3_A5532Lb_numero, P076Y3_A5540Lb_Cartaz, P076Y3_A252CliCod, P076Y3_A5533Lb_ArtCod, P076Y3_A5537Lb_ColNum, P076Y3_A5536Lb_ColNom, P076Y3_A279CliNom
            }
            , new Object[] {
            P076Y4_A396EmprCod, P076Y4_A5532Lb_numero, P076Y4_A5553Lb_ForCod, P076Y4_A5551Lb_lineaPq
            }
            , new Object[] {
            P076Y5_A396EmprCod, P076Y5_A764ProForCod, P076Y5_A5523ProForTip, P076Y5_A766ProForDsc
            }
            , new Object[] {
            P076Y6_A396EmprCod, P076Y6_A5532Lb_numero, P076Y6_A5555Lb_opcion, P076Y6_A719PrdNum, P076Y6_A5558LB_CantC, P076Y6_A718PrdNom, P076Y6_A5557Lb_LineaC
            }
            , new Object[] {
            P076Y7_A490ForPrdUMe, P076Y7_A396EmprCod, P076Y7_A5532Lb_numero, P076Y7_A5555Lb_opcion, P076Y7_A488ForPrdDsc, P076Y7_n488ForPrdDsc, P076Y7_A5561LB_CantP, P076Y7_A718PrdNom, P076Y7_A719PrdNum, P076Y7_A5560Lb_LineaPr
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV35p_Tinte ;
   private byte AV34vNum_co ;
   private byte A490ForPrdUMe ;
   private short gxcookieaux ;
   private short A5551Lb_lineaPq ;
   private short AV19ArtTraP1 ;
   private short GXv_int8[] ;
   private short AV21ArtTraP2 ;
   private short GXv_int9[] ;
   private short AV23ArtTraP3 ;
   private short GXv_int10[] ;
   private short AV28ArtUrdP1 ;
   private short GXv_int14[] ;
   private short AV26ArtUrdP2 ;
   private short GXv_int15[] ;
   private short AV24ArtUrdP3 ;
   private short GXv_int16[] ;
   private short AV44Num_lin ;
   private short A5557Lb_LineaC ;
   private short A5560Lb_LineaPr ;
   private short Gx_err ;
   private int A5532Lb_numero ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A252CliCod ;
   private int A5537Lb_ColNum ;
   private int GXv_int5[] ;
   private int Gx_OldLine ;
   private java.math.BigDecimal A5558LB_CantC ;
   private java.math.BigDecimal AV42ForCan ;
   private java.math.BigDecimal A5561LB_CantP ;
   private java.math.BigDecimal AV41ForPrdCan ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV50Lb_opcion ;
   private String AV38ContDsc ;
   private String AV47UsurCod ;
   private String AV45Station ;
   private String GXt_char2 ;
   private String AV46EmprNom ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV17NomEmp ;
   private String A5540Lb_Cartaz ;
   private String A5533Lb_ArtCod ;
   private String A5536Lb_ColNom ;
   private String A279CliNom ;
   private String AV39FechaC ;
   private String AV43ForTonal ;
   private String AV36v_desc ;
   private String A5553Lb_ForCod ;
   private String AV49ProFor_3 ;
   private String A764ProForCod ;
   private String A5523ProForTip ;
   private String A766ProForDsc ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String AV18ArtTra1 ;
   private String GXv_char1[] ;
   private String AV20ArtTra2 ;
   private String GXv_char6[] ;
   private String AV22ArtTra3 ;
   private String GXv_char7[] ;
   private String AV29ArtUrd1 ;
   private String AV27ArtUrd2 ;
   private String AV25ArtUrd3 ;
   private String GXv_char12[] ;
   private String AV30TArtDsc ;
   private String GXv_char11[] ;
   private String AV37ARtDsc ;
   private String GXv_char13[] ;
   private String AV31vCompo ;
   private String AV32vFam ;
   private String AV33vTint ;
   private String A5555Lb_opcion ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String A488ForPrdDsc ;
   private String AV40ForPrdDsc ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean GxHdr3 ;
   private boolean returnInSub ;
   private boolean n488ForPrdDsc ;
   private IDataStoreProvider pr_default ;
   private String[] P076Y2_A396EmprCod ;
   private String[] P076Y2_A407EmprNom ;
   private boolean[] P076Y2_n407EmprNom ;
   private String[] P076Y3_A396EmprCod ;
   private int[] P076Y3_A5532Lb_numero ;
   private String[] P076Y3_A5540Lb_Cartaz ;
   private int[] P076Y3_A252CliCod ;
   private String[] P076Y3_A5533Lb_ArtCod ;
   private int[] P076Y3_A5537Lb_ColNum ;
   private String[] P076Y3_A5536Lb_ColNom ;
   private String[] P076Y3_A279CliNom ;
   private String[] P076Y4_A396EmprCod ;
   private int[] P076Y4_A5532Lb_numero ;
   private String[] P076Y4_A5553Lb_ForCod ;
   private short[] P076Y4_A5551Lb_lineaPq ;
   private String[] P076Y5_A396EmprCod ;
   private String[] P076Y5_A764ProForCod ;
   private String[] P076Y5_A5523ProForTip ;
   private String[] P076Y5_A766ProForDsc ;
   private String[] P076Y6_A396EmprCod ;
   private int[] P076Y6_A5532Lb_numero ;
   private String[] P076Y6_A5555Lb_opcion ;
   private String[] P076Y6_A719PrdNum ;
   private java.math.BigDecimal[] P076Y6_A5558LB_CantC ;
   private String[] P076Y6_A718PrdNom ;
   private short[] P076Y6_A5557Lb_LineaC ;
   private byte[] P076Y7_A490ForPrdUMe ;
   private String[] P076Y7_A396EmprCod ;
   private int[] P076Y7_A5532Lb_numero ;
   private String[] P076Y7_A5555Lb_opcion ;
   private String[] P076Y7_A488ForPrdDsc ;
   private boolean[] P076Y7_n488ForPrdDsc ;
   private java.math.BigDecimal[] P076Y7_A5561LB_CantP ;
   private String[] P076Y7_A718PrdNom ;
   private String[] P076Y7_A719PrdNum ;
   private short[] P076Y7_A5560Lb_LineaPr ;
}

final  class rens22m__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P076Y2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P076Y3", "SELECT T1.EmprCod, T1.Lb_numero, T1.Lb_Cartaz, T1.CliCod, T1.Lb_ArtCod, T1.Lb_ColNum, T1.Lb_ColNom, T2.CliNom FROM (TXPENS001 T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) WHERE T1.EmprCod = ? and T1.Lb_numero = ? ORDER BY T1.EmprCod, T1.Lb_numero ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P076Y4", "SELECT EmprCod, Lb_numero, Lb_ForCod, Lb_lineaPq FROM TXPENS000 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero, Lb_lineaPq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P076Y5", "SELECT EmprCod, ProForCod, ProForTip, ProForDsc FROM TXPCPROFO WHERE EmprCod = ? and ProForCod = ? ORDER BY EmprCod, ProForCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P076Y6", "SELECT T1.EmprCod, T1.Lb_numero, T1.Lb_opcion, T1.PrdNum, T1.LB_CantC, T2.PrdNom, T1.Lb_LineaC FROM (TXPENS003 T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.Lb_numero = ? and T1.Lb_opcion = ? ORDER BY T1.EmprCod, T1.Lb_numero, T1.Lb_opcion, T1.Lb_LineaC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P076Y7", "SELECT T1.ForPrdUMe, T1.EmprCod, T1.Lb_numero, T1.Lb_opcion, T3.ForPrdDsc, T1.LB_CantP, T2.PrdNom, T1.PrdNum, T1.Lb_LineaPr FROM ((TXPENS004 T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod AND T3.ForPrdUMe = T1.ForPrdUMe) WHERE T1.EmprCod = ? and T1.Lb_numero = ? and T1.Lb_opcion = ? ORDER BY T1.EmprCod, T1.Lb_numero, T1.Lb_opcion, T1.Lb_LineaPr ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 5 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,5);
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
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
      }
   }

}

