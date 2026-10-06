package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class rtalaro extends GXReport
{
   public rtalaro( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rtalaro.class ), "" );
   }

   public rtalaro( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             java.util.Date[] aP2 ,
                             int[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             int[] aP8 ,
                             short[] aP9 ,
                             String[] aP10 )
   {
      rtalaro.this.aP11 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
      return aP11[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        java.util.Date[] aP2 ,
                        int[] aP3 ,
                        String[] aP4 ,
                        short[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        int[] aP8 ,
                        short[] aP9 ,
                        String[] aP10 ,
                        String[] aP11 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             java.util.Date[] aP2 ,
                             int[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             int[] aP8 ,
                             short[] aP9 ,
                             String[] aP10 ,
                             String[] aP11 )
   {
      rtalaro.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      rtalaro.this.A910Workstat = aP1[0];
      this.aP1 = aP1;
      rtalaro.this.AV32Fecha = aP2[0];
      this.aP2 = aP2;
      rtalaro.this.AV33CliCod = aP3[0];
      this.aP3 = aP3;
      rtalaro.this.AV34CliNom = aP4[0];
      this.aP4 = aP4;
      rtalaro.this.AV35TipArtCod = aP5[0];
      this.aP5 = aP5;
      rtalaro.this.AV36TipArtDsc = aP6[0];
      this.aP6 = aP6;
      rtalaro.this.AV37ForColNom = aP7[0];
      this.aP7 = aP7;
      rtalaro.this.AV38ForColNum = aP8[0];
      this.aP8 = aP8;
      rtalaro.this.AV44Minutos = aP9[0];
      this.aP9 = aP9;
      rtalaro.this.AV39Observa = aP10[0];
      this.aP10 = aP10;
      rtalaro.this.AV52CruDsc = aP11[0];
      this.aP11 = aP11;
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
         Gx_out = "PRN" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "RTARLAB", "", 2, 1, 256, 8395, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("TARJETA LABORATORIO(Rontaltex)") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*0)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GX_I = 1 ;
         while ( GX_I <= 4 )
         {
            AV47Tabla_Col[GX_I-1] = (byte)(0) ;
            GX_I = (int)(GX_I+1) ;
         }
         /* Using cursor P07392 */
         pr_default.execute(0, new Object[] {A396EmprCod, A910Workstat});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A885EscMVol = P07392_A885EscMVol[0] ;
            n885EscMVol = P07392_n885EscMVol[0] ;
            AV45Temp = A885EscMVol ;
            AV43Color = (byte)(0) ;
            AV49NLin = (byte)(1) ;
            /* Using cursor P07393 */
            pr_default.execute(1, new Object[] {A396EmprCod, A910Workstat});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A490ForPrdUMe = P07393_A490ForPrdUMe[0] ;
               A897EscMDsc = P07393_A897EscMDsc[0] ;
               A719PrdNum = P07393_A719PrdNum[0] ;
               A890EscMCan = P07393_A890EscMCan[0] ;
               A488ForPrdDsc = P07393_A488ForPrdDsc[0] ;
               n488ForPrdDsc = P07393_n488ForPrdDsc[0] ;
               A887EscMLin = P07393_A887EscMLin[0] ;
               A488ForPrdDsc = P07393_A488ForPrdDsc[0] ;
               n488ForPrdDsc = P07393_n488ForPrdDsc[0] ;
               AV41Asterisco = " " ;
               if ( ! (GXutil.strcmp("", A719PrdNum)==0) || (GXutil.strcmp("", A897EscMDsc)==0) )
               {
                  AV41Asterisco = "*" ;
               }
               AV51EscMCan = A890EscMCan ;
               if ( ( ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "1") >= 0 ) && ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "7") <= 0 ) ) || (GXutil.strcmp("", A897EscMDsc)==0) )
               {
                  AV42TipColCod = (byte)(GXutil.lval( GXutil.substring( A719PrdNum, 1, 2))) ;
                  /* Execute user subroutine: 'TIPCOLOR' */
                  S121 ();
                  if ( returnInSub )
                  {
                     pr_default.close(1);
                     pr_default.close(1);
                     pr_default.close(0);
                     getPrinter().GxEndPage() ;
                     /* Close printer file */
                     getPrinter().GxEndDocument() ;
                     endPrinter();
                     returnInSub = true;
                     cleanup();
                     if (true) return;
                  }
                  if ( AV43Color == 0 )
                  {
                     h7390( false, 6) ;
                     getPrinter().GxDrawLine(40, Gx_line+0, 466, Gx_line+0, 2, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(466, Gx_line+1, 466, Gx_line+6, 2, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(625, Gx_line+0, 625, Gx_line+6, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(476, Gx_line+0, 476, Gx_line+6, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(543, Gx_line+0, 543, Gx_line+6, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(693, Gx_line+0, 693, Gx_line+6, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(727, Gx_line+0, 727, Gx_line+6, 2, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(29, Gx_line+0, 29, Gx_line+6, 2, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(40, Gx_line+0, 40, Gx_line+6, 2, 0, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+6) ;
                  }
                  h7390( false, 17) ;
                  getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 63, Gx_line+0, 101, Gx_line+16, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A897EscMDsc, "")), 105, Gx_line+0, 287, Gx_line+17, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(29, Gx_line+0, 29, Gx_line+17, 2, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(625, Gx_line+0, 625, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(476, Gx_line+0, 476, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(543, Gx_line+0, 543, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(693, Gx_line+0, 693, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A488ForPrdDsc, "")), 352, Gx_line+0, 380, Gx_line+16, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41Asterisco, "")), 47, Gx_line+1, 58, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(727, Gx_line+0, 727, Gx_line+17, 2, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(40, Gx_line+0, 40, Gx_line+17, 2, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(466, Gx_line+0, 466, Gx_line+17, 2, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV51EscMCan, "ZZZZZZ.ZZZZ")), 296, Gx_line+0, 346, Gx_line+16, 2, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+17) ;
                  AV43Color = (byte)(1) ;
                  AV49NLin = (byte)(AV49NLin+1) ;
               }
               else
               {
                  if ( AV43Color == 1 )
                  {
                     h7390( false, 9) ;
                     getPrinter().GxDrawLine(40, Gx_line+5, 466, Gx_line+5, 2, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(466, Gx_line+0, 466, Gx_line+5, 2, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(625, Gx_line+0, 625, Gx_line+9, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(476, Gx_line+0, 476, Gx_line+9, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(543, Gx_line+0, 543, Gx_line+9, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(693, Gx_line+0, 693, Gx_line+9, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(727, Gx_line+0, 727, Gx_line+9, 2, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(29, Gx_line+0, 29, Gx_line+9, 2, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(40, Gx_line+0, 40, Gx_line+6, 2, 0, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+9) ;
                     AV43Color = (byte)(0) ;
                  }
                  h7390( false, 17) ;
                  getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 99, Gx_line+0, 144, Gx_line+16, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A897EscMDsc, "")), 149, Gx_line+0, 331, Gx_line+17, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(29, Gx_line+0, 29, Gx_line+17, 2, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(625, Gx_line+0, 625, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(476, Gx_line+0, 476, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(543, Gx_line+0, 543, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(693, Gx_line+0, 693, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A488ForPrdDsc, "")), 397, Gx_line+0, 425, Gx_line+16, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41Asterisco, "")), 83, Gx_line+0, 94, Gx_line+16, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(727, Gx_line+0, 727, Gx_line+17, 2, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV51EscMCan, "ZZZZZZ.ZZZZ")), 340, Gx_line+0, 390, Gx_line+16, 2, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+17) ;
                  AV49NLin = (byte)(AV49NLin+1) ;
               }
               pr_default.readNext(1);
            }
            pr_default.close(1);
            if ( AV49NLin > 11 )
            {
               /* Execute user subroutine: 'PIE' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  getPrinter().GxEndPage() ;
                  /* Close printer file */
                  getPrinter().GxEndDocument() ;
                  endPrinter();
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               AV49NLin = (byte)(1) ;
            }
            if ( AV43Color == 1 )
            {
               h7390( false, 9) ;
               getPrinter().GxDrawLine(40, Gx_line+5, 466, Gx_line+5, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(466, Gx_line+0, 466, Gx_line+5, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(625, Gx_line+0, 625, Gx_line+9, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(476, Gx_line+0, 476, Gx_line+9, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(543, Gx_line+0, 543, Gx_line+9, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(693, Gx_line+0, 693, Gx_line+9, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(727, Gx_line+0, 727, Gx_line+9, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(29, Gx_line+0, 29, Gx_line+9, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(40, Gx_line+0, 40, Gx_line+6, 2, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+9) ;
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         while ( AV49NLin < 12 )
         {
            h7390( false, 17) ;
            getPrinter().GxDrawLine(625, Gx_line+0, 625, Gx_line+17, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(476, Gx_line+0, 476, Gx_line+17, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(543, Gx_line+0, 543, Gx_line+17, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(693, Gx_line+0, 693, Gx_line+17, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(727, Gx_line+0, 727, Gx_line+17, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(29, Gx_line+0, 29, Gx_line+17, 2, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+17) ;
            AV49NLin = (byte)(AV49NLin+1) ;
         }
         /* Execute user subroutine: 'PIE' */
         S111 ();
         if ( returnInSub )
         {
         }
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h7390( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void S111( ) throws ProcessInterruptedException
   {
      /* 'PIE' Routine */
      returnInSub = false ;
      h7390( false, 147) ;
      getPrinter().GxAttris("Arial", 10, false, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "OBSERVACIONES:", ""), 34, Gx_line+41, 156, Gx_line+58, 0+256, 0, 0, 0) ;
      getPrinter().GxAttris("Arial", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV45Temp), "ZZZZ9")), 331, Gx_line+9, 379, Gx_line+29, 2+256, 0, 0, 0) ;
      getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "MANTENER", ""), 192, Gx_line+11, 262, Gx_line+27, 0+256, 0, 0, 0) ;
      getPrinter().GxAttris("Arial", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "º C.", ""), 383, Gx_line+9, 410, Gx_line+28, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawRect(177, Gx_line+0, 437, Gx_line+38, 2, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(476, Gx_line+43, 694, Gx_line+43, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(476, Gx_line+0, 476, Gx_line+44, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(625, Gx_line+0, 625, Gx_line+44, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(543, Gx_line+0, 543, Gx_line+44, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(693, Gx_line+0, 693, Gx_line+44, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(543, Gx_line+34, 625, Gx_line+34, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(727, Gx_line+0, 727, Gx_line+147, 2, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(29, Gx_line+0, 29, Gx_line+147, 2, 0, 0, 0, 0) ;
      getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV44Minutos), "ZZZ")), 276, Gx_line+10, 299, Gx_line+28, 2+256, 0, 0, 0) ;
      getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( " ' A ", ""), 304, Gx_line+11, 322, Gx_line+27, 0+256, 0, 0, 0) ;
      getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(AV39Observa, 34, Gx_line+59, 709, Gx_line+147, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+147) ;
      h7390( false, 44) ;
      getPrinter().GxDrawLine(29, Gx_line+0, 728, Gx_line+0, 2, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(484, Gx_line+1, 484, Gx_line+40, 2, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(727, Gx_line+1, 727, Gx_line+42, 2, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(484, Gx_line+41, 728, Gx_line+41, 2, 0, 0, 0, 0) ;
      getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "APROBADO POR:", ""), 368, Gx_line+5, 459, Gx_line+20, 0+256, 0, 0, 0) ;
      getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40TipColor, "")), 34, Gx_line+25, 191, Gx_line+41, 0+256, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+44) ;
      /* Eject command */
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(P_lines+1) ;
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'TIPCOLOR' Routine */
      returnInSub = false ;
      AV48TC = (byte)(1) ;
      while ( AV48TC < 5 )
      {
         if ( (0==AV47Tabla_Col[AV48TC-1]) )
         {
            AV47Tabla_Col[AV48TC-1] = AV42TipColCod ;
            /* Execute user subroutine: 'LEOTIPO' */
            S131 ();
            if (returnInSub) return;
            if (true) break;
         }
         else
         {
            if ( AV47Tabla_Col[AV48TC-1] == AV42TipColCod )
            {
               if (true) break;
            }
            else
            {
               AV47Tabla_Col[AV48TC-1] = AV42TipColCod ;
            }
         }
         AV48TC = (byte)(AV48TC+1) ;
      }
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'LEOTIPO' Routine */
      returnInSub = false ;
      /* Using cursor P07394 */
      pr_default.execute(2, new Object[] {A396EmprCod, Byte.valueOf(AV42TipColCod)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A831TipColCod = P07394_A831TipColCod[0] ;
         A832TipColDsc = P07394_A832TipColDsc[0] ;
         n832TipColDsc = P07394_n832TipColDsc[0] ;
         if ( (GXutil.strcmp("", AV40TipColor)==0) )
         {
            AV40TipColor = GXutil.trim( A832TipColDsc) ;
         }
         else
         {
            AV40TipColor = GXutil.trim( AV40TipColor) + "/" + GXutil.trim( A832TipColDsc) ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
   }

   public void h7390( boolean bFoot ,
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
            getPrinter().GxDrawLine(29, Gx_line+19, 728, Gx_line+19, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(29, Gx_line+19, 29, Gx_line+125, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(727, Gx_line+19, 727, Gx_line+125, 2, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( AV32Fecha, "99/99/99"), 50, Gx_line+30, 116, Gx_line+50, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, false, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "CLIENTE :", ""), 50, Gx_line+56, 115, Gx_line+73, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "TIPO DE HILADO:", ""), 50, Gx_line+75, 161, Gx_line+92, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "FORMULA DE TEÑIDO:", ""), 50, Gx_line+106, 196, Gx_line+123, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "                            COLOR                               ", ""), 425, Gx_line+24, 719, Gx_line+41, 1+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "LAB.", ""), 579, Gx_line+92, 605, Gx_line+107, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "CLIENTE", ""), 486, Gx_line+92, 529, Gx_line+107, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "PLANTA", ""), 641, Gx_line+92, 684, Gx_line+107, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(476, Gx_line+110, 694, Gx_line+110, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(476, Gx_line+110, 476, Gx_line+125, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(625, Gx_line+110, 625, Gx_line+125, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(543, Gx_line+110, 543, Gx_line+125, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(693, Gx_line+110, 693, Gx_line+125, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(543, Gx_line+121, 625, Gx_line+121, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV33CliCod), "ZZZZZ9")), 123, Gx_line+56, 168, Gx_line+74, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34CliNom, "")), 173, Gx_line+56, 362, Gx_line+74, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36TipArtDsc, "")), 173, Gx_line+75, 362, Gx_line+93, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 18, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37ForColNom, "")), 430, Gx_line+43, 628, Gx_line+71, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 18, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV38ForColNum), "ZZZZZ9")), 633, Gx_line+43, 715, Gx_line+72, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52CruDsc, "")), 367, Gx_line+75, 555, Gx_line+92, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+125) ;
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
      this.aP0[0] = rtalaro.this.A396EmprCod;
      this.aP1[0] = rtalaro.this.A910Workstat;
      this.aP2[0] = rtalaro.this.AV32Fecha;
      this.aP3[0] = rtalaro.this.AV33CliCod;
      this.aP4[0] = rtalaro.this.AV34CliNom;
      this.aP5[0] = rtalaro.this.AV35TipArtCod;
      this.aP6[0] = rtalaro.this.AV36TipArtDsc;
      this.aP7[0] = rtalaro.this.AV37ForColNom;
      this.aP8[0] = rtalaro.this.AV38ForColNum;
      this.aP9[0] = rtalaro.this.AV44Minutos;
      this.aP10[0] = rtalaro.this.AV39Observa;
      this.aP11[0] = rtalaro.this.AV52CruDsc;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV47Tabla_Col = new byte[4] ;
      scmdbuf = "" ;
      P07392_A396EmprCod = new String[] {""} ;
      P07392_A910Workstat = new String[] {""} ;
      P07392_A885EscMVol = new int[1] ;
      P07392_n885EscMVol = new boolean[] {false} ;
      P07393_A490ForPrdUMe = new byte[1] ;
      P07393_A396EmprCod = new String[] {""} ;
      P07393_A910Workstat = new String[] {""} ;
      P07393_A897EscMDsc = new String[] {""} ;
      P07393_A719PrdNum = new String[] {""} ;
      P07393_A890EscMCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07393_A488ForPrdDsc = new String[] {""} ;
      P07393_n488ForPrdDsc = new boolean[] {false} ;
      P07393_A887EscMLin = new int[1] ;
      A897EscMDsc = "" ;
      A719PrdNum = "" ;
      A890EscMCan = DecimalUtil.ZERO ;
      A488ForPrdDsc = "" ;
      AV41Asterisco = "" ;
      AV51EscMCan = DecimalUtil.ZERO ;
      AV40TipColor = "" ;
      P07394_A396EmprCod = new String[] {""} ;
      P07394_A831TipColCod = new byte[1] ;
      P07394_A832TipColDsc = new String[] {""} ;
      P07394_n832TipColDsc = new boolean[] {false} ;
      A832TipColDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rtalaro__default(),
         new Object[] {
             new Object[] {
            P07392_A396EmprCod, P07392_A910Workstat, P07392_A885EscMVol, P07392_n885EscMVol
            }
            , new Object[] {
            P07393_A490ForPrdUMe, P07393_A396EmprCod, P07393_A910Workstat, P07393_A897EscMDsc, P07393_A719PrdNum, P07393_A890EscMCan, P07393_A488ForPrdDsc, P07393_n488ForPrdDsc, P07393_A887EscMLin
            }
            , new Object[] {
            P07394_A396EmprCod, P07394_A831TipColCod, P07394_A832TipColDsc, P07394_n832TipColDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte AV47Tabla_Col[] ;
   private byte AV43Color ;
   private byte AV49NLin ;
   private byte A490ForPrdUMe ;
   private byte AV42TipColCod ;
   private byte AV48TC ;
   private byte A831TipColCod ;
   private short AV35TipArtCod ;
   private short AV44Minutos ;
   private short Gx_err ;
   private int AV33CliCod ;
   private int AV38ForColNum ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int GX_I ;
   private int A885EscMVol ;
   private int AV45Temp ;
   private int A887EscMLin ;
   private int Gx_OldLine ;
   private java.math.BigDecimal A890EscMCan ;
   private java.math.BigDecimal AV51EscMCan ;
   private String A396EmprCod ;
   private String A910Workstat ;
   private String AV34CliNom ;
   private String AV36TipArtDsc ;
   private String AV37ForColNom ;
   private String AV52CruDsc ;
   private String scmdbuf ;
   private String A897EscMDsc ;
   private String A719PrdNum ;
   private String A488ForPrdDsc ;
   private String AV41Asterisco ;
   private String AV40TipColor ;
   private String A832TipColDsc ;
   private java.util.Date AV32Fecha ;
   private boolean n885EscMVol ;
   private boolean n488ForPrdDsc ;
   private boolean returnInSub ;
   private boolean n832TipColDsc ;
   private String AV39Observa ;
   private String[] aP11 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private java.util.Date[] aP2 ;
   private int[] aP3 ;
   private String[] aP4 ;
   private short[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private int[] aP8 ;
   private short[] aP9 ;
   private String[] aP10 ;
   private IDataStoreProvider pr_default ;
   private String[] P07392_A396EmprCod ;
   private String[] P07392_A910Workstat ;
   private int[] P07392_A885EscMVol ;
   private boolean[] P07392_n885EscMVol ;
   private byte[] P07393_A490ForPrdUMe ;
   private String[] P07393_A396EmprCod ;
   private String[] P07393_A910Workstat ;
   private String[] P07393_A897EscMDsc ;
   private String[] P07393_A719PrdNum ;
   private java.math.BigDecimal[] P07393_A890EscMCan ;
   private String[] P07393_A488ForPrdDsc ;
   private boolean[] P07393_n488ForPrdDsc ;
   private int[] P07393_A887EscMLin ;
   private String[] P07394_A396EmprCod ;
   private byte[] P07394_A831TipColCod ;
   private String[] P07394_A832TipColDsc ;
   private boolean[] P07394_n832TipColDsc ;
}

final  class rtalaro__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07392", "SELECT EmprCod, Workstat, EscMVol FROM TXPCESCAN WHERE EmprCod = ? and Workstat = ? ORDER BY EmprCod, Workstat ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07393", "SELECT T1.ForPrdUMe, T1.EmprCod, T1.Workstat, T1.EscMDsc, T1.PrdNum, T1.EscMCan, T2.ForPrdDsc, T1.EscMLin FROM (TXPESCMAN T1 INNER JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe = T1.ForPrdUMe) WHERE T1.EmprCod = ? and T1.Workstat = ? ORDER BY T1.EmprCod, T1.Workstat ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07394", "SELECT EmprCod, TipColCod, TipColDsc FROM TXPTIPCOL WHERE EmprCod = ? and TipColCod = ? ORDER BY EmprCod, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((String[]) buf[6])[0] = rslt.getString(7, 5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
      }
   }

}

