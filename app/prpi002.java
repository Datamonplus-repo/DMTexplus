package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class prpi002 extends GXProcedure
{
   public prpi002( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( prpi002.class ), "" );
   }

   public prpi002( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          byte[] aP2 ,
                          String[] aP3 ,
                          int[] aP4 ,
                          String[] aP5 ,
                          byte[] aP6 ,
                          String[] aP7 ,
                          short[] aP8 ,
                          short[] aP9 ,
                          String[] aP10 ,
                          byte[] aP11 ,
                          String[] aP12 )
   {
      prpi002.this.aP13 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
      return aP13[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        String[] aP5 ,
                        byte[] aP6 ,
                        String[] aP7 ,
                        short[] aP8 ,
                        short[] aP9 ,
                        String[] aP10 ,
                        byte[] aP11 ,
                        String[] aP12 ,
                        int[] aP13 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             String[] aP5 ,
                             byte[] aP6 ,
                             String[] aP7 ,
                             short[] aP8 ,
                             short[] aP9 ,
                             String[] aP10 ,
                             byte[] aP11 ,
                             String[] aP12 ,
                             int[] aP13 )
   {
      prpi002.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      prpi002.this.AV15BarCodOri = aP1[0];
      this.aP1 = aP1;
      prpi002.this.AV16BarReoOri = aP2[0];
      this.aP2 = aP2;
      prpi002.this.AV17BarParOri = aP3[0];
      this.aP3 = aP3;
      prpi002.this.AV18BarCod = aP4[0];
      this.aP4 = aP4;
      prpi002.this.AV19BarParPan = aP5[0];
      this.aP5 = aP5;
      prpi002.this.AV20BarSit = aP6[0];
      this.aP6 = aP6;
      prpi002.this.AV21Reo = aP7[0];
      this.aP7 = aP7;
      prpi002.this.AV22TipDefCod = aP8[0];
      this.aP8 = aP8;
      prpi002.this.AV23TipDefPor = aP9[0];
      this.aP9 = aP9;
      prpi002.this.AV24BarMaqCod = aP10[0];
      this.aP10 = aP10;
      prpi002.this.AV25BarConReo = aP11[0];
      this.aP11 = aP11;
      prpi002.this.AV26Codigo = aP12[0];
      this.aP12 = aP12;
      prpi002.this.AV27DisCod = aP13[0];
      this.aP13 = aP13;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV134FlagHil = (byte)(0) ;
      GXv_int1[0] = AV134FlagHil ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "HILO", ""), GXv_int1) ;
      prpi002.this.AV134FlagHil = GXv_int1[0] ;
      AV136FlagBros = (byte)(0) ;
      GXv_int1[0] = AV136FlagBros ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "BROS", ""), GXv_int1) ;
      prpi002.this.AV136FlagBros = GXv_int1[0] ;
      AV141Pervaf = (byte)(0) ;
      GXv_int1[0] = AV141Pervaf ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PERVAF", ""), GXv_int1) ;
      prpi002.this.AV141Pervaf = GXv_int1[0] ;
      GXt_char2 = AV150ContDsc ;
      GXv_char3[0] = A396EmprCod ;
      GXv_char4[0] = httpContext.getMessage( "CLISKP", "") ;
      GXv_char5[0] = GXt_char2 ;
      new app.pbusdsc(remoteHandle, context).execute( GXv_char3, GXv_char4, GXv_char5) ;
      prpi002.this.A396EmprCod = GXv_char3[0] ;
      prpi002.this.GXt_char2 = GXv_char5[0] ;
      AV150ContDsc = GXt_char2 ;
      AV148CliPropio = (int)(GXutil.lval( GXutil.trim( AV150ContDsc))) ;
      GXv_int1[0] = AV161Artextil ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ARTEXT", ""), GXv_int1) ;
      prpi002.this.AV161Artextil = GXv_int1[0] ;
      GXt_int6 = AV167Jpf ;
      GXv_int1[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "JPF", ""), GXv_int1) ;
      prpi002.this.GXt_int6 = GXv_int1[0] ;
      AV167Jpf = GXt_int6 ;
      AV140JBMartin = (byte)(0) ;
      GXv_int1[0] = AV140JBMartin ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "JBMAR", ""), GXv_int1) ;
      prpi002.this.AV140JBMartin = GXv_int1[0] ;
      AV162Lindalana = (byte)(0) ;
      GXv_int1[0] = AV162Lindalana ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "LINDAL", ""), GXv_int1) ;
      prpi002.this.AV162Lindalana = GXv_int1[0] ;
      AV140JBMartin = (byte)(0) ;
      GXv_int1[0] = (byte)(DecimalUtil.decToDouble(AV159Intexco)) ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "INTEXC", ""), GXv_int1) ;
      prpi002.this.AV159Intexco = DecimalUtil.doubleToDec(GXv_int1[0]) ;
      GXt_int6 = AV160Texfina ;
      GXv_int1[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TEXFNA", ""), GXv_int1) ;
      prpi002.this.GXt_int6 = GXv_int1[0] ;
      AV160Texfina = GXt_int6 ;
      GXt_int6 = AV166Vertex ;
      GXv_int1[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "VERTEX", ""), GXv_int1) ;
      prpi002.this.GXt_int6 = GXv_int1[0] ;
      AV166Vertex = GXt_int6 ;
      GXt_int6 = AV187Torient ;
      GXv_int1[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TORIEN", ""), GXv_int1) ;
      prpi002.this.GXt_int6 = GXv_int1[0] ;
      AV187Torient = GXt_int6 ;
      GXt_int6 = AV188PzasLector ;
      GXv_int1[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PZLCXX", ""), GXv_int1) ;
      prpi002.this.GXt_int6 = GXv_int1[0] ;
      AV188PzasLector = GXt_int6 ;
      GXt_int7 = AV189ConVal ;
      GXv_char5[0] = A396EmprCod ;
      GXv_char4[0] = httpContext.getMessage( "PZLCXX", "") ;
      GXv_int8[0] = GXt_int7 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char5, GXv_char4, GXv_int8) ;
      prpi002.this.A396EmprCod = GXv_char5[0] ;
      prpi002.this.GXt_int7 = GXv_int8[0] ;
      AV189ConVal = GXt_int7 ;
      GXt_int6 = (byte)(AV192nopasarcc) ;
      GXv_int1[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NCCC00", ""), GXv_int1) ;
      prpi002.this.GXt_int6 = GXv_int1[0] ;
      AV192nopasarcc = GXt_int6 ;
      GXt_char2 = AV173Station ;
      GXv_char5[0] = GXt_char2 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char5) ;
      prpi002.this.GXt_char2 = GXv_char5[0] ;
      AV173Station = GXt_char2 ;
      GXv_char5[0] = A396EmprCod ;
      GXv_char4[0] = AV174EmprNom ;
      GXv_char3[0] = AV172Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV173Station, GXv_char5, GXv_char4, GXv_char3) ;
      prpi002.this.A396EmprCod = GXv_char5[0] ;
      prpi002.this.AV174EmprNom = GXv_char4[0] ;
      prpi002.this.AV172Usurcod = GXv_char3[0] ;
      AV35EmprCod = A396EmprCod ;
      /* Using cursor P04QX3 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV15BarCodOri), Byte.valueOf(AV16BarReoOri), AV17BarParOri});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P04QX3_A130BarCodPar[0] ;
         A132BarCodReo = P04QX3_A132BarCodReo[0] ;
         A129BarCod = P04QX3_A129BarCod[0] ;
         A966PartCod = P04QX3_A966PartCod[0] ;
         n966PartCod = P04QX3_n966PartCod[0] ;
         A252CliCod = P04QX3_A252CliCod[0] ;
         n252CliCod = P04QX3_n252CliCod[0] ;
         A361DisCod = P04QX3_A361DisCod[0] ;
         A5253BarAcc = P04QX3_A5253BarAcc[0] ;
         A213BarSit = P04QX3_A213BarSit[0] ;
         A365DisDes = P04QX3_A365DisDes[0] ;
         A189BarNumAny = P04QX3_A189BarNumAny[0] ;
         A137BarConPar = P04QX3_A137BarConPar[0] ;
         A141BarCosPro = P04QX3_A141BarCosPro[0] ;
         A140BarCosAny = P04QX3_A140BarCosAny[0] ;
         A898BarPieNDes = P04QX3_A898BarPieNDes[0] ;
         n898BarPieNDes = P04QX3_n898BarPieNDes[0] ;
         A966PartCod = P04QX3_A966PartCod[0] ;
         n966PartCod = P04QX3_n966PartCod[0] ;
         A898BarPieNDes = P04QX3_A898BarPieNDes[0] ;
         n898BarPieNDes = P04QX3_n898BarPieNDes[0] ;
         AV165BarHdro = GXutil.str( AV15BarCodOri, 8, 0) + "-" + GXutil.str( AV16BarReoOri, 1, 0) + AV17BarParOri ;
         AV133PartCod = A966PartCod ;
         AV59CliCod = A252CliCod ;
         AV35EmprCod = A396EmprCod ;
         AV129DisOriCod = A361DisCod ;
         AV147BarAcc = A5253BarAcc ;
         AV29ContPie = 0 ;
         AV35EmprCod = A396EmprCod ;
         AV97Situa = A213BarSit ;
         AV58DisDes = A365DisDes ;
         if ( GXutil.strcmp(AV21Reo, httpContext.getMessage( "T", "")) == 0 )
         {
            AV101BarNumAny = A189BarNumAny ;
            AV100BarConPar = A137BarConPar ;
            AV108BarPieNDes = A898BarPieNDes ;
            AV31CosPro = A141BarCosPro ;
            AV32CosAny = A140BarCosAny ;
            AV122PNoDes = AV108BarPieNDes ;
            AV123Sit2 = (byte)(1) ;
            if ( A213BarSit < 4 )
            {
               AV123Sit2 = A213BarSit ;
            }
         }
         else
         {
            AV101BarNumAny = (short)(0) ;
            AV100BarConPar = "" ;
            AV122PNoDes = 0 ;
            AV123Sit2 = (byte)(1) ;
            if ( A213BarSit < 4 )
            {
               AV123Sit2 = A213BarSit ;
            }
         }
         AV194Col_Inc_obs.clear();
         /* Using cursor P04QX4 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A758ProCod = P04QX4_A758ProCod[0] ;
            A761ProFasLin = P04QX4_A761ProFasLin[0] ;
            n761ProFasLin = P04QX4_n761ProFasLin[0] ;
            AV33ProCod = A758ProCod ;
            AV34ProFasLin = A761ProFasLin ;
            Gx_msg = httpContext.getMessage( "Prpi002.Creando BARPRO Hdr = ", "") + GXutil.str( AV18BarCod, 8, 0) + "-" + GXutil.str( AV25BarConReo, 1, 0) + AV19BarParPan ;
            GXv_char5[0] = AV35EmprCod ;
            GXv_int8[0] = AV18BarCod ;
            GXv_int1[0] = AV25BarConReo ;
            GXv_char4[0] = AV19BarParPan ;
            GXv_char3[0] = AV33ProCod ;
            GXv_int9[0] = AV34ProFasLin ;
            new app.preo002(remoteHandle, context).execute( GXv_char5, GXv_int8, GXv_int1, GXv_char4, GXv_char3, GXv_int9) ;
            prpi002.this.AV35EmprCod = GXv_char5[0] ;
            prpi002.this.AV18BarCod = GXv_int8[0] ;
            prpi002.this.AV25BarConReo = GXv_int1[0] ;
            prpi002.this.AV19BarParPan = GXv_char4[0] ;
            prpi002.this.AV33ProCod = GXv_char3[0] ;
            prpi002.this.AV34ProFasLin = GXv_int9[0] ;
            AV195Item_Col_Inc_obs = (app.SdtIncidenciasObservaciones_SDT)new app.SdtIncidenciasObservaciones_SDT(remoteHandle, context);
            AV195Item_Col_Inc_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( httpContext.getMessage( "Creacion NEW BARPRO", "")+GXutil.newLine( ) );
            AV195Item_Col_Inc_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV195Item_Col_Inc_obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "Hd Origen      = ", "")+GXutil.str( AV18BarCod, 8, 0)+"-"+GXutil.str( AV16BarReoOri, 1, 0)+AV17BarParOri+GXutil.newLine( ) );
            AV195Item_Col_Inc_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV195Item_Col_Inc_obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "Hd New         = ", "")+GXutil.str( AV18BarCod, 8, 0)+"-"+GXutil.str( AV25BarConReo, 1, 0)+AV19BarParPan+GXutil.newLine( ) );
            AV195Item_Col_Inc_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV195Item_Col_Inc_obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "N Disp New     = ", "")+GXutil.str( AV27DisCod, 8, 0)+GXutil.newLine( ) );
            AV195Item_Col_Inc_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV195Item_Col_Inc_obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "Proceso        = ", "")+AV33ProCod );
            AV194Col_Inc_obs.add(AV195Item_Col_Inc_obs, 0);
            /* Using cursor P04QX5 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A194BarOrdLin = P04QX5_A194BarOrdLin[0] ;
               A457FasCod = P04QX5_A457FasCod[0] ;
               A153BarFasEst = P04QX5_A153BarFasEst[0] ;
               A162BarFecTeo = P04QX5_A162BarFecTeo[0] ;
               A160BarFecRea = P04QX5_A160BarFecRea[0] ;
               A216BarTieTeo = P04QX5_A216BarTieTeo[0] ;
               A227BarUni = P04QX5_A227BarUni[0] ;
               A179BarLoc = P04QX5_A179BarLoc[0] ;
               A165BarHorIni = P04QX5_A165BarHorIni[0] ;
               A164BarHorFin = P04QX5_A164BarHorFin[0] ;
               A215BarTieRea = P04QX5_A215BarTieRea[0] ;
               A603MaqCodBis = P04QX5_A603MaqCodBis[0] ;
               A152BarFasCon = P04QX5_A152BarFasCon[0] ;
               A150BarFacTin = P04QX5_A150BarFacTin[0] ;
               A3298BarFecRIni = P04QX5_A3298BarFecRIni[0] ;
               A4022BarNumBot = P04QX5_A4022BarNumBot[0] ;
               A5719BarFasKgT = P04QX5_A5719BarFasKgT[0] ;
               n5719BarFasKgT = P04QX5_n5719BarFasKgT[0] ;
               A5720BarFasMtT = P04QX5_A5720BarFasMtT[0] ;
               n5720BarFasMtT = P04QX5_n5720BarFasMtT[0] ;
               A3837BarFasKgm = P04QX5_A3837BarFasKgm[0] ;
               n3837BarFasKgm = P04QX5_n3837BarFasKgm[0] ;
               A3838BarFasMtr = P04QX5_A3838BarFasMtr[0] ;
               n3838BarFasMtr = P04QX5_n3838BarFasMtr[0] ;
               A4301BarFasCoP = P04QX5_A4301BarFasCoP[0] ;
               A4905BarFasAcab = P04QX5_A4905BarFasAcab[0] ;
               A5047BarFasFPl = P04QX5_A5047BarFasFPl[0] ;
               n5047BarFasFPl = P04QX5_n5047BarFasFPl[0] ;
               A5048BarFasUsu = P04QX5_A5048BarFasUsu[0] ;
               n5048BarFasUsu = P04QX5_n5048BarFasUsu[0] ;
               A5369BarFasGral = P04QX5_A5369BarFasGral[0] ;
               n5369BarFasGral = P04QX5_n5369BarFasGral[0] ;
               A5896BarMaqPlan = P04QX5_A5896BarMaqPlan[0] ;
               n5896BarMaqPlan = P04QX5_n5896BarMaqPlan[0] ;
               A4287BarFasFor = P04QX5_A4287BarFasFor[0] ;
               A4442BarFasDTI = P04QX5_A4442BarFasDTI[0] ;
               n4442BarFasDTI = P04QX5_n4442BarFasDTI[0] ;
               A4443BarFasDTF = P04QX5_A4443BarFasDTF[0] ;
               n4443BarFasDTF = P04QX5_n4443BarFasDTF[0] ;
               A9842BarObsF = P04QX5_A9842BarObsF[0] ;
               n9842BarObsF = P04QX5_n9842BarObsF[0] ;
               A10032BarObsB = P04QX5_A10032BarObsB[0] ;
               n10032BarObsB = P04QX5_n10032BarObsB[0] ;
               AV36BarOrdLin = A194BarOrdLin ;
               AV37FasCod = A457FasCod ;
               AV38BarFasEst = A153BarFasEst ;
               AV39BarFecTeo = A162BarFecTeo ;
               AV40BarFecRea = A160BarFecRea ;
               AV41BarTieTeo = A216BarTieTeo ;
               AV42BarUni = A227BarUni ;
               AV43BarLoc = A179BarLoc ;
               AV44BarHorIni = A165BarHorIni ;
               AV45BarHorFin = A164BarHorFin ;
               AV46BarTieRea = A215BarTieRea ;
               AV125MaqCod = A603MaqCodBis ;
               AV131BarFasCon = A152BarFasCon ;
               AV132BarFacTin = A150BarFacTin ;
               AV135BarFecRIni = A3298BarFecRIni ;
               AV139BarNumBot = A4022BarNumBot ;
               AV143BarFasKgt = A5719BarFasKgT ;
               AV144BarFasMtt = A5720BarFasMtT ;
               AV145BarFasKgm = A3837BarFasKgm ;
               AV146BarFasMtr = A3838BarFasMtr ;
               AV151BarFascop = A4301BarFasCoP ;
               AV152Barfasacab = A4905BarFasAcab ;
               AV153Barfasfpl = A5047BarFasFPl ;
               AV154Barfasusu = A5048BarFasUsu ;
               AV155Barfasgral = A5369BarFasGral ;
               AV156BarMaqPlan = A5896BarMaqPlan ;
               AV158Barfasfor = A4287BarFasFor ;
               AV163Barfasdti = A4442BarFasDTI ;
               AV164Barfasdtf = A4443BarFasDTF ;
               AV185BarObsf = A9842BarObsF ;
               AV186BarObsB = A10032BarObsB ;
               Gx_msg = httpContext.getMessage( "Prpi002.Creando BARFAS Hdr = ", "") + GXutil.str( AV18BarCod, 8, 0) + "-" + GXutil.str( AV25BarConReo, 1, 0) + AV19BarParPan ;
               GXv_char5[0] = AV35EmprCod ;
               GXv_int8[0] = AV18BarCod ;
               GXv_int1[0] = AV25BarConReo ;
               GXv_char4[0] = AV19BarParPan ;
               GXv_char3[0] = AV33ProCod ;
               GXv_int9[0] = AV36BarOrdLin ;
               GXv_char10[0] = AV37FasCod ;
               GXv_int11[0] = AV38BarFasEst ;
               GXv_date12[0] = AV39BarFecTeo ;
               GXv_date13[0] = AV40BarFecRea ;
               GXv_date14[0] = AV135BarFecRIni ;
               GXv_decimal15[0] = AV41BarTieTeo ;
               GXv_decimal16[0] = AV42BarUni ;
               GXv_char17[0] = AV43BarLoc ;
               GXv_int18[0] = AV44BarHorIni ;
               GXv_int19[0] = AV45BarHorFin ;
               GXv_decimal20[0] = AV46BarTieRea ;
               GXv_char21[0] = AV125MaqCod ;
               GXv_char22[0] = AV131BarFasCon ;
               GXv_char23[0] = AV132BarFacTin ;
               GXv_int24[0] = AV139BarNumBot ;
               GXv_decimal25[0] = AV145BarFasKgm ;
               GXv_decimal26[0] = AV143BarFasKgt ;
               GXv_decimal27[0] = AV146BarFasMtr ;
               GXv_decimal28[0] = AV144BarFasMtt ;
               GXv_char29[0] = AV151BarFascop ;
               GXv_char30[0] = AV152Barfasacab ;
               GXv_date31[0] = AV153Barfasfpl ;
               GXv_char32[0] = AV154Barfasusu ;
               GXv_char33[0] = AV155Barfasgral ;
               GXv_char34[0] = AV156BarMaqPlan ;
               GXv_char35[0] = AV158Barfasfor ;
               GXv_dtime36[0] = AV163Barfasdti ;
               GXv_dtime37[0] = AV164Barfasdtf ;
               GXv_char38[0] = AV165BarHdro ;
               GXv_char39[0] = AV185BarObsf ;
               GXv_char40[0] = AV186BarObsB ;
               new app.preo004(remoteHandle, context).execute( GXv_char5, GXv_int8, GXv_int1, GXv_char4, GXv_char3, GXv_int9, GXv_char10, GXv_int11, GXv_date12, GXv_date13, GXv_date14, GXv_decimal15, GXv_decimal16, GXv_char17, GXv_int18, GXv_int19, GXv_decimal20, GXv_char21, GXv_char22, GXv_char23, GXv_int24, GXv_decimal25, GXv_decimal26, GXv_decimal27, GXv_decimal28, GXv_char29, GXv_char30, GXv_date31, GXv_char32, GXv_char33, GXv_char34, GXv_char35, GXv_dtime36, GXv_dtime37, GXv_char38, GXv_char39, GXv_char40) ;
               prpi002.this.AV35EmprCod = GXv_char5[0] ;
               prpi002.this.AV18BarCod = GXv_int8[0] ;
               prpi002.this.AV25BarConReo = GXv_int1[0] ;
               prpi002.this.AV19BarParPan = GXv_char4[0] ;
               prpi002.this.AV33ProCod = GXv_char3[0] ;
               prpi002.this.AV36BarOrdLin = GXv_int9[0] ;
               prpi002.this.AV37FasCod = GXv_char10[0] ;
               prpi002.this.AV38BarFasEst = GXv_int11[0] ;
               prpi002.this.AV39BarFecTeo = GXv_date12[0] ;
               prpi002.this.AV40BarFecRea = GXv_date13[0] ;
               prpi002.this.AV135BarFecRIni = GXv_date14[0] ;
               prpi002.this.AV41BarTieTeo = GXv_decimal15[0] ;
               prpi002.this.AV42BarUni = GXv_decimal16[0] ;
               prpi002.this.AV43BarLoc = GXv_char17[0] ;
               prpi002.this.AV44BarHorIni = GXv_int18[0] ;
               prpi002.this.AV45BarHorFin = GXv_int19[0] ;
               prpi002.this.AV46BarTieRea = GXv_decimal20[0] ;
               prpi002.this.AV125MaqCod = GXv_char21[0] ;
               prpi002.this.AV131BarFasCon = GXv_char22[0] ;
               prpi002.this.AV132BarFacTin = GXv_char23[0] ;
               prpi002.this.AV139BarNumBot = GXv_int24[0] ;
               prpi002.this.AV145BarFasKgm = GXv_decimal25[0] ;
               prpi002.this.AV143BarFasKgt = GXv_decimal26[0] ;
               prpi002.this.AV146BarFasMtr = GXv_decimal27[0] ;
               prpi002.this.AV144BarFasMtt = GXv_decimal28[0] ;
               prpi002.this.AV151BarFascop = GXv_char29[0] ;
               prpi002.this.AV152Barfasacab = GXv_char30[0] ;
               prpi002.this.AV153Barfasfpl = GXv_date31[0] ;
               prpi002.this.AV154Barfasusu = GXv_char32[0] ;
               prpi002.this.AV155Barfasgral = GXv_char33[0] ;
               prpi002.this.AV156BarMaqPlan = GXv_char34[0] ;
               prpi002.this.AV158Barfasfor = GXv_char35[0] ;
               prpi002.this.AV163Barfasdti = GXv_dtime36[0] ;
               prpi002.this.AV164Barfasdtf = GXv_dtime37[0] ;
               prpi002.this.AV165BarHdro = GXv_char38[0] ;
               prpi002.this.AV185BarObsf = GXv_char39[0] ;
               prpi002.this.AV186BarObsB = GXv_char40[0] ;
               AV195Item_Col_Inc_obs = (app.SdtIncidenciasObservaciones_SDT)new app.SdtIncidenciasObservaciones_SDT(remoteHandle, context);
               AV195Item_Col_Inc_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( httpContext.getMessage( "Creacion NEW BARFAS", "")+GXutil.newLine( ) );
               AV195Item_Col_Inc_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV195Item_Col_Inc_obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "Hd Origen      = ", "")+GXutil.str( AV18BarCod, 8, 0)+"-"+GXutil.str( AV16BarReoOri, 1, 0)+AV17BarParOri+GXutil.newLine( ) );
               AV195Item_Col_Inc_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV195Item_Col_Inc_obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "Hd New         = ", "")+GXutil.str( AV18BarCod, 8, 0)+"-"+GXutil.str( AV25BarConReo, 1, 0)+AV19BarParPan+GXutil.newLine( ) );
               AV195Item_Col_Inc_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV195Item_Col_Inc_obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "N Disp New     = ", "")+GXutil.str( AV27DisCod, 8, 0)+GXutil.newLine( ) );
               AV195Item_Col_Inc_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV195Item_Col_Inc_obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "Proceso        = ", "")+AV33ProCod+GXutil.newLine( ) );
               AV195Item_Col_Inc_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV195Item_Col_Inc_obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "Fase           = ", "")+GXutil.str( AV36BarOrdLin, 4, 0)+" "+GXutil.trim( AV37FasCod)+GXutil.newLine( ) );
               AV194Col_Inc_obs.add(AV195Item_Col_Inc_obs, 0);
               if ( AV187Torient == 0 )
               {
                  /* Using cursor P04QX6 */
                  pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
                  while ( (pr_default.getStatus(3) != 101) )
                  {
                     A1664ParFasCod = P04QX6_A1664ParFasCod[0] ;
                     AV142ParFasCod = A1664ParFasCod ;
                     Gx_msg = httpContext.getMessage( "Prpi002.Creando BARPAR Hdr = ", "") + GXutil.str( AV18BarCod, 8, 0) + "-" + GXutil.str( AV25BarConReo, 1, 0) + AV19BarParPan ;
                     GXv_char40[0] = AV35EmprCod ;
                     GXv_int24[0] = AV15BarCodOri ;
                     GXv_int11[0] = AV16BarReoOri ;
                     GXv_char39[0] = AV17BarParOri ;
                     GXv_char38[0] = AV33ProCod ;
                     GXv_int19[0] = AV36BarOrdLin ;
                     GXv_int18[0] = AV142ParFasCod ;
                     GXv_int8[0] = AV18BarCod ;
                     GXv_int1[0] = AV25BarConReo ;
                     GXv_char35[0] = AV19BarParPan ;
                     new app.preo005(remoteHandle, context).execute( GXv_char40, GXv_int24, GXv_int11, GXv_char39, GXv_char38, GXv_int19, GXv_int18, GXv_int8, GXv_int1, GXv_char35) ;
                     prpi002.this.AV35EmprCod = GXv_char40[0] ;
                     prpi002.this.AV15BarCodOri = GXv_int24[0] ;
                     prpi002.this.AV16BarReoOri = GXv_int11[0] ;
                     prpi002.this.AV17BarParOri = GXv_char39[0] ;
                     prpi002.this.AV33ProCod = GXv_char38[0] ;
                     prpi002.this.AV36BarOrdLin = GXv_int19[0] ;
                     prpi002.this.AV142ParFasCod = GXv_int18[0] ;
                     prpi002.this.AV18BarCod = GXv_int8[0] ;
                     prpi002.this.AV25BarConReo = GXv_int1[0] ;
                     prpi002.this.AV19BarParPan = GXv_char35[0] ;
                     pr_default.readNext(3);
                  }
                  pr_default.close(3);
               }
               if ( (0==AV192nopasarcc) )
               {
                  /* Using cursor P04QX7 */
                  pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
                  while ( (pr_default.getStatus(4) != 101) )
                  {
                     A4031CCTCod = P04QX7_A4031CCTCod[0] ;
                     AV193CCTCod = A4031CCTCod ;
                     GXv_char40[0] = AV35EmprCod ;
                     GXv_int24[0] = AV15BarCodOri ;
                     GXv_int11[0] = AV16BarReoOri ;
                     GXv_char39[0] = AV17BarParOri ;
                     GXv_char38[0] = AV33ProCod ;
                     GXv_int19[0] = AV36BarOrdLin ;
                     GXv_int8[0] = AV193CCTCod ;
                     GXv_int41[0] = AV18BarCod ;
                     GXv_int1[0] = AV25BarConReo ;
                     GXv_char35[0] = AV19BarParPan ;
                     new app.preo009(remoteHandle, context).execute( GXv_char40, GXv_int24, GXv_int11, GXv_char39, GXv_char38, GXv_int19, GXv_int8, GXv_int41, GXv_int1, GXv_char35) ;
                     prpi002.this.AV35EmprCod = GXv_char40[0] ;
                     prpi002.this.AV15BarCodOri = GXv_int24[0] ;
                     prpi002.this.AV16BarReoOri = GXv_int11[0] ;
                     prpi002.this.AV17BarParOri = GXv_char39[0] ;
                     prpi002.this.AV33ProCod = GXv_char38[0] ;
                     prpi002.this.AV36BarOrdLin = GXv_int19[0] ;
                     prpi002.this.AV193CCTCod = GXv_int8[0] ;
                     prpi002.this.AV18BarCod = GXv_int41[0] ;
                     prpi002.this.AV25BarConReo = GXv_int1[0] ;
                     prpi002.this.AV19BarParPan = GXv_char35[0] ;
                     AV195Item_Col_Inc_obs = (app.SdtIncidenciasObservaciones_SDT)new app.SdtIncidenciasObservaciones_SDT(remoteHandle, context);
                     AV195Item_Col_Inc_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( httpContext.getMessage( "Creacion NEW CC/CC1", "")+GXutil.newLine( ) );
                     AV195Item_Col_Inc_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV195Item_Col_Inc_obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "Hd Origen      = ", "")+GXutil.str( AV18BarCod, 8, 0)+"-"+GXutil.str( AV16BarReoOri, 1, 0)+AV17BarParOri+GXutil.newLine( ) );
                     AV195Item_Col_Inc_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV195Item_Col_Inc_obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "Hd New         = ", "")+GXutil.str( AV18BarCod, 8, 0)+"-"+GXutil.str( AV25BarConReo, 1, 0)+AV19BarParPan+GXutil.newLine( ) );
                     AV195Item_Col_Inc_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV195Item_Col_Inc_obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "N Disp New     = ", "")+GXutil.str( AV27DisCod, 8, 0)+GXutil.newLine( ) );
                     AV195Item_Col_Inc_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV195Item_Col_Inc_obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "Proceso        = ", "")+AV33ProCod+GXutil.newLine( ) );
                     AV195Item_Col_Inc_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV195Item_Col_Inc_obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "Fase           = ", "")+GXutil.str( AV36BarOrdLin, 4, 0)+" "+GXutil.trim( AV37FasCod)+GXutil.newLine( ) );
                     AV195Item_Col_Inc_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV195Item_Col_Inc_obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "control        = ", "")+GXutil.str( AV193CCTCod, 6, 0)+GXutil.newLine( ) );
                     AV194Col_Inc_obs.add(AV195Item_Col_Inc_obs, 0);
                     pr_default.readNext(4);
                  }
                  pr_default.close(4);
               }
               pr_default.readNext(2);
            }
            pr_default.close(2);
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV194Col_Inc_obs.size() > 0 )
      {
         AV196Json_inc_obs = AV194Col_Inc_obs.toJSonString(false) ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV205Pgmname, AV172Usurcod, AV173Station, AV196Json_inc_obs, AV18BarCod, AV16BarReoOri, AV17BarParOri) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = prpi002.this.A396EmprCod;
      this.aP1[0] = prpi002.this.AV15BarCodOri;
      this.aP2[0] = prpi002.this.AV16BarReoOri;
      this.aP3[0] = prpi002.this.AV17BarParOri;
      this.aP4[0] = prpi002.this.AV18BarCod;
      this.aP5[0] = prpi002.this.AV19BarParPan;
      this.aP6[0] = prpi002.this.AV20BarSit;
      this.aP7[0] = prpi002.this.AV21Reo;
      this.aP8[0] = prpi002.this.AV22TipDefCod;
      this.aP9[0] = prpi002.this.AV23TipDefPor;
      this.aP10[0] = prpi002.this.AV24BarMaqCod;
      this.aP11[0] = prpi002.this.AV25BarConReo;
      this.aP12[0] = prpi002.this.AV26Codigo;
      this.aP13[0] = prpi002.this.AV27DisCod;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV150ContDsc = "" ;
      AV159Intexco = DecimalUtil.ZERO ;
      AV173Station = "" ;
      GXt_char2 = "" ;
      AV174EmprNom = "" ;
      AV172Usurcod = "" ;
      AV35EmprCod = "" ;
      scmdbuf = "" ;
      P04QX3_A396EmprCod = new String[] {""} ;
      P04QX3_A130BarCodPar = new String[] {""} ;
      P04QX3_A132BarCodReo = new byte[1] ;
      P04QX3_A129BarCod = new int[1] ;
      P04QX3_A966PartCod = new String[] {""} ;
      P04QX3_n966PartCod = new boolean[] {false} ;
      P04QX3_A252CliCod = new int[1] ;
      P04QX3_n252CliCod = new boolean[] {false} ;
      P04QX3_A361DisCod = new int[1] ;
      P04QX3_A5253BarAcc = new String[] {""} ;
      P04QX3_A213BarSit = new byte[1] ;
      P04QX3_A365DisDes = new String[] {""} ;
      P04QX3_A189BarNumAny = new short[1] ;
      P04QX3_A137BarConPar = new String[] {""} ;
      P04QX3_A141BarCosPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04QX3_A140BarCosAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04QX3_A898BarPieNDes = new int[1] ;
      P04QX3_n898BarPieNDes = new boolean[] {false} ;
      A130BarCodPar = "" ;
      A966PartCod = "" ;
      A5253BarAcc = "" ;
      A365DisDes = "" ;
      A137BarConPar = "" ;
      A141BarCosPro = DecimalUtil.ZERO ;
      A140BarCosAny = DecimalUtil.ZERO ;
      AV165BarHdro = "" ;
      AV133PartCod = "" ;
      AV147BarAcc = "" ;
      AV58DisDes = "" ;
      AV100BarConPar = "" ;
      AV31CosPro = DecimalUtil.ZERO ;
      AV32CosAny = DecimalUtil.ZERO ;
      AV194Col_Inc_obs = new GXBaseCollection<app.SdtIncidenciasObservaciones_SDT>(app.SdtIncidenciasObservaciones_SDT.class, "IncidenciasObservaciones_SDT", "TexplusNET", remoteHandle);
      P04QX4_A396EmprCod = new String[] {""} ;
      P04QX4_A129BarCod = new int[1] ;
      P04QX4_A132BarCodReo = new byte[1] ;
      P04QX4_A130BarCodPar = new String[] {""} ;
      P04QX4_A758ProCod = new String[] {""} ;
      P04QX4_A761ProFasLin = new short[1] ;
      P04QX4_n761ProFasLin = new boolean[] {false} ;
      A758ProCod = "" ;
      AV33ProCod = "" ;
      Gx_msg = "" ;
      AV195Item_Col_Inc_obs = new app.SdtIncidenciasObservaciones_SDT(remoteHandle, context);
      P04QX5_A396EmprCod = new String[] {""} ;
      P04QX5_A129BarCod = new int[1] ;
      P04QX5_A132BarCodReo = new byte[1] ;
      P04QX5_A130BarCodPar = new String[] {""} ;
      P04QX5_A758ProCod = new String[] {""} ;
      P04QX5_A194BarOrdLin = new short[1] ;
      P04QX5_A457FasCod = new String[] {""} ;
      P04QX5_A153BarFasEst = new byte[1] ;
      P04QX5_A162BarFecTeo = new java.util.Date[] {GXutil.nullDate()} ;
      P04QX5_A160BarFecRea = new java.util.Date[] {GXutil.nullDate()} ;
      P04QX5_A216BarTieTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04QX5_A227BarUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04QX5_A179BarLoc = new String[] {""} ;
      P04QX5_A165BarHorIni = new short[1] ;
      P04QX5_A164BarHorFin = new short[1] ;
      P04QX5_A215BarTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04QX5_A603MaqCodBis = new String[] {""} ;
      P04QX5_A152BarFasCon = new String[] {""} ;
      P04QX5_A150BarFacTin = new String[] {""} ;
      P04QX5_A3298BarFecRIni = new java.util.Date[] {GXutil.nullDate()} ;
      P04QX5_A4022BarNumBot = new int[1] ;
      P04QX5_A5719BarFasKgT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04QX5_n5719BarFasKgT = new boolean[] {false} ;
      P04QX5_A5720BarFasMtT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04QX5_n5720BarFasMtT = new boolean[] {false} ;
      P04QX5_A3837BarFasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04QX5_n3837BarFasKgm = new boolean[] {false} ;
      P04QX5_A3838BarFasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04QX5_n3838BarFasMtr = new boolean[] {false} ;
      P04QX5_A4301BarFasCoP = new String[] {""} ;
      P04QX5_A4905BarFasAcab = new String[] {""} ;
      P04QX5_A5047BarFasFPl = new java.util.Date[] {GXutil.nullDate()} ;
      P04QX5_n5047BarFasFPl = new boolean[] {false} ;
      P04QX5_A5048BarFasUsu = new String[] {""} ;
      P04QX5_n5048BarFasUsu = new boolean[] {false} ;
      P04QX5_A5369BarFasGral = new String[] {""} ;
      P04QX5_n5369BarFasGral = new boolean[] {false} ;
      P04QX5_A5896BarMaqPlan = new String[] {""} ;
      P04QX5_n5896BarMaqPlan = new boolean[] {false} ;
      P04QX5_A4287BarFasFor = new String[] {""} ;
      P04QX5_A4442BarFasDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P04QX5_n4442BarFasDTI = new boolean[] {false} ;
      P04QX5_A4443BarFasDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P04QX5_n4443BarFasDTF = new boolean[] {false} ;
      P04QX5_A9842BarObsF = new String[] {""} ;
      P04QX5_n9842BarObsF = new boolean[] {false} ;
      P04QX5_A10032BarObsB = new String[] {""} ;
      P04QX5_n10032BarObsB = new boolean[] {false} ;
      A457FasCod = "" ;
      A162BarFecTeo = GXutil.nullDate() ;
      A160BarFecRea = GXutil.nullDate() ;
      A216BarTieTeo = DecimalUtil.ZERO ;
      A227BarUni = DecimalUtil.ZERO ;
      A179BarLoc = "" ;
      A215BarTieRea = DecimalUtil.ZERO ;
      A603MaqCodBis = "" ;
      A152BarFasCon = "" ;
      A150BarFacTin = "" ;
      A3298BarFecRIni = GXutil.nullDate() ;
      A5719BarFasKgT = DecimalUtil.ZERO ;
      A5720BarFasMtT = DecimalUtil.ZERO ;
      A3837BarFasKgm = DecimalUtil.ZERO ;
      A3838BarFasMtr = DecimalUtil.ZERO ;
      A4301BarFasCoP = "" ;
      A4905BarFasAcab = "" ;
      A5047BarFasFPl = GXutil.nullDate() ;
      A5048BarFasUsu = "" ;
      A5369BarFasGral = "" ;
      A5896BarMaqPlan = "" ;
      A4287BarFasFor = "" ;
      A4442BarFasDTI = GXutil.resetTime( GXutil.nullDate() );
      A4443BarFasDTF = GXutil.resetTime( GXutil.nullDate() );
      A9842BarObsF = "" ;
      A10032BarObsB = "" ;
      AV37FasCod = "" ;
      AV39BarFecTeo = GXutil.nullDate() ;
      AV40BarFecRea = GXutil.nullDate() ;
      AV41BarTieTeo = DecimalUtil.ZERO ;
      AV42BarUni = DecimalUtil.ZERO ;
      AV43BarLoc = "" ;
      AV46BarTieRea = DecimalUtil.ZERO ;
      AV125MaqCod = "" ;
      AV131BarFasCon = "" ;
      AV132BarFacTin = "" ;
      AV135BarFecRIni = GXutil.nullDate() ;
      AV143BarFasKgt = DecimalUtil.ZERO ;
      AV144BarFasMtt = DecimalUtil.ZERO ;
      AV145BarFasKgm = DecimalUtil.ZERO ;
      AV146BarFasMtr = DecimalUtil.ZERO ;
      AV151BarFascop = "" ;
      AV152Barfasacab = "" ;
      AV153Barfasfpl = GXutil.nullDate() ;
      AV154Barfasusu = "" ;
      AV155Barfasgral = "" ;
      AV156BarMaqPlan = "" ;
      AV158Barfasfor = "" ;
      AV163Barfasdti = GXutil.resetTime( GXutil.nullDate() );
      AV164Barfasdtf = GXutil.resetTime( GXutil.nullDate() );
      AV185BarObsf = "" ;
      AV186BarObsB = "" ;
      GXv_char5 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int9 = new short[1] ;
      GXv_char10 = new String[1] ;
      GXv_date12 = new java.util.Date[1] ;
      GXv_date13 = new java.util.Date[1] ;
      GXv_date14 = new java.util.Date[1] ;
      GXv_decimal15 = new java.math.BigDecimal[1] ;
      GXv_decimal16 = new java.math.BigDecimal[1] ;
      GXv_char17 = new String[1] ;
      GXv_decimal20 = new java.math.BigDecimal[1] ;
      GXv_char21 = new String[1] ;
      GXv_char22 = new String[1] ;
      GXv_char23 = new String[1] ;
      GXv_decimal25 = new java.math.BigDecimal[1] ;
      GXv_decimal26 = new java.math.BigDecimal[1] ;
      GXv_decimal27 = new java.math.BigDecimal[1] ;
      GXv_decimal28 = new java.math.BigDecimal[1] ;
      GXv_char29 = new String[1] ;
      GXv_char30 = new String[1] ;
      GXv_date31 = new java.util.Date[1] ;
      GXv_char32 = new String[1] ;
      GXv_char33 = new String[1] ;
      GXv_char34 = new String[1] ;
      GXv_dtime36 = new java.util.Date[1] ;
      GXv_dtime37 = new java.util.Date[1] ;
      P04QX6_A396EmprCod = new String[] {""} ;
      P04QX6_A129BarCod = new int[1] ;
      P04QX6_A132BarCodReo = new byte[1] ;
      P04QX6_A130BarCodPar = new String[] {""} ;
      P04QX6_A758ProCod = new String[] {""} ;
      P04QX6_A194BarOrdLin = new short[1] ;
      P04QX6_A1664ParFasCod = new short[1] ;
      GXv_int18 = new short[1] ;
      P04QX7_A396EmprCod = new String[] {""} ;
      P04QX7_A129BarCod = new int[1] ;
      P04QX7_A132BarCodReo = new byte[1] ;
      P04QX7_A130BarCodPar = new String[] {""} ;
      P04QX7_A758ProCod = new String[] {""} ;
      P04QX7_A194BarOrdLin = new short[1] ;
      P04QX7_A4031CCTCod = new int[1] ;
      GXv_char40 = new String[1] ;
      GXv_int24 = new int[1] ;
      GXv_int11 = new byte[1] ;
      GXv_char39 = new String[1] ;
      GXv_char38 = new String[1] ;
      GXv_int19 = new short[1] ;
      GXv_int8 = new int[1] ;
      GXv_int41 = new int[1] ;
      GXv_int1 = new byte[1] ;
      GXv_char35 = new String[1] ;
      AV196Json_inc_obs = "" ;
      AV205Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.prpi002__default(),
         new Object[] {
             new Object[] {
            P04QX3_A396EmprCod, P04QX3_A130BarCodPar, P04QX3_A132BarCodReo, P04QX3_A129BarCod, P04QX3_A966PartCod, P04QX3_n966PartCod, P04QX3_A252CliCod, P04QX3_n252CliCod, P04QX3_A361DisCod, P04QX3_A5253BarAcc,
            P04QX3_A213BarSit, P04QX3_A365DisDes, P04QX3_A189BarNumAny, P04QX3_A137BarConPar, P04QX3_A141BarCosPro, P04QX3_A140BarCosAny, P04QX3_A898BarPieNDes, P04QX3_n898BarPieNDes
            }
            , new Object[] {
            P04QX4_A396EmprCod, P04QX4_A129BarCod, P04QX4_A132BarCodReo, P04QX4_A130BarCodPar, P04QX4_A758ProCod, P04QX4_A761ProFasLin, P04QX4_n761ProFasLin
            }
            , new Object[] {
            P04QX5_A396EmprCod, P04QX5_A129BarCod, P04QX5_A132BarCodReo, P04QX5_A130BarCodPar, P04QX5_A758ProCod, P04QX5_A194BarOrdLin, P04QX5_A457FasCod, P04QX5_A153BarFasEst, P04QX5_A162BarFecTeo, P04QX5_A160BarFecRea,
            P04QX5_A216BarTieTeo, P04QX5_A227BarUni, P04QX5_A179BarLoc, P04QX5_A165BarHorIni, P04QX5_A164BarHorFin, P04QX5_A215BarTieRea, P04QX5_A603MaqCodBis, P04QX5_A152BarFasCon, P04QX5_A150BarFacTin, P04QX5_A3298BarFecRIni,
            P04QX5_A4022BarNumBot, P04QX5_A5719BarFasKgT, P04QX5_n5719BarFasKgT, P04QX5_A5720BarFasMtT, P04QX5_n5720BarFasMtT, P04QX5_A3837BarFasKgm, P04QX5_n3837BarFasKgm, P04QX5_A3838BarFasMtr, P04QX5_n3838BarFasMtr, P04QX5_A4301BarFasCoP,
            P04QX5_A4905BarFasAcab, P04QX5_A5047BarFasFPl, P04QX5_n5047BarFasFPl, P04QX5_A5048BarFasUsu, P04QX5_n5048BarFasUsu, P04QX5_A5369BarFasGral, P04QX5_n5369BarFasGral, P04QX5_A5896BarMaqPlan, P04QX5_n5896BarMaqPlan, P04QX5_A4287BarFasFor,
            P04QX5_A4442BarFasDTI, P04QX5_n4442BarFasDTI, P04QX5_A4443BarFasDTF, P04QX5_n4443BarFasDTF, P04QX5_A9842BarObsF, P04QX5_n9842BarObsF, P04QX5_A10032BarObsB, P04QX5_n10032BarObsB
            }
            , new Object[] {
            P04QX6_A396EmprCod, P04QX6_A129BarCod, P04QX6_A132BarCodReo, P04QX6_A130BarCodPar, P04QX6_A758ProCod, P04QX6_A194BarOrdLin, P04QX6_A1664ParFasCod
            }
            , new Object[] {
            P04QX7_A396EmprCod, P04QX7_A129BarCod, P04QX7_A132BarCodReo, P04QX7_A130BarCodPar, P04QX7_A758ProCod, P04QX7_A194BarOrdLin, P04QX7_A4031CCTCod
            }
         }
      );
      AV205Pgmname = "PRPI002" ;
      /* GeneXus formulas. */
      AV205Pgmname = "PRPI002" ;
      Gx_err = (short)(0) ;
   }

   private byte AV16BarReoOri ;
   private byte AV20BarSit ;
   private byte AV25BarConReo ;
   private byte AV134FlagHil ;
   private byte AV136FlagBros ;
   private byte AV141Pervaf ;
   private byte AV161Artextil ;
   private byte AV167Jpf ;
   private byte AV140JBMartin ;
   private byte AV162Lindalana ;
   private byte AV160Texfina ;
   private byte AV166Vertex ;
   private byte AV187Torient ;
   private byte AV188PzasLector ;
   private byte GXt_int6 ;
   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private byte AV97Situa ;
   private byte AV123Sit2 ;
   private byte A153BarFasEst ;
   private byte AV38BarFasEst ;
   private byte GXv_int11[] ;
   private byte GXv_int1[] ;
   private short AV22TipDefCod ;
   private short AV23TipDefPor ;
   private short AV192nopasarcc ;
   private short A189BarNumAny ;
   private short AV101BarNumAny ;
   private short A761ProFasLin ;
   private short AV34ProFasLin ;
   private short A194BarOrdLin ;
   private short A165BarHorIni ;
   private short A164BarHorFin ;
   private short AV36BarOrdLin ;
   private short AV44BarHorIni ;
   private short AV45BarHorFin ;
   private short GXv_int9[] ;
   private short A1664ParFasCod ;
   private short AV142ParFasCod ;
   private short GXv_int18[] ;
   private short GXv_int19[] ;
   private short Gx_err ;
   private int AV15BarCodOri ;
   private int AV18BarCod ;
   private int AV27DisCod ;
   private int AV148CliPropio ;
   private int AV189ConVal ;
   private int GXt_int7 ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A361DisCod ;
   private int A898BarPieNDes ;
   private int AV59CliCod ;
   private int AV129DisOriCod ;
   private int AV29ContPie ;
   private int AV108BarPieNDes ;
   private int AV122PNoDes ;
   private int A4022BarNumBot ;
   private int AV139BarNumBot ;
   private int A4031CCTCod ;
   private int AV193CCTCod ;
   private int GXv_int24[] ;
   private int GXv_int8[] ;
   private int GXv_int41[] ;
   private java.math.BigDecimal AV159Intexco ;
   private java.math.BigDecimal A141BarCosPro ;
   private java.math.BigDecimal A140BarCosAny ;
   private java.math.BigDecimal AV31CosPro ;
   private java.math.BigDecimal AV32CosAny ;
   private java.math.BigDecimal A216BarTieTeo ;
   private java.math.BigDecimal A227BarUni ;
   private java.math.BigDecimal A215BarTieRea ;
   private java.math.BigDecimal A5719BarFasKgT ;
   private java.math.BigDecimal A5720BarFasMtT ;
   private java.math.BigDecimal A3837BarFasKgm ;
   private java.math.BigDecimal A3838BarFasMtr ;
   private java.math.BigDecimal AV41BarTieTeo ;
   private java.math.BigDecimal AV42BarUni ;
   private java.math.BigDecimal AV46BarTieRea ;
   private java.math.BigDecimal AV143BarFasKgt ;
   private java.math.BigDecimal AV144BarFasMtt ;
   private java.math.BigDecimal AV145BarFasKgm ;
   private java.math.BigDecimal AV146BarFasMtr ;
   private java.math.BigDecimal GXv_decimal15[] ;
   private java.math.BigDecimal GXv_decimal16[] ;
   private java.math.BigDecimal GXv_decimal20[] ;
   private java.math.BigDecimal GXv_decimal25[] ;
   private java.math.BigDecimal GXv_decimal26[] ;
   private java.math.BigDecimal GXv_decimal27[] ;
   private java.math.BigDecimal GXv_decimal28[] ;
   private String A396EmprCod ;
   private String AV17BarParOri ;
   private String AV19BarParPan ;
   private String AV21Reo ;
   private String AV24BarMaqCod ;
   private String AV26Codigo ;
   private String AV150ContDsc ;
   private String AV173Station ;
   private String GXt_char2 ;
   private String AV174EmprNom ;
   private String AV172Usurcod ;
   private String AV35EmprCod ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A966PartCod ;
   private String A5253BarAcc ;
   private String A365DisDes ;
   private String A137BarConPar ;
   private String AV165BarHdro ;
   private String AV133PartCod ;
   private String AV147BarAcc ;
   private String AV58DisDes ;
   private String AV100BarConPar ;
   private String A758ProCod ;
   private String AV33ProCod ;
   private String Gx_msg ;
   private String A457FasCod ;
   private String A179BarLoc ;
   private String A603MaqCodBis ;
   private String A152BarFasCon ;
   private String A150BarFacTin ;
   private String A4301BarFasCoP ;
   private String A4905BarFasAcab ;
   private String A5048BarFasUsu ;
   private String A5369BarFasGral ;
   private String A5896BarMaqPlan ;
   private String A4287BarFasFor ;
   private String AV37FasCod ;
   private String AV43BarLoc ;
   private String AV125MaqCod ;
   private String AV131BarFasCon ;
   private String AV132BarFacTin ;
   private String AV151BarFascop ;
   private String AV152Barfasacab ;
   private String AV154Barfasusu ;
   private String AV155Barfasgral ;
   private String AV156BarMaqPlan ;
   private String AV158Barfasfor ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char10[] ;
   private String GXv_char17[] ;
   private String GXv_char21[] ;
   private String GXv_char22[] ;
   private String GXv_char23[] ;
   private String GXv_char29[] ;
   private String GXv_char30[] ;
   private String GXv_char32[] ;
   private String GXv_char33[] ;
   private String GXv_char34[] ;
   private String GXv_char40[] ;
   private String GXv_char39[] ;
   private String GXv_char38[] ;
   private String GXv_char35[] ;
   private String AV205Pgmname ;
   private java.util.Date A4442BarFasDTI ;
   private java.util.Date A4443BarFasDTF ;
   private java.util.Date AV163Barfasdti ;
   private java.util.Date AV164Barfasdtf ;
   private java.util.Date GXv_dtime36[] ;
   private java.util.Date GXv_dtime37[] ;
   private java.util.Date A162BarFecTeo ;
   private java.util.Date A160BarFecRea ;
   private java.util.Date A3298BarFecRIni ;
   private java.util.Date A5047BarFasFPl ;
   private java.util.Date AV39BarFecTeo ;
   private java.util.Date AV40BarFecRea ;
   private java.util.Date AV135BarFecRIni ;
   private java.util.Date AV153Barfasfpl ;
   private java.util.Date GXv_date12[] ;
   private java.util.Date GXv_date13[] ;
   private java.util.Date GXv_date14[] ;
   private java.util.Date GXv_date31[] ;
   private boolean n966PartCod ;
   private boolean n252CliCod ;
   private boolean n898BarPieNDes ;
   private boolean n761ProFasLin ;
   private boolean n5719BarFasKgT ;
   private boolean n5720BarFasMtT ;
   private boolean n3837BarFasKgm ;
   private boolean n3838BarFasMtr ;
   private boolean n5047BarFasFPl ;
   private boolean n5048BarFasUsu ;
   private boolean n5369BarFasGral ;
   private boolean n5896BarMaqPlan ;
   private boolean n4442BarFasDTI ;
   private boolean n4443BarFasDTF ;
   private boolean n9842BarObsF ;
   private boolean n10032BarObsB ;
   private String AV196Json_inc_obs ;
   private String A9842BarObsF ;
   private String A10032BarObsB ;
   private String AV185BarObsf ;
   private String AV186BarObsB ;
   private int[] aP13 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private String[] aP5 ;
   private byte[] aP6 ;
   private String[] aP7 ;
   private short[] aP8 ;
   private short[] aP9 ;
   private String[] aP10 ;
   private byte[] aP11 ;
   private String[] aP12 ;
   private IDataStoreProvider pr_default ;
   private String[] P04QX3_A396EmprCod ;
   private String[] P04QX3_A130BarCodPar ;
   private byte[] P04QX3_A132BarCodReo ;
   private int[] P04QX3_A129BarCod ;
   private String[] P04QX3_A966PartCod ;
   private boolean[] P04QX3_n966PartCod ;
   private int[] P04QX3_A252CliCod ;
   private boolean[] P04QX3_n252CliCod ;
   private int[] P04QX3_A361DisCod ;
   private String[] P04QX3_A5253BarAcc ;
   private byte[] P04QX3_A213BarSit ;
   private String[] P04QX3_A365DisDes ;
   private short[] P04QX3_A189BarNumAny ;
   private String[] P04QX3_A137BarConPar ;
   private java.math.BigDecimal[] P04QX3_A141BarCosPro ;
   private java.math.BigDecimal[] P04QX3_A140BarCosAny ;
   private int[] P04QX3_A898BarPieNDes ;
   private boolean[] P04QX3_n898BarPieNDes ;
   private String[] P04QX4_A396EmprCod ;
   private int[] P04QX4_A129BarCod ;
   private byte[] P04QX4_A132BarCodReo ;
   private String[] P04QX4_A130BarCodPar ;
   private String[] P04QX4_A758ProCod ;
   private short[] P04QX4_A761ProFasLin ;
   private boolean[] P04QX4_n761ProFasLin ;
   private String[] P04QX5_A396EmprCod ;
   private int[] P04QX5_A129BarCod ;
   private byte[] P04QX5_A132BarCodReo ;
   private String[] P04QX5_A130BarCodPar ;
   private String[] P04QX5_A758ProCod ;
   private short[] P04QX5_A194BarOrdLin ;
   private String[] P04QX5_A457FasCod ;
   private byte[] P04QX5_A153BarFasEst ;
   private java.util.Date[] P04QX5_A162BarFecTeo ;
   private java.util.Date[] P04QX5_A160BarFecRea ;
   private java.math.BigDecimal[] P04QX5_A216BarTieTeo ;
   private java.math.BigDecimal[] P04QX5_A227BarUni ;
   private String[] P04QX5_A179BarLoc ;
   private short[] P04QX5_A165BarHorIni ;
   private short[] P04QX5_A164BarHorFin ;
   private java.math.BigDecimal[] P04QX5_A215BarTieRea ;
   private String[] P04QX5_A603MaqCodBis ;
   private String[] P04QX5_A152BarFasCon ;
   private String[] P04QX5_A150BarFacTin ;
   private java.util.Date[] P04QX5_A3298BarFecRIni ;
   private int[] P04QX5_A4022BarNumBot ;
   private java.math.BigDecimal[] P04QX5_A5719BarFasKgT ;
   private boolean[] P04QX5_n5719BarFasKgT ;
   private java.math.BigDecimal[] P04QX5_A5720BarFasMtT ;
   private boolean[] P04QX5_n5720BarFasMtT ;
   private java.math.BigDecimal[] P04QX5_A3837BarFasKgm ;
   private boolean[] P04QX5_n3837BarFasKgm ;
   private java.math.BigDecimal[] P04QX5_A3838BarFasMtr ;
   private boolean[] P04QX5_n3838BarFasMtr ;
   private String[] P04QX5_A4301BarFasCoP ;
   private String[] P04QX5_A4905BarFasAcab ;
   private java.util.Date[] P04QX5_A5047BarFasFPl ;
   private boolean[] P04QX5_n5047BarFasFPl ;
   private String[] P04QX5_A5048BarFasUsu ;
   private boolean[] P04QX5_n5048BarFasUsu ;
   private String[] P04QX5_A5369BarFasGral ;
   private boolean[] P04QX5_n5369BarFasGral ;
   private String[] P04QX5_A5896BarMaqPlan ;
   private boolean[] P04QX5_n5896BarMaqPlan ;
   private String[] P04QX5_A4287BarFasFor ;
   private java.util.Date[] P04QX5_A4442BarFasDTI ;
   private boolean[] P04QX5_n4442BarFasDTI ;
   private java.util.Date[] P04QX5_A4443BarFasDTF ;
   private boolean[] P04QX5_n4443BarFasDTF ;
   private String[] P04QX5_A9842BarObsF ;
   private boolean[] P04QX5_n9842BarObsF ;
   private String[] P04QX5_A10032BarObsB ;
   private boolean[] P04QX5_n10032BarObsB ;
   private String[] P04QX6_A396EmprCod ;
   private int[] P04QX6_A129BarCod ;
   private byte[] P04QX6_A132BarCodReo ;
   private String[] P04QX6_A130BarCodPar ;
   private String[] P04QX6_A758ProCod ;
   private short[] P04QX6_A194BarOrdLin ;
   private short[] P04QX6_A1664ParFasCod ;
   private String[] P04QX7_A396EmprCod ;
   private int[] P04QX7_A129BarCod ;
   private byte[] P04QX7_A132BarCodReo ;
   private String[] P04QX7_A130BarCodPar ;
   private String[] P04QX7_A758ProCod ;
   private short[] P04QX7_A194BarOrdLin ;
   private int[] P04QX7_A4031CCTCod ;
   private GXBaseCollection<app.SdtIncidenciasObservaciones_SDT> AV194Col_Inc_obs ;
   private app.SdtIncidenciasObservaciones_SDT AV195Item_Col_Inc_obs ;
}

