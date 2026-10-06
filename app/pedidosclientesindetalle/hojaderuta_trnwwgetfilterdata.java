package app.pedidosclientesindetalle ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class hojaderuta_trnwwgetfilterdata extends GXProcedure
{
   public hojaderuta_trnwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( hojaderuta_trnwwgetfilterdata.class ), "" );
   }

   public hojaderuta_trnwwgetfilterdata( int remoteHandle ,
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
      hojaderuta_trnwwgetfilterdata.this.aP5 = new String[] {""};
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
      hojaderuta_trnwwgetfilterdata.this.AV16DDOName = aP0;
      hojaderuta_trnwwgetfilterdata.this.AV14SearchTxt = aP1;
      hojaderuta_trnwwgetfilterdata.this.AV15SearchTxtTo = aP2;
      hojaderuta_trnwwgetfilterdata.this.aP3 = aP3;
      hojaderuta_trnwwgetfilterdata.this.aP4 = aP4;
      hojaderuta_trnwwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV19Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV22OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV24OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_CLINOM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_PEDIDOCLIENTE") == 0 )
      {
         /* Execute user subroutine: 'LOADPEDIDOCLIENTEOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_BARTIPDIS") == 0 )
      {
         /* Execute user subroutine: 'LOADBARTIPDISOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_BARSER") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_BARSERDSC") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_BARCOLNOM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_BARNOMCLI") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_BARMAQCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADBARMAQCODOPTIONS' */
         S191 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_BARACAQUI") == 0 )
      {
         /* Execute user subroutine: 'LOADBARACAQUIOPTIONS' */
         S201 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_BARAGREST") == 0 )
      {
         /* Execute user subroutine: 'LOADBARAGRESTOPTIONS' */
         S211 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV20OptionsJson = AV19Options.toJSonString(false) ;
      AV23OptionsDescJson = AV22OptionsDesc.toJSonString(false) ;
      AV25OptionIndexesJson = AV24OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV27Session.getValue("PedidosClienteSinDetalle.HojadeRuta_TRNWWGridState"), "") == 0 )
      {
         AV29GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "PedidosClienteSinDetalle.HojadeRuta_TRNWWGridState"), null, null);
      }
      else
      {
         AV29GridState.fromxml(AV27Session.getValue("PedidosClienteSinDetalle.HojadeRuta_TRNWWGridState"), null, null);
      }
      AV91GXV1 = 1 ;
      while ( AV91GXV1 <= AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV30GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV91GXV1));
         if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV32FilterFullText = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV39TFCliCod = (int)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV40TFCliCod_To = (int)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV41TFCliNom = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV42TFCliNom_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDIDOCLIENTE") == 0 )
         {
            AV35TFPedidoCliente = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDIDOCLIENTE_SEL") == 0 )
         {
            AV36TFPedidoCliente_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPDIS") == 0 )
         {
            AV59TFBarTipDis = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPDIS_SEL") == 0 )
         {
            AV60TFBarTipDis_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV43TFBarSer = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV44TFBarSer_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV45TFBarSerDsc = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV46TFBarSerDsc_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV47TFBarColNom = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV48TFBarColNom_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUM") == 0 )
         {
            AV49TFBarColNum = (int)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV50TFBarColNum_To = (int)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI") == 0 )
         {
            AV61TFBarNomCli = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI_SEL") == 0 )
         {
            AV62TFBarNomCli_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNUMCLI") == 0 )
         {
            AV63TFBarNumCli = (int)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV64TFBarNumCli_To = (int)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMAQCOD") == 0 )
         {
            AV65TFBarMaqCod = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMAQCOD_SEL") == 0 )
         {
            AV66TFBarMaqCod_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIE") == 0 )
         {
            AV67TFBarPie = (int)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV68TFBarPie_To = (int)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARKGM") == 0 )
         {
            AV69TFBarKgm = CommonUtil.decimalVal( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV70TFBarKgm_To = CommonUtil.decimalVal( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMTR") == 0 )
         {
            AV71TFBarMtr = CommonUtil.decimalVal( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV72TFBarMtr_To = CommonUtil.decimalVal( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARACAQUI") == 0 )
         {
            AV73TFBarAcaQui = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARACAQUI_SEL") == 0 )
         {
            AV74TFBarAcaQui_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGREST") == 0 )
         {
            AV77TFBarAgrEst = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGREST_SEL") == 0 )
         {
            AV78TFBarAgrEst_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARHAYALB_SEL") == 0 )
         {
            AV88TFBarHayAlb_Sel = (byte)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV91GXV1 = (int)(AV91GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV41TFCliNom = AV14SearchTxt ;
      AV42TFCliNom_Sel = "" ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV39TFCliCod) ,
                                           Integer.valueOf(AV40TFCliCod_To) ,
                                           AV42TFCliNom_Sel ,
                                           AV41TFCliNom ,
                                           AV60TFBarTipDis_Sel ,
                                           AV59TFBarTipDis ,
                                           AV44TFBarSer_Sel ,
                                           AV43TFBarSer ,
                                           AV46TFBarSerDsc_Sel ,
                                           AV45TFBarSerDsc ,
                                           AV48TFBarColNom_Sel ,
                                           AV47TFBarColNom ,
                                           Integer.valueOf(AV49TFBarColNum) ,
                                           Integer.valueOf(AV50TFBarColNum_To) ,
                                           AV62TFBarNomCli_Sel ,
                                           AV61TFBarNomCli ,
                                           Integer.valueOf(AV63TFBarNumCli) ,
                                           Integer.valueOf(AV64TFBarNumCli_To) ,
                                           AV66TFBarMaqCod_Sel ,
                                           AV65TFBarMaqCod ,
                                           AV69TFBarKgm ,
                                           AV70TFBarKgm_To ,
                                           AV71TFBarMtr ,
                                           AV72TFBarMtr_To ,
                                           AV74TFBarAcaQui_Sel ,
                                           AV73TFBarAcaQui ,
                                           AV78TFBarAgrEst_Sel ,
                                           AV77TFBarAgrEst ,
                                           AV82BarFecGenfrom ,
                                           AV83BarFecGento ,
                                           Byte.valueOf(AV84BarSitfrom) ,
                                           Byte.valueOf(AV85BarSitto) ,
                                           Integer.valueOf(AV79BarCodIN) ,
                                           Byte.valueOf(AV80BarCodreoIN) ,
                                           AV81BarCodparIN ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A2010BarTipDis ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           Integer.valueOf(A1235BarNumCli) ,
                                           A180BarMaqCod ,
                                           A166BarKgm ,
                                           A184BarMtr ,
                                           A118BarAcaQui ,
                                           A120BarAgrEst ,
                                           A159BarFecGen ,
                                           Byte.valueOf(A213BarSit) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           AV32FilterFullText ,
                                           A13878PedidoClie ,
                                           A13696BarNHdr ,
                                           Integer.valueOf(A198BarPie) ,
                                           AV36TFPedidoCliente_Sel ,
                                           AV35TFPedidoCliente ,
                                           Integer.valueOf(AV67TFBarPie) ,
                                           Integer.valueOf(AV68TFBarPie_To) ,
                                           Byte.valueOf(AV88TFBarHayAlb_Sel) ,
                                           Byte.valueOf(A14502BarHayAlb) } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE
                                           }
      });
      lV41TFCliNom = GXutil.padr( GXutil.rtrim( AV41TFCliNom), 30, "%") ;
      lV59TFBarTipDis = GXutil.padr( GXutil.rtrim( AV59TFBarTipDis), 1, "%") ;
      lV43TFBarSer = GXutil.padr( GXutil.rtrim( AV43TFBarSer), 16, "%") ;
      lV45TFBarSerDsc = GXutil.padr( GXutil.rtrim( AV45TFBarSerDsc), 26, "%") ;
      lV47TFBarColNom = GXutil.padr( GXutil.rtrim( AV47TFBarColNom), 13, "%") ;
      lV61TFBarNomCli = GXutil.padr( GXutil.rtrim( AV61TFBarNomCli), 13, "%") ;
      lV65TFBarMaqCod = GXutil.padr( GXutil.rtrim( AV65TFBarMaqCod), 6, "%") ;
      lV73TFBarAcaQui = GXutil.padr( GXutil.rtrim( AV73TFBarAcaQui), 6, "%") ;
      lV77TFBarAgrEst = GXutil.padr( GXutil.rtrim( AV77TFBarAgrEst), 1, "%") ;
      /* Using cursor P09KE3 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV39TFCliCod), Integer.valueOf(AV40TFCliCod_To), lV41TFCliNom, AV42TFCliNom_Sel, lV59TFBarTipDis, AV60TFBarTipDis_Sel, lV43TFBarSer, AV44TFBarSer_Sel, lV45TFBarSerDsc, AV46TFBarSerDsc_Sel, lV47TFBarColNom, AV48TFBarColNom_Sel, Integer.valueOf(AV49TFBarColNum), Integer.valueOf(AV50TFBarColNum_To), lV61TFBarNomCli, AV62TFBarNomCli_Sel, Integer.valueOf(AV63TFBarNumCli), Integer.valueOf(AV64TFBarNumCli_To), lV65TFBarMaqCod, AV66TFBarMaqCod_Sel, AV69TFBarKgm, AV70TFBarKgm_To, AV71TFBarMtr, AV72TFBarMtr_To, lV73TFBarAcaQui, AV74TFBarAcaQui_Sel, lV77TFBarAgrEst, AV78TFBarAgrEst_Sel, AV82BarFecGenfrom, AV83BarFecGento, Byte.valueOf(AV84BarSitfrom), Byte.valueOf(AV85BarSitto), Integer.valueOf(AV79BarCodIN), Byte.valueOf(AV80BarCodreoIN), AV81BarCodparIN});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9KE2 = false ;
         A279CliNom = P09KE3_A279CliNom[0] ;
         A159BarFecGen = P09KE3_A159BarFecGen[0] ;
         A120BarAgrEst = P09KE3_A120BarAgrEst[0] ;
         A118BarAcaQui = P09KE3_A118BarAcaQui[0] ;
         A180BarMaqCod = P09KE3_A180BarMaqCod[0] ;
         A213BarSit = P09KE3_A213BarSit[0] ;
         A1235BarNumCli = P09KE3_A1235BarNumCli[0] ;
         A1234BarNomCli = P09KE3_A1234BarNomCli[0] ;
         A136BarColNum = P09KE3_A136BarColNum[0] ;
         A135BarColNom = P09KE3_A135BarColNom[0] ;
         A1652BarSerDsc = P09KE3_A1652BarSerDsc[0] ;
         A212BarSer = P09KE3_A212BarSer[0] ;
         A2010BarTipDis = P09KE3_A2010BarTipDis[0] ;
         A13696BarNHdr = P09KE3_A13696BarNHdr[0] ;
         A252CliCod = P09KE3_A252CliCod[0] ;
         n252CliCod = P09KE3_n252CliCod[0] ;
         A184BarMtr = P09KE3_A184BarMtr[0] ;
         A166BarKgm = P09KE3_A166BarKgm[0] ;
         A143BarDisNum = P09KE3_A143BarDisNum[0] ;
         A4812BarEncCli = P09KE3_A4812BarEncCli[0] ;
         A199BarPie1 = P09KE3_A199BarPie1[0] ;
         A365DisDes = P09KE3_A365DisDes[0] ;
         A898BarPieNDes = P09KE3_A898BarPieNDes[0] ;
         A130BarCodPar = P09KE3_A130BarCodPar[0] ;
         A132BarCodReo = P09KE3_A132BarCodReo[0] ;
         A129BarCod = P09KE3_A129BarCod[0] ;
         A396EmprCod = P09KE3_A396EmprCod[0] ;
         A279CliNom = P09KE3_A279CliNom[0] ;
         A184BarMtr = P09KE3_A184BarMtr[0] ;
         A166BarKgm = P09KE3_A166BarKgm[0] ;
         A199BarPie1 = P09KE3_A199BarPie1[0] ;
         A898BarPieNDes = P09KE3_A898BarPieNDes[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char3[0] = A396EmprCod ;
         GXv_char4[0] = A4812BarEncCli ;
         GXv_char5[0] = A143BarDisNum ;
         GXv_char6[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char3, GXv_char4, GXv_char5, GXv_char6) ;
         hojaderuta_trnwwgetfilterdata.this.A396EmprCod = GXv_char3[0] ;
         hojaderuta_trnwwgetfilterdata.this.A4812BarEncCli = GXv_char4[0] ;
         hojaderuta_trnwwgetfilterdata.this.A143BarDisNum = GXv_char5[0] ;
         hojaderuta_trnwwgetfilterdata.this.GXt_char2 = GXv_char6[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV36TFPedidoCliente_Sel)==0) && ( ! (GXutil.strcmp("", AV35TFPedidoCliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV35TFPedidoCliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV36TFPedidoCliente_Sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV36TFPedidoCliente_Sel) == 0 ) ) )
            {
               GXt_int7 = A14502BarHayAlb ;
               GXv_int8[0] = GXt_int7 ;
               new app.hayalbaransalida(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int8) ;
               hojaderuta_trnwwgetfilterdata.this.GXt_int7 = GXv_int8[0] ;
               A14502BarHayAlb = GXt_int7 ;
               if ( ( AV88TFBarHayAlb_Sel != 1 ) || ( ( A14502BarHayAlb == 1 ) ) )
               {
                  if ( ( AV88TFBarHayAlb_Sel != 2 ) || ( ( A14502BarHayAlb == 0 ) ) )
                  {
                     if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
                     {
                        A198BarPie = A898BarPieNDes ;
                     }
                     else
                     {
                        A198BarPie = A199BarPie1 ;
                     }
                     if ( (GXutil.strcmp("", AV32FilterFullText)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV32FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A2010BarTipDis) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV32FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1234BarNomCli) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1235BarNumCli, 6, 0) , GXutil.padr( "%" + AV32FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV32FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A180BarMaqCod) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A198BarPie, 6, 0) , GXutil.padr( "%" + AV32FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A166BarKgm, 9, 2) , GXutil.padr( "%" + AV32FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A184BarMtr, 9, 2) , GXutil.padr( "%" + AV32FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A118BarAcaQui) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A120BarAgrEst) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) ) )
                     {
                        if ( (0==AV67TFBarPie) || ( ( A198BarPie >= AV67TFBarPie ) ) )
                        {
                           if ( (0==AV68TFBarPie_To) || ( ( A198BarPie <= AV68TFBarPie_To ) ) )
                           {
                              AV26count = 0 ;
                              while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09KE3_A279CliNom[0], A279CliNom) == 0 ) )
                              {
                                 brk9KE2 = false ;
                                 A252CliCod = P09KE3_A252CliCod[0] ;
                                 n252CliCod = P09KE3_n252CliCod[0] ;
                                 A130BarCodPar = P09KE3_A130BarCodPar[0] ;
                                 A132BarCodReo = P09KE3_A132BarCodReo[0] ;
                                 A129BarCod = P09KE3_A129BarCod[0] ;
                                 A396EmprCod = P09KE3_A396EmprCod[0] ;
                                 AV26count = (long)(AV26count+1) ;
                                 brk9KE2 = true ;
                                 pr_default.readNext(0);
                              }
                              if ( ! (GXutil.strcmp("", A279CliNom)==0) )
                              {
                                 AV18Option = A279CliNom ;
                                 AV19Options.add(AV18Option, 0);
                                 AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                              }
                              if ( AV19Options.size() == 50 )
                              {
                                 /* Exit For each command. Update data (if necessary), close cursors & exit. */
                                 if (true) break;
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
         if ( ! brk9KE2 )
         {
            brk9KE2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPEDIDOCLIENTEOPTIONS' Routine */
      returnInSub = false ;
      AV35TFPedidoCliente = AV14SearchTxt ;
      AV36TFPedidoCliente_Sel = "" ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Integer.valueOf(AV39TFCliCod) ,
                                           Integer.valueOf(AV40TFCliCod_To) ,
                                           AV42TFCliNom_Sel ,
                                           AV41TFCliNom ,
                                           AV60TFBarTipDis_Sel ,
                                           AV59TFBarTipDis ,
                                           AV44TFBarSer_Sel ,
                                           AV43TFBarSer ,
                                           AV46TFBarSerDsc_Sel ,
                                           AV45TFBarSerDsc ,
                                           AV48TFBarColNom_Sel ,
                                           AV47TFBarColNom ,
                                           Integer.valueOf(AV49TFBarColNum) ,
                                           Integer.valueOf(AV50TFBarColNum_To) ,
                                           AV62TFBarNomCli_Sel ,
                                           AV61TFBarNomCli ,
                                           Integer.valueOf(AV63TFBarNumCli) ,
                                           Integer.valueOf(AV64TFBarNumCli_To) ,
                                           AV66TFBarMaqCod_Sel ,
                                           AV65TFBarMaqCod ,
                                           AV69TFBarKgm ,
                                           AV70TFBarKgm_To ,
                                           AV71TFBarMtr ,
                                           AV72TFBarMtr_To ,
                                           AV74TFBarAcaQui_Sel ,
                                           AV73TFBarAcaQui ,
                                           AV78TFBarAgrEst_Sel ,
                                           AV77TFBarAgrEst ,
                                           AV82BarFecGenfrom ,
                                           AV83BarFecGento ,
                                           Byte.valueOf(AV84BarSitfrom) ,
                                           Byte.valueOf(AV85BarSitto) ,
                                           Integer.valueOf(AV79BarCodIN) ,
                                           Byte.valueOf(AV80BarCodreoIN) ,
                                           AV81BarCodparIN ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A2010BarTipDis ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           Integer.valueOf(A1235BarNumCli) ,
                                           A180BarMaqCod ,
                                           A166BarKgm ,
                                           A184BarMtr ,
                                           A118BarAcaQui ,
                                           A120BarAgrEst ,
                                           A159BarFecGen ,
                                           Byte.valueOf(A213BarSit) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           AV32FilterFullText ,
                                           A13878PedidoClie ,
                                           A13696BarNHdr ,
                                           Integer.valueOf(A198BarPie) ,
                                           AV36TFPedidoCliente_Sel ,
                                           AV35TFPedidoCliente ,
                                           Integer.valueOf(AV67TFBarPie) ,
                                           Integer.valueOf(AV68TFBarPie_To) ,
                                           Byte.valueOf(AV88TFBarHayAlb_Sel) ,
                                           Byte.valueOf(A14502BarHayAlb) } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE
                                           }
      });
      lV41TFCliNom = GXutil.padr( GXutil.rtrim( AV41TFCliNom), 30, "%") ;
      lV59TFBarTipDis = GXutil.padr( GXutil.rtrim( AV59TFBarTipDis), 1, "%") ;
      lV43TFBarSer = GXutil.padr( GXutil.rtrim( AV43TFBarSer), 16, "%") ;
      lV45TFBarSerDsc = GXutil.padr( GXutil.rtrim( AV45TFBarSerDsc), 26, "%") ;
      lV47TFBarColNom = GXutil.padr( GXutil.rtrim( AV47TFBarColNom), 13, "%") ;
      lV61TFBarNomCli = GXutil.padr( GXutil.rtrim( AV61TFBarNomCli), 13, "%") ;
      lV65TFBarMaqCod = GXutil.padr( GXutil.rtrim( AV65TFBarMaqCod), 6, "%") ;
      lV73TFBarAcaQui = GXutil.padr( GXutil.rtrim( AV73TFBarAcaQui), 6, "%") ;
      lV77TFBarAgrEst = GXutil.padr( GXutil.rtrim( AV77TFBarAgrEst), 1, "%") ;
      /* Using cursor P09KE5 */
      pr_default.execute(1, new Object[] {Integer.valueOf(AV39TFCliCod), Integer.valueOf(AV40TFCliCod_To), lV41TFCliNom, AV42TFCliNom_Sel, lV59TFBarTipDis, AV60TFBarTipDis_Sel, lV43TFBarSer, AV44TFBarSer_Sel, lV45TFBarSerDsc, AV46TFBarSerDsc_Sel, lV47TFBarColNom, AV48TFBarColNom_Sel, Integer.valueOf(AV49TFBarColNum), Integer.valueOf(AV50TFBarColNum_To), lV61TFBarNomCli, AV62TFBarNomCli_Sel, Integer.valueOf(AV63TFBarNumCli), Integer.valueOf(AV64TFBarNumCli_To), lV65TFBarMaqCod, AV66TFBarMaqCod_Sel, AV69TFBarKgm, AV70TFBarKgm_To, AV71TFBarMtr, AV72TFBarMtr_To, lV73TFBarAcaQui, AV74TFBarAcaQui_Sel, lV77TFBarAgrEst, AV78TFBarAgrEst_Sel, AV82BarFecGenfrom, AV83BarFecGento, Byte.valueOf(AV84BarSitfrom), Byte.valueOf(AV85BarSitto), Integer.valueOf(AV79BarCodIN), Byte.valueOf(AV80BarCodreoIN), AV81BarCodparIN});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A159BarFecGen = P09KE5_A159BarFecGen[0] ;
         A120BarAgrEst = P09KE5_A120BarAgrEst[0] ;
         A118BarAcaQui = P09KE5_A118BarAcaQui[0] ;
         A180BarMaqCod = P09KE5_A180BarMaqCod[0] ;
         A213BarSit = P09KE5_A213BarSit[0] ;
         A1235BarNumCli = P09KE5_A1235BarNumCli[0] ;
         A1234BarNomCli = P09KE5_A1234BarNomCli[0] ;
         A136BarColNum = P09KE5_A136BarColNum[0] ;
         A135BarColNom = P09KE5_A135BarColNom[0] ;
         A1652BarSerDsc = P09KE5_A1652BarSerDsc[0] ;
         A212BarSer = P09KE5_A212BarSer[0] ;
         A2010BarTipDis = P09KE5_A2010BarTipDis[0] ;
         A13696BarNHdr = P09KE5_A13696BarNHdr[0] ;
         A279CliNom = P09KE5_A279CliNom[0] ;
         A252CliCod = P09KE5_A252CliCod[0] ;
         n252CliCod = P09KE5_n252CliCod[0] ;
         A184BarMtr = P09KE5_A184BarMtr[0] ;
         A166BarKgm = P09KE5_A166BarKgm[0] ;
         A143BarDisNum = P09KE5_A143BarDisNum[0] ;
         A4812BarEncCli = P09KE5_A4812BarEncCli[0] ;
         A199BarPie1 = P09KE5_A199BarPie1[0] ;
         A365DisDes = P09KE5_A365DisDes[0] ;
         A898BarPieNDes = P09KE5_A898BarPieNDes[0] ;
         A130BarCodPar = P09KE5_A130BarCodPar[0] ;
         A132BarCodReo = P09KE5_A132BarCodReo[0] ;
         A129BarCod = P09KE5_A129BarCod[0] ;
         A396EmprCod = P09KE5_A396EmprCod[0] ;
         A279CliNom = P09KE5_A279CliNom[0] ;
         A184BarMtr = P09KE5_A184BarMtr[0] ;
         A166BarKgm = P09KE5_A166BarKgm[0] ;
         A199BarPie1 = P09KE5_A199BarPie1[0] ;
         A898BarPieNDes = P09KE5_A898BarPieNDes[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_char3) ;
         hojaderuta_trnwwgetfilterdata.this.A396EmprCod = GXv_char6[0] ;
         hojaderuta_trnwwgetfilterdata.this.A4812BarEncCli = GXv_char5[0] ;
         hojaderuta_trnwwgetfilterdata.this.A143BarDisNum = GXv_char4[0] ;
         hojaderuta_trnwwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV36TFPedidoCliente_Sel)==0) && ( ! (GXutil.strcmp("", AV35TFPedidoCliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV35TFPedidoCliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV36TFPedidoCliente_Sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV36TFPedidoCliente_Sel) == 0 ) ) )
            {
               GXt_int7 = A14502BarHayAlb ;
               GXv_int8[0] = GXt_int7 ;
               new app.hayalbaransalida(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int8) ;
               hojaderuta_trnwwgetfilterdata.this.GXt_int7 = GXv_int8[0] ;
               A14502BarHayAlb = GXt_int7 ;
               if ( ( AV88TFBarHayAlb_Sel != 1 ) || ( ( A14502BarHayAlb == 1 ) ) )
               {
                  if ( ( AV88TFBarHayAlb_Sel != 2 ) || ( ( A14502BarHayAlb == 0 ) ) )
                  {
                     if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
                     {
                        A198BarPie = A898BarPieNDes ;
                     }
                     else
                     {
                        A198BarPie = A199BarPie1 ;
                     }
                     if ( (GXutil.strcmp("", AV32FilterFullText)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV32FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A2010BarTipDis) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV32FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1234BarNomCli) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1235BarNumCli, 6, 0) , GXutil.padr( "%" + AV32FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV32FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A180BarMaqCod) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A198BarPie, 6, 0) , GXutil.padr( "%" + AV32FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A166BarKgm, 9, 2) , GXutil.padr( "%" + AV32FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A184BarMtr, 9, 2) , GXutil.padr( "%" + AV32FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A118BarAcaQui) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A120BarAgrEst) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) ) )
                     {
                        if ( (0==AV67TFBarPie) || ( ( A198BarPie >= AV67TFBarPie ) ) )
                        {
                           if ( (0==AV68TFBarPie_To) || ( ( A198BarPie <= AV68TFBarPie_To ) ) )
                           {
                              if ( ! (GXutil.strcmp("", A13878PedidoClie)==0) )
                              {
                                 AV18Option = A13878PedidoClie ;
                                 AV17InsertIndex = 1 ;
                                 while ( ( AV17InsertIndex <= AV19Options.size() ) && ( GXutil.strcmp((String)AV19Options.elementAt(-1+AV17InsertIndex), AV18Option) < 0 ) )
                                 {
                                    AV17InsertIndex = (int)(AV17InsertIndex+1) ;
                                 }
                                 if ( ( AV17InsertIndex <= AV19Options.size() ) && ( GXutil.strcmp((String)AV19Options.elementAt(-1+AV17InsertIndex), AV18Option) == 0 ) )
                                 {
                                    AV26count = GXutil.lval( (String)AV24OptionIndexes.elementAt(-1+AV17InsertIndex)) ;
                                    AV26count = (long)(AV26count+1) ;
                                    AV24OptionIndexes.removeItem(AV17InsertIndex);
                                    AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), AV17InsertIndex);
                                 }
                                 else
                                 {
                                    AV19Options.add(AV18Option, AV17InsertIndex);
                                    AV24OptionIndexes.add("1", AV17InsertIndex);
                                 }
                              }
                              if ( AV19Options.size() == 50 )
                              {
                                 /* Exit For each command. Update data (if necessary), close cursors & exit. */
                                 if (true) break;
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADBARTIPDISOPTIONS' Routine */
      returnInSub = false ;
      AV59TFBarTipDis = AV14SearchTxt ;
      AV60TFBarTipDis_Sel = "" ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Integer.valueOf(AV39TFCliCod) ,
                                           Integer.valueOf(AV40TFCliCod_To) ,
                                           AV42TFCliNom_Sel ,
                                           AV41TFCliNom ,
                                           AV60TFBarTipDis_Sel ,
                                           AV59TFBarTipDis ,
                                           AV44TFBarSer_Sel ,
                                           AV43TFBarSer ,
                                           AV46TFBarSerDsc_Sel ,
                                           AV45TFBarSerDsc ,
                                           AV48TFBarColNom_Sel ,
                                           AV47TFBarColNom ,
                                           Integer.valueOf(AV49TFBarColNum) ,
                                           Integer.valueOf(AV50TFBarColNum_To) ,
                                           AV62TFBarNomCli_Sel ,
                                           AV61TFBarNomCli ,
                                           Integer.valueOf(AV63TFBarNumCli) ,
                                           Integer.valueOf(AV64TFBarNumCli_To) ,
                                           AV66TFBarMaqCod_Sel ,
                                           AV65TFBarMaqCod ,
                                           AV69TFBarKgm ,
                                           AV70TFBarKgm_To ,
                                           AV71TFBarMtr ,
                                           AV72TFBarMtr_To ,
                                           AV74TFBarAcaQui_Sel ,
                                           AV73TFBarAcaQui ,
                                           AV78TFBarAgrEst_Sel ,
                                           AV77TFBarAgrEst ,
                                           AV82BarFecGenfrom ,
                                           AV83BarFecGento ,
                                           Byte.valueOf(AV84BarSitfrom) ,
                                           Byte.valueOf(AV85BarSitto) ,
                                           Integer.valueOf(AV79BarCodIN) ,
                                           Byte.valueOf(AV80BarCodreoIN) ,
                                           AV81BarCodparIN ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A2010BarTipDis ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           Integer.valueOf(A1235BarNumCli) ,
                                           A180BarMaqCod ,
                                           A166BarKgm ,
                                           A184BarMtr ,
                                           A118BarAcaQui ,
                                           A120BarAgrEst ,
                                           A159BarFecGen ,
                                           Byte.valueOf(A213BarSit) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           AV32FilterFullText ,
                                           A13878PedidoClie ,
                                           A13696BarNHdr ,
                                           Integer.valueOf(A198BarPie) ,
                                           AV36TFPedidoCliente_Sel ,
                                           AV35TFPedidoCliente ,
                                           Integer.valueOf(AV67TFBarPie) ,
                                           Integer.valueOf(AV68TFBarPie_To) ,
                                           Byte.valueOf(AV88TFBarHayAlb_Sel) ,
                                           Byte.valueOf(A14502BarHayAlb) } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE
                                           }
      });
      lV41TFCliNom = GXutil.padr( GXutil.rtrim( AV41TFCliNom), 30, "%") ;
      lV59TFBarTipDis = GXutil.padr( GXutil.rtrim( AV59TFBarTipDis), 1, "%") ;
      lV43TFBarSer = GXutil.padr( GXutil.rtrim( AV43TFBarSer), 16, "%") ;
      lV45TFBarSerDsc = GXutil.padr( GXutil.rtrim( AV45TFBarSerDsc), 26, "%") ;
      lV47TFBarColNom = GXutil.padr( GXutil.rtrim( AV47TFBarColNom), 13, "%") ;
      lV61TFBarNomCli = GXutil.padr( GXutil.rtrim( AV61TFBarNomCli), 13, "%") ;
      lV65TFBarMaqCod = GXutil.padr( GXutil.rtrim( AV65TFBarMaqCod), 6, "%") ;
      lV73TFBarAcaQui = GXutil.padr( GXutil.rtrim( AV73TFBarAcaQui), 6, "%") ;
      lV77TFBarAgrEst = GXutil.padr( GXutil.rtrim( AV77TFBarAgrEst), 1, "%") ;
      /* Using cursor P09KE7 */
      pr_default.execute(2, new Object[] {Integer.valueOf(AV39TFCliCod), Integer.valueOf(AV40TFCliCod_To), lV41TFCliNom, AV42TFCliNom_Sel, lV59TFBarTipDis, AV60TFBarTipDis_Sel, lV43TFBarSer, AV44TFBarSer_Sel, lV45TFBarSerDsc, AV46TFBarSerDsc_Sel, lV47TFBarColNom, AV48TFBarColNom_Sel, Integer.valueOf(AV49TFBarColNum), Integer.valueOf(AV50TFBarColNum_To), lV61TFBarNomCli, AV62TFBarNomCli_Sel, Integer.valueOf(AV63TFBarNumCli), Integer.valueOf(AV64TFBarNumCli_To), lV65TFBarMaqCod, AV66TFBarMaqCod_Sel, AV69TFBarKgm, AV70TFBarKgm_To, AV71TFBarMtr, AV72TFBarMtr_To, lV73TFBarAcaQui, AV74TFBarAcaQui_Sel, lV77TFBarAgrEst, AV78TFBarAgrEst_Sel, AV82BarFecGenfrom, AV83BarFecGento, Byte.valueOf(AV84BarSitfrom), Byte.valueOf(AV85BarSitto), Integer.valueOf(AV79BarCodIN), Byte.valueOf(AV80BarCodreoIN), AV81BarCodparIN});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9KE5 = false ;
         A2010BarTipDis = P09KE7_A2010BarTipDis[0] ;
         A159BarFecGen = P09KE7_A159BarFecGen[0] ;
         A120BarAgrEst = P09KE7_A120BarAgrEst[0] ;
         A118BarAcaQui = P09KE7_A118BarAcaQui[0] ;
         A180BarMaqCod = P09KE7_A180BarMaqCod[0] ;
         A213BarSit = P09KE7_A213BarSit[0] ;
         A1235BarNumCli = P09KE7_A1235BarNumCli[0] ;
         A1234BarNomCli = P09KE7_A1234BarNomCli[0] ;
         A136BarColNum = P09KE7_A136BarColNum[0] ;
         A135BarColNom = P09KE7_A135BarColNom[0] ;
         A1652BarSerDsc = P09KE7_A1652BarSerDsc[0] ;
         A212BarSer = P09KE7_A212BarSer[0] ;
         A13696BarNHdr = P09KE7_A13696BarNHdr[0] ;
         A279CliNom = P09KE7_A279CliNom[0] ;
         A252CliCod = P09KE7_A252CliCod[0] ;
         n252CliCod = P09KE7_n252CliCod[0] ;
         A184BarMtr = P09KE7_A184BarMtr[0] ;
         A166BarKgm = P09KE7_A166BarKgm[0] ;
         A143BarDisNum = P09KE7_A143BarDisNum[0] ;
         A4812BarEncCli = P09KE7_A4812BarEncCli[0] ;
         A199BarPie1 = P09KE7_A199BarPie1[0] ;
         A365DisDes = P09KE7_A365DisDes[0] ;
         A898BarPieNDes = P09KE7_A898BarPieNDes[0] ;
         A130BarCodPar = P09KE7_A130BarCodPar[0] ;
         A132BarCodReo = P09KE7_A132BarCodReo[0] ;
         A129BarCod = P09KE7_A129BarCod[0] ;
         A396EmprCod = P09KE7_A396EmprCod[0] ;
         A279CliNom = P09KE7_A279CliNom[0] ;
         A184BarMtr = P09KE7_A184BarMtr[0] ;
         A166BarKgm = P09KE7_A166BarKgm[0] ;
         A199BarPie1 = P09KE7_A199BarPie1[0] ;
         A898BarPieNDes = P09KE7_A898BarPieNDes[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_char3) ;
         hojaderuta_trnwwgetfilterdata.this.A396EmprCod = GXv_char6[0] ;
         hojaderuta_trnwwgetfilterdata.this.A4812BarEncCli = GXv_char5[0] ;
         hojaderuta_trnwwgetfilterdata.this.A143BarDisNum = GXv_char4[0] ;
         hojaderuta_trnwwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV36TFPedidoCliente_Sel)==0) && ( ! (GXutil.strcmp("", AV35TFPedidoCliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV35TFPedidoCliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV36TFPedidoCliente_Sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV36TFPedidoCliente_Sel) == 0 ) ) )
            {
               GXt_int7 = A14502BarHayAlb ;
               GXv_int8[0] = GXt_int7 ;
               new app.hayalbaransalida(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int8) ;
               hojaderuta_trnwwgetfilterdata.this.GXt_int7 = GXv_int8[0] ;
               A14502BarHayAlb = GXt_int7 ;
               if ( ( AV88TFBarHayAlb_Sel != 1 ) || ( ( A14502BarHayAlb == 1 ) ) )
               {
                  if ( ( AV88TFBarHayAlb_Sel != 2 ) || ( ( A14502BarHayAlb == 0 ) ) )
                  {
                     if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
                     {
                        A198BarPie = A898BarPieNDes ;
                     }
                     else
                     {
                        A198BarPie = A199BarPie1 ;
                     }
                     if ( (GXutil.strcmp("", AV32FilterFullText)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV32FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A2010BarTipDis) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV32FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1234BarNomCli) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1235BarNumCli, 6, 0) , GXutil.padr( "%" + AV32FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV32FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A180BarMaqCod) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A198BarPie, 6, 0) , GXutil.padr( "%" + AV32FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A166BarKgm, 9, 2) , GXutil.padr( "%" + AV32FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A184BarMtr, 9, 2) , GXutil.padr( "%" + AV32FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A118BarAcaQui) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A120BarAgrEst) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) ) )
                     {
                        if ( (0==AV67TFBarPie) || ( ( A198BarPie >= AV67TFBarPie ) ) )
                        {
                           if ( (0==AV68TFBarPie_To) || ( ( A198BarPie <= AV68TFBarPie_To ) ) )
                           {
                              AV26count = 0 ;
                              while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09KE7_A2010BarTipDis[0], A2010BarTipDis) == 0 ) )
                              {
                                 brk9KE5 = false ;
                                 A130BarCodPar = P09KE7_A130BarCodPar[0] ;
                                 A132BarCodReo = P09KE7_A132BarCodReo[0] ;
                                 A129BarCod = P09KE7_A129BarCod[0] ;
                                 A396EmprCod = P09KE7_A396EmprCod[0] ;
                                 AV26count = (long)(AV26count+1) ;
                                 brk9KE5 = true ;
                                 pr_default.readNext(2);
                              }
                              if ( ! (GXutil.strcmp("", A2010BarTipDis)==0) )
                              {
                                 AV18Option = A2010BarTipDis ;
                                 AV21OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A2010BarTipDis, "@!"))) ;
                                 AV19Options.add(AV18Option, 0);
                                 AV22OptionsDesc.add(AV21OptionDesc, 0);
                                 AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                              }
                              if ( AV19Options.size() == 50 )
                              {
                                 /* Exit For each command. Update data (if necessary), close cursors & exit. */
                                 if (true) break;
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
         if ( ! brk9KE5 )
         {
            brk9KE5 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADBARSEROPTIONS' Routine */
      returnInSub = false ;
      AV43TFBarSer = AV14SearchTxt ;
      AV44TFBarSer_Sel = "" ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           Integer.valueOf(AV39TFCliCod) ,
                                           Integer.valueOf(AV40TFCliCod_To) ,
                                           AV42TFCliNom_Sel ,
                                           AV41TFCliNom ,
                                           AV60TFBarTipDis_Sel ,
                                           AV59TFBarTipDis ,
                                           AV44TFBarSer_Sel ,
                                           AV43TFBarSer ,
                                           AV46TFBarSerDsc_Sel ,
                                           AV45TFBarSerDsc ,
                                           AV48TFBarColNom_Sel ,
                                           AV47TFBarColNom ,
                                           Integer.valueOf(AV49TFBarColNum) ,
                                           Integer.valueOf(AV50TFBarColNum_To) ,
                                           AV62TFBarNomCli_Sel ,
                                           AV61TFBarNomCli ,
                                           Integer.valueOf(AV63TFBarNumCli) ,
                                           Integer.valueOf(AV64TFBarNumCli_To) ,
                                           AV66TFBarMaqCod_Sel ,
                                           AV65TFBarMaqCod ,
                                           AV69TFBarKgm ,
                                           AV70TFBarKgm_To ,
                                           AV71TFBarMtr ,
                                           AV72TFBarMtr_To ,
                                           AV74TFBarAcaQui_Sel ,
                                           AV73TFBarAcaQui ,
                                           AV78TFBarAgrEst_Sel ,
                                           AV77TFBarAgrEst ,
                                           AV82BarFecGenfrom ,
                                           AV83BarFecGento ,
                                           Byte.valueOf(AV84BarSitfrom) ,
                                           Byte.valueOf(AV85BarSitto) ,
                                           Integer.valueOf(AV79BarCodIN) ,
                                           Byte.valueOf(AV80BarCodreoIN) ,
                                           AV81BarCodparIN ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A2010BarTipDis ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           Integer.valueOf(A1235BarNumCli) ,
                                           A180BarMaqCod ,
                                           A166BarKgm ,
                                           A184BarMtr ,
                                           A118BarAcaQui ,
                                           A120BarAgrEst ,
                                           A159BarFecGen ,
                                           Byte.valueOf(A213BarSit) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           AV32FilterFullText ,
                                           A13878PedidoClie ,
                                           A13696BarNHdr ,
                                           Integer.valueOf(A198BarPie) ,
                                           AV36TFPedidoCliente_Sel ,
                                           AV35TFPedidoCliente ,
                                           Integer.valueOf(AV67TFBarPie) ,
                                           Integer.valueOf(AV68TFBarPie_To) ,
                                           Byte.valueOf(AV88TFBarHayAlb_Sel) ,
                                           Byte.valueOf(A14502BarHayAlb) } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE
                                           }
      });
      lV41TFCliNom = GXutil.padr( GXutil.rtrim( AV41TFCliNom), 30, "%") ;
      lV59TFBarTipDis = GXutil.padr( GXutil.rtrim( AV59TFBarTipDis), 1, "%") ;
      lV43TFBarSer = GXutil.padr( GXutil.rtrim( AV43TFBarSer), 16, "%") ;
      lV45TFBarSerDsc = GXutil.padr( GXutil.rtrim( AV45TFBarSerDsc), 26, "%") ;
      lV47TFBarColNom = GXutil.padr( GXutil.rtrim( AV47TFBarColNom), 13, "%") ;
      lV61TFBarNomCli = GXutil.padr( GXutil.rtrim( AV61TFBarNomCli), 13, "%") ;
      lV65TFBarMaqCod = GXutil.padr( GXutil.rtrim( AV65TFBarMaqCod), 6, "%") ;
      lV73TFBarAcaQui = GXutil.padr( GXutil.rtrim( AV73TFBarAcaQui), 6, "%") ;
      lV77TFBarAgrEst = GXutil.padr( GXutil.rtrim( AV77TFBarAgrEst), 1, "%") ;
      /* Using cursor P09KE9 */
      pr_default.execute(3, new Object[] {Integer.valueOf(AV39TFCliCod), Integer.valueOf(AV40TFCliCod_To), lV41TFCliNom, AV42TFCliNom_Sel, lV59TFBarTipDis, AV60TFBarTipDis_Sel, lV43TFBarSer, AV44TFBarSer_Sel, lV45TFBarSerDsc, AV46TFBarSerDsc_Sel, lV47TFBarColNom, AV48TFBarColNom_Sel, Integer.valueOf(AV49TFBarColNum), Integer.valueOf(AV50TFBarColNum_To), lV61TFBarNomCli, AV62TFBarNomCli_Sel, Integer.valueOf(AV63TFBarNumCli), Integer.valueOf(AV64TFBarNumCli_To), lV65TFBarMaqCod, AV66TFBarMaqCod_Sel, AV69TFBarKgm, AV70TFBarKgm_To, AV71TFBarMtr, AV72TFBarMtr_To, lV73TFBarAcaQui, AV74TFBarAcaQui_Sel, lV77TFBarAgrEst, AV78TFBarAgrEst_Sel, AV82BarFecGenfrom, AV83BarFecGento, Byte.valueOf(AV84BarSitfrom), Byte.valueOf(AV85BarSitto), Integer.valueOf(AV79BarCodIN), Byte.valueOf(AV80BarCodreoIN), AV81BarCodparIN});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk9KE7 = false ;
         A212BarSer = P09KE9_A212BarSer[0] ;
         A159BarFecGen = P09KE9_A159BarFecGen[0] ;
         A120BarAgrEst = P09KE9_A120BarAgrEst[0] ;
         A118BarAcaQui = P09KE9_A118BarAcaQui[0] ;
         A180BarMaqCod = P09KE9_A180BarMaqCod[0] ;
         A213BarSit = P09KE9_A213BarSit[0] ;
         A1235BarNumCli = P09KE9_A1235BarNumCli[0] ;
         A1234BarNomCli = P09KE9_A1234BarNomCli[0] ;
         A136BarColNum = P09KE9_A136BarColNum[0] ;
         A135BarColNom = P09KE9_A135BarColNom[0] ;
         A1652BarSerDsc = P09KE9_A1652BarSerDsc[0] ;
         A2010BarTipDis = P09KE9_A2010BarTipDis[0] ;
         A13696BarNHdr = P09KE9_A13696BarNHdr[0] ;
         A279CliNom = P09KE9_A279CliNom[0] ;
         A252CliCod = P09KE9_A252CliCod[0] ;
         n252CliCod = P09KE9_n252CliCod[0] ;
         A184BarMtr = P09KE9_A184BarMtr[0] ;
         A166BarKgm = P09KE9_A166BarKgm[0] ;
         A143BarDisNum = P09KE9_A143BarDisNum[0] ;
         A4812BarEncCli = P09KE9_A4812BarEncCli[0] ;
         A199BarPie1 = P09KE9_A199BarPie1[0] ;
         A365DisDes = P09KE9_A365DisDes[0] ;
         A898BarPieNDes = P09KE9_A898BarPieNDes[0] ;
         A130BarCodPar = P09KE9_A130BarCodPar[0] ;
         A132BarCodReo = P09KE9_A132BarCodReo[0] ;
         A129BarCod = P09KE9_A129BarCod[0] ;
         A396EmprCod = P09KE9_A396EmprCod[0] ;
         A279CliNom = P09KE9_A279CliNom[0] ;
         A184BarMtr = P09KE9_A184BarMtr[0] ;
         A166BarKgm = P09KE9_A166BarKgm[0] ;
         A199BarPie1 = P09KE9_A199BarPie1[0] ;
         A898BarPieNDes = P09KE9_A898BarPieNDes[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_char3) ;
         hojaderuta_trnwwgetfilterdata.this.A396EmprCod = GXv_char6[0] ;
         hojaderuta_trnwwgetfilterdata.this.A4812BarEncCli = GXv_char5[0] ;
         hojaderuta_trnwwgetfilterdata.this.A143BarDisNum = GXv_char4[0] ;
         hojaderuta_trnwwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV36TFPedidoCliente_Sel)==0) && ( ! (GXutil.strcmp("", AV35TFPedidoCliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV35TFPedidoCliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV36TFPedidoCliente_Sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV36TFPedidoCliente_Sel) == 0 ) ) )
            {
               GXt_int7 = A14502BarHayAlb ;
               GXv_int8[0] = GXt_int7 ;
               new app.hayalbaransalida(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int8) ;
               hojaderuta_trnwwgetfilterdata.this.GXt_int7 = GXv_int8[0] ;
               A14502BarHayAlb = GXt_int7 ;
               if ( ( AV88TFBarHayAlb_Sel != 1 ) || ( ( A14502BarHayAlb == 1 ) ) )
               {
                  if ( ( AV88TFBarHayAlb_Sel != 2 ) || ( ( A14502BarHayAlb == 0 ) ) )
                  {
                     if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
                     {
                        A198BarPie = A898BarPieNDes ;
                     }
                     else
                     {
                        A198BarPie = A199BarPie1 ;
                     }
                     if ( (GXutil.strcmp("", AV32FilterFullText)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV32FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A2010BarTipDis) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV32FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1234BarNomCli) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1235BarNumCli, 6, 0) , GXutil.padr( "%" + AV32FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV32FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A180BarMaqCod) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A198BarPie, 6, 0) , GXutil.padr( "%" + AV32FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A166BarKgm, 9, 2) , GXutil.padr( "%" + AV32FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A184BarMtr, 9, 2) , GXutil.padr( "%" + AV32FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A118BarAcaQui) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A120BarAgrEst) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) ) )
                     {
                        if ( (0==AV67TFBarPie) || ( ( A198BarPie >= AV67TFBarPie ) ) )
                        {
                           if ( (0==AV68TFBarPie_To) || ( ( A198BarPie <= AV68TFBarPie_To ) ) )
                           {
                              AV26count = 0 ;
                              while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P09KE9_A212BarSer[0], A212BarSer) == 0 ) )
                              {
                                 brk9KE7 = false ;
                                 A130BarCodPar = P09KE9_A130BarCodPar[0] ;
                                 A132BarCodReo = P09KE9_A132BarCodReo[0] ;
                                 A129BarCod = P09KE9_A129BarCod[0] ;
                                 A396EmprCod = P09KE9_A396EmprCod[0] ;
                                 AV26count = (long)(AV26count+1) ;
                                 brk9KE7 = true ;
                                 pr_default.readNext(3);
                              }
                              if ( ! (GXutil.strcmp("", A212BarSer)==0) )
                              {
                                 AV18Option = A212BarSer ;
                                 AV19Options.add(AV18Option, 0);
                                 AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                              }
                              if ( AV19Options.size() == 50 )
                              {
                                 /* Exit For each command. Update data (if necessary), close cursors & exit. */
                                 if (true) break;
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
         if ( ! brk9KE7 )
         {
            brk9KE7 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADBARSERDSCOPTIONS' Routine */
      returnInSub = false ;
      AV45TFBarSerDsc = AV14SearchTxt ;
      AV46TFBarSerDsc_Sel = "" ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           Integer.valueOf(AV39TFCliCod) ,
                                           Integer.valueOf(AV40TFCliCod_To) ,
                                           AV42TFCliNom_Sel ,
                                           AV41TFCliNom ,
                                           AV60TFBarTipDis_Sel ,
                                           AV59TFBarTipDis ,
                                           AV44TFBarSer_Sel ,
                                           AV43TFBarSer ,
                                           AV46TFBarSerDsc_Sel ,
                                           AV45TFBarSerDsc ,
                                           AV48TFBarColNom_Sel ,
                                           AV47TFBarColNom ,
                                           Integer.valueOf(AV49TFBarColNum) ,
                                           Integer.valueOf(AV50TFBarColNum_To) ,
                                           AV62TFBarNomCli_Sel ,
                                           AV61TFBarNomCli ,
                                           Integer.valueOf(AV63TFBarNumCli) ,
                                           Integer.valueOf(AV64TFBarNumCli_To) ,
                                           AV66TFBarMaqCod_Sel ,
                                           AV65TFBarMaqCod ,
                                           AV69TFBarKgm ,
                                           AV70TFBarKgm_To ,
                                           AV71TFBarMtr ,
                                           AV72TFBarMtr_To ,
                                           AV74TFBarAcaQui_Sel ,
                                           AV73TFBarAcaQui ,
                                           AV78TFBarAgrEst_Sel ,
                                           AV77TFBarAgrEst ,
                                           AV82BarFecGenfrom ,
                                           AV83BarFecGento ,
                                           Byte.valueOf(AV84BarSitfrom) ,
                                           Byte.valueOf(AV85BarSitto) ,
                                           Integer.valueOf(AV79BarCodIN) ,
                                           Byte.valueOf(AV80BarCodreoIN) ,
                                           AV81BarCodparIN ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A2010BarTipDis ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           Integer.valueOf(A1235BarNumCli) ,
                                           A180BarMaqCod ,
                                           A166BarKgm ,
                                           A184BarMtr ,
                                           A118BarAcaQui ,
                                           A120BarAgrEst ,
                                           A159BarFecGen ,
                                           Byte.valueOf(A213BarSit) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           AV32FilterFullText ,
                                           A13878PedidoClie ,
                                           A13696BarNHdr ,
                                           Integer.valueOf(A198BarPie) ,
                                           AV36TFPedidoCliente_Sel ,
                                           AV35TFPedidoCliente ,
                                           Integer.valueOf(AV67TFBarPie) ,
                                           Integer.valueOf(AV68TFBarPie_To) ,
                                           Byte.valueOf(AV88TFBarHayAlb_Sel) ,
                                           Byte.valueOf(A14502BarHayAlb) } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE
                                           }
      });
      lV41TFCliNom = GXutil.padr( GXutil.rtrim( AV41TFCliNom), 30, "%") ;
      lV59TFBarTipDis = GXutil.padr( GXutil.rtrim( AV59TFBarTipDis), 1, "%") ;
      lV43TFBarSer = GXutil.padr( GXutil.rtrim( AV43TFBarSer), 16, "%") ;
      lV45TFBarSerDsc = GXutil.padr( GXutil.rtrim( AV45TFBarSerDsc), 26, "%") ;
      lV47TFBarColNom = GXutil.padr( GXutil.rtrim( AV47TFBarColNom), 13, "%") ;
      lV61TFBarNomCli = GXutil.padr( GXutil.rtrim( AV61TFBarNomCli), 13, "%") ;
      lV65TFBarMaqCod = GXutil.padr( GXutil.rtrim( AV65TFBarMaqCod), 6, "%") ;
      lV73TFBarAcaQui = GXutil.padr( GXutil.rtrim( AV73TFBarAcaQui), 6, "%") ;
      lV77TFBarAgrEst = GXutil.padr( GXutil.rtrim( AV77TFBarAgrEst), 1, "%") ;
      /* Using cursor P09KE11 */
      pr_default.execute(4, new Object[] {Integer.valueOf(AV39TFCliCod), Integer.valueOf(AV40TFCliCod_To), lV41TFCliNom, AV42TFCliNom_Sel, lV59TFBarTipDis, AV60TFBarTipDis_Sel, lV43TFBarSer, AV44TFBarSer_Sel, lV45TFBarSerDsc, AV46TFBarSerDsc_Sel, lV47TFBarColNom, AV48TFBarColNom_Sel, Integer.valueOf(AV49TFBarColNum), Integer.valueOf(AV50TFBarColNum_To), lV61TFBarNomCli, AV62TFBarNomCli_Sel, Integer.valueOf(AV63TFBarNumCli), Integer.valueOf(AV64TFBarNumCli_To), lV65TFBarMaqCod, AV66TFBarMaqCod_Sel, AV69TFBarKgm, AV70TFBarKgm_To, AV71TFBarMtr, AV72TFBarMtr_To, lV73TFBarAcaQui, AV74TFBarAcaQui_Sel, lV77TFBarAgrEst, AV78TFBarAgrEst_Sel, AV82BarFecGenfrom, AV83BarFecGento, Byte.valueOf(AV84BarSitfrom), Byte.valueOf(AV85BarSitto), Integer.valueOf(AV79BarCodIN), Byte.valueOf(AV80BarCodreoIN), AV81BarCodparIN});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk9KE9 = false ;
         A1652BarSerDsc = P09KE11_A1652BarSerDsc[0] ;
         A159BarFecGen = P09KE11_A159BarFecGen[0] ;
         A120BarAgrEst = P09KE11_A120BarAgrEst[0] ;
         A118BarAcaQui = P09KE11_A118BarAcaQui[0] ;
         A180BarMaqCod = P09KE11_A180BarMaqCod[0] ;
         A213BarSit = P09KE11_A213BarSit[0] ;
         A1235BarNumCli = P09KE11_A1235BarNumCli[0] ;
         A1234BarNomCli = P09KE11_A1234BarNomCli[0] ;
         A136BarColNum = P09KE11_A136BarColNum[0] ;
         A135BarColNom = P09KE11_A135BarColNom[0] ;
         A212BarSer = P09KE11_A212BarSer[0] ;
         A2010BarTipDis = P09KE11_A2010BarTipDis[0] ;
         A13696BarNHdr = P09KE11_A13696BarNHdr[0] ;
         A279CliNom = P09KE11_A279CliNom[0] ;
         A252CliCod = P09KE11_A252CliCod[0] ;
         n252CliCod = P09KE11_n252CliCod[0] ;
         A184BarMtr = P09KE11_A184BarMtr[0] ;
         A166BarKgm = P09KE11_A166BarKgm[0] ;
         A143BarDisNum = P09KE11_A143BarDisNum[0] ;
         A4812BarEncCli = P09KE11_A4812BarEncCli[0] ;
         A199BarPie1 = P09KE11_A199BarPie1[0] ;
         A365DisDes = P09KE11_A365DisDes[0] ;
         A898BarPieNDes = P09KE11_A898BarPieNDes[0] ;
         A130BarCodPar = P09KE11_A130BarCodPar[0] ;
         A132BarCodReo = P09KE11_A132BarCodReo[0] ;
         A129BarCod = P09KE11_A129BarCod[0] ;
         A396EmprCod = P09KE11_A396EmprCod[0] ;
         A279CliNom = P09KE11_A279CliNom[0] ;
         A184BarMtr = P09KE11_A184BarMtr[0] ;
         A166BarKgm = P09KE11_A166BarKgm[0] ;
         A199BarPie1 = P09KE11_A199BarPie1[0] ;
         A898BarPieNDes = P09KE11_A898BarPieNDes[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_char3) ;
         hojaderuta_trnwwgetfilterdata.this.A396EmprCod = GXv_char6[0] ;
         hojaderuta_trnwwgetfilterdata.this.A4812BarEncCli = GXv_char5[0] ;
         hojaderuta_trnwwgetfilterdata.this.A143BarDisNum = GXv_char4[0] ;
         hojaderuta_trnwwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV36TFPedidoCliente_Sel)==0) && ( ! (GXutil.strcmp("", AV35TFPedidoCliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV35TFPedidoCliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV36TFPedidoCliente_Sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV36TFPedidoCliente_Sel) == 0 ) ) )
            {
               GXt_int7 = A14502BarHayAlb ;
               GXv_int8[0] = GXt_int7 ;
               new app.hayalbaransalida(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int8) ;
               hojaderuta_trnwwgetfilterdata.this.GXt_int7 = GXv_int8[0] ;
               A14502BarHayAlb = GXt_int7 ;
               if ( ( AV88TFBarHayAlb_Sel != 1 ) || ( ( A14502BarHayAlb == 1 ) ) )
               {
                  if ( ( AV88TFBarHayAlb_Sel != 2 ) || ( ( A14502BarHayAlb == 0 ) ) )
                  {
                     if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
                     {
                        A198BarPie = A898BarPieNDes ;
                     }
                     else
                     {
                        A198BarPie = A199BarPie1 ;
                     }
                     if ( (GXutil.strcmp("", AV32FilterFullText)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV32FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A2010BarTipDis) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV32FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1234BarNomCli) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1235BarNumCli, 6, 0) , GXutil.padr( "%" + AV32FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV32FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A180BarMaqCod) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A198BarPie, 6, 0) , GXutil.padr( "%" + AV32FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A166BarKgm, 9, 2) , GXutil.padr( "%" + AV32FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A184BarMtr, 9, 2) , GXutil.padr( "%" + AV32FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A118BarAcaQui) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A120BarAgrEst) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) ) )
                     {
                        if ( (0==AV67TFBarPie) || ( ( A198BarPie >= AV67TFBarPie ) ) )
                        {
                           if ( (0==AV68TFBarPie_To) || ( ( A198BarPie <= AV68TFBarPie_To ) ) )
                           {
                              AV26count = 0 ;
                              while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P09KE11_A1652BarSerDsc[0], A1652BarSerDsc) == 0 ) )
                              {
                                 brk9KE9 = false ;
                                 A130BarCodPar = P09KE11_A130BarCodPar[0] ;
                                 A132BarCodReo = P09KE11_A132BarCodReo[0] ;
                                 A129BarCod = P09KE11_A129BarCod[0] ;
                                 A396EmprCod = P09KE11_A396EmprCod[0] ;
                                 AV26count = (long)(AV26count+1) ;
                                 brk9KE9 = true ;
                                 pr_default.readNext(4);
                              }
                              if ( ! (GXutil.strcmp("", A1652BarSerDsc)==0) )
                              {
                                 AV18Option = A1652BarSerDsc ;
                                 AV19Options.add(AV18Option, 0);
                                 AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                              }
                              if ( AV19Options.size() == 50 )
                              {
                                 /* Exit For each command. Update data (if necessary), close cursors & exit. */
                                 if (true) break;
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
         if ( ! brk9KE9 )
         {
            brk9KE9 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADBARCOLNOMOPTIONS' Routine */
      returnInSub = false ;
      AV47TFBarColNom = AV14SearchTxt ;
      AV48TFBarColNom_Sel = "" ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           Integer.valueOf(AV39TFCliCod) ,
                                           Integer.valueOf(AV40TFCliCod_To) ,
                                           AV42TFCliNom_Sel ,
                                           AV41TFCliNom ,
                                           AV60TFBarTipDis_Sel ,
                                           AV59TFBarTipDis ,
                                           AV44TFBarSer_Sel ,
                                           AV43TFBarSer ,
                                           AV46TFBarSerDsc_Sel ,
                                           AV45TFBarSerDsc ,
                                           AV48TFBarColNom_Sel ,
                                           AV47TFBarColNom ,
                                           Integer.valueOf(AV49TFBarColNum) ,
                                           Integer.valueOf(AV50TFBarColNum_To) ,
                                           AV62TFBarNomCli_Sel ,
                                           AV61TFBarNomCli ,
                                           Integer.valueOf(AV63TFBarNumCli) ,
                                           Integer.valueOf(AV64TFBarNumCli_To) ,
                                           AV66TFBarMaqCod_Sel ,
                                           AV65TFBarMaqCod ,
                                           AV69TFBarKgm ,
                                           AV70TFBarKgm_To ,
                                           AV71TFBarMtr ,
                                           AV72TFBarMtr_To ,
                                           AV74TFBarAcaQui_Sel ,
                                           AV73TFBarAcaQui ,
                                           AV78TFBarAgrEst_Sel ,
                                           AV77TFBarAgrEst ,
                                           AV82BarFecGenfrom ,
                                           AV83BarFecGento ,
                                           Byte.valueOf(AV84BarSitfrom) ,
                                           Byte.valueOf(AV85BarSitto) ,
                                           Integer.valueOf(AV79BarCodIN) ,
                                           Byte.valueOf(AV80BarCodreoIN) ,
                                           AV81BarCodparIN ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A2010BarTipDis ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           Integer.valueOf(A1235BarNumCli) ,
                                           A180BarMaqCod ,
                                           A166BarKgm ,
                                           A184BarMtr ,
                                           A118BarAcaQui ,
                                           A120BarAgrEst ,
                                           A159BarFecGen ,
                                           Byte.valueOf(A213BarSit) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           AV32FilterFullText ,
                                           A13878PedidoClie ,
                                           A13696BarNHdr ,
                                           Integer.valueOf(A198BarPie) ,
                                           AV36TFPedidoCliente_Sel ,
                                           AV35TFPedidoCliente ,
                                           Integer.valueOf(AV67TFBarPie) ,
                                           Integer.valueOf(AV68TFBarPie_To) ,
                                           Byte.valueOf(AV88TFBarHayAlb_Sel) ,
                                           Byte.valueOf(A14502BarHayAlb) } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE
                                           }
      });
      lV41TFCliNom = GXutil.padr( GXutil.rtrim( AV41TFCliNom), 30, "%") ;
      lV59TFBarTipDis = GXutil.padr( GXutil.rtrim( AV59TFBarTipDis), 1, "%") ;
      lV43TFBarSer = GXutil.padr( GXutil.rtrim( AV43TFBarSer), 16, "%") ;
      lV45TFBarSerDsc = GXutil.padr( GXutil.rtrim( AV45TFBarSerDsc), 26, "%") ;
      lV47TFBarColNom = GXutil.padr( GXutil.rtrim( AV47TFBarColNom), 13, "%") ;
      lV61TFBarNomCli = GXutil.padr( GXutil.rtrim( AV61TFBarNomCli), 13, "%") ;
      lV65TFBarMaqCod = GXutil.padr( GXutil.rtrim( AV65TFBarMaqCod), 6, "%") ;
      lV73TFBarAcaQui = GXutil.padr( GXutil.rtrim( AV73TFBarAcaQui), 6, "%") ;
      lV77TFBarAgrEst = GXutil.padr( GXutil.rtrim( AV77TFBarAgrEst), 1, "%") ;
      /* Using cursor P09KE13 */
      pr_default.execute(5, new Object[] {Integer.valueOf(AV39TFCliCod), Integer.valueOf(AV40TFCliCod_To), lV41TFCliNom, AV42TFCliNom_Sel, lV59TFBarTipDis, AV60TFBarTipDis_Sel, lV43TFBarSer, AV44TFBarSer_Sel, lV45TFBarSerDsc, AV46TFBarSerDsc_Sel, lV47TFBarColNom, AV48TFBarColNom_Sel, Integer.valueOf(AV49TFBarColNum), Integer.valueOf(AV50TFBarColNum_To), lV61TFBarNomCli, AV62TFBarNomCli_Sel, Integer.valueOf(AV63TFBarNumCli), Integer.valueOf(AV64TFBarNumCli_To), lV65TFBarMaqCod, AV66TFBarMaqCod_Sel, AV69TFBarKgm, AV70TFBarKgm_To, AV71TFBarMtr, AV72TFBarMtr_To, lV73TFBarAcaQui, AV74TFBarAcaQui_Sel, lV77TFBarAgrEst, AV78TFBarAgrEst_Sel, AV82BarFecGenfrom, AV83BarFecGento, Byte.valueOf(AV84BarSitfrom), Byte.valueOf(AV85BarSitto), Integer.valueOf(AV79BarCodIN), Byte.valueOf(AV80BarCodreoIN), AV81BarCodparIN});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk9KE11 = false ;
         A135BarColNom = P09KE13_A135BarColNom[0] ;
         A159BarFecGen = P09KE13_A159BarFecGen[0] ;
         A120BarAgrEst = P09KE13_A120BarAgrEst[0] ;
         A118BarAcaQui = P09KE13_A118BarAcaQui[0] ;
         A180BarMaqCod = P09KE13_A180BarMaqCod[0] ;
         A213BarSit = P09KE13_A213BarSit[0] ;
         A1235BarNumCli = P09KE13_A1235BarNumCli[0] ;
         A1234BarNomCli = P09KE13_A1234BarNomCli[0] ;
         A136BarColNum = P09KE13_A136BarColNum[0] ;
         A1652BarSerDsc = P09KE13_A1652BarSerDsc[0] ;
         A212BarSer = P09KE13_A212BarSer[0] ;
         A2010BarTipDis = P09KE13_A2010BarTipDis[0] ;
         A13696BarNHdr = P09KE13_A13696BarNHdr[0] ;
         A279CliNom = P09KE13_A279CliNom[0] ;
         A252CliCod = P09KE13_A252CliCod[0] ;
         n252CliCod = P09KE13_n252CliCod[0] ;
         A184BarMtr = P09KE13_A184BarMtr[0] ;
         A166BarKgm = P09KE13_A166BarKgm[0] ;
         A143BarDisNum = P09KE13_A143BarDisNum[0] ;
         A4812BarEncCli = P09KE13_A4812BarEncCli[0] ;
         A199BarPie1 = P09KE13_A199BarPie1[0] ;
         A365DisDes = P09KE13_A365DisDes[0] ;
         A898BarPieNDes = P09KE13_A898BarPieNDes[0] ;
         A130BarCodPar = P09KE13_A130BarCodPar[0] ;
         A132BarCodReo = P09KE13_A132BarCodReo[0] ;
         A129BarCod = P09KE13_A129BarCod[0] ;
         A396EmprCod = P09KE13_A396EmprCod[0] ;
         A279CliNom = P09KE13_A279CliNom[0] ;
         A184BarMtr = P09KE13_A184BarMtr[0] ;
         A166BarKgm = P09KE13_A166BarKgm[0] ;
         A199BarPie1 = P09KE13_A199BarPie1[0] ;
         A898BarPieNDes = P09KE13_A898BarPieNDes[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_char3) ;
         hojaderuta_trnwwgetfilterdata.this.A396EmprCod = GXv_char6[0] ;
         hojaderuta_trnwwgetfilterdata.this.A4812BarEncCli = GXv_char5[0] ;
         hojaderuta_trnwwgetfilterdata.this.A143BarDisNum = GXv_char4[0] ;
         hojaderuta_trnwwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV36TFPedidoCliente_Sel)==0) && ( ! (GXutil.strcmp("", AV35TFPedidoCliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV35TFPedidoCliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV36TFPedidoCliente_Sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV36TFPedidoCliente_Sel) == 0 ) ) )
            {
               GXt_int7 = A14502BarHayAlb ;
               GXv_int8[0] = GXt_int7 ;
               new app.hayalbaransalida(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int8) ;
               hojaderuta_trnwwgetfilterdata.this.GXt_int7 = GXv_int8[0] ;
               A14502BarHayAlb = GXt_int7 ;
               if ( ( AV88TFBarHayAlb_Sel != 1 ) || ( ( A14502BarHayAlb == 1 ) ) )
               {
                  if ( ( AV88TFBarHayAlb_Sel != 2 ) || ( ( A14502BarHayAlb == 0 ) ) )
                  {
                     if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
                     {
                        A198BarPie = A898BarPieNDes ;
                     }
                     else
                     {
                        A198BarPie = A199BarPie1 ;
                     }
                     if ( (GXutil.strcmp("", AV32FilterFullText)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV32FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A2010BarTipDis) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV32FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1234BarNomCli) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1235BarNumCli, 6, 0) , GXutil.padr( "%" + AV32FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV32FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A180BarMaqCod) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A198BarPie, 6, 0) , GXutil.padr( "%" + AV32FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A166BarKgm, 9, 2) , GXutil.padr( "%" + AV32FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A184BarMtr, 9, 2) , GXutil.padr( "%" + AV32FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A118BarAcaQui) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A120BarAgrEst) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) ) )
                     {
                        if ( (0==AV67TFBarPie) || ( ( A198BarPie >= AV67TFBarPie ) ) )
                        {
                           if ( (0==AV68TFBarPie_To) || ( ( A198BarPie <= AV68TFBarPie_To ) ) )
                           {
                              AV26count = 0 ;
                              while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P09KE13_A135BarColNom[0], A135BarColNom) == 0 ) )
                              {
                                 brk9KE11 = false ;
                                 A130BarCodPar = P09KE13_A130BarCodPar[0] ;
                                 A132BarCodReo = P09KE13_A132BarCodReo[0] ;
                                 A129BarCod = P09KE13_A129BarCod[0] ;
                                 A396EmprCod = P09KE13_A396EmprCod[0] ;
                                 AV26count = (long)(AV26count+1) ;
                                 brk9KE11 = true ;
                                 pr_default.readNext(5);
                              }
                              if ( ! (GXutil.strcmp("", A135BarColNom)==0) )
                              {
                                 AV18Option = A135BarColNom ;
                                 AV19Options.add(AV18Option, 0);
                                 AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                              }
                              if ( AV19Options.size() == 50 )
                              {
                                 /* Exit For each command. Update data (if necessary), close cursors & exit. */
                                 if (true) break;
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
         if ( ! brk9KE11 )
         {
            brk9KE11 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   public void S181( )
   {
      /* 'LOADBARNOMCLIOPTIONS' Routine */
      returnInSub = false ;
      AV61TFBarNomCli = AV14SearchTxt ;
      AV62TFBarNomCli_Sel = "" ;
      pr_default.dynParam(6, new Object[]{ new Object[]{
                                           Integer.valueOf(AV39TFCliCod) ,
                                           Integer.valueOf(AV40TFCliCod_To) ,
                                           AV42TFCliNom_Sel ,
                                           AV41TFCliNom ,
                                           AV60TFBarTipDis_Sel ,
                                           AV59TFBarTipDis ,
                                           AV44TFBarSer_Sel ,
                                           AV43TFBarSer ,
                                           AV46TFBarSerDsc_Sel ,
                                           AV45TFBarSerDsc ,
                                           AV48TFBarColNom_Sel ,
                                           AV47TFBarColNom ,
                                           Integer.valueOf(AV49TFBarColNum) ,
                                           Integer.valueOf(AV50TFBarColNum_To) ,
                                           AV62TFBarNomCli_Sel ,
                                           AV61TFBarNomCli ,
                                           Integer.valueOf(AV63TFBarNumCli) ,
                                           Integer.valueOf(AV64TFBarNumCli_To) ,
                                           AV66TFBarMaqCod_Sel ,
                                           AV65TFBarMaqCod ,
                                           AV69TFBarKgm ,
                                           AV70TFBarKgm_To ,
                                           AV71TFBarMtr ,
                                           AV72TFBarMtr_To ,
                                           AV74TFBarAcaQui_Sel ,
                                           AV73TFBarAcaQui ,
                                           AV78TFBarAgrEst_Sel ,
                                           AV77TFBarAgrEst ,
                                           AV82BarFecGenfrom ,
                                           AV83BarFecGento ,
                                           Byte.valueOf(AV84BarSitfrom) ,
                                           Byte.valueOf(AV85BarSitto) ,
                                           Integer.valueOf(AV79BarCodIN) ,
                                           Byte.valueOf(AV80BarCodreoIN) ,
                                           AV81BarCodparIN ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A2010BarTipDis ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           Integer.valueOf(A1235BarNumCli) ,
                                           A180BarMaqCod ,
                                           A166BarKgm ,
                                           A184BarMtr ,
                                           A118BarAcaQui ,
                                           A120BarAgrEst ,
                                           A159BarFecGen ,
                                           Byte.valueOf(A213BarSit) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           AV32FilterFullText ,
                                           A13878PedidoClie ,
                                           A13696BarNHdr ,
                                           Integer.valueOf(A198BarPie) ,
                                           AV36TFPedidoCliente_Sel ,
                                           AV35TFPedidoCliente ,
                                           Integer.valueOf(AV67TFBarPie) ,
                                           Integer.valueOf(AV68TFBarPie_To) ,
                                           Byte.valueOf(AV88TFBarHayAlb_Sel) ,
                                           Byte.valueOf(A14502BarHayAlb) } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE
                                           }
      });
      lV41TFCliNom = GXutil.padr( GXutil.rtrim( AV41TFCliNom), 30, "%") ;
      lV59TFBarTipDis = GXutil.padr( GXutil.rtrim( AV59TFBarTipDis), 1, "%") ;
      lV43TFBarSer = GXutil.padr( GXutil.rtrim( AV43TFBarSer), 16, "%") ;
      lV45TFBarSerDsc = GXutil.padr( GXutil.rtrim( AV45TFBarSerDsc), 26, "%") ;
      lV47TFBarColNom = GXutil.padr( GXutil.rtrim( AV47TFBarColNom), 13, "%") ;
      lV61TFBarNomCli = GXutil.padr( GXutil.rtrim( AV61TFBarNomCli), 13, "%") ;
      lV65TFBarMaqCod = GXutil.padr( GXutil.rtrim( AV65TFBarMaqCod), 6, "%") ;
      lV73TFBarAcaQui = GXutil.padr( GXutil.rtrim( AV73TFBarAcaQui), 6, "%") ;
      lV77TFBarAgrEst = GXutil.padr( GXutil.rtrim( AV77TFBarAgrEst), 1, "%") ;
      /* Using cursor P09KE15 */
      pr_default.execute(6, new Object[] {Integer.valueOf(AV39TFCliCod), Integer.valueOf(AV40TFCliCod_To), lV41TFCliNom, AV42TFCliNom_Sel, lV59TFBarTipDis, AV60TFBarTipDis_Sel, lV43TFBarSer, AV44TFBarSer_Sel, lV45TFBarSerDsc, AV46TFBarSerDsc_Sel, lV47TFBarColNom, AV48TFBarColNom_Sel, Integer.valueOf(AV49TFBarColNum), Integer.valueOf(AV50TFBarColNum_To), lV61TFBarNomCli, AV62TFBarNomCli_Sel, Integer.valueOf(AV63TFBarNumCli), Integer.valueOf(AV64TFBarNumCli_To), lV65TFBarMaqCod, AV66TFBarMaqCod_Sel, AV69TFBarKgm, AV70TFBarKgm_To, AV71TFBarMtr, AV72TFBarMtr_To, lV73TFBarAcaQui, AV74TFBarAcaQui_Sel, lV77TFBarAgrEst, AV78TFBarAgrEst_Sel, AV82BarFecGenfrom, AV83BarFecGento, Byte.valueOf(AV84BarSitfrom), Byte.valueOf(AV85BarSitto), Integer.valueOf(AV79BarCodIN), Byte.valueOf(AV80BarCodreoIN), AV81BarCodparIN});
      while ( (pr_default.getStatus(6) != 101) )
      {
         brk9KE13 = false ;
         A1234BarNomCli = P09KE15_A1234BarNomCli[0] ;
         A159BarFecGen = P09KE15_A159BarFecGen[0] ;
         A120BarAgrEst = P09KE15_A120BarAgrEst[0] ;
         A118BarAcaQui = P09KE15_A118BarAcaQui[0] ;
         A180BarMaqCod = P09KE15_A180BarMaqCod[0] ;
         A213BarSit = P09KE15_A213BarSit[0] ;
         A1235BarNumCli = P09KE15_A1235BarNumCli[0] ;
         A136BarColNum = P09KE15_A136BarColNum[0] ;
         A135BarColNom = P09KE15_A135BarColNom[0] ;
         A1652BarSerDsc = P09KE15_A1652BarSerDsc[0] ;
         A212BarSer = P09KE15_A212BarSer[0] ;
         A2010BarTipDis = P09KE15_A2010BarTipDis[0] ;
         A13696BarNHdr = P09KE15_A13696BarNHdr[0] ;
         A279CliNom = P09KE15_A279CliNom[0] ;
         A252CliCod = P09KE15_A252CliCod[0] ;
         n252CliCod = P09KE15_n252CliCod[0] ;
         A184BarMtr = P09KE15_A184BarMtr[0] ;
         A166BarKgm = P09KE15_A166BarKgm[0] ;
         A143BarDisNum = P09KE15_A143BarDisNum[0] ;
         A4812BarEncCli = P09KE15_A4812BarEncCli[0] ;
         A199BarPie1 = P09KE15_A199BarPie1[0] ;
         A365DisDes = P09KE15_A365DisDes[0] ;
         A898BarPieNDes = P09KE15_A898BarPieNDes[0] ;
         A130BarCodPar = P09KE15_A130BarCodPar[0] ;
         A132BarCodReo = P09KE15_A132BarCodReo[0] ;
         A129BarCod = P09KE15_A129BarCod[0] ;
         A396EmprCod = P09KE15_A396EmprCod[0] ;
         A279CliNom = P09KE15_A279CliNom[0] ;
         A184BarMtr = P09KE15_A184BarMtr[0] ;
         A166BarKgm = P09KE15_A166BarKgm[0] ;
         A199BarPie1 = P09KE15_A199BarPie1[0] ;
         A898BarPieNDes = P09KE15_A898BarPieNDes[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_char3) ;
         hojaderuta_trnwwgetfilterdata.this.A396EmprCod = GXv_char6[0] ;
         hojaderuta_trnwwgetfilterdata.this.A4812BarEncCli = GXv_char5[0] ;
         hojaderuta_trnwwgetfilterdata.this.A143BarDisNum = GXv_char4[0] ;
         hojaderuta_trnwwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV36TFPedidoCliente_Sel)==0) && ( ! (GXutil.strcmp("", AV35TFPedidoCliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV35TFPedidoCliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV36TFPedidoCliente_Sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV36TFPedidoCliente_Sel) == 0 ) ) )
            {
               GXt_int7 = A14502BarHayAlb ;
               GXv_int8[0] = GXt_int7 ;
               new app.hayalbaransalida(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int8) ;
               hojaderuta_trnwwgetfilterdata.this.GXt_int7 = GXv_int8[0] ;
               A14502BarHayAlb = GXt_int7 ;
               if ( ( AV88TFBarHayAlb_Sel != 1 ) || ( ( A14502BarHayAlb == 1 ) ) )
               {
                  if ( ( AV88TFBarHayAlb_Sel != 2 ) || ( ( A14502BarHayAlb == 0 ) ) )
                  {
                     if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
                     {
                        A198BarPie = A898BarPieNDes ;
                     }
                     else
                     {
                        A198BarPie = A199BarPie1 ;
                     }
                     if ( (GXutil.strcmp("", AV32FilterFullText)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV32FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A2010BarTipDis) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV32FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1234BarNomCli) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1235BarNumCli, 6, 0) , GXutil.padr( "%" + AV32FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV32FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A180BarMaqCod) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A198BarPie, 6, 0) , GXutil.padr( "%" + AV32FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A166BarKgm, 9, 2) , GXutil.padr( "%" + AV32FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A184BarMtr, 9, 2) , GXutil.padr( "%" + AV32FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A118BarAcaQui) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A120BarAgrEst) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) ) )
                     {
                        if ( (0==AV67TFBarPie) || ( ( A198BarPie >= AV67TFBarPie ) ) )
                        {
                           if ( (0==AV68TFBarPie_To) || ( ( A198BarPie <= AV68TFBarPie_To ) ) )
                           {
                              AV26count = 0 ;
                              while ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(P09KE15_A1234BarNomCli[0], A1234BarNomCli) == 0 ) )
                              {
                                 brk9KE13 = false ;
                                 A130BarCodPar = P09KE15_A130BarCodPar[0] ;
                                 A132BarCodReo = P09KE15_A132BarCodReo[0] ;
                                 A129BarCod = P09KE15_A129BarCod[0] ;
                                 A396EmprCod = P09KE15_A396EmprCod[0] ;
                                 AV26count = (long)(AV26count+1) ;
                                 brk9KE13 = true ;
                                 pr_default.readNext(6);
                              }
                              if ( ! (GXutil.strcmp("", A1234BarNomCli)==0) )
                              {
                                 AV18Option = A1234BarNomCli ;
                                 AV19Options.add(AV18Option, 0);
                                 AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                              }
                              if ( AV19Options.size() == 50 )
                              {
                                 /* Exit For each command. Update data (if necessary), close cursors & exit. */
                                 if (true) break;
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
         if ( ! brk9KE13 )
         {
            brk9KE13 = true ;
            pr_default.readNext(6);
         }
      }
      pr_default.close(6);
   }

   public void S191( )
   {
      /* 'LOADBARMAQCODOPTIONS' Routine */
      returnInSub = false ;
      AV65TFBarMaqCod = AV14SearchTxt ;
      AV66TFBarMaqCod_Sel = "" ;
      pr_default.dynParam(7, new Object[]{ new Object[]{
                                           Integer.valueOf(AV39TFCliCod) ,
                                           Integer.valueOf(AV40TFCliCod_To) ,
                                           AV42TFCliNom_Sel ,
                                           AV41TFCliNom ,
                                           AV60TFBarTipDis_Sel ,
                                           AV59TFBarTipDis ,
                                           AV44TFBarSer_Sel ,
                                           AV43TFBarSer ,
                                           AV46TFBarSerDsc_Sel ,
                                           AV45TFBarSerDsc ,
                                           AV48TFBarColNom_Sel ,
                                           AV47TFBarColNom ,
                                           Integer.valueOf(AV49TFBarColNum) ,
                                           Integer.valueOf(AV50TFBarColNum_To) ,
                                           AV62TFBarNomCli_Sel ,
                                           AV61TFBarNomCli ,
                                           Integer.valueOf(AV63TFBarNumCli) ,
                                           Integer.valueOf(AV64TFBarNumCli_To) ,
                                           AV66TFBarMaqCod_Sel ,
                                           AV65TFBarMaqCod ,
                                           AV69TFBarKgm ,
                                           AV70TFBarKgm_To ,
                                           AV71TFBarMtr ,
                                           AV72TFBarMtr_To ,
                                           AV74TFBarAcaQui_Sel ,
                                           AV73TFBarAcaQui ,
                                           AV78TFBarAgrEst_Sel ,
                                           AV77TFBarAgrEst ,
                                           AV82BarFecGenfrom ,
                                           AV83BarFecGento ,
                                           Byte.valueOf(AV84BarSitfrom) ,
                                           Byte.valueOf(AV85BarSitto) ,
                                           Integer.valueOf(AV79BarCodIN) ,
                                           Byte.valueOf(AV80BarCodreoIN) ,
                                           AV81BarCodparIN ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A2010BarTipDis ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           Integer.valueOf(A1235BarNumCli) ,
                                           A180BarMaqCod ,
                                           A166BarKgm ,
                                           A184BarMtr ,
                                           A118BarAcaQui ,
                                           A120BarAgrEst ,
                                           A159BarFecGen ,
                                           Byte.valueOf(A213BarSit) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           AV32FilterFullText ,
                                           A13878PedidoClie ,
                                           A13696BarNHdr ,
                                           Integer.valueOf(A198BarPie) ,
                                           AV36TFPedidoCliente_Sel ,
                                           AV35TFPedidoCliente ,
                                           Integer.valueOf(AV67TFBarPie) ,
                                           Integer.valueOf(AV68TFBarPie_To) ,
                                           Byte.valueOf(AV88TFBarHayAlb_Sel) ,
                                           Byte.valueOf(A14502BarHayAlb) } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE
                                           }
      });
      lV41TFCliNom = GXutil.padr( GXutil.rtrim( AV41TFCliNom), 30, "%") ;
      lV59TFBarTipDis = GXutil.padr( GXutil.rtrim( AV59TFBarTipDis), 1, "%") ;
      lV43TFBarSer = GXutil.padr( GXutil.rtrim( AV43TFBarSer), 16, "%") ;
      lV45TFBarSerDsc = GXutil.padr( GXutil.rtrim( AV45TFBarSerDsc), 26, "%") ;
      lV47TFBarColNom = GXutil.padr( GXutil.rtrim( AV47TFBarColNom), 13, "%") ;
      lV61TFBarNomCli = GXutil.padr( GXutil.rtrim( AV61TFBarNomCli), 13, "%") ;
      lV65TFBarMaqCod = GXutil.padr( GXutil.rtrim( AV65TFBarMaqCod), 6, "%") ;
      lV73TFBarAcaQui = GXutil.padr( GXutil.rtrim( AV73TFBarAcaQui), 6, "%") ;
      lV77TFBarAgrEst = GXutil.padr( GXutil.rtrim( AV77TFBarAgrEst), 1, "%") ;
      /* Using cursor P09KE17 */
      pr_default.execute(7, new Object[] {Integer.valueOf(AV39TFCliCod), Integer.valueOf(AV40TFCliCod_To), lV41TFCliNom, AV42TFCliNom_Sel, lV59TFBarTipDis, AV60TFBarTipDis_Sel, lV43TFBarSer, AV44TFBarSer_Sel, lV45TFBarSerDsc, AV46TFBarSerDsc_Sel, lV47TFBarColNom, AV48TFBarColNom_Sel, Integer.valueOf(AV49TFBarColNum), Integer.valueOf(AV50TFBarColNum_To), lV61TFBarNomCli, AV62TFBarNomCli_Sel, Integer.valueOf(AV63TFBarNumCli), Integer.valueOf(AV64TFBarNumCli_To), lV65TFBarMaqCod, AV66TFBarMaqCod_Sel, AV69TFBarKgm, AV70TFBarKgm_To, AV71TFBarMtr, AV72TFBarMtr_To, lV73TFBarAcaQui, AV74TFBarAcaQui_Sel, lV77TFBarAgrEst, AV78TFBarAgrEst_Sel, AV82BarFecGenfrom, AV83BarFecGento, Byte.valueOf(AV84BarSitfrom), Byte.valueOf(AV85BarSitto), Integer.valueOf(AV79BarCodIN), Byte.valueOf(AV80BarCodreoIN), AV81BarCodparIN});
      while ( (pr_default.getStatus(7) != 101) )
      {
         brk9KE15 = false ;
         A180BarMaqCod = P09KE17_A180BarMaqCod[0] ;
         A159BarFecGen = P09KE17_A159BarFecGen[0] ;
         A120BarAgrEst = P09KE17_A120BarAgrEst[0] ;
         A118BarAcaQui = P09KE17_A118BarAcaQui[0] ;
         A213BarSit = P09KE17_A213BarSit[0] ;
         A1235BarNumCli = P09KE17_A1235BarNumCli[0] ;
         A1234BarNomCli = P09KE17_A1234BarNomCli[0] ;
         A136BarColNum = P09KE17_A136BarColNum[0] ;
         A135BarColNom = P09KE17_A135BarColNom[0] ;
         A1652BarSerDsc = P09KE17_A1652BarSerDsc[0] ;
         A212BarSer = P09KE17_A212BarSer[0] ;
         A2010BarTipDis = P09KE17_A2010BarTipDis[0] ;
         A13696BarNHdr = P09KE17_A13696BarNHdr[0] ;
         A279CliNom = P09KE17_A279CliNom[0] ;
         A252CliCod = P09KE17_A252CliCod[0] ;
         n252CliCod = P09KE17_n252CliCod[0] ;
         A184BarMtr = P09KE17_A184BarMtr[0] ;
         A166BarKgm = P09KE17_A166BarKgm[0] ;
         A143BarDisNum = P09KE17_A143BarDisNum[0] ;
         A4812BarEncCli = P09KE17_A4812BarEncCli[0] ;
         A199BarPie1 = P09KE17_A199BarPie1[0] ;
         A365DisDes = P09KE17_A365DisDes[0] ;
         A898BarPieNDes = P09KE17_A898BarPieNDes[0] ;
         A130BarCodPar = P09KE17_A130BarCodPar[0] ;
         A132BarCodReo = P09KE17_A132BarCodReo[0] ;
         A129BarCod = P09KE17_A129BarCod[0] ;
         A396EmprCod = P09KE17_A396EmprCod[0] ;
         A279CliNom = P09KE17_A279CliNom[0] ;
         A184BarMtr = P09KE17_A184BarMtr[0] ;
         A166BarKgm = P09KE17_A166BarKgm[0] ;
         A199BarPie1 = P09KE17_A199BarPie1[0] ;
         A898BarPieNDes = P09KE17_A898BarPieNDes[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_char3) ;
         hojaderuta_trnwwgetfilterdata.this.A396EmprCod = GXv_char6[0] ;
         hojaderuta_trnwwgetfilterdata.this.A4812BarEncCli = GXv_char5[0] ;
         hojaderuta_trnwwgetfilterdata.this.A143BarDisNum = GXv_char4[0] ;
         hojaderuta_trnwwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV36TFPedidoCliente_Sel)==0) && ( ! (GXutil.strcmp("", AV35TFPedidoCliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV35TFPedidoCliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV36TFPedidoCliente_Sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV36TFPedidoCliente_Sel) == 0 ) ) )
            {
               GXt_int7 = A14502BarHayAlb ;
               GXv_int8[0] = GXt_int7 ;
               new app.hayalbaransalida(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int8) ;
               hojaderuta_trnwwgetfilterdata.this.GXt_int7 = GXv_int8[0] ;
               A14502BarHayAlb = GXt_int7 ;
               if ( ( AV88TFBarHayAlb_Sel != 1 ) || ( ( A14502BarHayAlb == 1 ) ) )
               {
                  if ( ( AV88TFBarHayAlb_Sel != 2 ) || ( ( A14502BarHayAlb == 0 ) ) )
                  {
                     if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
                     {
                        A198BarPie = A898BarPieNDes ;
                     }
                     else
                     {
                        A198BarPie = A199BarPie1 ;
                     }
                     if ( (GXutil.strcmp("", AV32FilterFullText)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV32FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A2010BarTipDis) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV32FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1234BarNomCli) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1235BarNumCli, 6, 0) , GXutil.padr( "%" + AV32FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV32FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A180BarMaqCod) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A198BarPie, 6, 0) , GXutil.padr( "%" + AV32FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A166BarKgm, 9, 2) , GXutil.padr( "%" + AV32FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A184BarMtr, 9, 2) , GXutil.padr( "%" + AV32FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A118BarAcaQui) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A120BarAgrEst) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) ) )
                     {
                        if ( (0==AV67TFBarPie) || ( ( A198BarPie >= AV67TFBarPie ) ) )
                        {
                           if ( (0==AV68TFBarPie_To) || ( ( A198BarPie <= AV68TFBarPie_To ) ) )
                           {
                              AV26count = 0 ;
                              while ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(P09KE17_A180BarMaqCod[0], A180BarMaqCod) == 0 ) )
                              {
                                 brk9KE15 = false ;
                                 A130BarCodPar = P09KE17_A130BarCodPar[0] ;
                                 A132BarCodReo = P09KE17_A132BarCodReo[0] ;
                                 A129BarCod = P09KE17_A129BarCod[0] ;
                                 A396EmprCod = P09KE17_A396EmprCod[0] ;
                                 AV26count = (long)(AV26count+1) ;
                                 brk9KE15 = true ;
                                 pr_default.readNext(7);
                              }
                              if ( ! (GXutil.strcmp("", A180BarMaqCod)==0) )
                              {
                                 AV18Option = A180BarMaqCod ;
                                 AV19Options.add(AV18Option, 0);
                                 AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                              }
                              if ( AV19Options.size() == 50 )
                              {
                                 /* Exit For each command. Update data (if necessary), close cursors & exit. */
                                 if (true) break;
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
         if ( ! brk9KE15 )
         {
            brk9KE15 = true ;
            pr_default.readNext(7);
         }
      }
      pr_default.close(7);
   }

   public void S201( )
   {
      /* 'LOADBARACAQUIOPTIONS' Routine */
      returnInSub = false ;
      AV73TFBarAcaQui = AV14SearchTxt ;
      AV74TFBarAcaQui_Sel = "" ;
      pr_default.dynParam(8, new Object[]{ new Object[]{
                                           Integer.valueOf(AV39TFCliCod) ,
                                           Integer.valueOf(AV40TFCliCod_To) ,
                                           AV42TFCliNom_Sel ,
                                           AV41TFCliNom ,
                                           AV60TFBarTipDis_Sel ,
                                           AV59TFBarTipDis ,
                                           AV44TFBarSer_Sel ,
                                           AV43TFBarSer ,
                                           AV46TFBarSerDsc_Sel ,
                                           AV45TFBarSerDsc ,
                                           AV48TFBarColNom_Sel ,
                                           AV47TFBarColNom ,
                                           Integer.valueOf(AV49TFBarColNum) ,
                                           Integer.valueOf(AV50TFBarColNum_To) ,
                                           AV62TFBarNomCli_Sel ,
                                           AV61TFBarNomCli ,
                                           Integer.valueOf(AV63TFBarNumCli) ,
                                           Integer.valueOf(AV64TFBarNumCli_To) ,
                                           AV66TFBarMaqCod_Sel ,
                                           AV65TFBarMaqCod ,
                                           AV69TFBarKgm ,
                                           AV70TFBarKgm_To ,
                                           AV71TFBarMtr ,
                                           AV72TFBarMtr_To ,
                                           AV74TFBarAcaQui_Sel ,
                                           AV73TFBarAcaQui ,
                                           AV78TFBarAgrEst_Sel ,
                                           AV77TFBarAgrEst ,
                                           AV82BarFecGenfrom ,
                                           AV83BarFecGento ,
                                           Byte.valueOf(AV84BarSitfrom) ,
                                           Byte.valueOf(AV85BarSitto) ,
                                           Integer.valueOf(AV79BarCodIN) ,
                                           Byte.valueOf(AV80BarCodreoIN) ,
                                           AV81BarCodparIN ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A2010BarTipDis ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           Integer.valueOf(A1235BarNumCli) ,
                                           A180BarMaqCod ,
                                           A166BarKgm ,
                                           A184BarMtr ,
                                           A118BarAcaQui ,
                                           A120BarAgrEst ,
                                           A159BarFecGen ,
                                           Byte.valueOf(A213BarSit) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           AV32FilterFullText ,
                                           A13878PedidoClie ,
                                           A13696BarNHdr ,
                                           Integer.valueOf(A198BarPie) ,
                                           AV36TFPedidoCliente_Sel ,
                                           AV35TFPedidoCliente ,
                                           Integer.valueOf(AV67TFBarPie) ,
                                           Integer.valueOf(AV68TFBarPie_To) ,
                                           Byte.valueOf(AV88TFBarHayAlb_Sel) ,
                                           Byte.valueOf(A14502BarHayAlb) } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE
                                           }
      });
      lV41TFCliNom = GXutil.padr( GXutil.rtrim( AV41TFCliNom), 30, "%") ;
      lV59TFBarTipDis = GXutil.padr( GXutil.rtrim( AV59TFBarTipDis), 1, "%") ;
      lV43TFBarSer = GXutil.padr( GXutil.rtrim( AV43TFBarSer), 16, "%") ;
      lV45TFBarSerDsc = GXutil.padr( GXutil.rtrim( AV45TFBarSerDsc), 26, "%") ;
      lV47TFBarColNom = GXutil.padr( GXutil.rtrim( AV47TFBarColNom), 13, "%") ;
      lV61TFBarNomCli = GXutil.padr( GXutil.rtrim( AV61TFBarNomCli), 13, "%") ;
      lV65TFBarMaqCod = GXutil.padr( GXutil.rtrim( AV65TFBarMaqCod), 6, "%") ;
      lV73TFBarAcaQui = GXutil.padr( GXutil.rtrim( AV73TFBarAcaQui), 6, "%") ;
      lV77TFBarAgrEst = GXutil.padr( GXutil.rtrim( AV77TFBarAgrEst), 1, "%") ;
      /* Using cursor P09KE19 */
      pr_default.execute(8, new Object[] {Integer.valueOf(AV39TFCliCod), Integer.valueOf(AV40TFCliCod_To), lV41TFCliNom, AV42TFCliNom_Sel, lV59TFBarTipDis, AV60TFBarTipDis_Sel, lV43TFBarSer, AV44TFBarSer_Sel, lV45TFBarSerDsc, AV46TFBarSerDsc_Sel, lV47TFBarColNom, AV48TFBarColNom_Sel, Integer.valueOf(AV49TFBarColNum), Integer.valueOf(AV50TFBarColNum_To), lV61TFBarNomCli, AV62TFBarNomCli_Sel, Integer.valueOf(AV63TFBarNumCli), Integer.valueOf(AV64TFBarNumCli_To), lV65TFBarMaqCod, AV66TFBarMaqCod_Sel, AV69TFBarKgm, AV70TFBarKgm_To, AV71TFBarMtr, AV72TFBarMtr_To, lV73TFBarAcaQui, AV74TFBarAcaQui_Sel, lV77TFBarAgrEst, AV78TFBarAgrEst_Sel, AV82BarFecGenfrom, AV83BarFecGento, Byte.valueOf(AV84BarSitfrom), Byte.valueOf(AV85BarSitto), Integer.valueOf(AV79BarCodIN), Byte.valueOf(AV80BarCodreoIN), AV81BarCodparIN});
      while ( (pr_default.getStatus(8) != 101) )
      {
         brk9KE17 = false ;
         A118BarAcaQui = P09KE19_A118BarAcaQui[0] ;
         A159BarFecGen = P09KE19_A159BarFecGen[0] ;
         A120BarAgrEst = P09KE19_A120BarAgrEst[0] ;
         A180BarMaqCod = P09KE19_A180BarMaqCod[0] ;
         A213BarSit = P09KE19_A213BarSit[0] ;
         A1235BarNumCli = P09KE19_A1235BarNumCli[0] ;
         A1234BarNomCli = P09KE19_A1234BarNomCli[0] ;
         A136BarColNum = P09KE19_A136BarColNum[0] ;
         A135BarColNom = P09KE19_A135BarColNom[0] ;
         A1652BarSerDsc = P09KE19_A1652BarSerDsc[0] ;
         A212BarSer = P09KE19_A212BarSer[0] ;
         A2010BarTipDis = P09KE19_A2010BarTipDis[0] ;
         A13696BarNHdr = P09KE19_A13696BarNHdr[0] ;
         A279CliNom = P09KE19_A279CliNom[0] ;
         A252CliCod = P09KE19_A252CliCod[0] ;
         n252CliCod = P09KE19_n252CliCod[0] ;
         A184BarMtr = P09KE19_A184BarMtr[0] ;
         A166BarKgm = P09KE19_A166BarKgm[0] ;
         A143BarDisNum = P09KE19_A143BarDisNum[0] ;
         A4812BarEncCli = P09KE19_A4812BarEncCli[0] ;
         A199BarPie1 = P09KE19_A199BarPie1[0] ;
         A365DisDes = P09KE19_A365DisDes[0] ;
         A898BarPieNDes = P09KE19_A898BarPieNDes[0] ;
         A130BarCodPar = P09KE19_A130BarCodPar[0] ;
         A132BarCodReo = P09KE19_A132BarCodReo[0] ;
         A129BarCod = P09KE19_A129BarCod[0] ;
         A396EmprCod = P09KE19_A396EmprCod[0] ;
         A279CliNom = P09KE19_A279CliNom[0] ;
         A184BarMtr = P09KE19_A184BarMtr[0] ;
         A166BarKgm = P09KE19_A166BarKgm[0] ;
         A199BarPie1 = P09KE19_A199BarPie1[0] ;
         A898BarPieNDes = P09KE19_A898BarPieNDes[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_char3) ;
         hojaderuta_trnwwgetfilterdata.this.A396EmprCod = GXv_char6[0] ;
         hojaderuta_trnwwgetfilterdata.this.A4812BarEncCli = GXv_char5[0] ;
         hojaderuta_trnwwgetfilterdata.this.A143BarDisNum = GXv_char4[0] ;
         hojaderuta_trnwwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV36TFPedidoCliente_Sel)==0) && ( ! (GXutil.strcmp("", AV35TFPedidoCliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV35TFPedidoCliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV36TFPedidoCliente_Sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV36TFPedidoCliente_Sel) == 0 ) ) )
            {
               GXt_int7 = A14502BarHayAlb ;
               GXv_int8[0] = GXt_int7 ;
               new app.hayalbaransalida(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int8) ;
               hojaderuta_trnwwgetfilterdata.this.GXt_int7 = GXv_int8[0] ;
               A14502BarHayAlb = GXt_int7 ;
               if ( ( AV88TFBarHayAlb_Sel != 1 ) || ( ( A14502BarHayAlb == 1 ) ) )
               {
                  if ( ( AV88TFBarHayAlb_Sel != 2 ) || ( ( A14502BarHayAlb == 0 ) ) )
                  {
                     if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
                     {
                        A198BarPie = A898BarPieNDes ;
                     }
                     else
                     {
                        A198BarPie = A199BarPie1 ;
                     }
                     if ( (GXutil.strcmp("", AV32FilterFullText)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV32FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A2010BarTipDis) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV32FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1234BarNomCli) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1235BarNumCli, 6, 0) , GXutil.padr( "%" + AV32FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV32FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A180BarMaqCod) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A198BarPie, 6, 0) , GXutil.padr( "%" + AV32FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A166BarKgm, 9, 2) , GXutil.padr( "%" + AV32FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A184BarMtr, 9, 2) , GXutil.padr( "%" + AV32FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A118BarAcaQui) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A120BarAgrEst) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) ) )
                     {
                        if ( (0==AV67TFBarPie) || ( ( A198BarPie >= AV67TFBarPie ) ) )
                        {
                           if ( (0==AV68TFBarPie_To) || ( ( A198BarPie <= AV68TFBarPie_To ) ) )
                           {
                              AV26count = 0 ;
                              while ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(P09KE19_A118BarAcaQui[0], A118BarAcaQui) == 0 ) )
                              {
                                 brk9KE17 = false ;
                                 A130BarCodPar = P09KE19_A130BarCodPar[0] ;
                                 A132BarCodReo = P09KE19_A132BarCodReo[0] ;
                                 A129BarCod = P09KE19_A129BarCod[0] ;
                                 A396EmprCod = P09KE19_A396EmprCod[0] ;
                                 AV26count = (long)(AV26count+1) ;
                                 brk9KE17 = true ;
                                 pr_default.readNext(8);
                              }
                              if ( ! (GXutil.strcmp("", A118BarAcaQui)==0) )
                              {
                                 AV18Option = A118BarAcaQui ;
                                 AV19Options.add(AV18Option, 0);
                                 AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                              }
                              if ( AV19Options.size() == 50 )
                              {
                                 /* Exit For each command. Update data (if necessary), close cursors & exit. */
                                 if (true) break;
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
         if ( ! brk9KE17 )
         {
            brk9KE17 = true ;
            pr_default.readNext(8);
         }
      }
      pr_default.close(8);
   }

   public void S211( )
   {
      /* 'LOADBARAGRESTOPTIONS' Routine */
      returnInSub = false ;
      AV77TFBarAgrEst = AV14SearchTxt ;
      AV78TFBarAgrEst_Sel = "" ;
      pr_default.dynParam(9, new Object[]{ new Object[]{
                                           Integer.valueOf(AV39TFCliCod) ,
                                           Integer.valueOf(AV40TFCliCod_To) ,
                                           AV42TFCliNom_Sel ,
                                           AV41TFCliNom ,
                                           AV60TFBarTipDis_Sel ,
                                           AV59TFBarTipDis ,
                                           AV44TFBarSer_Sel ,
                                           AV43TFBarSer ,
                                           AV46TFBarSerDsc_Sel ,
                                           AV45TFBarSerDsc ,
                                           AV48TFBarColNom_Sel ,
                                           AV47TFBarColNom ,
                                           Integer.valueOf(AV49TFBarColNum) ,
                                           Integer.valueOf(AV50TFBarColNum_To) ,
                                           AV62TFBarNomCli_Sel ,
                                           AV61TFBarNomCli ,
                                           Integer.valueOf(AV63TFBarNumCli) ,
                                           Integer.valueOf(AV64TFBarNumCli_To) ,
                                           AV66TFBarMaqCod_Sel ,
                                           AV65TFBarMaqCod ,
                                           AV69TFBarKgm ,
                                           AV70TFBarKgm_To ,
                                           AV71TFBarMtr ,
                                           AV72TFBarMtr_To ,
                                           AV74TFBarAcaQui_Sel ,
                                           AV73TFBarAcaQui ,
                                           AV78TFBarAgrEst_Sel ,
                                           AV77TFBarAgrEst ,
                                           AV82BarFecGenfrom ,
                                           AV83BarFecGento ,
                                           Byte.valueOf(AV84BarSitfrom) ,
                                           Byte.valueOf(AV85BarSitto) ,
                                           Integer.valueOf(AV79BarCodIN) ,
                                           Byte.valueOf(AV80BarCodreoIN) ,
                                           AV81BarCodparIN ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A2010BarTipDis ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           Integer.valueOf(A1235BarNumCli) ,
                                           A180BarMaqCod ,
                                           A166BarKgm ,
                                           A184BarMtr ,
                                           A118BarAcaQui ,
                                           A120BarAgrEst ,
                                           A159BarFecGen ,
                                           Byte.valueOf(A213BarSit) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           AV32FilterFullText ,
                                           A13878PedidoClie ,
                                           A13696BarNHdr ,
                                           Integer.valueOf(A198BarPie) ,
                                           AV36TFPedidoCliente_Sel ,
                                           AV35TFPedidoCliente ,
                                           Integer.valueOf(AV67TFBarPie) ,
                                           Integer.valueOf(AV68TFBarPie_To) ,
                                           Byte.valueOf(AV88TFBarHayAlb_Sel) ,
                                           Byte.valueOf(A14502BarHayAlb) } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE
                                           }
      });
      lV41TFCliNom = GXutil.padr( GXutil.rtrim( AV41TFCliNom), 30, "%") ;
      lV59TFBarTipDis = GXutil.padr( GXutil.rtrim( AV59TFBarTipDis), 1, "%") ;
      lV43TFBarSer = GXutil.padr( GXutil.rtrim( AV43TFBarSer), 16, "%") ;
      lV45TFBarSerDsc = GXutil.padr( GXutil.rtrim( AV45TFBarSerDsc), 26, "%") ;
      lV47TFBarColNom = GXutil.padr( GXutil.rtrim( AV47TFBarColNom), 13, "%") ;
      lV61TFBarNomCli = GXutil.padr( GXutil.rtrim( AV61TFBarNomCli), 13, "%") ;
      lV65TFBarMaqCod = GXutil.padr( GXutil.rtrim( AV65TFBarMaqCod), 6, "%") ;
      lV73TFBarAcaQui = GXutil.padr( GXutil.rtrim( AV73TFBarAcaQui), 6, "%") ;
      lV77TFBarAgrEst = GXutil.padr( GXutil.rtrim( AV77TFBarAgrEst), 1, "%") ;
      /* Using cursor P09KE21 */
      pr_default.execute(9, new Object[] {Integer.valueOf(AV39TFCliCod), Integer.valueOf(AV40TFCliCod_To), lV41TFCliNom, AV42TFCliNom_Sel, lV59TFBarTipDis, AV60TFBarTipDis_Sel, lV43TFBarSer, AV44TFBarSer_Sel, lV45TFBarSerDsc, AV46TFBarSerDsc_Sel, lV47TFBarColNom, AV48TFBarColNom_Sel, Integer.valueOf(AV49TFBarColNum), Integer.valueOf(AV50TFBarColNum_To), lV61TFBarNomCli, AV62TFBarNomCli_Sel, Integer.valueOf(AV63TFBarNumCli), Integer.valueOf(AV64TFBarNumCli_To), lV65TFBarMaqCod, AV66TFBarMaqCod_Sel, AV69TFBarKgm, AV70TFBarKgm_To, AV71TFBarMtr, AV72TFBarMtr_To, lV73TFBarAcaQui, AV74TFBarAcaQui_Sel, lV77TFBarAgrEst, AV78TFBarAgrEst_Sel, AV82BarFecGenfrom, AV83BarFecGento, Byte.valueOf(AV84BarSitfrom), Byte.valueOf(AV85BarSitto), Integer.valueOf(AV79BarCodIN), Byte.valueOf(AV80BarCodreoIN), AV81BarCodparIN});
      while ( (pr_default.getStatus(9) != 101) )
      {
         brk9KE19 = false ;
         A120BarAgrEst = P09KE21_A120BarAgrEst[0] ;
         A159BarFecGen = P09KE21_A159BarFecGen[0] ;
         A118BarAcaQui = P09KE21_A118BarAcaQui[0] ;
         A180BarMaqCod = P09KE21_A180BarMaqCod[0] ;
         A213BarSit = P09KE21_A213BarSit[0] ;
         A1235BarNumCli = P09KE21_A1235BarNumCli[0] ;
         A1234BarNomCli = P09KE21_A1234BarNomCli[0] ;
         A136BarColNum = P09KE21_A136BarColNum[0] ;
         A135BarColNom = P09KE21_A135BarColNom[0] ;
         A1652BarSerDsc = P09KE21_A1652BarSerDsc[0] ;
         A212BarSer = P09KE21_A212BarSer[0] ;
         A2010BarTipDis = P09KE21_A2010BarTipDis[0] ;
         A13696BarNHdr = P09KE21_A13696BarNHdr[0] ;
         A279CliNom = P09KE21_A279CliNom[0] ;
         A252CliCod = P09KE21_A252CliCod[0] ;
         n252CliCod = P09KE21_n252CliCod[0] ;
         A184BarMtr = P09KE21_A184BarMtr[0] ;
         A166BarKgm = P09KE21_A166BarKgm[0] ;
         A143BarDisNum = P09KE21_A143BarDisNum[0] ;
         A4812BarEncCli = P09KE21_A4812BarEncCli[0] ;
         A199BarPie1 = P09KE21_A199BarPie1[0] ;
         A365DisDes = P09KE21_A365DisDes[0] ;
         A898BarPieNDes = P09KE21_A898BarPieNDes[0] ;
         A130BarCodPar = P09KE21_A130BarCodPar[0] ;
         A132BarCodReo = P09KE21_A132BarCodReo[0] ;
         A129BarCod = P09KE21_A129BarCod[0] ;
         A396EmprCod = P09KE21_A396EmprCod[0] ;
         A279CliNom = P09KE21_A279CliNom[0] ;
         A184BarMtr = P09KE21_A184BarMtr[0] ;
         A166BarKgm = P09KE21_A166BarKgm[0] ;
         A199BarPie1 = P09KE21_A199BarPie1[0] ;
         A898BarPieNDes = P09KE21_A898BarPieNDes[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_char3) ;
         hojaderuta_trnwwgetfilterdata.this.A396EmprCod = GXv_char6[0] ;
         hojaderuta_trnwwgetfilterdata.this.A4812BarEncCli = GXv_char5[0] ;
         hojaderuta_trnwwgetfilterdata.this.A143BarDisNum = GXv_char4[0] ;
         hojaderuta_trnwwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV36TFPedidoCliente_Sel)==0) && ( ! (GXutil.strcmp("", AV35TFPedidoCliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV35TFPedidoCliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV36TFPedidoCliente_Sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV36TFPedidoCliente_Sel) == 0 ) ) )
            {
               GXt_int7 = A14502BarHayAlb ;
               GXv_int8[0] = GXt_int7 ;
               new app.hayalbaransalida(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int8) ;
               hojaderuta_trnwwgetfilterdata.this.GXt_int7 = GXv_int8[0] ;
               A14502BarHayAlb = GXt_int7 ;
               if ( ( AV88TFBarHayAlb_Sel != 1 ) || ( ( A14502BarHayAlb == 1 ) ) )
               {
                  if ( ( AV88TFBarHayAlb_Sel != 2 ) || ( ( A14502BarHayAlb == 0 ) ) )
                  {
                     if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
                     {
                        A198BarPie = A898BarPieNDes ;
                     }
                     else
                     {
                        A198BarPie = A199BarPie1 ;
                     }
                     if ( (GXutil.strcmp("", AV32FilterFullText)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV32FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A2010BarTipDis) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV32FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1234BarNomCli) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1235BarNumCli, 6, 0) , GXutil.padr( "%" + AV32FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV32FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A180BarMaqCod) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A198BarPie, 6, 0) , GXutil.padr( "%" + AV32FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A166BarKgm, 9, 2) , GXutil.padr( "%" + AV32FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A184BarMtr, 9, 2) , GXutil.padr( "%" + AV32FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A118BarAcaQui) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A120BarAgrEst) , GXutil.padr( "%" + GXutil.upper( AV32FilterFullText) , 255 , "%"),  ' ' ) ) ) )
                     {
                        if ( (0==AV67TFBarPie) || ( ( A198BarPie >= AV67TFBarPie ) ) )
                        {
                           if ( (0==AV68TFBarPie_To) || ( ( A198BarPie <= AV68TFBarPie_To ) ) )
                           {
                              AV26count = 0 ;
                              while ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(P09KE21_A120BarAgrEst[0], A120BarAgrEst) == 0 ) )
                              {
                                 brk9KE19 = false ;
                                 A130BarCodPar = P09KE21_A130BarCodPar[0] ;
                                 A132BarCodReo = P09KE21_A132BarCodReo[0] ;
                                 A129BarCod = P09KE21_A129BarCod[0] ;
                                 A396EmprCod = P09KE21_A396EmprCod[0] ;
                                 AV26count = (long)(AV26count+1) ;
                                 brk9KE19 = true ;
                                 pr_default.readNext(9);
                              }
                              if ( ! (GXutil.strcmp("", A120BarAgrEst)==0) )
                              {
                                 AV18Option = A120BarAgrEst ;
                                 AV21OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A120BarAgrEst, "@!"))) ;
                                 AV19Options.add(AV18Option, 0);
                                 AV22OptionsDesc.add(AV21OptionDesc, 0);
                                 AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                              }
                              if ( AV19Options.size() == 50 )
                              {
                                 /* Exit For each command. Update data (if necessary), close cursors & exit. */
                                 if (true) break;
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
         if ( ! brk9KE19 )
         {
            brk9KE19 = true ;
            pr_default.readNext(9);
         }
      }
      pr_default.close(9);
   }

   protected void cleanup( )
   {
      this.aP3[0] = hojaderuta_trnwwgetfilterdata.this.AV20OptionsJson;
      this.aP4[0] = hojaderuta_trnwwgetfilterdata.this.AV23OptionsDescJson;
      this.aP5[0] = hojaderuta_trnwwgetfilterdata.this.AV25OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV20OptionsJson = "" ;
      AV23OptionsDescJson = "" ;
      AV25OptionIndexesJson = "" ;
      AV19Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV22OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV24OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV27Session = httpContext.getWebSession();
      AV29GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV30GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV32FilterFullText = "" ;
      AV41TFCliNom = "" ;
      AV42TFCliNom_Sel = "" ;
      AV35TFPedidoCliente = "" ;
      AV36TFPedidoCliente_Sel = "" ;
      AV59TFBarTipDis = "" ;
      AV60TFBarTipDis_Sel = "" ;
      AV43TFBarSer = "" ;
      AV44TFBarSer_Sel = "" ;
      AV45TFBarSerDsc = "" ;
      AV46TFBarSerDsc_Sel = "" ;
      AV47TFBarColNom = "" ;
      AV48TFBarColNom_Sel = "" ;
      AV61TFBarNomCli = "" ;
      AV62TFBarNomCli_Sel = "" ;
      AV65TFBarMaqCod = "" ;
      AV66TFBarMaqCod_Sel = "" ;
      AV69TFBarKgm = DecimalUtil.ZERO ;
      AV70TFBarKgm_To = DecimalUtil.ZERO ;
      AV71TFBarMtr = DecimalUtil.ZERO ;
      AV72TFBarMtr_To = DecimalUtil.ZERO ;
      AV73TFBarAcaQui = "" ;
      AV74TFBarAcaQui_Sel = "" ;
      AV77TFBarAgrEst = "" ;
      AV78TFBarAgrEst_Sel = "" ;
      lV32FilterFullText = "" ;
      scmdbuf = "" ;
      lV41TFCliNom = "" ;
      lV59TFBarTipDis = "" ;
      lV43TFBarSer = "" ;
      lV45TFBarSerDsc = "" ;
      lV47TFBarColNom = "" ;
      lV61TFBarNomCli = "" ;
      lV65TFBarMaqCod = "" ;
      lV73TFBarAcaQui = "" ;
      lV77TFBarAgrEst = "" ;
      AV82BarFecGenfrom = GXutil.nullDate() ;
      AV83BarFecGento = GXutil.nullDate() ;
      AV81BarCodparIN = "" ;
      A279CliNom = "" ;
      A2010BarTipDis = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A180BarMaqCod = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A118BarAcaQui = "" ;
      A120BarAgrEst = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A130BarCodPar = "" ;
      A13878PedidoClie = "" ;
      A13696BarNHdr = "" ;
      P09KE3_A279CliNom = new String[] {""} ;
      P09KE3_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P09KE3_A120BarAgrEst = new String[] {""} ;
      P09KE3_A118BarAcaQui = new String[] {""} ;
      P09KE3_A180BarMaqCod = new String[] {""} ;
      P09KE3_A213BarSit = new byte[1] ;
      P09KE3_A1235BarNumCli = new int[1] ;
      P09KE3_A1234BarNomCli = new String[] {""} ;
      P09KE3_A136BarColNum = new int[1] ;
      P09KE3_A135BarColNom = new String[] {""} ;
      P09KE3_A1652BarSerDsc = new String[] {""} ;
      P09KE3_A212BarSer = new String[] {""} ;
      P09KE3_A2010BarTipDis = new String[] {""} ;
      P09KE3_A13696BarNHdr = new String[] {""} ;
      P09KE3_A252CliCod = new int[1] ;
      P09KE3_n252CliCod = new boolean[] {false} ;
      P09KE3_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09KE3_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09KE3_A143BarDisNum = new String[] {""} ;
      P09KE3_A4812BarEncCli = new String[] {""} ;
      P09KE3_A199BarPie1 = new short[1] ;
      P09KE3_A365DisDes = new String[] {""} ;
      P09KE3_A898BarPieNDes = new int[1] ;
      P09KE3_A130BarCodPar = new String[] {""} ;
      P09KE3_A132BarCodReo = new byte[1] ;
      P09KE3_A129BarCod = new int[1] ;
      P09KE3_A396EmprCod = new String[] {""} ;
      A143BarDisNum = "" ;
      A4812BarEncCli = "" ;
      A365DisDes = "" ;
      A396EmprCod = "" ;
      AV18Option = "" ;
      P09KE5_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P09KE5_A120BarAgrEst = new String[] {""} ;
      P09KE5_A118BarAcaQui = new String[] {""} ;
      P09KE5_A180BarMaqCod = new String[] {""} ;
      P09KE5_A213BarSit = new byte[1] ;
      P09KE5_A1235BarNumCli = new int[1] ;
      P09KE5_A1234BarNomCli = new String[] {""} ;
      P09KE5_A136BarColNum = new int[1] ;
      P09KE5_A135BarColNom = new String[] {""} ;
      P09KE5_A1652BarSerDsc = new String[] {""} ;
      P09KE5_A212BarSer = new String[] {""} ;
      P09KE5_A2010BarTipDis = new String[] {""} ;
      P09KE5_A13696BarNHdr = new String[] {""} ;
      P09KE5_A279CliNom = new String[] {""} ;
      P09KE5_A252CliCod = new int[1] ;
      P09KE5_n252CliCod = new boolean[] {false} ;
      P09KE5_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09KE5_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09KE5_A143BarDisNum = new String[] {""} ;
      P09KE5_A4812BarEncCli = new String[] {""} ;
      P09KE5_A199BarPie1 = new short[1] ;
      P09KE5_A365DisDes = new String[] {""} ;
      P09KE5_A898BarPieNDes = new int[1] ;
      P09KE5_A130BarCodPar = new String[] {""} ;
      P09KE5_A132BarCodReo = new byte[1] ;
      P09KE5_A129BarCod = new int[1] ;
      P09KE5_A396EmprCod = new String[] {""} ;
      P09KE7_A2010BarTipDis = new String[] {""} ;
      P09KE7_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P09KE7_A120BarAgrEst = new String[] {""} ;
      P09KE7_A118BarAcaQui = new String[] {""} ;
      P09KE7_A180BarMaqCod = new String[] {""} ;
      P09KE7_A213BarSit = new byte[1] ;
      P09KE7_A1235BarNumCli = new int[1] ;
      P09KE7_A1234BarNomCli = new String[] {""} ;
      P09KE7_A136BarColNum = new int[1] ;
      P09KE7_A135BarColNom = new String[] {""} ;
      P09KE7_A1652BarSerDsc = new String[] {""} ;
      P09KE7_A212BarSer = new String[] {""} ;
      P09KE7_A13696BarNHdr = new String[] {""} ;
      P09KE7_A279CliNom = new String[] {""} ;
      P09KE7_A252CliCod = new int[1] ;
      P09KE7_n252CliCod = new boolean[] {false} ;
      P09KE7_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09KE7_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09KE7_A143BarDisNum = new String[] {""} ;
      P09KE7_A4812BarEncCli = new String[] {""} ;
      P09KE7_A199BarPie1 = new short[1] ;
      P09KE7_A365DisDes = new String[] {""} ;
      P09KE7_A898BarPieNDes = new int[1] ;
      P09KE7_A130BarCodPar = new String[] {""} ;
      P09KE7_A132BarCodReo = new byte[1] ;
      P09KE7_A129BarCod = new int[1] ;
      P09KE7_A396EmprCod = new String[] {""} ;
      AV21OptionDesc = "" ;
      P09KE9_A212BarSer = new String[] {""} ;
      P09KE9_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P09KE9_A120BarAgrEst = new String[] {""} ;
      P09KE9_A118BarAcaQui = new String[] {""} ;
      P09KE9_A180BarMaqCod = new String[] {""} ;
      P09KE9_A213BarSit = new byte[1] ;
      P09KE9_A1235BarNumCli = new int[1] ;
      P09KE9_A1234BarNomCli = new String[] {""} ;
      P09KE9_A136BarColNum = new int[1] ;
      P09KE9_A135BarColNom = new String[] {""} ;
      P09KE9_A1652BarSerDsc = new String[] {""} ;
      P09KE9_A2010BarTipDis = new String[] {""} ;
      P09KE9_A13696BarNHdr = new String[] {""} ;
      P09KE9_A279CliNom = new String[] {""} ;
      P09KE9_A252CliCod = new int[1] ;
      P09KE9_n252CliCod = new boolean[] {false} ;
      P09KE9_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09KE9_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09KE9_A143BarDisNum = new String[] {""} ;
      P09KE9_A4812BarEncCli = new String[] {""} ;
      P09KE9_A199BarPie1 = new short[1] ;
      P09KE9_A365DisDes = new String[] {""} ;
      P09KE9_A898BarPieNDes = new int[1] ;
      P09KE9_A130BarCodPar = new String[] {""} ;
      P09KE9_A132BarCodReo = new byte[1] ;
      P09KE9_A129BarCod = new int[1] ;
      P09KE9_A396EmprCod = new String[] {""} ;
      P09KE11_A1652BarSerDsc = new String[] {""} ;
      P09KE11_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P09KE11_A120BarAgrEst = new String[] {""} ;
      P09KE11_A118BarAcaQui = new String[] {""} ;
      P09KE11_A180BarMaqCod = new String[] {""} ;
      P09KE11_A213BarSit = new byte[1] ;
      P09KE11_A1235BarNumCli = new int[1] ;
      P09KE11_A1234BarNomCli = new String[] {""} ;
      P09KE11_A136BarColNum = new int[1] ;
      P09KE11_A135BarColNom = new String[] {""} ;
      P09KE11_A212BarSer = new String[] {""} ;
      P09KE11_A2010BarTipDis = new String[] {""} ;
      P09KE11_A13696BarNHdr = new String[] {""} ;
      P09KE11_A279CliNom = new String[] {""} ;
      P09KE11_A252CliCod = new int[1] ;
      P09KE11_n252CliCod = new boolean[] {false} ;
      P09KE11_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09KE11_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09KE11_A143BarDisNum = new String[] {""} ;
      P09KE11_A4812BarEncCli = new String[] {""} ;
      P09KE11_A199BarPie1 = new short[1] ;
      P09KE11_A365DisDes = new String[] {""} ;
      P09KE11_A898BarPieNDes = new int[1] ;
      P09KE11_A130BarCodPar = new String[] {""} ;
      P09KE11_A132BarCodReo = new byte[1] ;
      P09KE11_A129BarCod = new int[1] ;
      P09KE11_A396EmprCod = new String[] {""} ;
      P09KE13_A135BarColNom = new String[] {""} ;
      P09KE13_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P09KE13_A120BarAgrEst = new String[] {""} ;
      P09KE13_A118BarAcaQui = new String[] {""} ;
      P09KE13_A180BarMaqCod = new String[] {""} ;
      P09KE13_A213BarSit = new byte[1] ;
      P09KE13_A1235BarNumCli = new int[1] ;
      P09KE13_A1234BarNomCli = new String[] {""} ;
      P09KE13_A136BarColNum = new int[1] ;
      P09KE13_A1652BarSerDsc = new String[] {""} ;
      P09KE13_A212BarSer = new String[] {""} ;
      P09KE13_A2010BarTipDis = new String[] {""} ;
      P09KE13_A13696BarNHdr = new String[] {""} ;
      P09KE13_A279CliNom = new String[] {""} ;
      P09KE13_A252CliCod = new int[1] ;
      P09KE13_n252CliCod = new boolean[] {false} ;
      P09KE13_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09KE13_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09KE13_A143BarDisNum = new String[] {""} ;
      P09KE13_A4812BarEncCli = new String[] {""} ;
      P09KE13_A199BarPie1 = new short[1] ;
      P09KE13_A365DisDes = new String[] {""} ;
      P09KE13_A898BarPieNDes = new int[1] ;
      P09KE13_A130BarCodPar = new String[] {""} ;
      P09KE13_A132BarCodReo = new byte[1] ;
      P09KE13_A129BarCod = new int[1] ;
      P09KE13_A396EmprCod = new String[] {""} ;
      P09KE15_A1234BarNomCli = new String[] {""} ;
      P09KE15_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P09KE15_A120BarAgrEst = new String[] {""} ;
      P09KE15_A118BarAcaQui = new String[] {""} ;
      P09KE15_A180BarMaqCod = new String[] {""} ;
      P09KE15_A213BarSit = new byte[1] ;
      P09KE15_A1235BarNumCli = new int[1] ;
      P09KE15_A136BarColNum = new int[1] ;
      P09KE15_A135BarColNom = new String[] {""} ;
      P09KE15_A1652BarSerDsc = new String[] {""} ;
      P09KE15_A212BarSer = new String[] {""} ;
      P09KE15_A2010BarTipDis = new String[] {""} ;
      P09KE15_A13696BarNHdr = new String[] {""} ;
      P09KE15_A279CliNom = new String[] {""} ;
      P09KE15_A252CliCod = new int[1] ;
      P09KE15_n252CliCod = new boolean[] {false} ;
      P09KE15_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09KE15_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09KE15_A143BarDisNum = new String[] {""} ;
      P09KE15_A4812BarEncCli = new String[] {""} ;
      P09KE15_A199BarPie1 = new short[1] ;
      P09KE15_A365DisDes = new String[] {""} ;
      P09KE15_A898BarPieNDes = new int[1] ;
      P09KE15_A130BarCodPar = new String[] {""} ;
      P09KE15_A132BarCodReo = new byte[1] ;
      P09KE15_A129BarCod = new int[1] ;
      P09KE15_A396EmprCod = new String[] {""} ;
      P09KE17_A180BarMaqCod = new String[] {""} ;
      P09KE17_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P09KE17_A120BarAgrEst = new String[] {""} ;
      P09KE17_A118BarAcaQui = new String[] {""} ;
      P09KE17_A213BarSit = new byte[1] ;
      P09KE17_A1235BarNumCli = new int[1] ;
      P09KE17_A1234BarNomCli = new String[] {""} ;
      P09KE17_A136BarColNum = new int[1] ;
      P09KE17_A135BarColNom = new String[] {""} ;
      P09KE17_A1652BarSerDsc = new String[] {""} ;
      P09KE17_A212BarSer = new String[] {""} ;
      P09KE17_A2010BarTipDis = new String[] {""} ;
      P09KE17_A13696BarNHdr = new String[] {""} ;
      P09KE17_A279CliNom = new String[] {""} ;
      P09KE17_A252CliCod = new int[1] ;
      P09KE17_n252CliCod = new boolean[] {false} ;
      P09KE17_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09KE17_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09KE17_A143BarDisNum = new String[] {""} ;
      P09KE17_A4812BarEncCli = new String[] {""} ;
      P09KE17_A199BarPie1 = new short[1] ;
      P09KE17_A365DisDes = new String[] {""} ;
      P09KE17_A898BarPieNDes = new int[1] ;
      P09KE17_A130BarCodPar = new String[] {""} ;
      P09KE17_A132BarCodReo = new byte[1] ;
      P09KE17_A129BarCod = new int[1] ;
      P09KE17_A396EmprCod = new String[] {""} ;
      P09KE19_A118BarAcaQui = new String[] {""} ;
      P09KE19_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P09KE19_A120BarAgrEst = new String[] {""} ;
      P09KE19_A180BarMaqCod = new String[] {""} ;
      P09KE19_A213BarSit = new byte[1] ;
      P09KE19_A1235BarNumCli = new int[1] ;
      P09KE19_A1234BarNomCli = new String[] {""} ;
      P09KE19_A136BarColNum = new int[1] ;
      P09KE19_A135BarColNom = new String[] {""} ;
      P09KE19_A1652BarSerDsc = new String[] {""} ;
      P09KE19_A212BarSer = new String[] {""} ;
      P09KE19_A2010BarTipDis = new String[] {""} ;
      P09KE19_A13696BarNHdr = new String[] {""} ;
      P09KE19_A279CliNom = new String[] {""} ;
      P09KE19_A252CliCod = new int[1] ;
      P09KE19_n252CliCod = new boolean[] {false} ;
      P09KE19_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09KE19_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09KE19_A143BarDisNum = new String[] {""} ;
      P09KE19_A4812BarEncCli = new String[] {""} ;
      P09KE19_A199BarPie1 = new short[1] ;
      P09KE19_A365DisDes = new String[] {""} ;
      P09KE19_A898BarPieNDes = new int[1] ;
      P09KE19_A130BarCodPar = new String[] {""} ;
      P09KE19_A132BarCodReo = new byte[1] ;
      P09KE19_A129BarCod = new int[1] ;
      P09KE19_A396EmprCod = new String[] {""} ;
      P09KE21_A120BarAgrEst = new String[] {""} ;
      P09KE21_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P09KE21_A118BarAcaQui = new String[] {""} ;
      P09KE21_A180BarMaqCod = new String[] {""} ;
      P09KE21_A213BarSit = new byte[1] ;
      P09KE21_A1235BarNumCli = new int[1] ;
      P09KE21_A1234BarNomCli = new String[] {""} ;
      P09KE21_A136BarColNum = new int[1] ;
      P09KE21_A135BarColNom = new String[] {""} ;
      P09KE21_A1652BarSerDsc = new String[] {""} ;
      P09KE21_A212BarSer = new String[] {""} ;
      P09KE21_A2010BarTipDis = new String[] {""} ;
      P09KE21_A13696BarNHdr = new String[] {""} ;
      P09KE21_A279CliNom = new String[] {""} ;
      P09KE21_A252CliCod = new int[1] ;
      P09KE21_n252CliCod = new boolean[] {false} ;
      P09KE21_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09KE21_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09KE21_A143BarDisNum = new String[] {""} ;
      P09KE21_A4812BarEncCli = new String[] {""} ;
      P09KE21_A199BarPie1 = new short[1] ;
      P09KE21_A365DisDes = new String[] {""} ;
      P09KE21_A898BarPieNDes = new int[1] ;
      P09KE21_A130BarCodPar = new String[] {""} ;
      P09KE21_A132BarCodReo = new byte[1] ;
      P09KE21_A129BarCod = new int[1] ;
      P09KE21_A396EmprCod = new String[] {""} ;
      GXt_char2 = "" ;
      GXv_char6 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int8 = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidosclientesindetalle.hojaderuta_trnwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09KE3_A279CliNom, P09KE3_A159BarFecGen, P09KE3_A120BarAgrEst, P09KE3_A118BarAcaQui, P09KE3_A180BarMaqCod, P09KE3_A213BarSit, P09KE3_A1235BarNumCli, P09KE3_A1234BarNomCli, P09KE3_A136BarColNum, P09KE3_A135BarColNom,
            P09KE3_A1652BarSerDsc, P09KE3_A212BarSer, P09KE3_A2010BarTipDis, P09KE3_A13696BarNHdr, P09KE3_A252CliCod, P09KE3_n252CliCod, P09KE3_A184BarMtr, P09KE3_A166BarKgm, P09KE3_A143BarDisNum, P09KE3_A4812BarEncCli,
            P09KE3_A199BarPie1, P09KE3_A365DisDes, P09KE3_A898BarPieNDes, P09KE3_A130BarCodPar, P09KE3_A132BarCodReo, P09KE3_A129BarCod, P09KE3_A396EmprCod
            }
            , new Object[] {
            P09KE5_A159BarFecGen, P09KE5_A120BarAgrEst, P09KE5_A118BarAcaQui, P09KE5_A180BarMaqCod, P09KE5_A213BarSit, P09KE5_A1235BarNumCli, P09KE5_A1234BarNomCli, P09KE5_A136BarColNum, P09KE5_A135BarColNom, P09KE5_A1652BarSerDsc,
            P09KE5_A212BarSer, P09KE5_A2010BarTipDis, P09KE5_A13696BarNHdr, P09KE5_A279CliNom, P09KE5_A252CliCod, P09KE5_n252CliCod, P09KE5_A184BarMtr, P09KE5_A166BarKgm, P09KE5_A143BarDisNum, P09KE5_A4812BarEncCli,
            P09KE5_A199BarPie1, P09KE5_A365DisDes, P09KE5_A898BarPieNDes, P09KE5_A130BarCodPar, P09KE5_A132BarCodReo, P09KE5_A129BarCod, P09KE5_A396EmprCod
            }
            , new Object[] {
            P09KE7_A2010BarTipDis, P09KE7_A159BarFecGen, P09KE7_A120BarAgrEst, P09KE7_A118BarAcaQui, P09KE7_A180BarMaqCod, P09KE7_A213BarSit, P09KE7_A1235BarNumCli, P09KE7_A1234BarNomCli, P09KE7_A136BarColNum, P09KE7_A135BarColNom,
            P09KE7_A1652BarSerDsc, P09KE7_A212BarSer, P09KE7_A13696BarNHdr, P09KE7_A279CliNom, P09KE7_A252CliCod, P09KE7_n252CliCod, P09KE7_A184BarMtr, P09KE7_A166BarKgm, P09KE7_A143BarDisNum, P09KE7_A4812BarEncCli,
            P09KE7_A199BarPie1, P09KE7_A365DisDes, P09KE7_A898BarPieNDes, P09KE7_A130BarCodPar, P09KE7_A132BarCodReo, P09KE7_A129BarCod, P09KE7_A396EmprCod
            }
            , new Object[] {
            P09KE9_A212BarSer, P09KE9_A159BarFecGen, P09KE9_A120BarAgrEst, P09KE9_A118BarAcaQui, P09KE9_A180BarMaqCod, P09KE9_A213BarSit, P09KE9_A1235BarNumCli, P09KE9_A1234BarNomCli, P09KE9_A136BarColNum, P09KE9_A135BarColNom,
            P09KE9_A1652BarSerDsc, P09KE9_A2010BarTipDis, P09KE9_A13696BarNHdr, P09KE9_A279CliNom, P09KE9_A252CliCod, P09KE9_n252CliCod, P09KE9_A184BarMtr, P09KE9_A166BarKgm, P09KE9_A143BarDisNum, P09KE9_A4812BarEncCli,
            P09KE9_A199BarPie1, P09KE9_A365DisDes, P09KE9_A898BarPieNDes, P09KE9_A130BarCodPar, P09KE9_A132BarCodReo, P09KE9_A129BarCod, P09KE9_A396EmprCod
            }
            , new Object[] {
            P09KE11_A1652BarSerDsc, P09KE11_A159BarFecGen, P09KE11_A120BarAgrEst, P09KE11_A118BarAcaQui, P09KE11_A180BarMaqCod, P09KE11_A213BarSit, P09KE11_A1235BarNumCli, P09KE11_A1234BarNomCli, P09KE11_A136BarColNum, P09KE11_A135BarColNom,
            P09KE11_A212BarSer, P09KE11_A2010BarTipDis, P09KE11_A13696BarNHdr, P09KE11_A279CliNom, P09KE11_A252CliCod, P09KE11_n252CliCod, P09KE11_A184BarMtr, P09KE11_A166BarKgm, P09KE11_A143BarDisNum, P09KE11_A4812BarEncCli,
            P09KE11_A199BarPie1, P09KE11_A365DisDes, P09KE11_A898BarPieNDes, P09KE11_A130BarCodPar, P09KE11_A132BarCodReo, P09KE11_A129BarCod, P09KE11_A396EmprCod
            }
            , new Object[] {
            P09KE13_A135BarColNom, P09KE13_A159BarFecGen, P09KE13_A120BarAgrEst, P09KE13_A118BarAcaQui, P09KE13_A180BarMaqCod, P09KE13_A213BarSit, P09KE13_A1235BarNumCli, P09KE13_A1234BarNomCli, P09KE13_A136BarColNum, P09KE13_A1652BarSerDsc,
            P09KE13_A212BarSer, P09KE13_A2010BarTipDis, P09KE13_A13696BarNHdr, P09KE13_A279CliNom, P09KE13_A252CliCod, P09KE13_n252CliCod, P09KE13_A184BarMtr, P09KE13_A166BarKgm, P09KE13_A143BarDisNum, P09KE13_A4812BarEncCli,
            P09KE13_A199BarPie1, P09KE13_A365DisDes, P09KE13_A898BarPieNDes, P09KE13_A130BarCodPar, P09KE13_A132BarCodReo, P09KE13_A129BarCod, P09KE13_A396EmprCod
            }
            , new Object[] {
            P09KE15_A1234BarNomCli, P09KE15_A159BarFecGen, P09KE15_A120BarAgrEst, P09KE15_A118BarAcaQui, P09KE15_A180BarMaqCod, P09KE15_A213BarSit, P09KE15_A1235BarNumCli, P09KE15_A136BarColNum, P09KE15_A135BarColNom, P09KE15_A1652BarSerDsc,
            P09KE15_A212BarSer, P09KE15_A2010BarTipDis, P09KE15_A13696BarNHdr, P09KE15_A279CliNom, P09KE15_A252CliCod, P09KE15_n252CliCod, P09KE15_A184BarMtr, P09KE15_A166BarKgm, P09KE15_A143BarDisNum, P09KE15_A4812BarEncCli,
            P09KE15_A199BarPie1, P09KE15_A365DisDes, P09KE15_A898BarPieNDes, P09KE15_A130BarCodPar, P09KE15_A132BarCodReo, P09KE15_A129BarCod, P09KE15_A396EmprCod
            }
            , new Object[] {
            P09KE17_A180BarMaqCod, P09KE17_A159BarFecGen, P09KE17_A120BarAgrEst, P09KE17_A118BarAcaQui, P09KE17_A213BarSit, P09KE17_A1235BarNumCli, P09KE17_A1234BarNomCli, P09KE17_A136BarColNum, P09KE17_A135BarColNom, P09KE17_A1652BarSerDsc,
            P09KE17_A212BarSer, P09KE17_A2010BarTipDis, P09KE17_A13696BarNHdr, P09KE17_A279CliNom, P09KE17_A252CliCod, P09KE17_n252CliCod, P09KE17_A184BarMtr, P09KE17_A166BarKgm, P09KE17_A143BarDisNum, P09KE17_A4812BarEncCli,
            P09KE17_A199BarPie1, P09KE17_A365DisDes, P09KE17_A898BarPieNDes, P09KE17_A130BarCodPar, P09KE17_A132BarCodReo, P09KE17_A129BarCod, P09KE17_A396EmprCod
            }
            , new Object[] {
            P09KE19_A118BarAcaQui, P09KE19_A159BarFecGen, P09KE19_A120BarAgrEst, P09KE19_A180BarMaqCod, P09KE19_A213BarSit, P09KE19_A1235BarNumCli, P09KE19_A1234BarNomCli, P09KE19_A136BarColNum, P09KE19_A135BarColNom, P09KE19_A1652BarSerDsc,
            P09KE19_A212BarSer, P09KE19_A2010BarTipDis, P09KE19_A13696BarNHdr, P09KE19_A279CliNom, P09KE19_A252CliCod, P09KE19_n252CliCod, P09KE19_A184BarMtr, P09KE19_A166BarKgm, P09KE19_A143BarDisNum, P09KE19_A4812BarEncCli,
            P09KE19_A199BarPie1, P09KE19_A365DisDes, P09KE19_A898BarPieNDes, P09KE19_A130BarCodPar, P09KE19_A132BarCodReo, P09KE19_A129BarCod, P09KE19_A396EmprCod
            }
            , new Object[] {
            P09KE21_A120BarAgrEst, P09KE21_A159BarFecGen, P09KE21_A118BarAcaQui, P09KE21_A180BarMaqCod, P09KE21_A213BarSit, P09KE21_A1235BarNumCli, P09KE21_A1234BarNomCli, P09KE21_A136BarColNum, P09KE21_A135BarColNom, P09KE21_A1652BarSerDsc,
            P09KE21_A212BarSer, P09KE21_A2010BarTipDis, P09KE21_A13696BarNHdr, P09KE21_A279CliNom, P09KE21_A252CliCod, P09KE21_n252CliCod, P09KE21_A184BarMtr, P09KE21_A166BarKgm, P09KE21_A143BarDisNum, P09KE21_A4812BarEncCli,
            P09KE21_A199BarPie1, P09KE21_A365DisDes, P09KE21_A898BarPieNDes, P09KE21_A130BarCodPar, P09KE21_A132BarCodReo, P09KE21_A129BarCod, P09KE21_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV88TFBarHayAlb_Sel ;
   private byte AV84BarSitfrom ;
   private byte AV85BarSitto ;
   private byte AV80BarCodreoIN ;
   private byte A213BarSit ;
   private byte A132BarCodReo ;
   private byte A14502BarHayAlb ;
   private byte GXt_int7 ;
   private byte GXv_int8[] ;
   private short A199BarPie1 ;
   private short Gx_err ;
   private int AV91GXV1 ;
   private int AV39TFCliCod ;
   private int AV40TFCliCod_To ;
   private int AV49TFBarColNum ;
   private int AV50TFBarColNum_To ;
   private int AV63TFBarNumCli ;
   private int AV64TFBarNumCli_To ;
   private int AV67TFBarPie ;
   private int AV68TFBarPie_To ;
   private int AV79BarCodIN ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A1235BarNumCli ;
   private int A129BarCod ;
   private int A198BarPie ;
   private int A898BarPieNDes ;
   private int AV17InsertIndex ;
   private long AV26count ;
   private java.math.BigDecimal AV69TFBarKgm ;
   private java.math.BigDecimal AV70TFBarKgm_To ;
   private java.math.BigDecimal AV71TFBarMtr ;
   private java.math.BigDecimal AV72TFBarMtr_To ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private String AV41TFCliNom ;
   private String AV42TFCliNom_Sel ;
   private String AV35TFPedidoCliente ;
   private String AV36TFPedidoCliente_Sel ;
   private String AV59TFBarTipDis ;
   private String AV60TFBarTipDis_Sel ;
   private String AV43TFBarSer ;
   private String AV44TFBarSer_Sel ;
   private String AV45TFBarSerDsc ;
   private String AV46TFBarSerDsc_Sel ;
   private String AV47TFBarColNom ;
   private String AV48TFBarColNom_Sel ;
   private String AV61TFBarNomCli ;
   private String AV62TFBarNomCli_Sel ;
   private String AV65TFBarMaqCod ;
   private String AV66TFBarMaqCod_Sel ;
   private String AV73TFBarAcaQui ;
   private String AV74TFBarAcaQui_Sel ;
   private String AV77TFBarAgrEst ;
   private String AV78TFBarAgrEst_Sel ;
   private String scmdbuf ;
   private String lV41TFCliNom ;
   private String lV59TFBarTipDis ;
   private String lV43TFBarSer ;
   private String lV45TFBarSerDsc ;
   private String lV47TFBarColNom ;
   private String lV61TFBarNomCli ;
   private String lV65TFBarMaqCod ;
   private String lV73TFBarAcaQui ;
   private String lV77TFBarAgrEst ;
   private String AV81BarCodparIN ;
   private String A279CliNom ;
   private String A2010BarTipDis ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A180BarMaqCod ;
   private String A118BarAcaQui ;
   private String A120BarAgrEst ;
   private String A130BarCodPar ;
   private String A13878PedidoClie ;
   private String A13696BarNHdr ;
   private String A143BarDisNum ;
   private String A4812BarEncCli ;
   private String A365DisDes ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char6[] ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private java.util.Date AV82BarFecGenfrom ;
   private java.util.Date AV83BarFecGento ;
   private java.util.Date A159BarFecGen ;
   private boolean returnInSub ;
   private boolean brk9KE2 ;
   private boolean n252CliCod ;
   private boolean brk9KE5 ;
   private boolean brk9KE7 ;
   private boolean brk9KE9 ;
   private boolean brk9KE11 ;
   private boolean brk9KE13 ;
   private boolean brk9KE15 ;
   private boolean brk9KE17 ;
   private boolean brk9KE19 ;
   private String AV20OptionsJson ;
   private String AV23OptionsDescJson ;
   private String AV25OptionIndexesJson ;
   private String AV16DDOName ;
   private String AV14SearchTxt ;
   private String AV15SearchTxtTo ;
   private String AV32FilterFullText ;
   private String lV32FilterFullText ;
   private String AV18Option ;
   private String AV21OptionDesc ;
   private com.genexus.webpanels.WebSession AV27Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09KE3_A279CliNom ;
   private java.util.Date[] P09KE3_A159BarFecGen ;
   private String[] P09KE3_A120BarAgrEst ;
   private String[] P09KE3_A118BarAcaQui ;
   private String[] P09KE3_A180BarMaqCod ;
   private byte[] P09KE3_A213BarSit ;
   private int[] P09KE3_A1235BarNumCli ;
   private String[] P09KE3_A1234BarNomCli ;
   private int[] P09KE3_A136BarColNum ;
   private String[] P09KE3_A135BarColNom ;
   private String[] P09KE3_A1652BarSerDsc ;
   private String[] P09KE3_A212BarSer ;
   private String[] P09KE3_A2010BarTipDis ;
   private String[] P09KE3_A13696BarNHdr ;
   private int[] P09KE3_A252CliCod ;
   private boolean[] P09KE3_n252CliCod ;
   private java.math.BigDecimal[] P09KE3_A184BarMtr ;
   private java.math.BigDecimal[] P09KE3_A166BarKgm ;
   private String[] P09KE3_A143BarDisNum ;
   private String[] P09KE3_A4812BarEncCli ;
   private short[] P09KE3_A199BarPie1 ;
   private String[] P09KE3_A365DisDes ;
   private int[] P09KE3_A898BarPieNDes ;
   private String[] P09KE3_A130BarCodPar ;
   private byte[] P09KE3_A132BarCodReo ;
   private int[] P09KE3_A129BarCod ;
   private String[] P09KE3_A396EmprCod ;
   private java.util.Date[] P09KE5_A159BarFecGen ;
   private String[] P09KE5_A120BarAgrEst ;
   private String[] P09KE5_A118BarAcaQui ;
   private String[] P09KE5_A180BarMaqCod ;
   private byte[] P09KE5_A213BarSit ;
   private int[] P09KE5_A1235BarNumCli ;
   private String[] P09KE5_A1234BarNomCli ;
   private int[] P09KE5_A136BarColNum ;
   private String[] P09KE5_A135BarColNom ;
   private String[] P09KE5_A1652BarSerDsc ;
   private String[] P09KE5_A212BarSer ;
   private String[] P09KE5_A2010BarTipDis ;
   private String[] P09KE5_A13696BarNHdr ;
   private String[] P09KE5_A279CliNom ;
   private int[] P09KE5_A252CliCod ;
   private boolean[] P09KE5_n252CliCod ;
   private java.math.BigDecimal[] P09KE5_A184BarMtr ;
   private java.math.BigDecimal[] P09KE5_A166BarKgm ;
   private String[] P09KE5_A143BarDisNum ;
   private String[] P09KE5_A4812BarEncCli ;
   private short[] P09KE5_A199BarPie1 ;
   private String[] P09KE5_A365DisDes ;
   private int[] P09KE5_A898BarPieNDes ;
   private String[] P09KE5_A130BarCodPar ;
   private byte[] P09KE5_A132BarCodReo ;
   private int[] P09KE5_A129BarCod ;
   private String[] P09KE5_A396EmprCod ;
   private String[] P09KE7_A2010BarTipDis ;
   private java.util.Date[] P09KE7_A159BarFecGen ;
   private String[] P09KE7_A120BarAgrEst ;
   private String[] P09KE7_A118BarAcaQui ;
   private String[] P09KE7_A180BarMaqCod ;
   private byte[] P09KE7_A213BarSit ;
   private int[] P09KE7_A1235BarNumCli ;
   private String[] P09KE7_A1234BarNomCli ;
   private int[] P09KE7_A136BarColNum ;
   private String[] P09KE7_A135BarColNom ;
   private String[] P09KE7_A1652BarSerDsc ;
   private String[] P09KE7_A212BarSer ;
   private String[] P09KE7_A13696BarNHdr ;
   private String[] P09KE7_A279CliNom ;
   private int[] P09KE7_A252CliCod ;
   private boolean[] P09KE7_n252CliCod ;
   private java.math.BigDecimal[] P09KE7_A184BarMtr ;
   private java.math.BigDecimal[] P09KE7_A166BarKgm ;
   private String[] P09KE7_A143BarDisNum ;
   private String[] P09KE7_A4812BarEncCli ;
   private short[] P09KE7_A199BarPie1 ;
   private String[] P09KE7_A365DisDes ;
   private int[] P09KE7_A898BarPieNDes ;
   private String[] P09KE7_A130BarCodPar ;
   private byte[] P09KE7_A132BarCodReo ;
   private int[] P09KE7_A129BarCod ;
   private String[] P09KE7_A396EmprCod ;
   private String[] P09KE9_A212BarSer ;
   private java.util.Date[] P09KE9_A159BarFecGen ;
   private String[] P09KE9_A120BarAgrEst ;
   private String[] P09KE9_A118BarAcaQui ;
   private String[] P09KE9_A180BarMaqCod ;
   private byte[] P09KE9_A213BarSit ;
   private int[] P09KE9_A1235BarNumCli ;
   private String[] P09KE9_A1234BarNomCli ;
   private int[] P09KE9_A136BarColNum ;
   private String[] P09KE9_A135BarColNom ;
   private String[] P09KE9_A1652BarSerDsc ;
   private String[] P09KE9_A2010BarTipDis ;
   private String[] P09KE9_A13696BarNHdr ;
   private String[] P09KE9_A279CliNom ;
   private int[] P09KE9_A252CliCod ;
   private boolean[] P09KE9_n252CliCod ;
   private java.math.BigDecimal[] P09KE9_A184BarMtr ;
   private java.math.BigDecimal[] P09KE9_A166BarKgm ;
   private String[] P09KE9_A143BarDisNum ;
   private String[] P09KE9_A4812BarEncCli ;
   private short[] P09KE9_A199BarPie1 ;
   private String[] P09KE9_A365DisDes ;
   private int[] P09KE9_A898BarPieNDes ;
   private String[] P09KE9_A130BarCodPar ;
   private byte[] P09KE9_A132BarCodReo ;
   private int[] P09KE9_A129BarCod ;
   private String[] P09KE9_A396EmprCod ;
   private String[] P09KE11_A1652BarSerDsc ;
   private java.util.Date[] P09KE11_A159BarFecGen ;
   private String[] P09KE11_A120BarAgrEst ;
   private String[] P09KE11_A118BarAcaQui ;
   private String[] P09KE11_A180BarMaqCod ;
   private byte[] P09KE11_A213BarSit ;
   private int[] P09KE11_A1235BarNumCli ;
   private String[] P09KE11_A1234BarNomCli ;
   private int[] P09KE11_A136BarColNum ;
   private String[] P09KE11_A135BarColNom ;
   private String[] P09KE11_A212BarSer ;
   private String[] P09KE11_A2010BarTipDis ;
   private String[] P09KE11_A13696BarNHdr ;
   private String[] P09KE11_A279CliNom ;
   private int[] P09KE11_A252CliCod ;
   private boolean[] P09KE11_n252CliCod ;
   private java.math.BigDecimal[] P09KE11_A184BarMtr ;
   private java.math.BigDecimal[] P09KE11_A166BarKgm ;
   private String[] P09KE11_A143BarDisNum ;
   private String[] P09KE11_A4812BarEncCli ;
   private short[] P09KE11_A199BarPie1 ;
   private String[] P09KE11_A365DisDes ;
   private int[] P09KE11_A898BarPieNDes ;
   private String[] P09KE11_A130BarCodPar ;
   private byte[] P09KE11_A132BarCodReo ;
   private int[] P09KE11_A129BarCod ;
   private String[] P09KE11_A396EmprCod ;
   private String[] P09KE13_A135BarColNom ;
   private java.util.Date[] P09KE13_A159BarFecGen ;
   private String[] P09KE13_A120BarAgrEst ;
   private String[] P09KE13_A118BarAcaQui ;
   private String[] P09KE13_A180BarMaqCod ;
   private byte[] P09KE13_A213BarSit ;
   private int[] P09KE13_A1235BarNumCli ;
   private String[] P09KE13_A1234BarNomCli ;
   private int[] P09KE13_A136BarColNum ;
   private String[] P09KE13_A1652BarSerDsc ;
   private String[] P09KE13_A212BarSer ;
   private String[] P09KE13_A2010BarTipDis ;
   private String[] P09KE13_A13696BarNHdr ;
   private String[] P09KE13_A279CliNom ;
   private int[] P09KE13_A252CliCod ;
   private boolean[] P09KE13_n252CliCod ;
   private java.math.BigDecimal[] P09KE13_A184BarMtr ;
   private java.math.BigDecimal[] P09KE13_A166BarKgm ;
   private String[] P09KE13_A143BarDisNum ;
   private String[] P09KE13_A4812BarEncCli ;
   private short[] P09KE13_A199BarPie1 ;
   private String[] P09KE13_A365DisDes ;
   private int[] P09KE13_A898BarPieNDes ;
   private String[] P09KE13_A130BarCodPar ;
   private byte[] P09KE13_A132BarCodReo ;
   private int[] P09KE13_A129BarCod ;
   private String[] P09KE13_A396EmprCod ;
   private String[] P09KE15_A1234BarNomCli ;
   private java.util.Date[] P09KE15_A159BarFecGen ;
   private String[] P09KE15_A120BarAgrEst ;
   private String[] P09KE15_A118BarAcaQui ;
   private String[] P09KE15_A180BarMaqCod ;
   private byte[] P09KE15_A213BarSit ;
   private int[] P09KE15_A1235BarNumCli ;
   private int[] P09KE15_A136BarColNum ;
   private String[] P09KE15_A135BarColNom ;
   private String[] P09KE15_A1652BarSerDsc ;
   private String[] P09KE15_A212BarSer ;
   private String[] P09KE15_A2010BarTipDis ;
   private String[] P09KE15_A13696BarNHdr ;
   private String[] P09KE15_A279CliNom ;
   private int[] P09KE15_A252CliCod ;
   private boolean[] P09KE15_n252CliCod ;
   private java.math.BigDecimal[] P09KE15_A184BarMtr ;
   private java.math.BigDecimal[] P09KE15_A166BarKgm ;
   private String[] P09KE15_A143BarDisNum ;
   private String[] P09KE15_A4812BarEncCli ;
   private short[] P09KE15_A199BarPie1 ;
   private String[] P09KE15_A365DisDes ;
   private int[] P09KE15_A898BarPieNDes ;
   private String[] P09KE15_A130BarCodPar ;
   private byte[] P09KE15_A132BarCodReo ;
   private int[] P09KE15_A129BarCod ;
   private String[] P09KE15_A396EmprCod ;
   private String[] P09KE17_A180BarMaqCod ;
   private java.util.Date[] P09KE17_A159BarFecGen ;
   private String[] P09KE17_A120BarAgrEst ;
   private String[] P09KE17_A118BarAcaQui ;
   private byte[] P09KE17_A213BarSit ;
   private int[] P09KE17_A1235BarNumCli ;
   private String[] P09KE17_A1234BarNomCli ;
   private int[] P09KE17_A136BarColNum ;
   private String[] P09KE17_A135BarColNom ;
   private String[] P09KE17_A1652BarSerDsc ;
   private String[] P09KE17_A212BarSer ;
   private String[] P09KE17_A2010BarTipDis ;
   private String[] P09KE17_A13696BarNHdr ;
   private String[] P09KE17_A279CliNom ;
   private int[] P09KE17_A252CliCod ;
   private boolean[] P09KE17_n252CliCod ;
   private java.math.BigDecimal[] P09KE17_A184BarMtr ;
   private java.math.BigDecimal[] P09KE17_A166BarKgm ;
   private String[] P09KE17_A143BarDisNum ;
   private String[] P09KE17_A4812BarEncCli ;
   private short[] P09KE17_A199BarPie1 ;
   private String[] P09KE17_A365DisDes ;
   private int[] P09KE17_A898BarPieNDes ;
   private String[] P09KE17_A130BarCodPar ;
   private byte[] P09KE17_A132BarCodReo ;
   private int[] P09KE17_A129BarCod ;
   private String[] P09KE17_A396EmprCod ;
   private String[] P09KE19_A118BarAcaQui ;
   private java.util.Date[] P09KE19_A159BarFecGen ;
   private String[] P09KE19_A120BarAgrEst ;
   private String[] P09KE19_A180BarMaqCod ;
   private byte[] P09KE19_A213BarSit ;
   private int[] P09KE19_A1235BarNumCli ;
   private String[] P09KE19_A1234BarNomCli ;
   private int[] P09KE19_A136BarColNum ;
   private String[] P09KE19_A135BarColNom ;
   private String[] P09KE19_A1652BarSerDsc ;
   private String[] P09KE19_A212BarSer ;
   private String[] P09KE19_A2010BarTipDis ;
   private String[] P09KE19_A13696BarNHdr ;
   private String[] P09KE19_A279CliNom ;
   private int[] P09KE19_A252CliCod ;
   private boolean[] P09KE19_n252CliCod ;
   private java.math.BigDecimal[] P09KE19_A184BarMtr ;
   private java.math.BigDecimal[] P09KE19_A166BarKgm ;
   private String[] P09KE19_A143BarDisNum ;
   private String[] P09KE19_A4812BarEncCli ;
   private short[] P09KE19_A199BarPie1 ;
   private String[] P09KE19_A365DisDes ;
   private int[] P09KE19_A898BarPieNDes ;
   private String[] P09KE19_A130BarCodPar ;
   private byte[] P09KE19_A132BarCodReo ;
   private int[] P09KE19_A129BarCod ;
   private String[] P09KE19_A396EmprCod ;
   private String[] P09KE21_A120BarAgrEst ;
   private java.util.Date[] P09KE21_A159BarFecGen ;
   private String[] P09KE21_A118BarAcaQui ;
   private String[] P09KE21_A180BarMaqCod ;
   private byte[] P09KE21_A213BarSit ;
   private int[] P09KE21_A1235BarNumCli ;
   private String[] P09KE21_A1234BarNomCli ;
   private int[] P09KE21_A136BarColNum ;
   private String[] P09KE21_A135BarColNom ;
   private String[] P09KE21_A1652BarSerDsc ;
   private String[] P09KE21_A212BarSer ;
   private String[] P09KE21_A2010BarTipDis ;
   private String[] P09KE21_A13696BarNHdr ;
   private String[] P09KE21_A279CliNom ;
   private int[] P09KE21_A252CliCod ;
   private boolean[] P09KE21_n252CliCod ;
   private java.math.BigDecimal[] P09KE21_A184BarMtr ;
   private java.math.BigDecimal[] P09KE21_A166BarKgm ;
   private String[] P09KE21_A143BarDisNum ;
   private String[] P09KE21_A4812BarEncCli ;
   private short[] P09KE21_A199BarPie1 ;
   private String[] P09KE21_A365DisDes ;
   private int[] P09KE21_A898BarPieNDes ;
   private String[] P09KE21_A130BarCodPar ;
   private byte[] P09KE21_A132BarCodReo ;
   private int[] P09KE21_A129BarCod ;
   private String[] P09KE21_A396EmprCod ;
   private GXSimpleCollection<String> AV19Options ;
   private GXSimpleCollection<String> AV22OptionsDesc ;
   private GXSimpleCollection<String> AV24OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV29GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV30GridStateFilterValue ;
}

