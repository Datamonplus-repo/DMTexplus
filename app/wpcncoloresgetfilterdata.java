package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wpcncoloresgetfilterdata extends GXProcedure
{
   public wpcncoloresgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wpcncoloresgetfilterdata.class ), "" );
   }

   public wpcncoloresgetfilterdata( int remoteHandle ,
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
      wpcncoloresgetfilterdata.this.aP5 = new String[] {""};
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
      wpcncoloresgetfilterdata.this.AV20DDOName = aP0;
      wpcncoloresgetfilterdata.this.AV18SearchTxt = aP1;
      wpcncoloresgetfilterdata.this.AV19SearchTxtTo = aP2;
      wpcncoloresgetfilterdata.this.aP3 = aP3;
      wpcncoloresgetfilterdata.this.aP4 = aP4;
      wpcncoloresgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV23Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV26OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV28OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV20DDOName), "DDO_FORSERDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADFORSERDSCOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV20DDOName), "DDO_FORCOLNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADFORCOLNOMOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV24OptionsJson = AV23Options.toJSonString(false) ;
      AV27OptionsDescJson = AV26OptionsDesc.toJSonString(false) ;
      AV29OptionIndexesJson = AV28OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV31Session.getValue("WpCnColoresGridState"), "") == 0 )
      {
         AV33GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WpCnColoresGridState"), null, null);
      }
      else
      {
         AV33GridState.fromxml(AV31Session.getValue("WpCnColoresGridState"), null, null);
      }
      AV43GXV1 = 1 ;
      while ( AV43GXV1 <= AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV34GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV43GXV1));
         if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSERDSC") == 0 )
         {
            AV12TFForSerDsc = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSERDSC_SEL") == 0 )
         {
            AV13TFForSerDsc_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNOM") == 0 )
         {
            AV14TFForColNom = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNOM_SEL") == 0 )
         {
            AV15TFForColNom_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNUM") == 0 )
         {
            AV16TFForColNum = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV17TFForColNum_To = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         AV43GXV1 = (int)(AV43GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADFORSERDSCOPTIONS' Routine */
      returnInSub = false ;
      AV12TFForSerDsc = AV18SearchTxt ;
      AV13TFForSerDsc_Sel = "" ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV13TFForSerDsc_Sel ,
                                           AV12TFForSerDsc ,
                                           AV15TFForColNom_Sel ,
                                           AV14TFForColNom ,
                                           Integer.valueOf(AV16TFForColNum) ,
                                           Integer.valueOf(AV17TFForColNum_To) ,
                                           AV40Var_ForSer ,
                                           A5742ForSerDsc ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           A494ForSer } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.STRING
                                           }
      });
      lV12TFForSerDsc = GXutil.padr( GXutil.rtrim( AV12TFForSerDsc), 26, "%") ;
      lV14TFForColNom = GXutil.padr( GXutil.rtrim( AV14TFForColNom), 13, "%") ;
      /* Using cursor P08Y22 */
      pr_default.execute(0, new Object[] {lV12TFForSerDsc, AV13TFForSerDsc_Sel, lV14TFForColNom, AV15TFForColNom_Sel, Integer.valueOf(AV16TFForColNum), Integer.valueOf(AV17TFForColNum_To), AV40Var_ForSer});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8Y22 = false ;
         A5742ForSerDsc = P08Y22_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P08Y22_n5742ForSerDsc[0] ;
         A494ForSer = P08Y22_A494ForSer[0] ;
         A483ForColNum = P08Y22_A483ForColNum[0] ;
         A482ForColNom = P08Y22_A482ForColNom[0] ;
         A396EmprCod = P08Y22_A396EmprCod[0] ;
         A252CliCod = P08Y22_A252CliCod[0] ;
         A831TipColCod = P08Y22_A831TipColCod[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08Y22_A5742ForSerDsc[0], A5742ForSerDsc) == 0 ) )
         {
            brk8Y22 = false ;
            A494ForSer = P08Y22_A494ForSer[0] ;
            A483ForColNum = P08Y22_A483ForColNum[0] ;
            A482ForColNom = P08Y22_A482ForColNom[0] ;
            A396EmprCod = P08Y22_A396EmprCod[0] ;
            A252CliCod = P08Y22_A252CliCod[0] ;
            A831TipColCod = P08Y22_A831TipColCod[0] ;
            AV30count = (long)(AV30count+1) ;
            brk8Y22 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A5742ForSerDsc)==0) )
         {
            AV22Option = A5742ForSerDsc ;
            AV23Options.add(AV22Option, 0);
            AV28OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV23Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8Y22 )
         {
            brk8Y22 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADFORCOLNOMOPTIONS' Routine */
      returnInSub = false ;
      AV14TFForColNom = AV18SearchTxt ;
      AV15TFForColNom_Sel = "" ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV13TFForSerDsc_Sel ,
                                           AV12TFForSerDsc ,
                                           AV15TFForColNom_Sel ,
                                           AV14TFForColNom ,
                                           Integer.valueOf(AV16TFForColNum) ,
                                           Integer.valueOf(AV17TFForColNum_To) ,
                                           AV40Var_ForSer ,
                                           A5742ForSerDsc ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           A494ForSer } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.STRING
                                           }
      });
      lV12TFForSerDsc = GXutil.padr( GXutil.rtrim( AV12TFForSerDsc), 26, "%") ;
      lV14TFForColNom = GXutil.padr( GXutil.rtrim( AV14TFForColNom), 13, "%") ;
      /* Using cursor P08Y23 */
      pr_default.execute(1, new Object[] {lV12TFForSerDsc, AV13TFForSerDsc_Sel, lV14TFForColNom, AV15TFForColNom_Sel, Integer.valueOf(AV16TFForColNum), Integer.valueOf(AV17TFForColNum_To), AV40Var_ForSer});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8Y24 = false ;
         A482ForColNom = P08Y23_A482ForColNom[0] ;
         A494ForSer = P08Y23_A494ForSer[0] ;
         A483ForColNum = P08Y23_A483ForColNum[0] ;
         A5742ForSerDsc = P08Y23_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P08Y23_n5742ForSerDsc[0] ;
         A396EmprCod = P08Y23_A396EmprCod[0] ;
         A252CliCod = P08Y23_A252CliCod[0] ;
         A831TipColCod = P08Y23_A831TipColCod[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08Y23_A482ForColNom[0], A482ForColNom) == 0 ) )
         {
            brk8Y24 = false ;
            A494ForSer = P08Y23_A494ForSer[0] ;
            A483ForColNum = P08Y23_A483ForColNum[0] ;
            A396EmprCod = P08Y23_A396EmprCod[0] ;
            A252CliCod = P08Y23_A252CliCod[0] ;
            A831TipColCod = P08Y23_A831TipColCod[0] ;
            AV30count = (long)(AV30count+1) ;
            brk8Y24 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A482ForColNom)==0) )
         {
            AV22Option = A482ForColNom ;
            AV23Options.add(AV22Option, 0);
            AV28OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV23Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8Y24 )
         {
            brk8Y24 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = wpcncoloresgetfilterdata.this.AV24OptionsJson;
      this.aP4[0] = wpcncoloresgetfilterdata.this.AV27OptionsDescJson;
      this.aP5[0] = wpcncoloresgetfilterdata.this.AV29OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV24OptionsJson = "" ;
      AV27OptionsDescJson = "" ;
      AV29OptionIndexesJson = "" ;
      AV23Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV26OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV28OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV31Session = httpContext.getWebSession();
      AV33GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV34GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV12TFForSerDsc = "" ;
      AV13TFForSerDsc_Sel = "" ;
      AV14TFForColNom = "" ;
      AV15TFForColNom_Sel = "" ;
      scmdbuf = "" ;
      lV12TFForSerDsc = "" ;
      lV14TFForColNom = "" ;
      AV40Var_ForSer = "" ;
      A5742ForSerDsc = "" ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      P08Y22_A5742ForSerDsc = new String[] {""} ;
      P08Y22_n5742ForSerDsc = new boolean[] {false} ;
      P08Y22_A494ForSer = new String[] {""} ;
      P08Y22_A483ForColNum = new int[1] ;
      P08Y22_A482ForColNom = new String[] {""} ;
      P08Y22_A396EmprCod = new String[] {""} ;
      P08Y22_A252CliCod = new int[1] ;
      P08Y22_A831TipColCod = new byte[1] ;
      A396EmprCod = "" ;
      AV22Option = "" ;
      P08Y23_A482ForColNom = new String[] {""} ;
      P08Y23_A494ForSer = new String[] {""} ;
      P08Y23_A483ForColNum = new int[1] ;
      P08Y23_A5742ForSerDsc = new String[] {""} ;
      P08Y23_n5742ForSerDsc = new boolean[] {false} ;
      P08Y23_A396EmprCod = new String[] {""} ;
      P08Y23_A252CliCod = new int[1] ;
      P08Y23_A831TipColCod = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wpcncoloresgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08Y22_A5742ForSerDsc, P08Y22_n5742ForSerDsc, P08Y22_A494ForSer, P08Y22_A483ForColNum, P08Y22_A482ForColNom, P08Y22_A396EmprCod, P08Y22_A252CliCod, P08Y22_A831TipColCod
            }
            , new Object[] {
            P08Y23_A482ForColNom, P08Y23_A494ForSer, P08Y23_A483ForColNum, P08Y23_A5742ForSerDsc, P08Y23_n5742ForSerDsc, P08Y23_A396EmprCod, P08Y23_A252CliCod, P08Y23_A831TipColCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A831TipColCod ;
   private short Gx_err ;
   private int AV43GXV1 ;
   private int AV16TFForColNum ;
   private int AV17TFForColNum_To ;
   private int A483ForColNum ;
   private int A252CliCod ;
   private long AV30count ;
   private String AV12TFForSerDsc ;
   private String AV13TFForSerDsc_Sel ;
   private String AV14TFForColNom ;
   private String AV15TFForColNom_Sel ;
   private String scmdbuf ;
   private String lV12TFForSerDsc ;
   private String lV14TFForColNom ;
   private String AV40Var_ForSer ;
   private String A5742ForSerDsc ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk8Y22 ;
   private boolean n5742ForSerDsc ;
   private boolean brk8Y24 ;
   private String AV24OptionsJson ;
   private String AV27OptionsDescJson ;
   private String AV29OptionIndexesJson ;
   private String AV20DDOName ;
   private String AV18SearchTxt ;
   private String AV19SearchTxtTo ;
   private String AV22Option ;
   private com.genexus.webpanels.WebSession AV31Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08Y22_A5742ForSerDsc ;
   private boolean[] P08Y22_n5742ForSerDsc ;
   private String[] P08Y22_A494ForSer ;
   private int[] P08Y22_A483ForColNum ;
   private String[] P08Y22_A482ForColNom ;
   private String[] P08Y22_A396EmprCod ;
   private int[] P08Y22_A252CliCod ;
   private byte[] P08Y22_A831TipColCod ;
   private String[] P08Y23_A482ForColNom ;
   private String[] P08Y23_A494ForSer ;
   private int[] P08Y23_A483ForColNum ;
   private String[] P08Y23_A5742ForSerDsc ;
   private boolean[] P08Y23_n5742ForSerDsc ;
   private String[] P08Y23_A396EmprCod ;
   private int[] P08Y23_A252CliCod ;
   private byte[] P08Y23_A831TipColCod ;
   private GXSimpleCollection<String> AV23Options ;
   private GXSimpleCollection<String> AV26OptionsDesc ;
   private GXSimpleCollection<String> AV28OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV33GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV34GridStateFilterValue ;
}

