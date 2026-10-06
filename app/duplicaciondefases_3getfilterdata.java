package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class duplicaciondefases_3getfilterdata extends GXProcedure
{
   public duplicaciondefases_3getfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( duplicaciondefases_3getfilterdata.class ), "" );
   }

   public duplicaciondefases_3getfilterdata( int remoteHandle ,
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
      duplicaciondefases_3getfilterdata.this.aP5 = new String[] {""};
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
      duplicaciondefases_3getfilterdata.this.AV26DDOName = aP0;
      duplicaciondefases_3getfilterdata.this.AV27SearchTxt = aP1;
      duplicaciondefases_3getfilterdata.this.AV28SearchTxtTo = aP2;
      duplicaciondefases_3getfilterdata.this.aP3 = aP3;
      duplicaciondefases_3getfilterdata.this.aP4 = aP4;
      duplicaciondefases_3getfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV16Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV18OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV19OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV26DDOName), "DDO_MAQFCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADMAQFCODOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV26DDOName), "DDO_MAQFDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADMAQFDSCOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV29OptionsJson = AV16Options.toJSonString(false) ;
      AV30OptionsDescJson = AV18OptionsDesc.toJSonString(false) ;
      AV31OptionIndexesJson = AV19OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV21Session.getValue("DuplicaciondeFases_3GridState"), "") == 0 )
      {
         AV23GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "DuplicaciondeFases_3GridState"), null, null);
      }
      else
      {
         AV23GridState.fromxml(AV21Session.getValue("DuplicaciondeFases_3GridState"), null, null);
      }
      AV37GXV1 = 1 ;
      while ( AV37GXV1 <= AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV24GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV37GXV1));
         if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQFCOD") == 0 )
         {
            AV10TFMaqFCod = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQFCOD_SEL") == 0 )
         {
            AV11TFMaqFCod_Sel = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQFDSC") == 0 )
         {
            AV12TFMaqFDsc = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQFDSC_SEL") == 0 )
         {
            AV13TFMaqFDsc_Sel = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV32Emprcod = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MAQCOD") == 0 )
         {
            AV33Maqcod = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MAQDSC") == 0 )
         {
            AV34MaqDsc = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV37GXV1 = (int)(AV37GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADMAQFCODOPTIONS' Routine */
      returnInSub = false ;
      AV10TFMaqFCod = AV27SearchTxt ;
      AV11TFMaqFCod_Sel = "" ;
      AV39Duplicaciondefases_3ds_1_tfmaqfcod = AV10TFMaqFCod ;
      AV40Duplicaciondefases_3ds_2_tfmaqfcod_sel = AV11TFMaqFCod_Sel ;
      AV41Duplicaciondefases_3ds_3_tfmaqfdsc = AV12TFMaqFDsc ;
      AV42Duplicaciondefases_3ds_4_tfmaqfdsc_sel = AV13TFMaqFDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV40Duplicaciondefases_3ds_2_tfmaqfcod_sel ,
                                           AV39Duplicaciondefases_3ds_1_tfmaqfcod ,
                                           AV42Duplicaciondefases_3ds_4_tfmaqfdsc_sel ,
                                           AV41Duplicaciondefases_3ds_3_tfmaqfdsc ,
                                           A1142MaqFCod ,
                                           A1143MaqFDsc ,
                                           AV32Emprcod ,
                                           AV33Maqcod ,
                                           A396EmprCod ,
                                           A602MaqCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV39Duplicaciondefases_3ds_1_tfmaqfcod = GXutil.padr( GXutil.rtrim( AV39Duplicaciondefases_3ds_1_tfmaqfcod), 8, "%") ;
      lV41Duplicaciondefases_3ds_3_tfmaqfdsc = GXutil.padr( GXutil.rtrim( AV41Duplicaciondefases_3ds_3_tfmaqfdsc), 28, "%") ;
      /* Using cursor P09XY2 */
      pr_default.execute(0, new Object[] {AV32Emprcod, AV33Maqcod, lV39Duplicaciondefases_3ds_1_tfmaqfcod, AV40Duplicaciondefases_3ds_2_tfmaqfcod_sel, lV41Duplicaciondefases_3ds_3_tfmaqfdsc, AV42Duplicaciondefases_3ds_4_tfmaqfdsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9XY2 = false ;
         A602MaqCod = P09XY2_A602MaqCod[0] ;
         A396EmprCod = P09XY2_A396EmprCod[0] ;
         A1142MaqFCod = P09XY2_A1142MaqFCod[0] ;
         A1143MaqFDsc = P09XY2_A1143MaqFDsc[0] ;
         AV20count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09XY2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P09XY2_A602MaqCod[0], A602MaqCod) == 0 ) && ( GXutil.strcmp(P09XY2_A1142MaqFCod[0], A1142MaqFCod) == 0 ) )
         {
            brk9XY2 = false ;
            AV20count = (long)(AV20count+1) ;
            brk9XY2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A1142MaqFCod)==0) )
         {
            AV15Option = A1142MaqFCod ;
            AV16Options.add(AV15Option, 0);
            AV19OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV20count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV16Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9XY2 )
         {
            brk9XY2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADMAQFDSCOPTIONS' Routine */
      returnInSub = false ;
      AV12TFMaqFDsc = AV27SearchTxt ;
      AV13TFMaqFDsc_Sel = "" ;
      AV39Duplicaciondefases_3ds_1_tfmaqfcod = AV10TFMaqFCod ;
      AV40Duplicaciondefases_3ds_2_tfmaqfcod_sel = AV11TFMaqFCod_Sel ;
      AV41Duplicaciondefases_3ds_3_tfmaqfdsc = AV12TFMaqFDsc ;
      AV42Duplicaciondefases_3ds_4_tfmaqfdsc_sel = AV13TFMaqFDsc_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV40Duplicaciondefases_3ds_2_tfmaqfcod_sel ,
                                           AV39Duplicaciondefases_3ds_1_tfmaqfcod ,
                                           AV42Duplicaciondefases_3ds_4_tfmaqfdsc_sel ,
                                           AV41Duplicaciondefases_3ds_3_tfmaqfdsc ,
                                           A1142MaqFCod ,
                                           A1143MaqFDsc ,
                                           A396EmprCod ,
                                           AV32Emprcod ,
                                           A602MaqCod ,
                                           AV33Maqcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV39Duplicaciondefases_3ds_1_tfmaqfcod = GXutil.padr( GXutil.rtrim( AV39Duplicaciondefases_3ds_1_tfmaqfcod), 8, "%") ;
      lV41Duplicaciondefases_3ds_3_tfmaqfdsc = GXutil.padr( GXutil.rtrim( AV41Duplicaciondefases_3ds_3_tfmaqfdsc), 28, "%") ;
      /* Using cursor P09XY3 */
      pr_default.execute(1, new Object[] {AV32Emprcod, AV33Maqcod, lV39Duplicaciondefases_3ds_1_tfmaqfcod, AV40Duplicaciondefases_3ds_2_tfmaqfcod_sel, lV41Duplicaciondefases_3ds_3_tfmaqfdsc, AV42Duplicaciondefases_3ds_4_tfmaqfdsc_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9XY4 = false ;
         A396EmprCod = P09XY3_A396EmprCod[0] ;
         A602MaqCod = P09XY3_A602MaqCod[0] ;
         A1143MaqFDsc = P09XY3_A1143MaqFDsc[0] ;
         A1142MaqFCod = P09XY3_A1142MaqFCod[0] ;
         AV20count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09XY3_A1143MaqFDsc[0], A1143MaqFDsc) == 0 ) )
         {
            brk9XY4 = false ;
            A396EmprCod = P09XY3_A396EmprCod[0] ;
            A602MaqCod = P09XY3_A602MaqCod[0] ;
            A1142MaqFCod = P09XY3_A1142MaqFCod[0] ;
            AV20count = (long)(AV20count+1) ;
            brk9XY4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A1143MaqFDsc)==0) )
         {
            AV15Option = A1143MaqFDsc ;
            AV16Options.add(AV15Option, 0);
            AV19OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV20count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV16Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9XY4 )
         {
            brk9XY4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = duplicaciondefases_3getfilterdata.this.AV29OptionsJson;
      this.aP4[0] = duplicaciondefases_3getfilterdata.this.AV30OptionsDescJson;
      this.aP5[0] = duplicaciondefases_3getfilterdata.this.AV31OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV29OptionsJson = "" ;
      AV30OptionsDescJson = "" ;
      AV31OptionIndexesJson = "" ;
      AV16Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV18OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV19OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV21Session = httpContext.getWebSession();
      AV23GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV24GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV10TFMaqFCod = "" ;
      AV11TFMaqFCod_Sel = "" ;
      AV12TFMaqFDsc = "" ;
      AV13TFMaqFDsc_Sel = "" ;
      AV32Emprcod = "" ;
      AV33Maqcod = "" ;
      AV34MaqDsc = "" ;
      A1142MaqFCod = "" ;
      AV39Duplicaciondefases_3ds_1_tfmaqfcod = "" ;
      AV40Duplicaciondefases_3ds_2_tfmaqfcod_sel = "" ;
      AV41Duplicaciondefases_3ds_3_tfmaqfdsc = "" ;
      AV42Duplicaciondefases_3ds_4_tfmaqfdsc_sel = "" ;
      scmdbuf = "" ;
      lV39Duplicaciondefases_3ds_1_tfmaqfcod = "" ;
      lV41Duplicaciondefases_3ds_3_tfmaqfdsc = "" ;
      A1143MaqFDsc = "" ;
      A396EmprCod = "" ;
      A602MaqCod = "" ;
      P09XY2_A602MaqCod = new String[] {""} ;
      P09XY2_A396EmprCod = new String[] {""} ;
      P09XY2_A1142MaqFCod = new String[] {""} ;
      P09XY2_A1143MaqFDsc = new String[] {""} ;
      AV15Option = "" ;
      P09XY3_A396EmprCod = new String[] {""} ;
      P09XY3_A602MaqCod = new String[] {""} ;
      P09XY3_A1143MaqFDsc = new String[] {""} ;
      P09XY3_A1142MaqFCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.duplicaciondefases_3getfilterdata__default(),
         new Object[] {
             new Object[] {
            P09XY2_A602MaqCod, P09XY2_A396EmprCod, P09XY2_A1142MaqFCod, P09XY2_A1143MaqFDsc
            }
            , new Object[] {
            P09XY3_A396EmprCod, P09XY3_A602MaqCod, P09XY3_A1143MaqFDsc, P09XY3_A1142MaqFCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV37GXV1 ;
   private long AV20count ;
   private String AV10TFMaqFCod ;
   private String AV11TFMaqFCod_Sel ;
   private String AV12TFMaqFDsc ;
   private String AV13TFMaqFDsc_Sel ;
   private String AV32Emprcod ;
   private String AV33Maqcod ;
   private String AV34MaqDsc ;
   private String A1142MaqFCod ;
   private String AV39Duplicaciondefases_3ds_1_tfmaqfcod ;
   private String AV40Duplicaciondefases_3ds_2_tfmaqfcod_sel ;
   private String AV41Duplicaciondefases_3ds_3_tfmaqfdsc ;
   private String AV42Duplicaciondefases_3ds_4_tfmaqfdsc_sel ;
   private String scmdbuf ;
   private String lV39Duplicaciondefases_3ds_1_tfmaqfcod ;
   private String lV41Duplicaciondefases_3ds_3_tfmaqfdsc ;
   private String A1143MaqFDsc ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private boolean returnInSub ;
   private boolean brk9XY2 ;
   private boolean brk9XY4 ;
   private String AV29OptionsJson ;
   private String AV30OptionsDescJson ;
   private String AV31OptionIndexesJson ;
   private String AV26DDOName ;
   private String AV27SearchTxt ;
   private String AV28SearchTxtTo ;
   private String AV15Option ;
   private com.genexus.webpanels.WebSession AV21Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09XY2_A602MaqCod ;
   private String[] P09XY2_A396EmprCod ;
   private String[] P09XY2_A1142MaqFCod ;
   private String[] P09XY2_A1143MaqFDsc ;
   private String[] P09XY3_A396EmprCod ;
   private String[] P09XY3_A602MaqCod ;
   private String[] P09XY3_A1143MaqFDsc ;
   private String[] P09XY3_A1142MaqFCod ;
   private GXSimpleCollection<String> AV16Options ;
   private GXSimpleCollection<String> AV18OptionsDesc ;
   private GXSimpleCollection<String> AV19OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV23GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV24GridStateFilterValue ;
}

final  class duplicaciondefases_3getfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09XY2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV40Duplicaciondefases_3ds_2_tfmaqfcod_sel ,
                                          String AV39Duplicaciondefases_3ds_1_tfmaqfcod ,
                                          String AV42Duplicaciondefases_3ds_4_tfmaqfdsc_sel ,
                                          String AV41Duplicaciondefases_3ds_3_tfmaqfdsc ,
                                          String A1142MaqFCod ,
                                          String A1143MaqFDsc ,
                                          String AV32Emprcod ,
                                          String AV33Maqcod ,
                                          String A396EmprCod ,
                                          String A602MaqCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[6];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT MaqCod, EmprCod, MaqFCod, MaqFDsc FROM TXPMAQFAS" ;
      addWhere(sWhereString, "(EmprCod = ? and MaqCod = ?)");
      if ( (GXutil.strcmp("", AV40Duplicaciondefases_3ds_2_tfmaqfcod_sel)==0) && ( ! (GXutil.strcmp("", AV39Duplicaciondefases_3ds_1_tfmaqfcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MaqFCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV40Duplicaciondefases_3ds_2_tfmaqfcod_sel)==0) )
      {
         addWhere(sWhereString, "(MaqFCod = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV42Duplicaciondefases_3ds_4_tfmaqfdsc_sel)==0) && ( ! (GXutil.strcmp("", AV41Duplicaciondefases_3ds_3_tfmaqfdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MaqFDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV42Duplicaciondefases_3ds_4_tfmaqfdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MaqFDsc = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, MaqCod, MaqFCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09XY3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV40Duplicaciondefases_3ds_2_tfmaqfcod_sel ,
                                          String AV39Duplicaciondefases_3ds_1_tfmaqfcod ,
                                          String AV42Duplicaciondefases_3ds_4_tfmaqfdsc_sel ,
                                          String AV41Duplicaciondefases_3ds_3_tfmaqfdsc ,
                                          String A1142MaqFCod ,
                                          String A1143MaqFDsc ,
                                          String A396EmprCod ,
                                          String AV32Emprcod ,
                                          String A602MaqCod ,
                                          String AV33Maqcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[6];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT EmprCod, MaqCod, MaqFDsc, MaqFCod FROM TXPMAQFAS" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(MaqCod = ?)");
      if ( (GXutil.strcmp("", AV40Duplicaciondefases_3ds_2_tfmaqfcod_sel)==0) && ( ! (GXutil.strcmp("", AV39Duplicaciondefases_3ds_1_tfmaqfcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MaqFCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV40Duplicaciondefases_3ds_2_tfmaqfcod_sel)==0) )
      {
         addWhere(sWhereString, "(MaqFCod = ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV42Duplicaciondefases_3ds_4_tfmaqfdsc_sel)==0) && ( ! (GXutil.strcmp("", AV41Duplicaciondefases_3ds_3_tfmaqfdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MaqFDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV42Duplicaciondefases_3ds_4_tfmaqfdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MaqFDsc = ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY MaqFDsc" ;
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
                  return conditional_P09XY2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] );
            case 1 :
                  return conditional_P09XY3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09XY2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09XY3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 28);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 28);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
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
                  stmt.setString(sIdx, (String)parms[6], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 28);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 28);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[6], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 28);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 28);
               }
               return;
      }
   }

}

