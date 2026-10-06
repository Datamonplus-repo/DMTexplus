package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tdevcruwwgetfilterdata extends GXProcedure
{
   public tdevcruwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tdevcruwwgetfilterdata.class ), "" );
   }

   public tdevcruwwgetfilterdata( int remoteHandle ,
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
      tdevcruwwgetfilterdata.this.aP5 = new String[] {""};
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
      tdevcruwwgetfilterdata.this.AV32DDOName = aP0;
      tdevcruwwgetfilterdata.this.AV30SearchTxt = aP1;
      tdevcruwwgetfilterdata.this.AV31SearchTxtTo = aP2;
      tdevcruwwgetfilterdata.this.aP3 = aP3;
      tdevcruwwgetfilterdata.this.aP4 = aP4;
      tdevcruwwgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_CLINOM") == 0 )
      {
         /* Execute user subroutine: 'LOADCLINOMOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_TRNNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADTRNNOMOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_DEVCRUMAT") == 0 )
      {
         /* Execute user subroutine: 'LOADDEVCRUMATOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_DEVCRUOBS") == 0 )
      {
         /* Execute user subroutine: 'LOADDEVCRUOBSOPTIONS' */
         S151 ();
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
      if ( GXutil.strcmp(AV43Session.getValue("TDEVCRUWWGridState"), "") == 0 )
      {
         AV45GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TDEVCRUWWGridState"), null, null);
      }
      else
      {
         AV45GridState.fromxml(AV43Session.getValue("TDEVCRUWWGridState"), null, null);
      }
      AV68GXV1 = 1 ;
      while ( AV68GXV1 <= AV45GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV46GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV45GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV68GXV1));
         if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV65FilterFullText = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUID") == 0 )
         {
            AV10TFDevCruId = (int)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFDevCruId_To = (int)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUFEC") == 0 )
         {
            AV12TFDevCruFec = localUtil.ctod( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUSAL") == 0 )
         {
            AV24TFDevCruSal = localUtil.ctot( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV16TFCliNom = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV17TFCliNom_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNNOM") == 0 )
         {
            AV20TFTrnNom = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNNOM_SEL") == 0 )
         {
            AV21TFTrnNom_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUMAT") == 0 )
         {
            AV22TFDevCruMat = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUMAT_SEL") == 0 )
         {
            AV23TFDevCruMat_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUOBS") == 0 )
         {
            AV28TFDevCruObs = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUOBS_SEL") == 0 )
         {
            AV29TFDevCruObs_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV68GXV1 = (int)(AV68GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV16TFCliNom = AV30SearchTxt ;
      AV17TFCliNom_Sel = "" ;
      AV70Tdevcruwwds_1_filterfulltext = AV65FilterFullText ;
      AV71Tdevcruwwds_2_tfdevcruid = AV10TFDevCruId ;
      AV72Tdevcruwwds_3_tfdevcruid_to = AV11TFDevCruId_To ;
      AV73Tdevcruwwds_4_tfdevcrufec = AV12TFDevCruFec ;
      AV74Tdevcruwwds_5_tfdevcrusal = AV24TFDevCruSal ;
      AV75Tdevcruwwds_6_tfclinom = AV16TFCliNom ;
      AV76Tdevcruwwds_7_tfclinom_sel = AV17TFCliNom_Sel ;
      AV77Tdevcruwwds_8_tftrnnom = AV20TFTrnNom ;
      AV78Tdevcruwwds_9_tftrnnom_sel = AV21TFTrnNom_Sel ;
      AV79Tdevcruwwds_10_tfdevcrumat = AV22TFDevCruMat ;
      AV80Tdevcruwwds_11_tfdevcrumat_sel = AV23TFDevCruMat_Sel ;
      AV81Tdevcruwwds_12_tfdevcruobs = AV28TFDevCruObs ;
      AV82Tdevcruwwds_13_tfdevcruobs_sel = AV29TFDevCruObs_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV70Tdevcruwwds_1_filterfulltext ,
                                           Integer.valueOf(AV71Tdevcruwwds_2_tfdevcruid) ,
                                           Integer.valueOf(AV72Tdevcruwwds_3_tfdevcruid_to) ,
                                           AV73Tdevcruwwds_4_tfdevcrufec ,
                                           AV74Tdevcruwwds_5_tfdevcrusal ,
                                           AV76Tdevcruwwds_7_tfclinom_sel ,
                                           AV75Tdevcruwwds_6_tfclinom ,
                                           AV78Tdevcruwwds_9_tftrnnom_sel ,
                                           AV77Tdevcruwwds_8_tftrnnom ,
                                           AV80Tdevcruwwds_11_tfdevcrumat_sel ,
                                           AV79Tdevcruwwds_10_tfdevcrumat ,
                                           AV82Tdevcruwwds_13_tfdevcruobs_sel ,
                                           AV81Tdevcruwwds_12_tfdevcruobs ,
                                           Integer.valueOf(A11669DevCruId) ,
                                           A279CliNom ,
                                           A841TrnNom ,
                                           A11672DevCruMat ,
                                           A11682DevCruObs ,
                                           A11670DevCruFec ,
                                           A11673DevCruSal } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.DATE
                                           }
      });
      lV70Tdevcruwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Tdevcruwwds_1_filterfulltext), "%", "") ;
      lV70Tdevcruwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Tdevcruwwds_1_filterfulltext), "%", "") ;
      lV70Tdevcruwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Tdevcruwwds_1_filterfulltext), "%", "") ;
      lV70Tdevcruwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Tdevcruwwds_1_filterfulltext), "%", "") ;
      lV70Tdevcruwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Tdevcruwwds_1_filterfulltext), "%", "") ;
      lV75Tdevcruwwds_6_tfclinom = GXutil.padr( GXutil.rtrim( AV75Tdevcruwwds_6_tfclinom), 30, "%") ;
      lV77Tdevcruwwds_8_tftrnnom = GXutil.padr( GXutil.rtrim( AV77Tdevcruwwds_8_tftrnnom), 30, "%") ;
      lV79Tdevcruwwds_10_tfdevcrumat = GXutil.padr( GXutil.rtrim( AV79Tdevcruwwds_10_tfdevcrumat), 20, "%") ;
      lV81Tdevcruwwds_12_tfdevcruobs = GXutil.concat( GXutil.rtrim( AV81Tdevcruwwds_12_tfdevcruobs), "%", "") ;
      /* Using cursor P086R2 */
      pr_default.execute(0, new Object[] {lV70Tdevcruwwds_1_filterfulltext, lV70Tdevcruwwds_1_filterfulltext, lV70Tdevcruwwds_1_filterfulltext, lV70Tdevcruwwds_1_filterfulltext, lV70Tdevcruwwds_1_filterfulltext, Integer.valueOf(AV71Tdevcruwwds_2_tfdevcruid), Integer.valueOf(AV72Tdevcruwwds_3_tfdevcruid_to), AV73Tdevcruwwds_4_tfdevcrufec, AV74Tdevcruwwds_5_tfdevcrusal, lV75Tdevcruwwds_6_tfclinom, AV76Tdevcruwwds_7_tfclinom_sel, lV77Tdevcruwwds_8_tftrnnom, AV78Tdevcruwwds_9_tftrnnom_sel, lV79Tdevcruwwds_10_tfdevcrumat, AV80Tdevcruwwds_11_tfdevcrumat_sel, lV81Tdevcruwwds_12_tfdevcruobs, AV82Tdevcruwwds_13_tfdevcruobs_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk86R2 = false ;
         A396EmprCod = P086R2_A396EmprCod[0] ;
         A252CliCod = P086R2_A252CliCod[0] ;
         A840TrnCod = P086R2_A840TrnCod[0] ;
         n840TrnCod = P086R2_n840TrnCod[0] ;
         A279CliNom = P086R2_A279CliNom[0] ;
         A11682DevCruObs = P086R2_A11682DevCruObs[0] ;
         A11672DevCruMat = P086R2_A11672DevCruMat[0] ;
         A841TrnNom = P086R2_A841TrnNom[0] ;
         n841TrnNom = P086R2_n841TrnNom[0] ;
         A11673DevCruSal = P086R2_A11673DevCruSal[0] ;
         A11670DevCruFec = P086R2_A11670DevCruFec[0] ;
         A11669DevCruId = P086R2_A11669DevCruId[0] ;
         A279CliNom = P086R2_A279CliNom[0] ;
         A841TrnNom = P086R2_A841TrnNom[0] ;
         n841TrnNom = P086R2_n841TrnNom[0] ;
         AV42count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P086R2_A279CliNom[0], A279CliNom) == 0 ) )
         {
            brk86R2 = false ;
            A396EmprCod = P086R2_A396EmprCod[0] ;
            A252CliCod = P086R2_A252CliCod[0] ;
            A11669DevCruId = P086R2_A11669DevCruId[0] ;
            AV42count = (long)(AV42count+1) ;
            brk86R2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A279CliNom)==0) )
         {
            AV34Option = A279CliNom ;
            AV35Options.add(AV34Option, 0);
            AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV35Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk86R2 )
         {
            brk86R2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADTRNNOMOPTIONS' Routine */
      returnInSub = false ;
      AV20TFTrnNom = AV30SearchTxt ;
      AV21TFTrnNom_Sel = "" ;
      AV70Tdevcruwwds_1_filterfulltext = AV65FilterFullText ;
      AV71Tdevcruwwds_2_tfdevcruid = AV10TFDevCruId ;
      AV72Tdevcruwwds_3_tfdevcruid_to = AV11TFDevCruId_To ;
      AV73Tdevcruwwds_4_tfdevcrufec = AV12TFDevCruFec ;
      AV74Tdevcruwwds_5_tfdevcrusal = AV24TFDevCruSal ;
      AV75Tdevcruwwds_6_tfclinom = AV16TFCliNom ;
      AV76Tdevcruwwds_7_tfclinom_sel = AV17TFCliNom_Sel ;
      AV77Tdevcruwwds_8_tftrnnom = AV20TFTrnNom ;
      AV78Tdevcruwwds_9_tftrnnom_sel = AV21TFTrnNom_Sel ;
      AV79Tdevcruwwds_10_tfdevcrumat = AV22TFDevCruMat ;
      AV80Tdevcruwwds_11_tfdevcrumat_sel = AV23TFDevCruMat_Sel ;
      AV81Tdevcruwwds_12_tfdevcruobs = AV28TFDevCruObs ;
      AV82Tdevcruwwds_13_tfdevcruobs_sel = AV29TFDevCruObs_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV70Tdevcruwwds_1_filterfulltext ,
                                           Integer.valueOf(AV71Tdevcruwwds_2_tfdevcruid) ,
                                           Integer.valueOf(AV72Tdevcruwwds_3_tfdevcruid_to) ,
                                           AV73Tdevcruwwds_4_tfdevcrufec ,
                                           AV74Tdevcruwwds_5_tfdevcrusal ,
                                           AV76Tdevcruwwds_7_tfclinom_sel ,
                                           AV75Tdevcruwwds_6_tfclinom ,
                                           AV78Tdevcruwwds_9_tftrnnom_sel ,
                                           AV77Tdevcruwwds_8_tftrnnom ,
                                           AV80Tdevcruwwds_11_tfdevcrumat_sel ,
                                           AV79Tdevcruwwds_10_tfdevcrumat ,
                                           AV82Tdevcruwwds_13_tfdevcruobs_sel ,
                                           AV81Tdevcruwwds_12_tfdevcruobs ,
                                           Integer.valueOf(A11669DevCruId) ,
                                           A279CliNom ,
                                           A841TrnNom ,
                                           A11672DevCruMat ,
                                           A11682DevCruObs ,
                                           A11670DevCruFec ,
                                           A11673DevCruSal } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.DATE
                                           }
      });
      lV70Tdevcruwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Tdevcruwwds_1_filterfulltext), "%", "") ;
      lV70Tdevcruwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Tdevcruwwds_1_filterfulltext), "%", "") ;
      lV70Tdevcruwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Tdevcruwwds_1_filterfulltext), "%", "") ;
      lV70Tdevcruwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Tdevcruwwds_1_filterfulltext), "%", "") ;
      lV70Tdevcruwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Tdevcruwwds_1_filterfulltext), "%", "") ;
      lV75Tdevcruwwds_6_tfclinom = GXutil.padr( GXutil.rtrim( AV75Tdevcruwwds_6_tfclinom), 30, "%") ;
      lV77Tdevcruwwds_8_tftrnnom = GXutil.padr( GXutil.rtrim( AV77Tdevcruwwds_8_tftrnnom), 30, "%") ;
      lV79Tdevcruwwds_10_tfdevcrumat = GXutil.padr( GXutil.rtrim( AV79Tdevcruwwds_10_tfdevcrumat), 20, "%") ;
      lV81Tdevcruwwds_12_tfdevcruobs = GXutil.concat( GXutil.rtrim( AV81Tdevcruwwds_12_tfdevcruobs), "%", "") ;
      /* Using cursor P086R3 */
      pr_default.execute(1, new Object[] {lV70Tdevcruwwds_1_filterfulltext, lV70Tdevcruwwds_1_filterfulltext, lV70Tdevcruwwds_1_filterfulltext, lV70Tdevcruwwds_1_filterfulltext, lV70Tdevcruwwds_1_filterfulltext, Integer.valueOf(AV71Tdevcruwwds_2_tfdevcruid), Integer.valueOf(AV72Tdevcruwwds_3_tfdevcruid_to), AV73Tdevcruwwds_4_tfdevcrufec, AV74Tdevcruwwds_5_tfdevcrusal, lV75Tdevcruwwds_6_tfclinom, AV76Tdevcruwwds_7_tfclinom_sel, lV77Tdevcruwwds_8_tftrnnom, AV78Tdevcruwwds_9_tftrnnom_sel, lV79Tdevcruwwds_10_tfdevcrumat, AV80Tdevcruwwds_11_tfdevcrumat_sel, lV81Tdevcruwwds_12_tfdevcruobs, AV82Tdevcruwwds_13_tfdevcruobs_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk86R4 = false ;
         A252CliCod = P086R3_A252CliCod[0] ;
         A840TrnCod = P086R3_A840TrnCod[0] ;
         n840TrnCod = P086R3_n840TrnCod[0] ;
         A396EmprCod = P086R3_A396EmprCod[0] ;
         A11682DevCruObs = P086R3_A11682DevCruObs[0] ;
         A11672DevCruMat = P086R3_A11672DevCruMat[0] ;
         A841TrnNom = P086R3_A841TrnNom[0] ;
         n841TrnNom = P086R3_n841TrnNom[0] ;
         A279CliNom = P086R3_A279CliNom[0] ;
         A11673DevCruSal = P086R3_A11673DevCruSal[0] ;
         A11670DevCruFec = P086R3_A11670DevCruFec[0] ;
         A11669DevCruId = P086R3_A11669DevCruId[0] ;
         A279CliNom = P086R3_A279CliNom[0] ;
         A841TrnNom = P086R3_A841TrnNom[0] ;
         n841TrnNom = P086R3_n841TrnNom[0] ;
         AV42count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P086R3_A396EmprCod[0], A396EmprCod) == 0 ) && ( P086R3_A840TrnCod[0] == A840TrnCod ) )
         {
            brk86R4 = false ;
            A11669DevCruId = P086R3_A11669DevCruId[0] ;
            AV42count = (long)(AV42count+1) ;
            brk86R4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A841TrnNom)==0) )
         {
            AV34Option = A841TrnNom ;
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
         if ( ! brk86R4 )
         {
            brk86R4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADDEVCRUMATOPTIONS' Routine */
      returnInSub = false ;
      AV22TFDevCruMat = AV30SearchTxt ;
      AV23TFDevCruMat_Sel = "" ;
      AV70Tdevcruwwds_1_filterfulltext = AV65FilterFullText ;
      AV71Tdevcruwwds_2_tfdevcruid = AV10TFDevCruId ;
      AV72Tdevcruwwds_3_tfdevcruid_to = AV11TFDevCruId_To ;
      AV73Tdevcruwwds_4_tfdevcrufec = AV12TFDevCruFec ;
      AV74Tdevcruwwds_5_tfdevcrusal = AV24TFDevCruSal ;
      AV75Tdevcruwwds_6_tfclinom = AV16TFCliNom ;
      AV76Tdevcruwwds_7_tfclinom_sel = AV17TFCliNom_Sel ;
      AV77Tdevcruwwds_8_tftrnnom = AV20TFTrnNom ;
      AV78Tdevcruwwds_9_tftrnnom_sel = AV21TFTrnNom_Sel ;
      AV79Tdevcruwwds_10_tfdevcrumat = AV22TFDevCruMat ;
      AV80Tdevcruwwds_11_tfdevcrumat_sel = AV23TFDevCruMat_Sel ;
      AV81Tdevcruwwds_12_tfdevcruobs = AV28TFDevCruObs ;
      AV82Tdevcruwwds_13_tfdevcruobs_sel = AV29TFDevCruObs_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV70Tdevcruwwds_1_filterfulltext ,
                                           Integer.valueOf(AV71Tdevcruwwds_2_tfdevcruid) ,
                                           Integer.valueOf(AV72Tdevcruwwds_3_tfdevcruid_to) ,
                                           AV73Tdevcruwwds_4_tfdevcrufec ,
                                           AV74Tdevcruwwds_5_tfdevcrusal ,
                                           AV76Tdevcruwwds_7_tfclinom_sel ,
                                           AV75Tdevcruwwds_6_tfclinom ,
                                           AV78Tdevcruwwds_9_tftrnnom_sel ,
                                           AV77Tdevcruwwds_8_tftrnnom ,
                                           AV80Tdevcruwwds_11_tfdevcrumat_sel ,
                                           AV79Tdevcruwwds_10_tfdevcrumat ,
                                           AV82Tdevcruwwds_13_tfdevcruobs_sel ,
                                           AV81Tdevcruwwds_12_tfdevcruobs ,
                                           Integer.valueOf(A11669DevCruId) ,
                                           A279CliNom ,
                                           A841TrnNom ,
                                           A11672DevCruMat ,
                                           A11682DevCruObs ,
                                           A11670DevCruFec ,
                                           A11673DevCruSal } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.DATE
                                           }
      });
      lV70Tdevcruwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Tdevcruwwds_1_filterfulltext), "%", "") ;
      lV70Tdevcruwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Tdevcruwwds_1_filterfulltext), "%", "") ;
      lV70Tdevcruwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Tdevcruwwds_1_filterfulltext), "%", "") ;
      lV70Tdevcruwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Tdevcruwwds_1_filterfulltext), "%", "") ;
      lV70Tdevcruwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Tdevcruwwds_1_filterfulltext), "%", "") ;
      lV75Tdevcruwwds_6_tfclinom = GXutil.padr( GXutil.rtrim( AV75Tdevcruwwds_6_tfclinom), 30, "%") ;
      lV77Tdevcruwwds_8_tftrnnom = GXutil.padr( GXutil.rtrim( AV77Tdevcruwwds_8_tftrnnom), 30, "%") ;
      lV79Tdevcruwwds_10_tfdevcrumat = GXutil.padr( GXutil.rtrim( AV79Tdevcruwwds_10_tfdevcrumat), 20, "%") ;
      lV81Tdevcruwwds_12_tfdevcruobs = GXutil.concat( GXutil.rtrim( AV81Tdevcruwwds_12_tfdevcruobs), "%", "") ;
      /* Using cursor P086R4 */
      pr_default.execute(2, new Object[] {lV70Tdevcruwwds_1_filterfulltext, lV70Tdevcruwwds_1_filterfulltext, lV70Tdevcruwwds_1_filterfulltext, lV70Tdevcruwwds_1_filterfulltext, lV70Tdevcruwwds_1_filterfulltext, Integer.valueOf(AV71Tdevcruwwds_2_tfdevcruid), Integer.valueOf(AV72Tdevcruwwds_3_tfdevcruid_to), AV73Tdevcruwwds_4_tfdevcrufec, AV74Tdevcruwwds_5_tfdevcrusal, lV75Tdevcruwwds_6_tfclinom, AV76Tdevcruwwds_7_tfclinom_sel, lV77Tdevcruwwds_8_tftrnnom, AV78Tdevcruwwds_9_tftrnnom_sel, lV79Tdevcruwwds_10_tfdevcrumat, AV80Tdevcruwwds_11_tfdevcrumat_sel, lV81Tdevcruwwds_12_tfdevcruobs, AV82Tdevcruwwds_13_tfdevcruobs_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk86R6 = false ;
         A396EmprCod = P086R4_A396EmprCod[0] ;
         A252CliCod = P086R4_A252CliCod[0] ;
         A840TrnCod = P086R4_A840TrnCod[0] ;
         n840TrnCod = P086R4_n840TrnCod[0] ;
         A11672DevCruMat = P086R4_A11672DevCruMat[0] ;
         A11682DevCruObs = P086R4_A11682DevCruObs[0] ;
         A841TrnNom = P086R4_A841TrnNom[0] ;
         n841TrnNom = P086R4_n841TrnNom[0] ;
         A279CliNom = P086R4_A279CliNom[0] ;
         A11673DevCruSal = P086R4_A11673DevCruSal[0] ;
         A11670DevCruFec = P086R4_A11670DevCruFec[0] ;
         A11669DevCruId = P086R4_A11669DevCruId[0] ;
         A279CliNom = P086R4_A279CliNom[0] ;
         A841TrnNom = P086R4_A841TrnNom[0] ;
         n841TrnNom = P086R4_n841TrnNom[0] ;
         AV42count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P086R4_A11672DevCruMat[0], A11672DevCruMat) == 0 ) )
         {
            brk86R6 = false ;
            A396EmprCod = P086R4_A396EmprCod[0] ;
            A11669DevCruId = P086R4_A11669DevCruId[0] ;
            AV42count = (long)(AV42count+1) ;
            brk86R6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A11672DevCruMat)==0) )
         {
            AV34Option = A11672DevCruMat ;
            AV35Options.add(AV34Option, 0);
            AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV35Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk86R6 )
         {
            brk86R6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADDEVCRUOBSOPTIONS' Routine */
      returnInSub = false ;
      AV28TFDevCruObs = AV30SearchTxt ;
      AV29TFDevCruObs_Sel = "" ;
      AV70Tdevcruwwds_1_filterfulltext = AV65FilterFullText ;
      AV71Tdevcruwwds_2_tfdevcruid = AV10TFDevCruId ;
      AV72Tdevcruwwds_3_tfdevcruid_to = AV11TFDevCruId_To ;
      AV73Tdevcruwwds_4_tfdevcrufec = AV12TFDevCruFec ;
      AV74Tdevcruwwds_5_tfdevcrusal = AV24TFDevCruSal ;
      AV75Tdevcruwwds_6_tfclinom = AV16TFCliNom ;
      AV76Tdevcruwwds_7_tfclinom_sel = AV17TFCliNom_Sel ;
      AV77Tdevcruwwds_8_tftrnnom = AV20TFTrnNom ;
      AV78Tdevcruwwds_9_tftrnnom_sel = AV21TFTrnNom_Sel ;
      AV79Tdevcruwwds_10_tfdevcrumat = AV22TFDevCruMat ;
      AV80Tdevcruwwds_11_tfdevcrumat_sel = AV23TFDevCruMat_Sel ;
      AV81Tdevcruwwds_12_tfdevcruobs = AV28TFDevCruObs ;
      AV82Tdevcruwwds_13_tfdevcruobs_sel = AV29TFDevCruObs_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV70Tdevcruwwds_1_filterfulltext ,
                                           Integer.valueOf(AV71Tdevcruwwds_2_tfdevcruid) ,
                                           Integer.valueOf(AV72Tdevcruwwds_3_tfdevcruid_to) ,
                                           AV73Tdevcruwwds_4_tfdevcrufec ,
                                           AV74Tdevcruwwds_5_tfdevcrusal ,
                                           AV76Tdevcruwwds_7_tfclinom_sel ,
                                           AV75Tdevcruwwds_6_tfclinom ,
                                           AV78Tdevcruwwds_9_tftrnnom_sel ,
                                           AV77Tdevcruwwds_8_tftrnnom ,
                                           AV80Tdevcruwwds_11_tfdevcrumat_sel ,
                                           AV79Tdevcruwwds_10_tfdevcrumat ,
                                           AV82Tdevcruwwds_13_tfdevcruobs_sel ,
                                           AV81Tdevcruwwds_12_tfdevcruobs ,
                                           Integer.valueOf(A11669DevCruId) ,
                                           A279CliNom ,
                                           A841TrnNom ,
                                           A11672DevCruMat ,
                                           A11682DevCruObs ,
                                           A11670DevCruFec ,
                                           A11673DevCruSal } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.DATE
                                           }
      });
      lV70Tdevcruwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Tdevcruwwds_1_filterfulltext), "%", "") ;
      lV70Tdevcruwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Tdevcruwwds_1_filterfulltext), "%", "") ;
      lV70Tdevcruwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Tdevcruwwds_1_filterfulltext), "%", "") ;
      lV70Tdevcruwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Tdevcruwwds_1_filterfulltext), "%", "") ;
      lV70Tdevcruwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Tdevcruwwds_1_filterfulltext), "%", "") ;
      lV75Tdevcruwwds_6_tfclinom = GXutil.padr( GXutil.rtrim( AV75Tdevcruwwds_6_tfclinom), 30, "%") ;
      lV77Tdevcruwwds_8_tftrnnom = GXutil.padr( GXutil.rtrim( AV77Tdevcruwwds_8_tftrnnom), 30, "%") ;
      lV79Tdevcruwwds_10_tfdevcrumat = GXutil.padr( GXutil.rtrim( AV79Tdevcruwwds_10_tfdevcrumat), 20, "%") ;
      lV81Tdevcruwwds_12_tfdevcruobs = GXutil.concat( GXutil.rtrim( AV81Tdevcruwwds_12_tfdevcruobs), "%", "") ;
      /* Using cursor P086R5 */
      pr_default.execute(3, new Object[] {lV70Tdevcruwwds_1_filterfulltext, lV70Tdevcruwwds_1_filterfulltext, lV70Tdevcruwwds_1_filterfulltext, lV70Tdevcruwwds_1_filterfulltext, lV70Tdevcruwwds_1_filterfulltext, Integer.valueOf(AV71Tdevcruwwds_2_tfdevcruid), Integer.valueOf(AV72Tdevcruwwds_3_tfdevcruid_to), AV73Tdevcruwwds_4_tfdevcrufec, AV74Tdevcruwwds_5_tfdevcrusal, lV75Tdevcruwwds_6_tfclinom, AV76Tdevcruwwds_7_tfclinom_sel, lV77Tdevcruwwds_8_tftrnnom, AV78Tdevcruwwds_9_tftrnnom_sel, lV79Tdevcruwwds_10_tfdevcrumat, AV80Tdevcruwwds_11_tfdevcrumat_sel, lV81Tdevcruwwds_12_tfdevcruobs, AV82Tdevcruwwds_13_tfdevcruobs_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk86R8 = false ;
         A396EmprCod = P086R5_A396EmprCod[0] ;
         A252CliCod = P086R5_A252CliCod[0] ;
         A840TrnCod = P086R5_A840TrnCod[0] ;
         n840TrnCod = P086R5_n840TrnCod[0] ;
         A11682DevCruObs = P086R5_A11682DevCruObs[0] ;
         A11672DevCruMat = P086R5_A11672DevCruMat[0] ;
         A841TrnNom = P086R5_A841TrnNom[0] ;
         n841TrnNom = P086R5_n841TrnNom[0] ;
         A279CliNom = P086R5_A279CliNom[0] ;
         A11673DevCruSal = P086R5_A11673DevCruSal[0] ;
         A11670DevCruFec = P086R5_A11670DevCruFec[0] ;
         A11669DevCruId = P086R5_A11669DevCruId[0] ;
         A279CliNom = P086R5_A279CliNom[0] ;
         A841TrnNom = P086R5_A841TrnNom[0] ;
         n841TrnNom = P086R5_n841TrnNom[0] ;
         AV42count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P086R5_A11682DevCruObs[0], A11682DevCruObs) == 0 ) )
         {
            brk86R8 = false ;
            A396EmprCod = P086R5_A396EmprCod[0] ;
            A11669DevCruId = P086R5_A11669DevCruId[0] ;
            AV42count = (long)(AV42count+1) ;
            brk86R8 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A11682DevCruObs)==0) )
         {
            AV34Option = A11682DevCruObs ;
            AV35Options.add(AV34Option, 0);
            AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV35Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk86R8 )
         {
            brk86R8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tdevcruwwgetfilterdata.this.AV36OptionsJson;
      this.aP4[0] = tdevcruwwgetfilterdata.this.AV39OptionsDescJson;
      this.aP5[0] = tdevcruwwgetfilterdata.this.AV41OptionIndexesJson;
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
      AV65FilterFullText = "" ;
      AV12TFDevCruFec = GXutil.nullDate() ;
      AV24TFDevCruSal = GXutil.resetTime( GXutil.nullDate() );
      AV16TFCliNom = "" ;
      AV17TFCliNom_Sel = "" ;
      AV20TFTrnNom = "" ;
      AV21TFTrnNom_Sel = "" ;
      AV22TFDevCruMat = "" ;
      AV23TFDevCruMat_Sel = "" ;
      AV28TFDevCruObs = "" ;
      AV29TFDevCruObs_Sel = "" ;
      A279CliNom = "" ;
      AV70Tdevcruwwds_1_filterfulltext = "" ;
      AV73Tdevcruwwds_4_tfdevcrufec = GXutil.nullDate() ;
      AV74Tdevcruwwds_5_tfdevcrusal = GXutil.resetTime( GXutil.nullDate() );
      AV75Tdevcruwwds_6_tfclinom = "" ;
      AV76Tdevcruwwds_7_tfclinom_sel = "" ;
      AV77Tdevcruwwds_8_tftrnnom = "" ;
      AV78Tdevcruwwds_9_tftrnnom_sel = "" ;
      AV79Tdevcruwwds_10_tfdevcrumat = "" ;
      AV80Tdevcruwwds_11_tfdevcrumat_sel = "" ;
      AV81Tdevcruwwds_12_tfdevcruobs = "" ;
      AV82Tdevcruwwds_13_tfdevcruobs_sel = "" ;
      scmdbuf = "" ;
      lV70Tdevcruwwds_1_filterfulltext = "" ;
      lV75Tdevcruwwds_6_tfclinom = "" ;
      lV77Tdevcruwwds_8_tftrnnom = "" ;
      lV79Tdevcruwwds_10_tfdevcrumat = "" ;
      lV81Tdevcruwwds_12_tfdevcruobs = "" ;
      A841TrnNom = "" ;
      A11672DevCruMat = "" ;
      A11682DevCruObs = "" ;
      A11670DevCruFec = GXutil.nullDate() ;
      A11673DevCruSal = GXutil.resetTime( GXutil.nullDate() );
      P086R2_A396EmprCod = new String[] {""} ;
      P086R2_A252CliCod = new int[1] ;
      P086R2_A840TrnCod = new short[1] ;
      P086R2_n840TrnCod = new boolean[] {false} ;
      P086R2_A279CliNom = new String[] {""} ;
      P086R2_A11682DevCruObs = new String[] {""} ;
      P086R2_A11672DevCruMat = new String[] {""} ;
      P086R2_A841TrnNom = new String[] {""} ;
      P086R2_n841TrnNom = new boolean[] {false} ;
      P086R2_A11673DevCruSal = new java.util.Date[] {GXutil.nullDate()} ;
      P086R2_A11670DevCruFec = new java.util.Date[] {GXutil.nullDate()} ;
      P086R2_A11669DevCruId = new int[1] ;
      A396EmprCod = "" ;
      AV34Option = "" ;
      P086R3_A252CliCod = new int[1] ;
      P086R3_A840TrnCod = new short[1] ;
      P086R3_n840TrnCod = new boolean[] {false} ;
      P086R3_A396EmprCod = new String[] {""} ;
      P086R3_A11682DevCruObs = new String[] {""} ;
      P086R3_A11672DevCruMat = new String[] {""} ;
      P086R3_A841TrnNom = new String[] {""} ;
      P086R3_n841TrnNom = new boolean[] {false} ;
      P086R3_A279CliNom = new String[] {""} ;
      P086R3_A11673DevCruSal = new java.util.Date[] {GXutil.nullDate()} ;
      P086R3_A11670DevCruFec = new java.util.Date[] {GXutil.nullDate()} ;
      P086R3_A11669DevCruId = new int[1] ;
      P086R4_A396EmprCod = new String[] {""} ;
      P086R4_A252CliCod = new int[1] ;
      P086R4_A840TrnCod = new short[1] ;
      P086R4_n840TrnCod = new boolean[] {false} ;
      P086R4_A11672DevCruMat = new String[] {""} ;
      P086R4_A11682DevCruObs = new String[] {""} ;
      P086R4_A841TrnNom = new String[] {""} ;
      P086R4_n841TrnNom = new boolean[] {false} ;
      P086R4_A279CliNom = new String[] {""} ;
      P086R4_A11673DevCruSal = new java.util.Date[] {GXutil.nullDate()} ;
      P086R4_A11670DevCruFec = new java.util.Date[] {GXutil.nullDate()} ;
      P086R4_A11669DevCruId = new int[1] ;
      P086R5_A396EmprCod = new String[] {""} ;
      P086R5_A252CliCod = new int[1] ;
      P086R5_A840TrnCod = new short[1] ;
      P086R5_n840TrnCod = new boolean[] {false} ;
      P086R5_A11682DevCruObs = new String[] {""} ;
      P086R5_A11672DevCruMat = new String[] {""} ;
      P086R5_A841TrnNom = new String[] {""} ;
      P086R5_n841TrnNom = new boolean[] {false} ;
      P086R5_A279CliNom = new String[] {""} ;
      P086R5_A11673DevCruSal = new java.util.Date[] {GXutil.nullDate()} ;
      P086R5_A11670DevCruFec = new java.util.Date[] {GXutil.nullDate()} ;
      P086R5_A11669DevCruId = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tdevcruwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P086R2_A396EmprCod, P086R2_A252CliCod, P086R2_A840TrnCod, P086R2_n840TrnCod, P086R2_A279CliNom, P086R2_A11682DevCruObs, P086R2_A11672DevCruMat, P086R2_A841TrnNom, P086R2_n841TrnNom, P086R2_A11673DevCruSal,
            P086R2_A11670DevCruFec, P086R2_A11669DevCruId
            }
            , new Object[] {
            P086R3_A252CliCod, P086R3_A840TrnCod, P086R3_n840TrnCod, P086R3_A396EmprCod, P086R3_A11682DevCruObs, P086R3_A11672DevCruMat, P086R3_A841TrnNom, P086R3_n841TrnNom, P086R3_A279CliNom, P086R3_A11673DevCruSal,
            P086R3_A11670DevCruFec, P086R3_A11669DevCruId
            }
            , new Object[] {
            P086R4_A396EmprCod, P086R4_A252CliCod, P086R4_A840TrnCod, P086R4_n840TrnCod, P086R4_A11672DevCruMat, P086R4_A11682DevCruObs, P086R4_A841TrnNom, P086R4_n841TrnNom, P086R4_A279CliNom, P086R4_A11673DevCruSal,
            P086R4_A11670DevCruFec, P086R4_A11669DevCruId
            }
            , new Object[] {
            P086R5_A396EmprCod, P086R5_A252CliCod, P086R5_A840TrnCod, P086R5_n840TrnCod, P086R5_A11682DevCruObs, P086R5_A11672DevCruMat, P086R5_A841TrnNom, P086R5_n841TrnNom, P086R5_A279CliNom, P086R5_A11673DevCruSal,
            P086R5_A11670DevCruFec, P086R5_A11669DevCruId
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A840TrnCod ;
   private short Gx_err ;
   private int AV68GXV1 ;
   private int AV10TFDevCruId ;
   private int AV11TFDevCruId_To ;
   private int AV71Tdevcruwwds_2_tfdevcruid ;
   private int AV72Tdevcruwwds_3_tfdevcruid_to ;
   private int A11669DevCruId ;
   private int A252CliCod ;
   private int AV33InsertIndex ;
   private long AV42count ;
   private String AV16TFCliNom ;
   private String AV17TFCliNom_Sel ;
   private String AV20TFTrnNom ;
   private String AV21TFTrnNom_Sel ;
   private String AV22TFDevCruMat ;
   private String AV23TFDevCruMat_Sel ;
   private String A279CliNom ;
   private String AV75Tdevcruwwds_6_tfclinom ;
   private String AV76Tdevcruwwds_7_tfclinom_sel ;
   private String AV77Tdevcruwwds_8_tftrnnom ;
   private String AV78Tdevcruwwds_9_tftrnnom_sel ;
   private String AV79Tdevcruwwds_10_tfdevcrumat ;
   private String AV80Tdevcruwwds_11_tfdevcrumat_sel ;
   private String scmdbuf ;
   private String lV75Tdevcruwwds_6_tfclinom ;
   private String lV77Tdevcruwwds_8_tftrnnom ;
   private String lV79Tdevcruwwds_10_tfdevcrumat ;
   private String A841TrnNom ;
   private String A11672DevCruMat ;
   private String A396EmprCod ;
   private java.util.Date AV24TFDevCruSal ;
   private java.util.Date AV74Tdevcruwwds_5_tfdevcrusal ;
   private java.util.Date A11673DevCruSal ;
   private java.util.Date AV12TFDevCruFec ;
   private java.util.Date AV73Tdevcruwwds_4_tfdevcrufec ;
   private java.util.Date A11670DevCruFec ;
   private boolean returnInSub ;
   private boolean brk86R2 ;
   private boolean n840TrnCod ;
   private boolean n841TrnNom ;
   private boolean brk86R4 ;
   private boolean brk86R6 ;
   private boolean brk86R8 ;
   private String AV36OptionsJson ;
   private String AV39OptionsDescJson ;
   private String AV41OptionIndexesJson ;
   private String AV32DDOName ;
   private String AV30SearchTxt ;
   private String AV31SearchTxtTo ;
   private String AV65FilterFullText ;
   private String AV28TFDevCruObs ;
   private String AV29TFDevCruObs_Sel ;
   private String AV70Tdevcruwwds_1_filterfulltext ;
   private String AV81Tdevcruwwds_12_tfdevcruobs ;
   private String AV82Tdevcruwwds_13_tfdevcruobs_sel ;
   private String lV70Tdevcruwwds_1_filterfulltext ;
   private String lV81Tdevcruwwds_12_tfdevcruobs ;
   private String A11682DevCruObs ;
   private String AV34Option ;
   private com.genexus.webpanels.WebSession AV43Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P086R2_A396EmprCod ;
   private int[] P086R2_A252CliCod ;
   private short[] P086R2_A840TrnCod ;
   private boolean[] P086R2_n840TrnCod ;
   private String[] P086R2_A279CliNom ;
   private String[] P086R2_A11682DevCruObs ;
   private String[] P086R2_A11672DevCruMat ;
   private String[] P086R2_A841TrnNom ;
   private boolean[] P086R2_n841TrnNom ;
   private java.util.Date[] P086R2_A11673DevCruSal ;
   private java.util.Date[] P086R2_A11670DevCruFec ;
   private int[] P086R2_A11669DevCruId ;
   private int[] P086R3_A252CliCod ;
   private short[] P086R3_A840TrnCod ;
   private boolean[] P086R3_n840TrnCod ;
   private String[] P086R3_A396EmprCod ;
   private String[] P086R3_A11682DevCruObs ;
   private String[] P086R3_A11672DevCruMat ;
   private String[] P086R3_A841TrnNom ;
   private boolean[] P086R3_n841TrnNom ;
   private String[] P086R3_A279CliNom ;
   private java.util.Date[] P086R3_A11673DevCruSal ;
   private java.util.Date[] P086R3_A11670DevCruFec ;
   private int[] P086R3_A11669DevCruId ;
   private String[] P086R4_A396EmprCod ;
   private int[] P086R4_A252CliCod ;
   private short[] P086R4_A840TrnCod ;
   private boolean[] P086R4_n840TrnCod ;
   private String[] P086R4_A11672DevCruMat ;
   private String[] P086R4_A11682DevCruObs ;
   private String[] P086R4_A841TrnNom ;
   private boolean[] P086R4_n841TrnNom ;
   private String[] P086R4_A279CliNom ;
   private java.util.Date[] P086R4_A11673DevCruSal ;
   private java.util.Date[] P086R4_A11670DevCruFec ;
   private int[] P086R4_A11669DevCruId ;
   private String[] P086R5_A396EmprCod ;
   private int[] P086R5_A252CliCod ;
   private short[] P086R5_A840TrnCod ;
   private boolean[] P086R5_n840TrnCod ;
   private String[] P086R5_A11682DevCruObs ;
   private String[] P086R5_A11672DevCruMat ;
   private String[] P086R5_A841TrnNom ;
   private boolean[] P086R5_n841TrnNom ;
   private String[] P086R5_A279CliNom ;
   private java.util.Date[] P086R5_A11673DevCruSal ;
   private java.util.Date[] P086R5_A11670DevCruFec ;
   private int[] P086R5_A11669DevCruId ;
   private GXSimpleCollection<String> AV35Options ;
   private GXSimpleCollection<String> AV38OptionsDesc ;
   private GXSimpleCollection<String> AV40OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV45GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV46GridStateFilterValue ;
}