final  class wpcncoloresgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08Y22( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV13TFForSerDsc_Sel ,
                                          String AV12TFForSerDsc ,
                                          String AV15TFForColNom_Sel ,
                                          String AV14TFForColNom ,
                                          int AV16TFForColNum ,
                                          int AV17TFForColNum_To ,
                                          String AV40Var_ForSer ,
                                          String A5742ForSerDsc ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          String A494ForSer )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[7];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT ForSerDsc, ForSer, ForColNum, ForColNom, EmprCod, CliCod, TipColCod FROM TXPCFORMU" ;
      if ( (GXutil.strcmp("", AV13TFForSerDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV12TFForSerDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13TFForSerDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(ForSerDsc = ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV15TFForColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV14TFForColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV15TFForColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(ForColNom = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (0==AV16TFForColNum) )
      {
         addWhere(sWhereString, "(ForColNum >= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (0==AV17TFForColNum_To) )
      {
         addWhere(sWhereString, "(ForColNum <= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV40Var_ForSer)==0) )
      {
         addWhere(sWhereString, "(ForSer = ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY ForSerDsc" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08Y23( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV13TFForSerDsc_Sel ,
                                          String AV12TFForSerDsc ,
                                          String AV15TFForColNom_Sel ,
                                          String AV14TFForColNom ,
                                          int AV16TFForColNum ,
                                          int AV17TFForColNum_To ,
                                          String AV40Var_ForSer ,
                                          String A5742ForSerDsc ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          String A494ForSer )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[7];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT ForColNom, ForSer, ForColNum, ForSerDsc, EmprCod, CliCod, TipColCod FROM TXPCFORMU" ;
      if ( (GXutil.strcmp("", AV13TFForSerDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV12TFForSerDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13TFForSerDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(ForSerDsc = ?)");
      }
      else
      {
         GXv_int4[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV15TFForColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV14TFForColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV15TFForColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(ForColNom = ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( ! (0==AV16TFForColNum) )
      {
         addWhere(sWhereString, "(ForColNum >= ?)");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (0==AV17TFForColNum_To) )
      {
         addWhere(sWhereString, "(ForColNum <= ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV40Var_ForSer)==0) )
      {
         addWhere(sWhereString, "(ForSer = ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY ForColNom" ;
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
                  return conditional_P08Y22(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] );
            case 1 :
                  return conditional_P08Y23(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08Y22", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08Y23", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 16);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 13);
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 13);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
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
                  stmt.setString(sIdx, (String)parms[7], 26);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 26);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 13);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 13);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[11]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[12]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 16);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 26);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 26);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 13);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 13);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[11]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[12]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 16);
               }
               return;
      }
   }

}

