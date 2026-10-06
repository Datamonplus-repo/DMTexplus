package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class talbdetwwexportcsv_impl extends GXWebProcedure
{
   public talbdetwwexportcsv_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public void webExecute( )
   {
      if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
      {
         gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", httpContext.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(httpContext.getHttpSecure( ))) ;
      }
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      entryPointCalled = false ;
      gxfirstwebparm = httpContext.GetNextPar( ) ;
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( toggleJsOutput )
      {
      }
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_SdtWWPContext1[0] = AV9WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext1) ;
      AV9WWPContext = GXv_SdtWWPContext1[0] ;
      /* Execute user subroutine: 'OPENDOCUMENT' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S201 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITECOLUMNTITLES' */
      S141 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITEDATA' */
      S161 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'CLOSEDOCUMENT' */
      S191 ();
      if ( returnInSub )
      {
      }
      if ( httpContext.willRedirect( ) )
      {
         httpContext.redirect( httpContext.wjLoc );
         httpContext.wjLoc = "" ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'OPENDOCUMENT' Routine */
      returnInSub = false ;
      AV13Random = (int)(GXutil.random( )*10000) ;
      AV11Filename = "./PrivateTempStorage/" + "TALBDETWWExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
      AV10TextFile.setSource( AV11Filename );
      AV10TextFile.create();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV10TextFile.openWrite("");
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
   }

   public void S131( )
   {
      /* 'LOADDYNAMICFILTERS' Routine */
      returnInSub = false ;
      if ( AV49GridState.getgxTv_SdtWWPGridState_Dynamicfilters().size() >= 1 )
      {
         AV47GridStateDynamicFilter = (app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)((app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)AV49GridState.getgxTv_SdtWWPGridState_Dynamicfilters().elementAt(-1+1));
         AV30DynamicFiltersSelector1 = AV47GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Selected() ;
         if ( GXutil.strcmp(AV30DynamicFiltersSelector1, "ALBREST") == 0 )
         {
            AV97AlbREst1 = (byte)(GXutil.lval( AV47GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value())) ;
         }
         if ( AV49GridState.getgxTv_SdtWWPGridState_Dynamicfilters().size() >= 2 )
         {
            AV35DynamicFiltersEnabled2 = true ;
            AV47GridStateDynamicFilter = (app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)((app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)AV49GridState.getgxTv_SdtWWPGridState_Dynamicfilters().elementAt(-1+2));
            AV36DynamicFiltersSelector2 = AV47GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Selected() ;
            if ( GXutil.strcmp(AV36DynamicFiltersSelector2, "ALBREST") == 0 )
            {
               AV99AlbREst2 = (byte)(GXutil.lval( AV47GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value())) ;
            }
            if ( AV49GridState.getgxTv_SdtWWPGridState_Dynamicfilters().size() >= 3 )
            {
               AV41DynamicFiltersEnabled3 = true ;
               AV47GridStateDynamicFilter = (app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)((app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)AV49GridState.getgxTv_SdtWWPGridState_Dynamicfilters().elementAt(-1+3));
               AV42DynamicFiltersSelector3 = AV47GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Selected() ;
               if ( GXutil.strcmp(AV42DynamicFiltersSelector3, "ALBREST") == 0 )
               {
                  AV101AlbREst3 = (byte)(GXutil.lval( AV47GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value())) ;
               }
            }
         }
      }
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV14TextFileLine = "" ;
      if ( GXutil.strcmp(AV19Session.getValue("TALBDETWWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("TALBDETWWColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "N Recepcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Albaran Entrega", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nº Albaran Entrega", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha Entrada", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Hora de entrada", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Codigo Referencia", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion Referencia", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Codigo Procedencia", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cod Transp", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Transportista", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Tipo Entrada", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Destino", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Unidades Entrada", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Unidad", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Piezas Entregadas", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Localizacion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Reclamacion?", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Piezas Utilizadas", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Unidades Utilizadas", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV112Talbdetwwds_1_filterfulltext = AV108FilterFullText ;
      AV113Talbdetwwds_2_dynamicfiltersselector1 = AV30DynamicFiltersSelector1 ;
      AV114Talbdetwwds_3_albrest1 = AV97AlbREst1 ;
      AV115Talbdetwwds_4_dynamicfiltersenabled2 = AV35DynamicFiltersEnabled2 ;
      AV116Talbdetwwds_5_dynamicfiltersselector2 = AV36DynamicFiltersSelector2 ;
      AV117Talbdetwwds_6_albrest2 = AV99AlbREst2 ;
      AV118Talbdetwwds_7_dynamicfiltersenabled3 = AV41DynamicFiltersEnabled3 ;
      AV119Talbdetwwds_8_dynamicfiltersselector3 = AV42DynamicFiltersSelector3 ;
      AV120Talbdetwwds_9_albrest3 = AV101AlbREst3 ;
      AV121Talbdetwwds_10_tfalbreccod = AV51TFAlbRecCod ;
      AV122Talbdetwwds_11_tfalbreccod_to = AV52TFAlbRecCod_To ;
      AV123Talbdetwwds_12_tfalbrent = AV53TFAlbREnt ;
      AV124Talbdetwwds_13_tfalbrent_sel = AV54TFAlbREnt_Sel ;
      AV125Talbdetwwds_14_tfalbrent2 = AV55TFAlbREnt2 ;
      AV126Talbdetwwds_15_tfalbrent2_sel = AV56TFAlbREnt2_Sel ;
      AV127Talbdetwwds_16_tfalbrfen = AV57TFAlbRFen ;
      AV128Talbdetwwds_17_tfalbrhen = AV59TFAlbRHEn ;
      AV129Talbdetwwds_18_tfclicod = AV61TFCliCod ;
      AV130Talbdetwwds_19_tfclicod_to = AV62TFCliCod_To ;
      AV131Talbdetwwds_20_tfclinom = AV63TFCliNom ;
      AV132Talbdetwwds_21_tfclinom_sel = AV64TFCliNom_Sel ;
      AV133Talbdetwwds_22_tfalbref = AV65TFAlbRef ;
      AV134Talbdetwwds_23_tfalbref_sel = AV66TFAlbRef_Sel ;
      AV135Talbdetwwds_24_tfalbrefdsc = AV67TFAlbRefDsc ;
      AV136Talbdetwwds_25_tfalbrefdsc_sel = AV68TFAlbRefDsc_Sel ;
      AV137Talbdetwwds_26_tfprocecod = AV69TFProceCod ;
      AV138Talbdetwwds_27_tfprocecod_to = AV70TFProceCod_To ;
      AV139Talbdetwwds_28_tfprocenom = AV71TFProceNom ;
      AV140Talbdetwwds_29_tfprocenom_sel = AV72TFProceNom_Sel ;
      AV141Talbdetwwds_30_tftrncod = AV73TFTrnCod ;
      AV142Talbdetwwds_31_tftrncod_to = AV74TFTrnCod_To ;
      AV143Talbdetwwds_32_tftrnnom = AV75TFTrnNom ;
      AV144Talbdetwwds_33_tftrnnom_sel = AV76TFTrnNom_Sel ;
      AV145Talbdetwwds_34_tftipentcod = AV77TFTipEntCod ;
      AV146Talbdetwwds_35_tftipentcod_to = AV78TFTipEntCod_To ;
      AV147Talbdetwwds_36_tftipentnom = AV79TFTipEntNom ;
      AV148Talbdetwwds_37_tftipentnom_sel = AV80TFTipEntNom_Sel ;
      AV149Talbdetwwds_38_tfalbrdes = AV81TFAlbRDes ;
      AV150Talbdetwwds_39_tfalbrdes_sel = AV82TFAlbRDes_Sel ;
      AV151Talbdetwwds_40_tfalbrunient = AV83TFAlbRUniEnt ;
      AV152Talbdetwwds_41_tfalbrunient_to = AV84TFAlbRUniEnt_To ;
      AV153Talbdetwwds_42_tfalbruni_sels = AV107TFAlbRUni_Sels ;
      AV154Talbdetwwds_43_tfalbrpieent = AV87TFAlbRPieEnt ;
      AV155Talbdetwwds_44_tfalbrpieent_to = AV88TFAlbRPieEnt_To ;
      AV156Talbdetwwds_45_tfalbrloc = AV89TFAlbRLoc ;
      AV157Talbdetwwds_46_tfalbrloc_sel = AV90TFAlbRLoc_Sel ;
      AV158Talbdetwwds_47_tfalbrreo_sels = AV92TFAlbRReo_Sels ;
      AV159Talbdetwwds_48_tfalbrpieuti = AV93TFAlbRPieUti ;
      AV160Talbdetwwds_49_tfalbrpieuti_to = AV94TFAlbRPieUti_To ;
      AV161Talbdetwwds_50_tfalbruniuti = AV95TFAlbRUniUti ;
      AV162Talbdetwwds_51_tfalbruniuti_to = AV96TFAlbRUniUti_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A56AlbRUni ,
                                           AV153Talbdetwwds_42_tfalbruni_sels ,
                                           A55AlbRReo ,
                                           AV158Talbdetwwds_47_tfalbrreo_sels ,
                                           AV113Talbdetwwds_2_dynamicfiltersselector1 ,
                                           Boolean.valueOf(AV115Talbdetwwds_4_dynamicfiltersenabled2) ,
                                           AV116Talbdetwwds_5_dynamicfiltersselector2 ,
                                           Boolean.valueOf(AV118Talbdetwwds_7_dynamicfiltersenabled3) ,
                                           AV119Talbdetwwds_8_dynamicfiltersselector3 ,
                                           Integer.valueOf(AV121Talbdetwwds_10_tfalbreccod) ,
                                           Integer.valueOf(AV122Talbdetwwds_11_tfalbreccod_to) ,
                                           AV124Talbdetwwds_13_tfalbrent_sel ,
                                           AV123Talbdetwwds_12_tfalbrent ,
                                           AV126Talbdetwwds_15_tfalbrent2_sel ,
                                           AV125Talbdetwwds_14_tfalbrent2 ,
                                           AV127Talbdetwwds_16_tfalbrfen ,
                                           AV128Talbdetwwds_17_tfalbrhen ,
                                           Integer.valueOf(AV129Talbdetwwds_18_tfclicod) ,
                                           Integer.valueOf(AV130Talbdetwwds_19_tfclicod_to) ,
                                           AV132Talbdetwwds_21_tfclinom_sel ,
                                           AV131Talbdetwwds_20_tfclinom ,
                                           AV134Talbdetwwds_23_tfalbref_sel ,
                                           AV133Talbdetwwds_22_tfalbref ,
                                           AV136Talbdetwwds_25_tfalbrefdsc_sel ,
                                           AV135Talbdetwwds_24_tfalbrefdsc ,
                                           Short.valueOf(AV137Talbdetwwds_26_tfprocecod) ,
                                           Short.valueOf(AV138Talbdetwwds_27_tfprocecod_to) ,
                                           AV140Talbdetwwds_29_tfprocenom_sel ,
                                           AV139Talbdetwwds_28_tfprocenom ,
                                           Short.valueOf(AV141Talbdetwwds_30_tftrncod) ,
                                           Short.valueOf(AV142Talbdetwwds_31_tftrncod_to) ,
                                           AV144Talbdetwwds_33_tftrnnom_sel ,
                                           AV143Talbdetwwds_32_tftrnnom ,
                                           Short.valueOf(AV145Talbdetwwds_34_tftipentcod) ,
                                           Short.valueOf(AV146Talbdetwwds_35_tftipentcod_to) ,
                                           AV148Talbdetwwds_37_tftipentnom_sel ,
                                           AV147Talbdetwwds_36_tftipentnom ,
                                           AV150Talbdetwwds_39_tfalbrdes_sel ,
                                           AV149Talbdetwwds_38_tfalbrdes ,
                                           AV151Talbdetwwds_40_tfalbrunient ,
                                           AV152Talbdetwwds_41_tfalbrunient_to ,
                                           Integer.valueOf(AV153Talbdetwwds_42_tfalbruni_sels.size()) ,
                                           Integer.valueOf(AV154Talbdetwwds_43_tfalbrpieent) ,
                                           Integer.valueOf(AV155Talbdetwwds_44_tfalbrpieent_to) ,
                                           AV157Talbdetwwds_46_tfalbrloc_sel ,
                                           AV156Talbdetwwds_45_tfalbrloc ,
                                           Integer.valueOf(AV158Talbdetwwds_47_tfalbrreo_sels.size()) ,
                                           Integer.valueOf(AV159Talbdetwwds_48_tfalbrpieuti) ,
                                           Integer.valueOf(AV160Talbdetwwds_49_tfalbrpieuti_to) ,
                                           AV161Talbdetwwds_50_tfalbruniuti ,
                                           AV162Talbdetwwds_51_tfalbruniuti_to ,
                                           Byte.valueOf(A47AlbREst) ,
                                           Byte.valueOf(AV114Talbdetwwds_3_albrest1) ,
                                           Byte.valueOf(AV117Talbdetwwds_6_albrest2) ,
                                           Byte.valueOf(AV120Talbdetwwds_9_albrest3) ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A46AlbREnt ,
                                           A5806AlbREnt2 ,
                                           A49AlbRFen ,
                                           A4606AlbRHEn ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A45AlbRef ,
                                           A3613AlbRefDsc ,
                                           Short.valueOf(A970ProceCod) ,
                                           A971ProceNom ,
                                           Short.valueOf(A840TrnCod) ,
                                           A841TrnNom ,
                                           Short.valueOf(A1211TipEntCod) ,
                                           A1212TipEntNom ,
                                           A1291AlbRDes ,
                                           A58AlbRUniEnt ,
                                           Integer.valueOf(A52AlbRPieEnt) ,
                                           A50AlbRLoc ,
                                           Integer.valueOf(A54AlbRPieUti) ,
                                           A60AlbRUniUti ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           AV112Talbdetwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV123Talbdetwwds_12_tfalbrent = GXutil.padr( GXutil.rtrim( AV123Talbdetwwds_12_tfalbrent), 8, "%") ;
      lV125Talbdetwwds_14_tfalbrent2 = GXutil.padr( GXutil.rtrim( AV125Talbdetwwds_14_tfalbrent2), 20, "%") ;
      lV131Talbdetwwds_20_tfclinom = GXutil.padr( GXutil.rtrim( AV131Talbdetwwds_20_tfclinom), 30, "%") ;
      lV133Talbdetwwds_22_tfalbref = GXutil.padr( GXutil.rtrim( AV133Talbdetwwds_22_tfalbref), 16, "%") ;
      lV135Talbdetwwds_24_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV135Talbdetwwds_24_tfalbrefdsc), 26, "%") ;
      lV139Talbdetwwds_28_tfprocenom = GXutil.padr( GXutil.rtrim( AV139Talbdetwwds_28_tfprocenom), 30, "%") ;
      lV143Talbdetwwds_32_tftrnnom = GXutil.padr( GXutil.rtrim( AV143Talbdetwwds_32_tftrnnom), 30, "%") ;
      lV147Talbdetwwds_36_tftipentnom = GXutil.padr( GXutil.rtrim( AV147Talbdetwwds_36_tftipentnom), 25, "%") ;
      lV149Talbdetwwds_38_tfalbrdes = GXutil.padr( GXutil.rtrim( AV149Talbdetwwds_38_tfalbrdes), 20, "%") ;
      lV156Talbdetwwds_45_tfalbrloc = GXutil.padr( GXutil.rtrim( AV156Talbdetwwds_45_tfalbrloc), 10, "%") ;
      /* Using cursor P085B2 */
      pr_default.execute(0, new Object[] {Byte.valueOf(AV114Talbdetwwds_3_albrest1), Byte.valueOf(AV114Talbdetwwds_3_albrest1), Byte.valueOf(AV117Talbdetwwds_6_albrest2), Byte.valueOf(AV117Talbdetwwds_6_albrest2), Byte.valueOf(AV120Talbdetwwds_9_albrest3), Byte.valueOf(AV120Talbdetwwds_9_albrest3), Integer.valueOf(AV121Talbdetwwds_10_tfalbreccod), Integer.valueOf(AV122Talbdetwwds_11_tfalbreccod_to), lV123Talbdetwwds_12_tfalbrent, AV124Talbdetwwds_13_tfalbrent_sel, lV125Talbdetwwds_14_tfalbrent2, AV126Talbdetwwds_15_tfalbrent2_sel, AV127Talbdetwwds_16_tfalbrfen, AV128Talbdetwwds_17_tfalbrhen, Integer.valueOf(AV129Talbdetwwds_18_tfclicod), Integer.valueOf(AV130Talbdetwwds_19_tfclicod_to), lV131Talbdetwwds_20_tfclinom, AV132Talbdetwwds_21_tfclinom_sel, lV133Talbdetwwds_22_tfalbref, AV134Talbdetwwds_23_tfalbref_sel, lV135Talbdetwwds_24_tfalbrefdsc, AV136Talbdetwwds_25_tfalbrefdsc_sel, Short.valueOf(AV137Talbdetwwds_26_tfprocecod), Short.valueOf(AV138Talbdetwwds_27_tfprocecod_to), lV139Talbdetwwds_28_tfprocenom, AV140Talbdetwwds_29_tfprocenom_sel, Short.valueOf(AV141Talbdetwwds_30_tftrncod), Short.valueOf(AV142Talbdetwwds_31_tftrncod_to), lV143Talbdetwwds_32_tftrnnom, AV144Talbdetwwds_33_tftrnnom_sel, Short.valueOf(AV145Talbdetwwds_34_tftipentcod), Short.valueOf(AV146Talbdetwwds_35_tftipentcod_to), lV147Talbdetwwds_36_tftipentnom, AV148Talbdetwwds_37_tftipentnom_sel, lV149Talbdetwwds_38_tfalbrdes, AV150Talbdetwwds_39_tfalbrdes_sel, AV151Talbdetwwds_40_tfalbrunient, AV152Talbdetwwds_41_tfalbrunient_to, Integer.valueOf(AV154Talbdetwwds_43_tfalbrpieent), Integer.valueOf(AV155Talbdetwwds_44_tfalbrpieent_to), lV156Talbdetwwds_45_tfalbrloc, AV157Talbdetwwds_46_tfalbrloc_sel, Integer.valueOf(AV159Talbdetwwds_48_tfalbrpieuti), Integer.valueOf(AV160Talbdetwwds_49_tfalbrpieuti_to), AV161Talbdetwwds_50_tfalbruniuti, AV162Talbdetwwds_51_tfalbruniuti_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P085B2_A396EmprCod[0] ;
         A60AlbRUniUti = P085B2_A60AlbRUniUti[0] ;
         A54AlbRPieUti = P085B2_A54AlbRPieUti[0] ;
         A50AlbRLoc = P085B2_A50AlbRLoc[0] ;
         A52AlbRPieEnt = P085B2_A52AlbRPieEnt[0] ;
         A58AlbRUniEnt = P085B2_A58AlbRUniEnt[0] ;
         A1291AlbRDes = P085B2_A1291AlbRDes[0] ;
         A1212TipEntNom = P085B2_A1212TipEntNom[0] ;
         n1212TipEntNom = P085B2_n1212TipEntNom[0] ;
         A1211TipEntCod = P085B2_A1211TipEntCod[0] ;
         n1211TipEntCod = P085B2_n1211TipEntCod[0] ;
         A841TrnNom = P085B2_A841TrnNom[0] ;
         n841TrnNom = P085B2_n841TrnNom[0] ;
         A840TrnCod = P085B2_A840TrnCod[0] ;
         n840TrnCod = P085B2_n840TrnCod[0] ;
         A971ProceNom = P085B2_A971ProceNom[0] ;
         n971ProceNom = P085B2_n971ProceNom[0] ;
         A970ProceCod = P085B2_A970ProceCod[0] ;
         n970ProceCod = P085B2_n970ProceCod[0] ;
         A3613AlbRefDsc = P085B2_A3613AlbRefDsc[0] ;
         A45AlbRef = P085B2_A45AlbRef[0] ;
         A279CliNom = P085B2_A279CliNom[0] ;
         A252CliCod = P085B2_A252CliCod[0] ;
         A4606AlbRHEn = P085B2_A4606AlbRHEn[0] ;
         n4606AlbRHEn = P085B2_n4606AlbRHEn[0] ;
         A49AlbRFen = P085B2_A49AlbRFen[0] ;
         A5806AlbREnt2 = P085B2_A5806AlbREnt2[0] ;
         A46AlbREnt = P085B2_A46AlbREnt[0] ;
         A44AlbRecCod = P085B2_A44AlbRecCod[0] ;
         A47AlbREst = P085B2_A47AlbREst[0] ;
         A55AlbRReo = P085B2_A55AlbRReo[0] ;
         A56AlbRUni = P085B2_A56AlbRUni[0] ;
         A1212TipEntNom = P085B2_A1212TipEntNom[0] ;
         n1212TipEntNom = P085B2_n1212TipEntNom[0] ;
         A841TrnNom = P085B2_A841TrnNom[0] ;
         n841TrnNom = P085B2_n841TrnNom[0] ;
         A971ProceNom = P085B2_A971ProceNom[0] ;
         n971ProceNom = P085B2_n971ProceNom[0] ;
         A279CliNom = P085B2_A279CliNom[0] ;
         if ( (GXutil.strcmp("", AV112Talbdetwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A44AlbRecCod, 8, 0) , GXutil.padr( "%" + AV112Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A46AlbREnt) , GXutil.padr( "%" + GXutil.upper( AV112Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5806AlbREnt2) , GXutil.padr( "%" + GXutil.upper( AV112Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV112Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV112Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A45AlbRef) , GXutil.padr( "%" + GXutil.upper( AV112Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3613AlbRefDsc) , GXutil.padr( "%" + GXutil.upper( AV112Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A970ProceCod, 4, 0) , GXutil.padr( "%" + AV112Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A971ProceNom) , GXutil.padr( "%" + GXutil.upper( AV112Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A840TrnCod, 4, 0) , GXutil.padr( "%" + AV112Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A841TrnNom) , GXutil.padr( "%" + GXutil.upper( AV112Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1211TipEntCod, 4, 0) , GXutil.padr( "%" + AV112Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1212TipEntNom) , GXutil.padr( "%" + GXutil.upper( AV112Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1291AlbRDes) , GXutil.padr( "%" + GXutil.upper( AV112Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A58AlbRUniEnt, 9, 2) , GXutil.padr( "%" + AV112Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "k", ""), "") , GXutil.padr( "%" + GXutil.lower( AV112Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "m", ""), "") , GXutil.padr( "%" + GXutil.lower( AV112Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A52AlbRPieEnt, 6, 0) , GXutil.padr( "%" + AV112Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A50AlbRLoc) , GXutil.padr( "%" + GXutil.upper( AV112Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "no", ""), "") , GXutil.padr( "%" + GXutil.lower( AV112Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "NO", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "si", ""), "") , GXutil.padr( "%" + GXutil.lower( AV112Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "SI", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A54AlbRPieUti, 6, 0) , GXutil.padr( "%" + AV112Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A60AlbRUniUti, 9, 2) , GXutil.padr( "%" + AV112Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            AV14TextFileLine = "" ;
            /* Execute user subroutine: 'BEFOREWRITELINE' */
            S172 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               returnInSub = true;
               if (true) return;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A44AlbRecCod, 8, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A46AlbREnt, ";", ","), GXv_char3) ;
               talbdetwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A5806AlbREnt2, ";", ","), GXv_char3) ;
               talbdetwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += localUtil.dtoc( A49AlbRFen, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += localUtil.ttoc( A4606AlbRHEn, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A252CliCod, 6, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A279CliNom, ";", ","), GXv_char3) ;
               talbdetwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A45AlbRef, ";", ","), GXv_char3) ;
               talbdetwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A3613AlbRefDsc, ";", ","), GXv_char3) ;
               talbdetwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A970ProceCod, 4, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A971ProceNom, ";", ","), GXv_char3) ;
               talbdetwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A840TrnCod, 4, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A841TrnNom, ";", ","), GXv_char3) ;
               talbdetwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A1211TipEntCod, 4, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A1212TipEntNom, ";", ","), GXv_char3) ;
               talbdetwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A1291AlbRDes, ";", ","), GXv_char3) ;
               talbdetwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A58AlbRUniEnt, 9, 2) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               if ( GXutil.strcmp(GXutil.trim( A56AlbRUni), "K") == 0 )
               {
                  AV14TextFileLine += httpContext.getMessage( "K", "") ;
               }
               else if ( GXutil.strcmp(GXutil.trim( A56AlbRUni), "M") == 0 )
               {
                  AV14TextFileLine += httpContext.getMessage( "M", "") ;
               }
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A52AlbRPieEnt, 6, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A50AlbRLoc, ";", ","), GXv_char3) ;
               talbdetwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               if ( GXutil.strcmp(GXutil.trim( A55AlbRReo), "NO") == 0 )
               {
                  AV14TextFileLine += httpContext.getMessage( "NO", "") ;
               }
               else if ( GXutil.strcmp(GXutil.trim( A55AlbRReo), "SI") == 0 )
               {
                  AV14TextFileLine += httpContext.getMessage( "SI", "") ;
               }
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A54AlbRPieUti, 6, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A60AlbRUniUti, 9, 2) ;
            }
            /* Execute user subroutine: 'AFTERWRITELINE' */
            S182 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               returnInSub = true;
               if (true) return;
            }
            if ( GXutil.len( AV14TextFileLine) > 0 )
            {
               AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S191( )
   {
      /* 'CLOSEDOCUMENT' Routine */
      returnInSub = false ;
      AV10TextFile.close();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      if ( AV10TextFile.getErrCode() == 0 )
      {
         if ( ! httpContext.isAjaxRequest( ) )
         {
            AV27HttpResponse.addHeader("Content-Type", "text/csv");
         }
         if ( ! httpContext.isAjaxRequest( ) )
         {
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=TALBDETWWExportCSV.csv");
         }
         AV27HttpResponse.addFile(AV10TextFile.getAbsoluteName());
      }
   }

   public void S121( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV10TextFile.getErrCode() != 0 )
      {
         AV11Filename = "" ;
         AV12ErrorMessage = AV10TextFile.getErrDescription() ;
         AV10TextFile.close();
         AV27HttpResponse.addString(AV12ErrorMessage);
         httpContext.nUserReturn = (byte)(1) ;
         if ( httpContext.willRedirect( ) )
         {
            httpContext.redirect( httpContext.wjLoc );
            httpContext.wjLoc = "" ;
         }
         returnInSub = true;
         if (true) return;
      }
   }

   public void S151( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV15ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbRecCod", "", "N Recepcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbREnt", "", "Albaran Entrega", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbREnt2", "", "Nº Albaran Entrega", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbRFen", "", "Fecha Entrada", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbRHEn", "", "Hora de entrada", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CliCod", "", "Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CliNom", "", "Nombre Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbRef", "", "Codigo Referencia", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbRefDsc", "", "Descripcion Referencia", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ProceCod", "", "Codigo Procedencia", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ProceNom", "", "Nombre", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "TrnCod", "", "Cod Transp", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "TrnNom", "", "Transportista", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "TipEntCod", "", "Tipo Entrada", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "TipEntNom", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbRDes", "", "Destino", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbRUniEnt", "", "Unidades Entrada", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbRUni", "", "Unidad", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbRPieEnt", "", "Piezas Entregadas", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbRLoc", "", "Localizacion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbRReo", "", "Reclamacion?", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbRPieUti", "", "Piezas Utilizadas", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbRUniUti", "", "Unidades Utilizadas", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TALBDETWWColumnsSelector", GXv_char3) ;
      talbdetwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
      AV20UserCustomValue = GXt_char2 ;
      if ( ! ( (GXutil.strcmp("", AV20UserCustomValue)==0) ) )
      {
         AV16ColumnsSelectorAux.fromxml(AV20UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector4[0] = AV16ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector5[0] = AV15ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, GXv_SdtWWPColumnsSelector5) ;
         AV16ColumnsSelectorAux = GXv_SdtWWPColumnsSelector4[0] ;
         AV15ColumnsSelector = GXv_SdtWWPColumnsSelector5[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("TALBDETWWGridState"), "") == 0 )
      {
         AV49GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TALBDETWWGridState"), null, null);
      }
      else
      {
         AV49GridState.fromxml(AV19Session.getValue("TALBDETWWGridState"), null, null);
      }
      AV28OrderedBy = AV49GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV49GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV163GXV1 = 1 ;
      while ( AV163GXV1 <= AV49GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV50GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV49GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV163GXV1));
         if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV108FilterFullText = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRECCOD") == 0 )
         {
            AV51TFAlbRecCod = (int)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV52TFAlbRecCod_To = (int)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRENT") == 0 )
         {
            AV53TFAlbREnt = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRENT_SEL") == 0 )
         {
            AV54TFAlbREnt_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRENT2") == 0 )
         {
            AV55TFAlbREnt2 = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRENT2_SEL") == 0 )
         {
            AV56TFAlbREnt2_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRFEN") == 0 )
         {
            AV57TFAlbRFen = localUtil.ctod( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRHEN") == 0 )
         {
            AV59TFAlbRHEn = localUtil.ctot( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV61TFCliCod = (int)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV62TFCliCod_To = (int)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV63TFCliNom = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV64TFCliNom_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF") == 0 )
         {
            AV65TFAlbRef = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF_SEL") == 0 )
         {
            AV66TFAlbRef_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREFDSC") == 0 )
         {
            AV67TFAlbRefDsc = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREFDSC_SEL") == 0 )
         {
            AV68TFAlbRefDsc_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCECOD") == 0 )
         {
            AV69TFProceCod = (short)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV70TFProceCod_To = (short)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCENOM") == 0 )
         {
            AV71TFProceNom = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCENOM_SEL") == 0 )
         {
            AV72TFProceNom_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNCOD") == 0 )
         {
            AV73TFTrnCod = (short)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV74TFTrnCod_To = (short)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNNOM") == 0 )
         {
            AV75TFTrnNom = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNNOM_SEL") == 0 )
         {
            AV76TFTrnNom_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPENTCOD") == 0 )
         {
            AV77TFTipEntCod = (short)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV78TFTipEntCod_To = (short)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPENTNOM") == 0 )
         {
            AV79TFTipEntNom = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPENTNOM_SEL") == 0 )
         {
            AV80TFTipEntNom_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRDES") == 0 )
         {
            AV81TFAlbRDes = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRDES_SEL") == 0 )
         {
            AV82TFAlbRDes_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNIENT") == 0 )
         {
            AV83TFAlbRUniEnt = CommonUtil.decimalVal( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV84TFAlbRUniEnt_To = CommonUtil.decimalVal( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNI_SEL") == 0 )
         {
            AV106TFAlbRUni_SelsJson = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV107TFAlbRUni_Sels.fromJSonString(AV106TFAlbRUni_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRPIEENT") == 0 )
         {
            AV87TFAlbRPieEnt = (int)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV88TFAlbRPieEnt_To = (int)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRLOC") == 0 )
         {
            AV89TFAlbRLoc = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRLOC_SEL") == 0 )
         {
            AV90TFAlbRLoc_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRREO_SEL") == 0 )
         {
            AV91TFAlbRReo_SelsJson = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV92TFAlbRReo_Sels.fromJSonString(AV91TFAlbRReo_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRPIEUTI") == 0 )
         {
            AV93TFAlbRPieUti = (int)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV94TFAlbRPieUti_To = (int)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNIUTI") == 0 )
         {
            AV95TFAlbRUniUti = CommonUtil.decimalVal( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV96TFAlbRUniUti_To = CommonUtil.decimalVal( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         AV163GXV1 = (int)(AV163GXV1+1) ;
      }
      /* Execute user subroutine: 'LOADDYNAMICFILTERS' */
      S131 ();
      if (returnInSub) return;
   }

   public void S172( )
   {
      /* 'BEFOREWRITELINE' Routine */
      returnInSub = false ;
   }

   public void S182( )
   {
      /* 'AFTERWRITELINE' Routine */
      returnInSub = false ;
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      super.cleanup();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXKey = "" ;
      gxfirstwebparm = "" ;
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV11Filename = "" ;
      AV10TextFile = new com.genexus.util.GXFile();
      AV49GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV47GridStateDynamicFilter = new app.wwpbaseobjects.SdtWWPGridState_DynamicFilter(remoteHandle, context);
      AV30DynamicFiltersSelector1 = "" ;
      AV36DynamicFiltersSelector2 = "" ;
      AV42DynamicFiltersSelector3 = "" ;
      AV14TextFileLine = "" ;
      AV19Session = httpContext.getWebSession();
      AV18ColumnsSelectorXML = "" ;
      AV15ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      A46AlbREnt = "" ;
      A5806AlbREnt2 = "" ;
      A49AlbRFen = GXutil.nullDate() ;
      A4606AlbRHEn = GXutil.resetTime( GXutil.nullDate() );
      A279CliNom = "" ;
      A45AlbRef = "" ;
      A3613AlbRefDsc = "" ;
      A971ProceNom = "" ;
      A841TrnNom = "" ;
      A1212TipEntNom = "" ;
      A1291AlbRDes = "" ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A56AlbRUni = "" ;
      A50AlbRLoc = "" ;
      A55AlbRReo = "" ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      AV112Talbdetwwds_1_filterfulltext = "" ;
      AV108FilterFullText = "" ;
      AV113Talbdetwwds_2_dynamicfiltersselector1 = "" ;
      AV116Talbdetwwds_5_dynamicfiltersselector2 = "" ;
      AV119Talbdetwwds_8_dynamicfiltersselector3 = "" ;
      AV123Talbdetwwds_12_tfalbrent = "" ;
      AV53TFAlbREnt = "" ;
      AV124Talbdetwwds_13_tfalbrent_sel = "" ;
      AV54TFAlbREnt_Sel = "" ;
      AV125Talbdetwwds_14_tfalbrent2 = "" ;
      AV55TFAlbREnt2 = "" ;
      AV126Talbdetwwds_15_tfalbrent2_sel = "" ;
      AV56TFAlbREnt2_Sel = "" ;
      AV127Talbdetwwds_16_tfalbrfen = GXutil.nullDate() ;
      AV57TFAlbRFen = GXutil.nullDate() ;
      AV128Talbdetwwds_17_tfalbrhen = GXutil.resetTime( GXutil.nullDate() );
      AV59TFAlbRHEn = GXutil.resetTime( GXutil.nullDate() );
      AV131Talbdetwwds_20_tfclinom = "" ;
      AV63TFCliNom = "" ;
      AV132Talbdetwwds_21_tfclinom_sel = "" ;
      AV64TFCliNom_Sel = "" ;
      AV133Talbdetwwds_22_tfalbref = "" ;
      AV65TFAlbRef = "" ;
      AV134Talbdetwwds_23_tfalbref_sel = "" ;
      AV66TFAlbRef_Sel = "" ;
      AV135Talbdetwwds_24_tfalbrefdsc = "" ;
      AV67TFAlbRefDsc = "" ;
      AV136Talbdetwwds_25_tfalbrefdsc_sel = "" ;
      AV68TFAlbRefDsc_Sel = "" ;
      AV139Talbdetwwds_28_tfprocenom = "" ;
      AV71TFProceNom = "" ;
      AV140Talbdetwwds_29_tfprocenom_sel = "" ;
      AV72TFProceNom_Sel = "" ;
      AV143Talbdetwwds_32_tftrnnom = "" ;
      AV75TFTrnNom = "" ;
      AV144Talbdetwwds_33_tftrnnom_sel = "" ;
      AV76TFTrnNom_Sel = "" ;
      AV147Talbdetwwds_36_tftipentnom = "" ;
      AV79TFTipEntNom = "" ;
      AV148Talbdetwwds_37_tftipentnom_sel = "" ;
      AV80TFTipEntNom_Sel = "" ;
      AV149Talbdetwwds_38_tfalbrdes = "" ;
      AV81TFAlbRDes = "" ;
      AV150Talbdetwwds_39_tfalbrdes_sel = "" ;
      AV82TFAlbRDes_Sel = "" ;
      AV151Talbdetwwds_40_tfalbrunient = DecimalUtil.ZERO ;
      AV83TFAlbRUniEnt = DecimalUtil.ZERO ;
      AV152Talbdetwwds_41_tfalbrunient_to = DecimalUtil.ZERO ;
      AV84TFAlbRUniEnt_To = DecimalUtil.ZERO ;
      AV153Talbdetwwds_42_tfalbruni_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV107TFAlbRUni_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV156Talbdetwwds_45_tfalbrloc = "" ;
      AV89TFAlbRLoc = "" ;
      AV157Talbdetwwds_46_tfalbrloc_sel = "" ;
      AV90TFAlbRLoc_Sel = "" ;
      AV158Talbdetwwds_47_tfalbrreo_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV92TFAlbRReo_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV161Talbdetwwds_50_tfalbruniuti = DecimalUtil.ZERO ;
      AV95TFAlbRUniUti = DecimalUtil.ZERO ;
      AV162Talbdetwwds_51_tfalbruniuti_to = DecimalUtil.ZERO ;
      AV96TFAlbRUniUti_To = DecimalUtil.ZERO ;
      lV112Talbdetwwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV123Talbdetwwds_12_tfalbrent = "" ;
      lV125Talbdetwwds_14_tfalbrent2 = "" ;
      lV131Talbdetwwds_20_tfclinom = "" ;
      lV133Talbdetwwds_22_tfalbref = "" ;
      lV135Talbdetwwds_24_tfalbrefdsc = "" ;
      lV139Talbdetwwds_28_tfprocenom = "" ;
      lV143Talbdetwwds_32_tftrnnom = "" ;
      lV147Talbdetwwds_36_tftipentnom = "" ;
      lV149Talbdetwwds_38_tfalbrdes = "" ;
      lV156Talbdetwwds_45_tfalbrloc = "" ;
      P085B2_A396EmprCod = new String[] {""} ;
      P085B2_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P085B2_A54AlbRPieUti = new int[1] ;
      P085B2_A50AlbRLoc = new String[] {""} ;
      P085B2_A52AlbRPieEnt = new int[1] ;
      P085B2_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P085B2_A1291AlbRDes = new String[] {""} ;
      P085B2_A1212TipEntNom = new String[] {""} ;
      P085B2_n1212TipEntNom = new boolean[] {false} ;
      P085B2_A1211TipEntCod = new short[1] ;
      P085B2_n1211TipEntCod = new boolean[] {false} ;
      P085B2_A841TrnNom = new String[] {""} ;
      P085B2_n841TrnNom = new boolean[] {false} ;
      P085B2_A840TrnCod = new short[1] ;
      P085B2_n840TrnCod = new boolean[] {false} ;
      P085B2_A971ProceNom = new String[] {""} ;
      P085B2_n971ProceNom = new boolean[] {false} ;
      P085B2_A970ProceCod = new short[1] ;
      P085B2_n970ProceCod = new boolean[] {false} ;
      P085B2_A3613AlbRefDsc = new String[] {""} ;
      P085B2_A45AlbRef = new String[] {""} ;
      P085B2_A279CliNom = new String[] {""} ;
      P085B2_A252CliCod = new int[1] ;
      P085B2_A4606AlbRHEn = new java.util.Date[] {GXutil.nullDate()} ;
      P085B2_n4606AlbRHEn = new boolean[] {false} ;
      P085B2_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P085B2_A5806AlbREnt2 = new String[] {""} ;
      P085B2_A46AlbREnt = new String[] {""} ;
      P085B2_A44AlbRecCod = new int[1] ;
      P085B2_A47AlbREst = new byte[1] ;
      P085B2_A55AlbRReo = new String[] {""} ;
      P085B2_A56AlbRUni = new String[] {""} ;
      A396EmprCod = "" ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV50GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV106TFAlbRUni_SelsJson = "" ;
      AV91TFAlbRReo_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.talbdetwwexportcsv__default(),
         new Object[] {
             new Object[] {
            P085B2_A396EmprCod, P085B2_A60AlbRUniUti, P085B2_A54AlbRPieUti, P085B2_A50AlbRLoc, P085B2_A52AlbRPieEnt, P085B2_A58AlbRUniEnt, P085B2_A1291AlbRDes, P085B2_A1212TipEntNom, P085B2_n1212TipEntNom, P085B2_A1211TipEntCod,
            P085B2_n1211TipEntCod, P085B2_A841TrnNom, P085B2_n841TrnNom, P085B2_A840TrnCod, P085B2_n840TrnCod, P085B2_A971ProceNom, P085B2_n971ProceNom, P085B2_A970ProceCod, P085B2_n970ProceCod, P085B2_A3613AlbRefDsc,
            P085B2_A45AlbRef, P085B2_A279CliNom, P085B2_A252CliCod, P085B2_A4606AlbRHEn, P085B2_n4606AlbRHEn, P085B2_A49AlbRFen, P085B2_A5806AlbREnt2, P085B2_A46AlbREnt, P085B2_A44AlbRecCod, P085B2_A47AlbREst,
            P085B2_A55AlbRReo, P085B2_A56AlbRUni
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV97AlbREst1 ;
   private byte AV99AlbREst2 ;
   private byte AV101AlbREst3 ;
   private byte AV114Talbdetwwds_3_albrest1 ;
   private byte AV117Talbdetwwds_6_albrest2 ;
   private byte AV120Talbdetwwds_9_albrest3 ;
   private byte A47AlbREst ;
   private short gxcookieaux ;
   private short A970ProceCod ;
   private short A840TrnCod ;
   private short A1211TipEntCod ;
   private short AV137Talbdetwwds_26_tfprocecod ;
   private short AV69TFProceCod ;
   private short AV138Talbdetwwds_27_tfprocecod_to ;
   private short AV70TFProceCod_To ;
   private short AV141Talbdetwwds_30_tftrncod ;
   private short AV73TFTrnCod ;
   private short AV142Talbdetwwds_31_tftrncod_to ;
   private short AV74TFTrnCod_To ;
   private short AV145Talbdetwwds_34_tftipentcod ;
   private short AV77TFTipEntCod ;
   private short AV146Talbdetwwds_35_tftipentcod_to ;
   private short AV78TFTipEntCod_To ;
   private short AV28OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int A44AlbRecCod ;
   private int A252CliCod ;
   private int A52AlbRPieEnt ;
   private int A54AlbRPieUti ;
   private int AV121Talbdetwwds_10_tfalbreccod ;
   private int AV51TFAlbRecCod ;
   private int AV122Talbdetwwds_11_tfalbreccod_to ;
   private int AV52TFAlbRecCod_To ;
   private int AV129Talbdetwwds_18_tfclicod ;
   private int AV61TFCliCod ;
   private int AV130Talbdetwwds_19_tfclicod_to ;
   private int AV62TFCliCod_To ;
   private int AV154Talbdetwwds_43_tfalbrpieent ;
   private int AV87TFAlbRPieEnt ;
   private int AV155Talbdetwwds_44_tfalbrpieent_to ;
   private int AV88TFAlbRPieEnt_To ;
   private int AV159Talbdetwwds_48_tfalbrpieuti ;
   private int AV93TFAlbRPieUti ;
   private int AV160Talbdetwwds_49_tfalbrpieuti_to ;
   private int AV94TFAlbRPieUti_To ;
   private int AV153Talbdetwwds_42_tfalbruni_sels_size ;
   private int AV158Talbdetwwds_47_tfalbrreo_sels_size ;
   private int AV163GXV1 ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal AV151Talbdetwwds_40_tfalbrunient ;
   private java.math.BigDecimal AV83TFAlbRUniEnt ;
   private java.math.BigDecimal AV152Talbdetwwds_41_tfalbrunient_to ;
   private java.math.BigDecimal AV84TFAlbRUniEnt_To ;
   private java.math.BigDecimal AV161Talbdetwwds_50_tfalbruniuti ;
   private java.math.BigDecimal AV95TFAlbRUniUti ;
   private java.math.BigDecimal AV162Talbdetwwds_51_tfalbruniuti_to ;
   private java.math.BigDecimal AV96TFAlbRUniUti_To ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A46AlbREnt ;
   private String A5806AlbREnt2 ;
   private String A279CliNom ;
   private String A45AlbRef ;
   private String A3613AlbRefDsc ;
   private String A971ProceNom ;
   private String A841TrnNom ;
   private String A1212TipEntNom ;
   private String A1291AlbRDes ;
   private String A56AlbRUni ;
   private String A50AlbRLoc ;
   private String A55AlbRReo ;
   private String AV123Talbdetwwds_12_tfalbrent ;
   private String AV53TFAlbREnt ;
   private String AV124Talbdetwwds_13_tfalbrent_sel ;
   private String AV54TFAlbREnt_Sel ;
   private String AV125Talbdetwwds_14_tfalbrent2 ;
   private String AV55TFAlbREnt2 ;
   private String AV126Talbdetwwds_15_tfalbrent2_sel ;
   private String AV56TFAlbREnt2_Sel ;
   private String AV131Talbdetwwds_20_tfclinom ;
   private String AV63TFCliNom ;
   private String AV132Talbdetwwds_21_tfclinom_sel ;
   private String AV64TFCliNom_Sel ;
   private String AV133Talbdetwwds_22_tfalbref ;
   private String AV65TFAlbRef ;
   private String AV134Talbdetwwds_23_tfalbref_sel ;
   private String AV66TFAlbRef_Sel ;
   private String AV135Talbdetwwds_24_tfalbrefdsc ;
   private String AV67TFAlbRefDsc ;
   private String AV136Talbdetwwds_25_tfalbrefdsc_sel ;
   private String AV68TFAlbRefDsc_Sel ;
   private String AV139Talbdetwwds_28_tfprocenom ;
   private String AV71TFProceNom ;
   private String AV140Talbdetwwds_29_tfprocenom_sel ;
   private String AV72TFProceNom_Sel ;
   private String AV143Talbdetwwds_32_tftrnnom ;
   private String AV75TFTrnNom ;
   private String AV144Talbdetwwds_33_tftrnnom_sel ;
   private String AV76TFTrnNom_Sel ;
   private String AV147Talbdetwwds_36_tftipentnom ;
   private String AV79TFTipEntNom ;
   private String AV148Talbdetwwds_37_tftipentnom_sel ;
   private String AV80TFTipEntNom_Sel ;
   private String AV149Talbdetwwds_38_tfalbrdes ;
   private String AV81TFAlbRDes ;
   private String AV150Talbdetwwds_39_tfalbrdes_sel ;
   private String AV82TFAlbRDes_Sel ;
   private String AV156Talbdetwwds_45_tfalbrloc ;
   private String AV89TFAlbRLoc ;
   private String AV157Talbdetwwds_46_tfalbrloc_sel ;
   private String AV90TFAlbRLoc_Sel ;
   private String scmdbuf ;
   private String lV123Talbdetwwds_12_tfalbrent ;
   private String lV125Talbdetwwds_14_tfalbrent2 ;
   private String lV131Talbdetwwds_20_tfclinom ;
   private String lV133Talbdetwwds_22_tfalbref ;
   private String lV135Talbdetwwds_24_tfalbrefdsc ;
   private String lV139Talbdetwwds_28_tfprocenom ;
   private String lV143Talbdetwwds_32_tftrnnom ;
   private String lV147Talbdetwwds_36_tftipentnom ;
   private String lV149Talbdetwwds_38_tfalbrdes ;
   private String lV156Talbdetwwds_45_tfalbrloc ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date A4606AlbRHEn ;
   private java.util.Date AV128Talbdetwwds_17_tfalbrhen ;
   private java.util.Date AV59TFAlbRHEn ;
   private java.util.Date A49AlbRFen ;
   private java.util.Date AV127Talbdetwwds_16_tfalbrfen ;
   private java.util.Date AV57TFAlbRFen ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV35DynamicFiltersEnabled2 ;
   private boolean AV41DynamicFiltersEnabled3 ;
   private boolean AV115Talbdetwwds_4_dynamicfiltersenabled2 ;
   private boolean AV118Talbdetwwds_7_dynamicfiltersenabled3 ;
   private boolean AV29OrderedDsc ;
   private boolean n1212TipEntNom ;
   private boolean n1211TipEntCod ;
   private boolean n841TrnNom ;
   private boolean n840TrnCod ;
   private boolean n971ProceNom ;
   private boolean n970ProceCod ;
   private boolean n4606AlbRHEn ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV106TFAlbRUni_SelsJson ;
   private String AV91TFAlbRReo_SelsJson ;
   private String AV11Filename ;
   private String AV30DynamicFiltersSelector1 ;
   private String AV36DynamicFiltersSelector2 ;
   private String AV42DynamicFiltersSelector3 ;
   private String AV112Talbdetwwds_1_filterfulltext ;
   private String AV108FilterFullText ;
   private String AV113Talbdetwwds_2_dynamicfiltersselector1 ;
   private String AV116Talbdetwwds_5_dynamicfiltersselector2 ;
   private String AV119Talbdetwwds_8_dynamicfiltersselector3 ;
   private String lV112Talbdetwwds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P085B2_A396EmprCod ;
   private java.math.BigDecimal[] P085B2_A60AlbRUniUti ;
   private int[] P085B2_A54AlbRPieUti ;
   private String[] P085B2_A50AlbRLoc ;
   private int[] P085B2_A52AlbRPieEnt ;
   private java.math.BigDecimal[] P085B2_A58AlbRUniEnt ;
   private String[] P085B2_A1291AlbRDes ;
   private String[] P085B2_A1212TipEntNom ;
   private boolean[] P085B2_n1212TipEntNom ;
   private short[] P085B2_A1211TipEntCod ;
   private boolean[] P085B2_n1211TipEntCod ;
   private String[] P085B2_A841TrnNom ;
   private boolean[] P085B2_n841TrnNom ;
   private short[] P085B2_A840TrnCod ;
   private boolean[] P085B2_n840TrnCod ;
   private String[] P085B2_A971ProceNom ;
   private boolean[] P085B2_n971ProceNom ;
   private short[] P085B2_A970ProceCod ;
   private boolean[] P085B2_n970ProceCod ;
   private String[] P085B2_A3613AlbRefDsc ;
   private String[] P085B2_A45AlbRef ;
   private String[] P085B2_A279CliNom ;
   private int[] P085B2_A252CliCod ;
   private java.util.Date[] P085B2_A4606AlbRHEn ;
   private boolean[] P085B2_n4606AlbRHEn ;
   private java.util.Date[] P085B2_A49AlbRFen ;
   private String[] P085B2_A5806AlbREnt2 ;
   private String[] P085B2_A46AlbREnt ;
   private int[] P085B2_A44AlbRecCod ;
   private byte[] P085B2_A47AlbREst ;
   private String[] P085B2_A55AlbRReo ;
   private String[] P085B2_A56AlbRUni ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private GXSimpleCollection<String> AV153Talbdetwwds_42_tfalbruni_sels ;
   private GXSimpleCollection<String> AV107TFAlbRUni_Sels ;
   private GXSimpleCollection<String> AV158Talbdetwwds_47_tfalbrreo_sels ;
   private GXSimpleCollection<String> AV92TFAlbRReo_Sels ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV49GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV50GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPGridState_DynamicFilter AV47GridStateDynamicFilter ;
}

final  class talbdetwwexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P085B2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV153Talbdetwwds_42_tfalbruni_sels ,
                                          String A55AlbRReo ,
                                          GXSimpleCollection<String> AV158Talbdetwwds_47_tfalbrreo_sels ,
                                          String AV113Talbdetwwds_2_dynamicfiltersselector1 ,
                                          boolean AV115Talbdetwwds_4_dynamicfiltersenabled2 ,
                                          String AV116Talbdetwwds_5_dynamicfiltersselector2 ,
                                          boolean AV118Talbdetwwds_7_dynamicfiltersenabled3 ,
                                          String AV119Talbdetwwds_8_dynamicfiltersselector3 ,
                                          int AV121Talbdetwwds_10_tfalbreccod ,
                                          int AV122Talbdetwwds_11_tfalbreccod_to ,
                                          String AV124Talbdetwwds_13_tfalbrent_sel ,
                                          String AV123Talbdetwwds_12_tfalbrent ,
                                          String AV126Talbdetwwds_15_tfalbrent2_sel ,
                                          String AV125Talbdetwwds_14_tfalbrent2 ,
                                          java.util.Date AV127Talbdetwwds_16_tfalbrfen ,
                                          java.util.Date AV128Talbdetwwds_17_tfalbrhen ,
                                          int AV129Talbdetwwds_18_tfclicod ,
                                          int AV130Talbdetwwds_19_tfclicod_to ,
                                          String AV132Talbdetwwds_21_tfclinom_sel ,
                                          String AV131Talbdetwwds_20_tfclinom ,
                                          String AV134Talbdetwwds_23_tfalbref_sel ,
                                          String AV133Talbdetwwds_22_tfalbref ,
                                          String AV136Talbdetwwds_25_tfalbrefdsc_sel ,
                                          String AV135Talbdetwwds_24_tfalbrefdsc ,
                                          short AV137Talbdetwwds_26_tfprocecod ,
                                          short AV138Talbdetwwds_27_tfprocecod_to ,
                                          String AV140Talbdetwwds_29_tfprocenom_sel ,
                                          String AV139Talbdetwwds_28_tfprocenom ,
                                          short AV141Talbdetwwds_30_tftrncod ,
                                          short AV142Talbdetwwds_31_tftrncod_to ,
                                          String AV144Talbdetwwds_33_tftrnnom_sel ,
                                          String AV143Talbdetwwds_32_tftrnnom ,
                                          short AV145Talbdetwwds_34_tftipentcod ,
                                          short AV146Talbdetwwds_35_tftipentcod_to ,
                                          String AV148Talbdetwwds_37_tftipentnom_sel ,
                                          String AV147Talbdetwwds_36_tftipentnom ,
                                          String AV150Talbdetwwds_39_tfalbrdes_sel ,
                                          String AV149Talbdetwwds_38_tfalbrdes ,
                                          java.math.BigDecimal AV151Talbdetwwds_40_tfalbrunient ,
                                          java.math.BigDecimal AV152Talbdetwwds_41_tfalbrunient_to ,
                                          int AV153Talbdetwwds_42_tfalbruni_sels_size ,
                                          int AV154Talbdetwwds_43_tfalbrpieent ,
                                          int AV155Talbdetwwds_44_tfalbrpieent_to ,
                                          String AV157Talbdetwwds_46_tfalbrloc_sel ,
                                          String AV156Talbdetwwds_45_tfalbrloc ,
                                          int AV158Talbdetwwds_47_tfalbrreo_sels_size ,
                                          int AV159Talbdetwwds_48_tfalbrpieuti ,
                                          int AV160Talbdetwwds_49_tfalbrpieuti_to ,
                                          java.math.BigDecimal AV161Talbdetwwds_50_tfalbruniuti ,
                                          java.math.BigDecimal AV162Talbdetwwds_51_tfalbruniuti_to ,
                                          byte A47AlbREst ,
                                          byte AV114Talbdetwwds_3_albrest1 ,
                                          byte AV117Talbdetwwds_6_albrest2 ,
                                          byte AV120Talbdetwwds_9_albrest3 ,
                                          int A44AlbRecCod ,
                                          String A46AlbREnt ,
                                          String A5806AlbREnt2 ,
                                          java.util.Date A49AlbRFen ,
                                          java.util.Date A4606AlbRHEn ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A45AlbRef ,
                                          String A3613AlbRefDsc ,
                                          short A970ProceCod ,
                                          String A971ProceNom ,
                                          short A840TrnCod ,
                                          String A841TrnNom ,
                                          short A1211TipEntCod ,
                                          String A1212TipEntNom ,
                                          String A1291AlbRDes ,
                                          java.math.BigDecimal A58AlbRUniEnt ,
                                          int A52AlbRPieEnt ,
                                          String A50AlbRLoc ,
                                          int A54AlbRPieUti ,
                                          java.math.BigDecimal A60AlbRUniUti ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String AV112Talbdetwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[46];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.AlbRUniUti, T1.AlbRPieUti, T1.AlbRLoc, T1.AlbRPieEnt, T1.AlbRUniEnt, T1.AlbRDes, T2.TipEntNom, T1.TipEntCod, T3.TrnNom, T1.TrnCod, T4.ProceNom," ;
      scmdbuf += " T1.ProceCod, T1.AlbRefDsc, T1.AlbRef, T5.CliNom, T1.CliCod, T1.AlbRHEn, T1.AlbRFen, T1.AlbREnt2, T1.AlbREnt, T1.AlbRecCod, T1.AlbREst, T1.AlbRReo, T1.AlbRUni FROM" ;
      scmdbuf += " ((((TXPALBREC T1 LEFT JOIN TXPENTRAD T2 ON T2.EmprCod = T1.EmprCod AND T2.TipEntCod = T1.TipEntCod) LEFT JOIN TXPTRANSP T3 ON T3.EmprCod = T1.EmprCod AND T3.TrnCod" ;
      scmdbuf += " = T1.TrnCod) LEFT JOIN TXPPROCED T4 ON T4.EmprCod = T1.EmprCod AND T4.ProceCod = T1.ProceCod) INNER JOIN TXPCLIENT T5 ON T5.EmprCod = T1.EmprCod AND T5.CliCod =" ;
      scmdbuf += " T1.CliCod)" ;
      if ( GXutil.strcmp(AV113Talbdetwwds_2_dynamicfiltersselector1, httpContext.getMessage( "ALBREST", "")) == 0 )
      {
         addWhere(sWhereString, "(T1.AlbREst = ? or ? = 9)");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
         GXv_int6[1] = (byte)(1) ;
      }
      if ( AV115Talbdetwwds_4_dynamicfiltersenabled2 && ( GXutil.strcmp(AV116Talbdetwwds_5_dynamicfiltersselector2, httpContext.getMessage( "ALBREST", "")) == 0 ) )
      {
         addWhere(sWhereString, "(T1.AlbREst = ? or ? = 9)");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
         GXv_int6[3] = (byte)(1) ;
      }
      if ( AV118Talbdetwwds_7_dynamicfiltersenabled3 && ( GXutil.strcmp(AV119Talbdetwwds_8_dynamicfiltersselector3, httpContext.getMessage( "ALBREST", "")) == 0 ) )
      {
         addWhere(sWhereString, "(T1.AlbREst = ? or ? = 9)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! (0==AV121Talbdetwwds_10_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (0==AV122Talbdetwwds_11_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV124Talbdetwwds_13_tfalbrent_sel)==0) && ( ! (GXutil.strcmp("", AV123Talbdetwwds_12_tfalbrent)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbREnt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV124Talbdetwwds_13_tfalbrent_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbREnt = ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV126Talbdetwwds_15_tfalbrent2_sel)==0) && ( ! (GXutil.strcmp("", AV125Talbdetwwds_14_tfalbrent2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbREnt2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV126Talbdetwwds_15_tfalbrent2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbREnt2 = ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV127Talbdetwwds_16_tfalbrfen)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV128Talbdetwwds_17_tfalbrhen) )
      {
         addWhere(sWhereString, "(T1.AlbRHEn >= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (0==AV129Talbdetwwds_18_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (0==AV130Talbdetwwds_19_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV132Talbdetwwds_21_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV131Talbdetwwds_20_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV132Talbdetwwds_21_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.CliNom = ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV134Talbdetwwds_23_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV133Talbdetwwds_22_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV134Talbdetwwds_23_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef = ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV136Talbdetwwds_25_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV135Talbdetwwds_24_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV136Talbdetwwds_25_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (0==AV137Talbdetwwds_26_tfprocecod) )
      {
         addWhere(sWhereString, "(T1.ProceCod >= ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (0==AV138Talbdetwwds_27_tfprocecod_to) )
      {
         addWhere(sWhereString, "(T1.ProceCod <= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV140Talbdetwwds_29_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV139Talbdetwwds_28_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV140Talbdetwwds_29_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProceNom = ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (0==AV141Talbdetwwds_30_tftrncod) )
      {
         addWhere(sWhereString, "(T1.TrnCod >= ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! (0==AV142Talbdetwwds_31_tftrncod_to) )
      {
         addWhere(sWhereString, "(T1.TrnCod <= ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV144Talbdetwwds_33_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV143Talbdetwwds_32_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV144Talbdetwwds_33_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TrnNom = ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( ! (0==AV145Talbdetwwds_34_tftipentcod) )
      {
         addWhere(sWhereString, "(T1.TipEntCod >= ?)");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( ! (0==AV146Talbdetwwds_35_tftipentcod_to) )
      {
         addWhere(sWhereString, "(T1.TipEntCod <= ?)");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV148Talbdetwwds_37_tftipentnom_sel)==0) && ( ! (GXutil.strcmp("", AV147Talbdetwwds_36_tftipentnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipEntNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV148Talbdetwwds_37_tftipentnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipEntNom = ?)");
      }
      else
      {
         GXv_int6[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV150Talbdetwwds_39_tfalbrdes_sel)==0) && ( ! (GXutil.strcmp("", AV149Talbdetwwds_38_tfalbrdes)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRDes) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV150Talbdetwwds_39_tfalbrdes_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRDes = ?)");
      }
      else
      {
         GXv_int6[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV151Talbdetwwds_40_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int6[36] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV152Talbdetwwds_41_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int6[37] = (byte)(1) ;
      }
      if ( AV153Talbdetwwds_42_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV153Talbdetwwds_42_tfalbruni_sels, "T1.AlbRUni IN (", ")")+")");
      }
      if ( ! (0==AV154Talbdetwwds_43_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int6[38] = (byte)(1) ;
      }
      if ( ! (0==AV155Talbdetwwds_44_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int6[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV157Talbdetwwds_46_tfalbrloc_sel)==0) && ( ! (GXutil.strcmp("", AV156Talbdetwwds_45_tfalbrloc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRLoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV157Talbdetwwds_46_tfalbrloc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRLoc = ?)");
      }
      else
      {
         GXv_int6[41] = (byte)(1) ;
      }
      if ( AV158Talbdetwwds_47_tfalbrreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV158Talbdetwwds_47_tfalbrreo_sels, "T1.AlbRReo IN (", ")")+")");
      }
      if ( ! (0==AV159Talbdetwwds_48_tfalbrpieuti) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti >= ?)");
      }
      else
      {
         GXv_int6[42] = (byte)(1) ;
      }
      if ( ! (0==AV160Talbdetwwds_49_tfalbrpieuti_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti <= ?)");
      }
      else
      {
         GXv_int6[43] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV161Talbdetwwds_50_tfalbruniuti)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti >= ?)");
      }
      else
      {
         GXv_int6[44] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV162Talbdetwwds_51_tfalbruniuti_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti <= ?)");
      }
      else
      {
         GXv_int6[45] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRFen" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRFen DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRecCod" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRecCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbREnt" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbREnt DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbREnt2" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbREnt2 DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRHEn" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRHEn DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T5.CliNom" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T5.CliNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRef" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRef DESC" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRefDsc" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRefDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ProceCod" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ProceCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.ProceNom" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.ProceNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 12 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TrnCod" ;
      }
      else if ( ( AV28OrderedBy == 12 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TrnCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 13 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.TrnNom" ;
      }
      else if ( ( AV28OrderedBy == 13 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.TrnNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 14 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TipEntCod" ;
      }
      else if ( ( AV28OrderedBy == 14 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TipEntCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 15 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.TipEntNom" ;
      }
      else if ( ( AV28OrderedBy == 15 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.TipEntNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 16 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRDes" ;
      }
      else if ( ( AV28OrderedBy == 16 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRDes DESC" ;
      }
      else if ( ( AV28OrderedBy == 17 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRUniEnt" ;
      }
      else if ( ( AV28OrderedBy == 17 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRUniEnt DESC" ;
      }
      else if ( ( AV28OrderedBy == 18 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRUni" ;
      }
      else if ( ( AV28OrderedBy == 18 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRUni DESC" ;
      }
      else if ( ( AV28OrderedBy == 19 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRPieEnt" ;
      }
      else if ( ( AV28OrderedBy == 19 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRPieEnt DESC" ;
      }
      else if ( ( AV28OrderedBy == 20 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRLoc" ;
      }
      else if ( ( AV28OrderedBy == 20 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRLoc DESC" ;
      }
      else if ( ( AV28OrderedBy == 21 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRReo" ;
      }
      else if ( ( AV28OrderedBy == 21 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRReo DESC" ;
      }
      else if ( ( AV28OrderedBy == 22 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRPieUti" ;
      }
      else if ( ( AV28OrderedBy == 22 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRPieUti DESC" ;
      }
      else if ( ( AV28OrderedBy == 23 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRUniUti" ;
      }
      else if ( ( AV28OrderedBy == 23 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRUniUti DESC" ;
      }
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
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
                  return conditional_P085B2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , ((Boolean) dynConstraints[5]).booleanValue() , (String)dynConstraints[6] , ((Boolean) dynConstraints[7]).booleanValue() , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).shortValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).shortValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).intValue() , ((Number) dynConstraints[48]).intValue() , (java.math.BigDecimal)dynConstraints[49] , (java.math.BigDecimal)dynConstraints[50] , ((Number) dynConstraints[51]).byteValue() , ((Number) dynConstraints[52]).byteValue() , ((Number) dynConstraints[53]).byteValue() , ((Number) dynConstraints[54]).byteValue() , ((Number) dynConstraints[55]).intValue() , (String)dynConstraints[56] , (String)dynConstraints[57] , (java.util.Date)dynConstraints[58] , (java.util.Date)dynConstraints[59] , ((Number) dynConstraints[60]).intValue() , (String)dynConstraints[61] , (String)dynConstraints[62] , (String)dynConstraints[63] , ((Number) dynConstraints[64]).shortValue() , (String)dynConstraints[65] , ((Number) dynConstraints[66]).shortValue() , (String)dynConstraints[67] , ((Number) dynConstraints[68]).shortValue() , (String)dynConstraints[69] , (String)dynConstraints[70] , (java.math.BigDecimal)dynConstraints[71] , ((Number) dynConstraints[72]).intValue() , (String)dynConstraints[73] , ((Number) dynConstraints[74]).intValue() , (java.math.BigDecimal)dynConstraints[75] , ((Number) dynConstraints[76]).shortValue() , ((Boolean) dynConstraints[77]).booleanValue() , (String)dynConstraints[78] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P085B2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getString(7, 20);
               ((String[]) buf[7])[0] = rslt.getString(8, 25);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(11);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(13);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(14, 26);
               ((String[]) buf[20])[0] = rslt.getString(15, 16);
               ((String[]) buf[21])[0] = rslt.getString(16, 30);
               ((int[]) buf[22])[0] = rslt.getInt(17);
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDateTime(18);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDate(19);
               ((String[]) buf[26])[0] = rslt.getString(20, 20);
               ((String[]) buf[27])[0] = rslt.getString(21, 8);
               ((int[]) buf[28])[0] = rslt.getInt(22);
               ((byte[]) buf[29])[0] = rslt.getByte(23);
               ((String[]) buf[30])[0] = rslt.getString(24, 2);
               ((String[]) buf[31])[0] = rslt.getString(25, 1);
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
                  stmt.setByte(sIdx, ((Number) parms[46]).byteValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[47]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[48]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[49]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[50]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[51]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 8);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 8);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 20);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 20);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[58]);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[59], false);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[68]).shortValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[69]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[72]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[73]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 30);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 30);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[76]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[77]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 25);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 25);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 20);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 20);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[82], 2);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[83], 2);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[85]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 10);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 10);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[88]).intValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[89]).intValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[90], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[91], 2);
               }
               return;
      }
   }

}

