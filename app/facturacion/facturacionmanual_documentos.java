package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class facturacionmanual_documentos extends GXProcedure
{
   public facturacionmanual_documentos( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( facturacionmanual_documentos.class ), "" );
   }

   public facturacionmanual_documentos( int remoteHandle ,
                                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String aP0 ,
                            int aP1 ,
                            String aP2 ,
                            java.util.Date aP3 ,
                            String aP4 ,
                            int[] aP5 ,
                            java.util.Date aP6 ,
                            int[] aP7 ,
                            String aP8 ,
                            String[] aP9 )
   {
      facturacionmanual_documentos.this.aP10 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
      return aP10[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        java.util.Date aP3 ,
                        String aP4 ,
                        int[] aP5 ,
                        java.util.Date aP6 ,
                        int[] aP7 ,
                        String aP8 ,
                        String[] aP9 ,
                        short[] aP10 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             java.util.Date aP3 ,
                             String aP4 ,
                             int[] aP5 ,
                             java.util.Date aP6 ,
                             int[] aP7 ,
                             String aP8 ,
                             String[] aP9 ,
                             short[] aP10 )
   {
      facturacionmanual_documentos.this.A396EmprCod = aP0;
      facturacionmanual_documentos.this.AV8CliCod = aP1;
      facturacionmanual_documentos.this.AV9PRIO = aP2;
      facturacionmanual_documentos.this.AV10FacFch = aP3;
      facturacionmanual_documentos.this.AV11FacSerNum = aP4;
      facturacionmanual_documentos.this.AV73CliFac = aP5[0];
      this.aP5 = aP5;
      facturacionmanual_documentos.this.AV114FacHor = aP6;
      facturacionmanual_documentos.this.AV12NumFac = aP7[0];
      this.aP7 = aP7;
      facturacionmanual_documentos.this.AV136Json_produccion_comercial = aP8;
      facturacionmanual_documentos.this.aP9 = aP9;
      facturacionmanual_documentos.this.aP10 = aP10;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Execute user subroutine: 'INICIO' */
      S151 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV159json_messages = "" ;
      AV158Error = (short)(0) ;
      AV155Messages.clear();
      AV137Documentos_Produccion_Comercial_SDT.fromJSonString(AV136Json_produccion_comercial, null);
      AV162GXV1 = 1 ;
      while ( AV162GXV1 <= AV137Documentos_Produccion_Comercial_SDT.size() )
      {
         AV138Documentos_Produccion_Comercial_SDTItem = (app.facturacion.SdtDocumentos_Produccion_Comercial_SDT_Item)((app.facturacion.SdtDocumentos_Produccion_Comercial_SDT_Item)AV137Documentos_Produccion_Comercial_SDT.elementAt(-1+AV162GXV1));
         AV142Documento = AV138Documentos_Produccion_Comercial_SDTItem.getgxTv_SdtDocumentos_Produccion_Comercial_SDT_Item_Documento() ;
         AV140Tipo = AV138Documentos_Produccion_Comercial_SDTItem.getgxTv_SdtDocumentos_Produccion_Comercial_SDT_Item_Tipo() ;
         if ( GXutil.strcmp(AV140Tipo, httpContext.getMessage( "Produccion", "")) == 0 )
         {
            /* Execute user subroutine: 'PRODUCCION' */
            S111 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         else
         {
            /* Execute user subroutine: 'COMERCIAL' */
            S141 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         AV162GXV1 = (int)(AV162GXV1+1) ;
      }
      if ( AV13NumLin > 0 )
      {
         /*
            INSERT RECORD ON TABLE TXPCFAVEN

         */
         A430FacCod = AV12NumFac ;
         A252CliCod = AV73CliFac ;
         n252CliCod = false ;
         A436FacFch = AV10FacFch ;
         A450FacPri = AV9PRIO ;
         A437FacFpg = AV14CodFpg ;
         A433FacDtoGen = AV15DtoGen ;
         A434FacDtoPP = AV16DtoPP ;
         A6632FacDto = AV106Clidto ;
         if ( GXutil.strcmp(AV77Extranjero, httpContext.getMessage( "S", "")) == 0 )
         {
            A443FacIVAPor = (byte)(0) ;
            A453FacRECPor = DecimalUtil.doubleToDec(0) ;
         }
         else
         {
            if ( GXutil.strcmp(AV9PRIO, "1") == 0 )
            {
               A443FacIVAPor = AV70IvaPor ;
               if ( GXutil.strcmp(AV17RegIVA, httpContext.getMessage( "R", "")) == 0 )
               {
                  A453FacRECPor = AV71IvaRec ;
               }
            }
         }
         A445FacLiC = AV13NumLin ;
         A1150FacNumVto = AV19CliNroVto ;
         A1151FacPer = AV20CliPrd ;
         A1152FacDiaPag = AV21CliDiaPag ;
         A960FacIVACod = AV69IvaCod ;
         A2739FacSerNum = AV11FacSerNum ;
         A965FacCob = " " ;
         A3115FacDivCod = AV74FacDivCod ;
         n3115FacDivCod = false ;
         A3096FacDivTCod = AV75FacDivTCod ;
         n3096FacDivTCod = false ;
         A435FacEst = (byte)(0) ;
         A1153FacTipFac = (byte)(0) ;
         A3119FacRepCod = AV82RepCod ;
         n3119FacRepCod = false ;
         A9606FacHor = AV114FacHor ;
         A11513FacRecIca = DecimalUtil.doubleToDec(0) ;
         A8346FacRecI = DecimalUtil.doubleToDec(0) ;
         n8346FacRecI = false ;
         A7212FacRect = DecimalUtil.doubleToDec(0) ;
         A11629MeivaId = AV146stMeivaId ;
         n11629MeivaId = false ;
         A14219FacEnergia = AV147CliEnergia ;
         A14222FacCostMts = AV143FacCostMts ;
         A14223FacCostKgs = AV144FacCostkgs ;
         A14224FacCostFac = AV148FacCostFactor ;
         GXv_char1[0] = AV149facidate ;
         GXv_char2[0] = AV150FacSerAT ;
         GXv_char3[0] = AV151FacTipAT ;
         new app.patcud(remoteHandle, context).execute( A396EmprCod, AV18ContCod, GXv_char1, GXv_char2, GXv_char3, GXutil.trim( AV163Pgmdesc)) ;
         facturacionmanual_documentos.this.AV149facidate = GXv_char1[0] ;
         facturacionmanual_documentos.this.AV150FacSerAT = GXv_char2[0] ;
         facturacionmanual_documentos.this.AV151FacTipAT = GXv_char3[0] ;
         A14230FacIDATe = AV149facidate ;
         A14236FacSerAT = AV150FacSerAT ;
         A14237FacTipAT = AV151FacTipAT ;
         /* Using cursor P0A022 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod), A436FacFch, A450FacPri, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A437FacFpg, A433FacDtoGen, A434FacDtoPP, Byte.valueOf(A443FacIVAPor), A453FacRECPor, Byte.valueOf(A435FacEst), Integer.valueOf(A445FacLiC), A960FacIVACod, A965FacCob, Byte.valueOf(A1150FacNumVto), A1151FacPer, A1152FacDiaPag, Byte.valueOf(A1153FacTipFac), A2739FacSerNum, Boolean.valueOf(n3096FacDivTCod), A3096FacDivTCod, Boolean.valueOf(n3115FacDivCod), Byte.valueOf(A3115FacDivCod), Boolean.valueOf(n3119FacRepCod), A3119FacRepCod, A6632FacDto, A7212FacRect, Boolean.valueOf(n8346FacRecI), A8346FacRecI, A9606FacHor, A11513FacRecIca, Boolean.valueOf(n11629MeivaId), A11629MeivaId, A14219FacEnergia, A14224FacCostFac, A14222FacCostMts, A14223FacCostKgs, A14230FacIDATe, A14236FacSerAT, A14237FacTipAT});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFAVEN");
         if ( (pr_default.getStatus(0) == 1) )
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
         /* Optimized UPDATE. */
         /* Using cursor P0A023 */
         pr_default.execute(1, new Object[] {Integer.valueOf(AV12NumFac), A396EmprCod, AV18ContCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEMPLIN");
         /* End optimized UPDATE. */
         new app.pcalvto(remoteHandle, context).execute( A396EmprCod, AV12NumFac) ;
         GXv_char3[0] = AV152Cadena ;
         GXv_char2[0] = AV153firma ;
         new app.obtengocadenaparahashdocumentofactura(remoteHandle, context).execute( A396EmprCod, AV12NumFac, AV114FacHor, GXv_char3, GXv_char2) ;
         facturacionmanual_documentos.this.AV152Cadena = GXv_char3[0] ;
         facturacionmanual_documentos.this.AV153firma = GXv_char2[0] ;
         GXv_char3[0] = AV154Hash ;
         GXv_objcol_SdtMessages_Message4[0] = AV155Messages ;
         GXv_boolean5[0] = AV156ok ;
         new app.hash_obtener(remoteHandle, context).execute( AV152Cadena, GXv_char3, GXv_objcol_SdtMessages_Message4, GXv_boolean5) ;
         facturacionmanual_documentos.this.AV154Hash = GXv_char3[0] ;
         AV155Messages = GXv_objcol_SdtMessages_Message4[0] ;
         facturacionmanual_documentos.this.AV156ok = GXv_boolean5[0] ;
         GXv_char3[0] = A396EmprCod ;
         GXv_int6[0] = AV12NumFac ;
         GXv_char2[0] = AV152Cadena ;
         GXv_char1[0] = AV154Hash ;
         new app.facturacion.actualizohashdocumentofactura(remoteHandle, context).execute( GXv_char3, GXv_int6, GXv_char2, GXv_char1) ;
         facturacionmanual_documentos.this.A396EmprCod = GXv_char3[0] ;
         facturacionmanual_documentos.this.AV12NumFac = GXv_int6[0] ;
         facturacionmanual_documentos.this.AV152Cadena = GXv_char2[0] ;
         facturacionmanual_documentos.this.AV154Hash = GXv_char1[0] ;
         AV157Message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
         AV157Message.setgxTv_SdtMessages_Message_Id( "0" );
         AV157Message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "Factura =", "")+GXutil.str( AV12NumFac, 8, 0)+httpContext.getMessage( " Hash=", "")+GXutil.trim( AV154Hash)+httpContext.getMessage( " Ok=", "")+GXutil.booltostr( AV156ok) );
         AV155Messages.add(AV157Message, 0);
         if ( AV122FlagRieClF == 1 )
         {
            GXv_char3[0] = A396EmprCod ;
            GXv_int6[0] = AV73CliFac ;
            GXv_int7[0] = AV12NumFac ;
            GXv_char2[0] = httpContext.getMessage( "A", "") ;
            GXv_decimal8[0] = AV123Noseusa ;
            new app.prieclup(remoteHandle, context).execute( GXv_char3, GXv_int6, GXv_int7, GXv_char2, GXv_decimal8) ;
            facturacionmanual_documentos.this.A396EmprCod = GXv_char3[0] ;
            facturacionmanual_documentos.this.AV73CliFac = GXv_int6[0] ;
            facturacionmanual_documentos.this.AV12NumFac = GXv_int7[0] ;
            facturacionmanual_documentos.this.AV123Noseusa = GXv_decimal8[0] ;
         }
      }
      else
      {
         AV157Message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
         AV157Message.setgxTv_SdtMessages_Message_Id( "999" );
         AV157Message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "NO se pudo facturar, &numlin= ", "")+GXutil.str( AV13NumLin, 6, 0) );
         AV155Messages.add(AV157Message, 0);
         AV158Error = (short)(1) ;
      }
      AV159json_messages = AV155Messages.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'PRODUCCION' Routine */
      returnInSub = false ;
      AV143FacCostMts = DecimalUtil.ZERO ;
      AV144FacCostkgs = DecimalUtil.ZERO ;
      /* Using cursor P0A024 */
      pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(AV142Documento)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A30AlbProCod = P0A024_A30AlbProCod[0] ;
         A33AlbProEst = P0A024_A33AlbProEst[0] ;
         A1782AlbProEso = P0A024_A1782AlbProEso[0] ;
         /* Using cursor P0A025 */
         pr_default.execute(3, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A212BarSer = P0A025_A212BarSer[0] ;
            A1262BarPreKgm = P0A025_A1262BarPreKgm[0] ;
            A1264BarPreMtr = P0A025_A1264BarPreMtr[0] ;
            A12196BarPreUnd = P0A025_A12196BarPreUnd[0] ;
            A1261BarAlbKgmE = P0A025_A1261BarAlbKgmE[0] ;
            A1263BarAlbMtrE = P0A025_A1263BarAlbMtrE[0] ;
            A12195BarAlbUnd = P0A025_A12195BarAlbUnd[0] ;
            A40AlbProRec = P0A025_A40AlbProRec[0] ;
            A1652BarSerDsc = P0A025_A1652BarSerDsc[0] ;
            A136BarColNum = P0A025_A136BarColNum[0] ;
            A135BarColNom = P0A025_A135BarColNom[0] ;
            A2010BarTipDis = P0A025_A2010BarTipDis[0] ;
            A1503BarPart = P0A025_A1503BarPart[0] ;
            A2761AlbBarRec = P0A025_A2761AlbBarRec[0] ;
            A4812BarEncCli = P0A025_A4812BarEncCli[0] ;
            A218BarTipCol = P0A025_A218BarTipCol[0] ;
            A1234BarNomCli = P0A025_A1234BarNomCli[0] ;
            A1235BarNumCli = P0A025_A1235BarNumCli[0] ;
            A5354AlbImpMan = P0A025_A5354AlbImpMan[0] ;
            A2762AlbBarDto = P0A025_A2762AlbBarDto[0] ;
            n2762AlbBarDto = P0A025_n2762AlbBarDto[0] ;
            A217BarTipArt = P0A025_A217BarTipArt[0] ;
            n217BarTipArt = P0A025_n217BarTipArt[0] ;
            A3746BarNPed = P0A025_A3746BarNPed[0] ;
            A252CliCod = P0A025_A252CliCod[0] ;
            n252CliCod = P0A025_n252CliCod[0] ;
            A4466BarAcaAnh = P0A025_A4466BarAcaAnh[0] ;
            A130BarCodPar = P0A025_A130BarCodPar[0] ;
            A132BarCodReo = P0A025_A132BarCodReo[0] ;
            A129BarCod = P0A025_A129BarCod[0] ;
            A32AlbProEsp = P0A025_A32AlbProEsp[0] ;
            A1206TubCod = P0A025_A1206TubCod[0] ;
            n1206TubCod = P0A025_n1206TubCod[0] ;
            A143BarDisNum = P0A025_A143BarDisNum[0] ;
            A1798BarDibCli = P0A025_A1798BarDibCli[0] ;
            A6466PlasCod = P0A025_A6466PlasCod[0] ;
            n6466PlasCod = P0A025_n6466PlasCod[0] ;
            A6467BarAlbPlas = P0A025_A6467BarAlbPlas[0] ;
            A212BarSer = P0A025_A212BarSer[0] ;
            A1652BarSerDsc = P0A025_A1652BarSerDsc[0] ;
            A136BarColNum = P0A025_A136BarColNum[0] ;
            A135BarColNom = P0A025_A135BarColNom[0] ;
            A2010BarTipDis = P0A025_A2010BarTipDis[0] ;
            A1503BarPart = P0A025_A1503BarPart[0] ;
            A4812BarEncCli = P0A025_A4812BarEncCli[0] ;
            A218BarTipCol = P0A025_A218BarTipCol[0] ;
            A1234BarNomCli = P0A025_A1234BarNomCli[0] ;
            A1235BarNumCli = P0A025_A1235BarNumCli[0] ;
            A217BarTipArt = P0A025_A217BarTipArt[0] ;
            n217BarTipArt = P0A025_n217BarTipArt[0] ;
            A3746BarNPed = P0A025_A3746BarNPed[0] ;
            A252CliCod = P0A025_A252CliCod[0] ;
            n252CliCod = P0A025_n252CliCod[0] ;
            A4466BarAcaAnh = P0A025_A4466BarAcaAnh[0] ;
            A143BarDisNum = P0A025_A143BarDisNum[0] ;
            A1798BarDibCli = P0A025_A1798BarDibCli[0] ;
            AV30BarSer = A212BarSer ;
            AV31BarDisNum = A143BarDisNum ;
            AV88AlbProCod = A30AlbProCod ;
            AV85BarCod = A129BarCod ;
            AV86BarCodReo = A132BarCodReo ;
            AV87BarCodPar = A130BarCodPar ;
            /* Using cursor P0A026 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Long.valueOf(A30AlbProCod)});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A758ProCod = P0A026_A758ProCod[0] ;
               n758ProCod = P0A026_n758ProCod[0] ;
               A1468AlbPrdLin = P0A026_A1468AlbPrdLin[0] ;
               AV116Procod = A758ProCod ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
               pr_default.readNext(4);
            }
            pr_default.close(4);
            AV13NumLin = (int)(AV13NumLin+1) ;
            /* Execute user subroutine: 'OBSFAC' */
            S125 ();
            if ( returnInSub )
            {
               pr_default.close(3);
               pr_default.close(3);
               pr_default.close(2);
               returnInSub = true;
               if (true) return;
            }
            if ( ! (GXutil.strcmp("", AV29ArtObsFac)==0) )
            {
               GXv_char3[0] = A396EmprCod ;
               GXv_int9[0] = A30AlbProCod ;
               GXv_int7[0] = A129BarCod ;
               GXv_int10[0] = A132BarCodReo ;
               GXv_char2[0] = A130BarCodPar ;
               GXv_int6[0] = AV12NumFac ;
               GXv_int11[0] = AV13NumLin ;
               GXv_char1[0] = AV29ArtObsFac ;
               GXv_int12[0] = AV72FlagSal ;
               GXv_int13[0] = (short)(0) ;
               GXv_int14[0] = AV73CliFac ;
               new app.facturacion.pfacau11(remoteHandle, context).execute( GXv_char3, GXv_int9, GXv_int7, GXv_int10, GXv_char2, GXv_int6, GXv_int11, GXv_char1, GXv_int12, GXv_int13, GXv_int14) ;
               facturacionmanual_documentos.this.A396EmprCod = GXv_char3[0] ;
               facturacionmanual_documentos.this.A30AlbProCod = GXv_int9[0] ;
               facturacionmanual_documentos.this.A129BarCod = GXv_int7[0] ;
               facturacionmanual_documentos.this.A132BarCodReo = GXv_int10[0] ;
               facturacionmanual_documentos.this.A130BarCodPar = GXv_char2[0] ;
               facturacionmanual_documentos.this.AV12NumFac = GXv_int6[0] ;
               facturacionmanual_documentos.this.AV13NumLin = GXv_int11[0] ;
               facturacionmanual_documentos.this.AV29ArtObsFac = GXv_char1[0] ;
               facturacionmanual_documentos.this.AV72FlagSal = GXv_int12[0] ;
               facturacionmanual_documentos.this.AV73CliFac = GXv_int14[0] ;
               AV64FlagAlb = (byte)(1) ;
            }
            if ( (0==AV34Flag) )
            {
               AV32LenSer = (byte)(GXutil.len( A212BarSer)) ;
               AV33LenColNom = (byte)(GXutil.len( A135BarColNom)) ;
               if ( AV83FlagFacPro == 1 )
               {
                  AV13NumLin = (int)(AV13NumLin-1) ;
                  GXv_char3[0] = A396EmprCod ;
                  GXv_int9[0] = A30AlbProCod ;
                  GXv_int14[0] = A129BarCod ;
                  GXv_int12[0] = A132BarCodReo ;
                  GXv_char2[0] = A130BarCodPar ;
                  GXv_char1[0] = A143BarDisNum ;
                  GXv_int11[0] = AV13NumLin ;
                  GXv_int7[0] = AV12NumFac ;
                  GXv_int6[0] = AV73CliFac ;
                  new app.pfacmapr(remoteHandle, context).execute( GXv_char3, GXv_int9, GXv_int14, GXv_int12, GXv_char2, GXv_char1, GXv_int11, GXv_int7, GXv_int6) ;
                  facturacionmanual_documentos.this.A396EmprCod = GXv_char3[0] ;
                  facturacionmanual_documentos.this.A30AlbProCod = GXv_int9[0] ;
                  facturacionmanual_documentos.this.A129BarCod = GXv_int14[0] ;
                  facturacionmanual_documentos.this.A132BarCodReo = GXv_int12[0] ;
                  facturacionmanual_documentos.this.A130BarCodPar = GXv_char2[0] ;
                  facturacionmanual_documentos.this.A143BarDisNum = GXv_char1[0] ;
                  facturacionmanual_documentos.this.AV13NumLin = GXv_int11[0] ;
                  facturacionmanual_documentos.this.AV12NumFac = GXv_int7[0] ;
                  facturacionmanual_documentos.this.AV73CliFac = GXv_int6[0] ;
               }
               else
               {
                  /*
                     INSERT RECORD ON TABLE TXPLFAVEN

                  */
                  A430FacCod = AV12NumFac ;
                  A446FacLin = AV13NumLin ;
                  A427FacAlbCod = A30AlbProCod ;
                  A1294FacBarCod = A129BarCod ;
                  A1295FacBarReo = A132BarCodReo ;
                  A1296FacBarPar = A130BarCodPar ;
                  A428FacAlbTip = (byte)(1) ;
                  A454FacSer = A212BarSer ;
                  A448FacPreKgs = A1262BarPreKgm ;
                  A449FacPreMts = A1264BarPreMtr ;
                  A12198FacPreUnd = A12196BarPreUnd ;
                  if ( AV101FacCru == 1 )
                  {
                     /* Execute user subroutine: 'KILOS' */
                     S137 ();
                     if ( returnInSub )
                     {
                        pr_default.close(3);
                        pr_default.close(3);
                        pr_default.close(2);
                        returnInSub = true;
                        if (true) return;
                     }
                     A444FacKgs = AV100BarKgm ;
                     A447FacMts = AV99BarMtr ;
                  }
                  else
                  {
                     A444FacKgs = A1261BarAlbKgmE ;
                     A447FacMts = A1263BarAlbMtrE ;
                     A12197FacUnds = A12195BarAlbUnd ;
                  }
                  A451FacRec = A40AlbProRec ;
                  A3397FacFasCod = " " ;
                  if ( AV79FlagDsc == 1 )
                  {
                     AV32LenSer = (byte)(GXutil.len( A1652BarSerDsc)) ;
                     if ( ! (0==A136BarColNum) )
                     {
                        A432FacDsc = GXutil.substring( A1652BarSerDsc, 1, AV32LenSer) + " / " + GXutil.substring( A135BarColNom, 1, AV33LenColNom) + "-" + GXutil.str( A136BarColNum, 6, 0) ;
                     }
                     else
                     {
                        A432FacDsc = GXutil.substring( A1652BarSerDsc, 1, AV32LenSer) + " / " + GXutil.substring( A135BarColNom, 1, AV33LenColNom) ;
                     }
                  }
                  else
                  {
                     if ( AV76FlagTint == 1 )
                     {
                        A432FacDsc = AV78FacDsc ;
                     }
                     else
                     {
                        if ( ! (0==A136BarColNum) )
                        {
                           A432FacDsc = GXutil.substring( A212BarSer, 1, AV32LenSer) + " / " + GXutil.substring( A135BarColNom, 1, AV33LenColNom) + "-" + GXutil.str( A136BarColNum, 6, 0) ;
                        }
                        else
                        {
                           A432FacDsc = GXutil.substring( A212BarSer, 1, AV32LenSer) + " / " + GXutil.substring( A135BarColNom, 1, AV33LenColNom) ;
                        }
                     }
                  }
                  A1498FacDisNum = AV31BarDisNum ;
                  A3097FacTipPro = A2010BarTipDis ;
                  A3303FacNPart = A1503BarPart ;
                  if ( AV95FlagPorRec == 1 )
                  {
                     A3897FacKgsA = A2761AlbBarRec ;
                  }
                  A4814FacEncCli = A4812BarEncCli ;
                  A3878FacColNom = A135BarColNom ;
                  A3879FocColNum = A136BarColNum ;
                  A3880FacTipColC = A218BarTipCol ;
                  A3881FacNomCol = A1234BarNomCli ;
                  A3882FacNumCol = A1235BarNumCli ;
                  A5353FacImpMan = A5354AlbImpMan ;
                  A5050FacBonLi = DecimalUtil.doubleToDec(0) ;
                  if ( AV113Moda21 == 1 )
                  {
                     A451FacRec = DecimalUtil.doubleToDec(0) ;
                     A3898FacPreKgsA = DecimalUtil.doubleToDec(0) ;
                     A3897FacKgsA = DecimalUtil.doubleToDec(0) ;
                     if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2762AlbBarDto)==0) || ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2761AlbBarRec)==0) )
                     {
                        A5050FacBonLi = A2762AlbBarDto ;
                        A451FacRec = A2761AlbBarRec ;
                        A3898FacPreKgsA = (A1261BarAlbKgmE.multiply(A1262BarPreKgm).multiply(A2761AlbBarRec).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN)).subtract((A1261BarAlbKgmE.multiply(A1262BarPreKgm).multiply(A2762AlbBarDto).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))) ;
                        A3897FacKgsA = DecimalUtil.doubleToDec(1) ;
                     }
                  }
                  if ( AV117Tinamar == 0 )
                  {
                     A5355FacImpMin = ((0==AV107Itram) ? AV96CliImpMin : ((GXutil.strcmp(A2010BarTipDis, httpContext.getMessage( "E", ""))!=0) ? AV96CliImpMin : AV145CliImpMnEst)) ;
                  }
                  else
                  {
                     A5355FacImpMin = DecimalUtil.doubleToDec(0) ;
                  }
                  A3883FacCliCod = AV73CliFac ;
                  A5189FacTipArt = A217BarTipArt ;
                  A3884FacProCod = AV116Procod ;
                  if ( AV121vts == 1 )
                  {
                     A432FacDsc = A3746BarNPed ;
                  }
                  GXv_char3[0] = A396EmprCod ;
                  GXv_int14[0] = A252CliCod ;
                  GXv_char2[0] = A212BarSer ;
                  GXv_char1[0] = A135BarColNom ;
                  GXv_int11[0] = A136BarColNum ;
                  GXv_int12[0] = A218BarTipCol ;
                  GXv_int10[0] = AV126intcod ;
                  GXv_char15[0] = "" ;
                  new app.pbusin3(remoteHandle, context).execute( GXv_char3, GXv_int14, GXv_char2, GXv_char1, GXv_int11, GXv_int12, GXv_int10, GXv_char15) ;
                  facturacionmanual_documentos.this.A396EmprCod = GXv_char3[0] ;
                  facturacionmanual_documentos.this.A252CliCod = GXv_int14[0] ;
                  facturacionmanual_documentos.this.A212BarSer = GXv_char2[0] ;
                  facturacionmanual_documentos.this.A135BarColNom = GXv_char1[0] ;
                  facturacionmanual_documentos.this.A136BarColNum = GXv_int11[0] ;
                  facturacionmanual_documentos.this.A218BarTipCol = GXv_int12[0] ;
                  facturacionmanual_documentos.this.AV126intcod = GXv_int10[0] ;
                  A12693FacInt = AV126intcod ;
                  A12906FacCadEnc = A4466BarAcaAnh ;
                  AV143FacCostMts = AV143FacCostMts.add((((A1264BarPreMtr.doubleValue()>0)&&(A1263BarAlbMtrE.doubleValue()>0) ? A1263BarAlbMtrE : DecimalUtil.doubleToDec(0)))) ;
                  AV144FacCostkgs = AV144FacCostkgs.add((((A1262BarPreKgm.doubleValue()>0)&&(A1261BarAlbKgmE.doubleValue()>0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, A1264BarPreMtr)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, A1263BarAlbMtrE)==0) ? A1261BarAlbKgmE : DecimalUtil.doubleToDec(0)))) ;
                  AV157Message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
                  AV157Message.setgxTv_SdtMessages_Message_Id( "0" );
                  AV157Message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "Lfaven.ALBBAR. Nº Documento ", "")+GXutil.trim( GXutil.str( A30AlbProCod, 10, 0))+httpContext.getMessage( "Nº Factura ", "")+GXutil.trim( GXutil.str( AV12NumFac, 8, 0))+httpContext.getMessage( " FacLin ", "")+GXutil.trim( GXutil.str( AV13NumLin, 6, 0)) );
                  AV157Message.setgxTv_SdtMessages_Message_Description( AV157Message.getgxTv_SdtMessages_Message_Description()+httpContext.getMessage( " Nº Hdr ", "")+GXutil.trim( GXutil.str( A129BarCod, 8, 0))+"-"+GXutil.str( A132BarCodReo, 1, 0)+A130BarCodPar );
                  AV155Messages.add(AV157Message, 0);
                  /* Using cursor P0A027 */
                  pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod), Integer.valueOf(A446FacLin), Long.valueOf(A427FacAlbCod), Byte.valueOf(A428FacAlbTip), A454FacSer, A432FacDsc, A447FacMts, A449FacPreMts, A444FacKgs, A448FacPreKgs, A451FacRec, Integer.valueOf(A1294FacBarCod), Byte.valueOf(A1295FacBarReo), A1296FacBarPar, A1498FacDisNum, A3097FacTipPro, Short.valueOf(A3303FacNPart), A3397FacFasCod, A3878FacColNom, Integer.valueOf(A3879FocColNum), Byte.valueOf(A3880FacTipColC), A3881FacNomCol, Integer.valueOf(A3882FacNumCol), Integer.valueOf(A3883FacCliCod), A3884FacProCod, A3898FacPreKgsA, A4814FacEncCli, A5050FacBonLi, Short.valueOf(A5189FacTipArt), A5353FacImpMan, A5355FacImpMin, A3897FacKgsA, Integer.valueOf(A12197FacUnds), A12198FacPreUnd, Byte.valueOf(A12693FacInt), Short.valueOf(A12906FacCadEnc)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFAVEN");
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
                  /* End Insert */
                  AV64FlagAlb = (byte)(1) ;
               }
            }
            else
            {
               AV37LenDib = (byte)(GXutil.len( A1798BarDibCli)) ;
               AV38BarDibCli = A1798BarDibCli ;
               /* Using cursor P0A028 */
               pr_default.execute(6, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
               while ( (pr_default.getStatus(6) != 101) )
               {
                  A212BarSer = P0A028_A212BarSer[0] ;
                  A1536AlbEComPre = P0A028_A1536AlbEComPre[0] ;
                  n1536AlbEComPre = P0A028_n1536AlbEComPre[0] ;
                  A1534AlbEComP = P0A028_A1534AlbEComP[0] ;
                  n1534AlbEComP = P0A028_n1534AlbEComP[0] ;
                  A1533AlbEComM = P0A028_A1533AlbEComM[0] ;
                  n1533AlbEComM = P0A028_n1533AlbEComM[0] ;
                  A1056DisComCod = P0A028_A1056DisComCod[0] ;
                  A1032FonCod = P0A028_A1032FonCod[0] ;
                  A4812BarEncCli = P0A028_A4812BarEncCli[0] ;
                  A217BarTipArt = P0A028_A217BarTipArt[0] ;
                  n217BarTipArt = P0A028_n217BarTipArt[0] ;
                  A2524DisComLin = P0A028_A2524DisComLin[0] ;
                  A212BarSer = P0A028_A212BarSer[0] ;
                  A4812BarEncCli = P0A028_A4812BarEncCli[0] ;
                  A217BarTipArt = P0A028_A217BarTipArt[0] ;
                  n217BarTipArt = P0A028_n217BarTipArt[0] ;
                  AV35LenFon = (byte)(GXutil.len( A1032FonCod)) ;
                  AV36LenCom = (byte)(GXutil.len( A1056DisComCod)) ;
                  /*
                     INSERT RECORD ON TABLE TXPLFAVEN

                  */
                  A430FacCod = AV12NumFac ;
                  A446FacLin = AV13NumLin ;
                  A427FacAlbCod = A30AlbProCod ;
                  A1294FacBarCod = A129BarCod ;
                  A1295FacBarReo = A132BarCodReo ;
                  A1296FacBarPar = A130BarCodPar ;
                  A428FacAlbTip = (byte)(1) ;
                  A454FacSer = A212BarSer ;
                  A448FacPreKgs = DecimalUtil.ZERO ;
                  A449FacPreMts = A1536AlbEComPre ;
                  if ( AV80FlagJime == 0 )
                  {
                     A444FacKgs = DecimalUtil.ZERO ;
                  }
                  else
                  {
                     A444FacKgs = DecimalUtil.doubleToDec(A1534AlbEComP) ;
                  }
                  A447FacMts = A1533AlbEComM ;
                  A451FacRec = DecimalUtil.ZERO ;
                  A432FacDsc = GXutil.substring( A1032FonCod, 1, AV35LenFon) + "/" + GXutil.substring( A1056DisComCod, 1, AV36LenCom) + "/" + GXutil.substring( AV38BarDibCli, 1, AV37LenDib) ;
                  A3397FacFasCod = " " ;
                  A1498FacDisNum = AV31BarDisNum ;
                  A4814FacEncCli = A4812BarEncCli ;
                  A5353FacImpMan = DecimalUtil.doubleToDec(0) ;
                  A5355FacImpMin = DecimalUtil.doubleToDec(0) ;
                  A3883FacCliCod = AV73CliFac ;
                  A5189FacTipArt = A217BarTipArt ;
                  /* Using cursor P0A029 */
                  pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod), Integer.valueOf(A446FacLin), Long.valueOf(A427FacAlbCod), Byte.valueOf(A428FacAlbTip), A454FacSer, A432FacDsc, A447FacMts, A449FacPreMts, A444FacKgs, A448FacPreKgs, A451FacRec, Integer.valueOf(A1294FacBarCod), Byte.valueOf(A1295FacBarReo), A1296FacBarPar, A1498FacDisNum, A3397FacFasCod, Integer.valueOf(A3883FacCliCod), A4814FacEncCli, Short.valueOf(A5189FacTipArt), A5353FacImpMan, A5355FacImpMin});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFAVEN");
                  if ( (pr_default.getStatus(7) == 1) )
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
                  AV13NumLin = (int)(AV13NumLin+1) ;
                  AV64FlagAlb = (byte)(1) ;
                  pr_default.readNext(6);
               }
               pr_default.close(6);
            }
            if ( ( AV105Erfoc == 0 ) && ( AV112Mafitex == 0 ) )
            {
               /* Using cursor P0A0210 */
               pr_default.execute(8, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
               while ( (pr_default.getStatus(8) != 101) )
               {
                  A212BarSer = P0A0210_A212BarSer[0] ;
                  A460FasDsc = P0A0210_A460FasDsc[0] ;
                  A457FasCod = P0A0210_A457FasCod[0] ;
                  A2010BarTipDis = P0A0210_A2010BarTipDis[0] ;
                  A1458BarAlbBul = P0A0210_A1458BarAlbBul[0] ;
                  A1503BarPart = P0A0210_A1503BarPart[0] ;
                  A4812BarEncCli = P0A0210_A4812BarEncCli[0] ;
                  A7752GuiFasRec = P0A0210_A7752GuiFasRec[0] ;
                  n7752GuiFasRec = P0A0210_n7752GuiFasRec[0] ;
                  A7751GuiFasDto = P0A0210_A7751GuiFasDto[0] ;
                  n7751GuiFasDto = P0A0210_n7751GuiFasDto[0] ;
                  A217BarTipArt = P0A0210_A217BarTipArt[0] ;
                  n217BarTipArt = P0A0210_n217BarTipArt[0] ;
                  A1276FasMtr = P0A0210_A1276FasMtr[0] ;
                  A1275FasKgm = P0A0210_A1275FasKgm[0] ;
                  A1241GuiFasPKg = P0A0210_A1241GuiFasPKg[0] ;
                  A1242GuiFasPMt = P0A0210_A1242GuiFasPMt[0] ;
                  A12194FasPreUnd = P0A0210_A12194FasPreUnd[0] ;
                  A12193FasUnd = P0A0210_A12193FasUnd[0] ;
                  A1240GuiFasLin = P0A0210_A1240GuiFasLin[0] ;
                  A460FasDsc = P0A0210_A460FasDsc[0] ;
                  A212BarSer = P0A0210_A212BarSer[0] ;
                  A2010BarTipDis = P0A0210_A2010BarTipDis[0] ;
                  A1503BarPart = P0A0210_A1503BarPart[0] ;
                  A4812BarEncCli = P0A0210_A4812BarEncCli[0] ;
                  A217BarTipArt = P0A0210_A217BarTipArt[0] ;
                  n217BarTipArt = P0A0210_n217BarTipArt[0] ;
                  A1458BarAlbBul = P0A0210_A1458BarAlbBul[0] ;
                  AV13NumLin = (int)(AV13NumLin+1) ;
                  AV23Metros = A1276FasMtr ;
                  AV24Kilos = A1275FasKgm ;
                  AV25PrecioKg = A1241GuiFasPKg ;
                  AV26PrecioMt = A1242GuiFasPMt ;
                  AV125PrecioUn = A12194FasPreUnd ;
                  AV124Unidades = A12193FasUnd ;
                  if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV23Metros)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV26PrecioMt)==0) )
                  {
                     AV26PrecioMt = DecimalUtil.ZERO ;
                  }
                  if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV24Kilos)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV25PrecioKg)==0) )
                  {
                     AV25PrecioKg = DecimalUtil.ZERO ;
                  }
                  if ( AV108Magosa == 1 )
                  {
                     AV25PrecioKg = DecimalUtil.doubleToDec(0) ;
                     AV26PrecioMt = DecimalUtil.doubleToDec(0) ;
                     AV24Kilos = DecimalUtil.doubleToDec(0) ;
                     AV23Metros = DecimalUtil.doubleToDec(0) ;
                  }
                  /*
                     INSERT RECORD ON TABLE TXPLFAVEN

                  */
                  A430FacCod = AV12NumFac ;
                  A446FacLin = AV13NumLin ;
                  A427FacAlbCod = A30AlbProCod ;
                  A1294FacBarCod = A129BarCod ;
                  A1295FacBarReo = A132BarCodReo ;
                  A1296FacBarPar = A130BarCodPar ;
                  A428FacAlbTip = (byte)(1) ;
                  A454FacSer = A212BarSer ;
                  A448FacPreKgs = AV25PrecioKg ;
                  A449FacPreMts = AV26PrecioMt ;
                  A12198FacPreUnd = AV125PrecioUn ;
                  A444FacKgs = AV24Kilos ;
                  A447FacMts = AV23Metros ;
                  A12197FacUnds = AV124Unidades ;
                  A432FacDsc = A460FasDsc ;
                  if ( AV80FlagJime == 1 )
                  {
                     A1498FacDisNum = A457FasCod ;
                  }
                  else
                  {
                     if ( (0==AV72FlagSal) && (0==AV98PLinea) )
                     {
                        A1498FacDisNum = AV31BarDisNum ;
                        A3097FacTipPro = A2010BarTipDis ;
                     }
                     else
                     {
                        A1498FacDisNum = GXutil.str( A1458BarAlbBul, 4, 0) ;
                     }
                  }
                  A3303FacNPart = A1503BarPart ;
                  A3397FacFasCod = A457FasCod ;
                  if ( ( AV92Texknit == 1 ) || ( AV93Martex == 1 ) )
                  {
                     A3097FacTipPro = httpContext.getMessage( "F", "") ;
                  }
                  A4814FacEncCli = A4812BarEncCli ;
                  A5353FacImpMan = DecimalUtil.doubleToDec(0) ;
                  A5050FacBonLi = DecimalUtil.doubleToDec(0) ;
                  if ( AV113Moda21 == 1 )
                  {
                     A451FacRec = DecimalUtil.doubleToDec(0) ;
                     A3898FacPreKgsA = DecimalUtil.doubleToDec(0) ;
                     A3897FacKgsA = DecimalUtil.doubleToDec(0) ;
                     if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A7751GuiFasDto)==0) || ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A7752GuiFasRec)==0) )
                     {
                        A451FacRec = A7752GuiFasRec ;
                        A5050FacBonLi = A7751GuiFasDto ;
                        A3898FacPreKgsA = ((AV25PrecioKg.multiply(AV24Kilos).multiply(A7752GuiFasRec).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN)).subtract((AV25PrecioKg.multiply(AV24Kilos).multiply(A7751GuiFasDto).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN)))).add(((AV26PrecioMt.multiply(AV23Metros).multiply(A7752GuiFasRec).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN)).subtract((AV26PrecioMt.multiply(AV23Metros).multiply(A7751GuiFasDto).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))))) ;
                        A3897FacKgsA = DecimalUtil.doubleToDec(1) ;
                     }
                  }
                  A5355FacImpMin = DecimalUtil.doubleToDec(0) ;
                  A3883FacCliCod = AV73CliFac ;
                  A5189FacTipArt = A217BarTipArt ;
                  AV157Message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
                  AV157Message.setgxTv_SdtMessages_Message_Id( "0" );
                  AV157Message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "Lfaven.ALBFAS. Nº Documento ", "")+GXutil.trim( GXutil.str( A30AlbProCod, 10, 0))+httpContext.getMessage( "Nº Factura ", "")+GXutil.trim( GXutil.str( AV12NumFac, 8, 0))+httpContext.getMessage( " FacLin ", "")+GXutil.trim( GXutil.str( AV13NumLin, 6, 0)) );
                  AV157Message.setgxTv_SdtMessages_Message_Description( AV157Message.getgxTv_SdtMessages_Message_Description()+httpContext.getMessage( " Nº Hdr ", "")+GXutil.trim( GXutil.str( A129BarCod, 8, 0))+"-"+GXutil.str( A132BarCodReo, 1, 0)+A130BarCodPar );
                  AV155Messages.add(AV157Message, 0);
                  /* Using cursor P0A0211 */
                  pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod), Integer.valueOf(A446FacLin), Long.valueOf(A427FacAlbCod), Byte.valueOf(A428FacAlbTip), A454FacSer, A432FacDsc, A447FacMts, A449FacPreMts, A444FacKgs, A448FacPreKgs, A451FacRec, Integer.valueOf(A1294FacBarCod), Byte.valueOf(A1295FacBarReo), A1296FacBarPar, A1498FacDisNum, A3097FacTipPro, Short.valueOf(A3303FacNPart), A3397FacFasCod, Integer.valueOf(A3883FacCliCod), A3898FacPreKgsA, A4814FacEncCli, A5050FacBonLi, Short.valueOf(A5189FacTipArt), A5353FacImpMan, A5355FacImpMin, A3897FacKgsA, Integer.valueOf(A12197FacUnds), A12198FacPreUnd});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFAVEN");
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
                  AV64FlagAlb = (byte)(1) ;
                  pr_default.readNext(8);
               }
               pr_default.close(8);
            }
            /* Using cursor P0A0212 */
            pr_default.execute(10, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(10) != 101) )
            {
               A212BarSer = P0A0212_A212BarSer[0] ;
               A2765AlbHdrTxt = P0A0212_A2765AlbHdrTxt[0] ;
               A1503BarPart = P0A0212_A1503BarPart[0] ;
               A4812BarEncCli = P0A0212_A4812BarEncCli[0] ;
               A2770ALbHdrMts = P0A0212_A2770ALbHdrMts[0] ;
               A2768AlbHdrKgs = P0A0212_A2768AlbHdrKgs[0] ;
               A2767AlbHdrPKg = P0A0212_A2767AlbHdrPKg[0] ;
               A2769AlbHdrPMt = P0A0212_A2769AlbHdrPMt[0] ;
               A2764AlbHdrLin = P0A0212_A2764AlbHdrLin[0] ;
               A212BarSer = P0A0212_A212BarSer[0] ;
               A1503BarPart = P0A0212_A1503BarPart[0] ;
               A4812BarEncCli = P0A0212_A4812BarEncCli[0] ;
               AV13NumLin = (int)(AV13NumLin+1) ;
               AV23Metros = A2770ALbHdrMts ;
               AV24Kilos = A2768AlbHdrKgs ;
               AV25PrecioKg = A2767AlbHdrPKg ;
               AV26PrecioMt = A2769AlbHdrPMt ;
               if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV23Metros)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV26PrecioMt)==0) )
               {
                  AV26PrecioMt = DecimalUtil.ZERO ;
               }
               if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV24Kilos)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV25PrecioKg)==0) )
               {
                  AV25PrecioKg = DecimalUtil.ZERO ;
               }
               /*
                  INSERT RECORD ON TABLE TXPLFAVEN

               */
               A430FacCod = AV12NumFac ;
               A446FacLin = AV13NumLin ;
               A427FacAlbCod = A30AlbProCod ;
               A1294FacBarCod = A129BarCod ;
               A1295FacBarReo = A132BarCodReo ;
               A1296FacBarPar = A130BarCodPar ;
               A428FacAlbTip = (byte)(1) ;
               A454FacSer = A212BarSer ;
               A448FacPreKgs = AV25PrecioKg ;
               A449FacPreMts = AV26PrecioMt ;
               A444FacKgs = AV24Kilos ;
               A447FacMts = AV23Metros ;
               A432FacDsc = A2765AlbHdrTxt ;
               A1498FacDisNum = AV31BarDisNum ;
               A3303FacNPart = A1503BarPart ;
               A3397FacFasCod = httpContext.getMessage( "ZZZZZZZZ", "") ;
               A4814FacEncCli = A4812BarEncCli ;
               A5050FacBonLi = DecimalUtil.doubleToDec(0) ;
               A5353FacImpMan = DecimalUtil.doubleToDec(0) ;
               A5355FacImpMin = DecimalUtil.doubleToDec(0) ;
               A3883FacCliCod = AV73CliFac ;
               AV157Message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
               AV157Message.setgxTv_SdtMessages_Message_Id( "0" );
               AV157Message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "Lfaven.ALBTXT. Nº Documento ", "")+GXutil.trim( GXutil.str( A30AlbProCod, 10, 0))+httpContext.getMessage( "Nº Factura ", "")+GXutil.trim( GXutil.str( AV12NumFac, 8, 0))+httpContext.getMessage( " FacLin ", "")+GXutil.trim( GXutil.str( AV13NumLin, 6, 0)) );
               AV157Message.setgxTv_SdtMessages_Message_Description( AV157Message.getgxTv_SdtMessages_Message_Description()+httpContext.getMessage( " Nº Hdr ", "")+GXutil.trim( GXutil.str( A129BarCod, 8, 0))+"-"+GXutil.str( A132BarCodReo, 1, 0)+A130BarCodPar );
               AV155Messages.add(AV157Message, 0);
               /* Using cursor P0A0213 */
               pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod), Integer.valueOf(A446FacLin), Long.valueOf(A427FacAlbCod), Byte.valueOf(A428FacAlbTip), A454FacSer, A432FacDsc, A447FacMts, A449FacPreMts, A444FacKgs, A448FacPreKgs, Integer.valueOf(A1294FacBarCod), Byte.valueOf(A1295FacBarReo), A1296FacBarPar, A1498FacDisNum, Short.valueOf(A3303FacNPart), A3397FacFasCod, Integer.valueOf(A3883FacCliCod), A4814FacEncCli, A5050FacBonLi, A5353FacImpMan, A5355FacImpMin});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFAVEN");
               if ( (pr_default.getStatus(11) == 1) )
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
               pr_default.readNext(10);
            }
            pr_default.close(10);
            if ( (0==AV83FlagFacPro) )
            {
               GXv_char15[0] = A396EmprCod ;
               GXv_int9[0] = A30AlbProCod ;
               GXv_int14[0] = A129BarCod ;
               GXv_int12[0] = A132BarCodReo ;
               GXv_char3[0] = A130BarCodPar ;
               GXv_char2[0] = A143BarDisNum ;
               GXv_int11[0] = AV13NumLin ;
               GXv_int7[0] = AV12NumFac ;
               GXv_int6[0] = AV73CliFac ;
               new app.pfacmapr(remoteHandle, context).execute( GXv_char15, GXv_int9, GXv_int14, GXv_int12, GXv_char3, GXv_char2, GXv_int11, GXv_int7, GXv_int6) ;
               facturacionmanual_documentos.this.A396EmprCod = GXv_char15[0] ;
               facturacionmanual_documentos.this.A30AlbProCod = GXv_int9[0] ;
               facturacionmanual_documentos.this.A129BarCod = GXv_int14[0] ;
               facturacionmanual_documentos.this.A132BarCodReo = GXv_int12[0] ;
               facturacionmanual_documentos.this.A130BarCodPar = GXv_char3[0] ;
               facturacionmanual_documentos.this.A143BarDisNum = GXv_char2[0] ;
               facturacionmanual_documentos.this.AV13NumLin = GXv_int11[0] ;
               facturacionmanual_documentos.this.AV12NumFac = GXv_int7[0] ;
               facturacionmanual_documentos.this.AV73CliFac = GXv_int6[0] ;
            }
            GXv_int14[0] = AV13NumLin ;
            new app.pfacau17(remoteHandle, context).execute( A396EmprCod, A30AlbProCod, A129BarCod, A132BarCodReo, A130BarCodPar, AV12NumFac, GXv_int14, AV29ArtObsFac, AV72FlagSal, (short)(0), AV73CliFac) ;
            facturacionmanual_documentos.this.AV13NumLin = GXv_int14[0] ;
            if ( ! (0==A6467BarAlbPlas) && ! (0==A6466PlasCod) )
            {
               GXv_char15[0] = A396EmprCod ;
               GXv_int9[0] = A30AlbProCod ;
               GXv_int14[0] = A129BarCod ;
               GXv_int12[0] = A132BarCodReo ;
               GXv_char3[0] = A130BarCodPar ;
               GXv_int11[0] = AV12NumFac ;
               GXv_int7[0] = AV13NumLin ;
               GXv_char2[0] = " " ;
               GXv_int10[0] = AV72FlagSal ;
               GXv_int13[0] = (short)(0) ;
               GXv_int6[0] = AV73CliFac ;
               new app.facturacion.pfacau15(remoteHandle, context).execute( GXv_char15, GXv_int9, GXv_int14, GXv_int12, GXv_char3, GXv_int11, GXv_int7, GXv_char2, GXv_int10, GXv_int13, GXv_int6) ;
               facturacionmanual_documentos.this.A396EmprCod = GXv_char15[0] ;
               facturacionmanual_documentos.this.A30AlbProCod = GXv_int9[0] ;
               facturacionmanual_documentos.this.A129BarCod = GXv_int14[0] ;
               facturacionmanual_documentos.this.A132BarCodReo = GXv_int12[0] ;
               facturacionmanual_documentos.this.A130BarCodPar = GXv_char3[0] ;
               facturacionmanual_documentos.this.AV12NumFac = GXv_int11[0] ;
               facturacionmanual_documentos.this.AV13NumLin = GXv_int7[0] ;
               facturacionmanual_documentos.this.AV72FlagSal = GXv_int10[0] ;
               facturacionmanual_documentos.this.AV73CliFac = GXv_int6[0] ;
               AV64FlagAlb = (byte)(1) ;
            }
            pr_default.readNext(3);
         }
         pr_default.close(3);
         A33AlbProEst = (byte)(2) ;
         A1782AlbProEso = (byte)(2) ;
         /* Using cursor P0A0214 */
         pr_default.execute(12, new Object[] {Byte.valueOf(A33AlbProEst), Byte.valueOf(A1782AlbProEso), A396EmprCod, Long.valueOf(A30AlbProCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
   }

   public void S141( )
   {
      /* 'COMERCIAL' Routine */
      returnInSub = false ;
      /* Using cursor P0A0215 */
      pr_default.execute(13, new Object[] {A396EmprCod, Long.valueOf(AV142Documento)});
      while ( (pr_default.getStatus(13) != 101) )
      {
         A14AlbComCod = P0A0215_A14AlbComCod[0] ;
         A16AlbComEst = P0A0215_A16AlbComEst[0] ;
         A1783AlbComEso = P0A0215_A1783AlbComEso[0] ;
         AV28FlagFac2 = (byte)(0) ;
         /* Using cursor P0A0216 */
         pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
         while ( (pr_default.getStatus(14) != 101) )
         {
            A15AlbComDsc = P0A0216_A15AlbComDsc[0] ;
            A13AlbComCnt = P0A0216_A13AlbComCnt[0] ;
            A21AlbComPre = P0A0216_A21AlbComPre[0] ;
            A4717AlbComUni = P0A0216_A4717AlbComUni[0] ;
            A20AlbComLin = P0A0216_A20AlbComLin[0] ;
            AV13NumLin = (int)(AV13NumLin+1) ;
            AV28FlagFac2 = (byte)(1) ;
            /*
               INSERT RECORD ON TABLE TXPLFAVEN

            */
            A430FacCod = AV12NumFac ;
            A446FacLin = AV13NumLin ;
            A427FacAlbCod = A14AlbComCod ;
            A428FacAlbTip = (byte)(2) ;
            A432FacDsc = A15AlbComDsc ;
            if ( AV107Itram == 1 )
            {
               A447FacMts = DecimalUtil.doubleToDec(0) ;
               A449FacPreMts = DecimalUtil.doubleToDec(0) ;
               A444FacKgs = A13AlbComCnt ;
               A448FacPreKgs = A21AlbComPre ;
            }
            else
            {
               A444FacKgs = DecimalUtil.doubleToDec(0) ;
               A448FacPreKgs = DecimalUtil.doubleToDec(0) ;
               A12197FacUnds = 0 ;
               A12198FacPreUnd = DecimalUtil.doubleToDec(0) ;
               A447FacMts = A13AlbComCnt ;
               A449FacPreMts = A21AlbComPre ;
               if ( A4717AlbComUni == 4 )
               {
                  A12197FacUnds = (int)(DecimalUtil.decToDouble(A13AlbComCnt)) ;
                  A12198FacPreUnd = A21AlbComPre ;
                  A447FacMts = DecimalUtil.doubleToDec(0) ;
                  A449FacPreMts = DecimalUtil.doubleToDec(0) ;
               }
            }
            A3397FacFasCod = " " ;
            A454FacSer = httpContext.getMessage( "COMERCIAL", "") ;
            AV157Message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
            AV157Message.setgxTv_SdtMessages_Message_Id( "0" );
            AV157Message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "Lfaven.LALCOM. Nº Documento ", "")+GXutil.trim( GXutil.str( A14AlbComCod, 8, 0))+httpContext.getMessage( "Nº Factura ", "")+GXutil.trim( GXutil.str( AV12NumFac, 8, 0))+httpContext.getMessage( " FacLin ", "")+GXutil.trim( GXutil.str( AV13NumLin, 6, 0)) );
            AV155Messages.add(AV157Message, 0);
            /* Using cursor P0A0217 */
            pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod), Integer.valueOf(A446FacLin), Long.valueOf(A427FacAlbCod), Byte.valueOf(A428FacAlbTip), A454FacSer, A432FacDsc, A447FacMts, A449FacPreMts, A444FacKgs, A448FacPreKgs, A3397FacFasCod, Integer.valueOf(A12197FacUnds), A12198FacPreUnd});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFAVEN");
            if ( (pr_default.getStatus(15) == 1) )
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
            pr_default.readNext(14);
         }
         pr_default.close(14);
         A16AlbComEst = (byte)(2) ;
         A1783AlbComEso = (byte)(2) ;
         /* Using cursor P0A0218 */
         pr_default.execute(16, new Object[] {Byte.valueOf(A16AlbComEst), Byte.valueOf(A1783AlbComEso), A396EmprCod, Integer.valueOf(A14AlbComCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALCOM");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(13);
   }

   public void S151( )
   {
      /* 'INICIO' Routine */
      returnInSub = false ;
      GXv_int12[0] = AV34Flag ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ESTAMP", ""), GXv_int12) ;
      facturacionmanual_documentos.this.AV34Flag = GXv_int12[0] ;
      GXt_int16 = AV105Erfoc ;
      GXv_int12[0] = GXt_int16 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ERFOC", ""), GXv_int12) ;
      facturacionmanual_documentos.this.GXt_int16 = GXv_int12[0] ;
      AV105Erfoc = GXt_int16 ;
      GXt_char17 = AV22msg0 ;
      GXv_char15[0] = GXt_char17 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WMSG255_", ""), (byte)(99), GXv_char15) ;
      facturacionmanual_documentos.this.GXt_char17 = GXv_char15[0] ;
      AV22msg0 = GXt_char17 ;
      /* Using cursor P0A0219 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(AV73CliFac)});
      while ( (pr_default.getStatus(17) != 101) )
      {
         A252CliCod = P0A0219_A252CliCod[0] ;
         n252CliCod = P0A0219_n252CliCod[0] ;
         A3073RepCod = P0A0219_A3073RepCod[0] ;
         AV82RepCod = A3073RepCod ;
         pr_default.readNext(17);
      }
      pr_default.close(17);
      GXv_int12[0] = AV79FlagDsc ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FACDSC", ""), GXv_int12) ;
      facturacionmanual_documentos.this.AV79FlagDsc = GXv_int12[0] ;
      GXv_int12[0] = AV83FlagFacPro ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FACPRO", ""), GXv_int12) ;
      facturacionmanual_documentos.this.AV83FlagFacPro = GXv_int12[0] ;
      GXv_int12[0] = AV95FlagPorRec ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PORREC", ""), GXv_int12) ;
      facturacionmanual_documentos.this.AV95FlagPorRec = GXv_int12[0] ;
      GXv_int12[0] = AV101FacCru ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FACCRU", ""), GXv_int12) ;
      facturacionmanual_documentos.this.AV101FacCru = GXv_int12[0] ;
      GXt_int16 = AV102Carvema ;
      GXv_int12[0] = GXt_int16 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CARVEM", ""), GXv_int12) ;
      facturacionmanual_documentos.this.GXt_int16 = GXv_int12[0] ;
      AV102Carvema = GXt_int16 ;
      GXt_int16 = AV107Itram ;
      GXv_int12[0] = GXt_int16 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ITRAM", ""), GXv_int12) ;
      facturacionmanual_documentos.this.GXt_int16 = GXv_int12[0] ;
      AV107Itram = GXt_int16 ;
      GXt_int16 = AV113Moda21 ;
      GXv_int12[0] = GXt_int16 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int12) ;
      facturacionmanual_documentos.this.GXt_int16 = GXv_int12[0] ;
      AV113Moda21 = GXt_int16 ;
      GXt_int16 = AV117Tinamar ;
      GXv_int12[0] = GXt_int16 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TINAMA", ""), GXv_int12) ;
      facturacionmanual_documentos.this.GXt_int16 = GXv_int12[0] ;
      AV117Tinamar = GXt_int16 ;
      GXt_int16 = AV121vts ;
      GXv_int12[0] = GXt_int16 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "VELLUT", ""), GXv_int12) ;
      facturacionmanual_documentos.this.GXt_int16 = GXv_int12[0] ;
      AV121vts = GXt_int16 ;
      GXv_int12[0] = AV122FlagRieClF ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "RIECLF", ""), GXv_int12) ;
      facturacionmanual_documentos.this.AV122FlagRieClF = GXv_int12[0] ;
      AV18ContCod = "040100" ;
      if ( GXutil.strcmp(AV9PRIO, "1") == 0 )
      {
         AV18ContCod = "040200" ;
      }
      AV13NumLin = 0 ;
      /* Using cursor P0A0220 */
      pr_default.execute(18, new Object[] {A396EmprCod, AV18ContCod});
      while ( (pr_default.getStatus(18) != 101) )
      {
         A313ContCod = P0A0220_A313ContCod[0] ;
         A316ContVal = P0A0220_A316ContVal[0] ;
         A953IvaCod = P0A0220_A953IvaCod[0] ;
         n953IvaCod = P0A0220_n953IvaCod[0] ;
         A953IvaCod = P0A0220_A953IvaCod[0] ;
         n953IvaCod = P0A0220_n953IvaCod[0] ;
         AV12NumFac = A316ContVal ;
         AV69IvaCod = A953IvaCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(18);
      /* Using cursor P0A0221 */
      pr_default.execute(19, new Object[] {AV69IvaCod});
      while ( (pr_default.getStatus(19) != 101) )
      {
         A953IvaCod = P0A0221_A953IvaCod[0] ;
         n953IvaCod = P0A0221_n953IvaCod[0] ;
         A588IvaPor = P0A0221_A588IvaPor[0] ;
         n588IvaPor = P0A0221_n588IvaPor[0] ;
         A589IvaRec = P0A0221_A589IvaRec[0] ;
         n589IvaRec = P0A0221_n589IvaRec[0] ;
         AV70IvaPor = A588IvaPor ;
         AV71IvaRec = A589IvaRec ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(19);
      AV12NumFac = (int)(AV12NumFac+1) ;
      /* Using cursor P0A0222 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(AV73CliFac)});
      while ( (pr_default.getStatus(20) != 101) )
      {
         A252CliCod = P0A0222_A252CliCod[0] ;
         n252CliCod = P0A0222_n252CliCod[0] ;
         A3140CliDivCod = P0A0222_A3140CliDivCod[0] ;
         n3140CliDivCod = P0A0222_n3140CliDivCod[0] ;
         A3091CliDivTra = P0A0222_A3091CliDivTra[0] ;
         n3091CliDivTra = P0A0222_n3091CliDivTra[0] ;
         A858ZonGeoCod = P0A0222_A858ZonGeoCod[0] ;
         A2028CliImpMin = P0A0222_A2028CliImpMin[0] ;
         n2028CliImpMin = P0A0222_n2028CliImpMin[0] ;
         AV74FacDivCod = A3140CliDivCod ;
         AV75FacDivTCod = A3091CliDivTra ;
         AV77Extranjero = httpContext.getMessage( "N", "") ;
         if ( ( A858ZonGeoCod == 999 ) || ( A858ZonGeoCod == 998 ) )
         {
            AV77Extranjero = httpContext.getMessage( "S", "") ;
         }
         AV96CliImpMin = A2028CliImpMin ;
         /* Using cursor P0A0223 */
         pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), AV9PRIO});
         while ( (pr_default.getStatus(21) != 101) )
         {
            A297CliPri = P0A0223_A297CliPri[0] ;
            A497FpgCod = P0A0223_A497FpgCod[0] ;
            A261CliDtoGrl = P0A0223_A261CliDtoGrl[0] ;
            A262CliDtoPpg = P0A0223_A262CliDtoPpg[0] ;
            A6630CliDto = P0A0223_A6630CliDto[0] ;
            A299CliRegIVA = P0A0223_A299CliRegIVA[0] ;
            A280CliNroVto = P0A0223_A280CliNroVto[0] ;
            A296CliPrd = P0A0223_A296CliPrd[0] ;
            A259CliDiaPag = P0A0223_A259CliDiaPag[0] ;
            AV14CodFpg = A497FpgCod ;
            AV15DtoGen = A261CliDtoGrl ;
            AV16DtoPP = A262CliDtoPpg ;
            AV106Clidto = A6630CliDto ;
            AV17RegIVA = A299CliRegIVA ;
            AV19CliNroVto = A280CliNroVto ;
            AV20CliPrd = A296CliPrd ;
            AV21CliDiaPag = A259CliDiaPag ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(21);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(20);
      GXt_int16 = AV115Torient ;
      GXv_int12[0] = GXt_int16 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TORIEN", ""), GXv_int12) ;
      facturacionmanual_documentos.this.GXt_int16 = GXv_int12[0] ;
      AV115Torient = GXt_int16 ;
      GX_I = 1 ;
      while ( GX_I <= 1000 )
      {
         AV118Tab_alb[GX_I-1] = 0 ;
         GX_I = (int)(GX_I+1) ;
      }
   }

   public void S137( )
   {
      /* 'KILOS' Routine */
      returnInSub = false ;
      AV100BarKgm = DecimalUtil.doubleToDec(0) ;
      AV99BarMtr = DecimalUtil.doubleToDec(0) ;
      /* Optimized group. */
      /* Using cursor P0A0224 */
      pr_default.execute(22, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      c203BarPieKil = P0A0224_A203BarPieKil[0] ;
      c205BarPieMet = P0A0224_A205BarPieMet[0] ;
      pr_default.close(22);
      AV100BarKgm = AV100BarKgm.add(c203BarPieKil) ;
      AV99BarMtr = AV99BarMtr.add(c205BarPieMet) ;
      /* End optimized group. */
   }

   public void S125( )
   {
      /* 'OBSFAC' Routine */
      returnInSub = false ;
      AV29ArtObsFac = "" ;
      /* Using cursor P0A0225 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(AV8CliCod), AV30BarSer});
      while ( (pr_default.getStatus(23) != 101) )
      {
         A65ArtCod = P0A0225_A65ArtCod[0] ;
         A252CliCod = P0A0225_A252CliCod[0] ;
         n252CliCod = P0A0225_n252CliCod[0] ;
         A90ArtObsFac = P0A0225_A90ArtObsFac[0] ;
         n90ArtObsFac = P0A0225_n90ArtObsFac[0] ;
         AV29ArtObsFac = A90ArtObsFac ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(23);
   }

   protected void cleanup( )
   {
      this.aP5[0] = facturacionmanual_documentos.this.AV73CliFac;
      this.aP7[0] = facturacionmanual_documentos.this.AV12NumFac;
      this.aP9[0] = facturacionmanual_documentos.this.AV159json_messages;
      this.aP10[0] = facturacionmanual_documentos.this.AV158Error;
      Application.commitDataStores(context, remoteHandle, pr_default, "facturacion.facturacionmanual_documentos");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV159json_messages = "" ;
      AV155Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV137Documentos_Produccion_Comercial_SDT = new GXBaseCollection<app.facturacion.SdtDocumentos_Produccion_Comercial_SDT_Item>(app.facturacion.SdtDocumentos_Produccion_Comercial_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      AV138Documentos_Produccion_Comercial_SDTItem = new app.facturacion.SdtDocumentos_Produccion_Comercial_SDT_Item(remoteHandle, context);
      AV140Tipo = "" ;
      A436FacFch = GXutil.nullDate() ;
      A450FacPri = "" ;
      A437FacFpg = "" ;
      AV14CodFpg = "" ;
      A433FacDtoGen = DecimalUtil.ZERO ;
      AV15DtoGen = DecimalUtil.ZERO ;
      A434FacDtoPP = DecimalUtil.ZERO ;
      AV16DtoPP = DecimalUtil.ZERO ;
      A6632FacDto = DecimalUtil.ZERO ;
      AV106Clidto = DecimalUtil.ZERO ;
      AV77Extranjero = "" ;
      A453FacRECPor = DecimalUtil.ZERO ;
      AV17RegIVA = "" ;
      AV71IvaRec = DecimalUtil.ZERO ;
      A1151FacPer = "" ;
      AV20CliPrd = "" ;
      A1152FacDiaPag = "" ;
      AV21CliDiaPag = "" ;
      A960FacIVACod = "" ;
      AV69IvaCod = "" ;
      A2739FacSerNum = "" ;
      A965FacCob = "" ;
      A3096FacDivTCod = "" ;
      AV75FacDivTCod = "" ;
      A3119FacRepCod = "" ;
      AV82RepCod = "" ;
      A9606FacHor = GXutil.resetTime( GXutil.nullDate() );
      A11513FacRecIca = DecimalUtil.ZERO ;
      A8346FacRecI = DecimalUtil.ZERO ;
      A7212FacRect = DecimalUtil.ZERO ;
      A11629MeivaId = "" ;
      AV146stMeivaId = "" ;
      A14219FacEnergia = DecimalUtil.ZERO ;
      AV147CliEnergia = DecimalUtil.ZERO ;
      A14222FacCostMts = DecimalUtil.ZERO ;
      AV143FacCostMts = DecimalUtil.ZERO ;
      A14223FacCostKgs = DecimalUtil.ZERO ;
      AV144FacCostkgs = DecimalUtil.ZERO ;
      A14224FacCostFac = DecimalUtil.ZERO ;
      AV148FacCostFactor = DecimalUtil.ZERO ;
      AV18ContCod = "" ;
      AV149facidate = "" ;
      AV150FacSerAT = "" ;
      AV151FacTipAT = "" ;
      AV163Pgmdesc = "" ;
      A14230FacIDATe = "" ;
      A14236FacSerAT = "" ;
      A14237FacTipAT = "" ;
      Gx_emsg = "" ;
      AV152Cadena = "" ;
      AV153firma = "" ;
      AV154Hash = "" ;
      GXv_objcol_SdtMessages_Message4 = new GXBaseCollection[1] ;
      GXv_boolean5 = new boolean[1] ;
      AV157Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      AV123Noseusa = DecimalUtil.ZERO ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      scmdbuf = "" ;
      P0A024_A396EmprCod = new String[] {""} ;
      P0A024_A30AlbProCod = new long[1] ;
      P0A024_A33AlbProEst = new byte[1] ;
      P0A024_A1782AlbProEso = new byte[1] ;
      P0A025_A396EmprCod = new String[] {""} ;
      P0A025_A30AlbProCod = new long[1] ;
      P0A025_A212BarSer = new String[] {""} ;
      P0A025_A1262BarPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A025_A1264BarPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A025_A12196BarPreUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A025_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A025_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A025_A12195BarAlbUnd = new int[1] ;
      P0A025_A40AlbProRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A025_A1652BarSerDsc = new String[] {""} ;
      P0A025_A136BarColNum = new int[1] ;
      P0A025_A135BarColNom = new String[] {""} ;
      P0A025_A2010BarTipDis = new String[] {""} ;
      P0A025_A1503BarPart = new short[1] ;
      P0A025_A2761AlbBarRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A025_A4812BarEncCli = new String[] {""} ;
      P0A025_A218BarTipCol = new byte[1] ;
      P0A025_A1234BarNomCli = new String[] {""} ;
      P0A025_A1235BarNumCli = new int[1] ;
      P0A025_A5354AlbImpMan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A025_A2762AlbBarDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A025_n2762AlbBarDto = new boolean[] {false} ;
      P0A025_A217BarTipArt = new short[1] ;
      P0A025_n217BarTipArt = new boolean[] {false} ;
      P0A025_A3746BarNPed = new String[] {""} ;
      P0A025_A252CliCod = new int[1] ;
      P0A025_n252CliCod = new boolean[] {false} ;
      P0A025_A4466BarAcaAnh = new short[1] ;
      P0A025_A130BarCodPar = new String[] {""} ;
      P0A025_A132BarCodReo = new byte[1] ;
      P0A025_A129BarCod = new int[1] ;
      P0A025_A32AlbProEsp = new byte[1] ;
      P0A025_A1206TubCod = new short[1] ;
      P0A025_n1206TubCod = new boolean[] {false} ;
      P0A025_A143BarDisNum = new String[] {""} ;
      P0A025_A1798BarDibCli = new String[] {""} ;
      P0A025_A6466PlasCod = new short[1] ;
      P0A025_n6466PlasCod = new boolean[] {false} ;
      P0A025_A6467BarAlbPlas = new short[1] ;
      A212BarSer = "" ;
      A1262BarPreKgm = DecimalUtil.ZERO ;
      A1264BarPreMtr = DecimalUtil.ZERO ;
      A12196BarPreUnd = DecimalUtil.ZERO ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      A40AlbProRec = DecimalUtil.ZERO ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A2010BarTipDis = "" ;
      A2761AlbBarRec = DecimalUtil.ZERO ;
      A4812BarEncCli = "" ;
      A1234BarNomCli = "" ;
      A5354AlbImpMan = DecimalUtil.ZERO ;
      A2762AlbBarDto = DecimalUtil.ZERO ;
      A3746BarNPed = "" ;
      A130BarCodPar = "" ;
      A143BarDisNum = "" ;
      A1798BarDibCli = "" ;
      AV30BarSer = "" ;
      AV31BarDisNum = "" ;
      AV87BarCodPar = "" ;
      P0A026_A396EmprCod = new String[] {""} ;
      P0A026_A30AlbProCod = new long[1] ;
      P0A026_A129BarCod = new int[1] ;
      P0A026_A132BarCodReo = new byte[1] ;
      P0A026_A130BarCodPar = new String[] {""} ;
      P0A026_A758ProCod = new String[] {""} ;
      P0A026_n758ProCod = new boolean[] {false} ;
      P0A026_A1468AlbPrdLin = new short[1] ;
      A758ProCod = "" ;
      AV116Procod = "" ;
      AV29ArtObsFac = "" ;
      A1296FacBarPar = "" ;
      A454FacSer = "" ;
      A448FacPreKgs = DecimalUtil.ZERO ;
      A449FacPreMts = DecimalUtil.ZERO ;
      A12198FacPreUnd = DecimalUtil.ZERO ;
      A444FacKgs = DecimalUtil.ZERO ;
      AV100BarKgm = DecimalUtil.ZERO ;
      A447FacMts = DecimalUtil.ZERO ;
      AV99BarMtr = DecimalUtil.ZERO ;
      A451FacRec = DecimalUtil.ZERO ;
      A3397FacFasCod = "" ;
      A432FacDsc = "" ;
      AV78FacDsc = "" ;
      A1498FacDisNum = "" ;
      A3097FacTipPro = "" ;
      A3897FacKgsA = DecimalUtil.ZERO ;
      A4814FacEncCli = "" ;
      A3878FacColNom = "" ;
      A3881FacNomCol = "" ;
      A5353FacImpMan = DecimalUtil.ZERO ;
      A5050FacBonLi = DecimalUtil.ZERO ;
      A3898FacPreKgsA = DecimalUtil.ZERO ;
      A5355FacImpMin = DecimalUtil.ZERO ;
      AV96CliImpMin = DecimalUtil.ZERO ;
      AV145CliImpMnEst = DecimalUtil.ZERO ;
      A3884FacProCod = "" ;
      GXv_char1 = new String[1] ;
      AV38BarDibCli = "" ;
      P0A028_A396EmprCod = new String[] {""} ;
      P0A028_A30AlbProCod = new long[1] ;
      P0A028_A129BarCod = new int[1] ;
      P0A028_A132BarCodReo = new byte[1] ;
      P0A028_A130BarCodPar = new String[] {""} ;
      P0A028_A212BarSer = new String[] {""} ;
      P0A028_A1536AlbEComPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A028_n1536AlbEComPre = new boolean[] {false} ;
      P0A028_A1534AlbEComP = new short[1] ;
      P0A028_n1534AlbEComP = new boolean[] {false} ;
      P0A028_A1533AlbEComM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A028_n1533AlbEComM = new boolean[] {false} ;
      P0A028_A1056DisComCod = new String[] {""} ;
      P0A028_A1032FonCod = new String[] {""} ;
      P0A028_A4812BarEncCli = new String[] {""} ;
      P0A028_A217BarTipArt = new short[1] ;
      P0A028_n217BarTipArt = new boolean[] {false} ;
      P0A028_A2524DisComLin = new byte[1] ;
      A1536AlbEComPre = DecimalUtil.ZERO ;
      A1533AlbEComM = DecimalUtil.ZERO ;
      A1056DisComCod = "" ;
      A1032FonCod = "" ;
      P0A0210_A396EmprCod = new String[] {""} ;
      P0A0210_A30AlbProCod = new long[1] ;
      P0A0210_A129BarCod = new int[1] ;
      P0A0210_A132BarCodReo = new byte[1] ;
      P0A0210_A130BarCodPar = new String[] {""} ;
      P0A0210_A212BarSer = new String[] {""} ;
      P0A0210_A460FasDsc = new String[] {""} ;
      P0A0210_A457FasCod = new String[] {""} ;
      P0A0210_A2010BarTipDis = new String[] {""} ;
      P0A0210_A1458BarAlbBul = new short[1] ;
      P0A0210_A1503BarPart = new short[1] ;
      P0A0210_A4812BarEncCli = new String[] {""} ;
      P0A0210_A7752GuiFasRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A0210_n7752GuiFasRec = new boolean[] {false} ;
      P0A0210_A7751GuiFasDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A0210_n7751GuiFasDto = new boolean[] {false} ;
      P0A0210_A217BarTipArt = new short[1] ;
      P0A0210_n217BarTipArt = new boolean[] {false} ;
      P0A0210_A1276FasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A0210_A1275FasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A0210_A1241GuiFasPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A0210_A1242GuiFasPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A0210_A12194FasPreUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A0210_A12193FasUnd = new int[1] ;
      P0A0210_A1240GuiFasLin = new short[1] ;
      A460FasDsc = "" ;
      A457FasCod = "" ;
      A7752GuiFasRec = DecimalUtil.ZERO ;
      A7751GuiFasDto = DecimalUtil.ZERO ;
      A1276FasMtr = DecimalUtil.ZERO ;
      A1275FasKgm = DecimalUtil.ZERO ;
      A1241GuiFasPKg = DecimalUtil.ZERO ;
      A1242GuiFasPMt = DecimalUtil.ZERO ;
      A12194FasPreUnd = DecimalUtil.ZERO ;
      AV23Metros = DecimalUtil.ZERO ;
      AV24Kilos = DecimalUtil.ZERO ;
      AV25PrecioKg = DecimalUtil.ZERO ;
      AV26PrecioMt = DecimalUtil.ZERO ;
      AV125PrecioUn = DecimalUtil.ZERO ;
      P0A0212_A396EmprCod = new String[] {""} ;
      P0A0212_A30AlbProCod = new long[1] ;
      P0A0212_A129BarCod = new int[1] ;
      P0A0212_A132BarCodReo = new byte[1] ;
      P0A0212_A130BarCodPar = new String[] {""} ;
      P0A0212_A212BarSer = new String[] {""} ;
      P0A0212_A2765AlbHdrTxt = new String[] {""} ;
      P0A0212_A1503BarPart = new short[1] ;
      P0A0212_A4812BarEncCli = new String[] {""} ;
      P0A0212_A2770ALbHdrMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A0212_A2768AlbHdrKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A0212_A2767AlbHdrPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A0212_A2769AlbHdrPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A0212_A2764AlbHdrLin = new short[1] ;
      A2765AlbHdrTxt = "" ;
      A2770ALbHdrMts = DecimalUtil.ZERO ;
      A2768AlbHdrKgs = DecimalUtil.ZERO ;
      A2767AlbHdrPKg = DecimalUtil.ZERO ;
      A2769AlbHdrPMt = DecimalUtil.ZERO ;
      GXv_int9 = new long[1] ;
      GXv_int14 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_int11 = new int[1] ;
      GXv_int7 = new int[1] ;
      GXv_char2 = new String[1] ;
      GXv_int10 = new byte[1] ;
      GXv_int13 = new short[1] ;
      GXv_int6 = new int[1] ;
      P0A0215_A396EmprCod = new String[] {""} ;
      P0A0215_A14AlbComCod = new int[1] ;
      P0A0215_A16AlbComEst = new byte[1] ;
      P0A0215_A1783AlbComEso = new byte[1] ;
      P0A0216_A396EmprCod = new String[] {""} ;
      P0A0216_A14AlbComCod = new int[1] ;
      P0A0216_A15AlbComDsc = new String[] {""} ;
      P0A0216_A13AlbComCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A0216_A21AlbComPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A0216_A4717AlbComUni = new byte[1] ;
      P0A0216_A20AlbComLin = new short[1] ;
      A15AlbComDsc = "" ;
      A13AlbComCnt = DecimalUtil.ZERO ;
      A21AlbComPre = DecimalUtil.ZERO ;
      AV22msg0 = "" ;
      GXt_char17 = "" ;
      GXv_char15 = new String[1] ;
      P0A0219_A396EmprCod = new String[] {""} ;
      P0A0219_A252CliCod = new int[1] ;
      P0A0219_n252CliCod = new boolean[] {false} ;
      P0A0219_A3073RepCod = new String[] {""} ;
      A3073RepCod = "" ;
      P0A0220_A396EmprCod = new String[] {""} ;
      P0A0220_A313ContCod = new String[] {""} ;
      P0A0220_A316ContVal = new int[1] ;
      P0A0220_A953IvaCod = new String[] {""} ;
      P0A0220_n953IvaCod = new boolean[] {false} ;
      A313ContCod = "" ;
      A953IvaCod = "" ;
      P0A0221_A953IvaCod = new String[] {""} ;
      P0A0221_n953IvaCod = new boolean[] {false} ;
      P0A0221_A588IvaPor = new byte[1] ;
      P0A0221_n588IvaPor = new boolean[] {false} ;
      P0A0221_A589IvaRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A0221_n589IvaRec = new boolean[] {false} ;
      A589IvaRec = DecimalUtil.ZERO ;
      P0A0222_A396EmprCod = new String[] {""} ;
      P0A0222_A252CliCod = new int[1] ;
      P0A0222_n252CliCod = new boolean[] {false} ;
      P0A0222_A3140CliDivCod = new byte[1] ;
      P0A0222_n3140CliDivCod = new boolean[] {false} ;
      P0A0222_A3091CliDivTra = new String[] {""} ;
      P0A0222_n3091CliDivTra = new boolean[] {false} ;
      P0A0222_A858ZonGeoCod = new short[1] ;
      P0A0222_A2028CliImpMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A0222_n2028CliImpMin = new boolean[] {false} ;
      A3091CliDivTra = "" ;
      A2028CliImpMin = DecimalUtil.ZERO ;
      P0A0223_A396EmprCod = new String[] {""} ;
      P0A0223_A252CliCod = new int[1] ;
      P0A0223_n252CliCod = new boolean[] {false} ;
      P0A0223_A297CliPri = new String[] {""} ;
      P0A0223_A497FpgCod = new String[] {""} ;
      P0A0223_A261CliDtoGrl = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A0223_A262CliDtoPpg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A0223_A6630CliDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A0223_A299CliRegIVA = new String[] {""} ;
      P0A0223_A280CliNroVto = new byte[1] ;
      P0A0223_A296CliPrd = new String[] {""} ;
      P0A0223_A259CliDiaPag = new String[] {""} ;
      A297CliPri = "" ;
      A497FpgCod = "" ;
      A261CliDtoGrl = DecimalUtil.ZERO ;
      A262CliDtoPpg = DecimalUtil.ZERO ;
      A6630CliDto = DecimalUtil.ZERO ;
      A299CliRegIVA = "" ;
      A296CliPrd = "" ;
      A259CliDiaPag = "" ;
      GXv_int12 = new byte[1] ;
      AV118Tab_alb = new long[1000] ;
      c203BarPieKil = DecimalUtil.ZERO ;
      c205BarPieMet = DecimalUtil.ZERO ;
      P0A0224_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A0224_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A0225_A396EmprCod = new String[] {""} ;
      P0A0225_A65ArtCod = new String[] {""} ;
      P0A0225_A252CliCod = new int[1] ;
      P0A0225_n252CliCod = new boolean[] {false} ;
      P0A0225_A90ArtObsFac = new String[] {""} ;
      P0A0225_n90ArtObsFac = new boolean[] {false} ;
      A65ArtCod = "" ;
      A90ArtObsFac = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.facturacionmanual_documentos__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P0A024_A396EmprCod, P0A024_A30AlbProCod, P0A024_A33AlbProEst, P0A024_A1782AlbProEso
            }
            , new Object[] {
            P0A025_A396EmprCod, P0A025_A30AlbProCod, P0A025_A212BarSer, P0A025_A1262BarPreKgm, P0A025_A1264BarPreMtr, P0A025_A12196BarPreUnd, P0A025_A1261BarAlbKgmE, P0A025_A1263BarAlbMtrE, P0A025_A12195BarAlbUnd, P0A025_A40AlbProRec,
            P0A025_A1652BarSerDsc, P0A025_A136BarColNum, P0A025_A135BarColNom, P0A025_A2010BarTipDis, P0A025_A1503BarPart, P0A025_A2761AlbBarRec, P0A025_A4812BarEncCli, P0A025_A218BarTipCol, P0A025_A1234BarNomCli, P0A025_A1235BarNumCli,
            P0A025_A5354AlbImpMan, P0A025_A2762AlbBarDto, P0A025_n2762AlbBarDto, P0A025_A217BarTipArt, P0A025_n217BarTipArt, P0A025_A3746BarNPed, P0A025_A252CliCod, P0A025_n252CliCod, P0A025_A4466BarAcaAnh, P0A025_A130BarCodPar,
            P0A025_A132BarCodReo, P0A025_A129BarCod, P0A025_A32AlbProEsp, P0A025_A1206TubCod, P0A025_n1206TubCod, P0A025_A143BarDisNum, P0A025_A1798BarDibCli, P0A025_A6466PlasCod, P0A025_n6466PlasCod, P0A025_A6467BarAlbPlas
            }
            , new Object[] {
            P0A026_A396EmprCod, P0A026_A30AlbProCod, P0A026_A129BarCod, P0A026_A132BarCodReo, P0A026_A130BarCodPar, P0A026_A758ProCod, P0A026_n758ProCod, P0A026_A1468AlbPrdLin
            }
            , new Object[] {
            }
            , new Object[] {
            P0A028_A396EmprCod, P0A028_A30AlbProCod, P0A028_A129BarCod, P0A028_A132BarCodReo, P0A028_A130BarCodPar, P0A028_A212BarSer, P0A028_A1536AlbEComPre, P0A028_n1536AlbEComPre, P0A028_A1534AlbEComP, P0A028_n1534AlbEComP,
            P0A028_A1533AlbEComM, P0A028_n1533AlbEComM, P0A028_A1056DisComCod, P0A028_A1032FonCod, P0A028_A4812BarEncCli, P0A028_A217BarTipArt, P0A028_n217BarTipArt, P0A028_A2524DisComLin
            }
            , new Object[] {
            }
            , new Object[] {
            P0A0210_A396EmprCod, P0A0210_A30AlbProCod, P0A0210_A129BarCod, P0A0210_A132BarCodReo, P0A0210_A130BarCodPar, P0A0210_A212BarSer, P0A0210_A460FasDsc, P0A0210_A457FasCod, P0A0210_A2010BarTipDis, P0A0210_A1458BarAlbBul,
            P0A0210_A1503BarPart, P0A0210_A4812BarEncCli, P0A0210_A7752GuiFasRec, P0A0210_n7752GuiFasRec, P0A0210_A7751GuiFasDto, P0A0210_n7751GuiFasDto, P0A0210_A217BarTipArt, P0A0210_n217BarTipArt, P0A0210_A1276FasMtr, P0A0210_A1275FasKgm,
            P0A0210_A1241GuiFasPKg, P0A0210_A1242GuiFasPMt, P0A0210_A12194FasPreUnd, P0A0210_A12193FasUnd, P0A0210_A1240GuiFasLin
            }
            , new Object[] {
            }
            , new Object[] {
            P0A0212_A396EmprCod, P0A0212_A30AlbProCod, P0A0212_A129BarCod, P0A0212_A132BarCodReo, P0A0212_A130BarCodPar, P0A0212_A212BarSer, P0A0212_A2765AlbHdrTxt, P0A0212_A1503BarPart, P0A0212_A4812BarEncCli, P0A0212_A2770ALbHdrMts,
            P0A0212_A2768AlbHdrKgs, P0A0212_A2767AlbHdrPKg, P0A0212_A2769AlbHdrPMt, P0A0212_A2764AlbHdrLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P0A0215_A396EmprCod, P0A0215_A14AlbComCod, P0A0215_A16AlbComEst, P0A0215_A1783AlbComEso
            }
            , new Object[] {
            P0A0216_A396EmprCod, P0A0216_A14AlbComCod, P0A0216_A15AlbComDsc, P0A0216_A13AlbComCnt, P0A0216_A21AlbComPre, P0A0216_A4717AlbComUni, P0A0216_A20AlbComLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P0A0219_A396EmprCod, P0A0219_A252CliCod, P0A0219_A3073RepCod
            }
            , new Object[] {
            P0A0220_A396EmprCod, P0A0220_A313ContCod, P0A0220_A316ContVal, P0A0220_A953IvaCod, P0A0220_n953IvaCod
            }
            , new Object[] {
            P0A0221_A953IvaCod, P0A0221_A588IvaPor, P0A0221_n588IvaPor, P0A0221_A589IvaRec, P0A0221_n589IvaRec
            }
            , new Object[] {
            P0A0222_A396EmprCod, P0A0222_A252CliCod, P0A0222_A3140CliDivCod, P0A0222_n3140CliDivCod, P0A0222_A3091CliDivTra, P0A0222_n3091CliDivTra, P0A0222_A858ZonGeoCod, P0A0222_A2028CliImpMin, P0A0222_n2028CliImpMin
            }
            , new Object[] {
            P0A0223_A396EmprCod, P0A0223_A252CliCod, P0A0223_A297CliPri, P0A0223_A497FpgCod, P0A0223_A261CliDtoGrl, P0A0223_A262CliDtoPpg, P0A0223_A6630CliDto, P0A0223_A299CliRegIVA, P0A0223_A280CliNroVto, P0A0223_A296CliPrd,
            P0A0223_A259CliDiaPag
            }
            , new Object[] {
            P0A0224_A203BarPieKil, P0A0224_A205BarPieMet
            }
            , new Object[] {
            P0A0225_A396EmprCod, P0A0225_A65ArtCod, P0A0225_A252CliCod, P0A0225_A90ArtObsFac, P0A0225_n90ArtObsFac
            }
         }
      );
      AV163Pgmdesc = httpContext.getMessage( "Facturacion Manual Documentos (produccion y Comercial)", "") ;
      /* GeneXus formulas. */
      AV163Pgmdesc = httpContext.getMessage( "Facturacion Manual Documentos (produccion y Comercial)", "") ;
      Gx_err = (short)(0) ;
   }

   private byte A443FacIVAPor ;
   private byte AV70IvaPor ;
   private byte A1150FacNumVto ;
   private byte AV19CliNroVto ;
   private byte A3115FacDivCod ;
   private byte AV74FacDivCod ;
   private byte A435FacEst ;
   private byte A1153FacTipFac ;
   private byte AV122FlagRieClF ;
   private byte A33AlbProEst ;
   private byte A1782AlbProEso ;
   private byte A218BarTipCol ;
   private byte A132BarCodReo ;
   private byte A32AlbProEsp ;
   private byte AV86BarCodReo ;
   private byte AV72FlagSal ;
   private byte AV64FlagAlb ;
   private byte AV34Flag ;
   private byte AV32LenSer ;
   private byte AV33LenColNom ;
   private byte AV83FlagFacPro ;
   private byte A1295FacBarReo ;
   private byte A428FacAlbTip ;
   private byte AV101FacCru ;
   private byte AV79FlagDsc ;
   private byte AV76FlagTint ;
   private byte AV95FlagPorRec ;
   private byte A3880FacTipColC ;
   private byte AV113Moda21 ;
   private byte AV117Tinamar ;
   private byte AV107Itram ;
   private byte AV121vts ;
   private byte AV126intcod ;
   private byte A12693FacInt ;
   private byte AV37LenDib ;
   private byte A2524DisComLin ;
   private byte AV35LenFon ;
   private byte AV36LenCom ;
   private byte AV80FlagJime ;
   private byte AV105Erfoc ;
   private byte AV112Mafitex ;
   private byte AV108Magosa ;
   private byte AV98PLinea ;
   private byte AV92Texknit ;
   private byte AV93Martex ;
   private byte GXv_int10[] ;
   private byte A16AlbComEst ;
   private byte A1783AlbComEso ;
   private byte AV28FlagFac2 ;
   private byte A4717AlbComUni ;
   private byte AV102Carvema ;
   private byte A588IvaPor ;
   private byte A3140CliDivCod ;
   private byte A280CliNroVto ;
   private byte AV115Torient ;
   private byte GXt_int16 ;
   private byte GXv_int12[] ;
   private short AV158Error ;
   private short Gx_err ;
   private short A1503BarPart ;
   private short A217BarTipArt ;
   private short A4466BarAcaAnh ;
   private short A1206TubCod ;
   private short A6466PlasCod ;
   private short A6467BarAlbPlas ;
   private short A1468AlbPrdLin ;
   private short A3303FacNPart ;
   private short A5189FacTipArt ;
   private short A12906FacCadEnc ;
   private short A1534AlbEComP ;
   private short A1458BarAlbBul ;
   private short A1240GuiFasLin ;
   private short A2764AlbHdrLin ;
   private short GXv_int13[] ;
   private short A20AlbComLin ;
   private short A858ZonGeoCod ;
   private int AV8CliCod ;
   private int AV73CliFac ;
   private int AV12NumFac ;
   private int AV162GXV1 ;
   private int AV13NumLin ;
   private int GX_INS43 ;
   private int A430FacCod ;
   private int A252CliCod ;
   private int A445FacLiC ;
   private int A316ContVal ;
   private int A12195BarAlbUnd ;
   private int A136BarColNum ;
   private int A1235BarNumCli ;
   private int A129BarCod ;
   private int AV85BarCod ;
   private int GX_INS44 ;
   private int A446FacLin ;
   private int A1294FacBarCod ;
   private int A12197FacUnds ;
   private int A3879FocColNum ;
   private int A3882FacNumCol ;
   private int A3883FacCliCod ;
   private int A12193FasUnd ;
   private int AV124Unidades ;
   private int GXv_int14[] ;
   private int GXv_int11[] ;
   private int GXv_int7[] ;
   private int GXv_int6[] ;
   private int A14AlbComCod ;
   private int GX_I ;
   private long AV142Documento ;
   private long A30AlbProCod ;
   private long AV88AlbProCod ;
   private long A427FacAlbCod ;
   private long GXv_int9[] ;
   private long AV118Tab_alb[] ;
   private java.math.BigDecimal A433FacDtoGen ;
   private java.math.BigDecimal AV15DtoGen ;
   private java.math.BigDecimal A434FacDtoPP ;
   private java.math.BigDecimal AV16DtoPP ;
   private java.math.BigDecimal A6632FacDto ;
   private java.math.BigDecimal AV106Clidto ;
   private java.math.BigDecimal A453FacRECPor ;
   private java.math.BigDecimal AV71IvaRec ;
   private java.math.BigDecimal A11513FacRecIca ;
   private java.math.BigDecimal A8346FacRecI ;
   private java.math.BigDecimal A7212FacRect ;
   private java.math.BigDecimal A14219FacEnergia ;
   private java.math.BigDecimal AV147CliEnergia ;
   private java.math.BigDecimal A14222FacCostMts ;
   private java.math.BigDecimal AV143FacCostMts ;
   private java.math.BigDecimal A14223FacCostKgs ;
   private java.math.BigDecimal AV144FacCostkgs ;
   private java.math.BigDecimal A14224FacCostFac ;
   private java.math.BigDecimal AV148FacCostFactor ;
   private java.math.BigDecimal AV123Noseusa ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal A1262BarPreKgm ;
   private java.math.BigDecimal A1264BarPreMtr ;
   private java.math.BigDecimal A12196BarPreUnd ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal A40AlbProRec ;
   private java.math.BigDecimal A2761AlbBarRec ;
   private java.math.BigDecimal A5354AlbImpMan ;
   private java.math.BigDecimal A2762AlbBarDto ;
   private java.math.BigDecimal A448FacPreKgs ;
   private java.math.BigDecimal A449FacPreMts ;
   private java.math.BigDecimal A12198FacPreUnd ;
   private java.math.BigDecimal A444FacKgs ;
   private java.math.BigDecimal AV100BarKgm ;
   private java.math.BigDecimal A447FacMts ;
   private java.math.BigDecimal AV99BarMtr ;
   private java.math.BigDecimal A451FacRec ;
   private java.math.BigDecimal A3897FacKgsA ;
   private java.math.BigDecimal A5353FacImpMan ;
   private java.math.BigDecimal A5050FacBonLi ;
   private java.math.BigDecimal A3898FacPreKgsA ;
   private java.math.BigDecimal A5355FacImpMin ;
   private java.math.BigDecimal AV96CliImpMin ;
   private java.math.BigDecimal AV145CliImpMnEst ;
   private java.math.BigDecimal A1536AlbEComPre ;
   private java.math.BigDecimal A1533AlbEComM ;
   private java.math.BigDecimal A7752GuiFasRec ;
   private java.math.BigDecimal A7751GuiFasDto ;
   private java.math.BigDecimal A1276FasMtr ;
   private java.math.BigDecimal A1275FasKgm ;
   private java.math.BigDecimal A1241GuiFasPKg ;
   private java.math.BigDecimal A1242GuiFasPMt ;
   private java.math.BigDecimal A12194FasPreUnd ;
   private java.math.BigDecimal AV23Metros ;
   private java.math.BigDecimal AV24Kilos ;
   private java.math.BigDecimal AV25PrecioKg ;
   private java.math.BigDecimal AV26PrecioMt ;
   private java.math.BigDecimal AV125PrecioUn ;
   private java.math.BigDecimal A2770ALbHdrMts ;
   private java.math.BigDecimal A2768AlbHdrKgs ;
   private java.math.BigDecimal A2767AlbHdrPKg ;
   private java.math.BigDecimal A2769AlbHdrPMt ;
   private java.math.BigDecimal A13AlbComCnt ;
   private java.math.BigDecimal A21AlbComPre ;
   private java.math.BigDecimal A589IvaRec ;
   private java.math.BigDecimal A2028CliImpMin ;
   private java.math.BigDecimal A261CliDtoGrl ;
   private java.math.BigDecimal A262CliDtoPpg ;
   private java.math.BigDecimal A6630CliDto ;
   private java.math.BigDecimal c203BarPieKil ;
   private java.math.BigDecimal c205BarPieMet ;
   private String A396EmprCod ;
   private String AV9PRIO ;
   private String AV11FacSerNum ;
   private String AV140Tipo ;
   private String A450FacPri ;
   private String A437FacFpg ;
   private String AV14CodFpg ;
   private String AV77Extranjero ;
   private String AV17RegIVA ;
   private String A1151FacPer ;
   private String AV20CliPrd ;
   private String A1152FacDiaPag ;
   private String AV21CliDiaPag ;
   private String A960FacIVACod ;
   private String AV69IvaCod ;
   private String A2739FacSerNum ;
   private String A965FacCob ;
   private String A3096FacDivTCod ;
   private String AV75FacDivTCod ;
   private String A3119FacRepCod ;
   private String AV82RepCod ;
   private String A11629MeivaId ;
   private String AV146stMeivaId ;
   private String AV18ContCod ;
   private String AV149facidate ;
   private String AV150FacSerAT ;
   private String AV151FacTipAT ;
   private String AV163Pgmdesc ;
   private String A14230FacIDATe ;
   private String A14236FacSerAT ;
   private String A14237FacTipAT ;
   private String Gx_emsg ;
   private String AV152Cadena ;
   private String AV153firma ;
   private String AV154Hash ;
   private String scmdbuf ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A2010BarTipDis ;
   private String A4812BarEncCli ;
   private String A1234BarNomCli ;
   private String A3746BarNPed ;
   private String A130BarCodPar ;
   private String A143BarDisNum ;
   private String A1798BarDibCli ;
   private String AV30BarSer ;
   private String AV31BarDisNum ;
   private String AV87BarCodPar ;
   private String A758ProCod ;
   private String AV116Procod ;
   private String AV29ArtObsFac ;
   private String A1296FacBarPar ;
   private String A454FacSer ;
   private String A3397FacFasCod ;
   private String A432FacDsc ;
   private String AV78FacDsc ;
   private String A1498FacDisNum ;
   private String A3097FacTipPro ;
   private String A4814FacEncCli ;
   private String A3878FacColNom ;
   private String A3881FacNomCol ;
   private String A3884FacProCod ;
   private String GXv_char1[] ;
   private String AV38BarDibCli ;
   private String A1056DisComCod ;
   private String A1032FonCod ;
   private String A460FasDsc ;
   private String A457FasCod ;
   private String A2765AlbHdrTxt ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String A15AlbComDsc ;
   private String AV22msg0 ;
   private String GXt_char17 ;
   private String GXv_char15[] ;
   private String A3073RepCod ;
   private String A313ContCod ;
   private String A953IvaCod ;
   private String A3091CliDivTra ;
   private String A297CliPri ;
   private String A497FpgCod ;
   private String A299CliRegIVA ;
   private String A296CliPrd ;
   private String A259CliDiaPag ;
   private String A65ArtCod ;
   private String A90ArtObsFac ;
   private java.util.Date AV114FacHor ;
   private java.util.Date A9606FacHor ;
   private java.util.Date AV10FacFch ;
   private java.util.Date A436FacFch ;
   private boolean returnInSub ;
   private boolean n252CliCod ;
   private boolean n3115FacDivCod ;
   private boolean n3096FacDivTCod ;
   private boolean n3119FacRepCod ;
   private boolean n8346FacRecI ;
   private boolean n11629MeivaId ;
   private boolean AV156ok ;
   private boolean GXv_boolean5[] ;
   private boolean n2762AlbBarDto ;
   private boolean n217BarTipArt ;
   private boolean n1206TubCod ;
   private boolean n6466PlasCod ;
   private boolean n758ProCod ;
   private boolean n1536AlbEComPre ;
   private boolean n1534AlbEComP ;
   private boolean n1533AlbEComM ;
   private boolean n7752GuiFasRec ;
   private boolean n7751GuiFasDto ;
   private boolean n953IvaCod ;
   private boolean n588IvaPor ;
   private boolean n589IvaRec ;
   private boolean n3140CliDivCod ;
   private boolean n3091CliDivTra ;
   private boolean n2028CliImpMin ;
   private boolean n90ArtObsFac ;
   private String AV136Json_produccion_comercial ;
   private String AV159json_messages ;
   private short[] aP10 ;
   private int[] aP5 ;
   private int[] aP7 ;
   private String[] aP9 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A024_A396EmprCod ;
   private long[] P0A024_A30AlbProCod ;
   private byte[] P0A024_A33AlbProEst ;
   private byte[] P0A024_A1782AlbProEso ;
   private String[] P0A025_A396EmprCod ;
   private long[] P0A025_A30AlbProCod ;
   private String[] P0A025_A212BarSer ;
   private java.math.BigDecimal[] P0A025_A1262BarPreKgm ;
   private java.math.BigDecimal[] P0A025_A1264BarPreMtr ;
   private java.math.BigDecimal[] P0A025_A12196BarPreUnd ;
   private java.math.BigDecimal[] P0A025_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] P0A025_A1263BarAlbMtrE ;
   private int[] P0A025_A12195BarAlbUnd ;
   private java.math.BigDecimal[] P0A025_A40AlbProRec ;
   private String[] P0A025_A1652BarSerDsc ;
   private int[] P0A025_A136BarColNum ;
   private String[] P0A025_A135BarColNom ;
   private String[] P0A025_A2010BarTipDis ;
   private short[] P0A025_A1503BarPart ;
   private java.math.BigDecimal[] P0A025_A2761AlbBarRec ;
   private String[] P0A025_A4812BarEncCli ;
   private byte[] P0A025_A218BarTipCol ;
   private String[] P0A025_A1234BarNomCli ;
   private int[] P0A025_A1235BarNumCli ;
   private java.math.BigDecimal[] P0A025_A5354AlbImpMan ;
   private java.math.BigDecimal[] P0A025_A2762AlbBarDto ;
   private boolean[] P0A025_n2762AlbBarDto ;
   private short[] P0A025_A217BarTipArt ;
   private boolean[] P0A025_n217BarTipArt ;
   private String[] P0A025_A3746BarNPed ;
   private int[] P0A025_A252CliCod ;
   private boolean[] P0A025_n252CliCod ;
   private short[] P0A025_A4466BarAcaAnh ;
   private String[] P0A025_A130BarCodPar ;
   private byte[] P0A025_A132BarCodReo ;
   private int[] P0A025_A129BarCod ;
   private byte[] P0A025_A32AlbProEsp ;
   private short[] P0A025_A1206TubCod ;
   private boolean[] P0A025_n1206TubCod ;
   private String[] P0A025_A143BarDisNum ;
   private String[] P0A025_A1798BarDibCli ;
   private short[] P0A025_A6466PlasCod ;
   private boolean[] P0A025_n6466PlasCod ;
   private short[] P0A025_A6467BarAlbPlas ;
   private String[] P0A026_A396EmprCod ;
   private long[] P0A026_A30AlbProCod ;
   private int[] P0A026_A129BarCod ;
   private byte[] P0A026_A132BarCodReo ;
   private String[] P0A026_A130BarCodPar ;
   private String[] P0A026_A758ProCod ;
   private boolean[] P0A026_n758ProCod ;
   private short[] P0A026_A1468AlbPrdLin ;
   private String[] P0A028_A396EmprCod ;
   private long[] P0A028_A30AlbProCod ;
   private int[] P0A028_A129BarCod ;
   private byte[] P0A028_A132BarCodReo ;
   private String[] P0A028_A130BarCodPar ;
   private String[] P0A028_A212BarSer ;
   private java.math.BigDecimal[] P0A028_A1536AlbEComPre ;
   private boolean[] P0A028_n1536AlbEComPre ;
   private short[] P0A028_A1534AlbEComP ;
   private boolean[] P0A028_n1534AlbEComP ;
   private java.math.BigDecimal[] P0A028_A1533AlbEComM ;
   private boolean[] P0A028_n1533AlbEComM ;
   private String[] P0A028_A1056DisComCod ;
   private String[] P0A028_A1032FonCod ;
   private String[] P0A028_A4812BarEncCli ;
   private short[] P0A028_A217BarTipArt ;
   private boolean[] P0A028_n217BarTipArt ;
   private byte[] P0A028_A2524DisComLin ;
   private String[] P0A0210_A396EmprCod ;
   private long[] P0A0210_A30AlbProCod ;
   private int[] P0A0210_A129BarCod ;
   private byte[] P0A0210_A132BarCodReo ;
   private String[] P0A0210_A130BarCodPar ;
   private String[] P0A0210_A212BarSer ;
   private String[] P0A0210_A460FasDsc ;
   private String[] P0A0210_A457FasCod ;
   private String[] P0A0210_A2010BarTipDis ;
   private short[] P0A0210_A1458BarAlbBul ;
   private short[] P0A0210_A1503BarPart ;
   private String[] P0A0210_A4812BarEncCli ;
   private java.math.BigDecimal[] P0A0210_A7752GuiFasRec ;
   private boolean[] P0A0210_n7752GuiFasRec ;
   private java.math.BigDecimal[] P0A0210_A7751GuiFasDto ;
   private boolean[] P0A0210_n7751GuiFasDto ;
   private short[] P0A0210_A217BarTipArt ;
   private boolean[] P0A0210_n217BarTipArt ;
   private java.math.BigDecimal[] P0A0210_A1276FasMtr ;
   private java.math.BigDecimal[] P0A0210_A1275FasKgm ;
   private java.math.BigDecimal[] P0A0210_A1241GuiFasPKg ;
   private java.math.BigDecimal[] P0A0210_A1242GuiFasPMt ;
   private java.math.BigDecimal[] P0A0210_A12194FasPreUnd ;
   private int[] P0A0210_A12193FasUnd ;
   private short[] P0A0210_A1240GuiFasLin ;
   private String[] P0A0212_A396EmprCod ;
   private long[] P0A0212_A30AlbProCod ;
   private int[] P0A0212_A129BarCod ;
   private byte[] P0A0212_A132BarCodReo ;
   private String[] P0A0212_A130BarCodPar ;
   private String[] P0A0212_A212BarSer ;
   private String[] P0A0212_A2765AlbHdrTxt ;
   private short[] P0A0212_A1503BarPart ;
   private String[] P0A0212_A4812BarEncCli ;
   private java.math.BigDecimal[] P0A0212_A2770ALbHdrMts ;
   private java.math.BigDecimal[] P0A0212_A2768AlbHdrKgs ;
   private java.math.BigDecimal[] P0A0212_A2767AlbHdrPKg ;
   private java.math.BigDecimal[] P0A0212_A2769AlbHdrPMt ;
   private short[] P0A0212_A2764AlbHdrLin ;
   private String[] P0A0215_A396EmprCod ;
   private int[] P0A0215_A14AlbComCod ;
   private byte[] P0A0215_A16AlbComEst ;
   private byte[] P0A0215_A1783AlbComEso ;
   private String[] P0A0216_A396EmprCod ;
   private int[] P0A0216_A14AlbComCod ;
   private String[] P0A0216_A15AlbComDsc ;
   private java.math.BigDecimal[] P0A0216_A13AlbComCnt ;
   private java.math.BigDecimal[] P0A0216_A21AlbComPre ;
   private byte[] P0A0216_A4717AlbComUni ;
   private short[] P0A0216_A20AlbComLin ;
   private String[] P0A0219_A396EmprCod ;
   private int[] P0A0219_A252CliCod ;
   private boolean[] P0A0219_n252CliCod ;
   private String[] P0A0219_A3073RepCod ;
   private String[] P0A0220_A396EmprCod ;
   private String[] P0A0220_A313ContCod ;
   private int[] P0A0220_A316ContVal ;
   private String[] P0A0220_A953IvaCod ;
   private boolean[] P0A0220_n953IvaCod ;
   private String[] P0A0221_A953IvaCod ;
   private boolean[] P0A0221_n953IvaCod ;
   private byte[] P0A0221_A588IvaPor ;
   private boolean[] P0A0221_n588IvaPor ;
   private java.math.BigDecimal[] P0A0221_A589IvaRec ;
   private boolean[] P0A0221_n589IvaRec ;
   private String[] P0A0222_A396EmprCod ;
   private int[] P0A0222_A252CliCod ;
   private boolean[] P0A0222_n252CliCod ;
   private byte[] P0A0222_A3140CliDivCod ;
   private boolean[] P0A0222_n3140CliDivCod ;
   private String[] P0A0222_A3091CliDivTra ;
   private boolean[] P0A0222_n3091CliDivTra ;
   private short[] P0A0222_A858ZonGeoCod ;
   private java.math.BigDecimal[] P0A0222_A2028CliImpMin ;
   private boolean[] P0A0222_n2028CliImpMin ;
   private String[] P0A0223_A396EmprCod ;
   private int[] P0A0223_A252CliCod ;
   private boolean[] P0A0223_n252CliCod ;
   private String[] P0A0223_A297CliPri ;
   private String[] P0A0223_A497FpgCod ;
   private java.math.BigDecimal[] P0A0223_A261CliDtoGrl ;
   private java.math.BigDecimal[] P0A0223_A262CliDtoPpg ;
   private java.math.BigDecimal[] P0A0223_A6630CliDto ;
   private String[] P0A0223_A299CliRegIVA ;
   private byte[] P0A0223_A280CliNroVto ;
   private String[] P0A0223_A296CliPrd ;
   private String[] P0A0223_A259CliDiaPag ;
   private java.math.BigDecimal[] P0A0224_A203BarPieKil ;
   private java.math.BigDecimal[] P0A0224_A205BarPieMet ;
   private String[] P0A0225_A396EmprCod ;
   private String[] P0A0225_A65ArtCod ;
   private int[] P0A0225_A252CliCod ;
   private boolean[] P0A0225_n252CliCod ;
   private String[] P0A0225_A90ArtObsFac ;
   private boolean[] P0A0225_n90ArtObsFac ;
   private GXBaseCollection<app.facturacion.SdtDocumentos_Produccion_Comercial_SDT_Item> AV137Documentos_Produccion_Comercial_SDT ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV155Messages ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message4[] ;
   private com.genexus.SdtMessages_Message AV157Message ;
   private app.facturacion.SdtDocumentos_Produccion_Comercial_SDT_Item AV138Documentos_Produccion_Comercial_SDTItem ;
}

final  class facturacionmanual_documentos__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P0A022", "INSERT INTO TXPCFAVEN(EmprCod, FacCod, FacFch, FacPri, CliCod, FacFpg, FacDtoGen, FacDtoPP, FacIVAPor, FacRECPor, FacEst, FacLiC, FacIVACod, FacCob, FacNumVto, FacPer, FacDiaPag, FacTipFac, FacSerNum, FacDivTCod, FacDivCod, FacRepCod, FacDto, FacRect, FacRecI, FacHor, FacRecIca, MeivaId, FacEnergia, FacCostFac, FacCostMts, FacCostKgs, FacIDATe, FacSerAT, FacTipAT, FacRegIva, FacObs, Factrm, FacFirma, FacLiq1, FacLiq2, FacIva1, FacTot1, FacFirDg, FacCliPgL, FacAran, FacBrut, FacNet, FacInc, FacFre, FacExp, FacObs2, FacMan, FacTpFra, FacAnulada, FacFecAnul, MotAnuID, FacSFD, FacMsgATe, FacIDATc, FacMsgATc, FacIDATd, FacMsgATd, FacEnvMail) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', ' ', 0, ' ', 0, 0, 0, 0, ' ', 0, ' ', 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCFAVEN")
         ,new UpdateCursor("P0A023", "UPDATE TXPEMPLIN SET ContVal=?  WHERE EmprCod = ? and ContCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPEMPLIN")
         ,new ForEachCursor("P0A024", "SELECT EmprCod, AlbProCod, AlbProEst, AlbProEso FROM TXPCALPRD WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod  FOR UPDATE OF AlbProEst, AlbProEso NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0A025", "SELECT T1.EmprCod, T1.AlbProCod, T2.BarSer, T1.BarPreKgm, T1.BarPreMtr, T1.BarPreUnd, T1.BarAlbKgmE, T1.BarAlbMtrE, T1.BarAlbUnd, T1.AlbProRec, T2.BarSerDsc, T2.BarColNum, T2.BarColNom, T2.BarTipDis, T2.BarPart, T1.AlbBarRec, T2.BarEncCli, T2.BarTipCol, T2.BarNomCli, T2.BarNumCli, T1.AlbImpMan, T1.AlbBarDto, T2.BarTipArt, T2.BarNPed, T2.CliCod, T2.BarAcaAnh, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.AlbProEsp, T1.TubCod, T2.BarDisNum, T2.BarDibCli, T1.PlasCod, T1.BarAlbPlas FROM (TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ? and T1.AlbProCod = ?) AND (T1.AlbProEsp = 0 or T1.AlbProEsp >= 10) ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A026", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, ProCod, AlbPrdLin FROM TXPALBPRD WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (AlbProCod = ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P0A027", "INSERT INTO TXPLFAVEN(EmprCod, FacCod, FacLin, FacAlbCod, FacAlbTip, FacSer, FacDsc, FacMts, FacPreMts, FacKgs, FacPreKgs, FacRec, FacBarCod, FacBarReo, FacBarPar, FacDisNum, FacTipPro, FacNPart, FacFasCod, FacColNom, FocColNum, FacTipColC, FacNomCol, FacNumCol, FacCliCod, FacProCod, FacPreKgsA, FacEncCli, FacBonLi, FacTipArt, FacImpMan, FacImpMin, FacKgsA, FacUnds, FacPreUnd, FacInt, FacCadEnc, FacDsc2, FacDishCod, FacCosPQ, FacImpdto, FacDtoL, FacPKDto, FacPMdto, FacImpd, FacDscII, FacAcs, FacFecAlb, FacLinTRM, FACLinTRMF) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', ' ', 0, 0, 0, 0, 0, 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLFAVEN")
         ,new ForEachCursor("P0A028", "SELECT T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.BarSer, T1.AlbEComPre, T1.AlbEComP, T1.AlbEComM, T1.DisComCod, T1.FonCod, T2.BarEncCli, T2.BarTipArt, T1.DisComLin FROM (TXPALBEST T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.AlbProCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.DisComCod, T1.FonCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P0A029", "INSERT INTO TXPLFAVEN(EmprCod, FacCod, FacLin, FacAlbCod, FacAlbTip, FacSer, FacDsc, FacMts, FacPreMts, FacKgs, FacPreKgs, FacRec, FacBarCod, FacBarReo, FacBarPar, FacDisNum, FacFasCod, FacCliCod, FacEncCli, FacTipArt, FacImpMan, FacImpMin, FacTipPro, FacNPart, FacColNom, FocColNum, FacTipColC, FacNomCol, FacNumCol, FacProCod, FacPreKgsA, FacDsc2, FacBonLi, FacDishCod, FacCosPQ, FacImpdto, FacDtoL, FacPKDto, FacPMdto, FacImpd, FacDscII, FacAcs, FacKgsA, FacFecAlb, FacUnds, FacPreUnd, FacInt, FacCadEnc, FacLinTRM, FACLinTRMF) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, ' ', 0, 0, ' ', 0, ' ', 0, ' ', 0, ' ', 0, 0, 0, 0, 0, 0, ' ', ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLFAVEN")
         ,new ForEachCursor("P0A0210", "SELECT T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T3.BarSer, T2.FasDsc, T1.FasCod, T3.BarTipDis, T4.BarAlbBul, T3.BarPart, T3.BarEncCli, T1.GuiFasRec, T1.GuiFasDto, T3.BarTipArt, T1.FasMtr, T1.FasKgm, T1.GuiFasPKg, T1.GuiFasPMt, T1.FasPreUnd, T1.FasUnd, T1.GuiFasLin FROM (((TXPALBFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) INNER JOIN TXPALBBAR T4 ON T4.EmprCod = T1.EmprCod AND T4.AlbProCod = T1.AlbProCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.AlbProCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.GuiFasLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P0A0211", "INSERT INTO TXPLFAVEN(EmprCod, FacCod, FacLin, FacAlbCod, FacAlbTip, FacSer, FacDsc, FacMts, FacPreMts, FacKgs, FacPreKgs, FacRec, FacBarCod, FacBarReo, FacBarPar, FacDisNum, FacTipPro, FacNPart, FacFasCod, FacCliCod, FacPreKgsA, FacEncCli, FacBonLi, FacTipArt, FacImpMan, FacImpMin, FacKgsA, FacUnds, FacPreUnd, FacColNom, FocColNum, FacTipColC, FacNomCol, FacNumCol, FacProCod, FacDsc2, FacDishCod, FacCosPQ, FacImpdto, FacDtoL, FacPKDto, FacPMdto, FacImpd, FacDscII, FacAcs, FacFecAlb, FacInt, FacCadEnc, FacLinTRM, FACLinTRMF) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, 0, ' ', 0, ' ', ' ', ' ', 0, 0, 0, 0, 0, 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLFAVEN")
         ,new ForEachCursor("P0A0212", "SELECT T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T3.BarSer, T1.AlbHdrTxt, T3.BarPart, T3.BarEncCli, T1.ALbHdrMts, T1.AlbHdrKgs, T1.AlbHdrPKg, T1.AlbHdrPMt, T1.AlbHdrLin FROM ((TXPALBTXT T1 INNER JOIN TXPCALPRD T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbProCod = T1.AlbProCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.AlbProCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P0A0213", "INSERT INTO TXPLFAVEN(EmprCod, FacCod, FacLin, FacAlbCod, FacAlbTip, FacSer, FacDsc, FacMts, FacPreMts, FacKgs, FacPreKgs, FacBarCod, FacBarReo, FacBarPar, FacDisNum, FacNPart, FacFasCod, FacCliCod, FacEncCli, FacBonLi, FacImpMan, FacImpMin, FacRec, FacTipPro, FacColNom, FocColNum, FacTipColC, FacNomCol, FacNumCol, FacProCod, FacPreKgsA, FacDsc2, FacDishCod, FacTipArt, FacCosPQ, FacImpdto, FacDtoL, FacPKDto, FacPMdto, FacImpd, FacDscII, FacAcs, FacKgsA, FacFecAlb, FacUnds, FacPreUnd, FacInt, FacCadEnc, FacLinTRM, FACLinTRMF) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ' ', ' ', 0, 0, ' ', 0, ' ', 0, ' ', ' ', 0, 0, 0, 0, 0, 0, 0, ' ', ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLFAVEN")
         ,new UpdateCursor("P0A0214", "UPDATE TXPCALPRD SET AlbProEst=?, AlbProEso=?  WHERE EmprCod = ? AND AlbProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALPRD")
         ,new ForEachCursor("P0A0215", "SELECT EmprCod, AlbComCod, AlbComEst, AlbComEso FROM TXPCALCOM WHERE EmprCod = ? and AlbComCod = ? ORDER BY EmprCod, AlbComCod  FOR UPDATE OF AlbComEst, AlbComEso NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0A0216", "SELECT EmprCod, AlbComCod, AlbComDsc, AlbComCnt, AlbComPre, AlbComUni, AlbComLin FROM TXPLALCOM WHERE EmprCod = ? and AlbComCod = ? ORDER BY EmprCod, AlbComCod, AlbComLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P0A0217", "INSERT INTO TXPLFAVEN(EmprCod, FacCod, FacLin, FacAlbCod, FacAlbTip, FacSer, FacDsc, FacMts, FacPreMts, FacKgs, FacPreKgs, FacFasCod, FacUnds, FacPreUnd, FacRec, FacBarCod, FacBarReo, FacBarPar, FacDisNum, FacTipPro, FacNPart, FacColNom, FocColNum, FacTipColC, FacNomCol, FacNumCol, FacCliCod, FacProCod, FacPreKgsA, FacDsc2, FacEncCli, FacBonLi, FacDishCod, FacTipArt, FacImpMan, FacImpMin, FacCosPQ, FacImpdto, FacDtoL, FacPKDto, FacPMdto, FacImpd, FacDscII, FacAcs, FacKgsA, FacFecAlb, FacInt, FacCadEnc, FacLinTRM, FACLinTRMF) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, ' ', ' ', ' ', 0, ' ', 0, 0, ' ', 0, 0, ' ', 0, ' ', ' ', 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLFAVEN")
         ,new UpdateCursor("P0A0218", "UPDATE TXPCALCOM SET AlbComEst=?, AlbComEso=?  WHERE EmprCod = ? AND AlbComCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALCOM")
         ,new ForEachCursor("P0A0219", "SELECT EmprCod, CliCod, RepCod FROM TXPCOMREP WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A0220", "SELECT T1.EmprCod, T1.ContCod, T1.ContVal, T2.IvaCod FROM (TXPEMPLIN T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) WHERE T1.EmprCod = ? and T1.ContCod = ? ORDER BY T1.EmprCod, T1.ContCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0A0221", "SELECT IvaCod, IvaPor, IvaRec FROM TXPTIPIVA WHERE IvaCod = ? ORDER BY IvaCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0A0222", "SELECT EmprCod, CliCod, CliDivCod, CliDivTra, ZonGeoCod, CliImpMin FROM TXPCLIENT WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0A0223", "SELECT EmprCod, CliCod, CliPri, FpgCod, CliDtoGrl, CliDtoPpg, CliDto, CliRegIVA, CliNroVto, CliPrd, CliDiaPag FROM TXPCLIFPG WHERE EmprCod = ? and CliCod = ? and CliPri = ? ORDER BY EmprCod, CliCod, CliPri ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0A0224", "SELECT SUM(T2.BarPieKil), SUM(T2.BarPieMet) FROM (TXPLALPRD T1 INNER JOIN TXPBARPIE T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar AND T2.BarPieCod = T1.BarPieCod) WHERE T1.EmprCod = ? and T1.AlbProCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A0225", "SELECT EmprCod, ArtCod, CliCod, ArtObsFac FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,5);
               ((String[]) buf[10])[0] = rslt.getString(11, 26);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 13);
               ((String[]) buf[13])[0] = rslt.getString(14, 1);
               ((short[]) buf[14])[0] = rslt.getShort(15);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(16,2);
               ((String[]) buf[16])[0] = rslt.getString(17, 20);
               ((byte[]) buf[17])[0] = rslt.getByte(18);
               ((String[]) buf[18])[0] = rslt.getString(19, 13);
               ((int[]) buf[19])[0] = rslt.getInt(20);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(21,2);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(22,2);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((short[]) buf[23])[0] = rslt.getShort(23);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(24, 20);
               ((int[]) buf[26])[0] = rslt.getInt(25);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((short[]) buf[28])[0] = rslt.getShort(26);
               ((String[]) buf[29])[0] = rslt.getString(27, 1);
               ((byte[]) buf[30])[0] = rslt.getByte(28);
               ((int[]) buf[31])[0] = rslt.getInt(29);
               ((byte[]) buf[32])[0] = rslt.getByte(30);
               ((short[]) buf[33])[0] = rslt.getShort(31);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(32, 8);
               ((String[]) buf[36])[0] = rslt.getString(33, 16);
               ((short[]) buf[37])[0] = rslt.getShort(34);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((short[]) buf[39])[0] = rslt.getShort(35);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(7);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 12);
               ((String[]) buf[13])[0] = rslt.getString(11, 12);
               ((String[]) buf[14])[0] = rslt.getString(12, 20);
               ((short[]) buf[15])[0] = rslt.getShort(13);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((byte[]) buf[17])[0] = rslt.getByte(14);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((String[]) buf[6])[0] = rslt.getString(7, 28);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 20);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(15);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(16,2);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(17,2);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(18,5);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(19,5);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(20,5);
               ((int[]) buf[23])[0] = rslt.getInt(21);
               ((short[]) buf[24])[0] = rslt.getShort(22);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 20);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,5);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,5);
               ((short[]) buf[13])[0] = rslt.getShort(14);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 5);
               ((String[]) buf[10])[0] = rslt.getString(11, 6);
               return;
            case 22 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
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
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setString(4, (String)parms[3], 1);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[5]).intValue());
               }
               stmt.setString(6, (String)parms[6], 2);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[7], 2);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[8], 2);
               stmt.setByte(9, ((Number) parms[9]).byteValue());
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[10], 3);
               stmt.setByte(11, ((Number) parms[11]).byteValue());
               stmt.setInt(12, ((Number) parms[12]).intValue());
               stmt.setString(13, (String)parms[13], 3);
               stmt.setString(14, (String)parms[14], 1);
               stmt.setByte(15, ((Number) parms[15]).byteValue());
               stmt.setString(16, (String)parms[16], 5);
               stmt.setString(17, (String)parms[17], 6);
               stmt.setByte(18, ((Number) parms[18]).byteValue());
               stmt.setString(19, (String)parms[19], 3);
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(20, (String)parms[21], 1);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(21, ((Number) parms[23]).byteValue());
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[25], 6);
               }
               stmt.setBigDecimal(23, (java.math.BigDecimal)parms[26], 2);
               stmt.setBigDecimal(24, (java.math.BigDecimal)parms[27], 2);
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(25, (java.math.BigDecimal)parms[29], 2);
               }
               stmt.setDateTime(26, (java.util.Date)parms[30], false);
               stmt.setBigDecimal(27, (java.math.BigDecimal)parms[31], 3);
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(28, (String)parms[33], 4);
               }
               stmt.setBigDecimal(29, (java.math.BigDecimal)parms[34], 2);
               stmt.setBigDecimal(30, (java.math.BigDecimal)parms[35], 2);
               stmt.setBigDecimal(31, (java.math.BigDecimal)parms[36], 2);
               stmt.setBigDecimal(32, (java.math.BigDecimal)parms[37], 2);
               stmt.setString(33, (String)parms[38], 20);
               stmt.setString(34, (String)parms[39], 20);
               stmt.setString(35, (String)parms[40], 4);
               return;
            case 1 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setLong(5, ((Number) parms[4]).longValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 16);
               stmt.setString(7, (String)parms[6], 40);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 2);
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[8], 5);
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[9], 2);
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[10], 5);
               stmt.setBigDecimal(12, (java.math.BigDecimal)parms[11], 5);
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setByte(14, ((Number) parms[13]).byteValue());
               stmt.setString(15, (String)parms[14], 1);
               stmt.setString(16, (String)parms[15], 8);
               stmt.setString(17, (String)parms[16], 1);
               stmt.setShort(18, ((Number) parms[17]).shortValue());
               stmt.setString(19, (String)parms[18], 8);
               stmt.setString(20, (String)parms[19], 13);
               stmt.setInt(21, ((Number) parms[20]).intValue());
               stmt.setByte(22, ((Number) parms[21]).byteValue());
               stmt.setString(23, (String)parms[22], 13);
               stmt.setInt(24, ((Number) parms[23]).intValue());
               stmt.setInt(25, ((Number) parms[24]).intValue());
               stmt.setString(26, (String)parms[25], 8);
               stmt.setBigDecimal(27, (java.math.BigDecimal)parms[26], 5);
               stmt.setString(28, (String)parms[27], 20);
               stmt.setBigDecimal(29, (java.math.BigDecimal)parms[28], 2);
               stmt.setShort(30, ((Number) parms[29]).shortValue());
               stmt.setBigDecimal(31, (java.math.BigDecimal)parms[30], 2);
               stmt.setBigDecimal(32, (java.math.BigDecimal)parms[31], 2);
               stmt.setBigDecimal(33, (java.math.BigDecimal)parms[32], 2);
               stmt.setInt(34, ((Number) parms[33]).intValue());
               stmt.setBigDecimal(35, (java.math.BigDecimal)parms[34], 5);
               stmt.setByte(36, ((Number) parms[35]).byteValue());
               stmt.setShort(37, ((Number) parms[36]).shortValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 16);
               stmt.setString(7, (String)parms[6], 40);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 2);
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[8], 5);
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[9], 2);
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[10], 5);
               stmt.setBigDecimal(12, (java.math.BigDecimal)parms[11], 5);
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setByte(14, ((Number) parms[13]).byteValue());
               stmt.setString(15, (String)parms[14], 1);
               stmt.setString(16, (String)parms[15], 8);
               stmt.setString(17, (String)parms[16], 8);
               stmt.setInt(18, ((Number) parms[17]).intValue());
               stmt.setString(19, (String)parms[18], 20);
               stmt.setShort(20, ((Number) parms[19]).shortValue());
               stmt.setBigDecimal(21, (java.math.BigDecimal)parms[20], 2);
               stmt.setBigDecimal(22, (java.math.BigDecimal)parms[21], 2);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 16);
               stmt.setString(7, (String)parms[6], 40);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 2);
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[8], 5);
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[9], 2);
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[10], 5);
               stmt.setBigDecimal(12, (java.math.BigDecimal)parms[11], 5);
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setByte(14, ((Number) parms[13]).byteValue());
               stmt.setString(15, (String)parms[14], 1);
               stmt.setString(16, (String)parms[15], 8);
               stmt.setString(17, (String)parms[16], 1);
               stmt.setShort(18, ((Number) parms[17]).shortValue());
               stmt.setString(19, (String)parms[18], 8);
               stmt.setInt(20, ((Number) parms[19]).intValue());
               stmt.setBigDecimal(21, (java.math.BigDecimal)parms[20], 5);
               stmt.setString(22, (String)parms[21], 20);
               stmt.setBigDecimal(23, (java.math.BigDecimal)parms[22], 2);
               stmt.setShort(24, ((Number) parms[23]).shortValue());
               stmt.setBigDecimal(25, (java.math.BigDecimal)parms[24], 2);
               stmt.setBigDecimal(26, (java.math.BigDecimal)parms[25], 2);
               stmt.setBigDecimal(27, (java.math.BigDecimal)parms[26], 2);
               stmt.setInt(28, ((Number) parms[27]).intValue());
               stmt.setBigDecimal(29, (java.math.BigDecimal)parms[28], 5);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 16);
               stmt.setString(7, (String)parms[6], 40);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 2);
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[8], 5);
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[9], 2);
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[10], 5);
               stmt.setInt(12, ((Number) parms[11]).intValue());
               stmt.setByte(13, ((Number) parms[12]).byteValue());
               stmt.setString(14, (String)parms[13], 1);
               stmt.setString(15, (String)parms[14], 8);
               stmt.setShort(16, ((Number) parms[15]).shortValue());
               stmt.setString(17, (String)parms[16], 8);
               stmt.setInt(18, ((Number) parms[17]).intValue());
               stmt.setString(19, (String)parms[18], 20);
               stmt.setBigDecimal(20, (java.math.BigDecimal)parms[19], 2);
               stmt.setBigDecimal(21, (java.math.BigDecimal)parms[20], 2);
               stmt.setBigDecimal(22, (java.math.BigDecimal)parms[21], 2);
               return;
            case 12 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 16);
               stmt.setString(7, (String)parms[6], 40);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 2);
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[8], 5);
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[9], 2);
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[10], 5);
               stmt.setString(12, (String)parms[11], 8);
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setBigDecimal(14, (java.math.BigDecimal)parms[13], 5);
               return;
            case 16 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 1);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
      }
   }

}

