package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tdevpie2wwgetfilterdata extends GXProcedure
{
   public tdevpie2wwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tdevpie2wwgetfilterdata.class ), "" );
   }

   public tdevpie2wwgetfilterdata( int remoteHandle ,
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
      tdevpie2wwgetfilterdata.this.aP5 = new String[] {""};
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
      tdevpie2wwgetfilterdata.this.AV40DDOName = aP0;
      tdevpie2wwgetfilterdata.this.AV38SearchTxt = aP1;
      tdevpie2wwgetfilterdata.this.AV39SearchTxtTo = aP2;
      tdevpie2wwgetfilterdata.this.aP3 = aP3;
      tdevpie2wwgetfilterdata.this.aP4 = aP4;
      tdevpie2wwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV43Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV46OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV48OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV40DDOName), "DDO_CLINOM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV40DDOName), "DDO_ALBREF") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV40DDOName), "DDO_DEVTRNNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADDEVTRNNOMOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV44OptionsJson = AV43Options.toJSonString(false) ;
      AV47OptionsDescJson = AV46OptionsDesc.toJSonString(false) ;
      AV49OptionIndexesJson = AV48OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV51Session.getValue("TDevPie2WWGridState"), "") == 0 )
      {
         AV53GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TDevPie2WWGridState"), null, null);
      }
      else
      {
         AV53GridState.fromxml(AV51Session.getValue("TDevPie2WWGridState"), null, null);
      }
      AV81GXV1 = 1 ;
      while ( AV81GXV1 <= AV53GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV54GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV53GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV81GXV1));
         if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV78FilterFullText = AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVGENCOD") == 0 )
         {
            AV10TFDevGenCod = (int)(GXutil.lval( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFDevGenCod_To = (int)(GXutil.lval( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVGENFEC") == 0 )
         {
            AV12TFDevGenFec = localUtil.ctod( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRECCOD") == 0 )
         {
            AV14TFAlbRecCod = (int)(GXutil.lval( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV15TFAlbRecCod_To = (int)(GXutil.lval( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVGENDOM") == 0 )
         {
            AV16TFDevGenDom = (byte)(GXutil.lval( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV17TFDevGenDom_To = (byte)(GXutil.lval( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV18TFCliCod = (int)(GXutil.lval( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV19TFCliCod_To = (int)(GXutil.lval( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV20TFCliNom = AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV21TFCliNom_Sel = AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF") == 0 )
         {
            AV22TFAlbRef = AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF_SEL") == 0 )
         {
            AV23TFAlbRef_Sel = AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVGENTRN") == 0 )
         {
            AV24TFDevGenTrn = (short)(GXutil.lval( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV25TFDevGenTrn_To = (short)(GXutil.lval( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVTRNNOM") == 0 )
         {
            AV26TFDevTrnNom = AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVTRNNOM_SEL") == 0 )
         {
            AV27TFDevTrnNom_Sel = AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNIDIS") == 0 )
         {
            AV28TFAlbRUniDis = CommonUtil.decimalVal( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV29TFAlbRUniDis_To = CommonUtil.decimalVal( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRPIEDIS") == 0 )
         {
            AV30TFAlbRPieDis = (int)(GXutil.lval( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV31TFAlbRPieDis_To = (int)(GXutil.lval( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNI_SEL") == 0 )
         {
            AV76TFAlbRUni_SelsJson = AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV77TFAlbRUni_Sels.fromJSonString(AV76TFAlbRUni_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVGENUNI") == 0 )
         {
            AV34TFDevGenUni = CommonUtil.decimalVal( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV35TFDevGenUni_To = CommonUtil.decimalVal( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVGENPIE") == 0 )
         {
            AV36TFDevGenPie = (short)(GXutil.lval( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV37TFDevGenPie_To = (short)(GXutil.lval( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         AV81GXV1 = (int)(AV81GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV20TFCliNom = AV38SearchTxt ;
      AV21TFCliNom_Sel = "" ;
      AV83Tdevpie2wwds_1_filterfulltext = AV78FilterFullText ;
      AV84Tdevpie2wwds_2_tfdevgencod = AV10TFDevGenCod ;
      AV85Tdevpie2wwds_3_tfdevgencod_to = AV11TFDevGenCod_To ;
      AV86Tdevpie2wwds_4_tfdevgenfec = AV12TFDevGenFec ;
      AV87Tdevpie2wwds_5_tfalbreccod = AV14TFAlbRecCod ;
      AV88Tdevpie2wwds_6_tfalbreccod_to = AV15TFAlbRecCod_To ;
      AV89Tdevpie2wwds_7_tfdevgendom = AV16TFDevGenDom ;
      AV90Tdevpie2wwds_8_tfdevgendom_to = AV17TFDevGenDom_To ;
      AV91Tdevpie2wwds_9_tfclicod = AV18TFCliCod ;
      AV92Tdevpie2wwds_10_tfclicod_to = AV19TFCliCod_To ;
      AV93Tdevpie2wwds_11_tfclinom = AV20TFCliNom ;
      AV94Tdevpie2wwds_12_tfclinom_sel = AV21TFCliNom_Sel ;
      AV95Tdevpie2wwds_13_tfalbref = AV22TFAlbRef ;
      AV96Tdevpie2wwds_14_tfalbref_sel = AV23TFAlbRef_Sel ;
      AV97Tdevpie2wwds_15_tfdevgentrn = AV24TFDevGenTrn ;
      AV98Tdevpie2wwds_16_tfdevgentrn_to = AV25TFDevGenTrn_To ;
      AV99Tdevpie2wwds_17_tfdevtrnnom = AV26TFDevTrnNom ;
      AV100Tdevpie2wwds_18_tfdevtrnnom_sel = AV27TFDevTrnNom_Sel ;
      AV101Tdevpie2wwds_19_tfalbrunidis = AV28TFAlbRUniDis ;
      AV102Tdevpie2wwds_20_tfalbrunidis_to = AV29TFAlbRUniDis_To ;
      AV103Tdevpie2wwds_21_tfalbrpiedis = AV30TFAlbRPieDis ;
      AV104Tdevpie2wwds_22_tfalbrpiedis_to = AV31TFAlbRPieDis_To ;
      AV105Tdevpie2wwds_23_tfalbruni_sels = AV77TFAlbRUni_Sels ;
      AV106Tdevpie2wwds_24_tfdevgenuni = AV34TFDevGenUni ;
      AV107Tdevpie2wwds_25_tfdevgenuni_to = AV35TFDevGenUni_To ;
      AV108Tdevpie2wwds_26_tfdevgenpie = AV36TFDevGenPie ;
      AV109Tdevpie2wwds_27_tfdevgenpie_to = AV37TFDevGenPie_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A56AlbRUni ,
                                           AV105Tdevpie2wwds_23_tfalbruni_sels ,
                                           Integer.valueOf(AV84Tdevpie2wwds_2_tfdevgencod) ,
                                           Integer.valueOf(AV85Tdevpie2wwds_3_tfdevgencod_to) ,
                                           AV86Tdevpie2wwds_4_tfdevgenfec ,
                                           Integer.valueOf(AV87Tdevpie2wwds_5_tfalbreccod) ,
                                           Integer.valueOf(AV88Tdevpie2wwds_6_tfalbreccod_to) ,
                                           Byte.valueOf(AV89Tdevpie2wwds_7_tfdevgendom) ,
                                           Byte.valueOf(AV90Tdevpie2wwds_8_tfdevgendom_to) ,
                                           Integer.valueOf(AV91Tdevpie2wwds_9_tfclicod) ,
                                           Integer.valueOf(AV92Tdevpie2wwds_10_tfclicod_to) ,
                                           AV94Tdevpie2wwds_12_tfclinom_sel ,
                                           AV93Tdevpie2wwds_11_tfclinom ,
                                           AV96Tdevpie2wwds_14_tfalbref_sel ,
                                           AV95Tdevpie2wwds_13_tfalbref ,
                                           Short.valueOf(AV97Tdevpie2wwds_15_tfdevgentrn) ,
                                           Short.valueOf(AV98Tdevpie2wwds_16_tfdevgentrn_to) ,
                                           AV100Tdevpie2wwds_18_tfdevtrnnom_sel ,
                                           AV99Tdevpie2wwds_17_tfdevtrnnom ,
                                           AV101Tdevpie2wwds_19_tfalbrunidis ,
                                           AV102Tdevpie2wwds_20_tfalbrunidis_to ,
                                           Integer.valueOf(AV103Tdevpie2wwds_21_tfalbrpiedis) ,
                                           Integer.valueOf(AV104Tdevpie2wwds_22_tfalbrpiedis_to) ,
                                           Integer.valueOf(AV105Tdevpie2wwds_23_tfalbruni_sels.size()) ,
                                           AV106Tdevpie2wwds_24_tfdevgenuni ,
                                           AV107Tdevpie2wwds_25_tfdevgenuni_to ,
                                           Short.valueOf(AV108Tdevpie2wwds_26_tfdevgenpie) ,
                                           Short.valueOf(AV109Tdevpie2wwds_27_tfdevgenpie_to) ,
                                           Integer.valueOf(A323DevGenCod) ,
                                           A325DevGenFec ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           Byte.valueOf(A6288DevGenDom) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A45AlbRef ,
                                           Short.valueOf(A327DevGenTrn) ,
                                           A329DevTrnNom ,
                                           A58AlbRUniEnt ,
                                           A60AlbRUniUti ,
                                           Integer.valueOf(A52AlbRPieEnt) ,
                                           Integer.valueOf(A54AlbRPieUti) ,
                                           A328DevGenUni ,
                                           Short.valueOf(A326DevGenPie) ,
                                           AV83Tdevpie2wwds_1_filterfulltext ,
                                           A57AlbRUniDis ,
                                           Integer.valueOf(A51AlbRPieDis) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.INT
                                           }
      });
      lV93Tdevpie2wwds_11_tfclinom = GXutil.padr( GXutil.rtrim( AV93Tdevpie2wwds_11_tfclinom), 30, "%") ;
      lV95Tdevpie2wwds_13_tfalbref = GXutil.padr( GXutil.rtrim( AV95Tdevpie2wwds_13_tfalbref), 16, "%") ;
      lV99Tdevpie2wwds_17_tfdevtrnnom = GXutil.padr( GXutil.rtrim( AV99Tdevpie2wwds_17_tfdevtrnnom), 30, "%") ;
      /* Using cursor P086N2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV84Tdevpie2wwds_2_tfdevgencod), Integer.valueOf(AV85Tdevpie2wwds_3_tfdevgencod_to), AV86Tdevpie2wwds_4_tfdevgenfec, Integer.valueOf(AV87Tdevpie2wwds_5_tfalbreccod), Integer.valueOf(AV88Tdevpie2wwds_6_tfalbreccod_to), Byte.valueOf(AV89Tdevpie2wwds_7_tfdevgendom), Byte.valueOf(AV90Tdevpie2wwds_8_tfdevgendom_to), Integer.valueOf(AV91Tdevpie2wwds_9_tfclicod), Integer.valueOf(AV92Tdevpie2wwds_10_tfclicod_to), lV93Tdevpie2wwds_11_tfclinom, AV94Tdevpie2wwds_12_tfclinom_sel, lV95Tdevpie2wwds_13_tfalbref, AV96Tdevpie2wwds_14_tfalbref_sel, Short.valueOf(AV97Tdevpie2wwds_15_tfdevgentrn), Short.valueOf(AV98Tdevpie2wwds_16_tfdevgentrn_to), lV99Tdevpie2wwds_17_tfdevtrnnom, AV100Tdevpie2wwds_18_tfdevtrnnom_sel, AV101Tdevpie2wwds_19_tfalbrunidis, AV102Tdevpie2wwds_20_tfalbrunidis_to, Integer.valueOf(AV103Tdevpie2wwds_21_tfalbrpiedis), Integer.valueOf(AV104Tdevpie2wwds_22_tfalbrpiedis_to), AV106Tdevpie2wwds_24_tfdevgenuni, AV107Tdevpie2wwds_25_tfdevgenuni_to, Short.valueOf(AV108Tdevpie2wwds_26_tfdevgenpie), Short.valueOf(AV109Tdevpie2wwds_27_tfdevgenpie_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk86N2 = false ;
         A396EmprCod = P086N2_A396EmprCod[0] ;
         A279CliNom = P086N2_A279CliNom[0] ;
         A326DevGenPie = P086N2_A326DevGenPie[0] ;
         n326DevGenPie = P086N2_n326DevGenPie[0] ;
         A328DevGenUni = P086N2_A328DevGenUni[0] ;
         n328DevGenUni = P086N2_n328DevGenUni[0] ;
         A51AlbRPieDis = P086N2_A51AlbRPieDis[0] ;
         A57AlbRUniDis = P086N2_A57AlbRUniDis[0] ;
         A329DevTrnNom = P086N2_A329DevTrnNom[0] ;
         n329DevTrnNom = P086N2_n329DevTrnNom[0] ;
         A327DevGenTrn = P086N2_A327DevGenTrn[0] ;
         n327DevGenTrn = P086N2_n327DevGenTrn[0] ;
         A45AlbRef = P086N2_A45AlbRef[0] ;
         A252CliCod = P086N2_A252CliCod[0] ;
         n252CliCod = P086N2_n252CliCod[0] ;
         A6288DevGenDom = P086N2_A6288DevGenDom[0] ;
         n6288DevGenDom = P086N2_n6288DevGenDom[0] ;
         A44AlbRecCod = P086N2_A44AlbRecCod[0] ;
         n44AlbRecCod = P086N2_n44AlbRecCod[0] ;
         A325DevGenFec = P086N2_A325DevGenFec[0] ;
         n325DevGenFec = P086N2_n325DevGenFec[0] ;
         A323DevGenCod = P086N2_A323DevGenCod[0] ;
         A56AlbRUni = P086N2_A56AlbRUni[0] ;
         A52AlbRPieEnt = P086N2_A52AlbRPieEnt[0] ;
         A54AlbRPieUti = P086N2_A54AlbRPieUti[0] ;
         A58AlbRUniEnt = P086N2_A58AlbRUniEnt[0] ;
         A60AlbRUniUti = P086N2_A60AlbRUniUti[0] ;
         A329DevTrnNom = P086N2_A329DevTrnNom[0] ;
         n329DevTrnNom = P086N2_n329DevTrnNom[0] ;
         A279CliNom = P086N2_A279CliNom[0] ;
         A51AlbRPieDis = P086N2_A51AlbRPieDis[0] ;
         A57AlbRUniDis = P086N2_A57AlbRUniDis[0] ;
         A45AlbRef = P086N2_A45AlbRef[0] ;
         A56AlbRUni = P086N2_A56AlbRUni[0] ;
         A52AlbRPieEnt = P086N2_A52AlbRPieEnt[0] ;
         A54AlbRPieUti = P086N2_A54AlbRPieUti[0] ;
         A58AlbRUniEnt = P086N2_A58AlbRUniEnt[0] ;
         A60AlbRUniUti = P086N2_A60AlbRUniUti[0] ;
         if ( (GXutil.strcmp("", AV83Tdevpie2wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A323DevGenCod, 8, 0) , GXutil.padr( "%" + AV83Tdevpie2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A44AlbRecCod, 8, 0) , GXutil.padr( "%" + AV83Tdevpie2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A6288DevGenDom, 1, 0) , GXutil.padr( "%" + AV83Tdevpie2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV83Tdevpie2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV83Tdevpie2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A45AlbRef) , GXutil.padr( "%" + GXutil.upper( AV83Tdevpie2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A327DevGenTrn, 4, 0) , GXutil.padr( "%" + AV83Tdevpie2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A329DevTrnNom) , GXutil.padr( "%" + GXutil.upper( AV83Tdevpie2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A57AlbRUniDis, 9, 2) , GXutil.padr( "%" + AV83Tdevpie2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A51AlbRPieDis, 6, 0) , GXutil.padr( "%" + AV83Tdevpie2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "k", ""), "") , GXutil.padr( "%" + GXutil.lower( AV83Tdevpie2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "m", ""), "") , GXutil.padr( "%" + GXutil.lower( AV83Tdevpie2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A328DevGenUni, 9, 2) , GXutil.padr( "%" + AV83Tdevpie2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A326DevGenPie, 4, 0) , GXutil.padr( "%" + AV83Tdevpie2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            AV50count = 0 ;
            while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P086N2_A279CliNom[0], A279CliNom) == 0 ) )
            {
               brk86N2 = false ;
               A396EmprCod = P086N2_A396EmprCod[0] ;
               A252CliCod = P086N2_A252CliCod[0] ;
               n252CliCod = P086N2_n252CliCod[0] ;
               A323DevGenCod = P086N2_A323DevGenCod[0] ;
               AV50count = (long)(AV50count+1) ;
               brk86N2 = true ;
               pr_default.readNext(0);
            }
            if ( ! (GXutil.strcmp("", A279CliNom)==0) )
            {
               AV42Option = A279CliNom ;
               AV43Options.add(AV42Option, 0);
               AV48OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV50count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV43Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk86N2 )
         {
            brk86N2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADALBREFOPTIONS' Routine */
      returnInSub = false ;
      AV22TFAlbRef = AV38SearchTxt ;
      AV23TFAlbRef_Sel = "" ;
      AV83Tdevpie2wwds_1_filterfulltext = AV78FilterFullText ;
      AV84Tdevpie2wwds_2_tfdevgencod = AV10TFDevGenCod ;
      AV85Tdevpie2wwds_3_tfdevgencod_to = AV11TFDevGenCod_To ;
      AV86Tdevpie2wwds_4_tfdevgenfec = AV12TFDevGenFec ;
      AV87Tdevpie2wwds_5_tfalbreccod = AV14TFAlbRecCod ;
      AV88Tdevpie2wwds_6_tfalbreccod_to = AV15TFAlbRecCod_To ;
      AV89Tdevpie2wwds_7_tfdevgendom = AV16TFDevGenDom ;
      AV90Tdevpie2wwds_8_tfdevgendom_to = AV17TFDevGenDom_To ;
      AV91Tdevpie2wwds_9_tfclicod = AV18TFCliCod ;
      AV92Tdevpie2wwds_10_tfclicod_to = AV19TFCliCod_To ;
      AV93Tdevpie2wwds_11_tfclinom = AV20TFCliNom ;
      AV94Tdevpie2wwds_12_tfclinom_sel = AV21TFCliNom_Sel ;
      AV95Tdevpie2wwds_13_tfalbref = AV22TFAlbRef ;
      AV96Tdevpie2wwds_14_tfalbref_sel = AV23TFAlbRef_Sel ;
      AV97Tdevpie2wwds_15_tfdevgentrn = AV24TFDevGenTrn ;
      AV98Tdevpie2wwds_16_tfdevgentrn_to = AV25TFDevGenTrn_To ;
      AV99Tdevpie2wwds_17_tfdevtrnnom = AV26TFDevTrnNom ;
      AV100Tdevpie2wwds_18_tfdevtrnnom_sel = AV27TFDevTrnNom_Sel ;
      AV101Tdevpie2wwds_19_tfalbrunidis = AV28TFAlbRUniDis ;
      AV102Tdevpie2wwds_20_tfalbrunidis_to = AV29TFAlbRUniDis_To ;
      AV103Tdevpie2wwds_21_tfalbrpiedis = AV30TFAlbRPieDis ;
      AV104Tdevpie2wwds_22_tfalbrpiedis_to = AV31TFAlbRPieDis_To ;
      AV105Tdevpie2wwds_23_tfalbruni_sels = AV77TFAlbRUni_Sels ;
      AV106Tdevpie2wwds_24_tfdevgenuni = AV34TFDevGenUni ;
      AV107Tdevpie2wwds_25_tfdevgenuni_to = AV35TFDevGenUni_To ;
      AV108Tdevpie2wwds_26_tfdevgenpie = AV36TFDevGenPie ;
      AV109Tdevpie2wwds_27_tfdevgenpie_to = AV37TFDevGenPie_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           A56AlbRUni ,
                                           AV105Tdevpie2wwds_23_tfalbruni_sels ,
                                           Integer.valueOf(AV84Tdevpie2wwds_2_tfdevgencod) ,
                                           Integer.valueOf(AV85Tdevpie2wwds_3_tfdevgencod_to) ,
                                           AV86Tdevpie2wwds_4_tfdevgenfec ,
                                           Integer.valueOf(AV87Tdevpie2wwds_5_tfalbreccod) ,
                                           Integer.valueOf(AV88Tdevpie2wwds_6_tfalbreccod_to) ,
                                           Byte.valueOf(AV89Tdevpie2wwds_7_tfdevgendom) ,
                                           Byte.valueOf(AV90Tdevpie2wwds_8_tfdevgendom_to) ,
                                           Integer.valueOf(AV91Tdevpie2wwds_9_tfclicod) ,
                                           Integer.valueOf(AV92Tdevpie2wwds_10_tfclicod_to) ,
                                           AV94Tdevpie2wwds_12_tfclinom_sel ,
                                           AV93Tdevpie2wwds_11_tfclinom ,
                                           AV96Tdevpie2wwds_14_tfalbref_sel ,
                                           AV95Tdevpie2wwds_13_tfalbref ,
                                           Short.valueOf(AV97Tdevpie2wwds_15_tfdevgentrn) ,
                                           Short.valueOf(AV98Tdevpie2wwds_16_tfdevgentrn_to) ,
                                           AV100Tdevpie2wwds_18_tfdevtrnnom_sel ,
                                           AV99Tdevpie2wwds_17_tfdevtrnnom ,
                                           AV101Tdevpie2wwds_19_tfalbrunidis ,
                                           AV102Tdevpie2wwds_20_tfalbrunidis_to ,
                                           Integer.valueOf(AV103Tdevpie2wwds_21_tfalbrpiedis) ,
                                           Integer.valueOf(AV104Tdevpie2wwds_22_tfalbrpiedis_to) ,
                                           Integer.valueOf(AV105Tdevpie2wwds_23_tfalbruni_sels.size()) ,
                                           AV106Tdevpie2wwds_24_tfdevgenuni ,
                                           AV107Tdevpie2wwds_25_tfdevgenuni_to ,
                                           Short.valueOf(AV108Tdevpie2wwds_26_tfdevgenpie) ,
                                           Short.valueOf(AV109Tdevpie2wwds_27_tfdevgenpie_to) ,
                                           Integer.valueOf(A323DevGenCod) ,
                                           A325DevGenFec ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           Byte.valueOf(A6288DevGenDom) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A45AlbRef ,
                                           Short.valueOf(A327DevGenTrn) ,
                                           A329DevTrnNom ,
                                           A58AlbRUniEnt ,
                                           A60AlbRUniUti ,
                                           Integer.valueOf(A52AlbRPieEnt) ,
                                           Integer.valueOf(A54AlbRPieUti) ,
                                           A328DevGenUni ,
                                           Short.valueOf(A326DevGenPie) ,
                                           AV83Tdevpie2wwds_1_filterfulltext ,
                                           A57AlbRUniDis ,
                                           Integer.valueOf(A51AlbRPieDis) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.INT
                                           }
      });
      lV93Tdevpie2wwds_11_tfclinom = GXutil.padr( GXutil.rtrim( AV93Tdevpie2wwds_11_tfclinom), 30, "%") ;
      lV95Tdevpie2wwds_13_tfalbref = GXutil.padr( GXutil.rtrim( AV95Tdevpie2wwds_13_tfalbref), 16, "%") ;
      lV99Tdevpie2wwds_17_tfdevtrnnom = GXutil.padr( GXutil.rtrim( AV99Tdevpie2wwds_17_tfdevtrnnom), 30, "%") ;
      /* Using cursor P086N3 */
      pr_default.execute(1, new Object[] {Integer.valueOf(AV84Tdevpie2wwds_2_tfdevgencod), Integer.valueOf(AV85Tdevpie2wwds_3_tfdevgencod_to), AV86Tdevpie2wwds_4_tfdevgenfec, Integer.valueOf(AV87Tdevpie2wwds_5_tfalbreccod), Integer.valueOf(AV88Tdevpie2wwds_6_tfalbreccod_to), Byte.valueOf(AV89Tdevpie2wwds_7_tfdevgendom), Byte.valueOf(AV90Tdevpie2wwds_8_tfdevgendom_to), Integer.valueOf(AV91Tdevpie2wwds_9_tfclicod), Integer.valueOf(AV92Tdevpie2wwds_10_tfclicod_to), lV93Tdevpie2wwds_11_tfclinom, AV94Tdevpie2wwds_12_tfclinom_sel, lV95Tdevpie2wwds_13_tfalbref, AV96Tdevpie2wwds_14_tfalbref_sel, Short.valueOf(AV97Tdevpie2wwds_15_tfdevgentrn), Short.valueOf(AV98Tdevpie2wwds_16_tfdevgentrn_to), lV99Tdevpie2wwds_17_tfdevtrnnom, AV100Tdevpie2wwds_18_tfdevtrnnom_sel, AV101Tdevpie2wwds_19_tfalbrunidis, AV102Tdevpie2wwds_20_tfalbrunidis_to, Integer.valueOf(AV103Tdevpie2wwds_21_tfalbrpiedis), Integer.valueOf(AV104Tdevpie2wwds_22_tfalbrpiedis_to), AV106Tdevpie2wwds_24_tfdevgenuni, AV107Tdevpie2wwds_25_tfdevgenuni_to, Short.valueOf(AV108Tdevpie2wwds_26_tfdevgenpie), Short.valueOf(AV109Tdevpie2wwds_27_tfdevgenpie_to)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk86N4 = false ;
         A44AlbRecCod = P086N3_A44AlbRecCod[0] ;
         n44AlbRecCod = P086N3_n44AlbRecCod[0] ;
         A396EmprCod = P086N3_A396EmprCod[0] ;
         A326DevGenPie = P086N3_A326DevGenPie[0] ;
         n326DevGenPie = P086N3_n326DevGenPie[0] ;
         A328DevGenUni = P086N3_A328DevGenUni[0] ;
         n328DevGenUni = P086N3_n328DevGenUni[0] ;
         A51AlbRPieDis = P086N3_A51AlbRPieDis[0] ;
         A57AlbRUniDis = P086N3_A57AlbRUniDis[0] ;
         A329DevTrnNom = P086N3_A329DevTrnNom[0] ;
         n329DevTrnNom = P086N3_n329DevTrnNom[0] ;
         A327DevGenTrn = P086N3_A327DevGenTrn[0] ;
         n327DevGenTrn = P086N3_n327DevGenTrn[0] ;
         A45AlbRef = P086N3_A45AlbRef[0] ;
         A279CliNom = P086N3_A279CliNom[0] ;
         A252CliCod = P086N3_A252CliCod[0] ;
         n252CliCod = P086N3_n252CliCod[0] ;
         A6288DevGenDom = P086N3_A6288DevGenDom[0] ;
         n6288DevGenDom = P086N3_n6288DevGenDom[0] ;
         A325DevGenFec = P086N3_A325DevGenFec[0] ;
         n325DevGenFec = P086N3_n325DevGenFec[0] ;
         A323DevGenCod = P086N3_A323DevGenCod[0] ;
         A56AlbRUni = P086N3_A56AlbRUni[0] ;
         A52AlbRPieEnt = P086N3_A52AlbRPieEnt[0] ;
         A54AlbRPieUti = P086N3_A54AlbRPieUti[0] ;
         A58AlbRUniEnt = P086N3_A58AlbRUniEnt[0] ;
         A60AlbRUniUti = P086N3_A60AlbRUniUti[0] ;
         A51AlbRPieDis = P086N3_A51AlbRPieDis[0] ;
         A57AlbRUniDis = P086N3_A57AlbRUniDis[0] ;
         A45AlbRef = P086N3_A45AlbRef[0] ;
         A56AlbRUni = P086N3_A56AlbRUni[0] ;
         A52AlbRPieEnt = P086N3_A52AlbRPieEnt[0] ;
         A54AlbRPieUti = P086N3_A54AlbRPieUti[0] ;
         A58AlbRUniEnt = P086N3_A58AlbRUniEnt[0] ;
         A60AlbRUniUti = P086N3_A60AlbRUniUti[0] ;
         A329DevTrnNom = P086N3_A329DevTrnNom[0] ;
         n329DevTrnNom = P086N3_n329DevTrnNom[0] ;
         A279CliNom = P086N3_A279CliNom[0] ;
         if ( (GXutil.strcmp("", AV83Tdevpie2wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A323DevGenCod, 8, 0) , GXutil.padr( "%" + AV83Tdevpie2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A44AlbRecCod, 8, 0) , GXutil.padr( "%" + AV83Tdevpie2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A6288DevGenDom, 1, 0) , GXutil.padr( "%" + AV83Tdevpie2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV83Tdevpie2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV83Tdevpie2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A45AlbRef) , GXutil.padr( "%" + GXutil.upper( AV83Tdevpie2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A327DevGenTrn, 4, 0) , GXutil.padr( "%" + AV83Tdevpie2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A329DevTrnNom) , GXutil.padr( "%" + GXutil.upper( AV83Tdevpie2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A57AlbRUniDis, 9, 2) , GXutil.padr( "%" + AV83Tdevpie2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A51AlbRPieDis, 6, 0) , GXutil.padr( "%" + AV83Tdevpie2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "k", ""), "") , GXutil.padr( "%" + GXutil.lower( AV83Tdevpie2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "m", ""), "") , GXutil.padr( "%" + GXutil.lower( AV83Tdevpie2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A328DevGenUni, 9, 2) , GXutil.padr( "%" + AV83Tdevpie2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A326DevGenPie, 4, 0) , GXutil.padr( "%" + AV83Tdevpie2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            AV50count = 0 ;
            while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P086N3_A396EmprCod[0], A396EmprCod) == 0 ) && ( P086N3_A44AlbRecCod[0] == A44AlbRecCod ) )
            {
               brk86N4 = false ;
               A323DevGenCod = P086N3_A323DevGenCod[0] ;
               AV50count = (long)(AV50count+1) ;
               brk86N4 = true ;
               pr_default.readNext(1);
            }
            if ( ! (GXutil.strcmp("", A45AlbRef)==0) )
            {
               AV42Option = A45AlbRef ;
               AV41InsertIndex = 1 ;
               while ( ( AV41InsertIndex <= AV43Options.size() ) && ( GXutil.strcmp((String)AV43Options.elementAt(-1+AV41InsertIndex), AV42Option) < 0 ) )
               {
                  AV41InsertIndex = (int)(AV41InsertIndex+1) ;
               }
               AV43Options.add(AV42Option, AV41InsertIndex);
               AV48OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV50count), "Z,ZZZ,ZZZ,ZZ9")), AV41InsertIndex);
            }
            if ( AV43Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk86N4 )
         {
            brk86N4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADDEVTRNNOMOPTIONS' Routine */
      returnInSub = false ;
      AV26TFDevTrnNom = AV38SearchTxt ;
      AV27TFDevTrnNom_Sel = "" ;
      AV83Tdevpie2wwds_1_filterfulltext = AV78FilterFullText ;
      AV84Tdevpie2wwds_2_tfdevgencod = AV10TFDevGenCod ;
      AV85Tdevpie2wwds_3_tfdevgencod_to = AV11TFDevGenCod_To ;
      AV86Tdevpie2wwds_4_tfdevgenfec = AV12TFDevGenFec ;
      AV87Tdevpie2wwds_5_tfalbreccod = AV14TFAlbRecCod ;
      AV88Tdevpie2wwds_6_tfalbreccod_to = AV15TFAlbRecCod_To ;
      AV89Tdevpie2wwds_7_tfdevgendom = AV16TFDevGenDom ;
      AV90Tdevpie2wwds_8_tfdevgendom_to = AV17TFDevGenDom_To ;
      AV91Tdevpie2wwds_9_tfclicod = AV18TFCliCod ;
      AV92Tdevpie2wwds_10_tfclicod_to = AV19TFCliCod_To ;
      AV93Tdevpie2wwds_11_tfclinom = AV20TFCliNom ;
      AV94Tdevpie2wwds_12_tfclinom_sel = AV21TFCliNom_Sel ;
      AV95Tdevpie2wwds_13_tfalbref = AV22TFAlbRef ;
      AV96Tdevpie2wwds_14_tfalbref_sel = AV23TFAlbRef_Sel ;
      AV97Tdevpie2wwds_15_tfdevgentrn = AV24TFDevGenTrn ;
      AV98Tdevpie2wwds_16_tfdevgentrn_to = AV25TFDevGenTrn_To ;
      AV99Tdevpie2wwds_17_tfdevtrnnom = AV26TFDevTrnNom ;
      AV100Tdevpie2wwds_18_tfdevtrnnom_sel = AV27TFDevTrnNom_Sel ;
      AV101Tdevpie2wwds_19_tfalbrunidis = AV28TFAlbRUniDis ;
      AV102Tdevpie2wwds_20_tfalbrunidis_to = AV29TFAlbRUniDis_To ;
      AV103Tdevpie2wwds_21_tfalbrpiedis = AV30TFAlbRPieDis ;
      AV104Tdevpie2wwds_22_tfalbrpiedis_to = AV31TFAlbRPieDis_To ;
      AV105Tdevpie2wwds_23_tfalbruni_sels = AV77TFAlbRUni_Sels ;
      AV106Tdevpie2wwds_24_tfdevgenuni = AV34TFDevGenUni ;
      AV107Tdevpie2wwds_25_tfdevgenuni_to = AV35TFDevGenUni_To ;
      AV108Tdevpie2wwds_26_tfdevgenpie = AV36TFDevGenPie ;
      AV109Tdevpie2wwds_27_tfdevgenpie_to = AV37TFDevGenPie_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           A56AlbRUni ,
                                           AV105Tdevpie2wwds_23_tfalbruni_sels ,
                                           Integer.valueOf(AV84Tdevpie2wwds_2_tfdevgencod) ,
                                           Integer.valueOf(AV85Tdevpie2wwds_3_tfdevgencod_to) ,
                                           AV86Tdevpie2wwds_4_tfdevgenfec ,
                                           Integer.valueOf(AV87Tdevpie2wwds_5_tfalbreccod) ,
                                           Integer.valueOf(AV88Tdevpie2wwds_6_tfalbreccod_to) ,
                                           Byte.valueOf(AV89Tdevpie2wwds_7_tfdevgendom) ,
                                           Byte.valueOf(AV90Tdevpie2wwds_8_tfdevgendom_to) ,
                                           Integer.valueOf(AV91Tdevpie2wwds_9_tfclicod) ,
                                           Integer.valueOf(AV92Tdevpie2wwds_10_tfclicod_to) ,
                                           AV94Tdevpie2wwds_12_tfclinom_sel ,
                                           AV93Tdevpie2wwds_11_tfclinom ,
                                           AV96Tdevpie2wwds_14_tfalbref_sel ,
                                           AV95Tdevpie2wwds_13_tfalbref ,
                                           Short.valueOf(AV97Tdevpie2wwds_15_tfdevgentrn) ,
                                           Short.valueOf(AV98Tdevpie2wwds_16_tfdevgentrn_to) ,
                                           AV100Tdevpie2wwds_18_tfdevtrnnom_sel ,
                                           AV99Tdevpie2wwds_17_tfdevtrnnom ,
                                           AV101Tdevpie2wwds_19_tfalbrunidis ,
                                           AV102Tdevpie2wwds_20_tfalbrunidis_to ,
                                           Integer.valueOf(AV103Tdevpie2wwds_21_tfalbrpiedis) ,
                                           Integer.valueOf(AV104Tdevpie2wwds_22_tfalbrpiedis_to) ,
                                           Integer.valueOf(AV105Tdevpie2wwds_23_tfalbruni_sels.size()) ,
                                           AV106Tdevpie2wwds_24_tfdevgenuni ,
                                           AV107Tdevpie2wwds_25_tfdevgenuni_to ,
                                           Short.valueOf(AV108Tdevpie2wwds_26_tfdevgenpie) ,
                                           Short.valueOf(AV109Tdevpie2wwds_27_tfdevgenpie_to) ,
                                           Integer.valueOf(A323DevGenCod) ,
                                           A325DevGenFec ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           Byte.valueOf(A6288DevGenDom) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A45AlbRef ,
                                           Short.valueOf(A327DevGenTrn) ,
                                           A329DevTrnNom ,
                                           A58AlbRUniEnt ,
                                           A60AlbRUniUti ,
                                           Integer.valueOf(A52AlbRPieEnt) ,
                                           Integer.valueOf(A54AlbRPieUti) ,
                                           A328DevGenUni ,
                                           Short.valueOf(A326DevGenPie) ,
                                           AV83Tdevpie2wwds_1_filterfulltext ,
                                           A57AlbRUniDis ,
                                           Integer.valueOf(A51AlbRPieDis) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.INT
                                           }
      });
      lV93Tdevpie2wwds_11_tfclinom = GXutil.padr( GXutil.rtrim( AV93Tdevpie2wwds_11_tfclinom), 30, "%") ;
      lV95Tdevpie2wwds_13_tfalbref = GXutil.padr( GXutil.rtrim( AV95Tdevpie2wwds_13_tfalbref), 16, "%") ;
      lV99Tdevpie2wwds_17_tfdevtrnnom = GXutil.padr( GXutil.rtrim( AV99Tdevpie2wwds_17_tfdevtrnnom), 30, "%") ;
      /* Using cursor P086N4 */
      pr_default.execute(2, new Object[] {Integer.valueOf(AV84Tdevpie2wwds_2_tfdevgencod), Integer.valueOf(AV85Tdevpie2wwds_3_tfdevgencod_to), AV86Tdevpie2wwds_4_tfdevgenfec, Integer.valueOf(AV87Tdevpie2wwds_5_tfalbreccod), Integer.valueOf(AV88Tdevpie2wwds_6_tfalbreccod_to), Byte.valueOf(AV89Tdevpie2wwds_7_tfdevgendom), Byte.valueOf(AV90Tdevpie2wwds_8_tfdevgendom_to), Integer.valueOf(AV91Tdevpie2wwds_9_tfclicod), Integer.valueOf(AV92Tdevpie2wwds_10_tfclicod_to), lV93Tdevpie2wwds_11_tfclinom, AV94Tdevpie2wwds_12_tfclinom_sel, lV95Tdevpie2wwds_13_tfalbref, AV96Tdevpie2wwds_14_tfalbref_sel, Short.valueOf(AV97Tdevpie2wwds_15_tfdevgentrn), Short.valueOf(AV98Tdevpie2wwds_16_tfdevgentrn_to), lV99Tdevpie2wwds_17_tfdevtrnnom, AV100Tdevpie2wwds_18_tfdevtrnnom_sel, AV101Tdevpie2wwds_19_tfalbrunidis, AV102Tdevpie2wwds_20_tfalbrunidis_to, Integer.valueOf(AV103Tdevpie2wwds_21_tfalbrpiedis), Integer.valueOf(AV104Tdevpie2wwds_22_tfalbrpiedis_to), AV106Tdevpie2wwds_24_tfdevgenuni, AV107Tdevpie2wwds_25_tfdevgenuni_to, Short.valueOf(AV108Tdevpie2wwds_26_tfdevgenpie), Short.valueOf(AV109Tdevpie2wwds_27_tfdevgenpie_to)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk86N6 = false ;
         A327DevGenTrn = P086N4_A327DevGenTrn[0] ;
         n327DevGenTrn = P086N4_n327DevGenTrn[0] ;
         A396EmprCod = P086N4_A396EmprCod[0] ;
         A326DevGenPie = P086N4_A326DevGenPie[0] ;
         n326DevGenPie = P086N4_n326DevGenPie[0] ;
         A328DevGenUni = P086N4_A328DevGenUni[0] ;
         n328DevGenUni = P086N4_n328DevGenUni[0] ;
         A51AlbRPieDis = P086N4_A51AlbRPieDis[0] ;
         A57AlbRUniDis = P086N4_A57AlbRUniDis[0] ;
         A329DevTrnNom = P086N4_A329DevTrnNom[0] ;
         n329DevTrnNom = P086N4_n329DevTrnNom[0] ;
         A45AlbRef = P086N4_A45AlbRef[0] ;
         A279CliNom = P086N4_A279CliNom[0] ;
         A252CliCod = P086N4_A252CliCod[0] ;
         n252CliCod = P086N4_n252CliCod[0] ;
         A6288DevGenDom = P086N4_A6288DevGenDom[0] ;
         n6288DevGenDom = P086N4_n6288DevGenDom[0] ;
         A44AlbRecCod = P086N4_A44AlbRecCod[0] ;
         n44AlbRecCod = P086N4_n44AlbRecCod[0] ;
         A325DevGenFec = P086N4_A325DevGenFec[0] ;
         n325DevGenFec = P086N4_n325DevGenFec[0] ;
         A323DevGenCod = P086N4_A323DevGenCod[0] ;
         A56AlbRUni = P086N4_A56AlbRUni[0] ;
         A52AlbRPieEnt = P086N4_A52AlbRPieEnt[0] ;
         A54AlbRPieUti = P086N4_A54AlbRPieUti[0] ;
         A58AlbRUniEnt = P086N4_A58AlbRUniEnt[0] ;
         A60AlbRUniUti = P086N4_A60AlbRUniUti[0] ;
         A329DevTrnNom = P086N4_A329DevTrnNom[0] ;
         n329DevTrnNom = P086N4_n329DevTrnNom[0] ;
         A279CliNom = P086N4_A279CliNom[0] ;
         A51AlbRPieDis = P086N4_A51AlbRPieDis[0] ;
         A57AlbRUniDis = P086N4_A57AlbRUniDis[0] ;
         A45AlbRef = P086N4_A45AlbRef[0] ;
         A56AlbRUni = P086N4_A56AlbRUni[0] ;
         A52AlbRPieEnt = P086N4_A52AlbRPieEnt[0] ;
         A54AlbRPieUti = P086N4_A54AlbRPieUti[0] ;
         A58AlbRUniEnt = P086N4_A58AlbRUniEnt[0] ;
         A60AlbRUniUti = P086N4_A60AlbRUniUti[0] ;
         if ( (GXutil.strcmp("", AV83Tdevpie2wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A323DevGenCod, 8, 0) , GXutil.padr( "%" + AV83Tdevpie2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A44AlbRecCod, 8, 0) , GXutil.padr( "%" + AV83Tdevpie2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A6288DevGenDom, 1, 0) , GXutil.padr( "%" + AV83Tdevpie2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV83Tdevpie2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV83Tdevpie2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A45AlbRef) , GXutil.padr( "%" + GXutil.upper( AV83Tdevpie2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A327DevGenTrn, 4, 0) , GXutil.padr( "%" + AV83Tdevpie2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A329DevTrnNom) , GXutil.padr( "%" + GXutil.upper( AV83Tdevpie2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A57AlbRUniDis, 9, 2) , GXutil.padr( "%" + AV83Tdevpie2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A51AlbRPieDis, 6, 0) , GXutil.padr( "%" + AV83Tdevpie2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "k", ""), "") , GXutil.padr( "%" + GXutil.lower( AV83Tdevpie2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "m", ""), "") , GXutil.padr( "%" + GXutil.lower( AV83Tdevpie2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A328DevGenUni, 9, 2) , GXutil.padr( "%" + AV83Tdevpie2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A326DevGenPie, 4, 0) , GXutil.padr( "%" + AV83Tdevpie2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            AV50count = 0 ;
            while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P086N4_A396EmprCod[0], A396EmprCod) == 0 ) && ( P086N4_A327DevGenTrn[0] == A327DevGenTrn ) )
            {
               brk86N6 = false ;
               A323DevGenCod = P086N4_A323DevGenCod[0] ;
               AV50count = (long)(AV50count+1) ;
               brk86N6 = true ;
               pr_default.readNext(2);
            }
            if ( ! (GXutil.strcmp("", A329DevTrnNom)==0) )
            {
               AV42Option = A329DevTrnNom ;
               AV41InsertIndex = 1 ;
               while ( ( AV41InsertIndex <= AV43Options.size() ) && ( GXutil.strcmp((String)AV43Options.elementAt(-1+AV41InsertIndex), AV42Option) < 0 ) )
               {
                  AV41InsertIndex = (int)(AV41InsertIndex+1) ;
               }
               AV43Options.add(AV42Option, AV41InsertIndex);
               AV48OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV50count), "Z,ZZZ,ZZZ,ZZ9")), AV41InsertIndex);
            }
            if ( AV43Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk86N6 )
         {
            brk86N6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tdevpie2wwgetfilterdata.this.AV44OptionsJson;
      this.aP4[0] = tdevpie2wwgetfilterdata.this.AV47OptionsDescJson;
      this.aP5[0] = tdevpie2wwgetfilterdata.this.AV49OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV44OptionsJson = "" ;
      AV47OptionsDescJson = "" ;
      AV49OptionIndexesJson = "" ;
      AV43Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV46OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV48OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV51Session = httpContext.getWebSession();
      AV53GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV54GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV78FilterFullText = "" ;
      AV12TFDevGenFec = GXutil.nullDate() ;
      AV20TFCliNom = "" ;
      AV21TFCliNom_Sel = "" ;
      AV22TFAlbRef = "" ;
      AV23TFAlbRef_Sel = "" ;
      AV26TFDevTrnNom = "" ;
      AV27TFDevTrnNom_Sel = "" ;
      AV28TFAlbRUniDis = DecimalUtil.ZERO ;
      AV29TFAlbRUniDis_To = DecimalUtil.ZERO ;
      AV76TFAlbRUni_SelsJson = "" ;
      AV77TFAlbRUni_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV34TFDevGenUni = DecimalUtil.ZERO ;
      AV35TFDevGenUni_To = DecimalUtil.ZERO ;
      A279CliNom = "" ;
      AV83Tdevpie2wwds_1_filterfulltext = "" ;
      AV86Tdevpie2wwds_4_tfdevgenfec = GXutil.nullDate() ;
      AV93Tdevpie2wwds_11_tfclinom = "" ;
      AV94Tdevpie2wwds_12_tfclinom_sel = "" ;
      AV95Tdevpie2wwds_13_tfalbref = "" ;
      AV96Tdevpie2wwds_14_tfalbref_sel = "" ;
      AV99Tdevpie2wwds_17_tfdevtrnnom = "" ;
      AV100Tdevpie2wwds_18_tfdevtrnnom_sel = "" ;
      AV101Tdevpie2wwds_19_tfalbrunidis = DecimalUtil.ZERO ;
      AV102Tdevpie2wwds_20_tfalbrunidis_to = DecimalUtil.ZERO ;
      AV105Tdevpie2wwds_23_tfalbruni_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV106Tdevpie2wwds_24_tfdevgenuni = DecimalUtil.ZERO ;
      AV107Tdevpie2wwds_25_tfdevgenuni_to = DecimalUtil.ZERO ;
      lV83Tdevpie2wwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV93Tdevpie2wwds_11_tfclinom = "" ;
      lV95Tdevpie2wwds_13_tfalbref = "" ;
      lV99Tdevpie2wwds_17_tfdevtrnnom = "" ;
      A56AlbRUni = "" ;
      A325DevGenFec = GXutil.nullDate() ;
      A45AlbRef = "" ;
      A329DevTrnNom = "" ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A328DevGenUni = DecimalUtil.ZERO ;
      A57AlbRUniDis = DecimalUtil.ZERO ;
      P086N2_A396EmprCod = new String[] {""} ;
      P086N2_A279CliNom = new String[] {""} ;
      P086N2_A326DevGenPie = new short[1] ;
      P086N2_n326DevGenPie = new boolean[] {false} ;
      P086N2_A328DevGenUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P086N2_n328DevGenUni = new boolean[] {false} ;
      P086N2_A51AlbRPieDis = new int[1] ;
      P086N2_A57AlbRUniDis = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P086N2_A329DevTrnNom = new String[] {""} ;
      P086N2_n329DevTrnNom = new boolean[] {false} ;
      P086N2_A327DevGenTrn = new short[1] ;
      P086N2_n327DevGenTrn = new boolean[] {false} ;
      P086N2_A45AlbRef = new String[] {""} ;
      P086N2_A252CliCod = new int[1] ;
      P086N2_n252CliCod = new boolean[] {false} ;
      P086N2_A6288DevGenDom = new byte[1] ;
      P086N2_n6288DevGenDom = new boolean[] {false} ;
      P086N2_A44AlbRecCod = new int[1] ;
      P086N2_n44AlbRecCod = new boolean[] {false} ;
      P086N2_A325DevGenFec = new java.util.Date[] {GXutil.nullDate()} ;
      P086N2_n325DevGenFec = new boolean[] {false} ;
      P086N2_A323DevGenCod = new int[1] ;
      P086N2_A56AlbRUni = new String[] {""} ;
      P086N2_A52AlbRPieEnt = new int[1] ;
      P086N2_A54AlbRPieUti = new int[1] ;
      P086N2_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P086N2_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A396EmprCod = "" ;
      AV42Option = "" ;
      P086N3_A44AlbRecCod = new int[1] ;
      P086N3_n44AlbRecCod = new boolean[] {false} ;
      P086N3_A396EmprCod = new String[] {""} ;
      P086N3_A326DevGenPie = new short[1] ;
      P086N3_n326DevGenPie = new boolean[] {false} ;
      P086N3_A328DevGenUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P086N3_n328DevGenUni = new boolean[] {false} ;
      P086N3_A51AlbRPieDis = new int[1] ;
      P086N3_A57AlbRUniDis = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P086N3_A329DevTrnNom = new String[] {""} ;
      P086N3_n329DevTrnNom = new boolean[] {false} ;
      P086N3_A327DevGenTrn = new short[1] ;
      P086N3_n327DevGenTrn = new boolean[] {false} ;
      P086N3_A45AlbRef = new String[] {""} ;
      P086N3_A279CliNom = new String[] {""} ;
      P086N3_A252CliCod = new int[1] ;
      P086N3_n252CliCod = new boolean[] {false} ;
      P086N3_A6288DevGenDom = new byte[1] ;
      P086N3_n6288DevGenDom = new boolean[] {false} ;
      P086N3_A325DevGenFec = new java.util.Date[] {GXutil.nullDate()} ;
      P086N3_n325DevGenFec = new boolean[] {false} ;
      P086N3_A323DevGenCod = new int[1] ;
      P086N3_A56AlbRUni = new String[] {""} ;
      P086N3_A52AlbRPieEnt = new int[1] ;
      P086N3_A54AlbRPieUti = new int[1] ;
      P086N3_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P086N3_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P086N4_A327DevGenTrn = new short[1] ;
      P086N4_n327DevGenTrn = new boolean[] {false} ;
      P086N4_A396EmprCod = new String[] {""} ;
      P086N4_A326DevGenPie = new short[1] ;
      P086N4_n326DevGenPie = new boolean[] {false} ;
      P086N4_A328DevGenUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P086N4_n328DevGenUni = new boolean[] {false} ;
      P086N4_A51AlbRPieDis = new int[1] ;
      P086N4_A57AlbRUniDis = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P086N4_A329DevTrnNom = new String[] {""} ;
      P086N4_n329DevTrnNom = new boolean[] {false} ;
      P086N4_A45AlbRef = new String[] {""} ;
      P086N4_A279CliNom = new String[] {""} ;
      P086N4_A252CliCod = new int[1] ;
      P086N4_n252CliCod = new boolean[] {false} ;
      P086N4_A6288DevGenDom = new byte[1] ;
      P086N4_n6288DevGenDom = new boolean[] {false} ;
      P086N4_A44AlbRecCod = new int[1] ;
      P086N4_n44AlbRecCod = new boolean[] {false} ;
      P086N4_A325DevGenFec = new java.util.Date[] {GXutil.nullDate()} ;
      P086N4_n325DevGenFec = new boolean[] {false} ;
      P086N4_A323DevGenCod = new int[1] ;
      P086N4_A56AlbRUni = new String[] {""} ;
      P086N4_A52AlbRPieEnt = new int[1] ;
      P086N4_A54AlbRPieUti = new int[1] ;
      P086N4_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P086N4_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tdevpie2wwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P086N2_A396EmprCod, P086N2_A279CliNom, P086N2_A326DevGenPie, P086N2_n326DevGenPie, P086N2_A328DevGenUni, P086N2_n328DevGenUni, P086N2_A51AlbRPieDis, P086N2_A57AlbRUniDis, P086N2_A329DevTrnNom, P086N2_n329DevTrnNom,
            P086N2_A327DevGenTrn, P086N2_n327DevGenTrn, P086N2_A45AlbRef, P086N2_A252CliCod, P086N2_n252CliCod, P086N2_A6288DevGenDom, P086N2_n6288DevGenDom, P086N2_A44AlbRecCod, P086N2_n44AlbRecCod, P086N2_A325DevGenFec,
            P086N2_n325DevGenFec, P086N2_A323DevGenCod, P086N2_A56AlbRUni, P086N2_A52AlbRPieEnt, P086N2_A54AlbRPieUti, P086N2_A58AlbRUniEnt, P086N2_A60AlbRUniUti
            }
            , new Object[] {
            P086N3_A44AlbRecCod, P086N3_n44AlbRecCod, P086N3_A396EmprCod, P086N3_A326DevGenPie, P086N3_n326DevGenPie, P086N3_A328DevGenUni, P086N3_n328DevGenUni, P086N3_A51AlbRPieDis, P086N3_A57AlbRUniDis, P086N3_A329DevTrnNom,
            P086N3_n329DevTrnNom, P086N3_A327DevGenTrn, P086N3_n327DevGenTrn, P086N3_A45AlbRef, P086N3_A279CliNom, P086N3_A252CliCod, P086N3_n252CliCod, P086N3_A6288DevGenDom, P086N3_n6288DevGenDom, P086N3_A325DevGenFec,
            P086N3_n325DevGenFec, P086N3_A323DevGenCod, P086N3_A56AlbRUni, P086N3_A52AlbRPieEnt, P086N3_A54AlbRPieUti, P086N3_A58AlbRUniEnt, P086N3_A60AlbRUniUti
            }
            , new Object[] {
            P086N4_A327DevGenTrn, P086N4_n327DevGenTrn, P086N4_A396EmprCod, P086N4_A326DevGenPie, P086N4_n326DevGenPie, P086N4_A328DevGenUni, P086N4_n328DevGenUni, P086N4_A51AlbRPieDis, P086N4_A57AlbRUniDis, P086N4_A329DevTrnNom,
            P086N4_n329DevTrnNom, P086N4_A45AlbRef, P086N4_A279CliNom, P086N4_A252CliCod, P086N4_n252CliCod, P086N4_A6288DevGenDom, P086N4_n6288DevGenDom, P086N4_A44AlbRecCod, P086N4_n44AlbRecCod, P086N4_A325DevGenFec,
            P086N4_n325DevGenFec, P086N4_A323DevGenCod, P086N4_A56AlbRUni, P086N4_A52AlbRPieEnt, P086N4_A54AlbRPieUti, P086N4_A58AlbRUniEnt, P086N4_A60AlbRUniUti
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV16TFDevGenDom ;
   private byte AV17TFDevGenDom_To ;
   private byte AV89Tdevpie2wwds_7_tfdevgendom ;
   private byte AV90Tdevpie2wwds_8_tfdevgendom_to ;
   private byte A6288DevGenDom ;
   private short AV24TFDevGenTrn ;
   private short AV25TFDevGenTrn_To ;
   private short AV36TFDevGenPie ;
   private short AV37TFDevGenPie_To ;
   private short AV97Tdevpie2wwds_15_tfdevgentrn ;
   private short AV98Tdevpie2wwds_16_tfdevgentrn_to ;
   private short AV108Tdevpie2wwds_26_tfdevgenpie ;
   private short AV109Tdevpie2wwds_27_tfdevgenpie_to ;
   private short A327DevGenTrn ;
   private short A326DevGenPie ;
   private short Gx_err ;
   private int AV81GXV1 ;
   private int AV10TFDevGenCod ;
   private int AV11TFDevGenCod_To ;
   private int AV14TFAlbRecCod ;
   private int AV15TFAlbRecCod_To ;
   private int AV18TFCliCod ;
   private int AV19TFCliCod_To ;
   private int AV30TFAlbRPieDis ;
   private int AV31TFAlbRPieDis_To ;
   private int AV84Tdevpie2wwds_2_tfdevgencod ;
   private int AV85Tdevpie2wwds_3_tfdevgencod_to ;
   private int AV87Tdevpie2wwds_5_tfalbreccod ;
   private int AV88Tdevpie2wwds_6_tfalbreccod_to ;
   private int AV91Tdevpie2wwds_9_tfclicod ;
   private int AV92Tdevpie2wwds_10_tfclicod_to ;
   private int AV103Tdevpie2wwds_21_tfalbrpiedis ;
   private int AV104Tdevpie2wwds_22_tfalbrpiedis_to ;
   private int AV105Tdevpie2wwds_23_tfalbruni_sels_size ;
   private int A323DevGenCod ;
   private int A44AlbRecCod ;
   private int A252CliCod ;
   private int A52AlbRPieEnt ;
   private int A54AlbRPieUti ;
   private int A51AlbRPieDis ;
   private int AV41InsertIndex ;
   private long AV50count ;
   private java.math.BigDecimal AV28TFAlbRUniDis ;
   private java.math.BigDecimal AV29TFAlbRUniDis_To ;
   private java.math.BigDecimal AV34TFDevGenUni ;
   private java.math.BigDecimal AV35TFDevGenUni_To ;
   private java.math.BigDecimal AV101Tdevpie2wwds_19_tfalbrunidis ;
   private java.math.BigDecimal AV102Tdevpie2wwds_20_tfalbrunidis_to ;
   private java.math.BigDecimal AV106Tdevpie2wwds_24_tfdevgenuni ;
   private java.math.BigDecimal AV107Tdevpie2wwds_25_tfdevgenuni_to ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A328DevGenUni ;
   private java.math.BigDecimal A57AlbRUniDis ;
   private String AV20TFCliNom ;
   private String AV21TFCliNom_Sel ;
   private String AV22TFAlbRef ;
   private String AV23TFAlbRef_Sel ;
   private String AV26TFDevTrnNom ;
   private String AV27TFDevTrnNom_Sel ;
   private String A279CliNom ;
   private String AV93Tdevpie2wwds_11_tfclinom ;
   private String AV94Tdevpie2wwds_12_tfclinom_sel ;
   private String AV95Tdevpie2wwds_13_tfalbref ;
   private String AV96Tdevpie2wwds_14_tfalbref_sel ;
   private String AV99Tdevpie2wwds_17_tfdevtrnnom ;
   private String AV100Tdevpie2wwds_18_tfdevtrnnom_sel ;
   private String scmdbuf ;
   private String lV93Tdevpie2wwds_11_tfclinom ;
   private String lV95Tdevpie2wwds_13_tfalbref ;
   private String lV99Tdevpie2wwds_17_tfdevtrnnom ;
   private String A56AlbRUni ;
   private String A45AlbRef ;
   private String A329DevTrnNom ;
   private String A396EmprCod ;
   private java.util.Date AV12TFDevGenFec ;
   private java.util.Date AV86Tdevpie2wwds_4_tfdevgenfec ;
   private java.util.Date A325DevGenFec ;
   private boolean returnInSub ;
   private boolean brk86N2 ;
   private boolean n326DevGenPie ;
   private boolean n328DevGenUni ;
   private boolean n329DevTrnNom ;
   private boolean n327DevGenTrn ;
   private boolean n252CliCod ;
   private boolean n6288DevGenDom ;
   private boolean n44AlbRecCod ;
   private boolean n325DevGenFec ;
   private boolean brk86N4 ;
   private boolean brk86N6 ;
   private String AV44OptionsJson ;
   private String AV47OptionsDescJson ;
   private String AV49OptionIndexesJson ;
   private String AV76TFAlbRUni_SelsJson ;
   private String AV40DDOName ;
   private String AV38SearchTxt ;
   private String AV39SearchTxtTo ;
   private String AV78FilterFullText ;
   private String AV83Tdevpie2wwds_1_filterfulltext ;
   private String lV83Tdevpie2wwds_1_filterfulltext ;
   private String AV42Option ;
   private com.genexus.webpanels.WebSession AV51Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P086N2_A396EmprCod ;
   private String[] P086N2_A279CliNom ;
   private short[] P086N2_A326DevGenPie ;
   private boolean[] P086N2_n326DevGenPie ;
   private java.math.BigDecimal[] P086N2_A328DevGenUni ;
   private boolean[] P086N2_n328DevGenUni ;
   private int[] P086N2_A51AlbRPieDis ;
   private java.math.BigDecimal[] P086N2_A57AlbRUniDis ;
   private String[] P086N2_A329DevTrnNom ;
   private boolean[] P086N2_n329DevTrnNom ;
   private short[] P086N2_A327DevGenTrn ;
   private boolean[] P086N2_n327DevGenTrn ;
   private String[] P086N2_A45AlbRef ;
   private int[] P086N2_A252CliCod ;
   private boolean[] P086N2_n252CliCod ;
   private byte[] P086N2_A6288DevGenDom ;
   private boolean[] P086N2_n6288DevGenDom ;
   private int[] P086N2_A44AlbRecCod ;
   private boolean[] P086N2_n44AlbRecCod ;
   private java.util.Date[] P086N2_A325DevGenFec ;
   private boolean[] P086N2_n325DevGenFec ;
   private int[] P086N2_A323DevGenCod ;
   private String[] P086N2_A56AlbRUni ;
   private int[] P086N2_A52AlbRPieEnt ;
   private int[] P086N2_A54AlbRPieUti ;
   private java.math.BigDecimal[] P086N2_A58AlbRUniEnt ;
   private java.math.BigDecimal[] P086N2_A60AlbRUniUti ;
   private int[] P086N3_A44AlbRecCod ;
   private boolean[] P086N3_n44AlbRecCod ;
   private String[] P086N3_A396EmprCod ;
   private short[] P086N3_A326DevGenPie ;
   private boolean[] P086N3_n326DevGenPie ;
   private java.math.BigDecimal[] P086N3_A328DevGenUni ;
   private boolean[] P086N3_n328DevGenUni ;
   private int[] P086N3_A51AlbRPieDis ;
   private java.math.BigDecimal[] P086N3_A57AlbRUniDis ;
   private String[] P086N3_A329DevTrnNom ;
   private boolean[] P086N3_n329DevTrnNom ;
   private short[] P086N3_A327DevGenTrn ;
   private boolean[] P086N3_n327DevGenTrn ;
   private String[] P086N3_A45AlbRef ;
   private String[] P086N3_A279CliNom ;
   private int[] P086N3_A252CliCod ;
   private boolean[] P086N3_n252CliCod ;
   private byte[] P086N3_A6288DevGenDom ;
   private boolean[] P086N3_n6288DevGenDom ;
   private java.util.Date[] P086N3_A325DevGenFec ;
   private boolean[] P086N3_n325DevGenFec ;
   private int[] P086N3_A323DevGenCod ;
   private String[] P086N3_A56AlbRUni ;
   private int[] P086N3_A52AlbRPieEnt ;
   private int[] P086N3_A54AlbRPieUti ;
   private java.math.BigDecimal[] P086N3_A58AlbRUniEnt ;
   private java.math.BigDecimal[] P086N3_A60AlbRUniUti ;
   private short[] P086N4_A327DevGenTrn ;
   private boolean[] P086N4_n327DevGenTrn ;
   private String[] P086N4_A396EmprCod ;
   private short[] P086N4_A326DevGenPie ;
   private boolean[] P086N4_n326DevGenPie ;
   private java.math.BigDecimal[] P086N4_A328DevGenUni ;
   private boolean[] P086N4_n328DevGenUni ;
   private int[] P086N4_A51AlbRPieDis ;
   private java.math.BigDecimal[] P086N4_A57AlbRUniDis ;
   private String[] P086N4_A329DevTrnNom ;
   private boolean[] P086N4_n329DevTrnNom ;
   private String[] P086N4_A45AlbRef ;
   private String[] P086N4_A279CliNom ;
   private int[] P086N4_A252CliCod ;
   private boolean[] P086N4_n252CliCod ;
   private byte[] P086N4_A6288DevGenDom ;
   private boolean[] P086N4_n6288DevGenDom ;
   private int[] P086N4_A44AlbRecCod ;
   private boolean[] P086N4_n44AlbRecCod ;
   private java.util.Date[] P086N4_A325DevGenFec ;
   private boolean[] P086N4_n325DevGenFec ;
   private int[] P086N4_A323DevGenCod ;
   private String[] P086N4_A56AlbRUni ;
   private int[] P086N4_A52AlbRPieEnt ;
   private int[] P086N4_A54AlbRPieUti ;
   private java.math.BigDecimal[] P086N4_A58AlbRUniEnt ;
   private java.math.BigDecimal[] P086N4_A60AlbRUniUti ;
   private GXSimpleCollection<String> AV77TFAlbRUni_Sels ;
   private GXSimpleCollection<String> AV105Tdevpie2wwds_23_tfalbruni_sels ;
   private GXSimpleCollection<String> AV43Options ;
   private GXSimpleCollection<String> AV46OptionsDesc ;
   private GXSimpleCollection<String> AV48OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV53GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV54GridStateFilterValue ;
}

final  class tdevpie2wwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P086N2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV105Tdevpie2wwds_23_tfalbruni_sels ,
                                          int AV84Tdevpie2wwds_2_tfdevgencod ,
                                          int AV85Tdevpie2wwds_3_tfdevgencod_to ,
                                          java.util.Date AV86Tdevpie2wwds_4_tfdevgenfec ,
                                          int AV87Tdevpie2wwds_5_tfalbreccod ,
                                          int AV88Tdevpie2wwds_6_tfalbreccod_to ,
                                          byte AV89Tdevpie2wwds_7_tfdevgendom ,
                                          byte AV90Tdevpie2wwds_8_tfdevgendom_to ,
                                          int AV91Tdevpie2wwds_9_tfclicod ,
                                          int AV92Tdevpie2wwds_10_tfclicod_to ,
                                          String AV94Tdevpie2wwds_12_tfclinom_sel ,
                                          String AV93Tdevpie2wwds_11_tfclinom ,
                                          String AV96Tdevpie2wwds_14_tfalbref_sel ,
                                          String AV95Tdevpie2wwds_13_tfalbref ,
                                          short AV97Tdevpie2wwds_15_tfdevgentrn ,
                                          short AV98Tdevpie2wwds_16_tfdevgentrn_to ,
                                          String AV100Tdevpie2wwds_18_tfdevtrnnom_sel ,
                                          String AV99Tdevpie2wwds_17_tfdevtrnnom ,
                                          java.math.BigDecimal AV101Tdevpie2wwds_19_tfalbrunidis ,
                                          java.math.BigDecimal AV102Tdevpie2wwds_20_tfalbrunidis_to ,
                                          int AV103Tdevpie2wwds_21_tfalbrpiedis ,
                                          int AV104Tdevpie2wwds_22_tfalbrpiedis_to ,
                                          int AV105Tdevpie2wwds_23_tfalbruni_sels_size ,
                                          java.math.BigDecimal AV106Tdevpie2wwds_24_tfdevgenuni ,
                                          java.math.BigDecimal AV107Tdevpie2wwds_25_tfdevgenuni_to ,
                                          short AV108Tdevpie2wwds_26_tfdevgenpie ,
                                          short AV109Tdevpie2wwds_27_tfdevgenpie_to ,
                                          int A323DevGenCod ,
                                          java.util.Date A325DevGenFec ,
                                          int A44AlbRecCod ,
                                          byte A6288DevGenDom ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A45AlbRef ,
                                          short A327DevGenTrn ,
                                          String A329DevTrnNom ,
                                          java.math.BigDecimal A58AlbRUniEnt ,
                                          java.math.BigDecimal A60AlbRUniUti ,
                                          int A52AlbRPieEnt ,
                                          int A54AlbRPieUti ,
                                          java.math.BigDecimal A328DevGenUni ,
                                          short A326DevGenPie ,
                                          String AV83Tdevpie2wwds_1_filterfulltext ,
                                          java.math.BigDecimal A57AlbRUniDis ,
                                          int A51AlbRPieDis )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[25];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T3.CliNom, T1.DevGenPie, T1.DevGenUni, COALESCE( T4.AlbRPieEnt, 0) - COALESCE( T4.AlbRPieUti, 0) AS AlbRPieDis, CASE  WHEN ( COALESCE( T4.AlbRUniEnt," ;
      scmdbuf += " 0) - COALESCE( T4.AlbRUniUti, 0)) >= 0 THEN COALESCE( T4.AlbRUniEnt, 0) - COALESCE( T4.AlbRUniUti, 0) WHEN ( COALESCE( T4.AlbRUniEnt, 0) - COALESCE( T4.AlbRUniUti," ;
      scmdbuf += " 0)) < 0 THEN 0 END AS AlbRUniDis, T2.TrnNom AS DevTrnNom, T1.DevGenTrn AS DevGenTrn, T4.AlbRef, T1.CliCod, T1.DevGenDom, T1.AlbRecCod, T1.DevGenFec, T1.DevGenCod," ;
      scmdbuf += " T4.AlbRUni, T4.AlbRPieEnt, T4.AlbRPieUti, T4.AlbRUniEnt, T4.AlbRUniUti FROM (((TXPDEVGEN T1 LEFT JOIN TXPTRANSP T2 ON T2.EmprCod = T1.EmprCod AND T2.TrnCod = T1.DevGenTrn)" ;
      scmdbuf += " LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod) LEFT JOIN TXPALBREC T4 ON T4.EmprCod = T1.EmprCod AND T4.AlbRecCod = T1.AlbRecCod)" ;
      if ( ! (0==AV84Tdevpie2wwds_2_tfdevgencod) )
      {
         addWhere(sWhereString, "(T1.DevGenCod >= ?)");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( ! (0==AV85Tdevpie2wwds_3_tfdevgencod_to) )
      {
         addWhere(sWhereString, "(T1.DevGenCod <= ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV86Tdevpie2wwds_4_tfdevgenfec)) )
      {
         addWhere(sWhereString, "(T1.DevGenFec >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV87Tdevpie2wwds_5_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (0==AV88Tdevpie2wwds_6_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (0==AV89Tdevpie2wwds_7_tfdevgendom) )
      {
         addWhere(sWhereString, "(T1.DevGenDom >= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (0==AV90Tdevpie2wwds_8_tfdevgendom_to) )
      {
         addWhere(sWhereString, "(T1.DevGenDom <= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (0==AV91Tdevpie2wwds_9_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (0==AV92Tdevpie2wwds_10_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Tdevpie2wwds_12_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV93Tdevpie2wwds_11_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Tdevpie2wwds_12_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Tdevpie2wwds_14_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV95Tdevpie2wwds_13_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Tdevpie2wwds_14_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T4.AlbRef = ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (0==AV97Tdevpie2wwds_15_tfdevgentrn) )
      {
         addWhere(sWhereString, "(T1.DevGenTrn >= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (0==AV98Tdevpie2wwds_16_tfdevgentrn_to) )
      {
         addWhere(sWhereString, "(T1.DevGenTrn <= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Tdevpie2wwds_18_tfdevtrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV99Tdevpie2wwds_17_tfdevtrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Tdevpie2wwds_18_tfdevtrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TrnNom = ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV101Tdevpie2wwds_19_tfalbrunidis)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T4.AlbRUniEnt - T4.AlbRUniUti) >= 0 THEN T4.AlbRUniEnt - T4.AlbRUniUti WHEN ( T4.AlbRUniEnt - T4.AlbRUniUti) < 0 THEN 0 END) >= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV102Tdevpie2wwds_20_tfalbrunidis_to)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T4.AlbRUniEnt - T4.AlbRUniUti) >= 0 THEN T4.AlbRUniEnt - T4.AlbRUniUti WHEN ( T4.AlbRUniEnt - T4.AlbRUniUti) < 0 THEN 0 END) <= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (0==AV103Tdevpie2wwds_21_tfalbrpiedis) )
      {
         addWhere(sWhereString, "(( T4.AlbRPieEnt - T4.AlbRPieUti) >= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (0==AV104Tdevpie2wwds_22_tfalbrpiedis_to) )
      {
         addWhere(sWhereString, "(( T4.AlbRPieEnt - T4.AlbRPieUti) <= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( AV105Tdevpie2wwds_23_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV105Tdevpie2wwds_23_tfalbruni_sels, "T4.AlbRUni IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV106Tdevpie2wwds_24_tfdevgenuni)==0) )
      {
         addWhere(sWhereString, "(T1.DevGenUni >= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV107Tdevpie2wwds_25_tfdevgenuni_to)==0) )
      {
         addWhere(sWhereString, "(T1.DevGenUni <= ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (0==AV108Tdevpie2wwds_26_tfdevgenpie) )
      {
         addWhere(sWhereString, "(T1.DevGenPie >= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (0==AV109Tdevpie2wwds_27_tfdevgenpie_to) )
      {
         addWhere(sWhereString, "(T1.DevGenPie <= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T3.CliNom" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P086N3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV105Tdevpie2wwds_23_tfalbruni_sels ,
                                          int AV84Tdevpie2wwds_2_tfdevgencod ,
                                          int AV85Tdevpie2wwds_3_tfdevgencod_to ,
                                          java.util.Date AV86Tdevpie2wwds_4_tfdevgenfec ,
                                          int AV87Tdevpie2wwds_5_tfalbreccod ,
                                          int AV88Tdevpie2wwds_6_tfalbreccod_to ,
                                          byte AV89Tdevpie2wwds_7_tfdevgendom ,
                                          byte AV90Tdevpie2wwds_8_tfdevgendom_to ,
                                          int AV91Tdevpie2wwds_9_tfclicod ,
                                          int AV92Tdevpie2wwds_10_tfclicod_to ,
                                          String AV94Tdevpie2wwds_12_tfclinom_sel ,
                                          String AV93Tdevpie2wwds_11_tfclinom ,
                                          String AV96Tdevpie2wwds_14_tfalbref_sel ,
                                          String AV95Tdevpie2wwds_13_tfalbref ,
                                          short AV97Tdevpie2wwds_15_tfdevgentrn ,
                                          short AV98Tdevpie2wwds_16_tfdevgentrn_to ,
                                          String AV100Tdevpie2wwds_18_tfdevtrnnom_sel ,
                                          String AV99Tdevpie2wwds_17_tfdevtrnnom ,
                                          java.math.BigDecimal AV101Tdevpie2wwds_19_tfalbrunidis ,
                                          java.math.BigDecimal AV102Tdevpie2wwds_20_tfalbrunidis_to ,
                                          int AV103Tdevpie2wwds_21_tfalbrpiedis ,
                                          int AV104Tdevpie2wwds_22_tfalbrpiedis_to ,
                                          int AV105Tdevpie2wwds_23_tfalbruni_sels_size ,
                                          java.math.BigDecimal AV106Tdevpie2wwds_24_tfdevgenuni ,
                                          java.math.BigDecimal AV107Tdevpie2wwds_25_tfdevgenuni_to ,
                                          short AV108Tdevpie2wwds_26_tfdevgenpie ,
                                          short AV109Tdevpie2wwds_27_tfdevgenpie_to ,
                                          int A323DevGenCod ,
                                          java.util.Date A325DevGenFec ,
                                          int A44AlbRecCod ,
                                          byte A6288DevGenDom ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A45AlbRef ,
                                          short A327DevGenTrn ,
                                          String A329DevTrnNom ,
                                          java.math.BigDecimal A58AlbRUniEnt ,
                                          java.math.BigDecimal A60AlbRUniUti ,
                                          int A52AlbRPieEnt ,
                                          int A54AlbRPieUti ,
                                          java.math.BigDecimal A328DevGenUni ,
                                          short A326DevGenPie ,
                                          String AV83Tdevpie2wwds_1_filterfulltext ,
                                          java.math.BigDecimal A57AlbRUniDis ,
                                          int A51AlbRPieDis )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[25];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT T1.AlbRecCod, T1.EmprCod, T1.DevGenPie, T1.DevGenUni, COALESCE( T2.AlbRPieEnt, 0) - COALESCE( T2.AlbRPieUti, 0) AS AlbRPieDis, CASE  WHEN ( COALESCE( T2.AlbRUniEnt," ;
      scmdbuf += " 0) - COALESCE( T2.AlbRUniUti, 0)) >= 0 THEN COALESCE( T2.AlbRUniEnt, 0) - COALESCE( T2.AlbRUniUti, 0) WHEN ( COALESCE( T2.AlbRUniEnt, 0) - COALESCE( T2.AlbRUniUti," ;
      scmdbuf += " 0)) < 0 THEN 0 END AS AlbRUniDis, T3.TrnNom AS DevTrnNom, T1.DevGenTrn AS DevGenTrn, T2.AlbRef, T4.CliNom, T1.CliCod, T1.DevGenDom, T1.DevGenFec, T1.DevGenCod," ;
      scmdbuf += " T2.AlbRUni, T2.AlbRPieEnt, T2.AlbRPieUti, T2.AlbRUniEnt, T2.AlbRUniUti FROM (((TXPDEVGEN T1 LEFT JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod =" ;
      scmdbuf += " T1.AlbRecCod) LEFT JOIN TXPTRANSP T3 ON T3.EmprCod = T1.EmprCod AND T3.TrnCod = T1.DevGenTrn) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod =" ;
      scmdbuf += " T1.CliCod)" ;
      if ( ! (0==AV84Tdevpie2wwds_2_tfdevgencod) )
      {
         addWhere(sWhereString, "(T1.DevGenCod >= ?)");
      }
      else
      {
         GXv_int5[0] = (byte)(1) ;
      }
      if ( ! (0==AV85Tdevpie2wwds_3_tfdevgencod_to) )
      {
         addWhere(sWhereString, "(T1.DevGenCod <= ?)");
      }
      else
      {
         GXv_int5[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV86Tdevpie2wwds_4_tfdevgenfec)) )
      {
         addWhere(sWhereString, "(T1.DevGenFec >= ?)");
      }
      else
      {
         GXv_int5[2] = (byte)(1) ;
      }
      if ( ! (0==AV87Tdevpie2wwds_5_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int5[3] = (byte)(1) ;
      }
      if ( ! (0==AV88Tdevpie2wwds_6_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int5[4] = (byte)(1) ;
      }
      if ( ! (0==AV89Tdevpie2wwds_7_tfdevgendom) )
      {
         addWhere(sWhereString, "(T1.DevGenDom >= ?)");
      }
      else
      {
         GXv_int5[5] = (byte)(1) ;
      }
      if ( ! (0==AV90Tdevpie2wwds_8_tfdevgendom_to) )
      {
         addWhere(sWhereString, "(T1.DevGenDom <= ?)");
      }
      else
      {
         GXv_int5[6] = (byte)(1) ;
      }
      if ( ! (0==AV91Tdevpie2wwds_9_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int5[7] = (byte)(1) ;
      }
      if ( ! (0==AV92Tdevpie2wwds_10_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int5[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Tdevpie2wwds_12_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV93Tdevpie2wwds_11_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Tdevpie2wwds_12_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int5[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Tdevpie2wwds_14_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV95Tdevpie2wwds_13_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Tdevpie2wwds_14_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRef = ?)");
      }
      else
      {
         GXv_int5[12] = (byte)(1) ;
      }
      if ( ! (0==AV97Tdevpie2wwds_15_tfdevgentrn) )
      {
         addWhere(sWhereString, "(T1.DevGenTrn >= ?)");
      }
      else
      {
         GXv_int5[13] = (byte)(1) ;
      }
      if ( ! (0==AV98Tdevpie2wwds_16_tfdevgentrn_to) )
      {
         addWhere(sWhereString, "(T1.DevGenTrn <= ?)");
      }
      else
      {
         GXv_int5[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Tdevpie2wwds_18_tfdevtrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV99Tdevpie2wwds_17_tfdevtrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Tdevpie2wwds_18_tfdevtrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TrnNom = ?)");
      }
      else
      {
         GXv_int5[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV101Tdevpie2wwds_19_tfalbrunidis)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T2.AlbRUniEnt - T2.AlbRUniUti) >= 0 THEN T2.AlbRUniEnt - T2.AlbRUniUti WHEN ( T2.AlbRUniEnt - T2.AlbRUniUti) < 0 THEN 0 END) >= ?)");
      }
      else
      {
         GXv_int5[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV102Tdevpie2wwds_20_tfalbrunidis_to)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T2.AlbRUniEnt - T2.AlbRUniUti) >= 0 THEN T2.AlbRUniEnt - T2.AlbRUniUti WHEN ( T2.AlbRUniEnt - T2.AlbRUniUti) < 0 THEN 0 END) <= ?)");
      }
      else
      {
         GXv_int5[18] = (byte)(1) ;
      }
      if ( ! (0==AV103Tdevpie2wwds_21_tfalbrpiedis) )
      {
         addWhere(sWhereString, "(( T2.AlbRPieEnt - T2.AlbRPieUti) >= ?)");
      }
      else
      {
         GXv_int5[19] = (byte)(1) ;
      }
      if ( ! (0==AV104Tdevpie2wwds_22_tfalbrpiedis_to) )
      {
         addWhere(sWhereString, "(( T2.AlbRPieEnt - T2.AlbRPieUti) <= ?)");
      }
      else
      {
         GXv_int5[20] = (byte)(1) ;
      }
      if ( AV105Tdevpie2wwds_23_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV105Tdevpie2wwds_23_tfalbruni_sels, "T2.AlbRUni IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV106Tdevpie2wwds_24_tfdevgenuni)==0) )
      {
         addWhere(sWhereString, "(T1.DevGenUni >= ?)");
      }
      else
      {
         GXv_int5[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV107Tdevpie2wwds_25_tfdevgenuni_to)==0) )
      {
         addWhere(sWhereString, "(T1.DevGenUni <= ?)");
      }
      else
      {
         GXv_int5[22] = (byte)(1) ;
      }
      if ( ! (0==AV108Tdevpie2wwds_26_tfdevgenpie) )
      {
         addWhere(sWhereString, "(T1.DevGenPie >= ?)");
      }
      else
      {
         GXv_int5[23] = (byte)(1) ;
      }
      if ( ! (0==AV109Tdevpie2wwds_27_tfdevgenpie_to) )
      {
         addWhere(sWhereString, "(T1.DevGenPie <= ?)");
      }
      else
      {
         GXv_int5[24] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.AlbRecCod" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   protected Object[] conditional_P086N4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV105Tdevpie2wwds_23_tfalbruni_sels ,
                                          int AV84Tdevpie2wwds_2_tfdevgencod ,
                                          int AV85Tdevpie2wwds_3_tfdevgencod_to ,
                                          java.util.Date AV86Tdevpie2wwds_4_tfdevgenfec ,
                                          int AV87Tdevpie2wwds_5_tfalbreccod ,
                                          int AV88Tdevpie2wwds_6_tfalbreccod_to ,
                                          byte AV89Tdevpie2wwds_7_tfdevgendom ,
                                          byte AV90Tdevpie2wwds_8_tfdevgendom_to ,
                                          int AV91Tdevpie2wwds_9_tfclicod ,
                                          int AV92Tdevpie2wwds_10_tfclicod_to ,
                                          String AV94Tdevpie2wwds_12_tfclinom_sel ,
                                          String AV93Tdevpie2wwds_11_tfclinom ,
                                          String AV96Tdevpie2wwds_14_tfalbref_sel ,
                                          String AV95Tdevpie2wwds_13_tfalbref ,
                                          short AV97Tdevpie2wwds_15_tfdevgentrn ,
                                          short AV98Tdevpie2wwds_16_tfdevgentrn_to ,
                                          String AV100Tdevpie2wwds_18_tfdevtrnnom_sel ,
                                          String AV99Tdevpie2wwds_17_tfdevtrnnom ,
                                          java.math.BigDecimal AV101Tdevpie2wwds_19_tfalbrunidis ,
                                          java.math.BigDecimal AV102Tdevpie2wwds_20_tfalbrunidis_to ,
                                          int AV103Tdevpie2wwds_21_tfalbrpiedis ,
                                          int AV104Tdevpie2wwds_22_tfalbrpiedis_to ,
                                          int AV105Tdevpie2wwds_23_tfalbruni_sels_size ,
                                          java.math.BigDecimal AV106Tdevpie2wwds_24_tfdevgenuni ,
                                          java.math.BigDecimal AV107Tdevpie2wwds_25_tfdevgenuni_to ,
                                          short AV108Tdevpie2wwds_26_tfdevgenpie ,
                                          short AV109Tdevpie2wwds_27_tfdevgenpie_to ,
                                          int A323DevGenCod ,
                                          java.util.Date A325DevGenFec ,
                                          int A44AlbRecCod ,
                                          byte A6288DevGenDom ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A45AlbRef ,
                                          short A327DevGenTrn ,
                                          String A329DevTrnNom ,
                                          java.math.BigDecimal A58AlbRUniEnt ,
                                          java.math.BigDecimal A60AlbRUniUti ,
                                          int A52AlbRPieEnt ,
                                          int A54AlbRPieUti ,
                                          java.math.BigDecimal A328DevGenUni ,
                                          short A326DevGenPie ,
                                          String AV83Tdevpie2wwds_1_filterfulltext ,
                                          java.math.BigDecimal A57AlbRUniDis ,
                                          int A51AlbRPieDis )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[25];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.DevGenTrn AS DevGenTrn, T1.EmprCod, T1.DevGenPie, T1.DevGenUni, COALESCE( T4.AlbRPieEnt, 0) - COALESCE( T4.AlbRPieUti, 0) AS AlbRPieDis, CASE  WHEN ( COALESCE(" ;
      scmdbuf += " T4.AlbRUniEnt, 0) - COALESCE( T4.AlbRUniUti, 0)) >= 0 THEN COALESCE( T4.AlbRUniEnt, 0) - COALESCE( T4.AlbRUniUti, 0) WHEN ( COALESCE( T4.AlbRUniEnt, 0) - COALESCE(" ;
      scmdbuf += " T4.AlbRUniUti, 0)) < 0 THEN 0 END AS AlbRUniDis, T2.TrnNom AS DevTrnNom, T4.AlbRef, T3.CliNom, T1.CliCod, T1.DevGenDom, T1.AlbRecCod, T1.DevGenFec, T1.DevGenCod," ;
      scmdbuf += " T4.AlbRUni, T4.AlbRPieEnt, T4.AlbRPieUti, T4.AlbRUniEnt, T4.AlbRUniUti FROM (((TXPDEVGEN T1 LEFT JOIN TXPTRANSP T2 ON T2.EmprCod = T1.EmprCod AND T2.TrnCod = T1.DevGenTrn)" ;
      scmdbuf += " LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod) LEFT JOIN TXPALBREC T4 ON T4.EmprCod = T1.EmprCod AND T4.AlbRecCod = T1.AlbRecCod)" ;
      if ( ! (0==AV84Tdevpie2wwds_2_tfdevgencod) )
      {
         addWhere(sWhereString, "(T1.DevGenCod >= ?)");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
      }
      if ( ! (0==AV85Tdevpie2wwds_3_tfdevgencod_to) )
      {
         addWhere(sWhereString, "(T1.DevGenCod <= ?)");
      }
      else
      {
         GXv_int8[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV86Tdevpie2wwds_4_tfdevgenfec)) )
      {
         addWhere(sWhereString, "(T1.DevGenFec >= ?)");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( ! (0==AV87Tdevpie2wwds_5_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( ! (0==AV88Tdevpie2wwds_6_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! (0==AV89Tdevpie2wwds_7_tfdevgendom) )
      {
         addWhere(sWhereString, "(T1.DevGenDom >= ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( ! (0==AV90Tdevpie2wwds_8_tfdevgendom_to) )
      {
         addWhere(sWhereString, "(T1.DevGenDom <= ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (0==AV91Tdevpie2wwds_9_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (0==AV92Tdevpie2wwds_10_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Tdevpie2wwds_12_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV93Tdevpie2wwds_11_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Tdevpie2wwds_12_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Tdevpie2wwds_14_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV95Tdevpie2wwds_13_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Tdevpie2wwds_14_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T4.AlbRef = ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (0==AV97Tdevpie2wwds_15_tfdevgentrn) )
      {
         addWhere(sWhereString, "(T1.DevGenTrn >= ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (0==AV98Tdevpie2wwds_16_tfdevgentrn_to) )
      {
         addWhere(sWhereString, "(T1.DevGenTrn <= ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Tdevpie2wwds_18_tfdevtrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV99Tdevpie2wwds_17_tfdevtrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Tdevpie2wwds_18_tfdevtrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TrnNom = ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV101Tdevpie2wwds_19_tfalbrunidis)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T4.AlbRUniEnt - T4.AlbRUniUti) >= 0 THEN T4.AlbRUniEnt - T4.AlbRUniUti WHEN ( T4.AlbRUniEnt - T4.AlbRUniUti) < 0 THEN 0 END) >= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV102Tdevpie2wwds_20_tfalbrunidis_to)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T4.AlbRUniEnt - T4.AlbRUniUti) >= 0 THEN T4.AlbRUniEnt - T4.AlbRUniUti WHEN ( T4.AlbRUniEnt - T4.AlbRUniUti) < 0 THEN 0 END) <= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (0==AV103Tdevpie2wwds_21_tfalbrpiedis) )
      {
         addWhere(sWhereString, "(( T4.AlbRPieEnt - T4.AlbRPieUti) >= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (0==AV104Tdevpie2wwds_22_tfalbrpiedis_to) )
      {
         addWhere(sWhereString, "(( T4.AlbRPieEnt - T4.AlbRPieUti) <= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( AV105Tdevpie2wwds_23_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV105Tdevpie2wwds_23_tfalbruni_sels, "T4.AlbRUni IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV106Tdevpie2wwds_24_tfdevgenuni)==0) )
      {
         addWhere(sWhereString, "(T1.DevGenUni >= ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV107Tdevpie2wwds_25_tfdevgenuni_to)==0) )
      {
         addWhere(sWhereString, "(T1.DevGenUni <= ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (0==AV108Tdevpie2wwds_26_tfdevgenpie) )
      {
         addWhere(sWhereString, "(T1.DevGenPie >= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (0==AV109Tdevpie2wwds_27_tfdevgenpie_to) )
      {
         addWhere(sWhereString, "(T1.DevGenPie <= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.DevGenTrn" ;
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
                  return conditional_P086N2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (java.util.Date)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).byteValue() , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).shortValue() , ((Number) dynConstraints[16]).shortValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).intValue() , (java.util.Date)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).byteValue() , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).shortValue() , (String)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).intValue() , (java.math.BigDecimal)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , (String)dynConstraints[43] , (java.math.BigDecimal)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() );
            case 1 :
                  return conditional_P086N3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (java.util.Date)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).byteValue() , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).shortValue() , ((Number) dynConstraints[16]).shortValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).intValue() , (java.util.Date)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).byteValue() , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).shortValue() , (String)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).intValue() , (java.math.BigDecimal)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , (String)dynConstraints[43] , (java.math.BigDecimal)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() );
            case 2 :
                  return conditional_P086N4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (java.util.Date)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).byteValue() , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).shortValue() , ((Number) dynConstraints[16]).shortValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).intValue() , (java.util.Date)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).byteValue() , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).shortValue() , (String)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).intValue() , (java.math.BigDecimal)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , (String)dynConstraints[43] , (java.math.BigDecimal)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P086N2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P086N3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P086N4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[8])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 16);
               ((int[]) buf[13])[0] = rslt.getInt(10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(11);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(12);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(13);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((int[]) buf[21])[0] = rslt.getInt(14);
               ((String[]) buf[22])[0] = rslt.getString(15, 1);
               ((int[]) buf[23])[0] = rslt.getInt(16);
               ((int[]) buf[24])[0] = rslt.getInt(17);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(18,2);
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(19,2);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(5);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[9])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 16);
               ((String[]) buf[14])[0] = rslt.getString(10, 30);
               ((int[]) buf[15])[0] = rslt.getInt(11);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((byte[]) buf[17])[0] = rslt.getByte(12);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(13);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((int[]) buf[21])[0] = rslt.getInt(14);
               ((String[]) buf[22])[0] = rslt.getString(15, 1);
               ((int[]) buf[23])[0] = rslt.getInt(16);
               ((int[]) buf[24])[0] = rslt.getInt(17);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(18,2);
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(19,2);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(5);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[9])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 16);
               ((String[]) buf[12])[0] = rslt.getString(9, 30);
               ((int[]) buf[13])[0] = rslt.getInt(10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(11);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(12);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(13);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((int[]) buf[21])[0] = rslt.getInt(14);
               ((String[]) buf[22])[0] = rslt.getString(15, 1);
               ((int[]) buf[23])[0] = rslt.getInt(16);
               ((int[]) buf[24])[0] = rslt.getInt(17);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(18,2);
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(19,2);
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
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[27]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[30]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[31]).byteValue());
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
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[38]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[39]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 30);
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
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[48]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[49]).shortValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[27]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[30]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[31]).byteValue());
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
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[38]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[39]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 30);
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
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[48]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[49]).shortValue());
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[27]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[30]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[31]).byteValue());
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
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[38]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[39]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 30);
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
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[48]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[49]).shortValue());
               }
               return;
      }
   }

}

