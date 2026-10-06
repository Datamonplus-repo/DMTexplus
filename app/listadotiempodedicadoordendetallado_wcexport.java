package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class listadotiempodedicadoordendetallado_wcexport extends GXProcedure
{
   public listadotiempodedicadoordendetallado_wcexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( listadotiempodedicadoordendetallado_wcexport.class ), "" );
   }

   public listadotiempodedicadoordendetallado_wcexport( int remoteHandle ,
                                                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( int aP0 ,
                             int aP1 ,
                             String aP2 ,
                             String aP3 ,
                             int aP4 ,
                             int aP5 ,
                             java.util.Date aP6 ,
                             java.util.Date aP7 ,
                             byte aP8 ,
                             String[] aP9 )
   {
      listadotiempodedicadoordendetallado_wcexport.this.aP10 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
      return aP10[0];
   }

   public void execute( int aP0 ,
                        int aP1 ,
                        String aP2 ,
                        String aP3 ,
                        int aP4 ,
                        int aP5 ,
                        java.util.Date aP6 ,
                        java.util.Date aP7 ,
                        byte aP8 ,
                        String[] aP9 ,
                        String[] aP10 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
   }

   private void execute_int( int aP0 ,
                             int aP1 ,
                             String aP2 ,
                             String aP3 ,
                             int aP4 ,
                             int aP5 ,
                             java.util.Date aP6 ,
                             java.util.Date aP7 ,
                             byte aP8 ,
                             String[] aP9 ,
                             String[] aP10 )
   {
      listadotiempodedicadoordendetallado_wcexport.this.AV13OmCod = aP0;
      listadotiempodedicadoordendetallado_wcexport.this.AV14OmCod_to = aP1;
      listadotiempodedicadoordendetallado_wcexport.this.AV11Ommaqcod = aP2;
      listadotiempodedicadoordendetallado_wcexport.this.AV15OmMaqCod_to = aP3;
      listadotiempodedicadoordendetallado_wcexport.this.AV17OmOpeCod = aP4;
      listadotiempodedicadoordendetallado_wcexport.this.AV16OmOpeCod_to = aP5;
      listadotiempodedicadoordendetallado_wcexport.this.AV18OMFchCer = aP6;
      listadotiempodedicadoordendetallado_wcexport.this.AV19OMFchCer_to = aP7;
      listadotiempodedicadoordendetallado_wcexport.this.AV20Preventivos = aP8;
      listadotiempodedicadoordendetallado_wcexport.this.aP9 = aP9;
      listadotiempodedicadoordendetallado_wcexport.this.aP10 = aP10;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV41Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      listadotiempodedicadoordendetallado_wcexport.this.GXt_char1 = GXv_char2[0] ;
      AV41Station = GXt_char1 ;
      GXv_char2[0] = AV21EmprCod ;
      GXv_char3[0] = AV42EmprNom ;
      GXv_char4[0] = AV43UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV41Station, GXv_char2, GXv_char3, GXv_char4) ;
      listadotiempodedicadoordendetallado_wcexport.this.AV21EmprCod = GXv_char2[0] ;
      listadotiempodedicadoordendetallado_wcexport.this.AV42EmprNom = GXv_char3[0] ;
      listadotiempodedicadoordendetallado_wcexport.this.AV43UsurCod = GXv_char4[0] ;
      /* Execute user subroutine: 'OPENDOCUMENT' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'CARGADATOSFILTROS' */
      S171 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'TITULODATOSFILTROS' */
      S181 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'EXPORTAR' */
      S131 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'CLOSEDOCUMENT' */
      S161 ();
      if ( returnInSub )
      {
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'OPENDOCUMENT' Routine */
      returnInSub = false ;
      AV33Random = (int)(GXutil.random( )*10000) ;
      AV34Filename = "ListadoTiempoDedicadoOrdenDetallado-" + GXutil.trim( GXutil.str( AV33Random, 8, 0)) + ".xlsx" ;
      AV10exceldocument.Open(AV34Filename);
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV10exceldocument.Clear();
   }

   public void S131( )
   {
      /* 'EXPORTAR' Routine */
      returnInSub = false ;
      AV10exceldocument.setAutoFit( (short)(0) );
      AV26cellrow = 3 ;
      AV27cellcol = 1 ;
      while ( AV27cellcol <= 13 )
      {
         AV10exceldocument.Cells((int)(AV26cellrow), (int)(AV27cellcol), 1, 1).setBold( (short)(1) );
         AV10exceldocument.Cells((int)(AV26cellrow), (int)(AV27cellcol), 1, 1).setColor( 11 );
         AV27cellcol = (long)(AV27cellcol+1) ;
      }
      /* Execute user subroutine: 'TITULOS' */
      S141 ();
      if (returnInSub) return;
      AV26cellrow = 4 ;
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV19OMFchCer_to)) )
      {
         AV29Omfchcer_to2 = GXutil.serverDate( context, remoteHandle, pr_default) ;
      }
      else
      {
         AV29Omfchcer_to2 = AV19OMFchCer_to ;
      }
      AV30Omopecod_to2 = ((0==AV16OmOpeCod_to) ? 999999 : AV16OmOpeCod_to) ;
      AV31Omcod_to2 = ((0==AV14OmCod_to) ? 99999999 : AV14OmCod_to) ;
      AV32Ommaqcod_to2 = ((GXutil.strcmp("", AV15OmMaqCod_to)==0) ? httpContext.getMessage( "zzzzzz", "") : AV15OmMaqCod_to) ;
      /* Using cursor P0A3V2 */
      pr_default.execute(0, new Object[] {AV21EmprCod, Integer.valueOf(AV13OmCod), Integer.valueOf(AV31Omcod_to2), Byte.valueOf(AV20Preventivos), Byte.valueOf(AV20Preventivos), AV11Ommaqcod, AV32Ommaqcod_to2});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P0A3V2_A396EmprCod[0] ;
         A9426OMMaqCod = P0A3V2_A9426OMMaqCod[0] ;
         A9429PMCod = P0A3V2_A9429PMCod[0] ;
         n9429PMCod = P0A3V2_n9429PMCod[0] ;
         A9439OMFchCer = P0A3V2_A9439OMFchCer[0] ;
         A9425OMCod = P0A3V2_A9425OMCod[0] ;
         A9445OMEst = P0A3V2_A9445OMEst[0] ;
         A9427OMMaqDsc = P0A3V2_A9427OMMaqDsc[0] ;
         n9427OMMaqDsc = P0A3V2_n9427OMMaqDsc[0] ;
         A9436OMFchCre = P0A3V2_A9436OMFchCre[0] ;
         A9433OMTxt = P0A3V2_A9433OMTxt[0] ;
         A9427OMMaqDsc = P0A3V2_A9427OMMaqDsc[0] ;
         n9427OMMaqDsc = P0A3V2_n9427OMMaqDsc[0] ;
         if ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "R", "")) == 0 )
         {
            if ( (( GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A9439OMFchCer, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))).after( GXutil.resetTime( AV18OMFchCer )) ) || ( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A9439OMFchCer, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV18OMFchCer)) )) )
            {
               if ( (( GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A9439OMFchCer, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))).before( GXutil.resetTime( AV29Omfchcer_to2 )) ) || ( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A9439OMFchCer, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV29Omfchcer_to2)) )) )
               {
                  AV44OMCodRead = A9425OMCod ;
                  AV12OMMCTie = DecimalUtil.ZERO ;
                  /* Execute user subroutine: 'OBTENER_TIEMPO' */
                  S152 ();
                  if ( returnInSub )
                  {
                     pr_default.close(0);
                     pr_default.close(0);
                     returnInSub = true;
                     if (true) return;
                  }
                  AV10exceldocument.Cells((int)(AV26cellrow), 1, 1, 1).setNumber( A9425OMCod );
                  AV10exceldocument.Cells((int)(AV26cellrow), 2, 1, 1).setText( ((0==A9429PMCod) ? httpContext.getMessage( "Preventiva", "") : GXutil.trim( GXutil.str( A9429PMCod, 8, 0))) );
                  AV10exceldocument.Cells((int)(AV26cellrow), 3, 1, 1).setText( A9426OMMaqCod );
                  AV10exceldocument.Cells((int)(AV26cellrow), 4, 1, 1).setText( A9427OMMaqDsc );
                  AV10exceldocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                  AV10exceldocument.Cells((int)(AV26cellrow), 5, 1, 1).setDate( A9436OMFchCre );
                  AV10exceldocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                  AV10exceldocument.Cells((int)(AV26cellrow), 6, 1, 1).setDate( A9439OMFchCer );
                  AV10exceldocument.Cells((int)(AV26cellrow), 7, 1, 1).setText( A9433OMTxt );
                  AV52GXLvl77 = (byte)(0) ;
                  /* Using cursor P0A3V3 */
                  pr_default.execute(1, new Object[] {AV21EmprCod, Integer.valueOf(AV44OMCodRead)});
                  while ( (pr_default.getStatus(1) != 101) )
                  {
                     A9425OMCod = P0A3V3_A9425OMCod[0] ;
                     A396EmprCod = P0A3V3_A396EmprCod[0] ;
                     A9447OMRepNom = P0A3V3_A9447OMRepNom[0] ;
                     n9447OMRepNom = P0A3V3_n9447OMRepNom[0] ;
                     A9452OMRCCnt = P0A3V3_A9452OMRCCnt[0] ;
                     A9453OMRCPre = P0A3V3_A9453OMRCPre[0] ;
                     A9495MRStkAct = P0A3V3_A9495MRStkAct[0] ;
                     n9495MRStkAct = P0A3V3_n9495MRStkAct[0] ;
                     A9446OMRepCod = P0A3V3_A9446OMRepCod[0] ;
                     A9449OMRTpo = P0A3V3_A9449OMRTpo[0] ;
                     A9447OMRepNom = P0A3V3_A9447OMRepNom[0] ;
                     n9447OMRepNom = P0A3V3_n9447OMRepNom[0] ;
                     A9495MRStkAct = P0A3V3_A9495MRStkAct[0] ;
                     n9495MRStkAct = P0A3V3_n9495MRStkAct[0] ;
                     AV52GXLvl77 = (byte)(1) ;
                     AV10exceldocument.Cells((int)(AV26cellrow), 8, 1, 1).setNumber( A9446OMRepCod );
                     AV10exceldocument.Cells((int)(AV26cellrow), 9, 1, 1).setText( A9447OMRepNom );
                     AV10exceldocument.Cells((int)(AV26cellrow), 10, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A9452OMRCCnt)) );
                     AV10exceldocument.Cells((int)(AV26cellrow), 11, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A9453OMRCPre)) );
                     AV10exceldocument.Cells((int)(AV26cellrow), 12, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A9495MRStkAct)) );
                     AV26cellrow = (long)(AV26cellrow+1) ;
                     pr_default.readNext(1);
                  }
                  pr_default.close(1);
                  if ( AV52GXLvl77 == 0 )
                  {
                     AV26cellrow = (long)(AV26cellrow+1) ;
                  }
               }
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV10exceldocument.Save();
      AV10exceldocument.Show();
   }

   public void S141( )
   {
      /* 'TITULOS' Routine */
      returnInSub = false ;
      AV10exceldocument.Cells(3, 1, 1, 1).setText( httpContext.getMessage( "Orden", "") );
      AV10exceldocument.Cells(3, 2, 1, 1).setText( httpContext.getMessage( "Preventivo", "") );
      AV10exceldocument.Cells(3, 3, 1, 1).setText( httpContext.getMessage( "Máquina", "") );
      AV10exceldocument.Cells(3, 4, 1, 1).setText( httpContext.getMessage( "Descripción", "") );
      AV10exceldocument.Cells(3, 5, 1, 1).setText( httpContext.getMessage( "Fecha alta", "") );
      AV10exceldocument.Cells(3, 6, 1, 1).setText( httpContext.getMessage( "Fecha Cierre", "") );
      AV10exceldocument.Cells(3, 7, 1, 1).setText( httpContext.getMessage( "Trabajo", "") );
      AV10exceldocument.Cells(3, 8, 1, 1).setText( httpContext.getMessage( "Repuesto", "") );
      AV10exceldocument.Cells(3, 9, 1, 1).setText( httpContext.getMessage( "Descripción", "") );
      AV10exceldocument.Cells(3, 10, 1, 1).setText( httpContext.getMessage( "Cantidad", "") );
      AV10exceldocument.Cells(3, 11, 1, 1).setText( httpContext.getMessage( "Precio", "") );
      AV10exceldocument.Cells(3, 12, 1, 1).setText( httpContext.getMessage( "Stock actual", "") );
   }

   public void S152( )
   {
      /* 'OBTENER_TIEMPO' Routine */
      returnInSub = false ;
      /* Using cursor P0A3V4 */
      pr_default.execute(2, new Object[] {Integer.valueOf(AV17OmOpeCod), Integer.valueOf(AV30Omopecod_to2)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A9455OMOpeCod = P0A3V4_A9455OMOpeCod[0] ;
         A9468OMMCIni = P0A3V4_A9468OMMCIni[0] ;
         A9469OMMCFin = P0A3V4_A9469OMMCFin[0] ;
         A9425OMCod = P0A3V4_A9425OMCod[0] ;
         A396EmprCod = P0A3V4_A396EmprCod[0] ;
         A9458OMMTpo = P0A3V4_A9458OMMTpo[0] ;
         A9466OMMCLin = P0A3V4_A9466OMMCLin[0] ;
         AV37tiempo = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.dtdiff( A9469OMMCFin, A9468OMMCIni)/ (double) (60)), 0))) ;
         AV12OMMCTie = AV12OMMCTie.add(DecimalUtil.doubleToDec(AV37tiempo)) ;
         pr_default.readNext(2);
      }
      pr_default.close(2);
      AV38HorRea = (short)(DecimalUtil.decToDouble(AV12OMMCTie.divide(DecimalUtil.doubleToDec(60), 18, java.math.RoundingMode.DOWN))) ;
      AV39HorReaint = (short)(GXutil.Int( AV38HorRea)) ;
      AV40MinRea = (short)(DecimalUtil.decToDouble(AV12OMMCTie.subtract(DecimalUtil.doubleToDec((AV39HorReaint*60))))) ;
      AV40MinRea = (short)(GXutil.Int( AV40MinRea)) ;
      AV36hhmmalfa = GXutil.padl( GXutil.trim( GXutil.str( AV39HorReaint, 4, 0)), (short)(2), "0") + ":" + GXutil.padl( GXutil.trim( GXutil.str( AV40MinRea, 4, 0)), (short)(2), "0") ;
   }

   public void S161( )
   {
      /* 'CLOSEDOCUMENT' Routine */
      returnInSub = false ;
      AV10exceldocument.Save();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV10exceldocument.Close();
   }

   public void S121( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV10exceldocument.getErrCode() != 0 )
      {
         AV34Filename = "" ;
         AV35ErrorMessage = AV10exceldocument.getErrDescription() ;
         AV10exceldocument.Close();
         returnInSub = true;
         if (true) return;
      }
   }

   public void S171( )
   {
      /* 'CARGADATOSFILTROS' Routine */
      returnInSub = false ;
      GXt_char1 = AV41Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      listadotiempodedicadoordendetallado_wcexport.this.GXt_char1 = GXv_char4[0] ;
      AV41Station = GXt_char1 ;
      GXv_char4[0] = AV21EmprCod ;
      GXv_char3[0] = AV42EmprNom ;
      GXv_char2[0] = AV43UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV41Station, GXv_char4, GXv_char3, GXv_char2) ;
      listadotiempodedicadoordendetallado_wcexport.this.AV21EmprCod = GXv_char4[0] ;
      listadotiempodedicadoordendetallado_wcexport.this.AV42EmprNom = GXv_char3[0] ;
      listadotiempodedicadoordendetallado_wcexport.this.AV43UsurCod = GXv_char2[0] ;
      if ( AV20Preventivos == 1 )
      {
         AV45PreventivosTxt = httpContext.getMessage( "Si", "") ;
      }
      else
      {
         AV45PreventivosTxt = httpContext.getMessage( "No", "") ;
      }
   }

   public void S181( )
   {
      /* 'TITULODATOSFILTROS' Routine */
      returnInSub = false ;
      AV26cellrow = 1 ;
      AV27cellcol = 1 ;
      while ( AV27cellcol <= 5 )
      {
         AV10exceldocument.Cells((int)(AV26cellrow), (int)(AV27cellcol), 1, 1).setBold( (short)(1) );
         AV10exceldocument.Cells((int)(AV26cellrow), (int)(AV27cellcol), 1, 1).setColor( 11 );
         AV27cellcol = (long)(AV27cellcol+1) ;
      }
      AV47OmCod_txt = httpContext.getMessage( "Orden Inicial: ", "") + " " + GXutil.str( AV13OmCod, 8, 0) ;
      AV48OMCod_to_txt = httpContext.getMessage( "Orden Final: ", "") + " " + GXutil.str( AV14OmCod_to, 8, 0) ;
      AV10exceldocument.Cells(1, 1, 1, 1).setText( AV42EmprNom+" "+"("+AV54Pgmdesc+")" );
      AV10exceldocument.Cells(1, 2, 1, 1).setText( AV47OmCod_txt );
      AV10exceldocument.Cells(1, 3, 1, 1).setText( AV48OMCod_to_txt );
      AV10exceldocument.Cells(1, 4, 1, 1).setText( httpContext.getMessage( " Preventivos: ", "")+" "+AV45PreventivosTxt );
   }

   protected void cleanup( )
   {
      this.aP9[0] = listadotiempodedicadoordendetallado_wcexport.this.AV34Filename;
      this.aP10[0] = listadotiempodedicadoordendetallado_wcexport.this.AV35ErrorMessage;
      CloseOpenCursors();
      AV10exceldocument.cleanup();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV34Filename = "" ;
      AV35ErrorMessage = "" ;
      AV41Station = "" ;
      AV21EmprCod = "" ;
      AV42EmprNom = "" ;
      AV43UsurCod = "" ;
      AV10exceldocument = new com.genexus.gxoffice.ExcelDoc();
      AV29Omfchcer_to2 = GXutil.nullDate() ;
      AV32Ommaqcod_to2 = "" ;
      scmdbuf = "" ;
      P0A3V2_A396EmprCod = new String[] {""} ;
      P0A3V2_A9426OMMaqCod = new String[] {""} ;
      P0A3V2_A9429PMCod = new int[1] ;
      P0A3V2_n9429PMCod = new boolean[] {false} ;
      P0A3V2_A9439OMFchCer = new java.util.Date[] {GXutil.nullDate()} ;
      P0A3V2_A9425OMCod = new int[1] ;
      P0A3V2_A9445OMEst = new String[] {""} ;
      P0A3V2_A9427OMMaqDsc = new String[] {""} ;
      P0A3V2_n9427OMMaqDsc = new boolean[] {false} ;
      P0A3V2_A9436OMFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      P0A3V2_A9433OMTxt = new String[] {""} ;
      A396EmprCod = "" ;
      A9426OMMaqCod = "" ;
      A9439OMFchCer = GXutil.resetTime( GXutil.nullDate() );
      A9445OMEst = "" ;
      A9427OMMaqDsc = "" ;
      A9436OMFchCre = GXutil.resetTime( GXutil.nullDate() );
      A9433OMTxt = "" ;
      AV12OMMCTie = DecimalUtil.ZERO ;
      P0A3V3_A9425OMCod = new int[1] ;
      P0A3V3_A396EmprCod = new String[] {""} ;
      P0A3V3_A9447OMRepNom = new String[] {""} ;
      P0A3V3_n9447OMRepNom = new boolean[] {false} ;
      P0A3V3_A9452OMRCCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A3V3_A9453OMRCPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A3V3_A9495MRStkAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A3V3_n9495MRStkAct = new boolean[] {false} ;
      P0A3V3_A9446OMRepCod = new int[1] ;
      P0A3V3_A9449OMRTpo = new String[] {""} ;
      A9447OMRepNom = "" ;
      A9452OMRCCnt = DecimalUtil.ZERO ;
      A9453OMRCPre = DecimalUtil.ZERO ;
      A9495MRStkAct = DecimalUtil.ZERO ;
      A9449OMRTpo = "" ;
      P0A3V4_A9455OMOpeCod = new int[1] ;
      P0A3V4_A9468OMMCIni = new java.util.Date[] {GXutil.nullDate()} ;
      P0A3V4_A9469OMMCFin = new java.util.Date[] {GXutil.nullDate()} ;
      P0A3V4_A9425OMCod = new int[1] ;
      P0A3V4_A396EmprCod = new String[] {""} ;
      P0A3V4_A9458OMMTpo = new String[] {""} ;
      P0A3V4_A9466OMMCLin = new short[1] ;
      A9468OMMCIni = GXutil.resetTime( GXutil.nullDate() );
      A9469OMMCFin = GXutil.resetTime( GXutil.nullDate() );
      A9458OMMTpo = "" ;
      AV36hhmmalfa = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV45PreventivosTxt = "" ;
      AV47OmCod_txt = "" ;
      AV48OMCod_to_txt = "" ;
      AV54Pgmdesc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.listadotiempodedicadoordendetallado_wcexport__default(),
         new Object[] {
             new Object[] {
            P0A3V2_A396EmprCod, P0A3V2_A9426OMMaqCod, P0A3V2_A9429PMCod, P0A3V2_n9429PMCod, P0A3V2_A9439OMFchCer, P0A3V2_A9425OMCod, P0A3V2_A9445OMEst, P0A3V2_A9427OMMaqDsc, P0A3V2_n9427OMMaqDsc, P0A3V2_A9436OMFchCre,
            P0A3V2_A9433OMTxt
            }
            , new Object[] {
            P0A3V3_A9425OMCod, P0A3V3_A396EmprCod, P0A3V3_A9447OMRepNom, P0A3V3_n9447OMRepNom, P0A3V3_A9452OMRCCnt, P0A3V3_A9453OMRCPre, P0A3V3_A9495MRStkAct, P0A3V3_n9495MRStkAct, P0A3V3_A9446OMRepCod, P0A3V3_A9449OMRTpo
            }
            , new Object[] {
            P0A3V4_A9455OMOpeCod, P0A3V4_A9468OMMCIni, P0A3V4_A9469OMMCFin, P0A3V4_A9425OMCod, P0A3V4_A396EmprCod, P0A3V4_A9458OMMTpo, P0A3V4_A9466OMMCLin
            }
         }
      );
      AV54Pgmdesc = httpContext.getMessage( "Listado Tiempo Dedicado Orden Detallado", "") ;
      /* GeneXus formulas. */
      AV54Pgmdesc = httpContext.getMessage( "Listado Tiempo Dedicado Orden Detallado", "") ;
      Gx_err = (short)(0) ;
   }

   private byte AV20Preventivos ;
   private byte AV52GXLvl77 ;
   private short A9466OMMCLin ;
   private short AV37tiempo ;
   private short AV38HorRea ;
   private short AV39HorReaint ;
   private short AV40MinRea ;
   private short Gx_err ;
   private int AV13OmCod ;
   private int AV14OmCod_to ;
   private int AV17OmOpeCod ;
   private int AV16OmOpeCod_to ;
   private int AV33Random ;
   private int AV30Omopecod_to2 ;
   private int AV31Omcod_to2 ;
   private int A9429PMCod ;
   private int A9425OMCod ;
   private int AV44OMCodRead ;
   private int A9446OMRepCod ;
   private int A9455OMOpeCod ;
   private long AV26cellrow ;
   private long AV27cellcol ;
   private java.math.BigDecimal AV12OMMCTie ;
   private java.math.BigDecimal A9452OMRCCnt ;
   private java.math.BigDecimal A9453OMRCPre ;
   private java.math.BigDecimal A9495MRStkAct ;
   private String AV11Ommaqcod ;
   private String AV15OmMaqCod_to ;
   private String AV41Station ;
   private String AV21EmprCod ;
   private String AV42EmprNom ;
   private String AV43UsurCod ;
   private String AV32Ommaqcod_to2 ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A9426OMMaqCod ;
   private String A9445OMEst ;
   private String A9427OMMaqDsc ;
   private String A9447OMRepNom ;
   private String A9449OMRTpo ;
   private String A9458OMMTpo ;
   private String AV36hhmmalfa ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String AV45PreventivosTxt ;
   private String AV54Pgmdesc ;
   private java.util.Date A9439OMFchCer ;
   private java.util.Date A9436OMFchCre ;
   private java.util.Date A9468OMMCIni ;
   private java.util.Date A9469OMMCFin ;
   private java.util.Date AV18OMFchCer ;
   private java.util.Date AV19OMFchCer_to ;
   private java.util.Date AV29Omfchcer_to2 ;
   private boolean returnInSub ;
   private boolean n9429PMCod ;
   private boolean n9427OMMaqDsc ;
   private boolean n9447OMRepNom ;
   private boolean n9495MRStkAct ;
   private String AV34Filename ;
   private String AV35ErrorMessage ;
   private String A9433OMTxt ;
   private String AV47OmCod_txt ;
   private String AV48OMCod_to_txt ;
   private String[] aP10 ;
   private String[] aP9 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A3V2_A396EmprCod ;
   private String[] P0A3V2_A9426OMMaqCod ;
   private int[] P0A3V2_A9429PMCod ;
   private boolean[] P0A3V2_n9429PMCod ;
   private java.util.Date[] P0A3V2_A9439OMFchCer ;
   private int[] P0A3V2_A9425OMCod ;
   private String[] P0A3V2_A9445OMEst ;
   private String[] P0A3V2_A9427OMMaqDsc ;
   private boolean[] P0A3V2_n9427OMMaqDsc ;
   private java.util.Date[] P0A3V2_A9436OMFchCre ;
   private String[] P0A3V2_A9433OMTxt ;
   private int[] P0A3V3_A9425OMCod ;
   private String[] P0A3V3_A396EmprCod ;
   private String[] P0A3V3_A9447OMRepNom ;
   private boolean[] P0A3V3_n9447OMRepNom ;
   private java.math.BigDecimal[] P0A3V3_A9452OMRCCnt ;
   private java.math.BigDecimal[] P0A3V3_A9453OMRCPre ;
   private java.math.BigDecimal[] P0A3V3_A9495MRStkAct ;
   private boolean[] P0A3V3_n9495MRStkAct ;
   private int[] P0A3V3_A9446OMRepCod ;
   private String[] P0A3V3_A9449OMRTpo ;
   private int[] P0A3V4_A9455OMOpeCod ;
   private java.util.Date[] P0A3V4_A9468OMMCIni ;
   private java.util.Date[] P0A3V4_A9469OMMCFin ;
   private int[] P0A3V4_A9425OMCod ;
   private String[] P0A3V4_A396EmprCod ;
   private String[] P0A3V4_A9458OMMTpo ;
   private short[] P0A3V4_A9466OMMCLin ;
   private com.genexus.gxoffice.ExcelDoc AV10exceldocument ;
}

