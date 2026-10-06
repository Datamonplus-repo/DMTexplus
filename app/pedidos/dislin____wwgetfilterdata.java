package app.pedidos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dislin____wwgetfilterdata extends GXProcedure
{
   public dislin____wwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dislin____wwgetfilterdata.class ), "" );
   }

   public dislin____wwgetfilterdata( int remoteHandle ,
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
      dislin____wwgetfilterdata.this.aP5 = new String[] {""};
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
      dislin____wwgetfilterdata.this.AV26DDOName = aP0;
      dislin____wwgetfilterdata.this.AV27SearchTxt = aP1;
      dislin____wwgetfilterdata.this.AV28SearchTxtTo = aP2;
      dislin____wwgetfilterdata.this.aP3 = aP3;
      dislin____wwgetfilterdata.this.aP4 = aP4;
      dislin____wwgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV26DDOName), "DDO_PROCOD") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV26DDOName), "DDO_PRODSC") == 0 )
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
      AV29OptionsJson = AV16Options.toJSonString(false) ;
      AV30OptionsDescJson = AV18OptionsDesc.toJSonString(false) ;
      AV31OptionIndexesJson = AV19OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV21Session.getValue("Pedidos.DisLin____WWGridState"), "") == 0 )
      {
         AV23GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Pedidos.DisLin____WWGridState"), null, null);
      }
      else
      {
         AV23GridState.fromxml(AV21Session.getValue("Pedidos.DisLin____WWGridState"), null, null);
      }
      AV34GXV1 = 1 ;
      while ( AV34GXV1 <= AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV24GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV34GXV1));
         if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCOD") == 0 )
         {
            AV10TFProCod = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCOD_SEL") == 0 )
         {
            AV11TFProCod_Sel = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRODSC") == 0 )
         {
            AV12TFProDsc = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRODSC_SEL") == 0 )
         {
            AV13TFProDsc_Sel = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV34GXV1 = (int)(AV34GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPROCODOPTIONS' Routine */
      returnInSub = false ;
      AV10TFProCod = AV27SearchTxt ;
      AV11TFProCod_Sel = "" ;
      AV36Pedidos_dislin____wwds_1_tfprocod = AV10TFProCod ;
      AV37Pedidos_dislin____wwds_2_tfprocod_sel = AV11TFProCod_Sel ;
      AV38Pedidos_dislin____wwds_3_tfprodsc = AV12TFProDsc ;
      AV39Pedidos_dislin____wwds_4_tfprodsc_sel = AV13TFProDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV37Pedidos_dislin____wwds_2_tfprocod_sel ,
                                           AV36Pedidos_dislin____wwds_1_tfprocod ,
                                           AV39Pedidos_dislin____wwds_4_tfprodsc_sel ,
                                           AV38Pedidos_dislin____wwds_3_tfprodsc ,
                                           A758ProCod ,
                                           A759ProDsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV36Pedidos_dislin____wwds_1_tfprocod = GXutil.padr( GXutil.rtrim( AV36Pedidos_dislin____wwds_1_tfprocod), 8, "%") ;
      lV38Pedidos_dislin____wwds_3_tfprodsc = GXutil.padr( GXutil.rtrim( AV38Pedidos_dislin____wwds_3_tfprodsc), 40, "%") ;
      /* Using cursor P0AGA2 */
      pr_default.execute(0, new Object[] {lV36Pedidos_dislin____wwds_1_tfprocod, AV37Pedidos_dislin____wwds_2_tfprocod_sel, lV38Pedidos_dislin____wwds_3_tfprodsc, AV39Pedidos_dislin____wwds_4_tfprodsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkAGA2 = false ;
         A396EmprCod = P0AGA2_A396EmprCod[0] ;
         A758ProCod = P0AGA2_A758ProCod[0] ;
         A759ProDsc = P0AGA2_A759ProDsc[0] ;
         A361DisCod = P0AGA2_A361DisCod[0] ;
         A759ProDsc = P0AGA2_A759ProDsc[0] ;
         AV20count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0AGA2_A758ProCod[0], A758ProCod) == 0 ) )
         {
            brkAGA2 = false ;
            A396EmprCod = P0AGA2_A396EmprCod[0] ;
            A361DisCod = P0AGA2_A361DisCod[0] ;
            AV20count = (long)(AV20count+1) ;
            brkAGA2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A758ProCod)==0) )
         {
            AV15Option = A758ProCod ;
            AV16Options.add(AV15Option, 0);
            AV19OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV20count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV16Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAGA2 )
         {
            brkAGA2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPRODSCOPTIONS' Routine */
      returnInSub = false ;
      AV12TFProDsc = AV27SearchTxt ;
      AV13TFProDsc_Sel = "" ;
      AV36Pedidos_dislin____wwds_1_tfprocod = AV10TFProCod ;
      AV37Pedidos_dislin____wwds_2_tfprocod_sel = AV11TFProCod_Sel ;
      AV38Pedidos_dislin____wwds_3_tfprodsc = AV12TFProDsc ;
      AV39Pedidos_dislin____wwds_4_tfprodsc_sel = AV13TFProDsc_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV37Pedidos_dislin____wwds_2_tfprocod_sel ,
                                           AV36Pedidos_dislin____wwds_1_tfprocod ,
                                           AV39Pedidos_dislin____wwds_4_tfprodsc_sel ,
                                           AV38Pedidos_dislin____wwds_3_tfprodsc ,
                                           A758ProCod ,
                                           A759ProDsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV36Pedidos_dislin____wwds_1_tfprocod = GXutil.padr( GXutil.rtrim( AV36Pedidos_dislin____wwds_1_tfprocod), 8, "%") ;
      lV38Pedidos_dislin____wwds_3_tfprodsc = GXutil.padr( GXutil.rtrim( AV38Pedidos_dislin____wwds_3_tfprodsc), 40, "%") ;
      /* Using cursor P0AGA3 */
      pr_default.execute(1, new Object[] {lV36Pedidos_dislin____wwds_1_tfprocod, AV37Pedidos_dislin____wwds_2_tfprocod_sel, lV38Pedidos_dislin____wwds_3_tfprodsc, AV39Pedidos_dislin____wwds_4_tfprodsc_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brkAGA4 = false ;
         A758ProCod = P0AGA3_A758ProCod[0] ;
         A396EmprCod = P0AGA3_A396EmprCod[0] ;
         A759ProDsc = P0AGA3_A759ProDsc[0] ;
         A361DisCod = P0AGA3_A361DisCod[0] ;
         A759ProDsc = P0AGA3_A759ProDsc[0] ;
         AV20count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P0AGA3_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P0AGA3_A758ProCod[0], A758ProCod) == 0 ) )
         {
            brkAGA4 = false ;
            A361DisCod = P0AGA3_A361DisCod[0] ;
            AV20count = (long)(AV20count+1) ;
            brkAGA4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A759ProDsc)==0) )
         {
            AV15Option = A759ProDsc ;
            AV14InsertIndex = 1 ;
            while ( ( AV14InsertIndex <= AV16Options.size() ) && ( GXutil.strcmp((String)AV16Options.elementAt(-1+AV14InsertIndex), AV15Option) < 0 ) )
            {
               AV14InsertIndex = (int)(AV14InsertIndex+1) ;
            }
            AV16Options.add(AV15Option, AV14InsertIndex);
            AV19OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV20count), "Z,ZZZ,ZZZ,ZZ9")), AV14InsertIndex);
         }
         if ( AV16Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAGA4 )
         {
            brkAGA4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = dislin____wwgetfilterdata.this.AV29OptionsJson;
      this.aP4[0] = dislin____wwgetfilterdata.this.AV30OptionsDescJson;
      this.aP5[0] = dislin____wwgetfilterdata.this.AV31OptionIndexesJson;
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
      AV10TFProCod = "" ;
      AV11TFProCod_Sel = "" ;
      AV12TFProDsc = "" ;
      AV13TFProDsc_Sel = "" ;
      A758ProCod = "" ;
      AV36Pedidos_dislin____wwds_1_tfprocod = "" ;
      AV37Pedidos_dislin____wwds_2_tfprocod_sel = "" ;
      AV38Pedidos_dislin____wwds_3_tfprodsc = "" ;
      AV39Pedidos_dislin____wwds_4_tfprodsc_sel = "" ;
      scmdbuf = "" ;
      lV36Pedidos_dislin____wwds_1_tfprocod = "" ;
      lV38Pedidos_dislin____wwds_3_tfprodsc = "" ;
      A759ProDsc = "" ;
      P0AGA2_A396EmprCod = new String[] {""} ;
      P0AGA2_A758ProCod = new String[] {""} ;
      P0AGA2_A759ProDsc = new String[] {""} ;
      P0AGA2_A361DisCod = new int[1] ;
      A396EmprCod = "" ;
      AV15Option = "" ;
      P0AGA3_A758ProCod = new String[] {""} ;
      P0AGA3_A396EmprCod = new String[] {""} ;
      P0AGA3_A759ProDsc = new String[] {""} ;
      P0AGA3_A361DisCod = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidos.dislin____wwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0AGA2_A396EmprCod, P0AGA2_A758ProCod, P0AGA2_A759ProDsc, P0AGA2_A361DisCod
            }
            , new Object[] {
            P0AGA3_A758ProCod, P0AGA3_A396EmprCod, P0AGA3_A759ProDsc, P0AGA3_A361DisCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV34GXV1 ;
   private int A361DisCod ;
   private int AV14InsertIndex ;
   private long AV20count ;
   private String AV10TFProCod ;
   private String AV11TFProCod_Sel ;
   private String AV12TFProDsc ;
   private String AV13TFProDsc_Sel ;
   private String A758ProCod ;
   private String AV36Pedidos_dislin____wwds_1_tfprocod ;
   private String AV37Pedidos_dislin____wwds_2_tfprocod_sel ;
   private String AV38Pedidos_dislin____wwds_3_tfprodsc ;
   private String AV39Pedidos_dislin____wwds_4_tfprodsc_sel ;
   private String scmdbuf ;
   private String lV36Pedidos_dislin____wwds_1_tfprocod ;
   private String lV38Pedidos_dislin____wwds_3_tfprodsc ;
   private String A759ProDsc ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brkAGA2 ;
   private boolean brkAGA4 ;
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
   private String[] P0AGA2_A396EmprCod ;
   private String[] P0AGA2_A758ProCod ;
   private String[] P0AGA2_A759ProDsc ;
   private int[] P0AGA2_A361DisCod ;
   private String[] P0AGA3_A758ProCod ;
   private String[] P0AGA3_A396EmprCod ;
   private String[] P0AGA3_A759ProDsc ;
   private int[] P0AGA3_A361DisCod ;
   private GXSimpleCollection<String> AV16Options ;
   private GXSimpleCollection<String> AV18OptionsDesc ;
   private GXSimpleCollection<String> AV19OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV23GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV24GridStateFilterValue ;
}

