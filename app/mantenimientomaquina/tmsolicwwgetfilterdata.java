package app.mantenimientomaquina ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tmsolicwwgetfilterdata extends GXProcedure
{
   public tmsolicwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmsolicwwgetfilterdata.class ), "" );
   }

   public tmsolicwwgetfilterdata( int remoteHandle ,
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
      tmsolicwwgetfilterdata.this.aP5 = new String[] {""};
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
      tmsolicwwgetfilterdata.this.AV32DDOName = aP0;
      tmsolicwwgetfilterdata.this.AV30SearchTxt = aP1;
      tmsolicwwgetfilterdata.this.AV31SearchTxtTo = aP2;
      tmsolicwwgetfilterdata.this.aP3 = aP3;
      tmsolicwwgetfilterdata.this.aP4 = aP4;
      tmsolicwwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV35Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV38OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV40OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_SMUSUCRE") == 0 )
      {
         /* Execute user subroutine: 'LOADSMUSUCREOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_SMMAQCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADSMMAQCODOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_SMDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADSMDSCOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_SMMAQDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADSMMAQDSCOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_SMTXT") == 0 )
      {
         /* Execute user subroutine: 'LOADSMTXTOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV36OptionsJson = AV35Options.toJSonString(false) ;
      AV39OptionsDescJson = AV38OptionsDesc.toJSonString(false) ;
      AV41OptionIndexesJson = AV40OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV43Session.getValue("MantenimientoMaquina.TMSolicWWGridState"), "") == 0 )
      {
         AV45GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "MantenimientoMaquina.TMSolicWWGridState"), null, null);
      }
      else
      {
         AV45GridState.fromxml(AV43Session.getValue("MantenimientoMaquina.TMSolicWWGridState"), null, null);
      }
      AV54GXV1 = 1 ;
      while ( AV54GXV1 <= AV45GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV46GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV45GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV54GXV1));
         if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV48FilterFullText = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSMCOD") == 0 )
         {
            AV10TFSMCod = (int)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFSMCod_To = (int)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSMEST_SEL") == 0 )
         {
            AV22TFSMEst_SelsJson = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV23TFSMEst_Sels.fromJSonString(AV22TFSMEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSMFCHCRE") == 0 )
         {
            AV14TFSMFchCre = localUtil.ctot( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSMUSUCRE") == 0 )
         {
            AV16TFSMUsuCre = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSMUSUCRE_SEL") == 0 )
         {
            AV17TFSMUsuCre_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSMMAQCOD") == 0 )
         {
            AV18TFSMMaqCod = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSMMAQCOD_SEL") == 0 )
         {
            AV19TFSMMaqCod_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSMPRI") == 0 )
         {
            AV28TFSMPri = (byte)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV29TFSMPri_To = (byte)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSMDSC") == 0 )
         {
            AV12TFSMDsc = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSMDSC_SEL") == 0 )
         {
            AV13TFSMDsc_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSMMAQDSC") == 0 )
         {
            AV20TFSMMaqDsc = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSMMAQDSC_SEL") == 0 )
         {
            AV21TFSMMaqDsc_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSMCAL_SEL") == 0 )
         {
            AV26TFSMCal_SelsJson = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV27TFSMCal_Sels.fromJSonString(AV26TFSMCal_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSMTXT") == 0 )
         {
            AV24TFSMTxt = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSMTXT_SEL") == 0 )
         {
            AV25TFSMTxt_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&INMODO") == 0 )
         {
            AV51InModo = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV54GXV1 = (int)(AV54GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADSMUSUCREOPTIONS' Routine */
      returnInSub = false ;
      AV16TFSMUsuCre = AV30SearchTxt ;
      AV17TFSMUsuCre_Sel = "" ;
      AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext = AV48FilterFullText ;
      AV57Mantenimientomaquina_tmsolicwwds_2_tfsmcod = AV10TFSMCod ;
      AV58Mantenimientomaquina_tmsolicwwds_3_tfsmcod_to = AV11TFSMCod_To ;
      AV59Mantenimientomaquina_tmsolicwwds_4_tfsmest_sels = AV23TFSMEst_Sels ;
      AV60Mantenimientomaquina_tmsolicwwds_5_tfsmfchcre = AV14TFSMFchCre ;
      AV61Mantenimientomaquina_tmsolicwwds_6_tfsmusucre = AV16TFSMUsuCre ;
      AV62Mantenimientomaquina_tmsolicwwds_7_tfsmusucre_sel = AV17TFSMUsuCre_Sel ;
      AV63Mantenimientomaquina_tmsolicwwds_8_tfsmmaqcod = AV18TFSMMaqCod ;
      AV64Mantenimientomaquina_tmsolicwwds_9_tfsmmaqcod_sel = AV19TFSMMaqCod_Sel ;
      AV65Mantenimientomaquina_tmsolicwwds_10_tfsmpri = AV28TFSMPri ;
      AV66Mantenimientomaquina_tmsolicwwds_11_tfsmpri_to = AV29TFSMPri_To ;
      AV67Mantenimientomaquina_tmsolicwwds_12_tfsmdsc = AV12TFSMDsc ;
      AV68Mantenimientomaquina_tmsolicwwds_13_tfsmdsc_sel = AV13TFSMDsc_Sel ;
      AV69Mantenimientomaquina_tmsolicwwds_14_tfsmmaqdsc = AV20TFSMMaqDsc ;
      AV70Mantenimientomaquina_tmsolicwwds_15_tfsmmaqdsc_sel = AV21TFSMMaqDsc_Sel ;
      AV71Mantenimientomaquina_tmsolicwwds_16_tfsmcal_sels = AV27TFSMCal_Sels ;
      AV72Mantenimientomaquina_tmsolicwwds_17_tfsmtxt = AV24TFSMTxt ;
      AV73Mantenimientomaquina_tmsolicwwds_18_tfsmtxt_sel = AV25TFSMTxt_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A9522SMEst ,
                                           AV59Mantenimientomaquina_tmsolicwwds_4_tfsmest_sels ,
                                           Byte.valueOf(A9524SMCal) ,
                                           AV71Mantenimientomaquina_tmsolicwwds_16_tfsmcal_sels ,
                                           Integer.valueOf(AV57Mantenimientomaquina_tmsolicwwds_2_tfsmcod) ,
                                           Integer.valueOf(AV58Mantenimientomaquina_tmsolicwwds_3_tfsmcod_to) ,
                                           Integer.valueOf(AV59Mantenimientomaquina_tmsolicwwds_4_tfsmest_sels.size()) ,
                                           AV60Mantenimientomaquina_tmsolicwwds_5_tfsmfchcre ,
                                           AV62Mantenimientomaquina_tmsolicwwds_7_tfsmusucre_sel ,
                                           AV61Mantenimientomaquina_tmsolicwwds_6_tfsmusucre ,
                                           AV64Mantenimientomaquina_tmsolicwwds_9_tfsmmaqcod_sel ,
                                           AV63Mantenimientomaquina_tmsolicwwds_8_tfsmmaqcod ,
                                           Byte.valueOf(AV65Mantenimientomaquina_tmsolicwwds_10_tfsmpri) ,
                                           Byte.valueOf(AV66Mantenimientomaquina_tmsolicwwds_11_tfsmpri_to) ,
                                           AV68Mantenimientomaquina_tmsolicwwds_13_tfsmdsc_sel ,
                                           AV67Mantenimientomaquina_tmsolicwwds_12_tfsmdsc ,
                                           AV70Mantenimientomaquina_tmsolicwwds_15_tfsmmaqdsc_sel ,
                                           AV69Mantenimientomaquina_tmsolicwwds_14_tfsmmaqdsc ,
                                           Integer.valueOf(AV71Mantenimientomaquina_tmsolicwwds_16_tfsmcal_sels.size()) ,
                                           AV73Mantenimientomaquina_tmsolicwwds_18_tfsmtxt_sel ,
                                           AV72Mantenimientomaquina_tmsolicwwds_17_tfsmtxt ,
                                           Integer.valueOf(A9428SMCod) ,
                                           A9518SMFchCre ,
                                           A9519SMUsuCre ,
                                           A9520SMMaqCod ,
                                           Byte.valueOf(A11534SMPri) ,
                                           A9517SMDsc ,
                                           A9521SMMaqDsc ,
                                           A9523SMTxt ,
                                           AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV61Mantenimientomaquina_tmsolicwwds_6_tfsmusucre = GXutil.padr( GXutil.rtrim( AV61Mantenimientomaquina_tmsolicwwds_6_tfsmusucre), 8, "%") ;
      lV63Mantenimientomaquina_tmsolicwwds_8_tfsmmaqcod = GXutil.padr( GXutil.rtrim( AV63Mantenimientomaquina_tmsolicwwds_8_tfsmmaqcod), 6, "%") ;
      lV67Mantenimientomaquina_tmsolicwwds_12_tfsmdsc = GXutil.padr( GXutil.rtrim( AV67Mantenimientomaquina_tmsolicwwds_12_tfsmdsc), 30, "%") ;
      lV69Mantenimientomaquina_tmsolicwwds_14_tfsmmaqdsc = GXutil.padr( GXutil.rtrim( AV69Mantenimientomaquina_tmsolicwwds_14_tfsmmaqdsc), 16, "%") ;
      lV72Mantenimientomaquina_tmsolicwwds_17_tfsmtxt = GXutil.concat( GXutil.rtrim( AV72Mantenimientomaquina_tmsolicwwds_17_tfsmtxt), "%", "") ;
      /* Using cursor P08EF2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV57Mantenimientomaquina_tmsolicwwds_2_tfsmcod), Integer.valueOf(AV58Mantenimientomaquina_tmsolicwwds_3_tfsmcod_to), AV60Mantenimientomaquina_tmsolicwwds_5_tfsmfchcre, lV61Mantenimientomaquina_tmsolicwwds_6_tfsmusucre, AV62Mantenimientomaquina_tmsolicwwds_7_tfsmusucre_sel, lV63Mantenimientomaquina_tmsolicwwds_8_tfsmmaqcod, AV64Mantenimientomaquina_tmsolicwwds_9_tfsmmaqcod_sel, Byte.valueOf(AV65Mantenimientomaquina_tmsolicwwds_10_tfsmpri), Byte.valueOf(AV66Mantenimientomaquina_tmsolicwwds_11_tfsmpri_to), lV67Mantenimientomaquina_tmsolicwwds_12_tfsmdsc, AV68Mantenimientomaquina_tmsolicwwds_13_tfsmdsc_sel, lV69Mantenimientomaquina_tmsolicwwds_14_tfsmmaqdsc, AV70Mantenimientomaquina_tmsolicwwds_15_tfsmmaqdsc_sel, lV72Mantenimientomaquina_tmsolicwwds_17_tfsmtxt, AV73Mantenimientomaquina_tmsolicwwds_18_tfsmtxt_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8EF2 = false ;
         A396EmprCod = P08EF2_A396EmprCod[0] ;
         A9519SMUsuCre = P08EF2_A9519SMUsuCre[0] ;
         n9519SMUsuCre = P08EF2_n9519SMUsuCre[0] ;
         A9523SMTxt = P08EF2_A9523SMTxt[0] ;
         n9523SMTxt = P08EF2_n9523SMTxt[0] ;
         A9521SMMaqDsc = P08EF2_A9521SMMaqDsc[0] ;
         n9521SMMaqDsc = P08EF2_n9521SMMaqDsc[0] ;
         A9517SMDsc = P08EF2_A9517SMDsc[0] ;
         n9517SMDsc = P08EF2_n9517SMDsc[0] ;
         A11534SMPri = P08EF2_A11534SMPri[0] ;
         A9520SMMaqCod = P08EF2_A9520SMMaqCod[0] ;
         n9520SMMaqCod = P08EF2_n9520SMMaqCod[0] ;
         A9518SMFchCre = P08EF2_A9518SMFchCre[0] ;
         n9518SMFchCre = P08EF2_n9518SMFchCre[0] ;
         A9428SMCod = P08EF2_A9428SMCod[0] ;
         A9524SMCal = P08EF2_A9524SMCal[0] ;
         n9524SMCal = P08EF2_n9524SMCal[0] ;
         A9522SMEst = P08EF2_A9522SMEst[0] ;
         n9522SMEst = P08EF2_n9522SMEst[0] ;
         A9521SMMaqDsc = P08EF2_A9521SMMaqDsc[0] ;
         n9521SMMaqDsc = P08EF2_n9521SMMaqDsc[0] ;
         if ( (GXutil.strcmp("", AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A9428SMCod, 8, 0) , GXutil.padr( "%" + AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "pendiente generación", ""), "") , GXutil.padr( "%" + GXutil.lower( AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9522SMEst, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "generada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9522SMEst, httpContext.getMessage( "G", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "anulada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9522SMEst, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "pendiente calificacion", ""), "") , GXutil.padr( "%" + GXutil.lower( AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9522SMEst, httpContext.getMessage( "C", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "terminada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9522SMEst, httpContext.getMessage( "T", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A9519SMUsuCre) , GXutil.padr( "%" + GXutil.upper( AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9520SMMaqCod) , GXutil.padr( "%" + GXutil.upper( AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A11534SMPri, 1, 0) , GXutil.padr( "%" + AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9517SMDsc) , GXutil.padr( "%" + GXutil.upper( AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9521SMMaqDsc) , GXutil.padr( "%" + GXutil.upper( AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "pesima", ""), "") , GXutil.padr( "%" + GXutil.lower( AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A9524SMCal == 1 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "mala", ""), "") , GXutil.padr( "%" + GXutil.lower( AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A9524SMCal == 2 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "aceptable", ""), "") , GXutil.padr( "%" + GXutil.lower( AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A9524SMCal == 3 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "satisfactorio", ""), "") , GXutil.padr( "%" + GXutil.lower( AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A9524SMCal == 4 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "excelente", ""), "") , GXutil.padr( "%" + GXutil.lower( AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A9524SMCal == 5 ) ) || ( GXutil.like( GXutil.upper( A9523SMTxt) , GXutil.padr( "%" + GXutil.upper( AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            if ( GXutil.strcmp(A9522SMEst, httpContext.getMessage( "T", "")) != 0 )
            {
               AV42count = 0 ;
               while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08EF2_A9519SMUsuCre[0], A9519SMUsuCre) == 0 ) )
               {
                  brk8EF2 = false ;
                  A396EmprCod = P08EF2_A396EmprCod[0] ;
                  A9428SMCod = P08EF2_A9428SMCod[0] ;
                  AV42count = (long)(AV42count+1) ;
                  brk8EF2 = true ;
                  pr_default.readNext(0);
               }
               if ( ! (GXutil.strcmp("", A9519SMUsuCre)==0) )
               {
                  AV34Option = A9519SMUsuCre ;
                  AV37OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A9519SMUsuCre, "@!"))) ;
                  AV35Options.add(AV34Option, 0);
                  AV38OptionsDesc.add(AV37OptionDesc, 0);
                  AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), 0);
               }
               if ( AV35Options.size() == 50 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
            }
         }
         if ( ! brk8EF2 )
         {
            brk8EF2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADSMMAQCODOPTIONS' Routine */
      returnInSub = false ;
      AV18TFSMMaqCod = AV30SearchTxt ;
      AV19TFSMMaqCod_Sel = "" ;
      AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext = AV48FilterFullText ;
      AV57Mantenimientomaquina_tmsolicwwds_2_tfsmcod = AV10TFSMCod ;
      AV58Mantenimientomaquina_tmsolicwwds_3_tfsmcod_to = AV11TFSMCod_To ;
      AV59Mantenimientomaquina_tmsolicwwds_4_tfsmest_sels = AV23TFSMEst_Sels ;
      AV60Mantenimientomaquina_tmsolicwwds_5_tfsmfchcre = AV14TFSMFchCre ;
      AV61Mantenimientomaquina_tmsolicwwds_6_tfsmusucre = AV16TFSMUsuCre ;
      AV62Mantenimientomaquina_tmsolicwwds_7_tfsmusucre_sel = AV17TFSMUsuCre_Sel ;
      AV63Mantenimientomaquina_tmsolicwwds_8_tfsmmaqcod = AV18TFSMMaqCod ;
      AV64Mantenimientomaquina_tmsolicwwds_9_tfsmmaqcod_sel = AV19TFSMMaqCod_Sel ;
      AV65Mantenimientomaquina_tmsolicwwds_10_tfsmpri = AV28TFSMPri ;
      AV66Mantenimientomaquina_tmsolicwwds_11_tfsmpri_to = AV29TFSMPri_To ;
      AV67Mantenimientomaquina_tmsolicwwds_12_tfsmdsc = AV12TFSMDsc ;
      AV68Mantenimientomaquina_tmsolicwwds_13_tfsmdsc_sel = AV13TFSMDsc_Sel ;
      AV69Mantenimientomaquina_tmsolicwwds_14_tfsmmaqdsc = AV20TFSMMaqDsc ;
      AV70Mantenimientomaquina_tmsolicwwds_15_tfsmmaqdsc_sel = AV21TFSMMaqDsc_Sel ;
      AV71Mantenimientomaquina_tmsolicwwds_16_tfsmcal_sels = AV27TFSMCal_Sels ;
      AV72Mantenimientomaquina_tmsolicwwds_17_tfsmtxt = AV24TFSMTxt ;
      AV73Mantenimientomaquina_tmsolicwwds_18_tfsmtxt_sel = AV25TFSMTxt_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           A9522SMEst ,
                                           AV59Mantenimientomaquina_tmsolicwwds_4_tfsmest_sels ,
                                           Byte.valueOf(A9524SMCal) ,
                                           AV71Mantenimientomaquina_tmsolicwwds_16_tfsmcal_sels ,
                                           Integer.valueOf(AV57Mantenimientomaquina_tmsolicwwds_2_tfsmcod) ,
                                           Integer.valueOf(AV58Mantenimientomaquina_tmsolicwwds_3_tfsmcod_to) ,
                                           Integer.valueOf(AV59Mantenimientomaquina_tmsolicwwds_4_tfsmest_sels.size()) ,
                                           AV60Mantenimientomaquina_tmsolicwwds_5_tfsmfchcre ,
                                           AV62Mantenimientomaquina_tmsolicwwds_7_tfsmusucre_sel ,
                                           AV61Mantenimientomaquina_tmsolicwwds_6_tfsmusucre ,
                                           AV64Mantenimientomaquina_tmsolicwwds_9_tfsmmaqcod_sel ,
                                           AV63Mantenimientomaquina_tmsolicwwds_8_tfsmmaqcod ,
                                           Byte.valueOf(AV65Mantenimientomaquina_tmsolicwwds_10_tfsmpri) ,
                                           Byte.valueOf(AV66Mantenimientomaquina_tmsolicwwds_11_tfsmpri_to) ,
                                           AV68Mantenimientomaquina_tmsolicwwds_13_tfsmdsc_sel ,
                                           AV67Mantenimientomaquina_tmsolicwwds_12_tfsmdsc ,
                                           AV70Mantenimientomaquina_tmsolicwwds_15_tfsmmaqdsc_sel ,
                                           AV69Mantenimientomaquina_tmsolicwwds_14_tfsmmaqdsc ,
                                           Integer.valueOf(AV71Mantenimientomaquina_tmsolicwwds_16_tfsmcal_sels.size()) ,
                                           AV73Mantenimientomaquina_tmsolicwwds_18_tfsmtxt_sel ,
                                           AV72Mantenimientomaquina_tmsolicwwds_17_tfsmtxt ,
                                           Integer.valueOf(A9428SMCod) ,
                                           A9518SMFchCre ,
                                           A9519SMUsuCre ,
                                           A9520SMMaqCod ,
                                           Byte.valueOf(A11534SMPri) ,
                                           A9517SMDsc ,
                                           A9521SMMaqDsc ,
                                           A9523SMTxt ,
                                           AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV61Mantenimientomaquina_tmsolicwwds_6_tfsmusucre = GXutil.padr( GXutil.rtrim( AV61Mantenimientomaquina_tmsolicwwds_6_tfsmusucre), 8, "%") ;
      lV63Mantenimientomaquina_tmsolicwwds_8_tfsmmaqcod = GXutil.padr( GXutil.rtrim( AV63Mantenimientomaquina_tmsolicwwds_8_tfsmmaqcod), 6, "%") ;
      lV67Mantenimientomaquina_tmsolicwwds_12_tfsmdsc = GXutil.padr( GXutil.rtrim( AV67Mantenimientomaquina_tmsolicwwds_12_tfsmdsc), 30, "%") ;
      lV69Mantenimientomaquina_tmsolicwwds_14_tfsmmaqdsc = GXutil.padr( GXutil.rtrim( AV69Mantenimientomaquina_tmsolicwwds_14_tfsmmaqdsc), 16, "%") ;
      lV72Mantenimientomaquina_tmsolicwwds_17_tfsmtxt = GXutil.concat( GXutil.rtrim( AV72Mantenimientomaquina_tmsolicwwds_17_tfsmtxt), "%", "") ;
      /* Using cursor P08EF3 */
      pr_default.execute(1, new Object[] {Integer.valueOf(AV57Mantenimientomaquina_tmsolicwwds_2_tfsmcod), Integer.valueOf(AV58Mantenimientomaquina_tmsolicwwds_3_tfsmcod_to), AV60Mantenimientomaquina_tmsolicwwds_5_tfsmfchcre, lV61Mantenimientomaquina_tmsolicwwds_6_tfsmusucre, AV62Mantenimientomaquina_tmsolicwwds_7_tfsmusucre_sel, lV63Mantenimientomaquina_tmsolicwwds_8_tfsmmaqcod, AV64Mantenimientomaquina_tmsolicwwds_9_tfsmmaqcod_sel, Byte.valueOf(AV65Mantenimientomaquina_tmsolicwwds_10_tfsmpri), Byte.valueOf(AV66Mantenimientomaquina_tmsolicwwds_11_tfsmpri_to), lV67Mantenimientomaquina_tmsolicwwds_12_tfsmdsc, AV68Mantenimientomaquina_tmsolicwwds_13_tfsmdsc_sel, lV69Mantenimientomaquina_tmsolicwwds_14_tfsmmaqdsc, AV70Mantenimientomaquina_tmsolicwwds_15_tfsmmaqdsc_sel, lV72Mantenimientomaquina_tmsolicwwds_17_tfsmtxt, AV73Mantenimientomaquina_tmsolicwwds_18_tfsmtxt_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8EF4 = false ;
         A396EmprCod = P08EF3_A396EmprCod[0] ;
         A9520SMMaqCod = P08EF3_A9520SMMaqCod[0] ;
         n9520SMMaqCod = P08EF3_n9520SMMaqCod[0] ;
         A9523SMTxt = P08EF3_A9523SMTxt[0] ;
         n9523SMTxt = P08EF3_n9523SMTxt[0] ;
         A9521SMMaqDsc = P08EF3_A9521SMMaqDsc[0] ;
         n9521SMMaqDsc = P08EF3_n9521SMMaqDsc[0] ;
         A9517SMDsc = P08EF3_A9517SMDsc[0] ;
         n9517SMDsc = P08EF3_n9517SMDsc[0] ;
         A11534SMPri = P08EF3_A11534SMPri[0] ;
         A9519SMUsuCre = P08EF3_A9519SMUsuCre[0] ;
         n9519SMUsuCre = P08EF3_n9519SMUsuCre[0] ;
         A9518SMFchCre = P08EF3_A9518SMFchCre[0] ;
         n9518SMFchCre = P08EF3_n9518SMFchCre[0] ;
         A9428SMCod = P08EF3_A9428SMCod[0] ;
         A9524SMCal = P08EF3_A9524SMCal[0] ;
         n9524SMCal = P08EF3_n9524SMCal[0] ;
         A9522SMEst = P08EF3_A9522SMEst[0] ;
         n9522SMEst = P08EF3_n9522SMEst[0] ;
         A9521SMMaqDsc = P08EF3_A9521SMMaqDsc[0] ;
         n9521SMMaqDsc = P08EF3_n9521SMMaqDsc[0] ;
         if ( (GXutil.strcmp("", AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A9428SMCod, 8, 0) , GXutil.padr( "%" + AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "pendiente generación", ""), "") , GXutil.padr( "%" + GXutil.lower( AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9522SMEst, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "generada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9522SMEst, httpContext.getMessage( "G", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "anulada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9522SMEst, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "pendiente calificacion", ""), "") , GXutil.padr( "%" + GXutil.lower( AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9522SMEst, httpContext.getMessage( "C", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "terminada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9522SMEst, httpContext.getMessage( "T", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A9519SMUsuCre) , GXutil.padr( "%" + GXutil.upper( AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9520SMMaqCod) , GXutil.padr( "%" + GXutil.upper( AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A11534SMPri, 1, 0) , GXutil.padr( "%" + AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9517SMDsc) , GXutil.padr( "%" + GXutil.upper( AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9521SMMaqDsc) , GXutil.padr( "%" + GXutil.upper( AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "pesima", ""), "") , GXutil.padr( "%" + GXutil.lower( AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A9524SMCal == 1 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "mala", ""), "") , GXutil.padr( "%" + GXutil.lower( AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A9524SMCal == 2 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "aceptable", ""), "") , GXutil.padr( "%" + GXutil.lower( AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A9524SMCal == 3 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "satisfactorio", ""), "") , GXutil.padr( "%" + GXutil.lower( AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A9524SMCal == 4 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "excelente", ""), "") , GXutil.padr( "%" + GXutil.lower( AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A9524SMCal == 5 ) ) || ( GXutil.like( GXutil.upper( A9523SMTxt) , GXutil.padr( "%" + GXutil.upper( AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            if ( GXutil.strcmp(A9522SMEst, httpContext.getMessage( "T", "")) != 0 )
            {
               AV42count = 0 ;
               while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08EF3_A9520SMMaqCod[0], A9520SMMaqCod) == 0 ) )
               {
                  brk8EF4 = false ;
                  A396EmprCod = P08EF3_A396EmprCod[0] ;
                  A9428SMCod = P08EF3_A9428SMCod[0] ;
                  AV42count = (long)(AV42count+1) ;
                  brk8EF4 = true ;
                  pr_default.readNext(1);
               }
               if ( ! (GXutil.strcmp("", A9520SMMaqCod)==0) )
               {
                  AV34Option = A9520SMMaqCod ;
                  AV35Options.add(AV34Option, 0);
                  AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), 0);
               }
               if ( AV35Options.size() == 50 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
            }
         }
         if ( ! brk8EF4 )
         {
            brk8EF4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADSMDSCOPTIONS' Routine */
      returnInSub = false ;
      AV12TFSMDsc = AV30SearchTxt ;
      AV13TFSMDsc_Sel = "" ;
      AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext = AV48FilterFullText ;
      AV57Mantenimientomaquina_tmsolicwwds_2_tfsmcod = AV10TFSMCod ;
      AV58Mantenimientomaquina_tmsolicwwds_3_tfsmcod_to = AV11TFSMCod_To ;
      AV59Mantenimientomaquina_tmsolicwwds_4_tfsmest_sels = AV23TFSMEst_Sels ;
      AV60Mantenimientomaquina_tmsolicwwds_5_tfsmfchcre = AV14TFSMFchCre ;
      AV61Mantenimientomaquina_tmsolicwwds_6_tfsmusucre = AV16TFSMUsuCre ;
      AV62Mantenimientomaquina_tmsolicwwds_7_tfsmusucre_sel = AV17TFSMUsuCre_Sel ;
      AV63Mantenimientomaquina_tmsolicwwds_8_tfsmmaqcod = AV18TFSMMaqCod ;
      AV64Mantenimientomaquina_tmsolicwwds_9_tfsmmaqcod_sel = AV19TFSMMaqCod_Sel ;
      AV65Mantenimientomaquina_tmsolicwwds_10_tfsmpri = AV28TFSMPri ;
      AV66Mantenimientomaquina_tmsolicwwds_11_tfsmpri_to = AV29TFSMPri_To ;
      AV67Mantenimientomaquina_tmsolicwwds_12_tfsmdsc = AV12TFSMDsc ;
      AV68Mantenimientomaquina_tmsolicwwds_13_tfsmdsc_sel = AV13TFSMDsc_Sel ;
      AV69Mantenimientomaquina_tmsolicwwds_14_tfsmmaqdsc = AV20TFSMMaqDsc ;
      AV70Mantenimientomaquina_tmsolicwwds_15_tfsmmaqdsc_sel = AV21TFSMMaqDsc_Sel ;
      AV71Mantenimientomaquina_tmsolicwwds_16_tfsmcal_sels = AV27TFSMCal_Sels ;
      AV72Mantenimientomaquina_tmsolicwwds_17_tfsmtxt = AV24TFSMTxt ;
      AV73Mantenimientomaquina_tmsolicwwds_18_tfsmtxt_sel = AV25TFSMTxt_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           A9522SMEst ,
                                           AV59Mantenimientomaquina_tmsolicwwds_4_tfsmest_sels ,
                                           Byte.valueOf(A9524SMCal) ,
                                           AV71Mantenimientomaquina_tmsolicwwds_16_tfsmcal_sels ,
                                           Integer.valueOf(AV57Mantenimientomaquina_tmsolicwwds_2_tfsmcod) ,
                                           Integer.valueOf(AV58Mantenimientomaquina_tmsolicwwds_3_tfsmcod_to) ,
                                           Integer.valueOf(AV59Mantenimientomaquina_tmsolicwwds_4_tfsmest_sels.size()) ,
                                           AV60Mantenimientomaquina_tmsolicwwds_5_tfsmfchcre ,
                                           AV62Mantenimientomaquina_tmsolicwwds_7_tfsmusucre_sel ,
                                           AV61Mantenimientomaquina_tmsolicwwds_6_tfsmusucre ,
                                           AV64Mantenimientomaquina_tmsolicwwds_9_tfsmmaqcod_sel ,
                                           AV63Mantenimientomaquina_tmsolicwwds_8_tfsmmaqcod ,
                                           Byte.valueOf(AV65Mantenimientomaquina_tmsolicwwds_10_tfsmpri) ,
                                           Byte.valueOf(AV66Mantenimientomaquina_tmsolicwwds_11_tfsmpri_to) ,
                                           AV68Mantenimientomaquina_tmsolicwwds_13_tfsmdsc_sel ,
                                           AV67Mantenimientomaquina_tmsolicwwds_12_tfsmdsc ,
                                           AV70Mantenimientomaquina_tmsolicwwds_15_tfsmmaqdsc_sel ,
                                           AV69Mantenimientomaquina_tmsolicwwds_14_tfsmmaqdsc ,
                                           Integer.valueOf(AV71Mantenimientomaquina_tmsolicwwds_16_tfsmcal_sels.size()) ,
                                           AV73Mantenimientomaquina_tmsolicwwds_18_tfsmtxt_sel ,
                                           AV72Mantenimientomaquina_tmsolicwwds_17_tfsmtxt ,
                                           Integer.valueOf(A9428SMCod) ,
                                           A9518SMFchCre ,
                                           A9519SMUsuCre ,
                                           A9520SMMaqCod ,
                                           Byte.valueOf(A11534SMPri) ,
                                           A9517SMDsc ,
                                           A9521SMMaqDsc ,
                                           A9523SMTxt ,
                                           AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV61Mantenimientomaquina_tmsolicwwds_6_tfsmusucre = GXutil.padr( GXutil.rtrim( AV61Mantenimientomaquina_tmsolicwwds_6_tfsmusucre), 8, "%") ;
      lV63Mantenimientomaquina_tmsolicwwds_8_tfsmmaqcod = GXutil.padr( GXutil.rtrim( AV63Mantenimientomaquina_tmsolicwwds_8_tfsmmaqcod), 6, "%") ;
      lV67Mantenimientomaquina_tmsolicwwds_12_tfsmdsc = GXutil.padr( GXutil.rtrim( AV67Mantenimientomaquina_tmsolicwwds_12_tfsmdsc), 30, "%") ;
      lV69Mantenimientomaquina_tmsolicwwds_14_tfsmmaqdsc = GXutil.padr( GXutil.rtrim( AV69Mantenimientomaquina_tmsolicwwds_14_tfsmmaqdsc), 16, "%") ;
      lV72Mantenimientomaquina_tmsolicwwds_17_tfsmtxt = GXutil.concat( GXutil.rtrim( AV72Mantenimientomaquina_tmsolicwwds_17_tfsmtxt), "%", "") ;
      /* Using cursor P08EF4 */
      pr_default.execute(2, new Object[] {Integer.valueOf(AV57Mantenimientomaquina_tmsolicwwds_2_tfsmcod), Integer.valueOf(AV58Mantenimientomaquina_tmsolicwwds_3_tfsmcod_to), AV60Mantenimientomaquina_tmsolicwwds_5_tfsmfchcre, lV61Mantenimientomaquina_tmsolicwwds_6_tfsmusucre, AV62Mantenimientomaquina_tmsolicwwds_7_tfsmusucre_sel, lV63Mantenimientomaquina_tmsolicwwds_8_tfsmmaqcod, AV64Mantenimientomaquina_tmsolicwwds_9_tfsmmaqcod_sel, Byte.valueOf(AV65Mantenimientomaquina_tmsolicwwds_10_tfsmpri), Byte.valueOf(AV66Mantenimientomaquina_tmsolicwwds_11_tfsmpri_to), lV67Mantenimientomaquina_tmsolicwwds_12_tfsmdsc, AV68Mantenimientomaquina_tmsolicwwds_13_tfsmdsc_sel, lV69Mantenimientomaquina_tmsolicwwds_14_tfsmmaqdsc, AV70Mantenimientomaquina_tmsolicwwds_15_tfsmmaqdsc_sel, lV72Mantenimientomaquina_tmsolicwwds_17_tfsmtxt, AV73Mantenimientomaquina_tmsolicwwds_18_tfsmtxt_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk8EF6 = false ;
         A396EmprCod = P08EF4_A396EmprCod[0] ;
         A9517SMDsc = P08EF4_A9517SMDsc[0] ;
         n9517SMDsc = P08EF4_n9517SMDsc[0] ;
         A9523SMTxt = P08EF4_A9523SMTxt[0] ;
         n9523SMTxt = P08EF4_n9523SMTxt[0] ;
         A9521SMMaqDsc = P08EF4_A9521SMMaqDsc[0] ;
         n9521SMMaqDsc = P08EF4_n9521SMMaqDsc[0] ;
         A11534SMPri = P08EF4_A11534SMPri[0] ;
         A9520SMMaqCod = P08EF4_A9520SMMaqCod[0] ;
         n9520SMMaqCod = P08EF4_n9520SMMaqCod[0] ;
         A9519SMUsuCre = P08EF4_A9519SMUsuCre[0] ;
         n9519SMUsuCre = P08EF4_n9519SMUsuCre[0] ;
         A9518SMFchCre = P08EF4_A9518SMFchCre[0] ;
         n9518SMFchCre = P08EF4_n9518SMFchCre[0] ;
         A9428SMCod = P08EF4_A9428SMCod[0] ;
         A9524SMCal = P08EF4_A9524SMCal[0] ;
         n9524SMCal = P08EF4_n9524SMCal[0] ;
         A9522SMEst = P08EF4_A9522SMEst[0] ;
         n9522SMEst = P08EF4_n9522SMEst[0] ;
         A9521SMMaqDsc = P08EF4_A9521SMMaqDsc[0] ;
         n9521SMMaqDsc = P08EF4_n9521SMMaqDsc[0] ;
         if ( (GXutil.strcmp("", AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A9428SMCod, 8, 0) , GXutil.padr( "%" + AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "pendiente generación", ""), "") , GXutil.padr( "%" + GXutil.lower( AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9522SMEst, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "generada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9522SMEst, httpContext.getMessage( "G", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "anulada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9522SMEst, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "pendiente calificacion", ""), "") , GXutil.padr( "%" + GXutil.lower( AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9522SMEst, httpContext.getMessage( "C", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "terminada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9522SMEst, httpContext.getMessage( "T", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A9519SMUsuCre) , GXutil.padr( "%" + GXutil.upper( AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9520SMMaqCod) , GXutil.padr( "%" + GXutil.upper( AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A11534SMPri, 1, 0) , GXutil.padr( "%" + AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9517SMDsc) , GXutil.padr( "%" + GXutil.upper( AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9521SMMaqDsc) , GXutil.padr( "%" + GXutil.upper( AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "pesima", ""), "") , GXutil.padr( "%" + GXutil.lower( AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A9524SMCal == 1 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "mala", ""), "") , GXutil.padr( "%" + GXutil.lower( AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A9524SMCal == 2 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "aceptable", ""), "") , GXutil.padr( "%" + GXutil.lower( AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A9524SMCal == 3 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "satisfactorio", ""), "") , GXutil.padr( "%" + GXutil.lower( AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A9524SMCal == 4 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "excelente", ""), "") , GXutil.padr( "%" + GXutil.lower( AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A9524SMCal == 5 ) ) || ( GXutil.like( GXutil.upper( A9523SMTxt) , GXutil.padr( "%" + GXutil.upper( AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            if ( GXutil.strcmp(A9522SMEst, httpContext.getMessage( "T", "")) != 0 )
            {
               AV42count = 0 ;
               while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P08EF4_A9517SMDsc[0], A9517SMDsc) == 0 ) )
               {
                  brk8EF6 = false ;
                  A396EmprCod = P08EF4_A396EmprCod[0] ;
                  A9428SMCod = P08EF4_A9428SMCod[0] ;
                  AV42count = (long)(AV42count+1) ;
                  brk8EF6 = true ;
                  pr_default.readNext(2);
               }
               if ( ! (GXutil.strcmp("", A9517SMDsc)==0) )
               {
                  AV34Option = A9517SMDsc ;
                  AV35Options.add(AV34Option, 0);
                  AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), 0);
               }
               if ( AV35Options.size() == 50 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
            }
         }
         if ( ! brk8EF6 )
         {
            brk8EF6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADSMMAQDSCOPTIONS' Routine */
      returnInSub = false ;
      AV20TFSMMaqDsc = AV30SearchTxt ;
      AV21TFSMMaqDsc_Sel = "" ;
      AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext = AV48FilterFullText ;
      AV57Mantenimientomaquina_tmsolicwwds_2_tfsmcod = AV10TFSMCod ;
      AV58Mantenimientomaquina_tmsolicwwds_3_tfsmcod_to = AV11TFSMCod_To ;
      AV59Mantenimientomaquina_tmsolicwwds_4_tfsmest_sels = AV23TFSMEst_Sels ;
      AV60Mantenimientomaquina_tmsolicwwds_5_tfsmfchcre = AV14TFSMFchCre ;
      AV61Mantenimientomaquina_tmsolicwwds_6_tfsmusucre = AV16TFSMUsuCre ;
      AV62Mantenimientomaquina_tmsolicwwds_7_tfsmusucre_sel = AV17TFSMUsuCre_Sel ;
      AV63Mantenimientomaquina_tmsolicwwds_8_tfsmmaqcod = AV18TFSMMaqCod ;
      AV64Mantenimientomaquina_tmsolicwwds_9_tfsmmaqcod_sel = AV19TFSMMaqCod_Sel ;
      AV65Mantenimientomaquina_tmsolicwwds_10_tfsmpri = AV28TFSMPri ;
      AV66Mantenimientomaquina_tmsolicwwds_11_tfsmpri_to = AV29TFSMPri_To ;
      AV67Mantenimientomaquina_tmsolicwwds_12_tfsmdsc = AV12TFSMDsc ;
      AV68Mantenimientomaquina_tmsolicwwds_13_tfsmdsc_sel = AV13TFSMDsc_Sel ;
      AV69Mantenimientomaquina_tmsolicwwds_14_tfsmmaqdsc = AV20TFSMMaqDsc ;
      AV70Mantenimientomaquina_tmsolicwwds_15_tfsmmaqdsc_sel = AV21TFSMMaqDsc_Sel ;
      AV71Mantenimientomaquina_tmsolicwwds_16_tfsmcal_sels = AV27TFSMCal_Sels ;
      AV72Mantenimientomaquina_tmsolicwwds_17_tfsmtxt = AV24TFSMTxt ;
      AV73Mantenimientomaquina_tmsolicwwds_18_tfsmtxt_sel = AV25TFSMTxt_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           A9522SMEst ,
                                           AV59Mantenimientomaquina_tmsolicwwds_4_tfsmest_sels ,
                                           Byte.valueOf(A9524SMCal) ,
                                           AV71Mantenimientomaquina_tmsolicwwds_16_tfsmcal_sels ,
                                           Integer.valueOf(AV57Mantenimientomaquina_tmsolicwwds_2_tfsmcod) ,
                                           Integer.valueOf(AV58Mantenimientomaquina_tmsolicwwds_3_tfsmcod_to) ,
                                           Integer.valueOf(AV59Mantenimientomaquina_tmsolicwwds_4_tfsmest_sels.size()) ,
                                           AV60Mantenimientomaquina_tmsolicwwds_5_tfsmfchcre ,
                                           AV62Mantenimientomaquina_tmsolicwwds_7_tfsmusucre_sel ,
                                           AV61Mantenimientomaquina_tmsolicwwds_6_tfsmusucre ,
                                           AV64Mantenimientomaquina_tmsolicwwds_9_tfsmmaqcod_sel ,
                                           AV63Mantenimientomaquina_tmsolicwwds_8_tfsmmaqcod ,
                                           Byte.valueOf(AV65Mantenimientomaquina_tmsolicwwds_10_tfsmpri) ,
                                           Byte.valueOf(AV66Mantenimientomaquina_tmsolicwwds_11_tfsmpri_to) ,
                                           AV68Mantenimientomaquina_tmsolicwwds_13_tfsmdsc_sel ,
                                           AV67Mantenimientomaquina_tmsolicwwds_12_tfsmdsc ,
                                           AV70Mantenimientomaquina_tmsolicwwds_15_tfsmmaqdsc_sel ,
                                           AV69Mantenimientomaquina_tmsolicwwds_14_tfsmmaqdsc ,
                                           Integer.valueOf(AV71Mantenimientomaquina_tmsolicwwds_16_tfsmcal_sels.size()) ,
                                           AV73Mantenimientomaquina_tmsolicwwds_18_tfsmtxt_sel ,
                                           AV72Mantenimientomaquina_tmsolicwwds_17_tfsmtxt ,
                                           Integer.valueOf(A9428SMCod) ,
                                           A9518SMFchCre ,
                                           A9519SMUsuCre ,
                                           A9520SMMaqCod ,
                                           Byte.valueOf(A11534SMPri) ,
                                           A9517SMDsc ,
                                           A9521SMMaqDsc ,
                                           A9523SMTxt ,
                                           AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV61Mantenimientomaquina_tmsolicwwds_6_tfsmusucre = GXutil.padr( GXutil.rtrim( AV61Mantenimientomaquina_tmsolicwwds_6_tfsmusucre), 8, "%") ;
      lV63Mantenimientomaquina_tmsolicwwds_8_tfsmmaqcod = GXutil.padr( GXutil.rtrim( AV63Mantenimientomaquina_tmsolicwwds_8_tfsmmaqcod), 6, "%") ;
      lV67Mantenimientomaquina_tmsolicwwds_12_tfsmdsc = GXutil.padr( GXutil.rtrim( AV67Mantenimientomaquina_tmsolicwwds_12_tfsmdsc), 30, "%") ;
      lV69Mantenimientomaquina_tmsolicwwds_14_tfsmmaqdsc = GXutil.padr( GXutil.rtrim( AV69Mantenimientomaquina_tmsolicwwds_14_tfsmmaqdsc), 16, "%") ;
      lV72Mantenimientomaquina_tmsolicwwds_17_tfsmtxt = GXutil.concat( GXutil.rtrim( AV72Mantenimientomaquina_tmsolicwwds_17_tfsmtxt), "%", "") ;
      /* Using cursor P08EF5 */
      pr_default.execute(3, new Object[] {Integer.valueOf(AV57Mantenimientomaquina_tmsolicwwds_2_tfsmcod), Integer.valueOf(AV58Mantenimientomaquina_tmsolicwwds_3_tfsmcod_to), AV60Mantenimientomaquina_tmsolicwwds_5_tfsmfchcre, lV61Mantenimientomaquina_tmsolicwwds_6_tfsmusucre, AV62Mantenimientomaquina_tmsolicwwds_7_tfsmusucre_sel, lV63Mantenimientomaquina_tmsolicwwds_8_tfsmmaqcod, AV64Mantenimientomaquina_tmsolicwwds_9_tfsmmaqcod_sel, Byte.valueOf(AV65Mantenimientomaquina_tmsolicwwds_10_tfsmpri), Byte.valueOf(AV66Mantenimientomaquina_tmsolicwwds_11_tfsmpri_to), lV67Mantenimientomaquina_tmsolicwwds_12_tfsmdsc, AV68Mantenimientomaquina_tmsolicwwds_13_tfsmdsc_sel, lV69Mantenimientomaquina_tmsolicwwds_14_tfsmmaqdsc, AV70Mantenimientomaquina_tmsolicwwds_15_tfsmmaqdsc_sel, lV72Mantenimientomaquina_tmsolicwwds_17_tfsmtxt, AV73Mantenimientomaquina_tmsolicwwds_18_tfsmtxt_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk8EF8 = false ;
         A9520SMMaqCod = P08EF5_A9520SMMaqCod[0] ;
         n9520SMMaqCod = P08EF5_n9520SMMaqCod[0] ;
         A396EmprCod = P08EF5_A396EmprCod[0] ;
         A9523SMTxt = P08EF5_A9523SMTxt[0] ;
         n9523SMTxt = P08EF5_n9523SMTxt[0] ;
         A9521SMMaqDsc = P08EF5_A9521SMMaqDsc[0] ;
         n9521SMMaqDsc = P08EF5_n9521SMMaqDsc[0] ;
         A9517SMDsc = P08EF5_A9517SMDsc[0] ;
         n9517SMDsc = P08EF5_n9517SMDsc[0] ;
         A11534SMPri = P08EF5_A11534SMPri[0] ;
         A9519SMUsuCre = P08EF5_A9519SMUsuCre[0] ;
         n9519SMUsuCre = P08EF5_n9519SMUsuCre[0] ;
         A9518SMFchCre = P08EF5_A9518SMFchCre[0] ;
         n9518SMFchCre = P08EF5_n9518SMFchCre[0] ;
         A9428SMCod = P08EF5_A9428SMCod[0] ;
         A9524SMCal = P08EF5_A9524SMCal[0] ;
         n9524SMCal = P08EF5_n9524SMCal[0] ;
         A9522SMEst = P08EF5_A9522SMEst[0] ;
         n9522SMEst = P08EF5_n9522SMEst[0] ;
         A9521SMMaqDsc = P08EF5_A9521SMMaqDsc[0] ;
         n9521SMMaqDsc = P08EF5_n9521SMMaqDsc[0] ;
         if ( (GXutil.strcmp("", AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A9428SMCod, 8, 0) , GXutil.padr( "%" + AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "pendiente generación", ""), "") , GXutil.padr( "%" + GXutil.lower( AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9522SMEst, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "generada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9522SMEst, httpContext.getMessage( "G", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "anulada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9522SMEst, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "pendiente calificacion", ""), "") , GXutil.padr( "%" + GXutil.lower( AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9522SMEst, httpContext.getMessage( "C", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "terminada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9522SMEst, httpContext.getMessage( "T", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A9519SMUsuCre) , GXutil.padr( "%" + GXutil.upper( AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9520SMMaqCod) , GXutil.padr( "%" + GXutil.upper( AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A11534SMPri, 1, 0) , GXutil.padr( "%" + AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9517SMDsc) , GXutil.padr( "%" + GXutil.upper( AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9521SMMaqDsc) , GXutil.padr( "%" + GXutil.upper( AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "pesima", ""), "") , GXutil.padr( "%" + GXutil.lower( AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A9524SMCal == 1 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "mala", ""), "") , GXutil.padr( "%" + GXutil.lower( AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A9524SMCal == 2 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "aceptable", ""), "") , GXutil.padr( "%" + GXutil.lower( AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A9524SMCal == 3 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "satisfactorio", ""), "") , GXutil.padr( "%" + GXutil.lower( AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A9524SMCal == 4 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "excelente", ""), "") , GXutil.padr( "%" + GXutil.lower( AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A9524SMCal == 5 ) ) || ( GXutil.like( GXutil.upper( A9523SMTxt) , GXutil.padr( "%" + GXutil.upper( AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            if ( GXutil.strcmp(A9522SMEst, httpContext.getMessage( "T", "")) != 0 )
            {
               AV42count = 0 ;
               while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P08EF5_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P08EF5_A9520SMMaqCod[0], A9520SMMaqCod) == 0 ) )
               {
                  brk8EF8 = false ;
                  A9428SMCod = P08EF5_A9428SMCod[0] ;
                  AV42count = (long)(AV42count+1) ;
                  brk8EF8 = true ;
                  pr_default.readNext(3);
               }
               if ( ! (GXutil.strcmp("", A9521SMMaqDsc)==0) )
               {
                  AV34Option = A9521SMMaqDsc ;
                  AV33InsertIndex = 1 ;
                  while ( ( AV33InsertIndex <= AV35Options.size() ) && ( GXutil.strcmp((String)AV35Options.elementAt(-1+AV33InsertIndex), AV34Option) < 0 ) )
                  {
                     AV33InsertIndex = (int)(AV33InsertIndex+1) ;
                  }
                  AV35Options.add(AV34Option, AV33InsertIndex);
                  AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), AV33InsertIndex);
               }
               if ( AV35Options.size() == 50 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
            }
         }
         if ( ! brk8EF8 )
         {
            brk8EF8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADSMTXTOPTIONS' Routine */
      returnInSub = false ;
      AV24TFSMTxt = AV30SearchTxt ;
      AV25TFSMTxt_Sel = "" ;
      AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext = AV48FilterFullText ;
      AV57Mantenimientomaquina_tmsolicwwds_2_tfsmcod = AV10TFSMCod ;
      AV58Mantenimientomaquina_tmsolicwwds_3_tfsmcod_to = AV11TFSMCod_To ;
      AV59Mantenimientomaquina_tmsolicwwds_4_tfsmest_sels = AV23TFSMEst_Sels ;
      AV60Mantenimientomaquina_tmsolicwwds_5_tfsmfchcre = AV14TFSMFchCre ;
      AV61Mantenimientomaquina_tmsolicwwds_6_tfsmusucre = AV16TFSMUsuCre ;
      AV62Mantenimientomaquina_tmsolicwwds_7_tfsmusucre_sel = AV17TFSMUsuCre_Sel ;
      AV63Mantenimientomaquina_tmsolicwwds_8_tfsmmaqcod = AV18TFSMMaqCod ;
      AV64Mantenimientomaquina_tmsolicwwds_9_tfsmmaqcod_sel = AV19TFSMMaqCod_Sel ;
      AV65Mantenimientomaquina_tmsolicwwds_10_tfsmpri = AV28TFSMPri ;
      AV66Mantenimientomaquina_tmsolicwwds_11_tfsmpri_to = AV29TFSMPri_To ;
      AV67Mantenimientomaquina_tmsolicwwds_12_tfsmdsc = AV12TFSMDsc ;
      AV68Mantenimientomaquina_tmsolicwwds_13_tfsmdsc_sel = AV13TFSMDsc_Sel ;
      AV69Mantenimientomaquina_tmsolicwwds_14_tfsmmaqdsc = AV20TFSMMaqDsc ;
      AV70Mantenimientomaquina_tmsolicwwds_15_tfsmmaqdsc_sel = AV21TFSMMaqDsc_Sel ;
      AV71Mantenimientomaquina_tmsolicwwds_16_tfsmcal_sels = AV27TFSMCal_Sels ;
      AV72Mantenimientomaquina_tmsolicwwds_17_tfsmtxt = AV24TFSMTxt ;
      AV73Mantenimientomaquina_tmsolicwwds_18_tfsmtxt_sel = AV25TFSMTxt_Sel ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           A9522SMEst ,
                                           AV59Mantenimientomaquina_tmsolicwwds_4_tfsmest_sels ,
                                           Byte.valueOf(A9524SMCal) ,
                                           AV71Mantenimientomaquina_tmsolicwwds_16_tfsmcal_sels ,
                                           Integer.valueOf(AV57Mantenimientomaquina_tmsolicwwds_2_tfsmcod) ,
                                           Integer.valueOf(AV58Mantenimientomaquina_tmsolicwwds_3_tfsmcod_to) ,
                                           Integer.valueOf(AV59Mantenimientomaquina_tmsolicwwds_4_tfsmest_sels.size()) ,
                                           AV60Mantenimientomaquina_tmsolicwwds_5_tfsmfchcre ,
                                           AV62Mantenimientomaquina_tmsolicwwds_7_tfsmusucre_sel ,
                                           AV61Mantenimientomaquina_tmsolicwwds_6_tfsmusucre ,
                                           AV64Mantenimientomaquina_tmsolicwwds_9_tfsmmaqcod_sel ,
                                           AV63Mantenimientomaquina_tmsolicwwds_8_tfsmmaqcod ,
                                           Byte.valueOf(AV65Mantenimientomaquina_tmsolicwwds_10_tfsmpri) ,
                                           Byte.valueOf(AV66Mantenimientomaquina_tmsolicwwds_11_tfsmpri_to) ,
                                           AV68Mantenimientomaquina_tmsolicwwds_13_tfsmdsc_sel ,
                                           AV67Mantenimientomaquina_tmsolicwwds_12_tfsmdsc ,
                                           AV70Mantenimientomaquina_tmsolicwwds_15_tfsmmaqdsc_sel ,
                                           AV69Mantenimientomaquina_tmsolicwwds_14_tfsmmaqdsc ,
                                           Integer.valueOf(AV71Mantenimientomaquina_tmsolicwwds_16_tfsmcal_sels.size()) ,
                                           AV73Mantenimientomaquina_tmsolicwwds_18_tfsmtxt_sel ,
                                           AV72Mantenimientomaquina_tmsolicwwds_17_tfsmtxt ,
                                           Integer.valueOf(A9428SMCod) ,
                                           A9518SMFchCre ,
                                           A9519SMUsuCre ,
                                           A9520SMMaqCod ,
                                           Byte.valueOf(A11534SMPri) ,
                                           A9517SMDsc ,
                                           A9521SMMaqDsc ,
                                           A9523SMTxt ,
                                           AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV61Mantenimientomaquina_tmsolicwwds_6_tfsmusucre = GXutil.padr( GXutil.rtrim( AV61Mantenimientomaquina_tmsolicwwds_6_tfsmusucre), 8, "%") ;
      lV63Mantenimientomaquina_tmsolicwwds_8_tfsmmaqcod = GXutil.padr( GXutil.rtrim( AV63Mantenimientomaquina_tmsolicwwds_8_tfsmmaqcod), 6, "%") ;
      lV67Mantenimientomaquina_tmsolicwwds_12_tfsmdsc = GXutil.padr( GXutil.rtrim( AV67Mantenimientomaquina_tmsolicwwds_12_tfsmdsc), 30, "%") ;
      lV69Mantenimientomaquina_tmsolicwwds_14_tfsmmaqdsc = GXutil.padr( GXutil.rtrim( AV69Mantenimientomaquina_tmsolicwwds_14_tfsmmaqdsc), 16, "%") ;
      lV72Mantenimientomaquina_tmsolicwwds_17_tfsmtxt = GXutil.concat( GXutil.rtrim( AV72Mantenimientomaquina_tmsolicwwds_17_tfsmtxt), "%", "") ;
      /* Using cursor P08EF6 */
      pr_default.execute(4, new Object[] {Integer.valueOf(AV57Mantenimientomaquina_tmsolicwwds_2_tfsmcod), Integer.valueOf(AV58Mantenimientomaquina_tmsolicwwds_3_tfsmcod_to), AV60Mantenimientomaquina_tmsolicwwds_5_tfsmfchcre, lV61Mantenimientomaquina_tmsolicwwds_6_tfsmusucre, AV62Mantenimientomaquina_tmsolicwwds_7_tfsmusucre_sel, lV63Mantenimientomaquina_tmsolicwwds_8_tfsmmaqcod, AV64Mantenimientomaquina_tmsolicwwds_9_tfsmmaqcod_sel, Byte.valueOf(AV65Mantenimientomaquina_tmsolicwwds_10_tfsmpri), Byte.valueOf(AV66Mantenimientomaquina_tmsolicwwds_11_tfsmpri_to), lV67Mantenimientomaquina_tmsolicwwds_12_tfsmdsc, AV68Mantenimientomaquina_tmsolicwwds_13_tfsmdsc_sel, lV69Mantenimientomaquina_tmsolicwwds_14_tfsmmaqdsc, AV70Mantenimientomaquina_tmsolicwwds_15_tfsmmaqdsc_sel, lV72Mantenimientomaquina_tmsolicwwds_17_tfsmtxt, AV73Mantenimientomaquina_tmsolicwwds_18_tfsmtxt_sel});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk8EF10 = false ;
         A396EmprCod = P08EF6_A396EmprCod[0] ;
         A9523SMTxt = P08EF6_A9523SMTxt[0] ;
         n9523SMTxt = P08EF6_n9523SMTxt[0] ;
         A9521SMMaqDsc = P08EF6_A9521SMMaqDsc[0] ;
         n9521SMMaqDsc = P08EF6_n9521SMMaqDsc[0] ;
         A9517SMDsc = P08EF6_A9517SMDsc[0] ;
         n9517SMDsc = P08EF6_n9517SMDsc[0] ;
         A11534SMPri = P08EF6_A11534SMPri[0] ;
         A9520SMMaqCod = P08EF6_A9520SMMaqCod[0] ;
         n9520SMMaqCod = P08EF6_n9520SMMaqCod[0] ;
         A9519SMUsuCre = P08EF6_A9519SMUsuCre[0] ;
         n9519SMUsuCre = P08EF6_n9519SMUsuCre[0] ;
         A9518SMFchCre = P08EF6_A9518SMFchCre[0] ;
         n9518SMFchCre = P08EF6_n9518SMFchCre[0] ;
         A9428SMCod = P08EF6_A9428SMCod[0] ;
         A9524SMCal = P08EF6_A9524SMCal[0] ;
         n9524SMCal = P08EF6_n9524SMCal[0] ;
         A9522SMEst = P08EF6_A9522SMEst[0] ;
         n9522SMEst = P08EF6_n9522SMEst[0] ;
         A9521SMMaqDsc = P08EF6_A9521SMMaqDsc[0] ;
         n9521SMMaqDsc = P08EF6_n9521SMMaqDsc[0] ;
         if ( (GXutil.strcmp("", AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A9428SMCod, 8, 0) , GXutil.padr( "%" + AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "pendiente generación", ""), "") , GXutil.padr( "%" + GXutil.lower( AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9522SMEst, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "generada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9522SMEst, httpContext.getMessage( "G", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "anulada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9522SMEst, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "pendiente calificacion", ""), "") , GXutil.padr( "%" + GXutil.lower( AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9522SMEst, httpContext.getMessage( "C", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "terminada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9522SMEst, httpContext.getMessage( "T", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A9519SMUsuCre) , GXutil.padr( "%" + GXutil.upper( AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9520SMMaqCod) , GXutil.padr( "%" + GXutil.upper( AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A11534SMPri, 1, 0) , GXutil.padr( "%" + AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9517SMDsc) , GXutil.padr( "%" + GXutil.upper( AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9521SMMaqDsc) , GXutil.padr( "%" + GXutil.upper( AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "pesima", ""), "") , GXutil.padr( "%" + GXutil.lower( AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A9524SMCal == 1 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "mala", ""), "") , GXutil.padr( "%" + GXutil.lower( AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A9524SMCal == 2 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "aceptable", ""), "") , GXutil.padr( "%" + GXutil.lower( AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A9524SMCal == 3 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "satisfactorio", ""), "") , GXutil.padr( "%" + GXutil.lower( AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A9524SMCal == 4 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "excelente", ""), "") , GXutil.padr( "%" + GXutil.lower( AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A9524SMCal == 5 ) ) || ( GXutil.like( GXutil.upper( A9523SMTxt) , GXutil.padr( "%" + GXutil.upper( AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            if ( GXutil.strcmp(A9522SMEst, httpContext.getMessage( "T", "")) != 0 )
            {
               AV42count = 0 ;
               while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P08EF6_A9523SMTxt[0], A9523SMTxt) == 0 ) )
               {
                  brk8EF10 = false ;
                  A396EmprCod = P08EF6_A396EmprCod[0] ;
                  A9428SMCod = P08EF6_A9428SMCod[0] ;
                  AV42count = (long)(AV42count+1) ;
                  brk8EF10 = true ;
                  pr_default.readNext(4);
               }
               if ( ! (GXutil.strcmp("", A9523SMTxt)==0) )
               {
                  AV34Option = A9523SMTxt ;
                  AV35Options.add(AV34Option, 0);
                  AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), 0);
               }
               if ( AV35Options.size() == 50 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
            }
         }
         if ( ! brk8EF10 )
         {
            brk8EF10 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tmsolicwwgetfilterdata.this.AV36OptionsJson;
      this.aP4[0] = tmsolicwwgetfilterdata.this.AV39OptionsDescJson;
      this.aP5[0] = tmsolicwwgetfilterdata.this.AV41OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV36OptionsJson = "" ;
      AV39OptionsDescJson = "" ;
      AV41OptionIndexesJson = "" ;
      AV35Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV38OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV40OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV43Session = httpContext.getWebSession();
      AV45GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV46GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV48FilterFullText = "" ;
      AV22TFSMEst_SelsJson = "" ;
      AV23TFSMEst_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV14TFSMFchCre = GXutil.resetTime( GXutil.nullDate() );
      AV16TFSMUsuCre = "" ;
      AV17TFSMUsuCre_Sel = "" ;
      AV18TFSMMaqCod = "" ;
      AV19TFSMMaqCod_Sel = "" ;
      AV12TFSMDsc = "" ;
      AV13TFSMDsc_Sel = "" ;
      AV20TFSMMaqDsc = "" ;
      AV21TFSMMaqDsc_Sel = "" ;
      AV26TFSMCal_SelsJson = "" ;
      AV27TFSMCal_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV24TFSMTxt = "" ;
      AV25TFSMTxt_Sel = "" ;
      AV51InModo = "" ;
      A9519SMUsuCre = "" ;
      AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext = "" ;
      AV59Mantenimientomaquina_tmsolicwwds_4_tfsmest_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV60Mantenimientomaquina_tmsolicwwds_5_tfsmfchcre = GXutil.resetTime( GXutil.nullDate() );
      AV61Mantenimientomaquina_tmsolicwwds_6_tfsmusucre = "" ;
      AV62Mantenimientomaquina_tmsolicwwds_7_tfsmusucre_sel = "" ;
      AV63Mantenimientomaquina_tmsolicwwds_8_tfsmmaqcod = "" ;
      AV64Mantenimientomaquina_tmsolicwwds_9_tfsmmaqcod_sel = "" ;
      AV67Mantenimientomaquina_tmsolicwwds_12_tfsmdsc = "" ;
      AV68Mantenimientomaquina_tmsolicwwds_13_tfsmdsc_sel = "" ;
      AV69Mantenimientomaquina_tmsolicwwds_14_tfsmmaqdsc = "" ;
      AV70Mantenimientomaquina_tmsolicwwds_15_tfsmmaqdsc_sel = "" ;
      AV71Mantenimientomaquina_tmsolicwwds_16_tfsmcal_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV72Mantenimientomaquina_tmsolicwwds_17_tfsmtxt = "" ;
      AV73Mantenimientomaquina_tmsolicwwds_18_tfsmtxt_sel = "" ;
      scmdbuf = "" ;
      lV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext = "" ;
      lV61Mantenimientomaquina_tmsolicwwds_6_tfsmusucre = "" ;
      lV63Mantenimientomaquina_tmsolicwwds_8_tfsmmaqcod = "" ;
      lV67Mantenimientomaquina_tmsolicwwds_12_tfsmdsc = "" ;
      lV69Mantenimientomaquina_tmsolicwwds_14_tfsmmaqdsc = "" ;
      lV72Mantenimientomaquina_tmsolicwwds_17_tfsmtxt = "" ;
      A9522SMEst = "" ;
      A9518SMFchCre = GXutil.resetTime( GXutil.nullDate() );
      A9520SMMaqCod = "" ;
      A9517SMDsc = "" ;
      A9521SMMaqDsc = "" ;
      A9523SMTxt = "" ;
      P08EF2_A396EmprCod = new String[] {""} ;
      P08EF2_A9519SMUsuCre = new String[] {""} ;
      P08EF2_n9519SMUsuCre = new boolean[] {false} ;
      P08EF2_A9523SMTxt = new String[] {""} ;
      P08EF2_n9523SMTxt = new boolean[] {false} ;
      P08EF2_A9521SMMaqDsc = new String[] {""} ;
      P08EF2_n9521SMMaqDsc = new boolean[] {false} ;
      P08EF2_A9517SMDsc = new String[] {""} ;
      P08EF2_n9517SMDsc = new boolean[] {false} ;
      P08EF2_A11534SMPri = new byte[1] ;
      P08EF2_A9520SMMaqCod = new String[] {""} ;
      P08EF2_n9520SMMaqCod = new boolean[] {false} ;
      P08EF2_A9518SMFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      P08EF2_n9518SMFchCre = new boolean[] {false} ;
      P08EF2_A9428SMCod = new int[1] ;
      P08EF2_A9524SMCal = new byte[1] ;
      P08EF2_n9524SMCal = new boolean[] {false} ;
      P08EF2_A9522SMEst = new String[] {""} ;
      P08EF2_n9522SMEst = new boolean[] {false} ;
      A396EmprCod = "" ;
      AV34Option = "" ;
      AV37OptionDesc = "" ;
      P08EF3_A396EmprCod = new String[] {""} ;
      P08EF3_A9520SMMaqCod = new String[] {""} ;
      P08EF3_n9520SMMaqCod = new boolean[] {false} ;
      P08EF3_A9523SMTxt = new String[] {""} ;
      P08EF3_n9523SMTxt = new boolean[] {false} ;
      P08EF3_A9521SMMaqDsc = new String[] {""} ;
      P08EF3_n9521SMMaqDsc = new boolean[] {false} ;
      P08EF3_A9517SMDsc = new String[] {""} ;
      P08EF3_n9517SMDsc = new boolean[] {false} ;
      P08EF3_A11534SMPri = new byte[1] ;
      P08EF3_A9519SMUsuCre = new String[] {""} ;
      P08EF3_n9519SMUsuCre = new boolean[] {false} ;
      P08EF3_A9518SMFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      P08EF3_n9518SMFchCre = new boolean[] {false} ;
      P08EF3_A9428SMCod = new int[1] ;
      P08EF3_A9524SMCal = new byte[1] ;
      P08EF3_n9524SMCal = new boolean[] {false} ;
      P08EF3_A9522SMEst = new String[] {""} ;
      P08EF3_n9522SMEst = new boolean[] {false} ;
      P08EF4_A396EmprCod = new String[] {""} ;
      P08EF4_A9517SMDsc = new String[] {""} ;
      P08EF4_n9517SMDsc = new boolean[] {false} ;
      P08EF4_A9523SMTxt = new String[] {""} ;
      P08EF4_n9523SMTxt = new boolean[] {false} ;
      P08EF4_A9521SMMaqDsc = new String[] {""} ;
      P08EF4_n9521SMMaqDsc = new boolean[] {false} ;
      P08EF4_A11534SMPri = new byte[1] ;
      P08EF4_A9520SMMaqCod = new String[] {""} ;
      P08EF4_n9520SMMaqCod = new boolean[] {false} ;
      P08EF4_A9519SMUsuCre = new String[] {""} ;
      P08EF4_n9519SMUsuCre = new boolean[] {false} ;
      P08EF4_A9518SMFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      P08EF4_n9518SMFchCre = new boolean[] {false} ;
      P08EF4_A9428SMCod = new int[1] ;
      P08EF4_A9524SMCal = new byte[1] ;
      P08EF4_n9524SMCal = new boolean[] {false} ;
      P08EF4_A9522SMEst = new String[] {""} ;
      P08EF4_n9522SMEst = new boolean[] {false} ;
      P08EF5_A9520SMMaqCod = new String[] {""} ;
      P08EF5_n9520SMMaqCod = new boolean[] {false} ;
      P08EF5_A396EmprCod = new String[] {""} ;
      P08EF5_A9523SMTxt = new String[] {""} ;
      P08EF5_n9523SMTxt = new boolean[] {false} ;
      P08EF5_A9521SMMaqDsc = new String[] {""} ;
      P08EF5_n9521SMMaqDsc = new boolean[] {false} ;
      P08EF5_A9517SMDsc = new String[] {""} ;
      P08EF5_n9517SMDsc = new boolean[] {false} ;
      P08EF5_A11534SMPri = new byte[1] ;
      P08EF5_A9519SMUsuCre = new String[] {""} ;
      P08EF5_n9519SMUsuCre = new boolean[] {false} ;
      P08EF5_A9518SMFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      P08EF5_n9518SMFchCre = new boolean[] {false} ;
      P08EF5_A9428SMCod = new int[1] ;
      P08EF5_A9524SMCal = new byte[1] ;
      P08EF5_n9524SMCal = new boolean[] {false} ;
      P08EF5_A9522SMEst = new String[] {""} ;
      P08EF5_n9522SMEst = new boolean[] {false} ;
      P08EF6_A396EmprCod = new String[] {""} ;
      P08EF6_A9523SMTxt = new String[] {""} ;
      P08EF6_n9523SMTxt = new boolean[] {false} ;
      P08EF6_A9521SMMaqDsc = new String[] {""} ;
      P08EF6_n9521SMMaqDsc = new boolean[] {false} ;
      P08EF6_A9517SMDsc = new String[] {""} ;
      P08EF6_n9517SMDsc = new boolean[] {false} ;
      P08EF6_A11534SMPri = new byte[1] ;
      P08EF6_A9520SMMaqCod = new String[] {""} ;
      P08EF6_n9520SMMaqCod = new boolean[] {false} ;
      P08EF6_A9519SMUsuCre = new String[] {""} ;
      P08EF6_n9519SMUsuCre = new boolean[] {false} ;
      P08EF6_A9518SMFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      P08EF6_n9518SMFchCre = new boolean[] {false} ;
      P08EF6_A9428SMCod = new int[1] ;
      P08EF6_A9524SMCal = new byte[1] ;
      P08EF6_n9524SMCal = new boolean[] {false} ;
      P08EF6_A9522SMEst = new String[] {""} ;
      P08EF6_n9522SMEst = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.tmsolicwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08EF2_A396EmprCod, P08EF2_A9519SMUsuCre, P08EF2_n9519SMUsuCre, P08EF2_A9523SMTxt, P08EF2_n9523SMTxt, P08EF2_A9521SMMaqDsc, P08EF2_n9521SMMaqDsc, P08EF2_A9517SMDsc, P08EF2_n9517SMDsc, P08EF2_A11534SMPri,
            P08EF2_A9520SMMaqCod, P08EF2_n9520SMMaqCod, P08EF2_A9518SMFchCre, P08EF2_n9518SMFchCre, P08EF2_A9428SMCod, P08EF2_A9524SMCal, P08EF2_n9524SMCal, P08EF2_A9522SMEst, P08EF2_n9522SMEst
            }
            , new Object[] {
            P08EF3_A396EmprCod, P08EF3_A9520SMMaqCod, P08EF3_n9520SMMaqCod, P08EF3_A9523SMTxt, P08EF3_n9523SMTxt, P08EF3_A9521SMMaqDsc, P08EF3_n9521SMMaqDsc, P08EF3_A9517SMDsc, P08EF3_n9517SMDsc, P08EF3_A11534SMPri,
            P08EF3_A9519SMUsuCre, P08EF3_n9519SMUsuCre, P08EF3_A9518SMFchCre, P08EF3_n9518SMFchCre, P08EF3_A9428SMCod, P08EF3_A9524SMCal, P08EF3_n9524SMCal, P08EF3_A9522SMEst, P08EF3_n9522SMEst
            }
            , new Object[] {
            P08EF4_A396EmprCod, P08EF4_A9517SMDsc, P08EF4_n9517SMDsc, P08EF4_A9523SMTxt, P08EF4_n9523SMTxt, P08EF4_A9521SMMaqDsc, P08EF4_n9521SMMaqDsc, P08EF4_A11534SMPri, P08EF4_A9520SMMaqCod, P08EF4_n9520SMMaqCod,
            P08EF4_A9519SMUsuCre, P08EF4_n9519SMUsuCre, P08EF4_A9518SMFchCre, P08EF4_n9518SMFchCre, P08EF4_A9428SMCod, P08EF4_A9524SMCal, P08EF4_n9524SMCal, P08EF4_A9522SMEst, P08EF4_n9522SMEst
            }
            , new Object[] {
            P08EF5_A9520SMMaqCod, P08EF5_n9520SMMaqCod, P08EF5_A396EmprCod, P08EF5_A9523SMTxt, P08EF5_n9523SMTxt, P08EF5_A9521SMMaqDsc, P08EF5_n9521SMMaqDsc, P08EF5_A9517SMDsc, P08EF5_n9517SMDsc, P08EF5_A11534SMPri,
            P08EF5_A9519SMUsuCre, P08EF5_n9519SMUsuCre, P08EF5_A9518SMFchCre, P08EF5_n9518SMFchCre, P08EF5_A9428SMCod, P08EF5_A9524SMCal, P08EF5_n9524SMCal, P08EF5_A9522SMEst, P08EF5_n9522SMEst
            }
            , new Object[] {
            P08EF6_A396EmprCod, P08EF6_A9523SMTxt, P08EF6_n9523SMTxt, P08EF6_A9521SMMaqDsc, P08EF6_n9521SMMaqDsc, P08EF6_A9517SMDsc, P08EF6_n9517SMDsc, P08EF6_A11534SMPri, P08EF6_A9520SMMaqCod, P08EF6_n9520SMMaqCod,
            P08EF6_A9519SMUsuCre, P08EF6_n9519SMUsuCre, P08EF6_A9518SMFchCre, P08EF6_n9518SMFchCre, P08EF6_A9428SMCod, P08EF6_A9524SMCal, P08EF6_n9524SMCal, P08EF6_A9522SMEst, P08EF6_n9522SMEst
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV28TFSMPri ;
   private byte AV29TFSMPri_To ;
   private byte AV65Mantenimientomaquina_tmsolicwwds_10_tfsmpri ;
   private byte AV66Mantenimientomaquina_tmsolicwwds_11_tfsmpri_to ;
   private byte A9524SMCal ;
   private byte A11534SMPri ;
   private short Gx_err ;
   private int AV54GXV1 ;
   private int AV10TFSMCod ;
   private int AV11TFSMCod_To ;
   private int AV57Mantenimientomaquina_tmsolicwwds_2_tfsmcod ;
   private int AV58Mantenimientomaquina_tmsolicwwds_3_tfsmcod_to ;
   private int AV59Mantenimientomaquina_tmsolicwwds_4_tfsmest_sels_size ;
   private int AV71Mantenimientomaquina_tmsolicwwds_16_tfsmcal_sels_size ;
   private int A9428SMCod ;
   private int AV33InsertIndex ;
   private long AV42count ;
   private String AV16TFSMUsuCre ;
   private String AV17TFSMUsuCre_Sel ;
   private String AV18TFSMMaqCod ;
   private String AV19TFSMMaqCod_Sel ;
   private String AV12TFSMDsc ;
   private String AV13TFSMDsc_Sel ;
   private String AV20TFSMMaqDsc ;
   private String AV21TFSMMaqDsc_Sel ;
   private String AV51InModo ;
   private String A9519SMUsuCre ;
   private String AV61Mantenimientomaquina_tmsolicwwds_6_tfsmusucre ;
   private String AV62Mantenimientomaquina_tmsolicwwds_7_tfsmusucre_sel ;
   private String AV63Mantenimientomaquina_tmsolicwwds_8_tfsmmaqcod ;
   private String AV64Mantenimientomaquina_tmsolicwwds_9_tfsmmaqcod_sel ;
   private String AV67Mantenimientomaquina_tmsolicwwds_12_tfsmdsc ;
   private String AV68Mantenimientomaquina_tmsolicwwds_13_tfsmdsc_sel ;
   private String AV69Mantenimientomaquina_tmsolicwwds_14_tfsmmaqdsc ;
   private String AV70Mantenimientomaquina_tmsolicwwds_15_tfsmmaqdsc_sel ;
   private String scmdbuf ;
   private String lV61Mantenimientomaquina_tmsolicwwds_6_tfsmusucre ;
   private String lV63Mantenimientomaquina_tmsolicwwds_8_tfsmmaqcod ;
   private String lV67Mantenimientomaquina_tmsolicwwds_12_tfsmdsc ;
   private String lV69Mantenimientomaquina_tmsolicwwds_14_tfsmmaqdsc ;
   private String A9522SMEst ;
   private String A9520SMMaqCod ;
   private String A9517SMDsc ;
   private String A9521SMMaqDsc ;
   private String A396EmprCod ;
   private java.util.Date AV14TFSMFchCre ;
   private java.util.Date AV60Mantenimientomaquina_tmsolicwwds_5_tfsmfchcre ;
   private java.util.Date A9518SMFchCre ;
   private boolean returnInSub ;
   private boolean brk8EF2 ;
   private boolean n9519SMUsuCre ;
   private boolean n9523SMTxt ;
   private boolean n9521SMMaqDsc ;
   private boolean n9517SMDsc ;
   private boolean n9520SMMaqCod ;
   private boolean n9518SMFchCre ;
   private boolean n9524SMCal ;
   private boolean n9522SMEst ;
   private boolean brk8EF4 ;
   private boolean brk8EF6 ;
   private boolean brk8EF8 ;
   private boolean brk8EF10 ;
   private String AV36OptionsJson ;
   private String AV39OptionsDescJson ;
   private String AV41OptionIndexesJson ;
   private String AV22TFSMEst_SelsJson ;
   private String AV26TFSMCal_SelsJson ;
   private String AV32DDOName ;
   private String AV30SearchTxt ;
   private String AV31SearchTxtTo ;
   private String AV48FilterFullText ;
   private String AV24TFSMTxt ;
   private String AV25TFSMTxt_Sel ;
   private String AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext ;
   private String AV72Mantenimientomaquina_tmsolicwwds_17_tfsmtxt ;
   private String AV73Mantenimientomaquina_tmsolicwwds_18_tfsmtxt_sel ;
   private String lV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext ;
   private String lV72Mantenimientomaquina_tmsolicwwds_17_tfsmtxt ;
   private String A9523SMTxt ;
   private String AV34Option ;
   private String AV37OptionDesc ;
   private GXSimpleCollection<Byte> AV27TFSMCal_Sels ;
   private GXSimpleCollection<Byte> AV71Mantenimientomaquina_tmsolicwwds_16_tfsmcal_sels ;
   private com.genexus.webpanels.WebSession AV43Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08EF2_A396EmprCod ;
   private String[] P08EF2_A9519SMUsuCre ;
   private boolean[] P08EF2_n9519SMUsuCre ;
   private String[] P08EF2_A9523SMTxt ;
   private boolean[] P08EF2_n9523SMTxt ;
   private String[] P08EF2_A9521SMMaqDsc ;
   private boolean[] P08EF2_n9521SMMaqDsc ;
   private String[] P08EF2_A9517SMDsc ;
   private boolean[] P08EF2_n9517SMDsc ;
   private byte[] P08EF2_A11534SMPri ;
   private String[] P08EF2_A9520SMMaqCod ;
   private boolean[] P08EF2_n9520SMMaqCod ;
   private java.util.Date[] P08EF2_A9518SMFchCre ;
   private boolean[] P08EF2_n9518SMFchCre ;
   private int[] P08EF2_A9428SMCod ;
   private byte[] P08EF2_A9524SMCal ;
   private boolean[] P08EF2_n9524SMCal ;
   private String[] P08EF2_A9522SMEst ;
   private boolean[] P08EF2_n9522SMEst ;
   private String[] P08EF3_A396EmprCod ;
   private String[] P08EF3_A9520SMMaqCod ;
   private boolean[] P08EF3_n9520SMMaqCod ;
   private String[] P08EF3_A9523SMTxt ;
   private boolean[] P08EF3_n9523SMTxt ;
   private String[] P08EF3_A9521SMMaqDsc ;
   private boolean[] P08EF3_n9521SMMaqDsc ;
   private String[] P08EF3_A9517SMDsc ;
   private boolean[] P08EF3_n9517SMDsc ;
   private byte[] P08EF3_A11534SMPri ;
   private String[] P08EF3_A9519SMUsuCre ;
   private boolean[] P08EF3_n9519SMUsuCre ;
   private java.util.Date[] P08EF3_A9518SMFchCre ;
   private boolean[] P08EF3_n9518SMFchCre ;
   private int[] P08EF3_A9428SMCod ;
   private byte[] P08EF3_A9524SMCal ;
   private boolean[] P08EF3_n9524SMCal ;
   private String[] P08EF3_A9522SMEst ;
   private boolean[] P08EF3_n9522SMEst ;
   private String[] P08EF4_A396EmprCod ;
   private String[] P08EF4_A9517SMDsc ;
   private boolean[] P08EF4_n9517SMDsc ;
   private String[] P08EF4_A9523SMTxt ;
   private boolean[] P08EF4_n9523SMTxt ;
   private String[] P08EF4_A9521SMMaqDsc ;
   private boolean[] P08EF4_n9521SMMaqDsc ;
   private byte[] P08EF4_A11534SMPri ;
   private String[] P08EF4_A9520SMMaqCod ;
   private boolean[] P08EF4_n9520SMMaqCod ;
   private String[] P08EF4_A9519SMUsuCre ;
   private boolean[] P08EF4_n9519SMUsuCre ;
   private java.util.Date[] P08EF4_A9518SMFchCre ;
   private boolean[] P08EF4_n9518SMFchCre ;
   private int[] P08EF4_A9428SMCod ;
   private byte[] P08EF4_A9524SMCal ;
   private boolean[] P08EF4_n9524SMCal ;
   private String[] P08EF4_A9522SMEst ;
   private boolean[] P08EF4_n9522SMEst ;
   private String[] P08EF5_A9520SMMaqCod ;
   private boolean[] P08EF5_n9520SMMaqCod ;
   private String[] P08EF5_A396EmprCod ;
   private String[] P08EF5_A9523SMTxt ;
   private boolean[] P08EF5_n9523SMTxt ;
   private String[] P08EF5_A9521SMMaqDsc ;
   private boolean[] P08EF5_n9521SMMaqDsc ;
   private String[] P08EF5_A9517SMDsc ;
   private boolean[] P08EF5_n9517SMDsc ;
   private byte[] P08EF5_A11534SMPri ;
   private String[] P08EF5_A9519SMUsuCre ;
   private boolean[] P08EF5_n9519SMUsuCre ;
   private java.util.Date[] P08EF5_A9518SMFchCre ;
   private boolean[] P08EF5_n9518SMFchCre ;
   private int[] P08EF5_A9428SMCod ;
   private byte[] P08EF5_A9524SMCal ;
   private boolean[] P08EF5_n9524SMCal ;
   private String[] P08EF5_A9522SMEst ;
   private boolean[] P08EF5_n9522SMEst ;
   private String[] P08EF6_A396EmprCod ;
   private String[] P08EF6_A9523SMTxt ;
   private boolean[] P08EF6_n9523SMTxt ;
   private String[] P08EF6_A9521SMMaqDsc ;
   private boolean[] P08EF6_n9521SMMaqDsc ;
   private String[] P08EF6_A9517SMDsc ;
   private boolean[] P08EF6_n9517SMDsc ;
   private byte[] P08EF6_A11534SMPri ;
   private String[] P08EF6_A9520SMMaqCod ;
   private boolean[] P08EF6_n9520SMMaqCod ;
   private String[] P08EF6_A9519SMUsuCre ;
   private boolean[] P08EF6_n9519SMUsuCre ;
   private java.util.Date[] P08EF6_A9518SMFchCre ;
   private boolean[] P08EF6_n9518SMFchCre ;
   private int[] P08EF6_A9428SMCod ;
   private byte[] P08EF6_A9524SMCal ;
   private boolean[] P08EF6_n9524SMCal ;
   private String[] P08EF6_A9522SMEst ;
   private boolean[] P08EF6_n9522SMEst ;
   private GXSimpleCollection<String> AV23TFSMEst_Sels ;
   private GXSimpleCollection<String> AV59Mantenimientomaquina_tmsolicwwds_4_tfsmest_sels ;
   private GXSimpleCollection<String> AV35Options ;
   private GXSimpleCollection<String> AV38OptionsDesc ;
   private GXSimpleCollection<String> AV40OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV45GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV46GridStateFilterValue ;
}

final  class tmsolicwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08EF2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A9522SMEst ,
                                          GXSimpleCollection<String> AV59Mantenimientomaquina_tmsolicwwds_4_tfsmest_sels ,
                                          byte A9524SMCal ,
                                          GXSimpleCollection<Byte> AV71Mantenimientomaquina_tmsolicwwds_16_tfsmcal_sels ,
                                          int AV57Mantenimientomaquina_tmsolicwwds_2_tfsmcod ,
                                          int AV58Mantenimientomaquina_tmsolicwwds_3_tfsmcod_to ,
                                          int AV59Mantenimientomaquina_tmsolicwwds_4_tfsmest_sels_size ,
                                          java.util.Date AV60Mantenimientomaquina_tmsolicwwds_5_tfsmfchcre ,
                                          String AV62Mantenimientomaquina_tmsolicwwds_7_tfsmusucre_sel ,
                                          String AV61Mantenimientomaquina_tmsolicwwds_6_tfsmusucre ,
                                          String AV64Mantenimientomaquina_tmsolicwwds_9_tfsmmaqcod_sel ,
                                          String AV63Mantenimientomaquina_tmsolicwwds_8_tfsmmaqcod ,
                                          byte AV65Mantenimientomaquina_tmsolicwwds_10_tfsmpri ,
                                          byte AV66Mantenimientomaquina_tmsolicwwds_11_tfsmpri_to ,
                                          String AV68Mantenimientomaquina_tmsolicwwds_13_tfsmdsc_sel ,
                                          String AV67Mantenimientomaquina_tmsolicwwds_12_tfsmdsc ,
                                          String AV70Mantenimientomaquina_tmsolicwwds_15_tfsmmaqdsc_sel ,
                                          String AV69Mantenimientomaquina_tmsolicwwds_14_tfsmmaqdsc ,
                                          int AV71Mantenimientomaquina_tmsolicwwds_16_tfsmcal_sels_size ,
                                          String AV73Mantenimientomaquina_tmsolicwwds_18_tfsmtxt_sel ,
                                          String AV72Mantenimientomaquina_tmsolicwwds_17_tfsmtxt ,
                                          int A9428SMCod ,
                                          java.util.Date A9518SMFchCre ,
                                          String A9519SMUsuCre ,
                                          String A9520SMMaqCod ,
                                          byte A11534SMPri ,
                                          String A9517SMDsc ,
                                          String A9521SMMaqDsc ,
                                          String A9523SMTxt ,
                                          String AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[15];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.SMUsuCre, T1.SMTxt, T2.MaqDsc AS SMMaqDsc, T1.SMDsc, T1.SMPri, T1.SMMaqCod AS SMMaqCod, T1.SMFchCre, T1.SMCod, T1.SMCal, T1.SMEst FROM (TXPMSOLIC" ;
      scmdbuf += " T1 LEFT JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.SMMaqCod)" ;
      if ( ! (0==AV57Mantenimientomaquina_tmsolicwwds_2_tfsmcod) )
      {
         addWhere(sWhereString, "(T1.SMCod >= ?)");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( ! (0==AV58Mantenimientomaquina_tmsolicwwds_3_tfsmcod_to) )
      {
         addWhere(sWhereString, "(T1.SMCod <= ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( AV59Mantenimientomaquina_tmsolicwwds_4_tfsmest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV59Mantenimientomaquina_tmsolicwwds_4_tfsmest_sels, "T1.SMEst IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV60Mantenimientomaquina_tmsolicwwds_5_tfsmfchcre) )
      {
         addWhere(sWhereString, "(T1.SMFchCre >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Mantenimientomaquina_tmsolicwwds_7_tfsmusucre_sel)==0) && ( ! (GXutil.strcmp("", AV61Mantenimientomaquina_tmsolicwwds_6_tfsmusucre)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.SMUsuCre) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Mantenimientomaquina_tmsolicwwds_7_tfsmusucre_sel)==0) )
      {
         addWhere(sWhereString, "(T1.SMUsuCre = ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Mantenimientomaquina_tmsolicwwds_9_tfsmmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV63Mantenimientomaquina_tmsolicwwds_8_tfsmmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.SMMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Mantenimientomaquina_tmsolicwwds_9_tfsmmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.SMMaqCod = ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (0==AV65Mantenimientomaquina_tmsolicwwds_10_tfsmpri) )
      {
         addWhere(sWhereString, "(T1.SMPri >= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (0==AV66Mantenimientomaquina_tmsolicwwds_11_tfsmpri_to) )
      {
         addWhere(sWhereString, "(T1.SMPri <= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Mantenimientomaquina_tmsolicwwds_13_tfsmdsc_sel)==0) && ( ! (GXutil.strcmp("", AV67Mantenimientomaquina_tmsolicwwds_12_tfsmdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.SMDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Mantenimientomaquina_tmsolicwwds_13_tfsmdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.SMDsc = ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Mantenimientomaquina_tmsolicwwds_15_tfsmmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV69Mantenimientomaquina_tmsolicwwds_14_tfsmmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Mantenimientomaquina_tmsolicwwds_15_tfsmmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( AV71Mantenimientomaquina_tmsolicwwds_16_tfsmcal_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV71Mantenimientomaquina_tmsolicwwds_16_tfsmcal_sels, "T1.SMCal IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV73Mantenimientomaquina_tmsolicwwds_18_tfsmtxt_sel)==0) && ( ! (GXutil.strcmp("", AV72Mantenimientomaquina_tmsolicwwds_17_tfsmtxt)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.SMTxt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Mantenimientomaquina_tmsolicwwds_18_tfsmtxt_sel)==0) )
      {
         addWhere(sWhereString, "(T1.SMTxt = ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.SMUsuCre" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08EF3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A9522SMEst ,
                                          GXSimpleCollection<String> AV59Mantenimientomaquina_tmsolicwwds_4_tfsmest_sels ,
                                          byte A9524SMCal ,
                                          GXSimpleCollection<Byte> AV71Mantenimientomaquina_tmsolicwwds_16_tfsmcal_sels ,
                                          int AV57Mantenimientomaquina_tmsolicwwds_2_tfsmcod ,
                                          int AV58Mantenimientomaquina_tmsolicwwds_3_tfsmcod_to ,
                                          int AV59Mantenimientomaquina_tmsolicwwds_4_tfsmest_sels_size ,
                                          java.util.Date AV60Mantenimientomaquina_tmsolicwwds_5_tfsmfchcre ,
                                          String AV62Mantenimientomaquina_tmsolicwwds_7_tfsmusucre_sel ,
                                          String AV61Mantenimientomaquina_tmsolicwwds_6_tfsmusucre ,
                                          String AV64Mantenimientomaquina_tmsolicwwds_9_tfsmmaqcod_sel ,
                                          String AV63Mantenimientomaquina_tmsolicwwds_8_tfsmmaqcod ,
                                          byte AV65Mantenimientomaquina_tmsolicwwds_10_tfsmpri ,
                                          byte AV66Mantenimientomaquina_tmsolicwwds_11_tfsmpri_to ,
                                          String AV68Mantenimientomaquina_tmsolicwwds_13_tfsmdsc_sel ,
                                          String AV67Mantenimientomaquina_tmsolicwwds_12_tfsmdsc ,
                                          String AV70Mantenimientomaquina_tmsolicwwds_15_tfsmmaqdsc_sel ,
                                          String AV69Mantenimientomaquina_tmsolicwwds_14_tfsmmaqdsc ,
                                          int AV71Mantenimientomaquina_tmsolicwwds_16_tfsmcal_sels_size ,
                                          String AV73Mantenimientomaquina_tmsolicwwds_18_tfsmtxt_sel ,
                                          String AV72Mantenimientomaquina_tmsolicwwds_17_tfsmtxt ,
                                          int A9428SMCod ,
                                          java.util.Date A9518SMFchCre ,
                                          String A9519SMUsuCre ,
                                          String A9520SMMaqCod ,
                                          byte A11534SMPri ,
                                          String A9517SMDsc ,
                                          String A9521SMMaqDsc ,
                                          String A9523SMTxt ,
                                          String AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[15];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.SMMaqCod AS SMMaqCod, T1.SMTxt, T2.MaqDsc AS SMMaqDsc, T1.SMDsc, T1.SMPri, T1.SMUsuCre, T1.SMFchCre, T1.SMCod, T1.SMCal, T1.SMEst FROM (TXPMSOLIC" ;
      scmdbuf += " T1 LEFT JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.SMMaqCod)" ;
      if ( ! (0==AV57Mantenimientomaquina_tmsolicwwds_2_tfsmcod) )
      {
         addWhere(sWhereString, "(T1.SMCod >= ?)");
      }
      else
      {
         GXv_int5[0] = (byte)(1) ;
      }
      if ( ! (0==AV58Mantenimientomaquina_tmsolicwwds_3_tfsmcod_to) )
      {
         addWhere(sWhereString, "(T1.SMCod <= ?)");
      }
      else
      {
         GXv_int5[1] = (byte)(1) ;
      }
      if ( AV59Mantenimientomaquina_tmsolicwwds_4_tfsmest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV59Mantenimientomaquina_tmsolicwwds_4_tfsmest_sels, "T1.SMEst IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV60Mantenimientomaquina_tmsolicwwds_5_tfsmfchcre) )
      {
         addWhere(sWhereString, "(T1.SMFchCre >= ?)");
      }
      else
      {
         GXv_int5[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Mantenimientomaquina_tmsolicwwds_7_tfsmusucre_sel)==0) && ( ! (GXutil.strcmp("", AV61Mantenimientomaquina_tmsolicwwds_6_tfsmusucre)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.SMUsuCre) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Mantenimientomaquina_tmsolicwwds_7_tfsmusucre_sel)==0) )
      {
         addWhere(sWhereString, "(T1.SMUsuCre = ?)");
      }
      else
      {
         GXv_int5[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Mantenimientomaquina_tmsolicwwds_9_tfsmmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV63Mantenimientomaquina_tmsolicwwds_8_tfsmmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.SMMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Mantenimientomaquina_tmsolicwwds_9_tfsmmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.SMMaqCod = ?)");
      }
      else
      {
         GXv_int5[6] = (byte)(1) ;
      }
      if ( ! (0==AV65Mantenimientomaquina_tmsolicwwds_10_tfsmpri) )
      {
         addWhere(sWhereString, "(T1.SMPri >= ?)");
      }
      else
      {
         GXv_int5[7] = (byte)(1) ;
      }
      if ( ! (0==AV66Mantenimientomaquina_tmsolicwwds_11_tfsmpri_to) )
      {
         addWhere(sWhereString, "(T1.SMPri <= ?)");
      }
      else
      {
         GXv_int5[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Mantenimientomaquina_tmsolicwwds_13_tfsmdsc_sel)==0) && ( ! (GXutil.strcmp("", AV67Mantenimientomaquina_tmsolicwwds_12_tfsmdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.SMDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Mantenimientomaquina_tmsolicwwds_13_tfsmdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.SMDsc = ?)");
      }
      else
      {
         GXv_int5[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Mantenimientomaquina_tmsolicwwds_15_tfsmmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV69Mantenimientomaquina_tmsolicwwds_14_tfsmmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Mantenimientomaquina_tmsolicwwds_15_tfsmmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int5[12] = (byte)(1) ;
      }
      if ( AV71Mantenimientomaquina_tmsolicwwds_16_tfsmcal_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV71Mantenimientomaquina_tmsolicwwds_16_tfsmcal_sels, "T1.SMCal IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV73Mantenimientomaquina_tmsolicwwds_18_tfsmtxt_sel)==0) && ( ! (GXutil.strcmp("", AV72Mantenimientomaquina_tmsolicwwds_17_tfsmtxt)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.SMTxt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Mantenimientomaquina_tmsolicwwds_18_tfsmtxt_sel)==0) )
      {
         addWhere(sWhereString, "(T1.SMTxt = ?)");
      }
      else
      {
         GXv_int5[14] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.SMMaqCod" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   protected Object[] conditional_P08EF4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A9522SMEst ,
                                          GXSimpleCollection<String> AV59Mantenimientomaquina_tmsolicwwds_4_tfsmest_sels ,
                                          byte A9524SMCal ,
                                          GXSimpleCollection<Byte> AV71Mantenimientomaquina_tmsolicwwds_16_tfsmcal_sels ,
                                          int AV57Mantenimientomaquina_tmsolicwwds_2_tfsmcod ,
                                          int AV58Mantenimientomaquina_tmsolicwwds_3_tfsmcod_to ,
                                          int AV59Mantenimientomaquina_tmsolicwwds_4_tfsmest_sels_size ,
                                          java.util.Date AV60Mantenimientomaquina_tmsolicwwds_5_tfsmfchcre ,
                                          String AV62Mantenimientomaquina_tmsolicwwds_7_tfsmusucre_sel ,
                                          String AV61Mantenimientomaquina_tmsolicwwds_6_tfsmusucre ,
                                          String AV64Mantenimientomaquina_tmsolicwwds_9_tfsmmaqcod_sel ,
                                          String AV63Mantenimientomaquina_tmsolicwwds_8_tfsmmaqcod ,
                                          byte AV65Mantenimientomaquina_tmsolicwwds_10_tfsmpri ,
                                          byte AV66Mantenimientomaquina_tmsolicwwds_11_tfsmpri_to ,
                                          String AV68Mantenimientomaquina_tmsolicwwds_13_tfsmdsc_sel ,
                                          String AV67Mantenimientomaquina_tmsolicwwds_12_tfsmdsc ,
                                          String AV70Mantenimientomaquina_tmsolicwwds_15_tfsmmaqdsc_sel ,
                                          String AV69Mantenimientomaquina_tmsolicwwds_14_tfsmmaqdsc ,
                                          int AV71Mantenimientomaquina_tmsolicwwds_16_tfsmcal_sels_size ,
                                          String AV73Mantenimientomaquina_tmsolicwwds_18_tfsmtxt_sel ,
                                          String AV72Mantenimientomaquina_tmsolicwwds_17_tfsmtxt ,
                                          int A9428SMCod ,
                                          java.util.Date A9518SMFchCre ,
                                          String A9519SMUsuCre ,
                                          String A9520SMMaqCod ,
                                          byte A11534SMPri ,
                                          String A9517SMDsc ,
                                          String A9521SMMaqDsc ,
                                          String A9523SMTxt ,
                                          String AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[15];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.SMDsc, T1.SMTxt, T2.MaqDsc AS SMMaqDsc, T1.SMPri, T1.SMMaqCod AS SMMaqCod, T1.SMUsuCre, T1.SMFchCre, T1.SMCod, T1.SMCal, T1.SMEst FROM (TXPMSOLIC" ;
      scmdbuf += " T1 LEFT JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.SMMaqCod)" ;
      if ( ! (0==AV57Mantenimientomaquina_tmsolicwwds_2_tfsmcod) )
      {
         addWhere(sWhereString, "(T1.SMCod >= ?)");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
      }
      if ( ! (0==AV58Mantenimientomaquina_tmsolicwwds_3_tfsmcod_to) )
      {
         addWhere(sWhereString, "(T1.SMCod <= ?)");
      }
      else
      {
         GXv_int8[1] = (byte)(1) ;
      }
      if ( AV59Mantenimientomaquina_tmsolicwwds_4_tfsmest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV59Mantenimientomaquina_tmsolicwwds_4_tfsmest_sels, "T1.SMEst IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV60Mantenimientomaquina_tmsolicwwds_5_tfsmfchcre) )
      {
         addWhere(sWhereString, "(T1.SMFchCre >= ?)");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Mantenimientomaquina_tmsolicwwds_7_tfsmusucre_sel)==0) && ( ! (GXutil.strcmp("", AV61Mantenimientomaquina_tmsolicwwds_6_tfsmusucre)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.SMUsuCre) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Mantenimientomaquina_tmsolicwwds_7_tfsmusucre_sel)==0) )
      {
         addWhere(sWhereString, "(T1.SMUsuCre = ?)");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Mantenimientomaquina_tmsolicwwds_9_tfsmmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV63Mantenimientomaquina_tmsolicwwds_8_tfsmmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.SMMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Mantenimientomaquina_tmsolicwwds_9_tfsmmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.SMMaqCod = ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (0==AV65Mantenimientomaquina_tmsolicwwds_10_tfsmpri) )
      {
         addWhere(sWhereString, "(T1.SMPri >= ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (0==AV66Mantenimientomaquina_tmsolicwwds_11_tfsmpri_to) )
      {
         addWhere(sWhereString, "(T1.SMPri <= ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Mantenimientomaquina_tmsolicwwds_13_tfsmdsc_sel)==0) && ( ! (GXutil.strcmp("", AV67Mantenimientomaquina_tmsolicwwds_12_tfsmdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.SMDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Mantenimientomaquina_tmsolicwwds_13_tfsmdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.SMDsc = ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Mantenimientomaquina_tmsolicwwds_15_tfsmmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV69Mantenimientomaquina_tmsolicwwds_14_tfsmmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Mantenimientomaquina_tmsolicwwds_15_tfsmmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( AV71Mantenimientomaquina_tmsolicwwds_16_tfsmcal_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV71Mantenimientomaquina_tmsolicwwds_16_tfsmcal_sels, "T1.SMCal IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV73Mantenimientomaquina_tmsolicwwds_18_tfsmtxt_sel)==0) && ( ! (GXutil.strcmp("", AV72Mantenimientomaquina_tmsolicwwds_17_tfsmtxt)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.SMTxt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Mantenimientomaquina_tmsolicwwds_18_tfsmtxt_sel)==0) )
      {
         addWhere(sWhereString, "(T1.SMTxt = ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.SMDsc" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P08EF5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A9522SMEst ,
                                          GXSimpleCollection<String> AV59Mantenimientomaquina_tmsolicwwds_4_tfsmest_sels ,
                                          byte A9524SMCal ,
                                          GXSimpleCollection<Byte> AV71Mantenimientomaquina_tmsolicwwds_16_tfsmcal_sels ,
                                          int AV57Mantenimientomaquina_tmsolicwwds_2_tfsmcod ,
                                          int AV58Mantenimientomaquina_tmsolicwwds_3_tfsmcod_to ,
                                          int AV59Mantenimientomaquina_tmsolicwwds_4_tfsmest_sels_size ,
                                          java.util.Date AV60Mantenimientomaquina_tmsolicwwds_5_tfsmfchcre ,
                                          String AV62Mantenimientomaquina_tmsolicwwds_7_tfsmusucre_sel ,
                                          String AV61Mantenimientomaquina_tmsolicwwds_6_tfsmusucre ,
                                          String AV64Mantenimientomaquina_tmsolicwwds_9_tfsmmaqcod_sel ,
                                          String AV63Mantenimientomaquina_tmsolicwwds_8_tfsmmaqcod ,
                                          byte AV65Mantenimientomaquina_tmsolicwwds_10_tfsmpri ,
                                          byte AV66Mantenimientomaquina_tmsolicwwds_11_tfsmpri_to ,
                                          String AV68Mantenimientomaquina_tmsolicwwds_13_tfsmdsc_sel ,
                                          String AV67Mantenimientomaquina_tmsolicwwds_12_tfsmdsc ,
                                          String AV70Mantenimientomaquina_tmsolicwwds_15_tfsmmaqdsc_sel ,
                                          String AV69Mantenimientomaquina_tmsolicwwds_14_tfsmmaqdsc ,
                                          int AV71Mantenimientomaquina_tmsolicwwds_16_tfsmcal_sels_size ,
                                          String AV73Mantenimientomaquina_tmsolicwwds_18_tfsmtxt_sel ,
                                          String AV72Mantenimientomaquina_tmsolicwwds_17_tfsmtxt ,
                                          int A9428SMCod ,
                                          java.util.Date A9518SMFchCre ,
                                          String A9519SMUsuCre ,
                                          String A9520SMMaqCod ,
                                          byte A11534SMPri ,
                                          String A9517SMDsc ,
                                          String A9521SMMaqDsc ,
                                          String A9523SMTxt ,
                                          String AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int11 = new byte[15];
      Object[] GXv_Object12 = new Object[2];
      scmdbuf = "SELECT T1.SMMaqCod AS SMMaqCod, T1.EmprCod, T1.SMTxt, T2.MaqDsc AS SMMaqDsc, T1.SMDsc, T1.SMPri, T1.SMUsuCre, T1.SMFchCre, T1.SMCod, T1.SMCal, T1.SMEst FROM (TXPMSOLIC" ;
      scmdbuf += " T1 LEFT JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.SMMaqCod)" ;
      if ( ! (0==AV57Mantenimientomaquina_tmsolicwwds_2_tfsmcod) )
      {
         addWhere(sWhereString, "(T1.SMCod >= ?)");
      }
      else
      {
         GXv_int11[0] = (byte)(1) ;
      }
      if ( ! (0==AV58Mantenimientomaquina_tmsolicwwds_3_tfsmcod_to) )
      {
         addWhere(sWhereString, "(T1.SMCod <= ?)");
      }
      else
      {
         GXv_int11[1] = (byte)(1) ;
      }
      if ( AV59Mantenimientomaquina_tmsolicwwds_4_tfsmest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV59Mantenimientomaquina_tmsolicwwds_4_tfsmest_sels, "T1.SMEst IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV60Mantenimientomaquina_tmsolicwwds_5_tfsmfchcre) )
      {
         addWhere(sWhereString, "(T1.SMFchCre >= ?)");
      }
      else
      {
         GXv_int11[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Mantenimientomaquina_tmsolicwwds_7_tfsmusucre_sel)==0) && ( ! (GXutil.strcmp("", AV61Mantenimientomaquina_tmsolicwwds_6_tfsmusucre)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.SMUsuCre) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Mantenimientomaquina_tmsolicwwds_7_tfsmusucre_sel)==0) )
      {
         addWhere(sWhereString, "(T1.SMUsuCre = ?)");
      }
      else
      {
         GXv_int11[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Mantenimientomaquina_tmsolicwwds_9_tfsmmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV63Mantenimientomaquina_tmsolicwwds_8_tfsmmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.SMMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Mantenimientomaquina_tmsolicwwds_9_tfsmmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.SMMaqCod = ?)");
      }
      else
      {
         GXv_int11[6] = (byte)(1) ;
      }
      if ( ! (0==AV65Mantenimientomaquina_tmsolicwwds_10_tfsmpri) )
      {
         addWhere(sWhereString, "(T1.SMPri >= ?)");
      }
      else
      {
         GXv_int11[7] = (byte)(1) ;
      }
      if ( ! (0==AV66Mantenimientomaquina_tmsolicwwds_11_tfsmpri_to) )
      {
         addWhere(sWhereString, "(T1.SMPri <= ?)");
      }
      else
      {
         GXv_int11[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Mantenimientomaquina_tmsolicwwds_13_tfsmdsc_sel)==0) && ( ! (GXutil.strcmp("", AV67Mantenimientomaquina_tmsolicwwds_12_tfsmdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.SMDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Mantenimientomaquina_tmsolicwwds_13_tfsmdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.SMDsc = ?)");
      }
      else
      {
         GXv_int11[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Mantenimientomaquina_tmsolicwwds_15_tfsmmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV69Mantenimientomaquina_tmsolicwwds_14_tfsmmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Mantenimientomaquina_tmsolicwwds_15_tfsmmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int11[12] = (byte)(1) ;
      }
      if ( AV71Mantenimientomaquina_tmsolicwwds_16_tfsmcal_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV71Mantenimientomaquina_tmsolicwwds_16_tfsmcal_sels, "T1.SMCal IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV73Mantenimientomaquina_tmsolicwwds_18_tfsmtxt_sel)==0) && ( ! (GXutil.strcmp("", AV72Mantenimientomaquina_tmsolicwwds_17_tfsmtxt)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.SMTxt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Mantenimientomaquina_tmsolicwwds_18_tfsmtxt_sel)==0) )
      {
         addWhere(sWhereString, "(T1.SMTxt = ?)");
      }
      else
      {
         GXv_int11[14] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.SMMaqCod" ;
      GXv_Object12[0] = scmdbuf ;
      GXv_Object12[1] = GXv_int11 ;
      return GXv_Object12 ;
   }

   protected Object[] conditional_P08EF6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A9522SMEst ,
                                          GXSimpleCollection<String> AV59Mantenimientomaquina_tmsolicwwds_4_tfsmest_sels ,
                                          byte A9524SMCal ,
                                          GXSimpleCollection<Byte> AV71Mantenimientomaquina_tmsolicwwds_16_tfsmcal_sels ,
                                          int AV57Mantenimientomaquina_tmsolicwwds_2_tfsmcod ,
                                          int AV58Mantenimientomaquina_tmsolicwwds_3_tfsmcod_to ,
                                          int AV59Mantenimientomaquina_tmsolicwwds_4_tfsmest_sels_size ,
                                          java.util.Date AV60Mantenimientomaquina_tmsolicwwds_5_tfsmfchcre ,
                                          String AV62Mantenimientomaquina_tmsolicwwds_7_tfsmusucre_sel ,
                                          String AV61Mantenimientomaquina_tmsolicwwds_6_tfsmusucre ,
                                          String AV64Mantenimientomaquina_tmsolicwwds_9_tfsmmaqcod_sel ,
                                          String AV63Mantenimientomaquina_tmsolicwwds_8_tfsmmaqcod ,
                                          byte AV65Mantenimientomaquina_tmsolicwwds_10_tfsmpri ,
                                          byte AV66Mantenimientomaquina_tmsolicwwds_11_tfsmpri_to ,
                                          String AV68Mantenimientomaquina_tmsolicwwds_13_tfsmdsc_sel ,
                                          String AV67Mantenimientomaquina_tmsolicwwds_12_tfsmdsc ,
                                          String AV70Mantenimientomaquina_tmsolicwwds_15_tfsmmaqdsc_sel ,
                                          String AV69Mantenimientomaquina_tmsolicwwds_14_tfsmmaqdsc ,
                                          int AV71Mantenimientomaquina_tmsolicwwds_16_tfsmcal_sels_size ,
                                          String AV73Mantenimientomaquina_tmsolicwwds_18_tfsmtxt_sel ,
                                          String AV72Mantenimientomaquina_tmsolicwwds_17_tfsmtxt ,
                                          int A9428SMCod ,
                                          java.util.Date A9518SMFchCre ,
                                          String A9519SMUsuCre ,
                                          String A9520SMMaqCod ,
                                          byte A11534SMPri ,
                                          String A9517SMDsc ,
                                          String A9521SMMaqDsc ,
                                          String A9523SMTxt ,
                                          String AV56Mantenimientomaquina_tmsolicwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[15];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.SMTxt, T2.MaqDsc AS SMMaqDsc, T1.SMDsc, T1.SMPri, T1.SMMaqCod AS SMMaqCod, T1.SMUsuCre, T1.SMFchCre, T1.SMCod, T1.SMCal, T1.SMEst FROM (TXPMSOLIC" ;
      scmdbuf += " T1 LEFT JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.SMMaqCod)" ;
      if ( ! (0==AV57Mantenimientomaquina_tmsolicwwds_2_tfsmcod) )
      {
         addWhere(sWhereString, "(T1.SMCod >= ?)");
      }
      else
      {
         GXv_int14[0] = (byte)(1) ;
      }
      if ( ! (0==AV58Mantenimientomaquina_tmsolicwwds_3_tfsmcod_to) )
      {
         addWhere(sWhereString, "(T1.SMCod <= ?)");
      }
      else
      {
         GXv_int14[1] = (byte)(1) ;
      }
      if ( AV59Mantenimientomaquina_tmsolicwwds_4_tfsmest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV59Mantenimientomaquina_tmsolicwwds_4_tfsmest_sels, "T1.SMEst IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV60Mantenimientomaquina_tmsolicwwds_5_tfsmfchcre) )
      {
         addWhere(sWhereString, "(T1.SMFchCre >= ?)");
      }
      else
      {
         GXv_int14[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Mantenimientomaquina_tmsolicwwds_7_tfsmusucre_sel)==0) && ( ! (GXutil.strcmp("", AV61Mantenimientomaquina_tmsolicwwds_6_tfsmusucre)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.SMUsuCre) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Mantenimientomaquina_tmsolicwwds_7_tfsmusucre_sel)==0) )
      {
         addWhere(sWhereString, "(T1.SMUsuCre = ?)");
      }
      else
      {
         GXv_int14[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Mantenimientomaquina_tmsolicwwds_9_tfsmmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV63Mantenimientomaquina_tmsolicwwds_8_tfsmmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.SMMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Mantenimientomaquina_tmsolicwwds_9_tfsmmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.SMMaqCod = ?)");
      }
      else
      {
         GXv_int14[6] = (byte)(1) ;
      }
      if ( ! (0==AV65Mantenimientomaquina_tmsolicwwds_10_tfsmpri) )
      {
         addWhere(sWhereString, "(T1.SMPri >= ?)");
      }
      else
      {
         GXv_int14[7] = (byte)(1) ;
      }
      if ( ! (0==AV66Mantenimientomaquina_tmsolicwwds_11_tfsmpri_to) )
      {
         addWhere(sWhereString, "(T1.SMPri <= ?)");
      }
      else
      {
         GXv_int14[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Mantenimientomaquina_tmsolicwwds_13_tfsmdsc_sel)==0) && ( ! (GXutil.strcmp("", AV67Mantenimientomaquina_tmsolicwwds_12_tfsmdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.SMDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Mantenimientomaquina_tmsolicwwds_13_tfsmdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.SMDsc = ?)");
      }
      else
      {
         GXv_int14[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Mantenimientomaquina_tmsolicwwds_15_tfsmmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV69Mantenimientomaquina_tmsolicwwds_14_tfsmmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Mantenimientomaquina_tmsolicwwds_15_tfsmmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int14[12] = (byte)(1) ;
      }
      if ( AV71Mantenimientomaquina_tmsolicwwds_16_tfsmcal_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV71Mantenimientomaquina_tmsolicwwds_16_tfsmcal_sels, "T1.SMCal IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV73Mantenimientomaquina_tmsolicwwds_18_tfsmtxt_sel)==0) && ( ! (GXutil.strcmp("", AV72Mantenimientomaquina_tmsolicwwds_17_tfsmtxt)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.SMTxt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Mantenimientomaquina_tmsolicwwds_18_tfsmtxt_sel)==0) )
      {
         addWhere(sWhereString, "(T1.SMTxt = ?)");
      }
      else
      {
         GXv_int14[14] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.SMTxt" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
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
                  return conditional_P08EF2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (java.util.Date)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , (java.util.Date)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).byteValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] );
            case 1 :
                  return conditional_P08EF3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (java.util.Date)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , (java.util.Date)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).byteValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] );
            case 2 :
                  return conditional_P08EF4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (java.util.Date)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , (java.util.Date)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).byteValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] );
            case 3 :
                  return conditional_P08EF5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (java.util.Date)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , (java.util.Date)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).byteValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] );
            case 4 :
                  return conditional_P08EF6(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (java.util.Date)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , (java.util.Date)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).byteValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08EF2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08EF3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08EF4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08EF5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08EF6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(6);
               ((String[]) buf[10])[0] = rslt.getString(7, 6);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(9);
               ((byte[]) buf[15])[0] = rslt.getByte(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(6);
               ((String[]) buf[10])[0] = rslt.getString(7, 8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(9);
               ((byte[]) buf[15])[0] = rslt.getByte(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(5);
               ((String[]) buf[8])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(9);
               ((byte[]) buf[15])[0] = rslt.getByte(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(6);
               ((String[]) buf[10])[0] = rslt.getString(7, 8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(9);
               ((byte[]) buf[15])[0] = rslt.getByte(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(5);
               ((String[]) buf[8])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(9);
               ((byte[]) buf[15])[0] = rslt.getByte(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
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
                  stmt.setDateTime(sIdx, (java.util.Date)parms[17], false);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[22]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[23]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 2000);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 2000);
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
                  stmt.setDateTime(sIdx, (java.util.Date)parms[17], false);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[22]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[23]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 2000);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 2000);
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
                  stmt.setDateTime(sIdx, (java.util.Date)parms[17], false);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[22]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[23]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 2000);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 2000);
               }
               return;
            case 3 :
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
                  stmt.setDateTime(sIdx, (java.util.Date)parms[17], false);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[22]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[23]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 2000);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 2000);
               }
               return;
            case 4 :
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
                  stmt.setDateTime(sIdx, (java.util.Date)parms[17], false);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[22]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[23]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 2000);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 2000);
               }
               return;
      }
   }

}

