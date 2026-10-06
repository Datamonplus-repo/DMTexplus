package app.mantenimientomaquina ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wcrepuestosgetfilterdata extends GXProcedure
{
   public wcrepuestosgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcrepuestosgetfilterdata.class ), "" );
   }

   public wcrepuestosgetfilterdata( int remoteHandle ,
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
      wcrepuestosgetfilterdata.this.aP5 = new String[] {""};
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
      wcrepuestosgetfilterdata.this.AV20DDOName = aP0;
      wcrepuestosgetfilterdata.this.AV18SearchTxt = aP1;
      wcrepuestosgetfilterdata.this.AV19SearchTxtTo = aP2;
      wcrepuestosgetfilterdata.this.aP3 = aP3;
      wcrepuestosgetfilterdata.this.aP4 = aP4;
      wcrepuestosgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV20DDOName), "DDO_MMSRNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADMMSRNOMOPTIONS' */
         S121 ();
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
      if ( GXutil.strcmp(AV31Session.getValue("MantenimientoMaquina.WCRepuestosGridState"), "") == 0 )
      {
         AV33GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "MantenimientoMaquina.WCRepuestosGridState"), null, null);
      }
      else
      {
         AV33GridState.fromxml(AV31Session.getValue("MantenimientoMaquina.WCRepuestosGridState"), null, null);
      }
      AV47GXV1 = 1 ;
      while ( AV47GXV1 <= AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV34GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV47GXV1));
         if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSCOD") == 0 )
         {
            AV39TFMMSCod = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV40TFMMSCod_To = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSRNOM") == 0 )
         {
            AV12TFMMSRNom = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSRNOM_SEL") == 0 )
         {
            AV13TFMMSRNom_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSRCOD") == 0 )
         {
            AV10TFMMSRCod = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFMMSRCod_To = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSRCNT") == 0 )
         {
            AV14TFMMSRCnt = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV15TFMMSRCnt_To = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSRTOT") == 0 )
         {
            AV41TFMMSRTot = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV42TFMMSRTot_To = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSRDTO") == 0 )
         {
            AV43TFMMSRDto = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV44TFMMSRDto_To = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSRPRE") == 0 )
         {
            AV16TFMMSRPre = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV17TFMMSRPre_To = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV37EmprCod = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MMSCOD") == 0 )
         {
            AV38MMSCod = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV47GXV1 = (int)(AV47GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADMMSRNOMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFMMSRNom = AV18SearchTxt ;
      AV13TFMMSRNom_Sel = "" ;
      AV49Mantenimientomaquina_wcrepuestosds_1_emprcod = AV37EmprCod ;
      AV50Mantenimientomaquina_wcrepuestosds_2_mmscod = AV38MMSCod ;
      AV51Mantenimientomaquina_wcrepuestosds_3_tfmmscod = AV39TFMMSCod ;
      AV52Mantenimientomaquina_wcrepuestosds_4_tfmmscod_to = AV40TFMMSCod_To ;
      AV53Mantenimientomaquina_wcrepuestosds_5_tfmmsrnom = AV12TFMMSRNom ;
      AV54Mantenimientomaquina_wcrepuestosds_6_tfmmsrnom_sel = AV13TFMMSRNom_Sel ;
      AV55Mantenimientomaquina_wcrepuestosds_7_tfmmsrcod = AV10TFMMSRCod ;
      AV56Mantenimientomaquina_wcrepuestosds_8_tfmmsrcod_to = AV11TFMMSRCod_To ;
      AV57Mantenimientomaquina_wcrepuestosds_9_tfmmsrcnt = AV14TFMMSRCnt ;
      AV58Mantenimientomaquina_wcrepuestosds_10_tfmmsrcnt_to = AV15TFMMSRCnt_To ;
      AV59Mantenimientomaquina_wcrepuestosds_11_tfmmsrtot = AV41TFMMSRTot ;
      AV60Mantenimientomaquina_wcrepuestosds_12_tfmmsrtot_to = AV42TFMMSRTot_To ;
      AV61Mantenimientomaquina_wcrepuestosds_13_tfmmsrdto = AV43TFMMSRDto ;
      AV62Mantenimientomaquina_wcrepuestosds_14_tfmmsrdto_to = AV44TFMMSRDto_To ;
      AV63Mantenimientomaquina_wcrepuestosds_15_tfmmsrpre = AV16TFMMSRPre ;
      AV64Mantenimientomaquina_wcrepuestosds_16_tfmmsrpre_to = AV17TFMMSRPre_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV51Mantenimientomaquina_wcrepuestosds_3_tfmmscod) ,
                                           Integer.valueOf(AV52Mantenimientomaquina_wcrepuestosds_4_tfmmscod_to) ,
                                           AV54Mantenimientomaquina_wcrepuestosds_6_tfmmsrnom_sel ,
                                           AV53Mantenimientomaquina_wcrepuestosds_5_tfmmsrnom ,
                                           Integer.valueOf(AV55Mantenimientomaquina_wcrepuestosds_7_tfmmsrcod) ,
                                           Integer.valueOf(AV56Mantenimientomaquina_wcrepuestosds_8_tfmmsrcod_to) ,
                                           AV57Mantenimientomaquina_wcrepuestosds_9_tfmmsrcnt ,
                                           AV58Mantenimientomaquina_wcrepuestosds_10_tfmmsrcnt_to ,
                                           AV59Mantenimientomaquina_wcrepuestosds_11_tfmmsrtot ,
                                           AV60Mantenimientomaquina_wcrepuestosds_12_tfmmsrtot_to ,
                                           AV61Mantenimientomaquina_wcrepuestosds_13_tfmmsrdto ,
                                           AV62Mantenimientomaquina_wcrepuestosds_14_tfmmsrdto_to ,
                                           AV63Mantenimientomaquina_wcrepuestosds_15_tfmmsrpre ,
                                           AV64Mantenimientomaquina_wcrepuestosds_16_tfmmsrpre_to ,
                                           Integer.valueOf(A9412MMSCod) ,
                                           A9422MMSRNom ,
                                           Integer.valueOf(A9421MMSRCod) ,
                                           A9409MMSRCnt ,
                                           A11511MMSRTot ,
                                           A11512MMSRDto ,
                                           A9424MMSRPre ,
                                           AV49Mantenimientomaquina_wcrepuestosds_1_emprcod ,
                                           Integer.valueOf(AV50Mantenimientomaquina_wcrepuestosds_2_mmscod) ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING
                                           }
      });
      lV53Mantenimientomaquina_wcrepuestosds_5_tfmmsrnom = GXutil.padr( GXutil.rtrim( AV53Mantenimientomaquina_wcrepuestosds_5_tfmmsrnom), 100, "%") ;
      /* Using cursor P08D52 */
      pr_default.execute(0, new Object[] {AV49Mantenimientomaquina_wcrepuestosds_1_emprcod, Integer.valueOf(AV50Mantenimientomaquina_wcrepuestosds_2_mmscod), Integer.valueOf(AV51Mantenimientomaquina_wcrepuestosds_3_tfmmscod), Integer.valueOf(AV52Mantenimientomaquina_wcrepuestosds_4_tfmmscod_to), lV53Mantenimientomaquina_wcrepuestosds_5_tfmmsrnom, AV54Mantenimientomaquina_wcrepuestosds_6_tfmmsrnom_sel, Integer.valueOf(AV55Mantenimientomaquina_wcrepuestosds_7_tfmmsrcod), Integer.valueOf(AV56Mantenimientomaquina_wcrepuestosds_8_tfmmsrcod_to), AV57Mantenimientomaquina_wcrepuestosds_9_tfmmsrcnt, AV58Mantenimientomaquina_wcrepuestosds_10_tfmmsrcnt_to, AV59Mantenimientomaquina_wcrepuestosds_11_tfmmsrtot, AV60Mantenimientomaquina_wcrepuestosds_12_tfmmsrtot_to, AV61Mantenimientomaquina_wcrepuestosds_13_tfmmsrdto, AV62Mantenimientomaquina_wcrepuestosds_14_tfmmsrdto_to, AV63Mantenimientomaquina_wcrepuestosds_15_tfmmsrpre, AV64Mantenimientomaquina_wcrepuestosds_16_tfmmsrpre_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8D52 = false ;
         A9421MMSRCod = P08D52_A9421MMSRCod[0] ;
         A9412MMSCod = P08D52_A9412MMSCod[0] ;
         A396EmprCod = P08D52_A396EmprCod[0] ;
         A9424MMSRPre = P08D52_A9424MMSRPre[0] ;
         A11512MMSRDto = P08D52_A11512MMSRDto[0] ;
         A11511MMSRTot = P08D52_A11511MMSRTot[0] ;
         A9409MMSRCnt = P08D52_A9409MMSRCnt[0] ;
         A9422MMSRNom = P08D52_A9422MMSRNom[0] ;
         n9422MMSRNom = P08D52_n9422MMSRNom[0] ;
         A9422MMSRNom = P08D52_A9422MMSRNom[0] ;
         n9422MMSRNom = P08D52_n9422MMSRNom[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08D52_A396EmprCod[0], A396EmprCod) == 0 ) && ( P08D52_A9412MMSCod[0] == A9412MMSCod ) && ( P08D52_A9421MMSRCod[0] == A9421MMSRCod ) )
         {
            brk8D52 = false ;
            AV30count = (long)(AV30count+1) ;
            brk8D52 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A9422MMSRNom)==0) )
         {
            AV22Option = A9422MMSRNom ;
            AV21InsertIndex = 1 ;
            while ( ( AV21InsertIndex <= AV23Options.size() ) && ( GXutil.strcmp((String)AV23Options.elementAt(-1+AV21InsertIndex), AV22Option) < 0 ) )
            {
               AV21InsertIndex = (int)(AV21InsertIndex+1) ;
            }
            AV23Options.add(AV22Option, AV21InsertIndex);
            AV28OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), AV21InsertIndex);
         }
         if ( AV23Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8D52 )
         {
            brk8D52 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = wcrepuestosgetfilterdata.this.AV24OptionsJson;
      this.aP4[0] = wcrepuestosgetfilterdata.this.AV27OptionsDescJson;
      this.aP5[0] = wcrepuestosgetfilterdata.this.AV29OptionIndexesJson;
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
      AV12TFMMSRNom = "" ;
      AV13TFMMSRNom_Sel = "" ;
      AV14TFMMSRCnt = DecimalUtil.ZERO ;
      AV15TFMMSRCnt_To = DecimalUtil.ZERO ;
      AV41TFMMSRTot = DecimalUtil.ZERO ;
      AV42TFMMSRTot_To = DecimalUtil.ZERO ;
      AV43TFMMSRDto = DecimalUtil.ZERO ;
      AV44TFMMSRDto_To = DecimalUtil.ZERO ;
      AV16TFMMSRPre = DecimalUtil.ZERO ;
      AV17TFMMSRPre_To = DecimalUtil.ZERO ;
      AV37EmprCod = "" ;
      A9422MMSRNom = "" ;
      AV49Mantenimientomaquina_wcrepuestosds_1_emprcod = "" ;
      AV53Mantenimientomaquina_wcrepuestosds_5_tfmmsrnom = "" ;
      AV54Mantenimientomaquina_wcrepuestosds_6_tfmmsrnom_sel = "" ;
      AV57Mantenimientomaquina_wcrepuestosds_9_tfmmsrcnt = DecimalUtil.ZERO ;
      AV58Mantenimientomaquina_wcrepuestosds_10_tfmmsrcnt_to = DecimalUtil.ZERO ;
      AV59Mantenimientomaquina_wcrepuestosds_11_tfmmsrtot = DecimalUtil.ZERO ;
      AV60Mantenimientomaquina_wcrepuestosds_12_tfmmsrtot_to = DecimalUtil.ZERO ;
      AV61Mantenimientomaquina_wcrepuestosds_13_tfmmsrdto = DecimalUtil.ZERO ;
      AV62Mantenimientomaquina_wcrepuestosds_14_tfmmsrdto_to = DecimalUtil.ZERO ;
      AV63Mantenimientomaquina_wcrepuestosds_15_tfmmsrpre = DecimalUtil.ZERO ;
      AV64Mantenimientomaquina_wcrepuestosds_16_tfmmsrpre_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV53Mantenimientomaquina_wcrepuestosds_5_tfmmsrnom = "" ;
      A9409MMSRCnt = DecimalUtil.ZERO ;
      A11511MMSRTot = DecimalUtil.ZERO ;
      A11512MMSRDto = DecimalUtil.ZERO ;
      A9424MMSRPre = DecimalUtil.ZERO ;
      A396EmprCod = "" ;
      P08D52_A9421MMSRCod = new int[1] ;
      P08D52_A9412MMSCod = new int[1] ;
      P08D52_A396EmprCod = new String[] {""} ;
      P08D52_A9424MMSRPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08D52_A11512MMSRDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08D52_A11511MMSRTot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08D52_A9409MMSRCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08D52_A9422MMSRNom = new String[] {""} ;
      P08D52_n9422MMSRNom = new boolean[] {false} ;
      AV22Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.wcrepuestosgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08D52_A9421MMSRCod, P08D52_A9412MMSCod, P08D52_A396EmprCod, P08D52_A9424MMSRPre, P08D52_A11512MMSRDto, P08D52_A11511MMSRTot, P08D52_A9409MMSRCnt, P08D52_A9422MMSRNom, P08D52_n9422MMSRNom
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV47GXV1 ;
   private int AV39TFMMSCod ;
   private int AV40TFMMSCod_To ;
   private int AV10TFMMSRCod ;
   private int AV11TFMMSRCod_To ;
   private int AV38MMSCod ;
   private int AV50Mantenimientomaquina_wcrepuestosds_2_mmscod ;
   private int AV51Mantenimientomaquina_wcrepuestosds_3_tfmmscod ;
   private int AV52Mantenimientomaquina_wcrepuestosds_4_tfmmscod_to ;
   private int AV55Mantenimientomaquina_wcrepuestosds_7_tfmmsrcod ;
   private int AV56Mantenimientomaquina_wcrepuestosds_8_tfmmsrcod_to ;
   private int A9412MMSCod ;
   private int A9421MMSRCod ;
   private int AV21InsertIndex ;
   private long AV30count ;
   private java.math.BigDecimal AV14TFMMSRCnt ;
   private java.math.BigDecimal AV15TFMMSRCnt_To ;
   private java.math.BigDecimal AV41TFMMSRTot ;
   private java.math.BigDecimal AV42TFMMSRTot_To ;
   private java.math.BigDecimal AV43TFMMSRDto ;
   private java.math.BigDecimal AV44TFMMSRDto_To ;
   private java.math.BigDecimal AV16TFMMSRPre ;
   private java.math.BigDecimal AV17TFMMSRPre_To ;
   private java.math.BigDecimal AV57Mantenimientomaquina_wcrepuestosds_9_tfmmsrcnt ;
   private java.math.BigDecimal AV58Mantenimientomaquina_wcrepuestosds_10_tfmmsrcnt_to ;
   private java.math.BigDecimal AV59Mantenimientomaquina_wcrepuestosds_11_tfmmsrtot ;
   private java.math.BigDecimal AV60Mantenimientomaquina_wcrepuestosds_12_tfmmsrtot_to ;
   private java.math.BigDecimal AV61Mantenimientomaquina_wcrepuestosds_13_tfmmsrdto ;
   private java.math.BigDecimal AV62Mantenimientomaquina_wcrepuestosds_14_tfmmsrdto_to ;
   private java.math.BigDecimal AV63Mantenimientomaquina_wcrepuestosds_15_tfmmsrpre ;
   private java.math.BigDecimal AV64Mantenimientomaquina_wcrepuestosds_16_tfmmsrpre_to ;
   private java.math.BigDecimal A9409MMSRCnt ;
   private java.math.BigDecimal A11511MMSRTot ;
   private java.math.BigDecimal A11512MMSRDto ;
   private java.math.BigDecimal A9424MMSRPre ;
   private String AV12TFMMSRNom ;
   private String AV13TFMMSRNom_Sel ;
   private String AV37EmprCod ;
   private String A9422MMSRNom ;
   private String AV49Mantenimientomaquina_wcrepuestosds_1_emprcod ;
   private String AV53Mantenimientomaquina_wcrepuestosds_5_tfmmsrnom ;
   private String AV54Mantenimientomaquina_wcrepuestosds_6_tfmmsrnom_sel ;
   private String scmdbuf ;
   private String lV53Mantenimientomaquina_wcrepuestosds_5_tfmmsrnom ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk8D52 ;
   private boolean n9422MMSRNom ;
   private String AV24OptionsJson ;
   private String AV27OptionsDescJson ;
   private String AV29OptionIndexesJson ;
   private String AV20DDOName ;
   private String AV18SearchTxt ;
   private String AV19SearchTxtTo ;
   private String AV22Option ;
   private com.genexus.webpanels.WebSession AV31Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private int[] P08D52_A9421MMSRCod ;
   private int[] P08D52_A9412MMSCod ;
   private String[] P08D52_A396EmprCod ;
   private java.math.BigDecimal[] P08D52_A9424MMSRPre ;
   private java.math.BigDecimal[] P08D52_A11512MMSRDto ;
   private java.math.BigDecimal[] P08D52_A11511MMSRTot ;
   private java.math.BigDecimal[] P08D52_A9409MMSRCnt ;
   private String[] P08D52_A9422MMSRNom ;
   private boolean[] P08D52_n9422MMSRNom ;
   private GXSimpleCollection<String> AV23Options ;
   private GXSimpleCollection<String> AV26OptionsDesc ;
   private GXSimpleCollection<String> AV28OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV33GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV34GridStateFilterValue ;
}

final  class wcrepuestosgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08D52( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV51Mantenimientomaquina_wcrepuestosds_3_tfmmscod ,
                                          int AV52Mantenimientomaquina_wcrepuestosds_4_tfmmscod_to ,
                                          String AV54Mantenimientomaquina_wcrepuestosds_6_tfmmsrnom_sel ,
                                          String AV53Mantenimientomaquina_wcrepuestosds_5_tfmmsrnom ,
                                          int AV55Mantenimientomaquina_wcrepuestosds_7_tfmmsrcod ,
                                          int AV56Mantenimientomaquina_wcrepuestosds_8_tfmmsrcod_to ,
                                          java.math.BigDecimal AV57Mantenimientomaquina_wcrepuestosds_9_tfmmsrcnt ,
                                          java.math.BigDecimal AV58Mantenimientomaquina_wcrepuestosds_10_tfmmsrcnt_to ,
                                          java.math.BigDecimal AV59Mantenimientomaquina_wcrepuestosds_11_tfmmsrtot ,
                                          java.math.BigDecimal AV60Mantenimientomaquina_wcrepuestosds_12_tfmmsrtot_to ,
                                          java.math.BigDecimal AV61Mantenimientomaquina_wcrepuestosds_13_tfmmsrdto ,
                                          java.math.BigDecimal AV62Mantenimientomaquina_wcrepuestosds_14_tfmmsrdto_to ,
                                          java.math.BigDecimal AV63Mantenimientomaquina_wcrepuestosds_15_tfmmsrpre ,
                                          java.math.BigDecimal AV64Mantenimientomaquina_wcrepuestosds_16_tfmmsrpre_to ,
                                          int A9412MMSCod ,
                                          String A9422MMSRNom ,
                                          int A9421MMSRCod ,
                                          java.math.BigDecimal A9409MMSRCnt ,
                                          java.math.BigDecimal A11511MMSRTot ,
                                          java.math.BigDecimal A11512MMSRDto ,
                                          java.math.BigDecimal A9424MMSRPre ,
                                          String AV49Mantenimientomaquina_wcrepuestosds_1_emprcod ,
                                          int AV50Mantenimientomaquina_wcrepuestosds_2_mmscod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[16];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.MMSRCod AS MMSRCod, T1.MMSCod, T1.EmprCod, T1.MMSRPre, T1.MMSRDto, T1.MMSRTot, T1.MMSRCnt, T2.MRNom AS MMSRNom FROM (TXPMMoStR T1 INNER JOIN TXPMREPUE" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.MRCod = T1.MMSRCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.MMSCod = ?)");
      if ( ! (0==AV51Mantenimientomaquina_wcrepuestosds_3_tfmmscod) )
      {
         addWhere(sWhereString, "(T1.MMSCod >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV52Mantenimientomaquina_wcrepuestosds_4_tfmmscod_to) )
      {
         addWhere(sWhereString, "(T1.MMSCod <= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54Mantenimientomaquina_wcrepuestosds_6_tfmmsrnom_sel)==0) && ( ! (GXutil.strcmp("", AV53Mantenimientomaquina_wcrepuestosds_5_tfmmsrnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MRNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Mantenimientomaquina_wcrepuestosds_6_tfmmsrnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MRNom = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (0==AV55Mantenimientomaquina_wcrepuestosds_7_tfmmsrcod) )
      {
         addWhere(sWhereString, "(T1.MMSRCod >= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (0==AV56Mantenimientomaquina_wcrepuestosds_8_tfmmsrcod_to) )
      {
         addWhere(sWhereString, "(T1.MMSRCod <= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV57Mantenimientomaquina_wcrepuestosds_9_tfmmsrcnt)==0) )
      {
         addWhere(sWhereString, "(T1.MMSRCnt >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV58Mantenimientomaquina_wcrepuestosds_10_tfmmsrcnt_to)==0) )
      {
         addWhere(sWhereString, "(T1.MMSRCnt <= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV59Mantenimientomaquina_wcrepuestosds_11_tfmmsrtot)==0) )
      {
         addWhere(sWhereString, "(T1.MMSRTot >= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV60Mantenimientomaquina_wcrepuestosds_12_tfmmsrtot_to)==0) )
      {
         addWhere(sWhereString, "(T1.MMSRTot <= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV61Mantenimientomaquina_wcrepuestosds_13_tfmmsrdto)==0) )
      {
         addWhere(sWhereString, "(T1.MMSRDto >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62Mantenimientomaquina_wcrepuestosds_14_tfmmsrdto_to)==0) )
      {
         addWhere(sWhereString, "(T1.MMSRDto <= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63Mantenimientomaquina_wcrepuestosds_15_tfmmsrpre)==0) )
      {
         addWhere(sWhereString, "(T1.MMSRPre >= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64Mantenimientomaquina_wcrepuestosds_16_tfmmsrpre_to)==0) )
      {
         addWhere(sWhereString, "(T1.MMSRPre <= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.MMSCod, T1.MMSRCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
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
                  return conditional_P08D52(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08D52", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,3);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,3);
               ((String[]) buf[7])[0] = rslt.getString(8, 100);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[16], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[19]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[24], 3);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[25], 3);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[26], 3);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[27], 3);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 3);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 3);
               }
               return;
      }
   }

}

