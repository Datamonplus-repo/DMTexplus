package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class documentodiferenciarecuento extends GXProcedure
{
   public documentodiferenciarecuento( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentodiferenciarecuento.class ), "" );
   }

   public documentodiferenciarecuento( int remoteHandle ,
                                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             String aP1 ,
                             java.util.Date aP2 ,
                             String aP3 ,
                             String aP4 ,
                             String aP5 )
   {
      documentodiferenciarecuento.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        java.util.Date aP2 ,
                        String aP3 ,
                        String aP4 ,
                        String aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             java.util.Date aP2 ,
                             String aP3 ,
                             String aP4 ,
                             String aP5 ,
                             String[] aP6 )
   {
      documentodiferenciarecuento.this.AV12Emprcod = aP0;
      documentodiferenciarecuento.this.AV17ImpCod = aP1;
      documentodiferenciarecuento.this.AV30UFecha = aP2;
      documentodiferenciarecuento.this.AV18PrdNumfrom = aP3;
      documentodiferenciarecuento.this.AV19PrdNumTo = aP4;
      documentodiferenciarecuento.this.AV11desvios = aP5;
      documentodiferenciarecuento.this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_SdtWWPContext1[0] = AV51WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext1) ;
      AV51WWPContext = GXv_SdtWWPContext1[0] ;
      /* Execute user subroutine: 'OPENDOCUMENT' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV10CellRow = 1 ;
      AV54FirstColumn = (byte)(1) ;
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
      AV10CellRow = (int)(AV10CellRow+1) ;
      AV9CellCol = 4 ;
      AV14ExcelDocument.Cells(AV10CellRow, AV9CellCol, 1, 1).setText( httpContext.getMessage( "Total", "") );
      AV9CellCol = 5 ;
      AV14ExcelDocument.Cells(AV10CellRow, AV9CellCol, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV55Total)) );
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
      AV52Random = (long)(GXutil.random( )*10000) ;
      AV16Filename = "ListadoDiferenciaRecuento_Export-" + GXutil.trim( GXutil.str( AV52Random, 10, 0)) + ".xlsx" ;
      AV14ExcelDocument.Open(AV16Filename);
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV14ExcelDocument.Clear();
   }

   public void S131( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV21Tit1 = httpContext.getMessage( "Produto", "") ;
      AV22Tit2 = httpContext.getMessage( "Nome", "") ;
      AV23Tit3 = httpContext.getMessage( "Stock", "") ;
      AV24Tit4 = httpContext.getMessage( "Preço", "") ;
      AV25Tit5 = httpContext.getMessage( "Valor", "") ;
      AV26Tit6 = httpContext.getMessage( "Fornecedor", "") ;
      AV27Tit7 = httpContext.getMessage( "Nome", "") ;
      AV10CellRow = 2 ;
      AV9CellCol = 1 ;
      while ( AV9CellCol <= 50 )
      {
         AV14ExcelDocument.Cells(AV10CellRow, AV9CellCol, 1, 1).setBold( (short)(1) );
         AV14ExcelDocument.Cells(AV10CellRow, AV9CellCol, 1, 1).setColor( 11 );
         AV9CellCol = (int)(AV9CellCol+1) ;
      }
      AV14ExcelDocument.Cells(AV10CellRow, 1, 1, 1).setText( AV21Tit1 );
      AV14ExcelDocument.Cells(AV10CellRow, 2, 1, 1).setText( AV22Tit2 );
      AV14ExcelDocument.Cells(AV10CellRow, 3, 1, 1).setText( AV23Tit3 );
      AV14ExcelDocument.Cells(AV10CellRow, 4, 1, 1).setText( AV24Tit4 );
      AV14ExcelDocument.Cells(AV10CellRow, 5, 1, 1).setText( AV25Tit5 );
      AV14ExcelDocument.Cells(AV10CellRow, 6, 1, 1).setText( AV26Tit6 );
      AV14ExcelDocument.Cells(AV10CellRow, 7, 1, 1).setText( AV27Tit7 );
      AV14ExcelDocument.Cells(AV10CellRow, 8, 1, 1).setText( AV28Tit8 );
      AV14ExcelDocument.Cells(AV10CellRow, 9, 1, 1).setText( AV29Tit9 );
   }

   public void S141( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      /* Using cursor P0AI92 */
      pr_default.execute(0, new Object[] {AV12Emprcod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P0AI92_A396EmprCod[0] ;
         A810RecFec = P0AI92_A810RecFec[0] ;
         A719PrdNum = P0AI92_A719PrdNum[0] ;
         if ( GXutil.resetTime(A810RecFec).before( GXutil.resetTime( AV30UFecha )) )
         {
            AV41Pfecha = A810RecFec ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV10CellRow = (int)(AV10CellRow+1) ;
      AV46ValAlmCol = DecimalUtil.ZERO ;
      AV47ValAlmTot = DecimalUtil.ZERO ;
      AV48ValCCCol = DecimalUtil.ZERO ;
      AV49ValCCTot = DecimalUtil.ZERO ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV18PrdNumfrom ,
                                           AV19PrdNumTo ,
                                           A719PrdNum ,
                                           AV12Emprcod ,
                                           AV30UFecha ,
                                           A396EmprCod ,
                                           A810RecFec } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DATE
                                           }
      });
      /* Using cursor P0AI93 */
      pr_default.execute(1, new Object[] {AV12Emprcod, AV30UFecha, AV18PrdNumfrom, AV19PrdNumTo});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A719PrdNum = P0AI93_A719PrdNum[0] ;
         A810RecFec = P0AI93_A810RecFec[0] ;
         A396EmprCod = P0AI93_A396EmprCod[0] ;
         A807RecExiRea = P0AI93_A807RecExiRea[0] ;
         A809RecExiTeo = P0AI93_A809RecExiTeo[0] ;
         A724PrdPreAct = P0AI93_A724PrdPreAct[0] ;
         A726PrdPreMed = P0AI93_A726PrdPreMed[0] ;
         A3915EmpNumDec = P0AI93_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P0AI93_n3915EmpNumDec[0] ;
         A718PrdNom = P0AI93_A718PrdNom[0] ;
         A6573RecPreRec = P0AI93_A6573RecPreRec[0] ;
         A795PrvNum = P0AI93_A795PrvNum[0] ;
         A794PrvNom = P0AI93_A794PrvNom[0] ;
         n794PrvNom = P0AI93_n794PrvNom[0] ;
         A3915EmpNumDec = P0AI93_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P0AI93_n3915EmpNumDec[0] ;
         A724PrdPreAct = P0AI93_A724PrdPreAct[0] ;
         A726PrdPreMed = P0AI93_A726PrdPreMed[0] ;
         A718PrdNom = P0AI93_A718PrdNom[0] ;
         A795PrvNum = P0AI93_A795PrvNum[0] ;
         A794PrvNom = P0AI93_A794PrvNom[0] ;
         n794PrvNom = P0AI93_n794PrvNom[0] ;
         AV32DifAlm = A809RecExiTeo.subtract(A807RecExiRea) ;
         if ( ( AV32DifAlm.doubleValue() < 0 ) && (0==AV38FlagDifN) )
         {
            AV33DifAlm2 = AV32DifAlm.negate() ;
         }
         else
         {
            AV33DifAlm2 = AV32DifAlm ;
         }
         if ( A809RecExiTeo.doubleValue() != 0 )
         {
            AV34DifAlmPor = AV33DifAlm2.multiply(DecimalUtil.doubleToDec(100)).divide(A809RecExiTeo, 18, java.math.RoundingMode.DOWN) ;
         }
         else
         {
            AV34DifAlmPor = DecimalUtil.doubleToDec(0) ;
         }
         AV43PreProd = A724PrdPreAct ;
         if ( AV39FlagPreMed == 1 )
         {
            AV43PreProd = A726PrdPreMed ;
         }
         if ( A3915EmpNumDec == 0 )
         {
            AV45ValAlm = GXutil.roundDecimal( AV33DifAlm2.multiply(AV43PreProd), 1) ;
         }
         else
         {
            if ( A3915EmpNumDec == 2 )
            {
               AV45ValAlm = GXutil.roundDecimal( AV33DifAlm2.multiply(AV43PreProd), 2) ;
            }
         }
         if ( ( GXutil.strcmp(AV44TipCol, GXutil.substring( A719PrdNum, 1, 1)) != 0 ) && ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "8") == 0 ) && ! (GXutil.strcmp("", AV44TipCol)==0) )
         {
            /* Execute user subroutine: 'TOTAL' */
            S153 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               pr_default.close(1);
               pr_default.close(1);
               pr_default.close(1);
               returnInSub = true;
               if (true) return;
            }
         }
         if ( ( A807RecExiRea.doubleValue() == 0 ) && ( A809RecExiTeo.doubleValue() == 0 ) )
         {
         }
         else
         {
            AV42PrdNum = A719PrdNum ;
            /* Execute user subroutine: 'ENTALM' */
            S163 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               pr_default.close(1);
               pr_default.close(1);
               pr_default.close(1);
               returnInSub = true;
               if (true) return;
            }
            if ( ( ( AV32DifAlm.doubleValue() != 0 ) && ( GXutil.strcmp(AV11desvios, httpContext.getMessage( "S", "")) == 0 ) ) || ( ( GXutil.strcmp(AV11desvios, httpContext.getMessage( "N", "")) == 0 ) ) )
            {
               AV14ExcelDocument.Cells(AV10CellRow, 1, 1, 1).setText( A719PrdNum );
               AV14ExcelDocument.Cells(AV10CellRow, 2, 1, 1).setText( A718PrdNom );
               AV14ExcelDocument.Cells(AV10CellRow, 3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A807RecExiRea)) );
               AV14ExcelDocument.Cells(AV10CellRow, 4, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A6573RecPreRec)) );
               AV45ValAlm = GXutil.roundDecimal( A807RecExiRea.multiply(A6573RecPreRec), 2) ;
               AV14ExcelDocument.Cells(AV10CellRow, 5, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV45ValAlm)) );
               AV14ExcelDocument.Cells(AV10CellRow, 6, 1, 1).setNumber( A795PrvNum );
               AV14ExcelDocument.Cells(AV10CellRow, 7, 1, 1).setText( A794PrvNom );
               if ( GXutil.strcmp(AV11desvios, httpContext.getMessage( "S", "")) == 0 )
               {
                  AV14ExcelDocument.Cells(AV10CellRow, 8, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV34DifAlmPor)) );
                  AV14ExcelDocument.Cells(AV10CellRow, 9, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A809RecExiTeo)) );
               }
               AV46ValAlmCol = AV46ValAlmCol.add(AV45ValAlm) ;
               AV47ValAlmTot = AV47ValAlmTot.add(AV45ValAlm) ;
               AV10CellRow = (int)(AV10CellRow+1) ;
            }
         }
         AV44TipCol = GXutil.substring( A719PrdNum, 1, 1) ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
      /* Execute user subroutine: 'TOTAL' */
      S153 ();
      if (returnInSub) return;
   }

   public void S153( )
   {
      /* 'TOTAL' Routine */
      returnInSub = false ;
      AV10CellRow = (int)(AV10CellRow+2) ;
      AV9CellCol = 5 ;
      AV14ExcelDocument.Cells(AV10CellRow, AV9CellCol, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV46ValAlmCol)) );
      AV55Total = AV55Total.add(AV46ValAlmCol) ;
      AV10CellRow = (int)(AV10CellRow+1) ;
      AV9CellCol = (int)(AV9CellCol+1) ;
      AV40Msg_b = "" ;
      AV14ExcelDocument.Cells(AV10CellRow, AV9CellCol, 1, 1).setText( AV40Msg_b );
      AV9CellCol = (int)(AV9CellCol+1) ;
      AV46ValAlmCol = DecimalUtil.doubleToDec(0) ;
      AV48ValCCCol = DecimalUtil.doubleToDec(0) ;
   }

   public void S163( )
   {
      /* 'ENTALM' Routine */
      returnInSub = false ;
      GXv_decimal2[0] = AV35EntUnient ;
      new app.pcalexi(remoteHandle, context).execute( AV12Emprcod, AV42PrdNum, AV36FecIni, AV41Pfecha, AV30UFecha, GXv_decimal2) ;
      documentodiferenciarecuento.this.AV35EntUnient = GXv_decimal2[0] ;
   }

   public void S171( )
   {
      /* 'CLOSEDOCUMENT' Routine */
      returnInSub = false ;
      AV14ExcelDocument.Save();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV14ExcelDocument.Close();
   }

   public void S121( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV14ExcelDocument.getErrCode() != 0 )
      {
         AV16Filename = "" ;
         AV13ErrorMessage = AV14ExcelDocument.getErrDescription() ;
         AV14ExcelDocument.Close();
         returnInSub = true;
         if (true) return;
      }
   }

   protected void cleanup( )
   {
      this.aP6[0] = documentodiferenciarecuento.this.AV16Filename;
      CloseOpenCursors();
      AV14ExcelDocument.cleanup();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV16Filename = "" ;
      AV51WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV14ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      AV55Total = DecimalUtil.ZERO ;
      AV21Tit1 = "" ;
      AV22Tit2 = "" ;
      AV23Tit3 = "" ;
      AV24Tit4 = "" ;
      AV25Tit5 = "" ;
      AV26Tit6 = "" ;
      AV27Tit7 = "" ;
      AV28Tit8 = "" ;
      AV29Tit9 = "" ;
      scmdbuf = "" ;
      P0AI92_A396EmprCod = new String[] {""} ;
      P0AI92_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0AI92_A719PrdNum = new String[] {""} ;
      A396EmprCod = "" ;
      A810RecFec = GXutil.nullDate() ;
      A719PrdNum = "" ;
      AV41Pfecha = GXutil.nullDate() ;
      AV46ValAlmCol = DecimalUtil.ZERO ;
      AV47ValAlmTot = DecimalUtil.ZERO ;
      AV48ValCCCol = DecimalUtil.ZERO ;
      AV49ValCCTot = DecimalUtil.ZERO ;
      P0AI93_A719PrdNum = new String[] {""} ;
      P0AI93_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0AI93_A396EmprCod = new String[] {""} ;
      P0AI93_A807RecExiRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AI93_A809RecExiTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AI93_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AI93_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AI93_A3915EmpNumDec = new byte[1] ;
      P0AI93_n3915EmpNumDec = new boolean[] {false} ;
      P0AI93_A718PrdNom = new String[] {""} ;
      P0AI93_A6573RecPreRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AI93_A795PrvNum = new int[1] ;
      P0AI93_A794PrvNom = new String[] {""} ;
      P0AI93_n794PrvNom = new boolean[] {false} ;
      A807RecExiRea = DecimalUtil.ZERO ;
      A809RecExiTeo = DecimalUtil.ZERO ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A726PrdPreMed = DecimalUtil.ZERO ;
      A718PrdNom = "" ;
      A6573RecPreRec = DecimalUtil.ZERO ;
      A794PrvNom = "" ;
      AV32DifAlm = DecimalUtil.ZERO ;
      AV33DifAlm2 = DecimalUtil.ZERO ;
      AV34DifAlmPor = DecimalUtil.ZERO ;
      AV43PreProd = DecimalUtil.ZERO ;
      AV45ValAlm = DecimalUtil.ZERO ;
      AV44TipCol = "" ;
      AV42PrdNum = "" ;
      AV40Msg_b = "" ;
      AV36FecIni = GXutil.nullDate() ;
      AV35EntUnient = DecimalUtil.ZERO ;
      GXv_decimal2 = new java.math.BigDecimal[1] ;
      AV13ErrorMessage = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentodiferenciarecuento__default(),
         new Object[] {
             new Object[] {
            P0AI92_A396EmprCod, P0AI92_A810RecFec, P0AI92_A719PrdNum
            }
            , new Object[] {
            P0AI93_A719PrdNum, P0AI93_A810RecFec, P0AI93_A396EmprCod, P0AI93_A807RecExiRea, P0AI93_A809RecExiTeo, P0AI93_A724PrdPreAct, P0AI93_A726PrdPreMed, P0AI93_A3915EmpNumDec, P0AI93_n3915EmpNumDec, P0AI93_A718PrdNom,
            P0AI93_A6573RecPreRec, P0AI93_A795PrvNum, P0AI93_A794PrvNom, P0AI93_n794PrvNom
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV54FirstColumn ;
   private byte A3915EmpNumDec ;
   private byte AV38FlagDifN ;
   private byte AV39FlagPreMed ;
   private short Gx_err ;
   private int AV10CellRow ;
   private int AV9CellCol ;
   private int A795PrvNum ;
   private long AV52Random ;
   private java.math.BigDecimal AV55Total ;
   private java.math.BigDecimal AV46ValAlmCol ;
   private java.math.BigDecimal AV47ValAlmTot ;
   private java.math.BigDecimal AV48ValCCCol ;
   private java.math.BigDecimal AV49ValCCTot ;
   private java.math.BigDecimal A807RecExiRea ;
   private java.math.BigDecimal A809RecExiTeo ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A726PrdPreMed ;
   private java.math.BigDecimal A6573RecPreRec ;
   private java.math.BigDecimal AV32DifAlm ;
   private java.math.BigDecimal AV33DifAlm2 ;
   private java.math.BigDecimal AV34DifAlmPor ;
   private java.math.BigDecimal AV43PreProd ;
   private java.math.BigDecimal AV45ValAlm ;
   private java.math.BigDecimal AV35EntUnient ;
   private java.math.BigDecimal GXv_decimal2[] ;
   private String AV12Emprcod ;
   private String AV17ImpCod ;
   private String AV11desvios ;
   private String AV21Tit1 ;
   private String AV22Tit2 ;
   private String AV23Tit3 ;
   private String AV24Tit4 ;
   private String AV25Tit5 ;
   private String AV26Tit6 ;
   private String AV27Tit7 ;
   private String AV28Tit8 ;
   private String AV29Tit9 ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String A794PrvNom ;
   private String AV44TipCol ;
   private String AV42PrdNum ;
   private String AV40Msg_b ;
   private java.util.Date AV30UFecha ;
   private java.util.Date A810RecFec ;
   private java.util.Date AV41Pfecha ;
   private java.util.Date AV36FecIni ;
   private boolean returnInSub ;
   private boolean n3915EmpNumDec ;
   private boolean n794PrvNom ;
   private String AV18PrdNumfrom ;
   private String AV19PrdNumTo ;
   private String AV16Filename ;
   private String AV13ErrorMessage ;
   private String[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AI92_A396EmprCod ;
   private java.util.Date[] P0AI92_A810RecFec ;
   private String[] P0AI92_A719PrdNum ;
   private String[] P0AI93_A719PrdNum ;
   private java.util.Date[] P0AI93_A810RecFec ;
   private String[] P0AI93_A396EmprCod ;
   private java.math.BigDecimal[] P0AI93_A807RecExiRea ;
   private java.math.BigDecimal[] P0AI93_A809RecExiTeo ;
   private java.math.BigDecimal[] P0AI93_A724PrdPreAct ;
   private java.math.BigDecimal[] P0AI93_A726PrdPreMed ;
   private byte[] P0AI93_A3915EmpNumDec ;
   private boolean[] P0AI93_n3915EmpNumDec ;
   private String[] P0AI93_A718PrdNom ;
   private java.math.BigDecimal[] P0AI93_A6573RecPreRec ;
   private int[] P0AI93_A795PrvNum ;
   private String[] P0AI93_A794PrvNom ;
   private boolean[] P0AI93_n794PrvNom ;
   private com.genexus.gxoffice.ExcelDoc AV14ExcelDocument ;
   private app.wwpbaseobjects.SdtWWPContext AV51WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
}

final  class documentodiferenciarecuento__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AI93( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV18PrdNumfrom ,
                                          String AV19PrdNumTo ,
                                          String A719PrdNum ,
                                          String AV12Emprcod ,
                                          java.util.Date AV30UFecha ,
                                          String A396EmprCod ,
                                          java.util.Date A810RecFec )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int3 = new byte[4];
      Object[] GXv_Object4 = new Object[2];
      scmdbuf = "SELECT T1.PrdNum, T1.RecFec, T1.EmprCod, T1.RecExiRea, T1.RecExiTeo, T3.PrdPreAct, T3.PrdPreMed, T2.EmpNumDec, T3.PrdNom, T1.RecPreRec, T3.PrvNum, T4.PrvNom FROM" ;
      scmdbuf += " (((TXPRECUEN T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN TXPPRODUC T3 ON T3.EmprCod = T1.EmprCod AND T3.PrdNum = T1.PrdNum) LEFT JOIN TXPPRVGEN" ;
      scmdbuf += " T4 ON T4.EmprCod = T1.EmprCod AND T4.PrvNum = T3.PrvNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.RecFec = ?)");
      if ( ! (GXutil.strcmp("", AV18PrdNumfrom)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum >= ?)");
      }
      else
      {
         GXv_int3[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV19PrdNumTo)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum <= ?)");
      }
      else
      {
         GXv_int3[3] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.RecFec, T1.PrdNum" ;
      GXv_Object4[0] = scmdbuf ;
      GXv_Object4[1] = GXv_int3 ;
      return GXv_Object4 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.IHttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 1 :
                  return conditional_P0AI93(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (String)dynConstraints[5] , (java.util.Date)dynConstraints[6] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AI92", "SELECT EmprCod, RecFec, PrdNum FROM TXPRECUEN WHERE EmprCod = ? ORDER BY EmprCod, RecFec DESC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AI93", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 26);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,5);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
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
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[4], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[5]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[6], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[7], 6);
               }
               return;
      }
   }

}