final  class dislin____wwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AGA2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV37Pedidos_dislin____wwds_2_tfprocod_sel ,
                                          String AV36Pedidos_dislin____wwds_1_tfprocod ,
                                          String AV39Pedidos_dislin____wwds_4_tfprodsc_sel ,
                                          String AV38Pedidos_dislin____wwds_3_tfprodsc ,
                                          String A758ProCod ,
                                          String A759ProDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[4];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ProCod, T2.ProDsc, T1.DisCod FROM (TXPDISLIN T1 INNER JOIN TXPPROCES T2 ON T2.EmprCod = T1.EmprCod AND T2.ProCod = T1.ProCod)" ;
      if ( (GXutil.strcmp("", AV37Pedidos_dislin____wwds_2_tfprocod_sel)==0) && ( ! (GXutil.strcmp("", AV36Pedidos_dislin____wwds_1_tfprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV37Pedidos_dislin____wwds_2_tfprocod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProCod = ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV39Pedidos_dislin____wwds_4_tfprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV38Pedidos_dislin____wwds_3_tfprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV39Pedidos_dislin____wwds_4_tfprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ProDsc = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ProCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P0AGA3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV37Pedidos_dislin____wwds_2_tfprocod_sel ,
                                          String AV36Pedidos_dislin____wwds_1_tfprocod ,
                                          String AV39Pedidos_dislin____wwds_4_tfprodsc_sel ,
                                          String AV38Pedidos_dislin____wwds_3_tfprodsc ,
                                          String A758ProCod ,
                                          String A759ProDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[4];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.ProCod, T1.EmprCod, T2.ProDsc, T1.DisCod FROM (TXPDISLIN T1 INNER JOIN TXPPROCES T2 ON T2.EmprCod = T1.EmprCod AND T2.ProCod = T1.ProCod)" ;
      if ( (GXutil.strcmp("", AV37Pedidos_dislin____wwds_2_tfprocod_sel)==0) && ( ! (GXutil.strcmp("", AV36Pedidos_dislin____wwds_1_tfprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV37Pedidos_dislin____wwds_2_tfprocod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProCod = ?)");
      }
      else
      {
         GXv_int4[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV39Pedidos_dislin____wwds_4_tfprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV38Pedidos_dislin____wwds_3_tfprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV39Pedidos_dislin____wwds_4_tfprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ProDsc = ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.ProCod" ;
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
                  return conditional_P0AGA2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] );
            case 1 :
                  return conditional_P0AGA3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AGA2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AGA3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
               ((int[]) buf[3])[0] = rslt.getInt(4);
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
                  stmt.setString(sIdx, (String)parms[4], 8);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[5], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[6], 40);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 40);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[4], 8);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[5], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[6], 40);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 40);
               }
               return;
      }
   }

}

