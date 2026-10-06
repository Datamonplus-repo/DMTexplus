package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wc_tminvstgetfilterdata extends GXProcedure
{
   public wc_tminvstgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wc_tminvstgetfilterdata.class ), "" );
   }

   public wc_tminvstgetfilterdata( int remoteHandle ,
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
      wc_tminvstgetfilterdata.this.aP5 = new String[] {""};
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
      wc_tminvstgetfilterdata.this.AV28DDOName = aP0;
      wc_tminvstgetfilterdata.this.AV26SearchTxt = aP1;
      wc_tminvstgetfilterdata.this.AV27SearchTxtTo = aP2;
      wc_tminvstgetfilterdata.this.aP3 = aP3;
      wc_tminvstgetfilterdata.this.aP4 = aP4;
      wc_tminvstgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV31Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV34OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV36OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_MISRNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADMISRNOMOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV32OptionsJson = AV31Options.toJSonString(false) ;
      AV35OptionsDescJson = AV34OptionsDesc.toJSonString(false) ;
      AV37OptionIndexesJson = AV36OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV39Session.getValue("WC_TMInvStGridState"), "") == 0 )
      {
         AV41GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WC_TMInvStGridState"), null, null);
      }
      else
      {
         AV41GridState.fromxml(AV39Session.getValue("WC_TMInvStGridState"), null, null);
      }
      AV61GXV1 = 1 ;
      while ( AV61GXV1 <= AV41GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV42GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV41GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV61GXV1));
         if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV44FilterFullText = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMISRCOD") == 0 )
         {
            AV45TFMISRCod = (int)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV46TFMISRCod_To = (int)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMISRNOM") == 0 )
         {
            AV47TFMISRNom = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMISRNOM_SEL") == 0 )
         {
            AV48TFMISRNom_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMISRSTKACT") == 0 )
         {
            AV49TFMISRStkAct = CommonUtil.decimalVal( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV50TFMISRStkAct_To = CommonUtil.decimalVal( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMISRSTKTEO") == 0 )
         {
            AV51TFMISRStkTeo = CommonUtil.decimalVal( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV52TFMISRStkTeo_To = CommonUtil.decimalVal( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMISRSTKREA") == 0 )
         {
            AV53TFMISRStkRea = CommonUtil.decimalVal( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV54TFMISRStkRea_To = CommonUtil.decimalVal( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMISRSTKDIF") == 0 )
         {
            AV55TFMISRStkDif = CommonUtil.decimalVal( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV56TFMISRStkDif_To = CommonUtil.decimalVal( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV57EmprCod = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MISCOD") == 0 )
         {
            AV58MISCod = (int)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV61GXV1 = (int)(AV61GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADMISRNOMOPTIONS' Routine */
      returnInSub = false ;
      AV47TFMISRNom = AV26SearchTxt ;
      AV48TFMISRNom_Sel = "" ;
      AV63Wc_tminvstds_1_emprcod = AV57EmprCod ;
      AV64Wc_tminvstds_2_miscod = AV58MISCod ;
      AV65Wc_tminvstds_3_filterfulltext = AV44FilterFullText ;
      AV66Wc_tminvstds_4_tfmisrcod = AV45TFMISRCod ;
      AV67Wc_tminvstds_5_tfmisrcod_to = AV46TFMISRCod_To ;
      AV68Wc_tminvstds_6_tfmisrnom = AV47TFMISRNom ;
      AV69Wc_tminvstds_7_tfmisrnom_sel = AV48TFMISRNom_Sel ;
      AV70Wc_tminvstds_8_tfmisrstkact = AV49TFMISRStkAct ;
      AV71Wc_tminvstds_9_tfmisrstkact_to = AV50TFMISRStkAct_To ;
      AV72Wc_tminvstds_10_tfmisrstkteo = AV51TFMISRStkTeo ;
      AV73Wc_tminvstds_11_tfmisrstkteo_to = AV52TFMISRStkTeo_To ;
      AV74Wc_tminvstds_12_tfmisrstkrea = AV53TFMISRStkRea ;
      AV75Wc_tminvstds_13_tfmisrstkrea_to = AV54TFMISRStkRea_To ;
      AV76Wc_tminvstds_14_tfmisrstkdif = AV55TFMISRStkDif ;
      AV77Wc_tminvstds_15_tfmisrstkdif_to = AV56TFMISRStkDif_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV65Wc_tminvstds_3_filterfulltext ,
                                           Integer.valueOf(AV66Wc_tminvstds_4_tfmisrcod) ,
                                           Integer.valueOf(AV67Wc_tminvstds_5_tfmisrcod_to) ,
                                           AV69Wc_tminvstds_7_tfmisrnom_sel ,
                                           AV68Wc_tminvstds_6_tfmisrnom ,
                                           AV70Wc_tminvstds_8_tfmisrstkact ,
                                           AV71Wc_tminvstds_9_tfmisrstkact_to ,
                                           AV72Wc_tminvstds_10_tfmisrstkteo ,
                                           AV73Wc_tminvstds_11_tfmisrstkteo_to ,
                                           AV74Wc_tminvstds_12_tfmisrstkrea ,
                                           AV75Wc_tminvstds_13_tfmisrstkrea_to ,
                                           AV76Wc_tminvstds_14_tfmisrstkdif ,
                                           AV77Wc_tminvstds_15_tfmisrstkdif_to ,
                                           Integer.valueOf(A9403MISRCod) ,
                                           A9404MISRNom ,
                                           A9405MISRStkAct ,
                                           A9406MISRStkTeo ,
                                           A9407MISRStkRea ,
                                           A9408MISRStkDif ,
                                           AV63Wc_tminvstds_1_emprcod ,
                                           Integer.valueOf(AV64Wc_tminvstds_2_miscod) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A9398MISCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV65Wc_tminvstds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Wc_tminvstds_3_filterfulltext), "%", "") ;
      lV65Wc_tminvstds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Wc_tminvstds_3_filterfulltext), "%", "") ;
      lV65Wc_tminvstds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Wc_tminvstds_3_filterfulltext), "%", "") ;
      lV65Wc_tminvstds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Wc_tminvstds_3_filterfulltext), "%", "") ;
      lV65Wc_tminvstds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Wc_tminvstds_3_filterfulltext), "%", "") ;
      lV65Wc_tminvstds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Wc_tminvstds_3_filterfulltext), "%", "") ;
      lV68Wc_tminvstds_6_tfmisrnom = GXutil.padr( GXutil.rtrim( AV68Wc_tminvstds_6_tfmisrnom), 100, "%") ;
      /* Using cursor P08WS2 */
      pr_default.execute(0, new Object[] {AV63Wc_tminvstds_1_emprcod, Integer.valueOf(AV64Wc_tminvstds_2_miscod), lV65Wc_tminvstds_3_filterfulltext, lV65Wc_tminvstds_3_filterfulltext, lV65Wc_tminvstds_3_filterfulltext, lV65Wc_tminvstds_3_filterfulltext, lV65Wc_tminvstds_3_filterfulltext, lV65Wc_tminvstds_3_filterfulltext, Integer.valueOf(AV66Wc_tminvstds_4_tfmisrcod), Integer.valueOf(AV67Wc_tminvstds_5_tfmisrcod_to), lV68Wc_tminvstds_6_tfmisrnom, AV69Wc_tminvstds_7_tfmisrnom_sel, AV70Wc_tminvstds_8_tfmisrstkact, AV71Wc_tminvstds_9_tfmisrstkact_to, AV72Wc_tminvstds_10_tfmisrstkteo, AV73Wc_tminvstds_11_tfmisrstkteo_to, AV74Wc_tminvstds_12_tfmisrstkrea, AV75Wc_tminvstds_13_tfmisrstkrea_to, AV76Wc_tminvstds_14_tfmisrstkdif, AV77Wc_tminvstds_15_tfmisrstkdif_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8WS2 = false ;
         A9403MISRCod = P08WS2_A9403MISRCod[0] ;
         A9398MISCod = P08WS2_A9398MISCod[0] ;
         A396EmprCod = P08WS2_A396EmprCod[0] ;
         A9408MISRStkDif = P08WS2_A9408MISRStkDif[0] ;
         A9407MISRStkRea = P08WS2_A9407MISRStkRea[0] ;
         A9406MISRStkTeo = P08WS2_A9406MISRStkTeo[0] ;
         A9405MISRStkAct = P08WS2_A9405MISRStkAct[0] ;
         n9405MISRStkAct = P08WS2_n9405MISRStkAct[0] ;
         A9404MISRNom = P08WS2_A9404MISRNom[0] ;
         n9404MISRNom = P08WS2_n9404MISRNom[0] ;
         A9405MISRStkAct = P08WS2_A9405MISRStkAct[0] ;
         n9405MISRStkAct = P08WS2_n9405MISRStkAct[0] ;
         A9404MISRNom = P08WS2_A9404MISRNom[0] ;
         n9404MISRNom = P08WS2_n9404MISRNom[0] ;
         AV38count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08WS2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P08WS2_A9398MISCod[0] == A9398MISCod ) && ( P08WS2_A9403MISRCod[0] == A9403MISRCod ) )
         {
            brk8WS2 = false ;
            AV38count = (long)(AV38count+1) ;
            brk8WS2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A9404MISRNom)==0) )
         {
            AV30Option = A9404MISRNom ;
            AV29InsertIndex = 1 ;
            while ( ( AV29InsertIndex <= AV31Options.size() ) && ( GXutil.strcmp((String)AV31Options.elementAt(-1+AV29InsertIndex), AV30Option) < 0 ) )
            {
               AV29InsertIndex = (int)(AV29InsertIndex+1) ;
            }
            AV31Options.add(AV30Option, AV29InsertIndex);
            AV36OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV38count), "Z,ZZZ,ZZZ,ZZ9")), AV29InsertIndex);
         }
         if ( AV31Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8WS2 )
         {
            brk8WS2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = wc_tminvstgetfilterdata.this.AV32OptionsJson;
      this.aP4[0] = wc_tminvstgetfilterdata.this.AV35OptionsDescJson;
      this.aP5[0] = wc_tminvstgetfilterdata.this.AV37OptionIndexesJson;
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
      AV35OptionsDescJson = "" ;
      AV37OptionIndexesJson = "" ;
      AV31Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV34OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV36OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV39Session = httpContext.getWebSession();
      AV41GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV42GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV44FilterFullText = "" ;
      AV47TFMISRNom = "" ;
      AV48TFMISRNom_Sel = "" ;
      AV49TFMISRStkAct = DecimalUtil.ZERO ;
      AV50TFMISRStkAct_To = DecimalUtil.ZERO ;
      AV51TFMISRStkTeo = DecimalUtil.ZERO ;
      AV52TFMISRStkTeo_To = DecimalUtil.ZERO ;
      AV53TFMISRStkRea = DecimalUtil.ZERO ;
      AV54TFMISRStkRea_To = DecimalUtil.ZERO ;
      AV55TFMISRStkDif = DecimalUtil.ZERO ;
      AV56TFMISRStkDif_To = DecimalUtil.ZERO ;
      AV57EmprCod = "" ;
      A9404MISRNom = "" ;
      AV63Wc_tminvstds_1_emprcod = "" ;
      AV65Wc_tminvstds_3_filterfulltext = "" ;
      AV68Wc_tminvstds_6_tfmisrnom = "" ;
      AV69Wc_tminvstds_7_tfmisrnom_sel = "" ;
      AV70Wc_tminvstds_8_tfmisrstkact = DecimalUtil.ZERO ;
      AV71Wc_tminvstds_9_tfmisrstkact_to = DecimalUtil.ZERO ;
      AV72Wc_tminvstds_10_tfmisrstkteo = DecimalUtil.ZERO ;
      AV73Wc_tminvstds_11_tfmisrstkteo_to = DecimalUtil.ZERO ;
      AV74Wc_tminvstds_12_tfmisrstkrea = DecimalUtil.ZERO ;
      AV75Wc_tminvstds_13_tfmisrstkrea_to = DecimalUtil.ZERO ;
      AV76Wc_tminvstds_14_tfmisrstkdif = DecimalUtil.ZERO ;
      AV77Wc_tminvstds_15_tfmisrstkdif_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV65Wc_tminvstds_3_filterfulltext = "" ;
      lV68Wc_tminvstds_6_tfmisrnom = "" ;
      A9405MISRStkAct = DecimalUtil.ZERO ;
      A9406MISRStkTeo = DecimalUtil.ZERO ;
      A9407MISRStkRea = DecimalUtil.ZERO ;
      A9408MISRStkDif = DecimalUtil.ZERO ;
      A396EmprCod = "" ;
      P08WS2_A9403MISRCod = new int[1] ;
      P08WS2_A9398MISCod = new int[1] ;
      P08WS2_A396EmprCod = new String[] {""} ;
      P08WS2_A9408MISRStkDif = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08WS2_A9407MISRStkRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08WS2_A9406MISRStkTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08WS2_A9405MISRStkAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08WS2_n9405MISRStkAct = new boolean[] {false} ;
      P08WS2_A9404MISRNom = new String[] {""} ;
      P08WS2_n9404MISRNom = new boolean[] {false} ;
      AV30Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wc_tminvstgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08WS2_A9403MISRCod, P08WS2_A9398MISCod, P08WS2_A396EmprCod, P08WS2_A9408MISRStkDif, P08WS2_A9407MISRStkRea, P08WS2_A9406MISRStkTeo, P08WS2_A9405MISRStkAct, P08WS2_n9405MISRStkAct, P08WS2_A9404MISRNom, P08WS2_n9404MISRNom
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV61GXV1 ;
   private int AV45TFMISRCod ;
   private int AV46TFMISRCod_To ;
   private int AV58MISCod ;
   private int AV64Wc_tminvstds_2_miscod ;
   private int AV66Wc_tminvstds_4_tfmisrcod ;
   private int AV67Wc_tminvstds_5_tfmisrcod_to ;
   private int A9403MISRCod ;
   private int A9398MISCod ;
   private int AV29InsertIndex ;
   private long AV38count ;
   private java.math.BigDecimal AV49TFMISRStkAct ;
   private java.math.BigDecimal AV50TFMISRStkAct_To ;
   private java.math.BigDecimal AV51TFMISRStkTeo ;
   private java.math.BigDecimal AV52TFMISRStkTeo_To ;
   private java.math.BigDecimal AV53TFMISRStkRea ;
   private java.math.BigDecimal AV54TFMISRStkRea_To ;
   private java.math.BigDecimal AV55TFMISRStkDif ;
   private java.math.BigDecimal AV56TFMISRStkDif_To ;
   private java.math.BigDecimal AV70Wc_tminvstds_8_tfmisrstkact ;
   private java.math.BigDecimal AV71Wc_tminvstds_9_tfmisrstkact_to ;
   private java.math.BigDecimal AV72Wc_tminvstds_10_tfmisrstkteo ;
   private java.math.BigDecimal AV73Wc_tminvstds_11_tfmisrstkteo_to ;
   private java.math.BigDecimal AV74Wc_tminvstds_12_tfmisrstkrea ;
   private java.math.BigDecimal AV75Wc_tminvstds_13_tfmisrstkrea_to ;
   private java.math.BigDecimal AV76Wc_tminvstds_14_tfmisrstkdif ;
   private java.math.BigDecimal AV77Wc_tminvstds_15_tfmisrstkdif_to ;
   private java.math.BigDecimal A9405MISRStkAct ;
   private java.math.BigDecimal A9406MISRStkTeo ;
   private java.math.BigDecimal A9407MISRStkRea ;
   private java.math.BigDecimal A9408MISRStkDif ;
   private String AV47TFMISRNom ;
   private String AV48TFMISRNom_Sel ;
   private String AV57EmprCod ;
   private String A9404MISRNom ;
   private String AV63Wc_tminvstds_1_emprcod ;
   private String AV68Wc_tminvstds_6_tfmisrnom ;
   private String AV69Wc_tminvstds_7_tfmisrnom_sel ;
   private String scmdbuf ;
   private String lV68Wc_tminvstds_6_tfmisrnom ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk8WS2 ;
   private boolean n9405MISRStkAct ;
   private boolean n9404MISRNom ;
   private String AV32OptionsJson ;
   private String AV35OptionsDescJson ;
   private String AV37OptionIndexesJson ;
   private String AV28DDOName ;
   private String AV26SearchTxt ;
   private String AV27SearchTxtTo ;
   private String AV44FilterFullText ;
   private String AV65Wc_tminvstds_3_filterfulltext ;
   private String lV65Wc_tminvstds_3_filterfulltext ;
   private String AV30Option ;
   private com.genexus.webpanels.WebSession AV39Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private int[] P08WS2_A9403MISRCod ;
   private int[] P08WS2_A9398MISCod ;
   private String[] P08WS2_A396EmprCod ;
   private java.math.BigDecimal[] P08WS2_A9408MISRStkDif ;
   private java.math.BigDecimal[] P08WS2_A9407MISRStkRea ;
   private java.math.BigDecimal[] P08WS2_A9406MISRStkTeo ;
   private java.math.BigDecimal[] P08WS2_A9405MISRStkAct ;
   private boolean[] P08WS2_n9405MISRStkAct ;
   private String[] P08WS2_A9404MISRNom ;
   private boolean[] P08WS2_n9404MISRNom ;
   private GXSimpleCollection<String> AV31Options ;
   private GXSimpleCollection<String> AV34OptionsDesc ;
   private GXSimpleCollection<String> AV36OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV41GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV42GridStateFilterValue ;
}

