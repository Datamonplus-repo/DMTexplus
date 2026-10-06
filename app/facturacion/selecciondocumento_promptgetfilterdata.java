package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class selecciondocumento_promptgetfilterdata extends GXProcedure
{
   public selecciondocumento_promptgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( selecciondocumento_promptgetfilterdata.class ), "" );
   }

   public selecciondocumento_promptgetfilterdata( int remoteHandle ,
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
      selecciondocumento_promptgetfilterdata.this.aP5 = new String[] {""};
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
      selecciondocumento_promptgetfilterdata.this.AV34DDOName = aP0;
      selecciondocumento_promptgetfilterdata.this.AV35SearchTxt = aP1;
      selecciondocumento_promptgetfilterdata.this.AV36SearchTxtTo = aP2;
      selecciondocumento_promptgetfilterdata.this.aP3 = aP3;
      selecciondocumento_promptgetfilterdata.this.aP4 = aP4;
      selecciondocumento_promptgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV24Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV26OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV27OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV34DDOName), "DDO_GUIREMCLN") == 0 )
      {
         /* Execute user subroutine: 'LOADGUIREMCLNOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV37OptionsJson = AV24Options.toJSonString(false) ;
      AV38OptionsDescJson = AV26OptionsDesc.toJSonString(false) ;
      AV39OptionIndexesJson = AV27OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV29Session.getValue("Facturacion.SeleccionDocumento_promptGridState"), "") == 0 )
      {
         AV31GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Facturacion.SeleccionDocumento_promptGridState"), null, null);
      }
      else
      {
         AV31GridState.fromxml(AV29Session.getValue("Facturacion.SeleccionDocumento_promptGridState"), null, null);
      }
      AV47GXV1 = 1 ;
      while ( AV47GXV1 <= AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV32GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV47GXV1));
         if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROCOD") == 0 )
         {
            AV10TFAlbProCod = GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            AV11TFAlbProCod_To = GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROEST") == 0 )
         {
            AV16TFAlbProEst = (byte)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV17TFAlbProEst_To = (byte)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGUIREMCLI") == 0 )
         {
            AV18TFGuiRemCli = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV19TFGuiRemCli_To = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGUIREMCLN") == 0 )
         {
            AV20TFGuiRemCln = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGUIREMCLN_SEL") == 0 )
         {
            AV21TFGuiRemCln_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV47GXV1 = (int)(AV47GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADGUIREMCLNOPTIONS' Routine */
      returnInSub = false ;
      AV20TFGuiRemCln = AV35SearchTxt ;
      AV21TFGuiRemCln_Sel = "" ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Long.valueOf(AV10TFAlbProCod) ,
                                           Long.valueOf(AV11TFAlbProCod_To) ,
                                           Byte.valueOf(AV16TFAlbProEst) ,
                                           Byte.valueOf(AV17TFAlbProEst_To) ,
                                           Integer.valueOf(AV18TFGuiRemCli) ,
                                           Integer.valueOf(AV19TFGuiRemCli_To) ,
                                           AV21TFGuiRemCln_Sel ,
                                           AV20TFGuiRemCln ,
                                           AV43AlbProfch ,
                                           AV44AlbProfch_To ,
                                           Long.valueOf(A30AlbProCod) ,
                                           Byte.valueOf(A33AlbProEst) ,
                                           Integer.valueOf(A1243GuiRemCli) ,
                                           A1244GuiRemCln ,
                                           A34AlbProfch ,
                                           A39AlbProPri ,
                                           AV42AlbProPri } ,
                                           new int[]{
                                           TypeConstants.LONG, TypeConstants.LONG, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.LONG, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV20TFGuiRemCln = GXutil.padr( GXutil.rtrim( AV20TFGuiRemCln), 30, "%") ;
      /* Using cursor P09ZS2 */
      pr_default.execute(0, new Object[] {AV42AlbProPri, Long.valueOf(AV10TFAlbProCod), Long.valueOf(AV11TFAlbProCod_To), Byte.valueOf(AV16TFAlbProEst), Byte.valueOf(AV17TFAlbProEst_To), Integer.valueOf(AV18TFGuiRemCli), Integer.valueOf(AV19TFGuiRemCli_To), lV20TFGuiRemCln, AV21TFGuiRemCln_Sel, AV43AlbProfch, AV44AlbProfch_To});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9ZS2 = false ;
         A1253EmprGuiRem = P09ZS2_A1253EmprGuiRem[0] ;
         A39AlbProPri = P09ZS2_A39AlbProPri[0] ;
         A1244GuiRemCln = P09ZS2_A1244GuiRemCln[0] ;
         A34AlbProfch = P09ZS2_A34AlbProfch[0] ;
         A1243GuiRemCli = P09ZS2_A1243GuiRemCli[0] ;
         A33AlbProEst = P09ZS2_A33AlbProEst[0] ;
         A30AlbProCod = P09ZS2_A30AlbProCod[0] ;
         A396EmprCod = P09ZS2_A396EmprCod[0] ;
         A1244GuiRemCln = P09ZS2_A1244GuiRemCln[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09ZS2_A1244GuiRemCln[0], A1244GuiRemCln) == 0 ) )
         {
            brk9ZS2 = false ;
            A1253EmprGuiRem = P09ZS2_A1253EmprGuiRem[0] ;
            A1243GuiRemCli = P09ZS2_A1243GuiRemCli[0] ;
            A30AlbProCod = P09ZS2_A30AlbProCod[0] ;
            A396EmprCod = P09ZS2_A396EmprCod[0] ;
            AV28count = (long)(AV28count+1) ;
            brk9ZS2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A1244GuiRemCln)==0) )
         {
            AV23Option = A1244GuiRemCln ;
            AV24Options.add(AV23Option, 0);
            AV27OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV24Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9ZS2 )
         {
            brk9ZS2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = selecciondocumento_promptgetfilterdata.this.AV37OptionsJson;
      this.aP4[0] = selecciondocumento_promptgetfilterdata.this.AV38OptionsDescJson;
      this.aP5[0] = selecciondocumento_promptgetfilterdata.this.AV39OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV37OptionsJson = "" ;
      AV38OptionsDescJson = "" ;
      AV39OptionIndexesJson = "" ;
      AV24Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV26OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV27OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV29Session = httpContext.getWebSession();
      AV31GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV32GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV20TFGuiRemCln = "" ;
      AV21TFGuiRemCln_Sel = "" ;
      scmdbuf = "" ;
      lV20TFGuiRemCln = "" ;
      AV43AlbProfch = GXutil.nullDate() ;
      AV44AlbProfch_To = GXutil.nullDate() ;
      A1244GuiRemCln = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      A39AlbProPri = "" ;
      AV42AlbProPri = "" ;
      P09ZS2_A1253EmprGuiRem = new String[] {""} ;
      P09ZS2_A39AlbProPri = new String[] {""} ;
      P09ZS2_A1244GuiRemCln = new String[] {""} ;
      P09ZS2_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P09ZS2_A1243GuiRemCli = new int[1] ;
      P09ZS2_A33AlbProEst = new byte[1] ;
      P09ZS2_A30AlbProCod = new long[1] ;
      P09ZS2_A396EmprCod = new String[] {""} ;
      A1253EmprGuiRem = "" ;
      A396EmprCod = "" ;
      AV23Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.selecciondocumento_promptgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09ZS2_A1253EmprGuiRem, P09ZS2_A39AlbProPri, P09ZS2_A1244GuiRemCln, P09ZS2_A34AlbProfch, P09ZS2_A1243GuiRemCli, P09ZS2_A33AlbProEst, P09ZS2_A30AlbProCod, P09ZS2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV16TFAlbProEst ;
   private byte AV17TFAlbProEst_To ;
   private byte A33AlbProEst ;
   private short Gx_err ;
   private int AV47GXV1 ;
   private int AV18TFGuiRemCli ;
   private int AV19TFGuiRemCli_To ;
   private int A1243GuiRemCli ;
   private long AV10TFAlbProCod ;
   private long AV11TFAlbProCod_To ;
   private long A30AlbProCod ;
   private long AV28count ;
   private String AV20TFGuiRemCln ;
   private String AV21TFGuiRemCln_Sel ;
   private String scmdbuf ;
   private String lV20TFGuiRemCln ;
   private String A1244GuiRemCln ;
   private String A39AlbProPri ;
   private String AV42AlbProPri ;
   private String A1253EmprGuiRem ;
   private String A396EmprCod ;
   private java.util.Date AV43AlbProfch ;
   private java.util.Date AV44AlbProfch_To ;
   private java.util.Date A34AlbProfch ;
   private boolean returnInSub ;
   private boolean brk9ZS2 ;
   private String AV37OptionsJson ;
   private String AV38OptionsDescJson ;
   private String AV39OptionIndexesJson ;
   private String AV34DDOName ;
   private String AV35SearchTxt ;
   private String AV36SearchTxtTo ;
   private String AV23Option ;
   private com.genexus.webpanels.WebSession AV29Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09ZS2_A1253EmprGuiRem ;
   private String[] P09ZS2_A39AlbProPri ;
   private String[] P09ZS2_A1244GuiRemCln ;
   private java.util.Date[] P09ZS2_A34AlbProfch ;
   private int[] P09ZS2_A1243GuiRemCli ;
   private byte[] P09ZS2_A33AlbProEst ;
   private long[] P09ZS2_A30AlbProCod ;
   private String[] P09ZS2_A396EmprCod ;
   private GXSimpleCollection<String> AV24Options ;
   private GXSimpleCollection<String> AV26OptionsDesc ;
   private GXSimpleCollection<String> AV27OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV31GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV32GridStateFilterValue ;
}

