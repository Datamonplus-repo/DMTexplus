package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wcseguimientonpedidogetfilterdata extends GXProcedure
{
   public wcseguimientonpedidogetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcseguimientonpedidogetfilterdata.class ), "" );
   }

   public wcseguimientonpedidogetfilterdata( int remoteHandle ,
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
      wcseguimientonpedidogetfilterdata.this.aP5 = new String[] {""};
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
      wcseguimientonpedidogetfilterdata.this.AV24DDOName = aP0;
      wcseguimientonpedidogetfilterdata.this.AV22SearchTxt = aP1;
      wcseguimientonpedidogetfilterdata.this.AV23SearchTxtTo = aP2;
      wcseguimientonpedidogetfilterdata.this.aP3 = aP3;
      wcseguimientonpedidogetfilterdata.this.aP4 = aP4;
      wcseguimientonpedidogetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV27Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV30OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV32OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV24DDOName), "DDO_PRDNUM") == 0 )
      {
         /* Execute user subroutine: 'LOADPRDNUMOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV24DDOName), "DDO_PRDNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADPRDNOMOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV28OptionsJson = AV27Options.toJSonString(false) ;
      AV31OptionsDescJson = AV30OptionsDesc.toJSonString(false) ;
      AV33OptionIndexesJson = AV32OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV35Session.getValue("WCSeguimientoNPedidoGridState"), "") == 0 )
      {
         AV37GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCSeguimientoNPedidoGridState"), null, null);
      }
      else
      {
         AV37GridState.fromxml(AV35Session.getValue("WCSeguimientoNPedidoGridState"), null, null);
      }
      AV45GXV1 = 1 ;
      while ( AV45GXV1 <= AV37GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV38GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV37GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV45GXV1));
         if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV42FilterFullText = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV10TFPrdNum = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV11TFPrdNum_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV12TFPrdNom = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV13TFPrdNom_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDUNI") == 0 )
         {
            AV14TFPedUni = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV15TFPedUni_To = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDCANENT") == 0 )
         {
            AV16TFPedCanEnt = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV17TFPedCanEnt_To = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDFULENT") == 0 )
         {
            AV18TFPedFulEnt = localUtil.ctod( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDCUM_SEL") == 0 )
         {
            AV20TFPedCum_SelsJson = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV21TFPedCum_Sels.fromJSonString(AV20TFPedCum_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV40Emprcod = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PEDCOD") == 0 )
         {
            AV41PedCod = (int)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV45GXV1 = (int)(AV45GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPRDNUMOPTIONS' Routine */
      returnInSub = false ;
      AV10TFPrdNum = AV22SearchTxt ;
      AV11TFPrdNum_Sel = "" ;
      AV47Wcseguimientonpedidods_1_filterfulltext = AV42FilterFullText ;
      AV48Wcseguimientonpedidods_2_tfprdnum = AV10TFPrdNum ;
      AV49Wcseguimientonpedidods_3_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV50Wcseguimientonpedidods_4_tfprdnom = AV12TFPrdNom ;
      AV51Wcseguimientonpedidods_5_tfprdnom_sel = AV13TFPrdNom_Sel ;
      AV52Wcseguimientonpedidods_6_tfpeduni = AV14TFPedUni ;
      AV53Wcseguimientonpedidods_7_tfpeduni_to = AV15TFPedUni_To ;
      AV54Wcseguimientonpedidods_8_tfpedcanent = AV16TFPedCanEnt ;
      AV55Wcseguimientonpedidods_9_tfpedcanent_to = AV17TFPedCanEnt_To ;
      AV56Wcseguimientonpedidods_10_tfpedfulent = AV18TFPedFulEnt ;
      AV57Wcseguimientonpedidods_11_tfpedcum_sels = AV21TFPedCum_Sels ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A659PedCum ,
                                           AV57Wcseguimientonpedidods_11_tfpedcum_sels ,
                                           AV47Wcseguimientonpedidods_1_filterfulltext ,
                                           AV49Wcseguimientonpedidods_3_tfprdnum_sel ,
                                           AV48Wcseguimientonpedidods_2_tfprdnum ,
                                           AV51Wcseguimientonpedidods_5_tfprdnom_sel ,
                                           AV50Wcseguimientonpedidods_4_tfprdnom ,
                                           AV52Wcseguimientonpedidods_6_tfpeduni ,
                                           AV53Wcseguimientonpedidods_7_tfpeduni_to ,
                                           AV54Wcseguimientonpedidods_8_tfpedcanent ,
                                           AV55Wcseguimientonpedidods_9_tfpedcanent_to ,
                                           AV56Wcseguimientonpedidods_10_tfpedfulent ,
                                           Integer.valueOf(AV57Wcseguimientonpedidods_11_tfpedcum_sels.size()) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A669PedUni ,
                                           A657PedCanEnt ,
                                           A663PedFulEnt ,
                                           AV40Emprcod ,
                                           Integer.valueOf(AV41PedCod) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A658PedCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.INT
                                           }
      });
      lV47Wcseguimientonpedidods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Wcseguimientonpedidods_1_filterfulltext), "%", "") ;
      lV47Wcseguimientonpedidods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Wcseguimientonpedidods_1_filterfulltext), "%", "") ;
      lV47Wcseguimientonpedidods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Wcseguimientonpedidods_1_filterfulltext), "%", "") ;
      lV47Wcseguimientonpedidods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Wcseguimientonpedidods_1_filterfulltext), "%", "") ;
      lV47Wcseguimientonpedidods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Wcseguimientonpedidods_1_filterfulltext), "%", "") ;
      lV48Wcseguimientonpedidods_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV48Wcseguimientonpedidods_2_tfprdnum), 6, "%") ;
      lV50Wcseguimientonpedidods_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV50Wcseguimientonpedidods_4_tfprdnom), 26, "%") ;
      /* Using cursor P08PQ2 */
      pr_default.execute(0, new Object[] {AV40Emprcod, Integer.valueOf(AV41PedCod), lV47Wcseguimientonpedidods_1_filterfulltext, lV47Wcseguimientonpedidods_1_filterfulltext, lV47Wcseguimientonpedidods_1_filterfulltext, lV47Wcseguimientonpedidods_1_filterfulltext, lV47Wcseguimientonpedidods_1_filterfulltext, lV48Wcseguimientonpedidods_2_tfprdnum, AV49Wcseguimientonpedidods_3_tfprdnum_sel, lV50Wcseguimientonpedidods_4_tfprdnom, AV51Wcseguimientonpedidods_5_tfprdnom_sel, AV52Wcseguimientonpedidods_6_tfpeduni, AV53Wcseguimientonpedidods_7_tfpeduni_to, AV54Wcseguimientonpedidods_8_tfpedcanent, AV55Wcseguimientonpedidods_9_tfpedcanent_to, AV56Wcseguimientonpedidods_10_tfpedfulent});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8PQ2 = false ;
         A658PedCod = P08PQ2_A658PedCod[0] ;
         A396EmprCod = P08PQ2_A396EmprCod[0] ;
         A719PrdNum = P08PQ2_A719PrdNum[0] ;
         A659PedCum = P08PQ2_A659PedCum[0] ;
         A663PedFulEnt = P08PQ2_A663PedFulEnt[0] ;
         A657PedCanEnt = P08PQ2_A657PedCanEnt[0] ;
         A669PedUni = P08PQ2_A669PedUni[0] ;
         A718PrdNom = P08PQ2_A718PrdNom[0] ;
         A718PrdNom = P08PQ2_A718PrdNom[0] ;
         AV34count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08PQ2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P08PQ2_A658PedCod[0] == A658PedCod ) && ( GXutil.strcmp(P08PQ2_A719PrdNum[0], A719PrdNum) == 0 ) )
         {
            brk8PQ2 = false ;
            AV34count = (long)(AV34count+1) ;
            brk8PQ2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A719PrdNum)==0) )
         {
            AV26Option = A719PrdNum ;
            AV27Options.add(AV26Option, 0);
            AV32OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV34count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV27Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8PQ2 )
         {
            brk8PQ2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPRDNOMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFPrdNom = AV22SearchTxt ;
      AV13TFPrdNom_Sel = "" ;
      AV47Wcseguimientonpedidods_1_filterfulltext = AV42FilterFullText ;
      AV48Wcseguimientonpedidods_2_tfprdnum = AV10TFPrdNum ;
      AV49Wcseguimientonpedidods_3_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV50Wcseguimientonpedidods_4_tfprdnom = AV12TFPrdNom ;
      AV51Wcseguimientonpedidods_5_tfprdnom_sel = AV13TFPrdNom_Sel ;
      AV52Wcseguimientonpedidods_6_tfpeduni = AV14TFPedUni ;
      AV53Wcseguimientonpedidods_7_tfpeduni_to = AV15TFPedUni_To ;
      AV54Wcseguimientonpedidods_8_tfpedcanent = AV16TFPedCanEnt ;
      AV55Wcseguimientonpedidods_9_tfpedcanent_to = AV17TFPedCanEnt_To ;
      AV56Wcseguimientonpedidods_10_tfpedfulent = AV18TFPedFulEnt ;
      AV57Wcseguimientonpedidods_11_tfpedcum_sels = AV21TFPedCum_Sels ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           A659PedCum ,
                                           AV57Wcseguimientonpedidods_11_tfpedcum_sels ,
                                           AV47Wcseguimientonpedidods_1_filterfulltext ,
                                           AV49Wcseguimientonpedidods_3_tfprdnum_sel ,
                                           AV48Wcseguimientonpedidods_2_tfprdnum ,
                                           AV51Wcseguimientonpedidods_5_tfprdnom_sel ,
                                           AV50Wcseguimientonpedidods_4_tfprdnom ,
                                           AV52Wcseguimientonpedidods_6_tfpeduni ,
                                           AV53Wcseguimientonpedidods_7_tfpeduni_to ,
                                           AV54Wcseguimientonpedidods_8_tfpedcanent ,
                                           AV55Wcseguimientonpedidods_9_tfpedcanent_to ,
                                           AV56Wcseguimientonpedidods_10_tfpedfulent ,
                                           Integer.valueOf(AV57Wcseguimientonpedidods_11_tfpedcum_sels.size()) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A669PedUni ,
                                           A657PedCanEnt ,
                                           A663PedFulEnt ,
                                           Integer.valueOf(A658PedCod) ,
                                           Integer.valueOf(AV41PedCod) ,
                                           AV40Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV47Wcseguimientonpedidods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Wcseguimientonpedidods_1_filterfulltext), "%", "") ;
      lV47Wcseguimientonpedidods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Wcseguimientonpedidods_1_filterfulltext), "%", "") ;
      lV47Wcseguimientonpedidods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Wcseguimientonpedidods_1_filterfulltext), "%", "") ;
      lV47Wcseguimientonpedidods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Wcseguimientonpedidods_1_filterfulltext), "%", "") ;
      lV47Wcseguimientonpedidods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Wcseguimientonpedidods_1_filterfulltext), "%", "") ;
      lV48Wcseguimientonpedidods_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV48Wcseguimientonpedidods_2_tfprdnum), 6, "%") ;
      lV50Wcseguimientonpedidods_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV50Wcseguimientonpedidods_4_tfprdnom), 26, "%") ;
      /* Using cursor P08PQ3 */
      pr_default.execute(1, new Object[] {AV40Emprcod, Integer.valueOf(AV41PedCod), lV47Wcseguimientonpedidods_1_filterfulltext, lV47Wcseguimientonpedidods_1_filterfulltext, lV47Wcseguimientonpedidods_1_filterfulltext, lV47Wcseguimientonpedidods_1_filterfulltext, lV47Wcseguimientonpedidods_1_filterfulltext, lV48Wcseguimientonpedidods_2_tfprdnum, AV49Wcseguimientonpedidods_3_tfprdnum_sel, lV50Wcseguimientonpedidods_4_tfprdnom, AV51Wcseguimientonpedidods_5_tfprdnom_sel, AV52Wcseguimientonpedidods_6_tfpeduni, AV53Wcseguimientonpedidods_7_tfpeduni_to, AV54Wcseguimientonpedidods_8_tfpedcanent, AV55Wcseguimientonpedidods_9_tfpedcanent_to, AV56Wcseguimientonpedidods_10_tfpedfulent});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8PQ4 = false ;
         A719PrdNum = P08PQ3_A719PrdNum[0] ;
         A396EmprCod = P08PQ3_A396EmprCod[0] ;
         A658PedCod = P08PQ3_A658PedCod[0] ;
         A659PedCum = P08PQ3_A659PedCum[0] ;
         A663PedFulEnt = P08PQ3_A663PedFulEnt[0] ;
         A657PedCanEnt = P08PQ3_A657PedCanEnt[0] ;
         A669PedUni = P08PQ3_A669PedUni[0] ;
         A718PrdNom = P08PQ3_A718PrdNom[0] ;
         A718PrdNom = P08PQ3_A718PrdNom[0] ;
         AV34count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08PQ3_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P08PQ3_A719PrdNum[0], A719PrdNum) == 0 ) )
         {
            brk8PQ4 = false ;
            A658PedCod = P08PQ3_A658PedCod[0] ;
            AV34count = (long)(AV34count+1) ;
            brk8PQ4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A718PrdNom)==0) )
         {
            AV26Option = A718PrdNom ;
            AV25InsertIndex = 1 ;
            while ( ( AV25InsertIndex <= AV27Options.size() ) && ( GXutil.strcmp((String)AV27Options.elementAt(-1+AV25InsertIndex), AV26Option) < 0 ) )
            {
               AV25InsertIndex = (int)(AV25InsertIndex+1) ;
            }
            AV27Options.add(AV26Option, AV25InsertIndex);
            AV32OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV34count), "Z,ZZZ,ZZZ,ZZ9")), AV25InsertIndex);
         }
         if ( AV27Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8PQ4 )
         {
            brk8PQ4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = wcseguimientonpedidogetfilterdata.this.AV28OptionsJson;
      this.aP4[0] = wcseguimientonpedidogetfilterdata.this.AV31OptionsDescJson;
      this.aP5[0] = wcseguimientonpedidogetfilterdata.this.AV33OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV28OptionsJson = "" ;
      AV31OptionsDescJson = "" ;
      AV33OptionIndexesJson = "" ;
      AV27Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV30OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV32OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV35Session = httpContext.getWebSession();
      AV37GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV38GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV42FilterFullText = "" ;
      AV10TFPrdNum = "" ;
      AV11TFPrdNum_Sel = "" ;
      AV12TFPrdNom = "" ;
      AV13TFPrdNom_Sel = "" ;
      AV14TFPedUni = DecimalUtil.ZERO ;
      AV15TFPedUni_To = DecimalUtil.ZERO ;
      AV16TFPedCanEnt = DecimalUtil.ZERO ;
      AV17TFPedCanEnt_To = DecimalUtil.ZERO ;
      AV18TFPedFulEnt = GXutil.nullDate() ;
      AV20TFPedCum_SelsJson = "" ;
      AV21TFPedCum_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV40Emprcod = "" ;
      A719PrdNum = "" ;
      AV47Wcseguimientonpedidods_1_filterfulltext = "" ;
      AV48Wcseguimientonpedidods_2_tfprdnum = "" ;
      AV49Wcseguimientonpedidods_3_tfprdnum_sel = "" ;
      AV50Wcseguimientonpedidods_4_tfprdnom = "" ;
      AV51Wcseguimientonpedidods_5_tfprdnom_sel = "" ;
      AV52Wcseguimientonpedidods_6_tfpeduni = DecimalUtil.ZERO ;
      AV53Wcseguimientonpedidods_7_tfpeduni_to = DecimalUtil.ZERO ;
      AV54Wcseguimientonpedidods_8_tfpedcanent = DecimalUtil.ZERO ;
      AV55Wcseguimientonpedidods_9_tfpedcanent_to = DecimalUtil.ZERO ;
      AV56Wcseguimientonpedidods_10_tfpedfulent = GXutil.nullDate() ;
      AV57Wcseguimientonpedidods_11_tfpedcum_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      scmdbuf = "" ;
      lV47Wcseguimientonpedidods_1_filterfulltext = "" ;
      lV48Wcseguimientonpedidods_2_tfprdnum = "" ;
      lV50Wcseguimientonpedidods_4_tfprdnom = "" ;
      A659PedCum = "" ;
      A718PrdNom = "" ;
      A669PedUni = DecimalUtil.ZERO ;
      A657PedCanEnt = DecimalUtil.ZERO ;
      A663PedFulEnt = GXutil.nullDate() ;
      A396EmprCod = "" ;
      P08PQ2_A658PedCod = new int[1] ;
      P08PQ2_A396EmprCod = new String[] {""} ;
      P08PQ2_A719PrdNum = new String[] {""} ;
      P08PQ2_A659PedCum = new String[] {""} ;
      P08PQ2_A663PedFulEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P08PQ2_A657PedCanEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PQ2_A669PedUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PQ2_A718PrdNom = new String[] {""} ;
      AV26Option = "" ;
      P08PQ3_A719PrdNum = new String[] {""} ;
      P08PQ3_A396EmprCod = new String[] {""} ;
      P08PQ3_A658PedCod = new int[1] ;
      P08PQ3_A659PedCum = new String[] {""} ;
      P08PQ3_A663PedFulEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P08PQ3_A657PedCanEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PQ3_A669PedUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PQ3_A718PrdNom = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcseguimientonpedidogetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08PQ2_A658PedCod, P08PQ2_A396EmprCod, P08PQ2_A719PrdNum, P08PQ2_A659PedCum, P08PQ2_A663PedFulEnt, P08PQ2_A657PedCanEnt, P08PQ2_A669PedUni, P08PQ2_A718PrdNom
            }
            , new Object[] {
            P08PQ3_A719PrdNum, P08PQ3_A396EmprCod, P08PQ3_A658PedCod, P08PQ3_A659PedCum, P08PQ3_A663PedFulEnt, P08PQ3_A657PedCanEnt, P08PQ3_A669PedUni, P08PQ3_A718PrdNom
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV45GXV1 ;
   private int AV41PedCod ;
   private int AV57Wcseguimientonpedidods_11_tfpedcum_sels_size ;
   private int A658PedCod ;
   private int AV25InsertIndex ;
   private long AV34count ;
   private java.math.BigDecimal AV14TFPedUni ;
   private java.math.BigDecimal AV15TFPedUni_To ;
   private java.math.BigDecimal AV16TFPedCanEnt ;
   private java.math.BigDecimal AV17TFPedCanEnt_To ;
   private java.math.BigDecimal AV52Wcseguimientonpedidods_6_tfpeduni ;
   private java.math.BigDecimal AV53Wcseguimientonpedidods_7_tfpeduni_to ;
   private java.math.BigDecimal AV54Wcseguimientonpedidods_8_tfpedcanent ;
   private java.math.BigDecimal AV55Wcseguimientonpedidods_9_tfpedcanent_to ;
   private java.math.BigDecimal A669PedUni ;
   private java.math.BigDecimal A657PedCanEnt ;
   private String AV10TFPrdNum ;
   private String AV11TFPrdNum_Sel ;
   private String AV12TFPrdNom ;
   private String AV13TFPrdNom_Sel ;
   private String AV40Emprcod ;
   private String A719PrdNum ;
   private String AV48Wcseguimientonpedidods_2_tfprdnum ;
   private String AV49Wcseguimientonpedidods_3_tfprdnum_sel ;
   private String AV50Wcseguimientonpedidods_4_tfprdnom ;
   private String AV51Wcseguimientonpedidods_5_tfprdnom_sel ;
   private String scmdbuf ;
   private String lV48Wcseguimientonpedidods_2_tfprdnum ;
   private String lV50Wcseguimientonpedidods_4_tfprdnom ;
   private String A659PedCum ;
   private String A718PrdNom ;
   private String A396EmprCod ;
   private java.util.Date AV18TFPedFulEnt ;
   private java.util.Date AV56Wcseguimientonpedidods_10_tfpedfulent ;
   private java.util.Date A663PedFulEnt ;
   private boolean returnInSub ;
   private boolean brk8PQ2 ;
   private boolean brk8PQ4 ;
   private String AV28OptionsJson ;
   private String AV31OptionsDescJson ;
   private String AV33OptionIndexesJson ;
   private String AV20TFPedCum_SelsJson ;
   private String AV24DDOName ;
   private String AV22SearchTxt ;
   private String AV23SearchTxtTo ;
   private String AV42FilterFullText ;
   private String AV47Wcseguimientonpedidods_1_filterfulltext ;
   private String lV47Wcseguimientonpedidods_1_filterfulltext ;
   private String AV26Option ;
   private com.genexus.webpanels.WebSession AV35Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private int[] P08PQ2_A658PedCod ;
   private String[] P08PQ2_A396EmprCod ;
   private String[] P08PQ2_A719PrdNum ;
   private String[] P08PQ2_A659PedCum ;
   private java.util.Date[] P08PQ2_A663PedFulEnt ;
   private java.math.BigDecimal[] P08PQ2_A657PedCanEnt ;
   private java.math.BigDecimal[] P08PQ2_A669PedUni ;
   private String[] P08PQ2_A718PrdNom ;
   private String[] P08PQ3_A719PrdNum ;
   private String[] P08PQ3_A396EmprCod ;
   private int[] P08PQ3_A658PedCod ;
   private String[] P08PQ3_A659PedCum ;
   private java.util.Date[] P08PQ3_A663PedFulEnt ;
   private java.math.BigDecimal[] P08PQ3_A657PedCanEnt ;
   private java.math.BigDecimal[] P08PQ3_A669PedUni ;
   private String[] P08PQ3_A718PrdNom ;
   private GXSimpleCollection<String> AV21TFPedCum_Sels ;
   private GXSimpleCollection<String> AV57Wcseguimientonpedidods_11_tfpedcum_sels ;
   private GXSimpleCollection<String> AV27Options ;
   private GXSimpleCollection<String> AV30OptionsDesc ;
   private GXSimpleCollection<String> AV32OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV37GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV38GridStateFilterValue ;
}

