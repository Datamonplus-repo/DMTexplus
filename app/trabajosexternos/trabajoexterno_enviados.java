package app.trabajosexternos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class trabajoexterno_enviados extends GXProcedure
{
   public trabajoexterno_enviados( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( trabajoexterno_enviados.class ), "" );
   }

   public trabajoexterno_enviados( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             short aP1 ,
                             short aP2 ,
                             java.util.Date aP3 ,
                             java.util.Date aP4 ,
                             String aP5 ,
                             String aP6 ,
                             String aP7 ,
                             byte aP8 ,
                             String aP9 ,
                             String aP10 ,
                             String[] aP11 )
   {
      trabajoexterno_enviados.this.aP12 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
      return aP12[0];
   }

   public void execute( String aP0 ,
                        short aP1 ,
                        short aP2 ,
                        java.util.Date aP3 ,
                        java.util.Date aP4 ,
                        String aP5 ,
                        String aP6 ,
                        String aP7 ,
                        byte aP8 ,
                        String aP9 ,
                        String aP10 ,
                        String[] aP11 ,
                        String[] aP12 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
   }

   private void execute_int( String aP0 ,
                             short aP1 ,
                             short aP2 ,
                             java.util.Date aP3 ,
                             java.util.Date aP4 ,
                             String aP5 ,
                             String aP6 ,
                             String aP7 ,
                             byte aP8 ,
                             String aP9 ,
                             String aP10 ,
                             String[] aP11 ,
                             String[] aP12 )
   {
      trabajoexterno_enviados.this.A396EmprCod = aP0;
      trabajoexterno_enviados.this.AV25Pman = aP1;
      trabajoexterno_enviados.this.AV30Uman2 = aP2;
      trabajoexterno_enviados.this.AV24PAlbFch = aP3;
      trabajoexterno_enviados.this.AV29UFecha2 = aP4;
      trabajoexterno_enviados.this.AV26POpe = aP5;
      trabajoexterno_enviados.this.AV31UOpe2 = aP6;
      trabajoexterno_enviados.this.AV49TipPapel = aP7;
      trabajoexterno_enviados.this.AV42Fuente = aP8;
      trabajoexterno_enviados.this.AV52Trab = aP9;
      trabajoexterno_enviados.this.AV15ImpCod = aP10;
      trabajoexterno_enviados.this.aP11 = aP11;
      trabajoexterno_enviados.this.aP12 = aP12;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Execute user subroutine: 'OPENDOCUMENT' */
      S171 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITECOLUMNTITLES' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV20CellRow = 3 ;
      /* Execute user subroutine: 'WRITEDATA' */
      S121 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'CLOSEDOCUMENT' */
      S151 ();
      if ( returnInSub )
      {
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV22ExcelDocument.Cells(1, 1, 1, 1).setBold( (short)(1) );
      AV22ExcelDocument.Cells(1, 1, 1, 1).setColor( 11 );
      AV22ExcelDocument.Cells(1, 1, 1, 1).setText( httpContext.getMessage( "Periodo", "") );
      GXt_dtime1 = GXutil.resetTime( AV24PAlbFch );
      AV22ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
      AV22ExcelDocument.Cells(1, 2, 1, 1).setDate( GXt_dtime1 );
      GXt_dtime1 = GXutil.resetTime( AV29UFecha2 );
      AV22ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
      AV22ExcelDocument.Cells(1, 3, 1, 1).setDate( GXt_dtime1 );
      AV20CellRow = 2 ;
      AV19CellCol = 1 ;
      while ( AV19CellCol <= 100 )
      {
         AV22ExcelDocument.Cells(AV20CellRow, AV19CellCol, 1, 1).setBold( (short)(1) );
         AV22ExcelDocument.Cells(AV20CellRow, AV19CellCol, 1, 1).setColor( 11 );
         AV19CellCol = (int)(AV19CellCol+1) ;
      }
      AV22ExcelDocument.Cells(2, 1, 1, 1).setText( httpContext.getMessage( "Manufacturador", "") );
      AV22ExcelDocument.Cells(2, 2, 1, 1).setText( httpContext.getMessage( "Fase", "") );
      AV22ExcelDocument.Cells(2, 3, 1, 1).setText( httpContext.getMessage( "Nº Hdr", "") );
      AV22ExcelDocument.Cells(2, 4, 1, 1).setText( httpContext.getMessage( "Ped. Cli.", "") );
      AV22ExcelDocument.Cells(2, 5, 1, 1).setText( httpContext.getMessage( "Cliente", "") );
      AV22ExcelDocument.Cells(2, 6, 1, 1).setText( httpContext.getMessage( "Nombre", "") );
      AV22ExcelDocument.Cells(2, 7, 1, 1).setText( httpContext.getMessage( "Articulo", "") );
      AV22ExcelDocument.Cells(2, 8, 1, 1).setText( httpContext.getMessage( "Descripcion", "") );
      AV22ExcelDocument.Cells(2, 9, 1, 1).setText( httpContext.getMessage( "Nº Documento", "") );
      AV22ExcelDocument.Cells(2, 10, 1, 1).setText( httpContext.getMessage( "Piezas Envio", "") );
      AV22ExcelDocument.Cells(2, 11, 1, 1).setText( httpContext.getMessage( "Kilos Envio", "") );
      AV22ExcelDocument.Cells(2, 12, 1, 1).setText( httpContext.getMessage( "Metros Envio", "") );
      AV22ExcelDocument.Cells(2, 13, 1, 1).setText( httpContext.getMessage( "Fecha Envio", "") );
      AV22ExcelDocument.Cells(2, 14, 1, 1).setText( httpContext.getMessage( "Piezas Recepcion", "") );
      AV22ExcelDocument.Cells(2, 15, 1, 1).setText( httpContext.getMessage( "Kilos Recepcion", "") );
      AV22ExcelDocument.Cells(2, 16, 1, 1).setText( httpContext.getMessage( "Metros Recepcion", "") );
      AV22ExcelDocument.Cells(2, 17, 1, 1).setText( httpContext.getMessage( "Fecha Recepcion", "") );
      AV22ExcelDocument.Cells(2, 18, 1, 1).setText( httpContext.getMessage( "Piezas Envio", "") );
      AV22ExcelDocument.Cells(2, 20, 1, 1).setText( httpContext.getMessage( "Dif. Kilos ", "") );
      AV22ExcelDocument.Cells(2, 21, 1, 1).setText( httpContext.getMessage( "% Merma", "") );
      AV22ExcelDocument.Cells(2, 22, 1, 1).setText( httpContext.getMessage( "Dias", "") );
   }

   public void S121( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV39FlagL = (byte)(0) ;
      AV40FlagM = (byte)(0) ;
      AV37FechaE = GXutil.nullDate() ;
      AV38FechaR = GXutil.nullDate() ;
      AV41FlagO = (byte)(0) ;
      AV51TotKgsR = DecimalUtil.ZERO ;
      AV16ManCod = (short)(0) ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Short.valueOf(AV25Pman) ,
                                           Short.valueOf(AV30Uman2) ,
                                           AV26POpe ,
                                           AV31UOpe2 ,
                                           AV24PAlbFch ,
                                           AV29UFecha2 ,
                                           Short.valueOf(A2248ManCod) ,
                                           A2689ExHdrFas ,
                                           A2697ExHdrFeE ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING
                                           }
      });
      /* Using cursor P0AC12 */
      pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(AV25Pman), Short.valueOf(AV30Uman2), AV26POpe, AV31UOpe2, AV24PAlbFch, AV29UFecha2});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2694ExHdrAlb = P0AC12_A2694ExHdrAlb[0] ;
         n2694ExHdrAlb = P0AC12_n2694ExHdrAlb[0] ;
         A143BarDisNum = P0AC12_A143BarDisNum[0] ;
         A4812BarEncCli = P0AC12_A4812BarEncCli[0] ;
         A2697ExHdrFeE = P0AC12_A2697ExHdrFeE[0] ;
         n2697ExHdrFeE = P0AC12_n2697ExHdrFeE[0] ;
         A2748CliAlias = P0AC12_A2748CliAlias[0] ;
         A279CliNom = P0AC12_A279CliNom[0] ;
         A2695ExHdrKgE = P0AC12_A2695ExHdrKgE[0] ;
         n2695ExHdrKgE = P0AC12_n2695ExHdrKgE[0] ;
         A2844ExHdrMtE = P0AC12_A2844ExHdrMtE[0] ;
         n2844ExHdrMtE = P0AC12_n2844ExHdrMtE[0] ;
         A2249ManNom = P0AC12_A2249ManNom[0] ;
         n2249ManNom = P0AC12_n2249ManNom[0] ;
         A252CliCod = P0AC12_A252CliCod[0] ;
         n252CliCod = P0AC12_n252CliCod[0] ;
         A212BarSer = P0AC12_A212BarSer[0] ;
         A1652BarSerDsc = P0AC12_A1652BarSerDsc[0] ;
         A2696ExHdrCnE = P0AC12_A2696ExHdrCnE[0] ;
         n2696ExHdrCnE = P0AC12_n2696ExHdrCnE[0] ;
         A2699ExHdrCnR = P0AC12_A2699ExHdrCnR[0] ;
         n2699ExHdrCnR = P0AC12_n2699ExHdrCnR[0] ;
         A2698ExHdrKgR = P0AC12_A2698ExHdrKgR[0] ;
         n2698ExHdrKgR = P0AC12_n2698ExHdrKgR[0] ;
         A2845ExHdrMtR = P0AC12_A2845ExHdrMtR[0] ;
         n2845ExHdrMtR = P0AC12_n2845ExHdrMtR[0] ;
         A2700ExHdrFeR = P0AC12_A2700ExHdrFeR[0] ;
         n2700ExHdrFeR = P0AC12_n2700ExHdrFeR[0] ;
         A2693ExHdrTip = P0AC12_A2693ExHdrTip[0] ;
         n2693ExHdrTip = P0AC12_n2693ExHdrTip[0] ;
         A130BarCodPar = P0AC12_A130BarCodPar[0] ;
         n130BarCodPar = P0AC12_n130BarCodPar[0] ;
         A132BarCodReo = P0AC12_A132BarCodReo[0] ;
         n132BarCodReo = P0AC12_n132BarCodReo[0] ;
         A129BarCod = P0AC12_A129BarCod[0] ;
         n129BarCod = P0AC12_n129BarCod[0] ;
         A2689ExHdrFas = P0AC12_A2689ExHdrFas[0] ;
         A2248ManCod = P0AC12_A2248ManCod[0] ;
         A2692ExHdrLin = P0AC12_A2692ExHdrLin[0] ;
         A143BarDisNum = P0AC12_A143BarDisNum[0] ;
         A4812BarEncCli = P0AC12_A4812BarEncCli[0] ;
         A252CliCod = P0AC12_A252CliCod[0] ;
         n252CliCod = P0AC12_n252CliCod[0] ;
         A212BarSer = P0AC12_A212BarSer[0] ;
         A1652BarSerDsc = P0AC12_A1652BarSerDsc[0] ;
         A2748CliAlias = P0AC12_A2748CliAlias[0] ;
         A279CliNom = P0AC12_A279CliNom[0] ;
         A2249ManNom = P0AC12_A2249ManNom[0] ;
         n2249ManNom = P0AC12_n2249ManNom[0] ;
         AV43HojaRuta = GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
         if ( ( GXutil.strcmp(AV43HojaRuta, AV45LastHdr) != 0 ) && ( GXutil.strcmp(AV45LastHdr, " ") != 0 ) )
         {
            /* Execute user subroutine: 'DIF' */
            S132 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               returnInSub = true;
               if (true) return;
            }
         }
         AV8BarCod = A129BarCod ;
         AV10BarCodReo = A132BarCodReo ;
         AV9BarCodPar = A130BarCodPar ;
         AV17SalExtAlb = A2694ExHdrAlb ;
         /* Execute user subroutine: 'LEOSTA' */
         S142 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         GXv_char2[0] = AV14fasdsc ;
         new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A2689ExHdrFas, GXv_char2) ;
         trabajoexterno_enviados.this.AV14fasdsc = GXv_char2[0] ;
         AV32Ctrl_1 = GXutil.str( A2248ManCod, 4, 0) + A2689ExHdrFas + GXutil.str( A129BarCod, 8, 0) + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
         if ( ( ( GXutil.strcmp(AV52Trab, httpContext.getMessage( "A", "")) == 0 ) && ( ( AV18SalExtEsB == 1 ) || (0==AV18SalExtEsB) ) ) || ( ( GXutil.strcmp(AV52Trab, httpContext.getMessage( "C", "")) == 0 ) && ( AV18SalExtEsB == 2 ) ) || ( ( GXutil.strcmp(AV52Trab, httpContext.getMessage( "T", "")) == 0 ) ) )
         {
            AV36Enccli = A143BarDisNum ;
            if ( GXutil.strcmp(A4812BarEncCli, " ") != 0 )
            {
               AV36Enccli = A4812BarEncCli ;
            }
            if ( GXutil.strcmp(A2693ExHdrTip, httpContext.getMessage( "E", "")) == 0 )
            {
               AV37FechaE = A2697ExHdrFeE ;
               if ( ! (GXutil.strcmp("", A2748CliAlias)==0) )
               {
                  AV47NomCli = A2748CliAlias ;
               }
               else
               {
                  AV47NomCli = GXutil.substring( A279CliNom, 1, 15) ;
               }
               AV11EXHDRKGE = A2695ExHdrKgE ;
               AV12EXHDRMTE = A2844ExHdrMtE ;
               AV22ExcelDocument.Cells(AV20CellRow, 1, 1, 1).setText( A2249ManNom );
               AV22ExcelDocument.Cells(AV20CellRow, 2, 1, 1).setText( AV14fasdsc );
               AV22ExcelDocument.Cells(AV20CellRow, 3, 1, 1).setText( AV43HojaRuta );
               AV22ExcelDocument.Cells(AV20CellRow, 4, 1, 1).setText( AV36Enccli );
               AV22ExcelDocument.Cells(AV20CellRow, 5, 1, 1).setNumber( A252CliCod );
               AV22ExcelDocument.Cells(AV20CellRow, 6, 1, 1).setText( AV47NomCli );
               AV22ExcelDocument.Cells(AV20CellRow, 7, 1, 1).setText( A212BarSer );
               AV22ExcelDocument.Cells(AV20CellRow, 8, 1, 1).setText( A1652BarSerDsc );
               AV22ExcelDocument.Cells(AV20CellRow, 9, 1, 1).setNumber( A2694ExHdrAlb );
               AV22ExcelDocument.Cells(AV20CellRow, 10, 1, 1).setNumber( A2696ExHdrCnE );
               AV22ExcelDocument.Cells(AV20CellRow, 11, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A2695ExHdrKgE)) );
               AV22ExcelDocument.Cells(AV20CellRow, 12, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A2844ExHdrMtE)) );
               GXt_dtime1 = GXutil.resetTime( A2697ExHdrFeE );
               AV22ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
               AV22ExcelDocument.Cells(AV20CellRow, 13, 1, 1).setDate( GXt_dtime1 );
               AV20CellRow = (int)(AV20CellRow+1) ;
            }
            else
            {
               AV22ExcelDocument.Cells(AV20CellRow, 1, 1, 1).setText( A2249ManNom );
               AV22ExcelDocument.Cells(AV20CellRow, 2, 1, 1).setText( AV14fasdsc );
               AV22ExcelDocument.Cells(AV20CellRow, 3, 1, 1).setText( AV43HojaRuta );
               AV22ExcelDocument.Cells(AV20CellRow, 4, 1, 1).setText( AV36Enccli );
               AV22ExcelDocument.Cells(AV20CellRow, 5, 1, 1).setNumber( A252CliCod );
               AV22ExcelDocument.Cells(AV20CellRow, 6, 1, 1).setText( AV47NomCli );
               AV22ExcelDocument.Cells(AV20CellRow, 7, 1, 1).setText( A212BarSer );
               AV22ExcelDocument.Cells(AV20CellRow, 8, 1, 1).setText( A1652BarSerDsc );
               AV22ExcelDocument.Cells(AV20CellRow, 9, 1, 1).setNumber( A2694ExHdrAlb );
               AV22ExcelDocument.Cells(AV20CellRow, 14, 1, 1).setNumber( A2699ExHdrCnR );
               AV22ExcelDocument.Cells(AV20CellRow, 15, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A2698ExHdrKgR)) );
               AV22ExcelDocument.Cells(AV20CellRow, 16, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A2845ExHdrMtR)) );
               GXt_dtime1 = GXutil.resetTime( A2700ExHdrFeR );
               AV22ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
               AV22ExcelDocument.Cells(AV20CellRow, 17, 1, 1).setDate( GXt_dtime1 );
               AV20CellRow = (int)(AV20CellRow+1) ;
               AV39FlagL = (byte)(1) ;
               AV38FechaR = A2700ExHdrFeR ;
               AV51TotKgsR = AV51TotKgsR.add(A2698ExHdrKgR) ;
               AV50TotConR = (short)(AV50TotConR+A2699ExHdrCnR) ;
            }
         }
         AV13ExHdrTip = A2693ExHdrTip ;
         AV45LastHdr = AV43HojaRuta ;
         AV33Ctrl_2 = GXutil.str( A2248ManCod, 4, 0) + A2689ExHdrFas + GXutil.str( A129BarCod, 8, 0) + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
         AV16ManCod = A2248ManCod ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S151( )
   {
      /* 'CLOSEDOCUMENT' Routine */
      returnInSub = false ;
      AV22ExcelDocument.Save();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S161 ();
      if (returnInSub) return;
      AV22ExcelDocument.Close();
   }

   public void S171( )
   {
      /* 'OPENDOCUMENT' Routine */
      returnInSub = false ;
      AV27Random = (int)(GXutil.random( )*10000) ;
      AV23Filename = "TrabajosExternos_Enviados-" + GXutil.trim( GXutil.str( AV27Random, 8, 0)) + ".xlsx" ;
      AV22ExcelDocument.Open(AV23Filename);
      /* Execute user subroutine: 'CHECKSTATUS' */
      S161 ();
      if (returnInSub) return;
      AV22ExcelDocument.Clear();
   }

   public void S161( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV22ExcelDocument.getErrCode() != 0 )
      {
         AV23Filename = "" ;
         AV21ErrorMessage = AV22ExcelDocument.getErrDescription() ;
         AV22ExcelDocument.Close();
         returnInSub = true;
         if (true) return;
      }
   }

   public void S132( )
   {
      /* 'DIF' Routine */
      returnInSub = false ;
      AV35DifKgs = DecimalUtil.ZERO ;
      AV46MerKgs = DecimalUtil.ZERO ;
      AV34DiasSer = (short)(0) ;
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV51TotKgsR)==0) )
      {
         AV35DifKgs = AV11EXHDRKGE.subtract(AV51TotKgsR) ;
         AV46MerKgs = ((AV51TotKgsR.subtract(AV11EXHDRKGE)).divide(AV11EXHDRKGE, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) ;
         AV34DiasSer = (short)(GXutil.ddiff(AV38FechaR,AV37FechaE)) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV51TotKgsR)==0) )
      {
         AV20CellRow = (int)(AV20CellRow+1) ;
         AV22ExcelDocument.Cells(AV20CellRow, 18, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV35DifKgs)) );
         AV22ExcelDocument.Cells(AV20CellRow, 19, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV46MerKgs)) );
         AV22ExcelDocument.Cells(AV20CellRow, 20, 1, 1).setNumber( AV34DiasSer );
      }
      AV51TotKgsR = DecimalUtil.doubleToDec(0) ;
      AV50TotConR = (short)(0) ;
   }

   public void S142( )
   {
      /* 'LEOSTA' Routine */
      returnInSub = false ;
      AV48Sta = "" ;
      AV18SalExtEsB = (byte)(0) ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Short.valueOf(AV25Pman) ,
                                           Short.valueOf(AV30Uman2) ,
                                           Short.valueOf(A2248ManCod) ,
                                           A396EmprCod ,
                                           Integer.valueOf(AV17SalExtAlb) ,
                                           Integer.valueOf(AV8BarCod) ,
                                           Byte.valueOf(AV10BarCodReo) ,
                                           AV9BarCodPar ,
                                           Integer.valueOf(A2253SalExtAlb) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      /* Using cursor P0AC13 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV17SalExtAlb), Integer.valueOf(AV8BarCod), Byte.valueOf(AV10BarCodReo), AV9BarCodPar, Short.valueOf(AV25Pman), Short.valueOf(AV30Uman2)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A2248ManCod = P0AC13_A2248ManCod[0] ;
         A130BarCodPar = P0AC13_A130BarCodPar[0] ;
         n130BarCodPar = P0AC13_n130BarCodPar[0] ;
         A132BarCodReo = P0AC13_A132BarCodReo[0] ;
         n132BarCodReo = P0AC13_n132BarCodReo[0] ;
         A129BarCod = P0AC13_A129BarCod[0] ;
         n129BarCod = P0AC13_n129BarCod[0] ;
         A2253SalExtAlb = P0AC13_A2253SalExtAlb[0] ;
         A2255SalExtObs1 = P0AC13_A2255SalExtObs1[0] ;
         n2255SalExtObs1 = P0AC13_n2255SalExtObs1[0] ;
         A2262SalExtEsB = P0AC13_A2262SalExtEsB[0] ;
         n2262SalExtEsB = P0AC13_n2262SalExtEsB[0] ;
         A2248ManCod = P0AC13_A2248ManCod[0] ;
         AV18SalExtEsB = A2262SalExtEsB ;
         if ( ( A2262SalExtEsB == 1 ) || (0==A2262SalExtEsB) )
         {
            AV48Sta = httpContext.getMessage( "A", "") ;
         }
         if ( A2262SalExtEsB == 2 )
         {
            AV48Sta = httpContext.getMessage( "C", "") ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP11[0] = trabajoexterno_enviados.this.AV23Filename;
      this.aP12[0] = trabajoexterno_enviados.this.AV21ErrorMessage;
      CloseOpenCursors();
      AV22ExcelDocument.cleanup();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV23Filename = "" ;
      AV21ErrorMessage = "" ;
      AV22ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      AV37FechaE = GXutil.nullDate() ;
      AV38FechaR = GXutil.nullDate() ;
      AV51TotKgsR = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      A2689ExHdrFas = "" ;
      A2697ExHdrFeE = GXutil.nullDate() ;
      P0AC12_A396EmprCod = new String[] {""} ;
      P0AC12_A2694ExHdrAlb = new int[1] ;
      P0AC12_n2694ExHdrAlb = new boolean[] {false} ;
      P0AC12_A143BarDisNum = new String[] {""} ;
      P0AC12_A4812BarEncCli = new String[] {""} ;
      P0AC12_A2697ExHdrFeE = new java.util.Date[] {GXutil.nullDate()} ;
      P0AC12_n2697ExHdrFeE = new boolean[] {false} ;
      P0AC12_A2748CliAlias = new String[] {""} ;
      P0AC12_A279CliNom = new String[] {""} ;
      P0AC12_A2695ExHdrKgE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AC12_n2695ExHdrKgE = new boolean[] {false} ;
      P0AC12_A2844ExHdrMtE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AC12_n2844ExHdrMtE = new boolean[] {false} ;
      P0AC12_A2249ManNom = new String[] {""} ;
      P0AC12_n2249ManNom = new boolean[] {false} ;
      P0AC12_A252CliCod = new int[1] ;
      P0AC12_n252CliCod = new boolean[] {false} ;
      P0AC12_A212BarSer = new String[] {""} ;
      P0AC12_A1652BarSerDsc = new String[] {""} ;
      P0AC12_A2696ExHdrCnE = new short[1] ;
      P0AC12_n2696ExHdrCnE = new boolean[] {false} ;
      P0AC12_A2699ExHdrCnR = new short[1] ;
      P0AC12_n2699ExHdrCnR = new boolean[] {false} ;
      P0AC12_A2698ExHdrKgR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AC12_n2698ExHdrKgR = new boolean[] {false} ;
      P0AC12_A2845ExHdrMtR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AC12_n2845ExHdrMtR = new boolean[] {false} ;
      P0AC12_A2700ExHdrFeR = new java.util.Date[] {GXutil.nullDate()} ;
      P0AC12_n2700ExHdrFeR = new boolean[] {false} ;
      P0AC12_A2693ExHdrTip = new String[] {""} ;
      P0AC12_n2693ExHdrTip = new boolean[] {false} ;
      P0AC12_A130BarCodPar = new String[] {""} ;
      P0AC12_n130BarCodPar = new boolean[] {false} ;
      P0AC12_A132BarCodReo = new byte[1] ;
      P0AC12_n132BarCodReo = new boolean[] {false} ;
      P0AC12_A129BarCod = new int[1] ;
      P0AC12_n129BarCod = new boolean[] {false} ;
      P0AC12_A2689ExHdrFas = new String[] {""} ;
      P0AC12_A2248ManCod = new short[1] ;
      P0AC12_A2692ExHdrLin = new int[1] ;
      A143BarDisNum = "" ;
      A4812BarEncCli = "" ;
      A2748CliAlias = "" ;
      A279CliNom = "" ;
      A2695ExHdrKgE = DecimalUtil.ZERO ;
      A2844ExHdrMtE = DecimalUtil.ZERO ;
      A2249ManNom = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A2698ExHdrKgR = DecimalUtil.ZERO ;
      A2845ExHdrMtR = DecimalUtil.ZERO ;
      A2700ExHdrFeR = GXutil.nullDate() ;
      A2693ExHdrTip = "" ;
      A130BarCodPar = "" ;
      AV43HojaRuta = "" ;
      AV45LastHdr = "" ;
      AV9BarCodPar = "" ;
      AV14fasdsc = "" ;
      GXv_char2 = new String[1] ;
      AV32Ctrl_1 = "" ;
      AV36Enccli = "" ;
      AV47NomCli = "" ;
      AV11EXHDRKGE = DecimalUtil.ZERO ;
      AV12EXHDRMTE = DecimalUtil.ZERO ;
      GXt_dtime1 = GXutil.resetTime( GXutil.nullDate() );
      AV13ExHdrTip = "" ;
      AV33Ctrl_2 = "" ;
      AV35DifKgs = DecimalUtil.ZERO ;
      AV46MerKgs = DecimalUtil.ZERO ;
      AV48Sta = "" ;
      P0AC13_A396EmprCod = new String[] {""} ;
      P0AC13_A2248ManCod = new short[1] ;
      P0AC13_A130BarCodPar = new String[] {""} ;
      P0AC13_n130BarCodPar = new boolean[] {false} ;
      P0AC13_A132BarCodReo = new byte[1] ;
      P0AC13_n132BarCodReo = new boolean[] {false} ;
      P0AC13_A129BarCod = new int[1] ;
      P0AC13_n129BarCod = new boolean[] {false} ;
      P0AC13_A2253SalExtAlb = new int[1] ;
      P0AC13_A2255SalExtObs1 = new String[] {""} ;
      P0AC13_n2255SalExtObs1 = new boolean[] {false} ;
      P0AC13_A2262SalExtEsB = new byte[1] ;
      P0AC13_n2262SalExtEsB = new boolean[] {false} ;
      A2255SalExtObs1 = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.trabajosexternos.trabajoexterno_enviados__default(),
         new Object[] {
             new Object[] {
            P0AC12_A396EmprCod, P0AC12_A2694ExHdrAlb, P0AC12_n2694ExHdrAlb, P0AC12_A143BarDisNum, P0AC12_A4812BarEncCli, P0AC12_A2697ExHdrFeE, P0AC12_n2697ExHdrFeE, P0AC12_A2748CliAlias, P0AC12_A279CliNom, P0AC12_A2695ExHdrKgE,
            P0AC12_n2695ExHdrKgE, P0AC12_A2844ExHdrMtE, P0AC12_n2844ExHdrMtE, P0AC12_A2249ManNom, P0AC12_n2249ManNom, P0AC12_A252CliCod, P0AC12_n252CliCod, P0AC12_A212BarSer, P0AC12_A1652BarSerDsc, P0AC12_A2696ExHdrCnE,
            P0AC12_n2696ExHdrCnE, P0AC12_A2699ExHdrCnR, P0AC12_n2699ExHdrCnR, P0AC12_A2698ExHdrKgR, P0AC12_n2698ExHdrKgR, P0AC12_A2845ExHdrMtR, P0AC12_n2845ExHdrMtR, P0AC12_A2700ExHdrFeR, P0AC12_n2700ExHdrFeR, P0AC12_A2693ExHdrTip,
            P0AC12_n2693ExHdrTip, P0AC12_A130BarCodPar, P0AC12_n130BarCodPar, P0AC12_A132BarCodReo, P0AC12_n132BarCodReo, P0AC12_A129BarCod, P0AC12_n129BarCod, P0AC12_A2689ExHdrFas, P0AC12_A2248ManCod, P0AC12_A2692ExHdrLin
            }
            , new Object[] {
            P0AC13_A396EmprCod, P0AC13_A2248ManCod, P0AC13_A130BarCodPar, P0AC13_A132BarCodReo, P0AC13_A129BarCod, P0AC13_A2253SalExtAlb, P0AC13_A2255SalExtObs1, P0AC13_n2255SalExtObs1, P0AC13_A2262SalExtEsB, P0AC13_n2262SalExtEsB
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV42Fuente ;
   private byte AV39FlagL ;
   private byte AV40FlagM ;
   private byte AV41FlagO ;
   private byte A132BarCodReo ;
   private byte AV10BarCodReo ;
   private byte AV18SalExtEsB ;
   private byte A2262SalExtEsB ;
   private short AV25Pman ;
   private short AV30Uman2 ;
   private short AV16ManCod ;
   private short A2248ManCod ;
   private short A2696ExHdrCnE ;
   private short A2699ExHdrCnR ;
   private short AV50TotConR ;
   private short AV34DiasSer ;
   private short Gx_err ;
   private int AV20CellRow ;
   private int AV19CellCol ;
   private int A2694ExHdrAlb ;
   private int A252CliCod ;
   private int A129BarCod ;
   private int A2692ExHdrLin ;
   private int AV8BarCod ;
   private int AV17SalExtAlb ;
   private int AV27Random ;
   private int A2253SalExtAlb ;
   private java.math.BigDecimal AV51TotKgsR ;
   private java.math.BigDecimal A2695ExHdrKgE ;
   private java.math.BigDecimal A2844ExHdrMtE ;
   private java.math.BigDecimal A2698ExHdrKgR ;
   private java.math.BigDecimal A2845ExHdrMtR ;
   private java.math.BigDecimal AV11EXHDRKGE ;
   private java.math.BigDecimal AV12EXHDRMTE ;
   private java.math.BigDecimal AV35DifKgs ;
   private java.math.BigDecimal AV46MerKgs ;
   private String A396EmprCod ;
   private String AV26POpe ;
   private String AV31UOpe2 ;
   private String AV49TipPapel ;
   private String AV52Trab ;
   private String AV15ImpCod ;
   private String scmdbuf ;
   private String A2689ExHdrFas ;
   private String A143BarDisNum ;
   private String A4812BarEncCli ;
   private String A2748CliAlias ;
   private String A279CliNom ;
   private String A2249ManNom ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A2693ExHdrTip ;
   private String A130BarCodPar ;
   private String AV43HojaRuta ;
   private String AV45LastHdr ;
   private String AV9BarCodPar ;
   private String AV14fasdsc ;
   private String GXv_char2[] ;
   private String AV32Ctrl_1 ;
   private String AV36Enccli ;
   private String AV47NomCli ;
   private String AV13ExHdrTip ;
   private String AV33Ctrl_2 ;
   private String AV48Sta ;
   private String A2255SalExtObs1 ;
   private java.util.Date GXt_dtime1 ;
   private java.util.Date AV24PAlbFch ;
   private java.util.Date AV29UFecha2 ;
   private java.util.Date AV37FechaE ;
   private java.util.Date AV38FechaR ;
   private java.util.Date A2697ExHdrFeE ;
   private java.util.Date A2700ExHdrFeR ;
   private boolean returnInSub ;
   private boolean n2694ExHdrAlb ;
   private boolean n2697ExHdrFeE ;
   private boolean n2695ExHdrKgE ;
   private boolean n2844ExHdrMtE ;
   private boolean n2249ManNom ;
   private boolean n252CliCod ;
   private boolean n2696ExHdrCnE ;
   private boolean n2699ExHdrCnR ;
   private boolean n2698ExHdrKgR ;
   private boolean n2845ExHdrMtR ;
   private boolean n2700ExHdrFeR ;
   private boolean n2693ExHdrTip ;
   private boolean n130BarCodPar ;
   private boolean n132BarCodReo ;
   private boolean n129BarCod ;
   private boolean n2255SalExtObs1 ;
   private boolean n2262SalExtEsB ;
   private String AV23Filename ;
   private String AV21ErrorMessage ;
   private String[] aP12 ;
   private String[] aP11 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AC12_A396EmprCod ;
   private int[] P0AC12_A2694ExHdrAlb ;
   private boolean[] P0AC12_n2694ExHdrAlb ;
   private String[] P0AC12_A143BarDisNum ;
   private String[] P0AC12_A4812BarEncCli ;
   private java.util.Date[] P0AC12_A2697ExHdrFeE ;
   private boolean[] P0AC12_n2697ExHdrFeE ;
   private String[] P0AC12_A2748CliAlias ;
   private String[] P0AC12_A279CliNom ;
   private java.math.BigDecimal[] P0AC12_A2695ExHdrKgE ;
   private boolean[] P0AC12_n2695ExHdrKgE ;
   private java.math.BigDecimal[] P0AC12_A2844ExHdrMtE ;
   private boolean[] P0AC12_n2844ExHdrMtE ;
   private String[] P0AC12_A2249ManNom ;
   private boolean[] P0AC12_n2249ManNom ;
   private int[] P0AC12_A252CliCod ;
   private boolean[] P0AC12_n252CliCod ;
   private String[] P0AC12_A212BarSer ;
   private String[] P0AC12_A1652BarSerDsc ;
   private short[] P0AC12_A2696ExHdrCnE ;
   private boolean[] P0AC12_n2696ExHdrCnE ;
   private short[] P0AC12_A2699ExHdrCnR ;
   private boolean[] P0AC12_n2699ExHdrCnR ;
   private java.math.BigDecimal[] P0AC12_A2698ExHdrKgR ;
   private boolean[] P0AC12_n2698ExHdrKgR ;
   private java.math.BigDecimal[] P0AC12_A2845ExHdrMtR ;
   private boolean[] P0AC12_n2845ExHdrMtR ;
   private java.util.Date[] P0AC12_A2700ExHdrFeR ;
   private boolean[] P0AC12_n2700ExHdrFeR ;
   private String[] P0AC12_A2693ExHdrTip ;
   private boolean[] P0AC12_n2693ExHdrTip ;
   private String[] P0AC12_A130BarCodPar ;
   private boolean[] P0AC12_n130BarCodPar ;
   private byte[] P0AC12_A132BarCodReo ;
   private boolean[] P0AC12_n132BarCodReo ;
   private int[] P0AC12_A129BarCod ;
   private boolean[] P0AC12_n129BarCod ;
   private String[] P0AC12_A2689ExHdrFas ;
   private short[] P0AC12_A2248ManCod ;
   private int[] P0AC12_A2692ExHdrLin ;
   private String[] P0AC13_A396EmprCod ;
   private short[] P0AC13_A2248ManCod ;
   private String[] P0AC13_A130BarCodPar ;
   private boolean[] P0AC13_n130BarCodPar ;
   private byte[] P0AC13_A132BarCodReo ;
   private boolean[] P0AC13_n132BarCodReo ;
   private int[] P0AC13_A129BarCod ;
   private boolean[] P0AC13_n129BarCod ;
   private int[] P0AC13_A2253SalExtAlb ;
   private String[] P0AC13_A2255SalExtObs1 ;
   private boolean[] P0AC13_n2255SalExtObs1 ;
   private byte[] P0AC13_A2262SalExtEsB ;
   private boolean[] P0AC13_n2262SalExtEsB ;
   private com.genexus.gxoffice.ExcelDoc AV22ExcelDocument ;
}

final  class trabajoexterno_enviados__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AC12( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV25Pman ,
                                          short AV30Uman2 ,
                                          String AV26POpe ,
                                          String AV31UOpe2 ,
                                          java.util.Date AV24PAlbFch ,
                                          java.util.Date AV29UFecha2 ,
                                          short A2248ManCod ,
                                          String A2689ExHdrFas ,
                                          java.util.Date A2697ExHdrFeE ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int3 = new byte[7];
      Object[] GXv_Object4 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ExHdrAlb, T2.BarDisNum, T2.BarEncCli, T1.ExHdrFeE, T3.CliAlias, T3.CliNom, T1.ExHdrKgE, T1.ExHdrMtE, T4.ManNom, T2.CliCod, T2.BarSer, T2.BarSerDsc," ;
      scmdbuf += " T1.ExHdrCnE, T1.ExHdrCnR, T1.ExHdrKgR, T1.ExHdrMtR, T1.ExHdrFeR, T1.ExHdrTip, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.ExHdrFas, T1.ManCod, T1.ExHdrLin FROM (((TXPLEXMVH" ;
      scmdbuf += " T1 LEFT JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT" ;
      scmdbuf += " T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod) INNER JOIN TXPMANUFA T4 ON T4.EmprCod = T1.EmprCod AND T4.ManCod = T1.ManCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV25Pman) )
      {
         addWhere(sWhereString, "(T1.ManCod >= ?)");
      }
      else
      {
         GXv_int3[1] = (byte)(1) ;
      }
      if ( ! (0==AV30Uman2) )
      {
         addWhere(sWhereString, "(T1.ManCod <= ?)");
      }
      else
      {
         GXv_int3[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV26POpe)==0) )
      {
         addWhere(sWhereString, "(T1.ExHdrFas >= ?)");
      }
      else
      {
         GXv_int3[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV31UOpe2)==0) )
      {
         addWhere(sWhereString, "(T1.ExHdrFas <= ?)");
      }
      else
      {
         GXv_int3[4] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV24PAlbFch)) )
      {
         addWhere(sWhereString, "(T1.ExHdrFeE >= ?)");
      }
      else
      {
         GXv_int3[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV29UFecha2)) )
      {
         addWhere(sWhereString, "(T1.ExHdrFeE <= ?)");
      }
      else
      {
         GXv_int3[6] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.ManCod, T1.ExHdrFas, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ExHdrTip" ;
      GXv_Object4[0] = scmdbuf ;
      GXv_Object4[1] = GXv_int3 ;
      return GXv_Object4 ;
   }

   protected Object[] conditional_P0AC13( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV25Pman ,
                                          short AV30Uman2 ,
                                          short A2248ManCod ,
                                          String A396EmprCod ,
                                          int AV17SalExtAlb ,
                                          int AV8BarCod ,
                                          byte AV10BarCodReo ,
                                          String AV9BarCodPar ,
                                          int A2253SalExtAlb ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[7];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T2.ManCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.SalExtAlb, T1.SalExtObs1, T1.SalExtEsB FROM (TXPLEXTSA T1 INNER JOIN TXPCEXTSA T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.SalExtAlb = T1.SalExtAlb)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.SalExtAlb = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?)");
      if ( ! (0==AV25Pman) )
      {
         addWhere(sWhereString, "(T2.ManCod >= ?)");
      }
      else
      {
         GXv_int5[5] = (byte)(1) ;
      }
      if ( ! (0==AV30Uman2) )
      {
         addWhere(sWhereString, "(T2.ManCod <= ?)");
      }
      else
      {
         GXv_int5[6] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.SalExtAlb, T1.BarCod, T1.BarCodReo, T1.BarCodPar" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.IHttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_P0AC12(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , (String)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (String)dynConstraints[9] );
            case 1 :
                  return conditional_P0AC13(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).byteValue() , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AC12", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AC13", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 8);
               ((String[]) buf[4])[0] = rslt.getString(4, 20);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 16);
               ((String[]) buf[8])[0] = rslt.getString(7, 30);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(11);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(12, 16);
               ((String[]) buf[18])[0] = rslt.getString(13, 26);
               ((short[]) buf[19])[0] = rslt.getShort(14);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(15);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(17,2);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[27])[0] = rslt.getGXDate(18);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(19, 1);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(20, 1);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((byte[]) buf[33])[0] = rslt.getByte(21);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((int[]) buf[35])[0] = rslt.getInt(22);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(23, 8);
               ((short[]) buf[38])[0] = rslt.getShort(24);
               ((int[]) buf[39])[0] = rslt.getInt(25);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      short sIdx;
      switch ( cursor )
      {
            case 0 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[8]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[9]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[12]);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[13]);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[8]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[9]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[10]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 1);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[12]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[13]).shortValue());
               }
               return;
      }
   }

}

