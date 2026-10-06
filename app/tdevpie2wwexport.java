package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tdevpie2wwexport extends GXProcedure
{
   public tdevpie2wwexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tdevpie2wwexport.class ), "" );
   }

   public tdevpie2wwexport( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      tdevpie2wwexport.this.aP1 = new String[] {""};
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
      tdevpie2wwexport.this.aP0 = aP0;
      tdevpie2wwexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "TDevPie2WWExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      tdevpie2wwexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV84FilterFullText, GXv_char5) ;
      tdevpie2wwexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (0==AV55TFDevGenCod) && (0==AV56TFDevGenCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "N Devolucion ID", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tdevpie2wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV55TFDevGenCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tdevpie2wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV56TFDevGenCod_To );
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV57TFDevGenFec)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha de Devolucion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tdevpie2wwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV57TFDevGenFec );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( (0==AV59TFAlbRecCod) && (0==AV60TFAlbRecCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "N Recepcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tdevpie2wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV59TFAlbRecCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tdevpie2wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV60TFAlbRecCod_To );
      }
      if ( ! ( (0==AV61TFDevGenDom) && (0==AV62TFDevGenDom_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Domicilio Envio", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tdevpie2wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV61TFDevGenDom );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tdevpie2wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV62TFDevGenDom_To );
      }
      if ( ! ( (0==AV63TFCliCod) && (0==AV64TFCliCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tdevpie2wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV63TFCliCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tdevpie2wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV64TFCliCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV66TFCliNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tdevpie2wwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV66TFCliNom_Sel, GXv_char5) ;
         tdevpie2wwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV65TFCliNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Cliente", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tdevpie2wwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV65TFCliNom, GXv_char5) ;
            tdevpie2wwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV68TFAlbRef_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cdg.Ref.", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tdevpie2wwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV68TFAlbRef_Sel, GXv_char5) ;
         tdevpie2wwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV67TFAlbRef)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cdg.Ref.", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tdevpie2wwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV67TFAlbRef, GXv_char5) ;
            tdevpie2wwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV69TFDevGenTrn) && (0==AV70TFDevGenTrn_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Transportista", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tdevpie2wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV69TFDevGenTrn );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tdevpie2wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV70TFDevGenTrn_To );
      }
      if ( ! ( (GXutil.strcmp("", AV72TFDevTrnNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tdevpie2wwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV72TFDevTrnNom_Sel, GXv_char5) ;
         tdevpie2wwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV71TFDevTrnNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tdevpie2wwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV71TFDevTrnNom, GXv_char5) ;
            tdevpie2wwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73TFAlbRUniDis)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74TFAlbRUniDis_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Und.Disp.", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tdevpie2wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV73TFAlbRUniDis)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tdevpie2wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV74TFAlbRUniDis_To)) );
      }
      if ( ! ( (0==AV75TFAlbRPieDis) && (0==AV76TFAlbRPieDis_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Piezas Disponibles", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tdevpie2wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV75TFAlbRPieDis );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tdevpie2wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV76TFAlbRPieDis_To );
      }
      if ( ! ( ( AV86TFAlbRUni_Sels.size() == 0 ) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Unidad", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tdevpie2wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV83i = 1 ;
         AV89GXV1 = 1 ;
         while ( AV89GXV1 <= AV86TFAlbRUni_Sels.size() )
         {
            AV78TFAlbRUni_Sel = (String)AV86TFAlbRUni_Sels.elementAt(-1+AV89GXV1) ;
            if ( AV83i == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( "" );
            }
            else
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+", " );
            }
            if ( GXutil.strcmp(GXutil.trim( AV78TFAlbRUni_Sel), httpContext.getMessage( "K", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "K", "") );
            }
            else if ( GXutil.strcmp(GXutil.trim( AV78TFAlbRUni_Sel), httpContext.getMessage( "M", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "M", "") );
            }
            AV83i = (long)(AV83i+1) ;
            AV89GXV1 = (int)(AV89GXV1+1) ;
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79TFDevGenUni)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80TFDevGenUni_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Unidades Dev", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tdevpie2wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV79TFDevGenUni)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tdevpie2wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV80TFDevGenUni_To)) );
      }
      if ( ! ( (0==AV81TFDevGenPie) && (0==AV82TFDevGenPie_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Piezas Dev", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tdevpie2wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV81TFDevGenPie );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tdevpie2wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV82TFDevGenPie_To );
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV52VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV40Session.getValue("TDevPie2WWColumnsSelector"), "") != 0 )
      {
         AV47ColumnsSelectorXML = AV40Session.getValue("TDevPie2WWColumnsSelector") ;
         AV44ColumnsSelector.fromxml(AV47ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV90GXV2 = 1 ;
      while ( AV90GXV2 <= AV44ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV46ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV44ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV90GXV2));
         if ( AV46ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV52VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV46ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV46ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV46ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV52VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV52VisibleColumnCount), 1, 1).setColor( 11 );
            AV52VisibleColumnCount = (long)(AV52VisibleColumnCount+1) ;
         }
         AV90GXV2 = (int)(AV90GXV2+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV92Tdevpie2wwds_1_filterfulltext = AV84FilterFullText ;
      AV93Tdevpie2wwds_2_tfdevgencod = AV55TFDevGenCod ;
      AV94Tdevpie2wwds_3_tfdevgencod_to = AV56TFDevGenCod_To ;
      AV95Tdevpie2wwds_4_tfdevgenfec = AV57TFDevGenFec ;
      AV96Tdevpie2wwds_5_tfalbreccod = AV59TFAlbRecCod ;
      AV97Tdevpie2wwds_6_tfalbreccod_to = AV60TFAlbRecCod_To ;
      AV98Tdevpie2wwds_7_tfdevgendom = AV61TFDevGenDom ;
      AV99Tdevpie2wwds_8_tfdevgendom_to = AV62TFDevGenDom_To ;
      AV100Tdevpie2wwds_9_tfclicod = AV63TFCliCod ;
      AV101Tdevpie2wwds_10_tfclicod_to = AV64TFCliCod_To ;
      AV102Tdevpie2wwds_11_tfclinom = AV65TFCliNom ;
      AV103Tdevpie2wwds_12_tfclinom_sel = AV66TFCliNom_Sel ;
      AV104Tdevpie2wwds_13_tfalbref = AV67TFAlbRef ;
      AV105Tdevpie2wwds_14_tfalbref_sel = AV68TFAlbRef_Sel ;
      AV106Tdevpie2wwds_15_tfdevgentrn = AV69TFDevGenTrn ;
      AV107Tdevpie2wwds_16_tfdevgentrn_to = AV70TFDevGenTrn_To ;
      AV108Tdevpie2wwds_17_tfdevtrnnom = AV71TFDevTrnNom ;
      AV109Tdevpie2wwds_18_tfdevtrnnom_sel = AV72TFDevTrnNom_Sel ;
      AV110Tdevpie2wwds_19_tfalbrunidis = AV73TFAlbRUniDis ;
      AV111Tdevpie2wwds_20_tfalbrunidis_to = AV74TFAlbRUniDis_To ;
      AV112Tdevpie2wwds_21_tfalbrpiedis = AV75TFAlbRPieDis ;
      AV113Tdevpie2wwds_22_tfalbrpiedis_to = AV76TFAlbRPieDis_To ;
      AV114Tdevpie2wwds_23_tfalbruni_sels = AV86TFAlbRUni_Sels ;
      AV115Tdevpie2wwds_24_tfdevgenuni = AV79TFDevGenUni ;
      AV116Tdevpie2wwds_25_tfdevgenuni_to = AV80TFDevGenUni_To ;
      AV117Tdevpie2wwds_26_tfdevgenpie = AV81TFDevGenPie ;
      AV118Tdevpie2wwds_27_tfdevgenpie_to = AV82TFDevGenPie_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A56AlbRUni ,
                                           AV114Tdevpie2wwds_23_tfalbruni_sels ,
                                           Integer.valueOf(AV93Tdevpie2wwds_2_tfdevgencod) ,
                                           Integer.valueOf(AV94Tdevpie2wwds_3_tfdevgencod_to) ,
                                           AV95Tdevpie2wwds_4_tfdevgenfec ,
                                           Integer.valueOf(AV96Tdevpie2wwds_5_tfalbreccod) ,
                                           Integer.valueOf(AV97Tdevpie2wwds_6_tfalbreccod_to) ,
                                           Byte.valueOf(AV98Tdevpie2wwds_7_tfdevgendom) ,
                                           Byte.valueOf(AV99Tdevpie2wwds_8_tfdevgendom_to) ,
                                           Integer.valueOf(AV100Tdevpie2wwds_9_tfclicod) ,
                                           Integer.valueOf(AV101Tdevpie2wwds_10_tfclicod_to) ,
                                           AV103Tdevpie2wwds_12_tfclinom_sel ,
                                           AV102Tdevpie2wwds_11_tfclinom ,
                                           AV105Tdevpie2wwds_14_tfalbref_sel ,
                                           AV104Tdevpie2wwds_13_tfalbref ,
                                           Short.valueOf(AV106Tdevpie2wwds_15_tfdevgentrn) ,
                                           Short.valueOf(AV107Tdevpie2wwds_16_tfdevgentrn_to) ,
                                           AV109Tdevpie2wwds_18_tfdevtrnnom_sel ,
                                           AV108Tdevpie2wwds_17_tfdevtrnnom ,
                                           AV110Tdevpie2wwds_19_tfalbrunidis ,
                                           AV111Tdevpie2wwds_20_tfalbrunidis_to ,
                                           Integer.valueOf(AV112Tdevpie2wwds_21_tfalbrpiedis) ,
                                           Integer.valueOf(AV113Tdevpie2wwds_22_tfalbrpiedis_to) ,
                                           Integer.valueOf(AV114Tdevpie2wwds_23_tfalbruni_sels.size()) ,
                                           AV115Tdevpie2wwds_24_tfdevgenuni ,
                                           AV116Tdevpie2wwds_25_tfdevgenuni_to ,
                                           Short.valueOf(AV117Tdevpie2wwds_26_tfdevgenpie) ,
                                           Short.valueOf(AV118Tdevpie2wwds_27_tfdevgenpie_to) ,
                                           Integer.valueOf(A323DevGenCod) ,
                                           A325DevGenFec ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           Byte.valueOf(A6288DevGenDom) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A45AlbRef ,
                                           Short.valueOf(A327DevGenTrn) ,
                                           A329DevTrnNom ,
                                           A58AlbRUniEnt ,
                                           A60AlbRUniUti ,
                                           Integer.valueOf(A52AlbRPieEnt) ,
                                           Integer.valueOf(A54AlbRPieUti) ,
                                           A328DevGenUni ,
                                           Short.valueOf(A326DevGenPie) ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV92Tdevpie2wwds_1_filterfulltext ,
                                           A57AlbRUniDis ,
                                           Integer.valueOf(A51AlbRPieDis) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.INT
                                           }
      });
      lV102Tdevpie2wwds_11_tfclinom = GXutil.padr( GXutil.rtrim( AV102Tdevpie2wwds_11_tfclinom), 30, "%") ;
      lV104Tdevpie2wwds_13_tfalbref = GXutil.padr( GXutil.rtrim( AV104Tdevpie2wwds_13_tfalbref), 16, "%") ;
      lV108Tdevpie2wwds_17_tfdevtrnnom = GXutil.padr( GXutil.rtrim( AV108Tdevpie2wwds_17_tfdevtrnnom), 30, "%") ;
      /* Using cursor P086O2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV93Tdevpie2wwds_2_tfdevgencod), Integer.valueOf(AV94Tdevpie2wwds_3_tfdevgencod_to), AV95Tdevpie2wwds_4_tfdevgenfec, Integer.valueOf(AV96Tdevpie2wwds_5_tfalbreccod), Integer.valueOf(AV97Tdevpie2wwds_6_tfalbreccod_to), Byte.valueOf(AV98Tdevpie2wwds_7_tfdevgendom), Byte.valueOf(AV99Tdevpie2wwds_8_tfdevgendom_to), Integer.valueOf(AV100Tdevpie2wwds_9_tfclicod), Integer.valueOf(AV101Tdevpie2wwds_10_tfclicod_to), lV102Tdevpie2wwds_11_tfclinom, AV103Tdevpie2wwds_12_tfclinom_sel, lV104Tdevpie2wwds_13_tfalbref, AV105Tdevpie2wwds_14_tfalbref_sel, Short.valueOf(AV106Tdevpie2wwds_15_tfdevgentrn), Short.valueOf(AV107Tdevpie2wwds_16_tfdevgentrn_to), lV108Tdevpie2wwds_17_tfdevtrnnom, AV109Tdevpie2wwds_18_tfdevtrnnom_sel, AV110Tdevpie2wwds_19_tfalbrunidis, AV111Tdevpie2wwds_20_tfalbrunidis_to, Integer.valueOf(AV112Tdevpie2wwds_21_tfalbrpiedis), Integer.valueOf(AV113Tdevpie2wwds_22_tfalbrpiedis_to), AV115Tdevpie2wwds_24_tfdevgenuni, AV116Tdevpie2wwds_25_tfdevgenuni_to, Short.valueOf(AV117Tdevpie2wwds_26_tfdevgenpie), Short.valueOf(AV118Tdevpie2wwds_27_tfdevgenpie_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P086O2_A396EmprCod[0] ;
         A326DevGenPie = P086O2_A326DevGenPie[0] ;
         n326DevGenPie = P086O2_n326DevGenPie[0] ;
         A328DevGenUni = P086O2_A328DevGenUni[0] ;
         n328DevGenUni = P086O2_n328DevGenUni[0] ;
         A51AlbRPieDis = P086O2_A51AlbRPieDis[0] ;
         A57AlbRUniDis = P086O2_A57AlbRUniDis[0] ;
         A329DevTrnNom = P086O2_A329DevTrnNom[0] ;
         n329DevTrnNom = P086O2_n329DevTrnNom[0] ;
         A327DevGenTrn = P086O2_A327DevGenTrn[0] ;
         n327DevGenTrn = P086O2_n327DevGenTrn[0] ;
         A45AlbRef = P086O2_A45AlbRef[0] ;
         A279CliNom = P086O2_A279CliNom[0] ;
         A252CliCod = P086O2_A252CliCod[0] ;
         n252CliCod = P086O2_n252CliCod[0] ;
         A6288DevGenDom = P086O2_A6288DevGenDom[0] ;
         n6288DevGenDom = P086O2_n6288DevGenDom[0] ;
         A44AlbRecCod = P086O2_A44AlbRecCod[0] ;
         n44AlbRecCod = P086O2_n44AlbRecCod[0] ;
         A325DevGenFec = P086O2_A325DevGenFec[0] ;
         n325DevGenFec = P086O2_n325DevGenFec[0] ;
         A323DevGenCod = P086O2_A323DevGenCod[0] ;
         A56AlbRUni = P086O2_A56AlbRUni[0] ;
         A52AlbRPieEnt = P086O2_A52AlbRPieEnt[0] ;
         A54AlbRPieUti = P086O2_A54AlbRPieUti[0] ;
         A58AlbRUniEnt = P086O2_A58AlbRUniEnt[0] ;
         A60AlbRUniUti = P086O2_A60AlbRUniUti[0] ;
         A329DevTrnNom = P086O2_A329DevTrnNom[0] ;
         n329DevTrnNom = P086O2_n329DevTrnNom[0] ;
         A279CliNom = P086O2_A279CliNom[0] ;
         A51AlbRPieDis = P086O2_A51AlbRPieDis[0] ;
         A57AlbRUniDis = P086O2_A57AlbRUniDis[0] ;
         A45AlbRef = P086O2_A45AlbRef[0] ;
         A56AlbRUni = P086O2_A56AlbRUni[0] ;
         A52AlbRPieEnt = P086O2_A52AlbRPieEnt[0] ;
         A54AlbRPieUti = P086O2_A54AlbRPieUti[0] ;
         A58AlbRUniEnt = P086O2_A58AlbRUniEnt[0] ;
         A60AlbRUniUti = P086O2_A60AlbRUniUti[0] ;
         if ( (GXutil.strcmp("", AV92Tdevpie2wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A323DevGenCod, 8, 0) , GXutil.padr( "%" + AV92Tdevpie2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A44AlbRecCod, 8, 0) , GXutil.padr( "%" + AV92Tdevpie2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A6288DevGenDom, 1, 0) , GXutil.padr( "%" + AV92Tdevpie2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV92Tdevpie2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV92Tdevpie2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A45AlbRef) , GXutil.padr( "%" + GXutil.upper( AV92Tdevpie2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A327DevGenTrn, 4, 0) , GXutil.padr( "%" + AV92Tdevpie2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A329DevTrnNom) , GXutil.padr( "%" + GXutil.upper( AV92Tdevpie2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A57AlbRUniDis, 9, 2) , GXutil.padr( "%" + AV92Tdevpie2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A51AlbRPieDis, 6, 0) , GXutil.padr( "%" + AV92Tdevpie2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "k", ""), "") , GXutil.padr( "%" + GXutil.lower( AV92Tdevpie2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "m", ""), "") , GXutil.padr( "%" + GXutil.lower( AV92Tdevpie2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A328DevGenUni, 9, 2) , GXutil.padr( "%" + AV92Tdevpie2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A326DevGenPie, 4, 0) , GXutil.padr( "%" + AV92Tdevpie2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
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
               returnInSub = true;
               if (true) return;
            }
            AV52VisibleColumnCount = 0 ;
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV44ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV52VisibleColumnCount), 1, 1).setNumber( A323DevGenCod );
               AV52VisibleColumnCount = (long)(AV52VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV44ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_dtime6 = GXutil.resetTime( A325DevGenFec );
               AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV52VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
               AV52VisibleColumnCount = (long)(AV52VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV44ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV52VisibleColumnCount), 1, 1).setNumber( A44AlbRecCod );
               AV52VisibleColumnCount = (long)(AV52VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV44ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV52VisibleColumnCount), 1, 1).setNumber( A6288DevGenDom );
               AV52VisibleColumnCount = (long)(AV52VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV44ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV52VisibleColumnCount), 1, 1).setNumber( A252CliCod );
               AV52VisibleColumnCount = (long)(AV52VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV44ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A279CliNom, GXv_char5) ;
               tdevpie2wwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV52VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV52VisibleColumnCount = (long)(AV52VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV44ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A45AlbRef, GXv_char5) ;
               tdevpie2wwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV52VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV52VisibleColumnCount = (long)(AV52VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV44ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV52VisibleColumnCount), 1, 1).setNumber( A327DevGenTrn );
               AV52VisibleColumnCount = (long)(AV52VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV44ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A329DevTrnNom, GXv_char5) ;
               tdevpie2wwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV52VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV52VisibleColumnCount = (long)(AV52VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV44ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV52VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A57AlbRUniDis)) );
               AV52VisibleColumnCount = (long)(AV52VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV44ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV52VisibleColumnCount), 1, 1).setNumber( A51AlbRPieDis );
               AV52VisibleColumnCount = (long)(AV52VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV44ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV52VisibleColumnCount), 1, 1).setText( "" );
               if ( GXutil.strcmp(GXutil.trim( A56AlbRUni), httpContext.getMessage( "K", "")) == 0 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV52VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "K", "") );
               }
               else if ( GXutil.strcmp(GXutil.trim( A56AlbRUni), httpContext.getMessage( "M", "")) == 0 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV52VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "M", "") );
               }
               AV52VisibleColumnCount = (long)(AV52VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV44ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV52VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A328DevGenUni)) );
               AV52VisibleColumnCount = (long)(AV52VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV44ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV52VisibleColumnCount), 1, 1).setNumber( A326DevGenPie );
               AV52VisibleColumnCount = (long)(AV52VisibleColumnCount+1) ;
            }
            /* Execute user subroutine: 'AFTERWRITELINE' */
            S182 ();
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
      AV44ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7[0] = AV44ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "DevGenCod", "", "N Devolucion ID", true, "") ;
      AV44ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV44ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "DevGenFec", "", "Fecha de Devolucion", true, "") ;
      AV44ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV44ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbRecCod", "", "N Recepcion", true, "") ;
      AV44ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV44ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "DevGenDom", "", "Domicilio Envio", true, "") ;
      AV44ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV44ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CliCod", "", "Cliente", true, "") ;
      AV44ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV44ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CliNom", "", "Nombre Cliente", true, "") ;
      AV44ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV44ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbRef", "", "Cdg.Ref.", true, "") ;
      AV44ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV44ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "DevGenTrn", "", "Transportista", true, "") ;
      AV44ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV44ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "DevTrnNom", "", "Nombre", true, "") ;
      AV44ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV44ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbRUniDis", "", "Und.Disp.", true, "") ;
      AV44ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV44ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbRPieDis", "", "Piezas Disponibles", true, "") ;
      AV44ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV44ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbRUni", "", "Unidad", true, "") ;
      AV44ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV44ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "DevGenUni", "", "Unidades Dev", true, "") ;
      AV44ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV44ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "DevGenPie", "", "Piezas Dev", true, "") ;
      AV44ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXt_char4 = AV48UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TDevPie2WWColumnsSelector", GXv_char5) ;
      tdevpie2wwexport.this.GXt_char4 = GXv_char5[0] ;
      AV48UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV48UserCustomValue)==0) ) )
      {
         AV45ColumnsSelectorAux.fromxml(AV48UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector7[0] = AV45ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector8[0] = AV44ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, GXv_SdtWWPColumnsSelector8) ;
         AV45ColumnsSelectorAux = GXv_SdtWWPColumnsSelector7[0] ;
         AV44ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV40Session.getValue("TDevPie2WWGridState"), "") == 0 )
      {
         AV42GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TDevPie2WWGridState"), null, null);
      }
      else
      {
         AV42GridState.fromxml(AV40Session.getValue("TDevPie2WWGridState"), null, null);
      }
      AV16OrderedBy = AV42GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV42GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV119GXV3 = 1 ;
      while ( AV119GXV3 <= AV42GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV43GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV42GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV119GXV3));
         if ( GXutil.strcmp(AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV84FilterFullText = AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVGENCOD") == 0 )
         {
            AV55TFDevGenCod = (int)(GXutil.lval( AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV56TFDevGenCod_To = (int)(GXutil.lval( AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVGENFEC") == 0 )
         {
            AV57TFDevGenFec = localUtil.ctod( AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRECCOD") == 0 )
         {
            AV59TFAlbRecCod = (int)(GXutil.lval( AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV60TFAlbRecCod_To = (int)(GXutil.lval( AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVGENDOM") == 0 )
         {
            AV61TFDevGenDom = (byte)(GXutil.lval( AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV62TFDevGenDom_To = (byte)(GXutil.lval( AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV63TFCliCod = (int)(GXutil.lval( AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV64TFCliCod_To = (int)(GXutil.lval( AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV65TFCliNom = AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV66TFCliNom_Sel = AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF") == 0 )
         {
            AV67TFAlbRef = AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF_SEL") == 0 )
         {
            AV68TFAlbRef_Sel = AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVGENTRN") == 0 )
         {
            AV69TFDevGenTrn = (short)(GXutil.lval( AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV70TFDevGenTrn_To = (short)(GXutil.lval( AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVTRNNOM") == 0 )
         {
            AV71TFDevTrnNom = AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVTRNNOM_SEL") == 0 )
         {
            AV72TFDevTrnNom_Sel = AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNIDIS") == 0 )
         {
            AV73TFAlbRUniDis = CommonUtil.decimalVal( AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV74TFAlbRUniDis_To = CommonUtil.decimalVal( AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRPIEDIS") == 0 )
         {
            AV75TFAlbRPieDis = (int)(GXutil.lval( AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV76TFAlbRPieDis_To = (int)(GXutil.lval( AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNI_SEL") == 0 )
         {
            AV85TFAlbRUni_SelsJson = AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV86TFAlbRUni_Sels.fromJSonString(AV85TFAlbRUni_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVGENUNI") == 0 )
         {
            AV79TFDevGenUni = CommonUtil.decimalVal( AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV80TFDevGenUni_To = CommonUtil.decimalVal( AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVGENPIE") == 0 )
         {
            AV81TFDevGenPie = (short)(GXutil.lval( AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV82TFDevGenPie_To = (short)(GXutil.lval( AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         AV119GXV3 = (int)(AV119GXV3+1) ;
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
      this.aP0[0] = tdevpie2wwexport.this.AV11Filename;
      this.aP1[0] = tdevpie2wwexport.this.AV12ErrorMessage;
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
      AV84FilterFullText = "" ;
      AV57TFDevGenFec = GXutil.nullDate() ;
      AV66TFCliNom_Sel = "" ;
      AV65TFCliNom = "" ;
      AV68TFAlbRef_Sel = "" ;
      AV67TFAlbRef = "" ;
      AV72TFDevTrnNom_Sel = "" ;
      AV71TFDevTrnNom = "" ;
      AV73TFAlbRUniDis = DecimalUtil.ZERO ;
      AV74TFAlbRUniDis_To = DecimalUtil.ZERO ;
      AV86TFAlbRUni_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV78TFAlbRUni_Sel = "" ;
      AV79TFDevGenUni = DecimalUtil.ZERO ;
      AV80TFDevGenUni_To = DecimalUtil.ZERO ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV40Session = httpContext.getWebSession();
      AV47ColumnsSelectorXML = "" ;
      AV44ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV46ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A325DevGenFec = GXutil.nullDate() ;
      A279CliNom = "" ;
      A45AlbRef = "" ;
      A329DevTrnNom = "" ;
      A57AlbRUniDis = DecimalUtil.ZERO ;
      A56AlbRUni = "" ;
      A328DevGenUni = DecimalUtil.ZERO ;
      AV92Tdevpie2wwds_1_filterfulltext = "" ;
      AV95Tdevpie2wwds_4_tfdevgenfec = GXutil.nullDate() ;
      AV102Tdevpie2wwds_11_tfclinom = "" ;
      AV103Tdevpie2wwds_12_tfclinom_sel = "" ;
      AV104Tdevpie2wwds_13_tfalbref = "" ;
      AV105Tdevpie2wwds_14_tfalbref_sel = "" ;
      AV108Tdevpie2wwds_17_tfdevtrnnom = "" ;
      AV109Tdevpie2wwds_18_tfdevtrnnom_sel = "" ;
      AV110Tdevpie2wwds_19_tfalbrunidis = DecimalUtil.ZERO ;
      AV111Tdevpie2wwds_20_tfalbrunidis_to = DecimalUtil.ZERO ;
      AV114Tdevpie2wwds_23_tfalbruni_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV115Tdevpie2wwds_24_tfdevgenuni = DecimalUtil.ZERO ;
      AV116Tdevpie2wwds_25_tfdevgenuni_to = DecimalUtil.ZERO ;
      lV92Tdevpie2wwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV102Tdevpie2wwds_11_tfclinom = "" ;
      lV104Tdevpie2wwds_13_tfalbref = "" ;
      lV108Tdevpie2wwds_17_tfdevtrnnom = "" ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      P086O2_A396EmprCod = new String[] {""} ;
      P086O2_A326DevGenPie = new short[1] ;
      P086O2_n326DevGenPie = new boolean[] {false} ;
      P086O2_A328DevGenUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P086O2_n328DevGenUni = new boolean[] {false} ;
      P086O2_A51AlbRPieDis = new int[1] ;
      P086O2_A57AlbRUniDis = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P086O2_A329DevTrnNom = new String[] {""} ;
      P086O2_n329DevTrnNom = new boolean[] {false} ;
      P086O2_A327DevGenTrn = new short[1] ;
      P086O2_n327DevGenTrn = new boolean[] {false} ;
      P086O2_A45AlbRef = new String[] {""} ;
      P086O2_A279CliNom = new String[] {""} ;
      P086O2_A252CliCod = new int[1] ;
      P086O2_n252CliCod = new boolean[] {false} ;
      P086O2_A6288DevGenDom = new byte[1] ;
      P086O2_n6288DevGenDom = new boolean[] {false} ;
      P086O2_A44AlbRecCod = new int[1] ;
      P086O2_n44AlbRecCod = new boolean[] {false} ;
      P086O2_A325DevGenFec = new java.util.Date[] {GXutil.nullDate()} ;
      P086O2_n325DevGenFec = new boolean[] {false} ;
      P086O2_A323DevGenCod = new int[1] ;
      P086O2_A56AlbRUni = new String[] {""} ;
      P086O2_A52AlbRPieEnt = new int[1] ;
      P086O2_A54AlbRPieUti = new int[1] ;
      P086O2_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P086O2_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A396EmprCod = "" ;
      GXt_dtime6 = GXutil.resetTime( GXutil.nullDate() );
      AV48UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV45ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV42GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV43GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV85TFAlbRUni_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tdevpie2wwexport__default(),
         new Object[] {
             new Object[] {
            P086O2_A396EmprCod, P086O2_A326DevGenPie, P086O2_n326DevGenPie, P086O2_A328DevGenUni, P086O2_n328DevGenUni, P086O2_A51AlbRPieDis, P086O2_A57AlbRUniDis, P086O2_A329DevTrnNom, P086O2_n329DevTrnNom, P086O2_A327DevGenTrn,
            P086O2_n327DevGenTrn, P086O2_A45AlbRef, P086O2_A279CliNom, P086O2_A252CliCod, P086O2_n252CliCod, P086O2_A6288DevGenDom, P086O2_n6288DevGenDom, P086O2_A44AlbRecCod, P086O2_n44AlbRecCod, P086O2_A325DevGenFec,
            P086O2_n325DevGenFec, P086O2_A323DevGenCod, P086O2_A56AlbRUni, P086O2_A52AlbRPieEnt, P086O2_A54AlbRPieUti, P086O2_A58AlbRUniEnt, P086O2_A60AlbRUniUti
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV61TFDevGenDom ;
   private byte AV62TFDevGenDom_To ;
   private byte A6288DevGenDom ;
   private byte AV98Tdevpie2wwds_7_tfdevgendom ;
   private byte AV99Tdevpie2wwds_8_tfdevgendom_to ;
   private short AV69TFDevGenTrn ;
   private short AV70TFDevGenTrn_To ;
   private short AV81TFDevGenPie ;
   private short AV82TFDevGenPie_To ;
   private short GXv_int3[] ;
   private short A327DevGenTrn ;
   private short A326DevGenPie ;
   private short AV106Tdevpie2wwds_15_tfdevgentrn ;
   private short AV107Tdevpie2wwds_16_tfdevgentrn_to ;
   private short AV117Tdevpie2wwds_26_tfdevgenpie ;
   private short AV118Tdevpie2wwds_27_tfdevgenpie_to ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV55TFDevGenCod ;
   private int AV56TFDevGenCod_To ;
   private int AV59TFAlbRecCod ;
   private int AV60TFAlbRecCod_To ;
   private int AV63TFCliCod ;
   private int AV64TFCliCod_To ;
   private int AV75TFAlbRPieDis ;
   private int AV76TFAlbRPieDis_To ;
   private int AV89GXV1 ;
   private int AV90GXV2 ;
   private int A323DevGenCod ;
   private int A44AlbRecCod ;
   private int A252CliCod ;
   private int A51AlbRPieDis ;
   private int AV93Tdevpie2wwds_2_tfdevgencod ;
   private int AV94Tdevpie2wwds_3_tfdevgencod_to ;
   private int AV96Tdevpie2wwds_5_tfalbreccod ;
   private int AV97Tdevpie2wwds_6_tfalbreccod_to ;
   private int AV100Tdevpie2wwds_9_tfclicod ;
   private int AV101Tdevpie2wwds_10_tfclicod_to ;
   private int AV112Tdevpie2wwds_21_tfalbrpiedis ;
   private int AV113Tdevpie2wwds_22_tfalbrpiedis_to ;
   private int AV114Tdevpie2wwds_23_tfalbruni_sels_size ;
   private int A52AlbRPieEnt ;
   private int A54AlbRPieUti ;
   private int AV119GXV3 ;
   private long AV83i ;
   private long AV52VisibleColumnCount ;
   private java.math.BigDecimal AV73TFAlbRUniDis ;
   private java.math.BigDecimal AV74TFAlbRUniDis_To ;
   private java.math.BigDecimal AV79TFDevGenUni ;
   private java.math.BigDecimal AV80TFDevGenUni_To ;
   private java.math.BigDecimal A57AlbRUniDis ;
   private java.math.BigDecimal A328DevGenUni ;
   private java.math.BigDecimal AV110Tdevpie2wwds_19_tfalbrunidis ;
   private java.math.BigDecimal AV111Tdevpie2wwds_20_tfalbrunidis_to ;
   private java.math.BigDecimal AV115Tdevpie2wwds_24_tfdevgenuni ;
   private java.math.BigDecimal AV116Tdevpie2wwds_25_tfdevgenuni_to ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private String AV66TFCliNom_Sel ;
   private String AV65TFCliNom ;
   private String AV68TFAlbRef_Sel ;
   private String AV67TFAlbRef ;
   private String AV72TFDevTrnNom_Sel ;
   private String AV71TFDevTrnNom ;
   private String AV78TFAlbRUni_Sel ;
   private String A279CliNom ;
   private String A45AlbRef ;
   private String A329DevTrnNom ;
   private String A56AlbRUni ;
   private String AV102Tdevpie2wwds_11_tfclinom ;
   private String AV103Tdevpie2wwds_12_tfclinom_sel ;
   private String AV104Tdevpie2wwds_13_tfalbref ;
   private String AV105Tdevpie2wwds_14_tfalbref_sel ;
   private String AV108Tdevpie2wwds_17_tfdevtrnnom ;
   private String AV109Tdevpie2wwds_18_tfdevtrnnom_sel ;
   private String scmdbuf ;
   private String lV102Tdevpie2wwds_11_tfclinom ;
   private String lV104Tdevpie2wwds_13_tfalbref ;
   private String lV108Tdevpie2wwds_17_tfdevtrnnom ;
   private String A396EmprCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date GXt_dtime6 ;
   private java.util.Date AV57TFDevGenFec ;
   private java.util.Date A325DevGenFec ;
   private java.util.Date AV95Tdevpie2wwds_4_tfdevgenfec ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n326DevGenPie ;
   private boolean n328DevGenUni ;
   private boolean n329DevTrnNom ;
   private boolean n327DevGenTrn ;
   private boolean n252CliCod ;
   private boolean n6288DevGenDom ;
   private boolean n44AlbRecCod ;
   private boolean n325DevGenFec ;
   private String AV47ColumnsSelectorXML ;
   private String AV48UserCustomValue ;
   private String AV85TFAlbRUni_SelsJson ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV84FilterFullText ;
   private String AV92Tdevpie2wwds_1_filterfulltext ;
   private String lV92Tdevpie2wwds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV40Session ;
   private GXSimpleCollection<String> AV86TFAlbRUni_Sels ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P086O2_A396EmprCod ;
   private short[] P086O2_A326DevGenPie ;
   private boolean[] P086O2_n326DevGenPie ;
   private java.math.BigDecimal[] P086O2_A328DevGenUni ;
   private boolean[] P086O2_n328DevGenUni ;
   private int[] P086O2_A51AlbRPieDis ;
   private java.math.BigDecimal[] P086O2_A57AlbRUniDis ;
   private String[] P086O2_A329DevTrnNom ;
   private boolean[] P086O2_n329DevTrnNom ;
   private short[] P086O2_A327DevGenTrn ;
   private boolean[] P086O2_n327DevGenTrn ;
   private String[] P086O2_A45AlbRef ;
   private String[] P086O2_A279CliNom ;
   private int[] P086O2_A252CliCod ;
   private boolean[] P086O2_n252CliCod ;
   private byte[] P086O2_A6288DevGenDom ;
   private boolean[] P086O2_n6288DevGenDom ;
   private int[] P086O2_A44AlbRecCod ;
   private boolean[] P086O2_n44AlbRecCod ;
   private java.util.Date[] P086O2_A325DevGenFec ;
   private boolean[] P086O2_n325DevGenFec ;
   private int[] P086O2_A323DevGenCod ;
   private String[] P086O2_A56AlbRUni ;
   private int[] P086O2_A52AlbRPieEnt ;
   private int[] P086O2_A54AlbRPieUti ;
   private java.math.BigDecimal[] P086O2_A58AlbRUniEnt ;
   private java.math.BigDecimal[] P086O2_A60AlbRUniUti ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private GXSimpleCollection<String> AV114Tdevpie2wwds_23_tfalbruni_sels ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV42GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV43GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV44ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV45ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV46ColumnsSelector_Column ;
}

final  class tdevpie2wwexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P086O2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV114Tdevpie2wwds_23_tfalbruni_sels ,
                                          int AV93Tdevpie2wwds_2_tfdevgencod ,
                                          int AV94Tdevpie2wwds_3_tfdevgencod_to ,
                                          java.util.Date AV95Tdevpie2wwds_4_tfdevgenfec ,
                                          int AV96Tdevpie2wwds_5_tfalbreccod ,
                                          int AV97Tdevpie2wwds_6_tfalbreccod_to ,
                                          byte AV98Tdevpie2wwds_7_tfdevgendom ,
                                          byte AV99Tdevpie2wwds_8_tfdevgendom_to ,
                                          int AV100Tdevpie2wwds_9_tfclicod ,
                                          int AV101Tdevpie2wwds_10_tfclicod_to ,
                                          String AV103Tdevpie2wwds_12_tfclinom_sel ,
                                          String AV102Tdevpie2wwds_11_tfclinom ,
                                          String AV105Tdevpie2wwds_14_tfalbref_sel ,
                                          String AV104Tdevpie2wwds_13_tfalbref ,
                                          short AV106Tdevpie2wwds_15_tfdevgentrn ,
                                          short AV107Tdevpie2wwds_16_tfdevgentrn_to ,
                                          String AV109Tdevpie2wwds_18_tfdevtrnnom_sel ,
                                          String AV108Tdevpie2wwds_17_tfdevtrnnom ,
                                          java.math.BigDecimal AV110Tdevpie2wwds_19_tfalbrunidis ,
                                          java.math.BigDecimal AV111Tdevpie2wwds_20_tfalbrunidis_to ,
                                          int AV112Tdevpie2wwds_21_tfalbrpiedis ,
                                          int AV113Tdevpie2wwds_22_tfalbrpiedis_to ,
                                          int AV114Tdevpie2wwds_23_tfalbruni_sels_size ,
                                          java.math.BigDecimal AV115Tdevpie2wwds_24_tfdevgenuni ,
                                          java.math.BigDecimal AV116Tdevpie2wwds_25_tfdevgenuni_to ,
                                          short AV117Tdevpie2wwds_26_tfdevgenpie ,
                                          short AV118Tdevpie2wwds_27_tfdevgenpie_to ,
                                          int A323DevGenCod ,
                                          java.util.Date A325DevGenFec ,
                                          int A44AlbRecCod ,
                                          byte A6288DevGenDom ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A45AlbRef ,
                                          short A327DevGenTrn ,
                                          String A329DevTrnNom ,
                                          java.math.BigDecimal A58AlbRUniEnt ,
                                          java.math.BigDecimal A60AlbRUniUti ,
                                          int A52AlbRPieEnt ,
                                          int A54AlbRPieUti ,
                                          java.math.BigDecimal A328DevGenUni ,
                                          short A326DevGenPie ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV92Tdevpie2wwds_1_filterfulltext ,
                                          java.math.BigDecimal A57AlbRUniDis ,
                                          int A51AlbRPieDis )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[25];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.DevGenPie, T1.DevGenUni, COALESCE( T4.AlbRPieEnt, 0) - COALESCE( T4.AlbRPieUti, 0) AS AlbRPieDis, CASE  WHEN ( COALESCE( T4.AlbRUniEnt, 0)" ;
      scmdbuf += " - COALESCE( T4.AlbRUniUti, 0)) >= 0 THEN COALESCE( T4.AlbRUniEnt, 0) - COALESCE( T4.AlbRUniUti, 0) WHEN ( COALESCE( T4.AlbRUniEnt, 0) - COALESCE( T4.AlbRUniUti," ;
      scmdbuf += " 0)) < 0 THEN 0 END AS AlbRUniDis, T2.TrnNom AS DevTrnNom, T1.DevGenTrn AS DevGenTrn, T4.AlbRef, T3.CliNom, T1.CliCod, T1.DevGenDom, T1.AlbRecCod, T1.DevGenFec," ;
      scmdbuf += " T1.DevGenCod, T4.AlbRUni, T4.AlbRPieEnt, T4.AlbRPieUti, T4.AlbRUniEnt, T4.AlbRUniUti FROM (((TXPDEVGEN T1 LEFT JOIN TXPTRANSP T2 ON T2.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T2.TrnCod = T1.DevGenTrn) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod) LEFT JOIN TXPALBREC T4 ON T4.EmprCod = T1.EmprCod AND T4.AlbRecCod" ;
      scmdbuf += " = T1.AlbRecCod)" ;
      if ( ! (0==AV93Tdevpie2wwds_2_tfdevgencod) )
      {
         addWhere(sWhereString, "(T1.DevGenCod >= ?)");
      }
      else
      {
         GXv_int9[0] = (byte)(1) ;
      }
      if ( ! (0==AV94Tdevpie2wwds_3_tfdevgencod_to) )
      {
         addWhere(sWhereString, "(T1.DevGenCod <= ?)");
      }
      else
      {
         GXv_int9[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV95Tdevpie2wwds_4_tfdevgenfec)) )
      {
         addWhere(sWhereString, "(T1.DevGenFec >= ?)");
      }
      else
      {
         GXv_int9[2] = (byte)(1) ;
      }
      if ( ! (0==AV96Tdevpie2wwds_5_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int9[3] = (byte)(1) ;
      }
      if ( ! (0==AV97Tdevpie2wwds_6_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int9[4] = (byte)(1) ;
      }
      if ( ! (0==AV98Tdevpie2wwds_7_tfdevgendom) )
      {
         addWhere(sWhereString, "(T1.DevGenDom >= ?)");
      }
      else
      {
         GXv_int9[5] = (byte)(1) ;
      }
      if ( ! (0==AV99Tdevpie2wwds_8_tfdevgendom_to) )
      {
         addWhere(sWhereString, "(T1.DevGenDom <= ?)");
      }
      else
      {
         GXv_int9[6] = (byte)(1) ;
      }
      if ( ! (0==AV100Tdevpie2wwds_9_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int9[7] = (byte)(1) ;
      }
      if ( ! (0==AV101Tdevpie2wwds_10_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int9[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Tdevpie2wwds_12_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV102Tdevpie2wwds_11_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Tdevpie2wwds_12_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int9[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Tdevpie2wwds_14_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV104Tdevpie2wwds_13_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Tdevpie2wwds_14_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T4.AlbRef = ?)");
      }
      else
      {
         GXv_int9[12] = (byte)(1) ;
      }
      if ( ! (0==AV106Tdevpie2wwds_15_tfdevgentrn) )
      {
         addWhere(sWhereString, "(T1.DevGenTrn >= ?)");
      }
      else
      {
         GXv_int9[13] = (byte)(1) ;
      }
      if ( ! (0==AV107Tdevpie2wwds_16_tfdevgentrn_to) )
      {
         addWhere(sWhereString, "(T1.DevGenTrn <= ?)");
      }
      else
      {
         GXv_int9[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Tdevpie2wwds_18_tfdevtrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV108Tdevpie2wwds_17_tfdevtrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Tdevpie2wwds_18_tfdevtrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TrnNom = ?)");
      }
      else
      {
         GXv_int9[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV110Tdevpie2wwds_19_tfalbrunidis)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T4.AlbRUniEnt - T4.AlbRUniUti) >= 0 THEN T4.AlbRUniEnt - T4.AlbRUniUti WHEN ( T4.AlbRUniEnt - T4.AlbRUniUti) < 0 THEN 0 END) >= ?)");
      }
      else
      {
         GXv_int9[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV111Tdevpie2wwds_20_tfalbrunidis_to)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T4.AlbRUniEnt - T4.AlbRUniUti) >= 0 THEN T4.AlbRUniEnt - T4.AlbRUniUti WHEN ( T4.AlbRUniEnt - T4.AlbRUniUti) < 0 THEN 0 END) <= ?)");
      }
      else
      {
         GXv_int9[18] = (byte)(1) ;
      }
      if ( ! (0==AV112Tdevpie2wwds_21_tfalbrpiedis) )
      {
         addWhere(sWhereString, "(( T4.AlbRPieEnt - T4.AlbRPieUti) >= ?)");
      }
      else
      {
         GXv_int9[19] = (byte)(1) ;
      }
      if ( ! (0==AV113Tdevpie2wwds_22_tfalbrpiedis_to) )
      {
         addWhere(sWhereString, "(( T4.AlbRPieEnt - T4.AlbRPieUti) <= ?)");
      }
      else
      {
         GXv_int9[20] = (byte)(1) ;
      }
      if ( AV114Tdevpie2wwds_23_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV114Tdevpie2wwds_23_tfalbruni_sels, "T4.AlbRUni IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV115Tdevpie2wwds_24_tfdevgenuni)==0) )
      {
         addWhere(sWhereString, "(T1.DevGenUni >= ?)");
      }
      else
      {
         GXv_int9[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV116Tdevpie2wwds_25_tfdevgenuni_to)==0) )
      {
         addWhere(sWhereString, "(T1.DevGenUni <= ?)");
      }
      else
      {
         GXv_int9[22] = (byte)(1) ;
      }
      if ( ! (0==AV117Tdevpie2wwds_26_tfdevgenpie) )
      {
         addWhere(sWhereString, "(T1.DevGenPie >= ?)");
      }
      else
      {
         GXv_int9[23] = (byte)(1) ;
      }
      if ( ! (0==AV118Tdevpie2wwds_27_tfdevgenpie_to) )
      {
         addWhere(sWhereString, "(T1.DevGenPie <= ?)");
      }
      else
      {
         GXv_int9[24] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DevGenFec" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DevGenFec DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DevGenCod" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DevGenCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRecCod" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRecCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DevGenDom" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DevGenDom DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.AlbRef" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.AlbRef DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DevGenTrn" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DevGenTrn DESC" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.TrnNom" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.TrnNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.AlbRUni" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.AlbRUni DESC" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DevGenUni" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DevGenUni DESC" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DevGenPie" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DevGenPie DESC" ;
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
                  return conditional_P086O2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (java.util.Date)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).byteValue() , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).shortValue() , ((Number) dynConstraints[16]).shortValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).intValue() , (java.util.Date)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).byteValue() , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).shortValue() , (String)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).intValue() , (java.math.BigDecimal)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , ((Number) dynConstraints[43]).shortValue() , ((Boolean) dynConstraints[44]).booleanValue() , (String)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , ((Number) dynConstraints[47]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P086O2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[7])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 16);
               ((String[]) buf[12])[0] = rslt.getString(9, 30);
               ((int[]) buf[13])[0] = rslt.getInt(10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(11);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(12);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(13);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((int[]) buf[21])[0] = rslt.getInt(14);
               ((String[]) buf[22])[0] = rslt.getString(15, 1);
               ((int[]) buf[23])[0] = rslt.getInt(16);
               ((int[]) buf[24])[0] = rslt.getInt(17);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(18,2);
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(19,2);
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
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[27]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[30]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[31]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[38]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[39]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[48]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[49]).shortValue());
               }
               return;
      }
   }

}

