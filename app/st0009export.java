package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class st0009export extends GXProcedure
{
   public st0009export( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( st0009export.class ), "" );
   }

   public st0009export( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      st0009export.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      st0009export.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      st0009export.this.AV8ImpCod = aP1[0];
      this.aP1 = aP1;
      st0009export.this.AV9PPrd = aP2[0];
      this.aP2 = aP2;
      st0009export.this.AV10UPrd = aP3[0];
      this.aP3 = aP3;
      st0009export.this.aP4 = aP4;
      st0009export.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV22Lit2 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2001_", ""), (byte)(99), GXv_char2) ;
      st0009export.this.GXt_char1 = GXv_char2[0] ;
      AV22Lit2 = GXt_char1 ;
      GXt_char1 = AV28Lit8 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2487_", ""), (byte)(99), GXv_char2) ;
      st0009export.this.GXt_char1 = GXv_char2[0] ;
      AV28Lit8 = GXt_char1 ;
      GXt_char1 = AV29Lit9 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2488_", ""), (byte)(99), GXv_char2) ;
      st0009export.this.GXt_char1 = GXv_char2[0] ;
      AV29Lit9 = GXt_char1 ;
      GXt_char1 = AV30Lit10 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2489_", ""), (byte)(99), GXv_char2) ;
      st0009export.this.GXt_char1 = GXv_char2[0] ;
      AV30Lit10 = GXt_char1 ;
      GXt_char1 = AV31Lit11 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2490_", ""), (byte)(99), GXv_char2) ;
      st0009export.this.GXt_char1 = GXv_char2[0] ;
      AV31Lit11 = GXt_char1 ;
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
      GXv_char2[0] = A396EmprCod ;
      new app.pordstk(remoteHandle, context).execute( GXv_char2) ;
      st0009export.this.A396EmprCod = GXv_char2[0] ;
      AV13TotValInf = DecimalUtil.doubleToDec(0) ;
      AV17PorcTot = DecimalUtil.doubleToDec(0) ;
      AV19Flag = (byte)(1) ;
      AV14TotExi = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P08VJ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV9PPrd, AV10UPrd});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A719PrdNum = P08VJ2_A719PrdNum[0] ;
         A724PrdPreAct = P08VJ2_A724PrdPreAct[0] ;
         A704PrdExiAlm = P08VJ2_A704PrdExiAlm[0] ;
         A332DifValStk = P08VJ2_A332DifValStk[0] ;
         if ( ( A704PrdExiAlm.doubleValue() != 0 ) && ( (A704PrdExiAlm.multiply(A724PrdPreAct)).doubleValue() != 0 ) )
         {
            AV14TotExi = AV14TotExi.add((A704PrdExiAlm.multiply(A724PrdPreAct))) ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV48CellRow = 2 ;
      AV49FirstColumn = 1 ;
      /* Using cursor P08VJ3 */
      pr_default.execute(1, new Object[] {A396EmprCod, AV9PPrd, AV10UPrd});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A719PrdNum = P08VJ3_A719PrdNum[0] ;
         A724PrdPreAct = P08VJ3_A724PrdPreAct[0] ;
         A704PrdExiAlm = P08VJ3_A704PrdExiAlm[0] ;
         A4693PrdNum2 = P08VJ3_A4693PrdNum2[0] ;
         A718PrdNom = P08VJ3_A718PrdNom[0] ;
         A332DifValStk = P08VJ3_A332DifValStk[0] ;
         if ( ( A704PrdExiAlm.doubleValue() != 0 ) && ( (A704PrdExiAlm.multiply(A724PrdPreAct)).doubleValue() != 0 ) )
         {
            if ( AV19Flag == 3 )
            {
               AV19Flag = (byte)(4) ;
            }
            AV35PrdValstk = A704PrdExiAlm.multiply(A724PrdPreAct) ;
            AV15PorcSub = AV35PrdValstk.multiply(DecimalUtil.doubleToDec(100)).divide(AV14TotExi, 18, java.math.RoundingMode.DOWN) ;
            AV16PorcGrp = AV16PorcGrp.add(AV15PorcSub) ;
            AV17PorcTot = AV17PorcTot.add(AV15PorcSub) ;
            AV18TotGrp = AV18TotGrp.add(AV35PrdValstk) ;
            AV13TotValInf = AV13TotValInf.add(AV35PrdValstk) ;
            AV33TotExis = AV33TotExis.add(A704PrdExiAlm) ;
            AV34PrdExiAlm = A704PrdExiAlm ;
            AV35PrdValstk = A704PrdExiAlm.multiply(A724PrdPreAct) ;
            AV46ExcelDocument.Cells(AV48CellRow, 1, 1, 1).setText( A719PrdNum );
            AV46ExcelDocument.Cells(AV48CellRow, 2, 1, 1).setText( A4693PrdNum2 );
            AV46ExcelDocument.Cells(AV48CellRow, 3, 1, 1).setText( A718PrdNom );
            AV46ExcelDocument.Cells(AV48CellRow, 4, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV34PrdExiAlm)) );
            AV46ExcelDocument.Cells(AV48CellRow, 5, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV35PrdValstk)) );
            AV46ExcelDocument.Cells(AV48CellRow, 6, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV15PorcSub)) );
            if ( ( AV17PorcTot.doubleValue() >= 80 ) && ( AV19Flag == 1 ) )
            {
               AV48CellRow = (int)(AV48CellRow+1) ;
               AV46ExcelDocument.Cells(AV48CellRow, 3, 1, 1).setText( AV28Lit8 );
               AV46ExcelDocument.Cells(AV48CellRow, 4, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV33TotExis)) );
               AV46ExcelDocument.Cells(AV48CellRow, 5, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV18TotGrp)) );
               AV46ExcelDocument.Cells(AV48CellRow, 6, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV16PorcGrp)) );
               AV46ExcelDocument.Cells(AV48CellRow, 3, 1, 1).setBold( (short)(1) );
               AV46ExcelDocument.Cells(AV48CellRow, 4, 1, 1).setBold( (short)(1) );
               AV46ExcelDocument.Cells(AV48CellRow, 5, 1, 1).setBold( (short)(1) );
               AV46ExcelDocument.Cells(AV48CellRow, 6, 1, 1).setBold( (short)(1) );
               AV46ExcelDocument.Cells(AV48CellRow, 3, 1, 1).setColor( 11 );
               AV46ExcelDocument.Cells(AV48CellRow, 4, 1, 1).setColor( 11 );
               AV46ExcelDocument.Cells(AV48CellRow, 5, 1, 1).setColor( 11 );
               AV46ExcelDocument.Cells(AV48CellRow, 6, 1, 1).setColor( 11 );
               AV16PorcGrp = DecimalUtil.doubleToDec(0) ;
               AV18TotGrp = DecimalUtil.doubleToDec(0) ;
               AV33TotExis = DecimalUtil.doubleToDec(0) ;
               AV19Flag = (byte)(2) ;
            }
            if ( ( AV17PorcTot.doubleValue() >= 95 ) && ( AV19Flag == 2 ) && ( AV18TotGrp.doubleValue() != 0 ) )
            {
               AV48CellRow = (int)(AV48CellRow+1) ;
               AV46ExcelDocument.Cells(AV48CellRow, 3, 1, 1).setText( AV29Lit9 );
               AV46ExcelDocument.Cells(AV48CellRow, 4, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV33TotExis)) );
               AV46ExcelDocument.Cells(AV48CellRow, 5, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV18TotGrp)) );
               AV46ExcelDocument.Cells(AV48CellRow, 6, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV16PorcGrp)) );
               AV46ExcelDocument.Cells(AV48CellRow, 3, 1, 1).setBold( (short)(1) );
               AV46ExcelDocument.Cells(AV48CellRow, 4, 1, 1).setBold( (short)(1) );
               AV46ExcelDocument.Cells(AV48CellRow, 5, 1, 1).setBold( (short)(1) );
               AV46ExcelDocument.Cells(AV48CellRow, 6, 1, 1).setBold( (short)(1) );
               AV46ExcelDocument.Cells(AV48CellRow, 3, 1, 1).setColor( 11 );
               AV46ExcelDocument.Cells(AV48CellRow, 4, 1, 1).setColor( 11 );
               AV46ExcelDocument.Cells(AV48CellRow, 5, 1, 1).setColor( 11 );
               AV46ExcelDocument.Cells(AV48CellRow, 6, 1, 1).setColor( 11 );
               AV16PorcGrp = DecimalUtil.doubleToDec(0) ;
               AV18TotGrp = DecimalUtil.doubleToDec(0) ;
               AV33TotExis = DecimalUtil.doubleToDec(0) ;
               AV19Flag = (byte)(3) ;
            }
            AV48CellRow = (int)(AV48CellRow+1) ;
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
      if ( ( AV19Flag == 4 ) && ( AV18TotGrp.doubleValue() != 0 ) )
      {
         AV48CellRow = (int)(AV48CellRow+1) ;
         AV46ExcelDocument.Cells(AV48CellRow, 3, 1, 1).setText( AV30Lit10 );
         AV46ExcelDocument.Cells(AV48CellRow, 4, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV33TotExis)) );
         AV46ExcelDocument.Cells(AV48CellRow, 5, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV18TotGrp)) );
         AV46ExcelDocument.Cells(AV48CellRow, 6, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV16PorcGrp)) );
         AV46ExcelDocument.Cells(AV48CellRow, 3, 1, 1).setBold( (short)(1) );
         AV46ExcelDocument.Cells(AV48CellRow, 4, 1, 1).setBold( (short)(1) );
         AV46ExcelDocument.Cells(AV48CellRow, 5, 1, 1).setBold( (short)(1) );
         AV46ExcelDocument.Cells(AV48CellRow, 6, 1, 1).setBold( (short)(1) );
         AV46ExcelDocument.Cells(AV48CellRow, 3, 1, 1).setColor( 11 );
         AV46ExcelDocument.Cells(AV48CellRow, 4, 1, 1).setColor( 11 );
         AV46ExcelDocument.Cells(AV48CellRow, 5, 1, 1).setColor( 11 );
         AV46ExcelDocument.Cells(AV48CellRow, 6, 1, 1).setColor( 11 );
         AV16PorcGrp = DecimalUtil.doubleToDec(0) ;
         AV18TotGrp = DecimalUtil.doubleToDec(0) ;
         AV33TotExis = DecimalUtil.doubleToDec(0) ;
      }
      AV48CellRow = (int)(AV48CellRow+1) ;
      AV46ExcelDocument.Cells(AV48CellRow, 3, 1, 1).setText( AV31Lit11 );
      AV46ExcelDocument.Cells(AV48CellRow, 5, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV13TotValInf)) );
      AV46ExcelDocument.Cells(AV48CellRow, 6, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV17PorcTot)) );
      AV46ExcelDocument.Cells(AV48CellRow, 3, 1, 1).setBold( (short)(1) );
      AV46ExcelDocument.Cells(AV48CellRow, 5, 1, 1).setBold( (short)(1) );
      AV46ExcelDocument.Cells(AV48CellRow, 6, 1, 1).setBold( (short)(1) );
      AV46ExcelDocument.Cells(AV48CellRow, 3, 1, 1).setColor( 11 );
      AV46ExcelDocument.Cells(AV48CellRow, 5, 1, 1).setColor( 11 );
      AV46ExcelDocument.Cells(AV48CellRow, 6, 1, 1).setColor( 11 );
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
      AV44Random = (int)(GXutil.random( )*10000) ;
      AV45Filename = "ABC_Stocks_AlmacenExport-" + GXutil.trim( GXutil.str( AV44Random, 8, 0)) + ".xlsx" ;
      AV46ExcelDocument.Open(AV45Filename);
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV46ExcelDocument.Clear();
   }

   public void S121( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV46ExcelDocument.getErrCode() != 0 )
      {
         AV45Filename = "" ;
         AV47ErrorMessage = AV46ExcelDocument.getErrDescription() ;
         AV46ExcelDocument.Close();
         returnInSub = true;
         if (true) return;
      }
   }

   public void S131( )
   {
      /* 'CLOSEDOCUMENT' Routine */
      returnInSub = false ;
      AV46ExcelDocument.Save();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV46ExcelDocument.Close();
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV46ExcelDocument.Cells(1, 1, 1, 1).setText( httpContext.getMessage( "Producto", "") );
      AV46ExcelDocument.Cells(1, 2, 1, 1).setText( httpContext.getMessage( "Producto Ext.", "") );
      AV46ExcelDocument.Cells(1, 3, 1, 1).setText( httpContext.getMessage( "Descripcion.", "") );
      AV46ExcelDocument.Cells(1, 4, 1, 1).setText( httpContext.getMessage( "Existencias Almacen", "") );
      AV46ExcelDocument.Cells(1, 5, 1, 1).setText( httpContext.getMessage( "Valor", "") );
      AV46ExcelDocument.Cells(1, 6, 1, 1).setText( "%" );
      AV46ExcelDocument.Cells(1, 1, 1, 1).setBold( (short)(1) );
      AV46ExcelDocument.Cells(1, 2, 1, 1).setBold( (short)(1) );
      AV46ExcelDocument.Cells(1, 3, 1, 1).setBold( (short)(1) );
      AV46ExcelDocument.Cells(1, 4, 1, 1).setBold( (short)(1) );
      AV46ExcelDocument.Cells(1, 5, 1, 1).setBold( (short)(1) );
      AV46ExcelDocument.Cells(1, 6, 1, 1).setBold( (short)(1) );
      AV46ExcelDocument.Cells(1, 1, 1, 1).setColor( 11 );
      AV46ExcelDocument.Cells(1, 2, 1, 1).setColor( 11 );
      AV46ExcelDocument.Cells(1, 3, 1, 1).setColor( 11 );
      AV46ExcelDocument.Cells(1, 4, 1, 1).setColor( 11 );
      AV46ExcelDocument.Cells(1, 5, 1, 1).setColor( 11 );
      AV46ExcelDocument.Cells(1, 6, 1, 1).setColor( 11 );
   }

   protected void cleanup( )
   {
      this.aP0[0] = st0009export.this.A396EmprCod;
      this.aP1[0] = st0009export.this.AV8ImpCod;
      this.aP2[0] = st0009export.this.AV9PPrd;
      this.aP3[0] = st0009export.this.AV10UPrd;
      this.aP4[0] = st0009export.this.AV45Filename;
      this.aP5[0] = st0009export.this.AV47ErrorMessage;
      CloseOpenCursors();
      AV46ExcelDocument.cleanup();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV45Filename = "" ;
      AV47ErrorMessage = "" ;
      AV22Lit2 = "" ;
      AV28Lit8 = "" ;
      AV29Lit9 = "" ;
      AV30Lit10 = "" ;
      AV31Lit11 = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV13TotValInf = DecimalUtil.ZERO ;
      AV17PorcTot = DecimalUtil.ZERO ;
      AV14TotExi = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P08VJ2_A396EmprCod = new String[] {""} ;
      P08VJ2_A719PrdNum = new String[] {""} ;
      P08VJ2_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08VJ2_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08VJ2_A332DifValStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A719PrdNum = "" ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A332DifValStk = DecimalUtil.ZERO ;
      P08VJ3_A396EmprCod = new String[] {""} ;
      P08VJ3_A719PrdNum = new String[] {""} ;
      P08VJ3_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08VJ3_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08VJ3_A4693PrdNum2 = new String[] {""} ;
      P08VJ3_A718PrdNom = new String[] {""} ;
      P08VJ3_A332DifValStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A4693PrdNum2 = "" ;
      A718PrdNom = "" ;
      AV35PrdValstk = DecimalUtil.ZERO ;
      AV15PorcSub = DecimalUtil.ZERO ;
      AV16PorcGrp = DecimalUtil.ZERO ;
      AV18TotGrp = DecimalUtil.ZERO ;
      AV33TotExis = DecimalUtil.ZERO ;
      AV34PrdExiAlm = DecimalUtil.ZERO ;
      AV46ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.st0009export__default(),
         new Object[] {
             new Object[] {
            P08VJ2_A396EmprCod, P08VJ2_A719PrdNum, P08VJ2_A724PrdPreAct, P08VJ2_A704PrdExiAlm, P08VJ2_A332DifValStk
            }
            , new Object[] {
            P08VJ3_A396EmprCod, P08VJ3_A719PrdNum, P08VJ3_A724PrdPreAct, P08VJ3_A704PrdExiAlm, P08VJ3_A4693PrdNum2, P08VJ3_A718PrdNom, P08VJ3_A332DifValStk
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV19Flag ;
   private short Gx_err ;
   private int AV48CellRow ;
   private int AV49FirstColumn ;
   private int AV44Random ;
   private java.math.BigDecimal AV13TotValInf ;
   private java.math.BigDecimal AV17PorcTot ;
   private java.math.BigDecimal AV14TotExi ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A332DifValStk ;
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
   private String AV22Lit2 ;
   private String AV28Lit8 ;
   private String AV29Lit9 ;
   private String AV30Lit10 ;
   private String AV31Lit11 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A4693PrdNum2 ;
   private String A718PrdNom ;
   private boolean returnInSub ;
   private String AV45Filename ;
   private String AV47ErrorMessage ;
   private String[] aP5 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08VJ2_A396EmprCod ;
   private String[] P08VJ2_A719PrdNum ;
   private java.math.BigDecimal[] P08VJ2_A724PrdPreAct ;
   private java.math.BigDecimal[] P08VJ2_A704PrdExiAlm ;
   private java.math.BigDecimal[] P08VJ2_A332DifValStk ;
   private String[] P08VJ3_A396EmprCod ;
   private String[] P08VJ3_A719PrdNum ;
   private java.math.BigDecimal[] P08VJ3_A724PrdPreAct ;
   private java.math.BigDecimal[] P08VJ3_A704PrdExiAlm ;
   private String[] P08VJ3_A4693PrdNum2 ;
   private String[] P08VJ3_A718PrdNom ;
   private java.math.BigDecimal[] P08VJ3_A332DifValStk ;
   private com.genexus.gxoffice.ExcelDoc AV46ExcelDocument ;
}

final  class st0009export__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08VJ2", "SELECT EmprCod, PrdNum, PrdPreAct, PrdExiAlm, DifValStk FROM TXPPRODUC WHERE (EmprCod = ?) AND (PrdNum >= ? and PrdNum <= ?) ORDER BY DifValStk ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08VJ3", "SELECT EmprCod, PrdNum, PrdPreAct, PrdExiAlm, PrdNum2, PrdNom, DifValStk FROM TXPPRODUC WHERE (EmprCod = ?) AND (PrdNum >= ? and PrdNum <= ?) ORDER BY DifValStk ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
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

