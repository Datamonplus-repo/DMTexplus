package app.mantenimientomaquina ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tmrcomwwgetfilterdata extends GXProcedure
{
   public tmrcomwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmrcomwwgetfilterdata.class ), "" );
   }

   public tmrcomwwgetfilterdata( int remoteHandle ,
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
      tmrcomwwgetfilterdata.this.aP5 = new String[] {""};
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
      tmrcomwwgetfilterdata.this.AV20DDOName = aP0;
      tmrcomwwgetfilterdata.this.AV18SearchTxt = aP1;
      tmrcomwwgetfilterdata.this.AV19SearchTxtTo = aP2;
      tmrcomwwgetfilterdata.this.aP3 = aP3;
      tmrcomwwgetfilterdata.this.aP4 = aP4;
      tmrcomwwgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV20DDOName), "DDO_MRPRINOM") == 0 )
      {
         /* Execute user subroutine: 'LOADMRPRINOMOPTIONS' */
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
      if ( GXutil.strcmp(AV31Session.getValue("MantenimientoMaquina.TMRComWWGridState"), "") == 0 )
      {
         AV33GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "MantenimientoMaquina.TMRComWWGridState"), null, null);
      }
      else
      {
         AV33GridState.fromxml(AV31Session.getValue("MantenimientoMaquina.TMRComWWGridState"), null, null);
      }
      AV39GXV1 = 1 ;
      while ( AV39GXV1 <= AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV34GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV39GXV1));
         if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV36FilterFullText = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRINOM") == 0 )
         {
            AV16TFMRPriNom = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRINOM_SEL") == 0 )
         {
            AV17TFMRPriNom_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRICOD") == 0 )
         {
            AV14TFMRPriCod = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV15TFMRPriCod_To = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         AV39GXV1 = (int)(AV39GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADMRPRINOMOPTIONS' Routine */
      returnInSub = false ;
      AV16TFMRPriNom = AV18SearchTxt ;
      AV17TFMRPriNom_Sel = "" ;
      AV41Mantenimientomaquina_tmrcomwwds_1_filterfulltext = AV36FilterFullText ;
      AV42Mantenimientomaquina_tmrcomwwds_2_tfmrprinom = AV16TFMRPriNom ;
      AV43Mantenimientomaquina_tmrcomwwds_3_tfmrprinom_sel = AV17TFMRPriNom_Sel ;
      AV44Mantenimientomaquina_tmrcomwwds_4_tfmrpricod = AV14TFMRPriCod ;
      AV45Mantenimientomaquina_tmrcomwwds_5_tfmrpricod_to = AV15TFMRPriCod_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV41Mantenimientomaquina_tmrcomwwds_1_filterfulltext ,
                                           AV43Mantenimientomaquina_tmrcomwwds_3_tfmrprinom_sel ,
                                           AV42Mantenimientomaquina_tmrcomwwds_2_tfmrprinom ,
                                           Integer.valueOf(AV44Mantenimientomaquina_tmrcomwwds_4_tfmrpricod) ,
                                           Integer.valueOf(AV45Mantenimientomaquina_tmrcomwwds_5_tfmrpricod_to) ,
                                           A1062MRPriNom ,
                                           Integer.valueOf(A1061MRPriCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT
                                           }
      });
      lV41Mantenimientomaquina_tmrcomwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV41Mantenimientomaquina_tmrcomwwds_1_filterfulltext), "%", "") ;
      lV41Mantenimientomaquina_tmrcomwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV41Mantenimientomaquina_tmrcomwwds_1_filterfulltext), "%", "") ;
      lV42Mantenimientomaquina_tmrcomwwds_2_tfmrprinom = GXutil.padr( GXutil.rtrim( AV42Mantenimientomaquina_tmrcomwwds_2_tfmrprinom), 100, "%") ;
      /* Using cursor P08BS2 */
      pr_default.execute(0, new Object[] {lV41Mantenimientomaquina_tmrcomwwds_1_filterfulltext, lV41Mantenimientomaquina_tmrcomwwds_1_filterfulltext, lV42Mantenimientomaquina_tmrcomwwds_2_tfmrprinom, AV43Mantenimientomaquina_tmrcomwwds_3_tfmrprinom_sel, Integer.valueOf(AV44Mantenimientomaquina_tmrcomwwds_4_tfmrpricod), Integer.valueOf(AV45Mantenimientomaquina_tmrcomwwds_5_tfmrpricod_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8BS2 = false ;
         A1061MRPriCod = P08BS2_A1061MRPriCod[0] ;
         A396EmprCod = P08BS2_A396EmprCod[0] ;
         A1062MRPriNom = P08BS2_A1062MRPriNom[0] ;
         n1062MRPriNom = P08BS2_n1062MRPriNom[0] ;
         A1062MRPriNom = P08BS2_A1062MRPriNom[0] ;
         n1062MRPriNom = P08BS2_n1062MRPriNom[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08BS2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P08BS2_A1061MRPriCod[0] == A1061MRPriCod ) )
         {
            brk8BS2 = false ;
            AV30count = (long)(AV30count+1) ;
            brk8BS2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A1062MRPriNom)==0) )
         {
            AV22Option = A1062MRPriNom ;
            AV21InsertIndex = 1 ;
            while ( ( AV21InsertIndex <= AV23Options.size() ) && ( GXutil.strcmp((String)AV23Options.elementAt(-1+AV21InsertIndex), AV22Option) < 0 ) )
            {
               AV21InsertIndex = (int)(AV21InsertIndex+1) ;
            }
            AV23Options.add(AV22Option, AV21InsertIndex);
            AV28OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), AV21InsertIndex);
         }
         if ( AV23Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8BS2 )
         {
            brk8BS2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tmrcomwwgetfilterdata.this.AV24OptionsJson;
      this.aP4[0] = tmrcomwwgetfilterdata.this.AV27OptionsDescJson;
      this.aP5[0] = tmrcomwwgetfilterdata.this.AV29OptionIndexesJson;
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
      AV16TFMRPriNom = "" ;
      AV17TFMRPriNom_Sel = "" ;
      A1062MRPriNom = "" ;
      AV41Mantenimientomaquina_tmrcomwwds_1_filterfulltext = "" ;
      AV42Mantenimientomaquina_tmrcomwwds_2_tfmrprinom = "" ;
      AV43Mantenimientomaquina_tmrcomwwds_3_tfmrprinom_sel = "" ;
      scmdbuf = "" ;
      lV41Mantenimientomaquina_tmrcomwwds_1_filterfulltext = "" ;
      lV42Mantenimientomaquina_tmrcomwwds_2_tfmrprinom = "" ;
      P08BS2_A1061MRPriCod = new int[1] ;
      P08BS2_A396EmprCod = new String[] {""} ;
      P08BS2_A1062MRPriNom = new String[] {""} ;
      P08BS2_n1062MRPriNom = new boolean[] {false} ;
      A396EmprCod = "" ;
      AV22Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.tmrcomwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08BS2_A1061MRPriCod, P08BS2_A396EmprCod, P08BS2_A1062MRPriNom, P08BS2_n1062MRPriNom
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV39GXV1 ;
   private int AV14TFMRPriCod ;
   private int AV15TFMRPriCod_To ;
   private int AV44Mantenimientomaquina_tmrcomwwds_4_tfmrpricod ;
   private int AV45Mantenimientomaquina_tmrcomwwds_5_tfmrpricod_to ;
   private int A1061MRPriCod ;
   private int AV21InsertIndex ;
   private long AV30count ;
   private String AV16TFMRPriNom ;
   private String AV17TFMRPriNom_Sel ;
   private String A1062MRPriNom ;
   private String AV42Mantenimientomaquina_tmrcomwwds_2_tfmrprinom ;
   private String AV43Mantenimientomaquina_tmrcomwwds_3_tfmrprinom_sel ;
   private String scmdbuf ;
   private String lV42Mantenimientomaquina_tmrcomwwds_2_tfmrprinom ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk8BS2 ;
   private boolean n1062MRPriNom ;
   private String AV24OptionsJson ;
   private String AV27OptionsDescJson ;
   private String AV29OptionIndexesJson ;
   private String AV20DDOName ;
   private String AV18SearchTxt ;
   private String AV19SearchTxtTo ;
   private String AV36FilterFullText ;
   private String AV41Mantenimientomaquina_tmrcomwwds_1_filterfulltext ;
   private String lV41Mantenimientomaquina_tmrcomwwds_1_filterfulltext ;
   private String AV22Option ;
   private com.genexus.webpanels.WebSession AV31Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private int[] P08BS2_A1061MRPriCod ;
   private String[] P08BS2_A396EmprCod ;
   private String[] P08BS2_A1062MRPriNom ;
   private boolean[] P08BS2_n1062MRPriNom ;
   private GXSimpleCollection<String> AV23Options ;
   private GXSimpleCollection<String> AV26OptionsDesc ;
   private GXSimpleCollection<String> AV28OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV33GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV34GridStateFilterValue ;
}

