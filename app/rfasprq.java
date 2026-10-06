package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class rfasprq extends GXReport
{
   public rfasprq( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rfasprq.class ), "" );
   }

   public rfasprq( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      rfasprq.this.aP1 = new String[] {""};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 )
   {
      rfasprq.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      rfasprq.this.A457FasCod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      M_top = 0 ;
      M_bot = 1 ;
      P_lines = (int)(66-M_bot) ;
      getPrinter().GxClearAttris() ;
      lineHeight = 15 ;
      PrtOffset = 0 ;
      gxXPage = 100 ;
      gxYPage = 100 ;
      try
      {
         Gx_out = "SCR" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "REPGRAF", "", 2, 2, 9, 11909, 16834, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("LISTADO FASE") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*1)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXt_char1 = AV9Lit0 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( AV28Pgmname, (byte)(99), GXv_char2) ;
         rfasprq.this.GXt_char1 = GXv_char2[0] ;
         AV9Lit0 = GXt_char1 ;
         GXt_char1 = AV10Lit1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         rfasprq.this.GXt_char1 = GXv_char2[0] ;
         AV10Lit1 = GXt_char1 ;
         GXt_char1 = AV11Lit2 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char2) ;
         rfasprq.this.GXt_char1 = GXv_char2[0] ;
         AV11Lit2 = GXt_char1 ;
         GXt_char1 = AV8Lit5 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN748_", ""), (byte)(99), GXv_char2) ;
         rfasprq.this.GXt_char1 = GXv_char2[0] ;
         AV8Lit5 = GXt_char1 ;
         GXt_char1 = AV14Lit6 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WCFL022_", ""), (byte)(99), GXv_char2) ;
         rfasprq.this.GXt_char1 = GXv_char2[0] ;
         AV14Lit6 = GXt_char1 ;
         GXt_char1 = AV15Lit7 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN210_", ""), (byte)(99), GXv_char2) ;
         rfasprq.this.GXt_char1 = GXv_char2[0] ;
         AV15Lit7 = GXt_char1 ;
         GXt_char1 = AV16Lit8 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT24_", ""), (byte)(99), GXv_char2) ;
         rfasprq.this.GXt_char1 = GXv_char2[0] ;
         AV16Lit8 = GXt_char1 ;
         GXt_char1 = AV17Lit9 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WCFL022_", ""), (byte)(99), GXv_char2) ;
         rfasprq.this.GXt_char1 = GXv_char2[0] ;
         AV17Lit9 = GXt_char1 ;
         GXt_char1 = AV18Lit10 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN121_", ""), (byte)(99), GXv_char2) ;
         rfasprq.this.GXt_char1 = GXv_char2[0] ;
         AV18Lit10 = GXt_char1 ;
         GXt_char1 = AV19Lit11 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT24_", ""), (byte)(99), GXv_char2) ;
         rfasprq.this.GXt_char1 = GXv_char2[0] ;
         AV19Lit11 = GXt_char1 ;
         GXt_char1 = AV20Lit12 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "ALBRUNIENC", ""), (byte)(99), GXv_char2) ;
         rfasprq.this.GXt_char1 = GXv_char2[0] ;
         AV20Lit12 = GXt_char1 ;
         GXt_char1 = AV21Lit13 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1544_", ""), (byte)(99), GXv_char2) ;
         rfasprq.this.GXt_char1 = GXv_char2[0] ;
         AV21Lit13 = GXt_char1 ;
         GXt_char1 = AV22Lit14 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN448_", ""), (byte)(99), GXv_char2) ;
         rfasprq.this.GXt_char1 = GXv_char2[0] ;
         AV22Lit14 = GXt_char1 ;
         /* Using cursor P06UL2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P06UL2_A407EmprNom[0] ;
            n407EmprNom = P06UL2_n407EmprNom[0] ;
            AV23EmprNom = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         GxHdr3 = true ;
         /* Using cursor P06UL3 */
         pr_default.execute(1, new Object[] {A396EmprCod, A457FasCod});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A764ProForCod = P06UL3_A764ProForCod[0] ;
            A6017FasClave = P06UL3_A6017FasClave[0] ;
            n6017FasClave = P06UL3_n6017FasClave[0] ;
            A4653FasForRb = P06UL3_A4653FasForRb[0] ;
            n4653FasForRb = P06UL3_n4653FasForRb[0] ;
            A766ProForDsc = P06UL3_A766ProForDsc[0] ;
            A4650FasForLin = P06UL3_A4650FasForLin[0] ;
            A460FasDsc = P06UL3_A460FasDsc[0] ;
            A766ProForDsc = P06UL3_A766ProForDsc[0] ;
            A460FasDsc = P06UL3_A460FasDsc[0] ;
            h6UL0( false, 17) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4650FasForLin), "ZZZ9")), 27, Gx_line+0, 57, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A764ProForCod, "")), 67, Gx_line+0, 112, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A766ProForDsc, "")), 139, Gx_line+1, 359, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4653FasForRb), "ZZZ9")), 306, Gx_line+0, 336, Gx_line+17, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+17) ;
            /* Noskip command */
            Gx_line = Gx_OldLine ;
            /* Using cursor P06UL4 */
            pr_default.execute(2, new Object[] {A396EmprCod, A764ProForCod});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A490ForPrdUMe = P06UL4_A490ForPrdUMe[0] ;
               A5358ProForClv = P06UL4_A5358ProForClv[0] ;
               A488ForPrdDsc = P06UL4_A488ForPrdDsc[0] ;
               n488ForPrdDsc = P06UL4_n488ForPrdDsc[0] ;
               A762ProForCan = P06UL4_A762ProForCan[0] ;
               A765ProForDes = P06UL4_A765ProForDes[0] ;
               A770ProForPrd = P06UL4_A770ProForPrd[0] ;
               A767ProForLin = P06UL4_A767ProForLin[0] ;
               A488ForPrdDsc = P06UL4_A488ForPrdDsc[0] ;
               n488ForPrdDsc = P06UL4_n488ForPrdDsc[0] ;
               AV25ProForClv = A6017FasClave ;
               if ( (GXutil.strcmp("", A6017FasClave)==0) )
               {
                  AV25ProForClv = A5358ProForClv ;
               }
               h6UL0( false, 17) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A767ProForLin), "ZZZ9")), 352, Gx_line+0, 382, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A770ProForPrd, "")), 392, Gx_line+0, 437, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A765ProForDes, "")), 455, Gx_line+0, 646, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A762ProForCan, "ZZZZZ9.9999")), 651, Gx_line+0, 740, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25ProForClv, "")), 834, Gx_line+0, 1054, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A488ForPrdDsc, "")), 745, Gx_line+0, 782, Gx_line+17, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               pr_default.readNext(2);
            }
            pr_default.close(2);
            h6UL0( false, 6) ;
            getPrinter().GxDrawLine(17, Gx_line+4, 993, Gx_line+4, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+6) ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         GxHdr3 = false ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6UL0( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void h6UL0( boolean bFoot ,
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
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14Lit6, "")), 27, Gx_line+65, 64, Gx_line+83, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(27, Gx_line+88, 63, Gx_line+88, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV15Lit7, "")), 67, Gx_line+65, 125, Gx_line+82, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(67, Gx_line+88, 125, Gx_line+88, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV16Lit8, "")), 139, Gx_line+65, 286, Gx_line+83, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(139, Gx_line+88, 285, Gx_line+88, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Rb", ""), 314, Gx_line+65, 330, Gx_line+82, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(306, Gx_line+88, 335, Gx_line+88, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17Lit9, "")), 352, Gx_line+65, 389, Gx_line+83, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(352, Gx_line+88, 388, Gx_line+88, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18Lit10, "")), 392, Gx_line+65, 451, Gx_line+83, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(392, Gx_line+88, 450, Gx_line+88, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19Lit11, "")), 455, Gx_line+65, 646, Gx_line+83, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(455, Gx_line+88, 645, Gx_line+88, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20Lit12, "")), 745, Gx_line+64, 819, Gx_line+82, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(745, Gx_line+89, 818, Gx_line+89, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21Lit13, "")), 658, Gx_line+65, 739, Gx_line+83, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(658, Gx_line+88, 738, Gx_line+88, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22Lit14, "")), 835, Gx_line+63, 953, Gx_line+81, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(834, Gx_line+88, 1053, Gx_line+88, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10Lit1, "")), 827, Gx_line+5, 901, Gx_line+23, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 914, Gx_line+5, 973, Gx_line+22, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV11Lit2, "")), 902, Gx_line+32, 976, Gx_line+50, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 1003, Gx_line+32, 1048, Gx_line+49, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23EmprNom, "")), 17, Gx_line+5, 331, Gx_line+25, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9Lit0, "")), 17, Gx_line+31, 435, Gx_line+51, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(17, Gx_line+56, 1053, Gx_line+56, 2, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 985, Gx_line+5, 1044, Gx_line+22, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A457FasCod, "@!")), 498, Gx_line+32, 557, Gx_line+50, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A460FasDsc, "")), 563, Gx_line+32, 768, Gx_line+50, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+93) ;
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

   protected void cleanup( )
   {
      this.aP0[0] = rfasprq.this.A396EmprCod;
      this.aP1[0] = rfasprq.this.A457FasCod;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9Lit0 = "" ;
      AV28Pgmname = "" ;
      AV10Lit1 = "" ;
      AV11Lit2 = "" ;
      AV8Lit5 = "" ;
      AV14Lit6 = "" ;
      AV15Lit7 = "" ;
      AV16Lit8 = "" ;
      AV17Lit9 = "" ;
      AV18Lit10 = "" ;
      AV19Lit11 = "" ;
      AV20Lit12 = "" ;
      AV21Lit13 = "" ;
      AV22Lit14 = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      scmdbuf = "" ;
      P06UL2_A396EmprCod = new String[] {""} ;
      P06UL2_A407EmprNom = new String[] {""} ;
      P06UL2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV23EmprNom = "" ;
      P06UL3_A396EmprCod = new String[] {""} ;
      P06UL3_A457FasCod = new String[] {""} ;
      P06UL3_A764ProForCod = new String[] {""} ;
      P06UL3_A6017FasClave = new String[] {""} ;
      P06UL3_n6017FasClave = new boolean[] {false} ;
      P06UL3_A4653FasForRb = new short[1] ;
      P06UL3_n4653FasForRb = new boolean[] {false} ;
      P06UL3_A766ProForDsc = new String[] {""} ;
      P06UL3_A4650FasForLin = new short[1] ;
      P06UL3_A460FasDsc = new String[] {""} ;
      A764ProForCod = "" ;
      A6017FasClave = "" ;
      A766ProForDsc = "" ;
      A460FasDsc = "" ;
      P06UL4_A490ForPrdUMe = new byte[1] ;
      P06UL4_A396EmprCod = new String[] {""} ;
      P06UL4_A764ProForCod = new String[] {""} ;
      P06UL4_A5358ProForClv = new String[] {""} ;
      P06UL4_A488ForPrdDsc = new String[] {""} ;
      P06UL4_n488ForPrdDsc = new boolean[] {false} ;
      P06UL4_A762ProForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06UL4_A765ProForDes = new String[] {""} ;
      P06UL4_A770ProForPrd = new String[] {""} ;
      P06UL4_A767ProForLin = new short[1] ;
      A5358ProForClv = "" ;
      A488ForPrdDsc = "" ;
      A762ProForCan = DecimalUtil.ZERO ;
      A765ProForDes = "" ;
      A770ProForPrd = "" ;
      AV25ProForClv = "" ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rfasprq__default(),
         new Object[] {
             new Object[] {
            P06UL2_A396EmprCod, P06UL2_A407EmprNom, P06UL2_n407EmprNom
            }
            , new Object[] {
            P06UL3_A396EmprCod, P06UL3_A457FasCod, P06UL3_A764ProForCod, P06UL3_A6017FasClave, P06UL3_n6017FasClave, P06UL3_A4653FasForRb, P06UL3_n4653FasForRb, P06UL3_A766ProForDsc, P06UL3_A4650FasForLin, P06UL3_A460FasDsc
            }
            , new Object[] {
            P06UL4_A490ForPrdUMe, P06UL4_A396EmprCod, P06UL4_A764ProForCod, P06UL4_A5358ProForClv, P06UL4_A488ForPrdDsc, P06UL4_n488ForPrdDsc, P06UL4_A762ProForCan, P06UL4_A765ProForDes, P06UL4_A770ProForPrd, P06UL4_A767ProForLin
            }
         }
      );
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      AV28Pgmname = "RFASPRQ" ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      AV28Pgmname = "RFASPRQ" ;
      Gx_err = (short)(0) ;
   }

   private byte A490ForPrdUMe ;
   private short A4653FasForRb ;
   private short A4650FasForLin ;
   private short A767ProForLin ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private java.math.BigDecimal A762ProForCan ;
   private String A396EmprCod ;
   private String A457FasCod ;
   private String AV9Lit0 ;
   private String AV28Pgmname ;
   private String AV10Lit1 ;
   private String AV11Lit2 ;
   private String AV8Lit5 ;
   private String AV14Lit6 ;
   private String AV15Lit7 ;
   private String AV16Lit8 ;
   private String AV17Lit9 ;
   private String AV18Lit10 ;
   private String AV19Lit11 ;
   private String AV20Lit12 ;
   private String AV21Lit13 ;
   private String AV22Lit14 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV23EmprNom ;
   private String A764ProForCod ;
   private String A6017FasClave ;
   private String A766ProForDsc ;
   private String A460FasDsc ;
   private String A5358ProForClv ;
   private String A488ForPrdDsc ;
   private String A765ProForDes ;
   private String A770ProForPrd ;
   private String AV25ProForClv ;
   private String Gx_time ;
   private java.util.Date Gx_date ;
   private boolean n407EmprNom ;
   private boolean GxHdr3 ;
   private boolean n6017FasClave ;
   private boolean n4653FasForRb ;
   private boolean n488ForPrdDsc ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P06UL2_A396EmprCod ;
   private String[] P06UL2_A407EmprNom ;
   private boolean[] P06UL2_n407EmprNom ;
   private String[] P06UL3_A396EmprCod ;
   private String[] P06UL3_A457FasCod ;
   private String[] P06UL3_A764ProForCod ;
   private String[] P06UL3_A6017FasClave ;
   private boolean[] P06UL3_n6017FasClave ;
   private short[] P06UL3_A4653FasForRb ;
   private boolean[] P06UL3_n4653FasForRb ;
   private String[] P06UL3_A766ProForDsc ;
   private short[] P06UL3_A4650FasForLin ;
   private String[] P06UL3_A460FasDsc ;
   private byte[] P06UL4_A490ForPrdUMe ;
   private String[] P06UL4_A396EmprCod ;
   private String[] P06UL4_A764ProForCod ;
   private String[] P06UL4_A5358ProForClv ;
   private String[] P06UL4_A488ForPrdDsc ;
   private boolean[] P06UL4_n488ForPrdDsc ;
   private java.math.BigDecimal[] P06UL4_A762ProForCan ;
   private String[] P06UL4_A765ProForDes ;
   private String[] P06UL4_A770ProForPrd ;
   private short[] P06UL4_A767ProForLin ;
}

final  class rfasprq__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06UL2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06UL3", "SELECT T1.EmprCod, T1.FasCod, T1.ProForCod, T1.FasClave, T1.FasForRb, T2.ProForDsc, T1.FasForLin, T3.FasDsc FROM ((TXPFASPR1 T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod) INNER JOIN TXPFASPRO T3 ON T3.EmprCod = T1.EmprCod AND T3.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.FasCod = ? ORDER BY T1.EmprCod, T1.FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06UL4", "SELECT T1.ForPrdUMe, T1.EmprCod, T1.ProForCod, T1.ProForClv, T2.ForPrdDsc, T1.ProForCan, T1.ProForDes, T1.ProForPrd, T1.ProForLin FROM (TXPLPROFO T1 INNER JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe = T1.ForPrdUMe) WHERE T1.EmprCod = ? and T1.ProForCod = ? ORDER BY T1.EmprCod, T1.ProForCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 30);
               ((short[]) buf[8])[0] = rslt.getShort(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 28);
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
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
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

