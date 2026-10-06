package app.controlcalidadhtd ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tccdefwwgetfilterdata extends GXProcedure
{
   public tccdefwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tccdefwwgetfilterdata.class ), "" );
   }

   public tccdefwwgetfilterdata( int remoteHandle ,
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
      tccdefwwgetfilterdata.this.aP5 = new String[] {""};
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
      tccdefwwgetfilterdata.this.AV30DDOName = aP0;
      tccdefwwgetfilterdata.this.AV31SearchTxt = aP1;
      tccdefwwgetfilterdata.this.AV32SearchTxtTo = aP2;
      tccdefwwgetfilterdata.this.aP3 = aP3;
      tccdefwwgetfilterdata.this.aP4 = aP4;
      tccdefwwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV20Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV22OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV23OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV30DDOName), "DDO_EMPRNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADEMPRNOMOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV30DDOName), "DDO_CCTDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADCCTDSCOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV33OptionsJson = AV20Options.toJSonString(false) ;
      AV34OptionsDescJson = AV22OptionsDesc.toJSonString(false) ;
      AV35OptionIndexesJson = AV23OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV25Session.getValue("ControlCalidadHTD.TCCDefWWGridState"), "") == 0 )
      {
         AV27GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ControlCalidadHTD.TCCDefWWGridState"), null, null);
      }
      else
      {
         AV27GridState.fromxml(AV25Session.getValue("ControlCalidadHTD.TCCDefWWGridState"), null, null);
      }
      AV39GXV1 = 1 ;
      while ( AV39GXV1 <= AV27GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV28GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV27GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV39GXV1));
         if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV36FilterFullText = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRNOM") == 0 )
         {
            AV10TFEmprNom = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRNOM_SEL") == 0 )
         {
            AV11TFEmprNom_Sel = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTDSC") == 0 )
         {
            AV12TFCCTDsc = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTDSC_SEL") == 0 )
         {
            AV13TFCCTDsc_Sel = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTTPOCTR_SEL") == 0 )
         {
            AV14TFCCTTpoCtr_SelsJson = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV15TFCCTTpoCtr_Sels.fromJSonString(AV14TFCCTTpoCtr_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTOBL_SEL") == 0 )
         {
            AV16TFCCTObl_Sel = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTSTO_SEL") == 0 )
         {
            AV17TFCCTSto_Sel = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV39GXV1 = (int)(AV39GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADEMPRNOMOPTIONS' Routine */
      returnInSub = false ;
      AV10TFEmprNom = AV31SearchTxt ;
      AV11TFEmprNom_Sel = "" ;
      AV41Controlcalidadhtd_tccdefwwds_1_filterfulltext = AV36FilterFullText ;
      AV42Controlcalidadhtd_tccdefwwds_2_tfemprnom = AV10TFEmprNom ;
      AV43Controlcalidadhtd_tccdefwwds_3_tfemprnom_sel = AV11TFEmprNom_Sel ;
      AV44Controlcalidadhtd_tccdefwwds_4_tfcctdsc = AV12TFCCTDsc ;
      AV45Controlcalidadhtd_tccdefwwds_5_tfcctdsc_sel = AV13TFCCTDsc_Sel ;
      AV46Controlcalidadhtd_tccdefwwds_6_tfccttpoctr_sels = AV15TFCCTTpoCtr_Sels ;
      AV47Controlcalidadhtd_tccdefwwds_7_tfcctobl_sel = AV16TFCCTObl_Sel ;
      AV48Controlcalidadhtd_tccdefwwds_8_tfcctsto_sel = AV17TFCCTSto_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A4037CCTTpoCtr ,
                                           AV46Controlcalidadhtd_tccdefwwds_6_tfccttpoctr_sels ,
                                           AV43Controlcalidadhtd_tccdefwwds_3_tfemprnom_sel ,
                                           AV42Controlcalidadhtd_tccdefwwds_2_tfemprnom ,
                                           AV45Controlcalidadhtd_tccdefwwds_5_tfcctdsc_sel ,
                                           AV44Controlcalidadhtd_tccdefwwds_4_tfcctdsc ,
                                           Integer.valueOf(AV46Controlcalidadhtd_tccdefwwds_6_tfccttpoctr_sels.size()) ,
                                           AV47Controlcalidadhtd_tccdefwwds_7_tfcctobl_sel ,
                                           AV48Controlcalidadhtd_tccdefwwds_8_tfcctsto_sel ,
                                           A407EmprNom ,
                                           A4036CCTDsc ,
                                           A4039CCTObl ,
                                           A4040CCTSto ,
                                           AV41Controlcalidadhtd_tccdefwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV42Controlcalidadhtd_tccdefwwds_2_tfemprnom = GXutil.padr( GXutil.rtrim( AV42Controlcalidadhtd_tccdefwwds_2_tfemprnom), 30, "%") ;
      lV44Controlcalidadhtd_tccdefwwds_4_tfcctdsc = GXutil.padr( GXutil.rtrim( AV44Controlcalidadhtd_tccdefwwds_4_tfcctdsc), 30, "%") ;
      /* Using cursor P09OR2 */
      pr_default.execute(0, new Object[] {lV42Controlcalidadhtd_tccdefwwds_2_tfemprnom, AV43Controlcalidadhtd_tccdefwwds_3_tfemprnom_sel, lV44Controlcalidadhtd_tccdefwwds_4_tfcctdsc, AV45Controlcalidadhtd_tccdefwwds_5_tfcctdsc_sel, AV47Controlcalidadhtd_tccdefwwds_7_tfcctobl_sel, AV48Controlcalidadhtd_tccdefwwds_8_tfcctsto_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9OR2 = false ;
         A396EmprCod = P09OR2_A396EmprCod[0] ;
         A4040CCTSto = P09OR2_A4040CCTSto[0] ;
         A4039CCTObl = P09OR2_A4039CCTObl[0] ;
         A4036CCTDsc = P09OR2_A4036CCTDsc[0] ;
         A407EmprNom = P09OR2_A407EmprNom[0] ;
         n407EmprNom = P09OR2_n407EmprNom[0] ;
         A4037CCTTpoCtr = P09OR2_A4037CCTTpoCtr[0] ;
         A4031CCTCod = P09OR2_A4031CCTCod[0] ;
         A407EmprNom = P09OR2_A407EmprNom[0] ;
         n407EmprNom = P09OR2_n407EmprNom[0] ;
         if ( (GXutil.strcmp("", AV41Controlcalidadhtd_tccdefwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A407EmprNom) , GXutil.padr( "%" + GXutil.upper( AV41Controlcalidadhtd_tccdefwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4036CCTDsc) , GXutil.padr( "%" + GXutil.upper( AV41Controlcalidadhtd_tccdefwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "iso (externo)", ""), "") , GXutil.padr( "%" + GXutil.lower( AV41Controlcalidadhtd_tccdefwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "E", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "interno", ""), "") , GXutil.padr( "%" + GXutil.lower( AV41Controlcalidadhtd_tccdefwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "I", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "defectos", ""), "") , GXutil.padr( "%" + GXutil.lower( AV41Controlcalidadhtd_tccdefwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 ) ) ) )
         {
            AV24count = 0 ;
            while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09OR2_A396EmprCod[0], A396EmprCod) == 0 ) )
            {
               brk9OR2 = false ;
               A4031CCTCod = P09OR2_A4031CCTCod[0] ;
               AV24count = (long)(AV24count+1) ;
               brk9OR2 = true ;
               pr_default.readNext(0);
            }
            if ( ! (GXutil.strcmp("", A407EmprNom)==0) )
            {
               AV19Option = A407EmprNom ;
               AV18InsertIndex = 1 ;
               while ( ( AV18InsertIndex <= AV20Options.size() ) && ( GXutil.strcmp((String)AV20Options.elementAt(-1+AV18InsertIndex), AV19Option) < 0 ) )
               {
                  AV18InsertIndex = (int)(AV18InsertIndex+1) ;
               }
               AV20Options.add(AV19Option, AV18InsertIndex);
               AV23OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV24count), "Z,ZZZ,ZZZ,ZZ9")), AV18InsertIndex);
            }
            if ( AV20Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk9OR2 )
         {
            brk9OR2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADCCTDSCOPTIONS' Routine */
      returnInSub = false ;
      AV12TFCCTDsc = AV31SearchTxt ;
      AV13TFCCTDsc_Sel = "" ;
      AV41Controlcalidadhtd_tccdefwwds_1_filterfulltext = AV36FilterFullText ;
      AV42Controlcalidadhtd_tccdefwwds_2_tfemprnom = AV10TFEmprNom ;
      AV43Controlcalidadhtd_tccdefwwds_3_tfemprnom_sel = AV11TFEmprNom_Sel ;
      AV44Controlcalidadhtd_tccdefwwds_4_tfcctdsc = AV12TFCCTDsc ;
      AV45Controlcalidadhtd_tccdefwwds_5_tfcctdsc_sel = AV13TFCCTDsc_Sel ;
      AV46Controlcalidadhtd_tccdefwwds_6_tfccttpoctr_sels = AV15TFCCTTpoCtr_Sels ;
      AV47Controlcalidadhtd_tccdefwwds_7_tfcctobl_sel = AV16TFCCTObl_Sel ;
      AV48Controlcalidadhtd_tccdefwwds_8_tfcctsto_sel = AV17TFCCTSto_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           A4037CCTTpoCtr ,
                                           AV46Controlcalidadhtd_tccdefwwds_6_tfccttpoctr_sels ,
                                           AV43Controlcalidadhtd_tccdefwwds_3_tfemprnom_sel ,
                                           AV42Controlcalidadhtd_tccdefwwds_2_tfemprnom ,
                                           AV45Controlcalidadhtd_tccdefwwds_5_tfcctdsc_sel ,
                                           AV44Controlcalidadhtd_tccdefwwds_4_tfcctdsc ,
                                           Integer.valueOf(AV46Controlcalidadhtd_tccdefwwds_6_tfccttpoctr_sels.size()) ,
                                           AV47Controlcalidadhtd_tccdefwwds_7_tfcctobl_sel ,
                                           AV48Controlcalidadhtd_tccdefwwds_8_tfcctsto_sel ,
                                           A407EmprNom ,
                                           A4036CCTDsc ,
                                           A4039CCTObl ,
                                           A4040CCTSto ,
                                           AV41Controlcalidadhtd_tccdefwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV42Controlcalidadhtd_tccdefwwds_2_tfemprnom = GXutil.padr( GXutil.rtrim( AV42Controlcalidadhtd_tccdefwwds_2_tfemprnom), 30, "%") ;
      lV44Controlcalidadhtd_tccdefwwds_4_tfcctdsc = GXutil.padr( GXutil.rtrim( AV44Controlcalidadhtd_tccdefwwds_4_tfcctdsc), 30, "%") ;
      /* Using cursor P09OR3 */
      pr_default.execute(1, new Object[] {lV42Controlcalidadhtd_tccdefwwds_2_tfemprnom, AV43Controlcalidadhtd_tccdefwwds_3_tfemprnom_sel, lV44Controlcalidadhtd_tccdefwwds_4_tfcctdsc, AV45Controlcalidadhtd_tccdefwwds_5_tfcctdsc_sel, AV47Controlcalidadhtd_tccdefwwds_7_tfcctobl_sel, AV48Controlcalidadhtd_tccdefwwds_8_tfcctsto_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9OR4 = false ;
         A396EmprCod = P09OR3_A396EmprCod[0] ;
         A4036CCTDsc = P09OR3_A4036CCTDsc[0] ;
         A4040CCTSto = P09OR3_A4040CCTSto[0] ;
         A4039CCTObl = P09OR3_A4039CCTObl[0] ;
         A407EmprNom = P09OR3_A407EmprNom[0] ;
         n407EmprNom = P09OR3_n407EmprNom[0] ;
         A4037CCTTpoCtr = P09OR3_A4037CCTTpoCtr[0] ;
         A4031CCTCod = P09OR3_A4031CCTCod[0] ;
         A407EmprNom = P09OR3_A407EmprNom[0] ;
         n407EmprNom = P09OR3_n407EmprNom[0] ;
         if ( (GXutil.strcmp("", AV41Controlcalidadhtd_tccdefwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A407EmprNom) , GXutil.padr( "%" + GXutil.upper( AV41Controlcalidadhtd_tccdefwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4036CCTDsc) , GXutil.padr( "%" + GXutil.upper( AV41Controlcalidadhtd_tccdefwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "iso (externo)", ""), "") , GXutil.padr( "%" + GXutil.lower( AV41Controlcalidadhtd_tccdefwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "E", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "interno", ""), "") , GXutil.padr( "%" + GXutil.lower( AV41Controlcalidadhtd_tccdefwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "I", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "defectos", ""), "") , GXutil.padr( "%" + GXutil.lower( AV41Controlcalidadhtd_tccdefwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 ) ) ) )
         {
            AV24count = 0 ;
            while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09OR3_A4036CCTDsc[0], A4036CCTDsc) == 0 ) )
            {
               brk9OR4 = false ;
               A396EmprCod = P09OR3_A396EmprCod[0] ;
               A4031CCTCod = P09OR3_A4031CCTCod[0] ;
               AV24count = (long)(AV24count+1) ;
               brk9OR4 = true ;
               pr_default.readNext(1);
            }
            if ( ! (GXutil.strcmp("", A4036CCTDsc)==0) )
            {
               AV19Option = A4036CCTDsc ;
               AV20Options.add(AV19Option, 0);
               AV23OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV24count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV20Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk9OR4 )
         {
            brk9OR4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tccdefwwgetfilterdata.this.AV33OptionsJson;
      this.aP4[0] = tccdefwwgetfilterdata.this.AV34OptionsDescJson;
      this.aP5[0] = tccdefwwgetfilterdata.this.AV35OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV33OptionsJson = "" ;
      AV34OptionsDescJson = "" ;
      AV35OptionIndexesJson = "" ;
      AV20Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV22OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV23OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV25Session = httpContext.getWebSession();
      AV27GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV28GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV36FilterFullText = "" ;
      AV10TFEmprNom = "" ;
      AV11TFEmprNom_Sel = "" ;
      AV12TFCCTDsc = "" ;
      AV13TFCCTDsc_Sel = "" ;
      AV14TFCCTTpoCtr_SelsJson = "" ;
      AV15TFCCTTpoCtr_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV16TFCCTObl_Sel = "" ;
      AV17TFCCTSto_Sel = "" ;
      A407EmprNom = "" ;
      AV41Controlcalidadhtd_tccdefwwds_1_filterfulltext = "" ;
      AV42Controlcalidadhtd_tccdefwwds_2_tfemprnom = "" ;
      AV43Controlcalidadhtd_tccdefwwds_3_tfemprnom_sel = "" ;
      AV44Controlcalidadhtd_tccdefwwds_4_tfcctdsc = "" ;
      AV45Controlcalidadhtd_tccdefwwds_5_tfcctdsc_sel = "" ;
      AV46Controlcalidadhtd_tccdefwwds_6_tfccttpoctr_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV47Controlcalidadhtd_tccdefwwds_7_tfcctobl_sel = "" ;
      AV48Controlcalidadhtd_tccdefwwds_8_tfcctsto_sel = "" ;
      scmdbuf = "" ;
      lV42Controlcalidadhtd_tccdefwwds_2_tfemprnom = "" ;
      lV44Controlcalidadhtd_tccdefwwds_4_tfcctdsc = "" ;
      A4037CCTTpoCtr = "" ;
      A4036CCTDsc = "" ;
      A4039CCTObl = "" ;
      A4040CCTSto = "" ;
      P09OR2_A396EmprCod = new String[] {""} ;
      P09OR2_A4040CCTSto = new String[] {""} ;
      P09OR2_A4039CCTObl = new String[] {""} ;
      P09OR2_A4036CCTDsc = new String[] {""} ;
      P09OR2_A407EmprNom = new String[] {""} ;
      P09OR2_n407EmprNom = new boolean[] {false} ;
      P09OR2_A4037CCTTpoCtr = new String[] {""} ;
      P09OR2_A4031CCTCod = new int[1] ;
      A396EmprCod = "" ;
      AV19Option = "" ;
      P09OR3_A396EmprCod = new String[] {""} ;
      P09OR3_A4036CCTDsc = new String[] {""} ;
      P09OR3_A4040CCTSto = new String[] {""} ;
      P09OR3_A4039CCTObl = new String[] {""} ;
      P09OR3_A407EmprNom = new String[] {""} ;
      P09OR3_n407EmprNom = new boolean[] {false} ;
      P09OR3_A4037CCTTpoCtr = new String[] {""} ;
      P09OR3_A4031CCTCod = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.tccdefwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09OR2_A396EmprCod, P09OR2_A4040CCTSto, P09OR2_A4039CCTObl, P09OR2_A4036CCTDsc, P09OR2_A407EmprNom, P09OR2_n407EmprNom, P09OR2_A4037CCTTpoCtr, P09OR2_A4031CCTCod
            }
            , new Object[] {
            P09OR3_A396EmprCod, P09OR3_A4036CCTDsc, P09OR3_A4040CCTSto, P09OR3_A4039CCTObl, P09OR3_A407EmprNom, P09OR3_n407EmprNom, P09OR3_A4037CCTTpoCtr, P09OR3_A4031CCTCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV39GXV1 ;
   private int AV46Controlcalidadhtd_tccdefwwds_6_tfccttpoctr_sels_size ;
   private int A4031CCTCod ;
   private int AV18InsertIndex ;
   private long AV24count ;
   private String AV10TFEmprNom ;
   private String AV11TFEmprNom_Sel ;
   private String AV12TFCCTDsc ;
   private String AV13TFCCTDsc_Sel ;
   private String AV16TFCCTObl_Sel ;
   private String AV17TFCCTSto_Sel ;
   private String A407EmprNom ;
   private String AV42Controlcalidadhtd_tccdefwwds_2_tfemprnom ;
   private String AV43Controlcalidadhtd_tccdefwwds_3_tfemprnom_sel ;
   private String AV44Controlcalidadhtd_tccdefwwds_4_tfcctdsc ;
   private String AV45Controlcalidadhtd_tccdefwwds_5_tfcctdsc_sel ;
   private String AV47Controlcalidadhtd_tccdefwwds_7_tfcctobl_sel ;
   private String AV48Controlcalidadhtd_tccdefwwds_8_tfcctsto_sel ;
   private String scmdbuf ;
   private String lV42Controlcalidadhtd_tccdefwwds_2_tfemprnom ;
   private String lV44Controlcalidadhtd_tccdefwwds_4_tfcctdsc ;
   private String A4037CCTTpoCtr ;
   private String A4036CCTDsc ;
   private String A4039CCTObl ;
   private String A4040CCTSto ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk9OR2 ;
   private boolean n407EmprNom ;
   private boolean brk9OR4 ;
   private String AV33OptionsJson ;
   private String AV34OptionsDescJson ;
   private String AV35OptionIndexesJson ;
   private String AV14TFCCTTpoCtr_SelsJson ;
   private String AV30DDOName ;
   private String AV31SearchTxt ;
   private String AV32SearchTxtTo ;
   private String AV36FilterFullText ;
   private String AV41Controlcalidadhtd_tccdefwwds_1_filterfulltext ;
   private String AV19Option ;
   private com.genexus.webpanels.WebSession AV25Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09OR2_A396EmprCod ;
   private String[] P09OR2_A4040CCTSto ;
   private String[] P09OR2_A4039CCTObl ;
   private String[] P09OR2_A4036CCTDsc ;
   private String[] P09OR2_A407EmprNom ;
   private boolean[] P09OR2_n407EmprNom ;
   private String[] P09OR2_A4037CCTTpoCtr ;
   private int[] P09OR2_A4031CCTCod ;
   private String[] P09OR3_A396EmprCod ;
   private String[] P09OR3_A4036CCTDsc ;
   private String[] P09OR3_A4040CCTSto ;
   private String[] P09OR3_A4039CCTObl ;
   private String[] P09OR3_A407EmprNom ;
   private boolean[] P09OR3_n407EmprNom ;
   private String[] P09OR3_A4037CCTTpoCtr ;
   private int[] P09OR3_A4031CCTCod ;
   private GXSimpleCollection<String> AV15TFCCTTpoCtr_Sels ;
   private GXSimpleCollection<String> AV46Controlcalidadhtd_tccdefwwds_6_tfccttpoctr_sels ;
   private GXSimpleCollection<String> AV20Options ;
   private GXSimpleCollection<String> AV22OptionsDesc ;
   private GXSimpleCollection<String> AV23OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV27GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV28GridStateFilterValue ;
}

final  class tccdefwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09OR2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A4037CCTTpoCtr ,
                                          GXSimpleCollection<String> AV46Controlcalidadhtd_tccdefwwds_6_tfccttpoctr_sels ,
                                          String AV43Controlcalidadhtd_tccdefwwds_3_tfemprnom_sel ,
                                          String AV42Controlcalidadhtd_tccdefwwds_2_tfemprnom ,
                                          String AV45Controlcalidadhtd_tccdefwwds_5_tfcctdsc_sel ,
                                          String AV44Controlcalidadhtd_tccdefwwds_4_tfcctdsc ,
                                          int AV46Controlcalidadhtd_tccdefwwds_6_tfccttpoctr_sels_size ,
                                          String AV47Controlcalidadhtd_tccdefwwds_7_tfcctobl_sel ,
                                          String AV48Controlcalidadhtd_tccdefwwds_8_tfcctsto_sel ,
                                          String A407EmprNom ,
                                          String A4036CCTDsc ,
                                          String A4039CCTObl ,
                                          String A4040CCTSto ,
                                          String AV41Controlcalidadhtd_tccdefwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[6];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.CCTSto, T1.CCTObl, T1.CCTDsc, T2.EmprNom, T1.CCTTpoCtr, T1.CCTCod FROM (TXPCCDef T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod)" ;
      if ( (GXutil.strcmp("", AV43Controlcalidadhtd_tccdefwwds_3_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV42Controlcalidadhtd_tccdefwwds_2_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV43Controlcalidadhtd_tccdefwwds_3_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.EmprNom = ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV45Controlcalidadhtd_tccdefwwds_5_tfcctdsc_sel)==0) && ( ! (GXutil.strcmp("", AV44Controlcalidadhtd_tccdefwwds_4_tfcctdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCTDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV45Controlcalidadhtd_tccdefwwds_5_tfcctdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCTDsc = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( AV46Controlcalidadhtd_tccdefwwds_6_tfccttpoctr_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV46Controlcalidadhtd_tccdefwwds_6_tfccttpoctr_sels, "T1.CCTTpoCtr IN (", ")")+")");
      }
      if ( ! (GXutil.strcmp("", AV47Controlcalidadhtd_tccdefwwds_7_tfcctobl_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCTObl = ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV48Controlcalidadhtd_tccdefwwds_8_tfcctsto_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCTSto = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09OR3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A4037CCTTpoCtr ,
                                          GXSimpleCollection<String> AV46Controlcalidadhtd_tccdefwwds_6_tfccttpoctr_sels ,
                                          String AV43Controlcalidadhtd_tccdefwwds_3_tfemprnom_sel ,
                                          String AV42Controlcalidadhtd_tccdefwwds_2_tfemprnom ,
                                          String AV45Controlcalidadhtd_tccdefwwds_5_tfcctdsc_sel ,
                                          String AV44Controlcalidadhtd_tccdefwwds_4_tfcctdsc ,
                                          int AV46Controlcalidadhtd_tccdefwwds_6_tfccttpoctr_sels_size ,
                                          String AV47Controlcalidadhtd_tccdefwwds_7_tfcctobl_sel ,
                                          String AV48Controlcalidadhtd_tccdefwwds_8_tfcctsto_sel ,
                                          String A407EmprNom ,
                                          String A4036CCTDsc ,
                                          String A4039CCTObl ,
                                          String A4040CCTSto ,
                                          String AV41Controlcalidadhtd_tccdefwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[6];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.CCTDsc, T1.CCTSto, T1.CCTObl, T2.EmprNom, T1.CCTTpoCtr, T1.CCTCod FROM (TXPCCDef T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod)" ;
      if ( (GXutil.strcmp("", AV43Controlcalidadhtd_tccdefwwds_3_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV42Controlcalidadhtd_tccdefwwds_2_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV43Controlcalidadhtd_tccdefwwds_3_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.EmprNom = ?)");
      }
      else
      {
         GXv_int5[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV45Controlcalidadhtd_tccdefwwds_5_tfcctdsc_sel)==0) && ( ! (GXutil.strcmp("", AV44Controlcalidadhtd_tccdefwwds_4_tfcctdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCTDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV45Controlcalidadhtd_tccdefwwds_5_tfcctdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCTDsc = ?)");
      }
      else
      {
         GXv_int5[3] = (byte)(1) ;
      }
      if ( AV46Controlcalidadhtd_tccdefwwds_6_tfccttpoctr_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV46Controlcalidadhtd_tccdefwwds_6_tfccttpoctr_sels, "T1.CCTTpoCtr IN (", ")")+")");
      }
      if ( ! (GXutil.strcmp("", AV47Controlcalidadhtd_tccdefwwds_7_tfcctobl_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCTObl = ?)");
      }
      else
      {
         GXv_int5[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV48Controlcalidadhtd_tccdefwwds_8_tfcctsto_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCTSto = ?)");
      }
      else
      {
         GXv_int5[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.CCTDsc" ;
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
                  return conditional_P09OR2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] );
            case 1 :
                  return conditional_P09OR3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09OR2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09OR3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((int[]) buf[7])[0] = rslt.getInt(7);
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
                  stmt.setString(sIdx, (String)parms[6], 30);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 30);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 1);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 1);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[6], 30);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 30);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 1);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 1);
               }
               return;
      }
   }

}

