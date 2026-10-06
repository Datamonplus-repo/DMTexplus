package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wcdetallepiezasgetfilterdata extends GXProcedure
{
   public wcdetallepiezasgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcdetallepiezasgetfilterdata.class ), "" );
   }

   public wcdetallepiezasgetfilterdata( int remoteHandle ,
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
      wcdetallepiezasgetfilterdata.this.aP5 = new String[] {""};
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
      wcdetallepiezasgetfilterdata.this.AV22DDOName = aP0;
      wcdetallepiezasgetfilterdata.this.AV20SearchTxt = aP1;
      wcdetallepiezasgetfilterdata.this.AV21SearchTxtTo = aP2;
      wcdetallepiezasgetfilterdata.this.aP3 = aP3;
      wcdetallepiezasgetfilterdata.this.aP4 = aP4;
      wcdetallepiezasgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV25Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV28OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV30OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV22DDOName), "DDO_ALBRECPIE") == 0 )
      {
         /* Execute user subroutine: 'LOADALBRECPIEOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV22DDOName), "DDO_ALBRECOBS") == 0 )
      {
         /* Execute user subroutine: 'LOADALBRECOBSOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV26OptionsJson = AV25Options.toJSonString(false) ;
      AV29OptionsDescJson = AV28OptionsDesc.toJSonString(false) ;
      AV31OptionIndexesJson = AV30OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV33Session.getValue("WCDetallePiezasGridState"), "") == 0 )
      {
         AV35GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCDetallePiezasGridState"), null, null);
      }
      else
      {
         AV35GridState.fromxml(AV33Session.getValue("WCDetallePiezasGridState"), null, null);
      }
      AV47GXV1 = 1 ;
      while ( AV47GXV1 <= AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV36GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV47GXV1));
         if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV44FilterFullText = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "ALBRECPIE") == 0 )
         {
            AV38AlbRecPie = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV43AlbRecPieOperator = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Operator() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRECPIE") == 0 )
         {
            AV10TFAlbRecPie = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRECPIE_SEL") == 0 )
         {
            AV11TFAlbRecPie_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRECKGM") == 0 )
         {
            AV12TFAlbRecKgm = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV13TFAlbRecKgm_To = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRECKGMU") == 0 )
         {
            AV14TFAlbRecKgmU = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV15TFAlbRecKgmU_To = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRECMTR") == 0 )
         {
            AV16TFAlbRecMtr = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV17TFAlbRecMtr_To = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRECMTRU") == 0 )
         {
            AV18TFAlbRecMtrU = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV19TFAlbRecMtrU_To = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRECOBS") == 0 )
         {
            AV41TFAlbRecObs = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRECOBS_SEL") == 0 )
         {
            AV42TFAlbRecObs_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV39Emprcod = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBRECCOD") == 0 )
         {
            AV40AlbRecCod = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV47GXV1 = (int)(AV47GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADALBRECPIEOPTIONS' Routine */
      returnInSub = false ;
      AV10TFAlbRecPie = AV20SearchTxt ;
      AV11TFAlbRecPie_Sel = "" ;
      AV49Wcdetallepiezasds_1_emprcod = AV39Emprcod ;
      AV50Wcdetallepiezasds_2_albreccod = AV40AlbRecCod ;
      AV51Wcdetallepiezasds_3_filterfulltext = AV44FilterFullText ;
      AV52Wcdetallepiezasds_4_albrecpie = AV38AlbRecPie ;
      AV53Wcdetallepiezasds_5_tfalbrecpie = AV10TFAlbRecPie ;
      AV54Wcdetallepiezasds_6_tfalbrecpie_sel = AV11TFAlbRecPie_Sel ;
      AV55Wcdetallepiezasds_7_tfalbreckgm = AV12TFAlbRecKgm ;
      AV56Wcdetallepiezasds_8_tfalbreckgm_to = AV13TFAlbRecKgm_To ;
      AV57Wcdetallepiezasds_9_tfalbreckgmu = AV14TFAlbRecKgmU ;
      AV58Wcdetallepiezasds_10_tfalbreckgmu_to = AV15TFAlbRecKgmU_To ;
      AV59Wcdetallepiezasds_11_tfalbrecmtr = AV16TFAlbRecMtr ;
      AV60Wcdetallepiezasds_12_tfalbrecmtr_to = AV17TFAlbRecMtr_To ;
      AV61Wcdetallepiezasds_13_tfalbrecmtru = AV18TFAlbRecMtrU ;
      AV62Wcdetallepiezasds_14_tfalbrecmtru_to = AV19TFAlbRecMtrU_To ;
      AV63Wcdetallepiezasds_15_tfalbrecobs = AV41TFAlbRecObs ;
      AV64Wcdetallepiezasds_16_tfalbrecobs_sel = AV42TFAlbRecObs_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Short.valueOf(AV43AlbRecPieOperator) ,
                                           AV52Wcdetallepiezasds_4_albrecpie ,
                                           AV54Wcdetallepiezasds_6_tfalbrecpie_sel ,
                                           AV53Wcdetallepiezasds_5_tfalbrecpie ,
                                           AV55Wcdetallepiezasds_7_tfalbreckgm ,
                                           AV56Wcdetallepiezasds_8_tfalbreckgm_to ,
                                           AV57Wcdetallepiezasds_9_tfalbreckgmu ,
                                           AV58Wcdetallepiezasds_10_tfalbreckgmu_to ,
                                           AV59Wcdetallepiezasds_11_tfalbrecmtr ,
                                           AV60Wcdetallepiezasds_12_tfalbrecmtr_to ,
                                           AV61Wcdetallepiezasds_13_tfalbrecmtru ,
                                           AV62Wcdetallepiezasds_14_tfalbrecmtru_to ,
                                           A2159AlbRecPie ,
                                           A2155AlbRecKgm ,
                                           A2156AlbRecKgmU ,
                                           A2157AlbRecMtr ,
                                           A2158AlbRecMtrU ,
                                           AV51Wcdetallepiezasds_3_filterfulltext ,
                                           A13693AlbRecObs ,
                                           AV64Wcdetallepiezasds_16_tfalbrecobs_sel ,
                                           AV63Wcdetallepiezasds_15_tfalbrecobs ,
                                           AV49Wcdetallepiezasds_1_emprcod ,
                                           Integer.valueOf(AV50Wcdetallepiezasds_2_albreccod) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A44AlbRecCod) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV51Wcdetallepiezasds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Wcdetallepiezasds_3_filterfulltext), "%", "") ;
      lV51Wcdetallepiezasds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Wcdetallepiezasds_3_filterfulltext), "%", "") ;
      lV51Wcdetallepiezasds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Wcdetallepiezasds_3_filterfulltext), "%", "") ;
      lV51Wcdetallepiezasds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Wcdetallepiezasds_3_filterfulltext), "%", "") ;
      lV51Wcdetallepiezasds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Wcdetallepiezasds_3_filterfulltext), "%", "") ;
      lV51Wcdetallepiezasds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Wcdetallepiezasds_3_filterfulltext), "%", "") ;
      lV63Wcdetallepiezasds_15_tfalbrecobs = GXutil.padr( GXutil.rtrim( AV63Wcdetallepiezasds_15_tfalbrecobs), 80, "%") ;
      /* Using cursor P08C42 */
      pr_default.execute(0, new Object[] {AV49Wcdetallepiezasds_1_emprcod, Integer.valueOf(AV50Wcdetallepiezasds_2_albreccod), AV51Wcdetallepiezasds_3_filterfulltext, A2159AlbRecPie, lV51Wcdetallepiezasds_3_filterfulltext, A2155AlbRecKgm, lV51Wcdetallepiezasds_3_filterfulltext, A2156AlbRecKgmU, lV51Wcdetallepiezasds_3_filterfulltext, A2157AlbRecMtr, lV51Wcdetallepiezasds_3_filterfulltext, A2158AlbRecMtrU, lV51Wcdetallepiezasds_3_filterfulltext, A13693AlbRecObs, lV51Wcdetallepiezasds_3_filterfulltext, AV64Wcdetallepiezasds_16_tfalbrecobs_sel, AV63Wcdetallepiezasds_15_tfalbrecobs, A13693AlbRecObs, lV63Wcdetallepiezasds_15_tfalbrecobs, AV64Wcdetallepiezasds_16_tfalbrecobs_sel, A13693AlbRecObs, AV64Wcdetallepiezasds_16_tfalbrecobs_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8C42 = false ;
         A44AlbRecCod = P08C42_A44AlbRecCod[0] ;
         A396EmprCod = P08C42_A396EmprCod[0] ;
         AV32count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08C42_A396EmprCod[0], A396EmprCod) == 0 ) && ( P08C42_A44AlbRecCod[0] == A44AlbRecCod ) )
         {
            brk8C42 = false ;
            AV32count = (long)(AV32count+1) ;
            brk8C42 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A2159AlbRecPie)==0) )
         {
            AV24Option = A2159AlbRecPie ;
            AV25Options.add(AV24Option, 0);
            AV30OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV25Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8C42 )
         {
            brk8C42 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADALBRECOBSOPTIONS' Routine */
      returnInSub = false ;
      AV41TFAlbRecObs = AV20SearchTxt ;
      AV42TFAlbRecObs_Sel = "" ;
      AV49Wcdetallepiezasds_1_emprcod = AV39Emprcod ;
      AV50Wcdetallepiezasds_2_albreccod = AV40AlbRecCod ;
      AV51Wcdetallepiezasds_3_filterfulltext = AV44FilterFullText ;
      AV52Wcdetallepiezasds_4_albrecpie = AV38AlbRecPie ;
      AV53Wcdetallepiezasds_5_tfalbrecpie = AV10TFAlbRecPie ;
      AV54Wcdetallepiezasds_6_tfalbrecpie_sel = AV11TFAlbRecPie_Sel ;
      AV55Wcdetallepiezasds_7_tfalbreckgm = AV12TFAlbRecKgm ;
      AV56Wcdetallepiezasds_8_tfalbreckgm_to = AV13TFAlbRecKgm_To ;
      AV57Wcdetallepiezasds_9_tfalbreckgmu = AV14TFAlbRecKgmU ;
      AV58Wcdetallepiezasds_10_tfalbreckgmu_to = AV15TFAlbRecKgmU_To ;
      AV59Wcdetallepiezasds_11_tfalbrecmtr = AV16TFAlbRecMtr ;
      AV60Wcdetallepiezasds_12_tfalbrecmtr_to = AV17TFAlbRecMtr_To ;
      AV61Wcdetallepiezasds_13_tfalbrecmtru = AV18TFAlbRecMtrU ;
      AV62Wcdetallepiezasds_14_tfalbrecmtru_to = AV19TFAlbRecMtrU_To ;
      AV63Wcdetallepiezasds_15_tfalbrecobs = AV41TFAlbRecObs ;
      AV64Wcdetallepiezasds_16_tfalbrecobs_sel = AV42TFAlbRecObs_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Short.valueOf(AV43AlbRecPieOperator) ,
                                           AV52Wcdetallepiezasds_4_albrecpie ,
                                           AV54Wcdetallepiezasds_6_tfalbrecpie_sel ,
                                           AV53Wcdetallepiezasds_5_tfalbrecpie ,
                                           AV55Wcdetallepiezasds_7_tfalbreckgm ,
                                           AV56Wcdetallepiezasds_8_tfalbreckgm_to ,
                                           AV57Wcdetallepiezasds_9_tfalbreckgmu ,
                                           AV58Wcdetallepiezasds_10_tfalbreckgmu_to ,
                                           AV59Wcdetallepiezasds_11_tfalbrecmtr ,
                                           AV60Wcdetallepiezasds_12_tfalbrecmtr_to ,
                                           AV61Wcdetallepiezasds_13_tfalbrecmtru ,
                                           AV62Wcdetallepiezasds_14_tfalbrecmtru_to ,
                                           A2159AlbRecPie ,
                                           A2155AlbRecKgm ,
                                           A2156AlbRecKgmU ,
                                           A2157AlbRecMtr ,
                                           A2158AlbRecMtrU ,
                                           AV51Wcdetallepiezasds_3_filterfulltext ,
                                           A13693AlbRecObs ,
                                           AV64Wcdetallepiezasds_16_tfalbrecobs_sel ,
                                           AV63Wcdetallepiezasds_15_tfalbrecobs ,
                                           AV49Wcdetallepiezasds_1_emprcod ,
                                           Integer.valueOf(AV50Wcdetallepiezasds_2_albreccod) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A44AlbRecCod) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV51Wcdetallepiezasds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Wcdetallepiezasds_3_filterfulltext), "%", "") ;
      lV51Wcdetallepiezasds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Wcdetallepiezasds_3_filterfulltext), "%", "") ;
      lV51Wcdetallepiezasds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Wcdetallepiezasds_3_filterfulltext), "%", "") ;
      lV51Wcdetallepiezasds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Wcdetallepiezasds_3_filterfulltext), "%", "") ;
      lV51Wcdetallepiezasds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Wcdetallepiezasds_3_filterfulltext), "%", "") ;
      lV51Wcdetallepiezasds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Wcdetallepiezasds_3_filterfulltext), "%", "") ;
      lV63Wcdetallepiezasds_15_tfalbrecobs = GXutil.padr( GXutil.rtrim( AV63Wcdetallepiezasds_15_tfalbrecobs), 80, "%") ;
      /* Using cursor P08C43 */
      pr_default.execute(1, new Object[] {AV49Wcdetallepiezasds_1_emprcod, Integer.valueOf(AV50Wcdetallepiezasds_2_albreccod), AV51Wcdetallepiezasds_3_filterfulltext, A2159AlbRecPie, lV51Wcdetallepiezasds_3_filterfulltext, A2155AlbRecKgm, lV51Wcdetallepiezasds_3_filterfulltext, A2156AlbRecKgmU, lV51Wcdetallepiezasds_3_filterfulltext, A2157AlbRecMtr, lV51Wcdetallepiezasds_3_filterfulltext, A2158AlbRecMtrU, lV51Wcdetallepiezasds_3_filterfulltext, A13693AlbRecObs, lV51Wcdetallepiezasds_3_filterfulltext, AV64Wcdetallepiezasds_16_tfalbrecobs_sel, AV63Wcdetallepiezasds_15_tfalbrecobs, A13693AlbRecObs, lV63Wcdetallepiezasds_15_tfalbrecobs, AV64Wcdetallepiezasds_16_tfalbrecobs_sel, A13693AlbRecObs, AV64Wcdetallepiezasds_16_tfalbrecobs_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A44AlbRecCod = P08C43_A44AlbRecCod[0] ;
         A396EmprCod = P08C43_A396EmprCod[0] ;
         if ( ! (GXutil.strcmp("", A13693AlbRecObs)==0) )
         {
            AV24Option = A13693AlbRecObs ;
            AV23InsertIndex = 1 ;
            while ( ( AV23InsertIndex <= AV25Options.size() ) && ( GXutil.strcmp((String)AV25Options.elementAt(-1+AV23InsertIndex), AV24Option) < 0 ) )
            {
               AV23InsertIndex = (int)(AV23InsertIndex+1) ;
            }
            if ( ( AV23InsertIndex <= AV25Options.size() ) && ( GXutil.strcmp((String)AV25Options.elementAt(-1+AV23InsertIndex), AV24Option) == 0 ) )
            {
               AV32count = GXutil.lval( (String)AV30OptionIndexes.elementAt(-1+AV23InsertIndex)) ;
               AV32count = (long)(AV32count+1) ;
               AV30OptionIndexes.removeItem(AV23InsertIndex);
               AV30OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), AV23InsertIndex);
            }
            else
            {
               AV25Options.add(AV24Option, AV23InsertIndex);
               AV30OptionIndexes.add("1", AV23InsertIndex);
            }
         }
         if ( AV25Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = wcdetallepiezasgetfilterdata.this.AV26OptionsJson;
      this.aP4[0] = wcdetallepiezasgetfilterdata.this.AV29OptionsDescJson;
      this.aP5[0] = wcdetallepiezasgetfilterdata.this.AV31OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV26OptionsJson = "" ;
      AV29OptionsDescJson = "" ;
      AV31OptionIndexesJson = "" ;
      AV25Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV28OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV30OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV33Session = httpContext.getWebSession();
      AV35GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV36GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV44FilterFullText = "" ;
      AV38AlbRecPie = "" ;
      AV10TFAlbRecPie = "" ;
      AV11TFAlbRecPie_Sel = "" ;
      AV12TFAlbRecKgm = DecimalUtil.ZERO ;
      AV13TFAlbRecKgm_To = DecimalUtil.ZERO ;
      AV14TFAlbRecKgmU = DecimalUtil.ZERO ;
      AV15TFAlbRecKgmU_To = DecimalUtil.ZERO ;
      AV16TFAlbRecMtr = DecimalUtil.ZERO ;
      AV17TFAlbRecMtr_To = DecimalUtil.ZERO ;
      AV18TFAlbRecMtrU = DecimalUtil.ZERO ;
      AV19TFAlbRecMtrU_To = DecimalUtil.ZERO ;
      AV41TFAlbRecObs = "" ;
      AV42TFAlbRecObs_Sel = "" ;
      AV39Emprcod = "" ;
      A2159AlbRecPie = "" ;
      AV49Wcdetallepiezasds_1_emprcod = "" ;
      AV51Wcdetallepiezasds_3_filterfulltext = "" ;
      AV52Wcdetallepiezasds_4_albrecpie = "" ;
      AV53Wcdetallepiezasds_5_tfalbrecpie = "" ;
      AV54Wcdetallepiezasds_6_tfalbrecpie_sel = "" ;
      AV55Wcdetallepiezasds_7_tfalbreckgm = DecimalUtil.ZERO ;
      AV56Wcdetallepiezasds_8_tfalbreckgm_to = DecimalUtil.ZERO ;
      AV57Wcdetallepiezasds_9_tfalbreckgmu = DecimalUtil.ZERO ;
      AV58Wcdetallepiezasds_10_tfalbreckgmu_to = DecimalUtil.ZERO ;
      AV59Wcdetallepiezasds_11_tfalbrecmtr = DecimalUtil.ZERO ;
      AV60Wcdetallepiezasds_12_tfalbrecmtr_to = DecimalUtil.ZERO ;
      AV61Wcdetallepiezasds_13_tfalbrecmtru = DecimalUtil.ZERO ;
      AV62Wcdetallepiezasds_14_tfalbrecmtru_to = DecimalUtil.ZERO ;
      AV63Wcdetallepiezasds_15_tfalbrecobs = "" ;
      AV64Wcdetallepiezasds_16_tfalbrecobs_sel = "" ;
      lV51Wcdetallepiezasds_3_filterfulltext = "" ;
      lV63Wcdetallepiezasds_15_tfalbrecobs = "" ;
      scmdbuf = "" ;
      A2155AlbRecKgm = DecimalUtil.ZERO ;
      A2156AlbRecKgmU = DecimalUtil.ZERO ;
      A2157AlbRecMtr = DecimalUtil.ZERO ;
      A2158AlbRecMtrU = DecimalUtil.ZERO ;
      A13693AlbRecObs = "" ;
      A396EmprCod = "" ;
      P08C42_A44AlbRecCod = new int[1] ;
      P08C42_A396EmprCod = new String[] {""} ;
      AV24Option = "" ;
      P08C43_A44AlbRecCod = new int[1] ;
      P08C43_A396EmprCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcdetallepiezasgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08C42_A44AlbRecCod, P08C42_A396EmprCod
            }
            , new Object[] {
            P08C43_A44AlbRecCod, P08C43_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV43AlbRecPieOperator ;
   private short Gx_err ;
   private int AV47GXV1 ;
   private int AV40AlbRecCod ;
   private int AV50Wcdetallepiezasds_2_albreccod ;
   private int A44AlbRecCod ;
   private int AV23InsertIndex ;
   private long AV32count ;
   private java.math.BigDecimal AV12TFAlbRecKgm ;
   private java.math.BigDecimal AV13TFAlbRecKgm_To ;
   private java.math.BigDecimal AV14TFAlbRecKgmU ;
   private java.math.BigDecimal AV15TFAlbRecKgmU_To ;
   private java.math.BigDecimal AV16TFAlbRecMtr ;
   private java.math.BigDecimal AV17TFAlbRecMtr_To ;
   private java.math.BigDecimal AV18TFAlbRecMtrU ;
   private java.math.BigDecimal AV19TFAlbRecMtrU_To ;
   private java.math.BigDecimal AV55Wcdetallepiezasds_7_tfalbreckgm ;
   private java.math.BigDecimal AV56Wcdetallepiezasds_8_tfalbreckgm_to ;
   private java.math.BigDecimal AV57Wcdetallepiezasds_9_tfalbreckgmu ;
   private java.math.BigDecimal AV58Wcdetallepiezasds_10_tfalbreckgmu_to ;
   private java.math.BigDecimal AV59Wcdetallepiezasds_11_tfalbrecmtr ;
   private java.math.BigDecimal AV60Wcdetallepiezasds_12_tfalbrecmtr_to ;
   private java.math.BigDecimal AV61Wcdetallepiezasds_13_tfalbrecmtru ;
   private java.math.BigDecimal AV62Wcdetallepiezasds_14_tfalbrecmtru_to ;
   private java.math.BigDecimal A2155AlbRecKgm ;
   private java.math.BigDecimal A2156AlbRecKgmU ;
   private java.math.BigDecimal A2157AlbRecMtr ;
   private java.math.BigDecimal A2158AlbRecMtrU ;
   private String AV38AlbRecPie ;
   private String AV10TFAlbRecPie ;
   private String AV11TFAlbRecPie_Sel ;
   private String AV41TFAlbRecObs ;
   private String AV42TFAlbRecObs_Sel ;
   private String AV39Emprcod ;
   private String A2159AlbRecPie ;
   private String AV49Wcdetallepiezasds_1_emprcod ;
   private String AV52Wcdetallepiezasds_4_albrecpie ;
   private String AV53Wcdetallepiezasds_5_tfalbrecpie ;
   private String AV54Wcdetallepiezasds_6_tfalbrecpie_sel ;
   private String AV63Wcdetallepiezasds_15_tfalbrecobs ;
   private String AV64Wcdetallepiezasds_16_tfalbrecobs_sel ;
   private String lV63Wcdetallepiezasds_15_tfalbrecobs ;
   private String scmdbuf ;
   private String A13693AlbRecObs ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk8C42 ;
   private String AV26OptionsJson ;
   private String AV29OptionsDescJson ;
   private String AV31OptionIndexesJson ;
   private String AV22DDOName ;
   private String AV20SearchTxt ;
   private String AV21SearchTxtTo ;
   private String AV44FilterFullText ;
   private String AV51Wcdetallepiezasds_3_filterfulltext ;
   private String lV51Wcdetallepiezasds_3_filterfulltext ;
   private String AV24Option ;
   private com.genexus.webpanels.WebSession AV33Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private int[] P08C42_A44AlbRecCod ;
   private String[] P08C42_A396EmprCod ;
   private int[] P08C43_A44AlbRecCod ;
   private String[] P08C43_A396EmprCod ;
   private GXSimpleCollection<String> AV25Options ;
   private GXSimpleCollection<String> AV28OptionsDesc ;
   private GXSimpleCollection<String> AV30OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV35GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV36GridStateFilterValue ;
}

