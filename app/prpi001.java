package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class prpi001 extends GXProcedure
{
   public prpi001( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( prpi001.class ), "" );
   }

   public prpi001( int remoteHandle ,
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
      prpi001.this.aP13 = new int[] {0};
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
      prpi001.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      prpi001.this.AV15BarCodOri = aP1[0];
      this.aP1 = aP1;
      prpi001.this.AV16BarReoOri = aP2[0];
      this.aP2 = aP2;
      prpi001.this.AV17BarParOri = aP3[0];
      this.aP3 = aP3;
      prpi001.this.AV18BarCod = aP4[0];
      this.aP4 = aP4;
      prpi001.this.AV19BarParPan = aP5[0];
      this.aP5 = aP5;
      prpi001.this.AV20BarSit = aP6[0];
      this.aP6 = aP6;
      prpi001.this.AV21Reo = aP7[0];
      this.aP7 = aP7;
      prpi001.this.AV22TipDefCod = aP8[0];
      this.aP8 = aP8;
      prpi001.this.AV23TipDefPor = aP9[0];
      this.aP9 = aP9;
      prpi001.this.AV24BarMaqCod = aP10[0];
      this.aP10 = aP10;
      prpi001.this.AV25BarConReo = aP11[0];
      this.aP11 = aP11;
      prpi001.this.AV26Codigo = aP12[0];
      this.aP12 = aP12;
      prpi001.this.AV27DisCod = aP13[0];
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
      prpi001.this.AV134FlagHil = GXv_int1[0] ;
      AV136FlagBros = (byte)(0) ;
      GXv_int1[0] = AV136FlagBros ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "BROS", ""), GXv_int1) ;
      prpi001.this.AV136FlagBros = GXv_int1[0] ;
      AV141Pervaf = (byte)(0) ;
      GXv_int1[0] = AV141Pervaf ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PERVAF", ""), GXv_int1) ;
      prpi001.this.AV141Pervaf = GXv_int1[0] ;
      GXt_char2 = AV150ContDsc ;
      GXv_char3[0] = A396EmprCod ;
      GXv_char4[0] = httpContext.getMessage( "CLISKP", "") ;
      GXv_char5[0] = GXt_char2 ;
      new app.pbusdsc(remoteHandle, context).execute( GXv_char3, GXv_char4, GXv_char5) ;
      prpi001.this.A396EmprCod = GXv_char3[0] ;
      prpi001.this.GXt_char2 = GXv_char5[0] ;
      AV150ContDsc = GXt_char2 ;
      AV148CliPropio = (int)(GXutil.lval( GXutil.trim( AV150ContDsc))) ;
      GXv_int1[0] = AV161Artextil ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ARTEXT", ""), GXv_int1) ;
      prpi001.this.AV161Artextil = GXv_int1[0] ;
      GXt_int6 = AV167Jpf ;
      GXv_int1[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "JPF", ""), GXv_int1) ;
      prpi001.this.GXt_int6 = GXv_int1[0] ;
      AV167Jpf = GXt_int6 ;
      AV140JBMartin = (byte)(0) ;
      GXv_int1[0] = AV140JBMartin ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "JBMAR", ""), GXv_int1) ;
      prpi001.this.AV140JBMartin = GXv_int1[0] ;
      AV162Lindalana = (byte)(0) ;
      GXv_int1[0] = AV162Lindalana ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "LINDAL", ""), GXv_int1) ;
      prpi001.this.AV162Lindalana = GXv_int1[0] ;
      AV140JBMartin = (byte)(0) ;
      GXv_int1[0] = (byte)(DecimalUtil.decToDouble(AV159Intexco)) ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "INTEXC", ""), GXv_int1) ;
      prpi001.this.AV159Intexco = DecimalUtil.doubleToDec(GXv_int1[0]) ;
      GXt_int6 = AV160Texfina ;
      GXv_int1[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TEXFNA", ""), GXv_int1) ;
      prpi001.this.GXt_int6 = GXv_int1[0] ;
      AV160Texfina = GXt_int6 ;
      GXt_int6 = AV166Vertex ;
      GXv_int1[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "VERTEX", ""), GXv_int1) ;
      prpi001.this.GXt_int6 = GXv_int1[0] ;
      AV166Vertex = GXt_int6 ;
      GXt_int6 = AV187Torient ;
      GXv_int1[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TORIEN", ""), GXv_int1) ;
      prpi001.this.GXt_int6 = GXv_int1[0] ;
      AV187Torient = GXt_int6 ;
      GXt_int6 = AV188PzasLector ;
      GXv_int1[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PZLCXX", ""), GXv_int1) ;
      prpi001.this.GXt_int6 = GXv_int1[0] ;
      AV188PzasLector = GXt_int6 ;
      GXt_int7 = AV189ConVal ;
      GXv_char5[0] = A396EmprCod ;
      GXv_char4[0] = httpContext.getMessage( "PZLCXX", "") ;
      GXv_int8[0] = GXt_int7 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char5, GXv_char4, GXv_int8) ;
      prpi001.this.A396EmprCod = GXv_char5[0] ;
      prpi001.this.GXt_int7 = GXv_int8[0] ;
      AV189ConVal = GXt_int7 ;
      GXt_int6 = AV191Etm ;
      GXv_int1[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ETM", ""), GXv_int1) ;
      prpi001.this.GXt_int6 = GXv_int1[0] ;
      AV191Etm = GXt_int6 ;
      GXt_int6 = AV192Filasur ;
      GXv_int1[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FILASU", ""), GXv_int1) ;
      prpi001.this.GXt_int6 = GXv_int1[0] ;
      AV192Filasur = GXt_int6 ;
      GXt_int6 = AV193Indutexma ;
      GXv_int1[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "INDUTE", ""), GXv_int1) ;
      prpi001.this.GXt_int6 = GXv_int1[0] ;
      AV193Indutexma = GXt_int6 ;
      GXt_int6 = AV194Martex ;
      GXv_int1[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MARTEX", ""), GXv_int1) ;
      prpi001.this.GXt_int6 = GXv_int1[0] ;
      AV194Martex = GXt_int6 ;
      GXt_int6 = AV196FlagoReopVERTEX ;
      GXv_int1[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "VXNREO", ""), GXv_int1) ;
      prpi001.this.GXt_int6 = GXv_int1[0] ;
      AV196FlagoReopVERTEX = GXt_int6 ;
      GXt_char2 = AV173Station ;
      GXv_char5[0] = GXt_char2 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char5) ;
      prpi001.this.GXt_char2 = GXv_char5[0] ;
      AV173Station = GXt_char2 ;
      GXv_char5[0] = A396EmprCod ;
      GXv_char4[0] = AV174EmprNom ;
      GXv_char3[0] = AV172Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV173Station, GXv_char5, GXv_char4, GXv_char3) ;
      prpi001.this.A396EmprCod = GXv_char5[0] ;
      prpi001.this.AV174EmprNom = GXv_char4[0] ;
      prpi001.this.AV172Usurcod = GXv_char3[0] ;
      AV35EmprCod = A396EmprCod ;
      AV171Barcad = (byte)(0) ;
      /* Using cursor P04QW2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV15BarCodOri), AV17BarParOri, Byte.valueOf(AV140JBMartin), AV159Intexco, Byte.valueOf(AV162Lindalana), Byte.valueOf(AV140JBMartin), AV159Intexco, Byte.valueOf(AV162Lindalana)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P04QW2_A130BarCodPar[0] ;
         A132BarCodReo = P04QW2_A132BarCodReo[0] ;
         A129BarCod = P04QW2_A129BarCod[0] ;
         A138BarConReo = P04QW2_A138BarConReo[0] ;
         AV25BarConReo = A138BarConReo ;
         AV25BarConReo = (byte)(AV25BarConReo+1) ;
         AV171Barcad = (byte)(1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV171Barcad == 0 )
      {
         /* Using cursor P04QW3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV15BarCodOri)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A130BarCodPar = P04QW3_A130BarCodPar[0] ;
            A132BarCodReo = P04QW3_A132BarCodReo[0] ;
            A129BarCod = P04QW3_A129BarCod[0] ;
            A138BarConReo = P04QW3_A138BarConReo[0] ;
            AV25BarConReo = A138BarConReo ;
            AV25BarConReo = (byte)(AV25BarConReo+1) ;
            AV171Barcad = (byte)(1) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
      AV169Hdr = GXutil.str( AV15BarCodOri, 8, 0) + GXutil.str( AV16BarReoOri, 1, 0) + AV17BarParOri ;
      AV170Hdrd = GXutil.str( AV18BarCod, 8, 0) + GXutil.str( AV25BarConReo, 1, 0) + AV19BarParPan ;
      if ( GXutil.strcmp(AV169Hdr, AV170Hdrd) == 0 )
      {
         AV198Item_Col_Inc_obs = (app.SdtIncidenciasObservaciones_SDT)new app.SdtIncidenciasObservaciones_SDT(remoteHandle, context);
         AV198Item_Col_Inc_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( httpContext.getMessage( "Hdr origen = ", "")+AV169Hdr+httpContext.getMessage( " Hdr Destino = ", "")+AV170Hdrd );
         AV198Item_Col_Inc_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV198Item_Col_Inc_obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "SON IGUALES ¡¡¡", "") );
         AV195ContadorReope = (byte)(AV25BarConReo+1) ;
         while ( AV195ContadorReope <= 9 )
         {
            AV170Hdrd = GXutil.str( AV18BarCod, 8, 0) + GXutil.str( AV195ContadorReope, 1, 0) + AV19BarParPan ;
            if ( GXutil.strcmp(AV169Hdr, AV170Hdrd) != 0 )
            {
               if (true) break;
            }
            AV195ContadorReope = (byte)(AV195ContadorReope+1) ;
         }
         AV198Item_Col_Inc_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV198Item_Col_Inc_obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "Campo &BarConReo ", "")+GXutil.str( AV25BarConReo, 1, 0)+httpContext.getMessage( " se modifica a ", "")+GXutil.str( AV195ContadorReope, 1, 0) );
         AV25BarConReo = AV195ContadorReope ;
         AV198Item_Col_Inc_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV198Item_Col_Inc_obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "Valor &Barcad = ", "")+GXutil.trim( GXutil.str( AV171Barcad, 1, 0))+httpContext.getMessage( " =1 -> OK entro en BARCAD, 0->NO entro en BARCAD", "") );
         AV197Col_Inc_obs.add(AV198Item_Col_Inc_obs, 0);
         if ( AV197Col_Inc_obs.size() > 0 )
         {
            AV199Json_inc_obs = AV197Col_Inc_obs.toJSonString(false) ;
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV204Pgmname, AV172Usurcod, AV173Station, AV199Json_inc_obs, AV15BarCodOri, AV16BarReoOri, AV17BarParOri) ;
         }
      }
      AV197Col_Inc_obs.clear();
      /* Using cursor P04QW5 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV15BarCodOri), Byte.valueOf(AV16BarReoOri), AV17BarParOri});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A130BarCodPar = P04QW5_A130BarCodPar[0] ;
         A132BarCodReo = P04QW5_A132BarCodReo[0] ;
         A129BarCod = P04QW5_A129BarCod[0] ;
         A966PartCod = P04QW5_A966PartCod[0] ;
         n966PartCod = P04QW5_n966PartCod[0] ;
         A252CliCod = P04QW5_A252CliCod[0] ;
         n252CliCod = P04QW5_n252CliCod[0] ;
         A361DisCod = P04QW5_A361DisCod[0] ;
         A5253BarAcc = P04QW5_A5253BarAcc[0] ;
         A2010BarTipDis = P04QW5_A2010BarTipDis[0] ;
         A213BarSit = P04QW5_A213BarSit[0] ;
         A365DisDes = P04QW5_A365DisDes[0] ;
         A189BarNumAny = P04QW5_A189BarNumAny[0] ;
         A137BarConPar = P04QW5_A137BarConPar[0] ;
         A141BarCosPro = P04QW5_A141BarCosPro[0] ;
         A140BarCosAny = P04QW5_A140BarCosAny[0] ;
         A898BarPieNDes = P04QW5_A898BarPieNDes[0] ;
         n898BarPieNDes = P04QW5_n898BarPieNDes[0] ;
         A966PartCod = P04QW5_A966PartCod[0] ;
         n966PartCod = P04QW5_n966PartCod[0] ;
         A898BarPieNDes = P04QW5_A898BarPieNDes[0] ;
         n898BarPieNDes = P04QW5_n898BarPieNDes[0] ;
         AV165BarHdro = GXutil.str( AV15BarCodOri, 8, 0) + "-" + GXutil.str( AV16BarReoOri, 1, 0) + AV17BarParOri ;
         AV133PartCod = A966PartCod ;
         AV59CliCod = A252CliCod ;
         AV35EmprCod = A396EmprCod ;
         AV129DisOriCod = A361DisCod ;
         AV147BarAcc = A5253BarAcc ;
         if ( AV166Vertex == 0 )
         {
            GXv_int8[0] = AV27DisCod ;
            new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, AV26Codigo, GXv_int8) ;
            prpi001.this.AV27DisCod = GXv_int8[0] ;
         }
         else
         {
            if ( ( AV192Filasur == 1 ) || ( AV193Indutexma == 1 ) || ( AV194Martex == 1 ) )
            {
               GXv_char5[0] = A396EmprCod ;
               GXv_char4[0] = A2010BarTipDis ;
               GXv_int8[0] = AV27DisCod ;
               GXv_char3[0] = Gx_msg ;
               new app.ptipdis(remoteHandle, context).execute( GXv_char5, GXv_char4, GXv_int8, GXv_char3) ;
               prpi001.this.A396EmprCod = GXv_char5[0] ;
               prpi001.this.A2010BarTipDis = GXv_char4[0] ;
               prpi001.this.AV27DisCod = GXv_int8[0] ;
               prpi001.this.Gx_msg = GXv_char3[0] ;
            }
            else
            {
               if ( AV196FlagoReopVERTEX == 1 )
               {
                  GXv_int8[0] = AV27DisCod ;
                  new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "VXNREO", ""), GXv_int8) ;
                  prpi001.this.AV27DisCod = GXv_int8[0] ;
               }
               else
               {
                  GXv_int8[0] = AV27DisCod ;
                  new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "AC    ", ""), GXv_int8) ;
                  prpi001.this.AV27DisCod = GXv_int8[0] ;
               }
            }
         }
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
         Gx_msg = httpContext.getMessage( "Prpi001.Creando nueva Hdr ", "") + GXutil.str( AV18BarCod, 8, 0) + "-" + GXutil.str( AV25BarConReo, 1, 0) + AV19BarParPan ;
         GXv_char5[0] = A396EmprCod ;
         GXv_int8[0] = AV18BarCod ;
         GXv_int1[0] = AV25BarConReo ;
         GXv_char4[0] = AV19BarParPan ;
         GXv_int9[0] = AV15BarCodOri ;
         GXv_int10[0] = AV16BarReoOri ;
         GXv_char3[0] = AV17BarParOri ;
         GXv_int11[0] = AV27DisCod ;
         GXv_int12[0] = AV123Sit2 ;
         GXv_int13[0] = AV108BarPieNDes ;
         GXv_decimal14[0] = AV31CosPro ;
         GXv_decimal15[0] = AV32CosAny ;
         GXv_char16[0] = AV24BarMaqCod ;
         GXv_int17[0] = AV101BarNumAny ;
         GXv_char18[0] = AV100BarConPar ;
         GXv_char19[0] = AV58DisDes ;
         GXv_int20[0] = AV22TipDefCod ;
         GXv_int21[0] = AV23TipDefPor ;
         GXv_int22[0] = (byte)(1) ;
         GXv_int23[0] = (byte)(1) ;
         GXv_int24[0] = (byte)(5) ;
         new app.preo001(remoteHandle, context).execute( GXv_char5, GXv_int8, GXv_int1, GXv_char4, GXv_int9, GXv_int10, GXv_char3, GXv_int11, GXv_int12, GXv_int13, GXv_decimal14, GXv_decimal15, GXv_char16, GXv_int17, GXv_char18, GXv_char19, GXv_int20, GXv_int21, GXv_int22, GXv_int23, GXv_int24) ;
         prpi001.this.A396EmprCod = GXv_char5[0] ;
         prpi001.this.AV18BarCod = GXv_int8[0] ;
         prpi001.this.AV25BarConReo = GXv_int1[0] ;
         prpi001.this.AV19BarParPan = GXv_char4[0] ;
         prpi001.this.AV15BarCodOri = GXv_int9[0] ;
         prpi001.this.AV16BarReoOri = GXv_int10[0] ;
         prpi001.this.AV17BarParOri = GXv_char3[0] ;
         prpi001.this.AV27DisCod = GXv_int11[0] ;
         prpi001.this.AV123Sit2 = GXv_int12[0] ;
         prpi001.this.AV108BarPieNDes = GXv_int13[0] ;
         prpi001.this.AV31CosPro = GXv_decimal14[0] ;
         prpi001.this.AV32CosAny = GXv_decimal15[0] ;
         prpi001.this.AV24BarMaqCod = GXv_char16[0] ;
         prpi001.this.AV101BarNumAny = GXv_int17[0] ;
         prpi001.this.AV100BarConPar = GXv_char18[0] ;
         prpi001.this.AV58DisDes = GXv_char19[0] ;
         prpi001.this.AV22TipDefCod = GXv_int20[0] ;
         prpi001.this.AV23TipDefPor = GXv_int21[0] ;
         if ( AV191Etm == 1 )
         {
            GXv_char19[0] = A396EmprCod ;
            GXv_int13[0] = AV15BarCodOri ;
            GXv_int24[0] = AV16BarReoOri ;
            GXv_char18[0] = AV17BarParOri ;
            GXv_int11[0] = AV18BarCod ;
            GXv_int23[0] = AV25BarConReo ;
            GXv_char16[0] = AV19BarParPan ;
            new app.prpi008(remoteHandle, context).execute( GXv_char19, GXv_int13, GXv_int24, GXv_char18, GXv_int11, GXv_int23, GXv_char16) ;
            prpi001.this.A396EmprCod = GXv_char19[0] ;
            prpi001.this.AV15BarCodOri = GXv_int13[0] ;
            prpi001.this.AV16BarReoOri = GXv_int24[0] ;
            prpi001.this.AV17BarParOri = GXv_char18[0] ;
            prpi001.this.AV18BarCod = GXv_int11[0] ;
            prpi001.this.AV25BarConReo = GXv_int23[0] ;
            prpi001.this.AV19BarParPan = GXv_char16[0] ;
         }
         AV198Item_Col_Inc_obs = (app.SdtIncidenciasObservaciones_SDT)new app.SdtIncidenciasObservaciones_SDT(remoteHandle, context);
         AV198Item_Col_Inc_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( httpContext.getMessage( "Creacion NEW HDR", "")+GXutil.newLine( ) );
         AV198Item_Col_Inc_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV198Item_Col_Inc_obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "Hd Origen      = ", "")+GXutil.str( AV18BarCod, 8, 0)+"-"+GXutil.str( AV16BarReoOri, 1, 0)+AV17BarParOri+GXutil.newLine( ) );
         AV198Item_Col_Inc_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV198Item_Col_Inc_obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "N Disp Int     = ", "")+GXutil.str( AV129DisOriCod, 8, 0)+GXutil.newLine( ) );
         AV198Item_Col_Inc_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV198Item_Col_Inc_obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "Hd New         = ", "")+GXutil.str( AV18BarCod, 8, 0)+"-"+GXutil.str( AV25BarConReo, 1, 0)+AV19BarParPan+GXutil.newLine( ) );
         AV198Item_Col_Inc_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV198Item_Col_Inc_obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "N Disp New     = ", "")+GXutil.str( AV27DisCod, 8, 0) );
         AV197Col_Inc_obs.add(AV198Item_Col_Inc_obs, 0);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      if ( AV197Col_Inc_obs.size() > 0 )
      {
         AV199Json_inc_obs = AV197Col_Inc_obs.toJSonString(false) ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV204Pgmname, AV172Usurcod, AV173Station, AV199Json_inc_obs, AV18BarCod, AV16BarReoOri, AV17BarParOri) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = prpi001.this.A396EmprCod;
      this.aP1[0] = prpi001.this.AV15BarCodOri;
      this.aP2[0] = prpi001.this.AV16BarReoOri;
      this.aP3[0] = prpi001.this.AV17BarParOri;
      this.aP4[0] = prpi001.this.AV18BarCod;
      this.aP5[0] = prpi001.this.AV19BarParPan;
      this.aP6[0] = prpi001.this.AV20BarSit;
      this.aP7[0] = prpi001.this.AV21Reo;
      this.aP8[0] = prpi001.this.AV22TipDefCod;
      this.aP9[0] = prpi001.this.AV23TipDefPor;
      this.aP10[0] = prpi001.this.AV24BarMaqCod;
      this.aP11[0] = prpi001.this.AV25BarConReo;
      this.aP12[0] = prpi001.this.AV26Codigo;
      this.aP13[0] = prpi001.this.AV27DisCod;
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
      P04QW2_A396EmprCod = new String[] {""} ;
      P04QW2_A130BarCodPar = new String[] {""} ;
      P04QW2_A132BarCodReo = new byte[1] ;
      P04QW2_A129BarCod = new int[1] ;
      P04QW2_A138BarConReo = new byte[1] ;
      A130BarCodPar = "" ;
      P04QW3_A396EmprCod = new String[] {""} ;
      P04QW3_A130BarCodPar = new String[] {""} ;
      P04QW3_A132BarCodReo = new byte[1] ;
      P04QW3_A129BarCod = new int[1] ;
      P04QW3_A138BarConReo = new byte[1] ;
      AV169Hdr = "" ;
      AV170Hdrd = "" ;
      AV198Item_Col_Inc_obs = new app.SdtIncidenciasObservaciones_SDT(remoteHandle, context);
      AV197Col_Inc_obs = new GXBaseCollection<app.SdtIncidenciasObservaciones_SDT>(app.SdtIncidenciasObservaciones_SDT.class, "IncidenciasObservaciones_SDT", "TexplusNET", remoteHandle);
      AV199Json_inc_obs = "" ;
      AV204Pgmname = "" ;
      P04QW5_A396EmprCod = new String[] {""} ;
      P04QW5_A130BarCodPar = new String[] {""} ;
      P04QW5_A132BarCodReo = new byte[1] ;
      P04QW5_A129BarCod = new int[1] ;
      P04QW5_A966PartCod = new String[] {""} ;
      P04QW5_n966PartCod = new boolean[] {false} ;
      P04QW5_A252CliCod = new int[1] ;
      P04QW5_n252CliCod = new boolean[] {false} ;
      P04QW5_A361DisCod = new int[1] ;
      P04QW5_A5253BarAcc = new String[] {""} ;
      P04QW5_A2010BarTipDis = new String[] {""} ;
      P04QW5_A213BarSit = new byte[1] ;
      P04QW5_A365DisDes = new String[] {""} ;
      P04QW5_A189BarNumAny = new short[1] ;
      P04QW5_A137BarConPar = new String[] {""} ;
      P04QW5_A141BarCosPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04QW5_A140BarCosAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04QW5_A898BarPieNDes = new int[1] ;
      P04QW5_n898BarPieNDes = new boolean[] {false} ;
      A966PartCod = "" ;
      A5253BarAcc = "" ;
      A2010BarTipDis = "" ;
      A365DisDes = "" ;
      A137BarConPar = "" ;
      A141BarCosPro = DecimalUtil.ZERO ;
      A140BarCosAny = DecimalUtil.ZERO ;
      AV165BarHdro = "" ;
      AV133PartCod = "" ;
      AV147BarAcc = "" ;
      Gx_msg = "" ;
      AV58DisDes = "" ;
      AV100BarConPar = "" ;
      AV31CosPro = DecimalUtil.ZERO ;
      AV32CosAny = DecimalUtil.ZERO ;
      GXv_char5 = new String[1] ;
      GXv_int8 = new int[1] ;
      GXv_int1 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_int9 = new int[1] ;
      GXv_int10 = new byte[1] ;
      GXv_char3 = new String[1] ;
      GXv_int12 = new byte[1] ;
      GXv_decimal14 = new java.math.BigDecimal[1] ;
      GXv_decimal15 = new java.math.BigDecimal[1] ;
      GXv_int17 = new short[1] ;
      GXv_int20 = new short[1] ;
      GXv_int21 = new short[1] ;
      GXv_int22 = new byte[1] ;
      GXv_char19 = new String[1] ;
      GXv_int13 = new int[1] ;
      GXv_int24 = new byte[1] ;
      GXv_char18 = new String[1] ;
      GXv_int11 = new int[1] ;
      GXv_int23 = new byte[1] ;
      GXv_char16 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.prpi001__default(),
         new Object[] {
             new Object[] {
            P04QW2_A396EmprCod, P04QW2_A130BarCodPar, P04QW2_A132BarCodReo, P04QW2_A129BarCod, P04QW2_A138BarConReo
            }
            , new Object[] {
            P04QW3_A396EmprCod, P04QW3_A130BarCodPar, P04QW3_A132BarCodReo, P04QW3_A129BarCod, P04QW3_A138BarConReo
            }
            , new Object[] {
            P04QW5_A396EmprCod, P04QW5_A130BarCodPar, P04QW5_A132BarCodReo, P04QW5_A129BarCod, P04QW5_A966PartCod, P04QW5_n966PartCod, P04QW5_A252CliCod, P04QW5_n252CliCod, P04QW5_A361DisCod, P04QW5_A5253BarAcc,
            P04QW5_A2010BarTipDis, P04QW5_A213BarSit, P04QW5_A365DisDes, P04QW5_A189BarNumAny, P04QW5_A137BarConPar, P04QW5_A141BarCosPro, P04QW5_A140BarCosAny, P04QW5_A898BarPieNDes, P04QW5_n898BarPieNDes
            }
         }
      );
      AV204Pgmname = "PRPI001" ;
      /* GeneXus formulas. */
      AV204Pgmname = "PRPI001" ;
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
   private byte AV191Etm ;
   private byte AV192Filasur ;
   private byte AV193Indutexma ;
   private byte AV194Martex ;
   private byte AV196FlagoReopVERTEX ;
   private byte GXt_int6 ;
   private byte AV171Barcad ;
   private byte A132BarCodReo ;
   private byte A138BarConReo ;
   private byte AV195ContadorReope ;
   private byte A213BarSit ;
   private byte AV97Situa ;
   private byte AV123Sit2 ;
   private byte GXv_int1[] ;
   private byte GXv_int10[] ;
   private byte GXv_int12[] ;
   private byte GXv_int22[] ;
   private byte GXv_int24[] ;
   private byte GXv_int23[] ;
   private short AV22TipDefCod ;
   private short AV23TipDefPor ;
   private short A189BarNumAny ;
   private short AV101BarNumAny ;
   private short GXv_int17[] ;
   private short GXv_int20[] ;
   private short GXv_int21[] ;
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
   private int GXv_int8[] ;
   private int GXv_int9[] ;
   private int GXv_int13[] ;
   private int GXv_int11[] ;
   private java.math.BigDecimal AV159Intexco ;
   private java.math.BigDecimal A141BarCosPro ;
   private java.math.BigDecimal A140BarCosAny ;
   private java.math.BigDecimal AV31CosPro ;
   private java.math.BigDecimal AV32CosAny ;
   private java.math.BigDecimal GXv_decimal14[] ;
   private java.math.BigDecimal GXv_decimal15[] ;
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
   private String AV169Hdr ;
   private String AV170Hdrd ;
   private String AV204Pgmname ;
   private String A966PartCod ;
   private String A5253BarAcc ;
   private String A2010BarTipDis ;
   private String A365DisDes ;
   private String A137BarConPar ;
   private String AV165BarHdro ;
   private String AV133PartCod ;
   private String AV147BarAcc ;
   private String Gx_msg ;
   private String AV58DisDes ;
   private String AV100BarConPar ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char19[] ;
   private String GXv_char18[] ;
   private String GXv_char16[] ;
   private boolean n966PartCod ;
   private boolean n252CliCod ;
   private boolean n898BarPieNDes ;
   private String AV199Json_inc_obs ;
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
   private String[] P04QW2_A396EmprCod ;
   private String[] P04QW2_A130BarCodPar ;
   private byte[] P04QW2_A132BarCodReo ;
   private int[] P04QW2_A129BarCod ;
   private byte[] P04QW2_A138BarConReo ;
   private String[] P04QW3_A396EmprCod ;
   private String[] P04QW3_A130BarCodPar ;
   private byte[] P04QW3_A132BarCodReo ;
   private int[] P04QW3_A129BarCod ;
   private byte[] P04QW3_A138BarConReo ;
   private String[] P04QW5_A396EmprCod ;
   private String[] P04QW5_A130BarCodPar ;
   private byte[] P04QW5_A132BarCodReo ;
   private int[] P04QW5_A129BarCod ;
   private String[] P04QW5_A966PartCod ;
   private boolean[] P04QW5_n966PartCod ;
   private int[] P04QW5_A252CliCod ;
   private boolean[] P04QW5_n252CliCod ;
   private int[] P04QW5_A361DisCod ;
   private String[] P04QW5_A5253BarAcc ;
   private String[] P04QW5_A2010BarTipDis ;
   private byte[] P04QW5_A213BarSit ;
   private String[] P04QW5_A365DisDes ;
   private short[] P04QW5_A189BarNumAny ;
   private String[] P04QW5_A137BarConPar ;
   private java.math.BigDecimal[] P04QW5_A141BarCosPro ;
   private java.math.BigDecimal[] P04QW5_A140BarCosAny ;
   private int[] P04QW5_A898BarPieNDes ;
   private boolean[] P04QW5_n898BarPieNDes ;
   private GXBaseCollection<app.SdtIncidenciasObservaciones_SDT> AV197Col_Inc_obs ;
   private app.SdtIncidenciasObservaciones_SDT AV198Item_Col_Inc_obs ;
}

