package app.controlcalidadhtd ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class controlcalidad_ccdef2_wpgetfilterdata extends GXProcedure
{
   public controlcalidad_ccdef2_wpgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( controlcalidad_ccdef2_wpgetfilterdata.class ), "" );
   }

   public controlcalidad_ccdef2_wpgetfilterdata( int remoteHandle ,
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
      controlcalidad_ccdef2_wpgetfilterdata.this.aP5 = new String[] {""};
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
      controlcalidad_ccdef2_wpgetfilterdata.this.AV28DDOName = aP0;
      controlcalidad_ccdef2_wpgetfilterdata.this.AV29SearchTxt = aP1;
      controlcalidad_ccdef2_wpgetfilterdata.this.AV30SearchTxtTo = aP2;
      controlcalidad_ccdef2_wpgetfilterdata.this.aP3 = aP3;
      controlcalidad_ccdef2_wpgetfilterdata.this.aP4 = aP4;
      controlcalidad_ccdef2_wpgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV18Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV20OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV21OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_CCTVALDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADCCTVALDSCOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_CCTVAL") == 0 )
      {
         /* Execute user subroutine: 'LOADCCTVALOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV31OptionsJson = AV18Options.toJSonString(false) ;
      AV32OptionsDescJson = AV20OptionsDesc.toJSonString(false) ;
      AV33OptionIndexesJson = AV21OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV23Session.getValue("ControlCalidadHTD.ControlCalidad_CCDEF2_WPGridState"), "") == 0 )
      {
         AV25GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ControlCalidadHTD.ControlCalidad_CCDEF2_WPGridState"), null, null);
      }
      else
      {
         AV25GridState.fromxml(AV23Session.getValue("ControlCalidadHTD.ControlCalidad_CCDEF2_WPGridState"), null, null);
      }
      AV39GXV1 = 1 ;
      while ( AV39GXV1 <= AV25GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV26GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV25GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV39GXV1));
         if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTVALLIN") == 0 )
         {
            AV10TFCCTValLin = (byte)(GXutil.lval( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFCCTValLin_To = (byte)(GXutil.lval( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTVALDSC") == 0 )
         {
            AV12TFCCTValDsc = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTVALDSC_SEL") == 0 )
         {
            AV13TFCCTValDsc_Sel = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTVAL") == 0 )
         {
            AV14TFCCTVal = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTVAL_SEL") == 0 )
         {
            AV15TFCCTVal_Sel = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV39GXV1 = (int)(AV39GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCCTVALDSCOPTIONS' Routine */
      returnInSub = false ;
      AV12TFCCTValDsc = AV29SearchTxt ;
      AV13TFCCTValDsc_Sel = "" ;
      AV41Controlcalidadhtd_controlcalidad_ccdef2_wpds_1_tfcctvallin = AV10TFCCTValLin ;
      AV42Controlcalidadhtd_controlcalidad_ccdef2_wpds_2_tfcctvallin_to = AV11TFCCTValLin_To ;
      AV43Controlcalidadhtd_controlcalidad_ccdef2_wpds_3_tfcctvaldsc = AV12TFCCTValDsc ;
      AV44Controlcalidadhtd_controlcalidad_ccdef2_wpds_4_tfcctvaldsc_sel = AV13TFCCTValDsc_Sel ;
      AV45Controlcalidadhtd_controlcalidad_ccdef2_wpds_5_tfcctval = AV14TFCCTVal ;
      AV46Controlcalidadhtd_controlcalidad_ccdef2_wpds_6_tfcctval_sel = AV15TFCCTVal_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(AV41Controlcalidadhtd_controlcalidad_ccdef2_wpds_1_tfcctvallin) ,
                                           Byte.valueOf(AV42Controlcalidadhtd_controlcalidad_ccdef2_wpds_2_tfcctvallin_to) ,
                                           AV44Controlcalidadhtd_controlcalidad_ccdef2_wpds_4_tfcctvaldsc_sel ,
                                           AV43Controlcalidadhtd_controlcalidad_ccdef2_wpds_3_tfcctvaldsc ,
                                           AV46Controlcalidadhtd_controlcalidad_ccdef2_wpds_6_tfcctval_sel ,
                                           AV45Controlcalidadhtd_controlcalidad_ccdef2_wpds_5_tfcctval ,
                                           Byte.valueOf(A4049CCTValLin) ,
                                           A4050CCTValDsc ,
                                           A4051CCTVal ,
                                           A396EmprCod ,
                                           AV34emprcod ,
                                           Integer.valueOf(A4031CCTCod) ,
                                           Integer.valueOf(AV35CCTCod) ,
                                           Short.valueOf(A4034CCTLin) ,
                                           Short.valueOf(AV36CCtlin) } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT
                                           }
      });
      lV43Controlcalidadhtd_controlcalidad_ccdef2_wpds_3_tfcctvaldsc = GXutil.padr( GXutil.rtrim( AV43Controlcalidadhtd_controlcalidad_ccdef2_wpds_3_tfcctvaldsc), 30, "%") ;
      lV45Controlcalidadhtd_controlcalidad_ccdef2_wpds_5_tfcctval = GXutil.padr( GXutil.rtrim( AV45Controlcalidadhtd_controlcalidad_ccdef2_wpds_5_tfcctval), 40, "%") ;
      /* Using cursor P0APK2 */
      pr_default.execute(0, new Object[] {AV34emprcod, Integer.valueOf(AV35CCTCod), Short.valueOf(AV36CCtlin), Byte.valueOf(AV41Controlcalidadhtd_controlcalidad_ccdef2_wpds_1_tfcctvallin), Byte.valueOf(AV42Controlcalidadhtd_controlcalidad_ccdef2_wpds_2_tfcctvallin_to), lV43Controlcalidadhtd_controlcalidad_ccdef2_wpds_3_tfcctvaldsc, AV44Controlcalidadhtd_controlcalidad_ccdef2_wpds_4_tfcctvaldsc_sel, lV45Controlcalidadhtd_controlcalidad_ccdef2_wpds_5_tfcctval, AV46Controlcalidadhtd_controlcalidad_ccdef2_wpds_6_tfcctval_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkAPK2 = false ;
         A396EmprCod = P0APK2_A396EmprCod[0] ;
         A4031CCTCod = P0APK2_A4031CCTCod[0] ;
         A4034CCTLin = P0APK2_A4034CCTLin[0] ;
         A4050CCTValDsc = P0APK2_A4050CCTValDsc[0] ;
         A4051CCTVal = P0APK2_A4051CCTVal[0] ;
         A4049CCTValLin = P0APK2_A4049CCTValLin[0] ;
         AV22count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0APK2_A4050CCTValDsc[0], A4050CCTValDsc) == 0 ) )
         {
            brkAPK2 = false ;
            A396EmprCod = P0APK2_A396EmprCod[0] ;
            A4031CCTCod = P0APK2_A4031CCTCod[0] ;
            A4034CCTLin = P0APK2_A4034CCTLin[0] ;
            A4049CCTValLin = P0APK2_A4049CCTValLin[0] ;
            AV22count = (long)(AV22count+1) ;
            brkAPK2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A4050CCTValDsc)==0) )
         {
            AV17Option = A4050CCTValDsc ;
            AV18Options.add(AV17Option, 0);
            AV21OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV22count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV18Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAPK2 )
         {
            brkAPK2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADCCTVALOPTIONS' Routine */
      returnInSub = false ;
      AV14TFCCTVal = AV29SearchTxt ;
      AV15TFCCTVal_Sel = "" ;
      AV41Controlcalidadhtd_controlcalidad_ccdef2_wpds_1_tfcctvallin = AV10TFCCTValLin ;
      AV42Controlcalidadhtd_controlcalidad_ccdef2_wpds_2_tfcctvallin_to = AV11TFCCTValLin_To ;
      AV43Controlcalidadhtd_controlcalidad_ccdef2_wpds_3_tfcctvaldsc = AV12TFCCTValDsc ;
      AV44Controlcalidadhtd_controlcalidad_ccdef2_wpds_4_tfcctvaldsc_sel = AV13TFCCTValDsc_Sel ;
      AV45Controlcalidadhtd_controlcalidad_ccdef2_wpds_5_tfcctval = AV14TFCCTVal ;
      AV46Controlcalidadhtd_controlcalidad_ccdef2_wpds_6_tfcctval_sel = AV15TFCCTVal_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Byte.valueOf(AV41Controlcalidadhtd_controlcalidad_ccdef2_wpds_1_tfcctvallin) ,
                                           Byte.valueOf(AV42Controlcalidadhtd_controlcalidad_ccdef2_wpds_2_tfcctvallin_to) ,
                                           AV44Controlcalidadhtd_controlcalidad_ccdef2_wpds_4_tfcctvaldsc_sel ,
                                           AV43Controlcalidadhtd_controlcalidad_ccdef2_wpds_3_tfcctvaldsc ,
                                           AV46Controlcalidadhtd_controlcalidad_ccdef2_wpds_6_tfcctval_sel ,
                                           AV45Controlcalidadhtd_controlcalidad_ccdef2_wpds_5_tfcctval ,
                                           Byte.valueOf(A4049CCTValLin) ,
                                           A4050CCTValDsc ,
                                           A4051CCTVal ,
                                           A396EmprCod ,
                                           AV34emprcod ,
                                           Integer.valueOf(A4031CCTCod) ,
                                           Integer.valueOf(AV35CCTCod) ,
                                           Short.valueOf(A4034CCTLin) ,
                                           Short.valueOf(AV36CCtlin) } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT
                                           }
      });
      lV43Controlcalidadhtd_controlcalidad_ccdef2_wpds_3_tfcctvaldsc = GXutil.padr( GXutil.rtrim( AV43Controlcalidadhtd_controlcalidad_ccdef2_wpds_3_tfcctvaldsc), 30, "%") ;
      lV45Controlcalidadhtd_controlcalidad_ccdef2_wpds_5_tfcctval = GXutil.padr( GXutil.rtrim( AV45Controlcalidadhtd_controlcalidad_ccdef2_wpds_5_tfcctval), 40, "%") ;
      /* Using cursor P0APK3 */
      pr_default.execute(1, new Object[] {AV34emprcod, Integer.valueOf(AV35CCTCod), Short.valueOf(AV36CCtlin), Byte.valueOf(AV41Controlcalidadhtd_controlcalidad_ccdef2_wpds_1_tfcctvallin), Byte.valueOf(AV42Controlcalidadhtd_controlcalidad_ccdef2_wpds_2_tfcctvallin_to), lV43Controlcalidadhtd_controlcalidad_ccdef2_wpds_3_tfcctvaldsc, AV44Controlcalidadhtd_controlcalidad_ccdef2_wpds_4_tfcctvaldsc_sel, lV45Controlcalidadhtd_controlcalidad_ccdef2_wpds_5_tfcctval, AV46Controlcalidadhtd_controlcalidad_ccdef2_wpds_6_tfcctval_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brkAPK4 = false ;
         A396EmprCod = P0APK3_A396EmprCod[0] ;
         A4031CCTCod = P0APK3_A4031CCTCod[0] ;
         A4034CCTLin = P0APK3_A4034CCTLin[0] ;
         A4051CCTVal = P0APK3_A4051CCTVal[0] ;
         A4050CCTValDsc = P0APK3_A4050CCTValDsc[0] ;
         A4049CCTValLin = P0APK3_A4049CCTValLin[0] ;
         AV22count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P0APK3_A4051CCTVal[0], A4051CCTVal) == 0 ) )
         {
            brkAPK4 = false ;
            A396EmprCod = P0APK3_A396EmprCod[0] ;
            A4031CCTCod = P0APK3_A4031CCTCod[0] ;
            A4034CCTLin = P0APK3_A4034CCTLin[0] ;
            A4049CCTValLin = P0APK3_A4049CCTValLin[0] ;
            AV22count = (long)(AV22count+1) ;
            brkAPK4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A4051CCTVal)==0) )
         {
            AV17Option = A4051CCTVal ;
            AV18Options.add(AV17Option, 0);
            AV21OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV22count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV18Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAPK4 )
         {
            brkAPK4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = controlcalidad_ccdef2_wpgetfilterdata.this.AV31OptionsJson;
      this.aP4[0] = controlcalidad_ccdef2_wpgetfilterdata.this.AV32OptionsDescJson;
      this.aP5[0] = controlcalidad_ccdef2_wpgetfilterdata.this.AV33OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV31OptionsJson = "" ;
      AV32OptionsDescJson = "" ;
      AV33OptionIndexesJson = "" ;
      AV18Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV20OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV21OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV23Session = httpContext.getWebSession();
      AV25GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV26GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV12TFCCTValDsc = "" ;
      AV13TFCCTValDsc_Sel = "" ;
      AV14TFCCTVal = "" ;
      AV15TFCCTVal_Sel = "" ;
      A4050CCTValDsc = "" ;
      AV43Controlcalidadhtd_controlcalidad_ccdef2_wpds_3_tfcctvaldsc = "" ;
      AV44Controlcalidadhtd_controlcalidad_ccdef2_wpds_4_tfcctvaldsc_sel = "" ;
      AV45Controlcalidadhtd_controlcalidad_ccdef2_wpds_5_tfcctval = "" ;
      AV46Controlcalidadhtd_controlcalidad_ccdef2_wpds_6_tfcctval_sel = "" ;
      scmdbuf = "" ;
      lV43Controlcalidadhtd_controlcalidad_ccdef2_wpds_3_tfcctvaldsc = "" ;
      lV45Controlcalidadhtd_controlcalidad_ccdef2_wpds_5_tfcctval = "" ;
      A4051CCTVal = "" ;
      A396EmprCod = "" ;
      AV34emprcod = "" ;
      P0APK2_A396EmprCod = new String[] {""} ;
      P0APK2_A4031CCTCod = new int[1] ;
      P0APK2_A4034CCTLin = new short[1] ;
      P0APK2_A4050CCTValDsc = new String[] {""} ;
      P0APK2_A4051CCTVal = new String[] {""} ;
      P0APK2_A4049CCTValLin = new byte[1] ;
      AV17Option = "" ;
      P0APK3_A396EmprCod = new String[] {""} ;
      P0APK3_A4031CCTCod = new int[1] ;
      P0APK3_A4034CCTLin = new short[1] ;
      P0APK3_A4051CCTVal = new String[] {""} ;
      P0APK3_A4050CCTValDsc = new String[] {""} ;
      P0APK3_A4049CCTValLin = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.controlcalidad_ccdef2_wpgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0APK2_A396EmprCod, P0APK2_A4031CCTCod, P0APK2_A4034CCTLin, P0APK2_A4050CCTValDsc, P0APK2_A4051CCTVal, P0APK2_A4049CCTValLin
            }
            , new Object[] {
            P0APK3_A396EmprCod, P0APK3_A4031CCTCod, P0APK3_A4034CCTLin, P0APK3_A4051CCTVal, P0APK3_A4050CCTValDsc, P0APK3_A4049CCTValLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10TFCCTValLin ;
   private byte AV11TFCCTValLin_To ;
   private byte AV41Controlcalidadhtd_controlcalidad_ccdef2_wpds_1_tfcctvallin ;
   private byte AV42Controlcalidadhtd_controlcalidad_ccdef2_wpds_2_tfcctvallin_to ;
   private byte A4049CCTValLin ;
   private short A4034CCTLin ;
   private short AV36CCtlin ;
   private short Gx_err ;
   private int AV39GXV1 ;
   private int A4031CCTCod ;
   private int AV35CCTCod ;
   private long AV22count ;
   private String AV12TFCCTValDsc ;
   private String AV13TFCCTValDsc_Sel ;
   private String AV14TFCCTVal ;
   private String AV15TFCCTVal_Sel ;
   private String A4050CCTValDsc ;
   private String AV43Controlcalidadhtd_controlcalidad_ccdef2_wpds_3_tfcctvaldsc ;
   private String AV44Controlcalidadhtd_controlcalidad_ccdef2_wpds_4_tfcctvaldsc_sel ;
   private String AV45Controlcalidadhtd_controlcalidad_ccdef2_wpds_5_tfcctval ;
   private String AV46Controlcalidadhtd_controlcalidad_ccdef2_wpds_6_tfcctval_sel ;
   private String scmdbuf ;
   private String lV43Controlcalidadhtd_controlcalidad_ccdef2_wpds_3_tfcctvaldsc ;
   private String lV45Controlcalidadhtd_controlcalidad_ccdef2_wpds_5_tfcctval ;
   private String A4051CCTVal ;
   private String A396EmprCod ;
   private String AV34emprcod ;
   private boolean returnInSub ;
   private boolean brkAPK2 ;
   private boolean brkAPK4 ;
   private String AV31OptionsJson ;
   private String AV32OptionsDescJson ;
   private String AV33OptionIndexesJson ;
   private String AV28DDOName ;
   private String AV29SearchTxt ;
   private String AV30SearchTxtTo ;
   private String AV17Option ;
   private com.genexus.webpanels.WebSession AV23Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0APK2_A396EmprCod ;
   private int[] P0APK2_A4031CCTCod ;
   private short[] P0APK2_A4034CCTLin ;
   private String[] P0APK2_A4050CCTValDsc ;
   private String[] P0APK2_A4051CCTVal ;
   private byte[] P0APK2_A4049CCTValLin ;
   private String[] P0APK3_A396EmprCod ;
   private int[] P0APK3_A4031CCTCod ;
   private short[] P0APK3_A4034CCTLin ;
   private String[] P0APK3_A4051CCTVal ;
   private String[] P0APK3_A4050CCTValDsc ;
   private byte[] P0APK3_A4049CCTValLin ;
   private GXSimpleCollection<String> AV18Options ;
   private GXSimpleCollection<String> AV20OptionsDesc ;
   private GXSimpleCollection<String> AV21OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV25GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV26GridStateFilterValue ;
}

