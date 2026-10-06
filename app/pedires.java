package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class pedires extends GXReport
{
   public pedires( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pedires.class ), "" );
   }

   public pedires( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             byte[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 )
   {
      pedires.this.aP7 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        byte[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             byte[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 )
   {
      pedires.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pedires.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pedires.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pedires.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pedires.this.A2524DisComLin = aP4[0];
      this.aP4 = aP4;
      pedires.this.A1056DisComCod = aP5[0];
      this.aP5 = aP5;
      pedires.this.A1032FonCod = aP6[0];
      this.aP6 = aP6;
      pedires.this.Gx_out = aP7[0];
      this.aP7 = aP7;
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
         getPrinter().GxSetDocName("EDICION DE RECETAS") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*0)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         /* Execute user subroutine: 'INIT' */
         S121 ();
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
         GX_I = 1 ;
         while ( GX_I <= 100 )
         {
            AV144tab_prd[GX_I-1] = "" ;
            GX_I = (int)(GX_I+1) ;
         }
         GX_I = 1 ;
         while ( GX_I <= 100 )
         {
            AV145tab_cnt[GX_I-1] = DecimalUtil.doubleToDec(0) ;
            GX_I = (int)(GX_I+1) ;
         }
         GX_I = 1 ;
         while ( GX_I <= 100 )
         {
            AV146tab_cntp[GX_I-1] = DecimalUtil.doubleToDec(0) ;
            GX_I = (int)(GX_I+1) ;
         }
         AV147i = (short)(1) ;
         AV148j = (short)(1) ;
         GxHdr3 = true ;
         /* Using cursor P00YW2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A858ZonGeoCod = P00YW2_A858ZonGeoCod[0] ;
            A361DisCod = P00YW2_A361DisCod[0] ;
            A1013DibCli = P00YW2_A1013DibCli[0] ;
            n1013DibCli = P00YW2_n1013DibCli[0] ;
            A1014DibInt = P00YW2_A1014DibInt[0] ;
            n1014DibInt = P00YW2_n1014DibInt[0] ;
            A2122RecEstTMaq = P00YW2_A2122RecEstTMaq[0] ;
            n2122RecEstTMaq = P00YW2_n2122RecEstTMaq[0] ;
            A252CliCod = P00YW2_A252CliCod[0] ;
            n252CliCod = P00YW2_n252CliCod[0] ;
            A212BarSer = P00YW2_A212BarSer[0] ;
            A1798BarDibCli = P00YW2_A1798BarDibCli[0] ;
            A1799BarDibInt = P00YW2_A1799BarDibInt[0] ;
            A1541BarComMtr = P00YW2_A1541BarComMtr[0] ;
            n1541BarComMtr = P00YW2_n1541BarComMtr[0] ;
            A8420OpeREst = P00YW2_A8420OpeREst[0] ;
            n8420OpeREst = P00YW2_n8420OpeREst[0] ;
            A4812BarEncCli = P00YW2_A4812BarEncCli[0] ;
            A1652BarSerDsc = P00YW2_A1652BarSerDsc[0] ;
            A8312BarMaqPor = P00YW2_A8312BarMaqPor[0] ;
            n8312BarMaqPor = P00YW2_n8312BarMaqPor[0] ;
            A8313CodMaqEst = P00YW2_A8313CodMaqEst[0] ;
            n8313CodMaqEst = P00YW2_n8313CodMaqEst[0] ;
            A2073BarNumMol = P00YW2_A2073BarNumMol[0] ;
            n2073BarNumMol = P00YW2_n2073BarNumMol[0] ;
            A279CliNom = P00YW2_A279CliNom[0] ;
            A2070BarFecEst = P00YW2_A2070BarFecEst[0] ;
            n2070BarFecEst = P00YW2_n2070BarFecEst[0] ;
            A155BarFecCli = P00YW2_A155BarFecCli[0] ;
            A159BarFecGen = P00YW2_A159BarFecGen[0] ;
            A6841DibDsc = P00YW2_A6841DibDsc[0] ;
            n6841DibDsc = P00YW2_n6841DibDsc[0] ;
            A125BarAncAca1 = P00YW2_A125BarAncAca1[0] ;
            A143BarDisNum = P00YW2_A143BarDisNum[0] ;
            A120BarAgrEst = P00YW2_A120BarAgrEst[0] ;
            A3307DisManCod1 = P00YW2_A3307DisManCod1[0] ;
            A1360ZonGeoNom = P00YW2_A1360ZonGeoNom[0] ;
            n1360ZonGeoNom = P00YW2_n1360ZonGeoNom[0] ;
            A1431BarLocDis = P00YW2_A1431BarLocDis[0] ;
            A361DisCod = P00YW2_A361DisCod[0] ;
            A252CliCod = P00YW2_A252CliCod[0] ;
            n252CliCod = P00YW2_n252CliCod[0] ;
            A212BarSer = P00YW2_A212BarSer[0] ;
            A1798BarDibCli = P00YW2_A1798BarDibCli[0] ;
            A1799BarDibInt = P00YW2_A1799BarDibInt[0] ;
            A4812BarEncCli = P00YW2_A4812BarEncCli[0] ;
            A1652BarSerDsc = P00YW2_A1652BarSerDsc[0] ;
            A155BarFecCli = P00YW2_A155BarFecCli[0] ;
            A159BarFecGen = P00YW2_A159BarFecGen[0] ;
            A125BarAncAca1 = P00YW2_A125BarAncAca1[0] ;
            A143BarDisNum = P00YW2_A143BarDisNum[0] ;
            A120BarAgrEst = P00YW2_A120BarAgrEst[0] ;
            A1431BarLocDis = P00YW2_A1431BarLocDis[0] ;
            A1013DibCli = P00YW2_A1013DibCli[0] ;
            n1013DibCli = P00YW2_n1013DibCli[0] ;
            A1014DibInt = P00YW2_A1014DibInt[0] ;
            n1014DibInt = P00YW2_n1014DibInt[0] ;
            A3307DisManCod1 = P00YW2_A3307DisManCod1[0] ;
            A858ZonGeoCod = P00YW2_A858ZonGeoCod[0] ;
            A279CliNom = P00YW2_A279CliNom[0] ;
            A1360ZonGeoNom = P00YW2_A1360ZonGeoNom[0] ;
            n1360ZonGeoNom = P00YW2_n1360ZonGeoNom[0] ;
            A6841DibDsc = P00YW2_A6841DibDsc[0] ;
            n6841DibDsc = P00YW2_n6841DibDsc[0] ;
            AV143BarEnccli = A4812BarEncCli ;
            AV24CliCod = A252CliCod ;
            AV38Serie = A212BarSer ;
            AV25BarDibCli = A1798BarDibCli ;
            AV26BarDibInt = A1799BarDibInt ;
            AV109barCod = A129BarCod ;
            AV110BarCodreo = A132BarCodReo ;
            AV111Barcodpar = A130BarCodPar ;
            AV113RecEstTMaq = A2122RecEstTMaq ;
            AV28ColCom = A1056DisComCod ;
            AV29ColFon = A1032FonCod ;
            /* Using cursor P00YW3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n8420OpeREst), Integer.valueOf(A8420OpeREst)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A652OpeCod = P00YW3_A652OpeCod[0] ;
               A653OpeNom = P00YW3_A653OpeNom[0] ;
               n653OpeNom = P00YW3_n653OpeNom[0] ;
               AV107OpeNom = A653OpeNom ;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(1);
            AV123MaqDsc = "" ;
            AV124Maqcod = A8313CodMaqEst ;
            /* Execute user subroutine: 'MAQUIN' */
            S211 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
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
            AV108RecTotMtr = DecimalUtil.doubleToDec(0) ;
            if ( GXutil.strcmp(A120BarAgrEst, httpContext.getMessage( "S", "")) == 0 )
            {
               GXv_char1[0] = A396EmprCod ;
               GXv_int2[0] = A129BarCod ;
               GXv_int3[0] = A132BarCodReo ;
               GXv_char4[0] = A130BarCodPar ;
               GXv_decimal5[0] = AV108RecTotMtr ;
               new app.ppreagre(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4, GXv_decimal5) ;
               pedires.this.A396EmprCod = GXv_char1[0] ;
               pedires.this.A129BarCod = GXv_int2[0] ;
               pedires.this.A132BarCodReo = GXv_int3[0] ;
               pedires.this.A130BarCodPar = GXv_char4[0] ;
               pedires.this.AV108RecTotMtr = GXv_decimal5[0] ;
            }
            /* Using cursor P00YW4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A758ProCod = P00YW4_A758ProCod[0] ;
               AV114Procod = A758ProCod ;
               pr_default.readNext(2);
            }
            pr_default.close(2);
            /* Execute user subroutine: 'ARTLIN' */
            S181 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
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
            if ( AV98Eliot == 1 )
            {
               AV116Barancaca1 = AV115Art_AncA ;
            }
            else
            {
               AV116Barancaca1 = A125BarAncAca1 ;
            }
            /* Execute user subroutine: 'CDIBUJ' */
            S201 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
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
            AV142BarDisnum = A143BarDisNum ;
            GxHdr7 = true ;
            /* Using cursor P00YW5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A361DisCod = P00YW5_A361DisCod[0] ;
               A1014DibInt = P00YW5_A1014DibInt[0] ;
               n1014DibInt = P00YW5_n1014DibInt[0] ;
               A1013DibCli = P00YW5_A1013DibCli[0] ;
               n1013DibCli = P00YW5_n1013DibCli[0] ;
               A2124RecMolCod = P00YW5_A2124RecMolCod[0] ;
               A2128RecMolRep = P00YW5_A2128RecMolRep[0] ;
               n2128RecMolRep = P00YW5_n2128RecMolRep[0] ;
               A5103RecMolCns = P00YW5_A5103RecMolCns[0] ;
               n5103RecMolCns = P00YW5_n5103RecMolCns[0] ;
               A5102RecMolMtr = P00YW5_A5102RecMolMtr[0] ;
               n5102RecMolMtr = P00YW5_n5102RecMolMtr[0] ;
               A2127RecMolNom = P00YW5_A2127RecMolNom[0] ;
               n2127RecMolNom = P00YW5_n2127RecMolNom[0] ;
               A9537RecMolCCOb = P00YW5_A9537RecMolCCOb[0] ;
               n9537RecMolCCOb = P00YW5_n9537RecMolCCOb[0] ;
               A9535RecMolCodC = P00YW5_A9535RecMolCodC[0] ;
               n9535RecMolCodC = P00YW5_n9535RecMolCodC[0] ;
               A9538RecMolDgC = P00YW5_A9538RecMolDgC[0] ;
               n9538RecMolDgC = P00YW5_n9538RecMolDgC[0] ;
               A361DisCod = P00YW5_A361DisCod[0] ;
               A1014DibInt = P00YW5_A1014DibInt[0] ;
               n1014DibInt = P00YW5_n1014DibInt[0] ;
               A1013DibCli = P00YW5_A1013DibCli[0] ;
               n1013DibCli = P00YW5_n1013DibCli[0] ;
               if ( ( GXutil.strcmp(A2128RecMolRep, httpContext.getMessage( "S", "")) == 0 ) && ( AV98Eliot == 0 ) )
               {
                  if ( GXutil.strcmp(A5103RecMolCns, httpContext.getMessage( "S", "")) == 0 )
                  {
                     AV27Repet = httpContext.getMessage( "- REPETICION CONSOLIDADA (", "") + GXutil.trim( GXutil.str( A5102RecMolMtr, 10, 2)) + httpContext.getMessage( " Mts.) - ", "") ;
                  }
                  else
                  {
                     AV27Repet = httpContext.getMessage( "- REPETICION - ", "") ;
                  }
               }
               else
               {
                  AV27Repet = "" ;
               }
               if ( GXutil.strcmp(A2122RecEstTMaq, httpContext.getMessage( "P", "")) == 0 )
               {
                  GXt_char6 = AV68Lit24 ;
                  GXv_char4[0] = GXt_char6 ;
                  new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT663_", ""), (byte)(99), GXv_char4) ;
                  pedires.this.GXt_char6 = GXv_char4[0] ;
                  AV68Lit24 = GXt_char6 ;
               }
               else
               {
                  GXt_char6 = AV68Lit24 ;
                  GXv_char4[0] = GXt_char6 ;
                  new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT660_", ""), (byte)(99), GXv_char4) ;
                  pedires.this.GXt_char6 = GXv_char4[0] ;
                  AV68Lit24 = GXt_char6 ;
               }
               AV37MolCod = A2124RecMolCod ;
               /* Using cursor P00YW6 */
               pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A212BarSer, Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt), A1056DisComCod, A1032FonCod, Byte.valueOf(A2124RecMolCod)});
               while ( (pr_default.getStatus(4) != 101) )
               {
                  A2141SerEst = P00YW6_A2141SerEst[0] ;
                  A2074ColCom = P00YW6_A2074ColCom[0] ;
                  A2078ColFon = P00YW6_A2078ColFon[0] ;
                  A2098MolCod = P00YW6_A2098MolCod[0] ;
                  A4420MolCol = P00YW6_A4420MolCol[0] ;
                  n4420MolCol = P00YW6_n4420MolCol[0] ;
                  AV90MolCol = A4420MolCol ;
                  if ( ( AV88Artextil.doubleValue() == 1 ) || ( AV158Stamperia == 1 ) )
                  {
                     GXv_char4[0] = A396EmprCod ;
                     GXv_int2[0] = 1 ;
                     GXv_char1[0] = A4420MolCol ;
                     GXv_char7[0] = AV89EstColDsc ;
                     GXv_int8[0] = AV159EstColRGB ;
                     new app.pestcoldsc(remoteHandle, context).execute( GXv_char4, GXv_int2, GXv_char1, GXv_char7, GXv_int8) ;
                     pedires.this.A396EmprCod = GXv_char4[0] ;
                     pedires.this.A4420MolCol = GXv_char1[0] ;
                     pedires.this.AV89EstColDsc = GXv_char7[0] ;
                     pedires.this.AV159EstColRGB = GXv_int8[0] ;
                  }
                  else
                  {
                     GXv_char7[0] = A396EmprCod ;
                     GXv_int2[0] = A252CliCod ;
                     GXv_char4[0] = A4420MolCol ;
                     GXv_char1[0] = AV89EstColDsc ;
                     GXv_int8[0] = AV159EstColRGB ;
                     new app.pestcoldsc(remoteHandle, context).execute( GXv_char7, GXv_int2, GXv_char4, GXv_char1, GXv_int8) ;
                     pedires.this.A396EmprCod = GXv_char7[0] ;
                     pedires.this.A252CliCod = GXv_int2[0] ;
                     pedires.this.A4420MolCol = GXv_char4[0] ;
                     pedires.this.AV89EstColDsc = GXv_char1[0] ;
                     pedires.this.AV159EstColRGB = GXv_int8[0] ;
                  }
                  GXv_int8[0] = AV159EstColRGB ;
                  GXv_int9[0] = AV162R ;
                  GXv_int10[0] = AV161G ;
                  GXv_int11[0] = AV160B ;
                  new app.pleorgb(remoteHandle, context).execute( GXv_int8, GXv_int9, GXv_int10, GXv_int11) ;
                  pedires.this.AV159EstColRGB = GXv_int8[0] ;
                  pedires.this.AV162R = GXv_int9[0] ;
                  pedires.this.AV161G = GXv_int10[0] ;
                  pedires.this.AV160B = GXv_int11[0] ;
                  /* Exiting from a For First loop. */
                  if (true) break;
               }
               pr_default.close(4);
               AV24CliCod = A252CliCod ;
               AV38Serie = A212BarSer ;
               AV25BarDibCli = A1798BarDibCli ;
               AV26BarDibInt = A1799BarDibInt ;
               AV95Recmolcod = A2124RecMolCod ;
               if ( GXutil.strcmp(A2122RecEstTMaq, httpContext.getMessage( "R", "")) == 0 )
               {
                  GXt_decimal12 = AV92MolPrcCob ;
                  GXv_decimal5[0] = GXt_decimal12 ;
                  new app.core.pporcob(remoteHandle, context).execute( A396EmprCod, A1798BarDibCli, A252CliCod, A1799BarDibInt, AV37MolCod, GXv_decimal5) ;
                  pedires.this.GXt_decimal12 = GXv_decimal5[0] ;
                  AV92MolPrcCob = GXt_decimal12 ;
               }
               else
               {
                  GXt_decimal12 = AV92MolPrcCob ;
                  GXv_decimal5[0] = GXt_decimal12 ;
                  new app.core.pporcobp(remoteHandle, context).execute( A396EmprCod, A1798BarDibCli, A252CliCod, A1799BarDibInt, AV37MolCod, GXv_decimal5) ;
                  pedires.this.GXt_decimal12 = GXv_decimal5[0] ;
                  AV92MolPrcCob = GXt_decimal12 ;
               }
               AV28ColCom = A1056DisComCod ;
               AV29ColFon = A1032FonCod ;
               AV37MolCod = A2124RecMolCod ;
               /* Execute user subroutine: 'PESMAX' */
               S141 ();
               if ( returnInSub )
               {
                  pr_default.close(3);
                  pr_default.close(3);
                  pr_default.close(3);
                  pr_default.close(0);
                  pr_default.close(0);
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
               AV154TotCob = AV154TotCob.add(AV92MolPrcCob) ;
               AV129TipoMalha = " " ;
               /* Execute user subroutine: 'DIBUJM' */
               S161 ();
               if ( returnInSub )
               {
                  pr_default.close(3);
                  pr_default.close(3);
                  pr_default.close(3);
                  pr_default.close(0);
                  pr_default.close(0);
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
               /* Execute user subroutine: 'DIBUJC' */
               S171 ();
               if ( returnInSub )
               {
                  pr_default.close(3);
                  pr_default.close(3);
                  pr_default.close(3);
                  pr_default.close(0);
                  pr_default.close(0);
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
               AV68Lit24 = GXutil.trim( AV68Lit24) + "-" + httpContext.getMessage( "Orden", "") ;
               if ( ( AV106Dg_valor == 0 ) || ( GXutil.strcmp(AV105Dg_Desc, " ") == 0 ) )
               {
                  hYW0( false, 39) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2124RecMolCod), "Z9")), 140, Gx_line+3, 156, Gx_line+20, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2127RecMolNom, "")), 217, Gx_line+2, 384, Gx_line+19, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV68Lit24, "")), 56, Gx_line+2, 132, Gx_line+19, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(":", 134, Gx_line+3, 138, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV89EstColDsc, "")), 634, Gx_line+3, 801, Gx_line+20, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV90MolCol, "")), 461, Gx_line+3, 628, Gx_line+20, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV92MolPrcCob, "ZZ9.99 %")), 383, Gx_line+2, 442, Gx_line+19, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27Repet, "")), 56, Gx_line+23, 182, Gx_line+40, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV97Orden_, "")), 166, Gx_line+3, 217, Gx_line+20, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText("-", 156, Gx_line+3, 165, Gx_line+20, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Malla:", ""), 382, Gx_line+22, 424, Gx_line+39, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV129TipoMalha, "")), 427, Gx_line+22, 491, Gx_line+39, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Constantia", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV159EstColRGB), "ZZZZZZZZZZ")), 653, Gx_line+23, 727, Gx_line+39, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV162R), "ZZZ")), 734, Gx_line+23, 757, Gx_line+39, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV161G), "ZZZ")), 760, Gx_line+23, 783, Gx_line+39, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV160B), "ZZZ")), 785, Gx_line+23, 808, Gx_line+39, 2+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+39) ;
               }
               else
               {
                  AV118recmolccob = GXutil.trim( A9537RecMolCCOb) ;
                  if ( GXutil.strcmp(A9535RecMolCodC, " ") != 0 )
                  {
                     AV90MolCol = A9535RecMolCodC ;
                     AV117RecMolDgC = A9538RecMolDgC ;
                     /* Execute user subroutine: 'DEGRA' */
                     S191 ();
                     if ( returnInSub )
                     {
                        pr_default.close(3);
                        pr_default.close(3);
                        pr_default.close(3);
                        pr_default.close(0);
                        pr_default.close(0);
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
                  }
                  hYW0( false, 40) ;
                  getPrinter().GxAttris("Constantia", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2124RecMolCod), "Z9")), 140, Gx_line+1, 156, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Constantia", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2127RecMolNom, "")), 207, Gx_line+0, 374, Gx_line+17, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV68Lit24, "")), 56, Gx_line+0, 132, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(":", 134, Gx_line+1, 138, Gx_line+16, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, true, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV118recmolccob, "")), 634, Gx_line+1, 817, Gx_line+19, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Constantia", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV90MolCol, "")), 461, Gx_line+1, 628, Gx_line+18, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Constantia", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV92MolPrcCob, "ZZ9.99 %")), 389, Gx_line+0, 448, Gx_line+16, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV97Orden_, "")), 168, Gx_line+1, 219, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText("-", 157, Gx_line+1, 166, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Constantia", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV105Dg_Desc, "")), 140, Gx_line+23, 433, Gx_line+39, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Valor Degradacion:", ""), 671, Gx_line+23, 783, Gx_line+39, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Constantia", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV106Dg_valor), "ZZZ9")), 789, Gx_line+23, 819, Gx_line+39, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Dm:", ""), 459, Gx_line+23, 483, Gx_line+39, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Constantia", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV125DibDm), "Z9")), 486, Gx_line+23, 502, Gx_line+39, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Presion:", ""), 518, Gx_line+23, 568, Gx_line+39, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Constantia", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV126DibPres, "")), 569, Gx_line+23, 643, Gx_line+39, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+40) ;
               }
               AV24CliCod = A252CliCod ;
               AV38Serie = A212BarSer ;
               AV25BarDibCli = A1798BarDibCli ;
               AV26BarDibInt = A1799BarDibInt ;
               AV95Recmolcod = A2124RecMolCod ;
               AV28ColCom = A1056DisComCod ;
               AV29ColFon = A1032FonCod ;
               AV37MolCod = A2124RecMolCod ;
               /* Execute user subroutine: 'PESMAX' */
               S141 ();
               if ( returnInSub )
               {
                  pr_default.close(3);
                  pr_default.close(3);
                  pr_default.close(3);
                  pr_default.close(0);
                  pr_default.close(0);
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
               AV32Contador = (byte)(1) ;
               while ( AV32Contador <= 25 )
               {
                  AV31CanMax[AV32Contador-1] = DecimalUtil.ZERO ;
                  AV32Contador = (byte)(AV32Contador+1) ;
               }
               AV32Contador = (byte)(1) ;
               AV33TotPas = DecimalUtil.doubleToDec(0) ;
               AV41FlagMax = (byte)(0) ;
               AV40TotResto = DecimalUtil.doubleToDec(0) ;
               AV45KilPas = DecimalUtil.doubleToDec(0) ;
               AV103KilPasPar = DecimalUtil.doubleToDec(0) ;
               AV47TotCol = DecimalUtil.doubleToDec(0) ;
               /* Using cursor P00YW7 */
               pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod, Byte.valueOf(A2124RecMolCod)});
               while ( (pr_default.getStatus(5) != 101) )
               {
                  A2119RecEstCP = P00YW7_A2119RecEstCP[0] ;
                  n2119RecEstCP = P00YW7_n2119RecEstCP[0] ;
                  A5105RecEstCPPa = P00YW7_A5105RecEstCPPa[0] ;
                  n5105RecEstCPPa = P00YW7_n5105RecEstCPPa[0] ;
                  A2126RecMolLin = P00YW7_A2126RecMolLin[0] ;
                  AV47TotCol = AV47TotCol.add(((A2119RecEstCP.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(AV102DivUni)))) ;
                  AV103KilPasPar = AV103KilPasPar.add((A5105RecEstCPPa.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN))) ;
                  pr_default.readNext(5);
               }
               pr_default.close(5);
               /* Using cursor P00YW8 */
               pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod, Byte.valueOf(A2124RecMolCod)});
               while ( (pr_default.getStatus(6) != 101) )
               {
                  A2132RecPasCan = P00YW8_A2132RecPasCan[0] ;
                  n2132RecPasCan = P00YW8_n2132RecPasCan[0] ;
                  A5108RecPasCPPa = P00YW8_A5108RecPasCPPa[0] ;
                  n5108RecPasCPPa = P00YW8_n5108RecPasCPPa[0] ;
                  A2672RecPasLin = P00YW8_A2672RecPasLin[0] ;
                  AV45KilPas = AV45KilPas.add((A2132RecPasCan.multiply(DecimalUtil.doubleToDec(AV102DivUni)))) ;
                  AV103KilPasPar = AV103KilPasPar.add(A5108RecPasCPPa) ;
                  pr_default.readNext(6);
               }
               pr_default.close(6);
               AV149TotPasta = AV149TotPasta.add(AV45KilPas) ;
               AV45KilPas = AV45KilPas.add(AV47TotCol) ;
               AV45KilPas = GXutil.roundDecimal( AV45KilPas, 2) ;
               if ( AV102DivUni == 1000 )
               {
                  AV45KilPas = GXutil.roundDecimal( AV45KilPas, 0) ;
               }
               AV103KilPasPar = GXutil.roundDecimal( AV103KilPasPar, 2) ;
               /* Using cursor P00YW9 */
               pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod, Byte.valueOf(A2124RecMolCod)});
               while ( (pr_default.getStatus(7) != 101) )
               {
                  A2133RecPasGK = P00YW9_A2133RecPasGK[0] ;
                  n2133RecPasGK = P00YW9_n2133RecPasGK[0] ;
                  A2132RecPasCan = P00YW9_A2132RecPasCan[0] ;
                  n2132RecPasCan = P00YW9_n2132RecPasCan[0] ;
                  A2672RecPasLin = P00YW9_A2672RecPasLin[0] ;
                  if ( AV32Contador > 25 )
                  {
                     /* Exit For each command. Update data (if necessary), close cursors & exit. */
                     if (true) break;
                  }
                  else
                  {
                     if ( ( DecimalUtil.compareTo(A2132RecPasCan, ((AV44TinEst==1) ? A2133RecPasGK.multiply((AV30MolPesMax.subtract(AV47TotCol.multiply(AV30MolPesMax).divide(AV45KilPas, 18, java.math.RoundingMode.DOWN)))) : AV30MolPesMax)) > 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV30MolPesMax)==0) )
                     {
                        AV36Cociente = ((AV44TinEst==1) ? A2133RecPasGK.multiply((AV30MolPesMax.subtract(AV47TotCol.multiply(AV30MolPesMax).divide(AV45KilPas, 18, java.math.RoundingMode.DOWN)))) : AV30MolPesMax) ;
                        AV35Resto = A2132RecPasCan.subtract((DecimalUtil.doubleToDec(GXutil.Int( DecimalUtil.decToDouble(A2132RecPasCan.divide(AV36Cociente, 18, java.math.RoundingMode.DOWN)))).multiply(AV36Cociente))) ;
                        AV40TotResto = AV40TotResto.add(AV35Resto) ;
                        AV31CanMax[AV32Contador-1] = GXutil.roundDecimal( AV36Cociente, 2) ;
                        AV33TotPas = AV33TotPas.add((GXutil.roundDecimal( AV36Cociente.add(AV47TotCol.multiply(AV30MolPesMax).divide(AV45KilPas, 18, java.math.RoundingMode.DOWN)), 2))) ;
                        AV41FlagMax = (byte)(1) ;
                        AV42Mul = (byte)(GXutil.Int( DecimalUtil.decToDouble(A2132RecPasCan.divide(AV31CanMax[AV32Contador-1], 18, java.math.RoundingMode.DOWN)))) ;
                     }
                     else
                     {
                        AV33TotPas = AV33TotPas.add(A2132RecPasCan) ;
                     }
                     AV32Contador = (byte)(AV32Contador+1) ;
                  }
                  pr_default.readNext(7);
               }
               pr_default.close(7);
               AV32Contador = (byte)(1) ;
               AV122TotPrd = DecimalUtil.doubleToDec(0) ;
               AV131CantPasta = AV45KilPas ;
               if ( GXutil.Int( DecimalUtil.decToDouble(AV131CantPasta.divide(DecimalUtil.doubleToDec(AV130CapTacho), 18, java.math.RoundingMode.DOWN))) == AV131CantPasta.divide(DecimalUtil.doubleToDec(AV130CapTacho), 18, java.math.RoundingMode.DOWN).doubleValue() )
               {
                  AV132NumeroT = (byte)(GXutil.Int( DecimalUtil.decToDouble(AV131CantPasta.divide(DecimalUtil.doubleToDec(AV130CapTacho), 18, java.math.RoundingMode.DOWN)))) ;
               }
               else
               {
                  AV132NumeroT = (byte)(GXutil.Int( DecimalUtil.decToDouble(AV131CantPasta.divide(DecimalUtil.doubleToDec(AV130CapTacho), 18, java.math.RoundingMode.DOWN)))) ;
               }
               AV137RestoP = AV131CantPasta.subtract(DecimalUtil.doubleToDec((AV130CapTacho*AV132NumeroT))) ;
               AV140TotProd = DecimalUtil.doubleToDec(0) ;
               /* Using cursor P00YW10 */
               pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod, Byte.valueOf(A2124RecMolCod)});
               while ( (pr_default.getStatus(8) != 101) )
               {
                  A2119RecEstCP = P00YW10_A2119RecEstCP[0] ;
                  n2119RecEstCP = P00YW10_n2119RecEstCP[0] ;
                  A2120RecEstGK = P00YW10_A2120RecEstGK[0] ;
                  n2120RecEstGK = P00YW10_n2120RecEstGK[0] ;
                  A718PrdNom = P00YW10_A718PrdNom[0] ;
                  A719PrdNum = P00YW10_A719PrdNum[0] ;
                  n719PrdNum = P00YW10_n719PrdNum[0] ;
                  A2126RecMolLin = P00YW10_A2126RecMolLin[0] ;
                  A718PrdNom = P00YW10_A718PrdNom[0] ;
                  if ( AV32Contador > 25 )
                  {
                     /* Exit For each command. Update data (if necessary), close cursors & exit. */
                     if (true) break;
                  }
                  else
                  {
                     if ( ! (0==AV41FlagMax) && ( A2119RecEstCP.doubleValue() > 0 ) && ( AV98Eliot == 0 ) && ( AV141Piolera == 0 ) )
                     {
                        if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A2119RecEstCP)==0) )
                        {
                           AV34RecEstCp = DecimalUtil.ZERO ;
                           AV39RestoCP = DecimalUtil.ZERO ;
                        }
                        else
                        {
                           AV34RecEstCp = ((AV46CmpKil==1) ? A2119RecEstCP.multiply(AV30MolPesMax).divide(AV45KilPas, 18, java.math.RoundingMode.DOWN) : A2120RecEstGK.multiply(AV33TotPas)) ;
                           AV39RestoCP = ((AV46CmpKil==1) ? A2119RecEstCP.multiply((AV45KilPas.subtract(AV30MolPesMax.multiply(DecimalUtil.doubleToDec(AV42Mul))))).divide(AV45KilPas, 18, java.math.RoundingMode.DOWN) : A2120RecEstGK.multiply(AV40TotResto)) ;
                        }
                        AV43RecEstTot = AV34RecEstCp.multiply(DecimalUtil.doubleToDec(AV42Mul)).add(AV39RestoCP) ;
                        if ( AV120Er == 0 )
                        {
                           hYW0( false, 33) ;
                           getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText("........", 549, Gx_line+0, 617, Gx_line+18, 0+256, 0, 0, 0) ;
                           getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2120RecEstGK, "ZZZZZ9.999")), 23, Gx_line+0, 97, Gx_line+17, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 115, Gx_line+0, 185, Gx_line+17, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 169, Gx_line+0, 305, Gx_line+17, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV34RecEstCp, "ZZZZZ9.999")), 247, Gx_line+17, 321, Gx_line+34, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV39RestoCP, "ZZZZZ9.999")), 389, Gx_line+17, 463, Gx_line+34, 2+256, 0, 0, 0) ;
                           getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText("X", 330, Gx_line+17, 339, Gx_line+35, 0+256, 0, 0, 0) ;
                           getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV42Mul), "Z9")), 347, Gx_line+17, 363, Gx_line+34, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV43RecEstTot, "ZZZZZ9.99")), 397, Gx_line+0, 464, Gx_line+17, 2+256, 0, 0, 0) ;
                           getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText("+", 372, Gx_line+17, 381, Gx_line+35, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText("........", 477, Gx_line+0, 545, Gx_line+18, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText("........", 755, Gx_line+0, 823, Gx_line+18, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText("........", 689, Gx_line+0, 757, Gx_line+18, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText("........", 622, Gx_line+0, 690, Gx_line+18, 0+256, 0, 0, 0) ;
                           Gx_OldLine = Gx_line ;
                           Gx_line = (int)(Gx_line+33) ;
                        }
                        else
                        {
                           if ( AV121UnKgm == 1 )
                           {
                              AV101Und = httpContext.getMessage( "Kgm", "") ;
                           }
                           AV99Cantidad = A2119RecEstCP.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
                           AV138CantGrm = A2119RecEstCP ;
                           AV133Cant1 = DecimalUtil.doubleToDec(0) ;
                           AV134Cant2 = DecimalUtil.doubleToDec(0) ;
                           if ( AV132NumeroT > 0 )
                           {
                              AV133Cant1 = A2120RecEstGK ;
                              AV134Cant2 = AV137RestoP.multiply(AV99Cantidad).divide(AV45KilPas, 18, java.math.RoundingMode.DOWN) ;
                              AV133Cant1 = GXutil.roundDecimal( AV133Cant1.multiply(DecimalUtil.doubleToDec(100)), 1) ;
                              AV134Cant2 = GXutil.roundDecimal( AV134Cant2.multiply(DecimalUtil.doubleToDec(1000)), 1) ;
                           }
                           hYW0( false, 18) ;
                           getPrinter().GxAttris("Constantia", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2120RecEstGK, "ZZZZZ9.999")), 23, Gx_line+0, 97, Gx_line+16, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 115, Gx_line+0, 191, Gx_line+16, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 169, Gx_line+0, 360, Gx_line+16, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV138CantGrm, "ZZZZZ9.999")), 399, Gx_line+0, 473, Gx_line+16, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV133Cant1, "ZZZZZZZZ.Z")), 507, Gx_line+0, 581, Gx_line+16, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV134Cant2, "ZZZZZZZZ.Z")), 694, Gx_line+0, 768, Gx_line+16, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawLine(497, Gx_line+0, 497, Gx_line+18, 1, 0, 0, 0, 0) ;
                           getPrinter().GxDrawLine(636, Gx_line+0, 636, Gx_line+18, 1, 0, 0, 0, 0) ;
                           getPrinter().GxDrawLine(821, Gx_line+0, 821, Gx_line+18, 1, 0, 0, 0, 0) ;
                           Gx_OldLine = Gx_line ;
                           Gx_line = (int)(Gx_line+18) ;
                           AV101Und = "" ;
                        }
                     }
                     else
                     {
                        if ( ( AV98Eliot == 0 ) && ( AV120Er == 0 ) )
                        {
                           AV101Und = "" ;
                           if ( AV141Piolera == 1 )
                           {
                              AV101Und = httpContext.getMessage( "g", "") ;
                           }
                           hYW0( false, 17) ;
                           getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2120RecEstGK, "ZZZZZ9.999")), 23, Gx_line+0, 97, Gx_line+17, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 115, Gx_line+0, 185, Gx_line+17, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 169, Gx_line+0, 305, Gx_line+17, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2119RecEstCP, "ZZZZZ9.999")), 389, Gx_line+0, 463, Gx_line+17, 2+256, 0, 0, 0) ;
                           getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText("........", 549, Gx_line+0, 617, Gx_line+18, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText("......", 505, Gx_line+0, 556, Gx_line+18, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText("........", 755, Gx_line+0, 823, Gx_line+18, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText("........", 689, Gx_line+0, 757, Gx_line+18, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText("........", 622, Gx_line+0, 690, Gx_line+18, 0+256, 0, 0, 0) ;
                           getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV101Und, "")), 466, Gx_line+1, 501, Gx_line+18, 0+256, 0, 0, 0) ;
                           Gx_OldLine = Gx_line ;
                           Gx_line = (int)(Gx_line+17) ;
                        }
                        else
                        {
                           AV99Cantidad = A2119RecEstCP ;
                           AV138CantGrm = A2119RecEstCP ;
                           if ( AV120Er == 1 )
                           {
                              if ( AV121UnKgm == 1 )
                              {
                                 AV101Und = httpContext.getMessage( "Kgm", "") ;
                              }
                              AV133Cant1 = DecimalUtil.doubleToDec(0) ;
                              AV134Cant2 = DecimalUtil.doubleToDec(0) ;
                              if ( AV132NumeroT > 0 )
                              {
                                 AV99Cantidad = (A2119RecEstCP.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)) ;
                                 AV133Cant1 = A2120RecEstGK ;
                                 AV134Cant2 = AV137RestoP.multiply(AV99Cantidad).divide(AV45KilPas, 18, java.math.RoundingMode.DOWN) ;
                                 AV133Cant1 = GXutil.roundDecimal( AV133Cant1.multiply(DecimalUtil.doubleToDec(100)), 1) ;
                                 AV134Cant2 = GXutil.roundDecimal( AV134Cant2.multiply(DecimalUtil.doubleToDec(1000)), 1) ;
                              }
                           }
                           hYW0( false, 18) ;
                           getPrinter().GxAttris("Constantia", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2120RecEstGK, "ZZZZZ9.999")), 23, Gx_line+0, 97, Gx_line+16, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 115, Gx_line+0, 191, Gx_line+16, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 169, Gx_line+0, 360, Gx_line+16, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV138CantGrm, "ZZZZZ9.999")), 399, Gx_line+0, 473, Gx_line+16, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV133Cant1, "ZZZZZZZZ.Z")), 507, Gx_line+0, 581, Gx_line+16, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV134Cant2, "ZZZZZZZZ.Z")), 694, Gx_line+0, 768, Gx_line+16, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawLine(497, Gx_line+0, 497, Gx_line+18, 1, 0, 0, 0, 0) ;
                           getPrinter().GxDrawLine(636, Gx_line+0, 636, Gx_line+18, 1, 0, 0, 0, 0) ;
                           getPrinter().GxDrawLine(821, Gx_line+0, 821, Gx_line+18, 1, 0, 0, 0, 0) ;
                           Gx_OldLine = Gx_line ;
                           Gx_line = (int)(Gx_line+18) ;
                           AV101Und = "" ;
                        }
                        AV32Contador = (byte)(AV32Contador+1) ;
                     }
                  }
                  AV122TotPrd = AV122TotPrd.add((A2119RecEstCP.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN))) ;
                  AV150Prdnum = A719PrdNum ;
                  AV151Cnt = A2119RecEstCP ;
                  /* Execute user subroutine: 'RESUMEN' */
                  S221 ();
                  if ( returnInSub )
                  {
                     pr_default.close(8);
                     pr_default.close(8);
                     pr_default.close(3);
                     pr_default.close(3);
                     pr_default.close(3);
                     pr_default.close(0);
                     pr_default.close(0);
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
                  pr_default.readNext(8);
               }
               pr_default.close(8);
               AV32Contador = (byte)(1) ;
               AV36Cociente = DecimalUtil.doubleToDec(0) ;
               AV35Resto = DecimalUtil.doubleToDec(0) ;
               /* Using cursor P00YW11 */
               pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod, Byte.valueOf(A2124RecMolCod)});
               while ( (pr_default.getStatus(9) != 101) )
               {
                  A2132RecPasCan = P00YW11_A2132RecPasCan[0] ;
                  n2132RecPasCan = P00YW11_n2132RecPasCan[0] ;
                  A2108PasDsc = P00YW11_A2108PasDsc[0] ;
                  n2108PasDsc = P00YW11_n2108PasDsc[0] ;
                  A2107PasCod = P00YW11_A2107PasCod[0] ;
                  n2107PasCod = P00YW11_n2107PasCod[0] ;
                  A2133RecPasGK = P00YW11_A2133RecPasGK[0] ;
                  n2133RecPasGK = P00YW11_n2133RecPasGK[0] ;
                  A2672RecPasLin = P00YW11_A2672RecPasLin[0] ;
                  A2108PasDsc = P00YW11_A2108PasDsc[0] ;
                  n2108PasDsc = P00YW11_n2108PasDsc[0] ;
                  if ( AV32Contador > 25 )
                  {
                     /* Exit For each command. Update data (if necessary), close cursors & exit. */
                     if (true) break;
                  }
                  else
                  {
                     if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV31CanMax[AV32Contador-1])==0) && ( A2132RecPasCan.doubleValue() > 0 ) && ( AV98Eliot == 0 ) && ( AV141Piolera == 0 ) )
                     {
                        AV36Cociente = AV31CanMax[AV32Contador-1] ;
                        AV35Resto = A2132RecPasCan.subtract((DecimalUtil.doubleToDec(GXutil.Int( DecimalUtil.decToDouble(A2132RecPasCan.divide(AV36Cociente, 18, java.math.RoundingMode.DOWN)))).multiply(AV36Cociente))) ;
                        AV104Cantidad1 = A2132RecPasCan.multiply(DecimalUtil.doubleToDec(AV102DivUni)) ;
                        AV35Resto = AV104Cantidad1.multiply(DecimalUtil.doubleToDec(AV102DivUni)) ;
                        if ( AV120Er == 0 )
                        {
                           hYW0( false, 32) ;
                           getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText("X", 330, Gx_line+16, 339, Gx_line+34, 0+256, 0, 0, 0) ;
                           getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2133RecPasGK, "ZZZZZ9.999")), 23, Gx_line+0, 97, Gx_line+17, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2107PasCod, "")), 115, Gx_line+0, 185, Gx_line+17, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2108PasDsc, "")), 169, Gx_line+0, 305, Gx_line+17, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV31CanMax[AV32Contador-1], "ZZZZZ9.999")), 247, Gx_line+16, 321, Gx_line+33, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV35Resto, "ZZZZZ9.999")), 389, Gx_line+16, 463, Gx_line+33, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV42Mul), "Z9")), 347, Gx_line+16, 363, Gx_line+33, 2+256, 0, 0, 0) ;
                           getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText("........", 549, Gx_line+0, 617, Gx_line+18, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText("........", 477, Gx_line+0, 545, Gx_line+18, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText("+", 372, Gx_line+16, 381, Gx_line+34, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText("........", 755, Gx_line+0, 823, Gx_line+18, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText("........", 689, Gx_line+0, 757, Gx_line+18, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText("........", 622, Gx_line+0, 690, Gx_line+18, 0+256, 0, 0, 0) ;
                           getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV104Cantidad1, "ZZZ,ZZ9.999")), 378, Gx_line+0, 461, Gx_line+17, 2, 0, 0, 0) ;
                           Gx_OldLine = Gx_line ;
                           Gx_line = (int)(Gx_line+32) ;
                        }
                        else
                        {
                           AV133Cant1 = DecimalUtil.doubleToDec(0) ;
                           AV134Cant2 = DecimalUtil.doubleToDec(0) ;
                           if ( AV132NumeroT > 0 )
                           {
                              AV133Cant1 = A2133RecPasGK ;
                              AV134Cant2 = AV137RestoP.multiply(AV99Cantidad).divide(AV45KilPas, 18, java.math.RoundingMode.DOWN) ;
                              AV133Cant1 = GXutil.roundDecimal( AV133Cant1.multiply(DecimalUtil.doubleToDec(100)), 1) ;
                              AV134Cant2 = GXutil.roundDecimal( AV134Cant2.multiply(DecimalUtil.doubleToDec(1000)), 1) ;
                           }
                           hYW0( false, 18) ;
                           getPrinter().GxAttris("Constantia", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2133RecPasGK, "ZZZZZ9.999")), 23, Gx_line+0, 97, Gx_line+16, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2107PasCod, "")), 115, Gx_line+0, 191, Gx_line+16, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2108PasDsc, "")), 169, Gx_line+0, 360, Gx_line+16, 0+256, 0, 0, 0) ;
                           getPrinter().GxAttris("Constantia", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV104Cantidad1, "ZZZ,ZZ9.999")), 389, Gx_line+0, 472, Gx_line+17, 2, 0, 0, 0) ;
                           getPrinter().GxAttris("Constantia", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV133Cant1, "ZZZZZZZZ.Z")), 507, Gx_line+0, 581, Gx_line+16, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV134Cant2, "ZZZZZZZZ.Z")), 694, Gx_line+0, 768, Gx_line+16, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawLine(497, Gx_line+0, 497, Gx_line+18, 1, 0, 0, 0, 0) ;
                           getPrinter().GxDrawLine(636, Gx_line+0, 636, Gx_line+18, 1, 0, 0, 0, 0) ;
                           getPrinter().GxDrawLine(821, Gx_line+0, 821, Gx_line+18, 1, 0, 0, 0, 0) ;
                           Gx_OldLine = Gx_line ;
                           Gx_line = (int)(Gx_line+18) ;
                        }
                     }
                     else
                     {
                        AV104Cantidad1 = A2132RecPasCan.multiply(DecimalUtil.doubleToDec(AV102DivUni)) ;
                        if ( AV120Er == 1 )
                        {
                        }
                        else
                        {
                           if ( AV141Piolera == 1 )
                           {
                              AV101Und = httpContext.getMessage( "kg", "") ;
                           }
                           hYW0( false, 17) ;
                           getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2133RecPasGK, "ZZZZZ9.999")), 23, Gx_line+0, 97, Gx_line+17, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2107PasCod, "")), 115, Gx_line+0, 185, Gx_line+17, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2108PasDsc, "")), 169, Gx_line+0, 305, Gx_line+17, 0+256, 0, 0, 0) ;
                           getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText("........", 549, Gx_line+0, 617, Gx_line+18, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(".....", 511, Gx_line+0, 553, Gx_line+17, 0, 0, 0, 0) ;
                           getPrinter().GxDrawText("........", 755, Gx_line+0, 823, Gx_line+18, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText("........", 689, Gx_line+0, 757, Gx_line+18, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText("........", 622, Gx_line+0, 690, Gx_line+18, 0+256, 0, 0, 0) ;
                           getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV101Und, "")), 466, Gx_line+0, 501, Gx_line+17, 0+256, 0, 0, 0) ;
                           getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV104Cantidad1, "ZZZ,ZZ9.999")), 378, Gx_line+0, 461, Gx_line+17, 2, 0, 0, 0) ;
                           Gx_OldLine = Gx_line ;
                           Gx_line = (int)(Gx_line+17) ;
                        }
                     }
                     AV32Contador = (byte)(AV32Contador+1) ;
                  }
                  pr_default.readNext(9);
               }
               pr_default.close(9);
               AV135Text1 = " " ;
               AV136text2 = " " ;
               if ( ( AV132NumeroT > 0 ) && ( AV120Er == 1 ) )
               {
                  AV135Text1 = GXutil.trim( GXutil.str( AV132NumeroT, 2, 0)) + " x " + GXutil.trim( GXutil.str( AV130CapTacho, 3, 0)) ;
                  AV136text2 = GXutil.trim( GXutil.str( AV137RestoP, 10, 3)) ;
               }
               if ( GXutil.strcmp(A2128RecMolRep, httpContext.getMessage( "N", "")) == 0 )
               {
                  AV48RecEst100 = GXutil.roundDecimal( AV45KilPas.divide(A1541BarComMtr, 18, java.math.RoundingMode.DOWN).divide(DecimalUtil.doubleToDec(AV102DivUni), 18, java.math.RoundingMode.DOWN).multiply(DecimalUtil.doubleToDec(100)), 2) ;
                  if ( AV120Er == 0 )
                  {
                     if ( AV141Piolera == 1 )
                     {
                        AV101Und = httpContext.getMessage( "kg", "") ;
                     }
                     hYW0( false, 17) ;
                     getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV45KilPas, "ZZZ,ZZ9.999")), 378, Gx_line+0, 461, Gx_line+17, 2, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV48RecEst100, "ZZZZZ9.99")), 583, Gx_line+0, 671, Gx_line+17, 2, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "( x100m", ""), 518, Gx_line+0, 579, Gx_line+17, 0, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "kg )", ""), 676, Gx_line+0, 707, Gx_line+17, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV71Lit31, "")), 170, Gx_line+0, 366, Gx_line+16, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV101Und, "")), 466, Gx_line+1, 501, Gx_line+18, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+17) ;
                  }
                  else
                  {
                     AV139Comp14 = AV45KilPas.subtract(AV122TotPrd) ;
                     hYW0( false, 18) ;
                     getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Complemento 14:", ""), 170, Gx_line+1, 280, Gx_line+18, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Constantia", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV139Comp14, "ZZZ,ZZ9.999")), 392, Gx_line+0, 473, Gx_line+16, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawLine(497, Gx_line+0, 497, Gx_line+18, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(636, Gx_line+0, 636, Gx_line+18, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(821, Gx_line+0, 821, Gx_line+18, 1, 0, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+18) ;
                     hYW0( false, 18) ;
                     getPrinter().GxAttris("Constantia", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV135Text1, "")), 505, Gx_line+0, 615, Gx_line+16, 1+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV136text2, "")), 675, Gx_line+0, 785, Gx_line+16, 1+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV71Lit31, "")), 170, Gx_line+0, 366, Gx_line+16, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV45KilPas, "ZZZ,ZZ9.999")), 378, Gx_line+0, 461, Gx_line+17, 2, 0, 0, 0) ;
                     getPrinter().GxDrawLine(497, Gx_line+0, 497, Gx_line+18, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(636, Gx_line+0, 636, Gx_line+18, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(821, Gx_line+0, 821, Gx_line+18, 1, 0, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+18) ;
                  }
               }
               else
               {
                  if ( GXutil.strcmp(A5103RecMolCns, httpContext.getMessage( "S", "")) == 0 )
                  {
                     AV48RecEst100 = GXutil.roundDecimal( AV45KilPas.divide(A5102RecMolMtr, 18, java.math.RoundingMode.DOWN).divide(DecimalUtil.doubleToDec(AV102DivUni), 18, java.math.RoundingMode.DOWN).multiply(DecimalUtil.doubleToDec(100)), 2) ;
                     hYW0( false, 17) ;
                     getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV71Lit31, "")), 170, Gx_line+0, 366, Gx_line+16, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV45KilPas, "ZZZ,ZZ9.999")), 389, Gx_line+0, 472, Gx_line+17, 2, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV48RecEst100, "ZZZZZ9.99")), 583, Gx_line+0, 671, Gx_line+17, 2, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "( x100mts", ""), 518, Gx_line+0, 579, Gx_line+17, 0, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "kgs )", ""), 676, Gx_line+0, 707, Gx_line+17, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV101Und, "")), 477, Gx_line+0, 512, Gx_line+17, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+17) ;
                  }
               }
               hYW0( false, 3) ;
               getPrinter().GxDrawLine(22, Gx_line+0, 822, Gx_line+0, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+3) ;
               pr_default.readNext(3);
            }
            pr_default.close(3);
            GxHdr7 = false ;
            AV21Flag = (byte)(0) ;
            /* Using cursor P00YW12 */
            pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
            while ( (pr_default.getStatus(10) != 101) )
            {
               A377DisObsTxt = P00YW12_A377DisObsTxt[0] ;
               A376DisObsLin = P00YW12_A376DisObsLin[0] ;
               if ( (0==AV21Flag) )
               {
                  hYW0( false, 17) ;
                  getPrinter().GxAttris("Constantia", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A377DisObsTxt, "")), 169, Gx_line+0, 608, Gx_line+16, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+17) ;
                  AV21Flag = (byte)(1) ;
               }
               else
               {
                  hYW0( false, 17) ;
                  getPrinter().GxAttris("Constantia", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A377DisObsTxt, "")), 169, Gx_line+0, 608, Gx_line+16, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+17) ;
               }
               pr_default.readNext(10);
            }
            pr_default.close(10);
            /* Execute user subroutine: 'OBSDIB' */
            S131 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
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
            /* Execute user subroutine: 'OBSFOR' */
            S151 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
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
            hYW0( false, 4) ;
            getPrinter().GxDrawLine(22, Gx_line+0, 822, Gx_line+0, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+4) ;
            if ( AV141Piolera == 0 )
            {
               /* Eject command */
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(P_lines+1) ;
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         GxHdr3 = false ;
         if ( AV141Piolera == 1 )
         {
            AV147i = (short)(1) ;
            while ( AV147i <= 100 )
            {
               if ( GXutil.strcmp(AV144tab_prd[AV147i-1], " ") == 0 )
               {
                  if (true) break;
               }
               if ( AV147i == 1 )
               {
                  hYW0( false, 18) ;
                  getPrinter().GxAttris("Arial", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "RESUMEN:", ""), 36, Gx_line+0, 120, Gx_line+19, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+18) ;
               }
               AV150Prdnum = AV144tab_prd[AV147i-1] ;
               GXv_char7[0] = A396EmprCod ;
               GXv_char4[0] = AV150Prdnum ;
               GXv_char1[0] = AV153Prdnom ;
               new app.pprddsc(remoteHandle, context).execute( GXv_char7, GXv_char4, GXv_char1) ;
               pedires.this.A396EmprCod = GXv_char7[0] ;
               pedires.this.AV150Prdnum = GXv_char4[0] ;
               pedires.this.AV153Prdnom = GXv_char1[0] ;
               AV151Cnt = AV145tab_cnt[AV147i-1] ;
               AV101Und = httpContext.getMessage( "g", "") ;
               hYW0( false, 18) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV153Prdnom, "")), 36, Gx_line+0, 227, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV151Cnt, "ZZZZZ9.999")), 325, Gx_line+0, 399, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV101Und, "")), 408, Gx_line+0, 431, Gx_line+17, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+18) ;
               AV147i = (short)(AV147i+1) ;
            }
            AV153Prdnom = httpContext.getMessage( "Total Pasta", "") ;
            AV151Cnt = AV149TotPasta ;
            AV101Und = httpContext.getMessage( "kg", "") ;
            hYW0( false, 18) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV153Prdnom, "")), 36, Gx_line+0, 227, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV151Cnt, "ZZZZZ9.999")), 325, Gx_line+0, 399, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV101Und, "")), 408, Gx_line+0, 431, Gx_line+17, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+18) ;
            AV153Prdnom = httpContext.getMessage( "Total Cobertura", "") ;
            AV151Cnt = AV154TotCob ;
            AV101Und = "%" ;
            hYW0( false, 18) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV153Prdnom, "")), 36, Gx_line+0, 227, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV151Cnt, "ZZZZZ9.999")), 325, Gx_line+0, 399, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV101Und, "")), 408, Gx_line+0, 431, Gx_line+17, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+18) ;
            hYW0( false, 40) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("_____________________", 28, Gx_line+0, 182, Gx_line+14, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Gerente de Produccion", ""), 36, Gx_line+21, 173, Gx_line+35, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText("_________________________", 214, Gx_line+0, 368, Gx_line+14, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Jefe de Planta", ""), 247, Gx_line+21, 333, Gx_line+35, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText("_________________________", 399, Gx_line+0, 553, Gx_line+14, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Jefe de Estampacion", ""), 414, Gx_line+21, 538, Gx_line+35, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText("_________________________", 583, Gx_line+0, 737, Gx_line+14, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cocina de Colores", ""), 606, Gx_line+21, 714, Gx_line+35, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+40) ;
         }
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         hYW0( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'INIT' Routine */
      returnInSub = false ;
      GXt_char6 = AV16Lit0 ;
      GXv_char7[0] = GXt_char6 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char7) ;
      pedires.this.GXt_char6 = GXv_char7[0] ;
      AV16Lit0 = GXt_char6 ;
      GXt_char6 = AV17Lit1 ;
      GXv_char7[0] = GXt_char6 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT666_", ""), (byte)(99), GXv_char7) ;
      pedires.this.GXt_char6 = GXv_char7[0] ;
      GXt_char13 = AV17Lit1 ;
      GXv_char4[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT102_", ""), (byte)(99), GXv_char4) ;
      pedires.this.GXt_char13 = GXv_char4[0] ;
      AV17Lit1 = GXutil.trim( GXt_char6) + " " + GXutil.trim( GXt_char13) ;
      GXt_char13 = AV18Lit2 ;
      GXv_char7[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char7) ;
      pedires.this.GXt_char13 = GXv_char7[0] ;
      AV18Lit2 = GXt_char13 ;
      GXt_char13 = AV19Lit3 ;
      GXv_char7[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN275_", ""), (byte)(99), GXv_char7) ;
      pedires.this.GXt_char13 = GXv_char7[0] ;
      AV19Lit3 = GXt_char13 ;
      GXt_char13 = AV50Lit4 ;
      GXv_char7[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT105_", ""), (byte)(99), GXv_char7) ;
      pedires.this.GXt_char13 = GXv_char7[0] ;
      AV50Lit4 = GXutil.trim( GXt_char13) ;
      GXt_char13 = AV58Lit5 ;
      GXv_char7[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN432_", ""), (byte)(99), GXv_char7) ;
      pedires.this.GXt_char13 = GXv_char7[0] ;
      AV58Lit5 = GXutil.trim( AV16Lit0) + " " + GXutil.trim( GXt_char13) ;
      GXt_char13 = AV66Lit6 ;
      GXv_char7[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT102_", ""), (byte)(99), GXv_char7) ;
      pedires.this.GXt_char13 = GXv_char7[0] ;
      AV66Lit6 = GXutil.trim( AV16Lit0) + " " + GXutil.trim( GXt_char13) ;
      GXt_char13 = AV59Lit7 ;
      GXv_char7[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char7) ;
      pedires.this.GXt_char13 = GXv_char7[0] ;
      AV59Lit7 = GXutil.trim( GXt_char13) + " " + GXutil.trim( AV50Lit4) ;
      GXt_char13 = AV51Lit8 ;
      GXv_char7[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN073_", ""), (byte)(99), GXv_char7) ;
      pedires.this.GXt_char13 = GXv_char7[0] ;
      AV51Lit8 = GXt_char13 ;
      GXt_char13 = AV52Lit9 ;
      GXv_char7[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN074_", ""), (byte)(99), GXv_char7) ;
      pedires.this.GXt_char13 = GXv_char7[0] ;
      AV52Lit9 = GXt_char13 ;
      GXt_char13 = AV55Lit10 ;
      GXv_char7[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1023_", ""), (byte)(99), GXv_char7) ;
      pedires.this.GXt_char13 = GXv_char7[0] ;
      AV55Lit10 = GXt_char13 ;
      GXt_char13 = AV62Lit11 ;
      GXv_char7[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN146_", ""), (byte)(99), GXv_char7) ;
      pedires.this.GXt_char13 = GXv_char7[0] ;
      AV62Lit11 = GXt_char13 ;
      GXt_char13 = AV63Lit12 ;
      GXv_char7[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT92_", ""), (byte)(99), GXv_char7) ;
      pedires.this.GXt_char13 = GXv_char7[0] ;
      AV63Lit12 = GXt_char13 ;
      GXt_char13 = AV64Lit13 ;
      GXv_char7[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT103_", ""), (byte)(99), GXv_char7) ;
      pedires.this.GXt_char13 = GXv_char7[0] ;
      AV64Lit13 = GXt_char13 ;
      GXt_char13 = AV65Lit14 ;
      GXv_char7[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT104_", ""), (byte)(99), GXv_char7) ;
      pedires.this.GXt_char13 = GXv_char7[0] ;
      AV65Lit14 = GXt_char13 ;
      GXt_char13 = AV53Lit15 ;
      GXv_char7[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1096_", ""), (byte)(99), GXv_char7) ;
      pedires.this.GXt_char13 = GXv_char7[0] ;
      AV53Lit15 = GXt_char13 ;
      GXt_char13 = AV56Lit16 ;
      GXv_char7[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1195_", ""), (byte)(99), GXv_char7) ;
      pedires.this.GXt_char13 = GXv_char7[0] ;
      AV56Lit16 = GXt_char13 ;
      GXt_char13 = AV67Lit18 ;
      GXv_char7[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN116_", ""), (byte)(99), GXv_char7) ;
      pedires.this.GXt_char13 = GXv_char7[0] ;
      AV67Lit18 = GXt_char13 ;
      GXt_char13 = AV54Lit19 ;
      GXv_char7[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1052_", ""), (byte)(99), GXv_char7) ;
      pedires.this.GXt_char13 = GXv_char7[0] ;
      AV54Lit19 = GXt_char13 ;
      GXt_char13 = AV57Lit20 ;
      GXv_char7[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1180_", ""), (byte)(99), GXv_char7) ;
      pedires.this.GXt_char13 = GXv_char7[0] ;
      AV57Lit20 = GXt_char13 ;
      GXt_char13 = AV73Lit21 ;
      GXv_char7[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT668_", ""), (byte)(99), GXv_char7) ;
      pedires.this.GXt_char13 = GXv_char7[0] ;
      AV73Lit21 = GXt_char13 ;
      GXt_char13 = AV78Lit22 ;
      GXv_char7[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT664_", ""), (byte)(99), GXv_char7) ;
      pedires.this.GXt_char13 = GXv_char7[0] ;
      AV78Lit22 = GXt_char13 ;
      GXt_char13 = AV69Lit25 ;
      GXv_char7[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN121_", ""), (byte)(99), GXv_char7) ;
      pedires.this.GXt_char13 = GXv_char7[0] ;
      AV69Lit25 = GXt_char13 ;
      GXt_char13 = AV70Lit26 ;
      GXv_char7[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1544_", ""), (byte)(99), GXv_char7) ;
      pedires.this.GXt_char13 = GXv_char7[0] ;
      AV70Lit26 = GXt_char13 ;
      GXt_char13 = AV74Lit27 ;
      GXv_char7[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN352_", ""), (byte)(99), GXv_char7) ;
      pedires.this.GXt_char13 = GXv_char7[0] ;
      AV74Lit27 = GXt_char13 ;
      AV75Lit28 = httpContext.getMessage( "Preparado", "") ;
      AV76Lit29 = httpContext.getMessage( "Sobrante", "") ;
      GXt_char13 = AV77Lit30 ;
      GXv_char7[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN450_", ""), (byte)(99), GXv_char7) ;
      pedires.this.GXt_char13 = GXv_char7[0] ;
      AV77Lit30 = GXt_char13 ;
      GXt_char13 = AV71Lit31 ;
      GXv_char7[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN723_", ""), (byte)(99), GXv_char7) ;
      pedires.this.GXt_char13 = GXv_char7[0] ;
      AV71Lit31 = GXutil.trim( GXt_char13) + " " + GXutil.trim( AV78Lit22) + httpContext.getMessage( " a Preparar", "") ;
      GXt_char13 = AV72Lit32 ;
      GXv_char7[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1288_", ""), (byte)(99), GXv_char7) ;
      pedires.this.GXt_char13 = GXv_char7[0] ;
      AV72Lit32 = GXutil.trim( GXt_char13) ;
      GXt_char13 = AV61Lit33 ;
      GXv_char7[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1211_", ""), (byte)(99), GXv_char7) ;
      pedires.this.GXt_char13 = GXv_char7[0] ;
      AV61Lit33 = GXutil.trim( GXt_char13) ;
      GXt_int14 = AV44TinEst ;
      GXv_int3[0] = GXt_int14 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TINEST", ""), GXv_int3) ;
      pedires.this.GXt_int14 = GXv_int3[0] ;
      AV44TinEst = GXt_int14 ;
      GXt_int14 = AV46CmpKil ;
      GXv_int3[0] = GXt_int14 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CMPKIL", ""), GXv_int3) ;
      pedires.this.GXt_int14 = GXv_int3[0] ;
      AV46CmpKil = GXt_int14 ;
      GXt_int14 = AV79FlagBar ;
      GXv_int3[0] = GXt_int14 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, "100007", GXv_int3) ;
      pedires.this.GXt_int14 = GXv_int3[0] ;
      AV79FlagBar = GXt_int14 ;
      GXt_int14 = (byte)(DecimalUtil.decToDouble(AV88Artextil)) ;
      GXv_int3[0] = GXt_int14 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ARTEXT", ""), GXv_int3) ;
      pedires.this.GXt_int14 = GXv_int3[0] ;
      AV88Artextil = DecimalUtil.doubleToDec(GXt_int14) ;
      GXt_int14 = AV112Lindalana ;
      GXv_int3[0] = GXt_int14 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "LINDAL", ""), GXv_int3) ;
      pedires.this.GXt_int14 = GXv_int3[0] ;
      AV112Lindalana = GXt_int14 ;
      GXt_int14 = AV98Eliot ;
      GXv_int3[0] = GXt_int14 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ELIOT", ""), GXv_int3) ;
      pedires.this.GXt_int14 = GXv_int3[0] ;
      AV98Eliot = GXt_int14 ;
      GXt_int15 = AV100Kgs_m ;
      GXv_int2[0] = GXt_int15 ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "KGSMAD", ""), GXv_int2) ;
      pedires.this.GXt_int15 = GXv_int2[0] ;
      AV100Kgs_m = (short)(GXt_int15) ;
      GXt_int15 = AV102DivUni ;
      GXv_int2[0] = GXt_int15 ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "DIVUNI", ""), GXv_int2) ;
      pedires.this.GXt_int15 = GXv_int2[0] ;
      AV102DivUni = (short)(GXt_int15) ;
      GXt_int14 = AV120Er ;
      GXv_int3[0] = GXt_int14 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "EROTAT", ""), GXv_int3) ;
      pedires.this.GXt_int14 = GXv_int3[0] ;
      AV120Er = GXt_int14 ;
      GXt_int14 = AV121UnKgm ;
      GXv_int3[0] = GXt_int14 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "KGCOLO", ""), GXv_int3) ;
      pedires.this.GXt_int14 = GXv_int3[0] ;
      AV121UnKgm = GXt_int14 ;
      GXt_int14 = AV141Piolera ;
      GXv_int3[0] = GXt_int14 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PIOLER", ""), GXv_int3) ;
      pedires.this.GXt_int14 = GXv_int3[0] ;
      AV141Piolera = GXt_int14 ;
      GXt_char13 = AV155FecPiolera ;
      GXv_char7[0] = A396EmprCod ;
      GXv_char4[0] = httpContext.getMessage( "PIOLER", "") ;
      GXv_char1[0] = GXt_char13 ;
      new app.pbusdsc(remoteHandle, context).execute( GXv_char7, GXv_char4, GXv_char1) ;
      pedires.this.A396EmprCod = GXv_char7[0] ;
      pedires.this.GXt_char13 = GXv_char1[0] ;
      AV155FecPiolera = GXt_char13 ;
      GXt_int14 = AV158Stamperia ;
      GXv_int3[0] = GXt_int14 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "STAMPE", ""), GXv_int3) ;
      pedires.this.GXt_int14 = GXv_int3[0] ;
      AV158Stamperia = GXt_int14 ;
      if ( AV102DivUni == 0 )
      {
         AV102DivUni = (short)(1) ;
      }
      if ( AV98Eliot == 1 )
      {
         AV101Und = httpContext.getMessage( "Gr.", "") ;
      }
      /* Using cursor P00YW13 */
      pr_default.execute(11, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(11) != 101) )
      {
         A407EmprNom = P00YW13_A407EmprNom[0] ;
         n407EmprNom = P00YW13_n407EmprNom[0] ;
         AV20NomEmp = A407EmprNom ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(11);
      if ( ! (0==AV79FlagBar) )
      {
         AV80Ceros8 = "00000000" ;
         AV81HdrAlfa = GXutil.str( A129BarCod, 8, 0) ;
         AV81HdrAlfa = GXutil.ltrim( GXutil.rtrim( AV81HdrAlfa)) ;
         AV83LenVar = (byte)(GXutil.len( AV81HdrAlfa)) ;
         AV83LenVar = (byte)(8-AV83LenVar) ;
         AV81HdrAlfa = GXutil.substring( AV80Ceros8, 1, AV83LenVar) + AV81HdrAlfa ;
         if ( GXutil.strcmp(A130BarCodPar, " ") == 0 )
         {
            AV82HojRut = "*" + AV81HdrAlfa + GXutil.str( A132BarCodReo, 1, 0) + "*" ;
         }
         else
         {
            AV82HojRut = "*" + AV81HdrAlfa + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + "*" ;
         }
      }
      AV93AlbRLoc = "" ;
      /* Using cursor P00YW14 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(12) != 101) )
      {
         brkYW17 = false ;
         A44AlbRecCod = P00YW14_A44AlbRecCod[0] ;
         A200BarPieCod = P00YW14_A200BarPieCod[0] ;
         A50AlbRLoc = P00YW14_A50AlbRLoc[0] ;
         A50AlbRLoc = P00YW14_A50AlbRLoc[0] ;
         while ( (pr_default.getStatus(12) != 101) && ( GXutil.strcmp(P00YW14_A396EmprCod[0], A396EmprCod) == 0 ) && ( P00YW14_A129BarCod[0] == A129BarCod ) && ( P00YW14_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(P00YW14_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            if ( ! ( ( P00YW14_A44AlbRecCod[0] == A44AlbRecCod ) ) )
            {
               if (true) break;
            }
            brkYW17 = false ;
            A200BarPieCod = P00YW14_A200BarPieCod[0] ;
            brkYW17 = true ;
            pr_default.readNext(12);
         }
         AV93AlbRLoc += ((GXutil.strcmp(AV93AlbRLoc, "")==0) ? "" : ", ") ;
         AV93AlbRLoc += A50AlbRLoc ;
         if ( ! brkYW17 )
         {
            brkYW17 = true ;
            pr_default.readNext(12);
         }
      }
      pr_default.close(12);
      AV130CapTacho = (short)(100) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'OBSDIB' Routine */
      returnInSub = false ;
      AV23Flag2 = (byte)(0) ;
      /* Using cursor P00YW15 */
      pr_default.execute(13, new Object[] {A396EmprCod, AV25BarDibCli, Integer.valueOf(AV24CliCod), Integer.valueOf(AV26BarDibInt)});
      while ( (pr_default.getStatus(13) != 101) )
      {
         A1014DibInt = P00YW15_A1014DibInt[0] ;
         n1014DibInt = P00YW15_n1014DibInt[0] ;
         A252CliCod = P00YW15_A252CliCod[0] ;
         n252CliCod = P00YW15_n252CliCod[0] ;
         A1013DibCli = P00YW15_A1013DibCli[0] ;
         n1013DibCli = P00YW15_n1013DibCli[0] ;
         A1020DibObs = P00YW15_A1020DibObs[0] ;
         n1020DibObs = P00YW15_n1020DibObs[0] ;
         A1609DibObs2 = P00YW15_A1609DibObs2[0] ;
         n1609DibObs2 = P00YW15_n1609DibObs2[0] ;
         /* Using cursor P00YW16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt)});
         while ( (pr_default.getStatus(14) != 101) )
         {
            A2522DibObsTxt = P00YW16_A2522DibObsTxt[0] ;
            n2522DibObsTxt = P00YW16_n2522DibObsTxt[0] ;
            A2521DibObsLin = P00YW16_A2521DibObsLin[0] ;
            if ( (0==AV21Flag) && (0==AV23Flag2) )
            {
               hYW0( false, 17) ;
               getPrinter().GxAttris("Constantia", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2522DibObsTxt, "")), 169, Gx_line+0, 608, Gx_line+16, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV72Lit32, "")), 36, Gx_line+0, 153, Gx_line+17, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               AV23Flag2 = (byte)(1) ;
            }
            else
            {
               hYW0( false, 17) ;
               getPrinter().GxAttris("Constantia", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2522DibObsTxt, "")), 169, Gx_line+0, 608, Gx_line+16, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
            }
            pr_default.readNext(14);
         }
         pr_default.close(14);
         if ( ! (GXutil.strcmp("", A1020DibObs)==0) )
         {
            if ( (0==AV21Flag) && (0==AV23Flag2) )
            {
               hYW0( false, 17) ;
               getPrinter().GxAttris("Constantia", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1020DibObs, "")), 169, Gx_line+0, 462, Gx_line+16, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV72Lit32, "")), 36, Gx_line+0, 153, Gx_line+17, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               AV23Flag2 = (byte)(1) ;
            }
            else
            {
               hYW0( false, 17) ;
               getPrinter().GxAttris("Constantia", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1020DibObs, "")), 169, Gx_line+0, 462, Gx_line+16, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
            }
         }
         if ( ! (GXutil.strcmp("", A1609DibObs2)==0) )
         {
            hYW0( false, 17) ;
            getPrinter().GxAttris("Constantia", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1609DibObs2, "")), 169, Gx_line+0, 462, Gx_line+16, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+17) ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(13);
   }

   public void S141( ) throws ProcessInterruptedException
   {
      /* 'PESMAX' Routine */
      returnInSub = false ;
      AV30MolPesMax = DecimalUtil.ZERO ;
      /* Using cursor P00YW17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(AV24CliCod), AV38Serie, AV25BarDibCli, Integer.valueOf(AV26BarDibInt), AV28ColCom, AV29ColFon, Byte.valueOf(AV37MolCod)});
      while ( (pr_default.getStatus(15) != 101) )
      {
         A8052Dg_codigo = P00YW17_A8052Dg_codigo[0] ;
         n8052Dg_codigo = P00YW17_n8052Dg_codigo[0] ;
         A2098MolCod = P00YW17_A2098MolCod[0] ;
         A2078ColFon = P00YW17_A2078ColFon[0] ;
         A2074ColCom = P00YW17_A2074ColCom[0] ;
         A1014DibInt = P00YW17_A1014DibInt[0] ;
         n1014DibInt = P00YW17_n1014DibInt[0] ;
         A1013DibCli = P00YW17_A1013DibCli[0] ;
         n1013DibCli = P00YW17_n1013DibCli[0] ;
         A2141SerEst = P00YW17_A2141SerEst[0] ;
         A252CliCod = P00YW17_A252CliCod[0] ;
         n252CliCod = P00YW17_n252CliCod[0] ;
         A2649MolPesMax = P00YW17_A2649MolPesMax[0] ;
         n2649MolPesMax = P00YW17_n2649MolPesMax[0] ;
         A8053Dg_Desc = P00YW17_A8053Dg_Desc[0] ;
         n8053Dg_Desc = P00YW17_n8053Dg_Desc[0] ;
         A4420MolCol = P00YW17_A4420MolCol[0] ;
         n4420MolCol = P00YW17_n4420MolCol[0] ;
         A8054Dg_Degr = P00YW17_A8054Dg_Degr[0] ;
         n8054Dg_Degr = P00YW17_n8054Dg_Degr[0] ;
         A8053Dg_Desc = P00YW17_A8053Dg_Desc[0] ;
         n8053Dg_Desc = P00YW17_n8053Dg_Desc[0] ;
         A8054Dg_Degr = P00YW17_A8054Dg_Degr[0] ;
         n8054Dg_Degr = P00YW17_n8054Dg_Degr[0] ;
         if ( A8054Dg_Degr == 0 )
         {
            A8055Dg_Valor = (short)(1) ;
         }
         else
         {
            if ( ( A8054Dg_Degr >= 1 ) && ( A8054Dg_Degr <= 9 ) )
            {
               A8055Dg_Valor = (short)(A8054Dg_Degr+1) ;
            }
            else
            {
               if ( A8054Dg_Degr > 9 )
               {
                  A8055Dg_Valor = A8054Dg_Degr ;
               }
               else
               {
                  A8055Dg_Valor = (short)(0) ;
               }
            }
         }
         AV30MolPesMax = A2649MolPesMax ;
         AV105Dg_Desc = A8053Dg_Desc ;
         AV106Dg_valor = A8055Dg_Valor ;
         AV90MolCol = A4420MolCol ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(15);
   }

   public void S151( ) throws ProcessInterruptedException
   {
      /* 'OBSFOR' Routine */
      returnInSub = false ;
      /* Using cursor P00YW18 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(AV24CliCod), AV38Serie, AV25BarDibCli, Integer.valueOf(AV26BarDibInt), AV28ColCom, AV29ColFon, Byte.valueOf(AV37MolCod)});
      while ( (pr_default.getStatus(16) != 101) )
      {
         A2078ColFon = P00YW18_A2078ColFon[0] ;
         A2074ColCom = P00YW18_A2074ColCom[0] ;
         A1014DibInt = P00YW18_A1014DibInt[0] ;
         n1014DibInt = P00YW18_n1014DibInt[0] ;
         A1013DibCli = P00YW18_A1013DibCli[0] ;
         n1013DibCli = P00YW18_n1013DibCli[0] ;
         A2141SerEst = P00YW18_A2141SerEst[0] ;
         A252CliCod = P00YW18_A252CliCod[0] ;
         n252CliCod = P00YW18_n252CliCod[0] ;
         A2098MolCod = P00YW18_A2098MolCod[0] ;
         /* Using cursor P00YW19 */
         pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A2141SerEst, Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon});
         while ( (pr_default.getStatus(17) != 101) )
         {
            A2096ForObsTxt = P00YW19_A2096ForObsTxt[0] ;
            n2096ForObsTxt = P00YW19_n2096ForObsTxt[0] ;
            A2095ForObsLin = P00YW19_A2095ForObsLin[0] ;
            if ( (0==AV21Flag) && (0==AV23Flag2) )
            {
               hYW0( false, 17) ;
               getPrinter().GxAttris("Constantia", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2096ForObsTxt, "")), 169, Gx_line+0, 462, Gx_line+16, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV72Lit32, "")), 36, Gx_line+0, 153, Gx_line+17, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               AV23Flag2 = (byte)(1) ;
            }
            else
            {
               hYW0( false, 17) ;
               getPrinter().GxAttris("Constantia", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2096ForObsTxt, "")), 169, Gx_line+0, 462, Gx_line+16, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
            }
            pr_default.readNext(17);
         }
         pr_default.close(17);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(16);
   }

   public void S161( ) throws ProcessInterruptedException
   {
      /* 'DIBUJM' Routine */
      returnInSub = false ;
      AV97Orden_ = " " ;
      /* Using cursor P00YW20 */
      pr_default.execute(18, new Object[] {A396EmprCod, AV25BarDibCli, Integer.valueOf(AV24CliCod), Integer.valueOf(AV26BarDibInt), Byte.valueOf(AV37MolCod)});
      while ( (pr_default.getStatus(18) != 101) )
      {
         A1013DibCli = P00YW20_A1013DibCli[0] ;
         n1013DibCli = P00YW20_n1013DibCli[0] ;
         A252CliCod = P00YW20_A252CliCod[0] ;
         n252CliCod = P00YW20_n252CliCod[0] ;
         A1014DibInt = P00YW20_A1014DibInt[0] ;
         n1014DibInt = P00YW20_n1014DibInt[0] ;
         A2088DibDibMol = P00YW20_A2088DibDibMol[0] ;
         n2088DibDibMol = P00YW20_n2088DibDibMol[0] ;
         A6840DibLinMal = P00YW20_A6840DibLinMal[0] ;
         n6840DibLinMal = P00YW20_n6840DibLinMal[0] ;
         A1809DibOrdMol = P00YW20_A1809DibOrdMol[0] ;
         n1809DibOrdMol = P00YW20_n1809DibOrdMol[0] ;
         A1029DibLin = P00YW20_A1029DibLin[0] ;
         AV129TipoMalha = A6840DibLinMal ;
         AV96DibOrdmol = A1809DibOrdMol ;
         AV97Orden_ = GXutil.trim( GXutil.str( A1809DibOrdMol, 2, 0)) ;
         pr_default.readNext(18);
      }
      pr_default.close(18);
      if ( AV88Artextil.doubleValue() == 1 )
      {
         /* Using cursor P00YW21 */
         pr_default.execute(19, new Object[] {A396EmprCod, AV25BarDibCli, Integer.valueOf(AV26BarDibInt), Byte.valueOf(AV96DibOrdmol)});
         while ( (pr_default.getStatus(19) != 101) )
         {
            A7041ShaDibCli = P00YW21_A7041ShaDibCli[0] ;
            A7042ShaDibInt = P00YW21_A7042ShaDibInt[0] ;
            A7043ShaOrd = P00YW21_A7043ShaOrd[0] ;
            n7043ShaOrd = P00YW21_n7043ShaOrd[0] ;
            A7032ShaMal = P00YW21_A7032ShaMal[0] ;
            n7032ShaMal = P00YW21_n7032ShaMal[0] ;
            A7031ShaCod = P00YW21_A7031ShaCod[0] ;
            AV129TipoMalha = ((GXutil.strcmp("", AV129TipoMalha)==0) ? A7032ShaMal : AV129TipoMalha) ;
            pr_default.readNext(19);
         }
         pr_default.close(19);
      }
   }

   public void S171( ) throws ProcessInterruptedException
   {
      /* 'DIBUJC' Routine */
      returnInSub = false ;
      AV125DibDm = (byte)(0) ;
      AV126DibPres = " " ;
      AV157ShaMal = "" ;
      /* Using cursor P00YW22 */
      pr_default.execute(20, new Object[] {A396EmprCod, AV25BarDibCli, Integer.valueOf(AV24CliCod), Integer.valueOf(AV26BarDibInt), Byte.valueOf(AV37MolCod)});
      while ( (pr_default.getStatus(20) != 101) )
      {
         A1807DibLinCil = P00YW22_A1807DibLinCil[0] ;
         A1014DibInt = P00YW22_A1014DibInt[0] ;
         n1014DibInt = P00YW22_n1014DibInt[0] ;
         A252CliCod = P00YW22_A252CliCod[0] ;
         n252CliCod = P00YW22_n252CliCod[0] ;
         A1013DibCli = P00YW22_A1013DibCli[0] ;
         n1013DibCli = P00YW22_n1013DibCli[0] ;
         A10771DibDm = P00YW22_A10771DibDm[0] ;
         n10771DibDm = P00YW22_n10771DibDm[0] ;
         A10772DibPres = P00YW22_A10772DibPres[0] ;
         n10772DibPres = P00YW22_n10772DibPres[0] ;
         A7027DibLinMalC = P00YW22_A7027DibLinMalC[0] ;
         n7027DibLinMalC = P00YW22_n7027DibLinMalC[0] ;
         A1808DibOrdCil = P00YW22_A1808DibOrdCil[0] ;
         n1808DibOrdCil = P00YW22_n1808DibOrdCil[0] ;
         AV125DibDm = A10771DibDm ;
         AV126DibPres = A10772DibPres ;
         AV129TipoMalha = A7027DibLinMalC ;
         AV156DibOrdCil = A1808DibOrdCil ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(20);
      if ( AV88Artextil.doubleValue() == 1 )
      {
         /* Using cursor P00YW23 */
         pr_default.execute(21, new Object[] {A396EmprCod, AV25BarDibCli, Integer.valueOf(AV26BarDibInt), Byte.valueOf(AV156DibOrdCil)});
         while ( (pr_default.getStatus(21) != 101) )
         {
            A7041ShaDibCli = P00YW23_A7041ShaDibCli[0] ;
            A7042ShaDibInt = P00YW23_A7042ShaDibInt[0] ;
            A7043ShaOrd = P00YW23_A7043ShaOrd[0] ;
            n7043ShaOrd = P00YW23_n7043ShaOrd[0] ;
            A7032ShaMal = P00YW23_A7032ShaMal[0] ;
            n7032ShaMal = P00YW23_n7032ShaMal[0] ;
            A7031ShaCod = P00YW23_A7031ShaCod[0] ;
            AV129TipoMalha = ((GXutil.strcmp("", AV129TipoMalha)==0) ? A7032ShaMal : AV129TipoMalha) ;
            pr_default.readNext(21);
         }
         pr_default.close(21);
      }
   }

   public void S116( ) throws ProcessInterruptedException
   {
      /* 'BARAGR' Routine */
      returnInSub = false ;
      hYW0( false, 35) ;
      getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Agrupacion de HDRs:", ""), 36, Gx_line+0, 177, Gx_line+17, 0+256, 0, 0, 0) ;
      getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19Lit3, "")), 36, Gx_line+17, 119, Gx_line+32, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(36, Gx_line+32, 138, Gx_line+32, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV63Lit12, "")), 250, Gx_line+17, 323, Gx_line+33, 2, 0, 0, 0) ;
      getPrinter().GxDrawLine(234, Gx_line+32, 323, Gx_line+32, 1, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+35) ;
      /* Using cursor P00YW24 */
      pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(AV109barCod), Byte.valueOf(AV110BarCodreo), AV111Barcodpar});
      while ( (pr_default.getStatus(22) != 101) )
      {
         A869MtrAgr = P00YW24_A869MtrAgr[0] ;
         A122BarAgrPar = P00YW24_A122BarAgrPar[0] ;
         A124BarAgrReo = P00YW24_A124BarAgrReo[0] ;
         A119BarAgrCod = P00YW24_A119BarAgrCod[0] ;
         hYW0( false, 18) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A119BarAgrCod), "ZZZZZZZ9")), 36, Gx_line+1, 104, Gx_line+19, 2+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A124BarAgrReo), "9")), 113, Gx_line+1, 121, Gx_line+19, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A122BarAgrPar, "")), 125, Gx_line+1, 140, Gx_line+19, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A869MtrAgr, "ZZZZZ9.99")), 257, Gx_line+0, 324, Gx_line+18, 2+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+18) ;
         pr_default.readNext(22);
      }
      pr_default.close(22);
      hYW0( false, 7) ;
      getPrinter().GxDrawLine(22, Gx_line+4, 822, Gx_line+4, 1, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+7) ;
   }

   public void S181( ) throws ProcessInterruptedException
   {
      /* 'ARTLIN' Routine */
      returnInSub = false ;
      AV115Art_AncA = (short)(0) ;
      /* Using cursor P00YW25 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(AV24CliCod), AV38Serie, AV114Procod});
      while ( (pr_default.getStatus(23) != 101) )
      {
         A758ProCod = P00YW25_A758ProCod[0] ;
         A65ArtCod = P00YW25_A65ArtCod[0] ;
         A252CliCod = P00YW25_A252CliCod[0] ;
         n252CliCod = P00YW25_n252CliCod[0] ;
         A8066Art_AncA = P00YW25_A8066Art_AncA[0] ;
         n8066Art_AncA = P00YW25_n8066Art_AncA[0] ;
         AV115Art_AncA = A8066Art_AncA ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(23);
   }

   public void S191( ) throws ProcessInterruptedException
   {
      /* 'DEGRA' Routine */
      returnInSub = false ;
      /* Using cursor P00YW26 */
      pr_default.execute(24, new Object[] {A396EmprCod, Short.valueOf(AV117RecMolDgC)});
      while ( (pr_default.getStatus(24) != 101) )
      {
         A8052Dg_codigo = P00YW26_A8052Dg_codigo[0] ;
         n8052Dg_codigo = P00YW26_n8052Dg_codigo[0] ;
         A8053Dg_Desc = P00YW26_A8053Dg_Desc[0] ;
         n8053Dg_Desc = P00YW26_n8053Dg_Desc[0] ;
         A8054Dg_Degr = P00YW26_A8054Dg_Degr[0] ;
         n8054Dg_Degr = P00YW26_n8054Dg_Degr[0] ;
         if ( A8054Dg_Degr == 0 )
         {
            A8055Dg_Valor = (short)(1) ;
         }
         else
         {
            if ( ( A8054Dg_Degr >= 1 ) && ( A8054Dg_Degr <= 9 ) )
            {
               A8055Dg_Valor = (short)(A8054Dg_Degr+1) ;
            }
            else
            {
               if ( A8054Dg_Degr > 9 )
               {
                  A8055Dg_Valor = A8054Dg_Degr ;
               }
               else
               {
                  A8055Dg_Valor = (short)(0) ;
               }
            }
         }
         AV105Dg_Desc = A8053Dg_Desc ;
         AV106Dg_valor = A8055Dg_Valor ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(24);
   }

   public void S201( ) throws ProcessInterruptedException
   {
      /* 'CDIBUJ' Routine */
      returnInSub = false ;
      AV119DibGraNum = " " ;
      /* Using cursor P00YW27 */
      pr_default.execute(25, new Object[] {A396EmprCod, AV25BarDibCli, Integer.valueOf(AV24CliCod), Integer.valueOf(AV26BarDibInt)});
      while ( (pr_default.getStatus(25) != 101) )
      {
         A1014DibInt = P00YW27_A1014DibInt[0] ;
         n1014DibInt = P00YW27_n1014DibInt[0] ;
         A1013DibCli = P00YW27_A1013DibCli[0] ;
         n1013DibCli = P00YW27_n1013DibCli[0] ;
         A252CliCod = P00YW27_A252CliCod[0] ;
         n252CliCod = P00YW27_n252CliCod[0] ;
         A1880DibGraNum = P00YW27_A1880DibGraNum[0] ;
         n1880DibGraNum = P00YW27_n1880DibGraNum[0] ;
         AV119DibGraNum = A1880DibGraNum ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(25);
   }

   public void S211( ) throws ProcessInterruptedException
   {
      /* 'MAQUIN' Routine */
      returnInSub = false ;
      /* Using cursor P00YW28 */
      pr_default.execute(26, new Object[] {A396EmprCod, AV124Maqcod});
      while ( (pr_default.getStatus(26) != 101) )
      {
         A602MaqCod = P00YW28_A602MaqCod[0] ;
         A606MaqDsc = P00YW28_A606MaqDsc[0] ;
         n606MaqDsc = P00YW28_n606MaqDsc[0] ;
         AV123MaqDsc = A606MaqDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(26);
   }

   public void S221( ) throws ProcessInterruptedException
   {
      /* 'RESUMEN' Routine */
      returnInSub = false ;
      AV147i = (short)(1) ;
      AV152ALta = (byte)(1) ;
      while ( AV147i <= 100 )
      {
         if ( GXutil.strcmp(AV144tab_prd[AV147i-1], "") == 0 )
         {
            if (true) break;
         }
         if ( GXutil.strcmp(AV150Prdnum, AV144tab_prd[AV147i-1]) == 0 )
         {
            AV145tab_cnt[AV147i-1] = AV145tab_cnt[AV147i-1].add(AV151Cnt) ;
            AV152ALta = (byte)(0) ;
         }
         AV147i = (short)(AV147i+1) ;
      }
      if ( AV152ALta == 1 )
      {
         AV145tab_cnt[AV148j-1] = AV151Cnt ;
         AV144tab_prd[AV148j-1] = AV150Prdnum ;
         AV148j = (short)(AV148j+1) ;
      }
   }

   public void hYW0( boolean bFoot ,
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
            if ( AV141Piolera == 1 )
            {
               getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "d8cbdd29-f1e4-48b9-806a-d2305f7dbc67", "", context.getHttpContext().getTheme( )), 47, Gx_line+19, 249, Gx_line+107) ;
               getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Sistema de Gestión de la Calidad SCG 9001:2015", ""), 257, Gx_line+21, 643, Gx_line+41, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "REG TIN 005", ""), 400, Gx_line+48, 501, Gx_line+68, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Recetas de Estampado", ""), 340, Gx_line+74, 524, Gx_line+94, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(28, Gx_line+7, 801, Gx_line+116, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(650, Gx_line+7, 650, Gx_line+116, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Version V1", ""), 683, Gx_line+50, 754, Gx_line+67, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(254, Gx_line+7, 254, Gx_line+116, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV155FecPiolera, "")), 688, Gx_line+76, 752, Gx_line+94, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+117) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 24, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV82HojRut, "")), 336, Gx_line+17, 512, Gx_line+57, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "LOTE:", ""), 36, Gx_line+19, 88, Gx_line+39, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV143BarEnccli, "")), 95, Gx_line+19, 263, Gx_line+40, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+55) ;
            }
            if ( ! (0==AV79FlagBar) )
            {
               if ( AV141Piolera == 0 )
               {
                  getPrinter().GxAttris("Microsoft Sans Serif", 24, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV82HojRut, "")), 293, Gx_line+7, 469, Gx_line+47, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+39) ;
               }
            }
            getPrinter().GxAttris("Constantia", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20NomEmp, "")), 251, Gx_line+11, 471, Gx_line+27, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(22, Gx_line+4, 801, Gx_line+4, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(22, Gx_line+34, 801, Gx_line+34, 2, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18Lit2, "")), 659, Gx_line+14, 711, Gx_line+28, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Constantia", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 723, Gx_line+13, 768, Gx_line+29, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV16Lit0, "")), 544, Gx_line+14, 580, Gx_line+29, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(":", 584, Gx_line+13, 588, Gx_line+29, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(":", 714, Gx_line+13, 718, Gx_line+29, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Constantia", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 594, Gx_line+13, 649, Gx_line+29, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17Lit1, "")), 32, Gx_line+11, 220, Gx_line+28, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+40) ;
            if ( GxHdr3 )
            {
               if ( GXutil.strcmp(A2122RecEstTMaq, httpContext.getMessage( "P", "")) == 0 )
               {
                  GXt_char13 = AV60Lit17 ;
                  GXv_char7[0] = GXt_char13 ;
                  new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT99_", ""), (byte)(99), GXv_char7) ;
                  pedires.this.GXt_char13 = GXv_char7[0] ;
                  AV60Lit17 = GXt_char13 ;
               }
               else
               {
                  GXt_char13 = AV60Lit17 ;
                  GXv_char7[0] = GXt_char13 ;
                  new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT100_", ""), (byte)(99), GXv_char7) ;
                  pedires.this.GXt_char13 = GXv_char7[0] ;
                  AV60Lit17 = GXt_char13 ;
               }
               if ( AV88Artextil.doubleValue() == 0 )
               {
                  if ( AV112Lindalana == 0 )
                  {
                     if ( AV120Er == 0 )
                     {
                        if ( AV141Piolera == 1 )
                        {
                           AV50Lit4 = "" ;
                           AV142BarDisnum = "" ;
                        }
                        getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), 136, Gx_line+0, 207, Gx_line+17, 2, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")), 216, Gx_line+0, 224, Gx_line+17, 2, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A130BarCodPar, "")), 232, Gx_line+0, 247, Gx_line+18, 0+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(localUtil.format( A159BarFecGen, "99/99/99"), 447, Gx_line+0, 498, Gx_line+17, 0+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV142BarDisnum, "")), 136, Gx_line+18, 245, Gx_line+36, 0+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(localUtil.format( A155BarFecCli, "99/99/99"), 447, Gx_line+18, 498, Gx_line+35, 0+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(localUtil.format( A2070BarFecEst, "99/99/99"), 656, Gx_line+18, 723, Gx_line+35, 0, 0, 0, 0) ;
                        getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 136, Gx_line+41, 181, Gx_line+59, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 201, Gx_line+41, 390, Gx_line+59, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A212BarSer, "")), 136, Gx_line+58, 237, Gx_line+76, 0+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A1541BarComMtr, "ZZZZZ9.99")), 554, Gx_line+60, 642, Gx_line+77, 2, 0, 0, 0) ;
                        getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1798BarDibCli, "")), 136, Gx_line+100, 237, Gx_line+118, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1799BarDibInt), "ZZZZZZZ9")), 391, Gx_line+100, 450, Gx_line+118, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2073BarNumMol), "ZZZ9")), 592, Gx_line+100, 622, Gx_line+118, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2122RecEstTMaq, "")), 727, Gx_line+100, 742, Gx_line+118, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1056DisComCod, "")), 136, Gx_line+119, 212, Gx_line+137, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1032FonCod, "")), 391, Gx_line+119, 467, Gx_line+137, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawLine(22, Gx_line+157, 822, Gx_line+157, 1, 0, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV116Barancaca1), "ZZ9")), 390, Gx_line+58, 413, Gx_line+76, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2524DisComLin), "Z9")), 606, Gx_line+119, 622, Gx_line+137, 2+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19Lit3, "")), 36, Gx_line+0, 119, Gx_line+15, 0, 0, 0, 0) ;
                        getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(":", 124, Gx_line+0, 128, Gx_line+15, 0+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50Lit4, "")), 36, Gx_line+19, 119, Gx_line+34, 0, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51Lit8, "")), 36, Gx_line+41, 119, Gx_line+57, 0, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52Lit9, "")), 36, Gx_line+60, 119, Gx_line+75, 0, 0, 0, 0) ;
                        getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(":", 124, Gx_line+42, 128, Gx_line+57, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(":", 124, Gx_line+60, 128, Gx_line+75, 0+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53Lit15, "")), 36, Gx_line+100, 119, Gx_line+116, 0, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV54Lit19, "")), 36, Gx_line+119, 119, Gx_line+135, 0, 0, 0, 0) ;
                        getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(":", 124, Gx_line+101, 128, Gx_line+116, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(":", 124, Gx_line+120, 128, Gx_line+135, 0+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55Lit10, "")), 316, Gx_line+59, 365, Gx_line+74, 0, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV56Lit16, "")), 316, Gx_line+100, 364, Gx_line+116, 0, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57Lit20, "")), 316, Gx_line+119, 364, Gx_line+135, 0, 0, 0, 0) ;
                        getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(":", 373, Gx_line+120, 377, Gx_line+135, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(":", 373, Gx_line+101, 377, Gx_line+116, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(":", 373, Gx_line+59, 377, Gx_line+74, 0+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV58Lit5, "")), 316, Gx_line+1, 432, Gx_line+16, 0, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV59Lit7, "")), 316, Gx_line+19, 432, Gx_line+34, 0, 0, 0, 0) ;
                        getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(":", 433, Gx_line+1, 437, Gx_line+16, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(":", 433, Gx_line+19, 437, Gx_line+34, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(":", 577, Gx_line+101, 581, Gx_line+116, 0+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV60Lit17, "")), 502, Gx_line+100, 569, Gx_line+116, 2, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV61Lit33, "")), 547, Gx_line+119, 569, Gx_line+135, 0, 0, 0, 0) ;
                        getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(":", 577, Gx_line+120, 581, Gx_line+135, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawRect(447, Gx_line+39, 805, Gx_line+82, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                        getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV64Lit13, "")), 656, Gx_line+42, 729, Gx_line+58, 2, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV65Lit14, "")), 733, Gx_line+42, 801, Gx_line+57, 2, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV66Lit6, "")), 628, Gx_line+0, 751, Gx_line+15, 0, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV67Lit18, "")), 663, Gx_line+100, 714, Gx_line+116, 0, 0, 0, 0) ;
                        getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(":", 720, Gx_line+101, 724, Gx_line+116, 0+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57Lit20, "")), 666, Gx_line+119, 714, Gx_line+135, 0, 0, 0, 0) ;
                        getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(":", 720, Gx_line+120, 724, Gx_line+135, 0+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1032FonCod, "")), 727, Gx_line+119, 803, Gx_line+137, 0+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Microsoft Sans Serif", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(httpContext.getMessage( "Maquina", ""), 456, Gx_line+140, 515, Gx_line+156, 0+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(":", 518, Gx_line+141, 522, Gx_line+156, 0+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A8313CodMaqEst, "")), 531, Gx_line+140, 613, Gx_line+158, 0+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Microsoft Sans Serif", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A8312BarMaqPor), "ZZ9")), 780, Gx_line+140, 806, Gx_line+157, 2+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Microsoft Sans Serif", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText("%", 806, Gx_line+140, 820, Gx_line+156, 0+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(":", 124, Gx_line+141, 128, Gx_line+156, 0+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Microsoft Sans Serif", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(httpContext.getMessage( "Colorista", ""), 36, Gx_line+140, 96, Gx_line+156, 0+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A8420OpeREst), "ZZZZZ9")), 136, Gx_line+140, 181, Gx_line+158, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV107OpeNom, "")), 189, Gx_line+140, 378, Gx_line+158, 0+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Microsoft Sans Serif", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(httpContext.getMessage( "Metros", ""), 577, Gx_line+42, 624, Gx_line+58, 0+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV108RecTotMtr, "ZZZZZZZ.ZZ")), 467, Gx_line+60, 541, Gx_line+78, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawLine(648, Gx_line+39, 648, Gx_line+82, 1, 0, 0, 0, 0) ;
                        getPrinter().GxDrawLine(550, Gx_line+39, 550, Gx_line+81, 1, 0, 0, 0, 0) ;
                        getPrinter().GxDrawLine(731, Gx_line+39, 731, Gx_line+82, 1, 0, 0, 0, 0) ;
                        getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV123MaqDsc, "")), 617, Gx_line+140, 718, Gx_line+157, 0+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Microsoft Sans Serif", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(httpContext.getMessage( "Mts Agrupados", ""), 458, Gx_line+42, 558, Gx_line+58, 0+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), 136, Gx_line+75, 300, Gx_line+93, 0+256, 0, 0, 0) ;
                        Gx_OldLine = Gx_line ;
                        Gx_line = (int)(Gx_line+167) ;
                     }
                     else
                     {
                        getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19Lit3, "")), 39, Gx_line+0, 122, Gx_line+15, 0, 0, 0, 0) ;
                        getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(":", 126, Gx_line+0, 130, Gx_line+15, 0+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), 139, Gx_line+0, 210, Gx_line+17, 2, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")), 218, Gx_line+0, 226, Gx_line+17, 2, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A130BarCodPar, "")), 234, Gx_line+0, 249, Gx_line+18, 0+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV58Lit5, "")), 318, Gx_line+1, 434, Gx_line+16, 0, 0, 0, 0) ;
                        getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(":", 435, Gx_line+1, 439, Gx_line+16, 0+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Constantia", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(localUtil.format( A159BarFecGen, "99/99/99"), 449, Gx_line+0, 504, Gx_line+16, 0+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV66Lit6, "")), 605, Gx_line+0, 728, Gx_line+15, 0, 0, 0, 0) ;
                        getPrinter().GxAttris("Constantia", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(localUtil.format( A2070BarFecEst, "99/99/99"), 747, Gx_line+0, 814, Gx_line+17, 0, 0, 0, 0) ;
                        getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(":", 730, Gx_line+0, 734, Gx_line+15, 0+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51Lit8, "")), 39, Gx_line+33, 122, Gx_line+49, 0, 0, 0, 0) ;
                        getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(":", 126, Gx_line+34, 130, Gx_line+49, 0+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Constantia", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 139, Gx_line+33, 184, Gx_line+49, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 203, Gx_line+33, 423, Gx_line+49, 0+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV63Lit12, "")), 577, Gx_line+29, 650, Gx_line+45, 1, 0, 0, 0) ;
                        getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A1541BarComMtr, "ZZZZZ9.99")), 570, Gx_line+49, 658, Gx_line+66, 2, 0, 0, 0) ;
                        getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52Lit9, "")), 39, Gx_line+52, 122, Gx_line+67, 0, 0, 0, 0) ;
                        getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(":", 126, Gx_line+52, 130, Gx_line+67, 0+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Constantia", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A212BarSer, "")), 139, Gx_line+50, 257, Gx_line+66, 0+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55Lit10, "")), 318, Gx_line+51, 367, Gx_line+66, 0, 0, 0, 0) ;
                        getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(":", 375, Gx_line+51, 379, Gx_line+66, 0+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Constantia", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV116Barancaca1), "ZZ9")), 392, Gx_line+50, 415, Gx_line+66, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawRect(546, Gx_line+23, 680, Gx_line+74, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                        getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53Lit15, "")), 39, Gx_line+83, 122, Gx_line+99, 0, 0, 0, 0) ;
                        getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(":", 126, Gx_line+84, 130, Gx_line+99, 0+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1798BarDibCli, "")), 139, Gx_line+81, 273, Gx_line+102, 0+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV56Lit16, "")), 318, Gx_line+83, 366, Gx_line+99, 0, 0, 0, 0) ;
                        getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(":", 375, Gx_line+84, 379, Gx_line+99, 0+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1799BarDibInt), "ZZZZZZZ9")), 393, Gx_line+83, 452, Gx_line+101, 2+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV60Lit17, "")), 480, Gx_line+83, 547, Gx_line+99, 2, 0, 0, 0) ;
                        getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(":", 555, Gx_line+84, 559, Gx_line+99, 0+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2073BarNumMol), "ZZZ9")), 570, Gx_line+83, 600, Gx_line+101, 2+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Microsoft Sans Serif", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(httpContext.getMessage( "Maquina", ""), 640, Gx_line+83, 699, Gx_line+99, 0+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV123MaqDsc, "")), 704, Gx_line+83, 805, Gx_line+100, 0+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV54Lit19, "")), 39, Gx_line+100, 122, Gx_line+116, 0, 0, 0, 0) ;
                        getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(":", 125, Gx_line+101, 129, Gx_line+116, 0+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1056DisComCod, "")), 138, Gx_line+100, 214, Gx_line+118, 0+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57Lit20, "")), 317, Gx_line+100, 365, Gx_line+116, 0, 0, 0, 0) ;
                        getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(":", 374, Gx_line+101, 378, Gx_line+116, 0+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1032FonCod, "")), 392, Gx_line+98, 493, Gx_line+119, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawLine(22, Gx_line+132, 822, Gx_line+132, 1, 0, 0, 0, 0) ;
                        Gx_OldLine = Gx_line ;
                        Gx_line = (int)(Gx_line+133) ;
                     }
                  }
                  else
                  {
                     getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), 136, Gx_line+0, 207, Gx_line+17, 2, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")), 216, Gx_line+0, 224, Gx_line+17, 2, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A130BarCodPar, "")), 232, Gx_line+0, 247, Gx_line+18, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Constantia", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(localUtil.format( A159BarFecGen, "99/99/99"), 447, Gx_line+0, 502, Gx_line+16, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A143BarDisNum, "")), 136, Gx_line+18, 237, Gx_line+34, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(localUtil.format( A155BarFecCli, "99/99/99"), 447, Gx_line+18, 502, Gx_line+34, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Constantia", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(localUtil.format( A2070BarFecEst, "99/99/99"), 656, Gx_line+18, 723, Gx_line+35, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Constantia", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 136, Gx_line+41, 181, Gx_line+57, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 201, Gx_line+41, 421, Gx_line+57, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A212BarSer, "")), 136, Gx_line+58, 254, Gx_line+74, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A1541BarComMtr, "ZZZZZ9.99")), 554, Gx_line+60, 642, Gx_line+77, 2, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1798BarDibCli, "")), 136, Gx_line+83, 237, Gx_line+101, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1799BarDibInt), "ZZZZZZZ9")), 391, Gx_line+83, 450, Gx_line+101, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2073BarNumMol), "ZZZ9")), 592, Gx_line+83, 622, Gx_line+101, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2122RecEstTMaq, "")), 727, Gx_line+83, 742, Gx_line+101, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1056DisComCod, "")), 136, Gx_line+122, 212, Gx_line+140, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1032FonCod, "")), 391, Gx_line+122, 467, Gx_line+140, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawLine(22, Gx_line+184, 822, Gx_line+184, 1, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Constantia", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A125BarAncAca1), "ZZ9")), 390, Gx_line+58, 413, Gx_line+74, 2+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2524DisComLin), "Z9")), 606, Gx_line+122, 622, Gx_line+140, 2+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19Lit3, "")), 36, Gx_line+0, 119, Gx_line+15, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(":", 124, Gx_line+0, 128, Gx_line+15, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50Lit4, "")), 36, Gx_line+19, 119, Gx_line+34, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(":", 124, Gx_line+19, 128, Gx_line+34, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51Lit8, "")), 36, Gx_line+41, 119, Gx_line+57, 0, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52Lit9, "")), 36, Gx_line+60, 119, Gx_line+75, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(":", 124, Gx_line+42, 128, Gx_line+57, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(":", 124, Gx_line+60, 128, Gx_line+75, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53Lit15, "")), 36, Gx_line+83, 119, Gx_line+99, 0, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV54Lit19, "")), 36, Gx_line+122, 119, Gx_line+138, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(":", 124, Gx_line+84, 128, Gx_line+99, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(":", 124, Gx_line+123, 128, Gx_line+138, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55Lit10, "")), 316, Gx_line+59, 365, Gx_line+74, 0, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV56Lit16, "")), 316, Gx_line+83, 364, Gx_line+99, 0, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57Lit20, "")), 316, Gx_line+122, 364, Gx_line+138, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(":", 373, Gx_line+123, 377, Gx_line+138, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(":", 373, Gx_line+84, 377, Gx_line+99, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(":", 373, Gx_line+59, 377, Gx_line+74, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV59Lit7, "")), 316, Gx_line+19, 432, Gx_line+34, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(":", 433, Gx_line+1, 437, Gx_line+16, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(":", 433, Gx_line+19, 437, Gx_line+34, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(":", 577, Gx_line+84, 581, Gx_line+99, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV60Lit17, "")), 502, Gx_line+83, 569, Gx_line+99, 2, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV61Lit33, "")), 547, Gx_line+122, 569, Gx_line+138, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(":", 577, Gx_line+123, 581, Gx_line+138, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawRect(447, Gx_line+39, 805, Gx_line+82, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV63Lit12, "")), 569, Gx_line+42, 642, Gx_line+58, 2, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV64Lit13, "")), 656, Gx_line+42, 729, Gx_line+58, 2, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV65Lit14, "")), 733, Gx_line+42, 801, Gx_line+57, 2, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV66Lit6, "")), 628, Gx_line+0, 751, Gx_line+15, 0, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV67Lit18, "")), 663, Gx_line+83, 714, Gx_line+99, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(":", 720, Gx_line+84, 724, Gx_line+99, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57Lit20, "")), 666, Gx_line+122, 714, Gx_line+138, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(":", 720, Gx_line+123, 724, Gx_line+138, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1032FonCod, "")), 727, Gx_line+122, 803, Gx_line+140, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Microsoft Sans Serif", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Maquina", ""), 516, Gx_line+165, 575, Gx_line+181, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(":", 577, Gx_line+166, 581, Gx_line+181, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A8313CodMaqEst, "")), 591, Gx_line+165, 673, Gx_line+183, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Microsoft Sans Serif", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A8312BarMaqPor), "ZZ9")), 685, Gx_line+165, 711, Gx_line+182, 2+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Microsoft Sans Serif", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText("%", 711, Gx_line+165, 725, Gx_line+181, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Mts Agrupados", ""), 454, Gx_line+42, 554, Gx_line+58, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV108RecTotMtr, "ZZZZZZZ.ZZ")), 471, Gx_line+60, 545, Gx_line+78, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawLine(648, Gx_line+39, 648, Gx_line+82, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(548, Gx_line+40, 548, Gx_line+82, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(731, Gx_line+39, 731, Gx_line+82, 1, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV58Lit5, "")), 316, Gx_line+1, 432, Gx_line+16, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV107OpeNom, "")), 189, Gx_line+166, 378, Gx_line+184, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A8420OpeREst), "ZZZZZ9")), 136, Gx_line+166, 181, Gx_line+184, 2+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Microsoft Sans Serif", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Colorista", ""), 36, Gx_line+166, 96, Gx_line+182, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(":", 124, Gx_line+167, 128, Gx_line+182, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A6841DibDsc, "")), 136, Gx_line+103, 325, Gx_line+121, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), 391, Gx_line+103, 555, Gx_line+121, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV119DibGraNum, "")), 136, Gx_line+143, 200, Gx_line+161, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Microsoft Sans Serif", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Referencia", ""), 36, Gx_line+143, 110, Gx_line+159, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(":", 124, Gx_line+144, 128, Gx_line+159, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+188) ;
                  }
                  if ( GXutil.strcmp(A120BarAgrEst, httpContext.getMessage( "S", "")) == 0 )
                  {
                     /* Execute user subroutine: 'BARAGR' */
                     S116 ();
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
               else
               {
                  if ( A3307DisManCod1 == 0 )
                  {
                     AV94Estampa = httpContext.getMessage( "No especificado", "") ;
                  }
                  else
                  {
                     if ( A3307DisManCod1 == 1 )
                     {
                        AV94Estampa = httpContext.getMessage( "Colorido s/Muestra", "") ;
                     }
                     else
                     {
                        AV94Estampa = httpContext.getMessage( "Colorido p/Codigo", "") ;
                     }
                  }
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")), 216, Gx_line+0, 224, Gx_line+17, 2, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A130BarCodPar, "")), 232, Gx_line+0, 247, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Constantia", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(localUtil.format( A159BarFecGen, "99/99/99"), 410, Gx_line+0, 465, Gx_line+16, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A143BarDisNum, "")), 136, Gx_line+18, 237, Gx_line+34, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(localUtil.format( A155BarFecCli, "99/99/99"), 410, Gx_line+18, 465, Gx_line+34, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Constantia", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(localUtil.format( A2070BarFecEst, "99/99/99"), 606, Gx_line+0, 673, Gx_line+17, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Constantia", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 136, Gx_line+41, 181, Gx_line+57, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Constantia", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 201, Gx_line+41, 442, Gx_line+58, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Constantia", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A212BarSer, "")), 136, Gx_line+58, 254, Gx_line+74, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A1541BarComMtr, "ZZZZZ9.99")), 556, Gx_line+18, 623, Gx_line+34, 2, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1798BarDibCli, "")), 136, Gx_line+83, 269, Gx_line+100, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1799BarDibInt), "ZZZZZZZ9")), 354, Gx_line+83, 413, Gx_line+101, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2073BarNumMol), "ZZZ9")), 510, Gx_line+83, 540, Gx_line+101, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2122RecEstTMaq, "")), 517, Gx_line+58, 532, Gx_line+76, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1056DisComCod, "")), 136, Gx_line+118, 269, Gx_line+135, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1032FonCod, "")), 354, Gx_line+118, 430, Gx_line+136, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(22, Gx_line+135, 822, Gx_line+135, 1, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Constantia", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A125BarAncAca1), "ZZ9")), 353, Gx_line+58, 376, Gx_line+74, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2524DisComLin), "Z9")), 525, Gx_line+118, 541, Gx_line+136, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19Lit3, "")), 36, Gx_line+0, 119, Gx_line+15, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(":", 124, Gx_line+0, 128, Gx_line+15, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50Lit4, "")), 36, Gx_line+19, 119, Gx_line+34, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(":", 124, Gx_line+19, 128, Gx_line+34, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51Lit8, "")), 36, Gx_line+41, 119, Gx_line+57, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52Lit9, "")), 36, Gx_line+60, 119, Gx_line+75, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(":", 124, Gx_line+42, 128, Gx_line+57, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(":", 124, Gx_line+60, 128, Gx_line+75, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53Lit15, "")), 36, Gx_line+83, 119, Gx_line+99, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV54Lit19, "")), 36, Gx_line+118, 119, Gx_line+134, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(":", 124, Gx_line+84, 128, Gx_line+99, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(":", 124, Gx_line+119, 128, Gx_line+134, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55Lit10, "")), 279, Gx_line+59, 328, Gx_line+74, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV56Lit16, "")), 279, Gx_line+83, 327, Gx_line+99, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57Lit20, "")), 279, Gx_line+118, 327, Gx_line+134, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(":", 336, Gx_line+119, 340, Gx_line+134, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(":", 336, Gx_line+84, 340, Gx_line+99, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(":", 336, Gx_line+59, 340, Gx_line+74, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV58Lit5, "")), 279, Gx_line+1, 395, Gx_line+16, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV59Lit7, "")), 279, Gx_line+19, 395, Gx_line+34, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(":", 397, Gx_line+1, 401, Gx_line+16, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(":", 397, Gx_line+19, 401, Gx_line+34, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(":", 496, Gx_line+84, 500, Gx_line+99, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV60Lit17, "")), 421, Gx_line+83, 488, Gx_line+99, 2, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV61Lit33, "")), 466, Gx_line+118, 488, Gx_line+134, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(":", 495, Gx_line+119, 499, Gx_line+134, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV63Lit12, "")), 480, Gx_line+18, 553, Gx_line+34, 2, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV66Lit6, "")), 480, Gx_line+0, 603, Gx_line+15, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV67Lit18, "")), 452, Gx_line+58, 503, Gx_line+74, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(":", 509, Gx_line+59, 513, Gx_line+74, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), 136, Gx_line+0, 207, Gx_line+17, 2, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV62Lit11, "")), 626, Gx_line+18, 673, Gx_line+34, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1431BarLocDis, "")), 556, Gx_line+83, 620, Gx_line+101, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Local.", ""), 556, Gx_line+58, 598, Gx_line+75, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A6841DibDsc, "")), 136, Gx_line+100, 386, Gx_line+117, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV93AlbRLoc, "")), 634, Gx_line+82, 823, Gx_line+100, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Loc. Crudo", ""), 634, Gx_line+57, 707, Gx_line+74, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Estampa :", ""), 559, Gx_line+117, 625, Gx_line+134, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV94Estampa, "")), 634, Gx_line+117, 748, Gx_line+135, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Vendedor :", ""), 451, Gx_line+39, 524, Gx_line+56, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1360ZonGeoNom, "")), 529, Gx_line+39, 718, Gx_line+57, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+142) ;
                  GXt_char13 = AV91ColBmp ;
                  GXv_char7[0] = A396EmprCod ;
                  GXv_int2[0] = A252CliCod ;
                  GXv_char4[0] = A212BarSer ;
                  GXv_char1[0] = A1798BarDibCli ;
                  GXv_int16[0] = A1799BarDibInt ;
                  GXv_char17[0] = A1056DisComCod ;
                  GXv_char18[0] = A1032FonCod ;
                  GXv_char19[0] = GXt_char13 ;
                  new app.rcolbmp(remoteHandle, context).execute( GXv_char7, GXv_int2, GXv_char4, GXv_char1, GXv_int16, GXv_char17, GXv_char18, GXv_char19) ;
                  pedires.this.A396EmprCod = GXv_char7[0] ;
                  pedires.this.A252CliCod = GXv_int2[0] ;
                  pedires.this.A212BarSer = GXv_char4[0] ;
                  pedires.this.A1798BarDibCli = GXv_char1[0] ;
                  pedires.this.A1799BarDibInt = GXv_int16[0] ;
                  pedires.this.A1056DisComCod = GXv_char17[0] ;
                  pedires.this.A1032FonCod = GXv_char18[0] ;
                  pedires.this.GXt_char13 = GXv_char19[0] ;
                  AV91ColBmp = GXt_char13 ;
               }
            }
            if ( GxHdr7 )
            {
               if ( AV120Er == 0 )
               {
                  getPrinter().GxDrawLine(22, Gx_line+19, 801, Gx_line+19, 1, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV69Lit25, "")), 115, Gx_line+3, 179, Gx_line+19, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70Lit26, "")), 397, Gx_line+3, 472, Gx_line+19, 2, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV73Lit21, "")), 40, Gx_line+3, 107, Gx_line+19, 2, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV75Lit28, "")), 623, Gx_line+3, 686, Gx_line+19, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV74Lit27, "")), 507, Gx_line+3, 562, Gx_line+19, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV77Lit30, "")), 745, Gx_line+3, 801, Gx_line+19, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV76Lit29, "")), 689, Gx_line+3, 743, Gx_line+19, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+23) ;
               }
               else
               {
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV73Lit21, "")), 40, Gx_line+3, 107, Gx_line+19, 2, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV69Lit25, "")), 115, Gx_line+3, 179, Gx_line+19, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70Lit26, "")), 397, Gx_line+3, 472, Gx_line+19, 2, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Cantidad x ", ""), 505, Gx_line+3, 582, Gx_line+20, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Constantia", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV130CapTacho), "ZZ9")), 580, Gx_line+3, 603, Gx_line+19, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Cantidad Resto", ""), 680, Gx_line+3, 781, Gx_line+20, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(497, Gx_line+0, 497, Gx_line+21, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(636, Gx_line+0, 636, Gx_line+21, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(821, Gx_line+0, 821, Gx_line+21, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(22, Gx_line+20, 822, Gx_line+20, 1, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+22) ;
               }
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
      this.aP0[0] = pedires.this.A396EmprCod;
      this.aP1[0] = pedires.this.A129BarCod;
      this.aP2[0] = pedires.this.A132BarCodReo;
      this.aP3[0] = pedires.this.A130BarCodPar;
      this.aP4[0] = pedires.this.A2524DisComLin;
      this.aP5[0] = pedires.this.A1056DisComCod;
      this.aP6[0] = pedires.this.A1032FonCod;
      this.aP7[0] = pedires.this.Gx_out;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV144tab_prd = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV144tab_prd[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV145tab_cnt = new java.math.BigDecimal[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV145tab_cnt[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV146tab_cntp = new java.math.BigDecimal[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV146tab_cntp[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      scmdbuf = "" ;
      P00YW2_A858ZonGeoCod = new short[1] ;
      P00YW2_A361DisCod = new int[1] ;
      P00YW2_A1013DibCli = new String[] {""} ;
      P00YW2_n1013DibCli = new boolean[] {false} ;
      P00YW2_A1014DibInt = new int[1] ;
      P00YW2_n1014DibInt = new boolean[] {false} ;
      P00YW2_A396EmprCod = new String[] {""} ;
      P00YW2_A129BarCod = new int[1] ;
      P00YW2_A132BarCodReo = new byte[1] ;
      P00YW2_A130BarCodPar = new String[] {""} ;
      P00YW2_A2524DisComLin = new byte[1] ;
      P00YW2_A1056DisComCod = new String[] {""} ;
      P00YW2_A1032FonCod = new String[] {""} ;
      P00YW2_A2122RecEstTMaq = new String[] {""} ;
      P00YW2_n2122RecEstTMaq = new boolean[] {false} ;
      P00YW2_A252CliCod = new int[1] ;
      P00YW2_n252CliCod = new boolean[] {false} ;
      P00YW2_A212BarSer = new String[] {""} ;
      P00YW2_A1798BarDibCli = new String[] {""} ;
      P00YW2_A1799BarDibInt = new int[1] ;
      P00YW2_A1541BarComMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YW2_n1541BarComMtr = new boolean[] {false} ;
      P00YW2_A8420OpeREst = new int[1] ;
      P00YW2_n8420OpeREst = new boolean[] {false} ;
      P00YW2_A4812BarEncCli = new String[] {""} ;
      P00YW2_A1652BarSerDsc = new String[] {""} ;
      P00YW2_A8312BarMaqPor = new short[1] ;
      P00YW2_n8312BarMaqPor = new boolean[] {false} ;
      P00YW2_A8313CodMaqEst = new String[] {""} ;
      P00YW2_n8313CodMaqEst = new boolean[] {false} ;
      P00YW2_A2073BarNumMol = new short[1] ;
      P00YW2_n2073BarNumMol = new boolean[] {false} ;
      P00YW2_A279CliNom = new String[] {""} ;
      P00YW2_A2070BarFecEst = new java.util.Date[] {GXutil.nullDate()} ;
      P00YW2_n2070BarFecEst = new boolean[] {false} ;
      P00YW2_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P00YW2_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P00YW2_A6841DibDsc = new String[] {""} ;
      P00YW2_n6841DibDsc = new boolean[] {false} ;
      P00YW2_A125BarAncAca1 = new short[1] ;
      P00YW2_A143BarDisNum = new String[] {""} ;
      P00YW2_A120BarAgrEst = new String[] {""} ;
      P00YW2_A3307DisManCod1 = new short[1] ;
      P00YW2_A1360ZonGeoNom = new String[] {""} ;
      P00YW2_n1360ZonGeoNom = new boolean[] {false} ;
      P00YW2_A1431BarLocDis = new String[] {""} ;
      A1013DibCli = "" ;
      A2122RecEstTMaq = "" ;
      A212BarSer = "" ;
      A1798BarDibCli = "" ;
      A1541BarComMtr = DecimalUtil.ZERO ;
      A4812BarEncCli = "" ;
      A1652BarSerDsc = "" ;
      A8313CodMaqEst = "" ;
      A279CliNom = "" ;
      A2070BarFecEst = GXutil.nullDate() ;
      A155BarFecCli = GXutil.nullDate() ;
      A159BarFecGen = GXutil.nullDate() ;
      A6841DibDsc = "" ;
      A143BarDisNum = "" ;
      A120BarAgrEst = "" ;
      A1360ZonGeoNom = "" ;
      A1431BarLocDis = "" ;
      AV143BarEnccli = "" ;
      AV38Serie = "" ;
      AV25BarDibCli = "" ;
      AV111Barcodpar = "" ;
      AV113RecEstTMaq = "" ;
      AV28ColCom = "" ;
      AV29ColFon = "" ;
      P00YW3_A396EmprCod = new String[] {""} ;
      P00YW3_A652OpeCod = new int[1] ;
      P00YW3_A653OpeNom = new String[] {""} ;
      P00YW3_n653OpeNom = new boolean[] {false} ;
      A653OpeNom = "" ;
      AV107OpeNom = "" ;
      AV123MaqDsc = "" ;
      AV124Maqcod = "" ;
      AV108RecTotMtr = DecimalUtil.ZERO ;
      P00YW4_A396EmprCod = new String[] {""} ;
      P00YW4_A129BarCod = new int[1] ;
      P00YW4_A132BarCodReo = new byte[1] ;
      P00YW4_A130BarCodPar = new String[] {""} ;
      P00YW4_A758ProCod = new String[] {""} ;
      A758ProCod = "" ;
      AV114Procod = "" ;
      AV142BarDisnum = "" ;
      P00YW5_A361DisCod = new int[1] ;
      P00YW5_A396EmprCod = new String[] {""} ;
      P00YW5_A129BarCod = new int[1] ;
      P00YW5_A132BarCodReo = new byte[1] ;
      P00YW5_A130BarCodPar = new String[] {""} ;
      P00YW5_A2524DisComLin = new byte[1] ;
      P00YW5_A1056DisComCod = new String[] {""} ;
      P00YW5_A1032FonCod = new String[] {""} ;
      P00YW5_A1014DibInt = new int[1] ;
      P00YW5_n1014DibInt = new boolean[] {false} ;
      P00YW5_A1013DibCli = new String[] {""} ;
      P00YW5_n1013DibCli = new boolean[] {false} ;
      P00YW5_A2124RecMolCod = new byte[1] ;
      P00YW5_A2128RecMolRep = new String[] {""} ;
      P00YW5_n2128RecMolRep = new boolean[] {false} ;
      P00YW5_A5103RecMolCns = new String[] {""} ;
      P00YW5_n5103RecMolCns = new boolean[] {false} ;
      P00YW5_A5102RecMolMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YW5_n5102RecMolMtr = new boolean[] {false} ;
      P00YW5_A2127RecMolNom = new String[] {""} ;
      P00YW5_n2127RecMolNom = new boolean[] {false} ;
      P00YW5_A9537RecMolCCOb = new String[] {""} ;
      P00YW5_n9537RecMolCCOb = new boolean[] {false} ;
      P00YW5_A9535RecMolCodC = new String[] {""} ;
      P00YW5_n9535RecMolCodC = new boolean[] {false} ;
      P00YW5_A9538RecMolDgC = new short[1] ;
      P00YW5_n9538RecMolDgC = new boolean[] {false} ;
      A2128RecMolRep = "" ;
      A5103RecMolCns = "" ;
      A5102RecMolMtr = DecimalUtil.ZERO ;
      A2127RecMolNom = "" ;
      A9537RecMolCCOb = "" ;
      A9535RecMolCodC = "" ;
      AV27Repet = "" ;
      AV68Lit24 = "" ;
      P00YW6_A396EmprCod = new String[] {""} ;
      P00YW6_A252CliCod = new int[1] ;
      P00YW6_n252CliCod = new boolean[] {false} ;
      P00YW6_A1013DibCli = new String[] {""} ;
      P00YW6_n1013DibCli = new boolean[] {false} ;
      P00YW6_A1014DibInt = new int[1] ;
      P00YW6_n1014DibInt = new boolean[] {false} ;
      P00YW6_A2141SerEst = new String[] {""} ;
      P00YW6_A2074ColCom = new String[] {""} ;
      P00YW6_A2078ColFon = new String[] {""} ;
      P00YW6_A2098MolCod = new byte[1] ;
      P00YW6_A4420MolCol = new String[] {""} ;
      P00YW6_n4420MolCol = new boolean[] {false} ;
      A2141SerEst = "" ;
      A2074ColCom = "" ;
      A2078ColFon = "" ;
      A4420MolCol = "" ;
      AV90MolCol = "" ;
      AV88Artextil = DecimalUtil.ZERO ;
      AV89EstColDsc = "" ;
      GXv_int8 = new long[1] ;
      GXv_int9 = new short[1] ;
      GXv_int10 = new short[1] ;
      GXv_int11 = new short[1] ;
      AV92MolPrcCob = DecimalUtil.ZERO ;
      GXt_decimal12 = DecimalUtil.ZERO ;
      GXv_decimal5 = new java.math.BigDecimal[1] ;
      AV154TotCob = DecimalUtil.ZERO ;
      AV129TipoMalha = "" ;
      AV105Dg_Desc = "" ;
      AV97Orden_ = "" ;
      AV118recmolccob = "" ;
      AV126DibPres = "" ;
      AV31CanMax = new java.math.BigDecimal[25] ;
      GX_I = 1 ;
      while ( GX_I <= 25 )
      {
         AV31CanMax[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV33TotPas = DecimalUtil.ZERO ;
      AV40TotResto = DecimalUtil.ZERO ;
      AV45KilPas = DecimalUtil.ZERO ;
      AV103KilPasPar = DecimalUtil.ZERO ;
      AV47TotCol = DecimalUtil.ZERO ;
      P00YW7_A396EmprCod = new String[] {""} ;
      P00YW7_A129BarCod = new int[1] ;
      P00YW7_A132BarCodReo = new byte[1] ;
      P00YW7_A130BarCodPar = new String[] {""} ;
      P00YW7_A2524DisComLin = new byte[1] ;
      P00YW7_A1056DisComCod = new String[] {""} ;
      P00YW7_A1032FonCod = new String[] {""} ;
      P00YW7_A2124RecMolCod = new byte[1] ;
      P00YW7_A2119RecEstCP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YW7_n2119RecEstCP = new boolean[] {false} ;
      P00YW7_A5105RecEstCPPa = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YW7_n5105RecEstCPPa = new boolean[] {false} ;
      P00YW7_A2126RecMolLin = new byte[1] ;
      A2119RecEstCP = DecimalUtil.ZERO ;
      A5105RecEstCPPa = DecimalUtil.ZERO ;
      P00YW8_A396EmprCod = new String[] {""} ;
      P00YW8_A129BarCod = new int[1] ;
      P00YW8_A132BarCodReo = new byte[1] ;
      P00YW8_A130BarCodPar = new String[] {""} ;
      P00YW8_A2524DisComLin = new byte[1] ;
      P00YW8_A1056DisComCod = new String[] {""} ;
      P00YW8_A1032FonCod = new String[] {""} ;
      P00YW8_A2124RecMolCod = new byte[1] ;
      P00YW8_A2132RecPasCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YW8_n2132RecPasCan = new boolean[] {false} ;
      P00YW8_A5108RecPasCPPa = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YW8_n5108RecPasCPPa = new boolean[] {false} ;
      P00YW8_A2672RecPasLin = new short[1] ;
      A2132RecPasCan = DecimalUtil.ZERO ;
      A5108RecPasCPPa = DecimalUtil.ZERO ;
      AV149TotPasta = DecimalUtil.ZERO ;
      P00YW9_A396EmprCod = new String[] {""} ;
      P00YW9_A129BarCod = new int[1] ;
      P00YW9_A132BarCodReo = new byte[1] ;
      P00YW9_A130BarCodPar = new String[] {""} ;
      P00YW9_A2524DisComLin = new byte[1] ;
      P00YW9_A1056DisComCod = new String[] {""} ;
      P00YW9_A1032FonCod = new String[] {""} ;
      P00YW9_A2124RecMolCod = new byte[1] ;
      P00YW9_A2133RecPasGK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YW9_n2133RecPasGK = new boolean[] {false} ;
      P00YW9_A2132RecPasCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YW9_n2132RecPasCan = new boolean[] {false} ;
      P00YW9_A2672RecPasLin = new short[1] ;
      A2133RecPasGK = DecimalUtil.ZERO ;
      AV30MolPesMax = DecimalUtil.ZERO ;
      AV36Cociente = DecimalUtil.ZERO ;
      AV35Resto = DecimalUtil.ZERO ;
      AV122TotPrd = DecimalUtil.ZERO ;
      AV131CantPasta = DecimalUtil.ZERO ;
      AV137RestoP = DecimalUtil.ZERO ;
      AV140TotProd = DecimalUtil.ZERO ;
      P00YW10_A396EmprCod = new String[] {""} ;
      P00YW10_A129BarCod = new int[1] ;
      P00YW10_A132BarCodReo = new byte[1] ;
      P00YW10_A130BarCodPar = new String[] {""} ;
      P00YW10_A2524DisComLin = new byte[1] ;
      P00YW10_A1056DisComCod = new String[] {""} ;
      P00YW10_A1032FonCod = new String[] {""} ;
      P00YW10_A2124RecMolCod = new byte[1] ;
      P00YW10_A2119RecEstCP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YW10_n2119RecEstCP = new boolean[] {false} ;
      P00YW10_A2120RecEstGK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YW10_n2120RecEstGK = new boolean[] {false} ;
      P00YW10_A718PrdNom = new String[] {""} ;
      P00YW10_A719PrdNum = new String[] {""} ;
      P00YW10_n719PrdNum = new boolean[] {false} ;
      P00YW10_A2126RecMolLin = new byte[1] ;
      A2120RecEstGK = DecimalUtil.ZERO ;
      A718PrdNom = "" ;
      A719PrdNum = "" ;
      AV34RecEstCp = DecimalUtil.ZERO ;
      AV39RestoCP = DecimalUtil.ZERO ;
      AV43RecEstTot = DecimalUtil.ZERO ;
      AV101Und = "" ;
      AV99Cantidad = DecimalUtil.ZERO ;
      AV138CantGrm = DecimalUtil.ZERO ;
      AV133Cant1 = DecimalUtil.ZERO ;
      AV134Cant2 = DecimalUtil.ZERO ;
      AV150Prdnum = "" ;
      AV151Cnt = DecimalUtil.ZERO ;
      P00YW11_A396EmprCod = new String[] {""} ;
      P00YW11_A129BarCod = new int[1] ;
      P00YW11_A132BarCodReo = new byte[1] ;
      P00YW11_A130BarCodPar = new String[] {""} ;
      P00YW11_A2524DisComLin = new byte[1] ;
      P00YW11_A1056DisComCod = new String[] {""} ;
      P00YW11_A1032FonCod = new String[] {""} ;
      P00YW11_A2124RecMolCod = new byte[1] ;
      P00YW11_A2132RecPasCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YW11_n2132RecPasCan = new boolean[] {false} ;
      P00YW11_A2108PasDsc = new String[] {""} ;
      P00YW11_n2108PasDsc = new boolean[] {false} ;
      P00YW11_A2107PasCod = new String[] {""} ;
      P00YW11_n2107PasCod = new boolean[] {false} ;
      P00YW11_A2133RecPasGK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YW11_n2133RecPasGK = new boolean[] {false} ;
      P00YW11_A2672RecPasLin = new short[1] ;
      A2108PasDsc = "" ;
      A2107PasCod = "" ;
      AV104Cantidad1 = DecimalUtil.ZERO ;
      AV135Text1 = "" ;
      AV136text2 = "" ;
      AV48RecEst100 = DecimalUtil.ZERO ;
      AV71Lit31 = "" ;
      AV139Comp14 = DecimalUtil.ZERO ;
      P00YW12_A396EmprCod = new String[] {""} ;
      P00YW12_A361DisCod = new int[1] ;
      P00YW12_A377DisObsTxt = new String[] {""} ;
      P00YW12_A376DisObsLin = new byte[1] ;
      A377DisObsTxt = "" ;
      AV153Prdnom = "" ;
      AV16Lit0 = "" ;
      AV17Lit1 = "" ;
      GXt_char6 = "" ;
      AV18Lit2 = "" ;
      AV19Lit3 = "" ;
      AV50Lit4 = "" ;
      AV58Lit5 = "" ;
      AV66Lit6 = "" ;
      AV59Lit7 = "" ;
      AV51Lit8 = "" ;
      AV52Lit9 = "" ;
      AV55Lit10 = "" ;
      AV62Lit11 = "" ;
      AV63Lit12 = "" ;
      AV64Lit13 = "" ;
      AV65Lit14 = "" ;
      AV53Lit15 = "" ;
      AV56Lit16 = "" ;
      AV67Lit18 = "" ;
      AV54Lit19 = "" ;
      AV57Lit20 = "" ;
      AV73Lit21 = "" ;
      AV78Lit22 = "" ;
      AV69Lit25 = "" ;
      AV70Lit26 = "" ;
      AV74Lit27 = "" ;
      AV75Lit28 = "" ;
      AV76Lit29 = "" ;
      AV77Lit30 = "" ;
      AV72Lit32 = "" ;
      AV61Lit33 = "" ;
      AV155FecPiolera = "" ;
      GXv_int3 = new byte[1] ;
      P00YW13_A396EmprCod = new String[] {""} ;
      P00YW13_A407EmprNom = new String[] {""} ;
      P00YW13_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV20NomEmp = "" ;
      AV80Ceros8 = "" ;
      AV81HdrAlfa = "" ;
      AV82HojRut = "" ;
      AV93AlbRLoc = "" ;
      P00YW14_A396EmprCod = new String[] {""} ;
      P00YW14_A129BarCod = new int[1] ;
      P00YW14_A132BarCodReo = new byte[1] ;
      P00YW14_A130BarCodPar = new String[] {""} ;
      P00YW14_A44AlbRecCod = new int[1] ;
      P00YW14_A200BarPieCod = new String[] {""} ;
      P00YW14_A50AlbRLoc = new String[] {""} ;
      A200BarPieCod = "" ;
      A50AlbRLoc = "" ;
      P00YW15_A396EmprCod = new String[] {""} ;
      P00YW15_A1014DibInt = new int[1] ;
      P00YW15_n1014DibInt = new boolean[] {false} ;
      P00YW15_A252CliCod = new int[1] ;
      P00YW15_n252CliCod = new boolean[] {false} ;
      P00YW15_A1013DibCli = new String[] {""} ;
      P00YW15_n1013DibCli = new boolean[] {false} ;
      P00YW15_A1020DibObs = new String[] {""} ;
      P00YW15_n1020DibObs = new boolean[] {false} ;
      P00YW15_A1609DibObs2 = new String[] {""} ;
      P00YW15_n1609DibObs2 = new boolean[] {false} ;
      A1020DibObs = "" ;
      A1609DibObs2 = "" ;
      P00YW16_A396EmprCod = new String[] {""} ;
      P00YW16_A1013DibCli = new String[] {""} ;
      P00YW16_n1013DibCli = new boolean[] {false} ;
      P00YW16_A252CliCod = new int[1] ;
      P00YW16_n252CliCod = new boolean[] {false} ;
      P00YW16_A1014DibInt = new int[1] ;
      P00YW16_n1014DibInt = new boolean[] {false} ;
      P00YW16_A2522DibObsTxt = new String[] {""} ;
      P00YW16_n2522DibObsTxt = new boolean[] {false} ;
      P00YW16_A2521DibObsLin = new byte[1] ;
      A2522DibObsTxt = "" ;
      P00YW17_A8052Dg_codigo = new short[1] ;
      P00YW17_n8052Dg_codigo = new boolean[] {false} ;
      P00YW17_A396EmprCod = new String[] {""} ;
      P00YW17_A2098MolCod = new byte[1] ;
      P00YW17_A2078ColFon = new String[] {""} ;
      P00YW17_A2074ColCom = new String[] {""} ;
      P00YW17_A1014DibInt = new int[1] ;
      P00YW17_n1014DibInt = new boolean[] {false} ;
      P00YW17_A1013DibCli = new String[] {""} ;
      P00YW17_n1013DibCli = new boolean[] {false} ;
      P00YW17_A2141SerEst = new String[] {""} ;
      P00YW17_A252CliCod = new int[1] ;
      P00YW17_n252CliCod = new boolean[] {false} ;
      P00YW17_A2649MolPesMax = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YW17_n2649MolPesMax = new boolean[] {false} ;
      P00YW17_A8053Dg_Desc = new String[] {""} ;
      P00YW17_n8053Dg_Desc = new boolean[] {false} ;
      P00YW17_A4420MolCol = new String[] {""} ;
      P00YW17_n4420MolCol = new boolean[] {false} ;
      P00YW17_A8054Dg_Degr = new short[1] ;
      P00YW17_n8054Dg_Degr = new boolean[] {false} ;
      A2649MolPesMax = DecimalUtil.ZERO ;
      A8053Dg_Desc = "" ;
      P00YW18_A396EmprCod = new String[] {""} ;
      P00YW18_A2078ColFon = new String[] {""} ;
      P00YW18_A2074ColCom = new String[] {""} ;
      P00YW18_A1014DibInt = new int[1] ;
      P00YW18_n1014DibInt = new boolean[] {false} ;
      P00YW18_A1013DibCli = new String[] {""} ;
      P00YW18_n1013DibCli = new boolean[] {false} ;
      P00YW18_A2141SerEst = new String[] {""} ;
      P00YW18_A252CliCod = new int[1] ;
      P00YW18_n252CliCod = new boolean[] {false} ;
      P00YW18_A2098MolCod = new byte[1] ;
      P00YW19_A396EmprCod = new String[] {""} ;
      P00YW19_A252CliCod = new int[1] ;
      P00YW19_n252CliCod = new boolean[] {false} ;
      P00YW19_A2141SerEst = new String[] {""} ;
      P00YW19_A1013DibCli = new String[] {""} ;
      P00YW19_n1013DibCli = new boolean[] {false} ;
      P00YW19_A1014DibInt = new int[1] ;
      P00YW19_n1014DibInt = new boolean[] {false} ;
      P00YW19_A2074ColCom = new String[] {""} ;
      P00YW19_A2078ColFon = new String[] {""} ;
      P00YW19_A2096ForObsTxt = new String[] {""} ;
      P00YW19_n2096ForObsTxt = new boolean[] {false} ;
      P00YW19_A2095ForObsLin = new byte[1] ;
      A2096ForObsTxt = "" ;
      P00YW20_A396EmprCod = new String[] {""} ;
      P00YW20_A1013DibCli = new String[] {""} ;
      P00YW20_n1013DibCli = new boolean[] {false} ;
      P00YW20_A252CliCod = new int[1] ;
      P00YW20_n252CliCod = new boolean[] {false} ;
      P00YW20_A1014DibInt = new int[1] ;
      P00YW20_n1014DibInt = new boolean[] {false} ;
      P00YW20_A2088DibDibMol = new byte[1] ;
      P00YW20_n2088DibDibMol = new boolean[] {false} ;
      P00YW20_A6840DibLinMal = new String[] {""} ;
      P00YW20_n6840DibLinMal = new boolean[] {false} ;
      P00YW20_A1809DibOrdMol = new byte[1] ;
      P00YW20_n1809DibOrdMol = new boolean[] {false} ;
      P00YW20_A1029DibLin = new short[1] ;
      A6840DibLinMal = "" ;
      P00YW21_A396EmprCod = new String[] {""} ;
      P00YW21_A7041ShaDibCli = new String[] {""} ;
      P00YW21_A7042ShaDibInt = new int[1] ;
      P00YW21_A7043ShaOrd = new byte[1] ;
      P00YW21_n7043ShaOrd = new boolean[] {false} ;
      P00YW21_A7032ShaMal = new String[] {""} ;
      P00YW21_n7032ShaMal = new boolean[] {false} ;
      P00YW21_A7031ShaCod = new String[] {""} ;
      A7041ShaDibCli = "" ;
      A7032ShaMal = "" ;
      A7031ShaCod = "" ;
      AV157ShaMal = "" ;
      P00YW22_A396EmprCod = new String[] {""} ;
      P00YW22_A1807DibLinCil = new short[1] ;
      P00YW22_A1014DibInt = new int[1] ;
      P00YW22_n1014DibInt = new boolean[] {false} ;
      P00YW22_A252CliCod = new int[1] ;
      P00YW22_n252CliCod = new boolean[] {false} ;
      P00YW22_A1013DibCli = new String[] {""} ;
      P00YW22_n1013DibCli = new boolean[] {false} ;
      P00YW22_A10771DibDm = new byte[1] ;
      P00YW22_n10771DibDm = new boolean[] {false} ;
      P00YW22_A10772DibPres = new String[] {""} ;
      P00YW22_n10772DibPres = new boolean[] {false} ;
      P00YW22_A7027DibLinMalC = new String[] {""} ;
      P00YW22_n7027DibLinMalC = new boolean[] {false} ;
      P00YW22_A1808DibOrdCil = new byte[1] ;
      P00YW22_n1808DibOrdCil = new boolean[] {false} ;
      A10772DibPres = "" ;
      A7027DibLinMalC = "" ;
      P00YW23_A396EmprCod = new String[] {""} ;
      P00YW23_A7041ShaDibCli = new String[] {""} ;
      P00YW23_A7042ShaDibInt = new int[1] ;
      P00YW23_A7043ShaOrd = new byte[1] ;
      P00YW23_n7043ShaOrd = new boolean[] {false} ;
      P00YW23_A7032ShaMal = new String[] {""} ;
      P00YW23_n7032ShaMal = new boolean[] {false} ;
      P00YW23_A7031ShaCod = new String[] {""} ;
      A122BarAgrPar = "" ;
      A869MtrAgr = DecimalUtil.ZERO ;
      P00YW24_A396EmprCod = new String[] {""} ;
      P00YW24_A130BarCodPar = new String[] {""} ;
      P00YW24_A132BarCodReo = new byte[1] ;
      P00YW24_A129BarCod = new int[1] ;
      P00YW24_A869MtrAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YW24_A122BarAgrPar = new String[] {""} ;
      P00YW24_A124BarAgrReo = new byte[1] ;
      P00YW24_A119BarAgrCod = new int[1] ;
      P00YW25_A396EmprCod = new String[] {""} ;
      P00YW25_A758ProCod = new String[] {""} ;
      P00YW25_A65ArtCod = new String[] {""} ;
      P00YW25_A252CliCod = new int[1] ;
      P00YW25_n252CliCod = new boolean[] {false} ;
      P00YW25_A8066Art_AncA = new short[1] ;
      P00YW25_n8066Art_AncA = new boolean[] {false} ;
      A65ArtCod = "" ;
      P00YW26_A396EmprCod = new String[] {""} ;
      P00YW26_A8052Dg_codigo = new short[1] ;
      P00YW26_n8052Dg_codigo = new boolean[] {false} ;
      P00YW26_A8053Dg_Desc = new String[] {""} ;
      P00YW26_n8053Dg_Desc = new boolean[] {false} ;
      P00YW26_A8054Dg_Degr = new short[1] ;
      P00YW26_n8054Dg_Degr = new boolean[] {false} ;
      AV119DibGraNum = "" ;
      P00YW27_A396EmprCod = new String[] {""} ;
      P00YW27_A1014DibInt = new int[1] ;
      P00YW27_n1014DibInt = new boolean[] {false} ;
      P00YW27_A1013DibCli = new String[] {""} ;
      P00YW27_n1013DibCli = new boolean[] {false} ;
      P00YW27_A252CliCod = new int[1] ;
      P00YW27_n252CliCod = new boolean[] {false} ;
      P00YW27_A1880DibGraNum = new String[] {""} ;
      P00YW27_n1880DibGraNum = new boolean[] {false} ;
      A1880DibGraNum = "" ;
      P00YW28_A396EmprCod = new String[] {""} ;
      P00YW28_A602MaqCod = new String[] {""} ;
      P00YW28_A606MaqDsc = new String[] {""} ;
      P00YW28_n606MaqDsc = new boolean[] {false} ;
      A602MaqCod = "" ;
      A606MaqDsc = "" ;
      Gx_date = GXutil.nullDate() ;
      AV60Lit17 = "" ;
      AV94Estampa = "" ;
      AV91ColBmp = "" ;
      GXt_char13 = "" ;
      GXv_char7 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_char4 = new String[1] ;
      GXv_char1 = new String[1] ;
      GXv_int16 = new int[1] ;
      GXv_char17 = new String[1] ;
      GXv_char18 = new String[1] ;
      GXv_char19 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedires__default(),
         new Object[] {
             new Object[] {
            P00YW2_A858ZonGeoCod, P00YW2_A361DisCod, P00YW2_A1013DibCli, P00YW2_n1013DibCli, P00YW2_A1014DibInt, P00YW2_n1014DibInt, P00YW2_A396EmprCod, P00YW2_A129BarCod, P00YW2_A132BarCodReo, P00YW2_A130BarCodPar,
            P00YW2_A2524DisComLin, P00YW2_A1056DisComCod, P00YW2_A1032FonCod, P00YW2_A2122RecEstTMaq, P00YW2_n2122RecEstTMaq, P00YW2_A252CliCod, P00YW2_n252CliCod, P00YW2_A212BarSer, P00YW2_A1798BarDibCli, P00YW2_A1799BarDibInt,
            P00YW2_A1541BarComMtr, P00YW2_n1541BarComMtr, P00YW2_A8420OpeREst, P00YW2_n8420OpeREst, P00YW2_A4812BarEncCli, P00YW2_A1652BarSerDsc, P00YW2_A8312BarMaqPor, P00YW2_n8312BarMaqPor, P00YW2_A8313CodMaqEst, P00YW2_n8313CodMaqEst,
            P00YW2_A2073BarNumMol, P00YW2_n2073BarNumMol, P00YW2_A279CliNom, P00YW2_A2070BarFecEst, P00YW2_n2070BarFecEst, P00YW2_A155BarFecCli, P00YW2_A159BarFecGen, P00YW2_A6841DibDsc, P00YW2_n6841DibDsc, P00YW2_A125BarAncAca1,
            P00YW2_A143BarDisNum, P00YW2_A120BarAgrEst, P00YW2_A3307DisManCod1, P00YW2_A1360ZonGeoNom, P00YW2_n1360ZonGeoNom, P00YW2_A1431BarLocDis
            }
            , new Object[] {
            P00YW3_A396EmprCod, P00YW3_A652OpeCod, P00YW3_A653OpeNom, P00YW3_n653OpeNom
            }
            , new Object[] {
            P00YW4_A396EmprCod, P00YW4_A129BarCod, P00YW4_A132BarCodReo, P00YW4_A130BarCodPar, P00YW4_A758ProCod
            }
            , new Object[] {
            P00YW5_A361DisCod, P00YW5_A396EmprCod, P00YW5_A129BarCod, P00YW5_A132BarCodReo, P00YW5_A130BarCodPar, P00YW5_A2524DisComLin, P00YW5_A1056DisComCod, P00YW5_A1032FonCod, P00YW5_A1014DibInt, P00YW5_n1014DibInt,
            P00YW5_A1013DibCli, P00YW5_n1013DibCli, P00YW5_A2124RecMolCod, P00YW5_A2128RecMolRep, P00YW5_n2128RecMolRep, P00YW5_A5103RecMolCns, P00YW5_n5103RecMolCns, P00YW5_A5102RecMolMtr, P00YW5_n5102RecMolMtr, P00YW5_A2127RecMolNom,
            P00YW5_n2127RecMolNom, P00YW5_A9537RecMolCCOb, P00YW5_n9537RecMolCCOb, P00YW5_A9535RecMolCodC, P00YW5_n9535RecMolCodC, P00YW5_A9538RecMolDgC, P00YW5_n9538RecMolDgC
            }
            , new Object[] {
            P00YW6_A396EmprCod, P00YW6_A252CliCod, P00YW6_A1013DibCli, P00YW6_A1014DibInt, P00YW6_A2141SerEst, P00YW6_A2074ColCom, P00YW6_A2078ColFon, P00YW6_A2098MolCod, P00YW6_A4420MolCol, P00YW6_n4420MolCol
            }
            , new Object[] {
            P00YW7_A396EmprCod, P00YW7_A129BarCod, P00YW7_A132BarCodReo, P00YW7_A130BarCodPar, P00YW7_A2524DisComLin, P00YW7_A1056DisComCod, P00YW7_A1032FonCod, P00YW7_A2124RecMolCod, P00YW7_A2119RecEstCP, P00YW7_n2119RecEstCP,
            P00YW7_A5105RecEstCPPa, P00YW7_n5105RecEstCPPa, P00YW7_A2126RecMolLin
            }
            , new Object[] {
            P00YW8_A396EmprCod, P00YW8_A129BarCod, P00YW8_A132BarCodReo, P00YW8_A130BarCodPar, P00YW8_A2524DisComLin, P00YW8_A1056DisComCod, P00YW8_A1032FonCod, P00YW8_A2124RecMolCod, P00YW8_A2132RecPasCan, P00YW8_n2132RecPasCan,
            P00YW8_A5108RecPasCPPa, P00YW8_n5108RecPasCPPa, P00YW8_A2672RecPasLin
            }
            , new Object[] {
            P00YW9_A396EmprCod, P00YW9_A129BarCod, P00YW9_A132BarCodReo, P00YW9_A130BarCodPar, P00YW9_A2524DisComLin, P00YW9_A1056DisComCod, P00YW9_A1032FonCod, P00YW9_A2124RecMolCod, P00YW9_A2133RecPasGK, P00YW9_n2133RecPasGK,
            P00YW9_A2132RecPasCan, P00YW9_n2132RecPasCan, P00YW9_A2672RecPasLin
            }
            , new Object[] {
            P00YW10_A396EmprCod, P00YW10_A129BarCod, P00YW10_A132BarCodReo, P00YW10_A130BarCodPar, P00YW10_A2524DisComLin, P00YW10_A1056DisComCod, P00YW10_A1032FonCod, P00YW10_A2124RecMolCod, P00YW10_A2119RecEstCP, P00YW10_n2119RecEstCP,
            P00YW10_A2120RecEstGK, P00YW10_n2120RecEstGK, P00YW10_A718PrdNom, P00YW10_A719PrdNum, P00YW10_n719PrdNum, P00YW10_A2126RecMolLin
            }
            , new Object[] {
            P00YW11_A396EmprCod, P00YW11_A129BarCod, P00YW11_A132BarCodReo, P00YW11_A130BarCodPar, P00YW11_A2524DisComLin, P00YW11_A1056DisComCod, P00YW11_A1032FonCod, P00YW11_A2124RecMolCod, P00YW11_A2132RecPasCan, P00YW11_n2132RecPasCan,
            P00YW11_A2108PasDsc, P00YW11_n2108PasDsc, P00YW11_A2107PasCod, P00YW11_n2107PasCod, P00YW11_A2133RecPasGK, P00YW11_n2133RecPasGK, P00YW11_A2672RecPasLin
            }
            , new Object[] {
            P00YW12_A396EmprCod, P00YW12_A361DisCod, P00YW12_A377DisObsTxt, P00YW12_A376DisObsLin
            }
            , new Object[] {
            P00YW13_A396EmprCod, P00YW13_A407EmprNom, P00YW13_n407EmprNom
            }
            , new Object[] {
            P00YW14_A396EmprCod, P00YW14_A129BarCod, P00YW14_A132BarCodReo, P00YW14_A130BarCodPar, P00YW14_A44AlbRecCod, P00YW14_A200BarPieCod, P00YW14_A50AlbRLoc
            }
            , new Object[] {
            P00YW15_A396EmprCod, P00YW15_A1014DibInt, P00YW15_A252CliCod, P00YW15_A1013DibCli, P00YW15_A1020DibObs, P00YW15_n1020DibObs, P00YW15_A1609DibObs2, P00YW15_n1609DibObs2
            }
            , new Object[] {
            P00YW16_A396EmprCod, P00YW16_A1013DibCli, P00YW16_A252CliCod, P00YW16_A1014DibInt, P00YW16_A2522DibObsTxt, P00YW16_n2522DibObsTxt, P00YW16_A2521DibObsLin
            }
            , new Object[] {
            P00YW17_A8052Dg_codigo, P00YW17_n8052Dg_codigo, P00YW17_A396EmprCod, P00YW17_A2098MolCod, P00YW17_A2078ColFon, P00YW17_A2074ColCom, P00YW17_A1014DibInt, P00YW17_A1013DibCli, P00YW17_A2141SerEst, P00YW17_A252CliCod,
            P00YW17_A2649MolPesMax, P00YW17_n2649MolPesMax, P00YW17_A8053Dg_Desc, P00YW17_n8053Dg_Desc, P00YW17_A4420MolCol, P00YW17_n4420MolCol, P00YW17_A8054Dg_Degr, P00YW17_n8054Dg_Degr
            }
            , new Object[] {
            P00YW18_A396EmprCod, P00YW18_A2078ColFon, P00YW18_A2074ColCom, P00YW18_A1014DibInt, P00YW18_A1013DibCli, P00YW18_A2141SerEst, P00YW18_A252CliCod, P00YW18_A2098MolCod
            }
            , new Object[] {
            P00YW19_A396EmprCod, P00YW19_A252CliCod, P00YW19_A2141SerEst, P00YW19_A1013DibCli, P00YW19_A1014DibInt, P00YW19_A2074ColCom, P00YW19_A2078ColFon, P00YW19_A2096ForObsTxt, P00YW19_n2096ForObsTxt, P00YW19_A2095ForObsLin
            }
            , new Object[] {
            P00YW20_A396EmprCod, P00YW20_A1013DibCli, P00YW20_A252CliCod, P00YW20_A1014DibInt, P00YW20_A2088DibDibMol, P00YW20_n2088DibDibMol, P00YW20_A6840DibLinMal, P00YW20_n6840DibLinMal, P00YW20_A1809DibOrdMol, P00YW20_n1809DibOrdMol,
            P00YW20_A1029DibLin
            }
            , new Object[] {
            P00YW21_A396EmprCod, P00YW21_A7041ShaDibCli, P00YW21_A7042ShaDibInt, P00YW21_A7043ShaOrd, P00YW21_n7043ShaOrd, P00YW21_A7032ShaMal, P00YW21_n7032ShaMal, P00YW21_A7031ShaCod
            }
            , new Object[] {
            P00YW22_A396EmprCod, P00YW22_A1807DibLinCil, P00YW22_A1014DibInt, P00YW22_A252CliCod, P00YW22_A1013DibCli, P00YW22_A10771DibDm, P00YW22_n10771DibDm, P00YW22_A10772DibPres, P00YW22_n10772DibPres, P00YW22_A7027DibLinMalC,
            P00YW22_n7027DibLinMalC, P00YW22_A1808DibOrdCil, P00YW22_n1808DibOrdCil
            }
            , new Object[] {
            P00YW23_A396EmprCod, P00YW23_A7041ShaDibCli, P00YW23_A7042ShaDibInt, P00YW23_A7043ShaOrd, P00YW23_n7043ShaOrd, P00YW23_A7032ShaMal, P00YW23_n7032ShaMal, P00YW23_A7031ShaCod
            }
            , new Object[] {
            P00YW24_A396EmprCod, P00YW24_A130BarCodPar, P00YW24_A132BarCodReo, P00YW24_A129BarCod, P00YW24_A869MtrAgr, P00YW24_A122BarAgrPar, P00YW24_A124BarAgrReo, P00YW24_A119BarAgrCod
            }
            , new Object[] {
            P00YW25_A396EmprCod, P00YW25_A758ProCod, P00YW25_A65ArtCod, P00YW25_A252CliCod, P00YW25_A8066Art_AncA, P00YW25_n8066Art_AncA
            }
            , new Object[] {
            P00YW26_A396EmprCod, P00YW26_A8052Dg_codigo, P00YW26_A8053Dg_Desc, P00YW26_n8053Dg_Desc, P00YW26_A8054Dg_Degr, P00YW26_n8054Dg_Degr
            }
            , new Object[] {
            P00YW27_A396EmprCod, P00YW27_A1014DibInt, P00YW27_A1013DibCli, P00YW27_A252CliCod, P00YW27_A1880DibGraNum, P00YW27_n1880DibGraNum
            }
            , new Object[] {
            P00YW28_A396EmprCod, P00YW28_A602MaqCod, P00YW28_A606MaqDsc, P00YW28_n606MaqDsc
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A2524DisComLin ;
   private byte AV110BarCodreo ;
   private byte AV98Eliot ;
   private byte A2124RecMolCod ;
   private byte AV37MolCod ;
   private byte A2098MolCod ;
   private byte AV158Stamperia ;
   private byte AV95Recmolcod ;
   private byte AV125DibDm ;
   private byte AV32Contador ;
   private byte AV41FlagMax ;
   private byte A2126RecMolLin ;
   private byte AV44TinEst ;
   private byte AV42Mul ;
   private byte AV132NumeroT ;
   private byte AV141Piolera ;
   private byte AV46CmpKil ;
   private byte AV120Er ;
   private byte AV121UnKgm ;
   private byte AV21Flag ;
   private byte A376DisObsLin ;
   private byte AV79FlagBar ;
   private byte AV112Lindalana ;
   private byte GXt_int14 ;
   private byte GXv_int3[] ;
   private byte AV83LenVar ;
   private byte AV23Flag2 ;
   private byte A2521DibObsLin ;
   private byte A2095ForObsLin ;
   private byte A2088DibDibMol ;
   private byte A1809DibOrdMol ;
   private byte AV96DibOrdmol ;
   private byte A7043ShaOrd ;
   private byte A10771DibDm ;
   private byte A1808DibOrdCil ;
   private byte AV156DibOrdCil ;
   private byte A124BarAgrReo ;
   private byte AV152ALta ;
   private short AV147i ;
   private short AV148j ;
   private short A858ZonGeoCod ;
   private short A8312BarMaqPor ;
   private short A2073BarNumMol ;
   private short A125BarAncAca1 ;
   private short A3307DisManCod1 ;
   private short AV116Barancaca1 ;
   private short AV115Art_AncA ;
   private short A9538RecMolDgC ;
   private short AV162R ;
   private short GXv_int9[] ;
   private short AV161G ;
   private short GXv_int10[] ;
   private short AV160B ;
   private short GXv_int11[] ;
   private short AV106Dg_valor ;
   private short AV117RecMolDgC ;
   private short AV102DivUni ;
   private short A2672RecPasLin ;
   private short AV130CapTacho ;
   private short AV100Kgs_m ;
   private short A8052Dg_codigo ;
   private short A8054Dg_Degr ;
   private short A8055Dg_Valor ;
   private short A1029DibLin ;
   private short A1807DibLinCil ;
   private short A8066Art_AncA ;
   private short Gx_err ;
   private int A129BarCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int GX_I ;
   private int A361DisCod ;
   private int A1014DibInt ;
   private int A252CliCod ;
   private int A1799BarDibInt ;
   private int A8420OpeREst ;
   private int AV24CliCod ;
   private int AV26BarDibInt ;
   private int AV109barCod ;
   private int A652OpeCod ;
   private int Gx_OldLine ;
   private int GXt_int15 ;
   private int A44AlbRecCod ;
   private int A7042ShaDibInt ;
   private int A119BarAgrCod ;
   private int GXv_int2[] ;
   private int GXv_int16[] ;
   private long AV159EstColRGB ;
   private long GXv_int8[] ;
   private java.math.BigDecimal AV145tab_cnt[] ;
   private java.math.BigDecimal AV146tab_cntp[] ;
   private java.math.BigDecimal A1541BarComMtr ;
   private java.math.BigDecimal AV108RecTotMtr ;
   private java.math.BigDecimal A5102RecMolMtr ;
   private java.math.BigDecimal AV88Artextil ;
   private java.math.BigDecimal AV92MolPrcCob ;
   private java.math.BigDecimal GXt_decimal12 ;
   private java.math.BigDecimal GXv_decimal5[] ;
   private java.math.BigDecimal AV154TotCob ;
   private java.math.BigDecimal AV31CanMax[] ;
   private java.math.BigDecimal AV33TotPas ;
   private java.math.BigDecimal AV40TotResto ;
   private java.math.BigDecimal AV45KilPas ;
   private java.math.BigDecimal AV103KilPasPar ;
   private java.math.BigDecimal AV47TotCol ;
   private java.math.BigDecimal A2119RecEstCP ;
   private java.math.BigDecimal A5105RecEstCPPa ;
   private java.math.BigDecimal A2132RecPasCan ;
   private java.math.BigDecimal A5108RecPasCPPa ;
   private java.math.BigDecimal AV149TotPasta ;
   private java.math.BigDecimal A2133RecPasGK ;
   private java.math.BigDecimal AV30MolPesMax ;
   private java.math.BigDecimal AV36Cociente ;
   private java.math.BigDecimal AV35Resto ;
   private java.math.BigDecimal AV122TotPrd ;
   private java.math.BigDecimal AV131CantPasta ;
   private java.math.BigDecimal AV137RestoP ;
   private java.math.BigDecimal AV140TotProd ;
   private java.math.BigDecimal A2120RecEstGK ;
   private java.math.BigDecimal AV34RecEstCp ;
   private java.math.BigDecimal AV39RestoCP ;
   private java.math.BigDecimal AV43RecEstTot ;
   private java.math.BigDecimal AV99Cantidad ;
   private java.math.BigDecimal AV138CantGrm ;
   private java.math.BigDecimal AV133Cant1 ;
   private java.math.BigDecimal AV134Cant2 ;
   private java.math.BigDecimal AV151Cnt ;
   private java.math.BigDecimal AV104Cantidad1 ;
   private java.math.BigDecimal AV48RecEst100 ;
   private java.math.BigDecimal AV139Comp14 ;
   private java.math.BigDecimal A2649MolPesMax ;
   private java.math.BigDecimal A869MtrAgr ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A1056DisComCod ;
   private String A1032FonCod ;
   private String Gx_out ;
   private String AV144tab_prd[] ;
   private String scmdbuf ;
   private String A1013DibCli ;
   private String A2122RecEstTMaq ;
   private String A212BarSer ;
   private String A1798BarDibCli ;
   private String A4812BarEncCli ;
   private String A1652BarSerDsc ;
   private String A8313CodMaqEst ;
   private String A279CliNom ;
   private String A6841DibDsc ;
   private String A143BarDisNum ;
   private String A120BarAgrEst ;
   private String A1360ZonGeoNom ;
   private String A1431BarLocDis ;
   private String AV143BarEnccli ;
   private String AV38Serie ;
   private String AV25BarDibCli ;
   private String AV111Barcodpar ;
   private String AV113RecEstTMaq ;
   private String AV28ColCom ;
   private String AV29ColFon ;
   private String A653OpeNom ;
   private String AV107OpeNom ;
   private String AV123MaqDsc ;
   private String AV124Maqcod ;
   private String A758ProCod ;
   private String AV114Procod ;
   private String AV142BarDisnum ;
   private String A2128RecMolRep ;
   private String A5103RecMolCns ;
   private String A2127RecMolNom ;
   private String A9537RecMolCCOb ;
   private String A9535RecMolCodC ;
   private String AV27Repet ;
   private String AV68Lit24 ;
   private String A2141SerEst ;
   private String A2074ColCom ;
   private String A2078ColFon ;
   private String A4420MolCol ;
   private String AV90MolCol ;
   private String AV89EstColDsc ;
   private String AV129TipoMalha ;
   private String AV105Dg_Desc ;
   private String AV97Orden_ ;
   private String AV118recmolccob ;
   private String AV126DibPres ;
   private String A718PrdNom ;
   private String A719PrdNum ;
   private String AV101Und ;
   private String AV150Prdnum ;
   private String A2108PasDsc ;
   private String A2107PasCod ;
   private String AV135Text1 ;
   private String AV136text2 ;
   private String AV71Lit31 ;
   private String A377DisObsTxt ;
   private String AV153Prdnom ;
   private String AV16Lit0 ;
   private String AV17Lit1 ;
   private String GXt_char6 ;
   private String AV18Lit2 ;
   private String AV19Lit3 ;
   private String AV50Lit4 ;
   private String AV58Lit5 ;
   private String AV66Lit6 ;
   private String AV59Lit7 ;
   private String AV51Lit8 ;
   private String AV52Lit9 ;
   private String AV55Lit10 ;
   private String AV62Lit11 ;
   private String AV63Lit12 ;
   private String AV64Lit13 ;
   private String AV65Lit14 ;
   private String AV53Lit15 ;
   private String AV56Lit16 ;
   private String AV67Lit18 ;
   private String AV54Lit19 ;
   private String AV57Lit20 ;
   private String AV73Lit21 ;
   private String AV78Lit22 ;
   private String AV69Lit25 ;
   private String AV70Lit26 ;
   private String AV74Lit27 ;
   private String AV75Lit28 ;
   private String AV76Lit29 ;
   private String AV77Lit30 ;
   private String AV72Lit32 ;
   private String AV61Lit33 ;
   private String AV155FecPiolera ;
   private String A407EmprNom ;
   private String AV20NomEmp ;
   private String AV80Ceros8 ;
   private String AV81HdrAlfa ;
   private String AV82HojRut ;
   private String AV93AlbRLoc ;
   private String A200BarPieCod ;
   private String A50AlbRLoc ;
   private String A1020DibObs ;
   private String A1609DibObs2 ;
   private String A2522DibObsTxt ;
   private String A8053Dg_Desc ;
   private String A2096ForObsTxt ;
   private String A6840DibLinMal ;
   private String A7041ShaDibCli ;
   private String A7032ShaMal ;
   private String A7031ShaCod ;
   private String AV157ShaMal ;
   private String A10772DibPres ;
   private String A7027DibLinMalC ;
   private String A122BarAgrPar ;
   private String A65ArtCod ;
   private String AV119DibGraNum ;
   private String A1880DibGraNum ;
   private String A602MaqCod ;
   private String A606MaqDsc ;
   private String AV60Lit17 ;
   private String AV94Estampa ;
   private String AV91ColBmp ;
   private String GXt_char13 ;
   private String GXv_char7[] ;
   private String GXv_char4[] ;
   private String GXv_char1[] ;
   private String GXv_char17[] ;
   private String GXv_char18[] ;
   private String GXv_char19[] ;
   private java.util.Date A2070BarFecEst ;
   private java.util.Date A155BarFecCli ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date Gx_date ;
   private boolean returnInSub ;
   private boolean GxHdr3 ;
   private boolean n1013DibCli ;
   private boolean n1014DibInt ;
   private boolean n2122RecEstTMaq ;
   private boolean n252CliCod ;
   private boolean n1541BarComMtr ;
   private boolean n8420OpeREst ;
   private boolean n8312BarMaqPor ;
   private boolean n8313CodMaqEst ;
   private boolean n2073BarNumMol ;
   private boolean n2070BarFecEst ;
   private boolean n6841DibDsc ;
   private boolean n1360ZonGeoNom ;
   private boolean n653OpeNom ;
   private boolean GxHdr7 ;
   private boolean n2128RecMolRep ;
   private boolean n5103RecMolCns ;
   private boolean n5102RecMolMtr ;
   private boolean n2127RecMolNom ;
   private boolean n9537RecMolCCOb ;
   private boolean n9535RecMolCodC ;
   private boolean n9538RecMolDgC ;
   private boolean n4420MolCol ;
   private boolean n2119RecEstCP ;
   private boolean n5105RecEstCPPa ;
   private boolean n2132RecPasCan ;
   private boolean n5108RecPasCPPa ;
   private boolean n2133RecPasGK ;
   private boolean n2120RecEstGK ;
   private boolean n719PrdNum ;
   private boolean n2108PasDsc ;
   private boolean n2107PasCod ;
   private boolean n407EmprNom ;
   private boolean brkYW17 ;
   private boolean n1020DibObs ;
   private boolean n1609DibObs2 ;
   private boolean n2522DibObsTxt ;
   private boolean n8052Dg_codigo ;
   private boolean n2649MolPesMax ;
   private boolean n8053Dg_Desc ;
   private boolean n8054Dg_Degr ;
   private boolean n2096ForObsTxt ;
   private boolean n2088DibDibMol ;
   private boolean n6840DibLinMal ;
   private boolean n1809DibOrdMol ;
   private boolean n7043ShaOrd ;
   private boolean n7032ShaMal ;
   private boolean n10771DibDm ;
   private boolean n10772DibPres ;
   private boolean n7027DibLinMalC ;
   private boolean n1808DibOrdCil ;
   private boolean n8066Art_AncA ;
   private boolean n1880DibGraNum ;
   private boolean n606MaqDsc ;
   private String[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private byte[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private IDataStoreProvider pr_default ;
   private short[] P00YW2_A858ZonGeoCod ;
   private int[] P00YW2_A361DisCod ;
   private String[] P00YW2_A1013DibCli ;
   private boolean[] P00YW2_n1013DibCli ;
   private int[] P00YW2_A1014DibInt ;
   private boolean[] P00YW2_n1014DibInt ;
   private String[] P00YW2_A396EmprCod ;
   private int[] P00YW2_A129BarCod ;
   private byte[] P00YW2_A132BarCodReo ;
   private String[] P00YW2_A130BarCodPar ;
   private byte[] P00YW2_A2524DisComLin ;
   private String[] P00YW2_A1056DisComCod ;
   private String[] P00YW2_A1032FonCod ;
   private String[] P00YW2_A2122RecEstTMaq ;
   private boolean[] P00YW2_n2122RecEstTMaq ;
   private int[] P00YW2_A252CliCod ;
   private boolean[] P00YW2_n252CliCod ;
   private String[] P00YW2_A212BarSer ;
   private String[] P00YW2_A1798BarDibCli ;
   private int[] P00YW2_A1799BarDibInt ;
   private java.math.BigDecimal[] P00YW2_A1541BarComMtr ;
   private boolean[] P00YW2_n1541BarComMtr ;
   private int[] P00YW2_A8420OpeREst ;
   private boolean[] P00YW2_n8420OpeREst ;
   private String[] P00YW2_A4812BarEncCli ;
   private String[] P00YW2_A1652BarSerDsc ;
   private short[] P00YW2_A8312BarMaqPor ;
   private boolean[] P00YW2_n8312BarMaqPor ;
   private String[] P00YW2_A8313CodMaqEst ;
   private boolean[] P00YW2_n8313CodMaqEst ;
   private short[] P00YW2_A2073BarNumMol ;
   private boolean[] P00YW2_n2073BarNumMol ;
   private String[] P00YW2_A279CliNom ;
   private java.util.Date[] P00YW2_A2070BarFecEst ;
   private boolean[] P00YW2_n2070BarFecEst ;
   private java.util.Date[] P00YW2_A155BarFecCli ;
   private java.util.Date[] P00YW2_A159BarFecGen ;
   private String[] P00YW2_A6841DibDsc ;
   private boolean[] P00YW2_n6841DibDsc ;
   private short[] P00YW2_A125BarAncAca1 ;
   private String[] P00YW2_A143BarDisNum ;
   private String[] P00YW2_A120BarAgrEst ;
   private short[] P00YW2_A3307DisManCod1 ;
   private String[] P00YW2_A1360ZonGeoNom ;
   private boolean[] P00YW2_n1360ZonGeoNom ;
   private String[] P00YW2_A1431BarLocDis ;
   private String[] P00YW3_A396EmprCod ;
   private int[] P00YW3_A652OpeCod ;
   private String[] P00YW3_A653OpeNom ;
   private boolean[] P00YW3_n653OpeNom ;
   private String[] P00YW4_A396EmprCod ;
   private int[] P00YW4_A129BarCod ;
   private byte[] P00YW4_A132BarCodReo ;
   private String[] P00YW4_A130BarCodPar ;
   private String[] P00YW4_A758ProCod ;
   private int[] P00YW5_A361DisCod ;
   private String[] P00YW5_A396EmprCod ;
   private int[] P00YW5_A129BarCod ;
   private byte[] P00YW5_A132BarCodReo ;
   private String[] P00YW5_A130BarCodPar ;
   private byte[] P00YW5_A2524DisComLin ;
   private String[] P00YW5_A1056DisComCod ;
   private String[] P00YW5_A1032FonCod ;
   private int[] P00YW5_A1014DibInt ;
   private boolean[] P00YW5_n1014DibInt ;
   private String[] P00YW5_A1013DibCli ;
   private boolean[] P00YW5_n1013DibCli ;
   private byte[] P00YW5_A2124RecMolCod ;
   private String[] P00YW5_A2128RecMolRep ;
   private boolean[] P00YW5_n2128RecMolRep ;
   private String[] P00YW5_A5103RecMolCns ;
   private boolean[] P00YW5_n5103RecMolCns ;
   private java.math.BigDecimal[] P00YW5_A5102RecMolMtr ;
   private boolean[] P00YW5_n5102RecMolMtr ;
   private String[] P00YW5_A2127RecMolNom ;
   private boolean[] P00YW5_n2127RecMolNom ;
   private String[] P00YW5_A9537RecMolCCOb ;
   private boolean[] P00YW5_n9537RecMolCCOb ;
   private String[] P00YW5_A9535RecMolCodC ;
   private boolean[] P00YW5_n9535RecMolCodC ;
   private short[] P00YW5_A9538RecMolDgC ;
   private boolean[] P00YW5_n9538RecMolDgC ;
   private String[] P00YW6_A396EmprCod ;
   private int[] P00YW6_A252CliCod ;
   private boolean[] P00YW6_n252CliCod ;
   private String[] P00YW6_A1013DibCli ;
   private boolean[] P00YW6_n1013DibCli ;
   private int[] P00YW6_A1014DibInt ;
   private boolean[] P00YW6_n1014DibInt ;
   private String[] P00YW6_A2141SerEst ;
   private String[] P00YW6_A2074ColCom ;
   private String[] P00YW6_A2078ColFon ;
   private byte[] P00YW6_A2098MolCod ;
   private String[] P00YW6_A4420MolCol ;
   private boolean[] P00YW6_n4420MolCol ;
   private String[] P00YW7_A396EmprCod ;
   private int[] P00YW7_A129BarCod ;
   private byte[] P00YW7_A132BarCodReo ;
   private String[] P00YW7_A130BarCodPar ;
   private byte[] P00YW7_A2524DisComLin ;
   private String[] P00YW7_A1056DisComCod ;
   private String[] P00YW7_A1032FonCod ;
   private byte[] P00YW7_A2124RecMolCod ;
   private java.math.BigDecimal[] P00YW7_A2119RecEstCP ;
   private boolean[] P00YW7_n2119RecEstCP ;
   private java.math.BigDecimal[] P00YW7_A5105RecEstCPPa ;
   private boolean[] P00YW7_n5105RecEstCPPa ;
   private byte[] P00YW7_A2126RecMolLin ;
   private String[] P00YW8_A396EmprCod ;
   private int[] P00YW8_A129BarCod ;
   private byte[] P00YW8_A132BarCodReo ;
   private String[] P00YW8_A130BarCodPar ;
   private byte[] P00YW8_A2524DisComLin ;
   private String[] P00YW8_A1056DisComCod ;
   private String[] P00YW8_A1032FonCod ;
   private byte[] P00YW8_A2124RecMolCod ;
   private java.math.BigDecimal[] P00YW8_A2132RecPasCan ;
   private boolean[] P00YW8_n2132RecPasCan ;
   private java.math.BigDecimal[] P00YW8_A5108RecPasCPPa ;
   private boolean[] P00YW8_n5108RecPasCPPa ;
   private short[] P00YW8_A2672RecPasLin ;
   private String[] P00YW9_A396EmprCod ;
   private int[] P00YW9_A129BarCod ;
   private byte[] P00YW9_A132BarCodReo ;
   private String[] P00YW9_A130BarCodPar ;
   private byte[] P00YW9_A2524DisComLin ;
   private String[] P00YW9_A1056DisComCod ;
   private String[] P00YW9_A1032FonCod ;
   private byte[] P00YW9_A2124RecMolCod ;
   private java.math.BigDecimal[] P00YW9_A2133RecPasGK ;
   private boolean[] P00YW9_n2133RecPasGK ;
   private java.math.BigDecimal[] P00YW9_A2132RecPasCan ;
   private boolean[] P00YW9_n2132RecPasCan ;
   private short[] P00YW9_A2672RecPasLin ;
   private String[] P00YW10_A396EmprCod ;
   private int[] P00YW10_A129BarCod ;
   private byte[] P00YW10_A132BarCodReo ;
   private String[] P00YW10_A130BarCodPar ;
   private byte[] P00YW10_A2524DisComLin ;
   private String[] P00YW10_A1056DisComCod ;
   private String[] P00YW10_A1032FonCod ;
   private byte[] P00YW10_A2124RecMolCod ;
   private java.math.BigDecimal[] P00YW10_A2119RecEstCP ;
   private boolean[] P00YW10_n2119RecEstCP ;
   private java.math.BigDecimal[] P00YW10_A2120RecEstGK ;
   private boolean[] P00YW10_n2120RecEstGK ;
   private String[] P00YW10_A718PrdNom ;
   private String[] P00YW10_A719PrdNum ;
   private boolean[] P00YW10_n719PrdNum ;
   private byte[] P00YW10_A2126RecMolLin ;
   private String[] P00YW11_A396EmprCod ;
   private int[] P00YW11_A129BarCod ;
   private byte[] P00YW11_A132BarCodReo ;
   private String[] P00YW11_A130BarCodPar ;
   private byte[] P00YW11_A2524DisComLin ;
   private String[] P00YW11_A1056DisComCod ;
   private String[] P00YW11_A1032FonCod ;
   private byte[] P00YW11_A2124RecMolCod ;
   private java.math.BigDecimal[] P00YW11_A2132RecPasCan ;
   private boolean[] P00YW11_n2132RecPasCan ;
   private String[] P00YW11_A2108PasDsc ;
   private boolean[] P00YW11_n2108PasDsc ;
   private String[] P00YW11_A2107PasCod ;
   private boolean[] P00YW11_n2107PasCod ;
   private java.math.BigDecimal[] P00YW11_A2133RecPasGK ;
   private boolean[] P00YW11_n2133RecPasGK ;
   private short[] P00YW11_A2672RecPasLin ;
   private String[] P00YW12_A396EmprCod ;
   private int[] P00YW12_A361DisCod ;
   private String[] P00YW12_A377DisObsTxt ;
   private byte[] P00YW12_A376DisObsLin ;
   private String[] P00YW13_A396EmprCod ;
   private String[] P00YW13_A407EmprNom ;
   private boolean[] P00YW13_n407EmprNom ;
   private String[] P00YW14_A396EmprCod ;
   private int[] P00YW14_A129BarCod ;
   private byte[] P00YW14_A132BarCodReo ;
   private String[] P00YW14_A130BarCodPar ;
   private int[] P00YW14_A44AlbRecCod ;
   private String[] P00YW14_A200BarPieCod ;
   private String[] P00YW14_A50AlbRLoc ;
   private String[] P00YW15_A396EmprCod ;
   private int[] P00YW15_A1014DibInt ;
   private boolean[] P00YW15_n1014DibInt ;
   private int[] P00YW15_A252CliCod ;
   private boolean[] P00YW15_n252CliCod ;
   private String[] P00YW15_A1013DibCli ;
   private boolean[] P00YW15_n1013DibCli ;
   private String[] P00YW15_A1020DibObs ;
   private boolean[] P00YW15_n1020DibObs ;
   private String[] P00YW15_A1609DibObs2 ;
   private boolean[] P00YW15_n1609DibObs2 ;
   private String[] P00YW16_A396EmprCod ;
   private String[] P00YW16_A1013DibCli ;
   private boolean[] P00YW16_n1013DibCli ;
   private int[] P00YW16_A252CliCod ;
   private boolean[] P00YW16_n252CliCod ;
   private int[] P00YW16_A1014DibInt ;
   private boolean[] P00YW16_n1014DibInt ;
   private String[] P00YW16_A2522DibObsTxt ;
   private boolean[] P00YW16_n2522DibObsTxt ;
   private byte[] P00YW16_A2521DibObsLin ;
   private short[] P00YW17_A8052Dg_codigo ;
   private boolean[] P00YW17_n8052Dg_codigo ;
   private String[] P00YW17_A396EmprCod ;
   private byte[] P00YW17_A2098MolCod ;
   private String[] P00YW17_A2078ColFon ;
   private String[] P00YW17_A2074ColCom ;
   private int[] P00YW17_A1014DibInt ;
   private boolean[] P00YW17_n1014DibInt ;
   private String[] P00YW17_A1013DibCli ;
   private boolean[] P00YW17_n1013DibCli ;
   private String[] P00YW17_A2141SerEst ;
   private int[] P00YW17_A252CliCod ;
   private boolean[] P00YW17_n252CliCod ;
   private java.math.BigDecimal[] P00YW17_A2649MolPesMax ;
   private boolean[] P00YW17_n2649MolPesMax ;
   private String[] P00YW17_A8053Dg_Desc ;
   private boolean[] P00YW17_n8053Dg_Desc ;
   private String[] P00YW17_A4420MolCol ;
   private boolean[] P00YW17_n4420MolCol ;
   private short[] P00YW17_A8054Dg_Degr ;
   private boolean[] P00YW17_n8054Dg_Degr ;
   private String[] P00YW18_A396EmprCod ;
   private String[] P00YW18_A2078ColFon ;
   private String[] P00YW18_A2074ColCom ;
   private int[] P00YW18_A1014DibInt ;
   private boolean[] P00YW18_n1014DibInt ;
   private String[] P00YW18_A1013DibCli ;
   private boolean[] P00YW18_n1013DibCli ;
   private String[] P00YW18_A2141SerEst ;
   private int[] P00YW18_A252CliCod ;
   private boolean[] P00YW18_n252CliCod ;
   private byte[] P00YW18_A2098MolCod ;
   private String[] P00YW19_A396EmprCod ;
   private int[] P00YW19_A252CliCod ;
   private boolean[] P00YW19_n252CliCod ;
   private String[] P00YW19_A2141SerEst ;
   private String[] P00YW19_A1013DibCli ;
   private boolean[] P00YW19_n1013DibCli ;
   private int[] P00YW19_A1014DibInt ;
   private boolean[] P00YW19_n1014DibInt ;
   private String[] P00YW19_A2074ColCom ;
   private String[] P00YW19_A2078ColFon ;
   private String[] P00YW19_A2096ForObsTxt ;
   private boolean[] P00YW19_n2096ForObsTxt ;
   private byte[] P00YW19_A2095ForObsLin ;
   private String[] P00YW20_A396EmprCod ;
   private String[] P00YW20_A1013DibCli ;
   private boolean[] P00YW20_n1013DibCli ;
   private int[] P00YW20_A252CliCod ;
   private boolean[] P00YW20_n252CliCod ;
   private int[] P00YW20_A1014DibInt ;
   private boolean[] P00YW20_n1014DibInt ;
   private byte[] P00YW20_A2088DibDibMol ;
   private boolean[] P00YW20_n2088DibDibMol ;
   private String[] P00YW20_A6840DibLinMal ;
   private boolean[] P00YW20_n6840DibLinMal ;
   private byte[] P00YW20_A1809DibOrdMol ;
   private boolean[] P00YW20_n1809DibOrdMol ;
   private short[] P00YW20_A1029DibLin ;
   private String[] P00YW21_A396EmprCod ;
   private String[] P00YW21_A7041ShaDibCli ;
   private int[] P00YW21_A7042ShaDibInt ;
   private byte[] P00YW21_A7043ShaOrd ;
   private boolean[] P00YW21_n7043ShaOrd ;
   private String[] P00YW21_A7032ShaMal ;
   private boolean[] P00YW21_n7032ShaMal ;
   private String[] P00YW21_A7031ShaCod ;
   private String[] P00YW22_A396EmprCod ;
   private short[] P00YW22_A1807DibLinCil ;
   private int[] P00YW22_A1014DibInt ;
   private boolean[] P00YW22_n1014DibInt ;
   private int[] P00YW22_A252CliCod ;
   private boolean[] P00YW22_n252CliCod ;
   private String[] P00YW22_A1013DibCli ;
   private boolean[] P00YW22_n1013DibCli ;
   private byte[] P00YW22_A10771DibDm ;
   private boolean[] P00YW22_n10771DibDm ;
   private String[] P00YW22_A10772DibPres ;
   private boolean[] P00YW22_n10772DibPres ;
   private String[] P00YW22_A7027DibLinMalC ;
   private boolean[] P00YW22_n7027DibLinMalC ;
   private byte[] P00YW22_A1808DibOrdCil ;
   private boolean[] P00YW22_n1808DibOrdCil ;
   private String[] P00YW23_A396EmprCod ;
   private String[] P00YW23_A7041ShaDibCli ;
   private int[] P00YW23_A7042ShaDibInt ;
   private byte[] P00YW23_A7043ShaOrd ;
   private boolean[] P00YW23_n7043ShaOrd ;
   private String[] P00YW23_A7032ShaMal ;
   private boolean[] P00YW23_n7032ShaMal ;
   private String[] P00YW23_A7031ShaCod ;
   private String[] P00YW24_A396EmprCod ;
   private String[] P00YW24_A130BarCodPar ;
   private byte[] P00YW24_A132BarCodReo ;
   private int[] P00YW24_A129BarCod ;
   private java.math.BigDecimal[] P00YW24_A869MtrAgr ;
   private String[] P00YW24_A122BarAgrPar ;
   private byte[] P00YW24_A124BarAgrReo ;
   private int[] P00YW24_A119BarAgrCod ;
   private String[] P00YW25_A396EmprCod ;
   private String[] P00YW25_A758ProCod ;
   private String[] P00YW25_A65ArtCod ;
   private int[] P00YW25_A252CliCod ;
   private boolean[] P00YW25_n252CliCod ;
   private short[] P00YW25_A8066Art_AncA ;
   private boolean[] P00YW25_n8066Art_AncA ;
   private String[] P00YW26_A396EmprCod ;
   private short[] P00YW26_A8052Dg_codigo ;
   private boolean[] P00YW26_n8052Dg_codigo ;
   private String[] P00YW26_A8053Dg_Desc ;
   private boolean[] P00YW26_n8053Dg_Desc ;
   private short[] P00YW26_A8054Dg_Degr ;
   private boolean[] P00YW26_n8054Dg_Degr ;
   private String[] P00YW27_A396EmprCod ;
   private int[] P00YW27_A1014DibInt ;
   private boolean[] P00YW27_n1014DibInt ;
   private String[] P00YW27_A1013DibCli ;
   private boolean[] P00YW27_n1013DibCli ;
   private int[] P00YW27_A252CliCod ;
   private boolean[] P00YW27_n252CliCod ;
   private String[] P00YW27_A1880DibGraNum ;
   private boolean[] P00YW27_n1880DibGraNum ;
   private String[] P00YW28_A396EmprCod ;
   private String[] P00YW28_A602MaqCod ;
   private String[] P00YW28_A606MaqDsc ;
   private boolean[] P00YW28_n606MaqDsc ;
}

final  class pedires__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00YW2", "SELECT T4.ZonGeoCod, T2.DisCod, T3.DibCli, T3.DibInt, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.DisComLin, T1.DisComCod, T1.FonCod, T1.RecEstTMaq, T2.CliCod, T2.BarSer, T2.BarDibCli, T2.BarDibInt, T1.BarComMtr, T1.OpeREst, T2.BarEncCli, T2.BarSerDsc, T1.BarMaqPor, T1.CodMaqEst, T1.BarNumMol, T4.CliNom, T1.BarFecEst, T2.BarFecCli, T2.BarFecGen, T6.DibDsc, T2.BarAncAca1, T2.BarDisNum, T2.BarAgrEst, T3.DisManCod1, T5.ZonGeoNom, T2.BarLocDis FROM (((((TXPBARCOM T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPDISPOS T3 ON T3.EmprCod = T1.EmprCod AND T3.DisCod = T2.DisCod) LEFT JOIN TXPCDIBUJ T6 ON T6.EmprCod = T1.EmprCod AND T6.DibCli = T3.DibCli AND T6.CliCod = T2.CliCod AND T6.DibInt = T3.DibInt) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T2.CliCod) LEFT JOIN TXPZONGEO T5 ON T5.EmprCod = T1.EmprCod AND T5.ZonGeoCod = T4.ZonGeoCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.DisComLin = ? and T1.DisComCod = ? and T1.FonCod = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.DisComLin, T1.DisComCod, T1.FonCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00YW3", "SELECT EmprCod, OpeCod, OpeNom FROM TXPOPERAR WHERE EmprCod = ? and OpeCod = ? ORDER BY EmprCod, OpeCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00YW4", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod FROM TXPBARPRO WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00YW5", "SELECT T2.DisCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.DisComLin, T1.DisComCod, T1.FonCod, T3.DibInt, T3.DibCli, T1.RecMolCod, T1.RecMolRep, T1.RecMolCns, T1.RecMolMtr, T1.RecMolNom, T1.RecMolCCOb, T1.RecMolCodC, T1.RecMolDgC FROM ((TXPRECMOL T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPDISPOS T3 ON T3.EmprCod = T1.EmprCod AND T3.DisCod = T2.DisCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.DisComLin = ? and T1.DisComCod = ? and T1.FonCod = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.DisComLin, T1.DisComCod, T1.FonCod, T1.RecMolCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00YW6", "SELECT EmprCod, CliCod, DibCli, DibInt, SerEst, ColCom, ColFon, MolCod, MolCol FROM TXPMFORES WHERE EmprCod = ? and CliCod = ? and SerEst = ? and DibCli = ? and DibInt = ? and ColCom = ? and ColFon = ? and MolCod = ? ORDER BY EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00YW7", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, RecMolCod, RecEstCP, RecEstCPPa, RecMolLin FROM TXPRECPRD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and DisComLin = ? and DisComCod = ? and FonCod = ? and RecMolCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, RecMolCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00YW8", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, RecMolCod, RecPasCan, RecPasCPPa, RecPasLin FROM TXPRECPAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and DisComLin = ? and DisComCod = ? and FonCod = ? and RecMolCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, RecMolCod, RecPasLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00YW9", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, RecMolCod, RecPasGK, RecPasCan, RecPasLin FROM TXPRECPAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and DisComLin = ? and DisComCod = ? and FonCod = ? and RecMolCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, RecMolCod, RecPasLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00YW10", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.DisComLin, T1.DisComCod, T1.FonCod, T1.RecMolCod, T1.RecEstCP, T1.RecEstGK, T2.PrdNom, T1.PrdNum, T1.RecMolLin FROM (TXPRECPRD T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.DisComLin = ? and T1.DisComCod = ? and T1.FonCod = ? and T1.RecMolCod = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.DisComLin, T1.DisComCod, T1.FonCod, T1.RecMolCod, T1.RecMolLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00YW11", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.DisComLin, T1.DisComCod, T1.FonCod, T1.RecMolCod, T1.RecPasCan, T2.PasDsc, T1.PasCod, T1.RecPasGK, T1.RecPasLin FROM (TXPRECPAS T1 LEFT JOIN TXPCPASTA T2 ON T2.EmprCod = T1.EmprCod AND T2.PasCod = T1.PasCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.DisComLin = ? and T1.DisComCod = ? and T1.FonCod = ? and T1.RecMolCod = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.DisComLin, T1.DisComCod, T1.FonCod, T1.RecMolCod, T1.RecPasLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00YW12", "SELECT EmprCod, DisCod, DisObsTxt, DisObsLin FROM TXPOBSERV WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod, DisObsLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00YW13", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00YW14", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.AlbRecCod, T1.BarPieCod, T2.AlbRLoc FROM (TXPBARPIE T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.AlbRecCod, T1.BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00YW15", "SELECT EmprCod, DibInt, CliCod, DibCli, DibObs, DibObs2 FROM TXPCDIBUJ WHERE EmprCod = ? and DibCli = ? and CliCod = ? and DibInt = ? ORDER BY EmprCod, DibCli, CliCod, DibInt ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00YW16", "SELECT EmprCod, DibCli, CliCod, DibInt, DibObsTxt, DibObsLin FROM TXPDIBOBS WHERE EmprCod = ? and DibCli = ? and CliCod = ? and DibInt = ? ORDER BY EmprCod, DibCli, CliCod, DibInt, DibObsLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00YW17", "SELECT T1.Dg_codigo, T1.EmprCod, T1.MolCod, T1.ColFon, T1.ColCom, T1.DibInt, T1.DibCli, T1.SerEst, T1.CliCod, T1.MolPesMax, T2.Dg_Desc, T1.MolCol, T2.Dg_Degr FROM (TXPMFORES T1 LEFT JOIN TXPDEGRA T2 ON T2.EmprCod = T1.EmprCod AND T2.Dg_codigo = T1.Dg_codigo) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.SerEst = ? and T1.DibCli = ? and T1.DibInt = ? and T1.ColCom = ? and T1.ColFon = ? and T1.MolCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.SerEst, T1.DibCli, T1.DibInt, T1.ColCom, T1.ColFon, T1.MolCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00YW18", "SELECT EmprCod, ColFon, ColCom, DibInt, DibCli, SerEst, CliCod, MolCod FROM TXPMFORES WHERE EmprCod = ? and CliCod = ? and SerEst = ? and DibCli = ? and DibInt = ? and ColCom = ? and ColFon = ? and MolCod = ? ORDER BY EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00YW19", "SELECT EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, ForObsTxt, ForObsLin FROM TXPFOROBS WHERE EmprCod = ? and CliCod = ? and SerEst = ? and DibCli = ? and DibInt = ? and ColCom = ? and ColFon = ? ORDER BY EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, ForObsLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00YW20", "SELECT EmprCod, DibCli, CliCod, DibInt, DibDibMol, DibLinMal, DibOrdMol, DibLin FROM TXPLDIBUJ WHERE EmprCod = ? and DibCli = ? and CliCod = ? and DibInt = ? and DibDibMol = ? ORDER BY EmprCod, DibCli, CliCod, DibInt, DibDibMol ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00YW21", "SELECT EmprCod, ShaDibCli, ShaDibInt, ShaOrd, ShaMal, ShaCod FROM TXPShablo WHERE EmprCod = ? and ShaDibCli = ? and ShaDibInt = ? and ShaOrd = ? ORDER BY EmprCod, ShaDibCli, ShaDibInt, ShaOrd ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00YW22", "SELECT EmprCod, DibLinCil, DibInt, CliCod, DibCli, DibDm, DibPres, DibLinMalC, DibOrdCil FROM TXPLDIBUC WHERE EmprCod = ? and DibCli = ? and CliCod = ? and DibInt = ? and DibLinCil = ? ORDER BY EmprCod, DibCli, CliCod, DibInt, DibLinCil ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00YW23", "SELECT EmprCod, ShaDibCli, ShaDibInt, ShaOrd, ShaMal, ShaCod FROM TXPShablo WHERE EmprCod = ? and ShaDibCli = ? and ShaDibInt = ? and ShaOrd = ? ORDER BY EmprCod, ShaDibCli, ShaDibInt, ShaOrd ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00YW24", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, MtrAgr, BarAgrPar, BarAgrReo, BarAgrCod FROM TXPBARAGR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00YW25", "SELECT EmprCod, ProCod, ArtCod, CliCod, Art_AncA FROM TXPARTLIN WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ProCod = ? ORDER BY EmprCod, CliCod, ArtCod, ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00YW26", "SELECT EmprCod, Dg_codigo, Dg_Desc, Dg_Degr FROM TXPDEGRA WHERE EmprCod = ? and Dg_codigo = ? ORDER BY EmprCod, Dg_codigo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00YW27", "SELECT EmprCod, DibInt, DibCli, CliCod, DibGraNum FROM TXPCDIBUJ WHERE EmprCod = ? and DibCli = ? and CliCod = ? and DibInt = ? ORDER BY EmprCod, DibCli, CliCod, DibInt ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00YW28", "SELECT EmprCod, MaqCod, MaqDsc FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 3);
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((byte[]) buf[8])[0] = rslt.getByte(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 1);
               ((byte[]) buf[10])[0] = rslt.getByte(9);
               ((String[]) buf[11])[0] = rslt.getString(10, 12);
               ((String[]) buf[12])[0] = rslt.getString(11, 12);
               ((String[]) buf[13])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(13);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(14, 16);
               ((String[]) buf[18])[0] = rslt.getString(15, 16);
               ((int[]) buf[19])[0] = rslt.getInt(16);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(17,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((int[]) buf[22])[0] = rslt.getInt(18);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(19, 20);
               ((String[]) buf[25])[0] = rslt.getString(20, 26);
               ((short[]) buf[26])[0] = rslt.getShort(21);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(22, 6);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((short[]) buf[30])[0] = rslt.getShort(23);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(24, 30);
               ((java.util.Date[]) buf[33])[0] = rslt.getGXDate(25);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[35])[0] = rslt.getGXDate(26);
               ((java.util.Date[]) buf[36])[0] = rslt.getGXDate(27);
               ((String[]) buf[37])[0] = rslt.getString(28, 30);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((short[]) buf[39])[0] = rslt.getShort(29);
               ((String[]) buf[40])[0] = rslt.getString(30, 8);
               ((String[]) buf[41])[0] = rslt.getString(31, 1);
               ((short[]) buf[42])[0] = rslt.getShort(32);
               ((String[]) buf[43])[0] = rslt.getString(33, 30);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getString(34, 10);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 16);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(11);
               ((String[]) buf[13])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(13, 1);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(15, 20);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(16, 40);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(17, 20);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((short[]) buf[25])[0] = rslt.getShort(18);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 20);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,3);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(11);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,3);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(11);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,3);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,3);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(11);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,3);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,3);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(11, 26);
               ((String[]) buf[13])[0] = rslt.getString(12, 6);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(13);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,3);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 26);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(11, 6);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(12,3);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(13);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               ((String[]) buf[6])[0] = rslt.getString(7, 10);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((String[]) buf[4])[0] = rslt.getString(5, 40);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 40);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 60);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               return;
            case 15 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 12);
               ((String[]) buf[5])[0] = rslt.getString(5, 12);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 16);
               ((String[]) buf[8])[0] = rslt.getString(8, 16);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(11, 40);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(12, 20);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(13);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 12);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 40);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 10);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(8);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 10);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 10);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 10);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(9);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 10);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 10);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 16);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[5], 16);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[7]).intValue());
               }
               stmt.setString(6, (String)parms[8], 12);
               stmt.setString(7, (String)parms[9], 12);
               stmt.setByte(8, ((Number) parms[10]).byteValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 16);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[4]).intValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[6]).intValue());
               }
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 16);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[5], 16);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[7]).intValue());
               }
               stmt.setString(6, (String)parms[8], 12);
               stmt.setString(7, (String)parms[9], 12);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