final  class prpi001__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04QW2", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarConReo FROM TXPBARCAD WHERE (EmprCod = ? and BarCod = ? and BarCodReo = 0) AND (( BarCodPar = ? and ? = 0 and ? = 0 and ? = 0) or ( BarCodPar = ' ' and ( ? = 1 or ? = 1 or ? = 1))) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04QW3", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarConReo FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = 0 and BarCodPar = ' ' ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04QW5", "SELECT T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T2.PartCod, T1.CliCod, T1.DisCod, T1.BarAcc, T1.BarTipDis, T1.BarSit, T1.DisDes, T1.BarNumAny, T1.BarConPar, T1.BarCosPro, T1.BarCosAny, COALESCE( T3.BarPieNDes, 0) AS BarPieNDes FROM ((TXPBARCAD T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 2 :
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
               ((String[]) buf[10])[0] = rslt.getString(9, 1);
               ((byte[]) buf[11])[0] = rslt.getByte(10);
               ((String[]) buf[12])[0] = rslt.getString(11, 1);
               ((short[]) buf[13])[0] = rslt.getShort(12);
               ((String[]) buf[14])[0] = rslt.getString(13, 1);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(14,2);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(15,2);
               ((int[]) buf[17])[0] = rslt.getInt(16);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
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
               stmt.setString(3, (String)parms[2], 1);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 2);
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

