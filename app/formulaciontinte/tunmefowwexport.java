package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tunmefowwexport extends GXProcedure
{
   public tunmefowwexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tunmefowwexport.class ), "" );
   }

   public tunmefowwexport( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      tunmefowwexport.this.aP1 = new String[] {""};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 )
   {
      tunmefowwexport.this.aP0 = aP0;
      tunmefowwexport.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_SdtWWPContext1[0] = AV9WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext1) ;
      AV9WWPContext = GXv_SdtWWPContext1[0] ;
      /* Execute user subroutine: 'OPENDOCUMENT' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV13CellRow = 1 ;
      AV14FirstColumn = 1 ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S191 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITEFILTERS' */
      S131 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITECOLUMNTITLES' */
      S141 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITEDATA' */
      S151 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'CLOSEDOCUMENT' */
      S181 ();
      if ( returnInSub )
      {
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'OPENDOCUMENT' Routine */
      returnInSub = false ;
      AV15Random = (int)(GXutil.random( )*10000) ;
      AV11Filename = "./PrivateTempStorage/" + "TUNMEFOWWExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
      AV10ExcelDocument.Open(AV11Filename);
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV10ExcelDocument.Clear();
   }

   public void S131( )
   {
      /* 'WRITEFILTERS' Routine */
      returnInSub = false ;
      if ( ! ( (0==AV33TFForPrdUMe) && (0==AV34TFForPrdUMe_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tunmefowwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV33TFForPrdUMe );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tunmefowwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV34TFForPrdUMe_To );
      }
      if ( ! ( (GXutil.strcmp("", AV36TFForPrdDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Unidad", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tunmefowwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV36TFForPrdDsc_Sel, GXv_char5) ;
         tunmefowwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV35TFForPrdDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Unidad", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tunmefowwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV35TFForPrdDsc, GXv_char5) ;
            tunmefowwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setText( httpContext.getMessage( "Codigo", "") );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( httpContext.getMessage( "Unidad", "") );
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV44Formulaciontinte_tunmefowwds_1_tfforprdume = AV33TFForPrdUMe ;
      AV45Formulaciontinte_tunmefowwds_2_tfforprdume_to = AV34TFForPrdUMe_To ;
      AV46Formulaciontinte_tunmefowwds_3_tfforprddsc = AV35TFForPrdDsc ;
      AV47Formulaciontinte_tunmefowwds_4_tfforprddsc_sel = AV36TFForPrdDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(AV44Formulaciontinte_tunmefowwds_1_tfforprdume) ,
                                           Byte.valueOf(AV45Formulaciontinte_tunmefowwds_2_tfforprdume_to) ,
                                           AV47Formulaciontinte_tunmefowwds_4_tfforprddsc_sel ,
                                           AV46Formulaciontinte_tunmefowwds_3_tfforprddsc ,
                                           Byte.valueOf(A490ForPrdUMe) ,
                                           A488ForPrdDsc ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV46Formulaciontinte_tunmefowwds_3_tfforprddsc = GXutil.padr( GXutil.rtrim( AV46Formulaciontinte_tunmefowwds_3_tfforprddsc), 5, "%") ;
      /* Using cursor P08HA2 */
      pr_default.execute(0, new Object[] {Byte.valueOf(AV44Formulaciontinte_tunmefowwds_1_tfforprdume), Byte.valueOf(AV45Formulaciontinte_tunmefowwds_2_tfforprdume_to), lV46Formulaciontinte_tunmefowwds_3_tfforprddsc, AV47Formulaciontinte_tunmefowwds_4_tfforprddsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A488ForPrdDsc = P08HA2_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P08HA2_n488ForPrdDsc[0] ;
         A490ForPrdUMe = P08HA2_A490ForPrdUMe[0] ;
         A396EmprCod = P08HA2_A396EmprCod[0] ;
         AV13CellRow = (int)(AV13CellRow+1) ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S162 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setNumber( A490ForPrdUMe );
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A488ForPrdDsc, GXv_char5) ;
         tunmefowwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S172 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S181( )
   {
      /* 'CLOSEDOCUMENT' Routine */
      returnInSub = false ;
      AV10ExcelDocument.Save();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV10ExcelDocument.Close();
   }

   public void S121( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV10ExcelDocument.getErrCode() != 0 )
      {
         AV11Filename = "" ;
         AV12ErrorMessage = AV10ExcelDocument.getErrDescription() ;
         AV10ExcelDocument.Close();
         returnInSub = true;
         if (true) return;
      }
   }

   public void S191( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV18Session.getValue("FormulacionTinte.TUNMEFOWWGridState"), "") == 0 )
      {
         AV20GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.TUNMEFOWWGridState"), null, null);
      }
      else
      {
         AV20GridState.fromxml(AV18Session.getValue("FormulacionTinte.TUNMEFOWWGridState"), null, null);
      }
      AV16OrderedBy = AV20GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV20GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV48GXV1 = 1 ;
      while ( AV48GXV1 <= AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV21GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV48GXV1));
         if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDUME") == 0 )
         {
            AV33TFForPrdUMe = (byte)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV34TFForPrdUMe_To = (byte)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDDSC") == 0 )
         {
            AV35TFForPrdDsc = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDDSC_SEL") == 0 )
         {
            AV36TFForPrdDsc_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV48GXV1 = (int)(AV48GXV1+1) ;
      }
   }

   public void S162( )
   {
      /* 'BEFOREWRITELINE' Routine */
      returnInSub = false ;
   }

   public void S172( )
   {
      /* 'AFTERWRITELINE' Routine */
      returnInSub = false ;
   }

   protected void cleanup( )
   {
      this.aP0[0] = tunmefowwexport.this.AV11Filename;
      this.aP1[0] = tunmefowwexport.this.AV12ErrorMessage;
      CloseOpenCursors();
      AV10ExcelDocument.cleanup();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV11Filename = "" ;
      AV12ErrorMessage = "" ;
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV10ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      AV36TFForPrdDsc_Sel = "" ;
      AV35TFForPrdDsc = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      A488ForPrdDsc = "" ;
      AV46Formulaciontinte_tunmefowwds_3_tfforprddsc = "" ;
      AV47Formulaciontinte_tunmefowwds_4_tfforprddsc_sel = "" ;
      scmdbuf = "" ;
      lV46Formulaciontinte_tunmefowwds_3_tfforprddsc = "" ;
      P08HA2_A488ForPrdDsc = new String[] {""} ;
      P08HA2_n488ForPrdDsc = new boolean[] {false} ;
      P08HA2_A490ForPrdUMe = new byte[1] ;
      P08HA2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV18Session = httpContext.getWebSession();
      AV20GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV21GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.tunmefowwexport__default(),
         new Object[] {
             new Object[] {
            P08HA2_A488ForPrdDsc, P08HA2_n488ForPrdDsc, P08HA2_A490ForPrdUMe, P08HA2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV33TFForPrdUMe ;
   private byte AV34TFForPrdUMe_To ;
   private byte A490ForPrdUMe ;
   private byte AV44Formulaciontinte_tunmefowwds_1_tfforprdume ;
   private byte AV45Formulaciontinte_tunmefowwds_2_tfforprdume_to ;
   private short GXv_int3[] ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV48GXV1 ;
   private String AV36TFForPrdDsc_Sel ;
   private String AV35TFForPrdDsc ;
   private String A488ForPrdDsc ;
   private String AV46Formulaciontinte_tunmefowwds_3_tfforprddsc ;
   private String AV47Formulaciontinte_tunmefowwds_4_tfforprddsc_sel ;
   private String scmdbuf ;
   private String lV46Formulaciontinte_tunmefowwds_3_tfforprddsc ;
   private String A396EmprCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n488ForPrdDsc ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV18Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P08HA2_A488ForPrdDsc ;
   private boolean[] P08HA2_n488ForPrdDsc ;
   private byte[] P08HA2_A490ForPrdUMe ;
   private String[] P08HA2_A396EmprCod ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV20GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV21GridStateFilterValue ;
}

final  class tunmefowwexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08HA2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte AV44Formulaciontinte_tunmefowwds_1_tfforprdume ,
                                          byte AV45Formulaciontinte_tunmefowwds_2_tfforprdume_to ,
                                          String AV47Formulaciontinte_tunmefowwds_4_tfforprddsc_sel ,
                                          String AV46Formulaciontinte_tunmefowwds_3_tfforprddsc ,
                                          byte A490ForPrdUMe ,
                                          String A488ForPrdDsc ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[4];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT ForPrdDsc, ForPrdUMe, EmprCod FROM TXPUNMEPR" ;
      if ( ! (0==AV44Formulaciontinte_tunmefowwds_1_tfforprdume) )
      {
         addWhere(sWhereString, "(ForPrdUMe >= ?)");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
      }
      if ( ! (0==AV45Formulaciontinte_tunmefowwds_2_tfforprdume_to) )
      {
         addWhere(sWhereString, "(ForPrdUMe <= ?)");
      }
      else
      {
         GXv_int6[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV47Formulaciontinte_tunmefowwds_4_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV46Formulaciontinte_tunmefowwds_3_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV47Formulaciontinte_tunmefowwds_4_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(ForPrdDsc = ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY ForPrdUMe" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY ForPrdUMe DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY ForPrdDsc" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY ForPrdDsc DESC" ;
      }
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
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
                  return conditional_P08HA2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , ((Number) dynConstraints[1]).byteValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).byteValue() , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , ((Boolean) dynConstraints[7]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08HA2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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

