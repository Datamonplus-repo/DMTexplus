package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class ralrmtx extends GXReport
{
   public ralrmtx( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ralrmtx.class ), "" );
   }

   public ralrmtx( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      ralrmtx.this.aP2 = new String[] {""};
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
      ralrmtx.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ralrmtx.this.A44AlbRecCod = aP1[0];
      this.aP1 = aP1;
      ralrmtx.this.A2159AlbRecPie = aP2[0];
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
         getPrinter().GxSetDocName("Detalle de Pieza Martex") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*6)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         /* Using cursor P06U63 */
         pr_default.execute(0, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A7408ALRPIELOC = P06U63_A7408ALRPIELOC[0] ;
            A2155AlbRecKgm = P06U63_A2155AlbRecKgm[0] ;
            A4806AlRPieDefC = P06U63_A4806AlRPieDefC[0] ;
            A4802AlRPieBarP = P06U63_A4802AlRPieBarP[0] ;
            A4801AlRPieBarR = P06U63_A4801AlRPieBarR[0] ;
            A4800AlRPieBarC = P06U63_A4800AlRPieBarC[0] ;
            A4799AlRPieUltC = P06U63_A4799AlRPieUltC[0] ;
            n4799AlRPieUltC = P06U63_n4799AlRPieUltC[0] ;
            A2157AlbRecMtr = P06U63_A2157AlbRecMtr[0] ;
            A4805AlRPieDefT = P06U63_A4805AlRPieDefT[0] ;
            A4798AlRPieClaM = P06U63_A4798AlRPieClaM[0] ;
            n4798AlRPieClaM = P06U63_n4798AlRPieClaM[0] ;
            A4802AlRPieBarP = P06U63_A4802AlRPieBarP[0] ;
            A4801AlRPieBarR = P06U63_A4801AlRPieBarR[0] ;
            A4800AlRPieBarC = P06U63_A4800AlRPieBarC[0] ;
            GXt_decimal1 = A5259AlrPieMtrA ;
            GXv_char2[0] = A396EmprCod ;
            GXv_int3[0] = A4800AlRPieBarC ;
            GXv_int4[0] = A4801AlRPieBarR ;
            GXv_char5[0] = A4802AlRPieBarP ;
            GXv_char6[0] = A2159AlbRecPie ;
            GXv_decimal7[0] = GXt_decimal1 ;
            new app.pbarpiemet(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_int4, GXv_char5, GXv_char6, GXv_decimal7) ;
            ralrmtx.this.A396EmprCod = GXv_char2[0] ;
            ralrmtx.this.A4800AlRPieBarC = GXv_int3[0] ;
            ralrmtx.this.A4801AlRPieBarR = GXv_int4[0] ;
            ralrmtx.this.A4802AlRPieBarP = GXv_char5[0] ;
            ralrmtx.this.A2159AlbRecPie = GXv_char6[0] ;
            ralrmtx.this.GXt_decimal1 = GXv_decimal7[0] ;
            A5259AlrPieMtrA = GXt_decimal1 ;
            GXt_decimal1 = A5260AlrPieKgmA ;
            GXv_char6[0] = A396EmprCod ;
            GXv_int3[0] = A4800AlRPieBarC ;
            GXv_int4[0] = A4801AlRPieBarR ;
            GXv_char5[0] = A4802AlRPieBarP ;
            GXv_char2[0] = A2159AlbRecPie ;
            GXv_decimal7[0] = GXt_decimal1 ;
            new app.pbarpiekil(remoteHandle, context).execute( GXv_char6, GXv_int3, GXv_int4, GXv_char5, GXv_char2, GXv_decimal7) ;
            ralrmtx.this.A396EmprCod = GXv_char6[0] ;
            ralrmtx.this.A4800AlRPieBarC = GXv_int3[0] ;
            ralrmtx.this.A4801AlRPieBarR = GXv_int4[0] ;
            ralrmtx.this.A4802AlRPieBarP = GXv_char5[0] ;
            ralrmtx.this.A2159AlbRecPie = GXv_char2[0] ;
            ralrmtx.this.GXt_decimal1 = GXv_decimal7[0] ;
            A5260AlrPieKgmA = GXt_decimal1 ;
            GXt_int8 = A4804AlRPieFasL ;
            GXv_char6[0] = A396EmprCod ;
            GXv_int3[0] = A4800AlRPieBarC ;
            GXv_int4[0] = A4801AlRPieBarR ;
            GXv_char5[0] = A4802AlRPieBarP ;
            GXv_int9[0] = GXt_int8 ;
            new app.pbarfaslin(remoteHandle, context).execute( GXv_char6, GXv_int3, GXv_int4, GXv_char5, GXv_int9) ;
            ralrmtx.this.A396EmprCod = GXv_char6[0] ;
            ralrmtx.this.A4800AlRPieBarC = GXv_int3[0] ;
            ralrmtx.this.A4801AlRPieBarR = GXv_int4[0] ;
            ralrmtx.this.A4802AlRPieBarP = GXv_char5[0] ;
            ralrmtx.this.GXt_int8 = GXv_int9[0] ;
            A4804AlRPieFasL = GXt_int8 ;
            GXt_char10 = A4803AlRPieFasC ;
            GXv_char6[0] = A396EmprCod ;
            GXv_int3[0] = A4800AlRPieBarC ;
            GXv_int4[0] = A4801AlRPieBarR ;
            GXv_char5[0] = A4802AlRPieBarP ;
            GXv_char2[0] = GXt_char10 ;
            new app.pbarfascod(remoteHandle, context).execute( GXv_char6, GXv_int3, GXv_int4, GXv_char5, GXv_char2) ;
            ralrmtx.this.A396EmprCod = GXv_char6[0] ;
            ralrmtx.this.A4800AlRPieBarC = GXv_int3[0] ;
            ralrmtx.this.A4801AlRPieBarR = GXv_int4[0] ;
            ralrmtx.this.A4802AlRPieBarP = GXv_char5[0] ;
            ralrmtx.this.GXt_char10 = GXv_char2[0] ;
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
            h6U60( false, 238) ;
            getPrinter().GxAttris("Tahoma", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Defecto", ""), 151, Gx_line+213, 198, Gx_line+227, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fase", ""), 324, Gx_line+213, 352, Gx_line+227, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Pnt", ""), 450, Gx_line+213, 471, Gx_line+227, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cnt", ""), 517, Gx_line+213, 538, Gx_line+227, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Tot", ""), 570, Gx_line+213, 591, Gx_line+227, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Principal", ""), 605, Gx_line+213, 656, Gx_line+227, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A5259AlrPieMtrA, "ZZZZZ9.99")), 198, Gx_line+170, 265, Gx_line+186, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(133, Gx_line+163, 405, Gx_line+198, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A5260AlrPieKgmA, "ZZZZZ9.99")), 317, Gx_line+170, 384, Gx_line+186, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Kilos", ""), 280, Gx_line+173, 310, Gx_line+188, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Metros", ""), 147, Gx_line+173, 193, Gx_line+188, 1+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(133, Gx_line+108, 405, Gx_line+143, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4798AlRPieClaM), "99")), 517, Gx_line+93, 544, Gx_line+114, 2, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Manual", ""), 449, Gx_line+96, 496, Gx_line+111, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2155AlbRecKgm, "ZZZZZ9.99")), 317, Gx_line+116, 384, Gx_line+132, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2157AlbRecMtr, "ZZZZZ9.99")), 198, Gx_line+116, 265, Gx_line+132, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Kilos", ""), 280, Gx_line+119, 310, Gx_line+134, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Metros", ""), 147, Gx_line+119, 193, Gx_line+134, 1+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(120, Gx_line+81, 419, Gx_line+211, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawRect(120, Gx_line+6, 690, Gx_line+69, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4799AlRPieUltC, "")), 268, Gx_line+41, 369, Gx_line+57, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4804AlRPieFasL), "ZZZ9")), 639, Gx_line+14, 669, Gx_line+30, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4803AlRPieFasC, "")), 522, Gx_line+14, 623, Gx_line+30, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4801AlRPieBarR), "9")), 342, Gx_line+14, 350, Gx_line+30, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4802AlRPieBarP, "")), 365, Gx_line+14, 379, Gx_line+30, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4800AlRPieBarC), "ZZZZZZZ9")), 268, Gx_line+14, 327, Gx_line+30, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Hoja de Ruta Actual", ""), 133, Gx_line+17, 263, Gx_line+32, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fase Actual", ""), 445, Gx_line+17, 518, Gx_line+32, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Ultimo Control ", ""), 133, Gx_line+44, 231, Gx_line+59, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(431, Gx_line+81, 689, Gx_line+144, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4794AlRPieCla), "99")), 623, Gx_line+93, 650, Gx_line+114, 2, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Actual", ""), 561, Gx_line+96, 603, Gx_line+111, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 9, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Clasificación", ""), 441, Gx_line+75, 526, Gx_line+89, 1, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Producción", ""), 147, Gx_line+156, 227, Gx_line+170, 1, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Crudo", ""), 147, Gx_line+102, 215, Gx_line+116, 1, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Medidas", ""), 133, Gx_line+75, 201, Gx_line+89, 1, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Situación", ""), 133, Gx_line+0, 201, Gx_line+14, 1, 0, 0, 0) ;
            getPrinter().GxDrawLine(130, Gx_line+230, 679, Gx_line+230, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Ubicacion", ""), 449, Gx_line+170, 509, Gx_line+185, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A7408ALRPIELOC, "")), 517, Gx_line+170, 570, Gx_line+186, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+238) ;
            GxHdr4 = true ;
            /* Using cursor P06U64 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A4395AlRDefCod = P06U64_A4395AlRDefCod[0] ;
               A5261AlrDefPri = P06U64_A5261AlrDefPri[0] ;
               n5261AlrDefPri = P06U64_n5261AlrDefPri[0] ;
               A4404AlRDef = P06U64_A4404AlRDef[0] ;
               A4403AlRDefCnt = P06U64_A4403AlRDefCnt[0] ;
               n4403AlRDefCnt = P06U64_n4403AlRDefCnt[0] ;
               A4397AlRDefPnt = P06U64_A4397AlRDefPnt[0] ;
               n4397AlRDefPnt = P06U64_n4397AlRDefPnt[0] ;
               A4396AlRDefDsc = P06U64_A4396AlRDefDsc[0] ;
               n4396AlRDefDsc = P06U64_n4396AlRDefDsc[0] ;
               A4412AlRFasCod = P06U64_A4412AlRFasCod[0] ;
               A4397AlRDefPnt = P06U64_A4397AlRDefPnt[0] ;
               n4397AlRDefPnt = P06U64_n4397AlRDefPnt[0] ;
               A4396AlRDefDsc = P06U64_A4396AlRDefDsc[0] ;
               n4396AlRDefDsc = P06U64_n4396AlRDefDsc[0] ;
               AV8Principal = ((A5261AlrDefPri==1) ? httpContext.getMessage( "Principal", "") : "") ;
               h6U60( false, 16) ;
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
            h6U60( false, 51) ;
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
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6U60( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void h6U60( boolean bFoot ,
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
            Gx_line = (int)(Gx_line+74) ;
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
      this.aP0[0] = ralrmtx.this.A396EmprCod;
      this.aP1[0] = ralrmtx.this.A44AlbRecCod;
      this.aP2[0] = ralrmtx.this.A2159AlbRecPie;
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
      P06U63_A44AlbRecCod = new int[1] ;
      P06U63_A7408ALRPIELOC = new String[] {""} ;
      P06U63_A2155AlbRecKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06U63_A4806AlRPieDefC = new int[1] ;
      P06U63_A396EmprCod = new String[] {""} ;
      P06U63_A2159AlbRecPie = new String[] {""} ;
      P06U63_A4802AlRPieBarP = new String[] {""} ;
      P06U63_A4801AlRPieBarR = new byte[1] ;
      P06U63_A4800AlRPieBarC = new int[1] ;
      P06U63_A4799AlRPieUltC = new String[] {""} ;
      P06U63_n4799AlRPieUltC = new boolean[] {false} ;
      P06U63_A2157AlbRecMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06U63_A4805AlRPieDefT = new int[1] ;
      P06U63_A4798AlRPieClaM = new byte[1] ;
      P06U63_n4798AlRPieClaM = new boolean[] {false} ;
      A7408ALRPIELOC = "" ;
      A2155AlbRecKgm = DecimalUtil.ZERO ;
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
      P06U64_A4395AlRDefCod = new short[1] ;
      P06U64_A396EmprCod = new String[] {""} ;
      P06U64_A44AlbRecCod = new int[1] ;
      P06U64_A2159AlbRecPie = new String[] {""} ;
      P06U64_A5261AlrDefPri = new byte[1] ;
      P06U64_n5261AlrDefPri = new boolean[] {false} ;
      P06U64_A4404AlRDef = new int[1] ;
      P06U64_A4403AlRDefCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06U64_n4403AlRDefCnt = new boolean[] {false} ;
      P06U64_A4397AlRDefPnt = new short[1] ;
      P06U64_n4397AlRDefPnt = new boolean[] {false} ;
      P06U64_A4396AlRDefDsc = new String[] {""} ;
      P06U64_n4396AlRDefDsc = new boolean[] {false} ;
      P06U64_A4412AlRFasCod = new String[] {""} ;
      A4403AlRDefCnt = DecimalUtil.ZERO ;
      A4396AlRDefDsc = "" ;
      A4412AlRFasCod = "" ;
      AV8Principal = "" ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ralrmtx__default(),
         new Object[] {
             new Object[] {
            P06U63_A44AlbRecCod, P06U63_A7408ALRPIELOC, P06U63_A2155AlbRecKgm, P06U63_A4806AlRPieDefC, P06U63_A396EmprCod, P06U63_A2159AlbRecPie, P06U63_A4802AlRPieBarP, P06U63_A4801AlRPieBarR, P06U63_A4800AlRPieBarC, P06U63_A4799AlRPieUltC,
            P06U63_n4799AlRPieUltC, P06U63_A2157AlbRecMtr, P06U63_A4805AlRPieDefT, P06U63_A4798AlRPieClaM, P06U63_n4798AlRPieClaM
            }
            , new Object[] {
            P06U64_A4395AlRDefCod, P06U64_A396EmprCod, P06U64_A44AlbRecCod, P06U64_A2159AlbRecPie, P06U64_A5261AlrDefPri, P06U64_n5261AlrDefPri, P06U64_A4404AlRDef, P06U64_A4403AlRDefCnt, P06U64_n4403AlRDefCnt, P06U64_A4397AlRDefPnt,
            P06U64_n4397AlRDefPnt, P06U64_A4396AlRDefDsc, P06U64_n4396AlRDefDsc, P06U64_A4412AlRFasCod
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
   private short A4804AlRPieFasL ;
   private short GXt_int8 ;
   private short GXv_int9[] ;
   private short A4395AlRDefCod ;
   private short A4397AlRDefPnt ;
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
   private java.math.BigDecimal A2155AlbRecKgm ;
   private java.math.BigDecimal A2157AlbRecMtr ;
   private java.math.BigDecimal A5259AlrPieMtrA ;
   private java.math.BigDecimal A5260AlrPieKgmA ;
   private java.math.BigDecimal GXt_decimal1 ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal A4403AlRDefCnt ;
   private String A396EmprCod ;
   private String A2159AlbRecPie ;
   private String scmdbuf ;
   private String A7408ALRPIELOC ;
   private String A4802AlRPieBarP ;
   private String A4799AlRPieUltC ;
   private String A4803AlRPieFasC ;
   private String GXt_char10 ;
   private String GXv_char6[] ;
   private String GXv_char5[] ;
   private String GXv_char2[] ;
   private String A4396AlRDefDsc ;
   private String A4412AlRFasCod ;
   private String AV8Principal ;
   private String Gx_time ;
   private java.util.Date Gx_date ;
   private boolean n4799AlRPieUltC ;
   private boolean n4798AlRPieClaM ;
   private boolean GxHdr4 ;
   private boolean n5261AlrDefPri ;
   private boolean n4403AlRDefCnt ;
   private boolean n4397AlRDefPnt ;
   private boolean n4396AlRDefDsc ;
   private String[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private int[] P06U63_A44AlbRecCod ;
   private String[] P06U63_A7408ALRPIELOC ;
   private java.math.BigDecimal[] P06U63_A2155AlbRecKgm ;
   private int[] P06U63_A4806AlRPieDefC ;
   private String[] P06U63_A396EmprCod ;
   private String[] P06U63_A2159AlbRecPie ;
   private String[] P06U63_A4802AlRPieBarP ;
   private byte[] P06U63_A4801AlRPieBarR ;
   private int[] P06U63_A4800AlRPieBarC ;
   private String[] P06U63_A4799AlRPieUltC ;
   private boolean[] P06U63_n4799AlRPieUltC ;
   private java.math.BigDecimal[] P06U63_A2157AlbRecMtr ;
   private int[] P06U63_A4805AlRPieDefT ;
   private byte[] P06U63_A4798AlRPieClaM ;
   private boolean[] P06U63_n4798AlRPieClaM ;
   private short[] P06U64_A4395AlRDefCod ;
   private String[] P06U64_A396EmprCod ;
   private int[] P06U64_A44AlbRecCod ;
   private String[] P06U64_A2159AlbRecPie ;
   private byte[] P06U64_A5261AlrDefPri ;
   private boolean[] P06U64_n5261AlrDefPri ;
   private int[] P06U64_A4404AlRDef ;
   private java.math.BigDecimal[] P06U64_A4403AlRDefCnt ;
   private boolean[] P06U64_n4403AlRDefCnt ;
   private short[] P06U64_A4397AlRDefPnt ;
   private boolean[] P06U64_n4397AlRDefPnt ;
   private String[] P06U64_A4396AlRDefDsc ;
   private boolean[] P06U64_n4396AlRDefDsc ;
   private String[] P06U64_A4412AlRFasCod ;
}

final  class ralrmtx__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06U63", "SELECT T1.AlbRecCod, T1.ALRPIELOC, T1.AlbRecKgm, T1.AlRPieDefC, T1.EmprCod, T1.AlbRecPie, COALESCE( T2.AlRPieBarP, '') AS AlRPieBarP, COALESCE( T2.AlRPieBarR, 0) AS AlRPieBarR, COALESCE( T2.AlRPieBarC, 0) AS AlRPieBarC, T1.AlRPieUltC, T1.AlbRecMtr, T1.AlRPieDefT, T1.AlRPieClaM FROM (TXPALBDET T1 LEFT JOIN (SELECT T3.AlbRecCod, T4.AlbRecPie, MIN(T3.BarCod) AS AlRPieBarC, MIN(T3.BarCodReo) AS AlRPieBarR, MIN(T3.BarCodPar) AS AlRPieBarP FROM (TXPBARPIE T3 INNER JOIN TXPALBDET T4 ON T4.EmprCod = T3.EmprCod AND T4.AlbRecCod = T3.AlbRecCod) WHERE T3.EmprCod = ? and T3.BarPieCod = T4.AlbRecPie GROUP BY T3.AlbRecCod, T4.AlbRecPie ) T2 ON T2.AlbRecCod = T1.AlbRecCod AND T2.AlbRecPie = T1.AlbRecPie) WHERE T1.EmprCod = ? and T1.AlbRecCod = ? and T1.AlbRecPie = ? ORDER BY T1.EmprCod, T1.AlbRecCod, T1.AlbRecPie ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06U64", "SELECT T1.AlRDefCod AS AlRDefCod, T1.EmprCod, T1.AlbRecCod, T1.AlbRecPie, T1.AlrDefPri, T1.AlRDef, T1.AlRDefCnt, T2.TipDefPnt AS AlRDefPnt, T2.TipDefDsc AS AlRDefDsc, T1.AlRFasCod FROM (TXPAlRPie T1 INNER JOIN TXPTIPDEF T2 ON T2.EmprCod = T1.EmprCod AND T2.TipDefCod = T1.AlRDefCod) WHERE (T1.EmprCod = ?) AND (T1.AlbRecCod = ?) AND (T1.AlbRecPie = ?) ORDER BY T1.AlRFasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,2);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((byte[]) buf[13])[0] = rslt.getByte(13);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
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
      }
   }

}

