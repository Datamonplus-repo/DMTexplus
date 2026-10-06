package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class apupq001_impl extends GXWebProcedure
{
   public apupq001_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public void webExecute( )
   {
      if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
      {
         gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", httpContext.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(httpContext.getHttpSecure( ))) ;
      }
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      entryPointCalled = false ;
      gxfirstwebparm = httpContext.GetFirstPar( "Emprcod") ;
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( ! entryPointCalled )
      {
         AV63Emprcod = gxfirstwebparm ;
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV82Prdnum1 = httpContext.GetPar( "Prdnum1") ;
            AV83Prdnum2 = httpContext.GetPar( "Prdnum2") ;
            AV87Siacumular = httpContext.GetPar( "Siacumular") ;
            AV49ActDatos = httpContext.GetPar( "ActDatos") ;
            AV50CantCierre = CommonUtil.decimalVal( httpContext.GetPar( "CantCierre"), ".") ;
            AV70File = httpContext.GetPar( "File") ;
            AV78PgmnameOut = httpContext.GetPar( "PgmnameOut") ;
         }
      }
      if ( toggleJsOutput )
      {
      }
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV91UsurCod = " " ;
      GXt_char1 = AV90Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      apupq001_impl.this.GXt_char1 = GXv_char2[0] ;
      AV90Station = GXt_char1 ;
      GXv_char2[0] = AV63Emprcod ;
      GXv_char3[0] = AV64EmprNom ;
      GXv_char4[0] = AV91UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV90Station, GXv_char2, GXv_char3, GXv_char4) ;
      apupq001_impl.this.AV63Emprcod = GXv_char2[0] ;
      apupq001_impl.this.AV64EmprNom = GXv_char3[0] ;
      apupq001_impl.this.AV91UsurCod = GXv_char4[0] ;
      GXt_int5 = AV60Cotexsur ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV63Emprcod, httpContext.getMessage( "COTEXS", ""), GXv_int6) ;
      apupq001_impl.this.GXt_int5 = GXv_int6[0] ;
      AV60Cotexsur = GXt_int5 ;
      AV71Hhmmss = GXutil.serverNow( context, remoteHandle, pr_default) ;
      AV74Nominf = GXutil.trim( AV78PgmnameOut) + "_" + GXutil.padl( GXutil.trim( GXutil.substring( localUtil.ttoc( AV71Hhmmss, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), 1, 2)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.substring( localUtil.ttoc( AV71Hhmmss, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), 4, 2)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.substring( localUtil.ttoc( AV71Hhmmss, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), 7, 2)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.substring( localUtil.ttoc( AV71Hhmmss, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), 1, 2)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.substring( localUtil.ttoc( AV71Hhmmss, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), 4, 2)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.substring( localUtil.ttoc( AV71Hhmmss, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), 7, 2)), (short)(2), "0") ;
      /* Execute user subroutine: 'OPENDOCUMENT' */
      S131 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITECOLUMNTITLES' */
      S151 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV98i = (short)(0) ;
      AV79Prdexialm = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P05KC2 */
      pr_default.execute(0, new Object[] {AV63Emprcod, AV82Prdnum1, AV83Prdnum2});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A856ValCod = P05KC2_A856ValCod[0] ;
         A719PrdNum = P05KC2_A719PrdNum[0] ;
         A396EmprCod = P05KC2_A396EmprCod[0] ;
         A704PrdExiAlm = P05KC2_A704PrdExiAlm[0] ;
         A718PrdNom = P05KC2_A718PrdNom[0] ;
         AV81Prdnum = A719PrdNum ;
         AV79Prdexialm = A704PrdExiAlm ;
         AV80prdNom = A718PrdNom ;
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
      /* Execute user subroutine: 'CLOSEDOCUMENT' */
      S161 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      httpContext.nUserReturn = (byte)(1) ;
      if ( httpContext.willRedirect( ) )
      {
         httpContext.redirect( httpContext.wjLoc );
         httpContext.wjLoc = "" ;
      }
      if ( httpContext.willRedirect( ) )
      {
         httpContext.redirect( httpContext.wjLoc );
         httpContext.wjLoc = "" ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'PROCESAMOS' Routine */
      returnInSub = false ;
      AV88SiInventario = (byte)(0) ;
      AV67EntUniRem = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P05KC3 */
      pr_default.execute(1, new Object[] {AV63Emprcod, AV81Prdnum});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A411EntCon = P05KC3_A411EntCon[0] ;
         A719PrdNum = P05KC3_A719PrdNum[0] ;
         A396EmprCod = P05KC3_A396EmprCod[0] ;
         A5686EntLotN = P05KC3_A5686EntLotN[0] ;
         A5691EntBnc = P05KC3_A5691EntBnc[0] ;
         A419EntUniRem = P05KC3_A419EntUniRem[0] ;
         A597LinEnt = P05KC3_A597LinEnt[0] ;
         AV67EntUniRem = AV67EntUniRem.add((((AV60Cotexsur==0) ? A419EntUniRem : ((GXutil.strcmp(A5691EntBnc, httpContext.getMessage( "ENVIADO", ""))==0)&&(GXutil.strcmp(A5686EntLotN, httpContext.getMessage( "CERRADO", ""))==0) ? A419EntUniRem : DecimalUtil.doubleToDec(0))))) ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
      AV85Recfec = GXutil.nullDate() ;
      AV84RecExiRea = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P05KC4 */
      pr_default.execute(2, new Object[] {AV63Emprcod, AV81Prdnum});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A396EmprCod = P05KC4_A396EmprCod[0] ;
         A719PrdNum = P05KC4_A719PrdNum[0] ;
         A807RecExiRea = P05KC4_A807RecExiRea[0] ;
         A810RecFec = P05KC4_A810RecFec[0] ;
         AV85Recfec = A810RecFec ;
         AV84RecExiRea = A807RecExiRea ;
         AV88SiInventario = (byte)(1) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(2);
      }
      pr_default.close(2);
      AV66Entradas = DecimalUtil.doubleToDec(0) ;
      AV86Salidas = DecimalUtil.doubleToDec(0) ;
      AV56CCstklin = 0 ;
      if ( AV88SiInventario == 1 )
      {
         /* Using cursor P05KC5 */
         pr_default.execute(3, new Object[] {AV63Emprcod, AV81Prdnum, AV85Recfec});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A396EmprCod = P05KC5_A396EmprCod[0] ;
            A719PrdNum = P05KC5_A719PrdNum[0] ;
            A3348CCStkFec = P05KC5_A3348CCStkFec[0] ;
            A3345TipMovCc = P05KC5_A3345TipMovCc[0] ;
            A3342CCStkLin = P05KC5_A3342CCStkLin[0] ;
            A3356CCStkHor = P05KC5_A3356CCStkHor[0] ;
            if ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SR", "")) == 0 )
            {
               AV55CCStkHor = A3356CCStkHor ;
               AV56CCstklin = A3342CCStkLin ;
            }
            pr_default.readNext(3);
         }
         pr_default.close(3);
         /* Using cursor P05KC6 */
         pr_default.execute(4, new Object[] {AV63Emprcod, AV81Prdnum, AV85Recfec});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A396EmprCod = P05KC6_A396EmprCod[0] ;
            A719PrdNum = P05KC6_A719PrdNum[0] ;
            A3348CCStkFec = P05KC6_A3348CCStkFec[0] ;
            A3345TipMovCc = P05KC6_A3345TipMovCc[0] ;
            A3343CCStkCanE = P05KC6_A3343CCStkCanE[0] ;
            A3344CCStkCanS = P05KC6_A3344CCStkCanS[0] ;
            A3356CCStkHor = P05KC6_A3356CCStkHor[0] ;
            A3342CCStkLin = P05KC6_A3342CCStkLin[0] ;
            if ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SR", "")) == 0 )
            {
            }
            else
            {
               AV66Entradas = AV66Entradas.add((((GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "EN", ""))==0) ? A3343CCStkCanE : DecimalUtil.doubleToDec(0)))) ;
               AV86Salidas = AV86Salidas.add((((GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SC", ""))==0)||(GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SM", ""))==0)||(GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SD", ""))==0)||(GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SP", ""))==0) ? A3344CCStkCanS : DecimalUtil.doubleToDec(0)))) ;
            }
            pr_default.readNext(4);
         }
         pr_default.close(4);
      }
      else
      {
         /* Using cursor P05KC7 */
         pr_default.execute(5, new Object[] {AV63Emprcod, AV81Prdnum});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A396EmprCod = P05KC7_A396EmprCod[0] ;
            A719PrdNum = P05KC7_A719PrdNum[0] ;
            A3356CCStkHor = P05KC7_A3356CCStkHor[0] ;
            A3348CCStkFec = P05KC7_A3348CCStkFec[0] ;
            A3342CCStkLin = P05KC7_A3342CCStkLin[0] ;
            AV56CCstklin = 5 ;
            AV85Recfec = A3348CCStkFec ;
            AV55CCStkHor = A3356CCStkHor ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(5);
         }
         pr_default.close(5);
      }
      AV85Recfec = (GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV85Recfec)) ? Gx_date : AV85Recfec) ;
      AV51CantInv = DecimalUtil.doubleToDec(0) ;
      AV58Consumos = DecimalUtil.doubleToDec(0) ;
      AV57Compras = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P05KC8 */
      pr_default.execute(6, new Object[] {AV63Emprcod, AV81Prdnum, AV85Recfec});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A396EmprCod = P05KC8_A396EmprCod[0] ;
         A719PrdNum = P05KC8_A719PrdNum[0] ;
         A3348CCStkFec = P05KC8_A3348CCStkFec[0] ;
         A3345TipMovCc = P05KC8_A3345TipMovCc[0] ;
         A3343CCStkCanE = P05KC8_A3343CCStkCanE[0] ;
         A3344CCStkCanS = P05KC8_A3344CCStkCanS[0] ;
         A3356CCStkHor = P05KC8_A3356CCStkHor[0] ;
         A3342CCStkLin = P05KC8_A3342CCStkLin[0] ;
         if ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SR", "")) == 0 )
         {
            AV54Ccstkfec = A3348CCStkFec ;
            /* Execute user subroutine: 'INVENTARIO' */
            S128 ();
            if ( returnInSub )
            {
               pr_default.close(6);
               returnInSub = true;
               if (true) return;
            }
            AV58Consumos = DecimalUtil.doubleToDec(0) ;
            AV57Compras = DecimalUtil.doubleToDec(0) ;
         }
         else
         {
            AV57Compras = AV57Compras.add((((GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "EN", ""))==0) ? A3343CCStkCanE : DecimalUtil.doubleToDec(0)))) ;
            AV58Consumos = AV58Consumos.add((((GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SC", ""))==0)||(GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SM", ""))==0)||(GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SD", ""))==0)||(GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SP", ""))==0) ? A3344CCStkCanS : DecimalUtil.doubleToDec(0)))) ;
         }
         pr_default.readNext(6);
      }
      pr_default.close(6);
      AV69ExisCalculadas = ((GXutil.strcmp(AV87Siacumular, httpContext.getMessage( "N", ""))==0) ? AV51CantInv.add(AV57Compras).subtract(AV58Consumos) : AV51CantInv.subtract(AV86Salidas).add(AV57Compras).subtract(AV58Consumos)) ;
      AV61Dif = AV79Prdexialm.subtract(AV69ExisCalculadas) ;
      AV62Dif2 = ((AV67EntUniRem.doubleValue()>0) ? AV69ExisCalculadas.subtract(AV67EntUniRem) : DecimalUtil.doubleToDec(0)) ;
      AV75Obs = ((AV88SiInventario==0) ? httpContext.getMessage( "Nunca se hizo Inventario", "") : "") ;
      AV96TextFileLine = "" ;
      AV96TextFileLine += AV81Prdnum ;
      AV96TextFileLine += ";" ;
      AV96TextFileLine += A718PrdNom ;
      AV96TextFileLine += ";" ;
      AV96TextFileLine += GXutil.str( AV66Entradas, 12, 4) ;
      AV96TextFileLine += ";" ;
      AV96TextFileLine += GXutil.str( AV86Salidas, 12, 4) ;
      AV96TextFileLine += ";" ;
      AV96TextFileLine += localUtil.dtoc( AV85Recfec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
      AV96TextFileLine += ";" ;
      AV96TextFileLine += GXutil.str( AV51CantInv, 12, 4) ;
      AV96TextFileLine += ";" ;
      AV96TextFileLine += GXutil.str( AV57Compras, 12, 4) ;
      AV96TextFileLine += ";" ;
      AV96TextFileLine += GXutil.str( AV58Consumos, 12, 4) ;
      AV96TextFileLine += ";" ;
      AV96TextFileLine += GXutil.str( AV79Prdexialm, 12, 4) ;
      AV96TextFileLine += ";" ;
      AV96TextFileLine += GXutil.str( AV69ExisCalculadas, 12, 4) ;
      AV96TextFileLine += ";" ;
      AV96TextFileLine += GXutil.str( AV61Dif, 12, 4) ;
      AV96TextFileLine += ";" ;
      AV96TextFileLine += GXutil.str( AV67EntUniRem, 11, 4) ;
      AV96TextFileLine += ";" ;
      AV96TextFileLine += GXutil.str( AV62Dif2, 12, 4) ;
      AV96TextFileLine += ";" ;
      AV96TextFileLine += AV75Obs ;
      AV96TextFileLine += ";" ;
      AV96TextFileLine += GXutil.str( AV50CantCierre, 11, 3) ;
      if ( GXutil.len( AV96TextFileLine) > 0 )
      {
         AV93TextFile.writeLine(AV96TextFileLine);
      }
   }

   public void S128( )
   {
      /* 'INVENTARIO' Routine */
      returnInSub = false ;
      AV51CantInv = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P05KC9 */
      pr_default.execute(7, new Object[] {AV63Emprcod, AV81Prdnum, AV54Ccstkfec});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A810RecFec = P05KC9_A810RecFec[0] ;
         A719PrdNum = P05KC9_A719PrdNum[0] ;
         A396EmprCod = P05KC9_A396EmprCod[0] ;
         A807RecExiRea = P05KC9_A807RecExiRea[0] ;
         AV51CantInv = A807RecExiRea ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(7);
   }

   public void S131( )
   {
      /* 'OPENDOCUMENT' Routine */
      returnInSub = false ;
      AV95Filename = " " ;
      AV97Random = (int)(GXutil.random( )*10000) ;
      AV95Filename = GXutil.trim( AV74Nominf) + "-" + GXutil.trim( GXutil.str( AV97Random, 8, 0)) + ".csv" ;
      AV70File = GXutil.trim( AV74Nominf) + "-" + GXutil.trim( GXutil.str( AV97Random, 8, 0)) + ".csv" ;
      AV93TextFile.setSource( AV95Filename );
      AV93TextFile.create();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S141 ();
      if (returnInSub) return;
      AV93TextFile.openWrite("");
      /* Execute user subroutine: 'CHECKSTATUS' */
      S141 ();
      if (returnInSub) return;
   }

   public void S151( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV96TextFileLine = "" ;
      AV96TextFileLine += httpContext.getMessage( "Producto", "") ;
      AV96TextFileLine += ";" ;
      AV96TextFileLine += httpContext.getMessage( "Descripcion", "") ;
      AV96TextFileLine += ";" ;
      AV96TextFileLine += httpContext.getMessage( "Compras Ant Inv?", "") ;
      AV96TextFileLine += ";" ;
      AV96TextFileLine += httpContext.getMessage( "Salidas Ant Inv?", "") ;
      AV96TextFileLine += ";" ;
      AV96TextFileLine += httpContext.getMessage( "Fecha Inv", "") ;
      AV96TextFileLine += ";" ;
      AV96TextFileLine += httpContext.getMessage( "Cant Inv", "") ;
      AV96TextFileLine += ";" ;
      AV96TextFileLine += httpContext.getMessage( "Compras", "") ;
      AV96TextFileLine += ";" ;
      AV96TextFileLine += httpContext.getMessage( "Consumos", "") ;
      AV96TextFileLine += ";" ;
      AV96TextFileLine += httpContext.getMessage( "Exis (BaseDatos)", "") ;
      AV96TextFileLine += ";" ;
      AV96TextFileLine += httpContext.getMessage( "Exis Calc", "") ;
      AV96TextFileLine += ";" ;
      AV96TextFileLine += httpContext.getMessage( "Diferencia", "") ;
      AV96TextFileLine += ";" ;
      AV96TextFileLine += httpContext.getMessage( "Saldo Compras", "") ;
      AV96TextFileLine += ";" ;
      AV96TextFileLine += httpContext.getMessage( "Diferencia", "") ;
      AV96TextFileLine += ";" ;
      AV96TextFileLine += httpContext.getMessage( "Observacion", "") ;
      if ( GXutil.len( AV96TextFileLine) > 0 )
      {
         AV93TextFile.writeLine(AV96TextFileLine);
      }
   }

   public void S141( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV93TextFile.getErrCode() != 0 )
      {
         AV95Filename = "" ;
         AV94ErrorMessage = AV93TextFile.getErrDescription() ;
         AV93TextFile.close();
         AV92HttpResponse.addString(AV94ErrorMessage);
         httpContext.nUserReturn = (byte)(1) ;
         if ( httpContext.willRedirect( ) )
         {
            httpContext.redirect( httpContext.wjLoc );
            httpContext.wjLoc = "" ;
         }
         returnInSub = true;
         if (true) return;
      }
   }

   public void S161( )
   {
      /* 'CLOSEDOCUMENT' Routine */
      returnInSub = false ;
      AV93TextFile.close();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S141 ();
      if (returnInSub) return;
      if ( AV93TextFile.getErrCode() == 0 )
      {
         if ( ! httpContext.isAjaxRequest( ) )
         {
            AV92HttpResponse.addHeader("Content-Type", "text/csv");
         }
         if ( ! httpContext.isAjaxRequest( ) )
         {
            AV92HttpResponse.addHeader("Content-Disposition", "attachment;filename="+GXutil.trim( AV70File));
         }
         AV92HttpResponse.addFile(AV93TextFile.getAbsoluteName());
      }
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      super.cleanup();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXKey = "" ;
      gxfirstwebparm = "" ;
      AV63Emprcod = "" ;
      AV82Prdnum1 = "" ;
      AV83Prdnum2 = "" ;
      AV87Siacumular = "" ;
      AV49ActDatos = "" ;
      AV50CantCierre = DecimalUtil.ZERO ;
      AV70File = "" ;
      AV78PgmnameOut = "" ;
      AV91UsurCod = "" ;
      AV90Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV64EmprNom = "" ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int6 = new byte[1] ;
      AV71Hhmmss = GXutil.resetTime( GXutil.nullDate() );
      AV74Nominf = "" ;
      AV79Prdexialm = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P05KC2_A856ValCod = new byte[1] ;
      P05KC2_A719PrdNum = new String[] {""} ;
      P05KC2_A396EmprCod = new String[] {""} ;
      P05KC2_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05KC2_A718PrdNom = new String[] {""} ;
      A719PrdNum = "" ;
      A396EmprCod = "" ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A718PrdNom = "" ;
      AV81Prdnum = "" ;
      AV80prdNom = "" ;
      AV67EntUniRem = DecimalUtil.ZERO ;
      P05KC3_A411EntCon = new byte[1] ;
      P05KC3_A719PrdNum = new String[] {""} ;
      P05KC3_A396EmprCod = new String[] {""} ;
      P05KC3_A5686EntLotN = new String[] {""} ;
      P05KC3_A5691EntBnc = new String[] {""} ;
      P05KC3_A419EntUniRem = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05KC3_A597LinEnt = new short[1] ;
      A5686EntLotN = "" ;
      A5691EntBnc = "" ;
      A419EntUniRem = DecimalUtil.ZERO ;
      AV85Recfec = GXutil.nullDate() ;
      AV84RecExiRea = DecimalUtil.ZERO ;
      P05KC4_A396EmprCod = new String[] {""} ;
      P05KC4_A719PrdNum = new String[] {""} ;
      P05KC4_A807RecExiRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05KC4_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      A807RecExiRea = DecimalUtil.ZERO ;
      A810RecFec = GXutil.nullDate() ;
      AV66Entradas = DecimalUtil.ZERO ;
      AV86Salidas = DecimalUtil.ZERO ;
      P05KC5_A396EmprCod = new String[] {""} ;
      P05KC5_A719PrdNum = new String[] {""} ;
      P05KC5_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P05KC5_A3345TipMovCc = new String[] {""} ;
      P05KC5_A3342CCStkLin = new long[1] ;
      P05KC5_A3356CCStkHor = new String[] {""} ;
      A3348CCStkFec = GXutil.nullDate() ;
      A3345TipMovCc = "" ;
      A3356CCStkHor = "" ;
      AV55CCStkHor = "" ;
      P05KC6_A396EmprCod = new String[] {""} ;
      P05KC6_A719PrdNum = new String[] {""} ;
      P05KC6_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P05KC6_A3345TipMovCc = new String[] {""} ;
      P05KC6_A3343CCStkCanE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05KC6_A3344CCStkCanS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05KC6_A3356CCStkHor = new String[] {""} ;
      P05KC6_A3342CCStkLin = new long[1] ;
      A3343CCStkCanE = DecimalUtil.ZERO ;
      A3344CCStkCanS = DecimalUtil.ZERO ;
      P05KC7_A396EmprCod = new String[] {""} ;
      P05KC7_A719PrdNum = new String[] {""} ;
      P05KC7_A3356CCStkHor = new String[] {""} ;
      P05KC7_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P05KC7_A3342CCStkLin = new long[1] ;
      Gx_date = GXutil.nullDate() ;
      AV51CantInv = DecimalUtil.ZERO ;
      AV58Consumos = DecimalUtil.ZERO ;
      AV57Compras = DecimalUtil.ZERO ;
      P05KC8_A396EmprCod = new String[] {""} ;
      P05KC8_A719PrdNum = new String[] {""} ;
      P05KC8_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P05KC8_A3345TipMovCc = new String[] {""} ;
      P05KC8_A3343CCStkCanE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05KC8_A3344CCStkCanS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05KC8_A3356CCStkHor = new String[] {""} ;
      P05KC8_A3342CCStkLin = new long[1] ;
      AV54Ccstkfec = GXutil.nullDate() ;
      AV69ExisCalculadas = DecimalUtil.ZERO ;
      AV61Dif = DecimalUtil.ZERO ;
      AV62Dif2 = DecimalUtil.ZERO ;
      AV75Obs = "" ;
      AV96TextFileLine = "" ;
      AV93TextFile = new com.genexus.util.GXFile();
      P05KC9_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P05KC9_A719PrdNum = new String[] {""} ;
      P05KC9_A396EmprCod = new String[] {""} ;
      P05KC9_A807RecExiRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV95Filename = "" ;
      AV94ErrorMessage = "" ;
      AV92HttpResponse = httpContext.getHttpResponse();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apupq001__default(),
         new Object[] {
             new Object[] {
            P05KC2_A856ValCod, P05KC2_A719PrdNum, P05KC2_A396EmprCod, P05KC2_A704PrdExiAlm, P05KC2_A718PrdNom
            }
            , new Object[] {
            P05KC3_A411EntCon, P05KC3_A719PrdNum, P05KC3_A396EmprCod, P05KC3_A5686EntLotN, P05KC3_A5691EntBnc, P05KC3_A419EntUniRem, P05KC3_A597LinEnt
            }
            , new Object[] {
            P05KC4_A396EmprCod, P05KC4_A719PrdNum, P05KC4_A807RecExiRea, P05KC4_A810RecFec
            }
            , new Object[] {
            P05KC5_A396EmprCod, P05KC5_A719PrdNum, P05KC5_A3348CCStkFec, P05KC5_A3345TipMovCc, P05KC5_A3342CCStkLin, P05KC5_A3356CCStkHor
            }
            , new Object[] {
            P05KC6_A396EmprCod, P05KC6_A719PrdNum, P05KC6_A3348CCStkFec, P05KC6_A3345TipMovCc, P05KC6_A3343CCStkCanE, P05KC6_A3344CCStkCanS, P05KC6_A3356CCStkHor, P05KC6_A3342CCStkLin
            }
            , new Object[] {
            P05KC7_A396EmprCod, P05KC7_A719PrdNum, P05KC7_A3356CCStkHor, P05KC7_A3348CCStkFec, P05KC7_A3342CCStkLin
            }
            , new Object[] {
            P05KC8_A396EmprCod, P05KC8_A719PrdNum, P05KC8_A3348CCStkFec, P05KC8_A3345TipMovCc, P05KC8_A3343CCStkCanE, P05KC8_A3344CCStkCanS, P05KC8_A3356CCStkHor, P05KC8_A3342CCStkLin
            }
            , new Object[] {
            P05KC9_A810RecFec, P05KC9_A719PrdNum, P05KC9_A396EmprCod, P05KC9_A807RecExiRea
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV60Cotexsur ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte A856ValCod ;
   private byte AV88SiInventario ;
   private byte A411EntCon ;
   private short gxcookieaux ;
   private short AV98i ;
   private short A597LinEnt ;
   private short Gx_err ;
   private int AV97Random ;
   private long AV56CCstklin ;
   private long A3342CCStkLin ;
   private java.math.BigDecimal AV50CantCierre ;
   private java.math.BigDecimal AV79Prdexialm ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal AV67EntUniRem ;
   private java.math.BigDecimal A419EntUniRem ;
   private java.math.BigDecimal AV84RecExiRea ;
   private java.math.BigDecimal A807RecExiRea ;
   private java.math.BigDecimal AV66Entradas ;
   private java.math.BigDecimal AV86Salidas ;
   private java.math.BigDecimal A3343CCStkCanE ;
   private java.math.BigDecimal A3344CCStkCanS ;
   private java.math.BigDecimal AV51CantInv ;
   private java.math.BigDecimal AV58Consumos ;
   private java.math.BigDecimal AV57Compras ;
   private java.math.BigDecimal AV69ExisCalculadas ;
   private java.math.BigDecimal AV61Dif ;
   private java.math.BigDecimal AV62Dif2 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV63Emprcod ;
   private String AV82Prdnum1 ;
   private String AV83Prdnum2 ;
   private String AV87Siacumular ;
   private String AV49ActDatos ;
   private String AV78PgmnameOut ;
   private String AV91UsurCod ;
   private String AV90Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV64EmprNom ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String AV74Nominf ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A396EmprCod ;
   private String A718PrdNom ;
   private String AV81Prdnum ;
   private String AV80prdNom ;
   private String A5686EntLotN ;
   private String A5691EntBnc ;
   private String A3345TipMovCc ;
   private String A3356CCStkHor ;
   private String AV55CCStkHor ;
   private String AV75Obs ;
   private java.util.Date AV71Hhmmss ;
   private java.util.Date AV85Recfec ;
   private java.util.Date A810RecFec ;
   private java.util.Date A3348CCStkFec ;
   private java.util.Date Gx_date ;
   private java.util.Date AV54Ccstkfec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private String AV96TextFileLine ;
   private String AV70File ;
   private String AV95Filename ;
   private String AV94ErrorMessage ;
   private IDataStoreProvider pr_default ;
   private byte[] P05KC2_A856ValCod ;
   private String[] P05KC2_A719PrdNum ;
   private String[] P05KC2_A396EmprCod ;
   private java.math.BigDecimal[] P05KC2_A704PrdExiAlm ;
   private String[] P05KC2_A718PrdNom ;
   private byte[] P05KC3_A411EntCon ;
   private String[] P05KC3_A719PrdNum ;
   private String[] P05KC3_A396EmprCod ;
   private String[] P05KC3_A5686EntLotN ;
   private String[] P05KC3_A5691EntBnc ;
   private java.math.BigDecimal[] P05KC3_A419EntUniRem ;
   private short[] P05KC3_A597LinEnt ;
   private String[] P05KC4_A396EmprCod ;
   private String[] P05KC4_A719PrdNum ;
   private java.math.BigDecimal[] P05KC4_A807RecExiRea ;
   private java.util.Date[] P05KC4_A810RecFec ;
   private String[] P05KC5_A396EmprCod ;
   private String[] P05KC5_A719PrdNum ;
   private java.util.Date[] P05KC5_A3348CCStkFec ;
   private String[] P05KC5_A3345TipMovCc ;
   private long[] P05KC5_A3342CCStkLin ;
   private String[] P05KC5_A3356CCStkHor ;
   private String[] P05KC6_A396EmprCod ;
   private String[] P05KC6_A719PrdNum ;
   private java.util.Date[] P05KC6_A3348CCStkFec ;
   private String[] P05KC6_A3345TipMovCc ;
   private java.math.BigDecimal[] P05KC6_A3343CCStkCanE ;
   private java.math.BigDecimal[] P05KC6_A3344CCStkCanS ;
   private String[] P05KC6_A3356CCStkHor ;
   private long[] P05KC6_A3342CCStkLin ;
   private String[] P05KC7_A396EmprCod ;
   private String[] P05KC7_A719PrdNum ;
   private String[] P05KC7_A3356CCStkHor ;
   private java.util.Date[] P05KC7_A3348CCStkFec ;
   private long[] P05KC7_A3342CCStkLin ;
   private String[] P05KC8_A396EmprCod ;
   private String[] P05KC8_A719PrdNum ;
   private java.util.Date[] P05KC8_A3348CCStkFec ;
   private String[] P05KC8_A3345TipMovCc ;
   private java.math.BigDecimal[] P05KC8_A3343CCStkCanE ;
   private java.math.BigDecimal[] P05KC8_A3344CCStkCanS ;
   private String[] P05KC8_A3356CCStkHor ;
   private long[] P05KC8_A3342CCStkLin ;
   private java.util.Date[] P05KC9_A810RecFec ;
   private String[] P05KC9_A719PrdNum ;
   private String[] P05KC9_A396EmprCod ;
   private java.math.BigDecimal[] P05KC9_A807RecExiRea ;
   private com.genexus.internet.HttpResponse AV92HttpResponse ;
   private com.genexus.util.GXFile AV93TextFile ;
}

final  class apupq001__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05KC2", "SELECT ValCod, PrdNum, EmprCod, PrdExiAlm, PrdNom FROM TXPPRODUC WHERE (EmprCod = ? and PrdNum >= ?) AND (LENGTH(RTRIM(RTRIM(LTRIM(PrdNum)))) >= 5) AND (ValCod <= 2) AND (PrdNum <= ?) ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05KC3", "SELECT EntCon, PrdNum, EmprCod, EntLotN, EntBnc, EntUniRem, LinEnt FROM TXPENTALM WHERE (EmprCod = ? and PrdNum = ?) AND (EntCon = 0) ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05KC4", "SELECT * FROM (SELECT EmprCod, PrdNum, RecExiRea, RecFec FROM TXPRECUEN WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum, RecFec DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05KC5", "SELECT EmprCod, PrdNum, CCStkFec, TipMovCc, CCStkLin, CCStkHor FROM TXPCCSTKS WHERE EmprCod = ? and PrdNum = ? and CCStkFec = ? ORDER BY EmprCod, PrdNum, CCStkFec, CCStkHor ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05KC6", "SELECT EmprCod, PrdNum, CCStkFec, TipMovCc, CCStkCanE, CCStkCanS, CCStkHor, CCStkLin FROM TXPCCSTKS WHERE EmprCod = ? and PrdNum = ? and CCStkFec = ? ORDER BY EmprCod, PrdNum, CCStkFec, CCStkHor ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05KC7", "SELECT * FROM (SELECT EmprCod, PrdNum, CCStkHor, CCStkFec, CCStkLin FROM TXPCCSTKS WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum, CCStkFec, CCStkHor) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05KC8", "SELECT EmprCod, PrdNum, CCStkFec, TipMovCc, CCStkCanE, CCStkCanS, CCStkHor, CCStkLin FROM TXPCCSTKS WHERE EmprCod = ? and PrdNum = ? and CCStkFec >= ? ORDER BY EmprCod, PrdNum, CCStkFec, CCStkHor ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05KC9", "SELECT RecFec, PrdNum, EmprCod, RecExiRea FROM TXPRECUEN WHERE EmprCod = ? and PrdNum = ? and RecFec = ? ORDER BY EmprCod, PrdNum, RecFec ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
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

