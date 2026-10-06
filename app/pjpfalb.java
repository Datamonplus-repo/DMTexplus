package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pjpfalb extends GXProcedure
{
   public pjpfalb( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pjpfalb.class ), "" );
   }

   public pjpfalb( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             int[] aP6 ,
                             short[] aP7 ,
                             short[] aP8 ,
                             String[] aP9 ,
                             String[] aP10 )
   {
      pjpfalb.this.aP11 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
      return aP11[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        int[] aP6 ,
                        short[] aP7 ,
                        short[] aP8 ,
                        String[] aP9 ,
                        String[] aP10 ,
                        String[] aP11 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             int[] aP6 ,
                             short[] aP7 ,
                             short[] aP8 ,
                             String[] aP9 ,
                             String[] aP10 ,
                             String[] aP11 )
   {
      pjpfalb.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pjpfalb.this.AV8DisCod = aP1[0];
      this.aP1 = aP1;
      pjpfalb.this.AV12AlbRef = aP2[0];
      this.aP2 = aP2;
      pjpfalb.this.AV13AlbRefDsc = aP3[0];
      this.aP3 = aP3;
      pjpfalb.this.AV11CliCod = aP4[0];
      this.aP4 = aP4;
      pjpfalb.this.AV14AlbRUniEnt = aP5[0];
      this.aP5 = aP5;
      pjpfalb.this.AV20AlbrPieEnt = aP6[0];
      this.aP6 = aP6;
      pjpfalb.this.AV16PesoMl = aP7[0];
      this.aP7 = aP7;
      pjpfalb.this.AV18Procecod = aP8[0];
      this.aP8 = aP8;
      pjpfalb.this.AV19DisUniMed = aP9[0];
      this.aP9 = aP9;
      pjpfalb.this.AV22Disacc = aP10[0];
      this.aP10 = aP10;
      pjpfalb.this.AV28Modo = aP11[0];
      this.aP11 = aP11;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      if ( GXutil.strcmp(AV28Modo, httpContext.getMessage( "INS", "")) == 0 )
      {
         GXv_int1[0] = AV23AlbReccod ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, "020100", GXv_int1) ;
         pjpfalb.this.AV23AlbReccod = GXv_int1[0] ;
      }
      GXt_int2 = AV24Erfoc ;
      GXv_int3[0] = GXt_int2 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ERFOC", ""), GXv_int3) ;
      pjpfalb.this.GXt_int2 = GXv_int3[0] ;
      AV24Erfoc = GXt_int2 ;
      GXt_int2 = AV25Tejido ;
      GXv_int3[0] = GXt_int2 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TEJIDO", ""), GXv_int3) ;
      pjpfalb.this.GXt_int2 = GXv_int3[0] ;
      AV25Tejido = GXt_int2 ;
      GXt_int2 = AV26Texfina ;
      GXv_int3[0] = GXt_int2 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TEXFNA", ""), GXv_int3) ;
      pjpfalb.this.GXt_int2 = GXv_int3[0] ;
      AV26Texfina = GXt_int2 ;
      GXt_int2 = AV27Scrudo ;
      GXv_int3[0] = GXt_int2 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "SCRUDO", ""), GXv_int3) ;
      pjpfalb.this.GXt_int2 = GXv_int3[0] ;
      AV27Scrudo = GXt_int2 ;
      GXt_int2 = AV38Tintex ;
      GXv_int3[0] = GXt_int2 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TINTEX", ""), GXv_int3) ;
      pjpfalb.this.GXt_int2 = GXv_int3[0] ;
      AV38Tintex = GXt_int2 ;
      GXt_int2 = AV40DatosArticulo ;
      GXv_int3[0] = GXt_int2 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "DATART", ""), GXv_int3) ;
      pjpfalb.this.GXt_int2 = GXv_int3[0] ;
      AV40DatosArticulo = GXt_int2 ;
      /* Execute user subroutine: 'ARTICU' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV16PesoMl = ((AV40DatosArticulo==1) ? AV41Barpes : AV16PesoMl) ;
      /* Using cursor P028J2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8DisCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A361DisCod = P028J2_A361DisCod[0] ;
         A365DisDes = P028J2_A365DisDes[0] ;
         A4469DisCruMts = P028J2_A4469DisCruMts[0] ;
         A4470DisCruKgs = P028J2_A4470DisCruKgs[0] ;
         AV29Disdes = A365DisDes ;
         AV37DisCruMts = A4469DisCruMts ;
         AV39DisCruKgs = A4470DisCruKgs ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( ( AV24Erfoc == 1 ) || ( AV25Tejido == 1 ) || ( AV26Texfina == 1 ) || ( AV27Scrudo == 1 ) )
      {
         /* Using cursor P028J3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV8DisCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A361DisCod = P028J3_A361DisCod[0] ;
            A44AlbRecCod = P028J3_A44AlbRecCod[0] ;
            AV23AlbReccod = A44AlbRecCod ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
      }
      else
      {
         if ( AV38Tintex == 0 )
         {
            AV23AlbReccod = AV8DisCod ;
         }
      }
      /*
         INSERT RECORD ON TABLE TXPALBREC

      */
      A44AlbRecCod = AV23AlbReccod ;
      A252CliCod = AV11CliCod ;
      A45AlbRef = AV12AlbRef ;
      A52AlbRPieEnt = AV20AlbrPieEnt ;
      A56AlbRUni = AV19DisUniMed ;
      A58AlbRUniEnt = AV14AlbRUniEnt ;
      A60AlbRUniUti = AV14AlbRUniEnt ;
      A48AlbRFecUlt = Gx_date ;
      A55AlbRReo = httpContext.getMessage( "NO", "") ;
      A49AlbRFen = GXutil.today( ) ;
      A54AlbRPieUti = AV20AlbrPieEnt ;
      A47AlbREst = (byte)(1) ;
      A3613AlbRefDsc = AV13AlbRefDsc ;
      A970ProceCod = AV18Procecod ;
      n970ProceCod = false ;
      A50AlbRLoc = " " ;
      if ( GXutil.strcmp(AV22Disacc, httpContext.getMessage( "S", "")) == 0 )
      {
         A1211TipEntCod = (short)(9999) ;
         n1211TipEntCod = false ;
         if ( ( AV25Tejido == 1 ) || ( AV27Scrudo == 1 ) )
         {
            A50AlbRLoc = httpContext.getMessage( "Sem TELA", "") ;
         }
         else
         {
            A50AlbRLoc = httpContext.getMessage( "Sem Malha", "") ;
         }
      }
      A3360AlbRImp = httpContext.getMessage( "N", "") ;
      A6463AlbRLote = "X" ;
      if ( AV38Tintex == 1 )
      {
         A50AlbRLoc = httpContext.getMessage( "MAKER", "") ;
      }
      /* Using cursor P028J4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), Integer.valueOf(A252CliCod), A45AlbRef, Integer.valueOf(A52AlbRPieEnt), A56AlbRUni, A50AlbRLoc, A49AlbRFen, A58AlbRUniEnt, A55AlbRReo, Integer.valueOf(A54AlbRPieUti), A60AlbRUniUti, A48AlbRFecUlt, Byte.valueOf(A47AlbREst), Boolean.valueOf(n1211TipEntCod), Short.valueOf(A1211TipEntCod), Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod), A3360AlbRImp, A3613AlbRefDsc, A6463AlbRLote});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
      if ( (pr_default.getStatus(2) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         /* Using cursor P028J5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A396EmprCod = P028J5_A396EmprCod[0] ;
            A44AlbRecCod = P028J5_A44AlbRecCod[0] ;
            A252CliCod = P028J5_A252CliCod[0] ;
            A45AlbRef = P028J5_A45AlbRef[0] ;
            A58AlbRUniEnt = P028J5_A58AlbRUniEnt[0] ;
            A60AlbRUniUti = P028J5_A60AlbRUniUti[0] ;
            A3613AlbRefDsc = P028J5_A3613AlbRefDsc[0] ;
            A970ProceCod = P028J5_A970ProceCod[0] ;
            n970ProceCod = P028J5_n970ProceCod[0] ;
            A1211TipEntCod = P028J5_A1211TipEntCod[0] ;
            n1211TipEntCod = P028J5_n1211TipEntCod[0] ;
            A50AlbRLoc = P028J5_A50AlbRLoc[0] ;
            A6463AlbRLote = P028J5_A6463AlbRLote[0] ;
            A252CliCod = AV11CliCod ;
            A45AlbRef = AV12AlbRef ;
            A58AlbRUniEnt = AV14AlbRUniEnt ;
            A60AlbRUniUti = AV14AlbRUniEnt ;
            A3613AlbRefDsc = AV13AlbRefDsc ;
            A970ProceCod = AV18Procecod ;
            n970ProceCod = false ;
            if ( GXutil.strcmp(AV22Disacc, httpContext.getMessage( "S", "")) == 0 )
            {
               A1211TipEntCod = (short)(9999) ;
               n1211TipEntCod = false ;
               if ( ( AV25Tejido == 1 ) || ( AV27Scrudo == 1 ) )
               {
                  A50AlbRLoc = httpContext.getMessage( "Sem TELA", "") ;
               }
               else
               {
                  A50AlbRLoc = httpContext.getMessage( "Sem Malha", "") ;
               }
            }
            A6463AlbRLote = "X" ;
            /* Using cursor P028J6 */
            pr_default.execute(4, new Object[] {Integer.valueOf(A252CliCod), A45AlbRef, A58AlbRUniEnt, A60AlbRUniUti, A3613AlbRefDsc, Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod), Boolean.valueOf(n1211TipEntCod), Short.valueOf(A1211TipEntCod), A50AlbRLoc, A6463AlbRLote, A396EmprCod, Integer.valueOf(A44AlbRecCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
      /*
         INSERT RECORD ON TABLE TXPDISALB

      */
      A361DisCod = AV8DisCod ;
      A44AlbRecCod = AV23AlbReccod ;
      A673Piezas = AV20AlbrPieEnt ;
      if ( GXutil.strcmp(AV19DisUniMed, httpContext.getMessage( "M", "")) == 0 )
      {
         if ( AV24Erfoc == 1 )
         {
            A631Metros = AV14AlbRUniEnt ;
            A595Kilos = (AV14AlbRUniEnt.multiply(DecimalUtil.doubleToDec(AV16PesoMl))).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
            A3699KilosUti = DecimalUtil.doubleToDec(0) ;
            n3699KilosUti = false ;
            A3700MetrosUti = AV14AlbRUniEnt ;
            n3700MetrosUti = false ;
         }
         else
         {
            A595Kilos = (AV14AlbRUniEnt.multiply(DecimalUtil.doubleToDec(AV16PesoMl))).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
            A631Metros = AV14AlbRUniEnt ;
            A3699KilosUti = DecimalUtil.doubleToDec(0) ;
            n3699KilosUti = false ;
            A3700MetrosUti = AV14AlbRUniEnt ;
            n3700MetrosUti = false ;
         }
      }
      else
      {
         A595Kilos = AV14AlbRUniEnt ;
         A631Metros = DecimalUtil.doubleToDec(0) ;
         if ( AV24Erfoc == 1 )
         {
            A631Metros = AV37DisCruMts ;
         }
         A3699KilosUti = AV14AlbRUniEnt ;
         n3699KilosUti = false ;
         A3700MetrosUti = DecimalUtil.doubleToDec(0) ;
         n3700MetrosUti = false ;
      }
      A3701PiezasUti = (short)(AV20AlbrPieEnt) ;
      n3701PiezasUti = false ;
      /* Using cursor P028J7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod), Integer.valueOf(A673Piezas), A595Kilos, A631Metros, Boolean.valueOf(n3699KilosUti), A3699KilosUti, Boolean.valueOf(n3700MetrosUti), A3700MetrosUti, Boolean.valueOf(n3701PiezasUti), Short.valueOf(A3701PiezasUti)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALB");
      if ( (pr_default.getStatus(5) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         /* Using cursor P028J8 */
         pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
         while ( (pr_default.getStatus(6) != 101) )
         {
            A396EmprCod = P028J8_A396EmprCod[0] ;
            A361DisCod = P028J8_A361DisCod[0] ;
            A44AlbRecCod = P028J8_A44AlbRecCod[0] ;
            A673Piezas = P028J8_A673Piezas[0] ;
            A595Kilos = P028J8_A595Kilos[0] ;
            A631Metros = P028J8_A631Metros[0] ;
            A3699KilosUti = P028J8_A3699KilosUti[0] ;
            n3699KilosUti = P028J8_n3699KilosUti[0] ;
            A3700MetrosUti = P028J8_A3700MetrosUti[0] ;
            n3700MetrosUti = P028J8_n3700MetrosUti[0] ;
            A3701PiezasUti = P028J8_A3701PiezasUti[0] ;
            n3701PiezasUti = P028J8_n3701PiezasUti[0] ;
            A673Piezas = AV20AlbrPieEnt ;
            if ( GXutil.strcmp(AV19DisUniMed, httpContext.getMessage( "M", "")) == 0 )
            {
               if ( AV24Erfoc == 0 )
               {
                  A595Kilos = (AV14AlbRUniEnt.multiply(DecimalUtil.doubleToDec(AV16PesoMl))).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
                  A631Metros = AV14AlbRUniEnt ;
                  A3699KilosUti = DecimalUtil.doubleToDec(0) ;
                  n3699KilosUti = false ;
                  A3700MetrosUti = AV14AlbRUniEnt ;
                  n3700MetrosUti = false ;
               }
               else
               {
                  A595Kilos = AV39DisCruKgs ;
                  A631Metros = AV37DisCruMts ;
                  A3699KilosUti = DecimalUtil.doubleToDec(0) ;
                  n3699KilosUti = false ;
                  A3700MetrosUti = AV37DisCruMts ;
                  n3700MetrosUti = false ;
               }
            }
            else
            {
               A595Kilos = AV14AlbRUniEnt ;
               A631Metros = DecimalUtil.doubleToDec(0) ;
               if ( AV24Erfoc == 1 )
               {
                  A631Metros = AV37DisCruMts ;
               }
               A3699KilosUti = AV14AlbRUniEnt ;
               n3699KilosUti = false ;
               A3700MetrosUti = DecimalUtil.doubleToDec(0) ;
               n3700MetrosUti = false ;
            }
            A3701PiezasUti = (short)(AV20AlbrPieEnt) ;
            n3701PiezasUti = false ;
            /* Using cursor P028J9 */
            pr_default.execute(7, new Object[] {Integer.valueOf(A673Piezas), A595Kilos, A631Metros, Boolean.valueOf(n3699KilosUti), A3699KilosUti, Boolean.valueOf(n3700MetrosUti), A3700MetrosUti, Boolean.valueOf(n3701PiezasUti), Short.valueOf(A3701PiezasUti), A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALB");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(6);
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
      if ( GXutil.strcmp(AV29Disdes, httpContext.getMessage( "S", "")) == 0 )
      {
         /* Optimized DELETE. */
         /* Using cursor P028J10 */
         pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(AV8DisCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALD");
         /* End optimized DELETE. */
         if ( AV20AlbrPieEnt == 0 )
         {
            AV35NPz = (short)(1) ;
         }
         else
         {
            AV35NPz = (short)(AV20AlbrPieEnt) ;
         }
         if ( GXutil.strcmp(AV19DisUniMed, httpContext.getMessage( "K", "")) == 0 )
         {
            AV31Kilos = AV14AlbRUniEnt.divide(DecimalUtil.doubleToDec(AV35NPz), 18, java.math.RoundingMode.DOWN) ;
            AV32Mts = DecimalUtil.doubleToDec(0) ;
         }
         else
         {
            AV31Kilos = DecimalUtil.doubleToDec(0) ;
            AV32Mts = AV14AlbRUniEnt.divide(DecimalUtil.doubleToDec(AV35NPz), 18, java.math.RoundingMode.DOWN) ;
         }
         AV30x = (short)(1) ;
         while ( AV30x <= AV35NPz )
         {
            AV34Ceros = "0000" ;
            AV33PzaA = GXutil.str( AV30x, 4, 0) ;
            AV33PzaA = GXutil.ltrim( GXutil.rtrim( AV33PzaA)) ;
            AV36LenVar = (byte)(GXutil.len( AV33PzaA)) ;
            AV36LenVar = (byte)(4-AV36LenVar) ;
            AV33PzaA = GXutil.substring( AV34Ceros, 1, AV36LenVar) + AV33PzaA ;
            /*
               INSERT RECORD ON TABLE TXPDISALD

            */
            A361DisCod = AV8DisCod ;
            A44AlbRecCod = AV23AlbReccod ;
            A380DisPieCod = httpContext.getMessage( "ST-", "") + AV33PzaA ;
            A382DisPieKil = ((AV40DatosArticulo==1) ? (AV32Mts.multiply(DecimalUtil.doubleToDec(AV16PesoMl))).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) : AV31Kilos) ;
            A384DisPieMet = AV32Mts ;
            A2184DisPieLoc = httpContext.getMessage( "Sem TELA", "") ;
            A2185DisPieAnc = (short)(0) ;
            A5099DisPieEst = (byte)(0) ;
            A6490DisPieIdPz = " " ;
            n6490DisPieIdPz = false ;
            A8839DisPieCodB = " " ;
            n8839DisPieCodB = false ;
            A9845DisPieAncc = (short)(0) ;
            n9845DisPieAncc = false ;
            A9983DisPiePda = DecimalUtil.doubleToDec(0) ;
            n9983DisPiePda = false ;
            /* Using cursor P028J11 */
            pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod), A380DisPieCod, A382DisPieKil, A384DisPieMet, A2184DisPieLoc, Short.valueOf(A2185DisPieAnc), Byte.valueOf(A5099DisPieEst), Boolean.valueOf(n6490DisPieIdPz), A6490DisPieIdPz, Boolean.valueOf(n8839DisPieCodB), A8839DisPieCodB, Boolean.valueOf(n9845DisPieAncc), Short.valueOf(A9845DisPieAncc), Boolean.valueOf(n9983DisPiePda), A9983DisPiePda});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALD");
            if ( (pr_default.getStatus(9) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            /* End Insert */
            AV30x = (short)(AV30x+1) ;
         }
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'ARTICU' Routine */
      returnInSub = false ;
      AV41Barpes = (short)(0) ;
      /* Using cursor P028J12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(AV11CliCod), AV12AlbRef});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A65ArtCod = P028J12_A65ArtCod[0] ;
         A252CliCod = P028J12_A252CliCod[0] ;
         A7415ArtPmlCru = P028J12_A7415ArtPmlCru[0] ;
         n7415ArtPmlCru = P028J12_n7415ArtPmlCru[0] ;
         AV41Barpes = A7415ArtPmlCru ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(10);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pjpfalb.this.A396EmprCod;
      this.aP1[0] = pjpfalb.this.AV8DisCod;
      this.aP2[0] = pjpfalb.this.AV12AlbRef;
      this.aP3[0] = pjpfalb.this.AV13AlbRefDsc;
      this.aP4[0] = pjpfalb.this.AV11CliCod;
      this.aP5[0] = pjpfalb.this.AV14AlbRUniEnt;
      this.aP6[0] = pjpfalb.this.AV20AlbrPieEnt;
      this.aP7[0] = pjpfalb.this.AV16PesoMl;
      this.aP8[0] = pjpfalb.this.AV18Procecod;
      this.aP9[0] = pjpfalb.this.AV19DisUniMed;
      this.aP10[0] = pjpfalb.this.AV22Disacc;
      this.aP11[0] = pjpfalb.this.AV28Modo;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int1 = new int[1] ;
      GXv_int3 = new byte[1] ;
      scmdbuf = "" ;
      P028J2_A396EmprCod = new String[] {""} ;
      P028J2_A361DisCod = new int[1] ;
      P028J2_A365DisDes = new String[] {""} ;
      P028J2_A4469DisCruMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P028J2_A4470DisCruKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A365DisDes = "" ;
      A4469DisCruMts = DecimalUtil.ZERO ;
      A4470DisCruKgs = DecimalUtil.ZERO ;
      AV29Disdes = "" ;
      AV37DisCruMts = DecimalUtil.ZERO ;
      AV39DisCruKgs = DecimalUtil.ZERO ;
      P028J3_A396EmprCod = new String[] {""} ;
      P028J3_A361DisCod = new int[1] ;
      P028J3_A44AlbRecCod = new int[1] ;
      A45AlbRef = "" ;
      A56AlbRUni = "" ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A48AlbRFecUlt = GXutil.nullDate() ;
      Gx_date = GXutil.nullDate() ;
      A55AlbRReo = "" ;
      A49AlbRFen = GXutil.nullDate() ;
      A3613AlbRefDsc = "" ;
      A50AlbRLoc = "" ;
      A3360AlbRImp = "" ;
      A6463AlbRLote = "" ;
      Gx_emsg = "" ;
      P028J5_A396EmprCod = new String[] {""} ;
      P028J5_A44AlbRecCod = new int[1] ;
      P028J5_A252CliCod = new int[1] ;
      P028J5_A45AlbRef = new String[] {""} ;
      P028J5_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P028J5_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P028J5_A3613AlbRefDsc = new String[] {""} ;
      P028J5_A970ProceCod = new short[1] ;
      P028J5_n970ProceCod = new boolean[] {false} ;
      P028J5_A1211TipEntCod = new short[1] ;
      P028J5_n1211TipEntCod = new boolean[] {false} ;
      P028J5_A50AlbRLoc = new String[] {""} ;
      P028J5_A6463AlbRLote = new String[] {""} ;
      A631Metros = DecimalUtil.ZERO ;
      A595Kilos = DecimalUtil.ZERO ;
      A3699KilosUti = DecimalUtil.ZERO ;
      A3700MetrosUti = DecimalUtil.ZERO ;
      P028J8_A396EmprCod = new String[] {""} ;
      P028J8_A361DisCod = new int[1] ;
      P028J8_A44AlbRecCod = new int[1] ;
      P028J8_A673Piezas = new int[1] ;
      P028J8_A595Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P028J8_A631Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P028J8_A3699KilosUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P028J8_n3699KilosUti = new boolean[] {false} ;
      P028J8_A3700MetrosUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P028J8_n3700MetrosUti = new boolean[] {false} ;
      P028J8_A3701PiezasUti = new short[1] ;
      P028J8_n3701PiezasUti = new boolean[] {false} ;
      AV31Kilos = DecimalUtil.ZERO ;
      AV32Mts = DecimalUtil.ZERO ;
      AV34Ceros = "" ;
      AV33PzaA = "" ;
      A380DisPieCod = "" ;
      A382DisPieKil = DecimalUtil.ZERO ;
      A384DisPieMet = DecimalUtil.ZERO ;
      A2184DisPieLoc = "" ;
      A6490DisPieIdPz = "" ;
      A8839DisPieCodB = "" ;
      A9983DisPiePda = DecimalUtil.ZERO ;
      P028J12_A396EmprCod = new String[] {""} ;
      P028J12_A65ArtCod = new String[] {""} ;
      P028J12_A252CliCod = new int[1] ;
      P028J12_A7415ArtPmlCru = new short[1] ;
      P028J12_n7415ArtPmlCru = new boolean[] {false} ;
      A65ArtCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pjpfalb__default(),
         new Object[] {
             new Object[] {
            P028J2_A396EmprCod, P028J2_A361DisCod, P028J2_A365DisDes, P028J2_A4469DisCruMts, P028J2_A4470DisCruKgs
            }
            , new Object[] {
            P028J3_A396EmprCod, P028J3_A361DisCod, P028J3_A44AlbRecCod
            }
            , new Object[] {
            }
            , new Object[] {
            P028J5_A396EmprCod, P028J5_A44AlbRecCod, P028J5_A252CliCod, P028J5_A45AlbRef, P028J5_A58AlbRUniEnt, P028J5_A60AlbRUniUti, P028J5_A3613AlbRefDsc, P028J5_A970ProceCod, P028J5_n970ProceCod, P028J5_A1211TipEntCod,
            P028J5_n1211TipEntCod, P028J5_A50AlbRLoc, P028J5_A6463AlbRLote
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P028J8_A396EmprCod, P028J8_A361DisCod, P028J8_A44AlbRecCod, P028J8_A673Piezas, P028J8_A595Kilos, P028J8_A631Metros, P028J8_A3699KilosUti, P028J8_n3699KilosUti, P028J8_A3700MetrosUti, P028J8_n3700MetrosUti,
            P028J8_A3701PiezasUti, P028J8_n3701PiezasUti
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P028J12_A396EmprCod, P028J12_A65ArtCod, P028J12_A252CliCod, P028J12_A7415ArtPmlCru, P028J12_n7415ArtPmlCru
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV24Erfoc ;
   private byte AV25Tejido ;
   private byte AV26Texfina ;
   private byte AV27Scrudo ;
   private byte AV38Tintex ;
   private byte AV40DatosArticulo ;
   private byte GXt_int2 ;
   private byte GXv_int3[] ;
   private byte A47AlbREst ;
   private byte AV36LenVar ;
   private byte A5099DisPieEst ;
   private short AV16PesoMl ;
   private short AV18Procecod ;
   private short AV41Barpes ;
   private short A970ProceCod ;
   private short A1211TipEntCod ;
   private short Gx_err ;
   private short A3701PiezasUti ;
   private short AV35NPz ;
   private short AV30x ;
   private short A2185DisPieAnc ;
   private short A9845DisPieAncc ;
   private short A7415ArtPmlCru ;
   private int AV8DisCod ;
   private int AV11CliCod ;
   private int AV20AlbrPieEnt ;
   private int AV23AlbReccod ;
   private int GXv_int1[] ;
   private int A361DisCod ;
   private int A44AlbRecCod ;
   private int GX_INS7 ;
   private int A252CliCod ;
   private int A52AlbRPieEnt ;
   private int A54AlbRPieUti ;
   private int GX_INS35 ;
   private int A673Piezas ;
   private int GX_INS36 ;
   private java.math.BigDecimal AV14AlbRUniEnt ;
   private java.math.BigDecimal A4469DisCruMts ;
   private java.math.BigDecimal A4470DisCruKgs ;
   private java.math.BigDecimal AV37DisCruMts ;
   private java.math.BigDecimal AV39DisCruKgs ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A631Metros ;
   private java.math.BigDecimal A595Kilos ;
   private java.math.BigDecimal A3699KilosUti ;
   private java.math.BigDecimal A3700MetrosUti ;
   private java.math.BigDecimal AV31Kilos ;
   private java.math.BigDecimal AV32Mts ;
   private java.math.BigDecimal A382DisPieKil ;
   private java.math.BigDecimal A384DisPieMet ;
   private java.math.BigDecimal A9983DisPiePda ;
   private String A396EmprCod ;
   private String AV12AlbRef ;
   private String AV13AlbRefDsc ;
   private String AV19DisUniMed ;
   private String AV22Disacc ;
   private String AV28Modo ;
   private String scmdbuf ;
   private String A365DisDes ;
   private String AV29Disdes ;
   private String A45AlbRef ;
   private String A56AlbRUni ;
   private String A55AlbRReo ;
   private String A3613AlbRefDsc ;
   private String A50AlbRLoc ;
   private String A3360AlbRImp ;
   private String A6463AlbRLote ;
   private String Gx_emsg ;
   private String AV34Ceros ;
   private String AV33PzaA ;
   private String A380DisPieCod ;
   private String A2184DisPieLoc ;
   private String A6490DisPieIdPz ;
   private String A8839DisPieCodB ;
   private String A65ArtCod ;
   private java.util.Date A48AlbRFecUlt ;
   private java.util.Date Gx_date ;
   private java.util.Date A49AlbRFen ;
   private boolean returnInSub ;
   private boolean n970ProceCod ;
   private boolean n1211TipEntCod ;
   private boolean n3699KilosUti ;
   private boolean n3700MetrosUti ;
   private boolean n3701PiezasUti ;
   private boolean n6490DisPieIdPz ;
   private boolean n8839DisPieCodB ;
   private boolean n9845DisPieAncc ;
   private boolean n9983DisPiePda ;
   private boolean n7415ArtPmlCru ;
   private String[] aP11 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private int[] aP6 ;
   private short[] aP7 ;
   private short[] aP8 ;
   private String[] aP9 ;
   private String[] aP10 ;
   private IDataStoreProvider pr_default ;
   private String[] P028J2_A396EmprCod ;
   private int[] P028J2_A361DisCod ;
   private String[] P028J2_A365DisDes ;
   private java.math.BigDecimal[] P028J2_A4469DisCruMts ;
   private java.math.BigDecimal[] P028J2_A4470DisCruKgs ;
   private String[] P028J3_A396EmprCod ;
   private int[] P028J3_A361DisCod ;
   private int[] P028J3_A44AlbRecCod ;
   private String[] P028J5_A396EmprCod ;
   private int[] P028J5_A44AlbRecCod ;
   private int[] P028J5_A252CliCod ;
   private String[] P028J5_A45AlbRef ;
   private java.math.BigDecimal[] P028J5_A58AlbRUniEnt ;
   private java.math.BigDecimal[] P028J5_A60AlbRUniUti ;
   private String[] P028J5_A3613AlbRefDsc ;
   private short[] P028J5_A970ProceCod ;
   private boolean[] P028J5_n970ProceCod ;
   private short[] P028J5_A1211TipEntCod ;
   private boolean[] P028J5_n1211TipEntCod ;
   private String[] P028J5_A50AlbRLoc ;
   private String[] P028J5_A6463AlbRLote ;
   private String[] P028J8_A396EmprCod ;
   private int[] P028J8_A361DisCod ;
   private int[] P028J8_A44AlbRecCod ;
   private int[] P028J8_A673Piezas ;
   private java.math.BigDecimal[] P028J8_A595Kilos ;
   private java.math.BigDecimal[] P028J8_A631Metros ;
   private java.math.BigDecimal[] P028J8_A3699KilosUti ;
   private boolean[] P028J8_n3699KilosUti ;
   private java.math.BigDecimal[] P028J8_A3700MetrosUti ;
   private boolean[] P028J8_n3700MetrosUti ;
   private short[] P028J8_A3701PiezasUti ;
   private boolean[] P028J8_n3701PiezasUti ;
   private String[] P028J12_A396EmprCod ;
   private String[] P028J12_A65ArtCod ;
   private int[] P028J12_A252CliCod ;
   private short[] P028J12_A7415ArtPmlCru ;
   private boolean[] P028J12_n7415ArtPmlCru ;
}

final  class pjpfalb__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P028J2", "SELECT EmprCod, DisCod, DisDes, DisCruMts, DisCruKgs FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P028J3", "SELECT EmprCod, DisCod, AlbRecCod FROM TXPDISALB WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod, AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P028J4", "INSERT INTO TXPALBREC(EmprCod, AlbRecCod, CliCod, AlbRef, AlbRPieEnt, AlbRUni, AlbRLoc, AlbRFen, AlbRUniEnt, AlbRReo, AlbRPieUti, AlbRUniUti, AlbRFecUlt, AlbREst, TipEntCod, ProceCod, AlbRImp, AlbRefDsc, AlbRLote, TrnCod, AlbREnt, AlbRPieReb, AlbRUniReb, AlbNumEti, AlbRDes, AlbRUlin, HisEmpULin, AlbRDisCli, AlbPmPPza, AlbRTam, AlbRMdlCod, AlbRUniLot, AlbRPieLot, AlbRHEn, ClasCod, AlbRGrm2, AlbRAnc, AlbPml, AlbRPre, AlbRAju, AlbRRep, AlbREnt2, AlbrUsu, AlbrHor, AlbrUniC, AlbrPieC, AlbrNF, AlbrFeNf, AlbrCfop, AlbRTartC, AlbRTelar, AlbRLu, AlbRTara, AlbRUniB, AlbDocPrv, AlbRUdas, AlmCod, MatC_ULin, AlbRecSec, AlbColor, AlbOpsT, AlbOpsC, AlbOC, AlbHdri, AlbNumB, AlbNumM, AlbAncC, AlbDndC, AlbAncCr, AlbDndCr, AlbGalga, AlbMaqTej, AlbDmt, Bod_UltPz, Emp_Item1, AlbPdaC, AlbOStj, AlbStLot, AlbTurno, AlbUltP, Cod_mta, AlbOEKOTEX, AlbRPh, AlbRRLong, AlbRRTrans, AlbRLot2) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ' ', 0, 0, 0, ' ', 0, 0, ' ', 0, ' ', ' ', 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, 0, 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, ' ', 0, 0, 0, ' ', 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, 0, 0, 0, ' ', 0, ' ', ' ', ' ', ' ', 0, 0, 0, 0, ' ', 0, 0, 0, ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBREC")
         ,new ForEachCursor("P028J5", "SELECT EmprCod, AlbRecCod, CliCod, AlbRef, AlbRUniEnt, AlbRUniUti, AlbRefDsc, ProceCod, TipEntCod, AlbRLoc, AlbRLote FROM TXPALBREC WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P028J6", "UPDATE TXPALBREC SET CliCod=?, AlbRef=?, AlbRUniEnt=?, AlbRUniUti=?, AlbRefDsc=?, ProceCod=?, TipEntCod=?, AlbRLoc=?, AlbRLote=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBREC")
         ,new UpdateCursor("P028J7", "INSERT INTO TXPDISALB(EmprCod, DisCod, AlbRecCod, Piezas, Kilos, Metros, KilosUti, MetrosUti, PiezasUti) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISALB")
         ,new ForEachCursor("P028J8", "SELECT EmprCod, DisCod, AlbRecCod, Piezas, Kilos, Metros, KilosUti, MetrosUti, PiezasUti FROM TXPDISALB WHERE EmprCod = ? and DisCod = ? and AlbRecCod = ? ORDER BY EmprCod, DisCod, AlbRecCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P028J9", "UPDATE TXPDISALB SET Piezas=?, Kilos=?, Metros=?, KilosUti=?, MetrosUti=?, PiezasUti=?  WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISALB")
         ,new UpdateCursor("P028J10", "DELETE FROM TXPDISALD  WHERE EmprCod = ? and DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISALD")
         ,new UpdateCursor("P028J11", "INSERT INTO TXPDISALD(EmprCod, DisCod, AlbRecCod, DisPieCod, DisPieKil, DisPieMet, DisPieLoc, DisPieAnc, DisPieEst, DisPieIdPz, DisPieCodB, DisPieAncc, DisPiePda) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISALD")
         ,new ForEachCursor("P028J12", "SELECT EmprCod, ArtCod, CliCod, ArtPmlCru FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 10);
               ((String[]) buf[12])[0] = rslt.getString(11, 20);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
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
               return;
            case 2 :
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
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 16);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setString(5, (String)parms[4], 26);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[6]).shortValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[8]).shortValue());
               }
               stmt.setString(8, (String)parms[9], 10);
               stmt.setString(9, (String)parms[10], 20);
               stmt.setString(10, (String)parms[11], 3);
               stmt.setInt(11, ((Number) parms[12]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[7], 2);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[9], 2);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[11]).shortValue());
               }
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 7 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[4], 2);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[6], 2);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[8]).shortValue());
               }
               stmt.setString(7, (String)parms[9], 3);
               stmt.setInt(8, ((Number) parms[10]).intValue());
               stmt.setInt(9, ((Number) parms[11]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 9);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               stmt.setString(7, (String)parms[6], 10);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[10], 15);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[12], 20);
               }
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
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[16], 2);
               }
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
      }
   }

}

