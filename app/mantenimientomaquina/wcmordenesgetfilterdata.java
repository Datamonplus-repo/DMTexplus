package app.mantenimientomaquina ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wcmordenesgetfilterdata extends GXProcedure
{
   public wcmordenesgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcmordenesgetfilterdata.class ), "" );
   }

   public wcmordenesgetfilterdata( int remoteHandle ,
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
      wcmordenesgetfilterdata.this.aP5 = new String[] {""};
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
      wcmordenesgetfilterdata.this.AV56DDOName = aP0;
      wcmordenesgetfilterdata.this.AV54SearchTxt = aP1;
      wcmordenesgetfilterdata.this.AV55SearchTxtTo = aP2;
      wcmordenesgetfilterdata.this.aP3 = aP3;
      wcmordenesgetfilterdata.this.aP4 = aP4;
      wcmordenesgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV59Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV62OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV64OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV56DDOName), "DDO_OMMAQDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADOMMAQDSCOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV56DDOName), "DDO_OMTXT") == 0 )
      {
         /* Execute user subroutine: 'LOADOMTXTOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV56DDOName), "DDO_OMNOT") == 0 )
      {
         /* Execute user subroutine: 'LOADOMNOTOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV56DDOName), "DDO_OMUSUCRE") == 0 )
      {
         /* Execute user subroutine: 'LOADOMUSUCREOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV60OptionsJson = AV59Options.toJSonString(false) ;
      AV63OptionsDescJson = AV62OptionsDesc.toJSonString(false) ;
      AV65OptionIndexesJson = AV64OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV67Session.getValue("MantenimientoMaquina.WCMOrdenesGridState"), "") == 0 )
      {
         AV69GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "MantenimientoMaquina.WCMOrdenesGridState"), null, null);
      }
      else
      {
         AV69GridState.fromxml(AV67Session.getValue("MantenimientoMaquina.WCMOrdenesGridState"), null, null);
      }
      AV77GXV1 = 1 ;
      while ( AV77GXV1 <= AV69GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV70GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV69GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV77GXV1));
         if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV72FilterFullText = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMCOD") == 0 )
         {
            AV14TFOMCod = (int)(GXutil.lval( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV15TFOMCod_To = (int)(GXutil.lval( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMEST_SEL") == 0 )
         {
            AV50TFOMEst_SelsJson = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV51TFOMEst_Sels.fromJSonString(AV50TFOMEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMMAQDSC") == 0 )
         {
            AV20TFOMMaqDsc = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMMAQDSC_SEL") == 0 )
         {
            AV21TFOMMaqDsc_Sel = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMTXT") == 0 )
         {
            AV28TFOMTxt = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMTXT_SEL") == 0 )
         {
            AV29TFOMTxt_Sel = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMNOT") == 0 )
         {
            AV52TFOMNot = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMNOT_SEL") == 0 )
         {
            AV53TFOMNot_Sel = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMFCHPRE") == 0 )
         {
            AV30TFOMFchPre = localUtil.ctod( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMFCHCER") == 0 )
         {
            AV32TFOMFchCer = localUtil.ctot( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMFCHCRE") == 0 )
         {
            AV34TFOMFchCre = localUtil.ctot( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMUSUCRE") == 0 )
         {
            AV38TFOMUsuCre = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMUSUCRE_SEL") == 0 )
         {
            AV39TFOMUsuCre_Sel = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV73EmprCod = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&SMCOD") == 0 )
         {
            AV74SMCod = (int)(GXutil.lval( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV77GXV1 = (int)(AV77GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADOMMAQDSCOPTIONS' Routine */
      returnInSub = false ;
      AV20TFOMMaqDsc = AV54SearchTxt ;
      AV21TFOMMaqDsc_Sel = "" ;
      AV79Mantenimientomaquina_wcmordenesds_1_emprcod = AV73EmprCod ;
      AV80Mantenimientomaquina_wcmordenesds_2_smcod = AV74SMCod ;
      AV81Mantenimientomaquina_wcmordenesds_3_filterfulltext = AV72FilterFullText ;
      AV82Mantenimientomaquina_wcmordenesds_4_tfomcod = AV14TFOMCod ;
      AV83Mantenimientomaquina_wcmordenesds_5_tfomcod_to = AV15TFOMCod_To ;
      AV84Mantenimientomaquina_wcmordenesds_6_tfomest_sels = AV51TFOMEst_Sels ;
      AV85Mantenimientomaquina_wcmordenesds_7_tfommaqdsc = AV20TFOMMaqDsc ;
      AV86Mantenimientomaquina_wcmordenesds_8_tfommaqdsc_sel = AV21TFOMMaqDsc_Sel ;
      AV87Mantenimientomaquina_wcmordenesds_9_tfomtxt = AV28TFOMTxt ;
      AV88Mantenimientomaquina_wcmordenesds_10_tfomtxt_sel = AV29TFOMTxt_Sel ;
      AV89Mantenimientomaquina_wcmordenesds_11_tfomnot = AV52TFOMNot ;
      AV90Mantenimientomaquina_wcmordenesds_12_tfomnot_sel = AV53TFOMNot_Sel ;
      AV91Mantenimientomaquina_wcmordenesds_13_tfomfchpre = AV30TFOMFchPre ;
      AV92Mantenimientomaquina_wcmordenesds_14_tfomfchcer = AV32TFOMFchCer ;
      AV93Mantenimientomaquina_wcmordenesds_15_tfomfchcre = AV34TFOMFchCre ;
      AV94Mantenimientomaquina_wcmordenesds_16_tfomusucre = AV38TFOMUsuCre ;
      AV95Mantenimientomaquina_wcmordenesds_17_tfomusucre_sel = AV39TFOMUsuCre_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A9445OMEst ,
                                           AV84Mantenimientomaquina_wcmordenesds_6_tfomest_sels ,
                                           Integer.valueOf(AV82Mantenimientomaquina_wcmordenesds_4_tfomcod) ,
                                           Integer.valueOf(AV83Mantenimientomaquina_wcmordenesds_5_tfomcod_to) ,
                                           Integer.valueOf(AV84Mantenimientomaquina_wcmordenesds_6_tfomest_sels.size()) ,
                                           AV86Mantenimientomaquina_wcmordenesds_8_tfommaqdsc_sel ,
                                           AV85Mantenimientomaquina_wcmordenesds_7_tfommaqdsc ,
                                           AV88Mantenimientomaquina_wcmordenesds_10_tfomtxt_sel ,
                                           AV87Mantenimientomaquina_wcmordenesds_9_tfomtxt ,
                                           AV90Mantenimientomaquina_wcmordenesds_12_tfomnot_sel ,
                                           AV89Mantenimientomaquina_wcmordenesds_11_tfomnot ,
                                           AV91Mantenimientomaquina_wcmordenesds_13_tfomfchpre ,
                                           AV92Mantenimientomaquina_wcmordenesds_14_tfomfchcer ,
                                           AV93Mantenimientomaquina_wcmordenesds_15_tfomfchcre ,
                                           AV95Mantenimientomaquina_wcmordenesds_17_tfomusucre_sel ,
                                           AV94Mantenimientomaquina_wcmordenesds_16_tfomusucre ,
                                           Integer.valueOf(A9425OMCod) ,
                                           A9427OMMaqDsc ,
                                           A9433OMTxt ,
                                           A9464OMNot ,
                                           A9438OMFchPre ,
                                           A9439OMFchCer ,
                                           A9436OMFchCre ,
                                           A9437OMUsuCre ,
                                           AV81Mantenimientomaquina_wcmordenesds_3_filterfulltext ,
                                           AV79Mantenimientomaquina_wcmordenesds_1_emprcod ,
                                           Integer.valueOf(AV80Mantenimientomaquina_wcmordenesds_2_smcod) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A9428SMCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN
                                           }
      });
      lV85Mantenimientomaquina_wcmordenesds_7_tfommaqdsc = GXutil.padr( GXutil.rtrim( AV85Mantenimientomaquina_wcmordenesds_7_tfommaqdsc), 16, "%") ;
      lV87Mantenimientomaquina_wcmordenesds_9_tfomtxt = GXutil.concat( GXutil.rtrim( AV87Mantenimientomaquina_wcmordenesds_9_tfomtxt), "%", "") ;
      lV89Mantenimientomaquina_wcmordenesds_11_tfomnot = GXutil.concat( GXutil.rtrim( AV89Mantenimientomaquina_wcmordenesds_11_tfomnot), "%", "") ;
      lV94Mantenimientomaquina_wcmordenesds_16_tfomusucre = GXutil.padr( GXutil.rtrim( AV94Mantenimientomaquina_wcmordenesds_16_tfomusucre), 8, "%") ;
      /* Using cursor P08EM2 */
      pr_default.execute(0, new Object[] {AV79Mantenimientomaquina_wcmordenesds_1_emprcod, Integer.valueOf(AV80Mantenimientomaquina_wcmordenesds_2_smcod), Integer.valueOf(AV82Mantenimientomaquina_wcmordenesds_4_tfomcod), Integer.valueOf(AV83Mantenimientomaquina_wcmordenesds_5_tfomcod_to), lV85Mantenimientomaquina_wcmordenesds_7_tfommaqdsc, AV86Mantenimientomaquina_wcmordenesds_8_tfommaqdsc_sel, lV87Mantenimientomaquina_wcmordenesds_9_tfomtxt, AV88Mantenimientomaquina_wcmordenesds_10_tfomtxt_sel, lV89Mantenimientomaquina_wcmordenesds_11_tfomnot, AV90Mantenimientomaquina_wcmordenesds_12_tfomnot_sel, AV91Mantenimientomaquina_wcmordenesds_13_tfomfchpre, AV92Mantenimientomaquina_wcmordenesds_14_tfomfchcer, AV93Mantenimientomaquina_wcmordenesds_15_tfomfchcre, lV94Mantenimientomaquina_wcmordenesds_16_tfomusucre, AV95Mantenimientomaquina_wcmordenesds_17_tfomusucre_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8EM2 = false ;
         A396EmprCod = P08EM2_A396EmprCod[0] ;
         A9428SMCod = P08EM2_A9428SMCod[0] ;
         n9428SMCod = P08EM2_n9428SMCod[0] ;
         A9426OMMaqCod = P08EM2_A9426OMMaqCod[0] ;
         A9437OMUsuCre = P08EM2_A9437OMUsuCre[0] ;
         A9436OMFchCre = P08EM2_A9436OMFchCre[0] ;
         A9439OMFchCer = P08EM2_A9439OMFchCer[0] ;
         A9438OMFchPre = P08EM2_A9438OMFchPre[0] ;
         A9464OMNot = P08EM2_A9464OMNot[0] ;
         A9433OMTxt = P08EM2_A9433OMTxt[0] ;
         A9427OMMaqDsc = P08EM2_A9427OMMaqDsc[0] ;
         n9427OMMaqDsc = P08EM2_n9427OMMaqDsc[0] ;
         A9425OMCod = P08EM2_A9425OMCod[0] ;
         A9445OMEst = P08EM2_A9445OMEst[0] ;
         A9427OMMaqDsc = P08EM2_A9427OMMaqDsc[0] ;
         n9427OMMaqDsc = P08EM2_n9427OMMaqDsc[0] ;
         if ( (GXutil.strcmp("", AV81Mantenimientomaquina_wcmordenesds_3_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A9425OMCod, 8, 0) , GXutil.padr( "%" + AV81Mantenimientomaquina_wcmordenesds_3_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "pendiente", ""), "") , GXutil.padr( "%" + GXutil.lower( AV81Mantenimientomaquina_wcmordenesds_3_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "realizada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV81Mantenimientomaquina_wcmordenesds_3_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "R", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A9427OMMaqDsc) , GXutil.padr( "%" + GXutil.upper( AV81Mantenimientomaquina_wcmordenesds_3_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9433OMTxt) , GXutil.padr( "%" + GXutil.upper( AV81Mantenimientomaquina_wcmordenesds_3_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9464OMNot) , GXutil.padr( "%" + GXutil.upper( AV81Mantenimientomaquina_wcmordenesds_3_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9437OMUsuCre) , GXutil.padr( "%" + GXutil.upper( AV81Mantenimientomaquina_wcmordenesds_3_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV66count = 0 ;
            while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08EM2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P08EM2_A9428SMCod[0] == A9428SMCod ) && ( GXutil.strcmp(P08EM2_A9426OMMaqCod[0], A9426OMMaqCod) == 0 ) )
            {
               brk8EM2 = false ;
               A9425OMCod = P08EM2_A9425OMCod[0] ;
               AV66count = (long)(AV66count+1) ;
               brk8EM2 = true ;
               pr_default.readNext(0);
            }
            if ( ! (GXutil.strcmp("", A9427OMMaqDsc)==0) )
            {
               AV58Option = A9427OMMaqDsc ;
               AV57InsertIndex = 1 ;
               while ( ( AV57InsertIndex <= AV59Options.size() ) && ( GXutil.strcmp((String)AV59Options.elementAt(-1+AV57InsertIndex), AV58Option) < 0 ) )
               {
                  AV57InsertIndex = (int)(AV57InsertIndex+1) ;
               }
               AV59Options.add(AV58Option, AV57InsertIndex);
               AV64OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV66count), "Z,ZZZ,ZZZ,ZZ9")), AV57InsertIndex);
            }
            if ( AV59Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk8EM2 )
         {
            brk8EM2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADOMTXTOPTIONS' Routine */
      returnInSub = false ;
      AV28TFOMTxt = AV54SearchTxt ;
      AV29TFOMTxt_Sel = "" ;
      AV79Mantenimientomaquina_wcmordenesds_1_emprcod = AV73EmprCod ;
      AV80Mantenimientomaquina_wcmordenesds_2_smcod = AV74SMCod ;
      AV81Mantenimientomaquina_wcmordenesds_3_filterfulltext = AV72FilterFullText ;
      AV82Mantenimientomaquina_wcmordenesds_4_tfomcod = AV14TFOMCod ;
      AV83Mantenimientomaquina_wcmordenesds_5_tfomcod_to = AV15TFOMCod_To ;
      AV84Mantenimientomaquina_wcmordenesds_6_tfomest_sels = AV51TFOMEst_Sels ;
      AV85Mantenimientomaquina_wcmordenesds_7_tfommaqdsc = AV20TFOMMaqDsc ;
      AV86Mantenimientomaquina_wcmordenesds_8_tfommaqdsc_sel = AV21TFOMMaqDsc_Sel ;
      AV87Mantenimientomaquina_wcmordenesds_9_tfomtxt = AV28TFOMTxt ;
      AV88Mantenimientomaquina_wcmordenesds_10_tfomtxt_sel = AV29TFOMTxt_Sel ;
      AV89Mantenimientomaquina_wcmordenesds_11_tfomnot = AV52TFOMNot ;
      AV90Mantenimientomaquina_wcmordenesds_12_tfomnot_sel = AV53TFOMNot_Sel ;
      AV91Mantenimientomaquina_wcmordenesds_13_tfomfchpre = AV30TFOMFchPre ;
      AV92Mantenimientomaquina_wcmordenesds_14_tfomfchcer = AV32TFOMFchCer ;
      AV93Mantenimientomaquina_wcmordenesds_15_tfomfchcre = AV34TFOMFchCre ;
      AV94Mantenimientomaquina_wcmordenesds_16_tfomusucre = AV38TFOMUsuCre ;
      AV95Mantenimientomaquina_wcmordenesds_17_tfomusucre_sel = AV39TFOMUsuCre_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           A9445OMEst ,
                                           AV84Mantenimientomaquina_wcmordenesds_6_tfomest_sels ,
                                           Integer.valueOf(AV82Mantenimientomaquina_wcmordenesds_4_tfomcod) ,
                                           Integer.valueOf(AV83Mantenimientomaquina_wcmordenesds_5_tfomcod_to) ,
                                           Integer.valueOf(AV84Mantenimientomaquina_wcmordenesds_6_tfomest_sels.size()) ,
                                           AV86Mantenimientomaquina_wcmordenesds_8_tfommaqdsc_sel ,
                                           AV85Mantenimientomaquina_wcmordenesds_7_tfommaqdsc ,
                                           AV88Mantenimientomaquina_wcmordenesds_10_tfomtxt_sel ,
                                           AV87Mantenimientomaquina_wcmordenesds_9_tfomtxt ,
                                           AV90Mantenimientomaquina_wcmordenesds_12_tfomnot_sel ,
                                           AV89Mantenimientomaquina_wcmordenesds_11_tfomnot ,
                                           AV91Mantenimientomaquina_wcmordenesds_13_tfomfchpre ,
                                           AV92Mantenimientomaquina_wcmordenesds_14_tfomfchcer ,
                                           AV93Mantenimientomaquina_wcmordenesds_15_tfomfchcre ,
                                           AV95Mantenimientomaquina_wcmordenesds_17_tfomusucre_sel ,
                                           AV94Mantenimientomaquina_wcmordenesds_16_tfomusucre ,
                                           Integer.valueOf(A9425OMCod) ,
                                           A9427OMMaqDsc ,
                                           A9433OMTxt ,
                                           A9464OMNot ,
                                           A9438OMFchPre ,
                                           A9439OMFchCer ,
                                           A9436OMFchCre ,
                                           A9437OMUsuCre ,
                                           AV81Mantenimientomaquina_wcmordenesds_3_filterfulltext ,
                                           AV79Mantenimientomaquina_wcmordenesds_1_emprcod ,
                                           Integer.valueOf(AV80Mantenimientomaquina_wcmordenesds_2_smcod) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A9428SMCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN
                                           }
      });
      lV85Mantenimientomaquina_wcmordenesds_7_tfommaqdsc = GXutil.padr( GXutil.rtrim( AV85Mantenimientomaquina_wcmordenesds_7_tfommaqdsc), 16, "%") ;
      lV87Mantenimientomaquina_wcmordenesds_9_tfomtxt = GXutil.concat( GXutil.rtrim( AV87Mantenimientomaquina_wcmordenesds_9_tfomtxt), "%", "") ;
      lV89Mantenimientomaquina_wcmordenesds_11_tfomnot = GXutil.concat( GXutil.rtrim( AV89Mantenimientomaquina_wcmordenesds_11_tfomnot), "%", "") ;
      lV94Mantenimientomaquina_wcmordenesds_16_tfomusucre = GXutil.padr( GXutil.rtrim( AV94Mantenimientomaquina_wcmordenesds_16_tfomusucre), 8, "%") ;
      /* Using cursor P08EM3 */
      pr_default.execute(1, new Object[] {AV79Mantenimientomaquina_wcmordenesds_1_emprcod, Integer.valueOf(AV80Mantenimientomaquina_wcmordenesds_2_smcod), Integer.valueOf(AV82Mantenimientomaquina_wcmordenesds_4_tfomcod), Integer.valueOf(AV83Mantenimientomaquina_wcmordenesds_5_tfomcod_to), lV85Mantenimientomaquina_wcmordenesds_7_tfommaqdsc, AV86Mantenimientomaquina_wcmordenesds_8_tfommaqdsc_sel, lV87Mantenimientomaquina_wcmordenesds_9_tfomtxt, AV88Mantenimientomaquina_wcmordenesds_10_tfomtxt_sel, lV89Mantenimientomaquina_wcmordenesds_11_tfomnot, AV90Mantenimientomaquina_wcmordenesds_12_tfomnot_sel, AV91Mantenimientomaquina_wcmordenesds_13_tfomfchpre, AV92Mantenimientomaquina_wcmordenesds_14_tfomfchcer, AV93Mantenimientomaquina_wcmordenesds_15_tfomfchcre, lV94Mantenimientomaquina_wcmordenesds_16_tfomusucre, AV95Mantenimientomaquina_wcmordenesds_17_tfomusucre_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8EM4 = false ;
         A9426OMMaqCod = P08EM3_A9426OMMaqCod[0] ;
         A396EmprCod = P08EM3_A396EmprCod[0] ;
         A9428SMCod = P08EM3_A9428SMCod[0] ;
         n9428SMCod = P08EM3_n9428SMCod[0] ;
         A9433OMTxt = P08EM3_A9433OMTxt[0] ;
         A9437OMUsuCre = P08EM3_A9437OMUsuCre[0] ;
         A9436OMFchCre = P08EM3_A9436OMFchCre[0] ;
         A9439OMFchCer = P08EM3_A9439OMFchCer[0] ;
         A9438OMFchPre = P08EM3_A9438OMFchPre[0] ;
         A9464OMNot = P08EM3_A9464OMNot[0] ;
         A9427OMMaqDsc = P08EM3_A9427OMMaqDsc[0] ;
         n9427OMMaqDsc = P08EM3_n9427OMMaqDsc[0] ;
         A9425OMCod = P08EM3_A9425OMCod[0] ;
         A9445OMEst = P08EM3_A9445OMEst[0] ;
         A9427OMMaqDsc = P08EM3_A9427OMMaqDsc[0] ;
         n9427OMMaqDsc = P08EM3_n9427OMMaqDsc[0] ;
         if ( (GXutil.strcmp("", AV81Mantenimientomaquina_wcmordenesds_3_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A9425OMCod, 8, 0) , GXutil.padr( "%" + AV81Mantenimientomaquina_wcmordenesds_3_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "pendiente", ""), "") , GXutil.padr( "%" + GXutil.lower( AV81Mantenimientomaquina_wcmordenesds_3_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "realizada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV81Mantenimientomaquina_wcmordenesds_3_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "R", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A9427OMMaqDsc) , GXutil.padr( "%" + GXutil.upper( AV81Mantenimientomaquina_wcmordenesds_3_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9433OMTxt) , GXutil.padr( "%" + GXutil.upper( AV81Mantenimientomaquina_wcmordenesds_3_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9464OMNot) , GXutil.padr( "%" + GXutil.upper( AV81Mantenimientomaquina_wcmordenesds_3_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9437OMUsuCre) , GXutil.padr( "%" + GXutil.upper( AV81Mantenimientomaquina_wcmordenesds_3_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV66count = 0 ;
            while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08EM3_A396EmprCod[0], A396EmprCod) == 0 ) && ( P08EM3_A9428SMCod[0] == A9428SMCod ) && ( GXutil.strcmp(P08EM3_A9433OMTxt[0], A9433OMTxt) == 0 ) )
            {
               brk8EM4 = false ;
               A9425OMCod = P08EM3_A9425OMCod[0] ;
               AV66count = (long)(AV66count+1) ;
               brk8EM4 = true ;
               pr_default.readNext(1);
            }
            if ( ! (GXutil.strcmp("", A9433OMTxt)==0) )
            {
               AV58Option = A9433OMTxt ;
               AV59Options.add(AV58Option, 0);
               AV64OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV66count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV59Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk8EM4 )
         {
            brk8EM4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADOMNOTOPTIONS' Routine */
      returnInSub = false ;
      AV52TFOMNot = AV54SearchTxt ;
      AV53TFOMNot_Sel = "" ;
      AV79Mantenimientomaquina_wcmordenesds_1_emprcod = AV73EmprCod ;
      AV80Mantenimientomaquina_wcmordenesds_2_smcod = AV74SMCod ;
      AV81Mantenimientomaquina_wcmordenesds_3_filterfulltext = AV72FilterFullText ;
      AV82Mantenimientomaquina_wcmordenesds_4_tfomcod = AV14TFOMCod ;
      AV83Mantenimientomaquina_wcmordenesds_5_tfomcod_to = AV15TFOMCod_To ;
      AV84Mantenimientomaquina_wcmordenesds_6_tfomest_sels = AV51TFOMEst_Sels ;
      AV85Mantenimientomaquina_wcmordenesds_7_tfommaqdsc = AV20TFOMMaqDsc ;
      AV86Mantenimientomaquina_wcmordenesds_8_tfommaqdsc_sel = AV21TFOMMaqDsc_Sel ;
      AV87Mantenimientomaquina_wcmordenesds_9_tfomtxt = AV28TFOMTxt ;
      AV88Mantenimientomaquina_wcmordenesds_10_tfomtxt_sel = AV29TFOMTxt_Sel ;
      AV89Mantenimientomaquina_wcmordenesds_11_tfomnot = AV52TFOMNot ;
      AV90Mantenimientomaquina_wcmordenesds_12_tfomnot_sel = AV53TFOMNot_Sel ;
      AV91Mantenimientomaquina_wcmordenesds_13_tfomfchpre = AV30TFOMFchPre ;
      AV92Mantenimientomaquina_wcmordenesds_14_tfomfchcer = AV32TFOMFchCer ;
      AV93Mantenimientomaquina_wcmordenesds_15_tfomfchcre = AV34TFOMFchCre ;
      AV94Mantenimientomaquina_wcmordenesds_16_tfomusucre = AV38TFOMUsuCre ;
      AV95Mantenimientomaquina_wcmordenesds_17_tfomusucre_sel = AV39TFOMUsuCre_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           A9445OMEst ,
                                           AV84Mantenimientomaquina_wcmordenesds_6_tfomest_sels ,
                                           Integer.valueOf(AV82Mantenimientomaquina_wcmordenesds_4_tfomcod) ,
                                           Integer.valueOf(AV83Mantenimientomaquina_wcmordenesds_5_tfomcod_to) ,
                                           Integer.valueOf(AV84Mantenimientomaquina_wcmordenesds_6_tfomest_sels.size()) ,
                                           AV86Mantenimientomaquina_wcmordenesds_8_tfommaqdsc_sel ,
                                           AV85Mantenimientomaquina_wcmordenesds_7_tfommaqdsc ,
                                           AV88Mantenimientomaquina_wcmordenesds_10_tfomtxt_sel ,
                                           AV87Mantenimientomaquina_wcmordenesds_9_tfomtxt ,
                                           AV90Mantenimientomaquina_wcmordenesds_12_tfomnot_sel ,
                                           AV89Mantenimientomaquina_wcmordenesds_11_tfomnot ,
                                           AV91Mantenimientomaquina_wcmordenesds_13_tfomfchpre ,
                                           AV92Mantenimientomaquina_wcmordenesds_14_tfomfchcer ,
                                           AV93Mantenimientomaquina_wcmordenesds_15_tfomfchcre ,
                                           AV95Mantenimientomaquina_wcmordenesds_17_tfomusucre_sel ,
                                           AV94Mantenimientomaquina_wcmordenesds_16_tfomusucre ,
                                           Integer.valueOf(A9425OMCod) ,
                                           A9427OMMaqDsc ,
                                           A9433OMTxt ,
                                           A9464OMNot ,
                                           A9438OMFchPre ,
                                           A9439OMFchCer ,
                                           A9436OMFchCre ,
                                           A9437OMUsuCre ,
                                           AV81Mantenimientomaquina_wcmordenesds_3_filterfulltext ,
                                           AV79Mantenimientomaquina_wcmordenesds_1_emprcod ,
                                           Integer.valueOf(AV80Mantenimientomaquina_wcmordenesds_2_smcod) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A9428SMCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN
                                           }
      });
      lV85Mantenimientomaquina_wcmordenesds_7_tfommaqdsc = GXutil.padr( GXutil.rtrim( AV85Mantenimientomaquina_wcmordenesds_7_tfommaqdsc), 16, "%") ;
      lV87Mantenimientomaquina_wcmordenesds_9_tfomtxt = GXutil.concat( GXutil.rtrim( AV87Mantenimientomaquina_wcmordenesds_9_tfomtxt), "%", "") ;
      lV89Mantenimientomaquina_wcmordenesds_11_tfomnot = GXutil.concat( GXutil.rtrim( AV89Mantenimientomaquina_wcmordenesds_11_tfomnot), "%", "") ;
      lV94Mantenimientomaquina_wcmordenesds_16_tfomusucre = GXutil.padr( GXutil.rtrim( AV94Mantenimientomaquina_wcmordenesds_16_tfomusucre), 8, "%") ;
      /* Using cursor P08EM4 */
      pr_default.execute(2, new Object[] {AV79Mantenimientomaquina_wcmordenesds_1_emprcod, Integer.valueOf(AV80Mantenimientomaquina_wcmordenesds_2_smcod), Integer.valueOf(AV82Mantenimientomaquina_wcmordenesds_4_tfomcod), Integer.valueOf(AV83Mantenimientomaquina_wcmordenesds_5_tfomcod_to), lV85Mantenimientomaquina_wcmordenesds_7_tfommaqdsc, AV86Mantenimientomaquina_wcmordenesds_8_tfommaqdsc_sel, lV87Mantenimientomaquina_wcmordenesds_9_tfomtxt, AV88Mantenimientomaquina_wcmordenesds_10_tfomtxt_sel, lV89Mantenimientomaquina_wcmordenesds_11_tfomnot, AV90Mantenimientomaquina_wcmordenesds_12_tfomnot_sel, AV91Mantenimientomaquina_wcmordenesds_13_tfomfchpre, AV92Mantenimientomaquina_wcmordenesds_14_tfomfchcer, AV93Mantenimientomaquina_wcmordenesds_15_tfomfchcre, lV94Mantenimientomaquina_wcmordenesds_16_tfomusucre, AV95Mantenimientomaquina_wcmordenesds_17_tfomusucre_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk8EM6 = false ;
         A9426OMMaqCod = P08EM4_A9426OMMaqCod[0] ;
         A396EmprCod = P08EM4_A396EmprCod[0] ;
         A9428SMCod = P08EM4_A9428SMCod[0] ;
         n9428SMCod = P08EM4_n9428SMCod[0] ;
         A9464OMNot = P08EM4_A9464OMNot[0] ;
         A9437OMUsuCre = P08EM4_A9437OMUsuCre[0] ;
         A9436OMFchCre = P08EM4_A9436OMFchCre[0] ;
         A9439OMFchCer = P08EM4_A9439OMFchCer[0] ;
         A9438OMFchPre = P08EM4_A9438OMFchPre[0] ;
         A9433OMTxt = P08EM4_A9433OMTxt[0] ;
         A9427OMMaqDsc = P08EM4_A9427OMMaqDsc[0] ;
         n9427OMMaqDsc = P08EM4_n9427OMMaqDsc[0] ;
         A9425OMCod = P08EM4_A9425OMCod[0] ;
         A9445OMEst = P08EM4_A9445OMEst[0] ;
         A9427OMMaqDsc = P08EM4_A9427OMMaqDsc[0] ;
         n9427OMMaqDsc = P08EM4_n9427OMMaqDsc[0] ;
         if ( (GXutil.strcmp("", AV81Mantenimientomaquina_wcmordenesds_3_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A9425OMCod, 8, 0) , GXutil.padr( "%" + AV81Mantenimientomaquina_wcmordenesds_3_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "pendiente", ""), "") , GXutil.padr( "%" + GXutil.lower( AV81Mantenimientomaquina_wcmordenesds_3_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "realizada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV81Mantenimientomaquina_wcmordenesds_3_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "R", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A9427OMMaqDsc) , GXutil.padr( "%" + GXutil.upper( AV81Mantenimientomaquina_wcmordenesds_3_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9433OMTxt) , GXutil.padr( "%" + GXutil.upper( AV81Mantenimientomaquina_wcmordenesds_3_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9464OMNot) , GXutil.padr( "%" + GXutil.upper( AV81Mantenimientomaquina_wcmordenesds_3_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9437OMUsuCre) , GXutil.padr( "%" + GXutil.upper( AV81Mantenimientomaquina_wcmordenesds_3_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV66count = 0 ;
            while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P08EM4_A396EmprCod[0], A396EmprCod) == 0 ) && ( P08EM4_A9428SMCod[0] == A9428SMCod ) && ( GXutil.strcmp(P08EM4_A9464OMNot[0], A9464OMNot) == 0 ) )
            {
               brk8EM6 = false ;
               A9425OMCod = P08EM4_A9425OMCod[0] ;
               AV66count = (long)(AV66count+1) ;
               brk8EM6 = true ;
               pr_default.readNext(2);
            }
            if ( ! (GXutil.strcmp("", A9464OMNot)==0) )
            {
               AV58Option = A9464OMNot ;
               AV59Options.add(AV58Option, 0);
               AV64OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV66count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV59Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk8EM6 )
         {
            brk8EM6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADOMUSUCREOPTIONS' Routine */
      returnInSub = false ;
      AV38TFOMUsuCre = AV54SearchTxt ;
      AV39TFOMUsuCre_Sel = "" ;
      AV79Mantenimientomaquina_wcmordenesds_1_emprcod = AV73EmprCod ;
      AV80Mantenimientomaquina_wcmordenesds_2_smcod = AV74SMCod ;
      AV81Mantenimientomaquina_wcmordenesds_3_filterfulltext = AV72FilterFullText ;
      AV82Mantenimientomaquina_wcmordenesds_4_tfomcod = AV14TFOMCod ;
      AV83Mantenimientomaquina_wcmordenesds_5_tfomcod_to = AV15TFOMCod_To ;
      AV84Mantenimientomaquina_wcmordenesds_6_tfomest_sels = AV51TFOMEst_Sels ;
      AV85Mantenimientomaquina_wcmordenesds_7_tfommaqdsc = AV20TFOMMaqDsc ;
      AV86Mantenimientomaquina_wcmordenesds_8_tfommaqdsc_sel = AV21TFOMMaqDsc_Sel ;
      AV87Mantenimientomaquina_wcmordenesds_9_tfomtxt = AV28TFOMTxt ;
      AV88Mantenimientomaquina_wcmordenesds_10_tfomtxt_sel = AV29TFOMTxt_Sel ;
      AV89Mantenimientomaquina_wcmordenesds_11_tfomnot = AV52TFOMNot ;
      AV90Mantenimientomaquina_wcmordenesds_12_tfomnot_sel = AV53TFOMNot_Sel ;
      AV91Mantenimientomaquina_wcmordenesds_13_tfomfchpre = AV30TFOMFchPre ;
      AV92Mantenimientomaquina_wcmordenesds_14_tfomfchcer = AV32TFOMFchCer ;
      AV93Mantenimientomaquina_wcmordenesds_15_tfomfchcre = AV34TFOMFchCre ;
      AV94Mantenimientomaquina_wcmordenesds_16_tfomusucre = AV38TFOMUsuCre ;
      AV95Mantenimientomaquina_wcmordenesds_17_tfomusucre_sel = AV39TFOMUsuCre_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           A9445OMEst ,
                                           AV84Mantenimientomaquina_wcmordenesds_6_tfomest_sels ,
                                           Integer.valueOf(AV82Mantenimientomaquina_wcmordenesds_4_tfomcod) ,
                                           Integer.valueOf(AV83Mantenimientomaquina_wcmordenesds_5_tfomcod_to) ,
                                           Integer.valueOf(AV84Mantenimientomaquina_wcmordenesds_6_tfomest_sels.size()) ,
                                           AV86Mantenimientomaquina_wcmordenesds_8_tfommaqdsc_sel ,
                                           AV85Mantenimientomaquina_wcmordenesds_7_tfommaqdsc ,
                                           AV88Mantenimientomaquina_wcmordenesds_10_tfomtxt_sel ,
                                           AV87Mantenimientomaquina_wcmordenesds_9_tfomtxt ,
                                           AV90Mantenimientomaquina_wcmordenesds_12_tfomnot_sel ,
                                           AV89Mantenimientomaquina_wcmordenesds_11_tfomnot ,
                                           AV91Mantenimientomaquina_wcmordenesds_13_tfomfchpre ,
                                           AV92Mantenimientomaquina_wcmordenesds_14_tfomfchcer ,
                                           AV93Mantenimientomaquina_wcmordenesds_15_tfomfchcre ,
                                           AV95Mantenimientomaquina_wcmordenesds_17_tfomusucre_sel ,
                                           AV94Mantenimientomaquina_wcmordenesds_16_tfomusucre ,
                                           Integer.valueOf(A9425OMCod) ,
                                           A9427OMMaqDsc ,
                                           A9433OMTxt ,
                                           A9464OMNot ,
                                           A9438OMFchPre ,
                                           A9439OMFchCer ,
                                           A9436OMFchCre ,
                                           A9437OMUsuCre ,
                                           AV81Mantenimientomaquina_wcmordenesds_3_filterfulltext ,
                                           AV79Mantenimientomaquina_wcmordenesds_1_emprcod ,
                                           Integer.valueOf(AV80Mantenimientomaquina_wcmordenesds_2_smcod) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A9428SMCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN
                                           }
      });
      lV85Mantenimientomaquina_wcmordenesds_7_tfommaqdsc = GXutil.padr( GXutil.rtrim( AV85Mantenimientomaquina_wcmordenesds_7_tfommaqdsc), 16, "%") ;
      lV87Mantenimientomaquina_wcmordenesds_9_tfomtxt = GXutil.concat( GXutil.rtrim( AV87Mantenimientomaquina_wcmordenesds_9_tfomtxt), "%", "") ;
      lV89Mantenimientomaquina_wcmordenesds_11_tfomnot = GXutil.concat( GXutil.rtrim( AV89Mantenimientomaquina_wcmordenesds_11_tfomnot), "%", "") ;
      lV94Mantenimientomaquina_wcmordenesds_16_tfomusucre = GXutil.padr( GXutil.rtrim( AV94Mantenimientomaquina_wcmordenesds_16_tfomusucre), 8, "%") ;
      /* Using cursor P08EM5 */
      pr_default.execute(3, new Object[] {AV79Mantenimientomaquina_wcmordenesds_1_emprcod, Integer.valueOf(AV80Mantenimientomaquina_wcmordenesds_2_smcod), Integer.valueOf(AV82Mantenimientomaquina_wcmordenesds_4_tfomcod), Integer.valueOf(AV83Mantenimientomaquina_wcmordenesds_5_tfomcod_to), lV85Mantenimientomaquina_wcmordenesds_7_tfommaqdsc, AV86Mantenimientomaquina_wcmordenesds_8_tfommaqdsc_sel, lV87Mantenimientomaquina_wcmordenesds_9_tfomtxt, AV88Mantenimientomaquina_wcmordenesds_10_tfomtxt_sel, lV89Mantenimientomaquina_wcmordenesds_11_tfomnot, AV90Mantenimientomaquina_wcmordenesds_12_tfomnot_sel, AV91Mantenimientomaquina_wcmordenesds_13_tfomfchpre, AV92Mantenimientomaquina_wcmordenesds_14_tfomfchcer, AV93Mantenimientomaquina_wcmordenesds_15_tfomfchcre, lV94Mantenimientomaquina_wcmordenesds_16_tfomusucre, AV95Mantenimientomaquina_wcmordenesds_17_tfomusucre_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk8EM8 = false ;
         A9426OMMaqCod = P08EM5_A9426OMMaqCod[0] ;
         A396EmprCod = P08EM5_A396EmprCod[0] ;
         A9428SMCod = P08EM5_A9428SMCod[0] ;
         n9428SMCod = P08EM5_n9428SMCod[0] ;
         A9437OMUsuCre = P08EM5_A9437OMUsuCre[0] ;
         A9436OMFchCre = P08EM5_A9436OMFchCre[0] ;
         A9439OMFchCer = P08EM5_A9439OMFchCer[0] ;
         A9438OMFchPre = P08EM5_A9438OMFchPre[0] ;
         A9464OMNot = P08EM5_A9464OMNot[0] ;
         A9433OMTxt = P08EM5_A9433OMTxt[0] ;
         A9427OMMaqDsc = P08EM5_A9427OMMaqDsc[0] ;
         n9427OMMaqDsc = P08EM5_n9427OMMaqDsc[0] ;
         A9425OMCod = P08EM5_A9425OMCod[0] ;
         A9445OMEst = P08EM5_A9445OMEst[0] ;
         A9427OMMaqDsc = P08EM5_A9427OMMaqDsc[0] ;
         n9427OMMaqDsc = P08EM5_n9427OMMaqDsc[0] ;
         if ( (GXutil.strcmp("", AV81Mantenimientomaquina_wcmordenesds_3_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A9425OMCod, 8, 0) , GXutil.padr( "%" + AV81Mantenimientomaquina_wcmordenesds_3_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "pendiente", ""), "") , GXutil.padr( "%" + GXutil.lower( AV81Mantenimientomaquina_wcmordenesds_3_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "realizada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV81Mantenimientomaquina_wcmordenesds_3_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "R", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A9427OMMaqDsc) , GXutil.padr( "%" + GXutil.upper( AV81Mantenimientomaquina_wcmordenesds_3_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9433OMTxt) , GXutil.padr( "%" + GXutil.upper( AV81Mantenimientomaquina_wcmordenesds_3_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9464OMNot) , GXutil.padr( "%" + GXutil.upper( AV81Mantenimientomaquina_wcmordenesds_3_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9437OMUsuCre) , GXutil.padr( "%" + GXutil.upper( AV81Mantenimientomaquina_wcmordenesds_3_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV66count = 0 ;
            while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P08EM5_A396EmprCod[0], A396EmprCod) == 0 ) && ( P08EM5_A9428SMCod[0] == A9428SMCod ) && ( GXutil.strcmp(P08EM5_A9437OMUsuCre[0], A9437OMUsuCre) == 0 ) )
            {
               brk8EM8 = false ;
               A9425OMCod = P08EM5_A9425OMCod[0] ;
               AV66count = (long)(AV66count+1) ;
               brk8EM8 = true ;
               pr_default.readNext(3);
            }
            if ( ! (GXutil.strcmp("", A9437OMUsuCre)==0) )
            {
               AV58Option = A9437OMUsuCre ;
               AV61OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A9437OMUsuCre, "@!"))) ;
               AV59Options.add(AV58Option, 0);
               AV62OptionsDesc.add(AV61OptionDesc, 0);
               AV64OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV66count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV59Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk8EM8 )
         {
            brk8EM8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP3[0] = wcmordenesgetfilterdata.this.AV60OptionsJson;
      this.aP4[0] = wcmordenesgetfilterdata.this.AV63OptionsDescJson;
      this.aP5[0] = wcmordenesgetfilterdata.this.AV65OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV60OptionsJson = "" ;
      AV63OptionsDescJson = "" ;
      AV65OptionIndexesJson = "" ;
      AV59Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV62OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV64OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV67Session = httpContext.getWebSession();
      AV69GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV70GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV72FilterFullText = "" ;
      AV50TFOMEst_SelsJson = "" ;
      AV51TFOMEst_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV20TFOMMaqDsc = "" ;
      AV21TFOMMaqDsc_Sel = "" ;
      AV28TFOMTxt = "" ;
      AV29TFOMTxt_Sel = "" ;
      AV52TFOMNot = "" ;
      AV53TFOMNot_Sel = "" ;
      AV30TFOMFchPre = GXutil.nullDate() ;
      AV32TFOMFchCer = GXutil.resetTime( GXutil.nullDate() );
      AV34TFOMFchCre = GXutil.resetTime( GXutil.nullDate() );
      AV38TFOMUsuCre = "" ;
      AV39TFOMUsuCre_Sel = "" ;
      AV73EmprCod = "" ;
      A9427OMMaqDsc = "" ;
      AV79Mantenimientomaquina_wcmordenesds_1_emprcod = "" ;
      AV81Mantenimientomaquina_wcmordenesds_3_filterfulltext = "" ;
      AV84Mantenimientomaquina_wcmordenesds_6_tfomest_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV85Mantenimientomaquina_wcmordenesds_7_tfommaqdsc = "" ;
      AV86Mantenimientomaquina_wcmordenesds_8_tfommaqdsc_sel = "" ;
      AV87Mantenimientomaquina_wcmordenesds_9_tfomtxt = "" ;
      AV88Mantenimientomaquina_wcmordenesds_10_tfomtxt_sel = "" ;
      AV89Mantenimientomaquina_wcmordenesds_11_tfomnot = "" ;
      AV90Mantenimientomaquina_wcmordenesds_12_tfomnot_sel = "" ;
      AV91Mantenimientomaquina_wcmordenesds_13_tfomfchpre = GXutil.nullDate() ;
      AV92Mantenimientomaquina_wcmordenesds_14_tfomfchcer = GXutil.resetTime( GXutil.nullDate() );
      AV93Mantenimientomaquina_wcmordenesds_15_tfomfchcre = GXutil.resetTime( GXutil.nullDate() );
      AV94Mantenimientomaquina_wcmordenesds_16_tfomusucre = "" ;
      AV95Mantenimientomaquina_wcmordenesds_17_tfomusucre_sel = "" ;
      lV81Mantenimientomaquina_wcmordenesds_3_filterfulltext = "" ;
      scmdbuf = "" ;
      lV85Mantenimientomaquina_wcmordenesds_7_tfommaqdsc = "" ;
      lV87Mantenimientomaquina_wcmordenesds_9_tfomtxt = "" ;
      lV89Mantenimientomaquina_wcmordenesds_11_tfomnot = "" ;
      lV94Mantenimientomaquina_wcmordenesds_16_tfomusucre = "" ;
      A9445OMEst = "" ;
      A9433OMTxt = "" ;
      A9464OMNot = "" ;
      A9438OMFchPre = GXutil.nullDate() ;
      A9439OMFchCer = GXutil.resetTime( GXutil.nullDate() );
      A9436OMFchCre = GXutil.resetTime( GXutil.nullDate() );
      A9437OMUsuCre = "" ;
      A396EmprCod = "" ;
      P08EM2_A396EmprCod = new String[] {""} ;
      P08EM2_A9428SMCod = new int[1] ;
      P08EM2_n9428SMCod = new boolean[] {false} ;
      P08EM2_A9426OMMaqCod = new String[] {""} ;
      P08EM2_A9437OMUsuCre = new String[] {""} ;
      P08EM2_A9436OMFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      P08EM2_A9439OMFchCer = new java.util.Date[] {GXutil.nullDate()} ;
      P08EM2_A9438OMFchPre = new java.util.Date[] {GXutil.nullDate()} ;
      P08EM2_A9464OMNot = new String[] {""} ;
      P08EM2_A9433OMTxt = new String[] {""} ;
      P08EM2_A9427OMMaqDsc = new String[] {""} ;
      P08EM2_n9427OMMaqDsc = new boolean[] {false} ;
      P08EM2_A9425OMCod = new int[1] ;
      P08EM2_A9445OMEst = new String[] {""} ;
      A9426OMMaqCod = "" ;
      AV58Option = "" ;
      P08EM3_A9426OMMaqCod = new String[] {""} ;
      P08EM3_A396EmprCod = new String[] {""} ;
      P08EM3_A9428SMCod = new int[1] ;
      P08EM3_n9428SMCod = new boolean[] {false} ;
      P08EM3_A9433OMTxt = new String[] {""} ;
      P08EM3_A9437OMUsuCre = new String[] {""} ;
      P08EM3_A9436OMFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      P08EM3_A9439OMFchCer = new java.util.Date[] {GXutil.nullDate()} ;
      P08EM3_A9438OMFchPre = new java.util.Date[] {GXutil.nullDate()} ;
      P08EM3_A9464OMNot = new String[] {""} ;
      P08EM3_A9427OMMaqDsc = new String[] {""} ;
      P08EM3_n9427OMMaqDsc = new boolean[] {false} ;
      P08EM3_A9425OMCod = new int[1] ;
      P08EM3_A9445OMEst = new String[] {""} ;
      P08EM4_A9426OMMaqCod = new String[] {""} ;
      P08EM4_A396EmprCod = new String[] {""} ;
      P08EM4_A9428SMCod = new int[1] ;
      P08EM4_n9428SMCod = new boolean[] {false} ;
      P08EM4_A9464OMNot = new String[] {""} ;
      P08EM4_A9437OMUsuCre = new String[] {""} ;
      P08EM4_A9436OMFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      P08EM4_A9439OMFchCer = new java.util.Date[] {GXutil.nullDate()} ;
      P08EM4_A9438OMFchPre = new java.util.Date[] {GXutil.nullDate()} ;
      P08EM4_A9433OMTxt = new String[] {""} ;
      P08EM4_A9427OMMaqDsc = new String[] {""} ;
      P08EM4_n9427OMMaqDsc = new boolean[] {false} ;
      P08EM4_A9425OMCod = new int[1] ;
      P08EM4_A9445OMEst = new String[] {""} ;
      P08EM5_A9426OMMaqCod = new String[] {""} ;
      P08EM5_A396EmprCod = new String[] {""} ;
      P08EM5_A9428SMCod = new int[1] ;
      P08EM5_n9428SMCod = new boolean[] {false} ;
      P08EM5_A9437OMUsuCre = new String[] {""} ;
      P08EM5_A9436OMFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      P08EM5_A9439OMFchCer = new java.util.Date[] {GXutil.nullDate()} ;
      P08EM5_A9438OMFchPre = new java.util.Date[] {GXutil.nullDate()} ;
      P08EM5_A9464OMNot = new String[] {""} ;
      P08EM5_A9433OMTxt = new String[] {""} ;
      P08EM5_A9427OMMaqDsc = new String[] {""} ;
      P08EM5_n9427OMMaqDsc = new boolean[] {false} ;
      P08EM5_A9425OMCod = new int[1] ;
      P08EM5_A9445OMEst = new String[] {""} ;
      AV61OptionDesc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.wcmordenesgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08EM2_A396EmprCod, P08EM2_A9428SMCod, P08EM2_n9428SMCod, P08EM2_A9426OMMaqCod, P08EM2_A9437OMUsuCre, P08EM2_A9436OMFchCre, P08EM2_A9439OMFchCer, P08EM2_A9438OMFchPre, P08EM2_A9464OMNot, P08EM2_A9433OMTxt,
            P08EM2_A9427OMMaqDsc, P08EM2_n9427OMMaqDsc, P08EM2_A9425OMCod, P08EM2_A9445OMEst
            }
            , new Object[] {
            P08EM3_A9426OMMaqCod, P08EM3_A396EmprCod, P08EM3_A9428SMCod, P08EM3_n9428SMCod, P08EM3_A9433OMTxt, P08EM3_A9437OMUsuCre, P08EM3_A9436OMFchCre, P08EM3_A9439OMFchCer, P08EM3_A9438OMFchPre, P08EM3_A9464OMNot,
            P08EM3_A9427OMMaqDsc, P08EM3_n9427OMMaqDsc, P08EM3_A9425OMCod, P08EM3_A9445OMEst
            }
            , new Object[] {
            P08EM4_A9426OMMaqCod, P08EM4_A396EmprCod, P08EM4_A9428SMCod, P08EM4_n9428SMCod, P08EM4_A9464OMNot, P08EM4_A9437OMUsuCre, P08EM4_A9436OMFchCre, P08EM4_A9439OMFchCer, P08EM4_A9438OMFchPre, P08EM4_A9433OMTxt,
            P08EM4_A9427OMMaqDsc, P08EM4_n9427OMMaqDsc, P08EM4_A9425OMCod, P08EM4_A9445OMEst
            }
            , new Object[] {
            P08EM5_A9426OMMaqCod, P08EM5_A396EmprCod, P08EM5_A9428SMCod, P08EM5_n9428SMCod, P08EM5_A9437OMUsuCre, P08EM5_A9436OMFchCre, P08EM5_A9439OMFchCer, P08EM5_A9438OMFchPre, P08EM5_A9464OMNot, P08EM5_A9433OMTxt,
            P08EM5_A9427OMMaqDsc, P08EM5_n9427OMMaqDsc, P08EM5_A9425OMCod, P08EM5_A9445OMEst
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV77GXV1 ;
   private int AV14TFOMCod ;
   private int AV15TFOMCod_To ;
   private int AV74SMCod ;
   private int AV80Mantenimientomaquina_wcmordenesds_2_smcod ;
   private int AV82Mantenimientomaquina_wcmordenesds_4_tfomcod ;
   private int AV83Mantenimientomaquina_wcmordenesds_5_tfomcod_to ;
   private int AV84Mantenimientomaquina_wcmordenesds_6_tfomest_sels_size ;
   private int A9425OMCod ;
   private int A9428SMCod ;
   private int AV57InsertIndex ;
   private long AV66count ;
   private String AV20TFOMMaqDsc ;
   private String AV21TFOMMaqDsc_Sel ;
   private String AV38TFOMUsuCre ;
   private String AV39TFOMUsuCre_Sel ;
   private String AV73EmprCod ;
   private String A9427OMMaqDsc ;
   private String AV79Mantenimientomaquina_wcmordenesds_1_emprcod ;
   private String AV85Mantenimientomaquina_wcmordenesds_7_tfommaqdsc ;
   private String AV86Mantenimientomaquina_wcmordenesds_8_tfommaqdsc_sel ;
   private String AV94Mantenimientomaquina_wcmordenesds_16_tfomusucre ;
   private String AV95Mantenimientomaquina_wcmordenesds_17_tfomusucre_sel ;
   private String scmdbuf ;
   private String lV85Mantenimientomaquina_wcmordenesds_7_tfommaqdsc ;
   private String lV94Mantenimientomaquina_wcmordenesds_16_tfomusucre ;
   private String A9445OMEst ;
   private String A9437OMUsuCre ;
   private String A396EmprCod ;
   private String A9426OMMaqCod ;
   private java.util.Date AV32TFOMFchCer ;
   private java.util.Date AV34TFOMFchCre ;
   private java.util.Date AV92Mantenimientomaquina_wcmordenesds_14_tfomfchcer ;
   private java.util.Date AV93Mantenimientomaquina_wcmordenesds_15_tfomfchcre ;
   private java.util.Date A9439OMFchCer ;
   private java.util.Date A9436OMFchCre ;
   private java.util.Date AV30TFOMFchPre ;
   private java.util.Date AV91Mantenimientomaquina_wcmordenesds_13_tfomfchpre ;
   private java.util.Date A9438OMFchPre ;
   private boolean returnInSub ;
   private boolean brk8EM2 ;
   private boolean n9428SMCod ;
   private boolean n9427OMMaqDsc ;
   private boolean brk8EM4 ;
   private boolean brk8EM6 ;
   private boolean brk8EM8 ;
   private String AV60OptionsJson ;
   private String AV63OptionsDescJson ;
   private String AV65OptionIndexesJson ;
   private String AV50TFOMEst_SelsJson ;
   private String AV56DDOName ;
   private String AV54SearchTxt ;
   private String AV55SearchTxtTo ;
   private String AV72FilterFullText ;
   private String AV28TFOMTxt ;
   private String AV29TFOMTxt_Sel ;
   private String AV52TFOMNot ;
   private String AV53TFOMNot_Sel ;
   private String AV81Mantenimientomaquina_wcmordenesds_3_filterfulltext ;
   private String AV87Mantenimientomaquina_wcmordenesds_9_tfomtxt ;
   private String AV88Mantenimientomaquina_wcmordenesds_10_tfomtxt_sel ;
   private String AV89Mantenimientomaquina_wcmordenesds_11_tfomnot ;
   private String AV90Mantenimientomaquina_wcmordenesds_12_tfomnot_sel ;
   private String lV81Mantenimientomaquina_wcmordenesds_3_filterfulltext ;
   private String lV87Mantenimientomaquina_wcmordenesds_9_tfomtxt ;
   private String lV89Mantenimientomaquina_wcmordenesds_11_tfomnot ;
   private String A9433OMTxt ;
   private String A9464OMNot ;
   private String AV58Option ;
   private String AV61OptionDesc ;
   private com.genexus.webpanels.WebSession AV67Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08EM2_A396EmprCod ;
   private int[] P08EM2_A9428SMCod ;
   private boolean[] P08EM2_n9428SMCod ;
   private String[] P08EM2_A9426OMMaqCod ;
   private String[] P08EM2_A9437OMUsuCre ;
   private java.util.Date[] P08EM2_A9436OMFchCre ;
   private java.util.Date[] P08EM2_A9439OMFchCer ;
   private java.util.Date[] P08EM2_A9438OMFchPre ;
   private String[] P08EM2_A9464OMNot ;
   private String[] P08EM2_A9433OMTxt ;
   private String[] P08EM2_A9427OMMaqDsc ;
   private boolean[] P08EM2_n9427OMMaqDsc ;
   private int[] P08EM2_A9425OMCod ;
   private String[] P08EM2_A9445OMEst ;
   private String[] P08EM3_A9426OMMaqCod ;
   private String[] P08EM3_A396EmprCod ;
   private int[] P08EM3_A9428SMCod ;
   private boolean[] P08EM3_n9428SMCod ;
   private String[] P08EM3_A9433OMTxt ;
   private String[] P08EM3_A9437OMUsuCre ;
   private java.util.Date[] P08EM3_A9436OMFchCre ;
   private java.util.Date[] P08EM3_A9439OMFchCer ;
   private java.util.Date[] P08EM3_A9438OMFchPre ;
   private String[] P08EM3_A9464OMNot ;
   private String[] P08EM3_A9427OMMaqDsc ;
   private boolean[] P08EM3_n9427OMMaqDsc ;
   private int[] P08EM3_A9425OMCod ;
   private String[] P08EM3_A9445OMEst ;
   private String[] P08EM4_A9426OMMaqCod ;
   private String[] P08EM4_A396EmprCod ;
   private int[] P08EM4_A9428SMCod ;
   private boolean[] P08EM4_n9428SMCod ;
   private String[] P08EM4_A9464OMNot ;
   private String[] P08EM4_A9437OMUsuCre ;
   private java.util.Date[] P08EM4_A9436OMFchCre ;
   private java.util.Date[] P08EM4_A9439OMFchCer ;
   private java.util.Date[] P08EM4_A9438OMFchPre ;
   private String[] P08EM4_A9433OMTxt ;
   private String[] P08EM4_A9427OMMaqDsc ;
   private boolean[] P08EM4_n9427OMMaqDsc ;
   private int[] P08EM4_A9425OMCod ;
   private String[] P08EM4_A9445OMEst ;
   private String[] P08EM5_A9426OMMaqCod ;
   private String[] P08EM5_A396EmprCod ;
   private int[] P08EM5_A9428SMCod ;
   private boolean[] P08EM5_n9428SMCod ;
   private String[] P08EM5_A9437OMUsuCre ;
   private java.util.Date[] P08EM5_A9436OMFchCre ;
   private java.util.Date[] P08EM5_A9439OMFchCer ;
   private java.util.Date[] P08EM5_A9438OMFchPre ;
   private String[] P08EM5_A9464OMNot ;
   private String[] P08EM5_A9433OMTxt ;
   private String[] P08EM5_A9427OMMaqDsc ;
   private boolean[] P08EM5_n9427OMMaqDsc ;
   private int[] P08EM5_A9425OMCod ;
   private String[] P08EM5_A9445OMEst ;
   private GXSimpleCollection<String> AV51TFOMEst_Sels ;
   private GXSimpleCollection<String> AV84Mantenimientomaquina_wcmordenesds_6_tfomest_sels ;
   private GXSimpleCollection<String> AV59Options ;
   private GXSimpleCollection<String> AV62OptionsDesc ;
   private GXSimpleCollection<String> AV64OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV69GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV70GridStateFilterValue ;
}

