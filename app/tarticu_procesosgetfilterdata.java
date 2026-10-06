package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tarticu_procesosgetfilterdata extends GXProcedure
{
   public tarticu_procesosgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tarticu_procesosgetfilterdata.class ), "" );
   }

   public tarticu_procesosgetfilterdata( int remoteHandle ,
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
      tarticu_procesosgetfilterdata.this.aP5 = new String[] {""};
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
      tarticu_procesosgetfilterdata.this.AV34DDOName = aP0;
      tarticu_procesosgetfilterdata.this.AV35SearchTxt = aP1;
      tarticu_procesosgetfilterdata.this.AV36SearchTxtTo = aP2;
      tarticu_procesosgetfilterdata.this.aP3 = aP3;
      tarticu_procesosgetfilterdata.this.aP4 = aP4;
      tarticu_procesosgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV24Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV26OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV27OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV34DDOName), "DDO_PROCOD") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV34DDOName), "DDO_PRODSC") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV34DDOName), "DDO_PROUSERA") == 0 )
      {
         /* Execute user subroutine: 'LOADPROUSERAOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV34DDOName), "DDO_PROUSERM") == 0 )
      {
         /* Execute user subroutine: 'LOADPROUSERMOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV37OptionsJson = AV24Options.toJSonString(false) ;
      AV38OptionsDescJson = AV26OptionsDesc.toJSonString(false) ;
      AV39OptionIndexesJson = AV27OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV29Session.getValue("Tarticu_ProcesosGridState"), "") == 0 )
      {
         AV31GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Tarticu_ProcesosGridState"), null, null);
      }
      else
      {
         AV31GridState.fromxml(AV29Session.getValue("Tarticu_ProcesosGridState"), null, null);
      }
      AV58GXV1 = 1 ;
      while ( AV58GXV1 <= AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV32GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV58GXV1));
         if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCOD") == 0 )
         {
            AV41TFProCod = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCOD_SEL") == 0 )
         {
            AV42TFProCod_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRODSC") == 0 )
         {
            AV43TFProDsc = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRODSC_SEL") == 0 )
         {
            AV44TFProDsc_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROUSERA") == 0 )
         {
            AV45TFProUserA = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROUSERA_SEL") == 0 )
         {
            AV46TFProUserA_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFECA") == 0 )
         {
            AV47TFProFecA = localUtil.ctot( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROUSERM") == 0 )
         {
            AV48TFProUserM = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROUSERM_SEL") == 0 )
         {
            AV49TFProUserM_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFECM") == 0 )
         {
            AV50TFProFecM = localUtil.ctot( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV51Emprcod = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV52Clicod = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLINOM") == 0 )
         {
            AV55CliNom = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ARTCOD") == 0 )
         {
            AV53ArtCod = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ARTDSC") == 0 )
         {
            AV54ARtDsc = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV58GXV1 = (int)(AV58GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPROCODOPTIONS' Routine */
      returnInSub = false ;
      AV41TFProCod = AV35SearchTxt ;
      AV42TFProCod_Sel = "" ;
      AV60Tarticu_procesosds_1_tfprocod = AV41TFProCod ;
      AV61Tarticu_procesosds_2_tfprocod_sel = AV42TFProCod_Sel ;
      AV62Tarticu_procesosds_3_tfprodsc = AV43TFProDsc ;
      AV63Tarticu_procesosds_4_tfprodsc_sel = AV44TFProDsc_Sel ;
      AV64Tarticu_procesosds_5_tfprousera = AV45TFProUserA ;
      AV65Tarticu_procesosds_6_tfprousera_sel = AV46TFProUserA_Sel ;
      AV66Tarticu_procesosds_7_tfprofeca = AV47TFProFecA ;
      AV67Tarticu_procesosds_8_tfprouserm = AV48TFProUserM ;
      AV68Tarticu_procesosds_9_tfprouserm_sel = AV49TFProUserM_Sel ;
      AV69Tarticu_procesosds_10_tfprofecm = AV50TFProFecM ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV61Tarticu_procesosds_2_tfprocod_sel ,
                                           AV60Tarticu_procesosds_1_tfprocod ,
                                           AV63Tarticu_procesosds_4_tfprodsc_sel ,
                                           AV62Tarticu_procesosds_3_tfprodsc ,
                                           AV65Tarticu_procesosds_6_tfprousera_sel ,
                                           AV64Tarticu_procesosds_5_tfprousera ,
                                           AV66Tarticu_procesosds_7_tfprofeca ,
                                           AV68Tarticu_procesosds_9_tfprouserm_sel ,
                                           AV67Tarticu_procesosds_8_tfprouserm ,
                                           AV69Tarticu_procesosds_10_tfprofecm ,
                                           A758ProCod ,
                                           A759ProDsc ,
                                           A10553ProUserA ,
                                           A10554ProFecA ,
                                           A10555ProUserM ,
                                           A10556ProFecM ,
                                           AV51Emprcod ,
                                           Integer.valueOf(AV52Clicod) ,
                                           AV53ArtCod ,
                                           A396EmprCod ,
                                           Integer.valueOf(A252CliCod) ,
                                           A65ArtCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.STRING
                                           }
      });
      lV60Tarticu_procesosds_1_tfprocod = GXutil.padr( GXutil.rtrim( AV60Tarticu_procesosds_1_tfprocod), 8, "%") ;
      lV62Tarticu_procesosds_3_tfprodsc = GXutil.padr( GXutil.rtrim( AV62Tarticu_procesosds_3_tfprodsc), 40, "%") ;
      lV64Tarticu_procesosds_5_tfprousera = GXutil.padr( GXutil.rtrim( AV64Tarticu_procesosds_5_tfprousera), 10, "%") ;
      lV67Tarticu_procesosds_8_tfprouserm = GXutil.padr( GXutil.rtrim( AV67Tarticu_procesosds_8_tfprouserm), 10, "%") ;
      /* Using cursor P0A9F2 */
      pr_default.execute(0, new Object[] {AV51Emprcod, Integer.valueOf(AV52Clicod), AV53ArtCod, lV60Tarticu_procesosds_1_tfprocod, AV61Tarticu_procesosds_2_tfprocod_sel, lV62Tarticu_procesosds_3_tfprodsc, AV63Tarticu_procesosds_4_tfprodsc_sel, lV64Tarticu_procesosds_5_tfprousera, AV65Tarticu_procesosds_6_tfprousera_sel, AV66Tarticu_procesosds_7_tfprofeca, lV67Tarticu_procesosds_8_tfprouserm, AV68Tarticu_procesosds_9_tfprouserm_sel, AV69Tarticu_procesosds_10_tfprofecm});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkA9F2 = false ;
         A65ArtCod = P0A9F2_A65ArtCod[0] ;
         A252CliCod = P0A9F2_A252CliCod[0] ;
         A396EmprCod = P0A9F2_A396EmprCod[0] ;
         A758ProCod = P0A9F2_A758ProCod[0] ;
         A10556ProFecM = P0A9F2_A10556ProFecM[0] ;
         A10555ProUserM = P0A9F2_A10555ProUserM[0] ;
         A10554ProFecA = P0A9F2_A10554ProFecA[0] ;
         A10553ProUserA = P0A9F2_A10553ProUserA[0] ;
         A759ProDsc = P0A9F2_A759ProDsc[0] ;
         A759ProDsc = P0A9F2_A759ProDsc[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0A9F2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P0A9F2_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(P0A9F2_A65ArtCod[0], A65ArtCod) == 0 ) && ( GXutil.strcmp(P0A9F2_A758ProCod[0], A758ProCod) == 0 ) )
         {
            brkA9F2 = false ;
            AV28count = (long)(AV28count+1) ;
            brkA9F2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A758ProCod)==0) )
         {
            AV23Option = A758ProCod ;
            AV24Options.add(AV23Option, 0);
            AV27OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV24Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkA9F2 )
         {
            brkA9F2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPRODSCOPTIONS' Routine */
      returnInSub = false ;
      AV43TFProDsc = AV35SearchTxt ;
      AV44TFProDsc_Sel = "" ;
      AV60Tarticu_procesosds_1_tfprocod = AV41TFProCod ;
      AV61Tarticu_procesosds_2_tfprocod_sel = AV42TFProCod_Sel ;
      AV62Tarticu_procesosds_3_tfprodsc = AV43TFProDsc ;
      AV63Tarticu_procesosds_4_tfprodsc_sel = AV44TFProDsc_Sel ;
      AV64Tarticu_procesosds_5_tfprousera = AV45TFProUserA ;
      AV65Tarticu_procesosds_6_tfprousera_sel = AV46TFProUserA_Sel ;
      AV66Tarticu_procesosds_7_tfprofeca = AV47TFProFecA ;
      AV67Tarticu_procesosds_8_tfprouserm = AV48TFProUserM ;
      AV68Tarticu_procesosds_9_tfprouserm_sel = AV49TFProUserM_Sel ;
      AV69Tarticu_procesosds_10_tfprofecm = AV50TFProFecM ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV61Tarticu_procesosds_2_tfprocod_sel ,
                                           AV60Tarticu_procesosds_1_tfprocod ,
                                           AV63Tarticu_procesosds_4_tfprodsc_sel ,
                                           AV62Tarticu_procesosds_3_tfprodsc ,
                                           AV65Tarticu_procesosds_6_tfprousera_sel ,
                                           AV64Tarticu_procesosds_5_tfprousera ,
                                           AV66Tarticu_procesosds_7_tfprofeca ,
                                           AV68Tarticu_procesosds_9_tfprouserm_sel ,
                                           AV67Tarticu_procesosds_8_tfprouserm ,
                                           AV69Tarticu_procesosds_10_tfprofecm ,
                                           A758ProCod ,
                                           A759ProDsc ,
                                           A10553ProUserA ,
                                           A10554ProFecA ,
                                           A10555ProUserM ,
                                           A10556ProFecM ,
                                           Integer.valueOf(A252CliCod) ,
                                           Integer.valueOf(AV52Clicod) ,
                                           A65ArtCod ,
                                           AV53ArtCod ,
                                           AV51Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV60Tarticu_procesosds_1_tfprocod = GXutil.padr( GXutil.rtrim( AV60Tarticu_procesosds_1_tfprocod), 8, "%") ;
      lV62Tarticu_procesosds_3_tfprodsc = GXutil.padr( GXutil.rtrim( AV62Tarticu_procesosds_3_tfprodsc), 40, "%") ;
      lV64Tarticu_procesosds_5_tfprousera = GXutil.padr( GXutil.rtrim( AV64Tarticu_procesosds_5_tfprousera), 10, "%") ;
      lV67Tarticu_procesosds_8_tfprouserm = GXutil.padr( GXutil.rtrim( AV67Tarticu_procesosds_8_tfprouserm), 10, "%") ;
      /* Using cursor P0A9F3 */
      pr_default.execute(1, new Object[] {AV51Emprcod, Integer.valueOf(AV52Clicod), AV53ArtCod, lV60Tarticu_procesosds_1_tfprocod, AV61Tarticu_procesosds_2_tfprocod_sel, lV62Tarticu_procesosds_3_tfprodsc, AV63Tarticu_procesosds_4_tfprodsc_sel, lV64Tarticu_procesosds_5_tfprousera, AV65Tarticu_procesosds_6_tfprousera_sel, AV66Tarticu_procesosds_7_tfprofeca, lV67Tarticu_procesosds_8_tfprouserm, AV68Tarticu_procesosds_9_tfprouserm_sel, AV69Tarticu_procesosds_10_tfprofecm});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brkA9F4 = false ;
         A758ProCod = P0A9F3_A758ProCod[0] ;
         A396EmprCod = P0A9F3_A396EmprCod[0] ;
         A65ArtCod = P0A9F3_A65ArtCod[0] ;
         A252CliCod = P0A9F3_A252CliCod[0] ;
         A10556ProFecM = P0A9F3_A10556ProFecM[0] ;
         A10555ProUserM = P0A9F3_A10555ProUserM[0] ;
         A10554ProFecA = P0A9F3_A10554ProFecA[0] ;
         A10553ProUserA = P0A9F3_A10553ProUserA[0] ;
         A759ProDsc = P0A9F3_A759ProDsc[0] ;
         A759ProDsc = P0A9F3_A759ProDsc[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P0A9F3_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P0A9F3_A758ProCod[0], A758ProCod) == 0 ) )
         {
            brkA9F4 = false ;
            A65ArtCod = P0A9F3_A65ArtCod[0] ;
            A252CliCod = P0A9F3_A252CliCod[0] ;
            AV28count = (long)(AV28count+1) ;
            brkA9F4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A759ProDsc)==0) )
         {
            AV23Option = A759ProDsc ;
            AV22InsertIndex = 1 ;
            while ( ( AV22InsertIndex <= AV24Options.size() ) && ( GXutil.strcmp((String)AV24Options.elementAt(-1+AV22InsertIndex), AV23Option) < 0 ) )
            {
               AV22InsertIndex = (int)(AV22InsertIndex+1) ;
            }
            AV24Options.add(AV23Option, AV22InsertIndex);
            AV27OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), AV22InsertIndex);
         }
         if ( AV24Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkA9F4 )
         {
            brkA9F4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADPROUSERAOPTIONS' Routine */
      returnInSub = false ;
      AV45TFProUserA = AV35SearchTxt ;
      AV46TFProUserA_Sel = "" ;
      AV60Tarticu_procesosds_1_tfprocod = AV41TFProCod ;
      AV61Tarticu_procesosds_2_tfprocod_sel = AV42TFProCod_Sel ;
      AV62Tarticu_procesosds_3_tfprodsc = AV43TFProDsc ;
      AV63Tarticu_procesosds_4_tfprodsc_sel = AV44TFProDsc_Sel ;
      AV64Tarticu_procesosds_5_tfprousera = AV45TFProUserA ;
      AV65Tarticu_procesosds_6_tfprousera_sel = AV46TFProUserA_Sel ;
      AV66Tarticu_procesosds_7_tfprofeca = AV47TFProFecA ;
      AV67Tarticu_procesosds_8_tfprouserm = AV48TFProUserM ;
      AV68Tarticu_procesosds_9_tfprouserm_sel = AV49TFProUserM_Sel ;
      AV69Tarticu_procesosds_10_tfprofecm = AV50TFProFecM ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV61Tarticu_procesosds_2_tfprocod_sel ,
                                           AV60Tarticu_procesosds_1_tfprocod ,
                                           AV63Tarticu_procesosds_4_tfprodsc_sel ,
                                           AV62Tarticu_procesosds_3_tfprodsc ,
                                           AV65Tarticu_procesosds_6_tfprousera_sel ,
                                           AV64Tarticu_procesosds_5_tfprousera ,
                                           AV66Tarticu_procesosds_7_tfprofeca ,
                                           AV68Tarticu_procesosds_9_tfprouserm_sel ,
                                           AV67Tarticu_procesosds_8_tfprouserm ,
                                           AV69Tarticu_procesosds_10_tfprofecm ,
                                           A758ProCod ,
                                           A759ProDsc ,
                                           A10553ProUserA ,
                                           A10554ProFecA ,
                                           A10555ProUserM ,
                                           A10556ProFecM ,
                                           A396EmprCod ,
                                           AV51Emprcod ,
                                           Integer.valueOf(A252CliCod) ,
                                           Integer.valueOf(AV52Clicod) ,
                                           A65ArtCod ,
                                           AV53ArtCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV60Tarticu_procesosds_1_tfprocod = GXutil.padr( GXutil.rtrim( AV60Tarticu_procesosds_1_tfprocod), 8, "%") ;
      lV62Tarticu_procesosds_3_tfprodsc = GXutil.padr( GXutil.rtrim( AV62Tarticu_procesosds_3_tfprodsc), 40, "%") ;
      lV64Tarticu_procesosds_5_tfprousera = GXutil.padr( GXutil.rtrim( AV64Tarticu_procesosds_5_tfprousera), 10, "%") ;
      lV67Tarticu_procesosds_8_tfprouserm = GXutil.padr( GXutil.rtrim( AV67Tarticu_procesosds_8_tfprouserm), 10, "%") ;
      /* Using cursor P0A9F4 */
      pr_default.execute(2, new Object[] {AV51Emprcod, Integer.valueOf(AV52Clicod), AV53ArtCod, lV60Tarticu_procesosds_1_tfprocod, AV61Tarticu_procesosds_2_tfprocod_sel, lV62Tarticu_procesosds_3_tfprodsc, AV63Tarticu_procesosds_4_tfprodsc_sel, lV64Tarticu_procesosds_5_tfprousera, AV65Tarticu_procesosds_6_tfprousera_sel, AV66Tarticu_procesosds_7_tfprofeca, lV67Tarticu_procesosds_8_tfprouserm, AV68Tarticu_procesosds_9_tfprouserm_sel, AV69Tarticu_procesosds_10_tfprofecm});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brkA9F6 = false ;
         A396EmprCod = P0A9F4_A396EmprCod[0] ;
         A252CliCod = P0A9F4_A252CliCod[0] ;
         A65ArtCod = P0A9F4_A65ArtCod[0] ;
         A10553ProUserA = P0A9F4_A10553ProUserA[0] ;
         A10556ProFecM = P0A9F4_A10556ProFecM[0] ;
         A10555ProUserM = P0A9F4_A10555ProUserM[0] ;
         A10554ProFecA = P0A9F4_A10554ProFecA[0] ;
         A759ProDsc = P0A9F4_A759ProDsc[0] ;
         A758ProCod = P0A9F4_A758ProCod[0] ;
         A759ProDsc = P0A9F4_A759ProDsc[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P0A9F4_A10553ProUserA[0], A10553ProUserA) == 0 ) )
         {
            brkA9F6 = false ;
            A396EmprCod = P0A9F4_A396EmprCod[0] ;
            A252CliCod = P0A9F4_A252CliCod[0] ;
            A65ArtCod = P0A9F4_A65ArtCod[0] ;
            A758ProCod = P0A9F4_A758ProCod[0] ;
            AV28count = (long)(AV28count+1) ;
            brkA9F6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A10553ProUserA)==0) )
         {
            AV23Option = A10553ProUserA ;
            AV24Options.add(AV23Option, 0);
            AV27OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV24Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkA9F6 )
         {
            brkA9F6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADPROUSERMOPTIONS' Routine */
      returnInSub = false ;
      AV48TFProUserM = AV35SearchTxt ;
      AV49TFProUserM_Sel = "" ;
      AV60Tarticu_procesosds_1_tfprocod = AV41TFProCod ;
      AV61Tarticu_procesosds_2_tfprocod_sel = AV42TFProCod_Sel ;
      AV62Tarticu_procesosds_3_tfprodsc = AV43TFProDsc ;
      AV63Tarticu_procesosds_4_tfprodsc_sel = AV44TFProDsc_Sel ;
      AV64Tarticu_procesosds_5_tfprousera = AV45TFProUserA ;
      AV65Tarticu_procesosds_6_tfprousera_sel = AV46TFProUserA_Sel ;
      AV66Tarticu_procesosds_7_tfprofeca = AV47TFProFecA ;
      AV67Tarticu_procesosds_8_tfprouserm = AV48TFProUserM ;
      AV68Tarticu_procesosds_9_tfprouserm_sel = AV49TFProUserM_Sel ;
      AV69Tarticu_procesosds_10_tfprofecm = AV50TFProFecM ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV61Tarticu_procesosds_2_tfprocod_sel ,
                                           AV60Tarticu_procesosds_1_tfprocod ,
                                           AV63Tarticu_procesosds_4_tfprodsc_sel ,
                                           AV62Tarticu_procesosds_3_tfprodsc ,
                                           AV65Tarticu_procesosds_6_tfprousera_sel ,
                                           AV64Tarticu_procesosds_5_tfprousera ,
                                           AV66Tarticu_procesosds_7_tfprofeca ,
                                           AV68Tarticu_procesosds_9_tfprouserm_sel ,
                                           AV67Tarticu_procesosds_8_tfprouserm ,
                                           AV69Tarticu_procesosds_10_tfprofecm ,
                                           A758ProCod ,
                                           A759ProDsc ,
                                           A10553ProUserA ,
                                           A10554ProFecA ,
                                           A10555ProUserM ,
                                           A10556ProFecM ,
                                           A396EmprCod ,
                                           AV51Emprcod ,
                                           Integer.valueOf(A252CliCod) ,
                                           Integer.valueOf(AV52Clicod) ,
                                           A65ArtCod ,
                                           AV53ArtCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV60Tarticu_procesosds_1_tfprocod = GXutil.padr( GXutil.rtrim( AV60Tarticu_procesosds_1_tfprocod), 8, "%") ;
      lV62Tarticu_procesosds_3_tfprodsc = GXutil.padr( GXutil.rtrim( AV62Tarticu_procesosds_3_tfprodsc), 40, "%") ;
      lV64Tarticu_procesosds_5_tfprousera = GXutil.padr( GXutil.rtrim( AV64Tarticu_procesosds_5_tfprousera), 10, "%") ;
      lV67Tarticu_procesosds_8_tfprouserm = GXutil.padr( GXutil.rtrim( AV67Tarticu_procesosds_8_tfprouserm), 10, "%") ;
      /* Using cursor P0A9F5 */
      pr_default.execute(3, new Object[] {AV51Emprcod, Integer.valueOf(AV52Clicod), AV53ArtCod, lV60Tarticu_procesosds_1_tfprocod, AV61Tarticu_procesosds_2_tfprocod_sel, lV62Tarticu_procesosds_3_tfprodsc, AV63Tarticu_procesosds_4_tfprodsc_sel, lV64Tarticu_procesosds_5_tfprousera, AV65Tarticu_procesosds_6_tfprousera_sel, AV66Tarticu_procesosds_7_tfprofeca, lV67Tarticu_procesosds_8_tfprouserm, AV68Tarticu_procesosds_9_tfprouserm_sel, AV69Tarticu_procesosds_10_tfprofecm});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brkA9F8 = false ;
         A396EmprCod = P0A9F5_A396EmprCod[0] ;
         A252CliCod = P0A9F5_A252CliCod[0] ;
         A65ArtCod = P0A9F5_A65ArtCod[0] ;
         A10555ProUserM = P0A9F5_A10555ProUserM[0] ;
         A10556ProFecM = P0A9F5_A10556ProFecM[0] ;
         A10554ProFecA = P0A9F5_A10554ProFecA[0] ;
         A10553ProUserA = P0A9F5_A10553ProUserA[0] ;
         A759ProDsc = P0A9F5_A759ProDsc[0] ;
         A758ProCod = P0A9F5_A758ProCod[0] ;
         A759ProDsc = P0A9F5_A759ProDsc[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P0A9F5_A10555ProUserM[0], A10555ProUserM) == 0 ) )
         {
            brkA9F8 = false ;
            A396EmprCod = P0A9F5_A396EmprCod[0] ;
            A252CliCod = P0A9F5_A252CliCod[0] ;
            A65ArtCod = P0A9F5_A65ArtCod[0] ;
            A758ProCod = P0A9F5_A758ProCod[0] ;
            AV28count = (long)(AV28count+1) ;
            brkA9F8 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A10555ProUserM)==0) )
         {
            AV23Option = A10555ProUserM ;
            AV24Options.add(AV23Option, 0);
            AV27OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV24Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkA9F8 )
         {
            brkA9F8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tarticu_procesosgetfilterdata.this.AV37OptionsJson;
      this.aP4[0] = tarticu_procesosgetfilterdata.this.AV38OptionsDescJson;
      this.aP5[0] = tarticu_procesosgetfilterdata.this.AV39OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV37OptionsJson = "" ;
      AV38OptionsDescJson = "" ;
      AV39OptionIndexesJson = "" ;
      AV24Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV26OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV27OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV29Session = httpContext.getWebSession();
      AV31GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV32GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV41TFProCod = "" ;
      AV42TFProCod_Sel = "" ;
      AV43TFProDsc = "" ;
      AV44TFProDsc_Sel = "" ;
      AV45TFProUserA = "" ;
      AV46TFProUserA_Sel = "" ;
      AV47TFProFecA = GXutil.resetTime( GXutil.nullDate() );
      AV48TFProUserM = "" ;
      AV49TFProUserM_Sel = "" ;
      AV50TFProFecM = GXutil.resetTime( GXutil.nullDate() );
      AV51Emprcod = "" ;
      AV55CliNom = "" ;
      AV53ArtCod = "" ;
      AV54ARtDsc = "" ;
      A758ProCod = "" ;
      AV60Tarticu_procesosds_1_tfprocod = "" ;
      AV61Tarticu_procesosds_2_tfprocod_sel = "" ;
      AV62Tarticu_procesosds_3_tfprodsc = "" ;
      AV63Tarticu_procesosds_4_tfprodsc_sel = "" ;
      AV64Tarticu_procesosds_5_tfprousera = "" ;
      AV65Tarticu_procesosds_6_tfprousera_sel = "" ;
      AV66Tarticu_procesosds_7_tfprofeca = GXutil.resetTime( GXutil.nullDate() );
      AV67Tarticu_procesosds_8_tfprouserm = "" ;
      AV68Tarticu_procesosds_9_tfprouserm_sel = "" ;
      AV69Tarticu_procesosds_10_tfprofecm = GXutil.resetTime( GXutil.nullDate() );
      scmdbuf = "" ;
      lV60Tarticu_procesosds_1_tfprocod = "" ;
      lV62Tarticu_procesosds_3_tfprodsc = "" ;
      lV64Tarticu_procesosds_5_tfprousera = "" ;
      lV67Tarticu_procesosds_8_tfprouserm = "" ;
      A759ProDsc = "" ;
      A10553ProUserA = "" ;
      A10554ProFecA = GXutil.resetTime( GXutil.nullDate() );
      A10555ProUserM = "" ;
      A10556ProFecM = GXutil.resetTime( GXutil.nullDate() );
      A396EmprCod = "" ;
      A65ArtCod = "" ;
      P0A9F2_A65ArtCod = new String[] {""} ;
      P0A9F2_A252CliCod = new int[1] ;
      P0A9F2_A396EmprCod = new String[] {""} ;
      P0A9F2_A758ProCod = new String[] {""} ;
      P0A9F2_A10556ProFecM = new java.util.Date[] {GXutil.nullDate()} ;
      P0A9F2_A10555ProUserM = new String[] {""} ;
      P0A9F2_A10554ProFecA = new java.util.Date[] {GXutil.nullDate()} ;
      P0A9F2_A10553ProUserA = new String[] {""} ;
      P0A9F2_A759ProDsc = new String[] {""} ;
      AV23Option = "" ;
      P0A9F3_A758ProCod = new String[] {""} ;
      P0A9F3_A396EmprCod = new String[] {""} ;
      P0A9F3_A65ArtCod = new String[] {""} ;
      P0A9F3_A252CliCod = new int[1] ;
      P0A9F3_A10556ProFecM = new java.util.Date[] {GXutil.nullDate()} ;
      P0A9F3_A10555ProUserM = new String[] {""} ;
      P0A9F3_A10554ProFecA = new java.util.Date[] {GXutil.nullDate()} ;
      P0A9F3_A10553ProUserA = new String[] {""} ;
      P0A9F3_A759ProDsc = new String[] {""} ;
      P0A9F4_A396EmprCod = new String[] {""} ;
      P0A9F4_A252CliCod = new int[1] ;
      P0A9F4_A65ArtCod = new String[] {""} ;
      P0A9F4_A10553ProUserA = new String[] {""} ;
      P0A9F4_A10556ProFecM = new java.util.Date[] {GXutil.nullDate()} ;
      P0A9F4_A10555ProUserM = new String[] {""} ;
      P0A9F4_A10554ProFecA = new java.util.Date[] {GXutil.nullDate()} ;
      P0A9F4_A759ProDsc = new String[] {""} ;
      P0A9F4_A758ProCod = new String[] {""} ;
      P0A9F5_A396EmprCod = new String[] {""} ;
      P0A9F5_A252CliCod = new int[1] ;
      P0A9F5_A65ArtCod = new String[] {""} ;
      P0A9F5_A10555ProUserM = new String[] {""} ;
      P0A9F5_A10556ProFecM = new java.util.Date[] {GXutil.nullDate()} ;
      P0A9F5_A10554ProFecA = new java.util.Date[] {GXutil.nullDate()} ;
      P0A9F5_A10553ProUserA = new String[] {""} ;
      P0A9F5_A759ProDsc = new String[] {""} ;
      P0A9F5_A758ProCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tarticu_procesosgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0A9F2_A65ArtCod, P0A9F2_A252CliCod, P0A9F2_A396EmprCod, P0A9F2_A758ProCod, P0A9F2_A10556ProFecM, P0A9F2_A10555ProUserM, P0A9F2_A10554ProFecA, P0A9F2_A10553ProUserA, P0A9F2_A759ProDsc
            }
            , new Object[] {
            P0A9F3_A758ProCod, P0A9F3_A396EmprCod, P0A9F3_A65ArtCod, P0A9F3_A252CliCod, P0A9F3_A10556ProFecM, P0A9F3_A10555ProUserM, P0A9F3_A10554ProFecA, P0A9F3_A10553ProUserA, P0A9F3_A759ProDsc
            }
            , new Object[] {
            P0A9F4_A396EmprCod, P0A9F4_A252CliCod, P0A9F4_A65ArtCod, P0A9F4_A10553ProUserA, P0A9F4_A10556ProFecM, P0A9F4_A10555ProUserM, P0A9F4_A10554ProFecA, P0A9F4_A759ProDsc, P0A9F4_A758ProCod
            }
            , new Object[] {
            P0A9F5_A396EmprCod, P0A9F5_A252CliCod, P0A9F5_A65ArtCod, P0A9F5_A10555ProUserM, P0A9F5_A10556ProFecM, P0A9F5_A10554ProFecA, P0A9F5_A10553ProUserA, P0A9F5_A759ProDsc, P0A9F5_A758ProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV58GXV1 ;
   private int AV52Clicod ;
   private int A252CliCod ;
   private int AV22InsertIndex ;
   private long AV28count ;
   private String AV41TFProCod ;
   private String AV42TFProCod_Sel ;
   private String AV43TFProDsc ;
   private String AV44TFProDsc_Sel ;
   private String AV45TFProUserA ;
   private String AV46TFProUserA_Sel ;
   private String AV48TFProUserM ;
   private String AV49TFProUserM_Sel ;
   private String AV51Emprcod ;
   private String AV55CliNom ;
   private String AV53ArtCod ;
   private String AV54ARtDsc ;
   private String A758ProCod ;
   private String AV60Tarticu_procesosds_1_tfprocod ;
   private String AV61Tarticu_procesosds_2_tfprocod_sel ;
   private String AV62Tarticu_procesosds_3_tfprodsc ;
   private String AV63Tarticu_procesosds_4_tfprodsc_sel ;
   private String AV64Tarticu_procesosds_5_tfprousera ;
   private String AV65Tarticu_procesosds_6_tfprousera_sel ;
   private String AV67Tarticu_procesosds_8_tfprouserm ;
   private String AV68Tarticu_procesosds_9_tfprouserm_sel ;
   private String scmdbuf ;
   private String lV60Tarticu_procesosds_1_tfprocod ;
   private String lV62Tarticu_procesosds_3_tfprodsc ;
   private String lV64Tarticu_procesosds_5_tfprousera ;
   private String lV67Tarticu_procesosds_8_tfprouserm ;
   private String A759ProDsc ;
   private String A10553ProUserA ;
   private String A10555ProUserM ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private java.util.Date AV47TFProFecA ;
   private java.util.Date AV50TFProFecM ;
   private java.util.Date AV66Tarticu_procesosds_7_tfprofeca ;
   private java.util.Date AV69Tarticu_procesosds_10_tfprofecm ;
   private java.util.Date A10554ProFecA ;
   private java.util.Date A10556ProFecM ;
   private boolean returnInSub ;
   private boolean brkA9F2 ;
   private boolean brkA9F4 ;
   private boolean brkA9F6 ;
   private boolean brkA9F8 ;
   private String AV37OptionsJson ;
   private String AV38OptionsDescJson ;
   private String AV39OptionIndexesJson ;
   private String AV34DDOName ;
   private String AV35SearchTxt ;
   private String AV36SearchTxtTo ;
   private String AV23Option ;
   private com.genexus.webpanels.WebSession AV29Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A9F2_A65ArtCod ;
   private int[] P0A9F2_A252CliCod ;
   private String[] P0A9F2_A396EmprCod ;
   private String[] P0A9F2_A758ProCod ;
   private java.util.Date[] P0A9F2_A10556ProFecM ;
   private String[] P0A9F2_A10555ProUserM ;
   private java.util.Date[] P0A9F2_A10554ProFecA ;
   private String[] P0A9F2_A10553ProUserA ;
   private String[] P0A9F2_A759ProDsc ;
   private String[] P0A9F3_A758ProCod ;
   private String[] P0A9F3_A396EmprCod ;
   private String[] P0A9F3_A65ArtCod ;
   private int[] P0A9F3_A252CliCod ;
   private java.util.Date[] P0A9F3_A10556ProFecM ;
   private String[] P0A9F3_A10555ProUserM ;
   private java.util.Date[] P0A9F3_A10554ProFecA ;
   private String[] P0A9F3_A10553ProUserA ;
   private String[] P0A9F3_A759ProDsc ;
   private String[] P0A9F4_A396EmprCod ;
   private int[] P0A9F4_A252CliCod ;
   private String[] P0A9F4_A65ArtCod ;
   private String[] P0A9F4_A10553ProUserA ;
   private java.util.Date[] P0A9F4_A10556ProFecM ;
   private String[] P0A9F4_A10555ProUserM ;
   private java.util.Date[] P0A9F4_A10554ProFecA ;
   private String[] P0A9F4_A759ProDsc ;
   private String[] P0A9F4_A758ProCod ;
   private String[] P0A9F5_A396EmprCod ;
   private int[] P0A9F5_A252CliCod ;
   private String[] P0A9F5_A65ArtCod ;
   private String[] P0A9F5_A10555ProUserM ;
   private java.util.Date[] P0A9F5_A10556ProFecM ;
   private java.util.Date[] P0A9F5_A10554ProFecA ;
   private String[] P0A9F5_A10553ProUserA ;
   private String[] P0A9F5_A759ProDsc ;
   private String[] P0A9F5_A758ProCod ;
   private GXSimpleCollection<String> AV24Options ;
   private GXSimpleCollection<String> AV26OptionsDesc ;
   private GXSimpleCollection<String> AV27OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV31GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV32GridStateFilterValue ;
}

