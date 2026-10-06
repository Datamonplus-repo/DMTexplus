package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pinotbe extends GXProcedure
{
   public pinotbe( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pinotbe.class ), "" );
   }

   public pinotbe( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 )
   {
      pinotbe.this.aP3 = new String[] {""};
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
      pinotbe.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pinotbe.this.AV9Be_hdr = aP1[0];
      this.aP1 = aP1;
      pinotbe.this.AV10Be_hdrr = aP2[0];
      this.aP2 = aP2;
      pinotbe.this.AV11Be_hdrp = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV23Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = A396EmprCod ;
      GXv_char2[0] = AV24EmprNom ;
      GXv_char3[0] = AV25UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV23Station, GXv_char1, GXv_char2, GXv_char3) ;
      pinotbe.this.A396EmprCod = GXv_char1[0] ;
      pinotbe.this.AV24EmprNom = GXv_char2[0] ;
      pinotbe.this.AV25UsurCod = GXv_char3[0] ;
      AV12TotKgs = DecimalUtil.doubleToDec(0) ;
      AV13TotPzs = 0 ;
      AV18TotMts = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P03GB2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV9Be_hdr), Byte.valueOf(AV10Be_hdrr), AV11Be_hdrp});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A8737Be_hdrp = P03GB2_A8737Be_hdrp[0] ;
         A8736Be_hdrr = P03GB2_A8736Be_hdrr[0] ;
         A8735Be_hdr = P03GB2_A8735Be_hdr[0] ;
         A8748Be_Sta = P03GB2_A8748Be_Sta[0] ;
         n8748Be_Sta = P03GB2_n8748Be_Sta[0] ;
         A8738Be_FecE = P03GB2_A8738Be_FecE[0] ;
         n8738Be_FecE = P03GB2_n8738Be_FecE[0] ;
         A9591Be_PoS = P03GB2_A9591Be_PoS[0] ;
         n9591Be_PoS = P03GB2_n9591Be_PoS[0] ;
         A8748Be_Sta = (byte)(1) ;
         n8748Be_Sta = false ;
         A8738Be_FecE = GXutil.serverNow( context, remoteHandle, pr_default) ;
         n8738Be_FecE = false ;
         AV21Be_PoS = A9591Be_PoS ;
         /* Optimized group. */
         /* Using cursor P03GB3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A8735Be_hdr), Byte.valueOf(A8736Be_hdrr), A8737Be_hdrp});
         c8743Be_Kgs = P03GB3_A8743Be_Kgs[0] ;
         n8743Be_Kgs = P03GB3_n8743Be_Kgs[0] ;
         cV13TotPzs = P03GB3_AV13TotPzs[0] ;
         c8744Be_Mts = P03GB3_A8744Be_Mts[0] ;
         n8744Be_Mts = P03GB3_n8744Be_Mts[0] ;
         pr_default.close(1);
         AV12TotKgs = AV12TotKgs.add(c8743Be_Kgs) ;
         AV13TotPzs = (int)(AV13TotPzs+cV13TotPzs*1) ;
         AV18TotMts = AV18TotMts.add(c8744Be_Mts) ;
         /* End optimized group. */
         /* Using cursor P03GB4 */
         pr_default.execute(2, new Object[] {Boolean.valueOf(n8748Be_Sta), Byte.valueOf(A8748Be_Sta), Boolean.valueOf(n8738Be_FecE), A8738Be_FecE, A396EmprCod, Integer.valueOf(A8735Be_hdr), Byte.valueOf(A8736Be_hdrr), A8737Be_hdrp});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINOTBE");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      GXv_int4[0] = AV8Albreccod ;
      new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, "020100", GXv_int4) ;
      pinotbe.this.AV8Albreccod = GXv_int4[0] ;
      /* Using cursor P03GB5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV9Be_hdr), Byte.valueOf(AV10Be_hdrr), AV11Be_hdrp});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A212BarSer = P03GB5_A212BarSer[0] ;
         A1652BarSerDsc = P03GB5_A1652BarSerDsc[0] ;
         A4812BarEncCli = P03GB5_A4812BarEncCli[0] ;
         A130BarCodPar = P03GB5_A130BarCodPar[0] ;
         A132BarCodReo = P03GB5_A132BarCodReo[0] ;
         A129BarCod = P03GB5_A129BarCod[0] ;
         A136BarColNum = P03GB5_A136BarColNum[0] ;
         A135BarColNom = P03GB5_A135BarColNom[0] ;
         A1798BarDibCli = P03GB5_A1798BarDibCli[0] ;
         A6434BarAsi = P03GB5_A6434BarAsi[0] ;
         A213BarSit = P03GB5_A213BarSit[0] ;
         if ( A136BarColNum == 0 )
         {
            AV20Bod_colNNN = GXutil.str( A136BarColNum, 6, 0) + "-" + A135BarColNom ;
         }
         else
         {
            AV20Bod_colNNN = GXutil.str( A136BarColNum, 6, 0) + "-" + A135BarColNom ;
         }
         /* Using cursor P03GB6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A759ProDsc = P03GB6_A759ProDsc[0] ;
            A758ProCod = P03GB6_A758ProCod[0] ;
            A759ProDsc = P03GB6_A759ProDsc[0] ;
            AV19Prodsc = A759ProDsc ;
            pr_default.readNext(4);
         }
         pr_default.close(4);
         AV14BarEnccli = A4812BarEncCli ;
         AV15BarSer = A212BarSer ;
         AV27BarserDsc = A1652BarSerDsc ;
         AV16Bardibcli = A1798BarDibCli ;
         /* Execute user subroutine: 'CPDETX' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(3);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /*
            INSERT RECORD ON TABLE TXPALBREC

         */
         W252CliCod = A252CliCod ;
         W970ProceCod = A970ProceCod ;
         n970ProceCod = false ;
         A44AlbRecCod = AV8Albreccod ;
         A252CliCod = 1 ;
         A45AlbRef = A212BarSer ;
         A52AlbRPieEnt = AV13TotPzs ;
         A56AlbRUni = httpContext.getMessage( "M", "") ;
         A58AlbRUniEnt = AV18TotMts ;
         A60AlbRUniUti = DecimalUtil.doubleToDec(0) ;
         A48AlbRFecUlt = GXutil.nullDate() ;
         A55AlbRReo = httpContext.getMessage( "NO", "") ;
         A49AlbRFen = GXutil.today( ) ;
         A54AlbRPieUti = 0 ;
         A47AlbREst = (byte)(0) ;
         A3613AlbRefDsc = A1652BarSerDsc ;
         A970ProceCod = (short)(0) ;
         n970ProceCod = false ;
         A50AlbRLoc = " " ;
         A1211TipEntCod = (short)(2) ;
         n1211TipEntCod = false ;
         A50AlbRLoc = httpContext.getMessage( "Teñido", "") ;
         A3360AlbRImp = httpContext.getMessage( "N", "") ;
         A6463AlbRLote = GXutil.str( AV9Be_hdr, 8, 0) + GXutil.str( AV10Be_hdrr, 1, 0) + AV11Be_hdrp ;
         A8026AlbOC = "" ;
         A5806AlbREnt2 = A4812BarEncCli ;
         /* Using cursor P03GB7 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), Integer.valueOf(A252CliCod), A45AlbRef, Integer.valueOf(A52AlbRPieEnt), A56AlbRUni, A50AlbRLoc, A49AlbRFen, A58AlbRUniEnt, A55AlbRReo, Integer.valueOf(A54AlbRPieUti), A60AlbRUniUti, A48AlbRFecUlt, Byte.valueOf(A47AlbREst), Boolean.valueOf(n1211TipEntCod), Short.valueOf(A1211TipEntCod), Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod), A3360AlbRImp, A3613AlbRefDsc, A5806AlbREnt2, A6463AlbRLote, A8026AlbOC});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
         if ( (pr_default.getStatus(5) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         A252CliCod = W252CliCod ;
         A970ProceCod = W970ProceCod ;
         n970ProceCod = false ;
         /* End Insert */
         A6434BarAsi = (byte)(9) ;
         A213BarSit = (byte)(11) ;
         AV22Inc_obs = httpContext.getMessage( "Entrada OT en Estampacion", "") + GXutil.newLine( ) ;
         AV22Inc_obs += httpContext.getMessage( "N recepcion = ", "") + GXutil.str( AV8Albreccod, 8, 0) + GXutil.newLine( ) ;
         AV22Inc_obs += httpContext.getMessage( "TotalMetros = ", "") + GXutil.str( AV18TotMts, 9, 2) + GXutil.newLine( ) ;
         AV22Inc_obs += httpContext.getMessage( "TotalKilos  = ", "") + GXutil.str( AV12TotKgs, 9, 2) + GXutil.newLine( ) ;
         AV22Inc_obs += httpContext.getMessage( "TotalPiezas = ", "") + GXutil.str( AV13TotPzs, 6, 0) + GXutil.newLine( ) ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV34Pgmname, AV25UsurCod, AV23Station, AV22Inc_obs, AV9Be_hdr, AV10Be_hdrr, AV11Be_hdrp) ;
         /* Using cursor P03GB8 */
         pr_default.execute(6, new Object[] {Byte.valueOf(A6434BarAsi), Byte.valueOf(A213BarSit), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
      /* Using cursor P03GB9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(AV9Be_hdr), Byte.valueOf(AV10Be_hdrr), AV11Be_hdrp});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A8740Be_Pza = P03GB9_A8740Be_Pza[0] ;
         A8744Be_Mts = P03GB9_A8744Be_Mts[0] ;
         n8744Be_Mts = P03GB9_n8744Be_Mts[0] ;
         A8743Be_Kgs = P03GB9_A8743Be_Kgs[0] ;
         n8743Be_Kgs = P03GB9_n8743Be_Kgs[0] ;
         A8746Be_Ubi = P03GB9_A8746Be_Ubi[0] ;
         n8746Be_Ubi = P03GB9_n8746Be_Ubi[0] ;
         A8745Be_Col = P03GB9_A8745Be_Col[0] ;
         n8745Be_Col = P03GB9_n8745Be_Col[0] ;
         A8742Be_Dib = P03GB9_A8742Be_Dib[0] ;
         n8742Be_Dib = P03GB9_n8742Be_Dib[0] ;
         A8867Be_TipDfC = P03GB9_A8867Be_TipDfC[0] ;
         n8867Be_TipDfC = P03GB9_n8867Be_TipDfC[0] ;
         A8737Be_hdrp = P03GB9_A8737Be_hdrp[0] ;
         A8736Be_hdrr = P03GB9_A8736Be_hdrr[0] ;
         A8735Be_hdr = P03GB9_A8735Be_hdr[0] ;
         W396EmprCod = A396EmprCod ;
         /*
            INSERT RECORD ON TABLE TXPALBDET

         */
         W396EmprCod = A396EmprCod ;
         A44AlbRecCod = AV8Albreccod ;
         A2159AlbRecPie = A8740Be_Pza ;
         A2154AlbRecAnh = (short)(0) ;
         A2157AlbRecMtr = A8744Be_Mts ;
         A2155AlbRecKgm = A8743Be_Kgs ;
         A2158AlbRecMtrU = DecimalUtil.doubleToDec(0) ;
         A2156AlbRecKgmU = DecimalUtil.doubleToDec(0) ;
         A7409ALRPIETEL = (short)(0) ;
         n7409ALRPIETEL = false ;
         A7408ALRPIELOC = A8746Be_Ubi ;
         A8037AlbNPed = AV14BarEnccli ;
         n8037AlbNPed = false ;
         A4411AlbRecFec = GXutil.resetTime( GXutil.today( ) );
         n4411AlbRecFec = false ;
         A8684Bod_FecE = GXutil.today( ) ;
         n8684Bod_FecE = false ;
         A7793AlbRecCo1 = A8745Be_Col ;
         n7793AlbRecCo1 = false ;
         A8001AlbSerT = AV15BarSer ;
         n8001AlbSerT = false ;
         A8679Bod_Dib = A8742Be_Dib ;
         n8679Bod_Dib = false ;
         A7998AlbHdr = AV9Be_hdr ;
         n7998AlbHdr = false ;
         A8000AlbHdrp = AV11Be_hdrp ;
         n8000AlbHdrp = false ;
         A7999AlbHdrr = AV10Be_hdrr ;
         n7999AlbHdrr = false ;
         A8775Bod_PoS = AV17Etx_tipplt ;
         n8775Bod_PoS = false ;
         A4411AlbRecFec = GXutil.serverNow( context, remoteHandle, pr_default) ;
         n4411AlbRecFec = false ;
         A6615AlbRecPar = A8867Be_TipDfC ;
         n6615AlbRecPar = false ;
         A8776Bod_Ok = httpContext.getMessage( "N", "") ;
         n8776Bod_Ok = false ;
         A9540Bod_ToE = httpContext.getMessage( "E", "") ;
         n9540Bod_ToE = false ;
         A8685Bod_PedOr = AV14BarEnccli ;
         n8685Bod_PedOr = false ;
         A8848Bod_DibO = A8742Be_Dib ;
         n8848Bod_DibO = false ;
         A9560Bod_DescP = AV19Prodsc ;
         n9560Bod_DescP = false ;
         A8831Bod_ColNNn = AV20Bod_colNNN ;
         n8831Bod_ColNNn = false ;
         A8775Bod_PoS = AV21Be_PoS ;
         n8775Bod_PoS = false ;
         /* Using cursor P03GB10 */
         pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie, Short.valueOf(A2154AlbRecAnh), A2157AlbRecMtr, A2155AlbRecKgm, A2158AlbRecMtrU, A2156AlbRecKgmU, Boolean.valueOf(n4411AlbRecFec), A4411AlbRecFec, Boolean.valueOf(n6615AlbRecPar), Short.valueOf(A6615AlbRecPar), A7408ALRPIELOC, Boolean.valueOf(n7409ALRPIETEL), Short.valueOf(A7409ALRPIETEL), Boolean.valueOf(n7793AlbRecCo1), A7793AlbRecCo1, Boolean.valueOf(n7998AlbHdr), Integer.valueOf(A7998AlbHdr), Boolean.valueOf(n7999AlbHdrr), Byte.valueOf(A7999AlbHdrr), Boolean.valueOf(n8000AlbHdrp), A8000AlbHdrp, Boolean.valueOf(n8001AlbSerT), A8001AlbSerT, Boolean.valueOf(n8037AlbNPed), A8037AlbNPed, Boolean.valueOf(n8679Bod_Dib), A8679Bod_Dib, Boolean.valueOf(n8684Bod_FecE), A8684Bod_FecE, Boolean.valueOf(n8685Bod_PedOr), A8685Bod_PedOr, Boolean.valueOf(n8775Bod_PoS), A8775Bod_PoS, Boolean.valueOf(n8776Bod_Ok), A8776Bod_Ok, Boolean.valueOf(n8831Bod_ColNNn), A8831Bod_ColNNn, Boolean.valueOf(n8848Bod_DibO), A8848Bod_DibO, Boolean.valueOf(n9540Bod_ToE), A9540Bod_ToE, Boolean.valueOf(n9560Bod_DescP), A9560Bod_DescP});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBDET");
         if ( (pr_default.getStatus(8) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         A396EmprCod = W396EmprCod ;
         /* End Insert */
         /*
            INSERT RECORD ON TABLE TXPINV80E

         */
         W396EmprCod = A396EmprCod ;
         A12959IV80EArtID = AV15BarSer ;
         A12960IV80EColNI = AV20Bod_colNNN ;
         A12961IV80ETpIVI = AV26Etx_Inv ;
         A12963IV80EMtPrg = DecimalUtil.doubleToDec(0) ;
         n12963IV80EMtPrg = false ;
         A12964IV80EMtRes = DecimalUtil.doubleToDec(0) ;
         n12964IV80EMtRes = false ;
         A12962IV80EMtStk = A8744Be_Mts ;
         n12962IV80EMtStk = false ;
         A12983IV80EArtDs = AV27BarserDsc ;
         n12983IV80EArtDs = false ;
         /* Using cursor P03GB11 */
         pr_default.execute(9, new Object[] {A396EmprCod, A12959IV80EArtID, A12960IV80EColNI, A12961IV80ETpIVI, Boolean.valueOf(n12962IV80EMtStk), A12962IV80EMtStk, Boolean.valueOf(n12963IV80EMtPrg), A12963IV80EMtPrg, Boolean.valueOf(n12964IV80EMtRes), A12964IV80EMtRes, Boolean.valueOf(n12983IV80EArtDs), A12983IV80EArtDs});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINV80E");
         if ( (pr_default.getStatus(9) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            /* Using cursor P03GB12 */
            pr_default.execute(10, new Object[] {A396EmprCod, A12959IV80EArtID, A12960IV80EColNI, A12961IV80ETpIVI});
            while ( (pr_default.getStatus(10) != 101) )
            {
               A396EmprCod = P03GB12_A396EmprCod[0] ;
               A12959IV80EArtID = P03GB12_A12959IV80EArtID[0] ;
               A12960IV80EColNI = P03GB12_A12960IV80EColNI[0] ;
               A12961IV80ETpIVI = P03GB12_A12961IV80ETpIVI[0] ;
               A12962IV80EMtStk = P03GB12_A12962IV80EMtStk[0] ;
               n12962IV80EMtStk = P03GB12_n12962IV80EMtStk[0] ;
               A12962IV80EMtStk = A12962IV80EMtStk.add(A8744Be_Mts) ;
               n12962IV80EMtStk = false ;
               /* Using cursor P03GB13 */
               pr_default.execute(11, new Object[] {Boolean.valueOf(n12962IV80EMtStk), A12962IV80EMtStk, A396EmprCod, A12959IV80EArtID, A12960IV80EColNI, A12961IV80ETpIVI});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINV80E");
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(10);
            AV22Inc_obs = httpContext.getMessage( "Creo.Modifico INV80E", "") + GXutil.newLine( ) ;
            AV22Inc_obs += httpContext.getMessage( "Articulo    = ", "") + AV15BarSer + GXutil.newLine( ) ;
            AV22Inc_obs += httpContext.getMessage( "Color+Numero= ", "") + AV20Bod_colNNN + GXutil.newLine( ) ;
            AV22Inc_obs += httpContext.getMessage( "Tipo Inv    = ", "") + AV26Etx_Inv + GXutil.newLine( ) ;
            AV22Inc_obs += httpContext.getMessage( "Metros      = ", "") + GXutil.str( A12962IV80EMtStk, 10, 2) + GXutil.newLine( ) ;
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV34Pgmname, AV25UsurCod, AV23Station, AV22Inc_obs, AV9Be_hdr, AV10Be_hdrr, AV11Be_hdrp) ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         A396EmprCod = W396EmprCod ;
         /* End Insert */
         A396EmprCod = W396EmprCod ;
         pr_default.readNext(7);
      }
      pr_default.close(7);
      cleanup();
   }

   public void S111( )
   {
      /* 'CPDETX' Routine */
      returnInSub = false ;
      AV17Etx_tipplt = "" ;
      AV26Etx_Inv = "XXXX" ;
      /* Using cursor P03GB14 */
      pr_default.execute(12, new Object[] {A396EmprCod, AV14BarEnccli, AV16Bardibcli});
      while ( (pr_default.getStatus(12) != 101) )
      {
         A8782Etx_Ped = P03GB14_A8782Etx_Ped[0] ;
         A8787Etx_DibC = P03GB14_A8787Etx_DibC[0] ;
         n8787Etx_DibC = P03GB14_n8787Etx_DibC[0] ;
         A8802Etx_TipPlt = P03GB14_A8802Etx_TipPlt[0] ;
         n8802Etx_TipPlt = P03GB14_n8802Etx_TipPlt[0] ;
         A8783Etx_Dib = P03GB14_A8783Etx_Dib[0] ;
         AV17Etx_tipplt = A8802Etx_TipPlt ;
         pr_default.readNext(12);
      }
      pr_default.close(12);
      /* Using cursor P03GB15 */
      pr_default.execute(13, new Object[] {A396EmprCod, AV14BarEnccli});
      while ( (pr_default.getStatus(13) != 101) )
      {
         A8782Etx_Ped = P03GB15_A8782Etx_Ped[0] ;
         A12958Etx_Inv = P03GB15_A12958Etx_Inv[0] ;
         n12958Etx_Inv = P03GB15_n12958Etx_Inv[0] ;
         A8783Etx_Dib = P03GB15_A8783Etx_Dib[0] ;
         AV26Etx_Inv = A12958Etx_Inv ;
         pr_default.readNext(13);
      }
      pr_default.close(13);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pinotbe.this.A396EmprCod;
      this.aP1[0] = pinotbe.this.AV9Be_hdr;
      this.aP2[0] = pinotbe.this.AV10Be_hdrr;
      this.aP3[0] = pinotbe.this.AV11Be_hdrp;
      Application.commitDataStores(context, remoteHandle, pr_default, "pinotbe");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV23Station = "" ;
      GXv_char1 = new String[1] ;
      AV24EmprNom = "" ;
      GXv_char2 = new String[1] ;
      AV25UsurCod = "" ;
      GXv_char3 = new String[1] ;
      AV12TotKgs = DecimalUtil.ZERO ;
      AV18TotMts = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P03GB2_A396EmprCod = new String[] {""} ;
      P03GB2_A8737Be_hdrp = new String[] {""} ;
      P03GB2_A8736Be_hdrr = new byte[1] ;
      P03GB2_A8735Be_hdr = new int[1] ;
      P03GB2_A8748Be_Sta = new byte[1] ;
      P03GB2_n8748Be_Sta = new boolean[] {false} ;
      P03GB2_A8738Be_FecE = new java.util.Date[] {GXutil.nullDate()} ;
      P03GB2_n8738Be_FecE = new boolean[] {false} ;
      P03GB2_A9591Be_PoS = new String[] {""} ;
      P03GB2_n9591Be_PoS = new boolean[] {false} ;
      A8737Be_hdrp = "" ;
      A8738Be_FecE = GXutil.resetTime( GXutil.nullDate() );
      A9591Be_PoS = "" ;
      AV21Be_PoS = "" ;
      c8743Be_Kgs = DecimalUtil.ZERO ;
      c8744Be_Mts = DecimalUtil.ZERO ;
      P03GB3_A8743Be_Kgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03GB3_n8743Be_Kgs = new boolean[] {false} ;
      P03GB3_AV13TotPzs = new int[1] ;
      P03GB3_A8744Be_Mts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03GB3_n8744Be_Mts = new boolean[] {false} ;
      GXv_int4 = new int[1] ;
      P03GB5_A396EmprCod = new String[] {""} ;
      P03GB5_A212BarSer = new String[] {""} ;
      P03GB5_A1652BarSerDsc = new String[] {""} ;
      P03GB5_A4812BarEncCli = new String[] {""} ;
      P03GB5_A130BarCodPar = new String[] {""} ;
      P03GB5_A132BarCodReo = new byte[1] ;
      P03GB5_A129BarCod = new int[1] ;
      P03GB5_A136BarColNum = new int[1] ;
      P03GB5_A135BarColNom = new String[] {""} ;
      P03GB5_A1798BarDibCli = new String[] {""} ;
      P03GB5_A6434BarAsi = new byte[1] ;
      P03GB5_A213BarSit = new byte[1] ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A4812BarEncCli = "" ;
      A130BarCodPar = "" ;
      A135BarColNom = "" ;
      A1798BarDibCli = "" ;
      AV20Bod_colNNN = "" ;
      P03GB6_A396EmprCod = new String[] {""} ;
      P03GB6_A129BarCod = new int[1] ;
      P03GB6_A132BarCodReo = new byte[1] ;
      P03GB6_A130BarCodPar = new String[] {""} ;
      P03GB6_A759ProDsc = new String[] {""} ;
      P03GB6_A758ProCod = new String[] {""} ;
      A759ProDsc = "" ;
      A758ProCod = "" ;
      AV19Prodsc = "" ;
      AV14BarEnccli = "" ;
      AV15BarSer = "" ;
      AV27BarserDsc = "" ;
      AV16Bardibcli = "" ;
      A45AlbRef = "" ;
      A56AlbRUni = "" ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A48AlbRFecUlt = GXutil.nullDate() ;
      A55AlbRReo = "" ;
      A49AlbRFen = GXutil.nullDate() ;
      A3613AlbRefDsc = "" ;
      A50AlbRLoc = "" ;
      A3360AlbRImp = "" ;
      A6463AlbRLote = "" ;
      A8026AlbOC = "" ;
      A5806AlbREnt2 = "" ;
      Gx_emsg = "" ;
      AV22Inc_obs = "" ;
      AV34Pgmname = "" ;
      P03GB9_A396EmprCod = new String[] {""} ;
      P03GB9_A8740Be_Pza = new String[] {""} ;
      P03GB9_A8744Be_Mts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03GB9_n8744Be_Mts = new boolean[] {false} ;
      P03GB9_A8743Be_Kgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03GB9_n8743Be_Kgs = new boolean[] {false} ;
      P03GB9_A8746Be_Ubi = new String[] {""} ;
      P03GB9_n8746Be_Ubi = new boolean[] {false} ;
      P03GB9_A8745Be_Col = new String[] {""} ;
      P03GB9_n8745Be_Col = new boolean[] {false} ;
      P03GB9_A8742Be_Dib = new String[] {""} ;
      P03GB9_n8742Be_Dib = new boolean[] {false} ;
      P03GB9_A8867Be_TipDfC = new short[1] ;
      P03GB9_n8867Be_TipDfC = new boolean[] {false} ;
      P03GB9_A8737Be_hdrp = new String[] {""} ;
      P03GB9_A8736Be_hdrr = new byte[1] ;
      P03GB9_A8735Be_hdr = new int[1] ;
      A8740Be_Pza = "" ;
      A8744Be_Mts = DecimalUtil.ZERO ;
      A8743Be_Kgs = DecimalUtil.ZERO ;
      A8746Be_Ubi = "" ;
      A8745Be_Col = "" ;
      A8742Be_Dib = "" ;
      W396EmprCod = "" ;
      A2159AlbRecPie = "" ;
      A2157AlbRecMtr = DecimalUtil.ZERO ;
      A2155AlbRecKgm = DecimalUtil.ZERO ;
      A2158AlbRecMtrU = DecimalUtil.ZERO ;
      A2156AlbRecKgmU = DecimalUtil.ZERO ;
      A7408ALRPIELOC = "" ;
      A8037AlbNPed = "" ;
      A4411AlbRecFec = GXutil.resetTime( GXutil.nullDate() );
      A8684Bod_FecE = GXutil.nullDate() ;
      A7793AlbRecCo1 = "" ;
      A8001AlbSerT = "" ;
      A8679Bod_Dib = "" ;
      A8000AlbHdrp = "" ;
      A8775Bod_PoS = "" ;
      AV17Etx_tipplt = "" ;
      A8776Bod_Ok = "" ;
      A9540Bod_ToE = "" ;
      A8685Bod_PedOr = "" ;
      A8848Bod_DibO = "" ;
      A9560Bod_DescP = "" ;
      A8831Bod_ColNNn = "" ;
      A12959IV80EArtID = "" ;
      A12960IV80EColNI = "" ;
      A12961IV80ETpIVI = "" ;
      AV26Etx_Inv = "" ;
      A12963IV80EMtPrg = DecimalUtil.ZERO ;
      A12964IV80EMtRes = DecimalUtil.ZERO ;
      A12962IV80EMtStk = DecimalUtil.ZERO ;
      A12983IV80EArtDs = "" ;
      P03GB12_A396EmprCod = new String[] {""} ;
      P03GB12_A12959IV80EArtID = new String[] {""} ;
      P03GB12_A12960IV80EColNI = new String[] {""} ;
      P03GB12_A12961IV80ETpIVI = new String[] {""} ;
      P03GB12_A12962IV80EMtStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03GB12_n12962IV80EMtStk = new boolean[] {false} ;
      P03GB14_A396EmprCod = new String[] {""} ;
      P03GB14_A8782Etx_Ped = new String[] {""} ;
      P03GB14_A8787Etx_DibC = new String[] {""} ;
      P03GB14_n8787Etx_DibC = new boolean[] {false} ;
      P03GB14_A8802Etx_TipPlt = new String[] {""} ;
      P03GB14_n8802Etx_TipPlt = new boolean[] {false} ;
      P03GB14_A8783Etx_Dib = new String[] {""} ;
      A8782Etx_Ped = "" ;
      A8787Etx_DibC = "" ;
      A8802Etx_TipPlt = "" ;
      A8783Etx_Dib = "" ;
      P03GB15_A396EmprCod = new String[] {""} ;
      P03GB15_A8782Etx_Ped = new String[] {""} ;
      P03GB15_A12958Etx_Inv = new String[] {""} ;
      P03GB15_n12958Etx_Inv = new boolean[] {false} ;
      P03GB15_A8783Etx_Dib = new String[] {""} ;
      A12958Etx_Inv = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pinotbe__default(),
         new Object[] {
             new Object[] {
            P03GB2_A396EmprCod, P03GB2_A8737Be_hdrp, P03GB2_A8736Be_hdrr, P03GB2_A8735Be_hdr, P03GB2_A8748Be_Sta, P03GB2_n8748Be_Sta, P03GB2_A8738Be_FecE, P03GB2_n8738Be_FecE, P03GB2_A9591Be_PoS, P03GB2_n9591Be_PoS
            }
            , new Object[] {
            P03GB3_A8743Be_Kgs, P03GB3_n8743Be_Kgs, P03GB3_AV13TotPzs, P03GB3_A8744Be_Mts, P03GB3_n8744Be_Mts
            }
            , new Object[] {
            }
            , new Object[] {
            P03GB5_A396EmprCod, P03GB5_A212BarSer, P03GB5_A1652BarSerDsc, P03GB5_A4812BarEncCli, P03GB5_A130BarCodPar, P03GB5_A132BarCodReo, P03GB5_A129BarCod, P03GB5_A136BarColNum, P03GB5_A135BarColNom, P03GB5_A1798BarDibCli,
            P03GB5_A6434BarAsi, P03GB5_A213BarSit
            }
            , new Object[] {
            P03GB6_A396EmprCod, P03GB6_A129BarCod, P03GB6_A132BarCodReo, P03GB6_A130BarCodPar, P03GB6_A759ProDsc, P03GB6_A758ProCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P03GB9_A396EmprCod, P03GB9_A8740Be_Pza, P03GB9_A8744Be_Mts, P03GB9_n8744Be_Mts, P03GB9_A8743Be_Kgs, P03GB9_n8743Be_Kgs, P03GB9_A8746Be_Ubi, P03GB9_n8746Be_Ubi, P03GB9_A8745Be_Col, P03GB9_n8745Be_Col,
            P03GB9_A8742Be_Dib, P03GB9_n8742Be_Dib, P03GB9_A8867Be_TipDfC, P03GB9_n8867Be_TipDfC, P03GB9_A8737Be_hdrp, P03GB9_A8736Be_hdrr, P03GB9_A8735Be_hdr
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P03GB12_A396EmprCod, P03GB12_A12959IV80EArtID, P03GB12_A12960IV80EColNI, P03GB12_A12961IV80ETpIVI, P03GB12_A12962IV80EMtStk, P03GB12_n12962IV80EMtStk
            }
            , new Object[] {
            }
            , new Object[] {
            P03GB14_A396EmprCod, P03GB14_A8782Etx_Ped, P03GB14_A8787Etx_DibC, P03GB14_n8787Etx_DibC, P03GB14_A8802Etx_TipPlt, P03GB14_n8802Etx_TipPlt, P03GB14_A8783Etx_Dib
            }
            , new Object[] {
            P03GB15_A396EmprCod, P03GB15_A8782Etx_Ped, P03GB15_A12958Etx_Inv, P03GB15_n12958Etx_Inv, P03GB15_A8783Etx_Dib
            }
         }
      );
      AV34Pgmname = "Pinotbe" ;
      /* GeneXus formulas. */
      AV34Pgmname = "Pinotbe" ;
      Gx_err = (short)(0) ;
   }

   private byte AV10Be_hdrr ;
   private byte A8736Be_hdrr ;
   private byte A8748Be_Sta ;
   private byte A132BarCodReo ;
   private byte A6434BarAsi ;
   private byte A213BarSit ;
   private byte A47AlbREst ;
   private byte A7999AlbHdrr ;
   private short W970ProceCod ;
   private short A970ProceCod ;
   private short A1211TipEntCod ;
   private short Gx_err ;
   private short A8867Be_TipDfC ;
   private short A2154AlbRecAnh ;
   private short A7409ALRPIETEL ;
   private short A6615AlbRecPar ;
   private int AV9Be_hdr ;
   private int AV13TotPzs ;
   private int A8735Be_hdr ;
   private int cV13TotPzs ;
   private int AV8Albreccod ;
   private int GXv_int4[] ;
   private int A129BarCod ;
   private int A136BarColNum ;
   private int GX_INS7 ;
   private int W252CliCod ;
   private int A252CliCod ;
   private int A44AlbRecCod ;
   private int A52AlbRPieEnt ;
   private int A54AlbRPieUti ;
   private int GX_INS299 ;
   private int A7998AlbHdr ;
   private int GX_INS1776 ;
   private java.math.BigDecimal AV12TotKgs ;
   private java.math.BigDecimal AV18TotMts ;
   private java.math.BigDecimal c8743Be_Kgs ;
   private java.math.BigDecimal c8744Be_Mts ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A8744Be_Mts ;
   private java.math.BigDecimal A8743Be_Kgs ;
   private java.math.BigDecimal A2157AlbRecMtr ;
   private java.math.BigDecimal A2155AlbRecKgm ;
   private java.math.BigDecimal A2158AlbRecMtrU ;
   private java.math.BigDecimal A2156AlbRecKgmU ;
   private java.math.BigDecimal A12963IV80EMtPrg ;
   private java.math.BigDecimal A12964IV80EMtRes ;
   private java.math.BigDecimal A12962IV80EMtStk ;
   private String A396EmprCod ;
   private String AV11Be_hdrp ;
   private String AV23Station ;
   private String GXv_char1[] ;
   private String AV24EmprNom ;
   private String GXv_char2[] ;
   private String AV25UsurCod ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String A8737Be_hdrp ;
   private String A9591Be_PoS ;
   private String AV21Be_PoS ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A4812BarEncCli ;
   private String A130BarCodPar ;
   private String A135BarColNom ;
   private String A1798BarDibCli ;
   private String AV20Bod_colNNN ;
   private String A759ProDsc ;
   private String A758ProCod ;
   private String AV19Prodsc ;
   private String AV14BarEnccli ;
   private String AV15BarSer ;
   private String AV27BarserDsc ;
   private String AV16Bardibcli ;
   private String A45AlbRef ;
   private String A56AlbRUni ;
   private String A55AlbRReo ;
   private String A3613AlbRefDsc ;
   private String A50AlbRLoc ;
   private String A3360AlbRImp ;
   private String A6463AlbRLote ;
   private String A8026AlbOC ;
   private String A5806AlbREnt2 ;
   private String Gx_emsg ;
   private String AV34Pgmname ;
   private String A8740Be_Pza ;
   private String A8746Be_Ubi ;
   private String A8745Be_Col ;
   private String A8742Be_Dib ;
   private String W396EmprCod ;
   private String A2159AlbRecPie ;
   private String A7408ALRPIELOC ;
   private String A8037AlbNPed ;
   private String A7793AlbRecCo1 ;
   private String A8001AlbSerT ;
   private String A8679Bod_Dib ;
   private String A8000AlbHdrp ;
   private String A8775Bod_PoS ;
   private String AV17Etx_tipplt ;
   private String A8776Bod_Ok ;
   private String A9540Bod_ToE ;
   private String A8685Bod_PedOr ;
   private String A8848Bod_DibO ;
   private String A9560Bod_DescP ;
   private String A8831Bod_ColNNn ;
   private String A12959IV80EArtID ;
   private String A12960IV80EColNI ;
   private String A12961IV80ETpIVI ;
   private String AV26Etx_Inv ;
   private String A12983IV80EArtDs ;
   private String A8782Etx_Ped ;
   private String A8787Etx_DibC ;
   private String A8802Etx_TipPlt ;
   private String A8783Etx_Dib ;
   private String A12958Etx_Inv ;
   private java.util.Date A8738Be_FecE ;
   private java.util.Date A4411AlbRecFec ;
   private java.util.Date A48AlbRFecUlt ;
   private java.util.Date A49AlbRFen ;
   private java.util.Date A8684Bod_FecE ;
   private boolean n8748Be_Sta ;
   private boolean n8738Be_FecE ;
   private boolean n9591Be_PoS ;
   private boolean n8743Be_Kgs ;
   private boolean n8744Be_Mts ;
   private boolean returnInSub ;
   private boolean n970ProceCod ;
   private boolean n1211TipEntCod ;
   private boolean n8746Be_Ubi ;
   private boolean n8745Be_Col ;
   private boolean n8742Be_Dib ;
   private boolean n8867Be_TipDfC ;
   private boolean n7409ALRPIETEL ;
   private boolean n8037AlbNPed ;
   private boolean n4411AlbRecFec ;
   private boolean n8684Bod_FecE ;
   private boolean n7793AlbRecCo1 ;
   private boolean n8001AlbSerT ;
   private boolean n8679Bod_Dib ;
   private boolean n7998AlbHdr ;
   private boolean n8000AlbHdrp ;
   private boolean n7999AlbHdrr ;
   private boolean n8775Bod_PoS ;
   private boolean n6615AlbRecPar ;
   private boolean n8776Bod_Ok ;
   private boolean n9540Bod_ToE ;
   private boolean n8685Bod_PedOr ;
   private boolean n8848Bod_DibO ;
   private boolean n9560Bod_DescP ;
   private boolean n8831Bod_ColNNn ;
   private boolean n12963IV80EMtPrg ;
   private boolean n12964IV80EMtRes ;
   private boolean n12962IV80EMtStk ;
   private boolean n12983IV80EArtDs ;
   private boolean n8787Etx_DibC ;
   private boolean n8802Etx_TipPlt ;
   private boolean n12958Etx_Inv ;
   private String AV22Inc_obs ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P03GB2_A396EmprCod ;
   private String[] P03GB2_A8737Be_hdrp ;
   private byte[] P03GB2_A8736Be_hdrr ;
   private int[] P03GB2_A8735Be_hdr ;
   private byte[] P03GB2_A8748Be_Sta ;
   private boolean[] P03GB2_n8748Be_Sta ;
   private java.util.Date[] P03GB2_A8738Be_FecE ;
   private boolean[] P03GB2_n8738Be_FecE ;
   private String[] P03GB2_A9591Be_PoS ;
   private boolean[] P03GB2_n9591Be_PoS ;
   private java.math.BigDecimal[] P03GB3_A8743Be_Kgs ;
   private boolean[] P03GB3_n8743Be_Kgs ;
   private int[] P03GB3_AV13TotPzs ;
   private java.math.BigDecimal[] P03GB3_A8744Be_Mts ;
   private boolean[] P03GB3_n8744Be_Mts ;
   private String[] P03GB5_A396EmprCod ;
   private String[] P03GB5_A212BarSer ;
   private String[] P03GB5_A1652BarSerDsc ;
   private String[] P03GB5_A4812BarEncCli ;
   private String[] P03GB5_A130BarCodPar ;
   private byte[] P03GB5_A132BarCodReo ;
   private int[] P03GB5_A129BarCod ;
   private int[] P03GB5_A136BarColNum ;
   private String[] P03GB5_A135BarColNom ;
   private String[] P03GB5_A1798BarDibCli ;
   private byte[] P03GB5_A6434BarAsi ;
   private byte[] P03GB5_A213BarSit ;
   private String[] P03GB6_A396EmprCod ;
   private int[] P03GB6_A129BarCod ;
   private byte[] P03GB6_A132BarCodReo ;
   private String[] P03GB6_A130BarCodPar ;
   private String[] P03GB6_A759ProDsc ;
   private String[] P03GB6_A758ProCod ;
   private String[] P03GB9_A396EmprCod ;
   private String[] P03GB9_A8740Be_Pza ;
   private java.math.BigDecimal[] P03GB9_A8744Be_Mts ;
   private boolean[] P03GB9_n8744Be_Mts ;
   private java.math.BigDecimal[] P03GB9_A8743Be_Kgs ;
   private boolean[] P03GB9_n8743Be_Kgs ;
   private String[] P03GB9_A8746Be_Ubi ;
   private boolean[] P03GB9_n8746Be_Ubi ;
   private String[] P03GB9_A8745Be_Col ;
   private boolean[] P03GB9_n8745Be_Col ;
   private String[] P03GB9_A8742Be_Dib ;
   private boolean[] P03GB9_n8742Be_Dib ;
   private short[] P03GB9_A8867Be_TipDfC ;
   private boolean[] P03GB9_n8867Be_TipDfC ;
   private String[] P03GB9_A8737Be_hdrp ;
   private byte[] P03GB9_A8736Be_hdrr ;
   private int[] P03GB9_A8735Be_hdr ;
   private String[] P03GB12_A396EmprCod ;
   private String[] P03GB12_A12959IV80EArtID ;
   private String[] P03GB12_A12960IV80EColNI ;
   private String[] P03GB12_A12961IV80ETpIVI ;
   private java.math.BigDecimal[] P03GB12_A12962IV80EMtStk ;
   private boolean[] P03GB12_n12962IV80EMtStk ;
   private String[] P03GB14_A396EmprCod ;
   private String[] P03GB14_A8782Etx_Ped ;
   private String[] P03GB14_A8787Etx_DibC ;
   private boolean[] P03GB14_n8787Etx_DibC ;
   private String[] P03GB14_A8802Etx_TipPlt ;
   private boolean[] P03GB14_n8802Etx_TipPlt ;
   private String[] P03GB14_A8783Etx_Dib ;
   private String[] P03GB15_A396EmprCod ;
   private String[] P03GB15_A8782Etx_Ped ;
   private String[] P03GB15_A12958Etx_Inv ;
   private boolean[] P03GB15_n12958Etx_Inv ;
   private String[] P03GB15_A8783Etx_Dib ;
}

