package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class ralrhis extends GXReport
{
   public ralrhis( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ralrhis.class ), "" );
   }

   public ralrhis( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      ralrhis.this.aP2 = new String[] {""};
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
      ralrhis.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ralrhis.this.A44AlbRecCod = aP1[0];
      this.aP1 = aP1;
      ralrhis.this.A2159AlbRecPie = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      M_top = 0 ;
      M_bot = 6 ;
      P_lines = (int)(66-M_bot) ;
      getPrinter().GxClearAttris() ;
      lineHeight = 15 ;
      PrtOffset = 0 ;
      gxXPage = 100 ;
      gxYPage = 100 ;
      try
      {
         Gx_out = "SCR" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("HISTORIA DE LA PIEZA") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*6)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         /* Using cursor P06TO3 */
         pr_default.execute(0, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A970ProceCod = P06TO3_A970ProceCod[0] ;
            n970ProceCod = P06TO3_n970ProceCod[0] ;
            A3731AlbRecIdPz = P06TO3_A3731AlbRecIdPz[0] ;
            A2155AlbRecKgm = P06TO3_A2155AlbRecKgm[0] ;
            A4795AlRPieCal = P06TO3_A4795AlRPieCal[0] ;
            A1291AlbRDes = P06TO3_A1291AlbRDes[0] ;
            A971ProceNom = P06TO3_A971ProceNom[0] ;
            n971ProceNom = P06TO3_n971ProceNom[0] ;
            A4806AlRPieDefC = P06TO3_A4806AlRPieDefC[0] ;
            A4802AlRPieBarP = P06TO3_A4802AlRPieBarP[0] ;
            A4801AlRPieBarR = P06TO3_A4801AlRPieBarR[0] ;
            A4800AlRPieBarC = P06TO3_A4800AlRPieBarC[0] ;
            A4798AlRPieClaM = P06TO3_A4798AlRPieClaM[0] ;
            n4798AlRPieClaM = P06TO3_n4798AlRPieClaM[0] ;
            A4799AlRPieUltC = P06TO3_A4799AlRPieUltC[0] ;
            n4799AlRPieUltC = P06TO3_n4799AlRPieUltC[0] ;
            A2157AlbRecMtr = P06TO3_A2157AlbRecMtr[0] ;
            A4805AlRPieDefT = P06TO3_A4805AlRPieDefT[0] ;
            A970ProceCod = P06TO3_A970ProceCod[0] ;
            n970ProceCod = P06TO3_n970ProceCod[0] ;
            A1291AlbRDes = P06TO3_A1291AlbRDes[0] ;
            A971ProceNom = P06TO3_A971ProceNom[0] ;
            n971ProceNom = P06TO3_n971ProceNom[0] ;
            A4802AlRPieBarP = P06TO3_A4802AlRPieBarP[0] ;
            A4801AlRPieBarR = P06TO3_A4801AlRPieBarR[0] ;
            A4800AlRPieBarC = P06TO3_A4800AlRPieBarC[0] ;
            GXt_decimal1 = A5259AlrPieMtrA ;
            GXv_char2[0] = A396EmprCod ;
            GXv_int3[0] = A4800AlRPieBarC ;
            GXv_int4[0] = A4801AlRPieBarR ;
            GXv_char5[0] = A4802AlRPieBarP ;
            GXv_char6[0] = A2159AlbRecPie ;
            GXv_decimal7[0] = GXt_decimal1 ;
            new app.pbarpiemet(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_int4, GXv_char5, GXv_char6, GXv_decimal7) ;
            ralrhis.this.A396EmprCod = GXv_char2[0] ;
            ralrhis.this.A4800AlRPieBarC = GXv_int3[0] ;
            ralrhis.this.A4801AlRPieBarR = GXv_int4[0] ;
            ralrhis.this.A4802AlRPieBarP = GXv_char5[0] ;
            ralrhis.this.A2159AlbRecPie = GXv_char6[0] ;
            ralrhis.this.GXt_decimal1 = GXv_decimal7[0] ;
            A5259AlrPieMtrA = GXt_decimal1 ;
            GXt_decimal1 = A5260AlrPieKgmA ;
            GXv_char6[0] = A396EmprCod ;
            GXv_int3[0] = A4800AlRPieBarC ;
            GXv_int4[0] = A4801AlRPieBarR ;
            GXv_char5[0] = A4802AlRPieBarP ;
            GXv_char2[0] = A2159AlbRecPie ;
            GXv_decimal7[0] = GXt_decimal1 ;
            new app.pbarpiekil(remoteHandle, context).execute( GXv_char6, GXv_int3, GXv_int4, GXv_char5, GXv_char2, GXv_decimal7) ;
            ralrhis.this.A396EmprCod = GXv_char6[0] ;
            ralrhis.this.A4800AlRPieBarC = GXv_int3[0] ;
            ralrhis.this.A4801AlRPieBarR = GXv_int4[0] ;
            ralrhis.this.A4802AlRPieBarP = GXv_char5[0] ;
            ralrhis.this.A2159AlbRecPie = GXv_char2[0] ;
            ralrhis.this.GXt_decimal1 = GXv_decimal7[0] ;
            A5260AlrPieKgmA = GXt_decimal1 ;
            GXt_int8 = A4804AlRPieFasL ;
            GXv_char6[0] = A396EmprCod ;
            GXv_int3[0] = A4800AlRPieBarC ;
            GXv_int4[0] = A4801AlRPieBarR ;
            GXv_char5[0] = A4802AlRPieBarP ;
            GXv_int9[0] = GXt_int8 ;
            new app.pbarfaslin(remoteHandle, context).execute( GXv_char6, GXv_int3, GXv_int4, GXv_char5, GXv_int9) ;
            ralrhis.this.A396EmprCod = GXv_char6[0] ;
            ralrhis.this.A4800AlRPieBarC = GXv_int3[0] ;
            ralrhis.this.A4801AlRPieBarR = GXv_int4[0] ;
            ralrhis.this.A4802AlRPieBarP = GXv_char5[0] ;
            ralrhis.this.GXt_int8 = GXv_int9[0] ;
            A4804AlRPieFasL = GXt_int8 ;
            GXt_char10 = A4803AlRPieFasC ;
            GXv_char6[0] = A396EmprCod ;
            GXv_int3[0] = A4800AlRPieBarC ;
            GXv_int4[0] = A4801AlRPieBarR ;
            GXv_char5[0] = A4802AlRPieBarP ;
            GXv_char2[0] = GXt_char10 ;
            new app.pbarfascod(remoteHandle, context).execute( GXv_char6, GXv_int3, GXv_int4, GXv_char5, GXv_char2) ;
            ralrhis.this.A396EmprCod = GXv_char6[0] ;
            ralrhis.this.A4800AlRPieBarC = GXv_int3[0] ;
            ralrhis.this.A4801AlRPieBarR = GXv_int4[0] ;
            ralrhis.this.A4802AlRPieBarP = GXv_char5[0] ;
            ralrhis.this.GXt_char10 = GXv_char2[0] ;
            A4803AlRPieFasC = GXt_char10 ;
            if ( ( A4805AlRPieDefT <= A2157AlbRecMtr.divide(DecimalUtil.doubleToDec(5), 18, java.math.RoundingMode.DOWN).doubleValue() ) && ! (GXutil.strcmp("", A4799AlRPieUltC)==0) )
            {
               A4796AlRPieClaA = (byte)(99) ;
            }
            else
            {
               if ( ( A4805AlRPieDefT > A2157AlbRecMtr.divide(DecimalUtil.doubleToDec(5), 18, java.math.RoundingMode.DOWN).doubleValue() ) && ( A4805AlRPieDefT <= A2157AlbRecMtr.divide(DecimalUtil.doubleToDec(2), 18, java.math.RoundingMode.DOWN).doubleValue() ) && ! (GXutil.strcmp("", A4799AlRPieUltC)==0) )
               {
                  A4796AlRPieClaA = (byte)(1) ;
               }
               else
               {
                  if ( ( A4805AlRPieDefT > A2157AlbRecMtr.divide(DecimalUtil.doubleToDec(2), 18, java.math.RoundingMode.DOWN).doubleValue() ) && ! (GXutil.strcmp("", A4799AlRPieUltC)==0) )
                  {
                     A4796AlRPieClaA = (byte)(33) ;
                  }
                  else
                  {
                     if ( (GXutil.strcmp("", A4799AlRPieUltC)==0) )
                     {
                        A4796AlRPieClaA = (byte)(0) ;
                     }
                     else
                     {
                        A4796AlRPieClaA = (byte)(0) ;
                     }
                  }
               }
            }
            if ( (0==A4798AlRPieClaM) )
            {
               A4794AlRPieCla = A4796AlRPieClaA ;
            }
            else
            {
               A4794AlRPieCla = A4798AlRPieClaM ;
            }
            if ( A4806AlRPieDefC <= A2157AlbRecMtr.divide(DecimalUtil.doubleToDec(10), 18, java.math.RoundingMode.DOWN).doubleValue() )
            {
               A4797AlRPieClaC = httpContext.getMessage( "A", "") ;
            }
            else
            {
               if ( ( A4806AlRPieDefC > A2157AlbRecMtr.divide(DecimalUtil.doubleToDec(10), 18, java.math.RoundingMode.DOWN).doubleValue() ) && ( A4806AlRPieDefC <= A2157AlbRecMtr.multiply(DecimalUtil.doubleToDec(14)).divide(DecimalUtil.doubleToDec(50), 18, java.math.RoundingMode.DOWN).doubleValue() ) )
               {
                  A4797AlRPieClaC = httpContext.getMessage( "B", "") ;
               }
               else
               {
                  if ( ( A4806AlRPieDefC > A2157AlbRecMtr.multiply(DecimalUtil.doubleToDec(14)).divide(DecimalUtil.doubleToDec(50), 18, java.math.RoundingMode.DOWN).doubleValue() ) && ( A4806AlRPieDefC <= A2157AlbRecMtr.divide(DecimalUtil.doubleToDec(2), 18, java.math.RoundingMode.DOWN).doubleValue() ) )
                  {
                     A4797AlRPieClaC = httpContext.getMessage( "C", "") ;
                  }
                  else
                  {
                     A4797AlRPieClaC = httpContext.getMessage( "D", "") ;
                  }
               }
            }
            h6TO0( false, 336) ;
            getPrinter().GxAttris("Tahoma", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Defecto", ""), 151, Gx_line+318, 198, Gx_line+332, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fase", ""), 324, Gx_line+318, 352, Gx_line+332, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Pnt", ""), 450, Gx_line+318, 471, Gx_line+332, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cnt", ""), 517, Gx_line+318, 538, Gx_line+332, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Tot", ""), 570, Gx_line+318, 591, Gx_line+332, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Principal", ""), 605, Gx_line+318, 656, Gx_line+332, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A5259AlrPieMtrA, "ZZZZZ9.99")), 198, Gx_line+275, 265, Gx_line+291, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(133, Gx_line+268, 405, Gx_line+303, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A5260AlrPieKgmA, "ZZZZZ9.99")), 317, Gx_line+275, 384, Gx_line+291, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Kilos", ""), 280, Gx_line+278, 310, Gx_line+293, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Metros", ""), 147, Gx_line+278, 193, Gx_line+293, 1+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(133, Gx_line+214, 405, Gx_line+249, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A971ProceNom, "")), 445, Gx_line+140, 602, Gx_line+156, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Telar", ""), 404, Gx_line+143, 435, Gx_line+158, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1291AlbRDes, "")), 268, Gx_line+140, 373, Gx_line+156, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Lote de Pelo", ""), 133, Gx_line+143, 214, Gx_line+158, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(120, Gx_line+132, 690, Gx_line+167, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4795AlRPieCal, "")), 539, Gx_line+85, 623, Gx_line+101, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Calidad Actual", ""), 445, Gx_line+89, 537, Gx_line+104, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4798AlRPieClaM), "99")), 648, Gx_line+224, 675, Gx_line+245, 2, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Manual", ""), 580, Gx_line+227, 627, Gx_line+242, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4797AlRPieClaC, "")), 530, Gx_line+224, 544, Gx_line+240, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Tejido", ""), 445, Gx_line+227, 485, Gx_line+242, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2155AlbRecKgm, "ZZZZZ9.99")), 317, Gx_line+221, 384, Gx_line+237, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2157AlbRecMtr, "ZZZZZ9.99")), 198, Gx_line+221, 265, Gx_line+237, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Kilos", ""), 280, Gx_line+224, 310, Gx_line+239, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Metros", ""), 147, Gx_line+224, 193, Gx_line+239, 1+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(120, Gx_line+186, 419, Gx_line+316, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawRect(120, Gx_line+51, 690, Gx_line+114, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4799AlRPieUltC, "")), 268, Gx_line+85, 369, Gx_line+101, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4804AlRPieFasL), "ZZZ9")), 639, Gx_line+58, 669, Gx_line+74, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4803AlRPieFasC, "")), 522, Gx_line+58, 623, Gx_line+74, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4801AlRPieBarR), "9")), 342, Gx_line+58, 350, Gx_line+74, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4802AlRPieBarP, "")), 365, Gx_line+58, 379, Gx_line+74, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4800AlRPieBarC), "ZZZZZZZ9")), 268, Gx_line+58, 327, Gx_line+74, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Hoja de Ruta Actual", ""), 133, Gx_line+61, 263, Gx_line+76, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fase Actual", ""), 445, Gx_line+61, 518, Gx_line+76, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Ultimo Control ", ""), 133, Gx_line+89, 231, Gx_line+104, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(431, Gx_line+186, 689, Gx_line+249, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Actual", ""), 445, Gx_line+197, 487, Gx_line+212, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4794AlRPieCla), "99")), 526, Gx_line+194, 553, Gx_line+215, 2, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Acabado", ""), 580, Gx_line+197, 636, Gx_line+212, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4796AlRPieClaA), "99")), 648, Gx_line+194, 675, Gx_line+215, 2, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 9, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Clasificación", ""), 441, Gx_line+180, 526, Gx_line+194, 1, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Acabado", ""), 147, Gx_line+261, 215, Gx_line+275, 1, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Crudo", ""), 147, Gx_line+207, 215, Gx_line+221, 1, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Medidas", ""), 133, Gx_line+180, 201, Gx_line+194, 1, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Crudo", ""), 133, Gx_line+126, 201, Gx_line+140, 1, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Situación", ""), 133, Gx_line+45, 201, Gx_line+59, 1, 0, 0, 0) ;
            getPrinter().GxDrawLine(130, Gx_line+335, 679, Gx_line+335, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A3731AlbRecIdPz, "")), 526, Gx_line+275, 605, Gx_line+291, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Pieza", ""), 445, Gx_line+278, 478, Gx_line+293, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(431, Gx_line+268, 695, Gx_line+303, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 9, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Procedencia", ""), 445, Gx_line+261, 545, Gx_line+275, 1, 0, 0, 0) ;
            getPrinter().GxDrawRect(120, Gx_line+6, 690, Gx_line+39, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2159AlbRecPie, "")), 268, Gx_line+14, 382, Gx_line+30, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Codigo de Pieza", ""), 133, Gx_line+17, 235, Gx_line+32, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+336) ;
            GxHdr4 = true ;
            /* Using cursor P06TO4 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A4395AlRDefCod = P06TO4_A4395AlRDefCod[0] ;
               A5261AlrDefPri = P06TO4_A5261AlrDefPri[0] ;
               n5261AlrDefPri = P06TO4_n5261AlrDefPri[0] ;
               A4404AlRDef = P06TO4_A4404AlRDef[0] ;
               A4403AlRDefCnt = P06TO4_A4403AlRDefCnt[0] ;
               n4403AlRDefCnt = P06TO4_n4403AlRDefCnt[0] ;
               A4397AlRDefPnt = P06TO4_A4397AlRDefPnt[0] ;
               n4397AlRDefPnt = P06TO4_n4397AlRDefPnt[0] ;
               A4396AlRDefDsc = P06TO4_A4396AlRDefDsc[0] ;
               n4396AlRDefDsc = P06TO4_n4396AlRDefDsc[0] ;
               A4412AlRFasCod = P06TO4_A4412AlRFasCod[0] ;
               A4397AlRDefPnt = P06TO4_A4397AlRDefPnt[0] ;
               n4397AlRDefPnt = P06TO4_n4397AlRDefPnt[0] ;
               A4396AlRDefDsc = P06TO4_A4396AlRDefDsc[0] ;
               n4396AlRDefDsc = P06TO4_n4396AlRDefDsc[0] ;
               AV8Principal = ((A5261AlrDefPri==1) ? httpContext.getMessage( "Principal", "") : "") ;
               h6TO0( false, 16) ;
               getPrinter().GxAttris("Tahoma", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4396AlRDefDsc, "")), 151, Gx_line+0, 308, Gx_line+16, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4412AlRFasCod, "")), 324, Gx_line+0, 425, Gx_line+16, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4397AlRDefPnt), "ZZZ9")), 441, Gx_line+0, 471, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A4403AlRDefCnt, "ZZZ9.99")), 485, Gx_line+0, 537, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4404AlRDef), "ZZZZ9")), 553, Gx_line+0, 590, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV8Principal, "")), 605, Gx_line+0, 658, Gx_line+16, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+16) ;
               pr_default.readNext(1);
            }
            pr_default.close(1);
            GxHdr4 = false ;
            h6TO0( false, 51) ;
            getPrinter().GxAttris("Tahoma", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4805AlRPieDefT), "ZZZZZ9")), 494, Gx_line+0, 539, Gx_line+16, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Total de Defectos (Último control)", ""), 264, Gx_line+0, 483, Gx_line+15, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4806AlRPieDefC), "ZZZZZ9")), 494, Gx_line+27, 539, Gx_line+43, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Total de Defectos (Crudo)", ""), 264, Gx_line+27, 431, Gx_line+42, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+51) ;
            h6TO0( false, 24) ;
            getPrinter().GxAttris("Tahoma", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("#", 27, Gx_line+1, 37, Gx_line+15, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 41, Gx_line+1, 76, Gx_line+15, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Tipo", ""), 151, Gx_line+1, 177, Gx_line+15, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Kilos", ""), 219, Gx_line+1, 247, Gx_line+15, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Metros", ""), 275, Gx_line+1, 316, Gx_line+15, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "HDR", ""), 340, Gx_line+1, 366, Gx_line+15, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Proceso", ""), 393, Gx_line+1, 441, Gx_line+15, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fase", ""), 455, Gx_line+1, 483, Gx_line+15, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Embarque", ""), 518, Gx_line+1, 578, Gx_line+15, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Alm", ""), 579, Gx_line+1, 603, Gx_line+15, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Articulo", ""), 606, Gx_line+1, 653, Gx_line+15, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Usuario", ""), 727, Gx_line+1, 773, Gx_line+15, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(0, Gx_line+18, 809, Gx_line+18, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+24) ;
            GxHdr6 = true ;
            /* Using cursor P06TO5 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A5267AREDsc = P06TO5_A5267AREDsc[0] ;
               n5267AREDsc = P06TO5_n5267AREDsc[0] ;
               A5276AREUsu = P06TO5_A5276AREUsu[0] ;
               n5276AREUsu = P06TO5_n5276AREUsu[0] ;
               A5275AREArt = P06TO5_A5275AREArt[0] ;
               n5275AREArt = P06TO5_n5275AREArt[0] ;
               A5271AREAlmCod = P06TO5_A5271AREAlmCod[0] ;
               n5271AREAlmCod = P06TO5_n5271AREAlmCod[0] ;
               A5270AREAlbProC = P06TO5_A5270AREAlbProC[0] ;
               n5270AREAlbProC = P06TO5_n5270AREAlbProC[0] ;
               A5269AREFasCod = P06TO5_A5269AREFasCod[0] ;
               n5269AREFasCod = P06TO5_n5269AREFasCod[0] ;
               A5268AREProCod = P06TO5_A5268AREProCod[0] ;
               n5268AREProCod = P06TO5_n5268AREProCod[0] ;
               A5265AREBarCodP = P06TO5_A5265AREBarCodP[0] ;
               n5265AREBarCodP = P06TO5_n5265AREBarCodP[0] ;
               A5264AREBarCodR = P06TO5_A5264AREBarCodR[0] ;
               n5264AREBarCodR = P06TO5_n5264AREBarCodR[0] ;
               A5263AREBarCod = P06TO5_A5263AREBarCod[0] ;
               n5263AREBarCod = P06TO5_n5263AREBarCod[0] ;
               A5274AREMtr = P06TO5_A5274AREMtr[0] ;
               n5274AREMtr = P06TO5_n5274AREMtr[0] ;
               A5273AREKgm = P06TO5_A5273AREKgm[0] ;
               n5273AREKgm = P06TO5_n5273AREKgm[0] ;
               A5272ARETip = P06TO5_A5272ARETip[0] ;
               n5272ARETip = P06TO5_n5272ARETip[0] ;
               A5266AREFch = P06TO5_A5266AREFch[0] ;
               n5266AREFch = P06TO5_n5266AREFch[0] ;
               A5262AlbRecEvt = P06TO5_A5262AlbRecEvt[0] ;
               h6TO0( false, 16) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5262AlbRecEvt), "ZZZ9")), 7, Gx_line+0, 37, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( A5266AREFch, "99/99/99 99:99:99"), 41, Gx_line+0, 166, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5272ARETip, "")), 169, Gx_line+0, 177, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A5273AREKgm, "ZZZZZ9.99")), 180, Gx_line+0, 247, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A5274AREMtr, "ZZZZZ9.99")), 250, Gx_line+0, 317, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5263AREBarCod), "ZZZZZ9")), 321, Gx_line+0, 366, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5264AREBarCodR), "9")), 368, Gx_line+0, 376, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5265AREBarCodP, "")), 381, Gx_line+0, 389, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5268AREProCod, "")), 393, Gx_line+0, 452, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5269AREFasCod, "")), 455, Gx_line+0, 514, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5270AREAlbProC), "ZZZZZZZZZ9")), 518, Gx_line+0, 592, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5271AREAlmCod), "9")), 595, Gx_line+0, 603, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5275AREArt, "")), 606, Gx_line+0, 724, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5276AREUsu, "")), 727, Gx_line+0, 801, Gx_line+17, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+16) ;
               AV10Lines = GXutil.gxmlines( A5267AREDsc, (short)(80)) ;
               AV11Lin = DecimalUtil.doubleToDec(1) ;
               while ( AV11Lin.doubleValue() <= AV10Lines )
               {
                  AV9Dsc = GXutil.gxgetmli( A5267AREDsc, (short)(DecimalUtil.decToDouble(AV11Lin)), (short)(80)) ;
                  AV11Lin = AV11Lin.add(DecimalUtil.doubleToDec(1)) ;
                  h6TO0( false, 16) ;
                  getPrinter().GxAttris("Tahoma", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9Dsc, "")), 180, Gx_line+0, 598, Gx_line+16, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+16) ;
               }
               pr_default.readNext(2);
            }
            pr_default.close(2);
            GxHdr6 = false ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6TO0( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void h6TO0( boolean bFoot ,
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
            getPrinter().GxAttris("Tahoma", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "ACATEX", ""), 21, Gx_line+1, 67, Gx_line+15, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fecha:", ""), 627, Gx_line+1, 666, Gx_line+15, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 725, Gx_line+0, 780, Gx_line+16, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Hora:", ""), 627, Gx_line+16, 659, Gx_line+30, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 679, Gx_line+15, 780, Gx_line+31, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Página:", ""), 627, Gx_line+30, 671, Gx_line+44, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 735, Gx_line+29, 780, Gx_line+45, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "HISTORIA DE LA PIEZA", ""), 340, Gx_line+45, 472, Gx_line+59, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+76) ;
            if ( GxHdr4 )
            {
               getPrinter().GxAttris("Tahoma", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Fase", ""), 324, Gx_line+0, 352, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Pnt", ""), 450, Gx_line+0, 471, Gx_line+14, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cnt", ""), 517, Gx_line+0, 538, Gx_line+14, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Tot", ""), 570, Gx_line+0, 591, Gx_line+14, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Principal", ""), 605, Gx_line+0, 656, Gx_line+14, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(130, Gx_line+18, 679, Gx_line+18, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Defecto", ""), 151, Gx_line+0, 198, Gx_line+14, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+23) ;
            }
            if ( GxHdr6 )
            {
               getPrinter().GxAttris("Tahoma", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText("#", 27, Gx_line+2, 37, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Tipo", ""), 151, Gx_line+2, 177, Gx_line+16, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Kilos", ""), 219, Gx_line+2, 247, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Metros", ""), 275, Gx_line+2, 316, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Tahoma", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "HDR", ""), 340, Gx_line+2, 366, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Proceso", ""), 393, Gx_line+2, 441, Gx_line+16, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Fase", ""), 455, Gx_line+2, 483, Gx_line+16, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Embarque", ""), 518, Gx_line+2, 578, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Alm", ""), 579, Gx_line+2, 603, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Articulo", ""), 606, Gx_line+2, 653, Gx_line+16, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Usuario", ""), 727, Gx_line+2, 773, Gx_line+16, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(0, Gx_line+19, 809, Gx_line+19, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 41, Gx_line+2, 76, Gx_line+16, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+26) ;
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
      this.aP0[0] = ralrhis.this.A396EmprCod;
      this.aP1[0] = ralrhis.this.A44AlbRecCod;
      this.aP2[0] = ralrhis.this.A2159AlbRecPie;
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
      P06TO3_A970ProceCod = new short[1] ;
      P06TO3_n970ProceCod = new boolean[] {false} ;
      P06TO3_A44AlbRecCod = new int[1] ;
      P06TO3_A3731AlbRecIdPz = new String[] {""} ;
      P06TO3_A2155AlbRecKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06TO3_A4795AlRPieCal = new String[] {""} ;
      P06TO3_A1291AlbRDes = new String[] {""} ;
      P06TO3_A971ProceNom = new String[] {""} ;
      P06TO3_n971ProceNom = new boolean[] {false} ;
      P06TO3_A396EmprCod = new String[] {""} ;
      P06TO3_A2159AlbRecPie = new String[] {""} ;
      P06TO3_A4806AlRPieDefC = new int[1] ;
      P06TO3_A4802AlRPieBarP = new String[] {""} ;
      P06TO3_A4801AlRPieBarR = new byte[1] ;
      P06TO3_A4800AlRPieBarC = new int[1] ;
      P06TO3_A4798AlRPieClaM = new byte[1] ;
      P06TO3_n4798AlRPieClaM = new boolean[] {false} ;
      P06TO3_A4799AlRPieUltC = new String[] {""} ;
      P06TO3_n4799AlRPieUltC = new boolean[] {false} ;
      P06TO3_A2157AlbRecMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06TO3_A4805AlRPieDefT = new int[1] ;
      A3731AlbRecIdPz = "" ;
      A2155AlbRecKgm = DecimalUtil.ZERO ;
      A4795AlRPieCal = "" ;
      A1291AlbRDes = "" ;
      A971ProceNom = "" ;
      A4802AlRPieBarP = "" ;
      A4799AlRPieUltC = "" ;
      A2157AlbRecMtr = DecimalUtil.ZERO ;
      A5259AlrPieMtrA = DecimalUtil.ZERO ;
      A5260AlrPieKgmA = DecimalUtil.ZERO ;
      GXt_decimal1 = DecimalUtil.ZERO ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      GXv_int9 = new short[1] ;
      A4803AlRPieFasC = "" ;
      GXt_char10 = "" ;
      GXv_char6 = new String[1] ;
      GXv_int3 = new int[1] ;
      GXv_int4 = new byte[1] ;
      GXv_char5 = new String[1] ;
      GXv_char2 = new String[1] ;
      A4797AlRPieClaC = "" ;
      P06TO4_A4395AlRDefCod = new short[1] ;
      P06TO4_A396EmprCod = new String[] {""} ;
      P06TO4_A44AlbRecCod = new int[1] ;
      P06TO4_A2159AlbRecPie = new String[] {""} ;
      P06TO4_A5261AlrDefPri = new byte[1] ;
      P06TO4_n5261AlrDefPri = new boolean[] {false} ;
      P06TO4_A4404AlRDef = new int[1] ;
      P06TO4_A4403AlRDefCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06TO4_n4403AlRDefCnt = new boolean[] {false} ;
      P06TO4_A4397AlRDefPnt = new short[1] ;
      P06TO4_n4397AlRDefPnt = new boolean[] {false} ;
      P06TO4_A4396AlRDefDsc = new String[] {""} ;
      P06TO4_n4396AlRDefDsc = new boolean[] {false} ;
      P06TO4_A4412AlRFasCod = new String[] {""} ;
      A4403AlRDefCnt = DecimalUtil.ZERO ;
      A4396AlRDefDsc = "" ;
      A4412AlRFasCod = "" ;
      AV8Principal = "" ;
      P06TO5_A5267AREDsc = new String[] {""} ;
      P06TO5_n5267AREDsc = new boolean[] {false} ;
      P06TO5_A396EmprCod = new String[] {""} ;
      P06TO5_A44AlbRecCod = new int[1] ;
      P06TO5_A2159AlbRecPie = new String[] {""} ;
      P06TO5_A5276AREUsu = new String[] {""} ;
      P06TO5_n5276AREUsu = new boolean[] {false} ;
      P06TO5_A5275AREArt = new String[] {""} ;
      P06TO5_n5275AREArt = new boolean[] {false} ;
      P06TO5_A5271AREAlmCod = new byte[1] ;
      P06TO5_n5271AREAlmCod = new boolean[] {false} ;
      P06TO5_A5270AREAlbProC = new long[1] ;
      P06TO5_n5270AREAlbProC = new boolean[] {false} ;
      P06TO5_A5269AREFasCod = new String[] {""} ;
      P06TO5_n5269AREFasCod = new boolean[] {false} ;
      P06TO5_A5268AREProCod = new String[] {""} ;
      P06TO5_n5268AREProCod = new boolean[] {false} ;
      P06TO5_A5265AREBarCodP = new String[] {""} ;
      P06TO5_n5265AREBarCodP = new boolean[] {false} ;
      P06TO5_A5264AREBarCodR = new byte[1] ;
      P06TO5_n5264AREBarCodR = new boolean[] {false} ;
      P06TO5_A5263AREBarCod = new int[1] ;
      P06TO5_n5263AREBarCod = new boolean[] {false} ;
      P06TO5_A5274AREMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06TO5_n5274AREMtr = new boolean[] {false} ;
      P06TO5_A5273AREKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06TO5_n5273AREKgm = new boolean[] {false} ;
      P06TO5_A5272ARETip = new String[] {""} ;
      P06TO5_n5272ARETip = new boolean[] {false} ;
      P06TO5_A5266AREFch = new java.util.Date[] {GXutil.nullDate()} ;
      P06TO5_n5266AREFch = new boolean[] {false} ;
      P06TO5_A5262AlbRecEvt = new short[1] ;
      A5267AREDsc = "" ;
      A5276AREUsu = "" ;
      A5275AREArt = "" ;
      A5269AREFasCod = "" ;
      A5268AREProCod = "" ;
      A5265AREBarCodP = "" ;
      A5274AREMtr = DecimalUtil.ZERO ;
      A5273AREKgm = DecimalUtil.ZERO ;
      A5272ARETip = "" ;
      A5266AREFch = GXutil.resetTime( GXutil.nullDate() );
      AV11Lin = DecimalUtil.ZERO ;
      AV9Dsc = "" ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ralrhis__default(),
         new Object[] {
             new Object[] {
            P06TO3_A970ProceCod, P06TO3_n970ProceCod, P06TO3_A44AlbRecCod, P06TO3_A3731AlbRecIdPz, P06TO3_A2155AlbRecKgm, P06TO3_A4795AlRPieCal, P06TO3_A1291AlbRDes, P06TO3_A971ProceNom, P06TO3_n971ProceNom, P06TO3_A396EmprCod,
            P06TO3_A2159AlbRecPie, P06TO3_A4806AlRPieDefC, P06TO3_A4802AlRPieBarP, P06TO3_A4801AlRPieBarR, P06TO3_A4800AlRPieBarC, P06TO3_A4798AlRPieClaM, P06TO3_n4798AlRPieClaM, P06TO3_A4799AlRPieUltC, P06TO3_n4799AlRPieUltC, P06TO3_A2157AlbRecMtr,
            P06TO3_A4805AlRPieDefT
            }
            , new Object[] {
            P06TO4_A4395AlRDefCod, P06TO4_A396EmprCod, P06TO4_A44AlbRecCod, P06TO4_A2159AlbRecPie, P06TO4_A5261AlrDefPri, P06TO4_n5261AlrDefPri, P06TO4_A4404AlRDef, P06TO4_A4403AlRDefCnt, P06TO4_n4403AlRDefCnt, P06TO4_A4397AlRDefPnt,
            P06TO4_n4397AlRDefPnt, P06TO4_A4396AlRDefDsc, P06TO4_n4396AlRDefDsc, P06TO4_A4412AlRFasCod
            }
            , new Object[] {
            P06TO5_A5267AREDsc, P06TO5_n5267AREDsc, P06TO5_A396EmprCod, P06TO5_A44AlbRecCod, P06TO5_A2159AlbRecPie, P06TO5_A5276AREUsu, P06TO5_n5276AREUsu, P06TO5_A5275AREArt, P06TO5_n5275AREArt, P06TO5_A5271AREAlmCod,
            P06TO5_n5271AREAlmCod, P06TO5_A5270AREAlbProC, P06TO5_n5270AREAlbProC, P06TO5_A5269AREFasCod, P06TO5_n5269AREFasCod, P06TO5_A5268AREProCod, P06TO5_n5268AREProCod, P06TO5_A5265AREBarCodP, P06TO5_n5265AREBarCodP, P06TO5_A5264AREBarCodR,
            P06TO5_n5264AREBarCodR, P06TO5_A5263AREBarCod, P06TO5_n5263AREBarCod, P06TO5_A5274AREMtr, P06TO5_n5274AREMtr, P06TO5_A5273AREKgm, P06TO5_n5273AREKgm, P06TO5_A5272ARETip, P06TO5_n5272ARETip, P06TO5_A5266AREFch,
            P06TO5_n5266AREFch, P06TO5_A5262AlbRecEvt
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

   private byte A4801AlRPieBarR ;
   private byte A4798AlRPieClaM ;
   private byte GXv_int4[] ;
   private byte A4796AlRPieClaA ;
   private byte A4794AlRPieCla ;
   private byte A5261AlrDefPri ;
   private byte A5271AREAlmCod ;
   private byte A5264AREBarCodR ;
   private short A970ProceCod ;
   private short A4804AlRPieFasL ;
   private short GXt_int8 ;
   private short GXv_int9[] ;
   private short A4395AlRDefCod ;
   private short A4397AlRDefPnt ;
   private short A5262AlbRecEvt ;
   private short Gx_err ;
   private int A44AlbRecCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A4806AlRPieDefC ;
   private int A4800AlRPieBarC ;
   private int A4805AlRPieDefT ;
   private int GXv_int3[] ;
   private int Gx_OldLine ;
   private int A4404AlRDef ;
   private int A5263AREBarCod ;
   private long A5270AREAlbProC ;
   private long AV10Lines ;
   private java.math.BigDecimal A2155AlbRecKgm ;
   private java.math.BigDecimal A2157AlbRecMtr ;
   private java.math.BigDecimal A5259AlrPieMtrA ;
   private java.math.BigDecimal A5260AlrPieKgmA ;
   private java.math.BigDecimal GXt_decimal1 ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal A4403AlRDefCnt ;
   private java.math.BigDecimal A5274AREMtr ;
   private java.math.BigDecimal A5273AREKgm ;
   private java.math.BigDecimal AV11Lin ;
   private String A396EmprCod ;
   private String A2159AlbRecPie ;
   private String scmdbuf ;
   private String A3731AlbRecIdPz ;
   private String A4795AlRPieCal ;
   private String A1291AlbRDes ;
   private String A971ProceNom ;
   private String A4802AlRPieBarP ;
   private String A4799AlRPieUltC ;
   private String A4803AlRPieFasC ;
   private String GXt_char10 ;
   private String GXv_char6[] ;
   private String GXv_char5[] ;
   private String GXv_char2[] ;
   private String A4797AlRPieClaC ;
   private String A4396AlRDefDsc ;
   private String A4412AlRFasCod ;
   private String AV8Principal ;
   private String A5276AREUsu ;
   private String A5275AREArt ;
   private String A5269AREFasCod ;
   private String A5268AREProCod ;
   private String A5265AREBarCodP ;
   private String A5272ARETip ;
   private String AV9Dsc ;
   private String Gx_time ;
   private java.util.Date A5266AREFch ;
   private java.util.Date Gx_date ;
   private boolean n970ProceCod ;
   private boolean n971ProceNom ;
   private boolean n4798AlRPieClaM ;
   private boolean n4799AlRPieUltC ;
   private boolean GxHdr4 ;
   private boolean n5261AlrDefPri ;
   private boolean n4403AlRDefCnt ;
   private boolean n4397AlRDefPnt ;
   private boolean n4396AlRDefDsc ;
   private boolean GxHdr6 ;
   private boolean n5267AREDsc ;
   private boolean n5276AREUsu ;
   private boolean n5275AREArt ;
   private boolean n5271AREAlmCod ;
   private boolean n5270AREAlbProC ;
   private boolean n5269AREFasCod ;
   private boolean n5268AREProCod ;
   private boolean n5265AREBarCodP ;
   private boolean n5264AREBarCodR ;
   private boolean n5263AREBarCod ;
   private boolean n5274AREMtr ;
   private boolean n5273AREKgm ;
   private boolean n5272ARETip ;
   private boolean n5266AREFch ;
   private String A5267AREDsc ;
   private String[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private short[] P06TO3_A970ProceCod ;
   private boolean[] P06TO3_n970ProceCod ;
   private int[] P06TO3_A44AlbRecCod ;
   private String[] P06TO3_A3731AlbRecIdPz ;
   private java.math.BigDecimal[] P06TO3_A2155AlbRecKgm ;
   private String[] P06TO3_A4795AlRPieCal ;
   private String[] P06TO3_A1291AlbRDes ;
   private String[] P06TO3_A971ProceNom ;
   private boolean[] P06TO3_n971ProceNom ;
   private String[] P06TO3_A396EmprCod ;
   private String[] P06TO3_A2159AlbRecPie ;
   private int[] P06TO3_A4806AlRPieDefC ;
   private String[] P06TO3_A4802AlRPieBarP ;
   private byte[] P06TO3_A4801AlRPieBarR ;
   private int[] P06TO3_A4800AlRPieBarC ;
   private byte[] P06TO3_A4798AlRPieClaM ;
   private boolean[] P06TO3_n4798AlRPieClaM ;
   private String[] P06TO3_A4799AlRPieUltC ;
   private boolean[] P06TO3_n4799AlRPieUltC ;
   private java.math.BigDecimal[] P06TO3_A2157AlbRecMtr ;
   private int[] P06TO3_A4805AlRPieDefT ;
   private short[] P06TO4_A4395AlRDefCod ;
   private String[] P06TO4_A396EmprCod ;
   private int[] P06TO4_A44AlbRecCod ;
   private String[] P06TO4_A2159AlbRecPie ;
   private byte[] P06TO4_A5261AlrDefPri ;
   private boolean[] P06TO4_n5261AlrDefPri ;
   private int[] P06TO4_A4404AlRDef ;
   private java.math.BigDecimal[] P06TO4_A4403AlRDefCnt ;
   private boolean[] P06TO4_n4403AlRDefCnt ;
   private short[] P06TO4_A4397AlRDefPnt ;
   private boolean[] P06TO4_n4397AlRDefPnt ;
   private String[] P06TO4_A4396AlRDefDsc ;
   private boolean[] P06TO4_n4396AlRDefDsc ;
   private String[] P06TO4_A4412AlRFasCod ;
   private String[] P06TO5_A5267AREDsc ;
   private boolean[] P06TO5_n5267AREDsc ;
   private String[] P06TO5_A396EmprCod ;
   private int[] P06TO5_A44AlbRecCod ;
   private String[] P06TO5_A2159AlbRecPie ;
   private String[] P06TO5_A5276AREUsu ;
   private boolean[] P06TO5_n5276AREUsu ;
   private String[] P06TO5_A5275AREArt ;
   private boolean[] P06TO5_n5275AREArt ;
   private byte[] P06TO5_A5271AREAlmCod ;
   private boolean[] P06TO5_n5271AREAlmCod ;
   private long[] P06TO5_A5270AREAlbProC ;
   private boolean[] P06TO5_n5270AREAlbProC ;
   private String[] P06TO5_A5269AREFasCod ;
   private boolean[] P06TO5_n5269AREFasCod ;
   private String[] P06TO5_A5268AREProCod ;
   private boolean[] P06TO5_n5268AREProCod ;
   private String[] P06TO5_A5265AREBarCodP ;
   private boolean[] P06TO5_n5265AREBarCodP ;
   private byte[] P06TO5_A5264AREBarCodR ;
   private boolean[] P06TO5_n5264AREBarCodR ;
   private int[] P06TO5_A5263AREBarCod ;
   private boolean[] P06TO5_n5263AREBarCod ;
   private java.math.BigDecimal[] P06TO5_A5274AREMtr ;
   private boolean[] P06TO5_n5274AREMtr ;
   private java.math.BigDecimal[] P06TO5_A5273AREKgm ;
   private boolean[] P06TO5_n5273AREKgm ;
   private String[] P06TO5_A5272ARETip ;
   private boolean[] P06TO5_n5272ARETip ;
   private java.util.Date[] P06TO5_A5266AREFch ;
   private boolean[] P06TO5_n5266AREFch ;
   private short[] P06TO5_A5262AlbRecEvt ;
}

final  class ralrhis__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06TO3", "SELECT T2.ProceCod, T1.AlbRecCod, T1.AlbRecIdPz, T1.AlbRecKgm, T1.AlRPieCal, T2.AlbRDes, T3.ProceNom, T1.EmprCod, T1.AlbRecPie, T1.AlRPieDefC, COALESCE( T4.AlRPieBarP, '') AS AlRPieBarP, COALESCE( T4.AlRPieBarR, 0) AS AlRPieBarR, COALESCE( T4.AlRPieBarC, 0) AS AlRPieBarC, T1.AlRPieClaM, T1.AlRPieUltC, T1.AlbRecMtr, T1.AlRPieDefT FROM (((TXPALBDET T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) LEFT JOIN TXPPROCED T3 ON T3.EmprCod = T1.EmprCod AND T3.ProceCod = T2.ProceCod) LEFT JOIN (SELECT T5.AlbRecCod, T6.AlbRecPie, MIN(T5.BarCod) AS AlRPieBarC, MIN(T5.BarCodReo) AS AlRPieBarR, MIN(T5.BarCodPar) AS AlRPieBarP FROM (TXPBARPIE T5 INNER JOIN TXPALBDET T6 ON T6.EmprCod = T5.EmprCod AND T6.AlbRecCod = T5.AlbRecCod) WHERE T5.EmprCod = ? and T5.BarPieCod = T6.AlbRecPie GROUP BY T5.AlbRecCod, T6.AlbRecPie ) T4 ON T4.AlbRecCod = T1.AlbRecCod AND T4.AlbRecPie = T1.AlbRecPie) WHERE T1.EmprCod = ? and T1.AlbRecCod = ? and T1.AlbRecPie = ? ORDER BY T1.EmprCod, T1.AlbRecCod, T1.AlbRecPie ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06TO4", "SELECT T1.AlRDefCod AS AlRDefCod, T1.EmprCod, T1.AlbRecCod, T1.AlbRecPie, T1.AlrDefPri, T1.AlRDef, T1.AlRDefCnt, T2.TipDefPnt AS AlRDefPnt, T2.TipDefDsc AS AlRDefDsc, T1.AlRFasCod FROM (TXPAlRPie T1 INNER JOIN TXPTIPDEF T2 ON T2.EmprCod = T1.EmprCod AND T2.TipDefCod = T1.AlRDefCod) WHERE (T1.EmprCod = ?) AND (T1.AlbRecCod = ?) AND (T1.AlbRecPie = ?) ORDER BY T1.AlRFasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06TO5", "SELECT AlrEvtDsc, EmprCod, albreccod, AlbRecPie, ALREVTUsu, ALREVTART, AlmCod, AlbProCod, FasCod, ProCod, BarCodPar, BarCodReo, BarCod, ALREVTMtr, AlrEvtKgm, AlrEvtTip, AlrEvtFch, AlbRecEvt FROM TXPALRHIS WHERE EmprCod = ? and albreccod = ? and AlbRecPie = ? ORDER BY EmprCod, albreccod, AlbRecPie, AlbRecEvt ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 15);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((String[]) buf[5])[0] = rslt.getString(5, 16);
               ((String[]) buf[6])[0] = rslt.getString(6, 20);
               ((String[]) buf[7])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 3);
               ((String[]) buf[10])[0] = rslt.getString(9, 9);
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((String[]) buf[12])[0] = rslt.getString(11, 1);
               ((byte[]) buf[13])[0] = rslt.getByte(12);
               ((int[]) buf[14])[0] = rslt.getInt(13);
               ((byte[]) buf[15])[0] = rslt.getByte(14);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(15, 8);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(16,2);
               ((int[]) buf[20])[0] = rslt.getInt(17);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 9);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(10, 8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 9);
               ((String[]) buf[5])[0] = rslt.getString(5, 10);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 16);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((long[]) buf[11])[0] = rslt.getLong(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(10, 8);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((byte[]) buf[19])[0] = rslt.getByte(12);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((int[]) buf[21])[0] = rslt.getInt(13);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(16, 1);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[29])[0] = rslt.getGXDateTime(17);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((short[]) buf[31])[0] = rslt.getShort(18);
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
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 9);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               return;
      }
   }

}

