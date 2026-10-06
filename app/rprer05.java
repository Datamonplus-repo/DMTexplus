package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class rprer05 extends GXReport
{
   public rprer05( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rprer05.class ), "" );
   }

   public rprer05( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      rprer05.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      rprer05.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      rprer05.this.A4744RecPreCod = aP1[0];
      this.aP1 = aP1;
      rprer05.this.Gx_out = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      M_top = 0 ;
      M_bot = 0 ;
      P_lines = (int)(66-M_bot) ;
      getPrinter().GxClearAttris() ;
      lineHeight = 15 ;
      PrtOffset = 0 ;
      gxXPage = 100 ;
      gxYPage = 100 ;
      try
      {
         super.Gx_out = this.Gx_out ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "REPGRAF", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("RECEITA DE PREPARAÇAO") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*0)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         /* Using cursor P06QR2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P06QR2_A407EmprNom[0] ;
            n407EmprNom = P06QR2_n407EmprNom[0] ;
            AV8NomEmp = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         GxHdr3 = true ;
         /* Using cursor P06QR3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A4744RecPreCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A4746RecPreFec = P06QR3_A4746RecPreFec[0] ;
            n4746RecPreFec = P06QR3_n4746RecPreFec[0] ;
            A4745RecPreUsu = P06QR3_A4745RecPreUsu[0] ;
            n4745RecPreUsu = P06QR3_n4745RecPreUsu[0] ;
            A4747RecPreVol = P06QR3_A4747RecPreVol[0] ;
            n4747RecPreVol = P06QR3_n4747RecPreVol[0] ;
            A4642FasDsc2 = P06QR3_A4642FasDsc2[0] ;
            n4642FasDsc2 = P06QR3_n4642FasDsc2[0] ;
            A460FasDsc = P06QR3_A460FasDsc[0] ;
            A457FasCod = P06QR3_A457FasCod[0] ;
            n457FasCod = P06QR3_n457FasCod[0] ;
            A4642FasDsc2 = P06QR3_A4642FasDsc2[0] ;
            n4642FasDsc2 = P06QR3_n4642FasDsc2[0] ;
            A460FasDsc = P06QR3_A460FasDsc[0] ;
            /* Using cursor P06QR4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A4744RecPreCod)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A4762RecPreLin = P06QR4_A4762RecPreLin[0] ;
               A4715ProForDsc2 = P06QR4_A4715ProForDsc2[0] ;
               A766ProForDsc = P06QR4_A766ProForDsc[0] ;
               A764ProForCod = P06QR4_A764ProForCod[0] ;
               n764ProForCod = P06QR4_n764ProForCod[0] ;
               A4715ProForDsc2 = P06QR4_A4715ProForDsc2[0] ;
               A766ProForDsc = P06QR4_A766ProForDsc[0] ;
               h6QR0( false, 41) ;
               getPrinter().GxDrawRect(27, Gx_line+10, 773, Gx_line+38, 1, 192, 192, 192, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Processo", ""), 54, Gx_line+17, 114, Gx_line+34, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A764ProForCod, "")), 135, Gx_line+17, 186, Gx_line+35, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A766ProForDsc, "")), 203, Gx_line+17, 454, Gx_line+35, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4715ProForDsc2, "")), 379, Gx_line+17, 713, Gx_line+35, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+41) ;
               /* Using cursor P06QR5 */
               pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A4744RecPreCod), Short.valueOf(A4762RecPreLin)});
               while ( (pr_default.getStatus(3) != 101) )
               {
                  A490ForPrdUMe = P06QR5_A490ForPrdUMe[0] ;
                  n490ForPrdUMe = P06QR5_n490ForPrdUMe[0] ;
                  A4769RecPreCan2 = P06QR5_A4769RecPreCan2[0] ;
                  n4769RecPreCan2 = P06QR5_n4769RecPreCan2[0] ;
                  A488ForPrdDsc = P06QR5_A488ForPrdDsc[0] ;
                  n488ForPrdDsc = P06QR5_n488ForPrdDsc[0] ;
                  A4768RecPreCan1 = P06QR5_A4768RecPreCan1[0] ;
                  n4768RecPreCan1 = P06QR5_n4768RecPreCan1[0] ;
                  A718PrdNom = P06QR5_A718PrdNom[0] ;
                  A719PrdNum = P06QR5_A719PrdNum[0] ;
                  n719PrdNum = P06QR5_n719PrdNum[0] ;
                  A4763RecPreNli = P06QR5_A4763RecPreNli[0] ;
                  A718PrdNom = P06QR5_A718PrdNom[0] ;
                  A488ForPrdDsc = P06QR5_A488ForPrdDsc[0] ;
                  n488ForPrdDsc = P06QR5_n488ForPrdDsc[0] ;
                  h6QR0( false, 17) ;
                  getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 81, Gx_line+0, 132, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 149, Gx_line+0, 367, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A4768RecPreCan1, "ZZZZZ9.999")), 379, Gx_line+0, 463, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A488ForPrdDsc, "")), 474, Gx_line+0, 517, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A4769RecPreCan2, "ZZZZZZ9.999")), 555, Gx_line+0, 648, Gx_line+18, 2+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+17) ;
                  pr_default.readNext(3);
               }
               pr_default.close(3);
               pr_default.readNext(2);
            }
            pr_default.close(2);
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         GxHdr3 = false ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6QR0( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void h6QR0( boolean bFoot ,
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
               getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV8NomEmp, "")), 10, Gx_line+11, 261, Gx_line+32, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Receita de Preparaçao Nº", ""), 10, Gx_line+47, 213, Gx_line+67, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 664, Gx_line+50, 715, Gx_line+68, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Pagina", ""), 614, Gx_line+50, 662, Gx_line+67, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Data", ""), 625, Gx_line+15, 656, Gx_line+32, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 661, Gx_line+15, 729, Gx_line+33, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Hora", ""), 469, Gx_line+15, 501, Gx_line+32, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 509, Gx_line+15, 577, Gx_line+33, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(14, Gx_line+68, 773, Gx_line+68, 2, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 14, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4744RecPreCod), "ZZZZZZZ9")), 257, Gx_line+50, 341, Gx_line+76, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+81) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Fase", ""), 27, Gx_line+14, 59, Gx_line+31, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A457FasCod, "@!")), 68, Gx_line+15, 136, Gx_line+33, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A460FasDsc, "")), 149, Gx_line+15, 383, Gx_line+33, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4642FasDsc2, "")), 149, Gx_line+27, 650, Gx_line+45, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Volume", ""), 41, Gx_line+68, 92, Gx_line+85, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4747RecPreVol), "ZZZZ9")), 98, Gx_line+69, 141, Gx_line+87, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Litros", ""), 149, Gx_line+68, 186, Gx_line+85, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Produto", ""), 81, Gx_line+107, 134, Gx_line+124, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Nome", ""), 149, Gx_line+107, 189, Gx_line+124, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Factor", ""), 420, Gx_line+107, 463, Gx_line+124, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Quantidad", ""), 578, Gx_line+95, 648, Gx_line+112, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "a Pesar", ""), 596, Gx_line+107, 647, Gx_line+124, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(27, Gx_line+95, 773, Gx_line+137, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4745RecPreUsu, "@!")), 653, Gx_line+55, 721, Gx_line+73, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Usuario", ""), 592, Gx_line+54, 643, Gx_line+71, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Data/Hora", ""), 569, Gx_line+68, 636, Gx_line+85, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( A4746RecPreFec, "99/99/99 99:99"), 653, Gx_line+68, 771, Gx_line+86, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(555, Gx_line+54, 773, Gx_line+96, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawRect(27, Gx_line+54, 204, Gx_line+96, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+149) ;
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
      this.aP0[0] = rprer05.this.A396EmprCod;
      this.aP1[0] = rprer05.this.A4744RecPreCod;
      this.aP2[0] = rprer05.this.Gx_out;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P06QR2_A396EmprCod = new String[] {""} ;
      P06QR2_A407EmprNom = new String[] {""} ;
      P06QR2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV8NomEmp = "" ;
      P06QR3_A396EmprCod = new String[] {""} ;
      P06QR3_A4744RecPreCod = new int[1] ;
      P06QR3_A4746RecPreFec = new java.util.Date[] {GXutil.nullDate()} ;
      P06QR3_n4746RecPreFec = new boolean[] {false} ;
      P06QR3_A4745RecPreUsu = new String[] {""} ;
      P06QR3_n4745RecPreUsu = new boolean[] {false} ;
      P06QR3_A4747RecPreVol = new int[1] ;
      P06QR3_n4747RecPreVol = new boolean[] {false} ;
      P06QR3_A4642FasDsc2 = new String[] {""} ;
      P06QR3_n4642FasDsc2 = new boolean[] {false} ;
      P06QR3_A460FasDsc = new String[] {""} ;
      P06QR3_A457FasCod = new String[] {""} ;
      P06QR3_n457FasCod = new boolean[] {false} ;
      A4746RecPreFec = GXutil.resetTime( GXutil.nullDate() );
      A4745RecPreUsu = "" ;
      A4642FasDsc2 = "" ;
      A460FasDsc = "" ;
      A457FasCod = "" ;
      P06QR4_A396EmprCod = new String[] {""} ;
      P06QR4_A4744RecPreCod = new int[1] ;
      P06QR4_A4762RecPreLin = new short[1] ;
      P06QR4_A4715ProForDsc2 = new String[] {""} ;
      P06QR4_A766ProForDsc = new String[] {""} ;
      P06QR4_A764ProForCod = new String[] {""} ;
      P06QR4_n764ProForCod = new boolean[] {false} ;
      A4715ProForDsc2 = "" ;
      A766ProForDsc = "" ;
      A764ProForCod = "" ;
      P06QR5_A490ForPrdUMe = new byte[1] ;
      P06QR5_n490ForPrdUMe = new boolean[] {false} ;
      P06QR5_A396EmprCod = new String[] {""} ;
      P06QR5_A4744RecPreCod = new int[1] ;
      P06QR5_A4762RecPreLin = new short[1] ;
      P06QR5_A4769RecPreCan2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06QR5_n4769RecPreCan2 = new boolean[] {false} ;
      P06QR5_A488ForPrdDsc = new String[] {""} ;
      P06QR5_n488ForPrdDsc = new boolean[] {false} ;
      P06QR5_A4768RecPreCan1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06QR5_n4768RecPreCan1 = new boolean[] {false} ;
      P06QR5_A718PrdNom = new String[] {""} ;
      P06QR5_A719PrdNum = new String[] {""} ;
      P06QR5_n719PrdNum = new boolean[] {false} ;
      P06QR5_A4763RecPreNli = new short[1] ;
      A4769RecPreCan2 = DecimalUtil.ZERO ;
      A488ForPrdDsc = "" ;
      A4768RecPreCan1 = DecimalUtil.ZERO ;
      A718PrdNom = "" ;
      A719PrdNum = "" ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rprer05__default(),
         new Object[] {
             new Object[] {
            P06QR2_A396EmprCod, P06QR2_A407EmprNom, P06QR2_n407EmprNom
            }
            , new Object[] {
            P06QR3_A396EmprCod, P06QR3_A4744RecPreCod, P06QR3_A4746RecPreFec, P06QR3_n4746RecPreFec, P06QR3_A4745RecPreUsu, P06QR3_n4745RecPreUsu, P06QR3_A4747RecPreVol, P06QR3_n4747RecPreVol, P06QR3_A4642FasDsc2, P06QR3_n4642FasDsc2,
            P06QR3_A460FasDsc, P06QR3_A457FasCod, P06QR3_n457FasCod
            }
            , new Object[] {
            P06QR4_A396EmprCod, P06QR4_A4744RecPreCod, P06QR4_A4762RecPreLin, P06QR4_A4715ProForDsc2, P06QR4_A766ProForDsc, P06QR4_A764ProForCod, P06QR4_n764ProForCod
            }
            , new Object[] {
            P06QR5_A490ForPrdUMe, P06QR5_n490ForPrdUMe, P06QR5_A396EmprCod, P06QR5_A4744RecPreCod, P06QR5_A4762RecPreLin, P06QR5_A4769RecPreCan2, P06QR5_n4769RecPreCan2, P06QR5_A488ForPrdDsc, P06QR5_n488ForPrdDsc, P06QR5_A4768RecPreCan1,
            P06QR5_n4768RecPreCan1, P06QR5_A718PrdNom, P06QR5_A719PrdNum, P06QR5_n719PrdNum, P06QR5_A4763RecPreNli
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

   private byte A490ForPrdUMe ;
   private short A4762RecPreLin ;
   private short A4763RecPreNli ;
   private short Gx_err ;
   private int A4744RecPreCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A4747RecPreVol ;
   private int Gx_OldLine ;
   private java.math.BigDecimal A4769RecPreCan2 ;
   private java.math.BigDecimal A4768RecPreCan1 ;
   private String A396EmprCod ;
   private String Gx_out ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV8NomEmp ;
   private String A4745RecPreUsu ;
   private String A4642FasDsc2 ;
   private String A460FasDsc ;
   private String A457FasCod ;
   private String A4715ProForDsc2 ;
   private String A766ProForDsc ;
   private String A764ProForCod ;
   private String A488ForPrdDsc ;
   private String A718PrdNom ;
   private String A719PrdNum ;
   private String Gx_time ;
   private java.util.Date A4746RecPreFec ;
   private java.util.Date Gx_date ;
   private boolean n407EmprNom ;
   private boolean GxHdr3 ;
   private boolean n4746RecPreFec ;
   private boolean n4745RecPreUsu ;
   private boolean n4747RecPreVol ;
   private boolean n4642FasDsc2 ;
   private boolean n457FasCod ;
   private boolean n764ProForCod ;
   private boolean n490ForPrdUMe ;
   private boolean n4769RecPreCan2 ;
   private boolean n488ForPrdDsc ;
   private boolean n4768RecPreCan1 ;
   private boolean n719PrdNum ;
   private String[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P06QR2_A396EmprCod ;
   private String[] P06QR2_A407EmprNom ;
   private boolean[] P06QR2_n407EmprNom ;
   private String[] P06QR3_A396EmprCod ;
   private int[] P06QR3_A4744RecPreCod ;
   private java.util.Date[] P06QR3_A4746RecPreFec ;
   private boolean[] P06QR3_n4746RecPreFec ;
   private String[] P06QR3_A4745RecPreUsu ;
   private boolean[] P06QR3_n4745RecPreUsu ;
   private int[] P06QR3_A4747RecPreVol ;
   private boolean[] P06QR3_n4747RecPreVol ;
   private String[] P06QR3_A4642FasDsc2 ;
   private boolean[] P06QR3_n4642FasDsc2 ;
   private String[] P06QR3_A460FasDsc ;
   private String[] P06QR3_A457FasCod ;
   private boolean[] P06QR3_n457FasCod ;
   private String[] P06QR4_A396EmprCod ;
   private int[] P06QR4_A4744RecPreCod ;
   private short[] P06QR4_A4762RecPreLin ;
   private String[] P06QR4_A4715ProForDsc2 ;
   private String[] P06QR4_A766ProForDsc ;
   private String[] P06QR4_A764ProForCod ;
   private boolean[] P06QR4_n764ProForCod ;
   private byte[] P06QR5_A490ForPrdUMe ;
   private boolean[] P06QR5_n490ForPrdUMe ;
   private String[] P06QR5_A396EmprCod ;
   private int[] P06QR5_A4744RecPreCod ;
   private short[] P06QR5_A4762RecPreLin ;
   private java.math.BigDecimal[] P06QR5_A4769RecPreCan2 ;
   private boolean[] P06QR5_n4769RecPreCan2 ;
   private String[] P06QR5_A488ForPrdDsc ;
   private boolean[] P06QR5_n488ForPrdDsc ;
   private java.math.BigDecimal[] P06QR5_A4768RecPreCan1 ;
   private boolean[] P06QR5_n4768RecPreCan1 ;
   private String[] P06QR5_A718PrdNom ;
   private String[] P06QR5_A719PrdNum ;
   private boolean[] P06QR5_n719PrdNum ;
   private short[] P06QR5_A4763RecPreNli ;
}

final  class rprer05__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06QR2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06QR3", "SELECT T1.EmprCod, T1.RecPreCod, T1.RecPreFec, T1.RecPreUsu, T1.RecPreVol, T2.FasDsc2, T2.FasDsc, T1.FasCod FROM (TXPPREREC T1 LEFT JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.RecPreCod = ? ORDER BY T1.EmprCod, T1.RecPreCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06QR4", "SELECT T1.EmprCod, T1.RecPreCod, T1.RecPreLin, T2.ProForDsc2, T2.ProForDsc, T1.ProForCod FROM (TXPPRERE1 T1 LEFT JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod) WHERE T1.EmprCod = ? and T1.RecPreCod = ? ORDER BY T1.EmprCod, T1.RecPreCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06QR5", "SELECT T1.ForPrdUMe, T1.EmprCod, T1.RecPreCod, T1.RecPreLin, T1.RecPreCan2, T3.ForPrdDsc, T1.RecPreCan1, T2.PrdNom, T1.PrdNum, T1.RecPreNli FROM ((TXPPRERLN T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) LEFT JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod AND T3.ForPrdUMe = T1.ForPrdUMe) WHERE T1.EmprCod = ? and T1.RecPreCod = ? and T1.RecPreLin = ? ORDER BY T1.EmprCod, T1.RecPreCod, T1.RecPreLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 8);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 60);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 28);
               ((String[]) buf[11])[0] = rslt.getString(8, 8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 3 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,3);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,3);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 26);
               ((String[]) buf[12])[0] = rslt.getString(9, 6);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(10);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
   }

}

