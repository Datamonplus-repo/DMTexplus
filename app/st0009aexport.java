package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class st0009aexport extends GXProcedure
{
   public st0009aexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( st0009aexport.class ), "" );
   }

   public st0009aexport( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             byte[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 )
   {
      st0009aexport.this.aP7 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        byte[] aP4 ,
                        byte[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             byte[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 )
   {
      st0009aexport.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      st0009aexport.this.AV8ImpCod = aP1[0];
      this.aP1 = aP1;
      st0009aexport.this.AV9PPrd = aP2[0];
      this.aP2 = aP2;
      st0009aexport.this.AV10UPrd = aP3[0];
      this.aP3 = aP3;
      st0009aexport.this.AV41CC = aP4[0];
      this.aP4 = aP4;
      st0009aexport.this.AV44xls = aP5[0];
      this.aP5 = aP5;
      st0009aexport.this.aP6 = aP6;
      st0009aexport.this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV32FlagPreMed = (byte)(1) ;
      GXv_char1[0] = A396EmprCod ;
      GXv_int2[0] = AV32FlagPreMed ;
      GXv_int3[0] = AV41CC ;
      new app.pordstk1(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3) ;
      st0009aexport.this.A396EmprCod = GXv_char1[0] ;
      st0009aexport.this.AV32FlagPreMed = GXv_int2[0] ;
      st0009aexport.this.AV41CC = GXv_int3[0] ;
      /* Execute user subroutine: 'OPENDOCUMENT' */
      S111 ();
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
      AV13TotValInf = DecimalUtil.doubleToDec(0) ;
      AV17PorcTot = DecimalUtil.doubleToDec(0) ;
      AV19Flag = (byte)(1) ;
      AV14TotExi = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P08VK2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV9PPrd, AV10UPrd});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A719PrdNum = P08VK2_A719PrdNum[0] ;
         A724PrdPreAct = P08VK2_A724PrdPreAct[0] ;
         A726PrdPreMed = P08VK2_A726PrdPreMed[0] ;
         A704PrdExiAlm = P08VK2_A704PrdExiAlm[0] ;
         A705PrdExiCC = P08VK2_A705PrdExiCC[0] ;
         A332DifValStk = P08VK2_A332DifValStk[0] ;
         AV37PrdPre = ((AV32FlagPreMed==1) ? A726PrdPreMed : A724PrdPreAct) ;
         AV42PrdExi = ((AV41CC==1) ? A705PrdExiCC : A704PrdExiAlm) ;
         if ( ( AV42PrdExi.doubleValue() != 0 ) && ( (A705PrdExiCC.multiply(AV37PrdPre)).doubleValue() != 0 ) )
         {
            AV14TotExi = AV14TotExi.add(((AV42PrdExi.multiply(AV37PrdPre)))) ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV60CellRow = 2 ;
      /* Using cursor P08VK3 */
      pr_default.execute(1, new Object[] {A396EmprCod, AV9PPrd, AV10UPrd});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A719PrdNum = P08VK3_A719PrdNum[0] ;
         A724PrdPreAct = P08VK3_A724PrdPreAct[0] ;
         A726PrdPreMed = P08VK3_A726PrdPreMed[0] ;
         A704PrdExiAlm = P08VK3_A704PrdExiAlm[0] ;
         A705PrdExiCC = P08VK3_A705PrdExiCC[0] ;
         A718PrdNom = P08VK3_A718PrdNom[0] ;
         A332DifValStk = P08VK3_A332DifValStk[0] ;
         AV37PrdPre = ((AV32FlagPreMed==1) ? A726PrdPreMed : A724PrdPreAct) ;
         AV42PrdExi = ((AV41CC==1) ? A705PrdExiCC : A704PrdExiAlm) ;
         if ( ( AV42PrdExi.doubleValue() != 0 ) && ( (AV42PrdExi.multiply(AV37PrdPre)).doubleValue() != 0 ) )
         {
            AV19Flag = (byte)(((AV19Flag==3) ? 4 : AV19Flag)) ;
            AV35PrdValstk = AV42PrdExi.multiply(AV37PrdPre) ;
            AV15PorcSub = ((AV14TotExi.doubleValue()>0) ? AV35PrdValstk.multiply(DecimalUtil.doubleToDec(100)).divide(AV14TotExi, 18, java.math.RoundingMode.DOWN) : DecimalUtil.doubleToDec(0)) ;
            AV16PorcGrp = AV16PorcGrp.add(AV15PorcSub) ;
            AV17PorcTot = AV17PorcTot.add(AV15PorcSub) ;
            AV18TotGrp = AV18TotGrp.add(AV35PrdValstk) ;
            AV13TotValInf = AV13TotValInf.add(AV35PrdValstk) ;
            AV33TotExis = AV33TotExis.add(AV42PrdExi) ;
            AV34PrdExiAlm = AV42PrdExi ;
            AV56ExcelDocument.Cells(AV60CellRow, 1, 1, 1).setText( A719PrdNum );
            AV56ExcelDocument.Cells(AV60CellRow, 2, 1, 1).setText( A718PrdNom );
            AV56ExcelDocument.Cells(AV60CellRow, 3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV34PrdExiAlm)) );
            AV56ExcelDocument.Cells(AV60CellRow, 4, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV37PrdPre)) );
            AV56ExcelDocument.Cells(AV60CellRow, 5, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV35PrdValstk)) );
            AV56ExcelDocument.Cells(AV60CellRow, 6, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV15PorcSub)) );
            if ( ( AV17PorcTot.doubleValue() >= 80 ) && ( AV19Flag == 1 ) )
            {
               AV60CellRow = (int)(AV60CellRow+1) ;
               AV56ExcelDocument.Cells(AV60CellRow, 2, 1, 1).setText( AV28Lit8 );
               AV56ExcelDocument.Cells(AV60CellRow, 3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV33TotExis)) );
               AV56ExcelDocument.Cells(AV60CellRow, 5, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV18TotGrp)) );
               AV56ExcelDocument.Cells(AV60CellRow, 6, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV16PorcGrp)) );
               AV56ExcelDocument.Cells(AV60CellRow, 2, 1, 1).setBold( (short)(1) );
               AV56ExcelDocument.Cells(AV60CellRow, 3, 1, 1).setBold( (short)(1) );
               AV56ExcelDocument.Cells(AV60CellRow, 5, 1, 1).setBold( (short)(1) );
               AV56ExcelDocument.Cells(AV60CellRow, 6, 1, 1).setBold( (short)(1) );
               AV56ExcelDocument.Cells(AV60CellRow, 2, 1, 1).setColor( 11 );
               AV56ExcelDocument.Cells(AV60CellRow, 3, 1, 1).setColor( 11 );
               AV56ExcelDocument.Cells(AV60CellRow, 5, 1, 1).setColor( 11 );
               AV56ExcelDocument.Cells(AV60CellRow, 6, 1, 1).setColor( 11 );
               AV16PorcGrp = DecimalUtil.doubleToDec(0) ;
               AV18TotGrp = DecimalUtil.doubleToDec(0) ;
               AV33TotExis = DecimalUtil.doubleToDec(0) ;
               AV19Flag = (byte)(2) ;
            }
            if ( ( AV17PorcTot.doubleValue() >= 95 ) && ( AV19Flag == 2 ) && ( AV18TotGrp.doubleValue() != 0 ) )
            {
               AV60CellRow = (int)(AV60CellRow+1) ;
               AV56ExcelDocument.Cells(AV60CellRow, 2, 1, 1).setText( AV29Lit9 );
               AV56ExcelDocument.Cells(AV60CellRow, 3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV33TotExis)) );
               AV56ExcelDocument.Cells(AV60CellRow, 5, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV18TotGrp)) );
               AV56ExcelDocument.Cells(AV60CellRow, 6, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV16PorcGrp)) );
               AV56ExcelDocument.Cells(AV60CellRow, 2, 1, 1).setBold( (short)(1) );
               AV56ExcelDocument.Cells(AV60CellRow, 3, 1, 1).setBold( (short)(1) );
               AV56ExcelDocument.Cells(AV60CellRow, 5, 1, 1).setBold( (short)(1) );
               AV56ExcelDocument.Cells(AV60CellRow, 6, 1, 1).setBold( (short)(1) );
               AV56ExcelDocument.Cells(AV60CellRow, 2, 1, 1).setColor( 11 );
               AV56ExcelDocument.Cells(AV60CellRow, 3, 1, 1).setColor( 11 );
               AV56ExcelDocument.Cells(AV60CellRow, 5, 1, 1).setColor( 11 );
               AV56ExcelDocument.Cells(AV60CellRow, 6, 1, 1).setColor( 11 );
               AV16PorcGrp = DecimalUtil.doubleToDec(0) ;
               AV18TotGrp = DecimalUtil.doubleToDec(0) ;
               AV33TotExis = DecimalUtil.doubleToDec(0) ;
               AV19Flag = (byte)(3) ;
            }
            AV60CellRow = (int)(AV60CellRow+1) ;
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
      if ( ( AV19Flag == 4 ) && ( AV18TotGrp.doubleValue() != 0 ) )
      {
         AV60CellRow = (int)(AV60CellRow+1) ;
         AV56ExcelDocument.Cells(AV60CellRow, 2, 1, 1).setText( AV30Lit10 );
         AV56ExcelDocument.Cells(AV60CellRow, 3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV33TotExis)) );
         AV56ExcelDocument.Cells(AV60CellRow, 5, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV18TotGrp)) );
         AV56ExcelDocument.Cells(AV60CellRow, 6, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV16PorcGrp)) );
         AV56ExcelDocument.Cells(AV60CellRow, 2, 1, 1).setBold( (short)(1) );
         AV56ExcelDocument.Cells(AV60CellRow, 3, 1, 1).setBold( (short)(1) );
         AV56ExcelDocument.Cells(AV60CellRow, 5, 1, 1).setBold( (short)(1) );
         AV56ExcelDocument.Cells(AV60CellRow, 6, 1, 1).setBold( (short)(1) );
         AV56ExcelDocument.Cells(AV60CellRow, 2, 1, 1).setColor( 11 );
         AV56ExcelDocument.Cells(AV60CellRow, 3, 1, 1).setColor( 11 );
         AV56ExcelDocument.Cells(AV60CellRow, 5, 1, 1).setColor( 11 );
         AV56ExcelDocument.Cells(AV60CellRow, 6, 1, 1).setColor( 11 );
         AV16PorcGrp = DecimalUtil.doubleToDec(0) ;
         AV18TotGrp = DecimalUtil.doubleToDec(0) ;
         AV33TotExis = DecimalUtil.doubleToDec(0) ;
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
      /* 'OPENDOCUMENT' Routine */
      returnInSub = false ;
      AV59Random = (int)(GXutil.random( )*10000) ;
      AV57Filename = "ABC_Stocks_Almacen_PrecioMedioExport-" + GXutil.trim( GXutil.str( AV59Random, 8, 0)) + ".xlsx" ;
      AV56ExcelDocument.Open(AV57Filename);
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV56ExcelDocument.Clear();
   }

   public void S121( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV56ExcelDocument.getErrCode() != 0 )
      {
         AV57Filename = "" ;
         AV58ErrorMessage = AV56ExcelDocument.getErrDescription() ;
         AV56ExcelDocument.Close();
         returnInSub = true;
         if (true) return;
      }
   }

   public void S131( )
   {
      /* 'CLOSEDOCUMENT' Routine */
      returnInSub = false ;
      AV56ExcelDocument.Save();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV56ExcelDocument.Close();
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV56ExcelDocument.Cells(1, 1, 1, 1).setText( httpContext.getMessage( "Producto", "") );
      AV56ExcelDocument.Cells(1, 2, 1, 1).setText( httpContext.getMessage( "Descripcion", "") );
      AV56ExcelDocument.Cells(1, 3, 1, 1).setText( httpContext.getMessage( "Existencias Almacen", "") );
      AV56ExcelDocument.Cells(1, 4, 1, 1).setText( httpContext.getMessage( "Precio", "") );
      AV56ExcelDocument.Cells(1, 5, 1, 1).setText( httpContext.getMessage( "Valor", "") );
      AV56ExcelDocument.Cells(1, 6, 1, 1).setText( "%" );
      AV56ExcelDocument.Cells(1, 1, 1, 1).setBold( (short)(1) );
      AV56ExcelDocument.Cells(1, 2, 1, 1).setBold( (short)(1) );
      AV56ExcelDocument.Cells(1, 3, 1, 1).setBold( (short)(1) );
      AV56ExcelDocument.Cells(1, 4, 1, 1).setBold( (short)(1) );
      AV56ExcelDocument.Cells(1, 5, 1, 1).setBold( (short)(1) );
      AV56ExcelDocument.Cells(1, 6, 1, 1).setBold( (short)(1) );
      AV56ExcelDocument.Cells(1, 1, 1, 1).setColor( 11 );
      AV56ExcelDocument.Cells(1, 2, 1, 1).setColor( 11 );
      AV56ExcelDocument.Cells(1, 3, 1, 1).setColor( 11 );
      AV56ExcelDocument.Cells(1, 4, 1, 1).setColor( 11 );
      AV56ExcelDocument.Cells(1, 5, 1, 1).setColor( 11 );
      AV56ExcelDocument.Cells(1, 6, 1, 1).setColor( 11 );
   }

   protected void cleanup( )
   {
      this.aP0[0] = st0009aexport.this.A396EmprCod;
      this.aP1[0] = st0009aexport.this.AV8ImpCod;
      this.aP2[0] = st0009aexport.this.AV9PPrd;
      this.aP3[0] = st0009aexport.this.AV10UPrd;
      this.aP4[0] = st0009aexport.this.AV41CC;
      this.aP5[0] = st0009aexport.this.AV44xls;
      this.aP6[0] = st0009aexport.this.AV57Filename;
      this.aP7[0] = st0009aexport.this.AV58ErrorMessage;
      CloseOpenCursors();
      AV56ExcelDocument.cleanup();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV57Filename = "" ;
      AV58ErrorMessage = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new byte[1] ;
      GXv_int3 = new byte[1] ;
      AV13TotValInf = DecimalUtil.ZERO ;
      AV17PorcTot = DecimalUtil.ZERO ;
      AV14TotExi = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P08VK2_A396EmprCod = new String[] {""} ;
      P08VK2_A719PrdNum = new String[] {""} ;
      P08VK2_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08VK2_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08VK2_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08VK2_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08VK2_A332DifValStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A719PrdNum = "" ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A726PrdPreMed = DecimalUtil.ZERO ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A705PrdExiCC = DecimalUtil.ZERO ;
      A332DifValStk = DecimalUtil.ZERO ;
      AV37PrdPre = DecimalUtil.ZERO ;
      AV42PrdExi = DecimalUtil.ZERO ;
      P08VK3_A396EmprCod = new String[] {""} ;
      P08VK3_A719PrdNum = new String[] {""} ;
      P08VK3_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08VK3_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08VK3_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08VK3_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08VK3_A718PrdNom = new String[] {""} ;
      P08VK3_A332DifValStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A718PrdNom = "" ;
      AV35PrdValstk = DecimalUtil.ZERO ;
      AV15PorcSub = DecimalUtil.ZERO ;
      AV16PorcGrp = DecimalUtil.ZERO ;
      AV18TotGrp = DecimalUtil.ZERO ;
      AV33TotExis = DecimalUtil.ZERO ;
      AV34PrdExiAlm = DecimalUtil.ZERO ;
      AV56ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      AV28Lit8 = "" ;
      AV29Lit9 = "" ;
      AV30Lit10 = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.st0009aexport__default(),
         new Object[] {
             new Object[] {
            P08VK2_A396EmprCod, P08VK2_A719PrdNum, P08VK2_A724PrdPreAct, P08VK2_A726PrdPreMed, P08VK2_A704PrdExiAlm, P08VK2_A705PrdExiCC, P08VK2_A332DifValStk
            }
            , new Object[] {
            P08VK3_A396EmprCod, P08VK3_A719PrdNum, P08VK3_A724PrdPreAct, P08VK3_A726PrdPreMed, P08VK3_A704PrdExiAlm, P08VK3_A705PrdExiCC, P08VK3_A718PrdNom, P08VK3_A332DifValStk
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV41CC ;
   private byte AV44xls ;
   private byte AV32FlagPreMed ;
   private byte GXv_int2[] ;
   private byte GXv_int3[] ;
   private byte AV19Flag ;
   private short Gx_err ;
   private int AV60CellRow ;
   private int AV59Random ;
   private java.math.BigDecimal AV13TotValInf ;
   private java.math.BigDecimal AV17PorcTot ;
   private java.math.BigDecimal AV14TotExi ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A726PrdPreMed ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A705PrdExiCC ;
   private java.math.BigDecimal A332DifValStk ;
   private java.math.BigDecimal AV37PrdPre ;
   private java.math.BigDecimal AV42PrdExi ;
   private java.math.BigDecimal AV35PrdValstk ;
   private java.math.BigDecimal AV15PorcSub ;
   private java.math.BigDecimal AV16PorcGrp ;
   private java.math.BigDecimal AV18TotGrp ;
   private java.math.BigDecimal AV33TotExis ;
   private java.math.BigDecimal AV34PrdExiAlm ;
   private String A396EmprCod ;
   private String AV8ImpCod ;
   private String AV9PPrd ;
   private String AV10UPrd ;
   private String GXv_char1[] ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String AV28Lit8 ;
   private String AV29Lit9 ;
   private String AV30Lit10 ;
   private boolean returnInSub ;
   private String AV57Filename ;
   private String AV58ErrorMessage ;
   private String[] aP7 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private byte[] aP4 ;
   private byte[] aP5 ;
   private String[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P08VK2_A396EmprCod ;
   private String[] P08VK2_A719PrdNum ;
   private java.math.BigDecimal[] P08VK2_A724PrdPreAct ;
   private java.math.BigDecimal[] P08VK2_A726PrdPreMed ;
   private java.math.BigDecimal[] P08VK2_A704PrdExiAlm ;
   private java.math.BigDecimal[] P08VK2_A705PrdExiCC ;
   private java.math.BigDecimal[] P08VK2_A332DifValStk ;
   private String[] P08VK3_A396EmprCod ;
   private String[] P08VK3_A719PrdNum ;
   private java.math.BigDecimal[] P08VK3_A724PrdPreAct ;
   private java.math.BigDecimal[] P08VK3_A726PrdPreMed ;
   private java.math.BigDecimal[] P08VK3_A704PrdExiAlm ;
   private java.math.BigDecimal[] P08VK3_A705PrdExiCC ;
   private String[] P08VK3_A718PrdNom ;
   private java.math.BigDecimal[] P08VK3_A332DifValStk ;
   private com.genexus.gxoffice.ExcelDoc AV56ExcelDocument ;
}

final  class st0009aexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08VK2", "SELECT EmprCod, PrdNum, PrdPreAct, PrdPreMed, PrdExiAlm, PrdExiCC, DifValStk FROM TXPPRODUC WHERE (EmprCod = ?) AND (PrdNum >= ? and PrdNum <= ?) ORDER BY DifValStk ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08VK3", "SELECT EmprCod, PrdNum, PrdPreAct, PrdPreMed, PrdExiAlm, PrdExiCC, PrdNom, DifValStk FROM TXPPRODUC WHERE (EmprCod = ?) AND (PrdNum >= ? and PrdNum <= ?) ORDER BY DifValStk ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
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
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 6);
               return;
      }
   }

}