final  class wcmordenesgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08EM2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A9445OMEst ,
                                          GXSimpleCollection<String> AV84Mantenimientomaquina_wcmordenesds_6_tfomest_sels ,
                                          int AV82Mantenimientomaquina_wcmordenesds_4_tfomcod ,
                                          int AV83Mantenimientomaquina_wcmordenesds_5_tfomcod_to ,
                                          int AV84Mantenimientomaquina_wcmordenesds_6_tfomest_sels_size ,
                                          String AV86Mantenimientomaquina_wcmordenesds_8_tfommaqdsc_sel ,
                                          String AV85Mantenimientomaquina_wcmordenesds_7_tfommaqdsc ,
                                          String AV88Mantenimientomaquina_wcmordenesds_10_tfomtxt_sel ,
                                          String AV87Mantenimientomaquina_wcmordenesds_9_tfomtxt ,
                                          String AV90Mantenimientomaquina_wcmordenesds_12_tfomnot_sel ,
                                          String AV89Mantenimientomaquina_wcmordenesds_11_tfomnot ,
                                          java.util.Date AV91Mantenimientomaquina_wcmordenesds_13_tfomfchpre ,
                                          java.util.Date AV92Mantenimientomaquina_wcmordenesds_14_tfomfchcer ,
                                          java.util.Date AV93Mantenimientomaquina_wcmordenesds_15_tfomfchcre ,
                                          String AV95Mantenimientomaquina_wcmordenesds_17_tfomusucre_sel ,
                                          String AV94Mantenimientomaquina_wcmordenesds_16_tfomusucre ,
                                          int A9425OMCod ,
                                          String A9427OMMaqDsc ,
                                          String A9433OMTxt ,
                                          String A9464OMNot ,
                                          java.util.Date A9438OMFchPre ,
                                          java.util.Date A9439OMFchCer ,
                                          java.util.Date A9436OMFchCre ,
                                          String A9437OMUsuCre ,
                                          String AV81Mantenimientomaquina_wcmordenesds_3_filterfulltext ,
                                          String AV79Mantenimientomaquina_wcmordenesds_1_emprcod ,
                                          int AV80Mantenimientomaquina_wcmordenesds_2_smcod ,
                                          String A396EmprCod ,
                                          int A9428SMCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[15];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.SMCod, T1.OMMaqCod AS OMMaqCod, T1.OMUsuCre, T1.OMFchCre, T1.OMFchCer, T1.OMFchPre, T1.OMNot, T1.OMTxt, T2.MaqDsc AS OMMaqDsc, T1.OMCod, T1.OMEst" ;
      scmdbuf += " FROM (TXPMORDEN T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.OMMaqCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.SMCod = ?)");
      if ( ! (0==AV82Mantenimientomaquina_wcmordenesds_4_tfomcod) )
      {
         addWhere(sWhereString, "(T1.OMCod >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV83Mantenimientomaquina_wcmordenesds_5_tfomcod_to) )
      {
         addWhere(sWhereString, "(T1.OMCod <= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( AV84Mantenimientomaquina_wcmordenesds_6_tfomest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV84Mantenimientomaquina_wcmordenesds_6_tfomest_sels, "T1.OMEst IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV86Mantenimientomaquina_wcmordenesds_8_tfommaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV85Mantenimientomaquina_wcmordenesds_7_tfommaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Mantenimientomaquina_wcmordenesds_8_tfommaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Mantenimientomaquina_wcmordenesds_10_tfomtxt_sel)==0) && ( ! (GXutil.strcmp("", AV87Mantenimientomaquina_wcmordenesds_9_tfomtxt)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.OMTxt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Mantenimientomaquina_wcmordenesds_10_tfomtxt_sel)==0) )
      {
         addWhere(sWhereString, "(T1.OMTxt = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Mantenimientomaquina_wcmordenesds_12_tfomnot_sel)==0) && ( ! (GXutil.strcmp("", AV89Mantenimientomaquina_wcmordenesds_11_tfomnot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.OMNot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Mantenimientomaquina_wcmordenesds_12_tfomnot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.OMNot = ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV91Mantenimientomaquina_wcmordenesds_13_tfomfchpre)) )
      {
         addWhere(sWhereString, "(T1.OMFchPre >= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV92Mantenimientomaquina_wcmordenesds_14_tfomfchcer) )
      {
         addWhere(sWhereString, "(T1.OMFchCer >= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV93Mantenimientomaquina_wcmordenesds_15_tfomfchcre) )
      {
         addWhere(sWhereString, "(T1.OMFchCre >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Mantenimientomaquina_wcmordenesds_17_tfomusucre_sel)==0) && ( ! (GXutil.strcmp("", AV94Mantenimientomaquina_wcmordenesds_16_tfomusucre)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.OMUsuCre) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Mantenimientomaquina_wcmordenesds_17_tfomusucre_sel)==0) )
      {
         addWhere(sWhereString, "(T1.OMUsuCre = ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.SMCod, T1.OMMaqCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08EM3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A9445OMEst ,
                                          GXSimpleCollection<String> AV84Mantenimientomaquina_wcmordenesds_6_tfomest_sels ,
                                          int AV82Mantenimientomaquina_wcmordenesds_4_tfomcod ,
                                          int AV83Mantenimientomaquina_wcmordenesds_5_tfomcod_to ,
                                          int AV84Mantenimientomaquina_wcmordenesds_6_tfomest_sels_size ,
                                          String AV86Mantenimientomaquina_wcmordenesds_8_tfommaqdsc_sel ,
                                          String AV85Mantenimientomaquina_wcmordenesds_7_tfommaqdsc ,
                                          String AV88Mantenimientomaquina_wcmordenesds_10_tfomtxt_sel ,
                                          String AV87Mantenimientomaquina_wcmordenesds_9_tfomtxt ,
                                          String AV90Mantenimientomaquina_wcmordenesds_12_tfomnot_sel ,
                                          String AV89Mantenimientomaquina_wcmordenesds_11_tfomnot ,
                                          java.util.Date AV91Mantenimientomaquina_wcmordenesds_13_tfomfchpre ,
                                          java.util.Date AV92Mantenimientomaquina_wcmordenesds_14_tfomfchcer ,
                                          java.util.Date AV93Mantenimientomaquina_wcmordenesds_15_tfomfchcre ,
                                          String AV95Mantenimientomaquina_wcmordenesds_17_tfomusucre_sel ,
                                          String AV94Mantenimientomaquina_wcmordenesds_16_tfomusucre ,
                                          int A9425OMCod ,
                                          String A9427OMMaqDsc ,
                                          String A9433OMTxt ,
                                          String A9464OMNot ,
                                          java.util.Date A9438OMFchPre ,
                                          java.util.Date A9439OMFchCer ,
                                          java.util.Date A9436OMFchCre ,
                                          String A9437OMUsuCre ,
                                          String AV81Mantenimientomaquina_wcmordenesds_3_filterfulltext ,
                                          String AV79Mantenimientomaquina_wcmordenesds_1_emprcod ,
                                          int AV80Mantenimientomaquina_wcmordenesds_2_smcod ,
                                          String A396EmprCod ,
                                          int A9428SMCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[15];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT T1.OMMaqCod AS OMMaqCod, T1.EmprCod, T1.SMCod, T1.OMTxt, T1.OMUsuCre, T1.OMFchCre, T1.OMFchCer, T1.OMFchPre, T1.OMNot, T2.MaqDsc AS OMMaqDsc, T1.OMCod, T1.OMEst" ;
      scmdbuf += " FROM (TXPMORDEN T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.OMMaqCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.SMCod = ?)");
      if ( ! (0==AV82Mantenimientomaquina_wcmordenesds_4_tfomcod) )
      {
         addWhere(sWhereString, "(T1.OMCod >= ?)");
      }
      else
      {
         GXv_int5[2] = (byte)(1) ;
      }
      if ( ! (0==AV83Mantenimientomaquina_wcmordenesds_5_tfomcod_to) )
      {
         addWhere(sWhereString, "(T1.OMCod <= ?)");
      }
      else
      {
         GXv_int5[3] = (byte)(1) ;
      }
      if ( AV84Mantenimientomaquina_wcmordenesds_6_tfomest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV84Mantenimientomaquina_wcmordenesds_6_tfomest_sels, "T1.OMEst IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV86Mantenimientomaquina_wcmordenesds_8_tfommaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV85Mantenimientomaquina_wcmordenesds_7_tfommaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Mantenimientomaquina_wcmordenesds_8_tfommaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int5[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Mantenimientomaquina_wcmordenesds_10_tfomtxt_sel)==0) && ( ! (GXutil.strcmp("", AV87Mantenimientomaquina_wcmordenesds_9_tfomtxt)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.OMTxt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Mantenimientomaquina_wcmordenesds_10_tfomtxt_sel)==0) )
      {
         addWhere(sWhereString, "(T1.OMTxt = ?)");
      }
      else
      {
         GXv_int5[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Mantenimientomaquina_wcmordenesds_12_tfomnot_sel)==0) && ( ! (GXutil.strcmp("", AV89Mantenimientomaquina_wcmordenesds_11_tfomnot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.OMNot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Mantenimientomaquina_wcmordenesds_12_tfomnot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.OMNot = ?)");
      }
      else
      {
         GXv_int5[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV91Mantenimientomaquina_wcmordenesds_13_tfomfchpre)) )
      {
         addWhere(sWhereString, "(T1.OMFchPre >= ?)");
      }
      else
      {
         GXv_int5[10] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV92Mantenimientomaquina_wcmordenesds_14_tfomfchcer) )
      {
         addWhere(sWhereString, "(T1.OMFchCer >= ?)");
      }
      else
      {
         GXv_int5[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV93Mantenimientomaquina_wcmordenesds_15_tfomfchcre) )
      {
         addWhere(sWhereString, "(T1.OMFchCre >= ?)");
      }
      else
      {
         GXv_int5[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Mantenimientomaquina_wcmordenesds_17_tfomusucre_sel)==0) && ( ! (GXutil.strcmp("", AV94Mantenimientomaquina_wcmordenesds_16_tfomusucre)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.OMUsuCre) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Mantenimientomaquina_wcmordenesds_17_tfomusucre_sel)==0) )
      {
         addWhere(sWhereString, "(T1.OMUsuCre = ?)");
      }
      else
      {
         GXv_int5[14] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.SMCod, T1.OMTxt" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   protected Object[] conditional_P08EM4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A9445OMEst ,
                                          GXSimpleCollection<String> AV84Mantenimientomaquina_wcmordenesds_6_tfomest_sels ,
                                          int AV82Mantenimientomaquina_wcmordenesds_4_tfomcod ,
                                          int AV83Mantenimientomaquina_wcmordenesds_5_tfomcod_to ,
                                          int AV84Mantenimientomaquina_wcmordenesds_6_tfomest_sels_size ,
                                          String AV86Mantenimientomaquina_wcmordenesds_8_tfommaqdsc_sel ,
                                          String AV85Mantenimientomaquina_wcmordenesds_7_tfommaqdsc ,
                                          String AV88Mantenimientomaquina_wcmordenesds_10_tfomtxt_sel ,
                                          String AV87Mantenimientomaquina_wcmordenesds_9_tfomtxt ,
                                          String AV90Mantenimientomaquina_wcmordenesds_12_tfomnot_sel ,
                                          String AV89Mantenimientomaquina_wcmordenesds_11_tfomnot ,
                                          java.util.Date AV91Mantenimientomaquina_wcmordenesds_13_tfomfchpre ,
                                          java.util.Date AV92Mantenimientomaquina_wcmordenesds_14_tfomfchcer ,
                                          java.util.Date AV93Mantenimientomaquina_wcmordenesds_15_tfomfchcre ,
                                          String AV95Mantenimientomaquina_wcmordenesds_17_tfomusucre_sel ,
                                          String AV94Mantenimientomaquina_wcmordenesds_16_tfomusucre ,
                                          int A9425OMCod ,
                                          String A9427OMMaqDsc ,
                                          String A9433OMTxt ,
                                          String A9464OMNot ,
                                          java.util.Date A9438OMFchPre ,
                                          java.util.Date A9439OMFchCer ,
                                          java.util.Date A9436OMFchCre ,
                                          String A9437OMUsuCre ,
                                          String AV81Mantenimientomaquina_wcmordenesds_3_filterfulltext ,
                                          String AV79Mantenimientomaquina_wcmordenesds_1_emprcod ,
                                          int AV80Mantenimientomaquina_wcmordenesds_2_smcod ,
                                          String A396EmprCod ,
                                          int A9428SMCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[15];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.OMMaqCod AS OMMaqCod, T1.EmprCod, T1.SMCod, T1.OMNot, T1.OMUsuCre, T1.OMFchCre, T1.OMFchCer, T1.OMFchPre, T1.OMTxt, T2.MaqDsc AS OMMaqDsc, T1.OMCod, T1.OMEst" ;
      scmdbuf += " FROM (TXPMORDEN T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.OMMaqCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.SMCod = ?)");
      if ( ! (0==AV82Mantenimientomaquina_wcmordenesds_4_tfomcod) )
      {
         addWhere(sWhereString, "(T1.OMCod >= ?)");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( ! (0==AV83Mantenimientomaquina_wcmordenesds_5_tfomcod_to) )
      {
         addWhere(sWhereString, "(T1.OMCod <= ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( AV84Mantenimientomaquina_wcmordenesds_6_tfomest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV84Mantenimientomaquina_wcmordenesds_6_tfomest_sels, "T1.OMEst IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV86Mantenimientomaquina_wcmordenesds_8_tfommaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV85Mantenimientomaquina_wcmordenesds_7_tfommaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Mantenimientomaquina_wcmordenesds_8_tfommaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Mantenimientomaquina_wcmordenesds_10_tfomtxt_sel)==0) && ( ! (GXutil.strcmp("", AV87Mantenimientomaquina_wcmordenesds_9_tfomtxt)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.OMTxt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Mantenimientomaquina_wcmordenesds_10_tfomtxt_sel)==0) )
      {
         addWhere(sWhereString, "(T1.OMTxt = ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Mantenimientomaquina_wcmordenesds_12_tfomnot_sel)==0) && ( ! (GXutil.strcmp("", AV89Mantenimientomaquina_wcmordenesds_11_tfomnot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.OMNot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Mantenimientomaquina_wcmordenesds_12_tfomnot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.OMNot = ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV91Mantenimientomaquina_wcmordenesds_13_tfomfchpre)) )
      {
         addWhere(sWhereString, "(T1.OMFchPre >= ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV92Mantenimientomaquina_wcmordenesds_14_tfomfchcer) )
      {
         addWhere(sWhereString, "(T1.OMFchCer >= ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV93Mantenimientomaquina_wcmordenesds_15_tfomfchcre) )
      {
         addWhere(sWhereString, "(T1.OMFchCre >= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Mantenimientomaquina_wcmordenesds_17_tfomusucre_sel)==0) && ( ! (GXutil.strcmp("", AV94Mantenimientomaquina_wcmordenesds_16_tfomusucre)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.OMUsuCre) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Mantenimientomaquina_wcmordenesds_17_tfomusucre_sel)==0) )
      {
         addWhere(sWhereString, "(T1.OMUsuCre = ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.SMCod, T1.OMNot" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P08EM5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A9445OMEst ,
                                          GXSimpleCollection<String> AV84Mantenimientomaquina_wcmordenesds_6_tfomest_sels ,
                                          int AV82Mantenimientomaquina_wcmordenesds_4_tfomcod ,
                                          int AV83Mantenimientomaquina_wcmordenesds_5_tfomcod_to ,
                                          int AV84Mantenimientomaquina_wcmordenesds_6_tfomest_sels_size ,
                                          String AV86Mantenimientomaquina_wcmordenesds_8_tfommaqdsc_sel ,
                                          String AV85Mantenimientomaquina_wcmordenesds_7_tfommaqdsc ,
                                          String AV88Mantenimientomaquina_wcmordenesds_10_tfomtxt_sel ,
                                          String AV87Mantenimientomaquina_wcmordenesds_9_tfomtxt ,
                                          String AV90Mantenimientomaquina_wcmordenesds_12_tfomnot_sel ,
                                          String AV89Mantenimientomaquina_wcmordenesds_11_tfomnot ,
                                          java.util.Date AV91Mantenimientomaquina_wcmordenesds_13_tfomfchpre ,
                                          java.util.Date AV92Mantenimientomaquina_wcmordenesds_14_tfomfchcer ,
                                          java.util.Date AV93Mantenimientomaquina_wcmordenesds_15_tfomfchcre ,
                                          String AV95Mantenimientomaquina_wcmordenesds_17_tfomusucre_sel ,
                                          String AV94Mantenimientomaquina_wcmordenesds_16_tfomusucre ,
                                          int A9425OMCod ,
                                          String A9427OMMaqDsc ,
                                          String A9433OMTxt ,
                                          String A9464OMNot ,
                                          java.util.Date A9438OMFchPre ,
                                          java.util.Date A9439OMFchCer ,
                                          java.util.Date A9436OMFchCre ,
                                          String A9437OMUsuCre ,
                                          String AV81Mantenimientomaquina_wcmordenesds_3_filterfulltext ,
                                          String AV79Mantenimientomaquina_wcmordenesds_1_emprcod ,
                                          int AV80Mantenimientomaquina_wcmordenesds_2_smcod ,
                                          String A396EmprCod ,
                                          int A9428SMCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int11 = new byte[15];
      Object[] GXv_Object12 = new Object[2];
      scmdbuf = "SELECT T1.OMMaqCod AS OMMaqCod, T1.EmprCod, T1.SMCod, T1.OMUsuCre, T1.OMFchCre, T1.OMFchCer, T1.OMFchPre, T1.OMNot, T1.OMTxt, T2.MaqDsc AS OMMaqDsc, T1.OMCod, T1.OMEst" ;
      scmdbuf += " FROM (TXPMORDEN T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.OMMaqCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.SMCod = ?)");
      if ( ! (0==AV82Mantenimientomaquina_wcmordenesds_4_tfomcod) )
      {
         addWhere(sWhereString, "(T1.OMCod >= ?)");
      }
      else
      {
         GXv_int11[2] = (byte)(1) ;
      }
      if ( ! (0==AV83Mantenimientomaquina_wcmordenesds_5_tfomcod_to) )
      {
         addWhere(sWhereString, "(T1.OMCod <= ?)");
      }
      else
      {
         GXv_int11[3] = (byte)(1) ;
      }
      if ( AV84Mantenimientomaquina_wcmordenesds_6_tfomest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV84Mantenimientomaquina_wcmordenesds_6_tfomest_sels, "T1.OMEst IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV86Mantenimientomaquina_wcmordenesds_8_tfommaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV85Mantenimientomaquina_wcmordenesds_7_tfommaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Mantenimientomaquina_wcmordenesds_8_tfommaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int11[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Mantenimientomaquina_wcmordenesds_10_tfomtxt_sel)==0) && ( ! (GXutil.strcmp("", AV87Mantenimientomaquina_wcmordenesds_9_tfomtxt)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.OMTxt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Mantenimientomaquina_wcmordenesds_10_tfomtxt_sel)==0) )
      {
         addWhere(sWhereString, "(T1.OMTxt = ?)");
      }
      else
      {
         GXv_int11[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Mantenimientomaquina_wcmordenesds_12_tfomnot_sel)==0) && ( ! (GXutil.strcmp("", AV89Mantenimientomaquina_wcmordenesds_11_tfomnot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.OMNot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Mantenimientomaquina_wcmordenesds_12_tfomnot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.OMNot = ?)");
      }
      else
      {
         GXv_int11[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV91Mantenimientomaquina_wcmordenesds_13_tfomfchpre)) )
      {
         addWhere(sWhereString, "(T1.OMFchPre >= ?)");
      }
      else
      {
         GXv_int11[10] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV92Mantenimientomaquina_wcmordenesds_14_tfomfchcer) )
      {
         addWhere(sWhereString, "(T1.OMFchCer >= ?)");
      }
      else
      {
         GXv_int11[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV93Mantenimientomaquina_wcmordenesds_15_tfomfchcre) )
      {
         addWhere(sWhereString, "(T1.OMFchCre >= ?)");
      }
      else
      {
         GXv_int11[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Mantenimientomaquina_wcmordenesds_17_tfomusucre_sel)==0) && ( ! (GXutil.strcmp("", AV94Mantenimientomaquina_wcmordenesds_16_tfomusucre)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.OMUsuCre) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Mantenimientomaquina_wcmordenesds_17_tfomusucre_sel)==0) )
      {
         addWhere(sWhereString, "(T1.OMUsuCre = ?)");
      }
      else
      {
         GXv_int11[14] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.SMCod, T1.OMUsuCre" ;
      GXv_Object12[0] = scmdbuf ;
      GXv_Object12[1] = GXv_int11 ;
      return GXv_Object12 ;
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
                  return conditional_P08EM2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() );
            case 1 :
                  return conditional_P08EM3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() );
            case 2 :
                  return conditional_P08EM4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() );
            case 3 :
                  return conditional_P08EM5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08EM2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08EM3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08EM4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08EM5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 6);
               ((String[]) buf[4])[0] = rslt.getString(4, 8);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(5);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(6);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(7);
               ((String[]) buf[8])[0] = rslt.getVarchar(8);
               ((String[]) buf[9])[0] = rslt.getVarchar(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 16);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(11);
               ((String[]) buf[13])[0] = rslt.getString(12, 1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 8);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(6);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(7);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(8);
               ((String[]) buf[9])[0] = rslt.getVarchar(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 16);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(11);
               ((String[]) buf[13])[0] = rslt.getString(12, 1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 8);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(6);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(7);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(8);
               ((String[]) buf[9])[0] = rslt.getVarchar(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 16);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(11);
               ((String[]) buf[13])[0] = rslt.getString(12, 1);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 8);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(5);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(6);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(7);
               ((String[]) buf[8])[0] = rslt.getVarchar(8);
               ((String[]) buf[9])[0] = rslt.getVarchar(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 16);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(11);
               ((String[]) buf[13])[0] = rslt.getString(12, 1);
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
                  stmt.setString(sIdx, (String)parms[15], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 2000);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[22], 2000);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 2000);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 2000);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[25]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[26], false);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[27], false);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 8);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 2000);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[22], 2000);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 2000);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 2000);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[25]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[26], false);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[27], false);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 8);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 2000);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[22], 2000);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 2000);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 2000);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[25]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[26], false);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[27], false);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 8);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 2000);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[22], 2000);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 2000);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 2000);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[25]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[26], false);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[27], false);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 8);
               }
               return;
      }
   }

}