final  class wcseguimientonpedidogetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08PQ2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A659PedCum ,
                                          GXSimpleCollection<String> AV57Wcseguimientonpedidods_11_tfpedcum_sels ,
                                          String AV47Wcseguimientonpedidods_1_filterfulltext ,
                                          String AV49Wcseguimientonpedidods_3_tfprdnum_sel ,
                                          String AV48Wcseguimientonpedidods_2_tfprdnum ,
                                          String AV51Wcseguimientonpedidods_5_tfprdnom_sel ,
                                          String AV50Wcseguimientonpedidods_4_tfprdnom ,
                                          java.math.BigDecimal AV52Wcseguimientonpedidods_6_tfpeduni ,
                                          java.math.BigDecimal AV53Wcseguimientonpedidods_7_tfpeduni_to ,
                                          java.math.BigDecimal AV54Wcseguimientonpedidods_8_tfpedcanent ,
                                          java.math.BigDecimal AV55Wcseguimientonpedidods_9_tfpedcanent_to ,
                                          java.util.Date AV56Wcseguimientonpedidods_10_tfpedfulent ,
                                          int AV57Wcseguimientonpedidods_11_tfpedcum_sels_size ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A669PedUni ,
                                          java.math.BigDecimal A657PedCanEnt ,
                                          java.util.Date A663PedFulEnt ,
                                          String AV40Emprcod ,
                                          int AV41PedCod ,
                                          String A396EmprCod ,
                                          int A658PedCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[16];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.PedCod, T1.EmprCod, T1.PrdNum, T1.PedCum, T1.PedFulEnt, T1.PedCanEnt, T1.PedUni, T2.PrdNom FROM (TXPLPEDID T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.PedCod = ?)");
      if ( ! (GXutil.strcmp("", AV47Wcseguimientonpedidods_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T2.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PedUni,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PedCanEnt,'999990.99'), 2) like '%' || ?) or ( UPPER(T1.PedCum) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
         GXv_int2[4] = (byte)(1) ;
         GXv_int2[5] = (byte)(1) ;
         GXv_int2[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV49Wcseguimientonpedidods_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV48Wcseguimientonpedidods_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49Wcseguimientonpedidods_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV51Wcseguimientonpedidods_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV50Wcseguimientonpedidods_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51Wcseguimientonpedidods_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV52Wcseguimientonpedidods_6_tfpeduni)==0) )
      {
         addWhere(sWhereString, "(T1.PedUni >= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV53Wcseguimientonpedidods_7_tfpeduni_to)==0) )
      {
         addWhere(sWhereString, "(T1.PedUni <= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV54Wcseguimientonpedidods_8_tfpedcanent)==0) )
      {
         addWhere(sWhereString, "(T1.PedCanEnt >= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV55Wcseguimientonpedidods_9_tfpedcanent_to)==0) )
      {
         addWhere(sWhereString, "(T1.PedCanEnt <= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV56Wcseguimientonpedidods_10_tfpedfulent)) )
      {
         addWhere(sWhereString, "(T1.PedFulEnt >= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( AV57Wcseguimientonpedidods_11_tfpedcum_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV57Wcseguimientonpedidods_11_tfpedcum_sels, "T1.PedCum IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PedCod, T1.PrdNum" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08PQ3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A659PedCum ,
                                          GXSimpleCollection<String> AV57Wcseguimientonpedidods_11_tfpedcum_sels ,
                                          String AV47Wcseguimientonpedidods_1_filterfulltext ,
                                          String AV49Wcseguimientonpedidods_3_tfprdnum_sel ,
                                          String AV48Wcseguimientonpedidods_2_tfprdnum ,
                                          String AV51Wcseguimientonpedidods_5_tfprdnom_sel ,
                                          String AV50Wcseguimientonpedidods_4_tfprdnom ,
                                          java.math.BigDecimal AV52Wcseguimientonpedidods_6_tfpeduni ,
                                          java.math.BigDecimal AV53Wcseguimientonpedidods_7_tfpeduni_to ,
                                          java.math.BigDecimal AV54Wcseguimientonpedidods_8_tfpedcanent ,
                                          java.math.BigDecimal AV55Wcseguimientonpedidods_9_tfpedcanent_to ,
                                          java.util.Date AV56Wcseguimientonpedidods_10_tfpedfulent ,
                                          int AV57Wcseguimientonpedidods_11_tfpedcum_sels_size ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A669PedUni ,
                                          java.math.BigDecimal A657PedCanEnt ,
                                          java.util.Date A663PedFulEnt ,
                                          int A658PedCod ,
                                          int AV41PedCod ,
                                          String AV40Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[16];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT T1.PrdNum, T1.EmprCod, T1.PedCod, T1.PedCum, T1.PedFulEnt, T1.PedCanEnt, T1.PedUni, T2.PrdNom FROM (TXPLPEDID T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.PedCod = ?)");
      if ( ! (GXutil.strcmp("", AV47Wcseguimientonpedidods_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T2.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PedUni,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PedCanEnt,'999990.99'), 2) like '%' || ?) or ( UPPER(T1.PedCum) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int5[2] = (byte)(1) ;
         GXv_int5[3] = (byte)(1) ;
         GXv_int5[4] = (byte)(1) ;
         GXv_int5[5] = (byte)(1) ;
         GXv_int5[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV49Wcseguimientonpedidods_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV48Wcseguimientonpedidods_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49Wcseguimientonpedidods_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int5[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV51Wcseguimientonpedidods_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV50Wcseguimientonpedidods_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51Wcseguimientonpedidods_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int5[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV52Wcseguimientonpedidods_6_tfpeduni)==0) )
      {
         addWhere(sWhereString, "(T1.PedUni >= ?)");
      }
      else
      {
         GXv_int5[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV53Wcseguimientonpedidods_7_tfpeduni_to)==0) )
      {
         addWhere(sWhereString, "(T1.PedUni <= ?)");
      }
      else
      {
         GXv_int5[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV54Wcseguimientonpedidods_8_tfpedcanent)==0) )
      {
         addWhere(sWhereString, "(T1.PedCanEnt >= ?)");
      }
      else
      {
         GXv_int5[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV55Wcseguimientonpedidods_9_tfpedcanent_to)==0) )
      {
         addWhere(sWhereString, "(T1.PedCanEnt <= ?)");
      }
      else
      {
         GXv_int5[14] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV56Wcseguimientonpedidods_10_tfpedfulent)) )
      {
         addWhere(sWhereString, "(T1.PedFulEnt >= ?)");
      }
      else
      {
         GXv_int5[15] = (byte)(1) ;
      }
      if ( AV57Wcseguimientonpedidods_11_tfpedcum_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV57Wcseguimientonpedidods_11_tfpedcum_sels, "T1.PedCum IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrdNum" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
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
                  return conditional_P08PQ2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.util.Date)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.util.Date)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() );
            case 1 :
                  return conditional_P08PQ3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.util.Date)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.util.Date)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08PQ2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08PQ3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
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
                  stmt.setVarchar(sIdx, (String)parms[18], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[20], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[27], 2);
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
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[31]);
               }
               return;
            case 1 :
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
                  stmt.setVarchar(sIdx, (String)parms[18], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[20], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[27], 2);
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
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[31]);
               }
               return;
      }
   }

}

