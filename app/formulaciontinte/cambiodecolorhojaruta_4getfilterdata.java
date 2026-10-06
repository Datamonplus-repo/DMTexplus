package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class cambiodecolorhojaruta_4getfilterdata extends GXProcedure
{
   public cambiodecolorhojaruta_4getfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( cambiodecolorhojaruta_4getfilterdata.class ), "" );
   }

   public cambiodecolorhojaruta_4getfilterdata( int remoteHandle ,
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
      cambiodecolorhojaruta_4getfilterdata.this.aP5 = new String[] {""};
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
      cambiodecolorhojaruta_4getfilterdata.this.AV24DDOName = aP0;
      cambiodecolorhojaruta_4getfilterdata.this.AV25SearchTxt = aP1;
      cambiodecolorhojaruta_4getfilterdata.this.AV26SearchTxtTo = aP2;
      cambiodecolorhojaruta_4getfilterdata.this.aP3 = aP3;
      cambiodecolorhojaruta_4getfilterdata.this.aP4 = aP4;
      cambiodecolorhojaruta_4getfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV14Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV16OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV17OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV24DDOName), "DDO_BARAGRNHDR") == 0 )
      {
         /* Execute user subroutine: 'LOADBARAGRNHDROPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV27OptionsJson = AV14Options.toJSonString(false) ;
      AV28OptionsDescJson = AV16OptionsDesc.toJSonString(false) ;
      AV29OptionIndexesJson = AV17OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("FormulacionTinte.CambiodeColorHojaRuta_4GridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.CambiodeColorHojaRuta_4GridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("FormulacionTinte.CambiodeColorHojaRuta_4GridState"), null, null);
      }
      AV45GXV1 = 1 ;
      while ( AV45GXV1 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV45GXV1));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGRNHDR") == 0 )
         {
            AV10TFBarAgrNhdr = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGRNHDR_SEL") == 0 )
         {
            AV11TFBarAgrNhdr_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV30emprcod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOD") == 0 )
         {
            AV31barcod = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREO") == 0 )
         {
            AV32barcodreo = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPAR") == 0 )
         {
            AV33barcodpar = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV34clicod = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLINOM") == 0 )
         {
            AV35clinom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSER") == 0 )
         {
            AV36barser = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNOM") == 0 )
         {
            AV37barcolnom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNUM") == 0 )
         {
            AV38barcolnum = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARTIPCOL") == 0 )
         {
            AV39bartipcol = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARNOMCLI") == 0 )
         {
            AV40barnomcli = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARNUMCLI") == 0 )
         {
            AV41barnumcli = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARAGREST") == 0 )
         {
            AV42BarAgrEst = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV45GXV1 = (int)(AV45GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADBARAGRNHDROPTIONS' Routine */
      returnInSub = false ;
      AV10TFBarAgrNhdr = AV25SearchTxt ;
      AV11TFBarAgrNhdr_Sel = "" ;
      AV47Formulaciontinte_cambiodecolorhojaruta_4ds_1_tfbaragrnhdr = AV10TFBarAgrNhdr ;
      AV48Formulaciontinte_cambiodecolorhojaruta_4ds_2_tfbaragrnhdr_sel = AV11TFBarAgrNhdr_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV48Formulaciontinte_cambiodecolorhojaruta_4ds_2_tfbaragrnhdr_sel ,
                                           AV47Formulaciontinte_cambiodecolorhojaruta_4ds_1_tfbaragrnhdr ,
                                           Integer.valueOf(A119BarAgrCod) ,
                                           Byte.valueOf(A124BarAgrReo) ,
                                           A122BarAgrPar ,
                                           AV30emprcod ,
                                           Integer.valueOf(AV31barcod) ,
                                           Byte.valueOf(AV32barcodreo) ,
                                           AV33barcodpar ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV47Formulaciontinte_cambiodecolorhojaruta_4ds_1_tfbaragrnhdr = GXutil.padr( GXutil.rtrim( AV47Formulaciontinte_cambiodecolorhojaruta_4ds_1_tfbaragrnhdr), 11, "%") ;
      /* Using cursor P0A5M2 */
      pr_default.execute(0, new Object[] {AV30emprcod, Integer.valueOf(AV31barcod), Byte.valueOf(AV32barcodreo), AV33barcodpar, lV47Formulaciontinte_cambiodecolorhojaruta_4ds_1_tfbaragrnhdr, AV48Formulaciontinte_cambiodecolorhojaruta_4ds_2_tfbaragrnhdr_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P0A5M2_A130BarCodPar[0] ;
         A132BarCodReo = P0A5M2_A132BarCodReo[0] ;
         A129BarCod = P0A5M2_A129BarCod[0] ;
         A396EmprCod = P0A5M2_A396EmprCod[0] ;
         A122BarAgrPar = P0A5M2_A122BarAgrPar[0] ;
         A124BarAgrReo = P0A5M2_A124BarAgrReo[0] ;
         A119BarAgrCod = P0A5M2_A119BarAgrCod[0] ;
         A13792BarAgrNhdr = GXutil.str( A119BarAgrCod, 8, 0) + "-" + GXutil.str( A124BarAgrReo, 1, 0) + A122BarAgrPar ;
         if ( ! (GXutil.strcmp("", A13792BarAgrNhdr)==0) )
         {
            AV13Option = A13792BarAgrNhdr ;
            AV12InsertIndex = 1 ;
            while ( ( AV12InsertIndex <= AV14Options.size() ) && ( GXutil.strcmp((String)AV14Options.elementAt(-1+AV12InsertIndex), AV13Option) < 0 ) )
            {
               AV12InsertIndex = (int)(AV12InsertIndex+1) ;
            }
            if ( ( AV12InsertIndex <= AV14Options.size() ) && ( GXutil.strcmp((String)AV14Options.elementAt(-1+AV12InsertIndex), AV13Option) == 0 ) )
            {
               AV18count = GXutil.lval( (String)AV17OptionIndexes.elementAt(-1+AV12InsertIndex)) ;
               AV18count = (long)(AV18count+1) ;
               AV17OptionIndexes.removeItem(AV12InsertIndex);
               AV17OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV18count), "Z,ZZZ,ZZZ,ZZ9")), AV12InsertIndex);
            }
            else
            {
               AV14Options.add(AV13Option, AV12InsertIndex);
               AV17OptionIndexes.add("1", AV12InsertIndex);
            }
         }
         if ( AV14Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = cambiodecolorhojaruta_4getfilterdata.this.AV27OptionsJson;
      this.aP4[0] = cambiodecolorhojaruta_4getfilterdata.this.AV28OptionsDescJson;
      this.aP5[0] = cambiodecolorhojaruta_4getfilterdata.this.AV29OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV27OptionsJson = "" ;
      AV28OptionsDescJson = "" ;
      AV29OptionIndexesJson = "" ;
      AV14Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV16OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV17OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV19Session = httpContext.getWebSession();
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV10TFBarAgrNhdr = "" ;
      AV11TFBarAgrNhdr_Sel = "" ;
      AV30emprcod = "" ;
      AV33barcodpar = "" ;
      AV35clinom = "" ;
      AV36barser = "" ;
      AV37barcolnom = "" ;
      AV40barnomcli = "" ;
      AV42BarAgrEst = "" ;
      A13792BarAgrNhdr = "" ;
      AV47Formulaciontinte_cambiodecolorhojaruta_4ds_1_tfbaragrnhdr = "" ;
      AV48Formulaciontinte_cambiodecolorhojaruta_4ds_2_tfbaragrnhdr_sel = "" ;
      scmdbuf = "" ;
      lV47Formulaciontinte_cambiodecolorhojaruta_4ds_1_tfbaragrnhdr = "" ;
      A122BarAgrPar = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      P0A5M2_A130BarCodPar = new String[] {""} ;
      P0A5M2_A132BarCodReo = new byte[1] ;
      P0A5M2_A129BarCod = new int[1] ;
      P0A5M2_A396EmprCod = new String[] {""} ;
      P0A5M2_A122BarAgrPar = new String[] {""} ;
      P0A5M2_A124BarAgrReo = new byte[1] ;
      P0A5M2_A119BarAgrCod = new int[1] ;
      AV13Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.cambiodecolorhojaruta_4getfilterdata__default(),
         new Object[] {
             new Object[] {
            P0A5M2_A130BarCodPar, P0A5M2_A132BarCodReo, P0A5M2_A129BarCod, P0A5M2_A396EmprCod, P0A5M2_A122BarAgrPar, P0A5M2_A124BarAgrReo, P0A5M2_A119BarAgrCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV32barcodreo ;
   private byte AV39bartipcol ;
   private byte A124BarAgrReo ;
   private byte A132BarCodReo ;
   private short Gx_err ;
   private int AV45GXV1 ;
   private int AV31barcod ;
   private int AV34clicod ;
   private int AV38barcolnum ;
   private int AV41barnumcli ;
   private int A119BarAgrCod ;
   private int A129BarCod ;
   private int AV12InsertIndex ;
   private long AV18count ;
   private String AV10TFBarAgrNhdr ;
   private String AV11TFBarAgrNhdr_Sel ;
   private String AV30emprcod ;
   private String AV33barcodpar ;
   private String AV35clinom ;
   private String AV36barser ;
   private String AV37barcolnom ;
   private String AV40barnomcli ;
   private String AV42BarAgrEst ;
   private String A13792BarAgrNhdr ;
   private String AV47Formulaciontinte_cambiodecolorhojaruta_4ds_1_tfbaragrnhdr ;
   private String AV48Formulaciontinte_cambiodecolorhojaruta_4ds_2_tfbaragrnhdr_sel ;
   private String scmdbuf ;
   private String lV47Formulaciontinte_cambiodecolorhojaruta_4ds_1_tfbaragrnhdr ;
   private String A122BarAgrPar ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private boolean returnInSub ;
   private String AV27OptionsJson ;
   private String AV28OptionsDescJson ;
   private String AV29OptionIndexesJson ;
   private String AV24DDOName ;
   private String AV25SearchTxt ;
   private String AV26SearchTxtTo ;
   private String AV13Option ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A5M2_A130BarCodPar ;
   private byte[] P0A5M2_A132BarCodReo ;
   private int[] P0A5M2_A129BarCod ;
   private String[] P0A5M2_A396EmprCod ;
   private String[] P0A5M2_A122BarAgrPar ;
   private byte[] P0A5M2_A124BarAgrReo ;
   private int[] P0A5M2_A119BarAgrCod ;
   private GXSimpleCollection<String> AV14Options ;
   private GXSimpleCollection<String> AV16OptionsDesc ;
   private GXSimpleCollection<String> AV17OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV21GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV22GridStateFilterValue ;
}

final  class cambiodecolorhojaruta_4getfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0A5M2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV48Formulaciontinte_cambiodecolorhojaruta_4ds_2_tfbaragrnhdr_sel ,
                                          String AV47Formulaciontinte_cambiodecolorhojaruta_4ds_1_tfbaragrnhdr ,
                                          int A119BarAgrCod ,
                                          byte A124BarAgrReo ,
                                          String A122BarAgrPar ,
                                          String AV30emprcod ,
                                          int AV31barcod ,
                                          byte AV32barcodreo ,
                                          String AV33barcodpar ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[6];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, BarAgrPar, BarAgrReo, BarAgrCod FROM TXPBARAGR" ;
      addWhere(sWhereString, "(EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?)");
      if ( (GXutil.strcmp("", AV48Formulaciontinte_cambiodecolorhojaruta_4ds_2_tfbaragrnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV47Formulaciontinte_cambiodecolorhojaruta_4ds_1_tfbaragrnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(TO_CHAR(BarAgrCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(BarAgrReo,'90'), 2) || BarAgrPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV48Formulaciontinte_cambiodecolorhojaruta_4ds_2_tfbaragrnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(TO_CHAR(BarAgrCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(BarAgrReo,'90'), 2) || BarAgrPar = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
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
                  return conditional_P0A5M2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).byteValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).byteValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , (String)dynConstraints[12] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A5M2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
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
                  stmt.setInt(sIdx, ((Number) parms[7]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[8]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 11);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 11);
               }
               return;
      }
   }

}

