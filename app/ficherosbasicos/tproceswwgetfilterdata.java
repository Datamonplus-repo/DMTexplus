package app.ficherosbasicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tproceswwgetfilterdata extends GXProcedure
{
   public tproceswwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tproceswwgetfilterdata.class ), "" );
   }

   public tproceswwgetfilterdata( int remoteHandle ,
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
      tproceswwgetfilterdata.this.aP5 = new String[] {""};
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
      tproceswwgetfilterdata.this.AV29DDOName = aP0;
      tproceswwgetfilterdata.this.AV30SearchTxt = aP1;
      tproceswwgetfilterdata.this.AV31SearchTxtTo = aP2;
      tproceswwgetfilterdata.this.aP3 = aP3;
      tproceswwgetfilterdata.this.aP4 = aP4;
      tproceswwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV19Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV21OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV22OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV29DDOName), "DDO_PROCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADPROCODOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV29DDOName), "DDO_PRODSC") == 0 )
      {
         /* Execute user subroutine: 'LOADPRODSCOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV29DDOName), "DDO_PRODSC2") == 0 )
      {
         /* Execute user subroutine: 'LOADPRODSC2OPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV32OptionsJson = AV19Options.toJSonString(false) ;
      AV33OptionsDescJson = AV21OptionsDesc.toJSonString(false) ;
      AV34OptionIndexesJson = AV22OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV24Session.getValue("FicherosBasicos.TPROCESWWGridState"), "") == 0 )
      {
         AV26GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FicherosBasicos.TPROCESWWGridState"), null, null);
      }
      else
      {
         AV26GridState.fromxml(AV24Session.getValue("FicherosBasicos.TPROCESWWGridState"), null, null);
      }
      AV52GXV1 = 1 ;
      while ( AV52GXV1 <= AV26GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV27GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV26GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV52GXV1));
         if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV35FilterFullText = AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCOD") == 0 )
         {
            AV10TFProCod = AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCOD_SEL") == 0 )
         {
            AV11TFProCod_Sel = AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRODSC") == 0 )
         {
            AV12TFProDsc = AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRODSC_SEL") == 0 )
         {
            AV13TFProDsc_Sel = AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRODSC2") == 0 )
         {
            AV14TFProDsc2 = AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRODSC2_SEL") == 0 )
         {
            AV15TFProDsc2_Sel = AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROEST_SEL") == 0 )
         {
            AV48TFProEst_SelsJson = AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV49TFProEst_Sels.fromJSonString(AV48TFProEst_SelsJson, null);
         }
         AV52GXV1 = (int)(AV52GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPROCODOPTIONS' Routine */
      returnInSub = false ;
      AV10TFProCod = AV30SearchTxt ;
      AV11TFProCod_Sel = "" ;
      AV54Ficherosbasicos_tproceswwds_1_filterfulltext = AV35FilterFullText ;
      AV55Ficherosbasicos_tproceswwds_2_tfprocod = AV10TFProCod ;
      AV56Ficherosbasicos_tproceswwds_3_tfprocod_sel = AV11TFProCod_Sel ;
      AV57Ficherosbasicos_tproceswwds_4_tfprodsc = AV12TFProDsc ;
      AV58Ficherosbasicos_tproceswwds_5_tfprodsc_sel = AV13TFProDsc_Sel ;
      AV59Ficherosbasicos_tproceswwds_6_tfprodsc2 = AV14TFProDsc2 ;
      AV60Ficherosbasicos_tproceswwds_7_tfprodsc2_sel = AV15TFProDsc2_Sel ;
      AV61Ficherosbasicos_tproceswwds_8_tfproest_sels = AV49TFProEst_Sels ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A14284ProEst ,
                                           AV61Ficherosbasicos_tproceswwds_8_tfproest_sels ,
                                           AV56Ficherosbasicos_tproceswwds_3_tfprocod_sel ,
                                           AV55Ficherosbasicos_tproceswwds_2_tfprocod ,
                                           AV58Ficherosbasicos_tproceswwds_5_tfprodsc_sel ,
                                           AV57Ficherosbasicos_tproceswwds_4_tfprodsc ,
                                           AV60Ficherosbasicos_tproceswwds_7_tfprodsc2_sel ,
                                           AV59Ficherosbasicos_tproceswwds_6_tfprodsc2 ,
                                           Integer.valueOf(AV61Ficherosbasicos_tproceswwds_8_tfproest_sels.size()) ,
                                           A758ProCod ,
                                           A759ProDsc ,
                                           A4628ProDsc2 ,
                                           AV54Ficherosbasicos_tproceswwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV55Ficherosbasicos_tproceswwds_2_tfprocod = GXutil.padr( GXutil.rtrim( AV55Ficherosbasicos_tproceswwds_2_tfprocod), 8, "%") ;
      lV57Ficherosbasicos_tproceswwds_4_tfprodsc = GXutil.padr( GXutil.rtrim( AV57Ficherosbasicos_tproceswwds_4_tfprodsc), 40, "%") ;
      lV59Ficherosbasicos_tproceswwds_6_tfprodsc2 = GXutil.padr( GXutil.rtrim( AV59Ficherosbasicos_tproceswwds_6_tfprodsc2), 100, "%") ;
      /* Using cursor P0A3E2 */
      pr_default.execute(0, new Object[] {lV55Ficherosbasicos_tproceswwds_2_tfprocod, AV56Ficherosbasicos_tproceswwds_3_tfprocod_sel, lV57Ficherosbasicos_tproceswwds_4_tfprodsc, AV58Ficherosbasicos_tproceswwds_5_tfprodsc_sel, lV59Ficherosbasicos_tproceswwds_6_tfprodsc2, AV60Ficherosbasicos_tproceswwds_7_tfprodsc2_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkA3E2 = false ;
         A758ProCod = P0A3E2_A758ProCod[0] ;
         A4628ProDsc2 = P0A3E2_A4628ProDsc2[0] ;
         A759ProDsc = P0A3E2_A759ProDsc[0] ;
         A14284ProEst = P0A3E2_A14284ProEst[0] ;
         A396EmprCod = P0A3E2_A396EmprCod[0] ;
         if ( (GXutil.strcmp("", AV54Ficherosbasicos_tproceswwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A758ProCod) , GXutil.padr( "%" + GXutil.upper( AV54Ficherosbasicos_tproceswwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A759ProDsc) , GXutil.padr( "%" + GXutil.upper( AV54Ficherosbasicos_tproceswwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4628ProDsc2) , GXutil.padr( "%" + GXutil.upper( AV54Ficherosbasicos_tproceswwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "activo", ""), "") , GXutil.padr( "%" + GXutil.lower( AV54Ficherosbasicos_tproceswwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A14284ProEst, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "inactivo", ""), "") , GXutil.padr( "%" + GXutil.lower( AV54Ficherosbasicos_tproceswwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A14284ProEst, httpContext.getMessage( "I", "")) == 0 ) ) ) )
         {
            AV23count = 0 ;
            while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0A3E2_A758ProCod[0], A758ProCod) == 0 ) )
            {
               brkA3E2 = false ;
               A396EmprCod = P0A3E2_A396EmprCod[0] ;
               AV23count = (long)(AV23count+1) ;
               brkA3E2 = true ;
               pr_default.readNext(0);
            }
            if ( ! (GXutil.strcmp("", A758ProCod)==0) )
            {
               AV18Option = A758ProCod ;
               AV19Options.add(AV18Option, 0);
               AV22OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV23count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV19Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brkA3E2 )
         {
            brkA3E2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPRODSCOPTIONS' Routine */
      returnInSub = false ;
      AV12TFProDsc = AV30SearchTxt ;
      AV13TFProDsc_Sel = "" ;
      AV54Ficherosbasicos_tproceswwds_1_filterfulltext = AV35FilterFullText ;
      AV55Ficherosbasicos_tproceswwds_2_tfprocod = AV10TFProCod ;
      AV56Ficherosbasicos_tproceswwds_3_tfprocod_sel = AV11TFProCod_Sel ;
      AV57Ficherosbasicos_tproceswwds_4_tfprodsc = AV12TFProDsc ;
      AV58Ficherosbasicos_tproceswwds_5_tfprodsc_sel = AV13TFProDsc_Sel ;
      AV59Ficherosbasicos_tproceswwds_6_tfprodsc2 = AV14TFProDsc2 ;
      AV60Ficherosbasicos_tproceswwds_7_tfprodsc2_sel = AV15TFProDsc2_Sel ;
      AV61Ficherosbasicos_tproceswwds_8_tfproest_sels = AV49TFProEst_Sels ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           A14284ProEst ,
                                           AV61Ficherosbasicos_tproceswwds_8_tfproest_sels ,
                                           AV56Ficherosbasicos_tproceswwds_3_tfprocod_sel ,
                                           AV55Ficherosbasicos_tproceswwds_2_tfprocod ,
                                           AV58Ficherosbasicos_tproceswwds_5_tfprodsc_sel ,
                                           AV57Ficherosbasicos_tproceswwds_4_tfprodsc ,
                                           AV60Ficherosbasicos_tproceswwds_7_tfprodsc2_sel ,
                                           AV59Ficherosbasicos_tproceswwds_6_tfprodsc2 ,
                                           Integer.valueOf(AV61Ficherosbasicos_tproceswwds_8_tfproest_sels.size()) ,
                                           A758ProCod ,
                                           A759ProDsc ,
                                           A4628ProDsc2 ,
                                           AV54Ficherosbasicos_tproceswwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV55Ficherosbasicos_tproceswwds_2_tfprocod = GXutil.padr( GXutil.rtrim( AV55Ficherosbasicos_tproceswwds_2_tfprocod), 8, "%") ;
      lV57Ficherosbasicos_tproceswwds_4_tfprodsc = GXutil.padr( GXutil.rtrim( AV57Ficherosbasicos_tproceswwds_4_tfprodsc), 40, "%") ;
      lV59Ficherosbasicos_tproceswwds_6_tfprodsc2 = GXutil.padr( GXutil.rtrim( AV59Ficherosbasicos_tproceswwds_6_tfprodsc2), 100, "%") ;
      /* Using cursor P0A3E3 */
      pr_default.execute(1, new Object[] {lV55Ficherosbasicos_tproceswwds_2_tfprocod, AV56Ficherosbasicos_tproceswwds_3_tfprocod_sel, lV57Ficherosbasicos_tproceswwds_4_tfprodsc, AV58Ficherosbasicos_tproceswwds_5_tfprodsc_sel, lV59Ficherosbasicos_tproceswwds_6_tfprodsc2, AV60Ficherosbasicos_tproceswwds_7_tfprodsc2_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brkA3E4 = false ;
         A759ProDsc = P0A3E3_A759ProDsc[0] ;
         A4628ProDsc2 = P0A3E3_A4628ProDsc2[0] ;
         A758ProCod = P0A3E3_A758ProCod[0] ;
         A14284ProEst = P0A3E3_A14284ProEst[0] ;
         A396EmprCod = P0A3E3_A396EmprCod[0] ;
         if ( (GXutil.strcmp("", AV54Ficherosbasicos_tproceswwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A758ProCod) , GXutil.padr( "%" + GXutil.upper( AV54Ficherosbasicos_tproceswwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A759ProDsc) , GXutil.padr( "%" + GXutil.upper( AV54Ficherosbasicos_tproceswwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4628ProDsc2) , GXutil.padr( "%" + GXutil.upper( AV54Ficherosbasicos_tproceswwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "activo", ""), "") , GXutil.padr( "%" + GXutil.lower( AV54Ficherosbasicos_tproceswwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A14284ProEst, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "inactivo", ""), "") , GXutil.padr( "%" + GXutil.lower( AV54Ficherosbasicos_tproceswwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A14284ProEst, httpContext.getMessage( "I", "")) == 0 ) ) ) )
         {
            AV23count = 0 ;
            while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P0A3E3_A759ProDsc[0], A759ProDsc) == 0 ) )
            {
               brkA3E4 = false ;
               A758ProCod = P0A3E3_A758ProCod[0] ;
               A396EmprCod = P0A3E3_A396EmprCod[0] ;
               AV23count = (long)(AV23count+1) ;
               brkA3E4 = true ;
               pr_default.readNext(1);
            }
            if ( ! (GXutil.strcmp("", A759ProDsc)==0) )
            {
               AV18Option = A759ProDsc ;
               AV19Options.add(AV18Option, 0);
               AV22OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV23count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV19Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brkA3E4 )
         {
            brkA3E4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADPRODSC2OPTIONS' Routine */
      returnInSub = false ;
      AV14TFProDsc2 = AV30SearchTxt ;
      AV15TFProDsc2_Sel = "" ;
      AV54Ficherosbasicos_tproceswwds_1_filterfulltext = AV35FilterFullText ;
      AV55Ficherosbasicos_tproceswwds_2_tfprocod = AV10TFProCod ;
      AV56Ficherosbasicos_tproceswwds_3_tfprocod_sel = AV11TFProCod_Sel ;
      AV57Ficherosbasicos_tproceswwds_4_tfprodsc = AV12TFProDsc ;
      AV58Ficherosbasicos_tproceswwds_5_tfprodsc_sel = AV13TFProDsc_Sel ;
      AV59Ficherosbasicos_tproceswwds_6_tfprodsc2 = AV14TFProDsc2 ;
      AV60Ficherosbasicos_tproceswwds_7_tfprodsc2_sel = AV15TFProDsc2_Sel ;
      AV61Ficherosbasicos_tproceswwds_8_tfproest_sels = AV49TFProEst_Sels ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           A14284ProEst ,
                                           AV61Ficherosbasicos_tproceswwds_8_tfproest_sels ,
                                           AV56Ficherosbasicos_tproceswwds_3_tfprocod_sel ,
                                           AV55Ficherosbasicos_tproceswwds_2_tfprocod ,
                                           AV58Ficherosbasicos_tproceswwds_5_tfprodsc_sel ,
                                           AV57Ficherosbasicos_tproceswwds_4_tfprodsc ,
                                           AV60Ficherosbasicos_tproceswwds_7_tfprodsc2_sel ,
                                           AV59Ficherosbasicos_tproceswwds_6_tfprodsc2 ,
                                           Integer.valueOf(AV61Ficherosbasicos_tproceswwds_8_tfproest_sels.size()) ,
                                           A758ProCod ,
                                           A759ProDsc ,
                                           A4628ProDsc2 ,
                                           AV54Ficherosbasicos_tproceswwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV55Ficherosbasicos_tproceswwds_2_tfprocod = GXutil.padr( GXutil.rtrim( AV55Ficherosbasicos_tproceswwds_2_tfprocod), 8, "%") ;
      lV57Ficherosbasicos_tproceswwds_4_tfprodsc = GXutil.padr( GXutil.rtrim( AV57Ficherosbasicos_tproceswwds_4_tfprodsc), 40, "%") ;
      lV59Ficherosbasicos_tproceswwds_6_tfprodsc2 = GXutil.padr( GXutil.rtrim( AV59Ficherosbasicos_tproceswwds_6_tfprodsc2), 100, "%") ;
      /* Using cursor P0A3E4 */
      pr_default.execute(2, new Object[] {lV55Ficherosbasicos_tproceswwds_2_tfprocod, AV56Ficherosbasicos_tproceswwds_3_tfprocod_sel, lV57Ficherosbasicos_tproceswwds_4_tfprodsc, AV58Ficherosbasicos_tproceswwds_5_tfprodsc_sel, lV59Ficherosbasicos_tproceswwds_6_tfprodsc2, AV60Ficherosbasicos_tproceswwds_7_tfprodsc2_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brkA3E6 = false ;
         A4628ProDsc2 = P0A3E4_A4628ProDsc2[0] ;
         A759ProDsc = P0A3E4_A759ProDsc[0] ;
         A758ProCod = P0A3E4_A758ProCod[0] ;
         A14284ProEst = P0A3E4_A14284ProEst[0] ;
         A396EmprCod = P0A3E4_A396EmprCod[0] ;
         if ( (GXutil.strcmp("", AV54Ficherosbasicos_tproceswwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A758ProCod) , GXutil.padr( "%" + GXutil.upper( AV54Ficherosbasicos_tproceswwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A759ProDsc) , GXutil.padr( "%" + GXutil.upper( AV54Ficherosbasicos_tproceswwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4628ProDsc2) , GXutil.padr( "%" + GXutil.upper( AV54Ficherosbasicos_tproceswwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "activo", ""), "") , GXutil.padr( "%" + GXutil.lower( AV54Ficherosbasicos_tproceswwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A14284ProEst, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "inactivo", ""), "") , GXutil.padr( "%" + GXutil.lower( AV54Ficherosbasicos_tproceswwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A14284ProEst, httpContext.getMessage( "I", "")) == 0 ) ) ) )
         {
            AV23count = 0 ;
            while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P0A3E4_A4628ProDsc2[0], A4628ProDsc2) == 0 ) )
            {
               brkA3E6 = false ;
               A758ProCod = P0A3E4_A758ProCod[0] ;
               A396EmprCod = P0A3E4_A396EmprCod[0] ;
               AV23count = (long)(AV23count+1) ;
               brkA3E6 = true ;
               pr_default.readNext(2);
            }
            if ( ! (GXutil.strcmp("", A4628ProDsc2)==0) )
            {
               AV18Option = A4628ProDsc2 ;
               AV19Options.add(AV18Option, 0);
               AV22OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV23count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV19Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brkA3E6 )
         {
            brkA3E6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tproceswwgetfilterdata.this.AV32OptionsJson;
      this.aP4[0] = tproceswwgetfilterdata.this.AV33OptionsDescJson;
      this.aP5[0] = tproceswwgetfilterdata.this.AV34OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV32OptionsJson = "" ;
      AV33OptionsDescJson = "" ;
      AV34OptionIndexesJson = "" ;
      AV19Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV21OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV22OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV24Session = httpContext.getWebSession();
      AV26GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV27GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV35FilterFullText = "" ;
      AV10TFProCod = "" ;
      AV11TFProCod_Sel = "" ;
      AV12TFProDsc = "" ;
      AV13TFProDsc_Sel = "" ;
      AV14TFProDsc2 = "" ;
      AV15TFProDsc2_Sel = "" ;
      AV48TFProEst_SelsJson = "" ;
      AV49TFProEst_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      A758ProCod = "" ;
      AV54Ficherosbasicos_tproceswwds_1_filterfulltext = "" ;
      AV55Ficherosbasicos_tproceswwds_2_tfprocod = "" ;
      AV56Ficherosbasicos_tproceswwds_3_tfprocod_sel = "" ;
      AV57Ficherosbasicos_tproceswwds_4_tfprodsc = "" ;
      AV58Ficherosbasicos_tproceswwds_5_tfprodsc_sel = "" ;
      AV59Ficherosbasicos_tproceswwds_6_tfprodsc2 = "" ;
      AV60Ficherosbasicos_tproceswwds_7_tfprodsc2_sel = "" ;
      AV61Ficherosbasicos_tproceswwds_8_tfproest_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      scmdbuf = "" ;
      lV55Ficherosbasicos_tproceswwds_2_tfprocod = "" ;
      lV57Ficherosbasicos_tproceswwds_4_tfprodsc = "" ;
      lV59Ficherosbasicos_tproceswwds_6_tfprodsc2 = "" ;
      A14284ProEst = "" ;
      A759ProDsc = "" ;
      A4628ProDsc2 = "" ;
      P0A3E2_A758ProCod = new String[] {""} ;
      P0A3E2_A4628ProDsc2 = new String[] {""} ;
      P0A3E2_A759ProDsc = new String[] {""} ;
      P0A3E2_A14284ProEst = new String[] {""} ;
      P0A3E2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV18Option = "" ;
      P0A3E3_A759ProDsc = new String[] {""} ;
      P0A3E3_A4628ProDsc2 = new String[] {""} ;
      P0A3E3_A758ProCod = new String[] {""} ;
      P0A3E3_A14284ProEst = new String[] {""} ;
      P0A3E3_A396EmprCod = new String[] {""} ;
      P0A3E4_A4628ProDsc2 = new String[] {""} ;
      P0A3E4_A759ProDsc = new String[] {""} ;
      P0A3E4_A758ProCod = new String[] {""} ;
      P0A3E4_A14284ProEst = new String[] {""} ;
      P0A3E4_A396EmprCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tproceswwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0A3E2_A758ProCod, P0A3E2_A4628ProDsc2, P0A3E2_A759ProDsc, P0A3E2_A14284ProEst, P0A3E2_A396EmprCod
            }
            , new Object[] {
            P0A3E3_A759ProDsc, P0A3E3_A4628ProDsc2, P0A3E3_A758ProCod, P0A3E3_A14284ProEst, P0A3E3_A396EmprCod
            }
            , new Object[] {
            P0A3E4_A4628ProDsc2, P0A3E4_A759ProDsc, P0A3E4_A758ProCod, P0A3E4_A14284ProEst, P0A3E4_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV52GXV1 ;
   private int AV61Ficherosbasicos_tproceswwds_8_tfproest_sels_size ;
   private long AV23count ;
   private String AV10TFProCod ;
   private String AV11TFProCod_Sel ;
   private String AV12TFProDsc ;
   private String AV13TFProDsc_Sel ;
   private String AV14TFProDsc2 ;
   private String AV15TFProDsc2_Sel ;
   private String A758ProCod ;
   private String AV55Ficherosbasicos_tproceswwds_2_tfprocod ;
   private String AV56Ficherosbasicos_tproceswwds_3_tfprocod_sel ;
   private String AV57Ficherosbasicos_tproceswwds_4_tfprodsc ;
   private String AV58Ficherosbasicos_tproceswwds_5_tfprodsc_sel ;
   private String AV59Ficherosbasicos_tproceswwds_6_tfprodsc2 ;
   private String AV60Ficherosbasicos_tproceswwds_7_tfprodsc2_sel ;
   private String scmdbuf ;
   private String lV55Ficherosbasicos_tproceswwds_2_tfprocod ;
   private String lV57Ficherosbasicos_tproceswwds_4_tfprodsc ;
   private String lV59Ficherosbasicos_tproceswwds_6_tfprodsc2 ;
   private String A14284ProEst ;
   private String A759ProDsc ;
   private String A4628ProDsc2 ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brkA3E2 ;
   private boolean brkA3E4 ;
   private boolean brkA3E6 ;
   private String AV32OptionsJson ;
   private String AV33OptionsDescJson ;
   private String AV34OptionIndexesJson ;
   private String AV48TFProEst_SelsJson ;
   private String AV29DDOName ;
   private String AV30SearchTxt ;
   private String AV31SearchTxtTo ;
   private String AV35FilterFullText ;
   private String AV54Ficherosbasicos_tproceswwds_1_filterfulltext ;
   private String AV18Option ;
   private com.genexus.webpanels.WebSession AV24Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A3E2_A758ProCod ;
   private String[] P0A3E2_A4628ProDsc2 ;
   private String[] P0A3E2_A759ProDsc ;
   private String[] P0A3E2_A14284ProEst ;
   private String[] P0A3E2_A396EmprCod ;
   private String[] P0A3E3_A759ProDsc ;
   private String[] P0A3E3_A4628ProDsc2 ;
   private String[] P0A3E3_A758ProCod ;
   private String[] P0A3E3_A14284ProEst ;
   private String[] P0A3E3_A396EmprCod ;
   private String[] P0A3E4_A4628ProDsc2 ;
   private String[] P0A3E4_A759ProDsc ;
   private String[] P0A3E4_A758ProCod ;
   private String[] P0A3E4_A14284ProEst ;
   private String[] P0A3E4_A396EmprCod ;
   private GXSimpleCollection<String> AV49TFProEst_Sels ;
   private GXSimpleCollection<String> AV61Ficherosbasicos_tproceswwds_8_tfproest_sels ;
   private GXSimpleCollection<String> AV19Options ;
   private GXSimpleCollection<String> AV21OptionsDesc ;
   private GXSimpleCollection<String> AV22OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV26GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV27GridStateFilterValue ;
}

final  class tproceswwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0A3E2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A14284ProEst ,
                                          GXSimpleCollection<String> AV61Ficherosbasicos_tproceswwds_8_tfproest_sels ,
                                          String AV56Ficherosbasicos_tproceswwds_3_tfprocod_sel ,
                                          String AV55Ficherosbasicos_tproceswwds_2_tfprocod ,
                                          String AV58Ficherosbasicos_tproceswwds_5_tfprodsc_sel ,
                                          String AV57Ficherosbasicos_tproceswwds_4_tfprodsc ,
                                          String AV60Ficherosbasicos_tproceswwds_7_tfprodsc2_sel ,
                                          String AV59Ficherosbasicos_tproceswwds_6_tfprodsc2 ,
                                          int AV61Ficherosbasicos_tproceswwds_8_tfproest_sels_size ,
                                          String A758ProCod ,
                                          String A759ProDsc ,
                                          String A4628ProDsc2 ,
                                          String AV54Ficherosbasicos_tproceswwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[6];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT ProCod, ProDsc2, ProDsc, ProEst, EmprCod FROM TXPPROCES" ;
      if ( (GXutil.strcmp("", AV56Ficherosbasicos_tproceswwds_3_tfprocod_sel)==0) && ( ! (GXutil.strcmp("", AV55Ficherosbasicos_tproceswwds_2_tfprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Ficherosbasicos_tproceswwds_3_tfprocod_sel)==0) )
      {
         addWhere(sWhereString, "(ProCod = ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Ficherosbasicos_tproceswwds_5_tfprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV57Ficherosbasicos_tproceswwds_4_tfprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Ficherosbasicos_tproceswwds_5_tfprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(ProDsc = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Ficherosbasicos_tproceswwds_7_tfprodsc2_sel)==0) && ( ! (GXutil.strcmp("", AV59Ficherosbasicos_tproceswwds_6_tfprodsc2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ProDsc2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Ficherosbasicos_tproceswwds_7_tfprodsc2_sel)==0) )
      {
         addWhere(sWhereString, "(ProDsc2 = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( AV61Ficherosbasicos_tproceswwds_8_tfproest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV61Ficherosbasicos_tproceswwds_8_tfproest_sels, "ProEst IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY ProCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P0A3E3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A14284ProEst ,
                                          GXSimpleCollection<String> AV61Ficherosbasicos_tproceswwds_8_tfproest_sels ,
                                          String AV56Ficherosbasicos_tproceswwds_3_tfprocod_sel ,
                                          String AV55Ficherosbasicos_tproceswwds_2_tfprocod ,
                                          String AV58Ficherosbasicos_tproceswwds_5_tfprodsc_sel ,
                                          String AV57Ficherosbasicos_tproceswwds_4_tfprodsc ,
                                          String AV60Ficherosbasicos_tproceswwds_7_tfprodsc2_sel ,
                                          String AV59Ficherosbasicos_tproceswwds_6_tfprodsc2 ,
                                          int AV61Ficherosbasicos_tproceswwds_8_tfproest_sels_size ,
                                          String A758ProCod ,
                                          String A759ProDsc ,
                                          String A4628ProDsc2 ,
                                          String AV54Ficherosbasicos_tproceswwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[6];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT ProDsc, ProDsc2, ProCod, ProEst, EmprCod FROM TXPPROCES" ;
      if ( (GXutil.strcmp("", AV56Ficherosbasicos_tproceswwds_3_tfprocod_sel)==0) && ( ! (GXutil.strcmp("", AV55Ficherosbasicos_tproceswwds_2_tfprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Ficherosbasicos_tproceswwds_3_tfprocod_sel)==0) )
      {
         addWhere(sWhereString, "(ProCod = ?)");
      }
      else
      {
         GXv_int5[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Ficherosbasicos_tproceswwds_5_tfprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV57Ficherosbasicos_tproceswwds_4_tfprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Ficherosbasicos_tproceswwds_5_tfprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(ProDsc = ?)");
      }
      else
      {
         GXv_int5[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Ficherosbasicos_tproceswwds_7_tfprodsc2_sel)==0) && ( ! (GXutil.strcmp("", AV59Ficherosbasicos_tproceswwds_6_tfprodsc2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ProDsc2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Ficherosbasicos_tproceswwds_7_tfprodsc2_sel)==0) )
      {
         addWhere(sWhereString, "(ProDsc2 = ?)");
      }
      else
      {
         GXv_int5[5] = (byte)(1) ;
      }
      if ( AV61Ficherosbasicos_tproceswwds_8_tfproest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV61Ficherosbasicos_tproceswwds_8_tfproest_sels, "ProEst IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY ProDsc" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   protected Object[] conditional_P0A3E4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A14284ProEst ,
                                          GXSimpleCollection<String> AV61Ficherosbasicos_tproceswwds_8_tfproest_sels ,
                                          String AV56Ficherosbasicos_tproceswwds_3_tfprocod_sel ,
                                          String AV55Ficherosbasicos_tproceswwds_2_tfprocod ,
                                          String AV58Ficherosbasicos_tproceswwds_5_tfprodsc_sel ,
                                          String AV57Ficherosbasicos_tproceswwds_4_tfprodsc ,
                                          String AV60Ficherosbasicos_tproceswwds_7_tfprodsc2_sel ,
                                          String AV59Ficherosbasicos_tproceswwds_6_tfprodsc2 ,
                                          int AV61Ficherosbasicos_tproceswwds_8_tfproest_sels_size ,
                                          String A758ProCod ,
                                          String A759ProDsc ,
                                          String A4628ProDsc2 ,
                                          String AV54Ficherosbasicos_tproceswwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[6];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT ProDsc2, ProDsc, ProCod, ProEst, EmprCod FROM TXPPROCES" ;
      if ( (GXutil.strcmp("", AV56Ficherosbasicos_tproceswwds_3_tfprocod_sel)==0) && ( ! (GXutil.strcmp("", AV55Ficherosbasicos_tproceswwds_2_tfprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Ficherosbasicos_tproceswwds_3_tfprocod_sel)==0) )
      {
         addWhere(sWhereString, "(ProCod = ?)");
      }
      else
      {
         GXv_int8[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Ficherosbasicos_tproceswwds_5_tfprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV57Ficherosbasicos_tproceswwds_4_tfprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Ficherosbasicos_tproceswwds_5_tfprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(ProDsc = ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Ficherosbasicos_tproceswwds_7_tfprodsc2_sel)==0) && ( ! (GXutil.strcmp("", AV59Ficherosbasicos_tproceswwds_6_tfprodsc2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ProDsc2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Ficherosbasicos_tproceswwds_7_tfprodsc2_sel)==0) )
      {
         addWhere(sWhereString, "(ProDsc2 = ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( AV61Ficherosbasicos_tproceswwds_8_tfproest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV61Ficherosbasicos_tproceswwds_8_tfproest_sels, "ProEst IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY ProDsc2" ;
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
                  return conditional_P0A3E2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] );
            case 1 :
                  return conditional_P0A3E3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] );
            case 2 :
                  return conditional_P0A3E4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A3E2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A3E3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A3E4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 100);
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((String[]) buf[1])[0] = rslt.getString(2, 100);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 100);
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
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
                  stmt.setString(sIdx, (String)parms[6], 8);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 40);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 40);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 100);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[6], 8);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 40);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 40);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 100);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[6], 8);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 40);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 40);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 100);
               }
               return;
      }
   }

}

