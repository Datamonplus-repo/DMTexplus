package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbarreo extends GXProcedure
{
   public pbarreo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbarreo.class ), "" );
   }

   public pbarreo( int remoteHandle ,
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
      pbarreo.this.aP13 = new int[] {0};
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
      pbarreo.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbarreo.this.AV27BarCodOri = aP1[0];
      this.aP1 = aP1;
      pbarreo.this.AV112BarReoOri = aP2[0];
      this.aP2 = aP2;
      pbarreo.this.AV88BarParOri = aP3[0];
      this.aP3 = aP3;
      pbarreo.this.AV26BarCod = aP4[0];
      this.aP4 = aP4;
      pbarreo.this.AV89BarParPan = aP5[0];
      this.aP5 = aP5;
      pbarreo.this.AV116BarSit = aP6[0];
      this.aP6 = aP6;
      pbarreo.this.AV182Reo = aP7[0];
      this.aP7 = aP7;
      pbarreo.this.AV188TipDefCod = aP8[0];
      this.aP8 = aP8;
      pbarreo.this.AV189TipDefPor = aP9[0];
      this.aP9 = aP9;
      pbarreo.this.AV72BarMaqCod = aP10[0];
      this.aP10 = aP10;
      pbarreo.this.AV32BarConReo = aP11[0];
      this.aP11 = aP11;
      pbarreo.this.AV142Codigo = aP12[0];
      this.aP12 = aP12;
      pbarreo.this.AV149DisCod = aP13[0];
      this.aP13 = aP13;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV185Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      pbarreo.this.GXt_char1 = GXv_char2[0] ;
      AV185Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV153EmprNom ;
      GXv_char4[0] = AV192Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV185Station, GXv_char2, GXv_char3, GXv_char4) ;
      pbarreo.this.A396EmprCod = GXv_char2[0] ;
      pbarreo.this.AV153EmprNom = GXv_char3[0] ;
      pbarreo.this.AV192Usurcod = GXv_char4[0] ;
      AV157FlagHil = (byte)(0) ;
      GXv_int5[0] = AV157FlagHil ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "HILO", ""), GXv_int5) ;
      pbarreo.this.AV157FlagHil = GXv_int5[0] ;
      AV156FlagBros = (byte)(0) ;
      GXv_int5[0] = AV156FlagBros ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "BROS", ""), GXv_int5) ;
      pbarreo.this.AV156FlagBros = GXv_int5[0] ;
      AV175Pervaf = (byte)(0) ;
      GXv_int5[0] = AV175Pervaf ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PERVAF", ""), GXv_int5) ;
      pbarreo.this.AV175Pervaf = GXv_int5[0] ;
      GXt_char1 = AV144ContDsc ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "CLISKP", "") ;
      GXv_char2[0] = GXt_char1 ;
      new app.pbusdsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      pbarreo.this.A396EmprCod = GXv_char4[0] ;
      pbarreo.this.GXt_char1 = GXv_char2[0] ;
      AV144ContDsc = GXt_char1 ;
      AV140CliPropio = (int)(GXutil.lval( GXutil.trim( AV144ContDsc))) ;
      GXv_int5[0] = AV16Artextil ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ARTEXT", ""), GXv_int5) ;
      pbarreo.this.AV16Artextil = GXv_int5[0] ;
      GXt_int6 = AV163Jpf ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "JPF", ""), GXv_int5) ;
      pbarreo.this.GXt_int6 = GXv_int5[0] ;
      AV163Jpf = GXt_int6 ;
      AV162JBMartin = (byte)(0) ;
      GXv_int5[0] = AV162JBMartin ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "JBMAR", ""), GXv_int5) ;
      pbarreo.this.AV162JBMartin = GXv_int5[0] ;
      AV165Lindalana = (byte)(0) ;
      GXv_int5[0] = AV165Lindalana ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "LINDAL", ""), GXv_int5) ;
      pbarreo.this.AV165Lindalana = GXv_int5[0] ;
      AV162JBMartin = (byte)(0) ;
      GXv_int5[0] = (byte)(DecimalUtil.decToDouble(AV161Intexco)) ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "INTEXC", ""), GXv_int5) ;
      pbarreo.this.AV161Intexco = DecimalUtil.doubleToDec(GXv_int5[0]) ;
      GXt_int6 = AV186Texfina ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TEXFNA", ""), GXv_int5) ;
      pbarreo.this.GXt_int6 = GXv_int5[0] ;
      AV186Texfina = GXt_int6 ;
      GXt_int6 = AV193Vertex ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "VERTEX", ""), GXv_int5) ;
      pbarreo.this.GXt_int6 = GXv_int5[0] ;
      AV193Vertex = GXt_int6 ;
      GXt_int6 = AV190Torient ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TORIEN", ""), GXv_int5) ;
      pbarreo.this.GXt_int6 = GXv_int5[0] ;
      AV190Torient = GXt_int6 ;
      GXt_int6 = AV181PzasLector ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PZLCXX", ""), GXv_int5) ;
      pbarreo.this.GXt_int6 = GXv_int5[0] ;
      AV181PzasLector = GXt_int6 ;
      GXt_int7 = AV146ConVal ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "PZLCXX", "") ;
      GXv_int8[0] = GXt_int7 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int8) ;
      pbarreo.this.A396EmprCod = GXv_char4[0] ;
      pbarreo.this.GXt_int7 = GXv_int8[0] ;
      AV146ConVal = GXt_int7 ;
      GXt_int6 = AV160Indutexma ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "INDUTE", ""), GXv_int5) ;
      pbarreo.this.GXt_int6 = GXv_int5[0] ;
      AV160Indutexma = GXt_int6 ;
      GXt_int6 = AV168Martex ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MARTEX", ""), GXv_int5) ;
      pbarreo.this.GXt_int6 = GXv_int5[0] ;
      AV168Martex = GXt_int6 ;
      AV25Barcad = (byte)(0) ;
      /* Using cursor P00542 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV27BarCodOri), AV88BarParOri, Byte.valueOf(AV162JBMartin), AV161Intexco, Byte.valueOf(AV165Lindalana), Byte.valueOf(AV162JBMartin), AV161Intexco, Byte.valueOf(AV165Lindalana)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P00542_A130BarCodPar[0] ;
         A132BarCodReo = P00542_A132BarCodReo[0] ;
         A129BarCod = P00542_A129BarCod[0] ;
         A138BarConReo = P00542_A138BarConReo[0] ;
         AV32BarConReo = A138BarConReo ;
         AV32BarConReo = (byte)(AV32BarConReo+1) ;
         AV25Barcad = (byte)(1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV158Hdr = GXutil.str( AV27BarCodOri, 8, 0) + GXutil.str( AV112BarReoOri, 1, 0) + AV88BarParOri ;
      AV159Hdrd = GXutil.str( AV26BarCod, 8, 0) + GXutil.str( AV32BarConReo, 1, 0) + AV89BarParPan ;
      if ( GXutil.strcmp(AV158Hdr, AV159Hdrd) == 0 )
      {
         AV187Texto_i = httpContext.getMessage( "Hdr origen = ", "") + AV158Hdr + httpContext.getMessage( " Hdr Destino = ", "") + AV159Hdrd + GXutil.newLine( ) ;
         AV187Texto_i += httpContext.getMessage( "SON IGUALES ¡¡¡", "") + GXutil.newLine( ) ;
         AV143ContadorReope = (byte)(AV32BarConReo+1) ;
         while ( AV143ContadorReope <= 9 )
         {
            AV159Hdrd = GXutil.str( AV26BarCod, 8, 0) + GXutil.str( AV143ContadorReope, 1, 0) + AV89BarParPan ;
            if ( GXutil.strcmp(AV158Hdr, AV159Hdrd) != 0 )
            {
               if (true) break;
            }
            AV143ContadorReope = (byte)(AV143ContadorReope+1) ;
         }
         AV187Texto_i += httpContext.getMessage( "Campo &BarConReo ", "") + GXutil.str( AV32BarConReo, 1, 0) + httpContext.getMessage( " se modifica a ", "") + GXutil.str( AV143ContadorReope, 1, 0) + GXutil.newLine( ) ;
         AV32BarConReo = AV143ContadorReope ;
         AV187Texto_i += httpContext.getMessage( "Valor &Barcad = ", "") + GXutil.str( AV25Barcad, 1, 0) + GXutil.chr( (short)(13)) + httpContext.getMessage( " =1 -> OK entro en BARCAD, 0->NO entro en BARCAD", "") + GXutil.chr( (short)(13)) ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV197Pgmname, AV192Usurcod, AV185Station, AV187Texto_i, AV27BarCodOri, AV112BarReoOri, AV88BarParOri) ;
      }
      /* Using cursor P00544 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV27BarCodOri), Byte.valueOf(AV112BarReoOri), AV88BarParOri});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A365DisDes = P00544_A365DisDes[0] ;
         A130BarCodPar = P00544_A130BarCodPar[0] ;
         A132BarCodReo = P00544_A132BarCodReo[0] ;
         A129BarCod = P00544_A129BarCod[0] ;
         A966PartCod = P00544_A966PartCod[0] ;
         n966PartCod = P00544_n966PartCod[0] ;
         A252CliCod = P00544_A252CliCod[0] ;
         n252CliCod = P00544_n252CliCod[0] ;
         A361DisCod = P00544_A361DisCod[0] ;
         A5253BarAcc = P00544_A5253BarAcc[0] ;
         A2010BarTipDis = P00544_A2010BarTipDis[0] ;
         A213BarSit = P00544_A213BarSit[0] ;
         A189BarNumAny = P00544_A189BarNumAny[0] ;
         A137BarConPar = P00544_A137BarConPar[0] ;
         A141BarCosPro = P00544_A141BarCosPro[0] ;
         A140BarCosAny = P00544_A140BarCosAny[0] ;
         A161BarFecSal = P00544_A161BarFecSal[0] ;
         A5026BarTipEst = P00544_A5026BarTipEst[0] ;
         A898BarPieNDes = P00544_A898BarPieNDes[0] ;
         n898BarPieNDes = P00544_n898BarPieNDes[0] ;
         A966PartCod = P00544_A966PartCod[0] ;
         n966PartCod = P00544_n966PartCod[0] ;
         A898BarPieNDes = P00544_A898BarPieNDes[0] ;
         n898BarPieNDes = P00544_n898BarPieNDes[0] ;
         AV64BarHdro = GXutil.str( AV27BarCodOri, 8, 0) + "-" + GXutil.str( AV112BarReoOri, 1, 0) + AV88BarParOri ;
         AV173PartCod = A966PartCod ;
         AV138CliCod = A252CliCod ;
         AV152EmprCod = A396EmprCod ;
         AV151DisOriCod = A361DisCod ;
         AV19BarAcc = A5253BarAcc ;
         if ( AV193Vertex == 0 )
         {
            GXv_int8[0] = AV149DisCod ;
            new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, AV142Codigo, GXv_int8) ;
            pbarreo.this.AV149DisCod = GXv_int8[0] ;
         }
         else
         {
            if ( ( AV155filasur == 1 ) || ( AV160Indutexma == 1 ) || ( AV168Martex == 1 ) )
            {
               GXv_char4[0] = A396EmprCod ;
               GXv_char3[0] = A2010BarTipDis ;
               GXv_int8[0] = AV149DisCod ;
               GXv_char2[0] = Gx_msg ;
               new app.ptipdis(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int8, GXv_char2) ;
               pbarreo.this.A396EmprCod = GXv_char4[0] ;
               pbarreo.this.A2010BarTipDis = GXv_char3[0] ;
               pbarreo.this.AV149DisCod = GXv_int8[0] ;
               pbarreo.this.Gx_msg = GXv_char2[0] ;
            }
            else
            {
               GXv_int8[0] = AV149DisCod ;
               new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "AC    ", ""), GXv_int8) ;
               pbarreo.this.AV149DisCod = GXv_int8[0] ;
            }
         }
         AV145ContPie = 0 ;
         AV152EmprCod = A396EmprCod ;
         AV184Situa = A213BarSit ;
         AV150DisDes = A365DisDes ;
         if ( GXutil.strcmp(AV182Reo, httpContext.getMessage( "T", "")) == 0 )
         {
            AV79BarNumAny = A189BarNumAny ;
            AV31BarConPar = A137BarConPar ;
            AV104BarPieNDes = A898BarPieNDes ;
            AV148CosPro = A141BarCosPro ;
            AV147CosAny = A140BarCosAny ;
            AV177PNoDes = AV104BarPieNDes ;
            AV183Sit2 = (byte)(1) ;
            if ( A213BarSit < 4 )
            {
               AV183Sit2 = A213BarSit ;
            }
         }
         else
         {
            AV79BarNumAny = (short)(0) ;
            AV31BarConPar = "" ;
            AV177PNoDes = 0 ;
            AV183Sit2 = (byte)(1) ;
            if ( A213BarSit < 4 )
            {
               AV183Sit2 = A213BarSit ;
            }
         }
         AV187Texto_i = httpContext.getMessage( "Ini BARCAD ", "") + GXutil.str( AV26BarCod, 8, 0) + "-" + GXutil.str( AV32BarConReo, 1, 0) + AV89BarParPan + GXutil.newLine( ) ;
         AV187Texto_i += httpContext.getMessage( "Tipo ", "") + AV182Reo + GXutil.newLine( ) ;
         GXv_char4[0] = AV152EmprCod ;
         GXv_int8[0] = AV26BarCod ;
         GXv_int5[0] = AV32BarConReo ;
         GXv_char3[0] = AV89BarParPan ;
         GXv_int9[0] = AV27BarCodOri ;
         GXv_int10[0] = AV112BarReoOri ;
         GXv_char2[0] = AV88BarParOri ;
         GXv_int11[0] = AV149DisCod ;
         GXv_int12[0] = AV183Sit2 ;
         GXv_int13[0] = AV104BarPieNDes ;
         GXv_decimal14[0] = AV148CosPro ;
         GXv_decimal15[0] = AV147CosAny ;
         GXv_char16[0] = AV72BarMaqCod ;
         GXv_int17[0] = AV79BarNumAny ;
         GXv_char18[0] = AV31BarConPar ;
         GXv_char19[0] = AV150DisDes ;
         GXv_int20[0] = AV188TipDefCod ;
         GXv_int21[0] = AV189TipDefPor ;
         GXv_int22[0] = (byte)(1) ;
         GXv_int23[0] = (byte)(1) ;
         GXv_int24[0] = (byte)(5) ;
         new app.pnuebar(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_int5, GXv_char3, GXv_int9, GXv_int10, GXv_char2, GXv_int11, GXv_int12, GXv_int13, GXv_decimal14, GXv_decimal15, GXv_char16, GXv_int17, GXv_char18, GXv_char19, GXv_int20, GXv_int21, GXv_int22, GXv_int23, GXv_int24) ;
         pbarreo.this.AV152EmprCod = GXv_char4[0] ;
         pbarreo.this.AV26BarCod = GXv_int8[0] ;
         pbarreo.this.AV32BarConReo = GXv_int5[0] ;
         pbarreo.this.AV89BarParPan = GXv_char3[0] ;
         pbarreo.this.AV27BarCodOri = GXv_int9[0] ;
         pbarreo.this.AV112BarReoOri = GXv_int10[0] ;
         pbarreo.this.AV88BarParOri = GXv_char2[0] ;
         pbarreo.this.AV149DisCod = GXv_int11[0] ;
         pbarreo.this.AV183Sit2 = GXv_int12[0] ;
         pbarreo.this.AV104BarPieNDes = GXv_int13[0] ;
         pbarreo.this.AV148CosPro = GXv_decimal14[0] ;
         pbarreo.this.AV147CosAny = GXv_decimal15[0] ;
         pbarreo.this.AV72BarMaqCod = GXv_char16[0] ;
         pbarreo.this.AV79BarNumAny = GXv_int17[0] ;
         pbarreo.this.AV31BarConPar = GXv_char18[0] ;
         pbarreo.this.AV150DisDes = GXv_char19[0] ;
         pbarreo.this.AV188TipDefCod = GXv_int20[0] ;
         pbarreo.this.AV189TipDefPor = GXv_int21[0] ;
         AV187Texto_i += httpContext.getMessage( "Fin BARCAD ", "") + GXutil.newLine( ) ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV197Pgmname, AV192Usurcod, AV185Station, AV187Texto_i, AV27BarCodOri, AV112BarReoOri, AV88BarParOri) ;
         /* Using cursor P00545 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A758ProCod = P00545_A758ProCod[0] ;
            A761ProFasLin = P00545_A761ProFasLin[0] ;
            n761ProFasLin = P00545_n761ProFasLin[0] ;
            AV178ProCod = A758ProCod ;
            AV179ProFasLin = A761ProFasLin ;
            AV187Texto_i = httpContext.getMessage( "Ini BARPRO ", "") + GXutil.str( AV26BarCod, 8, 0) + "-" + GXutil.str( AV32BarConReo, 1, 0) + AV89BarParPan + GXutil.newLine( ) ;
            GXv_char19[0] = AV152EmprCod ;
            GXv_int13[0] = AV26BarCod ;
            GXv_int24[0] = AV32BarConReo ;
            GXv_char18[0] = AV89BarParPan ;
            GXv_char16[0] = AV178ProCod ;
            GXv_int21[0] = AV179ProFasLin ;
            new app.pnuepro(remoteHandle, context).execute( GXv_char19, GXv_int13, GXv_int24, GXv_char18, GXv_char16, GXv_int21) ;
            pbarreo.this.AV152EmprCod = GXv_char19[0] ;
            pbarreo.this.AV26BarCod = GXv_int13[0] ;
            pbarreo.this.AV32BarConReo = GXv_int24[0] ;
            pbarreo.this.AV89BarParPan = GXv_char18[0] ;
            pbarreo.this.AV178ProCod = GXv_char16[0] ;
            pbarreo.this.AV179ProFasLin = GXv_int21[0] ;
            AV187Texto_i += httpContext.getMessage( "Fin BARPRO ", "") + GXutil.newLine( ) ;
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV197Pgmname, AV192Usurcod, AV185Station, AV187Texto_i, AV27BarCodOri, AV112BarReoOri, AV88BarParOri) ;
            AV187Texto_i = httpContext.getMessage( "Ini BARFAS ", "") + GXutil.str( AV26BarCod, 8, 0) + "-" + GXutil.str( AV32BarConReo, 1, 0) + AV89BarParPan + GXutil.newLine( ) ;
            /* Using cursor P00546 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A194BarOrdLin = P00546_A194BarOrdLin[0] ;
               A457FasCod = P00546_A457FasCod[0] ;
               A153BarFasEst = P00546_A153BarFasEst[0] ;
               A162BarFecTeo = P00546_A162BarFecTeo[0] ;
               A160BarFecRea = P00546_A160BarFecRea[0] ;
               A216BarTieTeo = P00546_A216BarTieTeo[0] ;
               A227BarUni = P00546_A227BarUni[0] ;
               A179BarLoc = P00546_A179BarLoc[0] ;
               A165BarHorIni = P00546_A165BarHorIni[0] ;
               A164BarHorFin = P00546_A164BarHorFin[0] ;
               A215BarTieRea = P00546_A215BarTieRea[0] ;
               A603MaqCodBis = P00546_A603MaqCodBis[0] ;
               A152BarFasCon = P00546_A152BarFasCon[0] ;
               A150BarFacTin = P00546_A150BarFacTin[0] ;
               A3298BarFecRIni = P00546_A3298BarFecRIni[0] ;
               A4022BarNumBot = P00546_A4022BarNumBot[0] ;
               A5719BarFasKgT = P00546_A5719BarFasKgT[0] ;
               n5719BarFasKgT = P00546_n5719BarFasKgT[0] ;
               A5720BarFasMtT = P00546_A5720BarFasMtT[0] ;
               n5720BarFasMtT = P00546_n5720BarFasMtT[0] ;
               A3837BarFasKgm = P00546_A3837BarFasKgm[0] ;
               n3837BarFasKgm = P00546_n3837BarFasKgm[0] ;
               A3838BarFasMtr = P00546_A3838BarFasMtr[0] ;
               n3838BarFasMtr = P00546_n3838BarFasMtr[0] ;
               A4301BarFasCoP = P00546_A4301BarFasCoP[0] ;
               A4905BarFasAcab = P00546_A4905BarFasAcab[0] ;
               A5047BarFasFPl = P00546_A5047BarFasFPl[0] ;
               n5047BarFasFPl = P00546_n5047BarFasFPl[0] ;
               A5048BarFasUsu = P00546_A5048BarFasUsu[0] ;
               n5048BarFasUsu = P00546_n5048BarFasUsu[0] ;
               A5369BarFasGral = P00546_A5369BarFasGral[0] ;
               n5369BarFasGral = P00546_n5369BarFasGral[0] ;
               A5896BarMaqPlan = P00546_A5896BarMaqPlan[0] ;
               n5896BarMaqPlan = P00546_n5896BarMaqPlan[0] ;
               A4287BarFasFor = P00546_A4287BarFasFor[0] ;
               A4442BarFasDTI = P00546_A4442BarFasDTI[0] ;
               n4442BarFasDTI = P00546_n4442BarFasDTI[0] ;
               A4443BarFasDTF = P00546_A4443BarFasDTF[0] ;
               n4443BarFasDTF = P00546_n4443BarFasDTF[0] ;
               A9842BarObsF = P00546_A9842BarObsF[0] ;
               n9842BarObsF = P00546_n9842BarObsF[0] ;
               A10032BarObsB = P00546_A10032BarObsB[0] ;
               n10032BarObsB = P00546_n10032BarObsB[0] ;
               AV86BarOrdLin = A194BarOrdLin ;
               AV154FasCod = A457FasCod ;
               AV47BarFasEst = A153BarFasEst ;
               AV62BarFecTeo = A162BarFecTeo ;
               AV60BarFecRea = A160BarFecRea ;
               AV119BarTieTeo = A216BarTieTeo ;
               AV129BarUni = A227BarUni ;
               AV70BarLoc = A179BarLoc ;
               AV66BarHorIni = A165BarHorIni ;
               AV65BarHorFin = A164BarHorFin ;
               AV118BarTieRea = A215BarTieRea ;
               AV166MaqCod = A603MaqCodBis ;
               AV43BarFasCon = A152BarFasCon ;
               AV41BarFacTin = A150BarFacTin ;
               AV61BarFecRIni = A3298BarFecRIni ;
               AV80BarNumBot = A4022BarNumBot ;
               AV52BarFasKgt = A5719BarFasKgT ;
               AV54BarFasMtt = A5720BarFasMtT ;
               AV51BarFasKgm = A3837BarFasKgm ;
               AV53BarFasMtr = A3838BarFasMtr ;
               AV44BarFascop = A4301BarFasCoP ;
               AV42Barfasacab = A4905BarFasAcab ;
               AV49Barfasfpl = A5047BarFasFPl ;
               AV55Barfasusu = A5048BarFasUsu ;
               AV50Barfasgral = A5369BarFasGral ;
               AV73BarMaqPlan = A5896BarMaqPlan ;
               AV48Barfasfor = A4287BarFasFor ;
               AV46Barfasdti = A4442BarFasDTI ;
               AV45Barfasdtf = A4443BarFasDTF ;
               AV85BarObsf = A9842BarObsF ;
               AV84BarObsB = A10032BarObsB ;
               GXv_char19[0] = AV152EmprCod ;
               GXv_int13[0] = AV26BarCod ;
               GXv_int24[0] = AV32BarConReo ;
               GXv_char18[0] = AV89BarParPan ;
               GXv_char16[0] = AV178ProCod ;
               GXv_int21[0] = AV86BarOrdLin ;
               GXv_char4[0] = AV154FasCod ;
               GXv_int23[0] = AV47BarFasEst ;
               GXv_date25[0] = AV62BarFecTeo ;
               GXv_date26[0] = AV60BarFecRea ;
               GXv_date27[0] = AV61BarFecRIni ;
               GXv_decimal15[0] = AV119BarTieTeo ;
               GXv_decimal14[0] = AV129BarUni ;
               GXv_char3[0] = AV70BarLoc ;
               GXv_int20[0] = AV66BarHorIni ;
               GXv_int17[0] = AV65BarHorFin ;
               GXv_decimal28[0] = AV118BarTieRea ;
               GXv_char2[0] = AV166MaqCod ;
               GXv_char29[0] = AV43BarFasCon ;
               GXv_char30[0] = AV41BarFacTin ;
               GXv_int11[0] = AV80BarNumBot ;
               GXv_decimal31[0] = AV51BarFasKgm ;
               GXv_decimal32[0] = AV52BarFasKgt ;
               GXv_decimal33[0] = AV53BarFasMtr ;
               GXv_decimal34[0] = AV54BarFasMtt ;
               GXv_char35[0] = AV44BarFascop ;
               GXv_char36[0] = AV42Barfasacab ;
               GXv_date37[0] = AV49Barfasfpl ;
               GXv_char38[0] = AV55Barfasusu ;
               GXv_char39[0] = AV50Barfasgral ;
               GXv_char40[0] = AV73BarMaqPlan ;
               GXv_char41[0] = AV48Barfasfor ;
               GXv_dtime42[0] = AV46Barfasdti ;
               GXv_dtime43[0] = AV45Barfasdtf ;
               GXv_char44[0] = AV64BarHdro ;
               GXv_char45[0] = AV85BarObsf ;
               GXv_char46[0] = AV84BarObsB ;
               new app.pnewfas(remoteHandle, context).execute( GXv_char19, GXv_int13, GXv_int24, GXv_char18, GXv_char16, GXv_int21, GXv_char4, GXv_int23, GXv_date25, GXv_date26, GXv_date27, GXv_decimal15, GXv_decimal14, GXv_char3, GXv_int20, GXv_int17, GXv_decimal28, GXv_char2, GXv_char29, GXv_char30, GXv_int11, GXv_decimal31, GXv_decimal32, GXv_decimal33, GXv_decimal34, GXv_char35, GXv_char36, GXv_date37, GXv_char38, GXv_char39, GXv_char40, GXv_char41, GXv_dtime42, GXv_dtime43, GXv_char44, GXv_char45, GXv_char46) ;
               pbarreo.this.AV152EmprCod = GXv_char19[0] ;
               pbarreo.this.AV26BarCod = GXv_int13[0] ;
               pbarreo.this.AV32BarConReo = GXv_int24[0] ;
               pbarreo.this.AV89BarParPan = GXv_char18[0] ;
               pbarreo.this.AV178ProCod = GXv_char16[0] ;
               pbarreo.this.AV86BarOrdLin = GXv_int21[0] ;
               pbarreo.this.AV154FasCod = GXv_char4[0] ;
               pbarreo.this.AV47BarFasEst = GXv_int23[0] ;
               pbarreo.this.AV62BarFecTeo = GXv_date25[0] ;
               pbarreo.this.AV60BarFecRea = GXv_date26[0] ;
               pbarreo.this.AV61BarFecRIni = GXv_date27[0] ;
               pbarreo.this.AV119BarTieTeo = GXv_decimal15[0] ;
               pbarreo.this.AV129BarUni = GXv_decimal14[0] ;
               pbarreo.this.AV70BarLoc = GXv_char3[0] ;
               pbarreo.this.AV66BarHorIni = GXv_int20[0] ;
               pbarreo.this.AV65BarHorFin = GXv_int17[0] ;
               pbarreo.this.AV118BarTieRea = GXv_decimal28[0] ;
               pbarreo.this.AV166MaqCod = GXv_char2[0] ;
               pbarreo.this.AV43BarFasCon = GXv_char29[0] ;
               pbarreo.this.AV41BarFacTin = GXv_char30[0] ;
               pbarreo.this.AV80BarNumBot = GXv_int11[0] ;
               pbarreo.this.AV51BarFasKgm = GXv_decimal31[0] ;
               pbarreo.this.AV52BarFasKgt = GXv_decimal32[0] ;
               pbarreo.this.AV53BarFasMtr = GXv_decimal33[0] ;
               pbarreo.this.AV54BarFasMtt = GXv_decimal34[0] ;
               pbarreo.this.AV44BarFascop = GXv_char35[0] ;
               pbarreo.this.AV42Barfasacab = GXv_char36[0] ;
               pbarreo.this.AV49Barfasfpl = GXv_date37[0] ;
               pbarreo.this.AV55Barfasusu = GXv_char38[0] ;
               pbarreo.this.AV50Barfasgral = GXv_char39[0] ;
               pbarreo.this.AV73BarMaqPlan = GXv_char40[0] ;
               pbarreo.this.AV48Barfasfor = GXv_char41[0] ;
               pbarreo.this.AV46Barfasdti = GXv_dtime42[0] ;
               pbarreo.this.AV45Barfasdtf = GXv_dtime43[0] ;
               pbarreo.this.AV64BarHdro = GXv_char44[0] ;
               pbarreo.this.AV85BarObsf = GXv_char45[0] ;
               pbarreo.this.AV84BarObsB = GXv_char46[0] ;
               if ( AV190Torient == 0 )
               {
                  /* Using cursor P00547 */
                  pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
                  while ( (pr_default.getStatus(4) != 101) )
                  {
                     A1664ParFasCod = P00547_A1664ParFasCod[0] ;
                     AV172ParFasCod = A1664ParFasCod ;
                     GXv_char46[0] = AV152EmprCod ;
                     GXv_int13[0] = AV27BarCodOri ;
                     GXv_int24[0] = AV112BarReoOri ;
                     GXv_char45[0] = AV88BarParOri ;
                     GXv_char44[0] = AV178ProCod ;
                     GXv_int21[0] = AV86BarOrdLin ;
                     GXv_int20[0] = AV172ParFasCod ;
                     GXv_int11[0] = AV26BarCod ;
                     GXv_int23[0] = AV32BarConReo ;
                     GXv_char41[0] = AV89BarParPan ;
                     new app.pbarparn(remoteHandle, context).execute( GXv_char46, GXv_int13, GXv_int24, GXv_char45, GXv_char44, GXv_int21, GXv_int20, GXv_int11, GXv_int23, GXv_char41) ;
                     pbarreo.this.AV152EmprCod = GXv_char46[0] ;
                     pbarreo.this.AV27BarCodOri = GXv_int13[0] ;
                     pbarreo.this.AV112BarReoOri = GXv_int24[0] ;
                     pbarreo.this.AV88BarParOri = GXv_char45[0] ;
                     pbarreo.this.AV178ProCod = GXv_char44[0] ;
                     pbarreo.this.AV86BarOrdLin = GXv_int21[0] ;
                     pbarreo.this.AV172ParFasCod = GXv_int20[0] ;
                     pbarreo.this.AV26BarCod = GXv_int11[0] ;
                     pbarreo.this.AV32BarConReo = GXv_int23[0] ;
                     pbarreo.this.AV89BarParPan = GXv_char41[0] ;
                     pr_default.readNext(4);
                  }
                  pr_default.close(4);
               }
               pr_default.readNext(3);
            }
            pr_default.close(3);
            AV187Texto_i += httpContext.getMessage( "Fin BARFAS ", "") + GXutil.newLine( ) ;
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV197Pgmname, AV192Usurcod, AV185Station, AV187Texto_i, AV27BarCodOri, AV112BarReoOri, AV88BarParOri) ;
            pr_default.readNext(2);
         }
         pr_default.close(2);
         if ( GXutil.strcmp(AV182Reo, httpContext.getMessage( "T", "")) == 0 )
         {
            AV164KilReo = DecimalUtil.doubleToDec(0) ;
            AV169MetReo = DecimalUtil.doubleToDec(0) ;
            /* Using cursor P00548 */
            pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(AV16Artextil)});
            while ( (pr_default.getStatus(5) != 101) )
            {
               A201BarPieEst = P00548_A201BarPieEst[0] ;
               A44AlbRecCod = P00548_A44AlbRecCod[0] ;
               A203BarPieKil = P00548_A203BarPieKil[0] ;
               A205BarPieMet = P00548_A205BarPieMet[0] ;
               A170BarKilLan = P00548_A170BarKilLan[0] ;
               A183BarMetLan = P00548_A183BarMetLan[0] ;
               A197BarPConTro = P00548_A197BarPConTro[0] ;
               A908PieOriCod = P00548_A908PieOriCod[0] ;
               A1271BarPieLzd = P00548_A1271BarPieLzd[0] ;
               A1501BarPiePie = P00548_A1501BarPiePie[0] ;
               A2186BarPieLoc = P00548_A2186BarPieLoc[0] ;
               n2186BarPieLoc = P00548_n2186BarPieLoc[0] ;
               A8907PzaB80 = P00548_A8907PzaB80[0] ;
               n8907PzaB80 = P00548_n8907PzaB80[0] ;
               A9795BarPieK1 = P00548_A9795BarPieK1[0] ;
               n9795BarPieK1 = P00548_n9795BarPieK1[0] ;
               A9796BarPieK2 = P00548_A9796BarPieK2[0] ;
               n9796BarPieK2 = P00548_n9796BarPieK2[0] ;
               A9800BarNPes = P00548_A9800BarNPes[0] ;
               n9800BarNPes = P00548_n9800BarNPes[0] ;
               A1691BarPieAnc = P00548_A1691BarPieAnc[0] ;
               n1691BarPieAnc = P00548_n1691BarPieAnc[0] ;
               A9846BarPieAncc = P00548_A9846BarPieAncc[0] ;
               n9846BarPieAncc = P00548_n9846BarPieAncc[0] ;
               A9984BarPiePda = P00548_A9984BarPiePda[0] ;
               n9984BarPiePda = P00548_n9984BarPiePda[0] ;
               A8707BapieObs = P00548_A8707BapieObs[0] ;
               n8707BapieObs = P00548_n8707BapieObs[0] ;
               A8838CodBarPz = P00548_A8838CodBarPz[0] ;
               n8838CodBarPz = P00548_n8838CodBarPz[0] ;
               A200BarPieCod = P00548_A200BarPieCod[0] ;
               AV96BarPieCod = A200BarPieCod ;
               AV15AlbRecCod = A44AlbRecCod ;
               AV100BarPieKil = A203BarPieKil ;
               AV103BarPieMet = A205BarPieMet ;
               AV97BarPieEst = A201BarPieEst ;
               AV68BarKilLan = A170BarKilLan ;
               AV76BarMetLan = A183BarMetLan ;
               AV90BarPConTro = A197BarPConTro ;
               AV176PieOriCod = A908PieOriCod ;
               AV102BarPieLzd = A1271BarPieLzd ;
               AV106BarPiePie = A1501BarPiePie ;
               AV101BarPieLoc = A2186BarPieLoc ;
               AV164KilReo = AV164KilReo.add(A203BarPieKil) ;
               AV169MetReo = AV169MetReo.add(A205BarPieMet) ;
               AV180pzab80 = A8907PzaB80 ;
               AV98BarPiek1 = A9795BarPieK1 ;
               AV99barPieK2 = A9796BarPieK2 ;
               AV78BarNpes = A9800BarNPes ;
               if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
               {
                  AV145ContPie = (int)(AV145ContPie+1) ;
               }
               else
               {
                  AV145ContPie = (int)(AV145ContPie+A1501BarPiePie) ;
               }
               AV94BarPieanc = A1691BarPieAnc ;
               AV95BarPieAncc = A9846BarPieAncc ;
               AV105BarPiePda = A9984BarPiePda ;
               if ( ( AV181PzasLector == 1 ) && ( AV146ConVal == 0 ) )
               {
                  AV17BaPieobs = " " ;
                  AV141CodBarpz = " " ;
                  AV97BarPieEst = (byte)(0) ;
               }
               else
               {
                  AV17BaPieobs = A8707BapieObs ;
                  AV141CodBarpz = A8838CodBarPz ;
               }
               GXv_char46[0] = AV152EmprCod ;
               GXv_int13[0] = AV26BarCod ;
               GXv_int24[0] = AV32BarConReo ;
               GXv_char45[0] = AV89BarParPan ;
               GXv_char44[0] = AV96BarPieCod ;
               GXv_int11[0] = AV15AlbRecCod ;
               GXv_decimal34[0] = AV100BarPieKil ;
               GXv_decimal33[0] = AV103BarPieMet ;
               GXv_int23[0] = AV97BarPieEst ;
               GXv_decimal32[0] = AV68BarKilLan ;
               GXv_decimal31[0] = AV76BarMetLan ;
               GXv_int21[0] = AV90BarPConTro ;
               GXv_char41[0] = AV176PieOriCod ;
               GXv_int9[0] = AV102BarPieLzd ;
               GXv_int8[0] = AV106BarPiePie ;
               GXv_char40[0] = AV101BarPieLoc ;
               GXv_char39[0] = AV180pzab80 ;
               GXv_decimal28[0] = AV98BarPiek1 ;
               GXv_decimal15[0] = AV99barPieK2 ;
               GXv_int22[0] = AV78BarNpes ;
               GXv_int20[0] = AV94BarPieanc ;
               GXv_int17[0] = AV95BarPieAncc ;
               GXv_decimal14[0] = AV105BarPiePda ;
               GXv_char38[0] = AV17BaPieobs ;
               GXv_char36[0] = AV141CodBarpz ;
               new app.pnuepie(remoteHandle, context).execute( GXv_char46, GXv_int13, GXv_int24, GXv_char45, GXv_char44, GXv_int11, GXv_decimal34, GXv_decimal33, GXv_int23, GXv_decimal32, GXv_decimal31, GXv_int21, GXv_char41, GXv_int9, GXv_int8, GXv_char40, GXv_char39, GXv_decimal28, GXv_decimal15, GXv_int22, GXv_int20, GXv_int17, GXv_decimal14, GXv_char38, GXv_char36) ;
               pbarreo.this.AV152EmprCod = GXv_char46[0] ;
               pbarreo.this.AV26BarCod = GXv_int13[0] ;
               pbarreo.this.AV32BarConReo = GXv_int24[0] ;
               pbarreo.this.AV89BarParPan = GXv_char45[0] ;
               pbarreo.this.AV96BarPieCod = GXv_char44[0] ;
               pbarreo.this.AV15AlbRecCod = GXv_int11[0] ;
               pbarreo.this.AV100BarPieKil = GXv_decimal34[0] ;
               pbarreo.this.AV103BarPieMet = GXv_decimal33[0] ;
               pbarreo.this.AV97BarPieEst = GXv_int23[0] ;
               pbarreo.this.AV68BarKilLan = GXv_decimal32[0] ;
               pbarreo.this.AV76BarMetLan = GXv_decimal31[0] ;
               pbarreo.this.AV90BarPConTro = GXv_int21[0] ;
               pbarreo.this.AV176PieOriCod = GXv_char41[0] ;
               pbarreo.this.AV102BarPieLzd = GXv_int9[0] ;
               pbarreo.this.AV106BarPiePie = GXv_int8[0] ;
               pbarreo.this.AV101BarPieLoc = GXv_char40[0] ;
               pbarreo.this.AV180pzab80 = GXv_char39[0] ;
               pbarreo.this.AV98BarPiek1 = GXv_decimal28[0] ;
               pbarreo.this.AV99barPieK2 = GXv_decimal15[0] ;
               pbarreo.this.AV78BarNpes = GXv_int22[0] ;
               pbarreo.this.AV94BarPieanc = GXv_int20[0] ;
               pbarreo.this.AV95BarPieAncc = GXv_int17[0] ;
               pbarreo.this.AV105BarPiePda = GXv_decimal14[0] ;
               pbarreo.this.AV17BaPieobs = GXv_char38[0] ;
               pbarreo.this.AV141CodBarpz = GXv_char36[0] ;
               /* Execute user subroutine: 'BORRAPIE' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(5);
                  pr_default.close(1);
                  pr_default.close(1);
                  pr_default.close(1);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               pr_default.readNext(5);
            }
            pr_default.close(5);
         }
         /*
            INSERT RECORD ON TABLE TXPDISBAR

         */
         A1146DisDisCod = AV149DisCod ;
         A1139DisBarCod = AV26BarCod ;
         A1140DisBarReo = AV32BarConReo ;
         A1141DisBarPar = AV89BarParPan ;
         /* Using cursor P00549 */
         pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A1146DisDisCod), Integer.valueOf(A1139DisBarCod), Byte.valueOf(A1140DisBarReo), A1141DisBarPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISBAR");
         if ( (pr_default.getStatus(6) == 1) )
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
         if ( GXutil.strcmp(AV182Reo, httpContext.getMessage( "T", "")) == 0 )
         {
            A141BarCosPro = DecimalUtil.ZERO ;
            A140BarCosAny = DecimalUtil.ZERO ;
            A213BarSit = (byte)(9) ;
            A161BarFecSal = GXutil.today( ) ;
            if ( AV163Jpf == 1 )
            {
               A5026BarTipEst = (byte)(1) ;
            }
         }
         /* Using cursor P005410 */
         pr_default.execute(7, new Object[] {Byte.valueOf(A213BarSit), A141BarCosPro, A140BarCosAny, A161BarFecSal, Byte.valueOf(A5026BarTipEst), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      /* Using cursor P005411 */
      pr_default.execute(8, new Object[] {AV152EmprCod, Integer.valueOf(AV26BarCod), AV88BarParOri, Byte.valueOf(AV162JBMartin), AV161Intexco, Byte.valueOf(AV165Lindalana), Byte.valueOf(AV162JBMartin), AV161Intexco, Byte.valueOf(AV165Lindalana)});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A130BarCodPar = P005411_A130BarCodPar[0] ;
         A132BarCodReo = P005411_A132BarCodReo[0] ;
         A129BarCod = P005411_A129BarCod[0] ;
         A138BarConReo = P005411_A138BarConReo[0] ;
         A1878BarNumTen = P005411_A1878BarNumTen[0] ;
         A138BarConReo = AV32BarConReo ;
         AV82BarNumTen = A1878BarNumTen ;
         /* Using cursor P005412 */
         pr_default.execute(9, new Object[] {Byte.valueOf(A138BarConReo), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         pr_default.readNext(8);
      }
      pr_default.close(8);
      GXv_char46[0] = AV152EmprCod ;
      GXv_int13[0] = AV151DisOriCod ;
      GXv_int11[0] = AV149DisCod ;
      GXv_char45[0] = AV182Reo ;
      new app.pdisreo(remoteHandle, context).execute( GXv_char46, GXv_int13, GXv_int11, GXv_char45) ;
      pbarreo.this.AV152EmprCod = GXv_char46[0] ;
      pbarreo.this.AV151DisOriCod = GXv_int13[0] ;
      pbarreo.this.AV149DisCod = GXv_int11[0] ;
      pbarreo.this.AV182Reo = GXv_char45[0] ;
      if ( AV157FlagHil == 1 )
      {
         if ( ! (0==AV140CliPropio) && ( GXutil.strcmp(AV19BarAcc, httpContext.getMessage( "P", "")) == 0 ) )
         {
            AV139CliPdo = AV140CliPropio ;
         }
         else
         {
            AV139CliPdo = AV138CliCod ;
         }
         /* Using cursor P005413 */
         pr_default.execute(10, new Object[] {AV152EmprCod, AV173PartCod, Integer.valueOf(AV139CliPdo)});
         while ( (pr_default.getStatus(10) != 101) )
         {
            A252CliCod = P005413_A252CliCod[0] ;
            n252CliCod = P005413_n252CliCod[0] ;
            A966PartCod = P005413_A966PartCod[0] ;
            n966PartCod = P005413_n966PartCod[0] ;
            A972PartULin = P005413_A972PartULin[0] ;
            n972PartULin = P005413_n972PartULin[0] ;
            AV174PartLin = 0 ;
            /* Using cursor P005414 */
            pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n966PartCod), A966PartCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
            while ( (pr_default.getStatus(11) != 101) )
            {
               A979PartLin = P005414_A979PartLin[0] ;
               AV174PartLin = A979PartLin ;
               pr_default.readNext(11);
            }
            pr_default.close(11);
            /* Using cursor P005415 */
            pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n966PartCod), A966PartCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Integer.valueOf(AV151DisOriCod)});
            while ( (pr_default.getStatus(12) != 101) )
            {
               A982PartSitDis = P005415_A982PartSitDis[0] ;
               n982PartSitDis = P005415_n982PartSitDis[0] ;
               A981PartAlbDis = P005415_A981PartAlbDis[0] ;
               n981PartAlbDis = P005415_n981PartAlbDis[0] ;
               A979PartLin = P005415_A979PartLin[0] ;
               A10263PartFm = P005415_A10263PartFm[0] ;
               n10263PartFm = P005415_n10263PartFm[0] ;
               A10262PartTrz = P005415_A10262PartTrz[0] ;
               n10262PartTrz = P005415_n10262PartTrz[0] ;
               A10261PartHhEv = P005415_A10261PartHhEv[0] ;
               n10261PartHhEv = P005415_n10261PartHhEv[0] ;
               A10260PartFcEv = P005415_A10260PartFcEv[0] ;
               n10260PartFcEv = P005415_n10260PartFcEv[0] ;
               A10259PartSts = P005415_A10259PartSts[0] ;
               n10259PartSts = P005415_n10259PartSts[0] ;
               A5916PartTarPal = P005415_A5916PartTarPal[0] ;
               n5916PartTarPal = P005415_n5916PartTarPal[0] ;
               A5915PartTarCja = P005415_A5915PartTarCja[0] ;
               n5915PartTarCja = P005415_n5915PartTarCja[0] ;
               A5914PartCja = P005415_A5914PartCja[0] ;
               n5914PartCja = P005415_n5914PartCja[0] ;
               A5913PartPalEst = P005415_A5913PartPalEst[0] ;
               n5913PartPalEst = P005415_n5913PartPalEst[0] ;
               A5912PartPalUti = P005415_A5912PartPalUti[0] ;
               n5912PartPalUti = P005415_n5912PartPalUti[0] ;
               A5878PartLinUni = P005415_A5878PartLinUni[0] ;
               n5878PartLinUni = P005415_n5878PartLinUni[0] ;
               A2377ParExtLin = P005415_A2377ParExtLin[0] ;
               n2377ParExtLin = P005415_n2377ParExtLin[0] ;
               A2246ParNumCli = P005415_A2246ParNumCli[0] ;
               n2246ParNumCli = P005415_n2246ParNumCli[0] ;
               A1157TipConCod = P005415_A1157TipConCod[0] ;
               n1157TipConCod = P005415_n1157TipConCod[0] ;
               A2024ParPorAgu = P005415_A2024ParPorAgu[0] ;
               n2024ParPorAgu = P005415_n2024ParPorAgu[0] ;
               A2023PartDm = P005415_A2023PartDm[0] ;
               n2023PartDm = P005415_n2023PartDm[0] ;
               A2022PartPesCo = P005415_A2022PartPesCo[0] ;
               n2022PartPesCo = P005415_n2022PartPesCo[0] ;
               A1967ConRes = P005415_A1967ConRes[0] ;
               n1967ConRes = P005415_n1967ConRes[0] ;
               A1966KilRes = P005415_A1966KilRes[0] ;
               n1966KilRes = P005415_n1966KilRes[0] ;
               A1877PartLoc = P005415_A1877PartLoc[0] ;
               n1877PartLoc = P005415_n1877PartLoc[0] ;
               A987ConUti = P005415_A987ConUti[0] ;
               n987ConUti = P005415_n987ConUti[0] ;
               A986KilUti = P005415_A986KilUti[0] ;
               n986KilUti = P005415_n986KilUti[0] ;
               A985ConEnt = P005415_A985ConEnt[0] ;
               n985ConEnt = P005415_n985ConEnt[0] ;
               A984KilEnt = P005415_A984KilEnt[0] ;
               n984KilEnt = P005415_n984KilEnt[0] ;
               A983PartFecMov = P005415_A983PartFecMov[0] ;
               n983PartFecMov = P005415_n983PartFecMov[0] ;
               A840TrnCod = P005415_A840TrnCod[0] ;
               n840TrnCod = P005415_n840TrnCod[0] ;
               A980PartLinTip = P005415_A980PartLinTip[0] ;
               n980PartLinTip = P005415_n980PartLinTip[0] ;
               if ( GXutil.strcmp(A980PartLinTip, httpContext.getMessage( "B", "")) == 0 )
               {
                  if ( GXutil.strcmp(AV182Reo, httpContext.getMessage( "T", "")) == 0 )
                  {
                     if ( AV156FlagBros == 1 )
                     {
                        A981PartAlbDis = AV149DisCod ;
                        n981PartAlbDis = false ;
                        A982PartSitDis = GXutil.str( AV26BarCod, 8, 0) + " " + GXutil.str( AV32BarConReo, 1, 0) + AV89BarParPan + "/" + AV82BarNumTen ;
                        n982PartSitDis = false ;
                     }
                     else
                     {
                        A981PartAlbDis = AV149DisCod ;
                        n981PartAlbDis = false ;
                        if ( AV175Pervaf == 1 )
                        {
                           A982PartSitDis = httpContext.getMessage( "T. ", "") + AV82BarNumTen ;
                           n982PartSitDis = false ;
                        }
                     }
                  }
                  else
                  {
                     /*
                        INSERT RECORD ON TABLE TXPLPARTI

                     */
                     W979PartLin = A979PartLin ;
                     W981PartAlbDis = A981PartAlbDis ;
                     n981PartAlbDis = false ;
                     W982PartSitDis = A982PartSitDis ;
                     n982PartSitDis = false ;
                     W979PartLin = A979PartLin ;
                     W981PartAlbDis = A981PartAlbDis ;
                     n981PartAlbDis = false ;
                     W982PartSitDis = A982PartSitDis ;
                     n982PartSitDis = false ;
                     if ( AV156FlagBros == 1 )
                     {
                        AV174PartLin = (int)(AV174PartLin+1) ;
                        A979PartLin = AV174PartLin ;
                        A981PartAlbDis = AV149DisCod ;
                        n981PartAlbDis = false ;
                        A982PartSitDis = GXutil.str( AV26BarCod, 8, 0) + " " + GXutil.str( AV32BarConReo, 1, 0) + AV89BarParPan + "/" + AV82BarNumTen ;
                        n982PartSitDis = false ;
                     }
                     else
                     {
                        AV174PartLin = (int)(AV174PartLin+1) ;
                        A979PartLin = AV174PartLin ;
                        A981PartAlbDis = AV149DisCod ;
                        n981PartAlbDis = false ;
                        if ( AV175Pervaf == 1 )
                        {
                           A982PartSitDis = httpContext.getMessage( "T. ", "") + AV82BarNumTen ;
                           n982PartSitDis = false ;
                        }
                     }
                     /* Using cursor P005416 */
                     pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n966PartCod), A966PartCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Integer.valueOf(A979PartLin), Boolean.valueOf(n980PartLinTip), A980PartLinTip, Boolean.valueOf(n981PartAlbDis), Integer.valueOf(A981PartAlbDis), Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod), Boolean.valueOf(n982PartSitDis), A982PartSitDis, Boolean.valueOf(n983PartFecMov), A983PartFecMov, Boolean.valueOf(n984KilEnt), A984KilEnt, Boolean.valueOf(n985ConEnt), Short.valueOf(A985ConEnt), Boolean.valueOf(n986KilUti), A986KilUti, Boolean.valueOf(n987ConUti), Short.valueOf(A987ConUti), Boolean.valueOf(n1877PartLoc), A1877PartLoc, Boolean.valueOf(n1966KilRes), A1966KilRes, Boolean.valueOf(n1967ConRes), Short.valueOf(A1967ConRes), Boolean.valueOf(n2022PartPesCo), A2022PartPesCo, Boolean.valueOf(n2023PartDm), A2023PartDm, Boolean.valueOf(n2024ParPorAgu), A2024ParPorAgu, Boolean.valueOf(n1157TipConCod), Short.valueOf(A1157TipConCod), Boolean.valueOf(n2246ParNumCli), A2246ParNumCli, Boolean.valueOf(n2377ParExtLin), Short.valueOf(A2377ParExtLin), Boolean.valueOf(n5878PartLinUni), A5878PartLinUni, Boolean.valueOf(n5912PartPalUti), A5912PartPalUti, Boolean.valueOf(n5913PartPalEst), A5913PartPalEst, Boolean.valueOf(n5914PartCja), Integer.valueOf(A5914PartCja), Boolean.valueOf(n5915PartTarCja), A5915PartTarCja, Boolean.valueOf(n5916PartTarPal), A5916PartTarPal, Boolean.valueOf(n10259PartSts), Byte.valueOf(A10259PartSts), Boolean.valueOf(n10260PartFcEv), A10260PartFcEv, Boolean.valueOf(n10261PartHhEv), A10261PartHhEv, Boolean.valueOf(n10262PartTrz), A10262PartTrz, Boolean.valueOf(n10263PartFm), A10263PartFm});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPARTI");
                     if ( (pr_default.getStatus(13) == 1) )
                     {
                        Gx_err = (short)(1) ;
                        Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
                     }
                     else
                     {
                        Gx_err = (short)(0) ;
                        Gx_emsg = "" ;
                     }
                     A979PartLin = W979PartLin ;
                     A981PartAlbDis = W981PartAlbDis ;
                     n981PartAlbDis = false ;
                     A982PartSitDis = W982PartSitDis ;
                     n982PartSitDis = false ;
                     A979PartLin = W979PartLin ;
                     A981PartAlbDis = W981PartAlbDis ;
                     n981PartAlbDis = false ;
                     A982PartSitDis = W982PartSitDis ;
                     n982PartSitDis = false ;
                     /* End Insert */
                  }
                  /* Using cursor P005417 */
                  pr_default.execute(14, new Object[] {Boolean.valueOf(n982PartSitDis), A982PartSitDis, Boolean.valueOf(n981PartAlbDis), Integer.valueOf(A981PartAlbDis), A396EmprCod, Boolean.valueOf(n966PartCod), A966PartCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Integer.valueOf(A979PartLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPARTI");
               }
               pr_default.readNext(12);
            }
            pr_default.close(12);
            if ( GXutil.strcmp(AV182Reo, httpContext.getMessage( "P", "")) == 0 )
            {
               A972PartULin = AV174PartLin ;
               n972PartULin = false ;
            }
            /* Using cursor P005418 */
            pr_default.execute(15, new Object[] {Boolean.valueOf(n972PartULin), Integer.valueOf(A972PartULin), A396EmprCod, Boolean.valueOf(n966PartCod), A966PartCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPARTI");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(10);
      }
      if ( AV186Texfina == 0 )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Using cursor P005419 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(AV27BarCodOri), Byte.valueOf(AV112BarReoOri), AV88BarParOri});
      while ( (pr_default.getStatus(16) != 101) )
      {
         A6967Mat_Hdp = P005419_A6967Mat_Hdp[0] ;
         A6966Mat_Hdr = P005419_A6966Mat_Hdr[0] ;
         A6965Mat_Hd = P005419_A6965Mat_Hd[0] ;
         A7397Mat_FecIng = P005419_A7397Mat_FecIng[0] ;
         n7397Mat_FecIng = P005419_n7397Mat_FecIng[0] ;
         A7396Mat_HdKPr = P005419_A7396Mat_HdKPr[0] ;
         n7396Mat_HdKPr = P005419_n7396Mat_HdKPr[0] ;
         A6971Mat_Pzas = P005419_A6971Mat_Pzas[0] ;
         n6971Mat_Pzas = P005419_n6971Mat_Pzas[0] ;
         A6970Mat_HdGuia = P005419_A6970Mat_HdGuia[0] ;
         n6970Mat_HdGuia = P005419_n6970Mat_HdGuia[0] ;
         A6969Mat_HdKgs = P005419_A6969Mat_HdKgs[0] ;
         n6969Mat_HdKgs = P005419_n6969Mat_HdKgs[0] ;
         A6968Mat_HdUl = P005419_A6968Mat_HdUl[0] ;
         n6968Mat_HdUl = P005419_n6968Mat_HdUl[0] ;
         W396EmprCod = A396EmprCod ;
         W6965Mat_Hd = A6965Mat_Hd ;
         W6966Mat_Hdr = A6966Mat_Hdr ;
         W6967Mat_Hdp = A6967Mat_Hdp ;
         /*
            INSERT RECORD ON TABLE TXPHDRMAT

         */
         W396EmprCod = A396EmprCod ;
         W6965Mat_Hd = A6965Mat_Hd ;
         W6966Mat_Hdr = A6966Mat_Hdr ;
         W6967Mat_Hdp = A6967Mat_Hdp ;
         A6965Mat_Hd = AV26BarCod ;
         A6966Mat_Hdr = AV32BarConReo ;
         A6967Mat_Hdp = AV89BarParPan ;
         /* Using cursor P005420 */
         pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A6965Mat_Hd), Byte.valueOf(A6966Mat_Hdr), A6967Mat_Hdp, Boolean.valueOf(n6968Mat_HdUl), Short.valueOf(A6968Mat_HdUl), Boolean.valueOf(n6969Mat_HdKgs), A6969Mat_HdKgs, Boolean.valueOf(n6970Mat_HdGuia), A6970Mat_HdGuia, Boolean.valueOf(n6971Mat_Pzas), Integer.valueOf(A6971Mat_Pzas), Boolean.valueOf(n7396Mat_HdKPr), A7396Mat_HdKPr, Boolean.valueOf(n7397Mat_FecIng), A7397Mat_FecIng});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHDRMAT");
         if ( (pr_default.getStatus(17) == 1) )
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
         A6965Mat_Hd = W6965Mat_Hd ;
         A6966Mat_Hdr = W6966Mat_Hdr ;
         A6967Mat_Hdp = W6967Mat_Hdp ;
         /* End Insert */
         A396EmprCod = W396EmprCod ;
         A6965Mat_Hd = W6965Mat_Hd ;
         A6966Mat_Hdr = W6966Mat_Hdr ;
         A6967Mat_Hdp = W6967Mat_Hdp ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(16);
      /* Using cursor P005421 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(AV27BarCodOri), Byte.valueOf(AV112BarReoOri), AV88BarParOri});
      while ( (pr_default.getStatus(18) != 101) )
      {
         A6981Mat_HdObs = P005421_A6981Mat_HdObs[0] ;
         n6981Mat_HdObs = P005421_n6981Mat_HdObs[0] ;
         A6967Mat_Hdp = P005421_A6967Mat_Hdp[0] ;
         A6966Mat_Hdr = P005421_A6966Mat_Hdr[0] ;
         A6965Mat_Hd = P005421_A6965Mat_Hd[0] ;
         A7238Mat_RecM = P005421_A7238Mat_RecM[0] ;
         n7238Mat_RecM = P005421_n7238Mat_RecM[0] ;
         A7108Mat_TraInt = P005421_A7108Mat_TraInt[0] ;
         n7108Mat_TraInt = P005421_n7108Mat_TraInt[0] ;
         A7107Mat_CliRm = P005421_A7107Mat_CliRm[0] ;
         n7107Mat_CliRm = P005421_n7107Mat_CliRm[0] ;
         A7106Mat_MaqTej = P005421_A7106Mat_MaqTej[0] ;
         n7106Mat_MaqTej = P005421_n7106Mat_MaqTej[0] ;
         A6980Mat_HdLm = P005421_A6980Mat_HdLm[0] ;
         n6980Mat_HdLm = P005421_n6980Mat_HdLm[0] ;
         A6979Mat_HdPorc = P005421_A6979Mat_HdPorc[0] ;
         n6979Mat_HdPorc = P005421_n6979Mat_HdPorc[0] ;
         A6978Mat_HdLote = P005421_A6978Mat_HdLote[0] ;
         n6978Mat_HdLote = P005421_n6978Mat_HdLote[0] ;
         A6977Mat_HdProv = P005421_A6977Mat_HdProv[0] ;
         n6977Mat_HdProv = P005421_n6977Mat_HdProv[0] ;
         A6976Mat_HdNomc = P005421_A6976Mat_HdNomc[0] ;
         n6976Mat_HdNomc = P005421_n6976Mat_HdNomc[0] ;
         A6975Mat_HdTor = P005421_A6975Mat_HdTor[0] ;
         n6975Mat_HdTor = P005421_n6975Mat_HdTor[0] ;
         A6974Mat_HdMat = P005421_A6974Mat_HdMat[0] ;
         n6974Mat_HdMat = P005421_n6974Mat_HdMat[0] ;
         A6973Mat_HdEst = P005421_A6973Mat_HdEst[0] ;
         n6973Mat_HdEst = P005421_n6973Mat_HdEst[0] ;
         A6972Mat_HdLin = P005421_A6972Mat_HdLin[0] ;
         W396EmprCod = A396EmprCod ;
         W6965Mat_Hd = A6965Mat_Hd ;
         W6966Mat_Hdr = A6966Mat_Hdr ;
         W6967Mat_Hdp = A6967Mat_Hdp ;
         /*
            INSERT RECORD ON TABLE TXPHDRMA1

         */
         W396EmprCod = A396EmprCod ;
         W6965Mat_Hd = A6965Mat_Hd ;
         W6966Mat_Hdr = A6966Mat_Hdr ;
         W6967Mat_Hdp = A6967Mat_Hdp ;
         W6972Mat_HdLin = A6972Mat_HdLin ;
         A6965Mat_Hd = AV26BarCod ;
         A6966Mat_Hdr = AV32BarConReo ;
         A6967Mat_Hdp = AV89BarParPan ;
         /* Using cursor P005422 */
         pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A6965Mat_Hd), Byte.valueOf(A6966Mat_Hdr), A6967Mat_Hdp, Short.valueOf(A6972Mat_HdLin), Boolean.valueOf(n6973Mat_HdEst), A6973Mat_HdEst, Boolean.valueOf(n6974Mat_HdMat), A6974Mat_HdMat, Boolean.valueOf(n6975Mat_HdTor), A6975Mat_HdTor, Boolean.valueOf(n6976Mat_HdNomc), A6976Mat_HdNomc, Boolean.valueOf(n6977Mat_HdProv), A6977Mat_HdProv, Boolean.valueOf(n6978Mat_HdLote), A6978Mat_HdLote, Boolean.valueOf(n6979Mat_HdPorc), A6979Mat_HdPorc, Boolean.valueOf(n6980Mat_HdLm), A6980Mat_HdLm, Boolean.valueOf(n6981Mat_HdObs), A6981Mat_HdObs, Boolean.valueOf(n7106Mat_MaqTej), A7106Mat_MaqTej, Boolean.valueOf(n7107Mat_CliRm), A7107Mat_CliRm, Boolean.valueOf(n7108Mat_TraInt), Long.valueOf(A7108Mat_TraInt), Boolean.valueOf(n7238Mat_RecM), Integer.valueOf(A7238Mat_RecM)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHDRMA1");
         if ( (pr_default.getStatus(19) == 1) )
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
         A6965Mat_Hd = W6965Mat_Hd ;
         A6966Mat_Hdr = W6966Mat_Hdr ;
         A6967Mat_Hdp = W6967Mat_Hdp ;
         A6972Mat_HdLin = W6972Mat_HdLin ;
         /* End Insert */
         A396EmprCod = W396EmprCod ;
         A6965Mat_Hd = W6965Mat_Hd ;
         A6966Mat_Hdr = W6966Mat_Hdr ;
         A6967Mat_Hdp = W6967Mat_Hdp ;
         pr_default.readNext(18);
      }
      pr_default.close(18);
      /* Using cursor P005423 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(AV27BarCodOri), Byte.valueOf(AV112BarReoOri), AV88BarParOri});
      while ( (pr_default.getStatus(20) != 101) )
      {
         A6967Mat_Hdp = P005423_A6967Mat_Hdp[0] ;
         A6966Mat_Hdr = P005423_A6966Mat_Hdr[0] ;
         A6965Mat_Hd = P005423_A6965Mat_Hd[0] ;
         A7239Mat_RecT = P005423_A7239Mat_RecT[0] ;
         n7239Mat_RecT = P005423_n7239Mat_RecT[0] ;
         A8049Mat_HdKgTl = P005423_A8049Mat_HdKgTl[0] ;
         n8049Mat_HdKgTl = P005423_n8049Mat_HdKgTl[0] ;
         A7008Mat_HdUnTl = P005423_A7008Mat_HdUnTl[0] ;
         n7008Mat_HdUnTl = P005423_n7008Mat_HdUnTl[0] ;
         A7007Mat_HdTl = P005423_A7007Mat_HdTl[0] ;
         W396EmprCod = A396EmprCod ;
         W6965Mat_Hd = A6965Mat_Hd ;
         W6966Mat_Hdr = A6966Mat_Hdr ;
         W6967Mat_Hdp = A6967Mat_Hdp ;
         /*
            INSERT RECORD ON TABLE TXPHDRTAL

         */
         W396EmprCod = A396EmprCod ;
         W6965Mat_Hd = A6965Mat_Hd ;
         W6966Mat_Hdr = A6966Mat_Hdr ;
         W6967Mat_Hdp = A6967Mat_Hdp ;
         W7007Mat_HdTl = A7007Mat_HdTl ;
         A6965Mat_Hd = AV26BarCod ;
         A6966Mat_Hdr = AV32BarConReo ;
         A6967Mat_Hdp = AV89BarParPan ;
         /* Using cursor P005424 */
         pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A6965Mat_Hd), Byte.valueOf(A6966Mat_Hdr), A6967Mat_Hdp, A7007Mat_HdTl, Boolean.valueOf(n7008Mat_HdUnTl), Integer.valueOf(A7008Mat_HdUnTl), Boolean.valueOf(n8049Mat_HdKgTl), A8049Mat_HdKgTl, Boolean.valueOf(n7239Mat_RecT), Integer.valueOf(A7239Mat_RecT)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHDRTAL");
         if ( (pr_default.getStatus(21) == 1) )
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
         A6965Mat_Hd = W6965Mat_Hd ;
         A6966Mat_Hdr = W6966Mat_Hdr ;
         A6967Mat_Hdp = W6967Mat_Hdp ;
         A7007Mat_HdTl = W7007Mat_HdTl ;
         /* End Insert */
         A396EmprCod = W396EmprCod ;
         A6965Mat_Hd = W6965Mat_Hd ;
         A6966Mat_Hdr = W6966Mat_Hdr ;
         A6967Mat_Hdp = W6967Mat_Hdp ;
         pr_default.readNext(20);
      }
      pr_default.close(20);
      if ( GXutil.strcmp(AV182Reo, httpContext.getMessage( "T", "")) == 0 )
      {
         /* Using cursor P005425 */
         pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(AV27BarCodOri), Byte.valueOf(AV112BarReoOri), AV88BarParOri});
         while ( (pr_default.getStatus(22) != 101) )
         {
            A6967Mat_Hdp = P005425_A6967Mat_Hdp[0] ;
            A6966Mat_Hdr = P005425_A6966Mat_Hdr[0] ;
            A6965Mat_Hd = P005425_A6965Mat_Hd[0] ;
            A7109Mat_Numcr = P005425_A7109Mat_Numcr[0] ;
            n7109Mat_Numcr = P005425_n7109Mat_Numcr[0] ;
            A6985Mat_HdKgP = P005425_A6985Mat_HdKgP[0] ;
            n6985Mat_HdKgP = P005425_n6985Mat_HdKgP[0] ;
            A6984Mat_HdCPz = P005425_A6984Mat_HdCPz[0] ;
            W396EmprCod = A396EmprCod ;
            W6965Mat_Hd = A6965Mat_Hd ;
            W6966Mat_Hdr = A6966Mat_Hdr ;
            W6967Mat_Hdp = A6967Mat_Hdp ;
            /*
               INSERT RECORD ON TABLE TXPHDRPZS

            */
            W396EmprCod = A396EmprCod ;
            W6965Mat_Hd = A6965Mat_Hd ;
            W6966Mat_Hdr = A6966Mat_Hdr ;
            W6967Mat_Hdp = A6967Mat_Hdp ;
            W6984Mat_HdCPz = A6984Mat_HdCPz ;
            A6965Mat_Hd = AV26BarCod ;
            A6966Mat_Hdr = AV32BarConReo ;
            A6967Mat_Hdp = AV89BarParPan ;
            /* Using cursor P005426 */
            pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A6965Mat_Hd), Byte.valueOf(A6966Mat_Hdr), A6967Mat_Hdp, A6984Mat_HdCPz, Boolean.valueOf(n6985Mat_HdKgP), A6985Mat_HdKgP, Boolean.valueOf(n7109Mat_Numcr), Long.valueOf(A7109Mat_Numcr)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHDRPZS");
            if ( (pr_default.getStatus(23) == 1) )
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
            A6965Mat_Hd = W6965Mat_Hd ;
            A6966Mat_Hdr = W6966Mat_Hdr ;
            A6967Mat_Hdp = W6967Mat_Hdp ;
            A6984Mat_HdCPz = W6984Mat_HdCPz ;
            /* End Insert */
            A396EmprCod = W396EmprCod ;
            A6965Mat_Hd = W6965Mat_Hd ;
            A6966Mat_Hdr = W6966Mat_Hdr ;
            A6967Mat_Hdp = W6967Mat_Hdp ;
            pr_default.readNext(22);
         }
         pr_default.close(22);
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'BORRAPIE' Routine */
      returnInSub = false ;
      /* Optimized DELETE. */
      /* Using cursor P005427 */
      pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(AV27BarCodOri), Byte.valueOf(AV112BarReoOri), AV88BarParOri});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
      /* End optimized DELETE. */
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbarreo.this.A396EmprCod;
      this.aP1[0] = pbarreo.this.AV27BarCodOri;
      this.aP2[0] = pbarreo.this.AV112BarReoOri;
      this.aP3[0] = pbarreo.this.AV88BarParOri;
      this.aP4[0] = pbarreo.this.AV26BarCod;
      this.aP5[0] = pbarreo.this.AV89BarParPan;
      this.aP6[0] = pbarreo.this.AV116BarSit;
      this.aP7[0] = pbarreo.this.AV182Reo;
      this.aP8[0] = pbarreo.this.AV188TipDefCod;
      this.aP9[0] = pbarreo.this.AV189TipDefPor;
      this.aP10[0] = pbarreo.this.AV72BarMaqCod;
      this.aP11[0] = pbarreo.this.AV32BarConReo;
      this.aP12[0] = pbarreo.this.AV142Codigo;
      this.aP13[0] = pbarreo.this.AV149DisCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pbarreo");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV185Station = "" ;
      AV153EmprNom = "" ;
      AV192Usurcod = "" ;
      AV144ContDsc = "" ;
      GXt_char1 = "" ;
      AV161Intexco = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P00542_A396EmprCod = new String[] {""} ;
      P00542_A130BarCodPar = new String[] {""} ;
      P00542_A132BarCodReo = new byte[1] ;
      P00542_A129BarCod = new int[1] ;
      P00542_A138BarConReo = new byte[1] ;
      A130BarCodPar = "" ;
      AV158Hdr = "" ;
      AV159Hdrd = "" ;
      AV187Texto_i = "" ;
      AV197Pgmname = "" ;
      P00544_A396EmprCod = new String[] {""} ;
      P00544_A365DisDes = new String[] {""} ;
      P00544_A130BarCodPar = new String[] {""} ;
      P00544_A132BarCodReo = new byte[1] ;
      P00544_A129BarCod = new int[1] ;
      P00544_A966PartCod = new String[] {""} ;
      P00544_n966PartCod = new boolean[] {false} ;
      P00544_A252CliCod = new int[1] ;
      P00544_n252CliCod = new boolean[] {false} ;
      P00544_A361DisCod = new int[1] ;
      P00544_A5253BarAcc = new String[] {""} ;
      P00544_A2010BarTipDis = new String[] {""} ;
      P00544_A213BarSit = new byte[1] ;
      P00544_A189BarNumAny = new short[1] ;
      P00544_A137BarConPar = new String[] {""} ;
      P00544_A141BarCosPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00544_A140BarCosAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00544_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P00544_A5026BarTipEst = new byte[1] ;
      P00544_A898BarPieNDes = new int[1] ;
      P00544_n898BarPieNDes = new boolean[] {false} ;
      A365DisDes = "" ;
      A966PartCod = "" ;
      A5253BarAcc = "" ;
      A2010BarTipDis = "" ;
      A137BarConPar = "" ;
      A141BarCosPro = DecimalUtil.ZERO ;
      A140BarCosAny = DecimalUtil.ZERO ;
      A161BarFecSal = GXutil.nullDate() ;
      AV64BarHdro = "" ;
      AV173PartCod = "" ;
      AV152EmprCod = "" ;
      AV19BarAcc = "" ;
      Gx_msg = "" ;
      AV150DisDes = "" ;
      AV31BarConPar = "" ;
      AV148CosPro = DecimalUtil.ZERO ;
      AV147CosAny = DecimalUtil.ZERO ;
      GXv_int5 = new byte[1] ;
      GXv_int10 = new byte[1] ;
      GXv_int12 = new byte[1] ;
      P00545_A396EmprCod = new String[] {""} ;
      P00545_A129BarCod = new int[1] ;
      P00545_A132BarCodReo = new byte[1] ;
      P00545_A130BarCodPar = new String[] {""} ;
      P00545_A758ProCod = new String[] {""} ;
      P00545_A761ProFasLin = new short[1] ;
      P00545_n761ProFasLin = new boolean[] {false} ;
      A758ProCod = "" ;
      AV178ProCod = "" ;
      P00546_A396EmprCod = new String[] {""} ;
      P00546_A129BarCod = new int[1] ;
      P00546_A132BarCodReo = new byte[1] ;
      P00546_A130BarCodPar = new String[] {""} ;
      P00546_A758ProCod = new String[] {""} ;
      P00546_A194BarOrdLin = new short[1] ;
      P00546_A457FasCod = new String[] {""} ;
      P00546_A153BarFasEst = new byte[1] ;
      P00546_A162BarFecTeo = new java.util.Date[] {GXutil.nullDate()} ;
      P00546_A160BarFecRea = new java.util.Date[] {GXutil.nullDate()} ;
      P00546_A216BarTieTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00546_A227BarUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00546_A179BarLoc = new String[] {""} ;
      P00546_A165BarHorIni = new short[1] ;
      P00546_A164BarHorFin = new short[1] ;
      P00546_A215BarTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00546_A603MaqCodBis = new String[] {""} ;
      P00546_A152BarFasCon = new String[] {""} ;
      P00546_A150BarFacTin = new String[] {""} ;
      P00546_A3298BarFecRIni = new java.util.Date[] {GXutil.nullDate()} ;
      P00546_A4022BarNumBot = new int[1] ;
      P00546_A5719BarFasKgT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00546_n5719BarFasKgT = new boolean[] {false} ;
      P00546_A5720BarFasMtT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00546_n5720BarFasMtT = new boolean[] {false} ;
      P00546_A3837BarFasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00546_n3837BarFasKgm = new boolean[] {false} ;
      P00546_A3838BarFasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00546_n3838BarFasMtr = new boolean[] {false} ;
      P00546_A4301BarFasCoP = new String[] {""} ;
      P00546_A4905BarFasAcab = new String[] {""} ;
      P00546_A5047BarFasFPl = new java.util.Date[] {GXutil.nullDate()} ;
      P00546_n5047BarFasFPl = new boolean[] {false} ;
      P00546_A5048BarFasUsu = new String[] {""} ;
      P00546_n5048BarFasUsu = new boolean[] {false} ;
      P00546_A5369BarFasGral = new String[] {""} ;
      P00546_n5369BarFasGral = new boolean[] {false} ;
      P00546_A5896BarMaqPlan = new String[] {""} ;
      P00546_n5896BarMaqPlan = new boolean[] {false} ;
      P00546_A4287BarFasFor = new String[] {""} ;
      P00546_A4442BarFasDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P00546_n4442BarFasDTI = new boolean[] {false} ;
      P00546_A4443BarFasDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P00546_n4443BarFasDTF = new boolean[] {false} ;
      P00546_A9842BarObsF = new String[] {""} ;
      P00546_n9842BarObsF = new boolean[] {false} ;
      P00546_A10032BarObsB = new String[] {""} ;
      P00546_n10032BarObsB = new boolean[] {false} ;
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
      AV154FasCod = "" ;
      AV62BarFecTeo = GXutil.nullDate() ;
      AV60BarFecRea = GXutil.nullDate() ;
      AV119BarTieTeo = DecimalUtil.ZERO ;
      AV129BarUni = DecimalUtil.ZERO ;
      AV70BarLoc = "" ;
      AV118BarTieRea = DecimalUtil.ZERO ;
      AV166MaqCod = "" ;
      AV43BarFasCon = "" ;
      AV41BarFacTin = "" ;
      AV61BarFecRIni = GXutil.nullDate() ;
      AV52BarFasKgt = DecimalUtil.ZERO ;
      AV54BarFasMtt = DecimalUtil.ZERO ;
      AV51BarFasKgm = DecimalUtil.ZERO ;
      AV53BarFasMtr = DecimalUtil.ZERO ;
      AV44BarFascop = "" ;
      AV42Barfasacab = "" ;
      AV49Barfasfpl = GXutil.nullDate() ;
      AV55Barfasusu = "" ;
      AV50Barfasgral = "" ;
      AV73BarMaqPlan = "" ;
      AV48Barfasfor = "" ;
      AV46Barfasdti = GXutil.resetTime( GXutil.nullDate() );
      AV45Barfasdtf = GXutil.resetTime( GXutil.nullDate() );
      AV85BarObsf = "" ;
      AV84BarObsB = "" ;
      GXv_char19 = new String[1] ;
      GXv_char18 = new String[1] ;
      GXv_char16 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_date25 = new java.util.Date[1] ;
      GXv_date26 = new java.util.Date[1] ;
      GXv_date27 = new java.util.Date[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_char29 = new String[1] ;
      GXv_char30 = new String[1] ;
      GXv_char35 = new String[1] ;
      GXv_date37 = new java.util.Date[1] ;
      GXv_dtime42 = new java.util.Date[1] ;
      GXv_dtime43 = new java.util.Date[1] ;
      P00547_A396EmprCod = new String[] {""} ;
      P00547_A129BarCod = new int[1] ;
      P00547_A132BarCodReo = new byte[1] ;
      P00547_A130BarCodPar = new String[] {""} ;
      P00547_A758ProCod = new String[] {""} ;
      P00547_A194BarOrdLin = new short[1] ;
      P00547_A1664ParFasCod = new short[1] ;
      AV164KilReo = DecimalUtil.ZERO ;
      AV169MetReo = DecimalUtil.ZERO ;
      P00548_A396EmprCod = new String[] {""} ;
      P00548_A129BarCod = new int[1] ;
      P00548_A132BarCodReo = new byte[1] ;
      P00548_A130BarCodPar = new String[] {""} ;
      P00548_A201BarPieEst = new byte[1] ;
      P00548_A44AlbRecCod = new int[1] ;
      P00548_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00548_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00548_A170BarKilLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00548_A183BarMetLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00548_A197BarPConTro = new short[1] ;
      P00548_A908PieOriCod = new String[] {""} ;
      P00548_A1271BarPieLzd = new int[1] ;
      P00548_A1501BarPiePie = new int[1] ;
      P00548_A2186BarPieLoc = new String[] {""} ;
      P00548_n2186BarPieLoc = new boolean[] {false} ;
      P00548_A8907PzaB80 = new String[] {""} ;
      P00548_n8907PzaB80 = new boolean[] {false} ;
      P00548_A9795BarPieK1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00548_n9795BarPieK1 = new boolean[] {false} ;
      P00548_A9796BarPieK2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00548_n9796BarPieK2 = new boolean[] {false} ;
      P00548_A9800BarNPes = new byte[1] ;
      P00548_n9800BarNPes = new boolean[] {false} ;
      P00548_A1691BarPieAnc = new short[1] ;
      P00548_n1691BarPieAnc = new boolean[] {false} ;
      P00548_A9846BarPieAncc = new short[1] ;
      P00548_n9846BarPieAncc = new boolean[] {false} ;
      P00548_A9984BarPiePda = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00548_n9984BarPiePda = new boolean[] {false} ;
      P00548_A8707BapieObs = new String[] {""} ;
      P00548_n8707BapieObs = new boolean[] {false} ;
      P00548_A8838CodBarPz = new String[] {""} ;
      P00548_n8838CodBarPz = new boolean[] {false} ;
      P00548_A200BarPieCod = new String[] {""} ;
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
      AV96BarPieCod = "" ;
      AV100BarPieKil = DecimalUtil.ZERO ;
      AV103BarPieMet = DecimalUtil.ZERO ;
      AV68BarKilLan = DecimalUtil.ZERO ;
      AV76BarMetLan = DecimalUtil.ZERO ;
      AV176PieOriCod = "" ;
      AV101BarPieLoc = "" ;
      AV180pzab80 = "" ;
      AV98BarPiek1 = DecimalUtil.ZERO ;
      AV99barPieK2 = DecimalUtil.ZERO ;
      AV105BarPiePda = DecimalUtil.ZERO ;
      AV17BaPieobs = "" ;
      AV141CodBarpz = "" ;
      GXv_int24 = new byte[1] ;
      GXv_char44 = new String[1] ;
      GXv_decimal34 = new java.math.BigDecimal[1] ;
      GXv_decimal33 = new java.math.BigDecimal[1] ;
      GXv_int23 = new byte[1] ;
      GXv_decimal32 = new java.math.BigDecimal[1] ;
      GXv_decimal31 = new java.math.BigDecimal[1] ;
      GXv_int21 = new short[1] ;
      GXv_char41 = new String[1] ;
      GXv_int9 = new int[1] ;
      GXv_int8 = new int[1] ;
      GXv_char40 = new String[1] ;
      GXv_char39 = new String[1] ;
      GXv_decimal28 = new java.math.BigDecimal[1] ;
      GXv_decimal15 = new java.math.BigDecimal[1] ;
      GXv_int22 = new byte[1] ;
      GXv_int20 = new short[1] ;
      GXv_int17 = new short[1] ;
      GXv_decimal14 = new java.math.BigDecimal[1] ;
      GXv_char38 = new String[1] ;
      GXv_char36 = new String[1] ;
      A1141DisBarPar = "" ;
      Gx_emsg = "" ;
      P005411_A130BarCodPar = new String[] {""} ;
      P005411_A132BarCodReo = new byte[1] ;
      P005411_A129BarCod = new int[1] ;
      P005411_A396EmprCod = new String[] {""} ;
      P005411_A138BarConReo = new byte[1] ;
      P005411_A1878BarNumTen = new String[] {""} ;
      A1878BarNumTen = "" ;
      AV82BarNumTen = "" ;
      GXv_char46 = new String[1] ;
      GXv_int13 = new int[1] ;
      GXv_int11 = new int[1] ;
      GXv_char45 = new String[1] ;
      P005413_A252CliCod = new int[1] ;
      P005413_n252CliCod = new boolean[] {false} ;
      P005413_A966PartCod = new String[] {""} ;
      P005413_n966PartCod = new boolean[] {false} ;
      P005413_A396EmprCod = new String[] {""} ;
      P005413_A972PartULin = new int[1] ;
      P005413_n972PartULin = new boolean[] {false} ;
      P005414_A396EmprCod = new String[] {""} ;
      P005414_A966PartCod = new String[] {""} ;
      P005414_n966PartCod = new boolean[] {false} ;
      P005414_A252CliCod = new int[1] ;
      P005414_n252CliCod = new boolean[] {false} ;
      P005414_A979PartLin = new int[1] ;
      P005415_A396EmprCod = new String[] {""} ;
      P005415_A966PartCod = new String[] {""} ;
      P005415_n966PartCod = new boolean[] {false} ;
      P005415_A252CliCod = new int[1] ;
      P005415_n252CliCod = new boolean[] {false} ;
      P005415_A982PartSitDis = new String[] {""} ;
      P005415_n982PartSitDis = new boolean[] {false} ;
      P005415_A981PartAlbDis = new int[1] ;
      P005415_n981PartAlbDis = new boolean[] {false} ;
      P005415_A979PartLin = new int[1] ;
      P005415_A10263PartFm = new java.util.Date[] {GXutil.nullDate()} ;
      P005415_n10263PartFm = new boolean[] {false} ;
      P005415_A10262PartTrz = new String[] {""} ;
      P005415_n10262PartTrz = new boolean[] {false} ;
      P005415_A10261PartHhEv = new java.util.Date[] {GXutil.nullDate()} ;
      P005415_n10261PartHhEv = new boolean[] {false} ;
      P005415_A10260PartFcEv = new java.util.Date[] {GXutil.nullDate()} ;
      P005415_n10260PartFcEv = new boolean[] {false} ;
      P005415_A10259PartSts = new byte[1] ;
      P005415_n10259PartSts = new boolean[] {false} ;
      P005415_A5916PartTarPal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P005415_n5916PartTarPal = new boolean[] {false} ;
      P005415_A5915PartTarCja = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P005415_n5915PartTarCja = new boolean[] {false} ;
      P005415_A5914PartCja = new int[1] ;
      P005415_n5914PartCja = new boolean[] {false} ;
      P005415_A5913PartPalEst = new String[] {""} ;
      P005415_n5913PartPalEst = new boolean[] {false} ;
      P005415_A5912PartPalUti = new String[] {""} ;
      P005415_n5912PartPalUti = new boolean[] {false} ;
      P005415_A5878PartLinUni = new String[] {""} ;
      P005415_n5878PartLinUni = new boolean[] {false} ;
      P005415_A2377ParExtLin = new short[1] ;
      P005415_n2377ParExtLin = new boolean[] {false} ;
      P005415_A2246ParNumCli = new String[] {""} ;
      P005415_n2246ParNumCli = new boolean[] {false} ;
      P005415_A1157TipConCod = new short[1] ;
      P005415_n1157TipConCod = new boolean[] {false} ;
      P005415_A2024ParPorAgu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P005415_n2024ParPorAgu = new boolean[] {false} ;
      P005415_A2023PartDm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P005415_n2023PartDm = new boolean[] {false} ;
      P005415_A2022PartPesCo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P005415_n2022PartPesCo = new boolean[] {false} ;
      P005415_A1967ConRes = new short[1] ;
      P005415_n1967ConRes = new boolean[] {false} ;
      P005415_A1966KilRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P005415_n1966KilRes = new boolean[] {false} ;
      P005415_A1877PartLoc = new String[] {""} ;
      P005415_n1877PartLoc = new boolean[] {false} ;
      P005415_A987ConUti = new short[1] ;
      P005415_n987ConUti = new boolean[] {false} ;
      P005415_A986KilUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P005415_n986KilUti = new boolean[] {false} ;
      P005415_A985ConEnt = new short[1] ;
      P005415_n985ConEnt = new boolean[] {false} ;
      P005415_A984KilEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P005415_n984KilEnt = new boolean[] {false} ;
      P005415_A983PartFecMov = new java.util.Date[] {GXutil.nullDate()} ;
      P005415_n983PartFecMov = new boolean[] {false} ;
      P005415_A840TrnCod = new short[1] ;
      P005415_n840TrnCod = new boolean[] {false} ;
      P005415_A980PartLinTip = new String[] {""} ;
      P005415_n980PartLinTip = new boolean[] {false} ;
      A982PartSitDis = "" ;
      A10263PartFm = GXutil.nullDate() ;
      A10262PartTrz = "" ;
      A10261PartHhEv = GXutil.resetTime( GXutil.nullDate() );
      A10260PartFcEv = GXutil.nullDate() ;
      A5916PartTarPal = DecimalUtil.ZERO ;
      A5915PartTarCja = DecimalUtil.ZERO ;
      A5913PartPalEst = "" ;
      A5912PartPalUti = "" ;
      A5878PartLinUni = "" ;
      A2246ParNumCli = "" ;
      A2024ParPorAgu = DecimalUtil.ZERO ;
      A2023PartDm = DecimalUtil.ZERO ;
      A2022PartPesCo = DecimalUtil.ZERO ;
      A1966KilRes = DecimalUtil.ZERO ;
      A1877PartLoc = "" ;
      A986KilUti = DecimalUtil.ZERO ;
      A984KilEnt = DecimalUtil.ZERO ;
      A983PartFecMov = GXutil.nullDate() ;
      A980PartLinTip = "" ;
      W982PartSitDis = "" ;
      P005419_A396EmprCod = new String[] {""} ;
      P005419_A6967Mat_Hdp = new String[] {""} ;
      P005419_A6966Mat_Hdr = new byte[1] ;
      P005419_A6965Mat_Hd = new int[1] ;
      P005419_A7397Mat_FecIng = new java.util.Date[] {GXutil.nullDate()} ;
      P005419_n7397Mat_FecIng = new boolean[] {false} ;
      P005419_A7396Mat_HdKPr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P005419_n7396Mat_HdKPr = new boolean[] {false} ;
      P005419_A6971Mat_Pzas = new int[1] ;
      P005419_n6971Mat_Pzas = new boolean[] {false} ;
      P005419_A6970Mat_HdGuia = new String[] {""} ;
      P005419_n6970Mat_HdGuia = new boolean[] {false} ;
      P005419_A6969Mat_HdKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P005419_n6969Mat_HdKgs = new boolean[] {false} ;
      P005419_A6968Mat_HdUl = new short[1] ;
      P005419_n6968Mat_HdUl = new boolean[] {false} ;
      A6967Mat_Hdp = "" ;
      A7397Mat_FecIng = GXutil.nullDate() ;
      A7396Mat_HdKPr = DecimalUtil.ZERO ;
      A6970Mat_HdGuia = "" ;
      A6969Mat_HdKgs = DecimalUtil.ZERO ;
      W396EmprCod = "" ;
      W6967Mat_Hdp = "" ;
      P005421_A6981Mat_HdObs = new String[] {""} ;
      P005421_n6981Mat_HdObs = new boolean[] {false} ;
      P005421_A396EmprCod = new String[] {""} ;
      P005421_A6967Mat_Hdp = new String[] {""} ;
      P005421_A6966Mat_Hdr = new byte[1] ;
      P005421_A6965Mat_Hd = new int[1] ;
      P005421_A7238Mat_RecM = new int[1] ;
      P005421_n7238Mat_RecM = new boolean[] {false} ;
      P005421_A7108Mat_TraInt = new long[1] ;
      P005421_n7108Mat_TraInt = new boolean[] {false} ;
      P005421_A7107Mat_CliRm = new String[] {""} ;
      P005421_n7107Mat_CliRm = new boolean[] {false} ;
      P005421_A7106Mat_MaqTej = new String[] {""} ;
      P005421_n7106Mat_MaqTej = new boolean[] {false} ;
      P005421_A6980Mat_HdLm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P005421_n6980Mat_HdLm = new boolean[] {false} ;
      P005421_A6979Mat_HdPorc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P005421_n6979Mat_HdPorc = new boolean[] {false} ;
      P005421_A6978Mat_HdLote = new String[] {""} ;
      P005421_n6978Mat_HdLote = new boolean[] {false} ;
      P005421_A6977Mat_HdProv = new String[] {""} ;
      P005421_n6977Mat_HdProv = new boolean[] {false} ;
      P005421_A6976Mat_HdNomc = new String[] {""} ;
      P005421_n6976Mat_HdNomc = new boolean[] {false} ;
      P005421_A6975Mat_HdTor = new String[] {""} ;
      P005421_n6975Mat_HdTor = new boolean[] {false} ;
      P005421_A6974Mat_HdMat = new String[] {""} ;
      P005421_n6974Mat_HdMat = new boolean[] {false} ;
      P005421_A6973Mat_HdEst = new String[] {""} ;
      P005421_n6973Mat_HdEst = new boolean[] {false} ;
      P005421_A6972Mat_HdLin = new short[1] ;
      A6981Mat_HdObs = "" ;
      A7107Mat_CliRm = "" ;
      A7106Mat_MaqTej = "" ;
      A6980Mat_HdLm = DecimalUtil.ZERO ;
      A6979Mat_HdPorc = DecimalUtil.ZERO ;
      A6978Mat_HdLote = "" ;
      A6977Mat_HdProv = "" ;
      A6976Mat_HdNomc = "" ;
      A6975Mat_HdTor = "" ;
      A6974Mat_HdMat = "" ;
      A6973Mat_HdEst = "" ;
      P005423_A396EmprCod = new String[] {""} ;
      P005423_A6967Mat_Hdp = new String[] {""} ;
      P005423_A6966Mat_Hdr = new byte[1] ;
      P005423_A6965Mat_Hd = new int[1] ;
      P005423_A7239Mat_RecT = new int[1] ;
      P005423_n7239Mat_RecT = new boolean[] {false} ;
      P005423_A8049Mat_HdKgTl = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P005423_n8049Mat_HdKgTl = new boolean[] {false} ;
      P005423_A7008Mat_HdUnTl = new int[1] ;
      P005423_n7008Mat_HdUnTl = new boolean[] {false} ;
      P005423_A7007Mat_HdTl = new String[] {""} ;
      A8049Mat_HdKgTl = DecimalUtil.ZERO ;
      A7007Mat_HdTl = "" ;
      W7007Mat_HdTl = "" ;
      P005425_A396EmprCod = new String[] {""} ;
      P005425_A6967Mat_Hdp = new String[] {""} ;
      P005425_A6966Mat_Hdr = new byte[1] ;
      P005425_A6965Mat_Hd = new int[1] ;
      P005425_A7109Mat_Numcr = new long[1] ;
      P005425_n7109Mat_Numcr = new boolean[] {false} ;
      P005425_A6985Mat_HdKgP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P005425_n6985Mat_HdKgP = new boolean[] {false} ;
      P005425_A6984Mat_HdCPz = new String[] {""} ;
      A6985Mat_HdKgP = DecimalUtil.ZERO ;
      A6984Mat_HdCPz = "" ;
      W6984Mat_HdCPz = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbarreo__default(),
         new Object[] {
             new Object[] {
            P00542_A396EmprCod, P00542_A130BarCodPar, P00542_A132BarCodReo, P00542_A129BarCod, P00542_A138BarConReo
            }
            , new Object[] {
            P00544_A396EmprCod, P00544_A365DisDes, P00544_A130BarCodPar, P00544_A132BarCodReo, P00544_A129BarCod, P00544_A966PartCod, P00544_n966PartCod, P00544_A252CliCod, P00544_n252CliCod, P00544_A361DisCod,
            P00544_A5253BarAcc, P00544_A2010BarTipDis, P00544_A213BarSit, P00544_A189BarNumAny, P00544_A137BarConPar, P00544_A141BarCosPro, P00544_A140BarCosAny, P00544_A161BarFecSal, P00544_A5026BarTipEst, P00544_A898BarPieNDes,
            P00544_n898BarPieNDes
            }
            , new Object[] {
            P00545_A396EmprCod, P00545_A129BarCod, P00545_A132BarCodReo, P00545_A130BarCodPar, P00545_A758ProCod, P00545_A761ProFasLin, P00545_n761ProFasLin
            }
            , new Object[] {
            P00546_A396EmprCod, P00546_A129BarCod, P00546_A132BarCodReo, P00546_A130BarCodPar, P00546_A758ProCod, P00546_A194BarOrdLin, P00546_A457FasCod, P00546_A153BarFasEst, P00546_A162BarFecTeo, P00546_A160BarFecRea,
            P00546_A216BarTieTeo, P00546_A227BarUni, P00546_A179BarLoc, P00546_A165BarHorIni, P00546_A164BarHorFin, P00546_A215BarTieRea, P00546_A603MaqCodBis, P00546_A152BarFasCon, P00546_A150BarFacTin, P00546_A3298BarFecRIni,
            P00546_A4022BarNumBot, P00546_A5719BarFasKgT, P00546_n5719BarFasKgT, P00546_A5720BarFasMtT, P00546_n5720BarFasMtT, P00546_A3837BarFasKgm, P00546_n3837BarFasKgm, P00546_A3838BarFasMtr, P00546_n3838BarFasMtr, P00546_A4301BarFasCoP,
            P00546_A4905BarFasAcab, P00546_A5047BarFasFPl, P00546_n5047BarFasFPl, P00546_A5048BarFasUsu, P00546_n5048BarFasUsu, P00546_A5369BarFasGral, P00546_n5369BarFasGral, P00546_A5896BarMaqPlan, P00546_n5896BarMaqPlan, P00546_A4287BarFasFor,
            P00546_A4442BarFasDTI, P00546_n4442BarFasDTI, P00546_A4443BarFasDTF, P00546_n4443BarFasDTF, P00546_A9842BarObsF, P00546_n9842BarObsF, P00546_A10032BarObsB, P00546_n10032BarObsB
            }
            , new Object[] {
            P00547_A396EmprCod, P00547_A129BarCod, P00547_A132BarCodReo, P00547_A130BarCodPar, P00547_A758ProCod, P00547_A194BarOrdLin, P00547_A1664ParFasCod
            }
            , new Object[] {
            P00548_A396EmprCod, P00548_A129BarCod, P00548_A132BarCodReo, P00548_A130BarCodPar, P00548_A201BarPieEst, P00548_A44AlbRecCod, P00548_A203BarPieKil, P00548_A205BarPieMet, P00548_A170BarKilLan, P00548_A183BarMetLan,
            P00548_A197BarPConTro, P00548_A908PieOriCod, P00548_A1271BarPieLzd, P00548_A1501BarPiePie, P00548_A2186BarPieLoc, P00548_n2186BarPieLoc, P00548_A8907PzaB80, P00548_n8907PzaB80, P00548_A9795BarPieK1, P00548_n9795BarPieK1,
            P00548_A9796BarPieK2, P00548_n9796BarPieK2, P00548_A9800BarNPes, P00548_n9800BarNPes, P00548_A1691BarPieAnc, P00548_n1691BarPieAnc, P00548_A9846BarPieAncc, P00548_n9846BarPieAncc, P00548_A9984BarPiePda, P00548_n9984BarPiePda,
            P00548_A8707BapieObs, P00548_n8707BapieObs, P00548_A8838CodBarPz, P00548_n8838CodBarPz, P00548_A200BarPieCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P005411_A130BarCodPar, P005411_A132BarCodReo, P005411_A129BarCod, P005411_A396EmprCod, P005411_A138BarConReo, P005411_A1878BarNumTen
            }
            , new Object[] {
            }
            , new Object[] {
            P005413_A252CliCod, P005413_A966PartCod, P005413_A396EmprCod, P005413_A972PartULin, P005413_n972PartULin
            }
            , new Object[] {
            P005414_A396EmprCod, P005414_A966PartCod, P005414_A252CliCod, P005414_A979PartLin
            }
            , new Object[] {
            P005415_A396EmprCod, P005415_A966PartCod, P005415_A252CliCod, P005415_A982PartSitDis, P005415_n982PartSitDis, P005415_A981PartAlbDis, P005415_n981PartAlbDis, P005415_A979PartLin, P005415_A10263PartFm, P005415_n10263PartFm,
            P005415_A10262PartTrz, P005415_n10262PartTrz, P005415_A10261PartHhEv, P005415_n10261PartHhEv, P005415_A10260PartFcEv, P005415_n10260PartFcEv, P005415_A10259PartSts, P005415_n10259PartSts, P005415_A5916PartTarPal, P005415_n5916PartTarPal,
            P005415_A5915PartTarCja, P005415_n5915PartTarCja, P005415_A5914PartCja, P005415_n5914PartCja, P005415_A5913PartPalEst, P005415_n5913PartPalEst, P005415_A5912PartPalUti, P005415_n5912PartPalUti, P005415_A5878PartLinUni, P005415_n5878PartLinUni,
            P005415_A2377ParExtLin, P005415_n2377ParExtLin, P005415_A2246ParNumCli, P005415_n2246ParNumCli, P005415_A1157TipConCod, P005415_n1157TipConCod, P005415_A2024ParPorAgu, P005415_n2024ParPorAgu, P005415_A2023PartDm, P005415_n2023PartDm,
            P005415_A2022PartPesCo, P005415_n2022PartPesCo, P005415_A1967ConRes, P005415_n1967ConRes, P005415_A1966KilRes, P005415_n1966KilRes, P005415_A1877PartLoc, P005415_n1877PartLoc, P005415_A987ConUti, P005415_n987ConUti,
            P005415_A986KilUti, P005415_n986KilUti, P005415_A985ConEnt, P005415_n985ConEnt, P005415_A984KilEnt, P005415_n984KilEnt, P005415_A983PartFecMov, P005415_n983PartFecMov, P005415_A840TrnCod, P005415_n840TrnCod,
            P005415_A980PartLinTip, P005415_n980PartLinTip
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P005419_A396EmprCod, P005419_A6967Mat_Hdp, P005419_A6966Mat_Hdr, P005419_A6965Mat_Hd, P005419_A7397Mat_FecIng, P005419_n7397Mat_FecIng, P005419_A7396Mat_HdKPr, P005419_n7396Mat_HdKPr, P005419_A6971Mat_Pzas, P005419_n6971Mat_Pzas,
            P005419_A6970Mat_HdGuia, P005419_n6970Mat_HdGuia, P005419_A6969Mat_HdKgs, P005419_n6969Mat_HdKgs, P005419_A6968Mat_HdUl, P005419_n6968Mat_HdUl
            }
            , new Object[] {
            }
            , new Object[] {
            P005421_A6981Mat_HdObs, P005421_n6981Mat_HdObs, P005421_A396EmprCod, P005421_A6967Mat_Hdp, P005421_A6966Mat_Hdr, P005421_A6965Mat_Hd, P005421_A7238Mat_RecM, P005421_n7238Mat_RecM, P005421_A7108Mat_TraInt, P005421_n7108Mat_TraInt,
            P005421_A7107Mat_CliRm, P005421_n7107Mat_CliRm, P005421_A7106Mat_MaqTej, P005421_n7106Mat_MaqTej, P005421_A6980Mat_HdLm, P005421_n6980Mat_HdLm, P005421_A6979Mat_HdPorc, P005421_n6979Mat_HdPorc, P005421_A6978Mat_HdLote, P005421_n6978Mat_HdLote,
            P005421_A6977Mat_HdProv, P005421_n6977Mat_HdProv, P005421_A6976Mat_HdNomc, P005421_n6976Mat_HdNomc, P005421_A6975Mat_HdTor, P005421_n6975Mat_HdTor, P005421_A6974Mat_HdMat, P005421_n6974Mat_HdMat, P005421_A6973Mat_HdEst, P005421_n6973Mat_HdEst,
            P005421_A6972Mat_HdLin
            }
            , new Object[] {
            }
            , new Object[] {
            P005423_A396EmprCod, P005423_A6967Mat_Hdp, P005423_A6966Mat_Hdr, P005423_A6965Mat_Hd, P005423_A7239Mat_RecT, P005423_n7239Mat_RecT, P005423_A8049Mat_HdKgTl, P005423_n8049Mat_HdKgTl, P005423_A7008Mat_HdUnTl, P005423_n7008Mat_HdUnTl,
            P005423_A7007Mat_HdTl
            }
            , new Object[] {
            }
            , new Object[] {
            P005425_A396EmprCod, P005425_A6967Mat_Hdp, P005425_A6966Mat_Hdr, P005425_A6965Mat_Hd, P005425_A7109Mat_Numcr, P005425_n7109Mat_Numcr, P005425_A6985Mat_HdKgP, P005425_n6985Mat_HdKgP, P005425_A6984Mat_HdCPz
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      AV197Pgmname = "PBARREO" ;
      /* GeneXus formulas. */
      AV197Pgmname = "PBARREO" ;
      Gx_err = (short)(0) ;
   }

   private byte AV112BarReoOri ;
   private byte AV116BarSit ;
   private byte AV32BarConReo ;
   private byte AV157FlagHil ;
   private byte AV156FlagBros ;
   private byte AV175Pervaf ;
   private byte AV16Artextil ;
   private byte AV163Jpf ;
   private byte AV162JBMartin ;
   private byte AV165Lindalana ;
   private byte AV186Texfina ;
   private byte AV193Vertex ;
   private byte AV190Torient ;
   private byte AV181PzasLector ;
   private byte AV160Indutexma ;
   private byte AV168Martex ;
   private byte GXt_int6 ;
   private byte AV25Barcad ;
   private byte A132BarCodReo ;
   private byte A138BarConReo ;
   private byte AV143ContadorReope ;
   private byte A213BarSit ;
   private byte A5026BarTipEst ;
   private byte AV155filasur ;
   private byte AV184Situa ;
   private byte AV183Sit2 ;
   private byte GXv_int5[] ;
   private byte GXv_int10[] ;
   private byte GXv_int12[] ;
   private byte A153BarFasEst ;
   private byte AV47BarFasEst ;
   private byte A201BarPieEst ;
   private byte A9800BarNPes ;
   private byte AV97BarPieEst ;
   private byte AV78BarNpes ;
   private byte GXv_int24[] ;
   private byte GXv_int23[] ;
   private byte GXv_int22[] ;
   private byte A1140DisBarReo ;
   private byte A10259PartSts ;
   private byte A6966Mat_Hdr ;
   private byte W6966Mat_Hdr ;
   private short AV188TipDefCod ;
   private short AV189TipDefPor ;
   private short A189BarNumAny ;
   private short AV79BarNumAny ;
   private short A761ProFasLin ;
   private short AV179ProFasLin ;
   private short A194BarOrdLin ;
   private short A165BarHorIni ;
   private short A164BarHorFin ;
   private short AV86BarOrdLin ;
   private short AV66BarHorIni ;
   private short AV65BarHorFin ;
   private short A1664ParFasCod ;
   private short AV172ParFasCod ;
   private short A197BarPConTro ;
   private short A1691BarPieAnc ;
   private short A9846BarPieAncc ;
   private short AV90BarPConTro ;
   private short AV94BarPieanc ;
   private short AV95BarPieAncc ;
   private short GXv_int21[] ;
   private short GXv_int20[] ;
   private short GXv_int17[] ;
   private short Gx_err ;
   private short A2377ParExtLin ;
   private short A1157TipConCod ;
   private short A1967ConRes ;
   private short A987ConUti ;
   private short A985ConEnt ;
   private short A840TrnCod ;
   private short A6968Mat_HdUl ;
   private short A6972Mat_HdLin ;
   private short W6972Mat_HdLin ;
   private int AV27BarCodOri ;
   private int AV26BarCod ;
   private int AV149DisCod ;
   private int AV140CliPropio ;
   private int AV146ConVal ;
   private int GXt_int7 ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A361DisCod ;
   private int A898BarPieNDes ;
   private int AV138CliCod ;
   private int AV151DisOriCod ;
   private int AV145ContPie ;
   private int AV104BarPieNDes ;
   private int AV177PNoDes ;
   private int A4022BarNumBot ;
   private int AV80BarNumBot ;
   private int A44AlbRecCod ;
   private int A1271BarPieLzd ;
   private int A1501BarPiePie ;
   private int AV15AlbRecCod ;
   private int AV102BarPieLzd ;
   private int AV106BarPiePie ;
   private int GXv_int9[] ;
   private int GXv_int8[] ;
   private int GX_INS153 ;
   private int A1146DisDisCod ;
   private int A1139DisBarCod ;
   private int GXv_int13[] ;
   private int GXv_int11[] ;
   private int AV139CliPdo ;
   private int A972PartULin ;
   private int AV174PartLin ;
   private int A979PartLin ;
   private int A981PartAlbDis ;
   private int A5914PartCja ;
   private int GX_INS208 ;
   private int W979PartLin ;
   private int W981PartAlbDis ;
   private int A6965Mat_Hd ;
   private int A6971Mat_Pzas ;
   private int W6965Mat_Hd ;
   private int GX_INS985 ;
   private int A7238Mat_RecM ;
   private int GX_INS986 ;
   private int A7239Mat_RecT ;
   private int A7008Mat_HdUnTl ;
   private int GX_INS1132 ;
   private int GX_INS987 ;
   private long A7108Mat_TraInt ;
   private long A7109Mat_Numcr ;
   private java.math.BigDecimal AV161Intexco ;
   private java.math.BigDecimal A141BarCosPro ;
   private java.math.BigDecimal A140BarCosAny ;
   private java.math.BigDecimal AV148CosPro ;
   private java.math.BigDecimal AV147CosAny ;
   private java.math.BigDecimal A216BarTieTeo ;
   private java.math.BigDecimal A227BarUni ;
   private java.math.BigDecimal A215BarTieRea ;
   private java.math.BigDecimal A5719BarFasKgT ;
   private java.math.BigDecimal A5720BarFasMtT ;
   private java.math.BigDecimal A3837BarFasKgm ;
   private java.math.BigDecimal A3838BarFasMtr ;
   private java.math.BigDecimal AV119BarTieTeo ;
   private java.math.BigDecimal AV129BarUni ;
   private java.math.BigDecimal AV118BarTieRea ;
   private java.math.BigDecimal AV52BarFasKgt ;
   private java.math.BigDecimal AV54BarFasMtt ;
   private java.math.BigDecimal AV51BarFasKgm ;
   private java.math.BigDecimal AV53BarFasMtr ;
   private java.math.BigDecimal AV164KilReo ;
   private java.math.BigDecimal AV169MetReo ;
   private java.math.BigDecimal A203BarPieKil ;
   private java.math.BigDecimal A205BarPieMet ;
   private java.math.BigDecimal A170BarKilLan ;
   private java.math.BigDecimal A183BarMetLan ;
   private java.math.BigDecimal A9795BarPieK1 ;
   private java.math.BigDecimal A9796BarPieK2 ;
   private java.math.BigDecimal A9984BarPiePda ;
   private java.math.BigDecimal AV100BarPieKil ;
   private java.math.BigDecimal AV103BarPieMet ;
   private java.math.BigDecimal AV68BarKilLan ;
   private java.math.BigDecimal AV76BarMetLan ;
   private java.math.BigDecimal AV98BarPiek1 ;
   private java.math.BigDecimal AV99barPieK2 ;
   private java.math.BigDecimal AV105BarPiePda ;
   private java.math.BigDecimal GXv_decimal34[] ;
   private java.math.BigDecimal GXv_decimal33[] ;
   private java.math.BigDecimal GXv_decimal32[] ;
   private java.math.BigDecimal GXv_decimal31[] ;
   private java.math.BigDecimal GXv_decimal28[] ;
   private java.math.BigDecimal GXv_decimal15[] ;
   private java.math.BigDecimal GXv_decimal14[] ;
   private java.math.BigDecimal A5916PartTarPal ;
   private java.math.BigDecimal A5915PartTarCja ;
   private java.math.BigDecimal A2024ParPorAgu ;
   private java.math.BigDecimal A2023PartDm ;
   private java.math.BigDecimal A2022PartPesCo ;
   private java.math.BigDecimal A1966KilRes ;
   private java.math.BigDecimal A986KilUti ;
   private java.math.BigDecimal A984KilEnt ;
   private java.math.BigDecimal A7396Mat_HdKPr ;
   private java.math.BigDecimal A6969Mat_HdKgs ;
   private java.math.BigDecimal A6980Mat_HdLm ;
   private java.math.BigDecimal A6979Mat_HdPorc ;
   private java.math.BigDecimal A8049Mat_HdKgTl ;
   private java.math.BigDecimal A6985Mat_HdKgP ;
   private String A396EmprCod ;
   private String AV88BarParOri ;
   private String AV89BarParPan ;
   private String AV182Reo ;
   private String AV72BarMaqCod ;
   private String AV142Codigo ;
   private String AV185Station ;
   private String AV153EmprNom ;
   private String AV192Usurcod ;
   private String AV144ContDsc ;
   private String GXt_char1 ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String AV158Hdr ;
   private String AV159Hdrd ;
   private String AV197Pgmname ;
   private String A365DisDes ;
   private String A966PartCod ;
   private String A5253BarAcc ;
   private String A2010BarTipDis ;
   private String A137BarConPar ;
   private String AV64BarHdro ;
   private String AV173PartCod ;
   private String AV152EmprCod ;
   private String AV19BarAcc ;
   private String Gx_msg ;
   private String AV150DisDes ;
   private String AV31BarConPar ;
   private String A758ProCod ;
   private String AV178ProCod ;
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
   private String AV154FasCod ;
   private String AV70BarLoc ;
   private String AV166MaqCod ;
   private String AV43BarFasCon ;
   private String AV41BarFacTin ;
   private String AV44BarFascop ;
   private String AV42Barfasacab ;
   private String AV55Barfasusu ;
   private String AV50Barfasgral ;
   private String AV73BarMaqPlan ;
   private String AV48Barfasfor ;
   private String GXv_char19[] ;
   private String GXv_char18[] ;
   private String GXv_char16[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char29[] ;
   private String GXv_char30[] ;
   private String GXv_char35[] ;
   private String A908PieOriCod ;
   private String A2186BarPieLoc ;
   private String A8907PzaB80 ;
   private String A8707BapieObs ;
   private String A8838CodBarPz ;
   private String A200BarPieCod ;
   private String AV96BarPieCod ;
   private String AV176PieOriCod ;
   private String AV101BarPieLoc ;
   private String AV180pzab80 ;
   private String AV17BaPieobs ;
   private String AV141CodBarpz ;
   private String GXv_char44[] ;
   private String GXv_char41[] ;
   private String GXv_char40[] ;
   private String GXv_char39[] ;
   private String GXv_char38[] ;
   private String GXv_char36[] ;
   private String A1141DisBarPar ;
   private String Gx_emsg ;
   private String A1878BarNumTen ;
   private String AV82BarNumTen ;
   private String GXv_char46[] ;
   private String GXv_char45[] ;
   private String A982PartSitDis ;
   private String A10262PartTrz ;
   private String A5913PartPalEst ;
   private String A5912PartPalUti ;
   private String A5878PartLinUni ;
   private String A2246ParNumCli ;
   private String A1877PartLoc ;
   private String A980PartLinTip ;
   private String W982PartSitDis ;
   private String A6967Mat_Hdp ;
   private String A6970Mat_HdGuia ;
   private String W396EmprCod ;
   private String W6967Mat_Hdp ;
   private String A7107Mat_CliRm ;
   private String A7106Mat_MaqTej ;
   private String A6978Mat_HdLote ;
   private String A6977Mat_HdProv ;
   private String A6976Mat_HdNomc ;
   private String A6975Mat_HdTor ;
   private String A6974Mat_HdMat ;
   private String A6973Mat_HdEst ;
   private String A7007Mat_HdTl ;
   private String W7007Mat_HdTl ;
   private String A6984Mat_HdCPz ;
   private String W6984Mat_HdCPz ;
   private java.util.Date A4442BarFasDTI ;
   private java.util.Date A4443BarFasDTF ;
   private java.util.Date AV46Barfasdti ;
   private java.util.Date AV45Barfasdtf ;
   private java.util.Date GXv_dtime42[] ;
   private java.util.Date GXv_dtime43[] ;
   private java.util.Date A10261PartHhEv ;
   private java.util.Date A161BarFecSal ;
   private java.util.Date A162BarFecTeo ;
   private java.util.Date A160BarFecRea ;
   private java.util.Date A3298BarFecRIni ;
   private java.util.Date A5047BarFasFPl ;
   private java.util.Date AV62BarFecTeo ;
   private java.util.Date AV60BarFecRea ;
   private java.util.Date AV61BarFecRIni ;
   private java.util.Date AV49Barfasfpl ;
   private java.util.Date GXv_date25[] ;
   private java.util.Date GXv_date26[] ;
   private java.util.Date GXv_date27[] ;
   private java.util.Date GXv_date37[] ;
   private java.util.Date A10263PartFm ;
   private java.util.Date A10260PartFcEv ;
   private java.util.Date A983PartFecMov ;
   private java.util.Date A7397Mat_FecIng ;
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
   private boolean n972PartULin ;
   private boolean n982PartSitDis ;
   private boolean n981PartAlbDis ;
   private boolean n10263PartFm ;
   private boolean n10262PartTrz ;
   private boolean n10261PartHhEv ;
   private boolean n10260PartFcEv ;
   private boolean n10259PartSts ;
   private boolean n5916PartTarPal ;
   private boolean n5915PartTarCja ;
   private boolean n5914PartCja ;
   private boolean n5913PartPalEst ;
   private boolean n5912PartPalUti ;
   private boolean n5878PartLinUni ;
   private boolean n2377ParExtLin ;
   private boolean n2246ParNumCli ;
   private boolean n1157TipConCod ;
   private boolean n2024ParPorAgu ;
   private boolean n2023PartDm ;
   private boolean n2022PartPesCo ;
   private boolean n1967ConRes ;
   private boolean n1966KilRes ;
   private boolean n1877PartLoc ;
   private boolean n987ConUti ;
   private boolean n986KilUti ;
   private boolean n985ConEnt ;
   private boolean n984KilEnt ;
   private boolean n983PartFecMov ;
   private boolean n840TrnCod ;
   private boolean n980PartLinTip ;
   private boolean n7397Mat_FecIng ;
   private boolean n7396Mat_HdKPr ;
   private boolean n6971Mat_Pzas ;
   private boolean n6970Mat_HdGuia ;
   private boolean n6969Mat_HdKgs ;
   private boolean n6968Mat_HdUl ;
   private boolean n6981Mat_HdObs ;
   private boolean n7238Mat_RecM ;
   private boolean n7108Mat_TraInt ;
   private boolean n7107Mat_CliRm ;
   private boolean n7106Mat_MaqTej ;
   private boolean n6980Mat_HdLm ;
   private boolean n6979Mat_HdPorc ;
   private boolean n6978Mat_HdLote ;
   private boolean n6977Mat_HdProv ;
   private boolean n6976Mat_HdNomc ;
   private boolean n6975Mat_HdTor ;
   private boolean n6974Mat_HdMat ;
   private boolean n6973Mat_HdEst ;
   private boolean n7239Mat_RecT ;
   private boolean n8049Mat_HdKgTl ;
   private boolean n7008Mat_HdUnTl ;
   private boolean n7109Mat_Numcr ;
   private boolean n6985Mat_HdKgP ;
   private String A6981Mat_HdObs ;
   private String AV187Texto_i ;
   private String A9842BarObsF ;
   private String A10032BarObsB ;
   private String AV85BarObsf ;
   private String AV84BarObsB ;
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
   private String[] P00542_A396EmprCod ;
   private String[] P00542_A130BarCodPar ;
   private byte[] P00542_A132BarCodReo ;
   private int[] P00542_A129BarCod ;
   private byte[] P00542_A138BarConReo ;
   private String[] P00544_A396EmprCod ;
   private String[] P00544_A365DisDes ;
   private String[] P00544_A130BarCodPar ;
   private byte[] P00544_A132BarCodReo ;
   private int[] P00544_A129BarCod ;
   private String[] P00544_A966PartCod ;
   private boolean[] P00544_n966PartCod ;
   private int[] P00544_A252CliCod ;
   private boolean[] P00544_n252CliCod ;
   private int[] P00544_A361DisCod ;
   private String[] P00544_A5253BarAcc ;
   private String[] P00544_A2010BarTipDis ;
   private byte[] P00544_A213BarSit ;
   private short[] P00544_A189BarNumAny ;
   private String[] P00544_A137BarConPar ;
   private java.math.BigDecimal[] P00544_A141BarCosPro ;
   private java.math.BigDecimal[] P00544_A140BarCosAny ;
   private java.util.Date[] P00544_A161BarFecSal ;
   private byte[] P00544_A5026BarTipEst ;
   private int[] P00544_A898BarPieNDes ;
   private boolean[] P00544_n898BarPieNDes ;
   private String[] P00545_A396EmprCod ;
   private int[] P00545_A129BarCod ;
   private byte[] P00545_A132BarCodReo ;
   private String[] P00545_A130BarCodPar ;
   private String[] P00545_A758ProCod ;
   private short[] P00545_A761ProFasLin ;
   private boolean[] P00545_n761ProFasLin ;
   private String[] P00546_A396EmprCod ;
   private int[] P00546_A129BarCod ;
   private byte[] P00546_A132BarCodReo ;
   private String[] P00546_A130BarCodPar ;
   private String[] P00546_A758ProCod ;
   private short[] P00546_A194BarOrdLin ;
   private String[] P00546_A457FasCod ;
   private byte[] P00546_A153BarFasEst ;
   private java.util.Date[] P00546_A162BarFecTeo ;
   private java.util.Date[] P00546_A160BarFecRea ;
   private java.math.BigDecimal[] P00546_A216BarTieTeo ;
   private java.math.BigDecimal[] P00546_A227BarUni ;
   private String[] P00546_A179BarLoc ;
   private short[] P00546_A165BarHorIni ;
   private short[] P00546_A164BarHorFin ;
   private java.math.BigDecimal[] P00546_A215BarTieRea ;
   private String[] P00546_A603MaqCodBis ;
   private String[] P00546_A152BarFasCon ;
   private String[] P00546_A150BarFacTin ;
   private java.util.Date[] P00546_A3298BarFecRIni ;
   private int[] P00546_A4022BarNumBot ;
   private java.math.BigDecimal[] P00546_A5719BarFasKgT ;
   private boolean[] P00546_n5719BarFasKgT ;
   private java.math.BigDecimal[] P00546_A5720BarFasMtT ;
   private boolean[] P00546_n5720BarFasMtT ;
   private java.math.BigDecimal[] P00546_A3837BarFasKgm ;
   private boolean[] P00546_n3837BarFasKgm ;
   private java.math.BigDecimal[] P00546_A3838BarFasMtr ;
   private boolean[] P00546_n3838BarFasMtr ;
   private String[] P00546_A4301BarFasCoP ;
   private String[] P00546_A4905BarFasAcab ;
   private java.util.Date[] P00546_A5047BarFasFPl ;
   private boolean[] P00546_n5047BarFasFPl ;
   private String[] P00546_A5048BarFasUsu ;
   private boolean[] P00546_n5048BarFasUsu ;
   private String[] P00546_A5369BarFasGral ;
   private boolean[] P00546_n5369BarFasGral ;
   private String[] P00546_A5896BarMaqPlan ;
   private boolean[] P00546_n5896BarMaqPlan ;
   private String[] P00546_A4287BarFasFor ;
   private java.util.Date[] P00546_A4442BarFasDTI ;
   private boolean[] P00546_n4442BarFasDTI ;
   private java.util.Date[] P00546_A4443BarFasDTF ;
   private boolean[] P00546_n4443BarFasDTF ;
   private String[] P00546_A9842BarObsF ;
   private boolean[] P00546_n9842BarObsF ;
   private String[] P00546_A10032BarObsB ;
   private boolean[] P00546_n10032BarObsB ;
   private String[] P00547_A396EmprCod ;
   private int[] P00547_A129BarCod ;
   private byte[] P00547_A132BarCodReo ;
   private String[] P00547_A130BarCodPar ;
   private String[] P00547_A758ProCod ;
   private short[] P00547_A194BarOrdLin ;
   private short[] P00547_A1664ParFasCod ;
   private String[] P00548_A396EmprCod ;
   private int[] P00548_A129BarCod ;
   private byte[] P00548_A132BarCodReo ;
   private String[] P00548_A130BarCodPar ;
   private byte[] P00548_A201BarPieEst ;
   private int[] P00548_A44AlbRecCod ;
   private java.math.BigDecimal[] P00548_A203BarPieKil ;
   private java.math.BigDecimal[] P00548_A205BarPieMet ;
   private java.math.BigDecimal[] P00548_A170BarKilLan ;
   private java.math.BigDecimal[] P00548_A183BarMetLan ;
   private short[] P00548_A197BarPConTro ;
   private String[] P00548_A908PieOriCod ;
   private int[] P00548_A1271BarPieLzd ;
   private int[] P00548_A1501BarPiePie ;
   private String[] P00548_A2186BarPieLoc ;
   private boolean[] P00548_n2186BarPieLoc ;
   private String[] P00548_A8907PzaB80 ;
   private boolean[] P00548_n8907PzaB80 ;
   private java.math.BigDecimal[] P00548_A9795BarPieK1 ;
   private boolean[] P00548_n9795BarPieK1 ;
   private java.math.BigDecimal[] P00548_A9796BarPieK2 ;
   private boolean[] P00548_n9796BarPieK2 ;
   private byte[] P00548_A9800BarNPes ;
   private boolean[] P00548_n9800BarNPes ;
   private short[] P00548_A1691BarPieAnc ;
   private boolean[] P00548_n1691BarPieAnc ;
   private short[] P00548_A9846BarPieAncc ;
   private boolean[] P00548_n9846BarPieAncc ;
   private java.math.BigDecimal[] P00548_A9984BarPiePda ;
   private boolean[] P00548_n9984BarPiePda ;
   private String[] P00548_A8707BapieObs ;
   private boolean[] P00548_n8707BapieObs ;
   private String[] P00548_A8838CodBarPz ;
   private boolean[] P00548_n8838CodBarPz ;
   private String[] P00548_A200BarPieCod ;
   private String[] P005411_A130BarCodPar ;
   private byte[] P005411_A132BarCodReo ;
   private int[] P005411_A129BarCod ;
   private String[] P005411_A396EmprCod ;
   private byte[] P005411_A138BarConReo ;
   private String[] P005411_A1878BarNumTen ;
   private int[] P005413_A252CliCod ;
   private boolean[] P005413_n252CliCod ;
   private String[] P005413_A966PartCod ;
   private boolean[] P005413_n966PartCod ;
   private String[] P005413_A396EmprCod ;
   private int[] P005413_A972PartULin ;
   private boolean[] P005413_n972PartULin ;
   private String[] P005414_A396EmprCod ;
   private String[] P005414_A966PartCod ;
   private boolean[] P005414_n966PartCod ;
   private int[] P005414_A252CliCod ;
   private boolean[] P005414_n252CliCod ;
   private int[] P005414_A979PartLin ;
   private String[] P005415_A396EmprCod ;
   private String[] P005415_A966PartCod ;
   private boolean[] P005415_n966PartCod ;
   private int[] P005415_A252CliCod ;
   private boolean[] P005415_n252CliCod ;
   private String[] P005415_A982PartSitDis ;
   private boolean[] P005415_n982PartSitDis ;
   private int[] P005415_A981PartAlbDis ;
   private boolean[] P005415_n981PartAlbDis ;
   private int[] P005415_A979PartLin ;
   private java.util.Date[] P005415_A10263PartFm ;
   private boolean[] P005415_n10263PartFm ;
   private String[] P005415_A10262PartTrz ;
   private boolean[] P005415_n10262PartTrz ;
   private java.util.Date[] P005415_A10261PartHhEv ;
   private boolean[] P005415_n10261PartHhEv ;
   private java.util.Date[] P005415_A10260PartFcEv ;
   private boolean[] P005415_n10260PartFcEv ;
   private byte[] P005415_A10259PartSts ;
   private boolean[] P005415_n10259PartSts ;
   private java.math.BigDecimal[] P005415_A5916PartTarPal ;
   private boolean[] P005415_n5916PartTarPal ;
   private java.math.BigDecimal[] P005415_A5915PartTarCja ;
   private boolean[] P005415_n5915PartTarCja ;
   private int[] P005415_A5914PartCja ;
   private boolean[] P005415_n5914PartCja ;
   private String[] P005415_A5913PartPalEst ;
   private boolean[] P005415_n5913PartPalEst ;
   private String[] P005415_A5912PartPalUti ;
   private boolean[] P005415_n5912PartPalUti ;
   private String[] P005415_A5878PartLinUni ;
   private boolean[] P005415_n5878PartLinUni ;
   private short[] P005415_A2377ParExtLin ;
   private boolean[] P005415_n2377ParExtLin ;
   private String[] P005415_A2246ParNumCli ;
   private boolean[] P005415_n2246ParNumCli ;
   private short[] P005415_A1157TipConCod ;
   private boolean[] P005415_n1157TipConCod ;
   private java.math.BigDecimal[] P005415_A2024ParPorAgu ;
   private boolean[] P005415_n2024ParPorAgu ;
   private java.math.BigDecimal[] P005415_A2023PartDm ;
   private boolean[] P005415_n2023PartDm ;
   private java.math.BigDecimal[] P005415_A2022PartPesCo ;
   private boolean[] P005415_n2022PartPesCo ;
   private short[] P005415_A1967ConRes ;
   private boolean[] P005415_n1967ConRes ;
   private java.math.BigDecimal[] P005415_A1966KilRes ;
   private boolean[] P005415_n1966KilRes ;
   private String[] P005415_A1877PartLoc ;
   private boolean[] P005415_n1877PartLoc ;
   private short[] P005415_A987ConUti ;
   private boolean[] P005415_n987ConUti ;
   private java.math.BigDecimal[] P005415_A986KilUti ;
   private boolean[] P005415_n986KilUti ;
   private short[] P005415_A985ConEnt ;
   private boolean[] P005415_n985ConEnt ;
   private java.math.BigDecimal[] P005415_A984KilEnt ;
   private boolean[] P005415_n984KilEnt ;
   private java.util.Date[] P005415_A983PartFecMov ;
   private boolean[] P005415_n983PartFecMov ;
   private short[] P005415_A840TrnCod ;
   private boolean[] P005415_n840TrnCod ;
   private String[] P005415_A980PartLinTip ;
   private boolean[] P005415_n980PartLinTip ;
   private String[] P005419_A396EmprCod ;
   private String[] P005419_A6967Mat_Hdp ;
   private byte[] P005419_A6966Mat_Hdr ;
   private int[] P005419_A6965Mat_Hd ;
   private java.util.Date[] P005419_A7397Mat_FecIng ;
   private boolean[] P005419_n7397Mat_FecIng ;
   private java.math.BigDecimal[] P005419_A7396Mat_HdKPr ;
   private boolean[] P005419_n7396Mat_HdKPr ;
   private int[] P005419_A6971Mat_Pzas ;
   private boolean[] P005419_n6971Mat_Pzas ;
   private String[] P005419_A6970Mat_HdGuia ;
   private boolean[] P005419_n6970Mat_HdGuia ;
   private java.math.BigDecimal[] P005419_A6969Mat_HdKgs ;
   private boolean[] P005419_n6969Mat_HdKgs ;
   private short[] P005419_A6968Mat_HdUl ;
   private boolean[] P005419_n6968Mat_HdUl ;
   private String[] P005421_A6981Mat_HdObs ;
   private boolean[] P005421_n6981Mat_HdObs ;
   private String[] P005421_A396EmprCod ;
   private String[] P005421_A6967Mat_Hdp ;
   private byte[] P005421_A6966Mat_Hdr ;
   private int[] P005421_A6965Mat_Hd ;
   private int[] P005421_A7238Mat_RecM ;
   private boolean[] P005421_n7238Mat_RecM ;
   private long[] P005421_A7108Mat_TraInt ;
   private boolean[] P005421_n7108Mat_TraInt ;
   private String[] P005421_A7107Mat_CliRm ;
   private boolean[] P005421_n7107Mat_CliRm ;
   private String[] P005421_A7106Mat_MaqTej ;
   private boolean[] P005421_n7106Mat_MaqTej ;
   private java.math.BigDecimal[] P005421_A6980Mat_HdLm ;
   private boolean[] P005421_n6980Mat_HdLm ;
   private java.math.BigDecimal[] P005421_A6979Mat_HdPorc ;
   private boolean[] P005421_n6979Mat_HdPorc ;
   private String[] P005421_A6978Mat_HdLote ;
   private boolean[] P005421_n6978Mat_HdLote ;
   private String[] P005421_A6977Mat_HdProv ;
   private boolean[] P005421_n6977Mat_HdProv ;
   private String[] P005421_A6976Mat_HdNomc ;
   private boolean[] P005421_n6976Mat_HdNomc ;
   private String[] P005421_A6975Mat_HdTor ;
   private boolean[] P005421_n6975Mat_HdTor ;
   private String[] P005421_A6974Mat_HdMat ;
   private boolean[] P005421_n6974Mat_HdMat ;
   private String[] P005421_A6973Mat_HdEst ;
   private boolean[] P005421_n6973Mat_HdEst ;
   private short[] P005421_A6972Mat_HdLin ;
   private String[] P005423_A396EmprCod ;
   private String[] P005423_A6967Mat_Hdp ;
   private byte[] P005423_A6966Mat_Hdr ;
   private int[] P005423_A6965Mat_Hd ;
   private int[] P005423_A7239Mat_RecT ;
   private boolean[] P005423_n7239Mat_RecT ;
   private java.math.BigDecimal[] P005423_A8049Mat_HdKgTl ;
   private boolean[] P005423_n8049Mat_HdKgTl ;
   private int[] P005423_A7008Mat_HdUnTl ;
   private boolean[] P005423_n7008Mat_HdUnTl ;
   private String[] P005423_A7007Mat_HdTl ;
   private String[] P005425_A396EmprCod ;
   private String[] P005425_A6967Mat_Hdp ;
   private byte[] P005425_A6966Mat_Hdr ;
   private int[] P005425_A6965Mat_Hd ;
   private long[] P005425_A7109Mat_Numcr ;
   private boolean[] P005425_n7109Mat_Numcr ;
   private java.math.BigDecimal[] P005425_A6985Mat_HdKgP ;
   private boolean[] P005425_n6985Mat_HdKgP ;
   private String[] P005425_A6984Mat_HdCPz ;
}

final  class pbarreo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00542", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarConReo FROM TXPBARCAD WHERE (EmprCod = ? and BarCod = ? and BarCodReo = 0) AND (( BarCodPar = ? and ? = 0 and ? = 0 and ? = 0) or ( BarCodPar = ' ' and ( ? = 1 or ? = 1 or ? = 1))) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00544", "SELECT T1.EmprCod, T1.DisDes, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T2.PartCod, T1.CliCod, T1.DisCod, T1.BarAcc, T1.BarTipDis, T1.BarSit, T1.BarNumAny, T1.BarConPar, T1.BarCosPro, T1.BarCosAny, T1.BarFecSal, T1.BarTipEst, COALESCE( T3.BarPieNDes, 0) AS BarPieNDes FROM ((TXPBARCAD T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00545", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, ProFasLin FROM TXPBARPRO WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00546", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, FasCod, BarFasEst, BarFecTeo, BarFecRea, BarTieTeo, BarUni, BarLoc, BarHorIni, BarHorFin, BarTieRea, MaqCodBis, BarFasCon, BarFacTin, BarFecRIni, BarNumBot, BarFasKgT, BarFasMtT, BarFasKgm, BarFasMtr, BarFasCoP, BarFasAcab, BarFasFPl, BarFasUsu, BarFasGral, BarMaqPlan, BarFasFor, BarFasDTI, BarFasDTF, BarObsF, BarObsB FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00547", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, ParFasCod FROM TXPBarPar WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, ParFasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00548", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieEst, AlbRecCod, BarPieKil, BarPieMet, BarKilLan, BarMetLan, BarPConTro, PieOriCod, BarPieLzd, BarPiePie, BarPieLoc, PzaB80, BarPieK1, BarPieK2, BarNPes, BarPieAnc, BarPieAncc, BarPiePda, BapieObs, CodBarPz, BarPieCod FROM TXPBARPIE WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (BarPieEst = 0 or ( ? = 1 and BarPieEst < 2)) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00549", "INSERT INTO TXPDISBAR(EmprCod, DisDisCod, DisBarCod, DisBarReo, DisBarPar, DisNumPda) VALUES(?, ?, ?, ?, ?, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISBAR")
         ,new UpdateCursor("P005410", "UPDATE TXPBARCAD SET BarSit=?, BarCosPro=?, BarCosAny=?, BarFecSal=?, BarTipEst=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P005411", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, BarConReo, BarNumTen FROM TXPBARCAD WHERE (EmprCod = ? and BarCod = ?) AND (BarCodReo = 0) AND (( BarCodPar = ? and ? = 0 and ? = 0 and ? = 0) or ( BarCodPar = ' ' and ( ? = 1 or ? = 1 or ? = 1))) ORDER BY EmprCod, BarCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P005412", "UPDATE TXPBARCAD SET BarConReo=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P005413", "SELECT CliCod, PartCod, EmprCod, PartULin FROM TXPCPARTI WHERE EmprCod = ? and PartCod = ? and CliCod = ? ORDER BY EmprCod, PartCod, CliCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P005414", "SELECT EmprCod, PartCod, CliCod, PartLin FROM TXPLPARTI WHERE EmprCod = ? and PartCod = ? and CliCod = ? ORDER BY EmprCod, PartCod, CliCod, PartLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P005415", "SELECT EmprCod, PartCod, CliCod, PartSitDis, PartAlbDis, PartLin, PartFm, PartTrz, PartHhEv, PartFcEv, PartSts, PartTarPal, PartTarCja, PartCja, PartPalEst, PartPalUti, PartLinUni, ParExtLin, ParNumCli, TipConCod, ParPorAgu, PartDm, PartPesCo, ConRes, KilRes, PartLoc, ConUti, KilUti, ConEnt, KilEnt, PartFecMov, TrnCod, PartLinTip FROM TXPLPARTI WHERE (EmprCod = ? and PartCod = ? and CliCod = ?) AND (PartAlbDis = ?) ORDER BY EmprCod, PartCod, CliCod, PartLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P005416", "INSERT INTO TXPLPARTI(EmprCod, PartCod, CliCod, PartLin, PartLinTip, PartAlbDis, TrnCod, PartSitDis, PartFecMov, KilEnt, ConEnt, KilUti, ConUti, PartLoc, KilRes, ConRes, PartPesCo, PartDm, ParPorAgu, TipConCod, ParNumCli, ParExtLin, PartLinUni, PartPalUti, PartPalEst, PartCja, PartTarCja, PartTarPal, PartSts, PartFcEv, PartHhEv, PartTrz, PartFm) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPARTI")
         ,new UpdateCursor("P005417", "UPDATE TXPLPARTI SET PartSitDis=?, PartAlbDis=?  WHERE EmprCod = ? AND PartCod = ? AND CliCod = ? AND PartLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPARTI")
         ,new UpdateCursor("P005418", "UPDATE TXPCPARTI SET PartULin=?  WHERE EmprCod = ? AND PartCod = ? AND CliCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCPARTI")
         ,new ForEachCursor("P005419", "SELECT EmprCod, Mat_Hdp, Mat_Hdr, Mat_Hd, Mat_FecIng, Mat_HdKPr, Mat_Pzas, Mat_HdGuia, Mat_HdKgs, Mat_HdUl FROM TXPHDRMAT WHERE EmprCod = ? and Mat_Hd = ? and Mat_Hdr = ? and Mat_Hdp = ? ORDER BY EmprCod, Mat_Hd, Mat_Hdr, Mat_Hdp ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P005420", "INSERT INTO TXPHDRMAT(EmprCod, Mat_Hd, Mat_Hdr, Mat_Hdp, Mat_HdUl, Mat_HdKgs, Mat_HdGuia, Mat_Pzas, Mat_HdKPr, Mat_FecIng) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHDRMAT")
         ,new ForEachCursor("P005421", "SELECT Mat_HdObs, EmprCod, Mat_Hdp, Mat_Hdr, Mat_Hd, Mat_RecM, Mat_TraInt, Mat_CliRm, Mat_MaqTej, Mat_HdLm, Mat_HdPorc, Mat_HdLote, Mat_HdProv, Mat_HdNomc, Mat_HdTor, Mat_HdMat, Mat_HdEst, Mat_HdLin FROM TXPHDRMA1 WHERE EmprCod = ? and Mat_Hd = ? and Mat_Hdr = ? and Mat_Hdp = ? ORDER BY EmprCod, Mat_Hd, Mat_Hdr, Mat_Hdp, Mat_HdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P005422", "INSERT INTO TXPHDRMA1(EmprCod, Mat_Hd, Mat_Hdr, Mat_Hdp, Mat_HdLin, Mat_HdEst, Mat_HdMat, Mat_HdTor, Mat_HdNomc, Mat_HdProv, Mat_HdLote, Mat_HdPorc, Mat_HdLm, Mat_HdObs, Mat_MaqTej, Mat_CliRm, Mat_TraInt, Mat_RecM) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHDRMA1")
         ,new ForEachCursor("P005423", "SELECT EmprCod, Mat_Hdp, Mat_Hdr, Mat_Hd, Mat_RecT, Mat_HdKgTl, Mat_HdUnTl, Mat_HdTl FROM TXPHDRTAL WHERE EmprCod = ? and Mat_Hd = ? and Mat_Hdr = ? and Mat_Hdp = ? ORDER BY EmprCod, Mat_Hd, Mat_Hdr, Mat_Hdp, Mat_HdTl ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P005424", "INSERT INTO TXPHDRTAL(EmprCod, Mat_Hd, Mat_Hdr, Mat_Hdp, Mat_HdTl, Mat_HdUnTl, Mat_HdKgTl, Mat_RecT) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHDRTAL")
         ,new ForEachCursor("P005425", "SELECT EmprCod, Mat_Hdp, Mat_Hdr, Mat_Hd, Mat_Numcr, Mat_HdKgP, Mat_HdCPz FROM TXPHDRPZS WHERE EmprCod = ? and Mat_Hd = ? and Mat_Hdr = ? and Mat_Hdp = ? ORDER BY EmprCod, Mat_Hd, Mat_Hdr, Mat_Hdp, Mat_HdCPz ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P005426", "INSERT INTO TXPHDRPZS(EmprCod, Mat_Hd, Mat_Hdr, Mat_Hdp, Mat_HdCPz, Mat_HdKgP, Mat_Numcr) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHDRPZS")
         ,new UpdateCursor("P005427", "DELETE FROM TXPBARPIE  WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (BarPieEst = 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((String[]) buf[10])[0] = rslt.getString(9, 1);
               ((String[]) buf[11])[0] = rslt.getString(10, 1);
               ((byte[]) buf[12])[0] = rslt.getByte(11);
               ((short[]) buf[13])[0] = rslt.getShort(12);
               ((String[]) buf[14])[0] = rslt.getString(13, 1);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(14,2);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(15,2);
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(16);
               ((byte[]) buf[18])[0] = rslt.getByte(17);
               ((int[]) buf[19])[0] = rslt.getInt(18);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 3 :
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
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 5 :
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
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 10);
               return;
            case 10 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = GXutil.resetDate(rslt.getGXDateTime(9));
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(10);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((byte[]) buf[16])[0] = rslt.getByte(11);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(12,3);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(13,3);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((int[]) buf[22])[0] = rslt.getInt(14);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(15, 1);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(16, 1);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(17, 1);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((short[]) buf[30])[0] = rslt.getShort(18);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(19, 8);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((short[]) buf[34])[0] = rslt.getShort(20);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[36])[0] = rslt.getBigDecimal(21,2);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[38])[0] = rslt.getBigDecimal(22,2);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[40])[0] = rslt.getBigDecimal(23,2);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((short[]) buf[42])[0] = rslt.getShort(24);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[44])[0] = rslt.getBigDecimal(25,2);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getString(26, 10);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((short[]) buf[48])[0] = rslt.getShort(27);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[50])[0] = rslt.getBigDecimal(28,2);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((short[]) buf[52])[0] = rslt.getShort(29);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[54])[0] = rslt.getBigDecimal(30,2);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[56])[0] = rslt.getGXDate(31);
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((short[]) buf[58])[0] = rslt.getShort(32);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((String[]) buf[60])[0] = rslt.getString(33, 1);
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(10);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((long[]) buf[8])[0] = rslt.getLong(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 20);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(12, 20);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(13, 40);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(14, 13);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(15, 2);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(16, 40);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(17, 20);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((short[]) buf[30])[0] = rslt.getShort(18);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 4);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 9);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
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
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 7 :
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
            case 8 :
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
            case 9 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 11 :
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
               return;
            case 12 :
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
               stmt.setInt(4, ((Number) parms[5]).intValue());
               return;
            case 13 :
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
               stmt.setInt(4, ((Number) parms[5]).intValue());
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[7], 1);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[9]).intValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[11]).shortValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[13], 20);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DATE );
               }
               else
               {
                  stmt.setDate(9, (java.util.Date)parms[15]);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[17], 2);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[19]).shortValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[21], 2);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(13, ((Number) parms[23]).shortValue());
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[25], 10);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(15, (java.math.BigDecimal)parms[27], 2);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(16, ((Number) parms[29]).shortValue());
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(17, (java.math.BigDecimal)parms[31], 2);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(18, (java.math.BigDecimal)parms[33], 2);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(19, (java.math.BigDecimal)parms[35], 2);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(20, ((Number) parms[37]).shortValue());
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[39], 8);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(22, ((Number) parms[41]).shortValue());
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[43], 1);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(24, (String)parms[45], 1);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(25, (String)parms[47], 1);
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(26, ((Number) parms[49]).intValue());
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(27, (java.math.BigDecimal)parms[51], 3);
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(28, (java.math.BigDecimal)parms[53], 3);
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(29, ((Number) parms[55]).byteValue());
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.DATE );
               }
               else
               {
                  stmt.setDate(30, (java.util.Date)parms[57]);
               }
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(31, (java.util.Date)parms[59], true);
               }
               if ( ((Boolean) parms[60]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(32, (String)parms[61], 30);
               }
               if ( ((Boolean) parms[62]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.DATE );
               }
               else
               {
                  stmt.setDate(33, (java.util.Date)parms[63]);
               }
               return;
            case 14 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 20);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               stmt.setString(3, (String)parms[4], 3);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 16);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               stmt.setInt(6, ((Number) parms[9]).intValue());
               return;
            case 15 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 17 :
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
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[7], 2);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[9], 10);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[11]).intValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[13], 2);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DATE );
               }
               else
               {
                  stmt.setDate(10, (java.util.Date)parms[15]);
               }
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[6], 20);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[8], 40);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[10], 2);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[12], 13);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[14], 40);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[16], 20);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[18], 2);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[20], 2);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(14, (String)parms[22]);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[24], 20);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[26], 30);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(17, ((Number) parms[28]).longValue());
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(18, ((Number) parms[30]).intValue());
               }
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 4);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[6]).intValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[8], 2);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[10]).intValue());
               }
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[6], 2);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(7, ((Number) parms[8]).longValue());
               }
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