final  class selecciondocumento_promptgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09ZS2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          long AV10TFAlbProCod ,
                                          long AV11TFAlbProCod_To ,
                                          byte AV16TFAlbProEst ,
                                          byte AV17TFAlbProEst_To ,
                                          int AV18TFGuiRemCli ,
                                          int AV19TFGuiRemCli_To ,
                                          String AV21TFGuiRemCln_Sel ,
                                          String AV20TFGuiRemCln ,
                                          java.util.Date AV43AlbProfch ,
                                          java.util.Date AV44AlbProfch_To ,
                                          long A30AlbProCod ,
                                          byte A33AlbProEst ,
                                          int A1243GuiRemCli ,
                                          String A1244GuiRemCln ,
                                          java.util.Date A34AlbProfch ,
                                          String A39AlbProPri ,
                                          String AV42AlbProPri )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[11];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprGuiRem AS EmprGuiRem, T1.AlbProPri, T2.CliNom AS GuiRemCln, T1.AlbProfch, T1.GuiRemCli AS GuiRemCli, T1.AlbProEst, T1.AlbProCod, T1.EmprCod FROM (TXPCALPRD" ;
      scmdbuf += " T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprGuiRem AND T2.CliCod = T1.GuiRemCli)" ;
      addWhere(sWhereString, "(T1.AlbProPri = ?)");
      if ( ! (0==AV10TFAlbProCod) )
      {
         addWhere(sWhereString, "(T1.AlbProCod >= ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( ! (0==AV11TFAlbProCod_To) )
      {
         addWhere(sWhereString, "(T1.AlbProCod <= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV16TFAlbProEst) )
      {
         addWhere(sWhereString, "(T1.AlbProEst >= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (0==AV17TFAlbProEst_To) )
      {
         addWhere(sWhereString, "(T1.AlbProEst <= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (0==AV18TFGuiRemCli) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli >= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (0==AV19TFGuiRemCli_To) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli <= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV21TFGuiRemCln_Sel)==0) && ( ! (GXutil.strcmp("", AV20TFGuiRemCln)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV21TFGuiRemCln_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV43AlbProfch)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch >= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV44AlbProfch_To)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch <= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.CliNom" ;
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
                  return conditional_P09ZS2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).longValue() , ((Number) dynConstraints[1]).longValue() , ((Number) dynConstraints[2]).byteValue() , ((Number) dynConstraints[3]).byteValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (java.util.Date)dynConstraints[9] , ((Number) dynConstraints[10]).longValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09ZS2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((long[]) buf[6])[0] = rslt.getLong(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 3);
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
                  stmt.setString(sIdx, (String)parms[11], 1);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[12]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[13]).longValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[14]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[15]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[20]);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[21]);
               }
               return;
      }
   }

}

