package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class confirmacionpreciodocumento_produccionesgetfilterdata extends GXProcedure
{
   public confirmacionpreciodocumento_produccionesgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( confirmacionpreciodocumento_produccionesgetfilterdata.class ), "" );
   }

   public confirmacionpreciodocumento_produccionesgetfilterdata( int remoteHandle ,
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
      confirmacionpreciodocumento_produccionesgetfilterdata.this.aP5 = new String[] {""};
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
      confirmacionpreciodocumento_produccionesgetfilterdata.this.AV40DDOName = aP0;
      confirmacionpreciodocumento_produccionesgetfilterdata.this.AV41SearchTxt = aP1;
      confirmacionpreciodocumento_produccionesgetfilterdata.this.AV42SearchTxtTo = aP2;
      confirmacionpreciodocumento_produccionesgetfilterdata.this.aP3 = aP3;
      confirmacionpreciodocumento_produccionesgetfilterdata.this.aP4 = aP4;
      confirmacionpreciodocumento_produccionesgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV30Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV32OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV33OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV40DDOName), "DDO_BARNHDR") == 0 )
      {
         /* Execute user subroutine: 'LOADBARNHDROPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV40DDOName), "DDO_PEDIDOCLIENTE") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV40DDOName), "DDO_BARSER") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV40DDOName), "DDO_BARSERDSC") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV40DDOName), "DDO_BARCOLNOM") == 0 )
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
      AV43OptionsJson = AV30Options.toJSonString(false) ;
      AV44OptionsDescJson = AV32OptionsDesc.toJSonString(false) ;
      AV45OptionIndexesJson = AV33OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV35Session.getValue("Facturacion.ConfirmacionPrecioDocumento_ProduccionesGridState"), "") == 0 )
      {
         AV37GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Facturacion.ConfirmacionPrecioDocumento_ProduccionesGridState"), null, null);
      }
      else
      {
         AV37GridState.fromxml(AV35Session.getValue("Facturacion.ConfirmacionPrecioDocumento_ProduccionesGridState"), null, null);
      }
      AV55GXV1 = 1 ;
      while ( AV55GXV1 <= AV37GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV38GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV37GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV55GXV1));
         if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV10TFBarNHdr = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV11TFBarNHdr_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDIDOCLIENTE") == 0 )
         {
            AV12TFPedidoCliente = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDIDOCLIENTE_SEL") == 0 )
         {
            AV13TFPedidoCliente_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV14TFBarSer = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV15TFBarSer_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV16TFBarSerDsc = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV17TFBarSerDsc_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV18TFBarColNom = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV19TFBarColNom_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUM") == 0 )
         {
            AV20TFBarColNum = (int)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV21TFBarColNum_To = (int)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPCOL") == 0 )
         {
            AV22TFBarTipCol = (byte)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV23TFBarTipCol_To = (byte)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBKGME") == 0 )
         {
            AV24TFBarAlbKgmE = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV25TFBarAlbKgmE_To = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBMTRE") == 0 )
         {
            AV26TFBarAlbMtrE = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV27TFBarAlbMtrE_To = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROESP") == 0 )
         {
            AV51TFAlbProEsp = (byte)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV52TFAlbProEsp_To = (byte)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV47Emprcod = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBPROCOD") == 0 )
         {
            AV48AlbProcod = GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&GUIREMCLI") == 0 )
         {
            AV49Guiremcli = (int)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&GUIREMCLN") == 0 )
         {
            AV50GuiremCln = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV55GXV1 = (int)(AV55GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADBARNHDROPTIONS' Routine */
      returnInSub = false ;
      AV10TFBarNHdr = AV41SearchTxt ;
      AV11TFBarNHdr_Sel = "" ;
      AV57Facturacion_confirmacionpreciodocumento_produccionesds_1_tfbarnhdr = AV10TFBarNHdr ;
      AV58Facturacion_confirmacionpreciodocumento_produccionesds_2_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV59Facturacion_confirmacionpreciodocumento_produccionesds_3_tfpedidocliente = AV12TFPedidoCliente ;
      AV60Facturacion_confirmacionpreciodocumento_produccionesds_4_tfpedidocliente_sel = AV13TFPedidoCliente_Sel ;
      AV61Facturacion_confirmacionpreciodocumento_produccionesds_5_tfbarser = AV14TFBarSer ;
      AV62Facturacion_confirmacionpreciodocumento_produccionesds_6_tfbarser_sel = AV15TFBarSer_Sel ;
      AV63Facturacion_confirmacionpreciodocumento_produccionesds_7_tfbarserdsc = AV16TFBarSerDsc ;
      AV64Facturacion_confirmacionpreciodocumento_produccionesds_8_tfbarserdsc_sel = AV17TFBarSerDsc_Sel ;
      AV65Facturacion_confirmacionpreciodocumento_produccionesds_9_tfbarcolnom = AV18TFBarColNom ;
      AV66Facturacion_confirmacionpreciodocumento_produccionesds_10_tfbarcolnom_sel = AV19TFBarColNom_Sel ;
      AV67Facturacion_confirmacionpreciodocumento_produccionesds_11_tfbarcolnum = AV20TFBarColNum ;
      AV68Facturacion_confirmacionpreciodocumento_produccionesds_12_tfbarcolnum_to = AV21TFBarColNum_To ;
      AV69Facturacion_confirmacionpreciodocumento_produccionesds_13_tfbartipcol = AV22TFBarTipCol ;
      AV70Facturacion_confirmacionpreciodocumento_produccionesds_14_tfbartipcol_to = AV23TFBarTipCol_To ;
      AV71Facturacion_confirmacionpreciodocumento_produccionesds_15_tfbaralbkgme = AV24TFBarAlbKgmE ;
      AV72Facturacion_confirmacionpreciodocumento_produccionesds_16_tfbaralbkgme_to = AV25TFBarAlbKgmE_To ;
      AV73Facturacion_confirmacionpreciodocumento_produccionesds_17_tfbaralbmtre = AV26TFBarAlbMtrE ;
      AV74Facturacion_confirmacionpreciodocumento_produccionesds_18_tfbaralbmtre_to = AV27TFBarAlbMtrE_To ;
      AV75Facturacion_confirmacionpreciodocumento_produccionesds_19_tfalbproesp = AV51TFAlbProEsp ;
      AV76Facturacion_confirmacionpreciodocumento_produccionesds_20_tfalbproesp_to = AV52TFAlbProEsp_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV58Facturacion_confirmacionpreciodocumento_produccionesds_2_tfbarnhdr_sel ,
                                           AV57Facturacion_confirmacionpreciodocumento_produccionesds_1_tfbarnhdr ,
                                           AV62Facturacion_confirmacionpreciodocumento_produccionesds_6_tfbarser_sel ,
                                           AV61Facturacion_confirmacionpreciodocumento_produccionesds_5_tfbarser ,
                                           AV64Facturacion_confirmacionpreciodocumento_produccionesds_8_tfbarserdsc_sel ,
                                           AV63Facturacion_confirmacionpreciodocumento_produccionesds_7_tfbarserdsc ,
                                           AV66Facturacion_confirmacionpreciodocumento_produccionesds_10_tfbarcolnom_sel ,
                                           AV65Facturacion_confirmacionpreciodocumento_produccionesds_9_tfbarcolnom ,
                                           Integer.valueOf(AV67Facturacion_confirmacionpreciodocumento_produccionesds_11_tfbarcolnum) ,
                                           Integer.valueOf(AV68Facturacion_confirmacionpreciodocumento_produccionesds_12_tfbarcolnum_to) ,
                                           Byte.valueOf(AV69Facturacion_confirmacionpreciodocumento_produccionesds_13_tfbartipcol) ,
                                           Byte.valueOf(AV70Facturacion_confirmacionpreciodocumento_produccionesds_14_tfbartipcol_to) ,
                                           AV71Facturacion_confirmacionpreciodocumento_produccionesds_15_tfbaralbkgme ,
                                           AV72Facturacion_confirmacionpreciodocumento_produccionesds_16_tfbaralbkgme_to ,
                                           AV73Facturacion_confirmacionpreciodocumento_produccionesds_17_tfbaralbmtre ,
                                           AV74Facturacion_confirmacionpreciodocumento_produccionesds_18_tfbaralbmtre_to ,
                                           Byte.valueOf(AV75Facturacion_confirmacionpreciodocumento_produccionesds_19_tfalbproesp) ,
                                           Byte.valueOf(AV76Facturacion_confirmacionpreciodocumento_produccionesds_20_tfalbproesp_to) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           Byte.valueOf(A218BarTipCol) ,
                                           A1261BarAlbKgmE ,
                                           A1263BarAlbMtrE ,
                                           Byte.valueOf(A32AlbProEsp) ,
                                           AV60Facturacion_confirmacionpreciodocumento_produccionesds_4_tfpedidocliente_sel ,
                                           AV59Facturacion_confirmacionpreciodocumento_produccionesds_3_tfpedidocliente ,
                                           A13878PedidoClie ,
                                           AV47Emprcod ,
                                           Long.valueOf(AV48AlbProcod) ,
                                           A396EmprCod ,
                                           Long.valueOf(A30AlbProCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.LONG
                                           }
      });
      lV57Facturacion_confirmacionpreciodocumento_produccionesds_1_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV57Facturacion_confirmacionpreciodocumento_produccionesds_1_tfbarnhdr), 11, "%") ;
      lV61Facturacion_confirmacionpreciodocumento_produccionesds_5_tfbarser = GXutil.padr( GXutil.rtrim( AV61Facturacion_confirmacionpreciodocumento_produccionesds_5_tfbarser), 16, "%") ;
      lV63Facturacion_confirmacionpreciodocumento_produccionesds_7_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV63Facturacion_confirmacionpreciodocumento_produccionesds_7_tfbarserdsc), 26, "%") ;
      lV65Facturacion_confirmacionpreciodocumento_produccionesds_9_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV65Facturacion_confirmacionpreciodocumento_produccionesds_9_tfbarcolnom), 13, "%") ;
      /* Using cursor P09ZT2 */
      pr_default.execute(0, new Object[] {AV47Emprcod, Long.valueOf(AV48AlbProcod), lV57Facturacion_confirmacionpreciodocumento_produccionesds_1_tfbarnhdr, AV58Facturacion_confirmacionpreciodocumento_produccionesds_2_tfbarnhdr_sel, lV61Facturacion_confirmacionpreciodocumento_produccionesds_5_tfbarser, AV62Facturacion_confirmacionpreciodocumento_produccionesds_6_tfbarser_sel, lV63Facturacion_confirmacionpreciodocumento_produccionesds_7_tfbarserdsc, AV64Facturacion_confirmacionpreciodocumento_produccionesds_8_tfbarserdsc_sel, lV65Facturacion_confirmacionpreciodocumento_produccionesds_9_tfbarcolnom, AV66Facturacion_confirmacionpreciodocumento_produccionesds_10_tfbarcolnom_sel, Integer.valueOf(AV67Facturacion_confirmacionpreciodocumento_produccionesds_11_tfbarcolnum), Integer.valueOf(AV68Facturacion_confirmacionpreciodocumento_produccionesds_12_tfbarcolnum_to), Byte.valueOf(AV69Facturacion_confirmacionpreciodocumento_produccionesds_13_tfbartipcol), Byte.valueOf(AV70Facturacion_confirmacionpreciodocumento_produccionesds_14_tfbartipcol_to), AV71Facturacion_confirmacionpreciodocumento_produccionesds_15_tfbaralbkgme, AV72Facturacion_confirmacionpreciodocumento_produccionesds_16_tfbaralbkgme_to, AV73Facturacion_confirmacionpreciodocumento_produccionesds_17_tfbaralbmtre, AV74Facturacion_confirmacionpreciodocumento_produccionesds_18_tfbaralbmtre_to, Byte.valueOf(AV75Facturacion_confirmacionpreciodocumento_produccionesds_19_tfalbproesp), Byte.valueOf(AV76Facturacion_confirmacionpreciodocumento_produccionesds_20_tfalbproesp_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A30AlbProCod = P09ZT2_A30AlbProCod[0] ;
         A32AlbProEsp = P09ZT2_A32AlbProEsp[0] ;
         A1263BarAlbMtrE = P09ZT2_A1263BarAlbMtrE[0] ;
         A1261BarAlbKgmE = P09ZT2_A1261BarAlbKgmE[0] ;
         A218BarTipCol = P09ZT2_A218BarTipCol[0] ;
         A136BarColNum = P09ZT2_A136BarColNum[0] ;
         A135BarColNom = P09ZT2_A135BarColNom[0] ;
         A1652BarSerDsc = P09ZT2_A1652BarSerDsc[0] ;
         A212BarSer = P09ZT2_A212BarSer[0] ;
         A130BarCodPar = P09ZT2_A130BarCodPar[0] ;
         A132BarCodReo = P09ZT2_A132BarCodReo[0] ;
         A129BarCod = P09ZT2_A129BarCod[0] ;
         A143BarDisNum = P09ZT2_A143BarDisNum[0] ;
         A4812BarEncCli = P09ZT2_A4812BarEncCli[0] ;
         A396EmprCod = P09ZT2_A396EmprCod[0] ;
         A218BarTipCol = P09ZT2_A218BarTipCol[0] ;
         A136BarColNum = P09ZT2_A136BarColNum[0] ;
         A135BarColNom = P09ZT2_A135BarColNom[0] ;
         A1652BarSerDsc = P09ZT2_A1652BarSerDsc[0] ;
         A212BarSer = P09ZT2_A212BarSer[0] ;
         A143BarDisNum = P09ZT2_A143BarDisNum[0] ;
         A4812BarEncCli = P09ZT2_A4812BarEncCli[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char3[0] = A396EmprCod ;
         GXv_char4[0] = A4812BarEncCli ;
         GXv_char5[0] = A143BarDisNum ;
         GXv_char6[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char3, GXv_char4, GXv_char5, GXv_char6) ;
         confirmacionpreciodocumento_produccionesgetfilterdata.this.A396EmprCod = GXv_char3[0] ;
         confirmacionpreciodocumento_produccionesgetfilterdata.this.A4812BarEncCli = GXv_char4[0] ;
         confirmacionpreciodocumento_produccionesgetfilterdata.this.A143BarDisNum = GXv_char5[0] ;
         confirmacionpreciodocumento_produccionesgetfilterdata.this.GXt_char2 = GXv_char6[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV60Facturacion_confirmacionpreciodocumento_produccionesds_4_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV59Facturacion_confirmacionpreciodocumento_produccionesds_3_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV59Facturacion_confirmacionpreciodocumento_produccionesds_3_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV60Facturacion_confirmacionpreciodocumento_produccionesds_4_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV60Facturacion_confirmacionpreciodocumento_produccionesds_4_tfpedidocliente_sel) == 0 ) ) )
            {
               A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
               if ( ! (GXutil.strcmp("", A13696BarNHdr)==0) )
               {
                  AV29Option = A13696BarNHdr ;
                  AV28InsertIndex = 1 ;
                  while ( ( AV28InsertIndex <= AV30Options.size() ) && ( GXutil.strcmp((String)AV30Options.elementAt(-1+AV28InsertIndex), AV29Option) < 0 ) )
                  {
                     AV28InsertIndex = (int)(AV28InsertIndex+1) ;
                  }
                  if ( ( AV28InsertIndex <= AV30Options.size() ) && ( GXutil.strcmp((String)AV30Options.elementAt(-1+AV28InsertIndex), AV29Option) == 0 ) )
                  {
                     AV34count = GXutil.lval( (String)AV33OptionIndexes.elementAt(-1+AV28InsertIndex)) ;
                     AV34count = (long)(AV34count+1) ;
                     AV33OptionIndexes.removeItem(AV28InsertIndex);
                     AV33OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV34count), "Z,ZZZ,ZZZ,ZZ9")), AV28InsertIndex);
                  }
                  else
                  {
                     AV30Options.add(AV29Option, AV28InsertIndex);
                     AV33OptionIndexes.add("1", AV28InsertIndex);
                  }
               }
               if ( AV30Options.size() == 50 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPEDIDOCLIENTEOPTIONS' Routine */
      returnInSub = false ;
      AV12TFPedidoCliente = AV41SearchTxt ;
      AV13TFPedidoCliente_Sel = "" ;
      AV57Facturacion_confirmacionpreciodocumento_produccionesds_1_tfbarnhdr = AV10TFBarNHdr ;
      AV58Facturacion_confirmacionpreciodocumento_produccionesds_2_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV59Facturacion_confirmacionpreciodocumento_produccionesds_3_tfpedidocliente = AV12TFPedidoCliente ;
      AV60Facturacion_confirmacionpreciodocumento_produccionesds_4_tfpedidocliente_sel = AV13TFPedidoCliente_Sel ;
      AV61Facturacion_confirmacionpreciodocumento_produccionesds_5_tfbarser = AV14TFBarSer ;
      AV62Facturacion_confirmacionpreciodocumento_produccionesds_6_tfbarser_sel = AV15TFBarSer_Sel ;
      AV63Facturacion_confirmacionpreciodocumento_produccionesds_7_tfbarserdsc = AV16TFBarSerDsc ;
      AV64Facturacion_confirmacionpreciodocumento_produccionesds_8_tfbarserdsc_sel = AV17TFBarSerDsc_Sel ;
      AV65Facturacion_confirmacionpreciodocumento_produccionesds_9_tfbarcolnom = AV18TFBarColNom ;
      AV66Facturacion_confirmacionpreciodocumento_produccionesds_10_tfbarcolnom_sel = AV19TFBarColNom_Sel ;
      AV67Facturacion_confirmacionpreciodocumento_produccionesds_11_tfbarcolnum = AV20TFBarColNum ;
      AV68Facturacion_confirmacionpreciodocumento_produccionesds_12_tfbarcolnum_to = AV21TFBarColNum_To ;
      AV69Facturacion_confirmacionpreciodocumento_produccionesds_13_tfbartipcol = AV22TFBarTipCol ;
      AV70Facturacion_confirmacionpreciodocumento_produccionesds_14_tfbartipcol_to = AV23TFBarTipCol_To ;
      AV71Facturacion_confirmacionpreciodocumento_produccionesds_15_tfbaralbkgme = AV24TFBarAlbKgmE ;
      AV72Facturacion_confirmacionpreciodocumento_produccionesds_16_tfbaralbkgme_to = AV25TFBarAlbKgmE_To ;
      AV73Facturacion_confirmacionpreciodocumento_produccionesds_17_tfbaralbmtre = AV26TFBarAlbMtrE ;
      AV74Facturacion_confirmacionpreciodocumento_produccionesds_18_tfbaralbmtre_to = AV27TFBarAlbMtrE_To ;
      AV75Facturacion_confirmacionpreciodocumento_produccionesds_19_tfalbproesp = AV51TFAlbProEsp ;
      AV76Facturacion_confirmacionpreciodocumento_produccionesds_20_tfalbproesp_to = AV52TFAlbProEsp_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV58Facturacion_confirmacionpreciodocumento_produccionesds_2_tfbarnhdr_sel ,
                                           AV57Facturacion_confirmacionpreciodocumento_produccionesds_1_tfbarnhdr ,
                                           AV62Facturacion_confirmacionpreciodocumento_produccionesds_6_tfbarser_sel ,
                                           AV61Facturacion_confirmacionpreciodocumento_produccionesds_5_tfbarser ,
                                           AV64Facturacion_confirmacionpreciodocumento_produccionesds_8_tfbarserdsc_sel ,
                                           AV63Facturacion_confirmacionpreciodocumento_produccionesds_7_tfbarserdsc ,
                                           AV66Facturacion_confirmacionpreciodocumento_produccionesds_10_tfbarcolnom_sel ,
                                           AV65Facturacion_confirmacionpreciodocumento_produccionesds_9_tfbarcolnom ,
                                           Integer.valueOf(AV67Facturacion_confirmacionpreciodocumento_produccionesds_11_tfbarcolnum) ,
                                           Integer.valueOf(AV68Facturacion_confirmacionpreciodocumento_produccionesds_12_tfbarcolnum_to) ,
                                           Byte.valueOf(AV69Facturacion_confirmacionpreciodocumento_produccionesds_13_tfbartipcol) ,
                                           Byte.valueOf(AV70Facturacion_confirmacionpreciodocumento_produccionesds_14_tfbartipcol_to) ,
                                           AV71Facturacion_confirmacionpreciodocumento_produccionesds_15_tfbaralbkgme ,
                                           AV72Facturacion_confirmacionpreciodocumento_produccionesds_16_tfbaralbkgme_to ,
                                           AV73Facturacion_confirmacionpreciodocumento_produccionesds_17_tfbaralbmtre ,
                                           AV74Facturacion_confirmacionpreciodocumento_produccionesds_18_tfbaralbmtre_to ,
                                           Byte.valueOf(AV75Facturacion_confirmacionpreciodocumento_produccionesds_19_tfalbproesp) ,
                                           Byte.valueOf(AV76Facturacion_confirmacionpreciodocumento_produccionesds_20_tfalbproesp_to) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           Byte.valueOf(A218BarTipCol) ,
                                           A1261BarAlbKgmE ,
                                           A1263BarAlbMtrE ,
                                           Byte.valueOf(A32AlbProEsp) ,
                                           AV60Facturacion_confirmacionpreciodocumento_produccionesds_4_tfpedidocliente_sel ,
                                           AV59Facturacion_confirmacionpreciodocumento_produccionesds_3_tfpedidocliente ,
                                           A13878PedidoClie ,
                                           AV47Emprcod ,
                                           Long.valueOf(AV48AlbProcod) ,
                                           A396EmprCod ,
                                           Long.valueOf(A30AlbProCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.LONG
                                           }
      });
      lV57Facturacion_confirmacionpreciodocumento_produccionesds_1_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV57Facturacion_confirmacionpreciodocumento_produccionesds_1_tfbarnhdr), 11, "%") ;
      lV61Facturacion_confirmacionpreciodocumento_produccionesds_5_tfbarser = GXutil.padr( GXutil.rtrim( AV61Facturacion_confirmacionpreciodocumento_produccionesds_5_tfbarser), 16, "%") ;
      lV63Facturacion_confirmacionpreciodocumento_produccionesds_7_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV63Facturacion_confirmacionpreciodocumento_produccionesds_7_tfbarserdsc), 26, "%") ;
      lV65Facturacion_confirmacionpreciodocumento_produccionesds_9_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV65Facturacion_confirmacionpreciodocumento_produccionesds_9_tfbarcolnom), 13, "%") ;
      /* Using cursor P09ZT3 */
      pr_default.execute(1, new Object[] {AV47Emprcod, Long.valueOf(AV48AlbProcod), lV57Facturacion_confirmacionpreciodocumento_produccionesds_1_tfbarnhdr, AV58Facturacion_confirmacionpreciodocumento_produccionesds_2_tfbarnhdr_sel, lV61Facturacion_confirmacionpreciodocumento_produccionesds_5_tfbarser, AV62Facturacion_confirmacionpreciodocumento_produccionesds_6_tfbarser_sel, lV63Facturacion_confirmacionpreciodocumento_produccionesds_7_tfbarserdsc, AV64Facturacion_confirmacionpreciodocumento_produccionesds_8_tfbarserdsc_sel, lV65Facturacion_confirmacionpreciodocumento_produccionesds_9_tfbarcolnom, AV66Facturacion_confirmacionpreciodocumento_produccionesds_10_tfbarcolnom_sel, Integer.valueOf(AV67Facturacion_confirmacionpreciodocumento_produccionesds_11_tfbarcolnum), Integer.valueOf(AV68Facturacion_confirmacionpreciodocumento_produccionesds_12_tfbarcolnum_to), Byte.valueOf(AV69Facturacion_confirmacionpreciodocumento_produccionesds_13_tfbartipcol), Byte.valueOf(AV70Facturacion_confirmacionpreciodocumento_produccionesds_14_tfbartipcol_to), AV71Facturacion_confirmacionpreciodocumento_produccionesds_15_tfbaralbkgme, AV72Facturacion_confirmacionpreciodocumento_produccionesds_16_tfbaralbkgme_to, AV73Facturacion_confirmacionpreciodocumento_produccionesds_17_tfbaralbmtre, AV74Facturacion_confirmacionpreciodocumento_produccionesds_18_tfbaralbmtre_to, Byte.valueOf(AV75Facturacion_confirmacionpreciodocumento_produccionesds_19_tfalbproesp), Byte.valueOf(AV76Facturacion_confirmacionpreciodocumento_produccionesds_20_tfalbproesp_to)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A30AlbProCod = P09ZT3_A30AlbProCod[0] ;
         A32AlbProEsp = P09ZT3_A32AlbProEsp[0] ;
         A1263BarAlbMtrE = P09ZT3_A1263BarAlbMtrE[0] ;
         A1261BarAlbKgmE = P09ZT3_A1261BarAlbKgmE[0] ;
         A218BarTipCol = P09ZT3_A218BarTipCol[0] ;
         A136BarColNum = P09ZT3_A136BarColNum[0] ;
         A135BarColNom = P09ZT3_A135BarColNom[0] ;
         A1652BarSerDsc = P09ZT3_A1652BarSerDsc[0] ;
         A212BarSer = P09ZT3_A212BarSer[0] ;
         A130BarCodPar = P09ZT3_A130BarCodPar[0] ;
         A132BarCodReo = P09ZT3_A132BarCodReo[0] ;
         A129BarCod = P09ZT3_A129BarCod[0] ;
         A143BarDisNum = P09ZT3_A143BarDisNum[0] ;
         A4812BarEncCli = P09ZT3_A4812BarEncCli[0] ;
         A396EmprCod = P09ZT3_A396EmprCod[0] ;
         A218BarTipCol = P09ZT3_A218BarTipCol[0] ;
         A136BarColNum = P09ZT3_A136BarColNum[0] ;
         A135BarColNom = P09ZT3_A135BarColNom[0] ;
         A1652BarSerDsc = P09ZT3_A1652BarSerDsc[0] ;
         A212BarSer = P09ZT3_A212BarSer[0] ;
         A143BarDisNum = P09ZT3_A143BarDisNum[0] ;
         A4812BarEncCli = P09ZT3_A4812BarEncCli[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_char3) ;
         confirmacionpreciodocumento_produccionesgetfilterdata.this.A396EmprCod = GXv_char6[0] ;
         confirmacionpreciodocumento_produccionesgetfilterdata.this.A4812BarEncCli = GXv_char5[0] ;
         confirmacionpreciodocumento_produccionesgetfilterdata.this.A143BarDisNum = GXv_char4[0] ;
         confirmacionpreciodocumento_produccionesgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV60Facturacion_confirmacionpreciodocumento_produccionesds_4_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV59Facturacion_confirmacionpreciodocumento_produccionesds_3_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV59Facturacion_confirmacionpreciodocumento_produccionesds_3_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV60Facturacion_confirmacionpreciodocumento_produccionesds_4_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV60Facturacion_confirmacionpreciodocumento_produccionesds_4_tfpedidocliente_sel) == 0 ) ) )
            {
               A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
               if ( ! (GXutil.strcmp("", A13878PedidoClie)==0) )
               {
                  AV29Option = A13878PedidoClie ;
                  AV28InsertIndex = 1 ;
                  while ( ( AV28InsertIndex <= AV30Options.size() ) && ( GXutil.strcmp((String)AV30Options.elementAt(-1+AV28InsertIndex), AV29Option) < 0 ) )
                  {
                     AV28InsertIndex = (int)(AV28InsertIndex+1) ;
                  }
                  if ( ( AV28InsertIndex <= AV30Options.size() ) && ( GXutil.strcmp((String)AV30Options.elementAt(-1+AV28InsertIndex), AV29Option) == 0 ) )
                  {
                     AV34count = GXutil.lval( (String)AV33OptionIndexes.elementAt(-1+AV28InsertIndex)) ;
                     AV34count = (long)(AV34count+1) ;
                     AV33OptionIndexes.removeItem(AV28InsertIndex);
                     AV33OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV34count), "Z,ZZZ,ZZZ,ZZ9")), AV28InsertIndex);
                  }
                  else
                  {
                     AV30Options.add(AV29Option, AV28InsertIndex);
                     AV33OptionIndexes.add("1", AV28InsertIndex);
                  }
               }
               if ( AV30Options.size() == 50 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
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
      AV14TFBarSer = AV41SearchTxt ;
      AV15TFBarSer_Sel = "" ;
      AV57Facturacion_confirmacionpreciodocumento_produccionesds_1_tfbarnhdr = AV10TFBarNHdr ;
      AV58Facturacion_confirmacionpreciodocumento_produccionesds_2_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV59Facturacion_confirmacionpreciodocumento_produccionesds_3_tfpedidocliente = AV12TFPedidoCliente ;
      AV60Facturacion_confirmacionpreciodocumento_produccionesds_4_tfpedidocliente_sel = AV13TFPedidoCliente_Sel ;
      AV61Facturacion_confirmacionpreciodocumento_produccionesds_5_tfbarser = AV14TFBarSer ;
      AV62Facturacion_confirmacionpreciodocumento_produccionesds_6_tfbarser_sel = AV15TFBarSer_Sel ;
      AV63Facturacion_confirmacionpreciodocumento_produccionesds_7_tfbarserdsc = AV16TFBarSerDsc ;
      AV64Facturacion_confirmacionpreciodocumento_produccionesds_8_tfbarserdsc_sel = AV17TFBarSerDsc_Sel ;
      AV65Facturacion_confirmacionpreciodocumento_produccionesds_9_tfbarcolnom = AV18TFBarColNom ;
      AV66Facturacion_confirmacionpreciodocumento_produccionesds_10_tfbarcolnom_sel = AV19TFBarColNom_Sel ;
      AV67Facturacion_confirmacionpreciodocumento_produccionesds_11_tfbarcolnum = AV20TFBarColNum ;
      AV68Facturacion_confirmacionpreciodocumento_produccionesds_12_tfbarcolnum_to = AV21TFBarColNum_To ;
      AV69Facturacion_confirmacionpreciodocumento_produccionesds_13_tfbartipcol = AV22TFBarTipCol ;
      AV70Facturacion_confirmacionpreciodocumento_produccionesds_14_tfbartipcol_to = AV23TFBarTipCol_To ;
      AV71Facturacion_confirmacionpreciodocumento_produccionesds_15_tfbaralbkgme = AV24TFBarAlbKgmE ;
      AV72Facturacion_confirmacionpreciodocumento_produccionesds_16_tfbaralbkgme_to = AV25TFBarAlbKgmE_To ;
      AV73Facturacion_confirmacionpreciodocumento_produccionesds_17_tfbaralbmtre = AV26TFBarAlbMtrE ;
      AV74Facturacion_confirmacionpreciodocumento_produccionesds_18_tfbaralbmtre_to = AV27TFBarAlbMtrE_To ;
      AV75Facturacion_confirmacionpreciodocumento_produccionesds_19_tfalbproesp = AV51TFAlbProEsp ;
      AV76Facturacion_confirmacionpreciodocumento_produccionesds_20_tfalbproesp_to = AV52TFAlbProEsp_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV58Facturacion_confirmacionpreciodocumento_produccionesds_2_tfbarnhdr_sel ,
                                           AV57Facturacion_confirmacionpreciodocumento_produccionesds_1_tfbarnhdr ,
                                           AV62Facturacion_confirmacionpreciodocumento_produccionesds_6_tfbarser_sel ,
                                           AV61Facturacion_confirmacionpreciodocumento_produccionesds_5_tfbarser ,
                                           AV64Facturacion_confirmacionpreciodocumento_produccionesds_8_tfbarserdsc_sel ,
                                           AV63Facturacion_confirmacionpreciodocumento_produccionesds_7_tfbarserdsc ,
                                           AV66Facturacion_confirmacionpreciodocumento_produccionesds_10_tfbarcolnom_sel ,
                                           AV65Facturacion_confirmacionpreciodocumento_produccionesds_9_tfbarcolnom ,
                                           Integer.valueOf(AV67Facturacion_confirmacionpreciodocumento_produccionesds_11_tfbarcolnum) ,
                                           Integer.valueOf(AV68Facturacion_confirmacionpreciodocumento_produccionesds_12_tfbarcolnum_to) ,
                                           Byte.valueOf(AV69Facturacion_confirmacionpreciodocumento_produccionesds_13_tfbartipcol) ,
                                           Byte.valueOf(AV70Facturacion_confirmacionpreciodocumento_produccionesds_14_tfbartipcol_to) ,
                                           AV71Facturacion_confirmacionpreciodocumento_produccionesds_15_tfbaralbkgme ,
                                           AV72Facturacion_confirmacionpreciodocumento_produccionesds_16_tfbaralbkgme_to ,
                                           AV73Facturacion_confirmacionpreciodocumento_produccionesds_17_tfbaralbmtre ,
                                           AV74Facturacion_confirmacionpreciodocumento_produccionesds_18_tfbaralbmtre_to ,
                                           Byte.valueOf(AV75Facturacion_confirmacionpreciodocumento_produccionesds_19_tfalbproesp) ,
                                           Byte.valueOf(AV76Facturacion_confirmacionpreciodocumento_produccionesds_20_tfalbproesp_to) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           Byte.valueOf(A218BarTipCol) ,
                                           A1261BarAlbKgmE ,
                                           A1263BarAlbMtrE ,
                                           Byte.valueOf(A32AlbProEsp) ,
                                           AV60Facturacion_confirmacionpreciodocumento_produccionesds_4_tfpedidocliente_sel ,
                                           AV59Facturacion_confirmacionpreciodocumento_produccionesds_3_tfpedidocliente ,
                                           A13878PedidoClie ,
                                           A396EmprCod ,
                                           AV47Emprcod ,
                                           Long.valueOf(A30AlbProCod) ,
                                           Long.valueOf(AV48AlbProcod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG
                                           }
      });
      lV57Facturacion_confirmacionpreciodocumento_produccionesds_1_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV57Facturacion_confirmacionpreciodocumento_produccionesds_1_tfbarnhdr), 11, "%") ;
      lV61Facturacion_confirmacionpreciodocumento_produccionesds_5_tfbarser = GXutil.padr( GXutil.rtrim( AV61Facturacion_confirmacionpreciodocumento_produccionesds_5_tfbarser), 16, "%") ;
      lV63Facturacion_confirmacionpreciodocumento_produccionesds_7_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV63Facturacion_confirmacionpreciodocumento_produccionesds_7_tfbarserdsc), 26, "%") ;
      lV65Facturacion_confirmacionpreciodocumento_produccionesds_9_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV65Facturacion_confirmacionpreciodocumento_produccionesds_9_tfbarcolnom), 13, "%") ;
      /* Using cursor P09ZT4 */
      pr_default.execute(2, new Object[] {AV47Emprcod, Long.valueOf(AV48AlbProcod), lV57Facturacion_confirmacionpreciodocumento_produccionesds_1_tfbarnhdr, AV58Facturacion_confirmacionpreciodocumento_produccionesds_2_tfbarnhdr_sel, lV61Facturacion_confirmacionpreciodocumento_produccionesds_5_tfbarser, AV62Facturacion_confirmacionpreciodocumento_produccionesds_6_tfbarser_sel, lV63Facturacion_confirmacionpreciodocumento_produccionesds_7_tfbarserdsc, AV64Facturacion_confirmacionpreciodocumento_produccionesds_8_tfbarserdsc_sel, lV65Facturacion_confirmacionpreciodocumento_produccionesds_9_tfbarcolnom, AV66Facturacion_confirmacionpreciodocumento_produccionesds_10_tfbarcolnom_sel, Integer.valueOf(AV67Facturacion_confirmacionpreciodocumento_produccionesds_11_tfbarcolnum), Integer.valueOf(AV68Facturacion_confirmacionpreciodocumento_produccionesds_12_tfbarcolnum_to), Byte.valueOf(AV69Facturacion_confirmacionpreciodocumento_produccionesds_13_tfbartipcol), Byte.valueOf(AV70Facturacion_confirmacionpreciodocumento_produccionesds_14_tfbartipcol_to), AV71Facturacion_confirmacionpreciodocumento_produccionesds_15_tfbaralbkgme, AV72Facturacion_confirmacionpreciodocumento_produccionesds_16_tfbaralbkgme_to, AV73Facturacion_confirmacionpreciodocumento_produccionesds_17_tfbaralbmtre, AV74Facturacion_confirmacionpreciodocumento_produccionesds_18_tfbaralbmtre_to, Byte.valueOf(AV75Facturacion_confirmacionpreciodocumento_produccionesds_19_tfalbproesp), Byte.valueOf(AV76Facturacion_confirmacionpreciodocumento_produccionesds_20_tfalbproesp_to)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9ZT4 = false ;
         A30AlbProCod = P09ZT4_A30AlbProCod[0] ;
         A212BarSer = P09ZT4_A212BarSer[0] ;
         A32AlbProEsp = P09ZT4_A32AlbProEsp[0] ;
         A1263BarAlbMtrE = P09ZT4_A1263BarAlbMtrE[0] ;
         A1261BarAlbKgmE = P09ZT4_A1261BarAlbKgmE[0] ;
         A218BarTipCol = P09ZT4_A218BarTipCol[0] ;
         A136BarColNum = P09ZT4_A136BarColNum[0] ;
         A135BarColNom = P09ZT4_A135BarColNom[0] ;
         A1652BarSerDsc = P09ZT4_A1652BarSerDsc[0] ;
         A130BarCodPar = P09ZT4_A130BarCodPar[0] ;
         A132BarCodReo = P09ZT4_A132BarCodReo[0] ;
         A129BarCod = P09ZT4_A129BarCod[0] ;
         A143BarDisNum = P09ZT4_A143BarDisNum[0] ;
         A4812BarEncCli = P09ZT4_A4812BarEncCli[0] ;
         A396EmprCod = P09ZT4_A396EmprCod[0] ;
         A212BarSer = P09ZT4_A212BarSer[0] ;
         A218BarTipCol = P09ZT4_A218BarTipCol[0] ;
         A136BarColNum = P09ZT4_A136BarColNum[0] ;
         A135BarColNom = P09ZT4_A135BarColNom[0] ;
         A1652BarSerDsc = P09ZT4_A1652BarSerDsc[0] ;
         A143BarDisNum = P09ZT4_A143BarDisNum[0] ;
         A4812BarEncCli = P09ZT4_A4812BarEncCli[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_char3) ;
         confirmacionpreciodocumento_produccionesgetfilterdata.this.A396EmprCod = GXv_char6[0] ;
         confirmacionpreciodocumento_produccionesgetfilterdata.this.A4812BarEncCli = GXv_char5[0] ;
         confirmacionpreciodocumento_produccionesgetfilterdata.this.A143BarDisNum = GXv_char4[0] ;
         confirmacionpreciodocumento_produccionesgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV60Facturacion_confirmacionpreciodocumento_produccionesds_4_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV59Facturacion_confirmacionpreciodocumento_produccionesds_3_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV59Facturacion_confirmacionpreciodocumento_produccionesds_3_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV60Facturacion_confirmacionpreciodocumento_produccionesds_4_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV60Facturacion_confirmacionpreciodocumento_produccionesds_4_tfpedidocliente_sel) == 0 ) ) )
            {
               A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
               AV34count = 0 ;
               while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09ZT4_A212BarSer[0], A212BarSer) == 0 ) )
               {
                  brk9ZT4 = false ;
                  A30AlbProCod = P09ZT4_A30AlbProCod[0] ;
                  A130BarCodPar = P09ZT4_A130BarCodPar[0] ;
                  A132BarCodReo = P09ZT4_A132BarCodReo[0] ;
                  A129BarCod = P09ZT4_A129BarCod[0] ;
                  A396EmprCod = P09ZT4_A396EmprCod[0] ;
                  AV34count = (long)(AV34count+1) ;
                  brk9ZT4 = true ;
                  pr_default.readNext(2);
               }
               if ( ! (GXutil.strcmp("", A212BarSer)==0) )
               {
                  AV29Option = A212BarSer ;
                  AV30Options.add(AV29Option, 0);
                  AV33OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV34count), "Z,ZZZ,ZZZ,ZZ9")), 0);
               }
               if ( AV30Options.size() == 50 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
            }
         }
         if ( ! brk9ZT4 )
         {
            brk9ZT4 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADBARSERDSCOPTIONS' Routine */
      returnInSub = false ;
      AV16TFBarSerDsc = AV41SearchTxt ;
      AV17TFBarSerDsc_Sel = "" ;
      AV57Facturacion_confirmacionpreciodocumento_produccionesds_1_tfbarnhdr = AV10TFBarNHdr ;
      AV58Facturacion_confirmacionpreciodocumento_produccionesds_2_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV59Facturacion_confirmacionpreciodocumento_produccionesds_3_tfpedidocliente = AV12TFPedidoCliente ;
      AV60Facturacion_confirmacionpreciodocumento_produccionesds_4_tfpedidocliente_sel = AV13TFPedidoCliente_Sel ;
      AV61Facturacion_confirmacionpreciodocumento_produccionesds_5_tfbarser = AV14TFBarSer ;
      AV62Facturacion_confirmacionpreciodocumento_produccionesds_6_tfbarser_sel = AV15TFBarSer_Sel ;
      AV63Facturacion_confirmacionpreciodocumento_produccionesds_7_tfbarserdsc = AV16TFBarSerDsc ;
      AV64Facturacion_confirmacionpreciodocumento_produccionesds_8_tfbarserdsc_sel = AV17TFBarSerDsc_Sel ;
      AV65Facturacion_confirmacionpreciodocumento_produccionesds_9_tfbarcolnom = AV18TFBarColNom ;
      AV66Facturacion_confirmacionpreciodocumento_produccionesds_10_tfbarcolnom_sel = AV19TFBarColNom_Sel ;
      AV67Facturacion_confirmacionpreciodocumento_produccionesds_11_tfbarcolnum = AV20TFBarColNum ;
      AV68Facturacion_confirmacionpreciodocumento_produccionesds_12_tfbarcolnum_to = AV21TFBarColNum_To ;
      AV69Facturacion_confirmacionpreciodocumento_produccionesds_13_tfbartipcol = AV22TFBarTipCol ;
      AV70Facturacion_confirmacionpreciodocumento_produccionesds_14_tfbartipcol_to = AV23TFBarTipCol_To ;
      AV71Facturacion_confirmacionpreciodocumento_produccionesds_15_tfbaralbkgme = AV24TFBarAlbKgmE ;
      AV72Facturacion_confirmacionpreciodocumento_produccionesds_16_tfbaralbkgme_to = AV25TFBarAlbKgmE_To ;
      AV73Facturacion_confirmacionpreciodocumento_produccionesds_17_tfbaralbmtre = AV26TFBarAlbMtrE ;
      AV74Facturacion_confirmacionpreciodocumento_produccionesds_18_tfbaralbmtre_to = AV27TFBarAlbMtrE_To ;
      AV75Facturacion_confirmacionpreciodocumento_produccionesds_19_tfalbproesp = AV51TFAlbProEsp ;
      AV76Facturacion_confirmacionpreciodocumento_produccionesds_20_tfalbproesp_to = AV52TFAlbProEsp_To ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV58Facturacion_confirmacionpreciodocumento_produccionesds_2_tfbarnhdr_sel ,
                                           AV57Facturacion_confirmacionpreciodocumento_produccionesds_1_tfbarnhdr ,
                                           AV62Facturacion_confirmacionpreciodocumento_produccionesds_6_tfbarser_sel ,
                                           AV61Facturacion_confirmacionpreciodocumento_produccionesds_5_tfbarser ,
                                           AV64Facturacion_confirmacionpreciodocumento_produccionesds_8_tfbarserdsc_sel ,
                                           AV63Facturacion_confirmacionpreciodocumento_produccionesds_7_tfbarserdsc ,
                                           AV66Facturacion_confirmacionpreciodocumento_produccionesds_10_tfbarcolnom_sel ,
                                           AV65Facturacion_confirmacionpreciodocumento_produccionesds_9_tfbarcolnom ,
                                           Integer.valueOf(AV67Facturacion_confirmacionpreciodocumento_produccionesds_11_tfbarcolnum) ,
                                           Integer.valueOf(AV68Facturacion_confirmacionpreciodocumento_produccionesds_12_tfbarcolnum_to) ,
                                           Byte.valueOf(AV69Facturacion_confirmacionpreciodocumento_produccionesds_13_tfbartipcol) ,
                                           Byte.valueOf(AV70Facturacion_confirmacionpreciodocumento_produccionesds_14_tfbartipcol_to) ,
                                           AV71Facturacion_confirmacionpreciodocumento_produccionesds_15_tfbaralbkgme ,
                                           AV72Facturacion_confirmacionpreciodocumento_produccionesds_16_tfbaralbkgme_to ,
                                           AV73Facturacion_confirmacionpreciodocumento_produccionesds_17_tfbaralbmtre ,
                                           AV74Facturacion_confirmacionpreciodocumento_produccionesds_18_tfbaralbmtre_to ,
                                           Byte.valueOf(AV75Facturacion_confirmacionpreciodocumento_produccionesds_19_tfalbproesp) ,
                                           Byte.valueOf(AV76Facturacion_confirmacionpreciodocumento_produccionesds_20_tfalbproesp_to) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           Byte.valueOf(A218BarTipCol) ,
                                           A1261BarAlbKgmE ,
                                           A1263BarAlbMtrE ,
                                           Byte.valueOf(A32AlbProEsp) ,
                                           AV60Facturacion_confirmacionpreciodocumento_produccionesds_4_tfpedidocliente_sel ,
                                           AV59Facturacion_confirmacionpreciodocumento_produccionesds_3_tfpedidocliente ,
                                           A13878PedidoClie ,
                                           A396EmprCod ,
                                           AV47Emprcod ,
                                           Long.valueOf(A30AlbProCod) ,
                                           Long.valueOf(AV48AlbProcod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG
                                           }
      });
      lV57Facturacion_confirmacionpreciodocumento_produccionesds_1_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV57Facturacion_confirmacionpreciodocumento_produccionesds_1_tfbarnhdr), 11, "%") ;
      lV61Facturacion_confirmacionpreciodocumento_produccionesds_5_tfbarser = GXutil.padr( GXutil.rtrim( AV61Facturacion_confirmacionpreciodocumento_produccionesds_5_tfbarser), 16, "%") ;
      lV63Facturacion_confirmacionpreciodocumento_produccionesds_7_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV63Facturacion_confirmacionpreciodocumento_produccionesds_7_tfbarserdsc), 26, "%") ;
      lV65Facturacion_confirmacionpreciodocumento_produccionesds_9_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV65Facturacion_confirmacionpreciodocumento_produccionesds_9_tfbarcolnom), 13, "%") ;
      /* Using cursor P09ZT5 */
      pr_default.execute(3, new Object[] {AV47Emprcod, Long.valueOf(AV48AlbProcod), lV57Facturacion_confirmacionpreciodocumento_produccionesds_1_tfbarnhdr, AV58Facturacion_confirmacionpreciodocumento_produccionesds_2_tfbarnhdr_sel, lV61Facturacion_confirmacionpreciodocumento_produccionesds_5_tfbarser, AV62Facturacion_confirmacionpreciodocumento_produccionesds_6_tfbarser_sel, lV63Facturacion_confirmacionpreciodocumento_produccionesds_7_tfbarserdsc, AV64Facturacion_confirmacionpreciodocumento_produccionesds_8_tfbarserdsc_sel, lV65Facturacion_confirmacionpreciodocumento_produccionesds_9_tfbarcolnom, AV66Facturacion_confirmacionpreciodocumento_produccionesds_10_tfbarcolnom_sel, Integer.valueOf(AV67Facturacion_confirmacionpreciodocumento_produccionesds_11_tfbarcolnum), Integer.valueOf(AV68Facturacion_confirmacionpreciodocumento_produccionesds_12_tfbarcolnum_to), Byte.valueOf(AV69Facturacion_confirmacionpreciodocumento_produccionesds_13_tfbartipcol), Byte.valueOf(AV70Facturacion_confirmacionpreciodocumento_produccionesds_14_tfbartipcol_to), AV71Facturacion_confirmacionpreciodocumento_produccionesds_15_tfbaralbkgme, AV72Facturacion_confirmacionpreciodocumento_produccionesds_16_tfbaralbkgme_to, AV73Facturacion_confirmacionpreciodocumento_produccionesds_17_tfbaralbmtre, AV74Facturacion_confirmacionpreciodocumento_produccionesds_18_tfbaralbmtre_to, Byte.valueOf(AV75Facturacion_confirmacionpreciodocumento_produccionesds_19_tfalbproesp), Byte.valueOf(AV76Facturacion_confirmacionpreciodocumento_produccionesds_20_tfalbproesp_to)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk9ZT6 = false ;
         A30AlbProCod = P09ZT5_A30AlbProCod[0] ;
         A1652BarSerDsc = P09ZT5_A1652BarSerDsc[0] ;
         A32AlbProEsp = P09ZT5_A32AlbProEsp[0] ;
         A1263BarAlbMtrE = P09ZT5_A1263BarAlbMtrE[0] ;
         A1261BarAlbKgmE = P09ZT5_A1261BarAlbKgmE[0] ;
         A218BarTipCol = P09ZT5_A218BarTipCol[0] ;
         A136BarColNum = P09ZT5_A136BarColNum[0] ;
         A135BarColNom = P09ZT5_A135BarColNom[0] ;
         A212BarSer = P09ZT5_A212BarSer[0] ;
         A130BarCodPar = P09ZT5_A130BarCodPar[0] ;
         A132BarCodReo = P09ZT5_A132BarCodReo[0] ;
         A129BarCod = P09ZT5_A129BarCod[0] ;
         A143BarDisNum = P09ZT5_A143BarDisNum[0] ;
         A4812BarEncCli = P09ZT5_A4812BarEncCli[0] ;
         A396EmprCod = P09ZT5_A396EmprCod[0] ;
         A1652BarSerDsc = P09ZT5_A1652BarSerDsc[0] ;
         A218BarTipCol = P09ZT5_A218BarTipCol[0] ;
         A136BarColNum = P09ZT5_A136BarColNum[0] ;
         A135BarColNom = P09ZT5_A135BarColNom[0] ;
         A212BarSer = P09ZT5_A212BarSer[0] ;
         A143BarDisNum = P09ZT5_A143BarDisNum[0] ;
         A4812BarEncCli = P09ZT5_A4812BarEncCli[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_char3) ;
         confirmacionpreciodocumento_produccionesgetfilterdata.this.A396EmprCod = GXv_char6[0] ;
         confirmacionpreciodocumento_produccionesgetfilterdata.this.A4812BarEncCli = GXv_char5[0] ;
         confirmacionpreciodocumento_produccionesgetfilterdata.this.A143BarDisNum = GXv_char4[0] ;
         confirmacionpreciodocumento_produccionesgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV60Facturacion_confirmacionpreciodocumento_produccionesds_4_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV59Facturacion_confirmacionpreciodocumento_produccionesds_3_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV59Facturacion_confirmacionpreciodocumento_produccionesds_3_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV60Facturacion_confirmacionpreciodocumento_produccionesds_4_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV60Facturacion_confirmacionpreciodocumento_produccionesds_4_tfpedidocliente_sel) == 0 ) ) )
            {
               A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
               AV34count = 0 ;
               while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P09ZT5_A1652BarSerDsc[0], A1652BarSerDsc) == 0 ) )
               {
                  brk9ZT6 = false ;
                  A30AlbProCod = P09ZT5_A30AlbProCod[0] ;
                  A130BarCodPar = P09ZT5_A130BarCodPar[0] ;
                  A132BarCodReo = P09ZT5_A132BarCodReo[0] ;
                  A129BarCod = P09ZT5_A129BarCod[0] ;
                  A396EmprCod = P09ZT5_A396EmprCod[0] ;
                  AV34count = (long)(AV34count+1) ;
                  brk9ZT6 = true ;
                  pr_default.readNext(3);
               }
               if ( ! (GXutil.strcmp("", A1652BarSerDsc)==0) )
               {
                  AV29Option = A1652BarSerDsc ;
                  AV30Options.add(AV29Option, 0);
                  AV33OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV34count), "Z,ZZZ,ZZZ,ZZ9")), 0);
               }
               if ( AV30Options.size() == 50 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
            }
         }
         if ( ! brk9ZT6 )
         {
            brk9ZT6 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADBARCOLNOMOPTIONS' Routine */
      returnInSub = false ;
      AV18TFBarColNom = AV41SearchTxt ;
      AV19TFBarColNom_Sel = "" ;
      AV57Facturacion_confirmacionpreciodocumento_produccionesds_1_tfbarnhdr = AV10TFBarNHdr ;
      AV58Facturacion_confirmacionpreciodocumento_produccionesds_2_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV59Facturacion_confirmacionpreciodocumento_produccionesds_3_tfpedidocliente = AV12TFPedidoCliente ;
      AV60Facturacion_confirmacionpreciodocumento_produccionesds_4_tfpedidocliente_sel = AV13TFPedidoCliente_Sel ;
      AV61Facturacion_confirmacionpreciodocumento_produccionesds_5_tfbarser = AV14TFBarSer ;
      AV62Facturacion_confirmacionpreciodocumento_produccionesds_6_tfbarser_sel = AV15TFBarSer_Sel ;
      AV63Facturacion_confirmacionpreciodocumento_produccionesds_7_tfbarserdsc = AV16TFBarSerDsc ;
      AV64Facturacion_confirmacionpreciodocumento_produccionesds_8_tfbarserdsc_sel = AV17TFBarSerDsc_Sel ;
      AV65Facturacion_confirmacionpreciodocumento_produccionesds_9_tfbarcolnom = AV18TFBarColNom ;
      AV66Facturacion_confirmacionpreciodocumento_produccionesds_10_tfbarcolnom_sel = AV19TFBarColNom_Sel ;
      AV67Facturacion_confirmacionpreciodocumento_produccionesds_11_tfbarcolnum = AV20TFBarColNum ;
      AV68Facturacion_confirmacionpreciodocumento_produccionesds_12_tfbarcolnum_to = AV21TFBarColNum_To ;
      AV69Facturacion_confirmacionpreciodocumento_produccionesds_13_tfbartipcol = AV22TFBarTipCol ;
      AV70Facturacion_confirmacionpreciodocumento_produccionesds_14_tfbartipcol_to = AV23TFBarTipCol_To ;
      AV71Facturacion_confirmacionpreciodocumento_produccionesds_15_tfbaralbkgme = AV24TFBarAlbKgmE ;
      AV72Facturacion_confirmacionpreciodocumento_produccionesds_16_tfbaralbkgme_to = AV25TFBarAlbKgmE_To ;
      AV73Facturacion_confirmacionpreciodocumento_produccionesds_17_tfbaralbmtre = AV26TFBarAlbMtrE ;
      AV74Facturacion_confirmacionpreciodocumento_produccionesds_18_tfbaralbmtre_to = AV27TFBarAlbMtrE_To ;
      AV75Facturacion_confirmacionpreciodocumento_produccionesds_19_tfalbproesp = AV51TFAlbProEsp ;
      AV76Facturacion_confirmacionpreciodocumento_produccionesds_20_tfalbproesp_to = AV52TFAlbProEsp_To ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV58Facturacion_confirmacionpreciodocumento_produccionesds_2_tfbarnhdr_sel ,
                                           AV57Facturacion_confirmacionpreciodocumento_produccionesds_1_tfbarnhdr ,
                                           AV62Facturacion_confirmacionpreciodocumento_produccionesds_6_tfbarser_sel ,
                                           AV61Facturacion_confirmacionpreciodocumento_produccionesds_5_tfbarser ,
                                           AV64Facturacion_confirmacionpreciodocumento_produccionesds_8_tfbarserdsc_sel ,
                                           AV63Facturacion_confirmacionpreciodocumento_produccionesds_7_tfbarserdsc ,
                                           AV66Facturacion_confirmacionpreciodocumento_produccionesds_10_tfbarcolnom_sel ,
                                           AV65Facturacion_confirmacionpreciodocumento_produccionesds_9_tfbarcolnom ,
                                           Integer.valueOf(AV67Facturacion_confirmacionpreciodocumento_produccionesds_11_tfbarcolnum) ,
                                           Integer.valueOf(AV68Facturacion_confirmacionpreciodocumento_produccionesds_12_tfbarcolnum_to) ,
                                           Byte.valueOf(AV69Facturacion_confirmacionpreciodocumento_produccionesds_13_tfbartipcol) ,
                                           Byte.valueOf(AV70Facturacion_confirmacionpreciodocumento_produccionesds_14_tfbartipcol_to) ,
                                           AV71Facturacion_confirmacionpreciodocumento_produccionesds_15_tfbaralbkgme ,
                                           AV72Facturacion_confirmacionpreciodocumento_produccionesds_16_tfbaralbkgme_to ,
                                           AV73Facturacion_confirmacionpreciodocumento_produccionesds_17_tfbaralbmtre ,
                                           AV74Facturacion_confirmacionpreciodocumento_produccionesds_18_tfbaralbmtre_to ,
                                           Byte.valueOf(AV75Facturacion_confirmacionpreciodocumento_produccionesds_19_tfalbproesp) ,
                                           Byte.valueOf(AV76Facturacion_confirmacionpreciodocumento_produccionesds_20_tfalbproesp_to) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           Byte.valueOf(A218BarTipCol) ,
                                           A1261BarAlbKgmE ,
                                           A1263BarAlbMtrE ,
                                           Byte.valueOf(A32AlbProEsp) ,
                                           AV60Facturacion_confirmacionpreciodocumento_produccionesds_4_tfpedidocliente_sel ,
                                           AV59Facturacion_confirmacionpreciodocumento_produccionesds_3_tfpedidocliente ,
                                           A13878PedidoClie ,
                                           A396EmprCod ,
                                           AV47Emprcod ,
                                           Long.valueOf(A30AlbProCod) ,
                                           Long.valueOf(AV48AlbProcod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG
                                           }
      });
      lV57Facturacion_confirmacionpreciodocumento_produccionesds_1_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV57Facturacion_confirmacionpreciodocumento_produccionesds_1_tfbarnhdr), 11, "%") ;
      lV61Facturacion_confirmacionpreciodocumento_produccionesds_5_tfbarser = GXutil.padr( GXutil.rtrim( AV61Facturacion_confirmacionpreciodocumento_produccionesds_5_tfbarser), 16, "%") ;
      lV63Facturacion_confirmacionpreciodocumento_produccionesds_7_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV63Facturacion_confirmacionpreciodocumento_produccionesds_7_tfbarserdsc), 26, "%") ;
      lV65Facturacion_confirmacionpreciodocumento_produccionesds_9_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV65Facturacion_confirmacionpreciodocumento_produccionesds_9_tfbarcolnom), 13, "%") ;
      /* Using cursor P09ZT6 */
      pr_default.execute(4, new Object[] {AV47Emprcod, Long.valueOf(AV48AlbProcod), lV57Facturacion_confirmacionpreciodocumento_produccionesds_1_tfbarnhdr, AV58Facturacion_confirmacionpreciodocumento_produccionesds_2_tfbarnhdr_sel, lV61Facturacion_confirmacionpreciodocumento_produccionesds_5_tfbarser, AV62Facturacion_confirmacionpreciodocumento_produccionesds_6_tfbarser_sel, lV63Facturacion_confirmacionpreciodocumento_produccionesds_7_tfbarserdsc, AV64Facturacion_confirmacionpreciodocumento_produccionesds_8_tfbarserdsc_sel, lV65Facturacion_confirmacionpreciodocumento_produccionesds_9_tfbarcolnom, AV66Facturacion_confirmacionpreciodocumento_produccionesds_10_tfbarcolnom_sel, Integer.valueOf(AV67Facturacion_confirmacionpreciodocumento_produccionesds_11_tfbarcolnum), Integer.valueOf(AV68Facturacion_confirmacionpreciodocumento_produccionesds_12_tfbarcolnum_to), Byte.valueOf(AV69Facturacion_confirmacionpreciodocumento_produccionesds_13_tfbartipcol), Byte.valueOf(AV70Facturacion_confirmacionpreciodocumento_produccionesds_14_tfbartipcol_to), AV71Facturacion_confirmacionpreciodocumento_produccionesds_15_tfbaralbkgme, AV72Facturacion_confirmacionpreciodocumento_produccionesds_16_tfbaralbkgme_to, AV73Facturacion_confirmacionpreciodocumento_produccionesds_17_tfbaralbmtre, AV74Facturacion_confirmacionpreciodocumento_produccionesds_18_tfbaralbmtre_to, Byte.valueOf(AV75Facturacion_confirmacionpreciodocumento_produccionesds_19_tfalbproesp), Byte.valueOf(AV76Facturacion_confirmacionpreciodocumento_produccionesds_20_tfalbproesp_to)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk9ZT8 = false ;
         A30AlbProCod = P09ZT6_A30AlbProCod[0] ;
         A135BarColNom = P09ZT6_A135BarColNom[0] ;
         A32AlbProEsp = P09ZT6_A32AlbProEsp[0] ;
         A1263BarAlbMtrE = P09ZT6_A1263BarAlbMtrE[0] ;
         A1261BarAlbKgmE = P09ZT6_A1261BarAlbKgmE[0] ;
         A218BarTipCol = P09ZT6_A218BarTipCol[0] ;
         A136BarColNum = P09ZT6_A136BarColNum[0] ;
         A1652BarSerDsc = P09ZT6_A1652BarSerDsc[0] ;
         A212BarSer = P09ZT6_A212BarSer[0] ;
         A130BarCodPar = P09ZT6_A130BarCodPar[0] ;
         A132BarCodReo = P09ZT6_A132BarCodReo[0] ;
         A129BarCod = P09ZT6_A129BarCod[0] ;
         A143BarDisNum = P09ZT6_A143BarDisNum[0] ;
         A4812BarEncCli = P09ZT6_A4812BarEncCli[0] ;
         A396EmprCod = P09ZT6_A396EmprCod[0] ;
         A135BarColNom = P09ZT6_A135BarColNom[0] ;
         A218BarTipCol = P09ZT6_A218BarTipCol[0] ;
         A136BarColNum = P09ZT6_A136BarColNum[0] ;
         A1652BarSerDsc = P09ZT6_A1652BarSerDsc[0] ;
         A212BarSer = P09ZT6_A212BarSer[0] ;
         A143BarDisNum = P09ZT6_A143BarDisNum[0] ;
         A4812BarEncCli = P09ZT6_A4812BarEncCli[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_char3) ;
         confirmacionpreciodocumento_produccionesgetfilterdata.this.A396EmprCod = GXv_char6[0] ;
         confirmacionpreciodocumento_produccionesgetfilterdata.this.A4812BarEncCli = GXv_char5[0] ;
         confirmacionpreciodocumento_produccionesgetfilterdata.this.A143BarDisNum = GXv_char4[0] ;
         confirmacionpreciodocumento_produccionesgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV60Facturacion_confirmacionpreciodocumento_produccionesds_4_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV59Facturacion_confirmacionpreciodocumento_produccionesds_3_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV59Facturacion_confirmacionpreciodocumento_produccionesds_3_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV60Facturacion_confirmacionpreciodocumento_produccionesds_4_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV60Facturacion_confirmacionpreciodocumento_produccionesds_4_tfpedidocliente_sel) == 0 ) ) )
            {
               A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
               AV34count = 0 ;
               while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P09ZT6_A135BarColNom[0], A135BarColNom) == 0 ) )
               {
                  brk9ZT8 = false ;
                  A30AlbProCod = P09ZT6_A30AlbProCod[0] ;
                  A130BarCodPar = P09ZT6_A130BarCodPar[0] ;
                  A132BarCodReo = P09ZT6_A132BarCodReo[0] ;
                  A129BarCod = P09ZT6_A129BarCod[0] ;
                  A396EmprCod = P09ZT6_A396EmprCod[0] ;
                  AV34count = (long)(AV34count+1) ;
                  brk9ZT8 = true ;
                  pr_default.readNext(4);
               }
               if ( ! (GXutil.strcmp("", A135BarColNom)==0) )
               {
                  AV29Option = A135BarColNom ;
                  AV30Options.add(AV29Option, 0);
                  AV33OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV34count), "Z,ZZZ,ZZZ,ZZ9")), 0);
               }
               if ( AV30Options.size() == 50 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
            }
         }
         if ( ! brk9ZT8 )
         {
            brk9ZT8 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   protected void cleanup( )
   {
      this.aP3[0] = confirmacionpreciodocumento_produccionesgetfilterdata.this.AV43OptionsJson;
      this.aP4[0] = confirmacionpreciodocumento_produccionesgetfilterdata.this.AV44OptionsDescJson;
      this.aP5[0] = confirmacionpreciodocumento_produccionesgetfilterdata.this.AV45OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV43OptionsJson = "" ;
      AV44OptionsDescJson = "" ;
      AV45OptionIndexesJson = "" ;
      AV30Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV32OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV33OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV35Session = httpContext.getWebSession();
      AV37GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV38GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV10TFBarNHdr = "" ;
      AV11TFBarNHdr_Sel = "" ;
      AV12TFPedidoCliente = "" ;
      AV13TFPedidoCliente_Sel = "" ;
      AV14TFBarSer = "" ;
      AV15TFBarSer_Sel = "" ;
      AV16TFBarSerDsc = "" ;
      AV17TFBarSerDsc_Sel = "" ;
      AV18TFBarColNom = "" ;
      AV19TFBarColNom_Sel = "" ;
      AV24TFBarAlbKgmE = DecimalUtil.ZERO ;
      AV25TFBarAlbKgmE_To = DecimalUtil.ZERO ;
      AV26TFBarAlbMtrE = DecimalUtil.ZERO ;
      AV27TFBarAlbMtrE_To = DecimalUtil.ZERO ;
      AV47Emprcod = "" ;
      AV50GuiremCln = "" ;
      A13696BarNHdr = "" ;
      AV57Facturacion_confirmacionpreciodocumento_produccionesds_1_tfbarnhdr = "" ;
      AV58Facturacion_confirmacionpreciodocumento_produccionesds_2_tfbarnhdr_sel = "" ;
      AV59Facturacion_confirmacionpreciodocumento_produccionesds_3_tfpedidocliente = "" ;
      AV60Facturacion_confirmacionpreciodocumento_produccionesds_4_tfpedidocliente_sel = "" ;
      AV61Facturacion_confirmacionpreciodocumento_produccionesds_5_tfbarser = "" ;
      AV62Facturacion_confirmacionpreciodocumento_produccionesds_6_tfbarser_sel = "" ;
      AV63Facturacion_confirmacionpreciodocumento_produccionesds_7_tfbarserdsc = "" ;
      AV64Facturacion_confirmacionpreciodocumento_produccionesds_8_tfbarserdsc_sel = "" ;
      AV65Facturacion_confirmacionpreciodocumento_produccionesds_9_tfbarcolnom = "" ;
      AV66Facturacion_confirmacionpreciodocumento_produccionesds_10_tfbarcolnom_sel = "" ;
      AV71Facturacion_confirmacionpreciodocumento_produccionesds_15_tfbaralbkgme = DecimalUtil.ZERO ;
      AV72Facturacion_confirmacionpreciodocumento_produccionesds_16_tfbaralbkgme_to = DecimalUtil.ZERO ;
      AV73Facturacion_confirmacionpreciodocumento_produccionesds_17_tfbaralbmtre = DecimalUtil.ZERO ;
      AV74Facturacion_confirmacionpreciodocumento_produccionesds_18_tfbaralbmtre_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV57Facturacion_confirmacionpreciodocumento_produccionesds_1_tfbarnhdr = "" ;
      lV61Facturacion_confirmacionpreciodocumento_produccionesds_5_tfbarser = "" ;
      lV63Facturacion_confirmacionpreciodocumento_produccionesds_7_tfbarserdsc = "" ;
      lV65Facturacion_confirmacionpreciodocumento_produccionesds_9_tfbarcolnom = "" ;
      A130BarCodPar = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      A13878PedidoClie = "" ;
      A396EmprCod = "" ;
      P09ZT2_A30AlbProCod = new long[1] ;
      P09ZT2_A32AlbProEsp = new byte[1] ;
      P09ZT2_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09ZT2_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09ZT2_A218BarTipCol = new byte[1] ;
      P09ZT2_A136BarColNum = new int[1] ;
      P09ZT2_A135BarColNom = new String[] {""} ;
      P09ZT2_A1652BarSerDsc = new String[] {""} ;
      P09ZT2_A212BarSer = new String[] {""} ;
      P09ZT2_A130BarCodPar = new String[] {""} ;
      P09ZT2_A132BarCodReo = new byte[1] ;
      P09ZT2_A129BarCod = new int[1] ;
      P09ZT2_A143BarDisNum = new String[] {""} ;
      P09ZT2_A4812BarEncCli = new String[] {""} ;
      P09ZT2_A396EmprCod = new String[] {""} ;
      A143BarDisNum = "" ;
      A4812BarEncCli = "" ;
      AV29Option = "" ;
      P09ZT3_A30AlbProCod = new long[1] ;
      P09ZT3_A32AlbProEsp = new byte[1] ;
      P09ZT3_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09ZT3_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09ZT3_A218BarTipCol = new byte[1] ;
      P09ZT3_A136BarColNum = new int[1] ;
      P09ZT3_A135BarColNom = new String[] {""} ;
      P09ZT3_A1652BarSerDsc = new String[] {""} ;
      P09ZT3_A212BarSer = new String[] {""} ;
      P09ZT3_A130BarCodPar = new String[] {""} ;
      P09ZT3_A132BarCodReo = new byte[1] ;
      P09ZT3_A129BarCod = new int[1] ;
      P09ZT3_A143BarDisNum = new String[] {""} ;
      P09ZT3_A4812BarEncCli = new String[] {""} ;
      P09ZT3_A396EmprCod = new String[] {""} ;
      P09ZT4_A30AlbProCod = new long[1] ;
      P09ZT4_A212BarSer = new String[] {""} ;
      P09ZT4_A32AlbProEsp = new byte[1] ;
      P09ZT4_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09ZT4_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09ZT4_A218BarTipCol = new byte[1] ;
      P09ZT4_A136BarColNum = new int[1] ;
      P09ZT4_A135BarColNom = new String[] {""} ;
      P09ZT4_A1652BarSerDsc = new String[] {""} ;
      P09ZT4_A130BarCodPar = new String[] {""} ;
      P09ZT4_A132BarCodReo = new byte[1] ;
      P09ZT4_A129BarCod = new int[1] ;
      P09ZT4_A143BarDisNum = new String[] {""} ;
      P09ZT4_A4812BarEncCli = new String[] {""} ;
      P09ZT4_A396EmprCod = new String[] {""} ;
      P09ZT5_A30AlbProCod = new long[1] ;
      P09ZT5_A1652BarSerDsc = new String[] {""} ;
      P09ZT5_A32AlbProEsp = new byte[1] ;
      P09ZT5_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09ZT5_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09ZT5_A218BarTipCol = new byte[1] ;
      P09ZT5_A136BarColNum = new int[1] ;
      P09ZT5_A135BarColNom = new String[] {""} ;
      P09ZT5_A212BarSer = new String[] {""} ;
      P09ZT5_A130BarCodPar = new String[] {""} ;
      P09ZT5_A132BarCodReo = new byte[1] ;
      P09ZT5_A129BarCod = new int[1] ;
      P09ZT5_A143BarDisNum = new String[] {""} ;
      P09ZT5_A4812BarEncCli = new String[] {""} ;
      P09ZT5_A396EmprCod = new String[] {""} ;
      P09ZT6_A30AlbProCod = new long[1] ;
      P09ZT6_A135BarColNom = new String[] {""} ;
      P09ZT6_A32AlbProEsp = new byte[1] ;
      P09ZT6_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09ZT6_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09ZT6_A218BarTipCol = new byte[1] ;
      P09ZT6_A136BarColNum = new int[1] ;
      P09ZT6_A1652BarSerDsc = new String[] {""} ;
      P09ZT6_A212BarSer = new String[] {""} ;
      P09ZT6_A130BarCodPar = new String[] {""} ;
      P09ZT6_A132BarCodReo = new byte[1] ;
      P09ZT6_A129BarCod = new int[1] ;
      P09ZT6_A143BarDisNum = new String[] {""} ;
      P09ZT6_A4812BarEncCli = new String[] {""} ;
      P09ZT6_A396EmprCod = new String[] {""} ;
      GXt_char2 = "" ;
      GXv_char6 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.confirmacionpreciodocumento_produccionesgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09ZT2_A30AlbProCod, P09ZT2_A32AlbProEsp, P09ZT2_A1263BarAlbMtrE, P09ZT2_A1261BarAlbKgmE, P09ZT2_A218BarTipCol, P09ZT2_A136BarColNum, P09ZT2_A135BarColNom, P09ZT2_A1652BarSerDsc, P09ZT2_A212BarSer, P09ZT2_A130BarCodPar,
            P09ZT2_A132BarCodReo, P09ZT2_A129BarCod, P09ZT2_A143BarDisNum, P09ZT2_A4812BarEncCli, P09ZT2_A396EmprCod
            }
            , new Object[] {
            P09ZT3_A30AlbProCod, P09ZT3_A32AlbProEsp, P09ZT3_A1263BarAlbMtrE, P09ZT3_A1261BarAlbKgmE, P09ZT3_A218BarTipCol, P09ZT3_A136BarColNum, P09ZT3_A135BarColNom, P09ZT3_A1652BarSerDsc, P09ZT3_A212BarSer, P09ZT3_A130BarCodPar,
            P09ZT3_A132BarCodReo, P09ZT3_A129BarCod, P09ZT3_A143BarDisNum, P09ZT3_A4812BarEncCli, P09ZT3_A396EmprCod
            }
            , new Object[] {
            P09ZT4_A30AlbProCod, P09ZT4_A212BarSer, P09ZT4_A32AlbProEsp, P09ZT4_A1263BarAlbMtrE, P09ZT4_A1261BarAlbKgmE, P09ZT4_A218BarTipCol, P09ZT4_A136BarColNum, P09ZT4_A135BarColNom, P09ZT4_A1652BarSerDsc, P09ZT4_A130BarCodPar,
            P09ZT4_A132BarCodReo, P09ZT4_A129BarCod, P09ZT4_A143BarDisNum, P09ZT4_A4812BarEncCli, P09ZT4_A396EmprCod
            }
            , new Object[] {
            P09ZT5_A30AlbProCod, P09ZT5_A1652BarSerDsc, P09ZT5_A32AlbProEsp, P09ZT5_A1263BarAlbMtrE, P09ZT5_A1261BarAlbKgmE, P09ZT5_A218BarTipCol, P09ZT5_A136BarColNum, P09ZT5_A135BarColNom, P09ZT5_A212BarSer, P09ZT5_A130BarCodPar,
            P09ZT5_A132BarCodReo, P09ZT5_A129BarCod, P09ZT5_A143BarDisNum, P09ZT5_A4812BarEncCli, P09ZT5_A396EmprCod
            }
            , new Object[] {
            P09ZT6_A30AlbProCod, P09ZT6_A135BarColNom, P09ZT6_A32AlbProEsp, P09ZT6_A1263BarAlbMtrE, P09ZT6_A1261BarAlbKgmE, P09ZT6_A218BarTipCol, P09ZT6_A136BarColNum, P09ZT6_A1652BarSerDsc, P09ZT6_A212BarSer, P09ZT6_A130BarCodPar,
            P09ZT6_A132BarCodReo, P09ZT6_A129BarCod, P09ZT6_A143BarDisNum, P09ZT6_A4812BarEncCli, P09ZT6_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV22TFBarTipCol ;
   private byte AV23TFBarTipCol_To ;
   private byte AV51TFAlbProEsp ;
   private byte AV52TFAlbProEsp_To ;
   private byte AV69Facturacion_confirmacionpreciodocumento_produccionesds_13_tfbartipcol ;
   private byte AV70Facturacion_confirmacionpreciodocumento_produccionesds_14_tfbartipcol_to ;
   private byte AV75Facturacion_confirmacionpreciodocumento_produccionesds_19_tfalbproesp ;
   private byte AV76Facturacion_confirmacionpreciodocumento_produccionesds_20_tfalbproesp_to ;
   private byte A132BarCodReo ;
   private byte A218BarTipCol ;
   private byte A32AlbProEsp ;
   private short Gx_err ;
   private int AV55GXV1 ;
   private int AV20TFBarColNum ;
   private int AV21TFBarColNum_To ;
   private int AV49Guiremcli ;
   private int AV67Facturacion_confirmacionpreciodocumento_produccionesds_11_tfbarcolnum ;
   private int AV68Facturacion_confirmacionpreciodocumento_produccionesds_12_tfbarcolnum_to ;
   private int A129BarCod ;
   private int A136BarColNum ;
   private int AV28InsertIndex ;
   private long AV48AlbProcod ;
   private long A30AlbProCod ;
   private long AV34count ;
   private java.math.BigDecimal AV24TFBarAlbKgmE ;
   private java.math.BigDecimal AV25TFBarAlbKgmE_To ;
   private java.math.BigDecimal AV26TFBarAlbMtrE ;
   private java.math.BigDecimal AV27TFBarAlbMtrE_To ;
   private java.math.BigDecimal AV71Facturacion_confirmacionpreciodocumento_produccionesds_15_tfbaralbkgme ;
   private java.math.BigDecimal AV72Facturacion_confirmacionpreciodocumento_produccionesds_16_tfbaralbkgme_to ;
   private java.math.BigDecimal AV73Facturacion_confirmacionpreciodocumento_produccionesds_17_tfbaralbmtre ;
   private java.math.BigDecimal AV74Facturacion_confirmacionpreciodocumento_produccionesds_18_tfbaralbmtre_to ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private String AV10TFBarNHdr ;
   private String AV11TFBarNHdr_Sel ;
   private String AV12TFPedidoCliente ;
   private String AV13TFPedidoCliente_Sel ;
   private String AV14TFBarSer ;
   private String AV15TFBarSer_Sel ;
   private String AV16TFBarSerDsc ;
   private String AV17TFBarSerDsc_Sel ;
   private String AV18TFBarColNom ;
   private String AV19TFBarColNom_Sel ;
   private String AV47Emprcod ;
   private String AV50GuiremCln ;
   private String A13696BarNHdr ;
   private String AV57Facturacion_confirmacionpreciodocumento_produccionesds_1_tfbarnhdr ;
   private String AV58Facturacion_confirmacionpreciodocumento_produccionesds_2_tfbarnhdr_sel ;
   private String AV59Facturacion_confirmacionpreciodocumento_produccionesds_3_tfpedidocliente ;
   private String AV60Facturacion_confirmacionpreciodocumento_produccionesds_4_tfpedidocliente_sel ;
   private String AV61Facturacion_confirmacionpreciodocumento_produccionesds_5_tfbarser ;
   private String AV62Facturacion_confirmacionpreciodocumento_produccionesds_6_tfbarser_sel ;
   private String AV63Facturacion_confirmacionpreciodocumento_produccionesds_7_tfbarserdsc ;
   private String AV64Facturacion_confirmacionpreciodocumento_produccionesds_8_tfbarserdsc_sel ;
   private String AV65Facturacion_confirmacionpreciodocumento_produccionesds_9_tfbarcolnom ;
   private String AV66Facturacion_confirmacionpreciodocumento_produccionesds_10_tfbarcolnom_sel ;
   private String scmdbuf ;
   private String lV57Facturacion_confirmacionpreciodocumento_produccionesds_1_tfbarnhdr ;
   private String lV61Facturacion_confirmacionpreciodocumento_produccionesds_5_tfbarser ;
   private String lV63Facturacion_confirmacionpreciodocumento_produccionesds_7_tfbarserdsc ;
   private String lV65Facturacion_confirmacionpreciodocumento_produccionesds_9_tfbarcolnom ;
   private String A130BarCodPar ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A13878PedidoClie ;
   private String A396EmprCod ;
   private String A143BarDisNum ;
   private String A4812BarEncCli ;
   private String GXt_char2 ;
   private String GXv_char6[] ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private boolean returnInSub ;
   private boolean brk9ZT4 ;
   private boolean brk9ZT6 ;
   private boolean brk9ZT8 ;
   private String AV43OptionsJson ;
   private String AV44OptionsDescJson ;
   private String AV45OptionIndexesJson ;
   private String AV40DDOName ;
   private String AV41SearchTxt ;
   private String AV42SearchTxtTo ;
   private String AV29Option ;
   private com.genexus.webpanels.WebSession AV35Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private long[] P09ZT2_A30AlbProCod ;
   private byte[] P09ZT2_A32AlbProEsp ;
   private java.math.BigDecimal[] P09ZT2_A1263BarAlbMtrE ;
   private java.math.BigDecimal[] P09ZT2_A1261BarAlbKgmE ;
   private byte[] P09ZT2_A218BarTipCol ;
   private int[] P09ZT2_A136BarColNum ;
   private String[] P09ZT2_A135BarColNom ;
   private String[] P09ZT2_A1652BarSerDsc ;
   private String[] P09ZT2_A212BarSer ;
   private String[] P09ZT2_A130BarCodPar ;
   private byte[] P09ZT2_A132BarCodReo ;
   private int[] P09ZT2_A129BarCod ;
   private String[] P09ZT2_A143BarDisNum ;
   private String[] P09ZT2_A4812BarEncCli ;
   private String[] P09ZT2_A396EmprCod ;
   private long[] P09ZT3_A30AlbProCod ;
   private byte[] P09ZT3_A32AlbProEsp ;
   private java.math.BigDecimal[] P09ZT3_A1263BarAlbMtrE ;
   private java.math.BigDecimal[] P09ZT3_A1261BarAlbKgmE ;
   private byte[] P09ZT3_A218BarTipCol ;
   private int[] P09ZT3_A136BarColNum ;
   private String[] P09ZT3_A135BarColNom ;
   private String[] P09ZT3_A1652BarSerDsc ;
   private String[] P09ZT3_A212BarSer ;
   private String[] P09ZT3_A130BarCodPar ;
   private byte[] P09ZT3_A132BarCodReo ;
   private int[] P09ZT3_A129BarCod ;
   private String[] P09ZT3_A143BarDisNum ;
   private String[] P09ZT3_A4812BarEncCli ;
   private String[] P09ZT3_A396EmprCod ;
   private long[] P09ZT4_A30AlbProCod ;
   private String[] P09ZT4_A212BarSer ;
   private byte[] P09ZT4_A32AlbProEsp ;
   private java.math.BigDecimal[] P09ZT4_A1263BarAlbMtrE ;
   private java.math.BigDecimal[] P09ZT4_A1261BarAlbKgmE ;
   private byte[] P09ZT4_A218BarTipCol ;
   private int[] P09ZT4_A136BarColNum ;
   private String[] P09ZT4_A135BarColNom ;
   private String[] P09ZT4_A1652BarSerDsc ;
   private String[] P09ZT4_A130BarCodPar ;
   private byte[] P09ZT4_A132BarCodReo ;
   private int[] P09ZT4_A129BarCod ;
   private String[] P09ZT4_A143BarDisNum ;
   private String[] P09ZT4_A4812BarEncCli ;
   private String[] P09ZT4_A396EmprCod ;
   private long[] P09ZT5_A30AlbProCod ;
   private String[] P09ZT5_A1652BarSerDsc ;
   private byte[] P09ZT5_A32AlbProEsp ;
   private java.math.BigDecimal[] P09ZT5_A1263BarAlbMtrE ;
   private java.math.BigDecimal[] P09ZT5_A1261BarAlbKgmE ;
   private byte[] P09ZT5_A218BarTipCol ;
   private int[] P09ZT5_A136BarColNum ;
   private String[] P09ZT5_A135BarColNom ;
   private String[] P09ZT5_A212BarSer ;
   private String[] P09ZT5_A130BarCodPar ;
   private byte[] P09ZT5_A132BarCodReo ;
   private int[] P09ZT5_A129BarCod ;
   private String[] P09ZT5_A143BarDisNum ;
   private String[] P09ZT5_A4812BarEncCli ;
   private String[] P09ZT5_A396EmprCod ;
   private long[] P09ZT6_A30AlbProCod ;
   private String[] P09ZT6_A135BarColNom ;
   private byte[] P09ZT6_A32AlbProEsp ;
   private java.math.BigDecimal[] P09ZT6_A1263BarAlbMtrE ;
   private java.math.BigDecimal[] P09ZT6_A1261BarAlbKgmE ;
   private byte[] P09ZT6_A218BarTipCol ;
   private int[] P09ZT6_A136BarColNum ;
   private String[] P09ZT6_A1652BarSerDsc ;
   private String[] P09ZT6_A212BarSer ;
   private String[] P09ZT6_A130BarCodPar ;
   private byte[] P09ZT6_A132BarCodReo ;
   private int[] P09ZT6_A129BarCod ;
   private String[] P09ZT6_A143BarDisNum ;
   private String[] P09ZT6_A4812BarEncCli ;
   private String[] P09ZT6_A396EmprCod ;
   private GXSimpleCollection<String> AV30Options ;
   private GXSimpleCollection<String> AV32OptionsDesc ;
   private GXSimpleCollection<String> AV33OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV37GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV38GridStateFilterValue ;
}

final  class confirmacionpreciodocumento_produccionesgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09ZT2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV58Facturacion_confirmacionpreciodocumento_produccionesds_2_tfbarnhdr_sel ,
                                          String AV57Facturacion_confirmacionpreciodocumento_produccionesds_1_tfbarnhdr ,
                                          String AV62Facturacion_confirmacionpreciodocumento_produccionesds_6_tfbarser_sel ,
                                          String AV61Facturacion_confirmacionpreciodocumento_produccionesds_5_tfbarser ,
                                          String AV64Facturacion_confirmacionpreciodocumento_produccionesds_8_tfbarserdsc_sel ,
                                          String AV63Facturacion_confirmacionpreciodocumento_produccionesds_7_tfbarserdsc ,
                                          String AV66Facturacion_confirmacionpreciodocumento_produccionesds_10_tfbarcolnom_sel ,
                                          String AV65Facturacion_confirmacionpreciodocumento_produccionesds_9_tfbarcolnom ,
                                          int AV67Facturacion_confirmacionpreciodocumento_produccionesds_11_tfbarcolnum ,
                                          int AV68Facturacion_confirmacionpreciodocumento_produccionesds_12_tfbarcolnum_to ,
                                          byte AV69Facturacion_confirmacionpreciodocumento_produccionesds_13_tfbartipcol ,
                                          byte AV70Facturacion_confirmacionpreciodocumento_produccionesds_14_tfbartipcol_to ,
                                          java.math.BigDecimal AV71Facturacion_confirmacionpreciodocumento_produccionesds_15_tfbaralbkgme ,
                                          java.math.BigDecimal AV72Facturacion_confirmacionpreciodocumento_produccionesds_16_tfbaralbkgme_to ,
                                          java.math.BigDecimal AV73Facturacion_confirmacionpreciodocumento_produccionesds_17_tfbaralbmtre ,
                                          java.math.BigDecimal AV74Facturacion_confirmacionpreciodocumento_produccionesds_18_tfbaralbmtre_to ,
                                          byte AV75Facturacion_confirmacionpreciodocumento_produccionesds_19_tfalbproesp ,
                                          byte AV76Facturacion_confirmacionpreciodocumento_produccionesds_20_tfalbproesp_to ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          byte A218BarTipCol ,
                                          java.math.BigDecimal A1261BarAlbKgmE ,
                                          java.math.BigDecimal A1263BarAlbMtrE ,
                                          byte A32AlbProEsp ,
                                          String AV60Facturacion_confirmacionpreciodocumento_produccionesds_4_tfpedidocliente_sel ,
                                          String AV59Facturacion_confirmacionpreciodocumento_produccionesds_3_tfpedidocliente ,
                                          String A13878PedidoClie ,
                                          String AV47Emprcod ,
                                          long AV48AlbProcod ,
                                          String A396EmprCod ,
                                          long A30AlbProCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int7 = new byte[20];
      Object[] GXv_Object8 = new Object[2];
      scmdbuf = "SELECT T1.AlbProCod, T1.AlbProEsp, T1.BarAlbMtrE, T1.BarAlbKgmE, T2.BarTipCol, T2.BarColNum, T2.BarColNom, T2.BarSerDsc, T2.BarSer, T1.BarCodPar, T1.BarCodReo, T1.BarCod," ;
      scmdbuf += " T2.BarDisNum, T2.BarEncCli, T1.EmprCod FROM (TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo" ;
      scmdbuf += " AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.AlbProCod = ?)");
      if ( (GXutil.strcmp("", AV58Facturacion_confirmacionpreciodocumento_produccionesds_2_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV57Facturacion_confirmacionpreciodocumento_produccionesds_1_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int7[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Facturacion_confirmacionpreciodocumento_produccionesds_2_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int7[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Facturacion_confirmacionpreciodocumento_produccionesds_6_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV61Facturacion_confirmacionpreciodocumento_produccionesds_5_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int7[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Facturacion_confirmacionpreciodocumento_produccionesds_6_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int7[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Facturacion_confirmacionpreciodocumento_produccionesds_8_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV63Facturacion_confirmacionpreciodocumento_produccionesds_7_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int7[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Facturacion_confirmacionpreciodocumento_produccionesds_8_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int7[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Facturacion_confirmacionpreciodocumento_produccionesds_10_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV65Facturacion_confirmacionpreciodocumento_produccionesds_9_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int7[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Facturacion_confirmacionpreciodocumento_produccionesds_10_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int7[9] = (byte)(1) ;
      }
      if ( ! (0==AV67Facturacion_confirmacionpreciodocumento_produccionesds_11_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int7[10] = (byte)(1) ;
      }
      if ( ! (0==AV68Facturacion_confirmacionpreciodocumento_produccionesds_12_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int7[11] = (byte)(1) ;
      }
      if ( ! (0==AV69Facturacion_confirmacionpreciodocumento_produccionesds_13_tfbartipcol) )
      {
         addWhere(sWhereString, "(T2.BarTipCol >= ?)");
      }
      else
      {
         GXv_int7[12] = (byte)(1) ;
      }
      if ( ! (0==AV70Facturacion_confirmacionpreciodocumento_produccionesds_14_tfbartipcol_to) )
      {
         addWhere(sWhereString, "(T2.BarTipCol <= ?)");
      }
      else
      {
         GXv_int7[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71Facturacion_confirmacionpreciodocumento_produccionesds_15_tfbaralbkgme)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbKgmE >= ?)");
      }
      else
      {
         GXv_int7[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Facturacion_confirmacionpreciodocumento_produccionesds_16_tfbaralbkgme_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbKgmE <= ?)");
      }
      else
      {
         GXv_int7[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Facturacion_confirmacionpreciodocumento_produccionesds_17_tfbaralbmtre)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbMtrE >= ?)");
      }
      else
      {
         GXv_int7[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Facturacion_confirmacionpreciodocumento_produccionesds_18_tfbaralbmtre_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbMtrE <= ?)");
      }
      else
      {
         GXv_int7[17] = (byte)(1) ;
      }
      if ( ! (0==AV75Facturacion_confirmacionpreciodocumento_produccionesds_19_tfalbproesp) )
      {
         addWhere(sWhereString, "(T1.AlbProEsp >= ?)");
      }
      else
      {
         GXv_int7[18] = (byte)(1) ;
      }
      if ( ! (0==AV76Facturacion_confirmacionpreciodocumento_produccionesds_20_tfalbproesp_to) )
      {
         addWhere(sWhereString, "(T1.AlbProEsp <= ?)");
      }
      else
      {
         GXv_int7[19] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.AlbProCod" ;
      GXv_Object8[0] = scmdbuf ;
      GXv_Object8[1] = GXv_int7 ;
      return GXv_Object8 ;
   }

   protected Object[] conditional_P09ZT3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV58Facturacion_confirmacionpreciodocumento_produccionesds_2_tfbarnhdr_sel ,
                                          String AV57Facturacion_confirmacionpreciodocumento_produccionesds_1_tfbarnhdr ,
                                          String AV62Facturacion_confirmacionpreciodocumento_produccionesds_6_tfbarser_sel ,
                                          String AV61Facturacion_confirmacionpreciodocumento_produccionesds_5_tfbarser ,
                                          String AV64Facturacion_confirmacionpreciodocumento_produccionesds_8_tfbarserdsc_sel ,
                                          String AV63Facturacion_confirmacionpreciodocumento_produccionesds_7_tfbarserdsc ,
                                          String AV66Facturacion_confirmacionpreciodocumento_produccionesds_10_tfbarcolnom_sel ,
                                          String AV65Facturacion_confirmacionpreciodocumento_produccionesds_9_tfbarcolnom ,
                                          int AV67Facturacion_confirmacionpreciodocumento_produccionesds_11_tfbarcolnum ,
                                          int AV68Facturacion_confirmacionpreciodocumento_produccionesds_12_tfbarcolnum_to ,
                                          byte AV69Facturacion_confirmacionpreciodocumento_produccionesds_13_tfbartipcol ,
                                          byte AV70Facturacion_confirmacionpreciodocumento_produccionesds_14_tfbartipcol_to ,
                                          java.math.BigDecimal AV71Facturacion_confirmacionpreciodocumento_produccionesds_15_tfbaralbkgme ,
                                          java.math.BigDecimal AV72Facturacion_confirmacionpreciodocumento_produccionesds_16_tfbaralbkgme_to ,
                                          java.math.BigDecimal AV73Facturacion_confirmacionpreciodocumento_produccionesds_17_tfbaralbmtre ,
                                          java.math.BigDecimal AV74Facturacion_confirmacionpreciodocumento_produccionesds_18_tfbaralbmtre_to ,
                                          byte AV75Facturacion_confirmacionpreciodocumento_produccionesds_19_tfalbproesp ,
                                          byte AV76Facturacion_confirmacionpreciodocumento_produccionesds_20_tfalbproesp_to ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          byte A218BarTipCol ,
                                          java.math.BigDecimal A1261BarAlbKgmE ,
                                          java.math.BigDecimal A1263BarAlbMtrE ,
                                          byte A32AlbProEsp ,
                                          String AV60Facturacion_confirmacionpreciodocumento_produccionesds_4_tfpedidocliente_sel ,
                                          String AV59Facturacion_confirmacionpreciodocumento_produccionesds_3_tfpedidocliente ,
                                          String A13878PedidoClie ,
                                          String AV47Emprcod ,
                                          long AV48AlbProcod ,
                                          String A396EmprCod ,
                                          long A30AlbProCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[20];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT T1.AlbProCod, T1.AlbProEsp, T1.BarAlbMtrE, T1.BarAlbKgmE, T2.BarTipCol, T2.BarColNum, T2.BarColNom, T2.BarSerDsc, T2.BarSer, T1.BarCodPar, T1.BarCodReo, T1.BarCod," ;
      scmdbuf += " T2.BarDisNum, T2.BarEncCli, T1.EmprCod FROM (TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo" ;
      scmdbuf += " AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.AlbProCod = ?)");
      if ( (GXutil.strcmp("", AV58Facturacion_confirmacionpreciodocumento_produccionesds_2_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV57Facturacion_confirmacionpreciodocumento_produccionesds_1_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Facturacion_confirmacionpreciodocumento_produccionesds_2_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int9[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Facturacion_confirmacionpreciodocumento_produccionesds_6_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV61Facturacion_confirmacionpreciodocumento_produccionesds_5_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Facturacion_confirmacionpreciodocumento_produccionesds_6_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int9[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Facturacion_confirmacionpreciodocumento_produccionesds_8_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV63Facturacion_confirmacionpreciodocumento_produccionesds_7_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Facturacion_confirmacionpreciodocumento_produccionesds_8_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int9[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Facturacion_confirmacionpreciodocumento_produccionesds_10_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV65Facturacion_confirmacionpreciodocumento_produccionesds_9_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Facturacion_confirmacionpreciodocumento_produccionesds_10_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int9[9] = (byte)(1) ;
      }
      if ( ! (0==AV67Facturacion_confirmacionpreciodocumento_produccionesds_11_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int9[10] = (byte)(1) ;
      }
      if ( ! (0==AV68Facturacion_confirmacionpreciodocumento_produccionesds_12_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int9[11] = (byte)(1) ;
      }
      if ( ! (0==AV69Facturacion_confirmacionpreciodocumento_produccionesds_13_tfbartipcol) )
      {
         addWhere(sWhereString, "(T2.BarTipCol >= ?)");
      }
      else
      {
         GXv_int9[12] = (byte)(1) ;
      }
      if ( ! (0==AV70Facturacion_confirmacionpreciodocumento_produccionesds_14_tfbartipcol_to) )
      {
         addWhere(sWhereString, "(T2.BarTipCol <= ?)");
      }
      else
      {
         GXv_int9[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71Facturacion_confirmacionpreciodocumento_produccionesds_15_tfbaralbkgme)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbKgmE >= ?)");
      }
      else
      {
         GXv_int9[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Facturacion_confirmacionpreciodocumento_produccionesds_16_tfbaralbkgme_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbKgmE <= ?)");
      }
      else
      {
         GXv_int9[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Facturacion_confirmacionpreciodocumento_produccionesds_17_tfbaralbmtre)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbMtrE >= ?)");
      }
      else
      {
         GXv_int9[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Facturacion_confirmacionpreciodocumento_produccionesds_18_tfbaralbmtre_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbMtrE <= ?)");
      }
      else
      {
         GXv_int9[17] = (byte)(1) ;
      }
      if ( ! (0==AV75Facturacion_confirmacionpreciodocumento_produccionesds_19_tfalbproesp) )
      {
         addWhere(sWhereString, "(T1.AlbProEsp >= ?)");
      }
      else
      {
         GXv_int9[18] = (byte)(1) ;
      }
      if ( ! (0==AV76Facturacion_confirmacionpreciodocumento_produccionesds_20_tfalbproesp_to) )
      {
         addWhere(sWhereString, "(T1.AlbProEsp <= ?)");
      }
      else
      {
         GXv_int9[19] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.AlbProCod" ;
      GXv_Object10[0] = scmdbuf ;
      GXv_Object10[1] = GXv_int9 ;
      return GXv_Object10 ;
   }

   protected Object[] conditional_P09ZT4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV58Facturacion_confirmacionpreciodocumento_produccionesds_2_tfbarnhdr_sel ,
                                          String AV57Facturacion_confirmacionpreciodocumento_produccionesds_1_tfbarnhdr ,
                                          String AV62Facturacion_confirmacionpreciodocumento_produccionesds_6_tfbarser_sel ,
                                          String AV61Facturacion_confirmacionpreciodocumento_produccionesds_5_tfbarser ,
                                          String AV64Facturacion_confirmacionpreciodocumento_produccionesds_8_tfbarserdsc_sel ,
                                          String AV63Facturacion_confirmacionpreciodocumento_produccionesds_7_tfbarserdsc ,
                                          String AV66Facturacion_confirmacionpreciodocumento_produccionesds_10_tfbarcolnom_sel ,
                                          String AV65Facturacion_confirmacionpreciodocumento_produccionesds_9_tfbarcolnom ,
                                          int AV67Facturacion_confirmacionpreciodocumento_produccionesds_11_tfbarcolnum ,
                                          int AV68Facturacion_confirmacionpreciodocumento_produccionesds_12_tfbarcolnum_to ,
                                          byte AV69Facturacion_confirmacionpreciodocumento_produccionesds_13_tfbartipcol ,
                                          byte AV70Facturacion_confirmacionpreciodocumento_produccionesds_14_tfbartipcol_to ,
                                          java.math.BigDecimal AV71Facturacion_confirmacionpreciodocumento_produccionesds_15_tfbaralbkgme ,
                                          java.math.BigDecimal AV72Facturacion_confirmacionpreciodocumento_produccionesds_16_tfbaralbkgme_to ,
                                          java.math.BigDecimal AV73Facturacion_confirmacionpreciodocumento_produccionesds_17_tfbaralbmtre ,
                                          java.math.BigDecimal AV74Facturacion_confirmacionpreciodocumento_produccionesds_18_tfbaralbmtre_to ,
                                          byte AV75Facturacion_confirmacionpreciodocumento_produccionesds_19_tfalbproesp ,
                                          byte AV76Facturacion_confirmacionpreciodocumento_produccionesds_20_tfalbproesp_to ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          byte A218BarTipCol ,
                                          java.math.BigDecimal A1261BarAlbKgmE ,
                                          java.math.BigDecimal A1263BarAlbMtrE ,
                                          byte A32AlbProEsp ,
                                          String AV60Facturacion_confirmacionpreciodocumento_produccionesds_4_tfpedidocliente_sel ,
                                          String AV59Facturacion_confirmacionpreciodocumento_produccionesds_3_tfpedidocliente ,
                                          String A13878PedidoClie ,
                                          String A396EmprCod ,
                                          String AV47Emprcod ,
                                          long A30AlbProCod ,
                                          long AV48AlbProcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int11 = new byte[20];
      Object[] GXv_Object12 = new Object[2];
      scmdbuf = "SELECT T1.AlbProCod, T2.BarSer, T1.AlbProEsp, T1.BarAlbMtrE, T1.BarAlbKgmE, T2.BarTipCol, T2.BarColNum, T2.BarColNom, T2.BarSerDsc, T1.BarCodPar, T1.BarCodReo, T1.BarCod," ;
      scmdbuf += " T2.BarDisNum, T2.BarEncCli, T1.EmprCod FROM (TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo" ;
      scmdbuf += " AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbProCod = ?)");
      if ( (GXutil.strcmp("", AV58Facturacion_confirmacionpreciodocumento_produccionesds_2_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV57Facturacion_confirmacionpreciodocumento_produccionesds_1_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Facturacion_confirmacionpreciodocumento_produccionesds_2_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int11[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Facturacion_confirmacionpreciodocumento_produccionesds_6_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV61Facturacion_confirmacionpreciodocumento_produccionesds_5_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Facturacion_confirmacionpreciodocumento_produccionesds_6_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int11[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Facturacion_confirmacionpreciodocumento_produccionesds_8_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV63Facturacion_confirmacionpreciodocumento_produccionesds_7_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Facturacion_confirmacionpreciodocumento_produccionesds_8_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int11[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Facturacion_confirmacionpreciodocumento_produccionesds_10_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV65Facturacion_confirmacionpreciodocumento_produccionesds_9_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Facturacion_confirmacionpreciodocumento_produccionesds_10_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int11[9] = (byte)(1) ;
      }
      if ( ! (0==AV67Facturacion_confirmacionpreciodocumento_produccionesds_11_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int11[10] = (byte)(1) ;
      }
      if ( ! (0==AV68Facturacion_confirmacionpreciodocumento_produccionesds_12_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int11[11] = (byte)(1) ;
      }
      if ( ! (0==AV69Facturacion_confirmacionpreciodocumento_produccionesds_13_tfbartipcol) )
      {
         addWhere(sWhereString, "(T2.BarTipCol >= ?)");
      }
      else
      {
         GXv_int11[12] = (byte)(1) ;
      }
      if ( ! (0==AV70Facturacion_confirmacionpreciodocumento_produccionesds_14_tfbartipcol_to) )
      {
         addWhere(sWhereString, "(T2.BarTipCol <= ?)");
      }
      else
      {
         GXv_int11[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71Facturacion_confirmacionpreciodocumento_produccionesds_15_tfbaralbkgme)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbKgmE >= ?)");
      }
      else
      {
         GXv_int11[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Facturacion_confirmacionpreciodocumento_produccionesds_16_tfbaralbkgme_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbKgmE <= ?)");
      }
      else
      {
         GXv_int11[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Facturacion_confirmacionpreciodocumento_produccionesds_17_tfbaralbmtre)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbMtrE >= ?)");
      }
      else
      {
         GXv_int11[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Facturacion_confirmacionpreciodocumento_produccionesds_18_tfbaralbmtre_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbMtrE <= ?)");
      }
      else
      {
         GXv_int11[17] = (byte)(1) ;
      }
      if ( ! (0==AV75Facturacion_confirmacionpreciodocumento_produccionesds_19_tfalbproesp) )
      {
         addWhere(sWhereString, "(T1.AlbProEsp >= ?)");
      }
      else
      {
         GXv_int11[18] = (byte)(1) ;
      }
      if ( ! (0==AV76Facturacion_confirmacionpreciodocumento_produccionesds_20_tfalbproesp_to) )
      {
         addWhere(sWhereString, "(T1.AlbProEsp <= ?)");
      }
      else
      {
         GXv_int11[19] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.BarSer" ;
      GXv_Object12[0] = scmdbuf ;
      GXv_Object12[1] = GXv_int11 ;
      return GXv_Object12 ;
   }

   protected Object[] conditional_P09ZT5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV58Facturacion_confirmacionpreciodocumento_produccionesds_2_tfbarnhdr_sel ,
                                          String AV57Facturacion_confirmacionpreciodocumento_produccionesds_1_tfbarnhdr ,
                                          String AV62Facturacion_confirmacionpreciodocumento_produccionesds_6_tfbarser_sel ,
                                          String AV61Facturacion_confirmacionpreciodocumento_produccionesds_5_tfbarser ,
                                          String AV64Facturacion_confirmacionpreciodocumento_produccionesds_8_tfbarserdsc_sel ,
                                          String AV63Facturacion_confirmacionpreciodocumento_produccionesds_7_tfbarserdsc ,
                                          String AV66Facturacion_confirmacionpreciodocumento_produccionesds_10_tfbarcolnom_sel ,
                                          String AV65Facturacion_confirmacionpreciodocumento_produccionesds_9_tfbarcolnom ,
                                          int AV67Facturacion_confirmacionpreciodocumento_produccionesds_11_tfbarcolnum ,
                                          int AV68Facturacion_confirmacionpreciodocumento_produccionesds_12_tfbarcolnum_to ,
                                          byte AV69Facturacion_confirmacionpreciodocumento_produccionesds_13_tfbartipcol ,
                                          byte AV70Facturacion_confirmacionpreciodocumento_produccionesds_14_tfbartipcol_to ,
                                          java.math.BigDecimal AV71Facturacion_confirmacionpreciodocumento_produccionesds_15_tfbaralbkgme ,
                                          java.math.BigDecimal AV72Facturacion_confirmacionpreciodocumento_produccionesds_16_tfbaralbkgme_to ,
                                          java.math.BigDecimal AV73Facturacion_confirmacionpreciodocumento_produccionesds_17_tfbaralbmtre ,
                                          java.math.BigDecimal AV74Facturacion_confirmacionpreciodocumento_produccionesds_18_tfbaralbmtre_to ,
                                          byte AV75Facturacion_confirmacionpreciodocumento_produccionesds_19_tfalbproesp ,
                                          byte AV76Facturacion_confirmacionpreciodocumento_produccionesds_20_tfalbproesp_to ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          byte A218BarTipCol ,
                                          java.math.BigDecimal A1261BarAlbKgmE ,
                                          java.math.BigDecimal A1263BarAlbMtrE ,
                                          byte A32AlbProEsp ,
                                          String AV60Facturacion_confirmacionpreciodocumento_produccionesds_4_tfpedidocliente_sel ,
                                          String AV59Facturacion_confirmacionpreciodocumento_produccionesds_3_tfpedidocliente ,
                                          String A13878PedidoClie ,
                                          String A396EmprCod ,
                                          String AV47Emprcod ,
                                          long A30AlbProCod ,
                                          long AV48AlbProcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int13 = new byte[20];
      Object[] GXv_Object14 = new Object[2];
      scmdbuf = "SELECT T1.AlbProCod, T2.BarSerDsc, T1.AlbProEsp, T1.BarAlbMtrE, T1.BarAlbKgmE, T2.BarTipCol, T2.BarColNum, T2.BarColNom, T2.BarSer, T1.BarCodPar, T1.BarCodReo, T1.BarCod," ;
      scmdbuf += " T2.BarDisNum, T2.BarEncCli, T1.EmprCod FROM (TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo" ;
      scmdbuf += " AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbProCod = ?)");
      if ( (GXutil.strcmp("", AV58Facturacion_confirmacionpreciodocumento_produccionesds_2_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV57Facturacion_confirmacionpreciodocumento_produccionesds_1_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Facturacion_confirmacionpreciodocumento_produccionesds_2_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int13[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Facturacion_confirmacionpreciodocumento_produccionesds_6_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV61Facturacion_confirmacionpreciodocumento_produccionesds_5_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Facturacion_confirmacionpreciodocumento_produccionesds_6_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int13[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Facturacion_confirmacionpreciodocumento_produccionesds_8_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV63Facturacion_confirmacionpreciodocumento_produccionesds_7_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Facturacion_confirmacionpreciodocumento_produccionesds_8_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int13[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Facturacion_confirmacionpreciodocumento_produccionesds_10_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV65Facturacion_confirmacionpreciodocumento_produccionesds_9_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Facturacion_confirmacionpreciodocumento_produccionesds_10_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int13[9] = (byte)(1) ;
      }
      if ( ! (0==AV67Facturacion_confirmacionpreciodocumento_produccionesds_11_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int13[10] = (byte)(1) ;
      }
      if ( ! (0==AV68Facturacion_confirmacionpreciodocumento_produccionesds_12_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int13[11] = (byte)(1) ;
      }
      if ( ! (0==AV69Facturacion_confirmacionpreciodocumento_produccionesds_13_tfbartipcol) )
      {
         addWhere(sWhereString, "(T2.BarTipCol >= ?)");
      }
      else
      {
         GXv_int13[12] = (byte)(1) ;
      }
      if ( ! (0==AV70Facturacion_confirmacionpreciodocumento_produccionesds_14_tfbartipcol_to) )
      {
         addWhere(sWhereString, "(T2.BarTipCol <= ?)");
      }
      else
      {
         GXv_int13[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71Facturacion_confirmacionpreciodocumento_produccionesds_15_tfbaralbkgme)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbKgmE >= ?)");
      }
      else
      {
         GXv_int13[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Facturacion_confirmacionpreciodocumento_produccionesds_16_tfbaralbkgme_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbKgmE <= ?)");
      }
      else
      {
         GXv_int13[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Facturacion_confirmacionpreciodocumento_produccionesds_17_tfbaralbmtre)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbMtrE >= ?)");
      }
      else
      {
         GXv_int13[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Facturacion_confirmacionpreciodocumento_produccionesds_18_tfbaralbmtre_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbMtrE <= ?)");
      }
      else
      {
         GXv_int13[17] = (byte)(1) ;
      }
      if ( ! (0==AV75Facturacion_confirmacionpreciodocumento_produccionesds_19_tfalbproesp) )
      {
         addWhere(sWhereString, "(T1.AlbProEsp >= ?)");
      }
      else
      {
         GXv_int13[18] = (byte)(1) ;
      }
      if ( ! (0==AV76Facturacion_confirmacionpreciodocumento_produccionesds_20_tfalbproesp_to) )
      {
         addWhere(sWhereString, "(T1.AlbProEsp <= ?)");
      }
      else
      {
         GXv_int13[19] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.BarSerDsc" ;
      GXv_Object14[0] = scmdbuf ;
      GXv_Object14[1] = GXv_int13 ;
      return GXv_Object14 ;
   }

   protected Object[] conditional_P09ZT6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV58Facturacion_confirmacionpreciodocumento_produccionesds_2_tfbarnhdr_sel ,
                                          String AV57Facturacion_confirmacionpreciodocumento_produccionesds_1_tfbarnhdr ,
                                          String AV62Facturacion_confirmacionpreciodocumento_produccionesds_6_tfbarser_sel ,
                                          String AV61Facturacion_confirmacionpreciodocumento_produccionesds_5_tfbarser ,
                                          String AV64Facturacion_confirmacionpreciodocumento_produccionesds_8_tfbarserdsc_sel ,
                                          String AV63Facturacion_confirmacionpreciodocumento_produccionesds_7_tfbarserdsc ,
                                          String AV66Facturacion_confirmacionpreciodocumento_produccionesds_10_tfbarcolnom_sel ,
                                          String AV65Facturacion_confirmacionpreciodocumento_produccionesds_9_tfbarcolnom ,
                                          int AV67Facturacion_confirmacionpreciodocumento_produccionesds_11_tfbarcolnum ,
                                          int AV68Facturacion_confirmacionpreciodocumento_produccionesds_12_tfbarcolnum_to ,
                                          byte AV69Facturacion_confirmacionpreciodocumento_produccionesds_13_tfbartipcol ,
                                          byte AV70Facturacion_confirmacionpreciodocumento_produccionesds_14_tfbartipcol_to ,
                                          java.math.BigDecimal AV71Facturacion_confirmacionpreciodocumento_produccionesds_15_tfbaralbkgme ,
                                          java.math.BigDecimal AV72Facturacion_confirmacionpreciodocumento_produccionesds_16_tfbaralbkgme_to ,
                                          java.math.BigDecimal AV73Facturacion_confirmacionpreciodocumento_produccionesds_17_tfbaralbmtre ,
                                          java.math.BigDecimal AV74Facturacion_confirmacionpreciodocumento_produccionesds_18_tfbaralbmtre_to ,
                                          byte AV75Facturacion_confirmacionpreciodocumento_produccionesds_19_tfalbproesp ,
                                          byte AV76Facturacion_confirmacionpreciodocumento_produccionesds_20_tfalbproesp_to ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          byte A218BarTipCol ,
                                          java.math.BigDecimal A1261BarAlbKgmE ,
                                          java.math.BigDecimal A1263BarAlbMtrE ,
                                          byte A32AlbProEsp ,
                                          String AV60Facturacion_confirmacionpreciodocumento_produccionesds_4_tfpedidocliente_sel ,
                                          String AV59Facturacion_confirmacionpreciodocumento_produccionesds_3_tfpedidocliente ,
                                          String A13878PedidoClie ,
                                          String A396EmprCod ,
                                          String AV47Emprcod ,
                                          long A30AlbProCod ,
                                          long AV48AlbProcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int15 = new byte[20];
      Object[] GXv_Object16 = new Object[2];
      scmdbuf = "SELECT T1.AlbProCod, T2.BarColNom, T1.AlbProEsp, T1.BarAlbMtrE, T1.BarAlbKgmE, T2.BarTipCol, T2.BarColNum, T2.BarSerDsc, T2.BarSer, T1.BarCodPar, T1.BarCodReo, T1.BarCod," ;
      scmdbuf += " T2.BarDisNum, T2.BarEncCli, T1.EmprCod FROM (TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo" ;
      scmdbuf += " AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbProCod = ?)");
      if ( (GXutil.strcmp("", AV58Facturacion_confirmacionpreciodocumento_produccionesds_2_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV57Facturacion_confirmacionpreciodocumento_produccionesds_1_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Facturacion_confirmacionpreciodocumento_produccionesds_2_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int15[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Facturacion_confirmacionpreciodocumento_produccionesds_6_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV61Facturacion_confirmacionpreciodocumento_produccionesds_5_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Facturacion_confirmacionpreciodocumento_produccionesds_6_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int15[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Facturacion_confirmacionpreciodocumento_produccionesds_8_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV63Facturacion_confirmacionpreciodocumento_produccionesds_7_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Facturacion_confirmacionpreciodocumento_produccionesds_8_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int15[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Facturacion_confirmacionpreciodocumento_produccionesds_10_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV65Facturacion_confirmacionpreciodocumento_produccionesds_9_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Facturacion_confirmacionpreciodocumento_produccionesds_10_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int15[9] = (byte)(1) ;
      }
      if ( ! (0==AV67Facturacion_confirmacionpreciodocumento_produccionesds_11_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int15[10] = (byte)(1) ;
      }
      if ( ! (0==AV68Facturacion_confirmacionpreciodocumento_produccionesds_12_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int15[11] = (byte)(1) ;
      }
      if ( ! (0==AV69Facturacion_confirmacionpreciodocumento_produccionesds_13_tfbartipcol) )
      {
         addWhere(sWhereString, "(T2.BarTipCol >= ?)");
      }
      else
      {
         GXv_int15[12] = (byte)(1) ;
      }
      if ( ! (0==AV70Facturacion_confirmacionpreciodocumento_produccionesds_14_tfbartipcol_to) )
      {
         addWhere(sWhereString, "(T2.BarTipCol <= ?)");
      }
      else
      {
         GXv_int15[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71Facturacion_confirmacionpreciodocumento_produccionesds_15_tfbaralbkgme)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbKgmE >= ?)");
      }
      else
      {
         GXv_int15[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Facturacion_confirmacionpreciodocumento_produccionesds_16_tfbaralbkgme_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbKgmE <= ?)");
      }
      else
      {
         GXv_int15[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Facturacion_confirmacionpreciodocumento_produccionesds_17_tfbaralbmtre)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbMtrE >= ?)");
      }
      else
      {
         GXv_int15[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Facturacion_confirmacionpreciodocumento_produccionesds_18_tfbaralbmtre_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbMtrE <= ?)");
      }
      else
      {
         GXv_int15[17] = (byte)(1) ;
      }
      if ( ! (0==AV75Facturacion_confirmacionpreciodocumento_produccionesds_19_tfalbproesp) )
      {
         addWhere(sWhereString, "(T1.AlbProEsp >= ?)");
      }
      else
      {
         GXv_int15[18] = (byte)(1) ;
      }
      if ( ! (0==AV76Facturacion_confirmacionpreciodocumento_produccionesds_20_tfalbproesp_to) )
      {
         addWhere(sWhereString, "(T1.AlbProEsp <= ?)");
      }
      else
      {
         GXv_int15[19] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.BarColNom" ;
      GXv_Object16[0] = scmdbuf ;
      GXv_Object16[1] = GXv_int15 ;
      return GXv_Object16 ;
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
                  return conditional_P09ZT2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).byteValue() , ((Number) dynConstraints[11]).byteValue() , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).byteValue() , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).byteValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).byteValue() , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).longValue() , (String)dynConstraints[34] , ((Number) dynConstraints[35]).longValue() );
            case 1 :
                  return conditional_P09ZT3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).byteValue() , ((Number) dynConstraints[11]).byteValue() , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).byteValue() , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).byteValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).byteValue() , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).longValue() , (String)dynConstraints[34] , ((Number) dynConstraints[35]).longValue() );
            case 2 :
                  return conditional_P09ZT4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).byteValue() , ((Number) dynConstraints[11]).byteValue() , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).byteValue() , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).byteValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).byteValue() , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , ((Number) dynConstraints[34]).longValue() , ((Number) dynConstraints[35]).longValue() );
            case 3 :
                  return conditional_P09ZT5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).byteValue() , ((Number) dynConstraints[11]).byteValue() , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).byteValue() , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).byteValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).byteValue() , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , ((Number) dynConstraints[34]).longValue() , ((Number) dynConstraints[35]).longValue() );
            case 4 :
                  return conditional_P09ZT6(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).byteValue() , ((Number) dynConstraints[11]).byteValue() , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).byteValue() , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).byteValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).byteValue() , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , ((Number) dynConstraints[34]).longValue() , ((Number) dynConstraints[35]).longValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09ZT2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09ZT3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09ZT4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09ZT5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09ZT6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               ((String[]) buf[8])[0] = rslt.getString(9, 16);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 8);
               ((String[]) buf[13])[0] = rslt.getString(14, 20);
               ((String[]) buf[14])[0] = rslt.getString(15, 3);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               ((String[]) buf[8])[0] = rslt.getString(9, 16);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 8);
               ((String[]) buf[13])[0] = rslt.getString(14, 20);
               ((String[]) buf[14])[0] = rslt.getString(15, 3);
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((String[]) buf[8])[0] = rslt.getString(9, 26);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 8);
               ((String[]) buf[13])[0] = rslt.getString(14, 20);
               ((String[]) buf[14])[0] = rslt.getString(15, 3);
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((String[]) buf[8])[0] = rslt.getString(9, 16);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 8);
               ((String[]) buf[13])[0] = rslt.getString(14, 20);
               ((String[]) buf[14])[0] = rslt.getString(15, 3);
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               ((String[]) buf[8])[0] = rslt.getString(9, 16);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 8);
               ((String[]) buf[13])[0] = rslt.getString(14, 20);
               ((String[]) buf[14])[0] = rslt.getString(15, 3);
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
                  stmt.setString(sIdx, (String)parms[20], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[21]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 11);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 11);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 13);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 13);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[32]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[33]).byteValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[38]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[21]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 11);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 11);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 13);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 13);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[32]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[33]).byteValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[38]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[21]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 11);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 11);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 13);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 13);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[32]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[33]).byteValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[38]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[21]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 11);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 11);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 13);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 13);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[32]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[33]).byteValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[38]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[21]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 11);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 11);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 13);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 13);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[32]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[33]).byteValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[38]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               return;
      }
   }

}

