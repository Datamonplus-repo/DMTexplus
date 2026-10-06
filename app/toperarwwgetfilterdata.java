package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class toperarwwgetfilterdata extends GXProcedure
{
   public toperarwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( toperarwwgetfilterdata.class ), "" );
   }

   public toperarwwgetfilterdata( int remoteHandle ,
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
      toperarwwgetfilterdata.this.aP5 = new String[] {""};
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
      toperarwwgetfilterdata.this.AV33DDOName = aP0;
      toperarwwgetfilterdata.this.AV31SearchTxt = aP1;
      toperarwwgetfilterdata.this.AV32SearchTxtTo = aP2;
      toperarwwgetfilterdata.this.aP3 = aP3;
      toperarwwgetfilterdata.this.aP4 = aP4;
      toperarwwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV36Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV39OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV41OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV33DDOName), "DDO_OPENOM") == 0 )
      {
         /* Execute user subroutine: 'LOADOPENOMOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV33DDOName), "DDO_OPENOM2") == 0 )
      {
         /* Execute user subroutine: 'LOADOPENOM2OPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV33DDOName), "DDO_OPEACT") == 0 )
      {
         /* Execute user subroutine: 'LOADOPEACTOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV37OptionsJson = AV36Options.toJSonString(false) ;
      AV40OptionsDescJson = AV39OptionsDesc.toJSonString(false) ;
      AV42OptionIndexesJson = AV41OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV44Session.getValue("TOPERARWWGridState"), "") == 0 )
      {
         AV46GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TOPERARWWGridState"), null, null);
      }
      else
      {
         AV46GridState.fromxml(AV44Session.getValue("TOPERARWWGridState"), null, null);
      }
      AV68GXV1 = 1 ;
      while ( AV68GXV1 <= AV46GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV47GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV46GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV68GXV1));
         if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV65FilterFullText = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOPECOD") == 0 )
         {
            AV10TFOpeCod = (int)(GXutil.lval( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFOpeCod_To = (int)(GXutil.lval( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOPENOM") == 0 )
         {
            AV12TFOpeNom = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOPENOM_SEL") == 0 )
         {
            AV13TFOpeNom_Sel = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOPENOM2") == 0 )
         {
            AV14TFOpeNom2 = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOPENOM2_SEL") == 0 )
         {
            AV15TFOpeNom2_Sel = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOPEACT") == 0 )
         {
            AV24TFOpeAct = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOPEACT_SEL") == 0 )
         {
            AV25TFOpeAct_Sel = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV68GXV1 = (int)(AV68GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADOPENOMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFOpeNom = AV31SearchTxt ;
      AV13TFOpeNom_Sel = "" ;
      AV70Toperarwwds_1_filterfulltext = AV65FilterFullText ;
      AV71Toperarwwds_2_tfopecod = AV10TFOpeCod ;
      AV72Toperarwwds_3_tfopecod_to = AV11TFOpeCod_To ;
      AV73Toperarwwds_4_tfopenom = AV12TFOpeNom ;
      AV74Toperarwwds_5_tfopenom_sel = AV13TFOpeNom_Sel ;
      AV75Toperarwwds_6_tfopenom2 = AV14TFOpeNom2 ;
      AV76Toperarwwds_7_tfopenom2_sel = AV15TFOpeNom2_Sel ;
      AV77Toperarwwds_8_tfopeact = AV24TFOpeAct ;
      AV78Toperarwwds_9_tfopeact_sel = AV25TFOpeAct_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV70Toperarwwds_1_filterfulltext ,
                                           Integer.valueOf(AV71Toperarwwds_2_tfopecod) ,
                                           Integer.valueOf(AV72Toperarwwds_3_tfopecod_to) ,
                                           AV74Toperarwwds_5_tfopenom_sel ,
                                           AV73Toperarwwds_4_tfopenom ,
                                           AV76Toperarwwds_7_tfopenom2_sel ,
                                           AV75Toperarwwds_6_tfopenom2 ,
                                           AV78Toperarwwds_9_tfopeact_sel ,
                                           AV77Toperarwwds_8_tfopeact ,
                                           Integer.valueOf(A652OpeCod) ,
                                           A653OpeNom ,
                                           A6869OpeNom2 ,
                                           A8482OpeAct } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV70Toperarwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Toperarwwds_1_filterfulltext), "%", "") ;
      lV70Toperarwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Toperarwwds_1_filterfulltext), "%", "") ;
      lV70Toperarwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Toperarwwds_1_filterfulltext), "%", "") ;
      lV70Toperarwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Toperarwwds_1_filterfulltext), "%", "") ;
      lV73Toperarwwds_4_tfopenom = GXutil.padr( GXutil.rtrim( AV73Toperarwwds_4_tfopenom), 30, "%") ;
      lV75Toperarwwds_6_tfopenom2 = GXutil.padr( GXutil.rtrim( AV75Toperarwwds_6_tfopenom2), 30, "%") ;
      lV77Toperarwwds_8_tfopeact = GXutil.padr( GXutil.rtrim( AV77Toperarwwds_8_tfopeact), 1, "%") ;
      /* Using cursor P08AN2 */
      pr_default.execute(0, new Object[] {lV70Toperarwwds_1_filterfulltext, lV70Toperarwwds_1_filterfulltext, lV70Toperarwwds_1_filterfulltext, lV70Toperarwwds_1_filterfulltext, Integer.valueOf(AV71Toperarwwds_2_tfopecod), Integer.valueOf(AV72Toperarwwds_3_tfopecod_to), lV73Toperarwwds_4_tfopenom, AV74Toperarwwds_5_tfopenom_sel, lV75Toperarwwds_6_tfopenom2, AV76Toperarwwds_7_tfopenom2_sel, lV77Toperarwwds_8_tfopeact, AV78Toperarwwds_9_tfopeact_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8AN2 = false ;
         A653OpeNom = P08AN2_A653OpeNom[0] ;
         n653OpeNom = P08AN2_n653OpeNom[0] ;
         A8482OpeAct = P08AN2_A8482OpeAct[0] ;
         n8482OpeAct = P08AN2_n8482OpeAct[0] ;
         A6869OpeNom2 = P08AN2_A6869OpeNom2[0] ;
         n6869OpeNom2 = P08AN2_n6869OpeNom2[0] ;
         A652OpeCod = P08AN2_A652OpeCod[0] ;
         A396EmprCod = P08AN2_A396EmprCod[0] ;
         AV43count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08AN2_A653OpeNom[0], A653OpeNom) == 0 ) )
         {
            brk8AN2 = false ;
            A652OpeCod = P08AN2_A652OpeCod[0] ;
            A396EmprCod = P08AN2_A396EmprCod[0] ;
            AV43count = (long)(AV43count+1) ;
            brk8AN2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A653OpeNom)==0) )
         {
            AV35Option = A653OpeNom ;
            AV36Options.add(AV35Option, 0);
            AV41OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV43count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV36Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8AN2 )
         {
            brk8AN2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADOPENOM2OPTIONS' Routine */
      returnInSub = false ;
      AV14TFOpeNom2 = AV31SearchTxt ;
      AV15TFOpeNom2_Sel = "" ;
      AV70Toperarwwds_1_filterfulltext = AV65FilterFullText ;
      AV71Toperarwwds_2_tfopecod = AV10TFOpeCod ;
      AV72Toperarwwds_3_tfopecod_to = AV11TFOpeCod_To ;
      AV73Toperarwwds_4_tfopenom = AV12TFOpeNom ;
      AV74Toperarwwds_5_tfopenom_sel = AV13TFOpeNom_Sel ;
      AV75Toperarwwds_6_tfopenom2 = AV14TFOpeNom2 ;
      AV76Toperarwwds_7_tfopenom2_sel = AV15TFOpeNom2_Sel ;
      AV77Toperarwwds_8_tfopeact = AV24TFOpeAct ;
      AV78Toperarwwds_9_tfopeact_sel = AV25TFOpeAct_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV70Toperarwwds_1_filterfulltext ,
                                           Integer.valueOf(AV71Toperarwwds_2_tfopecod) ,
                                           Integer.valueOf(AV72Toperarwwds_3_tfopecod_to) ,
                                           AV74Toperarwwds_5_tfopenom_sel ,
                                           AV73Toperarwwds_4_tfopenom ,
                                           AV76Toperarwwds_7_tfopenom2_sel ,
                                           AV75Toperarwwds_6_tfopenom2 ,
                                           AV78Toperarwwds_9_tfopeact_sel ,
                                           AV77Toperarwwds_8_tfopeact ,
                                           Integer.valueOf(A652OpeCod) ,
                                           A653OpeNom ,
                                           A6869OpeNom2 ,
                                           A8482OpeAct } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV70Toperarwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Toperarwwds_1_filterfulltext), "%", "") ;
      lV70Toperarwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Toperarwwds_1_filterfulltext), "%", "") ;
      lV70Toperarwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Toperarwwds_1_filterfulltext), "%", "") ;
      lV70Toperarwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Toperarwwds_1_filterfulltext), "%", "") ;
      lV73Toperarwwds_4_tfopenom = GXutil.padr( GXutil.rtrim( AV73Toperarwwds_4_tfopenom), 30, "%") ;
      lV75Toperarwwds_6_tfopenom2 = GXutil.padr( GXutil.rtrim( AV75Toperarwwds_6_tfopenom2), 30, "%") ;
      lV77Toperarwwds_8_tfopeact = GXutil.padr( GXutil.rtrim( AV77Toperarwwds_8_tfopeact), 1, "%") ;
      /* Using cursor P08AN3 */
      pr_default.execute(1, new Object[] {lV70Toperarwwds_1_filterfulltext, lV70Toperarwwds_1_filterfulltext, lV70Toperarwwds_1_filterfulltext, lV70Toperarwwds_1_filterfulltext, Integer.valueOf(AV71Toperarwwds_2_tfopecod), Integer.valueOf(AV72Toperarwwds_3_tfopecod_to), lV73Toperarwwds_4_tfopenom, AV74Toperarwwds_5_tfopenom_sel, lV75Toperarwwds_6_tfopenom2, AV76Toperarwwds_7_tfopenom2_sel, lV77Toperarwwds_8_tfopeact, AV78Toperarwwds_9_tfopeact_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8AN4 = false ;
         A6869OpeNom2 = P08AN3_A6869OpeNom2[0] ;
         n6869OpeNom2 = P08AN3_n6869OpeNom2[0] ;
         A8482OpeAct = P08AN3_A8482OpeAct[0] ;
         n8482OpeAct = P08AN3_n8482OpeAct[0] ;
         A653OpeNom = P08AN3_A653OpeNom[0] ;
         n653OpeNom = P08AN3_n653OpeNom[0] ;
         A652OpeCod = P08AN3_A652OpeCod[0] ;
         A396EmprCod = P08AN3_A396EmprCod[0] ;
         AV43count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08AN3_A6869OpeNom2[0], A6869OpeNom2) == 0 ) )
         {
            brk8AN4 = false ;
            A652OpeCod = P08AN3_A652OpeCod[0] ;
            A396EmprCod = P08AN3_A396EmprCod[0] ;
            AV43count = (long)(AV43count+1) ;
            brk8AN4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A6869OpeNom2)==0) )
         {
            AV35Option = A6869OpeNom2 ;
            AV36Options.add(AV35Option, 0);
            AV41OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV43count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV36Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8AN4 )
         {
            brk8AN4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADOPEACTOPTIONS' Routine */
      returnInSub = false ;
      AV24TFOpeAct = AV31SearchTxt ;
      AV25TFOpeAct_Sel = "" ;
      AV70Toperarwwds_1_filterfulltext = AV65FilterFullText ;
      AV71Toperarwwds_2_tfopecod = AV10TFOpeCod ;
      AV72Toperarwwds_3_tfopecod_to = AV11TFOpeCod_To ;
      AV73Toperarwwds_4_tfopenom = AV12TFOpeNom ;
      AV74Toperarwwds_5_tfopenom_sel = AV13TFOpeNom_Sel ;
      AV75Toperarwwds_6_tfopenom2 = AV14TFOpeNom2 ;
      AV76Toperarwwds_7_tfopenom2_sel = AV15TFOpeNom2_Sel ;
      AV77Toperarwwds_8_tfopeact = AV24TFOpeAct ;
      AV78Toperarwwds_9_tfopeact_sel = AV25TFOpeAct_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV70Toperarwwds_1_filterfulltext ,
                                           Integer.valueOf(AV71Toperarwwds_2_tfopecod) ,
                                           Integer.valueOf(AV72Toperarwwds_3_tfopecod_to) ,
                                           AV74Toperarwwds_5_tfopenom_sel ,
                                           AV73Toperarwwds_4_tfopenom ,
                                           AV76Toperarwwds_7_tfopenom2_sel ,
                                           AV75Toperarwwds_6_tfopenom2 ,
                                           AV78Toperarwwds_9_tfopeact_sel ,
                                           AV77Toperarwwds_8_tfopeact ,
                                           Integer.valueOf(A652OpeCod) ,
                                           A653OpeNom ,
                                           A6869OpeNom2 ,
                                           A8482OpeAct } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV70Toperarwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Toperarwwds_1_filterfulltext), "%", "") ;
      lV70Toperarwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Toperarwwds_1_filterfulltext), "%", "") ;
      lV70Toperarwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Toperarwwds_1_filterfulltext), "%", "") ;
      lV70Toperarwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Toperarwwds_1_filterfulltext), "%", "") ;
      lV73Toperarwwds_4_tfopenom = GXutil.padr( GXutil.rtrim( AV73Toperarwwds_4_tfopenom), 30, "%") ;
      lV75Toperarwwds_6_tfopenom2 = GXutil.padr( GXutil.rtrim( AV75Toperarwwds_6_tfopenom2), 30, "%") ;
      lV77Toperarwwds_8_tfopeact = GXutil.padr( GXutil.rtrim( AV77Toperarwwds_8_tfopeact), 1, "%") ;
      /* Using cursor P08AN4 */
      pr_default.execute(2, new Object[] {lV70Toperarwwds_1_filterfulltext, lV70Toperarwwds_1_filterfulltext, lV70Toperarwwds_1_filterfulltext, lV70Toperarwwds_1_filterfulltext, Integer.valueOf(AV71Toperarwwds_2_tfopecod), Integer.valueOf(AV72Toperarwwds_3_tfopecod_to), lV73Toperarwwds_4_tfopenom, AV74Toperarwwds_5_tfopenom_sel, lV75Toperarwwds_6_tfopenom2, AV76Toperarwwds_7_tfopenom2_sel, lV77Toperarwwds_8_tfopeact, AV78Toperarwwds_9_tfopeact_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk8AN6 = false ;
         A8482OpeAct = P08AN4_A8482OpeAct[0] ;
         n8482OpeAct = P08AN4_n8482OpeAct[0] ;
         A6869OpeNom2 = P08AN4_A6869OpeNom2[0] ;
         n6869OpeNom2 = P08AN4_n6869OpeNom2[0] ;
         A653OpeNom = P08AN4_A653OpeNom[0] ;
         n653OpeNom = P08AN4_n653OpeNom[0] ;
         A652OpeCod = P08AN4_A652OpeCod[0] ;
         A396EmprCod = P08AN4_A396EmprCod[0] ;
         AV43count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P08AN4_A8482OpeAct[0], A8482OpeAct) == 0 ) )
         {
            brk8AN6 = false ;
            A652OpeCod = P08AN4_A652OpeCod[0] ;
            A396EmprCod = P08AN4_A396EmprCod[0] ;
            AV43count = (long)(AV43count+1) ;
            brk8AN6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A8482OpeAct)==0) )
         {
            AV35Option = A8482OpeAct ;
            AV38OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A8482OpeAct, "@!"))) ;
            AV36Options.add(AV35Option, 0);
            AV39OptionsDesc.add(AV38OptionDesc, 0);
            AV41OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV43count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV36Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8AN6 )
         {
            brk8AN6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP3[0] = toperarwwgetfilterdata.this.AV37OptionsJson;
      this.aP4[0] = toperarwwgetfilterdata.this.AV40OptionsDescJson;
      this.aP5[0] = toperarwwgetfilterdata.this.AV42OptionIndexesJson;
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
      AV40OptionsDescJson = "" ;
      AV42OptionIndexesJson = "" ;
      AV36Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV39OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV41OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV44Session = httpContext.getWebSession();
      AV46GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV47GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV65FilterFullText = "" ;
      AV12TFOpeNom = "" ;
      AV13TFOpeNom_Sel = "" ;
      AV14TFOpeNom2 = "" ;
      AV15TFOpeNom2_Sel = "" ;
      AV24TFOpeAct = "" ;
      AV25TFOpeAct_Sel = "" ;
      A653OpeNom = "" ;
      AV70Toperarwwds_1_filterfulltext = "" ;
      AV73Toperarwwds_4_tfopenom = "" ;
      AV74Toperarwwds_5_tfopenom_sel = "" ;
      AV75Toperarwwds_6_tfopenom2 = "" ;
      AV76Toperarwwds_7_tfopenom2_sel = "" ;
      AV77Toperarwwds_8_tfopeact = "" ;
      AV78Toperarwwds_9_tfopeact_sel = "" ;
      scmdbuf = "" ;
      lV70Toperarwwds_1_filterfulltext = "" ;
      lV73Toperarwwds_4_tfopenom = "" ;
      lV75Toperarwwds_6_tfopenom2 = "" ;
      lV77Toperarwwds_8_tfopeact = "" ;
      A6869OpeNom2 = "" ;
      A8482OpeAct = "" ;
      P08AN2_A653OpeNom = new String[] {""} ;
      P08AN2_n653OpeNom = new boolean[] {false} ;
      P08AN2_A8482OpeAct = new String[] {""} ;
      P08AN2_n8482OpeAct = new boolean[] {false} ;
      P08AN2_A6869OpeNom2 = new String[] {""} ;
      P08AN2_n6869OpeNom2 = new boolean[] {false} ;
      P08AN2_A652OpeCod = new int[1] ;
      P08AN2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV35Option = "" ;
      P08AN3_A6869OpeNom2 = new String[] {""} ;
      P08AN3_n6869OpeNom2 = new boolean[] {false} ;
      P08AN3_A8482OpeAct = new String[] {""} ;
      P08AN3_n8482OpeAct = new boolean[] {false} ;
      P08AN3_A653OpeNom = new String[] {""} ;
      P08AN3_n653OpeNom = new boolean[] {false} ;
      P08AN3_A652OpeCod = new int[1] ;
      P08AN3_A396EmprCod = new String[] {""} ;
      P08AN4_A8482OpeAct = new String[] {""} ;
      P08AN4_n8482OpeAct = new boolean[] {false} ;
      P08AN4_A6869OpeNom2 = new String[] {""} ;
      P08AN4_n6869OpeNom2 = new boolean[] {false} ;
      P08AN4_A653OpeNom = new String[] {""} ;
      P08AN4_n653OpeNom = new boolean[] {false} ;
      P08AN4_A652OpeCod = new int[1] ;
      P08AN4_A396EmprCod = new String[] {""} ;
      AV38OptionDesc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.toperarwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08AN2_A653OpeNom, P08AN2_n653OpeNom, P08AN2_A8482OpeAct, P08AN2_n8482OpeAct, P08AN2_A6869OpeNom2, P08AN2_n6869OpeNom2, P08AN2_A652OpeCod, P08AN2_A396EmprCod
            }
            , new Object[] {
            P08AN3_A6869OpeNom2, P08AN3_n6869OpeNom2, P08AN3_A8482OpeAct, P08AN3_n8482OpeAct, P08AN3_A653OpeNom, P08AN3_n653OpeNom, P08AN3_A652OpeCod, P08AN3_A396EmprCod
            }
            , new Object[] {
            P08AN4_A8482OpeAct, P08AN4_n8482OpeAct, P08AN4_A6869OpeNom2, P08AN4_n6869OpeNom2, P08AN4_A653OpeNom, P08AN4_n653OpeNom, P08AN4_A652OpeCod, P08AN4_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV68GXV1 ;
   private int AV10TFOpeCod ;
   private int AV11TFOpeCod_To ;
   private int AV71Toperarwwds_2_tfopecod ;
   private int AV72Toperarwwds_3_tfopecod_to ;
   private int A652OpeCod ;
   private long AV43count ;
   private String AV12TFOpeNom ;
   private String AV13TFOpeNom_Sel ;
   private String AV14TFOpeNom2 ;
   private String AV15TFOpeNom2_Sel ;
   private String AV24TFOpeAct ;
   private String AV25TFOpeAct_Sel ;
   private String A653OpeNom ;
   private String AV73Toperarwwds_4_tfopenom ;
   private String AV74Toperarwwds_5_tfopenom_sel ;
   private String AV75Toperarwwds_6_tfopenom2 ;
   private String AV76Toperarwwds_7_tfopenom2_sel ;
   private String AV77Toperarwwds_8_tfopeact ;
   private String AV78Toperarwwds_9_tfopeact_sel ;
   private String scmdbuf ;
   private String lV73Toperarwwds_4_tfopenom ;
   private String lV75Toperarwwds_6_tfopenom2 ;
   private String lV77Toperarwwds_8_tfopeact ;
   private String A6869OpeNom2 ;
   private String A8482OpeAct ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk8AN2 ;
   private boolean n653OpeNom ;
   private boolean n8482OpeAct ;
   private boolean n6869OpeNom2 ;
   private boolean brk8AN4 ;
   private boolean brk8AN6 ;
   private String AV37OptionsJson ;
   private String AV40OptionsDescJson ;
   private String AV42OptionIndexesJson ;
   private String AV33DDOName ;
   private String AV31SearchTxt ;
   private String AV32SearchTxtTo ;
   private String AV65FilterFullText ;
   private String AV70Toperarwwds_1_filterfulltext ;
   private String lV70Toperarwwds_1_filterfulltext ;
   private String AV35Option ;
   private String AV38OptionDesc ;
   private com.genexus.webpanels.WebSession AV44Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08AN2_A653OpeNom ;
   private boolean[] P08AN2_n653OpeNom ;
   private String[] P08AN2_A8482OpeAct ;
   private boolean[] P08AN2_n8482OpeAct ;
   private String[] P08AN2_A6869OpeNom2 ;
   private boolean[] P08AN2_n6869OpeNom2 ;
   private int[] P08AN2_A652OpeCod ;
   private String[] P08AN2_A396EmprCod ;
   private String[] P08AN3_A6869OpeNom2 ;
   private boolean[] P08AN3_n6869OpeNom2 ;
   private String[] P08AN3_A8482OpeAct ;
   private boolean[] P08AN3_n8482OpeAct ;
   private String[] P08AN3_A653OpeNom ;
   private boolean[] P08AN3_n653OpeNom ;
   private int[] P08AN3_A652OpeCod ;
   private String[] P08AN3_A396EmprCod ;
   private String[] P08AN4_A8482OpeAct ;
   private boolean[] P08AN4_n8482OpeAct ;
   private String[] P08AN4_A6869OpeNom2 ;
   private boolean[] P08AN4_n6869OpeNom2 ;
   private String[] P08AN4_A653OpeNom ;
   private boolean[] P08AN4_n653OpeNom ;
   private int[] P08AN4_A652OpeCod ;
   private String[] P08AN4_A396EmprCod ;
   private GXSimpleCollection<String> AV36Options ;
   private GXSimpleCollection<String> AV39OptionsDesc ;
   private GXSimpleCollection<String> AV41OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV46GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV47GridStateFilterValue ;
}

