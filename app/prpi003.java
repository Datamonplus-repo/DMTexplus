package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class prpi003 extends GXProcedure
{
   public prpi003( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( prpi003.class ), "" );
   }

   public prpi003( int remoteHandle ,
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
      prpi003.this.aP13 = new int[] {0};
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
      prpi003.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      prpi003.this.AV15BarCodOri = aP1[0];
      this.aP1 = aP1;
      prpi003.this.AV16BarReoOri = aP2[0];
      this.aP2 = aP2;
      prpi003.this.AV17BarParOri = aP3[0];
      this.aP3 = aP3;
      prpi003.this.AV18BarCod = aP4[0];
      this.aP4 = aP4;
      prpi003.this.AV19BarParPan = aP5[0];
      this.aP5 = aP5;
      prpi003.this.AV20BarSit = aP6[0];
      this.aP6 = aP6;
      prpi003.this.AV21Reo = aP7[0];
      this.aP7 = aP7;
      prpi003.this.AV22TipDefCod = aP8[0];
      this.aP8 = aP8;
      prpi003.this.AV23TipDefPor = aP9[0];
      this.aP9 = aP9;
      prpi003.this.AV24BarMaqCod = aP10[0];
      this.aP10 = aP10;
      prpi003.this.AV25BarConReo = aP11[0];
      this.aP11 = aP11;
      prpi003.this.AV26Codigo = aP12[0];
      this.aP12 = aP12;
      prpi003.this.AV27DisCod = aP13[0];
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
      prpi003.this.AV134FlagHil = GXv_int1[0] ;
      AV136FlagBros = (byte)(0) ;
      GXv_int1[0] = AV136FlagBros ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "BROS", ""), GXv_int1) ;
      prpi003.this.AV136FlagBros = GXv_int1[0] ;
      AV141Pervaf = (byte)(0) ;
      GXv_int1[0] = AV141Pervaf ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PERVAF", ""), GXv_int1) ;
      prpi003.this.AV141Pervaf = GXv_int1[0] ;
      GXt_char2 = AV150ContDsc ;
      GXv_char3[0] = A396EmprCod ;
      GXv_char4[0] = httpContext.getMessage( "CLISKP", "") ;
      GXv_char5[0] = GXt_char2 ;
      new app.pbusdsc(remoteHandle, context).execute( GXv_char3, GXv_char4, GXv_char5) ;
      prpi003.this.A396EmprCod = GXv_char3[0] ;
      prpi003.this.GXt_char2 = GXv_char5[0] ;
      AV150ContDsc = GXt_char2 ;
      AV148CliPropio = (int)(GXutil.lval( GXutil.trim( AV150ContDsc))) ;
      GXv_int1[0] = AV161Artextil ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ARTEXT", ""), GXv_int1) ;
      prpi003.this.AV161Artextil = GXv_int1[0] ;
      GXt_int6 = AV167Jpf ;
      GXv_int1[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "JPF", ""), GXv_int1) ;
      prpi003.this.GXt_int6 = GXv_int1[0] ;
      AV167Jpf = GXt_int6 ;
      AV140JBMartin = (byte)(0) ;
      GXv_int1[0] = AV140JBMartin ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "JBMAR", ""), GXv_int1) ;
      prpi003.this.AV140JBMartin = GXv_int1[0] ;
      AV162Lindalana = (byte)(0) ;
      GXv_int1[0] = AV162Lindalana ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "LINDAL", ""), GXv_int1) ;
      prpi003.this.AV162Lindalana = GXv_int1[0] ;
      AV140JBMartin = (byte)(0) ;
      GXv_int1[0] = (byte)(DecimalUtil.decToDouble(AV159Intexco)) ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "INTEXC", ""), GXv_int1) ;
      prpi003.this.AV159Intexco = DecimalUtil.doubleToDec(GXv_int1[0]) ;
      GXt_int6 = AV160Texfina ;
      GXv_int1[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TEXFNA", ""), GXv_int1) ;
      prpi003.this.GXt_int6 = GXv_int1[0] ;
      AV160Texfina = GXt_int6 ;
      GXt_int6 = AV166Vertex ;
      GXv_int1[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "VERTEX", ""), GXv_int1) ;
      prpi003.this.GXt_int6 = GXv_int1[0] ;
      AV166Vertex = GXt_int6 ;
      GXt_int6 = AV187Torient ;
      GXv_int1[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TORIEN", ""), GXv_int1) ;
      prpi003.this.GXt_int6 = GXv_int1[0] ;
      AV187Torient = GXt_int6 ;
      GXt_int6 = AV188PzasLector ;
      GXv_int1[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PZLCXX", ""), GXv_int1) ;
      prpi003.this.GXt_int6 = GXv_int1[0] ;
      AV188PzasLector = GXt_int6 ;
      GXt_int7 = AV189ConVal ;
      GXv_char5[0] = A396EmprCod ;
      GXv_char4[0] = httpContext.getMessage( "PZLCXX", "") ;
      GXv_int8[0] = GXt_int7 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char5, GXv_char4, GXv_int8) ;
      prpi003.this.A396EmprCod = GXv_char5[0] ;
      prpi003.this.GXt_int7 = GXv_int8[0] ;
      AV189ConVal = GXt_int7 ;
      GXt_char2 = AV173Station ;
      GXv_char5[0] = GXt_char2 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char5) ;
      prpi003.this.GXt_char2 = GXv_char5[0] ;
      AV173Station = GXt_char2 ;
      GXv_char5[0] = A396EmprCod ;
      GXv_char4[0] = AV174EmprNom ;
      GXv_char3[0] = AV172Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV173Station, GXv_char5, GXv_char4, GXv_char3) ;
      prpi003.this.A396EmprCod = GXv_char5[0] ;
      prpi003.this.AV174EmprNom = GXv_char4[0] ;
      prpi003.this.AV172Usurcod = GXv_char3[0] ;
      AV191Col_Inc_obs.clear();
      /* Using cursor P04R13 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV15BarCodOri), Byte.valueOf(AV16BarReoOri), AV17BarParOri});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A365DisDes = P04R13_A365DisDes[0] ;
         A130BarCodPar = P04R13_A130BarCodPar[0] ;
         A132BarCodReo = P04R13_A132BarCodReo[0] ;
         A129BarCod = P04R13_A129BarCod[0] ;
         A966PartCod = P04R13_A966PartCod[0] ;
         n966PartCod = P04R13_n966PartCod[0] ;
         A252CliCod = P04R13_A252CliCod[0] ;
         n252CliCod = P04R13_n252CliCod[0] ;
         A361DisCod = P04R13_A361DisCod[0] ;
         A5253BarAcc = P04R13_A5253BarAcc[0] ;
         A213BarSit = P04R13_A213BarSit[0] ;
         A189BarNumAny = P04R13_A189BarNumAny[0] ;
         A137BarConPar = P04R13_A137BarConPar[0] ;
         A141BarCosPro = P04R13_A141BarCosPro[0] ;
         A140BarCosAny = P04R13_A140BarCosAny[0] ;
         A898BarPieNDes = P04R13_A898BarPieNDes[0] ;
         n898BarPieNDes = P04R13_n898BarPieNDes[0] ;
         A966PartCod = P04R13_A966PartCod[0] ;
         n966PartCod = P04R13_n966PartCod[0] ;
         A898BarPieNDes = P04R13_A898BarPieNDes[0] ;
         n898BarPieNDes = P04R13_n898BarPieNDes[0] ;
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
         if ( GXutil.strcmp(AV21Reo, httpContext.getMessage( "T", "")) == 0 )
         {
            AV30KilReo = DecimalUtil.doubleToDec(0) ;
            AV124MetReo = DecimalUtil.doubleToDec(0) ;
            /* Using cursor P04R14 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(AV161Artextil)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A201BarPieEst = P04R14_A201BarPieEst[0] ;
               A44AlbRecCod = P04R14_A44AlbRecCod[0] ;
               A203BarPieKil = P04R14_A203BarPieKil[0] ;
               A205BarPieMet = P04R14_A205BarPieMet[0] ;
               A170BarKilLan = P04R14_A170BarKilLan[0] ;
               A183BarMetLan = P04R14_A183BarMetLan[0] ;
               A197BarPConTro = P04R14_A197BarPConTro[0] ;
               A908PieOriCod = P04R14_A908PieOriCod[0] ;
               A1271BarPieLzd = P04R14_A1271BarPieLzd[0] ;
               A1501BarPiePie = P04R14_A1501BarPiePie[0] ;
               A2186BarPieLoc = P04R14_A2186BarPieLoc[0] ;
               n2186BarPieLoc = P04R14_n2186BarPieLoc[0] ;
               A8907PzaB80 = P04R14_A8907PzaB80[0] ;
               n8907PzaB80 = P04R14_n8907PzaB80[0] ;
               A9795BarPieK1 = P04R14_A9795BarPieK1[0] ;
               n9795BarPieK1 = P04R14_n9795BarPieK1[0] ;
               A9796BarPieK2 = P04R14_A9796BarPieK2[0] ;
               n9796BarPieK2 = P04R14_n9796BarPieK2[0] ;
               A9800BarNPes = P04R14_A9800BarNPes[0] ;
               n9800BarNPes = P04R14_n9800BarNPes[0] ;
               A1691BarPieAnc = P04R14_A1691BarPieAnc[0] ;
               n1691BarPieAnc = P04R14_n1691BarPieAnc[0] ;
               A9846BarPieAncc = P04R14_A9846BarPieAncc[0] ;
               n9846BarPieAncc = P04R14_n9846BarPieAncc[0] ;
               A9984BarPiePda = P04R14_A9984BarPiePda[0] ;
               n9984BarPiePda = P04R14_n9984BarPiePda[0] ;
               A8707BapieObs = P04R14_A8707BapieObs[0] ;
               n8707BapieObs = P04R14_n8707BapieObs[0] ;
               A8838CodBarPz = P04R14_A8838CodBarPz[0] ;
               n8838CodBarPz = P04R14_n8838CodBarPz[0] ;
               A200BarPieCod = P04R14_A200BarPieCod[0] ;
               AV48BarPieCod = A200BarPieCod ;
               AV49AlbRecCod = A44AlbRecCod ;
               AV50BarPieKil = A203BarPieKil ;
               AV51BarPieMet = A205BarPieMet ;
               AV52BarPieEst = A201BarPieEst ;
               AV53BarKilLan = A170BarKilLan ;
               AV54BarMetLan = A183BarMetLan ;
               AV55BarPConTro = A197BarPConTro ;
               AV57PieOriCod = A908PieOriCod ;
               AV56BarPieLzd = A1271BarPieLzd ;
               AV130BarPiePie = A1501BarPiePie ;
               AV138BarPieLoc = A2186BarPieLoc ;
               AV30KilReo = AV30KilReo.add(A203BarPieKil) ;
               AV124MetReo = AV124MetReo.add(A205BarPieMet) ;
               AV175pzab80 = A8907PzaB80 ;
               AV177BarPiek1 = A9795BarPieK1 ;
               AV178barPieK2 = A9796BarPieK2 ;
               AV179BarNpes = A9800BarNPes ;
               if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
               {
                  AV29ContPie = (int)(AV29ContPie+1) ;
               }
               else
               {
                  AV29ContPie = (int)(AV29ContPie+A1501BarPiePie) ;
               }
               AV180BarPieanc = A1691BarPieAnc ;
               AV181BarPieAncc = A9846BarPieAncc ;
               AV182BarPiePda = A9984BarPiePda ;
               if ( ( AV188PzasLector == 1 ) && ( AV189ConVal == 0 ) )
               {
                  AV183BaPieobs = " " ;
                  AV184CodBarpz = " " ;
                  AV52BarPieEst = (byte)(0) ;
               }
               else
               {
                  AV183BaPieobs = A8707BapieObs ;
                  AV184CodBarpz = A8838CodBarPz ;
               }
               Gx_msg = httpContext.getMessage( "Prpi003.Creando BARPIE.TOTAL Hdr = ", "") + GXutil.str( AV18BarCod, 8, 0) + "-" + GXutil.str( AV25BarConReo, 1, 0) + AV19BarParPan + httpContext.getMessage( "Pza= ", "") + GXutil.trim( AV48BarPieCod) ;
               GXv_char5[0] = AV35EmprCod ;
               GXv_int8[0] = AV18BarCod ;
               GXv_int1[0] = AV25BarConReo ;
               GXv_char4[0] = AV19BarParPan ;
               GXv_char3[0] = AV48BarPieCod ;
               GXv_int9[0] = AV49AlbRecCod ;
               GXv_decimal10[0] = AV50BarPieKil ;
               GXv_decimal11[0] = AV51BarPieMet ;
               GXv_int12[0] = AV52BarPieEst ;
               GXv_decimal13[0] = AV53BarKilLan ;
               GXv_decimal14[0] = AV54BarMetLan ;
               GXv_int15[0] = AV55BarPConTro ;
               GXv_char16[0] = AV57PieOriCod ;
               GXv_int17[0] = AV56BarPieLzd ;
               GXv_int18[0] = AV130BarPiePie ;
               GXv_char19[0] = AV138BarPieLoc ;
               GXv_char20[0] = AV175pzab80 ;
               GXv_decimal21[0] = AV177BarPiek1 ;
               GXv_decimal22[0] = AV178barPieK2 ;
               GXv_int23[0] = AV179BarNpes ;
               GXv_int24[0] = AV180BarPieanc ;
               GXv_int25[0] = AV181BarPieAncc ;
               GXv_decimal26[0] = AV182BarPiePda ;
               GXv_char27[0] = AV183BaPieobs ;
               GXv_char28[0] = AV184CodBarpz ;
               new app.preo006(remoteHandle, context).execute( GXv_char5, GXv_int8, GXv_int1, GXv_char4, GXv_char3, GXv_int9, GXv_decimal10, GXv_decimal11, GXv_int12, GXv_decimal13, GXv_decimal14, GXv_int15, GXv_char16, GXv_int17, GXv_int18, GXv_char19, GXv_char20, GXv_decimal21, GXv_decimal22, GXv_int23, GXv_int24, GXv_int25, GXv_decimal26, GXv_char27, GXv_char28) ;
               prpi003.this.AV35EmprCod = GXv_char5[0] ;
               prpi003.this.AV18BarCod = GXv_int8[0] ;
               prpi003.this.AV25BarConReo = GXv_int1[0] ;
               prpi003.this.AV19BarParPan = GXv_char4[0] ;
               prpi003.this.AV48BarPieCod = GXv_char3[0] ;
               prpi003.this.AV49AlbRecCod = GXv_int9[0] ;
               prpi003.this.AV50BarPieKil = GXv_decimal10[0] ;
               prpi003.this.AV51BarPieMet = GXv_decimal11[0] ;
               prpi003.this.AV52BarPieEst = GXv_int12[0] ;
               prpi003.this.AV53BarKilLan = GXv_decimal13[0] ;
               prpi003.this.AV54BarMetLan = GXv_decimal14[0] ;
               prpi003.this.AV55BarPConTro = GXv_int15[0] ;
               prpi003.this.AV57PieOriCod = GXv_char16[0] ;
               prpi003.this.AV56BarPieLzd = GXv_int17[0] ;
               prpi003.this.AV130BarPiePie = GXv_int18[0] ;
               prpi003.this.AV138BarPieLoc = GXv_char19[0] ;
               prpi003.this.AV175pzab80 = GXv_char20[0] ;
               prpi003.this.AV177BarPiek1 = GXv_decimal21[0] ;
               prpi003.this.AV178barPieK2 = GXv_decimal22[0] ;
               prpi003.this.AV179BarNpes = GXv_int23[0] ;
               prpi003.this.AV180BarPieanc = GXv_int24[0] ;
               prpi003.this.AV181BarPieAncc = GXv_int25[0] ;
               prpi003.this.AV182BarPiePda = GXv_decimal26[0] ;
               prpi003.this.AV183BaPieobs = GXv_char27[0] ;
               prpi003.this.AV184CodBarpz = GXv_char28[0] ;
               AV192Item_Col_Inc_obs = (app.SdtIncidenciasObservaciones_SDT)new app.SdtIncidenciasObservaciones_SDT(remoteHandle, context);
               AV192Item_Col_Inc_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( httpContext.getMessage( "Creacion NEW BARPIE. TOTAL", "")+GXutil.newLine( ) );
               AV192Item_Col_Inc_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV192Item_Col_Inc_obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "Hd Origen      = ", "")+GXutil.str( AV18BarCod, 8, 0)+"-"+GXutil.str( AV16BarReoOri, 1, 0)+AV17BarParOri+GXutil.newLine( ) );
               AV192Item_Col_Inc_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV192Item_Col_Inc_obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "Hd New         = ", "")+GXutil.str( AV18BarCod, 8, 0)+"-"+GXutil.str( AV25BarConReo, 1, 0)+AV19BarParPan+GXutil.newLine( ) );
               AV192Item_Col_Inc_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV192Item_Col_Inc_obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "N Disp New     = ", "")+GXutil.str( AV27DisCod, 8, 0)+GXutil.newLine( ) );
               AV192Item_Col_Inc_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV192Item_Col_Inc_obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "N Pieza        = ", "")+GXutil.trim( AV48BarPieCod) );
               AV191Col_Inc_obs.add(AV192Item_Col_Inc_obs, 0);
               if ( GXutil.strcmp(AV21Reo, httpContext.getMessage( "P", "")) == 0 )
               {
                  GXv_char28[0] = A396EmprCod ;
                  GXv_int18[0] = AV15BarCodOri ;
                  GXv_int23[0] = AV16BarReoOri ;
                  GXv_char27[0] = AV17BarParOri ;
                  GXv_int17[0] = AV18BarCod ;
                  GXv_int12[0] = AV25BarConReo ;
                  GXv_char20[0] = AV19BarParPan ;
                  GXv_char19[0] = AV48BarPieCod ;
                  new app.preo008(remoteHandle, context).execute( GXv_char28, GXv_int18, GXv_int23, GXv_char27, GXv_int17, GXv_int12, GXv_char20, GXv_char19) ;
                  prpi003.this.A396EmprCod = GXv_char28[0] ;
                  prpi003.this.AV15BarCodOri = GXv_int18[0] ;
                  prpi003.this.AV16BarReoOri = GXv_int23[0] ;
                  prpi003.this.AV17BarParOri = GXv_char27[0] ;
                  prpi003.this.AV18BarCod = GXv_int17[0] ;
                  prpi003.this.AV25BarConReo = GXv_int12[0] ;
                  prpi003.this.AV19BarParPan = GXv_char20[0] ;
                  prpi003.this.AV48BarPieCod = GXv_char19[0] ;
               }
               /* Execute user subroutine: 'BORRAPIE' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(1);
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               pr_default.readNext(1);
            }
            pr_default.close(1);
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV191Col_Inc_obs.size() > 0 )
      {
         AV193Json_inc_obs = AV191Col_Inc_obs.toJSonString(false) ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV199Pgmname, AV172Usurcod, AV173Station, AV193Json_inc_obs, AV18BarCod, AV16BarReoOri, AV17BarParOri) ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'BORRAPIE' Routine */
      returnInSub = false ;
      /* Using cursor P04R15 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV15BarCodOri), Byte.valueOf(AV16BarReoOri), AV17BarParOri, AV48BarPieCod});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A200BarPieCod = P04R15_A200BarPieCod[0] ;
         A130BarCodPar = P04R15_A130BarCodPar[0] ;
         A132BarCodReo = P04R15_A132BarCodReo[0] ;
         A129BarCod = P04R15_A129BarCod[0] ;
         A201BarPieEst = P04R15_A201BarPieEst[0] ;
         if ( ( ( AV161Artextil == 1 ) && ( A201BarPieEst == 1 ) ) || ( A201BarPieEst == 0 ) )
         {
            /* Using cursor P04R16 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
            AV192Item_Col_Inc_obs = (app.SdtIncidenciasObservaciones_SDT)new app.SdtIncidenciasObservaciones_SDT(remoteHandle, context);
            AV192Item_Col_Inc_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( httpContext.getMessage( "Delete BARPIE. TOTAL", "")+GXutil.newLine( ) );
            AV192Item_Col_Inc_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV192Item_Col_Inc_obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "Hd Origen      = ", "")+GXutil.str( AV18BarCod, 8, 0)+"-"+GXutil.str( AV16BarReoOri, 1, 0)+AV17BarParOri+GXutil.newLine( ) );
            AV192Item_Col_Inc_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV192Item_Col_Inc_obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "Hd New         = ", "")+GXutil.str( AV18BarCod, 8, 0)+"-"+GXutil.str( AV25BarConReo, 1, 0)+AV19BarParPan+GXutil.newLine( ) );
            AV192Item_Col_Inc_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV192Item_Col_Inc_obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "N Disp New     = ", "")+GXutil.str( AV27DisCod, 8, 0)+GXutil.newLine( ) );
            AV192Item_Col_Inc_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV192Item_Col_Inc_obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "N Pieza        = ", "")+GXutil.trim( AV48BarPieCod)+GXutil.newLine( ) );
            AV192Item_Col_Inc_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV192Item_Col_Inc_obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "Estado         = ", "")+GXutil.str( A201BarPieEst, 1, 0) );
            AV191Col_Inc_obs.add(AV192Item_Col_Inc_obs, 0);
            /* Using cursor P04R17 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A3858BarTroCod = P04R17_A3858BarTroCod[0] ;
               /* Using cursor P04R18 */
               pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A3858BarTroCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARTRO");
               AV192Item_Col_Inc_obs = (app.SdtIncidenciasObservaciones_SDT)new app.SdtIncidenciasObservaciones_SDT(remoteHandle, context);
               AV192Item_Col_Inc_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( httpContext.getMessage( "Delete BARTRO", "")+GXutil.newLine( ) );
               AV192Item_Col_Inc_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV192Item_Col_Inc_obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "N Pieza        = ", "")+GXutil.trim( AV48BarPieCod)+GXutil.newLine( ) );
               AV192Item_Col_Inc_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV192Item_Col_Inc_obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "TRozo          = ", "")+GXutil.str( A3858BarTroCod, 4, 0) );
               AV191Col_Inc_obs.add(AV192Item_Col_Inc_obs, 0);
               pr_default.readNext(4);
            }
            pr_default.close(4);
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP0[0] = prpi003.this.A396EmprCod;
      this.aP1[0] = prpi003.this.AV15BarCodOri;
      this.aP2[0] = prpi003.this.AV16BarReoOri;
      this.aP3[0] = prpi003.this.AV17BarParOri;
      this.aP4[0] = prpi003.this.AV18BarCod;
      this.aP5[0] = prpi003.this.AV19BarParPan;
      this.aP6[0] = prpi003.this.AV20BarSit;
      this.aP7[0] = prpi003.this.AV21Reo;
      this.aP8[0] = prpi003.this.AV22TipDefCod;
      this.aP9[0] = prpi003.this.AV23TipDefPor;
      this.aP10[0] = prpi003.this.AV24BarMaqCod;
      this.aP11[0] = prpi003.this.AV25BarConReo;
      this.aP12[0] = prpi003.this.AV26Codigo;
      this.aP13[0] = prpi003.this.AV27DisCod;
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
      AV191Col_Inc_obs = new GXBaseCollection<app.SdtIncidenciasObservaciones_SDT>(app.SdtIncidenciasObservaciones_SDT.class, "IncidenciasObservaciones_SDT", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      P04R13_A396EmprCod = new String[] {""} ;
      P04R13_A365DisDes = new String[] {""} ;
      P04R13_A130BarCodPar = new String[] {""} ;
      P04R13_A132BarCodReo = new byte[1] ;
      P04R13_A129BarCod = new int[1] ;
      P04R13_A966PartCod = new String[] {""} ;
      P04R13_n966PartCod = new boolean[] {false} ;
      P04R13_A252CliCod = new int[1] ;
      P04R13_n252CliCod = new boolean[] {false} ;
      P04R13_A361DisCod = new int[1] ;
      P04R13_A5253BarAcc = new String[] {""} ;
      P04R13_A213BarSit = new byte[1] ;
      P04R13_A189BarNumAny = new short[1] ;
      P04R13_A137BarConPar = new String[] {""} ;
      P04R13_A141BarCosPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04R13_A140BarCosAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04R13_A898BarPieNDes = new int[1] ;
      P04R13_n898BarPieNDes = new boolean[] {false} ;
      A365DisDes = "" ;
      A130BarCodPar = "" ;
      A966PartCod = "" ;
      A5253BarAcc = "" ;
      A137BarConPar = "" ;
      A141BarCosPro = DecimalUtil.ZERO ;
      A140BarCosAny = DecimalUtil.ZERO ;
      AV165BarHdro = "" ;
      AV133PartCod = "" ;
      AV35EmprCod = "" ;
      AV147BarAcc = "" ;
      AV58DisDes = "" ;
      AV100BarConPar = "" ;
      AV31CosPro = DecimalUtil.ZERO ;
      AV32CosAny = DecimalUtil.ZERO ;
      AV30KilReo = DecimalUtil.ZERO ;
      AV124MetReo = DecimalUtil.ZERO ;
      P04R14_A396EmprCod = new String[] {""} ;
      P04R14_A129BarCod = new int[1] ;
      P04R14_A132BarCodReo = new byte[1] ;
      P04R14_A130BarCodPar = new String[] {""} ;
      P04R14_A201BarPieEst = new byte[1] ;
      P04R14_A44AlbRecCod = new int[1] ;
      P04R14_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04R14_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04R14_A170BarKilLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04R14_A183BarMetLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04R14_A197BarPConTro = new short[1] ;
      P04R14_A908PieOriCod = new String[] {""} ;
      P04R14_A1271BarPieLzd = new int[1] ;
      P04R14_A1501BarPiePie = new int[1] ;
      P04R14_A2186BarPieLoc = new String[] {""} ;
      P04R14_n2186BarPieLoc = new boolean[] {false} ;
      P04R14_A8907PzaB80 = new String[] {""} ;
      P04R14_n8907PzaB80 = new boolean[] {false} ;
      P04R14_A9795BarPieK1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04R14_n9795BarPieK1 = new boolean[] {false} ;
      P04R14_A9796BarPieK2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04R14_n9796BarPieK2 = new boolean[] {false} ;
      P04R14_A9800BarNPes = new byte[1] ;
      P04R14_n9800BarNPes = new boolean[] {false} ;
      P04R14_A1691BarPieAnc = new short[1] ;
      P04R14_n1691BarPieAnc = new boolean[] {false} ;
      P04R14_A9846BarPieAncc = new short[1] ;
      P04R14_n9846BarPieAncc = new boolean[] {false} ;
      P04R14_A9984BarPiePda = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04R14_n9984BarPiePda = new boolean[] {false} ;
      P04R14_A8707BapieObs = new String[] {""} ;
      P04R14_n8707BapieObs = new boolean[] {false} ;
      P04R14_A8838CodBarPz = new String[] {""} ;
      P04R14_n8838CodBarPz = new boolean[] {false} ;
      P04R14_A200BarPieCod = new String[] {""} ;
      A203BarPieKil = DecimalUtil.ZERO ;
      A205BarPieMet = DecimalUtil.ZERO ;
      A170BarKilLan = DecimalUtil.ZERO ;
      A183BarMetLan = DecimalUtil.ZERO ;
      A908PieOriCod = "" ;
      A2186BarPieLoc = "" ;
      A8907PzaB80 = "" ;
      A9795BarPieK1 = DecimalUtil.ZERO ;
      A9796BarPieK2 = DecimalUtil.ZERO ;
      A9984BarPiePda = DecimalUtil.ZERO ;
      A8707BapieObs = "" ;
      A8838CodBarPz = "" ;
      A200BarPieCod = "" ;
      AV48BarPieCod = "" ;
      AV50BarPieKil = DecimalUtil.ZERO ;
      AV51BarPieMet = DecimalUtil.ZERO ;
      AV53BarKilLan = DecimalUtil.ZERO ;
      AV54BarMetLan = DecimalUtil.ZERO ;
      AV57PieOriCod = "" ;
      AV138BarPieLoc = "" ;
      AV175pzab80 = "" ;
      AV177BarPiek1 = DecimalUtil.ZERO ;
      AV178barPieK2 = DecimalUtil.ZERO ;
      AV182BarPiePda = DecimalUtil.ZERO ;
      AV183BaPieobs = "" ;
      AV184CodBarpz = "" ;
      Gx_msg = "" ;
      GXv_char5 = new String[1] ;
      GXv_int8 = new int[1] ;
      GXv_int1 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int9 = new int[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      GXv_decimal11 = new java.math.BigDecimal[1] ;
      GXv_decimal13 = new java.math.BigDecimal[1] ;
      GXv_decimal14 = new java.math.BigDecimal[1] ;
      GXv_int15 = new short[1] ;
      GXv_char16 = new String[1] ;
      GXv_decimal21 = new java.math.BigDecimal[1] ;
      GXv_decimal22 = new java.math.BigDecimal[1] ;
      GXv_int24 = new short[1] ;
      GXv_int25 = new short[1] ;
      GXv_decimal26 = new java.math.BigDecimal[1] ;
      AV192Item_Col_Inc_obs = new app.SdtIncidenciasObservaciones_SDT(remoteHandle, context);
      GXv_char28 = new String[1] ;
      GXv_int18 = new int[1] ;
      GXv_int23 = new byte[1] ;
      GXv_char27 = new String[1] ;
      GXv_int17 = new int[1] ;
      GXv_int12 = new byte[1] ;
      GXv_char20 = new String[1] ;
      GXv_char19 = new String[1] ;
      AV193Json_inc_obs = "" ;
      AV199Pgmname = "" ;
      P04R15_A396EmprCod = new String[] {""} ;
      P04R15_A200BarPieCod = new String[] {""} ;
      P04R15_A130BarCodPar = new String[] {""} ;
      P04R15_A132BarCodReo = new byte[1] ;
      P04R15_A129BarCod = new int[1] ;
      P04R15_A201BarPieEst = new byte[1] ;
      P04R17_A396EmprCod = new String[] {""} ;
      P04R17_A129BarCod = new int[1] ;
      P04R17_A132BarCodReo = new byte[1] ;
      P04R17_A130BarCodPar = new String[] {""} ;
      P04R17_A200BarPieCod = new String[] {""} ;
      P04R17_A3858BarTroCod = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.prpi003__default(),
         new Object[] {
             new Object[] {
            P04R13_A396EmprCod, P04R13_A365DisDes, P04R13_A130BarCodPar, P04R13_A132BarCodReo, P04R13_A129BarCod, P04R13_A966PartCod, P04R13_n966PartCod, P04R13_A252CliCod, P04R13_n252CliCod, P04R13_A361DisCod,
            P04R13_A5253BarAcc, P04R13_A213BarSit, P04R13_A189BarNumAny, P04R13_A137BarConPar, P04R13_A141BarCosPro, P04R13_A140BarCosAny, P04R13_A898BarPieNDes, P04R13_n898BarPieNDes
            }
            , new Object[] {
            P04R14_A396EmprCod, P04R14_A129BarCod, P04R14_A132BarCodReo, P04R14_A130BarCodPar, P04R14_A201BarPieEst, P04R14_A44AlbRecCod, P04R14_A203BarPieKil, P04R14_A205BarPieMet, P04R14_A170BarKilLan, P04R14_A183BarMetLan,
            P04R14_A197BarPConTro, P04R14_A908PieOriCod, P04R14_A1271BarPieLzd, P04R14_A1501BarPiePie, P04R14_A2186BarPieLoc, P04R14_n2186BarPieLoc, P04R14_A8907PzaB80, P04R14_n8907PzaB80, P04R14_A9795BarPieK1, P04R14_n9795BarPieK1,
            P04R14_A9796BarPieK2, P04R14_n9796BarPieK2, P04R14_A9800BarNPes, P04R14_n9800BarNPes, P04R14_A1691BarPieAnc, P04R14_n1691BarPieAnc, P04R14_A9846BarPieAncc, P04R14_n9846BarPieAncc, P04R14_A9984BarPiePda, P04R14_n9984BarPiePda,
            P04R14_A8707BapieObs, P04R14_n8707BapieObs, P04R14_A8838CodBarPz, P04R14_n8838CodBarPz, P04R14_A200BarPieCod
            }
            , new Object[] {
            P04R15_A396EmprCod, P04R15_A200BarPieCod, P04R15_A130BarCodPar, P04R15_A132BarCodReo, P04R15_A129BarCod, P04R15_A201BarPieEst
            }
            , new Object[] {
            }
            , new Object[] {
            P04R17_A396EmprCod, P04R17_A129BarCod, P04R17_A132BarCodReo, P04R17_A130BarCodPar, P04R17_A200BarPieCod, P04R17_A3858BarTroCod
            }
            , new Object[] {
            }
         }
      );
      AV199Pgmname = "PRPI003" ;
      /* GeneXus formulas. */
      AV199Pgmname = "PRPI003" ;
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
   private byte A201BarPieEst ;
   private byte A9800BarNPes ;
   private byte AV52BarPieEst ;
   private byte AV179BarNpes ;
   private byte GXv_int1[] ;
   private byte GXv_int23[] ;
   private byte GXv_int12[] ;
   private short AV22TipDefCod ;
   private short AV23TipDefPor ;
   private short A189BarNumAny ;
   private short AV101BarNumAny ;
   private short A197BarPConTro ;
   private short A1691BarPieAnc ;
   private short A9846BarPieAncc ;
   private short AV55BarPConTro ;
   private short AV180BarPieanc ;
   private short AV181BarPieAncc ;
   private short GXv_int15[] ;
   private short GXv_int24[] ;
   private short GXv_int25[] ;
   private short A3858BarTroCod ;
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
   private int A44AlbRecCod ;
   private int A1271BarPieLzd ;
   private int A1501BarPiePie ;
   private int AV49AlbRecCod ;
   private int AV56BarPieLzd ;
   private int AV130BarPiePie ;
   private int GXv_int8[] ;
   private int GXv_int9[] ;
   private int GXv_int18[] ;
   private int GXv_int17[] ;
   private java.math.BigDecimal AV159Intexco ;
   private java.math.BigDecimal A141BarCosPro ;
   private java.math.BigDecimal A140BarCosAny ;
   private java.math.BigDecimal AV31CosPro ;
   private java.math.BigDecimal AV32CosAny ;
   private java.math.BigDecimal AV30KilReo ;
   private java.math.BigDecimal AV124MetReo ;
   private java.math.BigDecimal A203BarPieKil ;
   private java.math.BigDecimal A205BarPieMet ;
   private java.math.BigDecimal A170BarKilLan ;
   private java.math.BigDecimal A183BarMetLan ;
   private java.math.BigDecimal A9795BarPieK1 ;
   private java.math.BigDecimal A9796BarPieK2 ;
   private java.math.BigDecimal A9984BarPiePda ;
   private java.math.BigDecimal AV50BarPieKil ;
   private java.math.BigDecimal AV51BarPieMet ;
   private java.math.BigDecimal AV53BarKilLan ;
   private java.math.BigDecimal AV54BarMetLan ;
   private java.math.BigDecimal AV177BarPiek1 ;
   private java.math.BigDecimal AV178barPieK2 ;
   private java.math.BigDecimal AV182BarPiePda ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private java.math.BigDecimal GXv_decimal13[] ;
   private java.math.BigDecimal GXv_decimal14[] ;
   private java.math.BigDecimal GXv_decimal21[] ;
   private java.math.BigDecimal GXv_decimal22[] ;
   private java.math.BigDecimal GXv_decimal26[] ;
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
   private String scmdbuf ;
   private String A365DisDes ;
   private String A130BarCodPar ;
   private String A966PartCod ;
   private String A5253BarAcc ;
   private String A137BarConPar ;
   private String AV165BarHdro ;
   private String AV133PartCod ;
   private String AV35EmprCod ;
   private String AV147BarAcc ;
   private String AV58DisDes ;
   private String AV100BarConPar ;
   private String A908PieOriCod ;
   private String A2186BarPieLoc ;
   private String A8907PzaB80 ;
   private String A8707BapieObs ;
   private String A8838CodBarPz ;
   private String A200BarPieCod ;
   private String AV48BarPieCod ;
   private String AV57PieOriCod ;
   private String AV138BarPieLoc ;
   private String AV175pzab80 ;
   private String AV183BaPieobs ;
   private String AV184CodBarpz ;
   private String Gx_msg ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char16[] ;
   private String GXv_char28[] ;
   private String GXv_char27[] ;
   private String GXv_char20[] ;
   private String GXv_char19[] ;
   private String AV199Pgmname ;
   private boolean n966PartCod ;
   private boolean n252CliCod ;
   private boolean n898BarPieNDes ;
   private boolean n2186BarPieLoc ;
   private boolean n8907PzaB80 ;
   private boolean n9795BarPieK1 ;
   private boolean n9796BarPieK2 ;
   private boolean n9800BarNPes ;
   private boolean n1691BarPieAnc ;
   private boolean n9846BarPieAncc ;
   private boolean n9984BarPiePda ;
   private boolean n8707BapieObs ;
   private boolean n8838CodBarPz ;
   private boolean returnInSub ;
   private String AV193Json_inc_obs ;
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
   private String[] P04R13_A396EmprCod ;
   private String[] P04R13_A365DisDes ;
   private String[] P04R13_A130BarCodPar ;
   private byte[] P04R13_A132BarCodReo ;
   private int[] P04R13_A129BarCod ;
   private String[] P04R13_A966PartCod ;
   private boolean[] P04R13_n966PartCod ;
   private int[] P04R13_A252CliCod ;
   private boolean[] P04R13_n252CliCod ;
   private int[] P04R13_A361DisCod ;
   private String[] P04R13_A5253BarAcc ;
   private byte[] P04R13_A213BarSit ;
   private short[] P04R13_A189BarNumAny ;
   private String[] P04R13_A137BarConPar ;
   private java.math.BigDecimal[] P04R13_A141BarCosPro ;
   private java.math.BigDecimal[] P04R13_A140BarCosAny ;
   private int[] P04R13_A898BarPieNDes ;
   private boolean[] P04R13_n898BarPieNDes ;
   private String[] P04R14_A396EmprCod ;
   private int[] P04R14_A129BarCod ;
   private byte[] P04R14_A132BarCodReo ;
   private String[] P04R14_A130BarCodPar ;
   private byte[] P04R14_A201BarPieEst ;
   private int[] P04R14_A44AlbRecCod ;
   private java.math.BigDecimal[] P04R14_A203BarPieKil ;
   private java.math.BigDecimal[] P04R14_A205BarPieMet ;
   private java.math.BigDecimal[] P04R14_A170BarKilLan ;
   private java.math.BigDecimal[] P04R14_A183BarMetLan ;
   private short[] P04R14_A197BarPConTro ;
   private String[] P04R14_A908PieOriCod ;
   private int[] P04R14_A1271BarPieLzd ;
   private int[] P04R14_A1501BarPiePie ;
   private String[] P04R14_A2186BarPieLoc ;
   private boolean[] P04R14_n2186BarPieLoc ;
   private String[] P04R14_A8907PzaB80 ;
   private boolean[] P04R14_n8907PzaB80 ;
   private java.math.BigDecimal[] P04R14_A9795BarPieK1 ;
   private boolean[] P04R14_n9795BarPieK1 ;
   private java.math.BigDecimal[] P04R14_A9796BarPieK2 ;
   private boolean[] P04R14_n9796BarPieK2 ;
   private byte[] P04R14_A9800BarNPes ;
   private boolean[] P04R14_n9800BarNPes ;
   private short[] P04R14_A1691BarPieAnc ;
   private boolean[] P04R14_n1691BarPieAnc ;
   private short[] P04R14_A9846BarPieAncc ;
   private boolean[] P04R14_n9846BarPieAncc ;
   private java.math.BigDecimal[] P04R14_A9984BarPiePda ;
   private boolean[] P04R14_n9984BarPiePda ;
   private String[] P04R14_A8707BapieObs ;
   private boolean[] P04R14_n8707BapieObs ;
   private String[] P04R14_A8838CodBarPz ;
   private boolean[] P04R14_n8838CodBarPz ;
   private String[] P04R14_A200BarPieCod ;
   private String[] P04R15_A396EmprCod ;
   private String[] P04R15_A200BarPieCod ;
   private String[] P04R15_A130BarCodPar ;
   private byte[] P04R15_A132BarCodReo ;
   private int[] P04R15_A129BarCod ;
   private byte[] P04R15_A201BarPieEst ;
   private String[] P04R17_A396EmprCod ;
   private int[] P04R17_A129BarCod ;
   private byte[] P04R17_A132BarCodReo ;
   private String[] P04R17_A130BarCodPar ;
   private String[] P04R17_A200BarPieCod ;
   private short[] P04R17_A3858BarTroCod ;
   private GXBaseCollection<app.SdtIncidenciasObservaciones_SDT> AV191Col_Inc_obs ;
   private app.SdtIncidenciasObservaciones_SDT AV192Item_Col_Inc_obs ;
}

