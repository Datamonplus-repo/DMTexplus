package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class listadotiempodedicadoorden_wcexport extends GXProcedure
{
   public listadotiempodedicadoorden_wcexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( listadotiempodedicadoorden_wcexport.class ), "" );
   }

   public listadotiempodedicadoorden_wcexport( int remoteHandle ,
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
      listadotiempodedicadoorden_wcexport.this.aP10 = new String[] {""};
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
      listadotiempodedicadoorden_wcexport.this.AV13OmCod = aP0;
      listadotiempodedicadoorden_wcexport.this.AV14OmCod_to = aP1;
      listadotiempodedicadoorden_wcexport.this.AV11Ommaqcod = aP2;
      listadotiempodedicadoorden_wcexport.this.AV15OmMaqCod_to = aP3;
      listadotiempodedicadoorden_wcexport.this.AV17OmOpeCod = aP4;
      listadotiempodedicadoorden_wcexport.this.AV16OmOpeCod_to = aP5;
      listadotiempodedicadoorden_wcexport.this.AV18OMFchCer = aP6;
      listadotiempodedicadoorden_wcexport.this.AV19OMFchCer_to = aP7;
      listadotiempodedicadoorden_wcexport.this.AV20Preventivos = aP8;
      listadotiempodedicadoorden_wcexport.this.aP9 = aP9;
      listadotiempodedicadoorden_wcexport.this.aP10 = aP10;
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
      listadotiempodedicadoorden_wcexport.this.GXt_char1 = GXv_char2[0] ;
      AV41Station = GXt_char1 ;
      GXv_char2[0] = AV21EmprCod ;
      GXv_char3[0] = AV42EmprNom ;
      GXv_char4[0] = AV43UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV41Station, GXv_char2, GXv_char3, GXv_char4) ;
      listadotiempodedicadoorden_wcexport.this.AV21EmprCod = GXv_char2[0] ;
      listadotiempodedicadoorden_wcexport.this.AV42EmprNom = GXv_char3[0] ;
      listadotiempodedicadoorden_wcexport.this.AV43UsurCod = GXv_char4[0] ;
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
      AV34Filename = "ListadoTiempoDedicadoOrden-" + GXutil.trim( GXutil.str( AV33Random, 8, 0)) + ".xlsx" ;
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
      /* Using cursor P09JR2 */
      pr_default.execute(0, new Object[] {AV21EmprCod, Integer.valueOf(AV13OmCod), Integer.valueOf(AV31Omcod_to2), Byte.valueOf(AV20Preventivos), Byte.valueOf(AV20Preventivos), AV11Ommaqcod, AV32Ommaqcod_to2});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P09JR2_A396EmprCod[0] ;
         A9426OMMaqCod = P09JR2_A9426OMMaqCod[0] ;
         A9429PMCod = P09JR2_A9429PMCod[0] ;
         n9429PMCod = P09JR2_n9429PMCod[0] ;
         A9439OMFchCer = P09JR2_A9439OMFchCer[0] ;
         A9425OMCod = P09JR2_A9425OMCod[0] ;
         A9445OMEst = P09JR2_A9445OMEst[0] ;
         A9436OMFchCre = P09JR2_A9436OMFchCre[0] ;
         A9433OMTxt = P09JR2_A9433OMTxt[0] ;
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
                     returnInSub = true;
                     if (true) return;
                  }
                  AV10exceldocument.Cells((int)(AV26cellrow), 1, 1, 1).setNumber( A9425OMCod );
                  AV10exceldocument.Cells((int)(AV26cellrow), 2, 1, 1).setNumber( A9429PMCod );
                  AV10exceldocument.Cells((int)(AV26cellrow), 3, 1, 1).setText( A9426OMMaqCod );
                  AV10exceldocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                  AV10exceldocument.Cells((int)(AV26cellrow), 4, 1, 1).setDate( A9436OMFchCre );
                  AV10exceldocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                  AV10exceldocument.Cells((int)(AV26cellrow), 5, 1, 1).setDate( A9439OMFchCer );
                  AV10exceldocument.Cells((int)(AV26cellrow), 6, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV12OMMCTie)) );
                  AV10exceldocument.Cells((int)(AV26cellrow), 7, 1, 1).setText( AV36hhmmalfa );
                  AV10exceldocument.Cells((int)(AV26cellrow), 8, 1, 1).setText( A9433OMTxt );
                  AV51GXLvl78 = (byte)(0) ;
                  /* Using cursor P09JR3 */
                  pr_default.execute(1, new Object[] {AV21EmprCod, Integer.valueOf(AV44OMCodRead)});
                  while ( (pr_default.getStatus(1) != 101) )
                  {
                     A9425OMCod = P09JR3_A9425OMCod[0] ;
                     A396EmprCod = P09JR3_A396EmprCod[0] ;
                     A9456OMOpeNom = P09JR3_A9456OMOpeNom[0] ;
                     n9456OMOpeNom = P09JR3_n9456OMOpeNom[0] ;
                     A9468OMMCIni = P09JR3_A9468OMMCIni[0] ;
                     A9469OMMCFin = P09JR3_A9469OMMCFin[0] ;
                     A9455OMOpeCod = P09JR3_A9455OMOpeCod[0] ;
                     A9458OMMTpo = P09JR3_A9458OMMTpo[0] ;
                     A9466OMMCLin = P09JR3_A9466OMMCLin[0] ;
                     A9456OMOpeNom = P09JR3_A9456OMOpeNom[0] ;
                     n9456OMOpeNom = P09JR3_n9456OMOpeNom[0] ;
                     AV51GXLvl78 = (byte)(1) ;
                     AV10exceldocument.Cells((int)(AV26cellrow), 9, 1, 1).setNumber( A9455OMOpeCod );
                     AV10exceldocument.Cells((int)(AV26cellrow), 10, 1, 1).setText( A9456OMOpeNom );
                     AV10exceldocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                     AV10exceldocument.Cells((int)(AV26cellrow), 11, 1, 1).setDate( A9468OMMCIni );
                     AV10exceldocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                     AV10exceldocument.Cells((int)(AV26cellrow), 12, 1, 1).setDate( A9469OMMCFin );
                     AV10exceldocument.Cells((int)(AV26cellrow), 13, 1, 1).setNumber( AV37tiempo );
                     AV26cellrow = (long)(AV26cellrow+1) ;
                     pr_default.readNext(1);
                  }
                  pr_default.close(1);
                  if ( AV51GXLvl78 == 0 )
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
      AV10exceldocument.Cells(3, 3, 1, 1).setText( httpContext.getMessage( "Maquina", "") );
      AV10exceldocument.Cells(3, 4, 1, 1).setText( httpContext.getMessage( "Fecha alta", "") );
      AV10exceldocument.Cells(3, 5, 1, 1).setText( httpContext.getMessage( "Fecha Cierre", "") );
      AV10exceldocument.Cells(3, 6, 1, 1).setText( httpContext.getMessage( "Tiempo(m)", "") );
      AV10exceldocument.Cells(3, 7, 1, 1).setText( httpContext.getMessage( "Tiempo(hh:mm)", "") );
      AV10exceldocument.Cells(3, 8, 1, 1).setText( httpContext.getMessage( "Trabajo", "") );
      AV10exceldocument.Cells(3, 9, 1, 1).setText( httpContext.getMessage( "Operario", "") );
      AV10exceldocument.Cells(3, 10, 1, 1).setText( httpContext.getMessage( "Nombre", "") );
      AV10exceldocument.Cells(3, 11, 1, 1).setText( httpContext.getMessage( "Inicio", "") );
      AV10exceldocument.Cells(3, 12, 1, 1).setText( httpContext.getMessage( "Fin", "") );
      AV10exceldocument.Cells(3, 13, 1, 1).setText( httpContext.getMessage( "Tiempo", "") );
   }

   public void S152( )
   {
      /* 'OBTENER_TIEMPO' Routine */
      returnInSub = false ;
      /* Using cursor P09JR4 */
      pr_default.execute(2, new Object[] {Integer.valueOf(AV17OmOpeCod), Integer.valueOf(AV30Omopecod_to2)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A9455OMOpeCod = P09JR4_A9455OMOpeCod[0] ;
         A9468OMMCIni = P09JR4_A9468OMMCIni[0] ;
         A9469OMMCFin = P09JR4_A9469OMMCFin[0] ;
         A9425OMCod = P09JR4_A9425OMCod[0] ;
         A396EmprCod = P09JR4_A396EmprCod[0] ;
         A9458OMMTpo = P09JR4_A9458OMMTpo[0] ;
         A9466OMMCLin = P09JR4_A9466OMMCLin[0] ;
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
      listadotiempodedicadoorden_wcexport.this.GXt_char1 = GXv_char4[0] ;
      AV41Station = GXt_char1 ;
      GXv_char4[0] = AV21EmprCod ;
      GXv_char3[0] = AV42EmprNom ;
      GXv_char2[0] = AV43UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV41Station, GXv_char4, GXv_char3, GXv_char2) ;
      listadotiempodedicadoorden_wcexport.this.AV21EmprCod = GXv_char4[0] ;
      listadotiempodedicadoorden_wcexport.this.AV42EmprNom = GXv_char3[0] ;
      listadotiempodedicadoorden_wcexport.this.AV43UsurCod = GXv_char2[0] ;
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
      AV46OmCod_txt = httpContext.getMessage( "Orden Inicial: ", "") + " " + GXutil.str( AV13OmCod, 8, 0) ;
      AV47OmCod_to_txt = httpContext.getMessage( "Orden Final: ", "") + " " + GXutil.str( AV14OmCod_to, 8, 0) ;
      AV10exceldocument.Cells(1, 1, 1, 1).setText( AV42EmprNom+" "+"("+AV53Pgmdesc+")" );
      AV10exceldocument.Cells(1, 2, 1, 1).setText( AV46OmCod_txt );
      AV10exceldocument.Cells(1, 3, 1, 1).setText( AV47OmCod_to_txt );
      AV10exceldocument.Cells(1, 4, 1, 1).setText( httpContext.getMessage( " Preventivos: ", "")+" "+AV45PreventivosTxt );
   }

   protected void cleanup( )
   {
      this.aP9[0] = listadotiempodedicadoorden_wcexport.this.AV34Filename;
      this.aP10[0] = listadotiempodedicadoorden_wcexport.this.AV35ErrorMessage;
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
      P09JR2_A396EmprCod = new String[] {""} ;
      P09JR2_A9426OMMaqCod = new String[] {""} ;
      P09JR2_A9429PMCod = new int[1] ;
      P09JR2_n9429PMCod = new boolean[] {false} ;
      P09JR2_A9439OMFchCer = new java.util.Date[] {GXutil.nullDate()} ;
      P09JR2_A9425OMCod = new int[1] ;
      P09JR2_A9445OMEst = new String[] {""} ;
      P09JR2_A9436OMFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      P09JR2_A9433OMTxt = new String[] {""} ;
      A396EmprCod = "" ;
      A9426OMMaqCod = "" ;
      A9439OMFchCer = GXutil.resetTime( GXutil.nullDate() );
      A9445OMEst = "" ;
      A9436OMFchCre = GXutil.resetTime( GXutil.nullDate() );
      A9433OMTxt = "" ;
      AV12OMMCTie = DecimalUtil.ZERO ;
      AV36hhmmalfa = "" ;
      P09JR3_A9425OMCod = new int[1] ;
      P09JR3_A396EmprCod = new String[] {""} ;
      P09JR3_A9456OMOpeNom = new String[] {""} ;
      P09JR3_n9456OMOpeNom = new boolean[] {false} ;
      P09JR3_A9468OMMCIni = new java.util.Date[] {GXutil.nullDate()} ;
      P09JR3_A9469OMMCFin = new java.util.Date[] {GXutil.nullDate()} ;
      P09JR3_A9455OMOpeCod = new int[1] ;
      P09JR3_A9458OMMTpo = new String[] {""} ;
      P09JR3_A9466OMMCLin = new short[1] ;
      A9456OMOpeNom = "" ;
      A9468OMMCIni = GXutil.resetTime( GXutil.nullDate() );
      A9469OMMCFin = GXutil.resetTime( GXutil.nullDate() );
      A9458OMMTpo = "" ;
      P09JR4_A9455OMOpeCod = new int[1] ;
      P09JR4_A9468OMMCIni = new java.util.Date[] {GXutil.nullDate()} ;
      P09JR4_A9469OMMCFin = new java.util.Date[] {GXutil.nullDate()} ;
      P09JR4_A9425OMCod = new int[1] ;
      P09JR4_A396EmprCod = new String[] {""} ;
      P09JR4_A9458OMMTpo = new String[] {""} ;
      P09JR4_A9466OMMCLin = new short[1] ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV45PreventivosTxt = "" ;
      AV46OmCod_txt = "" ;
      AV47OmCod_to_txt = "" ;
      AV53Pgmdesc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.listadotiempodedicadoorden_wcexport__default(),
         new Object[] {
             new Object[] {
            P09JR2_A396EmprCod, P09JR2_A9426OMMaqCod, P09JR2_A9429PMCod, P09JR2_n9429PMCod, P09JR2_A9439OMFchCer, P09JR2_A9425OMCod, P09JR2_A9445OMEst, P09JR2_A9436OMFchCre, P09JR2_A9433OMTxt
            }
            , new Object[] {
            P09JR3_A9425OMCod, P09JR3_A396EmprCod, P09JR3_A9456OMOpeNom, P09JR3_n9456OMOpeNom, P09JR3_A9468OMMCIni, P09JR3_A9469OMMCFin, P09JR3_A9455OMOpeCod, P09JR3_A9458OMMTpo, P09JR3_A9466OMMCLin
            }
            , new Object[] {
            P09JR4_A9455OMOpeCod, P09JR4_A9468OMMCIni, P09JR4_A9469OMMCFin, P09JR4_A9425OMCod, P09JR4_A396EmprCod, P09JR4_A9458OMMTpo, P09JR4_A9466OMMCLin
            }
         }
      );
      AV53Pgmdesc = httpContext.getMessage( "Listado Tiempo Dedicado Orden", "") ;
      /* GeneXus formulas. */
      AV53Pgmdesc = httpContext.getMessage( "Listado Tiempo Dedicado Orden", "") ;
      Gx_err = (short)(0) ;
   }

   private byte AV20Preventivos ;
   private byte AV51GXLvl78 ;
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
   private int A9455OMOpeCod ;
   private long AV26cellrow ;
   private long AV27cellcol ;
   private java.math.BigDecimal AV12OMMCTie ;
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
   private String AV36hhmmalfa ;
   private String A9456OMOpeNom ;
   private String A9458OMMTpo ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String AV45PreventivosTxt ;
   private String AV53Pgmdesc ;
   private java.util.Date A9439OMFchCer ;
   private java.util.Date A9436OMFchCre ;
   private java.util.Date A9468OMMCIni ;
   private java.util.Date A9469OMMCFin ;
   private java.util.Date AV18OMFchCer ;
   private java.util.Date AV19OMFchCer_to ;
   private java.util.Date AV29Omfchcer_to2 ;
   private boolean returnInSub ;
   private boolean n9429PMCod ;
   private boolean n9456OMOpeNom ;
   private String AV34Filename ;
   private String AV35ErrorMessage ;
   private String A9433OMTxt ;
   private String AV46OmCod_txt ;
   private String AV47OmCod_to_txt ;
   private String[] aP10 ;
   private String[] aP9 ;
   private IDataStoreProvider pr_default ;
   private String[] P09JR2_A396EmprCod ;
   private String[] P09JR2_A9426OMMaqCod ;
   private int[] P09JR2_A9429PMCod ;
   private boolean[] P09JR2_n9429PMCod ;
   private java.util.Date[] P09JR2_A9439OMFchCer ;
   private int[] P09JR2_A9425OMCod ;
   private String[] P09JR2_A9445OMEst ;
   private java.util.Date[] P09JR2_A9436OMFchCre ;
   private String[] P09JR2_A9433OMTxt ;
   private int[] P09JR3_A9425OMCod ;
   private String[] P09JR3_A396EmprCod ;
   private String[] P09JR3_A9456OMOpeNom ;
   private boolean[] P09JR3_n9456OMOpeNom ;
   private java.util.Date[] P09JR3_A9468OMMCIni ;
   private java.util.Date[] P09JR3_A9469OMMCFin ;
   private int[] P09JR3_A9455OMOpeCod ;
   private String[] P09JR3_A9458OMMTpo ;
   private short[] P09JR3_A9466OMMCLin ;
   private int[] P09JR4_A9455OMOpeCod ;
   private java.util.Date[] P09JR4_A9468OMMCIni ;
   private java.util.Date[] P09JR4_A9469OMMCFin ;
   private int[] P09JR4_A9425OMCod ;
   private String[] P09JR4_A396EmprCod ;
   private String[] P09JR4_A9458OMMTpo ;
   private short[] P09JR4_A9466OMMCLin ;
   private com.genexus.gxoffice.ExcelDoc AV10exceldocument ;
}

