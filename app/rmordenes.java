package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class rmordenes extends GXReport
{
   public rmordenes( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rmordenes.class ), "" );
   }

   public rmordenes( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          String[] aP2 ,
                          String[] aP3 ,
                          int[] aP4 ,
                          int[] aP5 )
   {
      rmordenes.this.aP5 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, reportHandler);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        int[] aP5 ,
                        IReportHandler reportHandler )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, reportHandler);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             int[] aP5 ,
                             IReportHandler reportHandler )
   {
      rmordenes.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      rmordenes.this.A9425OMCod = aP1[0];
      this.aP1 = aP1;
      rmordenes.this.AV13Tipo = aP2[0];
      this.aP2 = aP2;
      rmordenes.this.Gx_out = aP3[0];
      this.aP3 = aP3;
      rmordenes.this.Gx_page = aP4[0];
      this.aP4 = aP4;
      rmordenes.this.Gx_line = aP5[0];
      this.aP5 = aP5;
      this.reportHandler = reportHandler;
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
      try
      {
         setPrinter(reportHandler);
         P_lines = getPrinter().getPageLines();
         lineHeight = getPrinter().getLineHeight();
         M_top = getPrinter().getM_top();
         M_bot = getPrinter().getM_bot();
         Gx_page = getPrinter().getPage();
         GXt_int1 = AV25coloretto ;
         GXv_int2[0] = GXt_int1 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CNT000", ""), GXv_int2) ;
         rmordenes.this.GXt_int1 = GXv_int2[0] ;
         AV25coloretto = GXt_int1 ;
         /* Using cursor P07I92 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P07I92_A407EmprNom[0] ;
            n407EmprNom = P07I92_n407EmprNom[0] ;
            AV12NomEmp = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV8Lit0 = AV38Pgmdesc ;
         GXt_char3 = AV31Lit1 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char4) ;
         rmordenes.this.GXt_char3 = GXv_char4[0] ;
         AV31Lit1 = GXt_char3 ;
         GXt_char3 = AV10Lit2 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char4) ;
         rmordenes.this.GXt_char3 = GXv_char4[0] ;
         AV10Lit2 = GXt_char3 ;
         GXt_char3 = AV11Lit3 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char4) ;
         rmordenes.this.GXt_char3 = GXv_char4[0] ;
         AV11Lit3 = GXt_char3 ;
         AV26Lit10 = ((AV25coloretto==1) ? httpContext.getMessage( "Stock", "") : httpContext.getMessage( "Precio", "")) ;
         AV27Lit11 = ((AV25coloretto==1) ? httpContext.getMessage( "Stock", "") : httpContext.getMessage( "Precio", "")) ;
         GxHdr3 = true ;
         /* Using cursor P07I95 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A9426OMMaqCod = P07I95_A9426OMMaqCod[0] ;
            A9428SMCod = P07I95_A9428SMCod[0] ;
            n9428SMCod = P07I95_n9428SMCod[0] ;
            A9429PMCod = P07I95_A9429PMCod[0] ;
            n9429PMCod = P07I95_n9429PMCod[0] ;
            A9437OMUsuCre = P07I95_A9437OMUsuCre[0] ;
            A9435OMOpeResN = P07I95_A9435OMOpeResN[0] ;
            n9435OMOpeResN = P07I95_n9435OMOpeResN[0] ;
            A9434OMOpeRes = P07I95_A9434OMOpeRes[0] ;
            n9434OMOpeRes = P07I95_n9434OMOpeRes[0] ;
            A9427OMMaqDsc = P07I95_A9427OMMaqDsc[0] ;
            n9427OMMaqDsc = P07I95_n9427OMMaqDsc[0] ;
            A9438OMFchPre = P07I95_A9438OMFchPre[0] ;
            A9436OMFchCre = P07I95_A9436OMFchCre[0] ;
            A9433OMTxt = P07I95_A9433OMTxt[0] ;
            A9464OMNot = P07I95_A9464OMNot[0] ;
            A9441OMMCCosT = P07I95_A9441OMMCCosT[0] ;
            A9443OMRCCosT = P07I95_A9443OMRCCosT[0] ;
            A9445OMEst = P07I95_A9445OMEst[0] ;
            A9442OMMRCosT = P07I95_A9442OMMRCosT[0] ;
            A9444OMRRCosT = P07I95_A9444OMRRCosT[0] ;
            A9427OMMaqDsc = P07I95_A9427OMMaqDsc[0] ;
            n9427OMMaqDsc = P07I95_n9427OMMaqDsc[0] ;
            A9435OMOpeResN = P07I95_A9435OMOpeResN[0] ;
            n9435OMOpeResN = P07I95_n9435OMOpeResN[0] ;
            A9443OMRCCosT = P07I95_A9443OMRCCosT[0] ;
            A9444OMRRCosT = P07I95_A9444OMRRCosT[0] ;
            A9441OMMCCosT = P07I95_A9441OMMCCosT[0] ;
            A9442OMMRCosT = P07I95_A9442OMMRCosT[0] ;
            if ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "P", "")) == 0 )
            {
               A9440OMCosRea = A9444OMRRCosT.add(A9442OMMRCosT) ;
            }
            else
            {
               if ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "R", "")) == 0 )
               {
                  A9440OMCosRea = A9443OMRCCosT.add(A9441OMMCCosT) ;
               }
               else
               {
                  A9440OMCosRea = DecimalUtil.doubleToDec(0) ;
               }
            }
            if ( GXutil.strcmp(AV13Tipo, httpContext.getMessage( "D", "")) == 0 )
            {
               AV16OMEstDsc = ((GXutil.strcmp(A9445OMEst, httpContext.getMessage( "P", ""))==0) ? httpContext.getMessage( "Pendiente", "") : httpContext.getMessage( "Realizado", "")) ;
            }
            AV23OMMaqCod = A9426OMMaqCod ;
            h7I90( false, 60) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9425OMCod), "ZZZZZZZ9")), 95, Gx_line+0, 154, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A9440OMCosRea, "ZZ,ZZZ,ZZ9.999")), 429, Gx_line+40, 532, Gx_line+57, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( A9436OMFchCre, "99/99/99 99:99"), 540, Gx_line+0, 643, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( A9438OMFchPre, "99/99/99"), 706, Gx_line+0, 765, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9426OMMaqCod, "")), 224, Gx_line+0, 269, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9427OMMaqDsc, "")), 271, Gx_line+0, 389, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9434OMOpeRes), "ZZZZZ9")), 109, Gx_line+40, 154, Gx_line+57, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9435OMOpeResN, "")), 169, Gx_line+40, 389, Gx_line+57, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9437OMUsuCre, "@!")), 473, Gx_line+0, 532, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9429PMCod), "ZZZZZZZ9")), 257, Gx_line+20, 316, Gx_line+37, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9428SMCod), "ZZZZZZZ9")), 95, Gx_line+20, 154, Gx_line+37, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Orden", ""), 14, Gx_line+1, 50, Gx_line+15, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Maquina", ""), 169, Gx_line+1, 220, Gx_line+15, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Creado", ""), 395, Gx_line+1, 438, Gx_line+15, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Solicitud", ""), 14, Gx_line+21, 66, Gx_line+35, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Programación", ""), 169, Gx_line+21, 250, Gx_line+35, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Responsable", ""), 14, Gx_line+41, 91, Gx_line+55, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Previsto", ""), 649, Gx_line+1, 698, Gx_line+15, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Costo", ""), 395, Gx_line+41, 429, Gx_line+55, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+60) ;
            h7I90( false, 17) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Tareas", ""), 14, Gx_line+2, 56, Gx_line+16, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+17) ;
            /* Noskip command */
            Gx_line = Gx_OldLine ;
            AV43GXLvl28 = (byte)(0) ;
            /* Using cursor P07I96 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A9430TMCod = P07I96_A9430TMCod[0] ;
               A9431TMDsc = P07I96_A9431TMDsc[0] ;
               n9431TMDsc = P07I96_n9431TMDsc[0] ;
               A9431TMDsc = P07I96_A9431TMDsc[0] ;
               n9431TMDsc = P07I96_n9431TMDsc[0] ;
               AV43GXLvl28 = (byte)(1) ;
               h7I90( false, 17) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9430TMCod), "ZZZZZZZ9")), 95, Gx_line+0, 154, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9431TMDsc, "")), 169, Gx_line+0, 389, Gx_line+17, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               AV24Piezas = (short)(0) ;
               /* Using cursor P07I97 */
               pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9430TMCod)});
               while ( (pr_default.getStatus(3) != 101) )
               {
                  A12638TMOMMPieCo = P07I97_A12638TMOMMPieCo[0] ;
                  A12637TMOMMSEqCo = P07I97_A12637TMOMMSEqCo[0] ;
                  A12636TMOMMEquCo = P07I97_A12636TMOMMEquCo[0] ;
                  if ( AV24Piezas == 0 )
                  {
                     h7I90( false, 17) ;
                     getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Piezas", ""), 95, Gx_line+0, 135, Gx_line+14, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+17) ;
                     /* Noskip command */
                     Gx_line = Gx_OldLine ;
                     AV24Piezas = (short)(1) ;
                  }
                  GXv_char4[0] = A396EmprCod ;
                  GXv_char5[0] = AV23OMMaqCod ;
                  GXv_char6[0] = A12636TMOMMEquCo ;
                  GXv_char7[0] = A12637TMOMMSEqCo ;
                  GXv_char8[0] = A12638TMOMMPieCo ;
                  GXv_char9[0] = AV22MaqPieDsc ;
                  new app.pmaqpiedsc(remoteHandle, context).execute( GXv_char4, GXv_char5, GXv_char6, GXv_char7, GXv_char8, GXv_char9) ;
                  rmordenes.this.A396EmprCod = GXv_char4[0] ;
                  rmordenes.this.AV23OMMaqCod = GXv_char5[0] ;
                  rmordenes.this.A12636TMOMMEquCo = GXv_char6[0] ;
                  rmordenes.this.A12637TMOMMSEqCo = GXv_char7[0] ;
                  rmordenes.this.A12638TMOMMPieCo = GXv_char8[0] ;
                  rmordenes.this.AV22MaqPieDsc = GXv_char9[0] ;
                  h7I90( false, 21) ;
                  getPrinter().GxAttris("Courier New", 9, false, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A12638TMOMMPieCo, "")), 170, Gx_line+1, 244, Gx_line+19, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22MaqPieDsc, "")), 247, Gx_line+1, 548, Gx_line+17, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+21) ;
                  pr_default.readNext(3);
               }
               pr_default.close(3);
               pr_default.readNext(2);
            }
            pr_default.close(2);
            if ( AV43GXLvl28 == 0 )
            {
               Gx_line = (int)(Gx_line+16) ;
            }
            h7I90( false, 17) ;
            getPrinter().GxDrawLine(14, Gx_line+7, 813, Gx_line+7, 2, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+17) ;
            if ( GXutil.strcmp(AV13Tipo, httpContext.getMessage( "D", "")) == 0 )
            {
               AV19n = (short)(GXutil.gxmlines( A9433OMTxt, (short)(80))) ;
               if ( AV19n > 0 )
               {
                  h7I90( false, 17) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Texto", ""), 14, Gx_line+0, 48, Gx_line+14, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+17) ;
                  /* Noskip command */
                  Gx_line = Gx_OldLine ;
               }
               AV21i = (short)(1) ;
               while ( AV21i <= AV19n )
               {
                  AV20t = GXutil.gxgetmli( A9433OMTxt, AV21i, (short)(80)) ;
                  h7I90( false, 17) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20t, "")), 143, Gx_line+0, 727, Gx_line+17, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+17) ;
                  AV21i = (short)(AV21i+1) ;
               }
               if ( AV19n > 0 )
               {
                  h7I90( false, 17) ;
                  getPrinter().GxDrawLine(14, Gx_line+7, 813, Gx_line+7, 2, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+17) ;
               }
               AV19n = (short)(GXutil.gxmlines( A9464OMNot, (short)(80))) ;
               if ( AV19n > 0 )
               {
                  h7I90( false, 17) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Notas", ""), 14, Gx_line+0, 49, Gx_line+14, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+17) ;
                  /* Noskip command */
                  Gx_line = Gx_OldLine ;
               }
               AV21i = (short)(1) ;
               while ( AV21i <= AV19n )
               {
                  AV20t = GXutil.gxgetmli( A9464OMNot, AV21i, (short)(80)) ;
                  h7I90( false, 17) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20t, "")), 143, Gx_line+0, 727, Gx_line+17, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+17) ;
                  AV21i = (short)(AV21i+1) ;
               }
               if ( AV19n > 0 )
               {
                  h7I90( false, 17) ;
                  getPrinter().GxDrawLine(14, Gx_line+7, 813, Gx_line+7, 2, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+17) ;
               }
            }
            AV17Flag = (byte)(0) ;
            GxHdr7 = true ;
            /* Using cursor P07I98 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A9449OMRTpo = P07I98_A9449OMRTpo[0] ;
               A9446OMRepCod = P07I98_A9446OMRepCod[0] ;
               A9447OMRepNom = P07I98_A9447OMRepNom[0] ;
               n9447OMRepNom = P07I98_n9447OMRepNom[0] ;
               A9453OMRCPre = P07I98_A9453OMRCPre[0] ;
               A9452OMRCCnt = P07I98_A9452OMRCCnt[0] ;
               A9451OMRRPre = P07I98_A9451OMRRPre[0] ;
               A9450OMRRCnt = P07I98_A9450OMRRCnt[0] ;
               A9447OMRepNom = P07I98_A9447OMRepNom[0] ;
               n9447OMRepNom = P07I98_n9447OMRepNom[0] ;
               if ( GXutil.strcmp(AV13Tipo, httpContext.getMessage( "D", "")) == 0 )
               {
                  if ( ( ( GXutil.strcmp(A9449OMRTpo, httpContext.getMessage( "R", "")) == 0 ) && ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "P", "")) == 0 ) ) || ( ( GXutil.strcmp(A9449OMRTpo, httpContext.getMessage( "C", "")) == 0 ) && ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "R", "")) == 0 ) ) )
                  {
                     A9471OMRRCos = A9450OMRRCnt.multiply(A9451OMRRPre) ;
                     A9454OMRCCos = A9452OMRCCnt.multiply(A9453OMRCPre) ;
                     AV28Mrcod = A9446OMRepCod ;
                     /* Execute user subroutine: 'MREPUESTOS' */
                     S111 ();
                     if ( returnInSub )
                     {
                        pr_default.close(4);
                        pr_default.close(4);
                        pr_default.close(1);
                        pr_default.close(1);
                        pr_default.close(1);
                        pr_default.close(1);
                        pr_default.close(1);
                        getPrinter().GxEndPage() ;
                        returnInSub = true;
                        cleanup();
                        if (true) return;
                     }
                     AV30OMRRpre = ((AV25coloretto==0) ? A9451OMRRPre : AV29MrStkAct) ;
                     if ( AV17Flag == 0 )
                     {
                        h7I90( false, 19) ;
                        getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(httpContext.getMessage( "Cantidad", ""), 443, Gx_line+0, 496, Gx_line+14, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(httpContext.getMessage( "Repuesto", ""), 143, Gx_line+0, 200, Gx_line+14, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(httpContext.getMessage( "Costo", ""), 717, Gx_line+0, 751, Gx_line+14, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawLine(143, Gx_line+15, 362, Gx_line+15, 1, 0, 0, 0, 0) ;
                        getPrinter().GxDrawLine(394, Gx_line+15, 496, Gx_line+15, 1, 0, 0, 0, 0) ;
                        getPrinter().GxDrawLine(52, Gx_line+15, 110, Gx_line+15, 1, 0, 0, 0, 0) ;
                        getPrinter().GxDrawLine(531, Gx_line+15, 633, Gx_line+15, 1, 0, 0, 0, 0) ;
                        getPrinter().GxDrawLine(664, Gx_line+15, 752, Gx_line+15, 1, 0, 0, 0, 0) ;
                        getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27Lit11, "")), 571, Gx_line+0, 635, Gx_line+15, 2+256, 0, 0, 0) ;
                        Gx_OldLine = Gx_line ;
                        Gx_line = (int)(Gx_line+19) ;
                        AV17Flag = (byte)(1) ;
                     }
                     if ( GXutil.strcmp(A9449OMRTpo, httpContext.getMessage( "R", "")) == 0 )
                     {
                        h7I90( false, 17) ;
                        getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9446OMRepCod), "ZZZZZZZ9")), 52, Gx_line+0, 111, Gx_line+17, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9447OMRepNom, "")), 143, Gx_line+0, 873, Gx_line+17, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A9450OMRRCnt, "ZZ,ZZZ,ZZ9.999")), 394, Gx_line+0, 497, Gx_line+17, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A9471OMRRCos, "ZZZZZZZ9.999")), 664, Gx_line+0, 753, Gx_line+17, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV30OMRRpre, "ZZ,ZZZ,ZZ9.999")), 528, Gx_line+0, 631, Gx_line+17, 2+256, 0, 0, 0) ;
                        Gx_OldLine = Gx_line ;
                        Gx_line = (int)(Gx_line+17) ;
                     }
                     else
                     {
                        h7I90( false, 17) ;
                        getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9446OMRepCod), "ZZZZZZZ9")), 52, Gx_line+0, 111, Gx_line+17, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A9452OMRCCnt, "ZZ,ZZZ,ZZ9.999")), 394, Gx_line+0, 497, Gx_line+17, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A9454OMRCCos, "ZZZZZZZ9.999")), 664, Gx_line+0, 753, Gx_line+17, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV30OMRRpre, "ZZ,ZZZ,ZZ9.999")), 528, Gx_line+0, 631, Gx_line+17, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9447OMRepNom, "")), 143, Gx_line+0, 873, Gx_line+17, 0+256, 0, 0, 0) ;
                        Gx_OldLine = Gx_line ;
                        Gx_line = (int)(Gx_line+17) ;
                     }
                  }
               }
               pr_default.readNext(4);
            }
            pr_default.close(4);
            GxHdr7 = false ;
            if ( AV17Flag == 1 )
            {
               h7I90( false, 17) ;
               getPrinter().GxDrawLine(14, Gx_line+7, 813, Gx_line+7, 2, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
            }
            AV17Flag = (byte)(0) ;
            GxHdr9 = true ;
            /* Using cursor P07I99 */
            pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
            while ( (pr_default.getStatus(5) != 101) )
            {
               A9458OMMTpo = P07I99_A9458OMMTpo[0] ;
               A9456OMOpeNom = P07I99_A9456OMOpeNom[0] ;
               n9456OMOpeNom = P07I99_n9456OMOpeNom[0] ;
               A9455OMOpeCod = P07I99_A9455OMOpeCod[0] ;
               A9462OMMCPre = P07I99_A9462OMMCPre[0] ;
               A9461OMMCCnt = P07I99_A9461OMMCCnt[0] ;
               A9460OMMRPre = P07I99_A9460OMMRPre[0] ;
               A9459OMMRCnt = P07I99_A9459OMMRCnt[0] ;
               A9456OMOpeNom = P07I99_A9456OMOpeNom[0] ;
               n9456OMOpeNom = P07I99_n9456OMOpeNom[0] ;
               if ( GXutil.strcmp(AV13Tipo, httpContext.getMessage( "D", "")) == 0 )
               {
                  if ( ( ( GXutil.strcmp(A9458OMMTpo, httpContext.getMessage( "R", "")) == 0 ) && ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "P", "")) == 0 ) ) || ( ( GXutil.strcmp(A9458OMMTpo, httpContext.getMessage( "C", "")) == 0 ) && ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "R", "")) == 0 ) ) )
                  {
                     A9472OMMRCos = A9459OMMRCnt.multiply(A9460OMMRPre) ;
                     A9463OMMCCos = A9461OMMCCnt.multiply(A9462OMMCPre) ;
                     if ( AV17Flag == 0 )
                     {
                        h7I90( false, 17) ;
                        getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(httpContext.getMessage( "Cantidad", ""), 444, Gx_line+0, 497, Gx_line+14, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(httpContext.getMessage( "Precio", ""), 593, Gx_line+0, 632, Gx_line+14, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(httpContext.getMessage( "Costo", ""), 718, Gx_line+0, 752, Gx_line+14, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawLine(144, Gx_line+13, 363, Gx_line+13, 1, 0, 0, 0, 0) ;
                        getPrinter().GxDrawLine(395, Gx_line+13, 497, Gx_line+13, 1, 0, 0, 0, 0) ;
                        getPrinter().GxDrawLine(53, Gx_line+13, 111, Gx_line+13, 1, 0, 0, 0, 0) ;
                        getPrinter().GxDrawLine(529, Gx_line+13, 631, Gx_line+13, 1, 0, 0, 0, 0) ;
                        getPrinter().GxDrawLine(665, Gx_line+13, 753, Gx_line+13, 1, 0, 0, 0, 0) ;
                        getPrinter().GxDrawText(httpContext.getMessage( "Tecnico", ""), 144, Gx_line+0, 193, Gx_line+14, 0+256, 0, 0, 0) ;
                        Gx_OldLine = Gx_line ;
                        Gx_line = (int)(Gx_line+17) ;
                        AV17Flag = (byte)(1) ;
                     }
                     if ( GXutil.strcmp(A9458OMMTpo, httpContext.getMessage( "R", "")) == 0 )
                     {
                        h7I90( false, 17) ;
                        getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9455OMOpeCod), "ZZZZZ9")), 68, Gx_line+0, 113, Gx_line+17, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A9459OMMRCnt, "ZZ,ZZZ,ZZ9.999")), 394, Gx_line+0, 497, Gx_line+17, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A9472OMMRCos, "ZZZZZZZ9.999")), 664, Gx_line+0, 753, Gx_line+17, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A9460OMMRPre, "ZZ,ZZZ,ZZ9.999")), 528, Gx_line+0, 631, Gx_line+17, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9456OMOpeNom, "")), 143, Gx_line+0, 363, Gx_line+17, 0+256, 0, 0, 0) ;
                        Gx_OldLine = Gx_line ;
                        Gx_line = (int)(Gx_line+17) ;
                     }
                     else
                     {
                        h7I90( false, 17) ;
                        getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9455OMOpeCod), "ZZZZZ9")), 68, Gx_line+0, 113, Gx_line+17, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A9461OMMCCnt, "ZZ,ZZZ,ZZ9.999")), 394, Gx_line+0, 497, Gx_line+17, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A9463OMMCCos, "ZZZZZZZ9.999")), 664, Gx_line+0, 753, Gx_line+17, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A9462OMMCPre, "ZZ,ZZZ,ZZ9.999")), 528, Gx_line+0, 631, Gx_line+17, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9456OMOpeNom, "")), 143, Gx_line+0, 363, Gx_line+17, 0+256, 0, 0, 0) ;
                        Gx_OldLine = Gx_line ;
                        Gx_line = (int)(Gx_line+17) ;
                     }
                  }
               }
               pr_default.readNext(5);
            }
            pr_default.close(5);
            GxHdr9 = false ;
            if ( AV17Flag == 1 )
            {
               h7I90( false, 17) ;
               getPrinter().GxDrawLine(14, Gx_line+7, 813, Gx_line+7, 2, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               if ( AV25coloretto == 1 )
               {
                  h7I90( false, 54) ;
                  getPrinter().GxDrawLine(54, Gx_line+27, 150, Gx_line+27, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(190, Gx_line+27, 286, Gx_line+27, 1, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Realizado", ""), 73, Gx_line+31, 132, Gx_line+45, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Entregado", ""), 204, Gx_line+31, 265, Gx_line+45, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(501, Gx_line+27, 597, Gx_line+27, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(636, Gx_line+27, 732, Gx_line+27, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Inicio", ""), 532, Gx_line+31, 565, Gx_line+45, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Fin", ""), 675, Gx_line+31, 694, Gx_line+45, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+54) ;
               }
            }
            else
            {
               if ( AV25coloretto == 1 )
               {
                  h7I90( false, 54) ;
                  getPrinter().GxDrawLine(54, Gx_line+27, 150, Gx_line+27, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(190, Gx_line+27, 286, Gx_line+27, 1, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Realizado", ""), 73, Gx_line+31, 132, Gx_line+45, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Entregado", ""), 204, Gx_line+31, 265, Gx_line+45, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(501, Gx_line+27, 597, Gx_line+27, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(636, Gx_line+27, 732, Gx_line+27, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Inicio", ""), 532, Gx_line+31, 565, Gx_line+45, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Fin", ""), 675, Gx_line+31, 694, Gx_line+45, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+54) ;
               }
            }
            if ( GXutil.strcmp(AV13Tipo, httpContext.getMessage( "D", "")) == 0 )
            {
               /* Eject command */
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(P_lines+1) ;
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         GxHdr3 = false ;
         /* Force skipping of lines */
         h7I90( false, 0) ;
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void S111( ) throws ProcessInterruptedException
   {
      /* 'MREPUESTOS' Routine */
      returnInSub = false ;
      AV29MrStkAct = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P07I910 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(AV28Mrcod)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A9492MRCod = P07I910_A9492MRCod[0] ;
         A9495MRStkAct = P07I910_A9495MRStkAct[0] ;
         n9495MRStkAct = P07I910_n9495MRStkAct[0] ;
         AV29MrStkAct = A9495MRStkAct ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(6);
   }

   public void h7I90( boolean bFoot ,
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
               getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV8Lit0, "")), 14, Gx_line+50, 181, Gx_line+70, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31Lit1, "")), 528, Gx_line+10, 592, Gx_line+27, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 596, Gx_line+10, 647, Gx_line+27, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10Lit2, "")), 650, Gx_line+10, 701, Gx_line+27, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 704, Gx_line+10, 797, Gx_line+27, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV11Lit3, "")), 636, Gx_line+52, 712, Gx_line+69, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 718, Gx_line+52, 745, Gx_line+68, 2, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12NomEmp, "")), 14, Gx_line+9, 234, Gx_line+29, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42Pgmname, "")), 528, Gx_line+52, 685, Gx_line+69, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(14, Gx_line+77, 813, Gx_line+77, 2, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText("/", 749, Gx_line+52, 756, Gx_line+68, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "{{Pages}}", ""), 760, Gx_line+52, 787, Gx_line+68, 2, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 18, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV16OMEstDsc, "")), 356, Gx_line+40, 472, Gx_line+71, 1+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+82) ;
            }
            if ( GxHdr7 )
            {
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cantidad", ""), 443, Gx_line+0, 496, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Costo", ""), 717, Gx_line+0, 751, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(143, Gx_line+14, 362, Gx_line+14, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(394, Gx_line+14, 496, Gx_line+14, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(52, Gx_line+14, 110, Gx_line+14, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(528, Gx_line+14, 630, Gx_line+14, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(664, Gx_line+14, 752, Gx_line+14, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Repuesto", ""), 143, Gx_line+0, 200, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26Lit10, "")), 568, Gx_line+0, 632, Gx_line+15, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+18) ;
            }
            if ( GxHdr9 )
            {
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cantidad", ""), 444, Gx_line+0, 497, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Precio", ""), 593, Gx_line+0, 632, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Costo", ""), 718, Gx_line+0, 752, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(144, Gx_line+13, 363, Gx_line+13, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(395, Gx_line+13, 497, Gx_line+13, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(53, Gx_line+13, 111, Gx_line+13, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(529, Gx_line+13, 631, Gx_line+13, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(665, Gx_line+13, 753, Gx_line+13, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Tecnico", ""), 144, Gx_line+0, 193, Gx_line+14, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
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
      this.aP0[0] = rmordenes.this.A396EmprCod;
      this.aP1[0] = rmordenes.this.A9425OMCod;
      this.aP2[0] = rmordenes.this.AV13Tipo;
      this.aP3[0] = rmordenes.this.Gx_out;
      this.aP4[0] = rmordenes.this.Gx_page;
      this.aP5[0] = rmordenes.this.Gx_line;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int2 = new byte[1] ;
      scmdbuf = "" ;
      P07I92_A396EmprCod = new String[] {""} ;
      P07I92_A407EmprNom = new String[] {""} ;
      P07I92_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV12NomEmp = "" ;
      AV8Lit0 = "" ;
      AV38Pgmdesc = "" ;
      AV31Lit1 = "" ;
      AV10Lit2 = "" ;
      AV11Lit3 = "" ;
      GXt_char3 = "" ;
      AV26Lit10 = "" ;
      AV27Lit11 = "" ;
      P07I95_A396EmprCod = new String[] {""} ;
      P07I95_A9425OMCod = new int[1] ;
      P07I95_A9426OMMaqCod = new String[] {""} ;
      P07I95_A9428SMCod = new int[1] ;
      P07I95_n9428SMCod = new boolean[] {false} ;
      P07I95_A9429PMCod = new int[1] ;
      P07I95_n9429PMCod = new boolean[] {false} ;
      P07I95_A9437OMUsuCre = new String[] {""} ;
      P07I95_A9435OMOpeResN = new String[] {""} ;
      P07I95_n9435OMOpeResN = new boolean[] {false} ;
      P07I95_A9434OMOpeRes = new int[1] ;
      P07I95_n9434OMOpeRes = new boolean[] {false} ;
      P07I95_A9427OMMaqDsc = new String[] {""} ;
      P07I95_n9427OMMaqDsc = new boolean[] {false} ;
      P07I95_A9438OMFchPre = new java.util.Date[] {GXutil.nullDate()} ;
      P07I95_A9436OMFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      P07I95_A9433OMTxt = new String[] {""} ;
      P07I95_A9464OMNot = new String[] {""} ;
      P07I95_A9441OMMCCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07I95_A9443OMRCCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07I95_A9445OMEst = new String[] {""} ;
      P07I95_A9442OMMRCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07I95_A9444OMRRCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A9426OMMaqCod = "" ;
      A9437OMUsuCre = "" ;
      A9435OMOpeResN = "" ;
      A9427OMMaqDsc = "" ;
      A9438OMFchPre = GXutil.nullDate() ;
      A9436OMFchCre = GXutil.resetTime( GXutil.nullDate() );
      A9433OMTxt = "" ;
      A9464OMNot = "" ;
      A9441OMMCCosT = DecimalUtil.ZERO ;
      A9443OMRCCosT = DecimalUtil.ZERO ;
      A9445OMEst = "" ;
      A9442OMMRCosT = DecimalUtil.ZERO ;
      A9444OMRRCosT = DecimalUtil.ZERO ;
      A9440OMCosRea = DecimalUtil.ZERO ;
      AV16OMEstDsc = "" ;
      AV23OMMaqCod = "" ;
      P07I96_A396EmprCod = new String[] {""} ;
      P07I96_A9425OMCod = new int[1] ;
      P07I96_A9430TMCod = new int[1] ;
      P07I96_A9431TMDsc = new String[] {""} ;
      P07I96_n9431TMDsc = new boolean[] {false} ;
      A9431TMDsc = "" ;
      P07I97_A396EmprCod = new String[] {""} ;
      P07I97_A9425OMCod = new int[1] ;
      P07I97_A9430TMCod = new int[1] ;
      P07I97_A12638TMOMMPieCo = new String[] {""} ;
      P07I97_A12637TMOMMSEqCo = new String[] {""} ;
      P07I97_A12636TMOMMEquCo = new String[] {""} ;
      A12638TMOMMPieCo = "" ;
      A12637TMOMMSEqCo = "" ;
      A12636TMOMMEquCo = "" ;
      GXv_char4 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_char6 = new String[1] ;
      GXv_char7 = new String[1] ;
      GXv_char8 = new String[1] ;
      AV22MaqPieDsc = "" ;
      GXv_char9 = new String[1] ;
      AV20t = "" ;
      P07I98_A396EmprCod = new String[] {""} ;
      P07I98_A9425OMCod = new int[1] ;
      P07I98_A9449OMRTpo = new String[] {""} ;
      P07I98_A9446OMRepCod = new int[1] ;
      P07I98_A9447OMRepNom = new String[] {""} ;
      P07I98_n9447OMRepNom = new boolean[] {false} ;
      P07I98_A9453OMRCPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07I98_A9452OMRCCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07I98_A9451OMRRPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07I98_A9450OMRRCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A9449OMRTpo = "" ;
      A9447OMRepNom = "" ;
      A9453OMRCPre = DecimalUtil.ZERO ;
      A9452OMRCCnt = DecimalUtil.ZERO ;
      A9451OMRRPre = DecimalUtil.ZERO ;
      A9450OMRRCnt = DecimalUtil.ZERO ;
      A9471OMRRCos = DecimalUtil.ZERO ;
      A9454OMRCCos = DecimalUtil.ZERO ;
      AV30OMRRpre = DecimalUtil.ZERO ;
      AV29MrStkAct = DecimalUtil.ZERO ;
      P07I99_A396EmprCod = new String[] {""} ;
      P07I99_A9425OMCod = new int[1] ;
      P07I99_A9458OMMTpo = new String[] {""} ;
      P07I99_A9456OMOpeNom = new String[] {""} ;
      P07I99_n9456OMOpeNom = new boolean[] {false} ;
      P07I99_A9455OMOpeCod = new int[1] ;
      P07I99_A9462OMMCPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07I99_A9461OMMCCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07I99_A9460OMMRPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07I99_A9459OMMRCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A9458OMMTpo = "" ;
      A9456OMOpeNom = "" ;
      A9462OMMCPre = DecimalUtil.ZERO ;
      A9461OMMCCnt = DecimalUtil.ZERO ;
      A9460OMMRPre = DecimalUtil.ZERO ;
      A9459OMMRCnt = DecimalUtil.ZERO ;
      A9472OMMRCos = DecimalUtil.ZERO ;
      A9463OMMCCos = DecimalUtil.ZERO ;
      P07I910_A396EmprCod = new String[] {""} ;
      P07I910_A9492MRCod = new int[1] ;
      P07I910_A9495MRStkAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07I910_n9495MRStkAct = new boolean[] {false} ;
      A9495MRStkAct = DecimalUtil.ZERO ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      AV42Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rmordenes__default(),
         new Object[] {
             new Object[] {
            P07I92_A396EmprCod, P07I92_A407EmprNom, P07I92_n407EmprNom
            }
            , new Object[] {
            P07I95_A396EmprCod, P07I95_A9425OMCod, P07I95_A9426OMMaqCod, P07I95_A9428SMCod, P07I95_n9428SMCod, P07I95_A9429PMCod, P07I95_n9429PMCod, P07I95_A9437OMUsuCre, P07I95_A9435OMOpeResN, P07I95_n9435OMOpeResN,
            P07I95_A9434OMOpeRes, P07I95_n9434OMOpeRes, P07I95_A9427OMMaqDsc, P07I95_n9427OMMaqDsc, P07I95_A9438OMFchPre, P07I95_A9436OMFchCre, P07I95_A9433OMTxt, P07I95_A9464OMNot, P07I95_A9441OMMCCosT, P07I95_A9443OMRCCosT,
            P07I95_A9445OMEst, P07I95_A9442OMMRCosT, P07I95_A9444OMRRCosT
            }
            , new Object[] {
            P07I96_A396EmprCod, P07I96_A9425OMCod, P07I96_A9430TMCod, P07I96_A9431TMDsc, P07I96_n9431TMDsc
            }
            , new Object[] {
            P07I97_A396EmprCod, P07I97_A9425OMCod, P07I97_A9430TMCod, P07I97_A12638TMOMMPieCo, P07I97_A12637TMOMMSEqCo, P07I97_A12636TMOMMEquCo
            }
            , new Object[] {
            P07I98_A396EmprCod, P07I98_A9425OMCod, P07I98_A9449OMRTpo, P07I98_A9446OMRepCod, P07I98_A9447OMRepNom, P07I98_n9447OMRepNom, P07I98_A9453OMRCPre, P07I98_A9452OMRCCnt, P07I98_A9451OMRRPre, P07I98_A9450OMRRCnt
            }
            , new Object[] {
            P07I99_A396EmprCod, P07I99_A9425OMCod, P07I99_A9458OMMTpo, P07I99_A9456OMOpeNom, P07I99_n9456OMOpeNom, P07I99_A9455OMOpeCod, P07I99_A9462OMMCPre, P07I99_A9461OMMCCnt, P07I99_A9460OMMRPre, P07I99_A9459OMMRCnt
            }
            , new Object[] {
            P07I910_A396EmprCod, P07I910_A9492MRCod, P07I910_A9495MRStkAct, P07I910_n9495MRStkAct
            }
         }
      );
      AV42Pgmname = "RMOrdenes" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      AV38Pgmdesc = httpContext.getMessage( "Orden de Mantenimiento", "") ;
      /* GeneXus formulas. */
      AV42Pgmname = "RMOrdenes" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      AV38Pgmdesc = httpContext.getMessage( "Orden de Mantenimiento", "") ;
      Gx_err = (short)(0) ;
   }

   private byte AV25coloretto ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte AV43GXLvl28 ;
   private byte AV17Flag ;
   private short AV24Piezas ;
   private short AV19n ;
   private short AV21i ;
   private short Gx_err ;
   private int A9425OMCod ;
   private int Gx_page ;
   private int Gx_line ;
   private int M_top ;
   private int M_bot ;
   private int P_lines ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A9428SMCod ;
   private int A9429PMCod ;
   private int A9434OMOpeRes ;
   private int Gx_OldLine ;
   private int A9430TMCod ;
   private int A9446OMRepCod ;
   private int AV28Mrcod ;
   private int A9455OMOpeCod ;
   private int A9492MRCod ;
   private java.math.BigDecimal A9441OMMCCosT ;
   private java.math.BigDecimal A9443OMRCCosT ;
   private java.math.BigDecimal A9442OMMRCosT ;
   private java.math.BigDecimal A9444OMRRCosT ;
   private java.math.BigDecimal A9440OMCosRea ;
   private java.math.BigDecimal A9453OMRCPre ;
   private java.math.BigDecimal A9452OMRCCnt ;
   private java.math.BigDecimal A9451OMRRPre ;
   private java.math.BigDecimal A9450OMRRCnt ;
   private java.math.BigDecimal A9471OMRRCos ;
   private java.math.BigDecimal A9454OMRCCos ;
   private java.math.BigDecimal AV30OMRRpre ;
   private java.math.BigDecimal AV29MrStkAct ;
   private java.math.BigDecimal A9462OMMCPre ;
   private java.math.BigDecimal A9461OMMCCnt ;
   private java.math.BigDecimal A9460OMMRPre ;
   private java.math.BigDecimal A9459OMMRCnt ;
   private java.math.BigDecimal A9472OMMRCos ;
   private java.math.BigDecimal A9463OMMCCos ;
   private java.math.BigDecimal A9495MRStkAct ;
   private String A396EmprCod ;
   private String AV13Tipo ;
   private String Gx_out ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV12NomEmp ;
   private String AV8Lit0 ;
   private String AV38Pgmdesc ;
   private String AV31Lit1 ;
   private String AV10Lit2 ;
   private String AV11Lit3 ;
   private String GXt_char3 ;
   private String AV26Lit10 ;
   private String AV27Lit11 ;
   private String A9426OMMaqCod ;
   private String A9437OMUsuCre ;
   private String A9435OMOpeResN ;
   private String A9427OMMaqDsc ;
   private String A9445OMEst ;
   private String AV16OMEstDsc ;
   private String AV23OMMaqCod ;
   private String A9431TMDsc ;
   private String A12638TMOMMPieCo ;
   private String A12637TMOMMSEqCo ;
   private String A12636TMOMMEquCo ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private String GXv_char6[] ;
   private String GXv_char7[] ;
   private String GXv_char8[] ;
   private String AV22MaqPieDsc ;
   private String GXv_char9[] ;
   private String AV20t ;
   private String A9449OMRTpo ;
   private String A9447OMRepNom ;
   private String A9458OMMTpo ;
   private String A9456OMOpeNom ;
   private String Gx_time ;
   private String AV42Pgmname ;
   private java.util.Date A9436OMFchCre ;
   private java.util.Date A9438OMFchPre ;
   private java.util.Date Gx_date ;
   private boolean n407EmprNom ;
   private boolean GxHdr3 ;
   private boolean n9428SMCod ;
   private boolean n9429PMCod ;
   private boolean n9435OMOpeResN ;
   private boolean n9434OMOpeRes ;
   private boolean n9427OMMaqDsc ;
   private boolean n9431TMDsc ;
   private boolean GxHdr7 ;
   private boolean n9447OMRepNom ;
   private boolean returnInSub ;
   private boolean GxHdr9 ;
   private boolean n9456OMOpeNom ;
   private boolean n9495MRStkAct ;
   private String A9433OMTxt ;
   private String A9464OMNot ;
   private IReportHandler reportHandler ;
   private int[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P07I92_A396EmprCod ;
   private String[] P07I92_A407EmprNom ;
   private boolean[] P07I92_n407EmprNom ;
   private String[] P07I95_A396EmprCod ;
   private int[] P07I95_A9425OMCod ;
   private String[] P07I95_A9426OMMaqCod ;
   private int[] P07I95_A9428SMCod ;
   private boolean[] P07I95_n9428SMCod ;
   private int[] P07I95_A9429PMCod ;
   private boolean[] P07I95_n9429PMCod ;
   private String[] P07I95_A9437OMUsuCre ;
   private String[] P07I95_A9435OMOpeResN ;
   private boolean[] P07I95_n9435OMOpeResN ;
   private int[] P07I95_A9434OMOpeRes ;
   private boolean[] P07I95_n9434OMOpeRes ;
   private String[] P07I95_A9427OMMaqDsc ;
   private boolean[] P07I95_n9427OMMaqDsc ;
   private java.util.Date[] P07I95_A9438OMFchPre ;
   private java.util.Date[] P07I95_A9436OMFchCre ;
   private String[] P07I95_A9433OMTxt ;
   private String[] P07I95_A9464OMNot ;
   private java.math.BigDecimal[] P07I95_A9441OMMCCosT ;
   private java.math.BigDecimal[] P07I95_A9443OMRCCosT ;
   private String[] P07I95_A9445OMEst ;
   private java.math.BigDecimal[] P07I95_A9442OMMRCosT ;
   private java.math.BigDecimal[] P07I95_A9444OMRRCosT ;
   private String[] P07I96_A396EmprCod ;
   private int[] P07I96_A9425OMCod ;
   private int[] P07I96_A9430TMCod ;
   private String[] P07I96_A9431TMDsc ;
   private boolean[] P07I96_n9431TMDsc ;
   private String[] P07I97_A396EmprCod ;
   private int[] P07I97_A9425OMCod ;
   private int[] P07I97_A9430TMCod ;
   private String[] P07I97_A12638TMOMMPieCo ;
   private String[] P07I97_A12637TMOMMSEqCo ;
   private String[] P07I97_A12636TMOMMEquCo ;
   private String[] P07I98_A396EmprCod ;
   private int[] P07I98_A9425OMCod ;
   private String[] P07I98_A9449OMRTpo ;
   private int[] P07I98_A9446OMRepCod ;
   private String[] P07I98_A9447OMRepNom ;
   private boolean[] P07I98_n9447OMRepNom ;
   private java.math.BigDecimal[] P07I98_A9453OMRCPre ;
   private java.math.BigDecimal[] P07I98_A9452OMRCCnt ;
   private java.math.BigDecimal[] P07I98_A9451OMRRPre ;
   private java.math.BigDecimal[] P07I98_A9450OMRRCnt ;
   private String[] P07I99_A396EmprCod ;
   private int[] P07I99_A9425OMCod ;
   private String[] P07I99_A9458OMMTpo ;
   private String[] P07I99_A9456OMOpeNom ;
   private boolean[] P07I99_n9456OMOpeNom ;
   private int[] P07I99_A9455OMOpeCod ;
   private java.math.BigDecimal[] P07I99_A9462OMMCPre ;
   private java.math.BigDecimal[] P07I99_A9461OMMCCnt ;
   private java.math.BigDecimal[] P07I99_A9460OMMRPre ;
   private java.math.BigDecimal[] P07I99_A9459OMMRCnt ;
   private String[] P07I910_A396EmprCod ;
   private int[] P07I910_A9492MRCod ;
   private java.math.BigDecimal[] P07I910_A9495MRStkAct ;
   private boolean[] P07I910_n9495MRStkAct ;
}

final  class rmordenes__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07I92", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07I95", "SELECT T1.EmprCod, T1.OMCod, T1.OMMaqCod AS OMMaqCod, T1.SMCod, T1.PMCod, T1.OMUsuCre, T3.OpeNom AS OMOpeResN, T1.OMOpeRes AS OMOpeRes, T2.MaqDsc AS OMMaqDsc, T1.OMFchPre, T1.OMFchCre, T1.OMTxt, T1.OMNot, COALESCE( T5.OMMCCosT, 0) AS OMMCCosT, COALESCE( T4.OMRCCosT, 0) AS OMRCCosT, T1.OMEst, COALESCE( T5.OMMRCosT, 0) AS OMMRCosT, COALESCE( T4.OMRRCosT, 0) AS OMRRCosT FROM ((((TXPMORDEN T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.OMMaqCod) LEFT JOIN TXPOPERAR T3 ON T3.EmprCod = T1.EmprCod AND T3.OpeCod = T1.OMOpeRes) LEFT JOIN (SELECT SUM(OMRRCnt * CAST(OMRRPre AS NUMERIC(22,10))) AS OMRRCosT, EmprCod, OMCod, SUM(OMRCCnt * CAST(OMRCPre AS NUMERIC(22,10))) AS OMRCCosT FROM TXPMOrRep GROUP BY EmprCod, OMCod ) T4 ON T4.EmprCod = T1.EmprCod AND T4.OMCod = T1.OMCod) LEFT JOIN (SELECT SUM(OMMRCnt * CAST(OMMRPre AS NUMERIC(22,10))) AS OMMRCosT, EmprCod, OMCod, SUM(OMMCCnt * CAST(OMMCPre AS NUMERIC(22,10))) AS OMMCCosT FROM TXPMOrMO GROUP BY EmprCod, OMCod ) T5 ON T5.EmprCod = T1.EmprCod AND T5.OMCod = T1.OMCod) WHERE T1.EmprCod = ? and T1.OMCod = ? ORDER BY T1.EmprCod, T1.OMCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07I96", "SELECT T1.EmprCod, T1.OMCod, T1.TMCod, T2.TMDsc FROM (TXPMOrde2 T1 INNER JOIN TXPMTAREA T2 ON T2.EmprCod = T1.EmprCod AND T2.TMCod = T1.TMCod) WHERE T1.EmprCod = ? and T1.OMCod = ? ORDER BY T1.EmprCod, T1.OMCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07I97", "SELECT EmprCod, OMCod, TMCod, TMOMMPieCo, TMOMMSEqCo, TMOMMEquCo FROM TXPMOrdeI WHERE EmprCod = ? and OMCod = ? and TMCod = ? ORDER BY EmprCod, OMCod, TMCod, TMOMMEquCo, TMOMMSEqCo, TMOMMPieCo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07I98", "SELECT T1.EmprCod, T1.OMCod, T1.OMRTpo, T1.OMRepCod AS OMRepCod, T2.MRNom AS OMRepNom, T1.OMRCPre, T1.OMRCCnt, T1.OMRRPre, T1.OMRRCnt FROM (TXPMOrRep T1 INNER JOIN TXPMREPUE T2 ON T2.EmprCod = T1.EmprCod AND T2.MRCod = T1.OMRepCod) WHERE T1.EmprCod = ? and T1.OMCod = ? ORDER BY T1.EmprCod, T1.OMCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07I99", "SELECT T1.EmprCod, T1.OMCod, T1.OMMTpo, T2.OpeNom AS OMOpeNom, T1.OMOpeCod AS OMOpeCod, T1.OMMCPre, T1.OMMCCnt, T1.OMMRPre, T1.OMMRCnt FROM (TXPMOrMO T1 INNER JOIN TXPOPERAR T2 ON T2.EmprCod = T1.EmprCod AND T2.OpeCod = T1.OMOpeCod) WHERE T1.EmprCod = ? and T1.OMCod = ? ORDER BY T1.EmprCod, T1.OMCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07I910", "SELECT EmprCod, MRCod, MRStkAct FROM TXPMREPUE WHERE EmprCod = ? and MRCod = ? ORDER BY EmprCod, MRCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 8);
               ((String[]) buf[8])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 16);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(10);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDateTime(11);
               ((String[]) buf[16])[0] = rslt.getVarchar(12);
               ((String[]) buf[17])[0] = rslt.getVarchar(13);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(14,3);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(15,3);
               ((String[]) buf[20])[0] = rslt.getString(16, 1);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(17,3);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(18,3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((String[]) buf[5])[0] = rslt.getString(6, 10);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 100);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,3);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,3);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,3);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,3);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,3);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,3);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,3);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