final  class tarticu_procesosgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0A9F2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV61Tarticu_procesosds_2_tfprocod_sel ,
                                          String AV60Tarticu_procesosds_1_tfprocod ,
                                          String AV63Tarticu_procesosds_4_tfprodsc_sel ,
                                          String AV62Tarticu_procesosds_3_tfprodsc ,
                                          String AV65Tarticu_procesosds_6_tfprousera_sel ,
                                          String AV64Tarticu_procesosds_5_tfprousera ,
                                          java.util.Date AV66Tarticu_procesosds_7_tfprofeca ,
                                          String AV68Tarticu_procesosds_9_tfprouserm_sel ,
                                          String AV67Tarticu_procesosds_8_tfprouserm ,
                                          java.util.Date AV69Tarticu_procesosds_10_tfprofecm ,
                                          String A758ProCod ,
                                          String A759ProDsc ,
                                          String A10553ProUserA ,
                                          java.util.Date A10554ProFecA ,
                                          String A10555ProUserM ,
                                          java.util.Date A10556ProFecM ,
                                          String AV51Emprcod ,
                                          int AV52Clicod ,
                                          String AV53ArtCod ,
                                          String A396EmprCod ,
                                          int A252CliCod ,
                                          String A65ArtCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[13];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.ArtCod, T1.CliCod, T1.EmprCod, T1.ProCod, T1.ProFecM, T1.ProUserM, T1.ProFecA, T1.ProUserA, T2.ProDsc FROM (TXPARTLIN T1 INNER JOIN TXPPROCES T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.ProCod = T1.ProCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.CliCod = ? and T1.ArtCod = ?)");
      if ( (GXutil.strcmp("", AV61Tarticu_procesosds_2_tfprocod_sel)==0) && ( ! (GXutil.strcmp("", AV60Tarticu_procesosds_1_tfprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Tarticu_procesosds_2_tfprocod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProCod = ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Tarticu_procesosds_4_tfprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV62Tarticu_procesosds_3_tfprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Tarticu_procesosds_4_tfprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ProDsc = ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Tarticu_procesosds_6_tfprousera_sel)==0) && ( ! (GXutil.strcmp("", AV64Tarticu_procesosds_5_tfprousera)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProUserA) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Tarticu_procesosds_6_tfprousera_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProUserA = ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV66Tarticu_procesosds_7_tfprofeca) )
      {
         addWhere(sWhereString, "(T1.ProFecA >= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Tarticu_procesosds_9_tfprouserm_sel)==0) && ( ! (GXutil.strcmp("", AV67Tarticu_procesosds_8_tfprouserm)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProUserM) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Tarticu_procesosds_9_tfprouserm_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProUserM = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV69Tarticu_procesosds_10_tfprofecm) )
      {
         addWhere(sWhereString, "(T1.ProFecM >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod, T1.ProCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P0A9F3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV61Tarticu_procesosds_2_tfprocod_sel ,
                                          String AV60Tarticu_procesosds_1_tfprocod ,
                                          String AV63Tarticu_procesosds_4_tfprodsc_sel ,
                                          String AV62Tarticu_procesosds_3_tfprodsc ,
                                          String AV65Tarticu_procesosds_6_tfprousera_sel ,
                                          String AV64Tarticu_procesosds_5_tfprousera ,
                                          java.util.Date AV66Tarticu_procesosds_7_tfprofeca ,
                                          String AV68Tarticu_procesosds_9_tfprouserm_sel ,
                                          String AV67Tarticu_procesosds_8_tfprouserm ,
                                          java.util.Date AV69Tarticu_procesosds_10_tfprofecm ,
                                          String A758ProCod ,
                                          String A759ProDsc ,
                                          String A10553ProUserA ,
                                          java.util.Date A10554ProFecA ,
                                          String A10555ProUserM ,
                                          java.util.Date A10556ProFecM ,
                                          int A252CliCod ,
                                          int AV52Clicod ,
                                          String A65ArtCod ,
                                          String AV53ArtCod ,
                                          String AV51Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[13];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.ProCod, T1.EmprCod, T1.ArtCod, T1.CliCod, T1.ProFecM, T1.ProUserM, T1.ProFecA, T1.ProUserA, T2.ProDsc FROM (TXPARTLIN T1 INNER JOIN TXPPROCES T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.ProCod = T1.ProCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.CliCod = ?)");
      addWhere(sWhereString, "(T1.ArtCod = ?)");
      if ( (GXutil.strcmp("", AV61Tarticu_procesosds_2_tfprocod_sel)==0) && ( ! (GXutil.strcmp("", AV60Tarticu_procesosds_1_tfprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Tarticu_procesosds_2_tfprocod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProCod = ?)");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Tarticu_procesosds_4_tfprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV62Tarticu_procesosds_3_tfprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Tarticu_procesosds_4_tfprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ProDsc = ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Tarticu_procesosds_6_tfprousera_sel)==0) && ( ! (GXutil.strcmp("", AV64Tarticu_procesosds_5_tfprousera)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProUserA) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Tarticu_procesosds_6_tfprousera_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProUserA = ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV66Tarticu_procesosds_7_tfprofeca) )
      {
         addWhere(sWhereString, "(T1.ProFecA >= ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Tarticu_procesosds_9_tfprouserm_sel)==0) && ( ! (GXutil.strcmp("", AV67Tarticu_procesosds_8_tfprouserm)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProUserM) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Tarticu_procesosds_9_tfprouserm_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProUserM = ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV69Tarticu_procesosds_10_tfprofecm) )
      {
         addWhere(sWhereString, "(T1.ProFecM >= ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.ProCod" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P0A9F4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV61Tarticu_procesosds_2_tfprocod_sel ,
                                          String AV60Tarticu_procesosds_1_tfprocod ,
                                          String AV63Tarticu_procesosds_4_tfprodsc_sel ,
                                          String AV62Tarticu_procesosds_3_tfprodsc ,
                                          String AV65Tarticu_procesosds_6_tfprousera_sel ,
                                          String AV64Tarticu_procesosds_5_tfprousera ,
                                          java.util.Date AV66Tarticu_procesosds_7_tfprofeca ,
                                          String AV68Tarticu_procesosds_9_tfprouserm_sel ,
                                          String AV67Tarticu_procesosds_8_tfprouserm ,
                                          java.util.Date AV69Tarticu_procesosds_10_tfprofecm ,
                                          String A758ProCod ,
                                          String A759ProDsc ,
                                          String A10553ProUserA ,
                                          java.util.Date A10554ProFecA ,
                                          String A10555ProUserM ,
                                          java.util.Date A10556ProFecM ,
                                          String A396EmprCod ,
                                          String AV51Emprcod ,
                                          int A252CliCod ,
                                          int AV52Clicod ,
                                          String A65ArtCod ,
                                          String AV53ArtCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[13];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.CliCod, T1.ArtCod, T1.ProUserA, T1.ProFecM, T1.ProUserM, T1.ProFecA, T2.ProDsc, T1.ProCod FROM (TXPARTLIN T1 INNER JOIN TXPPROCES T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.ProCod = T1.ProCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.CliCod = ?)");
      addWhere(sWhereString, "(T1.ArtCod = ?)");
      if ( (GXutil.strcmp("", AV61Tarticu_procesosds_2_tfprocod_sel)==0) && ( ! (GXutil.strcmp("", AV60Tarticu_procesosds_1_tfprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Tarticu_procesosds_2_tfprocod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProCod = ?)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Tarticu_procesosds_4_tfprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV62Tarticu_procesosds_3_tfprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Tarticu_procesosds_4_tfprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ProDsc = ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Tarticu_procesosds_6_tfprousera_sel)==0) && ( ! (GXutil.strcmp("", AV64Tarticu_procesosds_5_tfprousera)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProUserA) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Tarticu_procesosds_6_tfprousera_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProUserA = ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV66Tarticu_procesosds_7_tfprofeca) )
      {
         addWhere(sWhereString, "(T1.ProFecA >= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Tarticu_procesosds_9_tfprouserm_sel)==0) && ( ! (GXutil.strcmp("", AV67Tarticu_procesosds_8_tfprouserm)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProUserM) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Tarticu_procesosds_9_tfprouserm_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProUserM = ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV69Tarticu_procesosds_10_tfprofecm) )
      {
         addWhere(sWhereString, "(T1.ProFecM >= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ProUserA" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P0A9F5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV61Tarticu_procesosds_2_tfprocod_sel ,
                                          String AV60Tarticu_procesosds_1_tfprocod ,
                                          String AV63Tarticu_procesosds_4_tfprodsc_sel ,
                                          String AV62Tarticu_procesosds_3_tfprodsc ,
                                          String AV65Tarticu_procesosds_6_tfprousera_sel ,
                                          String AV64Tarticu_procesosds_5_tfprousera ,
                                          java.util.Date AV66Tarticu_procesosds_7_tfprofeca ,
                                          String AV68Tarticu_procesosds_9_tfprouserm_sel ,
                                          String AV67Tarticu_procesosds_8_tfprouserm ,
                                          java.util.Date AV69Tarticu_procesosds_10_tfprofecm ,
                                          String A758ProCod ,
                                          String A759ProDsc ,
                                          String A10553ProUserA ,
                                          java.util.Date A10554ProFecA ,
                                          String A10555ProUserM ,
                                          java.util.Date A10556ProFecM ,
                                          String A396EmprCod ,
                                          String AV51Emprcod ,
                                          int A252CliCod ,
                                          int AV52Clicod ,
                                          String A65ArtCod ,
                                          String AV53ArtCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[13];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.CliCod, T1.ArtCod, T1.ProUserM, T1.ProFecM, T1.ProFecA, T1.ProUserA, T2.ProDsc, T1.ProCod FROM (TXPARTLIN T1 INNER JOIN TXPPROCES T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.ProCod = T1.ProCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.CliCod = ?)");
      addWhere(sWhereString, "(T1.ArtCod = ?)");
      if ( (GXutil.strcmp("", AV61Tarticu_procesosds_2_tfprocod_sel)==0) && ( ! (GXutil.strcmp("", AV60Tarticu_procesosds_1_tfprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Tarticu_procesosds_2_tfprocod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProCod = ?)");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Tarticu_procesosds_4_tfprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV62Tarticu_procesosds_3_tfprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Tarticu_procesosds_4_tfprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ProDsc = ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Tarticu_procesosds_6_tfprousera_sel)==0) && ( ! (GXutil.strcmp("", AV64Tarticu_procesosds_5_tfprousera)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProUserA) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Tarticu_procesosds_6_tfprousera_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProUserA = ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV66Tarticu_procesosds_7_tfprofeca) )
      {
         addWhere(sWhereString, "(T1.ProFecA >= ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Tarticu_procesosds_9_tfprouserm_sel)==0) && ( ! (GXutil.strcmp("", AV67Tarticu_procesosds_8_tfprouserm)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProUserM) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Tarticu_procesosds_9_tfprouserm_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProUserM = ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV69Tarticu_procesosds_10_tfprofecm) )
      {
         addWhere(sWhereString, "(T1.ProFecM >= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ProUserM" ;
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
                  return conditional_P0A9F2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.util.Date)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (String)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] );
            case 1 :
                  return conditional_P0A9F3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.util.Date)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (String)dynConstraints[14] , (java.util.Date)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] );
            case 2 :
                  return conditional_P0A9F4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.util.Date)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (String)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] );
            case 3 :
                  return conditional_P0A9F5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.util.Date)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (String)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A9F2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A9F3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A9F4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A9F5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 10);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 10);
               ((String[]) buf[8])[0] = rslt.getString(9, 40);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 10);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 10);
               ((String[]) buf[8])[0] = rslt.getString(9, 40);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 10);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 40);
               ((String[]) buf[8])[0] = rslt.getString(9, 8);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 10);
               ((String[]) buf[7])[0] = rslt.getString(8, 40);
               ((String[]) buf[8])[0] = rslt.getString(9, 8);
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
                  stmt.setString(sIdx, (String)parms[13], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[14]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 40);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 40);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 10);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 10);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[22], false);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 10);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 10);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[25], false);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[14]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 40);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 40);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 10);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 10);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[22], false);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 10);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 10);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[25], false);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[14]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 40);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 40);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 10);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 10);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[22], false);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 10);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 10);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[25], false);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[14]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 40);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 40);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 10);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 10);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[22], false);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 10);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 10);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[25], false);
               }
               return;
      }
   }

}

