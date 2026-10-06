package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wcwinalmpqgetfilterdata extends GXProcedure
{
   public wcwinalmpqgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcwinalmpqgetfilterdata.class ), "" );
   }

   public wcwinalmpqgetfilterdata( int remoteHandle ,
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
      wcwinalmpqgetfilterdata.this.aP5 = new String[] {""};
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
      wcwinalmpqgetfilterdata.this.AV20DDOName = aP0;
      wcwinalmpqgetfilterdata.this.AV18SearchTxt = aP1;
      wcwinalmpqgetfilterdata.this.AV19SearchTxtTo = aP2;
      wcwinalmpqgetfilterdata.this.aP3 = aP3;
      wcwinalmpqgetfilterdata.this.aP4 = aP4;
      wcwinalmpqgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV20DDOName), "DDO_PRDNUM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV20DDOName), "DDO_PRDNOM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV20DDOName), "DDO_PRDREC") == 0 )
      {
         /* Execute user subroutine: 'LOADPRDRECOPTIONS' */
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
      if ( GXutil.strcmp(AV31Session.getValue("WCWINAlmPqGridState"), "") == 0 )
      {
         AV33GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCWINAlmPqGridState"), null, null);
      }
      else
      {
         AV33GridState.fromxml(AV31Session.getValue("WCWINAlmPqGridState"), null, null);
      }
      AV49GXV1 = 1 ;
      while ( AV49GXV1 <= AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV34GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV49GXV1));
         if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV10TFPrdNum = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV11TFPrdNum_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV12TFPrdNom = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV13TFPrdNom_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDUNI") == 0 )
         {
            AV14TFPedUni = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV15TFPedUni_To = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDCANENT") == 0 )
         {
            AV16TFPedCanEnt = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV17TFPedCanEnt_To = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDREC") == 0 )
         {
            AV40TFPrdRec = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDREC_SEL") == 0 )
         {
            AV41TFPrdRec_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV36Emprcod = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PEDCOD") == 0 )
         {
            AV37Pedcod = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ENTNALBAR") == 0 )
         {
            AV38EntNAlbar = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ENTFECENT") == 0 )
         {
            AV39EntFecEnt = localUtil.ctod( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRVNUM") == 0 )
         {
            AV44PrvNum = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRVNOM") == 0 )
         {
            AV46PrvNom = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV49GXV1 = (int)(AV49GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPRDNUMOPTIONS' Routine */
      returnInSub = false ;
      AV10TFPrdNum = AV18SearchTxt ;
      AV11TFPrdNum_Sel = "" ;
      AV51Wcwinalmpqds_1_tfprdnum = AV10TFPrdNum ;
      AV52Wcwinalmpqds_2_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV53Wcwinalmpqds_3_tfprdnom = AV12TFPrdNom ;
      AV54Wcwinalmpqds_4_tfprdnom_sel = AV13TFPrdNom_Sel ;
      AV55Wcwinalmpqds_5_tfpeduni = AV14TFPedUni ;
      AV56Wcwinalmpqds_6_tfpeduni_to = AV15TFPedUni_To ;
      AV57Wcwinalmpqds_7_tfpedcanent = AV16TFPedCanEnt ;
      AV58Wcwinalmpqds_8_tfpedcanent_to = AV17TFPedCanEnt_To ;
      AV59Wcwinalmpqds_9_tfprdrec = AV40TFPrdRec ;
      AV60Wcwinalmpqds_10_tfprdrec_sel = AV41TFPrdRec_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV52Wcwinalmpqds_2_tfprdnum_sel ,
                                           AV51Wcwinalmpqds_1_tfprdnum ,
                                           AV54Wcwinalmpqds_4_tfprdnom_sel ,
                                           AV53Wcwinalmpqds_3_tfprdnom ,
                                           AV55Wcwinalmpqds_5_tfpeduni ,
                                           AV56Wcwinalmpqds_6_tfpeduni_to ,
                                           AV57Wcwinalmpqds_7_tfpedcanent ,
                                           AV58Wcwinalmpqds_8_tfpedcanent_to ,
                                           AV60Wcwinalmpqds_10_tfprdrec_sel ,
                                           AV59Wcwinalmpqds_9_tfprdrec ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A669PedUni ,
                                           A657PedCanEnt ,
                                           A727PrdRec ,
                                           A667PedSit ,
                                           A659PedCum ,
                                           AV36Emprcod ,
                                           Integer.valueOf(AV37Pedcod) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A658PedCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.INT
                                           }
      });
      lV51Wcwinalmpqds_1_tfprdnum = GXutil.padr( GXutil.rtrim( AV51Wcwinalmpqds_1_tfprdnum), 6, "%") ;
      lV53Wcwinalmpqds_3_tfprdnom = GXutil.padr( GXutil.rtrim( AV53Wcwinalmpqds_3_tfprdnom), 26, "%") ;
      lV59Wcwinalmpqds_9_tfprdrec = GXutil.padr( GXutil.rtrim( AV59Wcwinalmpqds_9_tfprdrec), 1, "%") ;
      /* Using cursor P08OV2 */
      pr_default.execute(0, new Object[] {AV36Emprcod, Integer.valueOf(AV37Pedcod), lV51Wcwinalmpqds_1_tfprdnum, AV52Wcwinalmpqds_2_tfprdnum_sel, lV53Wcwinalmpqds_3_tfprdnom, AV54Wcwinalmpqds_4_tfprdnom_sel, AV55Wcwinalmpqds_5_tfpeduni, AV56Wcwinalmpqds_6_tfpeduni_to, AV57Wcwinalmpqds_7_tfpedcanent, AV58Wcwinalmpqds_8_tfpedcanent_to, lV59Wcwinalmpqds_9_tfprdrec, AV60Wcwinalmpqds_10_tfprdrec_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8OV2 = false ;
         A658PedCod = P08OV2_A658PedCod[0] ;
         A396EmprCod = P08OV2_A396EmprCod[0] ;
         A719PrdNum = P08OV2_A719PrdNum[0] ;
         A659PedCum = P08OV2_A659PedCum[0] ;
         A667PedSit = P08OV2_A667PedSit[0] ;
         A727PrdRec = P08OV2_A727PrdRec[0] ;
         A657PedCanEnt = P08OV2_A657PedCanEnt[0] ;
         A669PedUni = P08OV2_A669PedUni[0] ;
         A718PrdNom = P08OV2_A718PrdNom[0] ;
         A667PedSit = P08OV2_A667PedSit[0] ;
         A727PrdRec = P08OV2_A727PrdRec[0] ;
         A718PrdNom = P08OV2_A718PrdNom[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08OV2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P08OV2_A658PedCod[0] == A658PedCod ) && ( GXutil.strcmp(P08OV2_A719PrdNum[0], A719PrdNum) == 0 ) )
         {
            brk8OV2 = false ;
            AV30count = (long)(AV30count+1) ;
            brk8OV2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A719PrdNum)==0) )
         {
            AV22Option = A719PrdNum ;
            AV23Options.add(AV22Option, 0);
            AV28OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV23Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8OV2 )
         {
            brk8OV2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPRDNOMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFPrdNom = AV18SearchTxt ;
      AV13TFPrdNom_Sel = "" ;
      AV51Wcwinalmpqds_1_tfprdnum = AV10TFPrdNum ;
      AV52Wcwinalmpqds_2_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV53Wcwinalmpqds_3_tfprdnom = AV12TFPrdNom ;
      AV54Wcwinalmpqds_4_tfprdnom_sel = AV13TFPrdNom_Sel ;
      AV55Wcwinalmpqds_5_tfpeduni = AV14TFPedUni ;
      AV56Wcwinalmpqds_6_tfpeduni_to = AV15TFPedUni_To ;
      AV57Wcwinalmpqds_7_tfpedcanent = AV16TFPedCanEnt ;
      AV58Wcwinalmpqds_8_tfpedcanent_to = AV17TFPedCanEnt_To ;
      AV59Wcwinalmpqds_9_tfprdrec = AV40TFPrdRec ;
      AV60Wcwinalmpqds_10_tfprdrec_sel = AV41TFPrdRec_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV52Wcwinalmpqds_2_tfprdnum_sel ,
                                           AV51Wcwinalmpqds_1_tfprdnum ,
                                           AV54Wcwinalmpqds_4_tfprdnom_sel ,
                                           AV53Wcwinalmpqds_3_tfprdnom ,
                                           AV55Wcwinalmpqds_5_tfpeduni ,
                                           AV56Wcwinalmpqds_6_tfpeduni_to ,
                                           AV57Wcwinalmpqds_7_tfpedcanent ,
                                           AV58Wcwinalmpqds_8_tfpedcanent_to ,
                                           AV60Wcwinalmpqds_10_tfprdrec_sel ,
                                           AV59Wcwinalmpqds_9_tfprdrec ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A669PedUni ,
                                           A657PedCanEnt ,
                                           A727PrdRec ,
                                           Integer.valueOf(A658PedCod) ,
                                           Integer.valueOf(AV37Pedcod) ,
                                           A667PedSit ,
                                           A659PedCum ,
                                           AV36Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV51Wcwinalmpqds_1_tfprdnum = GXutil.padr( GXutil.rtrim( AV51Wcwinalmpqds_1_tfprdnum), 6, "%") ;
      lV53Wcwinalmpqds_3_tfprdnom = GXutil.padr( GXutil.rtrim( AV53Wcwinalmpqds_3_tfprdnom), 26, "%") ;
      lV59Wcwinalmpqds_9_tfprdrec = GXutil.padr( GXutil.rtrim( AV59Wcwinalmpqds_9_tfprdrec), 1, "%") ;
      /* Using cursor P08OV3 */
      pr_default.execute(1, new Object[] {AV36Emprcod, Integer.valueOf(AV37Pedcod), lV51Wcwinalmpqds_1_tfprdnum, AV52Wcwinalmpqds_2_tfprdnum_sel, lV53Wcwinalmpqds_3_tfprdnom, AV54Wcwinalmpqds_4_tfprdnom_sel, AV55Wcwinalmpqds_5_tfpeduni, AV56Wcwinalmpqds_6_tfpeduni_to, AV57Wcwinalmpqds_7_tfpedcanent, AV58Wcwinalmpqds_8_tfpedcanent_to, lV59Wcwinalmpqds_9_tfprdrec, AV60Wcwinalmpqds_10_tfprdrec_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8OV4 = false ;
         A719PrdNum = P08OV3_A719PrdNum[0] ;
         A396EmprCod = P08OV3_A396EmprCod[0] ;
         A659PedCum = P08OV3_A659PedCum[0] ;
         A667PedSit = P08OV3_A667PedSit[0] ;
         A658PedCod = P08OV3_A658PedCod[0] ;
         A727PrdRec = P08OV3_A727PrdRec[0] ;
         A657PedCanEnt = P08OV3_A657PedCanEnt[0] ;
         A669PedUni = P08OV3_A669PedUni[0] ;
         A718PrdNom = P08OV3_A718PrdNom[0] ;
         A727PrdRec = P08OV3_A727PrdRec[0] ;
         A718PrdNom = P08OV3_A718PrdNom[0] ;
         A667PedSit = P08OV3_A667PedSit[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08OV3_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P08OV3_A719PrdNum[0], A719PrdNum) == 0 ) )
         {
            brk8OV4 = false ;
            A658PedCod = P08OV3_A658PedCod[0] ;
            AV30count = (long)(AV30count+1) ;
            brk8OV4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A718PrdNom)==0) )
         {
            AV22Option = A718PrdNom ;
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
         if ( ! brk8OV4 )
         {
            brk8OV4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADPRDRECOPTIONS' Routine */
      returnInSub = false ;
      AV40TFPrdRec = AV18SearchTxt ;
      AV41TFPrdRec_Sel = "" ;
      AV51Wcwinalmpqds_1_tfprdnum = AV10TFPrdNum ;
      AV52Wcwinalmpqds_2_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV53Wcwinalmpqds_3_tfprdnom = AV12TFPrdNom ;
      AV54Wcwinalmpqds_4_tfprdnom_sel = AV13TFPrdNom_Sel ;
      AV55Wcwinalmpqds_5_tfpeduni = AV14TFPedUni ;
      AV56Wcwinalmpqds_6_tfpeduni_to = AV15TFPedUni_To ;
      AV57Wcwinalmpqds_7_tfpedcanent = AV16TFPedCanEnt ;
      AV58Wcwinalmpqds_8_tfpedcanent_to = AV17TFPedCanEnt_To ;
      AV59Wcwinalmpqds_9_tfprdrec = AV40TFPrdRec ;
      AV60Wcwinalmpqds_10_tfprdrec_sel = AV41TFPrdRec_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV52Wcwinalmpqds_2_tfprdnum_sel ,
                                           AV51Wcwinalmpqds_1_tfprdnum ,
                                           AV54Wcwinalmpqds_4_tfprdnom_sel ,
                                           AV53Wcwinalmpqds_3_tfprdnom ,
                                           AV55Wcwinalmpqds_5_tfpeduni ,
                                           AV56Wcwinalmpqds_6_tfpeduni_to ,
                                           AV57Wcwinalmpqds_7_tfpedcanent ,
                                           AV58Wcwinalmpqds_8_tfpedcanent_to ,
                                           AV60Wcwinalmpqds_10_tfprdrec_sel ,
                                           AV59Wcwinalmpqds_9_tfprdrec ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A669PedUni ,
                                           A657PedCanEnt ,
                                           A727PrdRec ,
                                           A396EmprCod ,
                                           AV36Emprcod ,
                                           Integer.valueOf(A658PedCod) ,
                                           Integer.valueOf(AV37Pedcod) ,
                                           A667PedSit ,
                                           A659PedCum } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV51Wcwinalmpqds_1_tfprdnum = GXutil.padr( GXutil.rtrim( AV51Wcwinalmpqds_1_tfprdnum), 6, "%") ;
      lV53Wcwinalmpqds_3_tfprdnom = GXutil.padr( GXutil.rtrim( AV53Wcwinalmpqds_3_tfprdnom), 26, "%") ;
      lV59Wcwinalmpqds_9_tfprdrec = GXutil.padr( GXutil.rtrim( AV59Wcwinalmpqds_9_tfprdrec), 1, "%") ;
      /* Using cursor P08OV4 */
      pr_default.execute(2, new Object[] {AV36Emprcod, Integer.valueOf(AV37Pedcod), lV51Wcwinalmpqds_1_tfprdnum, AV52Wcwinalmpqds_2_tfprdnum_sel, lV53Wcwinalmpqds_3_tfprdnom, AV54Wcwinalmpqds_4_tfprdnom_sel, AV55Wcwinalmpqds_5_tfpeduni, AV56Wcwinalmpqds_6_tfpeduni_to, AV57Wcwinalmpqds_7_tfpedcanent, AV58Wcwinalmpqds_8_tfpedcanent_to, lV59Wcwinalmpqds_9_tfprdrec, AV60Wcwinalmpqds_10_tfprdrec_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk8OV6 = false ;
         A396EmprCod = P08OV4_A396EmprCod[0] ;
         A658PedCod = P08OV4_A658PedCod[0] ;
         A667PedSit = P08OV4_A667PedSit[0] ;
         A659PedCum = P08OV4_A659PedCum[0] ;
         A727PrdRec = P08OV4_A727PrdRec[0] ;
         A657PedCanEnt = P08OV4_A657PedCanEnt[0] ;
         A669PedUni = P08OV4_A669PedUni[0] ;
         A718PrdNom = P08OV4_A718PrdNom[0] ;
         A719PrdNum = P08OV4_A719PrdNum[0] ;
         A667PedSit = P08OV4_A667PedSit[0] ;
         A727PrdRec = P08OV4_A727PrdRec[0] ;
         A718PrdNom = P08OV4_A718PrdNom[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P08OV4_A727PrdRec[0], A727PrdRec) == 0 ) )
         {
            brk8OV6 = false ;
            A396EmprCod = P08OV4_A396EmprCod[0] ;
            A658PedCod = P08OV4_A658PedCod[0] ;
            A719PrdNum = P08OV4_A719PrdNum[0] ;
            AV30count = (long)(AV30count+1) ;
            brk8OV6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A727PrdRec)==0) )
         {
            AV22Option = A727PrdRec ;
            AV23Options.add(AV22Option, 0);
            AV28OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV23Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8OV6 )
         {
            brk8OV6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP3[0] = wcwinalmpqgetfilterdata.this.AV24OptionsJson;
      this.aP4[0] = wcwinalmpqgetfilterdata.this.AV27OptionsDescJson;
      this.aP5[0] = wcwinalmpqgetfilterdata.this.AV29OptionIndexesJson;
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
      AV10TFPrdNum = "" ;
      AV11TFPrdNum_Sel = "" ;
      AV12TFPrdNom = "" ;
      AV13TFPrdNom_Sel = "" ;
      AV14TFPedUni = DecimalUtil.ZERO ;
      AV15TFPedUni_To = DecimalUtil.ZERO ;
      AV16TFPedCanEnt = DecimalUtil.ZERO ;
      AV17TFPedCanEnt_To = DecimalUtil.ZERO ;
      AV40TFPrdRec = "" ;
      AV41TFPrdRec_Sel = "" ;
      AV36Emprcod = "" ;
      AV38EntNAlbar = "" ;
      AV39EntFecEnt = GXutil.nullDate() ;
      AV46PrvNom = "" ;
      A719PrdNum = "" ;
      AV51Wcwinalmpqds_1_tfprdnum = "" ;
      AV52Wcwinalmpqds_2_tfprdnum_sel = "" ;
      AV53Wcwinalmpqds_3_tfprdnom = "" ;
      AV54Wcwinalmpqds_4_tfprdnom_sel = "" ;
      AV55Wcwinalmpqds_5_tfpeduni = DecimalUtil.ZERO ;
      AV56Wcwinalmpqds_6_tfpeduni_to = DecimalUtil.ZERO ;
      AV57Wcwinalmpqds_7_tfpedcanent = DecimalUtil.ZERO ;
      AV58Wcwinalmpqds_8_tfpedcanent_to = DecimalUtil.ZERO ;
      AV59Wcwinalmpqds_9_tfprdrec = "" ;
      AV60Wcwinalmpqds_10_tfprdrec_sel = "" ;
      scmdbuf = "" ;
      lV51Wcwinalmpqds_1_tfprdnum = "" ;
      lV53Wcwinalmpqds_3_tfprdnom = "" ;
      lV59Wcwinalmpqds_9_tfprdrec = "" ;
      A718PrdNom = "" ;
      A669PedUni = DecimalUtil.ZERO ;
      A657PedCanEnt = DecimalUtil.ZERO ;
      A727PrdRec = "" ;
      A667PedSit = "" ;
      A659PedCum = "" ;
      A396EmprCod = "" ;
      P08OV2_A658PedCod = new int[1] ;
      P08OV2_A396EmprCod = new String[] {""} ;
      P08OV2_A719PrdNum = new String[] {""} ;
      P08OV2_A659PedCum = new String[] {""} ;
      P08OV2_A667PedSit = new String[] {""} ;
      P08OV2_A727PrdRec = new String[] {""} ;
      P08OV2_A657PedCanEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08OV2_A669PedUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08OV2_A718PrdNom = new String[] {""} ;
      AV22Option = "" ;
      P08OV3_A719PrdNum = new String[] {""} ;
      P08OV3_A396EmprCod = new String[] {""} ;
      P08OV3_A659PedCum = new String[] {""} ;
      P08OV3_A667PedSit = new String[] {""} ;
      P08OV3_A658PedCod = new int[1] ;
      P08OV3_A727PrdRec = new String[] {""} ;
      P08OV3_A657PedCanEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08OV3_A669PedUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08OV3_A718PrdNom = new String[] {""} ;
      P08OV4_A396EmprCod = new String[] {""} ;
      P08OV4_A658PedCod = new int[1] ;
      P08OV4_A667PedSit = new String[] {""} ;
      P08OV4_A659PedCum = new String[] {""} ;
      P08OV4_A727PrdRec = new String[] {""} ;
      P08OV4_A657PedCanEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08OV4_A669PedUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08OV4_A718PrdNom = new String[] {""} ;
      P08OV4_A719PrdNum = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcwinalmpqgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08OV2_A658PedCod, P08OV2_A396EmprCod, P08OV2_A719PrdNum, P08OV2_A659PedCum, P08OV2_A667PedSit, P08OV2_A727PrdRec, P08OV2_A657PedCanEnt, P08OV2_A669PedUni, P08OV2_A718PrdNom
            }
            , new Object[] {
            P08OV3_A719PrdNum, P08OV3_A396EmprCod, P08OV3_A659PedCum, P08OV3_A667PedSit, P08OV3_A658PedCod, P08OV3_A727PrdRec, P08OV3_A657PedCanEnt, P08OV3_A669PedUni, P08OV3_A718PrdNom
            }
            , new Object[] {
            P08OV4_A396EmprCod, P08OV4_A658PedCod, P08OV4_A667PedSit, P08OV4_A659PedCum, P08OV4_A727PrdRec, P08OV4_A657PedCanEnt, P08OV4_A669PedUni, P08OV4_A718PrdNom, P08OV4_A719PrdNum
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV49GXV1 ;
   private int AV37Pedcod ;
   private int AV44PrvNum ;
   private int A658PedCod ;
   private int AV21InsertIndex ;
   private long AV30count ;
   private java.math.BigDecimal AV14TFPedUni ;
   private java.math.BigDecimal AV15TFPedUni_To ;
   private java.math.BigDecimal AV16TFPedCanEnt ;
   private java.math.BigDecimal AV17TFPedCanEnt_To ;
   private java.math.BigDecimal AV55Wcwinalmpqds_5_tfpeduni ;
   private java.math.BigDecimal AV56Wcwinalmpqds_6_tfpeduni_to ;
   private java.math.BigDecimal AV57Wcwinalmpqds_7_tfpedcanent ;
   private java.math.BigDecimal AV58Wcwinalmpqds_8_tfpedcanent_to ;
   private java.math.BigDecimal A669PedUni ;
   private java.math.BigDecimal A657PedCanEnt ;
   private String AV10TFPrdNum ;
   private String AV11TFPrdNum_Sel ;
   private String AV12TFPrdNom ;
   private String AV13TFPrdNom_Sel ;
   private String AV40TFPrdRec ;
   private String AV41TFPrdRec_Sel ;
   private String AV36Emprcod ;
   private String AV38EntNAlbar ;
   private String AV46PrvNom ;
   private String A719PrdNum ;
   private String AV51Wcwinalmpqds_1_tfprdnum ;
   private String AV52Wcwinalmpqds_2_tfprdnum_sel ;
   private String AV53Wcwinalmpqds_3_tfprdnom ;
   private String AV54Wcwinalmpqds_4_tfprdnom_sel ;
   private String AV59Wcwinalmpqds_9_tfprdrec ;
   private String AV60Wcwinalmpqds_10_tfprdrec_sel ;
   private String scmdbuf ;
   private String lV51Wcwinalmpqds_1_tfprdnum ;
   private String lV53Wcwinalmpqds_3_tfprdnom ;
   private String lV59Wcwinalmpqds_9_tfprdrec ;
   private String A718PrdNom ;
   private String A727PrdRec ;
   private String A667PedSit ;
   private String A659PedCum ;
   private String A396EmprCod ;
   private java.util.Date AV39EntFecEnt ;
   private boolean returnInSub ;
   private boolean brk8OV2 ;
   private boolean brk8OV4 ;
   private boolean brk8OV6 ;
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
   private int[] P08OV2_A658PedCod ;
   private String[] P08OV2_A396EmprCod ;
   private String[] P08OV2_A719PrdNum ;
   private String[] P08OV2_A659PedCum ;
   private String[] P08OV2_A667PedSit ;
   private String[] P08OV2_A727PrdRec ;
   private java.math.BigDecimal[] P08OV2_A657PedCanEnt ;
   private java.math.BigDecimal[] P08OV2_A669PedUni ;
   private String[] P08OV2_A718PrdNom ;
   private String[] P08OV3_A719PrdNum ;
   private String[] P08OV3_A396EmprCod ;
   private String[] P08OV3_A659PedCum ;
   private String[] P08OV3_A667PedSit ;
   private int[] P08OV3_A658PedCod ;
   private String[] P08OV3_A727PrdRec ;
   private java.math.BigDecimal[] P08OV3_A657PedCanEnt ;
   private java.math.BigDecimal[] P08OV3_A669PedUni ;
   private String[] P08OV3_A718PrdNom ;
   private String[] P08OV4_A396EmprCod ;
   private int[] P08OV4_A658PedCod ;
   private String[] P08OV4_A667PedSit ;
   private String[] P08OV4_A659PedCum ;
   private String[] P08OV4_A727PrdRec ;
   private java.math.BigDecimal[] P08OV4_A657PedCanEnt ;
   private java.math.BigDecimal[] P08OV4_A669PedUni ;
   private String[] P08OV4_A718PrdNom ;
   private String[] P08OV4_A719PrdNum ;
   private GXSimpleCollection<String> AV23Options ;
   private GXSimpleCollection<String> AV26OptionsDesc ;
   private GXSimpleCollection<String> AV28OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV33GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV34GridStateFilterValue ;
}

final  class wcwinalmpqgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08OV2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV52Wcwinalmpqds_2_tfprdnum_sel ,
                                          String AV51Wcwinalmpqds_1_tfprdnum ,
                                          String AV54Wcwinalmpqds_4_tfprdnom_sel ,
                                          String AV53Wcwinalmpqds_3_tfprdnom ,
                                          java.math.BigDecimal AV55Wcwinalmpqds_5_tfpeduni ,
                                          java.math.BigDecimal AV56Wcwinalmpqds_6_tfpeduni_to ,
                                          java.math.BigDecimal AV57Wcwinalmpqds_7_tfpedcanent ,
                                          java.math.BigDecimal AV58Wcwinalmpqds_8_tfpedcanent_to ,
                                          String AV60Wcwinalmpqds_10_tfprdrec_sel ,
                                          String AV59Wcwinalmpqds_9_tfprdrec ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A669PedUni ,
                                          java.math.BigDecimal A657PedCanEnt ,
                                          String A727PrdRec ,
                                          String A667PedSit ,
                                          String A659PedCum ,
                                          String AV36Emprcod ,
                                          int AV37Pedcod ,
                                          String A396EmprCod ,
                                          int A658PedCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[12];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.PedCod, T1.EmprCod, T1.PrdNum, T1.PedCum, T2.PedSit, T3.PrdRec, T1.PedCanEnt, T1.PedUni, T3.PrdNom FROM ((TXPLPEDID T1 INNER JOIN TXPCPEDID T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.PedCod = T1.PedCod) INNER JOIN TXPPRODUC T3 ON T3.EmprCod = T1.EmprCod AND T3.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.PedCod = ?)");
      addWhere(sWhereString, "(T2.PedSit = 'N')");
      addWhere(sWhereString, "(T1.PedCum = 'N')");
      if ( (GXutil.strcmp("", AV52Wcwinalmpqds_2_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV51Wcwinalmpqds_1_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV52Wcwinalmpqds_2_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54Wcwinalmpqds_4_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV53Wcwinalmpqds_3_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Wcwinalmpqds_4_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.PrdNom = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV55Wcwinalmpqds_5_tfpeduni)==0) )
      {
         addWhere(sWhereString, "(T1.PedUni >= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV56Wcwinalmpqds_6_tfpeduni_to)==0) )
      {
         addWhere(sWhereString, "(T1.PedUni <= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV57Wcwinalmpqds_7_tfpedcanent)==0) )
      {
         addWhere(sWhereString, "(T1.PedCanEnt >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV58Wcwinalmpqds_8_tfpedcanent_to)==0) )
      {
         addWhere(sWhereString, "(T1.PedCanEnt <= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Wcwinalmpqds_10_tfprdrec_sel)==0) && ( ! (GXutil.strcmp("", AV59Wcwinalmpqds_9_tfprdrec)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.PrdRec) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Wcwinalmpqds_10_tfprdrec_sel)==0) )
      {
         addWhere(sWhereString, "(T3.PrdRec = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PedCod, T1.PrdNum" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08OV3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV52Wcwinalmpqds_2_tfprdnum_sel ,
                                          String AV51Wcwinalmpqds_1_tfprdnum ,
                                          String AV54Wcwinalmpqds_4_tfprdnom_sel ,
                                          String AV53Wcwinalmpqds_3_tfprdnom ,
                                          java.math.BigDecimal AV55Wcwinalmpqds_5_tfpeduni ,
                                          java.math.BigDecimal AV56Wcwinalmpqds_6_tfpeduni_to ,
                                          java.math.BigDecimal AV57Wcwinalmpqds_7_tfpedcanent ,
                                          java.math.BigDecimal AV58Wcwinalmpqds_8_tfpedcanent_to ,
                                          String AV60Wcwinalmpqds_10_tfprdrec_sel ,
                                          String AV59Wcwinalmpqds_9_tfprdrec ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A669PedUni ,
                                          java.math.BigDecimal A657PedCanEnt ,
                                          String A727PrdRec ,
                                          int A658PedCod ,
                                          int AV37Pedcod ,
                                          String A667PedSit ,
                                          String A659PedCum ,
                                          String AV36Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[12];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.PrdNum, T1.EmprCod, T1.PedCum, T3.PedSit, T1.PedCod, T2.PrdRec, T1.PedCanEnt, T1.PedUni, T2.PrdNom FROM ((TXPLPEDID T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPCPEDID T3 ON T3.EmprCod = T1.EmprCod AND T3.PedCod = T1.PedCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.PedCod = ?)");
      addWhere(sWhereString, "(T3.PedSit = 'N')");
      addWhere(sWhereString, "(T1.PedCum = 'N')");
      if ( (GXutil.strcmp("", AV52Wcwinalmpqds_2_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV51Wcwinalmpqds_1_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV52Wcwinalmpqds_2_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54Wcwinalmpqds_4_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV53Wcwinalmpqds_3_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Wcwinalmpqds_4_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV55Wcwinalmpqds_5_tfpeduni)==0) )
      {
         addWhere(sWhereString, "(T1.PedUni >= ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV56Wcwinalmpqds_6_tfpeduni_to)==0) )
      {
         addWhere(sWhereString, "(T1.PedUni <= ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV57Wcwinalmpqds_7_tfpedcanent)==0) )
      {
         addWhere(sWhereString, "(T1.PedCanEnt >= ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV58Wcwinalmpqds_8_tfpedcanent_to)==0) )
      {
         addWhere(sWhereString, "(T1.PedCanEnt <= ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Wcwinalmpqds_10_tfprdrec_sel)==0) && ( ! (GXutil.strcmp("", AV59Wcwinalmpqds_9_tfprdrec)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdRec) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Wcwinalmpqds_10_tfprdrec_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdRec = ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrdNum" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P08OV4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV52Wcwinalmpqds_2_tfprdnum_sel ,
                                          String AV51Wcwinalmpqds_1_tfprdnum ,
                                          String AV54Wcwinalmpqds_4_tfprdnom_sel ,
                                          String AV53Wcwinalmpqds_3_tfprdnom ,
                                          java.math.BigDecimal AV55Wcwinalmpqds_5_tfpeduni ,
                                          java.math.BigDecimal AV56Wcwinalmpqds_6_tfpeduni_to ,
                                          java.math.BigDecimal AV57Wcwinalmpqds_7_tfpedcanent ,
                                          java.math.BigDecimal AV58Wcwinalmpqds_8_tfpedcanent_to ,
                                          String AV60Wcwinalmpqds_10_tfprdrec_sel ,
                                          String AV59Wcwinalmpqds_9_tfprdrec ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A669PedUni ,
                                          java.math.BigDecimal A657PedCanEnt ,
                                          String A727PrdRec ,
                                          String A396EmprCod ,
                                          String AV36Emprcod ,
                                          int A658PedCod ,
                                          int AV37Pedcod ,
                                          String A667PedSit ,
                                          String A659PedCum )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[12];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.PedCod, T2.PedSit, T1.PedCum, T3.PrdRec, T1.PedCanEnt, T1.PedUni, T3.PrdNom, T1.PrdNum FROM ((TXPLPEDID T1 INNER JOIN TXPCPEDID T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.PedCod = T1.PedCod) INNER JOIN TXPPRODUC T3 ON T3.EmprCod = T1.EmprCod AND T3.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.PedCod = ?)");
      addWhere(sWhereString, "(T2.PedSit = 'N')");
      addWhere(sWhereString, "(T1.PedCum = 'N')");
      if ( (GXutil.strcmp("", AV52Wcwinalmpqds_2_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV51Wcwinalmpqds_1_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV52Wcwinalmpqds_2_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54Wcwinalmpqds_4_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV53Wcwinalmpqds_3_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Wcwinalmpqds_4_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.PrdNom = ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV55Wcwinalmpqds_5_tfpeduni)==0) )
      {
         addWhere(sWhereString, "(T1.PedUni >= ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV56Wcwinalmpqds_6_tfpeduni_to)==0) )
      {
         addWhere(sWhereString, "(T1.PedUni <= ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV57Wcwinalmpqds_7_tfpedcanent)==0) )
      {
         addWhere(sWhereString, "(T1.PedCanEnt >= ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV58Wcwinalmpqds_8_tfpedcanent_to)==0) )
      {
         addWhere(sWhereString, "(T1.PedCanEnt <= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Wcwinalmpqds_10_tfprdrec_sel)==0) && ( ! (GXutil.strcmp("", AV59Wcwinalmpqds_9_tfprdrec)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.PrdRec) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Wcwinalmpqds_10_tfprdrec_sel)==0) )
      {
         addWhere(sWhereString, "(T3.PrdRec = ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T3.PrdRec" ;
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
                  return conditional_P08OV2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() );
            case 1 :
                  return conditional_P08OV3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] );
            case 2 :
                  return conditional_P08OV4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08OV2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08OV3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08OV4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[8])[0] = rslt.getString(9, 26);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[8])[0] = rslt.getString(9, 26);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
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
                  stmt.setString(sIdx, (String)parms[12], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 26);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 26);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[18], 2);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[19], 2);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[20], 2);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[21], 2);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 1);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 1);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 26);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 26);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[18], 2);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[19], 2);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[20], 2);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[21], 2);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 1);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 1);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 26);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 26);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[18], 2);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[19], 2);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[20], 2);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[21], 2);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 1);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 1);
               }
               return;
      }
   }

}

