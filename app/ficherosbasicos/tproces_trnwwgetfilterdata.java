package app.ficherosbasicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tproces_trnwwgetfilterdata extends GXProcedure
{
   public tproces_trnwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tproces_trnwwgetfilterdata.class ), "" );
   }

   public tproces_trnwwgetfilterdata( int remoteHandle ,
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
      tproces_trnwwgetfilterdata.this.aP5 = new String[] {""};
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
      tproces_trnwwgetfilterdata.this.AV47DDOName = aP0;
      tproces_trnwwgetfilterdata.this.AV48SearchTxt = aP1;
      tproces_trnwwgetfilterdata.this.AV49SearchTxtTo = aP2;
      tproces_trnwwgetfilterdata.this.aP3 = aP3;
      tproces_trnwwgetfilterdata.this.aP4 = aP4;
      tproces_trnwwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV37Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV39OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV47DDOName), "DDO_PROCOD") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV47DDOName), "DDO_PRODSC") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV47DDOName), "DDO_PRODSC2") == 0 )
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
      AV50OptionsJson = AV37Options.toJSonString(false) ;
      AV51OptionsDescJson = AV39OptionsDesc.toJSonString(false) ;
      AV52OptionIndexesJson = AV40OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV42Session.getValue("FicherosBasicos.TProces_TRNWWGridState"), "") == 0 )
      {
         AV44GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FicherosBasicos.TProces_TRNWWGridState"), null, null);
      }
      else
      {
         AV44GridState.fromxml(AV42Session.getValue("FicherosBasicos.TProces_TRNWWGridState"), null, null);
      }
      AV56GXV1 = 1 ;
      while ( AV56GXV1 <= AV44GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV45GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV44GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV56GXV1));
         if ( GXutil.strcmp(AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV53FilterFullText = AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCOD") == 0 )
         {
            AV12TFProCod = AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCOD_SEL") == 0 )
         {
            AV13TFProCod_Sel = AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRODSC") == 0 )
         {
            AV14TFProDsc = AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRODSC_SEL") == 0 )
         {
            AV15TFProDsc_Sel = AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRODSC2") == 0 )
         {
            AV16TFProDsc2 = AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRODSC2_SEL") == 0 )
         {
            AV17TFProDsc2_Sel = AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROEST_SEL") == 0 )
         {
            AV20TFProEst_SelsJson = AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV21TFProEst_Sels.fromJSonString(AV20TFProEst_SelsJson, null);
         }
         AV56GXV1 = (int)(AV56GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPROCODOPTIONS' Routine */
      returnInSub = false ;
      AV12TFProCod = AV48SearchTxt ;
      AV13TFProCod_Sel = "" ;
      AV58Ficherosbasicos_tproces_trnwwds_1_filterfulltext = AV53FilterFullText ;
      AV59Ficherosbasicos_tproces_trnwwds_2_tfprocod = AV12TFProCod ;
      AV60Ficherosbasicos_tproces_trnwwds_3_tfprocod_sel = AV13TFProCod_Sel ;
      AV61Ficherosbasicos_tproces_trnwwds_4_tfprodsc = AV14TFProDsc ;
      AV62Ficherosbasicos_tproces_trnwwds_5_tfprodsc_sel = AV15TFProDsc_Sel ;
      AV63Ficherosbasicos_tproces_trnwwds_6_tfprodsc2 = AV16TFProDsc2 ;
      AV64Ficherosbasicos_tproces_trnwwds_7_tfprodsc2_sel = AV17TFProDsc2_Sel ;
      AV65Ficherosbasicos_tproces_trnwwds_8_tfproest_sels = AV21TFProEst_Sels ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A14284ProEst ,
                                           AV65Ficherosbasicos_tproces_trnwwds_8_tfproest_sels ,
                                           AV60Ficherosbasicos_tproces_trnwwds_3_tfprocod_sel ,
                                           AV59Ficherosbasicos_tproces_trnwwds_2_tfprocod ,
                                           AV62Ficherosbasicos_tproces_trnwwds_5_tfprodsc_sel ,
                                           AV61Ficherosbasicos_tproces_trnwwds_4_tfprodsc ,
                                           AV64Ficherosbasicos_tproces_trnwwds_7_tfprodsc2_sel ,
                                           AV63Ficherosbasicos_tproces_trnwwds_6_tfprodsc2 ,
                                           Integer.valueOf(AV65Ficherosbasicos_tproces_trnwwds_8_tfproest_sels.size()) ,
                                           A758ProCod ,
                                           A759ProDsc ,
                                           A4628ProDsc2 ,
                                           AV58Ficherosbasicos_tproces_trnwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV59Ficherosbasicos_tproces_trnwwds_2_tfprocod = GXutil.padr( GXutil.rtrim( AV59Ficherosbasicos_tproces_trnwwds_2_tfprocod), 8, "%") ;
      lV61Ficherosbasicos_tproces_trnwwds_4_tfprodsc = GXutil.padr( GXutil.rtrim( AV61Ficherosbasicos_tproces_trnwwds_4_tfprodsc), 40, "%") ;
      lV63Ficherosbasicos_tproces_trnwwds_6_tfprodsc2 = GXutil.padr( GXutil.rtrim( AV63Ficherosbasicos_tproces_trnwwds_6_tfprodsc2), 100, "%") ;
      /* Using cursor P0A9I2 */
      pr_default.execute(0, new Object[] {lV59Ficherosbasicos_tproces_trnwwds_2_tfprocod, AV60Ficherosbasicos_tproces_trnwwds_3_tfprocod_sel, lV61Ficherosbasicos_tproces_trnwwds_4_tfprodsc, AV62Ficherosbasicos_tproces_trnwwds_5_tfprodsc_sel, lV63Ficherosbasicos_tproces_trnwwds_6_tfprodsc2, AV64Ficherosbasicos_tproces_trnwwds_7_tfprodsc2_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkA9I2 = false ;
         A758ProCod = P0A9I2_A758ProCod[0] ;
         A4628ProDsc2 = P0A9I2_A4628ProDsc2[0] ;
         A759ProDsc = P0A9I2_A759ProDsc[0] ;
         A14284ProEst = P0A9I2_A14284ProEst[0] ;
         A396EmprCod = P0A9I2_A396EmprCod[0] ;
         if ( (GXutil.strcmp("", AV58Ficherosbasicos_tproces_trnwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A758ProCod) , GXutil.padr( "%" + GXutil.upper( AV58Ficherosbasicos_tproces_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A759ProDsc) , GXutil.padr( "%" + GXutil.upper( AV58Ficherosbasicos_tproces_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4628ProDsc2) , GXutil.padr( "%" + GXutil.upper( AV58Ficherosbasicos_tproces_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "activo", ""), "") , GXutil.padr( "%" + GXutil.lower( AV58Ficherosbasicos_tproces_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A14284ProEst, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "inactivo", ""), "") , GXutil.padr( "%" + GXutil.lower( AV58Ficherosbasicos_tproces_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A14284ProEst, httpContext.getMessage( "I", "")) == 0 ) ) ) )
         {
            AV41count = 0 ;
            while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0A9I2_A758ProCod[0], A758ProCod) == 0 ) )
            {
               brkA9I2 = false ;
               A396EmprCod = P0A9I2_A396EmprCod[0] ;
               AV41count = (long)(AV41count+1) ;
               brkA9I2 = true ;
               pr_default.readNext(0);
            }
            if ( ! (GXutil.strcmp("", A758ProCod)==0) )
            {
               AV36Option = A758ProCod ;
               AV37Options.add(AV36Option, 0);
               AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV41count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV37Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brkA9I2 )
         {
            brkA9I2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPRODSCOPTIONS' Routine */
      returnInSub = false ;
      AV14TFProDsc = AV48SearchTxt ;
      AV15TFProDsc_Sel = "" ;
      AV58Ficherosbasicos_tproces_trnwwds_1_filterfulltext = AV53FilterFullText ;
      AV59Ficherosbasicos_tproces_trnwwds_2_tfprocod = AV12TFProCod ;
      AV60Ficherosbasicos_tproces_trnwwds_3_tfprocod_sel = AV13TFProCod_Sel ;
      AV61Ficherosbasicos_tproces_trnwwds_4_tfprodsc = AV14TFProDsc ;
      AV62Ficherosbasicos_tproces_trnwwds_5_tfprodsc_sel = AV15TFProDsc_Sel ;
      AV63Ficherosbasicos_tproces_trnwwds_6_tfprodsc2 = AV16TFProDsc2 ;
      AV64Ficherosbasicos_tproces_trnwwds_7_tfprodsc2_sel = AV17TFProDsc2_Sel ;
      AV65Ficherosbasicos_tproces_trnwwds_8_tfproest_sels = AV21TFProEst_Sels ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           A14284ProEst ,
                                           AV65Ficherosbasicos_tproces_trnwwds_8_tfproest_sels ,
                                           AV60Ficherosbasicos_tproces_trnwwds_3_tfprocod_sel ,
                                           AV59Ficherosbasicos_tproces_trnwwds_2_tfprocod ,
                                           AV62Ficherosbasicos_tproces_trnwwds_5_tfprodsc_sel ,
                                           AV61Ficherosbasicos_tproces_trnwwds_4_tfprodsc ,
                                           AV64Ficherosbasicos_tproces_trnwwds_7_tfprodsc2_sel ,
                                           AV63Ficherosbasicos_tproces_trnwwds_6_tfprodsc2 ,
                                           Integer.valueOf(AV65Ficherosbasicos_tproces_trnwwds_8_tfproest_sels.size()) ,
                                           A758ProCod ,
                                           A759ProDsc ,
                                           A4628ProDsc2 ,
                                           AV58Ficherosbasicos_tproces_trnwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV59Ficherosbasicos_tproces_trnwwds_2_tfprocod = GXutil.padr( GXutil.rtrim( AV59Ficherosbasicos_tproces_trnwwds_2_tfprocod), 8, "%") ;
      lV61Ficherosbasicos_tproces_trnwwds_4_tfprodsc = GXutil.padr( GXutil.rtrim( AV61Ficherosbasicos_tproces_trnwwds_4_tfprodsc), 40, "%") ;
      lV63Ficherosbasicos_tproces_trnwwds_6_tfprodsc2 = GXutil.padr( GXutil.rtrim( AV63Ficherosbasicos_tproces_trnwwds_6_tfprodsc2), 100, "%") ;
      /* Using cursor P0A9I3 */
      pr_default.execute(1, new Object[] {lV59Ficherosbasicos_tproces_trnwwds_2_tfprocod, AV60Ficherosbasicos_tproces_trnwwds_3_tfprocod_sel, lV61Ficherosbasicos_tproces_trnwwds_4_tfprodsc, AV62Ficherosbasicos_tproces_trnwwds_5_tfprodsc_sel, lV63Ficherosbasicos_tproces_trnwwds_6_tfprodsc2, AV64Ficherosbasicos_tproces_trnwwds_7_tfprodsc2_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brkA9I4 = false ;
         A759ProDsc = P0A9I3_A759ProDsc[0] ;
         A4628ProDsc2 = P0A9I3_A4628ProDsc2[0] ;
         A758ProCod = P0A9I3_A758ProCod[0] ;
         A14284ProEst = P0A9I3_A14284ProEst[0] ;
         A396EmprCod = P0A9I3_A396EmprCod[0] ;
         if ( (GXutil.strcmp("", AV58Ficherosbasicos_tproces_trnwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A758ProCod) , GXutil.padr( "%" + GXutil.upper( AV58Ficherosbasicos_tproces_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A759ProDsc) , GXutil.padr( "%" + GXutil.upper( AV58Ficherosbasicos_tproces_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4628ProDsc2) , GXutil.padr( "%" + GXutil.upper( AV58Ficherosbasicos_tproces_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "activo", ""), "") , GXutil.padr( "%" + GXutil.lower( AV58Ficherosbasicos_tproces_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A14284ProEst, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "inactivo", ""), "") , GXutil.padr( "%" + GXutil.lower( AV58Ficherosbasicos_tproces_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A14284ProEst, httpContext.getMessage( "I", "")) == 0 ) ) ) )
         {
            AV41count = 0 ;
            while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P0A9I3_A759ProDsc[0], A759ProDsc) == 0 ) )
            {
               brkA9I4 = false ;
               A758ProCod = P0A9I3_A758ProCod[0] ;
               A396EmprCod = P0A9I3_A396EmprCod[0] ;
               AV41count = (long)(AV41count+1) ;
               brkA9I4 = true ;
               pr_default.readNext(1);
            }
            if ( ! (GXutil.strcmp("", A759ProDsc)==0) )
            {
               AV36Option = A759ProDsc ;
               AV37Options.add(AV36Option, 0);
               AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV41count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV37Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brkA9I4 )
         {
            brkA9I4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADPRODSC2OPTIONS' Routine */
      returnInSub = false ;
      AV16TFProDsc2 = AV48SearchTxt ;
      AV17TFProDsc2_Sel = "" ;
      AV58Ficherosbasicos_tproces_trnwwds_1_filterfulltext = AV53FilterFullText ;
      AV59Ficherosbasicos_tproces_trnwwds_2_tfprocod = AV12TFProCod ;
      AV60Ficherosbasicos_tproces_trnwwds_3_tfprocod_sel = AV13TFProCod_Sel ;
      AV61Ficherosbasicos_tproces_trnwwds_4_tfprodsc = AV14TFProDsc ;
      AV62Ficherosbasicos_tproces_trnwwds_5_tfprodsc_sel = AV15TFProDsc_Sel ;
      AV63Ficherosbasicos_tproces_trnwwds_6_tfprodsc2 = AV16TFProDsc2 ;
      AV64Ficherosbasicos_tproces_trnwwds_7_tfprodsc2_sel = AV17TFProDsc2_Sel ;
      AV65Ficherosbasicos_tproces_trnwwds_8_tfproest_sels = AV21TFProEst_Sels ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           A14284ProEst ,
                                           AV65Ficherosbasicos_tproces_trnwwds_8_tfproest_sels ,
                                           AV60Ficherosbasicos_tproces_trnwwds_3_tfprocod_sel ,
                                           AV59Ficherosbasicos_tproces_trnwwds_2_tfprocod ,
                                           AV62Ficherosbasicos_tproces_trnwwds_5_tfprodsc_sel ,
                                           AV61Ficherosbasicos_tproces_trnwwds_4_tfprodsc ,
                                           AV64Ficherosbasicos_tproces_trnwwds_7_tfprodsc2_sel ,
                                           AV63Ficherosbasicos_tproces_trnwwds_6_tfprodsc2 ,
                                           Integer.valueOf(AV65Ficherosbasicos_tproces_trnwwds_8_tfproest_sels.size()) ,
                                           A758ProCod ,
                                           A759ProDsc ,
                                           A4628ProDsc2 ,
                                           AV58Ficherosbasicos_tproces_trnwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV59Ficherosbasicos_tproces_trnwwds_2_tfprocod = GXutil.padr( GXutil.rtrim( AV59Ficherosbasicos_tproces_trnwwds_2_tfprocod), 8, "%") ;
      lV61Ficherosbasicos_tproces_trnwwds_4_tfprodsc = GXutil.padr( GXutil.rtrim( AV61Ficherosbasicos_tproces_trnwwds_4_tfprodsc), 40, "%") ;
      lV63Ficherosbasicos_tproces_trnwwds_6_tfprodsc2 = GXutil.padr( GXutil.rtrim( AV63Ficherosbasicos_tproces_trnwwds_6_tfprodsc2), 100, "%") ;
      /* Using cursor P0A9I4 */
      pr_default.execute(2, new Object[] {lV59Ficherosbasicos_tproces_trnwwds_2_tfprocod, AV60Ficherosbasicos_tproces_trnwwds_3_tfprocod_sel, lV61Ficherosbasicos_tproces_trnwwds_4_tfprodsc, AV62Ficherosbasicos_tproces_trnwwds_5_tfprodsc_sel, lV63Ficherosbasicos_tproces_trnwwds_6_tfprodsc2, AV64Ficherosbasicos_tproces_trnwwds_7_tfprodsc2_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brkA9I6 = false ;
         A4628ProDsc2 = P0A9I4_A4628ProDsc2[0] ;
         A759ProDsc = P0A9I4_A759ProDsc[0] ;
         A758ProCod = P0A9I4_A758ProCod[0] ;
         A14284ProEst = P0A9I4_A14284ProEst[0] ;
         A396EmprCod = P0A9I4_A396EmprCod[0] ;
         if ( (GXutil.strcmp("", AV58Ficherosbasicos_tproces_trnwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A758ProCod) , GXutil.padr( "%" + GXutil.upper( AV58Ficherosbasicos_tproces_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A759ProDsc) , GXutil.padr( "%" + GXutil.upper( AV58Ficherosbasicos_tproces_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4628ProDsc2) , GXutil.padr( "%" + GXutil.upper( AV58Ficherosbasicos_tproces_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "activo", ""), "") , GXutil.padr( "%" + GXutil.lower( AV58Ficherosbasicos_tproces_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A14284ProEst, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "inactivo", ""), "") , GXutil.padr( "%" + GXutil.lower( AV58Ficherosbasicos_tproces_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A14284ProEst, httpContext.getMessage( "I", "")) == 0 ) ) ) )
         {
            AV41count = 0 ;
            while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P0A9I4_A4628ProDsc2[0], A4628ProDsc2) == 0 ) )
            {
               brkA9I6 = false ;
               A758ProCod = P0A9I4_A758ProCod[0] ;
               A396EmprCod = P0A9I4_A396EmprCod[0] ;
               AV41count = (long)(AV41count+1) ;
               brkA9I6 = true ;
               pr_default.readNext(2);
            }
            if ( ! (GXutil.strcmp("", A4628ProDsc2)==0) )
            {
               AV36Option = A4628ProDsc2 ;
               AV37Options.add(AV36Option, 0);
               AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV41count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV37Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brkA9I6 )
         {
            brkA9I6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tproces_trnwwgetfilterdata.this.AV50OptionsJson;
      this.aP4[0] = tproces_trnwwgetfilterdata.this.AV51OptionsDescJson;
      this.aP5[0] = tproces_trnwwgetfilterdata.this.AV52OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV50OptionsJson = "" ;
      AV51OptionsDescJson = "" ;
      AV52OptionIndexesJson = "" ;
      AV37Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV39OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV40OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV42Session = httpContext.getWebSession();
      AV44GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV45GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV53FilterFullText = "" ;
      AV12TFProCod = "" ;
      AV13TFProCod_Sel = "" ;
      AV14TFProDsc = "" ;
      AV15TFProDsc_Sel = "" ;
      AV16TFProDsc2 = "" ;
      AV17TFProDsc2_Sel = "" ;
      AV20TFProEst_SelsJson = "" ;
      AV21TFProEst_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      A758ProCod = "" ;
      AV58Ficherosbasicos_tproces_trnwwds_1_filterfulltext = "" ;
      AV59Ficherosbasicos_tproces_trnwwds_2_tfprocod = "" ;
      AV60Ficherosbasicos_tproces_trnwwds_3_tfprocod_sel = "" ;
      AV61Ficherosbasicos_tproces_trnwwds_4_tfprodsc = "" ;
      AV62Ficherosbasicos_tproces_trnwwds_5_tfprodsc_sel = "" ;
      AV63Ficherosbasicos_tproces_trnwwds_6_tfprodsc2 = "" ;
      AV64Ficherosbasicos_tproces_trnwwds_7_tfprodsc2_sel = "" ;
      AV65Ficherosbasicos_tproces_trnwwds_8_tfproest_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      scmdbuf = "" ;
      lV59Ficherosbasicos_tproces_trnwwds_2_tfprocod = "" ;
      lV61Ficherosbasicos_tproces_trnwwds_4_tfprodsc = "" ;
      lV63Ficherosbasicos_tproces_trnwwds_6_tfprodsc2 = "" ;
      A14284ProEst = "" ;
      A759ProDsc = "" ;
      A4628ProDsc2 = "" ;
      P0A9I2_A758ProCod = new String[] {""} ;
      P0A9I2_A4628ProDsc2 = new String[] {""} ;
      P0A9I2_A759ProDsc = new String[] {""} ;
      P0A9I2_A14284ProEst = new String[] {""} ;
      P0A9I2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV36Option = "" ;
      P0A9I3_A759ProDsc = new String[] {""} ;
      P0A9I3_A4628ProDsc2 = new String[] {""} ;
      P0A9I3_A758ProCod = new String[] {""} ;
      P0A9I3_A14284ProEst = new String[] {""} ;
      P0A9I3_A396EmprCod = new String[] {""} ;
      P0A9I4_A4628ProDsc2 = new String[] {""} ;
      P0A9I4_A759ProDsc = new String[] {""} ;
      P0A9I4_A758ProCod = new String[] {""} ;
      P0A9I4_A14284ProEst = new String[] {""} ;
      P0A9I4_A396EmprCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tproces_trnwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0A9I2_A758ProCod, P0A9I2_A4628ProDsc2, P0A9I2_A759ProDsc, P0A9I2_A14284ProEst, P0A9I2_A396EmprCod
            }
            , new Object[] {
            P0A9I3_A759ProDsc, P0A9I3_A4628ProDsc2, P0A9I3_A758ProCod, P0A9I3_A14284ProEst, P0A9I3_A396EmprCod
            }
            , new Object[] {
            P0A9I4_A4628ProDsc2, P0A9I4_A759ProDsc, P0A9I4_A758ProCod, P0A9I4_A14284ProEst, P0A9I4_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV56GXV1 ;
   private int AV65Ficherosbasicos_tproces_trnwwds_8_tfproest_sels_size ;
   private long AV41count ;
   private String AV12TFProCod ;
   private String AV13TFProCod_Sel ;
   private String AV14TFProDsc ;
   private String AV15TFProDsc_Sel ;
   private String AV16TFProDsc2 ;
   private String AV17TFProDsc2_Sel ;
   private String A758ProCod ;
   private String AV59Ficherosbasicos_tproces_trnwwds_2_tfprocod ;
   private String AV60Ficherosbasicos_tproces_trnwwds_3_tfprocod_sel ;
   private String AV61Ficherosbasicos_tproces_trnwwds_4_tfprodsc ;
   private String AV62Ficherosbasicos_tproces_trnwwds_5_tfprodsc_sel ;
   private String AV63Ficherosbasicos_tproces_trnwwds_6_tfprodsc2 ;
   private String AV64Ficherosbasicos_tproces_trnwwds_7_tfprodsc2_sel ;
   private String scmdbuf ;
   private String lV59Ficherosbasicos_tproces_trnwwds_2_tfprocod ;
   private String lV61Ficherosbasicos_tproces_trnwwds_4_tfprodsc ;
   private String lV63Ficherosbasicos_tproces_trnwwds_6_tfprodsc2 ;
   private String A14284ProEst ;
   private String A759ProDsc ;
   private String A4628ProDsc2 ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brkA9I2 ;
   private boolean brkA9I4 ;
   private boolean brkA9I6 ;
   private String AV50OptionsJson ;
   private String AV51OptionsDescJson ;
   private String AV52OptionIndexesJson ;
   private String AV20TFProEst_SelsJson ;
   private String AV47DDOName ;
   private String AV48SearchTxt ;
   private String AV49SearchTxtTo ;
   private String AV53FilterFullText ;
   private String AV58Ficherosbasicos_tproces_trnwwds_1_filterfulltext ;
   private String AV36Option ;
   private com.genexus.webpanels.WebSession AV42Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A9I2_A758ProCod ;
   private String[] P0A9I2_A4628ProDsc2 ;
   private String[] P0A9I2_A759ProDsc ;
   private String[] P0A9I2_A14284ProEst ;
   private String[] P0A9I2_A396EmprCod ;
   private String[] P0A9I3_A759ProDsc ;
   private String[] P0A9I3_A4628ProDsc2 ;
   private String[] P0A9I3_A758ProCod ;
   private String[] P0A9I3_A14284ProEst ;
   private String[] P0A9I3_A396EmprCod ;
   private String[] P0A9I4_A4628ProDsc2 ;
   private String[] P0A9I4_A759ProDsc ;
   private String[] P0A9I4_A758ProCod ;
   private String[] P0A9I4_A14284ProEst ;
   private String[] P0A9I4_A396EmprCod ;
   private GXSimpleCollection<String> AV21TFProEst_Sels ;
   private GXSimpleCollection<String> AV65Ficherosbasicos_tproces_trnwwds_8_tfproest_sels ;
   private GXSimpleCollection<String> AV37Options ;
   private GXSimpleCollection<String> AV39OptionsDesc ;
   private GXSimpleCollection<String> AV40OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV44GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV45GridStateFilterValue ;
}

final  class tproces_trnwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0A9I2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A14284ProEst ,
                                          GXSimpleCollection<String> AV65Ficherosbasicos_tproces_trnwwds_8_tfproest_sels ,
                                          String AV60Ficherosbasicos_tproces_trnwwds_3_tfprocod_sel ,
                                          String AV59Ficherosbasicos_tproces_trnwwds_2_tfprocod ,
                                          String AV62Ficherosbasicos_tproces_trnwwds_5_tfprodsc_sel ,
                                          String AV61Ficherosbasicos_tproces_trnwwds_4_tfprodsc ,
                                          String AV64Ficherosbasicos_tproces_trnwwds_7_tfprodsc2_sel ,
                                          String AV63Ficherosbasicos_tproces_trnwwds_6_tfprodsc2 ,
                                          int AV65Ficherosbasicos_tproces_trnwwds_8_tfproest_sels_size ,
                                          String A758ProCod ,
                                          String A759ProDsc ,
                                          String A4628ProDsc2 ,
                                          String AV58Ficherosbasicos_tproces_trnwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[6];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT ProCod, ProDsc2, ProDsc, ProEst, EmprCod FROM TXPPROCES" ;
      if ( (GXutil.strcmp("", AV60Ficherosbasicos_tproces_trnwwds_3_tfprocod_sel)==0) && ( ! (GXutil.strcmp("", AV59Ficherosbasicos_tproces_trnwwds_2_tfprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Ficherosbasicos_tproces_trnwwds_3_tfprocod_sel)==0) )
      {
         addWhere(sWhereString, "(ProCod = ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Ficherosbasicos_tproces_trnwwds_5_tfprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV61Ficherosbasicos_tproces_trnwwds_4_tfprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Ficherosbasicos_tproces_trnwwds_5_tfprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(ProDsc = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Ficherosbasicos_tproces_trnwwds_7_tfprodsc2_sel)==0) && ( ! (GXutil.strcmp("", AV63Ficherosbasicos_tproces_trnwwds_6_tfprodsc2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ProDsc2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Ficherosbasicos_tproces_trnwwds_7_tfprodsc2_sel)==0) )
      {
         addWhere(sWhereString, "(ProDsc2 = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( AV65Ficherosbasicos_tproces_trnwwds_8_tfproest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV65Ficherosbasicos_tproces_trnwwds_8_tfproest_sels, "ProEst IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY ProCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P0A9I3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A14284ProEst ,
                                          GXSimpleCollection<String> AV65Ficherosbasicos_tproces_trnwwds_8_tfproest_sels ,
                                          String AV60Ficherosbasicos_tproces_trnwwds_3_tfprocod_sel ,
                                          String AV59Ficherosbasicos_tproces_trnwwds_2_tfprocod ,
                                          String AV62Ficherosbasicos_tproces_trnwwds_5_tfprodsc_sel ,
                                          String AV61Ficherosbasicos_tproces_trnwwds_4_tfprodsc ,
                                          String AV64Ficherosbasicos_tproces_trnwwds_7_tfprodsc2_sel ,
                                          String AV63Ficherosbasicos_tproces_trnwwds_6_tfprodsc2 ,
                                          int AV65Ficherosbasicos_tproces_trnwwds_8_tfproest_sels_size ,
                                          String A758ProCod ,
                                          String A759ProDsc ,
                                          String A4628ProDsc2 ,
                                          String AV58Ficherosbasicos_tproces_trnwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[6];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT ProDsc, ProDsc2, ProCod, ProEst, EmprCod FROM TXPPROCES" ;
      if ( (GXutil.strcmp("", AV60Ficherosbasicos_tproces_trnwwds_3_tfprocod_sel)==0) && ( ! (GXutil.strcmp("", AV59Ficherosbasicos_tproces_trnwwds_2_tfprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Ficherosbasicos_tproces_trnwwds_3_tfprocod_sel)==0) )
      {
         addWhere(sWhereString, "(ProCod = ?)");
      }
      else
      {
         GXv_int5[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Ficherosbasicos_tproces_trnwwds_5_tfprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV61Ficherosbasicos_tproces_trnwwds_4_tfprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Ficherosbasicos_tproces_trnwwds_5_tfprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(ProDsc = ?)");
      }
      else
      {
         GXv_int5[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Ficherosbasicos_tproces_trnwwds_7_tfprodsc2_sel)==0) && ( ! (GXutil.strcmp("", AV63Ficherosbasicos_tproces_trnwwds_6_tfprodsc2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ProDsc2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Ficherosbasicos_tproces_trnwwds_7_tfprodsc2_sel)==0) )
      {
         addWhere(sWhereString, "(ProDsc2 = ?)");
      }
      else
      {
         GXv_int5[5] = (byte)(1) ;
      }
      if ( AV65Ficherosbasicos_tproces_trnwwds_8_tfproest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV65Ficherosbasicos_tproces_trnwwds_8_tfproest_sels, "ProEst IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY ProDsc" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   protected Object[] conditional_P0A9I4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A14284ProEst ,
                                          GXSimpleCollection<String> AV65Ficherosbasicos_tproces_trnwwds_8_tfproest_sels ,
                                          String AV60Ficherosbasicos_tproces_trnwwds_3_tfprocod_sel ,
                                          String AV59Ficherosbasicos_tproces_trnwwds_2_tfprocod ,
                                          String AV62Ficherosbasicos_tproces_trnwwds_5_tfprodsc_sel ,
                                          String AV61Ficherosbasicos_tproces_trnwwds_4_tfprodsc ,
                                          String AV64Ficherosbasicos_tproces_trnwwds_7_tfprodsc2_sel ,
                                          String AV63Ficherosbasicos_tproces_trnwwds_6_tfprodsc2 ,
                                          int AV65Ficherosbasicos_tproces_trnwwds_8_tfproest_sels_size ,
                                          String A758ProCod ,
                                          String A759ProDsc ,
                                          String A4628ProDsc2 ,
                                          String AV58Ficherosbasicos_tproces_trnwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[6];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT ProDsc2, ProDsc, ProCod, ProEst, EmprCod FROM TXPPROCES" ;
      if ( (GXutil.strcmp("", AV60Ficherosbasicos_tproces_trnwwds_3_tfprocod_sel)==0) && ( ! (GXutil.strcmp("", AV59Ficherosbasicos_tproces_trnwwds_2_tfprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Ficherosbasicos_tproces_trnwwds_3_tfprocod_sel)==0) )
      {
         addWhere(sWhereString, "(ProCod = ?)");
      }
      else
      {
         GXv_int8[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Ficherosbasicos_tproces_trnwwds_5_tfprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV61Ficherosbasicos_tproces_trnwwds_4_tfprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Ficherosbasicos_tproces_trnwwds_5_tfprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(ProDsc = ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Ficherosbasicos_tproces_trnwwds_7_tfprodsc2_sel)==0) && ( ! (GXutil.strcmp("", AV63Ficherosbasicos_tproces_trnwwds_6_tfprodsc2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ProDsc2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Ficherosbasicos_tproces_trnwwds_7_tfprodsc2_sel)==0) )
      {
         addWhere(sWhereString, "(ProDsc2 = ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( AV65Ficherosbasicos_tproces_trnwwds_8_tfproest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV65Ficherosbasicos_tproces_trnwwds_8_tfproest_sels, "ProEst IN (", ")")+")");
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
                  return conditional_P0A9I2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] );
            case 1 :
                  return conditional_P0A9I3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] );
            case 2 :
                  return conditional_P0A9I4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A9I2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A9I3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A9I4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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

