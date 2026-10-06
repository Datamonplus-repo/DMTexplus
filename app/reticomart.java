package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class reticomart extends GXReport
{
   public reticomart( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( reticomart.class ), "" );
   }

   public reticomart( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             int[] aP3 ,
                             String[] aP4 )
   {
      reticomart.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        int[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             int[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      reticomart.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      reticomart.this.A2141SerEst = aP1[0];
      this.aP1 = aP1;
      reticomart.this.A1013DibCli = aP2[0];
      this.aP2 = aP2;
      reticomart.this.A1014DibInt = aP3[0];
      this.aP3 = aP3;
      reticomart.this.A2074ColCom = aP4[0];
      this.aP4 = aP4;
      reticomart.this.A2078ColFon = aP5[0];
      this.aP5 = aP5;
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
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("Etiqueta Combin. Artextil") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*0)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         AV10Contador = 1 ;
         while ( AV10Contador < AV9Inicio )
         {
            /* Execute user subroutine: 'ETIQUETA BLANCA' */
            S141 ();
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
         }
         /* Using cursor P079R2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A1013DibCli, A2141SerEst, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A252CliCod = P079R2_A252CliCod[0] ;
            A1823DibTipMaq = P079R2_A1823DibTipMaq[0] ;
            n1823DibTipMaq = P079R2_n1823DibTipMaq[0] ;
            A6841DibDsc = P079R2_A6841DibDsc[0] ;
            n6841DibDsc = P079R2_n6841DibDsc[0] ;
            A1607DibMed = P079R2_A1607DibMed[0] ;
            n1607DibMed = P079R2_n1607DibMed[0] ;
            A1823DibTipMaq = P079R2_A1823DibTipMaq[0] ;
            n1823DibTipMaq = P079R2_n1823DibTipMaq[0] ;
            A6841DibDsc = P079R2_A6841DibDsc[0] ;
            n6841DibDsc = P079R2_n6841DibDsc[0] ;
            A1607DibMed = P079R2_A1607DibMed[0] ;
            n1607DibMed = P079R2_n1607DibMed[0] ;
            AV13ColCom = A2074ColCom ;
            AV11DibCli = A1013DibCli ;
            AV12DibDsc = A6841DibDsc ;
            AV19DibMed = GXutil.trim( A1607DibMed) ;
            GX_I = 1 ;
            while ( GX_I <= 15 )
            {
               AV14EstCol[GX_I-1] = "" ;
               GX_I = (int)(GX_I+1) ;
            }
            GX_I = 1 ;
            while ( GX_I <= 15 )
            {
               AV15MolPrcCob[GX_I-1] = DecimalUtil.doubleToDec(0) ;
               GX_I = (int)(GX_I+1) ;
            }
            AV16I = 1 ;
            /* Using cursor P079R3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Long.valueOf(AV16I)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A4420MolCol = P079R3_A4420MolCol[0] ;
               n4420MolCol = P079R3_n4420MolCol[0] ;
               A2098MolCod = P079R3_A2098MolCod[0] ;
               if ( GXutil.strcmp(A1823DibTipMaq, httpContext.getMessage( "R", "")) == 0 )
               {
                  A4862MolPrcCob = getMolPrcCob0( A2098MolCod, A396EmprCod, A1013DibCli, A252CliCod, A1014DibInt) ;
               }
               else
               {
                  if ( GXutil.strcmp(A1823DibTipMaq, httpContext.getMessage( "P", "")) == 0 )
                  {
                     A4862MolPrcCob = getMolPrcCob1( A2098MolCod, A396EmprCod, A1013DibCli, A252CliCod, A1014DibInt) ;
                  }
                  else
                  {
                     A4862MolPrcCob = DecimalUtil.doubleToDec(0) ;
                  }
               }
               AV14EstCol[(int)(AV16I)-1] = A4420MolCol ;
               AV15MolPrcCob[(int)(AV16I)-1] = A4862MolPrcCob ;
               AV20J = 0 ;
               /* Using cursor P079R4 */
               pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Byte.valueOf(A2098MolCod)});
               while ( (pr_default.getStatus(2) != 101) )
               {
                  A2107PasCod = P079R4_A2107PasCod[0] ;
                  n2107PasCod = P079R4_n2107PasCod[0] ;
                  A2654PasForLin = P079R4_A2654PasForLin[0] ;
                  if ( GXutil.strcmp(A2107PasCod, httpContext.getMessage( "PASPIG", "")) != 0 )
                  {
                     AV20J = (long)(AV20J+1) ;
                     AV18PasCod[(int)(AV20J)-1] = GXutil.trim( A2107PasCod) ;
                  }
                  pr_default.readNext(2);
               }
               pr_default.close(2);
               AV16I = (long)(AV16I+1) ;
               pr_default.readNext(1);
            }
            pr_default.close(1);
            /* Execute user subroutine: 'ETIQUETA' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            pr_default.readNext(0);
         }
         pr_default.close(0);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h79R0( true, 0) ;
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
      /* 'ETIQUETA' Routine */
      returnInSub = false ;
      AV17Copia = 1 ;
      while ( AV17Copia <= AV8Copias )
      {
         if ( ((int)((AV10Contador) % (2))) == 0 )
         {
            /* Execute user subroutine: 'ETIQUETA PAR' */
            S121 ();
            if (returnInSub) return;
         }
         else
         {
            /* Execute user subroutine: 'ETIQUETA IMPAR' */
            S131 ();
            if (returnInSub) return;
         }
         AV10Contador = (long)(AV10Contador+1) ;
         AV17Copia = (long)(AV17Copia+1) ;
      }
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'ETIQUETA IMPAR' Routine */
      returnInSub = false ;
      h79R0( false, 100) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 6, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV11DibCli, "")), 51, Gx_line+9, 114, Gx_line+17, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12DibDsc, "")), 121, Gx_line+9, 285, Gx_line+17, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14EstCol[1-1], "")), 51, Gx_line+19, 114, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV13ColCom, "")), 293, Gx_line+9, 344, Gx_line+19, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14EstCol[2-1], "")), 51, Gx_line+28, 114, Gx_line+36, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14EstCol[3-1], "")), 51, Gx_line+38, 114, Gx_line+46, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14EstCol[5-1], "")), 51, Gx_line+57, 114, Gx_line+65, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14EstCol[4-1], "")), 51, Gx_line+47, 114, Gx_line+55, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14EstCol[11-1], "")), 265, Gx_line+19, 328, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14EstCol[12-1], "")), 265, Gx_line+28, 328, Gx_line+36, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14EstCol[6-1], "")), 157, Gx_line+19, 220, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14EstCol[7-1], "")), 157, Gx_line+28, 220, Gx_line+36, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14EstCol[10-1], "")), 157, Gx_line+57, 220, Gx_line+65, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14EstCol[9-1], "")), 157, Gx_line+47, 220, Gx_line+55, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14EstCol[8-1], "")), 157, Gx_line+38, 220, Gx_line+46, 0, 0, 0, 0) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 6, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV15MolPrcCob[1-1], "ZZ %")), 114, Gx_line+19, 136, Gx_line+29, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV15MolPrcCob[2-1], "ZZ %")), 114, Gx_line+28, 136, Gx_line+38, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV15MolPrcCob[3-1], "ZZ %")), 114, Gx_line+38, 136, Gx_line+48, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV15MolPrcCob[4-1], "ZZ %")), 114, Gx_line+47, 136, Gx_line+57, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV15MolPrcCob[5-1], "ZZ %")), 113, Gx_line+57, 135, Gx_line+67, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV15MolPrcCob[6-1], "ZZ %")), 220, Gx_line+19, 242, Gx_line+29, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV15MolPrcCob[8-1], "ZZ %")), 220, Gx_line+38, 242, Gx_line+48, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV15MolPrcCob[9-1], "ZZ %")), 220, Gx_line+47, 242, Gx_line+57, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV15MolPrcCob[10-1], "ZZ %")), 220, Gx_line+57, 242, Gx_line+67, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV15MolPrcCob[7-1], "ZZ %")), 220, Gx_line+28, 242, Gx_line+38, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV15MolPrcCob[11-1], "ZZ %")), 327, Gx_line+19, 349, Gx_line+29, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV15MolPrcCob[12-1], "ZZ %")), 327, Gx_line+28, 349, Gx_line+38, 2+256, 0, 0, 0) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 6, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19DibMed, "")), 295, Gx_line+57, 338, Gx_line+67, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18PasCod[1-1], "")), 321, Gx_line+47, 372, Gx_line+57, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18PasCod[3-1], "")), 265, Gx_line+47, 316, Gx_line+57, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18PasCod[2-1], "")), 321, Gx_line+38, 372, Gx_line+48, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18PasCod[4-1], "")), 265, Gx_line+38, 316, Gx_line+48, 2+256, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+100) ;
      /* Noskip command */
      Gx_line = Gx_OldLine ;
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'ETIQUETA PAR' Routine */
      returnInSub = false ;
      h79R0( false, 100) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 6, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV11DibCli, "")), 408, Gx_line+9, 471, Gx_line+17, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12DibDsc, "")), 478, Gx_line+9, 642, Gx_line+17, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14EstCol[1-1], "")), 408, Gx_line+19, 471, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV13ColCom, "")), 650, Gx_line+9, 701, Gx_line+19, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14EstCol[2-1], "")), 408, Gx_line+28, 471, Gx_line+36, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14EstCol[3-1], "")), 408, Gx_line+38, 471, Gx_line+46, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14EstCol[5-1], "")), 408, Gx_line+57, 471, Gx_line+65, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14EstCol[11-1], "")), 622, Gx_line+19, 685, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14EstCol[12-1], "")), 622, Gx_line+28, 685, Gx_line+36, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14EstCol[6-1], "")), 515, Gx_line+19, 578, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14EstCol[7-1], "")), 515, Gx_line+28, 578, Gx_line+36, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14EstCol[10-1], "")), 515, Gx_line+57, 578, Gx_line+65, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14EstCol[9-1], "")), 515, Gx_line+47, 578, Gx_line+55, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14EstCol[8-1], "")), 515, Gx_line+38, 578, Gx_line+46, 0, 0, 0, 0) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 6, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV15MolPrcCob[1-1], "ZZ %")), 471, Gx_line+19, 493, Gx_line+29, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV15MolPrcCob[2-1], "ZZ %")), 471, Gx_line+28, 493, Gx_line+38, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV15MolPrcCob[3-1], "ZZ %")), 471, Gx_line+38, 493, Gx_line+48, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV15MolPrcCob[4-1], "ZZ %")), 471, Gx_line+47, 493, Gx_line+57, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV15MolPrcCob[5-1], "ZZ %")), 470, Gx_line+57, 492, Gx_line+67, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV15MolPrcCob[6-1], "ZZ %")), 577, Gx_line+19, 599, Gx_line+29, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV15MolPrcCob[8-1], "ZZ %")), 577, Gx_line+38, 599, Gx_line+48, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV15MolPrcCob[9-1], "ZZ %")), 577, Gx_line+47, 599, Gx_line+57, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV15MolPrcCob[10-1], "ZZ %")), 577, Gx_line+57, 599, Gx_line+67, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV15MolPrcCob[7-1], "ZZ %")), 577, Gx_line+28, 599, Gx_line+38, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV15MolPrcCob[11-1], "ZZ %")), 684, Gx_line+20, 706, Gx_line+30, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV15MolPrcCob[12-1], "ZZ %")), 684, Gx_line+29, 706, Gx_line+39, 2+256, 0, 0, 0) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 6, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14EstCol[4-1], "")), 408, Gx_line+47, 471, Gx_line+55, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19DibMed, "")), 653, Gx_line+57, 696, Gx_line+67, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18PasCod[1-1], "")), 678, Gx_line+47, 729, Gx_line+57, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18PasCod[2-1], "")), 678, Gx_line+38, 729, Gx_line+48, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18PasCod[4-1], "")), 622, Gx_line+38, 673, Gx_line+48, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18PasCod[3-1], "")), 622, Gx_line+47, 673, Gx_line+57, 2+256, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+100) ;
   }

   public void S141( ) throws ProcessInterruptedException
   {
      /* 'ETIQUETA BLANCA' Routine */
      returnInSub = false ;
      if ( ((int)((AV10Contador) % (2))) == 0 )
      {
         h79R0( false, 100) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+100) ;
      }
      AV10Contador = (long)(AV10Contador+1) ;
   }

   public void h79R0( boolean bFoot ,
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

   protected void cleanup( )
   {
      this.aP0[0] = reticomart.this.A396EmprCod;
      this.aP1[0] = reticomart.this.A2141SerEst;
      this.aP2[0] = reticomart.this.A1013DibCli;
      this.aP3[0] = reticomart.this.A1014DibInt;
      this.aP4[0] = reticomart.this.A2074ColCom;
      this.aP5[0] = reticomart.this.A2078ColFon;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public java.math.BigDecimal getMolPrcCob1( byte E2098MolCod ,
                                              String E396EmprCod ,
                                              String E1013DibCli ,
                                              int E252CliCod ,
                                              int E1014DibInt )
   {
      X5381DibPrcCobM = DecimalUtil.ZERO ;
      Gx_first = true ;
      /* Using cursor P079R5 */
      pr_default.execute(3, new Object[] {E396EmprCod, E1013DibCli, Integer.valueOf(E252CliCod), Integer.valueOf(E1014DibInt)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         if ( ( ( P079R5_A2088DibDibMol[0] == E2098MolCod ) ) && ( ( GXutil.strcmp(E396EmprCod, E396EmprCod) == 0 ) && ( GXutil.strcmp(E1013DibCli, E1013DibCli) == 0 ) && ( E252CliCod == E252CliCod ) && ( E1014DibInt == E1014DibInt ) ) )
         {
            X5381DibPrcCobM = P079R5_A5381DibPrcCobM[0] ;
            nX5381DibPrcCobM = false ;
            if (true) break;
         }
         pr_default.readNext(3);
      }
      pr_default.close(3);
      return X5381DibPrcCobM ;
   }

   public java.math.BigDecimal getMolPrcCob0( byte E2098MolCod ,
                                              String E396EmprCod ,
                                              String E1013DibCli ,
                                              int E252CliCod ,
                                              int E1014DibInt )
   {
      X4860DibPrcCob = DecimalUtil.ZERO ;
      Gx_first = true ;
      /* Using cursor P079R6 */
      pr_default.execute(4, new Object[] {E396EmprCod, E1013DibCli, Integer.valueOf(E252CliCod), Integer.valueOf(E1014DibInt)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         if ( ( ( P079R6_A2089DibLinMol[0] == E2098MolCod ) ) && ( ( GXutil.strcmp(E396EmprCod, E396EmprCod) == 0 ) && ( GXutil.strcmp(E1013DibCli, E1013DibCli) == 0 ) && ( E252CliCod == E252CliCod ) && ( E1014DibInt == E1014DibInt ) ) )
         {
            X4860DibPrcCob = P079R6_A4860DibPrcCob[0] ;
            nX4860DibPrcCob = false ;
            if (true) break;
         }
         pr_default.readNext(4);
      }
      pr_default.close(4);
      return X4860DibPrcCob ;
   }

   public void initialize( )
   {
      scmdbuf = "" ;
      P079R2_A396EmprCod = new String[] {""} ;
      P079R2_A2141SerEst = new String[] {""} ;
      P079R2_A1013DibCli = new String[] {""} ;
      P079R2_A1014DibInt = new int[1] ;
      P079R2_A2074ColCom = new String[] {""} ;
      P079R2_A2078ColFon = new String[] {""} ;
      P079R2_A252CliCod = new int[1] ;
      P079R2_A1823DibTipMaq = new String[] {""} ;
      P079R2_n1823DibTipMaq = new boolean[] {false} ;
      P079R2_A6841DibDsc = new String[] {""} ;
      P079R2_n6841DibDsc = new boolean[] {false} ;
      P079R2_A1607DibMed = new String[] {""} ;
      P079R2_n1607DibMed = new boolean[] {false} ;
      A1823DibTipMaq = "" ;
      A6841DibDsc = "" ;
      A1607DibMed = "" ;
      AV13ColCom = "" ;
      AV11DibCli = "" ;
      AV12DibDsc = "" ;
      AV19DibMed = "" ;
      AV14EstCol = new String[15] ;
      GX_I = 1 ;
      while ( GX_I <= 15 )
      {
         AV14EstCol[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV15MolPrcCob = new java.math.BigDecimal[15] ;
      GX_I = 1 ;
      while ( GX_I <= 15 )
      {
         AV15MolPrcCob[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      P079R3_A396EmprCod = new String[] {""} ;
      P079R3_A252CliCod = new int[1] ;
      P079R3_A2141SerEst = new String[] {""} ;
      P079R3_A1013DibCli = new String[] {""} ;
      P079R3_A1014DibInt = new int[1] ;
      P079R3_A2074ColCom = new String[] {""} ;
      P079R3_A2078ColFon = new String[] {""} ;
      P079R3_A4420MolCol = new String[] {""} ;
      P079R3_n4420MolCol = new boolean[] {false} ;
      P079R3_A2098MolCod = new byte[1] ;
      A4420MolCol = "" ;
      A4862MolPrcCob = DecimalUtil.ZERO ;
      P079R4_A396EmprCod = new String[] {""} ;
      P079R4_A252CliCod = new int[1] ;
      P079R4_A2141SerEst = new String[] {""} ;
      P079R4_A1013DibCli = new String[] {""} ;
      P079R4_A1014DibInt = new int[1] ;
      P079R4_A2074ColCom = new String[] {""} ;
      P079R4_A2078ColFon = new String[] {""} ;
      P079R4_A2098MolCod = new byte[1] ;
      P079R4_A2107PasCod = new String[] {""} ;
      P079R4_n2107PasCod = new boolean[] {false} ;
      P079R4_A2654PasForLin = new short[1] ;
      A2107PasCod = "" ;
      AV18PasCod = new String[20] ;
      GX_I = 1 ;
      while ( GX_I <= 20 )
      {
         AV18PasCod[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      X5381DibPrcCobM = DecimalUtil.ZERO ;
      P079R5_A396EmprCod = new String[] {""} ;
      P079R5_A1013DibCli = new String[] {""} ;
      P079R5_A252CliCod = new int[1] ;
      P079R5_A1014DibInt = new int[1] ;
      P079R5_A1029DibLin = new short[1] ;
      P079R5_A5381DibPrcCobM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P079R5_n5381DibPrcCobM = new boolean[] {false} ;
      P079R5_A2088DibDibMol = new byte[1] ;
      P079R5_n2088DibDibMol = new boolean[] {false} ;
      X4860DibPrcCob = DecimalUtil.ZERO ;
      P079R6_A396EmprCod = new String[] {""} ;
      P079R6_A1013DibCli = new String[] {""} ;
      P079R6_A252CliCod = new int[1] ;
      P079R6_A1014DibInt = new int[1] ;
      P079R6_A1807DibLinCil = new short[1] ;
      P079R6_A4860DibPrcCob = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P079R6_n4860DibPrcCob = new boolean[] {false} ;
      P079R6_A2089DibLinMol = new byte[1] ;
      P079R6_n2089DibLinMol = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.reticomart__default(),
         new Object[] {
             new Object[] {
            P079R2_A396EmprCod, P079R2_A2141SerEst, P079R2_A1013DibCli, P079R2_A1014DibInt, P079R2_A2074ColCom, P079R2_A2078ColFon, P079R2_A252CliCod, P079R2_A1823DibTipMaq, P079R2_n1823DibTipMaq, P079R2_A6841DibDsc,
            P079R2_n6841DibDsc, P079R2_A1607DibMed, P079R2_n1607DibMed
            }
            , new Object[] {
            P079R3_A396EmprCod, P079R3_A252CliCod, P079R3_A2141SerEst, P079R3_A1013DibCli, P079R3_A1014DibInt, P079R3_A2074ColCom, P079R3_A2078ColFon, P079R3_A4420MolCol, P079R3_n4420MolCol, P079R3_A2098MolCod
            }
            , new Object[] {
            P079R4_A396EmprCod, P079R4_A252CliCod, P079R4_A2141SerEst, P079R4_A1013DibCli, P079R4_A1014DibInt, P079R4_A2074ColCom, P079R4_A2078ColFon, P079R4_A2098MolCod, P079R4_A2107PasCod, P079R4_n2107PasCod,
            P079R4_A2654PasForLin
            }
            , new Object[] {
            P079R5_A396EmprCod, P079R5_A1013DibCli, P079R5_A252CliCod, P079R5_A1014DibInt, P079R5_A1029DibLin, P079R5_A5381DibPrcCobM, P079R5_n5381DibPrcCobM, P079R5_A2088DibDibMol, P079R5_n2088DibDibMol
            }
            , new Object[] {
            P079R6_A396EmprCod, P079R6_A1013DibCli, P079R6_A252CliCod, P079R6_A1014DibInt, P079R6_A1807DibLinCil, P079R6_A4860DibPrcCob, P079R6_n4860DibPrcCob, P079R6_A2089DibLinMol, P079R6_n2089DibLinMol
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte A2098MolCod ;
   private byte E2098MolCod ;
   private short AV9Inicio ;
   private short A2654PasForLin ;
   private short AV8Copias ;
   private short Gx_err ;
   private int A1014DibInt ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A252CliCod ;
   private int GX_I ;
   private int Gx_OldLine ;
   private int E252CliCod ;
   private int E1014DibInt ;
   private long AV10Contador ;
   private long AV16I ;
   private long AV20J ;
   private long AV17Copia ;
   private java.math.BigDecimal AV15MolPrcCob[] ;
   private java.math.BigDecimal A4862MolPrcCob ;
   private java.math.BigDecimal X5381DibPrcCobM ;
   private java.math.BigDecimal X4860DibPrcCob ;
   private String A396EmprCod ;
   private String A2141SerEst ;
   private String A1013DibCli ;
   private String A2074ColCom ;
   private String A2078ColFon ;
   private String scmdbuf ;
   private String A1823DibTipMaq ;
   private String A6841DibDsc ;
   private String A1607DibMed ;
   private String AV13ColCom ;
   private String AV11DibCli ;
   private String AV12DibDsc ;
   private String AV19DibMed ;
   private String AV14EstCol[] ;
   private String A4420MolCol ;
   private String A2107PasCod ;
   private String AV18PasCod[] ;
   private String E396EmprCod ;
   private String E1013DibCli ;
   private boolean returnInSub ;
   private boolean n1823DibTipMaq ;
   private boolean n6841DibDsc ;
   private boolean n1607DibMed ;
   private boolean n4420MolCol ;
   private boolean n2107PasCod ;
   private boolean Gx_first ;
   private boolean nX5381DibPrcCobM ;
   private boolean nX4860DibPrcCob ;
   private String[] aP5 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private int[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P079R2_A396EmprCod ;
   private String[] P079R2_A2141SerEst ;
   private String[] P079R2_A1013DibCli ;
   private int[] P079R2_A1014DibInt ;
   private String[] P079R2_A2074ColCom ;
   private String[] P079R2_A2078ColFon ;
   private int[] P079R2_A252CliCod ;
   private String[] P079R2_A1823DibTipMaq ;
   private boolean[] P079R2_n1823DibTipMaq ;
   private String[] P079R2_A6841DibDsc ;
   private boolean[] P079R2_n6841DibDsc ;
   private String[] P079R2_A1607DibMed ;
   private boolean[] P079R2_n1607DibMed ;
   private String[] P079R3_A396EmprCod ;
   private int[] P079R3_A252CliCod ;
   private String[] P079R3_A2141SerEst ;
   private String[] P079R3_A1013DibCli ;
   private int[] P079R3_A1014DibInt ;
   private String[] P079R3_A2074ColCom ;
   private String[] P079R3_A2078ColFon ;
   private String[] P079R3_A4420MolCol ;
   private boolean[] P079R3_n4420MolCol ;
   private byte[] P079R3_A2098MolCod ;
   private String[] P079R4_A396EmprCod ;
   private int[] P079R4_A252CliCod ;
   private String[] P079R4_A2141SerEst ;
   private String[] P079R4_A1013DibCli ;
   private int[] P079R4_A1014DibInt ;
   private String[] P079R4_A2074ColCom ;
   private String[] P079R4_A2078ColFon ;
   private byte[] P079R4_A2098MolCod ;
   private String[] P079R4_A2107PasCod ;
   private boolean[] P079R4_n2107PasCod ;
   private short[] P079R4_A2654PasForLin ;
   private String[] P079R5_A396EmprCod ;
   private String[] P079R5_A1013DibCli ;
   private int[] P079R5_A252CliCod ;
   private int[] P079R5_A1014DibInt ;
   private short[] P079R5_A1029DibLin ;
   private java.math.BigDecimal[] P079R5_A5381DibPrcCobM ;
   private boolean[] P079R5_n5381DibPrcCobM ;
   private byte[] P079R5_A2088DibDibMol ;
   private boolean[] P079R5_n2088DibDibMol ;
   private String[] P079R6_A396EmprCod ;
   private String[] P079R6_A1013DibCli ;
   private int[] P079R6_A252CliCod ;
   private int[] P079R6_A1014DibInt ;
   private short[] P079R6_A1807DibLinCil ;
   private java.math.BigDecimal[] P079R6_A4860DibPrcCob ;
   private boolean[] P079R6_n4860DibPrcCob ;
   private byte[] P079R6_A2089DibLinMol ;
   private boolean[] P079R6_n2089DibLinMol ;
}

final  class reticomart__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P079R2", "SELECT T1.EmprCod, T1.SerEst, T1.DibCli, T1.DibInt, T1.ColCom, T1.ColFon, T1.CliCod, T2.DibTipMaq, T2.DibDsc, T2.DibMed FROM (TXPCFORES T1 INNER JOIN TXPCDIBUJ T2 ON T2.EmprCod = T1.EmprCod AND T2.DibCli = T1.DibCli AND T2.CliCod = T1.CliCod AND T2.DibInt = T1.DibInt) WHERE (T1.EmprCod = ? and T1.DibCli = ?) AND (T1.SerEst = ?) AND (T1.DibInt = ?) AND (T1.ColCom = ?) AND (T1.ColFon = ?) ORDER BY T1.EmprCod, T1.DibCli ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P079R3", "SELECT EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCol, MolCod FROM TXPMFORES WHERE (EmprCod = ? and CliCod = ? and SerEst = ? and DibCli = ? and DibInt = ? and ColCom = ? and ColFon = ?) AND (? <= 15) ORDER BY EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P079R4", "SELECT EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod, PasCod, PasForLin FROM TXPPASFOR WHERE EmprCod = ? and CliCod = ? and SerEst = ? and DibCli = ? and DibInt = ? and ColCom = ? and ColFon = ? and MolCod = ? ORDER BY EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P079R5", "SELECT EmprCod, DibCli, CliCod, DibInt, DibLin, DibPrcCobM, DibDibMol FROM TXPLDIBUJ WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ? ORDER BY EmprCod, DibCli, CliCod, DibInt, DibLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P079R6", "SELECT EmprCod, DibCli, CliCod, DibInt, DibLinCil, DibPrcCob, DibLinMol FROM TXPLDIBUC WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ? ORDER BY EmprCod, DibCli, CliCod, DibInt, DibLinCil ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 20);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(10);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
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
               stmt.setString(2, (String)parms[1], 16);
               stmt.setString(3, (String)parms[2], 16);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 12);
               stmt.setString(6, (String)parms[5], 12);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setLong(8, ((Number) parms[7]).longValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
      }
   }

}

