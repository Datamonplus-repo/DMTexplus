package app.produccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class cargasproduccionporproceso_wcgetfilterdata extends GXProcedure
{
   public cargasproduccionporproceso_wcgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( cargasproduccionporproceso_wcgetfilterdata.class ), "" );
   }

   public cargasproduccionporproceso_wcgetfilterdata( int remoteHandle ,
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
      cargasproduccionporproceso_wcgetfilterdata.this.aP5 = new String[] {""};
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
      cargasproduccionporproceso_wcgetfilterdata.this.AV26DDOName = aP0;
      cargasproduccionporproceso_wcgetfilterdata.this.AV27SearchTxt = aP1;
      cargasproduccionporproceso_wcgetfilterdata.this.AV28SearchTxtTo = aP2;
      cargasproduccionporproceso_wcgetfilterdata.this.aP3 = aP3;
      cargasproduccionporproceso_wcgetfilterdata.this.aP4 = aP4;
      cargasproduccionporproceso_wcgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV16Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV18OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV19OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV26DDOName), "DDO_CLINOM") == 0 )
      {
         /* Execute user subroutine: 'LOADCLINOMOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV26DDOName), "DDO_BARCODPAR") == 0 )
      {
         /* Execute user subroutine: 'LOADBARCODPAROPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV26DDOName), "DDO_BARSER") == 0 )
      {
         /* Execute user subroutine: 'LOADBARSEROPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV26DDOName), "DDO_BARSERDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADBARSERDSCOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV26DDOName), "DDO_BARCOLNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADBARCOLNOMOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV26DDOName), "DDO_BARNOMCLI") == 0 )
      {
         /* Execute user subroutine: 'LOADBARNOMCLIOPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV26DDOName), "DDO_BARFASCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADBARFASCODOPTIONS' */
         S181 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV29OptionsJson = AV16Options.toJSonString(false) ;
      AV30OptionsDescJson = AV18OptionsDesc.toJSonString(false) ;
      AV31OptionIndexesJson = AV19OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV21Session.getValue("Produccion.CargasProduccionporProceso_WCGridState"), "") == 0 )
      {
         AV23GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Produccion.CargasProduccionporProceso_WCGridState"), null, null);
      }
      else
      {
         AV23GridState.fromxml(AV21Session.getValue("Produccion.CargasProduccionporProceso_WCGridState"), null, null);
      }
      AV76GXV1 = 1 ;
      while ( AV76GXV1 <= AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV24GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV76GXV1));
         if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV62FilterFullText = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFASEST_SEL") == 0 )
         {
            AV72TFProFasEst_SelsJson = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV73TFProFasEst_Sels.fromJSonString(AV72TFProFasEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV34TFCliCod = (int)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV35TFCliCod_To = (int)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV36TFCliNom = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV37TFCliNom_Sel = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOD") == 0 )
         {
            AV38TFBarCod = (int)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV39TFBarCod_To = (int)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODREO") == 0 )
         {
            AV40TFBarCodReo = (byte)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV41TFBarCodReo_To = (byte)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODPAR") == 0 )
         {
            AV42TFBarCodPar = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODPAR_SEL") == 0 )
         {
            AV43TFBarCodPar_Sel = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSIT") == 0 )
         {
            AV44TFBarSit = (byte)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV45TFBarSit_To = (byte)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV46TFBarSer = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV47TFBarSer_Sel = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV48TFBarSerDsc = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV49TFBarSerDsc_Sel = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV50TFBarColNom = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV51TFBarColNom_Sel = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUM") == 0 )
         {
            AV52TFBarColNum = (int)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV53TFBarColNum_To = (int)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI") == 0 )
         {
            AV54TFBarNomCli = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI_SEL") == 0 )
         {
            AV55TFBarNomCli_Sel = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARKGM") == 0 )
         {
            AV56TFBarKgm = CommonUtil.decimalVal( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV57TFBarKgm_To = CommonUtil.decimalVal( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMTR") == 0 )
         {
            AV58TFBarMtr = CommonUtil.decimalVal( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV59TFBarMtr_To = CommonUtil.decimalVal( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASCOD") == 0 )
         {
            AV60TFBarFasCod = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASCOD_SEL") == 0 )
         {
            AV61TFBarFasCod_Sel = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV76GXV1 = (int)(AV76GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV36TFCliNom = AV27SearchTxt ;
      AV37TFCliNom_Sel = "" ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(A760ProFasEst) ,
                                           AV73TFProFasEst_Sels ,
                                           Integer.valueOf(AV34TFCliCod) ,
                                           Integer.valueOf(AV35TFCliCod_To) ,
                                           AV37TFCliNom_Sel ,
                                           AV36TFCliNom ,
                                           Integer.valueOf(AV38TFBarCod) ,
                                           Integer.valueOf(AV39TFBarCod_To) ,
                                           Byte.valueOf(AV40TFBarCodReo) ,
                                           Byte.valueOf(AV41TFBarCodReo_To) ,
                                           AV43TFBarCodPar_Sel ,
                                           AV42TFBarCodPar ,
                                           Byte.valueOf(AV44TFBarSit) ,
                                           Byte.valueOf(AV45TFBarSit_To) ,
                                           AV47TFBarSer_Sel ,
                                           AV46TFBarSer ,
                                           AV49TFBarSerDsc_Sel ,
                                           AV48TFBarSerDsc ,
                                           AV51TFBarColNom_Sel ,
                                           AV50TFBarColNom ,
                                           Integer.valueOf(AV52TFBarColNum) ,
                                           Integer.valueOf(AV53TFBarColNum_To) ,
                                           AV55TFBarNomCli_Sel ,
                                           AV54TFBarNomCli ,
                                           AV56TFBarKgm ,
                                           AV57TFBarKgm_To ,
                                           AV58TFBarMtr ,
                                           AV59TFBarMtr_To ,
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
                                           A1234BarNomCli ,
                                           A166BarKgm ,
                                           A184BarMtr ,
                                           AV62FilterFullText ,
                                           A151BarFasCod ,
                                           Integer.valueOf(AV73TFProFasEst_Sels.size()) ,
                                           AV61TFBarFasCod_Sel ,
                                           AV60TFBarFasCod ,
                                           Integer.valueOf(AV64CliCod) ,
                                           Integer.valueOf(AV65CliCod_to) ,
                                           A159BarFecGen ,
                                           AV66BarFecGen ,
                                           AV67BarFecGen_to ,
                                           Byte.valueOf(AV68BarSit) ,
                                           Byte.valueOf(AV69BarSit_to) ,
                                           A14284ProEst ,
                                           A396EmprCod ,
                                           AV71EmprCod ,
                                           A758ProCod ,
                                           AV63ProCod ,
                                           Byte.valueOf(AV70ProFasEst) } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE
                                           }
      });
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV60TFBarFasCod = GXutil.padr( GXutil.rtrim( AV60TFBarFasCod), 8, "%") ;
      lV36TFCliNom = GXutil.padr( GXutil.rtrim( AV36TFCliNom), 30, "%") ;
      lV42TFBarCodPar = GXutil.padr( GXutil.rtrim( AV42TFBarCodPar), 1, "%") ;
      lV46TFBarSer = GXutil.padr( GXutil.rtrim( AV46TFBarSer), 16, "%") ;
      lV48TFBarSerDsc = GXutil.padr( GXutil.rtrim( AV48TFBarSerDsc), 26, "%") ;
      lV50TFBarColNom = GXutil.padr( GXutil.rtrim( AV50TFBarColNom), 13, "%") ;
      lV54TFBarNomCli = GXutil.padr( GXutil.rtrim( AV54TFBarNomCli), 13, "%") ;
      /* Using cursor P09ZG6 */
      pr_default.execute(0, new Object[] {AV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, Integer.valueOf(AV73TFProFasEst_Sels.size()), AV61TFBarFasCod_Sel, AV60TFBarFasCod, lV60TFBarFasCod, AV61TFBarFasCod_Sel, AV61TFBarFasCod_Sel, Integer.valueOf(AV64CliCod), Integer.valueOf(AV65CliCod_to), AV66BarFecGen, AV67BarFecGen_to, Byte.valueOf(AV68BarSit), Byte.valueOf(AV69BarSit_to), AV71EmprCod, AV63ProCod, Byte.valueOf(AV70ProFasEst), Integer.valueOf(AV34TFCliCod), Integer.valueOf(AV35TFCliCod_To), lV36TFCliNom, AV37TFCliNom_Sel, Integer.valueOf(AV38TFBarCod), Integer.valueOf(AV39TFBarCod_To), Byte.valueOf(AV40TFBarCodReo), Byte.valueOf(AV41TFBarCodReo_To), lV42TFBarCodPar, AV43TFBarCodPar_Sel, Byte.valueOf(AV44TFBarSit), Byte.valueOf(AV45TFBarSit_To), lV46TFBarSer, AV47TFBarSer_Sel, lV48TFBarSerDsc, AV49TFBarSerDsc_Sel, lV50TFBarColNom, AV51TFBarColNom_Sel, Integer.valueOf(AV52TFBarColNum), Integer.valueOf(AV53TFBarColNum_To), lV54TFBarNomCli, AV55TFBarNomCli_Sel, AV56TFBarKgm, AV57TFBarKgm_To, AV58TFBarMtr, AV59TFBarMtr_To});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9ZG2 = false ;
         A396EmprCod = P09ZG6_A396EmprCod[0] ;
         A758ProCod = P09ZG6_A758ProCod[0] ;
         A279CliNom = P09ZG6_A279CliNom[0] ;
         A14284ProEst = P09ZG6_A14284ProEst[0] ;
         A159BarFecGen = P09ZG6_A159BarFecGen[0] ;
         A1234BarNomCli = P09ZG6_A1234BarNomCli[0] ;
         A136BarColNum = P09ZG6_A136BarColNum[0] ;
         A135BarColNom = P09ZG6_A135BarColNom[0] ;
         A1652BarSerDsc = P09ZG6_A1652BarSerDsc[0] ;
         A212BarSer = P09ZG6_A212BarSer[0] ;
         A213BarSit = P09ZG6_A213BarSit[0] ;
         A130BarCodPar = P09ZG6_A130BarCodPar[0] ;
         A132BarCodReo = P09ZG6_A132BarCodReo[0] ;
         A129BarCod = P09ZG6_A129BarCod[0] ;
         A252CliCod = P09ZG6_A252CliCod[0] ;
         n252CliCod = P09ZG6_n252CliCod[0] ;
         A760ProFasEst = P09ZG6_A760ProFasEst[0] ;
         n760ProFasEst = P09ZG6_n760ProFasEst[0] ;
         A151BarFasCod = P09ZG6_A151BarFasCod[0] ;
         n151BarFasCod = P09ZG6_n151BarFasCod[0] ;
         A184BarMtr = P09ZG6_A184BarMtr[0] ;
         A166BarKgm = P09ZG6_A166BarKgm[0] ;
         A14284ProEst = P09ZG6_A14284ProEst[0] ;
         A159BarFecGen = P09ZG6_A159BarFecGen[0] ;
         A1234BarNomCli = P09ZG6_A1234BarNomCli[0] ;
         A136BarColNum = P09ZG6_A136BarColNum[0] ;
         A135BarColNom = P09ZG6_A135BarColNom[0] ;
         A1652BarSerDsc = P09ZG6_A1652BarSerDsc[0] ;
         A212BarSer = P09ZG6_A212BarSer[0] ;
         A213BarSit = P09ZG6_A213BarSit[0] ;
         A252CliCod = P09ZG6_A252CliCod[0] ;
         n252CliCod = P09ZG6_n252CliCod[0] ;
         A279CliNom = P09ZG6_A279CliNom[0] ;
         A151BarFasCod = P09ZG6_A151BarFasCod[0] ;
         n151BarFasCod = P09ZG6_n151BarFasCod[0] ;
         A184BarMtr = P09ZG6_A184BarMtr[0] ;
         A166BarKgm = P09ZG6_A166BarKgm[0] ;
         A760ProFasEst = P09ZG6_A760ProFasEst[0] ;
         n760ProFasEst = P09ZG6_n760ProFasEst[0] ;
         if ( GXutil.strcmp(A14284ProEst, httpContext.getMessage( "A", "")) == 0 )
         {
            AV20count = 0 ;
            while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09ZG6_A279CliNom[0], A279CliNom) == 0 ) )
            {
               brk9ZG2 = false ;
               A396EmprCod = P09ZG6_A396EmprCod[0] ;
               A758ProCod = P09ZG6_A758ProCod[0] ;
               A130BarCodPar = P09ZG6_A130BarCodPar[0] ;
               A132BarCodReo = P09ZG6_A132BarCodReo[0] ;
               A129BarCod = P09ZG6_A129BarCod[0] ;
               A252CliCod = P09ZG6_A252CliCod[0] ;
               n252CliCod = P09ZG6_n252CliCod[0] ;
               A252CliCod = P09ZG6_A252CliCod[0] ;
               n252CliCod = P09ZG6_n252CliCod[0] ;
               AV20count = (long)(AV20count+1) ;
               brk9ZG2 = true ;
               pr_default.readNext(0);
            }
            if ( ! (GXutil.strcmp("", A279CliNom)==0) )
            {
               AV15Option = A279CliNom ;
               AV16Options.add(AV15Option, 0);
               AV19OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV20count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV16Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk9ZG2 )
         {
            brk9ZG2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADBARCODPAROPTIONS' Routine */
      returnInSub = false ;
      AV42TFBarCodPar = AV27SearchTxt ;
      AV43TFBarCodPar_Sel = "" ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Byte.valueOf(A760ProFasEst) ,
                                           AV73TFProFasEst_Sels ,
                                           Integer.valueOf(AV34TFCliCod) ,
                                           Integer.valueOf(AV35TFCliCod_To) ,
                                           AV37TFCliNom_Sel ,
                                           AV36TFCliNom ,
                                           Integer.valueOf(AV38TFBarCod) ,
                                           Integer.valueOf(AV39TFBarCod_To) ,
                                           Byte.valueOf(AV40TFBarCodReo) ,
                                           Byte.valueOf(AV41TFBarCodReo_To) ,
                                           AV43TFBarCodPar_Sel ,
                                           AV42TFBarCodPar ,
                                           Byte.valueOf(AV44TFBarSit) ,
                                           Byte.valueOf(AV45TFBarSit_To) ,
                                           AV47TFBarSer_Sel ,
                                           AV46TFBarSer ,
                                           AV49TFBarSerDsc_Sel ,
                                           AV48TFBarSerDsc ,
                                           AV51TFBarColNom_Sel ,
                                           AV50TFBarColNom ,
                                           Integer.valueOf(AV52TFBarColNum) ,
                                           Integer.valueOf(AV53TFBarColNum_To) ,
                                           AV55TFBarNomCli_Sel ,
                                           AV54TFBarNomCli ,
                                           AV56TFBarKgm ,
                                           AV57TFBarKgm_To ,
                                           AV58TFBarMtr ,
                                           AV59TFBarMtr_To ,
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
                                           A1234BarNomCli ,
                                           A166BarKgm ,
                                           A184BarMtr ,
                                           AV62FilterFullText ,
                                           A151BarFasCod ,
                                           Integer.valueOf(AV73TFProFasEst_Sels.size()) ,
                                           AV61TFBarFasCod_Sel ,
                                           AV60TFBarFasCod ,
                                           Integer.valueOf(AV64CliCod) ,
                                           Integer.valueOf(AV65CliCod_to) ,
                                           A159BarFecGen ,
                                           AV66BarFecGen ,
                                           AV67BarFecGen_to ,
                                           Byte.valueOf(AV68BarSit) ,
                                           Byte.valueOf(AV69BarSit_to) ,
                                           A14284ProEst ,
                                           A396EmprCod ,
                                           AV71EmprCod ,
                                           A758ProCod ,
                                           AV63ProCod ,
                                           Byte.valueOf(AV70ProFasEst) } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE
                                           }
      });
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV60TFBarFasCod = GXutil.padr( GXutil.rtrim( AV60TFBarFasCod), 8, "%") ;
      lV36TFCliNom = GXutil.padr( GXutil.rtrim( AV36TFCliNom), 30, "%") ;
      lV42TFBarCodPar = GXutil.padr( GXutil.rtrim( AV42TFBarCodPar), 1, "%") ;
      lV46TFBarSer = GXutil.padr( GXutil.rtrim( AV46TFBarSer), 16, "%") ;
      lV48TFBarSerDsc = GXutil.padr( GXutil.rtrim( AV48TFBarSerDsc), 26, "%") ;
      lV50TFBarColNom = GXutil.padr( GXutil.rtrim( AV50TFBarColNom), 13, "%") ;
      lV54TFBarNomCli = GXutil.padr( GXutil.rtrim( AV54TFBarNomCli), 13, "%") ;
      /* Using cursor P09ZG11 */
      pr_default.execute(1, new Object[] {AV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, Integer.valueOf(AV73TFProFasEst_Sels.size()), AV61TFBarFasCod_Sel, AV60TFBarFasCod, lV60TFBarFasCod, AV61TFBarFasCod_Sel, AV61TFBarFasCod_Sel, Integer.valueOf(AV64CliCod), Integer.valueOf(AV65CliCod_to), AV66BarFecGen, AV67BarFecGen_to, Byte.valueOf(AV68BarSit), Byte.valueOf(AV69BarSit_to), AV71EmprCod, AV63ProCod, Byte.valueOf(AV70ProFasEst), Integer.valueOf(AV34TFCliCod), Integer.valueOf(AV35TFCliCod_To), lV36TFCliNom, AV37TFCliNom_Sel, Integer.valueOf(AV38TFBarCod), Integer.valueOf(AV39TFBarCod_To), Byte.valueOf(AV40TFBarCodReo), Byte.valueOf(AV41TFBarCodReo_To), lV42TFBarCodPar, AV43TFBarCodPar_Sel, Byte.valueOf(AV44TFBarSit), Byte.valueOf(AV45TFBarSit_To), lV46TFBarSer, AV47TFBarSer_Sel, lV48TFBarSerDsc, AV49TFBarSerDsc_Sel, lV50TFBarColNom, AV51TFBarColNom_Sel, Integer.valueOf(AV52TFBarColNum), Integer.valueOf(AV53TFBarColNum_To), lV54TFBarNomCli, AV55TFBarNomCli_Sel, AV56TFBarKgm, AV57TFBarKgm_To, AV58TFBarMtr, AV59TFBarMtr_To});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9ZG4 = false ;
         A396EmprCod = P09ZG11_A396EmprCod[0] ;
         A758ProCod = P09ZG11_A758ProCod[0] ;
         A130BarCodPar = P09ZG11_A130BarCodPar[0] ;
         A14284ProEst = P09ZG11_A14284ProEst[0] ;
         A159BarFecGen = P09ZG11_A159BarFecGen[0] ;
         A1234BarNomCli = P09ZG11_A1234BarNomCli[0] ;
         A136BarColNum = P09ZG11_A136BarColNum[0] ;
         A135BarColNom = P09ZG11_A135BarColNom[0] ;
         A1652BarSerDsc = P09ZG11_A1652BarSerDsc[0] ;
         A212BarSer = P09ZG11_A212BarSer[0] ;
         A213BarSit = P09ZG11_A213BarSit[0] ;
         A132BarCodReo = P09ZG11_A132BarCodReo[0] ;
         A129BarCod = P09ZG11_A129BarCod[0] ;
         A279CliNom = P09ZG11_A279CliNom[0] ;
         A252CliCod = P09ZG11_A252CliCod[0] ;
         n252CliCod = P09ZG11_n252CliCod[0] ;
         A760ProFasEst = P09ZG11_A760ProFasEst[0] ;
         n760ProFasEst = P09ZG11_n760ProFasEst[0] ;
         A151BarFasCod = P09ZG11_A151BarFasCod[0] ;
         n151BarFasCod = P09ZG11_n151BarFasCod[0] ;
         A184BarMtr = P09ZG11_A184BarMtr[0] ;
         A166BarKgm = P09ZG11_A166BarKgm[0] ;
         A14284ProEst = P09ZG11_A14284ProEst[0] ;
         A159BarFecGen = P09ZG11_A159BarFecGen[0] ;
         A1234BarNomCli = P09ZG11_A1234BarNomCli[0] ;
         A136BarColNum = P09ZG11_A136BarColNum[0] ;
         A135BarColNom = P09ZG11_A135BarColNom[0] ;
         A1652BarSerDsc = P09ZG11_A1652BarSerDsc[0] ;
         A212BarSer = P09ZG11_A212BarSer[0] ;
         A213BarSit = P09ZG11_A213BarSit[0] ;
         A252CliCod = P09ZG11_A252CliCod[0] ;
         n252CliCod = P09ZG11_n252CliCod[0] ;
         A279CliNom = P09ZG11_A279CliNom[0] ;
         A151BarFasCod = P09ZG11_A151BarFasCod[0] ;
         n151BarFasCod = P09ZG11_n151BarFasCod[0] ;
         A184BarMtr = P09ZG11_A184BarMtr[0] ;
         A166BarKgm = P09ZG11_A166BarKgm[0] ;
         A760ProFasEst = P09ZG11_A760ProFasEst[0] ;
         n760ProFasEst = P09ZG11_n760ProFasEst[0] ;
         if ( GXutil.strcmp(A14284ProEst, httpContext.getMessage( "A", "")) == 0 )
         {
            AV20count = 0 ;
            while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09ZG11_A130BarCodPar[0], A130BarCodPar) == 0 ) )
            {
               brk9ZG4 = false ;
               A396EmprCod = P09ZG11_A396EmprCod[0] ;
               A758ProCod = P09ZG11_A758ProCod[0] ;
               A132BarCodReo = P09ZG11_A132BarCodReo[0] ;
               A129BarCod = P09ZG11_A129BarCod[0] ;
               AV20count = (long)(AV20count+1) ;
               brk9ZG4 = true ;
               pr_default.readNext(1);
            }
            if ( ! (GXutil.strcmp("", A130BarCodPar)==0) )
            {
               AV15Option = A130BarCodPar ;
               AV16Options.add(AV15Option, 0);
               AV19OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV20count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV16Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk9ZG4 )
         {
            brk9ZG4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADBARSEROPTIONS' Routine */
      returnInSub = false ;
      AV46TFBarSer = AV27SearchTxt ;
      AV47TFBarSer_Sel = "" ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Byte.valueOf(A760ProFasEst) ,
                                           AV73TFProFasEst_Sels ,
                                           Integer.valueOf(AV34TFCliCod) ,
                                           Integer.valueOf(AV35TFCliCod_To) ,
                                           AV37TFCliNom_Sel ,
                                           AV36TFCliNom ,
                                           Integer.valueOf(AV38TFBarCod) ,
                                           Integer.valueOf(AV39TFBarCod_To) ,
                                           Byte.valueOf(AV40TFBarCodReo) ,
                                           Byte.valueOf(AV41TFBarCodReo_To) ,
                                           AV43TFBarCodPar_Sel ,
                                           AV42TFBarCodPar ,
                                           Byte.valueOf(AV44TFBarSit) ,
                                           Byte.valueOf(AV45TFBarSit_To) ,
                                           AV47TFBarSer_Sel ,
                                           AV46TFBarSer ,
                                           AV49TFBarSerDsc_Sel ,
                                           AV48TFBarSerDsc ,
                                           AV51TFBarColNom_Sel ,
                                           AV50TFBarColNom ,
                                           Integer.valueOf(AV52TFBarColNum) ,
                                           Integer.valueOf(AV53TFBarColNum_To) ,
                                           AV55TFBarNomCli_Sel ,
                                           AV54TFBarNomCli ,
                                           AV56TFBarKgm ,
                                           AV57TFBarKgm_To ,
                                           AV58TFBarMtr ,
                                           AV59TFBarMtr_To ,
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
                                           A1234BarNomCli ,
                                           A166BarKgm ,
                                           A184BarMtr ,
                                           AV62FilterFullText ,
                                           A151BarFasCod ,
                                           Integer.valueOf(AV73TFProFasEst_Sels.size()) ,
                                           AV61TFBarFasCod_Sel ,
                                           AV60TFBarFasCod ,
                                           Integer.valueOf(AV64CliCod) ,
                                           Integer.valueOf(AV65CliCod_to) ,
                                           A159BarFecGen ,
                                           AV66BarFecGen ,
                                           AV67BarFecGen_to ,
                                           Byte.valueOf(AV68BarSit) ,
                                           Byte.valueOf(AV69BarSit_to) ,
                                           A14284ProEst ,
                                           A396EmprCod ,
                                           AV71EmprCod ,
                                           A758ProCod ,
                                           AV63ProCod ,
                                           Byte.valueOf(AV70ProFasEst) } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE
                                           }
      });
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV60TFBarFasCod = GXutil.padr( GXutil.rtrim( AV60TFBarFasCod), 8, "%") ;
      lV36TFCliNom = GXutil.padr( GXutil.rtrim( AV36TFCliNom), 30, "%") ;
      lV42TFBarCodPar = GXutil.padr( GXutil.rtrim( AV42TFBarCodPar), 1, "%") ;
      lV46TFBarSer = GXutil.padr( GXutil.rtrim( AV46TFBarSer), 16, "%") ;
      lV48TFBarSerDsc = GXutil.padr( GXutil.rtrim( AV48TFBarSerDsc), 26, "%") ;
      lV50TFBarColNom = GXutil.padr( GXutil.rtrim( AV50TFBarColNom), 13, "%") ;
      lV54TFBarNomCli = GXutil.padr( GXutil.rtrim( AV54TFBarNomCli), 13, "%") ;
      /* Using cursor P09ZG16 */
      pr_default.execute(2, new Object[] {AV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, Integer.valueOf(AV73TFProFasEst_Sels.size()), AV61TFBarFasCod_Sel, AV60TFBarFasCod, lV60TFBarFasCod, AV61TFBarFasCod_Sel, AV61TFBarFasCod_Sel, Integer.valueOf(AV64CliCod), Integer.valueOf(AV65CliCod_to), AV66BarFecGen, AV67BarFecGen_to, Byte.valueOf(AV68BarSit), Byte.valueOf(AV69BarSit_to), AV71EmprCod, AV63ProCod, Byte.valueOf(AV70ProFasEst), Integer.valueOf(AV34TFCliCod), Integer.valueOf(AV35TFCliCod_To), lV36TFCliNom, AV37TFCliNom_Sel, Integer.valueOf(AV38TFBarCod), Integer.valueOf(AV39TFBarCod_To), Byte.valueOf(AV40TFBarCodReo), Byte.valueOf(AV41TFBarCodReo_To), lV42TFBarCodPar, AV43TFBarCodPar_Sel, Byte.valueOf(AV44TFBarSit), Byte.valueOf(AV45TFBarSit_To), lV46TFBarSer, AV47TFBarSer_Sel, lV48TFBarSerDsc, AV49TFBarSerDsc_Sel, lV50TFBarColNom, AV51TFBarColNom_Sel, Integer.valueOf(AV52TFBarColNum), Integer.valueOf(AV53TFBarColNum_To), lV54TFBarNomCli, AV55TFBarNomCli_Sel, AV56TFBarKgm, AV57TFBarKgm_To, AV58TFBarMtr, AV59TFBarMtr_To});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9ZG6 = false ;
         A396EmprCod = P09ZG16_A396EmprCod[0] ;
         A758ProCod = P09ZG16_A758ProCod[0] ;
         A212BarSer = P09ZG16_A212BarSer[0] ;
         A14284ProEst = P09ZG16_A14284ProEst[0] ;
         A159BarFecGen = P09ZG16_A159BarFecGen[0] ;
         A1234BarNomCli = P09ZG16_A1234BarNomCli[0] ;
         A136BarColNum = P09ZG16_A136BarColNum[0] ;
         A135BarColNom = P09ZG16_A135BarColNom[0] ;
         A1652BarSerDsc = P09ZG16_A1652BarSerDsc[0] ;
         A213BarSit = P09ZG16_A213BarSit[0] ;
         A130BarCodPar = P09ZG16_A130BarCodPar[0] ;
         A132BarCodReo = P09ZG16_A132BarCodReo[0] ;
         A129BarCod = P09ZG16_A129BarCod[0] ;
         A279CliNom = P09ZG16_A279CliNom[0] ;
         A252CliCod = P09ZG16_A252CliCod[0] ;
         n252CliCod = P09ZG16_n252CliCod[0] ;
         A760ProFasEst = P09ZG16_A760ProFasEst[0] ;
         n760ProFasEst = P09ZG16_n760ProFasEst[0] ;
         A151BarFasCod = P09ZG16_A151BarFasCod[0] ;
         n151BarFasCod = P09ZG16_n151BarFasCod[0] ;
         A184BarMtr = P09ZG16_A184BarMtr[0] ;
         A166BarKgm = P09ZG16_A166BarKgm[0] ;
         A14284ProEst = P09ZG16_A14284ProEst[0] ;
         A212BarSer = P09ZG16_A212BarSer[0] ;
         A159BarFecGen = P09ZG16_A159BarFecGen[0] ;
         A1234BarNomCli = P09ZG16_A1234BarNomCli[0] ;
         A136BarColNum = P09ZG16_A136BarColNum[0] ;
         A135BarColNom = P09ZG16_A135BarColNom[0] ;
         A1652BarSerDsc = P09ZG16_A1652BarSerDsc[0] ;
         A213BarSit = P09ZG16_A213BarSit[0] ;
         A252CliCod = P09ZG16_A252CliCod[0] ;
         n252CliCod = P09ZG16_n252CliCod[0] ;
         A279CliNom = P09ZG16_A279CliNom[0] ;
         A151BarFasCod = P09ZG16_A151BarFasCod[0] ;
         n151BarFasCod = P09ZG16_n151BarFasCod[0] ;
         A184BarMtr = P09ZG16_A184BarMtr[0] ;
         A166BarKgm = P09ZG16_A166BarKgm[0] ;
         A760ProFasEst = P09ZG16_A760ProFasEst[0] ;
         n760ProFasEst = P09ZG16_n760ProFasEst[0] ;
         if ( GXutil.strcmp(A14284ProEst, httpContext.getMessage( "A", "")) == 0 )
         {
            AV20count = 0 ;
            while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09ZG16_A212BarSer[0], A212BarSer) == 0 ) )
            {
               brk9ZG6 = false ;
               A396EmprCod = P09ZG16_A396EmprCod[0] ;
               A758ProCod = P09ZG16_A758ProCod[0] ;
               A130BarCodPar = P09ZG16_A130BarCodPar[0] ;
               A132BarCodReo = P09ZG16_A132BarCodReo[0] ;
               A129BarCod = P09ZG16_A129BarCod[0] ;
               AV20count = (long)(AV20count+1) ;
               brk9ZG6 = true ;
               pr_default.readNext(2);
            }
            if ( ! (GXutil.strcmp("", A212BarSer)==0) )
            {
               AV15Option = A212BarSer ;
               AV16Options.add(AV15Option, 0);
               AV19OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV20count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV16Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk9ZG6 )
         {
            brk9ZG6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADBARSERDSCOPTIONS' Routine */
      returnInSub = false ;
      AV48TFBarSerDsc = AV27SearchTxt ;
      AV49TFBarSerDsc_Sel = "" ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           Byte.valueOf(A760ProFasEst) ,
                                           AV73TFProFasEst_Sels ,
                                           Integer.valueOf(AV34TFCliCod) ,
                                           Integer.valueOf(AV35TFCliCod_To) ,
                                           AV37TFCliNom_Sel ,
                                           AV36TFCliNom ,
                                           Integer.valueOf(AV38TFBarCod) ,
                                           Integer.valueOf(AV39TFBarCod_To) ,
                                           Byte.valueOf(AV40TFBarCodReo) ,
                                           Byte.valueOf(AV41TFBarCodReo_To) ,
                                           AV43TFBarCodPar_Sel ,
                                           AV42TFBarCodPar ,
                                           Byte.valueOf(AV44TFBarSit) ,
                                           Byte.valueOf(AV45TFBarSit_To) ,
                                           AV47TFBarSer_Sel ,
                                           AV46TFBarSer ,
                                           AV49TFBarSerDsc_Sel ,
                                           AV48TFBarSerDsc ,
                                           AV51TFBarColNom_Sel ,
                                           AV50TFBarColNom ,
                                           Integer.valueOf(AV52TFBarColNum) ,
                                           Integer.valueOf(AV53TFBarColNum_To) ,
                                           AV55TFBarNomCli_Sel ,
                                           AV54TFBarNomCli ,
                                           AV56TFBarKgm ,
                                           AV57TFBarKgm_To ,
                                           AV58TFBarMtr ,
                                           AV59TFBarMtr_To ,
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
                                           A1234BarNomCli ,
                                           A166BarKgm ,
                                           A184BarMtr ,
                                           AV62FilterFullText ,
                                           A151BarFasCod ,
                                           Integer.valueOf(AV73TFProFasEst_Sels.size()) ,
                                           AV61TFBarFasCod_Sel ,
                                           AV60TFBarFasCod ,
                                           Integer.valueOf(AV64CliCod) ,
                                           Integer.valueOf(AV65CliCod_to) ,
                                           A159BarFecGen ,
                                           AV66BarFecGen ,
                                           AV67BarFecGen_to ,
                                           Byte.valueOf(AV68BarSit) ,
                                           Byte.valueOf(AV69BarSit_to) ,
                                           A14284ProEst ,
                                           A396EmprCod ,
                                           AV71EmprCod ,
                                           A758ProCod ,
                                           AV63ProCod ,
                                           Byte.valueOf(AV70ProFasEst) } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE
                                           }
      });
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV60TFBarFasCod = GXutil.padr( GXutil.rtrim( AV60TFBarFasCod), 8, "%") ;
      lV36TFCliNom = GXutil.padr( GXutil.rtrim( AV36TFCliNom), 30, "%") ;
      lV42TFBarCodPar = GXutil.padr( GXutil.rtrim( AV42TFBarCodPar), 1, "%") ;
      lV46TFBarSer = GXutil.padr( GXutil.rtrim( AV46TFBarSer), 16, "%") ;
      lV48TFBarSerDsc = GXutil.padr( GXutil.rtrim( AV48TFBarSerDsc), 26, "%") ;
      lV50TFBarColNom = GXutil.padr( GXutil.rtrim( AV50TFBarColNom), 13, "%") ;
      lV54TFBarNomCli = GXutil.padr( GXutil.rtrim( AV54TFBarNomCli), 13, "%") ;
      /* Using cursor P09ZG21 */
      pr_default.execute(3, new Object[] {AV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, Integer.valueOf(AV73TFProFasEst_Sels.size()), AV61TFBarFasCod_Sel, AV60TFBarFasCod, lV60TFBarFasCod, AV61TFBarFasCod_Sel, AV61TFBarFasCod_Sel, Integer.valueOf(AV64CliCod), Integer.valueOf(AV65CliCod_to), AV66BarFecGen, AV67BarFecGen_to, Byte.valueOf(AV68BarSit), Byte.valueOf(AV69BarSit_to), AV71EmprCod, AV63ProCod, Byte.valueOf(AV70ProFasEst), Integer.valueOf(AV34TFCliCod), Integer.valueOf(AV35TFCliCod_To), lV36TFCliNom, AV37TFCliNom_Sel, Integer.valueOf(AV38TFBarCod), Integer.valueOf(AV39TFBarCod_To), Byte.valueOf(AV40TFBarCodReo), Byte.valueOf(AV41TFBarCodReo_To), lV42TFBarCodPar, AV43TFBarCodPar_Sel, Byte.valueOf(AV44TFBarSit), Byte.valueOf(AV45TFBarSit_To), lV46TFBarSer, AV47TFBarSer_Sel, lV48TFBarSerDsc, AV49TFBarSerDsc_Sel, lV50TFBarColNom, AV51TFBarColNom_Sel, Integer.valueOf(AV52TFBarColNum), Integer.valueOf(AV53TFBarColNum_To), lV54TFBarNomCli, AV55TFBarNomCli_Sel, AV56TFBarKgm, AV57TFBarKgm_To, AV58TFBarMtr, AV59TFBarMtr_To});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk9ZG8 = false ;
         A396EmprCod = P09ZG21_A396EmprCod[0] ;
         A758ProCod = P09ZG21_A758ProCod[0] ;
         A1652BarSerDsc = P09ZG21_A1652BarSerDsc[0] ;
         A14284ProEst = P09ZG21_A14284ProEst[0] ;
         A159BarFecGen = P09ZG21_A159BarFecGen[0] ;
         A1234BarNomCli = P09ZG21_A1234BarNomCli[0] ;
         A136BarColNum = P09ZG21_A136BarColNum[0] ;
         A135BarColNom = P09ZG21_A135BarColNom[0] ;
         A212BarSer = P09ZG21_A212BarSer[0] ;
         A213BarSit = P09ZG21_A213BarSit[0] ;
         A130BarCodPar = P09ZG21_A130BarCodPar[0] ;
         A132BarCodReo = P09ZG21_A132BarCodReo[0] ;
         A129BarCod = P09ZG21_A129BarCod[0] ;
         A279CliNom = P09ZG21_A279CliNom[0] ;
         A252CliCod = P09ZG21_A252CliCod[0] ;
         n252CliCod = P09ZG21_n252CliCod[0] ;
         A760ProFasEst = P09ZG21_A760ProFasEst[0] ;
         n760ProFasEst = P09ZG21_n760ProFasEst[0] ;
         A151BarFasCod = P09ZG21_A151BarFasCod[0] ;
         n151BarFasCod = P09ZG21_n151BarFasCod[0] ;
         A184BarMtr = P09ZG21_A184BarMtr[0] ;
         A166BarKgm = P09ZG21_A166BarKgm[0] ;
         A14284ProEst = P09ZG21_A14284ProEst[0] ;
         A1652BarSerDsc = P09ZG21_A1652BarSerDsc[0] ;
         A159BarFecGen = P09ZG21_A159BarFecGen[0] ;
         A1234BarNomCli = P09ZG21_A1234BarNomCli[0] ;
         A136BarColNum = P09ZG21_A136BarColNum[0] ;
         A135BarColNom = P09ZG21_A135BarColNom[0] ;
         A212BarSer = P09ZG21_A212BarSer[0] ;
         A213BarSit = P09ZG21_A213BarSit[0] ;
         A252CliCod = P09ZG21_A252CliCod[0] ;
         n252CliCod = P09ZG21_n252CliCod[0] ;
         A279CliNom = P09ZG21_A279CliNom[0] ;
         A151BarFasCod = P09ZG21_A151BarFasCod[0] ;
         n151BarFasCod = P09ZG21_n151BarFasCod[0] ;
         A184BarMtr = P09ZG21_A184BarMtr[0] ;
         A166BarKgm = P09ZG21_A166BarKgm[0] ;
         A760ProFasEst = P09ZG21_A760ProFasEst[0] ;
         n760ProFasEst = P09ZG21_n760ProFasEst[0] ;
         if ( GXutil.strcmp(A14284ProEst, httpContext.getMessage( "A", "")) == 0 )
         {
            AV20count = 0 ;
            while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P09ZG21_A1652BarSerDsc[0], A1652BarSerDsc) == 0 ) )
            {
               brk9ZG8 = false ;
               A396EmprCod = P09ZG21_A396EmprCod[0] ;
               A758ProCod = P09ZG21_A758ProCod[0] ;
               A130BarCodPar = P09ZG21_A130BarCodPar[0] ;
               A132BarCodReo = P09ZG21_A132BarCodReo[0] ;
               A129BarCod = P09ZG21_A129BarCod[0] ;
               AV20count = (long)(AV20count+1) ;
               brk9ZG8 = true ;
               pr_default.readNext(3);
            }
            if ( ! (GXutil.strcmp("", A1652BarSerDsc)==0) )
            {
               AV15Option = A1652BarSerDsc ;
               AV16Options.add(AV15Option, 0);
               AV19OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV20count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV16Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk9ZG8 )
         {
            brk9ZG8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADBARCOLNOMOPTIONS' Routine */
      returnInSub = false ;
      AV50TFBarColNom = AV27SearchTxt ;
      AV51TFBarColNom_Sel = "" ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           Byte.valueOf(A760ProFasEst) ,
                                           AV73TFProFasEst_Sels ,
                                           Integer.valueOf(AV34TFCliCod) ,
                                           Integer.valueOf(AV35TFCliCod_To) ,
                                           AV37TFCliNom_Sel ,
                                           AV36TFCliNom ,
                                           Integer.valueOf(AV38TFBarCod) ,
                                           Integer.valueOf(AV39TFBarCod_To) ,
                                           Byte.valueOf(AV40TFBarCodReo) ,
                                           Byte.valueOf(AV41TFBarCodReo_To) ,
                                           AV43TFBarCodPar_Sel ,
                                           AV42TFBarCodPar ,
                                           Byte.valueOf(AV44TFBarSit) ,
                                           Byte.valueOf(AV45TFBarSit_To) ,
                                           AV47TFBarSer_Sel ,
                                           AV46TFBarSer ,
                                           AV49TFBarSerDsc_Sel ,
                                           AV48TFBarSerDsc ,
                                           AV51TFBarColNom_Sel ,
                                           AV50TFBarColNom ,
                                           Integer.valueOf(AV52TFBarColNum) ,
                                           Integer.valueOf(AV53TFBarColNum_To) ,
                                           AV55TFBarNomCli_Sel ,
                                           AV54TFBarNomCli ,
                                           AV56TFBarKgm ,
                                           AV57TFBarKgm_To ,
                                           AV58TFBarMtr ,
                                           AV59TFBarMtr_To ,
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
                                           A1234BarNomCli ,
                                           A166BarKgm ,
                                           A184BarMtr ,
                                           AV62FilterFullText ,
                                           A151BarFasCod ,
                                           Integer.valueOf(AV73TFProFasEst_Sels.size()) ,
                                           AV61TFBarFasCod_Sel ,
                                           AV60TFBarFasCod ,
                                           Integer.valueOf(AV64CliCod) ,
                                           Integer.valueOf(AV65CliCod_to) ,
                                           A159BarFecGen ,
                                           AV66BarFecGen ,
                                           AV67BarFecGen_to ,
                                           Byte.valueOf(AV68BarSit) ,
                                           Byte.valueOf(AV69BarSit_to) ,
                                           A14284ProEst ,
                                           A396EmprCod ,
                                           AV71EmprCod ,
                                           A758ProCod ,
                                           AV63ProCod ,
                                           Byte.valueOf(AV70ProFasEst) } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE
                                           }
      });
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV60TFBarFasCod = GXutil.padr( GXutil.rtrim( AV60TFBarFasCod), 8, "%") ;
      lV36TFCliNom = GXutil.padr( GXutil.rtrim( AV36TFCliNom), 30, "%") ;
      lV42TFBarCodPar = GXutil.padr( GXutil.rtrim( AV42TFBarCodPar), 1, "%") ;
      lV46TFBarSer = GXutil.padr( GXutil.rtrim( AV46TFBarSer), 16, "%") ;
      lV48TFBarSerDsc = GXutil.padr( GXutil.rtrim( AV48TFBarSerDsc), 26, "%") ;
      lV50TFBarColNom = GXutil.padr( GXutil.rtrim( AV50TFBarColNom), 13, "%") ;
      lV54TFBarNomCli = GXutil.padr( GXutil.rtrim( AV54TFBarNomCli), 13, "%") ;
      /* Using cursor P09ZG26 */
      pr_default.execute(4, new Object[] {AV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, Integer.valueOf(AV73TFProFasEst_Sels.size()), AV61TFBarFasCod_Sel, AV60TFBarFasCod, lV60TFBarFasCod, AV61TFBarFasCod_Sel, AV61TFBarFasCod_Sel, Integer.valueOf(AV64CliCod), Integer.valueOf(AV65CliCod_to), AV66BarFecGen, AV67BarFecGen_to, Byte.valueOf(AV68BarSit), Byte.valueOf(AV69BarSit_to), AV71EmprCod, AV63ProCod, Byte.valueOf(AV70ProFasEst), Integer.valueOf(AV34TFCliCod), Integer.valueOf(AV35TFCliCod_To), lV36TFCliNom, AV37TFCliNom_Sel, Integer.valueOf(AV38TFBarCod), Integer.valueOf(AV39TFBarCod_To), Byte.valueOf(AV40TFBarCodReo), Byte.valueOf(AV41TFBarCodReo_To), lV42TFBarCodPar, AV43TFBarCodPar_Sel, Byte.valueOf(AV44TFBarSit), Byte.valueOf(AV45TFBarSit_To), lV46TFBarSer, AV47TFBarSer_Sel, lV48TFBarSerDsc, AV49TFBarSerDsc_Sel, lV50TFBarColNom, AV51TFBarColNom_Sel, Integer.valueOf(AV52TFBarColNum), Integer.valueOf(AV53TFBarColNum_To), lV54TFBarNomCli, AV55TFBarNomCli_Sel, AV56TFBarKgm, AV57TFBarKgm_To, AV58TFBarMtr, AV59TFBarMtr_To});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk9ZG10 = false ;
         A396EmprCod = P09ZG26_A396EmprCod[0] ;
         A758ProCod = P09ZG26_A758ProCod[0] ;
         A135BarColNom = P09ZG26_A135BarColNom[0] ;
         A14284ProEst = P09ZG26_A14284ProEst[0] ;
         A159BarFecGen = P09ZG26_A159BarFecGen[0] ;
         A1234BarNomCli = P09ZG26_A1234BarNomCli[0] ;
         A136BarColNum = P09ZG26_A136BarColNum[0] ;
         A1652BarSerDsc = P09ZG26_A1652BarSerDsc[0] ;
         A212BarSer = P09ZG26_A212BarSer[0] ;
         A213BarSit = P09ZG26_A213BarSit[0] ;
         A130BarCodPar = P09ZG26_A130BarCodPar[0] ;
         A132BarCodReo = P09ZG26_A132BarCodReo[0] ;
         A129BarCod = P09ZG26_A129BarCod[0] ;
         A279CliNom = P09ZG26_A279CliNom[0] ;
         A252CliCod = P09ZG26_A252CliCod[0] ;
         n252CliCod = P09ZG26_n252CliCod[0] ;
         A760ProFasEst = P09ZG26_A760ProFasEst[0] ;
         n760ProFasEst = P09ZG26_n760ProFasEst[0] ;
         A151BarFasCod = P09ZG26_A151BarFasCod[0] ;
         n151BarFasCod = P09ZG26_n151BarFasCod[0] ;
         A184BarMtr = P09ZG26_A184BarMtr[0] ;
         A166BarKgm = P09ZG26_A166BarKgm[0] ;
         A14284ProEst = P09ZG26_A14284ProEst[0] ;
         A135BarColNom = P09ZG26_A135BarColNom[0] ;
         A159BarFecGen = P09ZG26_A159BarFecGen[0] ;
         A1234BarNomCli = P09ZG26_A1234BarNomCli[0] ;
         A136BarColNum = P09ZG26_A136BarColNum[0] ;
         A1652BarSerDsc = P09ZG26_A1652BarSerDsc[0] ;
         A212BarSer = P09ZG26_A212BarSer[0] ;
         A213BarSit = P09ZG26_A213BarSit[0] ;
         A252CliCod = P09ZG26_A252CliCod[0] ;
         n252CliCod = P09ZG26_n252CliCod[0] ;
         A279CliNom = P09ZG26_A279CliNom[0] ;
         A151BarFasCod = P09ZG26_A151BarFasCod[0] ;
         n151BarFasCod = P09ZG26_n151BarFasCod[0] ;
         A184BarMtr = P09ZG26_A184BarMtr[0] ;
         A166BarKgm = P09ZG26_A166BarKgm[0] ;
         A760ProFasEst = P09ZG26_A760ProFasEst[0] ;
         n760ProFasEst = P09ZG26_n760ProFasEst[0] ;
         if ( GXutil.strcmp(A14284ProEst, httpContext.getMessage( "A", "")) == 0 )
         {
            AV20count = 0 ;
            while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P09ZG26_A135BarColNom[0], A135BarColNom) == 0 ) )
            {
               brk9ZG10 = false ;
               A396EmprCod = P09ZG26_A396EmprCod[0] ;
               A758ProCod = P09ZG26_A758ProCod[0] ;
               A130BarCodPar = P09ZG26_A130BarCodPar[0] ;
               A132BarCodReo = P09ZG26_A132BarCodReo[0] ;
               A129BarCod = P09ZG26_A129BarCod[0] ;
               AV20count = (long)(AV20count+1) ;
               brk9ZG10 = true ;
               pr_default.readNext(4);
            }
            if ( ! (GXutil.strcmp("", A135BarColNom)==0) )
            {
               AV15Option = A135BarColNom ;
               AV16Options.add(AV15Option, 0);
               AV19OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV20count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV16Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk9ZG10 )
         {
            brk9ZG10 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADBARNOMCLIOPTIONS' Routine */
      returnInSub = false ;
      AV54TFBarNomCli = AV27SearchTxt ;
      AV55TFBarNomCli_Sel = "" ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           Byte.valueOf(A760ProFasEst) ,
                                           AV73TFProFasEst_Sels ,
                                           Integer.valueOf(AV34TFCliCod) ,
                                           Integer.valueOf(AV35TFCliCod_To) ,
                                           AV37TFCliNom_Sel ,
                                           AV36TFCliNom ,
                                           Integer.valueOf(AV38TFBarCod) ,
                                           Integer.valueOf(AV39TFBarCod_To) ,
                                           Byte.valueOf(AV40TFBarCodReo) ,
                                           Byte.valueOf(AV41TFBarCodReo_To) ,
                                           AV43TFBarCodPar_Sel ,
                                           AV42TFBarCodPar ,
                                           Byte.valueOf(AV44TFBarSit) ,
                                           Byte.valueOf(AV45TFBarSit_To) ,
                                           AV47TFBarSer_Sel ,
                                           AV46TFBarSer ,
                                           AV49TFBarSerDsc_Sel ,
                                           AV48TFBarSerDsc ,
                                           AV51TFBarColNom_Sel ,
                                           AV50TFBarColNom ,
                                           Integer.valueOf(AV52TFBarColNum) ,
                                           Integer.valueOf(AV53TFBarColNum_To) ,
                                           AV55TFBarNomCli_Sel ,
                                           AV54TFBarNomCli ,
                                           AV56TFBarKgm ,
                                           AV57TFBarKgm_To ,
                                           AV58TFBarMtr ,
                                           AV59TFBarMtr_To ,
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
                                           A1234BarNomCli ,
                                           A166BarKgm ,
                                           A184BarMtr ,
                                           AV62FilterFullText ,
                                           A151BarFasCod ,
                                           Integer.valueOf(AV73TFProFasEst_Sels.size()) ,
                                           AV61TFBarFasCod_Sel ,
                                           AV60TFBarFasCod ,
                                           Integer.valueOf(AV64CliCod) ,
                                           Integer.valueOf(AV65CliCod_to) ,
                                           A159BarFecGen ,
                                           AV66BarFecGen ,
                                           AV67BarFecGen_to ,
                                           Byte.valueOf(AV68BarSit) ,
                                           Byte.valueOf(AV69BarSit_to) ,
                                           A14284ProEst ,
                                           A396EmprCod ,
                                           AV71EmprCod ,
                                           A758ProCod ,
                                           AV63ProCod ,
                                           Byte.valueOf(AV70ProFasEst) } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE
                                           }
      });
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV60TFBarFasCod = GXutil.padr( GXutil.rtrim( AV60TFBarFasCod), 8, "%") ;
      lV36TFCliNom = GXutil.padr( GXutil.rtrim( AV36TFCliNom), 30, "%") ;
      lV42TFBarCodPar = GXutil.padr( GXutil.rtrim( AV42TFBarCodPar), 1, "%") ;
      lV46TFBarSer = GXutil.padr( GXutil.rtrim( AV46TFBarSer), 16, "%") ;
      lV48TFBarSerDsc = GXutil.padr( GXutil.rtrim( AV48TFBarSerDsc), 26, "%") ;
      lV50TFBarColNom = GXutil.padr( GXutil.rtrim( AV50TFBarColNom), 13, "%") ;
      lV54TFBarNomCli = GXutil.padr( GXutil.rtrim( AV54TFBarNomCli), 13, "%") ;
      /* Using cursor P09ZG31 */
      pr_default.execute(5, new Object[] {AV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, Integer.valueOf(AV73TFProFasEst_Sels.size()), AV61TFBarFasCod_Sel, AV60TFBarFasCod, lV60TFBarFasCod, AV61TFBarFasCod_Sel, AV61TFBarFasCod_Sel, Integer.valueOf(AV64CliCod), Integer.valueOf(AV65CliCod_to), AV66BarFecGen, AV67BarFecGen_to, Byte.valueOf(AV68BarSit), Byte.valueOf(AV69BarSit_to), AV71EmprCod, AV63ProCod, Byte.valueOf(AV70ProFasEst), Integer.valueOf(AV34TFCliCod), Integer.valueOf(AV35TFCliCod_To), lV36TFCliNom, AV37TFCliNom_Sel, Integer.valueOf(AV38TFBarCod), Integer.valueOf(AV39TFBarCod_To), Byte.valueOf(AV40TFBarCodReo), Byte.valueOf(AV41TFBarCodReo_To), lV42TFBarCodPar, AV43TFBarCodPar_Sel, Byte.valueOf(AV44TFBarSit), Byte.valueOf(AV45TFBarSit_To), lV46TFBarSer, AV47TFBarSer_Sel, lV48TFBarSerDsc, AV49TFBarSerDsc_Sel, lV50TFBarColNom, AV51TFBarColNom_Sel, Integer.valueOf(AV52TFBarColNum), Integer.valueOf(AV53TFBarColNum_To), lV54TFBarNomCli, AV55TFBarNomCli_Sel, AV56TFBarKgm, AV57TFBarKgm_To, AV58TFBarMtr, AV59TFBarMtr_To});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk9ZG12 = false ;
         A396EmprCod = P09ZG31_A396EmprCod[0] ;
         A758ProCod = P09ZG31_A758ProCod[0] ;
         A1234BarNomCli = P09ZG31_A1234BarNomCli[0] ;
         A14284ProEst = P09ZG31_A14284ProEst[0] ;
         A159BarFecGen = P09ZG31_A159BarFecGen[0] ;
         A136BarColNum = P09ZG31_A136BarColNum[0] ;
         A135BarColNom = P09ZG31_A135BarColNom[0] ;
         A1652BarSerDsc = P09ZG31_A1652BarSerDsc[0] ;
         A212BarSer = P09ZG31_A212BarSer[0] ;
         A213BarSit = P09ZG31_A213BarSit[0] ;
         A130BarCodPar = P09ZG31_A130BarCodPar[0] ;
         A132BarCodReo = P09ZG31_A132BarCodReo[0] ;
         A129BarCod = P09ZG31_A129BarCod[0] ;
         A279CliNom = P09ZG31_A279CliNom[0] ;
         A252CliCod = P09ZG31_A252CliCod[0] ;
         n252CliCod = P09ZG31_n252CliCod[0] ;
         A760ProFasEst = P09ZG31_A760ProFasEst[0] ;
         n760ProFasEst = P09ZG31_n760ProFasEst[0] ;
         A151BarFasCod = P09ZG31_A151BarFasCod[0] ;
         n151BarFasCod = P09ZG31_n151BarFasCod[0] ;
         A184BarMtr = P09ZG31_A184BarMtr[0] ;
         A166BarKgm = P09ZG31_A166BarKgm[0] ;
         A14284ProEst = P09ZG31_A14284ProEst[0] ;
         A1234BarNomCli = P09ZG31_A1234BarNomCli[0] ;
         A159BarFecGen = P09ZG31_A159BarFecGen[0] ;
         A136BarColNum = P09ZG31_A136BarColNum[0] ;
         A135BarColNom = P09ZG31_A135BarColNom[0] ;
         A1652BarSerDsc = P09ZG31_A1652BarSerDsc[0] ;
         A212BarSer = P09ZG31_A212BarSer[0] ;
         A213BarSit = P09ZG31_A213BarSit[0] ;
         A252CliCod = P09ZG31_A252CliCod[0] ;
         n252CliCod = P09ZG31_n252CliCod[0] ;
         A279CliNom = P09ZG31_A279CliNom[0] ;
         A151BarFasCod = P09ZG31_A151BarFasCod[0] ;
         n151BarFasCod = P09ZG31_n151BarFasCod[0] ;
         A184BarMtr = P09ZG31_A184BarMtr[0] ;
         A166BarKgm = P09ZG31_A166BarKgm[0] ;
         A760ProFasEst = P09ZG31_A760ProFasEst[0] ;
         n760ProFasEst = P09ZG31_n760ProFasEst[0] ;
         if ( GXutil.strcmp(A14284ProEst, httpContext.getMessage( "A", "")) == 0 )
         {
            AV20count = 0 ;
            while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P09ZG31_A1234BarNomCli[0], A1234BarNomCli) == 0 ) )
            {
               brk9ZG12 = false ;
               A396EmprCod = P09ZG31_A396EmprCod[0] ;
               A758ProCod = P09ZG31_A758ProCod[0] ;
               A130BarCodPar = P09ZG31_A130BarCodPar[0] ;
               A132BarCodReo = P09ZG31_A132BarCodReo[0] ;
               A129BarCod = P09ZG31_A129BarCod[0] ;
               AV20count = (long)(AV20count+1) ;
               brk9ZG12 = true ;
               pr_default.readNext(5);
            }
            if ( ! (GXutil.strcmp("", A1234BarNomCli)==0) )
            {
               AV15Option = A1234BarNomCli ;
               AV16Options.add(AV15Option, 0);
               AV19OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV20count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV16Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk9ZG12 )
         {
            brk9ZG12 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   public void S181( )
   {
      /* 'LOADBARFASCODOPTIONS' Routine */
      returnInSub = false ;
      AV60TFBarFasCod = AV27SearchTxt ;
      AV61TFBarFasCod_Sel = "" ;
      pr_default.dynParam(6, new Object[]{ new Object[]{
                                           Byte.valueOf(A760ProFasEst) ,
                                           AV73TFProFasEst_Sels ,
                                           Integer.valueOf(AV34TFCliCod) ,
                                           Integer.valueOf(AV35TFCliCod_To) ,
                                           AV37TFCliNom_Sel ,
                                           AV36TFCliNom ,
                                           Integer.valueOf(AV38TFBarCod) ,
                                           Integer.valueOf(AV39TFBarCod_To) ,
                                           Byte.valueOf(AV40TFBarCodReo) ,
                                           Byte.valueOf(AV41TFBarCodReo_To) ,
                                           AV43TFBarCodPar_Sel ,
                                           AV42TFBarCodPar ,
                                           Byte.valueOf(AV44TFBarSit) ,
                                           Byte.valueOf(AV45TFBarSit_To) ,
                                           AV47TFBarSer_Sel ,
                                           AV46TFBarSer ,
                                           AV49TFBarSerDsc_Sel ,
                                           AV48TFBarSerDsc ,
                                           AV51TFBarColNom_Sel ,
                                           AV50TFBarColNom ,
                                           Integer.valueOf(AV52TFBarColNum) ,
                                           Integer.valueOf(AV53TFBarColNum_To) ,
                                           AV55TFBarNomCli_Sel ,
                                           AV54TFBarNomCli ,
                                           AV56TFBarKgm ,
                                           AV57TFBarKgm_To ,
                                           AV58TFBarMtr ,
                                           AV59TFBarMtr_To ,
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
                                           A1234BarNomCli ,
                                           A166BarKgm ,
                                           A184BarMtr ,
                                           AV62FilterFullText ,
                                           A151BarFasCod ,
                                           Integer.valueOf(AV73TFProFasEst_Sels.size()) ,
                                           AV61TFBarFasCod_Sel ,
                                           AV60TFBarFasCod ,
                                           Integer.valueOf(AV64CliCod) ,
                                           Integer.valueOf(AV65CliCod_to) ,
                                           A159BarFecGen ,
                                           AV66BarFecGen ,
                                           AV67BarFecGen_to ,
                                           Byte.valueOf(AV68BarSit) ,
                                           Byte.valueOf(AV69BarSit_to) ,
                                           A14284ProEst ,
                                           Byte.valueOf(AV70ProFasEst) ,
                                           AV71EmprCod ,
                                           AV63ProCod ,
                                           A396EmprCod ,
                                           A758ProCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV62FilterFullText = GXutil.concat( GXutil.rtrim( AV62FilterFullText), "%", "") ;
      lV60TFBarFasCod = GXutil.padr( GXutil.rtrim( AV60TFBarFasCod), 8, "%") ;
      lV36TFCliNom = GXutil.padr( GXutil.rtrim( AV36TFCliNom), 30, "%") ;
      lV42TFBarCodPar = GXutil.padr( GXutil.rtrim( AV42TFBarCodPar), 1, "%") ;
      lV46TFBarSer = GXutil.padr( GXutil.rtrim( AV46TFBarSer), 16, "%") ;
      lV48TFBarSerDsc = GXutil.padr( GXutil.rtrim( AV48TFBarSerDsc), 26, "%") ;
      lV50TFBarColNom = GXutil.padr( GXutil.rtrim( AV50TFBarColNom), 13, "%") ;
      lV54TFBarNomCli = GXutil.padr( GXutil.rtrim( AV54TFBarNomCli), 13, "%") ;
      /* Using cursor P09ZG36 */
      pr_default.execute(6, new Object[] {AV71EmprCod, AV63ProCod, AV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, lV62FilterFullText, Integer.valueOf(AV73TFProFasEst_Sels.size()), AV61TFBarFasCod_Sel, AV60TFBarFasCod, lV60TFBarFasCod, AV61TFBarFasCod_Sel, AV61TFBarFasCod_Sel, Integer.valueOf(AV64CliCod), Integer.valueOf(AV65CliCod_to), AV66BarFecGen, AV67BarFecGen_to, Byte.valueOf(AV68BarSit), Byte.valueOf(AV69BarSit_to), Byte.valueOf(AV70ProFasEst), Integer.valueOf(AV34TFCliCod), Integer.valueOf(AV35TFCliCod_To), lV36TFCliNom, AV37TFCliNom_Sel, Integer.valueOf(AV38TFBarCod), Integer.valueOf(AV39TFBarCod_To), Byte.valueOf(AV40TFBarCodReo), Byte.valueOf(AV41TFBarCodReo_To), lV42TFBarCodPar, AV43TFBarCodPar_Sel, Byte.valueOf(AV44TFBarSit), Byte.valueOf(AV45TFBarSit_To), lV46TFBarSer, AV47TFBarSer_Sel, lV48TFBarSerDsc, AV49TFBarSerDsc_Sel, lV50TFBarColNom, AV51TFBarColNom_Sel, Integer.valueOf(AV52TFBarColNum), Integer.valueOf(AV53TFBarColNum_To), lV54TFBarNomCli, AV55TFBarNomCli_Sel, AV56TFBarKgm, AV57TFBarKgm_To, AV58TFBarMtr, AV59TFBarMtr_To});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A14284ProEst = P09ZG36_A14284ProEst[0] ;
         A159BarFecGen = P09ZG36_A159BarFecGen[0] ;
         A758ProCod = P09ZG36_A758ProCod[0] ;
         A396EmprCod = P09ZG36_A396EmprCod[0] ;
         A1234BarNomCli = P09ZG36_A1234BarNomCli[0] ;
         A136BarColNum = P09ZG36_A136BarColNum[0] ;
         A135BarColNom = P09ZG36_A135BarColNom[0] ;
         A1652BarSerDsc = P09ZG36_A1652BarSerDsc[0] ;
         A212BarSer = P09ZG36_A212BarSer[0] ;
         A213BarSit = P09ZG36_A213BarSit[0] ;
         A130BarCodPar = P09ZG36_A130BarCodPar[0] ;
         A132BarCodReo = P09ZG36_A132BarCodReo[0] ;
         A129BarCod = P09ZG36_A129BarCod[0] ;
         A279CliNom = P09ZG36_A279CliNom[0] ;
         A252CliCod = P09ZG36_A252CliCod[0] ;
         n252CliCod = P09ZG36_n252CliCod[0] ;
         A151BarFasCod = P09ZG36_A151BarFasCod[0] ;
         n151BarFasCod = P09ZG36_n151BarFasCod[0] ;
         A184BarMtr = P09ZG36_A184BarMtr[0] ;
         A166BarKgm = P09ZG36_A166BarKgm[0] ;
         A760ProFasEst = P09ZG36_A760ProFasEst[0] ;
         n760ProFasEst = P09ZG36_n760ProFasEst[0] ;
         A14284ProEst = P09ZG36_A14284ProEst[0] ;
         A159BarFecGen = P09ZG36_A159BarFecGen[0] ;
         A1234BarNomCli = P09ZG36_A1234BarNomCli[0] ;
         A136BarColNum = P09ZG36_A136BarColNum[0] ;
         A135BarColNom = P09ZG36_A135BarColNom[0] ;
         A1652BarSerDsc = P09ZG36_A1652BarSerDsc[0] ;
         A212BarSer = P09ZG36_A212BarSer[0] ;
         A213BarSit = P09ZG36_A213BarSit[0] ;
         A252CliCod = P09ZG36_A252CliCod[0] ;
         n252CliCod = P09ZG36_n252CliCod[0] ;
         A279CliNom = P09ZG36_A279CliNom[0] ;
         A151BarFasCod = P09ZG36_A151BarFasCod[0] ;
         n151BarFasCod = P09ZG36_n151BarFasCod[0] ;
         A184BarMtr = P09ZG36_A184BarMtr[0] ;
         A166BarKgm = P09ZG36_A166BarKgm[0] ;
         A760ProFasEst = P09ZG36_A760ProFasEst[0] ;
         n760ProFasEst = P09ZG36_n760ProFasEst[0] ;
         if ( GXutil.strcmp(A14284ProEst, httpContext.getMessage( "A", "")) == 0 )
         {
            if ( ! (GXutil.strcmp("", A151BarFasCod)==0) )
            {
               AV15Option = A151BarFasCod ;
               AV14InsertIndex = 1 ;
               while ( ( AV14InsertIndex <= AV16Options.size() ) && ( GXutil.strcmp((String)AV16Options.elementAt(-1+AV14InsertIndex), AV15Option) < 0 ) )
               {
                  AV14InsertIndex = (int)(AV14InsertIndex+1) ;
               }
               if ( ( AV14InsertIndex <= AV16Options.size() ) && ( GXutil.strcmp((String)AV16Options.elementAt(-1+AV14InsertIndex), AV15Option) == 0 ) )
               {
                  AV20count = GXutil.lval( (String)AV19OptionIndexes.elementAt(-1+AV14InsertIndex)) ;
                  AV20count = (long)(AV20count+1) ;
                  AV19OptionIndexes.removeItem(AV14InsertIndex);
                  AV19OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV20count), "Z,ZZZ,ZZZ,ZZ9")), AV14InsertIndex);
               }
               else
               {
                  AV16Options.add(AV15Option, AV14InsertIndex);
                  AV19OptionIndexes.add("1", AV14InsertIndex);
               }
            }
            if ( AV16Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         pr_default.readNext(6);
      }
      pr_default.close(6);
   }

   protected void cleanup( )
   {
      this.aP3[0] = cargasproduccionporproceso_wcgetfilterdata.this.AV29OptionsJson;
      this.aP4[0] = cargasproduccionporproceso_wcgetfilterdata.this.AV30OptionsDescJson;
      this.aP5[0] = cargasproduccionporproceso_wcgetfilterdata.this.AV31OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV29OptionsJson = "" ;
      AV30OptionsDescJson = "" ;
      AV31OptionIndexesJson = "" ;
      AV16Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV18OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV19OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV21Session = httpContext.getWebSession();
      AV23GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV24GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV62FilterFullText = "" ;
      AV72TFProFasEst_SelsJson = "" ;
      AV73TFProFasEst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV36TFCliNom = "" ;
      AV37TFCliNom_Sel = "" ;
      AV42TFBarCodPar = "" ;
      AV43TFBarCodPar_Sel = "" ;
      AV46TFBarSer = "" ;
      AV47TFBarSer_Sel = "" ;
      AV48TFBarSerDsc = "" ;
      AV49TFBarSerDsc_Sel = "" ;
      AV50TFBarColNom = "" ;
      AV51TFBarColNom_Sel = "" ;
      AV54TFBarNomCli = "" ;
      AV55TFBarNomCli_Sel = "" ;
      AV56TFBarKgm = DecimalUtil.ZERO ;
      AV57TFBarKgm_To = DecimalUtil.ZERO ;
      AV58TFBarMtr = DecimalUtil.ZERO ;
      AV59TFBarMtr_To = DecimalUtil.ZERO ;
      AV60TFBarFasCod = "" ;
      AV61TFBarFasCod_Sel = "" ;
      lV62FilterFullText = "" ;
      scmdbuf = "" ;
      lV60TFBarFasCod = "" ;
      lV36TFCliNom = "" ;
      lV42TFBarCodPar = "" ;
      lV46TFBarSer = "" ;
      lV48TFBarSerDsc = "" ;
      lV50TFBarColNom = "" ;
      lV54TFBarNomCli = "" ;
      A279CliNom = "" ;
      A130BarCodPar = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A151BarFasCod = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      AV66BarFecGen = GXutil.nullDate() ;
      AV67BarFecGen_to = GXutil.nullDate() ;
      A14284ProEst = "" ;
      A396EmprCod = "" ;
      AV71EmprCod = "" ;
      A758ProCod = "" ;
      AV63ProCod = "" ;
      P09ZG6_A396EmprCod = new String[] {""} ;
      P09ZG6_A758ProCod = new String[] {""} ;
      P09ZG6_A279CliNom = new String[] {""} ;
      P09ZG6_A14284ProEst = new String[] {""} ;
      P09ZG6_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P09ZG6_A1234BarNomCli = new String[] {""} ;
      P09ZG6_A136BarColNum = new int[1] ;
      P09ZG6_A135BarColNom = new String[] {""} ;
      P09ZG6_A1652BarSerDsc = new String[] {""} ;
      P09ZG6_A212BarSer = new String[] {""} ;
      P09ZG6_A213BarSit = new byte[1] ;
      P09ZG6_A130BarCodPar = new String[] {""} ;
      P09ZG6_A132BarCodReo = new byte[1] ;
      P09ZG6_A129BarCod = new int[1] ;
      P09ZG6_A252CliCod = new int[1] ;
      P09ZG6_n252CliCod = new boolean[] {false} ;
      P09ZG6_A760ProFasEst = new byte[1] ;
      P09ZG6_n760ProFasEst = new boolean[] {false} ;
      P09ZG6_A151BarFasCod = new String[] {""} ;
      P09ZG6_n151BarFasCod = new boolean[] {false} ;
      P09ZG6_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09ZG6_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV15Option = "" ;
      P09ZG11_A396EmprCod = new String[] {""} ;
      P09ZG11_A758ProCod = new String[] {""} ;
      P09ZG11_A130BarCodPar = new String[] {""} ;
      P09ZG11_A14284ProEst = new String[] {""} ;
      P09ZG11_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P09ZG11_A1234BarNomCli = new String[] {""} ;
      P09ZG11_A136BarColNum = new int[1] ;
      P09ZG11_A135BarColNom = new String[] {""} ;
      P09ZG11_A1652BarSerDsc = new String[] {""} ;
      P09ZG11_A212BarSer = new String[] {""} ;
      P09ZG11_A213BarSit = new byte[1] ;
      P09ZG11_A132BarCodReo = new byte[1] ;
      P09ZG11_A129BarCod = new int[1] ;
      P09ZG11_A279CliNom = new String[] {""} ;
      P09ZG11_A252CliCod = new int[1] ;
      P09ZG11_n252CliCod = new boolean[] {false} ;
      P09ZG11_A760ProFasEst = new byte[1] ;
      P09ZG11_n760ProFasEst = new boolean[] {false} ;
      P09ZG11_A151BarFasCod = new String[] {""} ;
      P09ZG11_n151BarFasCod = new boolean[] {false} ;
      P09ZG11_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09ZG11_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09ZG16_A396EmprCod = new String[] {""} ;
      P09ZG16_A758ProCod = new String[] {""} ;
      P09ZG16_A212BarSer = new String[] {""} ;
      P09ZG16_A14284ProEst = new String[] {""} ;
      P09ZG16_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P09ZG16_A1234BarNomCli = new String[] {""} ;
      P09ZG16_A136BarColNum = new int[1] ;
      P09ZG16_A135BarColNom = new String[] {""} ;
      P09ZG16_A1652BarSerDsc = new String[] {""} ;
      P09ZG16_A213BarSit = new byte[1] ;
      P09ZG16_A130BarCodPar = new String[] {""} ;
      P09ZG16_A132BarCodReo = new byte[1] ;
      P09ZG16_A129BarCod = new int[1] ;
      P09ZG16_A279CliNom = new String[] {""} ;
      P09ZG16_A252CliCod = new int[1] ;
      P09ZG16_n252CliCod = new boolean[] {false} ;
      P09ZG16_A760ProFasEst = new byte[1] ;
      P09ZG16_n760ProFasEst = new boolean[] {false} ;
      P09ZG16_A151BarFasCod = new String[] {""} ;
      P09ZG16_n151BarFasCod = new boolean[] {false} ;
      P09ZG16_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09ZG16_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09ZG21_A396EmprCod = new String[] {""} ;
      P09ZG21_A758ProCod = new String[] {""} ;
      P09ZG21_A1652BarSerDsc = new String[] {""} ;
      P09ZG21_A14284ProEst = new String[] {""} ;
      P09ZG21_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P09ZG21_A1234BarNomCli = new String[] {""} ;
      P09ZG21_A136BarColNum = new int[1] ;
      P09ZG21_A135BarColNom = new String[] {""} ;
      P09ZG21_A212BarSer = new String[] {""} ;
      P09ZG21_A213BarSit = new byte[1] ;
      P09ZG21_A130BarCodPar = new String[] {""} ;
      P09ZG21_A132BarCodReo = new byte[1] ;
      P09ZG21_A129BarCod = new int[1] ;
      P09ZG21_A279CliNom = new String[] {""} ;
      P09ZG21_A252CliCod = new int[1] ;
      P09ZG21_n252CliCod = new boolean[] {false} ;
      P09ZG21_A760ProFasEst = new byte[1] ;
      P09ZG21_n760ProFasEst = new boolean[] {false} ;
      P09ZG21_A151BarFasCod = new String[] {""} ;
      P09ZG21_n151BarFasCod = new boolean[] {false} ;
      P09ZG21_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09ZG21_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09ZG26_A396EmprCod = new String[] {""} ;
      P09ZG26_A758ProCod = new String[] {""} ;
      P09ZG26_A135BarColNom = new String[] {""} ;
      P09ZG26_A14284ProEst = new String[] {""} ;
      P09ZG26_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P09ZG26_A1234BarNomCli = new String[] {""} ;
      P09ZG26_A136BarColNum = new int[1] ;
      P09ZG26_A1652BarSerDsc = new String[] {""} ;
      P09ZG26_A212BarSer = new String[] {""} ;
      P09ZG26_A213BarSit = new byte[1] ;
      P09ZG26_A130BarCodPar = new String[] {""} ;
      P09ZG26_A132BarCodReo = new byte[1] ;
      P09ZG26_A129BarCod = new int[1] ;
      P09ZG26_A279CliNom = new String[] {""} ;
      P09ZG26_A252CliCod = new int[1] ;
      P09ZG26_n252CliCod = new boolean[] {false} ;
      P09ZG26_A760ProFasEst = new byte[1] ;
      P09ZG26_n760ProFasEst = new boolean[] {false} ;
      P09ZG26_A151BarFasCod = new String[] {""} ;
      P09ZG26_n151BarFasCod = new boolean[] {false} ;
      P09ZG26_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09ZG26_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09ZG31_A396EmprCod = new String[] {""} ;
      P09ZG31_A758ProCod = new String[] {""} ;
      P09ZG31_A1234BarNomCli = new String[] {""} ;
      P09ZG31_A14284ProEst = new String[] {""} ;
      P09ZG31_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P09ZG31_A136BarColNum = new int[1] ;
      P09ZG31_A135BarColNom = new String[] {""} ;
      P09ZG31_A1652BarSerDsc = new String[] {""} ;
      P09ZG31_A212BarSer = new String[] {""} ;
      P09ZG31_A213BarSit = new byte[1] ;
      P09ZG31_A130BarCodPar = new String[] {""} ;
      P09ZG31_A132BarCodReo = new byte[1] ;
      P09ZG31_A129BarCod = new int[1] ;
      P09ZG31_A279CliNom = new String[] {""} ;
      P09ZG31_A252CliCod = new int[1] ;
      P09ZG31_n252CliCod = new boolean[] {false} ;
      P09ZG31_A760ProFasEst = new byte[1] ;
      P09ZG31_n760ProFasEst = new boolean[] {false} ;
      P09ZG31_A151BarFasCod = new String[] {""} ;
      P09ZG31_n151BarFasCod = new boolean[] {false} ;
      P09ZG31_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09ZG31_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09ZG36_A14284ProEst = new String[] {""} ;
      P09ZG36_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P09ZG36_A758ProCod = new String[] {""} ;
      P09ZG36_A396EmprCod = new String[] {""} ;
      P09ZG36_A1234BarNomCli = new String[] {""} ;
      P09ZG36_A136BarColNum = new int[1] ;
      P09ZG36_A135BarColNom = new String[] {""} ;
      P09ZG36_A1652BarSerDsc = new String[] {""} ;
      P09ZG36_A212BarSer = new String[] {""} ;
      P09ZG36_A213BarSit = new byte[1] ;
      P09ZG36_A130BarCodPar = new String[] {""} ;
      P09ZG36_A132BarCodReo = new byte[1] ;
      P09ZG36_A129BarCod = new int[1] ;
      P09ZG36_A279CliNom = new String[] {""} ;
      P09ZG36_A252CliCod = new int[1] ;
      P09ZG36_n252CliCod = new boolean[] {false} ;
      P09ZG36_A151BarFasCod = new String[] {""} ;
      P09ZG36_n151BarFasCod = new boolean[] {false} ;
      P09ZG36_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09ZG36_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09ZG36_A760ProFasEst = new byte[1] ;
      P09ZG36_n760ProFasEst = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccion.cargasproduccionporproceso_wcgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09ZG6_A396EmprCod, P09ZG6_A758ProCod, P09ZG6_A279CliNom, P09ZG6_A14284ProEst, P09ZG6_A159BarFecGen, P09ZG6_A1234BarNomCli, P09ZG6_A136BarColNum, P09ZG6_A135BarColNom, P09ZG6_A1652BarSerDsc, P09ZG6_A212BarSer,
            P09ZG6_A213BarSit, P09ZG6_A130BarCodPar, P09ZG6_A132BarCodReo, P09ZG6_A129BarCod, P09ZG6_A252CliCod, P09ZG6_n252CliCod, P09ZG6_A760ProFasEst, P09ZG6_n760ProFasEst, P09ZG6_A151BarFasCod, P09ZG6_n151BarFasCod,
            P09ZG6_A184BarMtr, P09ZG6_A166BarKgm
            }
            , new Object[] {
            P09ZG11_A396EmprCod, P09ZG11_A758ProCod, P09ZG11_A130BarCodPar, P09ZG11_A14284ProEst, P09ZG11_A159BarFecGen, P09ZG11_A1234BarNomCli, P09ZG11_A136BarColNum, P09ZG11_A135BarColNom, P09ZG11_A1652BarSerDsc, P09ZG11_A212BarSer,
            P09ZG11_A213BarSit, P09ZG11_A132BarCodReo, P09ZG11_A129BarCod, P09ZG11_A279CliNom, P09ZG11_A252CliCod, P09ZG11_n252CliCod, P09ZG11_A760ProFasEst, P09ZG11_n760ProFasEst, P09ZG11_A151BarFasCod, P09ZG11_n151BarFasCod,
            P09ZG11_A184BarMtr, P09ZG11_A166BarKgm
            }
            , new Object[] {
            P09ZG16_A396EmprCod, P09ZG16_A758ProCod, P09ZG16_A212BarSer, P09ZG16_A14284ProEst, P09ZG16_A159BarFecGen, P09ZG16_A1234BarNomCli, P09ZG16_A136BarColNum, P09ZG16_A135BarColNom, P09ZG16_A1652BarSerDsc, P09ZG16_A213BarSit,
            P09ZG16_A130BarCodPar, P09ZG16_A132BarCodReo, P09ZG16_A129BarCod, P09ZG16_A279CliNom, P09ZG16_A252CliCod, P09ZG16_n252CliCod, P09ZG16_A760ProFasEst, P09ZG16_n760ProFasEst, P09ZG16_A151BarFasCod, P09ZG16_n151BarFasCod,
            P09ZG16_A184BarMtr, P09ZG16_A166BarKgm
            }
            , new Object[] {
            P09ZG21_A396EmprCod, P09ZG21_A758ProCod, P09ZG21_A1652BarSerDsc, P09ZG21_A14284ProEst, P09ZG21_A159BarFecGen, P09ZG21_A1234BarNomCli, P09ZG21_A136BarColNum, P09ZG21_A135BarColNom, P09ZG21_A212BarSer, P09ZG21_A213BarSit,
            P09ZG21_A130BarCodPar, P09ZG21_A132BarCodReo, P09ZG21_A129BarCod, P09ZG21_A279CliNom, P09ZG21_A252CliCod, P09ZG21_n252CliCod, P09ZG21_A760ProFasEst, P09ZG21_n760ProFasEst, P09ZG21_A151BarFasCod, P09ZG21_n151BarFasCod,
            P09ZG21_A184BarMtr, P09ZG21_A166BarKgm
            }
            , new Object[] {
            P09ZG26_A396EmprCod, P09ZG26_A758ProCod, P09ZG26_A135BarColNom, P09ZG26_A14284ProEst, P09ZG26_A159BarFecGen, P09ZG26_A1234BarNomCli, P09ZG26_A136BarColNum, P09ZG26_A1652BarSerDsc, P09ZG26_A212BarSer, P09ZG26_A213BarSit,
            P09ZG26_A130BarCodPar, P09ZG26_A132BarCodReo, P09ZG26_A129BarCod, P09ZG26_A279CliNom, P09ZG26_A252CliCod, P09ZG26_n252CliCod, P09ZG26_A760ProFasEst, P09ZG26_n760ProFasEst, P09ZG26_A151BarFasCod, P09ZG26_n151BarFasCod,
            P09ZG26_A184BarMtr, P09ZG26_A166BarKgm
            }
            , new Object[] {
            P09ZG31_A396EmprCod, P09ZG31_A758ProCod, P09ZG31_A1234BarNomCli, P09ZG31_A14284ProEst, P09ZG31_A159BarFecGen, P09ZG31_A136BarColNum, P09ZG31_A135BarColNom, P09ZG31_A1652BarSerDsc, P09ZG31_A212BarSer, P09ZG31_A213BarSit,
            P09ZG31_A130BarCodPar, P09ZG31_A132BarCodReo, P09ZG31_A129BarCod, P09ZG31_A279CliNom, P09ZG31_A252CliCod, P09ZG31_n252CliCod, P09ZG31_A760ProFasEst, P09ZG31_n760ProFasEst, P09ZG31_A151BarFasCod, P09ZG31_n151BarFasCod,
            P09ZG31_A184BarMtr, P09ZG31_A166BarKgm
            }
            , new Object[] {
            P09ZG36_A14284ProEst, P09ZG36_A159BarFecGen, P09ZG36_A758ProCod, P09ZG36_A396EmprCod, P09ZG36_A1234BarNomCli, P09ZG36_A136BarColNum, P09ZG36_A135BarColNom, P09ZG36_A1652BarSerDsc, P09ZG36_A212BarSer, P09ZG36_A213BarSit,
            P09ZG36_A130BarCodPar, P09ZG36_A132BarCodReo, P09ZG36_A129BarCod, P09ZG36_A279CliNom, P09ZG36_A252CliCod, P09ZG36_n252CliCod, P09ZG36_A151BarFasCod, P09ZG36_n151BarFasCod, P09ZG36_A184BarMtr, P09ZG36_A166BarKgm,
            P09ZG36_A760ProFasEst, P09ZG36_n760ProFasEst
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV40TFBarCodReo ;
   private byte AV41TFBarCodReo_To ;
   private byte AV44TFBarSit ;
   private byte AV45TFBarSit_To ;
   private byte A760ProFasEst ;
   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private byte AV68BarSit ;
   private byte AV69BarSit_to ;
   private byte AV70ProFasEst ;
   private short Gx_err ;
   private int AV76GXV1 ;
   private int AV34TFCliCod ;
   private int AV35TFCliCod_To ;
   private int AV38TFBarCod ;
   private int AV39TFBarCod_To ;
   private int AV52TFBarColNum ;
   private int AV53TFBarColNum_To ;
   private int AV73TFProFasEst_Sels_size ;
   private int A252CliCod ;
   private int A129BarCod ;
   private int A136BarColNum ;
   private int AV64CliCod ;
   private int AV65CliCod_to ;
   private int AV14InsertIndex ;
   private long AV20count ;
   private java.math.BigDecimal AV56TFBarKgm ;
   private java.math.BigDecimal AV57TFBarKgm_To ;
   private java.math.BigDecimal AV58TFBarMtr ;
   private java.math.BigDecimal AV59TFBarMtr_To ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private String AV36TFCliNom ;
   private String AV37TFCliNom_Sel ;
   private String AV42TFBarCodPar ;
   private String AV43TFBarCodPar_Sel ;
   private String AV46TFBarSer ;
   private String AV47TFBarSer_Sel ;
   private String AV48TFBarSerDsc ;
   private String AV49TFBarSerDsc_Sel ;
   private String AV50TFBarColNom ;
   private String AV51TFBarColNom_Sel ;
   private String AV54TFBarNomCli ;
   private String AV55TFBarNomCli_Sel ;
   private String AV60TFBarFasCod ;
   private String AV61TFBarFasCod_Sel ;
   private String scmdbuf ;
   private String lV60TFBarFasCod ;
   private String lV36TFCliNom ;
   private String lV42TFBarCodPar ;
   private String lV46TFBarSer ;
   private String lV48TFBarSerDsc ;
   private String lV50TFBarColNom ;
   private String lV54TFBarNomCli ;
   private String A279CliNom ;
   private String A130BarCodPar ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A151BarFasCod ;
   private String A14284ProEst ;
   private String A396EmprCod ;
   private String AV71EmprCod ;
   private String A758ProCod ;
   private String AV63ProCod ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date AV66BarFecGen ;
   private java.util.Date AV67BarFecGen_to ;
   private boolean returnInSub ;
   private boolean brk9ZG2 ;
   private boolean n252CliCod ;
   private boolean n760ProFasEst ;
   private boolean n151BarFasCod ;
   private boolean brk9ZG4 ;
   private boolean brk9ZG6 ;
   private boolean brk9ZG8 ;
   private boolean brk9ZG10 ;
   private boolean brk9ZG12 ;
   private String AV29OptionsJson ;
   private String AV30OptionsDescJson ;
   private String AV31OptionIndexesJson ;
   private String AV72TFProFasEst_SelsJson ;
   private String AV26DDOName ;
   private String AV27SearchTxt ;
   private String AV28SearchTxtTo ;
   private String AV62FilterFullText ;
   private String lV62FilterFullText ;
   private String AV15Option ;
   private GXSimpleCollection<Byte> AV73TFProFasEst_Sels ;
   private com.genexus.webpanels.WebSession AV21Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09ZG6_A396EmprCod ;
   private String[] P09ZG6_A758ProCod ;
   private String[] P09ZG6_A279CliNom ;
   private String[] P09ZG6_A14284ProEst ;
   private java.util.Date[] P09ZG6_A159BarFecGen ;
   private String[] P09ZG6_A1234BarNomCli ;
   private int[] P09ZG6_A136BarColNum ;
   private String[] P09ZG6_A135BarColNom ;
   private String[] P09ZG6_A1652BarSerDsc ;
   private String[] P09ZG6_A212BarSer ;
   private byte[] P09ZG6_A213BarSit ;
   private String[] P09ZG6_A130BarCodPar ;
   private byte[] P09ZG6_A132BarCodReo ;
   private int[] P09ZG6_A129BarCod ;
   private int[] P09ZG6_A252CliCod ;
   private boolean[] P09ZG6_n252CliCod ;
   private byte[] P09ZG6_A760ProFasEst ;
   private boolean[] P09ZG6_n760ProFasEst ;
   private String[] P09ZG6_A151BarFasCod ;
   private boolean[] P09ZG6_n151BarFasCod ;
   private java.math.BigDecimal[] P09ZG6_A184BarMtr ;
   private java.math.BigDecimal[] P09ZG6_A166BarKgm ;
   private String[] P09ZG11_A396EmprCod ;
   private String[] P09ZG11_A758ProCod ;
   private String[] P09ZG11_A130BarCodPar ;
   private String[] P09ZG11_A14284ProEst ;
   private java.util.Date[] P09ZG11_A159BarFecGen ;
   private String[] P09ZG11_A1234BarNomCli ;
   private int[] P09ZG11_A136BarColNum ;
   private String[] P09ZG11_A135BarColNom ;
   private String[] P09ZG11_A1652BarSerDsc ;
   private String[] P09ZG11_A212BarSer ;
   private byte[] P09ZG11_A213BarSit ;
   private byte[] P09ZG11_A132BarCodReo ;
   private int[] P09ZG11_A129BarCod ;
   private String[] P09ZG11_A279CliNom ;
   private int[] P09ZG11_A252CliCod ;
   private boolean[] P09ZG11_n252CliCod ;
   private byte[] P09ZG11_A760ProFasEst ;
   private boolean[] P09ZG11_n760ProFasEst ;
   private String[] P09ZG11_A151BarFasCod ;
   private boolean[] P09ZG11_n151BarFasCod ;
   private java.math.BigDecimal[] P09ZG11_A184BarMtr ;
   private java.math.BigDecimal[] P09ZG11_A166BarKgm ;
   private String[] P09ZG16_A396EmprCod ;
   private String[] P09ZG16_A758ProCod ;
   private String[] P09ZG16_A212BarSer ;
   private String[] P09ZG16_A14284ProEst ;
   private java.util.Date[] P09ZG16_A159BarFecGen ;
   private String[] P09ZG16_A1234BarNomCli ;
   private int[] P09ZG16_A136BarColNum ;
   private String[] P09ZG16_A135BarColNom ;
   private String[] P09ZG16_A1652BarSerDsc ;
   private byte[] P09ZG16_A213BarSit ;
   private String[] P09ZG16_A130BarCodPar ;
   private byte[] P09ZG16_A132BarCodReo ;
   private int[] P09ZG16_A129BarCod ;
   private String[] P09ZG16_A279CliNom ;
   private int[] P09ZG16_A252CliCod ;
   private boolean[] P09ZG16_n252CliCod ;
   private byte[] P09ZG16_A760ProFasEst ;
   private boolean[] P09ZG16_n760ProFasEst ;
   private String[] P09ZG16_A151BarFasCod ;
   private boolean[] P09ZG16_n151BarFasCod ;
   private java.math.BigDecimal[] P09ZG16_A184BarMtr ;
   private java.math.BigDecimal[] P09ZG16_A166BarKgm ;
   private String[] P09ZG21_A396EmprCod ;
   private String[] P09ZG21_A758ProCod ;
   private String[] P09ZG21_A1652BarSerDsc ;
   private String[] P09ZG21_A14284ProEst ;
   private java.util.Date[] P09ZG21_A159BarFecGen ;
   private String[] P09ZG21_A1234BarNomCli ;
   private int[] P09ZG21_A136BarColNum ;
   private String[] P09ZG21_A135BarColNom ;
   private String[] P09ZG21_A212BarSer ;
   private byte[] P09ZG21_A213BarSit ;
   private String[] P09ZG21_A130BarCodPar ;
   private byte[] P09ZG21_A132BarCodReo ;
   private int[] P09ZG21_A129BarCod ;
   private String[] P09ZG21_A279CliNom ;
   private int[] P09ZG21_A252CliCod ;
   private boolean[] P09ZG21_n252CliCod ;
   private byte[] P09ZG21_A760ProFasEst ;
   private boolean[] P09ZG21_n760ProFasEst ;
   private String[] P09ZG21_A151BarFasCod ;
   private boolean[] P09ZG21_n151BarFasCod ;
   private java.math.BigDecimal[] P09ZG21_A184BarMtr ;
   private java.math.BigDecimal[] P09ZG21_A166BarKgm ;
   private String[] P09ZG26_A396EmprCod ;
   private String[] P09ZG26_A758ProCod ;
   private String[] P09ZG26_A135BarColNom ;
   private String[] P09ZG26_A14284ProEst ;
   private java.util.Date[] P09ZG26_A159BarFecGen ;
   private String[] P09ZG26_A1234BarNomCli ;
   private int[] P09ZG26_A136BarColNum ;
   private String[] P09ZG26_A1652BarSerDsc ;
   private String[] P09ZG26_A212BarSer ;
   private byte[] P09ZG26_A213BarSit ;
   private String[] P09ZG26_A130BarCodPar ;
   private byte[] P09ZG26_A132BarCodReo ;
   private int[] P09ZG26_A129BarCod ;
   private String[] P09ZG26_A279CliNom ;
   private int[] P09ZG26_A252CliCod ;
   private boolean[] P09ZG26_n252CliCod ;
   private byte[] P09ZG26_A760ProFasEst ;
   private boolean[] P09ZG26_n760ProFasEst ;
   private String[] P09ZG26_A151BarFasCod ;
   private boolean[] P09ZG26_n151BarFasCod ;
   private java.math.BigDecimal[] P09ZG26_A184BarMtr ;
   private java.math.BigDecimal[] P09ZG26_A166BarKgm ;
   private String[] P09ZG31_A396EmprCod ;
   private String[] P09ZG31_A758ProCod ;
   private String[] P09ZG31_A1234BarNomCli ;
   private String[] P09ZG31_A14284ProEst ;
   private java.util.Date[] P09ZG31_A159BarFecGen ;
   private int[] P09ZG31_A136BarColNum ;
   private String[] P09ZG31_A135BarColNom ;
   private String[] P09ZG31_A1652BarSerDsc ;
   private String[] P09ZG31_A212BarSer ;
   private byte[] P09ZG31_A213BarSit ;
   private String[] P09ZG31_A130BarCodPar ;
   private byte[] P09ZG31_A132BarCodReo ;
   private int[] P09ZG31_A129BarCod ;
   private String[] P09ZG31_A279CliNom ;
   private int[] P09ZG31_A252CliCod ;
   private boolean[] P09ZG31_n252CliCod ;
   private byte[] P09ZG31_A760ProFasEst ;
   private boolean[] P09ZG31_n760ProFasEst ;
   private String[] P09ZG31_A151BarFasCod ;
   private boolean[] P09ZG31_n151BarFasCod ;
   private java.math.BigDecimal[] P09ZG31_A184BarMtr ;
   private java.math.BigDecimal[] P09ZG31_A166BarKgm ;
   private String[] P09ZG36_A14284ProEst ;
   private java.util.Date[] P09ZG36_A159BarFecGen ;
   private String[] P09ZG36_A758ProCod ;
   private String[] P09ZG36_A396EmprCod ;
   private String[] P09ZG36_A1234BarNomCli ;
   private int[] P09ZG36_A136BarColNum ;
   private String[] P09ZG36_A135BarColNom ;
   private String[] P09ZG36_A1652BarSerDsc ;
   private String[] P09ZG36_A212BarSer ;
   private byte[] P09ZG36_A213BarSit ;
   private String[] P09ZG36_A130BarCodPar ;
   private byte[] P09ZG36_A132BarCodReo ;
   private int[] P09ZG36_A129BarCod ;
   private String[] P09ZG36_A279CliNom ;
   private int[] P09ZG36_A252CliCod ;
   private boolean[] P09ZG36_n252CliCod ;
   private String[] P09ZG36_A151BarFasCod ;
   private boolean[] P09ZG36_n151BarFasCod ;
   private java.math.BigDecimal[] P09ZG36_A184BarMtr ;
   private java.math.BigDecimal[] P09ZG36_A166BarKgm ;
   private byte[] P09ZG36_A760ProFasEst ;
   private boolean[] P09ZG36_n760ProFasEst ;
   private GXSimpleCollection<String> AV16Options ;
   private GXSimpleCollection<String> AV18OptionsDesc ;
   private GXSimpleCollection<String> AV19OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV23GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV24GridStateFilterValue ;
}

final  class cargasproduccionporproceso_wcgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09ZG6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A760ProFasEst ,
                                          GXSimpleCollection<Byte> AV73TFProFasEst_Sels ,
                                          int AV34TFCliCod ,
                                          int AV35TFCliCod_To ,
                                          String AV37TFCliNom_Sel ,
                                          String AV36TFCliNom ,
                                          int AV38TFBarCod ,
                                          int AV39TFBarCod_To ,
                                          byte AV40TFBarCodReo ,
                                          byte AV41TFBarCodReo_To ,
                                          String AV43TFBarCodPar_Sel ,
                                          String AV42TFBarCodPar ,
                                          byte AV44TFBarSit ,
                                          byte AV45TFBarSit_To ,
                                          String AV47TFBarSer_Sel ,
                                          String AV46TFBarSer ,
                                          String AV49TFBarSerDsc_Sel ,
                                          String AV48TFBarSerDsc ,
                                          String AV51TFBarColNom_Sel ,
                                          String AV50TFBarColNom ,
                                          int AV52TFBarColNum ,
                                          int AV53TFBarColNum_To ,
                                          String AV55TFBarNomCli_Sel ,
                                          String AV54TFBarNomCli ,
                                          java.math.BigDecimal AV56TFBarKgm ,
                                          java.math.BigDecimal AV57TFBarKgm_To ,
                                          java.math.BigDecimal AV58TFBarMtr ,
                                          java.math.BigDecimal AV59TFBarMtr_To ,
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
                                          String A1234BarNomCli ,
                                          java.math.BigDecimal A166BarKgm ,
                                          java.math.BigDecimal A184BarMtr ,
                                          String AV62FilterFullText ,
                                          String A151BarFasCod ,
                                          int AV73TFProFasEst_Sels_size ,
                                          String AV61TFBarFasCod_Sel ,
                                          String AV60TFBarFasCod ,
                                          int AV64CliCod ,
                                          int AV65CliCod_to ,
                                          java.util.Date A159BarFecGen ,
                                          java.util.Date AV66BarFecGen ,
                                          java.util.Date AV67BarFecGen_to ,
                                          byte AV68BarSit ,
                                          byte AV69BarSit_to ,
                                          String A14284ProEst ,
                                          String A396EmprCod ,
                                          String AV71EmprCod ,
                                          String A758ProCod ,
                                          String AV63ProCod ,
                                          byte AV70ProFasEst )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[57];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ProCod, T4.CliNom, T2.ProEst, T3.BarFecGen, T3.BarNomCli, T3.BarColNum, T3.BarColNom, T3.BarSerDsc, T3.BarSer, T3.BarSit, T1.BarCodPar, T1.BarCodReo," ;
      scmdbuf += " T1.BarCod, T3.CliCod, COALESCE( T7.ProFasEst, 0) AS ProFasEst, COALESCE( T5.BarFasCod, ' ') AS BarFasCod, COALESCE( T6.BarMtr, 0) AS BarMtr, COALESCE( T6.BarKgm," ;
      scmdbuf += " 0) AS BarKgm FROM ((((((TXPBARPRO T1 INNER JOIN TXPPROCES T2 ON T2.EmprCod = T1.EmprCod AND T2.ProCod = T1.ProCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T3.CliCod)" ;
      scmdbuf += " LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasCod, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM (TXPBARFAS T8 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC1, EmprCod," ;
      scmdbuf += " BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod =" ;
      scmdbuf += " T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) WHERE (T8.BarOrdLin = T9.GXC1) AND (T8.BarFasEst <> 0) GROUP BY T8.EmprCod, T8.BarCod," ;
      scmdbuf += " T8.BarCodReo, T8.BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod = T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar) LEFT JOIN" ;
      scmdbuf += " (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      scmdbuf += " ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(BarFasEst) AS ProFasEst," ;
      scmdbuf += " EmprCod, BarCod, BarCodReo, BarCodPar, ProCod FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod ) T7 ON T7.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T7.BarCod = T1.BarCod AND T7.BarCodReo = T1.BarCodReo AND T7.BarCodPar = T1.BarCodPar AND T7.ProCod = T1.ProCod)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( SUBSTR(TO_CHAR(COALESCE( T7.ProFasEst, 0),'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T3.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T4.CliNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2) like '%' || ?) or ( UPPER(T1.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T3.BarSit,'90'), 2) like '%' || ?) or ( UPPER(T3.BarSer) like '%' || UPPER(?)) or ( UPPER(T3.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T3.BarColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T3.BarColNum,'999990'), 2) like '%' || ?) or ( UPPER(T3.BarNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T6.BarKgm, 0),'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T6.BarMtr, 0),'999990.99'), 2) like '%' || ?) or ( UPPER(COALESCE( T5.BarFasCod, ' ')) like '%' || UPPER(?))))");
      addWhere(sWhereString, "(? <= 0 or ( "+GXutil.toValueList("oracle7", AV73TFProFasEst_Sels, "COALESCE( T7.ProFasEst, 0) IN (", ")")+"))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T5.BarFasCod, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T5.BarFasCod, ' ') = ?))");
      addWhere(sWhereString, "(T3.CliCod >= ?)");
      addWhere(sWhereString, "(T3.CliCod <= ?)");
      addWhere(sWhereString, "(T3.BarFecGen >= ?)");
      addWhere(sWhereString, "(T3.BarFecGen <= ?)");
      addWhere(sWhereString, "(T3.BarSit >= ?)");
      addWhere(sWhereString, "(T3.BarSit <= ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.ProCod = ?)");
      addWhere(sWhereString, "(COALESCE( T7.ProFasEst, 0) = ?)");
      if ( ! (0==AV34TFCliCod) )
      {
         addWhere(sWhereString, "(T3.CliCod >= ?)");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( ! (0==AV35TFCliCod_To) )
      {
         addWhere(sWhereString, "(T3.CliCod <= ?)");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV37TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV36TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV37TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int2[34] = (byte)(1) ;
      }
      if ( ! (0==AV38TFBarCod) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int2[35] = (byte)(1) ;
      }
      if ( ! (0==AV39TFBarCod_To) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int2[36] = (byte)(1) ;
      }
      if ( ! (0==AV40TFBarCodReo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int2[37] = (byte)(1) ;
      }
      if ( ! (0==AV41TFBarCodReo_To) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int2[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV43TFBarCodPar_Sel)==0) && ( ! (GXutil.strcmp("", AV42TFBarCodPar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV43TFBarCodPar_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int2[40] = (byte)(1) ;
      }
      if ( ! (0==AV44TFBarSit) )
      {
         addWhere(sWhereString, "(T3.BarSit >= ?)");
      }
      else
      {
         GXv_int2[41] = (byte)(1) ;
      }
      if ( ! (0==AV45TFBarSit_To) )
      {
         addWhere(sWhereString, "(T3.BarSit <= ?)");
      }
      else
      {
         GXv_int2[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV47TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV46TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV47TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSer = ?)");
      }
      else
      {
         GXv_int2[44] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV49TFBarSerDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV48TFBarSerDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49TFBarSerDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSerDsc = ?)");
      }
      else
      {
         GXv_int2[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV51TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV50TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarColNom = ?)");
      }
      else
      {
         GXv_int2[48] = (byte)(1) ;
      }
      if ( ! (0==AV52TFBarColNum) )
      {
         addWhere(sWhereString, "(T3.BarColNum >= ?)");
      }
      else
      {
         GXv_int2[49] = (byte)(1) ;
      }
      if ( ! (0==AV53TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T3.BarColNum <= ?)");
      }
      else
      {
         GXv_int2[50] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55TFBarNomCli_Sel)==0) && ( ! (GXutil.strcmp("", AV54TFBarNomCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[51] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55TFBarNomCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarNomCli = ?)");
      }
      else
      {
         GXv_int2[52] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV56TFBarKgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T6.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int2[53] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV57TFBarKgm_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T6.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int2[54] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV58TFBarMtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T6.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int2[55] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV59TFBarMtr_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T6.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int2[56] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T4.CliNom" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09ZG11( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           byte A760ProFasEst ,
                                           GXSimpleCollection<Byte> AV73TFProFasEst_Sels ,
                                           int AV34TFCliCod ,
                                           int AV35TFCliCod_To ,
                                           String AV37TFCliNom_Sel ,
                                           String AV36TFCliNom ,
                                           int AV38TFBarCod ,
                                           int AV39TFBarCod_To ,
                                           byte AV40TFBarCodReo ,
                                           byte AV41TFBarCodReo_To ,
                                           String AV43TFBarCodPar_Sel ,
                                           String AV42TFBarCodPar ,
                                           byte AV44TFBarSit ,
                                           byte AV45TFBarSit_To ,
                                           String AV47TFBarSer_Sel ,
                                           String AV46TFBarSer ,
                                           String AV49TFBarSerDsc_Sel ,
                                           String AV48TFBarSerDsc ,
                                           String AV51TFBarColNom_Sel ,
                                           String AV50TFBarColNom ,
                                           int AV52TFBarColNum ,
                                           int AV53TFBarColNum_To ,
                                           String AV55TFBarNomCli_Sel ,
                                           String AV54TFBarNomCli ,
                                           java.math.BigDecimal AV56TFBarKgm ,
                                           java.math.BigDecimal AV57TFBarKgm_To ,
                                           java.math.BigDecimal AV58TFBarMtr ,
                                           java.math.BigDecimal AV59TFBarMtr_To ,
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
                                           String A1234BarNomCli ,
                                           java.math.BigDecimal A166BarKgm ,
                                           java.math.BigDecimal A184BarMtr ,
                                           String AV62FilterFullText ,
                                           String A151BarFasCod ,
                                           int AV73TFProFasEst_Sels_size ,
                                           String AV61TFBarFasCod_Sel ,
                                           String AV60TFBarFasCod ,
                                           int AV64CliCod ,
                                           int AV65CliCod_to ,
                                           java.util.Date A159BarFecGen ,
                                           java.util.Date AV66BarFecGen ,
                                           java.util.Date AV67BarFecGen_to ,
                                           byte AV68BarSit ,
                                           byte AV69BarSit_to ,
                                           String A14284ProEst ,
                                           String A396EmprCod ,
                                           String AV71EmprCod ,
                                           String A758ProCod ,
                                           String AV63ProCod ,
                                           byte AV70ProFasEst )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[57];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ProCod, T1.BarCodPar, T2.ProEst, T3.BarFecGen, T3.BarNomCli, T3.BarColNum, T3.BarColNom, T3.BarSerDsc, T3.BarSer, T3.BarSit, T1.BarCodReo," ;
      scmdbuf += " T1.BarCod, T4.CliNom, T3.CliCod, COALESCE( T7.ProFasEst, 0) AS ProFasEst, COALESCE( T5.BarFasCod, ' ') AS BarFasCod, COALESCE( T6.BarMtr, 0) AS BarMtr, COALESCE(" ;
      scmdbuf += " T6.BarKgm, 0) AS BarKgm FROM ((((((TXPBARPRO T1 INNER JOIN TXPPROCES T2 ON T2.EmprCod = T1.EmprCod AND T2.ProCod = T1.ProCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod" ;
      scmdbuf += " = T3.CliCod) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasCod, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM (TXPBARFAS T8 INNER JOIN (SELECT MAX(BarOrdLin)" ;
      scmdbuf += " AS GXC1, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod" ;
      scmdbuf += " AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) WHERE (T8.BarOrdLin = T9.GXC1) AND (T8.BarFasEst <> 0) GROUP BY T8.EmprCod," ;
      scmdbuf += " T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod = T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar)" ;
      scmdbuf += " LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo," ;
      scmdbuf += " BarCodPar ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(BarFasEst)" ;
      scmdbuf += " AS ProFasEst, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod ) T7 ON T7.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T7.BarCod = T1.BarCod AND T7.BarCodReo = T1.BarCodReo AND T7.BarCodPar = T1.BarCodPar AND T7.ProCod = T1.ProCod)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( SUBSTR(TO_CHAR(COALESCE( T7.ProFasEst, 0),'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T3.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T4.CliNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2) like '%' || ?) or ( UPPER(T1.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T3.BarSit,'90'), 2) like '%' || ?) or ( UPPER(T3.BarSer) like '%' || UPPER(?)) or ( UPPER(T3.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T3.BarColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T3.BarColNum,'999990'), 2) like '%' || ?) or ( UPPER(T3.BarNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T6.BarKgm, 0),'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T6.BarMtr, 0),'999990.99'), 2) like '%' || ?) or ( UPPER(COALESCE( T5.BarFasCod, ' ')) like '%' || UPPER(?))))");
      addWhere(sWhereString, "(? <= 0 or ( "+GXutil.toValueList("oracle7", AV73TFProFasEst_Sels, "COALESCE( T7.ProFasEst, 0) IN (", ")")+"))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T5.BarFasCod, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T5.BarFasCod, ' ') = ?))");
      addWhere(sWhereString, "(T3.CliCod >= ?)");
      addWhere(sWhereString, "(T3.CliCod <= ?)");
      addWhere(sWhereString, "(T3.BarFecGen >= ?)");
      addWhere(sWhereString, "(T3.BarFecGen <= ?)");
      addWhere(sWhereString, "(T3.BarSit >= ?)");
      addWhere(sWhereString, "(T3.BarSit <= ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.ProCod = ?)");
      addWhere(sWhereString, "(COALESCE( T7.ProFasEst, 0) = ?)");
      if ( ! (0==AV34TFCliCod) )
      {
         addWhere(sWhereString, "(T3.CliCod >= ?)");
      }
      else
      {
         GXv_int5[31] = (byte)(1) ;
      }
      if ( ! (0==AV35TFCliCod_To) )
      {
         addWhere(sWhereString, "(T3.CliCod <= ?)");
      }
      else
      {
         GXv_int5[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV37TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV36TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV37TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int5[34] = (byte)(1) ;
      }
      if ( ! (0==AV38TFBarCod) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int5[35] = (byte)(1) ;
      }
      if ( ! (0==AV39TFBarCod_To) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int5[36] = (byte)(1) ;
      }
      if ( ! (0==AV40TFBarCodReo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int5[37] = (byte)(1) ;
      }
      if ( ! (0==AV41TFBarCodReo_To) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int5[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV43TFBarCodPar_Sel)==0) && ( ! (GXutil.strcmp("", AV42TFBarCodPar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV43TFBarCodPar_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int5[40] = (byte)(1) ;
      }
      if ( ! (0==AV44TFBarSit) )
      {
         addWhere(sWhereString, "(T3.BarSit >= ?)");
      }
      else
      {
         GXv_int5[41] = (byte)(1) ;
      }
      if ( ! (0==AV45TFBarSit_To) )
      {
         addWhere(sWhereString, "(T3.BarSit <= ?)");
      }
      else
      {
         GXv_int5[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV47TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV46TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV47TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSer = ?)");
      }
      else
      {
         GXv_int5[44] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV49TFBarSerDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV48TFBarSerDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49TFBarSerDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSerDsc = ?)");
      }
      else
      {
         GXv_int5[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV51TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV50TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarColNom = ?)");
      }
      else
      {
         GXv_int5[48] = (byte)(1) ;
      }
      if ( ! (0==AV52TFBarColNum) )
      {
         addWhere(sWhereString, "(T3.BarColNum >= ?)");
      }
      else
      {
         GXv_int5[49] = (byte)(1) ;
      }
      if ( ! (0==AV53TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T3.BarColNum <= ?)");
      }
      else
      {
         GXv_int5[50] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55TFBarNomCli_Sel)==0) && ( ! (GXutil.strcmp("", AV54TFBarNomCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[51] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55TFBarNomCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarNomCli = ?)");
      }
      else
      {
         GXv_int5[52] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV56TFBarKgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T6.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int5[53] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV57TFBarKgm_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T6.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int5[54] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV58TFBarMtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T6.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int5[55] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV59TFBarMtr_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T6.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int5[56] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.BarCodPar" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   protected Object[] conditional_P09ZG16( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           byte A760ProFasEst ,
                                           GXSimpleCollection<Byte> AV73TFProFasEst_Sels ,
                                           int AV34TFCliCod ,
                                           int AV35TFCliCod_To ,
                                           String AV37TFCliNom_Sel ,
                                           String AV36TFCliNom ,
                                           int AV38TFBarCod ,
                                           int AV39TFBarCod_To ,
                                           byte AV40TFBarCodReo ,
                                           byte AV41TFBarCodReo_To ,
                                           String AV43TFBarCodPar_Sel ,
                                           String AV42TFBarCodPar ,
                                           byte AV44TFBarSit ,
                                           byte AV45TFBarSit_To ,
                                           String AV47TFBarSer_Sel ,
                                           String AV46TFBarSer ,
                                           String AV49TFBarSerDsc_Sel ,
                                           String AV48TFBarSerDsc ,
                                           String AV51TFBarColNom_Sel ,
                                           String AV50TFBarColNom ,
                                           int AV52TFBarColNum ,
                                           int AV53TFBarColNum_To ,
                                           String AV55TFBarNomCli_Sel ,
                                           String AV54TFBarNomCli ,
                                           java.math.BigDecimal AV56TFBarKgm ,
                                           java.math.BigDecimal AV57TFBarKgm_To ,
                                           java.math.BigDecimal AV58TFBarMtr ,
                                           java.math.BigDecimal AV59TFBarMtr_To ,
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
                                           String A1234BarNomCli ,
                                           java.math.BigDecimal A166BarKgm ,
                                           java.math.BigDecimal A184BarMtr ,
                                           String AV62FilterFullText ,
                                           String A151BarFasCod ,
                                           int AV73TFProFasEst_Sels_size ,
                                           String AV61TFBarFasCod_Sel ,
                                           String AV60TFBarFasCod ,
                                           int AV64CliCod ,
                                           int AV65CliCod_to ,
                                           java.util.Date A159BarFecGen ,
                                           java.util.Date AV66BarFecGen ,
                                           java.util.Date AV67BarFecGen_to ,
                                           byte AV68BarSit ,
                                           byte AV69BarSit_to ,
                                           String A14284ProEst ,
                                           String A396EmprCod ,
                                           String AV71EmprCod ,
                                           String A758ProCod ,
                                           String AV63ProCod ,
                                           byte AV70ProFasEst )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[57];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ProCod, T3.BarSer, T2.ProEst, T3.BarFecGen, T3.BarNomCli, T3.BarColNum, T3.BarColNom, T3.BarSerDsc, T3.BarSit, T1.BarCodPar, T1.BarCodReo," ;
      scmdbuf += " T1.BarCod, T4.CliNom, T3.CliCod, COALESCE( T7.ProFasEst, 0) AS ProFasEst, COALESCE( T5.BarFasCod, ' ') AS BarFasCod, COALESCE( T6.BarMtr, 0) AS BarMtr, COALESCE(" ;
      scmdbuf += " T6.BarKgm, 0) AS BarKgm FROM ((((((TXPBARPRO T1 INNER JOIN TXPPROCES T2 ON T2.EmprCod = T1.EmprCod AND T2.ProCod = T1.ProCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod" ;
      scmdbuf += " = T3.CliCod) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasCod, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM (TXPBARFAS T8 INNER JOIN (SELECT MAX(BarOrdLin)" ;
      scmdbuf += " AS GXC1, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod" ;
      scmdbuf += " AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) WHERE (T8.BarOrdLin = T9.GXC1) AND (T8.BarFasEst <> 0) GROUP BY T8.EmprCod," ;
      scmdbuf += " T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod = T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar)" ;
      scmdbuf += " LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo," ;
      scmdbuf += " BarCodPar ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(BarFasEst)" ;
      scmdbuf += " AS ProFasEst, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod ) T7 ON T7.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T7.BarCod = T1.BarCod AND T7.BarCodReo = T1.BarCodReo AND T7.BarCodPar = T1.BarCodPar AND T7.ProCod = T1.ProCod)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( SUBSTR(TO_CHAR(COALESCE( T7.ProFasEst, 0),'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T3.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T4.CliNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2) like '%' || ?) or ( UPPER(T1.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T3.BarSit,'90'), 2) like '%' || ?) or ( UPPER(T3.BarSer) like '%' || UPPER(?)) or ( UPPER(T3.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T3.BarColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T3.BarColNum,'999990'), 2) like '%' || ?) or ( UPPER(T3.BarNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T6.BarKgm, 0),'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T6.BarMtr, 0),'999990.99'), 2) like '%' || ?) or ( UPPER(COALESCE( T5.BarFasCod, ' ')) like '%' || UPPER(?))))");
      addWhere(sWhereString, "(? <= 0 or ( "+GXutil.toValueList("oracle7", AV73TFProFasEst_Sels, "COALESCE( T7.ProFasEst, 0) IN (", ")")+"))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T5.BarFasCod, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T5.BarFasCod, ' ') = ?))");
      addWhere(sWhereString, "(T3.CliCod >= ?)");
      addWhere(sWhereString, "(T3.CliCod <= ?)");
      addWhere(sWhereString, "(T3.BarFecGen >= ?)");
      addWhere(sWhereString, "(T3.BarFecGen <= ?)");
      addWhere(sWhereString, "(T3.BarSit >= ?)");
      addWhere(sWhereString, "(T3.BarSit <= ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.ProCod = ?)");
      addWhere(sWhereString, "(COALESCE( T7.ProFasEst, 0) = ?)");
      if ( ! (0==AV34TFCliCod) )
      {
         addWhere(sWhereString, "(T3.CliCod >= ?)");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( ! (0==AV35TFCliCod_To) )
      {
         addWhere(sWhereString, "(T3.CliCod <= ?)");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV37TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV36TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV37TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int8[34] = (byte)(1) ;
      }
      if ( ! (0==AV38TFBarCod) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int8[35] = (byte)(1) ;
      }
      if ( ! (0==AV39TFBarCod_To) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int8[36] = (byte)(1) ;
      }
      if ( ! (0==AV40TFBarCodReo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int8[37] = (byte)(1) ;
      }
      if ( ! (0==AV41TFBarCodReo_To) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int8[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV43TFBarCodPar_Sel)==0) && ( ! (GXutil.strcmp("", AV42TFBarCodPar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV43TFBarCodPar_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int8[40] = (byte)(1) ;
      }
      if ( ! (0==AV44TFBarSit) )
      {
         addWhere(sWhereString, "(T3.BarSit >= ?)");
      }
      else
      {
         GXv_int8[41] = (byte)(1) ;
      }
      if ( ! (0==AV45TFBarSit_To) )
      {
         addWhere(sWhereString, "(T3.BarSit <= ?)");
      }
      else
      {
         GXv_int8[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV47TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV46TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV47TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSer = ?)");
      }
      else
      {
         GXv_int8[44] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV49TFBarSerDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV48TFBarSerDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49TFBarSerDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSerDsc = ?)");
      }
      else
      {
         GXv_int8[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV51TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV50TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarColNom = ?)");
      }
      else
      {
         GXv_int8[48] = (byte)(1) ;
      }
      if ( ! (0==AV52TFBarColNum) )
      {
         addWhere(sWhereString, "(T3.BarColNum >= ?)");
      }
      else
      {
         GXv_int8[49] = (byte)(1) ;
      }
      if ( ! (0==AV53TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T3.BarColNum <= ?)");
      }
      else
      {
         GXv_int8[50] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55TFBarNomCli_Sel)==0) && ( ! (GXutil.strcmp("", AV54TFBarNomCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[51] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55TFBarNomCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarNomCli = ?)");
      }
      else
      {
         GXv_int8[52] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV56TFBarKgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T6.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int8[53] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV57TFBarKgm_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T6.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int8[54] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV58TFBarMtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T6.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int8[55] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV59TFBarMtr_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T6.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int8[56] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T3.BarSer" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P09ZG21( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           byte A760ProFasEst ,
                                           GXSimpleCollection<Byte> AV73TFProFasEst_Sels ,
                                           int AV34TFCliCod ,
                                           int AV35TFCliCod_To ,
                                           String AV37TFCliNom_Sel ,
                                           String AV36TFCliNom ,
                                           int AV38TFBarCod ,
                                           int AV39TFBarCod_To ,
                                           byte AV40TFBarCodReo ,
                                           byte AV41TFBarCodReo_To ,
                                           String AV43TFBarCodPar_Sel ,
                                           String AV42TFBarCodPar ,
                                           byte AV44TFBarSit ,
                                           byte AV45TFBarSit_To ,
                                           String AV47TFBarSer_Sel ,
                                           String AV46TFBarSer ,
                                           String AV49TFBarSerDsc_Sel ,
                                           String AV48TFBarSerDsc ,
                                           String AV51TFBarColNom_Sel ,
                                           String AV50TFBarColNom ,
                                           int AV52TFBarColNum ,
                                           int AV53TFBarColNum_To ,
                                           String AV55TFBarNomCli_Sel ,
                                           String AV54TFBarNomCli ,
                                           java.math.BigDecimal AV56TFBarKgm ,
                                           java.math.BigDecimal AV57TFBarKgm_To ,
                                           java.math.BigDecimal AV58TFBarMtr ,
                                           java.math.BigDecimal AV59TFBarMtr_To ,
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
                                           String A1234BarNomCli ,
                                           java.math.BigDecimal A166BarKgm ,
                                           java.math.BigDecimal A184BarMtr ,
                                           String AV62FilterFullText ,
                                           String A151BarFasCod ,
                                           int AV73TFProFasEst_Sels_size ,
                                           String AV61TFBarFasCod_Sel ,
                                           String AV60TFBarFasCod ,
                                           int AV64CliCod ,
                                           int AV65CliCod_to ,
                                           java.util.Date A159BarFecGen ,
                                           java.util.Date AV66BarFecGen ,
                                           java.util.Date AV67BarFecGen_to ,
                                           byte AV68BarSit ,
                                           byte AV69BarSit_to ,
                                           String A14284ProEst ,
                                           String A396EmprCod ,
                                           String AV71EmprCod ,
                                           String A758ProCod ,
                                           String AV63ProCod ,
                                           byte AV70ProFasEst )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int11 = new byte[57];
      Object[] GXv_Object12 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ProCod, T3.BarSerDsc, T2.ProEst, T3.BarFecGen, T3.BarNomCli, T3.BarColNum, T3.BarColNom, T3.BarSer, T3.BarSit, T1.BarCodPar, T1.BarCodReo," ;
      scmdbuf += " T1.BarCod, T4.CliNom, T3.CliCod, COALESCE( T7.ProFasEst, 0) AS ProFasEst, COALESCE( T5.BarFasCod, ' ') AS BarFasCod, COALESCE( T6.BarMtr, 0) AS BarMtr, COALESCE(" ;
      scmdbuf += " T6.BarKgm, 0) AS BarKgm FROM ((((((TXPBARPRO T1 INNER JOIN TXPPROCES T2 ON T2.EmprCod = T1.EmprCod AND T2.ProCod = T1.ProCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod" ;
      scmdbuf += " = T3.CliCod) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasCod, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM (TXPBARFAS T8 INNER JOIN (SELECT MAX(BarOrdLin)" ;
      scmdbuf += " AS GXC1, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod" ;
      scmdbuf += " AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) WHERE (T8.BarOrdLin = T9.GXC1) AND (T8.BarFasEst <> 0) GROUP BY T8.EmprCod," ;
      scmdbuf += " T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod = T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar)" ;
      scmdbuf += " LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo," ;
      scmdbuf += " BarCodPar ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(BarFasEst)" ;
      scmdbuf += " AS ProFasEst, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod ) T7 ON T7.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T7.BarCod = T1.BarCod AND T7.BarCodReo = T1.BarCodReo AND T7.BarCodPar = T1.BarCodPar AND T7.ProCod = T1.ProCod)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( SUBSTR(TO_CHAR(COALESCE( T7.ProFasEst, 0),'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T3.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T4.CliNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2) like '%' || ?) or ( UPPER(T1.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T3.BarSit,'90'), 2) like '%' || ?) or ( UPPER(T3.BarSer) like '%' || UPPER(?)) or ( UPPER(T3.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T3.BarColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T3.BarColNum,'999990'), 2) like '%' || ?) or ( UPPER(T3.BarNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T6.BarKgm, 0),'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T6.BarMtr, 0),'999990.99'), 2) like '%' || ?) or ( UPPER(COALESCE( T5.BarFasCod, ' ')) like '%' || UPPER(?))))");
      addWhere(sWhereString, "(? <= 0 or ( "+GXutil.toValueList("oracle7", AV73TFProFasEst_Sels, "COALESCE( T7.ProFasEst, 0) IN (", ")")+"))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T5.BarFasCod, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T5.BarFasCod, ' ') = ?))");
      addWhere(sWhereString, "(T3.CliCod >= ?)");
      addWhere(sWhereString, "(T3.CliCod <= ?)");
      addWhere(sWhereString, "(T3.BarFecGen >= ?)");
      addWhere(sWhereString, "(T3.BarFecGen <= ?)");
      addWhere(sWhereString, "(T3.BarSit >= ?)");
      addWhere(sWhereString, "(T3.BarSit <= ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.ProCod = ?)");
      addWhere(sWhereString, "(COALESCE( T7.ProFasEst, 0) = ?)");
      if ( ! (0==AV34TFCliCod) )
      {
         addWhere(sWhereString, "(T3.CliCod >= ?)");
      }
      else
      {
         GXv_int11[31] = (byte)(1) ;
      }
      if ( ! (0==AV35TFCliCod_To) )
      {
         addWhere(sWhereString, "(T3.CliCod <= ?)");
      }
      else
      {
         GXv_int11[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV37TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV36TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV37TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int11[34] = (byte)(1) ;
      }
      if ( ! (0==AV38TFBarCod) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int11[35] = (byte)(1) ;
      }
      if ( ! (0==AV39TFBarCod_To) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int11[36] = (byte)(1) ;
      }
      if ( ! (0==AV40TFBarCodReo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int11[37] = (byte)(1) ;
      }
      if ( ! (0==AV41TFBarCodReo_To) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int11[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV43TFBarCodPar_Sel)==0) && ( ! (GXutil.strcmp("", AV42TFBarCodPar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV43TFBarCodPar_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int11[40] = (byte)(1) ;
      }
      if ( ! (0==AV44TFBarSit) )
      {
         addWhere(sWhereString, "(T3.BarSit >= ?)");
      }
      else
      {
         GXv_int11[41] = (byte)(1) ;
      }
      if ( ! (0==AV45TFBarSit_To) )
      {
         addWhere(sWhereString, "(T3.BarSit <= ?)");
      }
      else
      {
         GXv_int11[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV47TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV46TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV47TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSer = ?)");
      }
      else
      {
         GXv_int11[44] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV49TFBarSerDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV48TFBarSerDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49TFBarSerDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSerDsc = ?)");
      }
      else
      {
         GXv_int11[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV51TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV50TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarColNom = ?)");
      }
      else
      {
         GXv_int11[48] = (byte)(1) ;
      }
      if ( ! (0==AV52TFBarColNum) )
      {
         addWhere(sWhereString, "(T3.BarColNum >= ?)");
      }
      else
      {
         GXv_int11[49] = (byte)(1) ;
      }
      if ( ! (0==AV53TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T3.BarColNum <= ?)");
      }
      else
      {
         GXv_int11[50] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55TFBarNomCli_Sel)==0) && ( ! (GXutil.strcmp("", AV54TFBarNomCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[51] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55TFBarNomCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarNomCli = ?)");
      }
      else
      {
         GXv_int11[52] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV56TFBarKgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T6.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int11[53] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV57TFBarKgm_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T6.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int11[54] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV58TFBarMtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T6.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int11[55] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV59TFBarMtr_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T6.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int11[56] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T3.BarSerDsc" ;
      GXv_Object12[0] = scmdbuf ;
      GXv_Object12[1] = GXv_int11 ;
      return GXv_Object12 ;
   }

   protected Object[] conditional_P09ZG26( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           byte A760ProFasEst ,
                                           GXSimpleCollection<Byte> AV73TFProFasEst_Sels ,
                                           int AV34TFCliCod ,
                                           int AV35TFCliCod_To ,
                                           String AV37TFCliNom_Sel ,
                                           String AV36TFCliNom ,
                                           int AV38TFBarCod ,
                                           int AV39TFBarCod_To ,
                                           byte AV40TFBarCodReo ,
                                           byte AV41TFBarCodReo_To ,
                                           String AV43TFBarCodPar_Sel ,
                                           String AV42TFBarCodPar ,
                                           byte AV44TFBarSit ,
                                           byte AV45TFBarSit_To ,
                                           String AV47TFBarSer_Sel ,
                                           String AV46TFBarSer ,
                                           String AV49TFBarSerDsc_Sel ,
                                           String AV48TFBarSerDsc ,
                                           String AV51TFBarColNom_Sel ,
                                           String AV50TFBarColNom ,
                                           int AV52TFBarColNum ,
                                           int AV53TFBarColNum_To ,
                                           String AV55TFBarNomCli_Sel ,
                                           String AV54TFBarNomCli ,
                                           java.math.BigDecimal AV56TFBarKgm ,
                                           java.math.BigDecimal AV57TFBarKgm_To ,
                                           java.math.BigDecimal AV58TFBarMtr ,
                                           java.math.BigDecimal AV59TFBarMtr_To ,
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
                                           String A1234BarNomCli ,
                                           java.math.BigDecimal A166BarKgm ,
                                           java.math.BigDecimal A184BarMtr ,
                                           String AV62FilterFullText ,
                                           String A151BarFasCod ,
                                           int AV73TFProFasEst_Sels_size ,
                                           String AV61TFBarFasCod_Sel ,
                                           String AV60TFBarFasCod ,
                                           int AV64CliCod ,
                                           int AV65CliCod_to ,
                                           java.util.Date A159BarFecGen ,
                                           java.util.Date AV66BarFecGen ,
                                           java.util.Date AV67BarFecGen_to ,
                                           byte AV68BarSit ,
                                           byte AV69BarSit_to ,
                                           String A14284ProEst ,
                                           String A396EmprCod ,
                                           String AV71EmprCod ,
                                           String A758ProCod ,
                                           String AV63ProCod ,
                                           byte AV70ProFasEst )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[57];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ProCod, T3.BarColNom, T2.ProEst, T3.BarFecGen, T3.BarNomCli, T3.BarColNum, T3.BarSerDsc, T3.BarSer, T3.BarSit, T1.BarCodPar, T1.BarCodReo," ;
      scmdbuf += " T1.BarCod, T4.CliNom, T3.CliCod, COALESCE( T7.ProFasEst, 0) AS ProFasEst, COALESCE( T5.BarFasCod, ' ') AS BarFasCod, COALESCE( T6.BarMtr, 0) AS BarMtr, COALESCE(" ;
      scmdbuf += " T6.BarKgm, 0) AS BarKgm FROM ((((((TXPBARPRO T1 INNER JOIN TXPPROCES T2 ON T2.EmprCod = T1.EmprCod AND T2.ProCod = T1.ProCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod" ;
      scmdbuf += " = T3.CliCod) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasCod, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM (TXPBARFAS T8 INNER JOIN (SELECT MAX(BarOrdLin)" ;
      scmdbuf += " AS GXC1, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod" ;
      scmdbuf += " AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) WHERE (T8.BarOrdLin = T9.GXC1) AND (T8.BarFasEst <> 0) GROUP BY T8.EmprCod," ;
      scmdbuf += " T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod = T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar)" ;
      scmdbuf += " LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo," ;
      scmdbuf += " BarCodPar ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(BarFasEst)" ;
      scmdbuf += " AS ProFasEst, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod ) T7 ON T7.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T7.BarCod = T1.BarCod AND T7.BarCodReo = T1.BarCodReo AND T7.BarCodPar = T1.BarCodPar AND T7.ProCod = T1.ProCod)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( SUBSTR(TO_CHAR(COALESCE( T7.ProFasEst, 0),'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T3.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T4.CliNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2) like '%' || ?) or ( UPPER(T1.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T3.BarSit,'90'), 2) like '%' || ?) or ( UPPER(T3.BarSer) like '%' || UPPER(?)) or ( UPPER(T3.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T3.BarColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T3.BarColNum,'999990'), 2) like '%' || ?) or ( UPPER(T3.BarNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T6.BarKgm, 0),'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T6.BarMtr, 0),'999990.99'), 2) like '%' || ?) or ( UPPER(COALESCE( T5.BarFasCod, ' ')) like '%' || UPPER(?))))");
      addWhere(sWhereString, "(? <= 0 or ( "+GXutil.toValueList("oracle7", AV73TFProFasEst_Sels, "COALESCE( T7.ProFasEst, 0) IN (", ")")+"))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T5.BarFasCod, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T5.BarFasCod, ' ') = ?))");
      addWhere(sWhereString, "(T3.CliCod >= ?)");
      addWhere(sWhereString, "(T3.CliCod <= ?)");
      addWhere(sWhereString, "(T3.BarFecGen >= ?)");
      addWhere(sWhereString, "(T3.BarFecGen <= ?)");
      addWhere(sWhereString, "(T3.BarSit >= ?)");
      addWhere(sWhereString, "(T3.BarSit <= ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.ProCod = ?)");
      addWhere(sWhereString, "(COALESCE( T7.ProFasEst, 0) = ?)");
      if ( ! (0==AV34TFCliCod) )
      {
         addWhere(sWhereString, "(T3.CliCod >= ?)");
      }
      else
      {
         GXv_int14[31] = (byte)(1) ;
      }
      if ( ! (0==AV35TFCliCod_To) )
      {
         addWhere(sWhereString, "(T3.CliCod <= ?)");
      }
      else
      {
         GXv_int14[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV37TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV36TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV37TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int14[34] = (byte)(1) ;
      }
      if ( ! (0==AV38TFBarCod) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int14[35] = (byte)(1) ;
      }
      if ( ! (0==AV39TFBarCod_To) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int14[36] = (byte)(1) ;
      }
      if ( ! (0==AV40TFBarCodReo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int14[37] = (byte)(1) ;
      }
      if ( ! (0==AV41TFBarCodReo_To) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int14[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV43TFBarCodPar_Sel)==0) && ( ! (GXutil.strcmp("", AV42TFBarCodPar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV43TFBarCodPar_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int14[40] = (byte)(1) ;
      }
      if ( ! (0==AV44TFBarSit) )
      {
         addWhere(sWhereString, "(T3.BarSit >= ?)");
      }
      else
      {
         GXv_int14[41] = (byte)(1) ;
      }
      if ( ! (0==AV45TFBarSit_To) )
      {
         addWhere(sWhereString, "(T3.BarSit <= ?)");
      }
      else
      {
         GXv_int14[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV47TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV46TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV47TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSer = ?)");
      }
      else
      {
         GXv_int14[44] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV49TFBarSerDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV48TFBarSerDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49TFBarSerDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSerDsc = ?)");
      }
      else
      {
         GXv_int14[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV51TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV50TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarColNom = ?)");
      }
      else
      {
         GXv_int14[48] = (byte)(1) ;
      }
      if ( ! (0==AV52TFBarColNum) )
      {
         addWhere(sWhereString, "(T3.BarColNum >= ?)");
      }
      else
      {
         GXv_int14[49] = (byte)(1) ;
      }
      if ( ! (0==AV53TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T3.BarColNum <= ?)");
      }
      else
      {
         GXv_int14[50] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55TFBarNomCli_Sel)==0) && ( ! (GXutil.strcmp("", AV54TFBarNomCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[51] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55TFBarNomCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarNomCli = ?)");
      }
      else
      {
         GXv_int14[52] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV56TFBarKgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T6.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int14[53] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV57TFBarKgm_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T6.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int14[54] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV58TFBarMtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T6.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int14[55] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV59TFBarMtr_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T6.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int14[56] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T3.BarColNom" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
   }

   protected Object[] conditional_P09ZG31( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           byte A760ProFasEst ,
                                           GXSimpleCollection<Byte> AV73TFProFasEst_Sels ,
                                           int AV34TFCliCod ,
                                           int AV35TFCliCod_To ,
                                           String AV37TFCliNom_Sel ,
                                           String AV36TFCliNom ,
                                           int AV38TFBarCod ,
                                           int AV39TFBarCod_To ,
                                           byte AV40TFBarCodReo ,
                                           byte AV41TFBarCodReo_To ,
                                           String AV43TFBarCodPar_Sel ,
                                           String AV42TFBarCodPar ,
                                           byte AV44TFBarSit ,
                                           byte AV45TFBarSit_To ,
                                           String AV47TFBarSer_Sel ,
                                           String AV46TFBarSer ,
                                           String AV49TFBarSerDsc_Sel ,
                                           String AV48TFBarSerDsc ,
                                           String AV51TFBarColNom_Sel ,
                                           String AV50TFBarColNom ,
                                           int AV52TFBarColNum ,
                                           int AV53TFBarColNum_To ,
                                           String AV55TFBarNomCli_Sel ,
                                           String AV54TFBarNomCli ,
                                           java.math.BigDecimal AV56TFBarKgm ,
                                           java.math.BigDecimal AV57TFBarKgm_To ,
                                           java.math.BigDecimal AV58TFBarMtr ,
                                           java.math.BigDecimal AV59TFBarMtr_To ,
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
                                           String A1234BarNomCli ,
                                           java.math.BigDecimal A166BarKgm ,
                                           java.math.BigDecimal A184BarMtr ,
                                           String AV62FilterFullText ,
                                           String A151BarFasCod ,
                                           int AV73TFProFasEst_Sels_size ,
                                           String AV61TFBarFasCod_Sel ,
                                           String AV60TFBarFasCod ,
                                           int AV64CliCod ,
                                           int AV65CliCod_to ,
                                           java.util.Date A159BarFecGen ,
                                           java.util.Date AV66BarFecGen ,
                                           java.util.Date AV67BarFecGen_to ,
                                           byte AV68BarSit ,
                                           byte AV69BarSit_to ,
                                           String A14284ProEst ,
                                           String A396EmprCod ,
                                           String AV71EmprCod ,
                                           String A758ProCod ,
                                           String AV63ProCod ,
                                           byte AV70ProFasEst )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int17 = new byte[57];
      Object[] GXv_Object18 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ProCod, T3.BarNomCli, T2.ProEst, T3.BarFecGen, T3.BarColNum, T3.BarColNom, T3.BarSerDsc, T3.BarSer, T3.BarSit, T1.BarCodPar, T1.BarCodReo," ;
      scmdbuf += " T1.BarCod, T4.CliNom, T3.CliCod, COALESCE( T7.ProFasEst, 0) AS ProFasEst, COALESCE( T5.BarFasCod, ' ') AS BarFasCod, COALESCE( T6.BarMtr, 0) AS BarMtr, COALESCE(" ;
      scmdbuf += " T6.BarKgm, 0) AS BarKgm FROM ((((((TXPBARPRO T1 INNER JOIN TXPPROCES T2 ON T2.EmprCod = T1.EmprCod AND T2.ProCod = T1.ProCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod" ;
      scmdbuf += " = T3.CliCod) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasCod, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM (TXPBARFAS T8 INNER JOIN (SELECT MAX(BarOrdLin)" ;
      scmdbuf += " AS GXC1, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod" ;
      scmdbuf += " AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) WHERE (T8.BarOrdLin = T9.GXC1) AND (T8.BarFasEst <> 0) GROUP BY T8.EmprCod," ;
      scmdbuf += " T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod = T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar)" ;
      scmdbuf += " LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo," ;
      scmdbuf += " BarCodPar ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(BarFasEst)" ;
      scmdbuf += " AS ProFasEst, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod ) T7 ON T7.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T7.BarCod = T1.BarCod AND T7.BarCodReo = T1.BarCodReo AND T7.BarCodPar = T1.BarCodPar AND T7.ProCod = T1.ProCod)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( SUBSTR(TO_CHAR(COALESCE( T7.ProFasEst, 0),'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T3.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T4.CliNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2) like '%' || ?) or ( UPPER(T1.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T3.BarSit,'90'), 2) like '%' || ?) or ( UPPER(T3.BarSer) like '%' || UPPER(?)) or ( UPPER(T3.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T3.BarColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T3.BarColNum,'999990'), 2) like '%' || ?) or ( UPPER(T3.BarNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T6.BarKgm, 0),'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T6.BarMtr, 0),'999990.99'), 2) like '%' || ?) or ( UPPER(COALESCE( T5.BarFasCod, ' ')) like '%' || UPPER(?))))");
      addWhere(sWhereString, "(? <= 0 or ( "+GXutil.toValueList("oracle7", AV73TFProFasEst_Sels, "COALESCE( T7.ProFasEst, 0) IN (", ")")+"))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T5.BarFasCod, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T5.BarFasCod, ' ') = ?))");
      addWhere(sWhereString, "(T3.CliCod >= ?)");
      addWhere(sWhereString, "(T3.CliCod <= ?)");
      addWhere(sWhereString, "(T3.BarFecGen >= ?)");
      addWhere(sWhereString, "(T3.BarFecGen <= ?)");
      addWhere(sWhereString, "(T3.BarSit >= ?)");
      addWhere(sWhereString, "(T3.BarSit <= ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.ProCod = ?)");
      addWhere(sWhereString, "(COALESCE( T7.ProFasEst, 0) = ?)");
      if ( ! (0==AV34TFCliCod) )
      {
         addWhere(sWhereString, "(T3.CliCod >= ?)");
      }
      else
      {
         GXv_int17[31] = (byte)(1) ;
      }
      if ( ! (0==AV35TFCliCod_To) )
      {
         addWhere(sWhereString, "(T3.CliCod <= ?)");
      }
      else
      {
         GXv_int17[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV37TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV36TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV37TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int17[34] = (byte)(1) ;
      }
      if ( ! (0==AV38TFBarCod) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int17[35] = (byte)(1) ;
      }
      if ( ! (0==AV39TFBarCod_To) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int17[36] = (byte)(1) ;
      }
      if ( ! (0==AV40TFBarCodReo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int17[37] = (byte)(1) ;
      }
      if ( ! (0==AV41TFBarCodReo_To) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int17[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV43TFBarCodPar_Sel)==0) && ( ! (GXutil.strcmp("", AV42TFBarCodPar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV43TFBarCodPar_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int17[40] = (byte)(1) ;
      }
      if ( ! (0==AV44TFBarSit) )
      {
         addWhere(sWhereString, "(T3.BarSit >= ?)");
      }
      else
      {
         GXv_int17[41] = (byte)(1) ;
      }
      if ( ! (0==AV45TFBarSit_To) )
      {
         addWhere(sWhereString, "(T3.BarSit <= ?)");
      }
      else
      {
         GXv_int17[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV47TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV46TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV47TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSer = ?)");
      }
      else
      {
         GXv_int17[44] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV49TFBarSerDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV48TFBarSerDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49TFBarSerDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSerDsc = ?)");
      }
      else
      {
         GXv_int17[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV51TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV50TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarColNom = ?)");
      }
      else
      {
         GXv_int17[48] = (byte)(1) ;
      }
      if ( ! (0==AV52TFBarColNum) )
      {
         addWhere(sWhereString, "(T3.BarColNum >= ?)");
      }
      else
      {
         GXv_int17[49] = (byte)(1) ;
      }
      if ( ! (0==AV53TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T3.BarColNum <= ?)");
      }
      else
      {
         GXv_int17[50] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55TFBarNomCli_Sel)==0) && ( ! (GXutil.strcmp("", AV54TFBarNomCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[51] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55TFBarNomCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarNomCli = ?)");
      }
      else
      {
         GXv_int17[52] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV56TFBarKgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T6.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int17[53] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV57TFBarKgm_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T6.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int17[54] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV58TFBarMtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T6.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int17[55] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV59TFBarMtr_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T6.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int17[56] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T3.BarNomCli" ;
      GXv_Object18[0] = scmdbuf ;
      GXv_Object18[1] = GXv_int17 ;
      return GXv_Object18 ;
   }

   protected Object[] conditional_P09ZG36( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           byte A760ProFasEst ,
                                           GXSimpleCollection<Byte> AV73TFProFasEst_Sels ,
                                           int AV34TFCliCod ,
                                           int AV35TFCliCod_To ,
                                           String AV37TFCliNom_Sel ,
                                           String AV36TFCliNom ,
                                           int AV38TFBarCod ,
                                           int AV39TFBarCod_To ,
                                           byte AV40TFBarCodReo ,
                                           byte AV41TFBarCodReo_To ,
                                           String AV43TFBarCodPar_Sel ,
                                           String AV42TFBarCodPar ,
                                           byte AV44TFBarSit ,
                                           byte AV45TFBarSit_To ,
                                           String AV47TFBarSer_Sel ,
                                           String AV46TFBarSer ,
                                           String AV49TFBarSerDsc_Sel ,
                                           String AV48TFBarSerDsc ,
                                           String AV51TFBarColNom_Sel ,
                                           String AV50TFBarColNom ,
                                           int AV52TFBarColNum ,
                                           int AV53TFBarColNum_To ,
                                           String AV55TFBarNomCli_Sel ,
                                           String AV54TFBarNomCli ,
                                           java.math.BigDecimal AV56TFBarKgm ,
                                           java.math.BigDecimal AV57TFBarKgm_To ,
                                           java.math.BigDecimal AV58TFBarMtr ,
                                           java.math.BigDecimal AV59TFBarMtr_To ,
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
                                           String A1234BarNomCli ,
                                           java.math.BigDecimal A166BarKgm ,
                                           java.math.BigDecimal A184BarMtr ,
                                           String AV62FilterFullText ,
                                           String A151BarFasCod ,
                                           int AV73TFProFasEst_Sels_size ,
                                           String AV61TFBarFasCod_Sel ,
                                           String AV60TFBarFasCod ,
                                           int AV64CliCod ,
                                           int AV65CliCod_to ,
                                           java.util.Date A159BarFecGen ,
                                           java.util.Date AV66BarFecGen ,
                                           java.util.Date AV67BarFecGen_to ,
                                           byte AV68BarSit ,
                                           byte AV69BarSit_to ,
                                           String A14284ProEst ,
                                           byte AV70ProFasEst ,
                                           String AV71EmprCod ,
                                           String AV63ProCod ,
                                           String A396EmprCod ,
                                           String A758ProCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int20 = new byte[57];
      Object[] GXv_Object21 = new Object[2];
      scmdbuf = "SELECT T2.ProEst, T3.BarFecGen, T1.ProCod, T1.EmprCod, T3.BarNomCli, T3.BarColNum, T3.BarColNom, T3.BarSerDsc, T3.BarSer, T3.BarSit, T1.BarCodPar, T1.BarCodReo," ;
      scmdbuf += " T1.BarCod, T4.CliNom, T3.CliCod, COALESCE( T5.BarFasCod, ' ') AS BarFasCod, COALESCE( T6.BarMtr, 0) AS BarMtr, COALESCE( T6.BarKgm, 0) AS BarKgm, COALESCE( T7.ProFasEst," ;
      scmdbuf += " 0) AS ProFasEst FROM ((((((TXPBARPRO T1 INNER JOIN TXPPROCES T2 ON T2.EmprCod = T1.EmprCod AND T2.ProCod = T1.ProCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T3.CliCod)" ;
      scmdbuf += " LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasCod, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM (TXPBARFAS T8 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC1, EmprCod," ;
      scmdbuf += " BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod =" ;
      scmdbuf += " T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) WHERE (T8.BarOrdLin = T9.GXC1) AND (T8.BarFasEst <> 0) GROUP BY T8.EmprCod, T8.BarCod," ;
      scmdbuf += " T8.BarCodReo, T8.BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod = T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar) LEFT JOIN" ;
      scmdbuf += " (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      scmdbuf += " ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(BarFasEst) AS ProFasEst," ;
      scmdbuf += " EmprCod, BarCod, BarCodReo, BarCodPar, ProCod FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod ) T7 ON T7.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T7.BarCod = T1.BarCod AND T7.BarCodReo = T1.BarCodReo AND T7.BarCodPar = T1.BarCodPar AND T7.ProCod = T1.ProCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.ProCod = ?)");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( SUBSTR(TO_CHAR(COALESCE( T7.ProFasEst, 0),'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T3.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T4.CliNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2) like '%' || ?) or ( UPPER(T1.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T3.BarSit,'90'), 2) like '%' || ?) or ( UPPER(T3.BarSer) like '%' || UPPER(?)) or ( UPPER(T3.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T3.BarColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T3.BarColNum,'999990'), 2) like '%' || ?) or ( UPPER(T3.BarNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T6.BarKgm, 0),'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T6.BarMtr, 0),'999990.99'), 2) like '%' || ?) or ( UPPER(COALESCE( T5.BarFasCod, ' ')) like '%' || UPPER(?))))");
      addWhere(sWhereString, "(? <= 0 or ( "+GXutil.toValueList("oracle7", AV73TFProFasEst_Sels, "COALESCE( T7.ProFasEst, 0) IN (", ")")+"))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T5.BarFasCod, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T5.BarFasCod, ' ') = ?))");
      addWhere(sWhereString, "(T3.CliCod >= ?)");
      addWhere(sWhereString, "(T3.CliCod <= ?)");
      addWhere(sWhereString, "(T3.BarFecGen >= ?)");
      addWhere(sWhereString, "(T3.BarFecGen <= ?)");
      addWhere(sWhereString, "(T3.BarSit >= ?)");
      addWhere(sWhereString, "(T3.BarSit <= ?)");
      addWhere(sWhereString, "(COALESCE( T7.ProFasEst, 0) = ?)");
      if ( ! (0==AV34TFCliCod) )
      {
         addWhere(sWhereString, "(T3.CliCod >= ?)");
      }
      else
      {
         GXv_int20[31] = (byte)(1) ;
      }
      if ( ! (0==AV35TFCliCod_To) )
      {
         addWhere(sWhereString, "(T3.CliCod <= ?)");
      }
      else
      {
         GXv_int20[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV37TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV36TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV37TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int20[34] = (byte)(1) ;
      }
      if ( ! (0==AV38TFBarCod) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int20[35] = (byte)(1) ;
      }
      if ( ! (0==AV39TFBarCod_To) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int20[36] = (byte)(1) ;
      }
      if ( ! (0==AV40TFBarCodReo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int20[37] = (byte)(1) ;
      }
      if ( ! (0==AV41TFBarCodReo_To) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int20[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV43TFBarCodPar_Sel)==0) && ( ! (GXutil.strcmp("", AV42TFBarCodPar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV43TFBarCodPar_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int20[40] = (byte)(1) ;
      }
      if ( ! (0==AV44TFBarSit) )
      {
         addWhere(sWhereString, "(T3.BarSit >= ?)");
      }
      else
      {
         GXv_int20[41] = (byte)(1) ;
      }
      if ( ! (0==AV45TFBarSit_To) )
      {
         addWhere(sWhereString, "(T3.BarSit <= ?)");
      }
      else
      {
         GXv_int20[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV47TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV46TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV47TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSer = ?)");
      }
      else
      {
         GXv_int20[44] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV49TFBarSerDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV48TFBarSerDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49TFBarSerDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSerDsc = ?)");
      }
      else
      {
         GXv_int20[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV51TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV50TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarColNom = ?)");
      }
      else
      {
         GXv_int20[48] = (byte)(1) ;
      }
      if ( ! (0==AV52TFBarColNum) )
      {
         addWhere(sWhereString, "(T3.BarColNum >= ?)");
      }
      else
      {
         GXv_int20[49] = (byte)(1) ;
      }
      if ( ! (0==AV53TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T3.BarColNum <= ?)");
      }
      else
      {
         GXv_int20[50] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55TFBarNomCli_Sel)==0) && ( ! (GXutil.strcmp("", AV54TFBarNomCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[51] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55TFBarNomCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarNomCli = ?)");
      }
      else
      {
         GXv_int20[52] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV56TFBarKgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T6.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int20[53] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV57TFBarKgm_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T6.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int20[54] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV58TFBarMtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T6.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int20[55] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV59TFBarMtr_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T6.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int20[56] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.ProCod" ;
      GXv_Object21[0] = scmdbuf ;
      GXv_Object21[1] = GXv_int20 ;
      return GXv_Object21 ;
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
                  return conditional_P09ZG6(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).byteValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).byteValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , (String)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).intValue() , (java.util.Date)dynConstraints[48] , (java.util.Date)dynConstraints[49] , (java.util.Date)dynConstraints[50] , ((Number) dynConstraints[51]).byteValue() , ((Number) dynConstraints[52]).byteValue() , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] , ((Number) dynConstraints[58]).byteValue() );
            case 1 :
                  return conditional_P09ZG11(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).byteValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).byteValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , (String)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).intValue() , (java.util.Date)dynConstraints[48] , (java.util.Date)dynConstraints[49] , (java.util.Date)dynConstraints[50] , ((Number) dynConstraints[51]).byteValue() , ((Number) dynConstraints[52]).byteValue() , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] , ((Number) dynConstraints[58]).byteValue() );
            case 2 :
                  return conditional_P09ZG16(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).byteValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).byteValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , (String)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).intValue() , (java.util.Date)dynConstraints[48] , (java.util.Date)dynConstraints[49] , (java.util.Date)dynConstraints[50] , ((Number) dynConstraints[51]).byteValue() , ((Number) dynConstraints[52]).byteValue() , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] , ((Number) dynConstraints[58]).byteValue() );
            case 3 :
                  return conditional_P09ZG21(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).byteValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).byteValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , (String)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).intValue() , (java.util.Date)dynConstraints[48] , (java.util.Date)dynConstraints[49] , (java.util.Date)dynConstraints[50] , ((Number) dynConstraints[51]).byteValue() , ((Number) dynConstraints[52]).byteValue() , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] , ((Number) dynConstraints[58]).byteValue() );
            case 4 :
                  return conditional_P09ZG26(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).byteValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).byteValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , (String)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).intValue() , (java.util.Date)dynConstraints[48] , (java.util.Date)dynConstraints[49] , (java.util.Date)dynConstraints[50] , ((Number) dynConstraints[51]).byteValue() , ((Number) dynConstraints[52]).byteValue() , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] , ((Number) dynConstraints[58]).byteValue() );
            case 5 :
                  return conditional_P09ZG31(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).byteValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).byteValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , (String)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).intValue() , (java.util.Date)dynConstraints[48] , (java.util.Date)dynConstraints[49] , (java.util.Date)dynConstraints[50] , ((Number) dynConstraints[51]).byteValue() , ((Number) dynConstraints[52]).byteValue() , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] , ((Number) dynConstraints[58]).byteValue() );
            case 6 :
                  return conditional_P09ZG36(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).byteValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).byteValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , (String)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).intValue() , (java.util.Date)dynConstraints[48] , (java.util.Date)dynConstraints[49] , (java.util.Date)dynConstraints[50] , ((Number) dynConstraints[51]).byteValue() , ((Number) dynConstraints[52]).byteValue() , (String)dynConstraints[53] , ((Number) dynConstraints[54]).byteValue() , (String)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] , (String)dynConstraints[58] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09ZG6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09ZG11", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09ZG16", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09ZG21", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09ZG26", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09ZG31", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09ZG36", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((String[]) buf[8])[0] = rslt.getString(9, 26);
               ((String[]) buf[9])[0] = rslt.getString(10, 16);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 1);
               ((byte[]) buf[12])[0] = rslt.getByte(13);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((byte[]) buf[16])[0] = rslt.getByte(16);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(17, 8);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(18,2);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(19,2);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((String[]) buf[8])[0] = rslt.getString(9, 26);
               ((String[]) buf[9])[0] = rslt.getString(10, 16);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 30);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((byte[]) buf[16])[0] = rslt.getByte(16);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(17, 8);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(18,2);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(19,2);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((String[]) buf[8])[0] = rslt.getString(9, 26);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 30);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((byte[]) buf[16])[0] = rslt.getByte(16);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(17, 8);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(18,2);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(19,2);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((String[]) buf[8])[0] = rslt.getString(9, 16);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 30);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((byte[]) buf[16])[0] = rslt.getByte(16);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(17, 8);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(18,2);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(19,2);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               ((String[]) buf[8])[0] = rslt.getString(9, 16);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 30);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((byte[]) buf[16])[0] = rslt.getByte(16);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(17, 8);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(18,2);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(19,2);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               ((String[]) buf[8])[0] = rslt.getString(9, 16);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 30);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((byte[]) buf[16])[0] = rslt.getByte(16);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(17, 8);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(18,2);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(19,2);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               ((String[]) buf[8])[0] = rslt.getString(9, 16);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 30);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(16, 8);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(17,2);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(18,2);
               ((byte[]) buf[20])[0] = rslt.getByte(19);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
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
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[66], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[67], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[68], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[69], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[72], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 8);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 8);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 8);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 8);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 8);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[79]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[80]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[81]);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[82]);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[83]).byteValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[84]).byteValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 3);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 8);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[87]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[88]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[89]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 30);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 30);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[92]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[93]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[94]).byteValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[95]).byteValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 1);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 1);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[98]).byteValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[99]).byteValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 16);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 16);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[102], 26);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 26);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[104], 13);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[105], 13);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[106]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[107]).intValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[108], 13);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[109], 13);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[110], 2);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[111], 2);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[112], 2);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[113], 2);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[66], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[67], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[68], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[69], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[72], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 8);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 8);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 8);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 8);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 8);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[79]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[80]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[81]);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[82]);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[83]).byteValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[84]).byteValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 3);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 8);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[87]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[88]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[89]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 30);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 30);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[92]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[93]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[94]).byteValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[95]).byteValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 1);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 1);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[98]).byteValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[99]).byteValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 16);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 16);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[102], 26);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 26);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[104], 13);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[105], 13);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[106]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[107]).intValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[108], 13);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[109], 13);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[110], 2);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[111], 2);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[112], 2);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[113], 2);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[66], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[67], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[68], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[69], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[72], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 8);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 8);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 8);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 8);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 8);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[79]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[80]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[81]);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[82]);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[83]).byteValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[84]).byteValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 3);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 8);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[87]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[88]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[89]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 30);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 30);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[92]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[93]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[94]).byteValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[95]).byteValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 1);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 1);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[98]).byteValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[99]).byteValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 16);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 16);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[102], 26);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 26);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[104], 13);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[105], 13);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[106]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[107]).intValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[108], 13);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[109], 13);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[110], 2);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[111], 2);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[112], 2);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[113], 2);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[66], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[67], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[68], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[69], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[72], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 8);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 8);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 8);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 8);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 8);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[79]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[80]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[81]);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[82]);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[83]).byteValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[84]).byteValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 3);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 8);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[87]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[88]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[89]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 30);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 30);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[92]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[93]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[94]).byteValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[95]).byteValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 1);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 1);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[98]).byteValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[99]).byteValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 16);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 16);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[102], 26);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 26);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[104], 13);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[105], 13);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[106]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[107]).intValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[108], 13);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[109], 13);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[110], 2);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[111], 2);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[112], 2);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[113], 2);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[66], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[67], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[68], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[69], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[72], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 8);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 8);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 8);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 8);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 8);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[79]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[80]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[81]);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[82]);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[83]).byteValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[84]).byteValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 3);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 8);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[87]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[88]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[89]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 30);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 30);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[92]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[93]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[94]).byteValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[95]).byteValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 1);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 1);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[98]).byteValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[99]).byteValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 16);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 16);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[102], 26);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 26);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[104], 13);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[105], 13);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[106]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[107]).intValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[108], 13);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[109], 13);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[110], 2);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[111], 2);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[112], 2);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[113], 2);
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[66], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[67], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[68], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[69], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[72], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 8);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 8);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 8);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 8);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 8);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[79]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[80]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[81]);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[82]);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[83]).byteValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[84]).byteValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 3);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 8);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[87]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[88]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[89]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 30);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 30);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[92]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[93]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[94]).byteValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[95]).byteValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 1);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 1);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[98]).byteValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[99]).byteValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 16);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 16);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[102], 26);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 26);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[104], 13);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[105], 13);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[106]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[107]).intValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[108], 13);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[109], 13);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[110], 2);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[111], 2);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[112], 2);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[113], 2);
               }
               return;
            case 6 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[66], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[67], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[68], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[69], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[72], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[73], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[75]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 8);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 8);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 8);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 8);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 8);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[81]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[82]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[83]);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[84]);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[85]).byteValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[86]).byteValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[87]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[88]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[89]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 30);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 30);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[92]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[93]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[94]).byteValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[95]).byteValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 1);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 1);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[98]).byteValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[99]).byteValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 16);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 16);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[102], 26);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 26);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[104], 13);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[105], 13);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[106]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[107]).intValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[108], 13);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[109], 13);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[110], 2);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[111], 2);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[112], 2);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[113], 2);
               }
               return;
      }
   }

}