final  class prpi003__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04R13", "SELECT T1.EmprCod, T1.DisDes, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T2.PartCod, T1.CliCod, T1.DisCod, T1.BarAcc, T1.BarSit, T1.BarNumAny, T1.BarConPar, T1.BarCosPro, T1.BarCosAny, COALESCE( T3.BarPieNDes, 0) AS BarPieNDes FROM ((TXPBARCAD T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04R14", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieEst, AlbRecCod, BarPieKil, BarPieMet, BarKilLan, BarMetLan, BarPConTro, PieOriCod, BarPieLzd, BarPiePie, BarPieLoc, PzaB80, BarPieK1, BarPieK2, BarNPes, BarPieAnc, BarPieAncc, BarPiePda, BapieObs, CodBarPz, BarPieCod FROM TXPBARPIE WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (BarPieEst = 0 or ( ? = 1 and BarPieEst < 2)) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04R15", "SELECT EmprCod, BarPieCod, BarCodPar, BarCodReo, BarCod, BarPieEst FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P04R16", "DELETE FROM TXPBARPIE  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
         ,new ForEachCursor("P04R17", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarTroCod FROM TXPBARTRO WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04R18", "DELETE FROM TXPBARTRO  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? AND BarTroCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARTRO")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((String[]) buf[10])[0] = rslt.getString(9, 1);
               ((byte[]) buf[11])[0] = rslt.getByte(10);
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
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 9);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 10);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(16, 9);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(17,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((byte[]) buf[22])[0] = rslt.getByte(19);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((short[]) buf[24])[0] = rslt.getShort(20);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((short[]) buf[26])[0] = rslt.getShort(21);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(22,2);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(23, 40);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(24, 20);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(25, 9);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 9);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((short[]) buf[5])[0] = rslt.getShort(6);
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
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
      }
   }

}

