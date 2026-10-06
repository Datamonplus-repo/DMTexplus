package app.gestionlaboratorio ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tprequiwwgetfilterdata extends GXProcedure
{
   public tprequiwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tprequiwwgetfilterdata.class ), "" );
   }

   public tprequiwwgetfilterdata( int remoteHandle ,
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
      tprequiwwgetfilterdata.this.aP5 = new String[] {""};
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
      tprequiwwgetfilterdata.this.AV16DDOName = aP0;
      tprequiwwgetfilterdata.this.AV14SearchTxt = aP1;
      tprequiwwgetfilterdata.this.AV15SearchTxtTo = aP2;
      tprequiwwgetfilterdata.this.aP3 = aP3;
      tprequiwwgetfilterdata.this.aP4 = aP4;
      tprequiwwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV19Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV22OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV24OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_LB_PQUIID") == 0 )
      {
         /* Execute user subroutine: 'LOADLB_PQUIIDOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_LB_PQUIDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADLB_PQUIDSCOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV20OptionsJson = AV19Options.toJSonString(false) ;
      AV23OptionsDescJson = AV22OptionsDesc.toJSonString(false) ;
      AV25OptionIndexesJson = AV24OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV27Session.getValue("GestionLaboratorio.TPREQUIWWGridState"), "") == 0 )
      {
         AV29GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "GestionLaboratorio.TPREQUIWWGridState"), null, null);
      }
      else
      {
         AV29GridState.fromxml(AV27Session.getValue("GestionLaboratorio.TPREQUIWWGridState"), null, null);
      }
      AV35GXV1 = 1 ;
      while ( AV35GXV1 <= AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV30GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV35GXV1));
         if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV32FilterFullText = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_PQUIID") == 0 )
         {
            AV10TFLb_PquiID = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_PQUIID_SEL") == 0 )
         {
            AV11TFLb_PquiID_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_PQUIDSC") == 0 )
         {
            AV12TFLb_PquiDsc = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_PQUIDSC_SEL") == 0 )
         {
            AV13TFLb_PquiDsc_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV35GXV1 = (int)(AV35GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADLB_PQUIIDOPTIONS' Routine */
      returnInSub = false ;
      AV10TFLb_PquiID = AV14SearchTxt ;
      AV11TFLb_PquiID_Sel = "" ;
      AV37Gestionlaboratorio_tprequiwwds_1_filterfulltext = AV32FilterFullText ;
      AV38Gestionlaboratorio_tprequiwwds_2_tflb_pquiid = AV10TFLb_PquiID ;
      AV39Gestionlaboratorio_tprequiwwds_3_tflb_pquiid_sel = AV11TFLb_PquiID_Sel ;
      AV40Gestionlaboratorio_tprequiwwds_4_tflb_pquidsc = AV12TFLb_PquiDsc ;
      AV41Gestionlaboratorio_tprequiwwds_5_tflb_pquidsc_sel = AV13TFLb_PquiDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV37Gestionlaboratorio_tprequiwwds_1_filterfulltext ,
                                           AV39Gestionlaboratorio_tprequiwwds_3_tflb_pquiid_sel ,
                                           AV38Gestionlaboratorio_tprequiwwds_2_tflb_pquiid ,
                                           AV41Gestionlaboratorio_tprequiwwds_5_tflb_pquidsc_sel ,
                                           AV40Gestionlaboratorio_tprequiwwds_4_tflb_pquidsc ,
                                           A13299Lb_PquiID ,
                                           A13300Lb_PquiDsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV37Gestionlaboratorio_tprequiwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV37Gestionlaboratorio_tprequiwwds_1_filterfulltext), "%", "") ;
      lV37Gestionlaboratorio_tprequiwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV37Gestionlaboratorio_tprequiwwds_1_filterfulltext), "%", "") ;
      lV38Gestionlaboratorio_tprequiwwds_2_tflb_pquiid = GXutil.padr( GXutil.rtrim( AV38Gestionlaboratorio_tprequiwwds_2_tflb_pquiid), 6, "%") ;
      lV40Gestionlaboratorio_tprequiwwds_4_tflb_pquidsc = GXutil.padr( GXutil.rtrim( AV40Gestionlaboratorio_tprequiwwds_4_tflb_pquidsc), 30, "%") ;
      /* Using cursor P09652 */
      pr_default.execute(0, new Object[] {lV37Gestionlaboratorio_tprequiwwds_1_filterfulltext, lV37Gestionlaboratorio_tprequiwwds_1_filterfulltext, lV38Gestionlaboratorio_tprequiwwds_2_tflb_pquiid, AV39Gestionlaboratorio_tprequiwwds_3_tflb_pquiid_sel, lV40Gestionlaboratorio_tprequiwwds_4_tflb_pquidsc, AV41Gestionlaboratorio_tprequiwwds_5_tflb_pquidsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9652 = false ;
         A13299Lb_PquiID = P09652_A13299Lb_PquiID[0] ;
         A13300Lb_PquiDsc = P09652_A13300Lb_PquiDsc[0] ;
         n13300Lb_PquiDsc = P09652_n13300Lb_PquiDsc[0] ;
         A396EmprCod = P09652_A396EmprCod[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09652_A13299Lb_PquiID[0], A13299Lb_PquiID) == 0 ) )
         {
            brk9652 = false ;
            A396EmprCod = P09652_A396EmprCod[0] ;
            AV26count = (long)(AV26count+1) ;
            brk9652 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A13299Lb_PquiID)==0) )
         {
            AV18Option = A13299Lb_PquiID ;
            AV19Options.add(AV18Option, 0);
            AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV19Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9652 )
         {
            brk9652 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADLB_PQUIDSCOPTIONS' Routine */
      returnInSub = false ;
      AV12TFLb_PquiDsc = AV14SearchTxt ;
      AV13TFLb_PquiDsc_Sel = "" ;
      AV37Gestionlaboratorio_tprequiwwds_1_filterfulltext = AV32FilterFullText ;
      AV38Gestionlaboratorio_tprequiwwds_2_tflb_pquiid = AV10TFLb_PquiID ;
      AV39Gestionlaboratorio_tprequiwwds_3_tflb_pquiid_sel = AV11TFLb_PquiID_Sel ;
      AV40Gestionlaboratorio_tprequiwwds_4_tflb_pquidsc = AV12TFLb_PquiDsc ;
      AV41Gestionlaboratorio_tprequiwwds_5_tflb_pquidsc_sel = AV13TFLb_PquiDsc_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV37Gestionlaboratorio_tprequiwwds_1_filterfulltext ,
                                           AV39Gestionlaboratorio_tprequiwwds_3_tflb_pquiid_sel ,
                                           AV38Gestionlaboratorio_tprequiwwds_2_tflb_pquiid ,
                                           AV41Gestionlaboratorio_tprequiwwds_5_tflb_pquidsc_sel ,
                                           AV40Gestionlaboratorio_tprequiwwds_4_tflb_pquidsc ,
                                           A13299Lb_PquiID ,
                                           A13300Lb_PquiDsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV37Gestionlaboratorio_tprequiwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV37Gestionlaboratorio_tprequiwwds_1_filterfulltext), "%", "") ;
      lV37Gestionlaboratorio_tprequiwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV37Gestionlaboratorio_tprequiwwds_1_filterfulltext), "%", "") ;
      lV38Gestionlaboratorio_tprequiwwds_2_tflb_pquiid = GXutil.padr( GXutil.rtrim( AV38Gestionlaboratorio_tprequiwwds_2_tflb_pquiid), 6, "%") ;
      lV40Gestionlaboratorio_tprequiwwds_4_tflb_pquidsc = GXutil.padr( GXutil.rtrim( AV40Gestionlaboratorio_tprequiwwds_4_tflb_pquidsc), 30, "%") ;
      /* Using cursor P09653 */
      pr_default.execute(1, new Object[] {lV37Gestionlaboratorio_tprequiwwds_1_filterfulltext, lV37Gestionlaboratorio_tprequiwwds_1_filterfulltext, lV38Gestionlaboratorio_tprequiwwds_2_tflb_pquiid, AV39Gestionlaboratorio_tprequiwwds_3_tflb_pquiid_sel, lV40Gestionlaboratorio_tprequiwwds_4_tflb_pquidsc, AV41Gestionlaboratorio_tprequiwwds_5_tflb_pquidsc_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9654 = false ;
         A13300Lb_PquiDsc = P09653_A13300Lb_PquiDsc[0] ;
         n13300Lb_PquiDsc = P09653_n13300Lb_PquiDsc[0] ;
         A13299Lb_PquiID = P09653_A13299Lb_PquiID[0] ;
         A396EmprCod = P09653_A396EmprCod[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09653_A13300Lb_PquiDsc[0], A13300Lb_PquiDsc) == 0 ) )
         {
            brk9654 = false ;
            A13299Lb_PquiID = P09653_A13299Lb_PquiID[0] ;
            A396EmprCod = P09653_A396EmprCod[0] ;
            AV26count = (long)(AV26count+1) ;
            brk9654 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A13300Lb_PquiDsc)==0) )
         {
            AV18Option = A13300Lb_PquiDsc ;
            AV19Options.add(AV18Option, 0);
            AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV19Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9654 )
         {
            brk9654 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tprequiwwgetfilterdata.this.AV20OptionsJson;
      this.aP4[0] = tprequiwwgetfilterdata.this.AV23OptionsDescJson;
      this.aP5[0] = tprequiwwgetfilterdata.this.AV25OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV20OptionsJson = "" ;
      AV23OptionsDescJson = "" ;
      AV25OptionIndexesJson = "" ;
      AV19Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV22OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV24OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV27Session = httpContext.getWebSession();
      AV29GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV30GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV32FilterFullText = "" ;
      AV10TFLb_PquiID = "" ;
      AV11TFLb_PquiID_Sel = "" ;
      AV12TFLb_PquiDsc = "" ;
      AV13TFLb_PquiDsc_Sel = "" ;
      A13299Lb_PquiID = "" ;
      AV37Gestionlaboratorio_tprequiwwds_1_filterfulltext = "" ;
      AV38Gestionlaboratorio_tprequiwwds_2_tflb_pquiid = "" ;
      AV39Gestionlaboratorio_tprequiwwds_3_tflb_pquiid_sel = "" ;
      AV40Gestionlaboratorio_tprequiwwds_4_tflb_pquidsc = "" ;
      AV41Gestionlaboratorio_tprequiwwds_5_tflb_pquidsc_sel = "" ;
      scmdbuf = "" ;
      lV37Gestionlaboratorio_tprequiwwds_1_filterfulltext = "" ;
      lV38Gestionlaboratorio_tprequiwwds_2_tflb_pquiid = "" ;
      lV40Gestionlaboratorio_tprequiwwds_4_tflb_pquidsc = "" ;
      A13300Lb_PquiDsc = "" ;
      P09652_A13299Lb_PquiID = new String[] {""} ;
      P09652_A13300Lb_PquiDsc = new String[] {""} ;
      P09652_n13300Lb_PquiDsc = new boolean[] {false} ;
      P09652_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV18Option = "" ;
      P09653_A13300Lb_PquiDsc = new String[] {""} ;
      P09653_n13300Lb_PquiDsc = new boolean[] {false} ;
      P09653_A13299Lb_PquiID = new String[] {""} ;
      P09653_A396EmprCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.tprequiwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09652_A13299Lb_PquiID, P09652_A13300Lb_PquiDsc, P09652_n13300Lb_PquiDsc, P09652_A396EmprCod
            }
            , new Object[] {
            P09653_A13300Lb_PquiDsc, P09653_n13300Lb_PquiDsc, P09653_A13299Lb_PquiID, P09653_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV35GXV1 ;
   private long AV26count ;
   private String AV10TFLb_PquiID ;
   private String AV11TFLb_PquiID_Sel ;
   private String AV12TFLb_PquiDsc ;
   private String AV13TFLb_PquiDsc_Sel ;
   private String A13299Lb_PquiID ;
   private String AV38Gestionlaboratorio_tprequiwwds_2_tflb_pquiid ;
   private String AV39Gestionlaboratorio_tprequiwwds_3_tflb_pquiid_sel ;
   private String AV40Gestionlaboratorio_tprequiwwds_4_tflb_pquidsc ;
   private String AV41Gestionlaboratorio_tprequiwwds_5_tflb_pquidsc_sel ;
   private String scmdbuf ;
   private String lV38Gestionlaboratorio_tprequiwwds_2_tflb_pquiid ;
   private String lV40Gestionlaboratorio_tprequiwwds_4_tflb_pquidsc ;
   private String A13300Lb_PquiDsc ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk9652 ;
   private boolean n13300Lb_PquiDsc ;
   private boolean brk9654 ;
   private String AV20OptionsJson ;
   private String AV23OptionsDescJson ;
   private String AV25OptionIndexesJson ;
   private String AV16DDOName ;
   private String AV14SearchTxt ;
   private String AV15SearchTxtTo ;
   private String AV32FilterFullText ;
   private String AV37Gestionlaboratorio_tprequiwwds_1_filterfulltext ;
   private String lV37Gestionlaboratorio_tprequiwwds_1_filterfulltext ;
   private String AV18Option ;
   private com.genexus.webpanels.WebSession AV27Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09652_A13299Lb_PquiID ;
   private String[] P09652_A13300Lb_PquiDsc ;
   private boolean[] P09652_n13300Lb_PquiDsc ;
   private String[] P09652_A396EmprCod ;
   private String[] P09653_A13300Lb_PquiDsc ;
   private boolean[] P09653_n13300Lb_PquiDsc ;
   private String[] P09653_A13299Lb_PquiID ;
   private String[] P09653_A396EmprCod ;
   private GXSimpleCollection<String> AV19Options ;
   private GXSimpleCollection<String> AV22OptionsDesc ;
   private GXSimpleCollection<String> AV24OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV29GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV30GridStateFilterValue ;
}

