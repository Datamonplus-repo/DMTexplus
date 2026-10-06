package app.mantenimientomaquina ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tmmovstwwgetfilterdata extends GXProcedure
{
   public tmmovstwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmmovstwwgetfilterdata.class ), "" );
   }

   public tmmovstwwgetfilterdata( int remoteHandle ,
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
      tmmovstwwgetfilterdata.this.aP5 = new String[] {""};
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
      tmmovstwwgetfilterdata.this.AV38DDOName = aP0;
      tmmovstwwgetfilterdata.this.AV36SearchTxt = aP1;
      tmmovstwwgetfilterdata.this.AV37SearchTxtTo = aP2;
      tmmovstwwgetfilterdata.this.aP3 = aP3;
      tmmovstwwgetfilterdata.this.aP4 = aP4;
      tmmovstwwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV41Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV44OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV46OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_MMSPRVNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADMMSPRVNOMOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_MMSNROEXT") == 0 )
      {
         /* Execute user subroutine: 'LOADMMSNROEXTOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_MMSUSUCRE") == 0 )
      {
         /* Execute user subroutine: 'LOADMMSUSUCREOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV42OptionsJson = AV41Options.toJSonString(false) ;
      AV45OptionsDescJson = AV44OptionsDesc.toJSonString(false) ;
      AV47OptionIndexesJson = AV46OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV49Session.getValue("MantenimientoMaquina.TMMovStWWGridState"), "") == 0 )
      {
         AV51GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "MantenimientoMaquina.TMMovStWWGridState"), null, null);
      }
      else
      {
         AV51GridState.fromxml(AV49Session.getValue("MantenimientoMaquina.TMMovStWWGridState"), null, null);
      }
      AV71GXV1 = 1 ;
      while ( AV71GXV1 <= AV51GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV52GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV51GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV71GXV1));
         if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV68FilterFullText = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSCOD") == 0 )
         {
            AV14TFMMSCod = (int)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV15TFMMSCod_To = (int)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSTPO_SEL") == 0 )
         {
            AV16TFMMSTpo_SelsJson = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV17TFMMSTpo_Sels.fromJSonString(AV16TFMMSTpo_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSFCH") == 0 )
         {
            AV22TFMMSFch = localUtil.ctod( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSPRVNOM") == 0 )
         {
            AV20TFMMSPrvNom = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSPRVNOM_SEL") == 0 )
         {
            AV21TFMMSPrvNom_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSPRVNUM") == 0 )
         {
            AV18TFMMSPrvNum = (int)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV19TFMMSPrvNum_To = (int)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSDTO") == 0 )
         {
            AV34TFMMSDto = CommonUtil.decimalVal( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV35TFMMSDto_To = CommonUtil.decimalVal( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSNROEXT") == 0 )
         {
            AV30TFMMSNroExt = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSNROEXT_SEL") == 0 )
         {
            AV31TFMMSNroExt_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSUSUCRE") == 0 )
         {
            AV24TFMMSUsuCre = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSUSUCRE_SEL") == 0 )
         {
            AV25TFMMSUsuCre_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSFCHCRE") == 0 )
         {
            AV26TFMMSFchCre = localUtil.ctot( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSFCHAPL") == 0 )
         {
            AV28TFMMSFchApl = localUtil.ctot( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSEST_SEL") == 0 )
         {
            AV32TFMMSEst_SelsJson = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV33TFMMSEst_Sels.fromJSonString(AV32TFMMSEst_SelsJson, null);
         }
         AV71GXV1 = (int)(AV71GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADMMSPRVNOMOPTIONS' Routine */
      returnInSub = false ;
      AV20TFMMSPrvNom = AV36SearchTxt ;
      AV21TFMMSPrvNom_Sel = "" ;
      AV73Mantenimientomaquina_tmmovstwwds_1_filterfulltext = AV68FilterFullText ;
      AV74Mantenimientomaquina_tmmovstwwds_2_tfmmscod = AV14TFMMSCod ;
      AV75Mantenimientomaquina_tmmovstwwds_3_tfmmscod_to = AV15TFMMSCod_To ;
      AV76Mantenimientomaquina_tmmovstwwds_4_tfmmstpo_sels = AV17TFMMSTpo_Sels ;
      AV77Mantenimientomaquina_tmmovstwwds_5_tfmmsfch = AV22TFMMSFch ;
      AV78Mantenimientomaquina_tmmovstwwds_6_tfmmsprvnom = AV20TFMMSPrvNom ;
      AV79Mantenimientomaquina_tmmovstwwds_7_tfmmsprvnom_sel = AV21TFMMSPrvNom_Sel ;
      AV80Mantenimientomaquina_tmmovstwwds_8_tfmmsprvnum = AV18TFMMSPrvNum ;
      AV81Mantenimientomaquina_tmmovstwwds_9_tfmmsprvnum_to = AV19TFMMSPrvNum_To ;
      AV82Mantenimientomaquina_tmmovstwwds_10_tfmmsdto = AV34TFMMSDto ;
      AV83Mantenimientomaquina_tmmovstwwds_11_tfmmsdto_to = AV35TFMMSDto_To ;
      AV84Mantenimientomaquina_tmmovstwwds_12_tfmmsnroext = AV30TFMMSNroExt ;
      AV85Mantenimientomaquina_tmmovstwwds_13_tfmmsnroext_sel = AV31TFMMSNroExt_Sel ;
      AV86Mantenimientomaquina_tmmovstwwds_14_tfmmsusucre = AV24TFMMSUsuCre ;
      AV87Mantenimientomaquina_tmmovstwwds_15_tfmmsusucre_sel = AV25TFMMSUsuCre_Sel ;
      AV88Mantenimientomaquina_tmmovstwwds_16_tfmmsfchcre = AV26TFMMSFchCre ;
      AV89Mantenimientomaquina_tmmovstwwds_17_tfmmsfchapl = AV28TFMMSFchApl ;
      AV90Mantenimientomaquina_tmmovstwwds_18_tfmmsest_sels = AV33TFMMSEst_Sels ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A9413MMSTpo ,
                                           AV76Mantenimientomaquina_tmmovstwwds_4_tfmmstpo_sels ,
                                           A9420MMSEst ,
                                           AV90Mantenimientomaquina_tmmovstwwds_18_tfmmsest_sels ,
                                           Integer.valueOf(AV74Mantenimientomaquina_tmmovstwwds_2_tfmmscod) ,
                                           Integer.valueOf(AV75Mantenimientomaquina_tmmovstwwds_3_tfmmscod_to) ,
                                           Integer.valueOf(AV76Mantenimientomaquina_tmmovstwwds_4_tfmmstpo_sels.size()) ,
                                           AV77Mantenimientomaquina_tmmovstwwds_5_tfmmsfch ,
                                           AV79Mantenimientomaquina_tmmovstwwds_7_tfmmsprvnom_sel ,
                                           AV78Mantenimientomaquina_tmmovstwwds_6_tfmmsprvnom ,
                                           Integer.valueOf(AV80Mantenimientomaquina_tmmovstwwds_8_tfmmsprvnum) ,
                                           Integer.valueOf(AV81Mantenimientomaquina_tmmovstwwds_9_tfmmsprvnum_to) ,
                                           AV82Mantenimientomaquina_tmmovstwwds_10_tfmmsdto ,
                                           AV83Mantenimientomaquina_tmmovstwwds_11_tfmmsdto_to ,
                                           AV85Mantenimientomaquina_tmmovstwwds_13_tfmmsnroext_sel ,
                                           AV84Mantenimientomaquina_tmmovstwwds_12_tfmmsnroext ,
                                           AV87Mantenimientomaquina_tmmovstwwds_15_tfmmsusucre_sel ,
                                           AV86Mantenimientomaquina_tmmovstwwds_14_tfmmsusucre ,
                                           AV88Mantenimientomaquina_tmmovstwwds_16_tfmmsfchcre ,
                                           AV89Mantenimientomaquina_tmmovstwwds_17_tfmmsfchapl ,
                                           Integer.valueOf(AV90Mantenimientomaquina_tmmovstwwds_18_tfmmsest_sels.size()) ,
                                           Integer.valueOf(A9412MMSCod) ,
                                           A9416MMSFch ,
                                           A9415MMSPrvNom ,
                                           Integer.valueOf(A9414MMSPrvNum) ,
                                           A11509MMSDto ,
                                           A9419MMSNroExt ,
                                           A9417MMSUsuCre ,
                                           A9418MMSFchCre ,
                                           A11304MMSFchApl ,
                                           AV73Mantenimientomaquina_tmmovstwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV78Mantenimientomaquina_tmmovstwwds_6_tfmmsprvnom = GXutil.padr( GXutil.rtrim( AV78Mantenimientomaquina_tmmovstwwds_6_tfmmsprvnom), 30, "%") ;
      lV84Mantenimientomaquina_tmmovstwwds_12_tfmmsnroext = GXutil.padr( GXutil.rtrim( AV84Mantenimientomaquina_tmmovstwwds_12_tfmmsnroext), 20, "%") ;
      lV86Mantenimientomaquina_tmmovstwwds_14_tfmmsusucre = GXutil.padr( GXutil.rtrim( AV86Mantenimientomaquina_tmmovstwwds_14_tfmmsusucre), 10, "%") ;
      /* Using cursor P08DQ2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV74Mantenimientomaquina_tmmovstwwds_2_tfmmscod), Integer.valueOf(AV75Mantenimientomaquina_tmmovstwwds_3_tfmmscod_to), AV77Mantenimientomaquina_tmmovstwwds_5_tfmmsfch, lV78Mantenimientomaquina_tmmovstwwds_6_tfmmsprvnom, AV79Mantenimientomaquina_tmmovstwwds_7_tfmmsprvnom_sel, Integer.valueOf(AV80Mantenimientomaquina_tmmovstwwds_8_tfmmsprvnum), Integer.valueOf(AV81Mantenimientomaquina_tmmovstwwds_9_tfmmsprvnum_to), AV82Mantenimientomaquina_tmmovstwwds_10_tfmmsdto, AV83Mantenimientomaquina_tmmovstwwds_11_tfmmsdto_to, lV84Mantenimientomaquina_tmmovstwwds_12_tfmmsnroext, AV85Mantenimientomaquina_tmmovstwwds_13_tfmmsnroext_sel, lV86Mantenimientomaquina_tmmovstwwds_14_tfmmsusucre, AV87Mantenimientomaquina_tmmovstwwds_15_tfmmsusucre_sel, AV88Mantenimientomaquina_tmmovstwwds_16_tfmmsfchcre, AV89Mantenimientomaquina_tmmovstwwds_17_tfmmsfchapl});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8DQ2 = false ;
         A9414MMSPrvNum = P08DQ2_A9414MMSPrvNum[0] ;
         n9414MMSPrvNum = P08DQ2_n9414MMSPrvNum[0] ;
         A396EmprCod = P08DQ2_A396EmprCod[0] ;
         A11304MMSFchApl = P08DQ2_A11304MMSFchApl[0] ;
         n11304MMSFchApl = P08DQ2_n11304MMSFchApl[0] ;
         A9418MMSFchCre = P08DQ2_A9418MMSFchCre[0] ;
         n9418MMSFchCre = P08DQ2_n9418MMSFchCre[0] ;
         A9417MMSUsuCre = P08DQ2_A9417MMSUsuCre[0] ;
         n9417MMSUsuCre = P08DQ2_n9417MMSUsuCre[0] ;
         A9419MMSNroExt = P08DQ2_A9419MMSNroExt[0] ;
         n9419MMSNroExt = P08DQ2_n9419MMSNroExt[0] ;
         A11509MMSDto = P08DQ2_A11509MMSDto[0] ;
         n11509MMSDto = P08DQ2_n11509MMSDto[0] ;
         A9415MMSPrvNom = P08DQ2_A9415MMSPrvNom[0] ;
         n9415MMSPrvNom = P08DQ2_n9415MMSPrvNom[0] ;
         A9416MMSFch = P08DQ2_A9416MMSFch[0] ;
         n9416MMSFch = P08DQ2_n9416MMSFch[0] ;
         A9412MMSCod = P08DQ2_A9412MMSCod[0] ;
         A9420MMSEst = P08DQ2_A9420MMSEst[0] ;
         n9420MMSEst = P08DQ2_n9420MMSEst[0] ;
         A9413MMSTpo = P08DQ2_A9413MMSTpo[0] ;
         n9413MMSTpo = P08DQ2_n9413MMSTpo[0] ;
         A9415MMSPrvNom = P08DQ2_A9415MMSPrvNom[0] ;
         n9415MMSPrvNom = P08DQ2_n9415MMSPrvNom[0] ;
         if ( (GXutil.strcmp("", AV73Mantenimientomaquina_tmmovstwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A9412MMSCod, 8, 0) , GXutil.padr( "%" + AV73Mantenimientomaquina_tmmovstwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "entrada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV73Mantenimientomaquina_tmmovstwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9413MMSTpo, httpContext.getMessage( "E", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "salida", ""), "") , GXutil.padr( "%" + GXutil.lower( AV73Mantenimientomaquina_tmmovstwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9413MMSTpo, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A9415MMSPrvNom) , GXutil.padr( "%" + GXutil.upper( AV73Mantenimientomaquina_tmmovstwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9414MMSPrvNum, 6, 0) , GXutil.padr( "%" + AV73Mantenimientomaquina_tmmovstwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A11509MMSDto, 6, 2) , GXutil.padr( "%" + AV73Mantenimientomaquina_tmmovstwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9419MMSNroExt) , GXutil.padr( "%" + GXutil.upper( AV73Mantenimientomaquina_tmmovstwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9417MMSUsuCre) , GXutil.padr( "%" + GXutil.upper( AV73Mantenimientomaquina_tmmovstwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "en ingreso", ""), "") , GXutil.padr( "%" + GXutil.lower( AV73Mantenimientomaquina_tmmovstwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9420MMSEst, httpContext.getMessage( "E", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "aplicado", ""), "") , GXutil.padr( "%" + GXutil.lower( AV73Mantenimientomaquina_tmmovstwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9420MMSEst, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "cancelado", ""), "") , GXutil.padr( "%" + GXutil.lower( AV73Mantenimientomaquina_tmmovstwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9420MMSEst, httpContext.getMessage( "C", "")) == 0 ) ) ) )
         {
            AV48count = 0 ;
            while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08DQ2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P08DQ2_A9414MMSPrvNum[0] == A9414MMSPrvNum ) )
            {
               brk8DQ2 = false ;
               A9412MMSCod = P08DQ2_A9412MMSCod[0] ;
               AV48count = (long)(AV48count+1) ;
               brk8DQ2 = true ;
               pr_default.readNext(0);
            }
            if ( ! (GXutil.strcmp("", A9415MMSPrvNom)==0) )
            {
               AV40Option = A9415MMSPrvNom ;
               AV39InsertIndex = 1 ;
               while ( ( AV39InsertIndex <= AV41Options.size() ) && ( GXutil.strcmp((String)AV41Options.elementAt(-1+AV39InsertIndex), AV40Option) < 0 ) )
               {
                  AV39InsertIndex = (int)(AV39InsertIndex+1) ;
               }
               AV41Options.add(AV40Option, AV39InsertIndex);
               AV46OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), AV39InsertIndex);
            }
            if ( AV41Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk8DQ2 )
         {
            brk8DQ2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADMMSNROEXTOPTIONS' Routine */
      returnInSub = false ;
      AV30TFMMSNroExt = AV36SearchTxt ;
      AV31TFMMSNroExt_Sel = "" ;
      AV73Mantenimientomaquina_tmmovstwwds_1_filterfulltext = AV68FilterFullText ;
      AV74Mantenimientomaquina_tmmovstwwds_2_tfmmscod = AV14TFMMSCod ;
      AV75Mantenimientomaquina_tmmovstwwds_3_tfmmscod_to = AV15TFMMSCod_To ;
      AV76Mantenimientomaquina_tmmovstwwds_4_tfmmstpo_sels = AV17TFMMSTpo_Sels ;
      AV77Mantenimientomaquina_tmmovstwwds_5_tfmmsfch = AV22TFMMSFch ;
      AV78Mantenimientomaquina_tmmovstwwds_6_tfmmsprvnom = AV20TFMMSPrvNom ;
      AV79Mantenimientomaquina_tmmovstwwds_7_tfmmsprvnom_sel = AV21TFMMSPrvNom_Sel ;
      AV80Mantenimientomaquina_tmmovstwwds_8_tfmmsprvnum = AV18TFMMSPrvNum ;
      AV81Mantenimientomaquina_tmmovstwwds_9_tfmmsprvnum_to = AV19TFMMSPrvNum_To ;
      AV82Mantenimientomaquina_tmmovstwwds_10_tfmmsdto = AV34TFMMSDto ;
      AV83Mantenimientomaquina_tmmovstwwds_11_tfmmsdto_to = AV35TFMMSDto_To ;
      AV84Mantenimientomaquina_tmmovstwwds_12_tfmmsnroext = AV30TFMMSNroExt ;
      AV85Mantenimientomaquina_tmmovstwwds_13_tfmmsnroext_sel = AV31TFMMSNroExt_Sel ;
      AV86Mantenimientomaquina_tmmovstwwds_14_tfmmsusucre = AV24TFMMSUsuCre ;
      AV87Mantenimientomaquina_tmmovstwwds_15_tfmmsusucre_sel = AV25TFMMSUsuCre_Sel ;
      AV88Mantenimientomaquina_tmmovstwwds_16_tfmmsfchcre = AV26TFMMSFchCre ;
      AV89Mantenimientomaquina_tmmovstwwds_17_tfmmsfchapl = AV28TFMMSFchApl ;
      AV90Mantenimientomaquina_tmmovstwwds_18_tfmmsest_sels = AV33TFMMSEst_Sels ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           A9413MMSTpo ,
                                           AV76Mantenimientomaquina_tmmovstwwds_4_tfmmstpo_sels ,
                                           A9420MMSEst ,
                                           AV90Mantenimientomaquina_tmmovstwwds_18_tfmmsest_sels ,
                                           Integer.valueOf(AV74Mantenimientomaquina_tmmovstwwds_2_tfmmscod) ,
                                           Integer.valueOf(AV75Mantenimientomaquina_tmmovstwwds_3_tfmmscod_to) ,
                                           Integer.valueOf(AV76Mantenimientomaquina_tmmovstwwds_4_tfmmstpo_sels.size()) ,
                                           AV77Mantenimientomaquina_tmmovstwwds_5_tfmmsfch ,
                                           AV79Mantenimientomaquina_tmmovstwwds_7_tfmmsprvnom_sel ,
                                           AV78Mantenimientomaquina_tmmovstwwds_6_tfmmsprvnom ,
                                           Integer.valueOf(AV80Mantenimientomaquina_tmmovstwwds_8_tfmmsprvnum) ,
                                           Integer.valueOf(AV81Mantenimientomaquina_tmmovstwwds_9_tfmmsprvnum_to) ,
                                           AV82Mantenimientomaquina_tmmovstwwds_10_tfmmsdto ,
                                           AV83Mantenimientomaquina_tmmovstwwds_11_tfmmsdto_to ,
                                           AV85Mantenimientomaquina_tmmovstwwds_13_tfmmsnroext_sel ,
                                           AV84Mantenimientomaquina_tmmovstwwds_12_tfmmsnroext ,
                                           AV87Mantenimientomaquina_tmmovstwwds_15_tfmmsusucre_sel ,
                                           AV86Mantenimientomaquina_tmmovstwwds_14_tfmmsusucre ,
                                           AV88Mantenimientomaquina_tmmovstwwds_16_tfmmsfchcre ,
                                           AV89Mantenimientomaquina_tmmovstwwds_17_tfmmsfchapl ,
                                           Integer.valueOf(AV90Mantenimientomaquina_tmmovstwwds_18_tfmmsest_sels.size()) ,
                                           Integer.valueOf(A9412MMSCod) ,
                                           A9416MMSFch ,
                                           A9415MMSPrvNom ,
                                           Integer.valueOf(A9414MMSPrvNum) ,
                                           A11509MMSDto ,
                                           A9419MMSNroExt ,
                                           A9417MMSUsuCre ,
                                           A9418MMSFchCre ,
                                           A11304MMSFchApl ,
                                           AV73Mantenimientomaquina_tmmovstwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV78Mantenimientomaquina_tmmovstwwds_6_tfmmsprvnom = GXutil.padr( GXutil.rtrim( AV78Mantenimientomaquina_tmmovstwwds_6_tfmmsprvnom), 30, "%") ;
      lV84Mantenimientomaquina_tmmovstwwds_12_tfmmsnroext = GXutil.padr( GXutil.rtrim( AV84Mantenimientomaquina_tmmovstwwds_12_tfmmsnroext), 20, "%") ;
      lV86Mantenimientomaquina_tmmovstwwds_14_tfmmsusucre = GXutil.padr( GXutil.rtrim( AV86Mantenimientomaquina_tmmovstwwds_14_tfmmsusucre), 10, "%") ;
      /* Using cursor P08DQ3 */
      pr_default.execute(1, new Object[] {Integer.valueOf(AV74Mantenimientomaquina_tmmovstwwds_2_tfmmscod), Integer.valueOf(AV75Mantenimientomaquina_tmmovstwwds_3_tfmmscod_to), AV77Mantenimientomaquina_tmmovstwwds_5_tfmmsfch, lV78Mantenimientomaquina_tmmovstwwds_6_tfmmsprvnom, AV79Mantenimientomaquina_tmmovstwwds_7_tfmmsprvnom_sel, Integer.valueOf(AV80Mantenimientomaquina_tmmovstwwds_8_tfmmsprvnum), Integer.valueOf(AV81Mantenimientomaquina_tmmovstwwds_9_tfmmsprvnum_to), AV82Mantenimientomaquina_tmmovstwwds_10_tfmmsdto, AV83Mantenimientomaquina_tmmovstwwds_11_tfmmsdto_to, lV84Mantenimientomaquina_tmmovstwwds_12_tfmmsnroext, AV85Mantenimientomaquina_tmmovstwwds_13_tfmmsnroext_sel, lV86Mantenimientomaquina_tmmovstwwds_14_tfmmsusucre, AV87Mantenimientomaquina_tmmovstwwds_15_tfmmsusucre_sel, AV88Mantenimientomaquina_tmmovstwwds_16_tfmmsfchcre, AV89Mantenimientomaquina_tmmovstwwds_17_tfmmsfchapl});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8DQ4 = false ;
         A396EmprCod = P08DQ3_A396EmprCod[0] ;
         A9419MMSNroExt = P08DQ3_A9419MMSNroExt[0] ;
         n9419MMSNroExt = P08DQ3_n9419MMSNroExt[0] ;
         A11304MMSFchApl = P08DQ3_A11304MMSFchApl[0] ;
         n11304MMSFchApl = P08DQ3_n11304MMSFchApl[0] ;
         A9418MMSFchCre = P08DQ3_A9418MMSFchCre[0] ;
         n9418MMSFchCre = P08DQ3_n9418MMSFchCre[0] ;
         A9417MMSUsuCre = P08DQ3_A9417MMSUsuCre[0] ;
         n9417MMSUsuCre = P08DQ3_n9417MMSUsuCre[0] ;
         A11509MMSDto = P08DQ3_A11509MMSDto[0] ;
         n11509MMSDto = P08DQ3_n11509MMSDto[0] ;
         A9414MMSPrvNum = P08DQ3_A9414MMSPrvNum[0] ;
         n9414MMSPrvNum = P08DQ3_n9414MMSPrvNum[0] ;
         A9415MMSPrvNom = P08DQ3_A9415MMSPrvNom[0] ;
         n9415MMSPrvNom = P08DQ3_n9415MMSPrvNom[0] ;
         A9416MMSFch = P08DQ3_A9416MMSFch[0] ;
         n9416MMSFch = P08DQ3_n9416MMSFch[0] ;
         A9412MMSCod = P08DQ3_A9412MMSCod[0] ;
         A9420MMSEst = P08DQ3_A9420MMSEst[0] ;
         n9420MMSEst = P08DQ3_n9420MMSEst[0] ;
         A9413MMSTpo = P08DQ3_A9413MMSTpo[0] ;
         n9413MMSTpo = P08DQ3_n9413MMSTpo[0] ;
         A9415MMSPrvNom = P08DQ3_A9415MMSPrvNom[0] ;
         n9415MMSPrvNom = P08DQ3_n9415MMSPrvNom[0] ;
         if ( (GXutil.strcmp("", AV73Mantenimientomaquina_tmmovstwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A9412MMSCod, 8, 0) , GXutil.padr( "%" + AV73Mantenimientomaquina_tmmovstwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "entrada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV73Mantenimientomaquina_tmmovstwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9413MMSTpo, httpContext.getMessage( "E", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "salida", ""), "") , GXutil.padr( "%" + GXutil.lower( AV73Mantenimientomaquina_tmmovstwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9413MMSTpo, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A9415MMSPrvNom) , GXutil.padr( "%" + GXutil.upper( AV73Mantenimientomaquina_tmmovstwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9414MMSPrvNum, 6, 0) , GXutil.padr( "%" + AV73Mantenimientomaquina_tmmovstwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A11509MMSDto, 6, 2) , GXutil.padr( "%" + AV73Mantenimientomaquina_tmmovstwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9419MMSNroExt) , GXutil.padr( "%" + GXutil.upper( AV73Mantenimientomaquina_tmmovstwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9417MMSUsuCre) , GXutil.padr( "%" + GXutil.upper( AV73Mantenimientomaquina_tmmovstwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "en ingreso", ""), "") , GXutil.padr( "%" + GXutil.lower( AV73Mantenimientomaquina_tmmovstwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9420MMSEst, httpContext.getMessage( "E", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "aplicado", ""), "") , GXutil.padr( "%" + GXutil.lower( AV73Mantenimientomaquina_tmmovstwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9420MMSEst, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "cancelado", ""), "") , GXutil.padr( "%" + GXutil.lower( AV73Mantenimientomaquina_tmmovstwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9420MMSEst, httpContext.getMessage( "C", "")) == 0 ) ) ) )
         {
            AV48count = 0 ;
            while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08DQ3_A9419MMSNroExt[0], A9419MMSNroExt) == 0 ) )
            {
               brk8DQ4 = false ;
               A396EmprCod = P08DQ3_A396EmprCod[0] ;
               A9412MMSCod = P08DQ3_A9412MMSCod[0] ;
               AV48count = (long)(AV48count+1) ;
               brk8DQ4 = true ;
               pr_default.readNext(1);
            }
            if ( ! (GXutil.strcmp("", A9419MMSNroExt)==0) )
            {
               AV40Option = A9419MMSNroExt ;
               AV41Options.add(AV40Option, 0);
               AV46OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV41Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk8DQ4 )
         {
            brk8DQ4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADMMSUSUCREOPTIONS' Routine */
      returnInSub = false ;
      AV24TFMMSUsuCre = AV36SearchTxt ;
      AV25TFMMSUsuCre_Sel = "" ;
      AV73Mantenimientomaquina_tmmovstwwds_1_filterfulltext = AV68FilterFullText ;
      AV74Mantenimientomaquina_tmmovstwwds_2_tfmmscod = AV14TFMMSCod ;
      AV75Mantenimientomaquina_tmmovstwwds_3_tfmmscod_to = AV15TFMMSCod_To ;
      AV76Mantenimientomaquina_tmmovstwwds_4_tfmmstpo_sels = AV17TFMMSTpo_Sels ;
      AV77Mantenimientomaquina_tmmovstwwds_5_tfmmsfch = AV22TFMMSFch ;
      AV78Mantenimientomaquina_tmmovstwwds_6_tfmmsprvnom = AV20TFMMSPrvNom ;
      AV79Mantenimientomaquina_tmmovstwwds_7_tfmmsprvnom_sel = AV21TFMMSPrvNom_Sel ;
      AV80Mantenimientomaquina_tmmovstwwds_8_tfmmsprvnum = AV18TFMMSPrvNum ;
      AV81Mantenimientomaquina_tmmovstwwds_9_tfmmsprvnum_to = AV19TFMMSPrvNum_To ;
      AV82Mantenimientomaquina_tmmovstwwds_10_tfmmsdto = AV34TFMMSDto ;
      AV83Mantenimientomaquina_tmmovstwwds_11_tfmmsdto_to = AV35TFMMSDto_To ;
      AV84Mantenimientomaquina_tmmovstwwds_12_tfmmsnroext = AV30TFMMSNroExt ;
      AV85Mantenimientomaquina_tmmovstwwds_13_tfmmsnroext_sel = AV31TFMMSNroExt_Sel ;
      AV86Mantenimientomaquina_tmmovstwwds_14_tfmmsusucre = AV24TFMMSUsuCre ;
      AV87Mantenimientomaquina_tmmovstwwds_15_tfmmsusucre_sel = AV25TFMMSUsuCre_Sel ;
      AV88Mantenimientomaquina_tmmovstwwds_16_tfmmsfchcre = AV26TFMMSFchCre ;
      AV89Mantenimientomaquina_tmmovstwwds_17_tfmmsfchapl = AV28TFMMSFchApl ;
      AV90Mantenimientomaquina_tmmovstwwds_18_tfmmsest_sels = AV33TFMMSEst_Sels ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           A9413MMSTpo ,
                                           AV76Mantenimientomaquina_tmmovstwwds_4_tfmmstpo_sels ,
                                           A9420MMSEst ,
                                           AV90Mantenimientomaquina_tmmovstwwds_18_tfmmsest_sels ,
                                           Integer.valueOf(AV74Mantenimientomaquina_tmmovstwwds_2_tfmmscod) ,
                                           Integer.valueOf(AV75Mantenimientomaquina_tmmovstwwds_3_tfmmscod_to) ,
                                           Integer.valueOf(AV76Mantenimientomaquina_tmmovstwwds_4_tfmmstpo_sels.size()) ,
                                           AV77Mantenimientomaquina_tmmovstwwds_5_tfmmsfch ,
                                           AV79Mantenimientomaquina_tmmovstwwds_7_tfmmsprvnom_sel ,
                                           AV78Mantenimientomaquina_tmmovstwwds_6_tfmmsprvnom ,
                                           Integer.valueOf(AV80Mantenimientomaquina_tmmovstwwds_8_tfmmsprvnum) ,
                                           Integer.valueOf(AV81Mantenimientomaquina_tmmovstwwds_9_tfmmsprvnum_to) ,
                                           AV82Mantenimientomaquina_tmmovstwwds_10_tfmmsdto ,
                                           AV83Mantenimientomaquina_tmmovstwwds_11_tfmmsdto_to ,
                                           AV85Mantenimientomaquina_tmmovstwwds_13_tfmmsnroext_sel ,
                                           AV84Mantenimientomaquina_tmmovstwwds_12_tfmmsnroext ,
                                           AV87Mantenimientomaquina_tmmovstwwds_15_tfmmsusucre_sel ,
                                           AV86Mantenimientomaquina_tmmovstwwds_14_tfmmsusucre ,
                                           AV88Mantenimientomaquina_tmmovstwwds_16_tfmmsfchcre ,
                                           AV89Mantenimientomaquina_tmmovstwwds_17_tfmmsfchapl ,
                                           Integer.valueOf(AV90Mantenimientomaquina_tmmovstwwds_18_tfmmsest_sels.size()) ,
                                           Integer.valueOf(A9412MMSCod) ,
                                           A9416MMSFch ,
                                           A9415MMSPrvNom ,
                                           Integer.valueOf(A9414MMSPrvNum) ,
                                           A11509MMSDto ,
                                           A9419MMSNroExt ,
                                           A9417MMSUsuCre ,
                                           A9418MMSFchCre ,
                                           A11304MMSFchApl ,
                                           AV73Mantenimientomaquina_tmmovstwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV78Mantenimientomaquina_tmmovstwwds_6_tfmmsprvnom = GXutil.padr( GXutil.rtrim( AV78Mantenimientomaquina_tmmovstwwds_6_tfmmsprvnom), 30, "%") ;
      lV84Mantenimientomaquina_tmmovstwwds_12_tfmmsnroext = GXutil.padr( GXutil.rtrim( AV84Mantenimientomaquina_tmmovstwwds_12_tfmmsnroext), 20, "%") ;
      lV86Mantenimientomaquina_tmmovstwwds_14_tfmmsusucre = GXutil.padr( GXutil.rtrim( AV86Mantenimientomaquina_tmmovstwwds_14_tfmmsusucre), 10, "%") ;
      /* Using cursor P08DQ4 */
      pr_default.execute(2, new Object[] {Integer.valueOf(AV74Mantenimientomaquina_tmmovstwwds_2_tfmmscod), Integer.valueOf(AV75Mantenimientomaquina_tmmovstwwds_3_tfmmscod_to), AV77Mantenimientomaquina_tmmovstwwds_5_tfmmsfch, lV78Mantenimientomaquina_tmmovstwwds_6_tfmmsprvnom, AV79Mantenimientomaquina_tmmovstwwds_7_tfmmsprvnom_sel, Integer.valueOf(AV80Mantenimientomaquina_tmmovstwwds_8_tfmmsprvnum), Integer.valueOf(AV81Mantenimientomaquina_tmmovstwwds_9_tfmmsprvnum_to), AV82Mantenimientomaquina_tmmovstwwds_10_tfmmsdto, AV83Mantenimientomaquina_tmmovstwwds_11_tfmmsdto_to, lV84Mantenimientomaquina_tmmovstwwds_12_tfmmsnroext, AV85Mantenimientomaquina_tmmovstwwds_13_tfmmsnroext_sel, lV86Mantenimientomaquina_tmmovstwwds_14_tfmmsusucre, AV87Mantenimientomaquina_tmmovstwwds_15_tfmmsusucre_sel, AV88Mantenimientomaquina_tmmovstwwds_16_tfmmsfchcre, AV89Mantenimientomaquina_tmmovstwwds_17_tfmmsfchapl});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk8DQ6 = false ;
         A396EmprCod = P08DQ4_A396EmprCod[0] ;
         A9417MMSUsuCre = P08DQ4_A9417MMSUsuCre[0] ;
         n9417MMSUsuCre = P08DQ4_n9417MMSUsuCre[0] ;
         A11304MMSFchApl = P08DQ4_A11304MMSFchApl[0] ;
         n11304MMSFchApl = P08DQ4_n11304MMSFchApl[0] ;
         A9418MMSFchCre = P08DQ4_A9418MMSFchCre[0] ;
         n9418MMSFchCre = P08DQ4_n9418MMSFchCre[0] ;
         A9419MMSNroExt = P08DQ4_A9419MMSNroExt[0] ;
         n9419MMSNroExt = P08DQ4_n9419MMSNroExt[0] ;
         A11509MMSDto = P08DQ4_A11509MMSDto[0] ;
         n11509MMSDto = P08DQ4_n11509MMSDto[0] ;
         A9414MMSPrvNum = P08DQ4_A9414MMSPrvNum[0] ;
         n9414MMSPrvNum = P08DQ4_n9414MMSPrvNum[0] ;
         A9415MMSPrvNom = P08DQ4_A9415MMSPrvNom[0] ;
         n9415MMSPrvNom = P08DQ4_n9415MMSPrvNom[0] ;
         A9416MMSFch = P08DQ4_A9416MMSFch[0] ;
         n9416MMSFch = P08DQ4_n9416MMSFch[0] ;
         A9412MMSCod = P08DQ4_A9412MMSCod[0] ;
         A9420MMSEst = P08DQ4_A9420MMSEst[0] ;
         n9420MMSEst = P08DQ4_n9420MMSEst[0] ;
         A9413MMSTpo = P08DQ4_A9413MMSTpo[0] ;
         n9413MMSTpo = P08DQ4_n9413MMSTpo[0] ;
         A9415MMSPrvNom = P08DQ4_A9415MMSPrvNom[0] ;
         n9415MMSPrvNom = P08DQ4_n9415MMSPrvNom[0] ;
         if ( (GXutil.strcmp("", AV73Mantenimientomaquina_tmmovstwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A9412MMSCod, 8, 0) , GXutil.padr( "%" + AV73Mantenimientomaquina_tmmovstwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "entrada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV73Mantenimientomaquina_tmmovstwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9413MMSTpo, httpContext.getMessage( "E", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "salida", ""), "") , GXutil.padr( "%" + GXutil.lower( AV73Mantenimientomaquina_tmmovstwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9413MMSTpo, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A9415MMSPrvNom) , GXutil.padr( "%" + GXutil.upper( AV73Mantenimientomaquina_tmmovstwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9414MMSPrvNum, 6, 0) , GXutil.padr( "%" + AV73Mantenimientomaquina_tmmovstwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A11509MMSDto, 6, 2) , GXutil.padr( "%" + AV73Mantenimientomaquina_tmmovstwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9419MMSNroExt) , GXutil.padr( "%" + GXutil.upper( AV73Mantenimientomaquina_tmmovstwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9417MMSUsuCre) , GXutil.padr( "%" + GXutil.upper( AV73Mantenimientomaquina_tmmovstwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "en ingreso", ""), "") , GXutil.padr( "%" + GXutil.lower( AV73Mantenimientomaquina_tmmovstwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9420MMSEst, httpContext.getMessage( "E", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "aplicado", ""), "") , GXutil.padr( "%" + GXutil.lower( AV73Mantenimientomaquina_tmmovstwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9420MMSEst, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "cancelado", ""), "") , GXutil.padr( "%" + GXutil.lower( AV73Mantenimientomaquina_tmmovstwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9420MMSEst, httpContext.getMessage( "C", "")) == 0 ) ) ) )
         {
            AV48count = 0 ;
            while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P08DQ4_A9417MMSUsuCre[0], A9417MMSUsuCre) == 0 ) )
            {
               brk8DQ6 = false ;
               A396EmprCod = P08DQ4_A396EmprCod[0] ;
               A9412MMSCod = P08DQ4_A9412MMSCod[0] ;
               AV48count = (long)(AV48count+1) ;
               brk8DQ6 = true ;
               pr_default.readNext(2);
            }
            if ( ! (GXutil.strcmp("", A9417MMSUsuCre)==0) )
            {
               AV40Option = A9417MMSUsuCre ;
               AV41Options.add(AV40Option, 0);
               AV46OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV41Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk8DQ6 )
         {
            brk8DQ6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tmmovstwwgetfilterdata.this.AV42OptionsJson;
      this.aP4[0] = tmmovstwwgetfilterdata.this.AV45OptionsDescJson;
      this.aP5[0] = tmmovstwwgetfilterdata.this.AV47OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV42OptionsJson = "" ;
      AV45OptionsDescJson = "" ;
      AV47OptionIndexesJson = "" ;
      AV41Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV44OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV46OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV49Session = httpContext.getWebSession();
      AV51GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV52GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV68FilterFullText = "" ;
      AV16TFMMSTpo_SelsJson = "" ;
      AV17TFMMSTpo_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV22TFMMSFch = GXutil.nullDate() ;
      AV20TFMMSPrvNom = "" ;
      AV21TFMMSPrvNom_Sel = "" ;
      AV34TFMMSDto = DecimalUtil.ZERO ;
      AV35TFMMSDto_To = DecimalUtil.ZERO ;
      AV30TFMMSNroExt = "" ;
      AV31TFMMSNroExt_Sel = "" ;
      AV24TFMMSUsuCre = "" ;
      AV25TFMMSUsuCre_Sel = "" ;
      AV26TFMMSFchCre = GXutil.resetTime( GXutil.nullDate() );
      AV28TFMMSFchApl = GXutil.resetTime( GXutil.nullDate() );
      AV32TFMMSEst_SelsJson = "" ;
      AV33TFMMSEst_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      A9415MMSPrvNom = "" ;
      AV73Mantenimientomaquina_tmmovstwwds_1_filterfulltext = "" ;
      AV76Mantenimientomaquina_tmmovstwwds_4_tfmmstpo_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV77Mantenimientomaquina_tmmovstwwds_5_tfmmsfch = GXutil.nullDate() ;
      AV78Mantenimientomaquina_tmmovstwwds_6_tfmmsprvnom = "" ;
      AV79Mantenimientomaquina_tmmovstwwds_7_tfmmsprvnom_sel = "" ;
      AV82Mantenimientomaquina_tmmovstwwds_10_tfmmsdto = DecimalUtil.ZERO ;
      AV83Mantenimientomaquina_tmmovstwwds_11_tfmmsdto_to = DecimalUtil.ZERO ;
      AV84Mantenimientomaquina_tmmovstwwds_12_tfmmsnroext = "" ;
      AV85Mantenimientomaquina_tmmovstwwds_13_tfmmsnroext_sel = "" ;
      AV86Mantenimientomaquina_tmmovstwwds_14_tfmmsusucre = "" ;
      AV87Mantenimientomaquina_tmmovstwwds_15_tfmmsusucre_sel = "" ;
      AV88Mantenimientomaquina_tmmovstwwds_16_tfmmsfchcre = GXutil.resetTime( GXutil.nullDate() );
      AV89Mantenimientomaquina_tmmovstwwds_17_tfmmsfchapl = GXutil.resetTime( GXutil.nullDate() );
      AV90Mantenimientomaquina_tmmovstwwds_18_tfmmsest_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      scmdbuf = "" ;
      lV78Mantenimientomaquina_tmmovstwwds_6_tfmmsprvnom = "" ;
      lV84Mantenimientomaquina_tmmovstwwds_12_tfmmsnroext = "" ;
      lV86Mantenimientomaquina_tmmovstwwds_14_tfmmsusucre = "" ;
      A9413MMSTpo = "" ;
      A9420MMSEst = "" ;
      A9416MMSFch = GXutil.nullDate() ;
      A11509MMSDto = DecimalUtil.ZERO ;
      A9419MMSNroExt = "" ;
      A9417MMSUsuCre = "" ;
      A9418MMSFchCre = GXutil.resetTime( GXutil.nullDate() );
      A11304MMSFchApl = GXutil.resetTime( GXutil.nullDate() );
      P08DQ2_A9414MMSPrvNum = new int[1] ;
      P08DQ2_n9414MMSPrvNum = new boolean[] {false} ;
      P08DQ2_A396EmprCod = new String[] {""} ;
      P08DQ2_A11304MMSFchApl = new java.util.Date[] {GXutil.nullDate()} ;
      P08DQ2_n11304MMSFchApl = new boolean[] {false} ;
      P08DQ2_A9418MMSFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      P08DQ2_n9418MMSFchCre = new boolean[] {false} ;
      P08DQ2_A9417MMSUsuCre = new String[] {""} ;
      P08DQ2_n9417MMSUsuCre = new boolean[] {false} ;
      P08DQ2_A9419MMSNroExt = new String[] {""} ;
      P08DQ2_n9419MMSNroExt = new boolean[] {false} ;
      P08DQ2_A11509MMSDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08DQ2_n11509MMSDto = new boolean[] {false} ;
      P08DQ2_A9415MMSPrvNom = new String[] {""} ;
      P08DQ2_n9415MMSPrvNom = new boolean[] {false} ;
      P08DQ2_A9416MMSFch = new java.util.Date[] {GXutil.nullDate()} ;
      P08DQ2_n9416MMSFch = new boolean[] {false} ;
      P08DQ2_A9412MMSCod = new int[1] ;
      P08DQ2_A9420MMSEst = new String[] {""} ;
      P08DQ2_n9420MMSEst = new boolean[] {false} ;
      P08DQ2_A9413MMSTpo = new String[] {""} ;
      P08DQ2_n9413MMSTpo = new boolean[] {false} ;
      A396EmprCod = "" ;
      AV40Option = "" ;
      P08DQ3_A396EmprCod = new String[] {""} ;
      P08DQ3_A9419MMSNroExt = new String[] {""} ;
      P08DQ3_n9419MMSNroExt = new boolean[] {false} ;
      P08DQ3_A11304MMSFchApl = new java.util.Date[] {GXutil.nullDate()} ;
      P08DQ3_n11304MMSFchApl = new boolean[] {false} ;
      P08DQ3_A9418MMSFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      P08DQ3_n9418MMSFchCre = new boolean[] {false} ;
      P08DQ3_A9417MMSUsuCre = new String[] {""} ;
      P08DQ3_n9417MMSUsuCre = new boolean[] {false} ;
      P08DQ3_A11509MMSDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08DQ3_n11509MMSDto = new boolean[] {false} ;
      P08DQ3_A9414MMSPrvNum = new int[1] ;
      P08DQ3_n9414MMSPrvNum = new boolean[] {false} ;
      P08DQ3_A9415MMSPrvNom = new String[] {""} ;
      P08DQ3_n9415MMSPrvNom = new boolean[] {false} ;
      P08DQ3_A9416MMSFch = new java.util.Date[] {GXutil.nullDate()} ;
      P08DQ3_n9416MMSFch = new boolean[] {false} ;
      P08DQ3_A9412MMSCod = new int[1] ;
      P08DQ3_A9420MMSEst = new String[] {""} ;
      P08DQ3_n9420MMSEst = new boolean[] {false} ;
      P08DQ3_A9413MMSTpo = new String[] {""} ;
      P08DQ3_n9413MMSTpo = new boolean[] {false} ;
      P08DQ4_A396EmprCod = new String[] {""} ;
      P08DQ4_A9417MMSUsuCre = new String[] {""} ;
      P08DQ4_n9417MMSUsuCre = new boolean[] {false} ;
      P08DQ4_A11304MMSFchApl = new java.util.Date[] {GXutil.nullDate()} ;
      P08DQ4_n11304MMSFchApl = new boolean[] {false} ;
      P08DQ4_A9418MMSFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      P08DQ4_n9418MMSFchCre = new boolean[] {false} ;
      P08DQ4_A9419MMSNroExt = new String[] {""} ;
      P08DQ4_n9419MMSNroExt = new boolean[] {false} ;
      P08DQ4_A11509MMSDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08DQ4_n11509MMSDto = new boolean[] {false} ;
      P08DQ4_A9414MMSPrvNum = new int[1] ;
      P08DQ4_n9414MMSPrvNum = new boolean[] {false} ;
      P08DQ4_A9415MMSPrvNom = new String[] {""} ;
      P08DQ4_n9415MMSPrvNom = new boolean[] {false} ;
      P08DQ4_A9416MMSFch = new java.util.Date[] {GXutil.nullDate()} ;
      P08DQ4_n9416MMSFch = new boolean[] {false} ;
      P08DQ4_A9412MMSCod = new int[1] ;
      P08DQ4_A9420MMSEst = new String[] {""} ;
      P08DQ4_n9420MMSEst = new boolean[] {false} ;
      P08DQ4_A9413MMSTpo = new String[] {""} ;
      P08DQ4_n9413MMSTpo = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.tmmovstwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08DQ2_A9414MMSPrvNum, P08DQ2_n9414MMSPrvNum, P08DQ2_A396EmprCod, P08DQ2_A11304MMSFchApl, P08DQ2_n11304MMSFchApl, P08DQ2_A9418MMSFchCre, P08DQ2_n9418MMSFchCre, P08DQ2_A9417MMSUsuCre, P08DQ2_n9417MMSUsuCre, P08DQ2_A9419MMSNroExt,
            P08DQ2_n9419MMSNroExt, P08DQ2_A11509MMSDto, P08DQ2_n11509MMSDto, P08DQ2_A9415MMSPrvNom, P08DQ2_n9415MMSPrvNom, P08DQ2_A9416MMSFch, P08DQ2_n9416MMSFch, P08DQ2_A9412MMSCod, P08DQ2_A9420MMSEst, P08DQ2_n9420MMSEst,
            P08DQ2_A9413MMSTpo, P08DQ2_n9413MMSTpo
            }
            , new Object[] {
            P08DQ3_A396EmprCod, P08DQ3_A9419MMSNroExt, P08DQ3_n9419MMSNroExt, P08DQ3_A11304MMSFchApl, P08DQ3_n11304MMSFchApl, P08DQ3_A9418MMSFchCre, P08DQ3_n9418MMSFchCre, P08DQ3_A9417MMSUsuCre, P08DQ3_n9417MMSUsuCre, P08DQ3_A11509MMSDto,
            P08DQ3_n11509MMSDto, P08DQ3_A9414MMSPrvNum, P08DQ3_n9414MMSPrvNum, P08DQ3_A9415MMSPrvNom, P08DQ3_n9415MMSPrvNom, P08DQ3_A9416MMSFch, P08DQ3_n9416MMSFch, P08DQ3_A9412MMSCod, P08DQ3_A9420MMSEst, P08DQ3_n9420MMSEst,
            P08DQ3_A9413MMSTpo, P08DQ3_n9413MMSTpo
            }
            , new Object[] {
            P08DQ4_A396EmprCod, P08DQ4_A9417MMSUsuCre, P08DQ4_n9417MMSUsuCre, P08DQ4_A11304MMSFchApl, P08DQ4_n11304MMSFchApl, P08DQ4_A9418MMSFchCre, P08DQ4_n9418MMSFchCre, P08DQ4_A9419MMSNroExt, P08DQ4_n9419MMSNroExt, P08DQ4_A11509MMSDto,
            P08DQ4_n11509MMSDto, P08DQ4_A9414MMSPrvNum, P08DQ4_n9414MMSPrvNum, P08DQ4_A9415MMSPrvNom, P08DQ4_n9415MMSPrvNom, P08DQ4_A9416MMSFch, P08DQ4_n9416MMSFch, P08DQ4_A9412MMSCod, P08DQ4_A9420MMSEst, P08DQ4_n9420MMSEst,
            P08DQ4_A9413MMSTpo, P08DQ4_n9413MMSTpo
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV71GXV1 ;
   private int AV14TFMMSCod ;
   private int AV15TFMMSCod_To ;
   private int AV18TFMMSPrvNum ;
   private int AV19TFMMSPrvNum_To ;
   private int AV74Mantenimientomaquina_tmmovstwwds_2_tfmmscod ;
   private int AV75Mantenimientomaquina_tmmovstwwds_3_tfmmscod_to ;
   private int AV80Mantenimientomaquina_tmmovstwwds_8_tfmmsprvnum ;
   private int AV81Mantenimientomaquina_tmmovstwwds_9_tfmmsprvnum_to ;
   private int AV76Mantenimientomaquina_tmmovstwwds_4_tfmmstpo_sels_size ;
   private int AV90Mantenimientomaquina_tmmovstwwds_18_tfmmsest_sels_size ;
   private int A9412MMSCod ;
   private int A9414MMSPrvNum ;
   private int AV39InsertIndex ;
   private long AV48count ;
   private java.math.BigDecimal AV34TFMMSDto ;
   private java.math.BigDecimal AV35TFMMSDto_To ;
   private java.math.BigDecimal AV82Mantenimientomaquina_tmmovstwwds_10_tfmmsdto ;
   private java.math.BigDecimal AV83Mantenimientomaquina_tmmovstwwds_11_tfmmsdto_to ;
   private java.math.BigDecimal A11509MMSDto ;
   private String AV20TFMMSPrvNom ;
   private String AV21TFMMSPrvNom_Sel ;
   private String AV30TFMMSNroExt ;
   private String AV31TFMMSNroExt_Sel ;
   private String AV24TFMMSUsuCre ;
   private String AV25TFMMSUsuCre_Sel ;
   private String A9415MMSPrvNom ;
   private String AV78Mantenimientomaquina_tmmovstwwds_6_tfmmsprvnom ;
   private String AV79Mantenimientomaquina_tmmovstwwds_7_tfmmsprvnom_sel ;
   private String AV84Mantenimientomaquina_tmmovstwwds_12_tfmmsnroext ;
   private String AV85Mantenimientomaquina_tmmovstwwds_13_tfmmsnroext_sel ;
   private String AV86Mantenimientomaquina_tmmovstwwds_14_tfmmsusucre ;
   private String AV87Mantenimientomaquina_tmmovstwwds_15_tfmmsusucre_sel ;
   private String scmdbuf ;
   private String lV78Mantenimientomaquina_tmmovstwwds_6_tfmmsprvnom ;
   private String lV84Mantenimientomaquina_tmmovstwwds_12_tfmmsnroext ;
   private String lV86Mantenimientomaquina_tmmovstwwds_14_tfmmsusucre ;
   private String A9413MMSTpo ;
   private String A9420MMSEst ;
   private String A9419MMSNroExt ;
   private String A9417MMSUsuCre ;
   private String A396EmprCod ;
   private java.util.Date AV26TFMMSFchCre ;
   private java.util.Date AV28TFMMSFchApl ;
   private java.util.Date AV88Mantenimientomaquina_tmmovstwwds_16_tfmmsfchcre ;
   private java.util.Date AV89Mantenimientomaquina_tmmovstwwds_17_tfmmsfchapl ;
   private java.util.Date A9418MMSFchCre ;
   private java.util.Date A11304MMSFchApl ;
   private java.util.Date AV22TFMMSFch ;
   private java.util.Date AV77Mantenimientomaquina_tmmovstwwds_5_tfmmsfch ;
   private java.util.Date A9416MMSFch ;
   private boolean returnInSub ;
   private boolean brk8DQ2 ;
   private boolean n9414MMSPrvNum ;
   private boolean n11304MMSFchApl ;
   private boolean n9418MMSFchCre ;
   private boolean n9417MMSUsuCre ;
   private boolean n9419MMSNroExt ;
   private boolean n11509MMSDto ;
   private boolean n9415MMSPrvNom ;
   private boolean n9416MMSFch ;
   private boolean n9420MMSEst ;
   private boolean n9413MMSTpo ;
   private boolean brk8DQ4 ;
   private boolean brk8DQ6 ;
   private String AV42OptionsJson ;
   private String AV45OptionsDescJson ;
   private String AV47OptionIndexesJson ;
   private String AV16TFMMSTpo_SelsJson ;
   private String AV32TFMMSEst_SelsJson ;
   private String AV38DDOName ;
   private String AV36SearchTxt ;
   private String AV37SearchTxtTo ;
   private String AV68FilterFullText ;
   private String AV73Mantenimientomaquina_tmmovstwwds_1_filterfulltext ;
   private String AV40Option ;
   private com.genexus.webpanels.WebSession AV49Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private int[] P08DQ2_A9414MMSPrvNum ;
   private boolean[] P08DQ2_n9414MMSPrvNum ;
   private String[] P08DQ2_A396EmprCod ;
   private java.util.Date[] P08DQ2_A11304MMSFchApl ;
   private boolean[] P08DQ2_n11304MMSFchApl ;
   private java.util.Date[] P08DQ2_A9418MMSFchCre ;
   private boolean[] P08DQ2_n9418MMSFchCre ;
   private String[] P08DQ2_A9417MMSUsuCre ;
   private boolean[] P08DQ2_n9417MMSUsuCre ;
   private String[] P08DQ2_A9419MMSNroExt ;
   private boolean[] P08DQ2_n9419MMSNroExt ;
   private java.math.BigDecimal[] P08DQ2_A11509MMSDto ;
   private boolean[] P08DQ2_n11509MMSDto ;
   private String[] P08DQ2_A9415MMSPrvNom ;
   private boolean[] P08DQ2_n9415MMSPrvNom ;
   private java.util.Date[] P08DQ2_A9416MMSFch ;
   private boolean[] P08DQ2_n9416MMSFch ;
   private int[] P08DQ2_A9412MMSCod ;
   private String[] P08DQ2_A9420MMSEst ;
   private boolean[] P08DQ2_n9420MMSEst ;
   private String[] P08DQ2_A9413MMSTpo ;
   private boolean[] P08DQ2_n9413MMSTpo ;
   private String[] P08DQ3_A396EmprCod ;
   private String[] P08DQ3_A9419MMSNroExt ;
   private boolean[] P08DQ3_n9419MMSNroExt ;
   private java.util.Date[] P08DQ3_A11304MMSFchApl ;
   private boolean[] P08DQ3_n11304MMSFchApl ;
   private java.util.Date[] P08DQ3_A9418MMSFchCre ;
   private boolean[] P08DQ3_n9418MMSFchCre ;
   private String[] P08DQ3_A9417MMSUsuCre ;
   private boolean[] P08DQ3_n9417MMSUsuCre ;
   private java.math.BigDecimal[] P08DQ3_A11509MMSDto ;
   private boolean[] P08DQ3_n11509MMSDto ;
   private int[] P08DQ3_A9414MMSPrvNum ;
   private boolean[] P08DQ3_n9414MMSPrvNum ;
   private String[] P08DQ3_A9415MMSPrvNom ;
   private boolean[] P08DQ3_n9415MMSPrvNom ;
   private java.util.Date[] P08DQ3_A9416MMSFch ;
   private boolean[] P08DQ3_n9416MMSFch ;
   private int[] P08DQ3_A9412MMSCod ;
   private String[] P08DQ3_A9420MMSEst ;
   private boolean[] P08DQ3_n9420MMSEst ;
   private String[] P08DQ3_A9413MMSTpo ;
   private boolean[] P08DQ3_n9413MMSTpo ;
   private String[] P08DQ4_A396EmprCod ;
   private String[] P08DQ4_A9417MMSUsuCre ;
   private boolean[] P08DQ4_n9417MMSUsuCre ;
   private java.util.Date[] P08DQ4_A11304MMSFchApl ;
   private boolean[] P08DQ4_n11304MMSFchApl ;
   private java.util.Date[] P08DQ4_A9418MMSFchCre ;
   private boolean[] P08DQ4_n9418MMSFchCre ;
   private String[] P08DQ4_A9419MMSNroExt ;
   private boolean[] P08DQ4_n9419MMSNroExt ;
   private java.math.BigDecimal[] P08DQ4_A11509MMSDto ;
   private boolean[] P08DQ4_n11509MMSDto ;
   private int[] P08DQ4_A9414MMSPrvNum ;
   private boolean[] P08DQ4_n9414MMSPrvNum ;
   private String[] P08DQ4_A9415MMSPrvNom ;
   private boolean[] P08DQ4_n9415MMSPrvNom ;
   private java.util.Date[] P08DQ4_A9416MMSFch ;
   private boolean[] P08DQ4_n9416MMSFch ;
   private int[] P08DQ4_A9412MMSCod ;
   private String[] P08DQ4_A9420MMSEst ;
   private boolean[] P08DQ4_n9420MMSEst ;
   private String[] P08DQ4_A9413MMSTpo ;
   private boolean[] P08DQ4_n9413MMSTpo ;
   private GXSimpleCollection<String> AV17TFMMSTpo_Sels ;
   private GXSimpleCollection<String> AV33TFMMSEst_Sels ;
   private GXSimpleCollection<String> AV76Mantenimientomaquina_tmmovstwwds_4_tfmmstpo_sels ;
   private GXSimpleCollection<String> AV90Mantenimientomaquina_tmmovstwwds_18_tfmmsest_sels ;
   private GXSimpleCollection<String> AV41Options ;
   private GXSimpleCollection<String> AV44OptionsDesc ;
   private GXSimpleCollection<String> AV46OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV51GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV52GridStateFilterValue ;
}

final  class tmmovstwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08DQ2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A9413MMSTpo ,
                                          GXSimpleCollection<String> AV76Mantenimientomaquina_tmmovstwwds_4_tfmmstpo_sels ,
                                          String A9420MMSEst ,
                                          GXSimpleCollection<String> AV90Mantenimientomaquina_tmmovstwwds_18_tfmmsest_sels ,
                                          int AV74Mantenimientomaquina_tmmovstwwds_2_tfmmscod ,
                                          int AV75Mantenimientomaquina_tmmovstwwds_3_tfmmscod_to ,
                                          int AV76Mantenimientomaquina_tmmovstwwds_4_tfmmstpo_sels_size ,
                                          java.util.Date AV77Mantenimientomaquina_tmmovstwwds_5_tfmmsfch ,
                                          String AV79Mantenimientomaquina_tmmovstwwds_7_tfmmsprvnom_sel ,
                                          String AV78Mantenimientomaquina_tmmovstwwds_6_tfmmsprvnom ,
                                          int AV80Mantenimientomaquina_tmmovstwwds_8_tfmmsprvnum ,
                                          int AV81Mantenimientomaquina_tmmovstwwds_9_tfmmsprvnum_to ,
                                          java.math.BigDecimal AV82Mantenimientomaquina_tmmovstwwds_10_tfmmsdto ,
                                          java.math.BigDecimal AV83Mantenimientomaquina_tmmovstwwds_11_tfmmsdto_to ,
                                          String AV85Mantenimientomaquina_tmmovstwwds_13_tfmmsnroext_sel ,
                                          String AV84Mantenimientomaquina_tmmovstwwds_12_tfmmsnroext ,
                                          String AV87Mantenimientomaquina_tmmovstwwds_15_tfmmsusucre_sel ,
                                          String AV86Mantenimientomaquina_tmmovstwwds_14_tfmmsusucre ,
                                          java.util.Date AV88Mantenimientomaquina_tmmovstwwds_16_tfmmsfchcre ,
                                          java.util.Date AV89Mantenimientomaquina_tmmovstwwds_17_tfmmsfchapl ,
                                          int AV90Mantenimientomaquina_tmmovstwwds_18_tfmmsest_sels_size ,
                                          int A9412MMSCod ,
                                          java.util.Date A9416MMSFch ,
                                          String A9415MMSPrvNom ,
                                          int A9414MMSPrvNum ,
                                          java.math.BigDecimal A11509MMSDto ,
                                          String A9419MMSNroExt ,
                                          String A9417MMSUsuCre ,
                                          java.util.Date A9418MMSFchCre ,
                                          java.util.Date A11304MMSFchApl ,
                                          String AV73Mantenimientomaquina_tmmovstwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[15];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.MMSPrvNum AS MMSPrvNum, T1.EmprCod, T1.MMSFchApl, T1.MMSFchCre, T1.MMSUsuCre, T1.MMSNroExt, T1.MMSDto, T2.PrvNom AS MMSPrvNom, T1.MMSFch, T1.MMSCod, T1.MMSEst," ;
      scmdbuf += " T1.MMSTpo FROM (TXPMMoStk T1 LEFT JOIN TXPPRVGEN T2 ON T2.EmprCod = T1.EmprCod AND T2.PrvNum = T1.MMSPrvNum)" ;
      if ( ! (0==AV74Mantenimientomaquina_tmmovstwwds_2_tfmmscod) )
      {
         addWhere(sWhereString, "(T1.MMSCod >= ?)");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( ! (0==AV75Mantenimientomaquina_tmmovstwwds_3_tfmmscod_to) )
      {
         addWhere(sWhereString, "(T1.MMSCod <= ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( AV76Mantenimientomaquina_tmmovstwwds_4_tfmmstpo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV76Mantenimientomaquina_tmmovstwwds_4_tfmmstpo_sels, "T1.MMSTpo IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV77Mantenimientomaquina_tmmovstwwds_5_tfmmsfch)) )
      {
         addWhere(sWhereString, "(T1.MMSFch >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Mantenimientomaquina_tmmovstwwds_7_tfmmsprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV78Mantenimientomaquina_tmmovstwwds_6_tfmmsprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Mantenimientomaquina_tmmovstwwds_7_tfmmsprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvNom = ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (0==AV80Mantenimientomaquina_tmmovstwwds_8_tfmmsprvnum) )
      {
         addWhere(sWhereString, "(T1.MMSPrvNum >= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (0==AV81Mantenimientomaquina_tmmovstwwds_9_tfmmsprvnum_to) )
      {
         addWhere(sWhereString, "(T1.MMSPrvNum <= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Mantenimientomaquina_tmmovstwwds_10_tfmmsdto)==0) )
      {
         addWhere(sWhereString, "(T1.MMSDto >= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Mantenimientomaquina_tmmovstwwds_11_tfmmsdto_to)==0) )
      {
         addWhere(sWhereString, "(T1.MMSDto <= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Mantenimientomaquina_tmmovstwwds_13_tfmmsnroext_sel)==0) && ( ! (GXutil.strcmp("", AV84Mantenimientomaquina_tmmovstwwds_12_tfmmsnroext)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MMSNroExt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Mantenimientomaquina_tmmovstwwds_13_tfmmsnroext_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MMSNroExt = ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Mantenimientomaquina_tmmovstwwds_15_tfmmsusucre_sel)==0) && ( ! (GXutil.strcmp("", AV86Mantenimientomaquina_tmmovstwwds_14_tfmmsusucre)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MMSUsuCre) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Mantenimientomaquina_tmmovstwwds_15_tfmmsusucre_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MMSUsuCre = ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV88Mantenimientomaquina_tmmovstwwds_16_tfmmsfchcre) )
      {
         addWhere(sWhereString, "(T1.MMSFchCre >= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV89Mantenimientomaquina_tmmovstwwds_17_tfmmsfchapl) )
      {
         addWhere(sWhereString, "(T1.MMSFchApl >= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( AV90Mantenimientomaquina_tmmovstwwds_18_tfmmsest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV90Mantenimientomaquina_tmmovstwwds_18_tfmmsest_sels, "T1.MMSEst IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.MMSPrvNum" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08DQ3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A9413MMSTpo ,
                                          GXSimpleCollection<String> AV76Mantenimientomaquina_tmmovstwwds_4_tfmmstpo_sels ,
                                          String A9420MMSEst ,
                                          GXSimpleCollection<String> AV90Mantenimientomaquina_tmmovstwwds_18_tfmmsest_sels ,
                                          int AV74Mantenimientomaquina_tmmovstwwds_2_tfmmscod ,
                                          int AV75Mantenimientomaquina_tmmovstwwds_3_tfmmscod_to ,
                                          int AV76Mantenimientomaquina_tmmovstwwds_4_tfmmstpo_sels_size ,
                                          java.util.Date AV77Mantenimientomaquina_tmmovstwwds_5_tfmmsfch ,
                                          String AV79Mantenimientomaquina_tmmovstwwds_7_tfmmsprvnom_sel ,
                                          String AV78Mantenimientomaquina_tmmovstwwds_6_tfmmsprvnom ,
                                          int AV80Mantenimientomaquina_tmmovstwwds_8_tfmmsprvnum ,
                                          int AV81Mantenimientomaquina_tmmovstwwds_9_tfmmsprvnum_to ,
                                          java.math.BigDecimal AV82Mantenimientomaquina_tmmovstwwds_10_tfmmsdto ,
                                          java.math.BigDecimal AV83Mantenimientomaquina_tmmovstwwds_11_tfmmsdto_to ,
                                          String AV85Mantenimientomaquina_tmmovstwwds_13_tfmmsnroext_sel ,
                                          String AV84Mantenimientomaquina_tmmovstwwds_12_tfmmsnroext ,
                                          String AV87Mantenimientomaquina_tmmovstwwds_15_tfmmsusucre_sel ,
                                          String AV86Mantenimientomaquina_tmmovstwwds_14_tfmmsusucre ,
                                          java.util.Date AV88Mantenimientomaquina_tmmovstwwds_16_tfmmsfchcre ,
                                          java.util.Date AV89Mantenimientomaquina_tmmovstwwds_17_tfmmsfchapl ,
                                          int AV90Mantenimientomaquina_tmmovstwwds_18_tfmmsest_sels_size ,
                                          int A9412MMSCod ,
                                          java.util.Date A9416MMSFch ,
                                          String A9415MMSPrvNom ,
                                          int A9414MMSPrvNum ,
                                          java.math.BigDecimal A11509MMSDto ,
                                          String A9419MMSNroExt ,
                                          String A9417MMSUsuCre ,
                                          java.util.Date A9418MMSFchCre ,
                                          java.util.Date A11304MMSFchApl ,
                                          String AV73Mantenimientomaquina_tmmovstwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[15];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.MMSNroExt, T1.MMSFchApl, T1.MMSFchCre, T1.MMSUsuCre, T1.MMSDto, T1.MMSPrvNum AS MMSPrvNum, T2.PrvNom AS MMSPrvNom, T1.MMSFch, T1.MMSCod, T1.MMSEst," ;
      scmdbuf += " T1.MMSTpo FROM (TXPMMoStk T1 LEFT JOIN TXPPRVGEN T2 ON T2.EmprCod = T1.EmprCod AND T2.PrvNum = T1.MMSPrvNum)" ;
      if ( ! (0==AV74Mantenimientomaquina_tmmovstwwds_2_tfmmscod) )
      {
         addWhere(sWhereString, "(T1.MMSCod >= ?)");
      }
      else
      {
         GXv_int5[0] = (byte)(1) ;
      }
      if ( ! (0==AV75Mantenimientomaquina_tmmovstwwds_3_tfmmscod_to) )
      {
         addWhere(sWhereString, "(T1.MMSCod <= ?)");
      }
      else
      {
         GXv_int5[1] = (byte)(1) ;
      }
      if ( AV76Mantenimientomaquina_tmmovstwwds_4_tfmmstpo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV76Mantenimientomaquina_tmmovstwwds_4_tfmmstpo_sels, "T1.MMSTpo IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV77Mantenimientomaquina_tmmovstwwds_5_tfmmsfch)) )
      {
         addWhere(sWhereString, "(T1.MMSFch >= ?)");
      }
      else
      {
         GXv_int5[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Mantenimientomaquina_tmmovstwwds_7_tfmmsprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV78Mantenimientomaquina_tmmovstwwds_6_tfmmsprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Mantenimientomaquina_tmmovstwwds_7_tfmmsprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvNom = ?)");
      }
      else
      {
         GXv_int5[4] = (byte)(1) ;
      }
      if ( ! (0==AV80Mantenimientomaquina_tmmovstwwds_8_tfmmsprvnum) )
      {
         addWhere(sWhereString, "(T1.MMSPrvNum >= ?)");
      }
      else
      {
         GXv_int5[5] = (byte)(1) ;
      }
      if ( ! (0==AV81Mantenimientomaquina_tmmovstwwds_9_tfmmsprvnum_to) )
      {
         addWhere(sWhereString, "(T1.MMSPrvNum <= ?)");
      }
      else
      {
         GXv_int5[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Mantenimientomaquina_tmmovstwwds_10_tfmmsdto)==0) )
      {
         addWhere(sWhereString, "(T1.MMSDto >= ?)");
      }
      else
      {
         GXv_int5[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Mantenimientomaquina_tmmovstwwds_11_tfmmsdto_to)==0) )
      {
         addWhere(sWhereString, "(T1.MMSDto <= ?)");
      }
      else
      {
         GXv_int5[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Mantenimientomaquina_tmmovstwwds_13_tfmmsnroext_sel)==0) && ( ! (GXutil.strcmp("", AV84Mantenimientomaquina_tmmovstwwds_12_tfmmsnroext)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MMSNroExt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Mantenimientomaquina_tmmovstwwds_13_tfmmsnroext_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MMSNroExt = ?)");
      }
      else
      {
         GXv_int5[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Mantenimientomaquina_tmmovstwwds_15_tfmmsusucre_sel)==0) && ( ! (GXutil.strcmp("", AV86Mantenimientomaquina_tmmovstwwds_14_tfmmsusucre)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MMSUsuCre) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Mantenimientomaquina_tmmovstwwds_15_tfmmsusucre_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MMSUsuCre = ?)");
      }
      else
      {
         GXv_int5[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV88Mantenimientomaquina_tmmovstwwds_16_tfmmsfchcre) )
      {
         addWhere(sWhereString, "(T1.MMSFchCre >= ?)");
      }
      else
      {
         GXv_int5[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV89Mantenimientomaquina_tmmovstwwds_17_tfmmsfchapl) )
      {
         addWhere(sWhereString, "(T1.MMSFchApl >= ?)");
      }
      else
      {
         GXv_int5[14] = (byte)(1) ;
      }
      if ( AV90Mantenimientomaquina_tmmovstwwds_18_tfmmsest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV90Mantenimientomaquina_tmmovstwwds_18_tfmmsest_sels, "T1.MMSEst IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.MMSNroExt" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   protected Object[] conditional_P08DQ4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A9413MMSTpo ,
                                          GXSimpleCollection<String> AV76Mantenimientomaquina_tmmovstwwds_4_tfmmstpo_sels ,
                                          String A9420MMSEst ,
                                          GXSimpleCollection<String> AV90Mantenimientomaquina_tmmovstwwds_18_tfmmsest_sels ,
                                          int AV74Mantenimientomaquina_tmmovstwwds_2_tfmmscod ,
                                          int AV75Mantenimientomaquina_tmmovstwwds_3_tfmmscod_to ,
                                          int AV76Mantenimientomaquina_tmmovstwwds_4_tfmmstpo_sels_size ,
                                          java.util.Date AV77Mantenimientomaquina_tmmovstwwds_5_tfmmsfch ,
                                          String AV79Mantenimientomaquina_tmmovstwwds_7_tfmmsprvnom_sel ,
                                          String AV78Mantenimientomaquina_tmmovstwwds_6_tfmmsprvnom ,
                                          int AV80Mantenimientomaquina_tmmovstwwds_8_tfmmsprvnum ,
                                          int AV81Mantenimientomaquina_tmmovstwwds_9_tfmmsprvnum_to ,
                                          java.math.BigDecimal AV82Mantenimientomaquina_tmmovstwwds_10_tfmmsdto ,
                                          java.math.BigDecimal AV83Mantenimientomaquina_tmmovstwwds_11_tfmmsdto_to ,
                                          String AV85Mantenimientomaquina_tmmovstwwds_13_tfmmsnroext_sel ,
                                          String AV84Mantenimientomaquina_tmmovstwwds_12_tfmmsnroext ,
                                          String AV87Mantenimientomaquina_tmmovstwwds_15_tfmmsusucre_sel ,
                                          String AV86Mantenimientomaquina_tmmovstwwds_14_tfmmsusucre ,
                                          java.util.Date AV88Mantenimientomaquina_tmmovstwwds_16_tfmmsfchcre ,
                                          java.util.Date AV89Mantenimientomaquina_tmmovstwwds_17_tfmmsfchapl ,
                                          int AV90Mantenimientomaquina_tmmovstwwds_18_tfmmsest_sels_size ,
                                          int A9412MMSCod ,
                                          java.util.Date A9416MMSFch ,
                                          String A9415MMSPrvNom ,
                                          int A9414MMSPrvNum ,
                                          java.math.BigDecimal A11509MMSDto ,
                                          String A9419MMSNroExt ,
                                          String A9417MMSUsuCre ,
                                          java.util.Date A9418MMSFchCre ,
                                          java.util.Date A11304MMSFchApl ,
                                          String AV73Mantenimientomaquina_tmmovstwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[15];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.MMSUsuCre, T1.MMSFchApl, T1.MMSFchCre, T1.MMSNroExt, T1.MMSDto, T1.MMSPrvNum AS MMSPrvNum, T2.PrvNom AS MMSPrvNom, T1.MMSFch, T1.MMSCod, T1.MMSEst," ;
      scmdbuf += " T1.MMSTpo FROM (TXPMMoStk T1 LEFT JOIN TXPPRVGEN T2 ON T2.EmprCod = T1.EmprCod AND T2.PrvNum = T1.MMSPrvNum)" ;
      if ( ! (0==AV74Mantenimientomaquina_tmmovstwwds_2_tfmmscod) )
      {
         addWhere(sWhereString, "(T1.MMSCod >= ?)");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
      }
      if ( ! (0==AV75Mantenimientomaquina_tmmovstwwds_3_tfmmscod_to) )
      {
         addWhere(sWhereString, "(T1.MMSCod <= ?)");
      }
      else
      {
         GXv_int8[1] = (byte)(1) ;
      }
      if ( AV76Mantenimientomaquina_tmmovstwwds_4_tfmmstpo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV76Mantenimientomaquina_tmmovstwwds_4_tfmmstpo_sels, "T1.MMSTpo IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV77Mantenimientomaquina_tmmovstwwds_5_tfmmsfch)) )
      {
         addWhere(sWhereString, "(T1.MMSFch >= ?)");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Mantenimientomaquina_tmmovstwwds_7_tfmmsprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV78Mantenimientomaquina_tmmovstwwds_6_tfmmsprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Mantenimientomaquina_tmmovstwwds_7_tfmmsprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvNom = ?)");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! (0==AV80Mantenimientomaquina_tmmovstwwds_8_tfmmsprvnum) )
      {
         addWhere(sWhereString, "(T1.MMSPrvNum >= ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( ! (0==AV81Mantenimientomaquina_tmmovstwwds_9_tfmmsprvnum_to) )
      {
         addWhere(sWhereString, "(T1.MMSPrvNum <= ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Mantenimientomaquina_tmmovstwwds_10_tfmmsdto)==0) )
      {
         addWhere(sWhereString, "(T1.MMSDto >= ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Mantenimientomaquina_tmmovstwwds_11_tfmmsdto_to)==0) )
      {
         addWhere(sWhereString, "(T1.MMSDto <= ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Mantenimientomaquina_tmmovstwwds_13_tfmmsnroext_sel)==0) && ( ! (GXutil.strcmp("", AV84Mantenimientomaquina_tmmovstwwds_12_tfmmsnroext)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MMSNroExt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Mantenimientomaquina_tmmovstwwds_13_tfmmsnroext_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MMSNroExt = ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Mantenimientomaquina_tmmovstwwds_15_tfmmsusucre_sel)==0) && ( ! (GXutil.strcmp("", AV86Mantenimientomaquina_tmmovstwwds_14_tfmmsusucre)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MMSUsuCre) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Mantenimientomaquina_tmmovstwwds_15_tfmmsusucre_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MMSUsuCre = ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV88Mantenimientomaquina_tmmovstwwds_16_tfmmsfchcre) )
      {
         addWhere(sWhereString, "(T1.MMSFchCre >= ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV89Mantenimientomaquina_tmmovstwwds_17_tfmmsfchapl) )
      {
         addWhere(sWhereString, "(T1.MMSFchApl >= ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( AV90Mantenimientomaquina_tmmovstwwds_18_tfmmsest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV90Mantenimientomaquina_tmmovstwwds_18_tfmmsest_sels, "T1.MMSEst IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.MMSUsuCre" ;
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
                  return conditional_P08DQ2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (java.util.Date)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.util.Date)dynConstraints[18] , (java.util.Date)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , (java.util.Date)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , (java.math.BigDecimal)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (java.util.Date)dynConstraints[28] , (java.util.Date)dynConstraints[29] , (String)dynConstraints[30] );
            case 1 :
                  return conditional_P08DQ3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (java.util.Date)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.util.Date)dynConstraints[18] , (java.util.Date)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , (java.util.Date)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , (java.math.BigDecimal)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (java.util.Date)dynConstraints[28] , (java.util.Date)dynConstraints[29] , (String)dynConstraints[30] );
            case 2 :
                  return conditional_P08DQ4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (java.util.Date)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.util.Date)dynConstraints[18] , (java.util.Date)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , (java.util.Date)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , (java.math.BigDecimal)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (java.util.Date)dynConstraints[28] , (java.util.Date)dynConstraints[29] , (String)dynConstraints[30] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08DQ2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08DQ3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08DQ4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 10);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 20);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(10);
               ((String[]) buf[18])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 10);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(10);
               ((String[]) buf[18])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 20);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(10);
               ((String[]) buf[18])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(12, 1);
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
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[17]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[22], 2);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[23], 2);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 20);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 20);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 10);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 10);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[28], false);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[29], false);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[17]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[22], 2);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[23], 2);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 20);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 20);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 10);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 10);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[28], false);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[29], false);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[17]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[22], 2);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[23], 2);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 20);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 20);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 10);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 10);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[28], false);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[29], false);
               }
               return;
      }
   }

}

