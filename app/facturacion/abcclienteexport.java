package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class abcclienteexport extends GXProcedure
{
   public abcclienteexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( abcclienteexport.class ), "" );
   }

   public abcclienteexport( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             String aP1 ,
                             int aP2 ,
                             int aP3 ,
                             byte aP4 ,
                             short aP5 ,
                             String aP6 ,
                             byte aP7 ,
                             String[] aP8 )
   {
      abcclienteexport.this.aP9 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        int aP2 ,
                        int aP3 ,
                        byte aP4 ,
                        short aP5 ,
                        String aP6 ,
                        byte aP7 ,
                        String[] aP8 ,
                        String[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             int aP2 ,
                             int aP3 ,
                             byte aP4 ,
                             short aP5 ,
                             String aP6 ,
                             byte aP7 ,
                             String[] aP8 ,
                             String[] aP9 )
   {
      abcclienteexport.this.A396EmprCod = aP0;
      abcclienteexport.this.AV8ImpCod = aP1;
      abcclienteexport.this.AV9PCli = aP2;
      abcclienteexport.this.AV10UCli = aP3;
      abcclienteexport.this.AV11Mes = aP4;
      abcclienteexport.this.AV12Any = aP5;
      abcclienteexport.this.AV13Prio = aP6;
      abcclienteexport.this.AV14SerieF = aP7;
      abcclienteexport.this.aP8 = aP8;
      abcclienteexport.this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15Anyo = AV12Any ;
      /* Execute user subroutine: 'OPENDOCUMENT' */
      S151 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV61CellRow = 1 ;
      /* Execute user subroutine: 'WRITECOLUMNTITLES' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV61CellRow = 2 ;
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
      AV61CellRow = 1 ;
      AV62CellCol = 1 ;
      while ( AV62CellCol <= 100 )
      {
         AV60ExcelDocument.Cells(AV61CellRow, AV62CellCol, 1, 1).setBold( (short)(1) );
         AV60ExcelDocument.Cells(AV61CellRow, AV62CellCol, 1, 1).setColor( 11 );
         AV62CellCol = (int)(AV62CellCol+1) ;
      }
      AV60ExcelDocument.Cells(1, 1, 1, 1).setText( httpContext.getMessage( "Cliente", "") );
      AV60ExcelDocument.Cells(1, 2, 1, 1).setText( httpContext.getMessage( "Nombre", "") );
      AV60ExcelDocument.Cells(1, 3, 1, 1).setText( httpContext.getMessage( "NIF", "") );
      AV60ExcelDocument.Cells(1, 4, 1, 1).setText( httpContext.getMessage( "Acumulado Mes", "") );
      AV60ExcelDocument.Cells(1, 5, 1, 1).setText( httpContext.getMessage( "Acumulado Año", "") );
      AV60ExcelDocument.Cells(1, 6, 1, 1).setText( "%" );
   }

   public void S121( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV15Anyo = AV12Any ;
      /* Using cursor P0AQG2 */
      pr_default.execute(0, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A407EmprNom = P0AQG2_A407EmprNom[0] ;
         n407EmprNom = P0AQG2_n407EmprNom[0] ;
         A963Ser1 = P0AQG2_A963Ser1[0] ;
         n963Ser1 = P0AQG2_n963Ser1[0] ;
         A2387Ser2 = P0AQG2_A2387Ser2[0] ;
         n2387Ser2 = P0AQG2_n2387Ser2[0] ;
         A2389Ser3 = P0AQG2_A2389Ser3[0] ;
         n2389Ser3 = P0AQG2_n2389Ser3[0] ;
         A4215Ser4 = P0AQG2_A4215Ser4[0] ;
         n4215Ser4 = P0AQG2_n4215Ser4[0] ;
         A4217Ser5 = P0AQG2_A4217Ser5[0] ;
         n4217Ser5 = P0AQG2_n4217Ser5[0] ;
         A4219Ser6 = P0AQG2_A4219Ser6[0] ;
         n4219Ser6 = P0AQG2_n4219Ser6[0] ;
         A4221Ser7 = P0AQG2_A4221Ser7[0] ;
         n4221Ser7 = P0AQG2_n4221Ser7[0] ;
         AV16NomEmp = A407EmprNom ;
         if ( AV14SerieF == 1 )
         {
            AV18EstSerFac = A963Ser1 ;
         }
         else
         {
            if ( AV14SerieF == 2 )
            {
               AV18EstSerFac = A2387Ser2 ;
            }
            else
            {
               if ( AV14SerieF == 3 )
               {
                  AV18EstSerFac = A2389Ser3 ;
               }
               else
               {
                  if ( AV14SerieF == 4 )
                  {
                     AV18EstSerFac = A4215Ser4 ;
                  }
                  else
                  {
                     if ( AV14SerieF == 5 )
                     {
                        AV18EstSerFac = A4217Ser5 ;
                     }
                     else
                     {
                        if ( AV14SerieF == 6 )
                        {
                           AV18EstSerFac = A4219Ser6 ;
                        }
                        else
                        {
                           if ( AV14SerieF == 7 )
                           {
                              AV18EstSerFac = A4221Ser7 ;
                           }
                        }
                     }
                  }
               }
            }
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      GXv_char1[0] = A396EmprCod ;
      GXv_int2[0] = AV9PCli ;
      GXv_int3[0] = AV10UCli ;
      GXv_int4[0] = AV15Anyo ;
      GXv_char5[0] = AV13Prio ;
      GXv_decimal6[0] = AV17TotCom ;
      GXv_char7[0] = AV18EstSerFac ;
      new app.facturacion.pordcli(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_int4, GXv_char5, GXv_decimal6, GXv_char7) ;
      abcclienteexport.this.A396EmprCod = GXv_char1[0] ;
      abcclienteexport.this.AV9PCli = GXv_int2[0] ;
      abcclienteexport.this.AV10UCli = GXv_int3[0] ;
      abcclienteexport.this.AV15Anyo = GXv_int4[0] ;
      abcclienteexport.this.AV13Prio = GXv_char5[0] ;
      abcclienteexport.this.AV17TotCom = GXv_decimal6[0] ;
      abcclienteexport.this.AV18EstSerFac = GXv_char7[0] ;
      AV19Porcen = DecimalUtil.doubleToDec(0) ;
      AV20PorAcu = DecimalUtil.doubleToDec(0) ;
      AV21PorcGrp = DecimalUtil.doubleToDec(0) ;
      AV22TotGrp = DecimalUtil.doubleToDec(0) ;
      AV23TotInf = DecimalUtil.doubleToDec(0) ;
      AV25Flag = (byte)(1) ;
      AV26ComAcu = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P0AQG4 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV9PCli), Integer.valueOf(AV10UCli), Short.valueOf(AV15Anyo), AV18EstSerFac});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A425EstAny = P0AQG4_A425EstAny[0] ;
         A2755EstSerFac = P0AQG4_A2755EstSerFac[0] ;
         A252CliCod = P0AQG4_A252CliCod[0] ;
         A279CliNom = P0AQG4_A279CliNom[0] ;
         A278CliNif = P0AQG4_A278CliNif[0] ;
         A902AcuOrd0 = P0AQG4_A902AcuOrd0[0] ;
         n902AcuOrd0 = P0AQG4_n902AcuOrd0[0] ;
         A1433AcuCli1 = P0AQG4_A1433AcuCli1[0] ;
         A1432AcuCli0 = P0AQG4_A1432AcuCli0[0] ;
         A279CliNom = P0AQG4_A279CliNom[0] ;
         A278CliNif = P0AQG4_A278CliNif[0] ;
         A1433AcuCli1 = P0AQG4_A1433AcuCli1[0] ;
         A1432AcuCli0 = P0AQG4_A1432AcuCli0[0] ;
         if ( GXutil.strcmp(AV13Prio, "2") == 0 )
         {
            AV26ComAcu = A1432AcuCli0.add(A1433AcuCli1) ;
         }
         else
         {
            if ( GXutil.strcmp(AV13Prio, "0") == 0 )
            {
               AV26ComAcu = A1432AcuCli0 ;
            }
            if ( GXutil.strcmp(AV13Prio, "1") == 0 )
            {
               AV26ComAcu = A1433AcuCli1 ;
            }
         }
         AV27ComPer = DecimalUtil.doubleToDec(0) ;
         /* Using cursor P0AQG5 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A425EstAny), AV18EstSerFac, Byte.valueOf(AV11Mes)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A2755EstSerFac = P0AQG5_A2755EstSerFac[0] ;
            A426EstMes = P0AQG5_A426EstMes[0] ;
            A1440ImpCli1 = P0AQG5_A1440ImpCli1[0] ;
            n1440ImpCli1 = P0AQG5_n1440ImpCli1[0] ;
            A1439ImpCli0 = P0AQG5_A1439ImpCli0[0] ;
            n1439ImpCli0 = P0AQG5_n1439ImpCli0[0] ;
            if ( GXutil.strcmp(AV13Prio, "2") == 0 )
            {
               AV27ComPer = A1439ImpCli0.add(A1440ImpCli1) ;
            }
            else
            {
               if ( GXutil.strcmp(AV13Prio, "0") == 0 )
               {
                  AV27ComPer = A1439ImpCli0 ;
               }
               if ( GXutil.strcmp(AV13Prio, "1") == 0 )
               {
                  AV27ComPer = A1440ImpCli1 ;
               }
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
         if ( AV25Flag == 3 )
         {
            AV25Flag = (byte)(4) ;
         }
         if ( AV17TotCom.doubleValue() != 0 )
         {
            AV19Porcen = AV26ComAcu.multiply(DecimalUtil.doubleToDec(100)).divide(AV17TotCom, 18, java.math.RoundingMode.DOWN) ;
         }
         else
         {
            AV19Porcen = DecimalUtil.doubleToDec(0) ;
         }
         AV20PorAcu = AV20PorAcu.add(AV19Porcen) ;
         AV28TotPer = AV28TotPer.add(AV27ComPer) ;
         AV23TotInf = AV23TotInf.add(AV26ComAcu) ;
         AV21PorcGrp = AV21PorcGrp.add(AV19Porcen) ;
         AV22TotGrp = AV22TotGrp.add(AV26ComAcu) ;
         AV29TotGrpPer = AV29TotGrpPer.add(AV27ComPer) ;
         if ( ( AV27ComPer.doubleValue() != 0 ) || ( AV26ComAcu.doubleValue() != 0 ) )
         {
            AV60ExcelDocument.Cells(AV61CellRow, 1, 1, 1).setNumber( A252CliCod );
            AV60ExcelDocument.Cells(AV61CellRow, 2, 1, 1).setText( A279CliNom );
            AV60ExcelDocument.Cells(AV61CellRow, 3, 1, 1).setText( A278CliNif );
            AV60ExcelDocument.Cells(AV61CellRow, 4, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV27ComPer)) );
            AV60ExcelDocument.Cells(AV61CellRow, 5, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV26ComAcu)) );
            AV60ExcelDocument.Cells(AV61CellRow, 6, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV19Porcen)) );
            AV61CellRow = (int)(AV61CellRow+1) ;
         }
         if ( ( AV20PorAcu.doubleValue() >= 80 ) && ( AV25Flag == 1 ) )
         {
            AV60ExcelDocument.Cells(AV61CellRow, 3, 1, 1).setText( httpContext.getMessage( "Grupo A", "") );
            AV60ExcelDocument.Cells(AV61CellRow, 4, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV29TotGrpPer)) );
            AV60ExcelDocument.Cells(AV61CellRow, 5, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV22TotGrp)) );
            AV60ExcelDocument.Cells(AV61CellRow, 6, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV19Porcen)) );
            AV61CellRow = (int)(AV61CellRow+1) ;
            AV21PorcGrp = DecimalUtil.doubleToDec(0) ;
            AV22TotGrp = DecimalUtil.doubleToDec(0) ;
            AV29TotGrpPer = DecimalUtil.doubleToDec(0) ;
            AV25Flag = (byte)(2) ;
         }
         if ( ( ( AV20PorAcu.doubleValue() >= 95 ) ) && ( AV25Flag == 2 ) && ( AV22TotGrp.doubleValue() != 0 ) )
         {
            AV60ExcelDocument.Cells(AV61CellRow, 3, 1, 1).setText( httpContext.getMessage( "Grupo B", "") );
            AV60ExcelDocument.Cells(AV61CellRow, 4, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV29TotGrpPer)) );
            AV60ExcelDocument.Cells(AV61CellRow, 5, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV22TotGrp)) );
            AV60ExcelDocument.Cells(AV61CellRow, 6, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV19Porcen)) );
            AV61CellRow = (int)(AV61CellRow+1) ;
            AV21PorcGrp = DecimalUtil.doubleToDec(0) ;
            AV22TotGrp = DecimalUtil.doubleToDec(0) ;
            AV29TotGrpPer = DecimalUtil.doubleToDec(0) ;
            AV25Flag = (byte)(3) ;
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
      if ( AV25Flag == 4 )
      {
         AV60ExcelDocument.Cells(AV61CellRow, 3, 1, 1).setText( httpContext.getMessage( "Grupo C", "") );
         AV60ExcelDocument.Cells(AV61CellRow, 4, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV29TotGrpPer)) );
         AV60ExcelDocument.Cells(AV61CellRow, 5, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV22TotGrp)) );
         AV60ExcelDocument.Cells(AV61CellRow, 6, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV19Porcen)) );
         AV61CellRow = (int)(AV61CellRow+1) ;
      }
      AV60ExcelDocument.Cells(AV61CellRow, 1, 1, 1).setText( AV55Texto );
      AV60ExcelDocument.Cells(AV61CellRow, 1, 1, 1).setText( AV55Texto );
      AV60ExcelDocument.Cells(AV61CellRow, 1, 1, 1).setText( AV55Texto );
      AV60ExcelDocument.Cells(AV61CellRow, 4, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV28TotPer)) );
      AV60ExcelDocument.Cells(AV61CellRow, 5, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV23TotInf)) );
      AV60ExcelDocument.Cells(AV61CellRow, 6, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV20PorAcu)) );
   }

   public void S131( )
   {
      /* 'CLOSEDOCUMENT' Routine */
      returnInSub = false ;
      AV60ExcelDocument.Save();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S141 ();
      if (returnInSub) return;
      AV60ExcelDocument.Close();
   }

   public void S151( )
   {
      /* 'OPENDOCUMENT' Routine */
      returnInSub = false ;
      AV57Random = (int)(GXutil.random( )*10000) ;
      AV58Filename = "ABCClienteExport-" + GXutil.trim( GXutil.str( AV57Random, 8, 0)) + ".xlsx" ;
      AV60ExcelDocument.Open(AV58Filename);
      /* Execute user subroutine: 'CHECKSTATUS' */
      S141 ();
      if (returnInSub) return;
      AV60ExcelDocument.Clear();
   }

   public void S141( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV60ExcelDocument.getErrCode() != 0 )
      {
         AV58Filename = "" ;
         AV59ErrorMessage = AV60ExcelDocument.getErrDescription() ;
         AV60ExcelDocument.Close();
         returnInSub = true;
         if (true) return;
      }
   }

   protected void cleanup( )
   {
      this.aP8[0] = abcclienteexport.this.AV58Filename;
      this.aP9[0] = abcclienteexport.this.AV59ErrorMessage;
      CloseOpenCursors();
      AV60ExcelDocument.cleanup();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV58Filename = "" ;
      AV59ErrorMessage = "" ;
      AV60ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      scmdbuf = "" ;
      P0AQG2_A396EmprCod = new String[] {""} ;
      P0AQG2_A407EmprNom = new String[] {""} ;
      P0AQG2_n407EmprNom = new boolean[] {false} ;
      P0AQG2_A963Ser1 = new String[] {""} ;
      P0AQG2_n963Ser1 = new boolean[] {false} ;
      P0AQG2_A2387Ser2 = new String[] {""} ;
      P0AQG2_n2387Ser2 = new boolean[] {false} ;
      P0AQG2_A2389Ser3 = new String[] {""} ;
      P0AQG2_n2389Ser3 = new boolean[] {false} ;
      P0AQG2_A4215Ser4 = new String[] {""} ;
      P0AQG2_n4215Ser4 = new boolean[] {false} ;
      P0AQG2_A4217Ser5 = new String[] {""} ;
      P0AQG2_n4217Ser5 = new boolean[] {false} ;
      P0AQG2_A4219Ser6 = new String[] {""} ;
      P0AQG2_n4219Ser6 = new boolean[] {false} ;
      P0AQG2_A4221Ser7 = new String[] {""} ;
      P0AQG2_n4221Ser7 = new boolean[] {false} ;
      A407EmprNom = "" ;
      A963Ser1 = "" ;
      A2387Ser2 = "" ;
      A2389Ser3 = "" ;
      A4215Ser4 = "" ;
      A4217Ser5 = "" ;
      A4219Ser6 = "" ;
      A4221Ser7 = "" ;
      AV16NomEmp = "" ;
      AV18EstSerFac = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_int3 = new int[1] ;
      GXv_int4 = new short[1] ;
      GXv_char5 = new String[1] ;
      AV17TotCom = DecimalUtil.ZERO ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      GXv_char7 = new String[1] ;
      AV19Porcen = DecimalUtil.ZERO ;
      AV20PorAcu = DecimalUtil.ZERO ;
      AV21PorcGrp = DecimalUtil.ZERO ;
      AV22TotGrp = DecimalUtil.ZERO ;
      AV23TotInf = DecimalUtil.ZERO ;
      AV26ComAcu = DecimalUtil.ZERO ;
      P0AQG4_A396EmprCod = new String[] {""} ;
      P0AQG4_A425EstAny = new short[1] ;
      P0AQG4_A2755EstSerFac = new String[] {""} ;
      P0AQG4_A252CliCod = new int[1] ;
      P0AQG4_A279CliNom = new String[] {""} ;
      P0AQG4_A278CliNif = new String[] {""} ;
      P0AQG4_A902AcuOrd0 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AQG4_n902AcuOrd0 = new boolean[] {false} ;
      P0AQG4_A1433AcuCli1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AQG4_A1432AcuCli0 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A2755EstSerFac = "" ;
      A279CliNom = "" ;
      A278CliNif = "" ;
      A902AcuOrd0 = DecimalUtil.ZERO ;
      A1433AcuCli1 = DecimalUtil.ZERO ;
      A1432AcuCli0 = DecimalUtil.ZERO ;
      AV27ComPer = DecimalUtil.ZERO ;
      P0AQG5_A396EmprCod = new String[] {""} ;
      P0AQG5_A252CliCod = new int[1] ;
      P0AQG5_A425EstAny = new short[1] ;
      P0AQG5_A2755EstSerFac = new String[] {""} ;
      P0AQG5_A426EstMes = new byte[1] ;
      P0AQG5_A1440ImpCli1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AQG5_n1440ImpCli1 = new boolean[] {false} ;
      P0AQG5_A1439ImpCli0 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AQG5_n1439ImpCli0 = new boolean[] {false} ;
      A1440ImpCli1 = DecimalUtil.ZERO ;
      A1439ImpCli0 = DecimalUtil.ZERO ;
      AV28TotPer = DecimalUtil.ZERO ;
      AV29TotGrpPer = DecimalUtil.ZERO ;
      AV55Texto = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.abcclienteexport__default(),
         new Object[] {
             new Object[] {
            P0AQG2_A396EmprCod, P0AQG2_A407EmprNom, P0AQG2_n407EmprNom, P0AQG2_A963Ser1, P0AQG2_n963Ser1, P0AQG2_A2387Ser2, P0AQG2_n2387Ser2, P0AQG2_A2389Ser3, P0AQG2_n2389Ser3, P0AQG2_A4215Ser4,
            P0AQG2_n4215Ser4, P0AQG2_A4217Ser5, P0AQG2_n4217Ser5, P0AQG2_A4219Ser6, P0AQG2_n4219Ser6, P0AQG2_A4221Ser7, P0AQG2_n4221Ser7
            }
            , new Object[] {
            P0AQG4_A396EmprCod, P0AQG4_A425EstAny, P0AQG4_A2755EstSerFac, P0AQG4_A252CliCod, P0AQG4_A279CliNom, P0AQG4_A278CliNif, P0AQG4_A902AcuOrd0, P0AQG4_n902AcuOrd0, P0AQG4_A1433AcuCli1, P0AQG4_A1432AcuCli0
            }
            , new Object[] {
            P0AQG5_A396EmprCod, P0AQG5_A252CliCod, P0AQG5_A425EstAny, P0AQG5_A2755EstSerFac, P0AQG5_A426EstMes, P0AQG5_A1440ImpCli1, P0AQG5_n1440ImpCli1, P0AQG5_A1439ImpCli0, P0AQG5_n1439ImpCli0
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV11Mes ;
   private byte AV14SerieF ;
   private byte AV25Flag ;
   private byte A426EstMes ;
   private short AV12Any ;
   private short AV15Anyo ;
   private short GXv_int4[] ;
   private short A425EstAny ;
   private short Gx_err ;
   private int AV9PCli ;
   private int AV10UCli ;
   private int AV61CellRow ;
   private int AV62CellCol ;
   private int GXv_int2[] ;
   private int GXv_int3[] ;
   private int A252CliCod ;
   private int AV57Random ;
   private java.math.BigDecimal AV17TotCom ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private java.math.BigDecimal AV19Porcen ;
   private java.math.BigDecimal AV20PorAcu ;
   private java.math.BigDecimal AV21PorcGrp ;
   private java.math.BigDecimal AV22TotGrp ;
   private java.math.BigDecimal AV23TotInf ;
   private java.math.BigDecimal AV26ComAcu ;
   private java.math.BigDecimal A902AcuOrd0 ;
   private java.math.BigDecimal A1433AcuCli1 ;
   private java.math.BigDecimal A1432AcuCli0 ;
   private java.math.BigDecimal AV27ComPer ;
   private java.math.BigDecimal A1440ImpCli1 ;
   private java.math.BigDecimal A1439ImpCli0 ;
   private java.math.BigDecimal AV28TotPer ;
   private java.math.BigDecimal AV29TotGrpPer ;
   private String A396EmprCod ;
   private String AV8ImpCod ;
   private String AV13Prio ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String A963Ser1 ;
   private String A2387Ser2 ;
   private String A2389Ser3 ;
   private String A4215Ser4 ;
   private String A4217Ser5 ;
   private String A4219Ser6 ;
   private String A4221Ser7 ;
   private String AV16NomEmp ;
   private String AV18EstSerFac ;
   private String GXv_char1[] ;
   private String GXv_char5[] ;
   private String GXv_char7[] ;
   private String A2755EstSerFac ;
   private String A279CliNom ;
   private String A278CliNif ;
   private String AV55Texto ;
   private boolean returnInSub ;
   private boolean n407EmprNom ;
   private boolean n963Ser1 ;
   private boolean n2387Ser2 ;
   private boolean n2389Ser3 ;
   private boolean n4215Ser4 ;
   private boolean n4217Ser5 ;
   private boolean n4219Ser6 ;
   private boolean n4221Ser7 ;
   private boolean n902AcuOrd0 ;
   private boolean n1440ImpCli1 ;
   private boolean n1439ImpCli0 ;
   private String AV58Filename ;
   private String AV59ErrorMessage ;
   private String[] aP9 ;
   private String[] aP8 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AQG2_A396EmprCod ;
   private String[] P0AQG2_A407EmprNom ;
   private boolean[] P0AQG2_n407EmprNom ;
   private String[] P0AQG2_A963Ser1 ;
   private boolean[] P0AQG2_n963Ser1 ;
   private String[] P0AQG2_A2387Ser2 ;
   private boolean[] P0AQG2_n2387Ser2 ;
   private String[] P0AQG2_A2389Ser3 ;
   private boolean[] P0AQG2_n2389Ser3 ;
   private String[] P0AQG2_A4215Ser4 ;
   private boolean[] P0AQG2_n4215Ser4 ;
   private String[] P0AQG2_A4217Ser5 ;
   private boolean[] P0AQG2_n4217Ser5 ;
   private String[] P0AQG2_A4219Ser6 ;
   private boolean[] P0AQG2_n4219Ser6 ;
   private String[] P0AQG2_A4221Ser7 ;
   private boolean[] P0AQG2_n4221Ser7 ;
   private String[] P0AQG4_A396EmprCod ;
   private short[] P0AQG4_A425EstAny ;
   private String[] P0AQG4_A2755EstSerFac ;
   private int[] P0AQG4_A252CliCod ;
   private String[] P0AQG4_A279CliNom ;
   private String[] P0AQG4_A278CliNif ;
   private java.math.BigDecimal[] P0AQG4_A902AcuOrd0 ;
   private boolean[] P0AQG4_n902AcuOrd0 ;
   private java.math.BigDecimal[] P0AQG4_A1433AcuCli1 ;
   private java.math.BigDecimal[] P0AQG4_A1432AcuCli0 ;
   private String[] P0AQG5_A396EmprCod ;
   private int[] P0AQG5_A252CliCod ;
   private short[] P0AQG5_A425EstAny ;
   private String[] P0AQG5_A2755EstSerFac ;
   private byte[] P0AQG5_A426EstMes ;
   private java.math.BigDecimal[] P0AQG5_A1440ImpCli1 ;
   private boolean[] P0AQG5_n1440ImpCli1 ;
   private java.math.BigDecimal[] P0AQG5_A1439ImpCli0 ;
   private boolean[] P0AQG5_n1439ImpCli0 ;
   private com.genexus.gxoffice.ExcelDoc AV60ExcelDocument ;
}

final  class abcclienteexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AQG2", "SELECT EmprCod, EmprNom, Ser1, Ser2, Ser3, Ser4, Ser5, Ser6, Ser7 FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AQG4", "SELECT T1.EmprCod, T1.EstAny, T1.EstSerFac, T1.CliCod, T2.CliNom, T2.CliNif, T1.AcuOrd0, COALESCE( T3.AcuCli1, 0) AS AcuCli1, COALESCE( T3.AcuCli0, 0) AS AcuCli0 FROM ((TXPCESCLI T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN (SELECT SUM(ImpCli1) AS AcuCli1, EmprCod, CliCod, EstAny, EstSerFac, SUM(ImpCli0) AS AcuCli0 FROM TXPLESCLI GROUP BY EmprCod, CliCod, EstAny, EstSerFac ) T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod AND T3.EstAny = T1.EstAny AND T3.EstSerFac = T1.EstSerFac) WHERE (T1.EmprCod = ?) AND (T1.CliCod >= ? and T1.CliCod <= ?) AND (T1.EstAny = ?) AND (T1.EstSerFac = ?) ORDER BY T1.AcuOrd0 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AQG5", "SELECT EmprCod, CliCod, EstAny, EstSerFac, EstMes, ImpCli1, ImpCli0 FROM TXPLESCLI WHERE EmprCod = ? and CliCod = ? and EstAny = ? and EstSerFac = ? and EstMes = ? ORDER BY EmprCod, CliCod, EstAny, EstSerFac, EstMes ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 3);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 3);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 3);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 3);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 3);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
      }
   }

}

