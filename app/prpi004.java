package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class prpi004 extends GXProcedure
{
   public prpi004( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( prpi004.class ), "" );
   }

   public prpi004( int remoteHandle ,
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
      prpi004.this.aP13 = new int[] {0};
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
      prpi004.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      prpi004.this.AV15BarCodOri = aP1[0];
      this.aP1 = aP1;
      prpi004.this.AV16BarReoOri = aP2[0];
      this.aP2 = aP2;
      prpi004.this.AV17BarParOri = aP3[0];
      this.aP3 = aP3;
      prpi004.this.AV18BarCod = aP4[0];
      this.aP4 = aP4;
      prpi004.this.AV19BarParPan = aP5[0];
      this.aP5 = aP5;
      prpi004.this.AV20BarSit = aP6[0];
      this.aP6 = aP6;
      prpi004.this.AV21Reo = aP7[0];
      this.aP7 = aP7;
      prpi004.this.AV22TipDefCod = aP8[0];
      this.aP8 = aP8;
      prpi004.this.AV23TipDefPor = aP9[0];
      this.aP9 = aP9;
      prpi004.this.AV24BarMaqCod = aP10[0];
      this.aP10 = aP10;
      prpi004.this.AV25BarConReo = aP11[0];
      this.aP11 = aP11;
      prpi004.this.AV26Codigo = aP12[0];
      this.aP12 = aP12;
      prpi004.this.AV27DisCod = aP13[0];
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
      prpi004.this.AV134FlagHil = GXv_int1[0] ;
      AV136FlagBros = (byte)(0) ;
      GXv_int1[0] = AV136FlagBros ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "BROS", ""), GXv_int1) ;
      prpi004.this.AV136FlagBros = GXv_int1[0] ;
      AV141Pervaf = (byte)(0) ;
      GXv_int1[0] = AV141Pervaf ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PERVAF", ""), GXv_int1) ;
      prpi004.this.AV141Pervaf = GXv_int1[0] ;
      GXt_char2 = AV150ContDsc ;
      GXv_char3[0] = A396EmprCod ;
      GXv_char4[0] = httpContext.getMessage( "CLISKP", "") ;
      GXv_char5[0] = GXt_char2 ;
      new app.pbusdsc(remoteHandle, context).execute( GXv_char3, GXv_char4, GXv_char5) ;
      prpi004.this.A396EmprCod = GXv_char3[0] ;
      prpi004.this.GXt_char2 = GXv_char5[0] ;
      AV150ContDsc = GXt_char2 ;
      AV148CliPropio = (int)(GXutil.lval( GXutil.trim( AV150ContDsc))) ;
      GXv_int1[0] = AV161Artextil ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ARTEXT", ""), GXv_int1) ;
      prpi004.this.AV161Artextil = GXv_int1[0] ;
      GXt_int6 = AV167Jpf ;
      GXv_int1[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "JPF", ""), GXv_int1) ;
      prpi004.this.GXt_int6 = GXv_int1[0] ;
      AV167Jpf = GXt_int6 ;
      AV140JBMartin = (byte)(0) ;
      GXv_int1[0] = AV140JBMartin ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "JBMAR", ""), GXv_int1) ;
      prpi004.this.AV140JBMartin = GXv_int1[0] ;
      AV162Lindalana = (byte)(0) ;
      GXv_int1[0] = AV162Lindalana ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "LINDAL", ""), GXv_int1) ;
      prpi004.this.AV162Lindalana = GXv_int1[0] ;
      AV140JBMartin = (byte)(0) ;
      GXv_int1[0] = (byte)(DecimalUtil.decToDouble(AV159Intexco)) ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "INTEXC", ""), GXv_int1) ;
      prpi004.this.AV159Intexco = DecimalUtil.doubleToDec(GXv_int1[0]) ;
      GXt_int6 = AV160Texfina ;
      GXv_int1[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TEXFNA", ""), GXv_int1) ;
      prpi004.this.GXt_int6 = GXv_int1[0] ;
      AV160Texfina = GXt_int6 ;
      GXt_int6 = AV166Vertex ;
      GXv_int1[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "VERTEX", ""), GXv_int1) ;
      prpi004.this.GXt_int6 = GXv_int1[0] ;
      AV166Vertex = GXt_int6 ;
      GXt_int6 = AV187Torient ;
      GXv_int1[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TORIEN", ""), GXv_int1) ;
      prpi004.this.GXt_int6 = GXv_int1[0] ;
      AV187Torient = GXt_int6 ;
      GXt_int6 = AV188PzasLector ;
      GXv_int1[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PZLCXX", ""), GXv_int1) ;
      prpi004.this.GXt_int6 = GXv_int1[0] ;
      AV188PzasLector = GXt_int6 ;
      GXt_int7 = AV189ConVal ;
      GXv_char5[0] = A396EmprCod ;
      GXv_char4[0] = httpContext.getMessage( "PZLCXX", "") ;
      GXv_int8[0] = GXt_int7 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char5, GXv_char4, GXv_int8) ;
      prpi004.this.A396EmprCod = GXv_char5[0] ;
      prpi004.this.GXt_int7 = GXv_int8[0] ;
      AV189ConVal = GXt_int7 ;
      GXt_char2 = AV173Station ;
      GXv_char5[0] = GXt_char2 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char5) ;
      prpi004.this.GXt_char2 = GXv_char5[0] ;
      AV173Station = GXt_char2 ;
      GXv_char5[0] = A396EmprCod ;
      GXv_char4[0] = AV174EmprNom ;
      GXv_char3[0] = AV172Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV173Station, GXv_char5, GXv_char4, GXv_char3) ;
      prpi004.this.A396EmprCod = GXv_char5[0] ;
      prpi004.this.AV174EmprNom = GXv_char4[0] ;
      prpi004.this.AV172Usurcod = GXv_char3[0] ;
      AV191Col_Inc_obs.clear();
      /* Using cursor P04R33 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV15BarCodOri), Byte.valueOf(AV16BarReoOri), AV17BarParOri});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P04R33_A130BarCodPar[0] ;
         A132BarCodReo = P04R33_A132BarCodReo[0] ;
         A129BarCod = P04R33_A129BarCod[0] ;
         A966PartCod = P04R33_A966PartCod[0] ;
         n966PartCod = P04R33_n966PartCod[0] ;
         A252CliCod = P04R33_A252CliCod[0] ;
         n252CliCod = P04R33_n252CliCod[0] ;
         A361DisCod = P04R33_A361DisCod[0] ;
         A5253BarAcc = P04R33_A5253BarAcc[0] ;
         A213BarSit = P04R33_A213BarSit[0] ;
         A365DisDes = P04R33_A365DisDes[0] ;
         A189BarNumAny = P04R33_A189BarNumAny[0] ;
         A137BarConPar = P04R33_A137BarConPar[0] ;
         A141BarCosPro = P04R33_A141BarCosPro[0] ;
         A140BarCosAny = P04R33_A140BarCosAny[0] ;
         A161BarFecSal = P04R33_A161BarFecSal[0] ;
         A5026BarTipEst = P04R33_A5026BarTipEst[0] ;
         A898BarPieNDes = P04R33_A898BarPieNDes[0] ;
         n898BarPieNDes = P04R33_n898BarPieNDes[0] ;
         A966PartCod = P04R33_A966PartCod[0] ;
         n966PartCod = P04R33_n966PartCod[0] ;
         A898BarPieNDes = P04R33_A898BarPieNDes[0] ;
         n898BarPieNDes = P04R33_n898BarPieNDes[0] ;
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
         /*
            INSERT RECORD ON TABLE TXPDISBAR

         */
         A1146DisDisCod = AV27DisCod ;
         A1139DisBarCod = AV18BarCod ;
         A1140DisBarReo = AV25BarConReo ;
         A1141DisBarPar = AV19BarParPan ;
         /* Using cursor P04R34 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A1146DisDisCod), Integer.valueOf(A1139DisBarCod), Byte.valueOf(A1140DisBarReo), A1141DisBarPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISBAR");
         if ( (pr_default.getStatus(1) == 1) )
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
         AV192Item_Col_Inc_obs = (app.SdtIncidenciasObservaciones_SDT)new app.SdtIncidenciasObservaciones_SDT(remoteHandle, context);
         AV192Item_Col_Inc_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( httpContext.getMessage( "Creacion NEW DISBAR", "")+GXutil.newLine( ) );
         AV192Item_Col_Inc_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV192Item_Col_Inc_obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "Hd Origen      = ", "")+GXutil.str( AV18BarCod, 8, 0)+"-"+GXutil.str( AV16BarReoOri, 1, 0)+AV17BarParOri+GXutil.newLine( ) );
         AV192Item_Col_Inc_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV192Item_Col_Inc_obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "Hd New         = ", "")+GXutil.str( AV18BarCod, 8, 0)+"-"+GXutil.str( AV25BarConReo, 1, 0)+AV19BarParPan+GXutil.newLine( ) );
         AV192Item_Col_Inc_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV192Item_Col_Inc_obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "N Disp New     = ", "")+GXutil.str( AV27DisCod, 8, 0) );
         AV191Col_Inc_obs.add(AV192Item_Col_Inc_obs, 0);
         if ( GXutil.strcmp(AV21Reo, httpContext.getMessage( "T", "")) == 0 )
         {
            AV192Item_Col_Inc_obs = (app.SdtIncidenciasObservaciones_SDT)new app.SdtIncidenciasObservaciones_SDT(remoteHandle, context);
            AV192Item_Col_Inc_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( httpContext.getMessage( "Modificacion BARCAD. TOTAL", "")+GXutil.newLine( ) );
            AV192Item_Col_Inc_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV192Item_Col_Inc_obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "Hd Origen       = ", "")+GXutil.str( AV18BarCod, 8, 0)+"-"+GXutil.str( AV16BarReoOri, 1, 0)+AV17BarParOri+GXutil.newLine( ) );
            AV192Item_Col_Inc_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV192Item_Col_Inc_obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "Costes Productos =", "")+GXutil.str( A141BarCosPro, 10, 2)+" <- "+"0"+GXutil.newLine( ) );
            AV192Item_Col_Inc_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV192Item_Col_Inc_obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "Costes Anadidas  =", "")+GXutil.str( A140BarCosAny, 10, 2)+" <- "+"0"+GXutil.newLine( ) );
            if ( AV161Artextil == 0 )
            {
               AV192Item_Col_Inc_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV192Item_Col_Inc_obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "Situacion        =", "")+GXutil.str( A213BarSit, 2, 0)+" <- "+"9"+GXutil.newLine( ) );
            }
            else
            {
               AV192Item_Col_Inc_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV192Item_Col_Inc_obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "Situacion        =", "")+GXutil.str( A213BarSit, 2, 0)+" <- "+"11"+GXutil.newLine( ) );
            }
            AV192Item_Col_Inc_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV192Item_Col_Inc_obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "Fecha Salida     =", "")+localUtil.dtoc( A161BarFecSal, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")+" <- "+" "+GXutil.newLine( ) );
            AV191Col_Inc_obs.add(AV192Item_Col_Inc_obs, 0);
            A141BarCosPro = DecimalUtil.ZERO ;
            A140BarCosAny = DecimalUtil.ZERO ;
            if ( AV161Artextil == 0 )
            {
               A213BarSit = (byte)(9) ;
            }
            else
            {
               A213BarSit = (byte)(11) ;
            }
            A161BarFecSal = GXutil.today( ) ;
            if ( AV167Jpf == 1 )
            {
               A5026BarTipEst = (byte)(1) ;
            }
         }
         /* Using cursor P04R35 */
         pr_default.execute(2, new Object[] {Byte.valueOf(A213BarSit), A141BarCosPro, A140BarCosAny, A161BarFecSal, Byte.valueOf(A5026BarTipEst), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV191Col_Inc_obs.size() > 0 )
      {
         AV193Json_inc_obs = AV191Col_Inc_obs.toJSonString(false) ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV197Pgmname, AV172Usurcod, AV173Station, AV193Json_inc_obs, AV18BarCod, AV16BarReoOri, AV17BarParOri) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = prpi004.this.A396EmprCod;
      this.aP1[0] = prpi004.this.AV15BarCodOri;
      this.aP2[0] = prpi004.this.AV16BarReoOri;
      this.aP3[0] = prpi004.this.AV17BarParOri;
      this.aP4[0] = prpi004.this.AV18BarCod;
      this.aP5[0] = prpi004.this.AV19BarParPan;
      this.aP6[0] = prpi004.this.AV20BarSit;
      this.aP7[0] = prpi004.this.AV21Reo;
      this.aP8[0] = prpi004.this.AV22TipDefCod;
      this.aP9[0] = prpi004.this.AV23TipDefPor;
      this.aP10[0] = prpi004.this.AV24BarMaqCod;
      this.aP11[0] = prpi004.this.AV25BarConReo;
      this.aP12[0] = prpi004.this.AV26Codigo;
      this.aP13[0] = prpi004.this.AV27DisCod;
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
      GXv_int1 = new byte[1] ;
      GXv_int8 = new int[1] ;
      AV173Station = "" ;
      GXt_char2 = "" ;
      GXv_char5 = new String[1] ;
      AV174EmprNom = "" ;
      GXv_char4 = new String[1] ;
      AV172Usurcod = "" ;
      GXv_char3 = new String[1] ;
      AV191Col_Inc_obs = new GXBaseCollection<app.SdtIncidenciasObservaciones_SDT>(app.SdtIncidenciasObservaciones_SDT.class, "IncidenciasObservaciones_SDT", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      P04R33_A396EmprCod = new String[] {""} ;
      P04R33_A130BarCodPar = new String[] {""} ;
      P04R33_A132BarCodReo = new byte[1] ;
      P04R33_A129BarCod = new int[1] ;
      P04R33_A966PartCod = new String[] {""} ;
      P04R33_n966PartCod = new boolean[] {false} ;
      P04R33_A252CliCod = new int[1] ;
      P04R33_n252CliCod = new boolean[] {false} ;
      P04R33_A361DisCod = new int[1] ;
      P04R33_A5253BarAcc = new String[] {""} ;
      P04R33_A213BarSit = new byte[1] ;
      P04R33_A365DisDes = new String[] {""} ;
      P04R33_A189BarNumAny = new short[1] ;
      P04R33_A137BarConPar = new String[] {""} ;
      P04R33_A141BarCosPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04R33_A140BarCosAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04R33_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P04R33_A5026BarTipEst = new byte[1] ;
      P04R33_A898BarPieNDes = new int[1] ;
      P04R33_n898BarPieNDes = new boolean[] {false} ;
      A130BarCodPar = "" ;
      A966PartCod = "" ;
      A5253BarAcc = "" ;
      A365DisDes = "" ;
      A137BarConPar = "" ;
      A141BarCosPro = DecimalUtil.ZERO ;
      A140BarCosAny = DecimalUtil.ZERO ;
      A161BarFecSal = GXutil.nullDate() ;
      AV165BarHdro = "" ;
      AV133PartCod = "" ;
      AV35EmprCod = "" ;
      AV147BarAcc = "" ;
      AV58DisDes = "" ;
      AV100BarConPar = "" ;
      AV31CosPro = DecimalUtil.ZERO ;
      AV32CosAny = DecimalUtil.ZERO ;
      A1141DisBarPar = "" ;
      Gx_emsg = "" ;
      AV192Item_Col_Inc_obs = new app.SdtIncidenciasObservaciones_SDT(remoteHandle, context);
      AV193Json_inc_obs = "" ;
      AV197Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.prpi004__default(),
         new Object[] {
             new Object[] {
            P04R33_A396EmprCod, P04R33_A130BarCodPar, P04R33_A132BarCodReo, P04R33_A129BarCod, P04R33_A966PartCod, P04R33_n966PartCod, P04R33_A252CliCod, P04R33_n252CliCod, P04R33_A361DisCod, P04R33_A5253BarAcc,
            P04R33_A213BarSit, P04R33_A365DisDes, P04R33_A189BarNumAny, P04R33_A137BarConPar, P04R33_A141BarCosPro, P04R33_A140BarCosAny, P04R33_A161BarFecSal, P04R33_A5026BarTipEst, P04R33_A898BarPieNDes, P04R33_n898BarPieNDes
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      AV197Pgmname = "PRPI004" ;
      /* GeneXus formulas. */
      AV197Pgmname = "PRPI004" ;
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
   private byte GXv_int1[] ;
   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private byte A5026BarTipEst ;
   private byte AV97Situa ;
   private byte AV123Sit2 ;
   private byte A1140DisBarReo ;
   private short AV22TipDefCod ;
   private short AV23TipDefPor ;
   private short A189BarNumAny ;
   private short AV101BarNumAny ;
   private short Gx_err ;
   private int AV15BarCodOri ;
   private int AV18BarCod ;
   private int AV27DisCod ;
   private int AV148CliPropio ;
   private int AV189ConVal ;
   private int GXt_int7 ;
   private int GXv_int8[] ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A361DisCod ;
   private int A898BarPieNDes ;
   private int AV59CliCod ;
   private int AV129DisOriCod ;
   private int AV29ContPie ;
   private int AV108BarPieNDes ;
   private int AV122PNoDes ;
   private int GX_INS153 ;
   private int A1146DisDisCod ;
   private int A1139DisBarCod ;
   private java.math.BigDecimal AV159Intexco ;
   private java.math.BigDecimal A141BarCosPro ;
   private java.math.BigDecimal A140BarCosAny ;
   private java.math.BigDecimal AV31CosPro ;
   private java.math.BigDecimal AV32CosAny ;
   private String A396EmprCod ;
   private String AV17BarParOri ;
   private String AV19BarParPan ;
   private String AV21Reo ;
   private String AV24BarMaqCod ;
   private String AV26Codigo ;
   private String AV150ContDsc ;
   private String AV173Station ;
   private String GXt_char2 ;
   private String GXv_char5[] ;
   private String AV174EmprNom ;
   private String GXv_char4[] ;
   private String AV172Usurcod ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A966PartCod ;
   private String A5253BarAcc ;
   private String A365DisDes ;
   private String A137BarConPar ;
   private String AV165BarHdro ;
   private String AV133PartCod ;
   private String AV35EmprCod ;
   private String AV147BarAcc ;
   private String AV58DisDes ;
   private String AV100BarConPar ;
   private String A1141DisBarPar ;
   private String Gx_emsg ;
   private String AV197Pgmname ;
   private java.util.Date A161BarFecSal ;
   private boolean n966PartCod ;
   private boolean n252CliCod ;
   private boolean n898BarPieNDes ;
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
   private String[] P04R33_A396EmprCod ;
   private String[] P04R33_A130BarCodPar ;
   private byte[] P04R33_A132BarCodReo ;
   private int[] P04R33_A129BarCod ;
   private String[] P04R33_A966PartCod ;
   private boolean[] P04R33_n966PartCod ;
   private int[] P04R33_A252CliCod ;
   private boolean[] P04R33_n252CliCod ;
   private int[] P04R33_A361DisCod ;
   private String[] P04R33_A5253BarAcc ;
   private byte[] P04R33_A213BarSit ;
   private String[] P04R33_A365DisDes ;
   private short[] P04R33_A189BarNumAny ;
   private String[] P04R33_A137BarConPar ;
   private java.math.BigDecimal[] P04R33_A141BarCosPro ;
   private java.math.BigDecimal[] P04R33_A140BarCosAny ;
   private java.util.Date[] P04R33_A161BarFecSal ;
   private byte[] P04R33_A5026BarTipEst ;
   private int[] P04R33_A898BarPieNDes ;
   private boolean[] P04R33_n898BarPieNDes ;
   private GXBaseCollection<app.SdtIncidenciasObservaciones_SDT> AV191Col_Inc_obs ;
   private app.SdtIncidenciasObservaciones_SDT AV192Item_Col_Inc_obs ;
}

final  class prpi004__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04R33", "SELECT T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T2.PartCod, T1.CliCod, T1.DisCod, T1.BarAcc, T1.BarSit, T1.DisDes, T1.BarNumAny, T1.BarConPar, T1.BarCosPro, T1.BarCosAny, T1.BarFecSal, T1.BarTipEst, COALESCE( T3.BarPieNDes, 0) AS BarPieNDes FROM ((TXPBARCAD T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P04R34", "INSERT INTO TXPDISBAR(EmprCod, DisDisCod, DisBarCod, DisBarReo, DisBarPar, DisNumPda) VALUES(?, ?, ?, ?, ?, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISBAR")
         ,new UpdateCursor("P04R35", "UPDATE TXPBARCAD SET BarSit=?, BarCosPro=?, BarCosAny=?, BarFecSal=?, BarTipEst=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
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
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(15);
               ((byte[]) buf[17])[0] = rslt.getByte(16);
               ((int[]) buf[18])[0] = rslt.getInt(17);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
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
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 2 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 3);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setString(9, (String)parms[8], 1);
               return;
      }
   }

}