final  class prpi002__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04QX3", "SELECT T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T2.PartCod, T1.CliCod, T1.DisCod, T1.BarAcc, T1.BarSit, T1.DisDes, T1.BarNumAny, T1.BarConPar, T1.BarCosPro, T1.BarCosAny, COALESCE( T3.BarPieNDes, 0) AS BarPieNDes FROM ((TXPBARCAD T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04QX4", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, ProFasLin FROM TXPBARPRO WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04QX5", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, FasCod, BarFasEst, BarFecTeo, BarFecRea, BarTieTeo, BarUni, BarLoc, BarHorIni, BarHorFin, BarTieRea, MaqCodBis, BarFasCon, BarFacTin, BarFecRIni, BarNumBot, BarFasKgT, BarFasMtT, BarFasKgm, BarFasMtr, BarFasCoP, BarFasAcab, BarFasFPl, BarFasUsu, BarFasGral, BarMaqPlan, BarFasFor, BarFasDTI, BarFasDTF, BarObsF, BarObsB FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04QX6", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, ParFasCod FROM TXPBarPar WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, ParFasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04QX7", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod FROM TXPCC WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 1);
               ((byte[]) buf[10])[0] = rslt.getByte(9);
               ((String[]) buf[11])[0] = rslt.getString(10, 1);
               ((short[]) buf[12])[0] = rslt.getShort(11);
               ((String[]) buf[13])[0] = rslt.getString(12, 1);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(13,2);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(14,2);
               ((int[]) buf[16])[0] = rslt.getInt(15);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,2);
               ((String[]) buf[12])[0] = rslt.getString(13, 10);
               ((short[]) buf[13])[0] = rslt.getShort(14);
               ((short[]) buf[14])[0] = rslt.getShort(15);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(16,2);
               ((String[]) buf[16])[0] = rslt.getString(17, 6);
               ((String[]) buf[17])[0] = rslt.getString(18, 1);
               ((String[]) buf[18])[0] = rslt.getString(19, 1);
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(20);
               ((int[]) buf[20])[0] = rslt.getInt(21);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(22,2);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(23,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(24,2);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(25,2);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(26, 1);
               ((String[]) buf[30])[0] = rslt.getString(27, 1);
               ((java.util.Date[]) buf[31])[0] = rslt.getGXDate(28);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(29, 8);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(30, 1);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(31, 6);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(32, 1);
               ((java.util.Date[]) buf[40])[0] = rslt.getGXDateTime(33);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[42])[0] = rslt.getGXDateTime(34);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getVarchar(35);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getVarchar(36);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
      }
   }

}

