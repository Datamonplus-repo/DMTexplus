package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class paltrrx1 extends GXReport
{
   public paltrrx1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( paltrrx1.class ), "" );
   }

   public paltrrx1( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           long[] aP1 )
   {
      paltrrx1.this.aP2 = new byte[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        byte[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             byte[] aP2 )
   {
      paltrrx1.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      paltrrx1.this.A3617AlbTrnCod = aP1[0];
      this.aP1 = aP1;
      paltrrx1.this.AV30Copias = aP2[0];
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
         Gx_out = "PRN" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "REPGRAF", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("ALBARAN TRANSPORTE Rontaltex") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*0)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         /* Using cursor P02BV2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P02BV2_A407EmprNom[0] ;
            n407EmprNom = P02BV2_n407EmprNom[0] ;
            AV19EmprNom = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV31NCopias = (byte)(1) ;
         while ( AV31NCopias <= AV30Copias )
         {
            GxHdr3 = true ;
            /* Using cursor P02BV3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A3617AlbTrnCod)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A840TrnCod = P02BV3_A840TrnCod[0] ;
               n840TrnCod = P02BV3_n840TrnCod[0] ;
               A3830AlbTrnUlin = P02BV3_A3830AlbTrnUlin[0] ;
               n3830AlbTrnUlin = P02BV3_n3830AlbTrnUlin[0] ;
               A841TrnNom = P02BV3_A841TrnNom[0] ;
               n841TrnNom = P02BV3_n841TrnNom[0] ;
               A3618AlbTrnFec = P02BV3_A3618AlbTrnFec[0] ;
               n3618AlbTrnFec = P02BV3_n3618AlbTrnFec[0] ;
               A841TrnNom = P02BV3_A841TrnNom[0] ;
               n841TrnNom = P02BV3_n841TrnNom[0] ;
               AV26ContLin = (short)(0) ;
               AV9TotalBruto = DecimalUtil.doubleToDec(0) ;
               AV10TotalNeto = DecimalUtil.doubleToDec(0) ;
               AV8TotalBul = 0 ;
               /* Optimized group. */
               /* Using cursor P02BV4 */
               pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A3617AlbTrnCod)});
               c3833AlbTraKgB = P02BV4_A3833AlbTraKgB[0] ;
               n3833AlbTraKgB = P02BV4_n3833AlbTraKgB[0] ;
               c3832AlbTraKgN = P02BV4_A3832AlbTraKgN[0] ;
               n3832AlbTraKgN = P02BV4_n3832AlbTraKgN[0] ;
               c3834AlbTraBul = P02BV4_A3834AlbTraBul[0] ;
               n3834AlbTraBul = P02BV4_n3834AlbTraBul[0] ;
               pr_default.close(2);
               AV9TotalBruto = AV9TotalBruto.add(c3833AlbTraKgB) ;
               AV10TotalNeto = AV10TotalNeto.add(c3832AlbTraKgN) ;
               AV8TotalBul = (int)(AV8TotalBul+c3834AlbTraBul) ;
               /* End optimized group. */
               /* Using cursor P02BV5 */
               pr_default.execute(3, new Object[] {A396EmprCod, Long.valueOf(A3617AlbTrnCod)});
               while ( (pr_default.getStatus(3) != 101) )
               {
                  brk2BV6 = false ;
                  A3832AlbTraKgN = P02BV5_A3832AlbTraKgN[0] ;
                  n3832AlbTraKgN = P02BV5_n3832AlbTraKgN[0] ;
                  A3834AlbTraBul = P02BV5_A3834AlbTraBul[0] ;
                  n3834AlbTraBul = P02BV5_n3834AlbTraBul[0] ;
                  A30AlbProCod = P02BV5_A30AlbProCod[0] ;
                  A3833AlbTraKgB = P02BV5_A3833AlbTraKgB[0] ;
                  n3833AlbTraKgB = P02BV5_n3833AlbTraKgB[0] ;
                  A1243GuiRemCli = P02BV5_A1243GuiRemCli[0] ;
                  A2311BarCliDes = P02BV5_A2311BarCliDes[0] ;
                  A132BarCodReo = P02BV5_A132BarCodReo[0] ;
                  A130BarCodPar = P02BV5_A130BarCodPar[0] ;
                  A129BarCod = P02BV5_A129BarCod[0] ;
                  A34AlbProfch = P02BV5_A34AlbProfch[0] ;
                  A2311BarCliDes = P02BV5_A2311BarCliDes[0] ;
                  A1243GuiRemCli = P02BV5_A1243GuiRemCli[0] ;
                  A34AlbProfch = P02BV5_A34AlbProfch[0] ;
                  h2BV0( false, 20) ;
                  getPrinter().GxAttris("Tahoma", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9")), 40, Gx_line+1, 114, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Tahoma", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(localUtil.format( A34AlbProfch, "99/99/99"), 147, Gx_line+1, 202, Gx_line+17, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+20) ;
                  /* Noskip command */
                  Gx_line = Gx_OldLine ;
                  while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P02BV5_A396EmprCod[0], A396EmprCod) == 0 ) && ( P02BV5_A3617AlbTrnCod[0] == A3617AlbTrnCod ) && ( P02BV5_A30AlbProCod[0] == A30AlbProCod ) )
                  {
                     brk2BV6 = false ;
                     A3832AlbTraKgN = P02BV5_A3832AlbTraKgN[0] ;
                     n3832AlbTraKgN = P02BV5_n3832AlbTraKgN[0] ;
                     A3834AlbTraBul = P02BV5_A3834AlbTraBul[0] ;
                     n3834AlbTraBul = P02BV5_n3834AlbTraBul[0] ;
                     A3833AlbTraKgB = P02BV5_A3833AlbTraKgB[0] ;
                     n3833AlbTraKgB = P02BV5_n3833AlbTraKgB[0] ;
                     A1243GuiRemCli = P02BV5_A1243GuiRemCli[0] ;
                     A2311BarCliDes = P02BV5_A2311BarCliDes[0] ;
                     A132BarCodReo = P02BV5_A132BarCodReo[0] ;
                     A130BarCodPar = P02BV5_A130BarCodPar[0] ;
                     A129BarCod = P02BV5_A129BarCod[0] ;
                     A2311BarCliDes = P02BV5_A2311BarCliDes[0] ;
                     A1243GuiRemCli = P02BV5_A1243GuiRemCli[0] ;
                     AV32AlbTraKgB = DecimalUtil.doubleToDec(0) ;
                     AV33AlbTraKgN = DecimalUtil.doubleToDec(0) ;
                     AV34AlbTraBul = (short)(0) ;
                     while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P02BV5_A396EmprCod[0], A396EmprCod) == 0 ) && ( P02BV5_A3617AlbTrnCod[0] == A3617AlbTrnCod ) && ( P02BV5_A30AlbProCod[0] == A30AlbProCod ) && ( P02BV5_A129BarCod[0] == A129BarCod ) )
                     {
                        brk2BV6 = false ;
                        A3832AlbTraKgN = P02BV5_A3832AlbTraKgN[0] ;
                        n3832AlbTraKgN = P02BV5_n3832AlbTraKgN[0] ;
                        A3834AlbTraBul = P02BV5_A3834AlbTraBul[0] ;
                        n3834AlbTraBul = P02BV5_n3834AlbTraBul[0] ;
                        A3833AlbTraKgB = P02BV5_A3833AlbTraKgB[0] ;
                        n3833AlbTraKgB = P02BV5_n3833AlbTraKgB[0] ;
                        A132BarCodReo = P02BV5_A132BarCodReo[0] ;
                        A130BarCodPar = P02BV5_A130BarCodPar[0] ;
                        AV32AlbTraKgB = AV32AlbTraKgB.add(A3833AlbTraKgB) ;
                        AV33AlbTraKgN = AV33AlbTraKgN.add(A3832AlbTraKgN) ;
                        AV34AlbTraBul = (short)(AV34AlbTraBul+A3834AlbTraBul) ;
                        brk2BV6 = true ;
                        pr_default.readNext(3);
                     }
                     h2BV0( false, 20) ;
                     getPrinter().GxAttris("Tahoma", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), 221, Gx_line+1, 303, Gx_line+16, 2, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A130BarCodPar, "")), 323, Gx_line+1, 337, Gx_line+16, 0, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")), 307, Gx_line+1, 317, Gx_line+16, 2, 0, 0, 0) ;
                     getPrinter().GxAttris("Tahoma", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV32AlbTraKgB, "ZZZZZ9.99")), 474, Gx_line+1, 541, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV33AlbTraKgN, "ZZZZZ9.99")), 571, Gx_line+1, 638, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV34AlbTraBul), "ZZZ9")), 679, Gx_line+1, 709, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2311BarCliDes), "ZZZZZ9")), 409, Gx_line+1, 454, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1243GuiRemCli), "ZZZZZ9")), 351, Gx_line+1, 396, Gx_line+17, 2+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+20) ;
                     AV26ContLin = (short)(AV26ContLin+1) ;
                     if ( ! brk2BV6 )
                     {
                        brk2BV6 = true ;
                        pr_default.readNext(3);
                     }
                  }
                  AV28AlbProCod = A30AlbProCod ;
                  AV29TrnCod = A840TrnCod ;
                  if ( AV31NCopias == 1 )
                  {
                     /* Execute user subroutine: 'ACTU_CALPRD' */
                     S111 ();
                     if ( returnInSub )
                     {
                        pr_default.close(3);
                        pr_default.close(3);
                        pr_default.close(3);
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
                  if ( ! brk2BV6 )
                  {
                     brk2BV6 = true ;
                     pr_default.readNext(3);
                  }
               }
               pr_default.close(3);
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(1);
            GxHdr3 = false ;
            AV27Observa = (byte)(0) ;
            /* Using cursor P02BV6 */
            pr_default.execute(4, new Object[] {A396EmprCod, Long.valueOf(A3617AlbTrnCod)});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A3620AlbTrnObs = P02BV6_A3620AlbTrnObs[0] ;
               n3620AlbTrnObs = P02BV6_n3620AlbTrnObs[0] ;
               A3619AlbTrnLin = P02BV6_A3619AlbTrnLin[0] ;
               if ( AV27Observa == 0 )
               {
                  h2BV0( false, 18) ;
                  getPrinter().GxAttris("Tahoma", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "OBSERVACIONES:", ""), 43, Gx_line+4, 142, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(13, Gx_line+2, 764, Gx_line+2, 2, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+18) ;
               }
               AV27Observa = (byte)(1) ;
               h2BV0( false, 18) ;
               getPrinter().GxAttris("Tahoma", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A3620AlbTrnObs, "")), 188, Gx_line+1, 449, Gx_line+17, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+18) ;
               pr_default.readNext(4);
            }
            pr_default.close(4);
            /* Eject command */
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(P_lines+1) ;
            AV31NCopias = (byte)(AV31NCopias+1) ;
         }
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h2BV0( true, 0) ;
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
      /* 'ACTU_CALPRD' Routine */
      returnInSub = false ;
      /* Optimized UPDATE. */
      /* Using cursor P02BV7 */
      pr_default.execute(5, new Object[] {Boolean.valueOf(n840TrnCod), Short.valueOf(AV29TrnCod), A396EmprCod, Long.valueOf(AV28AlbProCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
      /* End optimized UPDATE. */
   }

   public void h2BV0( boolean bFoot ,
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
               getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3617AlbTrnCod), "ZZZZZZZZZ9")), 27, Gx_line+99, 101, Gx_line+117, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( A3618AlbTrnFec, "99/99/99"), 117, Gx_line+99, 172, Gx_line+117, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV8TotalBul), "ZZZZZ9")), 669, Gx_line+99, 714, Gx_line+117, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV9TotalBruto, "Z,ZZZ,ZZ9.99")), 448, Gx_line+99, 537, Gx_line+117, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV10TotalNeto, "Z,ZZZ,ZZ9.99")), 550, Gx_line+99, 639, Gx_line+117, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Tahoma", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A840TrnCod), "ZZZ9")), 191, Gx_line+99, 221, Gx_line+115, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Tahoma", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A841TrnNom, "")), 228, Gx_line+99, 430, Gx_line+114, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Tahoma", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19EmprNom, "")), 5, Gx_line+6, 194, Gx_line+22, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Tahoma", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Fecha:", ""), 609, Gx_line+7, 648, Gx_line+21, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Tahoma", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 707, Gx_line+6, 762, Gx_line+22, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Tahoma", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Hora:", ""), 609, Gx_line+22, 641, Gx_line+36, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Tahoma", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 661, Gx_line+21, 762, Gx_line+37, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Tahoma", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Página:", ""), 609, Gx_line+36, 653, Gx_line+50, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Tahoma", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 718, Gx_line+35, 763, Gx_line+51, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Tahoma", 9, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Romaneo de Tranporte", ""), 302, Gx_line+33, 451, Gx_line+48, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Tahoma", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Romaneo", ""), 33, Gx_line+78, 94, Gx_line+93, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 117, Gx_line+78, 153, Gx_line+93, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Transportista", ""), 191, Gx_line+78, 277, Gx_line+93, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Total Bruto", ""), 463, Gx_line+78, 537, Gx_line+93, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Total N.Cajas", ""), 649, Gx_line+78, 732, Gx_line+93, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Total Neto", ""), 571, Gx_line+78, 639, Gx_line+93, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(27, Gx_line+93, 100, Gx_line+93, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(550, Gx_line+93, 638, Gx_line+93, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(448, Gx_line+93, 536, Gx_line+93, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(191, Gx_line+93, 432, Gx_line+93, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(117, Gx_line+93, 171, Gx_line+93, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(649, Gx_line+93, 731, Gx_line+93, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Tahoma", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Romaneo Salida", ""), 28, Gx_line+148, 124, Gx_line+162, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 147, Gx_line+148, 182, Gx_line+162, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(28, Gx_line+163, 123, Gx_line+163, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(147, Gx_line+163, 201, Gx_line+163, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "HDR", ""), 266, Gx_line+148, 292, Gx_line+162, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Kilos Brutos", ""), 471, Gx_line+148, 541, Gx_line+162, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "N.Cajas", ""), 672, Gx_line+148, 716, Gx_line+162, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Kilos Netos", ""), 573, Gx_line+148, 638, Gx_line+162, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(571, Gx_line+163, 637, Gx_line+163, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(471, Gx_line+163, 540, Gx_line+163, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(220, Gx_line+163, 337, Gx_line+163, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(667, Gx_line+163, 721, Gx_line+163, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 354, Gx_line+148, 396, Gx_line+162, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(351, Gx_line+163, 395, Gx_line+163, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Destino", ""), 408, Gx_line+148, 454, Gx_line+162, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(409, Gx_line+163, 453, Gx_line+163, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawRect(11, Gx_line+64, 764, Gx_line+138, 2, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+166) ;
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
      this.aP0[0] = paltrrx1.this.A396EmprCod;
      this.aP1[0] = paltrrx1.this.A3617AlbTrnCod;
      this.aP2[0] = paltrrx1.this.AV30Copias;
      Application.commitDataStores(context, remoteHandle, pr_default, "paltrrx1");
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
      P02BV2_A396EmprCod = new String[] {""} ;
      P02BV2_A407EmprNom = new String[] {""} ;
      P02BV2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV19EmprNom = "" ;
      P02BV3_A396EmprCod = new String[] {""} ;
      P02BV3_A3617AlbTrnCod = new long[1] ;
      P02BV3_A840TrnCod = new short[1] ;
      P02BV3_n840TrnCod = new boolean[] {false} ;
      P02BV3_A3830AlbTrnUlin = new short[1] ;
      P02BV3_n3830AlbTrnUlin = new boolean[] {false} ;
      P02BV3_A841TrnNom = new String[] {""} ;
      P02BV3_n841TrnNom = new boolean[] {false} ;
      P02BV3_A3618AlbTrnFec = new java.util.Date[] {GXutil.nullDate()} ;
      P02BV3_n3618AlbTrnFec = new boolean[] {false} ;
      A841TrnNom = "" ;
      A3618AlbTrnFec = GXutil.nullDate() ;
      AV9TotalBruto = DecimalUtil.ZERO ;
      AV10TotalNeto = DecimalUtil.ZERO ;
      c3833AlbTraKgB = DecimalUtil.ZERO ;
      c3832AlbTraKgN = DecimalUtil.ZERO ;
      P02BV4_A3833AlbTraKgB = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02BV4_n3833AlbTraKgB = new boolean[] {false} ;
      P02BV4_A3832AlbTraKgN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02BV4_n3832AlbTraKgN = new boolean[] {false} ;
      P02BV4_A3834AlbTraBul = new short[1] ;
      P02BV4_n3834AlbTraBul = new boolean[] {false} ;
      P02BV5_A396EmprCod = new String[] {""} ;
      P02BV5_A3617AlbTrnCod = new long[1] ;
      P02BV5_A3832AlbTraKgN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02BV5_n3832AlbTraKgN = new boolean[] {false} ;
      P02BV5_A3834AlbTraBul = new short[1] ;
      P02BV5_n3834AlbTraBul = new boolean[] {false} ;
      P02BV5_A30AlbProCod = new long[1] ;
      P02BV5_A3833AlbTraKgB = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02BV5_n3833AlbTraKgB = new boolean[] {false} ;
      P02BV5_A1243GuiRemCli = new int[1] ;
      P02BV5_A2311BarCliDes = new int[1] ;
      P02BV5_A132BarCodReo = new byte[1] ;
      P02BV5_A130BarCodPar = new String[] {""} ;
      P02BV5_A129BarCod = new int[1] ;
      P02BV5_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      A3832AlbTraKgN = DecimalUtil.ZERO ;
      A3833AlbTraKgB = DecimalUtil.ZERO ;
      A130BarCodPar = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      AV32AlbTraKgB = DecimalUtil.ZERO ;
      AV33AlbTraKgN = DecimalUtil.ZERO ;
      P02BV6_A396EmprCod = new String[] {""} ;
      P02BV6_A3617AlbTrnCod = new long[1] ;
      P02BV6_A3620AlbTrnObs = new String[] {""} ;
      P02BV6_n3620AlbTrnObs = new boolean[] {false} ;
      P02BV6_A3619AlbTrnLin = new byte[1] ;
      A3620AlbTrnObs = "" ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.paltrrx1__default(),
         new Object[] {
             new Object[] {
            P02BV2_A396EmprCod, P02BV2_A407EmprNom, P02BV2_n407EmprNom
            }
            , new Object[] {
            P02BV3_A396EmprCod, P02BV3_A3617AlbTrnCod, P02BV3_A840TrnCod, P02BV3_n840TrnCod, P02BV3_A3830AlbTrnUlin, P02BV3_n3830AlbTrnUlin, P02BV3_A841TrnNom, P02BV3_n841TrnNom, P02BV3_A3618AlbTrnFec, P02BV3_n3618AlbTrnFec
            }
            , new Object[] {
            P02BV4_A3833AlbTraKgB, P02BV4_n3833AlbTraKgB, P02BV4_A3832AlbTraKgN, P02BV4_n3832AlbTraKgN, P02BV4_A3834AlbTraBul, P02BV4_n3834AlbTraBul
            }
            , new Object[] {
            P02BV5_A396EmprCod, P02BV5_A3617AlbTrnCod, P02BV5_A3832AlbTraKgN, P02BV5_n3832AlbTraKgN, P02BV5_A3834AlbTraBul, P02BV5_n3834AlbTraBul, P02BV5_A30AlbProCod, P02BV5_A3833AlbTraKgB, P02BV5_n3833AlbTraKgB, P02BV5_A1243GuiRemCli,
            P02BV5_A2311BarCliDes, P02BV5_A132BarCodReo, P02BV5_A130BarCodPar, P02BV5_A129BarCod, P02BV5_A34AlbProfch
            }
            , new Object[] {
            P02BV6_A396EmprCod, P02BV6_A3617AlbTrnCod, P02BV6_A3620AlbTrnObs, P02BV6_n3620AlbTrnObs, P02BV6_A3619AlbTrnLin
            }
            , new Object[] {
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

   private byte AV30Copias ;
   private byte AV31NCopias ;
   private byte A132BarCodReo ;
   private byte AV27Observa ;
   private byte A3619AlbTrnLin ;
   private short A840TrnCod ;
   private short A3830AlbTrnUlin ;
   private short AV26ContLin ;
   private short A3834AlbTraBul ;
   private short AV34AlbTraBul ;
   private short AV29TrnCod ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int AV8TotalBul ;
   private int c3834AlbTraBul ;
   private int A1243GuiRemCli ;
   private int A2311BarCliDes ;
   private int A129BarCod ;
   private int Gx_OldLine ;
   private long A3617AlbTrnCod ;
   private long A30AlbProCod ;
   private long AV28AlbProCod ;
   private java.math.BigDecimal AV9TotalBruto ;
   private java.math.BigDecimal AV10TotalNeto ;
   private java.math.BigDecimal c3833AlbTraKgB ;
   private java.math.BigDecimal c3832AlbTraKgN ;
   private java.math.BigDecimal A3832AlbTraKgN ;
   private java.math.BigDecimal A3833AlbTraKgB ;
   private java.math.BigDecimal AV32AlbTraKgB ;
   private java.math.BigDecimal AV33AlbTraKgN ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV19EmprNom ;
   private String A841TrnNom ;
   private String A130BarCodPar ;
   private String A3620AlbTrnObs ;
   private String Gx_time ;
   private java.util.Date A3618AlbTrnFec ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date Gx_date ;
   private boolean n407EmprNom ;
   private boolean GxHdr3 ;
   private boolean n840TrnCod ;
   private boolean n3830AlbTrnUlin ;
   private boolean n841TrnNom ;
   private boolean n3618AlbTrnFec ;
   private boolean n3833AlbTraKgB ;
   private boolean n3832AlbTraKgN ;
   private boolean n3834AlbTraBul ;
   private boolean brk2BV6 ;
   private boolean returnInSub ;
   private boolean n3620AlbTrnObs ;
   private byte[] aP2 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P02BV2_A396EmprCod ;
   private String[] P02BV2_A407EmprNom ;
   private boolean[] P02BV2_n407EmprNom ;
   private String[] P02BV3_A396EmprCod ;
   private long[] P02BV3_A3617AlbTrnCod ;
   private short[] P02BV3_A840TrnCod ;
   private boolean[] P02BV3_n840TrnCod ;
   private short[] P02BV3_A3830AlbTrnUlin ;
   private boolean[] P02BV3_n3830AlbTrnUlin ;
   private String[] P02BV3_A841TrnNom ;
   private boolean[] P02BV3_n841TrnNom ;
   private java.util.Date[] P02BV3_A3618AlbTrnFec ;
   private boolean[] P02BV3_n3618AlbTrnFec ;
   private java.math.BigDecimal[] P02BV4_A3833AlbTraKgB ;
   private boolean[] P02BV4_n3833AlbTraKgB ;
   private java.math.BigDecimal[] P02BV4_A3832AlbTraKgN ;
   private boolean[] P02BV4_n3832AlbTraKgN ;
   private short[] P02BV4_A3834AlbTraBul ;
   private boolean[] P02BV4_n3834AlbTraBul ;
   private String[] P02BV5_A396EmprCod ;
   private long[] P02BV5_A3617AlbTrnCod ;
   private java.math.BigDecimal[] P02BV5_A3832AlbTraKgN ;
   private boolean[] P02BV5_n3832AlbTraKgN ;
   private short[] P02BV5_A3834AlbTraBul ;
   private boolean[] P02BV5_n3834AlbTraBul ;
   private long[] P02BV5_A30AlbProCod ;
   private java.math.BigDecimal[] P02BV5_A3833AlbTraKgB ;
   private boolean[] P02BV5_n3833AlbTraKgB ;
   private int[] P02BV5_A1243GuiRemCli ;
   private int[] P02BV5_A2311BarCliDes ;
   private byte[] P02BV5_A132BarCodReo ;
   private String[] P02BV5_A130BarCodPar ;
   private int[] P02BV5_A129BarCod ;
   private java.util.Date[] P02BV5_A34AlbProfch ;
   private String[] P02BV6_A396EmprCod ;
   private long[] P02BV6_A3617AlbTrnCod ;
   private String[] P02BV6_A3620AlbTrnObs ;
   private boolean[] P02BV6_n3620AlbTrnObs ;
   private byte[] P02BV6_A3619AlbTrnLin ;
}

final  class paltrrx1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02BV2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02BV3", "SELECT T1.EmprCod, T1.AlbTrnCod, T1.TrnCod, T1.AlbTrnUlin, T2.TrnNom, T1.AlbTrnFec FROM (TXPALBTRA T1 LEFT JOIN TXPTRANSP T2 ON T2.EmprCod = T1.EmprCod AND T2.TrnCod = T1.TrnCod) WHERE T1.EmprCod = ? and T1.AlbTrnCod = ? ORDER BY T1.EmprCod, T1.AlbTrnCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02BV4", "SELECT SUM(AlbTraKgB), SUM(AlbTraKgN), SUM(AlbTraBul) FROM TXPLALBTR WHERE EmprCod = ? and AlbTrnCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02BV5", "SELECT T1.EmprCod, T1.AlbTrnCod, T1.AlbTraKgN, T1.AlbTraBul, T1.AlbProCod, T1.AlbTraKgB, T3.GuiRemCli, T2.BarCliDes, T1.BarCodReo, T1.BarCodPar, T1.BarCod, T3.AlbProfch FROM ((TXPLALBTR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) INNER JOIN TXPCALPRD T3 ON T3.EmprCod = T1.EmprCod AND T3.AlbProCod = T1.AlbProCod) WHERE T1.EmprCod = ? and T1.AlbTrnCod = ? ORDER BY T1.EmprCod, T1.AlbTrnCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02BV6", "SELECT EmprCod, AlbTrnCod, AlbTrnObs, AlbTrnLin FROM TXPALBTOB WHERE EmprCod = ? and AlbTrnCod = ? ORDER BY EmprCod, AlbTrnCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02BV7", "UPDATE TXPCALPRD SET TrnCod=?  WHERE EmprCod = ? and AlbProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALPRD")
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 2 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((long[]) buf[6])[0] = rslt.getLong(5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(7);
               ((int[]) buf[10])[0] = rslt.getInt(8);
               ((byte[]) buf[11])[0] = rslt.getByte(9);
               ((String[]) buf[12])[0] = rslt.getString(10, 1);
               ((int[]) buf[13])[0] = rslt.getInt(11);
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(12);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 50);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 5 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setLong(3, ((Number) parms[3]).longValue());
               return;
      }
   }

}

