package app.albaranes ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class albaranguiatextolibre__wwgetfilterdata extends GXProcedure
{
   public albaranguiatextolibre__wwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( albaranguiatextolibre__wwgetfilterdata.class ), "" );
   }

   public albaranguiatextolibre__wwgetfilterdata( int remoteHandle ,
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
      albaranguiatextolibre__wwgetfilterdata.this.aP5 = new String[] {""};
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
      albaranguiatextolibre__wwgetfilterdata.this.AV40DDOName = aP0;
      albaranguiatextolibre__wwgetfilterdata.this.AV41SearchTxt = aP1;
      albaranguiatextolibre__wwgetfilterdata.this.AV42SearchTxtTo = aP2;
      albaranguiatextolibre__wwgetfilterdata.this.aP3 = aP3;
      albaranguiatextolibre__wwgetfilterdata.this.aP4 = aP4;
      albaranguiatextolibre__wwgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV40DDOName), "DDO_ALBHDRTXT") == 0 )
      {
         /* Execute user subroutine: 'LOADALBHDRTXTOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV40DDOName), "DDO_ALBHDRTIP") == 0 )
      {
         /* Execute user subroutine: 'LOADALBHDRTIPOPTIONS' */
         S131 ();
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
      if ( GXutil.strcmp(AV35Session.getValue("Albaranes.AlbaranGuiaTextoLibre__WWGridState"), "") == 0 )
      {
         AV37GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Albaranes.AlbaranGuiaTextoLibre__WWGridState"), null, null);
      }
      else
      {
         AV37GridState.fromxml(AV35Session.getValue("Albaranes.AlbaranGuiaTextoLibre__WWGridState"), null, null);
      }
      AV49GXV1 = 1 ;
      while ( AV49GXV1 <= AV37GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV38GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV37GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV49GXV1));
         if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV46FilterFullText = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBHDRULIN") == 0 )
         {
            AV10TFAlbHdrUlin = (short)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFAlbHdrUlin_To = (short)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBHDRTXT") == 0 )
         {
            AV12TFAlbHdrTxt = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBHDRTXT_SEL") == 0 )
         {
            AV13TFAlbHdrTxt_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBHDRRD") == 0 )
         {
            AV14TFAlbHdrRD = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV15TFAlbHdrRD_To = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBHDRPKG") == 0 )
         {
            AV16TFAlbHdrPKg = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV17TFAlbHdrPKg_To = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBHDRKGS") == 0 )
         {
            AV18TFAlbHdrKgs = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV19TFAlbHdrKgs_To = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBHDRPMT") == 0 )
         {
            AV20TFAlbHdrPMt = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV21TFAlbHdrPMt_To = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBHDRMTS") == 0 )
         {
            AV22TFALbHdrMts = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV23TFALbHdrMts_To = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBHDRIMP") == 0 )
         {
            AV24TFALbHdrImp = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV25TFALbHdrImp_To = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBHDRTIP") == 0 )
         {
            AV26TFAlbHdrTip = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBHDRTIP_SEL") == 0 )
         {
            AV27TFAlbHdrTip_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV49GXV1 = (int)(AV49GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADALBHDRTXTOPTIONS' Routine */
      returnInSub = false ;
      AV12TFAlbHdrTxt = AV41SearchTxt ;
      AV13TFAlbHdrTxt_Sel = "" ;
      AV51Albaranes_albaranguiatextolibre__wwds_1_filterfulltext = AV46FilterFullText ;
      AV52Albaranes_albaranguiatextolibre__wwds_2_tfalbhdrulin = AV10TFAlbHdrUlin ;
      AV53Albaranes_albaranguiatextolibre__wwds_3_tfalbhdrulin_to = AV11TFAlbHdrUlin_To ;
      AV54Albaranes_albaranguiatextolibre__wwds_4_tfalbhdrtxt = AV12TFAlbHdrTxt ;
      AV55Albaranes_albaranguiatextolibre__wwds_5_tfalbhdrtxt_sel = AV13TFAlbHdrTxt_Sel ;
      AV56Albaranes_albaranguiatextolibre__wwds_6_tfalbhdrrd = AV14TFAlbHdrRD ;
      AV57Albaranes_albaranguiatextolibre__wwds_7_tfalbhdrrd_to = AV15TFAlbHdrRD_To ;
      AV58Albaranes_albaranguiatextolibre__wwds_8_tfalbhdrpkg = AV16TFAlbHdrPKg ;
      AV59Albaranes_albaranguiatextolibre__wwds_9_tfalbhdrpkg_to = AV17TFAlbHdrPKg_To ;
      AV60Albaranes_albaranguiatextolibre__wwds_10_tfalbhdrkgs = AV18TFAlbHdrKgs ;
      AV61Albaranes_albaranguiatextolibre__wwds_11_tfalbhdrkgs_to = AV19TFAlbHdrKgs_To ;
      AV62Albaranes_albaranguiatextolibre__wwds_12_tfalbhdrpmt = AV20TFAlbHdrPMt ;
      AV63Albaranes_albaranguiatextolibre__wwds_13_tfalbhdrpmt_to = AV21TFAlbHdrPMt_To ;
      AV64Albaranes_albaranguiatextolibre__wwds_14_tfalbhdrmts = AV22TFALbHdrMts ;
      AV65Albaranes_albaranguiatextolibre__wwds_15_tfalbhdrmts_to = AV23TFALbHdrMts_To ;
      AV66Albaranes_albaranguiatextolibre__wwds_16_tfalbhdrimp = AV24TFALbHdrImp ;
      AV67Albaranes_albaranguiatextolibre__wwds_17_tfalbhdrimp_to = AV25TFALbHdrImp_To ;
      AV68Albaranes_albaranguiatextolibre__wwds_18_tfalbhdrtip = AV26TFAlbHdrTip ;
      AV69Albaranes_albaranguiatextolibre__wwds_19_tfalbhdrtip_sel = AV27TFAlbHdrTip_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV51Albaranes_albaranguiatextolibre__wwds_1_filterfulltext ,
                                           Short.valueOf(AV52Albaranes_albaranguiatextolibre__wwds_2_tfalbhdrulin) ,
                                           Short.valueOf(AV53Albaranes_albaranguiatextolibre__wwds_3_tfalbhdrulin_to) ,
                                           AV55Albaranes_albaranguiatextolibre__wwds_5_tfalbhdrtxt_sel ,
                                           AV54Albaranes_albaranguiatextolibre__wwds_4_tfalbhdrtxt ,
                                           AV56Albaranes_albaranguiatextolibre__wwds_6_tfalbhdrrd ,
                                           AV57Albaranes_albaranguiatextolibre__wwds_7_tfalbhdrrd_to ,
                                           AV58Albaranes_albaranguiatextolibre__wwds_8_tfalbhdrpkg ,
                                           AV59Albaranes_albaranguiatextolibre__wwds_9_tfalbhdrpkg_to ,
                                           AV60Albaranes_albaranguiatextolibre__wwds_10_tfalbhdrkgs ,
                                           AV61Albaranes_albaranguiatextolibre__wwds_11_tfalbhdrkgs_to ,
                                           AV62Albaranes_albaranguiatextolibre__wwds_12_tfalbhdrpmt ,
                                           AV63Albaranes_albaranguiatextolibre__wwds_13_tfalbhdrpmt_to ,
                                           AV64Albaranes_albaranguiatextolibre__wwds_14_tfalbhdrmts ,
                                           AV65Albaranes_albaranguiatextolibre__wwds_15_tfalbhdrmts_to ,
                                           AV66Albaranes_albaranguiatextolibre__wwds_16_tfalbhdrimp ,
                                           AV67Albaranes_albaranguiatextolibre__wwds_17_tfalbhdrimp_to ,
                                           AV69Albaranes_albaranguiatextolibre__wwds_19_tfalbhdrtip_sel ,
                                           AV68Albaranes_albaranguiatextolibre__wwds_18_tfalbhdrtip ,
                                           A2765AlbHdrTxt ,
                                           Short.valueOf(A2763AlbHdrUlin) ,
                                           A2766AlbHdrRD ,
                                           A2767AlbHdrPKg ,
                                           A2768AlbHdrKgs ,
                                           A2769AlbHdrPMt ,
                                           A2770ALbHdrMts ,
                                           A2771ALbHdrImp ,
                                           A2772AlbHdrTip } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING
                                           }
      });
      lV51Albaranes_albaranguiatextolibre__wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Albaranes_albaranguiatextolibre__wwds_1_filterfulltext), "%", "") ;
      lV54Albaranes_albaranguiatextolibre__wwds_4_tfalbhdrtxt = GXutil.padr( GXutil.rtrim( AV54Albaranes_albaranguiatextolibre__wwds_4_tfalbhdrtxt), 30, "%") ;
      lV68Albaranes_albaranguiatextolibre__wwds_18_tfalbhdrtip = GXutil.padr( GXutil.rtrim( AV68Albaranes_albaranguiatextolibre__wwds_18_tfalbhdrtip), 1, "%") ;
      /* Using cursor P09V82 */
      pr_default.execute(0, new Object[] {lV51Albaranes_albaranguiatextolibre__wwds_1_filterfulltext, Short.valueOf(AV52Albaranes_albaranguiatextolibre__wwds_2_tfalbhdrulin), Short.valueOf(AV53Albaranes_albaranguiatextolibre__wwds_3_tfalbhdrulin_to), lV54Albaranes_albaranguiatextolibre__wwds_4_tfalbhdrtxt, AV55Albaranes_albaranguiatextolibre__wwds_5_tfalbhdrtxt_sel, AV56Albaranes_albaranguiatextolibre__wwds_6_tfalbhdrrd, AV57Albaranes_albaranguiatextolibre__wwds_7_tfalbhdrrd_to, AV58Albaranes_albaranguiatextolibre__wwds_8_tfalbhdrpkg, AV59Albaranes_albaranguiatextolibre__wwds_9_tfalbhdrpkg_to, AV60Albaranes_albaranguiatextolibre__wwds_10_tfalbhdrkgs, AV61Albaranes_albaranguiatextolibre__wwds_11_tfalbhdrkgs_to, AV62Albaranes_albaranguiatextolibre__wwds_12_tfalbhdrpmt, AV63Albaranes_albaranguiatextolibre__wwds_13_tfalbhdrpmt_to, AV64Albaranes_albaranguiatextolibre__wwds_14_tfalbhdrmts, AV65Albaranes_albaranguiatextolibre__wwds_15_tfalbhdrmts_to, AV66Albaranes_albaranguiatextolibre__wwds_16_tfalbhdrimp, AV67Albaranes_albaranguiatextolibre__wwds_17_tfalbhdrimp_to, lV68Albaranes_albaranguiatextolibre__wwds_18_tfalbhdrtip, AV69Albaranes_albaranguiatextolibre__wwds_19_tfalbhdrtip_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9V82 = false ;
         A396EmprCod = P09V82_A396EmprCod[0] ;
         A30AlbProCod = P09V82_A30AlbProCod[0] ;
         A129BarCod = P09V82_A129BarCod[0] ;
         A132BarCodReo = P09V82_A132BarCodReo[0] ;
         A130BarCodPar = P09V82_A130BarCodPar[0] ;
         A2765AlbHdrTxt = P09V82_A2765AlbHdrTxt[0] ;
         A2772AlbHdrTip = P09V82_A2772AlbHdrTip[0] ;
         A2771ALbHdrImp = P09V82_A2771ALbHdrImp[0] ;
         A2770ALbHdrMts = P09V82_A2770ALbHdrMts[0] ;
         A2769AlbHdrPMt = P09V82_A2769AlbHdrPMt[0] ;
         A2768AlbHdrKgs = P09V82_A2768AlbHdrKgs[0] ;
         A2767AlbHdrPKg = P09V82_A2767AlbHdrPKg[0] ;
         A2766AlbHdrRD = P09V82_A2766AlbHdrRD[0] ;
         A2763AlbHdrUlin = P09V82_A2763AlbHdrUlin[0] ;
         A2764AlbHdrLin = P09V82_A2764AlbHdrLin[0] ;
         A2763AlbHdrUlin = P09V82_A2763AlbHdrUlin[0] ;
         AV34count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09V82_A2765AlbHdrTxt[0], A2765AlbHdrTxt) == 0 ) )
         {
            brk9V82 = false ;
            A396EmprCod = P09V82_A396EmprCod[0] ;
            A30AlbProCod = P09V82_A30AlbProCod[0] ;
            A129BarCod = P09V82_A129BarCod[0] ;
            A132BarCodReo = P09V82_A132BarCodReo[0] ;
            A130BarCodPar = P09V82_A130BarCodPar[0] ;
            A2764AlbHdrLin = P09V82_A2764AlbHdrLin[0] ;
            AV34count = (long)(AV34count+1) ;
            brk9V82 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A2765AlbHdrTxt)==0) )
         {
            AV29Option = A2765AlbHdrTxt ;
            AV30Options.add(AV29Option, 0);
            AV33OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV34count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV30Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9V82 )
         {
            brk9V82 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADALBHDRTIPOPTIONS' Routine */
      returnInSub = false ;
      AV26TFAlbHdrTip = AV41SearchTxt ;
      AV27TFAlbHdrTip_Sel = "" ;
      AV51Albaranes_albaranguiatextolibre__wwds_1_filterfulltext = AV46FilterFullText ;
      AV52Albaranes_albaranguiatextolibre__wwds_2_tfalbhdrulin = AV10TFAlbHdrUlin ;
      AV53Albaranes_albaranguiatextolibre__wwds_3_tfalbhdrulin_to = AV11TFAlbHdrUlin_To ;
      AV54Albaranes_albaranguiatextolibre__wwds_4_tfalbhdrtxt = AV12TFAlbHdrTxt ;
      AV55Albaranes_albaranguiatextolibre__wwds_5_tfalbhdrtxt_sel = AV13TFAlbHdrTxt_Sel ;
      AV56Albaranes_albaranguiatextolibre__wwds_6_tfalbhdrrd = AV14TFAlbHdrRD ;
      AV57Albaranes_albaranguiatextolibre__wwds_7_tfalbhdrrd_to = AV15TFAlbHdrRD_To ;
      AV58Albaranes_albaranguiatextolibre__wwds_8_tfalbhdrpkg = AV16TFAlbHdrPKg ;
      AV59Albaranes_albaranguiatextolibre__wwds_9_tfalbhdrpkg_to = AV17TFAlbHdrPKg_To ;
      AV60Albaranes_albaranguiatextolibre__wwds_10_tfalbhdrkgs = AV18TFAlbHdrKgs ;
      AV61Albaranes_albaranguiatextolibre__wwds_11_tfalbhdrkgs_to = AV19TFAlbHdrKgs_To ;
      AV62Albaranes_albaranguiatextolibre__wwds_12_tfalbhdrpmt = AV20TFAlbHdrPMt ;
      AV63Albaranes_albaranguiatextolibre__wwds_13_tfalbhdrpmt_to = AV21TFAlbHdrPMt_To ;
      AV64Albaranes_albaranguiatextolibre__wwds_14_tfalbhdrmts = AV22TFALbHdrMts ;
      AV65Albaranes_albaranguiatextolibre__wwds_15_tfalbhdrmts_to = AV23TFALbHdrMts_To ;
      AV66Albaranes_albaranguiatextolibre__wwds_16_tfalbhdrimp = AV24TFALbHdrImp ;
      AV67Albaranes_albaranguiatextolibre__wwds_17_tfalbhdrimp_to = AV25TFALbHdrImp_To ;
      AV68Albaranes_albaranguiatextolibre__wwds_18_tfalbhdrtip = AV26TFAlbHdrTip ;
      AV69Albaranes_albaranguiatextolibre__wwds_19_tfalbhdrtip_sel = AV27TFAlbHdrTip_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV51Albaranes_albaranguiatextolibre__wwds_1_filterfulltext ,
                                           Short.valueOf(AV52Albaranes_albaranguiatextolibre__wwds_2_tfalbhdrulin) ,
                                           Short.valueOf(AV53Albaranes_albaranguiatextolibre__wwds_3_tfalbhdrulin_to) ,
                                           AV55Albaranes_albaranguiatextolibre__wwds_5_tfalbhdrtxt_sel ,
                                           AV54Albaranes_albaranguiatextolibre__wwds_4_tfalbhdrtxt ,
                                           AV56Albaranes_albaranguiatextolibre__wwds_6_tfalbhdrrd ,
                                           AV57Albaranes_albaranguiatextolibre__wwds_7_tfalbhdrrd_to ,
                                           AV58Albaranes_albaranguiatextolibre__wwds_8_tfalbhdrpkg ,
                                           AV59Albaranes_albaranguiatextolibre__wwds_9_tfalbhdrpkg_to ,
                                           AV60Albaranes_albaranguiatextolibre__wwds_10_tfalbhdrkgs ,
                                           AV61Albaranes_albaranguiatextolibre__wwds_11_tfalbhdrkgs_to ,
                                           AV62Albaranes_albaranguiatextolibre__wwds_12_tfalbhdrpmt ,
                                           AV63Albaranes_albaranguiatextolibre__wwds_13_tfalbhdrpmt_to ,
                                           AV64Albaranes_albaranguiatextolibre__wwds_14_tfalbhdrmts ,
                                           AV65Albaranes_albaranguiatextolibre__wwds_15_tfalbhdrmts_to ,
                                           AV66Albaranes_albaranguiatextolibre__wwds_16_tfalbhdrimp ,
                                           AV67Albaranes_albaranguiatextolibre__wwds_17_tfalbhdrimp_to ,
                                           AV69Albaranes_albaranguiatextolibre__wwds_19_tfalbhdrtip_sel ,
                                           AV68Albaranes_albaranguiatextolibre__wwds_18_tfalbhdrtip ,
                                           A2765AlbHdrTxt ,
                                           Short.valueOf(A2763AlbHdrUlin) ,
                                           A2766AlbHdrRD ,
                                           A2767AlbHdrPKg ,
                                           A2768AlbHdrKgs ,
                                           A2769AlbHdrPMt ,
                                           A2770ALbHdrMts ,
                                           A2771ALbHdrImp ,
                                           A2772AlbHdrTip } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING
                                           }
      });
      lV51Albaranes_albaranguiatextolibre__wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Albaranes_albaranguiatextolibre__wwds_1_filterfulltext), "%", "") ;
      lV54Albaranes_albaranguiatextolibre__wwds_4_tfalbhdrtxt = GXutil.padr( GXutil.rtrim( AV54Albaranes_albaranguiatextolibre__wwds_4_tfalbhdrtxt), 30, "%") ;
      lV68Albaranes_albaranguiatextolibre__wwds_18_tfalbhdrtip = GXutil.padr( GXutil.rtrim( AV68Albaranes_albaranguiatextolibre__wwds_18_tfalbhdrtip), 1, "%") ;
      /* Using cursor P09V83 */
      pr_default.execute(1, new Object[] {lV51Albaranes_albaranguiatextolibre__wwds_1_filterfulltext, Short.valueOf(AV52Albaranes_albaranguiatextolibre__wwds_2_tfalbhdrulin), Short.valueOf(AV53Albaranes_albaranguiatextolibre__wwds_3_tfalbhdrulin_to), lV54Albaranes_albaranguiatextolibre__wwds_4_tfalbhdrtxt, AV55Albaranes_albaranguiatextolibre__wwds_5_tfalbhdrtxt_sel, AV56Albaranes_albaranguiatextolibre__wwds_6_tfalbhdrrd, AV57Albaranes_albaranguiatextolibre__wwds_7_tfalbhdrrd_to, AV58Albaranes_albaranguiatextolibre__wwds_8_tfalbhdrpkg, AV59Albaranes_albaranguiatextolibre__wwds_9_tfalbhdrpkg_to, AV60Albaranes_albaranguiatextolibre__wwds_10_tfalbhdrkgs, AV61Albaranes_albaranguiatextolibre__wwds_11_tfalbhdrkgs_to, AV62Albaranes_albaranguiatextolibre__wwds_12_tfalbhdrpmt, AV63Albaranes_albaranguiatextolibre__wwds_13_tfalbhdrpmt_to, AV64Albaranes_albaranguiatextolibre__wwds_14_tfalbhdrmts, AV65Albaranes_albaranguiatextolibre__wwds_15_tfalbhdrmts_to, AV66Albaranes_albaranguiatextolibre__wwds_16_tfalbhdrimp, AV67Albaranes_albaranguiatextolibre__wwds_17_tfalbhdrimp_to, lV68Albaranes_albaranguiatextolibre__wwds_18_tfalbhdrtip, AV69Albaranes_albaranguiatextolibre__wwds_19_tfalbhdrtip_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9V84 = false ;
         A396EmprCod = P09V83_A396EmprCod[0] ;
         A30AlbProCod = P09V83_A30AlbProCod[0] ;
         A129BarCod = P09V83_A129BarCod[0] ;
         A132BarCodReo = P09V83_A132BarCodReo[0] ;
         A130BarCodPar = P09V83_A130BarCodPar[0] ;
         A2772AlbHdrTip = P09V83_A2772AlbHdrTip[0] ;
         A2771ALbHdrImp = P09V83_A2771ALbHdrImp[0] ;
         A2770ALbHdrMts = P09V83_A2770ALbHdrMts[0] ;
         A2769AlbHdrPMt = P09V83_A2769AlbHdrPMt[0] ;
         A2768AlbHdrKgs = P09V83_A2768AlbHdrKgs[0] ;
         A2767AlbHdrPKg = P09V83_A2767AlbHdrPKg[0] ;
         A2766AlbHdrRD = P09V83_A2766AlbHdrRD[0] ;
         A2765AlbHdrTxt = P09V83_A2765AlbHdrTxt[0] ;
         A2763AlbHdrUlin = P09V83_A2763AlbHdrUlin[0] ;
         A2764AlbHdrLin = P09V83_A2764AlbHdrLin[0] ;
         A2763AlbHdrUlin = P09V83_A2763AlbHdrUlin[0] ;
         AV34count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09V83_A2772AlbHdrTip[0], A2772AlbHdrTip) == 0 ) )
         {
            brk9V84 = false ;
            A396EmprCod = P09V83_A396EmprCod[0] ;
            A30AlbProCod = P09V83_A30AlbProCod[0] ;
            A129BarCod = P09V83_A129BarCod[0] ;
            A132BarCodReo = P09V83_A132BarCodReo[0] ;
            A130BarCodPar = P09V83_A130BarCodPar[0] ;
            A2764AlbHdrLin = P09V83_A2764AlbHdrLin[0] ;
            AV34count = (long)(AV34count+1) ;
            brk9V84 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A2772AlbHdrTip)==0) )
         {
            AV29Option = A2772AlbHdrTip ;
            AV30Options.add(AV29Option, 0);
            AV33OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV34count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV30Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9V84 )
         {
            brk9V84 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = albaranguiatextolibre__wwgetfilterdata.this.AV43OptionsJson;
      this.aP4[0] = albaranguiatextolibre__wwgetfilterdata.this.AV44OptionsDescJson;
      this.aP5[0] = albaranguiatextolibre__wwgetfilterdata.this.AV45OptionIndexesJson;
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
      AV46FilterFullText = "" ;
      AV12TFAlbHdrTxt = "" ;
      AV13TFAlbHdrTxt_Sel = "" ;
      AV14TFAlbHdrRD = DecimalUtil.ZERO ;
      AV15TFAlbHdrRD_To = DecimalUtil.ZERO ;
      AV16TFAlbHdrPKg = DecimalUtil.ZERO ;
      AV17TFAlbHdrPKg_To = DecimalUtil.ZERO ;
      AV18TFAlbHdrKgs = DecimalUtil.ZERO ;
      AV19TFAlbHdrKgs_To = DecimalUtil.ZERO ;
      AV20TFAlbHdrPMt = DecimalUtil.ZERO ;
      AV21TFAlbHdrPMt_To = DecimalUtil.ZERO ;
      AV22TFALbHdrMts = DecimalUtil.ZERO ;
      AV23TFALbHdrMts_To = DecimalUtil.ZERO ;
      AV24TFALbHdrImp = DecimalUtil.ZERO ;
      AV25TFALbHdrImp_To = DecimalUtil.ZERO ;
      AV26TFAlbHdrTip = "" ;
      AV27TFAlbHdrTip_Sel = "" ;
      A2765AlbHdrTxt = "" ;
      AV51Albaranes_albaranguiatextolibre__wwds_1_filterfulltext = "" ;
      AV54Albaranes_albaranguiatextolibre__wwds_4_tfalbhdrtxt = "" ;
      AV55Albaranes_albaranguiatextolibre__wwds_5_tfalbhdrtxt_sel = "" ;
      AV56Albaranes_albaranguiatextolibre__wwds_6_tfalbhdrrd = DecimalUtil.ZERO ;
      AV57Albaranes_albaranguiatextolibre__wwds_7_tfalbhdrrd_to = DecimalUtil.ZERO ;
      AV58Albaranes_albaranguiatextolibre__wwds_8_tfalbhdrpkg = DecimalUtil.ZERO ;
      AV59Albaranes_albaranguiatextolibre__wwds_9_tfalbhdrpkg_to = DecimalUtil.ZERO ;
      AV60Albaranes_albaranguiatextolibre__wwds_10_tfalbhdrkgs = DecimalUtil.ZERO ;
      AV61Albaranes_albaranguiatextolibre__wwds_11_tfalbhdrkgs_to = DecimalUtil.ZERO ;
      AV62Albaranes_albaranguiatextolibre__wwds_12_tfalbhdrpmt = DecimalUtil.ZERO ;
      AV63Albaranes_albaranguiatextolibre__wwds_13_tfalbhdrpmt_to = DecimalUtil.ZERO ;
      AV64Albaranes_albaranguiatextolibre__wwds_14_tfalbhdrmts = DecimalUtil.ZERO ;
      AV65Albaranes_albaranguiatextolibre__wwds_15_tfalbhdrmts_to = DecimalUtil.ZERO ;
      AV66Albaranes_albaranguiatextolibre__wwds_16_tfalbhdrimp = DecimalUtil.ZERO ;
      AV67Albaranes_albaranguiatextolibre__wwds_17_tfalbhdrimp_to = DecimalUtil.ZERO ;
      AV68Albaranes_albaranguiatextolibre__wwds_18_tfalbhdrtip = "" ;
      AV69Albaranes_albaranguiatextolibre__wwds_19_tfalbhdrtip_sel = "" ;
      scmdbuf = "" ;
      lV51Albaranes_albaranguiatextolibre__wwds_1_filterfulltext = "" ;
      lV54Albaranes_albaranguiatextolibre__wwds_4_tfalbhdrtxt = "" ;
      lV68Albaranes_albaranguiatextolibre__wwds_18_tfalbhdrtip = "" ;
      A2766AlbHdrRD = DecimalUtil.ZERO ;
      A2767AlbHdrPKg = DecimalUtil.ZERO ;
      A2768AlbHdrKgs = DecimalUtil.ZERO ;
      A2769AlbHdrPMt = DecimalUtil.ZERO ;
      A2770ALbHdrMts = DecimalUtil.ZERO ;
      A2771ALbHdrImp = DecimalUtil.ZERO ;
      A2772AlbHdrTip = "" ;
      P09V82_A396EmprCod = new String[] {""} ;
      P09V82_A30AlbProCod = new long[1] ;
      P09V82_A129BarCod = new int[1] ;
      P09V82_A132BarCodReo = new byte[1] ;
      P09V82_A130BarCodPar = new String[] {""} ;
      P09V82_A2765AlbHdrTxt = new String[] {""} ;
      P09V82_A2772AlbHdrTip = new String[] {""} ;
      P09V82_A2771ALbHdrImp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09V82_A2770ALbHdrMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09V82_A2769AlbHdrPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09V82_A2768AlbHdrKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09V82_A2767AlbHdrPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09V82_A2766AlbHdrRD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09V82_A2763AlbHdrUlin = new short[1] ;
      P09V82_A2764AlbHdrLin = new short[1] ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      AV29Option = "" ;
      P09V83_A396EmprCod = new String[] {""} ;
      P09V83_A30AlbProCod = new long[1] ;
      P09V83_A129BarCod = new int[1] ;
      P09V83_A132BarCodReo = new byte[1] ;
      P09V83_A130BarCodPar = new String[] {""} ;
      P09V83_A2772AlbHdrTip = new String[] {""} ;
      P09V83_A2771ALbHdrImp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09V83_A2770ALbHdrMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09V83_A2769AlbHdrPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09V83_A2768AlbHdrKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09V83_A2767AlbHdrPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09V83_A2766AlbHdrRD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09V83_A2765AlbHdrTxt = new String[] {""} ;
      P09V83_A2763AlbHdrUlin = new short[1] ;
      P09V83_A2764AlbHdrLin = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.albaranes.albaranguiatextolibre__wwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09V82_A396EmprCod, P09V82_A30AlbProCod, P09V82_A129BarCod, P09V82_A132BarCodReo, P09V82_A130BarCodPar, P09V82_A2765AlbHdrTxt, P09V82_A2772AlbHdrTip, P09V82_A2771ALbHdrImp, P09V82_A2770ALbHdrMts, P09V82_A2769AlbHdrPMt,
            P09V82_A2768AlbHdrKgs, P09V82_A2767AlbHdrPKg, P09V82_A2766AlbHdrRD, P09V82_A2763AlbHdrUlin, P09V82_A2764AlbHdrLin
            }
            , new Object[] {
            P09V83_A396EmprCod, P09V83_A30AlbProCod, P09V83_A129BarCod, P09V83_A132BarCodReo, P09V83_A130BarCodPar, P09V83_A2772AlbHdrTip, P09V83_A2771ALbHdrImp, P09V83_A2770ALbHdrMts, P09V83_A2769AlbHdrPMt, P09V83_A2768AlbHdrKgs,
            P09V83_A2767AlbHdrPKg, P09V83_A2766AlbHdrRD, P09V83_A2765AlbHdrTxt, P09V83_A2763AlbHdrUlin, P09V83_A2764AlbHdrLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short AV10TFAlbHdrUlin ;
   private short AV11TFAlbHdrUlin_To ;
   private short AV52Albaranes_albaranguiatextolibre__wwds_2_tfalbhdrulin ;
   private short AV53Albaranes_albaranguiatextolibre__wwds_3_tfalbhdrulin_to ;
   private short A2763AlbHdrUlin ;
   private short A2764AlbHdrLin ;
   private short Gx_err ;
   private int AV49GXV1 ;
   private int A129BarCod ;
   private long A30AlbProCod ;
   private long AV34count ;
   private java.math.BigDecimal AV14TFAlbHdrRD ;
   private java.math.BigDecimal AV15TFAlbHdrRD_To ;
   private java.math.BigDecimal AV16TFAlbHdrPKg ;
   private java.math.BigDecimal AV17TFAlbHdrPKg_To ;
   private java.math.BigDecimal AV18TFAlbHdrKgs ;
   private java.math.BigDecimal AV19TFAlbHdrKgs_To ;
   private java.math.BigDecimal AV20TFAlbHdrPMt ;
   private java.math.BigDecimal AV21TFAlbHdrPMt_To ;
   private java.math.BigDecimal AV22TFALbHdrMts ;
   private java.math.BigDecimal AV23TFALbHdrMts_To ;
   private java.math.BigDecimal AV24TFALbHdrImp ;
   private java.math.BigDecimal AV25TFALbHdrImp_To ;
   private java.math.BigDecimal AV56Albaranes_albaranguiatextolibre__wwds_6_tfalbhdrrd ;
   private java.math.BigDecimal AV57Albaranes_albaranguiatextolibre__wwds_7_tfalbhdrrd_to ;
   private java.math.BigDecimal AV58Albaranes_albaranguiatextolibre__wwds_8_tfalbhdrpkg ;
   private java.math.BigDecimal AV59Albaranes_albaranguiatextolibre__wwds_9_tfalbhdrpkg_to ;
   private java.math.BigDecimal AV60Albaranes_albaranguiatextolibre__wwds_10_tfalbhdrkgs ;
   private java.math.BigDecimal AV61Albaranes_albaranguiatextolibre__wwds_11_tfalbhdrkgs_to ;
   private java.math.BigDecimal AV62Albaranes_albaranguiatextolibre__wwds_12_tfalbhdrpmt ;
   private java.math.BigDecimal AV63Albaranes_albaranguiatextolibre__wwds_13_tfalbhdrpmt_to ;
   private java.math.BigDecimal AV64Albaranes_albaranguiatextolibre__wwds_14_tfalbhdrmts ;
   private java.math.BigDecimal AV65Albaranes_albaranguiatextolibre__wwds_15_tfalbhdrmts_to ;
   private java.math.BigDecimal AV66Albaranes_albaranguiatextolibre__wwds_16_tfalbhdrimp ;
   private java.math.BigDecimal AV67Albaranes_albaranguiatextolibre__wwds_17_tfalbhdrimp_to ;
   private java.math.BigDecimal A2766AlbHdrRD ;
   private java.math.BigDecimal A2767AlbHdrPKg ;
   private java.math.BigDecimal A2768AlbHdrKgs ;
   private java.math.BigDecimal A2769AlbHdrPMt ;
   private java.math.BigDecimal A2770ALbHdrMts ;
   private java.math.BigDecimal A2771ALbHdrImp ;
   private String AV12TFAlbHdrTxt ;
   private String AV13TFAlbHdrTxt_Sel ;
   private String AV26TFAlbHdrTip ;
   private String AV27TFAlbHdrTip_Sel ;
   private String A2765AlbHdrTxt ;
   private String AV54Albaranes_albaranguiatextolibre__wwds_4_tfalbhdrtxt ;
   private String AV55Albaranes_albaranguiatextolibre__wwds_5_tfalbhdrtxt_sel ;
   private String AV68Albaranes_albaranguiatextolibre__wwds_18_tfalbhdrtip ;
   private String AV69Albaranes_albaranguiatextolibre__wwds_19_tfalbhdrtip_sel ;
   private String scmdbuf ;
   private String lV54Albaranes_albaranguiatextolibre__wwds_4_tfalbhdrtxt ;
   private String lV68Albaranes_albaranguiatextolibre__wwds_18_tfalbhdrtip ;
   private String A2772AlbHdrTip ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private boolean returnInSub ;
   private boolean brk9V82 ;
   private boolean brk9V84 ;
   private String AV43OptionsJson ;
   private String AV44OptionsDescJson ;
   private String AV45OptionIndexesJson ;
   private String AV40DDOName ;
   private String AV41SearchTxt ;
   private String AV42SearchTxtTo ;
   private String AV46FilterFullText ;
   private String AV51Albaranes_albaranguiatextolibre__wwds_1_filterfulltext ;
   private String lV51Albaranes_albaranguiatextolibre__wwds_1_filterfulltext ;
   private String AV29Option ;
   private com.genexus.webpanels.WebSession AV35Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09V82_A396EmprCod ;
   private long[] P09V82_A30AlbProCod ;
   private int[] P09V82_A129BarCod ;
   private byte[] P09V82_A132BarCodReo ;
   private String[] P09V82_A130BarCodPar ;
   private String[] P09V82_A2765AlbHdrTxt ;
   private String[] P09V82_A2772AlbHdrTip ;
   private java.math.BigDecimal[] P09V82_A2771ALbHdrImp ;
   private java.math.BigDecimal[] P09V82_A2770ALbHdrMts ;
   private java.math.BigDecimal[] P09V82_A2769AlbHdrPMt ;
   private java.math.BigDecimal[] P09V82_A2768AlbHdrKgs ;
   private java.math.BigDecimal[] P09V82_A2767AlbHdrPKg ;
   private java.math.BigDecimal[] P09V82_A2766AlbHdrRD ;
   private short[] P09V82_A2763AlbHdrUlin ;
   private short[] P09V82_A2764AlbHdrLin ;
   private String[] P09V83_A396EmprCod ;
   private long[] P09V83_A30AlbProCod ;
   private int[] P09V83_A129BarCod ;
   private byte[] P09V83_A132BarCodReo ;
   private String[] P09V83_A130BarCodPar ;
   private String[] P09V83_A2772AlbHdrTip ;
   private java.math.BigDecimal[] P09V83_A2771ALbHdrImp ;
   private java.math.BigDecimal[] P09V83_A2770ALbHdrMts ;
   private java.math.BigDecimal[] P09V83_A2769AlbHdrPMt ;
   private java.math.BigDecimal[] P09V83_A2768AlbHdrKgs ;
   private java.math.BigDecimal[] P09V83_A2767AlbHdrPKg ;
   private java.math.BigDecimal[] P09V83_A2766AlbHdrRD ;
   private String[] P09V83_A2765AlbHdrTxt ;
   private short[] P09V83_A2763AlbHdrUlin ;
   private short[] P09V83_A2764AlbHdrLin ;
   private GXSimpleCollection<String> AV30Options ;
   private GXSimpleCollection<String> AV32OptionsDesc ;
   private GXSimpleCollection<String> AV33OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV37GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV38GridStateFilterValue ;
}

