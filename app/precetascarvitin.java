package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class precetascarvitin extends GXProcedure
{
   public precetascarvitin( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( precetascarvitin.class ), "" );
   }

   public precetascarvitin( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             int[] aP3 ,
                             byte[] aP4 ,
                             String[] aP5 ,
                             short[] aP6 )
   {
      precetascarvitin.this.aP7 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        int[] aP3 ,
                        byte[] aP4 ,
                        String[] aP5 ,
                        short[] aP6 ,
                        String[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             int[] aP3 ,
                             byte[] aP4 ,
                             String[] aP5 ,
                             short[] aP6 ,
                             String[] aP7 )
   {
      precetascarvitin.this.AV88EmprCod = aP0[0];
      this.aP0 = aP0;
      precetascarvitin.this.AV107Dirp = aP1[0];
      this.aP1 = aP1;
      precetascarvitin.this.AV117Dirp2 = aP2[0];
      this.aP2 = aP2;
      precetascarvitin.this.AV108Barcod = aP3[0];
      this.aP3 = aP3;
      precetascarvitin.this.AV109Barcodreo = aP4[0];
      this.aP4 = aP4;
      precetascarvitin.this.AV110Barcodpar = aP5[0];
      this.aP5 = aP5;
      precetascarvitin.this.AV111Reclinmaq = aP6[0];
      this.aP6 = aP6;
      precetascarvitin.this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV130ErrorMessage = "" ;
      GXt_int1 = AV120VarSleep ;
      GXv_int2[0] = GXt_int1 ;
      new app.pbuscon(remoteHandle, context).execute( AV88EmprCod, httpContext.getMessage( "SEDTIM", ""), GXv_int2) ;
      precetascarvitin.this.GXt_int1 = GXv_int2[0] ;
      AV120VarSleep = (short)(GXt_int1) ;
      AV120VarSleep = (short)(((AV120VarSleep==0) ? 0 : AV120VarSleep)) ;
      AV106Dir = AV107Dirp ;
      AV106Dir = GXutil.trim( AV106Dir) ;
      AV64LenVar = (byte)(GXutil.len( AV106Dir)) ;
      AV106Dir = ((GXutil.strcmp(GXutil.substring( AV106Dir, AV64LenVar, 1), "\\")!=0) ? AV106Dir+"\\" : AV106Dir) ;
      AV107Dirp = GXutil.trim( AV106Dir) ;
      GXt_int1 = AV105Contval ;
      GXv_int2[0] = GXt_int1 ;
      new app.pnumdoc(remoteHandle, context).execute( AV88EmprCod, httpContext.getMessage( "SEDOCV", ""), GXv_int2) ;
      precetascarvitin.this.GXt_int1 = GXv_int2[0] ;
      AV105Contval = GXt_int1 ;
      GXt_int3 = AV119ActOF9 ;
      GXv_int4[0] = GXt_int3 ;
      new app.pexicon(remoteHandle, context).execute( AV88EmprCod, httpContext.getMessage( "OF9SED", ""), GXv_int4) ;
      precetascarvitin.this.GXt_int3 = GXv_int4[0] ;
      AV119ActOF9 = GXt_int3 ;
      /* Using cursor P05U02 */
      pr_default.execute(0, new Object[] {AV88EmprCod, Integer.valueOf(AV108Barcod), Byte.valueOf(AV109Barcodreo), AV110Barcodpar, Short.valueOf(AV111Reclinmaq)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2804RecLinMaq = P05U02_A2804RecLinMaq[0] ;
         A130BarCodPar = P05U02_A130BarCodPar[0] ;
         A132BarCodReo = P05U02_A132BarCodReo[0] ;
         A129BarCod = P05U02_A129BarCod[0] ;
         A396EmprCod = P05U02_A396EmprCod[0] ;
         A616MaqOrdSeq = P05U02_A616MaqOrdSeq[0] ;
         n616MaqOrdSeq = P05U02_n616MaqOrdSeq[0] ;
         A602MaqCod = P05U02_A602MaqCod[0] ;
         A5109RecNumInt = P05U02_A5109RecNumInt[0] ;
         A616MaqOrdSeq = P05U02_A616MaqOrdSeq[0] ;
         n616MaqOrdSeq = P05U02_n616MaqOrdSeq[0] ;
         AV42Num_mq = A616MaqOrdSeq ;
         AV42Num_mq = (short)(GXutil.lval( GXutil.substring( A602MaqCod, 5, 2))) ;
         AV45Of6 = A5109RecNumInt ;
         AV118Of9 = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + GXutil.str( A132BarCodReo, 1, 0) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P05U03 */
      pr_default.execute(1, new Object[] {AV88EmprCod, Integer.valueOf(AV108Barcod), Byte.valueOf(AV109Barcodreo), AV110Barcodpar, Short.valueOf(AV111Reclinmaq)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A872RecPrdNum = P05U03_A872RecPrdNum[0] ;
         A2804RecLinMaq = P05U03_A2804RecLinMaq[0] ;
         A130BarCodPar = P05U03_A130BarCodPar[0] ;
         A132BarCodReo = P05U03_A132BarCodReo[0] ;
         A129BarCod = P05U03_A129BarCod[0] ;
         A396EmprCod = P05U03_A396EmprCod[0] ;
         A686PrdCant = P05U03_A686PrdCant[0] ;
         A811RecLin = P05U03_A811RecLin[0] ;
         A1273RecLinPro = P05U03_A1273RecLinPro[0] ;
         if ( A686PrdCant.doubleValue() < 1 )
         {
            AV127MoAColorantes = httpContext.getMessage( "M", "") ;
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
      AV126Inicio = GXutil.now( ) ;
      AV125Fin = GXutil.dtadd( AV126Inicio, AV120VarSleep) ;
      while ( AV125Fin.after( GXutil.now( ) ) )
      {
         AV126Inicio = GXutil.now( ) ;
         Gx_msg = "-> " + httpContext.getMessage( "Inicio= ", "") + localUtil.ttoc( AV126Inicio, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + httpContext.getMessage( " Espero...para inciar fichero PREP... ", "") + GXutil.newLine( ) ;
         Gx_msg += "-> " + httpContext.getMessage( "Fin= ", "") + localUtil.ttoc( AV125Fin, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + GXutil.newLine( ) ;
         System.out.println( Gx_msg );
      }
      AV41FicA = GXutil.padl( GXutil.trim( GXutil.str( AV105Contval, 8, 0)), (short)(8), "0") ;
      AV19File = AV107Dirp ;
      AV129Filename = AV19File + AV41FicA + ".dat" ;
      AV128TextFile.setSource( AV129Filename );
      AV128TextFile.create();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV128TextFile.openWrite("");
      /* Execute user subroutine: 'CHECKSTATUS' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV112LastRecForNro = (byte)(0) ;
      /* Using cursor P05U04 */
      pr_default.execute(2, new Object[] {AV88EmprCod, Integer.valueOf(AV108Barcod), Byte.valueOf(AV109Barcodreo), AV110Barcodpar, Short.valueOf(AV111Reclinmaq)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A719PrdNum = P05U04_A719PrdNum[0] ;
         n719PrdNum = P05U04_n719PrdNum[0] ;
         A2394RecForNro = P05U04_A2394RecForNro[0] ;
         A2804RecLinMaq = P05U04_A2804RecLinMaq[0] ;
         A130BarCodPar = P05U04_A130BarCodPar[0] ;
         A132BarCodReo = P05U04_A132BarCodReo[0] ;
         A129BarCod = P05U04_A129BarCod[0] ;
         A396EmprCod = P05U04_A396EmprCod[0] ;
         A5109RecNumInt = P05U04_A5109RecNumInt[0] ;
         A811RecLin = P05U04_A811RecLin[0] ;
         A1273RecLinPro = P05U04_A1273RecLinPro[0] ;
         A5109RecNumInt = P05U04_A5109RecNumInt[0] ;
         if ( AV112LastRecForNro != A2394RecForNro )
         {
            AV132TextFileLine = httpContext.getMessage( "\"PREP\"", "") + "," ;
            AV132TextFileLine += "\"" + GXutil.padl( GXutil.trim( GXutil.str( AV42Num_mq, 4, 0)), (short)(4), "0") + "\"" + "," ;
            if ( AV119ActOF9 == 0 )
            {
               AV132TextFileLine += "\"" + GXutil.padr( GXutil.trim( GXutil.str( A5109RecNumInt, 8, 0)), 8, " ") + "\"" + "," ;
            }
            else
            {
               AV132TextFileLine += "\"" + GXutil.padr( GXutil.trim( AV118Of9), 9, " ") + "\"" + "," ;
            }
            AV132TextFileLine += "\"" + GXutil.padl( GXutil.trim( GXutil.str( A2394RecForNro, 2, 0)), (short)(2), "0") + "\"" + "," ;
            AV132TextFileLine += "\"" + "01" + "\"" + "," ;
            AV132TextFileLine += "\"" + "2" + "\"" ;
            if ( GXutil.len( AV132TextFileLine) > 0 )
            {
               AV128TextFile.writeLine(AV132TextFileLine);
            }
         }
         AV112LastRecForNro = A2394RecForNro ;
         pr_default.readNext(2);
      }
      pr_default.close(2);
      AV128TextFile.close();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( AV128TextFile.getErrCode() == 0 )
      {
         if ( ! httpContext.isAjaxRequest( ) )
         {
            AV131HttpResponse.addHeader("Content-Type", "text/csv");
         }
         if ( ! httpContext.isAjaxRequest( ) )
         {
            AV131HttpResponse.addHeader("Content-Disposition", "attachment;filename=PRecetasCarvitin.csv");
         }
         AV131HttpResponse.addFile(AV128TextFile.getAbsoluteName());
      }
      AV130ErrorMessage = httpContext.getMessage( "Fichero Preparaciones creado", "") + GXutil.newLine( ) ;
      Gx_msg = "" ;
      AV126Inicio = GXutil.now( ) ;
      AV125Fin = GXutil.dtadd( AV126Inicio, AV120VarSleep) ;
      while ( AV125Fin.after( GXutil.now( ) ) )
      {
         AV126Inicio = GXutil.now( ) ;
         Gx_msg = "-> " + httpContext.getMessage( "Inicio= ", "") + localUtil.ttoc( AV126Inicio, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + httpContext.getMessage( " Espero...para inciar fichero PROD... ", "") + GXutil.newLine( ) ;
         Gx_msg += "-> " + httpContext.getMessage( "Fin= ", "") + localUtil.ttoc( AV125Fin, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + GXutil.newLine( ) ;
         System.out.println( Gx_msg );
      }
      GXt_int1 = AV105Contval ;
      GXv_int2[0] = GXt_int1 ;
      new app.pnumdoc(remoteHandle, context).execute( AV88EmprCod, httpContext.getMessage( "SEDOCV", ""), GXv_int2) ;
      precetascarvitin.this.GXt_int1 = GXv_int2[0] ;
      AV105Contval = GXt_int1 ;
      AV41FicA = GXutil.padl( GXutil.trim( GXutil.str( AV105Contval, 8, 0)), (short)(8), "0") ;
      AV19File = AV117Dirp2 ;
      AV129Filename = AV19File + AV41FicA + ".dat" ;
      AV128TextFile.setSource( AV129Filename );
      AV128TextFile.create();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV128TextFile.openWrite("");
      /* Execute user subroutine: 'CHECKSTATUS' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV112LastRecForNro = (byte)(0) ;
      AV113Npedidos = (byte)(1) ;
      /* Using cursor P05U05 */
      pr_default.execute(3, new Object[] {AV88EmprCod, Integer.valueOf(AV108Barcod), Byte.valueOf(AV109Barcodreo), AV110Barcodpar, Short.valueOf(AV111Reclinmaq)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A719PrdNum = P05U05_A719PrdNum[0] ;
         n719PrdNum = P05U05_n719PrdNum[0] ;
         A2394RecForNro = P05U05_A2394RecForNro[0] ;
         A2804RecLinMaq = P05U05_A2804RecLinMaq[0] ;
         A130BarCodPar = P05U05_A130BarCodPar[0] ;
         A132BarCodReo = P05U05_A132BarCodReo[0] ;
         A129BarCod = P05U05_A129BarCod[0] ;
         A396EmprCod = P05U05_A396EmprCod[0] ;
         A1643PrdTip = P05U05_A1643PrdTip[0] ;
         A872RecPrdNum = P05U05_A872RecPrdNum[0] ;
         A875RecPrdDsc = P05U05_A875RecPrdDsc[0] ;
         A5109RecNumInt = P05U05_A5109RecNumInt[0] ;
         A686PrdCant = P05U05_A686PrdCant[0] ;
         A811RecLin = P05U05_A811RecLin[0] ;
         A1273RecLinPro = P05U05_A1273RecLinPro[0] ;
         A1643PrdTip = P05U05_A1643PrdTip[0] ;
         A5109RecNumInt = P05U05_A5109RecNumInt[0] ;
         if ( ( AV112LastRecForNro != A2394RecForNro ) && ( A2394RecForNro > 0 ) && ( AV112LastRecForNro > 0 ) )
         {
            AV113Npedidos = (byte)(1) ;
         }
         AV115PrdTip = ((GXutil.strcmp(A1643PrdTip, httpContext.getMessage( "M", ""))==0) ? httpContext.getMessage( "M", "") : httpContext.getMessage( "A", "")) ;
         AV115PrdTip = ((GXutil.strcmp(GXutil.substring( A872RecPrdNum, 1, 2), "10")>=0)&&(GXutil.strcmp(GXutil.substring( A872RecPrdNum, 1, 2), "79")<=0)&&(GXutil.strcmp(AV127MoAColorantes, httpContext.getMessage( "M", ""))==0) ? httpContext.getMessage( "M", "") : AV115PrdTip) ;
         AV114DescProducto = GXutil.substring( A875RecPrdDsc, 1, 13) ;
         AV132TextFileLine = httpContext.getMessage( "\"PROD\"", "") + "," ;
         AV132TextFileLine += "\"" + GXutil.padl( GXutil.trim( GXutil.str( AV42Num_mq, 4, 0)), (short)(4), "0") + "\"" + "," ;
         if ( AV119ActOF9 == 0 )
         {
            AV132TextFileLine += "\"" + GXutil.padr( GXutil.trim( GXutil.str( A5109RecNumInt, 8, 0)), 8, " ") + "\"" + "," ;
         }
         else
         {
            AV132TextFileLine += "\"" + GXutil.padr( GXutil.trim( AV118Of9), 9, " ") + "\"" + "," ;
         }
         AV132TextFileLine += "\"" + GXutil.padl( GXutil.trim( GXutil.str( ((A2394RecForNro==0) ? AV112LastRecForNro : A2394RecForNro), 2, 0)), (short)(2), "0") + "\"" + "," ;
         AV132TextFileLine += "\"" + GXutil.padl( GXutil.trim( GXutil.str( AV113Npedidos, 2, 0)), (short)(2), "0") + "\"" + "," ;
         AV132TextFileLine += "\"" + GXutil.padr( GXutil.trim( A872RecPrdNum), 13, " ") + "\"" + "," ;
         AV132TextFileLine += "\"" + GXutil.padr( GXutil.trim( AV114DescProducto), 13, " ") + "\"" + "," ;
         AV132TextFileLine += "\"" + GXutil.padl( GXutil.trim( GXutil.str( A686PrdCant, 12, 1)), (short)(12), "0") + "\"" + "," ;
         AV132TextFileLine += "\"" + httpContext.getMessage( "g", "") + "\"" + "," ;
         AV132TextFileLine += "\"" + ((GXutil.strcmp(AV115PrdTip, httpContext.getMessage( "M", ""))==0) ? "1" : "0") + "\"" ;
         if ( GXutil.len( AV132TextFileLine) > 0 )
         {
            AV128TextFile.writeLine(AV132TextFileLine);
         }
         AV112LastRecForNro = ((A2394RecForNro==0) ? AV112LastRecForNro : A2394RecForNro) ;
         AV113Npedidos = (byte)(AV113Npedidos+1) ;
         pr_default.readNext(3);
      }
      pr_default.close(3);
      AV128TextFile.close();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV130ErrorMessage += httpContext.getMessage( "Fichero Productos creado", "") ;
      if ( AV128TextFile.getErrCode() == 0 )
      {
         if ( ! httpContext.isAjaxRequest( ) )
         {
            AV131HttpResponse.addHeader("Content-Type", "text/csv");
         }
         if ( ! httpContext.isAjaxRequest( ) )
         {
            AV131HttpResponse.addHeader("Content-Disposition", "attachment;filename=PRecetasCarvitin.csv");
         }
         AV131HttpResponse.addFile(AV128TextFile.getAbsoluteName());
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV128TextFile.getErrCode() != 0 )
      {
         AV129Filename = "" ;
         AV130ErrorMessage = AV128TextFile.getErrDescription() ;
         AV128TextFile.close();
         AV131HttpResponse.addString(AV130ErrorMessage);
         returnInSub = true;
         if (true) return;
      }
   }

   protected void cleanup( )
   {
      this.aP0[0] = precetascarvitin.this.AV88EmprCod;
      this.aP1[0] = precetascarvitin.this.AV107Dirp;
      this.aP2[0] = precetascarvitin.this.AV117Dirp2;
      this.aP3[0] = precetascarvitin.this.AV108Barcod;
      this.aP4[0] = precetascarvitin.this.AV109Barcodreo;
      this.aP5[0] = precetascarvitin.this.AV110Barcodpar;
      this.aP6[0] = precetascarvitin.this.AV111Reclinmaq;
      this.aP7[0] = precetascarvitin.this.AV130ErrorMessage;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV130ErrorMessage = "" ;
      AV106Dir = "" ;
      GXv_int4 = new byte[1] ;
      scmdbuf = "" ;
      P05U02_A2804RecLinMaq = new short[1] ;
      P05U02_A130BarCodPar = new String[] {""} ;
      P05U02_A132BarCodReo = new byte[1] ;
      P05U02_A129BarCod = new int[1] ;
      P05U02_A396EmprCod = new String[] {""} ;
      P05U02_A616MaqOrdSeq = new short[1] ;
      P05U02_n616MaqOrdSeq = new boolean[] {false} ;
      P05U02_A602MaqCod = new String[] {""} ;
      P05U02_A5109RecNumInt = new int[1] ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A602MaqCod = "" ;
      AV118Of9 = "" ;
      P05U03_A872RecPrdNum = new String[] {""} ;
      P05U03_A2804RecLinMaq = new short[1] ;
      P05U03_A130BarCodPar = new String[] {""} ;
      P05U03_A132BarCodReo = new byte[1] ;
      P05U03_A129BarCod = new int[1] ;
      P05U03_A396EmprCod = new String[] {""} ;
      P05U03_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05U03_A811RecLin = new short[1] ;
      P05U03_A1273RecLinPro = new byte[1] ;
      A872RecPrdNum = "" ;
      A686PrdCant = DecimalUtil.ZERO ;
      AV127MoAColorantes = "" ;
      AV126Inicio = GXutil.resetTime( GXutil.nullDate() );
      AV125Fin = GXutil.resetTime( GXutil.nullDate() );
      Gx_msg = "" ;
      AV41FicA = "" ;
      AV19File = "" ;
      AV129Filename = "" ;
      AV128TextFile = new com.genexus.util.GXFile();
      P05U04_A719PrdNum = new String[] {""} ;
      P05U04_n719PrdNum = new boolean[] {false} ;
      P05U04_A2394RecForNro = new byte[1] ;
      P05U04_A2804RecLinMaq = new short[1] ;
      P05U04_A130BarCodPar = new String[] {""} ;
      P05U04_A132BarCodReo = new byte[1] ;
      P05U04_A129BarCod = new int[1] ;
      P05U04_A396EmprCod = new String[] {""} ;
      P05U04_A5109RecNumInt = new int[1] ;
      P05U04_A811RecLin = new short[1] ;
      P05U04_A1273RecLinPro = new byte[1] ;
      A719PrdNum = "" ;
      AV132TextFileLine = "" ;
      AV131HttpResponse = httpContext.getHttpResponse();
      GXv_int2 = new int[1] ;
      P05U05_A719PrdNum = new String[] {""} ;
      P05U05_n719PrdNum = new boolean[] {false} ;
      P05U05_A2394RecForNro = new byte[1] ;
      P05U05_A2804RecLinMaq = new short[1] ;
      P05U05_A130BarCodPar = new String[] {""} ;
      P05U05_A132BarCodReo = new byte[1] ;
      P05U05_A129BarCod = new int[1] ;
      P05U05_A396EmprCod = new String[] {""} ;
      P05U05_A1643PrdTip = new String[] {""} ;
      P05U05_A872RecPrdNum = new String[] {""} ;
      P05U05_A875RecPrdDsc = new String[] {""} ;
      P05U05_A5109RecNumInt = new int[1] ;
      P05U05_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05U05_A811RecLin = new short[1] ;
      P05U05_A1273RecLinPro = new byte[1] ;
      A1643PrdTip = "" ;
      A875RecPrdDsc = "" ;
      AV115PrdTip = "" ;
      AV114DescProducto = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.precetascarvitin__default(),
         new Object[] {
             new Object[] {
            P05U02_A2804RecLinMaq, P05U02_A130BarCodPar, P05U02_A132BarCodReo, P05U02_A129BarCod, P05U02_A396EmprCod, P05U02_A616MaqOrdSeq, P05U02_n616MaqOrdSeq, P05U02_A602MaqCod, P05U02_A5109RecNumInt
            }
            , new Object[] {
            P05U03_A872RecPrdNum, P05U03_A2804RecLinMaq, P05U03_A130BarCodPar, P05U03_A132BarCodReo, P05U03_A129BarCod, P05U03_A396EmprCod, P05U03_A686PrdCant, P05U03_A811RecLin, P05U03_A1273RecLinPro
            }
            , new Object[] {
            P05U04_A719PrdNum, P05U04_n719PrdNum, P05U04_A2394RecForNro, P05U04_A2804RecLinMaq, P05U04_A130BarCodPar, P05U04_A132BarCodReo, P05U04_A129BarCod, P05U04_A396EmprCod, P05U04_A5109RecNumInt, P05U04_A811RecLin,
            P05U04_A1273RecLinPro
            }
            , new Object[] {
            P05U05_A719PrdNum, P05U05_n719PrdNum, P05U05_A2394RecForNro, P05U05_A2804RecLinMaq, P05U05_A130BarCodPar, P05U05_A132BarCodReo, P05U05_A129BarCod, P05U05_A396EmprCod, P05U05_A1643PrdTip, P05U05_A872RecPrdNum,
            P05U05_A875RecPrdDsc, P05U05_A5109RecNumInt, P05U05_A686PrdCant, P05U05_A811RecLin, P05U05_A1273RecLinPro
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV109Barcodreo ;
   private byte AV64LenVar ;
   private byte AV119ActOF9 ;
   private byte GXt_int3 ;
   private byte GXv_int4[] ;
   private byte A132BarCodReo ;
   private byte A1273RecLinPro ;
   private byte AV112LastRecForNro ;
   private byte A2394RecForNro ;
   private byte AV113Npedidos ;
   private short AV111Reclinmaq ;
   private short AV120VarSleep ;
   private short A2804RecLinMaq ;
   private short A616MaqOrdSeq ;
   private short AV42Num_mq ;
   private short A811RecLin ;
   private short Gx_err ;
   private int AV108Barcod ;
   private int AV105Contval ;
   private int A129BarCod ;
   private int A5109RecNumInt ;
   private int AV45Of6 ;
   private int GXt_int1 ;
   private int GXv_int2[] ;
   private java.math.BigDecimal A686PrdCant ;
   private String AV88EmprCod ;
   private String AV107Dirp ;
   private String AV117Dirp2 ;
   private String AV110Barcodpar ;
   private String AV106Dir ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String AV118Of9 ;
   private String A872RecPrdNum ;
   private String AV127MoAColorantes ;
   private String Gx_msg ;
   private String AV41FicA ;
   private String AV19File ;
   private String A719PrdNum ;
   private String A1643PrdTip ;
   private String A875RecPrdDsc ;
   private String AV115PrdTip ;
   private String AV114DescProducto ;
   private java.util.Date AV126Inicio ;
   private java.util.Date AV125Fin ;
   private boolean n616MaqOrdSeq ;
   private boolean returnInSub ;
   private boolean n719PrdNum ;
   private String AV132TextFileLine ;
   private String AV130ErrorMessage ;
   private String AV129Filename ;
   private com.genexus.util.GXFile AV128TextFile ;
   private String[] aP7 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private int[] aP3 ;
   private byte[] aP4 ;
   private String[] aP5 ;
   private short[] aP6 ;
   private IDataStoreProvider pr_default ;
   private short[] P05U02_A2804RecLinMaq ;
   private String[] P05U02_A130BarCodPar ;
   private byte[] P05U02_A132BarCodReo ;
   private int[] P05U02_A129BarCod ;
   private String[] P05U02_A396EmprCod ;
   private short[] P05U02_A616MaqOrdSeq ;
   private boolean[] P05U02_n616MaqOrdSeq ;
   private String[] P05U02_A602MaqCod ;
   private int[] P05U02_A5109RecNumInt ;
   private String[] P05U03_A872RecPrdNum ;
   private short[] P05U03_A2804RecLinMaq ;
   private String[] P05U03_A130BarCodPar ;
   private byte[] P05U03_A132BarCodReo ;
   private int[] P05U03_A129BarCod ;
   private String[] P05U03_A396EmprCod ;
   private java.math.BigDecimal[] P05U03_A686PrdCant ;
   private short[] P05U03_A811RecLin ;
   private byte[] P05U03_A1273RecLinPro ;
   private String[] P05U04_A719PrdNum ;
   private boolean[] P05U04_n719PrdNum ;
   private byte[] P05U04_A2394RecForNro ;
   private short[] P05U04_A2804RecLinMaq ;
   private String[] P05U04_A130BarCodPar ;
   private byte[] P05U04_A132BarCodReo ;
   private int[] P05U04_A129BarCod ;
   private String[] P05U04_A396EmprCod ;
   private int[] P05U04_A5109RecNumInt ;
   private short[] P05U04_A811RecLin ;
   private byte[] P05U04_A1273RecLinPro ;
   private String[] P05U05_A719PrdNum ;
   private boolean[] P05U05_n719PrdNum ;
   private byte[] P05U05_A2394RecForNro ;
   private short[] P05U05_A2804RecLinMaq ;
   private String[] P05U05_A130BarCodPar ;
   private byte[] P05U05_A132BarCodReo ;
   private int[] P05U05_A129BarCod ;
   private String[] P05U05_A396EmprCod ;
   private String[] P05U05_A1643PrdTip ;
   private String[] P05U05_A872RecPrdNum ;
   private String[] P05U05_A875RecPrdDsc ;
   private int[] P05U05_A5109RecNumInt ;
   private java.math.BigDecimal[] P05U05_A686PrdCant ;
   private short[] P05U05_A811RecLin ;
   private byte[] P05U05_A1273RecLinPro ;
   private com.genexus.internet.HttpResponse AV131HttpResponse ;
}

final  class precetascarvitin__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05U02", "SELECT T1.RecLinMaq, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T2.MaqOrdSeq, T1.MaqCod, T1.RecNumInt FROM (TXPRECMAQ T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05U03", "SELECT RecPrdNum, RecLinMaq, BarCodPar, BarCodReo, BarCod, EmprCod, PrdCant, RecLin, RecLinPro FROM TXPLRECET WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ?) AND (SUBSTR(RecPrdNum, 1, 2) >= '10' and SUBSTR(RecPrdNum, 1, 2) <= '79') ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05U04", "SELECT T1.PrdNum, T1.RecForNro, T1.RecLinMaq, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T2.RecNumInt, T1.RecLin, T1.RecLinPro FROM (TXPLRECET T1 INNER JOIN TXPRECMAQ T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar AND T2.RecLinMaq = T1.RecLinMaq) WHERE (T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ?) AND (T1.RecForNro > 0) AND (SUBSTR(T1.PrdNum, 1, 2) >= '10' and SUBSTR(T1.PrdNum, 1, 2) <= '99') ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro, T1.RecLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05U05", "SELECT T1.PrdNum, T1.RecForNro, T1.RecLinMaq, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T2.PrdTip, T1.RecPrdNum, T1.RecPrdDsc, T3.RecNumInt, T1.PrdCant, T1.RecLin, T1.RecLinPro FROM ((TXPLRECET T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPRECMAQ T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar AND T3.RecLinMaq = T1.RecLinMaq) WHERE (T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ?) AND (T1.RecForNro > 0) AND (SUBSTR(T1.PrdNum, 1, 2) >= '10' and SUBSTR(T1.PrdNum, 1, 2) <= '99') ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro, T1.RecLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 6);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,3);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 3);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 3);
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((String[]) buf[9])[0] = rslt.getString(9, 6);
               ((String[]) buf[10])[0] = rslt.getString(10, 26);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,3);
               ((short[]) buf[13])[0] = rslt.getShort(13);
               ((byte[]) buf[14])[0] = rslt.getByte(14);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
      }
   }

}

