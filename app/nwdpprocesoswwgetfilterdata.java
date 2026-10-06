package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class nwdpprocesoswwgetfilterdata extends GXProcedure
{
   public nwdpprocesoswwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( nwdpprocesoswwgetfilterdata.class ), "" );
   }

   public nwdpprocesoswwgetfilterdata( int remoteHandle ,
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
      nwdpprocesoswwgetfilterdata.this.aP5 = new String[] {""};
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
      nwdpprocesoswwgetfilterdata.this.AV26DDOName = aP0;
      nwdpprocesoswwgetfilterdata.this.AV27SearchTxt = aP1;
      nwdpprocesoswwgetfilterdata.this.AV28SearchTxtTo = aP2;
      nwdpprocesoswwgetfilterdata.this.aP3 = aP3;
      nwdpprocesoswwgetfilterdata.this.aP4 = aP4;
      nwdpprocesoswwgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV26DDOName), "DDO_EMPRCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADEMPRCODOPTIONS' */
         S121 ();
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
      if ( GXutil.strcmp(AV21Session.getValue("NwDPProcesosWWGridState"), "") == 0 )
      {
         AV23GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "NwDPProcesosWWGridState"), null, null);
      }
      else
      {
         AV23GridState.fromxml(AV21Session.getValue("NwDPProcesosWWGridState"), null, null);
      }
      AV35GXV1 = 1 ;
      while ( AV35GXV1 <= AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV24GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV35GXV1));
         if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV32FilterFullText = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD") == 0 )
         {
            AV10TFEmprCod = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD_SEL") == 0 )
         {
            AV11TFEmprCod_Sel = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCOD") == 0 )
         {
            AV12TFDisCod = (int)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV13TFDisCod_To = (int)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         AV35GXV1 = (int)(AV35GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADEMPRCODOPTIONS' Routine */
      returnInSub = false ;
      AV10TFEmprCod = AV27SearchTxt ;
      AV11TFEmprCod_Sel = "" ;
      AV37Nwdpprocesoswwds_1_filterfulltext = AV32FilterFullText ;
      AV38Nwdpprocesoswwds_2_tfemprcod = AV10TFEmprCod ;
      AV39Nwdpprocesoswwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV40Nwdpprocesoswwds_4_tfdiscod = AV12TFDisCod ;
      AV41Nwdpprocesoswwds_5_tfdiscod_to = AV13TFDisCod_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV37Nwdpprocesoswwds_1_filterfulltext ,
                                           AV39Nwdpprocesoswwds_3_tfemprcod_sel ,
                                           AV38Nwdpprocesoswwds_2_tfemprcod ,
                                           Integer.valueOf(AV40Nwdpprocesoswwds_4_tfdiscod) ,
                                           Integer.valueOf(AV41Nwdpprocesoswwds_5_tfdiscod_to) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A361DisCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV37Nwdpprocesoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV37Nwdpprocesoswwds_1_filterfulltext), "%", "") ;
      lV37Nwdpprocesoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV37Nwdpprocesoswwds_1_filterfulltext), "%", "") ;
      lV38Nwdpprocesoswwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV38Nwdpprocesoswwds_2_tfemprcod), 3, "%") ;
      /* Using cursor P08E62 */
      pr_default.execute(0, new Object[] {lV37Nwdpprocesoswwds_1_filterfulltext, lV37Nwdpprocesoswwds_1_filterfulltext, lV38Nwdpprocesoswwds_2_tfemprcod, AV39Nwdpprocesoswwds_3_tfemprcod_sel, Integer.valueOf(AV40Nwdpprocesoswwds_4_tfdiscod), Integer.valueOf(AV41Nwdpprocesoswwds_5_tfdiscod_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8E62 = false ;
         A396EmprCod = P08E62_A396EmprCod[0] ;
         A361DisCod = P08E62_A361DisCod[0] ;
         AV20count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08E62_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            brk8E62 = false ;
            A361DisCod = P08E62_A361DisCod[0] ;
            AV20count = (long)(AV20count+1) ;
            brk8E62 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A396EmprCod)==0) )
         {
            AV15Option = A396EmprCod ;
            AV17OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))) ;
            AV16Options.add(AV15Option, 0);
            AV18OptionsDesc.add(AV17OptionDesc, 0);
            AV19OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV20count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV16Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8E62 )
         {
            brk8E62 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = nwdpprocesoswwgetfilterdata.this.AV29OptionsJson;
      this.aP4[0] = nwdpprocesoswwgetfilterdata.this.AV30OptionsDescJson;
      this.aP5[0] = nwdpprocesoswwgetfilterdata.this.AV31OptionIndexesJson;
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
      AV32FilterFullText = "" ;
      AV10TFEmprCod = "" ;
      AV11TFEmprCod_Sel = "" ;
      A396EmprCod = "" ;
      AV37Nwdpprocesoswwds_1_filterfulltext = "" ;
      AV38Nwdpprocesoswwds_2_tfemprcod = "" ;
      AV39Nwdpprocesoswwds_3_tfemprcod_sel = "" ;
      scmdbuf = "" ;
      lV37Nwdpprocesoswwds_1_filterfulltext = "" ;
      lV38Nwdpprocesoswwds_2_tfemprcod = "" ;
      P08E62_A396EmprCod = new String[] {""} ;
      P08E62_A361DisCod = new int[1] ;
      AV15Option = "" ;
      AV17OptionDesc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.nwdpprocesoswwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08E62_A396EmprCod, P08E62_A361DisCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV35GXV1 ;
   private int AV12TFDisCod ;
   private int AV13TFDisCod_To ;
   private int AV40Nwdpprocesoswwds_4_tfdiscod ;
   private int AV41Nwdpprocesoswwds_5_tfdiscod_to ;
   private int A361DisCod ;
   private long AV20count ;
   private String AV10TFEmprCod ;
   private String AV11TFEmprCod_Sel ;
   private String A396EmprCod ;
   private String AV38Nwdpprocesoswwds_2_tfemprcod ;
   private String AV39Nwdpprocesoswwds_3_tfemprcod_sel ;
   private String scmdbuf ;
   private String lV38Nwdpprocesoswwds_2_tfemprcod ;
   private boolean returnInSub ;
   private boolean brk8E62 ;
   private String AV29OptionsJson ;
   private String AV30OptionsDescJson ;
   private String AV31OptionIndexesJson ;
   private String AV26DDOName ;
   private String AV27SearchTxt ;
   private String AV28SearchTxtTo ;
   private String AV32FilterFullText ;
   private String AV37Nwdpprocesoswwds_1_filterfulltext ;
   private String lV37Nwdpprocesoswwds_1_filterfulltext ;
   private String AV15Option ;
   private String AV17OptionDesc ;
   private com.genexus.webpanels.WebSession AV21Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08E62_A396EmprCod ;
   private int[] P08E62_A361DisCod ;
   private GXSimpleCollection<String> AV16Options ;
   private GXSimpleCollection<String> AV18OptionsDesc ;
   private GXSimpleCollection<String> AV19OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV23GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV24GridStateFilterValue ;
}

