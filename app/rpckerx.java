package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class rpckerx extends GXReport
{
   public rpckerx( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rpckerx.class ), "" );
   }

   public rpckerx( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 )
   {
      rpckerx.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      rpckerx.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      rpckerx.this.A6194PckErxNum = aP1[0];
      this.aP1 = aP1;
      rpckerx.this.AV9Idioma = aP2[0];
      this.aP2 = aP2;
      rpckerx.this.AV43Logo = aP3[0];
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
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "REPGRAF", "", 2, 1, 1, 15840, 12240, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("PACKING LIST EXPORT.- Edicion") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*1)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         AV10Bultos = (short)(1) ;
         AV32TG_Bultos = (short)(0) ;
         AV33TG_Bruto = DecimalUtil.doubleToDec(0) ;
         AV34TG_Neto = DecimalUtil.doubleToDec(0) ;
         AV12KgsBPar = DecimalUtil.doubleToDec(0) ;
         AV13KgsNPar = DecimalUtil.doubleToDec(0) ;
         AV39Primer_txt = (byte)(0) ;
         GxHdr2 = true ;
         /* Using cursor P073D2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A6194PckErxNum)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            brk73D2 = false ;
            A6204PckErxTxt = P073D2_A6204PckErxTxt[0] ;
            n6204PckErxTxt = P073D2_n6204PckErxTxt[0] ;
            A6195PckErxOrd = P073D2_A6195PckErxOrd[0] ;
            A6202PckErxFch = P073D2_A6202PckErxFch[0] ;
            n6202PckErxFch = P073D2_n6202PckErxFch[0] ;
            A7518PckErx2 = P073D2_A7518PckErx2[0] ;
            n7518PckErx2 = P073D2_n7518PckErx2[0] ;
            A7517PckErx1 = P073D2_A7517PckErx1[0] ;
            n7517PckErx1 = P073D2_n7517PckErx1[0] ;
            A6199PckErxPob = P073D2_A6199PckErxPob[0] ;
            n6199PckErxPob = P073D2_n6199PckErxPob[0] ;
            A6200PckErxPai = P073D2_A6200PckErxPai[0] ;
            n6200PckErxPai = P073D2_n6200PckErxPai[0] ;
            A6197PckErxNom = P073D2_A6197PckErxNom[0] ;
            n6197PckErxNom = P073D2_n6197PckErxNom[0] ;
            A6201PckErxNif = P073D2_A6201PckErxNif[0] ;
            n6201PckErxNif = P073D2_n6201PckErxNif[0] ;
            A6198PckErxDom = P073D2_A6198PckErxDom[0] ;
            n6198PckErxDom = P073D2_n6198PckErxDom[0] ;
            GX_I = 1 ;
            while ( GX_I <= 99 )
            {
               AV16Tab_Bultos[GX_I-1] = (short)(0) ;
               GX_I = (int)(GX_I+1) ;
            }
            GX_I = 1 ;
            while ( GX_I <= 99 )
            {
               AV17Tab_Color[GX_I-1] = "" ;
               GX_I = (int)(GX_I+1) ;
            }
            GX_I = 1 ;
            while ( GX_I <= 99 )
            {
               AV18Tab_Bruto[GX_I-1] = DecimalUtil.ZERO ;
               GX_I = (int)(GX_I+1) ;
            }
            GX_I = 1 ;
            while ( GX_I <= 99 )
            {
               AV19Tab_Neto[GX_I-1] = DecimalUtil.ZERO ;
               GX_I = (int)(GX_I+1) ;
            }
            while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P073D2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P073D2_A6194PckErxNum[0] == A6194PckErxNum ) )
            {
               brk73D2 = false ;
               A6204PckErxTxt = P073D2_A6204PckErxTxt[0] ;
               n6204PckErxTxt = P073D2_n6204PckErxTxt[0] ;
               A6195PckErxOrd = P073D2_A6195PckErxOrd[0] ;
               AV20NCol = (byte)(0) ;
               AV23TxtCol = "" ;
               AV37Cab_Txt = (byte)(1) ;
               if ( AV39Primer_txt != 0 )
               {
                  /* Eject command */
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(P_lines+1) ;
               }
               h73D0( false, 103) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A6204PckErxTxt, "")), 59, Gx_line+2, 791, Gx_line+101, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+103) ;
               AV39Primer_txt = (byte)(1) ;
               /* Execute user subroutine: 'CAB_LINEA' */
               S113 ();
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
               /* Using cursor P073D3 */
               pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A6194PckErxNum), Byte.valueOf(A6195PckErxOrd)});
               while ( (pr_default.getStatus(1) != 101) )
               {
                  brk73D5 = false ;
                  A6215PckErxKgN = P073D3_A6215PckErxKgN[0] ;
                  n6215PckErxKgN = P073D3_n6215PckErxKgN[0] ;
                  A6214PckErxKgB = P073D3_A6214PckErxKgB[0] ;
                  n6214PckErxKgB = P073D3_n6214PckErxKgB[0] ;
                  A6216PckErxCon = P073D3_A6216PckErxCon[0] ;
                  n6216PckErxCon = P073D3_n6216PckErxCon[0] ;
                  A6213PckErxCaj = P073D3_A6213PckErxCaj[0] ;
                  n6213PckErxCaj = P073D3_n6213PckErxCaj[0] ;
                  A6212PckErxNCo = P073D3_A6212PckErxNCo[0] ;
                  n6212PckErxNCo = P073D3_n6212PckErxNCo[0] ;
                  A6211PckErxCol = P073D3_A6211PckErxCol[0] ;
                  n6211PckErxCol = P073D3_n6211PckErxCol[0] ;
                  A6208PckErxHdr = P073D3_A6208PckErxHdr[0] ;
                  n6208PckErxHdr = P073D3_n6208PckErxHdr[0] ;
                  A6206PckErxLin = P073D3_A6206PckErxLin[0] ;
                  AV14KgsBCol = DecimalUtil.doubleToDec(0) ;
                  AV15KgsNCol = DecimalUtil.doubleToDec(0) ;
                  AV21Bultos_Col = (short)(0) ;
                  while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P073D3_A6211PckErxCol[0], A6211PckErxCol) == 0 ) && ( P073D3_A6212PckErxNCo[0] == A6212PckErxNCo ) )
                  {
                     brk73D5 = false ;
                     A6215PckErxKgN = P073D3_A6215PckErxKgN[0] ;
                     n6215PckErxKgN = P073D3_n6215PckErxKgN[0] ;
                     A6214PckErxKgB = P073D3_A6214PckErxKgB[0] ;
                     n6214PckErxKgB = P073D3_n6214PckErxKgB[0] ;
                     A6216PckErxCon = P073D3_A6216PckErxCon[0] ;
                     n6216PckErxCon = P073D3_n6216PckErxCon[0] ;
                     A6213PckErxCaj = P073D3_A6213PckErxCaj[0] ;
                     n6213PckErxCaj = P073D3_n6213PckErxCaj[0] ;
                     A6208PckErxHdr = P073D3_A6208PckErxHdr[0] ;
                     n6208PckErxHdr = P073D3_n6208PckErxHdr[0] ;
                     A6206PckErxLin = P073D3_A6206PckErxLin[0] ;
                     if ( GXutil.strcmp(P073D3_A396EmprCod[0], A396EmprCod) == 0 )
                     {
                        if ( P073D3_A6194PckErxNum[0] == A6194PckErxNum )
                        {
                           if ( P073D3_A6195PckErxOrd[0] == A6195PckErxOrd )
                           {
                              if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV12KgsBPar)==0) )
                              {
                                 /* Execute user subroutine: 'TOTAL_KGS' */
                                 S121 ();
                                 if ( returnInSub )
                                 {
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
                              }
                              /* Execute user subroutine: 'CAB_LINEA' */
                              S113 ();
                              if ( returnInSub )
                              {
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
                              while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P073D3_A6211PckErxCol[0], A6211PckErxCol) == 0 ) && ( P073D3_A6212PckErxNCo[0] == A6212PckErxNCo ) && ( P073D3_A6208PckErxHdr[0] == A6208PckErxHdr ) )
                              {
                                 brk73D5 = false ;
                                 A6215PckErxKgN = P073D3_A6215PckErxKgN[0] ;
                                 n6215PckErxKgN = P073D3_n6215PckErxKgN[0] ;
                                 A6214PckErxKgB = P073D3_A6214PckErxKgB[0] ;
                                 n6214PckErxKgB = P073D3_n6214PckErxKgB[0] ;
                                 A6216PckErxCon = P073D3_A6216PckErxCon[0] ;
                                 n6216PckErxCon = P073D3_n6216PckErxCon[0] ;
                                 A6213PckErxCaj = P073D3_A6213PckErxCaj[0] ;
                                 n6213PckErxCaj = P073D3_n6213PckErxCaj[0] ;
                                 A6206PckErxLin = P073D3_A6206PckErxLin[0] ;
                                 if ( GXutil.strcmp(P073D3_A396EmprCod[0], A396EmprCod) == 0 )
                                 {
                                    if ( P073D3_A6194PckErxNum[0] == A6194PckErxNum )
                                    {
                                       if ( P073D3_A6195PckErxOrd[0] == A6195PckErxOrd )
                                       {
                                          AV35Color = GXutil.trim( A6211PckErxCol) + " " + GXutil.str( A6212PckErxNCo, 6, 0) ;
                                          if ( AV36NLineas > 29 )
                                          {
                                             /* Eject command */
                                             Gx_OldLine = Gx_line ;
                                             Gx_line = (int)(P_lines+1) ;
                                          }
                                          h73D0( false, 18) ;
                                          getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                          getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10Bultos), "ZZZ9")), 33, Gx_line+1, 63, Gx_line+19, 2+256, 0, 0, 0) ;
                                          getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                          getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A6213PckErxCaj, "")), 424, Gx_line+1, 524, Gx_line+18, 0, 0, 0, 0) ;
                                          getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35Color, "")), 90, Gx_line+1, 315, Gx_line+18, 1, 0, 0, 0) ;
                                          getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                          getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6216PckErxCon), "ZZZ9")), 534, Gx_line+1, 564, Gx_line+19, 2+256, 0, 0, 0) ;
                                          getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6208PckErxHdr), "ZZZZZZZ9")), 330, Gx_line+1, 389, Gx_line+19, 2+256, 0, 0, 0) ;
                                          getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A6214PckErxKgB, "ZZZZZ9.99")), 584, Gx_line+1, 651, Gx_line+19, 2+256, 0, 0, 0) ;
                                          getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A6215PckErxKgN, "ZZZZZ9.99")), 668, Gx_line+1, 735, Gx_line+19, 2+256, 0, 0, 0) ;
                                          Gx_OldLine = Gx_line ;
                                          Gx_line = (int)(Gx_line+18) ;
                                          AV10Bultos = (short)(AV10Bultos+1) ;
                                          AV21Bultos_Col = (short)(AV21Bultos_Col+1) ;
                                          AV12KgsBPar = AV12KgsBPar.add(A6214PckErxKgB) ;
                                          AV13KgsNPar = AV13KgsNPar.add(A6215PckErxKgN) ;
                                          AV23TxtCol = AV35Color ;
                                          AV36NLineas = (byte)(AV36NLineas+1) ;
                                          AV38Cab_Linea = (byte)(0) ;
                                       }
                                    }
                                 }
                                 brk73D5 = true ;
                                 pr_default.readNext(1);
                              }
                              if ( AV36NLineas > 29 )
                              {
                                 /* Eject command */
                                 Gx_OldLine = Gx_line ;
                                 Gx_line = (int)(P_lines+1) ;
                              }
                              h73D0( false, 18) ;
                              getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(httpContext.getMessage( "Kgs.", ""), 532, Gx_line+0, 561, Gx_line+17, 0+256, 0, 0, 0) ;
                              getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV12KgsBPar, "ZZZZZ9.99")), 584, Gx_line+0, 651, Gx_line+18, 2+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV13KgsNPar, "ZZZZZ9.99")), 668, Gx_line+0, 735, Gx_line+18, 2+256, 0, 0, 0) ;
                              Gx_OldLine = Gx_line ;
                              Gx_line = (int)(Gx_line+18) ;
                              AV14KgsBCol = AV14KgsBCol.add(AV12KgsBPar) ;
                              AV15KgsNCol = AV15KgsNCol.add(AV13KgsNPar) ;
                              AV36NLineas = (byte)(AV36NLineas+1) ;
                           }
                        }
                     }
                     if ( ! brk73D5 )
                     {
                        brk73D5 = true ;
                        pr_default.readNext(1);
                     }
                  }
                  AV20NCol = (byte)(AV20NCol+1) ;
                  AV16Tab_Bultos[AV20NCol-1] = AV21Bultos_Col ;
                  AV17Tab_Color[AV20NCol-1] = AV23TxtCol ;
                  AV18Tab_Bruto[AV20NCol-1] = AV14KgsBCol ;
                  AV19Tab_Neto[AV20NCol-1] = AV15KgsNCol ;
                  AV22Bultos_Txt = (short)(AV22Bultos_Txt+AV21Bultos_Col) ;
                  AV40Cambio_Col = (byte)(1) ;
                  /* Execute user subroutine: 'TOTAL_KGS' */
                  S121 ();
                  if ( returnInSub )
                  {
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
                  if ( ! brk73D5 )
                  {
                     brk73D5 = true ;
                     pr_default.readNext(1);
                  }
               }
               pr_default.close(1);
               AV42Totales = (byte)(1) ;
               /* Eject command */
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(P_lines+1) ;
               if ( AV9Idioma == 1 )
               {
                  h73D0( false, 35) ;
                  getPrinter().GxAttris("Arial", 10, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "TOTAL PRODUCTOS", ""), 19, Gx_line+0, 153, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Nº Bultos", ""), 53, Gx_line+19, 111, Gx_line+36, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "                 Color            ", ""), 166, Gx_line+19, 319, Gx_line+36, 1+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "P.Bruto", ""), 425, Gx_line+18, 470, Gx_line+35, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "P.Neto", ""), 556, Gx_line+19, 597, Gx_line+36, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(166, Gx_line+33, 363, Gx_line+33, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(53, Gx_line+33, 110, Gx_line+33, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(544, Gx_line+33, 610, Gx_line+33, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(415, Gx_line+33, 481, Gx_line+33, 1, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+35) ;
                  AV36NLineas = (byte)(AV36NLineas+2) ;
               }
               else
               {
                  h73D0( false, 53) ;
                  getPrinter().GxAttris("Arial", 10, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "TOTAL PRODUCTOS", ""), 19, Gx_line+0, 153, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Nº Bultos", ""), 55, Gx_line+19, 113, Gx_line+36, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "                 Color            ", ""), 168, Gx_line+19, 321, Gx_line+36, 1+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "P.Bruto", ""), 425, Gx_line+19, 470, Gx_line+36, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "P.Neto", ""), 556, Gx_line+19, 597, Gx_line+36, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(145, Gx_line+51, 342, Gx_line+51, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(55, Gx_line+51, 112, Gx_line+51, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(544, Gx_line+51, 610, Gx_line+51, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(415, Gx_line+51, 481, Gx_line+51, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "(Cases)", ""), 60, Gx_line+33, 108, Gx_line+50, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "                 Colour            ", ""), 164, Gx_line+33, 324, Gx_line+50, 1+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "(Gross W.)", ""), 415, Gx_line+33, 482, Gx_line+50, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "(Net. W.)", ""), 549, Gx_line+33, 604, Gx_line+50, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "(TOTAL PRODUCTS)", ""), 167, Gx_line+0, 295, Gx_line+17, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+53) ;
                  AV36NLineas = (byte)(AV36NLineas+3) ;
               }
               AV42Totales = (byte)(0) ;
               AV22Bultos_Txt = (short)(0) ;
               AV24LinCol = (short)(1) ;
               AV29TP_Bultos = (short)(0) ;
               AV30TP_Bruto = DecimalUtil.doubleToDec(0) ;
               AV31TP_Neto = DecimalUtil.doubleToDec(0) ;
               while ( AV24LinCol <= AV20NCol )
               {
                  AV25TBultos = AV16Tab_Bultos[AV24LinCol-1] ;
                  AV26TColor = AV17Tab_Color[AV24LinCol-1] ;
                  AV27TBruto = AV18Tab_Bruto[AV24LinCol-1] ;
                  AV28TNeto = AV19Tab_Neto[AV24LinCol-1] ;
                  AV29TP_Bultos = (short)(AV29TP_Bultos+AV25TBultos) ;
                  AV30TP_Bruto = AV30TP_Bruto.add(AV27TBruto) ;
                  AV31TP_Neto = AV31TP_Neto.add(AV28TNeto) ;
                  if ( AV36NLineas > 29 )
                  {
                     /* Eject command */
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(P_lines+1) ;
                  }
                  h73D0( false, 18) ;
                  getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27TBruto, "ZZZZZ9.99")), 415, Gx_line+1, 482, Gx_line+19, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV25TBultos), "ZZZ9")), 68, Gx_line+1, 98, Gx_line+19, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26TColor, "")), 166, Gx_line+1, 363, Gx_line+17, 1, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV28TNeto, "ZZZZZ9.99")), 544, Gx_line+1, 611, Gx_line+19, 2+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+18) ;
                  AV24LinCol = (short)(AV24LinCol+1) ;
                  AV36NLineas = (byte)(AV36NLineas+1) ;
               }
               if ( AV36NLineas > 29 )
               {
                  /* Eject command */
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(P_lines+1) ;
               }
               h73D0( false, 35) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV29TP_Bultos), "ZZZ9")), 68, Gx_line+9, 98, Gx_line+27, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV31TP_Neto, "ZZZZZ9.99")), 544, Gx_line+9, 611, Gx_line+27, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV30TP_Bruto, "ZZZZZ9.99")), 415, Gx_line+9, 482, Gx_line+27, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+35) ;
               AV36NLineas = (byte)(AV36NLineas+2) ;
               AV32TG_Bultos = (short)(AV32TG_Bultos+AV29TP_Bultos) ;
               AV33TG_Bruto = AV33TG_Bruto.add(AV30TP_Bruto) ;
               AV34TG_Neto = AV34TG_Neto.add(AV31TP_Neto) ;
               AV38Cab_Linea = (byte)(0) ;
               brk73D2 = true ;
               pr_default.readNext(0);
            }
            if ( AV36NLineas > 25 )
            {
               AV42Totales = (byte)(1) ;
               /* Eject command */
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(P_lines+1) ;
            }
            if ( AV9Idioma == 1 )
            {
               h73D0( false, 53) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Total Gral de Cajas", ""), 21, Gx_line+2, 137, Gx_line+19, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Total Gral de Kgs.Brutos", ""), 21, Gx_line+18, 170, Gx_line+35, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Total Gral de Kgs.Netos", ""), 21, Gx_line+35, 166, Gx_line+52, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 171, Gx_line+2, 176, Gx_line+19, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 171, Gx_line+20, 176, Gx_line+37, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 171, Gx_line+36, 176, Gx_line+53, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV33TG_Bruto, "ZZZZZ9.99")), 198, Gx_line+18, 265, Gx_line+36, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV32TG_Bultos), "ZZZ9")), 234, Gx_line+1, 263, Gx_line+18, 2, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV34TG_Neto, "ZZZZZ9.99")), 198, Gx_line+35, 265, Gx_line+53, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+53) ;
            }
            else
            {
               AV44TGL_Bruto = AV33TG_Bruto.multiply(DecimalUtil.stringToDec("2.2046")) ;
               AV45TGL_Neto = AV34TG_Neto.multiply(DecimalUtil.stringToDec("2.2046")) ;
               h73D0( false, 53) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Total Gral de Cajas  (Gral. Total Cases)", ""), 21, Gx_line+0, 257, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Total Gral de Brutos (Gral. Total Gross Weight)", ""), 21, Gx_line+18, 303, Gx_line+35, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Total Gral de Netos  (Gral. Total Net Weight)", ""), 21, Gx_line+35, 288, Gx_line+52, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 347, Gx_line+0, 352, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 347, Gx_line+18, 352, Gx_line+35, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 347, Gx_line+35, 352, Gx_line+52, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV33TG_Bruto, "ZZZZZ9.99")), 400, Gx_line+18, 467, Gx_line+36, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV32TG_Bultos), "ZZZ9")), 436, Gx_line+0, 466, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV34TG_Neto, "ZZZZZ9.99")), 400, Gx_line+35, 467, Gx_line+53, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Kgs.", ""), 482, Gx_line+18, 511, Gx_line+35, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Kgs.", ""), 482, Gx_line+35, 511, Gx_line+52, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV44TGL_Bruto, "ZZZZZZ9.99")), 567, Gx_line+18, 650, Gx_line+35, 2, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV45TGL_Neto, "ZZZZZZ9.99")), 567, Gx_line+35, 650, Gx_line+52, 2, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Lbs.", ""), 677, Gx_line+35, 704, Gx_line+52, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Lbs.", ""), 677, Gx_line+18, 704, Gx_line+35, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+53) ;
            }
            AV42Totales = (byte)(0) ;
            /* Eject command */
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(P_lines+1) ;
            if ( ! brk73D2 )
            {
               brk73D2 = true ;
               pr_default.readNext(0);
            }
         }
         pr_default.close(0);
         GxHdr2 = false ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h73D0( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void S113( ) throws ProcessInterruptedException
   {
      /* 'CAB_LINEA' Routine */
      returnInSub = false ;
      if ( AV38Cab_Linea == 0 )
      {
         if ( AV36NLineas > 25 )
         {
            AV38Cab_Linea = (byte)(0) ;
            /* Eject command */
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(P_lines+1) ;
         }
         else
         {
            h73D0( false, 18) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nº Bultos", ""), 22, Gx_line+1, 80, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Color", ""), 188, Gx_line+1, 220, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Partida Nº", ""), 336, Gx_line+1, 398, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nº Caja", ""), 431, Gx_line+1, 478, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Conos", ""), 529, Gx_line+1, 569, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "P.Bruto", ""), 604, Gx_line+1, 649, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "P.Neto", ""), 692, Gx_line+1, 733, Gx_line+18, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+18) ;
            AV36NLineas = (byte)(AV36NLineas+1) ;
            if ( AV9Idioma == 2 )
            {
               h73D0( false, 18) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "(Cases)", ""), 27, Gx_line+1, 75, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "(Colour)", ""), 179, Gx_line+1, 227, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "(Lot)", ""), 354, Gx_line+1, 382, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "(Case)", ""), 434, Gx_line+1, 475, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "(Cones)", ""), 525, Gx_line+1, 573, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "(Gross W.)", ""), 594, Gx_line+1, 661, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "(Net. W.)", ""), 684, Gx_line+1, 739, Gx_line+18, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+18) ;
               AV36NLineas = (byte)(AV36NLineas+1) ;
            }
         }
      }
      AV38Cab_Linea = (byte)(1) ;
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'TOTAL_KGS' Routine */
      returnInSub = false ;
      if ( AV36NLineas > 29 )
      {
         /* Eject command */
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(P_lines+1) ;
      }
      if ( AV40Cambio_Col == 0 )
      {
         h73D0( false, 35) ;
         getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Total Kgs.", ""), 513, Gx_line+9, 574, Gx_line+26, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV12KgsBPar, "ZZZZZ9.99")), 583, Gx_line+9, 650, Gx_line+27, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV13KgsNPar, "ZZZZZ9.99")), 667, Gx_line+9, 734, Gx_line+27, 2+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+35) ;
      }
      else
      {
         h73D0( false, 35) ;
         getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Total Kgs.", ""), 513, Gx_line+9, 574, Gx_line+26, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV14KgsBCol, "ZZZZZ9.99")), 583, Gx_line+9, 650, Gx_line+27, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV15KgsNCol, "ZZZZZ9.99")), 667, Gx_line+9, 734, Gx_line+27, 2+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+35) ;
         AV14KgsBCol = DecimalUtil.doubleToDec(0) ;
         AV15KgsNCol = DecimalUtil.doubleToDec(0) ;
      }
      AV36NLineas = (byte)(AV36NLineas+2) ;
      AV40Cambio_Col = (byte)(0) ;
      AV12KgsBPar = DecimalUtil.doubleToDec(0) ;
      AV13KgsNPar = DecimalUtil.doubleToDec(0) ;
   }

   public void h73D0( boolean bFoot ,
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
            if ( GxHdr2 )
            {
               AV36NLineas = (byte)(1) ;
               if ( GXutil.strcmp(AV43Logo, httpContext.getMessage( "S", "")) == 0 )
               {
                  getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "f477d68f-b039-4461-b5c1-1d0de42fea32", "", context.getHttpContext().getTheme( )), 467, Gx_line+20, 774, Gx_line+155) ;
                  getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Hoja Nº :", ""), 18, Gx_line+7, 73, Gx_line+24, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 75, Gx_line+7, 120, Gx_line+25, 2+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+213) ;
               }
               else
               {
                  getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Hoja Nº :", ""), 18, Gx_line+7, 73, Gx_line+24, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 75, Gx_line+7, 120, Gx_line+25, 2+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+213) ;
               }
               if ( AV9Idioma == 1 )
               {
                  getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Fecha :", ""), 589, Gx_line+5, 636, Gx_line+22, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(localUtil.format( A6202PckErxFch, "99/99/99"), 648, Gx_line+5, 715, Gx_line+22, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+27) ;
               }
               else
               {
                  getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Fecha (Date) :", ""), 589, Gx_line+3, 676, Gx_line+20, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(localUtil.format( A6202PckErxFch, "99/99/99"), 681, Gx_line+3, 748, Gx_line+20, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+27) ;
               }
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Sr./Mr.:", ""), 18, Gx_line+6, 63, Gx_line+23, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A6198PckErxDom, "")), 70, Gx_line+24, 570, Gx_line+40, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A6201PckErxNif, "")), 70, Gx_line+74, 570, Gx_line+90, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A6197PckErxNom, "")), 70, Gx_line+6, 570, Gx_line+23, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A6200PckErxPai, "")), 70, Gx_line+57, 570, Gx_line+73, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A6199PckErxPob, "")), 70, Gx_line+41, 570, Gx_line+57, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A7517PckErx1, "")), 70, Gx_line+91, 570, Gx_line+107, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A7518PckErx2, "")), 70, Gx_line+107, 570, Gx_line+123, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+129) ;
               if ( AV37Cab_Txt == 0 )
               {
                  getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A6204PckErxTxt, "")), 59, Gx_line+2, 791, Gx_line+101, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+103) ;
                  if ( AV42Totales == 0 )
                  {
                     AV38Cab_Linea = (byte)(0) ;
                     /* Execute user subroutine: 'CAB_LINEA' */
                     S113 ();
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
               }
               AV38Cab_Linea = (byte)(0) ;
               AV37Cab_Txt = (byte)(0) ;
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
      this.aP0[0] = rpckerx.this.A396EmprCod;
      this.aP1[0] = rpckerx.this.A6194PckErxNum;
      this.aP2[0] = rpckerx.this.AV9Idioma;
      this.aP3[0] = rpckerx.this.AV43Logo;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV33TG_Bruto = DecimalUtil.ZERO ;
      AV34TG_Neto = DecimalUtil.ZERO ;
      AV12KgsBPar = DecimalUtil.ZERO ;
      AV13KgsNPar = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P073D2_A396EmprCod = new String[] {""} ;
      P073D2_A6194PckErxNum = new int[1] ;
      P073D2_A6204PckErxTxt = new String[] {""} ;
      P073D2_n6204PckErxTxt = new boolean[] {false} ;
      P073D2_A6195PckErxOrd = new byte[1] ;
      P073D2_A6202PckErxFch = new java.util.Date[] {GXutil.nullDate()} ;
      P073D2_n6202PckErxFch = new boolean[] {false} ;
      P073D2_A7518PckErx2 = new String[] {""} ;
      P073D2_n7518PckErx2 = new boolean[] {false} ;
      P073D2_A7517PckErx1 = new String[] {""} ;
      P073D2_n7517PckErx1 = new boolean[] {false} ;
      P073D2_A6199PckErxPob = new String[] {""} ;
      P073D2_n6199PckErxPob = new boolean[] {false} ;
      P073D2_A6200PckErxPai = new String[] {""} ;
      P073D2_n6200PckErxPai = new boolean[] {false} ;
      P073D2_A6197PckErxNom = new String[] {""} ;
      P073D2_n6197PckErxNom = new boolean[] {false} ;
      P073D2_A6201PckErxNif = new String[] {""} ;
      P073D2_n6201PckErxNif = new boolean[] {false} ;
      P073D2_A6198PckErxDom = new String[] {""} ;
      P073D2_n6198PckErxDom = new boolean[] {false} ;
      A6204PckErxTxt = "" ;
      A6202PckErxFch = GXutil.nullDate() ;
      A7518PckErx2 = "" ;
      A7517PckErx1 = "" ;
      A6199PckErxPob = "" ;
      A6200PckErxPai = "" ;
      A6197PckErxNom = "" ;
      A6201PckErxNif = "" ;
      A6198PckErxDom = "" ;
      AV16Tab_Bultos = new short[99] ;
      AV17Tab_Color = new String[99] ;
      GX_I = 1 ;
      while ( GX_I <= 99 )
      {
         AV17Tab_Color[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV18Tab_Bruto = new java.math.BigDecimal[99] ;
      GX_I = 1 ;
      while ( GX_I <= 99 )
      {
         AV18Tab_Bruto[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV19Tab_Neto = new java.math.BigDecimal[99] ;
      GX_I = 1 ;
      while ( GX_I <= 99 )
      {
         AV19Tab_Neto[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV23TxtCol = "" ;
      P073D3_A396EmprCod = new String[] {""} ;
      P073D3_A6194PckErxNum = new int[1] ;
      P073D3_A6195PckErxOrd = new byte[1] ;
      P073D3_A6215PckErxKgN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P073D3_n6215PckErxKgN = new boolean[] {false} ;
      P073D3_A6214PckErxKgB = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P073D3_n6214PckErxKgB = new boolean[] {false} ;
      P073D3_A6216PckErxCon = new short[1] ;
      P073D3_n6216PckErxCon = new boolean[] {false} ;
      P073D3_A6213PckErxCaj = new String[] {""} ;
      P073D3_n6213PckErxCaj = new boolean[] {false} ;
      P073D3_A6212PckErxNCo = new int[1] ;
      P073D3_n6212PckErxNCo = new boolean[] {false} ;
      P073D3_A6211PckErxCol = new String[] {""} ;
      P073D3_n6211PckErxCol = new boolean[] {false} ;
      P073D3_A6208PckErxHdr = new int[1] ;
      P073D3_n6208PckErxHdr = new boolean[] {false} ;
      P073D3_A6206PckErxLin = new short[1] ;
      A6215PckErxKgN = DecimalUtil.ZERO ;
      A6214PckErxKgB = DecimalUtil.ZERO ;
      A6213PckErxCaj = "" ;
      A6211PckErxCol = "" ;
      AV14KgsBCol = DecimalUtil.ZERO ;
      AV15KgsNCol = DecimalUtil.ZERO ;
      AV35Color = "" ;
      AV30TP_Bruto = DecimalUtil.ZERO ;
      AV31TP_Neto = DecimalUtil.ZERO ;
      AV26TColor = "" ;
      AV27TBruto = DecimalUtil.ZERO ;
      AV28TNeto = DecimalUtil.ZERO ;
      AV44TGL_Bruto = DecimalUtil.ZERO ;
      AV45TGL_Neto = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rpckerx__default(),
         new Object[] {
             new Object[] {
            P073D2_A396EmprCod, P073D2_A6194PckErxNum, P073D2_A6204PckErxTxt, P073D2_n6204PckErxTxt, P073D2_A6195PckErxOrd, P073D2_A6202PckErxFch, P073D2_n6202PckErxFch, P073D2_A7518PckErx2, P073D2_n7518PckErx2, P073D2_A7517PckErx1,
            P073D2_n7517PckErx1, P073D2_A6199PckErxPob, P073D2_n6199PckErxPob, P073D2_A6200PckErxPai, P073D2_n6200PckErxPai, P073D2_A6197PckErxNom, P073D2_n6197PckErxNom, P073D2_A6201PckErxNif, P073D2_n6201PckErxNif, P073D2_A6198PckErxDom,
            P073D2_n6198PckErxDom
            }
            , new Object[] {
            P073D3_A396EmprCod, P073D3_A6194PckErxNum, P073D3_A6195PckErxOrd, P073D3_A6215PckErxKgN, P073D3_n6215PckErxKgN, P073D3_A6214PckErxKgB, P073D3_n6214PckErxKgB, P073D3_A6216PckErxCon, P073D3_n6216PckErxCon, P073D3_A6213PckErxCaj,
            P073D3_n6213PckErxCaj, P073D3_A6212PckErxNCo, P073D3_n6212PckErxNCo, P073D3_A6211PckErxCol, P073D3_n6211PckErxCol, P073D3_A6208PckErxHdr, P073D3_n6208PckErxHdr, P073D3_A6206PckErxLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte AV9Idioma ;
   private byte AV39Primer_txt ;
   private byte A6195PckErxOrd ;
   private byte AV20NCol ;
   private byte AV37Cab_Txt ;
   private byte AV36NLineas ;
   private byte AV38Cab_Linea ;
   private byte AV40Cambio_Col ;
   private byte AV42Totales ;
   private short AV10Bultos ;
   private short AV32TG_Bultos ;
   private short AV16Tab_Bultos[] ;
   private short A6216PckErxCon ;
   private short A6206PckErxLin ;
   private short AV21Bultos_Col ;
   private short AV22Bultos_Txt ;
   private short AV24LinCol ;
   private short AV29TP_Bultos ;
   private short AV25TBultos ;
   private short Gx_err ;
   private int A6194PckErxNum ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int GX_I ;
   private int Gx_OldLine ;
   private int A6212PckErxNCo ;
   private int A6208PckErxHdr ;
   private java.math.BigDecimal AV33TG_Bruto ;
   private java.math.BigDecimal AV34TG_Neto ;
   private java.math.BigDecimal AV12KgsBPar ;
   private java.math.BigDecimal AV13KgsNPar ;
   private java.math.BigDecimal AV18Tab_Bruto[] ;
   private java.math.BigDecimal AV19Tab_Neto[] ;
   private java.math.BigDecimal A6215PckErxKgN ;
   private java.math.BigDecimal A6214PckErxKgB ;
   private java.math.BigDecimal AV14KgsBCol ;
   private java.math.BigDecimal AV15KgsNCol ;
   private java.math.BigDecimal AV30TP_Bruto ;
   private java.math.BigDecimal AV31TP_Neto ;
   private java.math.BigDecimal AV27TBruto ;
   private java.math.BigDecimal AV28TNeto ;
   private java.math.BigDecimal AV44TGL_Bruto ;
   private java.math.BigDecimal AV45TGL_Neto ;
   private String A396EmprCod ;
   private String AV43Logo ;
   private String scmdbuf ;
   private String A7518PckErx2 ;
   private String A7517PckErx1 ;
   private String A6199PckErxPob ;
   private String A6200PckErxPai ;
   private String A6197PckErxNom ;
   private String A6201PckErxNif ;
   private String A6198PckErxDom ;
   private String AV17Tab_Color[] ;
   private String AV23TxtCol ;
   private String A6213PckErxCaj ;
   private String A6211PckErxCol ;
   private String AV35Color ;
   private String AV26TColor ;
   private java.util.Date A6202PckErxFch ;
   private boolean GxHdr2 ;
   private boolean brk73D2 ;
   private boolean n6204PckErxTxt ;
   private boolean n6202PckErxFch ;
   private boolean n7518PckErx2 ;
   private boolean n7517PckErx1 ;
   private boolean n6199PckErxPob ;
   private boolean n6200PckErxPai ;
   private boolean n6197PckErxNom ;
   private boolean n6201PckErxNif ;
   private boolean n6198PckErxDom ;
   private boolean returnInSub ;
   private boolean brk73D5 ;
   private boolean n6215PckErxKgN ;
   private boolean n6214PckErxKgB ;
   private boolean n6216PckErxCon ;
   private boolean n6213PckErxCaj ;
   private boolean n6212PckErxNCo ;
   private boolean n6211PckErxCol ;
   private boolean n6208PckErxHdr ;
   private String A6204PckErxTxt ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P073D2_A396EmprCod ;
   private int[] P073D2_A6194PckErxNum ;
   private String[] P073D2_A6204PckErxTxt ;
   private boolean[] P073D2_n6204PckErxTxt ;
   private byte[] P073D2_A6195PckErxOrd ;
   private java.util.Date[] P073D2_A6202PckErxFch ;
   private boolean[] P073D2_n6202PckErxFch ;
   private String[] P073D2_A7518PckErx2 ;
   private boolean[] P073D2_n7518PckErx2 ;
   private String[] P073D2_A7517PckErx1 ;
   private boolean[] P073D2_n7517PckErx1 ;
   private String[] P073D2_A6199PckErxPob ;
   private boolean[] P073D2_n6199PckErxPob ;
   private String[] P073D2_A6200PckErxPai ;
   private boolean[] P073D2_n6200PckErxPai ;
   private String[] P073D2_A6197PckErxNom ;
   private boolean[] P073D2_n6197PckErxNom ;
   private String[] P073D2_A6201PckErxNif ;
   private boolean[] P073D2_n6201PckErxNif ;
   private String[] P073D2_A6198PckErxDom ;
   private boolean[] P073D2_n6198PckErxDom ;
   private String[] P073D3_A396EmprCod ;
   private int[] P073D3_A6194PckErxNum ;
   private byte[] P073D3_A6195PckErxOrd ;
   private java.math.BigDecimal[] P073D3_A6215PckErxKgN ;
   private boolean[] P073D3_n6215PckErxKgN ;
   private java.math.BigDecimal[] P073D3_A6214PckErxKgB ;
   private boolean[] P073D3_n6214PckErxKgB ;
   private short[] P073D3_A6216PckErxCon ;
   private boolean[] P073D3_n6216PckErxCon ;
   private String[] P073D3_A6213PckErxCaj ;
   private boolean[] P073D3_n6213PckErxCaj ;
   private int[] P073D3_A6212PckErxNCo ;
   private boolean[] P073D3_n6212PckErxNCo ;
   private String[] P073D3_A6211PckErxCol ;
   private boolean[] P073D3_n6211PckErxCol ;
   private int[] P073D3_A6208PckErxHdr ;
   private boolean[] P073D3_n6208PckErxHdr ;
   private short[] P073D3_A6206PckErxLin ;
}

final  class rpckerx__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P073D2", "SELECT EmprCod, PckErxNum, PckErxTxt, PckErxOrd, PckErxFch, PckErx2, PckErx1, PckErxPob, PckErxPai, PckErxNom, PckErxNif, PckErxDom FROM TXPPCKERX WHERE EmprCod = ? and PckErxNum = ? ORDER BY EmprCod, PckErxNum, PckErxOrd ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P073D3", "SELECT EmprCod, PckErxNum, PckErxOrd, PckErxKgN, PckErxKgB, PckErxCon, PckErxCaj, PckErxNCo, PckErxCol, PckErxHdr, PckErxLin FROM TXPPCKER1 WHERE (EmprCod = ?) AND (PckErxNum = ?) AND (PckErxOrd = ?) ORDER BY PckErxCol, PckErxNCo, PckErxHdr, PckErxCaj ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 60);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 60);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 60);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 60);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(10, 60);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(11, 60);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(12, 60);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 12);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 20);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(11);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
      }
   }

}