final  class hojaderuta_trnwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09KE3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV39TFCliCod ,
                                          int AV40TFCliCod_To ,
                                          String AV42TFCliNom_Sel ,
                                          String AV41TFCliNom ,
                                          String AV60TFBarTipDis_Sel ,
                                          String AV59TFBarTipDis ,
                                          String AV44TFBarSer_Sel ,
                                          String AV43TFBarSer ,
                                          String AV46TFBarSerDsc_Sel ,
                                          String AV45TFBarSerDsc ,
                                          String AV48TFBarColNom_Sel ,
                                          String AV47TFBarColNom ,
                                          int AV49TFBarColNum ,
                                          int AV50TFBarColNum_To ,
                                          String AV62TFBarNomCli_Sel ,
                                          String AV61TFBarNomCli ,
                                          int AV63TFBarNumCli ,
                                          int AV64TFBarNumCli_To ,
                                          String AV66TFBarMaqCod_Sel ,
                                          String AV65TFBarMaqCod ,
                                          java.math.BigDecimal AV69TFBarKgm ,
                                          java.math.BigDecimal AV70TFBarKgm_To ,
                                          java.math.BigDecimal AV71TFBarMtr ,
                                          java.math.BigDecimal AV72TFBarMtr_To ,
                                          String AV74TFBarAcaQui_Sel ,
                                          String AV73TFBarAcaQui ,
                                          String AV78TFBarAgrEst_Sel ,
                                          String AV77TFBarAgrEst ,
                                          java.util.Date AV82BarFecGenfrom ,
                                          java.util.Date AV83BarFecGento ,
                                          byte AV84BarSitfrom ,
                                          byte AV85BarSitto ,
                                          int AV79BarCodIN ,
                                          byte AV80BarCodreoIN ,
                                          String AV81BarCodparIN ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A2010BarTipDis ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A1234BarNomCli ,
                                          int A1235BarNumCli ,
                                          String A180BarMaqCod ,
                                          java.math.BigDecimal A166BarKgm ,
                                          java.math.BigDecimal A184BarMtr ,
                                          String A118BarAcaQui ,
                                          String A120BarAgrEst ,
                                          java.util.Date A159BarFecGen ,
                                          byte A213BarSit ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String AV32FilterFullText ,
                                          String A13878PedidoClie ,
                                          String A13696BarNHdr ,
                                          int A198BarPie ,
                                          String AV36TFPedidoCliente_Sel ,
                                          String AV35TFPedidoCliente ,
                                          int AV67TFBarPie ,
                                          int AV68TFBarPie_To ,
                                          byte AV88TFBarHayAlb_Sel ,
                                          byte A14502BarHayAlb )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[35];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT T2.CliNom, T1.BarFecGen, T1.BarAgrEst, T1.BarAcaQui, T1.BarMaqCod, T1.BarSit, T1.BarNumCli, T1.BarNomCli, T1.BarColNum, T1.BarColNom, T1.BarSerDsc, T1.BarSer," ;
      scmdbuf += " T1.BarTipDis, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar AS BarNHdr, T1.CliCod," ;
      scmdbuf += " COALESCE( T3.BarMtr, 0) AS BarMtr, COALESCE( T3.BarKgm, 0) AS BarKgm, T1.BarDisNum, T1.BarEncCli, COALESCE( T3.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T3.BarPieNDes," ;
      scmdbuf += " 0) AS BarPieNDes, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod FROM ((TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      scmdbuf += " LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM" ;
      scmdbuf += " TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar)" ;
      if ( ! (0==AV39TFCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int9[0] = (byte)(1) ;
      }
      if ( ! (0==AV40TFCliCod_To) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int9[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV42TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV41TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV42TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int9[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60TFBarTipDis_Sel)==0) && ( ! (GXutil.strcmp("", AV59TFBarTipDis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarTipDis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60TFBarTipDis_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarTipDis = ?)");
      }
      else
      {
         GXv_int9[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV44TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV43TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV44TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int9[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV46TFBarSerDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV45TFBarSerDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV46TFBarSerDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int9[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV48TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV47TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV48TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int9[11] = (byte)(1) ;
      }
      if ( ! (0==AV49TFBarColNum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int9[12] = (byte)(1) ;
      }
      if ( ! (0==AV50TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int9[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62TFBarNomCli_Sel)==0) && ( ! (GXutil.strcmp("", AV61TFBarNomCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62TFBarNomCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int9[15] = (byte)(1) ;
      }
      if ( ! (0==AV63TFBarNumCli) )
      {
         addWhere(sWhereString, "(T1.BarNumCli >= ?)");
      }
      else
      {
         GXv_int9[16] = (byte)(1) ;
      }
      if ( ! (0==AV64TFBarNumCli_To) )
      {
         addWhere(sWhereString, "(T1.BarNumCli <= ?)");
      }
      else
      {
         GXv_int9[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66TFBarMaqCod_Sel)==0) && ( ! (GXutil.strcmp("", AV65TFBarMaqCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66TFBarMaqCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarMaqCod = ?)");
      }
      else
      {
         GXv_int9[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV69TFBarKgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int9[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70TFBarKgm_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int9[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71TFBarMtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int9[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72TFBarMtr_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int9[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74TFBarAcaQui_Sel)==0) && ( ! (GXutil.strcmp("", AV73TFBarAcaQui)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAcaQui) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74TFBarAcaQui_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAcaQui = ?)");
      }
      else
      {
         GXv_int9[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78TFBarAgrEst_Sel)==0) && ( ! (GXutil.strcmp("", AV77TFBarAgrEst)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAgrEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78TFBarAgrEst_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAgrEst = ?)");
      }
      else
      {
         GXv_int9[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV82BarFecGenfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int9[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV83BarFecGento)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int9[29] = (byte)(1) ;
      }
      if ( ! (0==AV84BarSitfrom) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int9[30] = (byte)(1) ;
      }
      if ( ! (0==AV85BarSitto) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int9[31] = (byte)(1) ;
      }
      if ( ! (0==AV79BarCodIN) )
      {
         addWhere(sWhereString, "(T1.BarCod = ?)");
      }
      else
      {
         GXv_int9[32] = (byte)(1) ;
      }
      if ( ! (0==AV80BarCodreoIN) )
      {
         addWhere(sWhereString, "(T1.BarCodReo = ?)");
      }
      else
      {
         GXv_int9[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81BarCodparIN)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int9[34] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.CliNom" ;
      GXv_Object10[0] = scmdbuf ;
      GXv_Object10[1] = GXv_int9 ;
      return GXv_Object10 ;
   }

   protected Object[] conditional_P09KE5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV39TFCliCod ,
                                          int AV40TFCliCod_To ,
                                          String AV42TFCliNom_Sel ,
                                          String AV41TFCliNom ,
                                          String AV60TFBarTipDis_Sel ,
                                          String AV59TFBarTipDis ,
                                          String AV44TFBarSer_Sel ,
                                          String AV43TFBarSer ,
                                          String AV46TFBarSerDsc_Sel ,
                                          String AV45TFBarSerDsc ,
                                          String AV48TFBarColNom_Sel ,
                                          String AV47TFBarColNom ,
                                          int AV49TFBarColNum ,
                                          int AV50TFBarColNum_To ,
                                          String AV62TFBarNomCli_Sel ,
                                          String AV61TFBarNomCli ,
                                          int AV63TFBarNumCli ,
                                          int AV64TFBarNumCli_To ,
                                          String AV66TFBarMaqCod_Sel ,
                                          String AV65TFBarMaqCod ,
                                          java.math.BigDecimal AV69TFBarKgm ,
                                          java.math.BigDecimal AV70TFBarKgm_To ,
                                          java.math.BigDecimal AV71TFBarMtr ,
                                          java.math.BigDecimal AV72TFBarMtr_To ,
                                          String AV74TFBarAcaQui_Sel ,
                                          String AV73TFBarAcaQui ,
                                          String AV78TFBarAgrEst_Sel ,
                                          String AV77TFBarAgrEst ,
                                          java.util.Date AV82BarFecGenfrom ,
                                          java.util.Date AV83BarFecGento ,
                                          byte AV84BarSitfrom ,
                                          byte AV85BarSitto ,
                                          int AV79BarCodIN ,
                                          byte AV80BarCodreoIN ,
                                          String AV81BarCodparIN ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A2010BarTipDis ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A1234BarNomCli ,
                                          int A1235BarNumCli ,
                                          String A180BarMaqCod ,
                                          java.math.BigDecimal A166BarKgm ,
                                          java.math.BigDecimal A184BarMtr ,
                                          String A118BarAcaQui ,
                                          String A120BarAgrEst ,
                                          java.util.Date A159BarFecGen ,
                                          byte A213BarSit ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String AV32FilterFullText ,
                                          String A13878PedidoClie ,
                                          String A13696BarNHdr ,
                                          int A198BarPie ,
                                          String AV36TFPedidoCliente_Sel ,
                                          String AV35TFPedidoCliente ,
                                          int AV67TFBarPie ,
                                          int AV68TFBarPie_To ,
                                          byte AV88TFBarHayAlb_Sel ,
                                          byte A14502BarHayAlb )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int11 = new byte[35];
      Object[] GXv_Object12 = new Object[2];
      scmdbuf = "SELECT T1.BarFecGen, T1.BarAgrEst, T1.BarAcaQui, T1.BarMaqCod, T1.BarSit, T1.BarNumCli, T1.BarNomCli, T1.BarColNum, T1.BarColNom, T1.BarSerDsc, T1.BarSer, T1.BarTipDis," ;
      scmdbuf += " RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar AS BarNHdr, T2.CliNom, T1.CliCod," ;
      scmdbuf += " COALESCE( T3.BarMtr, 0) AS BarMtr, COALESCE( T3.BarKgm, 0) AS BarKgm, T1.BarDisNum, T1.BarEncCli, COALESCE( T3.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T3.BarPieNDes," ;
      scmdbuf += " 0) AS BarPieNDes, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod FROM ((TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      scmdbuf += " LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM" ;
      scmdbuf += " TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar)" ;
      if ( ! (0==AV39TFCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int11[0] = (byte)(1) ;
      }
      if ( ! (0==AV40TFCliCod_To) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int11[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV42TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV41TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV42TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int11[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60TFBarTipDis_Sel)==0) && ( ! (GXutil.strcmp("", AV59TFBarTipDis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarTipDis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60TFBarTipDis_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarTipDis = ?)");
      }
      else
      {
         GXv_int11[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV44TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV43TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV44TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int11[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV46TFBarSerDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV45TFBarSerDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV46TFBarSerDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int11[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV48TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV47TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV48TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int11[11] = (byte)(1) ;
      }
      if ( ! (0==AV49TFBarColNum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int11[12] = (byte)(1) ;
      }
      if ( ! (0==AV50TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int11[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62TFBarNomCli_Sel)==0) && ( ! (GXutil.strcmp("", AV61TFBarNomCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62TFBarNomCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int11[15] = (byte)(1) ;
      }
      if ( ! (0==AV63TFBarNumCli) )
      {
         addWhere(sWhereString, "(T1.BarNumCli >= ?)");
      }
      else
      {
         GXv_int11[16] = (byte)(1) ;
      }
      if ( ! (0==AV64TFBarNumCli_To) )
      {
         addWhere(sWhereString, "(T1.BarNumCli <= ?)");
      }
      else
      {
         GXv_int11[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66TFBarMaqCod_Sel)==0) && ( ! (GXutil.strcmp("", AV65TFBarMaqCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66TFBarMaqCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarMaqCod = ?)");
      }
      else
      {
         GXv_int11[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV69TFBarKgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int11[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70TFBarKgm_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int11[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71TFBarMtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int11[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72TFBarMtr_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int11[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74TFBarAcaQui_Sel)==0) && ( ! (GXutil.strcmp("", AV73TFBarAcaQui)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAcaQui) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74TFBarAcaQui_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAcaQui = ?)");
      }
      else
      {
         GXv_int11[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78TFBarAgrEst_Sel)==0) && ( ! (GXutil.strcmp("", AV77TFBarAgrEst)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAgrEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78TFBarAgrEst_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAgrEst = ?)");
      }
      else
      {
         GXv_int11[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV82BarFecGenfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int11[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV83BarFecGento)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int11[29] = (byte)(1) ;
      }
      if ( ! (0==AV84BarSitfrom) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int11[30] = (byte)(1) ;
      }
      if ( ! (0==AV85BarSitto) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int11[31] = (byte)(1) ;
      }
      if ( ! (0==AV79BarCodIN) )
      {
         addWhere(sWhereString, "(T1.BarCod = ?)");
      }
      else
      {
         GXv_int11[32] = (byte)(1) ;
      }
      if ( ! (0==AV80BarCodreoIN) )
      {
         addWhere(sWhereString, "(T1.BarCodReo = ?)");
      }
      else
      {
         GXv_int11[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81BarCodparIN)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int11[34] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar" ;
      GXv_Object12[0] = scmdbuf ;
      GXv_Object12[1] = GXv_int11 ;
      return GXv_Object12 ;
   }

   protected Object[] conditional_P09KE7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV39TFCliCod ,
                                          int AV40TFCliCod_To ,
                                          String AV42TFCliNom_Sel ,
                                          String AV41TFCliNom ,
                                          String AV60TFBarTipDis_Sel ,
                                          String AV59TFBarTipDis ,
                                          String AV44TFBarSer_Sel ,
                                          String AV43TFBarSer ,
                                          String AV46TFBarSerDsc_Sel ,
                                          String AV45TFBarSerDsc ,
                                          String AV48TFBarColNom_Sel ,
                                          String AV47TFBarColNom ,
                                          int AV49TFBarColNum ,
                                          int AV50TFBarColNum_To ,
                                          String AV62TFBarNomCli_Sel ,
                                          String AV61TFBarNomCli ,
                                          int AV63TFBarNumCli ,
                                          int AV64TFBarNumCli_To ,
                                          String AV66TFBarMaqCod_Sel ,
                                          String AV65TFBarMaqCod ,
                                          java.math.BigDecimal AV69TFBarKgm ,
                                          java.math.BigDecimal AV70TFBarKgm_To ,
                                          java.math.BigDecimal AV71TFBarMtr ,
                                          java.math.BigDecimal AV72TFBarMtr_To ,
                                          String AV74TFBarAcaQui_Sel ,
                                          String AV73TFBarAcaQui ,
                                          String AV78TFBarAgrEst_Sel ,
                                          String AV77TFBarAgrEst ,
                                          java.util.Date AV82BarFecGenfrom ,
                                          java.util.Date AV83BarFecGento ,
                                          byte AV84BarSitfrom ,
                                          byte AV85BarSitto ,
                                          int AV79BarCodIN ,
                                          byte AV80BarCodreoIN ,
                                          String AV81BarCodparIN ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A2010BarTipDis ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A1234BarNomCli ,
                                          int A1235BarNumCli ,
                                          String A180BarMaqCod ,
                                          java.math.BigDecimal A166BarKgm ,
                                          java.math.BigDecimal A184BarMtr ,
                                          String A118BarAcaQui ,
                                          String A120BarAgrEst ,
                                          java.util.Date A159BarFecGen ,
                                          byte A213BarSit ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String AV32FilterFullText ,
                                          String A13878PedidoClie ,
                                          String A13696BarNHdr ,
                                          int A198BarPie ,
                                          String AV36TFPedidoCliente_Sel ,
                                          String AV35TFPedidoCliente ,
                                          int AV67TFBarPie ,
                                          int AV68TFBarPie_To ,
                                          byte AV88TFBarHayAlb_Sel ,
                                          byte A14502BarHayAlb )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int13 = new byte[35];
      Object[] GXv_Object14 = new Object[2];
      scmdbuf = "SELECT T1.BarTipDis, T1.BarFecGen, T1.BarAgrEst, T1.BarAcaQui, T1.BarMaqCod, T1.BarSit, T1.BarNumCli, T1.BarNomCli, T1.BarColNum, T1.BarColNom, T1.BarSerDsc, T1.BarSer," ;
      scmdbuf += " RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar AS BarNHdr, T2.CliNom, T1.CliCod," ;
      scmdbuf += " COALESCE( T3.BarMtr, 0) AS BarMtr, COALESCE( T3.BarKgm, 0) AS BarKgm, T1.BarDisNum, T1.BarEncCli, COALESCE( T3.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T3.BarPieNDes," ;
      scmdbuf += " 0) AS BarPieNDes, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod FROM ((TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      scmdbuf += " LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM" ;
      scmdbuf += " TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar)" ;
      if ( ! (0==AV39TFCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int13[0] = (byte)(1) ;
      }
      if ( ! (0==AV40TFCliCod_To) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int13[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV42TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV41TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV42TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int13[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60TFBarTipDis_Sel)==0) && ( ! (GXutil.strcmp("", AV59TFBarTipDis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarTipDis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60TFBarTipDis_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarTipDis = ?)");
      }
      else
      {
         GXv_int13[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV44TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV43TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV44TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int13[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV46TFBarSerDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV45TFBarSerDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV46TFBarSerDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int13[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV48TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV47TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV48TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int13[11] = (byte)(1) ;
      }
      if ( ! (0==AV49TFBarColNum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int13[12] = (byte)(1) ;
      }
      if ( ! (0==AV50TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int13[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62TFBarNomCli_Sel)==0) && ( ! (GXutil.strcmp("", AV61TFBarNomCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62TFBarNomCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int13[15] = (byte)(1) ;
      }
      if ( ! (0==AV63TFBarNumCli) )
      {
         addWhere(sWhereString, "(T1.BarNumCli >= ?)");
      }
      else
      {
         GXv_int13[16] = (byte)(1) ;
      }
      if ( ! (0==AV64TFBarNumCli_To) )
      {
         addWhere(sWhereString, "(T1.BarNumCli <= ?)");
      }
      else
      {
         GXv_int13[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66TFBarMaqCod_Sel)==0) && ( ! (GXutil.strcmp("", AV65TFBarMaqCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66TFBarMaqCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarMaqCod = ?)");
      }
      else
      {
         GXv_int13[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV69TFBarKgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int13[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70TFBarKgm_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int13[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71TFBarMtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int13[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72TFBarMtr_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int13[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74TFBarAcaQui_Sel)==0) && ( ! (GXutil.strcmp("", AV73TFBarAcaQui)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAcaQui) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74TFBarAcaQui_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAcaQui = ?)");
      }
      else
      {
         GXv_int13[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78TFBarAgrEst_Sel)==0) && ( ! (GXutil.strcmp("", AV77TFBarAgrEst)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAgrEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78TFBarAgrEst_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAgrEst = ?)");
      }
      else
      {
         GXv_int13[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV82BarFecGenfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int13[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV83BarFecGento)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int13[29] = (byte)(1) ;
      }
      if ( ! (0==AV84BarSitfrom) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int13[30] = (byte)(1) ;
      }
      if ( ! (0==AV85BarSitto) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int13[31] = (byte)(1) ;
      }
      if ( ! (0==AV79BarCodIN) )
      {
         addWhere(sWhereString, "(T1.BarCod = ?)");
      }
      else
      {
         GXv_int13[32] = (byte)(1) ;
      }
      if ( ! (0==AV80BarCodreoIN) )
      {
         addWhere(sWhereString, "(T1.BarCodReo = ?)");
      }
      else
      {
         GXv_int13[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81BarCodparIN)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int13[34] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.BarTipDis" ;
      GXv_Object14[0] = scmdbuf ;
      GXv_Object14[1] = GXv_int13 ;
      return GXv_Object14 ;
   }

   protected Object[] conditional_P09KE9( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV39TFCliCod ,
                                          int AV40TFCliCod_To ,
                                          String AV42TFCliNom_Sel ,
                                          String AV41TFCliNom ,
                                          String AV60TFBarTipDis_Sel ,
                                          String AV59TFBarTipDis ,
                                          String AV44TFBarSer_Sel ,
                                          String AV43TFBarSer ,
                                          String AV46TFBarSerDsc_Sel ,
                                          String AV45TFBarSerDsc ,
                                          String AV48TFBarColNom_Sel ,
                                          String AV47TFBarColNom ,
                                          int AV49TFBarColNum ,
                                          int AV50TFBarColNum_To ,
                                          String AV62TFBarNomCli_Sel ,
                                          String AV61TFBarNomCli ,
                                          int AV63TFBarNumCli ,
                                          int AV64TFBarNumCli_To ,
                                          String AV66TFBarMaqCod_Sel ,
                                          String AV65TFBarMaqCod ,
                                          java.math.BigDecimal AV69TFBarKgm ,
                                          java.math.BigDecimal AV70TFBarKgm_To ,
                                          java.math.BigDecimal AV71TFBarMtr ,
                                          java.math.BigDecimal AV72TFBarMtr_To ,
                                          String AV74TFBarAcaQui_Sel ,
                                          String AV73TFBarAcaQui ,
                                          String AV78TFBarAgrEst_Sel ,
                                          String AV77TFBarAgrEst ,
                                          java.util.Date AV82BarFecGenfrom ,
                                          java.util.Date AV83BarFecGento ,
                                          byte AV84BarSitfrom ,
                                          byte AV85BarSitto ,
                                          int AV79BarCodIN ,
                                          byte AV80BarCodreoIN ,
                                          String AV81BarCodparIN ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A2010BarTipDis ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A1234BarNomCli ,
                                          int A1235BarNumCli ,
                                          String A180BarMaqCod ,
                                          java.math.BigDecimal A166BarKgm ,
                                          java.math.BigDecimal A184BarMtr ,
                                          String A118BarAcaQui ,
                                          String A120BarAgrEst ,
                                          java.util.Date A159BarFecGen ,
                                          byte A213BarSit ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String AV32FilterFullText ,
                                          String A13878PedidoClie ,
                                          String A13696BarNHdr ,
                                          int A198BarPie ,
                                          String AV36TFPedidoCliente_Sel ,
                                          String AV35TFPedidoCliente ,
                                          int AV67TFBarPie ,
                                          int AV68TFBarPie_To ,
                                          byte AV88TFBarHayAlb_Sel ,
                                          byte A14502BarHayAlb )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int15 = new byte[35];
      Object[] GXv_Object16 = new Object[2];
      scmdbuf = "SELECT T1.BarSer, T1.BarFecGen, T1.BarAgrEst, T1.BarAcaQui, T1.BarMaqCod, T1.BarSit, T1.BarNumCli, T1.BarNomCli, T1.BarColNum, T1.BarColNom, T1.BarSerDsc, T1.BarTipDis," ;
      scmdbuf += " RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar AS BarNHdr, T2.CliNom, T1.CliCod," ;
      scmdbuf += " COALESCE( T3.BarMtr, 0) AS BarMtr, COALESCE( T3.BarKgm, 0) AS BarKgm, T1.BarDisNum, T1.BarEncCli, COALESCE( T3.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T3.BarPieNDes," ;
      scmdbuf += " 0) AS BarPieNDes, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod FROM ((TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      scmdbuf += " LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM" ;
      scmdbuf += " TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar)" ;
      if ( ! (0==AV39TFCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int15[0] = (byte)(1) ;
      }
      if ( ! (0==AV40TFCliCod_To) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int15[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV42TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV41TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV42TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int15[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60TFBarTipDis_Sel)==0) && ( ! (GXutil.strcmp("", AV59TFBarTipDis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarTipDis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60TFBarTipDis_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarTipDis = ?)");
      }
      else
      {
         GXv_int15[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV44TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV43TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV44TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int15[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV46TFBarSerDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV45TFBarSerDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV46TFBarSerDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int15[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV48TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV47TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV48TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int15[11] = (byte)(1) ;
      }
      if ( ! (0==AV49TFBarColNum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int15[12] = (byte)(1) ;
      }
      if ( ! (0==AV50TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int15[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62TFBarNomCli_Sel)==0) && ( ! (GXutil.strcmp("", AV61TFBarNomCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62TFBarNomCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int15[15] = (byte)(1) ;
      }
      if ( ! (0==AV63TFBarNumCli) )
      {
         addWhere(sWhereString, "(T1.BarNumCli >= ?)");
      }
      else
      {
         GXv_int15[16] = (byte)(1) ;
      }
      if ( ! (0==AV64TFBarNumCli_To) )
      {
         addWhere(sWhereString, "(T1.BarNumCli <= ?)");
      }
      else
      {
         GXv_int15[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66TFBarMaqCod_Sel)==0) && ( ! (GXutil.strcmp("", AV65TFBarMaqCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66TFBarMaqCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarMaqCod = ?)");
      }
      else
      {
         GXv_int15[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV69TFBarKgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int15[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70TFBarKgm_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int15[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71TFBarMtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int15[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72TFBarMtr_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int15[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74TFBarAcaQui_Sel)==0) && ( ! (GXutil.strcmp("", AV73TFBarAcaQui)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAcaQui) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74TFBarAcaQui_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAcaQui = ?)");
      }
      else
      {
         GXv_int15[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78TFBarAgrEst_Sel)==0) && ( ! (GXutil.strcmp("", AV77TFBarAgrEst)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAgrEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78TFBarAgrEst_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAgrEst = ?)");
      }
      else
      {
         GXv_int15[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV82BarFecGenfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int15[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV83BarFecGento)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int15[29] = (byte)(1) ;
      }
      if ( ! (0==AV84BarSitfrom) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int15[30] = (byte)(1) ;
      }
      if ( ! (0==AV85BarSitto) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int15[31] = (byte)(1) ;
      }
      if ( ! (0==AV79BarCodIN) )
      {
         addWhere(sWhereString, "(T1.BarCod = ?)");
      }
      else
      {
         GXv_int15[32] = (byte)(1) ;
      }
      if ( ! (0==AV80BarCodreoIN) )
      {
         addWhere(sWhereString, "(T1.BarCodReo = ?)");
      }
      else
      {
         GXv_int15[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81BarCodparIN)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int15[34] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.BarSer" ;
      GXv_Object16[0] = scmdbuf ;
      GXv_Object16[1] = GXv_int15 ;
      return GXv_Object16 ;
   }

   protected Object[] conditional_P09KE11( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           int AV39TFCliCod ,
                                           int AV40TFCliCod_To ,
                                           String AV42TFCliNom_Sel ,
                                           String AV41TFCliNom ,
                                           String AV60TFBarTipDis_Sel ,
                                           String AV59TFBarTipDis ,
                                           String AV44TFBarSer_Sel ,
                                           String AV43TFBarSer ,
                                           String AV46TFBarSerDsc_Sel ,
                                           String AV45TFBarSerDsc ,
                                           String AV48TFBarColNom_Sel ,
                                           String AV47TFBarColNom ,
                                           int AV49TFBarColNum ,
                                           int AV50TFBarColNum_To ,
                                           String AV62TFBarNomCli_Sel ,
                                           String AV61TFBarNomCli ,
                                           int AV63TFBarNumCli ,
                                           int AV64TFBarNumCli_To ,
                                           String AV66TFBarMaqCod_Sel ,
                                           String AV65TFBarMaqCod ,
                                           java.math.BigDecimal AV69TFBarKgm ,
                                           java.math.BigDecimal AV70TFBarKgm_To ,
                                           java.math.BigDecimal AV71TFBarMtr ,
                                           java.math.BigDecimal AV72TFBarMtr_To ,
                                           String AV74TFBarAcaQui_Sel ,
                                           String AV73TFBarAcaQui ,
                                           String AV78TFBarAgrEst_Sel ,
                                           String AV77TFBarAgrEst ,
                                           java.util.Date AV82BarFecGenfrom ,
                                           java.util.Date AV83BarFecGento ,
                                           byte AV84BarSitfrom ,
                                           byte AV85BarSitto ,
                                           int AV79BarCodIN ,
                                           byte AV80BarCodreoIN ,
                                           String AV81BarCodparIN ,
                                           int A252CliCod ,
                                           String A279CliNom ,
                                           String A2010BarTipDis ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           String A1234BarNomCli ,
                                           int A1235BarNumCli ,
                                           String A180BarMaqCod ,
                                           java.math.BigDecimal A166BarKgm ,
                                           java.math.BigDecimal A184BarMtr ,
                                           String A118BarAcaQui ,
                                           String A120BarAgrEst ,
                                           java.util.Date A159BarFecGen ,
                                           byte A213BarSit ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           String AV32FilterFullText ,
                                           String A13878PedidoClie ,
                                           String A13696BarNHdr ,
                                           int A198BarPie ,
                                           String AV36TFPedidoCliente_Sel ,
                                           String AV35TFPedidoCliente ,
                                           int AV67TFBarPie ,
                                           int AV68TFBarPie_To ,
                                           byte AV88TFBarHayAlb_Sel ,
                                           byte A14502BarHayAlb )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int17 = new byte[35];
      Object[] GXv_Object18 = new Object[2];
      scmdbuf = "SELECT T1.BarSerDsc, T1.BarFecGen, T1.BarAgrEst, T1.BarAcaQui, T1.BarMaqCod, T1.BarSit, T1.BarNumCli, T1.BarNomCli, T1.BarColNum, T1.BarColNom, T1.BarSer, T1.BarTipDis," ;
      scmdbuf += " RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar AS BarNHdr, T2.CliNom, T1.CliCod," ;
      scmdbuf += " COALESCE( T3.BarMtr, 0) AS BarMtr, COALESCE( T3.BarKgm, 0) AS BarKgm, T1.BarDisNum, T1.BarEncCli, COALESCE( T3.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T3.BarPieNDes," ;
      scmdbuf += " 0) AS BarPieNDes, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod FROM ((TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      scmdbuf += " LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM" ;
      scmdbuf += " TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar)" ;
      if ( ! (0==AV39TFCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int17[0] = (byte)(1) ;
      }
      if ( ! (0==AV40TFCliCod_To) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int17[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV42TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV41TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV42TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int17[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60TFBarTipDis_Sel)==0) && ( ! (GXutil.strcmp("", AV59TFBarTipDis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarTipDis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60TFBarTipDis_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarTipDis = ?)");
      }
      else
      {
         GXv_int17[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV44TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV43TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV44TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int17[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV46TFBarSerDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV45TFBarSerDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV46TFBarSerDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int17[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV48TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV47TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV48TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int17[11] = (byte)(1) ;
      }
      if ( ! (0==AV49TFBarColNum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int17[12] = (byte)(1) ;
      }
      if ( ! (0==AV50TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int17[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62TFBarNomCli_Sel)==0) && ( ! (GXutil.strcmp("", AV61TFBarNomCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62TFBarNomCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int17[15] = (byte)(1) ;
      }
      if ( ! (0==AV63TFBarNumCli) )
      {
         addWhere(sWhereString, "(T1.BarNumCli >= ?)");
      }
      else
      {
         GXv_int17[16] = (byte)(1) ;
      }
      if ( ! (0==AV64TFBarNumCli_To) )
      {
         addWhere(sWhereString, "(T1.BarNumCli <= ?)");
      }
      else
      {
         GXv_int17[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66TFBarMaqCod_Sel)==0) && ( ! (GXutil.strcmp("", AV65TFBarMaqCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66TFBarMaqCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarMaqCod = ?)");
      }
      else
      {
         GXv_int17[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV69TFBarKgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int17[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70TFBarKgm_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int17[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71TFBarMtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int17[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72TFBarMtr_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int17[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74TFBarAcaQui_Sel)==0) && ( ! (GXutil.strcmp("", AV73TFBarAcaQui)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAcaQui) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74TFBarAcaQui_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAcaQui = ?)");
      }
      else
      {
         GXv_int17[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78TFBarAgrEst_Sel)==0) && ( ! (GXutil.strcmp("", AV77TFBarAgrEst)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAgrEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78TFBarAgrEst_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAgrEst = ?)");
      }
      else
      {
         GXv_int17[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV82BarFecGenfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int17[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV83BarFecGento)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int17[29] = (byte)(1) ;
      }
      if ( ! (0==AV84BarSitfrom) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int17[30] = (byte)(1) ;
      }
      if ( ! (0==AV85BarSitto) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int17[31] = (byte)(1) ;
      }
      if ( ! (0==AV79BarCodIN) )
      {
         addWhere(sWhereString, "(T1.BarCod = ?)");
      }
      else
      {
         GXv_int17[32] = (byte)(1) ;
      }
      if ( ! (0==AV80BarCodreoIN) )
      {
         addWhere(sWhereString, "(T1.BarCodReo = ?)");
      }
      else
      {
         GXv_int17[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81BarCodparIN)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int17[34] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.BarSerDsc" ;
      GXv_Object18[0] = scmdbuf ;
      GXv_Object18[1] = GXv_int17 ;
      return GXv_Object18 ;
   }

   protected Object[] conditional_P09KE13( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           int AV39TFCliCod ,
                                           int AV40TFCliCod_To ,
                                           String AV42TFCliNom_Sel ,
                                           String AV41TFCliNom ,
                                           String AV60TFBarTipDis_Sel ,
                                           String AV59TFBarTipDis ,
                                           String AV44TFBarSer_Sel ,
                                           String AV43TFBarSer ,
                                           String AV46TFBarSerDsc_Sel ,
                                           String AV45TFBarSerDsc ,
                                           String AV48TFBarColNom_Sel ,
                                           String AV47TFBarColNom ,
                                           int AV49TFBarColNum ,
                                           int AV50TFBarColNum_To ,
                                           String AV62TFBarNomCli_Sel ,
                                           String AV61TFBarNomCli ,
                                           int AV63TFBarNumCli ,
                                           int AV64TFBarNumCli_To ,
                                           String AV66TFBarMaqCod_Sel ,
                                           String AV65TFBarMaqCod ,
                                           java.math.BigDecimal AV69TFBarKgm ,
                                           java.math.BigDecimal AV70TFBarKgm_To ,
                                           java.math.BigDecimal AV71TFBarMtr ,
                                           java.math.BigDecimal AV72TFBarMtr_To ,
                                           String AV74TFBarAcaQui_Sel ,
                                           String AV73TFBarAcaQui ,
                                           String AV78TFBarAgrEst_Sel ,
                                           String AV77TFBarAgrEst ,
                                           java.util.Date AV82BarFecGenfrom ,
                                           java.util.Date AV83BarFecGento ,
                                           byte AV84BarSitfrom ,
                                           byte AV85BarSitto ,
                                           int AV79BarCodIN ,
                                           byte AV80BarCodreoIN ,
                                           String AV81BarCodparIN ,
                                           int A252CliCod ,
                                           String A279CliNom ,
                                           String A2010BarTipDis ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           String A1234BarNomCli ,
                                           int A1235BarNumCli ,
                                           String A180BarMaqCod ,
                                           java.math.BigDecimal A166BarKgm ,
                                           java.math.BigDecimal A184BarMtr ,
                                           String A118BarAcaQui ,
                                           String A120BarAgrEst ,
                                           java.util.Date A159BarFecGen ,
                                           byte A213BarSit ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           String AV32FilterFullText ,
                                           String A13878PedidoClie ,
                                           String A13696BarNHdr ,
                                           int A198BarPie ,
                                           String AV36TFPedidoCliente_Sel ,
                                           String AV35TFPedidoCliente ,
                                           int AV67TFBarPie ,
                                           int AV68TFBarPie_To ,
                                           byte AV88TFBarHayAlb_Sel ,
                                           byte A14502BarHayAlb )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int19 = new byte[35];
      Object[] GXv_Object20 = new Object[2];
      scmdbuf = "SELECT T1.BarColNom, T1.BarFecGen, T1.BarAgrEst, T1.BarAcaQui, T1.BarMaqCod, T1.BarSit, T1.BarNumCli, T1.BarNomCli, T1.BarColNum, T1.BarSerDsc, T1.BarSer, T1.BarTipDis," ;
      scmdbuf += " RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar AS BarNHdr, T2.CliNom, T1.CliCod," ;
      scmdbuf += " COALESCE( T3.BarMtr, 0) AS BarMtr, COALESCE( T3.BarKgm, 0) AS BarKgm, T1.BarDisNum, T1.BarEncCli, COALESCE( T3.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T3.BarPieNDes," ;
      scmdbuf += " 0) AS BarPieNDes, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod FROM ((TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      scmdbuf += " LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM" ;
      scmdbuf += " TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar)" ;
      if ( ! (0==AV39TFCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int19[0] = (byte)(1) ;
      }
      if ( ! (0==AV40TFCliCod_To) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int19[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV42TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV41TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV42TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int19[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60TFBarTipDis_Sel)==0) && ( ! (GXutil.strcmp("", AV59TFBarTipDis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarTipDis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60TFBarTipDis_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarTipDis = ?)");
      }
      else
      {
         GXv_int19[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV44TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV43TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV44TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int19[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV46TFBarSerDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV45TFBarSerDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV46TFBarSerDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int19[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV48TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV47TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV48TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int19[11] = (byte)(1) ;
      }
      if ( ! (0==AV49TFBarColNum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int19[12] = (byte)(1) ;
      }
      if ( ! (0==AV50TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int19[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62TFBarNomCli_Sel)==0) && ( ! (GXutil.strcmp("", AV61TFBarNomCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62TFBarNomCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int19[15] = (byte)(1) ;
      }
      if ( ! (0==AV63TFBarNumCli) )
      {
         addWhere(sWhereString, "(T1.BarNumCli >= ?)");
      }
      else
      {
         GXv_int19[16] = (byte)(1) ;
      }
      if ( ! (0==AV64TFBarNumCli_To) )
      {
         addWhere(sWhereString, "(T1.BarNumCli <= ?)");
      }
      else
      {
         GXv_int19[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66TFBarMaqCod_Sel)==0) && ( ! (GXutil.strcmp("", AV65TFBarMaqCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66TFBarMaqCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarMaqCod = ?)");
      }
      else
      {
         GXv_int19[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV69TFBarKgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int19[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70TFBarKgm_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int19[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71TFBarMtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int19[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72TFBarMtr_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int19[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74TFBarAcaQui_Sel)==0) && ( ! (GXutil.strcmp("", AV73TFBarAcaQui)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAcaQui) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74TFBarAcaQui_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAcaQui = ?)");
      }
      else
      {
         GXv_int19[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78TFBarAgrEst_Sel)==0) && ( ! (GXutil.strcmp("", AV77TFBarAgrEst)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAgrEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78TFBarAgrEst_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAgrEst = ?)");
      }
      else
      {
         GXv_int19[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV82BarFecGenfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int19[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV83BarFecGento)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int19[29] = (byte)(1) ;
      }
      if ( ! (0==AV84BarSitfrom) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int19[30] = (byte)(1) ;
      }
      if ( ! (0==AV85BarSitto) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int19[31] = (byte)(1) ;
      }
      if ( ! (0==AV79BarCodIN) )
      {
         addWhere(sWhereString, "(T1.BarCod = ?)");
      }
      else
      {
         GXv_int19[32] = (byte)(1) ;
      }
      if ( ! (0==AV80BarCodreoIN) )
      {
         addWhere(sWhereString, "(T1.BarCodReo = ?)");
      }
      else
      {
         GXv_int19[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81BarCodparIN)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int19[34] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.BarColNom" ;
      GXv_Object20[0] = scmdbuf ;
      GXv_Object20[1] = GXv_int19 ;
      return GXv_Object20 ;
   }

   protected Object[] conditional_P09KE15( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           int AV39TFCliCod ,
                                           int AV40TFCliCod_To ,
                                           String AV42TFCliNom_Sel ,
                                           String AV41TFCliNom ,
                                           String AV60TFBarTipDis_Sel ,
                                           String AV59TFBarTipDis ,
                                           String AV44TFBarSer_Sel ,
                                           String AV43TFBarSer ,
                                           String AV46TFBarSerDsc_Sel ,
                                           String AV45TFBarSerDsc ,
                                           String AV48TFBarColNom_Sel ,
                                           String AV47TFBarColNom ,
                                           int AV49TFBarColNum ,
                                           int AV50TFBarColNum_To ,
                                           String AV62TFBarNomCli_Sel ,
                                           String AV61TFBarNomCli ,
                                           int AV63TFBarNumCli ,
                                           int AV64TFBarNumCli_To ,
                                           String AV66TFBarMaqCod_Sel ,
                                           String AV65TFBarMaqCod ,
                                           java.math.BigDecimal AV69TFBarKgm ,
                                           java.math.BigDecimal AV70TFBarKgm_To ,
                                           java.math.BigDecimal AV71TFBarMtr ,
                                           java.math.BigDecimal AV72TFBarMtr_To ,
                                           String AV74TFBarAcaQui_Sel ,
                                           String AV73TFBarAcaQui ,
                                           String AV78TFBarAgrEst_Sel ,
                                           String AV77TFBarAgrEst ,
                                           java.util.Date AV82BarFecGenfrom ,
                                           java.util.Date AV83BarFecGento ,
                                           byte AV84BarSitfrom ,
                                           byte AV85BarSitto ,
                                           int AV79BarCodIN ,
                                           byte AV80BarCodreoIN ,
                                           String AV81BarCodparIN ,
                                           int A252CliCod ,
                                           String A279CliNom ,
                                           String A2010BarTipDis ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           String A1234BarNomCli ,
                                           int A1235BarNumCli ,
                                           String A180BarMaqCod ,
                                           java.math.BigDecimal A166BarKgm ,
                                           java.math.BigDecimal A184BarMtr ,
                                           String A118BarAcaQui ,
                                           String A120BarAgrEst ,
                                           java.util.Date A159BarFecGen ,
                                           byte A213BarSit ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           String AV32FilterFullText ,
                                           String A13878PedidoClie ,
                                           String A13696BarNHdr ,
                                           int A198BarPie ,
                                           String AV36TFPedidoCliente_Sel ,
                                           String AV35TFPedidoCliente ,
                                           int AV67TFBarPie ,
                                           int AV68TFBarPie_To ,
                                           byte AV88TFBarHayAlb_Sel ,
                                           byte A14502BarHayAlb )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int21 = new byte[35];
      Object[] GXv_Object22 = new Object[2];
      scmdbuf = "SELECT T1.BarNomCli, T1.BarFecGen, T1.BarAgrEst, T1.BarAcaQui, T1.BarMaqCod, T1.BarSit, T1.BarNumCli, T1.BarColNum, T1.BarColNom, T1.BarSerDsc, T1.BarSer, T1.BarTipDis," ;
      scmdbuf += " RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar AS BarNHdr, T2.CliNom, T1.CliCod," ;
      scmdbuf += " COALESCE( T3.BarMtr, 0) AS BarMtr, COALESCE( T3.BarKgm, 0) AS BarKgm, T1.BarDisNum, T1.BarEncCli, COALESCE( T3.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T3.BarPieNDes," ;
      scmdbuf += " 0) AS BarPieNDes, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod FROM ((TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      scmdbuf += " LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM" ;
      scmdbuf += " TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar)" ;
      if ( ! (0==AV39TFCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int21[0] = (byte)(1) ;
      }
      if ( ! (0==AV40TFCliCod_To) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int21[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV42TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV41TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV42TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int21[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60TFBarTipDis_Sel)==0) && ( ! (GXutil.strcmp("", AV59TFBarTipDis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarTipDis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60TFBarTipDis_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarTipDis = ?)");
      }
      else
      {
         GXv_int21[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV44TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV43TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV44TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int21[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV46TFBarSerDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV45TFBarSerDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV46TFBarSerDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int21[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV48TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV47TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV48TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int21[11] = (byte)(1) ;
      }
      if ( ! (0==AV49TFBarColNum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int21[12] = (byte)(1) ;
      }
      if ( ! (0==AV50TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int21[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62TFBarNomCli_Sel)==0) && ( ! (GXutil.strcmp("", AV61TFBarNomCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62TFBarNomCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int21[15] = (byte)(1) ;
      }
      if ( ! (0==AV63TFBarNumCli) )
      {
         addWhere(sWhereString, "(T1.BarNumCli >= ?)");
      }
      else
      {
         GXv_int21[16] = (byte)(1) ;
      }
      if ( ! (0==AV64TFBarNumCli_To) )
      {
         addWhere(sWhereString, "(T1.BarNumCli <= ?)");
      }
      else
      {
         GXv_int21[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66TFBarMaqCod_Sel)==0) && ( ! (GXutil.strcmp("", AV65TFBarMaqCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66TFBarMaqCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarMaqCod = ?)");
      }
      else
      {
         GXv_int21[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV69TFBarKgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int21[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70TFBarKgm_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int21[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71TFBarMtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int21[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72TFBarMtr_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int21[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74TFBarAcaQui_Sel)==0) && ( ! (GXutil.strcmp("", AV73TFBarAcaQui)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAcaQui) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74TFBarAcaQui_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAcaQui = ?)");
      }
      else
      {
         GXv_int21[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78TFBarAgrEst_Sel)==0) && ( ! (GXutil.strcmp("", AV77TFBarAgrEst)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAgrEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78TFBarAgrEst_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAgrEst = ?)");
      }
      else
      {
         GXv_int21[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV82BarFecGenfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int21[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV83BarFecGento)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int21[29] = (byte)(1) ;
      }
      if ( ! (0==AV84BarSitfrom) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int21[30] = (byte)(1) ;
      }
      if ( ! (0==AV85BarSitto) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int21[31] = (byte)(1) ;
      }
      if ( ! (0==AV79BarCodIN) )
      {
         addWhere(sWhereString, "(T1.BarCod = ?)");
      }
      else
      {
         GXv_int21[32] = (byte)(1) ;
      }
      if ( ! (0==AV80BarCodreoIN) )
      {
         addWhere(sWhereString, "(T1.BarCodReo = ?)");
      }
      else
      {
         GXv_int21[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81BarCodparIN)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int21[34] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.BarNomCli" ;
      GXv_Object22[0] = scmdbuf ;
      GXv_Object22[1] = GXv_int21 ;
      return GXv_Object22 ;
   }

   protected Object[] conditional_P09KE17( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           int AV39TFCliCod ,
                                           int AV40TFCliCod_To ,
                                           String AV42TFCliNom_Sel ,
                                           String AV41TFCliNom ,
                                           String AV60TFBarTipDis_Sel ,
                                           String AV59TFBarTipDis ,
                                           String AV44TFBarSer_Sel ,
                                           String AV43TFBarSer ,
                                           String AV46TFBarSerDsc_Sel ,
                                           String AV45TFBarSerDsc ,
                                           String AV48TFBarColNom_Sel ,
                                           String AV47TFBarColNom ,
                                           int AV49TFBarColNum ,
                                           int AV50TFBarColNum_To ,
                                           String AV62TFBarNomCli_Sel ,
                                           String AV61TFBarNomCli ,
                                           int AV63TFBarNumCli ,
                                           int AV64TFBarNumCli_To ,
                                           String AV66TFBarMaqCod_Sel ,
                                           String AV65TFBarMaqCod ,
                                           java.math.BigDecimal AV69TFBarKgm ,
                                           java.math.BigDecimal AV70TFBarKgm_To ,
                                           java.math.BigDecimal AV71TFBarMtr ,
                                           java.math.BigDecimal AV72TFBarMtr_To ,
                                           String AV74TFBarAcaQui_Sel ,
                                           String AV73TFBarAcaQui ,
                                           String AV78TFBarAgrEst_Sel ,
                                           String AV77TFBarAgrEst ,
                                           java.util.Date AV82BarFecGenfrom ,
                                           java.util.Date AV83BarFecGento ,
                                           byte AV84BarSitfrom ,
                                           byte AV85BarSitto ,
                                           int AV79BarCodIN ,
                                           byte AV80BarCodreoIN ,
                                           String AV81BarCodparIN ,
                                           int A252CliCod ,
                                           String A279CliNom ,
                                           String A2010BarTipDis ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           String A1234BarNomCli ,
                                           int A1235BarNumCli ,
                                           String A180BarMaqCod ,
                                           java.math.BigDecimal A166BarKgm ,
                                           java.math.BigDecimal A184BarMtr ,
                                           String A118BarAcaQui ,
                                           String A120BarAgrEst ,
                                           java.util.Date A159BarFecGen ,
                                           byte A213BarSit ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           String AV32FilterFullText ,
                                           String A13878PedidoClie ,
                                           String A13696BarNHdr ,
                                           int A198BarPie ,
                                           String AV36TFPedidoCliente_Sel ,
                                           String AV35TFPedidoCliente ,
                                           int AV67TFBarPie ,
                                           int AV68TFBarPie_To ,
                                           byte AV88TFBarHayAlb_Sel ,
                                           byte A14502BarHayAlb )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int23 = new byte[35];
      Object[] GXv_Object24 = new Object[2];
      scmdbuf = "SELECT T1.BarMaqCod, T1.BarFecGen, T1.BarAgrEst, T1.BarAcaQui, T1.BarSit, T1.BarNumCli, T1.BarNomCli, T1.BarColNum, T1.BarColNom, T1.BarSerDsc, T1.BarSer, T1.BarTipDis," ;
      scmdbuf += " RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar AS BarNHdr, T2.CliNom, T1.CliCod," ;
      scmdbuf += " COALESCE( T3.BarMtr, 0) AS BarMtr, COALESCE( T3.BarKgm, 0) AS BarKgm, T1.BarDisNum, T1.BarEncCli, COALESCE( T3.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T3.BarPieNDes," ;
      scmdbuf += " 0) AS BarPieNDes, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod FROM ((TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      scmdbuf += " LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM" ;
      scmdbuf += " TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar)" ;
      if ( ! (0==AV39TFCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int23[0] = (byte)(1) ;
      }
      if ( ! (0==AV40TFCliCod_To) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int23[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV42TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV41TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV42TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int23[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60TFBarTipDis_Sel)==0) && ( ! (GXutil.strcmp("", AV59TFBarTipDis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarTipDis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60TFBarTipDis_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarTipDis = ?)");
      }
      else
      {
         GXv_int23[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV44TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV43TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV44TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int23[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV46TFBarSerDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV45TFBarSerDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV46TFBarSerDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int23[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV48TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV47TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV48TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int23[11] = (byte)(1) ;
      }
      if ( ! (0==AV49TFBarColNum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int23[12] = (byte)(1) ;
      }
      if ( ! (0==AV50TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int23[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62TFBarNomCli_Sel)==0) && ( ! (GXutil.strcmp("", AV61TFBarNomCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62TFBarNomCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int23[15] = (byte)(1) ;
      }
      if ( ! (0==AV63TFBarNumCli) )
      {
         addWhere(sWhereString, "(T1.BarNumCli >= ?)");
      }
      else
      {
         GXv_int23[16] = (byte)(1) ;
      }
      if ( ! (0==AV64TFBarNumCli_To) )
      {
         addWhere(sWhereString, "(T1.BarNumCli <= ?)");
      }
      else
      {
         GXv_int23[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66TFBarMaqCod_Sel)==0) && ( ! (GXutil.strcmp("", AV65TFBarMaqCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66TFBarMaqCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarMaqCod = ?)");
      }
      else
      {
         GXv_int23[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV69TFBarKgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int23[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70TFBarKgm_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int23[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71TFBarMtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int23[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72TFBarMtr_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int23[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74TFBarAcaQui_Sel)==0) && ( ! (GXutil.strcmp("", AV73TFBarAcaQui)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAcaQui) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74TFBarAcaQui_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAcaQui = ?)");
      }
      else
      {
         GXv_int23[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78TFBarAgrEst_Sel)==0) && ( ! (GXutil.strcmp("", AV77TFBarAgrEst)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAgrEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78TFBarAgrEst_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAgrEst = ?)");
      }
      else
      {
         GXv_int23[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV82BarFecGenfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int23[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV83BarFecGento)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int23[29] = (byte)(1) ;
      }
      if ( ! (0==AV84BarSitfrom) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int23[30] = (byte)(1) ;
      }
      if ( ! (0==AV85BarSitto) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int23[31] = (byte)(1) ;
      }
      if ( ! (0==AV79BarCodIN) )
      {
         addWhere(sWhereString, "(T1.BarCod = ?)");
      }
      else
      {
         GXv_int23[32] = (byte)(1) ;
      }
      if ( ! (0==AV80BarCodreoIN) )
      {
         addWhere(sWhereString, "(T1.BarCodReo = ?)");
      }
      else
      {
         GXv_int23[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81BarCodparIN)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int23[34] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.BarMaqCod" ;
      GXv_Object24[0] = scmdbuf ;
      GXv_Object24[1] = GXv_int23 ;
      return GXv_Object24 ;
   }

   protected Object[] conditional_P09KE19( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           int AV39TFCliCod ,
                                           int AV40TFCliCod_To ,
                                           String AV42TFCliNom_Sel ,
                                           String AV41TFCliNom ,
                                           String AV60TFBarTipDis_Sel ,
                                           String AV59TFBarTipDis ,
                                           String AV44TFBarSer_Sel ,
                                           String AV43TFBarSer ,
                                           String AV46TFBarSerDsc_Sel ,
                                           String AV45TFBarSerDsc ,
                                           String AV48TFBarColNom_Sel ,
                                           String AV47TFBarColNom ,
                                           int AV49TFBarColNum ,
                                           int AV50TFBarColNum_To ,
                                           String AV62TFBarNomCli_Sel ,
                                           String AV61TFBarNomCli ,
                                           int AV63TFBarNumCli ,
                                           int AV64TFBarNumCli_To ,
                                           String AV66TFBarMaqCod_Sel ,
                                           String AV65TFBarMaqCod ,
                                           java.math.BigDecimal AV69TFBarKgm ,
                                           java.math.BigDecimal AV70TFBarKgm_To ,
                                           java.math.BigDecimal AV71TFBarMtr ,
                                           java.math.BigDecimal AV72TFBarMtr_To ,
                                           String AV74TFBarAcaQui_Sel ,
                                           String AV73TFBarAcaQui ,
                                           String AV78TFBarAgrEst_Sel ,
                                           String AV77TFBarAgrEst ,
                                           java.util.Date AV82BarFecGenfrom ,
                                           java.util.Date AV83BarFecGento ,
                                           byte AV84BarSitfrom ,
                                           byte AV85BarSitto ,
                                           int AV79BarCodIN ,
                                           byte AV80BarCodreoIN ,
                                           String AV81BarCodparIN ,
                                           int A252CliCod ,
                                           String A279CliNom ,
                                           String A2010BarTipDis ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           String A1234BarNomCli ,
                                           int A1235BarNumCli ,
                                           String A180BarMaqCod ,
                                           java.math.BigDecimal A166BarKgm ,
                                           java.math.BigDecimal A184BarMtr ,
                                           String A118BarAcaQui ,
                                           String A120BarAgrEst ,
                                           java.util.Date A159BarFecGen ,
                                           byte A213BarSit ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           String AV32FilterFullText ,
                                           String A13878PedidoClie ,
                                           String A13696BarNHdr ,
                                           int A198BarPie ,
                                           String AV36TFPedidoCliente_Sel ,
                                           String AV35TFPedidoCliente ,
                                           int AV67TFBarPie ,
                                           int AV68TFBarPie_To ,
                                           byte AV88TFBarHayAlb_Sel ,
                                           byte A14502BarHayAlb )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int25 = new byte[35];
      Object[] GXv_Object26 = new Object[2];
      scmdbuf = "SELECT T1.BarAcaQui, T1.BarFecGen, T1.BarAgrEst, T1.BarMaqCod, T1.BarSit, T1.BarNumCli, T1.BarNomCli, T1.BarColNum, T1.BarColNom, T1.BarSerDsc, T1.BarSer, T1.BarTipDis," ;
      scmdbuf += " RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar AS BarNHdr, T2.CliNom, T1.CliCod," ;
      scmdbuf += " COALESCE( T3.BarMtr, 0) AS BarMtr, COALESCE( T3.BarKgm, 0) AS BarKgm, T1.BarDisNum, T1.BarEncCli, COALESCE( T3.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T3.BarPieNDes," ;
      scmdbuf += " 0) AS BarPieNDes, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod FROM ((TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      scmdbuf += " LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM" ;
      scmdbuf += " TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar)" ;
      if ( ! (0==AV39TFCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int25[0] = (byte)(1) ;
      }
      if ( ! (0==AV40TFCliCod_To) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int25[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV42TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV41TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV42TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int25[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60TFBarTipDis_Sel)==0) && ( ! (GXutil.strcmp("", AV59TFBarTipDis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarTipDis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60TFBarTipDis_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarTipDis = ?)");
      }
      else
      {
         GXv_int25[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV44TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV43TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV44TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int25[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV46TFBarSerDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV45TFBarSerDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV46TFBarSerDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int25[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV48TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV47TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV48TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int25[11] = (byte)(1) ;
      }
      if ( ! (0==AV49TFBarColNum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int25[12] = (byte)(1) ;
      }
      if ( ! (0==AV50TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int25[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62TFBarNomCli_Sel)==0) && ( ! (GXutil.strcmp("", AV61TFBarNomCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62TFBarNomCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int25[15] = (byte)(1) ;
      }
      if ( ! (0==AV63TFBarNumCli) )
      {
         addWhere(sWhereString, "(T1.BarNumCli >= ?)");
      }
      else
      {
         GXv_int25[16] = (byte)(1) ;
      }
      if ( ! (0==AV64TFBarNumCli_To) )
      {
         addWhere(sWhereString, "(T1.BarNumCli <= ?)");
      }
      else
      {
         GXv_int25[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66TFBarMaqCod_Sel)==0) && ( ! (GXutil.strcmp("", AV65TFBarMaqCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66TFBarMaqCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarMaqCod = ?)");
      }
      else
      {
         GXv_int25[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV69TFBarKgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int25[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70TFBarKgm_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int25[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71TFBarMtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int25[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72TFBarMtr_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int25[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74TFBarAcaQui_Sel)==0) && ( ! (GXutil.strcmp("", AV73TFBarAcaQui)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAcaQui) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74TFBarAcaQui_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAcaQui = ?)");
      }
      else
      {
         GXv_int25[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78TFBarAgrEst_Sel)==0) && ( ! (GXutil.strcmp("", AV77TFBarAgrEst)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAgrEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78TFBarAgrEst_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAgrEst = ?)");
      }
      else
      {
         GXv_int25[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV82BarFecGenfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int25[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV83BarFecGento)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int25[29] = (byte)(1) ;
      }
      if ( ! (0==AV84BarSitfrom) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int25[30] = (byte)(1) ;
      }
      if ( ! (0==AV85BarSitto) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int25[31] = (byte)(1) ;
      }
      if ( ! (0==AV79BarCodIN) )
      {
         addWhere(sWhereString, "(T1.BarCod = ?)");
      }
      else
      {
         GXv_int25[32] = (byte)(1) ;
      }
      if ( ! (0==AV80BarCodreoIN) )
      {
         addWhere(sWhereString, "(T1.BarCodReo = ?)");
      }
      else
      {
         GXv_int25[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81BarCodparIN)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int25[34] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.BarAcaQui" ;
      GXv_Object26[0] = scmdbuf ;
      GXv_Object26[1] = GXv_int25 ;
      return GXv_Object26 ;
   }

   protected Object[] conditional_P09KE21( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           int AV39TFCliCod ,
                                           int AV40TFCliCod_To ,
                                           String AV42TFCliNom_Sel ,
                                           String AV41TFCliNom ,
                                           String AV60TFBarTipDis_Sel ,
                                           String AV59TFBarTipDis ,
                                           String AV44TFBarSer_Sel ,
                                           String AV43TFBarSer ,
                                           String AV46TFBarSerDsc_Sel ,
                                           String AV45TFBarSerDsc ,
                                           String AV48TFBarColNom_Sel ,
                                           String AV47TFBarColNom ,
                                           int AV49TFBarColNum ,
                                           int AV50TFBarColNum_To ,
                                           String AV62TFBarNomCli_Sel ,
                                           String AV61TFBarNomCli ,
                                           int AV63TFBarNumCli ,
                                           int AV64TFBarNumCli_To ,
                                           String AV66TFBarMaqCod_Sel ,
                                           String AV65TFBarMaqCod ,
                                           java.math.BigDecimal AV69TFBarKgm ,
                                           java.math.BigDecimal AV70TFBarKgm_To ,
                                           java.math.BigDecimal AV71TFBarMtr ,
                                           java.math.BigDecimal AV72TFBarMtr_To ,
                                           String AV74TFBarAcaQui_Sel ,
                                           String AV73TFBarAcaQui ,
                                           String AV78TFBarAgrEst_Sel ,
                                           String AV77TFBarAgrEst ,
                                           java.util.Date AV82BarFecGenfrom ,
                                           java.util.Date AV83BarFecGento ,
                                           byte AV84BarSitfrom ,
                                           byte AV85BarSitto ,
                                           int AV79BarCodIN ,
                                           byte AV80BarCodreoIN ,
                                           String AV81BarCodparIN ,
                                           int A252CliCod ,
                                           String A279CliNom ,
                                           String A2010BarTipDis ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           String A1234BarNomCli ,
                                           int A1235BarNumCli ,
                                           String A180BarMaqCod ,
                                           java.math.BigDecimal A166BarKgm ,
                                           java.math.BigDecimal A184BarMtr ,
                                           String A118BarAcaQui ,
                                           String A120BarAgrEst ,
                                           java.util.Date A159BarFecGen ,
                                           byte A213BarSit ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           String AV32FilterFullText ,
                                           String A13878PedidoClie ,
                                           String A13696BarNHdr ,
                                           int A198BarPie ,
                                           String AV36TFPedidoCliente_Sel ,
                                           String AV35TFPedidoCliente ,
                                           int AV67TFBarPie ,
                                           int AV68TFBarPie_To ,
                                           byte AV88TFBarHayAlb_Sel ,
                                           byte A14502BarHayAlb )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int27 = new byte[35];
      Object[] GXv_Object28 = new Object[2];
      scmdbuf = "SELECT T1.BarAgrEst, T1.BarFecGen, T1.BarAcaQui, T1.BarMaqCod, T1.BarSit, T1.BarNumCli, T1.BarNomCli, T1.BarColNum, T1.BarColNom, T1.BarSerDsc, T1.BarSer, T1.BarTipDis," ;
      scmdbuf += " RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar AS BarNHdr, T2.CliNom, T1.CliCod," ;
      scmdbuf += " COALESCE( T3.BarMtr, 0) AS BarMtr, COALESCE( T3.BarKgm, 0) AS BarKgm, T1.BarDisNum, T1.BarEncCli, COALESCE( T3.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T3.BarPieNDes," ;
      scmdbuf += " 0) AS BarPieNDes, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod FROM ((TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      scmdbuf += " LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM" ;
      scmdbuf += " TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar)" ;
      if ( ! (0==AV39TFCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int27[0] = (byte)(1) ;
      }
      if ( ! (0==AV40TFCliCod_To) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int27[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV42TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV41TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV42TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int27[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60TFBarTipDis_Sel)==0) && ( ! (GXutil.strcmp("", AV59TFBarTipDis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarTipDis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60TFBarTipDis_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarTipDis = ?)");
      }
      else
      {
         GXv_int27[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV44TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV43TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV44TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int27[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV46TFBarSerDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV45TFBarSerDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV46TFBarSerDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int27[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV48TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV47TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV48TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int27[11] = (byte)(1) ;
      }
      if ( ! (0==AV49TFBarColNum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int27[12] = (byte)(1) ;
      }
      if ( ! (0==AV50TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int27[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62TFBarNomCli_Sel)==0) && ( ! (GXutil.strcmp("", AV61TFBarNomCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62TFBarNomCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int27[15] = (byte)(1) ;
      }
      if ( ! (0==AV63TFBarNumCli) )
      {
         addWhere(sWhereString, "(T1.BarNumCli >= ?)");
      }
      else
      {
         GXv_int27[16] = (byte)(1) ;
      }
      if ( ! (0==AV64TFBarNumCli_To) )
      {
         addWhere(sWhereString, "(T1.BarNumCli <= ?)");
      }
      else
      {
         GXv_int27[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66TFBarMaqCod_Sel)==0) && ( ! (GXutil.strcmp("", AV65TFBarMaqCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66TFBarMaqCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarMaqCod = ?)");
      }
      else
      {
         GXv_int27[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV69TFBarKgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int27[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70TFBarKgm_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int27[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71TFBarMtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int27[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72TFBarMtr_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int27[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74TFBarAcaQui_Sel)==0) && ( ! (GXutil.strcmp("", AV73TFBarAcaQui)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAcaQui) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74TFBarAcaQui_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAcaQui = ?)");
      }
      else
      {
         GXv_int27[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78TFBarAgrEst_Sel)==0) && ( ! (GXutil.strcmp("", AV77TFBarAgrEst)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAgrEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78TFBarAgrEst_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAgrEst = ?)");
      }
      else
      {
         GXv_int27[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV82BarFecGenfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int27[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV83BarFecGento)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int27[29] = (byte)(1) ;
      }
      if ( ! (0==AV84BarSitfrom) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int27[30] = (byte)(1) ;
      }
      if ( ! (0==AV85BarSitto) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int27[31] = (byte)(1) ;
      }
      if ( ! (0==AV79BarCodIN) )
      {
         addWhere(sWhereString, "(T1.BarCod = ?)");
      }
      else
      {
         GXv_int27[32] = (byte)(1) ;
      }
      if ( ! (0==AV80BarCodreoIN) )
      {
         addWhere(sWhereString, "(T1.BarCodReo = ?)");
      }
      else
      {
         GXv_int27[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81BarCodparIN)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int27[34] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.BarAgrEst" ;
      GXv_Object28[0] = scmdbuf ;
      GXv_Object28[1] = GXv_int27 ;
      return GXv_Object28 ;
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
                  return conditional_P09KE3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (java.util.Date)dynConstraints[28] , (java.util.Date)dynConstraints[29] , ((Number) dynConstraints[30]).byteValue() , ((Number) dynConstraints[31]).byteValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).byteValue() , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , (String)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (java.util.Date)dynConstraints[49] , ((Number) dynConstraints[50]).byteValue() , ((Number) dynConstraints[51]).intValue() , ((Number) dynConstraints[52]).byteValue() , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , ((Number) dynConstraints[57]).intValue() , (String)dynConstraints[58] , (String)dynConstraints[59] , ((Number) dynConstraints[60]).intValue() , ((Number) dynConstraints[61]).intValue() , ((Number) dynConstraints[62]).byteValue() , ((Number) dynConstraints[63]).byteValue() );
            case 1 :
                  return conditional_P09KE5(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (java.util.Date)dynConstraints[28] , (java.util.Date)dynConstraints[29] , ((Number) dynConstraints[30]).byteValue() , ((Number) dynConstraints[31]).byteValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).byteValue() , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , (String)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (java.util.Date)dynConstraints[49] , ((Number) dynConstraints[50]).byteValue() , ((Number) dynConstraints[51]).intValue() , ((Number) dynConstraints[52]).byteValue() , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , ((Number) dynConstraints[57]).intValue() , (String)dynConstraints[58] , (String)dynConstraints[59] , ((Number) dynConstraints[60]).intValue() , ((Number) dynConstraints[61]).intValue() , ((Number) dynConstraints[62]).byteValue() , ((Number) dynConstraints[63]).byteValue() );
            case 2 :
                  return conditional_P09KE7(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (java.util.Date)dynConstraints[28] , (java.util.Date)dynConstraints[29] , ((Number) dynConstraints[30]).byteValue() , ((Number) dynConstraints[31]).byteValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).byteValue() , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , (String)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (java.util.Date)dynConstraints[49] , ((Number) dynConstraints[50]).byteValue() , ((Number) dynConstraints[51]).intValue() , ((Number) dynConstraints[52]).byteValue() , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , ((Number) dynConstraints[57]).intValue() , (String)dynConstraints[58] , (String)dynConstraints[59] , ((Number) dynConstraints[60]).intValue() , ((Number) dynConstraints[61]).intValue() , ((Number) dynConstraints[62]).byteValue() , ((Number) dynConstraints[63]).byteValue() );
            case 3 :
                  return conditional_P09KE9(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (java.util.Date)dynConstraints[28] , (java.util.Date)dynConstraints[29] , ((Number) dynConstraints[30]).byteValue() , ((Number) dynConstraints[31]).byteValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).byteValue() , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , (String)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (java.util.Date)dynConstraints[49] , ((Number) dynConstraints[50]).byteValue() , ((Number) dynConstraints[51]).intValue() , ((Number) dynConstraints[52]).byteValue() , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , ((Number) dynConstraints[57]).intValue() , (String)dynConstraints[58] , (String)dynConstraints[59] , ((Number) dynConstraints[60]).intValue() , ((Number) dynConstraints[61]).intValue() , ((Number) dynConstraints[62]).byteValue() , ((Number) dynConstraints[63]).byteValue() );
            case 4 :
                  return conditional_P09KE11(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (java.util.Date)dynConstraints[28] , (java.util.Date)dynConstraints[29] , ((Number) dynConstraints[30]).byteValue() , ((Number) dynConstraints[31]).byteValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).byteValue() , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , (String)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (java.util.Date)dynConstraints[49] , ((Number) dynConstraints[50]).byteValue() , ((Number) dynConstraints[51]).intValue() , ((Number) dynConstraints[52]).byteValue() , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , ((Number) dynConstraints[57]).intValue() , (String)dynConstraints[58] , (String)dynConstraints[59] , ((Number) dynConstraints[60]).intValue() , ((Number) dynConstraints[61]).intValue() , ((Number) dynConstraints[62]).byteValue() , ((Number) dynConstraints[63]).byteValue() );
            case 5 :
                  return conditional_P09KE13(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (java.util.Date)dynConstraints[28] , (java.util.Date)dynConstraints[29] , ((Number) dynConstraints[30]).byteValue() , ((Number) dynConstraints[31]).byteValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).byteValue() , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , (String)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (java.util.Date)dynConstraints[49] , ((Number) dynConstraints[50]).byteValue() , ((Number) dynConstraints[51]).intValue() , ((Number) dynConstraints[52]).byteValue() , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , ((Number) dynConstraints[57]).intValue() , (String)dynConstraints[58] , (String)dynConstraints[59] , ((Number) dynConstraints[60]).intValue() , ((Number) dynConstraints[61]).intValue() , ((Number) dynConstraints[62]).byteValue() , ((Number) dynConstraints[63]).byteValue() );
            case 6 :
                  return conditional_P09KE15(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (java.util.Date)dynConstraints[28] , (java.util.Date)dynConstraints[29] , ((Number) dynConstraints[30]).byteValue() , ((Number) dynConstraints[31]).byteValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).byteValue() , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , (String)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (java.util.Date)dynConstraints[49] , ((Number) dynConstraints[50]).byteValue() , ((Number) dynConstraints[51]).intValue() , ((Number) dynConstraints[52]).byteValue() , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , ((Number) dynConstraints[57]).intValue() , (String)dynConstraints[58] , (String)dynConstraints[59] , ((Number) dynConstraints[60]).intValue() , ((Number) dynConstraints[61]).intValue() , ((Number) dynConstraints[62]).byteValue() , ((Number) dynConstraints[63]).byteValue() );
            case 7 :
                  return conditional_P09KE17(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (java.util.Date)dynConstraints[28] , (java.util.Date)dynConstraints[29] , ((Number) dynConstraints[30]).byteValue() , ((Number) dynConstraints[31]).byteValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).byteValue() , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , (String)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (java.util.Date)dynConstraints[49] , ((Number) dynConstraints[50]).byteValue() , ((Number) dynConstraints[51]).intValue() , ((Number) dynConstraints[52]).byteValue() , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , ((Number) dynConstraints[57]).intValue() , (String)dynConstraints[58] , (String)dynConstraints[59] , ((Number) dynConstraints[60]).intValue() , ((Number) dynConstraints[61]).intValue() , ((Number) dynConstraints[62]).byteValue() , ((Number) dynConstraints[63]).byteValue() );
            case 8 :
                  return conditional_P09KE19(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (java.util.Date)dynConstraints[28] , (java.util.Date)dynConstraints[29] , ((Number) dynConstraints[30]).byteValue() , ((Number) dynConstraints[31]).byteValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).byteValue() , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , (String)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (java.util.Date)dynConstraints[49] , ((Number) dynConstraints[50]).byteValue() , ((Number) dynConstraints[51]).intValue() , ((Number) dynConstraints[52]).byteValue() , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , ((Number) dynConstraints[57]).intValue() , (String)dynConstraints[58] , (String)dynConstraints[59] , ((Number) dynConstraints[60]).intValue() , ((Number) dynConstraints[61]).intValue() , ((Number) dynConstraints[62]).byteValue() , ((Number) dynConstraints[63]).byteValue() );
            case 9 :
                  return conditional_P09KE21(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (java.util.Date)dynConstraints[28] , (java.util.Date)dynConstraints[29] , ((Number) dynConstraints[30]).byteValue() , ((Number) dynConstraints[31]).byteValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).byteValue() , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , (String)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (java.util.Date)dynConstraints[49] , ((Number) dynConstraints[50]).byteValue() , ((Number) dynConstraints[51]).intValue() , ((Number) dynConstraints[52]).byteValue() , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , ((Number) dynConstraints[57]).intValue() , (String)dynConstraints[58] , (String)dynConstraints[59] , ((Number) dynConstraints[60]).intValue() , ((Number) dynConstraints[61]).intValue() , ((Number) dynConstraints[62]).byteValue() , ((Number) dynConstraints[63]).byteValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09KE3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09KE5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09KE7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09KE9", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09KE11", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09KE13", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09KE15", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09KE17", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09KE19", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09KE21", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 13);
               ((String[]) buf[10])[0] = rslt.getString(11, 26);
               ((String[]) buf[11])[0] = rslt.getString(12, 16);
               ((String[]) buf[12])[0] = rslt.getString(13, 1);
               ((String[]) buf[13])[0] = rslt.getString(14, 11);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,2);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,2);
               ((String[]) buf[18])[0] = rslt.getString(18, 8);
               ((String[]) buf[19])[0] = rslt.getString(19, 20);
               ((short[]) buf[20])[0] = rslt.getShort(20);
               ((String[]) buf[21])[0] = rslt.getString(21, 1);
               ((int[]) buf[22])[0] = rslt.getInt(22);
               ((String[]) buf[23])[0] = rslt.getString(23, 1);
               ((byte[]) buf[24])[0] = rslt.getByte(24);
               ((int[]) buf[25])[0] = rslt.getInt(25);
               ((String[]) buf[26])[0] = rslt.getString(26, 3);
               return;
            case 1 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 13);
               ((String[]) buf[9])[0] = rslt.getString(10, 26);
               ((String[]) buf[10])[0] = rslt.getString(11, 16);
               ((String[]) buf[11])[0] = rslt.getString(12, 1);
               ((String[]) buf[12])[0] = rslt.getString(13, 11);
               ((String[]) buf[13])[0] = rslt.getString(14, 30);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,2);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,2);
               ((String[]) buf[18])[0] = rslt.getString(18, 8);
               ((String[]) buf[19])[0] = rslt.getString(19, 20);
               ((short[]) buf[20])[0] = rslt.getShort(20);
               ((String[]) buf[21])[0] = rslt.getString(21, 1);
               ((int[]) buf[22])[0] = rslt.getInt(22);
               ((String[]) buf[23])[0] = rslt.getString(23, 1);
               ((byte[]) buf[24])[0] = rslt.getByte(24);
               ((int[]) buf[25])[0] = rslt.getInt(25);
               ((String[]) buf[26])[0] = rslt.getString(26, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 13);
               ((String[]) buf[10])[0] = rslt.getString(11, 26);
               ((String[]) buf[11])[0] = rslt.getString(12, 16);
               ((String[]) buf[12])[0] = rslt.getString(13, 11);
               ((String[]) buf[13])[0] = rslt.getString(14, 30);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,2);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,2);
               ((String[]) buf[18])[0] = rslt.getString(18, 8);
               ((String[]) buf[19])[0] = rslt.getString(19, 20);
               ((short[]) buf[20])[0] = rslt.getShort(20);
               ((String[]) buf[21])[0] = rslt.getString(21, 1);
               ((int[]) buf[22])[0] = rslt.getInt(22);
               ((String[]) buf[23])[0] = rslt.getString(23, 1);
               ((byte[]) buf[24])[0] = rslt.getByte(24);
               ((int[]) buf[25])[0] = rslt.getInt(25);
               ((String[]) buf[26])[0] = rslt.getString(26, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 13);
               ((String[]) buf[10])[0] = rslt.getString(11, 26);
               ((String[]) buf[11])[0] = rslt.getString(12, 1);
               ((String[]) buf[12])[0] = rslt.getString(13, 11);
               ((String[]) buf[13])[0] = rslt.getString(14, 30);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,2);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,2);
               ((String[]) buf[18])[0] = rslt.getString(18, 8);
               ((String[]) buf[19])[0] = rslt.getString(19, 20);
               ((short[]) buf[20])[0] = rslt.getShort(20);
               ((String[]) buf[21])[0] = rslt.getString(21, 1);
               ((int[]) buf[22])[0] = rslt.getInt(22);
               ((String[]) buf[23])[0] = rslt.getString(23, 1);
               ((byte[]) buf[24])[0] = rslt.getByte(24);
               ((int[]) buf[25])[0] = rslt.getInt(25);
               ((String[]) buf[26])[0] = rslt.getString(26, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 13);
               ((String[]) buf[10])[0] = rslt.getString(11, 16);
               ((String[]) buf[11])[0] = rslt.getString(12, 1);
               ((String[]) buf[12])[0] = rslt.getString(13, 11);
               ((String[]) buf[13])[0] = rslt.getString(14, 30);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,2);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,2);
               ((String[]) buf[18])[0] = rslt.getString(18, 8);
               ((String[]) buf[19])[0] = rslt.getString(19, 20);
               ((short[]) buf[20])[0] = rslt.getShort(20);
               ((String[]) buf[21])[0] = rslt.getString(21, 1);
               ((int[]) buf[22])[0] = rslt.getInt(22);
               ((String[]) buf[23])[0] = rslt.getString(23, 1);
               ((byte[]) buf[24])[0] = rslt.getByte(24);
               ((int[]) buf[25])[0] = rslt.getInt(25);
               ((String[]) buf[26])[0] = rslt.getString(26, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 13);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 26);
               ((String[]) buf[10])[0] = rslt.getString(11, 16);
               ((String[]) buf[11])[0] = rslt.getString(12, 1);
               ((String[]) buf[12])[0] = rslt.getString(13, 11);
               ((String[]) buf[13])[0] = rslt.getString(14, 30);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,2);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,2);
               ((String[]) buf[18])[0] = rslt.getString(18, 8);
               ((String[]) buf[19])[0] = rslt.getString(19, 20);
               ((short[]) buf[20])[0] = rslt.getShort(20);
               ((String[]) buf[21])[0] = rslt.getString(21, 1);
               ((int[]) buf[22])[0] = rslt.getInt(22);
               ((String[]) buf[23])[0] = rslt.getString(23, 1);
               ((byte[]) buf[24])[0] = rslt.getByte(24);
               ((int[]) buf[25])[0] = rslt.getInt(25);
               ((String[]) buf[26])[0] = rslt.getString(26, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 13);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 13);
               ((String[]) buf[9])[0] = rslt.getString(10, 26);
               ((String[]) buf[10])[0] = rslt.getString(11, 16);
               ((String[]) buf[11])[0] = rslt.getString(12, 1);
               ((String[]) buf[12])[0] = rslt.getString(13, 11);
               ((String[]) buf[13])[0] = rslt.getString(14, 30);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,2);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,2);
               ((String[]) buf[18])[0] = rslt.getString(18, 8);
               ((String[]) buf[19])[0] = rslt.getString(19, 20);
               ((short[]) buf[20])[0] = rslt.getShort(20);
               ((String[]) buf[21])[0] = rslt.getString(21, 1);
               ((int[]) buf[22])[0] = rslt.getInt(22);
               ((String[]) buf[23])[0] = rslt.getString(23, 1);
               ((byte[]) buf[24])[0] = rslt.getByte(24);
               ((int[]) buf[25])[0] = rslt.getInt(25);
               ((String[]) buf[26])[0] = rslt.getString(26, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 13);
               ((String[]) buf[9])[0] = rslt.getString(10, 26);
               ((String[]) buf[10])[0] = rslt.getString(11, 16);
               ((String[]) buf[11])[0] = rslt.getString(12, 1);
               ((String[]) buf[12])[0] = rslt.getString(13, 11);
               ((String[]) buf[13])[0] = rslt.getString(14, 30);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,2);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,2);
               ((String[]) buf[18])[0] = rslt.getString(18, 8);
               ((String[]) buf[19])[0] = rslt.getString(19, 20);
               ((short[]) buf[20])[0] = rslt.getShort(20);
               ((String[]) buf[21])[0] = rslt.getString(21, 1);
               ((int[]) buf[22])[0] = rslt.getInt(22);
               ((String[]) buf[23])[0] = rslt.getString(23, 1);
               ((byte[]) buf[24])[0] = rslt.getByte(24);
               ((int[]) buf[25])[0] = rslt.getInt(25);
               ((String[]) buf[26])[0] = rslt.getString(26, 3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 13);
               ((String[]) buf[9])[0] = rslt.getString(10, 26);
               ((String[]) buf[10])[0] = rslt.getString(11, 16);
               ((String[]) buf[11])[0] = rslt.getString(12, 1);
               ((String[]) buf[12])[0] = rslt.getString(13, 11);
               ((String[]) buf[13])[0] = rslt.getString(14, 30);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,2);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,2);
               ((String[]) buf[18])[0] = rslt.getString(18, 8);
               ((String[]) buf[19])[0] = rslt.getString(19, 20);
               ((short[]) buf[20])[0] = rslt.getShort(20);
               ((String[]) buf[21])[0] = rslt.getString(21, 1);
               ((int[]) buf[22])[0] = rslt.getInt(22);
               ((String[]) buf[23])[0] = rslt.getString(23, 1);
               ((byte[]) buf[24])[0] = rslt.getByte(24);
               ((int[]) buf[25])[0] = rslt.getInt(25);
               ((String[]) buf[26])[0] = rslt.getString(26, 3);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 13);
               ((String[]) buf[9])[0] = rslt.getString(10, 26);
               ((String[]) buf[10])[0] = rslt.getString(11, 16);
               ((String[]) buf[11])[0] = rslt.getString(12, 1);
               ((String[]) buf[12])[0] = rslt.getString(13, 11);
               ((String[]) buf[13])[0] = rslt.getString(14, 30);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,2);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,2);
               ((String[]) buf[18])[0] = rslt.getString(18, 8);
               ((String[]) buf[19])[0] = rslt.getString(19, 20);
               ((short[]) buf[20])[0] = rslt.getShort(20);
               ((String[]) buf[21])[0] = rslt.getString(21, 1);
               ((int[]) buf[22])[0] = rslt.getInt(22);
               ((String[]) buf[23])[0] = rslt.getString(23, 1);
               ((byte[]) buf[24])[0] = rslt.getByte(24);
               ((int[]) buf[25])[0] = rslt.getInt(25);
               ((String[]) buf[26])[0] = rslt.getString(26, 3);
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
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 1);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 13);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[56], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[57], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[58], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 6);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 6);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[63]);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[64]);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[65]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[66]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[68]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 1);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 1);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 13);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[56], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[57], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[58], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 6);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 6);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[63]);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[64]);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[65]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[66]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[68]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 1);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 1);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 13);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[56], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[57], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[58], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 6);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 6);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[63]);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[64]);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[65]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[66]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[68]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 1);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 1);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 13);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[56], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[57], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[58], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 6);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 6);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[63]);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[64]);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[65]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[66]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[68]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 1);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 1);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 13);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[56], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[57], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[58], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 6);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 6);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[63]);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[64]);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[65]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[66]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[68]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 1);
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 1);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 13);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[56], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[57], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[58], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 6);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 6);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[63]);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[64]);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[65]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[66]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[68]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 1);
               }
               return;
            case 6 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 1);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 13);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[56], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[57], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[58], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 6);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 6);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[63]);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[64]);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[65]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[66]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[68]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 1);
               }
               return;
            case 7 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 1);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 13);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[56], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[57], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[58], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 6);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 6);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[63]);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[64]);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[65]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[66]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[68]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 1);
               }
               return;
            case 8 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 1);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 13);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[56], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[57], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[58], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 6);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 6);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[63]);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[64]);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[65]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[66]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[68]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 1);
               }
               return;
            case 9 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 1);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 13);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[56], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[57], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[58], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 6);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 6);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[63]);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[64]);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[65]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[66]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[68]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 1);
               }
               return;
      }
   }

}

