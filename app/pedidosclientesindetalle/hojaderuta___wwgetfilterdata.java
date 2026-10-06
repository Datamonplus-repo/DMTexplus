package app.pedidosclientesindetalle ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class hojaderuta___wwgetfilterdata extends GXProcedure
{
   public hojaderuta___wwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( hojaderuta___wwgetfilterdata.class ), "" );
   }

   public hojaderuta___wwgetfilterdata( int remoteHandle ,
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
      hojaderuta___wwgetfilterdata.this.aP5 = new String[] {""};
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
      hojaderuta___wwgetfilterdata.this.AV24DDOName = aP0;
      hojaderuta___wwgetfilterdata.this.AV25SearchTxt = aP1;
      hojaderuta___wwgetfilterdata.this.AV26SearchTxtTo = aP2;
      hojaderuta___wwgetfilterdata.this.aP3 = aP3;
      hojaderuta___wwgetfilterdata.this.aP4 = aP4;
      hojaderuta___wwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV14Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV16OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV17OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV24DDOName), "DDO_CLINOM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV24DDOName), "DDO_PEDIDOCLIENTE") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV24DDOName), "DDO_BARSER") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV24DDOName), "DDO_BARSERDSC") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV24DDOName), "DDO_BARCOLNOM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV24DDOName), "DDO_BARMAQCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADBARMAQCODOPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV24DDOName), "DDO_BARAGREST") == 0 )
      {
         /* Execute user subroutine: 'LOADBARAGRESTOPTIONS' */
         S181 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV27OptionsJson = AV14Options.toJSonString(false) ;
      AV28OptionsDescJson = AV16OptionsDesc.toJSonString(false) ;
      AV29OptionIndexesJson = AV17OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("PedidosClienteSinDetalle.HojadeRuta___WWGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "PedidosClienteSinDetalle.HojadeRuta___WWGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("PedidosClienteSinDetalle.HojadeRuta___WWGridState"), null, null);
      }
      AV61GXV1 = 1 ;
      while ( AV61GXV1 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV61GXV1));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV56FilterFullText = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV30TFCliNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV31TFCliNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDIDOCLIENTE") == 0 )
         {
            AV32TFPedidoCliente = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDIDOCLIENTE_SEL") == 0 )
         {
            AV33TFPedidoCliente_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV34TFBarSer = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV35TFBarSer_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV36TFBarSerDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV37TFBarSerDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV38TFBarColNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV39TFBarColNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUM") == 0 )
         {
            AV40TFBarColNum = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV41TFBarColNum_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMAQCOD") == 0 )
         {
            AV42TFBarMaqCod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMAQCOD_SEL") == 0 )
         {
            AV43TFBarMaqCod_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGREST") == 0 )
         {
            AV54TFBarAgrEst = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGREST_SEL") == 0 )
         {
            AV55TFBarAgrEst_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV61GXV1 = (int)(AV61GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV30TFCliNom = AV25SearchTxt ;
      AV31TFCliNom_Sel = "" ;
      AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext = AV56FilterFullText ;
      AV64Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom = AV30TFCliNom ;
      AV65Pedidosclientesindetalle_hojaderuta___wwds_3_tfclinom_sel = AV31TFCliNom_Sel ;
      AV66Pedidosclientesindetalle_hojaderuta___wwds_4_tfpedidocliente = AV32TFPedidoCliente ;
      AV67Pedidosclientesindetalle_hojaderuta___wwds_5_tfpedidocliente_sel = AV33TFPedidoCliente_Sel ;
      AV68Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser = AV34TFBarSer ;
      AV69Pedidosclientesindetalle_hojaderuta___wwds_7_tfbarser_sel = AV35TFBarSer_Sel ;
      AV70Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc = AV36TFBarSerDsc ;
      AV71Pedidosclientesindetalle_hojaderuta___wwds_9_tfbarserdsc_sel = AV37TFBarSerDsc_Sel ;
      AV72Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom = AV38TFBarColNom ;
      AV73Pedidosclientesindetalle_hojaderuta___wwds_11_tfbarcolnom_sel = AV39TFBarColNom_Sel ;
      AV74Pedidosclientesindetalle_hojaderuta___wwds_12_tfbarcolnum = AV40TFBarColNum ;
      AV75Pedidosclientesindetalle_hojaderuta___wwds_13_tfbarcolnum_to = AV41TFBarColNum_To ;
      AV76Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod = AV42TFBarMaqCod ;
      AV77Pedidosclientesindetalle_hojaderuta___wwds_15_tfbarmaqcod_sel = AV43TFBarMaqCod_Sel ;
      AV78Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest = AV54TFBarAgrEst ;
      AV79Pedidosclientesindetalle_hojaderuta___wwds_17_tfbaragrest_sel = AV55TFBarAgrEst_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV65Pedidosclientesindetalle_hojaderuta___wwds_3_tfclinom_sel ,
                                           AV64Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom ,
                                           AV69Pedidosclientesindetalle_hojaderuta___wwds_7_tfbarser_sel ,
                                           AV68Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser ,
                                           AV71Pedidosclientesindetalle_hojaderuta___wwds_9_tfbarserdsc_sel ,
                                           AV70Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc ,
                                           AV73Pedidosclientesindetalle_hojaderuta___wwds_11_tfbarcolnom_sel ,
                                           AV72Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom ,
                                           Integer.valueOf(AV74Pedidosclientesindetalle_hojaderuta___wwds_12_tfbarcolnum) ,
                                           Integer.valueOf(AV75Pedidosclientesindetalle_hojaderuta___wwds_13_tfbarcolnum_to) ,
                                           AV77Pedidosclientesindetalle_hojaderuta___wwds_15_tfbarmaqcod_sel ,
                                           AV76Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod ,
                                           AV79Pedidosclientesindetalle_hojaderuta___wwds_17_tfbaragrest_sel ,
                                           AV78Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest ,
                                           Integer.valueOf(AV46CliCod) ,
                                           AV47BarFecGenfrom ,
                                           AV48BarFecGento ,
                                           Byte.valueOf(AV49BarSitfrom) ,
                                           Byte.valueOf(AV50BarSitto) ,
                                           Integer.valueOf(AV51BarCod) ,
                                           Byte.valueOf(AV52BarCodreo) ,
                                           AV53BarCodpar ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A180BarMaqCod ,
                                           A120BarAgrEst ,
                                           Integer.valueOf(A252CliCod) ,
                                           A159BarFecGen ,
                                           Byte.valueOf(A213BarSit) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext ,
                                           A13878PedidoClie ,
                                           A13696BarNHdr ,
                                           AV67Pedidosclientesindetalle_hojaderuta___wwds_5_tfpedidocliente_sel ,
                                           AV66Pedidosclientesindetalle_hojaderuta___wwds_4_tfpedidocliente ,
                                           A396EmprCod ,
                                           AV45Emprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV64Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom = GXutil.padr( GXutil.rtrim( AV64Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom), 30, "%") ;
      lV68Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser = GXutil.padr( GXutil.rtrim( AV68Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser), 16, "%") ;
      lV70Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV70Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc), 26, "%") ;
      lV72Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV72Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom), 13, "%") ;
      lV76Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod = GXutil.padr( GXutil.rtrim( AV76Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod), 6, "%") ;
      lV78Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest = GXutil.padr( GXutil.rtrim( AV78Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest), 1, "%") ;
      /* Using cursor P0AQH2 */
      pr_default.execute(0, new Object[] {AV45Emprcod, lV64Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom, AV65Pedidosclientesindetalle_hojaderuta___wwds_3_tfclinom_sel, lV68Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser, AV69Pedidosclientesindetalle_hojaderuta___wwds_7_tfbarser_sel, lV70Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc, AV71Pedidosclientesindetalle_hojaderuta___wwds_9_tfbarserdsc_sel, lV72Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom, AV73Pedidosclientesindetalle_hojaderuta___wwds_11_tfbarcolnom_sel, Integer.valueOf(AV74Pedidosclientesindetalle_hojaderuta___wwds_12_tfbarcolnum), Integer.valueOf(AV75Pedidosclientesindetalle_hojaderuta___wwds_13_tfbarcolnum_to), lV76Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod, AV77Pedidosclientesindetalle_hojaderuta___wwds_15_tfbarmaqcod_sel, lV78Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest, AV79Pedidosclientesindetalle_hojaderuta___wwds_17_tfbaragrest_sel, Integer.valueOf(AV46CliCod), AV47BarFecGenfrom, AV48BarFecGento, Byte.valueOf(AV49BarSitfrom), Byte.valueOf(AV50BarSitto), Integer.valueOf(AV51BarCod), Byte.valueOf(AV52BarCodreo), AV53BarCodpar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkAQH2 = false ;
         A279CliNom = P0AQH2_A279CliNom[0] ;
         A159BarFecGen = P0AQH2_A159BarFecGen[0] ;
         A213BarSit = P0AQH2_A213BarSit[0] ;
         A13696BarNHdr = P0AQH2_A13696BarNHdr[0] ;
         A252CliCod = P0AQH2_A252CliCod[0] ;
         n252CliCod = P0AQH2_n252CliCod[0] ;
         A120BarAgrEst = P0AQH2_A120BarAgrEst[0] ;
         A180BarMaqCod = P0AQH2_A180BarMaqCod[0] ;
         A136BarColNum = P0AQH2_A136BarColNum[0] ;
         A135BarColNom = P0AQH2_A135BarColNom[0] ;
         A1652BarSerDsc = P0AQH2_A1652BarSerDsc[0] ;
         A212BarSer = P0AQH2_A212BarSer[0] ;
         A129BarCod = P0AQH2_A129BarCod[0] ;
         A132BarCodReo = P0AQH2_A132BarCodReo[0] ;
         A130BarCodPar = P0AQH2_A130BarCodPar[0] ;
         A143BarDisNum = P0AQH2_A143BarDisNum[0] ;
         A4812BarEncCli = P0AQH2_A4812BarEncCli[0] ;
         A396EmprCod = P0AQH2_A396EmprCod[0] ;
         A279CliNom = P0AQH2_A279CliNom[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char3[0] = A396EmprCod ;
         GXv_char4[0] = A4812BarEncCli ;
         GXv_char5[0] = A143BarDisNum ;
         GXv_char6[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char3, GXv_char4, GXv_char5, GXv_char6) ;
         hojaderuta___wwgetfilterdata.this.A396EmprCod = GXv_char3[0] ;
         hojaderuta___wwgetfilterdata.this.A4812BarEncCli = GXv_char4[0] ;
         hojaderuta___wwgetfilterdata.this.A143BarDisNum = GXv_char5[0] ;
         hojaderuta___wwgetfilterdata.this.GXt_char2 = GXv_char6[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( (GXutil.strcmp("", AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A180BarMaqCod) , GXutil.padr( "%" + GXutil.upper( AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A120BarAgrEst) , GXutil.padr( "%" + GXutil.upper( AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            if ( ! ( (GXutil.strcmp("", AV67Pedidosclientesindetalle_hojaderuta___wwds_5_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV66Pedidosclientesindetalle_hojaderuta___wwds_4_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV66Pedidosclientesindetalle_hojaderuta___wwds_4_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV67Pedidosclientesindetalle_hojaderuta___wwds_5_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV67Pedidosclientesindetalle_hojaderuta___wwds_5_tfpedidocliente_sel) == 0 ) ) )
               {
                  AV18count = 0 ;
                  while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0AQH2_A279CliNom[0], A279CliNom) == 0 ) )
                  {
                     brkAQH2 = false ;
                     A252CliCod = P0AQH2_A252CliCod[0] ;
                     n252CliCod = P0AQH2_n252CliCod[0] ;
                     A129BarCod = P0AQH2_A129BarCod[0] ;
                     A132BarCodReo = P0AQH2_A132BarCodReo[0] ;
                     A130BarCodPar = P0AQH2_A130BarCodPar[0] ;
                     A396EmprCod = P0AQH2_A396EmprCod[0] ;
                     AV18count = (long)(AV18count+1) ;
                     brkAQH2 = true ;
                     pr_default.readNext(0);
                  }
                  if ( ! (GXutil.strcmp("", A279CliNom)==0) )
                  {
                     AV13Option = A279CliNom ;
                     AV14Options.add(AV13Option, 0);
                     AV17OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV18count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                  }
                  if ( AV14Options.size() == 50 )
                  {
                     /* Exit For each command. Update data (if necessary), close cursors & exit. */
                     if (true) break;
                  }
               }
            }
         }
         if ( ! brkAQH2 )
         {
            brkAQH2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPEDIDOCLIENTEOPTIONS' Routine */
      returnInSub = false ;
      AV32TFPedidoCliente = AV25SearchTxt ;
      AV33TFPedidoCliente_Sel = "" ;
      AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext = AV56FilterFullText ;
      AV64Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom = AV30TFCliNom ;
      AV65Pedidosclientesindetalle_hojaderuta___wwds_3_tfclinom_sel = AV31TFCliNom_Sel ;
      AV66Pedidosclientesindetalle_hojaderuta___wwds_4_tfpedidocliente = AV32TFPedidoCliente ;
      AV67Pedidosclientesindetalle_hojaderuta___wwds_5_tfpedidocliente_sel = AV33TFPedidoCliente_Sel ;
      AV68Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser = AV34TFBarSer ;
      AV69Pedidosclientesindetalle_hojaderuta___wwds_7_tfbarser_sel = AV35TFBarSer_Sel ;
      AV70Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc = AV36TFBarSerDsc ;
      AV71Pedidosclientesindetalle_hojaderuta___wwds_9_tfbarserdsc_sel = AV37TFBarSerDsc_Sel ;
      AV72Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom = AV38TFBarColNom ;
      AV73Pedidosclientesindetalle_hojaderuta___wwds_11_tfbarcolnom_sel = AV39TFBarColNom_Sel ;
      AV74Pedidosclientesindetalle_hojaderuta___wwds_12_tfbarcolnum = AV40TFBarColNum ;
      AV75Pedidosclientesindetalle_hojaderuta___wwds_13_tfbarcolnum_to = AV41TFBarColNum_To ;
      AV76Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod = AV42TFBarMaqCod ;
      AV77Pedidosclientesindetalle_hojaderuta___wwds_15_tfbarmaqcod_sel = AV43TFBarMaqCod_Sel ;
      AV78Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest = AV54TFBarAgrEst ;
      AV79Pedidosclientesindetalle_hojaderuta___wwds_17_tfbaragrest_sel = AV55TFBarAgrEst_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV65Pedidosclientesindetalle_hojaderuta___wwds_3_tfclinom_sel ,
                                           AV64Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom ,
                                           AV69Pedidosclientesindetalle_hojaderuta___wwds_7_tfbarser_sel ,
                                           AV68Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser ,
                                           AV71Pedidosclientesindetalle_hojaderuta___wwds_9_tfbarserdsc_sel ,
                                           AV70Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc ,
                                           AV73Pedidosclientesindetalle_hojaderuta___wwds_11_tfbarcolnom_sel ,
                                           AV72Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom ,
                                           Integer.valueOf(AV74Pedidosclientesindetalle_hojaderuta___wwds_12_tfbarcolnum) ,
                                           Integer.valueOf(AV75Pedidosclientesindetalle_hojaderuta___wwds_13_tfbarcolnum_to) ,
                                           AV77Pedidosclientesindetalle_hojaderuta___wwds_15_tfbarmaqcod_sel ,
                                           AV76Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod ,
                                           AV79Pedidosclientesindetalle_hojaderuta___wwds_17_tfbaragrest_sel ,
                                           AV78Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest ,
                                           Integer.valueOf(AV46CliCod) ,
                                           AV47BarFecGenfrom ,
                                           AV48BarFecGento ,
                                           Byte.valueOf(AV49BarSitfrom) ,
                                           Byte.valueOf(AV50BarSitto) ,
                                           Integer.valueOf(AV51BarCod) ,
                                           Byte.valueOf(AV52BarCodreo) ,
                                           AV53BarCodpar ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A180BarMaqCod ,
                                           A120BarAgrEst ,
                                           Integer.valueOf(A252CliCod) ,
                                           A159BarFecGen ,
                                           Byte.valueOf(A213BarSit) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext ,
                                           A13878PedidoClie ,
                                           A13696BarNHdr ,
                                           AV67Pedidosclientesindetalle_hojaderuta___wwds_5_tfpedidocliente_sel ,
                                           AV66Pedidosclientesindetalle_hojaderuta___wwds_4_tfpedidocliente ,
                                           AV45Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV64Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom = GXutil.padr( GXutil.rtrim( AV64Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom), 30, "%") ;
      lV68Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser = GXutil.padr( GXutil.rtrim( AV68Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser), 16, "%") ;
      lV70Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV70Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc), 26, "%") ;
      lV72Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV72Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom), 13, "%") ;
      lV76Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod = GXutil.padr( GXutil.rtrim( AV76Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod), 6, "%") ;
      lV78Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest = GXutil.padr( GXutil.rtrim( AV78Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest), 1, "%") ;
      /* Using cursor P0AQH3 */
      pr_default.execute(1, new Object[] {AV45Emprcod, lV64Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom, AV65Pedidosclientesindetalle_hojaderuta___wwds_3_tfclinom_sel, lV68Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser, AV69Pedidosclientesindetalle_hojaderuta___wwds_7_tfbarser_sel, lV70Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc, AV71Pedidosclientesindetalle_hojaderuta___wwds_9_tfbarserdsc_sel, lV72Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom, AV73Pedidosclientesindetalle_hojaderuta___wwds_11_tfbarcolnom_sel, Integer.valueOf(AV74Pedidosclientesindetalle_hojaderuta___wwds_12_tfbarcolnum), Integer.valueOf(AV75Pedidosclientesindetalle_hojaderuta___wwds_13_tfbarcolnum_to), lV76Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod, AV77Pedidosclientesindetalle_hojaderuta___wwds_15_tfbarmaqcod_sel, lV78Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest, AV79Pedidosclientesindetalle_hojaderuta___wwds_17_tfbaragrest_sel, Integer.valueOf(AV46CliCod), AV47BarFecGenfrom, AV48BarFecGento, Byte.valueOf(AV49BarSitfrom), Byte.valueOf(AV50BarSitto), Integer.valueOf(AV51BarCod), Byte.valueOf(AV52BarCodreo), AV53BarCodpar});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A159BarFecGen = P0AQH3_A159BarFecGen[0] ;
         A213BarSit = P0AQH3_A213BarSit[0] ;
         A13696BarNHdr = P0AQH3_A13696BarNHdr[0] ;
         A252CliCod = P0AQH3_A252CliCod[0] ;
         n252CliCod = P0AQH3_n252CliCod[0] ;
         A120BarAgrEst = P0AQH3_A120BarAgrEst[0] ;
         A180BarMaqCod = P0AQH3_A180BarMaqCod[0] ;
         A136BarColNum = P0AQH3_A136BarColNum[0] ;
         A135BarColNom = P0AQH3_A135BarColNom[0] ;
         A1652BarSerDsc = P0AQH3_A1652BarSerDsc[0] ;
         A212BarSer = P0AQH3_A212BarSer[0] ;
         A279CliNom = P0AQH3_A279CliNom[0] ;
         A129BarCod = P0AQH3_A129BarCod[0] ;
         A132BarCodReo = P0AQH3_A132BarCodReo[0] ;
         A130BarCodPar = P0AQH3_A130BarCodPar[0] ;
         A143BarDisNum = P0AQH3_A143BarDisNum[0] ;
         A4812BarEncCli = P0AQH3_A4812BarEncCli[0] ;
         A396EmprCod = P0AQH3_A396EmprCod[0] ;
         A279CliNom = P0AQH3_A279CliNom[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_char3) ;
         hojaderuta___wwgetfilterdata.this.A396EmprCod = GXv_char6[0] ;
         hojaderuta___wwgetfilterdata.this.A4812BarEncCli = GXv_char5[0] ;
         hojaderuta___wwgetfilterdata.this.A143BarDisNum = GXv_char4[0] ;
         hojaderuta___wwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( (GXutil.strcmp("", AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A180BarMaqCod) , GXutil.padr( "%" + GXutil.upper( AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A120BarAgrEst) , GXutil.padr( "%" + GXutil.upper( AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            if ( ! ( (GXutil.strcmp("", AV67Pedidosclientesindetalle_hojaderuta___wwds_5_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV66Pedidosclientesindetalle_hojaderuta___wwds_4_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV66Pedidosclientesindetalle_hojaderuta___wwds_4_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV67Pedidosclientesindetalle_hojaderuta___wwds_5_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV67Pedidosclientesindetalle_hojaderuta___wwds_5_tfpedidocliente_sel) == 0 ) ) )
               {
                  if ( ! (GXutil.strcmp("", A13878PedidoClie)==0) )
                  {
                     AV13Option = A13878PedidoClie ;
                     AV12InsertIndex = 1 ;
                     while ( ( AV12InsertIndex <= AV14Options.size() ) && ( GXutil.strcmp((String)AV14Options.elementAt(-1+AV12InsertIndex), AV13Option) < 0 ) )
                     {
                        AV12InsertIndex = (int)(AV12InsertIndex+1) ;
                     }
                     if ( ( AV12InsertIndex <= AV14Options.size() ) && ( GXutil.strcmp((String)AV14Options.elementAt(-1+AV12InsertIndex), AV13Option) == 0 ) )
                     {
                        AV18count = GXutil.lval( (String)AV17OptionIndexes.elementAt(-1+AV12InsertIndex)) ;
                        AV18count = (long)(AV18count+1) ;
                        AV17OptionIndexes.removeItem(AV12InsertIndex);
                        AV17OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV18count), "Z,ZZZ,ZZZ,ZZ9")), AV12InsertIndex);
                     }
                     else
                     {
                        AV14Options.add(AV13Option, AV12InsertIndex);
                        AV17OptionIndexes.add("1", AV12InsertIndex);
                     }
                  }
                  if ( AV14Options.size() == 50 )
                  {
                     /* Exit For each command. Update data (if necessary), close cursors & exit. */
                     if (true) break;
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
      /* 'LOADBARSEROPTIONS' Routine */
      returnInSub = false ;
      AV34TFBarSer = AV25SearchTxt ;
      AV35TFBarSer_Sel = "" ;
      AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext = AV56FilterFullText ;
      AV64Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom = AV30TFCliNom ;
      AV65Pedidosclientesindetalle_hojaderuta___wwds_3_tfclinom_sel = AV31TFCliNom_Sel ;
      AV66Pedidosclientesindetalle_hojaderuta___wwds_4_tfpedidocliente = AV32TFPedidoCliente ;
      AV67Pedidosclientesindetalle_hojaderuta___wwds_5_tfpedidocliente_sel = AV33TFPedidoCliente_Sel ;
      AV68Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser = AV34TFBarSer ;
      AV69Pedidosclientesindetalle_hojaderuta___wwds_7_tfbarser_sel = AV35TFBarSer_Sel ;
      AV70Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc = AV36TFBarSerDsc ;
      AV71Pedidosclientesindetalle_hojaderuta___wwds_9_tfbarserdsc_sel = AV37TFBarSerDsc_Sel ;
      AV72Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom = AV38TFBarColNom ;
      AV73Pedidosclientesindetalle_hojaderuta___wwds_11_tfbarcolnom_sel = AV39TFBarColNom_Sel ;
      AV74Pedidosclientesindetalle_hojaderuta___wwds_12_tfbarcolnum = AV40TFBarColNum ;
      AV75Pedidosclientesindetalle_hojaderuta___wwds_13_tfbarcolnum_to = AV41TFBarColNum_To ;
      AV76Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod = AV42TFBarMaqCod ;
      AV77Pedidosclientesindetalle_hojaderuta___wwds_15_tfbarmaqcod_sel = AV43TFBarMaqCod_Sel ;
      AV78Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest = AV54TFBarAgrEst ;
      AV79Pedidosclientesindetalle_hojaderuta___wwds_17_tfbaragrest_sel = AV55TFBarAgrEst_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV65Pedidosclientesindetalle_hojaderuta___wwds_3_tfclinom_sel ,
                                           AV64Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom ,
                                           AV69Pedidosclientesindetalle_hojaderuta___wwds_7_tfbarser_sel ,
                                           AV68Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser ,
                                           AV71Pedidosclientesindetalle_hojaderuta___wwds_9_tfbarserdsc_sel ,
                                           AV70Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc ,
                                           AV73Pedidosclientesindetalle_hojaderuta___wwds_11_tfbarcolnom_sel ,
                                           AV72Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom ,
                                           Integer.valueOf(AV74Pedidosclientesindetalle_hojaderuta___wwds_12_tfbarcolnum) ,
                                           Integer.valueOf(AV75Pedidosclientesindetalle_hojaderuta___wwds_13_tfbarcolnum_to) ,
                                           AV77Pedidosclientesindetalle_hojaderuta___wwds_15_tfbarmaqcod_sel ,
                                           AV76Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod ,
                                           AV79Pedidosclientesindetalle_hojaderuta___wwds_17_tfbaragrest_sel ,
                                           AV78Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest ,
                                           Integer.valueOf(AV46CliCod) ,
                                           AV47BarFecGenfrom ,
                                           AV48BarFecGento ,
                                           Byte.valueOf(AV49BarSitfrom) ,
                                           Byte.valueOf(AV50BarSitto) ,
                                           Integer.valueOf(AV51BarCod) ,
                                           Byte.valueOf(AV52BarCodreo) ,
                                           AV53BarCodpar ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A180BarMaqCod ,
                                           A120BarAgrEst ,
                                           Integer.valueOf(A252CliCod) ,
                                           A159BarFecGen ,
                                           Byte.valueOf(A213BarSit) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext ,
                                           A13878PedidoClie ,
                                           A13696BarNHdr ,
                                           AV67Pedidosclientesindetalle_hojaderuta___wwds_5_tfpedidocliente_sel ,
                                           AV66Pedidosclientesindetalle_hojaderuta___wwds_4_tfpedidocliente ,
                                           AV45Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV64Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom = GXutil.padr( GXutil.rtrim( AV64Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom), 30, "%") ;
      lV68Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser = GXutil.padr( GXutil.rtrim( AV68Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser), 16, "%") ;
      lV70Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV70Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc), 26, "%") ;
      lV72Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV72Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom), 13, "%") ;
      lV76Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod = GXutil.padr( GXutil.rtrim( AV76Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod), 6, "%") ;
      lV78Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest = GXutil.padr( GXutil.rtrim( AV78Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest), 1, "%") ;
      /* Using cursor P0AQH4 */
      pr_default.execute(2, new Object[] {AV45Emprcod, lV64Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom, AV65Pedidosclientesindetalle_hojaderuta___wwds_3_tfclinom_sel, lV68Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser, AV69Pedidosclientesindetalle_hojaderuta___wwds_7_tfbarser_sel, lV70Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc, AV71Pedidosclientesindetalle_hojaderuta___wwds_9_tfbarserdsc_sel, lV72Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom, AV73Pedidosclientesindetalle_hojaderuta___wwds_11_tfbarcolnom_sel, Integer.valueOf(AV74Pedidosclientesindetalle_hojaderuta___wwds_12_tfbarcolnum), Integer.valueOf(AV75Pedidosclientesindetalle_hojaderuta___wwds_13_tfbarcolnum_to), lV76Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod, AV77Pedidosclientesindetalle_hojaderuta___wwds_15_tfbarmaqcod_sel, lV78Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest, AV79Pedidosclientesindetalle_hojaderuta___wwds_17_tfbaragrest_sel, Integer.valueOf(AV46CliCod), AV47BarFecGenfrom, AV48BarFecGento, Byte.valueOf(AV49BarSitfrom), Byte.valueOf(AV50BarSitto), Integer.valueOf(AV51BarCod), Byte.valueOf(AV52BarCodreo), AV53BarCodpar});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brkAQH5 = false ;
         A212BarSer = P0AQH4_A212BarSer[0] ;
         A159BarFecGen = P0AQH4_A159BarFecGen[0] ;
         A213BarSit = P0AQH4_A213BarSit[0] ;
         A13696BarNHdr = P0AQH4_A13696BarNHdr[0] ;
         A252CliCod = P0AQH4_A252CliCod[0] ;
         n252CliCod = P0AQH4_n252CliCod[0] ;
         A120BarAgrEst = P0AQH4_A120BarAgrEst[0] ;
         A180BarMaqCod = P0AQH4_A180BarMaqCod[0] ;
         A136BarColNum = P0AQH4_A136BarColNum[0] ;
         A135BarColNom = P0AQH4_A135BarColNom[0] ;
         A1652BarSerDsc = P0AQH4_A1652BarSerDsc[0] ;
         A279CliNom = P0AQH4_A279CliNom[0] ;
         A129BarCod = P0AQH4_A129BarCod[0] ;
         A132BarCodReo = P0AQH4_A132BarCodReo[0] ;
         A130BarCodPar = P0AQH4_A130BarCodPar[0] ;
         A143BarDisNum = P0AQH4_A143BarDisNum[0] ;
         A4812BarEncCli = P0AQH4_A4812BarEncCli[0] ;
         A396EmprCod = P0AQH4_A396EmprCod[0] ;
         A279CliNom = P0AQH4_A279CliNom[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_char3) ;
         hojaderuta___wwgetfilterdata.this.A396EmprCod = GXv_char6[0] ;
         hojaderuta___wwgetfilterdata.this.A4812BarEncCli = GXv_char5[0] ;
         hojaderuta___wwgetfilterdata.this.A143BarDisNum = GXv_char4[0] ;
         hojaderuta___wwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( (GXutil.strcmp("", AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A180BarMaqCod) , GXutil.padr( "%" + GXutil.upper( AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A120BarAgrEst) , GXutil.padr( "%" + GXutil.upper( AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            if ( ! ( (GXutil.strcmp("", AV67Pedidosclientesindetalle_hojaderuta___wwds_5_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV66Pedidosclientesindetalle_hojaderuta___wwds_4_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV66Pedidosclientesindetalle_hojaderuta___wwds_4_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV67Pedidosclientesindetalle_hojaderuta___wwds_5_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV67Pedidosclientesindetalle_hojaderuta___wwds_5_tfpedidocliente_sel) == 0 ) ) )
               {
                  AV18count = 0 ;
                  while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P0AQH4_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P0AQH4_A212BarSer[0], A212BarSer) == 0 ) )
                  {
                     brkAQH5 = false ;
                     A129BarCod = P0AQH4_A129BarCod[0] ;
                     A132BarCodReo = P0AQH4_A132BarCodReo[0] ;
                     A130BarCodPar = P0AQH4_A130BarCodPar[0] ;
                     AV18count = (long)(AV18count+1) ;
                     brkAQH5 = true ;
                     pr_default.readNext(2);
                  }
                  if ( ! (GXutil.strcmp("", A212BarSer)==0) )
                  {
                     AV13Option = A212BarSer ;
                     AV14Options.add(AV13Option, 0);
                     AV17OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV18count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                  }
                  if ( AV14Options.size() == 50 )
                  {
                     /* Exit For each command. Update data (if necessary), close cursors & exit. */
                     if (true) break;
                  }
               }
            }
         }
         if ( ! brkAQH5 )
         {
            brkAQH5 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADBARSERDSCOPTIONS' Routine */
      returnInSub = false ;
      AV36TFBarSerDsc = AV25SearchTxt ;
      AV37TFBarSerDsc_Sel = "" ;
      AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext = AV56FilterFullText ;
      AV64Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom = AV30TFCliNom ;
      AV65Pedidosclientesindetalle_hojaderuta___wwds_3_tfclinom_sel = AV31TFCliNom_Sel ;
      AV66Pedidosclientesindetalle_hojaderuta___wwds_4_tfpedidocliente = AV32TFPedidoCliente ;
      AV67Pedidosclientesindetalle_hojaderuta___wwds_5_tfpedidocliente_sel = AV33TFPedidoCliente_Sel ;
      AV68Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser = AV34TFBarSer ;
      AV69Pedidosclientesindetalle_hojaderuta___wwds_7_tfbarser_sel = AV35TFBarSer_Sel ;
      AV70Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc = AV36TFBarSerDsc ;
      AV71Pedidosclientesindetalle_hojaderuta___wwds_9_tfbarserdsc_sel = AV37TFBarSerDsc_Sel ;
      AV72Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom = AV38TFBarColNom ;
      AV73Pedidosclientesindetalle_hojaderuta___wwds_11_tfbarcolnom_sel = AV39TFBarColNom_Sel ;
      AV74Pedidosclientesindetalle_hojaderuta___wwds_12_tfbarcolnum = AV40TFBarColNum ;
      AV75Pedidosclientesindetalle_hojaderuta___wwds_13_tfbarcolnum_to = AV41TFBarColNum_To ;
      AV76Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod = AV42TFBarMaqCod ;
      AV77Pedidosclientesindetalle_hojaderuta___wwds_15_tfbarmaqcod_sel = AV43TFBarMaqCod_Sel ;
      AV78Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest = AV54TFBarAgrEst ;
      AV79Pedidosclientesindetalle_hojaderuta___wwds_17_tfbaragrest_sel = AV55TFBarAgrEst_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV65Pedidosclientesindetalle_hojaderuta___wwds_3_tfclinom_sel ,
                                           AV64Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom ,
                                           AV69Pedidosclientesindetalle_hojaderuta___wwds_7_tfbarser_sel ,
                                           AV68Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser ,
                                           AV71Pedidosclientesindetalle_hojaderuta___wwds_9_tfbarserdsc_sel ,
                                           AV70Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc ,
                                           AV73Pedidosclientesindetalle_hojaderuta___wwds_11_tfbarcolnom_sel ,
                                           AV72Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom ,
                                           Integer.valueOf(AV74Pedidosclientesindetalle_hojaderuta___wwds_12_tfbarcolnum) ,
                                           Integer.valueOf(AV75Pedidosclientesindetalle_hojaderuta___wwds_13_tfbarcolnum_to) ,
                                           AV77Pedidosclientesindetalle_hojaderuta___wwds_15_tfbarmaqcod_sel ,
                                           AV76Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod ,
                                           AV79Pedidosclientesindetalle_hojaderuta___wwds_17_tfbaragrest_sel ,
                                           AV78Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest ,
                                           Integer.valueOf(AV46CliCod) ,
                                           AV47BarFecGenfrom ,
                                           AV48BarFecGento ,
                                           Byte.valueOf(AV49BarSitfrom) ,
                                           Byte.valueOf(AV50BarSitto) ,
                                           Integer.valueOf(AV51BarCod) ,
                                           Byte.valueOf(AV52BarCodreo) ,
                                           AV53BarCodpar ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A180BarMaqCod ,
                                           A120BarAgrEst ,
                                           Integer.valueOf(A252CliCod) ,
                                           A159BarFecGen ,
                                           Byte.valueOf(A213BarSit) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext ,
                                           A13878PedidoClie ,
                                           A13696BarNHdr ,
                                           AV67Pedidosclientesindetalle_hojaderuta___wwds_5_tfpedidocliente_sel ,
                                           AV66Pedidosclientesindetalle_hojaderuta___wwds_4_tfpedidocliente ,
                                           A396EmprCod ,
                                           AV45Emprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV64Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom = GXutil.padr( GXutil.rtrim( AV64Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom), 30, "%") ;
      lV68Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser = GXutil.padr( GXutil.rtrim( AV68Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser), 16, "%") ;
      lV70Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV70Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc), 26, "%") ;
      lV72Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV72Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom), 13, "%") ;
      lV76Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod = GXutil.padr( GXutil.rtrim( AV76Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod), 6, "%") ;
      lV78Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest = GXutil.padr( GXutil.rtrim( AV78Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest), 1, "%") ;
      /* Using cursor P0AQH5 */
      pr_default.execute(3, new Object[] {AV45Emprcod, lV64Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom, AV65Pedidosclientesindetalle_hojaderuta___wwds_3_tfclinom_sel, lV68Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser, AV69Pedidosclientesindetalle_hojaderuta___wwds_7_tfbarser_sel, lV70Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc, AV71Pedidosclientesindetalle_hojaderuta___wwds_9_tfbarserdsc_sel, lV72Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom, AV73Pedidosclientesindetalle_hojaderuta___wwds_11_tfbarcolnom_sel, Integer.valueOf(AV74Pedidosclientesindetalle_hojaderuta___wwds_12_tfbarcolnum), Integer.valueOf(AV75Pedidosclientesindetalle_hojaderuta___wwds_13_tfbarcolnum_to), lV76Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod, AV77Pedidosclientesindetalle_hojaderuta___wwds_15_tfbarmaqcod_sel, lV78Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest, AV79Pedidosclientesindetalle_hojaderuta___wwds_17_tfbaragrest_sel, Integer.valueOf(AV46CliCod), AV47BarFecGenfrom, AV48BarFecGento, Byte.valueOf(AV49BarSitfrom), Byte.valueOf(AV50BarSitto), Integer.valueOf(AV51BarCod), Byte.valueOf(AV52BarCodreo), AV53BarCodpar});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brkAQH7 = false ;
         A1652BarSerDsc = P0AQH5_A1652BarSerDsc[0] ;
         A159BarFecGen = P0AQH5_A159BarFecGen[0] ;
         A213BarSit = P0AQH5_A213BarSit[0] ;
         A13696BarNHdr = P0AQH5_A13696BarNHdr[0] ;
         A252CliCod = P0AQH5_A252CliCod[0] ;
         n252CliCod = P0AQH5_n252CliCod[0] ;
         A120BarAgrEst = P0AQH5_A120BarAgrEst[0] ;
         A180BarMaqCod = P0AQH5_A180BarMaqCod[0] ;
         A136BarColNum = P0AQH5_A136BarColNum[0] ;
         A135BarColNom = P0AQH5_A135BarColNom[0] ;
         A212BarSer = P0AQH5_A212BarSer[0] ;
         A279CliNom = P0AQH5_A279CliNom[0] ;
         A129BarCod = P0AQH5_A129BarCod[0] ;
         A132BarCodReo = P0AQH5_A132BarCodReo[0] ;
         A130BarCodPar = P0AQH5_A130BarCodPar[0] ;
         A143BarDisNum = P0AQH5_A143BarDisNum[0] ;
         A4812BarEncCli = P0AQH5_A4812BarEncCli[0] ;
         A396EmprCod = P0AQH5_A396EmprCod[0] ;
         A279CliNom = P0AQH5_A279CliNom[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_char3) ;
         hojaderuta___wwgetfilterdata.this.A396EmprCod = GXv_char6[0] ;
         hojaderuta___wwgetfilterdata.this.A4812BarEncCli = GXv_char5[0] ;
         hojaderuta___wwgetfilterdata.this.A143BarDisNum = GXv_char4[0] ;
         hojaderuta___wwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( (GXutil.strcmp("", AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A180BarMaqCod) , GXutil.padr( "%" + GXutil.upper( AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A120BarAgrEst) , GXutil.padr( "%" + GXutil.upper( AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            if ( ! ( (GXutil.strcmp("", AV67Pedidosclientesindetalle_hojaderuta___wwds_5_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV66Pedidosclientesindetalle_hojaderuta___wwds_4_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV66Pedidosclientesindetalle_hojaderuta___wwds_4_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV67Pedidosclientesindetalle_hojaderuta___wwds_5_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV67Pedidosclientesindetalle_hojaderuta___wwds_5_tfpedidocliente_sel) == 0 ) ) )
               {
                  AV18count = 0 ;
                  while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P0AQH5_A1652BarSerDsc[0], A1652BarSerDsc) == 0 ) )
                  {
                     brkAQH7 = false ;
                     A129BarCod = P0AQH5_A129BarCod[0] ;
                     A132BarCodReo = P0AQH5_A132BarCodReo[0] ;
                     A130BarCodPar = P0AQH5_A130BarCodPar[0] ;
                     A396EmprCod = P0AQH5_A396EmprCod[0] ;
                     AV18count = (long)(AV18count+1) ;
                     brkAQH7 = true ;
                     pr_default.readNext(3);
                  }
                  if ( ! (GXutil.strcmp("", A1652BarSerDsc)==0) )
                  {
                     AV13Option = A1652BarSerDsc ;
                     AV14Options.add(AV13Option, 0);
                     AV17OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV18count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                  }
                  if ( AV14Options.size() == 50 )
                  {
                     /* Exit For each command. Update data (if necessary), close cursors & exit. */
                     if (true) break;
                  }
               }
            }
         }
         if ( ! brkAQH7 )
         {
            brkAQH7 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADBARCOLNOMOPTIONS' Routine */
      returnInSub = false ;
      AV38TFBarColNom = AV25SearchTxt ;
      AV39TFBarColNom_Sel = "" ;
      AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext = AV56FilterFullText ;
      AV64Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom = AV30TFCliNom ;
      AV65Pedidosclientesindetalle_hojaderuta___wwds_3_tfclinom_sel = AV31TFCliNom_Sel ;
      AV66Pedidosclientesindetalle_hojaderuta___wwds_4_tfpedidocliente = AV32TFPedidoCliente ;
      AV67Pedidosclientesindetalle_hojaderuta___wwds_5_tfpedidocliente_sel = AV33TFPedidoCliente_Sel ;
      AV68Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser = AV34TFBarSer ;
      AV69Pedidosclientesindetalle_hojaderuta___wwds_7_tfbarser_sel = AV35TFBarSer_Sel ;
      AV70Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc = AV36TFBarSerDsc ;
      AV71Pedidosclientesindetalle_hojaderuta___wwds_9_tfbarserdsc_sel = AV37TFBarSerDsc_Sel ;
      AV72Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom = AV38TFBarColNom ;
      AV73Pedidosclientesindetalle_hojaderuta___wwds_11_tfbarcolnom_sel = AV39TFBarColNom_Sel ;
      AV74Pedidosclientesindetalle_hojaderuta___wwds_12_tfbarcolnum = AV40TFBarColNum ;
      AV75Pedidosclientesindetalle_hojaderuta___wwds_13_tfbarcolnum_to = AV41TFBarColNum_To ;
      AV76Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod = AV42TFBarMaqCod ;
      AV77Pedidosclientesindetalle_hojaderuta___wwds_15_tfbarmaqcod_sel = AV43TFBarMaqCod_Sel ;
      AV78Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest = AV54TFBarAgrEst ;
      AV79Pedidosclientesindetalle_hojaderuta___wwds_17_tfbaragrest_sel = AV55TFBarAgrEst_Sel ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV65Pedidosclientesindetalle_hojaderuta___wwds_3_tfclinom_sel ,
                                           AV64Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom ,
                                           AV69Pedidosclientesindetalle_hojaderuta___wwds_7_tfbarser_sel ,
                                           AV68Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser ,
                                           AV71Pedidosclientesindetalle_hojaderuta___wwds_9_tfbarserdsc_sel ,
                                           AV70Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc ,
                                           AV73Pedidosclientesindetalle_hojaderuta___wwds_11_tfbarcolnom_sel ,
                                           AV72Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom ,
                                           Integer.valueOf(AV74Pedidosclientesindetalle_hojaderuta___wwds_12_tfbarcolnum) ,
                                           Integer.valueOf(AV75Pedidosclientesindetalle_hojaderuta___wwds_13_tfbarcolnum_to) ,
                                           AV77Pedidosclientesindetalle_hojaderuta___wwds_15_tfbarmaqcod_sel ,
                                           AV76Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod ,
                                           AV79Pedidosclientesindetalle_hojaderuta___wwds_17_tfbaragrest_sel ,
                                           AV78Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest ,
                                           Integer.valueOf(AV46CliCod) ,
                                           AV47BarFecGenfrom ,
                                           AV48BarFecGento ,
                                           Byte.valueOf(AV49BarSitfrom) ,
                                           Byte.valueOf(AV50BarSitto) ,
                                           Integer.valueOf(AV51BarCod) ,
                                           Byte.valueOf(AV52BarCodreo) ,
                                           AV53BarCodpar ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A180BarMaqCod ,
                                           A120BarAgrEst ,
                                           Integer.valueOf(A252CliCod) ,
                                           A159BarFecGen ,
                                           Byte.valueOf(A213BarSit) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext ,
                                           A13878PedidoClie ,
                                           A13696BarNHdr ,
                                           AV67Pedidosclientesindetalle_hojaderuta___wwds_5_tfpedidocliente_sel ,
                                           AV66Pedidosclientesindetalle_hojaderuta___wwds_4_tfpedidocliente ,
                                           A396EmprCod ,
                                           AV45Emprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV64Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom = GXutil.padr( GXutil.rtrim( AV64Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom), 30, "%") ;
      lV68Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser = GXutil.padr( GXutil.rtrim( AV68Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser), 16, "%") ;
      lV70Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV70Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc), 26, "%") ;
      lV72Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV72Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom), 13, "%") ;
      lV76Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod = GXutil.padr( GXutil.rtrim( AV76Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod), 6, "%") ;
      lV78Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest = GXutil.padr( GXutil.rtrim( AV78Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest), 1, "%") ;
      /* Using cursor P0AQH6 */
      pr_default.execute(4, new Object[] {AV45Emprcod, lV64Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom, AV65Pedidosclientesindetalle_hojaderuta___wwds_3_tfclinom_sel, lV68Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser, AV69Pedidosclientesindetalle_hojaderuta___wwds_7_tfbarser_sel, lV70Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc, AV71Pedidosclientesindetalle_hojaderuta___wwds_9_tfbarserdsc_sel, lV72Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom, AV73Pedidosclientesindetalle_hojaderuta___wwds_11_tfbarcolnom_sel, Integer.valueOf(AV74Pedidosclientesindetalle_hojaderuta___wwds_12_tfbarcolnum), Integer.valueOf(AV75Pedidosclientesindetalle_hojaderuta___wwds_13_tfbarcolnum_to), lV76Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod, AV77Pedidosclientesindetalle_hojaderuta___wwds_15_tfbarmaqcod_sel, lV78Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest, AV79Pedidosclientesindetalle_hojaderuta___wwds_17_tfbaragrest_sel, Integer.valueOf(AV46CliCod), AV47BarFecGenfrom, AV48BarFecGento, Byte.valueOf(AV49BarSitfrom), Byte.valueOf(AV50BarSitto), Integer.valueOf(AV51BarCod), Byte.valueOf(AV52BarCodreo), AV53BarCodpar});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brkAQH9 = false ;
         A135BarColNom = P0AQH6_A135BarColNom[0] ;
         A159BarFecGen = P0AQH6_A159BarFecGen[0] ;
         A213BarSit = P0AQH6_A213BarSit[0] ;
         A13696BarNHdr = P0AQH6_A13696BarNHdr[0] ;
         A252CliCod = P0AQH6_A252CliCod[0] ;
         n252CliCod = P0AQH6_n252CliCod[0] ;
         A120BarAgrEst = P0AQH6_A120BarAgrEst[0] ;
         A180BarMaqCod = P0AQH6_A180BarMaqCod[0] ;
         A136BarColNum = P0AQH6_A136BarColNum[0] ;
         A1652BarSerDsc = P0AQH6_A1652BarSerDsc[0] ;
         A212BarSer = P0AQH6_A212BarSer[0] ;
         A279CliNom = P0AQH6_A279CliNom[0] ;
         A129BarCod = P0AQH6_A129BarCod[0] ;
         A132BarCodReo = P0AQH6_A132BarCodReo[0] ;
         A130BarCodPar = P0AQH6_A130BarCodPar[0] ;
         A143BarDisNum = P0AQH6_A143BarDisNum[0] ;
         A4812BarEncCli = P0AQH6_A4812BarEncCli[0] ;
         A396EmprCod = P0AQH6_A396EmprCod[0] ;
         A279CliNom = P0AQH6_A279CliNom[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_char3) ;
         hojaderuta___wwgetfilterdata.this.A396EmprCod = GXv_char6[0] ;
         hojaderuta___wwgetfilterdata.this.A4812BarEncCli = GXv_char5[0] ;
         hojaderuta___wwgetfilterdata.this.A143BarDisNum = GXv_char4[0] ;
         hojaderuta___wwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( (GXutil.strcmp("", AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A180BarMaqCod) , GXutil.padr( "%" + GXutil.upper( AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A120BarAgrEst) , GXutil.padr( "%" + GXutil.upper( AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            if ( ! ( (GXutil.strcmp("", AV67Pedidosclientesindetalle_hojaderuta___wwds_5_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV66Pedidosclientesindetalle_hojaderuta___wwds_4_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV66Pedidosclientesindetalle_hojaderuta___wwds_4_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV67Pedidosclientesindetalle_hojaderuta___wwds_5_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV67Pedidosclientesindetalle_hojaderuta___wwds_5_tfpedidocliente_sel) == 0 ) ) )
               {
                  AV18count = 0 ;
                  while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P0AQH6_A135BarColNom[0], A135BarColNom) == 0 ) )
                  {
                     brkAQH9 = false ;
                     A129BarCod = P0AQH6_A129BarCod[0] ;
                     A132BarCodReo = P0AQH6_A132BarCodReo[0] ;
                     A130BarCodPar = P0AQH6_A130BarCodPar[0] ;
                     A396EmprCod = P0AQH6_A396EmprCod[0] ;
                     AV18count = (long)(AV18count+1) ;
                     brkAQH9 = true ;
                     pr_default.readNext(4);
                  }
                  if ( ! (GXutil.strcmp("", A135BarColNom)==0) )
                  {
                     AV13Option = A135BarColNom ;
                     AV14Options.add(AV13Option, 0);
                     AV17OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV18count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                  }
                  if ( AV14Options.size() == 50 )
                  {
                     /* Exit For each command. Update data (if necessary), close cursors & exit. */
                     if (true) break;
                  }
               }
            }
         }
         if ( ! brkAQH9 )
         {
            brkAQH9 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADBARMAQCODOPTIONS' Routine */
      returnInSub = false ;
      AV42TFBarMaqCod = AV25SearchTxt ;
      AV43TFBarMaqCod_Sel = "" ;
      AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext = AV56FilterFullText ;
      AV64Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom = AV30TFCliNom ;
      AV65Pedidosclientesindetalle_hojaderuta___wwds_3_tfclinom_sel = AV31TFCliNom_Sel ;
      AV66Pedidosclientesindetalle_hojaderuta___wwds_4_tfpedidocliente = AV32TFPedidoCliente ;
      AV67Pedidosclientesindetalle_hojaderuta___wwds_5_tfpedidocliente_sel = AV33TFPedidoCliente_Sel ;
      AV68Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser = AV34TFBarSer ;
      AV69Pedidosclientesindetalle_hojaderuta___wwds_7_tfbarser_sel = AV35TFBarSer_Sel ;
      AV70Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc = AV36TFBarSerDsc ;
      AV71Pedidosclientesindetalle_hojaderuta___wwds_9_tfbarserdsc_sel = AV37TFBarSerDsc_Sel ;
      AV72Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom = AV38TFBarColNom ;
      AV73Pedidosclientesindetalle_hojaderuta___wwds_11_tfbarcolnom_sel = AV39TFBarColNom_Sel ;
      AV74Pedidosclientesindetalle_hojaderuta___wwds_12_tfbarcolnum = AV40TFBarColNum ;
      AV75Pedidosclientesindetalle_hojaderuta___wwds_13_tfbarcolnum_to = AV41TFBarColNum_To ;
      AV76Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod = AV42TFBarMaqCod ;
      AV77Pedidosclientesindetalle_hojaderuta___wwds_15_tfbarmaqcod_sel = AV43TFBarMaqCod_Sel ;
      AV78Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest = AV54TFBarAgrEst ;
      AV79Pedidosclientesindetalle_hojaderuta___wwds_17_tfbaragrest_sel = AV55TFBarAgrEst_Sel ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           AV65Pedidosclientesindetalle_hojaderuta___wwds_3_tfclinom_sel ,
                                           AV64Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom ,
                                           AV69Pedidosclientesindetalle_hojaderuta___wwds_7_tfbarser_sel ,
                                           AV68Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser ,
                                           AV71Pedidosclientesindetalle_hojaderuta___wwds_9_tfbarserdsc_sel ,
                                           AV70Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc ,
                                           AV73Pedidosclientesindetalle_hojaderuta___wwds_11_tfbarcolnom_sel ,
                                           AV72Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom ,
                                           Integer.valueOf(AV74Pedidosclientesindetalle_hojaderuta___wwds_12_tfbarcolnum) ,
                                           Integer.valueOf(AV75Pedidosclientesindetalle_hojaderuta___wwds_13_tfbarcolnum_to) ,
                                           AV77Pedidosclientesindetalle_hojaderuta___wwds_15_tfbarmaqcod_sel ,
                                           AV76Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod ,
                                           AV79Pedidosclientesindetalle_hojaderuta___wwds_17_tfbaragrest_sel ,
                                           AV78Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest ,
                                           Integer.valueOf(AV46CliCod) ,
                                           AV47BarFecGenfrom ,
                                           AV48BarFecGento ,
                                           Byte.valueOf(AV49BarSitfrom) ,
                                           Byte.valueOf(AV50BarSitto) ,
                                           Integer.valueOf(AV51BarCod) ,
                                           Byte.valueOf(AV52BarCodreo) ,
                                           AV53BarCodpar ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A180BarMaqCod ,
                                           A120BarAgrEst ,
                                           Integer.valueOf(A252CliCod) ,
                                           A159BarFecGen ,
                                           Byte.valueOf(A213BarSit) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext ,
                                           A13878PedidoClie ,
                                           A13696BarNHdr ,
                                           AV67Pedidosclientesindetalle_hojaderuta___wwds_5_tfpedidocliente_sel ,
                                           AV66Pedidosclientesindetalle_hojaderuta___wwds_4_tfpedidocliente ,
                                           AV45Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV64Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom = GXutil.padr( GXutil.rtrim( AV64Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom), 30, "%") ;
      lV68Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser = GXutil.padr( GXutil.rtrim( AV68Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser), 16, "%") ;
      lV70Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV70Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc), 26, "%") ;
      lV72Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV72Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom), 13, "%") ;
      lV76Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod = GXutil.padr( GXutil.rtrim( AV76Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod), 6, "%") ;
      lV78Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest = GXutil.padr( GXutil.rtrim( AV78Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest), 1, "%") ;
      /* Using cursor P0AQH7 */
      pr_default.execute(5, new Object[] {AV45Emprcod, lV64Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom, AV65Pedidosclientesindetalle_hojaderuta___wwds_3_tfclinom_sel, lV68Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser, AV69Pedidosclientesindetalle_hojaderuta___wwds_7_tfbarser_sel, lV70Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc, AV71Pedidosclientesindetalle_hojaderuta___wwds_9_tfbarserdsc_sel, lV72Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom, AV73Pedidosclientesindetalle_hojaderuta___wwds_11_tfbarcolnom_sel, Integer.valueOf(AV74Pedidosclientesindetalle_hojaderuta___wwds_12_tfbarcolnum), Integer.valueOf(AV75Pedidosclientesindetalle_hojaderuta___wwds_13_tfbarcolnum_to), lV76Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod, AV77Pedidosclientesindetalle_hojaderuta___wwds_15_tfbarmaqcod_sel, lV78Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest, AV79Pedidosclientesindetalle_hojaderuta___wwds_17_tfbaragrest_sel, Integer.valueOf(AV46CliCod), AV47BarFecGenfrom, AV48BarFecGento, Byte.valueOf(AV49BarSitfrom), Byte.valueOf(AV50BarSitto), Integer.valueOf(AV51BarCod), Byte.valueOf(AV52BarCodreo), AV53BarCodpar});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brkAQH11 = false ;
         A180BarMaqCod = P0AQH7_A180BarMaqCod[0] ;
         A159BarFecGen = P0AQH7_A159BarFecGen[0] ;
         A213BarSit = P0AQH7_A213BarSit[0] ;
         A13696BarNHdr = P0AQH7_A13696BarNHdr[0] ;
         A252CliCod = P0AQH7_A252CliCod[0] ;
         n252CliCod = P0AQH7_n252CliCod[0] ;
         A120BarAgrEst = P0AQH7_A120BarAgrEst[0] ;
         A136BarColNum = P0AQH7_A136BarColNum[0] ;
         A135BarColNom = P0AQH7_A135BarColNom[0] ;
         A1652BarSerDsc = P0AQH7_A1652BarSerDsc[0] ;
         A212BarSer = P0AQH7_A212BarSer[0] ;
         A279CliNom = P0AQH7_A279CliNom[0] ;
         A129BarCod = P0AQH7_A129BarCod[0] ;
         A132BarCodReo = P0AQH7_A132BarCodReo[0] ;
         A130BarCodPar = P0AQH7_A130BarCodPar[0] ;
         A143BarDisNum = P0AQH7_A143BarDisNum[0] ;
         A4812BarEncCli = P0AQH7_A4812BarEncCli[0] ;
         A396EmprCod = P0AQH7_A396EmprCod[0] ;
         A279CliNom = P0AQH7_A279CliNom[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_char3) ;
         hojaderuta___wwgetfilterdata.this.A396EmprCod = GXv_char6[0] ;
         hojaderuta___wwgetfilterdata.this.A4812BarEncCli = GXv_char5[0] ;
         hojaderuta___wwgetfilterdata.this.A143BarDisNum = GXv_char4[0] ;
         hojaderuta___wwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( (GXutil.strcmp("", AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A180BarMaqCod) , GXutil.padr( "%" + GXutil.upper( AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A120BarAgrEst) , GXutil.padr( "%" + GXutil.upper( AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            if ( ! ( (GXutil.strcmp("", AV67Pedidosclientesindetalle_hojaderuta___wwds_5_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV66Pedidosclientesindetalle_hojaderuta___wwds_4_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV66Pedidosclientesindetalle_hojaderuta___wwds_4_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV67Pedidosclientesindetalle_hojaderuta___wwds_5_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV67Pedidosclientesindetalle_hojaderuta___wwds_5_tfpedidocliente_sel) == 0 ) ) )
               {
                  AV18count = 0 ;
                  while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P0AQH7_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P0AQH7_A180BarMaqCod[0], A180BarMaqCod) == 0 ) )
                  {
                     brkAQH11 = false ;
                     A129BarCod = P0AQH7_A129BarCod[0] ;
                     A132BarCodReo = P0AQH7_A132BarCodReo[0] ;
                     A130BarCodPar = P0AQH7_A130BarCodPar[0] ;
                     AV18count = (long)(AV18count+1) ;
                     brkAQH11 = true ;
                     pr_default.readNext(5);
                  }
                  if ( ! (GXutil.strcmp("", A180BarMaqCod)==0) )
                  {
                     AV13Option = A180BarMaqCod ;
                     AV14Options.add(AV13Option, 0);
                     AV17OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV18count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                  }
                  if ( AV14Options.size() == 50 )
                  {
                     /* Exit For each command. Update data (if necessary), close cursors & exit. */
                     if (true) break;
                  }
               }
            }
         }
         if ( ! brkAQH11 )
         {
            brkAQH11 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   public void S181( )
   {
      /* 'LOADBARAGRESTOPTIONS' Routine */
      returnInSub = false ;
      AV54TFBarAgrEst = AV25SearchTxt ;
      AV55TFBarAgrEst_Sel = "" ;
      AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext = AV56FilterFullText ;
      AV64Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom = AV30TFCliNom ;
      AV65Pedidosclientesindetalle_hojaderuta___wwds_3_tfclinom_sel = AV31TFCliNom_Sel ;
      AV66Pedidosclientesindetalle_hojaderuta___wwds_4_tfpedidocliente = AV32TFPedidoCliente ;
      AV67Pedidosclientesindetalle_hojaderuta___wwds_5_tfpedidocliente_sel = AV33TFPedidoCliente_Sel ;
      AV68Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser = AV34TFBarSer ;
      AV69Pedidosclientesindetalle_hojaderuta___wwds_7_tfbarser_sel = AV35TFBarSer_Sel ;
      AV70Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc = AV36TFBarSerDsc ;
      AV71Pedidosclientesindetalle_hojaderuta___wwds_9_tfbarserdsc_sel = AV37TFBarSerDsc_Sel ;
      AV72Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom = AV38TFBarColNom ;
      AV73Pedidosclientesindetalle_hojaderuta___wwds_11_tfbarcolnom_sel = AV39TFBarColNom_Sel ;
      AV74Pedidosclientesindetalle_hojaderuta___wwds_12_tfbarcolnum = AV40TFBarColNum ;
      AV75Pedidosclientesindetalle_hojaderuta___wwds_13_tfbarcolnum_to = AV41TFBarColNum_To ;
      AV76Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod = AV42TFBarMaqCod ;
      AV77Pedidosclientesindetalle_hojaderuta___wwds_15_tfbarmaqcod_sel = AV43TFBarMaqCod_Sel ;
      AV78Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest = AV54TFBarAgrEst ;
      AV79Pedidosclientesindetalle_hojaderuta___wwds_17_tfbaragrest_sel = AV55TFBarAgrEst_Sel ;
      pr_default.dynParam(6, new Object[]{ new Object[]{
                                           AV65Pedidosclientesindetalle_hojaderuta___wwds_3_tfclinom_sel ,
                                           AV64Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom ,
                                           AV69Pedidosclientesindetalle_hojaderuta___wwds_7_tfbarser_sel ,
                                           AV68Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser ,
                                           AV71Pedidosclientesindetalle_hojaderuta___wwds_9_tfbarserdsc_sel ,
                                           AV70Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc ,
                                           AV73Pedidosclientesindetalle_hojaderuta___wwds_11_tfbarcolnom_sel ,
                                           AV72Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom ,
                                           Integer.valueOf(AV74Pedidosclientesindetalle_hojaderuta___wwds_12_tfbarcolnum) ,
                                           Integer.valueOf(AV75Pedidosclientesindetalle_hojaderuta___wwds_13_tfbarcolnum_to) ,
                                           AV77Pedidosclientesindetalle_hojaderuta___wwds_15_tfbarmaqcod_sel ,
                                           AV76Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod ,
                                           AV79Pedidosclientesindetalle_hojaderuta___wwds_17_tfbaragrest_sel ,
                                           AV78Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest ,
                                           Integer.valueOf(AV46CliCod) ,
                                           AV47BarFecGenfrom ,
                                           AV48BarFecGento ,
                                           Byte.valueOf(AV49BarSitfrom) ,
                                           Byte.valueOf(AV50BarSitto) ,
                                           Integer.valueOf(AV51BarCod) ,
                                           Byte.valueOf(AV52BarCodreo) ,
                                           AV53BarCodpar ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A180BarMaqCod ,
                                           A120BarAgrEst ,
                                           Integer.valueOf(A252CliCod) ,
                                           A159BarFecGen ,
                                           Byte.valueOf(A213BarSit) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext ,
                                           A13878PedidoClie ,
                                           A13696BarNHdr ,
                                           AV67Pedidosclientesindetalle_hojaderuta___wwds_5_tfpedidocliente_sel ,
                                           AV66Pedidosclientesindetalle_hojaderuta___wwds_4_tfpedidocliente ,
                                           A396EmprCod ,
                                           AV45Emprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV64Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom = GXutil.padr( GXutil.rtrim( AV64Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom), 30, "%") ;
      lV68Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser = GXutil.padr( GXutil.rtrim( AV68Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser), 16, "%") ;
      lV70Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV70Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc), 26, "%") ;
      lV72Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV72Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom), 13, "%") ;
      lV76Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod = GXutil.padr( GXutil.rtrim( AV76Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod), 6, "%") ;
      lV78Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest = GXutil.padr( GXutil.rtrim( AV78Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest), 1, "%") ;
      /* Using cursor P0AQH8 */
      pr_default.execute(6, new Object[] {AV45Emprcod, lV64Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom, AV65Pedidosclientesindetalle_hojaderuta___wwds_3_tfclinom_sel, lV68Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser, AV69Pedidosclientesindetalle_hojaderuta___wwds_7_tfbarser_sel, lV70Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc, AV71Pedidosclientesindetalle_hojaderuta___wwds_9_tfbarserdsc_sel, lV72Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom, AV73Pedidosclientesindetalle_hojaderuta___wwds_11_tfbarcolnom_sel, Integer.valueOf(AV74Pedidosclientesindetalle_hojaderuta___wwds_12_tfbarcolnum), Integer.valueOf(AV75Pedidosclientesindetalle_hojaderuta___wwds_13_tfbarcolnum_to), lV76Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod, AV77Pedidosclientesindetalle_hojaderuta___wwds_15_tfbarmaqcod_sel, lV78Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest, AV79Pedidosclientesindetalle_hojaderuta___wwds_17_tfbaragrest_sel, Integer.valueOf(AV46CliCod), AV47BarFecGenfrom, AV48BarFecGento, Byte.valueOf(AV49BarSitfrom), Byte.valueOf(AV50BarSitto), Integer.valueOf(AV51BarCod), Byte.valueOf(AV52BarCodreo), AV53BarCodpar});
      while ( (pr_default.getStatus(6) != 101) )
      {
         brkAQH13 = false ;
         A120BarAgrEst = P0AQH8_A120BarAgrEst[0] ;
         A159BarFecGen = P0AQH8_A159BarFecGen[0] ;
         A213BarSit = P0AQH8_A213BarSit[0] ;
         A13696BarNHdr = P0AQH8_A13696BarNHdr[0] ;
         A252CliCod = P0AQH8_A252CliCod[0] ;
         n252CliCod = P0AQH8_n252CliCod[0] ;
         A180BarMaqCod = P0AQH8_A180BarMaqCod[0] ;
         A136BarColNum = P0AQH8_A136BarColNum[0] ;
         A135BarColNom = P0AQH8_A135BarColNom[0] ;
         A1652BarSerDsc = P0AQH8_A1652BarSerDsc[0] ;
         A212BarSer = P0AQH8_A212BarSer[0] ;
         A279CliNom = P0AQH8_A279CliNom[0] ;
         A129BarCod = P0AQH8_A129BarCod[0] ;
         A132BarCodReo = P0AQH8_A132BarCodReo[0] ;
         A130BarCodPar = P0AQH8_A130BarCodPar[0] ;
         A143BarDisNum = P0AQH8_A143BarDisNum[0] ;
         A4812BarEncCli = P0AQH8_A4812BarEncCli[0] ;
         A396EmprCod = P0AQH8_A396EmprCod[0] ;
         A279CliNom = P0AQH8_A279CliNom[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_char3) ;
         hojaderuta___wwgetfilterdata.this.A396EmprCod = GXv_char6[0] ;
         hojaderuta___wwgetfilterdata.this.A4812BarEncCli = GXv_char5[0] ;
         hojaderuta___wwgetfilterdata.this.A143BarDisNum = GXv_char4[0] ;
         hojaderuta___wwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( (GXutil.strcmp("", AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A180BarMaqCod) , GXutil.padr( "%" + GXutil.upper( AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A120BarAgrEst) , GXutil.padr( "%" + GXutil.upper( AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            if ( ! ( (GXutil.strcmp("", AV67Pedidosclientesindetalle_hojaderuta___wwds_5_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV66Pedidosclientesindetalle_hojaderuta___wwds_4_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV66Pedidosclientesindetalle_hojaderuta___wwds_4_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV67Pedidosclientesindetalle_hojaderuta___wwds_5_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV67Pedidosclientesindetalle_hojaderuta___wwds_5_tfpedidocliente_sel) == 0 ) ) )
               {
                  AV18count = 0 ;
                  while ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(P0AQH8_A120BarAgrEst[0], A120BarAgrEst) == 0 ) )
                  {
                     brkAQH13 = false ;
                     A129BarCod = P0AQH8_A129BarCod[0] ;
                     A132BarCodReo = P0AQH8_A132BarCodReo[0] ;
                     A130BarCodPar = P0AQH8_A130BarCodPar[0] ;
                     A396EmprCod = P0AQH8_A396EmprCod[0] ;
                     AV18count = (long)(AV18count+1) ;
                     brkAQH13 = true ;
                     pr_default.readNext(6);
                  }
                  if ( ! (GXutil.strcmp("", A120BarAgrEst)==0) )
                  {
                     AV13Option = A120BarAgrEst ;
                     AV15OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A120BarAgrEst, "@!"))) ;
                     AV14Options.add(AV13Option, 0);
                     AV16OptionsDesc.add(AV15OptionDesc, 0);
                     AV17OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV18count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                  }
                  if ( AV14Options.size() == 50 )
                  {
                     /* Exit For each command. Update data (if necessary), close cursors & exit. */
                     if (true) break;
                  }
               }
            }
         }
         if ( ! brkAQH13 )
         {
            brkAQH13 = true ;
            pr_default.readNext(6);
         }
      }
      pr_default.close(6);
   }

   protected void cleanup( )
   {
      this.aP3[0] = hojaderuta___wwgetfilterdata.this.AV27OptionsJson;
      this.aP4[0] = hojaderuta___wwgetfilterdata.this.AV28OptionsDescJson;
      this.aP5[0] = hojaderuta___wwgetfilterdata.this.AV29OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV27OptionsJson = "" ;
      AV28OptionsDescJson = "" ;
      AV29OptionIndexesJson = "" ;
      AV14Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV16OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV17OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV19Session = httpContext.getWebSession();
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV56FilterFullText = "" ;
      AV30TFCliNom = "" ;
      AV31TFCliNom_Sel = "" ;
      AV32TFPedidoCliente = "" ;
      AV33TFPedidoCliente_Sel = "" ;
      AV34TFBarSer = "" ;
      AV35TFBarSer_Sel = "" ;
      AV36TFBarSerDsc = "" ;
      AV37TFBarSerDsc_Sel = "" ;
      AV38TFBarColNom = "" ;
      AV39TFBarColNom_Sel = "" ;
      AV42TFBarMaqCod = "" ;
      AV43TFBarMaqCod_Sel = "" ;
      AV54TFBarAgrEst = "" ;
      AV55TFBarAgrEst_Sel = "" ;
      A279CliNom = "" ;
      AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext = "" ;
      AV64Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom = "" ;
      AV65Pedidosclientesindetalle_hojaderuta___wwds_3_tfclinom_sel = "" ;
      AV66Pedidosclientesindetalle_hojaderuta___wwds_4_tfpedidocliente = "" ;
      AV67Pedidosclientesindetalle_hojaderuta___wwds_5_tfpedidocliente_sel = "" ;
      AV68Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser = "" ;
      AV69Pedidosclientesindetalle_hojaderuta___wwds_7_tfbarser_sel = "" ;
      AV70Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc = "" ;
      AV71Pedidosclientesindetalle_hojaderuta___wwds_9_tfbarserdsc_sel = "" ;
      AV72Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom = "" ;
      AV73Pedidosclientesindetalle_hojaderuta___wwds_11_tfbarcolnom_sel = "" ;
      AV76Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod = "" ;
      AV77Pedidosclientesindetalle_hojaderuta___wwds_15_tfbarmaqcod_sel = "" ;
      AV78Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest = "" ;
      AV79Pedidosclientesindetalle_hojaderuta___wwds_17_tfbaragrest_sel = "" ;
      lV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV64Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom = "" ;
      lV68Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser = "" ;
      lV70Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc = "" ;
      lV72Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom = "" ;
      lV76Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod = "" ;
      lV78Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest = "" ;
      AV47BarFecGenfrom = GXutil.nullDate() ;
      AV48BarFecGento = GXutil.nullDate() ;
      AV53BarCodpar = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A180BarMaqCod = "" ;
      A120BarAgrEst = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A130BarCodPar = "" ;
      A13878PedidoClie = "" ;
      A13696BarNHdr = "" ;
      A396EmprCod = "" ;
      AV45Emprcod = "" ;
      P0AQH2_A279CliNom = new String[] {""} ;
      P0AQH2_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P0AQH2_A213BarSit = new byte[1] ;
      P0AQH2_A13696BarNHdr = new String[] {""} ;
      P0AQH2_A252CliCod = new int[1] ;
      P0AQH2_n252CliCod = new boolean[] {false} ;
      P0AQH2_A120BarAgrEst = new String[] {""} ;
      P0AQH2_A180BarMaqCod = new String[] {""} ;
      P0AQH2_A136BarColNum = new int[1] ;
      P0AQH2_A135BarColNom = new String[] {""} ;
      P0AQH2_A1652BarSerDsc = new String[] {""} ;
      P0AQH2_A212BarSer = new String[] {""} ;
      P0AQH2_A129BarCod = new int[1] ;
      P0AQH2_A132BarCodReo = new byte[1] ;
      P0AQH2_A130BarCodPar = new String[] {""} ;
      P0AQH2_A143BarDisNum = new String[] {""} ;
      P0AQH2_A4812BarEncCli = new String[] {""} ;
      P0AQH2_A396EmprCod = new String[] {""} ;
      A143BarDisNum = "" ;
      A4812BarEncCli = "" ;
      AV13Option = "" ;
      P0AQH3_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P0AQH3_A213BarSit = new byte[1] ;
      P0AQH3_A13696BarNHdr = new String[] {""} ;
      P0AQH3_A252CliCod = new int[1] ;
      P0AQH3_n252CliCod = new boolean[] {false} ;
      P0AQH3_A120BarAgrEst = new String[] {""} ;
      P0AQH3_A180BarMaqCod = new String[] {""} ;
      P0AQH3_A136BarColNum = new int[1] ;
      P0AQH3_A135BarColNom = new String[] {""} ;
      P0AQH3_A1652BarSerDsc = new String[] {""} ;
      P0AQH3_A212BarSer = new String[] {""} ;
      P0AQH3_A279CliNom = new String[] {""} ;
      P0AQH3_A129BarCod = new int[1] ;
      P0AQH3_A132BarCodReo = new byte[1] ;
      P0AQH3_A130BarCodPar = new String[] {""} ;
      P0AQH3_A143BarDisNum = new String[] {""} ;
      P0AQH3_A4812BarEncCli = new String[] {""} ;
      P0AQH3_A396EmprCod = new String[] {""} ;
      P0AQH4_A212BarSer = new String[] {""} ;
      P0AQH4_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P0AQH4_A213BarSit = new byte[1] ;
      P0AQH4_A13696BarNHdr = new String[] {""} ;
      P0AQH4_A252CliCod = new int[1] ;
      P0AQH4_n252CliCod = new boolean[] {false} ;
      P0AQH4_A120BarAgrEst = new String[] {""} ;
      P0AQH4_A180BarMaqCod = new String[] {""} ;
      P0AQH4_A136BarColNum = new int[1] ;
      P0AQH4_A135BarColNom = new String[] {""} ;
      P0AQH4_A1652BarSerDsc = new String[] {""} ;
      P0AQH4_A279CliNom = new String[] {""} ;
      P0AQH4_A129BarCod = new int[1] ;
      P0AQH4_A132BarCodReo = new byte[1] ;
      P0AQH4_A130BarCodPar = new String[] {""} ;
      P0AQH4_A143BarDisNum = new String[] {""} ;
      P0AQH4_A4812BarEncCli = new String[] {""} ;
      P0AQH4_A396EmprCod = new String[] {""} ;
      P0AQH5_A1652BarSerDsc = new String[] {""} ;
      P0AQH5_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P0AQH5_A213BarSit = new byte[1] ;
      P0AQH5_A13696BarNHdr = new String[] {""} ;
      P0AQH5_A252CliCod = new int[1] ;
      P0AQH5_n252CliCod = new boolean[] {false} ;
      P0AQH5_A120BarAgrEst = new String[] {""} ;
      P0AQH5_A180BarMaqCod = new String[] {""} ;
      P0AQH5_A136BarColNum = new int[1] ;
      P0AQH5_A135BarColNom = new String[] {""} ;
      P0AQH5_A212BarSer = new String[] {""} ;
      P0AQH5_A279CliNom = new String[] {""} ;
      P0AQH5_A129BarCod = new int[1] ;
      P0AQH5_A132BarCodReo = new byte[1] ;
      P0AQH5_A130BarCodPar = new String[] {""} ;
      P0AQH5_A143BarDisNum = new String[] {""} ;
      P0AQH5_A4812BarEncCli = new String[] {""} ;
      P0AQH5_A396EmprCod = new String[] {""} ;
      P0AQH6_A135BarColNom = new String[] {""} ;
      P0AQH6_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P0AQH6_A213BarSit = new byte[1] ;
      P0AQH6_A13696BarNHdr = new String[] {""} ;
      P0AQH6_A252CliCod = new int[1] ;
      P0AQH6_n252CliCod = new boolean[] {false} ;
      P0AQH6_A120BarAgrEst = new String[] {""} ;
      P0AQH6_A180BarMaqCod = new String[] {""} ;
      P0AQH6_A136BarColNum = new int[1] ;
      P0AQH6_A1652BarSerDsc = new String[] {""} ;
      P0AQH6_A212BarSer = new String[] {""} ;
      P0AQH6_A279CliNom = new String[] {""} ;
      P0AQH6_A129BarCod = new int[1] ;
      P0AQH6_A132BarCodReo = new byte[1] ;
      P0AQH6_A130BarCodPar = new String[] {""} ;
      P0AQH6_A143BarDisNum = new String[] {""} ;
      P0AQH6_A4812BarEncCli = new String[] {""} ;
      P0AQH6_A396EmprCod = new String[] {""} ;
      P0AQH7_A180BarMaqCod = new String[] {""} ;
      P0AQH7_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P0AQH7_A213BarSit = new byte[1] ;
      P0AQH7_A13696BarNHdr = new String[] {""} ;
      P0AQH7_A252CliCod = new int[1] ;
      P0AQH7_n252CliCod = new boolean[] {false} ;
      P0AQH7_A120BarAgrEst = new String[] {""} ;
      P0AQH7_A136BarColNum = new int[1] ;
      P0AQH7_A135BarColNom = new String[] {""} ;
      P0AQH7_A1652BarSerDsc = new String[] {""} ;
      P0AQH7_A212BarSer = new String[] {""} ;
      P0AQH7_A279CliNom = new String[] {""} ;
      P0AQH7_A129BarCod = new int[1] ;
      P0AQH7_A132BarCodReo = new byte[1] ;
      P0AQH7_A130BarCodPar = new String[] {""} ;
      P0AQH7_A143BarDisNum = new String[] {""} ;
      P0AQH7_A4812BarEncCli = new String[] {""} ;
      P0AQH7_A396EmprCod = new String[] {""} ;
      P0AQH8_A120BarAgrEst = new String[] {""} ;
      P0AQH8_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P0AQH8_A213BarSit = new byte[1] ;
      P0AQH8_A13696BarNHdr = new String[] {""} ;
      P0AQH8_A252CliCod = new int[1] ;
      P0AQH8_n252CliCod = new boolean[] {false} ;
      P0AQH8_A180BarMaqCod = new String[] {""} ;
      P0AQH8_A136BarColNum = new int[1] ;
      P0AQH8_A135BarColNom = new String[] {""} ;
      P0AQH8_A1652BarSerDsc = new String[] {""} ;
      P0AQH8_A212BarSer = new String[] {""} ;
      P0AQH8_A279CliNom = new String[] {""} ;
      P0AQH8_A129BarCod = new int[1] ;
      P0AQH8_A132BarCodReo = new byte[1] ;
      P0AQH8_A130BarCodPar = new String[] {""} ;
      P0AQH8_A143BarDisNum = new String[] {""} ;
      P0AQH8_A4812BarEncCli = new String[] {""} ;
      P0AQH8_A396EmprCod = new String[] {""} ;
      GXt_char2 = "" ;
      GXv_char6 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      AV15OptionDesc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidosclientesindetalle.hojaderuta___wwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0AQH2_A279CliNom, P0AQH2_A159BarFecGen, P0AQH2_A213BarSit, P0AQH2_A13696BarNHdr, P0AQH2_A252CliCod, P0AQH2_n252CliCod, P0AQH2_A120BarAgrEst, P0AQH2_A180BarMaqCod, P0AQH2_A136BarColNum, P0AQH2_A135BarColNom,
            P0AQH2_A1652BarSerDsc, P0AQH2_A212BarSer, P0AQH2_A129BarCod, P0AQH2_A132BarCodReo, P0AQH2_A130BarCodPar, P0AQH2_A143BarDisNum, P0AQH2_A4812BarEncCli, P0AQH2_A396EmprCod
            }
            , new Object[] {
            P0AQH3_A159BarFecGen, P0AQH3_A213BarSit, P0AQH3_A13696BarNHdr, P0AQH3_A252CliCod, P0AQH3_n252CliCod, P0AQH3_A120BarAgrEst, P0AQH3_A180BarMaqCod, P0AQH3_A136BarColNum, P0AQH3_A135BarColNom, P0AQH3_A1652BarSerDsc,
            P0AQH3_A212BarSer, P0AQH3_A279CliNom, P0AQH3_A129BarCod, P0AQH3_A132BarCodReo, P0AQH3_A130BarCodPar, P0AQH3_A143BarDisNum, P0AQH3_A4812BarEncCli, P0AQH3_A396EmprCod
            }
            , new Object[] {
            P0AQH4_A212BarSer, P0AQH4_A159BarFecGen, P0AQH4_A213BarSit, P0AQH4_A13696BarNHdr, P0AQH4_A252CliCod, P0AQH4_n252CliCod, P0AQH4_A120BarAgrEst, P0AQH4_A180BarMaqCod, P0AQH4_A136BarColNum, P0AQH4_A135BarColNom,
            P0AQH4_A1652BarSerDsc, P0AQH4_A279CliNom, P0AQH4_A129BarCod, P0AQH4_A132BarCodReo, P0AQH4_A130BarCodPar, P0AQH4_A143BarDisNum, P0AQH4_A4812BarEncCli, P0AQH4_A396EmprCod
            }
            , new Object[] {
            P0AQH5_A1652BarSerDsc, P0AQH5_A159BarFecGen, P0AQH5_A213BarSit, P0AQH5_A13696BarNHdr, P0AQH5_A252CliCod, P0AQH5_n252CliCod, P0AQH5_A120BarAgrEst, P0AQH5_A180BarMaqCod, P0AQH5_A136BarColNum, P0AQH5_A135BarColNom,
            P0AQH5_A212BarSer, P0AQH5_A279CliNom, P0AQH5_A129BarCod, P0AQH5_A132BarCodReo, P0AQH5_A130BarCodPar, P0AQH5_A143BarDisNum, P0AQH5_A4812BarEncCli, P0AQH5_A396EmprCod
            }
            , new Object[] {
            P0AQH6_A135BarColNom, P0AQH6_A159BarFecGen, P0AQH6_A213BarSit, P0AQH6_A13696BarNHdr, P0AQH6_A252CliCod, P0AQH6_n252CliCod, P0AQH6_A120BarAgrEst, P0AQH6_A180BarMaqCod, P0AQH6_A136BarColNum, P0AQH6_A1652BarSerDsc,
            P0AQH6_A212BarSer, P0AQH6_A279CliNom, P0AQH6_A129BarCod, P0AQH6_A132BarCodReo, P0AQH6_A130BarCodPar, P0AQH6_A143BarDisNum, P0AQH6_A4812BarEncCli, P0AQH6_A396EmprCod
            }
            , new Object[] {
            P0AQH7_A180BarMaqCod, P0AQH7_A159BarFecGen, P0AQH7_A213BarSit, P0AQH7_A13696BarNHdr, P0AQH7_A252CliCod, P0AQH7_n252CliCod, P0AQH7_A120BarAgrEst, P0AQH7_A136BarColNum, P0AQH7_A135BarColNom, P0AQH7_A1652BarSerDsc,
            P0AQH7_A212BarSer, P0AQH7_A279CliNom, P0AQH7_A129BarCod, P0AQH7_A132BarCodReo, P0AQH7_A130BarCodPar, P0AQH7_A143BarDisNum, P0AQH7_A4812BarEncCli, P0AQH7_A396EmprCod
            }
            , new Object[] {
            P0AQH8_A120BarAgrEst, P0AQH8_A159BarFecGen, P0AQH8_A213BarSit, P0AQH8_A13696BarNHdr, P0AQH8_A252CliCod, P0AQH8_n252CliCod, P0AQH8_A180BarMaqCod, P0AQH8_A136BarColNum, P0AQH8_A135BarColNom, P0AQH8_A1652BarSerDsc,
            P0AQH8_A212BarSer, P0AQH8_A279CliNom, P0AQH8_A129BarCod, P0AQH8_A132BarCodReo, P0AQH8_A130BarCodPar, P0AQH8_A143BarDisNum, P0AQH8_A4812BarEncCli, P0AQH8_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV49BarSitfrom ;
   private byte AV50BarSitto ;
   private byte AV52BarCodreo ;
   private byte A213BarSit ;
   private byte A132BarCodReo ;
   private short Gx_err ;
   private int AV61GXV1 ;
   private int AV40TFBarColNum ;
   private int AV41TFBarColNum_To ;
   private int AV74Pedidosclientesindetalle_hojaderuta___wwds_12_tfbarcolnum ;
   private int AV75Pedidosclientesindetalle_hojaderuta___wwds_13_tfbarcolnum_to ;
   private int AV46CliCod ;
   private int AV51BarCod ;
   private int A136BarColNum ;
   private int A252CliCod ;
   private int A129BarCod ;
   private int AV12InsertIndex ;
   private long AV18count ;
   private String AV30TFCliNom ;
   private String AV31TFCliNom_Sel ;
   private String AV32TFPedidoCliente ;
   private String AV33TFPedidoCliente_Sel ;
   private String AV34TFBarSer ;
   private String AV35TFBarSer_Sel ;
   private String AV36TFBarSerDsc ;
   private String AV37TFBarSerDsc_Sel ;
   private String AV38TFBarColNom ;
   private String AV39TFBarColNom_Sel ;
   private String AV42TFBarMaqCod ;
   private String AV43TFBarMaqCod_Sel ;
   private String AV54TFBarAgrEst ;
   private String AV55TFBarAgrEst_Sel ;
   private String A279CliNom ;
   private String AV64Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom ;
   private String AV65Pedidosclientesindetalle_hojaderuta___wwds_3_tfclinom_sel ;
   private String AV66Pedidosclientesindetalle_hojaderuta___wwds_4_tfpedidocliente ;
   private String AV67Pedidosclientesindetalle_hojaderuta___wwds_5_tfpedidocliente_sel ;
   private String AV68Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser ;
   private String AV69Pedidosclientesindetalle_hojaderuta___wwds_7_tfbarser_sel ;
   private String AV70Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc ;
   private String AV71Pedidosclientesindetalle_hojaderuta___wwds_9_tfbarserdsc_sel ;
   private String AV72Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom ;
   private String AV73Pedidosclientesindetalle_hojaderuta___wwds_11_tfbarcolnom_sel ;
   private String AV76Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod ;
   private String AV77Pedidosclientesindetalle_hojaderuta___wwds_15_tfbarmaqcod_sel ;
   private String AV78Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest ;
   private String AV79Pedidosclientesindetalle_hojaderuta___wwds_17_tfbaragrest_sel ;
   private String scmdbuf ;
   private String lV64Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom ;
   private String lV68Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser ;
   private String lV70Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc ;
   private String lV72Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom ;
   private String lV76Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod ;
   private String lV78Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest ;
   private String AV53BarCodpar ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A180BarMaqCod ;
   private String A120BarAgrEst ;
   private String A130BarCodPar ;
   private String A13878PedidoClie ;
   private String A13696BarNHdr ;
   private String A396EmprCod ;
   private String AV45Emprcod ;
   private String A143BarDisNum ;
   private String A4812BarEncCli ;
   private String GXt_char2 ;
   private String GXv_char6[] ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private java.util.Date AV47BarFecGenfrom ;
   private java.util.Date AV48BarFecGento ;
   private java.util.Date A159BarFecGen ;
   private boolean returnInSub ;
   private boolean brkAQH2 ;
   private boolean n252CliCod ;
   private boolean brkAQH5 ;
   private boolean brkAQH7 ;
   private boolean brkAQH9 ;
   private boolean brkAQH11 ;
   private boolean brkAQH13 ;
   private String AV27OptionsJson ;
   private String AV28OptionsDescJson ;
   private String AV29OptionIndexesJson ;
   private String AV24DDOName ;
   private String AV25SearchTxt ;
   private String AV26SearchTxtTo ;
   private String AV56FilterFullText ;
   private String AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext ;
   private String lV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext ;
   private String AV13Option ;
   private String AV15OptionDesc ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AQH2_A279CliNom ;
   private java.util.Date[] P0AQH2_A159BarFecGen ;
   private byte[] P0AQH2_A213BarSit ;
   private String[] P0AQH2_A13696BarNHdr ;
   private int[] P0AQH2_A252CliCod ;
   private boolean[] P0AQH2_n252CliCod ;
   private String[] P0AQH2_A120BarAgrEst ;
   private String[] P0AQH2_A180BarMaqCod ;
   private int[] P0AQH2_A136BarColNum ;
   private String[] P0AQH2_A135BarColNom ;
   private String[] P0AQH2_A1652BarSerDsc ;
   private String[] P0AQH2_A212BarSer ;
   private int[] P0AQH2_A129BarCod ;
   private byte[] P0AQH2_A132BarCodReo ;
   private String[] P0AQH2_A130BarCodPar ;
   private String[] P0AQH2_A143BarDisNum ;
   private String[] P0AQH2_A4812BarEncCli ;
   private String[] P0AQH2_A396EmprCod ;
   private java.util.Date[] P0AQH3_A159BarFecGen ;
   private byte[] P0AQH3_A213BarSit ;
   private String[] P0AQH3_A13696BarNHdr ;
   private int[] P0AQH3_A252CliCod ;
   private boolean[] P0AQH3_n252CliCod ;
   private String[] P0AQH3_A120BarAgrEst ;
   private String[] P0AQH3_A180BarMaqCod ;
   private int[] P0AQH3_A136BarColNum ;
   private String[] P0AQH3_A135BarColNom ;
   private String[] P0AQH3_A1652BarSerDsc ;
   private String[] P0AQH3_A212BarSer ;
   private String[] P0AQH3_A279CliNom ;
   private int[] P0AQH3_A129BarCod ;
   private byte[] P0AQH3_A132BarCodReo ;
   private String[] P0AQH3_A130BarCodPar ;
   private String[] P0AQH3_A143BarDisNum ;
   private String[] P0AQH3_A4812BarEncCli ;
   private String[] P0AQH3_A396EmprCod ;
   private String[] P0AQH4_A212BarSer ;
   private java.util.Date[] P0AQH4_A159BarFecGen ;
   private byte[] P0AQH4_A213BarSit ;
   private String[] P0AQH4_A13696BarNHdr ;
   private int[] P0AQH4_A252CliCod ;
   private boolean[] P0AQH4_n252CliCod ;
   private String[] P0AQH4_A120BarAgrEst ;
   private String[] P0AQH4_A180BarMaqCod ;
   private int[] P0AQH4_A136BarColNum ;
   private String[] P0AQH4_A135BarColNom ;
   private String[] P0AQH4_A1652BarSerDsc ;
   private String[] P0AQH4_A279CliNom ;
   private int[] P0AQH4_A129BarCod ;
   private byte[] P0AQH4_A132BarCodReo ;
   private String[] P0AQH4_A130BarCodPar ;
   private String[] P0AQH4_A143BarDisNum ;
   private String[] P0AQH4_A4812BarEncCli ;
   private String[] P0AQH4_A396EmprCod ;
   private String[] P0AQH5_A1652BarSerDsc ;
   private java.util.Date[] P0AQH5_A159BarFecGen ;
   private byte[] P0AQH5_A213BarSit ;
   private String[] P0AQH5_A13696BarNHdr ;
   private int[] P0AQH5_A252CliCod ;
   private boolean[] P0AQH5_n252CliCod ;
   private String[] P0AQH5_A120BarAgrEst ;
   private String[] P0AQH5_A180BarMaqCod ;
   private int[] P0AQH5_A136BarColNum ;
   private String[] P0AQH5_A135BarColNom ;
   private String[] P0AQH5_A212BarSer ;
   private String[] P0AQH5_A279CliNom ;
   private int[] P0AQH5_A129BarCod ;
   private byte[] P0AQH5_A132BarCodReo ;
   private String[] P0AQH5_A130BarCodPar ;
   private String[] P0AQH5_A143BarDisNum ;
   private String[] P0AQH5_A4812BarEncCli ;
   private String[] P0AQH5_A396EmprCod ;
   private String[] P0AQH6_A135BarColNom ;
   private java.util.Date[] P0AQH6_A159BarFecGen ;
   private byte[] P0AQH6_A213BarSit ;
   private String[] P0AQH6_A13696BarNHdr ;
   private int[] P0AQH6_A252CliCod ;
   private boolean[] P0AQH6_n252CliCod ;
   private String[] P0AQH6_A120BarAgrEst ;
   private String[] P0AQH6_A180BarMaqCod ;
   private int[] P0AQH6_A136BarColNum ;
   private String[] P0AQH6_A1652BarSerDsc ;
   private String[] P0AQH6_A212BarSer ;
   private String[] P0AQH6_A279CliNom ;
   private int[] P0AQH6_A129BarCod ;
   private byte[] P0AQH6_A132BarCodReo ;
   private String[] P0AQH6_A130BarCodPar ;
   private String[] P0AQH6_A143BarDisNum ;
   private String[] P0AQH6_A4812BarEncCli ;
   private String[] P0AQH6_A396EmprCod ;
   private String[] P0AQH7_A180BarMaqCod ;
   private java.util.Date[] P0AQH7_A159BarFecGen ;
   private byte[] P0AQH7_A213BarSit ;
   private String[] P0AQH7_A13696BarNHdr ;
   private int[] P0AQH7_A252CliCod ;
   private boolean[] P0AQH7_n252CliCod ;
   private String[] P0AQH7_A120BarAgrEst ;
   private int[] P0AQH7_A136BarColNum ;
   private String[] P0AQH7_A135BarColNom ;
   private String[] P0AQH7_A1652BarSerDsc ;
   private String[] P0AQH7_A212BarSer ;
   private String[] P0AQH7_A279CliNom ;
   private int[] P0AQH7_A129BarCod ;
   private byte[] P0AQH7_A132BarCodReo ;
   private String[] P0AQH7_A130BarCodPar ;
   private String[] P0AQH7_A143BarDisNum ;
   private String[] P0AQH7_A4812BarEncCli ;
   private String[] P0AQH7_A396EmprCod ;
   private String[] P0AQH8_A120BarAgrEst ;
   private java.util.Date[] P0AQH8_A159BarFecGen ;
   private byte[] P0AQH8_A213BarSit ;
   private String[] P0AQH8_A13696BarNHdr ;
   private int[] P0AQH8_A252CliCod ;
   private boolean[] P0AQH8_n252CliCod ;
   private String[] P0AQH8_A180BarMaqCod ;
   private int[] P0AQH8_A136BarColNum ;
   private String[] P0AQH8_A135BarColNom ;
   private String[] P0AQH8_A1652BarSerDsc ;
   private String[] P0AQH8_A212BarSer ;
   private String[] P0AQH8_A279CliNom ;
   private int[] P0AQH8_A129BarCod ;
   private byte[] P0AQH8_A132BarCodReo ;
   private String[] P0AQH8_A130BarCodPar ;
   private String[] P0AQH8_A143BarDisNum ;
   private String[] P0AQH8_A4812BarEncCli ;
   private String[] P0AQH8_A396EmprCod ;
   private GXSimpleCollection<String> AV14Options ;
   private GXSimpleCollection<String> AV16OptionsDesc ;
   private GXSimpleCollection<String> AV17OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV21GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV22GridStateFilterValue ;
}

