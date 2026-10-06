package app.comprasquimicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class informecomprasmes_export extends GXProcedure
{
   public informecomprasmes_export( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( informecomprasmes_export.class ), "" );
   }

   public informecomprasmes_export( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             int aP3 ,
                             int aP4 ,
                             short aP5 ,
                             short aP6 ,
                             String[] aP7 )
   {
      informecomprasmes_export.this.aP8 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        int aP3 ,
                        int aP4 ,
                        short aP5 ,
                        short aP6 ,
                        String[] aP7 ,
                        String[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             int aP3 ,
                             int aP4 ,
                             short aP5 ,
                             short aP6 ,
                             String[] aP7 ,
                             String[] aP8 )
   {
      informecomprasmes_export.this.AV32Emprcod = aP0;
      informecomprasmes_export.this.AV33PProd = aP1;
      informecomprasmes_export.this.AV34UProd = aP2;
      informecomprasmes_export.this.AV35PProv = aP3;
      informecomprasmes_export.this.AV36UProv = aP4;
      informecomprasmes_export.this.AV8any = aP5;
      informecomprasmes_export.this.AV14mes = aP6;
      informecomprasmes_export.this.aP7 = aP7;
      informecomprasmes_export.this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Execute user subroutine: 'OPENDOCUMENT' */
      S151 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITECOLUMNTITLES' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV10CellRow = 3 ;
      /* Execute user subroutine: 'WRITEDATA' */
      S121 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'CLOSEDOCUMENT' */
      S131 ();
      if ( returnInSub )
      {
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV12ExcelDocument.Cells(1, 1, 1, 1).setBold( (short)(1) );
      AV12ExcelDocument.Cells(1, 1, 1, 1).setColor( 11 );
      AV12ExcelDocument.Cells(1, 1, 1, 1).setText( httpContext.getMessage( "Año", "") );
      AV12ExcelDocument.Cells(1, 2, 1, 1).setNumber( AV8any );
      AV12ExcelDocument.Cells(1, 3, 1, 1).setBold( (short)(1) );
      AV12ExcelDocument.Cells(1, 3, 1, 1).setColor( 11 );
      AV12ExcelDocument.Cells(1, 3, 1, 1).setText( httpContext.getMessage( "Mes", "") );
      AV12ExcelDocument.Cells(1, 4, 1, 1).setNumber( AV14mes );
      AV10CellRow = 2 ;
      AV9CellCol = 1 ;
      while ( AV9CellCol <= 50 )
      {
         AV12ExcelDocument.Cells(AV10CellRow, AV9CellCol, 1, 1).setBold( (short)(1) );
         AV12ExcelDocument.Cells(AV10CellRow, AV9CellCol, 1, 1).setColor( 11 );
         AV9CellCol = (int)(AV9CellCol+1) ;
      }
      AV12ExcelDocument.Cells(2, 1, 1, 1).setText( httpContext.getMessage( "Producto", "") );
      AV12ExcelDocument.Cells(2, 2, 1, 1).setText( httpContext.getMessage( "Descripcion", "") );
      AV12ExcelDocument.Cells(2, 3, 1, 1).setText( httpContext.getMessage( "Compras Mes", "") );
      AV12ExcelDocument.Cells(2, 4, 1, 1).setText( "%" );
      AV12ExcelDocument.Cells(2, 5, 1, 1).setText( httpContext.getMessage( "Valor Compras", "") );
      AV12ExcelDocument.Cells(2, 6, 1, 1).setText( "%" );
      AV12ExcelDocument.Cells(2, 7, 1, 1).setText( httpContext.getMessage( "Compras Acumulado", "") );
      AV12ExcelDocument.Cells(2, 8, 1, 1).setText( "%" );
      AV12ExcelDocument.Cells(2, 9, 1, 1).setText( httpContext.getMessage( "Valor Compras", "") );
      AV12ExcelDocument.Cells(2, 10, 1, 1).setText( "%" );
   }

   public void S121( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      /* Optimized group. */
      /* Using cursor P09RS2 */
      pr_default.execute(0, new Object[] {AV32Emprcod, AV33PProd, Short.valueOf(AV8any), Integer.valueOf(AV35PProv), Short.valueOf(AV14mes), Integer.valueOf(AV36UProv), AV34UProd});
      c8364PrdUndCpM = P09RS2_A8364PrdUndCpM[0] ;
      c8365PrdUndCnM = P09RS2_A8365PrdUndCnM[0] ;
      pr_default.close(0);
      AV31CompAc = AV31CompAc.add(c8364PrdUndCpM) ;
      AV30ValCom = AV30ValCom.add(c8365PrdUndCnM) ;
      /* End optimized group. */
      /* Optimized group. */
      /* Using cursor P09RS3 */
      pr_default.execute(1, new Object[] {AV32Emprcod, AV33PProd, Short.valueOf(AV8any), Integer.valueOf(AV35PProv), Integer.valueOf(AV36UProv), Short.valueOf(AV14mes), AV34UProd});
      c8364PrdUndCpM = P09RS3_A8364PrdUndCpM[0] ;
      c8365PrdUndCnM = P09RS3_A8365PrdUndCnM[0] ;
      pr_default.close(1);
      AV37ComAcAn = AV37ComAcAn.add(c8364PrdUndCpM) ;
      AV38ComVAcAn = AV38ComVAcAn.add(c8365PrdUndCnM) ;
      /* End optimized group. */
      AV39PrdNumi = "" ;
      /* Using cursor P09RS4 */
      pr_default.execute(2, new Object[] {AV32Emprcod, AV33PProd, Short.valueOf(AV8any), Integer.valueOf(AV35PProv), Integer.valueOf(AV36UProv), Short.valueOf(AV14mes), AV34UProd});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9RS4 = false ;
         A8363PrdMesL = P09RS4_A8363PrdMesL[0] ;
         A8366PrdAnyo = P09RS4_A8366PrdAnyo[0] ;
         A8360PrdProv = P09RS4_A8360PrdProv[0] ;
         A719PrdNum = P09RS4_A719PrdNum[0] ;
         A396EmprCod = P09RS4_A396EmprCod[0] ;
         A8364PrdUndCpM = P09RS4_A8364PrdUndCpM[0] ;
         A8365PrdUndCnM = P09RS4_A8365PrdUndCnM[0] ;
         A718PrdNom = P09RS4_A718PrdNom[0] ;
         A718PrdNom = P09RS4_A718PrdNom[0] ;
         if ( ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), GXutil.substring( AV39PrdNumi, 1, 1)) == 0 ) || (GXutil.strcmp("", AV39PrdNumi)==0) )
         {
            AV40UniCprmP = AV40UniCprmP.add(AV16UniCprM) ;
            AV41ValCprMP = AV41ValCprMP.add(AV18ValCprM) ;
            AV42CA1P = AV42CA1P.add(AV20CA1) ;
            AV43Vca1P = AV43Vca1P.add(AV22VCA1) ;
         }
         AV20CA1 = DecimalUtil.doubleToDec(0) ;
         AV22VCA1 = DecimalUtil.doubleToDec(0) ;
         AV39PrdNumi = A719PrdNum ;
         AV16UniCprM = DecimalUtil.doubleToDec(0) ;
         AV18ValCprM = DecimalUtil.doubleToDec(0) ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09RS4_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P09RS4_A719PrdNum[0], A719PrdNum) == 0 ) && ( P09RS4_A8366PrdAnyo[0] == AV8any ) )
         {
            brk9RS4 = false ;
            A8363PrdMesL = P09RS4_A8363PrdMesL[0] ;
            A8366PrdAnyo = P09RS4_A8366PrdAnyo[0] ;
            A8360PrdProv = P09RS4_A8360PrdProv[0] ;
            A8364PrdUndCpM = P09RS4_A8364PrdUndCpM[0] ;
            A8365PrdUndCnM = P09RS4_A8365PrdUndCnM[0] ;
            if ( A8360PrdProv <= AV36UProv )
            {
               if ( A8360PrdProv >= AV35PProv )
               {
                  if ( ( GXutil.strcmp(A719PrdNum, AV33PProd) >= 0 ) && ( GXutil.strcmp(A719PrdNum, AV34UProd) <= 0 ) )
                  {
                     if ( GXutil.strcmp(A396EmprCod, AV32Emprcod) == 0 )
                     {
                        if ( A8363PrdMesL <= AV14mes )
                        {
                           AV20CA1 = AV20CA1.add(A8364PrdUndCpM) ;
                           AV22VCA1 = AV22VCA1.add(A8365PrdUndCnM) ;
                           if ( A8363PrdMesL == AV14mes )
                           {
                              AV16UniCprM = AV16UniCprM.add(A8364PrdUndCpM) ;
                              AV18ValCprM = AV18ValCprM.add(A8365PrdUndCnM) ;
                           }
                        }
                     }
                  }
               }
            }
            brk9RS4 = true ;
            pr_default.readNext(2);
         }
         if ( AV37ComAcAn.doubleValue() != 0 )
         {
            AV21PUniAcu = AV20CA1.multiply(DecimalUtil.doubleToDec(100)).divide(AV37ComAcAn, 18, java.math.RoundingMode.DOWN) ;
         }
         else
         {
            AV21PUniAcu = DecimalUtil.doubleToDec(0) ;
         }
         if ( AV38ComVAcAn.doubleValue() != 0 )
         {
            AV23PValAcu = AV22VCA1.multiply(DecimalUtil.doubleToDec(100)).divide(AV38ComVAcAn, 18, java.math.RoundingMode.DOWN) ;
         }
         else
         {
            AV23PValAcu = DecimalUtil.doubleToDec(0) ;
         }
         if ( AV31CompAc.doubleValue() != 0 )
         {
            AV17PorcCom = AV16UniCprM.multiply(DecimalUtil.doubleToDec(100)).divide(AV31CompAc, 18, java.math.RoundingMode.DOWN) ;
         }
         else
         {
            AV17PorcCom = DecimalUtil.doubleToDec(0) ;
         }
         if ( AV30ValCom.doubleValue() != 0 )
         {
            AV19PValCom = AV18ValCprM.multiply(DecimalUtil.doubleToDec(100)).divide(AV30ValCom, 18, java.math.RoundingMode.DOWN) ;
         }
         else
         {
            AV19PValCom = DecimalUtil.doubleToDec(0) ;
         }
         AV24TotPVal = AV24TotPVal.add(AV19PValCom) ;
         AV25TotVal = AV25TotVal.add(AV18ValCprM) ;
         AV26TotPAcu = AV26TotPAcu.add(AV23PValAcu) ;
         AV27TotVCA1 = AV27TotVCA1.add(AV22VCA1) ;
         AV28Tot_com = AV28Tot_com.add(AV16UniCprM) ;
         AV29Tot_com_a = AV29Tot_com_a.add(AV20CA1) ;
         if ( ( AV16UniCprM.doubleValue() == 0 ) && ( AV20CA1.doubleValue() == 0 ) )
         {
         }
         else
         {
            AV12ExcelDocument.Cells(AV10CellRow, 1, 1, 1).setText( A719PrdNum );
            AV12ExcelDocument.Cells(AV10CellRow, 2, 1, 1).setText( A718PrdNom );
            AV12ExcelDocument.Cells(AV10CellRow, 3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV16UniCprM)) );
            AV12ExcelDocument.Cells(AV10CellRow, 4, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV17PorcCom)) );
            AV12ExcelDocument.Cells(AV10CellRow, 5, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV18ValCprM)) );
            AV12ExcelDocument.Cells(AV10CellRow, 6, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV19PValCom)) );
            AV12ExcelDocument.Cells(AV10CellRow, 7, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV20CA1)) );
            AV12ExcelDocument.Cells(AV10CellRow, 8, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV21PUniAcu)) );
            AV12ExcelDocument.Cells(AV10CellRow, 9, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV22VCA1)) );
            AV12ExcelDocument.Cells(AV10CellRow, 10, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV23PValAcu)) );
            AV10CellRow = (int)(AV10CellRow+1) ;
         }
         if ( ! brk9RS4 )
         {
            brk9RS4 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
      AV10CellRow = (int)(AV10CellRow+1) ;
      AV12ExcelDocument.Cells(AV10CellRow, 3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV28Tot_com)) );
      AV12ExcelDocument.Cells(AV10CellRow, 5, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV25TotVal)) );
      AV12ExcelDocument.Cells(AV10CellRow, 6, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV24TotPVal)) );
      AV12ExcelDocument.Cells(AV10CellRow, 7, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV29Tot_com_a)) );
      AV12ExcelDocument.Cells(AV10CellRow, 9, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV27TotVCA1)) );
      AV12ExcelDocument.Cells(AV10CellRow, 10, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV26TotPAcu)) );
   }

   public void S131( )
   {
      /* 'CLOSEDOCUMENT' Routine */
      returnInSub = false ;
      AV12ExcelDocument.Save();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S141 ();
      if (returnInSub) return;
      AV12ExcelDocument.Close();
   }

   public void S151( )
   {
      /* 'OPENDOCUMENT' Routine */
      returnInSub = false ;
      AV15Random = (int)(GXutil.random( )*10000) ;
      AV13Filename = "InformeComprasMesExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
      AV12ExcelDocument.Open(AV13Filename);
      /* Execute user subroutine: 'CHECKSTATUS' */
      S141 ();
      if (returnInSub) return;
      AV12ExcelDocument.Clear();
   }

   public void S141( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV12ExcelDocument.getErrCode() != 0 )
      {
         AV13Filename = "" ;
         AV11ErrorMessage = AV12ExcelDocument.getErrDescription() ;
         AV12ExcelDocument.Close();
         returnInSub = true;
         if (true) return;
      }
   }

   protected void cleanup( )
   {
      this.aP7[0] = informecomprasmes_export.this.AV13Filename;
      this.aP8[0] = informecomprasmes_export.this.AV11ErrorMessage;
      CloseOpenCursors();
      AV12ExcelDocument.cleanup();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV13Filename = "" ;
      AV11ErrorMessage = "" ;
      AV12ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      c8364PrdUndCpM = DecimalUtil.ZERO ;
      c8365PrdUndCnM = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P09RS2_A8364PrdUndCpM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09RS2_A8365PrdUndCnM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV31CompAc = DecimalUtil.ZERO ;
      AV30ValCom = DecimalUtil.ZERO ;
      P09RS3_A8364PrdUndCpM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09RS3_A8365PrdUndCnM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV37ComAcAn = DecimalUtil.ZERO ;
      AV38ComVAcAn = DecimalUtil.ZERO ;
      AV39PrdNumi = "" ;
      P09RS4_A8363PrdMesL = new byte[1] ;
      P09RS4_A8366PrdAnyo = new short[1] ;
      P09RS4_A8360PrdProv = new int[1] ;
      P09RS4_A719PrdNum = new String[] {""} ;
      P09RS4_A396EmprCod = new String[] {""} ;
      P09RS4_A8364PrdUndCpM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09RS4_A8365PrdUndCnM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09RS4_A718PrdNom = new String[] {""} ;
      A719PrdNum = "" ;
      A396EmprCod = "" ;
      A8364PrdUndCpM = DecimalUtil.ZERO ;
      A8365PrdUndCnM = DecimalUtil.ZERO ;
      A718PrdNom = "" ;
      AV40UniCprmP = DecimalUtil.ZERO ;
      AV16UniCprM = DecimalUtil.ZERO ;
      AV41ValCprMP = DecimalUtil.ZERO ;
      AV18ValCprM = DecimalUtil.ZERO ;
      AV42CA1P = DecimalUtil.ZERO ;
      AV20CA1 = DecimalUtil.ZERO ;
      AV43Vca1P = DecimalUtil.ZERO ;
      AV22VCA1 = DecimalUtil.ZERO ;
      AV21PUniAcu = DecimalUtil.ZERO ;
      AV23PValAcu = DecimalUtil.ZERO ;
      AV17PorcCom = DecimalUtil.ZERO ;
      AV19PValCom = DecimalUtil.ZERO ;
      AV24TotPVal = DecimalUtil.ZERO ;
      AV25TotVal = DecimalUtil.ZERO ;
      AV26TotPAcu = DecimalUtil.ZERO ;
      AV27TotVCA1 = DecimalUtil.ZERO ;
      AV28Tot_com = DecimalUtil.ZERO ;
      AV29Tot_com_a = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.comprasquimicos.informecomprasmes_export__default(),
         new Object[] {
             new Object[] {
            P09RS2_A8364PrdUndCpM, P09RS2_A8365PrdUndCnM
            }
            , new Object[] {
            P09RS3_A8364PrdUndCpM, P09RS3_A8365PrdUndCnM
            }
            , new Object[] {
            P09RS4_A8363PrdMesL, P09RS4_A8366PrdAnyo, P09RS4_A8360PrdProv, P09RS4_A719PrdNum, P09RS4_A396EmprCod, P09RS4_A8364PrdUndCpM, P09RS4_A8365PrdUndCnM, P09RS4_A718PrdNom
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A8363PrdMesL ;
   private short AV8any ;
   private short AV14mes ;
   private short A8366PrdAnyo ;
   private short Gx_err ;
   private int AV35PProv ;
   private int AV36UProv ;
   private int AV10CellRow ;
   private int AV9CellCol ;
   private int A8360PrdProv ;
   private int AV15Random ;
   private java.math.BigDecimal c8364PrdUndCpM ;
   private java.math.BigDecimal c8365PrdUndCnM ;
   private java.math.BigDecimal AV31CompAc ;
   private java.math.BigDecimal AV30ValCom ;
   private java.math.BigDecimal AV37ComAcAn ;
   private java.math.BigDecimal AV38ComVAcAn ;
   private java.math.BigDecimal A8364PrdUndCpM ;
   private java.math.BigDecimal A8365PrdUndCnM ;
   private java.math.BigDecimal AV40UniCprmP ;
   private java.math.BigDecimal AV16UniCprM ;
   private java.math.BigDecimal AV41ValCprMP ;
   private java.math.BigDecimal AV18ValCprM ;
   private java.math.BigDecimal AV42CA1P ;
   private java.math.BigDecimal AV20CA1 ;
   private java.math.BigDecimal AV43Vca1P ;
   private java.math.BigDecimal AV22VCA1 ;
   private java.math.BigDecimal AV21PUniAcu ;
   private java.math.BigDecimal AV23PValAcu ;
   private java.math.BigDecimal AV17PorcCom ;
   private java.math.BigDecimal AV19PValCom ;
   private java.math.BigDecimal AV24TotPVal ;
   private java.math.BigDecimal AV25TotVal ;
   private java.math.BigDecimal AV26TotPAcu ;
   private java.math.BigDecimal AV27TotVCA1 ;
   private java.math.BigDecimal AV28Tot_com ;
   private java.math.BigDecimal AV29Tot_com_a ;
   private String AV32Emprcod ;
   private String AV33PProd ;
   private String AV34UProd ;
   private String scmdbuf ;
   private String AV39PrdNumi ;
   private String A719PrdNum ;
   private String A396EmprCod ;
   private String A718PrdNom ;
   private boolean returnInSub ;
   private boolean brk9RS4 ;
   private String AV13Filename ;
   private String AV11ErrorMessage ;
   private String[] aP8 ;
   private String[] aP7 ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P09RS2_A8364PrdUndCpM ;
   private java.math.BigDecimal[] P09RS2_A8365PrdUndCnM ;
   private java.math.BigDecimal[] P09RS3_A8364PrdUndCpM ;
   private java.math.BigDecimal[] P09RS3_A8365PrdUndCnM ;
   private byte[] P09RS4_A8363PrdMesL ;
   private short[] P09RS4_A8366PrdAnyo ;
   private int[] P09RS4_A8360PrdProv ;
   private String[] P09RS4_A719PrdNum ;
   private String[] P09RS4_A396EmprCod ;
   private java.math.BigDecimal[] P09RS4_A8364PrdUndCpM ;
   private java.math.BigDecimal[] P09RS4_A8365PrdUndCnM ;
   private String[] P09RS4_A718PrdNom ;
   private com.genexus.gxoffice.ExcelDoc AV12ExcelDocument ;
}

final  class informecomprasmes_export__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09RS2", "SELECT SUM(PrdUndCpM), SUM(PrdUndCnM) FROM TXPINSES1 WHERE (EmprCod = ? and PrdNum >= ? and PrdAnyo = ? and PrdProv >= ? and PrdMesL = ?) AND (PrdProv <= ?) AND (PrdNum <= ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09RS3", "SELECT SUM(PrdUndCpM), SUM(PrdUndCnM) FROM TXPINSES1 WHERE (EmprCod = ? and PrdNum >= ? and PrdAnyo = ? and PrdProv >= ?) AND (PrdProv <= ?) AND (PrdMesL <= ?) AND (PrdNum <= ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09RS4", "SELECT T1.PrdMesL, T1.PrdAnyo, T1.PrdProv, T1.PrdNum, T1.EmprCod, T1.PrdUndCpM, T1.PrdUndCnM, T2.PrdNom FROM (TXPINSES1 T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE (T1.EmprCod = ? and T1.PrdNum >= ? and T1.PrdAnyo = ? and T1.PrdProv >= ?) AND (T1.PrdProv <= ?) AND (T1.PrdMesL <= ?) AND (T1.PrdNum <= ?) ORDER BY T1.EmprCod, T1.PrdNum, T1.PrdAnyo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               return;
            case 1 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setString(7, (String)parms[6], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 6);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 6);
               return;
      }
   }

}

