package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pxmlc00 extends GXProcedure
{
   public pxmlc00( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pxmlc00.class ), "" );
   }

   public pxmlc00( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             int[] aP3 ,
                             int[] aP4 ,
                             short[] aP5 ,
                             byte[] aP6 ,
                             String[] aP7 )
   {
      pxmlc00.this.aP8 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        int[] aP3 ,
                        int[] aP4 ,
                        short[] aP5 ,
                        byte[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             int[] aP3 ,
                             int[] aP4 ,
                             short[] aP5 ,
                             byte[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 )
   {
      pxmlc00.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pxmlc00.this.AV105PProd = aP1[0];
      this.aP1 = aP1;
      pxmlc00.this.AV117UProd = aP2[0];
      this.aP2 = aP2;
      pxmlc00.this.AV106PProv = aP3[0];
      this.aP3 = aP3;
      pxmlc00.this.AV118UProv = aP4[0];
      this.aP4 = aP4;
      pxmlc00.this.AV67Any = aP5[0];
      this.aP5 = aP5;
      pxmlc00.this.AV110TipoPor = aP6[0];
      this.aP6 = aP6;
      pxmlc00.this.AV72Filename = aP7[0];
      this.aP7 = aP7;
      pxmlc00.this.AV127ErrorMessage = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV88Lit20 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN121_", ""), (byte)(99), GXv_char2) ;
      pxmlc00.this.GXt_char1 = GXv_char2[0] ;
      AV88Lit20 = GXt_char1 ;
      if ( AV110TipoPor == 2 )
      {
         GXt_char1 = AV88Lit20 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN112_", ""), (byte)(99), GXv_char2) ;
         pxmlc00.this.GXt_char1 = GXv_char2[0] ;
         AV88Lit20 = GXt_char1 ;
      }
      AV128Random = (int)(GXutil.random( )*10000) ;
      AV72Filename = "InformeCompras-" + GXutil.trim( GXutil.str( AV128Random, 8, 0)) + ".xlsx" ;
      AV126ExcelDocument.Open(AV72Filename);
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV126ExcelDocument.Clear();
      AV129CellRow = 1 ;
      AV130FirstColumn = 1 ;
      AV75I = (short)(1) ;
      while ( AV75I <= 17 )
      {
         AV126ExcelDocument.Cells(AV129CellRow, AV130FirstColumn, 1, 1).setBold( (short)(1) );
         AV126ExcelDocument.Cells(AV129CellRow, AV130FirstColumn, 1, 1).setColor( 11 );
         AV130FirstColumn = (int)(AV130FirstColumn+1) ;
         AV75I = (short)(AV75I+1) ;
      }
      AV126ExcelDocument.Cells(1, 1, 1, 1).setText( httpContext.getMessage( "Producto", "") );
      AV126ExcelDocument.Cells(1, 2, 1, 1).setText( httpContext.getMessage( "Descripcion", "") );
      AV126ExcelDocument.Cells(1, 3, 1, 1).setText( httpContext.getMessage( "Proveedor", "") );
      AV126ExcelDocument.Cells(1, 4, 1, 1).setText( httpContext.getMessage( "Nombre", "") );
      AV126ExcelDocument.Cells(1, 5, 1, 1).setText( httpContext.getMessage( "Enero", "") );
      AV126ExcelDocument.Cells(1, 6, 1, 1).setText( httpContext.getMessage( "Febrero", "") );
      AV126ExcelDocument.Cells(1, 7, 1, 1).setText( httpContext.getMessage( "Marzo", "") );
      AV126ExcelDocument.Cells(1, 8, 1, 1).setText( httpContext.getMessage( "Abril", "") );
      AV126ExcelDocument.Cells(1, 9, 1, 1).setText( httpContext.getMessage( "Mayo", "") );
      AV126ExcelDocument.Cells(1, 10, 1, 1).setText( httpContext.getMessage( "Junio", "") );
      AV126ExcelDocument.Cells(1, 11, 1, 1).setText( httpContext.getMessage( "Julio", "") );
      AV126ExcelDocument.Cells(1, 12, 1, 1).setText( httpContext.getMessage( "Agosto", "") );
      AV126ExcelDocument.Cells(1, 13, 1, 1).setText( httpContext.getMessage( "Septiembre", "") );
      AV126ExcelDocument.Cells(1, 14, 1, 1).setText( httpContext.getMessage( "Octubre", "") );
      AV126ExcelDocument.Cells(1, 15, 1, 1).setText( httpContext.getMessage( "Noviembre", "") );
      AV126ExcelDocument.Cells(1, 16, 1, 1).setText( httpContext.getMessage( "Diciembre", "") );
      AV126ExcelDocument.Cells(1, 17, 1, 1).setText( httpContext.getMessage( "Total", "") );
      /* Execute user subroutine: 'TOTALES_MES' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV129CellRow = 2 ;
      AV130FirstColumn = 1 ;
      /* Using cursor P04Z23 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV105PProd, Short.valueOf(AV67Any), Integer.valueOf(AV106PProv), Integer.valueOf(AV118UProv), AV117UProd});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A8360PrdProv = P04Z23_A8360PrdProv[0] ;
         A719PrdNum = P04Z23_A719PrdNum[0] ;
         A8366PrdAnyo = P04Z23_A8366PrdAnyo[0] ;
         A718PrdNom = P04Z23_A718PrdNom[0] ;
         A8361PrdUndCpA = P04Z23_A8361PrdUndCpA[0] ;
         n8361PrdUndCpA = P04Z23_n8361PrdUndCpA[0] ;
         A718PrdNom = P04Z23_A718PrdNom[0] ;
         A8361PrdUndCpA = P04Z23_A8361PrdUndCpA[0] ;
         n8361PrdUndCpA = P04Z23_n8361PrdUndCpA[0] ;
         GXv_char2[0] = A396EmprCod ;
         GXv_int3[0] = A8360PrdProv ;
         GXv_char4[0] = AV107PrvNom ;
         new app.pprvnom(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_char4) ;
         pxmlc00.this.A396EmprCod = GXv_char2[0] ;
         pxmlc00.this.A8360PrdProv = GXv_int3[0] ;
         pxmlc00.this.AV107PrvNom = GXv_char4[0] ;
         GX_I = 1 ;
         while ( GX_I <= 12 )
         {
            AV116Unidades[GX_I-1] = DecimalUtil.doubleToDec(0) ;
            GX_I = (int)(GX_I+1) ;
         }
         GX_I = 1 ;
         while ( GX_I <= 12 )
         {
            AV121Valores[GX_I-1] = DecimalUtil.doubleToDec(0) ;
            GX_I = (int)(GX_I+1) ;
         }
         GX_I = 1 ;
         while ( GX_I <= 12 )
         {
            AV103Porcen[GX_I-1] = DecimalUtil.doubleToDec(0) ;
            GX_I = (int)(GX_I+1) ;
         }
         AV113UniAny = 0 ;
         /* Using cursor P04Z24 */
         pr_default.execute(1, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(AV67Any), Integer.valueOf(A8360PrdProv)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A8366PrdAnyo = P04Z24_A8366PrdAnyo[0] ;
            A8364PrdUndCpM = P04Z24_A8364PrdUndCpM[0] ;
            A8363PrdMesL = P04Z24_A8363PrdMesL[0] ;
            A8365PrdUndCnM = P04Z24_A8365PrdUndCnM[0] ;
            AV116Unidades[A8363PrdMesL-1] = A8364PrdUndCpM ;
            AV121Valores[A8363PrdMesL-1] = A8365PrdUndCnM ;
            AV111Total1 = AV111Total1.add(A8364PrdUndCpM) ;
            AV112Total2 = AV112Total2.add(A8365PrdUndCnM) ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         AV104Porcen_T = DecimalUtil.doubleToDec(0) ;
         AV75I = (short)(1) ;
         if ( AV110TipoPor == 1 )
         {
            while ( AV75I <= 12 )
            {
               AV103Porcen[AV75I-1] = ((AV112Total2.doubleValue()!=0) ? GXutil.roundDecimal( (AV121Valores[AV75I-1].divide(AV112Total2, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)), 2) : DecimalUtil.doubleToDec(0)) ;
               AV75I = (short)(AV75I+1) ;
            }
         }
         else
         {
            while ( AV75I <= 12 )
            {
               AV103Porcen[AV75I-1] = ((AV120Val_Mes[AV75I-1].doubleValue()!=0) ? GXutil.roundDecimal( (AV121Valores[AV75I-1].divide(AV120Val_Mes[AV75I-1], 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)), 2) : DecimalUtil.doubleToDec(0)) ;
               AV75I = (short)(AV75I+1) ;
            }
            AV104Porcen_T = ((AV119Val_Any.doubleValue()!=0) ? GXutil.roundDecimal( ((AV112Total2.divide(AV119Val_Any, 18, java.math.RoundingMode.DOWN))).multiply(DecimalUtil.doubleToDec(100)), 2) : DecimalUtil.doubleToDec(0)) ;
         }
         AV126ExcelDocument.Cells(AV129CellRow, 1, 1, 1).setText( A719PrdNum );
         AV126ExcelDocument.Cells(AV129CellRow, 2, 1, 1).setText( A718PrdNom );
         AV126ExcelDocument.Cells(AV129CellRow, 3, 1, 1).setNumber( A8360PrdProv );
         AV126ExcelDocument.Cells(AV129CellRow, 4, 1, 1).setText( AV107PrvNom );
         AV126ExcelDocument.Cells(AV129CellRow, 5, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV116Unidades[1-1])) );
         AV126ExcelDocument.Cells(AV129CellRow, 6, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV116Unidades[2-1])) );
         AV126ExcelDocument.Cells(AV129CellRow, 7, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV116Unidades[3-1])) );
         AV126ExcelDocument.Cells(AV129CellRow, 8, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV116Unidades[4-1])) );
         AV126ExcelDocument.Cells(AV129CellRow, 9, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV116Unidades[5-1])) );
         AV126ExcelDocument.Cells(AV129CellRow, 10, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV116Unidades[6-1])) );
         AV126ExcelDocument.Cells(AV129CellRow, 11, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV116Unidades[7-1])) );
         AV126ExcelDocument.Cells(AV129CellRow, 12, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV116Unidades[8-1])) );
         AV126ExcelDocument.Cells(AV129CellRow, 13, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV116Unidades[9-1])) );
         AV126ExcelDocument.Cells(AV129CellRow, 14, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV116Unidades[10-1])) );
         AV126ExcelDocument.Cells(AV129CellRow, 15, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV116Unidades[11-1])) );
         AV126ExcelDocument.Cells(AV129CellRow, 16, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV116Unidades[12-1])) );
         AV126ExcelDocument.Cells(AV129CellRow, 17, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV111Total1)) );
         if ( AV125Solouna == 0 )
         {
            AV126ExcelDocument.Cells(AV129CellRow, 18, 1, 1).setBold( (short)(1) );
            AV126ExcelDocument.Cells(AV129CellRow, 18, 1, 1).setColor( 11 );
            AV126ExcelDocument.Cells(AV129CellRow, 18, 1, 1).setText( httpContext.getMessage( "Unidades", "") );
         }
         AV129CellRow = (int)(AV129CellRow+1) ;
         AV126ExcelDocument.Cells(AV129CellRow, 5, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV121Valores[1-1])) );
         AV126ExcelDocument.Cells(AV129CellRow, 6, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV121Valores[2-1])) );
         AV126ExcelDocument.Cells(AV129CellRow, 7, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV121Valores[3-1])) );
         AV126ExcelDocument.Cells(AV129CellRow, 8, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV121Valores[4-1])) );
         AV126ExcelDocument.Cells(AV129CellRow, 9, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV121Valores[5-1])) );
         AV126ExcelDocument.Cells(AV129CellRow, 10, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV121Valores[6-1])) );
         AV126ExcelDocument.Cells(AV129CellRow, 11, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV121Valores[7-1])) );
         AV126ExcelDocument.Cells(AV129CellRow, 12, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV121Valores[8-1])) );
         AV126ExcelDocument.Cells(AV129CellRow, 13, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV121Valores[9-1])) );
         AV126ExcelDocument.Cells(AV129CellRow, 14, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV121Valores[10-1])) );
         AV126ExcelDocument.Cells(AV129CellRow, 15, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV121Valores[11-1])) );
         AV126ExcelDocument.Cells(AV129CellRow, 16, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV121Valores[12-1])) );
         AV126ExcelDocument.Cells(AV129CellRow, 17, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV112Total2)) );
         if ( AV125Solouna == 0 )
         {
            AV126ExcelDocument.Cells(AV129CellRow, 18, 1, 1).setBold( (short)(1) );
            AV126ExcelDocument.Cells(AV129CellRow, 18, 1, 1).setColor( 11 );
            AV126ExcelDocument.Cells(AV129CellRow, 18, 1, 1).setText( httpContext.getMessage( "Valor", "") );
         }
         AV129CellRow = (int)(AV129CellRow+1) ;
         AV126ExcelDocument.Cells(AV129CellRow, 5, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV103Porcen[1-1])) );
         AV126ExcelDocument.Cells(AV129CellRow, 6, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV103Porcen[2-1])) );
         AV126ExcelDocument.Cells(AV129CellRow, 7, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV103Porcen[3-1])) );
         AV126ExcelDocument.Cells(AV129CellRow, 8, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV103Porcen[4-1])) );
         AV126ExcelDocument.Cells(AV129CellRow, 9, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV103Porcen[5-1])) );
         AV126ExcelDocument.Cells(AV129CellRow, 10, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV103Porcen[6-1])) );
         AV126ExcelDocument.Cells(AV129CellRow, 11, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV103Porcen[7-1])) );
         AV126ExcelDocument.Cells(AV129CellRow, 12, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV103Porcen[8-1])) );
         AV126ExcelDocument.Cells(AV129CellRow, 13, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV103Porcen[9-1])) );
         AV126ExcelDocument.Cells(AV129CellRow, 14, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV103Porcen[10-1])) );
         AV126ExcelDocument.Cells(AV129CellRow, 15, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV103Porcen[11-1])) );
         AV126ExcelDocument.Cells(AV129CellRow, 16, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV103Porcen[12-1])) );
         if ( AV125Solouna == 0 )
         {
            AV126ExcelDocument.Cells(AV129CellRow, 18, 1, 1).setBold( (short)(1) );
            AV126ExcelDocument.Cells(AV129CellRow, 18, 1, 1).setColor( 11 );
            AV126ExcelDocument.Cells(AV129CellRow, 18, 1, 1).setText( httpContext.getMessage( "% sobre Total Compra ", "")+GXutil.trim( AV88Lit20) );
         }
         AV129CellRow = (int)(AV129CellRow+1) ;
         AV111Total1 = DecimalUtil.doubleToDec(0) ;
         AV112Total2 = DecimalUtil.doubleToDec(0) ;
         AV101Ok_linea = (byte)(1) ;
         AV125Solouna = (byte)(1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV129CellRow = (int)(AV129CellRow+1) ;
      AV126ExcelDocument.Cells(AV129CellRow, 5, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV115Unid_Mes[1-1])) );
      AV126ExcelDocument.Cells(AV129CellRow, 6, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV115Unid_Mes[2-1])) );
      AV126ExcelDocument.Cells(AV129CellRow, 7, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV115Unid_Mes[3-1])) );
      AV126ExcelDocument.Cells(AV129CellRow, 8, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV115Unid_Mes[4-1])) );
      AV126ExcelDocument.Cells(AV129CellRow, 9, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV115Unid_Mes[5-1])) );
      AV126ExcelDocument.Cells(AV129CellRow, 10, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV115Unid_Mes[6-1])) );
      AV126ExcelDocument.Cells(AV129CellRow, 11, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV115Unid_Mes[7-1])) );
      AV126ExcelDocument.Cells(AV129CellRow, 12, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV115Unid_Mes[8-1])) );
      AV126ExcelDocument.Cells(AV129CellRow, 13, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV115Unid_Mes[9-1])) );
      AV126ExcelDocument.Cells(AV129CellRow, 14, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV115Unid_Mes[10-1])) );
      AV126ExcelDocument.Cells(AV129CellRow, 15, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV115Unid_Mes[11-1])) );
      AV126ExcelDocument.Cells(AV129CellRow, 16, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV115Unid_Mes[12-1])) );
      AV126ExcelDocument.Cells(AV129CellRow, 17, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV114Unid_Any)) );
      AV129CellRow = (int)(AV129CellRow+1) ;
      AV126ExcelDocument.Cells(AV129CellRow, 5, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV120Val_Mes[1-1])) );
      AV126ExcelDocument.Cells(AV129CellRow, 6, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV120Val_Mes[2-1])) );
      AV126ExcelDocument.Cells(AV129CellRow, 7, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV120Val_Mes[3-1])) );
      AV126ExcelDocument.Cells(AV129CellRow, 8, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV120Val_Mes[4-1])) );
      AV126ExcelDocument.Cells(AV129CellRow, 9, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV120Val_Mes[5-1])) );
      AV126ExcelDocument.Cells(AV129CellRow, 10, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV120Val_Mes[6-1])) );
      AV126ExcelDocument.Cells(AV129CellRow, 11, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV120Val_Mes[7-1])) );
      AV126ExcelDocument.Cells(AV129CellRow, 12, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV120Val_Mes[8-1])) );
      AV126ExcelDocument.Cells(AV129CellRow, 13, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV120Val_Mes[9-1])) );
      AV126ExcelDocument.Cells(AV129CellRow, 14, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV120Val_Mes[10-1])) );
      AV126ExcelDocument.Cells(AV129CellRow, 15, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV120Val_Mes[11-1])) );
      AV126ExcelDocument.Cells(AV129CellRow, 16, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV120Val_Mes[12-1])) );
      AV126ExcelDocument.Cells(AV129CellRow, 17, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV119Val_Any)) );
      AV126ExcelDocument.Save();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV126ExcelDocument.Close();
      cleanup();
   }

   public void S111( )
   {
      /* 'TOTALES_MES' Routine */
      returnInSub = false ;
      GX_I = 1 ;
      while ( GX_I <= 12 )
      {
         AV115Unid_Mes[GX_I-1] = DecimalUtil.doubleToDec(0) ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 12 )
      {
         AV120Val_Mes[GX_I-1] = DecimalUtil.doubleToDec(0) ;
         GX_I = (int)(GX_I+1) ;
      }
      AV114Unid_Any = DecimalUtil.doubleToDec(0) ;
      AV119Val_Any = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P04Z25 */
      pr_default.execute(2, new Object[] {A396EmprCod, AV105PProd, Short.valueOf(AV67Any), Integer.valueOf(AV106PProv), Integer.valueOf(AV118UProv), AV117UProd});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A8360PrdProv = P04Z25_A8360PrdProv[0] ;
         A8366PrdAnyo = P04Z25_A8366PrdAnyo[0] ;
         A719PrdNum = P04Z25_A719PrdNum[0] ;
         /* Using cursor P04Z26 */
         pr_default.execute(3, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A8366PrdAnyo), Integer.valueOf(A8360PrdProv)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A8364PrdUndCpM = P04Z26_A8364PrdUndCpM[0] ;
            A8365PrdUndCnM = P04Z26_A8365PrdUndCnM[0] ;
            A8363PrdMesL = P04Z26_A8363PrdMesL[0] ;
            AV115Unid_Mes[A8363PrdMesL-1] = AV115Unid_Mes[A8363PrdMesL-1].add(A8364PrdUndCpM) ;
            AV120Val_Mes[A8363PrdMesL-1] = AV120Val_Mes[A8363PrdMesL-1].add(A8365PrdUndCnM) ;
            AV114Unid_Any = AV114Unid_Any.add(A8364PrdUndCpM) ;
            AV119Val_Any = AV119Val_Any.add(A8365PrdUndCnM) ;
            pr_default.readNext(3);
         }
         pr_default.close(3);
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void S121( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV126ExcelDocument.getErrCode() != 0 )
      {
         AV72Filename = "" ;
         AV127ErrorMessage = AV126ExcelDocument.getErrDescription() ;
         AV126ExcelDocument.Close();
         returnInSub = true;
         if (true) return;
      }
   }

   protected void cleanup( )
   {
      this.aP0[0] = pxmlc00.this.A396EmprCod;
      this.aP1[0] = pxmlc00.this.AV105PProd;
      this.aP2[0] = pxmlc00.this.AV117UProd;
      this.aP3[0] = pxmlc00.this.AV106PProv;
      this.aP4[0] = pxmlc00.this.AV118UProv;
      this.aP5[0] = pxmlc00.this.AV67Any;
      this.aP6[0] = pxmlc00.this.AV110TipoPor;
      this.aP7[0] = pxmlc00.this.AV72Filename;
      this.aP8[0] = pxmlc00.this.AV127ErrorMessage;
      CloseOpenCursors();
      AV126ExcelDocument.cleanup();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV88Lit20 = "" ;
      GXt_char1 = "" ;
      AV126ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      scmdbuf = "" ;
      P04Z23_A396EmprCod = new String[] {""} ;
      P04Z23_A8360PrdProv = new int[1] ;
      P04Z23_A719PrdNum = new String[] {""} ;
      P04Z23_A8366PrdAnyo = new short[1] ;
      P04Z23_A718PrdNom = new String[] {""} ;
      P04Z23_A8361PrdUndCpA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04Z23_n8361PrdUndCpA = new boolean[] {false} ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A8361PrdUndCpA = DecimalUtil.ZERO ;
      GXv_char2 = new String[1] ;
      GXv_int3 = new int[1] ;
      AV107PrvNom = "" ;
      GXv_char4 = new String[1] ;
      AV116Unidades = new java.math.BigDecimal[12] ;
      GX_I = 1 ;
      while ( GX_I <= 12 )
      {
         AV116Unidades[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV121Valores = new java.math.BigDecimal[12] ;
      GX_I = 1 ;
      while ( GX_I <= 12 )
      {
         AV121Valores[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV103Porcen = new java.math.BigDecimal[12] ;
      GX_I = 1 ;
      while ( GX_I <= 12 )
      {
         AV103Porcen[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      P04Z24_A396EmprCod = new String[] {""} ;
      P04Z24_A719PrdNum = new String[] {""} ;
      P04Z24_A8360PrdProv = new int[1] ;
      P04Z24_A8366PrdAnyo = new short[1] ;
      P04Z24_A8364PrdUndCpM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04Z24_A8363PrdMesL = new byte[1] ;
      P04Z24_A8365PrdUndCnM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A8364PrdUndCpM = DecimalUtil.ZERO ;
      A8365PrdUndCnM = DecimalUtil.ZERO ;
      AV111Total1 = DecimalUtil.ZERO ;
      AV112Total2 = DecimalUtil.ZERO ;
      AV104Porcen_T = DecimalUtil.ZERO ;
      AV120Val_Mes = new java.math.BigDecimal[12] ;
      GX_I = 1 ;
      while ( GX_I <= 12 )
      {
         AV120Val_Mes[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV119Val_Any = DecimalUtil.ZERO ;
      AV115Unid_Mes = new java.math.BigDecimal[12] ;
      GX_I = 1 ;
      while ( GX_I <= 12 )
      {
         AV115Unid_Mes[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV114Unid_Any = DecimalUtil.ZERO ;
      P04Z25_A396EmprCod = new String[] {""} ;
      P04Z25_A8360PrdProv = new int[1] ;
      P04Z25_A8366PrdAnyo = new short[1] ;
      P04Z25_A719PrdNum = new String[] {""} ;
      P04Z26_A396EmprCod = new String[] {""} ;
      P04Z26_A719PrdNum = new String[] {""} ;
      P04Z26_A8366PrdAnyo = new short[1] ;
      P04Z26_A8360PrdProv = new int[1] ;
      P04Z26_A8364PrdUndCpM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04Z26_A8365PrdUndCnM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04Z26_A8363PrdMesL = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pxmlc00__default(),
         new Object[] {
             new Object[] {
            P04Z23_A396EmprCod, P04Z23_A8360PrdProv, P04Z23_A719PrdNum, P04Z23_A8366PrdAnyo, P04Z23_A718PrdNom, P04Z23_A8361PrdUndCpA, P04Z23_n8361PrdUndCpA
            }
            , new Object[] {
            P04Z24_A396EmprCod, P04Z24_A719PrdNum, P04Z24_A8360PrdProv, P04Z24_A8366PrdAnyo, P04Z24_A8364PrdUndCpM, P04Z24_A8363PrdMesL, P04Z24_A8365PrdUndCnM
            }
            , new Object[] {
            P04Z25_A396EmprCod, P04Z25_A8360PrdProv, P04Z25_A8366PrdAnyo, P04Z25_A719PrdNum
            }
            , new Object[] {
            P04Z26_A396EmprCod, P04Z26_A719PrdNum, P04Z26_A8366PrdAnyo, P04Z26_A8360PrdProv, P04Z26_A8364PrdUndCpM, P04Z26_A8365PrdUndCnM, P04Z26_A8363PrdMesL
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV110TipoPor ;
   private byte A8363PrdMesL ;
   private byte AV125Solouna ;
   private byte AV101Ok_linea ;
   private short AV67Any ;
   private short AV75I ;
   private short A8366PrdAnyo ;
   private short Gx_err ;
   private int AV106PProv ;
   private int AV118UProv ;
   private int AV128Random ;
   private int AV129CellRow ;
   private int AV130FirstColumn ;
   private int A8360PrdProv ;
   private int GXv_int3[] ;
   private int GX_I ;
   private int AV113UniAny ;
   private java.math.BigDecimal A8361PrdUndCpA ;
   private java.math.BigDecimal AV116Unidades[] ;
   private java.math.BigDecimal AV121Valores[] ;
   private java.math.BigDecimal AV103Porcen[] ;
   private java.math.BigDecimal A8364PrdUndCpM ;
   private java.math.BigDecimal A8365PrdUndCnM ;
   private java.math.BigDecimal AV111Total1 ;
   private java.math.BigDecimal AV112Total2 ;
   private java.math.BigDecimal AV104Porcen_T ;
   private java.math.BigDecimal AV120Val_Mes[] ;
   private java.math.BigDecimal AV119Val_Any ;
   private java.math.BigDecimal AV115Unid_Mes[] ;
   private java.math.BigDecimal AV114Unid_Any ;
   private String A396EmprCod ;
   private String AV105PProd ;
   private String AV117UProd ;
   private String AV88Lit20 ;
   private String GXt_char1 ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String GXv_char2[] ;
   private String AV107PrvNom ;
   private String GXv_char4[] ;
   private boolean returnInSub ;
   private boolean n8361PrdUndCpA ;
   private String AV72Filename ;
   private String AV127ErrorMessage ;
   private String[] aP8 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private int[] aP3 ;
   private int[] aP4 ;
   private short[] aP5 ;
   private byte[] aP6 ;
   private String[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P04Z23_A396EmprCod ;
   private int[] P04Z23_A8360PrdProv ;
   private String[] P04Z23_A719PrdNum ;
   private short[] P04Z23_A8366PrdAnyo ;
   private String[] P04Z23_A718PrdNom ;
   private java.math.BigDecimal[] P04Z23_A8361PrdUndCpA ;
   private boolean[] P04Z23_n8361PrdUndCpA ;
   private String[] P04Z24_A396EmprCod ;
   private String[] P04Z24_A719PrdNum ;
   private int[] P04Z24_A8360PrdProv ;
   private short[] P04Z24_A8366PrdAnyo ;
   private java.math.BigDecimal[] P04Z24_A8364PrdUndCpM ;
   private byte[] P04Z24_A8363PrdMesL ;
   private java.math.BigDecimal[] P04Z24_A8365PrdUndCnM ;
   private String[] P04Z25_A396EmprCod ;
   private int[] P04Z25_A8360PrdProv ;
   private short[] P04Z25_A8366PrdAnyo ;
   private String[] P04Z25_A719PrdNum ;
   private String[] P04Z26_A396EmprCod ;
   private String[] P04Z26_A719PrdNum ;
   private short[] P04Z26_A8366PrdAnyo ;
   private int[] P04Z26_A8360PrdProv ;
   private java.math.BigDecimal[] P04Z26_A8364PrdUndCpM ;
   private java.math.BigDecimal[] P04Z26_A8365PrdUndCnM ;
   private byte[] P04Z26_A8363PrdMesL ;
   private com.genexus.gxoffice.ExcelDoc AV126ExcelDocument ;
}

final  class pxmlc00__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04Z23", "SELECT T1.EmprCod, T1.PrdProv, T1.PrdNum, T1.PrdAnyo, T2.PrdNom, COALESCE( T3.PrdUndCpA, 0) AS PrdUndCpA FROM ((TXPINSEST T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) LEFT JOIN (SELECT SUM(PrdUndCpM) AS PrdUndCpA, EmprCod, PrdNum, PrdAnyo, PrdProv FROM TXPINSES1 GROUP BY EmprCod, PrdNum, PrdAnyo, PrdProv ) T3 ON T3.EmprCod = T1.EmprCod AND T3.PrdNum = T1.PrdNum AND T3.PrdAnyo = T1.PrdAnyo AND T3.PrdProv = T1.PrdProv) WHERE (T1.EmprCod = ? and T1.PrdNum >= ? and T1.PrdAnyo = ? and T1.PrdProv >= ?) AND (T1.PrdProv <= ?) AND (Not (COALESCE( T3.PrdUndCpA, 0) = 0)) AND (T1.PrdNum <= ?) ORDER BY T1.EmprCod, T1.PrdNum, T1.PrdAnyo, T1.PrdProv ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04Z24", "SELECT EmprCod, PrdNum, PrdProv, PrdAnyo, PrdUndCpM, PrdMesL, PrdUndCnM FROM TXPINSES1 WHERE EmprCod = ? and PrdNum = ? and PrdAnyo = ? and PrdProv = ? ORDER BY EmprCod, PrdNum, PrdAnyo, PrdProv ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04Z25", "SELECT EmprCod, PrdProv, PrdAnyo, PrdNum FROM TXPINSEST WHERE (EmprCod = ? and PrdNum >= ? and PrdAnyo = ? and PrdProv >= ?) AND (PrdProv <= ?) AND (PrdNum <= ?) ORDER BY EmprCod, PrdNum, PrdAnyo, PrdProv ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04Z26", "SELECT EmprCod, PrdNum, PrdAnyo, PrdProv, PrdUndCpM, PrdUndCnM, PrdMesL FROM TXPINSES1 WHERE EmprCod = ? and PrdNum = ? and PrdAnyo = ? and PrdProv = ? ORDER BY EmprCod, PrdNum, PrdAnyo, PrdProv, PrdMesL ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
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
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
      }
   }

}