final  class wcdetallepiezasgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08C42( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV43AlbRecPieOperator ,
                                          String AV52Wcdetallepiezasds_4_albrecpie ,
                                          String AV54Wcdetallepiezasds_6_tfalbrecpie_sel ,
                                          String AV53Wcdetallepiezasds_5_tfalbrecpie ,
                                          java.math.BigDecimal AV55Wcdetallepiezasds_7_tfalbreckgm ,
                                          java.math.BigDecimal AV56Wcdetallepiezasds_8_tfalbreckgm_to ,
                                          java.math.BigDecimal AV57Wcdetallepiezasds_9_tfalbreckgmu ,
                                          java.math.BigDecimal AV58Wcdetallepiezasds_10_tfalbreckgmu_to ,
                                          java.math.BigDecimal AV59Wcdetallepiezasds_11_tfalbrecmtr ,
                                          java.math.BigDecimal AV60Wcdetallepiezasds_12_tfalbrecmtr_to ,
                                          java.math.BigDecimal AV61Wcdetallepiezasds_13_tfalbrecmtru ,
                                          java.math.BigDecimal AV62Wcdetallepiezasds_14_tfalbrecmtru_to ,
                                          String A2159AlbRecPie ,
                                          java.math.BigDecimal A2155AlbRecKgm ,
                                          java.math.BigDecimal A2156AlbRecKgmU ,
                                          java.math.BigDecimal A2157AlbRecMtr ,
                                          java.math.BigDecimal A2158AlbRecMtrU ,
                                          String AV51Wcdetallepiezasds_3_filterfulltext ,
                                          String A13693AlbRecObs ,
                                          String AV64Wcdetallepiezasds_16_tfalbrecobs_sel ,
                                          String AV63Wcdetallepiezasds_15_tfalbrecobs ,
                                          String AV49Wcdetallepiezasds_1_emprcod ,
                                          int AV50Wcdetallepiezasds_2_albreccod ,
                                          String A396EmprCod ,
                                          int A44AlbRecCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[22];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT AlbRecCod, EmprCod FROM TXPALBREC" ;
      addWhere(sWhereString, "(EmprCod = ? and AlbRecCod = ?)");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(?) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(?,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'999990.99'), 2) like '%' || ?) or ( UPPER(?) like '%' || UPPER(?))))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(?) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ? = ?))");
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, AlbRecCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08C43( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV43AlbRecPieOperator ,
                                          String AV52Wcdetallepiezasds_4_albrecpie ,
                                          String AV54Wcdetallepiezasds_6_tfalbrecpie_sel ,
                                          String AV53Wcdetallepiezasds_5_tfalbrecpie ,
                                          java.math.BigDecimal AV55Wcdetallepiezasds_7_tfalbreckgm ,
                                          java.math.BigDecimal AV56Wcdetallepiezasds_8_tfalbreckgm_to ,
                                          java.math.BigDecimal AV57Wcdetallepiezasds_9_tfalbreckgmu ,
                                          java.math.BigDecimal AV58Wcdetallepiezasds_10_tfalbreckgmu_to ,
                                          java.math.BigDecimal AV59Wcdetallepiezasds_11_tfalbrecmtr ,
                                          java.math.BigDecimal AV60Wcdetallepiezasds_12_tfalbrecmtr_to ,
                                          java.math.BigDecimal AV61Wcdetallepiezasds_13_tfalbrecmtru ,
                                          java.math.BigDecimal AV62Wcdetallepiezasds_14_tfalbrecmtru_to ,
                                          String A2159AlbRecPie ,
                                          java.math.BigDecimal A2155AlbRecKgm ,
                                          java.math.BigDecimal A2156AlbRecKgmU ,
                                          java.math.BigDecimal A2157AlbRecMtr ,
                                          java.math.BigDecimal A2158AlbRecMtrU ,
                                          String AV51Wcdetallepiezasds_3_filterfulltext ,
                                          String A13693AlbRecObs ,
                                          String AV64Wcdetallepiezasds_16_tfalbrecobs_sel ,
                                          String AV63Wcdetallepiezasds_15_tfalbrecobs ,
                                          String AV49Wcdetallepiezasds_1_emprcod ,
                                          int AV50Wcdetallepiezasds_2_albreccod ,
                                          String A396EmprCod ,
                                          int A44AlbRecCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[22];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT AlbRecCod, EmprCod FROM TXPALBREC" ;
      addWhere(sWhereString, "(EmprCod = ? and AlbRecCod = ?)");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(?) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(?,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'999990.99'), 2) like '%' || ?) or ( UPPER(?) like '%' || UPPER(?))))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(?) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ? = ?))");
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, AlbRecCod" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
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
                  return conditional_P08C42(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (String)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() );
            case 1 :
                  return conditional_P08C43(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (String)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08C42", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08C43", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
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
                  stmt.setString(sIdx, (String)parms[22], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 9);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[27], 2);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 2);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 2);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[33], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 80);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 80);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 80);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 80);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 80);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 80);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 80);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 80);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 9);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[27], 2);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 2);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 2);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[33], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 80);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 80);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 80);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 80);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 80);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 80);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 80);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 80);
               }
               return;
      }
   }

}