final  class tprequiwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09652( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV37Gestionlaboratorio_tprequiwwds_1_filterfulltext ,
                                          String AV39Gestionlaboratorio_tprequiwwds_3_tflb_pquiid_sel ,
                                          String AV38Gestionlaboratorio_tprequiwwds_2_tflb_pquiid ,
                                          String AV41Gestionlaboratorio_tprequiwwds_5_tflb_pquidsc_sel ,
                                          String AV40Gestionlaboratorio_tprequiwwds_4_tflb_pquidsc ,
                                          String A13299Lb_PquiID ,
                                          String A13300Lb_PquiDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[6];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT Lb_PquiID, Lb_PquiDsc, EmprCod FROM TXPPREQUI" ;
      if ( ! (GXutil.strcmp("", AV37Gestionlaboratorio_tprequiwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(Lb_PquiID) like '%' || UPPER(?)) or ( UPPER(Lb_PquiDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV39Gestionlaboratorio_tprequiwwds_3_tflb_pquiid_sel)==0) && ( ! (GXutil.strcmp("", AV38Gestionlaboratorio_tprequiwwds_2_tflb_pquiid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Lb_PquiID) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV39Gestionlaboratorio_tprequiwwds_3_tflb_pquiid_sel)==0) )
      {
         addWhere(sWhereString, "(Lb_PquiID = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV41Gestionlaboratorio_tprequiwwds_5_tflb_pquidsc_sel)==0) && ( ! (GXutil.strcmp("", AV40Gestionlaboratorio_tprequiwwds_4_tflb_pquidsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Lb_PquiDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV41Gestionlaboratorio_tprequiwwds_5_tflb_pquidsc_sel)==0) )
      {
         addWhere(sWhereString, "(Lb_PquiDsc = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY Lb_PquiID" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09653( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV37Gestionlaboratorio_tprequiwwds_1_filterfulltext ,
                                          String AV39Gestionlaboratorio_tprequiwwds_3_tflb_pquiid_sel ,
                                          String AV38Gestionlaboratorio_tprequiwwds_2_tflb_pquiid ,
                                          String AV41Gestionlaboratorio_tprequiwwds_5_tflb_pquidsc_sel ,
                                          String AV40Gestionlaboratorio_tprequiwwds_4_tflb_pquidsc ,
                                          String A13299Lb_PquiID ,
                                          String A13300Lb_PquiDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[6];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT Lb_PquiDsc, Lb_PquiID, EmprCod FROM TXPPREQUI" ;
      if ( ! (GXutil.strcmp("", AV37Gestionlaboratorio_tprequiwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(Lb_PquiID) like '%' || UPPER(?)) or ( UPPER(Lb_PquiDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
         GXv_int4[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV39Gestionlaboratorio_tprequiwwds_3_tflb_pquiid_sel)==0) && ( ! (GXutil.strcmp("", AV38Gestionlaboratorio_tprequiwwds_2_tflb_pquiid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Lb_PquiID) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV39Gestionlaboratorio_tprequiwwds_3_tflb_pquiid_sel)==0) )
      {
         addWhere(sWhereString, "(Lb_PquiID = ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV41Gestionlaboratorio_tprequiwwds_5_tflb_pquidsc_sel)==0) && ( ! (GXutil.strcmp("", AV40Gestionlaboratorio_tprequiwwds_4_tflb_pquidsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Lb_PquiDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV41Gestionlaboratorio_tprequiwwds_5_tflb_pquidsc_sel)==0) )
      {
         addWhere(sWhereString, "(Lb_PquiDsc = ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY Lb_PquiDsc" ;
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
                  return conditional_P09652(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] );
            case 1 :
                  return conditional_P09653(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09652", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09653", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 6);
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
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
                  stmt.setVarchar(sIdx, (String)parms[6], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[7], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 30);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[6], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[7], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 30);
               }
               return;
      }
   }

}