final  class listadotiempodedicadoordendetallado_wcexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A3V2", "SELECT T1.EmprCod, T1.OMMaqCod AS OMMaqCod, T1.PMCod, T1.OMFchCer, T1.OMCod, T1.OMEst, T2.MaqDsc AS OMMaqDsc, T1.OMFchCre, T1.OMTxt FROM (TXPMORDEN T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.OMMaqCod) WHERE (T1.EmprCod = ?) AND (T1.OMCod >= ?) AND (T1.OMCod <= ?) AND (T1.PMCod > 0 and ? = 1 or (? = 0)) AND (T1.OMMaqCod >= ?) AND (T1.OMMaqCod <= ?) ORDER BY T1.EmprCod, T1.OMEst, T1.OMFchCer ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A3V3", "SELECT T1.OMCod, T1.EmprCod, T2.MRNom AS OMRepNom, T1.OMRCCnt, T1.OMRCPre, T2.MRStkAct, T1.OMRepCod AS OMRepCod, T1.OMRTpo FROM (TXPMOrRep T1 INNER JOIN TXPMREPUE T2 ON T2.EmprCod = T1.EmprCod AND T2.MRCod = T1.OMRepCod) WHERE T1.EmprCod = ? and T1.OMCod = ? ORDER BY T1.EmprCod, T1.OMCod, T1.OMRepCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A3V4", "SELECT OMOpeCod, OMMCIni, OMMCFin, OMCod, EmprCod, OMMTpo, OMMCLin FROM TXPMOrMCo WHERE (OMOpeCod >= ?) AND (OMOpeCod <= ?) ORDER BY EmprCod, OMCod, OMOpeCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(4);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((String[]) buf[7])[0] = rslt.getString(7, 16);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(8);
               ((String[]) buf[10])[0] = rslt.getVarchar(9);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 100);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,3);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,3);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,3);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 1);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((short[]) buf[6])[0] = rslt.getShort(7);
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
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 6);
               stmt.setString(7, (String)parms[6], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