final  class hojaderuta___wwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AQH2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV65Pedidosclientesindetalle_hojaderuta___wwds_3_tfclinom_sel ,
                                          String AV64Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom ,
                                          String AV69Pedidosclientesindetalle_hojaderuta___wwds_7_tfbarser_sel ,
                                          String AV68Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser ,
                                          String AV71Pedidosclientesindetalle_hojaderuta___wwds_9_tfbarserdsc_sel ,
                                          String AV70Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc ,
                                          String AV73Pedidosclientesindetalle_hojaderuta___wwds_11_tfbarcolnom_sel ,
                                          String AV72Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom ,
                                          int AV74Pedidosclientesindetalle_hojaderuta___wwds_12_tfbarcolnum ,
                                          int AV75Pedidosclientesindetalle_hojaderuta___wwds_13_tfbarcolnum_to ,
                                          String AV77Pedidosclientesindetalle_hojaderuta___wwds_15_tfbarmaqcod_sel ,
                                          String AV76Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod ,
                                          String AV79Pedidosclientesindetalle_hojaderuta___wwds_17_tfbaragrest_sel ,
                                          String AV78Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest ,
                                          int AV46CliCod ,
                                          java.util.Date AV47BarFecGenfrom ,
                                          java.util.Date AV48BarFecGento ,
                                          byte AV49BarSitfrom ,
                                          byte AV50BarSitto ,
                                          int AV51BarCod ,
                                          byte AV52BarCodreo ,
                                          String AV53BarCodpar ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A180BarMaqCod ,
                                          String A120BarAgrEst ,
                                          int A252CliCod ,
                                          java.util.Date A159BarFecGen ,
                                          byte A213BarSit ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext ,
                                          String A13878PedidoClie ,
                                          String A13696BarNHdr ,
                                          String AV67Pedidosclientesindetalle_hojaderuta___wwds_5_tfpedidocliente_sel ,
                                          String AV66Pedidosclientesindetalle_hojaderuta___wwds_4_tfpedidocliente ,
                                          String A396EmprCod ,
                                          String AV45Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int7 = new byte[23];
      Object[] GXv_Object8 = new Object[2];
      scmdbuf = "SELECT T2.CliNom, T1.BarFecGen, T1.BarSit, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) ||" ;
      scmdbuf += " T1.BarCodPar AS BarNHdr, T1.CliCod, T1.BarAgrEst, T1.BarMaqCod, T1.BarColNum, T1.BarColNom, T1.BarSerDsc, T1.BarSer, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarDisNum," ;
      scmdbuf += " T1.BarEncCli, T1.EmprCod FROM (TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( (GXutil.strcmp("", AV65Pedidosclientesindetalle_hojaderuta___wwds_3_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV64Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int7[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Pedidosclientesindetalle_hojaderuta___wwds_3_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int7[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Pedidosclientesindetalle_hojaderuta___wwds_7_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV68Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int7[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Pedidosclientesindetalle_hojaderuta___wwds_7_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int7[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Pedidosclientesindetalle_hojaderuta___wwds_9_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV70Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int7[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Pedidosclientesindetalle_hojaderuta___wwds_9_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int7[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Pedidosclientesindetalle_hojaderuta___wwds_11_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV72Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int7[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Pedidosclientesindetalle_hojaderuta___wwds_11_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int7[8] = (byte)(1) ;
      }
      if ( ! (0==AV74Pedidosclientesindetalle_hojaderuta___wwds_12_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int7[9] = (byte)(1) ;
      }
      if ( ! (0==AV75Pedidosclientesindetalle_hojaderuta___wwds_13_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int7[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Pedidosclientesindetalle_hojaderuta___wwds_15_tfbarmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV76Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int7[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Pedidosclientesindetalle_hojaderuta___wwds_15_tfbarmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarMaqCod = ?)");
      }
      else
      {
         GXv_int7[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Pedidosclientesindetalle_hojaderuta___wwds_17_tfbaragrest_sel)==0) && ( ! (GXutil.strcmp("", AV78Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAgrEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int7[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Pedidosclientesindetalle_hojaderuta___wwds_17_tfbaragrest_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAgrEst = ?)");
      }
      else
      {
         GXv_int7[14] = (byte)(1) ;
      }
      if ( ! (0==AV46CliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int7[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV47BarFecGenfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int7[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV48BarFecGento)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int7[17] = (byte)(1) ;
      }
      if ( ! (0==AV49BarSitfrom) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int7[18] = (byte)(1) ;
      }
      if ( ! (0==AV50BarSitto) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int7[19] = (byte)(1) ;
      }
      if ( ! (0==AV51BarCod) )
      {
         addWhere(sWhereString, "(T1.BarCod = ?)");
      }
      else
      {
         GXv_int7[20] = (byte)(1) ;
      }
      if ( ! (0==AV52BarCodreo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo = ?)");
      }
      else
      {
         GXv_int7[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53BarCodpar)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int7[22] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.CliNom" ;
      GXv_Object8[0] = scmdbuf ;
      GXv_Object8[1] = GXv_int7 ;
      return GXv_Object8 ;
   }

   protected Object[] conditional_P0AQH3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV65Pedidosclientesindetalle_hojaderuta___wwds_3_tfclinom_sel ,
                                          String AV64Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom ,
                                          String AV69Pedidosclientesindetalle_hojaderuta___wwds_7_tfbarser_sel ,
                                          String AV68Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser ,
                                          String AV71Pedidosclientesindetalle_hojaderuta___wwds_9_tfbarserdsc_sel ,
                                          String AV70Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc ,
                                          String AV73Pedidosclientesindetalle_hojaderuta___wwds_11_tfbarcolnom_sel ,
                                          String AV72Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom ,
                                          int AV74Pedidosclientesindetalle_hojaderuta___wwds_12_tfbarcolnum ,
                                          int AV75Pedidosclientesindetalle_hojaderuta___wwds_13_tfbarcolnum_to ,
                                          String AV77Pedidosclientesindetalle_hojaderuta___wwds_15_tfbarmaqcod_sel ,
                                          String AV76Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod ,
                                          String AV79Pedidosclientesindetalle_hojaderuta___wwds_17_tfbaragrest_sel ,
                                          String AV78Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest ,
                                          int AV46CliCod ,
                                          java.util.Date AV47BarFecGenfrom ,
                                          java.util.Date AV48BarFecGento ,
                                          byte AV49BarSitfrom ,
                                          byte AV50BarSitto ,
                                          int AV51BarCod ,
                                          byte AV52BarCodreo ,
                                          String AV53BarCodpar ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A180BarMaqCod ,
                                          String A120BarAgrEst ,
                                          int A252CliCod ,
                                          java.util.Date A159BarFecGen ,
                                          byte A213BarSit ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext ,
                                          String A13878PedidoClie ,
                                          String A13696BarNHdr ,
                                          String AV67Pedidosclientesindetalle_hojaderuta___wwds_5_tfpedidocliente_sel ,
                                          String AV66Pedidosclientesindetalle_hojaderuta___wwds_4_tfpedidocliente ,
                                          String AV45Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[23];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT T1.BarFecGen, T1.BarSit, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar" ;
      scmdbuf += " AS BarNHdr, T1.CliCod, T1.BarAgrEst, T1.BarMaqCod, T1.BarColNum, T1.BarColNom, T1.BarSerDsc, T1.BarSer, T2.CliNom, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarDisNum," ;
      scmdbuf += " T1.BarEncCli, T1.EmprCod FROM (TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( (GXutil.strcmp("", AV65Pedidosclientesindetalle_hojaderuta___wwds_3_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV64Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Pedidosclientesindetalle_hojaderuta___wwds_3_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int9[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Pedidosclientesindetalle_hojaderuta___wwds_7_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV68Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Pedidosclientesindetalle_hojaderuta___wwds_7_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int9[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Pedidosclientesindetalle_hojaderuta___wwds_9_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV70Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Pedidosclientesindetalle_hojaderuta___wwds_9_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int9[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Pedidosclientesindetalle_hojaderuta___wwds_11_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV72Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Pedidosclientesindetalle_hojaderuta___wwds_11_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int9[8] = (byte)(1) ;
      }
      if ( ! (0==AV74Pedidosclientesindetalle_hojaderuta___wwds_12_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int9[9] = (byte)(1) ;
      }
      if ( ! (0==AV75Pedidosclientesindetalle_hojaderuta___wwds_13_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int9[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Pedidosclientesindetalle_hojaderuta___wwds_15_tfbarmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV76Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Pedidosclientesindetalle_hojaderuta___wwds_15_tfbarmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarMaqCod = ?)");
      }
      else
      {
         GXv_int9[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Pedidosclientesindetalle_hojaderuta___wwds_17_tfbaragrest_sel)==0) && ( ! (GXutil.strcmp("", AV78Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAgrEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Pedidosclientesindetalle_hojaderuta___wwds_17_tfbaragrest_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAgrEst = ?)");
      }
      else
      {
         GXv_int9[14] = (byte)(1) ;
      }
      if ( ! (0==AV46CliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int9[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV47BarFecGenfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int9[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV48BarFecGento)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int9[17] = (byte)(1) ;
      }
      if ( ! (0==AV49BarSitfrom) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int9[18] = (byte)(1) ;
      }
      if ( ! (0==AV50BarSitto) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int9[19] = (byte)(1) ;
      }
      if ( ! (0==AV51BarCod) )
      {
         addWhere(sWhereString, "(T1.BarCod = ?)");
      }
      else
      {
         GXv_int9[20] = (byte)(1) ;
      }
      if ( ! (0==AV52BarCodreo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo = ?)");
      }
      else
      {
         GXv_int9[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53BarCodpar)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int9[22] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object10[0] = scmdbuf ;
      GXv_Object10[1] = GXv_int9 ;
      return GXv_Object10 ;
   }

   protected Object[] conditional_P0AQH4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV65Pedidosclientesindetalle_hojaderuta___wwds_3_tfclinom_sel ,
                                          String AV64Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom ,
                                          String AV69Pedidosclientesindetalle_hojaderuta___wwds_7_tfbarser_sel ,
                                          String AV68Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser ,
                                          String AV71Pedidosclientesindetalle_hojaderuta___wwds_9_tfbarserdsc_sel ,
                                          String AV70Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc ,
                                          String AV73Pedidosclientesindetalle_hojaderuta___wwds_11_tfbarcolnom_sel ,
                                          String AV72Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom ,
                                          int AV74Pedidosclientesindetalle_hojaderuta___wwds_12_tfbarcolnum ,
                                          int AV75Pedidosclientesindetalle_hojaderuta___wwds_13_tfbarcolnum_to ,
                                          String AV77Pedidosclientesindetalle_hojaderuta___wwds_15_tfbarmaqcod_sel ,
                                          String AV76Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod ,
                                          String AV79Pedidosclientesindetalle_hojaderuta___wwds_17_tfbaragrest_sel ,
                                          String AV78Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest ,
                                          int AV46CliCod ,
                                          java.util.Date AV47BarFecGenfrom ,
                                          java.util.Date AV48BarFecGento ,
                                          byte AV49BarSitfrom ,
                                          byte AV50BarSitto ,
                                          int AV51BarCod ,
                                          byte AV52BarCodreo ,
                                          String AV53BarCodpar ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A180BarMaqCod ,
                                          String A120BarAgrEst ,
                                          int A252CliCod ,
                                          java.util.Date A159BarFecGen ,
                                          byte A213BarSit ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext ,
                                          String A13878PedidoClie ,
                                          String A13696BarNHdr ,
                                          String AV67Pedidosclientesindetalle_hojaderuta___wwds_5_tfpedidocliente_sel ,
                                          String AV66Pedidosclientesindetalle_hojaderuta___wwds_4_tfpedidocliente ,
                                          String AV45Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int11 = new byte[23];
      Object[] GXv_Object12 = new Object[2];
      scmdbuf = "SELECT T1.BarSer, T1.BarFecGen, T1.BarSit, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) ||" ;
      scmdbuf += " T1.BarCodPar AS BarNHdr, T1.CliCod, T1.BarAgrEst, T1.BarMaqCod, T1.BarColNum, T1.BarColNom, T1.BarSerDsc, T2.CliNom, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarDisNum," ;
      scmdbuf += " T1.BarEncCli, T1.EmprCod FROM (TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( (GXutil.strcmp("", AV65Pedidosclientesindetalle_hojaderuta___wwds_3_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV64Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Pedidosclientesindetalle_hojaderuta___wwds_3_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int11[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Pedidosclientesindetalle_hojaderuta___wwds_7_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV68Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Pedidosclientesindetalle_hojaderuta___wwds_7_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int11[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Pedidosclientesindetalle_hojaderuta___wwds_9_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV70Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Pedidosclientesindetalle_hojaderuta___wwds_9_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int11[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Pedidosclientesindetalle_hojaderuta___wwds_11_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV72Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Pedidosclientesindetalle_hojaderuta___wwds_11_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int11[8] = (byte)(1) ;
      }
      if ( ! (0==AV74Pedidosclientesindetalle_hojaderuta___wwds_12_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int11[9] = (byte)(1) ;
      }
      if ( ! (0==AV75Pedidosclientesindetalle_hojaderuta___wwds_13_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int11[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Pedidosclientesindetalle_hojaderuta___wwds_15_tfbarmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV76Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Pedidosclientesindetalle_hojaderuta___wwds_15_tfbarmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarMaqCod = ?)");
      }
      else
      {
         GXv_int11[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Pedidosclientesindetalle_hojaderuta___wwds_17_tfbaragrest_sel)==0) && ( ! (GXutil.strcmp("", AV78Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAgrEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Pedidosclientesindetalle_hojaderuta___wwds_17_tfbaragrest_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAgrEst = ?)");
      }
      else
      {
         GXv_int11[14] = (byte)(1) ;
      }
      if ( ! (0==AV46CliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int11[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV47BarFecGenfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int11[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV48BarFecGento)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int11[17] = (byte)(1) ;
      }
      if ( ! (0==AV49BarSitfrom) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int11[18] = (byte)(1) ;
      }
      if ( ! (0==AV50BarSitto) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int11[19] = (byte)(1) ;
      }
      if ( ! (0==AV51BarCod) )
      {
         addWhere(sWhereString, "(T1.BarCod = ?)");
      }
      else
      {
         GXv_int11[20] = (byte)(1) ;
      }
      if ( ! (0==AV52BarCodreo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo = ?)");
      }
      else
      {
         GXv_int11[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53BarCodpar)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int11[22] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarSer" ;
      GXv_Object12[0] = scmdbuf ;
      GXv_Object12[1] = GXv_int11 ;
      return GXv_Object12 ;
   }

   protected Object[] conditional_P0AQH5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV65Pedidosclientesindetalle_hojaderuta___wwds_3_tfclinom_sel ,
                                          String AV64Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom ,
                                          String AV69Pedidosclientesindetalle_hojaderuta___wwds_7_tfbarser_sel ,
                                          String AV68Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser ,
                                          String AV71Pedidosclientesindetalle_hojaderuta___wwds_9_tfbarserdsc_sel ,
                                          String AV70Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc ,
                                          String AV73Pedidosclientesindetalle_hojaderuta___wwds_11_tfbarcolnom_sel ,
                                          String AV72Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom ,
                                          int AV74Pedidosclientesindetalle_hojaderuta___wwds_12_tfbarcolnum ,
                                          int AV75Pedidosclientesindetalle_hojaderuta___wwds_13_tfbarcolnum_to ,
                                          String AV77Pedidosclientesindetalle_hojaderuta___wwds_15_tfbarmaqcod_sel ,
                                          String AV76Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod ,
                                          String AV79Pedidosclientesindetalle_hojaderuta___wwds_17_tfbaragrest_sel ,
                                          String AV78Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest ,
                                          int AV46CliCod ,
                                          java.util.Date AV47BarFecGenfrom ,
                                          java.util.Date AV48BarFecGento ,
                                          byte AV49BarSitfrom ,
                                          byte AV50BarSitto ,
                                          int AV51BarCod ,
                                          byte AV52BarCodreo ,
                                          String AV53BarCodpar ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A180BarMaqCod ,
                                          String A120BarAgrEst ,
                                          int A252CliCod ,
                                          java.util.Date A159BarFecGen ,
                                          byte A213BarSit ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext ,
                                          String A13878PedidoClie ,
                                          String A13696BarNHdr ,
                                          String AV67Pedidosclientesindetalle_hojaderuta___wwds_5_tfpedidocliente_sel ,
                                          String AV66Pedidosclientesindetalle_hojaderuta___wwds_4_tfpedidocliente ,
                                          String A396EmprCod ,
                                          String AV45Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int13 = new byte[23];
      Object[] GXv_Object14 = new Object[2];
      scmdbuf = "SELECT T1.BarSerDsc, T1.BarFecGen, T1.BarSit, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2)))" ;
      scmdbuf += " || T1.BarCodPar AS BarNHdr, T1.CliCod, T1.BarAgrEst, T1.BarMaqCod, T1.BarColNum, T1.BarColNom, T1.BarSer, T2.CliNom, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarDisNum," ;
      scmdbuf += " T1.BarEncCli, T1.EmprCod FROM (TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( (GXutil.strcmp("", AV65Pedidosclientesindetalle_hojaderuta___wwds_3_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV64Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Pedidosclientesindetalle_hojaderuta___wwds_3_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int13[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Pedidosclientesindetalle_hojaderuta___wwds_7_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV68Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Pedidosclientesindetalle_hojaderuta___wwds_7_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int13[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Pedidosclientesindetalle_hojaderuta___wwds_9_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV70Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Pedidosclientesindetalle_hojaderuta___wwds_9_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int13[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Pedidosclientesindetalle_hojaderuta___wwds_11_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV72Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Pedidosclientesindetalle_hojaderuta___wwds_11_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int13[8] = (byte)(1) ;
      }
      if ( ! (0==AV74Pedidosclientesindetalle_hojaderuta___wwds_12_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int13[9] = (byte)(1) ;
      }
      if ( ! (0==AV75Pedidosclientesindetalle_hojaderuta___wwds_13_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int13[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Pedidosclientesindetalle_hojaderuta___wwds_15_tfbarmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV76Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Pedidosclientesindetalle_hojaderuta___wwds_15_tfbarmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarMaqCod = ?)");
      }
      else
      {
         GXv_int13[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Pedidosclientesindetalle_hojaderuta___wwds_17_tfbaragrest_sel)==0) && ( ! (GXutil.strcmp("", AV78Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAgrEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Pedidosclientesindetalle_hojaderuta___wwds_17_tfbaragrest_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAgrEst = ?)");
      }
      else
      {
         GXv_int13[14] = (byte)(1) ;
      }
      if ( ! (0==AV46CliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int13[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV47BarFecGenfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int13[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV48BarFecGento)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int13[17] = (byte)(1) ;
      }
      if ( ! (0==AV49BarSitfrom) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int13[18] = (byte)(1) ;
      }
      if ( ! (0==AV50BarSitto) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int13[19] = (byte)(1) ;
      }
      if ( ! (0==AV51BarCod) )
      {
         addWhere(sWhereString, "(T1.BarCod = ?)");
      }
      else
      {
         GXv_int13[20] = (byte)(1) ;
      }
      if ( ! (0==AV52BarCodreo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo = ?)");
      }
      else
      {
         GXv_int13[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53BarCodpar)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int13[22] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.BarSerDsc" ;
      GXv_Object14[0] = scmdbuf ;
      GXv_Object14[1] = GXv_int13 ;
      return GXv_Object14 ;
   }

   protected Object[] conditional_P0AQH6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV65Pedidosclientesindetalle_hojaderuta___wwds_3_tfclinom_sel ,
                                          String AV64Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom ,
                                          String AV69Pedidosclientesindetalle_hojaderuta___wwds_7_tfbarser_sel ,
                                          String AV68Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser ,
                                          String AV71Pedidosclientesindetalle_hojaderuta___wwds_9_tfbarserdsc_sel ,
                                          String AV70Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc ,
                                          String AV73Pedidosclientesindetalle_hojaderuta___wwds_11_tfbarcolnom_sel ,
                                          String AV72Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom ,
                                          int AV74Pedidosclientesindetalle_hojaderuta___wwds_12_tfbarcolnum ,
                                          int AV75Pedidosclientesindetalle_hojaderuta___wwds_13_tfbarcolnum_to ,
                                          String AV77Pedidosclientesindetalle_hojaderuta___wwds_15_tfbarmaqcod_sel ,
                                          String AV76Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod ,
                                          String AV79Pedidosclientesindetalle_hojaderuta___wwds_17_tfbaragrest_sel ,
                                          String AV78Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest ,
                                          int AV46CliCod ,
                                          java.util.Date AV47BarFecGenfrom ,
                                          java.util.Date AV48BarFecGento ,
                                          byte AV49BarSitfrom ,
                                          byte AV50BarSitto ,
                                          int AV51BarCod ,
                                          byte AV52BarCodreo ,
                                          String AV53BarCodpar ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A180BarMaqCod ,
                                          String A120BarAgrEst ,
                                          int A252CliCod ,
                                          java.util.Date A159BarFecGen ,
                                          byte A213BarSit ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext ,
                                          String A13878PedidoClie ,
                                          String A13696BarNHdr ,
                                          String AV67Pedidosclientesindetalle_hojaderuta___wwds_5_tfpedidocliente_sel ,
                                          String AV66Pedidosclientesindetalle_hojaderuta___wwds_4_tfpedidocliente ,
                                          String A396EmprCod ,
                                          String AV45Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int15 = new byte[23];
      Object[] GXv_Object16 = new Object[2];
      scmdbuf = "SELECT T1.BarColNom, T1.BarFecGen, T1.BarSit, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2)))" ;
      scmdbuf += " || T1.BarCodPar AS BarNHdr, T1.CliCod, T1.BarAgrEst, T1.BarMaqCod, T1.BarColNum, T1.BarSerDsc, T1.BarSer, T2.CliNom, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarDisNum," ;
      scmdbuf += " T1.BarEncCli, T1.EmprCod FROM (TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( (GXutil.strcmp("", AV65Pedidosclientesindetalle_hojaderuta___wwds_3_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV64Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Pedidosclientesindetalle_hojaderuta___wwds_3_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int15[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Pedidosclientesindetalle_hojaderuta___wwds_7_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV68Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Pedidosclientesindetalle_hojaderuta___wwds_7_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int15[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Pedidosclientesindetalle_hojaderuta___wwds_9_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV70Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Pedidosclientesindetalle_hojaderuta___wwds_9_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int15[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Pedidosclientesindetalle_hojaderuta___wwds_11_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV72Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Pedidosclientesindetalle_hojaderuta___wwds_11_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int15[8] = (byte)(1) ;
      }
      if ( ! (0==AV74Pedidosclientesindetalle_hojaderuta___wwds_12_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int15[9] = (byte)(1) ;
      }
      if ( ! (0==AV75Pedidosclientesindetalle_hojaderuta___wwds_13_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int15[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Pedidosclientesindetalle_hojaderuta___wwds_15_tfbarmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV76Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Pedidosclientesindetalle_hojaderuta___wwds_15_tfbarmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarMaqCod = ?)");
      }
      else
      {
         GXv_int15[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Pedidosclientesindetalle_hojaderuta___wwds_17_tfbaragrest_sel)==0) && ( ! (GXutil.strcmp("", AV78Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAgrEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Pedidosclientesindetalle_hojaderuta___wwds_17_tfbaragrest_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAgrEst = ?)");
      }
      else
      {
         GXv_int15[14] = (byte)(1) ;
      }
      if ( ! (0==AV46CliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int15[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV47BarFecGenfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int15[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV48BarFecGento)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int15[17] = (byte)(1) ;
      }
      if ( ! (0==AV49BarSitfrom) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int15[18] = (byte)(1) ;
      }
      if ( ! (0==AV50BarSitto) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int15[19] = (byte)(1) ;
      }
      if ( ! (0==AV51BarCod) )
      {
         addWhere(sWhereString, "(T1.BarCod = ?)");
      }
      else
      {
         GXv_int15[20] = (byte)(1) ;
      }
      if ( ! (0==AV52BarCodreo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo = ?)");
      }
      else
      {
         GXv_int15[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53BarCodpar)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int15[22] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.BarColNom" ;
      GXv_Object16[0] = scmdbuf ;
      GXv_Object16[1] = GXv_int15 ;
      return GXv_Object16 ;
   }

   protected Object[] conditional_P0AQH7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV65Pedidosclientesindetalle_hojaderuta___wwds_3_tfclinom_sel ,
                                          String AV64Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom ,
                                          String AV69Pedidosclientesindetalle_hojaderuta___wwds_7_tfbarser_sel ,
                                          String AV68Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser ,
                                          String AV71Pedidosclientesindetalle_hojaderuta___wwds_9_tfbarserdsc_sel ,
                                          String AV70Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc ,
                                          String AV73Pedidosclientesindetalle_hojaderuta___wwds_11_tfbarcolnom_sel ,
                                          String AV72Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom ,
                                          int AV74Pedidosclientesindetalle_hojaderuta___wwds_12_tfbarcolnum ,
                                          int AV75Pedidosclientesindetalle_hojaderuta___wwds_13_tfbarcolnum_to ,
                                          String AV77Pedidosclientesindetalle_hojaderuta___wwds_15_tfbarmaqcod_sel ,
                                          String AV76Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod ,
                                          String AV79Pedidosclientesindetalle_hojaderuta___wwds_17_tfbaragrest_sel ,
                                          String AV78Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest ,
                                          int AV46CliCod ,
                                          java.util.Date AV47BarFecGenfrom ,
                                          java.util.Date AV48BarFecGento ,
                                          byte AV49BarSitfrom ,
                                          byte AV50BarSitto ,
                                          int AV51BarCod ,
                                          byte AV52BarCodreo ,
                                          String AV53BarCodpar ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A180BarMaqCod ,
                                          String A120BarAgrEst ,
                                          int A252CliCod ,
                                          java.util.Date A159BarFecGen ,
                                          byte A213BarSit ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext ,
                                          String A13878PedidoClie ,
                                          String A13696BarNHdr ,
                                          String AV67Pedidosclientesindetalle_hojaderuta___wwds_5_tfpedidocliente_sel ,
                                          String AV66Pedidosclientesindetalle_hojaderuta___wwds_4_tfpedidocliente ,
                                          String AV45Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int17 = new byte[23];
      Object[] GXv_Object18 = new Object[2];
      scmdbuf = "SELECT T1.BarMaqCod, T1.BarFecGen, T1.BarSit, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2)))" ;
      scmdbuf += " || T1.BarCodPar AS BarNHdr, T1.CliCod, T1.BarAgrEst, T1.BarColNum, T1.BarColNom, T1.BarSerDsc, T1.BarSer, T2.CliNom, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarDisNum," ;
      scmdbuf += " T1.BarEncCli, T1.EmprCod FROM (TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( (GXutil.strcmp("", AV65Pedidosclientesindetalle_hojaderuta___wwds_3_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV64Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Pedidosclientesindetalle_hojaderuta___wwds_3_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int17[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Pedidosclientesindetalle_hojaderuta___wwds_7_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV68Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Pedidosclientesindetalle_hojaderuta___wwds_7_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int17[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Pedidosclientesindetalle_hojaderuta___wwds_9_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV70Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Pedidosclientesindetalle_hojaderuta___wwds_9_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int17[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Pedidosclientesindetalle_hojaderuta___wwds_11_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV72Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Pedidosclientesindetalle_hojaderuta___wwds_11_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int17[8] = (byte)(1) ;
      }
      if ( ! (0==AV74Pedidosclientesindetalle_hojaderuta___wwds_12_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int17[9] = (byte)(1) ;
      }
      if ( ! (0==AV75Pedidosclientesindetalle_hojaderuta___wwds_13_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int17[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Pedidosclientesindetalle_hojaderuta___wwds_15_tfbarmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV76Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Pedidosclientesindetalle_hojaderuta___wwds_15_tfbarmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarMaqCod = ?)");
      }
      else
      {
         GXv_int17[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Pedidosclientesindetalle_hojaderuta___wwds_17_tfbaragrest_sel)==0) && ( ! (GXutil.strcmp("", AV78Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAgrEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Pedidosclientesindetalle_hojaderuta___wwds_17_tfbaragrest_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAgrEst = ?)");
      }
      else
      {
         GXv_int17[14] = (byte)(1) ;
      }
      if ( ! (0==AV46CliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int17[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV47BarFecGenfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int17[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV48BarFecGento)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int17[17] = (byte)(1) ;
      }
      if ( ! (0==AV49BarSitfrom) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int17[18] = (byte)(1) ;
      }
      if ( ! (0==AV50BarSitto) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int17[19] = (byte)(1) ;
      }
      if ( ! (0==AV51BarCod) )
      {
         addWhere(sWhereString, "(T1.BarCod = ?)");
      }
      else
      {
         GXv_int17[20] = (byte)(1) ;
      }
      if ( ! (0==AV52BarCodreo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo = ?)");
      }
      else
      {
         GXv_int17[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53BarCodpar)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int17[22] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarMaqCod" ;
      GXv_Object18[0] = scmdbuf ;
      GXv_Object18[1] = GXv_int17 ;
      return GXv_Object18 ;
   }

   protected Object[] conditional_P0AQH8( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV65Pedidosclientesindetalle_hojaderuta___wwds_3_tfclinom_sel ,
                                          String AV64Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom ,
                                          String AV69Pedidosclientesindetalle_hojaderuta___wwds_7_tfbarser_sel ,
                                          String AV68Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser ,
                                          String AV71Pedidosclientesindetalle_hojaderuta___wwds_9_tfbarserdsc_sel ,
                                          String AV70Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc ,
                                          String AV73Pedidosclientesindetalle_hojaderuta___wwds_11_tfbarcolnom_sel ,
                                          String AV72Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom ,
                                          int AV74Pedidosclientesindetalle_hojaderuta___wwds_12_tfbarcolnum ,
                                          int AV75Pedidosclientesindetalle_hojaderuta___wwds_13_tfbarcolnum_to ,
                                          String AV77Pedidosclientesindetalle_hojaderuta___wwds_15_tfbarmaqcod_sel ,
                                          String AV76Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod ,
                                          String AV79Pedidosclientesindetalle_hojaderuta___wwds_17_tfbaragrest_sel ,
                                          String AV78Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest ,
                                          int AV46CliCod ,
                                          java.util.Date AV47BarFecGenfrom ,
                                          java.util.Date AV48BarFecGento ,
                                          byte AV49BarSitfrom ,
                                          byte AV50BarSitto ,
                                          int AV51BarCod ,
                                          byte AV52BarCodreo ,
                                          String AV53BarCodpar ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A180BarMaqCod ,
                                          String A120BarAgrEst ,
                                          int A252CliCod ,
                                          java.util.Date A159BarFecGen ,
                                          byte A213BarSit ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String AV63Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext ,
                                          String A13878PedidoClie ,
                                          String A13696BarNHdr ,
                                          String AV67Pedidosclientesindetalle_hojaderuta___wwds_5_tfpedidocliente_sel ,
                                          String AV66Pedidosclientesindetalle_hojaderuta___wwds_4_tfpedidocliente ,
                                          String A396EmprCod ,
                                          String AV45Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int19 = new byte[23];
      Object[] GXv_Object20 = new Object[2];
      scmdbuf = "SELECT T1.BarAgrEst, T1.BarFecGen, T1.BarSit, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2)))" ;
      scmdbuf += " || T1.BarCodPar AS BarNHdr, T1.CliCod, T1.BarMaqCod, T1.BarColNum, T1.BarColNom, T1.BarSerDsc, T1.BarSer, T2.CliNom, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarDisNum," ;
      scmdbuf += " T1.BarEncCli, T1.EmprCod FROM (TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( (GXutil.strcmp("", AV65Pedidosclientesindetalle_hojaderuta___wwds_3_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV64Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Pedidosclientesindetalle_hojaderuta___wwds_3_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int19[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Pedidosclientesindetalle_hojaderuta___wwds_7_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV68Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Pedidosclientesindetalle_hojaderuta___wwds_7_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int19[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Pedidosclientesindetalle_hojaderuta___wwds_9_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV70Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Pedidosclientesindetalle_hojaderuta___wwds_9_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int19[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Pedidosclientesindetalle_hojaderuta___wwds_11_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV72Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Pedidosclientesindetalle_hojaderuta___wwds_11_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int19[8] = (byte)(1) ;
      }
      if ( ! (0==AV74Pedidosclientesindetalle_hojaderuta___wwds_12_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int19[9] = (byte)(1) ;
      }
      if ( ! (0==AV75Pedidosclientesindetalle_hojaderuta___wwds_13_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int19[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Pedidosclientesindetalle_hojaderuta___wwds_15_tfbarmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV76Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Pedidosclientesindetalle_hojaderuta___wwds_15_tfbarmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarMaqCod = ?)");
      }
      else
      {
         GXv_int19[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Pedidosclientesindetalle_hojaderuta___wwds_17_tfbaragrest_sel)==0) && ( ! (GXutil.strcmp("", AV78Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAgrEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Pedidosclientesindetalle_hojaderuta___wwds_17_tfbaragrest_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAgrEst = ?)");
      }
      else
      {
         GXv_int19[14] = (byte)(1) ;
      }
      if ( ! (0==AV46CliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int19[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV47BarFecGenfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int19[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV48BarFecGento)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int19[17] = (byte)(1) ;
      }
      if ( ! (0==AV49BarSitfrom) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int19[18] = (byte)(1) ;
      }
      if ( ! (0==AV50BarSitto) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int19[19] = (byte)(1) ;
      }
      if ( ! (0==AV51BarCod) )
      {
         addWhere(sWhereString, "(T1.BarCod = ?)");
      }
      else
      {
         GXv_int19[20] = (byte)(1) ;
      }
      if ( ! (0==AV52BarCodreo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo = ?)");
      }
      else
      {
         GXv_int19[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53BarCodpar)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int19[22] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.BarAgrEst" ;
      GXv_Object20[0] = scmdbuf ;
      GXv_Object20[1] = GXv_int19 ;
      return GXv_Object20 ;
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
                  return conditional_P0AQH2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , (java.util.Date)dynConstraints[30] , ((Number) dynConstraints[31]).byteValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).byteValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] );
            case 1 :
                  return conditional_P0AQH3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , (java.util.Date)dynConstraints[30] , ((Number) dynConstraints[31]).byteValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).byteValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] );
            case 2 :
                  return conditional_P0AQH4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , (java.util.Date)dynConstraints[30] , ((Number) dynConstraints[31]).byteValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).byteValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] );
            case 3 :
                  return conditional_P0AQH5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , (java.util.Date)dynConstraints[30] , ((Number) dynConstraints[31]).byteValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).byteValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] );
            case 4 :
                  return conditional_P0AQH6(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , (java.util.Date)dynConstraints[30] , ((Number) dynConstraints[31]).byteValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).byteValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] );
            case 5 :
                  return conditional_P0AQH7(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , (java.util.Date)dynConstraints[30] , ((Number) dynConstraints[31]).byteValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).byteValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] );
            case 6 :
                  return conditional_P0AQH8(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , (java.util.Date)dynConstraints[30] , ((Number) dynConstraints[31]).byteValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).byteValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AQH2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AQH3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AQH4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AQH5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AQH6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AQH7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AQH8", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 11);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((String[]) buf[7])[0] = rslt.getString(7, 6);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 13);
               ((String[]) buf[10])[0] = rslt.getString(10, 26);
               ((String[]) buf[11])[0] = rslt.getString(11, 16);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((byte[]) buf[13])[0] = rslt.getByte(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 1);
               ((String[]) buf[15])[0] = rslt.getString(15, 8);
               ((String[]) buf[16])[0] = rslt.getString(16, 20);
               ((String[]) buf[17])[0] = rslt.getString(17, 3);
               return;
            case 1 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 11);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((String[]) buf[6])[0] = rslt.getString(6, 6);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 13);
               ((String[]) buf[9])[0] = rslt.getString(9, 26);
               ((String[]) buf[10])[0] = rslt.getString(10, 16);
               ((String[]) buf[11])[0] = rslt.getString(11, 30);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((byte[]) buf[13])[0] = rslt.getByte(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 1);
               ((String[]) buf[15])[0] = rslt.getString(15, 8);
               ((String[]) buf[16])[0] = rslt.getString(16, 20);
               ((String[]) buf[17])[0] = rslt.getString(17, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 11);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((String[]) buf[7])[0] = rslt.getString(7, 6);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 13);
               ((String[]) buf[10])[0] = rslt.getString(10, 26);
               ((String[]) buf[11])[0] = rslt.getString(11, 30);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((byte[]) buf[13])[0] = rslt.getByte(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 1);
               ((String[]) buf[15])[0] = rslt.getString(15, 8);
               ((String[]) buf[16])[0] = rslt.getString(16, 20);
               ((String[]) buf[17])[0] = rslt.getString(17, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 11);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((String[]) buf[7])[0] = rslt.getString(7, 6);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 13);
               ((String[]) buf[10])[0] = rslt.getString(10, 16);
               ((String[]) buf[11])[0] = rslt.getString(11, 30);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((byte[]) buf[13])[0] = rslt.getByte(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 1);
               ((String[]) buf[15])[0] = rslt.getString(15, 8);
               ((String[]) buf[16])[0] = rslt.getString(16, 20);
               ((String[]) buf[17])[0] = rslt.getString(17, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 13);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 11);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((String[]) buf[7])[0] = rslt.getString(7, 6);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 26);
               ((String[]) buf[10])[0] = rslt.getString(10, 16);
               ((String[]) buf[11])[0] = rslt.getString(11, 30);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((byte[]) buf[13])[0] = rslt.getByte(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 1);
               ((String[]) buf[15])[0] = rslt.getString(15, 8);
               ((String[]) buf[16])[0] = rslt.getString(16, 20);
               ((String[]) buf[17])[0] = rslt.getString(17, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 11);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 13);
               ((String[]) buf[9])[0] = rslt.getString(9, 26);
               ((String[]) buf[10])[0] = rslt.getString(10, 16);
               ((String[]) buf[11])[0] = rslt.getString(11, 30);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((byte[]) buf[13])[0] = rslt.getByte(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 1);
               ((String[]) buf[15])[0] = rslt.getString(15, 8);
               ((String[]) buf[16])[0] = rslt.getString(16, 20);
               ((String[]) buf[17])[0] = rslt.getString(17, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 11);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 6);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 13);
               ((String[]) buf[9])[0] = rslt.getString(9, 26);
               ((String[]) buf[10])[0] = rslt.getString(10, 16);
               ((String[]) buf[11])[0] = rslt.getString(11, 30);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((byte[]) buf[13])[0] = rslt.getByte(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 1);
               ((String[]) buf[15])[0] = rslt.getString(15, 8);
               ((String[]) buf[16])[0] = rslt.getString(16, 20);
               ((String[]) buf[17])[0] = rslt.getString(17, 3);
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
                  stmt.setString(sIdx, (String)parms[23], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 30);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 16);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 26);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 13);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 13);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 6);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 6);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[39]);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[40]);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[41]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[42]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[44]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 1);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 30);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 16);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 26);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 13);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 13);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 6);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 6);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[39]);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[40]);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[41]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[42]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[44]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 1);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 30);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 16);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 26);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 13);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 13);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 6);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 6);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[39]);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[40]);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[41]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[42]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[44]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 1);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 30);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 16);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 26);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 13);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 13);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 6);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 6);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[39]);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[40]);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[41]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[42]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[44]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 1);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 30);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 16);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 26);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 13);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 13);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 6);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 6);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[39]);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[40]);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[41]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[42]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[44]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 1);
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 30);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 16);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 26);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 13);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 13);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 6);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 6);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[39]);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[40]);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[41]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[42]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[44]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 1);
               }
               return;
            case 6 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 30);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 16);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 26);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 13);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 13);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 6);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 6);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[39]);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[40]);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[41]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[42]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[44]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 1);
               }
               return;
      }
   }

}

