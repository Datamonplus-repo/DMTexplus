package app.ingenieria ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class incfgwwgetfilterdata extends GXProcedure
{
   public incfgwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( incfgwwgetfilterdata.class ), "" );
   }

   public incfgwwgetfilterdata( int remoteHandle ,
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
      incfgwwgetfilterdata.this.aP5 = new String[] {""};
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
      incfgwwgetfilterdata.this.AV20DDOName = aP0;
      incfgwwgetfilterdata.this.AV18SearchTxt = aP1;
      incfgwwgetfilterdata.this.AV19SearchTxtTo = aP2;
      incfgwwgetfilterdata.this.aP3 = aP3;
      incfgwwgetfilterdata.this.aP4 = aP4;
      incfgwwgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV20DDOName), "DDO_INCFGNOMBRE") == 0 )
      {
         /* Execute user subroutine: 'LOADINCFGNOMBREOPTIONS' */
         S121 ();
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
      if ( GXutil.strcmp(AV31Session.getValue("Ingenieria.InCfgWWGridState"), "") == 0 )
      {
         AV33GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Ingenieria.InCfgWWGridState"), null, null);
      }
      else
      {
         AV33GridState.fromxml(AV31Session.getValue("Ingenieria.InCfgWWGridState"), null, null);
      }
      AV47GXV1 = 1 ;
      while ( AV47GXV1 <= AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV34GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV47GXV1));
         if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV36FilterFullText = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINCFGNOMBRE") == 0 )
         {
            AV37TFInCfgNombre = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINCFGNOMBRE_SEL") == 0 )
         {
            AV38TFInCfgNombre_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV47GXV1 = (int)(AV47GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADINCFGNOMBREOPTIONS' Routine */
      returnInSub = false ;
      AV37TFInCfgNombre = AV18SearchTxt ;
      AV38TFInCfgNombre_Sel = "" ;
      AV49Ingenieria_incfgwwds_1_filterfulltext = AV36FilterFullText ;
      AV50Ingenieria_incfgwwds_2_tfincfgnombre = AV37TFInCfgNombre ;
      AV51Ingenieria_incfgwwds_3_tfincfgnombre_sel = AV38TFInCfgNombre_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV49Ingenieria_incfgwwds_1_filterfulltext ,
                                           AV51Ingenieria_incfgwwds_3_tfincfgnombre_sel ,
                                           AV50Ingenieria_incfgwwds_2_tfincfgnombre ,
                                           A14063InCfgNombr } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV49Ingenieria_incfgwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV49Ingenieria_incfgwwds_1_filterfulltext), "%", "") ;
      lV50Ingenieria_incfgwwds_2_tfincfgnombre = GXutil.concat( GXutil.rtrim( AV50Ingenieria_incfgwwds_2_tfincfgnombre), "%", "") ;
      /* Using cursor P09NH2 */
      pr_default.execute(0, new Object[] {lV49Ingenieria_incfgwwds_1_filterfulltext, lV50Ingenieria_incfgwwds_2_tfincfgnombre, AV51Ingenieria_incfgwwds_3_tfincfgnombre_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9NH2 = false ;
         A14063InCfgNombr = P09NH2_A14063InCfgNombr[0] ;
         A14062InCfgId = P09NH2_A14062InCfgId[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09NH2_A14063InCfgNombr[0], A14063InCfgNombr) == 0 ) )
         {
            brk9NH2 = false ;
            A14062InCfgId = P09NH2_A14062InCfgId[0] ;
            AV30count = (long)(AV30count+1) ;
            brk9NH2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A14063InCfgNombr)==0) )
         {
            AV22Option = A14063InCfgNombr ;
            AV23Options.add(AV22Option, 0);
            AV28OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV23Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9NH2 )
         {
            brk9NH2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = incfgwwgetfilterdata.this.AV24OptionsJson;
      this.aP4[0] = incfgwwgetfilterdata.this.AV27OptionsDescJson;
      this.aP5[0] = incfgwwgetfilterdata.this.AV29OptionIndexesJson;
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
      AV36FilterFullText = "" ;
      AV37TFInCfgNombre = "" ;
      AV38TFInCfgNombre_Sel = "" ;
      A14063InCfgNombr = "" ;
      AV49Ingenieria_incfgwwds_1_filterfulltext = "" ;
      AV50Ingenieria_incfgwwds_2_tfincfgnombre = "" ;
      AV51Ingenieria_incfgwwds_3_tfincfgnombre_sel = "" ;
      scmdbuf = "" ;
      lV49Ingenieria_incfgwwds_1_filterfulltext = "" ;
      lV50Ingenieria_incfgwwds_2_tfincfgnombre = "" ;
      P09NH2_A14063InCfgNombr = new String[] {""} ;
      P09NH2_A14062InCfgId = new short[1] ;
      AV22Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ingenieria.incfgwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09NH2_A14063InCfgNombr, P09NH2_A14062InCfgId
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A14062InCfgId ;
   private short Gx_err ;
   private int AV47GXV1 ;
   private long AV30count ;
   private String scmdbuf ;
   private boolean returnInSub ;
   private boolean brk9NH2 ;
   private String AV24OptionsJson ;
   private String AV27OptionsDescJson ;
   private String AV29OptionIndexesJson ;
   private String AV20DDOName ;
   private String AV18SearchTxt ;
   private String AV19SearchTxtTo ;
   private String AV36FilterFullText ;
   private String AV37TFInCfgNombre ;
   private String AV38TFInCfgNombre_Sel ;
   private String A14063InCfgNombr ;
   private String AV49Ingenieria_incfgwwds_1_filterfulltext ;
   private String AV50Ingenieria_incfgwwds_2_tfincfgnombre ;
   private String AV51Ingenieria_incfgwwds_3_tfincfgnombre_sel ;
   private String lV49Ingenieria_incfgwwds_1_filterfulltext ;
   private String lV50Ingenieria_incfgwwds_2_tfincfgnombre ;
   private String AV22Option ;
   private com.genexus.webpanels.WebSession AV31Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09NH2_A14063InCfgNombr ;
   private short[] P09NH2_A14062InCfgId ;
   private GXSimpleCollection<String> AV23Options ;
   private GXSimpleCollection<String> AV26OptionsDesc ;
   private GXSimpleCollection<String> AV28OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV33GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV34GridStateFilterValue ;
}

final  class incfgwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09NH2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV49Ingenieria_incfgwwds_1_filterfulltext ,
                                          String AV51Ingenieria_incfgwwds_3_tfincfgnombre_sel ,
                                          String AV50Ingenieria_incfgwwds_2_tfincfgnombre ,
                                          String A14063InCfgNombr )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[3];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT InCfgNombr, InCfgId FROM TXPINCFG" ;
      if ( ! (GXutil.strcmp("", AV49Ingenieria_incfgwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(InCfgNombr) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV51Ingenieria_incfgwwds_3_tfincfgnombre_sel)==0) && ( ! (GXutil.strcmp("", AV50Ingenieria_incfgwwds_2_tfincfgnombre)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(InCfgNombr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51Ingenieria_incfgwwds_3_tfincfgnombre_sel)==0) )
      {
         addWhere(sWhereString, "(InCfgNombr = ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY InCfgNombr" ;
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
                  return conditional_P09NH2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09NH2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
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
                  stmt.setVarchar(sIdx, (String)parms[3], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[4], 30);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[5], 30);
               }
               return;
      }
   }

}