final  class toperarwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08AN2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV70Toperarwwds_1_filterfulltext ,
                                          int AV71Toperarwwds_2_tfopecod ,
                                          int AV72Toperarwwds_3_tfopecod_to ,
                                          String AV74Toperarwwds_5_tfopenom_sel ,
                                          String AV73Toperarwwds_4_tfopenom ,
                                          String AV76Toperarwwds_7_tfopenom2_sel ,
                                          String AV75Toperarwwds_6_tfopenom2 ,
                                          String AV78Toperarwwds_9_tfopeact_sel ,
                                          String AV77Toperarwwds_8_tfopeact ,
                                          int A652OpeCod ,
                                          String A653OpeNom ,
                                          String A6869OpeNom2 ,
                                          String A8482OpeAct )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[12];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT OpeNom, OpeAct, OpeNom2, OpeCod, EmprCod FROM TXPOPERAR" ;
      if ( ! (GXutil.strcmp("", AV70Toperarwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(OpeCod,'999990'), 2) like '%' || ?) or ( UPPER(OpeNom) like '%' || UPPER(?)) or ( UPPER(OpeNom2) like '%' || UPPER(?)) or ( UPPER(OpeAct) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (0==AV71Toperarwwds_2_tfopecod) )
      {
         addWhere(sWhereString, "(OpeCod >= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (0==AV72Toperarwwds_3_tfopecod_to) )
      {
         addWhere(sWhereString, "(OpeCod <= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Toperarwwds_5_tfopenom_sel)==0) && ( ! (GXutil.strcmp("", AV73Toperarwwds_4_tfopenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(OpeNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Toperarwwds_5_tfopenom_sel)==0) )
      {
         addWhere(sWhereString, "(OpeNom = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Toperarwwds_7_tfopenom2_sel)==0) && ( ! (GXutil.strcmp("", AV75Toperarwwds_6_tfopenom2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(OpeNom2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Toperarwwds_7_tfopenom2_sel)==0) )
      {
         addWhere(sWhereString, "(OpeNom2 = ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Toperarwwds_9_tfopeact_sel)==0) && ( ! (GXutil.strcmp("", AV77Toperarwwds_8_tfopeact)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(OpeAct) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Toperarwwds_9_tfopeact_sel)==0) )
      {
         addWhere(sWhereString, "(OpeAct = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY OpeNom" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08AN3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV70Toperarwwds_1_filterfulltext ,
                                          int AV71Toperarwwds_2_tfopecod ,
                                          int AV72Toperarwwds_3_tfopecod_to ,
                                          String AV74Toperarwwds_5_tfopenom_sel ,
                                          String AV73Toperarwwds_4_tfopenom ,
                                          String AV76Toperarwwds_7_tfopenom2_sel ,
                                          String AV75Toperarwwds_6_tfopenom2 ,
                                          String AV78Toperarwwds_9_tfopeact_sel ,
                                          String AV77Toperarwwds_8_tfopeact ,
                                          int A652OpeCod ,
                                          String A653OpeNom ,
                                          String A6869OpeNom2 ,
                                          String A8482OpeAct )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[12];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT OpeNom2, OpeAct, OpeNom, OpeCod, EmprCod FROM TXPOPERAR" ;
      if ( ! (GXutil.strcmp("", AV70Toperarwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(OpeCod,'999990'), 2) like '%' || ?) or ( UPPER(OpeNom) like '%' || UPPER(?)) or ( UPPER(OpeNom2) like '%' || UPPER(?)) or ( UPPER(OpeAct) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
         GXv_int4[1] = (byte)(1) ;
         GXv_int4[2] = (byte)(1) ;
         GXv_int4[3] = (byte)(1) ;
      }
      if ( ! (0==AV71Toperarwwds_2_tfopecod) )
      {
         addWhere(sWhereString, "(OpeCod >= ?)");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (0==AV72Toperarwwds_3_tfopecod_to) )
      {
         addWhere(sWhereString, "(OpeCod <= ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Toperarwwds_5_tfopenom_sel)==0) && ( ! (GXutil.strcmp("", AV73Toperarwwds_4_tfopenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(OpeNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Toperarwwds_5_tfopenom_sel)==0) )
      {
         addWhere(sWhereString, "(OpeNom = ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Toperarwwds_7_tfopenom2_sel)==0) && ( ! (GXutil.strcmp("", AV75Toperarwwds_6_tfopenom2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(OpeNom2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Toperarwwds_7_tfopenom2_sel)==0) )
      {
         addWhere(sWhereString, "(OpeNom2 = ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Toperarwwds_9_tfopeact_sel)==0) && ( ! (GXutil.strcmp("", AV77Toperarwwds_8_tfopeact)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(OpeAct) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Toperarwwds_9_tfopeact_sel)==0) )
      {
         addWhere(sWhereString, "(OpeAct = ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY OpeNom2" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P08AN4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV70Toperarwwds_1_filterfulltext ,
                                          int AV71Toperarwwds_2_tfopecod ,
                                          int AV72Toperarwwds_3_tfopecod_to ,
                                          String AV74Toperarwwds_5_tfopenom_sel ,
                                          String AV73Toperarwwds_4_tfopenom ,
                                          String AV76Toperarwwds_7_tfopenom2_sel ,
                                          String AV75Toperarwwds_6_tfopenom2 ,
                                          String AV78Toperarwwds_9_tfopeact_sel ,
                                          String AV77Toperarwwds_8_tfopeact ,
                                          int A652OpeCod ,
                                          String A653OpeNom ,
                                          String A6869OpeNom2 ,
                                          String A8482OpeAct )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[12];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT OpeAct, OpeNom2, OpeNom, OpeCod, EmprCod FROM TXPOPERAR" ;
      if ( ! (GXutil.strcmp("", AV70Toperarwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(OpeCod,'999990'), 2) like '%' || ?) or ( UPPER(OpeNom) like '%' || UPPER(?)) or ( UPPER(OpeNom2) like '%' || UPPER(?)) or ( UPPER(OpeAct) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
         GXv_int6[1] = (byte)(1) ;
         GXv_int6[2] = (byte)(1) ;
         GXv_int6[3] = (byte)(1) ;
      }
      if ( ! (0==AV71Toperarwwds_2_tfopecod) )
      {
         addWhere(sWhereString, "(OpeCod >= ?)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (0==AV72Toperarwwds_3_tfopecod_to) )
      {
         addWhere(sWhereString, "(OpeCod <= ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Toperarwwds_5_tfopenom_sel)==0) && ( ! (GXutil.strcmp("", AV73Toperarwwds_4_tfopenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(OpeNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Toperarwwds_5_tfopenom_sel)==0) )
      {
         addWhere(sWhereString, "(OpeNom = ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Toperarwwds_7_tfopenom2_sel)==0) && ( ! (GXutil.strcmp("", AV75Toperarwwds_6_tfopenom2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(OpeNom2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Toperarwwds_7_tfopenom2_sel)==0) )
      {
         addWhere(sWhereString, "(OpeNom2 = ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Toperarwwds_9_tfopeact_sel)==0) && ( ! (GXutil.strcmp("", AV77Toperarwwds_8_tfopeact)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(OpeAct) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Toperarwwds_9_tfopeact_sel)==0) )
      {
         addWhere(sWhereString, "(OpeAct = ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY OpeAct" ;
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
                  return conditional_P08AN2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] );
            case 1 :
                  return conditional_P08AN3(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] );
            case 2 :
                  return conditional_P08AN4(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08AN2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08AN3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08AN4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(4);
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(4);
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(4);
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
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
                  stmt.setVarchar(sIdx, (String)parms[12], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[14], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 30);
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
                  stmt.setVarchar(sIdx, (String)parms[12], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[14], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 30);
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
                  stmt.setVarchar(sIdx, (String)parms[12], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[14], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 30);
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