final  class nwdpprocesoswwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08E62( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV37Nwdpprocesoswwds_1_filterfulltext ,
                                          String AV39Nwdpprocesoswwds_3_tfemprcod_sel ,
                                          String AV38Nwdpprocesoswwds_2_tfemprcod ,
                                          int AV40Nwdpprocesoswwds_4_tfdiscod ,
                                          int AV41Nwdpprocesoswwds_5_tfdiscod_to ,
                                          String A396EmprCod ,
                                          int A361DisCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[6];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT EmprCod, DisCod FROM TXPDISPOS" ;
      if ( ! (GXutil.strcmp("", AV37Nwdpprocesoswwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(EmprCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(DisCod,'99999990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV39Nwdpprocesoswwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV38Nwdpprocesoswwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV39Nwdpprocesoswwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(EmprCod = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (0==AV40Nwdpprocesoswwds_4_tfdiscod) )
      {
         addWhere(sWhereString, "(DisCod >= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (0==AV41Nwdpprocesoswwds_5_tfdiscod_to) )
      {
         addWhere(sWhereString, "(DisCod <= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod" ;
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
                  return conditional_P08E62(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08E62", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
                  stmt.setString(sIdx, (String)parms[8], 3);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 3);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[10]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[11]).intValue());
               }
               return;
      }
   }

}