final  class tmrcomwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08BS2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV41Mantenimientomaquina_tmrcomwwds_1_filterfulltext ,
                                          String AV43Mantenimientomaquina_tmrcomwwds_3_tfmrprinom_sel ,
                                          String AV42Mantenimientomaquina_tmrcomwwds_2_tfmrprinom ,
                                          int AV44Mantenimientomaquina_tmrcomwwds_4_tfmrpricod ,
                                          int AV45Mantenimientomaquina_tmrcomwwds_5_tfmrpricod_to ,
                                          String A1062MRPriNom ,
                                          int A1061MRPriCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[6];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.MRPriCod AS MRPriCod, T1.EmprCod, T2.MRNom AS MRPriNom FROM (TXPMRCom T1 INNER JOIN TXPMREPUE T2 ON T2.EmprCod = T1.EmprCod AND T2.MRCod = T1.MRPriCod)" ;
      if ( ! (GXutil.strcmp("", AV41Mantenimientomaquina_tmrcomwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T2.MRNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.MRPriCod,'99999990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV43Mantenimientomaquina_tmrcomwwds_3_tfmrprinom_sel)==0) && ( ! (GXutil.strcmp("", AV42Mantenimientomaquina_tmrcomwwds_2_tfmrprinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MRNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV43Mantenimientomaquina_tmrcomwwds_3_tfmrprinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MRNom = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (0==AV44Mantenimientomaquina_tmrcomwwds_4_tfmrpricod) )
      {
         addWhere(sWhereString, "(T1.MRPriCod >= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (0==AV45Mantenimientomaquina_tmrcomwwds_5_tfmrpricod_to) )
      {
         addWhere(sWhereString, "(T1.MRPriCod <= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.MRPriCod" ;
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
                  return conditional_P08BS2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08BS2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 100);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[8], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 100);
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

