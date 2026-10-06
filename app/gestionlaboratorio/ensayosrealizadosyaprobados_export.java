package app.gestionlaboratorio ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ensayosrealizadosyaprobados_export extends GXProcedure
{
   public ensayosrealizadosyaprobados_export( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ensayosrealizadosyaprobados_export.class ), "" );
   }

   public ensayosrealizadosyaprobados_export( int remoteHandle ,
                                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             java.util.Date[] aP3 ,
                             java.util.Date[] aP4 ,
                             short[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 )
   {
      ensayosrealizadosyaprobados_export.this.aP9 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 ,
                        java.util.Date[] aP3 ,
                        java.util.Date[] aP4 ,
                        short[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 ,
                        String[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             java.util.Date[] aP3 ,
                             java.util.Date[] aP4 ,
                             short[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 )
   {
      ensayosrealizadosyaprobados_export.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ensayosrealizadosyaprobados_export.this.AV51PCliCod = aP1[0];
      this.aP1 = aP1;
      ensayosrealizadosyaprobados_export.this.AV53UCliCod = aP2[0];
      this.aP2 = aP2;
      ensayosrealizadosyaprobados_export.this.AV26Fechaei = aP3[0];
      this.aP3 = aP3;
      ensayosrealizadosyaprobados_export.this.AV25Fechaef = aP4[0];
      this.aP4 = aP4;
      ensayosrealizadosyaprobados_export.this.AV70TipLis = aP5[0];
      this.aP5 = aP5;
      ensayosrealizadosyaprobados_export.this.AV63PTipo = aP6[0];
      this.aP6 = aP6;
      ensayosrealizadosyaprobados_export.this.AV64UTipo = aP7[0];
      this.aP7 = aP7;
      ensayosrealizadosyaprobados_export.this.aP8 = aP8;
      ensayosrealizadosyaprobados_export.this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Execute user subroutine: 'OPENDOCUMENT' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV9CellRow = 1 ;
      AV8CellCol = 1 ;
      /* Execute user subroutine: 'WRITECOLUMNTITLES' */
      S131 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITEDATA' */
      S141 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'CLOSEDOCUMENT' */
      S151 ();
      if ( returnInSub )
      {
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'OPENDOCUMENT' Routine */
      returnInSub = false ;
      AV13Random = (int)(GXutil.random( )*10000) ;
      AV12Filename = "EnsayosRealizadosyAprobados_Export-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".xlsx" ;
      AV11ExcelDocument.Open(AV12Filename);
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV11ExcelDocument.Clear();
   }

   public void S131( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV9CellRow = 2 ;
      while ( AV8CellCol <= 100 )
      {
         AV11ExcelDocument.Cells(AV9CellRow, AV8CellCol, 1, 1).setBold( (short)(1) );
         AV11ExcelDocument.Cells(AV9CellRow, AV8CellCol, 1, 1).setColor( 11 );
         AV8CellCol = (int)(AV8CellCol+1) ;
      }
      AV11ExcelDocument.Cells(1, 1, 1, 1).setBold( (short)(1) );
      AV11ExcelDocument.Cells(1, 1, 1, 1).setColor( 11 );
      AV11ExcelDocument.Cells(1, 1, 1, 1).setText( httpContext.getMessage( "Periodo", "") );
      GXt_dtime1 = GXutil.resetTime( AV26Fechaei );
      AV11ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
      AV11ExcelDocument.Cells(1, 2, 1, 1).setDate( GXt_dtime1 );
      GXt_dtime1 = GXutil.resetTime( AV25Fechaef );
      AV11ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
      AV11ExcelDocument.Cells(1, 3, 1, 1).setDate( GXt_dtime1 );
      AV11ExcelDocument.Cells(2, 1, 1, 1).setText( httpContext.getMessage( "Cliente", "") );
      AV11ExcelDocument.Cells(2, 2, 1, 1).setText( httpContext.getMessage( "Nombre", "") );
      AV11ExcelDocument.Cells(2, 3, 1, 1).setText( httpContext.getMessage( "Total de Ensayos enviados", "") );
      AV11ExcelDocument.Cells(2, 4, 1, 1).setText( httpContext.getMessage( "Total Colores Enviados", "") );
      AV11ExcelDocument.Cells(2, 5, 1, 1).setText( httpContext.getMessage( "Nº de Rechazos", "") );
      AV11ExcelDocument.Cells(2, 6, 1, 1).setText( httpContext.getMessage( "Indice de rechazo (%)", "") );
      AV11ExcelDocument.Cells(2, 7, 1, 1).setText( httpContext.getMessage( "Media Ensayos p/color", "") );
   }

   public void S141( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV9CellRow = 3 ;
      AV71Num_ev = (short)(0) ;
      AV72Num_ce = (short)(0) ;
      AV73Num_rp = (short)(0) ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV51PCliCod) ,
                                           Integer.valueOf(AV53UCliCod) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING
                                           }
      });
      /* Using cursor P09PQ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV51PCliCod), Integer.valueOf(AV53UCliCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = P09PQ2_A252CliCod[0] ;
         A279CliNom = P09PQ2_A279CliNom[0] ;
         AV71Num_ev = (short)(0) ;
         AV72Num_ce = (short)(0) ;
         AV73Num_rp = (short)(0) ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              AV26Fechaei ,
                                              AV25Fechaef ,
                                              A5541Lb_FechaE ,
                                              A5570Lb_Tipo ,
                                              AV63PTipo ,
                                              AV64UTipo ,
                                              A396EmprCod ,
                                              Integer.valueOf(A252CliCod) } ,
                                              new int[]{
                                              TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT
                                              }
         });
         /* Using cursor P09PQ3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), AV63PTipo, AV64UTipo, AV26Fechaei, AV25Fechaef});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A5532Lb_numero = P09PQ3_A5532Lb_numero[0] ;
            A5570Lb_Tipo = P09PQ3_A5570Lb_Tipo[0] ;
            A5541Lb_FechaE = P09PQ3_A5541Lb_FechaE[0] ;
            AV72Num_ce = (short)(AV72Num_ce+1) ;
            /* Using cursor P09PQ4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A6461Lb_FecNoa1 = P09PQ4_A6461Lb_FecNoa1[0] ;
               A5555Lb_opcion = P09PQ4_A5555Lb_opcion[0] ;
               AV71Num_ev = (short)(AV71Num_ev+1) ;
               if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A6461Lb_FecNoa1)) )
               {
                  AV73Num_rp = (short)(AV73Num_rp+1) ;
               }
               pr_default.readNext(2);
            }
            pr_default.close(2);
            pr_default.readNext(1);
         }
         pr_default.close(1);
         if ( AV71Num_ev > 0 )
         {
            AV11ExcelDocument.Cells(AV9CellRow, 1, 1, 1).setNumber( A252CliCod );
            AV11ExcelDocument.Cells(AV9CellRow, 2, 1, 1).setText( A279CliNom );
            AV11ExcelDocument.Cells(AV9CellRow, 3, 1, 1).setNumber( AV71Num_ev );
            AV11ExcelDocument.Cells(AV9CellRow, 4, 1, 1).setNumber( AV72Num_ce );
            AV11ExcelDocument.Cells(AV9CellRow, 5, 1, 1).setNumber( AV73Num_rp );
            AV74Por = DecimalUtil.doubleToDec(0) ;
            AV74Por = GXutil.roundDecimal( DecimalUtil.doubleToDec(AV73Num_rp/ (double) (AV72Num_ce)*100), 2) ;
            AV11ExcelDocument.Cells(AV9CellRow, 6, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV74Por)) );
            AV75Med_epc = DecimalUtil.doubleToDec(0) ;
            AV75Med_epc = GXutil.roundDecimal( DecimalUtil.doubleToDec(AV71Num_ev/ (double) (AV72Num_ce)), 2) ;
            AV11ExcelDocument.Cells(AV9CellRow, 7, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV75Med_epc)) );
            AV9CellRow = (int)(AV9CellRow+1) ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S121( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV11ExcelDocument.getErrCode() != 0 )
      {
         AV12Filename = "" ;
         AV10ErrorMessage = AV11ExcelDocument.getErrDescription() ;
         AV11ExcelDocument.Close();
         returnInSub = true;
         if (true) return;
      }
   }

   public void S151( )
   {
      /* 'CLOSEDOCUMENT' Routine */
      returnInSub = false ;
      AV11ExcelDocument.Save();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV11ExcelDocument.Close();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ensayosrealizadosyaprobados_export.this.A396EmprCod;
      this.aP1[0] = ensayosrealizadosyaprobados_export.this.AV51PCliCod;
      this.aP2[0] = ensayosrealizadosyaprobados_export.this.AV53UCliCod;
      this.aP3[0] = ensayosrealizadosyaprobados_export.this.AV26Fechaei;
      this.aP4[0] = ensayosrealizadosyaprobados_export.this.AV25Fechaef;
      this.aP5[0] = ensayosrealizadosyaprobados_export.this.AV70TipLis;
      this.aP6[0] = ensayosrealizadosyaprobados_export.this.AV63PTipo;
      this.aP7[0] = ensayosrealizadosyaprobados_export.this.AV64UTipo;
      this.aP8[0] = ensayosrealizadosyaprobados_export.this.AV12Filename;
      this.aP9[0] = ensayosrealizadosyaprobados_export.this.AV10ErrorMessage;
      CloseOpenCursors();
      AV11ExcelDocument.cleanup();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV12Filename = "" ;
      AV10ErrorMessage = "" ;
      AV11ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      GXt_dtime1 = GXutil.resetTime( GXutil.nullDate() );
      scmdbuf = "" ;
      P09PQ2_A396EmprCod = new String[] {""} ;
      P09PQ2_A252CliCod = new int[1] ;
      P09PQ2_A279CliNom = new String[] {""} ;
      A279CliNom = "" ;
      A5541Lb_FechaE = GXutil.nullDate() ;
      A5570Lb_Tipo = "" ;
      P09PQ3_A396EmprCod = new String[] {""} ;
      P09PQ3_A252CliCod = new int[1] ;
      P09PQ3_A5532Lb_numero = new int[1] ;
      P09PQ3_A5570Lb_Tipo = new String[] {""} ;
      P09PQ3_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      P09PQ4_A396EmprCod = new String[] {""} ;
      P09PQ4_A5532Lb_numero = new int[1] ;
      P09PQ4_A6461Lb_FecNoa1 = new java.util.Date[] {GXutil.nullDate()} ;
      P09PQ4_A5555Lb_opcion = new String[] {""} ;
      A6461Lb_FecNoa1 = GXutil.nullDate() ;
      A5555Lb_opcion = "" ;
      AV74Por = DecimalUtil.ZERO ;
      AV75Med_epc = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.ensayosrealizadosyaprobados_export__default(),
         new Object[] {
             new Object[] {
            P09PQ2_A396EmprCod, P09PQ2_A252CliCod, P09PQ2_A279CliNom
            }
            , new Object[] {
            P09PQ3_A396EmprCod, P09PQ3_A252CliCod, P09PQ3_A5532Lb_numero, P09PQ3_A5570Lb_Tipo, P09PQ3_A5541Lb_FechaE
            }
            , new Object[] {
            P09PQ4_A396EmprCod, P09PQ4_A5532Lb_numero, P09PQ4_A6461Lb_FecNoa1, P09PQ4_A5555Lb_opcion
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV70TipLis ;
   private short AV71Num_ev ;
   private short AV72Num_ce ;
   private short AV73Num_rp ;
   private short Gx_err ;
   private int AV51PCliCod ;
   private int AV53UCliCod ;
   private int AV9CellRow ;
   private int AV8CellCol ;
   private int AV13Random ;
   private int A252CliCod ;
   private int A5532Lb_numero ;
   private java.math.BigDecimal AV74Por ;
   private java.math.BigDecimal AV75Med_epc ;
   private String A396EmprCod ;
   private String AV63PTipo ;
   private String AV64UTipo ;
   private String scmdbuf ;
   private String A279CliNom ;
   private String A5570Lb_Tipo ;
   private String A5555Lb_opcion ;
   private java.util.Date GXt_dtime1 ;
   private java.util.Date AV26Fechaei ;
   private java.util.Date AV25Fechaef ;
   private java.util.Date A5541Lb_FechaE ;
   private java.util.Date A6461Lb_FecNoa1 ;
   private boolean returnInSub ;
   private String AV12Filename ;
   private String AV10ErrorMessage ;
   private String[] aP9 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private int[] aP2 ;
   private java.util.Date[] aP3 ;
   private java.util.Date[] aP4 ;
   private short[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private String[] aP8 ;
   private IDataStoreProvider pr_default ;
   private String[] P09PQ2_A396EmprCod ;
   private int[] P09PQ2_A252CliCod ;
   private String[] P09PQ2_A279CliNom ;
   private String[] P09PQ3_A396EmprCod ;
   private int[] P09PQ3_A252CliCod ;
   private int[] P09PQ3_A5532Lb_numero ;
   private String[] P09PQ3_A5570Lb_Tipo ;
   private java.util.Date[] P09PQ3_A5541Lb_FechaE ;
   private String[] P09PQ4_A396EmprCod ;
   private int[] P09PQ4_A5532Lb_numero ;
   private java.util.Date[] P09PQ4_A6461Lb_FecNoa1 ;
   private String[] P09PQ4_A5555Lb_opcion ;
   private com.genexus.gxoffice.ExcelDoc AV11ExcelDocument ;
}

final  class ensayosrealizadosyaprobados_export__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09PQ2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV51PCliCod ,
                                          int AV53UCliCod ,
                                          int A252CliCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[3];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT EmprCod, CliCod, CliNom FROM TXPCLIENT" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      if ( ! (0==AV51PCliCod) )
      {
         addWhere(sWhereString, "(CliCod >= ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( ! (0==AV53UCliCod) )
      {
         addWhere(sWhereString, "(CliCod <= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, CliCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09PQ3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV26Fechaei ,
                                          java.util.Date AV25Fechaef ,
                                          java.util.Date A5541Lb_FechaE ,
                                          String A5570Lb_Tipo ,
                                          String AV63PTipo ,
                                          String AV64UTipo ,
                                          String A396EmprCod ,
                                          int A252CliCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[6];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT EmprCod, CliCod, Lb_numero, Lb_Tipo, Lb_FechaE FROM TXPENS001" ;
      addWhere(sWhereString, "(EmprCod = ? and CliCod = ?)");
      addWhere(sWhereString, "(Lb_Tipo >= ? and Lb_Tipo <= ?)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV26Fechaei)) )
      {
         addWhere(sWhereString, "(Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV25Fechaef)) )
      {
         addWhere(sWhereString, "(Lb_FechaE <= ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, CliCod" ;
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
                  return conditional_P09PQ2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] );
            case 1 :
                  return conditional_P09PQ3(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09PQ2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09PQ3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09PQ4", "SELECT EmprCod, Lb_numero, Lb_FecNoa1, Lb_opcion FROM TXPENS002 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero, Lb_opcion ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
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
                  stmt.setString(sIdx, (String)parms[3], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[4]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[5]).intValue());
               }
               return;
            case 1 :
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
                  stmt.setString(sIdx, (String)parms[8], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[10]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[11]);
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

