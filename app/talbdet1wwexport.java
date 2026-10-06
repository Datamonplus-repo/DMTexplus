package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class talbdet1wwexport extends GXProcedure
{
   public talbdet1wwexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( talbdet1wwexport.class ), "" );
   }

   public talbdet1wwexport( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      talbdet1wwexport.this.aP1 = new String[] {""};
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
      talbdet1wwexport.this.aP0 = aP0;
      talbdet1wwexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "TALBDET1WWExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      talbdet1wwexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV106FilterFullText, GXv_char5) ;
      talbdet1wwexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (0==AV51TFAlbRecCod) && (0==AV52TFAlbRecCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nº Recepcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         talbdet1wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV51TFAlbRecCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         talbdet1wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV52TFAlbRecCod_To );
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV57TFAlbRFen)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha Entrada", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         talbdet1wwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV57TFAlbRFen );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), AV59TFAlbRHEn) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Hora de entrada", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         talbdet1wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( AV59TFAlbRHEn );
      }
      if ( ! ( (GXutil.strcmp("", AV64TFCliNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         talbdet1wwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV64TFCliNom_Sel, GXv_char5) ;
         talbdet1wwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV63TFCliNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Cliente", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            talbdet1wwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV63TFCliNom, GXv_char5) ;
            talbdet1wwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV66TFAlbRef_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo Referencia", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         talbdet1wwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV66TFAlbRef_Sel, GXv_char5) ;
         talbdet1wwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV65TFAlbRef)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo Referencia", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            talbdet1wwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV65TFAlbRef, GXv_char5) ;
            talbdet1wwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV68TFAlbRefDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion Referencia", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         talbdet1wwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV68TFAlbRefDsc_Sel, GXv_char5) ;
         talbdet1wwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV67TFAlbRefDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion Referencia", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            talbdet1wwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV67TFAlbRefDsc, GXv_char5) ;
            talbdet1wwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV72TFProceNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Procedencia", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         talbdet1wwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV72TFProceNom_Sel, GXv_char5) ;
         talbdet1wwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV71TFProceNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Procedencia", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            talbdet1wwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV71TFProceNom, GXv_char5) ;
            talbdet1wwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV76TFTrnNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Transportista", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         talbdet1wwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV76TFTrnNom_Sel, GXv_char5) ;
         talbdet1wwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV75TFTrnNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Transportista", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            talbdet1wwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV75TFTrnNom, GXv_char5) ;
            talbdet1wwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV80TFTipEntNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Tipo Entrada", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         talbdet1wwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV80TFTipEntNom_Sel, GXv_char5) ;
         talbdet1wwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV79TFTipEntNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Tipo Entrada", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            talbdet1wwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV79TFTipEntNom, GXv_char5) ;
            talbdet1wwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV82TFAlbRDes_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Destino", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         talbdet1wwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV82TFAlbRDes_Sel, GXv_char5) ;
         talbdet1wwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV81TFAlbRDes)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Destino", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            talbdet1wwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV81TFAlbRDes, GXv_char5) ;
            talbdet1wwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83TFAlbRUniEnt)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84TFAlbRUniEnt_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Unds Ent", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         talbdet1wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV83TFAlbRUniEnt)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         talbdet1wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV84TFAlbRUniEnt_To)) );
      }
      if ( ! ( ( AV108TFAlbRUni_Sels.size() == 0 ) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Und", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         talbdet1wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV98i = 1 ;
         AV111GXV1 = 1 ;
         while ( AV111GXV1 <= AV108TFAlbRUni_Sels.size() )
         {
            AV86TFAlbRUni_Sel = (String)AV108TFAlbRUni_Sels.elementAt(-1+AV111GXV1) ;
            if ( AV98i == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( "" );
            }
            else
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+", " );
            }
            if ( GXutil.strcmp(GXutil.trim( AV86TFAlbRUni_Sel), httpContext.getMessage( "K", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "K", "") );
            }
            else if ( GXutil.strcmp(GXutil.trim( AV86TFAlbRUni_Sel), httpContext.getMessage( "M", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "M", "") );
            }
            AV98i = (long)(AV98i+1) ;
            AV111GXV1 = (int)(AV111GXV1+1) ;
         }
      }
      if ( ! ( (0==AV87TFAlbRPieEnt) && (0==AV88TFAlbRPieEnt_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Pzs Ent", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         talbdet1wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV87TFAlbRPieEnt );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         talbdet1wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV88TFAlbRPieEnt_To );
      }
      if ( ! ( (GXutil.strcmp("", AV90TFAlbRLoc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Localizacion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         talbdet1wwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV90TFAlbRLoc_Sel, GXv_char5) ;
         talbdet1wwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV89TFAlbRLoc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Localizacion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            talbdet1wwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV89TFAlbRLoc, GXv_char5) ;
            talbdet1wwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( ( AV92TFAlbRReo_Sels.size() == 0 ) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Reclamacion?", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         talbdet1wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV98i = 1 ;
         AV112GXV2 = 1 ;
         while ( AV112GXV2 <= AV92TFAlbRReo_Sels.size() )
         {
            AV93TFAlbRReo_Sel = (String)AV92TFAlbRReo_Sels.elementAt(-1+AV112GXV2) ;
            if ( AV98i == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( "" );
            }
            else
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+", " );
            }
            if ( GXutil.strcmp(GXutil.trim( AV93TFAlbRReo_Sel), httpContext.getMessage( "NO", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "NO", "") );
            }
            else if ( GXutil.strcmp(GXutil.trim( AV93TFAlbRReo_Sel), httpContext.getMessage( "SI", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "SI", "") );
            }
            AV98i = (long)(AV98i+1) ;
            AV112GXV2 = (int)(AV112GXV2+1) ;
         }
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV48VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV36Session.getValue("TALBDET1WWColumnsSelector"), "") != 0 )
      {
         AV43ColumnsSelectorXML = AV36Session.getValue("TALBDET1WWColumnsSelector") ;
         AV40ColumnsSelector.fromxml(AV43ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV113GXV3 = 1 ;
      while ( AV113GXV3 <= AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV42ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV113GXV3));
         if ( AV42ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV42ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV42ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV42ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setColor( 11 );
            AV48VisibleColumnCount = (long)(AV48VisibleColumnCount+1) ;
         }
         AV113GXV3 = (int)(AV113GXV3+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV115Talbdet1wwds_1_filterfulltext = AV106FilterFullText ;
      AV116Talbdet1wwds_2_tfalbreccod = AV51TFAlbRecCod ;
      AV117Talbdet1wwds_3_tfalbreccod_to = AV52TFAlbRecCod_To ;
      AV118Talbdet1wwds_4_tfalbrfen = AV57TFAlbRFen ;
      AV119Talbdet1wwds_5_tfalbrhen = AV59TFAlbRHEn ;
      AV120Talbdet1wwds_6_tfclinom = AV63TFCliNom ;
      AV121Talbdet1wwds_7_tfclinom_sel = AV64TFCliNom_Sel ;
      AV122Talbdet1wwds_8_tfalbref = AV65TFAlbRef ;
      AV123Talbdet1wwds_9_tfalbref_sel = AV66TFAlbRef_Sel ;
      AV124Talbdet1wwds_10_tfalbrefdsc = AV67TFAlbRefDsc ;
      AV125Talbdet1wwds_11_tfalbrefdsc_sel = AV68TFAlbRefDsc_Sel ;
      AV126Talbdet1wwds_12_tfprocenom = AV71TFProceNom ;
      AV127Talbdet1wwds_13_tfprocenom_sel = AV72TFProceNom_Sel ;
      AV128Talbdet1wwds_14_tftrnnom = AV75TFTrnNom ;
      AV129Talbdet1wwds_15_tftrnnom_sel = AV76TFTrnNom_Sel ;
      AV130Talbdet1wwds_16_tftipentnom = AV79TFTipEntNom ;
      AV131Talbdet1wwds_17_tftipentnom_sel = AV80TFTipEntNom_Sel ;
      AV132Talbdet1wwds_18_tfalbrdes = AV81TFAlbRDes ;
      AV133Talbdet1wwds_19_tfalbrdes_sel = AV82TFAlbRDes_Sel ;
      AV134Talbdet1wwds_20_tfalbrunient = AV83TFAlbRUniEnt ;
      AV135Talbdet1wwds_21_tfalbrunient_to = AV84TFAlbRUniEnt_To ;
      AV136Talbdet1wwds_22_tfalbruni_sels = AV108TFAlbRUni_Sels ;
      AV137Talbdet1wwds_23_tfalbrpieent = AV87TFAlbRPieEnt ;
      AV138Talbdet1wwds_24_tfalbrpieent_to = AV88TFAlbRPieEnt_To ;
      AV139Talbdet1wwds_25_tfalbrloc = AV89TFAlbRLoc ;
      AV140Talbdet1wwds_26_tfalbrloc_sel = AV90TFAlbRLoc_Sel ;
      AV141Talbdet1wwds_27_tfalbrreo_sels = AV92TFAlbRReo_Sels ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A56AlbRUni ,
                                           AV136Talbdet1wwds_22_tfalbruni_sels ,
                                           A55AlbRReo ,
                                           AV141Talbdet1wwds_27_tfalbrreo_sels ,
                                           Integer.valueOf(AV116Talbdet1wwds_2_tfalbreccod) ,
                                           Integer.valueOf(AV117Talbdet1wwds_3_tfalbreccod_to) ,
                                           AV118Talbdet1wwds_4_tfalbrfen ,
                                           AV119Talbdet1wwds_5_tfalbrhen ,
                                           AV121Talbdet1wwds_7_tfclinom_sel ,
                                           AV120Talbdet1wwds_6_tfclinom ,
                                           AV123Talbdet1wwds_9_tfalbref_sel ,
                                           AV122Talbdet1wwds_8_tfalbref ,
                                           AV125Talbdet1wwds_11_tfalbrefdsc_sel ,
                                           AV124Talbdet1wwds_10_tfalbrefdsc ,
                                           AV127Talbdet1wwds_13_tfprocenom_sel ,
                                           AV126Talbdet1wwds_12_tfprocenom ,
                                           AV129Talbdet1wwds_15_tftrnnom_sel ,
                                           AV128Talbdet1wwds_14_tftrnnom ,
                                           AV131Talbdet1wwds_17_tftipentnom_sel ,
                                           AV130Talbdet1wwds_16_tftipentnom ,
                                           AV133Talbdet1wwds_19_tfalbrdes_sel ,
                                           AV132Talbdet1wwds_18_tfalbrdes ,
                                           AV134Talbdet1wwds_20_tfalbrunient ,
                                           AV135Talbdet1wwds_21_tfalbrunient_to ,
                                           Integer.valueOf(AV136Talbdet1wwds_22_tfalbruni_sels.size()) ,
                                           Integer.valueOf(AV137Talbdet1wwds_23_tfalbrpieent) ,
                                           Integer.valueOf(AV138Talbdet1wwds_24_tfalbrpieent_to) ,
                                           AV140Talbdet1wwds_26_tfalbrloc_sel ,
                                           AV139Talbdet1wwds_25_tfalbrloc ,
                                           Integer.valueOf(AV141Talbdet1wwds_27_tfalbrreo_sels.size()) ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A49AlbRFen ,
                                           A4606AlbRHEn ,
                                           A279CliNom ,
                                           A45AlbRef ,
                                           A3613AlbRefDsc ,
                                           A971ProceNom ,
                                           A841TrnNom ,
                                           A1212TipEntNom ,
                                           A1291AlbRDes ,
                                           A58AlbRUniEnt ,
                                           Integer.valueOf(A52AlbRPieEnt) ,
                                           A50AlbRLoc ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV115Talbdet1wwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV120Talbdet1wwds_6_tfclinom = GXutil.padr( GXutil.rtrim( AV120Talbdet1wwds_6_tfclinom), 30, "%") ;
      lV122Talbdet1wwds_8_tfalbref = GXutil.padr( GXutil.rtrim( AV122Talbdet1wwds_8_tfalbref), 16, "%") ;
      lV124Talbdet1wwds_10_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV124Talbdet1wwds_10_tfalbrefdsc), 26, "%") ;
      lV126Talbdet1wwds_12_tfprocenom = GXutil.padr( GXutil.rtrim( AV126Talbdet1wwds_12_tfprocenom), 30, "%") ;
      lV128Talbdet1wwds_14_tftrnnom = GXutil.padr( GXutil.rtrim( AV128Talbdet1wwds_14_tftrnnom), 30, "%") ;
      lV130Talbdet1wwds_16_tftipentnom = GXutil.padr( GXutil.rtrim( AV130Talbdet1wwds_16_tftipentnom), 25, "%") ;
      lV132Talbdet1wwds_18_tfalbrdes = GXutil.padr( GXutil.rtrim( AV132Talbdet1wwds_18_tfalbrdes), 20, "%") ;
      lV139Talbdet1wwds_25_tfalbrloc = GXutil.padr( GXutil.rtrim( AV139Talbdet1wwds_25_tfalbrloc), 10, "%") ;
      /* Using cursor P08692 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV116Talbdet1wwds_2_tfalbreccod), Integer.valueOf(AV117Talbdet1wwds_3_tfalbreccod_to), AV118Talbdet1wwds_4_tfalbrfen, AV119Talbdet1wwds_5_tfalbrhen, lV120Talbdet1wwds_6_tfclinom, AV121Talbdet1wwds_7_tfclinom_sel, lV122Talbdet1wwds_8_tfalbref, AV123Talbdet1wwds_9_tfalbref_sel, lV124Talbdet1wwds_10_tfalbrefdsc, AV125Talbdet1wwds_11_tfalbrefdsc_sel, lV126Talbdet1wwds_12_tfprocenom, AV127Talbdet1wwds_13_tfprocenom_sel, lV128Talbdet1wwds_14_tftrnnom, AV129Talbdet1wwds_15_tftrnnom_sel, lV130Talbdet1wwds_16_tftipentnom, AV131Talbdet1wwds_17_tftipentnom_sel, lV132Talbdet1wwds_18_tfalbrdes, AV133Talbdet1wwds_19_tfalbrdes_sel, AV134Talbdet1wwds_20_tfalbrunient, AV135Talbdet1wwds_21_tfalbrunient_to, Integer.valueOf(AV137Talbdet1wwds_23_tfalbrpieent), Integer.valueOf(AV138Talbdet1wwds_24_tfalbrpieent_to), lV139Talbdet1wwds_25_tfalbrloc, AV140Talbdet1wwds_26_tfalbrloc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P08692_A396EmprCod[0] ;
         A252CliCod = P08692_A252CliCod[0] ;
         A840TrnCod = P08692_A840TrnCod[0] ;
         n840TrnCod = P08692_n840TrnCod[0] ;
         A970ProceCod = P08692_A970ProceCod[0] ;
         n970ProceCod = P08692_n970ProceCod[0] ;
         A1211TipEntCod = P08692_A1211TipEntCod[0] ;
         n1211TipEntCod = P08692_n1211TipEntCod[0] ;
         A50AlbRLoc = P08692_A50AlbRLoc[0] ;
         A52AlbRPieEnt = P08692_A52AlbRPieEnt[0] ;
         A58AlbRUniEnt = P08692_A58AlbRUniEnt[0] ;
         A1291AlbRDes = P08692_A1291AlbRDes[0] ;
         A1212TipEntNom = P08692_A1212TipEntNom[0] ;
         n1212TipEntNom = P08692_n1212TipEntNom[0] ;
         A841TrnNom = P08692_A841TrnNom[0] ;
         n841TrnNom = P08692_n841TrnNom[0] ;
         A971ProceNom = P08692_A971ProceNom[0] ;
         n971ProceNom = P08692_n971ProceNom[0] ;
         A3613AlbRefDsc = P08692_A3613AlbRefDsc[0] ;
         A45AlbRef = P08692_A45AlbRef[0] ;
         A279CliNom = P08692_A279CliNom[0] ;
         A4606AlbRHEn = P08692_A4606AlbRHEn[0] ;
         n4606AlbRHEn = P08692_n4606AlbRHEn[0] ;
         A49AlbRFen = P08692_A49AlbRFen[0] ;
         A44AlbRecCod = P08692_A44AlbRecCod[0] ;
         A55AlbRReo = P08692_A55AlbRReo[0] ;
         A56AlbRUni = P08692_A56AlbRUni[0] ;
         A279CliNom = P08692_A279CliNom[0] ;
         A841TrnNom = P08692_A841TrnNom[0] ;
         n841TrnNom = P08692_n841TrnNom[0] ;
         A971ProceNom = P08692_A971ProceNom[0] ;
         n971ProceNom = P08692_n971ProceNom[0] ;
         A1212TipEntNom = P08692_A1212TipEntNom[0] ;
         n1212TipEntNom = P08692_n1212TipEntNom[0] ;
         if ( (GXutil.strcmp("", AV115Talbdet1wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A44AlbRecCod, 8, 0) , GXutil.padr( "%" + AV115Talbdet1wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV115Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A45AlbRef) , GXutil.padr( "%" + GXutil.upper( AV115Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3613AlbRefDsc) , GXutil.padr( "%" + GXutil.upper( AV115Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A971ProceNom) , GXutil.padr( "%" + GXutil.upper( AV115Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A841TrnNom) , GXutil.padr( "%" + GXutil.upper( AV115Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1212TipEntNom) , GXutil.padr( "%" + GXutil.upper( AV115Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1291AlbRDes) , GXutil.padr( "%" + GXutil.upper( AV115Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A58AlbRUniEnt, 9, 2) , GXutil.padr( "%" + AV115Talbdet1wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "k", ""), "") , GXutil.padr( "%" + GXutil.lower( AV115Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "m", ""), "") , GXutil.padr( "%" + GXutil.lower( AV115Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A52AlbRPieEnt, 6, 0) , GXutil.padr( "%" + AV115Talbdet1wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A50AlbRLoc) , GXutil.padr( "%" + GXutil.upper( AV115Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "no", ""), "") , GXutil.padr( "%" + GXutil.lower( AV115Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "NO", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "si", ""), "") , GXutil.padr( "%" + GXutil.lower( AV115Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "SI", "")) == 0 ) ) ) )
         {
            AV13CellRow = (int)(AV13CellRow+1) ;
            /* Execute user subroutine: 'BEFOREWRITELINE' */
            S172 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               returnInSub = true;
               if (true) return;
            }
            AV48VisibleColumnCount = 0 ;
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setNumber( A44AlbRecCod );
               AV48VisibleColumnCount = (long)(AV48VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_dtime6 = GXutil.resetTime( A49AlbRFen );
               AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
               AV48VisibleColumnCount = (long)(AV48VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setDate( A4606AlbRHEn );
               AV48VisibleColumnCount = (long)(AV48VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A279CliNom, GXv_char5) ;
               talbdet1wwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV48VisibleColumnCount = (long)(AV48VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A45AlbRef, GXv_char5) ;
               talbdet1wwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV48VisibleColumnCount = (long)(AV48VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A3613AlbRefDsc, GXv_char5) ;
               talbdet1wwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV48VisibleColumnCount = (long)(AV48VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A971ProceNom, GXv_char5) ;
               talbdet1wwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV48VisibleColumnCount = (long)(AV48VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A841TrnNom, GXv_char5) ;
               talbdet1wwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV48VisibleColumnCount = (long)(AV48VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1212TipEntNom, GXv_char5) ;
               talbdet1wwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV48VisibleColumnCount = (long)(AV48VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1291AlbRDes, GXv_char5) ;
               talbdet1wwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV48VisibleColumnCount = (long)(AV48VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A58AlbRUniEnt)) );
               AV48VisibleColumnCount = (long)(AV48VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setText( "" );
               if ( GXutil.strcmp(GXutil.trim( A56AlbRUni), httpContext.getMessage( "K", "")) == 0 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "K", "") );
               }
               else if ( GXutil.strcmp(GXutil.trim( A56AlbRUni), httpContext.getMessage( "M", "")) == 0 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "M", "") );
               }
               AV48VisibleColumnCount = (long)(AV48VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setNumber( A52AlbRPieEnt );
               AV48VisibleColumnCount = (long)(AV48VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A50AlbRLoc, GXv_char5) ;
               talbdet1wwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV48VisibleColumnCount = (long)(AV48VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setText( "" );
               if ( GXutil.strcmp(GXutil.trim( A55AlbRReo), httpContext.getMessage( "NO", "")) == 0 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "NO", "") );
               }
               else if ( GXutil.strcmp(GXutil.trim( A55AlbRReo), httpContext.getMessage( "SI", "")) == 0 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "SI", "") );
               }
               AV48VisibleColumnCount = (long)(AV48VisibleColumnCount+1) ;
            }
            /* Execute user subroutine: 'AFTERWRITELINE' */
            S182 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
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
      AV40ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbRecCod", "", "Nº Recepcion", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbRFen", "", "Fecha Entrada", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbRHEn", "", "Hora de entrada", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CliNom", "", "Nombre Cliente", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbRef", "", "Codigo Referencia", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbRefDsc", "", "Descripcion Referencia", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "ProceNom", "", "Procedencia", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "TrnNom", "", "Transportista", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "TipEntNom", "", "Tipo Entrada", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbRDes", "", "Destino", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbRUniEnt", "", "Unds Ent", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbRUni", "", "Und", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbRPieEnt", "", "Pzs Ent", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbRLoc", "", "Localizacion", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbRReo", "", "Reclamacion?", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXt_char4 = AV44UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TALBDET1WWColumnsSelector", GXv_char5) ;
      talbdet1wwexport.this.GXt_char4 = GXv_char5[0] ;
      AV44UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV44UserCustomValue)==0) ) )
      {
         AV41ColumnsSelectorAux.fromxml(AV44UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector7[0] = AV41ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector8[0] = AV40ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, GXv_SdtWWPColumnsSelector8) ;
         AV41ColumnsSelectorAux = GXv_SdtWWPColumnsSelector7[0] ;
         AV40ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV36Session.getValue("TALBDET1WWGridState"), "") == 0 )
      {
         AV38GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TALBDET1WWGridState"), null, null);
      }
      else
      {
         AV38GridState.fromxml(AV36Session.getValue("TALBDET1WWGridState"), null, null);
      }
      AV16OrderedBy = AV38GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV38GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV142GXV4 = 1 ;
      while ( AV142GXV4 <= AV38GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV39GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV38GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV142GXV4));
         if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV106FilterFullText = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRECCOD") == 0 )
         {
            AV51TFAlbRecCod = (int)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV52TFAlbRecCod_To = (int)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRFEN") == 0 )
         {
            AV57TFAlbRFen = localUtil.ctod( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRHEN") == 0 )
         {
            AV59TFAlbRHEn = localUtil.ctot( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV63TFCliNom = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV64TFCliNom_Sel = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF") == 0 )
         {
            AV65TFAlbRef = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF_SEL") == 0 )
         {
            AV66TFAlbRef_Sel = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREFDSC") == 0 )
         {
            AV67TFAlbRefDsc = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREFDSC_SEL") == 0 )
         {
            AV68TFAlbRefDsc_Sel = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCENOM") == 0 )
         {
            AV71TFProceNom = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCENOM_SEL") == 0 )
         {
            AV72TFProceNom_Sel = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNNOM") == 0 )
         {
            AV75TFTrnNom = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNNOM_SEL") == 0 )
         {
            AV76TFTrnNom_Sel = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPENTNOM") == 0 )
         {
            AV79TFTipEntNom = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPENTNOM_SEL") == 0 )
         {
            AV80TFTipEntNom_Sel = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRDES") == 0 )
         {
            AV81TFAlbRDes = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRDES_SEL") == 0 )
         {
            AV82TFAlbRDes_Sel = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNIENT") == 0 )
         {
            AV83TFAlbRUniEnt = CommonUtil.decimalVal( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV84TFAlbRUniEnt_To = CommonUtil.decimalVal( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNI_SEL") == 0 )
         {
            AV107TFAlbRUni_SelsJson = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV108TFAlbRUni_Sels.fromJSonString(AV107TFAlbRUni_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRPIEENT") == 0 )
         {
            AV87TFAlbRPieEnt = (int)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV88TFAlbRPieEnt_To = (int)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRLOC") == 0 )
         {
            AV89TFAlbRLoc = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRLOC_SEL") == 0 )
         {
            AV90TFAlbRLoc_Sel = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRREO_SEL") == 0 )
         {
            AV91TFAlbRReo_SelsJson = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV92TFAlbRReo_Sels.fromJSonString(AV91TFAlbRReo_SelsJson, null);
         }
         AV142GXV4 = (int)(AV142GXV4+1) ;
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
      this.aP0[0] = talbdet1wwexport.this.AV11Filename;
      this.aP1[0] = talbdet1wwexport.this.AV12ErrorMessage;
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
      AV106FilterFullText = "" ;
      AV57TFAlbRFen = GXutil.nullDate() ;
      AV59TFAlbRHEn = GXutil.resetTime( GXutil.nullDate() );
      AV64TFCliNom_Sel = "" ;
      AV63TFCliNom = "" ;
      AV66TFAlbRef_Sel = "" ;
      AV65TFAlbRef = "" ;
      AV68TFAlbRefDsc_Sel = "" ;
      AV67TFAlbRefDsc = "" ;
      AV72TFProceNom_Sel = "" ;
      AV71TFProceNom = "" ;
      AV76TFTrnNom_Sel = "" ;
      AV75TFTrnNom = "" ;
      AV80TFTipEntNom_Sel = "" ;
      AV79TFTipEntNom = "" ;
      AV82TFAlbRDes_Sel = "" ;
      AV81TFAlbRDes = "" ;
      AV83TFAlbRUniEnt = DecimalUtil.ZERO ;
      AV84TFAlbRUniEnt_To = DecimalUtil.ZERO ;
      AV108TFAlbRUni_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV86TFAlbRUni_Sel = "" ;
      AV90TFAlbRLoc_Sel = "" ;
      AV89TFAlbRLoc = "" ;
      AV92TFAlbRReo_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV93TFAlbRReo_Sel = "" ;
      AV36Session = httpContext.getWebSession();
      AV43ColumnsSelectorXML = "" ;
      AV40ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV42ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A49AlbRFen = GXutil.nullDate() ;
      A4606AlbRHEn = GXutil.resetTime( GXutil.nullDate() );
      A279CliNom = "" ;
      A45AlbRef = "" ;
      A3613AlbRefDsc = "" ;
      A971ProceNom = "" ;
      A841TrnNom = "" ;
      A1212TipEntNom = "" ;
      A1291AlbRDes = "" ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A56AlbRUni = "" ;
      A50AlbRLoc = "" ;
      A55AlbRReo = "" ;
      AV115Talbdet1wwds_1_filterfulltext = "" ;
      AV118Talbdet1wwds_4_tfalbrfen = GXutil.nullDate() ;
      AV119Talbdet1wwds_5_tfalbrhen = GXutil.resetTime( GXutil.nullDate() );
      AV120Talbdet1wwds_6_tfclinom = "" ;
      AV121Talbdet1wwds_7_tfclinom_sel = "" ;
      AV122Talbdet1wwds_8_tfalbref = "" ;
      AV123Talbdet1wwds_9_tfalbref_sel = "" ;
      AV124Talbdet1wwds_10_tfalbrefdsc = "" ;
      AV125Talbdet1wwds_11_tfalbrefdsc_sel = "" ;
      AV126Talbdet1wwds_12_tfprocenom = "" ;
      AV127Talbdet1wwds_13_tfprocenom_sel = "" ;
      AV128Talbdet1wwds_14_tftrnnom = "" ;
      AV129Talbdet1wwds_15_tftrnnom_sel = "" ;
      AV130Talbdet1wwds_16_tftipentnom = "" ;
      AV131Talbdet1wwds_17_tftipentnom_sel = "" ;
      AV132Talbdet1wwds_18_tfalbrdes = "" ;
      AV133Talbdet1wwds_19_tfalbrdes_sel = "" ;
      AV134Talbdet1wwds_20_tfalbrunient = DecimalUtil.ZERO ;
      AV135Talbdet1wwds_21_tfalbrunient_to = DecimalUtil.ZERO ;
      AV136Talbdet1wwds_22_tfalbruni_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV139Talbdet1wwds_25_tfalbrloc = "" ;
      AV140Talbdet1wwds_26_tfalbrloc_sel = "" ;
      AV141Talbdet1wwds_27_tfalbrreo_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      scmdbuf = "" ;
      lV120Talbdet1wwds_6_tfclinom = "" ;
      lV122Talbdet1wwds_8_tfalbref = "" ;
      lV124Talbdet1wwds_10_tfalbrefdsc = "" ;
      lV126Talbdet1wwds_12_tfprocenom = "" ;
      lV128Talbdet1wwds_14_tftrnnom = "" ;
      lV130Talbdet1wwds_16_tftipentnom = "" ;
      lV132Talbdet1wwds_18_tfalbrdes = "" ;
      lV139Talbdet1wwds_25_tfalbrloc = "" ;
      P08692_A396EmprCod = new String[] {""} ;
      P08692_A252CliCod = new int[1] ;
      P08692_A840TrnCod = new short[1] ;
      P08692_n840TrnCod = new boolean[] {false} ;
      P08692_A970ProceCod = new short[1] ;
      P08692_n970ProceCod = new boolean[] {false} ;
      P08692_A1211TipEntCod = new short[1] ;
      P08692_n1211TipEntCod = new boolean[] {false} ;
      P08692_A50AlbRLoc = new String[] {""} ;
      P08692_A52AlbRPieEnt = new int[1] ;
      P08692_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08692_A1291AlbRDes = new String[] {""} ;
      P08692_A1212TipEntNom = new String[] {""} ;
      P08692_n1212TipEntNom = new boolean[] {false} ;
      P08692_A841TrnNom = new String[] {""} ;
      P08692_n841TrnNom = new boolean[] {false} ;
      P08692_A971ProceNom = new String[] {""} ;
      P08692_n971ProceNom = new boolean[] {false} ;
      P08692_A3613AlbRefDsc = new String[] {""} ;
      P08692_A45AlbRef = new String[] {""} ;
      P08692_A279CliNom = new String[] {""} ;
      P08692_A4606AlbRHEn = new java.util.Date[] {GXutil.nullDate()} ;
      P08692_n4606AlbRHEn = new boolean[] {false} ;
      P08692_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P08692_A44AlbRecCod = new int[1] ;
      P08692_A55AlbRReo = new String[] {""} ;
      P08692_A56AlbRUni = new String[] {""} ;
      A396EmprCod = "" ;
      GXt_dtime6 = GXutil.resetTime( GXutil.nullDate() );
      AV44UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV41ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV38GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV39GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV107TFAlbRUni_SelsJson = "" ;
      AV91TFAlbRReo_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.talbdet1wwexport__default(),
         new Object[] {
             new Object[] {
            P08692_A396EmprCod, P08692_A252CliCod, P08692_A840TrnCod, P08692_n840TrnCod, P08692_A970ProceCod, P08692_n970ProceCod, P08692_A1211TipEntCod, P08692_n1211TipEntCod, P08692_A50AlbRLoc, P08692_A52AlbRPieEnt,
            P08692_A58AlbRUniEnt, P08692_A1291AlbRDes, P08692_A1212TipEntNom, P08692_n1212TipEntNom, P08692_A841TrnNom, P08692_n841TrnNom, P08692_A971ProceNom, P08692_n971ProceNom, P08692_A3613AlbRefDsc, P08692_A45AlbRef,
            P08692_A279CliNom, P08692_A4606AlbRHEn, P08692_n4606AlbRHEn, P08692_A49AlbRFen, P08692_A44AlbRecCod, P08692_A55AlbRReo, P08692_A56AlbRUni
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short GXv_int3[] ;
   private short AV16OrderedBy ;
   private short A840TrnCod ;
   private short A970ProceCod ;
   private short A1211TipEntCod ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV51TFAlbRecCod ;
   private int AV52TFAlbRecCod_To ;
   private int AV111GXV1 ;
   private int AV87TFAlbRPieEnt ;
   private int AV88TFAlbRPieEnt_To ;
   private int AV112GXV2 ;
   private int AV113GXV3 ;
   private int A44AlbRecCod ;
   private int A52AlbRPieEnt ;
   private int AV116Talbdet1wwds_2_tfalbreccod ;
   private int AV117Talbdet1wwds_3_tfalbreccod_to ;
   private int AV137Talbdet1wwds_23_tfalbrpieent ;
   private int AV138Talbdet1wwds_24_tfalbrpieent_to ;
   private int AV136Talbdet1wwds_22_tfalbruni_sels_size ;
   private int AV141Talbdet1wwds_27_tfalbrreo_sels_size ;
   private int A252CliCod ;
   private int AV142GXV4 ;
   private long AV98i ;
   private long AV48VisibleColumnCount ;
   private java.math.BigDecimal AV83TFAlbRUniEnt ;
   private java.math.BigDecimal AV84TFAlbRUniEnt_To ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal AV134Talbdet1wwds_20_tfalbrunient ;
   private java.math.BigDecimal AV135Talbdet1wwds_21_tfalbrunient_to ;
   private String AV64TFCliNom_Sel ;
   private String AV63TFCliNom ;
   private String AV66TFAlbRef_Sel ;
   private String AV65TFAlbRef ;
   private String AV68TFAlbRefDsc_Sel ;
   private String AV67TFAlbRefDsc ;
   private String AV72TFProceNom_Sel ;
   private String AV71TFProceNom ;
   private String AV76TFTrnNom_Sel ;
   private String AV75TFTrnNom ;
   private String AV80TFTipEntNom_Sel ;
   private String AV79TFTipEntNom ;
   private String AV82TFAlbRDes_Sel ;
   private String AV81TFAlbRDes ;
   private String AV86TFAlbRUni_Sel ;
   private String AV90TFAlbRLoc_Sel ;
   private String AV89TFAlbRLoc ;
   private String AV93TFAlbRReo_Sel ;
   private String A279CliNom ;
   private String A45AlbRef ;
   private String A3613AlbRefDsc ;
   private String A971ProceNom ;
   private String A841TrnNom ;
   private String A1212TipEntNom ;
   private String A1291AlbRDes ;
   private String A56AlbRUni ;
   private String A50AlbRLoc ;
   private String A55AlbRReo ;
   private String AV120Talbdet1wwds_6_tfclinom ;
   private String AV121Talbdet1wwds_7_tfclinom_sel ;
   private String AV122Talbdet1wwds_8_tfalbref ;
   private String AV123Talbdet1wwds_9_tfalbref_sel ;
   private String AV124Talbdet1wwds_10_tfalbrefdsc ;
   private String AV125Talbdet1wwds_11_tfalbrefdsc_sel ;
   private String AV126Talbdet1wwds_12_tfprocenom ;
   private String AV127Talbdet1wwds_13_tfprocenom_sel ;
   private String AV128Talbdet1wwds_14_tftrnnom ;
   private String AV129Talbdet1wwds_15_tftrnnom_sel ;
   private String AV130Talbdet1wwds_16_tftipentnom ;
   private String AV131Talbdet1wwds_17_tftipentnom_sel ;
   private String AV132Talbdet1wwds_18_tfalbrdes ;
   private String AV133Talbdet1wwds_19_tfalbrdes_sel ;
   private String AV139Talbdet1wwds_25_tfalbrloc ;
   private String AV140Talbdet1wwds_26_tfalbrloc_sel ;
   private String scmdbuf ;
   private String lV120Talbdet1wwds_6_tfclinom ;
   private String lV122Talbdet1wwds_8_tfalbref ;
   private String lV124Talbdet1wwds_10_tfalbrefdsc ;
   private String lV126Talbdet1wwds_12_tfprocenom ;
   private String lV128Talbdet1wwds_14_tftrnnom ;
   private String lV130Talbdet1wwds_16_tftipentnom ;
   private String lV132Talbdet1wwds_18_tfalbrdes ;
   private String lV139Talbdet1wwds_25_tfalbrloc ;
   private String A396EmprCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date AV59TFAlbRHEn ;
   private java.util.Date A4606AlbRHEn ;
   private java.util.Date AV119Talbdet1wwds_5_tfalbrhen ;
   private java.util.Date GXt_dtime6 ;
   private java.util.Date AV57TFAlbRFen ;
   private java.util.Date A49AlbRFen ;
   private java.util.Date AV118Talbdet1wwds_4_tfalbrfen ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n840TrnCod ;
   private boolean n970ProceCod ;
   private boolean n1211TipEntCod ;
   private boolean n1212TipEntNom ;
   private boolean n841TrnNom ;
   private boolean n971ProceNom ;
   private boolean n4606AlbRHEn ;
   private String AV43ColumnsSelectorXML ;
   private String AV44UserCustomValue ;
   private String AV107TFAlbRUni_SelsJson ;
   private String AV91TFAlbRReo_SelsJson ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV106FilterFullText ;
   private String AV115Talbdet1wwds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV36Session ;
   private GXSimpleCollection<String> AV108TFAlbRUni_Sels ;
   private GXSimpleCollection<String> AV92TFAlbRReo_Sels ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P08692_A396EmprCod ;
   private int[] P08692_A252CliCod ;
   private short[] P08692_A840TrnCod ;
   private boolean[] P08692_n840TrnCod ;
   private short[] P08692_A970ProceCod ;
   private boolean[] P08692_n970ProceCod ;
   private short[] P08692_A1211TipEntCod ;
   private boolean[] P08692_n1211TipEntCod ;
   private String[] P08692_A50AlbRLoc ;
   private int[] P08692_A52AlbRPieEnt ;
   private java.math.BigDecimal[] P08692_A58AlbRUniEnt ;
   private String[] P08692_A1291AlbRDes ;
   private String[] P08692_A1212TipEntNom ;
   private boolean[] P08692_n1212TipEntNom ;
   private String[] P08692_A841TrnNom ;
   private boolean[] P08692_n841TrnNom ;
   private String[] P08692_A971ProceNom ;
   private boolean[] P08692_n971ProceNom ;
   private String[] P08692_A3613AlbRefDsc ;
   private String[] P08692_A45AlbRef ;
   private String[] P08692_A279CliNom ;
   private java.util.Date[] P08692_A4606AlbRHEn ;
   private boolean[] P08692_n4606AlbRHEn ;
   private java.util.Date[] P08692_A49AlbRFen ;
   private int[] P08692_A44AlbRecCod ;
   private String[] P08692_A55AlbRReo ;
   private String[] P08692_A56AlbRUni ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private GXSimpleCollection<String> AV136Talbdet1wwds_22_tfalbruni_sels ;
   private GXSimpleCollection<String> AV141Talbdet1wwds_27_tfalbrreo_sels ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV38GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV39GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV40ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV41ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV42ColumnsSelector_Column ;
}

final  class talbdet1wwexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08692( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV136Talbdet1wwds_22_tfalbruni_sels ,
                                          String A55AlbRReo ,
                                          GXSimpleCollection<String> AV141Talbdet1wwds_27_tfalbrreo_sels ,
                                          int AV116Talbdet1wwds_2_tfalbreccod ,
                                          int AV117Talbdet1wwds_3_tfalbreccod_to ,
                                          java.util.Date AV118Talbdet1wwds_4_tfalbrfen ,
                                          java.util.Date AV119Talbdet1wwds_5_tfalbrhen ,
                                          String AV121Talbdet1wwds_7_tfclinom_sel ,
                                          String AV120Talbdet1wwds_6_tfclinom ,
                                          String AV123Talbdet1wwds_9_tfalbref_sel ,
                                          String AV122Talbdet1wwds_8_tfalbref ,
                                          String AV125Talbdet1wwds_11_tfalbrefdsc_sel ,
                                          String AV124Talbdet1wwds_10_tfalbrefdsc ,
                                          String AV127Talbdet1wwds_13_tfprocenom_sel ,
                                          String AV126Talbdet1wwds_12_tfprocenom ,
                                          String AV129Talbdet1wwds_15_tftrnnom_sel ,
                                          String AV128Talbdet1wwds_14_tftrnnom ,
                                          String AV131Talbdet1wwds_17_tftipentnom_sel ,
                                          String AV130Talbdet1wwds_16_tftipentnom ,
                                          String AV133Talbdet1wwds_19_tfalbrdes_sel ,
                                          String AV132Talbdet1wwds_18_tfalbrdes ,
                                          java.math.BigDecimal AV134Talbdet1wwds_20_tfalbrunient ,
                                          java.math.BigDecimal AV135Talbdet1wwds_21_tfalbrunient_to ,
                                          int AV136Talbdet1wwds_22_tfalbruni_sels_size ,
                                          int AV137Talbdet1wwds_23_tfalbrpieent ,
                                          int AV138Talbdet1wwds_24_tfalbrpieent_to ,
                                          String AV140Talbdet1wwds_26_tfalbrloc_sel ,
                                          String AV139Talbdet1wwds_25_tfalbrloc ,
                                          int AV141Talbdet1wwds_27_tfalbrreo_sels_size ,
                                          int A44AlbRecCod ,
                                          java.util.Date A49AlbRFen ,
                                          java.util.Date A4606AlbRHEn ,
                                          String A279CliNom ,
                                          String A45AlbRef ,
                                          String A3613AlbRefDsc ,
                                          String A971ProceNom ,
                                          String A841TrnNom ,
                                          String A1212TipEntNom ,
                                          String A1291AlbRDes ,
                                          java.math.BigDecimal A58AlbRUniEnt ,
                                          int A52AlbRPieEnt ,
                                          String A50AlbRLoc ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV115Talbdet1wwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[24];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.CliCod, T1.TrnCod, T1.ProceCod, T1.TipEntCod, T1.AlbRLoc, T1.AlbRPieEnt, T1.AlbRUniEnt, T1.AlbRDes, T5.TipEntNom, T3.TrnNom, T4.ProceNom, T1.AlbRefDsc," ;
      scmdbuf += " T1.AlbRef, T2.CliNom, T1.AlbRHEn, T1.AlbRFen, T1.AlbRecCod, T1.AlbRReo, T1.AlbRUni FROM ((((TXPALBREC T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T2.CliCod = T1.CliCod) LEFT JOIN TXPTRANSP T3 ON T3.EmprCod = T1.EmprCod AND T3.TrnCod = T1.TrnCod) LEFT JOIN TXPPROCED T4 ON T4.EmprCod = T1.EmprCod AND T4.ProceCod" ;
      scmdbuf += " = T1.ProceCod) LEFT JOIN TXPENTRAD T5 ON T5.EmprCod = T1.EmprCod AND T5.TipEntCod = T1.TipEntCod)" ;
      if ( ! (0==AV116Talbdet1wwds_2_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int9[0] = (byte)(1) ;
      }
      if ( ! (0==AV117Talbdet1wwds_3_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int9[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV118Talbdet1wwds_4_tfalbrfen)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int9[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV119Talbdet1wwds_5_tfalbrhen) )
      {
         addWhere(sWhereString, "(T1.AlbRHEn >= ?)");
      }
      else
      {
         GXv_int9[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Talbdet1wwds_7_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV120Talbdet1wwds_6_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Talbdet1wwds_7_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int9[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Talbdet1wwds_9_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV122Talbdet1wwds_8_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Talbdet1wwds_9_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef = ?)");
      }
      else
      {
         GXv_int9[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV125Talbdet1wwds_11_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV124Talbdet1wwds_10_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Talbdet1wwds_11_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int9[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV127Talbdet1wwds_13_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV126Talbdet1wwds_12_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV127Talbdet1wwds_13_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProceNom = ?)");
      }
      else
      {
         GXv_int9[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Talbdet1wwds_15_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV128Talbdet1wwds_14_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Talbdet1wwds_15_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TrnNom = ?)");
      }
      else
      {
         GXv_int9[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV131Talbdet1wwds_17_tftipentnom_sel)==0) && ( ! (GXutil.strcmp("", AV130Talbdet1wwds_16_tftipentnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.TipEntNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV131Talbdet1wwds_17_tftipentnom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.TipEntNom = ?)");
      }
      else
      {
         GXv_int9[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV133Talbdet1wwds_19_tfalbrdes_sel)==0) && ( ! (GXutil.strcmp("", AV132Talbdet1wwds_18_tfalbrdes)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRDes) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV133Talbdet1wwds_19_tfalbrdes_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRDes = ?)");
      }
      else
      {
         GXv_int9[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV134Talbdet1wwds_20_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int9[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV135Talbdet1wwds_21_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int9[19] = (byte)(1) ;
      }
      if ( AV136Talbdet1wwds_22_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV136Talbdet1wwds_22_tfalbruni_sels, "T1.AlbRUni IN (", ")")+")");
      }
      if ( ! (0==AV137Talbdet1wwds_23_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int9[20] = (byte)(1) ;
      }
      if ( ! (0==AV138Talbdet1wwds_24_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int9[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV140Talbdet1wwds_26_tfalbrloc_sel)==0) && ( ! (GXutil.strcmp("", AV139Talbdet1wwds_25_tfalbrloc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRLoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV140Talbdet1wwds_26_tfalbrloc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRLoc = ?)");
      }
      else
      {
         GXv_int9[23] = (byte)(1) ;
      }
      if ( AV141Talbdet1wwds_27_tfalbrreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV141Talbdet1wwds_27_tfalbrreo_sels, "T1.AlbRReo IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRecCod" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRecCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRFen" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRFen DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRHEn" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRHEn DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRef" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRef DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRefDsc" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRefDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.ProceNom" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.ProceNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.TrnNom" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.TrnNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T5.TipEntNom" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T5.TipEntNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRDes" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRDes DESC" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRUniEnt" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRUniEnt DESC" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRUni" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRUni DESC" ;
      }
      else if ( ( AV16OrderedBy == 13 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRPieEnt" ;
      }
      else if ( ( AV16OrderedBy == 13 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRPieEnt DESC" ;
      }
      else if ( ( AV16OrderedBy == 14 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRLoc" ;
      }
      else if ( ( AV16OrderedBy == 14 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRLoc DESC" ;
      }
      else if ( ( AV16OrderedBy == 15 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRReo" ;
      }
      else if ( ( AV16OrderedBy == 15 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRReo DESC" ;
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
                  return conditional_P08692(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (java.util.Date)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , (java.util.Date)dynConstraints[31] , (java.util.Date)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , (String)dynConstraints[42] , ((Number) dynConstraints[43]).shortValue() , ((Boolean) dynConstraints[44]).booleanValue() , (String)dynConstraints[45] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08692", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 10);
               ((int[]) buf[9])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[11])[0] = rslt.getString(9, 20);
               ((String[]) buf[12])[0] = rslt.getString(10, 25);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(13, 26);
               ((String[]) buf[19])[0] = rslt.getString(14, 16);
               ((String[]) buf[20])[0] = rslt.getString(15, 30);
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDateTime(16);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDate(17);
               ((int[]) buf[24])[0] = rslt.getInt(18);
               ((String[]) buf[25])[0] = rslt.getString(19, 2);
               ((String[]) buf[26])[0] = rslt.getString(20, 1);
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
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[26]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[27], false);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 25);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 25);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 20);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 20);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 10);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 10);
               }
               return;
      }
   }

}

