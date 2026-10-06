package app.almacensindetalle ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class devoluciontejido_7getfilterdata extends GXProcedure
{
   public devoluciontejido_7getfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( devoluciontejido_7getfilterdata.class ), "" );
   }

   public devoluciontejido_7getfilterdata( int remoteHandle ,
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
      devoluciontejido_7getfilterdata.this.aP5 = new String[] {""};
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
      devoluciontejido_7getfilterdata.this.AV67DDOName = aP0;
      devoluciontejido_7getfilterdata.this.AV68SearchTxt = aP1;
      devoluciontejido_7getfilterdata.this.AV69SearchTxtTo = aP2;
      devoluciontejido_7getfilterdata.this.aP3 = aP3;
      devoluciontejido_7getfilterdata.this.aP4 = aP4;
      devoluciontejido_7getfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV57Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV59OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV60OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV67DDOName), "DDO_ALBREF") == 0 )
      {
         /* Execute user subroutine: 'LOADALBREFOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV67DDOName), "DDO_ALBREFDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADALBREFDSCOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV70OptionsJson = AV57Options.toJSonString(false) ;
      AV71OptionsDescJson = AV59OptionsDesc.toJSonString(false) ;
      AV72OptionIndexesJson = AV60OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV62Session.getValue("AlmacenSinDetalle.DevolucionTejido_7GridState"), "") == 0 )
      {
         AV64GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "AlmacenSinDetalle.DevolucionTejido_7GridState"), null, null);
      }
      else
      {
         AV64GridState.fromxml(AV62Session.getValue("AlmacenSinDetalle.DevolucionTejido_7GridState"), null, null);
      }
      AV88GXV1 = 1 ;
      while ( AV88GXV1 <= AV64GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV65GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV64GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV88GXV1));
         if ( GXutil.strcmp(AV65GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRECCOD") == 0 )
         {
            AV74TFAlbRecCod = (int)(GXutil.lval( AV65GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV75TFAlbRecCod_To = (int)(GXutil.lval( AV65GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV65GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF") == 0 )
         {
            AV76TFAlbRef = AV65GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV65GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF_SEL") == 0 )
         {
            AV77TFAlbRef_Sel = AV65GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV65GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREFDSC") == 0 )
         {
            AV78TFAlbRefDsc = AV65GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV65GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREFDSC_SEL") == 0 )
         {
            AV79TFAlbRefDsc_Sel = AV65GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV65GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUUND") == 0 )
         {
            AV80TFDevCruUnd = CommonUtil.decimalVal( AV65GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV81TFDevCruUnd_To = CommonUtil.decimalVal( AV65GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV65GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUPZS") == 0 )
         {
            AV82TFDevCruPzs = (int)(GXutil.lval( AV65GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV83TFDevCruPzs_To = (int)(GXutil.lval( AV65GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         AV88GXV1 = (int)(AV88GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADALBREFOPTIONS' Routine */
      returnInSub = false ;
      AV76TFAlbRef = AV68SearchTxt ;
      AV77TFAlbRef_Sel = "" ;
      AV90Almacensindetalle_devoluciontejido_7ds_1_tfalbreccod = AV74TFAlbRecCod ;
      AV91Almacensindetalle_devoluciontejido_7ds_2_tfalbreccod_to = AV75TFAlbRecCod_To ;
      AV92Almacensindetalle_devoluciontejido_7ds_3_tfalbref = AV76TFAlbRef ;
      AV93Almacensindetalle_devoluciontejido_7ds_4_tfalbref_sel = AV77TFAlbRef_Sel ;
      AV94Almacensindetalle_devoluciontejido_7ds_5_tfalbrefdsc = AV78TFAlbRefDsc ;
      AV95Almacensindetalle_devoluciontejido_7ds_6_tfalbrefdsc_sel = AV79TFAlbRefDsc_Sel ;
      AV96Almacensindetalle_devoluciontejido_7ds_7_tfdevcruund = AV80TFDevCruUnd ;
      AV97Almacensindetalle_devoluciontejido_7ds_8_tfdevcruund_to = AV81TFDevCruUnd_To ;
      AV98Almacensindetalle_devoluciontejido_7ds_9_tfdevcrupzs = AV82TFDevCruPzs ;
      AV99Almacensindetalle_devoluciontejido_7ds_10_tfdevcrupzs_to = AV83TFDevCruPzs_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV90Almacensindetalle_devoluciontejido_7ds_1_tfalbreccod) ,
                                           Integer.valueOf(AV91Almacensindetalle_devoluciontejido_7ds_2_tfalbreccod_to) ,
                                           AV93Almacensindetalle_devoluciontejido_7ds_4_tfalbref_sel ,
                                           AV92Almacensindetalle_devoluciontejido_7ds_3_tfalbref ,
                                           AV95Almacensindetalle_devoluciontejido_7ds_6_tfalbrefdsc_sel ,
                                           AV94Almacensindetalle_devoluciontejido_7ds_5_tfalbrefdsc ,
                                           AV96Almacensindetalle_devoluciontejido_7ds_7_tfdevcruund ,
                                           AV97Almacensindetalle_devoluciontejido_7ds_8_tfdevcruund_to ,
                                           Integer.valueOf(AV98Almacensindetalle_devoluciontejido_7ds_9_tfdevcrupzs) ,
                                           Integer.valueOf(AV99Almacensindetalle_devoluciontejido_7ds_10_tfdevcrupzs_to) ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A45AlbRef ,
                                           A3613AlbRefDsc ,
                                           Integer.valueOf(A11669DevCruId) ,
                                           Integer.valueOf(AV85DevCruId) ,
                                           AV84EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor P0AIA2 */
      pr_default.execute(0, new Object[] {AV84EmprCod, Integer.valueOf(AV85DevCruId)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkAIA2 = false ;
         A396EmprCod = P0AIA2_A396EmprCod[0] ;
         A11669DevCruId = P0AIA2_A11669DevCruId[0] ;
         AV61count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0AIA2_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            brkAIA2 = false ;
            A11669DevCruId = P0AIA2_A11669DevCruId[0] ;
            AV61count = (long)(AV61count+1) ;
            brkAIA2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A45AlbRef)==0) )
         {
            AV56Option = A45AlbRef ;
            AV55InsertIndex = 1 ;
            while ( ( AV55InsertIndex <= AV57Options.size() ) && ( GXutil.strcmp((String)AV57Options.elementAt(-1+AV55InsertIndex), AV56Option) < 0 ) )
            {
               AV55InsertIndex = (int)(AV55InsertIndex+1) ;
            }
            AV57Options.add(AV56Option, AV55InsertIndex);
            AV60OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV61count), "Z,ZZZ,ZZZ,ZZ9")), AV55InsertIndex);
         }
         if ( AV57Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAIA2 )
         {
            brkAIA2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADALBREFDSCOPTIONS' Routine */
      returnInSub = false ;
      AV78TFAlbRefDsc = AV68SearchTxt ;
      AV79TFAlbRefDsc_Sel = "" ;
      AV90Almacensindetalle_devoluciontejido_7ds_1_tfalbreccod = AV74TFAlbRecCod ;
      AV91Almacensindetalle_devoluciontejido_7ds_2_tfalbreccod_to = AV75TFAlbRecCod_To ;
      AV92Almacensindetalle_devoluciontejido_7ds_3_tfalbref = AV76TFAlbRef ;
      AV93Almacensindetalle_devoluciontejido_7ds_4_tfalbref_sel = AV77TFAlbRef_Sel ;
      AV94Almacensindetalle_devoluciontejido_7ds_5_tfalbrefdsc = AV78TFAlbRefDsc ;
      AV95Almacensindetalle_devoluciontejido_7ds_6_tfalbrefdsc_sel = AV79TFAlbRefDsc_Sel ;
      AV96Almacensindetalle_devoluciontejido_7ds_7_tfdevcruund = AV80TFDevCruUnd ;
      AV97Almacensindetalle_devoluciontejido_7ds_8_tfdevcruund_to = AV81TFDevCruUnd_To ;
      AV98Almacensindetalle_devoluciontejido_7ds_9_tfdevcrupzs = AV82TFDevCruPzs ;
      AV99Almacensindetalle_devoluciontejido_7ds_10_tfdevcrupzs_to = AV83TFDevCruPzs_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Integer.valueOf(AV90Almacensindetalle_devoluciontejido_7ds_1_tfalbreccod) ,
                                           Integer.valueOf(AV91Almacensindetalle_devoluciontejido_7ds_2_tfalbreccod_to) ,
                                           AV93Almacensindetalle_devoluciontejido_7ds_4_tfalbref_sel ,
                                           AV92Almacensindetalle_devoluciontejido_7ds_3_tfalbref ,
                                           AV95Almacensindetalle_devoluciontejido_7ds_6_tfalbrefdsc_sel ,
                                           AV94Almacensindetalle_devoluciontejido_7ds_5_tfalbrefdsc ,
                                           AV96Almacensindetalle_devoluciontejido_7ds_7_tfdevcruund ,
                                           AV97Almacensindetalle_devoluciontejido_7ds_8_tfdevcruund_to ,
                                           Integer.valueOf(AV98Almacensindetalle_devoluciontejido_7ds_9_tfdevcrupzs) ,
                                           Integer.valueOf(AV99Almacensindetalle_devoluciontejido_7ds_10_tfdevcrupzs_to) ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A45AlbRef ,
                                           A3613AlbRefDsc ,
                                           A396EmprCod ,
                                           AV84EmprCod ,
                                           Integer.valueOf(A11669DevCruId) ,
                                           Integer.valueOf(AV85DevCruId) } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT
                                           }
      });
      /* Using cursor P0AIA3 */
      pr_default.execute(1, new Object[] {AV84EmprCod, Integer.valueOf(AV85DevCruId)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brkAIA4 = false ;
         A396EmprCod = P0AIA3_A396EmprCod[0] ;
         A11669DevCruId = P0AIA3_A11669DevCruId[0] ;
         AV61count = 0 ;
         while ( (pr_default.getStatus(1) != 101) )
         {
            brkAIA4 = false ;
            A396EmprCod = P0AIA3_A396EmprCod[0] ;
            A11669DevCruId = P0AIA3_A11669DevCruId[0] ;
            AV61count = (long)(AV61count+1) ;
            brkAIA4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A3613AlbRefDsc)==0) )
         {
            AV56Option = A3613AlbRefDsc ;
            AV57Options.add(AV56Option, 0);
            AV60OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV61count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV57Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAIA4 )
         {
            brkAIA4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = devoluciontejido_7getfilterdata.this.AV70OptionsJson;
      this.aP4[0] = devoluciontejido_7getfilterdata.this.AV71OptionsDescJson;
      this.aP5[0] = devoluciontejido_7getfilterdata.this.AV72OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV70OptionsJson = "" ;
      AV71OptionsDescJson = "" ;
      AV72OptionIndexesJson = "" ;
      AV57Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV59OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV60OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV62Session = httpContext.getWebSession();
      AV64GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV65GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV76TFAlbRef = "" ;
      AV77TFAlbRef_Sel = "" ;
      AV78TFAlbRefDsc = "" ;
      AV79TFAlbRefDsc_Sel = "" ;
      AV80TFDevCruUnd = DecimalUtil.ZERO ;
      AV81TFDevCruUnd_To = DecimalUtil.ZERO ;
      A45AlbRef = "" ;
      AV92Almacensindetalle_devoluciontejido_7ds_3_tfalbref = "" ;
      AV93Almacensindetalle_devoluciontejido_7ds_4_tfalbref_sel = "" ;
      AV94Almacensindetalle_devoluciontejido_7ds_5_tfalbrefdsc = "" ;
      AV95Almacensindetalle_devoluciontejido_7ds_6_tfalbrefdsc_sel = "" ;
      AV96Almacensindetalle_devoluciontejido_7ds_7_tfdevcruund = DecimalUtil.ZERO ;
      AV97Almacensindetalle_devoluciontejido_7ds_8_tfdevcruund_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      A3613AlbRefDsc = "" ;
      AV84EmprCod = "" ;
      A396EmprCod = "" ;
      P0AIA2_A396EmprCod = new String[] {""} ;
      P0AIA2_A11669DevCruId = new int[1] ;
      AV56Option = "" ;
      P0AIA3_A396EmprCod = new String[] {""} ;
      P0AIA3_A11669DevCruId = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.almacensindetalle.devoluciontejido_7getfilterdata__default(),
         new Object[] {
             new Object[] {
            P0AIA2_A396EmprCod, P0AIA2_A11669DevCruId
            }
            , new Object[] {
            P0AIA3_A396EmprCod, P0AIA3_A11669DevCruId
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV88GXV1 ;
   private int AV74TFAlbRecCod ;
   private int AV75TFAlbRecCod_To ;
   private int AV82TFDevCruPzs ;
   private int AV83TFDevCruPzs_To ;
   private int AV90Almacensindetalle_devoluciontejido_7ds_1_tfalbreccod ;
   private int AV91Almacensindetalle_devoluciontejido_7ds_2_tfalbreccod_to ;
   private int AV98Almacensindetalle_devoluciontejido_7ds_9_tfdevcrupzs ;
   private int AV99Almacensindetalle_devoluciontejido_7ds_10_tfdevcrupzs_to ;
   private int A44AlbRecCod ;
   private int A11669DevCruId ;
   private int AV85DevCruId ;
   private int AV55InsertIndex ;
   private long AV61count ;
   private java.math.BigDecimal AV80TFDevCruUnd ;
   private java.math.BigDecimal AV81TFDevCruUnd_To ;
   private java.math.BigDecimal AV96Almacensindetalle_devoluciontejido_7ds_7_tfdevcruund ;
   private java.math.BigDecimal AV97Almacensindetalle_devoluciontejido_7ds_8_tfdevcruund_to ;
   private String AV76TFAlbRef ;
   private String AV77TFAlbRef_Sel ;
   private String AV78TFAlbRefDsc ;
   private String AV79TFAlbRefDsc_Sel ;
   private String A45AlbRef ;
   private String AV92Almacensindetalle_devoluciontejido_7ds_3_tfalbref ;
   private String AV93Almacensindetalle_devoluciontejido_7ds_4_tfalbref_sel ;
   private String AV94Almacensindetalle_devoluciontejido_7ds_5_tfalbrefdsc ;
   private String AV95Almacensindetalle_devoluciontejido_7ds_6_tfalbrefdsc_sel ;
   private String scmdbuf ;
   private String A3613AlbRefDsc ;
   private String AV84EmprCod ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brkAIA2 ;
   private boolean brkAIA4 ;
   private String AV70OptionsJson ;
   private String AV71OptionsDescJson ;
   private String AV72OptionIndexesJson ;
   private String AV67DDOName ;
   private String AV68SearchTxt ;
   private String AV69SearchTxtTo ;
   private String AV56Option ;
   private com.genexus.webpanels.WebSession AV62Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AIA2_A396EmprCod ;
   private int[] P0AIA2_A11669DevCruId ;
   private String[] P0AIA3_A396EmprCod ;
   private int[] P0AIA3_A11669DevCruId ;
   private GXSimpleCollection<String> AV57Options ;
   private GXSimpleCollection<String> AV59OptionsDesc ;
   private GXSimpleCollection<String> AV60OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV64GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV65GridStateFilterValue ;
}

final  class devoluciontejido_7getfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AIA2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV90Almacensindetalle_devoluciontejido_7ds_1_tfalbreccod ,
                                          int AV91Almacensindetalle_devoluciontejido_7ds_2_tfalbreccod_to ,
                                          String AV93Almacensindetalle_devoluciontejido_7ds_4_tfalbref_sel ,
                                          String AV92Almacensindetalle_devoluciontejido_7ds_3_tfalbref ,
                                          String AV95Almacensindetalle_devoluciontejido_7ds_6_tfalbrefdsc_sel ,
                                          String AV94Almacensindetalle_devoluciontejido_7ds_5_tfalbrefdsc ,
                                          java.math.BigDecimal AV96Almacensindetalle_devoluciontejido_7ds_7_tfdevcruund ,
                                          java.math.BigDecimal AV97Almacensindetalle_devoluciontejido_7ds_8_tfdevcruund_to ,
                                          int AV98Almacensindetalle_devoluciontejido_7ds_9_tfdevcrupzs ,
                                          int AV99Almacensindetalle_devoluciontejido_7ds_10_tfdevcrupzs_to ,
                                          int A44AlbRecCod ,
                                          String A45AlbRef ,
                                          String A3613AlbRefDsc ,
                                          int A11669DevCruId ,
                                          int AV85DevCruId ,
                                          String AV84EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[2];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT EmprCod, DevCruId FROM TXPDEVCRU" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(DevCruId = ?)");
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P0AIA3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV90Almacensindetalle_devoluciontejido_7ds_1_tfalbreccod ,
                                          int AV91Almacensindetalle_devoluciontejido_7ds_2_tfalbreccod_to ,
                                          String AV93Almacensindetalle_devoluciontejido_7ds_4_tfalbref_sel ,
                                          String AV92Almacensindetalle_devoluciontejido_7ds_3_tfalbref ,
                                          String AV95Almacensindetalle_devoluciontejido_7ds_6_tfalbrefdsc_sel ,
                                          String AV94Almacensindetalle_devoluciontejido_7ds_5_tfalbrefdsc ,
                                          java.math.BigDecimal AV96Almacensindetalle_devoluciontejido_7ds_7_tfdevcruund ,
                                          java.math.BigDecimal AV97Almacensindetalle_devoluciontejido_7ds_8_tfdevcruund_to ,
                                          int AV98Almacensindetalle_devoluciontejido_7ds_9_tfdevcrupzs ,
                                          int AV99Almacensindetalle_devoluciontejido_7ds_10_tfdevcrupzs_to ,
                                          int A44AlbRecCod ,
                                          String A45AlbRef ,
                                          String A3613AlbRefDsc ,
                                          String A396EmprCod ,
                                          String AV84EmprCod ,
                                          int A11669DevCruId ,
                                          int AV85DevCruId )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[2];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT EmprCod, DevCruId FROM TXPDEVCRU" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(DevCruId = ?)");
      scmdbuf += sWhereString ;
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
                  return conditional_P0AIA2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] );
            case 1 :
                  return conditional_P0AIA3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AIA2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AIA3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
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
                  stmt.setString(sIdx, (String)parms[2], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[3]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[2], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[3]).intValue());
               }
               return;
      }
   }

}

