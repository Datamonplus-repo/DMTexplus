package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apfocus05 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apfocus05 pgm = new apfocus05 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apfocus05( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apfocus05.class ), "" );
   }

   public apfocus05( int remoteHandle ,
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
      AV28UsurCod = " " ;
      AV29Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = AV30EmprCod ;
      GXv_char2[0] = AV31EmprNom ;
      GXv_char3[0] = AV28UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV29Station, GXv_char1, GXv_char2, GXv_char3) ;
      apfocus05.this.AV30EmprCod = GXv_char1[0] ;
      apfocus05.this.AV31EmprNom = GXv_char2[0] ;
      apfocus05.this.AV28UsurCod = GXv_char3[0] ;
      GXt_char4 = AV8Carpeta ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV30EmprCod, httpContext.getMessage( "FOCUS", ""), GXv_char3) ;
      apfocus05.this.GXt_char4 = GXv_char3[0] ;
      AV8Carpeta = GXt_char4 ;
      GXt_char4 = AV8Carpeta ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.sys(remoteHandle, context).execute( (short)(2003), GXv_char3) ;
      apfocus05.this.GXt_char4 = GXv_char3[0] ;
      AV8Carpeta = ((GXutil.strcmp("", AV8Carpeta)==0) ? GXt_char4 : AV8Carpeta) ;
      AV14Hhmmss = GXutil.serverNow( context, remoteHandle, pr_default) ;
      AV18NomInf = httpContext.getMessage( "BUFFERS_COMPRAS_QUIMICOS_", "") + GXutil.padl( GXutil.trim( GXutil.substring( localUtil.ttoc( AV14Hhmmss, 10, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), 7, 4)), (short)(4), "0") + "_" + GXutil.padl( GXutil.trim( GXutil.substring( localUtil.ttoc( AV14Hhmmss, 10, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), 1, 2)), (short)(2), "0") + "_" + GXutil.padl( GXutil.trim( GXutil.substring( localUtil.ttoc( AV14Hhmmss, 10, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), 4, 2)), (short)(2), "0") + "_" ;
      AV18NomInf += GXutil.padl( GXutil.trim( GXutil.substring( localUtil.ttoc( AV14Hhmmss, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), 1, 2)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.substring( localUtil.ttoc( AV14Hhmmss, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), 4, 2)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.substring( localUtil.ttoc( AV14Hhmmss, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), 4, 2)), (short)(2), "0") ;
      AV11File = GXutil.trim( AV8Carpeta) + "\\" + GXutil.trim( AV18NomInf) + httpContext.getMessage( ".csv", "") ;
      GXt_int5 = AV15hnd ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fcreate(remoteHandle, context).execute( AV11File, GXv_int6) ;
      apfocus05.this.GXt_int5 = GXv_int6[0] ;
      AV15hnd = GXt_int5 ;
      AV9Control = httpContext.getMessage( "SKU", "") + ";" + httpContext.getMessage( "Descripción", "") + ";" + httpContext.getMessage( "Bodega", "") + ";" + httpContext.getMessage( "Familia de Amortiguadores", "") + ";" + httpContext.getMessage( "Ubicación de origen", "") + ";" + httpContext.getMessage( "Costo totalmente variable", "") + ";" + httpContext.getMessage( "Demanda pendiente", "") + ";" + httpContext.getMessage( "Unidad de empaque", "") + ";" + httpContext.getMessage( "Tiempo de Reabastecimiento", "") + ";" + httpContext.getMessage( "Amortiguador", "") + ";" ;
      AV9Control += httpContext.getMessage( "Inventario en sitio", "") + ";" + httpContext.getMessage( "Reposicion minima", "") + ";" + httpContext.getMessage( "Precio", "") + ";" + httpContext.getMessage( "Reabastecimientos", "") + ";" + httpContext.getMessage( "Consumos", "") + ";" + httpContext.getMessage( "Inventario en transito", "") + ";" + httpContext.getMessage( "Inventario en produccion", "") + ";" + httpContext.getMessage( "Inventario en compras", "") + ";" + httpContext.getMessage( "Fecha de movimientos", "") + ";" + httpContext.getMessage( "Hora", "") ;
      GXt_int7 = AV23Stat ;
      GXv_int8[0] = GXt_int7 ;
      new app.core.fputs(remoteHandle, context).execute( AV15hnd, AV9Control, GXv_int8) ;
      apfocus05.this.GXt_int7 = GXv_int8[0] ;
      AV23Stat = GXt_int7 ;
      System.out.println( AV9Control );
      AV32FecAct = GXutil.serverNow( context, remoteHandle, pr_default) ;
      AV9Control = localUtil.ttoc( GXutil.serverNow( context, remoteHandle, pr_default), 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + httpContext.getMessage( " Actualizo COMPRAS Pdtes Envio FOCUS", "") ;
      System.out.println( AV9Control );
      /* Using cursor P05O72 */
      pr_default.execute(0, new Object[] {AV30EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A795PrvNum = P05O72_A795PrvNum[0] ;
         A6301TipPrdCod = P05O72_A6301TipPrdCod[0] ;
         n6301TipPrdCod = P05O72_n6301TipPrdCod[0] ;
         A396EmprCod = P05O72_A396EmprCod[0] ;
         A1194PrdPosY = P05O72_A1194PrdPosY[0] ;
         A719PrdNum = P05O72_A719PrdNum[0] ;
         A11196PrdNroCAS = P05O72_A11196PrdNroCAS[0] ;
         A12957PrdLoteOb = P05O72_A12957PrdLoteOb[0] ;
         A704PrdExiAlm = P05O72_A704PrdExiAlm[0] ;
         A5417PrdConcS = P05O72_A5417PrdConcS[0] ;
         A685PrdCanRes = P05O72_A685PrdCanRes[0] ;
         A684PrdCanPen = P05O72_A684PrdCanPen[0] ;
         A718PrdNom = P05O72_A718PrdNom[0] ;
         A716PrdLotMin = P05O72_A716PrdLotMin[0] ;
         A794PrvNom = P05O72_A794PrvNom[0] ;
         n794PrvNom = P05O72_n794PrvNom[0] ;
         A6302TipPrdDsc = P05O72_A6302TipPrdDsc[0] ;
         n6302TipPrdDsc = P05O72_n6302TipPrdDsc[0] ;
         A732PrdStkMinU = P05O72_A732PrdStkMinU[0] ;
         A722PrdPlaEnt = P05O72_A722PrdPlaEnt[0] ;
         A794PrvNom = P05O72_A794PrvNom[0] ;
         n794PrvNom = P05O72_n794PrvNom[0] ;
         A6302TipPrdDsc = P05O72_A6302TipPrdDsc[0] ;
         n6302TipPrdDsc = P05O72_n6302TipPrdDsc[0] ;
         if ( ( GXutil.strcmp(A12957PrdLoteOb, httpContext.getMessage( "S", "")) != 0 ) || ( ( GXutil.strcmp(A12957PrdLoteOb, httpContext.getMessage( "S", "")) == 0 ) && ( GXutil.strcmp(A11196PrdNroCAS, localUtil.ttoc( AV32FecAct, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) != 0 ) && ! (GXutil.strcmp("", A11196PrdNroCAS)==0) ) )
         {
            AV33Prdnum = A719PrdNum ;
            AV39Existencias = ((A5417PrdConcS.doubleValue()==0) ? A704PrdExiAlm : A704PrdExiAlm.multiply(A5417PrdConcS)) ;
            AV40Reservas = ((A5417PrdConcS.doubleValue()==0) ? A685PrdCanRes : A685PrdCanRes.multiply(A5417PrdConcS)) ;
            AV41Pendiente = ((A5417PrdConcS.doubleValue()==0) ? A684PrdCanPen : A684PrdCanPen.multiply(A5417PrdConcS)) ;
            GXv_char3[0] = A396EmprCod ;
            GXv_char2[0] = A719PrdNum ;
            GXv_decimal9[0] = DecimalUtil.doubleToDec(0) ;
            GXv_decimal10[0] = DecimalUtil.doubleToDec(0) ;
            GXv_decimal11[0] = DecimalUtil.doubleToDec(0) ;
            GXv_decimal12[0] = AV26Compras ;
            GXv_decimal13[0] = AV27Consumos ;
            GXv_decimal14[0] = AV44ValorExistencias ;
            GXv_decimal15[0] = DecimalUtil.doubleToDec(1) ;
            new app.pprc157(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_decimal9, GXv_decimal10, GXv_decimal11, GXv_decimal12, GXv_decimal13, GXv_decimal14, GXv_decimal15) ;
            apfocus05.this.A396EmprCod = GXv_char3[0] ;
            apfocus05.this.A719PrdNum = GXv_char2[0] ;
            apfocus05.this.AV26Compras = GXv_decimal12[0] ;
            apfocus05.this.AV27Consumos = GXv_decimal13[0] ;
            apfocus05.this.AV44ValorExistencias = GXv_decimal14[0] ;
            AV27Consumos = AV27Consumos.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
            /* Execute user subroutine: 'ATERNATIVOS' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV42Alternativos = ((GXutil.strcmp(AV42Alternativos, " ")==0) ? A718PrdNom : AV42Alternativos) ;
            AV46Ctv = ((AV39Existencias.doubleValue()==0) ? DecimalUtil.doubleToDec(0) : AV44ValorExistencias.divide(AV39Existencias, 18, java.math.RoundingMode.DOWN)) ;
            AV50Fechaalfa = localUtil.ttoc( AV32FecAct, 10, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
            AV9Control = GXutil.trim( A718PrdNom) + ";" + GXutil.trim( AV42Alternativos) + ";" + httpContext.getMessage( "ComprasQuimicos", "") + ";" + GXutil.trim( A6302TipPrdDsc) + ";" + GXutil.trim( A794PrvNom) + ";" + GXutil.trim( GXutil.str( AV46Ctv, 11, 2)) + ";" + GXutil.trim( GXutil.str( AV40Reservas, 12, 4)) + ";" + GXutil.trim( GXutil.str( A716PrdLotMin, 4, 0)) + ";" ;
            AV9Control += GXutil.trim( GXutil.str( A722PrdPlaEnt, 3, 0)) + ";" + GXutil.trim( GXutil.str( A732PrdStkMinU, 8, 2)) + ";" ;
            AV9Control += GXutil.trim( GXutil.str( AV39Existencias, 12, 4)) + ";" + GXutil.trim( GXutil.str( A716PrdLotMin, 4, 0)) + ";" + " " + ";" + GXutil.trim( GXutil.str( AV26Compras, 9, 2)) + ";" + GXutil.trim( GXutil.str( AV27Consumos, 9, 2)) + ";" + "0" + ";" + "0" + ";" + GXutil.trim( GXutil.str( AV41Pendiente, 12, 4)) + ";" ;
            AV9Control += GXutil.trim( AV50Fechaalfa) + ";" + localUtil.ttoc( AV32FecAct, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
            GXt_int7 = AV23Stat ;
            GXv_int8[0] = GXt_int7 ;
            new app.core.fputs(remoteHandle, context).execute( AV15hnd, AV9Control, GXv_int8) ;
            apfocus05.this.GXt_int7 = GXv_int8[0] ;
            AV23Stat = GXt_int7 ;
            System.out.println( AV9Control );
            A12957PrdLoteOb = httpContext.getMessage( "S", "") ;
            A11196PrdNroCAS = localUtil.ttoc( AV32FecAct, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
            /* Using cursor P05O73 */
            pr_default.execute(1, new Object[] {A11196PrdNroCAS, A12957PrdLoteOb, A396EmprCod, A719PrdNum});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      GXt_int7 = AV23Stat ;
      GXv_int8[0] = GXt_int7 ;
      new app.core.fclose(remoteHandle, context).execute( AV15hnd, GXv_int8) ;
      apfocus05.this.GXt_int7 = GXv_int8[0] ;
      AV23Stat = GXt_int7 ;
      cleanup();
   }

   public void S111( )
   {
      /* 'ATERNATIVOS' Routine */
      returnInSub = false ;
      AV42Alternativos = "" ;
      /* Using cursor P05O74 */
      pr_default.execute(2, new Object[] {AV30EmprCod, AV33Prdnum});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A719PrdNum = P05O74_A719PrdNum[0] ;
         A396EmprCod = P05O74_A396EmprCod[0] ;
         A678PrdAltFac = P05O74_A678PrdAltFac[0] ;
         A680PrdAltNum = P05O74_A680PrdAltNum[0] ;
         A679PrdAltNom = P05O74_A679PrdAltNom[0] ;
         n679PrdAltNom = P05O74_n679PrdAltNom[0] ;
         A679PrdAltNom = P05O74_A679PrdAltNom[0] ;
         n679PrdAltNom = P05O74_n679PrdAltNom[0] ;
         GXv_char3[0] = A396EmprCod ;
         GXv_char2[0] = A680PrdAltNum ;
         GXv_decimal15[0] = AV34Exis ;
         GXv_decimal14[0] = AV35Reser ;
         GXv_decimal13[0] = AV36Pdte ;
         GXv_decimal12[0] = AV37Comp ;
         GXv_decimal11[0] = AV38cons ;
         GXv_decimal10[0] = AV45ValorEx ;
         GXv_decimal9[0] = A678PrdAltFac ;
         new app.pprc157(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_decimal15, GXv_decimal14, GXv_decimal13, GXv_decimal12, GXv_decimal11, GXv_decimal10, GXv_decimal9) ;
         apfocus05.this.A396EmprCod = GXv_char3[0] ;
         apfocus05.this.A680PrdAltNum = GXv_char2[0] ;
         apfocus05.this.AV34Exis = GXv_decimal15[0] ;
         apfocus05.this.AV35Reser = GXv_decimal14[0] ;
         apfocus05.this.AV36Pdte = GXv_decimal13[0] ;
         apfocus05.this.AV37Comp = GXv_decimal12[0] ;
         apfocus05.this.AV38cons = GXv_decimal11[0] ;
         apfocus05.this.AV45ValorEx = GXv_decimal10[0] ;
         apfocus05.this.A678PrdAltFac = GXv_decimal9[0] ;
         AV39Existencias = AV39Existencias.add(AV34Exis) ;
         AV40Reservas = AV40Reservas.add(AV35Reser) ;
         AV41Pendiente = AV41Pendiente.add(AV36Pdte) ;
         AV26Compras = AV26Compras.add(AV37Comp) ;
         AV27Consumos = AV27Consumos.add(((AV38cons.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)))) ;
         AV44ValorExistencias = AV44ValorExistencias.add(AV45ValorEx) ;
         if ( GXutil.strcmp(AV42Alternativos, "") == 0 )
         {
            AV42Alternativos = GXutil.trim( A679PrdAltNom) ;
         }
         else
         {
            AV42Alternativos += "/" + GXutil.trim( A679PrdAltNom) ;
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pfocus05.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apfocus05");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV28UsurCod = "" ;
      AV29Station = "" ;
      AV30EmprCod = "" ;
      GXv_char1 = new String[1] ;
      AV31EmprNom = "" ;
      AV8Carpeta = "" ;
      GXt_char4 = "" ;
      AV14Hhmmss = GXutil.resetTime( GXutil.nullDate() );
      AV18NomInf = "" ;
      AV11File = "" ;
      GXv_int6 = new long[1] ;
      AV9Control = "" ;
      AV32FecAct = GXutil.resetTime( GXutil.nullDate() );
      scmdbuf = "" ;
      P05O72_A795PrvNum = new int[1] ;
      P05O72_A6301TipPrdCod = new short[1] ;
      P05O72_n6301TipPrdCod = new boolean[] {false} ;
      P05O72_A396EmprCod = new String[] {""} ;
      P05O72_A1194PrdPosY = new byte[1] ;
      P05O72_A719PrdNum = new String[] {""} ;
      P05O72_A11196PrdNroCAS = new String[] {""} ;
      P05O72_A12957PrdLoteOb = new String[] {""} ;
      P05O72_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05O72_A5417PrdConcS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05O72_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05O72_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05O72_A718PrdNom = new String[] {""} ;
      P05O72_A716PrdLotMin = new short[1] ;
      P05O72_A794PrvNom = new String[] {""} ;
      P05O72_n794PrvNom = new boolean[] {false} ;
      P05O72_A6302TipPrdDsc = new String[] {""} ;
      P05O72_n6302TipPrdDsc = new boolean[] {false} ;
      P05O72_A732PrdStkMinU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05O72_A722PrdPlaEnt = new short[1] ;
      A396EmprCod = "" ;
      A719PrdNum = "" ;
      A11196PrdNroCAS = "" ;
      A12957PrdLoteOb = "" ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A5417PrdConcS = DecimalUtil.ZERO ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      A684PrdCanPen = DecimalUtil.ZERO ;
      A718PrdNom = "" ;
      A794PrvNom = "" ;
      A6302TipPrdDsc = "" ;
      A732PrdStkMinU = DecimalUtil.ZERO ;
      AV33Prdnum = "" ;
      AV39Existencias = DecimalUtil.ZERO ;
      AV40Reservas = DecimalUtil.ZERO ;
      AV41Pendiente = DecimalUtil.ZERO ;
      AV26Compras = DecimalUtil.ZERO ;
      AV27Consumos = DecimalUtil.ZERO ;
      AV44ValorExistencias = DecimalUtil.ZERO ;
      AV42Alternativos = "" ;
      AV46Ctv = DecimalUtil.ZERO ;
      AV50Fechaalfa = "" ;
      GXv_int8 = new byte[1] ;
      P05O74_A719PrdNum = new String[] {""} ;
      P05O74_A396EmprCod = new String[] {""} ;
      P05O74_A678PrdAltFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05O74_A680PrdAltNum = new String[] {""} ;
      P05O74_A679PrdAltNom = new String[] {""} ;
      P05O74_n679PrdAltNom = new boolean[] {false} ;
      A678PrdAltFac = DecimalUtil.ZERO ;
      A680PrdAltNum = "" ;
      A679PrdAltNom = "" ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV34Exis = DecimalUtil.ZERO ;
      GXv_decimal15 = new java.math.BigDecimal[1] ;
      AV35Reser = DecimalUtil.ZERO ;
      GXv_decimal14 = new java.math.BigDecimal[1] ;
      AV36Pdte = DecimalUtil.ZERO ;
      GXv_decimal13 = new java.math.BigDecimal[1] ;
      AV37Comp = DecimalUtil.ZERO ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      AV38cons = DecimalUtil.ZERO ;
      GXv_decimal11 = new java.math.BigDecimal[1] ;
      AV45ValorEx = DecimalUtil.ZERO ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apfocus05__default(),
         new Object[] {
             new Object[] {
            P05O72_A795PrvNum, P05O72_A6301TipPrdCod, P05O72_n6301TipPrdCod, P05O72_A396EmprCod, P05O72_A1194PrdPosY, P05O72_A719PrdNum, P05O72_A11196PrdNroCAS, P05O72_A12957PrdLoteOb, P05O72_A704PrdExiAlm, P05O72_A5417PrdConcS,
            P05O72_A685PrdCanRes, P05O72_A684PrdCanPen, P05O72_A718PrdNom, P05O72_A716PrdLotMin, P05O72_A794PrvNom, P05O72_n794PrvNom, P05O72_A6302TipPrdDsc, P05O72_n6302TipPrdDsc, P05O72_A732PrdStkMinU, P05O72_A722PrdPlaEnt
            }
            , new Object[] {
            }
            , new Object[] {
            P05O74_A719PrdNum, P05O74_A396EmprCod, P05O74_A678PrdAltFac, P05O74_A680PrdAltNum, P05O74_A679PrdAltNom, P05O74_n679PrdAltNom
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV23Stat ;
   private byte A1194PrdPosY ;
   private byte GXt_int7 ;
   private byte GXv_int8[] ;
   private short A6301TipPrdCod ;
   private short A716PrdLotMin ;
   private short A722PrdPlaEnt ;
   private short Gx_err ;
   private int A795PrvNum ;
   private long AV15hnd ;
   private long GXt_int5 ;
   private long GXv_int6[] ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A5417PrdConcS ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal A684PrdCanPen ;
   private java.math.BigDecimal A732PrdStkMinU ;
   private java.math.BigDecimal AV39Existencias ;
   private java.math.BigDecimal AV40Reservas ;
   private java.math.BigDecimal AV41Pendiente ;
   private java.math.BigDecimal AV26Compras ;
   private java.math.BigDecimal AV27Consumos ;
   private java.math.BigDecimal AV44ValorExistencias ;
   private java.math.BigDecimal AV46Ctv ;
   private java.math.BigDecimal A678PrdAltFac ;
   private java.math.BigDecimal AV34Exis ;
   private java.math.BigDecimal GXv_decimal15[] ;
   private java.math.BigDecimal AV35Reser ;
   private java.math.BigDecimal GXv_decimal14[] ;
   private java.math.BigDecimal AV36Pdte ;
   private java.math.BigDecimal GXv_decimal13[] ;
   private java.math.BigDecimal AV37Comp ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private java.math.BigDecimal AV38cons ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private java.math.BigDecimal AV45ValorEx ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private String AV28UsurCod ;
   private String AV29Station ;
   private String AV30EmprCod ;
   private String GXv_char1[] ;
   private String AV31EmprNom ;
   private String AV8Carpeta ;
   private String GXt_char4 ;
   private String AV18NomInf ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String A11196PrdNroCAS ;
   private String A12957PrdLoteOb ;
   private String A718PrdNom ;
   private String A794PrvNom ;
   private String A6302TipPrdDsc ;
   private String AV33Prdnum ;
   private String AV42Alternativos ;
   private String AV50Fechaalfa ;
   private String A680PrdAltNum ;
   private String A679PrdAltNom ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private java.util.Date AV14Hhmmss ;
   private java.util.Date AV32FecAct ;
   private boolean n6301TipPrdCod ;
   private boolean n794PrvNom ;
   private boolean n6302TipPrdDsc ;
   private boolean returnInSub ;
   private boolean n679PrdAltNom ;
   private String AV11File ;
   private String AV9Control ;
   private IDataStoreProvider pr_default ;
   private int[] P05O72_A795PrvNum ;
   private short[] P05O72_A6301TipPrdCod ;
   private boolean[] P05O72_n6301TipPrdCod ;
   private String[] P05O72_A396EmprCod ;
   private byte[] P05O72_A1194PrdPosY ;
   private String[] P05O72_A719PrdNum ;
   private String[] P05O72_A11196PrdNroCAS ;
   private String[] P05O72_A12957PrdLoteOb ;
   private java.math.BigDecimal[] P05O72_A704PrdExiAlm ;
   private java.math.BigDecimal[] P05O72_A5417PrdConcS ;
   private java.math.BigDecimal[] P05O72_A685PrdCanRes ;
   private java.math.BigDecimal[] P05O72_A684PrdCanPen ;
   private String[] P05O72_A718PrdNom ;
   private short[] P05O72_A716PrdLotMin ;
   private String[] P05O72_A794PrvNom ;
   private boolean[] P05O72_n794PrvNom ;
   private String[] P05O72_A6302TipPrdDsc ;
   private boolean[] P05O72_n6302TipPrdDsc ;
   private java.math.BigDecimal[] P05O72_A732PrdStkMinU ;
   private short[] P05O72_A722PrdPlaEnt ;
   private String[] P05O74_A719PrdNum ;
   private String[] P05O74_A396EmprCod ;
   private java.math.BigDecimal[] P05O74_A678PrdAltFac ;
   private String[] P05O74_A680PrdAltNum ;
   private String[] P05O74_A679PrdAltNom ;
   private boolean[] P05O74_n679PrdAltNom ;
}

final  class apfocus05__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05O72", "SELECT T1.PrvNum, T1.TipPrdCod, T1.EmprCod, T1.PrdPosY, T1.PrdNum, T1.PrdNroCAS, T1.PrdLoteOb, T1.PrdExiAlm, T1.PrdConcS, T1.PrdCanRes, T1.PrdCanPen, T1.PrdNom, T1.PrdLotMin, T2.PrvNom, T3.TipPrdDsc, T1.PrdStkMinU, T1.PrdPlaEnt FROM ((TXPPRODUC T1 INNER JOIN TXPPRVGEN T2 ON T2.EmprCod = T1.EmprCod AND T2.PrvNum = T1.PrvNum) LEFT JOIN TXPTIPPRD T3 ON T3.EmprCod = T1.EmprCod AND T3.TipPrdCod = T1.TipPrdCod) WHERE (T1.EmprCod = ?) AND (LENGTH(RTRIM(RTRIM(LTRIM(T1.PrdNum)))) = 6) AND (T1.PrdPosY = 1) ORDER BY T1.EmprCod, T1.PrdNum, T1.PrdPosY ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05O73", "UPDATE TXPPRODUC SET PrdNroCAS=?, PrdLoteOb=?  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRODUC")
         ,new ForEachCursor("P05O74", "SELECT T1.PrdNum, T1.EmprCod, T1.PrdAltFac, T1.PrdAltNum, COALESCE( T2.PrdNom, ' ') AS PrdAltNom FROM (TXPPRDALT T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdAltNum) WHERE T1.EmprCod = ? and T1.PrdNum = ? ORDER BY T1.EmprCod, T1.PrdNum, T1.PrdAltNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 6);
               ((String[]) buf[6])[0] = rslt.getString(6, 40);
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,4);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,3);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,4);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,4);
               ((String[]) buf[12])[0] = rslt.getString(12, 26);
               ((short[]) buf[13])[0] = rslt.getShort(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(15, 40);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(16,2);
               ((short[]) buf[19])[0] = rslt.getShort(17);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
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
               stmt.setString(1, (String)parms[0], 40);
               stmt.setString(2, (String)parms[1], 1);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 6);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