final  class albaranguiatextolibre__wwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09V82( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV51Albaranes_albaranguiatextolibre__wwds_1_filterfulltext ,
                                          short AV52Albaranes_albaranguiatextolibre__wwds_2_tfalbhdrulin ,
                                          short AV53Albaranes_albaranguiatextolibre__wwds_3_tfalbhdrulin_to ,
                                          String AV55Albaranes_albaranguiatextolibre__wwds_5_tfalbhdrtxt_sel ,
                                          String AV54Albaranes_albaranguiatextolibre__wwds_4_tfalbhdrtxt ,
                                          java.math.BigDecimal AV56Albaranes_albaranguiatextolibre__wwds_6_tfalbhdrrd ,
                                          java.math.BigDecimal AV57Albaranes_albaranguiatextolibre__wwds_7_tfalbhdrrd_to ,
                                          java.math.BigDecimal AV58Albaranes_albaranguiatextolibre__wwds_8_tfalbhdrpkg ,
                                          java.math.BigDecimal AV59Albaranes_albaranguiatextolibre__wwds_9_tfalbhdrpkg_to ,
                                          java.math.BigDecimal AV60Albaranes_albaranguiatextolibre__wwds_10_tfalbhdrkgs ,
                                          java.math.BigDecimal AV61Albaranes_albaranguiatextolibre__wwds_11_tfalbhdrkgs_to ,
                                          java.math.BigDecimal AV62Albaranes_albaranguiatextolibre__wwds_12_tfalbhdrpmt ,
                                          java.math.BigDecimal AV63Albaranes_albaranguiatextolibre__wwds_13_tfalbhdrpmt_to ,
                                          java.math.BigDecimal AV64Albaranes_albaranguiatextolibre__wwds_14_tfalbhdrmts ,
                                          java.math.BigDecimal AV65Albaranes_albaranguiatextolibre__wwds_15_tfalbhdrmts_to ,
                                          java.math.BigDecimal AV66Albaranes_albaranguiatextolibre__wwds_16_tfalbhdrimp ,
                                          java.math.BigDecimal AV67Albaranes_albaranguiatextolibre__wwds_17_tfalbhdrimp_to ,
                                          String AV69Albaranes_albaranguiatextolibre__wwds_19_tfalbhdrtip_sel ,
                                          String AV68Albaranes_albaranguiatextolibre__wwds_18_tfalbhdrtip ,
                                          String A2765AlbHdrTxt ,
                                          short A2763AlbHdrUlin ,
                                          java.math.BigDecimal A2766AlbHdrRD ,
                                          java.math.BigDecimal A2767AlbHdrPKg ,
                                          java.math.BigDecimal A2768AlbHdrKgs ,
                                          java.math.BigDecimal A2769AlbHdrPMt ,
                                          java.math.BigDecimal A2770ALbHdrMts ,
                                          java.math.BigDecimal A2771ALbHdrImp ,
                                          String A2772AlbHdrTip )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[19];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.AlbHdrTxt, T1.AlbHdrTip, T1.ALbHdrImp, T1.ALbHdrMts, T1.AlbHdrPMt, T1.AlbHdrKgs, T1.AlbHdrPKg," ;
      scmdbuf += " T1.AlbHdrRD, T2.AlbHdrUlin, T1.AlbHdrLin FROM (TXPALBTXT T1 INNER JOIN TXPALBBAR T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbProCod = T1.AlbProCod AND T2.BarCod = T1.BarCod" ;
      scmdbuf += " AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      if ( ! (GXutil.strcmp("", AV51Albaranes_albaranguiatextolibre__wwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.AlbHdrTxt) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( ! (0==AV52Albaranes_albaranguiatextolibre__wwds_2_tfalbhdrulin) )
      {
         addWhere(sWhereString, "(T2.AlbHdrUlin >= ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( ! (0==AV53Albaranes_albaranguiatextolibre__wwds_3_tfalbhdrulin_to) )
      {
         addWhere(sWhereString, "(T2.AlbHdrUlin <= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Albaranes_albaranguiatextolibre__wwds_5_tfalbhdrtxt_sel)==0) && ( ! (GXutil.strcmp("", AV54Albaranes_albaranguiatextolibre__wwds_4_tfalbhdrtxt)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbHdrTxt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Albaranes_albaranguiatextolibre__wwds_5_tfalbhdrtxt_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbHdrTxt = ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV56Albaranes_albaranguiatextolibre__wwds_6_tfalbhdrrd)==0) )
      {
         addWhere(sWhereString, "(T1.AlbHdrRD >= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV57Albaranes_albaranguiatextolibre__wwds_7_tfalbhdrrd_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbHdrRD <= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV58Albaranes_albaranguiatextolibre__wwds_8_tfalbhdrpkg)==0) )
      {
         addWhere(sWhereString, "(T1.AlbHdrPKg >= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV59Albaranes_albaranguiatextolibre__wwds_9_tfalbhdrpkg_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbHdrPKg <= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV60Albaranes_albaranguiatextolibre__wwds_10_tfalbhdrkgs)==0) )
      {
         addWhere(sWhereString, "(T1.AlbHdrKgs >= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV61Albaranes_albaranguiatextolibre__wwds_11_tfalbhdrkgs_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbHdrKgs <= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62Albaranes_albaranguiatextolibre__wwds_12_tfalbhdrpmt)==0) )
      {
         addWhere(sWhereString, "(T1.AlbHdrPMt >= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63Albaranes_albaranguiatextolibre__wwds_13_tfalbhdrpmt_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbHdrPMt <= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64Albaranes_albaranguiatextolibre__wwds_14_tfalbhdrmts)==0) )
      {
         addWhere(sWhereString, "(T1.ALbHdrMts >= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV65Albaranes_albaranguiatextolibre__wwds_15_tfalbhdrmts_to)==0) )
      {
         addWhere(sWhereString, "(T1.ALbHdrMts <= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV66Albaranes_albaranguiatextolibre__wwds_16_tfalbhdrimp)==0) )
      {
         addWhere(sWhereString, "(T1.ALbHdrImp >= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV67Albaranes_albaranguiatextolibre__wwds_17_tfalbhdrimp_to)==0) )
      {
         addWhere(sWhereString, "(T1.ALbHdrImp <= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Albaranes_albaranguiatextolibre__wwds_19_tfalbhdrtip_sel)==0) && ( ! (GXutil.strcmp("", AV68Albaranes_albaranguiatextolibre__wwds_18_tfalbhdrtip)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbHdrTip) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Albaranes_albaranguiatextolibre__wwds_19_tfalbhdrtip_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbHdrTip = ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.AlbHdrTxt" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09V83( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV51Albaranes_albaranguiatextolibre__wwds_1_filterfulltext ,
                                          short AV52Albaranes_albaranguiatextolibre__wwds_2_tfalbhdrulin ,
                                          short AV53Albaranes_albaranguiatextolibre__wwds_3_tfalbhdrulin_to ,
                                          String AV55Albaranes_albaranguiatextolibre__wwds_5_tfalbhdrtxt_sel ,
                                          String AV54Albaranes_albaranguiatextolibre__wwds_4_tfalbhdrtxt ,
                                          java.math.BigDecimal AV56Albaranes_albaranguiatextolibre__wwds_6_tfalbhdrrd ,
                                          java.math.BigDecimal AV57Albaranes_albaranguiatextolibre__wwds_7_tfalbhdrrd_to ,
                                          java.math.BigDecimal AV58Albaranes_albaranguiatextolibre__wwds_8_tfalbhdrpkg ,
                                          java.math.BigDecimal AV59Albaranes_albaranguiatextolibre__wwds_9_tfalbhdrpkg_to ,
                                          java.math.BigDecimal AV60Albaranes_albaranguiatextolibre__wwds_10_tfalbhdrkgs ,
                                          java.math.BigDecimal AV61Albaranes_albaranguiatextolibre__wwds_11_tfalbhdrkgs_to ,
                                          java.math.BigDecimal AV62Albaranes_albaranguiatextolibre__wwds_12_tfalbhdrpmt ,
                                          java.math.BigDecimal AV63Albaranes_albaranguiatextolibre__wwds_13_tfalbhdrpmt_to ,
                                          java.math.BigDecimal AV64Albaranes_albaranguiatextolibre__wwds_14_tfalbhdrmts ,
                                          java.math.BigDecimal AV65Albaranes_albaranguiatextolibre__wwds_15_tfalbhdrmts_to ,
                                          java.math.BigDecimal AV66Albaranes_albaranguiatextolibre__wwds_16_tfalbhdrimp ,
                                          java.math.BigDecimal AV67Albaranes_albaranguiatextolibre__wwds_17_tfalbhdrimp_to ,
                                          String AV69Albaranes_albaranguiatextolibre__wwds_19_tfalbhdrtip_sel ,
                                          String AV68Albaranes_albaranguiatextolibre__wwds_18_tfalbhdrtip ,
                                          String A2765AlbHdrTxt ,
                                          short A2763AlbHdrUlin ,
                                          java.math.BigDecimal A2766AlbHdrRD ,
                                          java.math.BigDecimal A2767AlbHdrPKg ,
                                          java.math.BigDecimal A2768AlbHdrKgs ,
                                          java.math.BigDecimal A2769AlbHdrPMt ,
                                          java.math.BigDecimal A2770ALbHdrMts ,
                                          java.math.BigDecimal A2771ALbHdrImp ,
                                          String A2772AlbHdrTip )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[19];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.AlbHdrTip, T1.ALbHdrImp, T1.ALbHdrMts, T1.AlbHdrPMt, T1.AlbHdrKgs, T1.AlbHdrPKg, T1.AlbHdrRD," ;
      scmdbuf += " T1.AlbHdrTxt, T2.AlbHdrUlin, T1.AlbHdrLin FROM (TXPALBTXT T1 INNER JOIN TXPALBBAR T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbProCod = T1.AlbProCod AND T2.BarCod =" ;
      scmdbuf += " T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      if ( ! (GXutil.strcmp("", AV51Albaranes_albaranguiatextolibre__wwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.AlbHdrTxt) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
      }
      if ( ! (0==AV52Albaranes_albaranguiatextolibre__wwds_2_tfalbhdrulin) )
      {
         addWhere(sWhereString, "(T2.AlbHdrUlin >= ?)");
      }
      else
      {
         GXv_int4[1] = (byte)(1) ;
      }
      if ( ! (0==AV53Albaranes_albaranguiatextolibre__wwds_3_tfalbhdrulin_to) )
      {
         addWhere(sWhereString, "(T2.AlbHdrUlin <= ?)");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Albaranes_albaranguiatextolibre__wwds_5_tfalbhdrtxt_sel)==0) && ( ! (GXutil.strcmp("", AV54Albaranes_albaranguiatextolibre__wwds_4_tfalbhdrtxt)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbHdrTxt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Albaranes_albaranguiatextolibre__wwds_5_tfalbhdrtxt_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbHdrTxt = ?)");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV56Albaranes_albaranguiatextolibre__wwds_6_tfalbhdrrd)==0) )
      {
         addWhere(sWhereString, "(T1.AlbHdrRD >= ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV57Albaranes_albaranguiatextolibre__wwds_7_tfalbhdrrd_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbHdrRD <= ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV58Albaranes_albaranguiatextolibre__wwds_8_tfalbhdrpkg)==0) )
      {
         addWhere(sWhereString, "(T1.AlbHdrPKg >= ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV59Albaranes_albaranguiatextolibre__wwds_9_tfalbhdrpkg_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbHdrPKg <= ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV60Albaranes_albaranguiatextolibre__wwds_10_tfalbhdrkgs)==0) )
      {
         addWhere(sWhereString, "(T1.AlbHdrKgs >= ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV61Albaranes_albaranguiatextolibre__wwds_11_tfalbhdrkgs_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbHdrKgs <= ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62Albaranes_albaranguiatextolibre__wwds_12_tfalbhdrpmt)==0) )
      {
         addWhere(sWhereString, "(T1.AlbHdrPMt >= ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63Albaranes_albaranguiatextolibre__wwds_13_tfalbhdrpmt_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbHdrPMt <= ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64Albaranes_albaranguiatextolibre__wwds_14_tfalbhdrmts)==0) )
      {
         addWhere(sWhereString, "(T1.ALbHdrMts >= ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV65Albaranes_albaranguiatextolibre__wwds_15_tfalbhdrmts_to)==0) )
      {
         addWhere(sWhereString, "(T1.ALbHdrMts <= ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV66Albaranes_albaranguiatextolibre__wwds_16_tfalbhdrimp)==0) )
      {
         addWhere(sWhereString, "(T1.ALbHdrImp >= ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV67Albaranes_albaranguiatextolibre__wwds_17_tfalbhdrimp_to)==0) )
      {
         addWhere(sWhereString, "(T1.ALbHdrImp <= ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Albaranes_albaranguiatextolibre__wwds_19_tfalbhdrtip_sel)==0) && ( ! (GXutil.strcmp("", AV68Albaranes_albaranguiatextolibre__wwds_18_tfalbhdrtip)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbHdrTip) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Albaranes_albaranguiatextolibre__wwds_19_tfalbhdrtip_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbHdrTip = ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.AlbHdrTip" ;
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
                  return conditional_P09V82(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (String)dynConstraints[27] );
            case 1 :
                  return conditional_P09V83(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (String)dynConstraints[27] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09V82", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09V83", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,5);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,5);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,2);
               ((short[]) buf[13])[0] = rslt.getShort(14);
               ((short[]) buf[14])[0] = rslt.getShort(15);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,5);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,5);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,2);
               ((String[]) buf[12])[0] = rslt.getString(13, 30);
               ((short[]) buf[13])[0] = rslt.getShort(14);
               ((short[]) buf[14])[0] = rslt.getShort(15);
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
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[20]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[21]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[24], 2);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[25], 2);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[26], 5);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[27], 5);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 2);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 2);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 5);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 5);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[32], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[33], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 1);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[20]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[21]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[24], 2);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[25], 2);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[26], 5);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[27], 5);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 2);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 2);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 5);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 5);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[32], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[33], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 1);
               }
               return;
      }
   }

}

