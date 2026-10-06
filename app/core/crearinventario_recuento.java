package app.core ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class crearinventario_recuento extends GXProcedure
{
   public crearinventario_recuento( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( crearinventario_recuento.class ), "" );
   }

   public crearinventario_recuento( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            String[] aP1 ,
                            String[] aP2 ,
                            int[] aP3 ,
                            int[] aP4 ,
                            byte[] aP5 ,
                            java.util.Date[] aP6 ,
                            java.util.Date[] aP7 ,
                            String[] aP8 ,
                            String[] aP9 )
   {
      crearinventario_recuento.this.aP10 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
      return aP10[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        int[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        java.util.Date[] aP6 ,
                        java.util.Date[] aP7 ,
                        String[] aP8 ,
                        String[] aP9 ,
                        short[] aP10 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             int[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             java.util.Date[] aP6 ,
                             java.util.Date[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             short[] aP10 )
   {
      crearinventario_recuento.this.AV8EmprCod = aP0[0];
      this.aP0 = aP0;
      crearinventario_recuento.this.AV21PrdNum_inicial = aP1[0];
      this.aP1 = aP1;
      crearinventario_recuento.this.AV11PrdNum_to2 = aP2[0];
      this.aP2 = aP2;
      crearinventario_recuento.this.AV12PrvNum = aP3[0];
      this.aP3 = aP3;
      crearinventario_recuento.this.AV13PrvNum_to2 = aP4[0];
      this.aP4 = aP4;
      crearinventario_recuento.this.AV31Informe = aP5[0];
      this.aP5 = aP5;
      crearinventario_recuento.this.AV9FecRec = aP6[0];
      this.aP6 = aP6;
      crearinventario_recuento.this.AV15Recfechr = aP7[0];
      this.aP7 = aP7;
      crearinventario_recuento.this.AV22Usurcod = aP8[0];
      this.aP8 = aP8;
      crearinventario_recuento.this.AV23Station = aP9[0];
      this.aP9 = aP9;
      crearinventario_recuento.this.aP10 = aP10;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV34NumeroPases = (short)(0) ;
      AV20Texto_i = httpContext.getMessage( "Wrecuen. Inicio.Ajustes RESERVAS", "") + httpContext.getMessage( " Intervalo Productos =", "") + GXutil.trim( AV21PrdNum_inicial) + "-" + AV11PrdNum_to2 ;
      AV20Texto_i += httpContext.getMessage( "Intervalo Proveedores=", "") + GXutil.trim( GXutil.str( AV12PrvNum, 6, 0)) + "-" + GXutil.trim( GXutil.str( AV13PrvNum_to2, 6, 0)) ;
      new app.pctrinc(remoteHandle, context).execute( AV8EmprCod, GXutil.substring( AV38Pgmname, 1, 10), AV22Usurcod, AV23Station, AV20Texto_i, 99999999, (byte)(0), "@") ;
      GXv_char1[0] = AV8EmprCod ;
      GXv_char2[0] = AV21PrdNum_inicial ;
      GXv_char3[0] = AV11PrdNum_to2 ;
      new app.preserv1(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_char3) ;
      crearinventario_recuento.this.AV8EmprCod = GXv_char1[0] ;
      crearinventario_recuento.this.AV21PrdNum_inicial = GXv_char2[0] ;
      crearinventario_recuento.this.AV11PrdNum_to2 = GXv_char3[0] ;
      new app.pcommit(remoteHandle, context).execute( ) ;
      AV34NumeroPases = (short)(AV34NumeroPases+1) ;
      GXv_char3[0] = AV8EmprCod ;
      GXv_char2[0] = AV21PrdNum_inicial ;
      GXv_char1[0] = AV11PrdNum_to2 ;
      new app.preserv2(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_char1) ;
      crearinventario_recuento.this.AV8EmprCod = GXv_char3[0] ;
      crearinventario_recuento.this.AV21PrdNum_inicial = GXv_char2[0] ;
      crearinventario_recuento.this.AV11PrdNum_to2 = GXv_char1[0] ;
      new app.pcommit(remoteHandle, context).execute( ) ;
      AV34NumeroPases = (short)(AV34NumeroPases+1) ;
      AV20Texto_i = httpContext.getMessage( "Wrecuen. Fin.Ajustes RESERVAS", "") + httpContext.getMessage( " Intervalo Productos =", "") + GXutil.trim( AV21PrdNum_inicial) + "-" + AV11PrdNum_to2 ;
      AV20Texto_i += httpContext.getMessage( "Intervalo Proveedores=", "") + GXutil.trim( GXutil.str( AV12PrvNum, 6, 0)) + "-" + GXutil.trim( GXutil.str( AV13PrvNum_to2, 6, 0)) ;
      new app.pctrinc(remoteHandle, context).execute( AV8EmprCod, GXutil.substring( AV38Pgmname, 1, 10), AV22Usurcod, AV23Station, AV20Texto_i, 99999999, (byte)(0), "@") ;
      AV25ActDatos = httpContext.getMessage( "S", "") ;
      AV24File = "" ;
      httpContext.wjLoc = formatLink("app.apupq001", new String[] {GXutil.URLEncode(GXutil.rtrim(AV8EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV21PrdNum_inicial)),GXutil.URLEncode(GXutil.rtrim(AV11PrdNum_to2)),GXutil.URLEncode(GXutil.rtrim(AV16Siacumular)),GXutil.URLEncode(GXutil.rtrim(AV25ActDatos)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.rtrim(AV24File)),GXutil.URLEncode(GXutil.rtrim(GXutil.substring( AV38Pgmname, 1, 10)))}, new String[] {"Emprcod","Prdnum1","Prdnum2","Siacumular","ActDatos","CantCierre","File","PgmnameOut"})  ;
      AV34NumeroPases = (short)(AV34NumeroPases+1) ;
      AV20Texto_i = httpContext.getMessage( "Wrecuen. Inicio auditoria Productos", "") + httpContext.getMessage( " Intervalo Productos =", "") + GXutil.trim( AV21PrdNum_inicial) + "-" + AV11PrdNum_to2 ;
      AV20Texto_i += httpContext.getMessage( "Intervalo Proveedores=", "") + GXutil.trim( GXutil.str( AV12PrvNum, 6, 0)) + "-" + GXutil.trim( GXutil.str( AV13PrvNum_to2, 6, 0)) ;
      new app.pctrinc(remoteHandle, context).execute( AV8EmprCod, GXutil.substring( AV38Pgmname, 1, 10), AV22Usurcod, AV23Station, AV20Texto_i, 99999999, (byte)(0), "@") ;
      GX_I = 1 ;
      while ( GX_I <= 10000 )
      {
         AV18Tab_upq[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV26i = (short)(1) ;
      /* Using cursor P093U2 */
      pr_default.execute(0, new Object[] {AV8EmprCod, AV21PrdNum_inicial, AV11PrdNum_to2});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A719PrdNum = P093U2_A719PrdNum[0] ;
         A396EmprCod = P093U2_A396EmprCod[0] ;
         if ( AV26i > 10000 )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Maximo 10000 productos quimicos", ""));
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         AV18Tab_upq[AV26i-1] = A719PrdNum ;
         AV26i = (short)(AV26i+1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV26i = (short)(1) ;
      while ( AV26i <= 10000 )
      {
         if ( GXutil.strcmp(AV18Tab_upq[AV26i-1], " ") == 0 )
         {
            if (true) break;
         }
         AV27Prdnum_tab = AV18Tab_upq[AV26i-1] ;
         GXv_char3[0] = AV8EmprCod ;
         GXv_char2[0] = AV27Prdnum_tab ;
         GXv_char1[0] = AV16Siacumular ;
         GXv_decimal4[0] = AV28Dif ;
         GXv_decimal5[0] = AV29Dif2 ;
         GXv_char6[0] = AV35obs ;
         new app.pupq003(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_char1, GXv_decimal4, GXv_decimal5, GXv_char6) ;
         crearinventario_recuento.this.AV8EmprCod = GXv_char3[0] ;
         crearinventario_recuento.this.AV27Prdnum_tab = GXv_char2[0] ;
         crearinventario_recuento.this.AV16Siacumular = GXv_char1[0] ;
         crearinventario_recuento.this.AV28Dif = GXv_decimal4[0] ;
         crearinventario_recuento.this.AV29Dif2 = GXv_decimal5[0] ;
         crearinventario_recuento.this.AV35obs = GXv_char6[0] ;
         GXv_char6[0] = AV8EmprCod ;
         GXv_char3[0] = AV27Prdnum_tab ;
         GXv_decimal5[0] = AV28Dif ;
         GXv_decimal4[0] = AV29Dif2 ;
         GXv_char2[0] = AV35obs ;
         new app.pupq002(remoteHandle, context).execute( GXv_char6, GXv_char3, GXv_decimal5, GXv_decimal4, GXv_char2) ;
         crearinventario_recuento.this.AV8EmprCod = GXv_char6[0] ;
         crearinventario_recuento.this.AV27Prdnum_tab = GXv_char3[0] ;
         crearinventario_recuento.this.AV28Dif = GXv_decimal5[0] ;
         crearinventario_recuento.this.AV29Dif2 = GXv_decimal4[0] ;
         crearinventario_recuento.this.AV35obs = GXv_char2[0] ;
         new app.pcommit(remoteHandle, context).execute( ) ;
         GXv_char6[0] = AV8EmprCod ;
         GXv_char3[0] = AV27Prdnum_tab ;
         new app.core.upq004(remoteHandle, context).execute( GXv_char6, GXv_char3) ;
         crearinventario_recuento.this.AV8EmprCod = GXv_char6[0] ;
         crearinventario_recuento.this.AV27Prdnum_tab = GXv_char3[0] ;
         GXv_char6[0] = AV8EmprCod ;
         GXv_char3[0] = AV27Prdnum_tab ;
         GXv_char2[0] = AV16Siacumular ;
         GXv_decimal5[0] = AV28Dif ;
         GXv_decimal4[0] = AV29Dif2 ;
         GXv_char1[0] = AV35obs ;
         new app.pupq003(remoteHandle, context).execute( GXv_char6, GXv_char3, GXv_char2, GXv_decimal5, GXv_decimal4, GXv_char1) ;
         crearinventario_recuento.this.AV8EmprCod = GXv_char6[0] ;
         crearinventario_recuento.this.AV27Prdnum_tab = GXv_char3[0] ;
         crearinventario_recuento.this.AV16Siacumular = GXv_char2[0] ;
         crearinventario_recuento.this.AV28Dif = GXv_decimal5[0] ;
         crearinventario_recuento.this.AV29Dif2 = GXv_decimal4[0] ;
         crearinventario_recuento.this.AV35obs = GXv_char1[0] ;
         GXv_char6[0] = AV8EmprCod ;
         GXv_char3[0] = AV27Prdnum_tab ;
         GXv_decimal5[0] = AV28Dif ;
         GXv_decimal4[0] = AV29Dif2 ;
         GXv_char2[0] = AV35obs ;
         new app.pupq002(remoteHandle, context).execute( GXv_char6, GXv_char3, GXv_decimal5, GXv_decimal4, GXv_char2) ;
         crearinventario_recuento.this.AV8EmprCod = GXv_char6[0] ;
         crearinventario_recuento.this.AV27Prdnum_tab = GXv_char3[0] ;
         crearinventario_recuento.this.AV28Dif = GXv_decimal5[0] ;
         crearinventario_recuento.this.AV29Dif2 = GXv_decimal4[0] ;
         crearinventario_recuento.this.AV35obs = GXv_char2[0] ;
         new app.pcommit(remoteHandle, context).execute( ) ;
         GXv_char6[0] = AV8EmprCod ;
         GXv_char3[0] = AV27Prdnum_tab ;
         new app.core.upq004(remoteHandle, context).execute( GXv_char6, GXv_char3) ;
         crearinventario_recuento.this.AV8EmprCod = GXv_char6[0] ;
         crearinventario_recuento.this.AV27Prdnum_tab = GXv_char3[0] ;
         AV26i = (short)(AV26i+1) ;
      }
      AV34NumeroPases = (short)(AV34NumeroPases+1) ;
      httpContext.wjLoc = formatLink("app.apupq001", new String[] {GXutil.URLEncode(GXutil.rtrim(AV8EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV21PrdNum_inicial)),GXutil.URLEncode(GXutil.rtrim(AV11PrdNum_to2)),GXutil.URLEncode(GXutil.rtrim(AV16Siacumular)),GXutil.URLEncode(GXutil.rtrim(AV25ActDatos)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.rtrim(AV24File)),GXutil.URLEncode(GXutil.rtrim(GXutil.substring( AV38Pgmname, 1, 10)))}, new String[] {"Emprcod","Prdnum1","Prdnum2","Siacumular","ActDatos","CantCierre","File","PgmnameOut"})  ;
      AV34NumeroPases = (short)(AV34NumeroPases+1) ;
      AV20Texto_i = httpContext.getMessage( "Wrecuen. Fin auditoria Productos", "") + httpContext.getMessage( " Intervalo Productos =", "") + GXutil.trim( AV21PrdNum_inicial) + "-" + AV11PrdNum_to2 ;
      AV20Texto_i += httpContext.getMessage( "Intervalo Proveedores=", "") + GXutil.trim( GXutil.str( AV12PrvNum, 6, 0)) + "-" + GXutil.trim( GXutil.str( AV13PrvNum_to2, 6, 0)) ;
      new app.pctrinc(remoteHandle, context).execute( AV8EmprCod, GXutil.substring( AV38Pgmname, 1, 10), AV22Usurcod, AV23Station, AV20Texto_i, 99999999, (byte)(0), "@") ;
      if ( AV31Informe == 1 )
      {
         AV20Texto_i = httpContext.getMessage( "ATENCION. Informamos que con Fecha ", "") + localUtil.dtoc( AV9FecRec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + httpContext.getMessage( " ,ya se hizo un INVENTARIO.", "") + GXutil.newLine( ) ;
         AV20Texto_i += httpContext.getMessage( "SI confirma el INVENTARIO, se eliminara la informacion con Fecha ", "") + localUtil.dtoc( AV9FecRec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + httpContext.getMessage( ",dentro del intervalo seleccionado.", "") + GXutil.newLine( ) ;
         AV20Texto_i += httpContext.getMessage( "->Se confirmo el INVENTARIO", "") + GXutil.newLine( ) ;
         new app.pctrinc(remoteHandle, context).execute( AV8EmprCod, GXutil.substring( AV38Pgmname, 1, 10), AV22Usurcod, AV23Station, AV20Texto_i, 99999999, (byte)(0), "@") ;
      }
      GXv_char6[0] = AV8EmprCod ;
      GXv_char3[0] = AV21PrdNum_inicial ;
      GXv_char2[0] = AV11PrdNum_to2 ;
      GXv_int7[0] = AV12PrvNum ;
      GXv_int8[0] = AV13PrvNum_to2 ;
      GXv_int9[0] = (byte)(AV32FlagStk) ;
      new app.pinvprdd(remoteHandle, context).execute( GXv_char6, GXv_char3, GXv_char2, GXv_int7, GXv_int8, GXv_int9) ;
      crearinventario_recuento.this.AV8EmprCod = GXv_char6[0] ;
      crearinventario_recuento.this.AV21PrdNum_inicial = GXv_char3[0] ;
      crearinventario_recuento.this.AV11PrdNum_to2 = GXv_char2[0] ;
      crearinventario_recuento.this.AV12PrvNum = GXv_int7[0] ;
      crearinventario_recuento.this.AV13PrvNum_to2 = GXv_int8[0] ;
      crearinventario_recuento.this.AV32FlagStk = GXv_int9[0] ;
      AV34NumeroPases = (short)(AV34NumeroPases+1) ;
      AV20Texto_i = httpContext.getMessage( "WRecuen.Inicio.Actualizo tablas RECUEN,INVPRD", "") + httpContext.getMessage( " Intervalo Productos =", "") + GXutil.trim( AV21PrdNum_inicial) + "-" + AV11PrdNum_to2 ;
      AV20Texto_i += httpContext.getMessage( "Intervalo Proveedores=", "") + GXutil.trim( GXutil.str( AV12PrvNum, 6, 0)) + "-" + GXutil.trim( GXutil.str( AV13PrvNum_to2, 6, 0)) ;
      new app.pctrinc(remoteHandle, context).execute( AV8EmprCod, GXutil.substring( AV38Pgmname, 1, 10), AV22Usurcod, AV23Station, AV20Texto_i, 99999999, (byte)(0), "@") ;
      GXv_char6[0] = AV8EmprCod ;
      GXv_char3[0] = AV21PrdNum_inicial ;
      GXv_char2[0] = AV11PrdNum_to2 ;
      GXv_int8[0] = AV12PrvNum ;
      GXv_int7[0] = AV13PrvNum_to2 ;
      GXv_int9[0] = (byte)(AV32FlagStk) ;
      GXv_date10[0] = AV9FecRec ;
      GXv_dtime11[0] = AV15Recfechr ;
      new app.precuen(remoteHandle, context).execute( GXv_char6, GXv_char3, GXv_char2, GXv_int8, GXv_int7, GXv_int9, GXv_date10, GXv_dtime11) ;
      crearinventario_recuento.this.AV8EmprCod = GXv_char6[0] ;
      crearinventario_recuento.this.AV21PrdNum_inicial = GXv_char3[0] ;
      crearinventario_recuento.this.AV11PrdNum_to2 = GXv_char2[0] ;
      crearinventario_recuento.this.AV12PrvNum = GXv_int8[0] ;
      crearinventario_recuento.this.AV13PrvNum_to2 = GXv_int7[0] ;
      crearinventario_recuento.this.AV32FlagStk = GXv_int9[0] ;
      crearinventario_recuento.this.AV9FecRec = GXv_date10[0] ;
      crearinventario_recuento.this.AV15Recfechr = GXv_dtime11[0] ;
      AV34NumeroPases = (short)(AV34NumeroPases+1) ;
      AV20Texto_i = httpContext.getMessage( "WRecuen.Fin.Actualizo tablas RECUEN,INVPRD", "") + httpContext.getMessage( " Intervalo Productos =", "") + GXutil.trim( AV33PrdNum) + "-" + AV11PrdNum_to2 ;
      AV20Texto_i += httpContext.getMessage( "Intervalo Proveedores=", "") + GXutil.trim( GXutil.str( AV12PrvNum, 6, 0)) + "-" + GXutil.trim( GXutil.str( AV13PrvNum_to2, 6, 0)) ;
      new app.pctrinc(remoteHandle, context).execute( AV8EmprCod, GXutil.substring( AV38Pgmname, 1, 10), AV22Usurcod, AV23Station, AV20Texto_i, 99999999, (byte)(0), "@") ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = crearinventario_recuento.this.AV8EmprCod;
      this.aP1[0] = crearinventario_recuento.this.AV21PrdNum_inicial;
      this.aP2[0] = crearinventario_recuento.this.AV11PrdNum_to2;
      this.aP3[0] = crearinventario_recuento.this.AV12PrvNum;
      this.aP4[0] = crearinventario_recuento.this.AV13PrvNum_to2;
      this.aP5[0] = crearinventario_recuento.this.AV31Informe;
      this.aP6[0] = crearinventario_recuento.this.AV9FecRec;
      this.aP7[0] = crearinventario_recuento.this.AV15Recfechr;
      this.aP8[0] = crearinventario_recuento.this.AV22Usurcod;
      this.aP9[0] = crearinventario_recuento.this.AV23Station;
      this.aP10[0] = crearinventario_recuento.this.AV34NumeroPases;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV20Texto_i = "" ;
      AV38Pgmname = "" ;
      AV25ActDatos = "" ;
      AV24File = "" ;
      AV16Siacumular = "" ;
      AV18Tab_upq = new String[10000] ;
      GX_I = 1 ;
      while ( GX_I <= 10000 )
      {
         AV18Tab_upq[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      scmdbuf = "" ;
      P093U2_A719PrdNum = new String[] {""} ;
      P093U2_A396EmprCod = new String[] {""} ;
      A719PrdNum = "" ;
      A396EmprCod = "" ;
      AV27Prdnum_tab = "" ;
      AV28Dif = DecimalUtil.ZERO ;
      AV29Dif2 = DecimalUtil.ZERO ;
      AV35obs = "" ;
      GXv_char1 = new String[1] ;
      GXv_decimal5 = new java.math.BigDecimal[1] ;
      GXv_decimal4 = new java.math.BigDecimal[1] ;
      GXv_char6 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int8 = new int[1] ;
      GXv_int7 = new int[1] ;
      GXv_int9 = new byte[1] ;
      GXv_date10 = new java.util.Date[1] ;
      GXv_dtime11 = new java.util.Date[1] ;
      AV33PrdNum = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.core.crearinventario_recuento__default(),
         new Object[] {
             new Object[] {
            P093U2_A719PrdNum, P093U2_A396EmprCod
            }
         }
      );
      AV38Pgmname = "Core.CrearInventario_recuento" ;
      /* GeneXus formulas. */
      AV38Pgmname = "Core.CrearInventario_recuento" ;
      Gx_err = (short)(0) ;
   }

   private byte AV31Informe ;
   private byte GXv_int9[] ;
   private short AV34NumeroPases ;
   private short AV26i ;
   private short AV32FlagStk ;
   private short Gx_err ;
   private int AV12PrvNum ;
   private int AV13PrvNum_to2 ;
   private int GX_I ;
   private int GXv_int8[] ;
   private int GXv_int7[] ;
   private java.math.BigDecimal AV28Dif ;
   private java.math.BigDecimal AV29Dif2 ;
   private java.math.BigDecimal GXv_decimal5[] ;
   private java.math.BigDecimal GXv_decimal4[] ;
   private String AV8EmprCod ;
   private String AV21PrdNum_inicial ;
   private String AV11PrdNum_to2 ;
   private String AV22Usurcod ;
   private String AV23Station ;
   private String AV38Pgmname ;
   private String AV25ActDatos ;
   private String AV16Siacumular ;
   private String AV18Tab_upq[] ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A396EmprCod ;
   private String AV27Prdnum_tab ;
   private String AV35obs ;
   private String GXv_char1[] ;
   private String GXv_char6[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String AV33PrdNum ;
   private java.util.Date AV15Recfechr ;
   private java.util.Date GXv_dtime11[] ;
   private java.util.Date AV9FecRec ;
   private java.util.Date GXv_date10[] ;
   private String AV20Texto_i ;
   private String AV24File ;
   private short[] aP10 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private int[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private java.util.Date[] aP6 ;
   private java.util.Date[] aP7 ;
   private String[] aP8 ;
   private String[] aP9 ;
   private IDataStoreProvider pr_default ;
   private String[] P093U2_A719PrdNum ;
   private String[] P093U2_A396EmprCod ;
}

final  class crearinventario_recuento__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P093U2", "SELECT PrdNum, EmprCod FROM TXPPRODUC WHERE (EmprCod = ? and PrdNum >= ?) AND (LENGTH(RTRIM(RTRIM(LTRIM(PrdNum)))) >= 5) AND (PrdNum <= ?) ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
      }
   }

}