final  class wc_tminvstgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08WS2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV65Wc_tminvstds_3_filterfulltext ,
                                          int AV66Wc_tminvstds_4_tfmisrcod ,
                                          int AV67Wc_tminvstds_5_tfmisrcod_to ,
                                          String AV69Wc_tminvstds_7_tfmisrnom_sel ,
                                          String AV68Wc_tminvstds_6_tfmisrnom ,
                                          java.math.BigDecimal AV70Wc_tminvstds_8_tfmisrstkact ,
                                          java.math.BigDecimal AV71Wc_tminvstds_9_tfmisrstkact_to ,
                                          java.math.BigDecimal AV72Wc_tminvstds_10_tfmisrstkteo ,
                                          java.math.BigDecimal AV73Wc_tminvstds_11_tfmisrstkteo_to ,
                                          java.math.BigDecimal AV74Wc_tminvstds_12_tfmisrstkrea ,
                                          java.math.BigDecimal AV75Wc_tminvstds_13_tfmisrstkrea_to ,
                                          java.math.BigDecimal AV76Wc_tminvstds_14_tfmisrstkdif ,
                                          java.math.BigDecimal AV77Wc_tminvstds_15_tfmisrstkdif_to ,
                                          int A9403MISRCod ,
                                          String A9404MISRNom ,
                                          java.math.BigDecimal A9405MISRStkAct ,
                                          java.math.BigDecimal A9406MISRStkTeo ,
                                          java.math.BigDecimal A9407MISRStkRea ,
                                          java.math.BigDecimal A9408MISRStkDif ,
                                          String AV63Wc_tminvstds_1_emprcod ,
                                          int AV64Wc_tminvstds_2_miscod ,
                                          String A396EmprCod ,
                                          int A9398MISCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[20];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.MISRCod AS MISRCod, T1.MISCod, T1.EmprCod, T1.MISRStkDif, T1.MISRStkRea, T1.MISRStkTeo, T2.MRStkAct AS MISRStkAct, T2.MRNom AS MISRNom FROM (TXPMInSRe" ;
      scmdbuf += " T1 INNER JOIN TXPMREPUE T2 ON T2.EmprCod = T1.EmprCod AND T2.MRCod = T1.MISRCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.MISCod = ?)");
      if ( ! (GXutil.strcmp("", AV65Wc_tminvstds_3_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.MISRCod,'99999990'), 2) like '%' || ?) or ( UPPER(T2.MRNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.MRStkAct,'999990.999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MISRStkTeo,'99999990.999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MISRStkRea,'999990.999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MISRStkDif,'999990.999'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
         GXv_int2[4] = (byte)(1) ;
         GXv_int2[5] = (byte)(1) ;
         GXv_int2[6] = (byte)(1) ;
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (0==AV66Wc_tminvstds_4_tfmisrcod) )
      {
         addWhere(sWhereString, "(T1.MISRCod >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (0==AV67Wc_tminvstds_5_tfmisrcod_to) )
      {
         addWhere(sWhereString, "(T1.MISRCod <= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Wc_tminvstds_7_tfmisrnom_sel)==0) && ( ! (GXutil.strcmp("", AV68Wc_tminvstds_6_tfmisrnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MRNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Wc_tminvstds_7_tfmisrnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MRNom = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70Wc_tminvstds_8_tfmisrstkact)==0) )
      {
         addWhere(sWhereString, "(T2.MRStkAct >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71Wc_tminvstds_9_tfmisrstkact_to)==0) )
      {
         addWhere(sWhereString, "(T2.MRStkAct <= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Wc_tminvstds_10_tfmisrstkteo)==0) )
      {
         addWhere(sWhereString, "(T1.MISRStkTeo >= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Wc_tminvstds_11_tfmisrstkteo_to)==0) )
      {
         addWhere(sWhereString, "(T1.MISRStkTeo <= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Wc_tminvstds_12_tfmisrstkrea)==0) )
      {
         addWhere(sWhereString, "(T1.MISRStkRea >= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Wc_tminvstds_13_tfmisrstkrea_to)==0) )
      {
         addWhere(sWhereString, "(T1.MISRStkRea <= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Wc_tminvstds_14_tfmisrstkdif)==0) )
      {
         addWhere(sWhereString, "(T1.MISRStkDif >= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Wc_tminvstds_15_tfmisrstkdif_to)==0) )
      {
         addWhere(sWhereString, "(T1.MISRStkDif <= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.MISCod, T1.MISRCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
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
                  return conditional_P08WS2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08WS2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,3);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,3);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,3);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 100);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[20], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[32], 3);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[33], 3);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 3);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 3);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 3);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 3);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 3);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 3);
               }
               return;
      }
   }

}