final  class pinotbe__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03GB2", "SELECT EmprCod, Be_hdrp, Be_hdrr, Be_hdr, Be_Sta, Be_FecE, Be_PoS FROM TXPINOTBE WHERE EmprCod = ? and Be_hdr = ? and Be_hdrr = ? and Be_hdrp = ? ORDER BY EmprCod, Be_hdr, Be_hdrr, Be_hdrp ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P03GB3", "SELECT SUM(Be_Kgs), COUNT(*), SUM(Be_Mts) FROM TXPINOTB1 WHERE EmprCod = ? and Be_hdr = ? and Be_hdrr = ? and Be_hdrp = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03GB4", "UPDATE TXPINOTBE SET Be_Sta=?, Be_FecE=?  WHERE EmprCod = ? AND Be_hdr = ? AND Be_hdrr = ? AND Be_hdrp = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPINOTBE")
         ,new ForEachCursor("P03GB5", "SELECT EmprCod, BarSer, BarSerDsc, BarEncCli, BarCodPar, BarCodReo, BarCod, BarColNum, BarColNom, BarDibCli, BarAsi, BarSit FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P03GB6", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.ProDsc, T1.ProCod FROM (TXPBARPRO T1 INNER JOIN TXPPROCES T2 ON T2.EmprCod = T1.EmprCod AND T2.ProCod = T1.ProCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03GB7", "INSERT INTO TXPALBREC(EmprCod, AlbRecCod, CliCod, AlbRef, AlbRPieEnt, AlbRUni, AlbRLoc, AlbRFen, AlbRUniEnt, AlbRReo, AlbRPieUti, AlbRUniUti, AlbRFecUlt, AlbREst, TipEntCod, ProceCod, AlbRImp, AlbRefDsc, AlbREnt2, AlbRLote, AlbOC, TrnCod, AlbREnt, AlbRPieReb, AlbRUniReb, AlbNumEti, AlbRDes, AlbRUlin, HisEmpULin, AlbRDisCli, AlbPmPPza, AlbRTam, AlbRMdlCod, AlbRUniLot, AlbRPieLot, AlbRHEn, ClasCod, AlbRGrm2, AlbRAnc, AlbPml, AlbRPre, AlbRAju, AlbRRep, AlbrUsu, AlbrHor, AlbrUniC, AlbrPieC, AlbrNF, AlbrFeNf, AlbrCfop, AlbRTartC, AlbRTelar, AlbRLu, AlbRTara, AlbRUniB, AlbDocPrv, AlbRUdas, AlmCod, MatC_ULin, AlbRecSec, AlbColor, AlbOpsT, AlbOpsC, AlbHdri, AlbNumB, AlbNumM, AlbAncC, AlbDndC, AlbAncCr, AlbDndCr, AlbGalga, AlbMaqTej, AlbDmt, Bod_UltPz, Emp_Item1, AlbPdaC, AlbOStj, AlbStLot, AlbTurno, AlbUltP, Cod_mta, AlbOEKOTEX, AlbRPh, AlbRRLong, AlbRRTrans, AlbRLot2) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ' ', 0, 0, 0, ' ', 0, 0, ' ', 0, ' ', ' ', 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, ' ', 0, 0, 0, ' ', 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, 0, 0, 0, ' ', 0, ' ', ' ', ' ', ' ', 0, 0, 0, 0, ' ', 0, 0, 0, ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBREC")
         ,new UpdateCursor("P03GB8", "UPDATE TXPBARCAD SET BarAsi=?, BarSit=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P03GB9", "SELECT EmprCod, Be_Pza, Be_Mts, Be_Kgs, Be_Ubi, Be_Col, Be_Dib, Be_TipDfC, Be_hdrp, Be_hdrr, Be_hdr FROM TXPINOTB1 WHERE EmprCod = ? and Be_hdr = ? and Be_hdrr = ? and Be_hdrp = ? ORDER BY EmprCod, Be_hdr, Be_hdrr, Be_hdrp, Be_Pza ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03GB10", "INSERT INTO TXPALBDET(EmprCod, AlbRecCod, AlbRecPie, AlbRecAnh, AlbRecMtr, AlbRecKgm, AlbRecMtrU, AlbRecKgmU, AlbRecFec, AlbRecPar, ALRPIELOC, ALRPIETEL, AlbRecCo1, AlbHdr, AlbHdrr, AlbHdrp, AlbSerT, AlbNPed, Bod_Dib, Bod_FecE, Bod_PedOr, Bod_PoS, Bod_Ok, Bod_ColNNn, Bod_DibO, Bod_ToE, Bod_DescP, AlbRecCol, AlbRecIdPz, AlbRecIdRc, AlbRecPal, AlRPieCal, AlRPieClaM, AlRPieUltC, AlRPieDefT, AlRPieDefC, AlRExp1, AlRExp2, AlbRecCue, ALRPIEOPE, ALRPIEST, AlbRecPnt, AlbRecCo2, AlbColNm, AlbColNn, AlbKgsPf, AlbMtsPf, AlbAfin, AlbObsp, Bod_Tua, Bod_Tub, Bod_Tuc, Bod_Hilz, Bod_Rack, Bod_Talla, Bod_Und, Bod_Medt, Bod_Por, Bod_codb, Bod_Pes, Bod_item3, Bod_CVar, Bod_NVar, AlRPieTelT, AlRPieCon, AlRPieOri, AlRPieDst, AlrPieKgmT, AlbPCont) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ' ', 0, 0, ' ', 0, ' ', 0, 0, ' ', ' ', 0, ' ', ' ', 0, 0, ' ', 0, 0, 0, 0, ' ', 0, 0, 0, ' ', ' ', ' ', 0, ' ', 0, ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', ' ', 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBDET")
         ,new UpdateCursor("P03GB11", "INSERT INTO TXPINV80E(EmprCod, IV80EArtID, IV80EColNI, IV80ETpIVI, IV80EMtStk, IV80EMtPrg, IV80EMtRes, IV80EArtDs, IV80EMtsOE) VALUES(?, ?, ?, ?, ?, ?, ?, ?, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPINV80E")
         ,new ForEachCursor("P03GB12", "SELECT EmprCod, IV80EArtID, IV80EColNI, IV80ETpIVI, IV80EMtStk FROM TXPINV80E WHERE EmprCod = ? and IV80EArtID = ? and IV80EColNI = ? and IV80ETpIVI = ? ORDER BY EmprCod, IV80EArtID, IV80EColNI, IV80ETpIVI ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P03GB13", "UPDATE TXPINV80E SET IV80EMtStk=?  WHERE EmprCod = ? AND IV80EArtID = ? AND IV80EColNI = ? AND IV80ETpIVI = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPINV80E")
         ,new ForEachCursor("P03GB14", "SELECT EmprCod, Etx_Ped, Etx_DibC, Etx_TipPlt, Etx_Dib FROM TXPCPDETX WHERE EmprCod = ? and Etx_Ped = ? and Etx_DibC = ? ORDER BY EmprCod, Etx_Ped, Etx_DibC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03GB15", "SELECT EmprCod, Etx_Ped, Etx_Inv, Etx_Dib FROM TXPCPDETX WHERE EmprCod = ? and Etx_Ped = ? ORDER BY EmprCod, Etx_Ped ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 1 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 13);
               ((String[]) buf[9])[0] = rslt.getString(10, 16);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 40);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 9);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 10);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 13);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 16);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(9, 1);
               ((byte[]) buf[15])[0] = rslt.getByte(10);
               ((int[]) buf[16])[0] = rslt.getInt(11);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
               ((String[]) buf[3])[0] = rslt.getString(4, 4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 16);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 16);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(2, (java.util.Date)parms[3], false);
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setInt(4, ((Number) parms[5]).intValue());
               stmt.setByte(5, ((Number) parms[6]).byteValue());
               stmt.setString(6, (String)parms[7], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 10);
               stmt.setDate(8, (java.util.Date)parms[7]);
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[8], 2);
               stmt.setString(10, (String)parms[9], 2);
               stmt.setInt(11, ((Number) parms[10]).intValue());
               stmt.setBigDecimal(12, (java.math.BigDecimal)parms[11], 2);
               stmt.setDate(13, (java.util.Date)parms[12]);
               stmt.setByte(14, ((Number) parms[13]).byteValue());
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(15, ((Number) parms[15]).shortValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(16, ((Number) parms[17]).shortValue());
               }
               stmt.setString(17, (String)parms[18], 1);
               stmt.setString(18, (String)parms[19], 26);
               stmt.setString(19, (String)parms[20], 20);
               stmt.setString(20, (String)parms[21], 20);
               stmt.setString(21, (String)parms[22], 12);
               return;
            case 6 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 2);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 2);
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(9, (java.util.Date)parms[9], false);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[11]).shortValue());
               }
               stmt.setString(11, (String)parms[12], 10);
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[14]).shortValue());
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[16], 13);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(14, ((Number) parms[18]).intValue());
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(15, ((Number) parms[20]).byteValue());
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[22], 1);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[24], 16);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[26], 20);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(19, (String)parms[28], 20);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.DATE );
               }
               else
               {
                  stmt.setDate(20, (java.util.Date)parms[30]);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[32], 20);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[34], 1);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[36], 1);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(24, (String)parms[38], 40);
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(25, (String)parms[40], 20);
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(26, (String)parms[42], 1);
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(27, (String)parms[44], 80);
               }
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setString(3, (String)parms[2], 40);
               stmt.setString(4, (String)parms[3], 4);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[5], 2);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[7], 2);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[9], 2);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[11], 26);
               }
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setString(3, (String)parms[2], 40);
               stmt.setString(4, (String)parms[3], 4);
               return;
            case 11 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 16);
               stmt.setString(4, (String)parms[4], 40);
               stmt.setString(5, (String)parms[5], 4);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 20);
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 20);
               return;
      }
   }

}

