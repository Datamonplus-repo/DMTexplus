package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ttrn07wwgetfilterdata extends GXProcedure
{
   public ttrn07wwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttrn07wwgetfilterdata.class ), "" );
   }

   public ttrn07wwgetfilterdata( int remoteHandle ,
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
      ttrn07wwgetfilterdata.this.aP5 = new String[] {""};
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
      ttrn07wwgetfilterdata.this.AV16DDOName = aP0;
      ttrn07wwgetfilterdata.this.AV14SearchTxt = aP1;
      ttrn07wwgetfilterdata.this.AV15SearchTxtTo = aP2;
      ttrn07wwgetfilterdata.this.aP3 = aP3;
      ttrn07wwgetfilterdata.this.aP4 = aP4;
      ttrn07wwgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_EMPRGUIREM") == 0 )
      {
         /* Execute user subroutine: 'LOADEMPRGUIREMOPTIONS' */
         S121 ();
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
      if ( GXutil.strcmp(AV27Session.getValue("TTrn07WWGridState"), "") == 0 )
      {
         AV29GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TTrn07WWGridState"), null, null);
      }
      else
      {
         AV29GridState.fromxml(AV27Session.getValue("TTrn07WWGridState"), null, null);
      }
      AV35GXV1 = 1 ;
      while ( AV35GXV1 <= AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV30GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV35GXV1));
         if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV32FilterFullText = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROCOD") == 0 )
         {
            AV10TFAlbProCod = GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            AV11TFAlbProCod_To = GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRGUIREM") == 0 )
         {
            AV12TFEmprGuiRem = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRGUIREM_SEL") == 0 )
         {
            AV13TFEmprGuiRem_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV35GXV1 = (int)(AV35GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADEMPRGUIREMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFEmprGuiRem = AV14SearchTxt ;
      AV13TFEmprGuiRem_Sel = "" ;
      AV37Ttrn07wwds_1_filterfulltext = AV32FilterFullText ;
      AV38Ttrn07wwds_2_tfalbprocod = AV10TFAlbProCod ;
      AV39Ttrn07wwds_3_tfalbprocod_to = AV11TFAlbProCod_To ;
      AV40Ttrn07wwds_4_tfemprguirem = AV12TFEmprGuiRem ;
      AV41Ttrn07wwds_5_tfemprguirem_sel = AV13TFEmprGuiRem_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV37Ttrn07wwds_1_filterfulltext ,
                                           Long.valueOf(AV38Ttrn07wwds_2_tfalbprocod) ,
                                           Long.valueOf(AV39Ttrn07wwds_3_tfalbprocod_to) ,
                                           AV41Ttrn07wwds_5_tfemprguirem_sel ,
                                           AV40Ttrn07wwds_4_tfemprguirem ,
                                           Long.valueOf(A30AlbProCod) ,
                                           A1253EmprGuiRem } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING
                                           }
      });
      lV37Ttrn07wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV37Ttrn07wwds_1_filterfulltext), "%", "") ;
      lV37Ttrn07wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV37Ttrn07wwds_1_filterfulltext), "%", "") ;
      lV40Ttrn07wwds_4_tfemprguirem = GXutil.padr( GXutil.rtrim( AV40Ttrn07wwds_4_tfemprguirem), 3, "%") ;
      /* Using cursor P08U62 */
      pr_default.execute(0, new Object[] {lV37Ttrn07wwds_1_filterfulltext, lV37Ttrn07wwds_1_filterfulltext, Long.valueOf(AV38Ttrn07wwds_2_tfalbprocod), Long.valueOf(AV39Ttrn07wwds_3_tfalbprocod_to), lV40Ttrn07wwds_4_tfemprguirem, AV41Ttrn07wwds_5_tfemprguirem_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8U62 = false ;
         A1253EmprGuiRem = P08U62_A1253EmprGuiRem[0] ;
         A30AlbProCod = P08U62_A30AlbProCod[0] ;
         A396EmprCod = P08U62_A396EmprCod[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08U62_A1253EmprGuiRem[0], A1253EmprGuiRem) == 0 ) )
         {
            brk8U62 = false ;
            A30AlbProCod = P08U62_A30AlbProCod[0] ;
            A396EmprCod = P08U62_A396EmprCod[0] ;
            AV26count = (long)(AV26count+1) ;
            brk8U62 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A1253EmprGuiRem)==0) )
         {
            AV18Option = A1253EmprGuiRem ;
            AV21OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A1253EmprGuiRem, "@!"))) ;
            AV19Options.add(AV18Option, 0);
            AV22OptionsDesc.add(AV21OptionDesc, 0);
            AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV19Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8U62 )
         {
            brk8U62 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = ttrn07wwgetfilterdata.this.AV20OptionsJson;
      this.aP4[0] = ttrn07wwgetfilterdata.this.AV23OptionsDescJson;
      this.aP5[0] = ttrn07wwgetfilterdata.this.AV25OptionIndexesJson;
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
      AV12TFEmprGuiRem = "" ;
      AV13TFEmprGuiRem_Sel = "" ;
      A1253EmprGuiRem = "" ;
      AV37Ttrn07wwds_1_filterfulltext = "" ;
      AV40Ttrn07wwds_4_tfemprguirem = "" ;
      AV41Ttrn07wwds_5_tfemprguirem_sel = "" ;
      scmdbuf = "" ;
      lV37Ttrn07wwds_1_filterfulltext = "" ;
      lV40Ttrn07wwds_4_tfemprguirem = "" ;
      P08U62_A1253EmprGuiRem = new String[] {""} ;
      P08U62_A30AlbProCod = new long[1] ;
      P08U62_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV18Option = "" ;
      AV21OptionDesc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttrn07wwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08U62_A1253EmprGuiRem, P08U62_A30AlbProCod, P08U62_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV35GXV1 ;
   private long AV10TFAlbProCod ;
   private long AV11TFAlbProCod_To ;
   private long AV38Ttrn07wwds_2_tfalbprocod ;
   private long AV39Ttrn07wwds_3_tfalbprocod_to ;
   private long A30AlbProCod ;
   private long AV26count ;
   private String AV12TFEmprGuiRem ;
   private String AV13TFEmprGuiRem_Sel ;
   private String A1253EmprGuiRem ;
   private String AV40Ttrn07wwds_4_tfemprguirem ;
   private String AV41Ttrn07wwds_5_tfemprguirem_sel ;
   private String scmdbuf ;
   private String lV40Ttrn07wwds_4_tfemprguirem ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk8U62 ;
   private String AV20OptionsJson ;
   private String AV23OptionsDescJson ;
   private String AV25OptionIndexesJson ;
   private String AV16DDOName ;
   private String AV14SearchTxt ;
   private String AV15SearchTxtTo ;
   private String AV32FilterFullText ;
   private String AV37Ttrn07wwds_1_filterfulltext ;
   private String lV37Ttrn07wwds_1_filterfulltext ;
   private String AV18Option ;
   private String AV21OptionDesc ;
   private com.genexus.webpanels.WebSession AV27Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08U62_A1253EmprGuiRem ;
   private long[] P08U62_A30AlbProCod ;
   private String[] P08U62_A396EmprCod ;
   private GXSimpleCollection<String> AV19Options ;
   private GXSimpleCollection<String> AV22OptionsDesc ;
   private GXSimpleCollection<String> AV24OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV29GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV30GridStateFilterValue ;
}

