package app.core ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class kardexrepuestoexport extends GXProcedure
{
   public kardexrepuestoexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( kardexrepuestoexport.class ), "" );
   }

   public kardexrepuestoexport( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 ,
                             java.util.Date aP2 ,
                             java.util.Date aP3 ,
                             String[] aP4 )
   {
      kardexrepuestoexport.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        java.util.Date aP2 ,
                        java.util.Date aP3 ,
                        String[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             java.util.Date aP2 ,
                             java.util.Date aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      kardexrepuestoexport.this.A396EmprCod = aP0;
      kardexrepuestoexport.this.AV17MRCod = aP1;
      kardexrepuestoexport.this.AV57Fec1 = aP2;
      kardexrepuestoexport.this.AV58Fec2 = aP3;
      kardexrepuestoexport.this.aP4 = aP4;
      kardexrepuestoexport.this.aP5 = aP5;
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
      /* Execute user subroutine: 'SALDOINICIAL' */
      S151 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITEDATA' */
      S161 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'CLOSEDOCUMENT' */
      S171 ();
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
      AV11Filename = "KardexRepuestoExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      AV13CellRow = (int)(AV13CellRow+1) ;
      AV14FirstColumn = 1 ;
      while ( AV14FirstColumn <= 15 )
      {
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn, 1, 1).setBold( (short)(1) );
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn, 1, 1).setColor( 11 );
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn, 1, 1).setSize( 16 );
         AV14FirstColumn = (int)(AV14FirstColumn+1) ;
      }
      AV64MRCNom = GXutil.trim( GXutil.str( AV17MRCod, 8, 0)) ;
      /* Using cursor P08X42 */
      pr_default.execute(0, new Object[] {AV16EmprCod, Integer.valueOf(AV17MRCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A9492MRCod = P08X42_A9492MRCod[0] ;
         A9493MRNom = P08X42_A9493MRNom[0] ;
         n9493MRNom = P08X42_n9493MRNom[0] ;
         AV64MRCNom = GXutil.trim( GXutil.str( A9492MRCod, 8, 0)) + " - " + GXutil.trim( A9493MRNom) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV14FirstColumn = 1 ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setText( httpContext.getMessage( "Repuesto ", "")+GXutil.trim( AV64MRCNom) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( httpContext.getMessage( "Periodo ", "")+GXutil.trim( localUtil.dtoc( AV57Fec1, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+httpContext.getMessage( " hasta ", "")+GXutil.trim( localUtil.dtoc( AV58Fec2, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) );
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV13CellRow = (int)(AV13CellRow+2) ;
      AV14FirstColumn = 1 ;
      while ( AV14FirstColumn <= 15 )
      {
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn, 1, 1).setBold( (short)(1) );
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn, 1, 1).setColor( 11 );
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn, 1, 1).setSize( 14 );
         AV14FirstColumn = (int)(AV14FirstColumn+1) ;
      }
      AV14FirstColumn = 1 ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setText( httpContext.getMessage( "Fecha", "") );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( httpContext.getMessage( "Descripcion", "") );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+2, 1, 1).setText( httpContext.getMessage( "Cantidad Ingreso", "") );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setText( httpContext.getMessage( "Precio Ingreso", "") );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+4, 1, 1).setText( httpContext.getMessage( "Cantidad Egreso", "") );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+5, 1, 1).setText( httpContext.getMessage( "Precio Egreso", "") );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+6, 1, 1).setText( httpContext.getMessage( "Saldo", "") );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+7, 1, 1).setText( httpContext.getMessage( "Nro Movimiento", "") );
   }

   public void S151( )
   {
      /* 'SALDOINICIAL' Routine */
      returnInSub = false ;
      AV63CantInicial = DecimalUtil.ZERO ;
      /* Using cursor P08X43 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV17MRCod)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A9504MRMovFch = P08X43_A9504MRMovFch[0] ;
         A9492MRCod = P08X43_A9492MRCod[0] ;
         A9508MRMovCnt = P08X43_A9508MRMovCnt[0] ;
         A9502MRMov = P08X43_A9502MRMov[0] ;
         if ( GXutil.resetTime(GXutil.resetTime( A9504MRMovFch)).before( GXutil.resetTime( AV57Fec1 )) )
         {
            AV59CantE = ((A9508MRMovCnt.doubleValue()<0) ? DecimalUtil.doubleToDec((-1)).multiply(A9508MRMovCnt) : DecimalUtil.doubleToDec(0)) ;
            AV61CantS = ((A9508MRMovCnt.doubleValue()>0) ? A9508MRMovCnt : DecimalUtil.doubleToDec(0)) ;
            AV63CantInicial = AV63CantInicial.add((AV59CantE.subtract(AV61CantS))) ;
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
      AV62Saldo = AV63CantInicial ;
      AV61CantS = DecimalUtil.ZERO ;
      AV59CantE = DecimalUtil.ZERO ;
      AV13CellRow = (int)(AV13CellRow+1) ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setText( httpContext.getMessage( "Hasta ", "")+GXutil.trim( localUtil.dtoc( AV57Fec1, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+6, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV62Saldo)) );
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      /* Using cursor P08X44 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV17MRCod)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A9504MRMovFch = P08X44_A9504MRMovFch[0] ;
         A9492MRCod = P08X44_A9492MRCod[0] ;
         A9507MRMovDsc = P08X44_A9507MRMovDsc[0] ;
         A9508MRMovCnt = P08X44_A9508MRMovCnt[0] ;
         A9509MRMovPre = P08X44_A9509MRMovPre[0] ;
         A9502MRMov = P08X44_A9502MRMov[0] ;
         if ( (( GXutil.resetTime(GXutil.resetTime( A9504MRMovFch)).after( GXutil.resetTime( AV57Fec1 )) ) || ( GXutil.dateCompare(GXutil.resetTime(GXutil.resetTime( A9504MRMovFch)), GXutil.resetTime(AV57Fec1)) )) )
         {
            if ( (( GXutil.resetTime(GXutil.resetTime( A9504MRMovFch)).before( GXutil.resetTime( AV58Fec2 )) ) || ( GXutil.dateCompare(GXutil.resetTime(GXutil.resetTime( A9504MRMovFch)), GXutil.resetTime(AV58Fec2)) )) )
            {
               AV13CellRow = (int)(AV13CellRow+1) ;
               AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setDate( A9504MRMovFch );
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( A9507MRMovDsc );
               AV59CantE = ((A9508MRMovCnt.doubleValue()<0) ? DecimalUtil.doubleToDec((-1)).multiply(A9508MRMovCnt) : DecimalUtil.doubleToDec(0)) ;
               AV60Mrmovpre = ((A9508MRMovCnt.doubleValue()<0) ? A9509MRMovPre : DecimalUtil.doubleToDec(0)) ;
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+2, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV59CantE)) );
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV60Mrmovpre)) );
               AV61CantS = ((A9508MRMovCnt.doubleValue()>0) ? A9508MRMovCnt : DecimalUtil.doubleToDec(0)) ;
               AV60Mrmovpre = ((A9508MRMovCnt.doubleValue()>0) ? A9509MRMovPre : DecimalUtil.doubleToDec(0)) ;
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+4, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV61CantS)) );
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+5, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV60Mrmovpre)) );
               AV62Saldo = AV62Saldo.add((AV59CantE.subtract(AV61CantS))) ;
               AV60Mrmovpre = DecimalUtil.doubleToDec(0) ;
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+6, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV62Saldo)) );
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+7, 1, 1).setNumber( A9502MRMov );
            }
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void S171( )
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

   protected void cleanup( )
   {
      this.aP4[0] = kardexrepuestoexport.this.AV11Filename;
      this.aP5[0] = kardexrepuestoexport.this.AV12ErrorMessage;
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
      AV64MRCNom = "" ;
      scmdbuf = "" ;
      AV16EmprCod = "" ;
      P08X42_A9492MRCod = new int[1] ;
      P08X42_A396EmprCod = new String[] {""} ;
      P08X42_A9493MRNom = new String[] {""} ;
      P08X42_n9493MRNom = new boolean[] {false} ;
      A9493MRNom = "" ;
      AV63CantInicial = DecimalUtil.ZERO ;
      P08X43_A396EmprCod = new String[] {""} ;
      P08X43_A9504MRMovFch = new java.util.Date[] {GXutil.nullDate()} ;
      P08X43_A9492MRCod = new int[1] ;
      P08X43_A9508MRMovCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08X43_A9502MRMov = new long[1] ;
      A9504MRMovFch = GXutil.resetTime( GXutil.nullDate() );
      A9508MRMovCnt = DecimalUtil.ZERO ;
      AV59CantE = DecimalUtil.ZERO ;
      AV61CantS = DecimalUtil.ZERO ;
      AV62Saldo = DecimalUtil.ZERO ;
      P08X44_A396EmprCod = new String[] {""} ;
      P08X44_A9504MRMovFch = new java.util.Date[] {GXutil.nullDate()} ;
      P08X44_A9492MRCod = new int[1] ;
      P08X44_A9507MRMovDsc = new String[] {""} ;
      P08X44_A9508MRMovCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08X44_A9509MRMovPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08X44_A9502MRMov = new long[1] ;
      A9507MRMovDsc = "" ;
      A9509MRMovPre = DecimalUtil.ZERO ;
      AV60Mrmovpre = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.core.kardexrepuestoexport__default(),
         new Object[] {
             new Object[] {
            P08X42_A9492MRCod, P08X42_A396EmprCod, P08X42_A9493MRNom, P08X42_n9493MRNom
            }
            , new Object[] {
            P08X43_A396EmprCod, P08X43_A9504MRMovFch, P08X43_A9492MRCod, P08X43_A9508MRMovCnt, P08X43_A9502MRMov
            }
            , new Object[] {
            P08X44_A396EmprCod, P08X44_A9504MRMovFch, P08X44_A9492MRCod, P08X44_A9507MRMovDsc, P08X44_A9508MRMovCnt, P08X44_A9509MRMovPre, P08X44_A9502MRMov
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV17MRCod ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int A9492MRCod ;
   private long A9502MRMov ;
   private java.math.BigDecimal AV63CantInicial ;
   private java.math.BigDecimal A9508MRMovCnt ;
   private java.math.BigDecimal AV59CantE ;
   private java.math.BigDecimal AV61CantS ;
   private java.math.BigDecimal AV62Saldo ;
   private java.math.BigDecimal A9509MRMovPre ;
   private java.math.BigDecimal AV60Mrmovpre ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String AV16EmprCod ;
   private String A9493MRNom ;
   private String A9507MRMovDsc ;
   private java.util.Date A9504MRMovFch ;
   private java.util.Date AV57Fec1 ;
   private java.util.Date AV58Fec2 ;
   private boolean returnInSub ;
   private boolean n9493MRNom ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV64MRCNom ;
   private String[] aP5 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private int[] P08X42_A9492MRCod ;
   private String[] P08X42_A396EmprCod ;
   private String[] P08X42_A9493MRNom ;
   private boolean[] P08X42_n9493MRNom ;
   private String[] P08X43_A396EmprCod ;
   private java.util.Date[] P08X43_A9504MRMovFch ;
   private int[] P08X43_A9492MRCod ;
   private java.math.BigDecimal[] P08X43_A9508MRMovCnt ;
   private long[] P08X43_A9502MRMov ;
   private String[] P08X44_A396EmprCod ;
   private java.util.Date[] P08X44_A9504MRMovFch ;
   private int[] P08X44_A9492MRCod ;
   private String[] P08X44_A9507MRMovDsc ;
   private java.math.BigDecimal[] P08X44_A9508MRMovCnt ;
   private java.math.BigDecimal[] P08X44_A9509MRMovPre ;
   private long[] P08X44_A9502MRMov ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
}

final  class kardexrepuestoexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08X42", "SELECT MRCod, EmprCod, MRNom FROM TXPMREPUE WHERE EmprCod = ? and MRCod = ? ORDER BY EmprCod, MRCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P08X43", "SELECT EmprCod, MRMovFch, MRCod, MRMovCnt, MRMov FROM TXPMReMov WHERE EmprCod = ? and MRCod = ? ORDER BY EmprCod, MRCod, MRMovFch ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08X44", "SELECT EmprCod, MRMovFch, MRCod, MRMovDsc, MRMovCnt, MRMovPre, MRMov FROM TXPMReMov WHERE EmprCod = ? and MRCod = ? ORDER BY EmprCod, MRCod, MRMovFch ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,3);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,3);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,3);
               ((long[]) buf[6])[0] = rslt.getLong(7);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

