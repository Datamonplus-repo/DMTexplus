package app.produccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class cargasproduccionporfase_wcgetfilterdata extends GXProcedure
{
   public cargasproduccionporfase_wcgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( cargasproduccionporfase_wcgetfilterdata.class ), "" );
   }

   public cargasproduccionporfase_wcgetfilterdata( int remoteHandle ,
                                                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      cargasproduccionporfase_wcgetfilterdata.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      cargasproduccionporfase_wcgetfilterdata.this.AV50DDOName = aP0;
      cargasproduccionporfase_wcgetfilterdata.this.AV48SearchTxt = aP1;
      cargasproduccionporfase_wcgetfilterdata.this.AV49SearchTxtTo = aP2;
      cargasproduccionporfase_wcgetfilterdata.this.aP3 = aP3;
      cargasproduccionporfase_wcgetfilterdata.this.aP4 = aP4;
      cargasproduccionporfase_wcgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV53Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV56OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV58OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
      GXv_SdtWWPContext1[0] = AV9WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext1) ;
      AV9WWPContext = GXv_SdtWWPContext1[0] ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( GXutil.strcmp(GXutil.upper( AV50DDOName), "DDO_MAQCODBIS") == 0 )
      {
         /* Execute user subroutine: 'LOADMAQCODBISOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV50DDOName), "DDO_CLINOM") == 0 )
      {
         /* Execute user subroutine: 'LOADCLINOMOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV50DDOName), "DDO_BARNHDR") == 0 )
      {
         /* Execute user subroutine: 'LOADBARNHDROPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV50DDOName), "DDO_BARSER") == 0 )
      {
         /* Execute user subroutine: 'LOADBARSEROPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV50DDOName), "DDO_BARSERDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADBARSERDSCOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV50DDOName), "DDO_BARCOLNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADBARCOLNOMOPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV50DDOName), "DDO_BARNOMCLI") == 0 )
      {
         /* Execute user subroutine: 'LOADBARNOMCLIOPTIONS' */
         S181 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV50DDOName), "DDO_BARFASCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADBARFASCODOPTIONS' */
         S191 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV50DDOName), "DDO_BARFASSIG") == 0 )
      {
         /* Execute user subroutine: 'LOADBARFASSIGOPTIONS' */
         S201 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV50DDOName), "DDO_BARDIBCLI") == 0 )
      {
         /* Execute user subroutine: 'LOADBARDIBCLIOPTIONS' */
         S211 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV54OptionsJson = AV53Options.toJSonString(false) ;
      AV57OptionsDescJson = AV56OptionsDesc.toJSonString(false) ;
      AV59OptionIndexesJson = AV58OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV61Session.getValue("Produccion.CargasProduccionporFase_WCGridState"), "") == 0 )
      {
         AV63GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Produccion.CargasProduccionporFase_WCGridState"), null, null);
      }
      else
      {
         AV63GridState.fromxml(AV61Session.getValue("Produccion.CargasProduccionporFase_WCGridState"), null, null);
      }
      AV92GXV1 = 1 ;
      while ( AV92GXV1 <= AV63GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV64GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV63GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV92GXV1));
         if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV66FilterFullText = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCODBIS") == 0 )
         {
            AV80TFMaqCodBis = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCODBIS_SEL") == 0 )
         {
            AV81TFMaqCodBis_Sel = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASEST_SEL") == 0 )
         {
            AV10TFBarFasEst_SelsJson = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV11TFBarFasEst_Sels.fromJSonString(AV10TFBarFasEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV12TFCliCod = (int)(GXutil.lval( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV13TFCliCod_To = (int)(GXutil.lval( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV14TFCliNom = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV15TFCliNom_Sel = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV18TFBarNHdr = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV19TFBarNHdr_Sel = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSIT") == 0 )
         {
            AV20TFBarSit = (byte)(GXutil.lval( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV21TFBarSit_To = (byte)(GXutil.lval( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV22TFBarSer = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV23TFBarSer_Sel = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV24TFBarSerDsc = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV25TFBarSerDsc_Sel = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV26TFBarColNom = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV27TFBarColNom_Sel = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUM") == 0 )
         {
            AV28TFBarColNum = (int)(GXutil.lval( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV29TFBarColNum_To = (int)(GXutil.lval( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPCOL") == 0 )
         {
            AV30TFBarTipCol = (byte)(GXutil.lval( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV31TFBarTipCol_To = (byte)(GXutil.lval( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI") == 0 )
         {
            AV32TFBarNomCli = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI_SEL") == 0 )
         {
            AV33TFBarNomCli_Sel = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARKGM") == 0 )
         {
            AV34TFBarKgm = CommonUtil.decimalVal( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV35TFBarKgm_To = CommonUtil.decimalVal( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMTR") == 0 )
         {
            AV36TFBarMtr = CommonUtil.decimalVal( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV37TFBarMtr_To = CommonUtil.decimalVal( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASCOD") == 0 )
         {
            AV38TFBarFasCod = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASCOD_SEL") == 0 )
         {
            AV39TFBarFasCod_Sel = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASLIN") == 0 )
         {
            AV40TFBarFasLin = (short)(GXutil.lval( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV41TFBarFasLin_To = (short)(GXutil.lval( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASSIG") == 0 )
         {
            AV42TFBarFasSig = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASSIG_SEL") == 0 )
         {
            AV43TFBarFasSig_Sel = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARORDLIN") == 0 )
         {
            AV44TFBarOrdLin = (short)(GXutil.lval( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV45TFBarOrdLin_To = (short)(GXutil.lval( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARDIBCLI") == 0 )
         {
            AV86TFBarDibCli = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARDIBCLI_SEL") == 0 )
         {
            AV87TFBarDibCli_Sel = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARACAANH") == 0 )
         {
            AV46TFBarAcaAnh = (short)(GXutil.lval( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV47TFBarAcaAnh_To = (short)(GXutil.lval( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV67Emprcod = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FASCOD") == 0 )
         {
            AV77Fascod = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV68Clicod = (int)(GXutil.lval( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD_TO") == 0 )
         {
            AV69Clicod_to = (int)(GXutil.lval( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARFECGEN") == 0 )
         {
            AV70BarFecgen = localUtil.ctod( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARFECGEN_TO") == 0 )
         {
            AV71BarFecGen_to = localUtil.ctod( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSIT") == 0 )
         {
            AV72BarSIt = (byte)(GXutil.lval( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSIT_TO") == 0 )
         {
            AV73Barsit_to = (byte)(GXutil.lval( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARFASEST") == 0 )
         {
            AV74BarfasEst = (byte)(GXutil.lval( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARFASEST_TO") == 0 )
         {
            AV75BarFasEst_to = (byte)(GXutil.lval( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARACAANH") == 0 )
         {
            AV76BarAcaAnh = (short)(GXutil.lval( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV92GXV1 = (int)(AV92GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADMAQCODBISOPTIONS' Routine */
      returnInSub = false ;
      AV80TFMaqCodBis = AV48SearchTxt ;
      AV81TFMaqCodBis_Sel = "" ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(A153BarFasEst) ,
                                           AV11TFBarFasEst_Sels ,
                                           AV81TFMaqCodBis_Sel ,
                                           AV80TFMaqCodBis ,
                                           Integer.valueOf(AV11TFBarFasEst_Sels.size()) ,
                                           Integer.valueOf(AV12TFCliCod) ,
                                           Integer.valueOf(AV13TFCliCod_To) ,
                                           AV15TFCliNom_Sel ,
                                           AV14TFCliNom ,
                                           AV19TFBarNHdr_Sel ,
                                           AV18TFBarNHdr ,
                                           Byte.valueOf(AV20TFBarSit) ,
                                           Byte.valueOf(AV21TFBarSit_To) ,
                                           AV23TFBarSer_Sel ,
                                           AV22TFBarSer ,
                                           AV25TFBarSerDsc_Sel ,
                                           AV24TFBarSerDsc ,
                                           AV27TFBarColNom_Sel ,
                                           AV26TFBarColNom ,
                                           Integer.valueOf(AV28TFBarColNum) ,
                                           Integer.valueOf(AV29TFBarColNum_To) ,
                                           Byte.valueOf(AV30TFBarTipCol) ,
                                           Byte.valueOf(AV31TFBarTipCol_To) ,
                                           AV33TFBarNomCli_Sel ,
                                           AV32TFBarNomCli ,
                                           AV34TFBarKgm ,
                                           AV35TFBarKgm_To ,
                                           AV36TFBarMtr ,
                                           AV37TFBarMtr_To ,
                                           Short.valueOf(AV44TFBarOrdLin) ,
                                           Short.valueOf(AV45TFBarOrdLin_To) ,
                                           AV87TFBarDibCli_Sel ,
                                           AV86TFBarDibCli ,
                                           Short.valueOf(AV46TFBarAcaAnh) ,
                                           Short.valueOf(AV47TFBarAcaAnh_To) ,
                                           A603MaqCodBis ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Byte.valueOf(A213BarSit) ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           Byte.valueOf(A218BarTipCol) ,
                                           A1234BarNomCli ,
                                           A166BarKgm ,
                                           A184BarMtr ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A1798BarDibCli ,
                                           Short.valueOf(A4466BarAcaAnh) ,
                                           AV66FilterFullText ,
                                           A13696BarNHdr ,
                                           A151BarFasCod ,
                                           Short.valueOf(A154BarFasLin) ,
                                           A1955BarFasSig ,
                                           AV39TFBarFasCod_Sel ,
                                           AV38TFBarFasCod ,
                                           Short.valueOf(AV40TFBarFasLin) ,
                                           Short.valueOf(AV41TFBarFasLin_To) ,
                                           AV43TFBarFasSig_Sel ,
                                           AV42TFBarFasSig ,
                                           Integer.valueOf(AV68Clicod) ,
                                           Integer.valueOf(AV69Clicod_to) ,
                                           A159BarFecGen ,
                                           AV70BarFecgen ,
                                           AV71BarFecGen_to ,
                                           Byte.valueOf(AV72BarSIt) ,
                                           Byte.valueOf(AV73Barsit_to) ,
                                           Byte.valueOf(AV74BarfasEst) ,
                                           Byte.valueOf(AV75BarFasEst_to) ,
                                           Short.valueOf(AV76BarAcaAnh) ,
                                           A457FasCod ,
                                           AV77Fascod ,
                                           AV67Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV38TFBarFasCod = GXutil.padr( GXutil.rtrim( AV38TFBarFasCod), 8, "%") ;
      lV42TFBarFasSig = GXutil.padr( GXutil.rtrim( AV42TFBarFasSig), 8, "%") ;
      lV80TFMaqCodBis = GXutil.padr( GXutil.rtrim( AV80TFMaqCodBis), 6, "%") ;
      lV14TFCliNom = GXutil.padr( GXutil.rtrim( AV14TFCliNom), 30, "%") ;
      lV18TFBarNHdr = GXutil.padr( GXutil.rtrim( AV18TFBarNHdr), 11, "%") ;
      lV22TFBarSer = GXutil.padr( GXutil.rtrim( AV22TFBarSer), 16, "%") ;
      lV24TFBarSerDsc = GXutil.padr( GXutil.rtrim( AV24TFBarSerDsc), 26, "%") ;
      lV26TFBarColNom = GXutil.padr( GXutil.rtrim( AV26TFBarColNom), 13, "%") ;
      lV32TFBarNomCli = GXutil.padr( GXutil.rtrim( AV32TFBarNomCli), 13, "%") ;
      lV86TFBarDibCli = GXutil.padr( GXutil.rtrim( AV86TFBarDibCli), 16, "%") ;
      /* Using cursor P093910 */
      pr_default.execute(0, new Object[] {AV67Emprcod, AV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, AV39TFBarFasCod_Sel, AV38TFBarFasCod, lV38TFBarFasCod, AV39TFBarFasCod_Sel, AV39TFBarFasCod_Sel, Short.valueOf(AV40TFBarFasLin), Short.valueOf(AV40TFBarFasLin), Short.valueOf(AV41TFBarFasLin_To), Short.valueOf(AV41TFBarFasLin_To), AV43TFBarFasSig_Sel, AV42TFBarFasSig, lV42TFBarFasSig, AV43TFBarFasSig_Sel, AV43TFBarFasSig_Sel, Integer.valueOf(AV68Clicod), Integer.valueOf(AV69Clicod_to), AV70BarFecgen, AV71BarFecGen_to, Byte.valueOf(AV72BarSIt), Byte.valueOf(AV73Barsit_to), Byte.valueOf(AV74BarfasEst), Byte.valueOf(AV75BarFasEst_to), Short.valueOf(AV76BarAcaAnh), Short.valueOf(AV76BarAcaAnh), AV77Fascod, lV80TFMaqCodBis, AV81TFMaqCodBis_Sel, Integer.valueOf(AV12TFCliCod), Integer.valueOf(AV13TFCliCod_To), lV14TFCliNom, AV15TFCliNom_Sel, lV18TFBarNHdr, AV19TFBarNHdr_Sel, Byte.valueOf(AV20TFBarSit), Byte.valueOf(AV21TFBarSit_To), lV22TFBarSer, AV23TFBarSer_Sel, lV24TFBarSerDsc, AV25TFBarSerDsc_Sel, lV26TFBarColNom, AV27TFBarColNom_Sel, Integer.valueOf(AV28TFBarColNum), Integer.valueOf(AV29TFBarColNum_To), Byte.valueOf(AV30TFBarTipCol), Byte.valueOf(AV31TFBarTipCol_To), lV32TFBarNomCli, AV33TFBarNomCli_Sel, AV34TFBarKgm, AV35TFBarKgm_To, AV36TFBarMtr, AV37TFBarMtr_To, Short.valueOf(AV44TFBarOrdLin), Short.valueOf(AV45TFBarOrdLin_To), lV86TFBarDibCli, AV87TFBarDibCli_Sel, Short.valueOf(AV46TFBarAcaAnh), Short.valueOf(AV47TFBarAcaAnh_To)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9392 = false ;
         A396EmprCod = P093910_A396EmprCod[0] ;
         A603MaqCodBis = P093910_A603MaqCodBis[0] ;
         A159BarFecGen = P093910_A159BarFecGen[0] ;
         A457FasCod = P093910_A457FasCod[0] ;
         A4466BarAcaAnh = P093910_A4466BarAcaAnh[0] ;
         A1798BarDibCli = P093910_A1798BarDibCli[0] ;
         A194BarOrdLin = P093910_A194BarOrdLin[0] ;
         A1234BarNomCli = P093910_A1234BarNomCli[0] ;
         A218BarTipCol = P093910_A218BarTipCol[0] ;
         A136BarColNum = P093910_A136BarColNum[0] ;
         A135BarColNom = P093910_A135BarColNom[0] ;
         A1652BarSerDsc = P093910_A1652BarSerDsc[0] ;
         A212BarSer = P093910_A212BarSer[0] ;
         A213BarSit = P093910_A213BarSit[0] ;
         A13696BarNHdr = P093910_A13696BarNHdr[0] ;
         A279CliNom = P093910_A279CliNom[0] ;
         A252CliCod = P093910_A252CliCod[0] ;
         n252CliCod = P093910_n252CliCod[0] ;
         A153BarFasEst = P093910_A153BarFasEst[0] ;
         A1955BarFasSig = P093910_A1955BarFasSig[0] ;
         n1955BarFasSig = P093910_n1955BarFasSig[0] ;
         A154BarFasLin = P093910_A154BarFasLin[0] ;
         n154BarFasLin = P093910_n154BarFasLin[0] ;
         A151BarFasCod = P093910_A151BarFasCod[0] ;
         n151BarFasCod = P093910_n151BarFasCod[0] ;
         A184BarMtr = P093910_A184BarMtr[0] ;
         A166BarKgm = P093910_A166BarKgm[0] ;
         A129BarCod = P093910_A129BarCod[0] ;
         A132BarCodReo = P093910_A132BarCodReo[0] ;
         A130BarCodPar = P093910_A130BarCodPar[0] ;
         A758ProCod = P093910_A758ProCod[0] ;
         A159BarFecGen = P093910_A159BarFecGen[0] ;
         A4466BarAcaAnh = P093910_A4466BarAcaAnh[0] ;
         A1798BarDibCli = P093910_A1798BarDibCli[0] ;
         A1234BarNomCli = P093910_A1234BarNomCli[0] ;
         A218BarTipCol = P093910_A218BarTipCol[0] ;
         A136BarColNum = P093910_A136BarColNum[0] ;
         A135BarColNom = P093910_A135BarColNom[0] ;
         A1652BarSerDsc = P093910_A1652BarSerDsc[0] ;
         A212BarSer = P093910_A212BarSer[0] ;
         A213BarSit = P093910_A213BarSit[0] ;
         A13696BarNHdr = P093910_A13696BarNHdr[0] ;
         A252CliCod = P093910_A252CliCod[0] ;
         n252CliCod = P093910_n252CliCod[0] ;
         A279CliNom = P093910_A279CliNom[0] ;
         A1955BarFasSig = P093910_A1955BarFasSig[0] ;
         n1955BarFasSig = P093910_n1955BarFasSig[0] ;
         A154BarFasLin = P093910_A154BarFasLin[0] ;
         n154BarFasLin = P093910_n154BarFasLin[0] ;
         A151BarFasCod = P093910_A151BarFasCod[0] ;
         n151BarFasCod = P093910_n151BarFasCod[0] ;
         A184BarMtr = P093910_A184BarMtr[0] ;
         A166BarKgm = P093910_A166BarKgm[0] ;
         AV60count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P093910_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P093910_A603MaqCodBis[0], A603MaqCodBis) == 0 ) )
         {
            brk9392 = false ;
            A194BarOrdLin = P093910_A194BarOrdLin[0] ;
            A129BarCod = P093910_A129BarCod[0] ;
            A132BarCodReo = P093910_A132BarCodReo[0] ;
            A130BarCodPar = P093910_A130BarCodPar[0] ;
            A758ProCod = P093910_A758ProCod[0] ;
            AV60count = (long)(AV60count+1) ;
            brk9392 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A603MaqCodBis)==0) )
         {
            AV52Option = A603MaqCodBis ;
            AV53Options.add(AV52Option, 0);
            AV58OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV60count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV53Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9392 )
         {
            brk9392 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV14TFCliNom = AV48SearchTxt ;
      AV15TFCliNom_Sel = "" ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Byte.valueOf(A153BarFasEst) ,
                                           AV11TFBarFasEst_Sels ,
                                           AV81TFMaqCodBis_Sel ,
                                           AV80TFMaqCodBis ,
                                           Integer.valueOf(AV11TFBarFasEst_Sels.size()) ,
                                           Integer.valueOf(AV12TFCliCod) ,
                                           Integer.valueOf(AV13TFCliCod_To) ,
                                           AV15TFCliNom_Sel ,
                                           AV14TFCliNom ,
                                           AV19TFBarNHdr_Sel ,
                                           AV18TFBarNHdr ,
                                           Byte.valueOf(AV20TFBarSit) ,
                                           Byte.valueOf(AV21TFBarSit_To) ,
                                           AV23TFBarSer_Sel ,
                                           AV22TFBarSer ,
                                           AV25TFBarSerDsc_Sel ,
                                           AV24TFBarSerDsc ,
                                           AV27TFBarColNom_Sel ,
                                           AV26TFBarColNom ,
                                           Integer.valueOf(AV28TFBarColNum) ,
                                           Integer.valueOf(AV29TFBarColNum_To) ,
                                           Byte.valueOf(AV30TFBarTipCol) ,
                                           Byte.valueOf(AV31TFBarTipCol_To) ,
                                           AV33TFBarNomCli_Sel ,
                                           AV32TFBarNomCli ,
                                           AV34TFBarKgm ,
                                           AV35TFBarKgm_To ,
                                           AV36TFBarMtr ,
                                           AV37TFBarMtr_To ,
                                           Short.valueOf(AV44TFBarOrdLin) ,
                                           Short.valueOf(AV45TFBarOrdLin_To) ,
                                           AV87TFBarDibCli_Sel ,
                                           AV86TFBarDibCli ,
                                           Short.valueOf(AV46TFBarAcaAnh) ,
                                           Short.valueOf(AV47TFBarAcaAnh_To) ,
                                           A603MaqCodBis ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Byte.valueOf(A213BarSit) ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           Byte.valueOf(A218BarTipCol) ,
                                           A1234BarNomCli ,
                                           A166BarKgm ,
                                           A184BarMtr ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A1798BarDibCli ,
                                           Short.valueOf(A4466BarAcaAnh) ,
                                           AV66FilterFullText ,
                                           A13696BarNHdr ,
                                           A151BarFasCod ,
                                           Short.valueOf(A154BarFasLin) ,
                                           A1955BarFasSig ,
                                           AV39TFBarFasCod_Sel ,
                                           AV38TFBarFasCod ,
                                           Short.valueOf(AV40TFBarFasLin) ,
                                           Short.valueOf(AV41TFBarFasLin_To) ,
                                           AV43TFBarFasSig_Sel ,
                                           AV42TFBarFasSig ,
                                           Integer.valueOf(AV68Clicod) ,
                                           Integer.valueOf(AV69Clicod_to) ,
                                           A159BarFecGen ,
                                           AV70BarFecgen ,
                                           AV71BarFecGen_to ,
                                           Byte.valueOf(AV72BarSIt) ,
                                           Byte.valueOf(AV73Barsit_to) ,
                                           Byte.valueOf(AV74BarfasEst) ,
                                           Byte.valueOf(AV75BarFasEst_to) ,
                                           Short.valueOf(AV76BarAcaAnh) ,
                                           A396EmprCod ,
                                           AV67Emprcod ,
                                           A457FasCod ,
                                           AV77Fascod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV38TFBarFasCod = GXutil.padr( GXutil.rtrim( AV38TFBarFasCod), 8, "%") ;
      lV42TFBarFasSig = GXutil.padr( GXutil.rtrim( AV42TFBarFasSig), 8, "%") ;
      lV80TFMaqCodBis = GXutil.padr( GXutil.rtrim( AV80TFMaqCodBis), 6, "%") ;
      lV14TFCliNom = GXutil.padr( GXutil.rtrim( AV14TFCliNom), 30, "%") ;
      lV18TFBarNHdr = GXutil.padr( GXutil.rtrim( AV18TFBarNHdr), 11, "%") ;
      lV22TFBarSer = GXutil.padr( GXutil.rtrim( AV22TFBarSer), 16, "%") ;
      lV24TFBarSerDsc = GXutil.padr( GXutil.rtrim( AV24TFBarSerDsc), 26, "%") ;
      lV26TFBarColNom = GXutil.padr( GXutil.rtrim( AV26TFBarColNom), 13, "%") ;
      lV32TFBarNomCli = GXutil.padr( GXutil.rtrim( AV32TFBarNomCli), 13, "%") ;
      lV86TFBarDibCli = GXutil.padr( GXutil.rtrim( AV86TFBarDibCli), 16, "%") ;
      /* Using cursor P093919 */
      pr_default.execute(1, new Object[] {AV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, AV39TFBarFasCod_Sel, AV38TFBarFasCod, lV38TFBarFasCod, AV39TFBarFasCod_Sel, AV39TFBarFasCod_Sel, Short.valueOf(AV40TFBarFasLin), Short.valueOf(AV40TFBarFasLin), Short.valueOf(AV41TFBarFasLin_To), Short.valueOf(AV41TFBarFasLin_To), AV43TFBarFasSig_Sel, AV42TFBarFasSig, lV42TFBarFasSig, AV43TFBarFasSig_Sel, AV43TFBarFasSig_Sel, Integer.valueOf(AV68Clicod), Integer.valueOf(AV69Clicod_to), AV70BarFecgen, AV71BarFecGen_to, Byte.valueOf(AV72BarSIt), Byte.valueOf(AV73Barsit_to), Byte.valueOf(AV74BarfasEst), Byte.valueOf(AV75BarFasEst_to), Short.valueOf(AV76BarAcaAnh), Short.valueOf(AV76BarAcaAnh), AV67Emprcod, AV77Fascod, lV80TFMaqCodBis, AV81TFMaqCodBis_Sel, Integer.valueOf(AV12TFCliCod), Integer.valueOf(AV13TFCliCod_To), lV14TFCliNom, AV15TFCliNom_Sel, lV18TFBarNHdr, AV19TFBarNHdr_Sel, Byte.valueOf(AV20TFBarSit), Byte.valueOf(AV21TFBarSit_To), lV22TFBarSer, AV23TFBarSer_Sel, lV24TFBarSerDsc, AV25TFBarSerDsc_Sel, lV26TFBarColNom, AV27TFBarColNom_Sel, Integer.valueOf(AV28TFBarColNum), Integer.valueOf(AV29TFBarColNum_To), Byte.valueOf(AV30TFBarTipCol), Byte.valueOf(AV31TFBarTipCol_To), lV32TFBarNomCli, AV33TFBarNomCli_Sel, AV34TFBarKgm, AV35TFBarKgm_To, AV36TFBarMtr, AV37TFBarMtr_To, Short.valueOf(AV44TFBarOrdLin), Short.valueOf(AV45TFBarOrdLin_To), lV86TFBarDibCli, AV87TFBarDibCli_Sel, Short.valueOf(AV46TFBarAcaAnh), Short.valueOf(AV47TFBarAcaAnh_To)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9394 = false ;
         A396EmprCod = P093919_A396EmprCod[0] ;
         A457FasCod = P093919_A457FasCod[0] ;
         A279CliNom = P093919_A279CliNom[0] ;
         A159BarFecGen = P093919_A159BarFecGen[0] ;
         A4466BarAcaAnh = P093919_A4466BarAcaAnh[0] ;
         A1798BarDibCli = P093919_A1798BarDibCli[0] ;
         A194BarOrdLin = P093919_A194BarOrdLin[0] ;
         A1234BarNomCli = P093919_A1234BarNomCli[0] ;
         A218BarTipCol = P093919_A218BarTipCol[0] ;
         A136BarColNum = P093919_A136BarColNum[0] ;
         A135BarColNom = P093919_A135BarColNom[0] ;
         A1652BarSerDsc = P093919_A1652BarSerDsc[0] ;
         A212BarSer = P093919_A212BarSer[0] ;
         A213BarSit = P093919_A213BarSit[0] ;
         A13696BarNHdr = P093919_A13696BarNHdr[0] ;
         A252CliCod = P093919_A252CliCod[0] ;
         n252CliCod = P093919_n252CliCod[0] ;
         A153BarFasEst = P093919_A153BarFasEst[0] ;
         A603MaqCodBis = P093919_A603MaqCodBis[0] ;
         A1955BarFasSig = P093919_A1955BarFasSig[0] ;
         n1955BarFasSig = P093919_n1955BarFasSig[0] ;
         A154BarFasLin = P093919_A154BarFasLin[0] ;
         n154BarFasLin = P093919_n154BarFasLin[0] ;
         A151BarFasCod = P093919_A151BarFasCod[0] ;
         n151BarFasCod = P093919_n151BarFasCod[0] ;
         A184BarMtr = P093919_A184BarMtr[0] ;
         A166BarKgm = P093919_A166BarKgm[0] ;
         A129BarCod = P093919_A129BarCod[0] ;
         A132BarCodReo = P093919_A132BarCodReo[0] ;
         A130BarCodPar = P093919_A130BarCodPar[0] ;
         A758ProCod = P093919_A758ProCod[0] ;
         A159BarFecGen = P093919_A159BarFecGen[0] ;
         A4466BarAcaAnh = P093919_A4466BarAcaAnh[0] ;
         A1798BarDibCli = P093919_A1798BarDibCli[0] ;
         A1234BarNomCli = P093919_A1234BarNomCli[0] ;
         A218BarTipCol = P093919_A218BarTipCol[0] ;
         A136BarColNum = P093919_A136BarColNum[0] ;
         A135BarColNom = P093919_A135BarColNom[0] ;
         A1652BarSerDsc = P093919_A1652BarSerDsc[0] ;
         A212BarSer = P093919_A212BarSer[0] ;
         A213BarSit = P093919_A213BarSit[0] ;
         A13696BarNHdr = P093919_A13696BarNHdr[0] ;
         A252CliCod = P093919_A252CliCod[0] ;
         n252CliCod = P093919_n252CliCod[0] ;
         A279CliNom = P093919_A279CliNom[0] ;
         A1955BarFasSig = P093919_A1955BarFasSig[0] ;
         n1955BarFasSig = P093919_n1955BarFasSig[0] ;
         A154BarFasLin = P093919_A154BarFasLin[0] ;
         n154BarFasLin = P093919_n154BarFasLin[0] ;
         A151BarFasCod = P093919_A151BarFasCod[0] ;
         n151BarFasCod = P093919_n151BarFasCod[0] ;
         A184BarMtr = P093919_A184BarMtr[0] ;
         A166BarKgm = P093919_A166BarKgm[0] ;
         AV60count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P093919_A279CliNom[0], A279CliNom) == 0 ) )
         {
            brk9394 = false ;
            A396EmprCod = P093919_A396EmprCod[0] ;
            A194BarOrdLin = P093919_A194BarOrdLin[0] ;
            A252CliCod = P093919_A252CliCod[0] ;
            n252CliCod = P093919_n252CliCod[0] ;
            A129BarCod = P093919_A129BarCod[0] ;
            A132BarCodReo = P093919_A132BarCodReo[0] ;
            A130BarCodPar = P093919_A130BarCodPar[0] ;
            A758ProCod = P093919_A758ProCod[0] ;
            A252CliCod = P093919_A252CliCod[0] ;
            n252CliCod = P093919_n252CliCod[0] ;
            AV60count = (long)(AV60count+1) ;
            brk9394 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A279CliNom)==0) )
         {
            AV52Option = A279CliNom ;
            AV53Options.add(AV52Option, 0);
            AV58OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV60count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV53Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9394 )
         {
            brk9394 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADBARNHDROPTIONS' Routine */
      returnInSub = false ;
      AV18TFBarNHdr = AV48SearchTxt ;
      AV19TFBarNHdr_Sel = "" ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Byte.valueOf(A153BarFasEst) ,
                                           AV11TFBarFasEst_Sels ,
                                           AV81TFMaqCodBis_Sel ,
                                           AV80TFMaqCodBis ,
                                           Integer.valueOf(AV11TFBarFasEst_Sels.size()) ,
                                           Integer.valueOf(AV12TFCliCod) ,
                                           Integer.valueOf(AV13TFCliCod_To) ,
                                           AV15TFCliNom_Sel ,
                                           AV14TFCliNom ,
                                           AV19TFBarNHdr_Sel ,
                                           AV18TFBarNHdr ,
                                           Byte.valueOf(AV20TFBarSit) ,
                                           Byte.valueOf(AV21TFBarSit_To) ,
                                           AV23TFBarSer_Sel ,
                                           AV22TFBarSer ,
                                           AV25TFBarSerDsc_Sel ,
                                           AV24TFBarSerDsc ,
                                           AV27TFBarColNom_Sel ,
                                           AV26TFBarColNom ,
                                           Integer.valueOf(AV28TFBarColNum) ,
                                           Integer.valueOf(AV29TFBarColNum_To) ,
                                           Byte.valueOf(AV30TFBarTipCol) ,
                                           Byte.valueOf(AV31TFBarTipCol_To) ,
                                           AV33TFBarNomCli_Sel ,
                                           AV32TFBarNomCli ,
                                           AV34TFBarKgm ,
                                           AV35TFBarKgm_To ,
                                           AV36TFBarMtr ,
                                           AV37TFBarMtr_To ,
                                           Short.valueOf(AV44TFBarOrdLin) ,
                                           Short.valueOf(AV45TFBarOrdLin_To) ,
                                           AV87TFBarDibCli_Sel ,
                                           AV86TFBarDibCli ,
                                           Short.valueOf(AV46TFBarAcaAnh) ,
                                           Short.valueOf(AV47TFBarAcaAnh_To) ,
                                           A603MaqCodBis ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Byte.valueOf(A213BarSit) ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           Byte.valueOf(A218BarTipCol) ,
                                           A1234BarNomCli ,
                                           A166BarKgm ,
                                           A184BarMtr ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A1798BarDibCli ,
                                           Short.valueOf(A4466BarAcaAnh) ,
                                           AV66FilterFullText ,
                                           A13696BarNHdr ,
                                           A151BarFasCod ,
                                           Short.valueOf(A154BarFasLin) ,
                                           A1955BarFasSig ,
                                           AV39TFBarFasCod_Sel ,
                                           AV38TFBarFasCod ,
                                           Short.valueOf(AV40TFBarFasLin) ,
                                           Short.valueOf(AV41TFBarFasLin_To) ,
                                           AV43TFBarFasSig_Sel ,
                                           AV42TFBarFasSig ,
                                           Integer.valueOf(AV68Clicod) ,
                                           Integer.valueOf(AV69Clicod_to) ,
                                           A159BarFecGen ,
                                           AV70BarFecgen ,
                                           AV71BarFecGen_to ,
                                           Byte.valueOf(AV72BarSIt) ,
                                           Byte.valueOf(AV73Barsit_to) ,
                                           Byte.valueOf(AV74BarfasEst) ,
                                           Byte.valueOf(AV75BarFasEst_to) ,
                                           Short.valueOf(AV76BarAcaAnh) ,
                                           AV67Emprcod ,
                                           AV77Fascod ,
                                           A396EmprCod ,
                                           A457FasCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV38TFBarFasCod = GXutil.padr( GXutil.rtrim( AV38TFBarFasCod), 8, "%") ;
      lV42TFBarFasSig = GXutil.padr( GXutil.rtrim( AV42TFBarFasSig), 8, "%") ;
      lV80TFMaqCodBis = GXutil.padr( GXutil.rtrim( AV80TFMaqCodBis), 6, "%") ;
      lV14TFCliNom = GXutil.padr( GXutil.rtrim( AV14TFCliNom), 30, "%") ;
      lV18TFBarNHdr = GXutil.padr( GXutil.rtrim( AV18TFBarNHdr), 11, "%") ;
      lV22TFBarSer = GXutil.padr( GXutil.rtrim( AV22TFBarSer), 16, "%") ;
      lV24TFBarSerDsc = GXutil.padr( GXutil.rtrim( AV24TFBarSerDsc), 26, "%") ;
      lV26TFBarColNom = GXutil.padr( GXutil.rtrim( AV26TFBarColNom), 13, "%") ;
      lV32TFBarNomCli = GXutil.padr( GXutil.rtrim( AV32TFBarNomCli), 13, "%") ;
      lV86TFBarDibCli = GXutil.padr( GXutil.rtrim( AV86TFBarDibCli), 16, "%") ;
      /* Using cursor P093928 */
      pr_default.execute(2, new Object[] {AV67Emprcod, AV77Fascod, AV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, AV39TFBarFasCod_Sel, AV38TFBarFasCod, lV38TFBarFasCod, AV39TFBarFasCod_Sel, AV39TFBarFasCod_Sel, Short.valueOf(AV40TFBarFasLin), Short.valueOf(AV40TFBarFasLin), Short.valueOf(AV41TFBarFasLin_To), Short.valueOf(AV41TFBarFasLin_To), AV43TFBarFasSig_Sel, AV42TFBarFasSig, lV42TFBarFasSig, AV43TFBarFasSig_Sel, AV43TFBarFasSig_Sel, Integer.valueOf(AV68Clicod), Integer.valueOf(AV69Clicod_to), AV70BarFecgen, AV71BarFecGen_to, Byte.valueOf(AV72BarSIt), Byte.valueOf(AV73Barsit_to), Byte.valueOf(AV74BarfasEst), Byte.valueOf(AV75BarFasEst_to), Short.valueOf(AV76BarAcaAnh), Short.valueOf(AV76BarAcaAnh), lV80TFMaqCodBis, AV81TFMaqCodBis_Sel, Integer.valueOf(AV12TFCliCod), Integer.valueOf(AV13TFCliCod_To), lV14TFCliNom, AV15TFCliNom_Sel, lV18TFBarNHdr, AV19TFBarNHdr_Sel, Byte.valueOf(AV20TFBarSit), Byte.valueOf(AV21TFBarSit_To), lV22TFBarSer, AV23TFBarSer_Sel, lV24TFBarSerDsc, AV25TFBarSerDsc_Sel, lV26TFBarColNom, AV27TFBarColNom_Sel, Integer.valueOf(AV28TFBarColNum), Integer.valueOf(AV29TFBarColNum_To), Byte.valueOf(AV30TFBarTipCol), Byte.valueOf(AV31TFBarTipCol_To), lV32TFBarNomCli, AV33TFBarNomCli_Sel, AV34TFBarKgm, AV35TFBarKgm_To, AV36TFBarMtr, AV37TFBarMtr_To, Short.valueOf(AV44TFBarOrdLin), Short.valueOf(AV45TFBarOrdLin_To), lV86TFBarDibCli, AV87TFBarDibCli_Sel, Short.valueOf(AV46TFBarAcaAnh), Short.valueOf(AV47TFBarAcaAnh_To)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A159BarFecGen = P093928_A159BarFecGen[0] ;
         A457FasCod = P093928_A457FasCod[0] ;
         A396EmprCod = P093928_A396EmprCod[0] ;
         A4466BarAcaAnh = P093928_A4466BarAcaAnh[0] ;
         A1798BarDibCli = P093928_A1798BarDibCli[0] ;
         A194BarOrdLin = P093928_A194BarOrdLin[0] ;
         A1234BarNomCli = P093928_A1234BarNomCli[0] ;
         A218BarTipCol = P093928_A218BarTipCol[0] ;
         A136BarColNum = P093928_A136BarColNum[0] ;
         A135BarColNom = P093928_A135BarColNom[0] ;
         A1652BarSerDsc = P093928_A1652BarSerDsc[0] ;
         A212BarSer = P093928_A212BarSer[0] ;
         A213BarSit = P093928_A213BarSit[0] ;
         A13696BarNHdr = P093928_A13696BarNHdr[0] ;
         A279CliNom = P093928_A279CliNom[0] ;
         A252CliCod = P093928_A252CliCod[0] ;
         n252CliCod = P093928_n252CliCod[0] ;
         A153BarFasEst = P093928_A153BarFasEst[0] ;
         A603MaqCodBis = P093928_A603MaqCodBis[0] ;
         A1955BarFasSig = P093928_A1955BarFasSig[0] ;
         n1955BarFasSig = P093928_n1955BarFasSig[0] ;
         A154BarFasLin = P093928_A154BarFasLin[0] ;
         n154BarFasLin = P093928_n154BarFasLin[0] ;
         A151BarFasCod = P093928_A151BarFasCod[0] ;
         n151BarFasCod = P093928_n151BarFasCod[0] ;
         A184BarMtr = P093928_A184BarMtr[0] ;
         A166BarKgm = P093928_A166BarKgm[0] ;
         A129BarCod = P093928_A129BarCod[0] ;
         A132BarCodReo = P093928_A132BarCodReo[0] ;
         A130BarCodPar = P093928_A130BarCodPar[0] ;
         A758ProCod = P093928_A758ProCod[0] ;
         A159BarFecGen = P093928_A159BarFecGen[0] ;
         A4466BarAcaAnh = P093928_A4466BarAcaAnh[0] ;
         A1798BarDibCli = P093928_A1798BarDibCli[0] ;
         A1234BarNomCli = P093928_A1234BarNomCli[0] ;
         A218BarTipCol = P093928_A218BarTipCol[0] ;
         A136BarColNum = P093928_A136BarColNum[0] ;
         A135BarColNom = P093928_A135BarColNom[0] ;
         A1652BarSerDsc = P093928_A1652BarSerDsc[0] ;
         A212BarSer = P093928_A212BarSer[0] ;
         A213BarSit = P093928_A213BarSit[0] ;
         A13696BarNHdr = P093928_A13696BarNHdr[0] ;
         A252CliCod = P093928_A252CliCod[0] ;
         n252CliCod = P093928_n252CliCod[0] ;
         A279CliNom = P093928_A279CliNom[0] ;
         A1955BarFasSig = P093928_A1955BarFasSig[0] ;
         n1955BarFasSig = P093928_n1955BarFasSig[0] ;
         A154BarFasLin = P093928_A154BarFasLin[0] ;
         n154BarFasLin = P093928_n154BarFasLin[0] ;
         A151BarFasCod = P093928_A151BarFasCod[0] ;
         n151BarFasCod = P093928_n151BarFasCod[0] ;
         A184BarMtr = P093928_A184BarMtr[0] ;
         A166BarKgm = P093928_A166BarKgm[0] ;
         if ( ! (GXutil.strcmp("", A13696BarNHdr)==0) )
         {
            AV52Option = A13696BarNHdr ;
            AV51InsertIndex = 1 ;
            while ( ( AV51InsertIndex <= AV53Options.size() ) && ( GXutil.strcmp((String)AV53Options.elementAt(-1+AV51InsertIndex), AV52Option) < 0 ) )
            {
               AV51InsertIndex = (int)(AV51InsertIndex+1) ;
            }
            if ( ( AV51InsertIndex <= AV53Options.size() ) && ( GXutil.strcmp((String)AV53Options.elementAt(-1+AV51InsertIndex), AV52Option) == 0 ) )
            {
               AV60count = GXutil.lval( (String)AV58OptionIndexes.elementAt(-1+AV51InsertIndex)) ;
               AV60count = (long)(AV60count+1) ;
               AV58OptionIndexes.removeItem(AV51InsertIndex);
               AV58OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV60count), "Z,ZZZ,ZZZ,ZZ9")), AV51InsertIndex);
            }
            else
            {
               AV53Options.add(AV52Option, AV51InsertIndex);
               AV58OptionIndexes.add("1", AV51InsertIndex);
            }
         }
         if ( AV53Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADBARSEROPTIONS' Routine */
      returnInSub = false ;
      AV22TFBarSer = AV48SearchTxt ;
      AV23TFBarSer_Sel = "" ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           Byte.valueOf(A153BarFasEst) ,
                                           AV11TFBarFasEst_Sels ,
                                           AV81TFMaqCodBis_Sel ,
                                           AV80TFMaqCodBis ,
                                           Integer.valueOf(AV11TFBarFasEst_Sels.size()) ,
                                           Integer.valueOf(AV12TFCliCod) ,
                                           Integer.valueOf(AV13TFCliCod_To) ,
                                           AV15TFCliNom_Sel ,
                                           AV14TFCliNom ,
                                           AV19TFBarNHdr_Sel ,
                                           AV18TFBarNHdr ,
                                           Byte.valueOf(AV20TFBarSit) ,
                                           Byte.valueOf(AV21TFBarSit_To) ,
                                           AV23TFBarSer_Sel ,
                                           AV22TFBarSer ,
                                           AV25TFBarSerDsc_Sel ,
                                           AV24TFBarSerDsc ,
                                           AV27TFBarColNom_Sel ,
                                           AV26TFBarColNom ,
                                           Integer.valueOf(AV28TFBarColNum) ,
                                           Integer.valueOf(AV29TFBarColNum_To) ,
                                           Byte.valueOf(AV30TFBarTipCol) ,
                                           Byte.valueOf(AV31TFBarTipCol_To) ,
                                           AV33TFBarNomCli_Sel ,
                                           AV32TFBarNomCli ,
                                           AV34TFBarKgm ,
                                           AV35TFBarKgm_To ,
                                           AV36TFBarMtr ,
                                           AV37TFBarMtr_To ,
                                           Short.valueOf(AV44TFBarOrdLin) ,
                                           Short.valueOf(AV45TFBarOrdLin_To) ,
                                           AV87TFBarDibCli_Sel ,
                                           AV86TFBarDibCli ,
                                           Short.valueOf(AV46TFBarAcaAnh) ,
                                           Short.valueOf(AV47TFBarAcaAnh_To) ,
                                           A603MaqCodBis ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Byte.valueOf(A213BarSit) ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           Byte.valueOf(A218BarTipCol) ,
                                           A1234BarNomCli ,
                                           A166BarKgm ,
                                           A184BarMtr ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A1798BarDibCli ,
                                           Short.valueOf(A4466BarAcaAnh) ,
                                           AV66FilterFullText ,
                                           A13696BarNHdr ,
                                           A151BarFasCod ,
                                           Short.valueOf(A154BarFasLin) ,
                                           A1955BarFasSig ,
                                           AV39TFBarFasCod_Sel ,
                                           AV38TFBarFasCod ,
                                           Short.valueOf(AV40TFBarFasLin) ,
                                           Short.valueOf(AV41TFBarFasLin_To) ,
                                           AV43TFBarFasSig_Sel ,
                                           AV42TFBarFasSig ,
                                           Integer.valueOf(AV68Clicod) ,
                                           Integer.valueOf(AV69Clicod_to) ,
                                           A159BarFecGen ,
                                           AV70BarFecgen ,
                                           AV71BarFecGen_to ,
                                           Byte.valueOf(AV72BarSIt) ,
                                           Byte.valueOf(AV73Barsit_to) ,
                                           Byte.valueOf(AV74BarfasEst) ,
                                           Byte.valueOf(AV75BarFasEst_to) ,
                                           Short.valueOf(AV76BarAcaAnh) ,
                                           A396EmprCod ,
                                           AV67Emprcod ,
                                           A457FasCod ,
                                           AV77Fascod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV38TFBarFasCod = GXutil.padr( GXutil.rtrim( AV38TFBarFasCod), 8, "%") ;
      lV42TFBarFasSig = GXutil.padr( GXutil.rtrim( AV42TFBarFasSig), 8, "%") ;
      lV80TFMaqCodBis = GXutil.padr( GXutil.rtrim( AV80TFMaqCodBis), 6, "%") ;
      lV14TFCliNom = GXutil.padr( GXutil.rtrim( AV14TFCliNom), 30, "%") ;
      lV18TFBarNHdr = GXutil.padr( GXutil.rtrim( AV18TFBarNHdr), 11, "%") ;
      lV22TFBarSer = GXutil.padr( GXutil.rtrim( AV22TFBarSer), 16, "%") ;
      lV24TFBarSerDsc = GXutil.padr( GXutil.rtrim( AV24TFBarSerDsc), 26, "%") ;
      lV26TFBarColNom = GXutil.padr( GXutil.rtrim( AV26TFBarColNom), 13, "%") ;
      lV32TFBarNomCli = GXutil.padr( GXutil.rtrim( AV32TFBarNomCli), 13, "%") ;
      lV86TFBarDibCli = GXutil.padr( GXutil.rtrim( AV86TFBarDibCli), 16, "%") ;
      /* Using cursor P093937 */
      pr_default.execute(3, new Object[] {AV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, AV39TFBarFasCod_Sel, AV38TFBarFasCod, lV38TFBarFasCod, AV39TFBarFasCod_Sel, AV39TFBarFasCod_Sel, Short.valueOf(AV40TFBarFasLin), Short.valueOf(AV40TFBarFasLin), Short.valueOf(AV41TFBarFasLin_To), Short.valueOf(AV41TFBarFasLin_To), AV43TFBarFasSig_Sel, AV42TFBarFasSig, lV42TFBarFasSig, AV43TFBarFasSig_Sel, AV43TFBarFasSig_Sel, Integer.valueOf(AV68Clicod), Integer.valueOf(AV69Clicod_to), AV70BarFecgen, AV71BarFecGen_to, Byte.valueOf(AV72BarSIt), Byte.valueOf(AV73Barsit_to), Byte.valueOf(AV74BarfasEst), Byte.valueOf(AV75BarFasEst_to), Short.valueOf(AV76BarAcaAnh), Short.valueOf(AV76BarAcaAnh), AV67Emprcod, AV77Fascod, lV80TFMaqCodBis, AV81TFMaqCodBis_Sel, Integer.valueOf(AV12TFCliCod), Integer.valueOf(AV13TFCliCod_To), lV14TFCliNom, AV15TFCliNom_Sel, lV18TFBarNHdr, AV19TFBarNHdr_Sel, Byte.valueOf(AV20TFBarSit), Byte.valueOf(AV21TFBarSit_To), lV22TFBarSer, AV23TFBarSer_Sel, lV24TFBarSerDsc, AV25TFBarSerDsc_Sel, lV26TFBarColNom, AV27TFBarColNom_Sel, Integer.valueOf(AV28TFBarColNum), Integer.valueOf(AV29TFBarColNum_To), Byte.valueOf(AV30TFBarTipCol), Byte.valueOf(AV31TFBarTipCol_To), lV32TFBarNomCli, AV33TFBarNomCli_Sel, AV34TFBarKgm, AV35TFBarKgm_To, AV36TFBarMtr, AV37TFBarMtr_To, Short.valueOf(AV44TFBarOrdLin), Short.valueOf(AV45TFBarOrdLin_To), lV86TFBarDibCli, AV87TFBarDibCli_Sel, Short.valueOf(AV46TFBarAcaAnh), Short.valueOf(AV47TFBarAcaAnh_To)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk9397 = false ;
         A396EmprCod = P093937_A396EmprCod[0] ;
         A457FasCod = P093937_A457FasCod[0] ;
         A212BarSer = P093937_A212BarSer[0] ;
         A159BarFecGen = P093937_A159BarFecGen[0] ;
         A4466BarAcaAnh = P093937_A4466BarAcaAnh[0] ;
         A1798BarDibCli = P093937_A1798BarDibCli[0] ;
         A194BarOrdLin = P093937_A194BarOrdLin[0] ;
         A1234BarNomCli = P093937_A1234BarNomCli[0] ;
         A218BarTipCol = P093937_A218BarTipCol[0] ;
         A136BarColNum = P093937_A136BarColNum[0] ;
         A135BarColNom = P093937_A135BarColNom[0] ;
         A1652BarSerDsc = P093937_A1652BarSerDsc[0] ;
         A213BarSit = P093937_A213BarSit[0] ;
         A13696BarNHdr = P093937_A13696BarNHdr[0] ;
         A279CliNom = P093937_A279CliNom[0] ;
         A252CliCod = P093937_A252CliCod[0] ;
         n252CliCod = P093937_n252CliCod[0] ;
         A153BarFasEst = P093937_A153BarFasEst[0] ;
         A603MaqCodBis = P093937_A603MaqCodBis[0] ;
         A1955BarFasSig = P093937_A1955BarFasSig[0] ;
         n1955BarFasSig = P093937_n1955BarFasSig[0] ;
         A154BarFasLin = P093937_A154BarFasLin[0] ;
         n154BarFasLin = P093937_n154BarFasLin[0] ;
         A151BarFasCod = P093937_A151BarFasCod[0] ;
         n151BarFasCod = P093937_n151BarFasCod[0] ;
         A184BarMtr = P093937_A184BarMtr[0] ;
         A166BarKgm = P093937_A166BarKgm[0] ;
         A129BarCod = P093937_A129BarCod[0] ;
         A132BarCodReo = P093937_A132BarCodReo[0] ;
         A130BarCodPar = P093937_A130BarCodPar[0] ;
         A758ProCod = P093937_A758ProCod[0] ;
         A212BarSer = P093937_A212BarSer[0] ;
         A159BarFecGen = P093937_A159BarFecGen[0] ;
         A4466BarAcaAnh = P093937_A4466BarAcaAnh[0] ;
         A1798BarDibCli = P093937_A1798BarDibCli[0] ;
         A1234BarNomCli = P093937_A1234BarNomCli[0] ;
         A218BarTipCol = P093937_A218BarTipCol[0] ;
         A136BarColNum = P093937_A136BarColNum[0] ;
         A135BarColNom = P093937_A135BarColNom[0] ;
         A1652BarSerDsc = P093937_A1652BarSerDsc[0] ;
         A213BarSit = P093937_A213BarSit[0] ;
         A13696BarNHdr = P093937_A13696BarNHdr[0] ;
         A252CliCod = P093937_A252CliCod[0] ;
         n252CliCod = P093937_n252CliCod[0] ;
         A279CliNom = P093937_A279CliNom[0] ;
         A1955BarFasSig = P093937_A1955BarFasSig[0] ;
         n1955BarFasSig = P093937_n1955BarFasSig[0] ;
         A154BarFasLin = P093937_A154BarFasLin[0] ;
         n154BarFasLin = P093937_n154BarFasLin[0] ;
         A151BarFasCod = P093937_A151BarFasCod[0] ;
         n151BarFasCod = P093937_n151BarFasCod[0] ;
         A184BarMtr = P093937_A184BarMtr[0] ;
         A166BarKgm = P093937_A166BarKgm[0] ;
         AV60count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P093937_A212BarSer[0], A212BarSer) == 0 ) )
         {
            brk9397 = false ;
            A396EmprCod = P093937_A396EmprCod[0] ;
            A194BarOrdLin = P093937_A194BarOrdLin[0] ;
            A129BarCod = P093937_A129BarCod[0] ;
            A132BarCodReo = P093937_A132BarCodReo[0] ;
            A130BarCodPar = P093937_A130BarCodPar[0] ;
            A758ProCod = P093937_A758ProCod[0] ;
            AV60count = (long)(AV60count+1) ;
            brk9397 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A212BarSer)==0) )
         {
            AV52Option = A212BarSer ;
            AV53Options.add(AV52Option, 0);
            AV58OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV60count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV53Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9397 )
         {
            brk9397 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADBARSERDSCOPTIONS' Routine */
      returnInSub = false ;
      AV24TFBarSerDsc = AV48SearchTxt ;
      AV25TFBarSerDsc_Sel = "" ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           Byte.valueOf(A153BarFasEst) ,
                                           AV11TFBarFasEst_Sels ,
                                           AV81TFMaqCodBis_Sel ,
                                           AV80TFMaqCodBis ,
                                           Integer.valueOf(AV11TFBarFasEst_Sels.size()) ,
                                           Integer.valueOf(AV12TFCliCod) ,
                                           Integer.valueOf(AV13TFCliCod_To) ,
                                           AV15TFCliNom_Sel ,
                                           AV14TFCliNom ,
                                           AV19TFBarNHdr_Sel ,
                                           AV18TFBarNHdr ,
                                           Byte.valueOf(AV20TFBarSit) ,
                                           Byte.valueOf(AV21TFBarSit_To) ,
                                           AV23TFBarSer_Sel ,
                                           AV22TFBarSer ,
                                           AV25TFBarSerDsc_Sel ,
                                           AV24TFBarSerDsc ,
                                           AV27TFBarColNom_Sel ,
                                           AV26TFBarColNom ,
                                           Integer.valueOf(AV28TFBarColNum) ,
                                           Integer.valueOf(AV29TFBarColNum_To) ,
                                           Byte.valueOf(AV30TFBarTipCol) ,
                                           Byte.valueOf(AV31TFBarTipCol_To) ,
                                           AV33TFBarNomCli_Sel ,
                                           AV32TFBarNomCli ,
                                           AV34TFBarKgm ,
                                           AV35TFBarKgm_To ,
                                           AV36TFBarMtr ,
                                           AV37TFBarMtr_To ,
                                           Short.valueOf(AV44TFBarOrdLin) ,
                                           Short.valueOf(AV45TFBarOrdLin_To) ,
                                           AV87TFBarDibCli_Sel ,
                                           AV86TFBarDibCli ,
                                           Short.valueOf(AV46TFBarAcaAnh) ,
                                           Short.valueOf(AV47TFBarAcaAnh_To) ,
                                           A603MaqCodBis ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Byte.valueOf(A213BarSit) ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           Byte.valueOf(A218BarTipCol) ,
                                           A1234BarNomCli ,
                                           A166BarKgm ,
                                           A184BarMtr ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A1798BarDibCli ,
                                           Short.valueOf(A4466BarAcaAnh) ,
                                           AV66FilterFullText ,
                                           A13696BarNHdr ,
                                           A151BarFasCod ,
                                           Short.valueOf(A154BarFasLin) ,
                                           A1955BarFasSig ,
                                           AV39TFBarFasCod_Sel ,
                                           AV38TFBarFasCod ,
                                           Short.valueOf(AV40TFBarFasLin) ,
                                           Short.valueOf(AV41TFBarFasLin_To) ,
                                           AV43TFBarFasSig_Sel ,
                                           AV42TFBarFasSig ,
                                           Integer.valueOf(AV68Clicod) ,
                                           Integer.valueOf(AV69Clicod_to) ,
                                           A159BarFecGen ,
                                           AV70BarFecgen ,
                                           AV71BarFecGen_to ,
                                           Byte.valueOf(AV72BarSIt) ,
                                           Byte.valueOf(AV73Barsit_to) ,
                                           Byte.valueOf(AV74BarfasEst) ,
                                           Byte.valueOf(AV75BarFasEst_to) ,
                                           Short.valueOf(AV76BarAcaAnh) ,
                                           A396EmprCod ,
                                           AV67Emprcod ,
                                           A457FasCod ,
                                           AV77Fascod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV38TFBarFasCod = GXutil.padr( GXutil.rtrim( AV38TFBarFasCod), 8, "%") ;
      lV42TFBarFasSig = GXutil.padr( GXutil.rtrim( AV42TFBarFasSig), 8, "%") ;
      lV80TFMaqCodBis = GXutil.padr( GXutil.rtrim( AV80TFMaqCodBis), 6, "%") ;
      lV14TFCliNom = GXutil.padr( GXutil.rtrim( AV14TFCliNom), 30, "%") ;
      lV18TFBarNHdr = GXutil.padr( GXutil.rtrim( AV18TFBarNHdr), 11, "%") ;
      lV22TFBarSer = GXutil.padr( GXutil.rtrim( AV22TFBarSer), 16, "%") ;
      lV24TFBarSerDsc = GXutil.padr( GXutil.rtrim( AV24TFBarSerDsc), 26, "%") ;
      lV26TFBarColNom = GXutil.padr( GXutil.rtrim( AV26TFBarColNom), 13, "%") ;
      lV32TFBarNomCli = GXutil.padr( GXutil.rtrim( AV32TFBarNomCli), 13, "%") ;
      lV86TFBarDibCli = GXutil.padr( GXutil.rtrim( AV86TFBarDibCli), 16, "%") ;
      /* Using cursor P093946 */
      pr_default.execute(4, new Object[] {AV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, AV39TFBarFasCod_Sel, AV38TFBarFasCod, lV38TFBarFasCod, AV39TFBarFasCod_Sel, AV39TFBarFasCod_Sel, Short.valueOf(AV40TFBarFasLin), Short.valueOf(AV40TFBarFasLin), Short.valueOf(AV41TFBarFasLin_To), Short.valueOf(AV41TFBarFasLin_To), AV43TFBarFasSig_Sel, AV42TFBarFasSig, lV42TFBarFasSig, AV43TFBarFasSig_Sel, AV43TFBarFasSig_Sel, Integer.valueOf(AV68Clicod), Integer.valueOf(AV69Clicod_to), AV70BarFecgen, AV71BarFecGen_to, Byte.valueOf(AV72BarSIt), Byte.valueOf(AV73Barsit_to), Byte.valueOf(AV74BarfasEst), Byte.valueOf(AV75BarFasEst_to), Short.valueOf(AV76BarAcaAnh), Short.valueOf(AV76BarAcaAnh), AV67Emprcod, AV77Fascod, lV80TFMaqCodBis, AV81TFMaqCodBis_Sel, Integer.valueOf(AV12TFCliCod), Integer.valueOf(AV13TFCliCod_To), lV14TFCliNom, AV15TFCliNom_Sel, lV18TFBarNHdr, AV19TFBarNHdr_Sel, Byte.valueOf(AV20TFBarSit), Byte.valueOf(AV21TFBarSit_To), lV22TFBarSer, AV23TFBarSer_Sel, lV24TFBarSerDsc, AV25TFBarSerDsc_Sel, lV26TFBarColNom, AV27TFBarColNom_Sel, Integer.valueOf(AV28TFBarColNum), Integer.valueOf(AV29TFBarColNum_To), Byte.valueOf(AV30TFBarTipCol), Byte.valueOf(AV31TFBarTipCol_To), lV32TFBarNomCli, AV33TFBarNomCli_Sel, AV34TFBarKgm, AV35TFBarKgm_To, AV36TFBarMtr, AV37TFBarMtr_To, Short.valueOf(AV44TFBarOrdLin), Short.valueOf(AV45TFBarOrdLin_To), lV86TFBarDibCli, AV87TFBarDibCli_Sel, Short.valueOf(AV46TFBarAcaAnh), Short.valueOf(AV47TFBarAcaAnh_To)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk9399 = false ;
         A396EmprCod = P093946_A396EmprCod[0] ;
         A457FasCod = P093946_A457FasCod[0] ;
         A1652BarSerDsc = P093946_A1652BarSerDsc[0] ;
         A159BarFecGen = P093946_A159BarFecGen[0] ;
         A4466BarAcaAnh = P093946_A4466BarAcaAnh[0] ;
         A1798BarDibCli = P093946_A1798BarDibCli[0] ;
         A194BarOrdLin = P093946_A194BarOrdLin[0] ;
         A1234BarNomCli = P093946_A1234BarNomCli[0] ;
         A218BarTipCol = P093946_A218BarTipCol[0] ;
         A136BarColNum = P093946_A136BarColNum[0] ;
         A135BarColNom = P093946_A135BarColNom[0] ;
         A212BarSer = P093946_A212BarSer[0] ;
         A213BarSit = P093946_A213BarSit[0] ;
         A13696BarNHdr = P093946_A13696BarNHdr[0] ;
         A279CliNom = P093946_A279CliNom[0] ;
         A252CliCod = P093946_A252CliCod[0] ;
         n252CliCod = P093946_n252CliCod[0] ;
         A153BarFasEst = P093946_A153BarFasEst[0] ;
         A603MaqCodBis = P093946_A603MaqCodBis[0] ;
         A1955BarFasSig = P093946_A1955BarFasSig[0] ;
         n1955BarFasSig = P093946_n1955BarFasSig[0] ;
         A154BarFasLin = P093946_A154BarFasLin[0] ;
         n154BarFasLin = P093946_n154BarFasLin[0] ;
         A151BarFasCod = P093946_A151BarFasCod[0] ;
         n151BarFasCod = P093946_n151BarFasCod[0] ;
         A184BarMtr = P093946_A184BarMtr[0] ;
         A166BarKgm = P093946_A166BarKgm[0] ;
         A129BarCod = P093946_A129BarCod[0] ;
         A132BarCodReo = P093946_A132BarCodReo[0] ;
         A130BarCodPar = P093946_A130BarCodPar[0] ;
         A758ProCod = P093946_A758ProCod[0] ;
         A1652BarSerDsc = P093946_A1652BarSerDsc[0] ;
         A159BarFecGen = P093946_A159BarFecGen[0] ;
         A4466BarAcaAnh = P093946_A4466BarAcaAnh[0] ;
         A1798BarDibCli = P093946_A1798BarDibCli[0] ;
         A1234BarNomCli = P093946_A1234BarNomCli[0] ;
         A218BarTipCol = P093946_A218BarTipCol[0] ;
         A136BarColNum = P093946_A136BarColNum[0] ;
         A135BarColNom = P093946_A135BarColNom[0] ;
         A212BarSer = P093946_A212BarSer[0] ;
         A213BarSit = P093946_A213BarSit[0] ;
         A13696BarNHdr = P093946_A13696BarNHdr[0] ;
         A252CliCod = P093946_A252CliCod[0] ;
         n252CliCod = P093946_n252CliCod[0] ;
         A279CliNom = P093946_A279CliNom[0] ;
         A1955BarFasSig = P093946_A1955BarFasSig[0] ;
         n1955BarFasSig = P093946_n1955BarFasSig[0] ;
         A154BarFasLin = P093946_A154BarFasLin[0] ;
         n154BarFasLin = P093946_n154BarFasLin[0] ;
         A151BarFasCod = P093946_A151BarFasCod[0] ;
         n151BarFasCod = P093946_n151BarFasCod[0] ;
         A184BarMtr = P093946_A184BarMtr[0] ;
         A166BarKgm = P093946_A166BarKgm[0] ;
         AV60count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P093946_A1652BarSerDsc[0], A1652BarSerDsc) == 0 ) )
         {
            brk9399 = false ;
            A396EmprCod = P093946_A396EmprCod[0] ;
            A194BarOrdLin = P093946_A194BarOrdLin[0] ;
            A129BarCod = P093946_A129BarCod[0] ;
            A132BarCodReo = P093946_A132BarCodReo[0] ;
            A130BarCodPar = P093946_A130BarCodPar[0] ;
            A758ProCod = P093946_A758ProCod[0] ;
            AV60count = (long)(AV60count+1) ;
            brk9399 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A1652BarSerDsc)==0) )
         {
            AV52Option = A1652BarSerDsc ;
            AV53Options.add(AV52Option, 0);
            AV58OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV60count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV53Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9399 )
         {
            brk9399 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADBARCOLNOMOPTIONS' Routine */
      returnInSub = false ;
      AV26TFBarColNom = AV48SearchTxt ;
      AV27TFBarColNom_Sel = "" ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           Byte.valueOf(A153BarFasEst) ,
                                           AV11TFBarFasEst_Sels ,
                                           AV81TFMaqCodBis_Sel ,
                                           AV80TFMaqCodBis ,
                                           Integer.valueOf(AV11TFBarFasEst_Sels.size()) ,
                                           Integer.valueOf(AV12TFCliCod) ,
                                           Integer.valueOf(AV13TFCliCod_To) ,
                                           AV15TFCliNom_Sel ,
                                           AV14TFCliNom ,
                                           AV19TFBarNHdr_Sel ,
                                           AV18TFBarNHdr ,
                                           Byte.valueOf(AV20TFBarSit) ,
                                           Byte.valueOf(AV21TFBarSit_To) ,
                                           AV23TFBarSer_Sel ,
                                           AV22TFBarSer ,
                                           AV25TFBarSerDsc_Sel ,
                                           AV24TFBarSerDsc ,
                                           AV27TFBarColNom_Sel ,
                                           AV26TFBarColNom ,
                                           Integer.valueOf(AV28TFBarColNum) ,
                                           Integer.valueOf(AV29TFBarColNum_To) ,
                                           Byte.valueOf(AV30TFBarTipCol) ,
                                           Byte.valueOf(AV31TFBarTipCol_To) ,
                                           AV33TFBarNomCli_Sel ,
                                           AV32TFBarNomCli ,
                                           AV34TFBarKgm ,
                                           AV35TFBarKgm_To ,
                                           AV36TFBarMtr ,
                                           AV37TFBarMtr_To ,
                                           Short.valueOf(AV44TFBarOrdLin) ,
                                           Short.valueOf(AV45TFBarOrdLin_To) ,
                                           AV87TFBarDibCli_Sel ,
                                           AV86TFBarDibCli ,
                                           Short.valueOf(AV46TFBarAcaAnh) ,
                                           Short.valueOf(AV47TFBarAcaAnh_To) ,
                                           A603MaqCodBis ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Byte.valueOf(A213BarSit) ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           Byte.valueOf(A218BarTipCol) ,
                                           A1234BarNomCli ,
                                           A166BarKgm ,
                                           A184BarMtr ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A1798BarDibCli ,
                                           Short.valueOf(A4466BarAcaAnh) ,
                                           AV66FilterFullText ,
                                           A13696BarNHdr ,
                                           A151BarFasCod ,
                                           Short.valueOf(A154BarFasLin) ,
                                           A1955BarFasSig ,
                                           AV39TFBarFasCod_Sel ,
                                           AV38TFBarFasCod ,
                                           Short.valueOf(AV40TFBarFasLin) ,
                                           Short.valueOf(AV41TFBarFasLin_To) ,
                                           AV43TFBarFasSig_Sel ,
                                           AV42TFBarFasSig ,
                                           Integer.valueOf(AV68Clicod) ,
                                           Integer.valueOf(AV69Clicod_to) ,
                                           A159BarFecGen ,
                                           AV70BarFecgen ,
                                           AV71BarFecGen_to ,
                                           Byte.valueOf(AV72BarSIt) ,
                                           Byte.valueOf(AV73Barsit_to) ,
                                           Byte.valueOf(AV74BarfasEst) ,
                                           Byte.valueOf(AV75BarFasEst_to) ,
                                           Short.valueOf(AV76BarAcaAnh) ,
                                           A396EmprCod ,
                                           AV67Emprcod ,
                                           A457FasCod ,
                                           AV77Fascod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV38TFBarFasCod = GXutil.padr( GXutil.rtrim( AV38TFBarFasCod), 8, "%") ;
      lV42TFBarFasSig = GXutil.padr( GXutil.rtrim( AV42TFBarFasSig), 8, "%") ;
      lV80TFMaqCodBis = GXutil.padr( GXutil.rtrim( AV80TFMaqCodBis), 6, "%") ;
      lV14TFCliNom = GXutil.padr( GXutil.rtrim( AV14TFCliNom), 30, "%") ;
      lV18TFBarNHdr = GXutil.padr( GXutil.rtrim( AV18TFBarNHdr), 11, "%") ;
      lV22TFBarSer = GXutil.padr( GXutil.rtrim( AV22TFBarSer), 16, "%") ;
      lV24TFBarSerDsc = GXutil.padr( GXutil.rtrim( AV24TFBarSerDsc), 26, "%") ;
      lV26TFBarColNom = GXutil.padr( GXutil.rtrim( AV26TFBarColNom), 13, "%") ;
      lV32TFBarNomCli = GXutil.padr( GXutil.rtrim( AV32TFBarNomCli), 13, "%") ;
      lV86TFBarDibCli = GXutil.padr( GXutil.rtrim( AV86TFBarDibCli), 16, "%") ;
      /* Using cursor P093955 */
      pr_default.execute(5, new Object[] {AV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, AV39TFBarFasCod_Sel, AV38TFBarFasCod, lV38TFBarFasCod, AV39TFBarFasCod_Sel, AV39TFBarFasCod_Sel, Short.valueOf(AV40TFBarFasLin), Short.valueOf(AV40TFBarFasLin), Short.valueOf(AV41TFBarFasLin_To), Short.valueOf(AV41TFBarFasLin_To), AV43TFBarFasSig_Sel, AV42TFBarFasSig, lV42TFBarFasSig, AV43TFBarFasSig_Sel, AV43TFBarFasSig_Sel, Integer.valueOf(AV68Clicod), Integer.valueOf(AV69Clicod_to), AV70BarFecgen, AV71BarFecGen_to, Byte.valueOf(AV72BarSIt), Byte.valueOf(AV73Barsit_to), Byte.valueOf(AV74BarfasEst), Byte.valueOf(AV75BarFasEst_to), Short.valueOf(AV76BarAcaAnh), Short.valueOf(AV76BarAcaAnh), AV67Emprcod, AV77Fascod, lV80TFMaqCodBis, AV81TFMaqCodBis_Sel, Integer.valueOf(AV12TFCliCod), Integer.valueOf(AV13TFCliCod_To), lV14TFCliNom, AV15TFCliNom_Sel, lV18TFBarNHdr, AV19TFBarNHdr_Sel, Byte.valueOf(AV20TFBarSit), Byte.valueOf(AV21TFBarSit_To), lV22TFBarSer, AV23TFBarSer_Sel, lV24TFBarSerDsc, AV25TFBarSerDsc_Sel, lV26TFBarColNom, AV27TFBarColNom_Sel, Integer.valueOf(AV28TFBarColNum), Integer.valueOf(AV29TFBarColNum_To), Byte.valueOf(AV30TFBarTipCol), Byte.valueOf(AV31TFBarTipCol_To), lV32TFBarNomCli, AV33TFBarNomCli_Sel, AV34TFBarKgm, AV35TFBarKgm_To, AV36TFBarMtr, AV37TFBarMtr_To, Short.valueOf(AV44TFBarOrdLin), Short.valueOf(AV45TFBarOrdLin_To), lV86TFBarDibCli, AV87TFBarDibCli_Sel, Short.valueOf(AV46TFBarAcaAnh), Short.valueOf(AV47TFBarAcaAnh_To)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk93911 = false ;
         A396EmprCod = P093955_A396EmprCod[0] ;
         A457FasCod = P093955_A457FasCod[0] ;
         A135BarColNom = P093955_A135BarColNom[0] ;
         A159BarFecGen = P093955_A159BarFecGen[0] ;
         A4466BarAcaAnh = P093955_A4466BarAcaAnh[0] ;
         A1798BarDibCli = P093955_A1798BarDibCli[0] ;
         A194BarOrdLin = P093955_A194BarOrdLin[0] ;
         A1234BarNomCli = P093955_A1234BarNomCli[0] ;
         A218BarTipCol = P093955_A218BarTipCol[0] ;
         A136BarColNum = P093955_A136BarColNum[0] ;
         A1652BarSerDsc = P093955_A1652BarSerDsc[0] ;
         A212BarSer = P093955_A212BarSer[0] ;
         A213BarSit = P093955_A213BarSit[0] ;
         A13696BarNHdr = P093955_A13696BarNHdr[0] ;
         A279CliNom = P093955_A279CliNom[0] ;
         A252CliCod = P093955_A252CliCod[0] ;
         n252CliCod = P093955_n252CliCod[0] ;
         A153BarFasEst = P093955_A153BarFasEst[0] ;
         A603MaqCodBis = P093955_A603MaqCodBis[0] ;
         A1955BarFasSig = P093955_A1955BarFasSig[0] ;
         n1955BarFasSig = P093955_n1955BarFasSig[0] ;
         A154BarFasLin = P093955_A154BarFasLin[0] ;
         n154BarFasLin = P093955_n154BarFasLin[0] ;
         A151BarFasCod = P093955_A151BarFasCod[0] ;
         n151BarFasCod = P093955_n151BarFasCod[0] ;
         A184BarMtr = P093955_A184BarMtr[0] ;
         A166BarKgm = P093955_A166BarKgm[0] ;
         A129BarCod = P093955_A129BarCod[0] ;
         A132BarCodReo = P093955_A132BarCodReo[0] ;
         A130BarCodPar = P093955_A130BarCodPar[0] ;
         A758ProCod = P093955_A758ProCod[0] ;
         A135BarColNom = P093955_A135BarColNom[0] ;
         A159BarFecGen = P093955_A159BarFecGen[0] ;
         A4466BarAcaAnh = P093955_A4466BarAcaAnh[0] ;
         A1798BarDibCli = P093955_A1798BarDibCli[0] ;
         A1234BarNomCli = P093955_A1234BarNomCli[0] ;
         A218BarTipCol = P093955_A218BarTipCol[0] ;
         A136BarColNum = P093955_A136BarColNum[0] ;
         A1652BarSerDsc = P093955_A1652BarSerDsc[0] ;
         A212BarSer = P093955_A212BarSer[0] ;
         A213BarSit = P093955_A213BarSit[0] ;
         A13696BarNHdr = P093955_A13696BarNHdr[0] ;
         A252CliCod = P093955_A252CliCod[0] ;
         n252CliCod = P093955_n252CliCod[0] ;
         A279CliNom = P093955_A279CliNom[0] ;
         A1955BarFasSig = P093955_A1955BarFasSig[0] ;
         n1955BarFasSig = P093955_n1955BarFasSig[0] ;
         A154BarFasLin = P093955_A154BarFasLin[0] ;
         n154BarFasLin = P093955_n154BarFasLin[0] ;
         A151BarFasCod = P093955_A151BarFasCod[0] ;
         n151BarFasCod = P093955_n151BarFasCod[0] ;
         A184BarMtr = P093955_A184BarMtr[0] ;
         A166BarKgm = P093955_A166BarKgm[0] ;
         AV60count = 0 ;
         while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P093955_A135BarColNom[0], A135BarColNom) == 0 ) )
         {
            brk93911 = false ;
            A396EmprCod = P093955_A396EmprCod[0] ;
            A194BarOrdLin = P093955_A194BarOrdLin[0] ;
            A129BarCod = P093955_A129BarCod[0] ;
            A132BarCodReo = P093955_A132BarCodReo[0] ;
            A130BarCodPar = P093955_A130BarCodPar[0] ;
            A758ProCod = P093955_A758ProCod[0] ;
            AV60count = (long)(AV60count+1) ;
            brk93911 = true ;
            pr_default.readNext(5);
         }
         if ( ! (GXutil.strcmp("", A135BarColNom)==0) )
         {
            AV52Option = A135BarColNom ;
            AV53Options.add(AV52Option, 0);
            AV58OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV60count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV53Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk93911 )
         {
            brk93911 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   public void S181( )
   {
      /* 'LOADBARNOMCLIOPTIONS' Routine */
      returnInSub = false ;
      AV32TFBarNomCli = AV48SearchTxt ;
      AV33TFBarNomCli_Sel = "" ;
      pr_default.dynParam(6, new Object[]{ new Object[]{
                                           Byte.valueOf(A153BarFasEst) ,
                                           AV11TFBarFasEst_Sels ,
                                           AV81TFMaqCodBis_Sel ,
                                           AV80TFMaqCodBis ,
                                           Integer.valueOf(AV11TFBarFasEst_Sels.size()) ,
                                           Integer.valueOf(AV12TFCliCod) ,
                                           Integer.valueOf(AV13TFCliCod_To) ,
                                           AV15TFCliNom_Sel ,
                                           AV14TFCliNom ,
                                           AV19TFBarNHdr_Sel ,
                                           AV18TFBarNHdr ,
                                           Byte.valueOf(AV20TFBarSit) ,
                                           Byte.valueOf(AV21TFBarSit_To) ,
                                           AV23TFBarSer_Sel ,
                                           AV22TFBarSer ,
                                           AV25TFBarSerDsc_Sel ,
                                           AV24TFBarSerDsc ,
                                           AV27TFBarColNom_Sel ,
                                           AV26TFBarColNom ,
                                           Integer.valueOf(AV28TFBarColNum) ,
                                           Integer.valueOf(AV29TFBarColNum_To) ,
                                           Byte.valueOf(AV30TFBarTipCol) ,
                                           Byte.valueOf(AV31TFBarTipCol_To) ,
                                           AV33TFBarNomCli_Sel ,
                                           AV32TFBarNomCli ,
                                           AV34TFBarKgm ,
                                           AV35TFBarKgm_To ,
                                           AV36TFBarMtr ,
                                           AV37TFBarMtr_To ,
                                           Short.valueOf(AV44TFBarOrdLin) ,
                                           Short.valueOf(AV45TFBarOrdLin_To) ,
                                           AV87TFBarDibCli_Sel ,
                                           AV86TFBarDibCli ,
                                           Short.valueOf(AV46TFBarAcaAnh) ,
                                           Short.valueOf(AV47TFBarAcaAnh_To) ,
                                           A603MaqCodBis ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Byte.valueOf(A213BarSit) ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           Byte.valueOf(A218BarTipCol) ,
                                           A1234BarNomCli ,
                                           A166BarKgm ,
                                           A184BarMtr ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A1798BarDibCli ,
                                           Short.valueOf(A4466BarAcaAnh) ,
                                           AV66FilterFullText ,
                                           A13696BarNHdr ,
                                           A151BarFasCod ,
                                           Short.valueOf(A154BarFasLin) ,
                                           A1955BarFasSig ,
                                           AV39TFBarFasCod_Sel ,
                                           AV38TFBarFasCod ,
                                           Short.valueOf(AV40TFBarFasLin) ,
                                           Short.valueOf(AV41TFBarFasLin_To) ,
                                           AV43TFBarFasSig_Sel ,
                                           AV42TFBarFasSig ,
                                           Integer.valueOf(AV68Clicod) ,
                                           Integer.valueOf(AV69Clicod_to) ,
                                           A159BarFecGen ,
                                           AV70BarFecgen ,
                                           AV71BarFecGen_to ,
                                           Byte.valueOf(AV72BarSIt) ,
                                           Byte.valueOf(AV73Barsit_to) ,
                                           Byte.valueOf(AV74BarfasEst) ,
                                           Byte.valueOf(AV75BarFasEst_to) ,
                                           Short.valueOf(AV76BarAcaAnh) ,
                                           A396EmprCod ,
                                           AV67Emprcod ,
                                           A457FasCod ,
                                           AV77Fascod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV38TFBarFasCod = GXutil.padr( GXutil.rtrim( AV38TFBarFasCod), 8, "%") ;
      lV42TFBarFasSig = GXutil.padr( GXutil.rtrim( AV42TFBarFasSig), 8, "%") ;
      lV80TFMaqCodBis = GXutil.padr( GXutil.rtrim( AV80TFMaqCodBis), 6, "%") ;
      lV14TFCliNom = GXutil.padr( GXutil.rtrim( AV14TFCliNom), 30, "%") ;
      lV18TFBarNHdr = GXutil.padr( GXutil.rtrim( AV18TFBarNHdr), 11, "%") ;
      lV22TFBarSer = GXutil.padr( GXutil.rtrim( AV22TFBarSer), 16, "%") ;
      lV24TFBarSerDsc = GXutil.padr( GXutil.rtrim( AV24TFBarSerDsc), 26, "%") ;
      lV26TFBarColNom = GXutil.padr( GXutil.rtrim( AV26TFBarColNom), 13, "%") ;
      lV32TFBarNomCli = GXutil.padr( GXutil.rtrim( AV32TFBarNomCli), 13, "%") ;
      lV86TFBarDibCli = GXutil.padr( GXutil.rtrim( AV86TFBarDibCli), 16, "%") ;
      /* Using cursor P093964 */
      pr_default.execute(6, new Object[] {AV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, AV39TFBarFasCod_Sel, AV38TFBarFasCod, lV38TFBarFasCod, AV39TFBarFasCod_Sel, AV39TFBarFasCod_Sel, Short.valueOf(AV40TFBarFasLin), Short.valueOf(AV40TFBarFasLin), Short.valueOf(AV41TFBarFasLin_To), Short.valueOf(AV41TFBarFasLin_To), AV43TFBarFasSig_Sel, AV42TFBarFasSig, lV42TFBarFasSig, AV43TFBarFasSig_Sel, AV43TFBarFasSig_Sel, Integer.valueOf(AV68Clicod), Integer.valueOf(AV69Clicod_to), AV70BarFecgen, AV71BarFecGen_to, Byte.valueOf(AV72BarSIt), Byte.valueOf(AV73Barsit_to), Byte.valueOf(AV74BarfasEst), Byte.valueOf(AV75BarFasEst_to), Short.valueOf(AV76BarAcaAnh), Short.valueOf(AV76BarAcaAnh), AV67Emprcod, AV77Fascod, lV80TFMaqCodBis, AV81TFMaqCodBis_Sel, Integer.valueOf(AV12TFCliCod), Integer.valueOf(AV13TFCliCod_To), lV14TFCliNom, AV15TFCliNom_Sel, lV18TFBarNHdr, AV19TFBarNHdr_Sel, Byte.valueOf(AV20TFBarSit), Byte.valueOf(AV21TFBarSit_To), lV22TFBarSer, AV23TFBarSer_Sel, lV24TFBarSerDsc, AV25TFBarSerDsc_Sel, lV26TFBarColNom, AV27TFBarColNom_Sel, Integer.valueOf(AV28TFBarColNum), Integer.valueOf(AV29TFBarColNum_To), Byte.valueOf(AV30TFBarTipCol), Byte.valueOf(AV31TFBarTipCol_To), lV32TFBarNomCli, AV33TFBarNomCli_Sel, AV34TFBarKgm, AV35TFBarKgm_To, AV36TFBarMtr, AV37TFBarMtr_To, Short.valueOf(AV44TFBarOrdLin), Short.valueOf(AV45TFBarOrdLin_To), lV86TFBarDibCli, AV87TFBarDibCli_Sel, Short.valueOf(AV46TFBarAcaAnh), Short.valueOf(AV47TFBarAcaAnh_To)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         brk93913 = false ;
         A396EmprCod = P093964_A396EmprCod[0] ;
         A457FasCod = P093964_A457FasCod[0] ;
         A1234BarNomCli = P093964_A1234BarNomCli[0] ;
         A159BarFecGen = P093964_A159BarFecGen[0] ;
         A4466BarAcaAnh = P093964_A4466BarAcaAnh[0] ;
         A1798BarDibCli = P093964_A1798BarDibCli[0] ;
         A194BarOrdLin = P093964_A194BarOrdLin[0] ;
         A218BarTipCol = P093964_A218BarTipCol[0] ;
         A136BarColNum = P093964_A136BarColNum[0] ;
         A135BarColNom = P093964_A135BarColNom[0] ;
         A1652BarSerDsc = P093964_A1652BarSerDsc[0] ;
         A212BarSer = P093964_A212BarSer[0] ;
         A213BarSit = P093964_A213BarSit[0] ;
         A13696BarNHdr = P093964_A13696BarNHdr[0] ;
         A279CliNom = P093964_A279CliNom[0] ;
         A252CliCod = P093964_A252CliCod[0] ;
         n252CliCod = P093964_n252CliCod[0] ;
         A153BarFasEst = P093964_A153BarFasEst[0] ;
         A603MaqCodBis = P093964_A603MaqCodBis[0] ;
         A1955BarFasSig = P093964_A1955BarFasSig[0] ;
         n1955BarFasSig = P093964_n1955BarFasSig[0] ;
         A154BarFasLin = P093964_A154BarFasLin[0] ;
         n154BarFasLin = P093964_n154BarFasLin[0] ;
         A151BarFasCod = P093964_A151BarFasCod[0] ;
         n151BarFasCod = P093964_n151BarFasCod[0] ;
         A184BarMtr = P093964_A184BarMtr[0] ;
         A166BarKgm = P093964_A166BarKgm[0] ;
         A129BarCod = P093964_A129BarCod[0] ;
         A132BarCodReo = P093964_A132BarCodReo[0] ;
         A130BarCodPar = P093964_A130BarCodPar[0] ;
         A758ProCod = P093964_A758ProCod[0] ;
         A1234BarNomCli = P093964_A1234BarNomCli[0] ;
         A159BarFecGen = P093964_A159BarFecGen[0] ;
         A4466BarAcaAnh = P093964_A4466BarAcaAnh[0] ;
         A1798BarDibCli = P093964_A1798BarDibCli[0] ;
         A218BarTipCol = P093964_A218BarTipCol[0] ;
         A136BarColNum = P093964_A136BarColNum[0] ;
         A135BarColNom = P093964_A135BarColNom[0] ;
         A1652BarSerDsc = P093964_A1652BarSerDsc[0] ;
         A212BarSer = P093964_A212BarSer[0] ;
         A213BarSit = P093964_A213BarSit[0] ;
         A13696BarNHdr = P093964_A13696BarNHdr[0] ;
         A252CliCod = P093964_A252CliCod[0] ;
         n252CliCod = P093964_n252CliCod[0] ;
         A279CliNom = P093964_A279CliNom[0] ;
         A1955BarFasSig = P093964_A1955BarFasSig[0] ;
         n1955BarFasSig = P093964_n1955BarFasSig[0] ;
         A154BarFasLin = P093964_A154BarFasLin[0] ;
         n154BarFasLin = P093964_n154BarFasLin[0] ;
         A151BarFasCod = P093964_A151BarFasCod[0] ;
         n151BarFasCod = P093964_n151BarFasCod[0] ;
         A184BarMtr = P093964_A184BarMtr[0] ;
         A166BarKgm = P093964_A166BarKgm[0] ;
         AV60count = 0 ;
         while ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(P093964_A1234BarNomCli[0], A1234BarNomCli) == 0 ) )
         {
            brk93913 = false ;
            A396EmprCod = P093964_A396EmprCod[0] ;
            A194BarOrdLin = P093964_A194BarOrdLin[0] ;
            A129BarCod = P093964_A129BarCod[0] ;
            A132BarCodReo = P093964_A132BarCodReo[0] ;
            A130BarCodPar = P093964_A130BarCodPar[0] ;
            A758ProCod = P093964_A758ProCod[0] ;
            AV60count = (long)(AV60count+1) ;
            brk93913 = true ;
            pr_default.readNext(6);
         }
         if ( ! (GXutil.strcmp("", A1234BarNomCli)==0) )
         {
            AV52Option = A1234BarNomCli ;
            AV53Options.add(AV52Option, 0);
            AV58OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV60count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV53Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk93913 )
         {
            brk93913 = true ;
            pr_default.readNext(6);
         }
      }
      pr_default.close(6);
   }

   public void S191( )
   {
      /* 'LOADBARFASCODOPTIONS' Routine */
      returnInSub = false ;
      AV38TFBarFasCod = AV48SearchTxt ;
      AV39TFBarFasCod_Sel = "" ;
      pr_default.dynParam(7, new Object[]{ new Object[]{
                                           Byte.valueOf(A153BarFasEst) ,
                                           AV11TFBarFasEst_Sels ,
                                           AV81TFMaqCodBis_Sel ,
                                           AV80TFMaqCodBis ,
                                           Integer.valueOf(AV11TFBarFasEst_Sels.size()) ,
                                           Integer.valueOf(AV12TFCliCod) ,
                                           Integer.valueOf(AV13TFCliCod_To) ,
                                           AV15TFCliNom_Sel ,
                                           AV14TFCliNom ,
                                           AV19TFBarNHdr_Sel ,
                                           AV18TFBarNHdr ,
                                           Byte.valueOf(AV20TFBarSit) ,
                                           Byte.valueOf(AV21TFBarSit_To) ,
                                           AV23TFBarSer_Sel ,
                                           AV22TFBarSer ,
                                           AV25TFBarSerDsc_Sel ,
                                           AV24TFBarSerDsc ,
                                           AV27TFBarColNom_Sel ,
                                           AV26TFBarColNom ,
                                           Integer.valueOf(AV28TFBarColNum) ,
                                           Integer.valueOf(AV29TFBarColNum_To) ,
                                           Byte.valueOf(AV30TFBarTipCol) ,
                                           Byte.valueOf(AV31TFBarTipCol_To) ,
                                           AV33TFBarNomCli_Sel ,
                                           AV32TFBarNomCli ,
                                           AV34TFBarKgm ,
                                           AV35TFBarKgm_To ,
                                           AV36TFBarMtr ,
                                           AV37TFBarMtr_To ,
                                           Short.valueOf(AV44TFBarOrdLin) ,
                                           Short.valueOf(AV45TFBarOrdLin_To) ,
                                           AV87TFBarDibCli_Sel ,
                                           AV86TFBarDibCli ,
                                           Short.valueOf(AV46TFBarAcaAnh) ,
                                           Short.valueOf(AV47TFBarAcaAnh_To) ,
                                           A603MaqCodBis ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Byte.valueOf(A213BarSit) ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           Byte.valueOf(A218BarTipCol) ,
                                           A1234BarNomCli ,
                                           A166BarKgm ,
                                           A184BarMtr ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A1798BarDibCli ,
                                           Short.valueOf(A4466BarAcaAnh) ,
                                           AV66FilterFullText ,
                                           A13696BarNHdr ,
                                           A151BarFasCod ,
                                           Short.valueOf(A154BarFasLin) ,
                                           A1955BarFasSig ,
                                           AV39TFBarFasCod_Sel ,
                                           AV38TFBarFasCod ,
                                           Short.valueOf(AV40TFBarFasLin) ,
                                           Short.valueOf(AV41TFBarFasLin_To) ,
                                           AV43TFBarFasSig_Sel ,
                                           AV42TFBarFasSig ,
                                           Integer.valueOf(AV68Clicod) ,
                                           Integer.valueOf(AV69Clicod_to) ,
                                           A159BarFecGen ,
                                           AV70BarFecgen ,
                                           AV71BarFecGen_to ,
                                           Byte.valueOf(AV72BarSIt) ,
                                           Byte.valueOf(AV73Barsit_to) ,
                                           Byte.valueOf(AV74BarfasEst) ,
                                           Byte.valueOf(AV75BarFasEst_to) ,
                                           Short.valueOf(AV76BarAcaAnh) ,
                                           AV67Emprcod ,
                                           AV77Fascod ,
                                           A396EmprCod ,
                                           A457FasCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV38TFBarFasCod = GXutil.padr( GXutil.rtrim( AV38TFBarFasCod), 8, "%") ;
      lV42TFBarFasSig = GXutil.padr( GXutil.rtrim( AV42TFBarFasSig), 8, "%") ;
      lV80TFMaqCodBis = GXutil.padr( GXutil.rtrim( AV80TFMaqCodBis), 6, "%") ;
      lV14TFCliNom = GXutil.padr( GXutil.rtrim( AV14TFCliNom), 30, "%") ;
      lV18TFBarNHdr = GXutil.padr( GXutil.rtrim( AV18TFBarNHdr), 11, "%") ;
      lV22TFBarSer = GXutil.padr( GXutil.rtrim( AV22TFBarSer), 16, "%") ;
      lV24TFBarSerDsc = GXutil.padr( GXutil.rtrim( AV24TFBarSerDsc), 26, "%") ;
      lV26TFBarColNom = GXutil.padr( GXutil.rtrim( AV26TFBarColNom), 13, "%") ;
      lV32TFBarNomCli = GXutil.padr( GXutil.rtrim( AV32TFBarNomCli), 13, "%") ;
      lV86TFBarDibCli = GXutil.padr( GXutil.rtrim( AV86TFBarDibCli), 16, "%") ;
      /* Using cursor P093973 */
      pr_default.execute(7, new Object[] {AV67Emprcod, AV77Fascod, AV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, AV39TFBarFasCod_Sel, AV38TFBarFasCod, lV38TFBarFasCod, AV39TFBarFasCod_Sel, AV39TFBarFasCod_Sel, Short.valueOf(AV40TFBarFasLin), Short.valueOf(AV40TFBarFasLin), Short.valueOf(AV41TFBarFasLin_To), Short.valueOf(AV41TFBarFasLin_To), AV43TFBarFasSig_Sel, AV42TFBarFasSig, lV42TFBarFasSig, AV43TFBarFasSig_Sel, AV43TFBarFasSig_Sel, Integer.valueOf(AV68Clicod), Integer.valueOf(AV69Clicod_to), AV70BarFecgen, AV71BarFecGen_to, Byte.valueOf(AV72BarSIt), Byte.valueOf(AV73Barsit_to), Byte.valueOf(AV74BarfasEst), Byte.valueOf(AV75BarFasEst_to), Short.valueOf(AV76BarAcaAnh), Short.valueOf(AV76BarAcaAnh), lV80TFMaqCodBis, AV81TFMaqCodBis_Sel, Integer.valueOf(AV12TFCliCod), Integer.valueOf(AV13TFCliCod_To), lV14TFCliNom, AV15TFCliNom_Sel, lV18TFBarNHdr, AV19TFBarNHdr_Sel, Byte.valueOf(AV20TFBarSit), Byte.valueOf(AV21TFBarSit_To), lV22TFBarSer, AV23TFBarSer_Sel, lV24TFBarSerDsc, AV25TFBarSerDsc_Sel, lV26TFBarColNom, AV27TFBarColNom_Sel, Integer.valueOf(AV28TFBarColNum), Integer.valueOf(AV29TFBarColNum_To), Byte.valueOf(AV30TFBarTipCol), Byte.valueOf(AV31TFBarTipCol_To), lV32TFBarNomCli, AV33TFBarNomCli_Sel, AV34TFBarKgm, AV35TFBarKgm_To, AV36TFBarMtr, AV37TFBarMtr_To, Short.valueOf(AV44TFBarOrdLin), Short.valueOf(AV45TFBarOrdLin_To), lV86TFBarDibCli, AV87TFBarDibCli_Sel, Short.valueOf(AV46TFBarAcaAnh), Short.valueOf(AV47TFBarAcaAnh_To)});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A159BarFecGen = P093973_A159BarFecGen[0] ;
         A457FasCod = P093973_A457FasCod[0] ;
         A396EmprCod = P093973_A396EmprCod[0] ;
         A4466BarAcaAnh = P093973_A4466BarAcaAnh[0] ;
         A1798BarDibCli = P093973_A1798BarDibCli[0] ;
         A194BarOrdLin = P093973_A194BarOrdLin[0] ;
         A1234BarNomCli = P093973_A1234BarNomCli[0] ;
         A218BarTipCol = P093973_A218BarTipCol[0] ;
         A136BarColNum = P093973_A136BarColNum[0] ;
         A135BarColNom = P093973_A135BarColNom[0] ;
         A1652BarSerDsc = P093973_A1652BarSerDsc[0] ;
         A212BarSer = P093973_A212BarSer[0] ;
         A213BarSit = P093973_A213BarSit[0] ;
         A13696BarNHdr = P093973_A13696BarNHdr[0] ;
         A279CliNom = P093973_A279CliNom[0] ;
         A252CliCod = P093973_A252CliCod[0] ;
         n252CliCod = P093973_n252CliCod[0] ;
         A153BarFasEst = P093973_A153BarFasEst[0] ;
         A603MaqCodBis = P093973_A603MaqCodBis[0] ;
         A1955BarFasSig = P093973_A1955BarFasSig[0] ;
         n1955BarFasSig = P093973_n1955BarFasSig[0] ;
         A154BarFasLin = P093973_A154BarFasLin[0] ;
         n154BarFasLin = P093973_n154BarFasLin[0] ;
         A151BarFasCod = P093973_A151BarFasCod[0] ;
         n151BarFasCod = P093973_n151BarFasCod[0] ;
         A184BarMtr = P093973_A184BarMtr[0] ;
         A166BarKgm = P093973_A166BarKgm[0] ;
         A129BarCod = P093973_A129BarCod[0] ;
         A132BarCodReo = P093973_A132BarCodReo[0] ;
         A130BarCodPar = P093973_A130BarCodPar[0] ;
         A758ProCod = P093973_A758ProCod[0] ;
         A159BarFecGen = P093973_A159BarFecGen[0] ;
         A4466BarAcaAnh = P093973_A4466BarAcaAnh[0] ;
         A1798BarDibCli = P093973_A1798BarDibCli[0] ;
         A1234BarNomCli = P093973_A1234BarNomCli[0] ;
         A218BarTipCol = P093973_A218BarTipCol[0] ;
         A136BarColNum = P093973_A136BarColNum[0] ;
         A135BarColNom = P093973_A135BarColNom[0] ;
         A1652BarSerDsc = P093973_A1652BarSerDsc[0] ;
         A212BarSer = P093973_A212BarSer[0] ;
         A213BarSit = P093973_A213BarSit[0] ;
         A13696BarNHdr = P093973_A13696BarNHdr[0] ;
         A252CliCod = P093973_A252CliCod[0] ;
         n252CliCod = P093973_n252CliCod[0] ;
         A279CliNom = P093973_A279CliNom[0] ;
         A1955BarFasSig = P093973_A1955BarFasSig[0] ;
         n1955BarFasSig = P093973_n1955BarFasSig[0] ;
         A154BarFasLin = P093973_A154BarFasLin[0] ;
         n154BarFasLin = P093973_n154BarFasLin[0] ;
         A151BarFasCod = P093973_A151BarFasCod[0] ;
         n151BarFasCod = P093973_n151BarFasCod[0] ;
         A184BarMtr = P093973_A184BarMtr[0] ;
         A166BarKgm = P093973_A166BarKgm[0] ;
         if ( ! (GXutil.strcmp("", A151BarFasCod)==0) )
         {
            AV52Option = A151BarFasCod ;
            AV51InsertIndex = 1 ;
            while ( ( AV51InsertIndex <= AV53Options.size() ) && ( GXutil.strcmp((String)AV53Options.elementAt(-1+AV51InsertIndex), AV52Option) < 0 ) )
            {
               AV51InsertIndex = (int)(AV51InsertIndex+1) ;
            }
            if ( ( AV51InsertIndex <= AV53Options.size() ) && ( GXutil.strcmp((String)AV53Options.elementAt(-1+AV51InsertIndex), AV52Option) == 0 ) )
            {
               AV60count = GXutil.lval( (String)AV58OptionIndexes.elementAt(-1+AV51InsertIndex)) ;
               AV60count = (long)(AV60count+1) ;
               AV58OptionIndexes.removeItem(AV51InsertIndex);
               AV58OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV60count), "Z,ZZZ,ZZZ,ZZ9")), AV51InsertIndex);
            }
            else
            {
               AV53Options.add(AV52Option, AV51InsertIndex);
               AV58OptionIndexes.add("1", AV51InsertIndex);
            }
         }
         if ( AV53Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(7);
      }
      pr_default.close(7);
   }

   public void S201( )
   {
      /* 'LOADBARFASSIGOPTIONS' Routine */
      returnInSub = false ;
      AV42TFBarFasSig = AV48SearchTxt ;
      AV43TFBarFasSig_Sel = "" ;
      pr_default.dynParam(8, new Object[]{ new Object[]{
                                           Byte.valueOf(A153BarFasEst) ,
                                           AV11TFBarFasEst_Sels ,
                                           AV81TFMaqCodBis_Sel ,
                                           AV80TFMaqCodBis ,
                                           Integer.valueOf(AV11TFBarFasEst_Sels.size()) ,
                                           Integer.valueOf(AV12TFCliCod) ,
                                           Integer.valueOf(AV13TFCliCod_To) ,
                                           AV15TFCliNom_Sel ,
                                           AV14TFCliNom ,
                                           AV19TFBarNHdr_Sel ,
                                           AV18TFBarNHdr ,
                                           Byte.valueOf(AV20TFBarSit) ,
                                           Byte.valueOf(AV21TFBarSit_To) ,
                                           AV23TFBarSer_Sel ,
                                           AV22TFBarSer ,
                                           AV25TFBarSerDsc_Sel ,
                                           AV24TFBarSerDsc ,
                                           AV27TFBarColNom_Sel ,
                                           AV26TFBarColNom ,
                                           Integer.valueOf(AV28TFBarColNum) ,
                                           Integer.valueOf(AV29TFBarColNum_To) ,
                                           Byte.valueOf(AV30TFBarTipCol) ,
                                           Byte.valueOf(AV31TFBarTipCol_To) ,
                                           AV33TFBarNomCli_Sel ,
                                           AV32TFBarNomCli ,
                                           AV34TFBarKgm ,
                                           AV35TFBarKgm_To ,
                                           AV36TFBarMtr ,
                                           AV37TFBarMtr_To ,
                                           Short.valueOf(AV44TFBarOrdLin) ,
                                           Short.valueOf(AV45TFBarOrdLin_To) ,
                                           AV87TFBarDibCli_Sel ,
                                           AV86TFBarDibCli ,
                                           Short.valueOf(AV46TFBarAcaAnh) ,
                                           Short.valueOf(AV47TFBarAcaAnh_To) ,
                                           A603MaqCodBis ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Byte.valueOf(A213BarSit) ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           Byte.valueOf(A218BarTipCol) ,
                                           A1234BarNomCli ,
                                           A166BarKgm ,
                                           A184BarMtr ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A1798BarDibCli ,
                                           Short.valueOf(A4466BarAcaAnh) ,
                                           AV66FilterFullText ,
                                           A13696BarNHdr ,
                                           A151BarFasCod ,
                                           Short.valueOf(A154BarFasLin) ,
                                           A1955BarFasSig ,
                                           AV39TFBarFasCod_Sel ,
                                           AV38TFBarFasCod ,
                                           Short.valueOf(AV40TFBarFasLin) ,
                                           Short.valueOf(AV41TFBarFasLin_To) ,
                                           AV43TFBarFasSig_Sel ,
                                           AV42TFBarFasSig ,
                                           Integer.valueOf(AV68Clicod) ,
                                           Integer.valueOf(AV69Clicod_to) ,
                                           A159BarFecGen ,
                                           AV70BarFecgen ,
                                           AV71BarFecGen_to ,
                                           Byte.valueOf(AV72BarSIt) ,
                                           Byte.valueOf(AV73Barsit_to) ,
                                           Byte.valueOf(AV74BarfasEst) ,
                                           Byte.valueOf(AV75BarFasEst_to) ,
                                           Short.valueOf(AV76BarAcaAnh) ,
                                           AV67Emprcod ,
                                           AV77Fascod ,
                                           A396EmprCod ,
                                           A457FasCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV38TFBarFasCod = GXutil.padr( GXutil.rtrim( AV38TFBarFasCod), 8, "%") ;
      lV42TFBarFasSig = GXutil.padr( GXutil.rtrim( AV42TFBarFasSig), 8, "%") ;
      lV80TFMaqCodBis = GXutil.padr( GXutil.rtrim( AV80TFMaqCodBis), 6, "%") ;
      lV14TFCliNom = GXutil.padr( GXutil.rtrim( AV14TFCliNom), 30, "%") ;
      lV18TFBarNHdr = GXutil.padr( GXutil.rtrim( AV18TFBarNHdr), 11, "%") ;
      lV22TFBarSer = GXutil.padr( GXutil.rtrim( AV22TFBarSer), 16, "%") ;
      lV24TFBarSerDsc = GXutil.padr( GXutil.rtrim( AV24TFBarSerDsc), 26, "%") ;
      lV26TFBarColNom = GXutil.padr( GXutil.rtrim( AV26TFBarColNom), 13, "%") ;
      lV32TFBarNomCli = GXutil.padr( GXutil.rtrim( AV32TFBarNomCli), 13, "%") ;
      lV86TFBarDibCli = GXutil.padr( GXutil.rtrim( AV86TFBarDibCli), 16, "%") ;
      /* Using cursor P093982 */
      pr_default.execute(8, new Object[] {AV67Emprcod, AV77Fascod, AV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, AV39TFBarFasCod_Sel, AV38TFBarFasCod, lV38TFBarFasCod, AV39TFBarFasCod_Sel, AV39TFBarFasCod_Sel, Short.valueOf(AV40TFBarFasLin), Short.valueOf(AV40TFBarFasLin), Short.valueOf(AV41TFBarFasLin_To), Short.valueOf(AV41TFBarFasLin_To), AV43TFBarFasSig_Sel, AV42TFBarFasSig, lV42TFBarFasSig, AV43TFBarFasSig_Sel, AV43TFBarFasSig_Sel, Integer.valueOf(AV68Clicod), Integer.valueOf(AV69Clicod_to), AV70BarFecgen, AV71BarFecGen_to, Byte.valueOf(AV72BarSIt), Byte.valueOf(AV73Barsit_to), Byte.valueOf(AV74BarfasEst), Byte.valueOf(AV75BarFasEst_to), Short.valueOf(AV76BarAcaAnh), Short.valueOf(AV76BarAcaAnh), lV80TFMaqCodBis, AV81TFMaqCodBis_Sel, Integer.valueOf(AV12TFCliCod), Integer.valueOf(AV13TFCliCod_To), lV14TFCliNom, AV15TFCliNom_Sel, lV18TFBarNHdr, AV19TFBarNHdr_Sel, Byte.valueOf(AV20TFBarSit), Byte.valueOf(AV21TFBarSit_To), lV22TFBarSer, AV23TFBarSer_Sel, lV24TFBarSerDsc, AV25TFBarSerDsc_Sel, lV26TFBarColNom, AV27TFBarColNom_Sel, Integer.valueOf(AV28TFBarColNum), Integer.valueOf(AV29TFBarColNum_To), Byte.valueOf(AV30TFBarTipCol), Byte.valueOf(AV31TFBarTipCol_To), lV32TFBarNomCli, AV33TFBarNomCli_Sel, AV34TFBarKgm, AV35TFBarKgm_To, AV36TFBarMtr, AV37TFBarMtr_To, Short.valueOf(AV44TFBarOrdLin), Short.valueOf(AV45TFBarOrdLin_To), lV86TFBarDibCli, AV87TFBarDibCli_Sel, Short.valueOf(AV46TFBarAcaAnh), Short.valueOf(AV47TFBarAcaAnh_To)});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A159BarFecGen = P093982_A159BarFecGen[0] ;
         A457FasCod = P093982_A457FasCod[0] ;
         A396EmprCod = P093982_A396EmprCod[0] ;
         A4466BarAcaAnh = P093982_A4466BarAcaAnh[0] ;
         A1798BarDibCli = P093982_A1798BarDibCli[0] ;
         A194BarOrdLin = P093982_A194BarOrdLin[0] ;
         A1234BarNomCli = P093982_A1234BarNomCli[0] ;
         A218BarTipCol = P093982_A218BarTipCol[0] ;
         A136BarColNum = P093982_A136BarColNum[0] ;
         A135BarColNom = P093982_A135BarColNom[0] ;
         A1652BarSerDsc = P093982_A1652BarSerDsc[0] ;
         A212BarSer = P093982_A212BarSer[0] ;
         A213BarSit = P093982_A213BarSit[0] ;
         A13696BarNHdr = P093982_A13696BarNHdr[0] ;
         A279CliNom = P093982_A279CliNom[0] ;
         A252CliCod = P093982_A252CliCod[0] ;
         n252CliCod = P093982_n252CliCod[0] ;
         A153BarFasEst = P093982_A153BarFasEst[0] ;
         A603MaqCodBis = P093982_A603MaqCodBis[0] ;
         A1955BarFasSig = P093982_A1955BarFasSig[0] ;
         n1955BarFasSig = P093982_n1955BarFasSig[0] ;
         A154BarFasLin = P093982_A154BarFasLin[0] ;
         n154BarFasLin = P093982_n154BarFasLin[0] ;
         A151BarFasCod = P093982_A151BarFasCod[0] ;
         n151BarFasCod = P093982_n151BarFasCod[0] ;
         A184BarMtr = P093982_A184BarMtr[0] ;
         A166BarKgm = P093982_A166BarKgm[0] ;
         A129BarCod = P093982_A129BarCod[0] ;
         A132BarCodReo = P093982_A132BarCodReo[0] ;
         A130BarCodPar = P093982_A130BarCodPar[0] ;
         A758ProCod = P093982_A758ProCod[0] ;
         A159BarFecGen = P093982_A159BarFecGen[0] ;
         A4466BarAcaAnh = P093982_A4466BarAcaAnh[0] ;
         A1798BarDibCli = P093982_A1798BarDibCli[0] ;
         A1234BarNomCli = P093982_A1234BarNomCli[0] ;
         A218BarTipCol = P093982_A218BarTipCol[0] ;
         A136BarColNum = P093982_A136BarColNum[0] ;
         A135BarColNom = P093982_A135BarColNom[0] ;
         A1652BarSerDsc = P093982_A1652BarSerDsc[0] ;
         A212BarSer = P093982_A212BarSer[0] ;
         A213BarSit = P093982_A213BarSit[0] ;
         A13696BarNHdr = P093982_A13696BarNHdr[0] ;
         A252CliCod = P093982_A252CliCod[0] ;
         n252CliCod = P093982_n252CliCod[0] ;
         A279CliNom = P093982_A279CliNom[0] ;
         A1955BarFasSig = P093982_A1955BarFasSig[0] ;
         n1955BarFasSig = P093982_n1955BarFasSig[0] ;
         A154BarFasLin = P093982_A154BarFasLin[0] ;
         n154BarFasLin = P093982_n154BarFasLin[0] ;
         A151BarFasCod = P093982_A151BarFasCod[0] ;
         n151BarFasCod = P093982_n151BarFasCod[0] ;
         A184BarMtr = P093982_A184BarMtr[0] ;
         A166BarKgm = P093982_A166BarKgm[0] ;
         if ( ! (GXutil.strcmp("", A1955BarFasSig)==0) )
         {
            AV52Option = A1955BarFasSig ;
            AV51InsertIndex = 1 ;
            while ( ( AV51InsertIndex <= AV53Options.size() ) && ( GXutil.strcmp((String)AV53Options.elementAt(-1+AV51InsertIndex), AV52Option) < 0 ) )
            {
               AV51InsertIndex = (int)(AV51InsertIndex+1) ;
            }
            if ( ( AV51InsertIndex <= AV53Options.size() ) && ( GXutil.strcmp((String)AV53Options.elementAt(-1+AV51InsertIndex), AV52Option) == 0 ) )
            {
               AV60count = GXutil.lval( (String)AV58OptionIndexes.elementAt(-1+AV51InsertIndex)) ;
               AV60count = (long)(AV60count+1) ;
               AV58OptionIndexes.removeItem(AV51InsertIndex);
               AV58OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV60count), "Z,ZZZ,ZZZ,ZZ9")), AV51InsertIndex);
            }
            else
            {
               AV53Options.add(AV52Option, AV51InsertIndex);
               AV58OptionIndexes.add("1", AV51InsertIndex);
            }
         }
         if ( AV53Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(8);
      }
      pr_default.close(8);
   }

   public void S211( )
   {
      /* 'LOADBARDIBCLIOPTIONS' Routine */
      returnInSub = false ;
      AV86TFBarDibCli = AV48SearchTxt ;
      AV87TFBarDibCli_Sel = "" ;
      pr_default.dynParam(9, new Object[]{ new Object[]{
                                           Byte.valueOf(A153BarFasEst) ,
                                           AV11TFBarFasEst_Sels ,
                                           AV81TFMaqCodBis_Sel ,
                                           AV80TFMaqCodBis ,
                                           Integer.valueOf(AV11TFBarFasEst_Sels.size()) ,
                                           Integer.valueOf(AV12TFCliCod) ,
                                           Integer.valueOf(AV13TFCliCod_To) ,
                                           AV15TFCliNom_Sel ,
                                           AV14TFCliNom ,
                                           AV19TFBarNHdr_Sel ,
                                           AV18TFBarNHdr ,
                                           Byte.valueOf(AV20TFBarSit) ,
                                           Byte.valueOf(AV21TFBarSit_To) ,
                                           AV23TFBarSer_Sel ,
                                           AV22TFBarSer ,
                                           AV25TFBarSerDsc_Sel ,
                                           AV24TFBarSerDsc ,
                                           AV27TFBarColNom_Sel ,
                                           AV26TFBarColNom ,
                                           Integer.valueOf(AV28TFBarColNum) ,
                                           Integer.valueOf(AV29TFBarColNum_To) ,
                                           Byte.valueOf(AV30TFBarTipCol) ,
                                           Byte.valueOf(AV31TFBarTipCol_To) ,
                                           AV33TFBarNomCli_Sel ,
                                           AV32TFBarNomCli ,
                                           AV34TFBarKgm ,
                                           AV35TFBarKgm_To ,
                                           AV36TFBarMtr ,
                                           AV37TFBarMtr_To ,
                                           Short.valueOf(AV44TFBarOrdLin) ,
                                           Short.valueOf(AV45TFBarOrdLin_To) ,
                                           AV87TFBarDibCli_Sel ,
                                           AV86TFBarDibCli ,
                                           Short.valueOf(AV46TFBarAcaAnh) ,
                                           Short.valueOf(AV47TFBarAcaAnh_To) ,
                                           A603MaqCodBis ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Byte.valueOf(A213BarSit) ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           Byte.valueOf(A218BarTipCol) ,
                                           A1234BarNomCli ,
                                           A166BarKgm ,
                                           A184BarMtr ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A1798BarDibCli ,
                                           Short.valueOf(A4466BarAcaAnh) ,
                                           AV66FilterFullText ,
                                           A13696BarNHdr ,
                                           A151BarFasCod ,
                                           Short.valueOf(A154BarFasLin) ,
                                           A1955BarFasSig ,
                                           AV39TFBarFasCod_Sel ,
                                           AV38TFBarFasCod ,
                                           Short.valueOf(AV40TFBarFasLin) ,
                                           Short.valueOf(AV41TFBarFasLin_To) ,
                                           AV43TFBarFasSig_Sel ,
                                           AV42TFBarFasSig ,
                                           Integer.valueOf(AV68Clicod) ,
                                           Integer.valueOf(AV69Clicod_to) ,
                                           A159BarFecGen ,
                                           AV70BarFecgen ,
                                           AV71BarFecGen_to ,
                                           Byte.valueOf(AV72BarSIt) ,
                                           Byte.valueOf(AV73Barsit_to) ,
                                           Byte.valueOf(AV74BarfasEst) ,
                                           Byte.valueOf(AV75BarFasEst_to) ,
                                           Short.valueOf(AV76BarAcaAnh) ,
                                           A396EmprCod ,
                                           AV67Emprcod ,
                                           A457FasCod ,
                                           AV77Fascod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV66FilterFullText = GXutil.concat( GXutil.rtrim( AV66FilterFullText), "%", "") ;
      lV38TFBarFasCod = GXutil.padr( GXutil.rtrim( AV38TFBarFasCod), 8, "%") ;
      lV42TFBarFasSig = GXutil.padr( GXutil.rtrim( AV42TFBarFasSig), 8, "%") ;
      lV80TFMaqCodBis = GXutil.padr( GXutil.rtrim( AV80TFMaqCodBis), 6, "%") ;
      lV14TFCliNom = GXutil.padr( GXutil.rtrim( AV14TFCliNom), 30, "%") ;
      lV18TFBarNHdr = GXutil.padr( GXutil.rtrim( AV18TFBarNHdr), 11, "%") ;
      lV22TFBarSer = GXutil.padr( GXutil.rtrim( AV22TFBarSer), 16, "%") ;
      lV24TFBarSerDsc = GXutil.padr( GXutil.rtrim( AV24TFBarSerDsc), 26, "%") ;
      lV26TFBarColNom = GXutil.padr( GXutil.rtrim( AV26TFBarColNom), 13, "%") ;
      lV32TFBarNomCli = GXutil.padr( GXutil.rtrim( AV32TFBarNomCli), 13, "%") ;
      lV86TFBarDibCli = GXutil.padr( GXutil.rtrim( AV86TFBarDibCli), 16, "%") ;
      /* Using cursor P093991 */
      pr_default.execute(9, new Object[] {AV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, lV66FilterFullText, AV39TFBarFasCod_Sel, AV38TFBarFasCod, lV38TFBarFasCod, AV39TFBarFasCod_Sel, AV39TFBarFasCod_Sel, Short.valueOf(AV40TFBarFasLin), Short.valueOf(AV40TFBarFasLin), Short.valueOf(AV41TFBarFasLin_To), Short.valueOf(AV41TFBarFasLin_To), AV43TFBarFasSig_Sel, AV42TFBarFasSig, lV42TFBarFasSig, AV43TFBarFasSig_Sel, AV43TFBarFasSig_Sel, Integer.valueOf(AV68Clicod), Integer.valueOf(AV69Clicod_to), AV70BarFecgen, AV71BarFecGen_to, Byte.valueOf(AV72BarSIt), Byte.valueOf(AV73Barsit_to), Byte.valueOf(AV74BarfasEst), Byte.valueOf(AV75BarFasEst_to), Short.valueOf(AV76BarAcaAnh), Short.valueOf(AV76BarAcaAnh), AV67Emprcod, AV77Fascod, lV80TFMaqCodBis, AV81TFMaqCodBis_Sel, Integer.valueOf(AV12TFCliCod), Integer.valueOf(AV13TFCliCod_To), lV14TFCliNom, AV15TFCliNom_Sel, lV18TFBarNHdr, AV19TFBarNHdr_Sel, Byte.valueOf(AV20TFBarSit), Byte.valueOf(AV21TFBarSit_To), lV22TFBarSer, AV23TFBarSer_Sel, lV24TFBarSerDsc, AV25TFBarSerDsc_Sel, lV26TFBarColNom, AV27TFBarColNom_Sel, Integer.valueOf(AV28TFBarColNum), Integer.valueOf(AV29TFBarColNum_To), Byte.valueOf(AV30TFBarTipCol), Byte.valueOf(AV31TFBarTipCol_To), lV32TFBarNomCli, AV33TFBarNomCli_Sel, AV34TFBarKgm, AV35TFBarKgm_To, AV36TFBarMtr, AV37TFBarMtr_To, Short.valueOf(AV44TFBarOrdLin), Short.valueOf(AV45TFBarOrdLin_To), lV86TFBarDibCli, AV87TFBarDibCli_Sel, Short.valueOf(AV46TFBarAcaAnh), Short.valueOf(AV47TFBarAcaAnh_To)});
      while ( (pr_default.getStatus(9) != 101) )
      {
         brk93917 = false ;
         A396EmprCod = P093991_A396EmprCod[0] ;
         A457FasCod = P093991_A457FasCod[0] ;
         A1798BarDibCli = P093991_A1798BarDibCli[0] ;
         A159BarFecGen = P093991_A159BarFecGen[0] ;
         A4466BarAcaAnh = P093991_A4466BarAcaAnh[0] ;
         A194BarOrdLin = P093991_A194BarOrdLin[0] ;
         A1234BarNomCli = P093991_A1234BarNomCli[0] ;
         A218BarTipCol = P093991_A218BarTipCol[0] ;
         A136BarColNum = P093991_A136BarColNum[0] ;
         A135BarColNom = P093991_A135BarColNom[0] ;
         A1652BarSerDsc = P093991_A1652BarSerDsc[0] ;
         A212BarSer = P093991_A212BarSer[0] ;
         A213BarSit = P093991_A213BarSit[0] ;
         A13696BarNHdr = P093991_A13696BarNHdr[0] ;
         A279CliNom = P093991_A279CliNom[0] ;
         A252CliCod = P093991_A252CliCod[0] ;
         n252CliCod = P093991_n252CliCod[0] ;
         A153BarFasEst = P093991_A153BarFasEst[0] ;
         A603MaqCodBis = P093991_A603MaqCodBis[0] ;
         A1955BarFasSig = P093991_A1955BarFasSig[0] ;
         n1955BarFasSig = P093991_n1955BarFasSig[0] ;
         A154BarFasLin = P093991_A154BarFasLin[0] ;
         n154BarFasLin = P093991_n154BarFasLin[0] ;
         A151BarFasCod = P093991_A151BarFasCod[0] ;
         n151BarFasCod = P093991_n151BarFasCod[0] ;
         A184BarMtr = P093991_A184BarMtr[0] ;
         A166BarKgm = P093991_A166BarKgm[0] ;
         A129BarCod = P093991_A129BarCod[0] ;
         A132BarCodReo = P093991_A132BarCodReo[0] ;
         A130BarCodPar = P093991_A130BarCodPar[0] ;
         A758ProCod = P093991_A758ProCod[0] ;
         A1798BarDibCli = P093991_A1798BarDibCli[0] ;
         A159BarFecGen = P093991_A159BarFecGen[0] ;
         A4466BarAcaAnh = P093991_A4466BarAcaAnh[0] ;
         A1234BarNomCli = P093991_A1234BarNomCli[0] ;
         A218BarTipCol = P093991_A218BarTipCol[0] ;
         A136BarColNum = P093991_A136BarColNum[0] ;
         A135BarColNom = P093991_A135BarColNom[0] ;
         A1652BarSerDsc = P093991_A1652BarSerDsc[0] ;
         A212BarSer = P093991_A212BarSer[0] ;
         A213BarSit = P093991_A213BarSit[0] ;
         A13696BarNHdr = P093991_A13696BarNHdr[0] ;
         A252CliCod = P093991_A252CliCod[0] ;
         n252CliCod = P093991_n252CliCod[0] ;
         A279CliNom = P093991_A279CliNom[0] ;
         A1955BarFasSig = P093991_A1955BarFasSig[0] ;
         n1955BarFasSig = P093991_n1955BarFasSig[0] ;
         A154BarFasLin = P093991_A154BarFasLin[0] ;
         n154BarFasLin = P093991_n154BarFasLin[0] ;
         A151BarFasCod = P093991_A151BarFasCod[0] ;
         n151BarFasCod = P093991_n151BarFasCod[0] ;
         A184BarMtr = P093991_A184BarMtr[0] ;
         A166BarKgm = P093991_A166BarKgm[0] ;
         AV60count = 0 ;
         while ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(P093991_A1798BarDibCli[0], A1798BarDibCli) == 0 ) )
         {
            brk93917 = false ;
            A396EmprCod = P093991_A396EmprCod[0] ;
            A194BarOrdLin = P093991_A194BarOrdLin[0] ;
            A129BarCod = P093991_A129BarCod[0] ;
            A132BarCodReo = P093991_A132BarCodReo[0] ;
            A130BarCodPar = P093991_A130BarCodPar[0] ;
            A758ProCod = P093991_A758ProCod[0] ;
            AV60count = (long)(AV60count+1) ;
            brk93917 = true ;
            pr_default.readNext(9);
         }
         if ( ! (GXutil.strcmp("", A1798BarDibCli)==0) )
         {
            AV52Option = A1798BarDibCli ;
            AV53Options.add(AV52Option, 0);
            AV58OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV60count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV53Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk93917 )
         {
            brk93917 = true ;
            pr_default.readNext(9);
         }
      }
      pr_default.close(9);
   }

   protected void cleanup( )
   {
      this.aP3[0] = cargasproduccionporfase_wcgetfilterdata.this.AV54OptionsJson;
      this.aP4[0] = cargasproduccionporfase_wcgetfilterdata.this.AV57OptionsDescJson;
      this.aP5[0] = cargasproduccionporfase_wcgetfilterdata.this.AV59OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV54OptionsJson = "" ;
      AV57OptionsDescJson = "" ;
      AV59OptionIndexesJson = "" ;
      AV53Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV56OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV58OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV61Session = httpContext.getWebSession();
      AV63GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV64GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV66FilterFullText = "" ;
      AV80TFMaqCodBis = "" ;
      AV81TFMaqCodBis_Sel = "" ;
      AV10TFBarFasEst_SelsJson = "" ;
      AV11TFBarFasEst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV14TFCliNom = "" ;
      AV15TFCliNom_Sel = "" ;
      AV18TFBarNHdr = "" ;
      AV19TFBarNHdr_Sel = "" ;
      AV22TFBarSer = "" ;
      AV23TFBarSer_Sel = "" ;
      AV24TFBarSerDsc = "" ;
      AV25TFBarSerDsc_Sel = "" ;
      AV26TFBarColNom = "" ;
      AV27TFBarColNom_Sel = "" ;
      AV32TFBarNomCli = "" ;
      AV33TFBarNomCli_Sel = "" ;
      AV34TFBarKgm = DecimalUtil.ZERO ;
      AV35TFBarKgm_To = DecimalUtil.ZERO ;
      AV36TFBarMtr = DecimalUtil.ZERO ;
      AV37TFBarMtr_To = DecimalUtil.ZERO ;
      AV38TFBarFasCod = "" ;
      AV39TFBarFasCod_Sel = "" ;
      AV42TFBarFasSig = "" ;
      AV43TFBarFasSig_Sel = "" ;
      AV86TFBarDibCli = "" ;
      AV87TFBarDibCli_Sel = "" ;
      AV67Emprcod = "" ;
      AV77Fascod = "" ;
      AV70BarFecgen = GXutil.nullDate() ;
      AV71BarFecGen_to = GXutil.nullDate() ;
      lV66FilterFullText = "" ;
      lV38TFBarFasCod = "" ;
      lV42TFBarFasSig = "" ;
      scmdbuf = "" ;
      lV80TFMaqCodBis = "" ;
      lV14TFCliNom = "" ;
      lV18TFBarNHdr = "" ;
      lV22TFBarSer = "" ;
      lV24TFBarSerDsc = "" ;
      lV26TFBarColNom = "" ;
      lV32TFBarNomCli = "" ;
      lV86TFBarDibCli = "" ;
      A603MaqCodBis = "" ;
      A279CliNom = "" ;
      A130BarCodPar = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A1798BarDibCli = "" ;
      A13696BarNHdr = "" ;
      A151BarFasCod = "" ;
      A1955BarFasSig = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A457FasCod = "" ;
      A396EmprCod = "" ;
      P093910_A396EmprCod = new String[] {""} ;
      P093910_A603MaqCodBis = new String[] {""} ;
      P093910_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P093910_A457FasCod = new String[] {""} ;
      P093910_A4466BarAcaAnh = new short[1] ;
      P093910_A1798BarDibCli = new String[] {""} ;
      P093910_A194BarOrdLin = new short[1] ;
      P093910_A1234BarNomCli = new String[] {""} ;
      P093910_A218BarTipCol = new byte[1] ;
      P093910_A136BarColNum = new int[1] ;
      P093910_A135BarColNom = new String[] {""} ;
      P093910_A1652BarSerDsc = new String[] {""} ;
      P093910_A212BarSer = new String[] {""} ;
      P093910_A213BarSit = new byte[1] ;
      P093910_A13696BarNHdr = new String[] {""} ;
      P093910_A279CliNom = new String[] {""} ;
      P093910_A252CliCod = new int[1] ;
      P093910_n252CliCod = new boolean[] {false} ;
      P093910_A153BarFasEst = new byte[1] ;
      P093910_A1955BarFasSig = new String[] {""} ;
      P093910_n1955BarFasSig = new boolean[] {false} ;
      P093910_A154BarFasLin = new short[1] ;
      P093910_n154BarFasLin = new boolean[] {false} ;
      P093910_A151BarFasCod = new String[] {""} ;
      P093910_n151BarFasCod = new boolean[] {false} ;
      P093910_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P093910_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P093910_A129BarCod = new int[1] ;
      P093910_A132BarCodReo = new byte[1] ;
      P093910_A130BarCodPar = new String[] {""} ;
      P093910_A758ProCod = new String[] {""} ;
      A758ProCod = "" ;
      AV52Option = "" ;
      P093919_A396EmprCod = new String[] {""} ;
      P093919_A457FasCod = new String[] {""} ;
      P093919_A279CliNom = new String[] {""} ;
      P093919_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P093919_A4466BarAcaAnh = new short[1] ;
      P093919_A1798BarDibCli = new String[] {""} ;
      P093919_A194BarOrdLin = new short[1] ;
      P093919_A1234BarNomCli = new String[] {""} ;
      P093919_A218BarTipCol = new byte[1] ;
      P093919_A136BarColNum = new int[1] ;
      P093919_A135BarColNom = new String[] {""} ;
      P093919_A1652BarSerDsc = new String[] {""} ;
      P093919_A212BarSer = new String[] {""} ;
      P093919_A213BarSit = new byte[1] ;
      P093919_A13696BarNHdr = new String[] {""} ;
      P093919_A252CliCod = new int[1] ;
      P093919_n252CliCod = new boolean[] {false} ;
      P093919_A153BarFasEst = new byte[1] ;
      P093919_A603MaqCodBis = new String[] {""} ;
      P093919_A1955BarFasSig = new String[] {""} ;
      P093919_n1955BarFasSig = new boolean[] {false} ;
      P093919_A154BarFasLin = new short[1] ;
      P093919_n154BarFasLin = new boolean[] {false} ;
      P093919_A151BarFasCod = new String[] {""} ;
      P093919_n151BarFasCod = new boolean[] {false} ;
      P093919_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P093919_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P093919_A129BarCod = new int[1] ;
      P093919_A132BarCodReo = new byte[1] ;
      P093919_A130BarCodPar = new String[] {""} ;
      P093919_A758ProCod = new String[] {""} ;
      P093928_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P093928_A457FasCod = new String[] {""} ;
      P093928_A396EmprCod = new String[] {""} ;
      P093928_A4466BarAcaAnh = new short[1] ;
      P093928_A1798BarDibCli = new String[] {""} ;
      P093928_A194BarOrdLin = new short[1] ;
      P093928_A1234BarNomCli = new String[] {""} ;
      P093928_A218BarTipCol = new byte[1] ;
      P093928_A136BarColNum = new int[1] ;
      P093928_A135BarColNom = new String[] {""} ;
      P093928_A1652BarSerDsc = new String[] {""} ;
      P093928_A212BarSer = new String[] {""} ;
      P093928_A213BarSit = new byte[1] ;
      P093928_A13696BarNHdr = new String[] {""} ;
      P093928_A279CliNom = new String[] {""} ;
      P093928_A252CliCod = new int[1] ;
      P093928_n252CliCod = new boolean[] {false} ;
      P093928_A153BarFasEst = new byte[1] ;
      P093928_A603MaqCodBis = new String[] {""} ;
      P093928_A1955BarFasSig = new String[] {""} ;
      P093928_n1955BarFasSig = new boolean[] {false} ;
      P093928_A154BarFasLin = new short[1] ;
      P093928_n154BarFasLin = new boolean[] {false} ;
      P093928_A151BarFasCod = new String[] {""} ;
      P093928_n151BarFasCod = new boolean[] {false} ;
      P093928_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P093928_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P093928_A129BarCod = new int[1] ;
      P093928_A132BarCodReo = new byte[1] ;
      P093928_A130BarCodPar = new String[] {""} ;
      P093928_A758ProCod = new String[] {""} ;
      P093937_A396EmprCod = new String[] {""} ;
      P093937_A457FasCod = new String[] {""} ;
      P093937_A212BarSer = new String[] {""} ;
      P093937_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P093937_A4466BarAcaAnh = new short[1] ;
      P093937_A1798BarDibCli = new String[] {""} ;
      P093937_A194BarOrdLin = new short[1] ;
      P093937_A1234BarNomCli = new String[] {""} ;
      P093937_A218BarTipCol = new byte[1] ;
      P093937_A136BarColNum = new int[1] ;
      P093937_A135BarColNom = new String[] {""} ;
      P093937_A1652BarSerDsc = new String[] {""} ;
      P093937_A213BarSit = new byte[1] ;
      P093937_A13696BarNHdr = new String[] {""} ;
      P093937_A279CliNom = new String[] {""} ;
      P093937_A252CliCod = new int[1] ;
      P093937_n252CliCod = new boolean[] {false} ;
      P093937_A153BarFasEst = new byte[1] ;
      P093937_A603MaqCodBis = new String[] {""} ;
      P093937_A1955BarFasSig = new String[] {""} ;
      P093937_n1955BarFasSig = new boolean[] {false} ;
      P093937_A154BarFasLin = new short[1] ;
      P093937_n154BarFasLin = new boolean[] {false} ;
      P093937_A151BarFasCod = new String[] {""} ;
      P093937_n151BarFasCod = new boolean[] {false} ;
      P093937_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P093937_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P093937_A129BarCod = new int[1] ;
      P093937_A132BarCodReo = new byte[1] ;
      P093937_A130BarCodPar = new String[] {""} ;
      P093937_A758ProCod = new String[] {""} ;
      P093946_A396EmprCod = new String[] {""} ;
      P093946_A457FasCod = new String[] {""} ;
      P093946_A1652BarSerDsc = new String[] {""} ;
      P093946_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P093946_A4466BarAcaAnh = new short[1] ;
      P093946_A1798BarDibCli = new String[] {""} ;
      P093946_A194BarOrdLin = new short[1] ;
      P093946_A1234BarNomCli = new String[] {""} ;
      P093946_A218BarTipCol = new byte[1] ;
      P093946_A136BarColNum = new int[1] ;
      P093946_A135BarColNom = new String[] {""} ;
      P093946_A212BarSer = new String[] {""} ;
      P093946_A213BarSit = new byte[1] ;
      P093946_A13696BarNHdr = new String[] {""} ;
      P093946_A279CliNom = new String[] {""} ;
      P093946_A252CliCod = new int[1] ;
      P093946_n252CliCod = new boolean[] {false} ;
      P093946_A153BarFasEst = new byte[1] ;
      P093946_A603MaqCodBis = new String[] {""} ;
      P093946_A1955BarFasSig = new String[] {""} ;
      P093946_n1955BarFasSig = new boolean[] {false} ;
      P093946_A154BarFasLin = new short[1] ;
      P093946_n154BarFasLin = new boolean[] {false} ;
      P093946_A151BarFasCod = new String[] {""} ;
      P093946_n151BarFasCod = new boolean[] {false} ;
      P093946_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P093946_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P093946_A129BarCod = new int[1] ;
      P093946_A132BarCodReo = new byte[1] ;
      P093946_A130BarCodPar = new String[] {""} ;
      P093946_A758ProCod = new String[] {""} ;
      P093955_A396EmprCod = new String[] {""} ;
      P093955_A457FasCod = new String[] {""} ;
      P093955_A135BarColNom = new String[] {""} ;
      P093955_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P093955_A4466BarAcaAnh = new short[1] ;
      P093955_A1798BarDibCli = new String[] {""} ;
      P093955_A194BarOrdLin = new short[1] ;
      P093955_A1234BarNomCli = new String[] {""} ;
      P093955_A218BarTipCol = new byte[1] ;
      P093955_A136BarColNum = new int[1] ;
      P093955_A1652BarSerDsc = new String[] {""} ;
      P093955_A212BarSer = new String[] {""} ;
      P093955_A213BarSit = new byte[1] ;
      P093955_A13696BarNHdr = new String[] {""} ;
      P093955_A279CliNom = new String[] {""} ;
      P093955_A252CliCod = new int[1] ;
      P093955_n252CliCod = new boolean[] {false} ;
      P093955_A153BarFasEst = new byte[1] ;
      P093955_A603MaqCodBis = new String[] {""} ;
      P093955_A1955BarFasSig = new String[] {""} ;
      P093955_n1955BarFasSig = new boolean[] {false} ;
      P093955_A154BarFasLin = new short[1] ;
      P093955_n154BarFasLin = new boolean[] {false} ;
      P093955_A151BarFasCod = new String[] {""} ;
      P093955_n151BarFasCod = new boolean[] {false} ;
      P093955_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P093955_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P093955_A129BarCod = new int[1] ;
      P093955_A132BarCodReo = new byte[1] ;
      P093955_A130BarCodPar = new String[] {""} ;
      P093955_A758ProCod = new String[] {""} ;
      P093964_A396EmprCod = new String[] {""} ;
      P093964_A457FasCod = new String[] {""} ;
      P093964_A1234BarNomCli = new String[] {""} ;
      P093964_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P093964_A4466BarAcaAnh = new short[1] ;
      P093964_A1798BarDibCli = new String[] {""} ;
      P093964_A194BarOrdLin = new short[1] ;
      P093964_A218BarTipCol = new byte[1] ;
      P093964_A136BarColNum = new int[1] ;
      P093964_A135BarColNom = new String[] {""} ;
      P093964_A1652BarSerDsc = new String[] {""} ;
      P093964_A212BarSer = new String[] {""} ;
      P093964_A213BarSit = new byte[1] ;
      P093964_A13696BarNHdr = new String[] {""} ;
      P093964_A279CliNom = new String[] {""} ;
      P093964_A252CliCod = new int[1] ;
      P093964_n252CliCod = new boolean[] {false} ;
      P093964_A153BarFasEst = new byte[1] ;
      P093964_A603MaqCodBis = new String[] {""} ;
      P093964_A1955BarFasSig = new String[] {""} ;
      P093964_n1955BarFasSig = new boolean[] {false} ;
      P093964_A154BarFasLin = new short[1] ;
      P093964_n154BarFasLin = new boolean[] {false} ;
      P093964_A151BarFasCod = new String[] {""} ;
      P093964_n151BarFasCod = new boolean[] {false} ;
      P093964_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P093964_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P093964_A129BarCod = new int[1] ;
      P093964_A132BarCodReo = new byte[1] ;
      P093964_A130BarCodPar = new String[] {""} ;
      P093964_A758ProCod = new String[] {""} ;
      P093973_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P093973_A457FasCod = new String[] {""} ;
      P093973_A396EmprCod = new String[] {""} ;
      P093973_A4466BarAcaAnh = new short[1] ;
      P093973_A1798BarDibCli = new String[] {""} ;
      P093973_A194BarOrdLin = new short[1] ;
      P093973_A1234BarNomCli = new String[] {""} ;
      P093973_A218BarTipCol = new byte[1] ;
      P093973_A136BarColNum = new int[1] ;
      P093973_A135BarColNom = new String[] {""} ;
      P093973_A1652BarSerDsc = new String[] {""} ;
      P093973_A212BarSer = new String[] {""} ;
      P093973_A213BarSit = new byte[1] ;
      P093973_A13696BarNHdr = new String[] {""} ;
      P093973_A279CliNom = new String[] {""} ;
      P093973_A252CliCod = new int[1] ;
      P093973_n252CliCod = new boolean[] {false} ;
      P093973_A153BarFasEst = new byte[1] ;
      P093973_A603MaqCodBis = new String[] {""} ;
      P093973_A1955BarFasSig = new String[] {""} ;
      P093973_n1955BarFasSig = new boolean[] {false} ;
      P093973_A154BarFasLin = new short[1] ;
      P093973_n154BarFasLin = new boolean[] {false} ;
      P093973_A151BarFasCod = new String[] {""} ;
      P093973_n151BarFasCod = new boolean[] {false} ;
      P093973_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P093973_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P093973_A129BarCod = new int[1] ;
      P093973_A132BarCodReo = new byte[1] ;
      P093973_A130BarCodPar = new String[] {""} ;
      P093973_A758ProCod = new String[] {""} ;
      P093982_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P093982_A457FasCod = new String[] {""} ;
      P093982_A396EmprCod = new String[] {""} ;
      P093982_A4466BarAcaAnh = new short[1] ;
      P093982_A1798BarDibCli = new String[] {""} ;
      P093982_A194BarOrdLin = new short[1] ;
      P093982_A1234BarNomCli = new String[] {""} ;
      P093982_A218BarTipCol = new byte[1] ;
      P093982_A136BarColNum = new int[1] ;
      P093982_A135BarColNom = new String[] {""} ;
      P093982_A1652BarSerDsc = new String[] {""} ;
      P093982_A212BarSer = new String[] {""} ;
      P093982_A213BarSit = new byte[1] ;
      P093982_A13696BarNHdr = new String[] {""} ;
      P093982_A279CliNom = new String[] {""} ;
      P093982_A252CliCod = new int[1] ;
      P093982_n252CliCod = new boolean[] {false} ;
      P093982_A153BarFasEst = new byte[1] ;
      P093982_A603MaqCodBis = new String[] {""} ;
      P093982_A1955BarFasSig = new String[] {""} ;
      P093982_n1955BarFasSig = new boolean[] {false} ;
      P093982_A154BarFasLin = new short[1] ;
      P093982_n154BarFasLin = new boolean[] {false} ;
      P093982_A151BarFasCod = new String[] {""} ;
      P093982_n151BarFasCod = new boolean[] {false} ;
      P093982_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P093982_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P093982_A129BarCod = new int[1] ;
      P093982_A132BarCodReo = new byte[1] ;
      P093982_A130BarCodPar = new String[] {""} ;
      P093982_A758ProCod = new String[] {""} ;
      P093991_A396EmprCod = new String[] {""} ;
      P093991_A457FasCod = new String[] {""} ;
      P093991_A1798BarDibCli = new String[] {""} ;
      P093991_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P093991_A4466BarAcaAnh = new short[1] ;
      P093991_A194BarOrdLin = new short[1] ;
      P093991_A1234BarNomCli = new String[] {""} ;
      P093991_A218BarTipCol = new byte[1] ;
      P093991_A136BarColNum = new int[1] ;
      P093991_A135BarColNom = new String[] {""} ;
      P093991_A1652BarSerDsc = new String[] {""} ;
      P093991_A212BarSer = new String[] {""} ;
      P093991_A213BarSit = new byte[1] ;
      P093991_A13696BarNHdr = new String[] {""} ;
      P093991_A279CliNom = new String[] {""} ;
      P093991_A252CliCod = new int[1] ;
      P093991_n252CliCod = new boolean[] {false} ;
      P093991_A153BarFasEst = new byte[1] ;
      P093991_A603MaqCodBis = new String[] {""} ;
      P093991_A1955BarFasSig = new String[] {""} ;
      P093991_n1955BarFasSig = new boolean[] {false} ;
      P093991_A154BarFasLin = new short[1] ;
      P093991_n154BarFasLin = new boolean[] {false} ;
      P093991_A151BarFasCod = new String[] {""} ;
      P093991_n151BarFasCod = new boolean[] {false} ;
      P093991_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P093991_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P093991_A129BarCod = new int[1] ;
      P093991_A132BarCodReo = new byte[1] ;
      P093991_A130BarCodPar = new String[] {""} ;
      P093991_A758ProCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccion.cargasproduccionporfase_wcgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P093910_A396EmprCod, P093910_A603MaqCodBis, P093910_A159BarFecGen, P093910_A457FasCod, P093910_A4466BarAcaAnh, P093910_A1798BarDibCli, P093910_A194BarOrdLin, P093910_A1234BarNomCli, P093910_A218BarTipCol, P093910_A136BarColNum,
            P093910_A135BarColNom, P093910_A1652BarSerDsc, P093910_A212BarSer, P093910_A213BarSit, P093910_A13696BarNHdr, P093910_A279CliNom, P093910_A252CliCod, P093910_n252CliCod, P093910_A153BarFasEst, P093910_A1955BarFasSig,
            P093910_n1955BarFasSig, P093910_A154BarFasLin, P093910_n154BarFasLin, P093910_A151BarFasCod, P093910_n151BarFasCod, P093910_A184BarMtr, P093910_A166BarKgm, P093910_A129BarCod, P093910_A132BarCodReo, P093910_A130BarCodPar,
            P093910_A758ProCod
            }
            , new Object[] {
            P093919_A396EmprCod, P093919_A457FasCod, P093919_A279CliNom, P093919_A159BarFecGen, P093919_A4466BarAcaAnh, P093919_A1798BarDibCli, P093919_A194BarOrdLin, P093919_A1234BarNomCli, P093919_A218BarTipCol, P093919_A136BarColNum,
            P093919_A135BarColNom, P093919_A1652BarSerDsc, P093919_A212BarSer, P093919_A213BarSit, P093919_A13696BarNHdr, P093919_A252CliCod, P093919_n252CliCod, P093919_A153BarFasEst, P093919_A603MaqCodBis, P093919_A1955BarFasSig,
            P093919_n1955BarFasSig, P093919_A154BarFasLin, P093919_n154BarFasLin, P093919_A151BarFasCod, P093919_n151BarFasCod, P093919_A184BarMtr, P093919_A166BarKgm, P093919_A129BarCod, P093919_A132BarCodReo, P093919_A130BarCodPar,
            P093919_A758ProCod
            }
            , new Object[] {
            P093928_A159BarFecGen, P093928_A457FasCod, P093928_A396EmprCod, P093928_A4466BarAcaAnh, P093928_A1798BarDibCli, P093928_A194BarOrdLin, P093928_A1234BarNomCli, P093928_A218BarTipCol, P093928_A136BarColNum, P093928_A135BarColNom,
            P093928_A1652BarSerDsc, P093928_A212BarSer, P093928_A213BarSit, P093928_A13696BarNHdr, P093928_A279CliNom, P093928_A252CliCod, P093928_n252CliCod, P093928_A153BarFasEst, P093928_A603MaqCodBis, P093928_A1955BarFasSig,
            P093928_n1955BarFasSig, P093928_A154BarFasLin, P093928_n154BarFasLin, P093928_A151BarFasCod, P093928_n151BarFasCod, P093928_A184BarMtr, P093928_A166BarKgm, P093928_A129BarCod, P093928_A132BarCodReo, P093928_A130BarCodPar,
            P093928_A758ProCod
            }
            , new Object[] {
            P093937_A396EmprCod, P093937_A457FasCod, P093937_A212BarSer, P093937_A159BarFecGen, P093937_A4466BarAcaAnh, P093937_A1798BarDibCli, P093937_A194BarOrdLin, P093937_A1234BarNomCli, P093937_A218BarTipCol, P093937_A136BarColNum,
            P093937_A135BarColNom, P093937_A1652BarSerDsc, P093937_A213BarSit, P093937_A13696BarNHdr, P093937_A279CliNom, P093937_A252CliCod, P093937_n252CliCod, P093937_A153BarFasEst, P093937_A603MaqCodBis, P093937_A1955BarFasSig,
            P093937_n1955BarFasSig, P093937_A154BarFasLin, P093937_n154BarFasLin, P093937_A151BarFasCod, P093937_n151BarFasCod, P093937_A184BarMtr, P093937_A166BarKgm, P093937_A129BarCod, P093937_A132BarCodReo, P093937_A130BarCodPar,
            P093937_A758ProCod
            }
            , new Object[] {
            P093946_A396EmprCod, P093946_A457FasCod, P093946_A1652BarSerDsc, P093946_A159BarFecGen, P093946_A4466BarAcaAnh, P093946_A1798BarDibCli, P093946_A194BarOrdLin, P093946_A1234BarNomCli, P093946_A218BarTipCol, P093946_A136BarColNum,
            P093946_A135BarColNom, P093946_A212BarSer, P093946_A213BarSit, P093946_A13696BarNHdr, P093946_A279CliNom, P093946_A252CliCod, P093946_n252CliCod, P093946_A153BarFasEst, P093946_A603MaqCodBis, P093946_A1955BarFasSig,
            P093946_n1955BarFasSig, P093946_A154BarFasLin, P093946_n154BarFasLin, P093946_A151BarFasCod, P093946_n151BarFasCod, P093946_A184BarMtr, P093946_A166BarKgm, P093946_A129BarCod, P093946_A132BarCodReo, P093946_A130BarCodPar,
            P093946_A758ProCod
            }
            , new Object[] {
            P093955_A396EmprCod, P093955_A457FasCod, P093955_A135BarColNom, P093955_A159BarFecGen, P093955_A4466BarAcaAnh, P093955_A1798BarDibCli, P093955_A194BarOrdLin, P093955_A1234BarNomCli, P093955_A218BarTipCol, P093955_A136BarColNum,
            P093955_A1652BarSerDsc, P093955_A212BarSer, P093955_A213BarSit, P093955_A13696BarNHdr, P093955_A279CliNom, P093955_A252CliCod, P093955_n252CliCod, P093955_A153BarFasEst, P093955_A603MaqCodBis, P093955_A1955BarFasSig,
            P093955_n1955BarFasSig, P093955_A154BarFasLin, P093955_n154BarFasLin, P093955_A151BarFasCod, P093955_n151BarFasCod, P093955_A184BarMtr, P093955_A166BarKgm, P093955_A129BarCod, P093955_A132BarCodReo, P093955_A130BarCodPar,
            P093955_A758ProCod
            }
            , new Object[] {
            P093964_A396EmprCod, P093964_A457FasCod, P093964_A1234BarNomCli, P093964_A159BarFecGen, P093964_A4466BarAcaAnh, P093964_A1798BarDibCli, P093964_A194BarOrdLin, P093964_A218BarTipCol, P093964_A136BarColNum, P093964_A135BarColNom,
            P093964_A1652BarSerDsc, P093964_A212BarSer, P093964_A213BarSit, P093964_A13696BarNHdr, P093964_A279CliNom, P093964_A252CliCod, P093964_n252CliCod, P093964_A153BarFasEst, P093964_A603MaqCodBis, P093964_A1955BarFasSig,
            P093964_n1955BarFasSig, P093964_A154BarFasLin, P093964_n154BarFasLin, P093964_A151BarFasCod, P093964_n151BarFasCod, P093964_A184BarMtr, P093964_A166BarKgm, P093964_A129BarCod, P093964_A132BarCodReo, P093964_A130BarCodPar,
            P093964_A758ProCod
            }
            , new Object[] {
            P093973_A159BarFecGen, P093973_A457FasCod, P093973_A396EmprCod, P093973_A4466BarAcaAnh, P093973_A1798BarDibCli, P093973_A194BarOrdLin, P093973_A1234BarNomCli, P093973_A218BarTipCol, P093973_A136BarColNum, P093973_A135BarColNom,
            P093973_A1652BarSerDsc, P093973_A212BarSer, P093973_A213BarSit, P093973_A13696BarNHdr, P093973_A279CliNom, P093973_A252CliCod, P093973_n252CliCod, P093973_A153BarFasEst, P093973_A603MaqCodBis, P093973_A1955BarFasSig,
            P093973_n1955BarFasSig, P093973_A154BarFasLin, P093973_n154BarFasLin, P093973_A151BarFasCod, P093973_n151BarFasCod, P093973_A184BarMtr, P093973_A166BarKgm, P093973_A129BarCod, P093973_A132BarCodReo, P093973_A130BarCodPar,
            P093973_A758ProCod
            }
            , new Object[] {
            P093982_A159BarFecGen, P093982_A457FasCod, P093982_A396EmprCod, P093982_A4466BarAcaAnh, P093982_A1798BarDibCli, P093982_A194BarOrdLin, P093982_A1234BarNomCli, P093982_A218BarTipCol, P093982_A136BarColNum, P093982_A135BarColNom,
            P093982_A1652BarSerDsc, P093982_A212BarSer, P093982_A213BarSit, P093982_A13696BarNHdr, P093982_A279CliNom, P093982_A252CliCod, P093982_n252CliCod, P093982_A153BarFasEst, P093982_A603MaqCodBis, P093982_A1955BarFasSig,
            P093982_n1955BarFasSig, P093982_A154BarFasLin, P093982_n154BarFasLin, P093982_A151BarFasCod, P093982_n151BarFasCod, P093982_A184BarMtr, P093982_A166BarKgm, P093982_A129BarCod, P093982_A132BarCodReo, P093982_A130BarCodPar,
            P093982_A758ProCod
            }
            , new Object[] {
            P093991_A396EmprCod, P093991_A457FasCod, P093991_A1798BarDibCli, P093991_A159BarFecGen, P093991_A4466BarAcaAnh, P093991_A194BarOrdLin, P093991_A1234BarNomCli, P093991_A218BarTipCol, P093991_A136BarColNum, P093991_A135BarColNom,
            P093991_A1652BarSerDsc, P093991_A212BarSer, P093991_A213BarSit, P093991_A13696BarNHdr, P093991_A279CliNom, P093991_A252CliCod, P093991_n252CliCod, P093991_A153BarFasEst, P093991_A603MaqCodBis, P093991_A1955BarFasSig,
            P093991_n1955BarFasSig, P093991_A154BarFasLin, P093991_n154BarFasLin, P093991_A151BarFasCod, P093991_n151BarFasCod, P093991_A184BarMtr, P093991_A166BarKgm, P093991_A129BarCod, P093991_A132BarCodReo, P093991_A130BarCodPar,
            P093991_A758ProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV20TFBarSit ;
   private byte AV21TFBarSit_To ;
   private byte AV30TFBarTipCol ;
   private byte AV31TFBarTipCol_To ;
   private byte AV72BarSIt ;
   private byte AV73Barsit_to ;
   private byte AV74BarfasEst ;
   private byte AV75BarFasEst_to ;
   private byte A153BarFasEst ;
   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private byte A218BarTipCol ;
   private short AV40TFBarFasLin ;
   private short AV41TFBarFasLin_To ;
   private short AV44TFBarOrdLin ;
   private short AV45TFBarOrdLin_To ;
   private short AV46TFBarAcaAnh ;
   private short AV47TFBarAcaAnh_To ;
   private short AV76BarAcaAnh ;
   private short A194BarOrdLin ;
   private short A4466BarAcaAnh ;
   private short A154BarFasLin ;
   private short Gx_err ;
   private int AV92GXV1 ;
   private int AV12TFCliCod ;
   private int AV13TFCliCod_To ;
   private int AV28TFBarColNum ;
   private int AV29TFBarColNum_To ;
   private int AV68Clicod ;
   private int AV69Clicod_to ;
   private int AV11TFBarFasEst_Sels_size ;
   private int A252CliCod ;
   private int A129BarCod ;
   private int A136BarColNum ;
   private int AV51InsertIndex ;
   private long AV60count ;
   private java.math.BigDecimal AV34TFBarKgm ;
   private java.math.BigDecimal AV35TFBarKgm_To ;
   private java.math.BigDecimal AV36TFBarMtr ;
   private java.math.BigDecimal AV37TFBarMtr_To ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private String AV80TFMaqCodBis ;
   private String AV81TFMaqCodBis_Sel ;
   private String AV14TFCliNom ;
   private String AV15TFCliNom_Sel ;
   private String AV18TFBarNHdr ;
   private String AV19TFBarNHdr_Sel ;
   private String AV22TFBarSer ;
   private String AV23TFBarSer_Sel ;
   private String AV24TFBarSerDsc ;
   private String AV25TFBarSerDsc_Sel ;
   private String AV26TFBarColNom ;
   private String AV27TFBarColNom_Sel ;
   private String AV32TFBarNomCli ;
   private String AV33TFBarNomCli_Sel ;
   private String AV38TFBarFasCod ;
   private String AV39TFBarFasCod_Sel ;
   private String AV42TFBarFasSig ;
   private String AV43TFBarFasSig_Sel ;
   private String AV86TFBarDibCli ;
   private String AV87TFBarDibCli_Sel ;
   private String AV67Emprcod ;
   private String AV77Fascod ;
   private String lV38TFBarFasCod ;
   private String lV42TFBarFasSig ;
   private String scmdbuf ;
   private String lV80TFMaqCodBis ;
   private String lV14TFCliNom ;
   private String lV18TFBarNHdr ;
   private String lV22TFBarSer ;
   private String lV24TFBarSerDsc ;
   private String lV26TFBarColNom ;
   private String lV32TFBarNomCli ;
   private String lV86TFBarDibCli ;
   private String A603MaqCodBis ;
   private String A279CliNom ;
   private String A130BarCodPar ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A1798BarDibCli ;
   private String A13696BarNHdr ;
   private String A151BarFasCod ;
   private String A1955BarFasSig ;
   private String A457FasCod ;
   private String A396EmprCod ;
   private String A758ProCod ;
   private java.util.Date AV70BarFecgen ;
   private java.util.Date AV71BarFecGen_to ;
   private java.util.Date A159BarFecGen ;
   private boolean returnInSub ;
   private boolean brk9392 ;
   private boolean n252CliCod ;
   private boolean n1955BarFasSig ;
   private boolean n154BarFasLin ;
   private boolean n151BarFasCod ;
   private boolean brk9394 ;
   private boolean brk9397 ;
   private boolean brk9399 ;
   private boolean brk93911 ;
   private boolean brk93913 ;
   private boolean brk93917 ;
   private String AV54OptionsJson ;
   private String AV57OptionsDescJson ;
   private String AV59OptionIndexesJson ;
   private String AV10TFBarFasEst_SelsJson ;
   private String AV50DDOName ;
   private String AV48SearchTxt ;
   private String AV49SearchTxtTo ;
   private String AV66FilterFullText ;
   private String lV66FilterFullText ;
   private String AV52Option ;
   private GXSimpleCollection<Byte> AV11TFBarFasEst_Sels ;
   private com.genexus.webpanels.WebSession AV61Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P093910_A396EmprCod ;
   private String[] P093910_A603MaqCodBis ;
   private java.util.Date[] P093910_A159BarFecGen ;
   private String[] P093910_A457FasCod ;
   private short[] P093910_A4466BarAcaAnh ;
   private String[] P093910_A1798BarDibCli ;
   private short[] P093910_A194BarOrdLin ;
   private String[] P093910_A1234BarNomCli ;
   private byte[] P093910_A218BarTipCol ;
   private int[] P093910_A136BarColNum ;
   private String[] P093910_A135BarColNom ;
   private String[] P093910_A1652BarSerDsc ;
   private String[] P093910_A212BarSer ;
   private byte[] P093910_A213BarSit ;
   private String[] P093910_A13696BarNHdr ;
   private String[] P093910_A279CliNom ;
   private int[] P093910_A252CliCod ;
   private boolean[] P093910_n252CliCod ;
   private byte[] P093910_A153BarFasEst ;
   private String[] P093910_A1955BarFasSig ;
   private boolean[] P093910_n1955BarFasSig ;
   private short[] P093910_A154BarFasLin ;
   private boolean[] P093910_n154BarFasLin ;
   private String[] P093910_A151BarFasCod ;
   private boolean[] P093910_n151BarFasCod ;
   private java.math.BigDecimal[] P093910_A184BarMtr ;
   private java.math.BigDecimal[] P093910_A166BarKgm ;
   private int[] P093910_A129BarCod ;
   private byte[] P093910_A132BarCodReo ;
   private String[] P093910_A130BarCodPar ;
   private String[] P093910_A758ProCod ;
   private String[] P093919_A396EmprCod ;
   private String[] P093919_A457FasCod ;
   private String[] P093919_A279CliNom ;
   private java.util.Date[] P093919_A159BarFecGen ;
   private short[] P093919_A4466BarAcaAnh ;
   private String[] P093919_A1798BarDibCli ;
   private short[] P093919_A194BarOrdLin ;
   private String[] P093919_A1234BarNomCli ;
   private byte[] P093919_A218BarTipCol ;
   private int[] P093919_A136BarColNum ;
   private String[] P093919_A135BarColNom ;
   private String[] P093919_A1652BarSerDsc ;
   private String[] P093919_A212BarSer ;
   private byte[] P093919_A213BarSit ;
   private String[] P093919_A13696BarNHdr ;
   private int[] P093919_A252CliCod ;
   private boolean[] P093919_n252CliCod ;
   private byte[] P093919_A153BarFasEst ;
   private String[] P093919_A603MaqCodBis ;
   private String[] P093919_A1955BarFasSig ;
   private boolean[] P093919_n1955BarFasSig ;
   private short[] P093919_A154BarFasLin ;
   private boolean[] P093919_n154BarFasLin ;
   private String[] P093919_A151BarFasCod ;
   private boolean[] P093919_n151BarFasCod ;
   private java.math.BigDecimal[] P093919_A184BarMtr ;
   private java.math.BigDecimal[] P093919_A166BarKgm ;
   private int[] P093919_A129BarCod ;
   private byte[] P093919_A132BarCodReo ;
   private String[] P093919_A130BarCodPar ;
   private String[] P093919_A758ProCod ;
   private java.util.Date[] P093928_A159BarFecGen ;
   private String[] P093928_A457FasCod ;
   private String[] P093928_A396EmprCod ;
   private short[] P093928_A4466BarAcaAnh ;
   private String[] P093928_A1798BarDibCli ;
   private short[] P093928_A194BarOrdLin ;
   private String[] P093928_A1234BarNomCli ;
   private byte[] P093928_A218BarTipCol ;
   private int[] P093928_A136BarColNum ;
   private String[] P093928_A135BarColNom ;
   private String[] P093928_A1652BarSerDsc ;
   private String[] P093928_A212BarSer ;
   private byte[] P093928_A213BarSit ;
   private String[] P093928_A13696BarNHdr ;
   private String[] P093928_A279CliNom ;
   private int[] P093928_A252CliCod ;
   private boolean[] P093928_n252CliCod ;
   private byte[] P093928_A153BarFasEst ;
   private String[] P093928_A603MaqCodBis ;
   private String[] P093928_A1955BarFasSig ;
   private boolean[] P093928_n1955BarFasSig ;
   private short[] P093928_A154BarFasLin ;
   private boolean[] P093928_n154BarFasLin ;
   private String[] P093928_A151BarFasCod ;
   private boolean[] P093928_n151BarFasCod ;
   private java.math.BigDecimal[] P093928_A184BarMtr ;
   private java.math.BigDecimal[] P093928_A166BarKgm ;
   private int[] P093928_A129BarCod ;
   private byte[] P093928_A132BarCodReo ;
   private String[] P093928_A130BarCodPar ;
   private String[] P093928_A758ProCod ;
   private String[] P093937_A396EmprCod ;
   private String[] P093937_A457FasCod ;
   private String[] P093937_A212BarSer ;
   private java.util.Date[] P093937_A159BarFecGen ;
   private short[] P093937_A4466BarAcaAnh ;
   private String[] P093937_A1798BarDibCli ;
   private short[] P093937_A194BarOrdLin ;
   private String[] P093937_A1234BarNomCli ;
   private byte[] P093937_A218BarTipCol ;
   private int[] P093937_A136BarColNum ;
   private String[] P093937_A135BarColNom ;
   private String[] P093937_A1652BarSerDsc ;
   private byte[] P093937_A213BarSit ;
   private String[] P093937_A13696BarNHdr ;
   private String[] P093937_A279CliNom ;
   private int[] P093937_A252CliCod ;
   private boolean[] P093937_n252CliCod ;
   private byte[] P093937_A153BarFasEst ;
   private String[] P093937_A603MaqCodBis ;
   private String[] P093937_A1955BarFasSig ;
   private boolean[] P093937_n1955BarFasSig ;
   private short[] P093937_A154BarFasLin ;
   private boolean[] P093937_n154BarFasLin ;
   private String[] P093937_A151BarFasCod ;
   private boolean[] P093937_n151BarFasCod ;
   private java.math.BigDecimal[] P093937_A184BarMtr ;
   private java.math.BigDecimal[] P093937_A166BarKgm ;
   private int[] P093937_A129BarCod ;
   private byte[] P093937_A132BarCodReo ;
   private String[] P093937_A130BarCodPar ;
   private String[] P093937_A758ProCod ;
   private String[] P093946_A396EmprCod ;
   private String[] P093946_A457FasCod ;
   private String[] P093946_A1652BarSerDsc ;
   private java.util.Date[] P093946_A159BarFecGen ;
   private short[] P093946_A4466BarAcaAnh ;
   private String[] P093946_A1798BarDibCli ;
   private short[] P093946_A194BarOrdLin ;
   private String[] P093946_A1234BarNomCli ;
   private byte[] P093946_A218BarTipCol ;
   private int[] P093946_A136BarColNum ;
   private String[] P093946_A135BarColNom ;
   private String[] P093946_A212BarSer ;
   private byte[] P093946_A213BarSit ;
   private String[] P093946_A13696BarNHdr ;
   private String[] P093946_A279CliNom ;
   private int[] P093946_A252CliCod ;
   private boolean[] P093946_n252CliCod ;
   private byte[] P093946_A153BarFasEst ;
   private String[] P093946_A603MaqCodBis ;
   private String[] P093946_A1955BarFasSig ;
   private boolean[] P093946_n1955BarFasSig ;
   private short[] P093946_A154BarFasLin ;
   private boolean[] P093946_n154BarFasLin ;
   private String[] P093946_A151BarFasCod ;
   private boolean[] P093946_n151BarFasCod ;
   private java.math.BigDecimal[] P093946_A184BarMtr ;
   private java.math.BigDecimal[] P093946_A166BarKgm ;
   private int[] P093946_A129BarCod ;
   private byte[] P093946_A132BarCodReo ;
   private String[] P093946_A130BarCodPar ;
   private String[] P093946_A758ProCod ;
   private String[] P093955_A396EmprCod ;
   private String[] P093955_A457FasCod ;
   private String[] P093955_A135BarColNom ;
   private java.util.Date[] P093955_A159BarFecGen ;
   private short[] P093955_A4466BarAcaAnh ;
   private String[] P093955_A1798BarDibCli ;
   private short[] P093955_A194BarOrdLin ;
   private String[] P093955_A1234BarNomCli ;
   private byte[] P093955_A218BarTipCol ;
   private int[] P093955_A136BarColNum ;
   private String[] P093955_A1652BarSerDsc ;
   private String[] P093955_A212BarSer ;
   private byte[] P093955_A213BarSit ;
   private String[] P093955_A13696BarNHdr ;
   private String[] P093955_A279CliNom ;
   private int[] P093955_A252CliCod ;
   private boolean[] P093955_n252CliCod ;
   private byte[] P093955_A153BarFasEst ;
   private String[] P093955_A603MaqCodBis ;
   private String[] P093955_A1955BarFasSig ;
   private boolean[] P093955_n1955BarFasSig ;
   private short[] P093955_A154BarFasLin ;
   private boolean[] P093955_n154BarFasLin ;
   private String[] P093955_A151BarFasCod ;
   private boolean[] P093955_n151BarFasCod ;
   private java.math.BigDecimal[] P093955_A184BarMtr ;
   private java.math.BigDecimal[] P093955_A166BarKgm ;
   private int[] P093955_A129BarCod ;
   private byte[] P093955_A132BarCodReo ;
   private String[] P093955_A130BarCodPar ;
   private String[] P093955_A758ProCod ;
   private String[] P093964_A396EmprCod ;
   private String[] P093964_A457FasCod ;
   private String[] P093964_A1234BarNomCli ;
   private java.util.Date[] P093964_A159BarFecGen ;
   private short[] P093964_A4466BarAcaAnh ;
   private String[] P093964_A1798BarDibCli ;
   private short[] P093964_A194BarOrdLin ;
   private byte[] P093964_A218BarTipCol ;
   private int[] P093964_A136BarColNum ;
   private String[] P093964_A135BarColNom ;
   private String[] P093964_A1652BarSerDsc ;
   private String[] P093964_A212BarSer ;
   private byte[] P093964_A213BarSit ;
   private String[] P093964_A13696BarNHdr ;
   private String[] P093964_A279CliNom ;
   private int[] P093964_A252CliCod ;
   private boolean[] P093964_n252CliCod ;
   private byte[] P093964_A153BarFasEst ;
   private String[] P093964_A603MaqCodBis ;
   private String[] P093964_A1955BarFasSig ;
   private boolean[] P093964_n1955BarFasSig ;
   private short[] P093964_A154BarFasLin ;
   private boolean[] P093964_n154BarFasLin ;
   private String[] P093964_A151BarFasCod ;
   private boolean[] P093964_n151BarFasCod ;
   private java.math.BigDecimal[] P093964_A184BarMtr ;
   private java.math.BigDecimal[] P093964_A166BarKgm ;
   private int[] P093964_A129BarCod ;
   private byte[] P093964_A132BarCodReo ;
   private String[] P093964_A130BarCodPar ;
   private String[] P093964_A758ProCod ;
   private java.util.Date[] P093973_A159BarFecGen ;
   private String[] P093973_A457FasCod ;
   private String[] P093973_A396EmprCod ;
   private short[] P093973_A4466BarAcaAnh ;
   private String[] P093973_A1798BarDibCli ;
   private short[] P093973_A194BarOrdLin ;
   private String[] P093973_A1234BarNomCli ;
   private byte[] P093973_A218BarTipCol ;
   private int[] P093973_A136BarColNum ;
   private String[] P093973_A135BarColNom ;
   private String[] P093973_A1652BarSerDsc ;
   private String[] P093973_A212BarSer ;
   private byte[] P093973_A213BarSit ;
   private String[] P093973_A13696BarNHdr ;
   private String[] P093973_A279CliNom ;
   private int[] P093973_A252CliCod ;
   private boolean[] P093973_n252CliCod ;
   private byte[] P093973_A153BarFasEst ;
   private String[] P093973_A603MaqCodBis ;
   private String[] P093973_A1955BarFasSig ;
   private boolean[] P093973_n1955BarFasSig ;
   private short[] P093973_A154BarFasLin ;
   private boolean[] P093973_n154BarFasLin ;
   private String[] P093973_A151BarFasCod ;
   private boolean[] P093973_n151BarFasCod ;
   private java.math.BigDecimal[] P093973_A184BarMtr ;
   private java.math.BigDecimal[] P093973_A166BarKgm ;
   private int[] P093973_A129BarCod ;
   private byte[] P093973_A132BarCodReo ;
   private String[] P093973_A130BarCodPar ;
   private String[] P093973_A758ProCod ;
   private java.util.Date[] P093982_A159BarFecGen ;
   private String[] P093982_A457FasCod ;
   private String[] P093982_A396EmprCod ;
   private short[] P093982_A4466BarAcaAnh ;
   private String[] P093982_A1798BarDibCli ;
   private short[] P093982_A194BarOrdLin ;
   private String[] P093982_A1234BarNomCli ;
   private byte[] P093982_A218BarTipCol ;
   private int[] P093982_A136BarColNum ;
   private String[] P093982_A135BarColNom ;
   private String[] P093982_A1652BarSerDsc ;
   private String[] P093982_A212BarSer ;
   private byte[] P093982_A213BarSit ;
   private String[] P093982_A13696BarNHdr ;
   private String[] P093982_A279CliNom ;
   private int[] P093982_A252CliCod ;
   private boolean[] P093982_n252CliCod ;
   private byte[] P093982_A153BarFasEst ;
   private String[] P093982_A603MaqCodBis ;
   private String[] P093982_A1955BarFasSig ;
   private boolean[] P093982_n1955BarFasSig ;
   private short[] P093982_A154BarFasLin ;
   private boolean[] P093982_n154BarFasLin ;
   private String[] P093982_A151BarFasCod ;
   private boolean[] P093982_n151BarFasCod ;
   private java.math.BigDecimal[] P093982_A184BarMtr ;
   private java.math.BigDecimal[] P093982_A166BarKgm ;
   private int[] P093982_A129BarCod ;
   private byte[] P093982_A132BarCodReo ;
   private String[] P093982_A130BarCodPar ;
   private String[] P093982_A758ProCod ;
   private String[] P093991_A396EmprCod ;
   private String[] P093991_A457FasCod ;
   private String[] P093991_A1798BarDibCli ;
   private java.util.Date[] P093991_A159BarFecGen ;
   private short[] P093991_A4466BarAcaAnh ;
   private short[] P093991_A194BarOrdLin ;
   private String[] P093991_A1234BarNomCli ;
   private byte[] P093991_A218BarTipCol ;
   private int[] P093991_A136BarColNum ;
   private String[] P093991_A135BarColNom ;
   private String[] P093991_A1652BarSerDsc ;
   private String[] P093991_A212BarSer ;
   private byte[] P093991_A213BarSit ;
   private String[] P093991_A13696BarNHdr ;
   private String[] P093991_A279CliNom ;
   private int[] P093991_A252CliCod ;
   private boolean[] P093991_n252CliCod ;
   private byte[] P093991_A153BarFasEst ;
   private String[] P093991_A603MaqCodBis ;
   private String[] P093991_A1955BarFasSig ;
   private boolean[] P093991_n1955BarFasSig ;
   private short[] P093991_A154BarFasLin ;
   private boolean[] P093991_n154BarFasLin ;
   private String[] P093991_A151BarFasCod ;
   private boolean[] P093991_n151BarFasCod ;
   private java.math.BigDecimal[] P093991_A184BarMtr ;
   private java.math.BigDecimal[] P093991_A166BarKgm ;
   private int[] P093991_A129BarCod ;
   private byte[] P093991_A132BarCodReo ;
   private String[] P093991_A130BarCodPar ;
   private String[] P093991_A758ProCod ;
   private GXSimpleCollection<String> AV53Options ;
   private GXSimpleCollection<String> AV56OptionsDesc ;
   private GXSimpleCollection<String> AV58OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV63GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV64GridStateFilterValue ;
}

final  class cargasproduccionporfase_wcgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P093910( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           byte A153BarFasEst ,
                                           GXSimpleCollection<Byte> AV11TFBarFasEst_Sels ,
                                           String AV81TFMaqCodBis_Sel ,
                                           String AV80TFMaqCodBis ,
                                           int AV11TFBarFasEst_Sels_size ,
                                           int AV12TFCliCod ,
                                           int AV13TFCliCod_To ,
                                           String AV15TFCliNom_Sel ,
                                           String AV14TFCliNom ,
                                           String AV19TFBarNHdr_Sel ,
                                           String AV18TFBarNHdr ,
                                           byte AV20TFBarSit ,
                                           byte AV21TFBarSit_To ,
                                           String AV23TFBarSer_Sel ,
                                           String AV22TFBarSer ,
                                           String AV25TFBarSerDsc_Sel ,
                                           String AV24TFBarSerDsc ,
                                           String AV27TFBarColNom_Sel ,
                                           String AV26TFBarColNom ,
                                           int AV28TFBarColNum ,
                                           int AV29TFBarColNum_To ,
                                           byte AV30TFBarTipCol ,
                                           byte AV31TFBarTipCol_To ,
                                           String AV33TFBarNomCli_Sel ,
                                           String AV32TFBarNomCli ,
                                           java.math.BigDecimal AV34TFBarKgm ,
                                           java.math.BigDecimal AV35TFBarKgm_To ,
                                           java.math.BigDecimal AV36TFBarMtr ,
                                           java.math.BigDecimal AV37TFBarMtr_To ,
                                           short AV44TFBarOrdLin ,
                                           short AV45TFBarOrdLin_To ,
                                           String AV87TFBarDibCli_Sel ,
                                           String AV86TFBarDibCli ,
                                           short AV46TFBarAcaAnh ,
                                           short AV47TFBarAcaAnh_To ,
                                           String A603MaqCodBis ,
                                           int A252CliCod ,
                                           String A279CliNom ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           byte A213BarSit ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           byte A218BarTipCol ,
                                           String A1234BarNomCli ,
                                           java.math.BigDecimal A166BarKgm ,
                                           java.math.BigDecimal A184BarMtr ,
                                           short A194BarOrdLin ,
                                           String A1798BarDibCli ,
                                           short A4466BarAcaAnh ,
                                           String AV66FilterFullText ,
                                           String A13696BarNHdr ,
                                           String A151BarFasCod ,
                                           short A154BarFasLin ,
                                           String A1955BarFasSig ,
                                           String AV39TFBarFasCod_Sel ,
                                           String AV38TFBarFasCod ,
                                           short AV40TFBarFasLin ,
                                           short AV41TFBarFasLin_To ,
                                           String AV43TFBarFasSig_Sel ,
                                           String AV42TFBarFasSig ,
                                           int AV68Clicod ,
                                           int AV69Clicod_to ,
                                           java.util.Date A159BarFecGen ,
                                           java.util.Date AV70BarFecgen ,
                                           java.util.Date AV71BarFecGen_to ,
                                           byte AV72BarSIt ,
                                           byte AV73Barsit_to ,
                                           byte AV74BarfasEst ,
                                           byte AV75BarFasEst_to ,
                                           short AV76BarAcaAnh ,
                                           String A457FasCod ,
                                           String AV77Fascod ,
                                           String AV67Emprcod ,
                                           String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[79];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.MaqCodBis, T2.BarFecGen, T1.FasCod, T2.BarAcaAnh, T2.BarDibCli, T1.BarOrdLin, T2.BarNomCli, T2.BarTipCol, T2.BarColNum, T2.BarColNom, T2.BarSerDsc," ;
      scmdbuf += " T2.BarSer, T2.BarSit, RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCodReo,'90'), 2))) || T2.BarCodPar AS BarNHdr," ;
      scmdbuf += " T3.CliNom, T2.CliCod, T1.BarFasEst, COALESCE( T4.BarFasSig, ' ') AS BarFasSig, COALESCE( T5.BarFasLin, 0) AS BarFasLin, COALESCE( T6.BarFasSig, ' ') AS BarFasCod," ;
      scmdbuf += " COALESCE( T7.BarMtr, 0) AS BarMtr, COALESCE( T7.BarKgm, 0) AS BarKgm, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod FROM ((((((TXPBARFAS T1 INNER JOIN TXPBARCAD" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod =" ;
      scmdbuf += " T1.EmprCod AND T3.CliCod = T2.CliCod) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasSig, COALESCE( T9.BarFasLin, 0) AS BarFasLin, T8.EmprCod, T8.BarCod, T8.BarCodReo," ;
      scmdbuf += " T8.BarCodPar FROM ((TXPBARFAS T8 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP" ;
      scmdbuf += " BY EmprCod, BarCod, BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar)" ;
      scmdbuf += " INNER JOIN (SELECT MIN(T11.BarOrdLin) AS GXC1, COALESCE( T12.BarFasLin, 0) AS BarFasLin, T11.EmprCod, T11.BarCod, T11.BarCodReo, T11.BarCodPar FROM (TXPBARFAS T11" ;
      scmdbuf += " LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      scmdbuf += " ) T12 ON T12.EmprCod = T11.EmprCod AND T12.BarCod = T11.BarCod AND T12.BarCodReo = T11.BarCodReo AND T12.BarCodPar = T11.BarCodPar) WHERE (T11.BarOrdLin >= 0) AND" ;
      scmdbuf += " (T11.BarOrdLin > COALESCE( T12.BarFasLin, 0)) AND (T11.BarFasEst = 0) GROUP BY T12.BarFasLin, T11.EmprCod, T11.BarCod, T11.BarCodReo, T11.BarCodPar ) T10 ON T10.EmprCod" ;
      scmdbuf += " = T8.EmprCod AND T10.BarCod = T8.BarCod AND T10.BarCodReo = T8.BarCodReo AND T10.BarCodPar = T8.BarCodPar) WHERE (T8.BarOrdLin = T10.GXC1) AND (T8.BarOrdLin >=" ;
      scmdbuf += " 0) AND (T8.BarOrdLin > COALESCE( T9.BarFasLin, 0)) AND (T8.BarFasEst = 0) GROUP BY T9.BarFasLin, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T4 ON T4.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod," ;
      scmdbuf += " BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod =" ;
      scmdbuf += " T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasSig, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar" ;
      scmdbuf += " FROM (TXPBARFAS T8 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC2, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod," ;
      scmdbuf += " BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) WHERE (T8.BarOrdLin" ;
      scmdbuf += " = T9.GXC2) AND (T8.BarFasEst <> 0) GROUP BY T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo" ;
      scmdbuf += " = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm FROM" ;
      scmdbuf += " TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod = T1.EmprCod AND T7.BarCod = T1.BarCod AND T7.BarCodReo = T1.BarCodReo AND T7.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(T1.MaqCodBis) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarFasEst,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCodReo,'90'), 2))) || T2.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarSit,'90'), 2) like '%' || ?) or ( UPPER(T2.BarSer) like '%' || UPPER(?)) or ( UPPER(T2.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T2.BarColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.BarTipCol,'90'), 2) like '%' || ?) or ( UPPER(T2.BarNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T7.BarKgm, 0),'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T7.BarMtr, 0),'999990.99'), 2) like '%' || ?) or ( UPPER(COALESCE( T6.BarFasSig, ' ')) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T5.BarFasLin, 0),'9990'), 2) like '%' || ?) or ( UPPER(COALESCE( T4.BarFasSig, ' ')) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarOrdLin,'9990'), 2) like '%' || ?) or ( UPPER(T2.BarDibCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarAcaAnh,'9990'), 2) like '%' || ?)))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T6.BarFasSig, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.BarFasSig, ' ') = ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T5.BarFasLin, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T5.BarFasLin, 0) <= ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.BarFasSig, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.BarFasSig, ' ') = ?))");
      addWhere(sWhereString, "(T2.CliCod >= ?)");
      addWhere(sWhereString, "(T2.CliCod <= ?)");
      addWhere(sWhereString, "(T2.BarFecGen >= ?)");
      addWhere(sWhereString, "(T2.BarFecGen <= ?)");
      addWhere(sWhereString, "(T2.BarSit >= ?)");
      addWhere(sWhereString, "(T2.BarSit <= ?)");
      addWhere(sWhereString, "(T1.BarFasEst >= ?)");
      addWhere(sWhereString, "(T1.BarFasEst <= ?)");
      addWhere(sWhereString, "(T2.BarAcaAnh = ? or (? = 0))");
      addWhere(sWhereString, "(T1.FasCod = ?)");
      if ( (GXutil.strcmp("", AV81TFMaqCodBis_Sel)==0) && ( ! (GXutil.strcmp("", AV80TFMaqCodBis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81TFMaqCodBis_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int2[48] = (byte)(1) ;
      }
      if ( AV11TFBarFasEst_Sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV11TFBarFasEst_Sels, "T1.BarFasEst IN (", ")")+")");
      }
      if ( ! (0==AV12TFCliCod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int2[49] = (byte)(1) ;
      }
      if ( ! (0==AV13TFCliCod_To) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int2[50] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV15TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV14TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[51] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV15TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int2[52] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV19TFBarNHdr_Sel)==0) && ( ! (GXutil.strcmp("", AV18TFBarNHdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[53] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV19TFBarNHdr_Sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int2[54] = (byte)(1) ;
      }
      if ( ! (0==AV20TFBarSit) )
      {
         addWhere(sWhereString, "(T2.BarSit >= ?)");
      }
      else
      {
         GXv_int2[55] = (byte)(1) ;
      }
      if ( ! (0==AV21TFBarSit_To) )
      {
         addWhere(sWhereString, "(T2.BarSit <= ?)");
      }
      else
      {
         GXv_int2[56] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV23TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV22TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[57] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV23TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int2[58] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV25TFBarSerDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV24TFBarSerDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[59] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV25TFBarSerDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int2[60] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV27TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV26TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[61] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV27TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int2[62] = (byte)(1) ;
      }
      if ( ! (0==AV28TFBarColNum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int2[63] = (byte)(1) ;
      }
      if ( ! (0==AV29TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int2[64] = (byte)(1) ;
      }
      if ( ! (0==AV30TFBarTipCol) )
      {
         addWhere(sWhereString, "(T2.BarTipCol >= ?)");
      }
      else
      {
         GXv_int2[65] = (byte)(1) ;
      }
      if ( ! (0==AV31TFBarTipCol_To) )
      {
         addWhere(sWhereString, "(T2.BarTipCol <= ?)");
      }
      else
      {
         GXv_int2[66] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV33TFBarNomCli_Sel)==0) && ( ! (GXutil.strcmp("", AV32TFBarNomCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[67] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV33TFBarNomCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int2[68] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV34TFBarKgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int2[69] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV35TFBarKgm_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int2[70] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV36TFBarMtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int2[71] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV37TFBarMtr_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int2[72] = (byte)(1) ;
      }
      if ( ! (0==AV44TFBarOrdLin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int2[73] = (byte)(1) ;
      }
      if ( ! (0==AV45TFBarOrdLin_To) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int2[74] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87TFBarDibCli_Sel)==0) && ( ! (GXutil.strcmp("", AV86TFBarDibCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarDibCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[75] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87TFBarDibCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarDibCli = ?)");
      }
      else
      {
         GXv_int2[76] = (byte)(1) ;
      }
      if ( ! (0==AV46TFBarAcaAnh) )
      {
         addWhere(sWhereString, "(T2.BarAcaAnh >= ?)");
      }
      else
      {
         GXv_int2[77] = (byte)(1) ;
      }
      if ( ! (0==AV47TFBarAcaAnh_To) )
      {
         addWhere(sWhereString, "(T2.BarAcaAnh <= ?)");
      }
      else
      {
         GXv_int2[78] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.MaqCodBis" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P093919( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           byte A153BarFasEst ,
                                           GXSimpleCollection<Byte> AV11TFBarFasEst_Sels ,
                                           String AV81TFMaqCodBis_Sel ,
                                           String AV80TFMaqCodBis ,
                                           int AV11TFBarFasEst_Sels_size ,
                                           int AV12TFCliCod ,
                                           int AV13TFCliCod_To ,
                                           String AV15TFCliNom_Sel ,
                                           String AV14TFCliNom ,
                                           String AV19TFBarNHdr_Sel ,
                                           String AV18TFBarNHdr ,
                                           byte AV20TFBarSit ,
                                           byte AV21TFBarSit_To ,
                                           String AV23TFBarSer_Sel ,
                                           String AV22TFBarSer ,
                                           String AV25TFBarSerDsc_Sel ,
                                           String AV24TFBarSerDsc ,
                                           String AV27TFBarColNom_Sel ,
                                           String AV26TFBarColNom ,
                                           int AV28TFBarColNum ,
                                           int AV29TFBarColNum_To ,
                                           byte AV30TFBarTipCol ,
                                           byte AV31TFBarTipCol_To ,
                                           String AV33TFBarNomCli_Sel ,
                                           String AV32TFBarNomCli ,
                                           java.math.BigDecimal AV34TFBarKgm ,
                                           java.math.BigDecimal AV35TFBarKgm_To ,
                                           java.math.BigDecimal AV36TFBarMtr ,
                                           java.math.BigDecimal AV37TFBarMtr_To ,
                                           short AV44TFBarOrdLin ,
                                           short AV45TFBarOrdLin_To ,
                                           String AV87TFBarDibCli_Sel ,
                                           String AV86TFBarDibCli ,
                                           short AV46TFBarAcaAnh ,
                                           short AV47TFBarAcaAnh_To ,
                                           String A603MaqCodBis ,
                                           int A252CliCod ,
                                           String A279CliNom ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           byte A213BarSit ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           byte A218BarTipCol ,
                                           String A1234BarNomCli ,
                                           java.math.BigDecimal A166BarKgm ,
                                           java.math.BigDecimal A184BarMtr ,
                                           short A194BarOrdLin ,
                                           String A1798BarDibCli ,
                                           short A4466BarAcaAnh ,
                                           String AV66FilterFullText ,
                                           String A13696BarNHdr ,
                                           String A151BarFasCod ,
                                           short A154BarFasLin ,
                                           String A1955BarFasSig ,
                                           String AV39TFBarFasCod_Sel ,
                                           String AV38TFBarFasCod ,
                                           short AV40TFBarFasLin ,
                                           short AV41TFBarFasLin_To ,
                                           String AV43TFBarFasSig_Sel ,
                                           String AV42TFBarFasSig ,
                                           int AV68Clicod ,
                                           int AV69Clicod_to ,
                                           java.util.Date A159BarFecGen ,
                                           java.util.Date AV70BarFecgen ,
                                           java.util.Date AV71BarFecGen_to ,
                                           byte AV72BarSIt ,
                                           byte AV73Barsit_to ,
                                           byte AV74BarfasEst ,
                                           byte AV75BarFasEst_to ,
                                           short AV76BarAcaAnh ,
                                           String A396EmprCod ,
                                           String AV67Emprcod ,
                                           String A457FasCod ,
                                           String AV77Fascod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[79];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.FasCod, T3.CliNom, T2.BarFecGen, T2.BarAcaAnh, T2.BarDibCli, T1.BarOrdLin, T2.BarNomCli, T2.BarTipCol, T2.BarColNum, T2.BarColNom, T2.BarSerDsc," ;
      scmdbuf += " T2.BarSer, T2.BarSit, RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCodReo,'90'), 2))) || T2.BarCodPar AS BarNHdr," ;
      scmdbuf += " T2.CliCod, T1.BarFasEst, T1.MaqCodBis, COALESCE( T4.BarFasSig, ' ') AS BarFasSig, COALESCE( T5.BarFasLin, 0) AS BarFasLin, COALESCE( T6.BarFasSig, ' ') AS BarFasCod," ;
      scmdbuf += " COALESCE( T7.BarMtr, 0) AS BarMtr, COALESCE( T7.BarKgm, 0) AS BarKgm, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod FROM ((((((TXPBARFAS T1 INNER JOIN TXPBARCAD" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod =" ;
      scmdbuf += " T1.EmprCod AND T3.CliCod = T2.CliCod) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasSig, COALESCE( T9.BarFasLin, 0) AS BarFasLin, T8.EmprCod, T8.BarCod, T8.BarCodReo," ;
      scmdbuf += " T8.BarCodPar FROM ((TXPBARFAS T8 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP" ;
      scmdbuf += " BY EmprCod, BarCod, BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar)" ;
      scmdbuf += " INNER JOIN (SELECT MIN(T11.BarOrdLin) AS GXC1, COALESCE( T12.BarFasLin, 0) AS BarFasLin, T11.EmprCod, T11.BarCod, T11.BarCodReo, T11.BarCodPar FROM (TXPBARFAS T11" ;
      scmdbuf += " LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      scmdbuf += " ) T12 ON T12.EmprCod = T11.EmprCod AND T12.BarCod = T11.BarCod AND T12.BarCodReo = T11.BarCodReo AND T12.BarCodPar = T11.BarCodPar) WHERE (T11.BarOrdLin >= 0) AND" ;
      scmdbuf += " (T11.BarOrdLin > COALESCE( T12.BarFasLin, 0)) AND (T11.BarFasEst = 0) GROUP BY T12.BarFasLin, T11.EmprCod, T11.BarCod, T11.BarCodReo, T11.BarCodPar ) T10 ON T10.EmprCod" ;
      scmdbuf += " = T8.EmprCod AND T10.BarCod = T8.BarCod AND T10.BarCodReo = T8.BarCodReo AND T10.BarCodPar = T8.BarCodPar) WHERE (T8.BarOrdLin = T10.GXC1) AND (T8.BarOrdLin >=" ;
      scmdbuf += " 0) AND (T8.BarOrdLin > COALESCE( T9.BarFasLin, 0)) AND (T8.BarFasEst = 0) GROUP BY T9.BarFasLin, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T4 ON T4.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod," ;
      scmdbuf += " BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod =" ;
      scmdbuf += " T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasSig, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar" ;
      scmdbuf += " FROM (TXPBARFAS T8 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC2, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod," ;
      scmdbuf += " BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) WHERE (T8.BarOrdLin" ;
      scmdbuf += " = T9.GXC2) AND (T8.BarFasEst <> 0) GROUP BY T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo" ;
      scmdbuf += " = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm FROM" ;
      scmdbuf += " TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod = T1.EmprCod AND T7.BarCod = T1.BarCod AND T7.BarCodReo = T1.BarCodReo AND T7.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(T1.MaqCodBis) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarFasEst,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCodReo,'90'), 2))) || T2.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarSit,'90'), 2) like '%' || ?) or ( UPPER(T2.BarSer) like '%' || UPPER(?)) or ( UPPER(T2.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T2.BarColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.BarTipCol,'90'), 2) like '%' || ?) or ( UPPER(T2.BarNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T7.BarKgm, 0),'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T7.BarMtr, 0),'999990.99'), 2) like '%' || ?) or ( UPPER(COALESCE( T6.BarFasSig, ' ')) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T5.BarFasLin, 0),'9990'), 2) like '%' || ?) or ( UPPER(COALESCE( T4.BarFasSig, ' ')) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarOrdLin,'9990'), 2) like '%' || ?) or ( UPPER(T2.BarDibCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarAcaAnh,'9990'), 2) like '%' || ?)))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T6.BarFasSig, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.BarFasSig, ' ') = ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T5.BarFasLin, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T5.BarFasLin, 0) <= ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.BarFasSig, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.BarFasSig, ' ') = ?))");
      addWhere(sWhereString, "(T2.CliCod >= ?)");
      addWhere(sWhereString, "(T2.CliCod <= ?)");
      addWhere(sWhereString, "(T2.BarFecGen >= ?)");
      addWhere(sWhereString, "(T2.BarFecGen <= ?)");
      addWhere(sWhereString, "(T2.BarSit >= ?)");
      addWhere(sWhereString, "(T2.BarSit <= ?)");
      addWhere(sWhereString, "(T1.BarFasEst >= ?)");
      addWhere(sWhereString, "(T1.BarFasEst <= ?)");
      addWhere(sWhereString, "(T2.BarAcaAnh = ? or (? = 0))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.FasCod = ?)");
      if ( (GXutil.strcmp("", AV81TFMaqCodBis_Sel)==0) && ( ! (GXutil.strcmp("", AV80TFMaqCodBis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81TFMaqCodBis_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int5[48] = (byte)(1) ;
      }
      if ( AV11TFBarFasEst_Sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV11TFBarFasEst_Sels, "T1.BarFasEst IN (", ")")+")");
      }
      if ( ! (0==AV12TFCliCod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int5[49] = (byte)(1) ;
      }
      if ( ! (0==AV13TFCliCod_To) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int5[50] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV15TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV14TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[51] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV15TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int5[52] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV19TFBarNHdr_Sel)==0) && ( ! (GXutil.strcmp("", AV18TFBarNHdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[53] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV19TFBarNHdr_Sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int5[54] = (byte)(1) ;
      }
      if ( ! (0==AV20TFBarSit) )
      {
         addWhere(sWhereString, "(T2.BarSit >= ?)");
      }
      else
      {
         GXv_int5[55] = (byte)(1) ;
      }
      if ( ! (0==AV21TFBarSit_To) )
      {
         addWhere(sWhereString, "(T2.BarSit <= ?)");
      }
      else
      {
         GXv_int5[56] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV23TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV22TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[57] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV23TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int5[58] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV25TFBarSerDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV24TFBarSerDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[59] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV25TFBarSerDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int5[60] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV27TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV26TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[61] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV27TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int5[62] = (byte)(1) ;
      }
      if ( ! (0==AV28TFBarColNum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int5[63] = (byte)(1) ;
      }
      if ( ! (0==AV29TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int5[64] = (byte)(1) ;
      }
      if ( ! (0==AV30TFBarTipCol) )
      {
         addWhere(sWhereString, "(T2.BarTipCol >= ?)");
      }
      else
      {
         GXv_int5[65] = (byte)(1) ;
      }
      if ( ! (0==AV31TFBarTipCol_To) )
      {
         addWhere(sWhereString, "(T2.BarTipCol <= ?)");
      }
      else
      {
         GXv_int5[66] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV33TFBarNomCli_Sel)==0) && ( ! (GXutil.strcmp("", AV32TFBarNomCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[67] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV33TFBarNomCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int5[68] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV34TFBarKgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int5[69] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV35TFBarKgm_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int5[70] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV36TFBarMtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int5[71] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV37TFBarMtr_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int5[72] = (byte)(1) ;
      }
      if ( ! (0==AV44TFBarOrdLin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int5[73] = (byte)(1) ;
      }
      if ( ! (0==AV45TFBarOrdLin_To) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int5[74] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87TFBarDibCli_Sel)==0) && ( ! (GXutil.strcmp("", AV86TFBarDibCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarDibCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[75] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87TFBarDibCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarDibCli = ?)");
      }
      else
      {
         GXv_int5[76] = (byte)(1) ;
      }
      if ( ! (0==AV46TFBarAcaAnh) )
      {
         addWhere(sWhereString, "(T2.BarAcaAnh >= ?)");
      }
      else
      {
         GXv_int5[77] = (byte)(1) ;
      }
      if ( ! (0==AV47TFBarAcaAnh_To) )
      {
         addWhere(sWhereString, "(T2.BarAcaAnh <= ?)");
      }
      else
      {
         GXv_int5[78] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T3.CliNom" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   protected Object[] conditional_P093928( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           byte A153BarFasEst ,
                                           GXSimpleCollection<Byte> AV11TFBarFasEst_Sels ,
                                           String AV81TFMaqCodBis_Sel ,
                                           String AV80TFMaqCodBis ,
                                           int AV11TFBarFasEst_Sels_size ,
                                           int AV12TFCliCod ,
                                           int AV13TFCliCod_To ,
                                           String AV15TFCliNom_Sel ,
                                           String AV14TFCliNom ,
                                           String AV19TFBarNHdr_Sel ,
                                           String AV18TFBarNHdr ,
                                           byte AV20TFBarSit ,
                                           byte AV21TFBarSit_To ,
                                           String AV23TFBarSer_Sel ,
                                           String AV22TFBarSer ,
                                           String AV25TFBarSerDsc_Sel ,
                                           String AV24TFBarSerDsc ,
                                           String AV27TFBarColNom_Sel ,
                                           String AV26TFBarColNom ,
                                           int AV28TFBarColNum ,
                                           int AV29TFBarColNum_To ,
                                           byte AV30TFBarTipCol ,
                                           byte AV31TFBarTipCol_To ,
                                           String AV33TFBarNomCli_Sel ,
                                           String AV32TFBarNomCli ,
                                           java.math.BigDecimal AV34TFBarKgm ,
                                           java.math.BigDecimal AV35TFBarKgm_To ,
                                           java.math.BigDecimal AV36TFBarMtr ,
                                           java.math.BigDecimal AV37TFBarMtr_To ,
                                           short AV44TFBarOrdLin ,
                                           short AV45TFBarOrdLin_To ,
                                           String AV87TFBarDibCli_Sel ,
                                           String AV86TFBarDibCli ,
                                           short AV46TFBarAcaAnh ,
                                           short AV47TFBarAcaAnh_To ,
                                           String A603MaqCodBis ,
                                           int A252CliCod ,
                                           String A279CliNom ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           byte A213BarSit ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           byte A218BarTipCol ,
                                           String A1234BarNomCli ,
                                           java.math.BigDecimal A166BarKgm ,
                                           java.math.BigDecimal A184BarMtr ,
                                           short A194BarOrdLin ,
                                           String A1798BarDibCli ,
                                           short A4466BarAcaAnh ,
                                           String AV66FilterFullText ,
                                           String A13696BarNHdr ,
                                           String A151BarFasCod ,
                                           short A154BarFasLin ,
                                           String A1955BarFasSig ,
                                           String AV39TFBarFasCod_Sel ,
                                           String AV38TFBarFasCod ,
                                           short AV40TFBarFasLin ,
                                           short AV41TFBarFasLin_To ,
                                           String AV43TFBarFasSig_Sel ,
                                           String AV42TFBarFasSig ,
                                           int AV68Clicod ,
                                           int AV69Clicod_to ,
                                           java.util.Date A159BarFecGen ,
                                           java.util.Date AV70BarFecgen ,
                                           java.util.Date AV71BarFecGen_to ,
                                           byte AV72BarSIt ,
                                           byte AV73Barsit_to ,
                                           byte AV74BarfasEst ,
                                           byte AV75BarFasEst_to ,
                                           short AV76BarAcaAnh ,
                                           String AV67Emprcod ,
                                           String AV77Fascod ,
                                           String A396EmprCod ,
                                           String A457FasCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[79];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T2.BarFecGen, T1.FasCod, T1.EmprCod, T2.BarAcaAnh, T2.BarDibCli, T1.BarOrdLin, T2.BarNomCli, T2.BarTipCol, T2.BarColNum, T2.BarColNom, T2.BarSerDsc, T2.BarSer," ;
      scmdbuf += " T2.BarSit, RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCodReo,'90'), 2))) || T2.BarCodPar AS BarNHdr, T3.CliNom," ;
      scmdbuf += " T2.CliCod, T1.BarFasEst, T1.MaqCodBis, COALESCE( T4.BarFasSig, ' ') AS BarFasSig, COALESCE( T5.BarFasLin, 0) AS BarFasLin, COALESCE( T6.BarFasSig, ' ') AS BarFasCod," ;
      scmdbuf += " COALESCE( T7.BarMtr, 0) AS BarMtr, COALESCE( T7.BarKgm, 0) AS BarKgm, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod FROM ((((((TXPBARFAS T1 INNER JOIN TXPBARCAD" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod =" ;
      scmdbuf += " T1.EmprCod AND T3.CliCod = T2.CliCod) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasSig, COALESCE( T9.BarFasLin, 0) AS BarFasLin, T8.EmprCod, T8.BarCod, T8.BarCodReo," ;
      scmdbuf += " T8.BarCodPar FROM ((TXPBARFAS T8 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP" ;
      scmdbuf += " BY EmprCod, BarCod, BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar)" ;
      scmdbuf += " INNER JOIN (SELECT MIN(T11.BarOrdLin) AS GXC1, COALESCE( T12.BarFasLin, 0) AS BarFasLin, T11.EmprCod, T11.BarCod, T11.BarCodReo, T11.BarCodPar FROM (TXPBARFAS T11" ;
      scmdbuf += " LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      scmdbuf += " ) T12 ON T12.EmprCod = T11.EmprCod AND T12.BarCod = T11.BarCod AND T12.BarCodReo = T11.BarCodReo AND T12.BarCodPar = T11.BarCodPar) WHERE (T11.BarOrdLin >= 0) AND" ;
      scmdbuf += " (T11.BarOrdLin > COALESCE( T12.BarFasLin, 0)) AND (T11.BarFasEst = 0) GROUP BY T12.BarFasLin, T11.EmprCod, T11.BarCod, T11.BarCodReo, T11.BarCodPar ) T10 ON T10.EmprCod" ;
      scmdbuf += " = T8.EmprCod AND T10.BarCod = T8.BarCod AND T10.BarCodReo = T8.BarCodReo AND T10.BarCodPar = T8.BarCodPar) WHERE (T8.BarOrdLin = T10.GXC1) AND (T8.BarOrdLin >=" ;
      scmdbuf += " 0) AND (T8.BarOrdLin > COALESCE( T9.BarFasLin, 0)) AND (T8.BarFasEst = 0) GROUP BY T9.BarFasLin, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T4 ON T4.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod," ;
      scmdbuf += " BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod =" ;
      scmdbuf += " T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasSig, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar" ;
      scmdbuf += " FROM (TXPBARFAS T8 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC2, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod," ;
      scmdbuf += " BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) WHERE (T8.BarOrdLin" ;
      scmdbuf += " = T9.GXC2) AND (T8.BarFasEst <> 0) GROUP BY T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo" ;
      scmdbuf += " = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm FROM" ;
      scmdbuf += " TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod = T1.EmprCod AND T7.BarCod = T1.BarCod AND T7.BarCodReo = T1.BarCodReo AND T7.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.FasCod = ?)");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(T1.MaqCodBis) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarFasEst,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCodReo,'90'), 2))) || T2.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarSit,'90'), 2) like '%' || ?) or ( UPPER(T2.BarSer) like '%' || UPPER(?)) or ( UPPER(T2.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T2.BarColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.BarTipCol,'90'), 2) like '%' || ?) or ( UPPER(T2.BarNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T7.BarKgm, 0),'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T7.BarMtr, 0),'999990.99'), 2) like '%' || ?) or ( UPPER(COALESCE( T6.BarFasSig, ' ')) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T5.BarFasLin, 0),'9990'), 2) like '%' || ?) or ( UPPER(COALESCE( T4.BarFasSig, ' ')) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarOrdLin,'9990'), 2) like '%' || ?) or ( UPPER(T2.BarDibCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarAcaAnh,'9990'), 2) like '%' || ?)))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T6.BarFasSig, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.BarFasSig, ' ') = ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T5.BarFasLin, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T5.BarFasLin, 0) <= ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.BarFasSig, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.BarFasSig, ' ') = ?))");
      addWhere(sWhereString, "(T2.CliCod >= ?)");
      addWhere(sWhereString, "(T2.CliCod <= ?)");
      addWhere(sWhereString, "(T2.BarFecGen >= ?)");
      addWhere(sWhereString, "(T2.BarFecGen <= ?)");
      addWhere(sWhereString, "(T2.BarSit >= ?)");
      addWhere(sWhereString, "(T2.BarSit <= ?)");
      addWhere(sWhereString, "(T1.BarFasEst >= ?)");
      addWhere(sWhereString, "(T1.BarFasEst <= ?)");
      addWhere(sWhereString, "(T2.BarAcaAnh = ? or (? = 0))");
      if ( (GXutil.strcmp("", AV81TFMaqCodBis_Sel)==0) && ( ! (GXutil.strcmp("", AV80TFMaqCodBis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81TFMaqCodBis_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int8[48] = (byte)(1) ;
      }
      if ( AV11TFBarFasEst_Sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV11TFBarFasEst_Sels, "T1.BarFasEst IN (", ")")+")");
      }
      if ( ! (0==AV12TFCliCod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int8[49] = (byte)(1) ;
      }
      if ( ! (0==AV13TFCliCod_To) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int8[50] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV15TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV14TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[51] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV15TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int8[52] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV19TFBarNHdr_Sel)==0) && ( ! (GXutil.strcmp("", AV18TFBarNHdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[53] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV19TFBarNHdr_Sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int8[54] = (byte)(1) ;
      }
      if ( ! (0==AV20TFBarSit) )
      {
         addWhere(sWhereString, "(T2.BarSit >= ?)");
      }
      else
      {
         GXv_int8[55] = (byte)(1) ;
      }
      if ( ! (0==AV21TFBarSit_To) )
      {
         addWhere(sWhereString, "(T2.BarSit <= ?)");
      }
      else
      {
         GXv_int8[56] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV23TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV22TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[57] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV23TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int8[58] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV25TFBarSerDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV24TFBarSerDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[59] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV25TFBarSerDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int8[60] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV27TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV26TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[61] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV27TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int8[62] = (byte)(1) ;
      }
      if ( ! (0==AV28TFBarColNum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int8[63] = (byte)(1) ;
      }
      if ( ! (0==AV29TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int8[64] = (byte)(1) ;
      }
      if ( ! (0==AV30TFBarTipCol) )
      {
         addWhere(sWhereString, "(T2.BarTipCol >= ?)");
      }
      else
      {
         GXv_int8[65] = (byte)(1) ;
      }
      if ( ! (0==AV31TFBarTipCol_To) )
      {
         addWhere(sWhereString, "(T2.BarTipCol <= ?)");
      }
      else
      {
         GXv_int8[66] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV33TFBarNomCli_Sel)==0) && ( ! (GXutil.strcmp("", AV32TFBarNomCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[67] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV33TFBarNomCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int8[68] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV34TFBarKgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int8[69] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV35TFBarKgm_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int8[70] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV36TFBarMtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int8[71] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV37TFBarMtr_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int8[72] = (byte)(1) ;
      }
      if ( ! (0==AV44TFBarOrdLin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int8[73] = (byte)(1) ;
      }
      if ( ! (0==AV45TFBarOrdLin_To) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int8[74] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87TFBarDibCli_Sel)==0) && ( ! (GXutil.strcmp("", AV86TFBarDibCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarDibCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[75] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87TFBarDibCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarDibCli = ?)");
      }
      else
      {
         GXv_int8[76] = (byte)(1) ;
      }
      if ( ! (0==AV46TFBarAcaAnh) )
      {
         addWhere(sWhereString, "(T2.BarAcaAnh >= ?)");
      }
      else
      {
         GXv_int8[77] = (byte)(1) ;
      }
      if ( ! (0==AV47TFBarAcaAnh_To) )
      {
         addWhere(sWhereString, "(T2.BarAcaAnh <= ?)");
      }
      else
      {
         GXv_int8[78] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.FasCod" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P093937( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           byte A153BarFasEst ,
                                           GXSimpleCollection<Byte> AV11TFBarFasEst_Sels ,
                                           String AV81TFMaqCodBis_Sel ,
                                           String AV80TFMaqCodBis ,
                                           int AV11TFBarFasEst_Sels_size ,
                                           int AV12TFCliCod ,
                                           int AV13TFCliCod_To ,
                                           String AV15TFCliNom_Sel ,
                                           String AV14TFCliNom ,
                                           String AV19TFBarNHdr_Sel ,
                                           String AV18TFBarNHdr ,
                                           byte AV20TFBarSit ,
                                           byte AV21TFBarSit_To ,
                                           String AV23TFBarSer_Sel ,
                                           String AV22TFBarSer ,
                                           String AV25TFBarSerDsc_Sel ,
                                           String AV24TFBarSerDsc ,
                                           String AV27TFBarColNom_Sel ,
                                           String AV26TFBarColNom ,
                                           int AV28TFBarColNum ,
                                           int AV29TFBarColNum_To ,
                                           byte AV30TFBarTipCol ,
                                           byte AV31TFBarTipCol_To ,
                                           String AV33TFBarNomCli_Sel ,
                                           String AV32TFBarNomCli ,
                                           java.math.BigDecimal AV34TFBarKgm ,
                                           java.math.BigDecimal AV35TFBarKgm_To ,
                                           java.math.BigDecimal AV36TFBarMtr ,
                                           java.math.BigDecimal AV37TFBarMtr_To ,
                                           short AV44TFBarOrdLin ,
                                           short AV45TFBarOrdLin_To ,
                                           String AV87TFBarDibCli_Sel ,
                                           String AV86TFBarDibCli ,
                                           short AV46TFBarAcaAnh ,
                                           short AV47TFBarAcaAnh_To ,
                                           String A603MaqCodBis ,
                                           int A252CliCod ,
                                           String A279CliNom ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           byte A213BarSit ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           byte A218BarTipCol ,
                                           String A1234BarNomCli ,
                                           java.math.BigDecimal A166BarKgm ,
                                           java.math.BigDecimal A184BarMtr ,
                                           short A194BarOrdLin ,
                                           String A1798BarDibCli ,
                                           short A4466BarAcaAnh ,
                                           String AV66FilterFullText ,
                                           String A13696BarNHdr ,
                                           String A151BarFasCod ,
                                           short A154BarFasLin ,
                                           String A1955BarFasSig ,
                                           String AV39TFBarFasCod_Sel ,
                                           String AV38TFBarFasCod ,
                                           short AV40TFBarFasLin ,
                                           short AV41TFBarFasLin_To ,
                                           String AV43TFBarFasSig_Sel ,
                                           String AV42TFBarFasSig ,
                                           int AV68Clicod ,
                                           int AV69Clicod_to ,
                                           java.util.Date A159BarFecGen ,
                                           java.util.Date AV70BarFecgen ,
                                           java.util.Date AV71BarFecGen_to ,
                                           byte AV72BarSIt ,
                                           byte AV73Barsit_to ,
                                           byte AV74BarfasEst ,
                                           byte AV75BarFasEst_to ,
                                           short AV76BarAcaAnh ,
                                           String A396EmprCod ,
                                           String AV67Emprcod ,
                                           String A457FasCod ,
                                           String AV77Fascod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int11 = new byte[79];
      Object[] GXv_Object12 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.FasCod, T2.BarSer, T2.BarFecGen, T2.BarAcaAnh, T2.BarDibCli, T1.BarOrdLin, T2.BarNomCli, T2.BarTipCol, T2.BarColNum, T2.BarColNom, T2.BarSerDsc," ;
      scmdbuf += " T2.BarSit, RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCodReo,'90'), 2))) || T2.BarCodPar AS BarNHdr, T3.CliNom," ;
      scmdbuf += " T2.CliCod, T1.BarFasEst, T1.MaqCodBis, COALESCE( T4.BarFasSig, ' ') AS BarFasSig, COALESCE( T5.BarFasLin, 0) AS BarFasLin, COALESCE( T6.BarFasSig, ' ') AS BarFasCod," ;
      scmdbuf += " COALESCE( T7.BarMtr, 0) AS BarMtr, COALESCE( T7.BarKgm, 0) AS BarKgm, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod FROM ((((((TXPBARFAS T1 INNER JOIN TXPBARCAD" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod =" ;
      scmdbuf += " T1.EmprCod AND T3.CliCod = T2.CliCod) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasSig, COALESCE( T9.BarFasLin, 0) AS BarFasLin, T8.EmprCod, T8.BarCod, T8.BarCodReo," ;
      scmdbuf += " T8.BarCodPar FROM ((TXPBARFAS T8 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP" ;
      scmdbuf += " BY EmprCod, BarCod, BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar)" ;
      scmdbuf += " INNER JOIN (SELECT MIN(T11.BarOrdLin) AS GXC1, COALESCE( T12.BarFasLin, 0) AS BarFasLin, T11.EmprCod, T11.BarCod, T11.BarCodReo, T11.BarCodPar FROM (TXPBARFAS T11" ;
      scmdbuf += " LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      scmdbuf += " ) T12 ON T12.EmprCod = T11.EmprCod AND T12.BarCod = T11.BarCod AND T12.BarCodReo = T11.BarCodReo AND T12.BarCodPar = T11.BarCodPar) WHERE (T11.BarOrdLin >= 0) AND" ;
      scmdbuf += " (T11.BarOrdLin > COALESCE( T12.BarFasLin, 0)) AND (T11.BarFasEst = 0) GROUP BY T12.BarFasLin, T11.EmprCod, T11.BarCod, T11.BarCodReo, T11.BarCodPar ) T10 ON T10.EmprCod" ;
      scmdbuf += " = T8.EmprCod AND T10.BarCod = T8.BarCod AND T10.BarCodReo = T8.BarCodReo AND T10.BarCodPar = T8.BarCodPar) WHERE (T8.BarOrdLin = T10.GXC1) AND (T8.BarOrdLin >=" ;
      scmdbuf += " 0) AND (T8.BarOrdLin > COALESCE( T9.BarFasLin, 0)) AND (T8.BarFasEst = 0) GROUP BY T9.BarFasLin, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T4 ON T4.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod," ;
      scmdbuf += " BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod =" ;
      scmdbuf += " T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasSig, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar" ;
      scmdbuf += " FROM (TXPBARFAS T8 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC2, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod," ;
      scmdbuf += " BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) WHERE (T8.BarOrdLin" ;
      scmdbuf += " = T9.GXC2) AND (T8.BarFasEst <> 0) GROUP BY T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo" ;
      scmdbuf += " = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm FROM" ;
      scmdbuf += " TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod = T1.EmprCod AND T7.BarCod = T1.BarCod AND T7.BarCodReo = T1.BarCodReo AND T7.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(T1.MaqCodBis) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarFasEst,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCodReo,'90'), 2))) || T2.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarSit,'90'), 2) like '%' || ?) or ( UPPER(T2.BarSer) like '%' || UPPER(?)) or ( UPPER(T2.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T2.BarColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.BarTipCol,'90'), 2) like '%' || ?) or ( UPPER(T2.BarNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T7.BarKgm, 0),'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T7.BarMtr, 0),'999990.99'), 2) like '%' || ?) or ( UPPER(COALESCE( T6.BarFasSig, ' ')) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T5.BarFasLin, 0),'9990'), 2) like '%' || ?) or ( UPPER(COALESCE( T4.BarFasSig, ' ')) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarOrdLin,'9990'), 2) like '%' || ?) or ( UPPER(T2.BarDibCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarAcaAnh,'9990'), 2) like '%' || ?)))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T6.BarFasSig, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.BarFasSig, ' ') = ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T5.BarFasLin, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T5.BarFasLin, 0) <= ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.BarFasSig, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.BarFasSig, ' ') = ?))");
      addWhere(sWhereString, "(T2.CliCod >= ?)");
      addWhere(sWhereString, "(T2.CliCod <= ?)");
      addWhere(sWhereString, "(T2.BarFecGen >= ?)");
      addWhere(sWhereString, "(T2.BarFecGen <= ?)");
      addWhere(sWhereString, "(T2.BarSit >= ?)");
      addWhere(sWhereString, "(T2.BarSit <= ?)");
      addWhere(sWhereString, "(T1.BarFasEst >= ?)");
      addWhere(sWhereString, "(T1.BarFasEst <= ?)");
      addWhere(sWhereString, "(T2.BarAcaAnh = ? or (? = 0))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.FasCod = ?)");
      if ( (GXutil.strcmp("", AV81TFMaqCodBis_Sel)==0) && ( ! (GXutil.strcmp("", AV80TFMaqCodBis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81TFMaqCodBis_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int11[48] = (byte)(1) ;
      }
      if ( AV11TFBarFasEst_Sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV11TFBarFasEst_Sels, "T1.BarFasEst IN (", ")")+")");
      }
      if ( ! (0==AV12TFCliCod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int11[49] = (byte)(1) ;
      }
      if ( ! (0==AV13TFCliCod_To) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int11[50] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV15TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV14TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[51] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV15TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int11[52] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV19TFBarNHdr_Sel)==0) && ( ! (GXutil.strcmp("", AV18TFBarNHdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[53] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV19TFBarNHdr_Sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int11[54] = (byte)(1) ;
      }
      if ( ! (0==AV20TFBarSit) )
      {
         addWhere(sWhereString, "(T2.BarSit >= ?)");
      }
      else
      {
         GXv_int11[55] = (byte)(1) ;
      }
      if ( ! (0==AV21TFBarSit_To) )
      {
         addWhere(sWhereString, "(T2.BarSit <= ?)");
      }
      else
      {
         GXv_int11[56] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV23TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV22TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[57] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV23TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int11[58] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV25TFBarSerDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV24TFBarSerDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[59] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV25TFBarSerDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int11[60] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV27TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV26TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[61] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV27TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int11[62] = (byte)(1) ;
      }
      if ( ! (0==AV28TFBarColNum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int11[63] = (byte)(1) ;
      }
      if ( ! (0==AV29TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int11[64] = (byte)(1) ;
      }
      if ( ! (0==AV30TFBarTipCol) )
      {
         addWhere(sWhereString, "(T2.BarTipCol >= ?)");
      }
      else
      {
         GXv_int11[65] = (byte)(1) ;
      }
      if ( ! (0==AV31TFBarTipCol_To) )
      {
         addWhere(sWhereString, "(T2.BarTipCol <= ?)");
      }
      else
      {
         GXv_int11[66] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV33TFBarNomCli_Sel)==0) && ( ! (GXutil.strcmp("", AV32TFBarNomCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[67] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV33TFBarNomCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int11[68] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV34TFBarKgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int11[69] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV35TFBarKgm_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int11[70] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV36TFBarMtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int11[71] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV37TFBarMtr_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int11[72] = (byte)(1) ;
      }
      if ( ! (0==AV44TFBarOrdLin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int11[73] = (byte)(1) ;
      }
      if ( ! (0==AV45TFBarOrdLin_To) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int11[74] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87TFBarDibCli_Sel)==0) && ( ! (GXutil.strcmp("", AV86TFBarDibCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarDibCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[75] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87TFBarDibCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarDibCli = ?)");
      }
      else
      {
         GXv_int11[76] = (byte)(1) ;
      }
      if ( ! (0==AV46TFBarAcaAnh) )
      {
         addWhere(sWhereString, "(T2.BarAcaAnh >= ?)");
      }
      else
      {
         GXv_int11[77] = (byte)(1) ;
      }
      if ( ! (0==AV47TFBarAcaAnh_To) )
      {
         addWhere(sWhereString, "(T2.BarAcaAnh <= ?)");
      }
      else
      {
         GXv_int11[78] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.BarSer" ;
      GXv_Object12[0] = scmdbuf ;
      GXv_Object12[1] = GXv_int11 ;
      return GXv_Object12 ;
   }

   protected Object[] conditional_P093946( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           byte A153BarFasEst ,
                                           GXSimpleCollection<Byte> AV11TFBarFasEst_Sels ,
                                           String AV81TFMaqCodBis_Sel ,
                                           String AV80TFMaqCodBis ,
                                           int AV11TFBarFasEst_Sels_size ,
                                           int AV12TFCliCod ,
                                           int AV13TFCliCod_To ,
                                           String AV15TFCliNom_Sel ,
                                           String AV14TFCliNom ,
                                           String AV19TFBarNHdr_Sel ,
                                           String AV18TFBarNHdr ,
                                           byte AV20TFBarSit ,
                                           byte AV21TFBarSit_To ,
                                           String AV23TFBarSer_Sel ,
                                           String AV22TFBarSer ,
                                           String AV25TFBarSerDsc_Sel ,
                                           String AV24TFBarSerDsc ,
                                           String AV27TFBarColNom_Sel ,
                                           String AV26TFBarColNom ,
                                           int AV28TFBarColNum ,
                                           int AV29TFBarColNum_To ,
                                           byte AV30TFBarTipCol ,
                                           byte AV31TFBarTipCol_To ,
                                           String AV33TFBarNomCli_Sel ,
                                           String AV32TFBarNomCli ,
                                           java.math.BigDecimal AV34TFBarKgm ,
                                           java.math.BigDecimal AV35TFBarKgm_To ,
                                           java.math.BigDecimal AV36TFBarMtr ,
                                           java.math.BigDecimal AV37TFBarMtr_To ,
                                           short AV44TFBarOrdLin ,
                                           short AV45TFBarOrdLin_To ,
                                           String AV87TFBarDibCli_Sel ,
                                           String AV86TFBarDibCli ,
                                           short AV46TFBarAcaAnh ,
                                           short AV47TFBarAcaAnh_To ,
                                           String A603MaqCodBis ,
                                           int A252CliCod ,
                                           String A279CliNom ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           byte A213BarSit ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           byte A218BarTipCol ,
                                           String A1234BarNomCli ,
                                           java.math.BigDecimal A166BarKgm ,
                                           java.math.BigDecimal A184BarMtr ,
                                           short A194BarOrdLin ,
                                           String A1798BarDibCli ,
                                           short A4466BarAcaAnh ,
                                           String AV66FilterFullText ,
                                           String A13696BarNHdr ,
                                           String A151BarFasCod ,
                                           short A154BarFasLin ,
                                           String A1955BarFasSig ,
                                           String AV39TFBarFasCod_Sel ,
                                           String AV38TFBarFasCod ,
                                           short AV40TFBarFasLin ,
                                           short AV41TFBarFasLin_To ,
                                           String AV43TFBarFasSig_Sel ,
                                           String AV42TFBarFasSig ,
                                           int AV68Clicod ,
                                           int AV69Clicod_to ,
                                           java.util.Date A159BarFecGen ,
                                           java.util.Date AV70BarFecgen ,
                                           java.util.Date AV71BarFecGen_to ,
                                           byte AV72BarSIt ,
                                           byte AV73Barsit_to ,
                                           byte AV74BarfasEst ,
                                           byte AV75BarFasEst_to ,
                                           short AV76BarAcaAnh ,
                                           String A396EmprCod ,
                                           String AV67Emprcod ,
                                           String A457FasCod ,
                                           String AV77Fascod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[79];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.FasCod, T2.BarSerDsc, T2.BarFecGen, T2.BarAcaAnh, T2.BarDibCli, T1.BarOrdLin, T2.BarNomCli, T2.BarTipCol, T2.BarColNum, T2.BarColNom, T2.BarSer," ;
      scmdbuf += " T2.BarSit, RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCodReo,'90'), 2))) || T2.BarCodPar AS BarNHdr, T3.CliNom," ;
      scmdbuf += " T2.CliCod, T1.BarFasEst, T1.MaqCodBis, COALESCE( T4.BarFasSig, ' ') AS BarFasSig, COALESCE( T5.BarFasLin, 0) AS BarFasLin, COALESCE( T6.BarFasSig, ' ') AS BarFasCod," ;
      scmdbuf += " COALESCE( T7.BarMtr, 0) AS BarMtr, COALESCE( T7.BarKgm, 0) AS BarKgm, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod FROM ((((((TXPBARFAS T1 INNER JOIN TXPBARCAD" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod =" ;
      scmdbuf += " T1.EmprCod AND T3.CliCod = T2.CliCod) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasSig, COALESCE( T9.BarFasLin, 0) AS BarFasLin, T8.EmprCod, T8.BarCod, T8.BarCodReo," ;
      scmdbuf += " T8.BarCodPar FROM ((TXPBARFAS T8 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP" ;
      scmdbuf += " BY EmprCod, BarCod, BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar)" ;
      scmdbuf += " INNER JOIN (SELECT MIN(T11.BarOrdLin) AS GXC1, COALESCE( T12.BarFasLin, 0) AS BarFasLin, T11.EmprCod, T11.BarCod, T11.BarCodReo, T11.BarCodPar FROM (TXPBARFAS T11" ;
      scmdbuf += " LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      scmdbuf += " ) T12 ON T12.EmprCod = T11.EmprCod AND T12.BarCod = T11.BarCod AND T12.BarCodReo = T11.BarCodReo AND T12.BarCodPar = T11.BarCodPar) WHERE (T11.BarOrdLin >= 0) AND" ;
      scmdbuf += " (T11.BarOrdLin > COALESCE( T12.BarFasLin, 0)) AND (T11.BarFasEst = 0) GROUP BY T12.BarFasLin, T11.EmprCod, T11.BarCod, T11.BarCodReo, T11.BarCodPar ) T10 ON T10.EmprCod" ;
      scmdbuf += " = T8.EmprCod AND T10.BarCod = T8.BarCod AND T10.BarCodReo = T8.BarCodReo AND T10.BarCodPar = T8.BarCodPar) WHERE (T8.BarOrdLin = T10.GXC1) AND (T8.BarOrdLin >=" ;
      scmdbuf += " 0) AND (T8.BarOrdLin > COALESCE( T9.BarFasLin, 0)) AND (T8.BarFasEst = 0) GROUP BY T9.BarFasLin, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T4 ON T4.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod," ;
      scmdbuf += " BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod =" ;
      scmdbuf += " T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasSig, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar" ;
      scmdbuf += " FROM (TXPBARFAS T8 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC2, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod," ;
      scmdbuf += " BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) WHERE (T8.BarOrdLin" ;
      scmdbuf += " = T9.GXC2) AND (T8.BarFasEst <> 0) GROUP BY T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo" ;
      scmdbuf += " = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm FROM" ;
      scmdbuf += " TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod = T1.EmprCod AND T7.BarCod = T1.BarCod AND T7.BarCodReo = T1.BarCodReo AND T7.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(T1.MaqCodBis) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarFasEst,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCodReo,'90'), 2))) || T2.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarSit,'90'), 2) like '%' || ?) or ( UPPER(T2.BarSer) like '%' || UPPER(?)) or ( UPPER(T2.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T2.BarColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.BarTipCol,'90'), 2) like '%' || ?) or ( UPPER(T2.BarNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T7.BarKgm, 0),'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T7.BarMtr, 0),'999990.99'), 2) like '%' || ?) or ( UPPER(COALESCE( T6.BarFasSig, ' ')) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T5.BarFasLin, 0),'9990'), 2) like '%' || ?) or ( UPPER(COALESCE( T4.BarFasSig, ' ')) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarOrdLin,'9990'), 2) like '%' || ?) or ( UPPER(T2.BarDibCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarAcaAnh,'9990'), 2) like '%' || ?)))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T6.BarFasSig, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.BarFasSig, ' ') = ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T5.BarFasLin, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T5.BarFasLin, 0) <= ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.BarFasSig, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.BarFasSig, ' ') = ?))");
      addWhere(sWhereString, "(T2.CliCod >= ?)");
      addWhere(sWhereString, "(T2.CliCod <= ?)");
      addWhere(sWhereString, "(T2.BarFecGen >= ?)");
      addWhere(sWhereString, "(T2.BarFecGen <= ?)");
      addWhere(sWhereString, "(T2.BarSit >= ?)");
      addWhere(sWhereString, "(T2.BarSit <= ?)");
      addWhere(sWhereString, "(T1.BarFasEst >= ?)");
      addWhere(sWhereString, "(T1.BarFasEst <= ?)");
      addWhere(sWhereString, "(T2.BarAcaAnh = ? or (? = 0))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.FasCod = ?)");
      if ( (GXutil.strcmp("", AV81TFMaqCodBis_Sel)==0) && ( ! (GXutil.strcmp("", AV80TFMaqCodBis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81TFMaqCodBis_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int14[48] = (byte)(1) ;
      }
      if ( AV11TFBarFasEst_Sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV11TFBarFasEst_Sels, "T1.BarFasEst IN (", ")")+")");
      }
      if ( ! (0==AV12TFCliCod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int14[49] = (byte)(1) ;
      }
      if ( ! (0==AV13TFCliCod_To) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int14[50] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV15TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV14TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[51] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV15TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int14[52] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV19TFBarNHdr_Sel)==0) && ( ! (GXutil.strcmp("", AV18TFBarNHdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[53] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV19TFBarNHdr_Sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int14[54] = (byte)(1) ;
      }
      if ( ! (0==AV20TFBarSit) )
      {
         addWhere(sWhereString, "(T2.BarSit >= ?)");
      }
      else
      {
         GXv_int14[55] = (byte)(1) ;
      }
      if ( ! (0==AV21TFBarSit_To) )
      {
         addWhere(sWhereString, "(T2.BarSit <= ?)");
      }
      else
      {
         GXv_int14[56] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV23TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV22TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[57] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV23TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int14[58] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV25TFBarSerDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV24TFBarSerDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[59] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV25TFBarSerDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int14[60] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV27TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV26TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[61] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV27TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int14[62] = (byte)(1) ;
      }
      if ( ! (0==AV28TFBarColNum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int14[63] = (byte)(1) ;
      }
      if ( ! (0==AV29TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int14[64] = (byte)(1) ;
      }
      if ( ! (0==AV30TFBarTipCol) )
      {
         addWhere(sWhereString, "(T2.BarTipCol >= ?)");
      }
      else
      {
         GXv_int14[65] = (byte)(1) ;
      }
      if ( ! (0==AV31TFBarTipCol_To) )
      {
         addWhere(sWhereString, "(T2.BarTipCol <= ?)");
      }
      else
      {
         GXv_int14[66] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV33TFBarNomCli_Sel)==0) && ( ! (GXutil.strcmp("", AV32TFBarNomCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[67] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV33TFBarNomCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int14[68] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV34TFBarKgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int14[69] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV35TFBarKgm_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int14[70] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV36TFBarMtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int14[71] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV37TFBarMtr_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int14[72] = (byte)(1) ;
      }
      if ( ! (0==AV44TFBarOrdLin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int14[73] = (byte)(1) ;
      }
      if ( ! (0==AV45TFBarOrdLin_To) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int14[74] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87TFBarDibCli_Sel)==0) && ( ! (GXutil.strcmp("", AV86TFBarDibCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarDibCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[75] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87TFBarDibCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarDibCli = ?)");
      }
      else
      {
         GXv_int14[76] = (byte)(1) ;
      }
      if ( ! (0==AV46TFBarAcaAnh) )
      {
         addWhere(sWhereString, "(T2.BarAcaAnh >= ?)");
      }
      else
      {
         GXv_int14[77] = (byte)(1) ;
      }
      if ( ! (0==AV47TFBarAcaAnh_To) )
      {
         addWhere(sWhereString, "(T2.BarAcaAnh <= ?)");
      }
      else
      {
         GXv_int14[78] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.BarSerDsc" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
   }

   protected Object[] conditional_P093955( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           byte A153BarFasEst ,
                                           GXSimpleCollection<Byte> AV11TFBarFasEst_Sels ,
                                           String AV81TFMaqCodBis_Sel ,
                                           String AV80TFMaqCodBis ,
                                           int AV11TFBarFasEst_Sels_size ,
                                           int AV12TFCliCod ,
                                           int AV13TFCliCod_To ,
                                           String AV15TFCliNom_Sel ,
                                           String AV14TFCliNom ,
                                           String AV19TFBarNHdr_Sel ,
                                           String AV18TFBarNHdr ,
                                           byte AV20TFBarSit ,
                                           byte AV21TFBarSit_To ,
                                           String AV23TFBarSer_Sel ,
                                           String AV22TFBarSer ,
                                           String AV25TFBarSerDsc_Sel ,
                                           String AV24TFBarSerDsc ,
                                           String AV27TFBarColNom_Sel ,
                                           String AV26TFBarColNom ,
                                           int AV28TFBarColNum ,
                                           int AV29TFBarColNum_To ,
                                           byte AV30TFBarTipCol ,
                                           byte AV31TFBarTipCol_To ,
                                           String AV33TFBarNomCli_Sel ,
                                           String AV32TFBarNomCli ,
                                           java.math.BigDecimal AV34TFBarKgm ,
                                           java.math.BigDecimal AV35TFBarKgm_To ,
                                           java.math.BigDecimal AV36TFBarMtr ,
                                           java.math.BigDecimal AV37TFBarMtr_To ,
                                           short AV44TFBarOrdLin ,
                                           short AV45TFBarOrdLin_To ,
                                           String AV87TFBarDibCli_Sel ,
                                           String AV86TFBarDibCli ,
                                           short AV46TFBarAcaAnh ,
                                           short AV47TFBarAcaAnh_To ,
                                           String A603MaqCodBis ,
                                           int A252CliCod ,
                                           String A279CliNom ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           byte A213BarSit ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           byte A218BarTipCol ,
                                           String A1234BarNomCli ,
                                           java.math.BigDecimal A166BarKgm ,
                                           java.math.BigDecimal A184BarMtr ,
                                           short A194BarOrdLin ,
                                           String A1798BarDibCli ,
                                           short A4466BarAcaAnh ,
                                           String AV66FilterFullText ,
                                           String A13696BarNHdr ,
                                           String A151BarFasCod ,
                                           short A154BarFasLin ,
                                           String A1955BarFasSig ,
                                           String AV39TFBarFasCod_Sel ,
                                           String AV38TFBarFasCod ,
                                           short AV40TFBarFasLin ,
                                           short AV41TFBarFasLin_To ,
                                           String AV43TFBarFasSig_Sel ,
                                           String AV42TFBarFasSig ,
                                           int AV68Clicod ,
                                           int AV69Clicod_to ,
                                           java.util.Date A159BarFecGen ,
                                           java.util.Date AV70BarFecgen ,
                                           java.util.Date AV71BarFecGen_to ,
                                           byte AV72BarSIt ,
                                           byte AV73Barsit_to ,
                                           byte AV74BarfasEst ,
                                           byte AV75BarFasEst_to ,
                                           short AV76BarAcaAnh ,
                                           String A396EmprCod ,
                                           String AV67Emprcod ,
                                           String A457FasCod ,
                                           String AV77Fascod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int17 = new byte[79];
      Object[] GXv_Object18 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.FasCod, T2.BarColNom, T2.BarFecGen, T2.BarAcaAnh, T2.BarDibCli, T1.BarOrdLin, T2.BarNomCli, T2.BarTipCol, T2.BarColNum, T2.BarSerDsc, T2.BarSer," ;
      scmdbuf += " T2.BarSit, RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCodReo,'90'), 2))) || T2.BarCodPar AS BarNHdr, T3.CliNom," ;
      scmdbuf += " T2.CliCod, T1.BarFasEst, T1.MaqCodBis, COALESCE( T4.BarFasSig, ' ') AS BarFasSig, COALESCE( T5.BarFasLin, 0) AS BarFasLin, COALESCE( T6.BarFasSig, ' ') AS BarFasCod," ;
      scmdbuf += " COALESCE( T7.BarMtr, 0) AS BarMtr, COALESCE( T7.BarKgm, 0) AS BarKgm, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod FROM ((((((TXPBARFAS T1 INNER JOIN TXPBARCAD" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod =" ;
      scmdbuf += " T1.EmprCod AND T3.CliCod = T2.CliCod) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasSig, COALESCE( T9.BarFasLin, 0) AS BarFasLin, T8.EmprCod, T8.BarCod, T8.BarCodReo," ;
      scmdbuf += " T8.BarCodPar FROM ((TXPBARFAS T8 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP" ;
      scmdbuf += " BY EmprCod, BarCod, BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar)" ;
      scmdbuf += " INNER JOIN (SELECT MIN(T11.BarOrdLin) AS GXC1, COALESCE( T12.BarFasLin, 0) AS BarFasLin, T11.EmprCod, T11.BarCod, T11.BarCodReo, T11.BarCodPar FROM (TXPBARFAS T11" ;
      scmdbuf += " LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      scmdbuf += " ) T12 ON T12.EmprCod = T11.EmprCod AND T12.BarCod = T11.BarCod AND T12.BarCodReo = T11.BarCodReo AND T12.BarCodPar = T11.BarCodPar) WHERE (T11.BarOrdLin >= 0) AND" ;
      scmdbuf += " (T11.BarOrdLin > COALESCE( T12.BarFasLin, 0)) AND (T11.BarFasEst = 0) GROUP BY T12.BarFasLin, T11.EmprCod, T11.BarCod, T11.BarCodReo, T11.BarCodPar ) T10 ON T10.EmprCod" ;
      scmdbuf += " = T8.EmprCod AND T10.BarCod = T8.BarCod AND T10.BarCodReo = T8.BarCodReo AND T10.BarCodPar = T8.BarCodPar) WHERE (T8.BarOrdLin = T10.GXC1) AND (T8.BarOrdLin >=" ;
      scmdbuf += " 0) AND (T8.BarOrdLin > COALESCE( T9.BarFasLin, 0)) AND (T8.BarFasEst = 0) GROUP BY T9.BarFasLin, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T4 ON T4.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod," ;
      scmdbuf += " BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod =" ;
      scmdbuf += " T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasSig, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar" ;
      scmdbuf += " FROM (TXPBARFAS T8 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC2, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod," ;
      scmdbuf += " BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) WHERE (T8.BarOrdLin" ;
      scmdbuf += " = T9.GXC2) AND (T8.BarFasEst <> 0) GROUP BY T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo" ;
      scmdbuf += " = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm FROM" ;
      scmdbuf += " TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod = T1.EmprCod AND T7.BarCod = T1.BarCod AND T7.BarCodReo = T1.BarCodReo AND T7.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(T1.MaqCodBis) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarFasEst,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCodReo,'90'), 2))) || T2.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarSit,'90'), 2) like '%' || ?) or ( UPPER(T2.BarSer) like '%' || UPPER(?)) or ( UPPER(T2.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T2.BarColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.BarTipCol,'90'), 2) like '%' || ?) or ( UPPER(T2.BarNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T7.BarKgm, 0),'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T7.BarMtr, 0),'999990.99'), 2) like '%' || ?) or ( UPPER(COALESCE( T6.BarFasSig, ' ')) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T5.BarFasLin, 0),'9990'), 2) like '%' || ?) or ( UPPER(COALESCE( T4.BarFasSig, ' ')) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarOrdLin,'9990'), 2) like '%' || ?) or ( UPPER(T2.BarDibCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarAcaAnh,'9990'), 2) like '%' || ?)))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T6.BarFasSig, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.BarFasSig, ' ') = ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T5.BarFasLin, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T5.BarFasLin, 0) <= ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.BarFasSig, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.BarFasSig, ' ') = ?))");
      addWhere(sWhereString, "(T2.CliCod >= ?)");
      addWhere(sWhereString, "(T2.CliCod <= ?)");
      addWhere(sWhereString, "(T2.BarFecGen >= ?)");
      addWhere(sWhereString, "(T2.BarFecGen <= ?)");
      addWhere(sWhereString, "(T2.BarSit >= ?)");
      addWhere(sWhereString, "(T2.BarSit <= ?)");
      addWhere(sWhereString, "(T1.BarFasEst >= ?)");
      addWhere(sWhereString, "(T1.BarFasEst <= ?)");
      addWhere(sWhereString, "(T2.BarAcaAnh = ? or (? = 0))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.FasCod = ?)");
      if ( (GXutil.strcmp("", AV81TFMaqCodBis_Sel)==0) && ( ! (GXutil.strcmp("", AV80TFMaqCodBis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81TFMaqCodBis_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int17[48] = (byte)(1) ;
      }
      if ( AV11TFBarFasEst_Sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV11TFBarFasEst_Sels, "T1.BarFasEst IN (", ")")+")");
      }
      if ( ! (0==AV12TFCliCod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int17[49] = (byte)(1) ;
      }
      if ( ! (0==AV13TFCliCod_To) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int17[50] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV15TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV14TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[51] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV15TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int17[52] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV19TFBarNHdr_Sel)==0) && ( ! (GXutil.strcmp("", AV18TFBarNHdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[53] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV19TFBarNHdr_Sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int17[54] = (byte)(1) ;
      }
      if ( ! (0==AV20TFBarSit) )
      {
         addWhere(sWhereString, "(T2.BarSit >= ?)");
      }
      else
      {
         GXv_int17[55] = (byte)(1) ;
      }
      if ( ! (0==AV21TFBarSit_To) )
      {
         addWhere(sWhereString, "(T2.BarSit <= ?)");
      }
      else
      {
         GXv_int17[56] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV23TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV22TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[57] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV23TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int17[58] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV25TFBarSerDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV24TFBarSerDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[59] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV25TFBarSerDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int17[60] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV27TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV26TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[61] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV27TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int17[62] = (byte)(1) ;
      }
      if ( ! (0==AV28TFBarColNum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int17[63] = (byte)(1) ;
      }
      if ( ! (0==AV29TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int17[64] = (byte)(1) ;
      }
      if ( ! (0==AV30TFBarTipCol) )
      {
         addWhere(sWhereString, "(T2.BarTipCol >= ?)");
      }
      else
      {
         GXv_int17[65] = (byte)(1) ;
      }
      if ( ! (0==AV31TFBarTipCol_To) )
      {
         addWhere(sWhereString, "(T2.BarTipCol <= ?)");
      }
      else
      {
         GXv_int17[66] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV33TFBarNomCli_Sel)==0) && ( ! (GXutil.strcmp("", AV32TFBarNomCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[67] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV33TFBarNomCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int17[68] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV34TFBarKgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int17[69] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV35TFBarKgm_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int17[70] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV36TFBarMtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int17[71] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV37TFBarMtr_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int17[72] = (byte)(1) ;
      }
      if ( ! (0==AV44TFBarOrdLin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int17[73] = (byte)(1) ;
      }
      if ( ! (0==AV45TFBarOrdLin_To) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int17[74] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87TFBarDibCli_Sel)==0) && ( ! (GXutil.strcmp("", AV86TFBarDibCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarDibCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[75] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87TFBarDibCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarDibCli = ?)");
      }
      else
      {
         GXv_int17[76] = (byte)(1) ;
      }
      if ( ! (0==AV46TFBarAcaAnh) )
      {
         addWhere(sWhereString, "(T2.BarAcaAnh >= ?)");
      }
      else
      {
         GXv_int17[77] = (byte)(1) ;
      }
      if ( ! (0==AV47TFBarAcaAnh_To) )
      {
         addWhere(sWhereString, "(T2.BarAcaAnh <= ?)");
      }
      else
      {
         GXv_int17[78] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.BarColNom" ;
      GXv_Object18[0] = scmdbuf ;
      GXv_Object18[1] = GXv_int17 ;
      return GXv_Object18 ;
   }

   protected Object[] conditional_P093964( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           byte A153BarFasEst ,
                                           GXSimpleCollection<Byte> AV11TFBarFasEst_Sels ,
                                           String AV81TFMaqCodBis_Sel ,
                                           String AV80TFMaqCodBis ,
                                           int AV11TFBarFasEst_Sels_size ,
                                           int AV12TFCliCod ,
                                           int AV13TFCliCod_To ,
                                           String AV15TFCliNom_Sel ,
                                           String AV14TFCliNom ,
                                           String AV19TFBarNHdr_Sel ,
                                           String AV18TFBarNHdr ,
                                           byte AV20TFBarSit ,
                                           byte AV21TFBarSit_To ,
                                           String AV23TFBarSer_Sel ,
                                           String AV22TFBarSer ,
                                           String AV25TFBarSerDsc_Sel ,
                                           String AV24TFBarSerDsc ,
                                           String AV27TFBarColNom_Sel ,
                                           String AV26TFBarColNom ,
                                           int AV28TFBarColNum ,
                                           int AV29TFBarColNum_To ,
                                           byte AV30TFBarTipCol ,
                                           byte AV31TFBarTipCol_To ,
                                           String AV33TFBarNomCli_Sel ,
                                           String AV32TFBarNomCli ,
                                           java.math.BigDecimal AV34TFBarKgm ,
                                           java.math.BigDecimal AV35TFBarKgm_To ,
                                           java.math.BigDecimal AV36TFBarMtr ,
                                           java.math.BigDecimal AV37TFBarMtr_To ,
                                           short AV44TFBarOrdLin ,
                                           short AV45TFBarOrdLin_To ,
                                           String AV87TFBarDibCli_Sel ,
                                           String AV86TFBarDibCli ,
                                           short AV46TFBarAcaAnh ,
                                           short AV47TFBarAcaAnh_To ,
                                           String A603MaqCodBis ,
                                           int A252CliCod ,
                                           String A279CliNom ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           byte A213BarSit ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           byte A218BarTipCol ,
                                           String A1234BarNomCli ,
                                           java.math.BigDecimal A166BarKgm ,
                                           java.math.BigDecimal A184BarMtr ,
                                           short A194BarOrdLin ,
                                           String A1798BarDibCli ,
                                           short A4466BarAcaAnh ,
                                           String AV66FilterFullText ,
                                           String A13696BarNHdr ,
                                           String A151BarFasCod ,
                                           short A154BarFasLin ,
                                           String A1955BarFasSig ,
                                           String AV39TFBarFasCod_Sel ,
                                           String AV38TFBarFasCod ,
                                           short AV40TFBarFasLin ,
                                           short AV41TFBarFasLin_To ,
                                           String AV43TFBarFasSig_Sel ,
                                           String AV42TFBarFasSig ,
                                           int AV68Clicod ,
                                           int AV69Clicod_to ,
                                           java.util.Date A159BarFecGen ,
                                           java.util.Date AV70BarFecgen ,
                                           java.util.Date AV71BarFecGen_to ,
                                           byte AV72BarSIt ,
                                           byte AV73Barsit_to ,
                                           byte AV74BarfasEst ,
                                           byte AV75BarFasEst_to ,
                                           short AV76BarAcaAnh ,
                                           String A396EmprCod ,
                                           String AV67Emprcod ,
                                           String A457FasCod ,
                                           String AV77Fascod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int20 = new byte[79];
      Object[] GXv_Object21 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.FasCod, T2.BarNomCli, T2.BarFecGen, T2.BarAcaAnh, T2.BarDibCli, T1.BarOrdLin, T2.BarTipCol, T2.BarColNum, T2.BarColNom, T2.BarSerDsc, T2.BarSer," ;
      scmdbuf += " T2.BarSit, RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCodReo,'90'), 2))) || T2.BarCodPar AS BarNHdr, T3.CliNom," ;
      scmdbuf += " T2.CliCod, T1.BarFasEst, T1.MaqCodBis, COALESCE( T4.BarFasSig, ' ') AS BarFasSig, COALESCE( T5.BarFasLin, 0) AS BarFasLin, COALESCE( T6.BarFasSig, ' ') AS BarFasCod," ;
      scmdbuf += " COALESCE( T7.BarMtr, 0) AS BarMtr, COALESCE( T7.BarKgm, 0) AS BarKgm, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod FROM ((((((TXPBARFAS T1 INNER JOIN TXPBARCAD" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod =" ;
      scmdbuf += " T1.EmprCod AND T3.CliCod = T2.CliCod) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasSig, COALESCE( T9.BarFasLin, 0) AS BarFasLin, T8.EmprCod, T8.BarCod, T8.BarCodReo," ;
      scmdbuf += " T8.BarCodPar FROM ((TXPBARFAS T8 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP" ;
      scmdbuf += " BY EmprCod, BarCod, BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar)" ;
      scmdbuf += " INNER JOIN (SELECT MIN(T11.BarOrdLin) AS GXC1, COALESCE( T12.BarFasLin, 0) AS BarFasLin, T11.EmprCod, T11.BarCod, T11.BarCodReo, T11.BarCodPar FROM (TXPBARFAS T11" ;
      scmdbuf += " LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      scmdbuf += " ) T12 ON T12.EmprCod = T11.EmprCod AND T12.BarCod = T11.BarCod AND T12.BarCodReo = T11.BarCodReo AND T12.BarCodPar = T11.BarCodPar) WHERE (T11.BarOrdLin >= 0) AND" ;
      scmdbuf += " (T11.BarOrdLin > COALESCE( T12.BarFasLin, 0)) AND (T11.BarFasEst = 0) GROUP BY T12.BarFasLin, T11.EmprCod, T11.BarCod, T11.BarCodReo, T11.BarCodPar ) T10 ON T10.EmprCod" ;
      scmdbuf += " = T8.EmprCod AND T10.BarCod = T8.BarCod AND T10.BarCodReo = T8.BarCodReo AND T10.BarCodPar = T8.BarCodPar) WHERE (T8.BarOrdLin = T10.GXC1) AND (T8.BarOrdLin >=" ;
      scmdbuf += " 0) AND (T8.BarOrdLin > COALESCE( T9.BarFasLin, 0)) AND (T8.BarFasEst = 0) GROUP BY T9.BarFasLin, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T4 ON T4.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod," ;
      scmdbuf += " BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod =" ;
      scmdbuf += " T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasSig, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar" ;
      scmdbuf += " FROM (TXPBARFAS T8 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC2, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod," ;
      scmdbuf += " BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) WHERE (T8.BarOrdLin" ;
      scmdbuf += " = T9.GXC2) AND (T8.BarFasEst <> 0) GROUP BY T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo" ;
      scmdbuf += " = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm FROM" ;
      scmdbuf += " TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod = T1.EmprCod AND T7.BarCod = T1.BarCod AND T7.BarCodReo = T1.BarCodReo AND T7.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(T1.MaqCodBis) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarFasEst,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCodReo,'90'), 2))) || T2.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarSit,'90'), 2) like '%' || ?) or ( UPPER(T2.BarSer) like '%' || UPPER(?)) or ( UPPER(T2.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T2.BarColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.BarTipCol,'90'), 2) like '%' || ?) or ( UPPER(T2.BarNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T7.BarKgm, 0),'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T7.BarMtr, 0),'999990.99'), 2) like '%' || ?) or ( UPPER(COALESCE( T6.BarFasSig, ' ')) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T5.BarFasLin, 0),'9990'), 2) like '%' || ?) or ( UPPER(COALESCE( T4.BarFasSig, ' ')) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarOrdLin,'9990'), 2) like '%' || ?) or ( UPPER(T2.BarDibCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarAcaAnh,'9990'), 2) like '%' || ?)))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T6.BarFasSig, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.BarFasSig, ' ') = ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T5.BarFasLin, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T5.BarFasLin, 0) <= ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.BarFasSig, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.BarFasSig, ' ') = ?))");
      addWhere(sWhereString, "(T2.CliCod >= ?)");
      addWhere(sWhereString, "(T2.CliCod <= ?)");
      addWhere(sWhereString, "(T2.BarFecGen >= ?)");
      addWhere(sWhereString, "(T2.BarFecGen <= ?)");
      addWhere(sWhereString, "(T2.BarSit >= ?)");
      addWhere(sWhereString, "(T2.BarSit <= ?)");
      addWhere(sWhereString, "(T1.BarFasEst >= ?)");
      addWhere(sWhereString, "(T1.BarFasEst <= ?)");
      addWhere(sWhereString, "(T2.BarAcaAnh = ? or (? = 0))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.FasCod = ?)");
      if ( (GXutil.strcmp("", AV81TFMaqCodBis_Sel)==0) && ( ! (GXutil.strcmp("", AV80TFMaqCodBis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81TFMaqCodBis_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int20[48] = (byte)(1) ;
      }
      if ( AV11TFBarFasEst_Sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV11TFBarFasEst_Sels, "T1.BarFasEst IN (", ")")+")");
      }
      if ( ! (0==AV12TFCliCod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int20[49] = (byte)(1) ;
      }
      if ( ! (0==AV13TFCliCod_To) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int20[50] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV15TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV14TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[51] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV15TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int20[52] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV19TFBarNHdr_Sel)==0) && ( ! (GXutil.strcmp("", AV18TFBarNHdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[53] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV19TFBarNHdr_Sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int20[54] = (byte)(1) ;
      }
      if ( ! (0==AV20TFBarSit) )
      {
         addWhere(sWhereString, "(T2.BarSit >= ?)");
      }
      else
      {
         GXv_int20[55] = (byte)(1) ;
      }
      if ( ! (0==AV21TFBarSit_To) )
      {
         addWhere(sWhereString, "(T2.BarSit <= ?)");
      }
      else
      {
         GXv_int20[56] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV23TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV22TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[57] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV23TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int20[58] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV25TFBarSerDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV24TFBarSerDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[59] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV25TFBarSerDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int20[60] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV27TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV26TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[61] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV27TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int20[62] = (byte)(1) ;
      }
      if ( ! (0==AV28TFBarColNum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int20[63] = (byte)(1) ;
      }
      if ( ! (0==AV29TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int20[64] = (byte)(1) ;
      }
      if ( ! (0==AV30TFBarTipCol) )
      {
         addWhere(sWhereString, "(T2.BarTipCol >= ?)");
      }
      else
      {
         GXv_int20[65] = (byte)(1) ;
      }
      if ( ! (0==AV31TFBarTipCol_To) )
      {
         addWhere(sWhereString, "(T2.BarTipCol <= ?)");
      }
      else
      {
         GXv_int20[66] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV33TFBarNomCli_Sel)==0) && ( ! (GXutil.strcmp("", AV32TFBarNomCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[67] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV33TFBarNomCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int20[68] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV34TFBarKgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int20[69] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV35TFBarKgm_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int20[70] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV36TFBarMtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int20[71] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV37TFBarMtr_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int20[72] = (byte)(1) ;
      }
      if ( ! (0==AV44TFBarOrdLin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int20[73] = (byte)(1) ;
      }
      if ( ! (0==AV45TFBarOrdLin_To) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int20[74] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87TFBarDibCli_Sel)==0) && ( ! (GXutil.strcmp("", AV86TFBarDibCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarDibCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[75] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87TFBarDibCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarDibCli = ?)");
      }
      else
      {
         GXv_int20[76] = (byte)(1) ;
      }
      if ( ! (0==AV46TFBarAcaAnh) )
      {
         addWhere(sWhereString, "(T2.BarAcaAnh >= ?)");
      }
      else
      {
         GXv_int20[77] = (byte)(1) ;
      }
      if ( ! (0==AV47TFBarAcaAnh_To) )
      {
         addWhere(sWhereString, "(T2.BarAcaAnh <= ?)");
      }
      else
      {
         GXv_int20[78] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.BarNomCli" ;
      GXv_Object21[0] = scmdbuf ;
      GXv_Object21[1] = GXv_int20 ;
      return GXv_Object21 ;
   }

   protected Object[] conditional_P093973( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           byte A153BarFasEst ,
                                           GXSimpleCollection<Byte> AV11TFBarFasEst_Sels ,
                                           String AV81TFMaqCodBis_Sel ,
                                           String AV80TFMaqCodBis ,
                                           int AV11TFBarFasEst_Sels_size ,
                                           int AV12TFCliCod ,
                                           int AV13TFCliCod_To ,
                                           String AV15TFCliNom_Sel ,
                                           String AV14TFCliNom ,
                                           String AV19TFBarNHdr_Sel ,
                                           String AV18TFBarNHdr ,
                                           byte AV20TFBarSit ,
                                           byte AV21TFBarSit_To ,
                                           String AV23TFBarSer_Sel ,
                                           String AV22TFBarSer ,
                                           String AV25TFBarSerDsc_Sel ,
                                           String AV24TFBarSerDsc ,
                                           String AV27TFBarColNom_Sel ,
                                           String AV26TFBarColNom ,
                                           int AV28TFBarColNum ,
                                           int AV29TFBarColNum_To ,
                                           byte AV30TFBarTipCol ,
                                           byte AV31TFBarTipCol_To ,
                                           String AV33TFBarNomCli_Sel ,
                                           String AV32TFBarNomCli ,
                                           java.math.BigDecimal AV34TFBarKgm ,
                                           java.math.BigDecimal AV35TFBarKgm_To ,
                                           java.math.BigDecimal AV36TFBarMtr ,
                                           java.math.BigDecimal AV37TFBarMtr_To ,
                                           short AV44TFBarOrdLin ,
                                           short AV45TFBarOrdLin_To ,
                                           String AV87TFBarDibCli_Sel ,
                                           String AV86TFBarDibCli ,
                                           short AV46TFBarAcaAnh ,
                                           short AV47TFBarAcaAnh_To ,
                                           String A603MaqCodBis ,
                                           int A252CliCod ,
                                           String A279CliNom ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           byte A213BarSit ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           byte A218BarTipCol ,
                                           String A1234BarNomCli ,
                                           java.math.BigDecimal A166BarKgm ,
                                           java.math.BigDecimal A184BarMtr ,
                                           short A194BarOrdLin ,
                                           String A1798BarDibCli ,
                                           short A4466BarAcaAnh ,
                                           String AV66FilterFullText ,
                                           String A13696BarNHdr ,
                                           String A151BarFasCod ,
                                           short A154BarFasLin ,
                                           String A1955BarFasSig ,
                                           String AV39TFBarFasCod_Sel ,
                                           String AV38TFBarFasCod ,
                                           short AV40TFBarFasLin ,
                                           short AV41TFBarFasLin_To ,
                                           String AV43TFBarFasSig_Sel ,
                                           String AV42TFBarFasSig ,
                                           int AV68Clicod ,
                                           int AV69Clicod_to ,
                                           java.util.Date A159BarFecGen ,
                                           java.util.Date AV70BarFecgen ,
                                           java.util.Date AV71BarFecGen_to ,
                                           byte AV72BarSIt ,
                                           byte AV73Barsit_to ,
                                           byte AV74BarfasEst ,
                                           byte AV75BarFasEst_to ,
                                           short AV76BarAcaAnh ,
                                           String AV67Emprcod ,
                                           String AV77Fascod ,
                                           String A396EmprCod ,
                                           String A457FasCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int23 = new byte[79];
      Object[] GXv_Object24 = new Object[2];
      scmdbuf = "SELECT T2.BarFecGen, T1.FasCod, T1.EmprCod, T2.BarAcaAnh, T2.BarDibCli, T1.BarOrdLin, T2.BarNomCli, T2.BarTipCol, T2.BarColNum, T2.BarColNom, T2.BarSerDsc, T2.BarSer," ;
      scmdbuf += " T2.BarSit, RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCodReo,'90'), 2))) || T2.BarCodPar AS BarNHdr, T3.CliNom," ;
      scmdbuf += " T2.CliCod, T1.BarFasEst, T1.MaqCodBis, COALESCE( T4.BarFasSig, ' ') AS BarFasSig, COALESCE( T5.BarFasLin, 0) AS BarFasLin, COALESCE( T6.BarFasSig, ' ') AS BarFasCod," ;
      scmdbuf += " COALESCE( T7.BarMtr, 0) AS BarMtr, COALESCE( T7.BarKgm, 0) AS BarKgm, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod FROM ((((((TXPBARFAS T1 INNER JOIN TXPBARCAD" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod =" ;
      scmdbuf += " T1.EmprCod AND T3.CliCod = T2.CliCod) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasSig, COALESCE( T9.BarFasLin, 0) AS BarFasLin, T8.EmprCod, T8.BarCod, T8.BarCodReo," ;
      scmdbuf += " T8.BarCodPar FROM ((TXPBARFAS T8 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP" ;
      scmdbuf += " BY EmprCod, BarCod, BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar)" ;
      scmdbuf += " INNER JOIN (SELECT MIN(T11.BarOrdLin) AS GXC1, COALESCE( T12.BarFasLin, 0) AS BarFasLin, T11.EmprCod, T11.BarCod, T11.BarCodReo, T11.BarCodPar FROM (TXPBARFAS T11" ;
      scmdbuf += " LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      scmdbuf += " ) T12 ON T12.EmprCod = T11.EmprCod AND T12.BarCod = T11.BarCod AND T12.BarCodReo = T11.BarCodReo AND T12.BarCodPar = T11.BarCodPar) WHERE (T11.BarOrdLin >= 0) AND" ;
      scmdbuf += " (T11.BarOrdLin > COALESCE( T12.BarFasLin, 0)) AND (T11.BarFasEst = 0) GROUP BY T12.BarFasLin, T11.EmprCod, T11.BarCod, T11.BarCodReo, T11.BarCodPar ) T10 ON T10.EmprCod" ;
      scmdbuf += " = T8.EmprCod AND T10.BarCod = T8.BarCod AND T10.BarCodReo = T8.BarCodReo AND T10.BarCodPar = T8.BarCodPar) WHERE (T8.BarOrdLin = T10.GXC1) AND (T8.BarOrdLin >=" ;
      scmdbuf += " 0) AND (T8.BarOrdLin > COALESCE( T9.BarFasLin, 0)) AND (T8.BarFasEst = 0) GROUP BY T9.BarFasLin, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T4 ON T4.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod," ;
      scmdbuf += " BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod =" ;
      scmdbuf += " T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasSig, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar" ;
      scmdbuf += " FROM (TXPBARFAS T8 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC2, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod," ;
      scmdbuf += " BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) WHERE (T8.BarOrdLin" ;
      scmdbuf += " = T9.GXC2) AND (T8.BarFasEst <> 0) GROUP BY T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo" ;
      scmdbuf += " = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm FROM" ;
      scmdbuf += " TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod = T1.EmprCod AND T7.BarCod = T1.BarCod AND T7.BarCodReo = T1.BarCodReo AND T7.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.FasCod = ?)");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(T1.MaqCodBis) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarFasEst,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCodReo,'90'), 2))) || T2.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarSit,'90'), 2) like '%' || ?) or ( UPPER(T2.BarSer) like '%' || UPPER(?)) or ( UPPER(T2.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T2.BarColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.BarTipCol,'90'), 2) like '%' || ?) or ( UPPER(T2.BarNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T7.BarKgm, 0),'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T7.BarMtr, 0),'999990.99'), 2) like '%' || ?) or ( UPPER(COALESCE( T6.BarFasSig, ' ')) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T5.BarFasLin, 0),'9990'), 2) like '%' || ?) or ( UPPER(COALESCE( T4.BarFasSig, ' ')) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarOrdLin,'9990'), 2) like '%' || ?) or ( UPPER(T2.BarDibCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarAcaAnh,'9990'), 2) like '%' || ?)))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T6.BarFasSig, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.BarFasSig, ' ') = ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T5.BarFasLin, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T5.BarFasLin, 0) <= ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.BarFasSig, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.BarFasSig, ' ') = ?))");
      addWhere(sWhereString, "(T2.CliCod >= ?)");
      addWhere(sWhereString, "(T2.CliCod <= ?)");
      addWhere(sWhereString, "(T2.BarFecGen >= ?)");
      addWhere(sWhereString, "(T2.BarFecGen <= ?)");
      addWhere(sWhereString, "(T2.BarSit >= ?)");
      addWhere(sWhereString, "(T2.BarSit <= ?)");
      addWhere(sWhereString, "(T1.BarFasEst >= ?)");
      addWhere(sWhereString, "(T1.BarFasEst <= ?)");
      addWhere(sWhereString, "(T2.BarAcaAnh = ? or (? = 0))");
      if ( (GXutil.strcmp("", AV81TFMaqCodBis_Sel)==0) && ( ! (GXutil.strcmp("", AV80TFMaqCodBis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81TFMaqCodBis_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int23[48] = (byte)(1) ;
      }
      if ( AV11TFBarFasEst_Sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV11TFBarFasEst_Sels, "T1.BarFasEst IN (", ")")+")");
      }
      if ( ! (0==AV12TFCliCod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int23[49] = (byte)(1) ;
      }
      if ( ! (0==AV13TFCliCod_To) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int23[50] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV15TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV14TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[51] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV15TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int23[52] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV19TFBarNHdr_Sel)==0) && ( ! (GXutil.strcmp("", AV18TFBarNHdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[53] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV19TFBarNHdr_Sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int23[54] = (byte)(1) ;
      }
      if ( ! (0==AV20TFBarSit) )
      {
         addWhere(sWhereString, "(T2.BarSit >= ?)");
      }
      else
      {
         GXv_int23[55] = (byte)(1) ;
      }
      if ( ! (0==AV21TFBarSit_To) )
      {
         addWhere(sWhereString, "(T2.BarSit <= ?)");
      }
      else
      {
         GXv_int23[56] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV23TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV22TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[57] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV23TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int23[58] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV25TFBarSerDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV24TFBarSerDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[59] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV25TFBarSerDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int23[60] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV27TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV26TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[61] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV27TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int23[62] = (byte)(1) ;
      }
      if ( ! (0==AV28TFBarColNum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int23[63] = (byte)(1) ;
      }
      if ( ! (0==AV29TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int23[64] = (byte)(1) ;
      }
      if ( ! (0==AV30TFBarTipCol) )
      {
         addWhere(sWhereString, "(T2.BarTipCol >= ?)");
      }
      else
      {
         GXv_int23[65] = (byte)(1) ;
      }
      if ( ! (0==AV31TFBarTipCol_To) )
      {
         addWhere(sWhereString, "(T2.BarTipCol <= ?)");
      }
      else
      {
         GXv_int23[66] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV33TFBarNomCli_Sel)==0) && ( ! (GXutil.strcmp("", AV32TFBarNomCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[67] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV33TFBarNomCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int23[68] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV34TFBarKgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int23[69] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV35TFBarKgm_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int23[70] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV36TFBarMtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int23[71] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV37TFBarMtr_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int23[72] = (byte)(1) ;
      }
      if ( ! (0==AV44TFBarOrdLin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int23[73] = (byte)(1) ;
      }
      if ( ! (0==AV45TFBarOrdLin_To) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int23[74] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87TFBarDibCli_Sel)==0) && ( ! (GXutil.strcmp("", AV86TFBarDibCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarDibCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[75] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87TFBarDibCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarDibCli = ?)");
      }
      else
      {
         GXv_int23[76] = (byte)(1) ;
      }
      if ( ! (0==AV46TFBarAcaAnh) )
      {
         addWhere(sWhereString, "(T2.BarAcaAnh >= ?)");
      }
      else
      {
         GXv_int23[77] = (byte)(1) ;
      }
      if ( ! (0==AV47TFBarAcaAnh_To) )
      {
         addWhere(sWhereString, "(T2.BarAcaAnh <= ?)");
      }
      else
      {
         GXv_int23[78] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.FasCod" ;
      GXv_Object24[0] = scmdbuf ;
      GXv_Object24[1] = GXv_int23 ;
      return GXv_Object24 ;
   }

   protected Object[] conditional_P093982( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           byte A153BarFasEst ,
                                           GXSimpleCollection<Byte> AV11TFBarFasEst_Sels ,
                                           String AV81TFMaqCodBis_Sel ,
                                           String AV80TFMaqCodBis ,
                                           int AV11TFBarFasEst_Sels_size ,
                                           int AV12TFCliCod ,
                                           int AV13TFCliCod_To ,
                                           String AV15TFCliNom_Sel ,
                                           String AV14TFCliNom ,
                                           String AV19TFBarNHdr_Sel ,
                                           String AV18TFBarNHdr ,
                                           byte AV20TFBarSit ,
                                           byte AV21TFBarSit_To ,
                                           String AV23TFBarSer_Sel ,
                                           String AV22TFBarSer ,
                                           String AV25TFBarSerDsc_Sel ,
                                           String AV24TFBarSerDsc ,
                                           String AV27TFBarColNom_Sel ,
                                           String AV26TFBarColNom ,
                                           int AV28TFBarColNum ,
                                           int AV29TFBarColNum_To ,
                                           byte AV30TFBarTipCol ,
                                           byte AV31TFBarTipCol_To ,
                                           String AV33TFBarNomCli_Sel ,
                                           String AV32TFBarNomCli ,
                                           java.math.BigDecimal AV34TFBarKgm ,
                                           java.math.BigDecimal AV35TFBarKgm_To ,
                                           java.math.BigDecimal AV36TFBarMtr ,
                                           java.math.BigDecimal AV37TFBarMtr_To ,
                                           short AV44TFBarOrdLin ,
                                           short AV45TFBarOrdLin_To ,
                                           String AV87TFBarDibCli_Sel ,
                                           String AV86TFBarDibCli ,
                                           short AV46TFBarAcaAnh ,
                                           short AV47TFBarAcaAnh_To ,
                                           String A603MaqCodBis ,
                                           int A252CliCod ,
                                           String A279CliNom ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           byte A213BarSit ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           byte A218BarTipCol ,
                                           String A1234BarNomCli ,
                                           java.math.BigDecimal A166BarKgm ,
                                           java.math.BigDecimal A184BarMtr ,
                                           short A194BarOrdLin ,
                                           String A1798BarDibCli ,
                                           short A4466BarAcaAnh ,
                                           String AV66FilterFullText ,
                                           String A13696BarNHdr ,
                                           String A151BarFasCod ,
                                           short A154BarFasLin ,
                                           String A1955BarFasSig ,
                                           String AV39TFBarFasCod_Sel ,
                                           String AV38TFBarFasCod ,
                                           short AV40TFBarFasLin ,
                                           short AV41TFBarFasLin_To ,
                                           String AV43TFBarFasSig_Sel ,
                                           String AV42TFBarFasSig ,
                                           int AV68Clicod ,
                                           int AV69Clicod_to ,
                                           java.util.Date A159BarFecGen ,
                                           java.util.Date AV70BarFecgen ,
                                           java.util.Date AV71BarFecGen_to ,
                                           byte AV72BarSIt ,
                                           byte AV73Barsit_to ,
                                           byte AV74BarfasEst ,
                                           byte AV75BarFasEst_to ,
                                           short AV76BarAcaAnh ,
                                           String AV67Emprcod ,
                                           String AV77Fascod ,
                                           String A396EmprCod ,
                                           String A457FasCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int26 = new byte[79];
      Object[] GXv_Object27 = new Object[2];
      scmdbuf = "SELECT T2.BarFecGen, T1.FasCod, T1.EmprCod, T2.BarAcaAnh, T2.BarDibCli, T1.BarOrdLin, T2.BarNomCli, T2.BarTipCol, T2.BarColNum, T2.BarColNom, T2.BarSerDsc, T2.BarSer," ;
      scmdbuf += " T2.BarSit, RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCodReo,'90'), 2))) || T2.BarCodPar AS BarNHdr, T3.CliNom," ;
      scmdbuf += " T2.CliCod, T1.BarFasEst, T1.MaqCodBis, COALESCE( T4.BarFasSig, ' ') AS BarFasSig, COALESCE( T5.BarFasLin, 0) AS BarFasLin, COALESCE( T6.BarFasSig, ' ') AS BarFasCod," ;
      scmdbuf += " COALESCE( T7.BarMtr, 0) AS BarMtr, COALESCE( T7.BarKgm, 0) AS BarKgm, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod FROM ((((((TXPBARFAS T1 INNER JOIN TXPBARCAD" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod =" ;
      scmdbuf += " T1.EmprCod AND T3.CliCod = T2.CliCod) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasSig, COALESCE( T9.BarFasLin, 0) AS BarFasLin, T8.EmprCod, T8.BarCod, T8.BarCodReo," ;
      scmdbuf += " T8.BarCodPar FROM ((TXPBARFAS T8 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP" ;
      scmdbuf += " BY EmprCod, BarCod, BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar)" ;
      scmdbuf += " INNER JOIN (SELECT MIN(T11.BarOrdLin) AS GXC1, COALESCE( T12.BarFasLin, 0) AS BarFasLin, T11.EmprCod, T11.BarCod, T11.BarCodReo, T11.BarCodPar FROM (TXPBARFAS T11" ;
      scmdbuf += " LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      scmdbuf += " ) T12 ON T12.EmprCod = T11.EmprCod AND T12.BarCod = T11.BarCod AND T12.BarCodReo = T11.BarCodReo AND T12.BarCodPar = T11.BarCodPar) WHERE (T11.BarOrdLin >= 0) AND" ;
      scmdbuf += " (T11.BarOrdLin > COALESCE( T12.BarFasLin, 0)) AND (T11.BarFasEst = 0) GROUP BY T12.BarFasLin, T11.EmprCod, T11.BarCod, T11.BarCodReo, T11.BarCodPar ) T10 ON T10.EmprCod" ;
      scmdbuf += " = T8.EmprCod AND T10.BarCod = T8.BarCod AND T10.BarCodReo = T8.BarCodReo AND T10.BarCodPar = T8.BarCodPar) WHERE (T8.BarOrdLin = T10.GXC1) AND (T8.BarOrdLin >=" ;
      scmdbuf += " 0) AND (T8.BarOrdLin > COALESCE( T9.BarFasLin, 0)) AND (T8.BarFasEst = 0) GROUP BY T9.BarFasLin, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T4 ON T4.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod," ;
      scmdbuf += " BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod =" ;
      scmdbuf += " T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasSig, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar" ;
      scmdbuf += " FROM (TXPBARFAS T8 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC2, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod," ;
      scmdbuf += " BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) WHERE (T8.BarOrdLin" ;
      scmdbuf += " = T9.GXC2) AND (T8.BarFasEst <> 0) GROUP BY T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo" ;
      scmdbuf += " = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm FROM" ;
      scmdbuf += " TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod = T1.EmprCod AND T7.BarCod = T1.BarCod AND T7.BarCodReo = T1.BarCodReo AND T7.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.FasCod = ?)");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(T1.MaqCodBis) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarFasEst,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCodReo,'90'), 2))) || T2.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarSit,'90'), 2) like '%' || ?) or ( UPPER(T2.BarSer) like '%' || UPPER(?)) or ( UPPER(T2.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T2.BarColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.BarTipCol,'90'), 2) like '%' || ?) or ( UPPER(T2.BarNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T7.BarKgm, 0),'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T7.BarMtr, 0),'999990.99'), 2) like '%' || ?) or ( UPPER(COALESCE( T6.BarFasSig, ' ')) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T5.BarFasLin, 0),'9990'), 2) like '%' || ?) or ( UPPER(COALESCE( T4.BarFasSig, ' ')) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarOrdLin,'9990'), 2) like '%' || ?) or ( UPPER(T2.BarDibCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarAcaAnh,'9990'), 2) like '%' || ?)))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T6.BarFasSig, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.BarFasSig, ' ') = ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T5.BarFasLin, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T5.BarFasLin, 0) <= ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.BarFasSig, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.BarFasSig, ' ') = ?))");
      addWhere(sWhereString, "(T2.CliCod >= ?)");
      addWhere(sWhereString, "(T2.CliCod <= ?)");
      addWhere(sWhereString, "(T2.BarFecGen >= ?)");
      addWhere(sWhereString, "(T2.BarFecGen <= ?)");
      addWhere(sWhereString, "(T2.BarSit >= ?)");
      addWhere(sWhereString, "(T2.BarSit <= ?)");
      addWhere(sWhereString, "(T1.BarFasEst >= ?)");
      addWhere(sWhereString, "(T1.BarFasEst <= ?)");
      addWhere(sWhereString, "(T2.BarAcaAnh = ? or (? = 0))");
      if ( (GXutil.strcmp("", AV81TFMaqCodBis_Sel)==0) && ( ! (GXutil.strcmp("", AV80TFMaqCodBis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81TFMaqCodBis_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int26[48] = (byte)(1) ;
      }
      if ( AV11TFBarFasEst_Sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV11TFBarFasEst_Sels, "T1.BarFasEst IN (", ")")+")");
      }
      if ( ! (0==AV12TFCliCod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int26[49] = (byte)(1) ;
      }
      if ( ! (0==AV13TFCliCod_To) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int26[50] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV15TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV14TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[51] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV15TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int26[52] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV19TFBarNHdr_Sel)==0) && ( ! (GXutil.strcmp("", AV18TFBarNHdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[53] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV19TFBarNHdr_Sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int26[54] = (byte)(1) ;
      }
      if ( ! (0==AV20TFBarSit) )
      {
         addWhere(sWhereString, "(T2.BarSit >= ?)");
      }
      else
      {
         GXv_int26[55] = (byte)(1) ;
      }
      if ( ! (0==AV21TFBarSit_To) )
      {
         addWhere(sWhereString, "(T2.BarSit <= ?)");
      }
      else
      {
         GXv_int26[56] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV23TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV22TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[57] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV23TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int26[58] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV25TFBarSerDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV24TFBarSerDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[59] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV25TFBarSerDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int26[60] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV27TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV26TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[61] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV27TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int26[62] = (byte)(1) ;
      }
      if ( ! (0==AV28TFBarColNum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int26[63] = (byte)(1) ;
      }
      if ( ! (0==AV29TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int26[64] = (byte)(1) ;
      }
      if ( ! (0==AV30TFBarTipCol) )
      {
         addWhere(sWhereString, "(T2.BarTipCol >= ?)");
      }
      else
      {
         GXv_int26[65] = (byte)(1) ;
      }
      if ( ! (0==AV31TFBarTipCol_To) )
      {
         addWhere(sWhereString, "(T2.BarTipCol <= ?)");
      }
      else
      {
         GXv_int26[66] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV33TFBarNomCli_Sel)==0) && ( ! (GXutil.strcmp("", AV32TFBarNomCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[67] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV33TFBarNomCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int26[68] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV34TFBarKgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int26[69] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV35TFBarKgm_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int26[70] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV36TFBarMtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int26[71] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV37TFBarMtr_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int26[72] = (byte)(1) ;
      }
      if ( ! (0==AV44TFBarOrdLin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int26[73] = (byte)(1) ;
      }
      if ( ! (0==AV45TFBarOrdLin_To) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int26[74] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87TFBarDibCli_Sel)==0) && ( ! (GXutil.strcmp("", AV86TFBarDibCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarDibCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[75] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87TFBarDibCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarDibCli = ?)");
      }
      else
      {
         GXv_int26[76] = (byte)(1) ;
      }
      if ( ! (0==AV46TFBarAcaAnh) )
      {
         addWhere(sWhereString, "(T2.BarAcaAnh >= ?)");
      }
      else
      {
         GXv_int26[77] = (byte)(1) ;
      }
      if ( ! (0==AV47TFBarAcaAnh_To) )
      {
         addWhere(sWhereString, "(T2.BarAcaAnh <= ?)");
      }
      else
      {
         GXv_int26[78] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.FasCod" ;
      GXv_Object27[0] = scmdbuf ;
      GXv_Object27[1] = GXv_int26 ;
      return GXv_Object27 ;
   }

   protected Object[] conditional_P093991( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           byte A153BarFasEst ,
                                           GXSimpleCollection<Byte> AV11TFBarFasEst_Sels ,
                                           String AV81TFMaqCodBis_Sel ,
                                           String AV80TFMaqCodBis ,
                                           int AV11TFBarFasEst_Sels_size ,
                                           int AV12TFCliCod ,
                                           int AV13TFCliCod_To ,
                                           String AV15TFCliNom_Sel ,
                                           String AV14TFCliNom ,
                                           String AV19TFBarNHdr_Sel ,
                                           String AV18TFBarNHdr ,
                                           byte AV20TFBarSit ,
                                           byte AV21TFBarSit_To ,
                                           String AV23TFBarSer_Sel ,
                                           String AV22TFBarSer ,
                                           String AV25TFBarSerDsc_Sel ,
                                           String AV24TFBarSerDsc ,
                                           String AV27TFBarColNom_Sel ,
                                           String AV26TFBarColNom ,
                                           int AV28TFBarColNum ,
                                           int AV29TFBarColNum_To ,
                                           byte AV30TFBarTipCol ,
                                           byte AV31TFBarTipCol_To ,
                                           String AV33TFBarNomCli_Sel ,
                                           String AV32TFBarNomCli ,
                                           java.math.BigDecimal AV34TFBarKgm ,
                                           java.math.BigDecimal AV35TFBarKgm_To ,
                                           java.math.BigDecimal AV36TFBarMtr ,
                                           java.math.BigDecimal AV37TFBarMtr_To ,
                                           short AV44TFBarOrdLin ,
                                           short AV45TFBarOrdLin_To ,
                                           String AV87TFBarDibCli_Sel ,
                                           String AV86TFBarDibCli ,
                                           short AV46TFBarAcaAnh ,
                                           short AV47TFBarAcaAnh_To ,
                                           String A603MaqCodBis ,
                                           int A252CliCod ,
                                           String A279CliNom ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           byte A213BarSit ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           byte A218BarTipCol ,
                                           String A1234BarNomCli ,
                                           java.math.BigDecimal A166BarKgm ,
                                           java.math.BigDecimal A184BarMtr ,
                                           short A194BarOrdLin ,
                                           String A1798BarDibCli ,
                                           short A4466BarAcaAnh ,
                                           String AV66FilterFullText ,
                                           String A13696BarNHdr ,
                                           String A151BarFasCod ,
                                           short A154BarFasLin ,
                                           String A1955BarFasSig ,
                                           String AV39TFBarFasCod_Sel ,
                                           String AV38TFBarFasCod ,
                                           short AV40TFBarFasLin ,
                                           short AV41TFBarFasLin_To ,
                                           String AV43TFBarFasSig_Sel ,
                                           String AV42TFBarFasSig ,
                                           int AV68Clicod ,
                                           int AV69Clicod_to ,
                                           java.util.Date A159BarFecGen ,
                                           java.util.Date AV70BarFecgen ,
                                           java.util.Date AV71BarFecGen_to ,
                                           byte AV72BarSIt ,
                                           byte AV73Barsit_to ,
                                           byte AV74BarfasEst ,
                                           byte AV75BarFasEst_to ,
                                           short AV76BarAcaAnh ,
                                           String A396EmprCod ,
                                           String AV67Emprcod ,
                                           String A457FasCod ,
                                           String AV77Fascod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int29 = new byte[79];
      Object[] GXv_Object30 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.FasCod, T2.BarDibCli, T2.BarFecGen, T2.BarAcaAnh, T1.BarOrdLin, T2.BarNomCli, T2.BarTipCol, T2.BarColNum, T2.BarColNom, T2.BarSerDsc, T2.BarSer," ;
      scmdbuf += " T2.BarSit, RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCodReo,'90'), 2))) || T2.BarCodPar AS BarNHdr, T3.CliNom," ;
      scmdbuf += " T2.CliCod, T1.BarFasEst, T1.MaqCodBis, COALESCE( T4.BarFasSig, ' ') AS BarFasSig, COALESCE( T5.BarFasLin, 0) AS BarFasLin, COALESCE( T6.BarFasSig, ' ') AS BarFasCod," ;
      scmdbuf += " COALESCE( T7.BarMtr, 0) AS BarMtr, COALESCE( T7.BarKgm, 0) AS BarKgm, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod FROM ((((((TXPBARFAS T1 INNER JOIN TXPBARCAD" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod =" ;
      scmdbuf += " T1.EmprCod AND T3.CliCod = T2.CliCod) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasSig, COALESCE( T9.BarFasLin, 0) AS BarFasLin, T8.EmprCod, T8.BarCod, T8.BarCodReo," ;
      scmdbuf += " T8.BarCodPar FROM ((TXPBARFAS T8 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP" ;
      scmdbuf += " BY EmprCod, BarCod, BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar)" ;
      scmdbuf += " INNER JOIN (SELECT MIN(T11.BarOrdLin) AS GXC1, COALESCE( T12.BarFasLin, 0) AS BarFasLin, T11.EmprCod, T11.BarCod, T11.BarCodReo, T11.BarCodPar FROM (TXPBARFAS T11" ;
      scmdbuf += " LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      scmdbuf += " ) T12 ON T12.EmprCod = T11.EmprCod AND T12.BarCod = T11.BarCod AND T12.BarCodReo = T11.BarCodReo AND T12.BarCodPar = T11.BarCodPar) WHERE (T11.BarOrdLin >= 0) AND" ;
      scmdbuf += " (T11.BarOrdLin > COALESCE( T12.BarFasLin, 0)) AND (T11.BarFasEst = 0) GROUP BY T12.BarFasLin, T11.EmprCod, T11.BarCod, T11.BarCodReo, T11.BarCodPar ) T10 ON T10.EmprCod" ;
      scmdbuf += " = T8.EmprCod AND T10.BarCod = T8.BarCod AND T10.BarCodReo = T8.BarCodReo AND T10.BarCodPar = T8.BarCodPar) WHERE (T8.BarOrdLin = T10.GXC1) AND (T8.BarOrdLin >=" ;
      scmdbuf += " 0) AND (T8.BarOrdLin > COALESCE( T9.BarFasLin, 0)) AND (T8.BarFasEst = 0) GROUP BY T9.BarFasLin, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T4 ON T4.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod," ;
      scmdbuf += " BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod =" ;
      scmdbuf += " T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasSig, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar" ;
      scmdbuf += " FROM (TXPBARFAS T8 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC2, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod," ;
      scmdbuf += " BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) WHERE (T8.BarOrdLin" ;
      scmdbuf += " = T9.GXC2) AND (T8.BarFasEst <> 0) GROUP BY T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo" ;
      scmdbuf += " = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm FROM" ;
      scmdbuf += " TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod = T1.EmprCod AND T7.BarCod = T1.BarCod AND T7.BarCodReo = T1.BarCodReo AND T7.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(T1.MaqCodBis) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarFasEst,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCodReo,'90'), 2))) || T2.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarSit,'90'), 2) like '%' || ?) or ( UPPER(T2.BarSer) like '%' || UPPER(?)) or ( UPPER(T2.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T2.BarColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.BarTipCol,'90'), 2) like '%' || ?) or ( UPPER(T2.BarNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T7.BarKgm, 0),'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T7.BarMtr, 0),'999990.99'), 2) like '%' || ?) or ( UPPER(COALESCE( T6.BarFasSig, ' ')) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T5.BarFasLin, 0),'9990'), 2) like '%' || ?) or ( UPPER(COALESCE( T4.BarFasSig, ' ')) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarOrdLin,'9990'), 2) like '%' || ?) or ( UPPER(T2.BarDibCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarAcaAnh,'9990'), 2) like '%' || ?)))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T6.BarFasSig, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.BarFasSig, ' ') = ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T5.BarFasLin, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T5.BarFasLin, 0) <= ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.BarFasSig, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.BarFasSig, ' ') = ?))");
      addWhere(sWhereString, "(T2.CliCod >= ?)");
      addWhere(sWhereString, "(T2.CliCod <= ?)");
      addWhere(sWhereString, "(T2.BarFecGen >= ?)");
      addWhere(sWhereString, "(T2.BarFecGen <= ?)");
      addWhere(sWhereString, "(T2.BarSit >= ?)");
      addWhere(sWhereString, "(T2.BarSit <= ?)");
      addWhere(sWhereString, "(T1.BarFasEst >= ?)");
      addWhere(sWhereString, "(T1.BarFasEst <= ?)");
      addWhere(sWhereString, "(T2.BarAcaAnh = ? or (? = 0))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.FasCod = ?)");
      if ( (GXutil.strcmp("", AV81TFMaqCodBis_Sel)==0) && ( ! (GXutil.strcmp("", AV80TFMaqCodBis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81TFMaqCodBis_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int29[48] = (byte)(1) ;
      }
      if ( AV11TFBarFasEst_Sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV11TFBarFasEst_Sels, "T1.BarFasEst IN (", ")")+")");
      }
      if ( ! (0==AV12TFCliCod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int29[49] = (byte)(1) ;
      }
      if ( ! (0==AV13TFCliCod_To) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int29[50] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV15TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV14TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[51] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV15TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int29[52] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV19TFBarNHdr_Sel)==0) && ( ! (GXutil.strcmp("", AV18TFBarNHdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[53] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV19TFBarNHdr_Sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int29[54] = (byte)(1) ;
      }
      if ( ! (0==AV20TFBarSit) )
      {
         addWhere(sWhereString, "(T2.BarSit >= ?)");
      }
      else
      {
         GXv_int29[55] = (byte)(1) ;
      }
      if ( ! (0==AV21TFBarSit_To) )
      {
         addWhere(sWhereString, "(T2.BarSit <= ?)");
      }
      else
      {
         GXv_int29[56] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV23TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV22TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[57] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV23TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int29[58] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV25TFBarSerDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV24TFBarSerDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[59] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV25TFBarSerDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int29[60] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV27TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV26TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[61] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV27TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int29[62] = (byte)(1) ;
      }
      if ( ! (0==AV28TFBarColNum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int29[63] = (byte)(1) ;
      }
      if ( ! (0==AV29TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int29[64] = (byte)(1) ;
      }
      if ( ! (0==AV30TFBarTipCol) )
      {
         addWhere(sWhereString, "(T2.BarTipCol >= ?)");
      }
      else
      {
         GXv_int29[65] = (byte)(1) ;
      }
      if ( ! (0==AV31TFBarTipCol_To) )
      {
         addWhere(sWhereString, "(T2.BarTipCol <= ?)");
      }
      else
      {
         GXv_int29[66] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV33TFBarNomCli_Sel)==0) && ( ! (GXutil.strcmp("", AV32TFBarNomCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[67] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV33TFBarNomCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int29[68] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV34TFBarKgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int29[69] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV35TFBarKgm_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int29[70] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV36TFBarMtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int29[71] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV37TFBarMtr_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int29[72] = (byte)(1) ;
      }
      if ( ! (0==AV44TFBarOrdLin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int29[73] = (byte)(1) ;
      }
      if ( ! (0==AV45TFBarOrdLin_To) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int29[74] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87TFBarDibCli_Sel)==0) && ( ! (GXutil.strcmp("", AV86TFBarDibCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarDibCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[75] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87TFBarDibCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarDibCli = ?)");
      }
      else
      {
         GXv_int29[76] = (byte)(1) ;
      }
      if ( ! (0==AV46TFBarAcaAnh) )
      {
         addWhere(sWhereString, "(T2.BarAcaAnh >= ?)");
      }
      else
      {
         GXv_int29[77] = (byte)(1) ;
      }
      if ( ! (0==AV47TFBarAcaAnh_To) )
      {
         addWhere(sWhereString, "(T2.BarAcaAnh <= ?)");
      }
      else
      {
         GXv_int29[78] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.BarDibCli" ;
      GXv_Object30[0] = scmdbuf ;
      GXv_Object30[1] = GXv_int29 ;
      return GXv_Object30 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.IHttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_P093910(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).shortValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).shortValue() , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).byteValue() , (String)dynConstraints[40] , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , ((Number) dynConstraints[46]).byteValue() , (String)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , (java.math.BigDecimal)dynConstraints[49] , ((Number) dynConstraints[50]).shortValue() , (String)dynConstraints[51] , ((Number) dynConstraints[52]).shortValue() , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).shortValue() , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] , ((Number) dynConstraints[60]).shortValue() , ((Number) dynConstraints[61]).shortValue() , (String)dynConstraints[62] , (String)dynConstraints[63] , ((Number) dynConstraints[64]).intValue() , ((Number) dynConstraints[65]).intValue() , (java.util.Date)dynConstraints[66] , (java.util.Date)dynConstraints[67] , (java.util.Date)dynConstraints[68] , ((Number) dynConstraints[69]).byteValue() , ((Number) dynConstraints[70]).byteValue() , ((Number) dynConstraints[71]).byteValue() , ((Number) dynConstraints[72]).byteValue() , ((Number) dynConstraints[73]).shortValue() , (String)dynConstraints[74] , (String)dynConstraints[75] , (String)dynConstraints[76] , (String)dynConstraints[77] );
            case 1 :
                  return conditional_P093919(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).shortValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).shortValue() , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).byteValue() , (String)dynConstraints[40] , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , ((Number) dynConstraints[46]).byteValue() , (String)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , (java.math.BigDecimal)dynConstraints[49] , ((Number) dynConstraints[50]).shortValue() , (String)dynConstraints[51] , ((Number) dynConstraints[52]).shortValue() , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).shortValue() , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] , ((Number) dynConstraints[60]).shortValue() , ((Number) dynConstraints[61]).shortValue() , (String)dynConstraints[62] , (String)dynConstraints[63] , ((Number) dynConstraints[64]).intValue() , ((Number) dynConstraints[65]).intValue() , (java.util.Date)dynConstraints[66] , (java.util.Date)dynConstraints[67] , (java.util.Date)dynConstraints[68] , ((Number) dynConstraints[69]).byteValue() , ((Number) dynConstraints[70]).byteValue() , ((Number) dynConstraints[71]).byteValue() , ((Number) dynConstraints[72]).byteValue() , ((Number) dynConstraints[73]).shortValue() , (String)dynConstraints[74] , (String)dynConstraints[75] , (String)dynConstraints[76] , (String)dynConstraints[77] );
            case 2 :
                  return conditional_P093928(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).shortValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).shortValue() , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).byteValue() , (String)dynConstraints[40] , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , ((Number) dynConstraints[46]).byteValue() , (String)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , (java.math.BigDecimal)dynConstraints[49] , ((Number) dynConstraints[50]).shortValue() , (String)dynConstraints[51] , ((Number) dynConstraints[52]).shortValue() , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).shortValue() , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] , ((Number) dynConstraints[60]).shortValue() , ((Number) dynConstraints[61]).shortValue() , (String)dynConstraints[62] , (String)dynConstraints[63] , ((Number) dynConstraints[64]).intValue() , ((Number) dynConstraints[65]).intValue() , (java.util.Date)dynConstraints[66] , (java.util.Date)dynConstraints[67] , (java.util.Date)dynConstraints[68] , ((Number) dynConstraints[69]).byteValue() , ((Number) dynConstraints[70]).byteValue() , ((Number) dynConstraints[71]).byteValue() , ((Number) dynConstraints[72]).byteValue() , ((Number) dynConstraints[73]).shortValue() , (String)dynConstraints[74] , (String)dynConstraints[75] , (String)dynConstraints[76] , (String)dynConstraints[77] );
            case 3 :
                  return conditional_P093937(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).shortValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).shortValue() , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).byteValue() , (String)dynConstraints[40] , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , ((Number) dynConstraints[46]).byteValue() , (String)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , (java.math.BigDecimal)dynConstraints[49] , ((Number) dynConstraints[50]).shortValue() , (String)dynConstraints[51] , ((Number) dynConstraints[52]).shortValue() , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).shortValue() , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] , ((Number) dynConstraints[60]).shortValue() , ((Number) dynConstraints[61]).shortValue() , (String)dynConstraints[62] , (String)dynConstraints[63] , ((Number) dynConstraints[64]).intValue() , ((Number) dynConstraints[65]).intValue() , (java.util.Date)dynConstraints[66] , (java.util.Date)dynConstraints[67] , (java.util.Date)dynConstraints[68] , ((Number) dynConstraints[69]).byteValue() , ((Number) dynConstraints[70]).byteValue() , ((Number) dynConstraints[71]).byteValue() , ((Number) dynConstraints[72]).byteValue() , ((Number) dynConstraints[73]).shortValue() , (String)dynConstraints[74] , (String)dynConstraints[75] , (String)dynConstraints[76] , (String)dynConstraints[77] );
            case 4 :
                  return conditional_P093946(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).shortValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).shortValue() , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).byteValue() , (String)dynConstraints[40] , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , ((Number) dynConstraints[46]).byteValue() , (String)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , (java.math.BigDecimal)dynConstraints[49] , ((Number) dynConstraints[50]).shortValue() , (String)dynConstraints[51] , ((Number) dynConstraints[52]).shortValue() , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).shortValue() , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] , ((Number) dynConstraints[60]).shortValue() , ((Number) dynConstraints[61]).shortValue() , (String)dynConstraints[62] , (String)dynConstraints[63] , ((Number) dynConstraints[64]).intValue() , ((Number) dynConstraints[65]).intValue() , (java.util.Date)dynConstraints[66] , (java.util.Date)dynConstraints[67] , (java.util.Date)dynConstraints[68] , ((Number) dynConstraints[69]).byteValue() , ((Number) dynConstraints[70]).byteValue() , ((Number) dynConstraints[71]).byteValue() , ((Number) dynConstraints[72]).byteValue() , ((Number) dynConstraints[73]).shortValue() , (String)dynConstraints[74] , (String)dynConstraints[75] , (String)dynConstraints[76] , (String)dynConstraints[77] );
            case 5 :
                  return conditional_P093955(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).shortValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).shortValue() , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).byteValue() , (String)dynConstraints[40] , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , ((Number) dynConstraints[46]).byteValue() , (String)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , (java.math.BigDecimal)dynConstraints[49] , ((Number) dynConstraints[50]).shortValue() , (String)dynConstraints[51] , ((Number) dynConstraints[52]).shortValue() , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).shortValue() , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] , ((Number) dynConstraints[60]).shortValue() , ((Number) dynConstraints[61]).shortValue() , (String)dynConstraints[62] , (String)dynConstraints[63] , ((Number) dynConstraints[64]).intValue() , ((Number) dynConstraints[65]).intValue() , (java.util.Date)dynConstraints[66] , (java.util.Date)dynConstraints[67] , (java.util.Date)dynConstraints[68] , ((Number) dynConstraints[69]).byteValue() , ((Number) dynConstraints[70]).byteValue() , ((Number) dynConstraints[71]).byteValue() , ((Number) dynConstraints[72]).byteValue() , ((Number) dynConstraints[73]).shortValue() , (String)dynConstraints[74] , (String)dynConstraints[75] , (String)dynConstraints[76] , (String)dynConstraints[77] );
            case 6 :
                  return conditional_P093964(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).shortValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).shortValue() , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).byteValue() , (String)dynConstraints[40] , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , ((Number) dynConstraints[46]).byteValue() , (String)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , (java.math.BigDecimal)dynConstraints[49] , ((Number) dynConstraints[50]).shortValue() , (String)dynConstraints[51] , ((Number) dynConstraints[52]).shortValue() , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).shortValue() , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] , ((Number) dynConstraints[60]).shortValue() , ((Number) dynConstraints[61]).shortValue() , (String)dynConstraints[62] , (String)dynConstraints[63] , ((Number) dynConstraints[64]).intValue() , ((Number) dynConstraints[65]).intValue() , (java.util.Date)dynConstraints[66] , (java.util.Date)dynConstraints[67] , (java.util.Date)dynConstraints[68] , ((Number) dynConstraints[69]).byteValue() , ((Number) dynConstraints[70]).byteValue() , ((Number) dynConstraints[71]).byteValue() , ((Number) dynConstraints[72]).byteValue() , ((Number) dynConstraints[73]).shortValue() , (String)dynConstraints[74] , (String)dynConstraints[75] , (String)dynConstraints[76] , (String)dynConstraints[77] );
            case 7 :
                  return conditional_P093973(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).shortValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).shortValue() , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).byteValue() , (String)dynConstraints[40] , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , ((Number) dynConstraints[46]).byteValue() , (String)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , (java.math.BigDecimal)dynConstraints[49] , ((Number) dynConstraints[50]).shortValue() , (String)dynConstraints[51] , ((Number) dynConstraints[52]).shortValue() , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).shortValue() , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] , ((Number) dynConstraints[60]).shortValue() , ((Number) dynConstraints[61]).shortValue() , (String)dynConstraints[62] , (String)dynConstraints[63] , ((Number) dynConstraints[64]).intValue() , ((Number) dynConstraints[65]).intValue() , (java.util.Date)dynConstraints[66] , (java.util.Date)dynConstraints[67] , (java.util.Date)dynConstraints[68] , ((Number) dynConstraints[69]).byteValue() , ((Number) dynConstraints[70]).byteValue() , ((Number) dynConstraints[71]).byteValue() , ((Number) dynConstraints[72]).byteValue() , ((Number) dynConstraints[73]).shortValue() , (String)dynConstraints[74] , (String)dynConstraints[75] , (String)dynConstraints[76] , (String)dynConstraints[77] );
            case 8 :
                  return conditional_P093982(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).shortValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).shortValue() , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).byteValue() , (String)dynConstraints[40] , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , ((Number) dynConstraints[46]).byteValue() , (String)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , (java.math.BigDecimal)dynConstraints[49] , ((Number) dynConstraints[50]).shortValue() , (String)dynConstraints[51] , ((Number) dynConstraints[52]).shortValue() , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).shortValue() , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] , ((Number) dynConstraints[60]).shortValue() , ((Number) dynConstraints[61]).shortValue() , (String)dynConstraints[62] , (String)dynConstraints[63] , ((Number) dynConstraints[64]).intValue() , ((Number) dynConstraints[65]).intValue() , (java.util.Date)dynConstraints[66] , (java.util.Date)dynConstraints[67] , (java.util.Date)dynConstraints[68] , ((Number) dynConstraints[69]).byteValue() , ((Number) dynConstraints[70]).byteValue() , ((Number) dynConstraints[71]).byteValue() , ((Number) dynConstraints[72]).byteValue() , ((Number) dynConstraints[73]).shortValue() , (String)dynConstraints[74] , (String)dynConstraints[75] , (String)dynConstraints[76] , (String)dynConstraints[77] );
            case 9 :
                  return conditional_P093991(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).shortValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).shortValue() , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).byteValue() , (String)dynConstraints[40] , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , ((Number) dynConstraints[46]).byteValue() , (String)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , (java.math.BigDecimal)dynConstraints[49] , ((Number) dynConstraints[50]).shortValue() , (String)dynConstraints[51] , ((Number) dynConstraints[52]).shortValue() , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).shortValue() , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] , ((Number) dynConstraints[60]).shortValue() , ((Number) dynConstraints[61]).shortValue() , (String)dynConstraints[62] , (String)dynConstraints[63] , ((Number) dynConstraints[64]).intValue() , ((Number) dynConstraints[65]).intValue() , (java.util.Date)dynConstraints[66] , (java.util.Date)dynConstraints[67] , (java.util.Date)dynConstraints[68] , ((Number) dynConstraints[69]).byteValue() , ((Number) dynConstraints[70]).byteValue() , ((Number) dynConstraints[71]).byteValue() , ((Number) dynConstraints[72]).byteValue() , ((Number) dynConstraints[73]).shortValue() , (String)dynConstraints[74] , (String)dynConstraints[75] , (String)dynConstraints[76] , (String)dynConstraints[77] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P093910", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P093919", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P093928", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P093937", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P093946", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P093955", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P093964", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P093973", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P093982", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P093991", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 13);
               ((String[]) buf[11])[0] = rslt.getString(12, 26);
               ((String[]) buf[12])[0] = rslt.getString(13, 16);
               ((byte[]) buf[13])[0] = rslt.getByte(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 11);
               ((String[]) buf[15])[0] = rslt.getString(16, 30);
               ((int[]) buf[16])[0] = rslt.getInt(17);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((byte[]) buf[18])[0] = rslt.getByte(18);
               ((String[]) buf[19])[0] = rslt.getString(19, 8);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(20);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(21, 8);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(22,2);
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(23,2);
               ((int[]) buf[27])[0] = rslt.getInt(24);
               ((byte[]) buf[28])[0] = rslt.getByte(25);
               ((String[]) buf[29])[0] = rslt.getString(26, 1);
               ((String[]) buf[30])[0] = rslt.getString(27, 8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 13);
               ((String[]) buf[11])[0] = rslt.getString(12, 26);
               ((String[]) buf[12])[0] = rslt.getString(13, 16);
               ((byte[]) buf[13])[0] = rslt.getByte(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 11);
               ((int[]) buf[15])[0] = rslt.getInt(16);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((byte[]) buf[17])[0] = rslt.getByte(17);
               ((String[]) buf[18])[0] = rslt.getString(18, 6);
               ((String[]) buf[19])[0] = rslt.getString(19, 8);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(20);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(21, 8);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(22,2);
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(23,2);
               ((int[]) buf[27])[0] = rslt.getInt(24);
               ((byte[]) buf[28])[0] = rslt.getByte(25);
               ((String[]) buf[29])[0] = rslt.getString(26, 1);
               ((String[]) buf[30])[0] = rslt.getString(27, 8);
               return;
            case 2 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 13);
               ((String[]) buf[10])[0] = rslt.getString(11, 26);
               ((String[]) buf[11])[0] = rslt.getString(12, 16);
               ((byte[]) buf[12])[0] = rslt.getByte(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 11);
               ((String[]) buf[14])[0] = rslt.getString(15, 30);
               ((int[]) buf[15])[0] = rslt.getInt(16);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((byte[]) buf[17])[0] = rslt.getByte(17);
               ((String[]) buf[18])[0] = rslt.getString(18, 6);
               ((String[]) buf[19])[0] = rslt.getString(19, 8);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(20);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(21, 8);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(22,2);
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(23,2);
               ((int[]) buf[27])[0] = rslt.getInt(24);
               ((byte[]) buf[28])[0] = rslt.getByte(25);
               ((String[]) buf[29])[0] = rslt.getString(26, 1);
               ((String[]) buf[30])[0] = rslt.getString(27, 8);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 13);
               ((String[]) buf[11])[0] = rslt.getString(12, 26);
               ((byte[]) buf[12])[0] = rslt.getByte(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 11);
               ((String[]) buf[14])[0] = rslt.getString(15, 30);
               ((int[]) buf[15])[0] = rslt.getInt(16);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((byte[]) buf[17])[0] = rslt.getByte(17);
               ((String[]) buf[18])[0] = rslt.getString(18, 6);
               ((String[]) buf[19])[0] = rslt.getString(19, 8);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(20);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(21, 8);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(22,2);
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(23,2);
               ((int[]) buf[27])[0] = rslt.getInt(24);
               ((byte[]) buf[28])[0] = rslt.getByte(25);
               ((String[]) buf[29])[0] = rslt.getString(26, 1);
               ((String[]) buf[30])[0] = rslt.getString(27, 8);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 13);
               ((String[]) buf[11])[0] = rslt.getString(12, 16);
               ((byte[]) buf[12])[0] = rslt.getByte(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 11);
               ((String[]) buf[14])[0] = rslt.getString(15, 30);
               ((int[]) buf[15])[0] = rslt.getInt(16);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((byte[]) buf[17])[0] = rslt.getByte(17);
               ((String[]) buf[18])[0] = rslt.getString(18, 6);
               ((String[]) buf[19])[0] = rslt.getString(19, 8);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(20);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(21, 8);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(22,2);
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(23,2);
               ((int[]) buf[27])[0] = rslt.getInt(24);
               ((byte[]) buf[28])[0] = rslt.getByte(25);
               ((String[]) buf[29])[0] = rslt.getString(26, 1);
               ((String[]) buf[30])[0] = rslt.getString(27, 8);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 26);
               ((String[]) buf[11])[0] = rslt.getString(12, 16);
               ((byte[]) buf[12])[0] = rslt.getByte(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 11);
               ((String[]) buf[14])[0] = rslt.getString(15, 30);
               ((int[]) buf[15])[0] = rslt.getInt(16);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((byte[]) buf[17])[0] = rslt.getByte(17);
               ((String[]) buf[18])[0] = rslt.getString(18, 6);
               ((String[]) buf[19])[0] = rslt.getString(19, 8);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(20);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(21, 8);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(22,2);
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(23,2);
               ((int[]) buf[27])[0] = rslt.getInt(24);
               ((byte[]) buf[28])[0] = rslt.getByte(25);
               ((String[]) buf[29])[0] = rslt.getString(26, 1);
               ((String[]) buf[30])[0] = rslt.getString(27, 8);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 13);
               ((String[]) buf[10])[0] = rslt.getString(11, 26);
               ((String[]) buf[11])[0] = rslt.getString(12, 16);
               ((byte[]) buf[12])[0] = rslt.getByte(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 11);
               ((String[]) buf[14])[0] = rslt.getString(15, 30);
               ((int[]) buf[15])[0] = rslt.getInt(16);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((byte[]) buf[17])[0] = rslt.getByte(17);
               ((String[]) buf[18])[0] = rslt.getString(18, 6);
               ((String[]) buf[19])[0] = rslt.getString(19, 8);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(20);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(21, 8);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(22,2);
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(23,2);
               ((int[]) buf[27])[0] = rslt.getInt(24);
               ((byte[]) buf[28])[0] = rslt.getByte(25);
               ((String[]) buf[29])[0] = rslt.getString(26, 1);
               ((String[]) buf[30])[0] = rslt.getString(27, 8);
               return;
            case 7 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 13);
               ((String[]) buf[10])[0] = rslt.getString(11, 26);
               ((String[]) buf[11])[0] = rslt.getString(12, 16);
               ((byte[]) buf[12])[0] = rslt.getByte(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 11);
               ((String[]) buf[14])[0] = rslt.getString(15, 30);
               ((int[]) buf[15])[0] = rslt.getInt(16);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((byte[]) buf[17])[0] = rslt.getByte(17);
               ((String[]) buf[18])[0] = rslt.getString(18, 6);
               ((String[]) buf[19])[0] = rslt.getString(19, 8);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(20);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(21, 8);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(22,2);
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(23,2);
               ((int[]) buf[27])[0] = rslt.getInt(24);
               ((byte[]) buf[28])[0] = rslt.getByte(25);
               ((String[]) buf[29])[0] = rslt.getString(26, 1);
               ((String[]) buf[30])[0] = rslt.getString(27, 8);
               return;
            case 8 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 13);
               ((String[]) buf[10])[0] = rslt.getString(11, 26);
               ((String[]) buf[11])[0] = rslt.getString(12, 16);
               ((byte[]) buf[12])[0] = rslt.getByte(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 11);
               ((String[]) buf[14])[0] = rslt.getString(15, 30);
               ((int[]) buf[15])[0] = rslt.getInt(16);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((byte[]) buf[17])[0] = rslt.getByte(17);
               ((String[]) buf[18])[0] = rslt.getString(18, 6);
               ((String[]) buf[19])[0] = rslt.getString(19, 8);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(20);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(21, 8);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(22,2);
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(23,2);
               ((int[]) buf[27])[0] = rslt.getInt(24);
               ((byte[]) buf[28])[0] = rslt.getByte(25);
               ((String[]) buf[29])[0] = rslt.getString(26, 1);
               ((String[]) buf[30])[0] = rslt.getString(27, 8);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 13);
               ((String[]) buf[10])[0] = rslt.getString(11, 26);
               ((String[]) buf[11])[0] = rslt.getString(12, 16);
               ((byte[]) buf[12])[0] = rslt.getByte(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 11);
               ((String[]) buf[14])[0] = rslt.getString(15, 30);
               ((int[]) buf[15])[0] = rslt.getInt(16);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((byte[]) buf[17])[0] = rslt.getByte(17);
               ((String[]) buf[18])[0] = rslt.getString(18, 6);
               ((String[]) buf[19])[0] = rslt.getString(19, 8);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(20);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(21, 8);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(22,2);
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(23,2);
               ((int[]) buf[27])[0] = rslt.getInt(24);
               ((byte[]) buf[28])[0] = rslt.getByte(25);
               ((String[]) buf[29])[0] = rslt.getString(26, 1);
               ((String[]) buf[30])[0] = rslt.getString(27, 8);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      short sIdx;
      switch ( cursor )
      {
            case 0 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[85], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[86], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[87], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[88], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[89], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[90], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[92], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[93], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[94], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[95], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[96], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[97], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[98], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[99], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[100], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 8);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[102], 8);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 8);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[104], 8);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[105], 8);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[106]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[107]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[108]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[109]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[110], 8);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[111], 8);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 8);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 8);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[114], 8);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[115]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[116]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[117]);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[118]);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[119]).byteValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[120]).byteValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[121]).byteValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[122]).byteValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[123]).shortValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[124]).shortValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[125], 8);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[126], 6);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[127], 6);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[128]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[129]).intValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[130], 30);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[131], 30);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[132], 11);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[133], 11);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[134]).byteValue());
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[135]).byteValue());
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[136], 16);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[137], 16);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[138], 26);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[139], 26);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[140], 13);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[141], 13);
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[142]).intValue());
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[143]).intValue());
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[144]).byteValue());
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[145]).byteValue());
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[146], 13);
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[147], 13);
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[148], 2);
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[149], 2);
               }
               if ( ((Number) parms[71]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[150], 2);
               }
               if ( ((Number) parms[72]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[151], 2);
               }
               if ( ((Number) parms[73]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[152]).shortValue());
               }
               if ( ((Number) parms[74]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[153]).shortValue());
               }
               if ( ((Number) parms[75]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[154], 16);
               }
               if ( ((Number) parms[76]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[155], 16);
               }
               if ( ((Number) parms[77]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[156]).shortValue());
               }
               if ( ((Number) parms[78]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[157]).shortValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[85], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[86], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[87], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[88], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[89], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[90], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[92], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[93], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[94], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[95], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[96], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[97], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[98], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[99], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 8);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 8);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[102], 8);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 8);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[104], 8);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[105]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[106]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[107]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[108]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[109], 8);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[110], 8);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[111], 8);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 8);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 8);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[114]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[115]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[116]);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[117]);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[118]).byteValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[119]).byteValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[120]).byteValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[121]).byteValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[122]).shortValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[123]).shortValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[124], 3);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[125], 8);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[126], 6);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[127], 6);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[128]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[129]).intValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[130], 30);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[131], 30);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[132], 11);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[133], 11);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[134]).byteValue());
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[135]).byteValue());
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[136], 16);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[137], 16);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[138], 26);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[139], 26);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[140], 13);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[141], 13);
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[142]).intValue());
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[143]).intValue());
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[144]).byteValue());
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[145]).byteValue());
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[146], 13);
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[147], 13);
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[148], 2);
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[149], 2);
               }
               if ( ((Number) parms[71]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[150], 2);
               }
               if ( ((Number) parms[72]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[151], 2);
               }
               if ( ((Number) parms[73]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[152]).shortValue());
               }
               if ( ((Number) parms[74]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[153]).shortValue());
               }
               if ( ((Number) parms[75]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[154], 16);
               }
               if ( ((Number) parms[76]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[155], 16);
               }
               if ( ((Number) parms[77]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[156]).shortValue());
               }
               if ( ((Number) parms[78]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[157]).shortValue());
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[85], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[86], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[87], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[88], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[89], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[90], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[92], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[93], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[94], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[95], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[96], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[97], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[98], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[99], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[100], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[101], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[102], 8);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 8);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[104], 8);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[105], 8);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[106], 8);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[107]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[108]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[109]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[110]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[111], 8);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 8);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 8);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[114], 8);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[115], 8);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[116]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[117]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[118]);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[119]);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[120]).byteValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[121]).byteValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[122]).byteValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[123]).byteValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[124]).shortValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[125]).shortValue());
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[126], 6);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[127], 6);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[128]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[129]).intValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[130], 30);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[131], 30);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[132], 11);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[133], 11);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[134]).byteValue());
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[135]).byteValue());
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[136], 16);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[137], 16);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[138], 26);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[139], 26);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[140], 13);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[141], 13);
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[142]).intValue());
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[143]).intValue());
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[144]).byteValue());
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[145]).byteValue());
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[146], 13);
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[147], 13);
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[148], 2);
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[149], 2);
               }
               if ( ((Number) parms[71]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[150], 2);
               }
               if ( ((Number) parms[72]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[151], 2);
               }
               if ( ((Number) parms[73]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[152]).shortValue());
               }
               if ( ((Number) parms[74]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[153]).shortValue());
               }
               if ( ((Number) parms[75]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[154], 16);
               }
               if ( ((Number) parms[76]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[155], 16);
               }
               if ( ((Number) parms[77]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[156]).shortValue());
               }
               if ( ((Number) parms[78]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[157]).shortValue());
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[85], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[86], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[87], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[88], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[89], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[90], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[92], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[93], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[94], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[95], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[96], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[97], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[98], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[99], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 8);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 8);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[102], 8);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 8);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[104], 8);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[105]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[106]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[107]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[108]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[109], 8);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[110], 8);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[111], 8);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 8);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 8);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[114]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[115]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[116]);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[117]);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[118]).byteValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[119]).byteValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[120]).byteValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[121]).byteValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[122]).shortValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[123]).shortValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[124], 3);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[125], 8);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[126], 6);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[127], 6);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[128]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[129]).intValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[130], 30);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[131], 30);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[132], 11);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[133], 11);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[134]).byteValue());
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[135]).byteValue());
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[136], 16);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[137], 16);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[138], 26);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[139], 26);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[140], 13);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[141], 13);
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[142]).intValue());
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[143]).intValue());
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[144]).byteValue());
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[145]).byteValue());
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[146], 13);
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[147], 13);
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[148], 2);
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[149], 2);
               }
               if ( ((Number) parms[71]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[150], 2);
               }
               if ( ((Number) parms[72]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[151], 2);
               }
               if ( ((Number) parms[73]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[152]).shortValue());
               }
               if ( ((Number) parms[74]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[153]).shortValue());
               }
               if ( ((Number) parms[75]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[154], 16);
               }
               if ( ((Number) parms[76]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[155], 16);
               }
               if ( ((Number) parms[77]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[156]).shortValue());
               }
               if ( ((Number) parms[78]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[157]).shortValue());
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[85], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[86], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[87], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[88], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[89], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[90], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[92], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[93], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[94], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[95], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[96], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[97], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[98], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[99], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 8);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 8);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[102], 8);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 8);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[104], 8);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[105]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[106]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[107]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[108]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[109], 8);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[110], 8);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[111], 8);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 8);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 8);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[114]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[115]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[116]);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[117]);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[118]).byteValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[119]).byteValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[120]).byteValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[121]).byteValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[122]).shortValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[123]).shortValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[124], 3);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[125], 8);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[126], 6);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[127], 6);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[128]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[129]).intValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[130], 30);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[131], 30);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[132], 11);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[133], 11);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[134]).byteValue());
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[135]).byteValue());
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[136], 16);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[137], 16);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[138], 26);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[139], 26);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[140], 13);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[141], 13);
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[142]).intValue());
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[143]).intValue());
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[144]).byteValue());
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[145]).byteValue());
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[146], 13);
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[147], 13);
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[148], 2);
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[149], 2);
               }
               if ( ((Number) parms[71]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[150], 2);
               }
               if ( ((Number) parms[72]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[151], 2);
               }
               if ( ((Number) parms[73]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[152]).shortValue());
               }
               if ( ((Number) parms[74]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[153]).shortValue());
               }
               if ( ((Number) parms[75]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[154], 16);
               }
               if ( ((Number) parms[76]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[155], 16);
               }
               if ( ((Number) parms[77]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[156]).shortValue());
               }
               if ( ((Number) parms[78]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[157]).shortValue());
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[85], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[86], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[87], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[88], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[89], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[90], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[92], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[93], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[94], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[95], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[96], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[97], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[98], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[99], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 8);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 8);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[102], 8);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 8);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[104], 8);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[105]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[106]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[107]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[108]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[109], 8);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[110], 8);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[111], 8);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 8);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 8);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[114]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[115]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[116]);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[117]);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[118]).byteValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[119]).byteValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[120]).byteValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[121]).byteValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[122]).shortValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[123]).shortValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[124], 3);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[125], 8);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[126], 6);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[127], 6);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[128]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[129]).intValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[130], 30);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[131], 30);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[132], 11);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[133], 11);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[134]).byteValue());
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[135]).byteValue());
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[136], 16);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[137], 16);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[138], 26);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[139], 26);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[140], 13);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[141], 13);
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[142]).intValue());
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[143]).intValue());
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[144]).byteValue());
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[145]).byteValue());
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[146], 13);
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[147], 13);
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[148], 2);
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[149], 2);
               }
               if ( ((Number) parms[71]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[150], 2);
               }
               if ( ((Number) parms[72]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[151], 2);
               }
               if ( ((Number) parms[73]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[152]).shortValue());
               }
               if ( ((Number) parms[74]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[153]).shortValue());
               }
               if ( ((Number) parms[75]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[154], 16);
               }
               if ( ((Number) parms[76]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[155], 16);
               }
               if ( ((Number) parms[77]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[156]).shortValue());
               }
               if ( ((Number) parms[78]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[157]).shortValue());
               }
               return;
            case 6 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[85], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[86], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[87], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[88], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[89], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[90], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[92], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[93], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[94], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[95], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[96], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[97], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[98], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[99], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 8);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 8);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[102], 8);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 8);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[104], 8);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[105]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[106]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[107]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[108]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[109], 8);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[110], 8);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[111], 8);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 8);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 8);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[114]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[115]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[116]);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[117]);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[118]).byteValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[119]).byteValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[120]).byteValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[121]).byteValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[122]).shortValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[123]).shortValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[124], 3);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[125], 8);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[126], 6);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[127], 6);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[128]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[129]).intValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[130], 30);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[131], 30);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[132], 11);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[133], 11);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[134]).byteValue());
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[135]).byteValue());
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[136], 16);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[137], 16);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[138], 26);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[139], 26);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[140], 13);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[141], 13);
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[142]).intValue());
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[143]).intValue());
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[144]).byteValue());
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[145]).byteValue());
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[146], 13);
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[147], 13);
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[148], 2);
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[149], 2);
               }
               if ( ((Number) parms[71]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[150], 2);
               }
               if ( ((Number) parms[72]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[151], 2);
               }
               if ( ((Number) parms[73]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[152]).shortValue());
               }
               if ( ((Number) parms[74]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[153]).shortValue());
               }
               if ( ((Number) parms[75]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[154], 16);
               }
               if ( ((Number) parms[76]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[155], 16);
               }
               if ( ((Number) parms[77]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[156]).shortValue());
               }
               if ( ((Number) parms[78]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[157]).shortValue());
               }
               return;
            case 7 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[85], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[86], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[87], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[88], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[89], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[90], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[92], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[93], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[94], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[95], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[96], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[97], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[98], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[99], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[100], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[101], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[102], 8);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 8);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[104], 8);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[105], 8);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[106], 8);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[107]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[108]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[109]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[110]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[111], 8);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 8);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 8);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[114], 8);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[115], 8);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[116]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[117]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[118]);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[119]);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[120]).byteValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[121]).byteValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[122]).byteValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[123]).byteValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[124]).shortValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[125]).shortValue());
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[126], 6);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[127], 6);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[128]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[129]).intValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[130], 30);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[131], 30);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[132], 11);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[133], 11);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[134]).byteValue());
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[135]).byteValue());
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[136], 16);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[137], 16);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[138], 26);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[139], 26);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[140], 13);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[141], 13);
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[142]).intValue());
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[143]).intValue());
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[144]).byteValue());
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[145]).byteValue());
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[146], 13);
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[147], 13);
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[148], 2);
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[149], 2);
               }
               if ( ((Number) parms[71]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[150], 2);
               }
               if ( ((Number) parms[72]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[151], 2);
               }
               if ( ((Number) parms[73]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[152]).shortValue());
               }
               if ( ((Number) parms[74]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[153]).shortValue());
               }
               if ( ((Number) parms[75]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[154], 16);
               }
               if ( ((Number) parms[76]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[155], 16);
               }
               if ( ((Number) parms[77]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[156]).shortValue());
               }
               if ( ((Number) parms[78]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[157]).shortValue());
               }
               return;
            case 8 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[85], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[86], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[87], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[88], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[89], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[90], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[92], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[93], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[94], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[95], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[96], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[97], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[98], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[99], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[100], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[101], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[102], 8);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 8);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[104], 8);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[105], 8);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[106], 8);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[107]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[108]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[109]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[110]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[111], 8);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 8);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 8);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[114], 8);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[115], 8);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[116]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[117]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[118]);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[119]);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[120]).byteValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[121]).byteValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[122]).byteValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[123]).byteValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[124]).shortValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[125]).shortValue());
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[126], 6);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[127], 6);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[128]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[129]).intValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[130], 30);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[131], 30);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[132], 11);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[133], 11);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[134]).byteValue());
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[135]).byteValue());
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[136], 16);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[137], 16);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[138], 26);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[139], 26);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[140], 13);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[141], 13);
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[142]).intValue());
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[143]).intValue());
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[144]).byteValue());
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[145]).byteValue());
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[146], 13);
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[147], 13);
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[148], 2);
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[149], 2);
               }
               if ( ((Number) parms[71]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[150], 2);
               }
               if ( ((Number) parms[72]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[151], 2);
               }
               if ( ((Number) parms[73]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[152]).shortValue());
               }
               if ( ((Number) parms[74]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[153]).shortValue());
               }
               if ( ((Number) parms[75]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[154], 16);
               }
               if ( ((Number) parms[76]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[155], 16);
               }
               if ( ((Number) parms[77]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[156]).shortValue());
               }
               if ( ((Number) parms[78]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[157]).shortValue());
               }
               return;
            case 9 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[85], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[86], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[87], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[88], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[89], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[90], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[92], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[93], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[94], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[95], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[96], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[97], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[98], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[99], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 8);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 8);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[102], 8);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 8);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[104], 8);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[105]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[106]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[107]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[108]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[109], 8);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[110], 8);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[111], 8);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 8);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 8);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[114]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[115]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[116]);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[117]);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[118]).byteValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[119]).byteValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[120]).byteValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[121]).byteValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[122]).shortValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[123]).shortValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[124], 3);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[125], 8);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[126], 6);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[127], 6);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[128]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[129]).intValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[130], 30);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[131], 30);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[132], 11);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[133], 11);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[134]).byteValue());
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[135]).byteValue());
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[136], 16);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[137], 16);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[138], 26);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[139], 26);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[140], 13);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[141], 13);
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[142]).intValue());
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[143]).intValue());
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[144]).byteValue());
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[145]).byteValue());
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[146], 13);
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[147], 13);
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[148], 2);
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[149], 2);
               }
               if ( ((Number) parms[71]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[150], 2);
               }
               if ( ((Number) parms[72]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[151], 2);
               }
               if ( ((Number) parms[73]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[152]).shortValue());
               }
               if ( ((Number) parms[74]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[153]).shortValue());
               }
               if ( ((Number) parms[75]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[154], 16);
               }
               if ( ((Number) parms[76]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[155], 16);
               }
               if ( ((Number) parms[77]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[156]).shortValue());
               }
               if ( ((Number) parms[78]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[157]).shortValue());
               }
               return;
      }
   }

}

