package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apdye002 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apdye002 pgm = new apdye002 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apdye002( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apdye002.class ), "" );
   }

   public apdye002( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      execute_int();
   }

   private void execute_int( )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      new app.pdbconn(remoteHandle, context).execute( ) ;
      AV43UsurCod = " " ;
      AV44Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = AV45EmprCod ;
      GXv_char2[0] = AV46EmprNom ;
      GXv_char3[0] = AV43UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV44Station, GXv_char1, GXv_char2, GXv_char3) ;
      apdye002.this.AV45EmprCod = GXv_char1[0] ;
      apdye002.this.AV46EmprNom = GXv_char2[0] ;
      apdye002.this.AV43UsurCod = GXv_char3[0] ;
      GXt_int4 = AV74PreMed ;
      GXv_int5[0] = GXt_int4 ;
      new app.pexicon(remoteHandle, context).execute( AV45EmprCod, httpContext.getMessage( "PREMED", ""), GXv_int5) ;
      apdye002.this.GXt_int4 = GXv_int5[0] ;
      AV74PreMed = GXt_int4 ;
      GXt_char6 = AV50Carpeta ;
      GXv_char3[0] = GXt_char6 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV45EmprCod, httpContext.getMessage( "PTHOGT", ""), GXv_char3) ;
      apdye002.this.GXt_char6 = GXv_char3[0] ;
      AV50Carpeta = GXt_char6 ;
      GXt_int4 = AV80tintex ;
      GXv_int5[0] = GXt_int4 ;
      new app.pexicon(remoteHandle, context).execute( AV45EmprCod, httpContext.getMessage( "TINTEX", ""), GXv_int5) ;
      apdye002.this.GXt_int4 = GXv_int5[0] ;
      AV80tintex = GXt_int4 ;
      GXt_int4 = AV81Actualizar ;
      GXv_int5[0] = GXt_int4 ;
      new app.pexicon(remoteHandle, context).execute( AV45EmprCod, httpContext.getMessage( "ORGACT", ""), GXv_int5) ;
      apdye002.this.GXt_int4 = GXv_int5[0] ;
      AV81Actualizar = GXt_int4 ;
      AV78FecAlfa = "01" + "/" + "07" + "/" + "2017" ;
      AV77BarFecgen = GXutil.resetTime(localUtil.ctot( AV78FecAlfa, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
      AV51Hhmmss = GXutil.serverNow( context, remoteHandle, pr_default) ;
      AV52NomInf = GXutil.trim( AV85Pgmname) + GXutil.padl( GXutil.trim( GXutil.substring( localUtil.ttoc( AV51Hhmmss, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), 1, 2)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.substring( localUtil.ttoc( AV51Hhmmss, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), 4, 2)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.substring( localUtil.ttoc( AV51Hhmmss, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), 7, 2)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.substring( localUtil.ttoc( AV51Hhmmss, 10, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), 1, 2)), (short)(2), "0") ;
      AV52NomInf += GXutil.padl( GXutil.trim( GXutil.substring( localUtil.ttoc( AV51Hhmmss, 10, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), 4, 2)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.substring( localUtil.ttoc( AV51Hhmmss, 10, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), 7, 4)), (short)(4), "0") ;
      AV54File = ((GXutil.strcmp(AV50Carpeta, "")==0) ? httpContext.getMessage( "C:\\Informes_acatex\\Informes", "")+"\\"+GXutil.trim( AV52NomInf)+httpContext.getMessage( ".csv", "") : GXutil.trim( AV50Carpeta)+"\\"+GXutil.trim( AV52NomInf)+httpContext.getMessage( ".csv", "")) ;
      if ( new app.core.file(remoteHandle, context).executeUdp( AV54File) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         AV59Stat = GXutil.deleteFile( AV54File) ;
      }
      GXt_int7 = AV56hnd ;
      GXv_int8[0] = GXt_int7 ;
      new app.core.fcreate(remoteHandle, context).execute( AV54File, GXv_int8) ;
      apdye002.this.GXt_int7 = GXv_int8[0] ;
      AV56hnd = GXt_int7 ;
      AV53Control = httpContext.getMessage( "Lectura Consumos, tablas Dyelots,Deylot_recipe", "") + httpContext.getMessage( " Procesa solo Hdrs a partir de Fecha Creacion>= ", "") + GXutil.trim( localUtil.dtoc( AV77BarFecgen, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) ;
      GXt_int4 = AV59Stat ;
      GXv_int5[0] = GXt_int4 ;
      new app.core.fputs(remoteHandle, context).execute( AV56hnd, AV53Control, GXv_int5) ;
      apdye002.this.GXt_int4 = GXv_int5[0] ;
      AV59Stat = GXt_int4 ;
      System.out.println( AV53Control );
      AV53Control = httpContext.getMessage( "Dyelot", "") + ";" + httpContext.getMessage( "Redye", "") + ";" + httpContext.getMessage( "CorrectionNumber", "") + ";" + httpContext.getMessage( "Calloff", "") + ";" + httpContext.getMessage( "Counter", "") + ";" + httpContext.getMessage( "ProductShortName", "") + ";" + httpContext.getMessage( "ProductCode", "") + ";" + httpContext.getMessage( "ProductName", "") + ";" + httpContext.getMessage( "Amount", "") + ";" + httpContext.getMessage( "ActualAmount", "") + ";" + httpContext.getMessage( "Unit", "") + ";" + httpContext.getMessage( "EndTime", "") + ";" + httpContext.getMessage( "Fecha", "") + ";" + httpContext.getMessage( "Fecha Hdr", "") ;
      GXt_int4 = AV59Stat ;
      GXv_int5[0] = GXt_int4 ;
      new app.core.fputs(remoteHandle, context).execute( AV56hnd, AV53Control, GXv_int5) ;
      apdye002.this.GXt_int4 = GXv_int5[0] ;
      AV59Stat = GXt_int4 ;
      System.out.println( AV53Control );
      AV58Nrgtos = 0 ;
      /* Using cursor P056S2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A12381State = P056S2_A12381State[0] ;
         n12381State = P056S2_n12381State[0] ;
         A12313Dyelot = P056S2_A12313Dyelot[0] ;
         A12314ReDye = P056S2_A12314ReDye[0] ;
         A12396EndTime = P056S2_A12396EndTime[0] ;
         n12396EndTime = P056S2_n12396EndTime[0] ;
         AV61Barcod = (int)(GXutil.lval( GXutil.substring( A12313Dyelot, 1, 6))) ;
         AV62Barcodreo = (byte)(GXutil.lval( GXutil.substring( A12313Dyelot, 7, 1))) ;
         AV63Barcodpar = GXutil.substring( A12313Dyelot, 8, 1) ;
         AV47Dyelot = A12313Dyelot ;
         AV48ReDye = A12314ReDye ;
         AV76EndTime = A12396EndTime ;
         /* Execute user subroutine: 'BARCAD' */
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
      AV53Control = localUtil.ttoc( GXutil.serverNow( context, remoteHandle, pr_default), 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + httpContext.getMessage( " ->Proceso Finalizado. Registros procesados ", "") + GXutil.trim( GXutil.str( AV58Nrgtos, 6, 0)) ;
      System.out.println( AV53Control );
      GXt_int4 = AV59Stat ;
      GXv_int5[0] = GXt_int4 ;
      new app.core.fputs(remoteHandle, context).execute( AV56hnd, AV53Control, GXv_int5) ;
      apdye002.this.GXt_int4 = GXv_int5[0] ;
      AV59Stat = GXt_int4 ;
      AV53Control = localUtil.ttoc( GXutil.serverNow( context, remoteHandle, pr_default), 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + httpContext.getMessage( " ->Fichero creado. ", "") + GXutil.trim( AV54File) ;
      System.out.println( AV53Control );
      GXt_int4 = AV59Stat ;
      GXv_int5[0] = GXt_int4 ;
      new app.core.fputs(remoteHandle, context).execute( AV56hnd, AV53Control, GXv_int5) ;
      apdye002.this.GXt_int4 = GXv_int5[0] ;
      AV59Stat = GXt_int4 ;
      GXt_int4 = AV59Stat ;
      GXv_int5[0] = GXt_int4 ;
      new app.core.fclose(remoteHandle, context).execute( AV56hnd, GXv_int5) ;
      apdye002.this.GXt_int4 = GXv_int5[0] ;
      AV59Stat = GXt_int4 ;
      cleanup();
   }

   public void S111( )
   {
      /* 'BARCAD' Routine */
      returnInSub = false ;
      /* Using cursor P056S3 */
      pr_default.execute(1, new Object[] {AV45EmprCod, Integer.valueOf(AV61Barcod), Byte.valueOf(AV62Barcodreo), AV63Barcodpar, AV77BarFecgen});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A209BarPri = P056S3_A209BarPri[0] ;
         A129BarCod = P056S3_A129BarCod[0] ;
         A132BarCodReo = P056S3_A132BarCodReo[0] ;
         A130BarCodPar = P056S3_A130BarCodPar[0] ;
         A5058BarEnvLaw = P056S3_A5058BarEnvLaw[0] ;
         A159BarFecGen = P056S3_A159BarFecGen[0] ;
         A396EmprCod = P056S3_A396EmprCod[0] ;
         if ( GXutil.strcmp(A5058BarEnvLaw, httpContext.getMessage( "S", "")) != 0 )
         {
            W396EmprCod = A396EmprCod ;
            AV79FecCreacion = A159BarFecGen ;
            /* Execute user subroutine: 'DYECNS' */
            S123 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               returnInSub = true;
               if (true) return;
            }
            if ( AV67DyeCns == 0 )
            {
               AV72Fecha = GXutil.resetTime(localUtil.ctot( localUtil.ttoc( AV76EndTime, 10, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
               AV58Nrgtos = (int)(AV58Nrgtos+1) ;
               AV82Dyelotrecipe = (byte)(0) ;
               /* Using cursor P056S4 */
               pr_default.execute(2, new Object[] {AV47Dyelot});
               while ( (pr_default.getStatus(2) != 101) )
               {
                  A12316ProductNam = P056S4_A12316ProductNam[0] ;
                  n12316ProductNam = P056S4_n12316ProductNam[0] ;
                  A12394ProductSho = P056S4_A12394ProductSho[0] ;
                  n12394ProductSho = P056S4_n12394ProductSho[0] ;
                  A12380ActualAmou = P056S4_A12380ActualAmou[0] ;
                  n12380ActualAmou = P056S4_n12380ActualAmou[0] ;
                  A12317Amount = P056S4_A12317Amount[0] ;
                  n12317Amount = P056S4_n12317Amount[0] ;
                  A12318Unit = P056S4_A12318Unit[0] ;
                  n12318Unit = P056S4_n12318Unit[0] ;
                  A12313Dyelot = P056S4_A12313Dyelot[0] ;
                  A12315ProductCod = P056S4_A12315ProductCod[0] ;
                  n12315ProductCod = P056S4_n12315ProductCod[0] ;
                  A12322Counter = P056S4_A12322Counter[0] ;
                  A12321CallOff = P056S4_A12321CallOff[0] ;
                  A12320Correction = P056S4_A12320Correction[0] ;
                  A12314ReDye = P056S4_A12314ReDye[0] ;
                  AV53Control = GXutil.trim( A12313Dyelot) + ";" + GXutil.trim( GXutil.str( A12314ReDye, 5, 0)) + ";" + GXutil.trim( GXutil.str( A12320Correction, 5, 0)) + ";" + GXutil.trim( GXutil.str( A12321CallOff, 5, 0)) + ";" + GXutil.trim( GXutil.str( A12322Counter, 5, 0)) + ";" + GXutil.trim( A12394ProductSho) + ";" + GXutil.trim( A12315ProductCod) + ";" + GXutil.trim( A12316ProductNam) + ";" ;
                  AV53Control += GXutil.str( A12317Amount, 13, 5) + ";" + GXutil.trim( GXutil.str( A12380ActualAmou, 13, 5)) + ";" + GXutil.trim( A12318Unit) + ";" + localUtil.ttoc( AV76EndTime, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + ";" + localUtil.dtoc( AV72Fecha, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + ";" + localUtil.dtoc( AV79FecCreacion, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
                  System.out.println( AV53Control );
                  GXt_int4 = AV59Stat ;
                  GXv_int5[0] = GXt_int4 ;
                  new app.core.fputs(remoteHandle, context).execute( AV56hnd, AV53Control, GXv_int5) ;
                  apdye002.this.GXt_int4 = GXv_int5[0] ;
                  AV59Stat = GXt_int4 ;
                  AV68PrdNum = ((GXutil.strcmp(A12394ProductSho, "")!=0) ? GXutil.substring( A12394ProductSho, 1, 6) : GXutil.substring( A12316ProductNam, 1, 6)) ;
                  /* Execute user subroutine: 'PRODUC' */
                  S134 ();
                  if ( returnInSub )
                  {
                     pr_default.close(2);
                     pr_default.close(1);
                     returnInSub = true;
                     if (true) return;
                  }
                  AV69CCStkCanS = A12380ActualAmou ;
                  AV70PrdPreAct = ((AV74PreMed==0) ? AV70PrdPreAct : AV75PrdPreMed) ;
                  AV73RecLote = "" ;
                  AV64CorrectionNumber = A12320Correction ;
                  AV65CallOff = A12321CallOff ;
                  AV66Counter = A12322Counter ;
                  if ( AV81Actualizar == 1 )
                  {
                     /*
                        INSERT RECORD ON TABLE TXPDYECNS

                     */
                     W396EmprCod = A396EmprCod ;
                     A396EmprCod = AV45EmprCod ;
                     A12387OgHdr = AV61Barcod ;
                     A12388OgR = AV62Barcodreo ;
                     A12389OgP = AV63Barcodpar ;
                     A12390OgRedye = AV48ReDye ;
                     A12391OgCNumber = AV64CorrectionNumber ;
                     A12392OgCallOff = AV65CallOff ;
                     A12393OgCounter = AV66Counter ;
                     A12382OgPrdID = ((GXutil.strcmp(A12394ProductSho, "")!=0) ? GXutil.substring( A12394ProductSho, 1, 6) : GXutil.substring( A12316ProductNam, 1, 6)) ;
                     n12382OgPrdID = false ;
                     A12383OgPrdDc = GXutil.substring( A12316ProductNam, 1, 26) ;
                     n12383OgPrdDc = false ;
                     A12384OgAAmount = A12380ActualAmou ;
                     n12384OgAAmount = false ;
                     A12385OgAmount = A12317Amount ;
                     n12385OgAmount = false ;
                     A12386OgUnit = A12318Unit ;
                     n12386OgUnit = false ;
                     /* Using cursor P056S5 */
                     pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A12387OgHdr), Byte.valueOf(A12388OgR), A12389OgP, Integer.valueOf(A12390OgRedye), Integer.valueOf(A12391OgCNumber), Integer.valueOf(A12392OgCallOff), Integer.valueOf(A12393OgCounter), Boolean.valueOf(n12382OgPrdID), A12382OgPrdID, Boolean.valueOf(n12383OgPrdDc), A12383OgPrdDc, Boolean.valueOf(n12384OgAAmount), A12384OgAAmount, Boolean.valueOf(n12385OgAmount), A12385OgAmount, Boolean.valueOf(n12386OgUnit), A12386OgUnit});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDYECNS");
                     if ( (pr_default.getStatus(3) == 1) )
                     {
                        Gx_err = (short)(1) ;
                        Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
                     }
                     else
                     {
                        Gx_err = (short)(0) ;
                        Gx_emsg = "" ;
                     }
                     A396EmprCod = W396EmprCod ;
                     /* End Insert */
                     GXv_char3[0] = AV45EmprCod ;
                     GXv_char2[0] = AV68PrdNum ;
                     GXv_decimal9[0] = DecimalUtil.doubleToDec(0) ;
                     GXv_decimal10[0] = AV69CCStkCanS ;
                     GXv_char1[0] = httpContext.getMessage( "SC", "") ;
                     GXv_char11[0] = A209BarPri ;
                     GXv_decimal12[0] = AV70PrdPreAct ;
                     GXv_int13[0] = A129BarCod ;
                     GXv_int5[0] = A132BarCodReo ;
                     GXv_char14[0] = A130BarCodPar ;
                     GXv_int15[0] = 0 ;
                     GXv_char16[0] = " " ;
                     GXv_char17[0] = AV43UsurCod ;
                     GXv_char18[0] = httpContext.getMessage( "Consumo desde Orgatex", "") ;
                     GXv_int19[0] = (short)(0) ;
                     GXv_decimal20[0] = DecimalUtil.doubleToDec(0) ;
                     GXv_decimal21[0] = DecimalUtil.doubleToDec(0) ;
                     GXv_date22[0] = AV72Fecha ;
                     GXv_char23[0] = AV73RecLote ;
                     new app.pcls018(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_decimal9, GXv_decimal10, GXv_char1, GXv_char11, GXv_decimal12, GXv_int13, GXv_int5, GXv_char14, GXv_int15, GXv_char16, GXv_char17, GXv_char18, GXv_int19, GXv_decimal20, GXv_decimal21, GXv_date22, GXv_char23) ;
                     apdye002.this.AV45EmprCod = GXv_char3[0] ;
                     apdye002.this.AV68PrdNum = GXv_char2[0] ;
                     apdye002.this.AV69CCStkCanS = GXv_decimal10[0] ;
                     apdye002.this.A209BarPri = GXv_char11[0] ;
                     apdye002.this.AV70PrdPreAct = GXv_decimal12[0] ;
                     apdye002.this.A129BarCod = GXv_int13[0] ;
                     apdye002.this.A132BarCodReo = GXv_int5[0] ;
                     apdye002.this.A130BarCodPar = GXv_char14[0] ;
                     apdye002.this.AV43UsurCod = GXv_char17[0] ;
                     apdye002.this.AV72Fecha = GXv_date22[0] ;
                     apdye002.this.AV73RecLote = GXv_char23[0] ;
                     GXv_char23[0] = AV45EmprCod ;
                     GXv_char18[0] = AV68PrdNum ;
                     GXv_decimal21[0] = AV69CCStkCanS ;
                     new app.pcls004(remoteHandle, context).execute( GXv_char23, GXv_char18, GXv_decimal21) ;
                     apdye002.this.AV45EmprCod = GXv_char23[0] ;
                     apdye002.this.AV68PrdNum = GXv_char18[0] ;
                     apdye002.this.AV69CCStkCanS = GXv_decimal21[0] ;
                     GXv_char23[0] = AV45EmprCod ;
                     GXv_char18[0] = AV68PrdNum ;
                     GXv_decimal21[0] = AV69CCStkCanS ;
                     GXv_char17[0] = AV73RecLote ;
                     GXv_date22[0] = AV72Fecha ;
                     new app.pcls030(remoteHandle, context).execute( GXv_char23, GXv_char18, GXv_decimal21, GXv_char17, GXv_date22) ;
                     apdye002.this.AV45EmprCod = GXv_char23[0] ;
                     apdye002.this.AV68PrdNum = GXv_char18[0] ;
                     apdye002.this.AV69CCStkCanS = GXv_decimal21[0] ;
                     apdye002.this.AV73RecLote = GXv_char17[0] ;
                     apdye002.this.AV72Fecha = GXv_date22[0] ;
                     AV82Dyelotrecipe = (byte)(1) ;
                  }
                  pr_default.readNext(2);
               }
               pr_default.close(2);
               if ( ( AV81Actualizar == 1 ) && ( AV82Dyelotrecipe == 1 ) )
               {
                  A5058BarEnvLaw = httpContext.getMessage( "S", "") ;
               }
            }
            /* Using cursor P056S6 */
            pr_default.execute(4, new Object[] {A5058BarEnvLaw, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
            A396EmprCod = W396EmprCod ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
   }

   public void S134( )
   {
      /* 'PRODUC' Routine */
      returnInSub = false ;
      /* Using cursor P056S7 */
      pr_default.execute(5, new Object[] {AV45EmprCod, AV68PrdNum});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A719PrdNum = P056S7_A719PrdNum[0] ;
         A396EmprCod = P056S7_A396EmprCod[0] ;
         A724PrdPreAct = P056S7_A724PrdPreAct[0] ;
         A726PrdPreMed = P056S7_A726PrdPreMed[0] ;
         AV70PrdPreAct = A724PrdPreAct ;
         AV75PrdPreMed = A726PrdPreMed ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(5);
   }

   public void S123( )
   {
      /* 'DYECNS' Routine */
      returnInSub = false ;
      AV67DyeCns = (byte)(0) ;
      /* Using cursor P056S8 */
      pr_default.execute(6, new Object[] {AV45EmprCod, Integer.valueOf(AV61Barcod), Byte.valueOf(AV62Barcodreo), AV63Barcodpar, Integer.valueOf(AV48ReDye), Integer.valueOf(AV64CorrectionNumber)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A12391OgCNumber = P056S8_A12391OgCNumber[0] ;
         A12390OgRedye = P056S8_A12390OgRedye[0] ;
         A12389OgP = P056S8_A12389OgP[0] ;
         A12388OgR = P056S8_A12388OgR[0] ;
         A12387OgHdr = P056S8_A12387OgHdr[0] ;
         A396EmprCod = P056S8_A396EmprCod[0] ;
         A12392OgCallOff = P056S8_A12392OgCallOff[0] ;
         A12393OgCounter = P056S8_A12393OgCounter[0] ;
         AV67DyeCns = (byte)(1) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(6);
      }
      pr_default.close(6);
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pdye002.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apdye002");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV43UsurCod = "" ;
      AV44Station = "" ;
      AV45EmprCod = "" ;
      AV46EmprNom = "" ;
      AV50Carpeta = "" ;
      GXt_char6 = "" ;
      AV78FecAlfa = "" ;
      AV77BarFecgen = GXutil.nullDate() ;
      AV51Hhmmss = GXutil.resetTime( GXutil.nullDate() );
      AV52NomInf = "" ;
      AV85Pgmname = "" ;
      AV54File = "" ;
      GXv_int8 = new long[1] ;
      AV53Control = "" ;
      scmdbuf = "" ;
      P056S2_A12381State = new int[1] ;
      P056S2_n12381State = new boolean[] {false} ;
      P056S2_A12313Dyelot = new String[] {""} ;
      P056S2_A12314ReDye = new int[1] ;
      P056S2_A12396EndTime = new java.util.Date[] {GXutil.nullDate()} ;
      P056S2_n12396EndTime = new boolean[] {false} ;
      A12313Dyelot = "" ;
      A12396EndTime = GXutil.resetTime( GXutil.nullDate() );
      AV63Barcodpar = "" ;
      AV47Dyelot = "" ;
      AV76EndTime = GXutil.resetTime( GXutil.nullDate() );
      P056S3_A209BarPri = new String[] {""} ;
      P056S3_A129BarCod = new int[1] ;
      P056S3_A132BarCodReo = new byte[1] ;
      P056S3_A130BarCodPar = new String[] {""} ;
      P056S3_A5058BarEnvLaw = new String[] {""} ;
      P056S3_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P056S3_A396EmprCod = new String[] {""} ;
      A209BarPri = "" ;
      A130BarCodPar = "" ;
      A5058BarEnvLaw = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A396EmprCod = "" ;
      W396EmprCod = "" ;
      AV79FecCreacion = GXutil.nullDate() ;
      AV72Fecha = GXutil.nullDate() ;
      P056S4_A12316ProductNam = new String[] {""} ;
      P056S4_n12316ProductNam = new boolean[] {false} ;
      P056S4_A12394ProductSho = new String[] {""} ;
      P056S4_n12394ProductSho = new boolean[] {false} ;
      P056S4_A12380ActualAmou = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P056S4_n12380ActualAmou = new boolean[] {false} ;
      P056S4_A12317Amount = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P056S4_n12317Amount = new boolean[] {false} ;
      P056S4_A12318Unit = new String[] {""} ;
      P056S4_n12318Unit = new boolean[] {false} ;
      P056S4_A12313Dyelot = new String[] {""} ;
      P056S4_A12315ProductCod = new String[] {""} ;
      P056S4_n12315ProductCod = new boolean[] {false} ;
      P056S4_A12322Counter = new int[1] ;
      P056S4_A12321CallOff = new int[1] ;
      P056S4_A12320Correction = new int[1] ;
      P056S4_A12314ReDye = new int[1] ;
      A12316ProductNam = "" ;
      A12394ProductSho = "" ;
      A12380ActualAmou = DecimalUtil.ZERO ;
      A12317Amount = DecimalUtil.ZERO ;
      A12318Unit = "" ;
      A12315ProductCod = "" ;
      AV68PrdNum = "" ;
      AV69CCStkCanS = DecimalUtil.ZERO ;
      AV70PrdPreAct = DecimalUtil.ZERO ;
      AV75PrdPreMed = DecimalUtil.ZERO ;
      AV73RecLote = "" ;
      A12389OgP = "" ;
      A12382OgPrdID = "" ;
      A12383OgPrdDc = "" ;
      A12384OgAAmount = DecimalUtil.ZERO ;
      A12385OgAmount = DecimalUtil.ZERO ;
      A12386OgUnit = "" ;
      Gx_emsg = "" ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      GXv_char1 = new String[1] ;
      GXv_char11 = new String[1] ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      GXv_int13 = new int[1] ;
      GXv_int5 = new byte[1] ;
      GXv_char14 = new String[1] ;
      GXv_int15 = new int[1] ;
      GXv_char16 = new String[1] ;
      GXv_int19 = new short[1] ;
      GXv_decimal20 = new java.math.BigDecimal[1] ;
      GXv_char23 = new String[1] ;
      GXv_char18 = new String[1] ;
      GXv_decimal21 = new java.math.BigDecimal[1] ;
      GXv_char17 = new String[1] ;
      GXv_date22 = new java.util.Date[1] ;
      P056S7_A719PrdNum = new String[] {""} ;
      P056S7_A396EmprCod = new String[] {""} ;
      P056S7_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P056S7_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A719PrdNum = "" ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A726PrdPreMed = DecimalUtil.ZERO ;
      P056S8_A12391OgCNumber = new int[1] ;
      P056S8_A12390OgRedye = new int[1] ;
      P056S8_A12389OgP = new String[] {""} ;
      P056S8_A12388OgR = new byte[1] ;
      P056S8_A12387OgHdr = new int[1] ;
      P056S8_A396EmprCod = new String[] {""} ;
      P056S8_A12392OgCallOff = new int[1] ;
      P056S8_A12393OgCounter = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apdye002__default(),
         new Object[] {
             new Object[] {
            P056S2_A12381State, P056S2_n12381State, P056S2_A12313Dyelot, P056S2_A12314ReDye, P056S2_A12396EndTime, P056S2_n12396EndTime
            }
            , new Object[] {
            P056S3_A209BarPri, P056S3_A129BarCod, P056S3_A132BarCodReo, P056S3_A130BarCodPar, P056S3_A5058BarEnvLaw, P056S3_A159BarFecGen, P056S3_A396EmprCod
            }
            , new Object[] {
            P056S4_A12316ProductNam, P056S4_n12316ProductNam, P056S4_A12394ProductSho, P056S4_n12394ProductSho, P056S4_A12380ActualAmou, P056S4_n12380ActualAmou, P056S4_A12317Amount, P056S4_n12317Amount, P056S4_A12318Unit, P056S4_n12318Unit,
            P056S4_A12313Dyelot, P056S4_A12315ProductCod, P056S4_n12315ProductCod, P056S4_A12322Counter, P056S4_A12321CallOff, P056S4_A12320Correction, P056S4_A12314ReDye
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P056S7_A719PrdNum, P056S7_A396EmprCod, P056S7_A724PrdPreAct, P056S7_A726PrdPreMed
            }
            , new Object[] {
            P056S8_A12391OgCNumber, P056S8_A12390OgRedye, P056S8_A12389OgP, P056S8_A12388OgR, P056S8_A12387OgHdr, P056S8_A396EmprCod, P056S8_A12392OgCallOff, P056S8_A12393OgCounter
            }
         }
      );
      AV85Pgmname = "APDYE002" ;
      /* GeneXus formulas. */
      AV85Pgmname = "APDYE002" ;
      Gx_err = (short)(0) ;
   }

   private byte AV74PreMed ;
   private byte AV80tintex ;
   private byte AV81Actualizar ;
   private byte AV59Stat ;
   private byte AV62Barcodreo ;
   private byte A132BarCodReo ;
   private byte AV67DyeCns ;
   private byte AV82Dyelotrecipe ;
   private byte GXt_int4 ;
   private byte A12388OgR ;
   private byte GXv_int5[] ;
   private short Gx_err ;
   private short GXv_int19[] ;
   private int AV58Nrgtos ;
   private int A12381State ;
   private int A12314ReDye ;
   private int AV61Barcod ;
   private int AV48ReDye ;
   private int A129BarCod ;
   private int A12322Counter ;
   private int A12321CallOff ;
   private int A12320Correction ;
   private int AV64CorrectionNumber ;
   private int AV65CallOff ;
   private int AV66Counter ;
   private int GX_INS1718 ;
   private int A12387OgHdr ;
   private int A12390OgRedye ;
   private int A12391OgCNumber ;
   private int A12392OgCallOff ;
   private int A12393OgCounter ;
   private int GXv_int13[] ;
   private int GXv_int15[] ;
   private long AV56hnd ;
   private long GXt_int7 ;
   private long GXv_int8[] ;
   private java.math.BigDecimal A12380ActualAmou ;
   private java.math.BigDecimal A12317Amount ;
   private java.math.BigDecimal AV69CCStkCanS ;
   private java.math.BigDecimal AV70PrdPreAct ;
   private java.math.BigDecimal AV75PrdPreMed ;
   private java.math.BigDecimal A12384OgAAmount ;
   private java.math.BigDecimal A12385OgAmount ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private java.math.BigDecimal GXv_decimal20[] ;
   private java.math.BigDecimal GXv_decimal21[] ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A726PrdPreMed ;
   private String AV43UsurCod ;
   private String AV44Station ;
   private String AV45EmprCod ;
   private String AV46EmprNom ;
   private String AV50Carpeta ;
   private String GXt_char6 ;
   private String AV78FecAlfa ;
   private String AV52NomInf ;
   private String AV85Pgmname ;
   private String scmdbuf ;
   private String AV63Barcodpar ;
   private String A209BarPri ;
   private String A130BarCodPar ;
   private String A5058BarEnvLaw ;
   private String A396EmprCod ;
   private String W396EmprCod ;
   private String AV68PrdNum ;
   private String AV73RecLote ;
   private String A12389OgP ;
   private String A12382OgPrdID ;
   private String A12383OgPrdDc ;
   private String A12386OgUnit ;
   private String Gx_emsg ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char1[] ;
   private String GXv_char11[] ;
   private String GXv_char14[] ;
   private String GXv_char16[] ;
   private String GXv_char23[] ;
   private String GXv_char18[] ;
   private String GXv_char17[] ;
   private String A719PrdNum ;
   private java.util.Date AV51Hhmmss ;
   private java.util.Date A12396EndTime ;
   private java.util.Date AV76EndTime ;
   private java.util.Date AV77BarFecgen ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date AV79FecCreacion ;
   private java.util.Date AV72Fecha ;
   private java.util.Date GXv_date22[] ;
   private boolean Cond_result ;
   private boolean n12381State ;
   private boolean n12396EndTime ;
   private boolean returnInSub ;
   private boolean n12316ProductNam ;
   private boolean n12394ProductSho ;
   private boolean n12380ActualAmou ;
   private boolean n12317Amount ;
   private boolean n12318Unit ;
   private boolean n12315ProductCod ;
   private boolean n12382OgPrdID ;
   private boolean n12383OgPrdDc ;
   private boolean n12384OgAAmount ;
   private boolean n12385OgAmount ;
   private boolean n12386OgUnit ;
   private String AV54File ;
   private String AV53Control ;
   private String A12313Dyelot ;
   private String AV47Dyelot ;
   private String A12316ProductNam ;
   private String A12394ProductSho ;
   private String A12318Unit ;
   private String A12315ProductCod ;
   private IDataStoreProvider pr_default ;
   private int[] P056S2_A12381State ;
   private boolean[] P056S2_n12381State ;
   private String[] P056S2_A12313Dyelot ;
   private int[] P056S2_A12314ReDye ;
   private java.util.Date[] P056S2_A12396EndTime ;
   private boolean[] P056S2_n12396EndTime ;
   private String[] P056S3_A209BarPri ;
   private int[] P056S3_A129BarCod ;
   private byte[] P056S3_A132BarCodReo ;
   private String[] P056S3_A130BarCodPar ;
   private String[] P056S3_A5058BarEnvLaw ;
   private java.util.Date[] P056S3_A159BarFecGen ;
   private String[] P056S3_A396EmprCod ;
   private String[] P056S4_A12316ProductNam ;
   private boolean[] P056S4_n12316ProductNam ;
   private String[] P056S4_A12394ProductSho ;
   private boolean[] P056S4_n12394ProductSho ;
   private java.math.BigDecimal[] P056S4_A12380ActualAmou ;
   private boolean[] P056S4_n12380ActualAmou ;
   private java.math.BigDecimal[] P056S4_A12317Amount ;
   private boolean[] P056S4_n12317Amount ;
   private String[] P056S4_A12318Unit ;
   private boolean[] P056S4_n12318Unit ;
   private String[] P056S4_A12313Dyelot ;
   private String[] P056S4_A12315ProductCod ;
   private boolean[] P056S4_n12315ProductCod ;
   private int[] P056S4_A12322Counter ;
   private int[] P056S4_A12321CallOff ;
   private int[] P056S4_A12320Correction ;
   private int[] P056S4_A12314ReDye ;
   private String[] P056S7_A719PrdNum ;
   private String[] P056S7_A396EmprCod ;
   private java.math.BigDecimal[] P056S7_A724PrdPreAct ;
   private java.math.BigDecimal[] P056S7_A726PrdPreMed ;
   private int[] P056S8_A12391OgCNumber ;
   private int[] P056S8_A12390OgRedye ;
   private String[] P056S8_A12389OgP ;
   private byte[] P056S8_A12388OgR ;
   private int[] P056S8_A12387OgHdr ;
   private String[] P056S8_A396EmprCod ;
   private int[] P056S8_A12392OgCallOff ;
   private int[] P056S8_A12393OgCounter ;
}

final  class apdye002__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P056S2", "SELECT State, Dyelot, ReDye, EndTime FROM TXPDYE001 WHERE State >= 40 ORDER BY State ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P056S3", "SELECT BarPri, BarCod, BarCodReo, BarCodPar, BarEnvLaw, BarFecGen, EmprCod FROM TXPBARCAD WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (BarFecGen >= ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P056S4", "SELECT ProductNam, ProductSho, ActualAmou, Amount, Unit, Dyelot, ProductCod, Counter, CallOff, Correction, ReDye FROM TXPDYE002 WHERE Dyelot = ? ORDER BY Dyelot, ReDye, Correction, CallOff, Counter ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P056S5", "INSERT INTO TXPDYECNS(EmprCod, OgHdr, OgR, OgP, OgRedye, OgCNumber, OgCallOff, OgCounter, OgPrdID, OgPrdDc, OgAAmount, OgAmount, OgUnit) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDYECNS")
         ,new UpdateCursor("P056S6", "UPDATE TXPBARCAD SET BarEnvLaw=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P056S7", "SELECT PrdNum, EmprCod, PrdPreAct, PrdPreMed FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P056S8", "SELECT * FROM (SELECT OgCNumber, OgRedye, OgP, OgR, OgHdr, EmprCod, OgCallOff, OgCounter FROM TXPDYECNS WHERE EmprCod = ? and OgHdr = ? and OgR = ? and OgP = ? and OgRedye = ? and OgCNumber = ? ORDER BY EmprCod, OgHdr, OgR, OgP, OgRedye, OgCNumber) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(3,5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(6);
               ((String[]) buf[11])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(8);
               ((int[]) buf[14])[0] = rslt.getInt(9);
               ((int[]) buf[15])[0] = rslt.getInt(10);
               ((int[]) buf[16])[0] = rslt.getInt(11);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setDate(5, (java.util.Date)parms[4]);
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 20);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[9], 6);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[11], 26);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[13], 5);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[15], 5);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[17], 10);
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
      }
   }

}

