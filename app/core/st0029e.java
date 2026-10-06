package app.core ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class st0029e extends GXProcedure
{
   public st0029e( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( st0029e.class ), "" );
   }

   public st0029e( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             java.util.Date[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      st0029e.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        java.util.Date[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             java.util.Date[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 )
   {
      st0029e.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      st0029e.this.AV15ImpCod = aP1[0];
      this.aP1 = aP1;
      st0029e.this.AV16UFecha = aP2[0];
      this.aP2 = aP2;
      st0029e.this.AV86Prdnum1 = aP3[0];
      this.aP3 = aP3;
      st0029e.this.AV87Prdnum2 = aP4[0];
      this.aP4 = aP4;
      st0029e.this.AV75Archivo = aP5[0];
      this.aP5 = aP5;
      st0029e.this.AV85desvios = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV66FlagDifN = (byte)(0) ;
      GXv_int1[0] = AV66FlagDifN ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "DIFNEG", ""), GXv_int1) ;
      st0029e.this.AV66FlagDifN = GXv_int1[0] ;
      AV67FlagPreMed = (byte)(0) ;
      GXv_int1[0] = AV67FlagPreMed ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PREMED", ""), GXv_int1) ;
      st0029e.this.AV67FlagPreMed = GXv_int1[0] ;
      GXt_char2 = AV29Lit0 ;
      GXv_char3[0] = GXt_char2 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2250_", ""), (byte)(99), GXv_char3) ;
      st0029e.this.GXt_char2 = GXv_char3[0] ;
      AV29Lit0 = GXt_char2 ;
      /* Using cursor P071U2 */
      pr_default.execute(0, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A407EmprNom = P071U2_A407EmprNom[0] ;
         n407EmprNom = P071U2_n407EmprNom[0] ;
         AV20NomEmp = A407EmprNom ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P071U3 */
      pr_default.execute(1, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A810RecFec = P071U3_A810RecFec[0] ;
         A719PrdNum = P071U3_A719PrdNum[0] ;
         if ( GXutil.resetTime(A810RecFec).before( GXutil.resetTime( AV16UFecha )) )
         {
            AV78Pfecha = A810RecFec ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
      /* Execute user subroutine: 'OPENDOCUMENT' */
      S131 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV71Fila = 1 ;
      AV72Columna = (byte)(1) ;
      /* Execute user subroutine: 'WRITECOLUMNTITLES' */
      S161 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV58ValAlmCol = DecimalUtil.ZERO ;
      AV57ValAlmTot = DecimalUtil.ZERO ;
      AV59ValCCCol = DecimalUtil.ZERO ;
      AV60ValCCTot = DecimalUtil.ZERO ;
      AV71Fila = 3 ;
      AV72Columna = (byte)(1) ;
      /* Using cursor P071U4 */
      pr_default.execute(2, new Object[] {A396EmprCod, AV16UFecha, AV86Prdnum1, AV87Prdnum2});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A719PrdNum = P071U4_A719PrdNum[0] ;
         A810RecFec = P071U4_A810RecFec[0] ;
         A807RecExiRea = P071U4_A807RecExiRea[0] ;
         A809RecExiTeo = P071U4_A809RecExiTeo[0] ;
         A724PrdPreAct = P071U4_A724PrdPreAct[0] ;
         A726PrdPreMed = P071U4_A726PrdPreMed[0] ;
         A3915EmpNumDec = P071U4_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P071U4_n3915EmpNumDec[0] ;
         A6573RecPreRec = P071U4_A6573RecPreRec[0] ;
         A718PrdNom = P071U4_A718PrdNom[0] ;
         A3915EmpNumDec = P071U4_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P071U4_n3915EmpNumDec[0] ;
         A724PrdPreAct = P071U4_A724PrdPreAct[0] ;
         A726PrdPreMed = P071U4_A726PrdPreMed[0] ;
         A718PrdNom = P071U4_A718PrdNom[0] ;
         AV80PrdNum = A719PrdNum ;
         AV21DifAlm = A809RecExiTeo.subtract(A807RecExiRea) ;
         if ( ( AV21DifAlm.doubleValue() < 0 ) && (0==AV66FlagDifN) )
         {
            AV26DifAlm2 = AV21DifAlm.negate() ;
         }
         else
         {
            AV26DifAlm2 = AV21DifAlm ;
         }
         if ( A809RecExiTeo.doubleValue() != 0 )
         {
            AV22DifAlmPor = AV26DifAlm2.multiply(DecimalUtil.doubleToDec(100)).divide(A809RecExiTeo, 18, java.math.RoundingMode.DOWN) ;
         }
         else
         {
            AV22DifAlmPor = DecimalUtil.doubleToDec(0) ;
         }
         AV68PreProd = A724PrdPreAct ;
         if ( AV67FlagPreMed == 1 )
         {
            AV68PreProd = A726PrdPreMed ;
         }
         if ( A3915EmpNumDec == 0 )
         {
            AV27ValAlm = GXutil.roundDecimal( AV26DifAlm2.multiply(AV68PreProd), 1) ;
         }
         else
         {
            if ( A3915EmpNumDec == 2 )
            {
               AV27ValAlm = GXutil.roundDecimal( AV26DifAlm2.multiply(AV68PreProd), 2) ;
            }
         }
         if ( ( GXutil.strcmp(AV61TipCol, GXutil.substring( A719PrdNum, 1, 1)) != 0 ) && ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "8") == 0 ) && ! (GXutil.strcmp("", AV61TipCol)==0) )
         {
            /* Execute user subroutine: 'TOTAL' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(2);
               pr_default.close(2);
               pr_default.close(2);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         if ( ( A807RecExiRea.doubleValue() != 0 ) && ( A809RecExiTeo.doubleValue() != 0 ) )
         {
            AV95RecExiTeo = GXutil.str( A809RecExiTeo, 12, 4) ;
            AV96RecExiRea = GXutil.str( A807RecExiRea, 12, 4) ;
            AV97RecPreRec = GXutil.str( A6573RecPreRec, 14, 5) ;
            AV98ValAlmT = GXutil.str( AV27ValAlm, 12, 2) ;
            AV99DifAlmT = GXutil.str( AV21DifAlm, 12, 4) ;
            AV100DifAlmPorT = GXutil.str( AV22DifAlmPor, 7, 2) ;
            AV101DesvioMonT = GXutil.str( AV84DesvioMon, 12, 2) ;
            AV102EntUnientT = GXutil.str( AV79EntUnient, 9, 2) ;
            AV103PorCompT = GXutil.str( AV81PorComp, 6, 2) ;
            AV71Fila = (int)(AV71Fila+1) ;
            AV88ExcelDocument.Cells(AV71Fila, 1, 1, 1).setText( A719PrdNum );
            AV88ExcelDocument.Cells(AV71Fila, 2, 1, 1).setText( A718PrdNom );
            AV88ExcelDocument.Cells(AV71Fila, 3, 1, 1).setText( AV95RecExiTeo );
            AV88ExcelDocument.Cells(AV71Fila, 4, 1, 1).setText( AV96RecExiRea );
            AV88ExcelDocument.Cells(AV71Fila, 5, 1, 1).setText( AV97RecPreRec );
            AV88ExcelDocument.Cells(AV71Fila, 6, 1, 1).setText( AV98ValAlmT );
            AV88ExcelDocument.Cells(AV71Fila, 7, 1, 1).setText( AV99DifAlmT );
            AV88ExcelDocument.Cells(AV71Fila, 8, 1, 1).setText( AV100DifAlmPorT );
            AV88ExcelDocument.Cells(AV71Fila, 9, 1, 1).setText( AV101DesvioMonT );
            AV88ExcelDocument.Cells(AV71Fila, 10, 1, 1).setText( AV102EntUnientT );
            AV88ExcelDocument.Cells(AV71Fila, 11, 1, 1).setText( AV103PorCompT );
            GXt_dtime4 = GXutil.resetTime( AV83FecIni );
            AV88ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV88ExcelDocument.Cells(AV71Fila, 12, 1, 1).setDate( GXt_dtime4 );
            /* Execute user subroutine: 'ENTALM' */
            S121 ();
            if ( returnInSub )
            {
               pr_default.close(2);
               pr_default.close(2);
               pr_default.close(2);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         AV58ValAlmCol = AV58ValAlmCol.add(AV27ValAlm) ;
         AV57ValAlmTot = AV57ValAlmTot.add(AV27ValAlm) ;
         AV61TipCol = GXutil.substring( A719PrdNum, 1, 1) ;
         pr_default.readNext(2);
      }
      pr_default.close(2);
      /* Execute user subroutine: 'TOTAL' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      httpContext.GX_msglist.addItem(httpContext.getMessage( "Processo Realizado..", ""));
      /* Execute user subroutine: 'CLOSEDOCUMENT' */
      S151 ();
      if ( returnInSub )
      {
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'TOTAL' Routine */
      returnInSub = false ;
      AV71Fila = (int)(AV71Fila+2) ;
      AV72Columna = (byte)(6) ;
      AV88ExcelDocument.Cells(AV71Fila, 6, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV58ValAlmCol)) );
      AV71Fila = (int)(AV71Fila+1) ;
      AV72Columna = (byte)(AV72Columna+1) ;
      AV77Msg_b = "" ;
      AV88ExcelDocument.Cells(AV71Fila, 6, 1, 1).setText( AV77Msg_b );
      AV72Columna = (byte)(AV72Columna+1) ;
      AV58ValAlmCol = DecimalUtil.doubleToDec(0) ;
      AV59ValCCCol = DecimalUtil.doubleToDec(0) ;
   }

   public void S121( )
   {
      /* 'ENTALM' Routine */
      returnInSub = false ;
      GXv_decimal5[0] = AV79EntUnient ;
      new app.pcalexi(remoteHandle, context).execute( A396EmprCod, AV80PrdNum, AV83FecIni, AV78Pfecha, AV16UFecha, GXv_decimal5) ;
      st0029e.this.AV79EntUnient = GXv_decimal5[0] ;
   }

   public void S131( )
   {
      /* 'OPENDOCUMENT' Routine */
      returnInSub = false ;
      AV94Random = (short)(GXutil.random( )*10000) ;
      AV91Filename = httpContext.getMessage( "C:\\Informes_Acatex\\Diferencias Recuento-", "") + GXutil.trim( GXutil.str( AV94Random, 4, 0)) + ".xlsx" ;
      AV88ExcelDocument.Open(AV91Filename);
      /* Execute user subroutine: 'CHECKSTATUS' */
      S141 ();
      if (returnInSub) return;
      AV88ExcelDocument.Clear();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S141 ();
      if (returnInSub) return;
   }

   public void S141( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV88ExcelDocument.getErrCode() != 0 )
      {
         AV91Filename = "" ;
         AV90ErrorMessage = AV88ExcelDocument.getErrDescription() ;
         AV88ExcelDocument.Close();
         returnInSub = true;
         if (true) return;
      }
   }

   public void S151( )
   {
      /* 'CLOSEDOCUMENT' Routine */
      returnInSub = false ;
      AV88ExcelDocument.Save();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S141 ();
      if (returnInSub) return;
      AV88ExcelDocument.Close();
      returnInSub = true;
      if (true) return;
   }

   public void S161( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV88ExcelDocument.Cells(2, 1, 1, 1).setText( httpContext.getMessage( "Producto", "") );
      AV88ExcelDocument.Cells(2, 2, 1, 1).setText( httpContext.getMessage( "Descripcion", "") );
      AV88ExcelDocument.Cells(2, 3, 1, 1).setText( httpContext.getMessage( "Stock Teórico", "") );
      AV88ExcelDocument.Cells(2, 4, 1, 1).setText( httpContext.getMessage( "Stock Real", "") );
      AV88ExcelDocument.Cells(2, 5, 1, 1).setText( httpContext.getMessage( "Precio", "") );
      AV88ExcelDocument.Cells(2, 6, 1, 1).setText( httpContext.getMessage( "Valor Stock Real", "") );
      AV88ExcelDocument.Cells(2, 7, 1, 1).setText( httpContext.getMessage( "Dif Inventario", "") );
      AV88ExcelDocument.Cells(2, 8, 1, 1).setText( httpContext.getMessage( "D% Desvio Inventário ", "") );
      AV88ExcelDocument.Cells(2, 9, 1, 1).setText( httpContext.getMessage( "Valor", "") );
      AV88ExcelDocument.Cells(2, 10, 1, 1).setText( httpContext.getMessage( "Total Periodo", "") );
      AV88ExcelDocument.Cells(2, 11, 1, 1).setText( httpContext.getMessage( "% Perdidas", "") );
      AV88ExcelDocument.Cells(2, 12, 1, 1).setText( httpContext.getMessage( "Último Inventário ", "") );
   }

   protected void cleanup( )
   {
      this.aP0[0] = st0029e.this.A396EmprCod;
      this.aP1[0] = st0029e.this.AV15ImpCod;
      this.aP2[0] = st0029e.this.AV16UFecha;
      this.aP3[0] = st0029e.this.AV86Prdnum1;
      this.aP4[0] = st0029e.this.AV87Prdnum2;
      this.aP5[0] = st0029e.this.AV75Archivo;
      this.aP6[0] = st0029e.this.AV85desvios;
      CloseOpenCursors();
      AV88ExcelDocument.cleanup();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int1 = new byte[1] ;
      AV29Lit0 = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      scmdbuf = "" ;
      P071U2_A396EmprCod = new String[] {""} ;
      P071U2_A407EmprNom = new String[] {""} ;
      P071U2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV20NomEmp = "" ;
      P071U3_A396EmprCod = new String[] {""} ;
      P071U3_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P071U3_A719PrdNum = new String[] {""} ;
      A810RecFec = GXutil.nullDate() ;
      A719PrdNum = "" ;
      AV78Pfecha = GXutil.nullDate() ;
      AV58ValAlmCol = DecimalUtil.ZERO ;
      AV57ValAlmTot = DecimalUtil.ZERO ;
      AV59ValCCCol = DecimalUtil.ZERO ;
      AV60ValCCTot = DecimalUtil.ZERO ;
      P071U4_A396EmprCod = new String[] {""} ;
      P071U4_A719PrdNum = new String[] {""} ;
      P071U4_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P071U4_A807RecExiRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P071U4_A809RecExiTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P071U4_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P071U4_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P071U4_A3915EmpNumDec = new byte[1] ;
      P071U4_n3915EmpNumDec = new boolean[] {false} ;
      P071U4_A6573RecPreRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P071U4_A718PrdNom = new String[] {""} ;
      A807RecExiRea = DecimalUtil.ZERO ;
      A809RecExiTeo = DecimalUtil.ZERO ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A726PrdPreMed = DecimalUtil.ZERO ;
      A6573RecPreRec = DecimalUtil.ZERO ;
      A718PrdNom = "" ;
      AV80PrdNum = "" ;
      AV21DifAlm = DecimalUtil.ZERO ;
      AV26DifAlm2 = DecimalUtil.ZERO ;
      AV22DifAlmPor = DecimalUtil.ZERO ;
      AV68PreProd = DecimalUtil.ZERO ;
      AV27ValAlm = DecimalUtil.ZERO ;
      AV61TipCol = "" ;
      AV95RecExiTeo = "" ;
      AV96RecExiRea = "" ;
      AV97RecPreRec = "" ;
      AV98ValAlmT = "" ;
      AV99DifAlmT = "" ;
      AV100DifAlmPorT = "" ;
      AV101DesvioMonT = "" ;
      AV84DesvioMon = DecimalUtil.ZERO ;
      AV102EntUnientT = "" ;
      AV79EntUnient = DecimalUtil.ZERO ;
      AV103PorCompT = "" ;
      AV81PorComp = DecimalUtil.ZERO ;
      AV88ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      AV83FecIni = GXutil.nullDate() ;
      GXt_dtime4 = GXutil.resetTime( GXutil.nullDate() );
      AV77Msg_b = "" ;
      GXv_decimal5 = new java.math.BigDecimal[1] ;
      AV91Filename = "" ;
      AV90ErrorMessage = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.core.st0029e__default(),
         new Object[] {
             new Object[] {
            P071U2_A396EmprCod, P071U2_A407EmprNom, P071U2_n407EmprNom
            }
            , new Object[] {
            P071U3_A396EmprCod, P071U3_A810RecFec, P071U3_A719PrdNum
            }
            , new Object[] {
            P071U4_A396EmprCod, P071U4_A719PrdNum, P071U4_A810RecFec, P071U4_A807RecExiRea, P071U4_A809RecExiTeo, P071U4_A724PrdPreAct, P071U4_A726PrdPreMed, P071U4_A3915EmpNumDec, P071U4_n3915EmpNumDec, P071U4_A6573RecPreRec,
            P071U4_A718PrdNom
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV66FlagDifN ;
   private byte AV67FlagPreMed ;
   private byte GXv_int1[] ;
   private byte AV72Columna ;
   private byte A3915EmpNumDec ;
   private short AV94Random ;
   private short Gx_err ;
   private int AV71Fila ;
   private java.math.BigDecimal AV58ValAlmCol ;
   private java.math.BigDecimal AV57ValAlmTot ;
   private java.math.BigDecimal AV59ValCCCol ;
   private java.math.BigDecimal AV60ValCCTot ;
   private java.math.BigDecimal A807RecExiRea ;
   private java.math.BigDecimal A809RecExiTeo ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A726PrdPreMed ;
   private java.math.BigDecimal A6573RecPreRec ;
   private java.math.BigDecimal AV21DifAlm ;
   private java.math.BigDecimal AV26DifAlm2 ;
   private java.math.BigDecimal AV22DifAlmPor ;
   private java.math.BigDecimal AV68PreProd ;
   private java.math.BigDecimal AV27ValAlm ;
   private java.math.BigDecimal AV84DesvioMon ;
   private java.math.BigDecimal AV79EntUnient ;
   private java.math.BigDecimal AV81PorComp ;
   private java.math.BigDecimal GXv_decimal5[] ;
   private String A396EmprCod ;
   private String AV15ImpCod ;
   private String AV86Prdnum1 ;
   private String AV87Prdnum2 ;
   private String AV75Archivo ;
   private String AV85desvios ;
   private String AV29Lit0 ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV20NomEmp ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String AV80PrdNum ;
   private String AV61TipCol ;
   private String AV95RecExiTeo ;
   private String AV96RecExiRea ;
   private String AV97RecPreRec ;
   private String AV98ValAlmT ;
   private String AV99DifAlmT ;
   private String AV100DifAlmPorT ;
   private String AV101DesvioMonT ;
   private String AV102EntUnientT ;
   private String AV103PorCompT ;
   private String AV77Msg_b ;
   private java.util.Date GXt_dtime4 ;
   private java.util.Date AV16UFecha ;
   private java.util.Date A810RecFec ;
   private java.util.Date AV78Pfecha ;
   private java.util.Date AV83FecIni ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean n3915EmpNumDec ;
   private String AV91Filename ;
   private String AV90ErrorMessage ;
   private String[] aP6 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private java.util.Date[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P071U2_A396EmprCod ;
   private String[] P071U2_A407EmprNom ;
   private boolean[] P071U2_n407EmprNom ;
   private String[] P071U3_A396EmprCod ;
   private java.util.Date[] P071U3_A810RecFec ;
   private String[] P071U3_A719PrdNum ;
   private String[] P071U4_A396EmprCod ;
   private String[] P071U4_A719PrdNum ;
   private java.util.Date[] P071U4_A810RecFec ;
   private java.math.BigDecimal[] P071U4_A807RecExiRea ;
   private java.math.BigDecimal[] P071U4_A809RecExiTeo ;
   private java.math.BigDecimal[] P071U4_A724PrdPreAct ;
   private java.math.BigDecimal[] P071U4_A726PrdPreMed ;
   private byte[] P071U4_A3915EmpNumDec ;
   private boolean[] P071U4_n3915EmpNumDec ;
   private java.math.BigDecimal[] P071U4_A6573RecPreRec ;
   private String[] P071U4_A718PrdNom ;
   private com.genexus.gxoffice.ExcelDoc AV88ExcelDocument ;
}

final  class st0029e__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P071U2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P071U3", "SELECT EmprCod, RecFec, PrdNum FROM TXPRECUEN WHERE EmprCod = ? ORDER BY EmprCod, RecFec DESC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P071U4", "SELECT T1.EmprCod, T1.PrdNum, T1.RecFec, T1.RecExiRea, T1.RecExiTeo, T3.PrdPreAct, T3.PrdPreMed, T2.EmpNumDec, T1.RecPreRec, T3.PrdNom FROM ((TXPRECUEN T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN TXPPRODUC T3 ON T3.EmprCod = T1.EmprCod AND T3.PrdNum = T1.PrdNum) WHERE (T1.EmprCod = ? and T1.RecFec = ? and T1.PrdNum >= ?) AND (T1.PrdNum <= ?) ORDER BY T1.EmprCod, T1.RecFec, T1.PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,5);
               ((String[]) buf[10])[0] = rslt.getString(10, 26);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 6);
               return;
      }
   }

}

