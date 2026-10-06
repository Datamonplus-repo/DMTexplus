package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class webwpalbrecgetfilterdata extends GXProcedure
{
   public webwpalbrecgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webwpalbrecgetfilterdata.class ), "" );
   }

   public webwpalbrecgetfilterdata( int remoteHandle ,
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
      webwpalbrecgetfilterdata.this.aP5 = new String[] {""};
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
      webwpalbrecgetfilterdata.this.AV20DDOName = aP0;
      webwpalbrecgetfilterdata.this.AV18SearchTxt = aP1;
      webwpalbrecgetfilterdata.this.AV19SearchTxtTo = aP2;
      webwpalbrecgetfilterdata.this.aP3 = aP3;
      webwpalbrecgetfilterdata.this.aP4 = aP4;
      webwpalbrecgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV23Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV26OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV28OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV20DDOName), "DDO_CLINOM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV20DDOName), "DDO_ALBREF") == 0 )
      {
         /* Execute user subroutine: 'LOADALBREFOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV20DDOName), "DDO_ALBREFDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADALBREFDSCOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV24OptionsJson = AV23Options.toJSonString(false) ;
      AV27OptionsDescJson = AV26OptionsDesc.toJSonString(false) ;
      AV29OptionIndexesJson = AV28OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV31Session.getValue("WebWpALBRECGridState"), "") == 0 )
      {
         AV33GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WebWpALBRECGridState"), null, null);
      }
      else
      {
         AV33GridState.fromxml(AV31Session.getValue("WebWpALBRECGridState"), null, null);
      }
      AV64GXV1 = 1 ;
      while ( AV64GXV1 <= AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV34GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV64GXV1));
         if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV61FilterFullText = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "ALBRFEN") == 0 )
         {
            AV36AlbRFen = localUtil.ctod( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV53AlbRFen_To = localUtil.ctod( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "ALBREST") == 0 )
         {
            AV54AlbREst = (byte)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "CLINOM") == 0 )
         {
            AV56CliNom = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV55CliNomOperator = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Operator() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "ALBREF") == 0 )
         {
            AV58AlbRef = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV57AlbRefOperator = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Operator() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRFEN") == 0 )
         {
            AV37TFAlbRFen = localUtil.ctod( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRECCOD") == 0 )
         {
            AV10TFAlbRecCod = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFAlbRecCod_To = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV12TFCliCod = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV13TFCliCod_To = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV14TFCliNom = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV15TFCliNom_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF") == 0 )
         {
            AV16TFAlbRef = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF_SEL") == 0 )
         {
            AV17TFAlbRef_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREFDSC") == 0 )
         {
            AV39TFAlbRefDsc = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREFDSC_SEL") == 0 )
         {
            AV40TFAlbRefDsc_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNI_SEL") == 0 )
         {
            AV59TFAlbRUni_SelsJson = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV60TFAlbRUni_Sels.fromJSonString(AV59TFAlbRUni_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNIENT") == 0 )
         {
            AV47TFAlbRUniEnt = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV48TFAlbRUniEnt_To = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNIDIS") == 0 )
         {
            AV41TFAlbRUniDis = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV42TFAlbRUniDis_To = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRPIEENT") == 0 )
         {
            AV49TFAlbRPieEnt = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV50TFAlbRPieEnt_To = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRPIEDIS") == 0 )
         {
            AV45TFAlbRPieDis = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV46TFAlbRPieDis_To = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREST_SEL") == 0 )
         {
            AV51TFAlbREst_SelsJson = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV52TFAlbREst_Sels.fromJSonString(AV51TFAlbREst_SelsJson, null);
         }
         AV64GXV1 = (int)(AV64GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV14TFCliNom = AV18SearchTxt ;
      AV15TFCliNom_Sel = "" ;
      AV66Webwpalbrecds_1_filterfulltext = AV61FilterFullText ;
      AV67Webwpalbrecds_2_albrfen = AV36AlbRFen ;
      AV68Webwpalbrecds_3_albrfen_to = AV53AlbRFen_To ;
      AV69Webwpalbrecds_4_albrest = AV54AlbREst ;
      AV70Webwpalbrecds_5_clinom = AV56CliNom ;
      AV71Webwpalbrecds_6_albref = AV58AlbRef ;
      AV72Webwpalbrecds_7_tfalbrfen = AV37TFAlbRFen ;
      AV73Webwpalbrecds_8_tfalbreccod = AV10TFAlbRecCod ;
      AV74Webwpalbrecds_9_tfalbreccod_to = AV11TFAlbRecCod_To ;
      AV75Webwpalbrecds_10_tfclicod = AV12TFCliCod ;
      AV76Webwpalbrecds_11_tfclicod_to = AV13TFCliCod_To ;
      AV77Webwpalbrecds_12_tfclinom = AV14TFCliNom ;
      AV78Webwpalbrecds_13_tfclinom_sel = AV15TFCliNom_Sel ;
      AV79Webwpalbrecds_14_tfalbref = AV16TFAlbRef ;
      AV80Webwpalbrecds_15_tfalbref_sel = AV17TFAlbRef_Sel ;
      AV81Webwpalbrecds_16_tfalbrefdsc = AV39TFAlbRefDsc ;
      AV82Webwpalbrecds_17_tfalbrefdsc_sel = AV40TFAlbRefDsc_Sel ;
      AV83Webwpalbrecds_18_tfalbruni_sels = AV60TFAlbRUni_Sels ;
      AV84Webwpalbrecds_19_tfalbrunient = AV47TFAlbRUniEnt ;
      AV85Webwpalbrecds_20_tfalbrunient_to = AV48TFAlbRUniEnt_To ;
      AV86Webwpalbrecds_21_tfalbrunidis = AV41TFAlbRUniDis ;
      AV87Webwpalbrecds_22_tfalbrunidis_to = AV42TFAlbRUniDis_To ;
      AV88Webwpalbrecds_23_tfalbrpieent = AV49TFAlbRPieEnt ;
      AV89Webwpalbrecds_24_tfalbrpieent_to = AV50TFAlbRPieEnt_To ;
      AV90Webwpalbrecds_25_tfalbrpiedis = AV45TFAlbRPieDis ;
      AV91Webwpalbrecds_26_tfalbrpiedis_to = AV46TFAlbRPieDis_To ;
      AV92Webwpalbrecds_27_tfalbrest_sels = AV52TFAlbREst_Sels ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A56AlbRUni ,
                                           AV83Webwpalbrecds_18_tfalbruni_sels ,
                                           Byte.valueOf(A47AlbREst) ,
                                           AV92Webwpalbrecds_27_tfalbrest_sels ,
                                           AV67Webwpalbrecds_2_albrfen ,
                                           AV68Webwpalbrecds_3_albrfen_to ,
                                           Short.valueOf(AV55CliNomOperator) ,
                                           AV70Webwpalbrecds_5_clinom ,
                                           Short.valueOf(AV57AlbRefOperator) ,
                                           AV71Webwpalbrecds_6_albref ,
                                           AV72Webwpalbrecds_7_tfalbrfen ,
                                           Integer.valueOf(AV73Webwpalbrecds_8_tfalbreccod) ,
                                           Integer.valueOf(AV74Webwpalbrecds_9_tfalbreccod_to) ,
                                           Integer.valueOf(AV75Webwpalbrecds_10_tfclicod) ,
                                           Integer.valueOf(AV76Webwpalbrecds_11_tfclicod_to) ,
                                           AV78Webwpalbrecds_13_tfclinom_sel ,
                                           AV77Webwpalbrecds_12_tfclinom ,
                                           AV80Webwpalbrecds_15_tfalbref_sel ,
                                           AV79Webwpalbrecds_14_tfalbref ,
                                           AV82Webwpalbrecds_17_tfalbrefdsc_sel ,
                                           AV81Webwpalbrecds_16_tfalbrefdsc ,
                                           Integer.valueOf(AV83Webwpalbrecds_18_tfalbruni_sels.size()) ,
                                           AV84Webwpalbrecds_19_tfalbrunient ,
                                           AV85Webwpalbrecds_20_tfalbrunient_to ,
                                           AV86Webwpalbrecds_21_tfalbrunidis ,
                                           AV87Webwpalbrecds_22_tfalbrunidis_to ,
                                           Integer.valueOf(AV88Webwpalbrecds_23_tfalbrpieent) ,
                                           Integer.valueOf(AV89Webwpalbrecds_24_tfalbrpieent_to) ,
                                           Integer.valueOf(AV90Webwpalbrecds_25_tfalbrpiedis) ,
                                           Integer.valueOf(AV91Webwpalbrecds_26_tfalbrpiedis_to) ,
                                           Integer.valueOf(AV92Webwpalbrecds_27_tfalbrest_sels.size()) ,
                                           A49AlbRFen ,
                                           A279CliNom ,
                                           A45AlbRef ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A3613AlbRefDsc ,
                                           A58AlbRUniEnt ,
                                           A60AlbRUniUti ,
                                           Integer.valueOf(A52AlbRPieEnt) ,
                                           Integer.valueOf(A54AlbRPieUti) ,
                                           AV66Webwpalbrecds_1_filterfulltext ,
                                           A57AlbRUniDis ,
                                           Integer.valueOf(A51AlbRPieDis) ,
                                           Byte.valueOf(AV69Webwpalbrecds_4_albrest) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.BYTE
                                           }
      });
      lV70Webwpalbrecds_5_clinom = GXutil.padr( GXutil.rtrim( AV70Webwpalbrecds_5_clinom), 30, "%") ;
      lV71Webwpalbrecds_6_albref = GXutil.padr( GXutil.rtrim( AV71Webwpalbrecds_6_albref), 16, "%") ;
      lV77Webwpalbrecds_12_tfclinom = GXutil.padr( GXutil.rtrim( AV77Webwpalbrecds_12_tfclinom), 30, "%") ;
      lV79Webwpalbrecds_14_tfalbref = GXutil.padr( GXutil.rtrim( AV79Webwpalbrecds_14_tfalbref), 16, "%") ;
      lV81Webwpalbrecds_16_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV81Webwpalbrecds_16_tfalbrefdsc), 26, "%") ;
      /* Using cursor P08C12 */
      pr_default.execute(0, new Object[] {Byte.valueOf(AV69Webwpalbrecds_4_albrest), Byte.valueOf(AV69Webwpalbrecds_4_albrest), AV67Webwpalbrecds_2_albrfen, AV68Webwpalbrecds_3_albrfen_to, lV70Webwpalbrecds_5_clinom, lV71Webwpalbrecds_6_albref, AV72Webwpalbrecds_7_tfalbrfen, Integer.valueOf(AV73Webwpalbrecds_8_tfalbreccod), Integer.valueOf(AV74Webwpalbrecds_9_tfalbreccod_to), Integer.valueOf(AV75Webwpalbrecds_10_tfclicod), Integer.valueOf(AV76Webwpalbrecds_11_tfclicod_to), lV77Webwpalbrecds_12_tfclinom, AV78Webwpalbrecds_13_tfclinom_sel, lV79Webwpalbrecds_14_tfalbref, AV80Webwpalbrecds_15_tfalbref_sel, lV81Webwpalbrecds_16_tfalbrefdsc, AV82Webwpalbrecds_17_tfalbrefdsc_sel, AV84Webwpalbrecds_19_tfalbrunient, AV85Webwpalbrecds_20_tfalbrunient_to, AV86Webwpalbrecds_21_tfalbrunidis, AV87Webwpalbrecds_22_tfalbrunidis_to, Integer.valueOf(AV88Webwpalbrecds_23_tfalbrpieent), Integer.valueOf(AV89Webwpalbrecds_24_tfalbrpieent_to), Integer.valueOf(AV90Webwpalbrecds_25_tfalbrpiedis), Integer.valueOf(AV91Webwpalbrecds_26_tfalbrpiedis_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8C12 = false ;
         A396EmprCod = P08C12_A396EmprCod[0] ;
         A279CliNom = P08C12_A279CliNom[0] ;
         A51AlbRPieDis = P08C12_A51AlbRPieDis[0] ;
         A57AlbRUniDis = P08C12_A57AlbRUniDis[0] ;
         A3613AlbRefDsc = P08C12_A3613AlbRefDsc[0] ;
         A252CliCod = P08C12_A252CliCod[0] ;
         A44AlbRecCod = P08C12_A44AlbRecCod[0] ;
         A45AlbRef = P08C12_A45AlbRef[0] ;
         A49AlbRFen = P08C12_A49AlbRFen[0] ;
         A47AlbREst = P08C12_A47AlbREst[0] ;
         A56AlbRUni = P08C12_A56AlbRUni[0] ;
         A52AlbRPieEnt = P08C12_A52AlbRPieEnt[0] ;
         A54AlbRPieUti = P08C12_A54AlbRPieUti[0] ;
         A58AlbRUniEnt = P08C12_A58AlbRUniEnt[0] ;
         A60AlbRUniUti = P08C12_A60AlbRUniUti[0] ;
         A279CliNom = P08C12_A279CliNom[0] ;
         if ( (GXutil.strcmp("", AV66Webwpalbrecds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A44AlbRecCod, 8, 0) , GXutil.padr( "%" + AV66Webwpalbrecds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV66Webwpalbrecds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV66Webwpalbrecds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A45AlbRef) , GXutil.padr( "%" + GXutil.upper( AV66Webwpalbrecds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3613AlbRefDsc) , GXutil.padr( "%" + GXutil.upper( AV66Webwpalbrecds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "k", ""), "") , GXutil.padr( "%" + GXutil.lower( AV66Webwpalbrecds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "m", ""), "") , GXutil.padr( "%" + GXutil.lower( AV66Webwpalbrecds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A58AlbRUniEnt, 9, 2) , GXutil.padr( "%" + AV66Webwpalbrecds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A57AlbRUniDis, 9, 2) , GXutil.padr( "%" + AV66Webwpalbrecds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A52AlbRPieEnt, 6, 0) , GXutil.padr( "%" + AV66Webwpalbrecds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A51AlbRPieDis, 6, 0) , GXutil.padr( "%" + AV66Webwpalbrecds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "abierta", ""), "") , GXutil.padr( "%" + GXutil.lower( AV66Webwpalbrecds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A47AlbREst == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "cerrada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV66Webwpalbrecds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A47AlbREst == 1 ) ) ) )
         {
            AV30count = 0 ;
            while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08C12_A279CliNom[0], A279CliNom) == 0 ) )
            {
               brk8C12 = false ;
               A396EmprCod = P08C12_A396EmprCod[0] ;
               A252CliCod = P08C12_A252CliCod[0] ;
               A44AlbRecCod = P08C12_A44AlbRecCod[0] ;
               AV30count = (long)(AV30count+1) ;
               brk8C12 = true ;
               pr_default.readNext(0);
            }
            if ( ! (GXutil.strcmp("", A279CliNom)==0) )
            {
               AV22Option = A279CliNom ;
               AV23Options.add(AV22Option, 0);
               AV28OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV23Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk8C12 )
         {
            brk8C12 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADALBREFOPTIONS' Routine */
      returnInSub = false ;
      AV16TFAlbRef = AV18SearchTxt ;
      AV17TFAlbRef_Sel = "" ;
      AV66Webwpalbrecds_1_filterfulltext = AV61FilterFullText ;
      AV67Webwpalbrecds_2_albrfen = AV36AlbRFen ;
      AV68Webwpalbrecds_3_albrfen_to = AV53AlbRFen_To ;
      AV69Webwpalbrecds_4_albrest = AV54AlbREst ;
      AV70Webwpalbrecds_5_clinom = AV56CliNom ;
      AV71Webwpalbrecds_6_albref = AV58AlbRef ;
      AV72Webwpalbrecds_7_tfalbrfen = AV37TFAlbRFen ;
      AV73Webwpalbrecds_8_tfalbreccod = AV10TFAlbRecCod ;
      AV74Webwpalbrecds_9_tfalbreccod_to = AV11TFAlbRecCod_To ;
      AV75Webwpalbrecds_10_tfclicod = AV12TFCliCod ;
      AV76Webwpalbrecds_11_tfclicod_to = AV13TFCliCod_To ;
      AV77Webwpalbrecds_12_tfclinom = AV14TFCliNom ;
      AV78Webwpalbrecds_13_tfclinom_sel = AV15TFCliNom_Sel ;
      AV79Webwpalbrecds_14_tfalbref = AV16TFAlbRef ;
      AV80Webwpalbrecds_15_tfalbref_sel = AV17TFAlbRef_Sel ;
      AV81Webwpalbrecds_16_tfalbrefdsc = AV39TFAlbRefDsc ;
      AV82Webwpalbrecds_17_tfalbrefdsc_sel = AV40TFAlbRefDsc_Sel ;
      AV83Webwpalbrecds_18_tfalbruni_sels = AV60TFAlbRUni_Sels ;
      AV84Webwpalbrecds_19_tfalbrunient = AV47TFAlbRUniEnt ;
      AV85Webwpalbrecds_20_tfalbrunient_to = AV48TFAlbRUniEnt_To ;
      AV86Webwpalbrecds_21_tfalbrunidis = AV41TFAlbRUniDis ;
      AV87Webwpalbrecds_22_tfalbrunidis_to = AV42TFAlbRUniDis_To ;
      AV88Webwpalbrecds_23_tfalbrpieent = AV49TFAlbRPieEnt ;
      AV89Webwpalbrecds_24_tfalbrpieent_to = AV50TFAlbRPieEnt_To ;
      AV90Webwpalbrecds_25_tfalbrpiedis = AV45TFAlbRPieDis ;
      AV91Webwpalbrecds_26_tfalbrpiedis_to = AV46TFAlbRPieDis_To ;
      AV92Webwpalbrecds_27_tfalbrest_sels = AV52TFAlbREst_Sels ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           A56AlbRUni ,
                                           AV83Webwpalbrecds_18_tfalbruni_sels ,
                                           Byte.valueOf(A47AlbREst) ,
                                           AV92Webwpalbrecds_27_tfalbrest_sels ,
                                           AV67Webwpalbrecds_2_albrfen ,
                                           AV68Webwpalbrecds_3_albrfen_to ,
                                           Short.valueOf(AV55CliNomOperator) ,
                                           AV70Webwpalbrecds_5_clinom ,
                                           Short.valueOf(AV57AlbRefOperator) ,
                                           AV71Webwpalbrecds_6_albref ,
                                           AV72Webwpalbrecds_7_tfalbrfen ,
                                           Integer.valueOf(AV73Webwpalbrecds_8_tfalbreccod) ,
                                           Integer.valueOf(AV74Webwpalbrecds_9_tfalbreccod_to) ,
                                           Integer.valueOf(AV75Webwpalbrecds_10_tfclicod) ,
                                           Integer.valueOf(AV76Webwpalbrecds_11_tfclicod_to) ,
                                           AV78Webwpalbrecds_13_tfclinom_sel ,
                                           AV77Webwpalbrecds_12_tfclinom ,
                                           AV80Webwpalbrecds_15_tfalbref_sel ,
                                           AV79Webwpalbrecds_14_tfalbref ,
                                           AV82Webwpalbrecds_17_tfalbrefdsc_sel ,
                                           AV81Webwpalbrecds_16_tfalbrefdsc ,
                                           Integer.valueOf(AV83Webwpalbrecds_18_tfalbruni_sels.size()) ,
                                           AV84Webwpalbrecds_19_tfalbrunient ,
                                           AV85Webwpalbrecds_20_tfalbrunient_to ,
                                           AV86Webwpalbrecds_21_tfalbrunidis ,
                                           AV87Webwpalbrecds_22_tfalbrunidis_to ,
                                           Integer.valueOf(AV88Webwpalbrecds_23_tfalbrpieent) ,
                                           Integer.valueOf(AV89Webwpalbrecds_24_tfalbrpieent_to) ,
                                           Integer.valueOf(AV90Webwpalbrecds_25_tfalbrpiedis) ,
                                           Integer.valueOf(AV91Webwpalbrecds_26_tfalbrpiedis_to) ,
                                           Integer.valueOf(AV92Webwpalbrecds_27_tfalbrest_sels.size()) ,
                                           A49AlbRFen ,
                                           A279CliNom ,
                                           A45AlbRef ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A3613AlbRefDsc ,
                                           A58AlbRUniEnt ,
                                           A60AlbRUniUti ,
                                           Integer.valueOf(A52AlbRPieEnt) ,
                                           Integer.valueOf(A54AlbRPieUti) ,
                                           AV66Webwpalbrecds_1_filterfulltext ,
                                           A57AlbRUniDis ,
                                           Integer.valueOf(A51AlbRPieDis) ,
                                           Byte.valueOf(AV69Webwpalbrecds_4_albrest) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.BYTE
                                           }
      });
      lV70Webwpalbrecds_5_clinom = GXutil.padr( GXutil.rtrim( AV70Webwpalbrecds_5_clinom), 30, "%") ;
      lV71Webwpalbrecds_6_albref = GXutil.padr( GXutil.rtrim( AV71Webwpalbrecds_6_albref), 16, "%") ;
      lV77Webwpalbrecds_12_tfclinom = GXutil.padr( GXutil.rtrim( AV77Webwpalbrecds_12_tfclinom), 30, "%") ;
      lV79Webwpalbrecds_14_tfalbref = GXutil.padr( GXutil.rtrim( AV79Webwpalbrecds_14_tfalbref), 16, "%") ;
      lV81Webwpalbrecds_16_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV81Webwpalbrecds_16_tfalbrefdsc), 26, "%") ;
      /* Using cursor P08C13 */
      pr_default.execute(1, new Object[] {Byte.valueOf(AV69Webwpalbrecds_4_albrest), Byte.valueOf(AV69Webwpalbrecds_4_albrest), AV67Webwpalbrecds_2_albrfen, AV68Webwpalbrecds_3_albrfen_to, lV70Webwpalbrecds_5_clinom, lV71Webwpalbrecds_6_albref, AV72Webwpalbrecds_7_tfalbrfen, Integer.valueOf(AV73Webwpalbrecds_8_tfalbreccod), Integer.valueOf(AV74Webwpalbrecds_9_tfalbreccod_to), Integer.valueOf(AV75Webwpalbrecds_10_tfclicod), Integer.valueOf(AV76Webwpalbrecds_11_tfclicod_to), lV77Webwpalbrecds_12_tfclinom, AV78Webwpalbrecds_13_tfclinom_sel, lV79Webwpalbrecds_14_tfalbref, AV80Webwpalbrecds_15_tfalbref_sel, lV81Webwpalbrecds_16_tfalbrefdsc, AV82Webwpalbrecds_17_tfalbrefdsc_sel, AV84Webwpalbrecds_19_tfalbrunient, AV85Webwpalbrecds_20_tfalbrunient_to, AV86Webwpalbrecds_21_tfalbrunidis, AV87Webwpalbrecds_22_tfalbrunidis_to, Integer.valueOf(AV88Webwpalbrecds_23_tfalbrpieent), Integer.valueOf(AV89Webwpalbrecds_24_tfalbrpieent_to), Integer.valueOf(AV90Webwpalbrecds_25_tfalbrpiedis), Integer.valueOf(AV91Webwpalbrecds_26_tfalbrpiedis_to)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8C14 = false ;
         A396EmprCod = P08C13_A396EmprCod[0] ;
         A45AlbRef = P08C13_A45AlbRef[0] ;
         A51AlbRPieDis = P08C13_A51AlbRPieDis[0] ;
         A57AlbRUniDis = P08C13_A57AlbRUniDis[0] ;
         A3613AlbRefDsc = P08C13_A3613AlbRefDsc[0] ;
         A252CliCod = P08C13_A252CliCod[0] ;
         A44AlbRecCod = P08C13_A44AlbRecCod[0] ;
         A279CliNom = P08C13_A279CliNom[0] ;
         A49AlbRFen = P08C13_A49AlbRFen[0] ;
         A47AlbREst = P08C13_A47AlbREst[0] ;
         A56AlbRUni = P08C13_A56AlbRUni[0] ;
         A52AlbRPieEnt = P08C13_A52AlbRPieEnt[0] ;
         A54AlbRPieUti = P08C13_A54AlbRPieUti[0] ;
         A58AlbRUniEnt = P08C13_A58AlbRUniEnt[0] ;
         A60AlbRUniUti = P08C13_A60AlbRUniUti[0] ;
         A279CliNom = P08C13_A279CliNom[0] ;
         if ( (GXutil.strcmp("", AV66Webwpalbrecds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A44AlbRecCod, 8, 0) , GXutil.padr( "%" + AV66Webwpalbrecds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV66Webwpalbrecds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV66Webwpalbrecds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A45AlbRef) , GXutil.padr( "%" + GXutil.upper( AV66Webwpalbrecds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3613AlbRefDsc) , GXutil.padr( "%" + GXutil.upper( AV66Webwpalbrecds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "k", ""), "") , GXutil.padr( "%" + GXutil.lower( AV66Webwpalbrecds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "m", ""), "") , GXutil.padr( "%" + GXutil.lower( AV66Webwpalbrecds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A58AlbRUniEnt, 9, 2) , GXutil.padr( "%" + AV66Webwpalbrecds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A57AlbRUniDis, 9, 2) , GXutil.padr( "%" + AV66Webwpalbrecds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A52AlbRPieEnt, 6, 0) , GXutil.padr( "%" + AV66Webwpalbrecds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A51AlbRPieDis, 6, 0) , GXutil.padr( "%" + AV66Webwpalbrecds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "abierta", ""), "") , GXutil.padr( "%" + GXutil.lower( AV66Webwpalbrecds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A47AlbREst == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "cerrada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV66Webwpalbrecds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A47AlbREst == 1 ) ) ) )
         {
            AV30count = 0 ;
            while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08C13_A45AlbRef[0], A45AlbRef) == 0 ) )
            {
               brk8C14 = false ;
               A396EmprCod = P08C13_A396EmprCod[0] ;
               A44AlbRecCod = P08C13_A44AlbRecCod[0] ;
               AV30count = (long)(AV30count+1) ;
               brk8C14 = true ;
               pr_default.readNext(1);
            }
            if ( ! (GXutil.strcmp("", A45AlbRef)==0) )
            {
               AV22Option = A45AlbRef ;
               AV23Options.add(AV22Option, 0);
               AV28OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV23Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk8C14 )
         {
            brk8C14 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADALBREFDSCOPTIONS' Routine */
      returnInSub = false ;
      AV39TFAlbRefDsc = AV18SearchTxt ;
      AV40TFAlbRefDsc_Sel = "" ;
      AV66Webwpalbrecds_1_filterfulltext = AV61FilterFullText ;
      AV67Webwpalbrecds_2_albrfen = AV36AlbRFen ;
      AV68Webwpalbrecds_3_albrfen_to = AV53AlbRFen_To ;
      AV69Webwpalbrecds_4_albrest = AV54AlbREst ;
      AV70Webwpalbrecds_5_clinom = AV56CliNom ;
      AV71Webwpalbrecds_6_albref = AV58AlbRef ;
      AV72Webwpalbrecds_7_tfalbrfen = AV37TFAlbRFen ;
      AV73Webwpalbrecds_8_tfalbreccod = AV10TFAlbRecCod ;
      AV74Webwpalbrecds_9_tfalbreccod_to = AV11TFAlbRecCod_To ;
      AV75Webwpalbrecds_10_tfclicod = AV12TFCliCod ;
      AV76Webwpalbrecds_11_tfclicod_to = AV13TFCliCod_To ;
      AV77Webwpalbrecds_12_tfclinom = AV14TFCliNom ;
      AV78Webwpalbrecds_13_tfclinom_sel = AV15TFCliNom_Sel ;
      AV79Webwpalbrecds_14_tfalbref = AV16TFAlbRef ;
      AV80Webwpalbrecds_15_tfalbref_sel = AV17TFAlbRef_Sel ;
      AV81Webwpalbrecds_16_tfalbrefdsc = AV39TFAlbRefDsc ;
      AV82Webwpalbrecds_17_tfalbrefdsc_sel = AV40TFAlbRefDsc_Sel ;
      AV83Webwpalbrecds_18_tfalbruni_sels = AV60TFAlbRUni_Sels ;
      AV84Webwpalbrecds_19_tfalbrunient = AV47TFAlbRUniEnt ;
      AV85Webwpalbrecds_20_tfalbrunient_to = AV48TFAlbRUniEnt_To ;
      AV86Webwpalbrecds_21_tfalbrunidis = AV41TFAlbRUniDis ;
      AV87Webwpalbrecds_22_tfalbrunidis_to = AV42TFAlbRUniDis_To ;
      AV88Webwpalbrecds_23_tfalbrpieent = AV49TFAlbRPieEnt ;
      AV89Webwpalbrecds_24_tfalbrpieent_to = AV50TFAlbRPieEnt_To ;
      AV90Webwpalbrecds_25_tfalbrpiedis = AV45TFAlbRPieDis ;
      AV91Webwpalbrecds_26_tfalbrpiedis_to = AV46TFAlbRPieDis_To ;
      AV92Webwpalbrecds_27_tfalbrest_sels = AV52TFAlbREst_Sels ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           A56AlbRUni ,
                                           AV83Webwpalbrecds_18_tfalbruni_sels ,
                                           Byte.valueOf(A47AlbREst) ,
                                           AV92Webwpalbrecds_27_tfalbrest_sels ,
                                           AV67Webwpalbrecds_2_albrfen ,
                                           AV68Webwpalbrecds_3_albrfen_to ,
                                           Short.valueOf(AV55CliNomOperator) ,
                                           AV70Webwpalbrecds_5_clinom ,
                                           Short.valueOf(AV57AlbRefOperator) ,
                                           AV71Webwpalbrecds_6_albref ,
                                           AV72Webwpalbrecds_7_tfalbrfen ,
                                           Integer.valueOf(AV73Webwpalbrecds_8_tfalbreccod) ,
                                           Integer.valueOf(AV74Webwpalbrecds_9_tfalbreccod_to) ,
                                           Integer.valueOf(AV75Webwpalbrecds_10_tfclicod) ,
                                           Integer.valueOf(AV76Webwpalbrecds_11_tfclicod_to) ,
                                           AV78Webwpalbrecds_13_tfclinom_sel ,
                                           AV77Webwpalbrecds_12_tfclinom ,
                                           AV80Webwpalbrecds_15_tfalbref_sel ,
                                           AV79Webwpalbrecds_14_tfalbref ,
                                           AV82Webwpalbrecds_17_tfalbrefdsc_sel ,
                                           AV81Webwpalbrecds_16_tfalbrefdsc ,
                                           Integer.valueOf(AV83Webwpalbrecds_18_tfalbruni_sels.size()) ,
                                           AV84Webwpalbrecds_19_tfalbrunient ,
                                           AV85Webwpalbrecds_20_tfalbrunient_to ,
                                           AV86Webwpalbrecds_21_tfalbrunidis ,
                                           AV87Webwpalbrecds_22_tfalbrunidis_to ,
                                           Integer.valueOf(AV88Webwpalbrecds_23_tfalbrpieent) ,
                                           Integer.valueOf(AV89Webwpalbrecds_24_tfalbrpieent_to) ,
                                           Integer.valueOf(AV90Webwpalbrecds_25_tfalbrpiedis) ,
                                           Integer.valueOf(AV91Webwpalbrecds_26_tfalbrpiedis_to) ,
                                           Integer.valueOf(AV92Webwpalbrecds_27_tfalbrest_sels.size()) ,
                                           A49AlbRFen ,
                                           A279CliNom ,
                                           A45AlbRef ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A3613AlbRefDsc ,
                                           A58AlbRUniEnt ,
                                           A60AlbRUniUti ,
                                           Integer.valueOf(A52AlbRPieEnt) ,
                                           Integer.valueOf(A54AlbRPieUti) ,
                                           AV66Webwpalbrecds_1_filterfulltext ,
                                           A57AlbRUniDis ,
                                           Integer.valueOf(A51AlbRPieDis) ,
                                           Byte.valueOf(AV69Webwpalbrecds_4_albrest) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.BYTE
                                           }
      });
      lV70Webwpalbrecds_5_clinom = GXutil.padr( GXutil.rtrim( AV70Webwpalbrecds_5_clinom), 30, "%") ;
      lV71Webwpalbrecds_6_albref = GXutil.padr( GXutil.rtrim( AV71Webwpalbrecds_6_albref), 16, "%") ;
      lV77Webwpalbrecds_12_tfclinom = GXutil.padr( GXutil.rtrim( AV77Webwpalbrecds_12_tfclinom), 30, "%") ;
      lV79Webwpalbrecds_14_tfalbref = GXutil.padr( GXutil.rtrim( AV79Webwpalbrecds_14_tfalbref), 16, "%") ;
      lV81Webwpalbrecds_16_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV81Webwpalbrecds_16_tfalbrefdsc), 26, "%") ;
      /* Using cursor P08C14 */
      pr_default.execute(2, new Object[] {Byte.valueOf(AV69Webwpalbrecds_4_albrest), Byte.valueOf(AV69Webwpalbrecds_4_albrest), AV67Webwpalbrecds_2_albrfen, AV68Webwpalbrecds_3_albrfen_to, lV70Webwpalbrecds_5_clinom, lV71Webwpalbrecds_6_albref, AV72Webwpalbrecds_7_tfalbrfen, Integer.valueOf(AV73Webwpalbrecds_8_tfalbreccod), Integer.valueOf(AV74Webwpalbrecds_9_tfalbreccod_to), Integer.valueOf(AV75Webwpalbrecds_10_tfclicod), Integer.valueOf(AV76Webwpalbrecds_11_tfclicod_to), lV77Webwpalbrecds_12_tfclinom, AV78Webwpalbrecds_13_tfclinom_sel, lV79Webwpalbrecds_14_tfalbref, AV80Webwpalbrecds_15_tfalbref_sel, lV81Webwpalbrecds_16_tfalbrefdsc, AV82Webwpalbrecds_17_tfalbrefdsc_sel, AV84Webwpalbrecds_19_tfalbrunient, AV85Webwpalbrecds_20_tfalbrunient_to, AV86Webwpalbrecds_21_tfalbrunidis, AV87Webwpalbrecds_22_tfalbrunidis_to, Integer.valueOf(AV88Webwpalbrecds_23_tfalbrpieent), Integer.valueOf(AV89Webwpalbrecds_24_tfalbrpieent_to), Integer.valueOf(AV90Webwpalbrecds_25_tfalbrpiedis), Integer.valueOf(AV91Webwpalbrecds_26_tfalbrpiedis_to)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk8C16 = false ;
         A396EmprCod = P08C14_A396EmprCod[0] ;
         A3613AlbRefDsc = P08C14_A3613AlbRefDsc[0] ;
         A51AlbRPieDis = P08C14_A51AlbRPieDis[0] ;
         A57AlbRUniDis = P08C14_A57AlbRUniDis[0] ;
         A252CliCod = P08C14_A252CliCod[0] ;
         A44AlbRecCod = P08C14_A44AlbRecCod[0] ;
         A45AlbRef = P08C14_A45AlbRef[0] ;
         A279CliNom = P08C14_A279CliNom[0] ;
         A49AlbRFen = P08C14_A49AlbRFen[0] ;
         A47AlbREst = P08C14_A47AlbREst[0] ;
         A56AlbRUni = P08C14_A56AlbRUni[0] ;
         A52AlbRPieEnt = P08C14_A52AlbRPieEnt[0] ;
         A54AlbRPieUti = P08C14_A54AlbRPieUti[0] ;
         A58AlbRUniEnt = P08C14_A58AlbRUniEnt[0] ;
         A60AlbRUniUti = P08C14_A60AlbRUniUti[0] ;
         A279CliNom = P08C14_A279CliNom[0] ;
         if ( (GXutil.strcmp("", AV66Webwpalbrecds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A44AlbRecCod, 8, 0) , GXutil.padr( "%" + AV66Webwpalbrecds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV66Webwpalbrecds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV66Webwpalbrecds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A45AlbRef) , GXutil.padr( "%" + GXutil.upper( AV66Webwpalbrecds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3613AlbRefDsc) , GXutil.padr( "%" + GXutil.upper( AV66Webwpalbrecds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "k", ""), "") , GXutil.padr( "%" + GXutil.lower( AV66Webwpalbrecds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "m", ""), "") , GXutil.padr( "%" + GXutil.lower( AV66Webwpalbrecds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A58AlbRUniEnt, 9, 2) , GXutil.padr( "%" + AV66Webwpalbrecds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A57AlbRUniDis, 9, 2) , GXutil.padr( "%" + AV66Webwpalbrecds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A52AlbRPieEnt, 6, 0) , GXutil.padr( "%" + AV66Webwpalbrecds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A51AlbRPieDis, 6, 0) , GXutil.padr( "%" + AV66Webwpalbrecds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "abierta", ""), "") , GXutil.padr( "%" + GXutil.lower( AV66Webwpalbrecds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A47AlbREst == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "cerrada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV66Webwpalbrecds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A47AlbREst == 1 ) ) ) )
         {
            AV30count = 0 ;
            while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P08C14_A3613AlbRefDsc[0], A3613AlbRefDsc) == 0 ) )
            {
               brk8C16 = false ;
               A396EmprCod = P08C14_A396EmprCod[0] ;
               A44AlbRecCod = P08C14_A44AlbRecCod[0] ;
               AV30count = (long)(AV30count+1) ;
               brk8C16 = true ;
               pr_default.readNext(2);
            }
            if ( ! (GXutil.strcmp("", A3613AlbRefDsc)==0) )
            {
               AV22Option = A3613AlbRefDsc ;
               AV23Options.add(AV22Option, 0);
               AV28OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV23Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk8C16 )
         {
            brk8C16 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP3[0] = webwpalbrecgetfilterdata.this.AV24OptionsJson;
      this.aP4[0] = webwpalbrecgetfilterdata.this.AV27OptionsDescJson;
      this.aP5[0] = webwpalbrecgetfilterdata.this.AV29OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV24OptionsJson = "" ;
      AV27OptionsDescJson = "" ;
      AV29OptionIndexesJson = "" ;
      AV23Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV26OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV28OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV31Session = httpContext.getWebSession();
      AV33GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV34GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV61FilterFullText = "" ;
      AV36AlbRFen = GXutil.nullDate() ;
      AV53AlbRFen_To = GXutil.nullDate() ;
      AV56CliNom = "" ;
      AV58AlbRef = "" ;
      AV37TFAlbRFen = GXutil.nullDate() ;
      AV14TFCliNom = "" ;
      AV15TFCliNom_Sel = "" ;
      AV16TFAlbRef = "" ;
      AV17TFAlbRef_Sel = "" ;
      AV39TFAlbRefDsc = "" ;
      AV40TFAlbRefDsc_Sel = "" ;
      AV59TFAlbRUni_SelsJson = "" ;
      AV60TFAlbRUni_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV47TFAlbRUniEnt = DecimalUtil.ZERO ;
      AV48TFAlbRUniEnt_To = DecimalUtil.ZERO ;
      AV41TFAlbRUniDis = DecimalUtil.ZERO ;
      AV42TFAlbRUniDis_To = DecimalUtil.ZERO ;
      AV51TFAlbREst_SelsJson = "" ;
      AV52TFAlbREst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      A279CliNom = "" ;
      AV66Webwpalbrecds_1_filterfulltext = "" ;
      AV67Webwpalbrecds_2_albrfen = GXutil.nullDate() ;
      AV68Webwpalbrecds_3_albrfen_to = GXutil.nullDate() ;
      AV70Webwpalbrecds_5_clinom = "" ;
      AV71Webwpalbrecds_6_albref = "" ;
      AV72Webwpalbrecds_7_tfalbrfen = GXutil.nullDate() ;
      AV77Webwpalbrecds_12_tfclinom = "" ;
      AV78Webwpalbrecds_13_tfclinom_sel = "" ;
      AV79Webwpalbrecds_14_tfalbref = "" ;
      AV80Webwpalbrecds_15_tfalbref_sel = "" ;
      AV81Webwpalbrecds_16_tfalbrefdsc = "" ;
      AV82Webwpalbrecds_17_tfalbrefdsc_sel = "" ;
      AV83Webwpalbrecds_18_tfalbruni_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV84Webwpalbrecds_19_tfalbrunient = DecimalUtil.ZERO ;
      AV85Webwpalbrecds_20_tfalbrunient_to = DecimalUtil.ZERO ;
      AV86Webwpalbrecds_21_tfalbrunidis = DecimalUtil.ZERO ;
      AV87Webwpalbrecds_22_tfalbrunidis_to = DecimalUtil.ZERO ;
      AV92Webwpalbrecds_27_tfalbrest_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      scmdbuf = "" ;
      lV70Webwpalbrecds_5_clinom = "" ;
      lV71Webwpalbrecds_6_albref = "" ;
      lV77Webwpalbrecds_12_tfclinom = "" ;
      lV79Webwpalbrecds_14_tfalbref = "" ;
      lV81Webwpalbrecds_16_tfalbrefdsc = "" ;
      A56AlbRUni = "" ;
      A49AlbRFen = GXutil.nullDate() ;
      A45AlbRef = "" ;
      A3613AlbRefDsc = "" ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A57AlbRUniDis = DecimalUtil.ZERO ;
      P08C12_A396EmprCod = new String[] {""} ;
      P08C12_A279CliNom = new String[] {""} ;
      P08C12_A51AlbRPieDis = new int[1] ;
      P08C12_A57AlbRUniDis = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08C12_A3613AlbRefDsc = new String[] {""} ;
      P08C12_A252CliCod = new int[1] ;
      P08C12_A44AlbRecCod = new int[1] ;
      P08C12_A45AlbRef = new String[] {""} ;
      P08C12_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P08C12_A47AlbREst = new byte[1] ;
      P08C12_A56AlbRUni = new String[] {""} ;
      P08C12_A52AlbRPieEnt = new int[1] ;
      P08C12_A54AlbRPieUti = new int[1] ;
      P08C12_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08C12_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A396EmprCod = "" ;
      AV22Option = "" ;
      P08C13_A396EmprCod = new String[] {""} ;
      P08C13_A45AlbRef = new String[] {""} ;
      P08C13_A51AlbRPieDis = new int[1] ;
      P08C13_A57AlbRUniDis = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08C13_A3613AlbRefDsc = new String[] {""} ;
      P08C13_A252CliCod = new int[1] ;
      P08C13_A44AlbRecCod = new int[1] ;
      P08C13_A279CliNom = new String[] {""} ;
      P08C13_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P08C13_A47AlbREst = new byte[1] ;
      P08C13_A56AlbRUni = new String[] {""} ;
      P08C13_A52AlbRPieEnt = new int[1] ;
      P08C13_A54AlbRPieUti = new int[1] ;
      P08C13_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08C13_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08C14_A396EmprCod = new String[] {""} ;
      P08C14_A3613AlbRefDsc = new String[] {""} ;
      P08C14_A51AlbRPieDis = new int[1] ;
      P08C14_A57AlbRUniDis = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08C14_A252CliCod = new int[1] ;
      P08C14_A44AlbRecCod = new int[1] ;
      P08C14_A45AlbRef = new String[] {""} ;
      P08C14_A279CliNom = new String[] {""} ;
      P08C14_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P08C14_A47AlbREst = new byte[1] ;
      P08C14_A56AlbRUni = new String[] {""} ;
      P08C14_A52AlbRPieEnt = new int[1] ;
      P08C14_A54AlbRPieUti = new int[1] ;
      P08C14_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08C14_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webwpalbrecgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08C12_A396EmprCod, P08C12_A279CliNom, P08C12_A51AlbRPieDis, P08C12_A57AlbRUniDis, P08C12_A3613AlbRefDsc, P08C12_A252CliCod, P08C12_A44AlbRecCod, P08C12_A45AlbRef, P08C12_A49AlbRFen, P08C12_A47AlbREst,
            P08C12_A56AlbRUni, P08C12_A52AlbRPieEnt, P08C12_A54AlbRPieUti, P08C12_A58AlbRUniEnt, P08C12_A60AlbRUniUti
            }
            , new Object[] {
            P08C13_A396EmprCod, P08C13_A45AlbRef, P08C13_A51AlbRPieDis, P08C13_A57AlbRUniDis, P08C13_A3613AlbRefDsc, P08C13_A252CliCod, P08C13_A44AlbRecCod, P08C13_A279CliNom, P08C13_A49AlbRFen, P08C13_A47AlbREst,
            P08C13_A56AlbRUni, P08C13_A52AlbRPieEnt, P08C13_A54AlbRPieUti, P08C13_A58AlbRUniEnt, P08C13_A60AlbRUniUti
            }
            , new Object[] {
            P08C14_A396EmprCod, P08C14_A3613AlbRefDsc, P08C14_A51AlbRPieDis, P08C14_A57AlbRUniDis, P08C14_A252CliCod, P08C14_A44AlbRecCod, P08C14_A45AlbRef, P08C14_A279CliNom, P08C14_A49AlbRFen, P08C14_A47AlbREst,
            P08C14_A56AlbRUni, P08C14_A52AlbRPieEnt, P08C14_A54AlbRPieUti, P08C14_A58AlbRUniEnt, P08C14_A60AlbRUniUti
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV54AlbREst ;
   private byte AV69Webwpalbrecds_4_albrest ;
   private byte A47AlbREst ;
   private short AV55CliNomOperator ;
   private short AV57AlbRefOperator ;
   private short Gx_err ;
   private int AV64GXV1 ;
   private int AV10TFAlbRecCod ;
   private int AV11TFAlbRecCod_To ;
   private int AV12TFCliCod ;
   private int AV13TFCliCod_To ;
   private int AV49TFAlbRPieEnt ;
   private int AV50TFAlbRPieEnt_To ;
   private int AV45TFAlbRPieDis ;
   private int AV46TFAlbRPieDis_To ;
   private int AV73Webwpalbrecds_8_tfalbreccod ;
   private int AV74Webwpalbrecds_9_tfalbreccod_to ;
   private int AV75Webwpalbrecds_10_tfclicod ;
   private int AV76Webwpalbrecds_11_tfclicod_to ;
   private int AV88Webwpalbrecds_23_tfalbrpieent ;
   private int AV89Webwpalbrecds_24_tfalbrpieent_to ;
   private int AV90Webwpalbrecds_25_tfalbrpiedis ;
   private int AV91Webwpalbrecds_26_tfalbrpiedis_to ;
   private int AV83Webwpalbrecds_18_tfalbruni_sels_size ;
   private int AV92Webwpalbrecds_27_tfalbrest_sels_size ;
   private int A44AlbRecCod ;
   private int A252CliCod ;
   private int A52AlbRPieEnt ;
   private int A54AlbRPieUti ;
   private int A51AlbRPieDis ;
   private long AV30count ;
   private java.math.BigDecimal AV47TFAlbRUniEnt ;
   private java.math.BigDecimal AV48TFAlbRUniEnt_To ;
   private java.math.BigDecimal AV41TFAlbRUniDis ;
   private java.math.BigDecimal AV42TFAlbRUniDis_To ;
   private java.math.BigDecimal AV84Webwpalbrecds_19_tfalbrunient ;
   private java.math.BigDecimal AV85Webwpalbrecds_20_tfalbrunient_to ;
   private java.math.BigDecimal AV86Webwpalbrecds_21_tfalbrunidis ;
   private java.math.BigDecimal AV87Webwpalbrecds_22_tfalbrunidis_to ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A57AlbRUniDis ;
   private String AV56CliNom ;
   private String AV58AlbRef ;
   private String AV14TFCliNom ;
   private String AV15TFCliNom_Sel ;
   private String AV16TFAlbRef ;
   private String AV17TFAlbRef_Sel ;
   private String AV39TFAlbRefDsc ;
   private String AV40TFAlbRefDsc_Sel ;
   private String A279CliNom ;
   private String AV70Webwpalbrecds_5_clinom ;
   private String AV71Webwpalbrecds_6_albref ;
   private String AV77Webwpalbrecds_12_tfclinom ;
   private String AV78Webwpalbrecds_13_tfclinom_sel ;
   private String AV79Webwpalbrecds_14_tfalbref ;
   private String AV80Webwpalbrecds_15_tfalbref_sel ;
   private String AV81Webwpalbrecds_16_tfalbrefdsc ;
   private String AV82Webwpalbrecds_17_tfalbrefdsc_sel ;
   private String scmdbuf ;
   private String lV70Webwpalbrecds_5_clinom ;
   private String lV71Webwpalbrecds_6_albref ;
   private String lV77Webwpalbrecds_12_tfclinom ;
   private String lV79Webwpalbrecds_14_tfalbref ;
   private String lV81Webwpalbrecds_16_tfalbrefdsc ;
   private String A56AlbRUni ;
   private String A45AlbRef ;
   private String A3613AlbRefDsc ;
   private String A396EmprCod ;
   private java.util.Date AV36AlbRFen ;
   private java.util.Date AV53AlbRFen_To ;
   private java.util.Date AV37TFAlbRFen ;
   private java.util.Date AV67Webwpalbrecds_2_albrfen ;
   private java.util.Date AV68Webwpalbrecds_3_albrfen_to ;
   private java.util.Date AV72Webwpalbrecds_7_tfalbrfen ;
   private java.util.Date A49AlbRFen ;
   private boolean returnInSub ;
   private boolean brk8C12 ;
   private boolean brk8C14 ;
   private boolean brk8C16 ;
   private String AV24OptionsJson ;
   private String AV27OptionsDescJson ;
   private String AV29OptionIndexesJson ;
   private String AV59TFAlbRUni_SelsJson ;
   private String AV51TFAlbREst_SelsJson ;
   private String AV20DDOName ;
   private String AV18SearchTxt ;
   private String AV19SearchTxtTo ;
   private String AV61FilterFullText ;
   private String AV66Webwpalbrecds_1_filterfulltext ;
   private String AV22Option ;
   private GXSimpleCollection<Byte> AV52TFAlbREst_Sels ;
   private GXSimpleCollection<Byte> AV92Webwpalbrecds_27_tfalbrest_sels ;
   private com.genexus.webpanels.WebSession AV31Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08C12_A396EmprCod ;
   private String[] P08C12_A279CliNom ;
   private int[] P08C12_A51AlbRPieDis ;
   private java.math.BigDecimal[] P08C12_A57AlbRUniDis ;
   private String[] P08C12_A3613AlbRefDsc ;
   private int[] P08C12_A252CliCod ;
   private int[] P08C12_A44AlbRecCod ;
   private String[] P08C12_A45AlbRef ;
   private java.util.Date[] P08C12_A49AlbRFen ;
   private byte[] P08C12_A47AlbREst ;
   private String[] P08C12_A56AlbRUni ;
   private int[] P08C12_A52AlbRPieEnt ;
   private int[] P08C12_A54AlbRPieUti ;
   private java.math.BigDecimal[] P08C12_A58AlbRUniEnt ;
   private java.math.BigDecimal[] P08C12_A60AlbRUniUti ;
   private String[] P08C13_A396EmprCod ;
   private String[] P08C13_A45AlbRef ;
   private int[] P08C13_A51AlbRPieDis ;
   private java.math.BigDecimal[] P08C13_A57AlbRUniDis ;
   private String[] P08C13_A3613AlbRefDsc ;
   private int[] P08C13_A252CliCod ;
   private int[] P08C13_A44AlbRecCod ;
   private String[] P08C13_A279CliNom ;
   private java.util.Date[] P08C13_A49AlbRFen ;
   private byte[] P08C13_A47AlbREst ;
   private String[] P08C13_A56AlbRUni ;
   private int[] P08C13_A52AlbRPieEnt ;
   private int[] P08C13_A54AlbRPieUti ;
   private java.math.BigDecimal[] P08C13_A58AlbRUniEnt ;
   private java.math.BigDecimal[] P08C13_A60AlbRUniUti ;
   private String[] P08C14_A396EmprCod ;
   private String[] P08C14_A3613AlbRefDsc ;
   private int[] P08C14_A51AlbRPieDis ;
   private java.math.BigDecimal[] P08C14_A57AlbRUniDis ;
   private int[] P08C14_A252CliCod ;
   private int[] P08C14_A44AlbRecCod ;
   private String[] P08C14_A45AlbRef ;
   private String[] P08C14_A279CliNom ;
   private java.util.Date[] P08C14_A49AlbRFen ;
   private byte[] P08C14_A47AlbREst ;
   private String[] P08C14_A56AlbRUni ;
   private int[] P08C14_A52AlbRPieEnt ;
   private int[] P08C14_A54AlbRPieUti ;
   private java.math.BigDecimal[] P08C14_A58AlbRUniEnt ;
   private java.math.BigDecimal[] P08C14_A60AlbRUniUti ;
   private GXSimpleCollection<String> AV60TFAlbRUni_Sels ;
   private GXSimpleCollection<String> AV83Webwpalbrecds_18_tfalbruni_sels ;
   private GXSimpleCollection<String> AV23Options ;
   private GXSimpleCollection<String> AV26OptionsDesc ;
   private GXSimpleCollection<String> AV28OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV33GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV34GridStateFilterValue ;
}

final  class webwpalbrecgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08C12( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV83Webwpalbrecds_18_tfalbruni_sels ,
                                          byte A47AlbREst ,
                                          GXSimpleCollection<Byte> AV92Webwpalbrecds_27_tfalbrest_sels ,
                                          java.util.Date AV67Webwpalbrecds_2_albrfen ,
                                          java.util.Date AV68Webwpalbrecds_3_albrfen_to ,
                                          short AV55CliNomOperator ,
                                          String AV70Webwpalbrecds_5_clinom ,
                                          short AV57AlbRefOperator ,
                                          String AV71Webwpalbrecds_6_albref ,
                                          java.util.Date AV72Webwpalbrecds_7_tfalbrfen ,
                                          int AV73Webwpalbrecds_8_tfalbreccod ,
                                          int AV74Webwpalbrecds_9_tfalbreccod_to ,
                                          int AV75Webwpalbrecds_10_tfclicod ,
                                          int AV76Webwpalbrecds_11_tfclicod_to ,
                                          String AV78Webwpalbrecds_13_tfclinom_sel ,
                                          String AV77Webwpalbrecds_12_tfclinom ,
                                          String AV80Webwpalbrecds_15_tfalbref_sel ,
                                          String AV79Webwpalbrecds_14_tfalbref ,
                                          String AV82Webwpalbrecds_17_tfalbrefdsc_sel ,
                                          String AV81Webwpalbrecds_16_tfalbrefdsc ,
                                          int AV83Webwpalbrecds_18_tfalbruni_sels_size ,
                                          java.math.BigDecimal AV84Webwpalbrecds_19_tfalbrunient ,
                                          java.math.BigDecimal AV85Webwpalbrecds_20_tfalbrunient_to ,
                                          java.math.BigDecimal AV86Webwpalbrecds_21_tfalbrunidis ,
                                          java.math.BigDecimal AV87Webwpalbrecds_22_tfalbrunidis_to ,
                                          int AV88Webwpalbrecds_23_tfalbrpieent ,
                                          int AV89Webwpalbrecds_24_tfalbrpieent_to ,
                                          int AV90Webwpalbrecds_25_tfalbrpiedis ,
                                          int AV91Webwpalbrecds_26_tfalbrpiedis_to ,
                                          int AV92Webwpalbrecds_27_tfalbrest_sels_size ,
                                          java.util.Date A49AlbRFen ,
                                          String A279CliNom ,
                                          String A45AlbRef ,
                                          int A44AlbRecCod ,
                                          int A252CliCod ,
                                          String A3613AlbRefDsc ,
                                          java.math.BigDecimal A58AlbRUniEnt ,
                                          java.math.BigDecimal A60AlbRUniUti ,
                                          int A52AlbRPieEnt ,
                                          int A54AlbRPieUti ,
                                          String AV66Webwpalbrecds_1_filterfulltext ,
                                          java.math.BigDecimal A57AlbRUniDis ,
                                          int A51AlbRPieDis ,
                                          byte AV69Webwpalbrecds_4_albrest )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[25];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T2.CliNom, T1.AlbRPieEnt - T1.AlbRPieUti AS AlbRPieDis, CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN" ;
      scmdbuf += " ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END AS AlbRUniDis, T1.AlbRefDsc, T1.CliCod, T1.AlbRecCod, T1.AlbRef, T1.AlbRFen, T1.AlbREst, T1.AlbRUni, T1.AlbRPieEnt," ;
      scmdbuf += " T1.AlbRPieUti, T1.AlbRUniEnt, T1.AlbRUniUti FROM (TXPALBREC T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.AlbREst = ? or ? = 9)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV67Webwpalbrecds_2_albrfen)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV68Webwpalbrecds_3_albrfen_to)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen <= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ( AV55CliNomOperator == 0 ) && ( ! (GXutil.strcmp("", AV70Webwpalbrecds_5_clinom)==0) ) )
      {
         addWhere(sWhereString, "(T2.CliNom like '%' || ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ( AV57AlbRefOperator == 0 ) && ( ! (GXutil.strcmp("", AV71Webwpalbrecds_6_albref)==0) ) )
      {
         addWhere(sWhereString, "(T1.AlbRef like '%' || ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV72Webwpalbrecds_7_tfalbrfen)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (0==AV73Webwpalbrecds_8_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (0==AV74Webwpalbrecds_9_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (0==AV75Webwpalbrecds_10_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (0==AV76Webwpalbrecds_11_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Webwpalbrecds_13_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV77Webwpalbrecds_12_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Webwpalbrecds_13_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Webwpalbrecds_15_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV79Webwpalbrecds_14_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Webwpalbrecds_15_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef = ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Webwpalbrecds_17_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV81Webwpalbrecds_16_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Webwpalbrecds_17_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( AV83Webwpalbrecds_18_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV83Webwpalbrecds_18_tfalbruni_sels, "T1.AlbRUni IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Webwpalbrecds_19_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Webwpalbrecds_20_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV86Webwpalbrecds_21_tfalbrunidis)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) >= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87Webwpalbrecds_22_tfalbrunidis_to)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) <= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (0==AV88Webwpalbrecds_23_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (0==AV89Webwpalbrecds_24_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (0==AV90Webwpalbrecds_25_tfalbrpiedis) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) >= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (0==AV91Webwpalbrecds_26_tfalbrpiedis_to) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) <= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( AV92Webwpalbrecds_27_tfalbrest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV92Webwpalbrecds_27_tfalbrest_sels, "T1.AlbREst IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.CliNom" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08C13( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV83Webwpalbrecds_18_tfalbruni_sels ,
                                          byte A47AlbREst ,
                                          GXSimpleCollection<Byte> AV92Webwpalbrecds_27_tfalbrest_sels ,
                                          java.util.Date AV67Webwpalbrecds_2_albrfen ,
                                          java.util.Date AV68Webwpalbrecds_3_albrfen_to ,
                                          short AV55CliNomOperator ,
                                          String AV70Webwpalbrecds_5_clinom ,
                                          short AV57AlbRefOperator ,
                                          String AV71Webwpalbrecds_6_albref ,
                                          java.util.Date AV72Webwpalbrecds_7_tfalbrfen ,
                                          int AV73Webwpalbrecds_8_tfalbreccod ,
                                          int AV74Webwpalbrecds_9_tfalbreccod_to ,
                                          int AV75Webwpalbrecds_10_tfclicod ,
                                          int AV76Webwpalbrecds_11_tfclicod_to ,
                                          String AV78Webwpalbrecds_13_tfclinom_sel ,
                                          String AV77Webwpalbrecds_12_tfclinom ,
                                          String AV80Webwpalbrecds_15_tfalbref_sel ,
                                          String AV79Webwpalbrecds_14_tfalbref ,
                                          String AV82Webwpalbrecds_17_tfalbrefdsc_sel ,
                                          String AV81Webwpalbrecds_16_tfalbrefdsc ,
                                          int AV83Webwpalbrecds_18_tfalbruni_sels_size ,
                                          java.math.BigDecimal AV84Webwpalbrecds_19_tfalbrunient ,
                                          java.math.BigDecimal AV85Webwpalbrecds_20_tfalbrunient_to ,
                                          java.math.BigDecimal AV86Webwpalbrecds_21_tfalbrunidis ,
                                          java.math.BigDecimal AV87Webwpalbrecds_22_tfalbrunidis_to ,
                                          int AV88Webwpalbrecds_23_tfalbrpieent ,
                                          int AV89Webwpalbrecds_24_tfalbrpieent_to ,
                                          int AV90Webwpalbrecds_25_tfalbrpiedis ,
                                          int AV91Webwpalbrecds_26_tfalbrpiedis_to ,
                                          int AV92Webwpalbrecds_27_tfalbrest_sels_size ,
                                          java.util.Date A49AlbRFen ,
                                          String A279CliNom ,
                                          String A45AlbRef ,
                                          int A44AlbRecCod ,
                                          int A252CliCod ,
                                          String A3613AlbRefDsc ,
                                          java.math.BigDecimal A58AlbRUniEnt ,
                                          java.math.BigDecimal A60AlbRUniUti ,
                                          int A52AlbRPieEnt ,
                                          int A54AlbRPieUti ,
                                          String AV66Webwpalbrecds_1_filterfulltext ,
                                          java.math.BigDecimal A57AlbRUniDis ,
                                          int A51AlbRPieDis ,
                                          byte AV69Webwpalbrecds_4_albrest )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[25];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.AlbRef, T1.AlbRPieEnt - T1.AlbRPieUti AS AlbRPieDis, CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN" ;
      scmdbuf += " ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END AS AlbRUniDis, T1.AlbRefDsc, T1.CliCod, T1.AlbRecCod, T2.CliNom, T1.AlbRFen, T1.AlbREst, T1.AlbRUni, T1.AlbRPieEnt," ;
      scmdbuf += " T1.AlbRPieUti, T1.AlbRUniEnt, T1.AlbRUniUti FROM (TXPALBREC T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.AlbREst = ? or ? = 9)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV67Webwpalbrecds_2_albrfen)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int5[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV68Webwpalbrecds_3_albrfen_to)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen <= ?)");
      }
      else
      {
         GXv_int5[3] = (byte)(1) ;
      }
      if ( ( AV55CliNomOperator == 0 ) && ( ! (GXutil.strcmp("", AV70Webwpalbrecds_5_clinom)==0) ) )
      {
         addWhere(sWhereString, "(T2.CliNom like '%' || ?)");
      }
      else
      {
         GXv_int5[4] = (byte)(1) ;
      }
      if ( ( AV57AlbRefOperator == 0 ) && ( ! (GXutil.strcmp("", AV71Webwpalbrecds_6_albref)==0) ) )
      {
         addWhere(sWhereString, "(T1.AlbRef like '%' || ?)");
      }
      else
      {
         GXv_int5[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV72Webwpalbrecds_7_tfalbrfen)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int5[6] = (byte)(1) ;
      }
      if ( ! (0==AV73Webwpalbrecds_8_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int5[7] = (byte)(1) ;
      }
      if ( ! (0==AV74Webwpalbrecds_9_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int5[8] = (byte)(1) ;
      }
      if ( ! (0==AV75Webwpalbrecds_10_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int5[9] = (byte)(1) ;
      }
      if ( ! (0==AV76Webwpalbrecds_11_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int5[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Webwpalbrecds_13_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV77Webwpalbrecds_12_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Webwpalbrecds_13_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int5[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Webwpalbrecds_15_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV79Webwpalbrecds_14_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Webwpalbrecds_15_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef = ?)");
      }
      else
      {
         GXv_int5[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Webwpalbrecds_17_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV81Webwpalbrecds_16_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Webwpalbrecds_17_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int5[16] = (byte)(1) ;
      }
      if ( AV83Webwpalbrecds_18_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV83Webwpalbrecds_18_tfalbruni_sels, "T1.AlbRUni IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Webwpalbrecds_19_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int5[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Webwpalbrecds_20_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int5[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV86Webwpalbrecds_21_tfalbrunidis)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) >= ?)");
      }
      else
      {
         GXv_int5[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87Webwpalbrecds_22_tfalbrunidis_to)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) <= ?)");
      }
      else
      {
         GXv_int5[20] = (byte)(1) ;
      }
      if ( ! (0==AV88Webwpalbrecds_23_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int5[21] = (byte)(1) ;
      }
      if ( ! (0==AV89Webwpalbrecds_24_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int5[22] = (byte)(1) ;
      }
      if ( ! (0==AV90Webwpalbrecds_25_tfalbrpiedis) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) >= ?)");
      }
      else
      {
         GXv_int5[23] = (byte)(1) ;
      }
      if ( ! (0==AV91Webwpalbrecds_26_tfalbrpiedis_to) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) <= ?)");
      }
      else
      {
         GXv_int5[24] = (byte)(1) ;
      }
      if ( AV92Webwpalbrecds_27_tfalbrest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV92Webwpalbrecds_27_tfalbrest_sels, "T1.AlbREst IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.AlbRef" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   protected Object[] conditional_P08C14( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV83Webwpalbrecds_18_tfalbruni_sels ,
                                          byte A47AlbREst ,
                                          GXSimpleCollection<Byte> AV92Webwpalbrecds_27_tfalbrest_sels ,
                                          java.util.Date AV67Webwpalbrecds_2_albrfen ,
                                          java.util.Date AV68Webwpalbrecds_3_albrfen_to ,
                                          short AV55CliNomOperator ,
                                          String AV70Webwpalbrecds_5_clinom ,
                                          short AV57AlbRefOperator ,
                                          String AV71Webwpalbrecds_6_albref ,
                                          java.util.Date AV72Webwpalbrecds_7_tfalbrfen ,
                                          int AV73Webwpalbrecds_8_tfalbreccod ,
                                          int AV74Webwpalbrecds_9_tfalbreccod_to ,
                                          int AV75Webwpalbrecds_10_tfclicod ,
                                          int AV76Webwpalbrecds_11_tfclicod_to ,
                                          String AV78Webwpalbrecds_13_tfclinom_sel ,
                                          String AV77Webwpalbrecds_12_tfclinom ,
                                          String AV80Webwpalbrecds_15_tfalbref_sel ,
                                          String AV79Webwpalbrecds_14_tfalbref ,
                                          String AV82Webwpalbrecds_17_tfalbrefdsc_sel ,
                                          String AV81Webwpalbrecds_16_tfalbrefdsc ,
                                          int AV83Webwpalbrecds_18_tfalbruni_sels_size ,
                                          java.math.BigDecimal AV84Webwpalbrecds_19_tfalbrunient ,
                                          java.math.BigDecimal AV85Webwpalbrecds_20_tfalbrunient_to ,
                                          java.math.BigDecimal AV86Webwpalbrecds_21_tfalbrunidis ,
                                          java.math.BigDecimal AV87Webwpalbrecds_22_tfalbrunidis_to ,
                                          int AV88Webwpalbrecds_23_tfalbrpieent ,
                                          int AV89Webwpalbrecds_24_tfalbrpieent_to ,
                                          int AV90Webwpalbrecds_25_tfalbrpiedis ,
                                          int AV91Webwpalbrecds_26_tfalbrpiedis_to ,
                                          int AV92Webwpalbrecds_27_tfalbrest_sels_size ,
                                          java.util.Date A49AlbRFen ,
                                          String A279CliNom ,
                                          String A45AlbRef ,
                                          int A44AlbRecCod ,
                                          int A252CliCod ,
                                          String A3613AlbRefDsc ,
                                          java.math.BigDecimal A58AlbRUniEnt ,
                                          java.math.BigDecimal A60AlbRUniUti ,
                                          int A52AlbRPieEnt ,
                                          int A54AlbRPieUti ,
                                          String AV66Webwpalbrecds_1_filterfulltext ,
                                          java.math.BigDecimal A57AlbRUniDis ,
                                          int A51AlbRPieDis ,
                                          byte AV69Webwpalbrecds_4_albrest )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[25];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.AlbRefDsc, T1.AlbRPieEnt - T1.AlbRPieUti AS AlbRPieDis, CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti" ;
      scmdbuf += " WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END AS AlbRUniDis, T1.CliCod, T1.AlbRecCod, T1.AlbRef, T2.CliNom, T1.AlbRFen, T1.AlbREst, T1.AlbRUni, T1.AlbRPieEnt," ;
      scmdbuf += " T1.AlbRPieUti, T1.AlbRUniEnt, T1.AlbRUniUti FROM (TXPALBREC T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.AlbREst = ? or ? = 9)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV67Webwpalbrecds_2_albrfen)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV68Webwpalbrecds_3_albrfen_to)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen <= ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( ( AV55CliNomOperator == 0 ) && ( ! (GXutil.strcmp("", AV70Webwpalbrecds_5_clinom)==0) ) )
      {
         addWhere(sWhereString, "(T2.CliNom like '%' || ?)");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ( AV57AlbRefOperator == 0 ) && ( ! (GXutil.strcmp("", AV71Webwpalbrecds_6_albref)==0) ) )
      {
         addWhere(sWhereString, "(T1.AlbRef like '%' || ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV72Webwpalbrecds_7_tfalbrfen)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (0==AV73Webwpalbrecds_8_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (0==AV74Webwpalbrecds_9_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (0==AV75Webwpalbrecds_10_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (0==AV76Webwpalbrecds_11_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Webwpalbrecds_13_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV77Webwpalbrecds_12_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Webwpalbrecds_13_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Webwpalbrecds_15_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV79Webwpalbrecds_14_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Webwpalbrecds_15_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef = ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Webwpalbrecds_17_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV81Webwpalbrecds_16_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Webwpalbrecds_17_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( AV83Webwpalbrecds_18_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV83Webwpalbrecds_18_tfalbruni_sels, "T1.AlbRUni IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Webwpalbrecds_19_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Webwpalbrecds_20_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV86Webwpalbrecds_21_tfalbrunidis)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) >= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87Webwpalbrecds_22_tfalbrunidis_to)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) <= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (0==AV88Webwpalbrecds_23_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (0==AV89Webwpalbrecds_24_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (0==AV90Webwpalbrecds_25_tfalbrpiedis) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) >= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (0==AV91Webwpalbrecds_26_tfalbrpiedis_to) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) <= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( AV92Webwpalbrecds_27_tfalbrest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV92Webwpalbrecds_27_tfalbrest_sels, "T1.AlbREst IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.AlbRefDsc" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
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
                  return conditional_P08C12(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , (String)dynConstraints[7] , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , (java.util.Date)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , (java.util.Date)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).intValue() , (String)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , ((Number) dynConstraints[44]).byteValue() );
            case 1 :
                  return conditional_P08C13(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , (String)dynConstraints[7] , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , (java.util.Date)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , (java.util.Date)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).intValue() , (String)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , ((Number) dynConstraints[44]).byteValue() );
            case 2 :
                  return conditional_P08C14(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , (String)dynConstraints[7] , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , (java.util.Date)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , (java.util.Date)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).intValue() , (String)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , ((Number) dynConstraints[44]).byteValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08C12", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08C13", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08C14", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,2);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,2);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,2);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,2);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,2);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,2);
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
                  stmt.setByte(sIdx, ((Number) parms[25]).byteValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[26]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[27]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[28]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[31]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[25]).byteValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[26]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[27]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[28]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[31]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[25]).byteValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[26]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[27]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[28]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[31]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               return;
      }
   }

}