final  class tdevcruwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P086R2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV70Tdevcruwwds_1_filterfulltext ,
                                          int AV71Tdevcruwwds_2_tfdevcruid ,
                                          int AV72Tdevcruwwds_3_tfdevcruid_to ,
                                          java.util.Date AV73Tdevcruwwds_4_tfdevcrufec ,
                                          java.util.Date AV74Tdevcruwwds_5_tfdevcrusal ,
                                          String AV76Tdevcruwwds_7_tfclinom_sel ,
                                          String AV75Tdevcruwwds_6_tfclinom ,
                                          String AV78Tdevcruwwds_9_tftrnnom_sel ,
                                          String AV77Tdevcruwwds_8_tftrnnom ,
                                          String AV80Tdevcruwwds_11_tfdevcrumat_sel ,
                                          String AV79Tdevcruwwds_10_tfdevcrumat ,
                                          String AV82Tdevcruwwds_13_tfdevcruobs_sel ,
                                          String AV81Tdevcruwwds_12_tfdevcruobs ,
                                          int A11669DevCruId ,
                                          String A279CliNom ,
                                          String A841TrnNom ,
                                          String A11672DevCruMat ,
                                          String A11682DevCruObs ,
                                          java.util.Date A11670DevCruFec ,
                                          java.util.Date A11673DevCruSal )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[17];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.CliCod, T1.TrnCod, T2.CliNom, T1.DevCruObs, T1.DevCruMat, T3.TrnNom, T1.DevCruSal, T1.DevCruFec, T1.DevCruId FROM ((TXPDEVCRU T1 INNER JOIN" ;
      scmdbuf += " TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN TXPTRANSP T3 ON T3.EmprCod = T1.EmprCod AND T3.TrnCod = T1.TrnCod)" ;
      if ( ! (GXutil.strcmp("", AV70Tdevcruwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.DevCruId,'99999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T3.TrnNom) like '%' || UPPER(?)) or ( UPPER(T1.DevCruMat) like '%' || UPPER(?)) or ( UPPER(T1.DevCruObs) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (0==AV71Tdevcruwwds_2_tfdevcruid) )
      {
         addWhere(sWhereString, "(T1.DevCruId >= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (0==AV72Tdevcruwwds_3_tfdevcruid_to) )
      {
         addWhere(sWhereString, "(T1.DevCruId <= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV73Tdevcruwwds_4_tfdevcrufec)) )
      {
         addWhere(sWhereString, "(T1.DevCruFec >= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV74Tdevcruwwds_5_tfdevcrusal) )
      {
         addWhere(sWhereString, "(T1.DevCruSal >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Tdevcruwwds_7_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV75Tdevcruwwds_6_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Tdevcruwwds_7_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Tdevcruwwds_9_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV77Tdevcruwwds_8_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Tdevcruwwds_9_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TrnNom = ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Tdevcruwwds_11_tfdevcrumat_sel)==0) && ( ! (GXutil.strcmp("", AV79Tdevcruwwds_10_tfdevcrumat)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruMat) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Tdevcruwwds_11_tfdevcrumat_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruMat = ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Tdevcruwwds_13_tfdevcruobs_sel)==0) && ( ! (GXutil.strcmp("", AV81Tdevcruwwds_12_tfdevcruobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Tdevcruwwds_13_tfdevcruobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruObs = ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.CliNom" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P086R3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV70Tdevcruwwds_1_filterfulltext ,
                                          int AV71Tdevcruwwds_2_tfdevcruid ,
                                          int AV72Tdevcruwwds_3_tfdevcruid_to ,
                                          java.util.Date AV73Tdevcruwwds_4_tfdevcrufec ,
                                          java.util.Date AV74Tdevcruwwds_5_tfdevcrusal ,
                                          String AV76Tdevcruwwds_7_tfclinom_sel ,
                                          String AV75Tdevcruwwds_6_tfclinom ,
                                          String AV78Tdevcruwwds_9_tftrnnom_sel ,
                                          String AV77Tdevcruwwds_8_tftrnnom ,
                                          String AV80Tdevcruwwds_11_tfdevcrumat_sel ,
                                          String AV79Tdevcruwwds_10_tfdevcrumat ,
                                          String AV82Tdevcruwwds_13_tfdevcruobs_sel ,
                                          String AV81Tdevcruwwds_12_tfdevcruobs ,
                                          int A11669DevCruId ,
                                          String A279CliNom ,
                                          String A841TrnNom ,
                                          String A11672DevCruMat ,
                                          String A11682DevCruObs ,
                                          java.util.Date A11670DevCruFec ,
                                          java.util.Date A11673DevCruSal )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[17];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.CliCod, T1.TrnCod, T1.EmprCod, T1.DevCruObs, T1.DevCruMat, T3.TrnNom, T2.CliNom, T1.DevCruSal, T1.DevCruFec, T1.DevCruId FROM ((TXPDEVCRU T1 INNER JOIN" ;
      scmdbuf += " TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN TXPTRANSP T3 ON T3.EmprCod = T1.EmprCod AND T3.TrnCod = T1.TrnCod)" ;
      if ( ! (GXutil.strcmp("", AV70Tdevcruwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.DevCruId,'99999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T3.TrnNom) like '%' || UPPER(?)) or ( UPPER(T1.DevCruMat) like '%' || UPPER(?)) or ( UPPER(T1.DevCruObs) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
         GXv_int4[1] = (byte)(1) ;
         GXv_int4[2] = (byte)(1) ;
         GXv_int4[3] = (byte)(1) ;
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (0==AV71Tdevcruwwds_2_tfdevcruid) )
      {
         addWhere(sWhereString, "(T1.DevCruId >= ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! (0==AV72Tdevcruwwds_3_tfdevcruid_to) )
      {
         addWhere(sWhereString, "(T1.DevCruId <= ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV73Tdevcruwwds_4_tfdevcrufec)) )
      {
         addWhere(sWhereString, "(T1.DevCruFec >= ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV74Tdevcruwwds_5_tfdevcrusal) )
      {
         addWhere(sWhereString, "(T1.DevCruSal >= ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Tdevcruwwds_7_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV75Tdevcruwwds_6_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Tdevcruwwds_7_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Tdevcruwwds_9_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV77Tdevcruwwds_8_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Tdevcruwwds_9_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TrnNom = ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Tdevcruwwds_11_tfdevcrumat_sel)==0) && ( ! (GXutil.strcmp("", AV79Tdevcruwwds_10_tfdevcrumat)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruMat) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Tdevcruwwds_11_tfdevcrumat_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruMat = ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Tdevcruwwds_13_tfdevcruobs_sel)==0) && ( ! (GXutil.strcmp("", AV81Tdevcruwwds_12_tfdevcruobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Tdevcruwwds_13_tfdevcruobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruObs = ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.TrnCod" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P086R4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV70Tdevcruwwds_1_filterfulltext ,
                                          int AV71Tdevcruwwds_2_tfdevcruid ,
                                          int AV72Tdevcruwwds_3_tfdevcruid_to ,
                                          java.util.Date AV73Tdevcruwwds_4_tfdevcrufec ,
                                          java.util.Date AV74Tdevcruwwds_5_tfdevcrusal ,
                                          String AV76Tdevcruwwds_7_tfclinom_sel ,
                                          String AV75Tdevcruwwds_6_tfclinom ,
                                          String AV78Tdevcruwwds_9_tftrnnom_sel ,
                                          String AV77Tdevcruwwds_8_tftrnnom ,
                                          String AV80Tdevcruwwds_11_tfdevcrumat_sel ,
                                          String AV79Tdevcruwwds_10_tfdevcrumat ,
                                          String AV82Tdevcruwwds_13_tfdevcruobs_sel ,
                                          String AV81Tdevcruwwds_12_tfdevcruobs ,
                                          int A11669DevCruId ,
                                          String A279CliNom ,
                                          String A841TrnNom ,
                                          String A11672DevCruMat ,
                                          String A11682DevCruObs ,
                                          java.util.Date A11670DevCruFec ,
                                          java.util.Date A11673DevCruSal )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[17];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.CliCod, T1.TrnCod, T1.DevCruMat, T1.DevCruObs, T3.TrnNom, T2.CliNom, T1.DevCruSal, T1.DevCruFec, T1.DevCruId FROM ((TXPDEVCRU T1 INNER JOIN" ;
      scmdbuf += " TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN TXPTRANSP T3 ON T3.EmprCod = T1.EmprCod AND T3.TrnCod = T1.TrnCod)" ;
      if ( ! (GXutil.strcmp("", AV70Tdevcruwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.DevCruId,'99999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T3.TrnNom) like '%' || UPPER(?)) or ( UPPER(T1.DevCruMat) like '%' || UPPER(?)) or ( UPPER(T1.DevCruObs) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
         GXv_int6[1] = (byte)(1) ;
         GXv_int6[2] = (byte)(1) ;
         GXv_int6[3] = (byte)(1) ;
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (0==AV71Tdevcruwwds_2_tfdevcruid) )
      {
         addWhere(sWhereString, "(T1.DevCruId >= ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! (0==AV72Tdevcruwwds_3_tfdevcruid_to) )
      {
         addWhere(sWhereString, "(T1.DevCruId <= ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV73Tdevcruwwds_4_tfdevcrufec)) )
      {
         addWhere(sWhereString, "(T1.DevCruFec >= ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV74Tdevcruwwds_5_tfdevcrusal) )
      {
         addWhere(sWhereString, "(T1.DevCruSal >= ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Tdevcruwwds_7_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV75Tdevcruwwds_6_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Tdevcruwwds_7_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Tdevcruwwds_9_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV77Tdevcruwwds_8_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Tdevcruwwds_9_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TrnNom = ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Tdevcruwwds_11_tfdevcrumat_sel)==0) && ( ! (GXutil.strcmp("", AV79Tdevcruwwds_10_tfdevcrumat)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruMat) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Tdevcruwwds_11_tfdevcrumat_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruMat = ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Tdevcruwwds_13_tfdevcruobs_sel)==0) && ( ! (GXutil.strcmp("", AV81Tdevcruwwds_12_tfdevcruobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Tdevcruwwds_13_tfdevcruobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruObs = ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.DevCruMat" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P086R5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV70Tdevcruwwds_1_filterfulltext ,
                                          int AV71Tdevcruwwds_2_tfdevcruid ,
                                          int AV72Tdevcruwwds_3_tfdevcruid_to ,
                                          java.util.Date AV73Tdevcruwwds_4_tfdevcrufec ,
                                          java.util.Date AV74Tdevcruwwds_5_tfdevcrusal ,
                                          String AV76Tdevcruwwds_7_tfclinom_sel ,
                                          String AV75Tdevcruwwds_6_tfclinom ,
                                          String AV78Tdevcruwwds_9_tftrnnom_sel ,
                                          String AV77Tdevcruwwds_8_tftrnnom ,
                                          String AV80Tdevcruwwds_11_tfdevcrumat_sel ,
                                          String AV79Tdevcruwwds_10_tfdevcrumat ,
                                          String AV82Tdevcruwwds_13_tfdevcruobs_sel ,
                                          String AV81Tdevcruwwds_12_tfdevcruobs ,
                                          int A11669DevCruId ,
                                          String A279CliNom ,
                                          String A841TrnNom ,
                                          String A11672DevCruMat ,
                                          String A11682DevCruObs ,
                                          java.util.Date A11670DevCruFec ,
                                          java.util.Date A11673DevCruSal )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[17];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.CliCod, T1.TrnCod, T1.DevCruObs, T1.DevCruMat, T3.TrnNom, T2.CliNom, T1.DevCruSal, T1.DevCruFec, T1.DevCruId FROM ((TXPDEVCRU T1 INNER JOIN" ;
      scmdbuf += " TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN TXPTRANSP T3 ON T3.EmprCod = T1.EmprCod AND T3.TrnCod = T1.TrnCod)" ;
      if ( ! (GXutil.strcmp("", AV70Tdevcruwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.DevCruId,'99999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T3.TrnNom) like '%' || UPPER(?)) or ( UPPER(T1.DevCruMat) like '%' || UPPER(?)) or ( UPPER(T1.DevCruObs) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
         GXv_int8[1] = (byte)(1) ;
         GXv_int8[2] = (byte)(1) ;
         GXv_int8[3] = (byte)(1) ;
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! (0==AV71Tdevcruwwds_2_tfdevcruid) )
      {
         addWhere(sWhereString, "(T1.DevCruId >= ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( ! (0==AV72Tdevcruwwds_3_tfdevcruid_to) )
      {
         addWhere(sWhereString, "(T1.DevCruId <= ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV73Tdevcruwwds_4_tfdevcrufec)) )
      {
         addWhere(sWhereString, "(T1.DevCruFec >= ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV74Tdevcruwwds_5_tfdevcrusal) )
      {
         addWhere(sWhereString, "(T1.DevCruSal >= ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Tdevcruwwds_7_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV75Tdevcruwwds_6_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Tdevcruwwds_7_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Tdevcruwwds_9_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV77Tdevcruwwds_8_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Tdevcruwwds_9_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TrnNom = ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Tdevcruwwds_11_tfdevcrumat_sel)==0) && ( ! (GXutil.strcmp("", AV79Tdevcruwwds_10_tfdevcrumat)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruMat) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Tdevcruwwds_11_tfdevcrumat_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruMat = ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Tdevcruwwds_13_tfdevcruobs_sel)==0) && ( ! (GXutil.strcmp("", AV81Tdevcruwwds_12_tfdevcruobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Tdevcruwwds_13_tfdevcruobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruObs = ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.DevCruObs" ;
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
                  return conditional_P086R2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (java.util.Date)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.util.Date)dynConstraints[18] , (java.util.Date)dynConstraints[19] );
            case 1 :
                  return conditional_P086R3(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (java.util.Date)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.util.Date)dynConstraints[18] , (java.util.Date)dynConstraints[19] );
            case 2 :
                  return conditional_P086R4(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (java.util.Date)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.util.Date)dynConstraints[18] , (java.util.Date)dynConstraints[19] );
            case 3 :
                  return conditional_P086R5(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (java.util.Date)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.util.Date)dynConstraints[18] , (java.util.Date)dynConstraints[19] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P086R2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P086R3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P086R4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P086R5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((String[]) buf[5])[0] = rslt.getVarchar(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 20);
               ((String[]) buf[7])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(8);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(9);
               ((int[]) buf[11])[0] = rslt.getInt(10);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((String[]) buf[4])[0] = rslt.getVarchar(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 20);
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 30);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(8);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(9);
               ((int[]) buf[11])[0] = rslt.getInt(10);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 20);
               ((String[]) buf[5])[0] = rslt.getVarchar(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 30);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(8);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(9);
               ((int[]) buf[11])[0] = rslt.getInt(10);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 20);
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 30);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(8);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(9);
               ((int[]) buf[11])[0] = rslt.getInt(10);
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
                  stmt.setVarchar(sIdx, (String)parms[17], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[18], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[20], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[24]);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[25], false);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 20);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 200);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 200);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[17], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[18], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[20], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[24]);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[25], false);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 20);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 200);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 200);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[17], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[18], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[20], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[24]);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[25], false);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 20);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 200);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 200);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[17], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[18], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[20], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[24]);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[25], false);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 20);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 200);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 200);
               }
               return;
      }
   }

}