final  class listadotiempodedicadoorden_wcexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09JR2", "SELECT EmprCod, OMMaqCod, PMCod, OMFchCer, OMCod, OMEst, OMFchCre, OMTxt FROM TXPMORDEN WHERE (EmprCod = ?) AND (OMCod >= ?) AND (OMCod <= ?) AND (PMCod > 0 and ? = 1 or (? = 0)) AND (OMMaqCod >= ?) AND (OMMaqCod <= ?) ORDER BY EmprCod, OMEst, OMFchCer ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09JR3", "SELECT T1.OMCod, T1.EmprCod, T2.OpeNom AS OMOpeNom, T1.OMMCIni, T1.OMMCFin, T1.OMOpeCod AS OMOpeCod, T1.OMMTpo, T1.OMMCLin FROM (TXPMOrMCo T1 INNER JOIN TXPOPERAR T2 ON T2.EmprCod = T1.EmprCod AND T2.OpeCod = T1.OMOpeCod) WHERE T1.EmprCod = ? and T1.OMCod = ? ORDER BY T1.EmprCod, T1.OMCod, T1.OMOpeCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09JR4", "SELECT OMOpeCod, OMMCIni, OMMCFin, OMCod, EmprCod, OMMTpo, OMMCLin FROM TXPMOrMCo WHERE (OMOpeCod >= ?) AND (OMOpeCod <= ?) ORDER BY EmprCod, OMCod, OMOpeCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(7);
               ((String[]) buf[8])[0] = rslt.getVarchar(8);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(4);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(5);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((short[]) buf[8])[0] = rslt.getShort(8);
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

