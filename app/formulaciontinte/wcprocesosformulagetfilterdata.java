package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wcprocesosformulagetfilterdata extends GXProcedure
{
   public wcprocesosformulagetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcprocesosformulagetfilterdata.class ), "" );
   }

   public wcprocesosformulagetfilterdata( int remoteHandle ,
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
      wcprocesosformulagetfilterdata.this.aP5 = new String[] {""};
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
      wcprocesosformulagetfilterdata.this.AV18DDOName = aP0;
      wcprocesosformulagetfilterdata.this.AV16SearchTxt = aP1;
      wcprocesosformulagetfilterdata.this.AV17SearchTxtTo = aP2;
      wcprocesosformulagetfilterdata.this.aP3 = aP3;
      wcprocesosformulagetfilterdata.this.aP4 = aP4;
      wcprocesosformulagetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV21Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV24OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV26OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV18DDOName), "DDO_PROFORCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADPROFORCODOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV18DDOName), "DDO_PROFORDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADPROFORDSCOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV22OptionsJson = AV21Options.toJSonString(false) ;
      AV25OptionsDescJson = AV24OptionsDesc.toJSonString(false) ;
      AV27OptionIndexesJson = AV26OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV29Session.getValue("FormulacionTinte.WCProcesosFormulaGridState"), "") == 0 )
      {
         AV31GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.WCProcesosFormulaGridState"), null, null);
      }
      else
      {
         AV31GridState.fromxml(AV29Session.getValue("FormulacionTinte.WCProcesosFormulaGridState"), null, null);
      }
      AV43GXV1 = 1 ;
      while ( AV43GXV1 <= AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV32GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV43GXV1));
         if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORL") == 0 )
         {
            AV10TFProForL = (short)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFProForL_To = (short)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORCOD") == 0 )
         {
            AV12TFProForCod = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORCOD_SEL") == 0 )
         {
            AV13TFProForCod_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORDSC") == 0 )
         {
            AV14TFProForDsc = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORDSC_SEL") == 0 )
         {
            AV15TFProForDsc_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV34Emprcod = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV35clicod = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORSER") == 0 )
         {
            AV36Forser = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORCOLNOM") == 0 )
         {
            AV37Forcolnom = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORCOLNUM") == 0 )
         {
            AV38Forcolnum = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&TIPCOLCOD") == 0 )
         {
            AV39Tipcolcod = (byte)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV43GXV1 = (int)(AV43GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPROFORCODOPTIONS' Routine */
      returnInSub = false ;
      AV12TFProForCod = AV16SearchTxt ;
      AV13TFProForCod_Sel = "" ;
      AV45Formulaciontinte_wcprocesosformulads_1_tfproforl = AV10TFProForL ;
      AV46Formulaciontinte_wcprocesosformulads_2_tfproforl_to = AV11TFProForL_To ;
      AV47Formulaciontinte_wcprocesosformulads_3_tfproforcod = AV12TFProForCod ;
      AV48Formulaciontinte_wcprocesosformulads_4_tfproforcod_sel = AV13TFProForCod_Sel ;
      AV49Formulaciontinte_wcprocesosformulads_5_tfprofordsc = AV14TFProForDsc ;
      AV50Formulaciontinte_wcprocesosformulads_6_tfprofordsc_sel = AV15TFProForDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Short.valueOf(AV45Formulaciontinte_wcprocesosformulads_1_tfproforl) ,
                                           Short.valueOf(AV46Formulaciontinte_wcprocesosformulads_2_tfproforl_to) ,
                                           AV48Formulaciontinte_wcprocesosformulads_4_tfproforcod_sel ,
                                           AV47Formulaciontinte_wcprocesosformulads_3_tfproforcod ,
                                           AV50Formulaciontinte_wcprocesosformulads_6_tfprofordsc_sel ,
                                           AV49Formulaciontinte_wcprocesosformulads_5_tfprofordsc ,
                                           Short.valueOf(A1160ProForL) ,
                                           A764ProForCod ,
                                           A766ProForDsc ,
                                           Integer.valueOf(A252CliCod) ,
                                           Integer.valueOf(AV35clicod) ,
                                           A494ForSer ,
                                           AV36Forser ,
                                           A482ForColNom ,
                                           AV37Forcolnom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Integer.valueOf(AV38Forcolnum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           Byte.valueOf(AV39Tipcolcod) ,
                                           AV34Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV47Formulaciontinte_wcprocesosformulads_3_tfproforcod = GXutil.padr( GXutil.rtrim( AV47Formulaciontinte_wcprocesosformulads_3_tfproforcod), 6, "%") ;
      lV49Formulaciontinte_wcprocesosformulads_5_tfprofordsc = GXutil.padr( GXutil.rtrim( AV49Formulaciontinte_wcprocesosformulads_5_tfprofordsc), 30, "%") ;
      /* Using cursor P08JF2 */
      pr_default.execute(0, new Object[] {AV34Emprcod, Integer.valueOf(AV35clicod), AV36Forser, AV37Forcolnom, Integer.valueOf(AV38Forcolnum), Byte.valueOf(AV39Tipcolcod), Short.valueOf(AV45Formulaciontinte_wcprocesosformulads_1_tfproforl), Short.valueOf(AV46Formulaciontinte_wcprocesosformulads_2_tfproforl_to), lV47Formulaciontinte_wcprocesosformulads_3_tfproforcod, AV48Formulaciontinte_wcprocesosformulads_4_tfproforcod_sel, lV49Formulaciontinte_wcprocesosformulads_5_tfprofordsc, AV50Formulaciontinte_wcprocesosformulads_6_tfprofordsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8JF2 = false ;
         A396EmprCod = P08JF2_A396EmprCod[0] ;
         A764ProForCod = P08JF2_A764ProForCod[0] ;
         A831TipColCod = P08JF2_A831TipColCod[0] ;
         A483ForColNum = P08JF2_A483ForColNum[0] ;
         A482ForColNom = P08JF2_A482ForColNom[0] ;
         A494ForSer = P08JF2_A494ForSer[0] ;
         A252CliCod = P08JF2_A252CliCod[0] ;
         A766ProForDsc = P08JF2_A766ProForDsc[0] ;
         A1160ProForL = P08JF2_A1160ProForL[0] ;
         A766ProForDsc = P08JF2_A766ProForDsc[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08JF2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P08JF2_A764ProForCod[0], A764ProForCod) == 0 ) )
         {
            brk8JF2 = false ;
            A831TipColCod = P08JF2_A831TipColCod[0] ;
            A483ForColNum = P08JF2_A483ForColNum[0] ;
            A482ForColNom = P08JF2_A482ForColNom[0] ;
            A494ForSer = P08JF2_A494ForSer[0] ;
            A252CliCod = P08JF2_A252CliCod[0] ;
            A1160ProForL = P08JF2_A1160ProForL[0] ;
            AV28count = (long)(AV28count+1) ;
            brk8JF2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A764ProForCod)==0) )
         {
            AV20Option = A764ProForCod ;
            AV21Options.add(AV20Option, 0);
            AV26OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV21Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8JF2 )
         {
            brk8JF2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPROFORDSCOPTIONS' Routine */
      returnInSub = false ;
      AV14TFProForDsc = AV16SearchTxt ;
      AV15TFProForDsc_Sel = "" ;
      AV45Formulaciontinte_wcprocesosformulads_1_tfproforl = AV10TFProForL ;
      AV46Formulaciontinte_wcprocesosformulads_2_tfproforl_to = AV11TFProForL_To ;
      AV47Formulaciontinte_wcprocesosformulads_3_tfproforcod = AV12TFProForCod ;
      AV48Formulaciontinte_wcprocesosformulads_4_tfproforcod_sel = AV13TFProForCod_Sel ;
      AV49Formulaciontinte_wcprocesosformulads_5_tfprofordsc = AV14TFProForDsc ;
      AV50Formulaciontinte_wcprocesosformulads_6_tfprofordsc_sel = AV15TFProForDsc_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Short.valueOf(AV45Formulaciontinte_wcprocesosformulads_1_tfproforl) ,
                                           Short.valueOf(AV46Formulaciontinte_wcprocesosformulads_2_tfproforl_to) ,
                                           AV48Formulaciontinte_wcprocesosformulads_4_tfproforcod_sel ,
                                           AV47Formulaciontinte_wcprocesosformulads_3_tfproforcod ,
                                           AV50Formulaciontinte_wcprocesosformulads_6_tfprofordsc_sel ,
                                           AV49Formulaciontinte_wcprocesosformulads_5_tfprofordsc ,
                                           Short.valueOf(A1160ProForL) ,
                                           A764ProForCod ,
                                           A766ProForDsc ,
                                           Integer.valueOf(A252CliCod) ,
                                           Integer.valueOf(AV35clicod) ,
                                           A494ForSer ,
                                           AV36Forser ,
                                           A482ForColNom ,
                                           AV37Forcolnom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Integer.valueOf(AV38Forcolnum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           Byte.valueOf(AV39Tipcolcod) ,
                                           AV34Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV47Formulaciontinte_wcprocesosformulads_3_tfproforcod = GXutil.padr( GXutil.rtrim( AV47Formulaciontinte_wcprocesosformulads_3_tfproforcod), 6, "%") ;
      lV49Formulaciontinte_wcprocesosformulads_5_tfprofordsc = GXutil.padr( GXutil.rtrim( AV49Formulaciontinte_wcprocesosformulads_5_tfprofordsc), 30, "%") ;
      /* Using cursor P08JF3 */
      pr_default.execute(1, new Object[] {AV34Emprcod, Integer.valueOf(AV35clicod), AV36Forser, AV37Forcolnom, Integer.valueOf(AV38Forcolnum), Byte.valueOf(AV39Tipcolcod), Short.valueOf(AV45Formulaciontinte_wcprocesosformulads_1_tfproforl), Short.valueOf(AV46Formulaciontinte_wcprocesosformulads_2_tfproforl_to), lV47Formulaciontinte_wcprocesosformulads_3_tfproforcod, AV48Formulaciontinte_wcprocesosformulads_4_tfproforcod_sel, lV49Formulaciontinte_wcprocesosformulads_5_tfprofordsc, AV50Formulaciontinte_wcprocesosformulads_6_tfprofordsc_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8JF4 = false ;
         A764ProForCod = P08JF3_A764ProForCod[0] ;
         A396EmprCod = P08JF3_A396EmprCod[0] ;
         A831TipColCod = P08JF3_A831TipColCod[0] ;
         A483ForColNum = P08JF3_A483ForColNum[0] ;
         A482ForColNom = P08JF3_A482ForColNom[0] ;
         A494ForSer = P08JF3_A494ForSer[0] ;
         A252CliCod = P08JF3_A252CliCod[0] ;
         A766ProForDsc = P08JF3_A766ProForDsc[0] ;
         A1160ProForL = P08JF3_A1160ProForL[0] ;
         A766ProForDsc = P08JF3_A766ProForDsc[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08JF3_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P08JF3_A764ProForCod[0], A764ProForCod) == 0 ) )
         {
            brk8JF4 = false ;
            A831TipColCod = P08JF3_A831TipColCod[0] ;
            A483ForColNum = P08JF3_A483ForColNum[0] ;
            A482ForColNom = P08JF3_A482ForColNom[0] ;
            A494ForSer = P08JF3_A494ForSer[0] ;
            A252CliCod = P08JF3_A252CliCod[0] ;
            A1160ProForL = P08JF3_A1160ProForL[0] ;
            AV28count = (long)(AV28count+1) ;
            brk8JF4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A766ProForDsc)==0) )
         {
            AV20Option = A766ProForDsc ;
            AV19InsertIndex = 1 ;
            while ( ( AV19InsertIndex <= AV21Options.size() ) && ( GXutil.strcmp((String)AV21Options.elementAt(-1+AV19InsertIndex), AV20Option) < 0 ) )
            {
               AV19InsertIndex = (int)(AV19InsertIndex+1) ;
            }
            AV21Options.add(AV20Option, AV19InsertIndex);
            AV26OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), AV19InsertIndex);
         }
         if ( AV21Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8JF4 )
         {
            brk8JF4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = wcprocesosformulagetfilterdata.this.AV22OptionsJson;
      this.aP4[0] = wcprocesosformulagetfilterdata.this.AV25OptionsDescJson;
      this.aP5[0] = wcprocesosformulagetfilterdata.this.AV27OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV22OptionsJson = "" ;
      AV25OptionsDescJson = "" ;
      AV27OptionIndexesJson = "" ;
      AV21Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV24OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV26OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV29Session = httpContext.getWebSession();
      AV31GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV32GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV12TFProForCod = "" ;
      AV13TFProForCod_Sel = "" ;
      AV14TFProForDsc = "" ;
      AV15TFProForDsc_Sel = "" ;
      AV34Emprcod = "" ;
      AV36Forser = "" ;
      AV37Forcolnom = "" ;
      A764ProForCod = "" ;
      AV47Formulaciontinte_wcprocesosformulads_3_tfproforcod = "" ;
      AV48Formulaciontinte_wcprocesosformulads_4_tfproforcod_sel = "" ;
      AV49Formulaciontinte_wcprocesosformulads_5_tfprofordsc = "" ;
      AV50Formulaciontinte_wcprocesosformulads_6_tfprofordsc_sel = "" ;
      scmdbuf = "" ;
      lV47Formulaciontinte_wcprocesosformulads_3_tfproforcod = "" ;
      lV49Formulaciontinte_wcprocesosformulads_5_tfprofordsc = "" ;
      A766ProForDsc = "" ;
      A494ForSer = "" ;
      A482ForColNom = "" ;
      A396EmprCod = "" ;
      P08JF2_A396EmprCod = new String[] {""} ;
      P08JF2_A764ProForCod = new String[] {""} ;
      P08JF2_A831TipColCod = new byte[1] ;
      P08JF2_A483ForColNum = new int[1] ;
      P08JF2_A482ForColNom = new String[] {""} ;
      P08JF2_A494ForSer = new String[] {""} ;
      P08JF2_A252CliCod = new int[1] ;
      P08JF2_A766ProForDsc = new String[] {""} ;
      P08JF2_A1160ProForL = new short[1] ;
      AV20Option = "" ;
      P08JF3_A764ProForCod = new String[] {""} ;
      P08JF3_A396EmprCod = new String[] {""} ;
      P08JF3_A831TipColCod = new byte[1] ;
      P08JF3_A483ForColNum = new int[1] ;
      P08JF3_A482ForColNom = new String[] {""} ;
      P08JF3_A494ForSer = new String[] {""} ;
      P08JF3_A252CliCod = new int[1] ;
      P08JF3_A766ProForDsc = new String[] {""} ;
      P08JF3_A1160ProForL = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.wcprocesosformulagetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08JF2_A396EmprCod, P08JF2_A764ProForCod, P08JF2_A831TipColCod, P08JF2_A483ForColNum, P08JF2_A482ForColNom, P08JF2_A494ForSer, P08JF2_A252CliCod, P08JF2_A766ProForDsc, P08JF2_A1160ProForL
            }
            , new Object[] {
            P08JF3_A764ProForCod, P08JF3_A396EmprCod, P08JF3_A831TipColCod, P08JF3_A483ForColNum, P08JF3_A482ForColNom, P08JF3_A494ForSer, P08JF3_A252CliCod, P08JF3_A766ProForDsc, P08JF3_A1160ProForL
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV39Tipcolcod ;
   private byte A831TipColCod ;
   private short AV10TFProForL ;
   private short AV11TFProForL_To ;
   private short AV45Formulaciontinte_wcprocesosformulads_1_tfproforl ;
   private short AV46Formulaciontinte_wcprocesosformulads_2_tfproforl_to ;
   private short A1160ProForL ;
   private short Gx_err ;
   private int AV43GXV1 ;
   private int AV35clicod ;
   private int AV38Forcolnum ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int AV19InsertIndex ;
   private long AV28count ;
   private String AV12TFProForCod ;
   private String AV13TFProForCod_Sel ;
   private String AV14TFProForDsc ;
   private String AV15TFProForDsc_Sel ;
   private String AV34Emprcod ;
   private String AV36Forser ;
   private String AV37Forcolnom ;
   private String A764ProForCod ;
   private String AV47Formulaciontinte_wcprocesosformulads_3_tfproforcod ;
   private String AV48Formulaciontinte_wcprocesosformulads_4_tfproforcod_sel ;
   private String AV49Formulaciontinte_wcprocesosformulads_5_tfprofordsc ;
   private String AV50Formulaciontinte_wcprocesosformulads_6_tfprofordsc_sel ;
   private String scmdbuf ;
   private String lV47Formulaciontinte_wcprocesosformulads_3_tfproforcod ;
   private String lV49Formulaciontinte_wcprocesosformulads_5_tfprofordsc ;
   private String A766ProForDsc ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk8JF2 ;
   private boolean brk8JF4 ;
   private String AV22OptionsJson ;
   private String AV25OptionsDescJson ;
   private String AV27OptionIndexesJson ;
   private String AV18DDOName ;
   private String AV16SearchTxt ;
   private String AV17SearchTxtTo ;
   private String AV20Option ;
   private com.genexus.webpanels.WebSession AV29Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08JF2_A396EmprCod ;
   private String[] P08JF2_A764ProForCod ;
   private byte[] P08JF2_A831TipColCod ;
   private int[] P08JF2_A483ForColNum ;
   private String[] P08JF2_A482ForColNom ;
   private String[] P08JF2_A494ForSer ;
   private int[] P08JF2_A252CliCod ;
   private String[] P08JF2_A766ProForDsc ;
   private short[] P08JF2_A1160ProForL ;
   private String[] P08JF3_A764ProForCod ;
   private String[] P08JF3_A396EmprCod ;
   private byte[] P08JF3_A831TipColCod ;
   private int[] P08JF3_A483ForColNum ;
   private String[] P08JF3_A482ForColNom ;
   private String[] P08JF3_A494ForSer ;
   private int[] P08JF3_A252CliCod ;
   private String[] P08JF3_A766ProForDsc ;
   private short[] P08JF3_A1160ProForL ;
   private GXSimpleCollection<String> AV21Options ;
   private GXSimpleCollection<String> AV24OptionsDesc ;
   private GXSimpleCollection<String> AV26OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV31GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV32GridStateFilterValue ;
}

final  class wcprocesosformulagetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08JF2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV45Formulaciontinte_wcprocesosformulads_1_tfproforl ,
                                          short AV46Formulaciontinte_wcprocesosformulads_2_tfproforl_to ,
                                          String AV48Formulaciontinte_wcprocesosformulads_4_tfproforcod_sel ,
                                          String AV47Formulaciontinte_wcprocesosformulads_3_tfproforcod ,
                                          String AV50Formulaciontinte_wcprocesosformulads_6_tfprofordsc_sel ,
                                          String AV49Formulaciontinte_wcprocesosformulads_5_tfprofordsc ,
                                          short A1160ProForL ,
                                          String A764ProForCod ,
                                          String A766ProForDsc ,
                                          int A252CliCod ,
                                          int AV35clicod ,
                                          String A494ForSer ,
                                          String AV36Forser ,
                                          String A482ForColNom ,
                                          String AV37Forcolnom ,
                                          int A483ForColNum ,
                                          int AV38Forcolnum ,
                                          byte A831TipColCod ,
                                          byte AV39Tipcolcod ,
                                          String AV34Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[12];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ProForCod, T1.TipColCod, T1.ForColNum, T1.ForColNom, T1.ForSer, T1.CliCod, T2.ProForDsc, T1.ProForL FROM (TXPLFORMU T1 INNER JOIN TXPCPROFO" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.CliCod = ?)");
      addWhere(sWhereString, "(T1.ForSer = ?)");
      addWhere(sWhereString, "(T1.ForColNom = ?)");
      addWhere(sWhereString, "(T1.ForColNum = ?)");
      addWhere(sWhereString, "(T1.TipColCod = ?)");
      if ( ! (0==AV45Formulaciontinte_wcprocesosformulads_1_tfproforl) )
      {
         addWhere(sWhereString, "(T1.ProForL >= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (0==AV46Formulaciontinte_wcprocesosformulads_2_tfproforl_to) )
      {
         addWhere(sWhereString, "(T1.ProForL <= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV48Formulaciontinte_wcprocesosformulads_4_tfproforcod_sel)==0) && ( ! (GXutil.strcmp("", AV47Formulaciontinte_wcprocesosformulads_3_tfproforcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV48Formulaciontinte_wcprocesosformulads_4_tfproforcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForCod = ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV50Formulaciontinte_wcprocesosformulads_6_tfprofordsc_sel)==0) && ( ! (GXutil.strcmp("", AV49Formulaciontinte_wcprocesosformulads_5_tfprofordsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ProForDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV50Formulaciontinte_wcprocesosformulads_6_tfprofordsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ProForDsc = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.ProForCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08JF3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV45Formulaciontinte_wcprocesosformulads_1_tfproforl ,
                                          short AV46Formulaciontinte_wcprocesosformulads_2_tfproforl_to ,
                                          String AV48Formulaciontinte_wcprocesosformulads_4_tfproforcod_sel ,
                                          String AV47Formulaciontinte_wcprocesosformulads_3_tfproforcod ,
                                          String AV50Formulaciontinte_wcprocesosformulads_6_tfprofordsc_sel ,
                                          String AV49Formulaciontinte_wcprocesosformulads_5_tfprofordsc ,
                                          short A1160ProForL ,
                                          String A764ProForCod ,
                                          String A766ProForDsc ,
                                          int A252CliCod ,
                                          int AV35clicod ,
                                          String A494ForSer ,
                                          String AV36Forser ,
                                          String A482ForColNom ,
                                          String AV37Forcolnom ,
                                          int A483ForColNum ,
                                          int AV38Forcolnum ,
                                          byte A831TipColCod ,
                                          byte AV39Tipcolcod ,
                                          String AV34Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[12];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.ProForCod, T1.EmprCod, T1.TipColCod, T1.ForColNum, T1.ForColNom, T1.ForSer, T1.CliCod, T2.ProForDsc, T1.ProForL FROM (TXPLFORMU T1 INNER JOIN TXPCPROFO" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.CliCod = ?)");
      addWhere(sWhereString, "(T1.ForSer = ?)");
      addWhere(sWhereString, "(T1.ForColNom = ?)");
      addWhere(sWhereString, "(T1.ForColNum = ?)");
      addWhere(sWhereString, "(T1.TipColCod = ?)");
      if ( ! (0==AV45Formulaciontinte_wcprocesosformulads_1_tfproforl) )
      {
         addWhere(sWhereString, "(T1.ProForL >= ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (0==AV46Formulaciontinte_wcprocesosformulads_2_tfproforl_to) )
      {
         addWhere(sWhereString, "(T1.ProForL <= ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV48Formulaciontinte_wcprocesosformulads_4_tfproforcod_sel)==0) && ( ! (GXutil.strcmp("", AV47Formulaciontinte_wcprocesosformulads_3_tfproforcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV48Formulaciontinte_wcprocesosformulads_4_tfproforcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForCod = ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV50Formulaciontinte_wcprocesosformulads_6_tfprofordsc_sel)==0) && ( ! (GXutil.strcmp("", AV49Formulaciontinte_wcprocesosformulads_5_tfprofordsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ProForDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV50Formulaciontinte_wcprocesosformulads_6_tfprofordsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ProForDsc = ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.ProForCod" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
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
                  return conditional_P08JF2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , (String)dynConstraints[20] );
            case 1 :
                  return conditional_P08JF3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , (String)dynConstraints[20] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08JF2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08JF3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((short[]) buf[8])[0] = rslt.getShort(9);
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
                  stmt.setString(sIdx, (String)parms[14], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 13);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[17]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[18]).shortValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[19]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 30);
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
                  stmt.setString(sIdx, (String)parms[14], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 13);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[17]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[18]).shortValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[19]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 30);
               }
               return;
      }
   }

}

