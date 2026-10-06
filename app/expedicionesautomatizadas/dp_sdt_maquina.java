package app.expedicionesautomatizadas ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dp_sdt_maquina extends GXProcedure
{
   public dp_sdt_maquina( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dp_sdt_maquina.class ), "" );
   }

   public dp_sdt_maquina( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public app.expedicionesautomatizadas.SdtSDT_Maquina executeUdp( String aP0 ,
                                                                   String aP1 )
   {
      dp_sdt_maquina.this.aP2 = new app.expedicionesautomatizadas.SdtSDT_Maquina[] {new app.expedicionesautomatizadas.SdtSDT_Maquina()};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        app.expedicionesautomatizadas.SdtSDT_Maquina[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             app.expedicionesautomatizadas.SdtSDT_Maquina[] aP2 )
   {
      dp_sdt_maquina.this.A396EmprCod = aP0;
      dp_sdt_maquina.this.A602MaqCod = aP1;
      dp_sdt_maquina.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P001P2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A602MaqCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A600MaqCap = P001P2_A600MaqCap[0] ;
         n600MaqCap = P001P2_n600MaqCap[0] ;
         A605MaqCosMin = P001P2_A605MaqCosMin[0] ;
         n605MaqCosMin = P001P2_n605MaqCosMin[0] ;
         A612MaqHorPro = P001P2_A612MaqHorPro[0] ;
         n612MaqHorPro = P001P2_n612MaqHorPro[0] ;
         A615MaqMinPro = P001P2_A615MaqMinPro[0] ;
         n615MaqMinPro = P001P2_n615MaqMinPro[0] ;
         A620MaqTip = P001P2_A620MaqTip[0] ;
         n620MaqTip = P001P2_n620MaqTip[0] ;
         A607MaqEst = P001P2_A607MaqEst[0] ;
         n607MaqEst = P001P2_n607MaqEst[0] ;
         A621MaqUltFec = P001P2_A621MaqUltFec[0] ;
         n621MaqUltFec = P001P2_n621MaqUltFec[0] ;
         A617MaqResDia = P001P2_A617MaqResDia[0] ;
         n617MaqResDia = P001P2_n617MaqResDia[0] ;
         A611MaqHorAsi = P001P2_A611MaqHorAsi[0] ;
         n611MaqHorAsi = P001P2_n611MaqHorAsi[0] ;
         A616MaqOrdSeq = P001P2_A616MaqOrdSeq[0] ;
         n616MaqOrdSeq = P001P2_n616MaqOrdSeq[0] ;
         A622MaqUltLin = P001P2_A622MaqUltLin[0] ;
         n622MaqUltLin = P001P2_n622MaqUltLin[0] ;
         A1011TipMaqCod = P001P2_A1011TipMaqCod[0] ;
         n1011TipMaqCod = P001P2_n1011TipMaqCod[0] ;
         A1012TipMaqDsc = P001P2_A1012TipMaqDsc[0] ;
         n1012TipMaqDsc = P001P2_n1012TipMaqDsc[0] ;
         A4282MaqFormul = P001P2_A4282MaqFormul[0] ;
         n4282MaqFormul = P001P2_n4282MaqFormul[0] ;
         A4283MaqKgsMin = P001P2_A4283MaqKgsMin[0] ;
         n4283MaqKgsMin = P001P2_n4283MaqKgsMin[0] ;
         A4284MaqKgsMed = P001P2_A4284MaqKgsMed[0] ;
         n4284MaqKgsMed = P001P2_n4284MaqKgsMed[0] ;
         A4285MaqKgsMax = P001P2_A4285MaqKgsMax[0] ;
         n4285MaqKgsMax = P001P2_n4285MaqKgsMax[0] ;
         A4319MaqPrdMin = P001P2_A4319MaqPrdMin[0] ;
         n4319MaqPrdMin = P001P2_n4319MaqPrdMin[0] ;
         A4320MaqPrdMed = P001P2_A4320MaqPrdMed[0] ;
         n4320MaqPrdMed = P001P2_n4320MaqPrdMed[0] ;
         A4321MaqPrdMax = P001P2_A4321MaqPrdMax[0] ;
         n4321MaqPrdMax = P001P2_n4321MaqPrdMax[0] ;
         A623MaqVolMax = P001P2_A623MaqVolMax[0] ;
         n623MaqVolMax = P001P2_n623MaqVolMax[0] ;
         A625MaqVolMin = P001P2_A625MaqVolMin[0] ;
         n625MaqVolMin = P001P2_n625MaqVolMin[0] ;
         A624MaqVolMed = P001P2_A624MaqVolMed[0] ;
         n624MaqVolMed = P001P2_n624MaqVolMed[0] ;
         A2801MaqVolRes = P001P2_A2801MaqVolRes[0] ;
         n2801MaqVolRes = P001P2_n2801MaqVolRes[0] ;
         A2802MaqVolTop = P001P2_A2802MaqVolTop[0] ;
         n2802MaqVolTop = P001P2_n2802MaqVolTop[0] ;
         A618MaqTemMax = P001P2_A618MaqTemMax[0] ;
         n618MaqTemMax = P001P2_n618MaqTemMax[0] ;
         A601MaqChp = P001P2_A601MaqChp[0] ;
         n601MaqChp = P001P2_n601MaqChp[0] ;
         A619MaqTinTip = P001P2_A619MaqTinTip[0] ;
         n619MaqTinTip = P001P2_n619MaqTinTip[0] ;
         A2391MaqMicro = P001P2_A2391MaqMicro[0] ;
         n2391MaqMicro = P001P2_n2391MaqMicro[0] ;
         A3598MaqNroTub = P001P2_A3598MaqNroTub[0] ;
         n3598MaqNroTub = P001P2_n3598MaqNroTub[0] ;
         A5292MaqCodBan = P001P2_A5292MaqCodBan[0] ;
         n5292MaqCodBan = P001P2_n5292MaqCodBan[0] ;
         A5419MaqSalM = P001P2_A5419MaqSalM[0] ;
         n5419MaqSalM = P001P2_n5419MaqSalM[0] ;
         A5420MaqSalMKi = P001P2_A5420MaqSalMKi[0] ;
         n5420MaqSalMKi = P001P2_n5420MaqSalMKi[0] ;
         A5421MaqSalMKf = P001P2_A5421MaqSalMKf[0] ;
         n5421MaqSalMKf = P001P2_n5421MaqSalMKf[0] ;
         A5463MaqCantCor = P001P2_A5463MaqCantCor[0] ;
         n5463MaqCantCor = P001P2_n5463MaqCantCor[0] ;
         A5593MaqTipCen = P001P2_A5593MaqTipCen[0] ;
         n5593MaqTipCen = P001P2_n5593MaqTipCen[0] ;
         A5949MaqDosifP = P001P2_A5949MaqDosifP[0] ;
         n5949MaqDosifP = P001P2_n5949MaqDosifP[0] ;
         A5950MaqDteCol = P001P2_A5950MaqDteCol[0] ;
         n5950MaqDteCol = P001P2_n5950MaqDteCol[0] ;
         A604MaqCodFor = P001P2_A604MaqCodFor[0] ;
         n604MaqCodFor = P001P2_n604MaqCodFor[0] ;
         A6284MaqFacAbs = P001P2_A6284MaqFacAbs[0] ;
         n6284MaqFacAbs = P001P2_n6284MaqFacAbs[0] ;
         A6399MaqKgsId = P001P2_A6399MaqKgsId[0] ;
         n6399MaqKgsId = P001P2_n6399MaqKgsId[0] ;
         A6432MaqPln = P001P2_A6432MaqPln[0] ;
         n6432MaqPln = P001P2_n6432MaqPln[0] ;
         A6433MaqPlnVis = P001P2_A6433MaqPlnVis[0] ;
         n6433MaqPlnVis = P001P2_n6433MaqPlnVis[0] ;
         A6454MaqConFas = P001P2_A6454MaqConFas[0] ;
         n6454MaqConFas = P001P2_n6454MaqConFas[0] ;
         A8056MaqVaril = P001P2_A8056MaqVaril[0] ;
         n8056MaqVaril = P001P2_n8056MaqVaril[0] ;
         A3601MaqTipMaq = P001P2_A3601MaqTipMaq[0] ;
         n3601MaqTipMaq = P001P2_n3601MaqTipMaq[0] ;
         A3599MaqRelBan = P001P2_A3599MaqRelBan[0] ;
         n3599MaqRelBan = P001P2_n3599MaqRelBan[0] ;
         A8657MaqLoc = P001P2_A8657MaqLoc[0] ;
         n8657MaqLoc = P001P2_n8657MaqLoc[0] ;
         A9626MaqObs = P001P2_A9626MaqObs[0] ;
         n9626MaqObs = P001P2_n9626MaqObs[0] ;
         A9982MaqFabsHm = P001P2_A9982MaqFabsHm[0] ;
         n9982MaqFabsHm = P001P2_n9982MaqFabsHm[0] ;
         A1027MaqHhCon = P001P2_A1027MaqHhCon[0] ;
         n1027MaqHhCon = P001P2_n1027MaqHhCon[0] ;
         A1026MaqHhCtr = P001P2_A1026MaqHhCtr[0] ;
         n1026MaqHhCtr = P001P2_n1026MaqHhCtr[0] ;
         A3600MaqVolBal = P001P2_A3600MaqVolBal[0] ;
         n3600MaqVolBal = P001P2_n3600MaqVolBal[0] ;
         A3684MaqCosGen = P001P2_A3684MaqCosGen[0] ;
         n3684MaqCosGen = P001P2_n3684MaqCosGen[0] ;
         A11726MaqOgtId = P001P2_A11726MaqOgtId[0] ;
         n11726MaqOgtId = P001P2_n11726MaqOgtId[0] ;
         A11727MaqOgtDsc = P001P2_A11727MaqOgtDsc[0] ;
         A13020MaqTmCarg = P001P2_A13020MaqTmCarg[0] ;
         n13020MaqTmCarg = P001P2_n13020MaqTmCarg[0] ;
         A13021MaqTmDcarg = P001P2_A13021MaqTmDcarg[0] ;
         n13021MaqTmDcarg = P001P2_n13021MaqTmDcarg[0] ;
         A13022MaqMtsMn = P001P2_A13022MaqMtsMn[0] ;
         n13022MaqMtsMn = P001P2_n13022MaqMtsMn[0] ;
         A13023MaqMtsMx = P001P2_A13023MaqMtsMx[0] ;
         n13023MaqMtsMx = P001P2_n13023MaqMtsMx[0] ;
         A13179MaqCosFijo = P001P2_A13179MaqCosFijo[0] ;
         n13179MaqCosFijo = P001P2_n13179MaqCosFijo[0] ;
         A13180MaqCosKg = P001P2_A13180MaqCosKg[0] ;
         n13180MaqCosKg = P001P2_n13180MaqCosKg[0] ;
         A606MaqDsc = P001P2_A606MaqDsc[0] ;
         n606MaqDsc = P001P2_n606MaqDsc[0] ;
         A11824MaqGas = P001P2_A11824MaqGas[0] ;
         n11824MaqGas = P001P2_n11824MaqGas[0] ;
         A11825MaqAgua = P001P2_A11825MaqAgua[0] ;
         n11825MaqAgua = P001P2_n11825MaqAgua[0] ;
         A11823MaqEnerg = P001P2_A11823MaqEnerg[0] ;
         n11823MaqEnerg = P001P2_n11823MaqEnerg[0] ;
         A11822MaqMOI = P001P2_A11822MaqMOI[0] ;
         n11822MaqMOI = P001P2_n11822MaqMOI[0] ;
         A11821MaqMOD = P001P2_A11821MaqMOD[0] ;
         n11821MaqMOD = P001P2_n11821MaqMOD[0] ;
         A1012TipMaqDsc = P001P2_A1012TipMaqDsc[0] ;
         n1012TipMaqDsc = P001P2_n1012TipMaqDsc[0] ;
         A11727MaqOgtDsc = P001P2_A11727MaqOgtDsc[0] ;
         A13734MaqCDsc = GXutil.trim( A602MaqCod) + "-" + GXutil.trim( A606MaqDsc) ;
         A12123MaqCosMm = A11821MaqMOD.add(A11822MaqMOI).add(A11823MaqEnerg).add(A11825MaqAgua).add(A11824MaqGas) ;
         Gxm1sdt_maquina.setgxTv_SdtSDT_Maquina_Emprcod( A396EmprCod );
         Gxm1sdt_maquina.setgxTv_SdtSDT_Maquina_Maqcod( A602MaqCod );
         Gxm1sdt_maquina.setgxTv_SdtSDT_Maquina_Maqdsc( A606MaqDsc );
         Gxm1sdt_maquina.setgxTv_SdtSDT_Maquina_Maqcap( A600MaqCap );
         Gxm1sdt_maquina.setgxTv_SdtSDT_Maquina_Maqcosmin( A605MaqCosMin );
         Gxm1sdt_maquina.setgxTv_SdtSDT_Maquina_Maqhorpro( A612MaqHorPro );
         Gxm1sdt_maquina.setgxTv_SdtSDT_Maquina_Maqminpro( A615MaqMinPro );
         Gxm1sdt_maquina.setgxTv_SdtSDT_Maquina_Maqtip( A620MaqTip );
         Gxm1sdt_maquina.setgxTv_SdtSDT_Maquina_Maqest( A607MaqEst );
         Gxm1sdt_maquina.setgxTv_SdtSDT_Maquina_Maqultfec( A621MaqUltFec );
         Gxm1sdt_maquina.setgxTv_SdtSDT_Maquina_Maqresdia( A617MaqResDia );
         Gxm1sdt_maquina.setgxTv_SdtSDT_Maquina_Maqhorasi( A611MaqHorAsi );
         Gxm1sdt_maquina.setgxTv_SdtSDT_Maquina_Maqordseq( A616MaqOrdSeq );
         Gxm1sdt_maquina.setgxTv_SdtSDT_Maquina_Maqultlin( A622MaqUltLin );
         Gxm1sdt_maquina.setgxTv_SdtSDT_Maquina_Tipmaqcod( A1011TipMaqCod );
         Gxm1sdt_maquina.setgxTv_SdtSDT_Maquina_Tipmaqdsc( A1012TipMaqDsc );
         Gxm1sdt_maquina.setgxTv_SdtSDT_Maquina_Maqformul( A4282MaqFormul );
         Gxm1sdt_maquina.setgxTv_SdtSDT_Maquina_Maqkgsmin( A4283MaqKgsMin );
         Gxm1sdt_maquina.setgxTv_SdtSDT_Maquina_Maqkgsmed( A4284MaqKgsMed );
         Gxm1sdt_maquina.setgxTv_SdtSDT_Maquina_Maqkgsmax( A4285MaqKgsMax );
         Gxm1sdt_maquina.setgxTv_SdtSDT_Maquina_Maqprdmin( A4319MaqPrdMin );
         Gxm1sdt_maquina.setgxTv_SdtSDT_Maquina_Maqprdmed( A4320MaqPrdMed );
         Gxm1sdt_maquina.setgxTv_SdtSDT_Maquina_Maqprdmax( A4321MaqPrdMax );
         Gxm1sdt_maquina.setgxTv_SdtSDT_Maquina_Maqvolmax( A623MaqVolMax );
         Gxm1sdt_maquina.setgxTv_SdtSDT_Maquina_Maqvolmin( A625MaqVolMin );
         Gxm1sdt_maquina.setgxTv_SdtSDT_Maquina_Maqvolmed( A624MaqVolMed );
         Gxm1sdt_maquina.setgxTv_SdtSDT_Maquina_Maqvolres( A2801MaqVolRes );
         Gxm1sdt_maquina.setgxTv_SdtSDT_Maquina_Maqvoltop( A2802MaqVolTop );
         Gxm1sdt_maquina.setgxTv_SdtSDT_Maquina_Maqtemmax( A618MaqTemMax );
         Gxm1sdt_maquina.setgxTv_SdtSDT_Maquina_Maqchp( A601MaqChp );
         Gxm1sdt_maquina.setgxTv_SdtSDT_Maquina_Maqtintip( A619MaqTinTip );
         Gxm1sdt_maquina.setgxTv_SdtSDT_Maquina_Maqmicro( A2391MaqMicro );
         Gxm1sdt_maquina.setgxTv_SdtSDT_Maquina_Maqnrotub( A3598MaqNroTub );
         Gxm1sdt_maquina.setgxTv_SdtSDT_Maquina_Maqcodban( A5292MaqCodBan );
         Gxm1sdt_maquina.setgxTv_SdtSDT_Maquina_Maqsalm( A5419MaqSalM );
         Gxm1sdt_maquina.setgxTv_SdtSDT_Maquina_Maqsalmki( A5420MaqSalMKi );
         Gxm1sdt_maquina.setgxTv_SdtSDT_Maquina_Maqsalmkf( A5421MaqSalMKf );
         Gxm1sdt_maquina.setgxTv_SdtSDT_Maquina_Maqcantcor( A5463MaqCantCor );
         Gxm1sdt_maquina.setgxTv_SdtSDT_Maquina_Maqtipcen( A5593MaqTipCen );
         Gxm1sdt_maquina.setgxTv_SdtSDT_Maquina_Maqdosifp( A5949MaqDosifP );
         Gxm1sdt_maquina.setgxTv_SdtSDT_Maquina_Maqdtecol( A5950MaqDteCol );
         Gxm1sdt_maquina.setgxTv_SdtSDT_Maquina_Maqcodfor( A604MaqCodFor );
         Gxm1sdt_maquina.setgxTv_SdtSDT_Maquina_Maqfacabs( A6284MaqFacAbs );
         Gxm1sdt_maquina.setgxTv_SdtSDT_Maquina_Maqkgsid( A6399MaqKgsId );
         Gxm1sdt_maquina.setgxTv_SdtSDT_Maquina_Maqpln( A6432MaqPln );
         Gxm1sdt_maquina.setgxTv_SdtSDT_Maquina_Maqplnvis( A6433MaqPlnVis );
         Gxm1sdt_maquina.setgxTv_SdtSDT_Maquina_Maqconfas( A6454MaqConFas );
         Gxm1sdt_maquina.setgxTv_SdtSDT_Maquina_Maqvaril( A8056MaqVaril );
         Gxm1sdt_maquina.setgxTv_SdtSDT_Maquina_Maqtipmaq( A3601MaqTipMaq );
         Gxm1sdt_maquina.setgxTv_SdtSDT_Maquina_Maqrelban( A3599MaqRelBan );
         Gxm1sdt_maquina.setgxTv_SdtSDT_Maquina_Maqloc( A8657MaqLoc );
         Gxm1sdt_maquina.setgxTv_SdtSDT_Maquina_Maqobs( A9626MaqObs );
         Gxm1sdt_maquina.setgxTv_SdtSDT_Maquina_Maqfabshm( A9982MaqFabsHm );
         Gxm1sdt_maquina.setgxTv_SdtSDT_Maquina_Maqhhcon( A1027MaqHhCon );
         Gxm1sdt_maquina.setgxTv_SdtSDT_Maquina_Maqhhctr( A1026MaqHhCtr );
         Gxm1sdt_maquina.setgxTv_SdtSDT_Maquina_Maqvolbal( A3600MaqVolBal );
         Gxm1sdt_maquina.setgxTv_SdtSDT_Maquina_Maqcosgen( A3684MaqCosGen );
         Gxm1sdt_maquina.setgxTv_SdtSDT_Maquina_Maqogtid( A11726MaqOgtId );
         Gxm1sdt_maquina.setgxTv_SdtSDT_Maquina_Maqogtdsc( A11727MaqOgtDsc );
         Gxm1sdt_maquina.setgxTv_SdtSDT_Maquina_Maqmod( A11821MaqMOD );
         Gxm1sdt_maquina.setgxTv_SdtSDT_Maquina_Maqmoi( A11822MaqMOI );
         Gxm1sdt_maquina.setgxTv_SdtSDT_Maquina_Maqenerg( A11823MaqEnerg );
         Gxm1sdt_maquina.setgxTv_SdtSDT_Maquina_Maqgas( A11824MaqGas );
         Gxm1sdt_maquina.setgxTv_SdtSDT_Maquina_Maqagua( A11825MaqAgua );
         Gxm1sdt_maquina.setgxTv_SdtSDT_Maquina_Maqcosmm( A12123MaqCosMm );
         Gxm1sdt_maquina.setgxTv_SdtSDT_Maquina_Maqtmcarg( A13020MaqTmCarg );
         Gxm1sdt_maquina.setgxTv_SdtSDT_Maquina_Maqtmdcarg( A13021MaqTmDcarg );
         Gxm1sdt_maquina.setgxTv_SdtSDT_Maquina_Maqmtsmn( A13022MaqMtsMn );
         Gxm1sdt_maquina.setgxTv_SdtSDT_Maquina_Maqmtsmx( A13023MaqMtsMx );
         Gxm1sdt_maquina.setgxTv_SdtSDT_Maquina_Maqcosfijo( A13179MaqCosFijo );
         Gxm1sdt_maquina.setgxTv_SdtSDT_Maquina_Maqcoskg( A13180MaqCosKg );
         Gxm1sdt_maquina.setgxTv_SdtSDT_Maquina_Maqcdsc( A13734MaqCDsc );
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = dp_sdt_maquina.this.Gxm1sdt_maquina;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm1sdt_maquina = new app.expedicionesautomatizadas.SdtSDT_Maquina(remoteHandle, context);
      scmdbuf = "" ;
      P001P2_A396EmprCod = new String[] {""} ;
      P001P2_A600MaqCap = new int[1] ;
      P001P2_n600MaqCap = new boolean[] {false} ;
      P001P2_A605MaqCosMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001P2_n605MaqCosMin = new boolean[] {false} ;
      P001P2_A612MaqHorPro = new byte[1] ;
      P001P2_n612MaqHorPro = new boolean[] {false} ;
      P001P2_A615MaqMinPro = new byte[1] ;
      P001P2_n615MaqMinPro = new boolean[] {false} ;
      P001P2_A620MaqTip = new String[] {""} ;
      P001P2_n620MaqTip = new boolean[] {false} ;
      P001P2_A607MaqEst = new String[] {""} ;
      P001P2_n607MaqEst = new boolean[] {false} ;
      P001P2_A621MaqUltFec = new String[] {""} ;
      P001P2_n621MaqUltFec = new boolean[] {false} ;
      P001P2_A617MaqResDia = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001P2_n617MaqResDia = new boolean[] {false} ;
      P001P2_A611MaqHorAsi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001P2_n611MaqHorAsi = new boolean[] {false} ;
      P001P2_A616MaqOrdSeq = new short[1] ;
      P001P2_n616MaqOrdSeq = new boolean[] {false} ;
      P001P2_A622MaqUltLin = new byte[1] ;
      P001P2_n622MaqUltLin = new boolean[] {false} ;
      P001P2_A1011TipMaqCod = new String[] {""} ;
      P001P2_n1011TipMaqCod = new boolean[] {false} ;
      P001P2_A1012TipMaqDsc = new String[] {""} ;
      P001P2_n1012TipMaqDsc = new boolean[] {false} ;
      P001P2_A4282MaqFormul = new String[] {""} ;
      P001P2_n4282MaqFormul = new boolean[] {false} ;
      P001P2_A4283MaqKgsMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001P2_n4283MaqKgsMin = new boolean[] {false} ;
      P001P2_A4284MaqKgsMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001P2_n4284MaqKgsMed = new boolean[] {false} ;
      P001P2_A4285MaqKgsMax = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001P2_n4285MaqKgsMax = new boolean[] {false} ;
      P001P2_A4319MaqPrdMin = new short[1] ;
      P001P2_n4319MaqPrdMin = new boolean[] {false} ;
      P001P2_A4320MaqPrdMed = new short[1] ;
      P001P2_n4320MaqPrdMed = new boolean[] {false} ;
      P001P2_A4321MaqPrdMax = new short[1] ;
      P001P2_n4321MaqPrdMax = new boolean[] {false} ;
      P001P2_A623MaqVolMax = new int[1] ;
      P001P2_n623MaqVolMax = new boolean[] {false} ;
      P001P2_A625MaqVolMin = new int[1] ;
      P001P2_n625MaqVolMin = new boolean[] {false} ;
      P001P2_A624MaqVolMed = new int[1] ;
      P001P2_n624MaqVolMed = new boolean[] {false} ;
      P001P2_A2801MaqVolRes = new int[1] ;
      P001P2_n2801MaqVolRes = new boolean[] {false} ;
      P001P2_A2802MaqVolTop = new int[1] ;
      P001P2_n2802MaqVolTop = new boolean[] {false} ;
      P001P2_A618MaqTemMax = new short[1] ;
      P001P2_n618MaqTemMax = new boolean[] {false} ;
      P001P2_A601MaqChp = new String[] {""} ;
      P001P2_n601MaqChp = new boolean[] {false} ;
      P001P2_A619MaqTinTip = new String[] {""} ;
      P001P2_n619MaqTinTip = new boolean[] {false} ;
      P001P2_A2391MaqMicro = new byte[1] ;
      P001P2_n2391MaqMicro = new boolean[] {false} ;
      P001P2_A3598MaqNroTub = new byte[1] ;
      P001P2_n3598MaqNroTub = new boolean[] {false} ;
      P001P2_A5292MaqCodBan = new String[] {""} ;
      P001P2_n5292MaqCodBan = new boolean[] {false} ;
      P001P2_A5419MaqSalM = new String[] {""} ;
      P001P2_n5419MaqSalM = new boolean[] {false} ;
      P001P2_A5420MaqSalMKi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001P2_n5420MaqSalMKi = new boolean[] {false} ;
      P001P2_A5421MaqSalMKf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001P2_n5421MaqSalMKf = new boolean[] {false} ;
      P001P2_A5463MaqCantCor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001P2_n5463MaqCantCor = new boolean[] {false} ;
      P001P2_A5593MaqTipCen = new String[] {""} ;
      P001P2_n5593MaqTipCen = new boolean[] {false} ;
      P001P2_A5949MaqDosifP = new String[] {""} ;
      P001P2_n5949MaqDosifP = new boolean[] {false} ;
      P001P2_A5950MaqDteCol = new int[1] ;
      P001P2_n5950MaqDteCol = new boolean[] {false} ;
      P001P2_A604MaqCodFor = new String[] {""} ;
      P001P2_n604MaqCodFor = new boolean[] {false} ;
      P001P2_A6284MaqFacAbs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001P2_n6284MaqFacAbs = new boolean[] {false} ;
      P001P2_A6399MaqKgsId = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001P2_n6399MaqKgsId = new boolean[] {false} ;
      P001P2_A6432MaqPln = new byte[1] ;
      P001P2_n6432MaqPln = new boolean[] {false} ;
      P001P2_A6433MaqPlnVis = new byte[1] ;
      P001P2_n6433MaqPlnVis = new boolean[] {false} ;
      P001P2_A6454MaqConFas = new int[1] ;
      P001P2_n6454MaqConFas = new boolean[] {false} ;
      P001P2_A8056MaqVaril = new String[] {""} ;
      P001P2_n8056MaqVaril = new boolean[] {false} ;
      P001P2_A3601MaqTipMaq = new String[] {""} ;
      P001P2_n3601MaqTipMaq = new boolean[] {false} ;
      P001P2_A3599MaqRelBan = new byte[1] ;
      P001P2_n3599MaqRelBan = new boolean[] {false} ;
      P001P2_A8657MaqLoc = new String[] {""} ;
      P001P2_n8657MaqLoc = new boolean[] {false} ;
      P001P2_A9626MaqObs = new String[] {""} ;
      P001P2_n9626MaqObs = new boolean[] {false} ;
      P001P2_A9982MaqFabsHm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001P2_n9982MaqFabsHm = new boolean[] {false} ;
      P001P2_A1027MaqHhCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001P2_n1027MaqHhCon = new boolean[] {false} ;
      P001P2_A1026MaqHhCtr = new String[] {""} ;
      P001P2_n1026MaqHhCtr = new boolean[] {false} ;
      P001P2_A3600MaqVolBal = new int[1] ;
      P001P2_n3600MaqVolBal = new boolean[] {false} ;
      P001P2_A3684MaqCosGen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001P2_n3684MaqCosGen = new boolean[] {false} ;
      P001P2_A11726MaqOgtId = new String[] {""} ;
      P001P2_n11726MaqOgtId = new boolean[] {false} ;
      P001P2_A11727MaqOgtDsc = new String[] {""} ;
      P001P2_A13020MaqTmCarg = new short[1] ;
      P001P2_n13020MaqTmCarg = new boolean[] {false} ;
      P001P2_A13021MaqTmDcarg = new short[1] ;
      P001P2_n13021MaqTmDcarg = new boolean[] {false} ;
      P001P2_A13022MaqMtsMn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001P2_n13022MaqMtsMn = new boolean[] {false} ;
      P001P2_A13023MaqMtsMx = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001P2_n13023MaqMtsMx = new boolean[] {false} ;
      P001P2_A13179MaqCosFijo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001P2_n13179MaqCosFijo = new boolean[] {false} ;
      P001P2_A13180MaqCosKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001P2_n13180MaqCosKg = new boolean[] {false} ;
      P001P2_A602MaqCod = new String[] {""} ;
      P001P2_A606MaqDsc = new String[] {""} ;
      P001P2_n606MaqDsc = new boolean[] {false} ;
      P001P2_A11824MaqGas = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001P2_n11824MaqGas = new boolean[] {false} ;
      P001P2_A11825MaqAgua = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001P2_n11825MaqAgua = new boolean[] {false} ;
      P001P2_A11823MaqEnerg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001P2_n11823MaqEnerg = new boolean[] {false} ;
      P001P2_A11822MaqMOI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001P2_n11822MaqMOI = new boolean[] {false} ;
      P001P2_A11821MaqMOD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001P2_n11821MaqMOD = new boolean[] {false} ;
      A605MaqCosMin = DecimalUtil.ZERO ;
      A620MaqTip = "" ;
      A607MaqEst = "" ;
      A621MaqUltFec = "" ;
      A617MaqResDia = DecimalUtil.ZERO ;
      A611MaqHorAsi = DecimalUtil.ZERO ;
      A1011TipMaqCod = "" ;
      A1012TipMaqDsc = "" ;
      A4282MaqFormul = "" ;
      A4283MaqKgsMin = DecimalUtil.ZERO ;
      A4284MaqKgsMed = DecimalUtil.ZERO ;
      A4285MaqKgsMax = DecimalUtil.ZERO ;
      A601MaqChp = "" ;
      A619MaqTinTip = "" ;
      A5292MaqCodBan = "" ;
      A5419MaqSalM = "" ;
      A5420MaqSalMKi = DecimalUtil.ZERO ;
      A5421MaqSalMKf = DecimalUtil.ZERO ;
      A5463MaqCantCor = DecimalUtil.ZERO ;
      A5593MaqTipCen = "" ;
      A5949MaqDosifP = "" ;
      A604MaqCodFor = "" ;
      A6284MaqFacAbs = DecimalUtil.ZERO ;
      A6399MaqKgsId = DecimalUtil.ZERO ;
      A8056MaqVaril = "" ;
      A3601MaqTipMaq = "" ;
      A8657MaqLoc = "" ;
      A9626MaqObs = "" ;
      A9982MaqFabsHm = DecimalUtil.ZERO ;
      A1027MaqHhCon = DecimalUtil.ZERO ;
      A1026MaqHhCtr = "" ;
      A3684MaqCosGen = DecimalUtil.ZERO ;
      A11726MaqOgtId = "" ;
      A11727MaqOgtDsc = "" ;
      A13022MaqMtsMn = DecimalUtil.ZERO ;
      A13023MaqMtsMx = DecimalUtil.ZERO ;
      A13179MaqCosFijo = DecimalUtil.ZERO ;
      A13180MaqCosKg = DecimalUtil.ZERO ;
      A606MaqDsc = "" ;
      A11824MaqGas = DecimalUtil.ZERO ;
      A11825MaqAgua = DecimalUtil.ZERO ;
      A11823MaqEnerg = DecimalUtil.ZERO ;
      A11822MaqMOI = DecimalUtil.ZERO ;
      A11821MaqMOD = DecimalUtil.ZERO ;
      A13734MaqCDsc = "" ;
      A12123MaqCosMm = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.expedicionesautomatizadas.dp_sdt_maquina__default(),
         new Object[] {
             new Object[] {
            P001P2_A396EmprCod, P001P2_A600MaqCap, P001P2_n600MaqCap, P001P2_A605MaqCosMin, P001P2_n605MaqCosMin, P001P2_A612MaqHorPro, P001P2_n612MaqHorPro, P001P2_A615MaqMinPro, P001P2_n615MaqMinPro, P001P2_A620MaqTip,
            P001P2_n620MaqTip, P001P2_A607MaqEst, P001P2_n607MaqEst, P001P2_A621MaqUltFec, P001P2_n621MaqUltFec, P001P2_A617MaqResDia, P001P2_n617MaqResDia, P001P2_A611MaqHorAsi, P001P2_n611MaqHorAsi, P001P2_A616MaqOrdSeq,
            P001P2_n616MaqOrdSeq, P001P2_A622MaqUltLin, P001P2_n622MaqUltLin, P001P2_A1011TipMaqCod, P001P2_n1011TipMaqCod, P001P2_A1012TipMaqDsc, P001P2_n1012TipMaqDsc, P001P2_A4282MaqFormul, P001P2_n4282MaqFormul, P001P2_A4283MaqKgsMin,
            P001P2_n4283MaqKgsMin, P001P2_A4284MaqKgsMed, P001P2_n4284MaqKgsMed, P001P2_A4285MaqKgsMax, P001P2_n4285MaqKgsMax, P001P2_A4319MaqPrdMin, P001P2_n4319MaqPrdMin, P001P2_A4320MaqPrdMed, P001P2_n4320MaqPrdMed, P001P2_A4321MaqPrdMax,
            P001P2_n4321MaqPrdMax, P001P2_A623MaqVolMax, P001P2_n623MaqVolMax, P001P2_A625MaqVolMin, P001P2_n625MaqVolMin, P001P2_A624MaqVolMed, P001P2_n624MaqVolMed, P001P2_A2801MaqVolRes, P001P2_n2801MaqVolRes, P001P2_A2802MaqVolTop,
            P001P2_n2802MaqVolTop, P001P2_A618MaqTemMax, P001P2_n618MaqTemMax, P001P2_A601MaqChp, P001P2_n601MaqChp, P001P2_A619MaqTinTip, P001P2_n619MaqTinTip, P001P2_A2391MaqMicro, P001P2_n2391MaqMicro, P001P2_A3598MaqNroTub,
            P001P2_n3598MaqNroTub, P001P2_A5292MaqCodBan, P001P2_n5292MaqCodBan, P001P2_A5419MaqSalM, P001P2_n5419MaqSalM, P001P2_A5420MaqSalMKi, P001P2_n5420MaqSalMKi, P001P2_A5421MaqSalMKf, P001P2_n5421MaqSalMKf, P001P2_A5463MaqCantCor,
            P001P2_n5463MaqCantCor, P001P2_A5593MaqTipCen, P001P2_n5593MaqTipCen, P001P2_A5949MaqDosifP, P001P2_n5949MaqDosifP, P001P2_A5950MaqDteCol, P001P2_n5950MaqDteCol, P001P2_A604MaqCodFor, P001P2_n604MaqCodFor, P001P2_A6284MaqFacAbs,
            P001P2_n6284MaqFacAbs, P001P2_A6399MaqKgsId, P001P2_n6399MaqKgsId, P001P2_A6432MaqPln, P001P2_n6432MaqPln, P001P2_A6433MaqPlnVis, P001P2_n6433MaqPlnVis, P001P2_A6454MaqConFas, P001P2_n6454MaqConFas, P001P2_A8056MaqVaril,
            P001P2_n8056MaqVaril, P001P2_A3601MaqTipMaq, P001P2_n3601MaqTipMaq, P001P2_A3599MaqRelBan, P001P2_n3599MaqRelBan, P001P2_A8657MaqLoc, P001P2_n8657MaqLoc, P001P2_A9626MaqObs, P001P2_n9626MaqObs, P001P2_A9982MaqFabsHm,
            P001P2_n9982MaqFabsHm, P001P2_A1027MaqHhCon, P001P2_n1027MaqHhCon, P001P2_A1026MaqHhCtr, P001P2_n1026MaqHhCtr, P001P2_A3600MaqVolBal, P001P2_n3600MaqVolBal, P001P2_A3684MaqCosGen, P001P2_n3684MaqCosGen, P001P2_A11726MaqOgtId,
            P001P2_n11726MaqOgtId, P001P2_A11727MaqOgtDsc, P001P2_A13020MaqTmCarg, P001P2_n13020MaqTmCarg, P001P2_A13021MaqTmDcarg, P001P2_n13021MaqTmDcarg, P001P2_A13022MaqMtsMn, P001P2_n13022MaqMtsMn, P001P2_A13023MaqMtsMx, P001P2_n13023MaqMtsMx,
            P001P2_A13179MaqCosFijo, P001P2_n13179MaqCosFijo, P001P2_A13180MaqCosKg, P001P2_n13180MaqCosKg, P001P2_A602MaqCod, P001P2_A606MaqDsc, P001P2_n606MaqDsc, P001P2_A11824MaqGas, P001P2_n11824MaqGas, P001P2_A11825MaqAgua,
            P001P2_n11825MaqAgua, P001P2_A11823MaqEnerg, P001P2_n11823MaqEnerg, P001P2_A11822MaqMOI, P001P2_n11822MaqMOI, P001P2_A11821MaqMOD, P001P2_n11821MaqMOD
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A612MaqHorPro ;
   private byte A615MaqMinPro ;
   private byte A622MaqUltLin ;
   private byte A2391MaqMicro ;
   private byte A3598MaqNroTub ;
   private byte A6432MaqPln ;
   private byte A6433MaqPlnVis ;
   private byte A3599MaqRelBan ;
   private short A616MaqOrdSeq ;
   private short A4319MaqPrdMin ;
   private short A4320MaqPrdMed ;
   private short A4321MaqPrdMax ;
   private short A618MaqTemMax ;
   private short A13020MaqTmCarg ;
   private short A13021MaqTmDcarg ;
   private short Gx_err ;
   private int A600MaqCap ;
   private int A623MaqVolMax ;
   private int A625MaqVolMin ;
   private int A624MaqVolMed ;
   private int A2801MaqVolRes ;
   private int A2802MaqVolTop ;
   private int A5950MaqDteCol ;
   private int A6454MaqConFas ;
   private int A3600MaqVolBal ;
   private java.math.BigDecimal A605MaqCosMin ;
   private java.math.BigDecimal A617MaqResDia ;
   private java.math.BigDecimal A611MaqHorAsi ;
   private java.math.BigDecimal A4283MaqKgsMin ;
   private java.math.BigDecimal A4284MaqKgsMed ;
   private java.math.BigDecimal A4285MaqKgsMax ;
   private java.math.BigDecimal A5420MaqSalMKi ;
   private java.math.BigDecimal A5421MaqSalMKf ;
   private java.math.BigDecimal A5463MaqCantCor ;
   private java.math.BigDecimal A6284MaqFacAbs ;
   private java.math.BigDecimal A6399MaqKgsId ;
   private java.math.BigDecimal A9982MaqFabsHm ;
   private java.math.BigDecimal A1027MaqHhCon ;
   private java.math.BigDecimal A3684MaqCosGen ;
   private java.math.BigDecimal A13022MaqMtsMn ;
   private java.math.BigDecimal A13023MaqMtsMx ;
   private java.math.BigDecimal A13179MaqCosFijo ;
   private java.math.BigDecimal A13180MaqCosKg ;
   private java.math.BigDecimal A11824MaqGas ;
   private java.math.BigDecimal A11825MaqAgua ;
   private java.math.BigDecimal A11823MaqEnerg ;
   private java.math.BigDecimal A11822MaqMOI ;
   private java.math.BigDecimal A11821MaqMOD ;
   private java.math.BigDecimal A12123MaqCosMm ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String scmdbuf ;
   private String A620MaqTip ;
   private String A607MaqEst ;
   private String A621MaqUltFec ;
   private String A1011TipMaqCod ;
   private String A1012TipMaqDsc ;
   private String A4282MaqFormul ;
   private String A601MaqChp ;
   private String A619MaqTinTip ;
   private String A5292MaqCodBan ;
   private String A5419MaqSalM ;
   private String A5593MaqTipCen ;
   private String A5949MaqDosifP ;
   private String A604MaqCodFor ;
   private String A8056MaqVaril ;
   private String A3601MaqTipMaq ;
   private String A8657MaqLoc ;
   private String A1026MaqHhCtr ;
   private String A11726MaqOgtId ;
   private String A11727MaqOgtDsc ;
   private String A606MaqDsc ;
   private boolean n600MaqCap ;
   private boolean n605MaqCosMin ;
   private boolean n612MaqHorPro ;
   private boolean n615MaqMinPro ;
   private boolean n620MaqTip ;
   private boolean n607MaqEst ;
   private boolean n621MaqUltFec ;
   private boolean n617MaqResDia ;
   private boolean n611MaqHorAsi ;
   private boolean n616MaqOrdSeq ;
   private boolean n622MaqUltLin ;
   private boolean n1011TipMaqCod ;
   private boolean n1012TipMaqDsc ;
   private boolean n4282MaqFormul ;
   private boolean n4283MaqKgsMin ;
   private boolean n4284MaqKgsMed ;
   private boolean n4285MaqKgsMax ;
   private boolean n4319MaqPrdMin ;
   private boolean n4320MaqPrdMed ;
   private boolean n4321MaqPrdMax ;
   private boolean n623MaqVolMax ;
   private boolean n625MaqVolMin ;
   private boolean n624MaqVolMed ;
   private boolean n2801MaqVolRes ;
   private boolean n2802MaqVolTop ;
   private boolean n618MaqTemMax ;
   private boolean n601MaqChp ;
   private boolean n619MaqTinTip ;
   private boolean n2391MaqMicro ;
   private boolean n3598MaqNroTub ;
   private boolean n5292MaqCodBan ;
   private boolean n5419MaqSalM ;
   private boolean n5420MaqSalMKi ;
   private boolean n5421MaqSalMKf ;
   private boolean n5463MaqCantCor ;
   private boolean n5593MaqTipCen ;
   private boolean n5949MaqDosifP ;
   private boolean n5950MaqDteCol ;
   private boolean n604MaqCodFor ;
   private boolean n6284MaqFacAbs ;
   private boolean n6399MaqKgsId ;
   private boolean n6432MaqPln ;
   private boolean n6433MaqPlnVis ;
   private boolean n6454MaqConFas ;
   private boolean n8056MaqVaril ;
   private boolean n3601MaqTipMaq ;
   private boolean n3599MaqRelBan ;
   private boolean n8657MaqLoc ;
   private boolean n9626MaqObs ;
   private boolean n9982MaqFabsHm ;
   private boolean n1027MaqHhCon ;
   private boolean n1026MaqHhCtr ;
   private boolean n3600MaqVolBal ;
   private boolean n3684MaqCosGen ;
   private boolean n11726MaqOgtId ;
   private boolean n13020MaqTmCarg ;
   private boolean n13021MaqTmDcarg ;
   private boolean n13022MaqMtsMn ;
   private boolean n13023MaqMtsMx ;
   private boolean n13179MaqCosFijo ;
   private boolean n13180MaqCosKg ;
   private boolean n606MaqDsc ;
   private boolean n11824MaqGas ;
   private boolean n11825MaqAgua ;
   private boolean n11823MaqEnerg ;
   private boolean n11822MaqMOI ;
   private boolean n11821MaqMOD ;
   private String A9626MaqObs ;
   private String A13734MaqCDsc ;
   private app.expedicionesautomatizadas.SdtSDT_Maquina[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P001P2_A396EmprCod ;
   private int[] P001P2_A600MaqCap ;
   private boolean[] P001P2_n600MaqCap ;
   private java.math.BigDecimal[] P001P2_A605MaqCosMin ;
   private boolean[] P001P2_n605MaqCosMin ;
   private byte[] P001P2_A612MaqHorPro ;
   private boolean[] P001P2_n612MaqHorPro ;
   private byte[] P001P2_A615MaqMinPro ;
   private boolean[] P001P2_n615MaqMinPro ;
   private String[] P001P2_A620MaqTip ;
   private boolean[] P001P2_n620MaqTip ;
   private String[] P001P2_A607MaqEst ;
   private boolean[] P001P2_n607MaqEst ;
   private String[] P001P2_A621MaqUltFec ;
   private boolean[] P001P2_n621MaqUltFec ;
   private java.math.BigDecimal[] P001P2_A617MaqResDia ;
   private boolean[] P001P2_n617MaqResDia ;
   private java.math.BigDecimal[] P001P2_A611MaqHorAsi ;
   private boolean[] P001P2_n611MaqHorAsi ;
   private short[] P001P2_A616MaqOrdSeq ;
   private boolean[] P001P2_n616MaqOrdSeq ;
   private byte[] P001P2_A622MaqUltLin ;
   private boolean[] P001P2_n622MaqUltLin ;
   private String[] P001P2_A1011TipMaqCod ;
   private boolean[] P001P2_n1011TipMaqCod ;
   private String[] P001P2_A1012TipMaqDsc ;
   private boolean[] P001P2_n1012TipMaqDsc ;
   private String[] P001P2_A4282MaqFormul ;
   private boolean[] P001P2_n4282MaqFormul ;
   private java.math.BigDecimal[] P001P2_A4283MaqKgsMin ;
   private boolean[] P001P2_n4283MaqKgsMin ;
   private java.math.BigDecimal[] P001P2_A4284MaqKgsMed ;
   private boolean[] P001P2_n4284MaqKgsMed ;
   private java.math.BigDecimal[] P001P2_A4285MaqKgsMax ;
   private boolean[] P001P2_n4285MaqKgsMax ;
   private short[] P001P2_A4319MaqPrdMin ;
   private boolean[] P001P2_n4319MaqPrdMin ;
   private short[] P001P2_A4320MaqPrdMed ;
   private boolean[] P001P2_n4320MaqPrdMed ;
   private short[] P001P2_A4321MaqPrdMax ;
   private boolean[] P001P2_n4321MaqPrdMax ;
   private int[] P001P2_A623MaqVolMax ;
   private boolean[] P001P2_n623MaqVolMax ;
   private int[] P001P2_A625MaqVolMin ;
   private boolean[] P001P2_n625MaqVolMin ;
   private int[] P001P2_A624MaqVolMed ;
   private boolean[] P001P2_n624MaqVolMed ;
   private int[] P001P2_A2801MaqVolRes ;
   private boolean[] P001P2_n2801MaqVolRes ;
   private int[] P001P2_A2802MaqVolTop ;
   private boolean[] P001P2_n2802MaqVolTop ;
   private short[] P001P2_A618MaqTemMax ;
   private boolean[] P001P2_n618MaqTemMax ;
   private String[] P001P2_A601MaqChp ;
   private boolean[] P001P2_n601MaqChp ;
   private String[] P001P2_A619MaqTinTip ;
   private boolean[] P001P2_n619MaqTinTip ;
   private byte[] P001P2_A2391MaqMicro ;
   private boolean[] P001P2_n2391MaqMicro ;
   private byte[] P001P2_A3598MaqNroTub ;
   private boolean[] P001P2_n3598MaqNroTub ;
   private String[] P001P2_A5292MaqCodBan ;
   private boolean[] P001P2_n5292MaqCodBan ;
   private String[] P001P2_A5419MaqSalM ;
   private boolean[] P001P2_n5419MaqSalM ;
   private java.math.BigDecimal[] P001P2_A5420MaqSalMKi ;
   private boolean[] P001P2_n5420MaqSalMKi ;
   private java.math.BigDecimal[] P001P2_A5421MaqSalMKf ;
   private boolean[] P001P2_n5421MaqSalMKf ;
   private java.math.BigDecimal[] P001P2_A5463MaqCantCor ;
   private boolean[] P001P2_n5463MaqCantCor ;
   private String[] P001P2_A5593MaqTipCen ;
   private boolean[] P001P2_n5593MaqTipCen ;
   private String[] P001P2_A5949MaqDosifP ;
   private boolean[] P001P2_n5949MaqDosifP ;
   private int[] P001P2_A5950MaqDteCol ;
   private boolean[] P001P2_n5950MaqDteCol ;
   private String[] P001P2_A604MaqCodFor ;
   private boolean[] P001P2_n604MaqCodFor ;
   private java.math.BigDecimal[] P001P2_A6284MaqFacAbs ;
   private boolean[] P001P2_n6284MaqFacAbs ;
   private java.math.BigDecimal[] P001P2_A6399MaqKgsId ;
   private boolean[] P001P2_n6399MaqKgsId ;
   private byte[] P001P2_A6432MaqPln ;
   private boolean[] P001P2_n6432MaqPln ;
   private byte[] P001P2_A6433MaqPlnVis ;
   private boolean[] P001P2_n6433MaqPlnVis ;
   private int[] P001P2_A6454MaqConFas ;
   private boolean[] P001P2_n6454MaqConFas ;
   private String[] P001P2_A8056MaqVaril ;
   private boolean[] P001P2_n8056MaqVaril ;
   private String[] P001P2_A3601MaqTipMaq ;
   private boolean[] P001P2_n3601MaqTipMaq ;
   private byte[] P001P2_A3599MaqRelBan ;
   private boolean[] P001P2_n3599MaqRelBan ;
   private String[] P001P2_A8657MaqLoc ;
   private boolean[] P001P2_n8657MaqLoc ;
   private String[] P001P2_A9626MaqObs ;
   private boolean[] P001P2_n9626MaqObs ;
   private java.math.BigDecimal[] P001P2_A9982MaqFabsHm ;
   private boolean[] P001P2_n9982MaqFabsHm ;
   private java.math.BigDecimal[] P001P2_A1027MaqHhCon ;
   private boolean[] P001P2_n1027MaqHhCon ;
   private String[] P001P2_A1026MaqHhCtr ;
   private boolean[] P001P2_n1026MaqHhCtr ;
   private int[] P001P2_A3600MaqVolBal ;
   private boolean[] P001P2_n3600MaqVolBal ;
   private java.math.BigDecimal[] P001P2_A3684MaqCosGen ;
   private boolean[] P001P2_n3684MaqCosGen ;
   private String[] P001P2_A11726MaqOgtId ;
   private boolean[] P001P2_n11726MaqOgtId ;
   private String[] P001P2_A11727MaqOgtDsc ;
   private short[] P001P2_A13020MaqTmCarg ;
   private boolean[] P001P2_n13020MaqTmCarg ;
   private short[] P001P2_A13021MaqTmDcarg ;
   private boolean[] P001P2_n13021MaqTmDcarg ;
   private java.math.BigDecimal[] P001P2_A13022MaqMtsMn ;
   private boolean[] P001P2_n13022MaqMtsMn ;
   private java.math.BigDecimal[] P001P2_A13023MaqMtsMx ;
   private boolean[] P001P2_n13023MaqMtsMx ;
   private java.math.BigDecimal[] P001P2_A13179MaqCosFijo ;
   private boolean[] P001P2_n13179MaqCosFijo ;
   private java.math.BigDecimal[] P001P2_A13180MaqCosKg ;
   private boolean[] P001P2_n13180MaqCosKg ;
   private String[] P001P2_A602MaqCod ;
   private String[] P001P2_A606MaqDsc ;
   private boolean[] P001P2_n606MaqDsc ;
   private java.math.BigDecimal[] P001P2_A11824MaqGas ;
   private boolean[] P001P2_n11824MaqGas ;
   private java.math.BigDecimal[] P001P2_A11825MaqAgua ;
   private boolean[] P001P2_n11825MaqAgua ;
   private java.math.BigDecimal[] P001P2_A11823MaqEnerg ;
   private boolean[] P001P2_n11823MaqEnerg ;
   private java.math.BigDecimal[] P001P2_A11822MaqMOI ;
   private boolean[] P001P2_n11822MaqMOI ;
   private java.math.BigDecimal[] P001P2_A11821MaqMOD ;
   private boolean[] P001P2_n11821MaqMOD ;
   private app.expedicionesautomatizadas.SdtSDT_Maquina Gxm1sdt_maquina ;
}

final  class dp_sdt_maquina__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P001P2", "SELECT T1.EmprCod, T1.MaqCap, T1.MaqCosMin, T1.MaqHorPro, T1.MaqMinPro, T1.MaqTip, T1.MaqEst, T1.MaqUltFec, T1.MaqResDia, T1.MaqHorAsi, T1.MaqOrdSeq, T1.MaqUltLin, T1.TipMaqCod, T2.TipMaqDsc, T1.MaqFormul, T1.MaqKgsMin, T1.MaqKgsMed, T1.MaqKgsMax, T1.MaqPrdMin, T1.MaqPrdMed, T1.MaqPrdMax, T1.MaqVolMax, T1.MaqVolMin, T1.MaqVolMed, T1.MaqVolRes, T1.MaqVolTop, T1.MaqTemMax, T1.MaqChp, T1.MaqTinTip, T1.MaqMicro, T1.MaqNroTub, T1.MaqCodBan, T1.MaqSalM, T1.MaqSalMKi, T1.MaqSalMKf, T1.MaqCantCor, T1.MaqTipCen, T1.MaqDosifP, T1.MaqDteCol, T1.MaqCodFor, T1.MaqFacAbs, T1.MaqKgsId, T1.MaqPln, T1.MaqPlnVis, T1.MaqConFas, T1.MaqVaril, T1.MaqTipMaq, T1.MaqRelBan, T1.MaqLoc, T1.MaqObs, T1.MaqFabsHm, T1.MaqHhCon, T1.MaqHhCtr, T1.MaqVolBal, T1.MaqCosGen, T1.MaqOgtId, T3.MaqOgtDsc, T1.MaqTmCarg, T1.MaqTmDcarg, T1.MaqMtsMn, T1.MaqMtsMx, T1.MaqCosFijo, T1.MaqCosKg, T1.MaqCod, T1.MaqDsc, T1.MaqGas, T1.MaqAgua, T1.MaqEnerg, T1.MaqMOI, T1.MaqMOD FROM ((TXPMAQUIN T1 LEFT JOIN TXPTIPMAQ T2 ON T2.EmprCod = T1.EmprCod AND T2.TipMaqCod = T1.TipMaqCod) LEFT JOIN TXPMAQOGT T3 ON T3.EmprCod = T1.EmprCod AND T3.MaqOgtId = T1.MaqOgtId) WHERE T1.EmprCod = ? and T1.MaqCod = ? ORDER BY T1.EmprCod, T1.MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((byte[]) buf[21])[0] = rslt.getByte(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 4);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 1);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(17,2);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((short[]) buf[35])[0] = rslt.getShort(19);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((short[]) buf[37])[0] = rslt.getShort(20);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((short[]) buf[39])[0] = rslt.getShort(21);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((int[]) buf[41])[0] = rslt.getInt(22);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((int[]) buf[43])[0] = rslt.getInt(23);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((int[]) buf[45])[0] = rslt.getInt(24);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((int[]) buf[47])[0] = rslt.getInt(25);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((int[]) buf[49])[0] = rslt.getInt(26);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((short[]) buf[51])[0] = rslt.getShort(27);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getString(28, 1);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((String[]) buf[55])[0] = rslt.getString(29, 2);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((byte[]) buf[57])[0] = rslt.getByte(30);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((byte[]) buf[59])[0] = rslt.getByte(31);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((String[]) buf[61])[0] = rslt.getString(32, 1);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((String[]) buf[63])[0] = rslt.getString(33, 1);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[65])[0] = rslt.getBigDecimal(34,3);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[67])[0] = rslt.getBigDecimal(35,3);
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[69])[0] = rslt.getBigDecimal(36,3);
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((String[]) buf[71])[0] = rslt.getString(37, 1);
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((String[]) buf[73])[0] = rslt.getString(38, 1);
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((int[]) buf[75])[0] = rslt.getInt(39);
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               ((String[]) buf[77])[0] = rslt.getString(40, 6);
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[79])[0] = rslt.getBigDecimal(41,2);
               ((boolean[]) buf[80])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[81])[0] = rslt.getBigDecimal(42,2);
               ((boolean[]) buf[82])[0] = rslt.wasNull();
               ((byte[]) buf[83])[0] = rslt.getByte(43);
               ((boolean[]) buf[84])[0] = rslt.wasNull();
               ((byte[]) buf[85])[0] = rslt.getByte(44);
               ((boolean[]) buf[86])[0] = rslt.wasNull();
               ((int[]) buf[87])[0] = rslt.getInt(45);
               ((boolean[]) buf[88])[0] = rslt.wasNull();
               ((String[]) buf[89])[0] = rslt.getString(46, 1);
               ((boolean[]) buf[90])[0] = rslt.wasNull();
               ((String[]) buf[91])[0] = rslt.getString(47, 1);
               ((boolean[]) buf[92])[0] = rslt.wasNull();
               ((byte[]) buf[93])[0] = rslt.getByte(48);
               ((boolean[]) buf[94])[0] = rslt.wasNull();
               ((String[]) buf[95])[0] = rslt.getString(49, 10);
               ((boolean[]) buf[96])[0] = rslt.wasNull();
               ((String[]) buf[97])[0] = rslt.getVarchar(50);
               ((boolean[]) buf[98])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[99])[0] = rslt.getBigDecimal(51,2);
               ((boolean[]) buf[100])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[101])[0] = rslt.getBigDecimal(52,2);
               ((boolean[]) buf[102])[0] = rslt.wasNull();
               ((String[]) buf[103])[0] = rslt.getString(53, 1);
               ((boolean[]) buf[104])[0] = rslt.wasNull();
               ((int[]) buf[105])[0] = rslt.getInt(54);
               ((boolean[]) buf[106])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[107])[0] = rslt.getBigDecimal(55,2);
               ((boolean[]) buf[108])[0] = rslt.wasNull();
               ((String[]) buf[109])[0] = rslt.getString(56, 6);
               ((boolean[]) buf[110])[0] = rslt.wasNull();
               ((String[]) buf[111])[0] = rslt.getString(57, 60);
               ((short[]) buf[112])[0] = rslt.getShort(58);
               ((boolean[]) buf[113])[0] = rslt.wasNull();
               ((short[]) buf[114])[0] = rslt.getShort(59);
               ((boolean[]) buf[115])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[116])[0] = rslt.getBigDecimal(60,2);
               ((boolean[]) buf[117])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[118])[0] = rslt.getBigDecimal(61,2);
               ((boolean[]) buf[119])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[120])[0] = rslt.getBigDecimal(62,4);
               ((boolean[]) buf[121])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[122])[0] = rslt.getBigDecimal(63,4);
               ((boolean[]) buf[123])[0] = rslt.wasNull();
               ((String[]) buf[124])[0] = rslt.getString(64, 6);
               ((String[]) buf[125])[0] = rslt.getString(65, 16);
               ((boolean[]) buf[126])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[127])[0] = rslt.getBigDecimal(66,4);
               ((boolean[]) buf[128])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[129])[0] = rslt.getBigDecimal(67,4);
               ((boolean[]) buf[130])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[131])[0] = rslt.getBigDecimal(68,4);
               ((boolean[]) buf[132])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[133])[0] = rslt.getBigDecimal(69,4);
               ((boolean[]) buf[134])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[135])[0] = rslt.getBigDecimal(70,4);
               ((boolean[]) buf[136])[0] = rslt.wasNull();
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
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

