package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tunmefowwgetfilterdata extends GXProcedure
{
   public tunmefowwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tunmefowwgetfilterdata.class ), "" );
   }

   public tunmefowwgetfilterdata( int remoteHandle ,
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
      tunmefowwgetfilterdata.this.aP5 = new String[] {""};
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
      tunmefowwgetfilterdata.this.AV16DDOName = aP0;
      tunmefowwgetfilterdata.this.AV14SearchTxt = aP1;
      tunmefowwgetfilterdata.this.AV15SearchTxtTo = aP2;
      tunmefowwgetfilterdata.this.aP3 = aP3;
      tunmefowwgetfilterdata.this.aP4 = aP4;
      tunmefowwgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_FORPRDDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADFORPRDDSCOPTIONS' */
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
      if ( GXutil.strcmp(AV27Session.getValue("FormulacionTinte.TUNMEFOWWGridState"), "") == 0 )
      {
         AV29GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.TUNMEFOWWGridState"), null, null);
      }
      else
      {
         AV29GridState.fromxml(AV27Session.getValue("FormulacionTinte.TUNMEFOWWGridState"), null, null);
      }
      AV37GXV1 = 1 ;
      while ( AV37GXV1 <= AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV30GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV37GXV1));
         if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDUME") == 0 )
         {
            AV10TFForPrdUMe = (byte)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFForPrdUMe_To = (byte)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDDSC") == 0 )
         {
            AV12TFForPrdDsc = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDDSC_SEL") == 0 )
         {
            AV13TFForPrdDsc_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV37GXV1 = (int)(AV37GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADFORPRDDSCOPTIONS' Routine */
      returnInSub = false ;
      AV12TFForPrdDsc = AV14SearchTxt ;
      AV13TFForPrdDsc_Sel = "" ;
      AV39Formulaciontinte_tunmefowwds_1_tfforprdume = AV10TFForPrdUMe ;
      AV40Formulaciontinte_tunmefowwds_2_tfforprdume_to = AV11TFForPrdUMe_To ;
      AV41Formulaciontinte_tunmefowwds_3_tfforprddsc = AV12TFForPrdDsc ;
      AV42Formulaciontinte_tunmefowwds_4_tfforprddsc_sel = AV13TFForPrdDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(AV39Formulaciontinte_tunmefowwds_1_tfforprdume) ,
                                           Byte.valueOf(AV40Formulaciontinte_tunmefowwds_2_tfforprdume_to) ,
                                           AV42Formulaciontinte_tunmefowwds_4_tfforprddsc_sel ,
                                           AV41Formulaciontinte_tunmefowwds_3_tfforprddsc ,
                                           Byte.valueOf(A490ForPrdUMe) ,
                                           A488ForPrdDsc } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV41Formulaciontinte_tunmefowwds_3_tfforprddsc = GXutil.padr( GXutil.rtrim( AV41Formulaciontinte_tunmefowwds_3_tfforprddsc), 5, "%") ;
      /* Using cursor P08H92 */
      pr_default.execute(0, new Object[] {Byte.valueOf(AV39Formulaciontinte_tunmefowwds_1_tfforprdume), Byte.valueOf(AV40Formulaciontinte_tunmefowwds_2_tfforprdume_to), lV41Formulaciontinte_tunmefowwds_3_tfforprddsc, AV42Formulaciontinte_tunmefowwds_4_tfforprddsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8H92 = false ;
         A488ForPrdDsc = P08H92_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P08H92_n488ForPrdDsc[0] ;
         A490ForPrdUMe = P08H92_A490ForPrdUMe[0] ;
         A396EmprCod = P08H92_A396EmprCod[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08H92_A488ForPrdDsc[0], A488ForPrdDsc) == 0 ) )
         {
            brk8H92 = false ;
            A490ForPrdUMe = P08H92_A490ForPrdUMe[0] ;
            A396EmprCod = P08H92_A396EmprCod[0] ;
            AV26count = (long)(AV26count+1) ;
            brk8H92 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A488ForPrdDsc)==0) )
         {
            AV18Option = A488ForPrdDsc ;
            AV19Options.add(AV18Option, 0);
            AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV19Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8H92 )
         {
            brk8H92 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tunmefowwgetfilterdata.this.AV20OptionsJson;
      this.aP4[0] = tunmefowwgetfilterdata.this.AV23OptionsDescJson;
      this.aP5[0] = tunmefowwgetfilterdata.this.AV25OptionIndexesJson;
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
      AV12TFForPrdDsc = "" ;
      AV13TFForPrdDsc_Sel = "" ;
      A488ForPrdDsc = "" ;
      AV41Formulaciontinte_tunmefowwds_3_tfforprddsc = "" ;
      AV42Formulaciontinte_tunmefowwds_4_tfforprddsc_sel = "" ;
      scmdbuf = "" ;
      lV41Formulaciontinte_tunmefowwds_3_tfforprddsc = "" ;
      P08H92_A488ForPrdDsc = new String[] {""} ;
      P08H92_n488ForPrdDsc = new boolean[] {false} ;
      P08H92_A490ForPrdUMe = new byte[1] ;
      P08H92_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV18Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.tunmefowwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08H92_A488ForPrdDsc, P08H92_n488ForPrdDsc, P08H92_A490ForPrdUMe, P08H92_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10TFForPrdUMe ;
   private byte AV11TFForPrdUMe_To ;
   private byte AV39Formulaciontinte_tunmefowwds_1_tfforprdume ;
   private byte AV40Formulaciontinte_tunmefowwds_2_tfforprdume_to ;
   private byte A490ForPrdUMe ;
   private short Gx_err ;
   private int AV37GXV1 ;
   private long AV26count ;
   private String AV12TFForPrdDsc ;
   private String AV13TFForPrdDsc_Sel ;
   private String A488ForPrdDsc ;
   private String AV41Formulaciontinte_tunmefowwds_3_tfforprddsc ;
   private String AV42Formulaciontinte_tunmefowwds_4_tfforprddsc_sel ;
   private String scmdbuf ;
   private String lV41Formulaciontinte_tunmefowwds_3_tfforprddsc ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk8H92 ;
   private boolean n488ForPrdDsc ;
   private String AV20OptionsJson ;
   private String AV23OptionsDescJson ;
   private String AV25OptionIndexesJson ;
   private String AV16DDOName ;
   private String AV14SearchTxt ;
   private String AV15SearchTxtTo ;
   private String AV18Option ;
   private com.genexus.webpanels.WebSession AV27Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08H92_A488ForPrdDsc ;
   private boolean[] P08H92_n488ForPrdDsc ;
   private byte[] P08H92_A490ForPrdUMe ;
   private String[] P08H92_A396EmprCod ;
   private GXSimpleCollection<String> AV19Options ;
   private GXSimpleCollection<String> AV22OptionsDesc ;
   private GXSimpleCollection<String> AV24OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV29GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV30GridStateFilterValue ;
}

final  class tunmefowwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08H92( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte AV39Formulaciontinte_tunmefowwds_1_tfforprdume ,
                                          byte AV40Formulaciontinte_tunmefowwds_2_tfforprdume_to ,
                                          String AV42Formulaciontinte_tunmefowwds_4_tfforprddsc_sel ,
                                          String AV41Formulaciontinte_tunmefowwds_3_tfforprddsc ,
                                          byte A490ForPrdUMe ,
                                          String A488ForPrdDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[4];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT ForPrdDsc, ForPrdUMe, EmprCod FROM TXPUNMEPR" ;
      if ( ! (0==AV39Formulaciontinte_tunmefowwds_1_tfforprdume) )
      {
         addWhere(sWhereString, "(ForPrdUMe >= ?)");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( ! (0==AV40Formulaciontinte_tunmefowwds_2_tfforprdume_to) )
      {
         addWhere(sWhereString, "(ForPrdUMe <= ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV42Formulaciontinte_tunmefowwds_4_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV41Formulaciontinte_tunmefowwds_3_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV42Formulaciontinte_tunmefowwds_4_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(ForPrdDsc = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY ForPrdDsc" ;
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
                  return conditional_P08H92(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , ((Number) dynConstraints[1]).byteValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).byteValue() , (String)dynConstraints[5] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08H92", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
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
                  stmt.setByte(sIdx, ((Number) parms[4]).byteValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[5]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[6], 5);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 5);
               }
               return;
      }
   }

}