final  class ttrn07wwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08U62( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV37Ttrn07wwds_1_filterfulltext ,
                                          long AV38Ttrn07wwds_2_tfalbprocod ,
                                          long AV39Ttrn07wwds_3_tfalbprocod_to ,
                                          String AV41Ttrn07wwds_5_tfemprguirem_sel ,
                                          String AV40Ttrn07wwds_4_tfemprguirem ,
                                          long A30AlbProCod ,
                                          String A1253EmprGuiRem )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[6];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT EmprGuiRem, AlbProCod, EmprCod FROM TXPCALPRD" ;
      if ( ! (GXutil.strcmp("", AV37Ttrn07wwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(AlbProCod,'9999999990'), 2) like '%' || ?) or ( UPPER(EmprGuiRem) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
      }
      if ( ! (0==AV38Ttrn07wwds_2_tfalbprocod) )
      {
         addWhere(sWhereString, "(AlbProCod >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV39Ttrn07wwds_3_tfalbprocod_to) )
      {
         addWhere(sWhereString, "(AlbProCod <= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV41Ttrn07wwds_5_tfemprguirem_sel)==0) && ( ! (GXutil.strcmp("", AV40Ttrn07wwds_4_tfemprguirem)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(EmprGuiRem) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV41Ttrn07wwds_5_tfemprguirem_sel)==0) )
      {
         addWhere(sWhereString, "(EmprGuiRem = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprGuiRem" ;
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
                  return conditional_P08U62(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).longValue() , ((Number) dynConstraints[2]).longValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).longValue() , (String)dynConstraints[6] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08U62", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
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
                  stmt.setLong(sIdx, ((Number) parms[8]).longValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[9]).longValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 3);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 3);
               }
               return;
      }
   }

}

