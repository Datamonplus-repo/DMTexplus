package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class rreclv03 extends GXReport
{
   public rreclv03( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rreclv03.class ), "" );
   }

   public rreclv03( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 )
   {
      rreclv03.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 )
   {
      rreclv03.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      rreclv03.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      rreclv03.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      rreclv03.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      rreclv03.this.A2804RecLinMaq = aP4[0];
      this.aP4 = aP4;
      rreclv03.this.Gx_out = aP5[0];
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
         super.Gx_out = this.Gx_out ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "REPGRAF", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("RECETA, COSTES CIERRE") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*0)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXt_char1 = AV74Lit1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN049", ""), (byte)(99), GXv_char2) ;
         rreclv03.this.GXt_char1 = GXv_char2[0] ;
         AV74Lit1 = GXt_char1 ;
         GXt_char1 = AV69Lit2 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char2) ;
         rreclv03.this.GXt_char1 = GXv_char2[0] ;
         AV69Lit2 = GXt_char1 ;
         GXt_char1 = AV70Lit3 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2034_", ""), (byte)(99), GXv_char2) ;
         rreclv03.this.GXt_char1 = GXv_char2[0] ;
         AV70Lit3 = GXt_char1 ;
         GXt_char1 = AV71Lit4 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN073_", ""), (byte)(99), GXv_char2) ;
         rreclv03.this.GXt_char1 = GXv_char2[0] ;
         AV71Lit4 = GXt_char1 ;
         GXt_char1 = AV72Lit5 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN388_", ""), (byte)(99), GXv_char2) ;
         rreclv03.this.GXt_char1 = GXv_char2[0] ;
         AV72Lit5 = GXt_char1 ;
         GXt_char1 = AV73Lit6 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN387_", ""), (byte)(99), GXv_char2) ;
         rreclv03.this.GXt_char1 = GXv_char2[0] ;
         AV73Lit6 = GXt_char1 ;
         GXt_char1 = AV78Lit7 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT5_", ""), (byte)(99), GXv_char2) ;
         rreclv03.this.GXt_char1 = GXv_char2[0] ;
         AV78Lit7 = httpContext.getMessage( "N.", "") + GXt_char1 ;
         GXt_char1 = AV89Lit8 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLAV092_", ""), (byte)(99), GXv_char2) ;
         rreclv03.this.GXt_char1 = GXv_char2[0] ;
         AV89Lit8 = GXt_char1 ;
         GXt_char1 = AV76Lit9 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2491_", ""), (byte)(99), GXv_char2) ;
         rreclv03.this.GXt_char1 = GXv_char2[0] ;
         AV76Lit9 = GXt_char1 ;
         GXt_char1 = AV77Lit10 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1150_", ""), (byte)(99), GXv_char2) ;
         rreclv03.this.GXt_char1 = GXv_char2[0] ;
         AV77Lit10 = GXt_char1 ;
         GXt_char1 = AV75Lit11 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN116_", ""), (byte)(99), GXv_char2) ;
         rreclv03.this.GXt_char1 = GXv_char2[0] ;
         AV75Lit11 = GXt_char1 ;
         GXt_char1 = AV84Lit12 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1439_", ""), (byte)(99), GXv_char2) ;
         rreclv03.this.GXt_char1 = GXv_char2[0] ;
         AV84Lit12 = GXt_char1 ;
         GXt_char1 = AV85Lit13 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLAV005_", ""), (byte)(99), GXv_char2) ;
         rreclv03.this.GXt_char1 = GXv_char2[0] ;
         AV85Lit13 = GXt_char1 ;
         GXt_char1 = AV79Lit14 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1160_", ""), (byte)(99), GXv_char2) ;
         rreclv03.this.GXt_char1 = GXv_char2[0] ;
         GXt_char3 = AV79Lit14 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN198_", ""), (byte)(99), GXv_char4) ;
         rreclv03.this.GXt_char3 = GXv_char4[0] ;
         AV79Lit14 = GXutil.trim( GXt_char1) + " - " + GXutil.trim( GXt_char3) ;
         GXt_char3 = AV80Lit15 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT3018_", ""), (byte)(99), GXv_char4) ;
         rreclv03.this.GXt_char3 = GXv_char4[0] ;
         AV80Lit15 = GXt_char3 ;
         GXt_char3 = AV81Lit16 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT3019_", ""), (byte)(99), GXv_char4) ;
         rreclv03.this.GXt_char3 = GXv_char4[0] ;
         AV81Lit16 = GXt_char3 ;
         GXt_char3 = AV82Lit17 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT3020_", ""), (byte)(99), GXv_char4) ;
         rreclv03.this.GXt_char3 = GXv_char4[0] ;
         AV82Lit17 = GXt_char3 ;
         GXt_char3 = AV83Lit18 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT3021_", ""), (byte)(99), GXv_char4) ;
         rreclv03.this.GXt_char3 = GXv_char4[0] ;
         AV83Lit18 = GXt_char3 ;
         GXt_char3 = AV86Lit19 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1326_", ""), (byte)(99), GXv_char4) ;
         rreclv03.this.GXt_char3 = GXv_char4[0] ;
         AV86Lit19 = GXt_char3 ;
         GXt_char3 = AV87Lit20 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1546_", ""), (byte)(99), GXv_char4) ;
         rreclv03.this.GXt_char3 = GXv_char4[0] ;
         AV87Lit20 = GXt_char3 ;
         GXt_char3 = AV88Lit21 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN176", ""), (byte)(99), GXv_char4) ;
         rreclv03.this.GXt_char3 = GXv_char4[0] ;
         AV88Lit21 = GXt_char3 ;
         GXt_char3 = AV90Lit22 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1160_", ""), (byte)(99), GXv_char4) ;
         rreclv03.this.GXt_char3 = GXv_char4[0] ;
         AV90Lit22 = GXt_char3 ;
         GXt_char3 = AV91Lit23 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WCFL117_", ""), (byte)(99), GXv_char4) ;
         rreclv03.this.GXt_char3 = GXv_char4[0] ;
         AV91Lit23 = GXt_char3 ;
         AV54Total_pdas = 0 ;
         /* Using cursor P06R42 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A4654RecNroPar = P06R42_A4654RecNroPar[0] ;
            n4654RecNroPar = P06R42_n4654RecNroPar[0] ;
            A4268RecOrdLin = P06R42_A4268RecOrdLin[0] ;
            n4268RecOrdLin = P06R42_n4268RecOrdLin[0] ;
            /* Using cursor P06R43 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Boolean.valueOf(n4268RecOrdLin), Short.valueOf(A4268RecOrdLin)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A194BarOrdLin = P06R43_A194BarOrdLin[0] ;
               A4638BarUltNlot = P06R43_A4638BarUltNlot[0] ;
               n4638BarUltNlot = P06R43_n4638BarUltNlot[0] ;
               A758ProCod = P06R43_A758ProCod[0] ;
               AV54Total_pdas = A4638BarUltNlot ;
               pr_default.readNext(1);
            }
            pr_default.close(1);
            /* Using cursor P06R44 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Boolean.valueOf(n4268RecOrdLin), Short.valueOf(A4268RecOrdLin), Boolean.valueOf(n4654RecNroPar), Integer.valueOf(A4654RecNroPar)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A194BarOrdLin = P06R44_A194BarOrdLin[0] ;
               A4643BarFasLot = P06R44_A4643BarFasLot[0] ;
               A4648BarFasRecu = P06R44_A4648BarFasRecu[0] ;
               n4648BarFasRecu = P06R44_n4648BarFasRecu[0] ;
               A758ProCod = P06R44_A758ProCod[0] ;
               AV56BarCod = A129BarCod ;
               AV57BarCodReo = A132BarCodReo ;
               AV58BarCodPar = A130BarCodPar ;
               AV59BarFAsRecu = A4648BarFasRecu ;
               AV60BarFasLot = A4643BarFasLot ;
               AV61BarOrdLin = A194BarOrdLin ;
               /* Execute user subroutine: 'RECUPERACIONES' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(2);
                  pr_default.close(0);
                  getPrinter().GxEndPage() ;
                  /* Close printer file */
                  getPrinter().GxEndDocument() ;
                  endPrinter();
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               pr_default.readNext(2);
            }
            pr_default.close(2);
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         /* Using cursor P06R47 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A2805RecVolPrd = P06R47_A2805RecVolPrd[0] ;
            A4654RecNroPar = P06R47_A4654RecNroPar[0] ;
            n4654RecNroPar = P06R47_n4654RecNroPar[0] ;
            A602MaqCod = P06R47_A602MaqCod[0] ;
            A605MaqCosMin = P06R47_A605MaqCosMin[0] ;
            n605MaqCosMin = P06R47_n605MaqCosMin[0] ;
            A4258RecMaqFas = P06R47_A4258RecMaqFas[0] ;
            n4258RecMaqFas = P06R47_n4258RecMaqFas[0] ;
            A252CliCod = P06R47_A252CliCod[0] ;
            n252CliCod = P06R47_n252CliCod[0] ;
            A279CliNom = P06R47_A279CliNom[0] ;
            A4609BarMdlCod = P06R47_A4609BarMdlCod[0] ;
            A212BarSer = P06R47_A212BarSer[0] ;
            A1652BarSerDsc = P06R47_A1652BarSerDsc[0] ;
            A135BarColNom = P06R47_A135BarColNom[0] ;
            A136BarColNum = P06R47_A136BarColNum[0] ;
            A166BarKgm = P06R47_A166BarKgm[0] ;
            A199BarPie1 = P06R47_A199BarPie1[0] ;
            A365DisDes = P06R47_A365DisDes[0] ;
            A898BarPieNDes = P06R47_A898BarPieNDes[0] ;
            A4273RecFagPrd = P06R47_A4273RecFagPrd[0] ;
            A4261RecTotPrd = P06R47_A4261RecTotPrd[0] ;
            n4261RecTotPrd = P06R47_n4261RecTotPrd[0] ;
            A4271RecFagKgs = P06R47_A4271RecFagKgs[0] ;
            A4259RecTotKgs = P06R47_A4259RecTotKgs[0] ;
            A605MaqCosMin = P06R47_A605MaqCosMin[0] ;
            n605MaqCosMin = P06R47_n605MaqCosMin[0] ;
            A252CliCod = P06R47_A252CliCod[0] ;
            n252CliCod = P06R47_n252CliCod[0] ;
            A4609BarMdlCod = P06R47_A4609BarMdlCod[0] ;
            A212BarSer = P06R47_A212BarSer[0] ;
            A1652BarSerDsc = P06R47_A1652BarSerDsc[0] ;
            A135BarColNom = P06R47_A135BarColNom[0] ;
            A136BarColNum = P06R47_A136BarColNum[0] ;
            A365DisDes = P06R47_A365DisDes[0] ;
            A279CliNom = P06R47_A279CliNom[0] ;
            A166BarKgm = P06R47_A166BarKgm[0] ;
            A199BarPie1 = P06R47_A199BarPie1[0] ;
            A898BarPieNDes = P06R47_A898BarPieNDes[0] ;
            A4273RecFagPrd = P06R47_A4273RecFagPrd[0] ;
            A4271RecFagKgs = P06R47_A4271RecFagKgs[0] ;
            A4316RecMaqKgs = A4259RecTotKgs.add(A4271RecFagKgs) ;
            A4318RecMaqPrd = (int)(A4261RecTotPrd+A4273RecFagPrd) ;
            if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
            {
               A198BarPie = A898BarPieNDes ;
            }
            else
            {
               A198BarPie = A199BarPie1 ;
            }
            AV46RecLinMaq = A2804RecLinMaq ;
            AV47recNropar = A4654RecNroPar ;
            AV48MaqCod = A602MaqCod ;
            AV65MaqCosMin = A605MaqCosMin ;
            GXv_char4[0] = A396EmprCod ;
            GXv_char2[0] = AV48MaqCod ;
            GXv_char5[0] = AV49MaqDsc ;
            new app.pmaqdsc(remoteHandle, context).execute( GXv_char4, GXv_char2, GXv_char5) ;
            rreclv03.this.A396EmprCod = GXv_char4[0] ;
            rreclv03.this.AV48MaqCod = GXv_char2[0] ;
            rreclv03.this.AV49MaqDsc = GXv_char5[0] ;
            AV11RecMaqKgs = A4316RecMaqKgs ;
            AV12RecMaqPrd = A4318RecMaqPrd ;
            AV9FasCod = A4258RecMaqFas ;
            GXv_char5[0] = AV10FasDsc ;
            new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, AV9FasCod, GXv_char5) ;
            rreclv03.this.AV10FasDsc = GXv_char5[0] ;
            AV14CliCod = A252CliCod ;
            AV15CliNom = A279CliNom ;
            AV18BarMdlCod = A4609BarMdlCod ;
            AV16BarSer = A212BarSer ;
            AV17BarSerDsc = A1652BarSerDsc ;
            AV41BarKgm = A166BarKgm ;
            AV42BarPie = A198BarPie ;
            AV43BarColNom = A135BarColNom ;
            AV44BarColNum = A136BarColNum ;
            AV13Hdr = GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + " " + A130BarCodPar ;
            h6R40( false, 65) ;
            getPrinter().GxDrawRect(547, Gx_line+30, 763, Gx_line+64, 1, 192, 192, 192, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawRect(8, Gx_line+1, 381, Gx_line+65, 1, 192, 192, 192, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48MaqCod, "")), 114, Gx_line+13, 196, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49MaqDsc, "")), 194, Gx_line+13, 295, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV11RecMaqKgs, "ZZZZZZ9.99")), 110, Gx_line+36, 184, Gx_line+54, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12RecMaqPrd), "ZZZZ9")), 322, Gx_line+36, 359, Gx_line+54, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Estimadas", ""), 242, Gx_line+36, 310, Gx_line+53, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV47recNropar), "ZZZZZ9")), 678, Gx_line+3, 711, Gx_line+19, 2, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10FasDsc, "")), 389, Gx_line+3, 589, Gx_line+20, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV54Total_pdas), "ZZZZZ9")), 723, Gx_line+3, 755, Gx_line+19, 2, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("/", 715, Gx_line+3, 719, Gx_line+19, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20TipDefDsc, "")), 551, Gx_line+44, 740, Gx_line+62, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55v_Texto, "")), 626, Gx_line+31, 684, Gx_line+47, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV75Lit11, "")), 29, Gx_line+13, 86, Gx_line+30, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV76Lit9, "")), 29, Gx_line+36, 92, Gx_line+53, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV77Lit10, "")), 193, Gx_line+36, 237, Gx_line+53, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV78Lit7, "")), 617, Gx_line+4, 675, Gx_line+20, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+65) ;
            AV38CosteT1 = DecimalUtil.doubleToDec(0) ;
            AV37CosteT2 = DecimalUtil.doubleToDec(0) ;
            AV64Tot_tt = (short)(0) ;
            /* Using cursor P06R48 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A1273RecLinPro = P06R48_A1273RecLinPro[0] ;
               A771ProForTie = P06R48_A771ProForTie[0] ;
               A2392ProNumPro = P06R48_A2392ProNumPro[0] ;
               A764ProForCod = P06R48_A764ProForCod[0] ;
               A4695RecVolPrf = P06R48_A4695RecVolPrf[0] ;
               A766ProForDsc = P06R48_A766ProForDsc[0] ;
               A771ProForTie = P06R48_A771ProForTie[0] ;
               A2392ProNumPro = P06R48_A2392ProNumPro[0] ;
               A766ProForDsc = P06R48_A766ProForDsc[0] ;
               AV22ProForTie = A771ProForTie ;
               AV23ProNumPro = A2392ProNumPro ;
               AV32ProForCod = A764ProForCod ;
               AV64Tot_tt = (short)(AV64Tot_tt+A771ProForTie) ;
               AV24vRb = (short)(0) ;
               if ( AV11RecMaqKgs.doubleValue() > 0 )
               {
                  AV24vRb = (short)(DecimalUtil.decToDouble(DecimalUtil.doubleToDec(A4695RecVolPrf).divide(AV11RecMaqKgs, 18, java.math.RoundingMode.DOWN))) ;
                  h6R40( false, 66) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV79Lit14, "")), 31, Gx_line+34, 228, Gx_line+51, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV80Lit15, "")), 294, Gx_line+34, 413, Gx_line+51, 1, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV81Lit16, "")), 428, Gx_line+34, 544, Gx_line+51, 1, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV82Lit17, "")), 570, Gx_line+34, 651, Gx_line+51, 1, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV83Lit18, "")), 692, Gx_line+34, 762, Gx_line+52, 1+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(8, Gx_line+2, 782, Gx_line+24, 1, 192, 192, 192, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A766ProForDsc, "")), 116, Gx_line+5, 305, Gx_line+23, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A764ProForCod, "")), 26, Gx_line+5, 108, Gx_line+23, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4695RecVolPrf), "ZZZZ9")), 617, Gx_line+5, 654, Gx_line+23, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Rb", ""), 710, Gx_line+5, 729, Gx_line+22, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV24vRb), "ZZZ9")), 738, Gx_line+5, 768, Gx_line+23, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(8, Gx_line+23, 782, Gx_line+61, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(420, Gx_line+24, 420, Gx_line+60, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(285, Gx_line+24, 285, Gx_line+60, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(552, Gx_line+24, 552, Gx_line+60, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(668, Gx_line+24, 668, Gx_line+60, 1, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV22ProForTie), "ZZZ9")), 500, Gx_line+6, 530, Gx_line+23, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV84Lit12, "")), 552, Gx_line+5, 611, Gx_line+22, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV85Lit13, "")), 443, Gx_line+5, 493, Gx_line+22, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV89Lit8, "")), 663, Gx_line+5, 699, Gx_line+22, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+66) ;
               }
               AV26Coste1 = DecimalUtil.doubleToDec(0) ;
               AV27Coste2 = DecimalUtil.doubleToDec(0) ;
               AV31Costea1 = DecimalUtil.doubleToDec(0) ;
               AV30Costep1 = DecimalUtil.doubleToDec(0) ;
               /* Using cursor P06R49 */
               pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro)});
               while ( (pr_default.getStatus(5) != 101) )
               {
                  A719PrdNum = P06R49_A719PrdNum[0] ;
                  n719PrdNum = P06R49_n719PrdNum[0] ;
                  A872RecPrdNum = P06R49_A872RecPrdNum[0] ;
                  A707PrdFacCon = P06R49_A707PrdFacCon[0] ;
                  A724PrdPreAct = P06R49_A724PrdPreAct[0] ;
                  A686PrdCant = P06R49_A686PrdCant[0] ;
                  A1797PrdCanAny = P06R49_A1797PrdCanAny[0] ;
                  A490ForPrdUMe = P06R49_A490ForPrdUMe[0] ;
                  n490ForPrdUMe = P06R49_n490ForPrdUMe[0] ;
                  A743PrdUniCon = P06R49_A743PrdUniCon[0] ;
                  A875RecPrdDsc = P06R49_A875RecPrdDsc[0] ;
                  A811RecLin = P06R49_A811RecLin[0] ;
                  A707PrdFacCon = P06R49_A707PrdFacCon[0] ;
                  A724PrdPreAct = P06R49_A724PrdPreAct[0] ;
                  A743PrdUniCon = P06R49_A743PrdUniCon[0] ;
                  AV33Prdcfin = DecimalUtil.doubleToDec(0) ;
                  /* Optimized group. */
                  /* Using cursor P06R410 */
                  pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                  c1378PrdCFin = P06R410_A1378PrdCFin[0] ;
                  n1378PrdCFin = P06R410_n1378PrdCFin[0] ;
                  pr_default.close(6);
                  AV33Prdcfin = AV33Prdcfin.add(c1378PrdCFin) ;
                  /* End optimized group. */
                  AV26Coste1 = GXutil.roundDecimal( A686PrdCant.multiply(A724PrdPreAct).multiply(A707PrdFacCon).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN), 2) ;
                  AV27Coste2 = GXutil.roundDecimal( (A686PrdCant.add((A1797PrdCanAny.add(AV33Prdcfin)))).multiply(A724PrdPreAct).multiply(A707PrdFacCon).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN), 2) ;
                  AV36CantFinal = A686PrdCant.add(A1797PrdCanAny).add(AV33Prdcfin) ;
                  AV35CodPrd = GXutil.substring( A872RecPrdNum, 1, 1) ;
                  if ( ( A686PrdCant.doubleValue() > 1000 ) && ( ( GXutil.strcmp(AV35CodPrd, "8") == 0 ) || ( GXutil.strcmp(AV35CodPrd, "9") == 0 ) || ( GXutil.strcmp(AV35CodPrd, "0") == 0 ) ) )
                  {
                     if ( A490ForPrdUMe == 2 )
                     {
                        AV29Unidades = httpContext.getMessage( "Lt", "") ;
                     }
                     else
                     {
                        if ( A490ForPrdUMe == 3 )
                        {
                           if ( A743PrdUniCon == 3 )
                           {
                              AV29Unidades = httpContext.getMessage( "Lt", "") ;
                           }
                           else
                           {
                              AV29Unidades = httpContext.getMessage( "Kg", "") ;
                           }
                        }
                        else
                        {
                           AV29Unidades = httpContext.getMessage( "Kg", "") ;
                           if ( A743PrdUniCon == 3 )
                           {
                              AV29Unidades = httpContext.getMessage( "Lt", "") ;
                           }
                        }
                     }
                     AV25PrdCant = A686PrdCant.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
                     AV28PrdCanAny = (A686PrdCant.add(A1797PrdCanAny).add(AV33Prdcfin)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
                  }
                  else
                  {
                     if ( A490ForPrdUMe == 2 )
                     {
                        AV29Unidades = httpContext.getMessage( "Cc", "") ;
                     }
                     else
                     {
                        if ( A490ForPrdUMe == 3 )
                        {
                           if ( A743PrdUniCon == 3 )
                           {
                              AV29Unidades = httpContext.getMessage( "Cc", "") ;
                           }
                           else
                           {
                              AV29Unidades = httpContext.getMessage( "Gr", "") ;
                           }
                        }
                        else
                        {
                           AV29Unidades = httpContext.getMessage( "Gr", "") ;
                           if ( A743PrdUniCon == 3 )
                           {
                              AV29Unidades = httpContext.getMessage( "Cc", "") ;
                           }
                        }
                     }
                     AV25PrdCant = A686PrdCant ;
                     AV28PrdCanAny = (A686PrdCant.add((A1797PrdCanAny.add(AV33Prdcfin)))) ;
                  }
                  AV35CodPrd = GXutil.substring( A872RecPrdNum, 1, 1) ;
                  if ( ( GXutil.strcmp(AV35CodPrd, "8") == 0 ) || ( GXutil.strcmp(AV35CodPrd, "9") == 0 ) || ( GXutil.strcmp(AV35CodPrd, "0") == 0 ) )
                  {
                     h6R40( false, 15) ;
                     getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A872RecPrdNum, "")), 42, Gx_line+0, 106, Gx_line+16, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A875RecPrdDsc, "")), 94, Gx_line+0, 230, Gx_line+15, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV25PrdCant, "ZZZZZZ9.999")), 298, Gx_line+0, 368, Gx_line+16, 2+256, 0, 1, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV26Coste1, "ZZZZZZ9.99")), 577, Gx_line+0, 641, Gx_line+16, 2+256, 0, 1, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27Coste2, "ZZZZZZ9.99")), 695, Gx_line+0, 759, Gx_line+16, 2+256, 0, 1, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV28PrdCanAny, "ZZZZZZ9.999")), 435, Gx_line+0, 505, Gx_line+16, 2+256, 0, 1, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29Unidades, "")), 388, Gx_line+0, 410, Gx_line+16, 0+256, 0, 1, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29Unidades, "")), 522, Gx_line+0, 544, Gx_line+16, 0+256, 0, 1, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+15) ;
                  }
                  else
                  {
                     h6R40( false, 15) ;
                     getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A872RecPrdNum, "")), 42, Gx_line+0, 106, Gx_line+16, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A875RecPrdDsc, "")), 94, Gx_line+0, 230, Gx_line+16, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV25PrdCant, "ZZZZZZ9.999")), 298, Gx_line+0, 368, Gx_line+16, 2+256, 0, 1, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV26Coste1, "ZZZZZZ9.99")), 577, Gx_line+0, 641, Gx_line+16, 2+256, 0, 1, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27Coste2, "ZZZZZZ9.99")), 695, Gx_line+0, 759, Gx_line+16, 2+256, 0, 1, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV28PrdCanAny, "ZZZZZZ9.999")), 435, Gx_line+0, 505, Gx_line+16, 2+256, 0, 1, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29Unidades, "")), 388, Gx_line+0, 410, Gx_line+16, 0+256, 0, 1, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29Unidades, "")), 522, Gx_line+0, 544, Gx_line+16, 0+256, 0, 1, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+15) ;
                  }
                  AV30Costep1 = AV30Costep1.add(GXutil.roundDecimal( A686PrdCant.multiply(A724PrdPreAct).multiply(A707PrdFacCon).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN), 2)) ;
                  AV31Costea1 = AV31Costea1.add(GXutil.roundDecimal( (A686PrdCant.add(A1797PrdCanAny).add(AV33Prdcfin)).multiply(A724PrdPreAct).multiply(A707PrdFacCon).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN), 2)) ;
                  pr_default.readNext(5);
               }
               pr_default.close(5);
               AV39CosteK1 = GXutil.roundDecimal( AV30Costep1.divide(AV11RecMaqKgs, 18, java.math.RoundingMode.DOWN), 2) ;
               AV40CosteK2 = GXutil.roundDecimal( AV31Costea1.divide(AV11RecMaqKgs, 18, java.math.RoundingMode.DOWN), 2) ;
               AV62CostePz1 = DecimalUtil.doubleToDec(0) ;
               AV63CostePz2 = DecimalUtil.doubleToDec(0) ;
               if ( AV12RecMaqPrd > 0 )
               {
                  AV62CostePz1 = GXutil.roundDecimal( AV30Costep1.divide(DecimalUtil.doubleToDec(AV12RecMaqPrd), 18, java.math.RoundingMode.DOWN), 2) ;
                  AV63CostePz2 = GXutil.roundDecimal( AV31Costea1.divide(DecimalUtil.doubleToDec(AV12RecMaqPrd), 18, java.math.RoundingMode.DOWN), 2) ;
               }
               h6R40( false, 69) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV31Costea1, "ZZZZZZ9.99")), 695, Gx_line+8, 759, Gx_line+24, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV30Costep1, "ZZZZZZ9.99")), 577, Gx_line+8, 641, Gx_line+24, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV39CosteK1, "ZZZZZZ9.99")), 577, Gx_line+27, 641, Gx_line+43, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV40CosteK2, "ZZZZZZ9.99")), 695, Gx_line+29, 759, Gx_line+45, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A764ProForCod, "")), 317, Gx_line+7, 387, Gx_line+24, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A766ProForDsc, "")), 369, Gx_line+7, 526, Gx_line+24, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(202, Gx_line+0, 782, Gx_line+67, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(551, Gx_line+0, 551, Gx_line+67, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(667, Gx_line+0, 667, Gx_line+67, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV62CostePz1, "ZZZZZZ9.99")), 577, Gx_line+46, 641, Gx_line+62, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV63CostePz2, "ZZZZZZ9.99")), 695, Gx_line+47, 759, Gx_line+63, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "p/Kg", ""), 257, Gx_line+27, 283, Gx_line+42, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "p/Prenda", ""), 257, Gx_line+46, 309, Gx_line+61, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV88Lit21, "")), 221, Gx_line+8, 255, Gx_line+23, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV86Lit19, "")), 257, Gx_line+8, 312, Gx_line+23, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV88Lit21, "")), 221, Gx_line+27, 255, Gx_line+42, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV88Lit21, "")), 221, Gx_line+46, 255, Gx_line+61, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+69) ;
               AV38CosteT1 = AV38CosteT1.add(AV30Costep1) ;
               AV37CosteT2 = AV37CosteT2.add(AV31Costea1) ;
               pr_default.readNext(4);
            }
            pr_default.close(4);
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
         AV66CosteMaq = GXutil.roundDecimal( AV65MaqCosMin.multiply(DecimalUtil.doubleToDec(AV64Tot_tt)), 2) ;
         AV67CosteT3 = AV38CosteT1.add(AV66CosteMaq) ;
         AV68CosteT4 = AV37CosteT2.add(AV66CosteMaq) ;
         AV39CosteK1 = GXutil.roundDecimal( AV67CosteT3.divide(AV11RecMaqKgs, 18, java.math.RoundingMode.DOWN), 2) ;
         AV40CosteK2 = GXutil.roundDecimal( AV68CosteT4.divide(AV11RecMaqKgs, 18, java.math.RoundingMode.DOWN), 2) ;
         AV62CostePz1 = DecimalUtil.doubleToDec(0) ;
         AV63CostePz2 = DecimalUtil.doubleToDec(0) ;
         if ( AV12RecMaqPrd > 0 )
         {
            AV62CostePz1 = GXutil.roundDecimal( AV67CosteT3.divide(DecimalUtil.doubleToDec(AV12RecMaqPrd), 18, java.math.RoundingMode.DOWN), 2) ;
            AV63CostePz2 = GXutil.roundDecimal( AV68CosteT4.divide(DecimalUtil.doubleToDec(AV12RecMaqPrd), 18, java.math.RoundingMode.DOWN), 2) ;
         }
         h6R40( false, 165) ;
         getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV37CosteT2, "ZZZZZZ9.99")), 695, Gx_line+6, 759, Gx_line+22, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV38CosteT1, "ZZZZZZ9.99")), 577, Gx_line+6, 641, Gx_line+22, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV39CosteK1, "ZZZZZZ9.99")), 577, Gx_line+71, 641, Gx_line+87, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV40CosteK2, "ZZZZZZ9.99")), 695, Gx_line+71, 759, Gx_line+87, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawRect(202, Gx_line+0, 782, Gx_line+117, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(667, Gx_line+0, 667, Gx_line+117, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(551, Gx_line+0, 551, Gx_line+117, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV62CostePz1, "ZZZZZZ9.99")), 577, Gx_line+93, 641, Gx_line+109, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV63CostePz2, "ZZZZZZ9.99")), 695, Gx_line+93, 759, Gx_line+109, 2+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV64Tot_tt), "ZZZ9")), 594, Gx_line+119, 620, Gx_line+135, 2+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Formula", ""), 506, Gx_line+120, 554, Gx_line+135, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "m.", ""), 625, Gx_line+120, 641, Gx_line+135, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV66CosteMaq, "ZZZZZZ9.99")), 577, Gx_line+28, 641, Gx_line+44, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV66CosteMaq, "ZZZZZZ9.99")), 695, Gx_line+28, 759, Gx_line+44, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV67CosteT3, "ZZZZZZ9.99")), 577, Gx_line+50, 641, Gx_line+66, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV68CosteT4, "ZZZZZZ9.99")), 695, Gx_line+50, 759, Gx_line+66, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV87Lit20, "")), 421, Gx_line+50, 485, Gx_line+66, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "p/Kg", ""), 459, Gx_line+71, 485, Gx_line+86, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "p/Prenda", ""), 459, Gx_line+93, 511, Gx_line+108, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV88Lit21, "")), 421, Gx_line+71, 455, Gx_line+86, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV88Lit21, "")), 421, Gx_line+93, 455, Gx_line+108, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV88Lit21, "")), 421, Gx_line+6, 455, Gx_line+21, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV88Lit21, "")), 421, Gx_line+28, 455, Gx_line+43, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV75Lit11, "")), 459, Gx_line+28, 533, Gx_line+44, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV85Lit13, "")), 456, Gx_line+120, 503, Gx_line+135, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV90Lit22, "")), 458, Gx_line+6, 511, Gx_line+22, 0+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+165) ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6R40( true, 0) ;
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
      /* 'RECUPERACIONES' Routine */
      returnInSub = false ;
      AV20TipDefDsc = GXutil.space( (short)(30)) ;
      AV55v_Texto = GXutil.space( (short)(10)) ;
      /* Using cursor P06R411 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(AV56BarCod), Byte.valueOf(AV57BarCodReo), AV58BarCodPar, Integer.valueOf(AV60BarFasLot), Short.valueOf(AV61BarOrdLin), Integer.valueOf(AV59BarFAsRecu)});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A833TipDefCod = P06R411_A833TipDefCod[0] ;
         n833TipDefCod = P06R411_n833TipDefCod[0] ;
         A4667HisLavCon = P06R411_A4667HisLavCon[0] ;
         A4665HisLavOrd = P06R411_A4665HisLavOrd[0] ;
         A4664HisLavNpd = P06R411_A4664HisLavNpd[0] ;
         A4663HisLavPar = P06R411_A4663HisLavPar[0] ;
         A4662HisLavReo = P06R411_A4662HisLavReo[0] ;
         A4661HisLavCod = P06R411_A4661HisLavCod[0] ;
         A834TipDefDsc = P06R411_A834TipDefDsc[0] ;
         n834TipDefDsc = P06R411_n834TipDefDsc[0] ;
         A834TipDefDsc = P06R411_A834TipDefDsc[0] ;
         n834TipDefDsc = P06R411_n834TipDefDsc[0] ;
         AV20TipDefDsc = A834TipDefDsc ;
         if ( GXutil.strcmp(AV91Lit23, httpContext.getMessage( "WCFL117_", "")) == 0 )
         {
            AV55v_Texto = httpContext.getMessage( "RECUPERAÇAO", "") ;
         }
         else
         {
            AV55v_Texto = AV91Lit23 ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(7);
   }

   public void h6R40( boolean bFoot ,
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
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV69Lit2, "")), 668, Gx_line+16, 718, Gx_line+33, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70Lit3, "")), 20, Gx_line+15, 140, Gx_line+32, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV71Lit4, "")), 20, Gx_line+48, 67, Gx_line+65, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV73Lit6, "")), 532, Gx_line+79, 567, Gx_line+96, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 729, Gx_line+17, 774, Gx_line+34, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV99Pgmname, "")), 530, Gx_line+18, 687, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV13Hdr, "")), 155, Gx_line+11, 248, Gx_line+32, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nº Acatex", ""), 285, Gx_line+15, 351, Gx_line+32, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV46RecLinMaq), "ZZZ9")), 364, Gx_line+16, 394, Gx_line+33, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV72Lit5, "")), 20, Gx_line+79, 71, Gx_line+96, 0, 0, 0, 0) ;
            getPrinter().GxDrawRect(8, Gx_line+36, 782, Gx_line+101, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV14CliCod), "ZZZZZ9")), 82, Gx_line+48, 127, Gx_line+66, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV16BarSer, "")), 82, Gx_line+79, 183, Gx_line+97, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17BarSerDsc, "")), 194, Gx_line+79, 358, Gx_line+97, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV15CliNom, "")), 132, Gx_line+48, 321, Gx_line+66, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43BarColNom, "")), 588, Gx_line+80, 657, Gx_line+97, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV44BarColNum), "ZZZZZ9")), 697, Gx_line+80, 742, Gx_line+97, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV45BarTipCol), "Z9")), 754, Gx_line+80, 770, Gx_line+97, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(521, Gx_line+56, 782, Gx_line+101, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV74Lit1, "")), 540, Gx_line+52, 616, Gx_line+67, 1, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+101) ;
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
      this.aP0[0] = rreclv03.this.A396EmprCod;
      this.aP1[0] = rreclv03.this.A129BarCod;
      this.aP2[0] = rreclv03.this.A132BarCodReo;
      this.aP3[0] = rreclv03.this.A130BarCodPar;
      this.aP4[0] = rreclv03.this.A2804RecLinMaq;
      this.aP5[0] = rreclv03.this.Gx_out;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV74Lit1 = "" ;
      AV69Lit2 = "" ;
      AV70Lit3 = "" ;
      AV71Lit4 = "" ;
      AV72Lit5 = "" ;
      AV73Lit6 = "" ;
      AV78Lit7 = "" ;
      AV89Lit8 = "" ;
      AV76Lit9 = "" ;
      AV77Lit10 = "" ;
      AV75Lit11 = "" ;
      AV84Lit12 = "" ;
      AV85Lit13 = "" ;
      AV79Lit14 = "" ;
      GXt_char1 = "" ;
      AV80Lit15 = "" ;
      AV81Lit16 = "" ;
      AV82Lit17 = "" ;
      AV83Lit18 = "" ;
      AV86Lit19 = "" ;
      AV87Lit20 = "" ;
      AV88Lit21 = "" ;
      AV90Lit22 = "" ;
      AV91Lit23 = "" ;
      GXt_char3 = "" ;
      scmdbuf = "" ;
      P06R42_A396EmprCod = new String[] {""} ;
      P06R42_A129BarCod = new int[1] ;
      P06R42_A132BarCodReo = new byte[1] ;
      P06R42_A130BarCodPar = new String[] {""} ;
      P06R42_A2804RecLinMaq = new short[1] ;
      P06R42_A4654RecNroPar = new int[1] ;
      P06R42_n4654RecNroPar = new boolean[] {false} ;
      P06R42_A4268RecOrdLin = new short[1] ;
      P06R42_n4268RecOrdLin = new boolean[] {false} ;
      P06R43_A396EmprCod = new String[] {""} ;
      P06R43_A129BarCod = new int[1] ;
      P06R43_A132BarCodReo = new byte[1] ;
      P06R43_A130BarCodPar = new String[] {""} ;
      P06R43_A194BarOrdLin = new short[1] ;
      P06R43_A4638BarUltNlot = new int[1] ;
      P06R43_n4638BarUltNlot = new boolean[] {false} ;
      P06R43_A758ProCod = new String[] {""} ;
      A758ProCod = "" ;
      P06R44_A396EmprCod = new String[] {""} ;
      P06R44_A129BarCod = new int[1] ;
      P06R44_A132BarCodReo = new byte[1] ;
      P06R44_A130BarCodPar = new String[] {""} ;
      P06R44_A194BarOrdLin = new short[1] ;
      P06R44_A4643BarFasLot = new int[1] ;
      P06R44_A4648BarFasRecu = new int[1] ;
      P06R44_n4648BarFasRecu = new boolean[] {false} ;
      P06R44_A758ProCod = new String[] {""} ;
      AV58BarCodPar = "" ;
      P06R47_A396EmprCod = new String[] {""} ;
      P06R47_A129BarCod = new int[1] ;
      P06R47_A132BarCodReo = new byte[1] ;
      P06R47_A130BarCodPar = new String[] {""} ;
      P06R47_A2804RecLinMaq = new short[1] ;
      P06R47_A2805RecVolPrd = new int[1] ;
      P06R47_A4654RecNroPar = new int[1] ;
      P06R47_n4654RecNroPar = new boolean[] {false} ;
      P06R47_A602MaqCod = new String[] {""} ;
      P06R47_A605MaqCosMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06R47_n605MaqCosMin = new boolean[] {false} ;
      P06R47_A4258RecMaqFas = new String[] {""} ;
      P06R47_n4258RecMaqFas = new boolean[] {false} ;
      P06R47_A252CliCod = new int[1] ;
      P06R47_n252CliCod = new boolean[] {false} ;
      P06R47_A279CliNom = new String[] {""} ;
      P06R47_A4609BarMdlCod = new String[] {""} ;
      P06R47_A212BarSer = new String[] {""} ;
      P06R47_A1652BarSerDsc = new String[] {""} ;
      P06R47_A135BarColNom = new String[] {""} ;
      P06R47_A136BarColNum = new int[1] ;
      P06R47_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06R47_A199BarPie1 = new short[1] ;
      P06R47_A365DisDes = new String[] {""} ;
      P06R47_A898BarPieNDes = new int[1] ;
      P06R47_A4273RecFagPrd = new int[1] ;
      P06R47_A4261RecTotPrd = new int[1] ;
      P06R47_n4261RecTotPrd = new boolean[] {false} ;
      P06R47_A4271RecFagKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06R47_A4259RecTotKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A602MaqCod = "" ;
      A605MaqCosMin = DecimalUtil.ZERO ;
      A4258RecMaqFas = "" ;
      A279CliNom = "" ;
      A4609BarMdlCod = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A365DisDes = "" ;
      A4271RecFagKgs = DecimalUtil.ZERO ;
      A4259RecTotKgs = DecimalUtil.ZERO ;
      A4316RecMaqKgs = DecimalUtil.ZERO ;
      AV48MaqCod = "" ;
      AV65MaqCosMin = DecimalUtil.ZERO ;
      GXv_char4 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV49MaqDsc = "" ;
      AV11RecMaqKgs = DecimalUtil.ZERO ;
      AV9FasCod = "" ;
      AV10FasDsc = "" ;
      GXv_char5 = new String[1] ;
      AV15CliNom = "" ;
      AV18BarMdlCod = "" ;
      AV16BarSer = "" ;
      AV17BarSerDsc = "" ;
      AV41BarKgm = DecimalUtil.ZERO ;
      AV43BarColNom = "" ;
      AV13Hdr = "" ;
      AV20TipDefDsc = "" ;
      AV55v_Texto = "" ;
      AV38CosteT1 = DecimalUtil.ZERO ;
      AV37CosteT2 = DecimalUtil.ZERO ;
      P06R48_A396EmprCod = new String[] {""} ;
      P06R48_A129BarCod = new int[1] ;
      P06R48_A132BarCodReo = new byte[1] ;
      P06R48_A130BarCodPar = new String[] {""} ;
      P06R48_A2804RecLinMaq = new short[1] ;
      P06R48_A1273RecLinPro = new byte[1] ;
      P06R48_A771ProForTie = new short[1] ;
      P06R48_A2392ProNumPro = new int[1] ;
      P06R48_A764ProForCod = new String[] {""} ;
      P06R48_A4695RecVolPrf = new int[1] ;
      P06R48_A766ProForDsc = new String[] {""} ;
      A764ProForCod = "" ;
      A766ProForDsc = "" ;
      AV32ProForCod = "" ;
      AV26Coste1 = DecimalUtil.ZERO ;
      AV27Coste2 = DecimalUtil.ZERO ;
      AV31Costea1 = DecimalUtil.ZERO ;
      AV30Costep1 = DecimalUtil.ZERO ;
      P06R49_A719PrdNum = new String[] {""} ;
      P06R49_n719PrdNum = new boolean[] {false} ;
      P06R49_A396EmprCod = new String[] {""} ;
      P06R49_A129BarCod = new int[1] ;
      P06R49_A132BarCodReo = new byte[1] ;
      P06R49_A130BarCodPar = new String[] {""} ;
      P06R49_A2804RecLinMaq = new short[1] ;
      P06R49_A1273RecLinPro = new byte[1] ;
      P06R49_A872RecPrdNum = new String[] {""} ;
      P06R49_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06R49_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06R49_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06R49_A1797PrdCanAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06R49_A490ForPrdUMe = new byte[1] ;
      P06R49_n490ForPrdUMe = new boolean[] {false} ;
      P06R49_A743PrdUniCon = new byte[1] ;
      P06R49_A875RecPrdDsc = new String[] {""} ;
      P06R49_A811RecLin = new short[1] ;
      A719PrdNum = "" ;
      A872RecPrdNum = "" ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A686PrdCant = DecimalUtil.ZERO ;
      A1797PrdCanAny = DecimalUtil.ZERO ;
      A875RecPrdDsc = "" ;
      AV33Prdcfin = DecimalUtil.ZERO ;
      c1378PrdCFin = DecimalUtil.ZERO ;
      P06R410_A1378PrdCFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06R410_n1378PrdCFin = new boolean[] {false} ;
      AV36CantFinal = DecimalUtil.ZERO ;
      AV35CodPrd = "" ;
      AV29Unidades = "" ;
      AV25PrdCant = DecimalUtil.ZERO ;
      AV28PrdCanAny = DecimalUtil.ZERO ;
      AV39CosteK1 = DecimalUtil.ZERO ;
      AV40CosteK2 = DecimalUtil.ZERO ;
      AV62CostePz1 = DecimalUtil.ZERO ;
      AV63CostePz2 = DecimalUtil.ZERO ;
      AV66CosteMaq = DecimalUtil.ZERO ;
      AV67CosteT3 = DecimalUtil.ZERO ;
      AV68CosteT4 = DecimalUtil.ZERO ;
      P06R411_A833TipDefCod = new short[1] ;
      P06R411_n833TipDefCod = new boolean[] {false} ;
      P06R411_A396EmprCod = new String[] {""} ;
      P06R411_A4667HisLavCon = new int[1] ;
      P06R411_A4665HisLavOrd = new short[1] ;
      P06R411_A4664HisLavNpd = new int[1] ;
      P06R411_A4663HisLavPar = new String[] {""} ;
      P06R411_A4662HisLavReo = new byte[1] ;
      P06R411_A4661HisLavCod = new int[1] ;
      P06R411_A834TipDefDsc = new String[] {""} ;
      P06R411_n834TipDefDsc = new boolean[] {false} ;
      A4663HisLavPar = "" ;
      A834TipDefDsc = "" ;
      AV99Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rreclv03__default(),
         new Object[] {
             new Object[] {
            P06R42_A396EmprCod, P06R42_A129BarCod, P06R42_A132BarCodReo, P06R42_A130BarCodPar, P06R42_A2804RecLinMaq, P06R42_A4654RecNroPar, P06R42_n4654RecNroPar, P06R42_A4268RecOrdLin, P06R42_n4268RecOrdLin
            }
            , new Object[] {
            P06R43_A396EmprCod, P06R43_A129BarCod, P06R43_A132BarCodReo, P06R43_A130BarCodPar, P06R43_A194BarOrdLin, P06R43_A4638BarUltNlot, P06R43_n4638BarUltNlot, P06R43_A758ProCod
            }
            , new Object[] {
            P06R44_A396EmprCod, P06R44_A129BarCod, P06R44_A132BarCodReo, P06R44_A130BarCodPar, P06R44_A194BarOrdLin, P06R44_A4643BarFasLot, P06R44_A4648BarFasRecu, P06R44_n4648BarFasRecu, P06R44_A758ProCod
            }
            , new Object[] {
            P06R47_A396EmprCod, P06R47_A129BarCod, P06R47_A132BarCodReo, P06R47_A130BarCodPar, P06R47_A2804RecLinMaq, P06R47_A2805RecVolPrd, P06R47_A4654RecNroPar, P06R47_n4654RecNroPar, P06R47_A602MaqCod, P06R47_A605MaqCosMin,
            P06R47_n605MaqCosMin, P06R47_A4258RecMaqFas, P06R47_n4258RecMaqFas, P06R47_A252CliCod, P06R47_n252CliCod, P06R47_A279CliNom, P06R47_A4609BarMdlCod, P06R47_A212BarSer, P06R47_A1652BarSerDsc, P06R47_A135BarColNom,
            P06R47_A136BarColNum, P06R47_A166BarKgm, P06R47_A199BarPie1, P06R47_A365DisDes, P06R47_A898BarPieNDes, P06R47_A4273RecFagPrd, P06R47_A4261RecTotPrd, P06R47_n4261RecTotPrd, P06R47_A4271RecFagKgs, P06R47_A4259RecTotKgs
            }
            , new Object[] {
            P06R48_A396EmprCod, P06R48_A129BarCod, P06R48_A132BarCodReo, P06R48_A130BarCodPar, P06R48_A2804RecLinMaq, P06R48_A1273RecLinPro, P06R48_A771ProForTie, P06R48_A2392ProNumPro, P06R48_A764ProForCod, P06R48_A4695RecVolPrf,
            P06R48_A766ProForDsc
            }
            , new Object[] {
            P06R49_A719PrdNum, P06R49_n719PrdNum, P06R49_A396EmprCod, P06R49_A129BarCod, P06R49_A132BarCodReo, P06R49_A130BarCodPar, P06R49_A2804RecLinMaq, P06R49_A1273RecLinPro, P06R49_A872RecPrdNum, P06R49_A707PrdFacCon,
            P06R49_A724PrdPreAct, P06R49_A686PrdCant, P06R49_A1797PrdCanAny, P06R49_A490ForPrdUMe, P06R49_n490ForPrdUMe, P06R49_A743PrdUniCon, P06R49_A875RecPrdDsc, P06R49_A811RecLin
            }
            , new Object[] {
            P06R410_A1378PrdCFin, P06R410_n1378PrdCFin
            }
            , new Object[] {
            P06R411_A833TipDefCod, P06R411_n833TipDefCod, P06R411_A396EmprCod, P06R411_A4667HisLavCon, P06R411_A4665HisLavOrd, P06R411_A4664HisLavNpd, P06R411_A4663HisLavPar, P06R411_A4662HisLavReo, P06R411_A4661HisLavCod, P06R411_A834TipDefDsc,
            P06R411_n834TipDefDsc
            }
         }
      );
      AV99Pgmname = "RRECLV03" ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      AV99Pgmname = "RRECLV03" ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV57BarCodReo ;
   private byte A1273RecLinPro ;
   private byte A490ForPrdUMe ;
   private byte A743PrdUniCon ;
   private byte A4662HisLavReo ;
   private byte AV45BarTipCol ;
   private short A2804RecLinMaq ;
   private short A4268RecOrdLin ;
   private short A194BarOrdLin ;
   private short AV61BarOrdLin ;
   private short A199BarPie1 ;
   private short AV46RecLinMaq ;
   private short AV64Tot_tt ;
   private short A771ProForTie ;
   private short AV22ProForTie ;
   private short AV24vRb ;
   private short A811RecLin ;
   private short A833TipDefCod ;
   private short A4665HisLavOrd ;
   private short Gx_err ;
   private int A129BarCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int AV54Total_pdas ;
   private int A4654RecNroPar ;
   private int A4638BarUltNlot ;
   private int A4643BarFasLot ;
   private int A4648BarFasRecu ;
   private int AV56BarCod ;
   private int AV59BarFAsRecu ;
   private int AV60BarFasLot ;
   private int A2805RecVolPrd ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A898BarPieNDes ;
   private int A4273RecFagPrd ;
   private int A4261RecTotPrd ;
   private int A4318RecMaqPrd ;
   private int A198BarPie ;
   private int AV47recNropar ;
   private int AV12RecMaqPrd ;
   private int AV14CliCod ;
   private int AV42BarPie ;
   private int AV44BarColNum ;
   private int Gx_OldLine ;
   private int A2392ProNumPro ;
   private int A4695RecVolPrf ;
   private int AV23ProNumPro ;
   private int A4667HisLavCon ;
   private int A4664HisLavNpd ;
   private int A4661HisLavCod ;
   private java.math.BigDecimal A605MaqCosMin ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A4271RecFagKgs ;
   private java.math.BigDecimal A4259RecTotKgs ;
   private java.math.BigDecimal A4316RecMaqKgs ;
   private java.math.BigDecimal AV65MaqCosMin ;
   private java.math.BigDecimal AV11RecMaqKgs ;
   private java.math.BigDecimal AV41BarKgm ;
   private java.math.BigDecimal AV38CosteT1 ;
   private java.math.BigDecimal AV37CosteT2 ;
   private java.math.BigDecimal AV26Coste1 ;
   private java.math.BigDecimal AV27Coste2 ;
   private java.math.BigDecimal AV31Costea1 ;
   private java.math.BigDecimal AV30Costep1 ;
   private java.math.BigDecimal A707PrdFacCon ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A686PrdCant ;
   private java.math.BigDecimal A1797PrdCanAny ;
   private java.math.BigDecimal AV33Prdcfin ;
   private java.math.BigDecimal c1378PrdCFin ;
   private java.math.BigDecimal AV36CantFinal ;
   private java.math.BigDecimal AV25PrdCant ;
   private java.math.BigDecimal AV28PrdCanAny ;
   private java.math.BigDecimal AV39CosteK1 ;
   private java.math.BigDecimal AV40CosteK2 ;
   private java.math.BigDecimal AV62CostePz1 ;
   private java.math.BigDecimal AV63CostePz2 ;
   private java.math.BigDecimal AV66CosteMaq ;
   private java.math.BigDecimal AV67CosteT3 ;
   private java.math.BigDecimal AV68CosteT4 ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String Gx_out ;
   private String AV74Lit1 ;
   private String AV69Lit2 ;
   private String AV70Lit3 ;
   private String AV71Lit4 ;
   private String AV72Lit5 ;
   private String AV73Lit6 ;
   private String AV78Lit7 ;
   private String AV89Lit8 ;
   private String AV76Lit9 ;
   private String AV77Lit10 ;
   private String AV75Lit11 ;
   private String AV84Lit12 ;
   private String AV85Lit13 ;
   private String AV79Lit14 ;
   private String GXt_char1 ;
   private String AV80Lit15 ;
   private String AV81Lit16 ;
   private String AV82Lit17 ;
   private String AV83Lit18 ;
   private String AV86Lit19 ;
   private String AV87Lit20 ;
   private String AV88Lit21 ;
   private String AV90Lit22 ;
   private String AV91Lit23 ;
   private String GXt_char3 ;
   private String scmdbuf ;
   private String A758ProCod ;
   private String AV58BarCodPar ;
   private String A602MaqCod ;
   private String A4258RecMaqFas ;
   private String A279CliNom ;
   private String A4609BarMdlCod ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A365DisDes ;
   private String AV48MaqCod ;
   private String GXv_char4[] ;
   private String GXv_char2[] ;
   private String AV49MaqDsc ;
   private String AV9FasCod ;
   private String AV10FasDsc ;
   private String GXv_char5[] ;
   private String AV15CliNom ;
   private String AV18BarMdlCod ;
   private String AV16BarSer ;
   private String AV17BarSerDsc ;
   private String AV43BarColNom ;
   private String AV13Hdr ;
   private String AV20TipDefDsc ;
   private String AV55v_Texto ;
   private String A764ProForCod ;
   private String A766ProForDsc ;
   private String AV32ProForCod ;
   private String A719PrdNum ;
   private String A872RecPrdNum ;
   private String A875RecPrdDsc ;
   private String AV35CodPrd ;
   private String AV29Unidades ;
   private String A4663HisLavPar ;
   private String A834TipDefDsc ;
   private String AV99Pgmname ;
   private boolean n4654RecNroPar ;
   private boolean n4268RecOrdLin ;
   private boolean n4638BarUltNlot ;
   private boolean n4648BarFasRecu ;
   private boolean returnInSub ;
   private boolean n605MaqCosMin ;
   private boolean n4258RecMaqFas ;
   private boolean n252CliCod ;
   private boolean n4261RecTotPrd ;
   private boolean n719PrdNum ;
   private boolean n490ForPrdUMe ;
   private boolean n1378PrdCFin ;
   private boolean n833TipDefCod ;
   private boolean n834TipDefDsc ;
   private String[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P06R42_A396EmprCod ;
   private int[] P06R42_A129BarCod ;
   private byte[] P06R42_A132BarCodReo ;
   private String[] P06R42_A130BarCodPar ;
   private short[] P06R42_A2804RecLinMaq ;
   private int[] P06R42_A4654RecNroPar ;
   private boolean[] P06R42_n4654RecNroPar ;
   private short[] P06R42_A4268RecOrdLin ;
   private boolean[] P06R42_n4268RecOrdLin ;
   private String[] P06R43_A396EmprCod ;
   private int[] P06R43_A129BarCod ;
   private byte[] P06R43_A132BarCodReo ;
   private String[] P06R43_A130BarCodPar ;
   private short[] P06R43_A194BarOrdLin ;
   private int[] P06R43_A4638BarUltNlot ;
   private boolean[] P06R43_n4638BarUltNlot ;
   private String[] P06R43_A758ProCod ;
   private String[] P06R44_A396EmprCod ;
   private int[] P06R44_A129BarCod ;
   private byte[] P06R44_A132BarCodReo ;
   private String[] P06R44_A130BarCodPar ;
   private short[] P06R44_A194BarOrdLin ;
   private int[] P06R44_A4643BarFasLot ;
   private int[] P06R44_A4648BarFasRecu ;
   private boolean[] P06R44_n4648BarFasRecu ;
   private String[] P06R44_A758ProCod ;
   private String[] P06R47_A396EmprCod ;
   private int[] P06R47_A129BarCod ;
   private byte[] P06R47_A132BarCodReo ;
   private String[] P06R47_A130BarCodPar ;
   private short[] P06R47_A2804RecLinMaq ;
   private int[] P06R47_A2805RecVolPrd ;
   private int[] P06R47_A4654RecNroPar ;
   private boolean[] P06R47_n4654RecNroPar ;
   private String[] P06R47_A602MaqCod ;
   private java.math.BigDecimal[] P06R47_A605MaqCosMin ;
   private boolean[] P06R47_n605MaqCosMin ;
   private String[] P06R47_A4258RecMaqFas ;
   private boolean[] P06R47_n4258RecMaqFas ;
   private int[] P06R47_A252CliCod ;
   private boolean[] P06R47_n252CliCod ;
   private String[] P06R47_A279CliNom ;
   private String[] P06R47_A4609BarMdlCod ;
   private String[] P06R47_A212BarSer ;
   private String[] P06R47_A1652BarSerDsc ;
   private String[] P06R47_A135BarColNom ;
   private int[] P06R47_A136BarColNum ;
   private java.math.BigDecimal[] P06R47_A166BarKgm ;
   private short[] P06R47_A199BarPie1 ;
   private String[] P06R47_A365DisDes ;
   private int[] P06R47_A898BarPieNDes ;
   private int[] P06R47_A4273RecFagPrd ;
   private int[] P06R47_A4261RecTotPrd ;
   private boolean[] P06R47_n4261RecTotPrd ;
   private java.math.BigDecimal[] P06R47_A4271RecFagKgs ;
   private java.math.BigDecimal[] P06R47_A4259RecTotKgs ;
   private String[] P06R48_A396EmprCod ;
   private int[] P06R48_A129BarCod ;
   private byte[] P06R48_A132BarCodReo ;
   private String[] P06R48_A130BarCodPar ;
   private short[] P06R48_A2804RecLinMaq ;
   private byte[] P06R48_A1273RecLinPro ;
   private short[] P06R48_A771ProForTie ;
   private int[] P06R48_A2392ProNumPro ;
   private String[] P06R48_A764ProForCod ;
   private int[] P06R48_A4695RecVolPrf ;
   private String[] P06R48_A766ProForDsc ;
   private String[] P06R49_A719PrdNum ;
   private boolean[] P06R49_n719PrdNum ;
   private String[] P06R49_A396EmprCod ;
   private int[] P06R49_A129BarCod ;
   private byte[] P06R49_A132BarCodReo ;
   private String[] P06R49_A130BarCodPar ;
   private short[] P06R49_A2804RecLinMaq ;
   private byte[] P06R49_A1273RecLinPro ;
   private String[] P06R49_A872RecPrdNum ;
   private java.math.BigDecimal[] P06R49_A707PrdFacCon ;
   private java.math.BigDecimal[] P06R49_A724PrdPreAct ;
   private java.math.BigDecimal[] P06R49_A686PrdCant ;
   private java.math.BigDecimal[] P06R49_A1797PrdCanAny ;
   private byte[] P06R49_A490ForPrdUMe ;
   private boolean[] P06R49_n490ForPrdUMe ;
   private byte[] P06R49_A743PrdUniCon ;
   private String[] P06R49_A875RecPrdDsc ;
   private short[] P06R49_A811RecLin ;
   private java.math.BigDecimal[] P06R410_A1378PrdCFin ;
   private boolean[] P06R410_n1378PrdCFin ;
   private short[] P06R411_A833TipDefCod ;
   private boolean[] P06R411_n833TipDefCod ;
   private String[] P06R411_A396EmprCod ;
   private int[] P06R411_A4667HisLavCon ;
   private short[] P06R411_A4665HisLavOrd ;
   private int[] P06R411_A4664HisLavNpd ;
   private String[] P06R411_A4663HisLavPar ;
   private byte[] P06R411_A4662HisLavReo ;
   private int[] P06R411_A4661HisLavCod ;
   private String[] P06R411_A834TipDefDsc ;
   private boolean[] P06R411_n834TipDefDsc ;
}

final  class rreclv03__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06R42", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecNroPar, RecOrdLin FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06R43", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin, BarUltNlot, ProCod FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06R44", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin, BarFasLot, BarFasRecu, ProCod FROM TXPFASMAQ WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (BarOrdLin = ?) AND (BarFasLot = ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06R47", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecVolPrd, T1.RecNroPar, T1.MaqCod, T2.MaqCosMin, T1.RecMaqFas, T3.CliCod, T4.CliNom, T3.BarMdlCod, T3.BarSer, T3.BarSerDsc, T3.BarColNom, T3.BarColNum, COALESCE( T5.BarKgm, 0) AS BarKgm, COALESCE( T5.BarPie1, 0) AS BarPie1, T3.DisDes, COALESCE( T5.BarPieNDes, 0) AS BarPieNDes, COALESCE( T6.RecFagPrd, 0) AS RecFagPrd, T1.RecTotPrd, COALESCE( T6.RecFagKgs, 0) AS RecFagKgs, T1.RecTotKgs FROM (((((TXPRECMAQ T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T3.CliCod) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod = T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(RecAgrKgs) AS RecFagKgs, EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, SUM(RecAgrPrd) AS RecFagPrd FROM TXPRECFAG GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar AND T6.RecLinMaq = T1.RecLinMaq) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06R48", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro, T2.ProForTie, T2.ProNumPro, T1.ProForCod, T1.RecVolPrf, T2.ProForDsc FROM (TXPCRECET T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06R49", "SELECT T1.PrdNum, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro, T1.RecPrdNum, T2.PrdFacCon, T2.PrdPreAct, T1.PrdCant, T1.PrdCanAny, T1.ForPrdUMe, T2.PrdUniCon, T1.RecPrdDsc, T1.RecLin FROM (TXPLRECET T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE (T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ? and T1.RecLinPro = ?) AND (Not (rtrim(T1.RecPrdNum) IS NULL AND NOT(T1.RecPrdNum IS NULL))) ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro, T1.RecLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06R410", "SELECT SUM(PrdCFin) FROM TXPLANYAD WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (Not (rtrim(PrdNum) IS NULL AND NOT(PrdNum IS NULL))) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06R411", "SELECT T1.TipDefCod, T1.EmprCod, T1.HisLavCon, T1.HisLavOrd, T1.HisLavNpd, T1.HisLavPar, T1.HisLavReo, T1.HisLavCod, T2.TipDefDsc FROM (TXPHISRE1 T1 LEFT JOIN TXPTIPDEF T2 ON T2.EmprCod = T1.EmprCod AND T2.TipDefCod = T1.TipDefCod) WHERE T1.EmprCod = ? and T1.HisLavCod = ? and T1.HisLavReo = ? and T1.HisLavPar = ? and T1.HisLavNpd = ? and T1.HisLavOrd = ? and T1.HisLavCon = ? ORDER BY T1.EmprCod, T1.HisLavCod, T1.HisLavReo, T1.HisLavPar, T1.HisLavNpd, T1.HisLavOrd, T1.HisLavCon ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 8);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 6);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,4);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(11);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(12, 30);
               ((String[]) buf[16])[0] = rslt.getString(13, 13);
               ((String[]) buf[17])[0] = rslt.getString(14, 16);
               ((String[]) buf[18])[0] = rslt.getString(15, 26);
               ((String[]) buf[19])[0] = rslt.getString(16, 13);
               ((int[]) buf[20])[0] = rslt.getInt(17);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(18,2);
               ((short[]) buf[22])[0] = rslt.getShort(19);
               ((String[]) buf[23])[0] = rslt.getString(20, 1);
               ((int[]) buf[24])[0] = rslt.getInt(21);
               ((int[]) buf[25])[0] = rslt.getInt(22);
               ((int[]) buf[26])[0] = rslt.getInt(23);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(24,2);
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(25,2);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 30);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 6);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,4);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,5);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,3);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,3);
               ((byte[]) buf[13])[0] = rslt.getByte(13);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(14);
               ((String[]) buf[16])[0] = rslt.getString(15, 26);
               ((short[]) buf[17])[0] = rslt.getShort(16);
               return;
            case 6 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,3);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[5]).shortValue());
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[5]).shortValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[7]).intValue());
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
      }
   }

}

