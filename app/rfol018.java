package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class rfol018 extends GXReport
{
   public rfol018( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rfol018.class ), "" );
   }

   public rfol018( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 )
   {
      rfol018.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      rfol018.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      rfol018.this.AV15ImpCod = aP1[0];
      this.aP1 = aP1;
      rfol018.this.AV16PProc = aP2[0];
      this.aP2 = aP2;
      rfol018.this.AV17UProc = aP3[0];
      this.aP3 = aP3;
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
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "REPGRAF", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("LISTADO PROCESOS QUIMICOS") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*1)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXt_char1 = AV19Lit0 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT563_", ""), (byte)(99), GXv_char2) ;
         rfol018.this.GXt_char1 = GXv_char2[0] ;
         AV19Lit0 = GXt_char1 ;
         GXt_char1 = AV20Lit1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         rfol018.this.GXt_char1 = GXv_char2[0] ;
         AV20Lit1 = GXt_char1 ;
         GXt_char1 = AV21Lit2 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char2) ;
         rfol018.this.GXt_char1 = GXv_char2[0] ;
         AV21Lit2 = GXt_char1 ;
         GXt_char1 = AV22Lit3 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char2) ;
         rfol018.this.GXt_char1 = GXv_char2[0] ;
         AV22Lit3 = GXt_char1 ;
         GXt_char1 = AV23Lit4 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1326_", ""), (byte)(99), GXv_char2) ;
         rfol018.this.GXt_char1 = GXv_char2[0] ;
         AV23Lit4 = GXt_char1 ;
         GXt_char1 = AV24Lit5 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2454_", ""), (byte)(99), GXv_char2) ;
         rfol018.this.GXt_char1 = GXv_char2[0] ;
         AV24Lit5 = GXt_char1 ;
         GXt_char1 = AV25Lit6 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2462_", ""), (byte)(99), GXv_char2) ;
         rfol018.this.GXt_char1 = GXv_char2[0] ;
         AV25Lit6 = GXt_char1 ;
         GXt_char1 = AV26Lit7 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2283_", ""), (byte)(99), GXv_char2) ;
         rfol018.this.GXt_char1 = GXv_char2[0] ;
         AV26Lit7 = GXt_char1 ;
         GXt_char1 = AV27Lit8 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2310_", ""), (byte)(99), GXv_char2) ;
         rfol018.this.GXt_char1 = GXv_char2[0] ;
         AV27Lit8 = GXt_char1 ;
         GXt_char1 = AV28Lit9 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN185_", ""), (byte)(99), GXv_char2) ;
         rfol018.this.GXt_char1 = GXv_char2[0] ;
         AV28Lit9 = GXt_char1 ;
         GXt_char1 = AV29Lit10 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2095_", ""), (byte)(99), GXv_char2) ;
         rfol018.this.GXt_char1 = GXv_char2[0] ;
         AV29Lit10 = GXt_char1 ;
         GXt_char1 = AV30Lit11 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2525_", ""), (byte)(99), GXv_char2) ;
         rfol018.this.GXt_char1 = GXv_char2[0] ;
         AV30Lit11 = GXt_char1 ;
         GXt_char1 = AV31Lit12 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN188_", ""), (byte)(99), GXv_char2) ;
         rfol018.this.GXt_char1 = GXv_char2[0] ;
         AV31Lit12 = GXt_char1 ;
         GXt_char1 = AV32Lit13 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN368_", ""), (byte)(99), GXv_char2) ;
         rfol018.this.GXt_char1 = GXv_char2[0] ;
         AV32Lit13 = GXt_char1 ;
         GXt_char1 = AV33Lit14 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT3003_", ""), (byte)(99), GXv_char2) ;
         rfol018.this.GXt_char1 = GXv_char2[0] ;
         AV33Lit14 = GXt_char1 ;
         GXt_char1 = AV34Lit15 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT3004_", ""), (byte)(99), GXv_char2) ;
         rfol018.this.GXt_char1 = GXv_char2[0] ;
         AV34Lit15 = GXt_char1 ;
         AV38Lit16 = " " ;
         /* Using cursor P06UI2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P06UI2_A407EmprNom[0] ;
            n407EmprNom = P06UI2_n407EmprNom[0] ;
            AV18NomEmp = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         GxHdr3 = true ;
         /* Using cursor P06UI3 */
         pr_default.execute(1, new Object[] {A396EmprCod, AV16PProc, AV17UProc});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A764ProForCod = P06UI3_A764ProForCod[0] ;
            A2393ProNumRec = P06UI3_A2393ProNumRec[0] ;
            A2392ProNumPro = P06UI3_A2392ProNumPro[0] ;
            A772ProForTmx = P06UI3_A772ProForTmx[0] ;
            A771ProForTie = P06UI3_A771ProForTie[0] ;
            A766ProForDsc = P06UI3_A766ProForDsc[0] ;
            /* Using cursor P06UI4 */
            pr_default.execute(2, new Object[] {A396EmprCod, A764ProForCod});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A490ForPrdUMe = P06UI4_A490ForPrdUMe[0] ;
               A762ProForCan = P06UI4_A762ProForCan[0] ;
               A1645ProForNro = P06UI4_A1645ProForNro[0] ;
               A488ForPrdDsc = P06UI4_A488ForPrdDsc[0] ;
               n488ForPrdDsc = P06UI4_n488ForPrdDsc[0] ;
               A5358ProForClv = P06UI4_A5358ProForClv[0] ;
               A765ProForDes = P06UI4_A765ProForDes[0] ;
               A770ProForPrd = P06UI4_A770ProForPrd[0] ;
               A767ProForLin = P06UI4_A767ProForLin[0] ;
               A488ForPrdDsc = P06UI4_A488ForPrdDsc[0] ;
               n488ForPrdDsc = P06UI4_n488ForPrdDsc[0] ;
               AV37ProForCan = A762ProForCan ;
               if ( (0==A1645ProForNro) )
               {
                  AV35ProForNro = " " ;
               }
               else
               {
                  AV35ProForNro = GXutil.str( A1645ProForNro, 2, 0) ;
               }
               if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A762ProForCan)==0) )
               {
                  h6UI0( false, 17) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A767ProForLin), "ZZZ9")), 14, Gx_line+0, 44, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A770ProForPrd, "")), 77, Gx_line+0, 122, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A765ProForDes, "")), 140, Gx_line+0, 331, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV37ProForCan, "ZZZZZ9.99999")), 350, Gx_line+0, 439, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35ProForNro, "")), 516, Gx_line+0, 532, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5358ProForClv, "")), 549, Gx_line+0, 769, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A488ForPrdDsc, "")), 459, Gx_line+0, 496, Gx_line+17, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+17) ;
               }
               else
               {
                  h6UI0( false, 17) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A767ProForLin), "ZZZ9")), 14, Gx_line+0, 44, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A770ProForPrd, "")), 77, Gx_line+0, 122, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A765ProForDes, "")), 140, Gx_line+0, 331, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35ProForNro, "")), 516, Gx_line+0, 532, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5358ProForClv, "")), 549, Gx_line+0, 769, Gx_line+17, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+17) ;
               }
               pr_default.readNext(2);
            }
            pr_default.close(2);
            /* Eject command */
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(P_lines+1) ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         GxHdr3 = false ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6UI0( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void h6UI0( boolean bFoot ,
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
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(":", 496, Gx_line+16, 501, Gx_line+30, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 643, Gx_line+16, 648, Gx_line+30, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18NomEmp, "")), 17, Gx_line+17, 206, Gx_line+35, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20Lit1, "")), 433, Gx_line+16, 497, Gx_line+33, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 501, Gx_line+16, 560, Gx_line+33, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21Lit2, "")), 590, Gx_line+16, 641, Gx_line+33, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 649, Gx_line+16, 708, Gx_line+33, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22Lit3, "")), 590, Gx_line+50, 666, Gx_line+67, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 697, Gx_line+50, 742, Gx_line+67, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Lit4, "")), 17, Gx_line+94, 69, Gx_line+112, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A764ProForCod, "")), 117, Gx_line+94, 162, Gx_line+111, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A766ProForDsc, "")), 168, Gx_line+94, 388, Gx_line+111, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24Lit5, "")), 17, Gx_line+117, 98, Gx_line+135, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A771ProForTie), "ZZZ9")), 116, Gx_line+117, 146, Gx_line+134, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25Lit6, "")), 174, Gx_line+117, 233, Gx_line+135, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A772ProForTmx), "ZZZ9")), 254, Gx_line+117, 284, Gx_line+134, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33Lit14, "")), 298, Gx_line+117, 372, Gx_line+135, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2392ProNumPro), "ZZZZ9")), 378, Gx_line+117, 415, Gx_line+134, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34Lit15, "")), 416, Gx_line+117, 475, Gx_line+135, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2393ProNumRec), "ZZZZ9")), 496, Gx_line+117, 533, Gx_line+134, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Nº", ""), 516, Gx_line+150, 532, Gx_line+167, 1+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27Lit8, "")), 14, Gx_line+150, 51, Gx_line+168, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28Lit9, "")), 77, Gx_line+150, 122, Gx_line+168, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29Lit10, "")), 140, Gx_line+150, 294, Gx_line+168, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30Lit11, "")), 464, Gx_line+150, 494, Gx_line+168, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31Lit12, "")), 379, Gx_line+150, 438, Gx_line+168, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32Lit13, "")), 640, Gx_line+150, 677, Gx_line+168, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49Pgmname, "")), 433, Gx_line+50, 653, Gx_line+67, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19Lit0, "")), 17, Gx_line+50, 174, Gx_line+68, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(11, Gx_line+10, 768, Gx_line+10, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(11, Gx_line+78, 768, Gx_line+78, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(7, Gx_line+142, 764, Gx_line+142, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(14, Gx_line+170, 50, Gx_line+170, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(77, Gx_line+170, 121, Gx_line+170, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(140, Gx_line+172, 330, Gx_line+172, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(459, Gx_line+172, 495, Gx_line+172, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(350, Gx_line+172, 438, Gx_line+172, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(516, Gx_line+172, 531, Gx_line+172, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(549, Gx_line+172, 768, Gx_line+172, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+176) ;
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
      this.aP0[0] = rfol018.this.A396EmprCod;
      this.aP1[0] = rfol018.this.AV15ImpCod;
      this.aP2[0] = rfol018.this.AV16PProc;
      this.aP3[0] = rfol018.this.AV17UProc;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV19Lit0 = "" ;
      AV20Lit1 = "" ;
      AV21Lit2 = "" ;
      AV22Lit3 = "" ;
      AV23Lit4 = "" ;
      AV24Lit5 = "" ;
      AV25Lit6 = "" ;
      AV26Lit7 = "" ;
      AV27Lit8 = "" ;
      AV28Lit9 = "" ;
      AV29Lit10 = "" ;
      AV30Lit11 = "" ;
      AV31Lit12 = "" ;
      AV32Lit13 = "" ;
      AV33Lit14 = "" ;
      AV34Lit15 = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV38Lit16 = "" ;
      scmdbuf = "" ;
      P06UI2_A396EmprCod = new String[] {""} ;
      P06UI2_A407EmprNom = new String[] {""} ;
      P06UI2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV18NomEmp = "" ;
      P06UI3_A396EmprCod = new String[] {""} ;
      P06UI3_A764ProForCod = new String[] {""} ;
      P06UI3_A2393ProNumRec = new int[1] ;
      P06UI3_A2392ProNumPro = new int[1] ;
      P06UI3_A772ProForTmx = new short[1] ;
      P06UI3_A771ProForTie = new short[1] ;
      P06UI3_A766ProForDsc = new String[] {""} ;
      A764ProForCod = "" ;
      A766ProForDsc = "" ;
      P06UI4_A490ForPrdUMe = new byte[1] ;
      P06UI4_A396EmprCod = new String[] {""} ;
      P06UI4_A764ProForCod = new String[] {""} ;
      P06UI4_A762ProForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06UI4_A1645ProForNro = new byte[1] ;
      P06UI4_A488ForPrdDsc = new String[] {""} ;
      P06UI4_n488ForPrdDsc = new boolean[] {false} ;
      P06UI4_A5358ProForClv = new String[] {""} ;
      P06UI4_A765ProForDes = new String[] {""} ;
      P06UI4_A770ProForPrd = new String[] {""} ;
      P06UI4_A767ProForLin = new short[1] ;
      A762ProForCan = DecimalUtil.ZERO ;
      A488ForPrdDsc = "" ;
      A5358ProForClv = "" ;
      A765ProForDes = "" ;
      A770ProForPrd = "" ;
      AV37ProForCan = DecimalUtil.ZERO ;
      AV35ProForNro = "" ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      AV49Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rfol018__default(),
         new Object[] {
             new Object[] {
            P06UI2_A396EmprCod, P06UI2_A407EmprNom, P06UI2_n407EmprNom
            }
            , new Object[] {
            P06UI3_A396EmprCod, P06UI3_A764ProForCod, P06UI3_A2393ProNumRec, P06UI3_A2392ProNumPro, P06UI3_A772ProForTmx, P06UI3_A771ProForTie, P06UI3_A766ProForDsc
            }
            , new Object[] {
            P06UI4_A490ForPrdUMe, P06UI4_A396EmprCod, P06UI4_A764ProForCod, P06UI4_A762ProForCan, P06UI4_A1645ProForNro, P06UI4_A488ForPrdDsc, P06UI4_n488ForPrdDsc, P06UI4_A5358ProForClv, P06UI4_A765ProForDes, P06UI4_A770ProForPrd,
            P06UI4_A767ProForLin
            }
         }
      );
      AV49Pgmname = "RFOL018" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      AV49Pgmname = "RFOL018" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte A490ForPrdUMe ;
   private byte A1645ProForNro ;
   private short A772ProForTmx ;
   private short A771ProForTie ;
   private short A767ProForLin ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A2393ProNumRec ;
   private int A2392ProNumPro ;
   private int Gx_OldLine ;
   private java.math.BigDecimal A762ProForCan ;
   private java.math.BigDecimal AV37ProForCan ;
   private String A396EmprCod ;
   private String AV15ImpCod ;
   private String AV16PProc ;
   private String AV17UProc ;
   private String AV19Lit0 ;
   private String AV20Lit1 ;
   private String AV21Lit2 ;
   private String AV22Lit3 ;
   private String AV23Lit4 ;
   private String AV24Lit5 ;
   private String AV25Lit6 ;
   private String AV26Lit7 ;
   private String AV27Lit8 ;
   private String AV28Lit9 ;
   private String AV29Lit10 ;
   private String AV30Lit11 ;
   private String AV31Lit12 ;
   private String AV32Lit13 ;
   private String AV33Lit14 ;
   private String AV34Lit15 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV38Lit16 ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV18NomEmp ;
   private String A764ProForCod ;
   private String A766ProForDsc ;
   private String A488ForPrdDsc ;
   private String A5358ProForClv ;
   private String A765ProForDes ;
   private String A770ProForPrd ;
   private String AV35ProForNro ;
   private String Gx_time ;
   private String AV49Pgmname ;
   private java.util.Date Gx_date ;
   private boolean n407EmprNom ;
   private boolean GxHdr3 ;
   private boolean n488ForPrdDsc ;
   private String[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P06UI2_A396EmprCod ;
   private String[] P06UI2_A407EmprNom ;
   private boolean[] P06UI2_n407EmprNom ;
   private String[] P06UI3_A396EmprCod ;
   private String[] P06UI3_A764ProForCod ;
   private int[] P06UI3_A2393ProNumRec ;
   private int[] P06UI3_A2392ProNumPro ;
   private short[] P06UI3_A772ProForTmx ;
   private short[] P06UI3_A771ProForTie ;
   private String[] P06UI3_A766ProForDsc ;
   private byte[] P06UI4_A490ForPrdUMe ;
   private String[] P06UI4_A396EmprCod ;
   private String[] P06UI4_A764ProForCod ;
   private java.math.BigDecimal[] P06UI4_A762ProForCan ;
   private byte[] P06UI4_A1645ProForNro ;
   private String[] P06UI4_A488ForPrdDsc ;
   private boolean[] P06UI4_n488ForPrdDsc ;
   private String[] P06UI4_A5358ProForClv ;
   private String[] P06UI4_A765ProForDes ;
   private String[] P06UI4_A770ProForPrd ;
   private short[] P06UI4_A767ProForLin ;
}

final  class rfol018__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06UI2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06UI3", "SELECT EmprCod, ProForCod, ProNumRec, ProNumPro, ProForTmx, ProForTie, ProForDsc FROM TXPCPROFO WHERE (EmprCod = ? and ProForCod >= ?) AND (ProForCod <= ?) ORDER BY EmprCod, ProForCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06UI4", "SELECT T1.ForPrdUMe, T1.EmprCod, T1.ProForCod, T1.ProForCan, T1.ProForNro, T2.ForPrdDsc, T1.ProForClv, T1.ProForDes, T1.ProForPrd, T1.ProForLin FROM (TXPLPROFO T1 INNER JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe = T1.ForPrdUMe) WHERE T1.EmprCod = ? and T1.ProForCod = ? ORDER BY T1.EmprCod, T1.ProForCod, T1.ProForLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 30);
               ((String[]) buf[8])[0] = rslt.getString(8, 26);
               ((String[]) buf[9])[0] = rslt.getString(9, 6);
               ((short[]) buf[10])[0] = rslt.getShort(10);
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

