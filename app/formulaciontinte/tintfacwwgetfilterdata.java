package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tintfacwwgetfilterdata extends GXProcedure
{
   public tintfacwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tintfacwwgetfilterdata.class ), "" );
   }

   public tintfacwwgetfilterdata( int remoteHandle ,
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
      tintfacwwgetfilterdata.this.aP5 = new String[] {""};
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
      tintfacwwgetfilterdata.this.AV16DDOName = aP0;
      tintfacwwgetfilterdata.this.AV14SearchTxt = aP1;
      tintfacwwgetfilterdata.this.AV15SearchTxtTo = aP2;
      tintfacwwgetfilterdata.this.aP3 = aP3;
      tintfacwwgetfilterdata.this.aP4 = aP4;
      tintfacwwgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_INTDSCF") == 0 )
      {
         /* Execute user subroutine: 'LOADINTDSCFOPTIONS' */
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
      if ( GXutil.strcmp(AV27Session.getValue("FormulacionTinte.TINTFACWWGridState"), "") == 0 )
      {
         AV29GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.TINTFACWWGridState"), null, null);
      }
      else
      {
         AV29GridState.fromxml(AV27Session.getValue("FormulacionTinte.TINTFACWWGridState"), null, null);
      }
      AV37GXV1 = 1 ;
      while ( AV37GXV1 <= AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV30GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV37GXV1));
         if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV34FilterFullText = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTDSCF") == 0 )
         {
            AV12TFIntDscF = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTDSCF_SEL") == 0 )
         {
            AV13TFIntDscF_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTCODF") == 0 )
         {
            AV10TFIntCodF = (byte)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFIntCodF_To = (byte)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         AV37GXV1 = (int)(AV37GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADINTDSCFOPTIONS' Routine */
      returnInSub = false ;
      AV12TFIntDscF = AV14SearchTxt ;
      AV13TFIntDscF_Sel = "" ;
      AV39Formulaciontinte_tintfacwwds_1_filterfulltext = AV34FilterFullText ;
      AV40Formulaciontinte_tintfacwwds_2_tfintdscf = AV12TFIntDscF ;
      AV41Formulaciontinte_tintfacwwds_3_tfintdscf_sel = AV13TFIntDscF_Sel ;
      AV42Formulaciontinte_tintfacwwds_4_tfintcodf = AV10TFIntCodF ;
      AV43Formulaciontinte_tintfacwwds_5_tfintcodf_to = AV11TFIntCodF_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV39Formulaciontinte_tintfacwwds_1_filterfulltext ,
                                           AV41Formulaciontinte_tintfacwwds_3_tfintdscf_sel ,
                                           AV40Formulaciontinte_tintfacwwds_2_tfintdscf ,
                                           Byte.valueOf(AV42Formulaciontinte_tintfacwwds_4_tfintcodf) ,
                                           Byte.valueOf(AV43Formulaciontinte_tintfacwwds_5_tfintcodf_to) ,
                                           A5363IntDscF ,
                                           Byte.valueOf(A5362IntCodF) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE
                                           }
      });
      lV39Formulaciontinte_tintfacwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV39Formulaciontinte_tintfacwwds_1_filterfulltext), "%", "") ;
      lV39Formulaciontinte_tintfacwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV39Formulaciontinte_tintfacwwds_1_filterfulltext), "%", "") ;
      lV40Formulaciontinte_tintfacwwds_2_tfintdscf = GXutil.padr( GXutil.rtrim( AV40Formulaciontinte_tintfacwwds_2_tfintdscf), 30, "%") ;
      /* Using cursor P08I12 */
      pr_default.execute(0, new Object[] {lV39Formulaciontinte_tintfacwwds_1_filterfulltext, lV39Formulaciontinte_tintfacwwds_1_filterfulltext, lV40Formulaciontinte_tintfacwwds_2_tfintdscf, AV41Formulaciontinte_tintfacwwds_3_tfintdscf_sel, Byte.valueOf(AV42Formulaciontinte_tintfacwwds_4_tfintcodf), Byte.valueOf(AV43Formulaciontinte_tintfacwwds_5_tfintcodf_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8I12 = false ;
         A5363IntDscF = P08I12_A5363IntDscF[0] ;
         n5363IntDscF = P08I12_n5363IntDscF[0] ;
         A5362IntCodF = P08I12_A5362IntCodF[0] ;
         A396EmprCod = P08I12_A396EmprCod[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08I12_A5363IntDscF[0], A5363IntDscF) == 0 ) )
         {
            brk8I12 = false ;
            A5362IntCodF = P08I12_A5362IntCodF[0] ;
            A396EmprCod = P08I12_A396EmprCod[0] ;
            AV26count = (long)(AV26count+1) ;
            brk8I12 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A5363IntDscF)==0) )
         {
            AV18Option = A5363IntDscF ;
            AV19Options.add(AV18Option, 0);
            AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV19Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8I12 )
         {
            brk8I12 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tintfacwwgetfilterdata.this.AV20OptionsJson;
      this.aP4[0] = tintfacwwgetfilterdata.this.AV23OptionsDescJson;
      this.aP5[0] = tintfacwwgetfilterdata.this.AV25OptionIndexesJson;
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
      AV34FilterFullText = "" ;
      AV12TFIntDscF = "" ;
      AV13TFIntDscF_Sel = "" ;
      A5363IntDscF = "" ;
      AV39Formulaciontinte_tintfacwwds_1_filterfulltext = "" ;
      AV40Formulaciontinte_tintfacwwds_2_tfintdscf = "" ;
      AV41Formulaciontinte_tintfacwwds_3_tfintdscf_sel = "" ;
      scmdbuf = "" ;
      lV39Formulaciontinte_tintfacwwds_1_filterfulltext = "" ;
      lV40Formulaciontinte_tintfacwwds_2_tfintdscf = "" ;
      P08I12_A5363IntDscF = new String[] {""} ;
      P08I12_n5363IntDscF = new boolean[] {false} ;
      P08I12_A5362IntCodF = new byte[1] ;
      P08I12_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV18Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.tintfacwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08I12_A5363IntDscF, P08I12_n5363IntDscF, P08I12_A5362IntCodF, P08I12_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10TFIntCodF ;
   private byte AV11TFIntCodF_To ;
   private byte AV42Formulaciontinte_tintfacwwds_4_tfintcodf ;
   private byte AV43Formulaciontinte_tintfacwwds_5_tfintcodf_to ;
   private byte A5362IntCodF ;
   private short Gx_err ;
   private int AV37GXV1 ;
   private long AV26count ;
   private String AV12TFIntDscF ;
   private String AV13TFIntDscF_Sel ;
   private String A5363IntDscF ;
   private String AV40Formulaciontinte_tintfacwwds_2_tfintdscf ;
   private String AV41Formulaciontinte_tintfacwwds_3_tfintdscf_sel ;
   private String scmdbuf ;
   private String lV40Formulaciontinte_tintfacwwds_2_tfintdscf ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk8I12 ;
   private boolean n5363IntDscF ;
   private String AV20OptionsJson ;
   private String AV23OptionsDescJson ;
   private String AV25OptionIndexesJson ;
   private String AV16DDOName ;
   private String AV14SearchTxt ;
   private String AV15SearchTxtTo ;
   private String AV34FilterFullText ;
   private String AV39Formulaciontinte_tintfacwwds_1_filterfulltext ;
   private String lV39Formulaciontinte_tintfacwwds_1_filterfulltext ;
   private String AV18Option ;
   private com.genexus.webpanels.WebSession AV27Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08I12_A5363IntDscF ;
   private boolean[] P08I12_n5363IntDscF ;
   private byte[] P08I12_A5362IntCodF ;
   private String[] P08I12_A396EmprCod ;
   private GXSimpleCollection<String> AV19Options ;
   private GXSimpleCollection<String> AV22OptionsDesc ;
   private GXSimpleCollection<String> AV24OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV29GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV30GridStateFilterValue ;
}

