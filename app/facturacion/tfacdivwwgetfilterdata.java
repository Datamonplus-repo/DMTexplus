package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tfacdivwwgetfilterdata extends GXProcedure
{
   public tfacdivwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tfacdivwwgetfilterdata.class ), "" );
   }

   public tfacdivwwgetfilterdata( int remoteHandle ,
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
      tfacdivwwgetfilterdata.this.aP5 = new String[] {""};
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
      tfacdivwwgetfilterdata.this.AV42DDOName = aP0;
      tfacdivwwgetfilterdata.this.AV43SearchTxt = aP1;
      tfacdivwwgetfilterdata.this.AV44SearchTxtTo = aP2;
      tfacdivwwgetfilterdata.this.aP3 = aP3;
      tfacdivwwgetfilterdata.this.aP4 = aP4;
      tfacdivwwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV32Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV34OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV35OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV42DDOName), "DDO_EMPRCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADEMPRCODOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV42DDOName), "DDO_CLINOM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV42DDOName), "DDO_FACDIVABR") == 0 )
      {
         /* Execute user subroutine: 'LOADFACDIVABROPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV42DDOName), "DDO_FACREPCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADFACREPCODOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV42DDOName), "DDO_FACREPNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADFACREPNOMOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV42DDOName), "DDO_EMPRNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADEMPRNOMOPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV45OptionsJson = AV32Options.toJSonString(false) ;
      AV46OptionsDescJson = AV34OptionsDesc.toJSonString(false) ;
      AV47OptionIndexesJson = AV35OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV37Session.getValue("Facturacion.TFACDIVWWGridState"), "") == 0 )
      {
         AV39GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Facturacion.TFACDIVWWGridState"), null, null);
      }
      else
      {
         AV39GridState.fromxml(AV37Session.getValue("Facturacion.TFACDIVWWGridState"), null, null);
      }
      AV51GXV1 = 1 ;
      while ( AV51GXV1 <= AV39GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV40GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV39GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV51GXV1));
         if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV48FilterFullText = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD") == 0 )
         {
            AV10TFEmprCod = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD_SEL") == 0 )
         {
            AV11TFEmprCod_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACCOD") == 0 )
         {
            AV12TFFacCod = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV13TFFacCod_To = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV14TFCliCod = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV15TFCliCod_To = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV16TFCliNom = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV17TFCliNom_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACDIVTCOD_SEL") == 0 )
         {
            AV18TFFacDivTCod_SelsJson = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV19TFFacDivTCod_Sels.fromJSonString(AV18TFFacDivTCod_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACDIVCOD") == 0 )
         {
            AV20TFFacDivCod = (byte)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV21TFFacDivCod_To = (byte)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACDIVABR") == 0 )
         {
            AV22TFFacDivAbr = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACDIVABR_SEL") == 0 )
         {
            AV23TFFacDivAbr_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACREPCOD") == 0 )
         {
            AV24TFFacRepCod = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACREPCOD_SEL") == 0 )
         {
            AV25TFFacRepCod_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACREPNOM") == 0 )
         {
            AV26TFFacRepNom = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACREPNOM_SEL") == 0 )
         {
            AV27TFFacRepNom_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRNOM") == 0 )
         {
            AV28TFEmprNom = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRNOM_SEL") == 0 )
         {
            AV29TFEmprNom_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV51GXV1 = (int)(AV51GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADEMPRCODOPTIONS' Routine */
      returnInSub = false ;
      AV10TFEmprCod = AV43SearchTxt ;
      AV11TFEmprCod_Sel = "" ;
      AV53Facturacion_tfacdivwwds_1_filterfulltext = AV48FilterFullText ;
      AV54Facturacion_tfacdivwwds_2_tfemprcod = AV10TFEmprCod ;
      AV55Facturacion_tfacdivwwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV56Facturacion_tfacdivwwds_4_tffaccod = AV12TFFacCod ;
      AV57Facturacion_tfacdivwwds_5_tffaccod_to = AV13TFFacCod_To ;
      AV58Facturacion_tfacdivwwds_6_tfclicod = AV14TFCliCod ;
      AV59Facturacion_tfacdivwwds_7_tfclicod_to = AV15TFCliCod_To ;
      AV60Facturacion_tfacdivwwds_8_tfclinom = AV16TFCliNom ;
      AV61Facturacion_tfacdivwwds_9_tfclinom_sel = AV17TFCliNom_Sel ;
      AV62Facturacion_tfacdivwwds_10_tffacdivtcod_sels = AV19TFFacDivTCod_Sels ;
      AV63Facturacion_tfacdivwwds_11_tffacdivcod = AV20TFFacDivCod ;
      AV64Facturacion_tfacdivwwds_12_tffacdivcod_to = AV21TFFacDivCod_To ;
      AV65Facturacion_tfacdivwwds_13_tffacdivabr = AV22TFFacDivAbr ;
      AV66Facturacion_tfacdivwwds_14_tffacdivabr_sel = AV23TFFacDivAbr_Sel ;
      AV67Facturacion_tfacdivwwds_15_tffacrepcod = AV24TFFacRepCod ;
      AV68Facturacion_tfacdivwwds_16_tffacrepcod_sel = AV25TFFacRepCod_Sel ;
      AV69Facturacion_tfacdivwwds_17_tffacrepnom = AV26TFFacRepNom ;
      AV70Facturacion_tfacdivwwds_18_tffacrepnom_sel = AV27TFFacRepNom_Sel ;
      AV71Facturacion_tfacdivwwds_19_tfemprnom = AV28TFEmprNom ;
      AV72Facturacion_tfacdivwwds_20_tfemprnom_sel = AV29TFEmprNom_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A3096FacDivTCod ,
                                           AV62Facturacion_tfacdivwwds_10_tffacdivtcod_sels ,
                                           AV55Facturacion_tfacdivwwds_3_tfemprcod_sel ,
                                           AV54Facturacion_tfacdivwwds_2_tfemprcod ,
                                           Integer.valueOf(AV56Facturacion_tfacdivwwds_4_tffaccod) ,
                                           Integer.valueOf(AV57Facturacion_tfacdivwwds_5_tffaccod_to) ,
                                           Integer.valueOf(AV58Facturacion_tfacdivwwds_6_tfclicod) ,
                                           Integer.valueOf(AV59Facturacion_tfacdivwwds_7_tfclicod_to) ,
                                           AV61Facturacion_tfacdivwwds_9_tfclinom_sel ,
                                           AV60Facturacion_tfacdivwwds_8_tfclinom ,
                                           Integer.valueOf(AV62Facturacion_tfacdivwwds_10_tffacdivtcod_sels.size()) ,
                                           Byte.valueOf(AV63Facturacion_tfacdivwwds_11_tffacdivcod) ,
                                           Byte.valueOf(AV64Facturacion_tfacdivwwds_12_tffacdivcod_to) ,
                                           AV66Facturacion_tfacdivwwds_14_tffacdivabr_sel ,
                                           AV65Facturacion_tfacdivwwds_13_tffacdivabr ,
                                           AV68Facturacion_tfacdivwwds_16_tffacrepcod_sel ,
                                           AV67Facturacion_tfacdivwwds_15_tffacrepcod ,
                                           AV70Facturacion_tfacdivwwds_18_tffacrepnom_sel ,
                                           AV69Facturacion_tfacdivwwds_17_tffacrepnom ,
                                           AV72Facturacion_tfacdivwwds_20_tfemprnom_sel ,
                                           AV71Facturacion_tfacdivwwds_19_tfemprnom ,
                                           A396EmprCod ,
                                           Integer.valueOf(A430FacCod) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Byte.valueOf(A3115FacDivCod) ,
                                           A3116FacDivAbr ,
                                           A3119FacRepCod ,
                                           A3120FacRepNom ,
                                           A407EmprNom ,
                                           AV53Facturacion_tfacdivwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV54Facturacion_tfacdivwwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV54Facturacion_tfacdivwwds_2_tfemprcod), 3, "%") ;
      lV60Facturacion_tfacdivwwds_8_tfclinom = GXutil.padr( GXutil.rtrim( AV60Facturacion_tfacdivwwds_8_tfclinom), 30, "%") ;
      lV65Facturacion_tfacdivwwds_13_tffacdivabr = GXutil.padr( GXutil.rtrim( AV65Facturacion_tfacdivwwds_13_tffacdivabr), 6, "%") ;
      lV67Facturacion_tfacdivwwds_15_tffacrepcod = GXutil.padr( GXutil.rtrim( AV67Facturacion_tfacdivwwds_15_tffacrepcod), 6, "%") ;
      lV69Facturacion_tfacdivwwds_17_tffacrepnom = GXutil.padr( GXutil.rtrim( AV69Facturacion_tfacdivwwds_17_tffacrepnom), 34, "%") ;
      lV71Facturacion_tfacdivwwds_19_tfemprnom = GXutil.padr( GXutil.rtrim( AV71Facturacion_tfacdivwwds_19_tfemprnom), 30, "%") ;
      /* Using cursor P0AVS2 */
      pr_default.execute(0, new Object[] {lV54Facturacion_tfacdivwwds_2_tfemprcod, AV55Facturacion_tfacdivwwds_3_tfemprcod_sel, Integer.valueOf(AV56Facturacion_tfacdivwwds_4_tffaccod), Integer.valueOf(AV57Facturacion_tfacdivwwds_5_tffaccod_to), Integer.valueOf(AV58Facturacion_tfacdivwwds_6_tfclicod), Integer.valueOf(AV59Facturacion_tfacdivwwds_7_tfclicod_to), lV60Facturacion_tfacdivwwds_8_tfclinom, AV61Facturacion_tfacdivwwds_9_tfclinom_sel, Byte.valueOf(AV63Facturacion_tfacdivwwds_11_tffacdivcod), Byte.valueOf(AV64Facturacion_tfacdivwwds_12_tffacdivcod_to), lV65Facturacion_tfacdivwwds_13_tffacdivabr, AV66Facturacion_tfacdivwwds_14_tffacdivabr_sel, lV67Facturacion_tfacdivwwds_15_tffacrepcod, AV68Facturacion_tfacdivwwds_16_tffacrepcod_sel, lV69Facturacion_tfacdivwwds_17_tffacrepnom, AV70Facturacion_tfacdivwwds_18_tffacrepnom_sel, lV71Facturacion_tfacdivwwds_19_tfemprnom, AV72Facturacion_tfacdivwwds_20_tfemprnom_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkAVS2 = false ;
         A396EmprCod = P0AVS2_A396EmprCod[0] ;
         A407EmprNom = P0AVS2_A407EmprNom[0] ;
         n407EmprNom = P0AVS2_n407EmprNom[0] ;
         A3120FacRepNom = P0AVS2_A3120FacRepNom[0] ;
         n3120FacRepNom = P0AVS2_n3120FacRepNom[0] ;
         A3119FacRepCod = P0AVS2_A3119FacRepCod[0] ;
         n3119FacRepCod = P0AVS2_n3119FacRepCod[0] ;
         A3116FacDivAbr = P0AVS2_A3116FacDivAbr[0] ;
         n3116FacDivAbr = P0AVS2_n3116FacDivAbr[0] ;
         A3115FacDivCod = P0AVS2_A3115FacDivCod[0] ;
         n3115FacDivCod = P0AVS2_n3115FacDivCod[0] ;
         A279CliNom = P0AVS2_A279CliNom[0] ;
         A252CliCod = P0AVS2_A252CliCod[0] ;
         A430FacCod = P0AVS2_A430FacCod[0] ;
         A3096FacDivTCod = P0AVS2_A3096FacDivTCod[0] ;
         n3096FacDivTCod = P0AVS2_n3096FacDivTCod[0] ;
         A407EmprNom = P0AVS2_A407EmprNom[0] ;
         n407EmprNom = P0AVS2_n407EmprNom[0] ;
         A3120FacRepNom = P0AVS2_A3120FacRepNom[0] ;
         n3120FacRepNom = P0AVS2_n3120FacRepNom[0] ;
         A3116FacDivAbr = P0AVS2_A3116FacDivAbr[0] ;
         n3116FacDivAbr = P0AVS2_n3116FacDivAbr[0] ;
         A279CliNom = P0AVS2_A279CliNom[0] ;
         if ( (GXutil.strcmp("", AV53Facturacion_tfacdivwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A396EmprCod) , GXutil.padr( "%" + GXutil.upper( AV53Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A430FacCod, 8, 0) , GXutil.padr( "%" + AV53Facturacion_tfacdivwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV53Facturacion_tfacdivwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV53Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "peseta", ""), "") , GXutil.padr( "%" + GXutil.lower( AV53Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A3096FacDivTCod, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "euro", ""), "") , GXutil.padr( "%" + GXutil.lower( AV53Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A3096FacDivTCod, httpContext.getMessage( "E", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A3115FacDivCod, 2, 0) , GXutil.padr( "%" + AV53Facturacion_tfacdivwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3116FacDivAbr) , GXutil.padr( "%" + GXutil.upper( AV53Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3119FacRepCod) , GXutil.padr( "%" + GXutil.upper( AV53Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3120FacRepNom) , GXutil.padr( "%" + GXutil.upper( AV53Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A407EmprNom) , GXutil.padr( "%" + GXutil.upper( AV53Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV36count = 0 ;
            while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0AVS2_A396EmprCod[0], A396EmprCod) == 0 ) )
            {
               brkAVS2 = false ;
               A430FacCod = P0AVS2_A430FacCod[0] ;
               AV36count = (long)(AV36count+1) ;
               brkAVS2 = true ;
               pr_default.readNext(0);
            }
            if ( ! (GXutil.strcmp("", A396EmprCod)==0) )
            {
               AV31Option = A396EmprCod ;
               AV33OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))) ;
               AV32Options.add(AV31Option, 0);
               AV34OptionsDesc.add(AV33OptionDesc, 0);
               AV35OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV36count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV32Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brkAVS2 )
         {
            brkAVS2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV16TFCliNom = AV43SearchTxt ;
      AV17TFCliNom_Sel = "" ;
      AV53Facturacion_tfacdivwwds_1_filterfulltext = AV48FilterFullText ;
      AV54Facturacion_tfacdivwwds_2_tfemprcod = AV10TFEmprCod ;
      AV55Facturacion_tfacdivwwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV56Facturacion_tfacdivwwds_4_tffaccod = AV12TFFacCod ;
      AV57Facturacion_tfacdivwwds_5_tffaccod_to = AV13TFFacCod_To ;
      AV58Facturacion_tfacdivwwds_6_tfclicod = AV14TFCliCod ;
      AV59Facturacion_tfacdivwwds_7_tfclicod_to = AV15TFCliCod_To ;
      AV60Facturacion_tfacdivwwds_8_tfclinom = AV16TFCliNom ;
      AV61Facturacion_tfacdivwwds_9_tfclinom_sel = AV17TFCliNom_Sel ;
      AV62Facturacion_tfacdivwwds_10_tffacdivtcod_sels = AV19TFFacDivTCod_Sels ;
      AV63Facturacion_tfacdivwwds_11_tffacdivcod = AV20TFFacDivCod ;
      AV64Facturacion_tfacdivwwds_12_tffacdivcod_to = AV21TFFacDivCod_To ;
      AV65Facturacion_tfacdivwwds_13_tffacdivabr = AV22TFFacDivAbr ;
      AV66Facturacion_tfacdivwwds_14_tffacdivabr_sel = AV23TFFacDivAbr_Sel ;
      AV67Facturacion_tfacdivwwds_15_tffacrepcod = AV24TFFacRepCod ;
      AV68Facturacion_tfacdivwwds_16_tffacrepcod_sel = AV25TFFacRepCod_Sel ;
      AV69Facturacion_tfacdivwwds_17_tffacrepnom = AV26TFFacRepNom ;
      AV70Facturacion_tfacdivwwds_18_tffacrepnom_sel = AV27TFFacRepNom_Sel ;
      AV71Facturacion_tfacdivwwds_19_tfemprnom = AV28TFEmprNom ;
      AV72Facturacion_tfacdivwwds_20_tfemprnom_sel = AV29TFEmprNom_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           A3096FacDivTCod ,
                                           AV62Facturacion_tfacdivwwds_10_tffacdivtcod_sels ,
                                           AV55Facturacion_tfacdivwwds_3_tfemprcod_sel ,
                                           AV54Facturacion_tfacdivwwds_2_tfemprcod ,
                                           Integer.valueOf(AV56Facturacion_tfacdivwwds_4_tffaccod) ,
                                           Integer.valueOf(AV57Facturacion_tfacdivwwds_5_tffaccod_to) ,
                                           Integer.valueOf(AV58Facturacion_tfacdivwwds_6_tfclicod) ,
                                           Integer.valueOf(AV59Facturacion_tfacdivwwds_7_tfclicod_to) ,
                                           AV61Facturacion_tfacdivwwds_9_tfclinom_sel ,
                                           AV60Facturacion_tfacdivwwds_8_tfclinom ,
                                           Integer.valueOf(AV62Facturacion_tfacdivwwds_10_tffacdivtcod_sels.size()) ,
                                           Byte.valueOf(AV63Facturacion_tfacdivwwds_11_tffacdivcod) ,
                                           Byte.valueOf(AV64Facturacion_tfacdivwwds_12_tffacdivcod_to) ,
                                           AV66Facturacion_tfacdivwwds_14_tffacdivabr_sel ,
                                           AV65Facturacion_tfacdivwwds_13_tffacdivabr ,
                                           AV68Facturacion_tfacdivwwds_16_tffacrepcod_sel ,
                                           AV67Facturacion_tfacdivwwds_15_tffacrepcod ,
                                           AV70Facturacion_tfacdivwwds_18_tffacrepnom_sel ,
                                           AV69Facturacion_tfacdivwwds_17_tffacrepnom ,
                                           AV72Facturacion_tfacdivwwds_20_tfemprnom_sel ,
                                           AV71Facturacion_tfacdivwwds_19_tfemprnom ,
                                           A396EmprCod ,
                                           Integer.valueOf(A430FacCod) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Byte.valueOf(A3115FacDivCod) ,
                                           A3116FacDivAbr ,
                                           A3119FacRepCod ,
                                           A3120FacRepNom ,
                                           A407EmprNom ,
                                           AV53Facturacion_tfacdivwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV54Facturacion_tfacdivwwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV54Facturacion_tfacdivwwds_2_tfemprcod), 3, "%") ;
      lV60Facturacion_tfacdivwwds_8_tfclinom = GXutil.padr( GXutil.rtrim( AV60Facturacion_tfacdivwwds_8_tfclinom), 30, "%") ;
      lV65Facturacion_tfacdivwwds_13_tffacdivabr = GXutil.padr( GXutil.rtrim( AV65Facturacion_tfacdivwwds_13_tffacdivabr), 6, "%") ;
      lV67Facturacion_tfacdivwwds_15_tffacrepcod = GXutil.padr( GXutil.rtrim( AV67Facturacion_tfacdivwwds_15_tffacrepcod), 6, "%") ;
      lV69Facturacion_tfacdivwwds_17_tffacrepnom = GXutil.padr( GXutil.rtrim( AV69Facturacion_tfacdivwwds_17_tffacrepnom), 34, "%") ;
      lV71Facturacion_tfacdivwwds_19_tfemprnom = GXutil.padr( GXutil.rtrim( AV71Facturacion_tfacdivwwds_19_tfemprnom), 30, "%") ;
      /* Using cursor P0AVS3 */
      pr_default.execute(1, new Object[] {lV54Facturacion_tfacdivwwds_2_tfemprcod, AV55Facturacion_tfacdivwwds_3_tfemprcod_sel, Integer.valueOf(AV56Facturacion_tfacdivwwds_4_tffaccod), Integer.valueOf(AV57Facturacion_tfacdivwwds_5_tffaccod_to), Integer.valueOf(AV58Facturacion_tfacdivwwds_6_tfclicod), Integer.valueOf(AV59Facturacion_tfacdivwwds_7_tfclicod_to), lV60Facturacion_tfacdivwwds_8_tfclinom, AV61Facturacion_tfacdivwwds_9_tfclinom_sel, Byte.valueOf(AV63Facturacion_tfacdivwwds_11_tffacdivcod), Byte.valueOf(AV64Facturacion_tfacdivwwds_12_tffacdivcod_to), lV65Facturacion_tfacdivwwds_13_tffacdivabr, AV66Facturacion_tfacdivwwds_14_tffacdivabr_sel, lV67Facturacion_tfacdivwwds_15_tffacrepcod, AV68Facturacion_tfacdivwwds_16_tffacrepcod_sel, lV69Facturacion_tfacdivwwds_17_tffacrepnom, AV70Facturacion_tfacdivwwds_18_tffacrepnom_sel, lV71Facturacion_tfacdivwwds_19_tfemprnom, AV72Facturacion_tfacdivwwds_20_tfemprnom_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brkAVS4 = false ;
         A279CliNom = P0AVS3_A279CliNom[0] ;
         A407EmprNom = P0AVS3_A407EmprNom[0] ;
         n407EmprNom = P0AVS3_n407EmprNom[0] ;
         A3120FacRepNom = P0AVS3_A3120FacRepNom[0] ;
         n3120FacRepNom = P0AVS3_n3120FacRepNom[0] ;
         A3119FacRepCod = P0AVS3_A3119FacRepCod[0] ;
         n3119FacRepCod = P0AVS3_n3119FacRepCod[0] ;
         A3116FacDivAbr = P0AVS3_A3116FacDivAbr[0] ;
         n3116FacDivAbr = P0AVS3_n3116FacDivAbr[0] ;
         A3115FacDivCod = P0AVS3_A3115FacDivCod[0] ;
         n3115FacDivCod = P0AVS3_n3115FacDivCod[0] ;
         A252CliCod = P0AVS3_A252CliCod[0] ;
         A430FacCod = P0AVS3_A430FacCod[0] ;
         A396EmprCod = P0AVS3_A396EmprCod[0] ;
         A3096FacDivTCod = P0AVS3_A3096FacDivTCod[0] ;
         n3096FacDivTCod = P0AVS3_n3096FacDivTCod[0] ;
         A3116FacDivAbr = P0AVS3_A3116FacDivAbr[0] ;
         n3116FacDivAbr = P0AVS3_n3116FacDivAbr[0] ;
         A407EmprNom = P0AVS3_A407EmprNom[0] ;
         n407EmprNom = P0AVS3_n407EmprNom[0] ;
         A3120FacRepNom = P0AVS3_A3120FacRepNom[0] ;
         n3120FacRepNom = P0AVS3_n3120FacRepNom[0] ;
         A279CliNom = P0AVS3_A279CliNom[0] ;
         if ( (GXutil.strcmp("", AV53Facturacion_tfacdivwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A396EmprCod) , GXutil.padr( "%" + GXutil.upper( AV53Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A430FacCod, 8, 0) , GXutil.padr( "%" + AV53Facturacion_tfacdivwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV53Facturacion_tfacdivwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV53Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "peseta", ""), "") , GXutil.padr( "%" + GXutil.lower( AV53Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A3096FacDivTCod, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "euro", ""), "") , GXutil.padr( "%" + GXutil.lower( AV53Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A3096FacDivTCod, httpContext.getMessage( "E", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A3115FacDivCod, 2, 0) , GXutil.padr( "%" + AV53Facturacion_tfacdivwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3116FacDivAbr) , GXutil.padr( "%" + GXutil.upper( AV53Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3119FacRepCod) , GXutil.padr( "%" + GXutil.upper( AV53Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3120FacRepNom) , GXutil.padr( "%" + GXutil.upper( AV53Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A407EmprNom) , GXutil.padr( "%" + GXutil.upper( AV53Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV36count = 0 ;
            while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P0AVS3_A279CliNom[0], A279CliNom) == 0 ) )
            {
               brkAVS4 = false ;
               A252CliCod = P0AVS3_A252CliCod[0] ;
               A430FacCod = P0AVS3_A430FacCod[0] ;
               A396EmprCod = P0AVS3_A396EmprCod[0] ;
               AV36count = (long)(AV36count+1) ;
               brkAVS4 = true ;
               pr_default.readNext(1);
            }
            if ( ! (GXutil.strcmp("", A279CliNom)==0) )
            {
               AV31Option = A279CliNom ;
               AV32Options.add(AV31Option, 0);
               AV35OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV36count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV32Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brkAVS4 )
         {
            brkAVS4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADFACDIVABROPTIONS' Routine */
      returnInSub = false ;
      AV22TFFacDivAbr = AV43SearchTxt ;
      AV23TFFacDivAbr_Sel = "" ;
      AV53Facturacion_tfacdivwwds_1_filterfulltext = AV48FilterFullText ;
      AV54Facturacion_tfacdivwwds_2_tfemprcod = AV10TFEmprCod ;
      AV55Facturacion_tfacdivwwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV56Facturacion_tfacdivwwds_4_tffaccod = AV12TFFacCod ;
      AV57Facturacion_tfacdivwwds_5_tffaccod_to = AV13TFFacCod_To ;
      AV58Facturacion_tfacdivwwds_6_tfclicod = AV14TFCliCod ;
      AV59Facturacion_tfacdivwwds_7_tfclicod_to = AV15TFCliCod_To ;
      AV60Facturacion_tfacdivwwds_8_tfclinom = AV16TFCliNom ;
      AV61Facturacion_tfacdivwwds_9_tfclinom_sel = AV17TFCliNom_Sel ;
      AV62Facturacion_tfacdivwwds_10_tffacdivtcod_sels = AV19TFFacDivTCod_Sels ;
      AV63Facturacion_tfacdivwwds_11_tffacdivcod = AV20TFFacDivCod ;
      AV64Facturacion_tfacdivwwds_12_tffacdivcod_to = AV21TFFacDivCod_To ;
      AV65Facturacion_tfacdivwwds_13_tffacdivabr = AV22TFFacDivAbr ;
      AV66Facturacion_tfacdivwwds_14_tffacdivabr_sel = AV23TFFacDivAbr_Sel ;
      AV67Facturacion_tfacdivwwds_15_tffacrepcod = AV24TFFacRepCod ;
      AV68Facturacion_tfacdivwwds_16_tffacrepcod_sel = AV25TFFacRepCod_Sel ;
      AV69Facturacion_tfacdivwwds_17_tffacrepnom = AV26TFFacRepNom ;
      AV70Facturacion_tfacdivwwds_18_tffacrepnom_sel = AV27TFFacRepNom_Sel ;
      AV71Facturacion_tfacdivwwds_19_tfemprnom = AV28TFEmprNom ;
      AV72Facturacion_tfacdivwwds_20_tfemprnom_sel = AV29TFEmprNom_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           A3096FacDivTCod ,
                                           AV62Facturacion_tfacdivwwds_10_tffacdivtcod_sels ,
                                           AV55Facturacion_tfacdivwwds_3_tfemprcod_sel ,
                                           AV54Facturacion_tfacdivwwds_2_tfemprcod ,
                                           Integer.valueOf(AV56Facturacion_tfacdivwwds_4_tffaccod) ,
                                           Integer.valueOf(AV57Facturacion_tfacdivwwds_5_tffaccod_to) ,
                                           Integer.valueOf(AV58Facturacion_tfacdivwwds_6_tfclicod) ,
                                           Integer.valueOf(AV59Facturacion_tfacdivwwds_7_tfclicod_to) ,
                                           AV61Facturacion_tfacdivwwds_9_tfclinom_sel ,
                                           AV60Facturacion_tfacdivwwds_8_tfclinom ,
                                           Integer.valueOf(AV62Facturacion_tfacdivwwds_10_tffacdivtcod_sels.size()) ,
                                           Byte.valueOf(AV63Facturacion_tfacdivwwds_11_tffacdivcod) ,
                                           Byte.valueOf(AV64Facturacion_tfacdivwwds_12_tffacdivcod_to) ,
                                           AV66Facturacion_tfacdivwwds_14_tffacdivabr_sel ,
                                           AV65Facturacion_tfacdivwwds_13_tffacdivabr ,
                                           AV68Facturacion_tfacdivwwds_16_tffacrepcod_sel ,
                                           AV67Facturacion_tfacdivwwds_15_tffacrepcod ,
                                           AV70Facturacion_tfacdivwwds_18_tffacrepnom_sel ,
                                           AV69Facturacion_tfacdivwwds_17_tffacrepnom ,
                                           AV72Facturacion_tfacdivwwds_20_tfemprnom_sel ,
                                           AV71Facturacion_tfacdivwwds_19_tfemprnom ,
                                           A396EmprCod ,
                                           Integer.valueOf(A430FacCod) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Byte.valueOf(A3115FacDivCod) ,
                                           A3116FacDivAbr ,
                                           A3119FacRepCod ,
                                           A3120FacRepNom ,
                                           A407EmprNom ,
                                           AV53Facturacion_tfacdivwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV54Facturacion_tfacdivwwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV54Facturacion_tfacdivwwds_2_tfemprcod), 3, "%") ;
      lV60Facturacion_tfacdivwwds_8_tfclinom = GXutil.padr( GXutil.rtrim( AV60Facturacion_tfacdivwwds_8_tfclinom), 30, "%") ;
      lV65Facturacion_tfacdivwwds_13_tffacdivabr = GXutil.padr( GXutil.rtrim( AV65Facturacion_tfacdivwwds_13_tffacdivabr), 6, "%") ;
      lV67Facturacion_tfacdivwwds_15_tffacrepcod = GXutil.padr( GXutil.rtrim( AV67Facturacion_tfacdivwwds_15_tffacrepcod), 6, "%") ;
      lV69Facturacion_tfacdivwwds_17_tffacrepnom = GXutil.padr( GXutil.rtrim( AV69Facturacion_tfacdivwwds_17_tffacrepnom), 34, "%") ;
      lV71Facturacion_tfacdivwwds_19_tfemprnom = GXutil.padr( GXutil.rtrim( AV71Facturacion_tfacdivwwds_19_tfemprnom), 30, "%") ;
      /* Using cursor P0AVS4 */
      pr_default.execute(2, new Object[] {lV54Facturacion_tfacdivwwds_2_tfemprcod, AV55Facturacion_tfacdivwwds_3_tfemprcod_sel, Integer.valueOf(AV56Facturacion_tfacdivwwds_4_tffaccod), Integer.valueOf(AV57Facturacion_tfacdivwwds_5_tffaccod_to), Integer.valueOf(AV58Facturacion_tfacdivwwds_6_tfclicod), Integer.valueOf(AV59Facturacion_tfacdivwwds_7_tfclicod_to), lV60Facturacion_tfacdivwwds_8_tfclinom, AV61Facturacion_tfacdivwwds_9_tfclinom_sel, Byte.valueOf(AV63Facturacion_tfacdivwwds_11_tffacdivcod), Byte.valueOf(AV64Facturacion_tfacdivwwds_12_tffacdivcod_to), lV65Facturacion_tfacdivwwds_13_tffacdivabr, AV66Facturacion_tfacdivwwds_14_tffacdivabr_sel, lV67Facturacion_tfacdivwwds_15_tffacrepcod, AV68Facturacion_tfacdivwwds_16_tffacrepcod_sel, lV69Facturacion_tfacdivwwds_17_tffacrepnom, AV70Facturacion_tfacdivwwds_18_tffacrepnom_sel, lV71Facturacion_tfacdivwwds_19_tfemprnom, AV72Facturacion_tfacdivwwds_20_tfemprnom_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brkAVS6 = false ;
         A3116FacDivAbr = P0AVS4_A3116FacDivAbr[0] ;
         n3116FacDivAbr = P0AVS4_n3116FacDivAbr[0] ;
         A407EmprNom = P0AVS4_A407EmprNom[0] ;
         n407EmprNom = P0AVS4_n407EmprNom[0] ;
         A3120FacRepNom = P0AVS4_A3120FacRepNom[0] ;
         n3120FacRepNom = P0AVS4_n3120FacRepNom[0] ;
         A3119FacRepCod = P0AVS4_A3119FacRepCod[0] ;
         n3119FacRepCod = P0AVS4_n3119FacRepCod[0] ;
         A3115FacDivCod = P0AVS4_A3115FacDivCod[0] ;
         n3115FacDivCod = P0AVS4_n3115FacDivCod[0] ;
         A279CliNom = P0AVS4_A279CliNom[0] ;
         A252CliCod = P0AVS4_A252CliCod[0] ;
         A430FacCod = P0AVS4_A430FacCod[0] ;
         A396EmprCod = P0AVS4_A396EmprCod[0] ;
         A3096FacDivTCod = P0AVS4_A3096FacDivTCod[0] ;
         n3096FacDivTCod = P0AVS4_n3096FacDivTCod[0] ;
         A3116FacDivAbr = P0AVS4_A3116FacDivAbr[0] ;
         n3116FacDivAbr = P0AVS4_n3116FacDivAbr[0] ;
         A407EmprNom = P0AVS4_A407EmprNom[0] ;
         n407EmprNom = P0AVS4_n407EmprNom[0] ;
         A3120FacRepNom = P0AVS4_A3120FacRepNom[0] ;
         n3120FacRepNom = P0AVS4_n3120FacRepNom[0] ;
         A279CliNom = P0AVS4_A279CliNom[0] ;
         if ( (GXutil.strcmp("", AV53Facturacion_tfacdivwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A396EmprCod) , GXutil.padr( "%" + GXutil.upper( AV53Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A430FacCod, 8, 0) , GXutil.padr( "%" + AV53Facturacion_tfacdivwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV53Facturacion_tfacdivwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV53Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "peseta", ""), "") , GXutil.padr( "%" + GXutil.lower( AV53Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A3096FacDivTCod, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "euro", ""), "") , GXutil.padr( "%" + GXutil.lower( AV53Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A3096FacDivTCod, httpContext.getMessage( "E", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A3115FacDivCod, 2, 0) , GXutil.padr( "%" + AV53Facturacion_tfacdivwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3116FacDivAbr) , GXutil.padr( "%" + GXutil.upper( AV53Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3119FacRepCod) , GXutil.padr( "%" + GXutil.upper( AV53Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3120FacRepNom) , GXutil.padr( "%" + GXutil.upper( AV53Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A407EmprNom) , GXutil.padr( "%" + GXutil.upper( AV53Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV36count = 0 ;
            while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P0AVS4_A3116FacDivAbr[0], A3116FacDivAbr) == 0 ) )
            {
               brkAVS6 = false ;
               A3115FacDivCod = P0AVS4_A3115FacDivCod[0] ;
               n3115FacDivCod = P0AVS4_n3115FacDivCod[0] ;
               A430FacCod = P0AVS4_A430FacCod[0] ;
               A396EmprCod = P0AVS4_A396EmprCod[0] ;
               AV36count = (long)(AV36count+1) ;
               brkAVS6 = true ;
               pr_default.readNext(2);
            }
            if ( ! (GXutil.strcmp("", A3116FacDivAbr)==0) )
            {
               AV31Option = A3116FacDivAbr ;
               AV32Options.add(AV31Option, 0);
               AV35OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV36count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV32Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brkAVS6 )
         {
            brkAVS6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADFACREPCODOPTIONS' Routine */
      returnInSub = false ;
      AV24TFFacRepCod = AV43SearchTxt ;
      AV25TFFacRepCod_Sel = "" ;
      AV53Facturacion_tfacdivwwds_1_filterfulltext = AV48FilterFullText ;
      AV54Facturacion_tfacdivwwds_2_tfemprcod = AV10TFEmprCod ;
      AV55Facturacion_tfacdivwwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV56Facturacion_tfacdivwwds_4_tffaccod = AV12TFFacCod ;
      AV57Facturacion_tfacdivwwds_5_tffaccod_to = AV13TFFacCod_To ;
      AV58Facturacion_tfacdivwwds_6_tfclicod = AV14TFCliCod ;
      AV59Facturacion_tfacdivwwds_7_tfclicod_to = AV15TFCliCod_To ;
      AV60Facturacion_tfacdivwwds_8_tfclinom = AV16TFCliNom ;
      AV61Facturacion_tfacdivwwds_9_tfclinom_sel = AV17TFCliNom_Sel ;
      AV62Facturacion_tfacdivwwds_10_tffacdivtcod_sels = AV19TFFacDivTCod_Sels ;
      AV63Facturacion_tfacdivwwds_11_tffacdivcod = AV20TFFacDivCod ;
      AV64Facturacion_tfacdivwwds_12_tffacdivcod_to = AV21TFFacDivCod_To ;
      AV65Facturacion_tfacdivwwds_13_tffacdivabr = AV22TFFacDivAbr ;
      AV66Facturacion_tfacdivwwds_14_tffacdivabr_sel = AV23TFFacDivAbr_Sel ;
      AV67Facturacion_tfacdivwwds_15_tffacrepcod = AV24TFFacRepCod ;
      AV68Facturacion_tfacdivwwds_16_tffacrepcod_sel = AV25TFFacRepCod_Sel ;
      AV69Facturacion_tfacdivwwds_17_tffacrepnom = AV26TFFacRepNom ;
      AV70Facturacion_tfacdivwwds_18_tffacrepnom_sel = AV27TFFacRepNom_Sel ;
      AV71Facturacion_tfacdivwwds_19_tfemprnom = AV28TFEmprNom ;
      AV72Facturacion_tfacdivwwds_20_tfemprnom_sel = AV29TFEmprNom_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           A3096FacDivTCod ,
                                           AV62Facturacion_tfacdivwwds_10_tffacdivtcod_sels ,
                                           AV55Facturacion_tfacdivwwds_3_tfemprcod_sel ,
                                           AV54Facturacion_tfacdivwwds_2_tfemprcod ,
                                           Integer.valueOf(AV56Facturacion_tfacdivwwds_4_tffaccod) ,
                                           Integer.valueOf(AV57Facturacion_tfacdivwwds_5_tffaccod_to) ,
                                           Integer.valueOf(AV58Facturacion_tfacdivwwds_6_tfclicod) ,
                                           Integer.valueOf(AV59Facturacion_tfacdivwwds_7_tfclicod_to) ,
                                           AV61Facturacion_tfacdivwwds_9_tfclinom_sel ,
                                           AV60Facturacion_tfacdivwwds_8_tfclinom ,
                                           Integer.valueOf(AV62Facturacion_tfacdivwwds_10_tffacdivtcod_sels.size()) ,
                                           Byte.valueOf(AV63Facturacion_tfacdivwwds_11_tffacdivcod) ,
                                           Byte.valueOf(AV64Facturacion_tfacdivwwds_12_tffacdivcod_to) ,
                                           AV66Facturacion_tfacdivwwds_14_tffacdivabr_sel ,
                                           AV65Facturacion_tfacdivwwds_13_tffacdivabr ,
                                           AV68Facturacion_tfacdivwwds_16_tffacrepcod_sel ,
                                           AV67Facturacion_tfacdivwwds_15_tffacrepcod ,
                                           AV70Facturacion_tfacdivwwds_18_tffacrepnom_sel ,
                                           AV69Facturacion_tfacdivwwds_17_tffacrepnom ,
                                           AV72Facturacion_tfacdivwwds_20_tfemprnom_sel ,
                                           AV71Facturacion_tfacdivwwds_19_tfemprnom ,
                                           A396EmprCod ,
                                           Integer.valueOf(A430FacCod) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Byte.valueOf(A3115FacDivCod) ,
                                           A3116FacDivAbr ,
                                           A3119FacRepCod ,
                                           A3120FacRepNom ,
                                           A407EmprNom ,
                                           AV53Facturacion_tfacdivwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV54Facturacion_tfacdivwwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV54Facturacion_tfacdivwwds_2_tfemprcod), 3, "%") ;
      lV60Facturacion_tfacdivwwds_8_tfclinom = GXutil.padr( GXutil.rtrim( AV60Facturacion_tfacdivwwds_8_tfclinom), 30, "%") ;
      lV65Facturacion_tfacdivwwds_13_tffacdivabr = GXutil.padr( GXutil.rtrim( AV65Facturacion_tfacdivwwds_13_tffacdivabr), 6, "%") ;
      lV67Facturacion_tfacdivwwds_15_tffacrepcod = GXutil.padr( GXutil.rtrim( AV67Facturacion_tfacdivwwds_15_tffacrepcod), 6, "%") ;
      lV69Facturacion_tfacdivwwds_17_tffacrepnom = GXutil.padr( GXutil.rtrim( AV69Facturacion_tfacdivwwds_17_tffacrepnom), 34, "%") ;
      lV71Facturacion_tfacdivwwds_19_tfemprnom = GXutil.padr( GXutil.rtrim( AV71Facturacion_tfacdivwwds_19_tfemprnom), 30, "%") ;
      /* Using cursor P0AVS5 */
      pr_default.execute(3, new Object[] {lV54Facturacion_tfacdivwwds_2_tfemprcod, AV55Facturacion_tfacdivwwds_3_tfemprcod_sel, Integer.valueOf(AV56Facturacion_tfacdivwwds_4_tffaccod), Integer.valueOf(AV57Facturacion_tfacdivwwds_5_tffaccod_to), Integer.valueOf(AV58Facturacion_tfacdivwwds_6_tfclicod), Integer.valueOf(AV59Facturacion_tfacdivwwds_7_tfclicod_to), lV60Facturacion_tfacdivwwds_8_tfclinom, AV61Facturacion_tfacdivwwds_9_tfclinom_sel, Byte.valueOf(AV63Facturacion_tfacdivwwds_11_tffacdivcod), Byte.valueOf(AV64Facturacion_tfacdivwwds_12_tffacdivcod_to), lV65Facturacion_tfacdivwwds_13_tffacdivabr, AV66Facturacion_tfacdivwwds_14_tffacdivabr_sel, lV67Facturacion_tfacdivwwds_15_tffacrepcod, AV68Facturacion_tfacdivwwds_16_tffacrepcod_sel, lV69Facturacion_tfacdivwwds_17_tffacrepnom, AV70Facturacion_tfacdivwwds_18_tffacrepnom_sel, lV71Facturacion_tfacdivwwds_19_tfemprnom, AV72Facturacion_tfacdivwwds_20_tfemprnom_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brkAVS8 = false ;
         A3119FacRepCod = P0AVS5_A3119FacRepCod[0] ;
         n3119FacRepCod = P0AVS5_n3119FacRepCod[0] ;
         A407EmprNom = P0AVS5_A407EmprNom[0] ;
         n407EmprNom = P0AVS5_n407EmprNom[0] ;
         A3120FacRepNom = P0AVS5_A3120FacRepNom[0] ;
         n3120FacRepNom = P0AVS5_n3120FacRepNom[0] ;
         A3116FacDivAbr = P0AVS5_A3116FacDivAbr[0] ;
         n3116FacDivAbr = P0AVS5_n3116FacDivAbr[0] ;
         A3115FacDivCod = P0AVS5_A3115FacDivCod[0] ;
         n3115FacDivCod = P0AVS5_n3115FacDivCod[0] ;
         A279CliNom = P0AVS5_A279CliNom[0] ;
         A252CliCod = P0AVS5_A252CliCod[0] ;
         A430FacCod = P0AVS5_A430FacCod[0] ;
         A396EmprCod = P0AVS5_A396EmprCod[0] ;
         A3096FacDivTCod = P0AVS5_A3096FacDivTCod[0] ;
         n3096FacDivTCod = P0AVS5_n3096FacDivTCod[0] ;
         A3116FacDivAbr = P0AVS5_A3116FacDivAbr[0] ;
         n3116FacDivAbr = P0AVS5_n3116FacDivAbr[0] ;
         A407EmprNom = P0AVS5_A407EmprNom[0] ;
         n407EmprNom = P0AVS5_n407EmprNom[0] ;
         A3120FacRepNom = P0AVS5_A3120FacRepNom[0] ;
         n3120FacRepNom = P0AVS5_n3120FacRepNom[0] ;
         A279CliNom = P0AVS5_A279CliNom[0] ;
         if ( (GXutil.strcmp("", AV53Facturacion_tfacdivwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A396EmprCod) , GXutil.padr( "%" + GXutil.upper( AV53Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A430FacCod, 8, 0) , GXutil.padr( "%" + AV53Facturacion_tfacdivwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV53Facturacion_tfacdivwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV53Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "peseta", ""), "") , GXutil.padr( "%" + GXutil.lower( AV53Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A3096FacDivTCod, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "euro", ""), "") , GXutil.padr( "%" + GXutil.lower( AV53Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A3096FacDivTCod, httpContext.getMessage( "E", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A3115FacDivCod, 2, 0) , GXutil.padr( "%" + AV53Facturacion_tfacdivwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3116FacDivAbr) , GXutil.padr( "%" + GXutil.upper( AV53Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3119FacRepCod) , GXutil.padr( "%" + GXutil.upper( AV53Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3120FacRepNom) , GXutil.padr( "%" + GXutil.upper( AV53Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A407EmprNom) , GXutil.padr( "%" + GXutil.upper( AV53Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV36count = 0 ;
            while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P0AVS5_A3119FacRepCod[0], A3119FacRepCod) == 0 ) )
            {
               brkAVS8 = false ;
               A430FacCod = P0AVS5_A430FacCod[0] ;
               A396EmprCod = P0AVS5_A396EmprCod[0] ;
               AV36count = (long)(AV36count+1) ;
               brkAVS8 = true ;
               pr_default.readNext(3);
            }
            if ( ! (GXutil.strcmp("", A3119FacRepCod)==0) )
            {
               AV31Option = A3119FacRepCod ;
               AV32Options.add(AV31Option, 0);
               AV35OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV36count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV32Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brkAVS8 )
         {
            brkAVS8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADFACREPNOMOPTIONS' Routine */
      returnInSub = false ;
      AV26TFFacRepNom = AV43SearchTxt ;
      AV27TFFacRepNom_Sel = "" ;
      AV53Facturacion_tfacdivwwds_1_filterfulltext = AV48FilterFullText ;
      AV54Facturacion_tfacdivwwds_2_tfemprcod = AV10TFEmprCod ;
      AV55Facturacion_tfacdivwwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV56Facturacion_tfacdivwwds_4_tffaccod = AV12TFFacCod ;
      AV57Facturacion_tfacdivwwds_5_tffaccod_to = AV13TFFacCod_To ;
      AV58Facturacion_tfacdivwwds_6_tfclicod = AV14TFCliCod ;
      AV59Facturacion_tfacdivwwds_7_tfclicod_to = AV15TFCliCod_To ;
      AV60Facturacion_tfacdivwwds_8_tfclinom = AV16TFCliNom ;
      AV61Facturacion_tfacdivwwds_9_tfclinom_sel = AV17TFCliNom_Sel ;
      AV62Facturacion_tfacdivwwds_10_tffacdivtcod_sels = AV19TFFacDivTCod_Sels ;
      AV63Facturacion_tfacdivwwds_11_tffacdivcod = AV20TFFacDivCod ;
      AV64Facturacion_tfacdivwwds_12_tffacdivcod_to = AV21TFFacDivCod_To ;
      AV65Facturacion_tfacdivwwds_13_tffacdivabr = AV22TFFacDivAbr ;
      AV66Facturacion_tfacdivwwds_14_tffacdivabr_sel = AV23TFFacDivAbr_Sel ;
      AV67Facturacion_tfacdivwwds_15_tffacrepcod = AV24TFFacRepCod ;
      AV68Facturacion_tfacdivwwds_16_tffacrepcod_sel = AV25TFFacRepCod_Sel ;
      AV69Facturacion_tfacdivwwds_17_tffacrepnom = AV26TFFacRepNom ;
      AV70Facturacion_tfacdivwwds_18_tffacrepnom_sel = AV27TFFacRepNom_Sel ;
      AV71Facturacion_tfacdivwwds_19_tfemprnom = AV28TFEmprNom ;
      AV72Facturacion_tfacdivwwds_20_tfemprnom_sel = AV29TFEmprNom_Sel ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           A3096FacDivTCod ,
                                           AV62Facturacion_tfacdivwwds_10_tffacdivtcod_sels ,
                                           AV55Facturacion_tfacdivwwds_3_tfemprcod_sel ,
                                           AV54Facturacion_tfacdivwwds_2_tfemprcod ,
                                           Integer.valueOf(AV56Facturacion_tfacdivwwds_4_tffaccod) ,
                                           Integer.valueOf(AV57Facturacion_tfacdivwwds_5_tffaccod_to) ,
                                           Integer.valueOf(AV58Facturacion_tfacdivwwds_6_tfclicod) ,
                                           Integer.valueOf(AV59Facturacion_tfacdivwwds_7_tfclicod_to) ,
                                           AV61Facturacion_tfacdivwwds_9_tfclinom_sel ,
                                           AV60Facturacion_tfacdivwwds_8_tfclinom ,
                                           Integer.valueOf(AV62Facturacion_tfacdivwwds_10_tffacdivtcod_sels.size()) ,
                                           Byte.valueOf(AV63Facturacion_tfacdivwwds_11_tffacdivcod) ,
                                           Byte.valueOf(AV64Facturacion_tfacdivwwds_12_tffacdivcod_to) ,
                                           AV66Facturacion_tfacdivwwds_14_tffacdivabr_sel ,
                                           AV65Facturacion_tfacdivwwds_13_tffacdivabr ,
                                           AV68Facturacion_tfacdivwwds_16_tffacrepcod_sel ,
                                           AV67Facturacion_tfacdivwwds_15_tffacrepcod ,
                                           AV70Facturacion_tfacdivwwds_18_tffacrepnom_sel ,
                                           AV69Facturacion_tfacdivwwds_17_tffacrepnom ,
                                           AV72Facturacion_tfacdivwwds_20_tfemprnom_sel ,
                                           AV71Facturacion_tfacdivwwds_19_tfemprnom ,
                                           A396EmprCod ,
                                           Integer.valueOf(A430FacCod) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Byte.valueOf(A3115FacDivCod) ,
                                           A3116FacDivAbr ,
                                           A3119FacRepCod ,
                                           A3120FacRepNom ,
                                           A407EmprNom ,
                                           AV53Facturacion_tfacdivwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV54Facturacion_tfacdivwwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV54Facturacion_tfacdivwwds_2_tfemprcod), 3, "%") ;
      lV60Facturacion_tfacdivwwds_8_tfclinom = GXutil.padr( GXutil.rtrim( AV60Facturacion_tfacdivwwds_8_tfclinom), 30, "%") ;
      lV65Facturacion_tfacdivwwds_13_tffacdivabr = GXutil.padr( GXutil.rtrim( AV65Facturacion_tfacdivwwds_13_tffacdivabr), 6, "%") ;
      lV67Facturacion_tfacdivwwds_15_tffacrepcod = GXutil.padr( GXutil.rtrim( AV67Facturacion_tfacdivwwds_15_tffacrepcod), 6, "%") ;
      lV69Facturacion_tfacdivwwds_17_tffacrepnom = GXutil.padr( GXutil.rtrim( AV69Facturacion_tfacdivwwds_17_tffacrepnom), 34, "%") ;
      lV71Facturacion_tfacdivwwds_19_tfemprnom = GXutil.padr( GXutil.rtrim( AV71Facturacion_tfacdivwwds_19_tfemprnom), 30, "%") ;
      /* Using cursor P0AVS6 */
      pr_default.execute(4, new Object[] {lV54Facturacion_tfacdivwwds_2_tfemprcod, AV55Facturacion_tfacdivwwds_3_tfemprcod_sel, Integer.valueOf(AV56Facturacion_tfacdivwwds_4_tffaccod), Integer.valueOf(AV57Facturacion_tfacdivwwds_5_tffaccod_to), Integer.valueOf(AV58Facturacion_tfacdivwwds_6_tfclicod), Integer.valueOf(AV59Facturacion_tfacdivwwds_7_tfclicod_to), lV60Facturacion_tfacdivwwds_8_tfclinom, AV61Facturacion_tfacdivwwds_9_tfclinom_sel, Byte.valueOf(AV63Facturacion_tfacdivwwds_11_tffacdivcod), Byte.valueOf(AV64Facturacion_tfacdivwwds_12_tffacdivcod_to), lV65Facturacion_tfacdivwwds_13_tffacdivabr, AV66Facturacion_tfacdivwwds_14_tffacdivabr_sel, lV67Facturacion_tfacdivwwds_15_tffacrepcod, AV68Facturacion_tfacdivwwds_16_tffacrepcod_sel, lV69Facturacion_tfacdivwwds_17_tffacrepnom, AV70Facturacion_tfacdivwwds_18_tffacrepnom_sel, lV71Facturacion_tfacdivwwds_19_tfemprnom, AV72Facturacion_tfacdivwwds_20_tfemprnom_sel});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brkAVS10 = false ;
         A3120FacRepNom = P0AVS6_A3120FacRepNom[0] ;
         n3120FacRepNom = P0AVS6_n3120FacRepNom[0] ;
         A407EmprNom = P0AVS6_A407EmprNom[0] ;
         n407EmprNom = P0AVS6_n407EmprNom[0] ;
         A3119FacRepCod = P0AVS6_A3119FacRepCod[0] ;
         n3119FacRepCod = P0AVS6_n3119FacRepCod[0] ;
         A3116FacDivAbr = P0AVS6_A3116FacDivAbr[0] ;
         n3116FacDivAbr = P0AVS6_n3116FacDivAbr[0] ;
         A3115FacDivCod = P0AVS6_A3115FacDivCod[0] ;
         n3115FacDivCod = P0AVS6_n3115FacDivCod[0] ;
         A279CliNom = P0AVS6_A279CliNom[0] ;
         A252CliCod = P0AVS6_A252CliCod[0] ;
         A430FacCod = P0AVS6_A430FacCod[0] ;
         A396EmprCod = P0AVS6_A396EmprCod[0] ;
         A3096FacDivTCod = P0AVS6_A3096FacDivTCod[0] ;
         n3096FacDivTCod = P0AVS6_n3096FacDivTCod[0] ;
         A3116FacDivAbr = P0AVS6_A3116FacDivAbr[0] ;
         n3116FacDivAbr = P0AVS6_n3116FacDivAbr[0] ;
         A407EmprNom = P0AVS6_A407EmprNom[0] ;
         n407EmprNom = P0AVS6_n407EmprNom[0] ;
         A3120FacRepNom = P0AVS6_A3120FacRepNom[0] ;
         n3120FacRepNom = P0AVS6_n3120FacRepNom[0] ;
         A279CliNom = P0AVS6_A279CliNom[0] ;
         if ( (GXutil.strcmp("", AV53Facturacion_tfacdivwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A396EmprCod) , GXutil.padr( "%" + GXutil.upper( AV53Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A430FacCod, 8, 0) , GXutil.padr( "%" + AV53Facturacion_tfacdivwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV53Facturacion_tfacdivwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV53Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "peseta", ""), "") , GXutil.padr( "%" + GXutil.lower( AV53Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A3096FacDivTCod, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "euro", ""), "") , GXutil.padr( "%" + GXutil.lower( AV53Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A3096FacDivTCod, httpContext.getMessage( "E", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A3115FacDivCod, 2, 0) , GXutil.padr( "%" + AV53Facturacion_tfacdivwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3116FacDivAbr) , GXutil.padr( "%" + GXutil.upper( AV53Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3119FacRepCod) , GXutil.padr( "%" + GXutil.upper( AV53Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3120FacRepNom) , GXutil.padr( "%" + GXutil.upper( AV53Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A407EmprNom) , GXutil.padr( "%" + GXutil.upper( AV53Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV36count = 0 ;
            while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P0AVS6_A3120FacRepNom[0], A3120FacRepNom) == 0 ) )
            {
               brkAVS10 = false ;
               A3119FacRepCod = P0AVS6_A3119FacRepCod[0] ;
               n3119FacRepCod = P0AVS6_n3119FacRepCod[0] ;
               A430FacCod = P0AVS6_A430FacCod[0] ;
               A396EmprCod = P0AVS6_A396EmprCod[0] ;
               AV36count = (long)(AV36count+1) ;
               brkAVS10 = true ;
               pr_default.readNext(4);
            }
            if ( ! (GXutil.strcmp("", A3120FacRepNom)==0) )
            {
               AV31Option = A3120FacRepNom ;
               AV32Options.add(AV31Option, 0);
               AV35OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV36count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV32Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brkAVS10 )
         {
            brkAVS10 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADEMPRNOMOPTIONS' Routine */
      returnInSub = false ;
      AV28TFEmprNom = AV43SearchTxt ;
      AV29TFEmprNom_Sel = "" ;
      AV53Facturacion_tfacdivwwds_1_filterfulltext = AV48FilterFullText ;
      AV54Facturacion_tfacdivwwds_2_tfemprcod = AV10TFEmprCod ;
      AV55Facturacion_tfacdivwwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV56Facturacion_tfacdivwwds_4_tffaccod = AV12TFFacCod ;
      AV57Facturacion_tfacdivwwds_5_tffaccod_to = AV13TFFacCod_To ;
      AV58Facturacion_tfacdivwwds_6_tfclicod = AV14TFCliCod ;
      AV59Facturacion_tfacdivwwds_7_tfclicod_to = AV15TFCliCod_To ;
      AV60Facturacion_tfacdivwwds_8_tfclinom = AV16TFCliNom ;
      AV61Facturacion_tfacdivwwds_9_tfclinom_sel = AV17TFCliNom_Sel ;
      AV62Facturacion_tfacdivwwds_10_tffacdivtcod_sels = AV19TFFacDivTCod_Sels ;
      AV63Facturacion_tfacdivwwds_11_tffacdivcod = AV20TFFacDivCod ;
      AV64Facturacion_tfacdivwwds_12_tffacdivcod_to = AV21TFFacDivCod_To ;
      AV65Facturacion_tfacdivwwds_13_tffacdivabr = AV22TFFacDivAbr ;
      AV66Facturacion_tfacdivwwds_14_tffacdivabr_sel = AV23TFFacDivAbr_Sel ;
      AV67Facturacion_tfacdivwwds_15_tffacrepcod = AV24TFFacRepCod ;
      AV68Facturacion_tfacdivwwds_16_tffacrepcod_sel = AV25TFFacRepCod_Sel ;
      AV69Facturacion_tfacdivwwds_17_tffacrepnom = AV26TFFacRepNom ;
      AV70Facturacion_tfacdivwwds_18_tffacrepnom_sel = AV27TFFacRepNom_Sel ;
      AV71Facturacion_tfacdivwwds_19_tfemprnom = AV28TFEmprNom ;
      AV72Facturacion_tfacdivwwds_20_tfemprnom_sel = AV29TFEmprNom_Sel ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           A3096FacDivTCod ,
                                           AV62Facturacion_tfacdivwwds_10_tffacdivtcod_sels ,
                                           AV55Facturacion_tfacdivwwds_3_tfemprcod_sel ,
                                           AV54Facturacion_tfacdivwwds_2_tfemprcod ,
                                           Integer.valueOf(AV56Facturacion_tfacdivwwds_4_tffaccod) ,
                                           Integer.valueOf(AV57Facturacion_tfacdivwwds_5_tffaccod_to) ,
                                           Integer.valueOf(AV58Facturacion_tfacdivwwds_6_tfclicod) ,
                                           Integer.valueOf(AV59Facturacion_tfacdivwwds_7_tfclicod_to) ,
                                           AV61Facturacion_tfacdivwwds_9_tfclinom_sel ,
                                           AV60Facturacion_tfacdivwwds_8_tfclinom ,
                                           Integer.valueOf(AV62Facturacion_tfacdivwwds_10_tffacdivtcod_sels.size()) ,
                                           Byte.valueOf(AV63Facturacion_tfacdivwwds_11_tffacdivcod) ,
                                           Byte.valueOf(AV64Facturacion_tfacdivwwds_12_tffacdivcod_to) ,
                                           AV66Facturacion_tfacdivwwds_14_tffacdivabr_sel ,
                                           AV65Facturacion_tfacdivwwds_13_tffacdivabr ,
                                           AV68Facturacion_tfacdivwwds_16_tffacrepcod_sel ,
                                           AV67Facturacion_tfacdivwwds_15_tffacrepcod ,
                                           AV70Facturacion_tfacdivwwds_18_tffacrepnom_sel ,
                                           AV69Facturacion_tfacdivwwds_17_tffacrepnom ,
                                           AV72Facturacion_tfacdivwwds_20_tfemprnom_sel ,
                                           AV71Facturacion_tfacdivwwds_19_tfemprnom ,
                                           A396EmprCod ,
                                           Integer.valueOf(A430FacCod) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Byte.valueOf(A3115FacDivCod) ,
                                           A3116FacDivAbr ,
                                           A3119FacRepCod ,
                                           A3120FacRepNom ,
                                           A407EmprNom ,
                                           AV53Facturacion_tfacdivwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV54Facturacion_tfacdivwwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV54Facturacion_tfacdivwwds_2_tfemprcod), 3, "%") ;
      lV60Facturacion_tfacdivwwds_8_tfclinom = GXutil.padr( GXutil.rtrim( AV60Facturacion_tfacdivwwds_8_tfclinom), 30, "%") ;
      lV65Facturacion_tfacdivwwds_13_tffacdivabr = GXutil.padr( GXutil.rtrim( AV65Facturacion_tfacdivwwds_13_tffacdivabr), 6, "%") ;
      lV67Facturacion_tfacdivwwds_15_tffacrepcod = GXutil.padr( GXutil.rtrim( AV67Facturacion_tfacdivwwds_15_tffacrepcod), 6, "%") ;
      lV69Facturacion_tfacdivwwds_17_tffacrepnom = GXutil.padr( GXutil.rtrim( AV69Facturacion_tfacdivwwds_17_tffacrepnom), 34, "%") ;
      lV71Facturacion_tfacdivwwds_19_tfemprnom = GXutil.padr( GXutil.rtrim( AV71Facturacion_tfacdivwwds_19_tfemprnom), 30, "%") ;
      /* Using cursor P0AVS7 */
      pr_default.execute(5, new Object[] {lV54Facturacion_tfacdivwwds_2_tfemprcod, AV55Facturacion_tfacdivwwds_3_tfemprcod_sel, Integer.valueOf(AV56Facturacion_tfacdivwwds_4_tffaccod), Integer.valueOf(AV57Facturacion_tfacdivwwds_5_tffaccod_to), Integer.valueOf(AV58Facturacion_tfacdivwwds_6_tfclicod), Integer.valueOf(AV59Facturacion_tfacdivwwds_7_tfclicod_to), lV60Facturacion_tfacdivwwds_8_tfclinom, AV61Facturacion_tfacdivwwds_9_tfclinom_sel, Byte.valueOf(AV63Facturacion_tfacdivwwds_11_tffacdivcod), Byte.valueOf(AV64Facturacion_tfacdivwwds_12_tffacdivcod_to), lV65Facturacion_tfacdivwwds_13_tffacdivabr, AV66Facturacion_tfacdivwwds_14_tffacdivabr_sel, lV67Facturacion_tfacdivwwds_15_tffacrepcod, AV68Facturacion_tfacdivwwds_16_tffacrepcod_sel, lV69Facturacion_tfacdivwwds_17_tffacrepnom, AV70Facturacion_tfacdivwwds_18_tffacrepnom_sel, lV71Facturacion_tfacdivwwds_19_tfemprnom, AV72Facturacion_tfacdivwwds_20_tfemprnom_sel});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brkAVS12 = false ;
         A407EmprNom = P0AVS7_A407EmprNom[0] ;
         n407EmprNom = P0AVS7_n407EmprNom[0] ;
         A3120FacRepNom = P0AVS7_A3120FacRepNom[0] ;
         n3120FacRepNom = P0AVS7_n3120FacRepNom[0] ;
         A3119FacRepCod = P0AVS7_A3119FacRepCod[0] ;
         n3119FacRepCod = P0AVS7_n3119FacRepCod[0] ;
         A3116FacDivAbr = P0AVS7_A3116FacDivAbr[0] ;
         n3116FacDivAbr = P0AVS7_n3116FacDivAbr[0] ;
         A3115FacDivCod = P0AVS7_A3115FacDivCod[0] ;
         n3115FacDivCod = P0AVS7_n3115FacDivCod[0] ;
         A279CliNom = P0AVS7_A279CliNom[0] ;
         A252CliCod = P0AVS7_A252CliCod[0] ;
         A430FacCod = P0AVS7_A430FacCod[0] ;
         A396EmprCod = P0AVS7_A396EmprCod[0] ;
         A3096FacDivTCod = P0AVS7_A3096FacDivTCod[0] ;
         n3096FacDivTCod = P0AVS7_n3096FacDivTCod[0] ;
         A3116FacDivAbr = P0AVS7_A3116FacDivAbr[0] ;
         n3116FacDivAbr = P0AVS7_n3116FacDivAbr[0] ;
         A407EmprNom = P0AVS7_A407EmprNom[0] ;
         n407EmprNom = P0AVS7_n407EmprNom[0] ;
         A3120FacRepNom = P0AVS7_A3120FacRepNom[0] ;
         n3120FacRepNom = P0AVS7_n3120FacRepNom[0] ;
         A279CliNom = P0AVS7_A279CliNom[0] ;
         if ( (GXutil.strcmp("", AV53Facturacion_tfacdivwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A396EmprCod) , GXutil.padr( "%" + GXutil.upper( AV53Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A430FacCod, 8, 0) , GXutil.padr( "%" + AV53Facturacion_tfacdivwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV53Facturacion_tfacdivwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV53Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "peseta", ""), "") , GXutil.padr( "%" + GXutil.lower( AV53Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A3096FacDivTCod, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "euro", ""), "") , GXutil.padr( "%" + GXutil.lower( AV53Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A3096FacDivTCod, httpContext.getMessage( "E", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A3115FacDivCod, 2, 0) , GXutil.padr( "%" + AV53Facturacion_tfacdivwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3116FacDivAbr) , GXutil.padr( "%" + GXutil.upper( AV53Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3119FacRepCod) , GXutil.padr( "%" + GXutil.upper( AV53Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3120FacRepNom) , GXutil.padr( "%" + GXutil.upper( AV53Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A407EmprNom) , GXutil.padr( "%" + GXutil.upper( AV53Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV36count = 0 ;
            while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P0AVS7_A407EmprNom[0], A407EmprNom) == 0 ) )
            {
               brkAVS12 = false ;
               A430FacCod = P0AVS7_A430FacCod[0] ;
               A396EmprCod = P0AVS7_A396EmprCod[0] ;
               AV36count = (long)(AV36count+1) ;
               brkAVS12 = true ;
               pr_default.readNext(5);
            }
            if ( ! (GXutil.strcmp("", A407EmprNom)==0) )
            {
               AV31Option = A407EmprNom ;
               AV32Options.add(AV31Option, 0);
               AV35OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV36count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV32Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brkAVS12 )
         {
            brkAVS12 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tfacdivwwgetfilterdata.this.AV45OptionsJson;
      this.aP4[0] = tfacdivwwgetfilterdata.this.AV46OptionsDescJson;
      this.aP5[0] = tfacdivwwgetfilterdata.this.AV47OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV45OptionsJson = "" ;
      AV46OptionsDescJson = "" ;
      AV47OptionIndexesJson = "" ;
      AV32Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV34OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV35OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV37Session = httpContext.getWebSession();
      AV39GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV40GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV48FilterFullText = "" ;
      AV10TFEmprCod = "" ;
      AV11TFEmprCod_Sel = "" ;
      AV16TFCliNom = "" ;
      AV17TFCliNom_Sel = "" ;
      AV18TFFacDivTCod_SelsJson = "" ;
      AV19TFFacDivTCod_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV22TFFacDivAbr = "" ;
      AV23TFFacDivAbr_Sel = "" ;
      AV24TFFacRepCod = "" ;
      AV25TFFacRepCod_Sel = "" ;
      AV26TFFacRepNom = "" ;
      AV27TFFacRepNom_Sel = "" ;
      AV28TFEmprNom = "" ;
      AV29TFEmprNom_Sel = "" ;
      A396EmprCod = "" ;
      AV53Facturacion_tfacdivwwds_1_filterfulltext = "" ;
      AV54Facturacion_tfacdivwwds_2_tfemprcod = "" ;
      AV55Facturacion_tfacdivwwds_3_tfemprcod_sel = "" ;
      AV60Facturacion_tfacdivwwds_8_tfclinom = "" ;
      AV61Facturacion_tfacdivwwds_9_tfclinom_sel = "" ;
      AV62Facturacion_tfacdivwwds_10_tffacdivtcod_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV65Facturacion_tfacdivwwds_13_tffacdivabr = "" ;
      AV66Facturacion_tfacdivwwds_14_tffacdivabr_sel = "" ;
      AV67Facturacion_tfacdivwwds_15_tffacrepcod = "" ;
      AV68Facturacion_tfacdivwwds_16_tffacrepcod_sel = "" ;
      AV69Facturacion_tfacdivwwds_17_tffacrepnom = "" ;
      AV70Facturacion_tfacdivwwds_18_tffacrepnom_sel = "" ;
      AV71Facturacion_tfacdivwwds_19_tfemprnom = "" ;
      AV72Facturacion_tfacdivwwds_20_tfemprnom_sel = "" ;
      lV53Facturacion_tfacdivwwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV54Facturacion_tfacdivwwds_2_tfemprcod = "" ;
      lV60Facturacion_tfacdivwwds_8_tfclinom = "" ;
      lV65Facturacion_tfacdivwwds_13_tffacdivabr = "" ;
      lV67Facturacion_tfacdivwwds_15_tffacrepcod = "" ;
      lV69Facturacion_tfacdivwwds_17_tffacrepnom = "" ;
      lV71Facturacion_tfacdivwwds_19_tfemprnom = "" ;
      A3096FacDivTCod = "" ;
      A279CliNom = "" ;
      A3116FacDivAbr = "" ;
      A3119FacRepCod = "" ;
      A3120FacRepNom = "" ;
      A407EmprNom = "" ;
      P0AVS2_A396EmprCod = new String[] {""} ;
      P0AVS2_A407EmprNom = new String[] {""} ;
      P0AVS2_n407EmprNom = new boolean[] {false} ;
      P0AVS2_A3120FacRepNom = new String[] {""} ;
      P0AVS2_n3120FacRepNom = new boolean[] {false} ;
      P0AVS2_A3119FacRepCod = new String[] {""} ;
      P0AVS2_n3119FacRepCod = new boolean[] {false} ;
      P0AVS2_A3116FacDivAbr = new String[] {""} ;
      P0AVS2_n3116FacDivAbr = new boolean[] {false} ;
      P0AVS2_A3115FacDivCod = new byte[1] ;
      P0AVS2_n3115FacDivCod = new boolean[] {false} ;
      P0AVS2_A279CliNom = new String[] {""} ;
      P0AVS2_A252CliCod = new int[1] ;
      P0AVS2_A430FacCod = new int[1] ;
      P0AVS2_A3096FacDivTCod = new String[] {""} ;
      P0AVS2_n3096FacDivTCod = new boolean[] {false} ;
      AV31Option = "" ;
      AV33OptionDesc = "" ;
      P0AVS3_A279CliNom = new String[] {""} ;
      P0AVS3_A407EmprNom = new String[] {""} ;
      P0AVS3_n407EmprNom = new boolean[] {false} ;
      P0AVS3_A3120FacRepNom = new String[] {""} ;
      P0AVS3_n3120FacRepNom = new boolean[] {false} ;
      P0AVS3_A3119FacRepCod = new String[] {""} ;
      P0AVS3_n3119FacRepCod = new boolean[] {false} ;
      P0AVS3_A3116FacDivAbr = new String[] {""} ;
      P0AVS3_n3116FacDivAbr = new boolean[] {false} ;
      P0AVS3_A3115FacDivCod = new byte[1] ;
      P0AVS3_n3115FacDivCod = new boolean[] {false} ;
      P0AVS3_A252CliCod = new int[1] ;
      P0AVS3_A430FacCod = new int[1] ;
      P0AVS3_A396EmprCod = new String[] {""} ;
      P0AVS3_A3096FacDivTCod = new String[] {""} ;
      P0AVS3_n3096FacDivTCod = new boolean[] {false} ;
      P0AVS4_A3116FacDivAbr = new String[] {""} ;
      P0AVS4_n3116FacDivAbr = new boolean[] {false} ;
      P0AVS4_A407EmprNom = new String[] {""} ;
      P0AVS4_n407EmprNom = new boolean[] {false} ;
      P0AVS4_A3120FacRepNom = new String[] {""} ;
      P0AVS4_n3120FacRepNom = new boolean[] {false} ;
      P0AVS4_A3119FacRepCod = new String[] {""} ;
      P0AVS4_n3119FacRepCod = new boolean[] {false} ;
      P0AVS4_A3115FacDivCod = new byte[1] ;
      P0AVS4_n3115FacDivCod = new boolean[] {false} ;
      P0AVS4_A279CliNom = new String[] {""} ;
      P0AVS4_A252CliCod = new int[1] ;
      P0AVS4_A430FacCod = new int[1] ;
      P0AVS4_A396EmprCod = new String[] {""} ;
      P0AVS4_A3096FacDivTCod = new String[] {""} ;
      P0AVS4_n3096FacDivTCod = new boolean[] {false} ;
      P0AVS5_A3119FacRepCod = new String[] {""} ;
      P0AVS5_n3119FacRepCod = new boolean[] {false} ;
      P0AVS5_A407EmprNom = new String[] {""} ;
      P0AVS5_n407EmprNom = new boolean[] {false} ;
      P0AVS5_A3120FacRepNom = new String[] {""} ;
      P0AVS5_n3120FacRepNom = new boolean[] {false} ;
      P0AVS5_A3116FacDivAbr = new String[] {""} ;
      P0AVS5_n3116FacDivAbr = new boolean[] {false} ;
      P0AVS5_A3115FacDivCod = new byte[1] ;
      P0AVS5_n3115FacDivCod = new boolean[] {false} ;
      P0AVS5_A279CliNom = new String[] {""} ;
      P0AVS5_A252CliCod = new int[1] ;
      P0AVS5_A430FacCod = new int[1] ;
      P0AVS5_A396EmprCod = new String[] {""} ;
      P0AVS5_A3096FacDivTCod = new String[] {""} ;
      P0AVS5_n3096FacDivTCod = new boolean[] {false} ;
      P0AVS6_A3120FacRepNom = new String[] {""} ;
      P0AVS6_n3120FacRepNom = new boolean[] {false} ;
      P0AVS6_A407EmprNom = new String[] {""} ;
      P0AVS6_n407EmprNom = new boolean[] {false} ;
      P0AVS6_A3119FacRepCod = new String[] {""} ;
      P0AVS6_n3119FacRepCod = new boolean[] {false} ;
      P0AVS6_A3116FacDivAbr = new String[] {""} ;
      P0AVS6_n3116FacDivAbr = new boolean[] {false} ;
      P0AVS6_A3115FacDivCod = new byte[1] ;
      P0AVS6_n3115FacDivCod = new boolean[] {false} ;
      P0AVS6_A279CliNom = new String[] {""} ;
      P0AVS6_A252CliCod = new int[1] ;
      P0AVS6_A430FacCod = new int[1] ;
      P0AVS6_A396EmprCod = new String[] {""} ;
      P0AVS6_A3096FacDivTCod = new String[] {""} ;
      P0AVS6_n3096FacDivTCod = new boolean[] {false} ;
      P0AVS7_A407EmprNom = new String[] {""} ;
      P0AVS7_n407EmprNom = new boolean[] {false} ;
      P0AVS7_A3120FacRepNom = new String[] {""} ;
      P0AVS7_n3120FacRepNom = new boolean[] {false} ;
      P0AVS7_A3119FacRepCod = new String[] {""} ;
      P0AVS7_n3119FacRepCod = new boolean[] {false} ;
      P0AVS7_A3116FacDivAbr = new String[] {""} ;
      P0AVS7_n3116FacDivAbr = new boolean[] {false} ;
      P0AVS7_A3115FacDivCod = new byte[1] ;
      P0AVS7_n3115FacDivCod = new boolean[] {false} ;
      P0AVS7_A279CliNom = new String[] {""} ;
      P0AVS7_A252CliCod = new int[1] ;
      P0AVS7_A430FacCod = new int[1] ;
      P0AVS7_A396EmprCod = new String[] {""} ;
      P0AVS7_A3096FacDivTCod = new String[] {""} ;
      P0AVS7_n3096FacDivTCod = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.tfacdivwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0AVS2_A396EmprCod, P0AVS2_A407EmprNom, P0AVS2_n407EmprNom, P0AVS2_A3120FacRepNom, P0AVS2_n3120FacRepNom, P0AVS2_A3119FacRepCod, P0AVS2_n3119FacRepCod, P0AVS2_A3116FacDivAbr, P0AVS2_n3116FacDivAbr, P0AVS2_A3115FacDivCod,
            P0AVS2_n3115FacDivCod, P0AVS2_A279CliNom, P0AVS2_A252CliCod, P0AVS2_A430FacCod, P0AVS2_A3096FacDivTCod, P0AVS2_n3096FacDivTCod
            }
            , new Object[] {
            P0AVS3_A279CliNom, P0AVS3_A407EmprNom, P0AVS3_n407EmprNom, P0AVS3_A3120FacRepNom, P0AVS3_n3120FacRepNom, P0AVS3_A3119FacRepCod, P0AVS3_n3119FacRepCod, P0AVS3_A3116FacDivAbr, P0AVS3_n3116FacDivAbr, P0AVS3_A3115FacDivCod,
            P0AVS3_n3115FacDivCod, P0AVS3_A252CliCod, P0AVS3_A430FacCod, P0AVS3_A396EmprCod, P0AVS3_A3096FacDivTCod, P0AVS3_n3096FacDivTCod
            }
            , new Object[] {
            P0AVS4_A3116FacDivAbr, P0AVS4_n3116FacDivAbr, P0AVS4_A407EmprNom, P0AVS4_n407EmprNom, P0AVS4_A3120FacRepNom, P0AVS4_n3120FacRepNom, P0AVS4_A3119FacRepCod, P0AVS4_n3119FacRepCod, P0AVS4_A3115FacDivCod, P0AVS4_n3115FacDivCod,
            P0AVS4_A279CliNom, P0AVS4_A252CliCod, P0AVS4_A430FacCod, P0AVS4_A396EmprCod, P0AVS4_A3096FacDivTCod, P0AVS4_n3096FacDivTCod
            }
            , new Object[] {
            P0AVS5_A3119FacRepCod, P0AVS5_n3119FacRepCod, P0AVS5_A407EmprNom, P0AVS5_n407EmprNom, P0AVS5_A3120FacRepNom, P0AVS5_n3120FacRepNom, P0AVS5_A3116FacDivAbr, P0AVS5_n3116FacDivAbr, P0AVS5_A3115FacDivCod, P0AVS5_n3115FacDivCod,
            P0AVS5_A279CliNom, P0AVS5_A252CliCod, P0AVS5_A430FacCod, P0AVS5_A396EmprCod, P0AVS5_A3096FacDivTCod, P0AVS5_n3096FacDivTCod
            }
            , new Object[] {
            P0AVS6_A3120FacRepNom, P0AVS6_n3120FacRepNom, P0AVS6_A407EmprNom, P0AVS6_n407EmprNom, P0AVS6_A3119FacRepCod, P0AVS6_n3119FacRepCod, P0AVS6_A3116FacDivAbr, P0AVS6_n3116FacDivAbr, P0AVS6_A3115FacDivCod, P0AVS6_n3115FacDivCod,
            P0AVS6_A279CliNom, P0AVS6_A252CliCod, P0AVS6_A430FacCod, P0AVS6_A396EmprCod, P0AVS6_A3096FacDivTCod, P0AVS6_n3096FacDivTCod
            }
            , new Object[] {
            P0AVS7_A407EmprNom, P0AVS7_n407EmprNom, P0AVS7_A3120FacRepNom, P0AVS7_n3120FacRepNom, P0AVS7_A3119FacRepCod, P0AVS7_n3119FacRepCod, P0AVS7_A3116FacDivAbr, P0AVS7_n3116FacDivAbr, P0AVS7_A3115FacDivCod, P0AVS7_n3115FacDivCod,
            P0AVS7_A279CliNom, P0AVS7_A252CliCod, P0AVS7_A430FacCod, P0AVS7_A396EmprCod, P0AVS7_A3096FacDivTCod, P0AVS7_n3096FacDivTCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV20TFFacDivCod ;
   private byte AV21TFFacDivCod_To ;
   private byte AV63Facturacion_tfacdivwwds_11_tffacdivcod ;
   private byte AV64Facturacion_tfacdivwwds_12_tffacdivcod_to ;
   private byte A3115FacDivCod ;
   private short Gx_err ;
   private int AV51GXV1 ;
   private int AV12TFFacCod ;
   private int AV13TFFacCod_To ;
   private int AV14TFCliCod ;
   private int AV15TFCliCod_To ;
   private int AV56Facturacion_tfacdivwwds_4_tffaccod ;
   private int AV57Facturacion_tfacdivwwds_5_tffaccod_to ;
   private int AV58Facturacion_tfacdivwwds_6_tfclicod ;
   private int AV59Facturacion_tfacdivwwds_7_tfclicod_to ;
   private int AV62Facturacion_tfacdivwwds_10_tffacdivtcod_sels_size ;
   private int A430FacCod ;
   private int A252CliCod ;
   private long AV36count ;
   private String AV10TFEmprCod ;
   private String AV11TFEmprCod_Sel ;
   private String AV16TFCliNom ;
   private String AV17TFCliNom_Sel ;
   private String AV22TFFacDivAbr ;
   private String AV23TFFacDivAbr_Sel ;
   private String AV24TFFacRepCod ;
   private String AV25TFFacRepCod_Sel ;
   private String AV26TFFacRepNom ;
   private String AV27TFFacRepNom_Sel ;
   private String AV28TFEmprNom ;
   private String AV29TFEmprNom_Sel ;
   private String A396EmprCod ;
   private String AV54Facturacion_tfacdivwwds_2_tfemprcod ;
   private String AV55Facturacion_tfacdivwwds_3_tfemprcod_sel ;
   private String AV60Facturacion_tfacdivwwds_8_tfclinom ;
   private String AV61Facturacion_tfacdivwwds_9_tfclinom_sel ;
   private String AV65Facturacion_tfacdivwwds_13_tffacdivabr ;
   private String AV66Facturacion_tfacdivwwds_14_tffacdivabr_sel ;
   private String AV67Facturacion_tfacdivwwds_15_tffacrepcod ;
   private String AV68Facturacion_tfacdivwwds_16_tffacrepcod_sel ;
   private String AV69Facturacion_tfacdivwwds_17_tffacrepnom ;
   private String AV70Facturacion_tfacdivwwds_18_tffacrepnom_sel ;
   private String AV71Facturacion_tfacdivwwds_19_tfemprnom ;
   private String AV72Facturacion_tfacdivwwds_20_tfemprnom_sel ;
   private String scmdbuf ;
   private String lV54Facturacion_tfacdivwwds_2_tfemprcod ;
   private String lV60Facturacion_tfacdivwwds_8_tfclinom ;
   private String lV65Facturacion_tfacdivwwds_13_tffacdivabr ;
   private String lV67Facturacion_tfacdivwwds_15_tffacrepcod ;
   private String lV69Facturacion_tfacdivwwds_17_tffacrepnom ;
   private String lV71Facturacion_tfacdivwwds_19_tfemprnom ;
   private String A3096FacDivTCod ;
   private String A279CliNom ;
   private String A3116FacDivAbr ;
   private String A3119FacRepCod ;
   private String A3120FacRepNom ;
   private String A407EmprNom ;
   private boolean returnInSub ;
   private boolean brkAVS2 ;
   private boolean n407EmprNom ;
   private boolean n3120FacRepNom ;
   private boolean n3119FacRepCod ;
   private boolean n3116FacDivAbr ;
   private boolean n3115FacDivCod ;
   private boolean n3096FacDivTCod ;
   private boolean brkAVS4 ;
   private boolean brkAVS6 ;
   private boolean brkAVS8 ;
   private boolean brkAVS10 ;
   private boolean brkAVS12 ;
   private String AV45OptionsJson ;
   private String AV46OptionsDescJson ;
   private String AV47OptionIndexesJson ;
   private String AV18TFFacDivTCod_SelsJson ;
   private String AV42DDOName ;
   private String AV43SearchTxt ;
   private String AV44SearchTxtTo ;
   private String AV48FilterFullText ;
   private String AV53Facturacion_tfacdivwwds_1_filterfulltext ;
   private String lV53Facturacion_tfacdivwwds_1_filterfulltext ;
   private String AV31Option ;
   private String AV33OptionDesc ;
   private com.genexus.webpanels.WebSession AV37Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AVS2_A396EmprCod ;
   private String[] P0AVS2_A407EmprNom ;
   private boolean[] P0AVS2_n407EmprNom ;
   private String[] P0AVS2_A3120FacRepNom ;
   private boolean[] P0AVS2_n3120FacRepNom ;
   private String[] P0AVS2_A3119FacRepCod ;
   private boolean[] P0AVS2_n3119FacRepCod ;
   private String[] P0AVS2_A3116FacDivAbr ;
   private boolean[] P0AVS2_n3116FacDivAbr ;
   private byte[] P0AVS2_A3115FacDivCod ;
   private boolean[] P0AVS2_n3115FacDivCod ;
   private String[] P0AVS2_A279CliNom ;
   private int[] P0AVS2_A252CliCod ;
   private int[] P0AVS2_A430FacCod ;
   private String[] P0AVS2_A3096FacDivTCod ;
   private boolean[] P0AVS2_n3096FacDivTCod ;
   private String[] P0AVS3_A279CliNom ;
   private String[] P0AVS3_A407EmprNom ;
   private boolean[] P0AVS3_n407EmprNom ;
   private String[] P0AVS3_A3120FacRepNom ;
   private boolean[] P0AVS3_n3120FacRepNom ;
   private String[] P0AVS3_A3119FacRepCod ;
   private boolean[] P0AVS3_n3119FacRepCod ;
   private String[] P0AVS3_A3116FacDivAbr ;
   private boolean[] P0AVS3_n3116FacDivAbr ;
   private byte[] P0AVS3_A3115FacDivCod ;
   private boolean[] P0AVS3_n3115FacDivCod ;
   private int[] P0AVS3_A252CliCod ;
   private int[] P0AVS3_A430FacCod ;
   private String[] P0AVS3_A396EmprCod ;
   private String[] P0AVS3_A3096FacDivTCod ;
   private boolean[] P0AVS3_n3096FacDivTCod ;
   private String[] P0AVS4_A3116FacDivAbr ;
   private boolean[] P0AVS4_n3116FacDivAbr ;
   private String[] P0AVS4_A407EmprNom ;
   private boolean[] P0AVS4_n407EmprNom ;
   private String[] P0AVS4_A3120FacRepNom ;
   private boolean[] P0AVS4_n3120FacRepNom ;
   private String[] P0AVS4_A3119FacRepCod ;
   private boolean[] P0AVS4_n3119FacRepCod ;
   private byte[] P0AVS4_A3115FacDivCod ;
   private boolean[] P0AVS4_n3115FacDivCod ;
   private String[] P0AVS4_A279CliNom ;
   private int[] P0AVS4_A252CliCod ;
   private int[] P0AVS4_A430FacCod ;
   private String[] P0AVS4_A396EmprCod ;
   private String[] P0AVS4_A3096FacDivTCod ;
   private boolean[] P0AVS4_n3096FacDivTCod ;
   private String[] P0AVS5_A3119FacRepCod ;
   private boolean[] P0AVS5_n3119FacRepCod ;
   private String[] P0AVS5_A407EmprNom ;
   private boolean[] P0AVS5_n407EmprNom ;
   private String[] P0AVS5_A3120FacRepNom ;
   private boolean[] P0AVS5_n3120FacRepNom ;
   private String[] P0AVS5_A3116FacDivAbr ;
   private boolean[] P0AVS5_n3116FacDivAbr ;
   private byte[] P0AVS5_A3115FacDivCod ;
   private boolean[] P0AVS5_n3115FacDivCod ;
   private String[] P0AVS5_A279CliNom ;
   private int[] P0AVS5_A252CliCod ;
   private int[] P0AVS5_A430FacCod ;
   private String[] P0AVS5_A396EmprCod ;
   private String[] P0AVS5_A3096FacDivTCod ;
   private boolean[] P0AVS5_n3096FacDivTCod ;
   private String[] P0AVS6_A3120FacRepNom ;
   private boolean[] P0AVS6_n3120FacRepNom ;
   private String[] P0AVS6_A407EmprNom ;
   private boolean[] P0AVS6_n407EmprNom ;
   private String[] P0AVS6_A3119FacRepCod ;
   private boolean[] P0AVS6_n3119FacRepCod ;
   private String[] P0AVS6_A3116FacDivAbr ;
   private boolean[] P0AVS6_n3116FacDivAbr ;
   private byte[] P0AVS6_A3115FacDivCod ;
   private boolean[] P0AVS6_n3115FacDivCod ;
   private String[] P0AVS6_A279CliNom ;
   private int[] P0AVS6_A252CliCod ;
   private int[] P0AVS6_A430FacCod ;
   private String[] P0AVS6_A396EmprCod ;
   private String[] P0AVS6_A3096FacDivTCod ;
   private boolean[] P0AVS6_n3096FacDivTCod ;
   private String[] P0AVS7_A407EmprNom ;
   private boolean[] P0AVS7_n407EmprNom ;
   private String[] P0AVS7_A3120FacRepNom ;
   private boolean[] P0AVS7_n3120FacRepNom ;
   private String[] P0AVS7_A3119FacRepCod ;
   private boolean[] P0AVS7_n3119FacRepCod ;
   private String[] P0AVS7_A3116FacDivAbr ;
   private boolean[] P0AVS7_n3116FacDivAbr ;
   private byte[] P0AVS7_A3115FacDivCod ;
   private boolean[] P0AVS7_n3115FacDivCod ;
   private String[] P0AVS7_A279CliNom ;
   private int[] P0AVS7_A252CliCod ;
   private int[] P0AVS7_A430FacCod ;
   private String[] P0AVS7_A396EmprCod ;
   private String[] P0AVS7_A3096FacDivTCod ;
   private boolean[] P0AVS7_n3096FacDivTCod ;
   private GXSimpleCollection<String> AV19TFFacDivTCod_Sels ;
   private GXSimpleCollection<String> AV62Facturacion_tfacdivwwds_10_tffacdivtcod_sels ;
   private GXSimpleCollection<String> AV32Options ;
   private GXSimpleCollection<String> AV34OptionsDesc ;
   private GXSimpleCollection<String> AV35OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV39GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV40GridStateFilterValue ;
}

final  class tfacdivwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AVS2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A3096FacDivTCod ,
                                          GXSimpleCollection<String> AV62Facturacion_tfacdivwwds_10_tffacdivtcod_sels ,
                                          String AV55Facturacion_tfacdivwwds_3_tfemprcod_sel ,
                                          String AV54Facturacion_tfacdivwwds_2_tfemprcod ,
                                          int AV56Facturacion_tfacdivwwds_4_tffaccod ,
                                          int AV57Facturacion_tfacdivwwds_5_tffaccod_to ,
                                          int AV58Facturacion_tfacdivwwds_6_tfclicod ,
                                          int AV59Facturacion_tfacdivwwds_7_tfclicod_to ,
                                          String AV61Facturacion_tfacdivwwds_9_tfclinom_sel ,
                                          String AV60Facturacion_tfacdivwwds_8_tfclinom ,
                                          int AV62Facturacion_tfacdivwwds_10_tffacdivtcod_sels_size ,
                                          byte AV63Facturacion_tfacdivwwds_11_tffacdivcod ,
                                          byte AV64Facturacion_tfacdivwwds_12_tffacdivcod_to ,
                                          String AV66Facturacion_tfacdivwwds_14_tffacdivabr_sel ,
                                          String AV65Facturacion_tfacdivwwds_13_tffacdivabr ,
                                          String AV68Facturacion_tfacdivwwds_16_tffacrepcod_sel ,
                                          String AV67Facturacion_tfacdivwwds_15_tffacrepcod ,
                                          String AV70Facturacion_tfacdivwwds_18_tffacrepnom_sel ,
                                          String AV69Facturacion_tfacdivwwds_17_tffacrepnom ,
                                          String AV72Facturacion_tfacdivwwds_20_tfemprnom_sel ,
                                          String AV71Facturacion_tfacdivwwds_19_tfemprnom ,
                                          String A396EmprCod ,
                                          int A430FacCod ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          byte A3115FacDivCod ,
                                          String A3116FacDivAbr ,
                                          String A3119FacRepCod ,
                                          String A3120FacRepNom ,
                                          String A407EmprNom ,
                                          String AV53Facturacion_tfacdivwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[18];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T2.EmprNom, T3.RepNom AS FacRepNom, T1.FacRepCod AS FacRepCod, T4.DivAbr AS FacDivAbr, T1.FacDivCod AS FacDivCod, T5.CliNom, T1.CliCod, T1.FacCod," ;
      scmdbuf += " T1.FacDivTCod FROM ((((TXPCFAVEN T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) LEFT JOIN TXPREPRES T3 ON T3.EmprCod = T1.EmprCod AND T3.RepCod = T1.FacRepCod)" ;
      scmdbuf += " LEFT JOIN TXPDIVISA T4 ON T4.DivCod = T1.FacDivCod) INNER JOIN TXPCLIENT T5 ON T5.EmprCod = T1.EmprCod AND T5.CliCod = T1.CliCod)" ;
      if ( (GXutil.strcmp("", AV55Facturacion_tfacdivwwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV54Facturacion_tfacdivwwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Facturacion_tfacdivwwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( ! (0==AV56Facturacion_tfacdivwwds_4_tffaccod) )
      {
         addWhere(sWhereString, "(T1.FacCod >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV57Facturacion_tfacdivwwds_5_tffaccod_to) )
      {
         addWhere(sWhereString, "(T1.FacCod <= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (0==AV58Facturacion_tfacdivwwds_6_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (0==AV59Facturacion_tfacdivwwds_7_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Facturacion_tfacdivwwds_9_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV60Facturacion_tfacdivwwds_8_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Facturacion_tfacdivwwds_9_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.CliNom = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( AV62Facturacion_tfacdivwwds_10_tffacdivtcod_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV62Facturacion_tfacdivwwds_10_tffacdivtcod_sels, "T1.FacDivTCod IN (", ")")+")");
      }
      if ( ! (0==AV63Facturacion_tfacdivwwds_11_tffacdivcod) )
      {
         addWhere(sWhereString, "(T1.FacDivCod >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (0==AV64Facturacion_tfacdivwwds_12_tffacdivcod_to) )
      {
         addWhere(sWhereString, "(T1.FacDivCod <= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Facturacion_tfacdivwwds_14_tffacdivabr_sel)==0) && ( ! (GXutil.strcmp("", AV65Facturacion_tfacdivwwds_13_tffacdivabr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.DivAbr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Facturacion_tfacdivwwds_14_tffacdivabr_sel)==0) )
      {
         addWhere(sWhereString, "(T4.DivAbr = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Facturacion_tfacdivwwds_16_tffacrepcod_sel)==0) && ( ! (GXutil.strcmp("", AV67Facturacion_tfacdivwwds_15_tffacrepcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FacRepCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Facturacion_tfacdivwwds_16_tffacrepcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FacRepCod = ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Facturacion_tfacdivwwds_18_tffacrepnom_sel)==0) && ( ! (GXutil.strcmp("", AV69Facturacion_tfacdivwwds_17_tffacrepnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.RepNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Facturacion_tfacdivwwds_18_tffacrepnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.RepNom = ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Facturacion_tfacdivwwds_20_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV71Facturacion_tfacdivwwds_19_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Facturacion_tfacdivwwds_20_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.EmprNom = ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P0AVS3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A3096FacDivTCod ,
                                          GXSimpleCollection<String> AV62Facturacion_tfacdivwwds_10_tffacdivtcod_sels ,
                                          String AV55Facturacion_tfacdivwwds_3_tfemprcod_sel ,
                                          String AV54Facturacion_tfacdivwwds_2_tfemprcod ,
                                          int AV56Facturacion_tfacdivwwds_4_tffaccod ,
                                          int AV57Facturacion_tfacdivwwds_5_tffaccod_to ,
                                          int AV58Facturacion_tfacdivwwds_6_tfclicod ,
                                          int AV59Facturacion_tfacdivwwds_7_tfclicod_to ,
                                          String AV61Facturacion_tfacdivwwds_9_tfclinom_sel ,
                                          String AV60Facturacion_tfacdivwwds_8_tfclinom ,
                                          int AV62Facturacion_tfacdivwwds_10_tffacdivtcod_sels_size ,
                                          byte AV63Facturacion_tfacdivwwds_11_tffacdivcod ,
                                          byte AV64Facturacion_tfacdivwwds_12_tffacdivcod_to ,
                                          String AV66Facturacion_tfacdivwwds_14_tffacdivabr_sel ,
                                          String AV65Facturacion_tfacdivwwds_13_tffacdivabr ,
                                          String AV68Facturacion_tfacdivwwds_16_tffacrepcod_sel ,
                                          String AV67Facturacion_tfacdivwwds_15_tffacrepcod ,
                                          String AV70Facturacion_tfacdivwwds_18_tffacrepnom_sel ,
                                          String AV69Facturacion_tfacdivwwds_17_tffacrepnom ,
                                          String AV72Facturacion_tfacdivwwds_20_tfemprnom_sel ,
                                          String AV71Facturacion_tfacdivwwds_19_tfemprnom ,
                                          String A396EmprCod ,
                                          int A430FacCod ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          byte A3115FacDivCod ,
                                          String A3116FacDivAbr ,
                                          String A3119FacRepCod ,
                                          String A3120FacRepNom ,
                                          String A407EmprNom ,
                                          String AV53Facturacion_tfacdivwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[18];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT T5.CliNom, T3.EmprNom, T4.RepNom AS FacRepNom, T1.FacRepCod AS FacRepCod, T2.DivAbr AS FacDivAbr, T1.FacDivCod AS FacDivCod, T1.CliCod, T1.FacCod, T1.EmprCod," ;
      scmdbuf += " T1.FacDivTCod FROM ((((TXPCFAVEN T1 LEFT JOIN TXPDIVISA T2 ON T2.DivCod = T1.FacDivCod) INNER JOIN TXPEMPRES T3 ON T3.EmprCod = T1.EmprCod) LEFT JOIN TXPREPRES" ;
      scmdbuf += " T4 ON T4.EmprCod = T1.EmprCod AND T4.RepCod = T1.FacRepCod) INNER JOIN TXPCLIENT T5 ON T5.EmprCod = T1.EmprCod AND T5.CliCod = T1.CliCod)" ;
      if ( (GXutil.strcmp("", AV55Facturacion_tfacdivwwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV54Facturacion_tfacdivwwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Facturacion_tfacdivwwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int5[1] = (byte)(1) ;
      }
      if ( ! (0==AV56Facturacion_tfacdivwwds_4_tffaccod) )
      {
         addWhere(sWhereString, "(T1.FacCod >= ?)");
      }
      else
      {
         GXv_int5[2] = (byte)(1) ;
      }
      if ( ! (0==AV57Facturacion_tfacdivwwds_5_tffaccod_to) )
      {
         addWhere(sWhereString, "(T1.FacCod <= ?)");
      }
      else
      {
         GXv_int5[3] = (byte)(1) ;
      }
      if ( ! (0==AV58Facturacion_tfacdivwwds_6_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int5[4] = (byte)(1) ;
      }
      if ( ! (0==AV59Facturacion_tfacdivwwds_7_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int5[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Facturacion_tfacdivwwds_9_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV60Facturacion_tfacdivwwds_8_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Facturacion_tfacdivwwds_9_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.CliNom = ?)");
      }
      else
      {
         GXv_int5[7] = (byte)(1) ;
      }
      if ( AV62Facturacion_tfacdivwwds_10_tffacdivtcod_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV62Facturacion_tfacdivwwds_10_tffacdivtcod_sels, "T1.FacDivTCod IN (", ")")+")");
      }
      if ( ! (0==AV63Facturacion_tfacdivwwds_11_tffacdivcod) )
      {
         addWhere(sWhereString, "(T1.FacDivCod >= ?)");
      }
      else
      {
         GXv_int5[8] = (byte)(1) ;
      }
      if ( ! (0==AV64Facturacion_tfacdivwwds_12_tffacdivcod_to) )
      {
         addWhere(sWhereString, "(T1.FacDivCod <= ?)");
      }
      else
      {
         GXv_int5[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Facturacion_tfacdivwwds_14_tffacdivabr_sel)==0) && ( ! (GXutil.strcmp("", AV65Facturacion_tfacdivwwds_13_tffacdivabr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.DivAbr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Facturacion_tfacdivwwds_14_tffacdivabr_sel)==0) )
      {
         addWhere(sWhereString, "(T2.DivAbr = ?)");
      }
      else
      {
         GXv_int5[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Facturacion_tfacdivwwds_16_tffacrepcod_sel)==0) && ( ! (GXutil.strcmp("", AV67Facturacion_tfacdivwwds_15_tffacrepcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FacRepCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Facturacion_tfacdivwwds_16_tffacrepcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FacRepCod = ?)");
      }
      else
      {
         GXv_int5[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Facturacion_tfacdivwwds_18_tffacrepnom_sel)==0) && ( ! (GXutil.strcmp("", AV69Facturacion_tfacdivwwds_17_tffacrepnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.RepNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Facturacion_tfacdivwwds_18_tffacrepnom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.RepNom = ?)");
      }
      else
      {
         GXv_int5[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Facturacion_tfacdivwwds_20_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV71Facturacion_tfacdivwwds_19_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Facturacion_tfacdivwwds_20_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.EmprNom = ?)");
      }
      else
      {
         GXv_int5[17] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T5.CliNom" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   protected Object[] conditional_P0AVS4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A3096FacDivTCod ,
                                          GXSimpleCollection<String> AV62Facturacion_tfacdivwwds_10_tffacdivtcod_sels ,
                                          String AV55Facturacion_tfacdivwwds_3_tfemprcod_sel ,
                                          String AV54Facturacion_tfacdivwwds_2_tfemprcod ,
                                          int AV56Facturacion_tfacdivwwds_4_tffaccod ,
                                          int AV57Facturacion_tfacdivwwds_5_tffaccod_to ,
                                          int AV58Facturacion_tfacdivwwds_6_tfclicod ,
                                          int AV59Facturacion_tfacdivwwds_7_tfclicod_to ,
                                          String AV61Facturacion_tfacdivwwds_9_tfclinom_sel ,
                                          String AV60Facturacion_tfacdivwwds_8_tfclinom ,
                                          int AV62Facturacion_tfacdivwwds_10_tffacdivtcod_sels_size ,
                                          byte AV63Facturacion_tfacdivwwds_11_tffacdivcod ,
                                          byte AV64Facturacion_tfacdivwwds_12_tffacdivcod_to ,
                                          String AV66Facturacion_tfacdivwwds_14_tffacdivabr_sel ,
                                          String AV65Facturacion_tfacdivwwds_13_tffacdivabr ,
                                          String AV68Facturacion_tfacdivwwds_16_tffacrepcod_sel ,
                                          String AV67Facturacion_tfacdivwwds_15_tffacrepcod ,
                                          String AV70Facturacion_tfacdivwwds_18_tffacrepnom_sel ,
                                          String AV69Facturacion_tfacdivwwds_17_tffacrepnom ,
                                          String AV72Facturacion_tfacdivwwds_20_tfemprnom_sel ,
                                          String AV71Facturacion_tfacdivwwds_19_tfemprnom ,
                                          String A396EmprCod ,
                                          int A430FacCod ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          byte A3115FacDivCod ,
                                          String A3116FacDivAbr ,
                                          String A3119FacRepCod ,
                                          String A3120FacRepNom ,
                                          String A407EmprNom ,
                                          String AV53Facturacion_tfacdivwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[18];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T2.DivAbr AS FacDivAbr, T3.EmprNom, T4.RepNom AS FacRepNom, T1.FacRepCod AS FacRepCod, T1.FacDivCod AS FacDivCod, T5.CliNom, T1.CliCod, T1.FacCod, T1.EmprCod," ;
      scmdbuf += " T1.FacDivTCod FROM ((((TXPCFAVEN T1 LEFT JOIN TXPDIVISA T2 ON T2.DivCod = T1.FacDivCod) INNER JOIN TXPEMPRES T3 ON T3.EmprCod = T1.EmprCod) LEFT JOIN TXPREPRES" ;
      scmdbuf += " T4 ON T4.EmprCod = T1.EmprCod AND T4.RepCod = T1.FacRepCod) INNER JOIN TXPCLIENT T5 ON T5.EmprCod = T1.EmprCod AND T5.CliCod = T1.CliCod)" ;
      if ( (GXutil.strcmp("", AV55Facturacion_tfacdivwwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV54Facturacion_tfacdivwwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Facturacion_tfacdivwwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int8[1] = (byte)(1) ;
      }
      if ( ! (0==AV56Facturacion_tfacdivwwds_4_tffaccod) )
      {
         addWhere(sWhereString, "(T1.FacCod >= ?)");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( ! (0==AV57Facturacion_tfacdivwwds_5_tffaccod_to) )
      {
         addWhere(sWhereString, "(T1.FacCod <= ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( ! (0==AV58Facturacion_tfacdivwwds_6_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! (0==AV59Facturacion_tfacdivwwds_7_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Facturacion_tfacdivwwds_9_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV60Facturacion_tfacdivwwds_8_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Facturacion_tfacdivwwds_9_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.CliNom = ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( AV62Facturacion_tfacdivwwds_10_tffacdivtcod_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV62Facturacion_tfacdivwwds_10_tffacdivtcod_sels, "T1.FacDivTCod IN (", ")")+")");
      }
      if ( ! (0==AV63Facturacion_tfacdivwwds_11_tffacdivcod) )
      {
         addWhere(sWhereString, "(T1.FacDivCod >= ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (0==AV64Facturacion_tfacdivwwds_12_tffacdivcod_to) )
      {
         addWhere(sWhereString, "(T1.FacDivCod <= ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Facturacion_tfacdivwwds_14_tffacdivabr_sel)==0) && ( ! (GXutil.strcmp("", AV65Facturacion_tfacdivwwds_13_tffacdivabr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.DivAbr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Facturacion_tfacdivwwds_14_tffacdivabr_sel)==0) )
      {
         addWhere(sWhereString, "(T2.DivAbr = ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Facturacion_tfacdivwwds_16_tffacrepcod_sel)==0) && ( ! (GXutil.strcmp("", AV67Facturacion_tfacdivwwds_15_tffacrepcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FacRepCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Facturacion_tfacdivwwds_16_tffacrepcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FacRepCod = ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Facturacion_tfacdivwwds_18_tffacrepnom_sel)==0) && ( ! (GXutil.strcmp("", AV69Facturacion_tfacdivwwds_17_tffacrepnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.RepNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Facturacion_tfacdivwwds_18_tffacrepnom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.RepNom = ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Facturacion_tfacdivwwds_20_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV71Facturacion_tfacdivwwds_19_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Facturacion_tfacdivwwds_20_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.EmprNom = ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.DivAbr" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P0AVS5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A3096FacDivTCod ,
                                          GXSimpleCollection<String> AV62Facturacion_tfacdivwwds_10_tffacdivtcod_sels ,
                                          String AV55Facturacion_tfacdivwwds_3_tfemprcod_sel ,
                                          String AV54Facturacion_tfacdivwwds_2_tfemprcod ,
                                          int AV56Facturacion_tfacdivwwds_4_tffaccod ,
                                          int AV57Facturacion_tfacdivwwds_5_tffaccod_to ,
                                          int AV58Facturacion_tfacdivwwds_6_tfclicod ,
                                          int AV59Facturacion_tfacdivwwds_7_tfclicod_to ,
                                          String AV61Facturacion_tfacdivwwds_9_tfclinom_sel ,
                                          String AV60Facturacion_tfacdivwwds_8_tfclinom ,
                                          int AV62Facturacion_tfacdivwwds_10_tffacdivtcod_sels_size ,
                                          byte AV63Facturacion_tfacdivwwds_11_tffacdivcod ,
                                          byte AV64Facturacion_tfacdivwwds_12_tffacdivcod_to ,
                                          String AV66Facturacion_tfacdivwwds_14_tffacdivabr_sel ,
                                          String AV65Facturacion_tfacdivwwds_13_tffacdivabr ,
                                          String AV68Facturacion_tfacdivwwds_16_tffacrepcod_sel ,
                                          String AV67Facturacion_tfacdivwwds_15_tffacrepcod ,
                                          String AV70Facturacion_tfacdivwwds_18_tffacrepnom_sel ,
                                          String AV69Facturacion_tfacdivwwds_17_tffacrepnom ,
                                          String AV72Facturacion_tfacdivwwds_20_tfemprnom_sel ,
                                          String AV71Facturacion_tfacdivwwds_19_tfemprnom ,
                                          String A396EmprCod ,
                                          int A430FacCod ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          byte A3115FacDivCod ,
                                          String A3116FacDivAbr ,
                                          String A3119FacRepCod ,
                                          String A3120FacRepNom ,
                                          String A407EmprNom ,
                                          String AV53Facturacion_tfacdivwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int11 = new byte[18];
      Object[] GXv_Object12 = new Object[2];
      scmdbuf = "SELECT T1.FacRepCod AS FacRepCod, T3.EmprNom, T4.RepNom AS FacRepNom, T2.DivAbr AS FacDivAbr, T1.FacDivCod AS FacDivCod, T5.CliNom, T1.CliCod, T1.FacCod, T1.EmprCod," ;
      scmdbuf += " T1.FacDivTCod FROM ((((TXPCFAVEN T1 LEFT JOIN TXPDIVISA T2 ON T2.DivCod = T1.FacDivCod) INNER JOIN TXPEMPRES T3 ON T3.EmprCod = T1.EmprCod) LEFT JOIN TXPREPRES" ;
      scmdbuf += " T4 ON T4.EmprCod = T1.EmprCod AND T4.RepCod = T1.FacRepCod) INNER JOIN TXPCLIENT T5 ON T5.EmprCod = T1.EmprCod AND T5.CliCod = T1.CliCod)" ;
      if ( (GXutil.strcmp("", AV55Facturacion_tfacdivwwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV54Facturacion_tfacdivwwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Facturacion_tfacdivwwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int11[1] = (byte)(1) ;
      }
      if ( ! (0==AV56Facturacion_tfacdivwwds_4_tffaccod) )
      {
         addWhere(sWhereString, "(T1.FacCod >= ?)");
      }
      else
      {
         GXv_int11[2] = (byte)(1) ;
      }
      if ( ! (0==AV57Facturacion_tfacdivwwds_5_tffaccod_to) )
      {
         addWhere(sWhereString, "(T1.FacCod <= ?)");
      }
      else
      {
         GXv_int11[3] = (byte)(1) ;
      }
      if ( ! (0==AV58Facturacion_tfacdivwwds_6_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int11[4] = (byte)(1) ;
      }
      if ( ! (0==AV59Facturacion_tfacdivwwds_7_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int11[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Facturacion_tfacdivwwds_9_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV60Facturacion_tfacdivwwds_8_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Facturacion_tfacdivwwds_9_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.CliNom = ?)");
      }
      else
      {
         GXv_int11[7] = (byte)(1) ;
      }
      if ( AV62Facturacion_tfacdivwwds_10_tffacdivtcod_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV62Facturacion_tfacdivwwds_10_tffacdivtcod_sels, "T1.FacDivTCod IN (", ")")+")");
      }
      if ( ! (0==AV63Facturacion_tfacdivwwds_11_tffacdivcod) )
      {
         addWhere(sWhereString, "(T1.FacDivCod >= ?)");
      }
      else
      {
         GXv_int11[8] = (byte)(1) ;
      }
      if ( ! (0==AV64Facturacion_tfacdivwwds_12_tffacdivcod_to) )
      {
         addWhere(sWhereString, "(T1.FacDivCod <= ?)");
      }
      else
      {
         GXv_int11[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Facturacion_tfacdivwwds_14_tffacdivabr_sel)==0) && ( ! (GXutil.strcmp("", AV65Facturacion_tfacdivwwds_13_tffacdivabr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.DivAbr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Facturacion_tfacdivwwds_14_tffacdivabr_sel)==0) )
      {
         addWhere(sWhereString, "(T2.DivAbr = ?)");
      }
      else
      {
         GXv_int11[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Facturacion_tfacdivwwds_16_tffacrepcod_sel)==0) && ( ! (GXutil.strcmp("", AV67Facturacion_tfacdivwwds_15_tffacrepcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FacRepCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Facturacion_tfacdivwwds_16_tffacrepcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FacRepCod = ?)");
      }
      else
      {
         GXv_int11[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Facturacion_tfacdivwwds_18_tffacrepnom_sel)==0) && ( ! (GXutil.strcmp("", AV69Facturacion_tfacdivwwds_17_tffacrepnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.RepNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Facturacion_tfacdivwwds_18_tffacrepnom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.RepNom = ?)");
      }
      else
      {
         GXv_int11[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Facturacion_tfacdivwwds_20_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV71Facturacion_tfacdivwwds_19_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Facturacion_tfacdivwwds_20_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.EmprNom = ?)");
      }
      else
      {
         GXv_int11[17] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.FacRepCod" ;
      GXv_Object12[0] = scmdbuf ;
      GXv_Object12[1] = GXv_int11 ;
      return GXv_Object12 ;
   }

   protected Object[] conditional_P0AVS6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A3096FacDivTCod ,
                                          GXSimpleCollection<String> AV62Facturacion_tfacdivwwds_10_tffacdivtcod_sels ,
                                          String AV55Facturacion_tfacdivwwds_3_tfemprcod_sel ,
                                          String AV54Facturacion_tfacdivwwds_2_tfemprcod ,
                                          int AV56Facturacion_tfacdivwwds_4_tffaccod ,
                                          int AV57Facturacion_tfacdivwwds_5_tffaccod_to ,
                                          int AV58Facturacion_tfacdivwwds_6_tfclicod ,
                                          int AV59Facturacion_tfacdivwwds_7_tfclicod_to ,
                                          String AV61Facturacion_tfacdivwwds_9_tfclinom_sel ,
                                          String AV60Facturacion_tfacdivwwds_8_tfclinom ,
                                          int AV62Facturacion_tfacdivwwds_10_tffacdivtcod_sels_size ,
                                          byte AV63Facturacion_tfacdivwwds_11_tffacdivcod ,
                                          byte AV64Facturacion_tfacdivwwds_12_tffacdivcod_to ,
                                          String AV66Facturacion_tfacdivwwds_14_tffacdivabr_sel ,
                                          String AV65Facturacion_tfacdivwwds_13_tffacdivabr ,
                                          String AV68Facturacion_tfacdivwwds_16_tffacrepcod_sel ,
                                          String AV67Facturacion_tfacdivwwds_15_tffacrepcod ,
                                          String AV70Facturacion_tfacdivwwds_18_tffacrepnom_sel ,
                                          String AV69Facturacion_tfacdivwwds_17_tffacrepnom ,
                                          String AV72Facturacion_tfacdivwwds_20_tfemprnom_sel ,
                                          String AV71Facturacion_tfacdivwwds_19_tfemprnom ,
                                          String A396EmprCod ,
                                          int A430FacCod ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          byte A3115FacDivCod ,
                                          String A3116FacDivAbr ,
                                          String A3119FacRepCod ,
                                          String A3120FacRepNom ,
                                          String A407EmprNom ,
                                          String AV53Facturacion_tfacdivwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[18];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT T4.RepNom AS FacRepNom, T3.EmprNom, T1.FacRepCod AS FacRepCod, T2.DivAbr AS FacDivAbr, T1.FacDivCod AS FacDivCod, T5.CliNom, T1.CliCod, T1.FacCod, T1.EmprCod," ;
      scmdbuf += " T1.FacDivTCod FROM ((((TXPCFAVEN T1 LEFT JOIN TXPDIVISA T2 ON T2.DivCod = T1.FacDivCod) INNER JOIN TXPEMPRES T3 ON T3.EmprCod = T1.EmprCod) LEFT JOIN TXPREPRES" ;
      scmdbuf += " T4 ON T4.EmprCod = T1.EmprCod AND T4.RepCod = T1.FacRepCod) INNER JOIN TXPCLIENT T5 ON T5.EmprCod = T1.EmprCod AND T5.CliCod = T1.CliCod)" ;
      if ( (GXutil.strcmp("", AV55Facturacion_tfacdivwwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV54Facturacion_tfacdivwwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Facturacion_tfacdivwwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int14[1] = (byte)(1) ;
      }
      if ( ! (0==AV56Facturacion_tfacdivwwds_4_tffaccod) )
      {
         addWhere(sWhereString, "(T1.FacCod >= ?)");
      }
      else
      {
         GXv_int14[2] = (byte)(1) ;
      }
      if ( ! (0==AV57Facturacion_tfacdivwwds_5_tffaccod_to) )
      {
         addWhere(sWhereString, "(T1.FacCod <= ?)");
      }
      else
      {
         GXv_int14[3] = (byte)(1) ;
      }
      if ( ! (0==AV58Facturacion_tfacdivwwds_6_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int14[4] = (byte)(1) ;
      }
      if ( ! (0==AV59Facturacion_tfacdivwwds_7_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int14[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Facturacion_tfacdivwwds_9_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV60Facturacion_tfacdivwwds_8_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Facturacion_tfacdivwwds_9_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.CliNom = ?)");
      }
      else
      {
         GXv_int14[7] = (byte)(1) ;
      }
      if ( AV62Facturacion_tfacdivwwds_10_tffacdivtcod_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV62Facturacion_tfacdivwwds_10_tffacdivtcod_sels, "T1.FacDivTCod IN (", ")")+")");
      }
      if ( ! (0==AV63Facturacion_tfacdivwwds_11_tffacdivcod) )
      {
         addWhere(sWhereString, "(T1.FacDivCod >= ?)");
      }
      else
      {
         GXv_int14[8] = (byte)(1) ;
      }
      if ( ! (0==AV64Facturacion_tfacdivwwds_12_tffacdivcod_to) )
      {
         addWhere(sWhereString, "(T1.FacDivCod <= ?)");
      }
      else
      {
         GXv_int14[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Facturacion_tfacdivwwds_14_tffacdivabr_sel)==0) && ( ! (GXutil.strcmp("", AV65Facturacion_tfacdivwwds_13_tffacdivabr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.DivAbr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Facturacion_tfacdivwwds_14_tffacdivabr_sel)==0) )
      {
         addWhere(sWhereString, "(T2.DivAbr = ?)");
      }
      else
      {
         GXv_int14[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Facturacion_tfacdivwwds_16_tffacrepcod_sel)==0) && ( ! (GXutil.strcmp("", AV67Facturacion_tfacdivwwds_15_tffacrepcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FacRepCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Facturacion_tfacdivwwds_16_tffacrepcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FacRepCod = ?)");
      }
      else
      {
         GXv_int14[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Facturacion_tfacdivwwds_18_tffacrepnom_sel)==0) && ( ! (GXutil.strcmp("", AV69Facturacion_tfacdivwwds_17_tffacrepnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.RepNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Facturacion_tfacdivwwds_18_tffacrepnom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.RepNom = ?)");
      }
      else
      {
         GXv_int14[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Facturacion_tfacdivwwds_20_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV71Facturacion_tfacdivwwds_19_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Facturacion_tfacdivwwds_20_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.EmprNom = ?)");
      }
      else
      {
         GXv_int14[17] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T4.RepNom" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
   }

   protected Object[] conditional_P0AVS7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A3096FacDivTCod ,
                                          GXSimpleCollection<String> AV62Facturacion_tfacdivwwds_10_tffacdivtcod_sels ,
                                          String AV55Facturacion_tfacdivwwds_3_tfemprcod_sel ,
                                          String AV54Facturacion_tfacdivwwds_2_tfemprcod ,
                                          int AV56Facturacion_tfacdivwwds_4_tffaccod ,
                                          int AV57Facturacion_tfacdivwwds_5_tffaccod_to ,
                                          int AV58Facturacion_tfacdivwwds_6_tfclicod ,
                                          int AV59Facturacion_tfacdivwwds_7_tfclicod_to ,
                                          String AV61Facturacion_tfacdivwwds_9_tfclinom_sel ,
                                          String AV60Facturacion_tfacdivwwds_8_tfclinom ,
                                          int AV62Facturacion_tfacdivwwds_10_tffacdivtcod_sels_size ,
                                          byte AV63Facturacion_tfacdivwwds_11_tffacdivcod ,
                                          byte AV64Facturacion_tfacdivwwds_12_tffacdivcod_to ,
                                          String AV66Facturacion_tfacdivwwds_14_tffacdivabr_sel ,
                                          String AV65Facturacion_tfacdivwwds_13_tffacdivabr ,
                                          String AV68Facturacion_tfacdivwwds_16_tffacrepcod_sel ,
                                          String AV67Facturacion_tfacdivwwds_15_tffacrepcod ,
                                          String AV70Facturacion_tfacdivwwds_18_tffacrepnom_sel ,
                                          String AV69Facturacion_tfacdivwwds_17_tffacrepnom ,
                                          String AV72Facturacion_tfacdivwwds_20_tfemprnom_sel ,
                                          String AV71Facturacion_tfacdivwwds_19_tfemprnom ,
                                          String A396EmprCod ,
                                          int A430FacCod ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          byte A3115FacDivCod ,
                                          String A3116FacDivAbr ,
                                          String A3119FacRepCod ,
                                          String A3120FacRepNom ,
                                          String A407EmprNom ,
                                          String AV53Facturacion_tfacdivwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int17 = new byte[18];
      Object[] GXv_Object18 = new Object[2];
      scmdbuf = "SELECT T3.EmprNom, T4.RepNom AS FacRepNom, T1.FacRepCod AS FacRepCod, T2.DivAbr AS FacDivAbr, T1.FacDivCod AS FacDivCod, T5.CliNom, T1.CliCod, T1.FacCod, T1.EmprCod," ;
      scmdbuf += " T1.FacDivTCod FROM ((((TXPCFAVEN T1 LEFT JOIN TXPDIVISA T2 ON T2.DivCod = T1.FacDivCod) INNER JOIN TXPEMPRES T3 ON T3.EmprCod = T1.EmprCod) LEFT JOIN TXPREPRES" ;
      scmdbuf += " T4 ON T4.EmprCod = T1.EmprCod AND T4.RepCod = T1.FacRepCod) INNER JOIN TXPCLIENT T5 ON T5.EmprCod = T1.EmprCod AND T5.CliCod = T1.CliCod)" ;
      if ( (GXutil.strcmp("", AV55Facturacion_tfacdivwwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV54Facturacion_tfacdivwwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Facturacion_tfacdivwwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int17[1] = (byte)(1) ;
      }
      if ( ! (0==AV56Facturacion_tfacdivwwds_4_tffaccod) )
      {
         addWhere(sWhereString, "(T1.FacCod >= ?)");
      }
      else
      {
         GXv_int17[2] = (byte)(1) ;
      }
      if ( ! (0==AV57Facturacion_tfacdivwwds_5_tffaccod_to) )
      {
         addWhere(sWhereString, "(T1.FacCod <= ?)");
      }
      else
      {
         GXv_int17[3] = (byte)(1) ;
      }
      if ( ! (0==AV58Facturacion_tfacdivwwds_6_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int17[4] = (byte)(1) ;
      }
      if ( ! (0==AV59Facturacion_tfacdivwwds_7_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int17[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Facturacion_tfacdivwwds_9_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV60Facturacion_tfacdivwwds_8_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Facturacion_tfacdivwwds_9_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.CliNom = ?)");
      }
      else
      {
         GXv_int17[7] = (byte)(1) ;
      }
      if ( AV62Facturacion_tfacdivwwds_10_tffacdivtcod_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV62Facturacion_tfacdivwwds_10_tffacdivtcod_sels, "T1.FacDivTCod IN (", ")")+")");
      }
      if ( ! (0==AV63Facturacion_tfacdivwwds_11_tffacdivcod) )
      {
         addWhere(sWhereString, "(T1.FacDivCod >= ?)");
      }
      else
      {
         GXv_int17[8] = (byte)(1) ;
      }
      if ( ! (0==AV64Facturacion_tfacdivwwds_12_tffacdivcod_to) )
      {
         addWhere(sWhereString, "(T1.FacDivCod <= ?)");
      }
      else
      {
         GXv_int17[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Facturacion_tfacdivwwds_14_tffacdivabr_sel)==0) && ( ! (GXutil.strcmp("", AV65Facturacion_tfacdivwwds_13_tffacdivabr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.DivAbr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Facturacion_tfacdivwwds_14_tffacdivabr_sel)==0) )
      {
         addWhere(sWhereString, "(T2.DivAbr = ?)");
      }
      else
      {
         GXv_int17[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Facturacion_tfacdivwwds_16_tffacrepcod_sel)==0) && ( ! (GXutil.strcmp("", AV67Facturacion_tfacdivwwds_15_tffacrepcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FacRepCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Facturacion_tfacdivwwds_16_tffacrepcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FacRepCod = ?)");
      }
      else
      {
         GXv_int17[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Facturacion_tfacdivwwds_18_tffacrepnom_sel)==0) && ( ! (GXutil.strcmp("", AV69Facturacion_tfacdivwwds_17_tffacrepnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.RepNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Facturacion_tfacdivwwds_18_tffacrepnom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.RepNom = ?)");
      }
      else
      {
         GXv_int17[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Facturacion_tfacdivwwds_20_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV71Facturacion_tfacdivwwds_19_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Facturacion_tfacdivwwds_20_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.EmprNom = ?)");
      }
      else
      {
         GXv_int17[17] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T3.EmprNom" ;
      GXv_Object18[0] = scmdbuf ;
      GXv_Object18[1] = GXv_int17 ;
      return GXv_Object18 ;
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
                  return conditional_P0AVS2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , ((Number) dynConstraints[25]).byteValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] );
            case 1 :
                  return conditional_P0AVS3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , ((Number) dynConstraints[25]).byteValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] );
            case 2 :
                  return conditional_P0AVS4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , ((Number) dynConstraints[25]).byteValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] );
            case 3 :
                  return conditional_P0AVS5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , ((Number) dynConstraints[25]).byteValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] );
            case 4 :
                  return conditional_P0AVS6(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , ((Number) dynConstraints[25]).byteValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] );
            case 5 :
                  return conditional_P0AVS7(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , ((Number) dynConstraints[25]).byteValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AVS2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AVS3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AVS4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AVS5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AVS6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AVS7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 34);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 30);
               ((int[]) buf[12])[0] = rslt.getInt(8);
               ((int[]) buf[13])[0] = rslt.getInt(9);
               ((String[]) buf[14])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 34);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(7);
               ((int[]) buf[12])[0] = rslt.getInt(8);
               ((String[]) buf[13])[0] = rslt.getString(9, 3);
               ((String[]) buf[14])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 34);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 30);
               ((int[]) buf[11])[0] = rslt.getInt(7);
               ((int[]) buf[12])[0] = rslt.getInt(8);
               ((String[]) buf[13])[0] = rslt.getString(9, 3);
               ((String[]) buf[14])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 34);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 30);
               ((int[]) buf[11])[0] = rslt.getInt(7);
               ((int[]) buf[12])[0] = rslt.getInt(8);
               ((String[]) buf[13])[0] = rslt.getString(9, 3);
               ((String[]) buf[14])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 34);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 6);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 30);
               ((int[]) buf[11])[0] = rslt.getInt(7);
               ((int[]) buf[12])[0] = rslt.getInt(8);
               ((String[]) buf[13])[0] = rslt.getString(9, 3);
               ((String[]) buf[14])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 34);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 6);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 30);
               ((int[]) buf[11])[0] = rslt.getInt(7);
               ((int[]) buf[12])[0] = rslt.getInt(8);
               ((String[]) buf[13])[0] = rslt.getString(9, 3);
               ((String[]) buf[14])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[18], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 3);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[26]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[27]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 6);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 6);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 34);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 34);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 3);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[26]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[27]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 6);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 6);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 34);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 34);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 3);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[26]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[27]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 6);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 6);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 34);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 34);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 3);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[26]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[27]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 6);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 6);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 34);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 34);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 3);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[26]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[27]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 6);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 6);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 34);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 34);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 3);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[26]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[27]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 6);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 6);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 34);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 34);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               return;
      }
   }

}

