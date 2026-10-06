package app.mantenimientomaquina ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tmprevewwexport extends GXProcedure
{
   public tmprevewwexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmprevewwexport.class ), "" );
   }

   public tmprevewwexport( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      tmprevewwexport.this.aP1 = new String[] {""};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 )
   {
      tmprevewwexport.this.aP0 = aP0;
      tmprevewwexport.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_SdtWWPContext1[0] = AV9WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext1) ;
      AV9WWPContext = GXv_SdtWWPContext1[0] ;
      /* Execute user subroutine: 'OPENDOCUMENT' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV13CellRow = 1 ;
      AV14FirstColumn = 1 ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S201 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITEFILTERS' */
      S131 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITECOLUMNTITLES' */
      S141 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITEDATA' */
      S161 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'CLOSEDOCUMENT' */
      S191 ();
      if ( returnInSub )
      {
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'OPENDOCUMENT' Routine */
      returnInSub = false ;
      AV15Random = (int)(GXutil.random( )*10000) ;
      AV11Filename = "./PrivateTempStorage/" + "TMPreveWWExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
      AV10ExcelDocument.Open(AV11Filename);
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV10ExcelDocument.Clear();
   }

   public void S131( )
   {
      /* 'WRITEFILTERS' Routine */
      returnInSub = false ;
      GXv_exceldoc2[0] = AV10ExcelDocument ;
      GXv_int3[0] = (short)(AV13CellRow) ;
      new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Filter", "")) ;
      AV10ExcelDocument = GXv_exceldoc2[0] ;
      tmprevewwexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV18FilterFullText, GXv_char5) ;
      tmprevewwexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (0==AV34TFPMCod) && (0==AV35TFPMCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "# Ord. Prev.", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmprevewwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV34TFPMCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmprevewwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV35TFPMCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV37TFPMDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripción", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmprevewwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV37TFPMDsc_Sel, GXv_char5) ;
         tmprevewwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV36TFPMDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripción", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tmprevewwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV36TFPMDsc, GXv_char5) ;
            tmprevewwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV43TFPMMaqCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Maquina", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmprevewwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV43TFPMMaqCod_Sel, GXv_char5) ;
         tmprevewwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV42TFPMMaqCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Maquina", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tmprevewwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV42TFPMMaqCod, GXv_char5) ;
            tmprevewwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV45TFPMMaqDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmprevewwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV45TFPMMaqDsc_Sel, GXv_char5) ;
         tmprevewwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV44TFPMMaqDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tmprevewwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV44TFPMMaqDsc, GXv_char5) ;
            tmprevewwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( ( AV47TFPMEst_Sels.size() == 0 ) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Estado", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmprevewwexport.this.AV13CellRow = GXv_int3[0] ;
         AV69i = 1 ;
         AV81GXV1 = 1 ;
         while ( AV81GXV1 <= AV47TFPMEst_Sels.size() )
         {
            AV48TFPMEst_Sel = (String)AV47TFPMEst_Sels.elementAt(-1+AV81GXV1) ;
            if ( AV69i == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( "" );
            }
            else
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+", " );
            }
            if ( GXutil.strcmp(GXutil.trim( AV48TFPMEst_Sel), httpContext.getMessage( "A", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Activa", "") );
            }
            else if ( GXutil.strcmp(GXutil.trim( AV48TFPMEst_Sel), httpContext.getMessage( "I", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Inactiva", "") );
            }
            AV69i = (long)(AV69i+1) ;
            AV81GXV1 = (int)(AV81GXV1+1) ;
         }
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV38TFPMFchCre)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Creación", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmprevewwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV38TFPMFchCre );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV51TFPMIni)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Inicio", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmprevewwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV51TFPMIni );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV55TFPMUlt)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Última", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmprevewwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV55TFPMUlt );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV53TFPMFin)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fin", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmprevewwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV53TFPMFin );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( (GXutil.strcmp("", AV41TFPMUsuCre_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Usuario que crea el Preventivo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmprevewwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV41TFPMUsuCre_Sel, GXv_char5) ;
         tmprevewwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV40TFPMUsuCre)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Usuario que crea el Preventivo", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tmprevewwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV40TFPMUsuCre, GXv_char5) ;
            tmprevewwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV59TFPMDias) && (0==AV60TFPMDias_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Días", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmprevewwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV59TFPMDias );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmprevewwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV60TFPMDias_To );
      }
      if ( ! ( (0==AV71TFPMDiasPaviso) && (0==AV72TFPMDiasPaviso_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Días pre-aviso", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmprevewwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV71TFPMDiasPaviso );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmprevewwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV72TFPMDiasPaviso_To );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV57TFPMUso)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV58TFPMUso_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Uso Equipo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmprevewwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV57TFPMUso)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmprevewwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV58TFPMUso_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV67TFPMUsoMts)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV68TFPMUsoMts_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Uso Mts.", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmprevewwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV67TFPMUsoMts)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmprevewwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV68TFPMUsoMts_To)) );
      }
      if ( ! ( (GXutil.strcmp("", AV74TFPMTipoDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmprevewwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV74TFPMTipoDsc_Sel, GXv_char5) ;
         tmprevewwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV73TFPMTipoDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tmprevewwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV73TFPMTipoDsc, GXv_char5) ;
            tmprevewwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV61TFPMOrd) && (0==AV62TFPMOrd_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Orden Actual", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmprevewwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV61TFPMOrd );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmprevewwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV62TFPMOrd_To );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63TFPMTie)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64TFPMTie_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Tiempo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmprevewwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV63TFPMTie)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmprevewwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV64TFPMTie_To)) );
      }
      if ( ! ( (GXutil.strcmp("", AV66TFPMPla_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Planificar", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmprevewwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV66TFPMPla_Sel, GXv_char5) ;
         tmprevewwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV65TFPMPla)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Planificar", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tmprevewwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV65TFPMPla, GXv_char5) ;
            tmprevewwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV50TFPMTxt_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Texto del Preventivo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmprevewwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV50TFPMTxt_Sel, GXv_char5) ;
         tmprevewwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV49TFPMTxt)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Texto del Preventivo", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tmprevewwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV49TFPMTxt, GXv_char5) ;
            tmprevewwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV31VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV19Session.getValue("MantenimientoMaquina.TMPreveWWColumnsSelector"), "") != 0 )
      {
         AV26ColumnsSelectorXML = AV19Session.getValue("MantenimientoMaquina.TMPreveWWColumnsSelector") ;
         AV23ColumnsSelector.fromxml(AV26ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      AV82GXV2 = 1 ;
      while ( AV82GXV2 <= AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV25ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV82GXV2));
         if ( AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setColor( 11 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         AV82GXV2 = (int)(AV82GXV2+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV84Mantenimientomaquina_tmprevewwds_1_filterfulltext = AV18FilterFullText ;
      AV85Mantenimientomaquina_tmprevewwds_2_tfpmcod = AV34TFPMCod ;
      AV86Mantenimientomaquina_tmprevewwds_3_tfpmcod_to = AV35TFPMCod_To ;
      AV87Mantenimientomaquina_tmprevewwds_4_tfpmdsc = AV36TFPMDsc ;
      AV88Mantenimientomaquina_tmprevewwds_5_tfpmdsc_sel = AV37TFPMDsc_Sel ;
      AV89Mantenimientomaquina_tmprevewwds_6_tfpmmaqcod = AV42TFPMMaqCod ;
      AV90Mantenimientomaquina_tmprevewwds_7_tfpmmaqcod_sel = AV43TFPMMaqCod_Sel ;
      AV91Mantenimientomaquina_tmprevewwds_8_tfpmmaqdsc = AV44TFPMMaqDsc ;
      AV92Mantenimientomaquina_tmprevewwds_9_tfpmmaqdsc_sel = AV45TFPMMaqDsc_Sel ;
      AV93Mantenimientomaquina_tmprevewwds_10_tfpmest_sels = AV47TFPMEst_Sels ;
      AV94Mantenimientomaquina_tmprevewwds_11_tfpmfchcre = AV38TFPMFchCre ;
      AV95Mantenimientomaquina_tmprevewwds_12_tfpmini = AV51TFPMIni ;
      AV96Mantenimientomaquina_tmprevewwds_13_tfpmult = AV55TFPMUlt ;
      AV97Mantenimientomaquina_tmprevewwds_14_tfpmfin = AV53TFPMFin ;
      AV98Mantenimientomaquina_tmprevewwds_15_tfpmusucre = AV40TFPMUsuCre ;
      AV99Mantenimientomaquina_tmprevewwds_16_tfpmusucre_sel = AV41TFPMUsuCre_Sel ;
      AV100Mantenimientomaquina_tmprevewwds_17_tfpmdias = AV59TFPMDias ;
      AV101Mantenimientomaquina_tmprevewwds_18_tfpmdias_to = AV60TFPMDias_To ;
      AV102Mantenimientomaquina_tmprevewwds_19_tfpmdiaspaviso = AV71TFPMDiasPaviso ;
      AV103Mantenimientomaquina_tmprevewwds_20_tfpmdiaspaviso_to = AV72TFPMDiasPaviso_To ;
      AV104Mantenimientomaquina_tmprevewwds_21_tfpmuso = AV57TFPMUso ;
      AV105Mantenimientomaquina_tmprevewwds_22_tfpmuso_to = AV58TFPMUso_To ;
      AV106Mantenimientomaquina_tmprevewwds_23_tfpmusomts = AV67TFPMUsoMts ;
      AV107Mantenimientomaquina_tmprevewwds_24_tfpmusomts_to = AV68TFPMUsoMts_To ;
      AV108Mantenimientomaquina_tmprevewwds_25_tfpmtipodsc = AV73TFPMTipoDsc ;
      AV109Mantenimientomaquina_tmprevewwds_26_tfpmtipodsc_sel = AV74TFPMTipoDsc_Sel ;
      AV110Mantenimientomaquina_tmprevewwds_27_tfpmord = AV61TFPMOrd ;
      AV111Mantenimientomaquina_tmprevewwds_28_tfpmord_to = AV62TFPMOrd_To ;
      AV112Mantenimientomaquina_tmprevewwds_29_tfpmtie = AV63TFPMTie ;
      AV113Mantenimientomaquina_tmprevewwds_30_tfpmtie_to = AV64TFPMTie_To ;
      AV114Mantenimientomaquina_tmprevewwds_31_tfpmpla = AV65TFPMPla ;
      AV115Mantenimientomaquina_tmprevewwds_32_tfpmpla_sel = AV66TFPMPla_Sel ;
      AV116Mantenimientomaquina_tmprevewwds_33_tfpmtxt = AV49TFPMTxt ;
      AV117Mantenimientomaquina_tmprevewwds_34_tfpmtxt_sel = AV50TFPMTxt_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A9478PMEst ,
                                           AV93Mantenimientomaquina_tmprevewwds_10_tfpmest_sels ,
                                           Integer.valueOf(AV85Mantenimientomaquina_tmprevewwds_2_tfpmcod) ,
                                           Integer.valueOf(AV86Mantenimientomaquina_tmprevewwds_3_tfpmcod_to) ,
                                           AV88Mantenimientomaquina_tmprevewwds_5_tfpmdsc_sel ,
                                           AV87Mantenimientomaquina_tmprevewwds_4_tfpmdsc ,
                                           AV90Mantenimientomaquina_tmprevewwds_7_tfpmmaqcod_sel ,
                                           AV89Mantenimientomaquina_tmprevewwds_6_tfpmmaqcod ,
                                           AV92Mantenimientomaquina_tmprevewwds_9_tfpmmaqdsc_sel ,
                                           AV91Mantenimientomaquina_tmprevewwds_8_tfpmmaqdsc ,
                                           Integer.valueOf(AV93Mantenimientomaquina_tmprevewwds_10_tfpmest_sels.size()) ,
                                           AV94Mantenimientomaquina_tmprevewwds_11_tfpmfchcre ,
                                           AV95Mantenimientomaquina_tmprevewwds_12_tfpmini ,
                                           AV96Mantenimientomaquina_tmprevewwds_13_tfpmult ,
                                           AV97Mantenimientomaquina_tmprevewwds_14_tfpmfin ,
                                           AV99Mantenimientomaquina_tmprevewwds_16_tfpmusucre_sel ,
                                           AV98Mantenimientomaquina_tmprevewwds_15_tfpmusucre ,
                                           Short.valueOf(AV100Mantenimientomaquina_tmprevewwds_17_tfpmdias) ,
                                           Short.valueOf(AV101Mantenimientomaquina_tmprevewwds_18_tfpmdias_to) ,
                                           Short.valueOf(AV102Mantenimientomaquina_tmprevewwds_19_tfpmdiaspaviso) ,
                                           Short.valueOf(AV103Mantenimientomaquina_tmprevewwds_20_tfpmdiaspaviso_to) ,
                                           AV104Mantenimientomaquina_tmprevewwds_21_tfpmuso ,
                                           AV105Mantenimientomaquina_tmprevewwds_22_tfpmuso_to ,
                                           AV106Mantenimientomaquina_tmprevewwds_23_tfpmusomts ,
                                           AV107Mantenimientomaquina_tmprevewwds_24_tfpmusomts_to ,
                                           AV109Mantenimientomaquina_tmprevewwds_26_tfpmtipodsc_sel ,
                                           AV108Mantenimientomaquina_tmprevewwds_25_tfpmtipodsc ,
                                           Integer.valueOf(AV110Mantenimientomaquina_tmprevewwds_27_tfpmord) ,
                                           Integer.valueOf(AV111Mantenimientomaquina_tmprevewwds_28_tfpmord_to) ,
                                           AV112Mantenimientomaquina_tmprevewwds_29_tfpmtie ,
                                           AV113Mantenimientomaquina_tmprevewwds_30_tfpmtie_to ,
                                           AV115Mantenimientomaquina_tmprevewwds_32_tfpmpla_sel ,
                                           AV114Mantenimientomaquina_tmprevewwds_31_tfpmpla ,
                                           AV117Mantenimientomaquina_tmprevewwds_34_tfpmtxt_sel ,
                                           AV116Mantenimientomaquina_tmprevewwds_33_tfpmtxt ,
                                           Integer.valueOf(A9429PMCod) ,
                                           A9473PMDsc ,
                                           A9476PMMaqCod ,
                                           A9477PMMaqDsc ,
                                           A9474PMFchCre ,
                                           A9484PMIni ,
                                           A9486PMUlt ,
                                           A9485PMFin ,
                                           A9475PMUsuCre ,
                                           Short.valueOf(A9487PMDias) ,
                                           Short.valueOf(A14275PMDiasPavi) ,
                                           A11454PMUso ,
                                           A13013PMUsoMts ,
                                           A14272PMTipoDsc ,
                                           Integer.valueOf(A9488PMOrd) ,
                                           A11455PMTie ,
                                           A11456PMPla ,
                                           A9483PMTxt ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV84Mantenimientomaquina_tmprevewwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV87Mantenimientomaquina_tmprevewwds_4_tfpmdsc = GXutil.padr( GXutil.rtrim( AV87Mantenimientomaquina_tmprevewwds_4_tfpmdsc), 30, "%") ;
      lV89Mantenimientomaquina_tmprevewwds_6_tfpmmaqcod = GXutil.padr( GXutil.rtrim( AV89Mantenimientomaquina_tmprevewwds_6_tfpmmaqcod), 6, "%") ;
      lV91Mantenimientomaquina_tmprevewwds_8_tfpmmaqdsc = GXutil.padr( GXutil.rtrim( AV91Mantenimientomaquina_tmprevewwds_8_tfpmmaqdsc), 16, "%") ;
      lV98Mantenimientomaquina_tmprevewwds_15_tfpmusucre = GXutil.padr( GXutil.rtrim( AV98Mantenimientomaquina_tmprevewwds_15_tfpmusucre), 8, "%") ;
      lV108Mantenimientomaquina_tmprevewwds_25_tfpmtipodsc = GXutil.padr( GXutil.rtrim( AV108Mantenimientomaquina_tmprevewwds_25_tfpmtipodsc), 30, "%") ;
      lV114Mantenimientomaquina_tmprevewwds_31_tfpmpla = GXutil.padr( GXutil.rtrim( AV114Mantenimientomaquina_tmprevewwds_31_tfpmpla), 1, "%") ;
      lV116Mantenimientomaquina_tmprevewwds_33_tfpmtxt = GXutil.concat( GXutil.rtrim( AV116Mantenimientomaquina_tmprevewwds_33_tfpmtxt), "%", "") ;
      /* Using cursor P08JV2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV85Mantenimientomaquina_tmprevewwds_2_tfpmcod), Integer.valueOf(AV86Mantenimientomaquina_tmprevewwds_3_tfpmcod_to), lV87Mantenimientomaquina_tmprevewwds_4_tfpmdsc, AV88Mantenimientomaquina_tmprevewwds_5_tfpmdsc_sel, lV89Mantenimientomaquina_tmprevewwds_6_tfpmmaqcod, AV90Mantenimientomaquina_tmprevewwds_7_tfpmmaqcod_sel, lV91Mantenimientomaquina_tmprevewwds_8_tfpmmaqdsc, AV92Mantenimientomaquina_tmprevewwds_9_tfpmmaqdsc_sel, AV94Mantenimientomaquina_tmprevewwds_11_tfpmfchcre, AV95Mantenimientomaquina_tmprevewwds_12_tfpmini, AV96Mantenimientomaquina_tmprevewwds_13_tfpmult, AV97Mantenimientomaquina_tmprevewwds_14_tfpmfin, lV98Mantenimientomaquina_tmprevewwds_15_tfpmusucre, AV99Mantenimientomaquina_tmprevewwds_16_tfpmusucre_sel, Short.valueOf(AV100Mantenimientomaquina_tmprevewwds_17_tfpmdias), Short.valueOf(AV101Mantenimientomaquina_tmprevewwds_18_tfpmdias_to), Short.valueOf(AV102Mantenimientomaquina_tmprevewwds_19_tfpmdiaspaviso), Short.valueOf(AV103Mantenimientomaquina_tmprevewwds_20_tfpmdiaspaviso_to), AV104Mantenimientomaquina_tmprevewwds_21_tfpmuso, AV105Mantenimientomaquina_tmprevewwds_22_tfpmuso_to, AV106Mantenimientomaquina_tmprevewwds_23_tfpmusomts, AV107Mantenimientomaquina_tmprevewwds_24_tfpmusomts_to, lV108Mantenimientomaquina_tmprevewwds_25_tfpmtipodsc, AV109Mantenimientomaquina_tmprevewwds_26_tfpmtipodsc_sel, Integer.valueOf(AV110Mantenimientomaquina_tmprevewwds_27_tfpmord), Integer.valueOf(AV111Mantenimientomaquina_tmprevewwds_28_tfpmord_to), AV112Mantenimientomaquina_tmprevewwds_29_tfpmtie, AV113Mantenimientomaquina_tmprevewwds_30_tfpmtie_to, lV114Mantenimientomaquina_tmprevewwds_31_tfpmpla, AV115Mantenimientomaquina_tmprevewwds_32_tfpmpla_sel, lV116Mantenimientomaquina_tmprevewwds_33_tfpmtxt, AV117Mantenimientomaquina_tmprevewwds_34_tfpmtxt_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P08JV2_A396EmprCod[0] ;
         A14271PMTipoID = P08JV2_A14271PMTipoID[0] ;
         A9483PMTxt = P08JV2_A9483PMTxt[0] ;
         n9483PMTxt = P08JV2_n9483PMTxt[0] ;
         A11456PMPla = P08JV2_A11456PMPla[0] ;
         A11455PMTie = P08JV2_A11455PMTie[0] ;
         A9488PMOrd = P08JV2_A9488PMOrd[0] ;
         n9488PMOrd = P08JV2_n9488PMOrd[0] ;
         A14272PMTipoDsc = P08JV2_A14272PMTipoDsc[0] ;
         A13013PMUsoMts = P08JV2_A13013PMUsoMts[0] ;
         n13013PMUsoMts = P08JV2_n13013PMUsoMts[0] ;
         A11454PMUso = P08JV2_A11454PMUso[0] ;
         n11454PMUso = P08JV2_n11454PMUso[0] ;
         A14275PMDiasPavi = P08JV2_A14275PMDiasPavi[0] ;
         n14275PMDiasPavi = P08JV2_n14275PMDiasPavi[0] ;
         A9487PMDias = P08JV2_A9487PMDias[0] ;
         n9487PMDias = P08JV2_n9487PMDias[0] ;
         A9475PMUsuCre = P08JV2_A9475PMUsuCre[0] ;
         n9475PMUsuCre = P08JV2_n9475PMUsuCre[0] ;
         A9485PMFin = P08JV2_A9485PMFin[0] ;
         n9485PMFin = P08JV2_n9485PMFin[0] ;
         A9486PMUlt = P08JV2_A9486PMUlt[0] ;
         n9486PMUlt = P08JV2_n9486PMUlt[0] ;
         A9484PMIni = P08JV2_A9484PMIni[0] ;
         n9484PMIni = P08JV2_n9484PMIni[0] ;
         A9474PMFchCre = P08JV2_A9474PMFchCre[0] ;
         n9474PMFchCre = P08JV2_n9474PMFchCre[0] ;
         A9477PMMaqDsc = P08JV2_A9477PMMaqDsc[0] ;
         n9477PMMaqDsc = P08JV2_n9477PMMaqDsc[0] ;
         A9476PMMaqCod = P08JV2_A9476PMMaqCod[0] ;
         n9476PMMaqCod = P08JV2_n9476PMMaqCod[0] ;
         A9473PMDsc = P08JV2_A9473PMDsc[0] ;
         n9473PMDsc = P08JV2_n9473PMDsc[0] ;
         A9429PMCod = P08JV2_A9429PMCod[0] ;
         A9478PMEst = P08JV2_A9478PMEst[0] ;
         n9478PMEst = P08JV2_n9478PMEst[0] ;
         A14272PMTipoDsc = P08JV2_A14272PMTipoDsc[0] ;
         A9477PMMaqDsc = P08JV2_A9477PMMaqDsc[0] ;
         n9477PMMaqDsc = P08JV2_n9477PMMaqDsc[0] ;
         if ( (GXutil.strcmp("", AV84Mantenimientomaquina_tmprevewwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A9429PMCod, 8, 0) , GXutil.padr( "%" + AV84Mantenimientomaquina_tmprevewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9473PMDsc) , GXutil.padr( "%" + GXutil.upper( AV84Mantenimientomaquina_tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9476PMMaqCod) , GXutil.padr( "%" + GXutil.upper( AV84Mantenimientomaquina_tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9477PMMaqDsc) , GXutil.padr( "%" + GXutil.upper( AV84Mantenimientomaquina_tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "activa", ""), "") , GXutil.padr( "%" + GXutil.lower( AV84Mantenimientomaquina_tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9478PMEst, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "inactiva", ""), "") , GXutil.padr( "%" + GXutil.lower( AV84Mantenimientomaquina_tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9478PMEst, httpContext.getMessage( "I", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A9475PMUsuCre) , GXutil.padr( "%" + GXutil.upper( AV84Mantenimientomaquina_tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9487PMDias, 3, 0) , GXutil.padr( "%" + AV84Mantenimientomaquina_tmprevewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A14275PMDiasPavi, 4, 0) , GXutil.padr( "%" + AV84Mantenimientomaquina_tmprevewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A11454PMUso, 8, 2) , GXutil.padr( "%" + AV84Mantenimientomaquina_tmprevewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13013PMUsoMts, 10, 2) , GXutil.padr( "%" + AV84Mantenimientomaquina_tmprevewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14272PMTipoDsc) , GXutil.padr( "%" + GXutil.upper( AV84Mantenimientomaquina_tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9488PMOrd, 8, 0) , GXutil.padr( "%" + AV84Mantenimientomaquina_tmprevewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A11455PMTie, 6, 2) , GXutil.padr( "%" + AV84Mantenimientomaquina_tmprevewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A11456PMPla) , GXutil.padr( "%" + GXutil.upper( AV84Mantenimientomaquina_tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9483PMTxt) , GXutil.padr( "%" + GXutil.upper( AV84Mantenimientomaquina_tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV13CellRow = (int)(AV13CellRow+1) ;
            /* Execute user subroutine: 'BEFOREWRITELINE' */
            S172 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               returnInSub = true;
               if (true) return;
            }
            AV31VisibleColumnCount = 0 ;
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A9429PMCod );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A9473PMDsc, GXv_char5) ;
               tmprevewwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A9476PMMaqCod, GXv_char5) ;
               tmprevewwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A9477PMMaqDsc, GXv_char5) ;
               tmprevewwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( "" );
               if ( GXutil.strcmp(GXutil.trim( A9478PMEst), httpContext.getMessage( "A", "")) == 0 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Activa", "") );
               }
               else if ( GXutil.strcmp(GXutil.trim( A9478PMEst), httpContext.getMessage( "I", "")) == 0 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Inactiva", "") );
               }
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_dtime6 = GXutil.resetTime( A9474PMFchCre );
               AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_dtime6 = GXutil.resetTime( A9484PMIni );
               AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_dtime6 = GXutil.resetTime( A9486PMUlt );
               AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_dtime6 = GXutil.resetTime( A9485PMFin );
               AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A9475PMUsuCre, GXv_char5) ;
               tmprevewwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A9487PMDias );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A14275PMDiasPavi );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A11454PMUso)) );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A13013PMUsoMts)) );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14272PMTipoDsc, GXv_char5) ;
               tmprevewwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A9488PMOrd );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A11455PMTie)) );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A11456PMPla, GXv_char5) ;
               tmprevewwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A9483PMTxt, GXv_char5) ;
               tmprevewwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            /* Execute user subroutine: 'AFTERWRITELINE' */
            S182 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               returnInSub = true;
               if (true) return;
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S191( )
   {
      /* 'CLOSEDOCUMENT' Routine */
      returnInSub = false ;
      AV10ExcelDocument.Save();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV10ExcelDocument.Close();
   }

   public void S121( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV10ExcelDocument.getErrCode() != 0 )
      {
         AV11Filename = "" ;
         AV12ErrorMessage = AV10ExcelDocument.getErrDescription() ;
         AV10ExcelDocument.Close();
         returnInSub = true;
         if (true) return;
      }
   }

   public void S151( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV23ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&Sel", "", "Op.", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PMCod", "", "# Ord. Prev.", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PMDsc", "", "Descripción", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PMMaqCod", "", "Maquina", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PMMaqDsc", "", "Descripcion", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&MaqCod", "", "Sel. Máquina", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PMEst", "", "Estado", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PMFchCre", "Fecha", "Creación", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PMIni", "Fecha", "Inicio", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PMUlt", "Fecha", "Última", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PMFin", "", "Fin", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PMUsuCre", "", "Usuario que crea el Preventivo", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PMDias", "", "Días", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PMDiasPaviso", "", "Días pre-aviso", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PMUso", "", "Uso Equipo", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&Horas", "", "Horas", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PMUsoMts", "", "Uso Mts.", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&PMUsoMts", "", "Mts. hasta Fecha Ult.", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&CrearOrden", "", "Crear Orden", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PMTipoDsc", "", "Descripcion", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PMOrd", "", "Orden Actual", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PMTie", "", "Tiempo", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PMPla", "", "Planificar", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PMTxt", "", "Texto del Preventivo", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXt_char4 = AV27UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "MantenimientoMaquina.TMPreveWWColumnsSelector", GXv_char5) ;
      tmprevewwexport.this.GXt_char4 = GXv_char5[0] ;
      AV27UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV27UserCustomValue)==0) ) )
      {
         AV24ColumnsSelectorAux.fromxml(AV27UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector7[0] = AV24ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector8[0] = AV23ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, GXv_SdtWWPColumnsSelector8) ;
         AV24ColumnsSelectorAux = GXv_SdtWWPColumnsSelector7[0] ;
         AV23ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("MantenimientoMaquina.TMPreveWWGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "MantenimientoMaquina.TMPreveWWGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("MantenimientoMaquina.TMPreveWWGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV118GXV3 = 1 ;
      while ( AV118GXV3 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV118GXV3));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV18FilterFullText = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMCOD") == 0 )
         {
            AV34TFPMCod = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV35TFPMCod_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDSC") == 0 )
         {
            AV36TFPMDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDSC_SEL") == 0 )
         {
            AV37TFPMDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMMAQCOD") == 0 )
         {
            AV42TFPMMaqCod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMMAQCOD_SEL") == 0 )
         {
            AV43TFPMMaqCod_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMMAQDSC") == 0 )
         {
            AV44TFPMMaqDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMMAQDSC_SEL") == 0 )
         {
            AV45TFPMMaqDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMEST_SEL") == 0 )
         {
            AV46TFPMEst_SelsJson = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV47TFPMEst_Sels.fromJSonString(AV46TFPMEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMFCHCRE") == 0 )
         {
            AV38TFPMFchCre = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMINI") == 0 )
         {
            AV51TFPMIni = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMULT") == 0 )
         {
            AV55TFPMUlt = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMFIN") == 0 )
         {
            AV53TFPMFin = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMUSUCRE") == 0 )
         {
            AV40TFPMUsuCre = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMUSUCRE_SEL") == 0 )
         {
            AV41TFPMUsuCre_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDIAS") == 0 )
         {
            AV59TFPMDias = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV60TFPMDias_To = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDIASPAVISO") == 0 )
         {
            AV71TFPMDiasPaviso = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV72TFPMDiasPaviso_To = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMUSO") == 0 )
         {
            AV57TFPMUso = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV58TFPMUso_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMUSOMTS") == 0 )
         {
            AV67TFPMUsoMts = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV68TFPMUsoMts_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMTIPODSC") == 0 )
         {
            AV73TFPMTipoDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMTIPODSC_SEL") == 0 )
         {
            AV74TFPMTipoDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMORD") == 0 )
         {
            AV61TFPMOrd = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV62TFPMOrd_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMTIE") == 0 )
         {
            AV63TFPMTie = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV64TFPMTie_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMPLA") == 0 )
         {
            AV65TFPMPla = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMPLA_SEL") == 0 )
         {
            AV66TFPMPla_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMTXT") == 0 )
         {
            AV49TFPMTxt = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMTXT_SEL") == 0 )
         {
            AV50TFPMTxt_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV118GXV3 = (int)(AV118GXV3+1) ;
      }
   }

   public void S172( )
   {
      /* 'BEFOREWRITELINE' Routine */
      returnInSub = false ;
   }

   public void S182( )
   {
      /* 'AFTERWRITELINE' Routine */
      returnInSub = false ;
   }

   protected void cleanup( )
   {
      this.aP0[0] = tmprevewwexport.this.AV11Filename;
      this.aP1[0] = tmprevewwexport.this.AV12ErrorMessage;
      CloseOpenCursors();
      AV10ExcelDocument.cleanup();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV11Filename = "" ;
      AV12ErrorMessage = "" ;
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV10ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      AV18FilterFullText = "" ;
      AV37TFPMDsc_Sel = "" ;
      AV36TFPMDsc = "" ;
      AV43TFPMMaqCod_Sel = "" ;
      AV42TFPMMaqCod = "" ;
      AV45TFPMMaqDsc_Sel = "" ;
      AV44TFPMMaqDsc = "" ;
      AV47TFPMEst_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV48TFPMEst_Sel = "" ;
      AV38TFPMFchCre = GXutil.nullDate() ;
      AV51TFPMIni = GXutil.nullDate() ;
      AV55TFPMUlt = GXutil.nullDate() ;
      AV53TFPMFin = GXutil.nullDate() ;
      AV41TFPMUsuCre_Sel = "" ;
      AV40TFPMUsuCre = "" ;
      AV57TFPMUso = DecimalUtil.ZERO ;
      AV58TFPMUso_To = DecimalUtil.ZERO ;
      AV67TFPMUsoMts = DecimalUtil.ZERO ;
      AV68TFPMUsoMts_To = DecimalUtil.ZERO ;
      AV74TFPMTipoDsc_Sel = "" ;
      AV73TFPMTipoDsc = "" ;
      AV63TFPMTie = DecimalUtil.ZERO ;
      AV64TFPMTie_To = DecimalUtil.ZERO ;
      AV66TFPMPla_Sel = "" ;
      AV65TFPMPla = "" ;
      AV50TFPMTxt_Sel = "" ;
      AV49TFPMTxt = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV19Session = httpContext.getWebSession();
      AV26ColumnsSelectorXML = "" ;
      AV23ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV25ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A9473PMDsc = "" ;
      A9476PMMaqCod = "" ;
      A9477PMMaqDsc = "" ;
      A9478PMEst = "" ;
      A9474PMFchCre = GXutil.nullDate() ;
      A9484PMIni = GXutil.nullDate() ;
      A9486PMUlt = GXutil.nullDate() ;
      A9485PMFin = GXutil.nullDate() ;
      A9475PMUsuCre = "" ;
      A11454PMUso = DecimalUtil.ZERO ;
      A13013PMUsoMts = DecimalUtil.ZERO ;
      A14272PMTipoDsc = "" ;
      A11455PMTie = DecimalUtil.ZERO ;
      A11456PMPla = "" ;
      A9483PMTxt = "" ;
      AV84Mantenimientomaquina_tmprevewwds_1_filterfulltext = "" ;
      AV87Mantenimientomaquina_tmprevewwds_4_tfpmdsc = "" ;
      AV88Mantenimientomaquina_tmprevewwds_5_tfpmdsc_sel = "" ;
      AV89Mantenimientomaquina_tmprevewwds_6_tfpmmaqcod = "" ;
      AV90Mantenimientomaquina_tmprevewwds_7_tfpmmaqcod_sel = "" ;
      AV91Mantenimientomaquina_tmprevewwds_8_tfpmmaqdsc = "" ;
      AV92Mantenimientomaquina_tmprevewwds_9_tfpmmaqdsc_sel = "" ;
      AV93Mantenimientomaquina_tmprevewwds_10_tfpmest_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV94Mantenimientomaquina_tmprevewwds_11_tfpmfchcre = GXutil.nullDate() ;
      AV95Mantenimientomaquina_tmprevewwds_12_tfpmini = GXutil.nullDate() ;
      AV96Mantenimientomaquina_tmprevewwds_13_tfpmult = GXutil.nullDate() ;
      AV97Mantenimientomaquina_tmprevewwds_14_tfpmfin = GXutil.nullDate() ;
      AV98Mantenimientomaquina_tmprevewwds_15_tfpmusucre = "" ;
      AV99Mantenimientomaquina_tmprevewwds_16_tfpmusucre_sel = "" ;
      AV104Mantenimientomaquina_tmprevewwds_21_tfpmuso = DecimalUtil.ZERO ;
      AV105Mantenimientomaquina_tmprevewwds_22_tfpmuso_to = DecimalUtil.ZERO ;
      AV106Mantenimientomaquina_tmprevewwds_23_tfpmusomts = DecimalUtil.ZERO ;
      AV107Mantenimientomaquina_tmprevewwds_24_tfpmusomts_to = DecimalUtil.ZERO ;
      AV108Mantenimientomaquina_tmprevewwds_25_tfpmtipodsc = "" ;
      AV109Mantenimientomaquina_tmprevewwds_26_tfpmtipodsc_sel = "" ;
      AV112Mantenimientomaquina_tmprevewwds_29_tfpmtie = DecimalUtil.ZERO ;
      AV113Mantenimientomaquina_tmprevewwds_30_tfpmtie_to = DecimalUtil.ZERO ;
      AV114Mantenimientomaquina_tmprevewwds_31_tfpmpla = "" ;
      AV115Mantenimientomaquina_tmprevewwds_32_tfpmpla_sel = "" ;
      AV116Mantenimientomaquina_tmprevewwds_33_tfpmtxt = "" ;
      AV117Mantenimientomaquina_tmprevewwds_34_tfpmtxt_sel = "" ;
      lV84Mantenimientomaquina_tmprevewwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV87Mantenimientomaquina_tmprevewwds_4_tfpmdsc = "" ;
      lV89Mantenimientomaquina_tmprevewwds_6_tfpmmaqcod = "" ;
      lV91Mantenimientomaquina_tmprevewwds_8_tfpmmaqdsc = "" ;
      lV98Mantenimientomaquina_tmprevewwds_15_tfpmusucre = "" ;
      lV108Mantenimientomaquina_tmprevewwds_25_tfpmtipodsc = "" ;
      lV114Mantenimientomaquina_tmprevewwds_31_tfpmpla = "" ;
      lV116Mantenimientomaquina_tmprevewwds_33_tfpmtxt = "" ;
      P08JV2_A396EmprCod = new String[] {""} ;
      P08JV2_A14271PMTipoID = new short[1] ;
      P08JV2_A9483PMTxt = new String[] {""} ;
      P08JV2_n9483PMTxt = new boolean[] {false} ;
      P08JV2_A11456PMPla = new String[] {""} ;
      P08JV2_A11455PMTie = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08JV2_A9488PMOrd = new int[1] ;
      P08JV2_n9488PMOrd = new boolean[] {false} ;
      P08JV2_A14272PMTipoDsc = new String[] {""} ;
      P08JV2_A13013PMUsoMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08JV2_n13013PMUsoMts = new boolean[] {false} ;
      P08JV2_A11454PMUso = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08JV2_n11454PMUso = new boolean[] {false} ;
      P08JV2_A14275PMDiasPavi = new short[1] ;
      P08JV2_n14275PMDiasPavi = new boolean[] {false} ;
      P08JV2_A9487PMDias = new short[1] ;
      P08JV2_n9487PMDias = new boolean[] {false} ;
      P08JV2_A9475PMUsuCre = new String[] {""} ;
      P08JV2_n9475PMUsuCre = new boolean[] {false} ;
      P08JV2_A9485PMFin = new java.util.Date[] {GXutil.nullDate()} ;
      P08JV2_n9485PMFin = new boolean[] {false} ;
      P08JV2_A9486PMUlt = new java.util.Date[] {GXutil.nullDate()} ;
      P08JV2_n9486PMUlt = new boolean[] {false} ;
      P08JV2_A9484PMIni = new java.util.Date[] {GXutil.nullDate()} ;
      P08JV2_n9484PMIni = new boolean[] {false} ;
      P08JV2_A9474PMFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      P08JV2_n9474PMFchCre = new boolean[] {false} ;
      P08JV2_A9477PMMaqDsc = new String[] {""} ;
      P08JV2_n9477PMMaqDsc = new boolean[] {false} ;
      P08JV2_A9476PMMaqCod = new String[] {""} ;
      P08JV2_n9476PMMaqCod = new boolean[] {false} ;
      P08JV2_A9473PMDsc = new String[] {""} ;
      P08JV2_n9473PMDsc = new boolean[] {false} ;
      P08JV2_A9429PMCod = new int[1] ;
      P08JV2_A9478PMEst = new String[] {""} ;
      P08JV2_n9478PMEst = new boolean[] {false} ;
      A396EmprCod = "" ;
      GXt_dtime6 = GXutil.resetTime( GXutil.nullDate() );
      AV27UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV24ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV46TFPMEst_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.tmprevewwexport__default(),
         new Object[] {
             new Object[] {
            P08JV2_A396EmprCod, P08JV2_A14271PMTipoID, P08JV2_A9483PMTxt, P08JV2_n9483PMTxt, P08JV2_A11456PMPla, P08JV2_A11455PMTie, P08JV2_A9488PMOrd, P08JV2_n9488PMOrd, P08JV2_A14272PMTipoDsc, P08JV2_A13013PMUsoMts,
            P08JV2_n13013PMUsoMts, P08JV2_A11454PMUso, P08JV2_n11454PMUso, P08JV2_A14275PMDiasPavi, P08JV2_n14275PMDiasPavi, P08JV2_A9487PMDias, P08JV2_n9487PMDias, P08JV2_A9475PMUsuCre, P08JV2_n9475PMUsuCre, P08JV2_A9485PMFin,
            P08JV2_n9485PMFin, P08JV2_A9486PMUlt, P08JV2_n9486PMUlt, P08JV2_A9484PMIni, P08JV2_n9484PMIni, P08JV2_A9474PMFchCre, P08JV2_n9474PMFchCre, P08JV2_A9477PMMaqDsc, P08JV2_n9477PMMaqDsc, P08JV2_A9476PMMaqCod,
            P08JV2_n9476PMMaqCod, P08JV2_A9473PMDsc, P08JV2_n9473PMDsc, P08JV2_A9429PMCod, P08JV2_A9478PMEst, P08JV2_n9478PMEst
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV59TFPMDias ;
   private short AV60TFPMDias_To ;
   private short AV71TFPMDiasPaviso ;
   private short AV72TFPMDiasPaviso_To ;
   private short GXv_int3[] ;
   private short A9487PMDias ;
   private short A14275PMDiasPavi ;
   private short AV100Mantenimientomaquina_tmprevewwds_17_tfpmdias ;
   private short AV101Mantenimientomaquina_tmprevewwds_18_tfpmdias_to ;
   private short AV102Mantenimientomaquina_tmprevewwds_19_tfpmdiaspaviso ;
   private short AV103Mantenimientomaquina_tmprevewwds_20_tfpmdiaspaviso_to ;
   private short AV16OrderedBy ;
   private short A14271PMTipoID ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV34TFPMCod ;
   private int AV35TFPMCod_To ;
   private int AV81GXV1 ;
   private int AV61TFPMOrd ;
   private int AV62TFPMOrd_To ;
   private int AV82GXV2 ;
   private int A9429PMCod ;
   private int A9488PMOrd ;
   private int AV85Mantenimientomaquina_tmprevewwds_2_tfpmcod ;
   private int AV86Mantenimientomaquina_tmprevewwds_3_tfpmcod_to ;
   private int AV110Mantenimientomaquina_tmprevewwds_27_tfpmord ;
   private int AV111Mantenimientomaquina_tmprevewwds_28_tfpmord_to ;
   private int AV93Mantenimientomaquina_tmprevewwds_10_tfpmest_sels_size ;
   private int AV118GXV3 ;
   private long AV69i ;
   private long AV31VisibleColumnCount ;
   private java.math.BigDecimal AV57TFPMUso ;
   private java.math.BigDecimal AV58TFPMUso_To ;
   private java.math.BigDecimal AV67TFPMUsoMts ;
   private java.math.BigDecimal AV68TFPMUsoMts_To ;
   private java.math.BigDecimal AV63TFPMTie ;
   private java.math.BigDecimal AV64TFPMTie_To ;
   private java.math.BigDecimal A11454PMUso ;
   private java.math.BigDecimal A13013PMUsoMts ;
   private java.math.BigDecimal A11455PMTie ;
   private java.math.BigDecimal AV104Mantenimientomaquina_tmprevewwds_21_tfpmuso ;
   private java.math.BigDecimal AV105Mantenimientomaquina_tmprevewwds_22_tfpmuso_to ;
   private java.math.BigDecimal AV106Mantenimientomaquina_tmprevewwds_23_tfpmusomts ;
   private java.math.BigDecimal AV107Mantenimientomaquina_tmprevewwds_24_tfpmusomts_to ;
   private java.math.BigDecimal AV112Mantenimientomaquina_tmprevewwds_29_tfpmtie ;
   private java.math.BigDecimal AV113Mantenimientomaquina_tmprevewwds_30_tfpmtie_to ;
   private String AV37TFPMDsc_Sel ;
   private String AV36TFPMDsc ;
   private String AV43TFPMMaqCod_Sel ;
   private String AV42TFPMMaqCod ;
   private String AV45TFPMMaqDsc_Sel ;
   private String AV44TFPMMaqDsc ;
   private String AV48TFPMEst_Sel ;
   private String AV41TFPMUsuCre_Sel ;
   private String AV40TFPMUsuCre ;
   private String AV74TFPMTipoDsc_Sel ;
   private String AV73TFPMTipoDsc ;
   private String AV66TFPMPla_Sel ;
   private String AV65TFPMPla ;
   private String A9473PMDsc ;
   private String A9476PMMaqCod ;
   private String A9477PMMaqDsc ;
   private String A9478PMEst ;
   private String A9475PMUsuCre ;
   private String A14272PMTipoDsc ;
   private String A11456PMPla ;
   private String AV87Mantenimientomaquina_tmprevewwds_4_tfpmdsc ;
   private String AV88Mantenimientomaquina_tmprevewwds_5_tfpmdsc_sel ;
   private String AV89Mantenimientomaquina_tmprevewwds_6_tfpmmaqcod ;
   private String AV90Mantenimientomaquina_tmprevewwds_7_tfpmmaqcod_sel ;
   private String AV91Mantenimientomaquina_tmprevewwds_8_tfpmmaqdsc ;
   private String AV92Mantenimientomaquina_tmprevewwds_9_tfpmmaqdsc_sel ;
   private String AV98Mantenimientomaquina_tmprevewwds_15_tfpmusucre ;
   private String AV99Mantenimientomaquina_tmprevewwds_16_tfpmusucre_sel ;
   private String AV108Mantenimientomaquina_tmprevewwds_25_tfpmtipodsc ;
   private String AV109Mantenimientomaquina_tmprevewwds_26_tfpmtipodsc_sel ;
   private String AV114Mantenimientomaquina_tmprevewwds_31_tfpmpla ;
   private String AV115Mantenimientomaquina_tmprevewwds_32_tfpmpla_sel ;
   private String scmdbuf ;
   private String lV87Mantenimientomaquina_tmprevewwds_4_tfpmdsc ;
   private String lV89Mantenimientomaquina_tmprevewwds_6_tfpmmaqcod ;
   private String lV91Mantenimientomaquina_tmprevewwds_8_tfpmmaqdsc ;
   private String lV98Mantenimientomaquina_tmprevewwds_15_tfpmusucre ;
   private String lV108Mantenimientomaquina_tmprevewwds_25_tfpmtipodsc ;
   private String lV114Mantenimientomaquina_tmprevewwds_31_tfpmpla ;
   private String A396EmprCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date GXt_dtime6 ;
   private java.util.Date AV38TFPMFchCre ;
   private java.util.Date AV51TFPMIni ;
   private java.util.Date AV55TFPMUlt ;
   private java.util.Date AV53TFPMFin ;
   private java.util.Date A9474PMFchCre ;
   private java.util.Date A9484PMIni ;
   private java.util.Date A9486PMUlt ;
   private java.util.Date A9485PMFin ;
   private java.util.Date AV94Mantenimientomaquina_tmprevewwds_11_tfpmfchcre ;
   private java.util.Date AV95Mantenimientomaquina_tmprevewwds_12_tfpmini ;
   private java.util.Date AV96Mantenimientomaquina_tmprevewwds_13_tfpmult ;
   private java.util.Date AV97Mantenimientomaquina_tmprevewwds_14_tfpmfin ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n9483PMTxt ;
   private boolean n9488PMOrd ;
   private boolean n13013PMUsoMts ;
   private boolean n11454PMUso ;
   private boolean n14275PMDiasPavi ;
   private boolean n9487PMDias ;
   private boolean n9475PMUsuCre ;
   private boolean n9485PMFin ;
   private boolean n9486PMUlt ;
   private boolean n9484PMIni ;
   private boolean n9474PMFchCre ;
   private boolean n9477PMMaqDsc ;
   private boolean n9476PMMaqCod ;
   private boolean n9473PMDsc ;
   private boolean n9478PMEst ;
   private String AV26ColumnsSelectorXML ;
   private String AV27UserCustomValue ;
   private String AV46TFPMEst_SelsJson ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV18FilterFullText ;
   private String AV50TFPMTxt_Sel ;
   private String AV49TFPMTxt ;
   private String A9483PMTxt ;
   private String AV84Mantenimientomaquina_tmprevewwds_1_filterfulltext ;
   private String AV116Mantenimientomaquina_tmprevewwds_33_tfpmtxt ;
   private String AV117Mantenimientomaquina_tmprevewwds_34_tfpmtxt_sel ;
   private String lV84Mantenimientomaquina_tmprevewwds_1_filterfulltext ;
   private String lV116Mantenimientomaquina_tmprevewwds_33_tfpmtxt ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private GXSimpleCollection<String> AV47TFPMEst_Sels ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P08JV2_A396EmprCod ;
   private short[] P08JV2_A14271PMTipoID ;
   private String[] P08JV2_A9483PMTxt ;
   private boolean[] P08JV2_n9483PMTxt ;
   private String[] P08JV2_A11456PMPla ;
   private java.math.BigDecimal[] P08JV2_A11455PMTie ;
   private int[] P08JV2_A9488PMOrd ;
   private boolean[] P08JV2_n9488PMOrd ;
   private String[] P08JV2_A14272PMTipoDsc ;
   private java.math.BigDecimal[] P08JV2_A13013PMUsoMts ;
   private boolean[] P08JV2_n13013PMUsoMts ;
   private java.math.BigDecimal[] P08JV2_A11454PMUso ;
   private boolean[] P08JV2_n11454PMUso ;
   private short[] P08JV2_A14275PMDiasPavi ;
   private boolean[] P08JV2_n14275PMDiasPavi ;
   private short[] P08JV2_A9487PMDias ;
   private boolean[] P08JV2_n9487PMDias ;
   private String[] P08JV2_A9475PMUsuCre ;
   private boolean[] P08JV2_n9475PMUsuCre ;
   private java.util.Date[] P08JV2_A9485PMFin ;
   private boolean[] P08JV2_n9485PMFin ;
   private java.util.Date[] P08JV2_A9486PMUlt ;
   private boolean[] P08JV2_n9486PMUlt ;
   private java.util.Date[] P08JV2_A9484PMIni ;
   private boolean[] P08JV2_n9484PMIni ;
   private java.util.Date[] P08JV2_A9474PMFchCre ;
   private boolean[] P08JV2_n9474PMFchCre ;
   private String[] P08JV2_A9477PMMaqDsc ;
   private boolean[] P08JV2_n9477PMMaqDsc ;
   private String[] P08JV2_A9476PMMaqCod ;
   private boolean[] P08JV2_n9476PMMaqCod ;
   private String[] P08JV2_A9473PMDsc ;
   private boolean[] P08JV2_n9473PMDsc ;
   private int[] P08JV2_A9429PMCod ;
   private String[] P08JV2_A9478PMEst ;
   private boolean[] P08JV2_n9478PMEst ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private GXSimpleCollection<String> AV93Mantenimientomaquina_tmprevewwds_10_tfpmest_sels ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV21GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV22GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV23ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV24ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV25ColumnsSelector_Column ;
}

final  class tmprevewwexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08JV2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A9478PMEst ,
                                          GXSimpleCollection<String> AV93Mantenimientomaquina_tmprevewwds_10_tfpmest_sels ,
                                          int AV85Mantenimientomaquina_tmprevewwds_2_tfpmcod ,
                                          int AV86Mantenimientomaquina_tmprevewwds_3_tfpmcod_to ,
                                          String AV88Mantenimientomaquina_tmprevewwds_5_tfpmdsc_sel ,
                                          String AV87Mantenimientomaquina_tmprevewwds_4_tfpmdsc ,
                                          String AV90Mantenimientomaquina_tmprevewwds_7_tfpmmaqcod_sel ,
                                          String AV89Mantenimientomaquina_tmprevewwds_6_tfpmmaqcod ,
                                          String AV92Mantenimientomaquina_tmprevewwds_9_tfpmmaqdsc_sel ,
                                          String AV91Mantenimientomaquina_tmprevewwds_8_tfpmmaqdsc ,
                                          int AV93Mantenimientomaquina_tmprevewwds_10_tfpmest_sels_size ,
                                          java.util.Date AV94Mantenimientomaquina_tmprevewwds_11_tfpmfchcre ,
                                          java.util.Date AV95Mantenimientomaquina_tmprevewwds_12_tfpmini ,
                                          java.util.Date AV96Mantenimientomaquina_tmprevewwds_13_tfpmult ,
                                          java.util.Date AV97Mantenimientomaquina_tmprevewwds_14_tfpmfin ,
                                          String AV99Mantenimientomaquina_tmprevewwds_16_tfpmusucre_sel ,
                                          String AV98Mantenimientomaquina_tmprevewwds_15_tfpmusucre ,
                                          short AV100Mantenimientomaquina_tmprevewwds_17_tfpmdias ,
                                          short AV101Mantenimientomaquina_tmprevewwds_18_tfpmdias_to ,
                                          short AV102Mantenimientomaquina_tmprevewwds_19_tfpmdiaspaviso ,
                                          short AV103Mantenimientomaquina_tmprevewwds_20_tfpmdiaspaviso_to ,
                                          java.math.BigDecimal AV104Mantenimientomaquina_tmprevewwds_21_tfpmuso ,
                                          java.math.BigDecimal AV105Mantenimientomaquina_tmprevewwds_22_tfpmuso_to ,
                                          java.math.BigDecimal AV106Mantenimientomaquina_tmprevewwds_23_tfpmusomts ,
                                          java.math.BigDecimal AV107Mantenimientomaquina_tmprevewwds_24_tfpmusomts_to ,
                                          String AV109Mantenimientomaquina_tmprevewwds_26_tfpmtipodsc_sel ,
                                          String AV108Mantenimientomaquina_tmprevewwds_25_tfpmtipodsc ,
                                          int AV110Mantenimientomaquina_tmprevewwds_27_tfpmord ,
                                          int AV111Mantenimientomaquina_tmprevewwds_28_tfpmord_to ,
                                          java.math.BigDecimal AV112Mantenimientomaquina_tmprevewwds_29_tfpmtie ,
                                          java.math.BigDecimal AV113Mantenimientomaquina_tmprevewwds_30_tfpmtie_to ,
                                          String AV115Mantenimientomaquina_tmprevewwds_32_tfpmpla_sel ,
                                          String AV114Mantenimientomaquina_tmprevewwds_31_tfpmpla ,
                                          String AV117Mantenimientomaquina_tmprevewwds_34_tfpmtxt_sel ,
                                          String AV116Mantenimientomaquina_tmprevewwds_33_tfpmtxt ,
                                          int A9429PMCod ,
                                          String A9473PMDsc ,
                                          String A9476PMMaqCod ,
                                          String A9477PMMaqDsc ,
                                          java.util.Date A9474PMFchCre ,
                                          java.util.Date A9484PMIni ,
                                          java.util.Date A9486PMUlt ,
                                          java.util.Date A9485PMFin ,
                                          String A9475PMUsuCre ,
                                          short A9487PMDias ,
                                          short A14275PMDiasPavi ,
                                          java.math.BigDecimal A11454PMUso ,
                                          java.math.BigDecimal A13013PMUsoMts ,
                                          String A14272PMTipoDsc ,
                                          int A9488PMOrd ,
                                          java.math.BigDecimal A11455PMTie ,
                                          String A11456PMPla ,
                                          String A9483PMTxt ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV84Mantenimientomaquina_tmprevewwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[32];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.PMTipoID, T1.PMTxt, T1.PMPla, T1.PMTie, T1.PMOrd, T2.PMTipoDsc, T1.PMUsoMts, T1.PMUso, T1.PMDiasPavi, T1.PMDias, T1.PMUsuCre, T1.PMFin, T1.PMUlt," ;
      scmdbuf += " T1.PMIni, T1.PMFchCre, T3.MaqDsc AS PMMaqDsc, T1.PMMaqCod AS PMMaqCod, T1.PMDsc, T1.PMCod, T1.PMEst FROM ((TXPMPREVE T1 INNER JOIN TXPTIPPRV T2 ON T2.EmprCod =" ;
      scmdbuf += " T1.EmprCod AND T2.PMTipoID = T1.PMTipoID) LEFT JOIN TXPMAQUIN T3 ON T3.EmprCod = T1.EmprCod AND T3.MaqCod = T1.PMMaqCod)" ;
      if ( ! (0==AV85Mantenimientomaquina_tmprevewwds_2_tfpmcod) )
      {
         addWhere(sWhereString, "(T1.PMCod >= ?)");
      }
      else
      {
         GXv_int9[0] = (byte)(1) ;
      }
      if ( ! (0==AV86Mantenimientomaquina_tmprevewwds_3_tfpmcod_to) )
      {
         addWhere(sWhereString, "(T1.PMCod <= ?)");
      }
      else
      {
         GXv_int9[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Mantenimientomaquina_tmprevewwds_5_tfpmdsc_sel)==0) && ( ! (GXutil.strcmp("", AV87Mantenimientomaquina_tmprevewwds_4_tfpmdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PMDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Mantenimientomaquina_tmprevewwds_5_tfpmdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PMDsc = ?)");
      }
      else
      {
         GXv_int9[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Mantenimientomaquina_tmprevewwds_7_tfpmmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV89Mantenimientomaquina_tmprevewwds_6_tfpmmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PMMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Mantenimientomaquina_tmprevewwds_7_tfpmmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PMMaqCod = ?)");
      }
      else
      {
         GXv_int9[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Mantenimientomaquina_tmprevewwds_9_tfpmmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV91Mantenimientomaquina_tmprevewwds_8_tfpmmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Mantenimientomaquina_tmprevewwds_9_tfpmmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.MaqDsc = ?)");
      }
      else
      {
         GXv_int9[7] = (byte)(1) ;
      }
      if ( AV93Mantenimientomaquina_tmprevewwds_10_tfpmest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV93Mantenimientomaquina_tmprevewwds_10_tfpmest_sels, "T1.PMEst IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV94Mantenimientomaquina_tmprevewwds_11_tfpmfchcre)) )
      {
         addWhere(sWhereString, "(T1.PMFchCre >= ?)");
      }
      else
      {
         GXv_int9[8] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV95Mantenimientomaquina_tmprevewwds_12_tfpmini)) )
      {
         addWhere(sWhereString, "(T1.PMIni >= ?)");
      }
      else
      {
         GXv_int9[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV96Mantenimientomaquina_tmprevewwds_13_tfpmult)) )
      {
         addWhere(sWhereString, "(T1.PMUlt >= ?)");
      }
      else
      {
         GXv_int9[10] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV97Mantenimientomaquina_tmprevewwds_14_tfpmfin)) )
      {
         addWhere(sWhereString, "(T1.PMFin >= ?)");
      }
      else
      {
         GXv_int9[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Mantenimientomaquina_tmprevewwds_16_tfpmusucre_sel)==0) && ( ! (GXutil.strcmp("", AV98Mantenimientomaquina_tmprevewwds_15_tfpmusucre)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PMUsuCre) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Mantenimientomaquina_tmprevewwds_16_tfpmusucre_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PMUsuCre = ?)");
      }
      else
      {
         GXv_int9[13] = (byte)(1) ;
      }
      if ( ! (0==AV100Mantenimientomaquina_tmprevewwds_17_tfpmdias) )
      {
         addWhere(sWhereString, "(T1.PMDias >= ?)");
      }
      else
      {
         GXv_int9[14] = (byte)(1) ;
      }
      if ( ! (0==AV101Mantenimientomaquina_tmprevewwds_18_tfpmdias_to) )
      {
         addWhere(sWhereString, "(T1.PMDias <= ?)");
      }
      else
      {
         GXv_int9[15] = (byte)(1) ;
      }
      if ( ! (0==AV102Mantenimientomaquina_tmprevewwds_19_tfpmdiaspaviso) )
      {
         addWhere(sWhereString, "(T1.PMDiasPavi >= ?)");
      }
      else
      {
         GXv_int9[16] = (byte)(1) ;
      }
      if ( ! (0==AV103Mantenimientomaquina_tmprevewwds_20_tfpmdiaspaviso_to) )
      {
         addWhere(sWhereString, "(T1.PMDiasPavi <= ?)");
      }
      else
      {
         GXv_int9[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV104Mantenimientomaquina_tmprevewwds_21_tfpmuso)==0) )
      {
         addWhere(sWhereString, "(T1.PMUso >= ?)");
      }
      else
      {
         GXv_int9[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV105Mantenimientomaquina_tmprevewwds_22_tfpmuso_to)==0) )
      {
         addWhere(sWhereString, "(T1.PMUso <= ?)");
      }
      else
      {
         GXv_int9[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV106Mantenimientomaquina_tmprevewwds_23_tfpmusomts)==0) )
      {
         addWhere(sWhereString, "(T1.PMUsoMts >= ?)");
      }
      else
      {
         GXv_int9[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV107Mantenimientomaquina_tmprevewwds_24_tfpmusomts_to)==0) )
      {
         addWhere(sWhereString, "(T1.PMUsoMts <= ?)");
      }
      else
      {
         GXv_int9[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Mantenimientomaquina_tmprevewwds_26_tfpmtipodsc_sel)==0) && ( ! (GXutil.strcmp("", AV108Mantenimientomaquina_tmprevewwds_25_tfpmtipodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PMTipoDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Mantenimientomaquina_tmprevewwds_26_tfpmtipodsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PMTipoDsc = ?)");
      }
      else
      {
         GXv_int9[23] = (byte)(1) ;
      }
      if ( ! (0==AV110Mantenimientomaquina_tmprevewwds_27_tfpmord) )
      {
         addWhere(sWhereString, "(T1.PMOrd >= ?)");
      }
      else
      {
         GXv_int9[24] = (byte)(1) ;
      }
      if ( ! (0==AV111Mantenimientomaquina_tmprevewwds_28_tfpmord_to) )
      {
         addWhere(sWhereString, "(T1.PMOrd <= ?)");
      }
      else
      {
         GXv_int9[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV112Mantenimientomaquina_tmprevewwds_29_tfpmtie)==0) )
      {
         addWhere(sWhereString, "(T1.PMTie >= ?)");
      }
      else
      {
         GXv_int9[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV113Mantenimientomaquina_tmprevewwds_30_tfpmtie_to)==0) )
      {
         addWhere(sWhereString, "(T1.PMTie <= ?)");
      }
      else
      {
         GXv_int9[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Mantenimientomaquina_tmprevewwds_32_tfpmpla_sel)==0) && ( ! (GXutil.strcmp("", AV114Mantenimientomaquina_tmprevewwds_31_tfpmpla)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PMPla) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Mantenimientomaquina_tmprevewwds_32_tfpmpla_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PMPla = ?)");
      }
      else
      {
         GXv_int9[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Mantenimientomaquina_tmprevewwds_34_tfpmtxt_sel)==0) && ( ! (GXutil.strcmp("", AV116Mantenimientomaquina_tmprevewwds_33_tfpmtxt)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PMTxt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Mantenimientomaquina_tmprevewwds_34_tfpmtxt_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PMTxt = ?)");
      }
      else
      {
         GXv_int9[31] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMCod" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMDsc" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMMaqCod" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMMaqCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.MaqDsc" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.MaqDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMEst" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMEst DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMFchCre" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMFchCre DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMIni" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMIni DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMUlt" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMUlt DESC" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMFin" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMFin DESC" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMUsuCre" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMUsuCre DESC" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMDias" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMDias DESC" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMDiasPavi" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMDiasPavi DESC" ;
      }
      else if ( ( AV16OrderedBy == 13 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMUso" ;
      }
      else if ( ( AV16OrderedBy == 13 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMUso DESC" ;
      }
      else if ( ( AV16OrderedBy == 14 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMUsoMts" ;
      }
      else if ( ( AV16OrderedBy == 14 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMUsoMts DESC" ;
      }
      else if ( ( AV16OrderedBy == 15 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PMTipoDsc" ;
      }
      else if ( ( AV16OrderedBy == 15 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PMTipoDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 16 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMOrd" ;
      }
      else if ( ( AV16OrderedBy == 16 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMOrd DESC" ;
      }
      else if ( ( AV16OrderedBy == 17 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMTie" ;
      }
      else if ( ( AV16OrderedBy == 17 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMTie DESC" ;
      }
      else if ( ( AV16OrderedBy == 18 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMPla" ;
      }
      else if ( ( AV16OrderedBy == 18 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMPla DESC" ;
      }
      else if ( ( AV16OrderedBy == 19 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMTxt" ;
      }
      else if ( ( AV16OrderedBy == 19 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMTxt DESC" ;
      }
      GXv_Object10[0] = scmdbuf ;
      GXv_Object10[1] = GXv_int9 ;
      return GXv_Object10 ;
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
                  return conditional_P08JV2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , (java.util.Date)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).shortValue() , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (java.util.Date)dynConstraints[42] , (String)dynConstraints[43] , ((Number) dynConstraints[44]).shortValue() , ((Number) dynConstraints[45]).shortValue() , (java.math.BigDecimal)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (String)dynConstraints[48] , ((Number) dynConstraints[49]).intValue() , (java.math.BigDecimal)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , ((Number) dynConstraints[53]).shortValue() , ((Boolean) dynConstraints[54]).booleanValue() , (String)dynConstraints[55] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08JV2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 30);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(11);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(12, 8);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(13);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDate(14);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDate(15);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDate(16);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(17, 16);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(18, 6);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(19, 30);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((int[]) buf[33])[0] = rslt.getInt(20);
               ((String[]) buf[34])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
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
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[40]);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[41]);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[42]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[43]);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 8);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[46]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[47]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[48]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[49]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[51], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[58], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[59], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 1);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 2000);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 2000);
               }
               return;
      }
   }

}