final  class controlcalidad_ccdef2_wpgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0APK2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte AV41Controlcalidadhtd_controlcalidad_ccdef2_wpds_1_tfcctvallin ,
                                          byte AV42Controlcalidadhtd_controlcalidad_ccdef2_wpds_2_tfcctvallin_to ,
                                          String AV44Controlcalidadhtd_controlcalidad_ccdef2_wpds_4_tfcctvaldsc_sel ,
                                          String AV43Controlcalidadhtd_controlcalidad_ccdef2_wpds_3_tfcctvaldsc ,
                                          String AV46Controlcalidadhtd_controlcalidad_ccdef2_wpds_6_tfcctval_sel ,
                                          String AV45Controlcalidadhtd_controlcalidad_ccdef2_wpds_5_tfcctval ,
                                          byte A4049CCTValLin ,
                                          String A4050CCTValDsc ,
                                          String A4051CCTVal ,
                                          String A396EmprCod ,
                                          String AV34emprcod ,
                                          int A4031CCTCod ,
                                          int AV35CCTCod ,
                                          short A4034CCTLin ,
                                          short AV36CCtlin )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[9];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT EmprCod, CCTCod, CCTLin, CCTValDsc, CCTVal, CCTValLin FROM TXPCCDef2" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(CCTCod = ?)");
      addWhere(sWhereString, "(CCTLin = ?)");
      if ( ! (0==AV41Controlcalidadhtd_controlcalidad_ccdef2_wpds_1_tfcctvallin) )
      {
         addWhere(sWhereString, "(CCTValLin >= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (0==AV42Controlcalidadhtd_controlcalidad_ccdef2_wpds_2_tfcctvallin_to) )
      {
         addWhere(sWhereString, "(CCTValLin <= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV44Controlcalidadhtd_controlcalidad_ccdef2_wpds_4_tfcctvaldsc_sel)==0) && ( ! (GXutil.strcmp("", AV43Controlcalidadhtd_controlcalidad_ccdef2_wpds_3_tfcctvaldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CCTValDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV44Controlcalidadhtd_controlcalidad_ccdef2_wpds_4_tfcctvaldsc_sel)==0) )
      {
         addWhere(sWhereString, "(CCTValDsc = ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV46Controlcalidadhtd_controlcalidad_ccdef2_wpds_6_tfcctval_sel)==0) && ( ! (GXutil.strcmp("", AV45Controlcalidadhtd_controlcalidad_ccdef2_wpds_5_tfcctval)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CCTVal) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV46Controlcalidadhtd_controlcalidad_ccdef2_wpds_6_tfcctval_sel)==0) )
      {
         addWhere(sWhereString, "(CCTVal = ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY CCTValDsc" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P0APK3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte AV41Controlcalidadhtd_controlcalidad_ccdef2_wpds_1_tfcctvallin ,
                                          byte AV42Controlcalidadhtd_controlcalidad_ccdef2_wpds_2_tfcctvallin_to ,
                                          String AV44Controlcalidadhtd_controlcalidad_ccdef2_wpds_4_tfcctvaldsc_sel ,
                                          String AV43Controlcalidadhtd_controlcalidad_ccdef2_wpds_3_tfcctvaldsc ,
                                          String AV46Controlcalidadhtd_controlcalidad_ccdef2_wpds_6_tfcctval_sel ,
                                          String AV45Controlcalidadhtd_controlcalidad_ccdef2_wpds_5_tfcctval ,
                                          byte A4049CCTValLin ,
                                          String A4050CCTValDsc ,
                                          String A4051CCTVal ,
                                          String A396EmprCod ,
                                          String AV34emprcod ,
                                          int A4031CCTCod ,
                                          int AV35CCTCod ,
                                          short A4034CCTLin ,
                                          short AV36CCtlin )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[9];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT EmprCod, CCTCod, CCTLin, CCTVal, CCTValDsc, CCTValLin FROM TXPCCDef2" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(CCTCod = ?)");
      addWhere(sWhereString, "(CCTLin = ?)");
      if ( ! (0==AV41Controlcalidadhtd_controlcalidad_ccdef2_wpds_1_tfcctvallin) )
      {
         addWhere(sWhereString, "(CCTValLin >= ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( ! (0==AV42Controlcalidadhtd_controlcalidad_ccdef2_wpds_2_tfcctvallin_to) )
      {
         addWhere(sWhereString, "(CCTValLin <= ?)");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV44Controlcalidadhtd_controlcalidad_ccdef2_wpds_4_tfcctvaldsc_sel)==0) && ( ! (GXutil.strcmp("", AV43Controlcalidadhtd_controlcalidad_ccdef2_wpds_3_tfcctvaldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CCTValDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV44Controlcalidadhtd_controlcalidad_ccdef2_wpds_4_tfcctvaldsc_sel)==0) )
      {
         addWhere(sWhereString, "(CCTValDsc = ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV46Controlcalidadhtd_controlcalidad_ccdef2_wpds_6_tfcctval_sel)==0) && ( ! (GXutil.strcmp("", AV45Controlcalidadhtd_controlcalidad_ccdef2_wpds_5_tfcctval)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CCTVal) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV46Controlcalidadhtd_controlcalidad_ccdef2_wpds_6_tfcctval_sel)==0) )
      {
         addWhere(sWhereString, "(CCTVal = ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY CCTVal" ;
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
                  return conditional_P0APK2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , ((Number) dynConstraints[1]).byteValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).byteValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).shortValue() , ((Number) dynConstraints[14]).shortValue() );
            case 1 :
                  return conditional_P0APK3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , ((Number) dynConstraints[1]).byteValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).byteValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).shortValue() , ((Number) dynConstraints[14]).shortValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0APK2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0APK3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 40);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
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
                  stmt.setString(sIdx, (String)parms[9], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[10]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[11]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[12]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[13]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 40);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 40);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[10]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[11]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[12]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[13]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 40);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 40);
               }
               return;
      }
   }

}

