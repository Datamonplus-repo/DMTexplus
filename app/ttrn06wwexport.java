package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ttrn06wwexport extends GXProcedure
{
   public ttrn06wwexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttrn06wwexport.class ), "" );
   }

   public ttrn06wwexport( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      ttrn06wwexport.this.aP1 = new String[] {""};
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
      ttrn06wwexport.this.aP0 = aP0;
      ttrn06wwexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "TTrn06WWExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setText( "" );
      if ( GXutil.strcmp(GXutil.trim( AV52AlbProPri), "1") == 0 )
      {
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setText( httpContext.getMessage( "Guia Remessa", "") );
      }
      else if ( GXutil.strcmp(GXutil.trim( AV52AlbProPri), "0") == 0 )
      {
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setText( httpContext.getMessage( "Guia Transporte Sem Encargos", "") );
      }
      GXt_dtime2 = GXutil.resetTime( AV18AlbProFch );
      AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setDate( GXt_dtime2 );
      GXv_exceldoc3[0] = AV10ExcelDocument ;
      GXv_int4[0] = (short)(AV13CellRow) ;
      new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, false, GXv_int4, (short)(AV14FirstColumn+1), httpContext.getMessage( "WWP_MiddleText", "")) ;
      AV10ExcelDocument = GXv_exceldoc3[0] ;
      ttrn06wwexport.this.AV13CellRow = GXv_int4[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+2, 1, 1).setItalic( (short)(1) );
      GXt_dtime2 = GXutil.resetTime( AV19AlbProFch_To );
      AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+2, 1, 1).setDate( GXt_dtime2 );
      GXv_exceldoc3[0] = AV10ExcelDocument ;
      GXv_int4[0] = (short)(AV13CellRow) ;
      new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, true, GXv_int4, (short)(AV14FirstColumn), httpContext.getMessage( "Filter", "")) ;
      AV10ExcelDocument = GXv_exceldoc3[0] ;
      ttrn06wwexport.this.AV13CellRow = GXv_int4[0] ;
      GXt_char5 = "" ;
      GXv_char6[0] = GXt_char5 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV67FilterFullText, GXv_char6) ;
      ttrn06wwexport.this.GXt_char5 = GXv_char6[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char5 );
      if ( ! ( (0==AV35TFAlbProCod) && (0==AV36TFAlbProCod_To) ) )
      {
         GXv_exceldoc3[0] = AV10ExcelDocument ;
         GXv_int4[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, true, GXv_int4, (short)(AV14FirstColumn), httpContext.getMessage( "Nº Guia", "")) ;
         AV10ExcelDocument = GXv_exceldoc3[0] ;
         ttrn06wwexport.this.AV13CellRow = GXv_int4[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV35TFAlbProCod );
         GXv_exceldoc3[0] = AV10ExcelDocument ;
         GXv_int4[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, false, GXv_int4, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc3[0] ;
         ttrn06wwexport.this.AV13CellRow = GXv_int4[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV36TFAlbProCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV54TFAlbProPri_Sel)==0) ) )
      {
         GXv_exceldoc3[0] = AV10ExcelDocument ;
         GXv_int4[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, true, GXv_int4, (short)(AV14FirstColumn), httpContext.getMessage( "P", "")) ;
         AV10ExcelDocument = GXv_exceldoc3[0] ;
         ttrn06wwexport.this.AV13CellRow = GXv_int4[0] ;
         GXt_char5 = "" ;
         GXv_char6[0] = GXt_char5 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV54TFAlbProPri_Sel, GXv_char6) ;
         ttrn06wwexport.this.GXt_char5 = GXv_char6[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char5 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV53TFAlbProPri)==0) ) )
         {
            GXv_exceldoc3[0] = AV10ExcelDocument ;
            GXv_int4[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, true, GXv_int4, (short)(AV14FirstColumn), httpContext.getMessage( "P", "")) ;
            AV10ExcelDocument = GXv_exceldoc3[0] ;
            ttrn06wwexport.this.AV13CellRow = GXv_int4[0] ;
            GXt_char5 = "" ;
            GXv_char6[0] = GXt_char5 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV53TFAlbProPri, GXv_char6) ;
            ttrn06wwexport.this.GXt_char5 = GXv_char6[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char5 );
         }
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV37TFAlbProfch)) ) )
      {
         GXv_exceldoc3[0] = AV10ExcelDocument ;
         GXv_int4[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, true, GXv_int4, (short)(AV14FirstColumn), httpContext.getMessage( "Data", "")) ;
         AV10ExcelDocument = GXv_exceldoc3[0] ;
         ttrn06wwexport.this.AV13CellRow = GXv_int4[0] ;
         GXt_dtime2 = GXutil.resetTime( AV37TFAlbProfch );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime2 );
      }
      if ( ! ( (0==AV39TFGuiRemCli) && (0==AV40TFGuiRemCli_To) ) )
      {
         GXv_exceldoc3[0] = AV10ExcelDocument ;
         GXv_int4[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, true, GXv_int4, (short)(AV14FirstColumn), httpContext.getMessage( "Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc3[0] ;
         ttrn06wwexport.this.AV13CellRow = GXv_int4[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV39TFGuiRemCli );
         GXv_exceldoc3[0] = AV10ExcelDocument ;
         GXv_int4[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, false, GXv_int4, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc3[0] ;
         ttrn06wwexport.this.AV13CellRow = GXv_int4[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV40TFGuiRemCli_To );
      }
      if ( ! ( (GXutil.strcmp("", AV42TFGuiRemCln_Sel)==0) ) )
      {
         GXv_exceldoc3[0] = AV10ExcelDocument ;
         GXv_int4[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, true, GXv_int4, (short)(AV14FirstColumn), httpContext.getMessage( "Nome", "")) ;
         AV10ExcelDocument = GXv_exceldoc3[0] ;
         ttrn06wwexport.this.AV13CellRow = GXv_int4[0] ;
         GXt_char5 = "" ;
         GXv_char6[0] = GXt_char5 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV42TFGuiRemCln_Sel, GXv_char6) ;
         ttrn06wwexport.this.GXt_char5 = GXv_char6[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char5 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV41TFGuiRemCln)==0) ) )
         {
            GXv_exceldoc3[0] = AV10ExcelDocument ;
            GXv_int4[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, true, GXv_int4, (short)(AV14FirstColumn), httpContext.getMessage( "Nome", "")) ;
            AV10ExcelDocument = GXv_exceldoc3[0] ;
            ttrn06wwexport.this.AV13CellRow = GXv_int4[0] ;
            GXt_char5 = "" ;
            GXv_char6[0] = GXt_char5 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV41TFGuiRemCln, GXv_char6) ;
            ttrn06wwexport.this.GXt_char5 = GXv_char6[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char5 );
         }
      }
      if ( ! ( ( AV66TFAlbMarca_Sels.size() == 0 ) ) )
      {
         GXv_exceldoc3[0] = AV10ExcelDocument ;
         GXv_int4[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, true, GXv_int4, (short)(AV14FirstColumn), "") ;
         AV10ExcelDocument = GXv_exceldoc3[0] ;
         ttrn06wwexport.this.AV13CellRow = GXv_int4[0] ;
         AV49i = 1 ;
         AV70GXV1 = 1 ;
         while ( AV70GXV1 <= AV66TFAlbMarca_Sels.size() )
         {
            AV44TFAlbMarca_Sel = (String)AV66TFAlbMarca_Sels.elementAt(-1+AV70GXV1) ;
            if ( AV49i == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( "" );
            }
            else
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+", " );
            }
            if ( GXutil.strcmp(GXutil.trim( AV44TFAlbMarca_Sel), "") == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Activo", "") );
            }
            else if ( GXutil.strcmp(GXutil.trim( AV44TFAlbMarca_Sel), httpContext.getMessage( "A", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Anulado", "") );
            }
            AV49i = (long)(AV49i+1) ;
            AV70GXV1 = (int)(AV70GXV1+1) ;
         }
      }
      if ( ! ( (GXutil.strcmp("", AV46TFAlbLic_Sel)==0) ) )
      {
         GXv_exceldoc3[0] = AV10ExcelDocument ;
         GXv_int4[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, true, GXv_int4, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo AT", "")) ;
         AV10ExcelDocument = GXv_exceldoc3[0] ;
         ttrn06wwexport.this.AV13CellRow = GXv_int4[0] ;
         GXt_char5 = "" ;
         GXv_char6[0] = GXt_char5 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV46TFAlbLic_Sel, GXv_char6) ;
         ttrn06wwexport.this.GXt_char5 = GXv_char6[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char5 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV45TFAlbLic)==0) ) )
         {
            GXv_exceldoc3[0] = AV10ExcelDocument ;
            GXv_int4[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, true, GXv_int4, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo AT", "")) ;
            AV10ExcelDocument = GXv_exceldoc3[0] ;
            ttrn06wwexport.this.AV13CellRow = GXv_int4[0] ;
            GXt_char5 = "" ;
            GXv_char6[0] = GXt_char5 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV45TFAlbLic, GXv_char6) ;
            ttrn06wwexport.this.GXt_char5 = GXv_char6[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char5 );
         }
      }
      if ( ! ( ( AV51TFAlbProAT_Sels.size() == 0 ) ) )
      {
         GXv_exceldoc3[0] = AV10ExcelDocument ;
         GXv_int4[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, true, GXv_int4, (short)(AV14FirstColumn), "") ;
         AV10ExcelDocument = GXv_exceldoc3[0] ;
         ttrn06wwexport.this.AV13CellRow = GXv_int4[0] ;
         AV49i = 1 ;
         AV71GXV2 = 1 ;
         while ( AV71GXV2 <= AV51TFAlbProAT_Sels.size() )
         {
            AV48TFAlbProAT_Sel = (String)AV51TFAlbProAT_Sels.elementAt(-1+AV71GXV2) ;
            if ( AV49i == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( "" );
            }
            else
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+", " );
            }
            if ( GXutil.strcmp(GXutil.trim( AV48TFAlbProAT_Sel), httpContext.getMessage( "A", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Automatico", "") );
            }
            else if ( GXutil.strcmp(GXutil.trim( AV48TFAlbProAT_Sel), httpContext.getMessage( "M", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Manual", "") );
            }
            AV49i = (long)(AV49i+1) ;
            AV71GXV2 = (int)(AV71GXV2+1) ;
         }
      }
      if ( ! ( ( AV59TFAlbProEst_Sels.size() == 0 ) ) )
      {
         GXv_exceldoc3[0] = AV10ExcelDocument ;
         GXv_int4[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, true, GXv_int4, (short)(AV14FirstColumn), httpContext.getMessage( "E", "")) ;
         AV10ExcelDocument = GXv_exceldoc3[0] ;
         ttrn06wwexport.this.AV13CellRow = GXv_int4[0] ;
         AV49i = 1 ;
         AV72GXV3 = 1 ;
         while ( AV72GXV3 <= AV59TFAlbProEst_Sels.size() )
         {
            AV60TFAlbProEst_Sel = ((Number) AV59TFAlbProEst_Sels.elementAt(-1+AV72GXV3)).byteValue() ;
            if ( AV49i == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( "" );
            }
            else
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+", " );
            }
            if ( AV60TFAlbProEst_Sel == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Generado", "") );
            }
            else if ( AV60TFAlbProEst_Sel == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Editado", "") );
            }
            else if ( AV60TFAlbProEst_Sel == 2 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Facturado", "") );
            }
            AV49i = (long)(AV49i+1) ;
            AV72GXV3 = (int)(AV72GXV3+1) ;
         }
      }
      if ( ! ( (GXutil.strcmp("", AV62TFAlbFmd_Sel)==0) ) )
      {
         GXv_exceldoc3[0] = AV10ExcelDocument ;
         GXv_int4[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, true, GXv_int4, (short)(AV14FirstColumn), httpContext.getMessage( "Hash", "")) ;
         AV10ExcelDocument = GXv_exceldoc3[0] ;
         ttrn06wwexport.this.AV13CellRow = GXv_int4[0] ;
         GXt_char5 = "" ;
         GXv_char6[0] = GXt_char5 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV62TFAlbFmd_Sel, GXv_char6) ;
         ttrn06wwexport.this.GXt_char5 = GXv_char6[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char5 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV61TFAlbFmd)==0) ) )
         {
            GXv_exceldoc3[0] = AV10ExcelDocument ;
            GXv_int4[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, true, GXv_int4, (short)(AV14FirstColumn), httpContext.getMessage( "Hash", "")) ;
            AV10ExcelDocument = GXv_exceldoc3[0] ;
            ttrn06wwexport.this.AV13CellRow = GXv_int4[0] ;
            GXt_char5 = "" ;
            GXv_char6[0] = GXt_char5 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV61TFAlbFmd, GXv_char6) ;
            ttrn06wwexport.this.GXt_char5 = GXv_char6[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char5 );
         }
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV32VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV20Session.getValue("TTrn06WWColumnsSelector"), "") != 0 )
      {
         AV27ColumnsSelectorXML = AV20Session.getValue("TTrn06WWColumnsSelector") ;
         AV24ColumnsSelector.fromxml(AV27ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV73GXV4 = 1 ;
      while ( AV73GXV4 <= AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV26ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV73GXV4));
         if ( AV26ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV26ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV26ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV26ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setColor( 11 );
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
         }
         AV73GXV4 = (int)(AV73GXV4+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV75Ttrn06wwds_1_albpropri = AV52AlbProPri ;
      AV76Ttrn06wwds_2_albprofch = AV18AlbProFch ;
      AV77Ttrn06wwds_3_albprofch_to = AV19AlbProFch_To ;
      AV78Ttrn06wwds_4_filterfulltext = AV67FilterFullText ;
      AV79Ttrn06wwds_5_tfalbprocod = AV35TFAlbProCod ;
      AV80Ttrn06wwds_6_tfalbprocod_to = AV36TFAlbProCod_To ;
      AV81Ttrn06wwds_7_tfalbpropri = AV53TFAlbProPri ;
      AV82Ttrn06wwds_8_tfalbpropri_sel = AV54TFAlbProPri_Sel ;
      AV83Ttrn06wwds_9_tfalbprofch = AV37TFAlbProfch ;
      AV84Ttrn06wwds_10_tfguiremcli = AV39TFGuiRemCli ;
      AV85Ttrn06wwds_11_tfguiremcli_to = AV40TFGuiRemCli_To ;
      AV86Ttrn06wwds_12_tfguiremcln = AV41TFGuiRemCln ;
      AV87Ttrn06wwds_13_tfguiremcln_sel = AV42TFGuiRemCln_Sel ;
      AV88Ttrn06wwds_14_tfalbmarca_sels = AV66TFAlbMarca_Sels ;
      AV89Ttrn06wwds_15_tfalblic = AV45TFAlbLic ;
      AV90Ttrn06wwds_16_tfalblic_sel = AV46TFAlbLic_Sel ;
      AV91Ttrn06wwds_17_tfalbproat_sels = AV51TFAlbProAT_Sels ;
      AV92Ttrn06wwds_18_tfalbproest_sels = AV59TFAlbProEst_Sels ;
      AV93Ttrn06wwds_19_tfalbfmd = AV61TFAlbFmd ;
      AV94Ttrn06wwds_20_tfalbfmd_sel = AV62TFAlbFmd_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A5140AlbMarca ,
                                           AV88Ttrn06wwds_14_tfalbmarca_sels ,
                                           A10765AlbProAT ,
                                           AV91Ttrn06wwds_17_tfalbproat_sels ,
                                           Byte.valueOf(A33AlbProEst) ,
                                           AV92Ttrn06wwds_18_tfalbproest_sels ,
                                           AV76Ttrn06wwds_2_albprofch ,
                                           AV77Ttrn06wwds_3_albprofch_to ,
                                           Long.valueOf(AV79Ttrn06wwds_5_tfalbprocod) ,
                                           Long.valueOf(AV80Ttrn06wwds_6_tfalbprocod_to) ,
                                           AV82Ttrn06wwds_8_tfalbpropri_sel ,
                                           AV81Ttrn06wwds_7_tfalbpropri ,
                                           AV83Ttrn06wwds_9_tfalbprofch ,
                                           Integer.valueOf(AV84Ttrn06wwds_10_tfguiremcli) ,
                                           Integer.valueOf(AV85Ttrn06wwds_11_tfguiremcli_to) ,
                                           AV87Ttrn06wwds_13_tfguiremcln_sel ,
                                           AV86Ttrn06wwds_12_tfguiremcln ,
                                           Integer.valueOf(AV88Ttrn06wwds_14_tfalbmarca_sels.size()) ,
                                           AV90Ttrn06wwds_16_tfalblic_sel ,
                                           AV89Ttrn06wwds_15_tfalblic ,
                                           Integer.valueOf(AV91Ttrn06wwds_17_tfalbproat_sels.size()) ,
                                           Integer.valueOf(AV92Ttrn06wwds_18_tfalbproest_sels.size()) ,
                                           AV94Ttrn06wwds_20_tfalbfmd_sel ,
                                           AV93Ttrn06wwds_19_tfalbfmd ,
                                           A34AlbProfch ,
                                           Long.valueOf(A30AlbProCod) ,
                                           A39AlbProPri ,
                                           Integer.valueOf(A1243GuiRemCli) ,
                                           A1244GuiRemCln ,
                                           A7101AlbLic ,
                                           A10017AlbFmd ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV78Ttrn06wwds_4_filterfulltext ,
                                           AV75Ttrn06wwds_1_albpropri } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV81Ttrn06wwds_7_tfalbpropri = GXutil.padr( GXutil.rtrim( AV81Ttrn06wwds_7_tfalbpropri), 1, "%") ;
      lV86Ttrn06wwds_12_tfguiremcln = GXutil.padr( GXutil.rtrim( AV86Ttrn06wwds_12_tfguiremcln), 30, "%") ;
      lV89Ttrn06wwds_15_tfalblic = GXutil.padr( GXutil.rtrim( AV89Ttrn06wwds_15_tfalblic), 20, "%") ;
      lV93Ttrn06wwds_19_tfalbfmd = GXutil.concat( GXutil.rtrim( AV93Ttrn06wwds_19_tfalbfmd), "%", "") ;
      /* Using cursor P08DV2 */
      pr_default.execute(0, new Object[] {AV75Ttrn06wwds_1_albpropri, AV76Ttrn06wwds_2_albprofch, AV77Ttrn06wwds_3_albprofch_to, Long.valueOf(AV79Ttrn06wwds_5_tfalbprocod), Long.valueOf(AV80Ttrn06wwds_6_tfalbprocod_to), lV81Ttrn06wwds_7_tfalbpropri, AV82Ttrn06wwds_8_tfalbpropri_sel, AV83Ttrn06wwds_9_tfalbprofch, Integer.valueOf(AV84Ttrn06wwds_10_tfguiremcli), Integer.valueOf(AV85Ttrn06wwds_11_tfguiremcli_to), lV86Ttrn06wwds_12_tfguiremcln, AV87Ttrn06wwds_13_tfguiremcln_sel, lV89Ttrn06wwds_15_tfalblic, AV90Ttrn06wwds_16_tfalblic_sel, lV93Ttrn06wwds_19_tfalbfmd, AV94Ttrn06wwds_20_tfalbfmd_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1253EmprGuiRem = P08DV2_A1253EmprGuiRem[0] ;
         A10017AlbFmd = P08DV2_A10017AlbFmd[0] ;
         n10017AlbFmd = P08DV2_n10017AlbFmd[0] ;
         A33AlbProEst = P08DV2_A33AlbProEst[0] ;
         A7101AlbLic = P08DV2_A7101AlbLic[0] ;
         A1244GuiRemCln = P08DV2_A1244GuiRemCln[0] ;
         A1243GuiRemCli = P08DV2_A1243GuiRemCli[0] ;
         A30AlbProCod = P08DV2_A30AlbProCod[0] ;
         A10765AlbProAT = P08DV2_A10765AlbProAT[0] ;
         A5140AlbMarca = P08DV2_A5140AlbMarca[0] ;
         A34AlbProfch = P08DV2_A34AlbProfch[0] ;
         A39AlbProPri = P08DV2_A39AlbProPri[0] ;
         A396EmprCod = P08DV2_A396EmprCod[0] ;
         A1244GuiRemCln = P08DV2_A1244GuiRemCln[0] ;
         if ( (GXutil.strcmp("", AV78Ttrn06wwds_4_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A30AlbProCod, 10, 0) , GXutil.padr( "%" + AV78Ttrn06wwds_4_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A39AlbProPri) , GXutil.padr( "%" + GXutil.upper( AV78Ttrn06wwds_4_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1243GuiRemCli, 6, 0) , GXutil.padr( "%" + AV78Ttrn06wwds_4_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1244GuiRemCln) , GXutil.padr( "%" + GXutil.upper( AV78Ttrn06wwds_4_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "activo", ""), "") , GXutil.padr( "%" + GXutil.lower( AV78Ttrn06wwds_4_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5140AlbMarca, "") == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "anulado", ""), "") , GXutil.padr( "%" + GXutil.lower( AV78Ttrn06wwds_4_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5140AlbMarca, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A7101AlbLic) , GXutil.padr( "%" + GXutil.upper( AV78Ttrn06wwds_4_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "automatico", ""), "") , GXutil.padr( "%" + GXutil.lower( AV78Ttrn06wwds_4_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A10765AlbProAT, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "manual", ""), "") , GXutil.padr( "%" + GXutil.lower( AV78Ttrn06wwds_4_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A10765AlbProAT, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "s/d", ""), "") , GXutil.padr( "%" + GXutil.lower( AV78Ttrn06wwds_4_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A10765AlbProAT, "") == 0 ) ) || ( GXutil.like( GXutil.str( A33AlbProEst, 1, 0) , GXutil.padr( "%" + AV78Ttrn06wwds_4_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10017AlbFmd) , GXutil.padr( "%" + GXutil.upper( AV78Ttrn06wwds_4_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV13CellRow = (int)(AV13CellRow+1) ;
            /* Execute user subroutine: 'BEFOREWRITELINE' */
            S172 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               returnInSub = true;
               if (true) return;
            }
            AV32VisibleColumnCount = 0 ;
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setNumber( A30AlbProCod );
               AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char5 = "" ;
               GXv_char6[0] = GXt_char5 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A39AlbProPri, GXv_char6) ;
               ttrn06wwexport.this.GXt_char5 = GXv_char6[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char5 );
               AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_dtime2 = GXutil.resetTime( A34AlbProfch );
               AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setDate( GXt_dtime2 );
               AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setNumber( A1243GuiRemCli );
               AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char5 = "" ;
               GXv_char6[0] = GXt_char5 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1244GuiRemCln, GXv_char6) ;
               ttrn06wwexport.this.GXt_char5 = GXv_char6[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char5 );
               AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( "" );
               if ( GXutil.strcmp(GXutil.trim( A5140AlbMarca), "") == 0 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Activo", "") );
               }
               else if ( GXutil.strcmp(GXutil.trim( A5140AlbMarca), httpContext.getMessage( "A", "")) == 0 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Anulado", "") );
               }
               AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char5 = "" ;
               GXv_char6[0] = GXt_char5 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A7101AlbLic, GXv_char6) ;
               ttrn06wwexport.this.GXt_char5 = GXv_char6[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char5 );
               AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( "" );
               if ( GXutil.strcmp(GXutil.trim( A10765AlbProAT), httpContext.getMessage( "A", "")) == 0 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Automatico", "") );
               }
               else if ( GXutil.strcmp(GXutil.trim( A10765AlbProAT), httpContext.getMessage( "M", "")) == 0 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Manual", "") );
               }
               AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( "" );
               if ( A33AlbProEst == 0 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Generado", "") );
               }
               else if ( A33AlbProEst == 1 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Editado", "") );
               }
               else if ( A33AlbProEst == 2 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Facturado", "") );
               }
               AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char5 = "" ;
               GXv_char6[0] = GXt_char5 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A10017AlbFmd, GXv_char6) ;
               ttrn06wwexport.this.GXt_char5 = GXv_char6[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char5 );
               AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
            }
            /* Execute user subroutine: 'AFTERWRITELINE' */
            S182 ();
            if ( returnInSub )
            {
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
      AV24ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbProCod", "", "Nº Guia", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbProPri", "", "P", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbProfch", "", "Data", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "GuiRemCli", "", "Cliente", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "GuiRemCln", "", "Nome", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbMarca", "", "", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbLic", "", "Codigo AT", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbProAT", "", "", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbProEst", "", "E", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbFmd", "", "Hash", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXt_char5 = AV28UserCustomValue ;
      GXv_char6[0] = GXt_char5 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TTrn06WWColumnsSelector", GXv_char6) ;
      ttrn06wwexport.this.GXt_char5 = GXv_char6[0] ;
      AV28UserCustomValue = GXt_char5 ;
      if ( ! ( (GXutil.strcmp("", AV28UserCustomValue)==0) ) )
      {
         AV25ColumnsSelectorAux.fromxml(AV28UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector7[0] = AV25ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector8[0] = AV24ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, GXv_SdtWWPColumnsSelector8) ;
         AV25ColumnsSelectorAux = GXv_SdtWWPColumnsSelector7[0] ;
         AV24ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV20Session.getValue("TTrn06WWGridState"), "") == 0 )
      {
         AV22GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TTrn06WWGridState"), null, null);
      }
      else
      {
         AV22GridState.fromxml(AV20Session.getValue("TTrn06WWGridState"), null, null);
      }
      AV16OrderedBy = AV22GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV22GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV95GXV5 = 1 ;
      while ( AV95GXV5 <= AV22GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV23GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV22GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV95GXV5));
         if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "ALBPROPRI") == 0 )
         {
            AV52AlbProPri = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "ALBPROFCH") == 0 )
         {
            AV18AlbProFch = localUtil.ctod( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV19AlbProFch_To = localUtil.ctod( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV67FilterFullText = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROCOD") == 0 )
         {
            AV35TFAlbProCod = GXutil.lval( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            AV36TFAlbProCod_To = GXutil.lval( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROPRI") == 0 )
         {
            AV53TFAlbProPri = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROPRI_SEL") == 0 )
         {
            AV54TFAlbProPri_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROFCH") == 0 )
         {
            AV37TFAlbProfch = localUtil.ctod( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGUIREMCLI") == 0 )
         {
            AV39TFGuiRemCli = (int)(GXutil.lval( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV40TFGuiRemCli_To = (int)(GXutil.lval( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGUIREMCLN") == 0 )
         {
            AV41TFGuiRemCln = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGUIREMCLN_SEL") == 0 )
         {
            AV42TFGuiRemCln_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBMARCA_SEL") == 0 )
         {
            AV65TFAlbMarca_SelsJson = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV66TFAlbMarca_Sels.fromJSonString(AV65TFAlbMarca_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBLIC") == 0 )
         {
            AV45TFAlbLic = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBLIC_SEL") == 0 )
         {
            AV46TFAlbLic_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROAT_SEL") == 0 )
         {
            AV50TFAlbProAT_SelsJson = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV51TFAlbProAT_Sels.fromJSonString(AV50TFAlbProAT_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROEST_SEL") == 0 )
         {
            AV58TFAlbProEst_SelsJson = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV59TFAlbProEst_Sels.fromJSonString(AV58TFAlbProEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBFMD") == 0 )
         {
            AV61TFAlbFmd = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBFMD_SEL") == 0 )
         {
            AV62TFAlbFmd_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV95GXV5 = (int)(AV95GXV5+1) ;
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
      this.aP0[0] = ttrn06wwexport.this.AV11Filename;
      this.aP1[0] = ttrn06wwexport.this.AV12ErrorMessage;
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
      AV52AlbProPri = "" ;
      AV18AlbProFch = GXutil.nullDate() ;
      AV19AlbProFch_To = GXutil.nullDate() ;
      AV67FilterFullText = "" ;
      AV54TFAlbProPri_Sel = "" ;
      AV53TFAlbProPri = "" ;
      AV37TFAlbProfch = GXutil.nullDate() ;
      AV42TFGuiRemCln_Sel = "" ;
      AV41TFGuiRemCln = "" ;
      AV66TFAlbMarca_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV44TFAlbMarca_Sel = "" ;
      AV46TFAlbLic_Sel = "" ;
      AV45TFAlbLic = "" ;
      AV51TFAlbProAT_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV48TFAlbProAT_Sel = "" ;
      AV59TFAlbProEst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV62TFAlbFmd_Sel = "" ;
      AV61TFAlbFmd = "" ;
      GXv_exceldoc3 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int4 = new short[1] ;
      AV20Session = httpContext.getWebSession();
      AV27ColumnsSelectorXML = "" ;
      AV24ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV26ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A39AlbProPri = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      A1244GuiRemCln = "" ;
      A5140AlbMarca = "" ;
      A7101AlbLic = "" ;
      A10765AlbProAT = "" ;
      A10017AlbFmd = "" ;
      AV75Ttrn06wwds_1_albpropri = "" ;
      AV76Ttrn06wwds_2_albprofch = GXutil.nullDate() ;
      AV77Ttrn06wwds_3_albprofch_to = GXutil.nullDate() ;
      AV78Ttrn06wwds_4_filterfulltext = "" ;
      AV81Ttrn06wwds_7_tfalbpropri = "" ;
      AV82Ttrn06wwds_8_tfalbpropri_sel = "" ;
      AV83Ttrn06wwds_9_tfalbprofch = GXutil.nullDate() ;
      AV86Ttrn06wwds_12_tfguiremcln = "" ;
      AV87Ttrn06wwds_13_tfguiremcln_sel = "" ;
      AV88Ttrn06wwds_14_tfalbmarca_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV89Ttrn06wwds_15_tfalblic = "" ;
      AV90Ttrn06wwds_16_tfalblic_sel = "" ;
      AV91Ttrn06wwds_17_tfalbproat_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV92Ttrn06wwds_18_tfalbproest_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV93Ttrn06wwds_19_tfalbfmd = "" ;
      AV94Ttrn06wwds_20_tfalbfmd_sel = "" ;
      lV78Ttrn06wwds_4_filterfulltext = "" ;
      scmdbuf = "" ;
      lV81Ttrn06wwds_7_tfalbpropri = "" ;
      lV86Ttrn06wwds_12_tfguiremcln = "" ;
      lV89Ttrn06wwds_15_tfalblic = "" ;
      lV93Ttrn06wwds_19_tfalbfmd = "" ;
      P08DV2_A1253EmprGuiRem = new String[] {""} ;
      P08DV2_A10017AlbFmd = new String[] {""} ;
      P08DV2_n10017AlbFmd = new boolean[] {false} ;
      P08DV2_A33AlbProEst = new byte[1] ;
      P08DV2_A7101AlbLic = new String[] {""} ;
      P08DV2_A1244GuiRemCln = new String[] {""} ;
      P08DV2_A1243GuiRemCli = new int[1] ;
      P08DV2_A30AlbProCod = new long[1] ;
      P08DV2_A10765AlbProAT = new String[] {""} ;
      P08DV2_A5140AlbMarca = new String[] {""} ;
      P08DV2_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P08DV2_A39AlbProPri = new String[] {""} ;
      P08DV2_A396EmprCod = new String[] {""} ;
      A1253EmprGuiRem = "" ;
      A396EmprCod = "" ;
      GXt_dtime2 = GXutil.resetTime( GXutil.nullDate() );
      AV28UserCustomValue = "" ;
      GXt_char5 = "" ;
      GXv_char6 = new String[1] ;
      AV25ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV22GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV23GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV65TFAlbMarca_SelsJson = "" ;
      AV50TFAlbProAT_SelsJson = "" ;
      AV58TFAlbProEst_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttrn06wwexport__default(),
         new Object[] {
             new Object[] {
            P08DV2_A1253EmprGuiRem, P08DV2_A10017AlbFmd, P08DV2_n10017AlbFmd, P08DV2_A33AlbProEst, P08DV2_A7101AlbLic, P08DV2_A1244GuiRemCln, P08DV2_A1243GuiRemCli, P08DV2_A30AlbProCod, P08DV2_A10765AlbProAT, P08DV2_A5140AlbMarca,
            P08DV2_A34AlbProfch, P08DV2_A39AlbProPri, P08DV2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV60TFAlbProEst_Sel ;
   private byte A33AlbProEst ;
   private short GXv_int4[] ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV39TFGuiRemCli ;
   private int AV40TFGuiRemCli_To ;
   private int AV70GXV1 ;
   private int AV71GXV2 ;
   private int AV72GXV3 ;
   private int AV73GXV4 ;
   private int A1243GuiRemCli ;
   private int AV84Ttrn06wwds_10_tfguiremcli ;
   private int AV85Ttrn06wwds_11_tfguiremcli_to ;
   private int AV88Ttrn06wwds_14_tfalbmarca_sels_size ;
   private int AV91Ttrn06wwds_17_tfalbproat_sels_size ;
   private int AV92Ttrn06wwds_18_tfalbproest_sels_size ;
   private int AV95GXV5 ;
   private long AV35TFAlbProCod ;
   private long AV36TFAlbProCod_To ;
   private long AV49i ;
   private long AV32VisibleColumnCount ;
   private long A30AlbProCod ;
   private long AV79Ttrn06wwds_5_tfalbprocod ;
   private long AV80Ttrn06wwds_6_tfalbprocod_to ;
   private String AV52AlbProPri ;
   private String AV54TFAlbProPri_Sel ;
   private String AV53TFAlbProPri ;
   private String AV42TFGuiRemCln_Sel ;
   private String AV41TFGuiRemCln ;
   private String AV44TFAlbMarca_Sel ;
   private String AV46TFAlbLic_Sel ;
   private String AV45TFAlbLic ;
   private String AV48TFAlbProAT_Sel ;
   private String A39AlbProPri ;
   private String A1244GuiRemCln ;
   private String A5140AlbMarca ;
   private String A7101AlbLic ;
   private String A10765AlbProAT ;
   private String AV75Ttrn06wwds_1_albpropri ;
   private String AV81Ttrn06wwds_7_tfalbpropri ;
   private String AV82Ttrn06wwds_8_tfalbpropri_sel ;
   private String AV86Ttrn06wwds_12_tfguiremcln ;
   private String AV87Ttrn06wwds_13_tfguiremcln_sel ;
   private String AV89Ttrn06wwds_15_tfalblic ;
   private String AV90Ttrn06wwds_16_tfalblic_sel ;
   private String scmdbuf ;
   private String lV81Ttrn06wwds_7_tfalbpropri ;
   private String lV86Ttrn06wwds_12_tfguiremcln ;
   private String lV89Ttrn06wwds_15_tfalblic ;
   private String A1253EmprGuiRem ;
   private String A396EmprCod ;
   private String GXt_char5 ;
   private String GXv_char6[] ;
   private java.util.Date GXt_dtime2 ;
   private java.util.Date AV18AlbProFch ;
   private java.util.Date AV19AlbProFch_To ;
   private java.util.Date AV37TFAlbProfch ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date AV76Ttrn06wwds_2_albprofch ;
   private java.util.Date AV77Ttrn06wwds_3_albprofch_to ;
   private java.util.Date AV83Ttrn06wwds_9_tfalbprofch ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n10017AlbFmd ;
   private String AV27ColumnsSelectorXML ;
   private String AV28UserCustomValue ;
   private String AV65TFAlbMarca_SelsJson ;
   private String AV50TFAlbProAT_SelsJson ;
   private String AV58TFAlbProEst_SelsJson ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV67FilterFullText ;
   private String AV62TFAlbFmd_Sel ;
   private String AV61TFAlbFmd ;
   private String A10017AlbFmd ;
   private String AV78Ttrn06wwds_4_filterfulltext ;
   private String AV93Ttrn06wwds_19_tfalbfmd ;
   private String AV94Ttrn06wwds_20_tfalbfmd_sel ;
   private String lV78Ttrn06wwds_4_filterfulltext ;
   private String lV93Ttrn06wwds_19_tfalbfmd ;
   private GXSimpleCollection<Byte> AV59TFAlbProEst_Sels ;
   private GXSimpleCollection<Byte> AV92Ttrn06wwds_18_tfalbproest_sels ;
   private com.genexus.webpanels.WebSession AV20Session ;
   private GXSimpleCollection<String> AV66TFAlbMarca_Sels ;
   private GXSimpleCollection<String> AV51TFAlbProAT_Sels ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P08DV2_A1253EmprGuiRem ;
   private String[] P08DV2_A10017AlbFmd ;
   private boolean[] P08DV2_n10017AlbFmd ;
   private byte[] P08DV2_A33AlbProEst ;
   private String[] P08DV2_A7101AlbLic ;
   private String[] P08DV2_A1244GuiRemCln ;
   private int[] P08DV2_A1243GuiRemCli ;
   private long[] P08DV2_A30AlbProCod ;
   private String[] P08DV2_A10765AlbProAT ;
   private String[] P08DV2_A5140AlbMarca ;
   private java.util.Date[] P08DV2_A34AlbProfch ;
   private String[] P08DV2_A39AlbProPri ;
   private String[] P08DV2_A396EmprCod ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc3[] ;
   private GXSimpleCollection<String> AV88Ttrn06wwds_14_tfalbmarca_sels ;
   private GXSimpleCollection<String> AV91Ttrn06wwds_17_tfalbproat_sels ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV22GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV23GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV24ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV25ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV26ColumnsSelector_Column ;
}

final  class ttrn06wwexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08DV2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A5140AlbMarca ,
                                          GXSimpleCollection<String> AV88Ttrn06wwds_14_tfalbmarca_sels ,
                                          String A10765AlbProAT ,
                                          GXSimpleCollection<String> AV91Ttrn06wwds_17_tfalbproat_sels ,
                                          byte A33AlbProEst ,
                                          GXSimpleCollection<Byte> AV92Ttrn06wwds_18_tfalbproest_sels ,
                                          java.util.Date AV76Ttrn06wwds_2_albprofch ,
                                          java.util.Date AV77Ttrn06wwds_3_albprofch_to ,
                                          long AV79Ttrn06wwds_5_tfalbprocod ,
                                          long AV80Ttrn06wwds_6_tfalbprocod_to ,
                                          String AV82Ttrn06wwds_8_tfalbpropri_sel ,
                                          String AV81Ttrn06wwds_7_tfalbpropri ,
                                          java.util.Date AV83Ttrn06wwds_9_tfalbprofch ,
                                          int AV84Ttrn06wwds_10_tfguiremcli ,
                                          int AV85Ttrn06wwds_11_tfguiremcli_to ,
                                          String AV87Ttrn06wwds_13_tfguiremcln_sel ,
                                          String AV86Ttrn06wwds_12_tfguiremcln ,
                                          int AV88Ttrn06wwds_14_tfalbmarca_sels_size ,
                                          String AV90Ttrn06wwds_16_tfalblic_sel ,
                                          String AV89Ttrn06wwds_15_tfalblic ,
                                          int AV91Ttrn06wwds_17_tfalbproat_sels_size ,
                                          int AV92Ttrn06wwds_18_tfalbproest_sels_size ,
                                          String AV94Ttrn06wwds_20_tfalbfmd_sel ,
                                          String AV93Ttrn06wwds_19_tfalbfmd ,
                                          java.util.Date A34AlbProfch ,
                                          long A30AlbProCod ,
                                          String A39AlbProPri ,
                                          int A1243GuiRemCli ,
                                          String A1244GuiRemCln ,
                                          String A7101AlbLic ,
                                          String A10017AlbFmd ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV78Ttrn06wwds_4_filterfulltext ,
                                          String AV75Ttrn06wwds_1_albpropri )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[16];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT T1.EmprGuiRem AS EmprGuiRem, T1.AlbFmd, T1.AlbProEst, T1.AlbLic, T2.CliNom AS GuiRemCln, T1.GuiRemCli AS GuiRemCli, T1.AlbProCod, T1.AlbProAT, T1.AlbMarca," ;
      scmdbuf += " T1.AlbProfch, T1.AlbProPri, T1.EmprCod FROM (TXPCALPRD T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprGuiRem AND T2.CliCod = T1.GuiRemCli)" ;
      addWhere(sWhereString, "(T1.AlbProPri = ?)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV76Ttrn06wwds_2_albprofch)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch >= ?)");
      }
      else
      {
         GXv_int9[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV77Ttrn06wwds_3_albprofch_to)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch <= ?)");
      }
      else
      {
         GXv_int9[2] = (byte)(1) ;
      }
      if ( ! (0==AV79Ttrn06wwds_5_tfalbprocod) )
      {
         addWhere(sWhereString, "(T1.AlbProCod >= ?)");
      }
      else
      {
         GXv_int9[3] = (byte)(1) ;
      }
      if ( ! (0==AV80Ttrn06wwds_6_tfalbprocod_to) )
      {
         addWhere(sWhereString, "(T1.AlbProCod <= ?)");
      }
      else
      {
         GXv_int9[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Ttrn06wwds_8_tfalbpropri_sel)==0) && ( ! (GXutil.strcmp("", AV81Ttrn06wwds_7_tfalbpropri)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbProPri) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Ttrn06wwds_8_tfalbpropri_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbProPri = ?)");
      }
      else
      {
         GXv_int9[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV83Ttrn06wwds_9_tfalbprofch)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch >= ?)");
      }
      else
      {
         GXv_int9[7] = (byte)(1) ;
      }
      if ( ! (0==AV84Ttrn06wwds_10_tfguiremcli) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli >= ?)");
      }
      else
      {
         GXv_int9[8] = (byte)(1) ;
      }
      if ( ! (0==AV85Ttrn06wwds_11_tfguiremcli_to) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli <= ?)");
      }
      else
      {
         GXv_int9[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Ttrn06wwds_13_tfguiremcln_sel)==0) && ( ! (GXutil.strcmp("", AV86Ttrn06wwds_12_tfguiremcln)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Ttrn06wwds_13_tfguiremcln_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int9[11] = (byte)(1) ;
      }
      if ( AV88Ttrn06wwds_14_tfalbmarca_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV88Ttrn06wwds_14_tfalbmarca_sels, "T1.AlbMarca IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV90Ttrn06wwds_16_tfalblic_sel)==0) && ( ! (GXutil.strcmp("", AV89Ttrn06wwds_15_tfalblic)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbLic) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Ttrn06wwds_16_tfalblic_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbLic = ?)");
      }
      else
      {
         GXv_int9[13] = (byte)(1) ;
      }
      if ( AV91Ttrn06wwds_17_tfalbproat_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV91Ttrn06wwds_17_tfalbproat_sels, "T1.AlbProAT IN (", ")")+")");
      }
      if ( AV92Ttrn06wwds_18_tfalbproest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV92Ttrn06wwds_18_tfalbproest_sels, "T1.AlbProEst IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV94Ttrn06wwds_20_tfalbfmd_sel)==0) && ( ! (GXutil.strcmp("", AV93Ttrn06wwds_19_tfalbfmd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbFmd) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Ttrn06wwds_20_tfalbfmd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbFmd = ?)");
      }
      else
      {
         GXv_int9[15] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProCod" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProPri" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProPri DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProfch" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProfch DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.GuiRemCli" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.GuiRemCli DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbMarca" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbMarca DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbLic" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbLic DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProAT" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProAT DESC" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProEst" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProEst DESC" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbFmd" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbFmd DESC" ;
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
                  return conditional_P08DV2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[5] , (java.util.Date)dynConstraints[6] , (java.util.Date)dynConstraints[7] , ((Number) dynConstraints[8]).longValue() , ((Number) dynConstraints[9]).longValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.util.Date)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.util.Date)dynConstraints[24] , ((Number) dynConstraints[25]).longValue() , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).shortValue() , ((Boolean) dynConstraints[32]).booleanValue() , (String)dynConstraints[33] , (String)dynConstraints[34] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08DV2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 20);
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((long[]) buf[7])[0] = rslt.getLong(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 1);
               ((String[]) buf[12])[0] = rslt.getString(12, 3);
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
                  stmt.setString(sIdx, (String)parms[16], 1);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[17]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[18]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[19]).longValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[20]).longValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 1);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[23]);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 20);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 20);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 255);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 255);
               }
               return;
      }
   }

}