final  class tintfacwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08I12( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV39Formulaciontinte_tintfacwwds_1_filterfulltext ,
                                          String AV41Formulaciontinte_tintfacwwds_3_tfintdscf_sel ,
                                          String AV40Formulaciontinte_tintfacwwds_2_tfintdscf ,
                                          byte AV42Formulaciontinte_tintfacwwds_4_tfintcodf ,
                                          byte AV43Formulaciontinte_tintfacwwds_5_tfintcodf_to ,
                                          String A5363IntDscF ,
                                          byte A5362IntCodF )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[6];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT IntDscF, IntCodF, EmprCod FROM TXPINTFAC" ;
      if ( ! (GXutil.strcmp("", AV39Formulaciontinte_tintfacwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(IntDscF) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(IntCodF,'90'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV41Formulaciontinte_tintfacwwds_3_tfintdscf_sel)==0) && ( ! (GXutil.strcmp("", AV40Formulaciontinte_tintfacwwds_2_tfintdscf)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(IntDscF) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV41Formulaciontinte_tintfacwwds_3_tfintdscf_sel)==0) )
      {
         addWhere(sWhereString, "(IntDscF = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (0==AV42Formulaciontinte_tintfacwwds_4_tfintcodf) )
      {
         addWhere(sWhereString, "(IntCodF >= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (0==AV43Formulaciontinte_tintfacwwds_5_tfintcodf_to) )
      {
         addWhere(sWhereString, "(IntCodF <= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY IntDscF" ;
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
                  return conditional_P08I12(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).byteValue() , ((Number) dynConstraints[4]).byteValue() , (String)dynConstraints[5] , ((Number) dynConstraints[6]).byteValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08I12", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
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
                  stmt.setString(sIdx, (String)parms[8], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[10]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[11]).byteValue());
               }
               return;
      }
   }

}

