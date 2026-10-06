package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pctrpq01 extends GXProcedure
{
   public pctrpq01( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pctrpq01.class ), "" );
   }

   public pctrpq01( int remoteHandle ,
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
      pctrpq01.this.aP5 = new String[] {""};
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
      pctrpq01.this.AV50Emprcod = aP0[0];
      this.aP0 = aP0;
      pctrpq01.this.AV74Prdnum1 = aP1[0];
      this.aP1 = aP1;
      pctrpq01.this.AV73Prdnum2 = aP2[0];
      this.aP2 = aP2;
      pctrpq01.this.AV54Carpeta = aP3[0];
      this.aP3 = aP3;
      pctrpq01.this.AV79ActDatos = aP4[0];
      this.aP4 = aP4;
      pctrpq01.this.AV84Siacumular = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV51UsurCod = " " ;
      AV52Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = AV50Emprcod ;
      GXv_char2[0] = AV53EmprNom ;
      GXv_char3[0] = AV51UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV52Station, GXv_char1, GXv_char2, GXv_char3) ;
      pctrpq01.this.AV50Emprcod = GXv_char1[0] ;
      pctrpq01.this.AV53EmprNom = GXv_char2[0] ;
      pctrpq01.this.AV51UsurCod = GXv_char3[0] ;
      GXt_int4 = AV87Cotexsur ;
      GXv_int5[0] = GXt_int4 ;
      new app.pexicon(remoteHandle, context).execute( AV50Emprcod, httpContext.getMessage( "COTEXS", ""), GXv_int5) ;
      pctrpq01.this.GXt_int4 = GXv_int5[0] ;
      AV87Cotexsur = GXt_int4 ;
      AV88Hhmmss = GXutil.serverNow( context, remoteHandle, pr_default) ;
      AV55Nominf = GXutil.trim( AV91Pgmdesc) + "_" + GXutil.padl( GXutil.trim( GXutil.substring( localUtil.ttoc( AV88Hhmmss, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), 1, 2)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.substring( localUtil.ttoc( AV88Hhmmss, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), 4, 2)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.substring( localUtil.ttoc( AV88Hhmmss, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), 7, 2)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.substring( localUtil.ttoc( AV88Hhmmss, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), 1, 2)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.substring( localUtil.ttoc( AV88Hhmmss, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), 4, 2)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.substring( localUtil.ttoc( AV88Hhmmss, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), 7, 2)), (short)(2), "0") ;
      AV56File = GXutil.trim( AV54Carpeta) + "\\" + GXutil.trim( AV55Nominf) + httpContext.getMessage( ".csv", "") ;
      if ( new app.core.file(remoteHandle, context).executeUdp( AV56File) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         AV57Stat = GXutil.deleteFile( AV56File) ;
      }
      GXt_int6 = AV58hnd ;
      GXv_int7[0] = GXt_int6 ;
      new app.core.fcreate(remoteHandle, context).execute( AV56File, GXv_int7) ;
      pctrpq01.this.GXt_int6 = GXv_int7[0] ;
      AV58hnd = (short)(GXt_int6) ;
      AV59Control = httpContext.getMessage( " Auditoria Productos. Actualizar Datos= ", "") + AV79ActDatos + httpContext.getMessage( "  Acumular Salidas Dia Inventario? = ", "") + AV84Siacumular ;
      GXt_int4 = (byte)(AV57Stat) ;
      GXv_int5[0] = GXt_int4 ;
      new app.core.fputs(remoteHandle, context).execute( AV58hnd, AV59Control, GXv_int5) ;
      pctrpq01.this.GXt_int4 = GXv_int5[0] ;
      AV57Stat = GXt_int4 ;
      System.out.println( AV59Control );
      AV59Control = httpContext.getMessage( "Producto", "") + ";" + httpContext.getMessage( "Descripcion", "") + ";" + httpContext.getMessage( "Compras Antes Inv?", "") + ";" + httpContext.getMessage( "Salidas Antes Inv?", "") + ";" + httpContext.getMessage( "Fecha Inventario", "") + ";" + httpContext.getMessage( "Cantidad Inventario", "") + ";" + httpContext.getMessage( "Compras Periodo", "") + ";" + httpContext.getMessage( "Consumos Periodo", "") + ";" ;
      AV59Control += httpContext.getMessage( "Existencias Almacen(BaseDatos)", "") + ";" + httpContext.getMessage( "Existencias Calculadas", "") + ";" + httpContext.getMessage( "Diferencia", "") + ";" + httpContext.getMessage( "Saldo Compras", "") + ";" + httpContext.getMessage( "Diferencia", "") + ";" + httpContext.getMessage( "Observacion", "") ;
      GXt_int4 = (byte)(AV57Stat) ;
      GXv_int5[0] = GXt_int4 ;
      new app.core.fputs(remoteHandle, context).execute( AV58hnd, AV59Control, GXv_int5) ;
      pctrpq01.this.GXt_int4 = GXv_int5[0] ;
      AV57Stat = GXt_int4 ;
      System.out.println( AV59Control );
      AV69Prdexialm = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P05KG2 */
      pr_default.execute(0, new Object[] {AV50Emprcod, AV74Prdnum1, AV73Prdnum2});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A719PrdNum = P05KG2_A719PrdNum[0] ;
         A396EmprCod = P05KG2_A396EmprCod[0] ;
         A704PrdExiAlm = P05KG2_A704PrdExiAlm[0] ;
         A718PrdNom = P05KG2_A718PrdNom[0] ;
         AV49Prdnum = A719PrdNum ;
         AV69Prdexialm = A704PrdExiAlm ;
         AV70prdNom = A718PrdNom ;
         /* Execute user subroutine: 'PROCESAMOS' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      GXt_int4 = (byte)(AV57Stat) ;
      GXv_int5[0] = GXt_int4 ;
      new app.core.fclose(remoteHandle, context).execute( AV58hnd, GXv_int5) ;
      pctrpq01.this.GXt_int4 = GXv_int5[0] ;
      AV57Stat = GXt_int4 ;
      cleanup();
   }

   public void S111( )
   {
      /* 'PROCESAMOS' Routine */
      returnInSub = false ;
      AV77SiInventario = (byte)(0) ;
      AV72EntUniRem = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P05KG3 */
      pr_default.execute(1, new Object[] {AV50Emprcod, AV49Prdnum});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A411EntCon = P05KG3_A411EntCon[0] ;
         A719PrdNum = P05KG3_A719PrdNum[0] ;
         A396EmprCod = P05KG3_A396EmprCod[0] ;
         A5686EntLotN = P05KG3_A5686EntLotN[0] ;
         A5691EntBnc = P05KG3_A5691EntBnc[0] ;
         A419EntUniRem = P05KG3_A419EntUniRem[0] ;
         A597LinEnt = P05KG3_A597LinEnt[0] ;
         AV72EntUniRem = AV72EntUniRem.add((((AV87Cotexsur==0) ? A419EntUniRem : ((GXutil.strcmp(A5691EntBnc, httpContext.getMessage( "ENVIADO", ""))==0)&&(GXutil.strcmp(A5686EntLotN, httpContext.getMessage( "CERRADO", ""))==0) ? A419EntUniRem : DecimalUtil.doubleToDec(0))))) ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
      AV60Recfec = GXutil.nullDate() ;
      AV63RecExiRea = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P05KG4 */
      pr_default.execute(2, new Object[] {AV50Emprcod, AV49Prdnum});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A396EmprCod = P05KG4_A396EmprCod[0] ;
         A719PrdNum = P05KG4_A719PrdNum[0] ;
         A807RecExiRea = P05KG4_A807RecExiRea[0] ;
         A810RecFec = P05KG4_A810RecFec[0] ;
         AV60Recfec = A810RecFec ;
         AV63RecExiRea = A807RecExiRea ;
         AV77SiInventario = (byte)(1) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(2);
      }
      pr_default.close(2);
      AV61Entradas = DecimalUtil.doubleToDec(0) ;
      AV62Salidas = DecimalUtil.doubleToDec(0) ;
      AV64CCstklin = 0 ;
      if ( AV77SiInventario == 1 )
      {
         /* Using cursor P05KG5 */
         pr_default.execute(3, new Object[] {AV50Emprcod, AV49Prdnum, AV60Recfec});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A396EmprCod = P05KG5_A396EmprCod[0] ;
            A719PrdNum = P05KG5_A719PrdNum[0] ;
            A3348CCStkFec = P05KG5_A3348CCStkFec[0] ;
            A3345TipMovCc = P05KG5_A3345TipMovCc[0] ;
            A3342CCStkLin = P05KG5_A3342CCStkLin[0] ;
            A3356CCStkHor = P05KG5_A3356CCStkHor[0] ;
            if ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SR", "")) == 0 )
            {
               AV64CCstklin = A3342CCStkLin ;
            }
            pr_default.readNext(3);
         }
         pr_default.close(3);
         /* Using cursor P05KG6 */
         pr_default.execute(4, new Object[] {AV50Emprcod, AV49Prdnum, AV60Recfec});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A396EmprCod = P05KG6_A396EmprCod[0] ;
            A719PrdNum = P05KG6_A719PrdNum[0] ;
            A3348CCStkFec = P05KG6_A3348CCStkFec[0] ;
            A3345TipMovCc = P05KG6_A3345TipMovCc[0] ;
            A3343CCStkCanE = P05KG6_A3343CCStkCanE[0] ;
            A3344CCStkCanS = P05KG6_A3344CCStkCanS[0] ;
            A3356CCStkHor = P05KG6_A3356CCStkHor[0] ;
            A3342CCStkLin = P05KG6_A3342CCStkLin[0] ;
            if ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SR", "")) == 0 )
            {
            }
            else
            {
               AV61Entradas = AV61Entradas.add((((GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "EN", ""))==0) ? A3343CCStkCanE : DecimalUtil.doubleToDec(0)))) ;
               AV62Salidas = AV62Salidas.add((((GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SC", ""))==0)||(GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SM", ""))==0)||(GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SD", ""))==0) ? A3344CCStkCanS : DecimalUtil.doubleToDec(0)))) ;
            }
            pr_default.readNext(4);
         }
         pr_default.close(4);
      }
      else
      {
         /* Using cursor P05KG7 */
         pr_default.execute(5, new Object[] {AV50Emprcod, AV49Prdnum});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A396EmprCod = P05KG7_A396EmprCod[0] ;
            A719PrdNum = P05KG7_A719PrdNum[0] ;
            A3356CCStkHor = P05KG7_A3356CCStkHor[0] ;
            A3348CCStkFec = P05KG7_A3348CCStkFec[0] ;
            A3342CCStkLin = P05KG7_A3342CCStkLin[0] ;
            AV64CCstklin = 5 ;
            AV60Recfec = A3348CCStkFec ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(5);
         }
         pr_default.close(5);
      }
      AV60Recfec = (GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV60Recfec)) ? Gx_date : AV60Recfec) ;
      AV66CantInv = DecimalUtil.doubleToDec(0) ;
      AV68Consumos = DecimalUtil.doubleToDec(0) ;
      AV67Compras = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P05KG8 */
      pr_default.execute(6, new Object[] {AV50Emprcod, AV49Prdnum, AV60Recfec});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A396EmprCod = P05KG8_A396EmprCod[0] ;
         A719PrdNum = P05KG8_A719PrdNum[0] ;
         A3348CCStkFec = P05KG8_A3348CCStkFec[0] ;
         A3345TipMovCc = P05KG8_A3345TipMovCc[0] ;
         A3343CCStkCanE = P05KG8_A3343CCStkCanE[0] ;
         A3344CCStkCanS = P05KG8_A3344CCStkCanS[0] ;
         A3356CCStkHor = P05KG8_A3356CCStkHor[0] ;
         A3342CCStkLin = P05KG8_A3342CCStkLin[0] ;
         if ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SR", "")) == 0 )
         {
            AV65Ccstkfec = A3348CCStkFec ;
            /* Execute user subroutine: 'INVENTARIO' */
            S128 ();
            if ( returnInSub )
            {
               pr_default.close(6);
               returnInSub = true;
               if (true) return;
            }
            AV68Consumos = DecimalUtil.doubleToDec(0) ;
            AV67Compras = DecimalUtil.doubleToDec(0) ;
         }
         else
         {
            AV67Compras = AV67Compras.add((((GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "EN", ""))==0) ? A3343CCStkCanE : DecimalUtil.doubleToDec(0)))) ;
            AV68Consumos = AV68Consumos.add((((GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SC", ""))==0)||(GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SM", ""))==0)||(GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SD", ""))==0) ? A3344CCStkCanS : DecimalUtil.doubleToDec(0)))) ;
         }
         pr_default.readNext(6);
      }
      pr_default.close(6);
      AV71ExisCalculadas = ((GXutil.strcmp(AV84Siacumular, httpContext.getMessage( "N", ""))==0) ? AV66CantInv.add(AV67Compras).subtract(AV68Consumos) : AV66CantInv.subtract(AV62Salidas).add(AV67Compras).subtract(AV68Consumos)) ;
      AV75Dif = AV69Prdexialm.subtract(AV71ExisCalculadas) ;
      AV76Dif2 = ((AV72EntUniRem.doubleValue()>0) ? AV71ExisCalculadas.subtract(AV72EntUniRem) : DecimalUtil.doubleToDec(0)) ;
      AV78Obs = ((AV77SiInventario==0) ? httpContext.getMessage( "Nunca se hizo Inventario", "") : "") ;
      AV59Control = AV49Prdnum + ";" + AV70prdNom + ";" + GXutil.str( AV61Entradas, 12, 4) + ";" + GXutil.str( AV62Salidas, 12, 4) + ";" + localUtil.dtoc( AV60Recfec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + ";" + GXutil.str( AV66CantInv, 12, 4) + ";" + GXutil.str( AV67Compras, 12, 4) + ";" + GXutil.str( AV68Consumos, 12, 4) + ";" ;
      AV59Control += GXutil.str( AV69Prdexialm, 12, 4) + ";" + GXutil.str( AV71ExisCalculadas, 12, 4) + ";" + GXutil.str( AV75Dif, 12, 4) + ";" + GXutil.str( AV72EntUniRem, 11, 4) + ";" + GXutil.str( AV76Dif2, 12, 4) + ";" + AV78Obs ;
      GXt_int4 = (byte)(AV57Stat) ;
      GXv_int5[0] = GXt_int4 ;
      new app.core.fputs(remoteHandle, context).execute( AV58hnd, AV59Control, GXv_int5) ;
      pctrpq01.this.GXt_int4 = GXv_int5[0] ;
      AV57Stat = GXt_int4 ;
      System.out.println( AV59Control );
   }

   public void S128( )
   {
      /* 'INVENTARIO' Routine */
      returnInSub = false ;
      AV66CantInv = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P05KG9 */
      pr_default.execute(7, new Object[] {AV50Emprcod, AV49Prdnum, AV65Ccstkfec});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A810RecFec = P05KG9_A810RecFec[0] ;
         A719PrdNum = P05KG9_A719PrdNum[0] ;
         A396EmprCod = P05KG9_A396EmprCod[0] ;
         A807RecExiRea = P05KG9_A807RecExiRea[0] ;
         AV66CantInv = A807RecExiRea ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(7);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pctrpq01.this.AV50Emprcod;
      this.aP1[0] = pctrpq01.this.AV74Prdnum1;
      this.aP2[0] = pctrpq01.this.AV73Prdnum2;
      this.aP3[0] = pctrpq01.this.AV54Carpeta;
      this.aP4[0] = pctrpq01.this.AV79ActDatos;
      this.aP5[0] = pctrpq01.this.AV84Siacumular;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV51UsurCod = "" ;
      AV52Station = "" ;
      GXv_char1 = new String[1] ;
      AV53EmprNom = "" ;
      GXv_char2 = new String[1] ;
      GXv_char3 = new String[1] ;
      AV88Hhmmss = GXutil.resetTime( GXutil.nullDate() );
      AV55Nominf = "" ;
      AV91Pgmdesc = "" ;
      AV56File = "" ;
      GXv_int7 = new long[1] ;
      AV59Control = "" ;
      AV69Prdexialm = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P05KG2_A719PrdNum = new String[] {""} ;
      P05KG2_A396EmprCod = new String[] {""} ;
      P05KG2_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05KG2_A718PrdNom = new String[] {""} ;
      A719PrdNum = "" ;
      A396EmprCod = "" ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A718PrdNom = "" ;
      AV49Prdnum = "" ;
      AV70prdNom = "" ;
      AV72EntUniRem = DecimalUtil.ZERO ;
      P05KG3_A411EntCon = new byte[1] ;
      P05KG3_A719PrdNum = new String[] {""} ;
      P05KG3_A396EmprCod = new String[] {""} ;
      P05KG3_A5686EntLotN = new String[] {""} ;
      P05KG3_A5691EntBnc = new String[] {""} ;
      P05KG3_A419EntUniRem = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05KG3_A597LinEnt = new short[1] ;
      A5686EntLotN = "" ;
      A5691EntBnc = "" ;
      A419EntUniRem = DecimalUtil.ZERO ;
      AV60Recfec = GXutil.nullDate() ;
      AV63RecExiRea = DecimalUtil.ZERO ;
      P05KG4_A396EmprCod = new String[] {""} ;
      P05KG4_A719PrdNum = new String[] {""} ;
      P05KG4_A807RecExiRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05KG4_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      A807RecExiRea = DecimalUtil.ZERO ;
      A810RecFec = GXutil.nullDate() ;
      AV61Entradas = DecimalUtil.ZERO ;
      AV62Salidas = DecimalUtil.ZERO ;
      P05KG5_A396EmprCod = new String[] {""} ;
      P05KG5_A719PrdNum = new String[] {""} ;
      P05KG5_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P05KG5_A3345TipMovCc = new String[] {""} ;
      P05KG5_A3342CCStkLin = new long[1] ;
      P05KG5_A3356CCStkHor = new String[] {""} ;
      A3348CCStkFec = GXutil.nullDate() ;
      A3345TipMovCc = "" ;
      A3356CCStkHor = "" ;
      P05KG6_A396EmprCod = new String[] {""} ;
      P05KG6_A719PrdNum = new String[] {""} ;
      P05KG6_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P05KG6_A3345TipMovCc = new String[] {""} ;
      P05KG6_A3343CCStkCanE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05KG6_A3344CCStkCanS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05KG6_A3356CCStkHor = new String[] {""} ;
      P05KG6_A3342CCStkLin = new long[1] ;
      A3343CCStkCanE = DecimalUtil.ZERO ;
      A3344CCStkCanS = DecimalUtil.ZERO ;
      P05KG7_A396EmprCod = new String[] {""} ;
      P05KG7_A719PrdNum = new String[] {""} ;
      P05KG7_A3356CCStkHor = new String[] {""} ;
      P05KG7_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P05KG7_A3342CCStkLin = new long[1] ;
      Gx_date = GXutil.nullDate() ;
      AV66CantInv = DecimalUtil.ZERO ;
      AV68Consumos = DecimalUtil.ZERO ;
      AV67Compras = DecimalUtil.ZERO ;
      P05KG8_A396EmprCod = new String[] {""} ;
      P05KG8_A719PrdNum = new String[] {""} ;
      P05KG8_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P05KG8_A3345TipMovCc = new String[] {""} ;
      P05KG8_A3343CCStkCanE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05KG8_A3344CCStkCanS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05KG8_A3356CCStkHor = new String[] {""} ;
      P05KG8_A3342CCStkLin = new long[1] ;
      AV65Ccstkfec = GXutil.nullDate() ;
      AV71ExisCalculadas = DecimalUtil.ZERO ;
      AV75Dif = DecimalUtil.ZERO ;
      AV76Dif2 = DecimalUtil.ZERO ;
      AV78Obs = "" ;
      GXv_int5 = new byte[1] ;
      P05KG9_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P05KG9_A719PrdNum = new String[] {""} ;
      P05KG9_A396EmprCod = new String[] {""} ;
      P05KG9_A807RecExiRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pctrpq01__default(),
         new Object[] {
             new Object[] {
            P05KG2_A719PrdNum, P05KG2_A396EmprCod, P05KG2_A704PrdExiAlm, P05KG2_A718PrdNom
            }
            , new Object[] {
            P05KG3_A411EntCon, P05KG3_A719PrdNum, P05KG3_A396EmprCod, P05KG3_A5686EntLotN, P05KG3_A5691EntBnc, P05KG3_A419EntUniRem, P05KG3_A597LinEnt
            }
            , new Object[] {
            P05KG4_A396EmprCod, P05KG4_A719PrdNum, P05KG4_A807RecExiRea, P05KG4_A810RecFec
            }
            , new Object[] {
            P05KG5_A396EmprCod, P05KG5_A719PrdNum, P05KG5_A3348CCStkFec, P05KG5_A3345TipMovCc, P05KG5_A3342CCStkLin, P05KG5_A3356CCStkHor
            }
            , new Object[] {
            P05KG6_A396EmprCod, P05KG6_A719PrdNum, P05KG6_A3348CCStkFec, P05KG6_A3345TipMovCc, P05KG6_A3343CCStkCanE, P05KG6_A3344CCStkCanS, P05KG6_A3356CCStkHor, P05KG6_A3342CCStkLin
            }
            , new Object[] {
            P05KG7_A396EmprCod, P05KG7_A719PrdNum, P05KG7_A3356CCStkHor, P05KG7_A3348CCStkFec, P05KG7_A3342CCStkLin
            }
            , new Object[] {
            P05KG8_A396EmprCod, P05KG8_A719PrdNum, P05KG8_A3348CCStkFec, P05KG8_A3345TipMovCc, P05KG8_A3343CCStkCanE, P05KG8_A3344CCStkCanS, P05KG8_A3356CCStkHor, P05KG8_A3342CCStkLin
            }
            , new Object[] {
            P05KG9_A810RecFec, P05KG9_A719PrdNum, P05KG9_A396EmprCod, P05KG9_A807RecExiRea
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV91Pgmdesc = httpContext.getMessage( "Auditoria Productos Quimicos", "") ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      AV91Pgmdesc = httpContext.getMessage( "Auditoria Productos Quimicos", "") ;
      Gx_err = (short)(0) ;
   }

   private byte AV87Cotexsur ;
   private byte AV77SiInventario ;
   private byte A411EntCon ;
   private byte GXt_int4 ;
   private byte GXv_int5[] ;
   private short AV57Stat ;
   private short AV58hnd ;
   private short A597LinEnt ;
   private short Gx_err ;
   private long GXt_int6 ;
   private long GXv_int7[] ;
   private long AV64CCstklin ;
   private long A3342CCStkLin ;
   private java.math.BigDecimal AV69Prdexialm ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal AV72EntUniRem ;
   private java.math.BigDecimal A419EntUniRem ;
   private java.math.BigDecimal AV63RecExiRea ;
   private java.math.BigDecimal A807RecExiRea ;
   private java.math.BigDecimal AV61Entradas ;
   private java.math.BigDecimal AV62Salidas ;
   private java.math.BigDecimal A3343CCStkCanE ;
   private java.math.BigDecimal A3344CCStkCanS ;
   private java.math.BigDecimal AV66CantInv ;
   private java.math.BigDecimal AV68Consumos ;
   private java.math.BigDecimal AV67Compras ;
   private java.math.BigDecimal AV71ExisCalculadas ;
   private java.math.BigDecimal AV75Dif ;
   private java.math.BigDecimal AV76Dif2 ;
   private String AV50Emprcod ;
   private String AV74Prdnum1 ;
   private String AV73Prdnum2 ;
   private String AV54Carpeta ;
   private String AV79ActDatos ;
   private String AV84Siacumular ;
   private String AV51UsurCod ;
   private String AV52Station ;
   private String GXv_char1[] ;
   private String AV53EmprNom ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String AV55Nominf ;
   private String AV91Pgmdesc ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A396EmprCod ;
   private String A718PrdNom ;
   private String AV49Prdnum ;
   private String AV70prdNom ;
   private String A5686EntLotN ;
   private String A5691EntBnc ;
   private String A3345TipMovCc ;
   private String A3356CCStkHor ;
   private String AV78Obs ;
   private java.util.Date AV88Hhmmss ;
   private java.util.Date AV60Recfec ;
   private java.util.Date A810RecFec ;
   private java.util.Date A3348CCStkFec ;
   private java.util.Date Gx_date ;
   private java.util.Date AV65Ccstkfec ;
   private boolean Cond_result ;
   private boolean returnInSub ;
   private String AV56File ;
   private String AV59Control ;
   private String[] aP5 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P05KG2_A719PrdNum ;
   private String[] P05KG2_A396EmprCod ;
   private java.math.BigDecimal[] P05KG2_A704PrdExiAlm ;
   private String[] P05KG2_A718PrdNom ;
   private byte[] P05KG3_A411EntCon ;
   private String[] P05KG3_A719PrdNum ;
   private String[] P05KG3_A396EmprCod ;
   private String[] P05KG3_A5686EntLotN ;
   private String[] P05KG3_A5691EntBnc ;
   private java.math.BigDecimal[] P05KG3_A419EntUniRem ;
   private short[] P05KG3_A597LinEnt ;
   private String[] P05KG4_A396EmprCod ;
   private String[] P05KG4_A719PrdNum ;
   private java.math.BigDecimal[] P05KG4_A807RecExiRea ;
   private java.util.Date[] P05KG4_A810RecFec ;
   private String[] P05KG5_A396EmprCod ;
   private String[] P05KG5_A719PrdNum ;
   private java.util.Date[] P05KG5_A3348CCStkFec ;
   private String[] P05KG5_A3345TipMovCc ;
   private long[] P05KG5_A3342CCStkLin ;
   private String[] P05KG5_A3356CCStkHor ;
   private String[] P05KG6_A396EmprCod ;
   private String[] P05KG6_A719PrdNum ;
   private java.util.Date[] P05KG6_A3348CCStkFec ;
   private String[] P05KG6_A3345TipMovCc ;
   private java.math.BigDecimal[] P05KG6_A3343CCStkCanE ;
   private java.math.BigDecimal[] P05KG6_A3344CCStkCanS ;
   private String[] P05KG6_A3356CCStkHor ;
   private long[] P05KG6_A3342CCStkLin ;
   private String[] P05KG7_A396EmprCod ;
   private String[] P05KG7_A719PrdNum ;
   private String[] P05KG7_A3356CCStkHor ;
   private java.util.Date[] P05KG7_A3348CCStkFec ;
   private long[] P05KG7_A3342CCStkLin ;
   private String[] P05KG8_A396EmprCod ;
   private String[] P05KG8_A719PrdNum ;
   private java.util.Date[] P05KG8_A3348CCStkFec ;
   private String[] P05KG8_A3345TipMovCc ;
   private java.math.BigDecimal[] P05KG8_A3343CCStkCanE ;
   private java.math.BigDecimal[] P05KG8_A3344CCStkCanS ;
   private String[] P05KG8_A3356CCStkHor ;
   private long[] P05KG8_A3342CCStkLin ;
   private java.util.Date[] P05KG9_A810RecFec ;
   private String[] P05KG9_A719PrdNum ;
   private String[] P05KG9_A396EmprCod ;
   private java.math.BigDecimal[] P05KG9_A807RecExiRea ;
}

final  class pctrpq01__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05KG2", "SELECT PrdNum, EmprCod, PrdExiAlm, PrdNom FROM TXPPRODUC WHERE (EmprCod = ? and PrdNum >= ?) AND (LENGTH(RTRIM(RTRIM(LTRIM(PrdNum)))) > 5) AND (PrdNum <= ?) ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05KG3", "SELECT EntCon, PrdNum, EmprCod, EntLotN, EntBnc, EntUniRem, LinEnt FROM TXPENTALM WHERE (EmprCod = ? and PrdNum = ?) AND (EntCon = 0) ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05KG4", "SELECT * FROM (SELECT EmprCod, PrdNum, RecExiRea, RecFec FROM TXPRECUEN WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum, RecFec DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05KG5", "SELECT EmprCod, PrdNum, CCStkFec, TipMovCc, CCStkLin, CCStkHor FROM TXPCCSTKS WHERE EmprCod = ? and PrdNum = ? and CCStkFec = ? ORDER BY EmprCod, PrdNum, CCStkFec, CCStkHor ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05KG6", "SELECT EmprCod, PrdNum, CCStkFec, TipMovCc, CCStkCanE, CCStkCanS, CCStkHor, CCStkLin FROM TXPCCSTKS WHERE EmprCod = ? and PrdNum = ? and CCStkFec = ? ORDER BY EmprCod, PrdNum, CCStkFec, CCStkHor ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05KG7", "SELECT * FROM (SELECT EmprCod, PrdNum, CCStkHor, CCStkFec, CCStkLin FROM TXPCCSTKS WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum, CCStkFec, CCStkHor) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05KG8", "SELECT EmprCod, PrdNum, CCStkFec, TipMovCc, CCStkCanE, CCStkCanS, CCStkHor, CCStkLin FROM TXPCCSTKS WHERE EmprCod = ? and PrdNum = ? and CCStkFec >= ? ORDER BY EmprCod, PrdNum, CCStkFec, CCStkHor ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05KG9", "SELECT RecFec, PrdNum, EmprCod, RecExiRea FROM TXPRECUEN WHERE EmprCod = ? and PrdNum = ? and RecFec = ? ORDER BY EmprCod, PrdNum, RecFec ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 2);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((long[]) buf[7])[0] = rslt.getLong(8);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((long[]) buf[7])[0] = rslt.getLong(8);
               return;
            case 7 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
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
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
      }
   }

}

