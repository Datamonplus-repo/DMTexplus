package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class talbdetwwexport extends GXProcedure
{
   public talbdetwwexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( talbdetwwexport.class ), "" );
   }

   public talbdetwwexport( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      talbdetwwexport.this.aP1 = new String[] {""};
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
      talbdetwwexport.this.aP0 = aP0;
      talbdetwwexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "TALBDETWWExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      talbdetwwexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV110FilterFullText, GXv_char5) ;
      talbdetwwexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( AV38GridState.getgxTv_SdtWWPGridState_Dynamicfilters().size() >= 1 )
      {
         AV35GridStateDynamicFilter = (app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)((app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)AV38GridState.getgxTv_SdtWWPGridState_Dynamicfilters().elementAt(-1+1));
         AV18DynamicFiltersSelector1 = AV35GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Selected() ;
         if ( GXutil.strcmp(AV18DynamicFiltersSelector1, "ALBREST") == 0 )
         {
            AV99AlbREst1 = (byte)(GXutil.lval( AV35GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value())) ;
            if ( ! (0==AV99AlbREst1) )
            {
               AV13CellRow = (int)(AV13CellRow+1) ;
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn, 1, 1).setBold( (short)(1) );
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn, 1, 1).setColor( 3 );
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn, 1, 1).setText( httpContext.getMessage( "Estado", "") );
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setItalic( (short)(1) );
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( "" );
               if ( AV99AlbREst1 == 0 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( httpContext.getMessage( "Abierta", "") );
               }
               else if ( AV99AlbREst1 == 1 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( httpContext.getMessage( "Cerrada", "") );
               }
            }
         }
         if ( AV38GridState.getgxTv_SdtWWPGridState_Dynamicfilters().size() >= 2 )
         {
            AV23DynamicFiltersEnabled2 = true ;
            AV35GridStateDynamicFilter = (app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)((app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)AV38GridState.getgxTv_SdtWWPGridState_Dynamicfilters().elementAt(-1+2));
            AV24DynamicFiltersSelector2 = AV35GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Selected() ;
            if ( GXutil.strcmp(AV24DynamicFiltersSelector2, "ALBREST") == 0 )
            {
               AV101AlbREst2 = (byte)(GXutil.lval( AV35GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value())) ;
               if ( ! (0==AV101AlbREst2) )
               {
                  AV13CellRow = (int)(AV13CellRow+1) ;
                  AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn, 1, 1).setBold( (short)(1) );
                  AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn, 1, 1).setColor( 3 );
                  AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn, 1, 1).setText( httpContext.getMessage( "Estado", "") );
                  AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setItalic( (short)(1) );
                  AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( "" );
                  if ( AV101AlbREst2 == 0 )
                  {
                     AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( httpContext.getMessage( "Abierta", "") );
                  }
                  else if ( AV101AlbREst2 == 1 )
                  {
                     AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( httpContext.getMessage( "Cerrada", "") );
                  }
               }
            }
            if ( AV38GridState.getgxTv_SdtWWPGridState_Dynamicfilters().size() >= 3 )
            {
               AV29DynamicFiltersEnabled3 = true ;
               AV35GridStateDynamicFilter = (app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)((app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)AV38GridState.getgxTv_SdtWWPGridState_Dynamicfilters().elementAt(-1+3));
               AV30DynamicFiltersSelector3 = AV35GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Selected() ;
               if ( GXutil.strcmp(AV30DynamicFiltersSelector3, "ALBREST") == 0 )
               {
                  AV103AlbREst3 = (byte)(GXutil.lval( AV35GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value())) ;
                  if ( ! (0==AV103AlbREst3) )
                  {
                     AV13CellRow = (int)(AV13CellRow+1) ;
                     AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn, 1, 1).setBold( (short)(1) );
                     AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn, 1, 1).setColor( 3 );
                     AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn, 1, 1).setText( httpContext.getMessage( "Estado", "") );
                     AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setItalic( (short)(1) );
                     AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( "" );
                     if ( AV103AlbREst3 == 0 )
                     {
                        AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( httpContext.getMessage( "Abierta", "") );
                     }
                     else if ( AV103AlbREst3 == 1 )
                     {
                        AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( httpContext.getMessage( "Cerrada", "") );
                     }
                  }
               }
            }
         }
      }
      if ( ! ( (0==AV51TFAlbRecCod) && (0==AV52TFAlbRecCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "N Recepcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         talbdetwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV51TFAlbRecCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         talbdetwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV52TFAlbRecCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV54TFAlbREnt_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Albaran Entrega", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         talbdetwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV54TFAlbREnt_Sel, GXv_char5) ;
         talbdetwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV53TFAlbREnt)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Albaran Entrega", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            talbdetwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV53TFAlbREnt, GXv_char5) ;
            talbdetwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV56TFAlbREnt2_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nº Albaran Entrega", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         talbdetwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV56TFAlbREnt2_Sel, GXv_char5) ;
         talbdetwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV55TFAlbREnt2)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nº Albaran Entrega", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            talbdetwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV55TFAlbREnt2, GXv_char5) ;
            talbdetwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV57TFAlbRFen)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha Entrada", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         talbdetwwexport.this.AV13CellRow = GXv_int3[0] ;
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
         talbdetwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( AV59TFAlbRHEn );
      }
      if ( ! ( (0==AV61TFCliCod) && (0==AV62TFCliCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         talbdetwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV61TFCliCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         talbdetwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV62TFCliCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV64TFCliNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         talbdetwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV64TFCliNom_Sel, GXv_char5) ;
         talbdetwwexport.this.GXt_char4 = GXv_char5[0] ;
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
            talbdetwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV63TFCliNom, GXv_char5) ;
            talbdetwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV66TFAlbRef_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo Referencia", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         talbdetwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV66TFAlbRef_Sel, GXv_char5) ;
         talbdetwwexport.this.GXt_char4 = GXv_char5[0] ;
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
            talbdetwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV65TFAlbRef, GXv_char5) ;
            talbdetwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV68TFAlbRefDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion Referencia", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         talbdetwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV68TFAlbRefDsc_Sel, GXv_char5) ;
         talbdetwwexport.this.GXt_char4 = GXv_char5[0] ;
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
            talbdetwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV67TFAlbRefDsc, GXv_char5) ;
            talbdetwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV69TFProceCod) && (0==AV70TFProceCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo Procedencia", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         talbdetwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV69TFProceCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         talbdetwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV70TFProceCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV72TFProceNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         talbdetwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV72TFProceNom_Sel, GXv_char5) ;
         talbdetwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV71TFProceNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            talbdetwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV71TFProceNom, GXv_char5) ;
            talbdetwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV73TFTrnCod) && (0==AV74TFTrnCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cod Transp", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         talbdetwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV73TFTrnCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         talbdetwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV74TFTrnCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV76TFTrnNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Transportista", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         talbdetwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV76TFTrnNom_Sel, GXv_char5) ;
         talbdetwwexport.this.GXt_char4 = GXv_char5[0] ;
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
            talbdetwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV75TFTrnNom, GXv_char5) ;
            talbdetwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV77TFTipEntCod) && (0==AV78TFTipEntCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Tipo Entrada", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         talbdetwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV77TFTipEntCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         talbdetwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV78TFTipEntCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV80TFTipEntNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         talbdetwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV80TFTipEntNom_Sel, GXv_char5) ;
         talbdetwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV79TFTipEntNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            talbdetwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV79TFTipEntNom, GXv_char5) ;
            talbdetwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV82TFAlbRDes_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Destino", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         talbdetwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV82TFAlbRDes_Sel, GXv_char5) ;
         talbdetwwexport.this.GXt_char4 = GXv_char5[0] ;
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
            talbdetwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV81TFAlbRDes, GXv_char5) ;
            talbdetwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83TFAlbRUniEnt)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84TFAlbRUniEnt_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Unidades Entrada", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         talbdetwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV83TFAlbRUniEnt)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         talbdetwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV84TFAlbRUniEnt_To)) );
      }
      if ( ! ( ( AV109TFAlbRUni_Sels.size() == 0 ) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Unidad", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         talbdetwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV98i = 1 ;
         AV113GXV1 = 1 ;
         while ( AV113GXV1 <= AV109TFAlbRUni_Sels.size() )
         {
            AV86TFAlbRUni_Sel = (String)AV109TFAlbRUni_Sels.elementAt(-1+AV113GXV1) ;
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
            AV113GXV1 = (int)(AV113GXV1+1) ;
         }
      }
      if ( ! ( (0==AV87TFAlbRPieEnt) && (0==AV88TFAlbRPieEnt_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Piezas Entregadas", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         talbdetwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV87TFAlbRPieEnt );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         talbdetwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV88TFAlbRPieEnt_To );
      }
      if ( ! ( (GXutil.strcmp("", AV90TFAlbRLoc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Localizacion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         talbdetwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV90TFAlbRLoc_Sel, GXv_char5) ;
         talbdetwwexport.this.GXt_char4 = GXv_char5[0] ;
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
            talbdetwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV89TFAlbRLoc, GXv_char5) ;
            talbdetwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( ( AV92TFAlbRReo_Sels.size() == 0 ) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Reclamacion?", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         talbdetwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV98i = 1 ;
         AV114GXV2 = 1 ;
         while ( AV114GXV2 <= AV92TFAlbRReo_Sels.size() )
         {
            AV93TFAlbRReo_Sel = (String)AV92TFAlbRReo_Sels.elementAt(-1+AV114GXV2) ;
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
            AV114GXV2 = (int)(AV114GXV2+1) ;
         }
      }
      if ( ! ( (0==AV94TFAlbRPieUti) && (0==AV95TFAlbRPieUti_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Piezas Utilizadas", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         talbdetwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV94TFAlbRPieUti );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         talbdetwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV95TFAlbRPieUti_To );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV96TFAlbRUniUti)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV97TFAlbRUniUti_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Unidades Utilizadas", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         talbdetwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV96TFAlbRUniUti)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         talbdetwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV97TFAlbRUniUti_To)) );
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV48VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV36Session.getValue("TALBDETWWColumnsSelector"), "") != 0 )
      {
         AV43ColumnsSelectorXML = AV36Session.getValue("TALBDETWWColumnsSelector") ;
         AV40ColumnsSelector.fromxml(AV43ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV115GXV3 = 1 ;
      while ( AV115GXV3 <= AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV42ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV115GXV3));
         if ( AV42ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV42ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV42ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV42ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setColor( 11 );
            AV48VisibleColumnCount = (long)(AV48VisibleColumnCount+1) ;
         }
         AV115GXV3 = (int)(AV115GXV3+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV117Talbdetwwds_1_filterfulltext = AV110FilterFullText ;
      AV118Talbdetwwds_2_dynamicfiltersselector1 = AV18DynamicFiltersSelector1 ;
      AV119Talbdetwwds_3_albrest1 = AV99AlbREst1 ;
      AV120Talbdetwwds_4_dynamicfiltersenabled2 = AV23DynamicFiltersEnabled2 ;
      AV121Talbdetwwds_5_dynamicfiltersselector2 = AV24DynamicFiltersSelector2 ;
      AV122Talbdetwwds_6_albrest2 = AV101AlbREst2 ;
      AV123Talbdetwwds_7_dynamicfiltersenabled3 = AV29DynamicFiltersEnabled3 ;
      AV124Talbdetwwds_8_dynamicfiltersselector3 = AV30DynamicFiltersSelector3 ;
      AV125Talbdetwwds_9_albrest3 = AV103AlbREst3 ;
      AV126Talbdetwwds_10_tfalbreccod = AV51TFAlbRecCod ;
      AV127Talbdetwwds_11_tfalbreccod_to = AV52TFAlbRecCod_To ;
      AV128Talbdetwwds_12_tfalbrent = AV53TFAlbREnt ;
      AV129Talbdetwwds_13_tfalbrent_sel = AV54TFAlbREnt_Sel ;
      AV130Talbdetwwds_14_tfalbrent2 = AV55TFAlbREnt2 ;
      AV131Talbdetwwds_15_tfalbrent2_sel = AV56TFAlbREnt2_Sel ;
      AV132Talbdetwwds_16_tfalbrfen = AV57TFAlbRFen ;
      AV133Talbdetwwds_17_tfalbrhen = AV59TFAlbRHEn ;
      AV134Talbdetwwds_18_tfclicod = AV61TFCliCod ;
      AV135Talbdetwwds_19_tfclicod_to = AV62TFCliCod_To ;
      AV136Talbdetwwds_20_tfclinom = AV63TFCliNom ;
      AV137Talbdetwwds_21_tfclinom_sel = AV64TFCliNom_Sel ;
      AV138Talbdetwwds_22_tfalbref = AV65TFAlbRef ;
      AV139Talbdetwwds_23_tfalbref_sel = AV66TFAlbRef_Sel ;
      AV140Talbdetwwds_24_tfalbrefdsc = AV67TFAlbRefDsc ;
      AV141Talbdetwwds_25_tfalbrefdsc_sel = AV68TFAlbRefDsc_Sel ;
      AV142Talbdetwwds_26_tfprocecod = AV69TFProceCod ;
      AV143Talbdetwwds_27_tfprocecod_to = AV70TFProceCod_To ;
      AV144Talbdetwwds_28_tfprocenom = AV71TFProceNom ;
      AV145Talbdetwwds_29_tfprocenom_sel = AV72TFProceNom_Sel ;
      AV146Talbdetwwds_30_tftrncod = AV73TFTrnCod ;
      AV147Talbdetwwds_31_tftrncod_to = AV74TFTrnCod_To ;
      AV148Talbdetwwds_32_tftrnnom = AV75TFTrnNom ;
      AV149Talbdetwwds_33_tftrnnom_sel = AV76TFTrnNom_Sel ;
      AV150Talbdetwwds_34_tftipentcod = AV77TFTipEntCod ;
      AV151Talbdetwwds_35_tftipentcod_to = AV78TFTipEntCod_To ;
      AV152Talbdetwwds_36_tftipentnom = AV79TFTipEntNom ;
      AV153Talbdetwwds_37_tftipentnom_sel = AV80TFTipEntNom_Sel ;
      AV154Talbdetwwds_38_tfalbrdes = AV81TFAlbRDes ;
      AV155Talbdetwwds_39_tfalbrdes_sel = AV82TFAlbRDes_Sel ;
      AV156Talbdetwwds_40_tfalbrunient = AV83TFAlbRUniEnt ;
      AV157Talbdetwwds_41_tfalbrunient_to = AV84TFAlbRUniEnt_To ;
      AV158Talbdetwwds_42_tfalbruni_sels = AV109TFAlbRUni_Sels ;
      AV159Talbdetwwds_43_tfalbrpieent = AV87TFAlbRPieEnt ;
      AV160Talbdetwwds_44_tfalbrpieent_to = AV88TFAlbRPieEnt_To ;
      AV161Talbdetwwds_45_tfalbrloc = AV89TFAlbRLoc ;
      AV162Talbdetwwds_46_tfalbrloc_sel = AV90TFAlbRLoc_Sel ;
      AV163Talbdetwwds_47_tfalbrreo_sels = AV92TFAlbRReo_Sels ;
      AV164Talbdetwwds_48_tfalbrpieuti = AV94TFAlbRPieUti ;
      AV165Talbdetwwds_49_tfalbrpieuti_to = AV95TFAlbRPieUti_To ;
      AV166Talbdetwwds_50_tfalbruniuti = AV96TFAlbRUniUti ;
      AV167Talbdetwwds_51_tfalbruniuti_to = AV97TFAlbRUniUti_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A56AlbRUni ,
                                           AV158Talbdetwwds_42_tfalbruni_sels ,
                                           A55AlbRReo ,
                                           AV163Talbdetwwds_47_tfalbrreo_sels ,
                                           AV118Talbdetwwds_2_dynamicfiltersselector1 ,
                                           Boolean.valueOf(AV120Talbdetwwds_4_dynamicfiltersenabled2) ,
                                           AV121Talbdetwwds_5_dynamicfiltersselector2 ,
                                           Boolean.valueOf(AV123Talbdetwwds_7_dynamicfiltersenabled3) ,
                                           AV124Talbdetwwds_8_dynamicfiltersselector3 ,
                                           Integer.valueOf(AV126Talbdetwwds_10_tfalbreccod) ,
                                           Integer.valueOf(AV127Talbdetwwds_11_tfalbreccod_to) ,
                                           AV129Talbdetwwds_13_tfalbrent_sel ,
                                           AV128Talbdetwwds_12_tfalbrent ,
                                           AV131Talbdetwwds_15_tfalbrent2_sel ,
                                           AV130Talbdetwwds_14_tfalbrent2 ,
                                           AV132Talbdetwwds_16_tfalbrfen ,
                                           AV133Talbdetwwds_17_tfalbrhen ,
                                           Integer.valueOf(AV134Talbdetwwds_18_tfclicod) ,
                                           Integer.valueOf(AV135Talbdetwwds_19_tfclicod_to) ,
                                           AV137Talbdetwwds_21_tfclinom_sel ,
                                           AV136Talbdetwwds_20_tfclinom ,
                                           AV139Talbdetwwds_23_tfalbref_sel ,
                                           AV138Talbdetwwds_22_tfalbref ,
                                           AV141Talbdetwwds_25_tfalbrefdsc_sel ,
                                           AV140Talbdetwwds_24_tfalbrefdsc ,
                                           Short.valueOf(AV142Talbdetwwds_26_tfprocecod) ,
                                           Short.valueOf(AV143Talbdetwwds_27_tfprocecod_to) ,
                                           AV145Talbdetwwds_29_tfprocenom_sel ,
                                           AV144Talbdetwwds_28_tfprocenom ,
                                           Short.valueOf(AV146Talbdetwwds_30_tftrncod) ,
                                           Short.valueOf(AV147Talbdetwwds_31_tftrncod_to) ,
                                           AV149Talbdetwwds_33_tftrnnom_sel ,
                                           AV148Talbdetwwds_32_tftrnnom ,
                                           Short.valueOf(AV150Talbdetwwds_34_tftipentcod) ,
                                           Short.valueOf(AV151Talbdetwwds_35_tftipentcod_to) ,
                                           AV153Talbdetwwds_37_tftipentnom_sel ,
                                           AV152Talbdetwwds_36_tftipentnom ,
                                           AV155Talbdetwwds_39_tfalbrdes_sel ,
                                           AV154Talbdetwwds_38_tfalbrdes ,
                                           AV156Talbdetwwds_40_tfalbrunient ,
                                           AV157Talbdetwwds_41_tfalbrunient_to ,
                                           Integer.valueOf(AV158Talbdetwwds_42_tfalbruni_sels.size()) ,
                                           Integer.valueOf(AV159Talbdetwwds_43_tfalbrpieent) ,
                                           Integer.valueOf(AV160Talbdetwwds_44_tfalbrpieent_to) ,
                                           AV162Talbdetwwds_46_tfalbrloc_sel ,
                                           AV161Talbdetwwds_45_tfalbrloc ,
                                           Integer.valueOf(AV163Talbdetwwds_47_tfalbrreo_sels.size()) ,
                                           Integer.valueOf(AV164Talbdetwwds_48_tfalbrpieuti) ,
                                           Integer.valueOf(AV165Talbdetwwds_49_tfalbrpieuti_to) ,
                                           AV166Talbdetwwds_50_tfalbruniuti ,
                                           AV167Talbdetwwds_51_tfalbruniuti_to ,
                                           Byte.valueOf(A47AlbREst) ,
                                           Byte.valueOf(AV119Talbdetwwds_3_albrest1) ,
                                           Byte.valueOf(AV122Talbdetwwds_6_albrest2) ,
                                           Byte.valueOf(AV125Talbdetwwds_9_albrest3) ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A46AlbREnt ,
                                           A5806AlbREnt2 ,
                                           A49AlbRFen ,
                                           A4606AlbRHEn ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A45AlbRef ,
                                           A3613AlbRefDsc ,
                                           Short.valueOf(A970ProceCod) ,
                                           A971ProceNom ,
                                           Short.valueOf(A840TrnCod) ,
                                           A841TrnNom ,
                                           Short.valueOf(A1211TipEntCod) ,
                                           A1212TipEntNom ,
                                           A1291AlbRDes ,
                                           A58AlbRUniEnt ,
                                           Integer.valueOf(A52AlbRPieEnt) ,
                                           A50AlbRLoc ,
                                           Integer.valueOf(A54AlbRPieUti) ,
                                           A60AlbRUniUti ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV117Talbdetwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV128Talbdetwwds_12_tfalbrent = GXutil.padr( GXutil.rtrim( AV128Talbdetwwds_12_tfalbrent), 8, "%") ;
      lV130Talbdetwwds_14_tfalbrent2 = GXutil.padr( GXutil.rtrim( AV130Talbdetwwds_14_tfalbrent2), 20, "%") ;
      lV136Talbdetwwds_20_tfclinom = GXutil.padr( GXutil.rtrim( AV136Talbdetwwds_20_tfclinom), 30, "%") ;
      lV138Talbdetwwds_22_tfalbref = GXutil.padr( GXutil.rtrim( AV138Talbdetwwds_22_tfalbref), 16, "%") ;
      lV140Talbdetwwds_24_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV140Talbdetwwds_24_tfalbrefdsc), 26, "%") ;
      lV144Talbdetwwds_28_tfprocenom = GXutil.padr( GXutil.rtrim( AV144Talbdetwwds_28_tfprocenom), 30, "%") ;
      lV148Talbdetwwds_32_tftrnnom = GXutil.padr( GXutil.rtrim( AV148Talbdetwwds_32_tftrnnom), 30, "%") ;
      lV152Talbdetwwds_36_tftipentnom = GXutil.padr( GXutil.rtrim( AV152Talbdetwwds_36_tftipentnom), 25, "%") ;
      lV154Talbdetwwds_38_tfalbrdes = GXutil.padr( GXutil.rtrim( AV154Talbdetwwds_38_tfalbrdes), 20, "%") ;
      lV161Talbdetwwds_45_tfalbrloc = GXutil.padr( GXutil.rtrim( AV161Talbdetwwds_45_tfalbrloc), 10, "%") ;
      /* Using cursor P08592 */
      pr_default.execute(0, new Object[] {Byte.valueOf(AV119Talbdetwwds_3_albrest1), Byte.valueOf(AV119Talbdetwwds_3_albrest1), Byte.valueOf(AV122Talbdetwwds_6_albrest2), Byte.valueOf(AV122Talbdetwwds_6_albrest2), Byte.valueOf(AV125Talbdetwwds_9_albrest3), Byte.valueOf(AV125Talbdetwwds_9_albrest3), Integer.valueOf(AV126Talbdetwwds_10_tfalbreccod), Integer.valueOf(AV127Talbdetwwds_11_tfalbreccod_to), lV128Talbdetwwds_12_tfalbrent, AV129Talbdetwwds_13_tfalbrent_sel, lV130Talbdetwwds_14_tfalbrent2, AV131Talbdetwwds_15_tfalbrent2_sel, AV132Talbdetwwds_16_tfalbrfen, AV133Talbdetwwds_17_tfalbrhen, Integer.valueOf(AV134Talbdetwwds_18_tfclicod), Integer.valueOf(AV135Talbdetwwds_19_tfclicod_to), lV136Talbdetwwds_20_tfclinom, AV137Talbdetwwds_21_tfclinom_sel, lV138Talbdetwwds_22_tfalbref, AV139Talbdetwwds_23_tfalbref_sel, lV140Talbdetwwds_24_tfalbrefdsc, AV141Talbdetwwds_25_tfalbrefdsc_sel, Short.valueOf(AV142Talbdetwwds_26_tfprocecod), Short.valueOf(AV143Talbdetwwds_27_tfprocecod_to), lV144Talbdetwwds_28_tfprocenom, AV145Talbdetwwds_29_tfprocenom_sel, Short.valueOf(AV146Talbdetwwds_30_tftrncod), Short.valueOf(AV147Talbdetwwds_31_tftrncod_to), lV148Talbdetwwds_32_tftrnnom, AV149Talbdetwwds_33_tftrnnom_sel, Short.valueOf(AV150Talbdetwwds_34_tftipentcod), Short.valueOf(AV151Talbdetwwds_35_tftipentcod_to), lV152Talbdetwwds_36_tftipentnom, AV153Talbdetwwds_37_tftipentnom_sel, lV154Talbdetwwds_38_tfalbrdes, AV155Talbdetwwds_39_tfalbrdes_sel, AV156Talbdetwwds_40_tfalbrunient, AV157Talbdetwwds_41_tfalbrunient_to, Integer.valueOf(AV159Talbdetwwds_43_tfalbrpieent), Integer.valueOf(AV160Talbdetwwds_44_tfalbrpieent_to), lV161Talbdetwwds_45_tfalbrloc, AV162Talbdetwwds_46_tfalbrloc_sel, Integer.valueOf(AV164Talbdetwwds_48_tfalbrpieuti), Integer.valueOf(AV165Talbdetwwds_49_tfalbrpieuti_to), AV166Talbdetwwds_50_tfalbruniuti, AV167Talbdetwwds_51_tfalbruniuti_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P08592_A396EmprCod[0] ;
         A60AlbRUniUti = P08592_A60AlbRUniUti[0] ;
         A54AlbRPieUti = P08592_A54AlbRPieUti[0] ;
         A50AlbRLoc = P08592_A50AlbRLoc[0] ;
         A52AlbRPieEnt = P08592_A52AlbRPieEnt[0] ;
         A58AlbRUniEnt = P08592_A58AlbRUniEnt[0] ;
         A1291AlbRDes = P08592_A1291AlbRDes[0] ;
         A1212TipEntNom = P08592_A1212TipEntNom[0] ;
         n1212TipEntNom = P08592_n1212TipEntNom[0] ;
         A1211TipEntCod = P08592_A1211TipEntCod[0] ;
         n1211TipEntCod = P08592_n1211TipEntCod[0] ;
         A841TrnNom = P08592_A841TrnNom[0] ;
         n841TrnNom = P08592_n841TrnNom[0] ;
         A840TrnCod = P08592_A840TrnCod[0] ;
         n840TrnCod = P08592_n840TrnCod[0] ;
         A971ProceNom = P08592_A971ProceNom[0] ;
         n971ProceNom = P08592_n971ProceNom[0] ;
         A970ProceCod = P08592_A970ProceCod[0] ;
         n970ProceCod = P08592_n970ProceCod[0] ;
         A3613AlbRefDsc = P08592_A3613AlbRefDsc[0] ;
         A45AlbRef = P08592_A45AlbRef[0] ;
         A279CliNom = P08592_A279CliNom[0] ;
         A252CliCod = P08592_A252CliCod[0] ;
         A4606AlbRHEn = P08592_A4606AlbRHEn[0] ;
         n4606AlbRHEn = P08592_n4606AlbRHEn[0] ;
         A49AlbRFen = P08592_A49AlbRFen[0] ;
         A5806AlbREnt2 = P08592_A5806AlbREnt2[0] ;
         A46AlbREnt = P08592_A46AlbREnt[0] ;
         A44AlbRecCod = P08592_A44AlbRecCod[0] ;
         A47AlbREst = P08592_A47AlbREst[0] ;
         A55AlbRReo = P08592_A55AlbRReo[0] ;
         A56AlbRUni = P08592_A56AlbRUni[0] ;
         A1212TipEntNom = P08592_A1212TipEntNom[0] ;
         n1212TipEntNom = P08592_n1212TipEntNom[0] ;
         A841TrnNom = P08592_A841TrnNom[0] ;
         n841TrnNom = P08592_n841TrnNom[0] ;
         A971ProceNom = P08592_A971ProceNom[0] ;
         n971ProceNom = P08592_n971ProceNom[0] ;
         A279CliNom = P08592_A279CliNom[0] ;
         if ( (GXutil.strcmp("", AV117Talbdetwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A44AlbRecCod, 8, 0) , GXutil.padr( "%" + AV117Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A46AlbREnt) , GXutil.padr( "%" + GXutil.upper( AV117Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5806AlbREnt2) , GXutil.padr( "%" + GXutil.upper( AV117Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV117Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV117Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A45AlbRef) , GXutil.padr( "%" + GXutil.upper( AV117Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3613AlbRefDsc) , GXutil.padr( "%" + GXutil.upper( AV117Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A970ProceCod, 4, 0) , GXutil.padr( "%" + AV117Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A971ProceNom) , GXutil.padr( "%" + GXutil.upper( AV117Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A840TrnCod, 4, 0) , GXutil.padr( "%" + AV117Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A841TrnNom) , GXutil.padr( "%" + GXutil.upper( AV117Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1211TipEntCod, 4, 0) , GXutil.padr( "%" + AV117Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1212TipEntNom) , GXutil.padr( "%" + GXutil.upper( AV117Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1291AlbRDes) , GXutil.padr( "%" + GXutil.upper( AV117Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A58AlbRUniEnt, 9, 2) , GXutil.padr( "%" + AV117Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "k", ""), "") , GXutil.padr( "%" + GXutil.lower( AV117Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "m", ""), "") , GXutil.padr( "%" + GXutil.lower( AV117Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A52AlbRPieEnt, 6, 0) , GXutil.padr( "%" + AV117Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A50AlbRLoc) , GXutil.padr( "%" + GXutil.upper( AV117Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "no", ""), "") , GXutil.padr( "%" + GXutil.lower( AV117Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "NO", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "si", ""), "") , GXutil.padr( "%" + GXutil.lower( AV117Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "SI", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A54AlbRPieUti, 6, 0) , GXutil.padr( "%" + AV117Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A60AlbRUniUti, 9, 2) , GXutil.padr( "%" + AV117Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
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
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A46AlbREnt, GXv_char5) ;
               talbdetwwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV48VisibleColumnCount = (long)(AV48VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A5806AlbREnt2, GXv_char5) ;
               talbdetwwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV48VisibleColumnCount = (long)(AV48VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_dtime6 = GXutil.resetTime( A49AlbRFen );
               AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
               AV48VisibleColumnCount = (long)(AV48VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setDate( A4606AlbRHEn );
               AV48VisibleColumnCount = (long)(AV48VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setNumber( A252CliCod );
               AV48VisibleColumnCount = (long)(AV48VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A279CliNom, GXv_char5) ;
               talbdetwwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV48VisibleColumnCount = (long)(AV48VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A45AlbRef, GXv_char5) ;
               talbdetwwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV48VisibleColumnCount = (long)(AV48VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A3613AlbRefDsc, GXv_char5) ;
               talbdetwwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV48VisibleColumnCount = (long)(AV48VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setNumber( A970ProceCod );
               AV48VisibleColumnCount = (long)(AV48VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A971ProceNom, GXv_char5) ;
               talbdetwwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV48VisibleColumnCount = (long)(AV48VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setNumber( A840TrnCod );
               AV48VisibleColumnCount = (long)(AV48VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A841TrnNom, GXv_char5) ;
               talbdetwwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV48VisibleColumnCount = (long)(AV48VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setNumber( A1211TipEntCod );
               AV48VisibleColumnCount = (long)(AV48VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1212TipEntNom, GXv_char5) ;
               talbdetwwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV48VisibleColumnCount = (long)(AV48VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1291AlbRDes, GXv_char5) ;
               talbdetwwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV48VisibleColumnCount = (long)(AV48VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A58AlbRUniEnt)) );
               AV48VisibleColumnCount = (long)(AV48VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
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
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setNumber( A52AlbRPieEnt );
               AV48VisibleColumnCount = (long)(AV48VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A50AlbRLoc, GXv_char5) ;
               talbdetwwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV48VisibleColumnCount = (long)(AV48VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
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
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setNumber( A54AlbRPieUti );
               AV48VisibleColumnCount = (long)(AV48VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A60AlbRUniUti)) );
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbRecCod", "", "N Recepcion", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbREnt", "", "Albaran Entrega", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbREnt2", "", "Nº Albaran Entrega", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbRFen", "", "Fecha Entrada", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbRHEn", "", "Hora de entrada", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CliCod", "", "Cliente", true, "") ;
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "ProceCod", "", "Codigo Procedencia", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "ProceNom", "", "Nombre", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "TrnCod", "", "Cod Transp", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "TrnNom", "", "Transportista", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "TipEntCod", "", "Tipo Entrada", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "TipEntNom", "", "Descripcion", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbRDes", "", "Destino", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbRUniEnt", "", "Unidades Entrada", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbRUni", "", "Unidad", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbRPieEnt", "", "Piezas Entregadas", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbRLoc", "", "Localizacion", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbRReo", "", "Reclamacion?", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbRPieUti", "", "Piezas Utilizadas", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbRUniUti", "", "Unidades Utilizadas", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXt_char4 = AV44UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TALBDETWWColumnsSelector", GXv_char5) ;
      talbdetwwexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV36Session.getValue("TALBDETWWGridState"), "") == 0 )
      {
         AV38GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TALBDETWWGridState"), null, null);
      }
      else
      {
         AV38GridState.fromxml(AV36Session.getValue("TALBDETWWGridState"), null, null);
      }
      AV16OrderedBy = AV38GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV38GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV168GXV4 = 1 ;
      while ( AV168GXV4 <= AV38GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV39GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV38GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV168GXV4));
         if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV110FilterFullText = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRECCOD") == 0 )
         {
            AV51TFAlbRecCod = (int)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV52TFAlbRecCod_To = (int)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRENT") == 0 )
         {
            AV53TFAlbREnt = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRENT_SEL") == 0 )
         {
            AV54TFAlbREnt_Sel = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRENT2") == 0 )
         {
            AV55TFAlbREnt2 = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRENT2_SEL") == 0 )
         {
            AV56TFAlbREnt2_Sel = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRFEN") == 0 )
         {
            AV57TFAlbRFen = localUtil.ctod( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRHEN") == 0 )
         {
            AV59TFAlbRHEn = localUtil.ctot( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV61TFCliCod = (int)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV62TFCliCod_To = (int)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
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
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCECOD") == 0 )
         {
            AV69TFProceCod = (short)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV70TFProceCod_To = (short)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCENOM") == 0 )
         {
            AV71TFProceNom = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCENOM_SEL") == 0 )
         {
            AV72TFProceNom_Sel = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNCOD") == 0 )
         {
            AV73TFTrnCod = (short)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV74TFTrnCod_To = (short)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNNOM") == 0 )
         {
            AV75TFTrnNom = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNNOM_SEL") == 0 )
         {
            AV76TFTrnNom_Sel = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPENTCOD") == 0 )
         {
            AV77TFTipEntCod = (short)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV78TFTipEntCod_To = (short)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
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
            AV108TFAlbRUni_SelsJson = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV109TFAlbRUni_Sels.fromJSonString(AV108TFAlbRUni_SelsJson, null);
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
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRPIEUTI") == 0 )
         {
            AV94TFAlbRPieUti = (int)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV95TFAlbRPieUti_To = (int)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNIUTI") == 0 )
         {
            AV96TFAlbRUniUti = CommonUtil.decimalVal( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV97TFAlbRUniUti_To = CommonUtil.decimalVal( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         AV168GXV4 = (int)(AV168GXV4+1) ;
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
      this.aP0[0] = talbdetwwexport.this.AV11Filename;
      this.aP1[0] = talbdetwwexport.this.AV12ErrorMessage;
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
      AV110FilterFullText = "" ;
      AV38GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV35GridStateDynamicFilter = new app.wwpbaseobjects.SdtWWPGridState_DynamicFilter(remoteHandle, context);
      AV18DynamicFiltersSelector1 = "" ;
      AV24DynamicFiltersSelector2 = "" ;
      AV30DynamicFiltersSelector3 = "" ;
      AV54TFAlbREnt_Sel = "" ;
      AV53TFAlbREnt = "" ;
      AV56TFAlbREnt2_Sel = "" ;
      AV55TFAlbREnt2 = "" ;
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
      AV109TFAlbRUni_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV86TFAlbRUni_Sel = "" ;
      AV90TFAlbRLoc_Sel = "" ;
      AV89TFAlbRLoc = "" ;
      AV92TFAlbRReo_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV93TFAlbRReo_Sel = "" ;
      AV96TFAlbRUniUti = DecimalUtil.ZERO ;
      AV97TFAlbRUniUti_To = DecimalUtil.ZERO ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV36Session = httpContext.getWebSession();
      AV43ColumnsSelectorXML = "" ;
      AV40ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV42ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A46AlbREnt = "" ;
      A5806AlbREnt2 = "" ;
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
      A60AlbRUniUti = DecimalUtil.ZERO ;
      AV117Talbdetwwds_1_filterfulltext = "" ;
      AV118Talbdetwwds_2_dynamicfiltersselector1 = "" ;
      AV121Talbdetwwds_5_dynamicfiltersselector2 = "" ;
      AV124Talbdetwwds_8_dynamicfiltersselector3 = "" ;
      AV128Talbdetwwds_12_tfalbrent = "" ;
      AV129Talbdetwwds_13_tfalbrent_sel = "" ;
      AV130Talbdetwwds_14_tfalbrent2 = "" ;
      AV131Talbdetwwds_15_tfalbrent2_sel = "" ;
      AV132Talbdetwwds_16_tfalbrfen = GXutil.nullDate() ;
      AV133Talbdetwwds_17_tfalbrhen = GXutil.resetTime( GXutil.nullDate() );
      AV136Talbdetwwds_20_tfclinom = "" ;
      AV137Talbdetwwds_21_tfclinom_sel = "" ;
      AV138Talbdetwwds_22_tfalbref = "" ;
      AV139Talbdetwwds_23_tfalbref_sel = "" ;
      AV140Talbdetwwds_24_tfalbrefdsc = "" ;
      AV141Talbdetwwds_25_tfalbrefdsc_sel = "" ;
      AV144Talbdetwwds_28_tfprocenom = "" ;
      AV145Talbdetwwds_29_tfprocenom_sel = "" ;
      AV148Talbdetwwds_32_tftrnnom = "" ;
      AV149Talbdetwwds_33_tftrnnom_sel = "" ;
      AV152Talbdetwwds_36_tftipentnom = "" ;
      AV153Talbdetwwds_37_tftipentnom_sel = "" ;
      AV154Talbdetwwds_38_tfalbrdes = "" ;
      AV155Talbdetwwds_39_tfalbrdes_sel = "" ;
      AV156Talbdetwwds_40_tfalbrunient = DecimalUtil.ZERO ;
      AV157Talbdetwwds_41_tfalbrunient_to = DecimalUtil.ZERO ;
      AV158Talbdetwwds_42_tfalbruni_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV161Talbdetwwds_45_tfalbrloc = "" ;
      AV162Talbdetwwds_46_tfalbrloc_sel = "" ;
      AV163Talbdetwwds_47_tfalbrreo_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV166Talbdetwwds_50_tfalbruniuti = DecimalUtil.ZERO ;
      AV167Talbdetwwds_51_tfalbruniuti_to = DecimalUtil.ZERO ;
      lV117Talbdetwwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV128Talbdetwwds_12_tfalbrent = "" ;
      lV130Talbdetwwds_14_tfalbrent2 = "" ;
      lV136Talbdetwwds_20_tfclinom = "" ;
      lV138Talbdetwwds_22_tfalbref = "" ;
      lV140Talbdetwwds_24_tfalbrefdsc = "" ;
      lV144Talbdetwwds_28_tfprocenom = "" ;
      lV148Talbdetwwds_32_tftrnnom = "" ;
      lV152Talbdetwwds_36_tftipentnom = "" ;
      lV154Talbdetwwds_38_tfalbrdes = "" ;
      lV161Talbdetwwds_45_tfalbrloc = "" ;
      P08592_A396EmprCod = new String[] {""} ;
      P08592_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08592_A54AlbRPieUti = new int[1] ;
      P08592_A50AlbRLoc = new String[] {""} ;
      P08592_A52AlbRPieEnt = new int[1] ;
      P08592_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08592_A1291AlbRDes = new String[] {""} ;
      P08592_A1212TipEntNom = new String[] {""} ;
      P08592_n1212TipEntNom = new boolean[] {false} ;
      P08592_A1211TipEntCod = new short[1] ;
      P08592_n1211TipEntCod = new boolean[] {false} ;
      P08592_A841TrnNom = new String[] {""} ;
      P08592_n841TrnNom = new boolean[] {false} ;
      P08592_A840TrnCod = new short[1] ;
      P08592_n840TrnCod = new boolean[] {false} ;
      P08592_A971ProceNom = new String[] {""} ;
      P08592_n971ProceNom = new boolean[] {false} ;
      P08592_A970ProceCod = new short[1] ;
      P08592_n970ProceCod = new boolean[] {false} ;
      P08592_A3613AlbRefDsc = new String[] {""} ;
      P08592_A45AlbRef = new String[] {""} ;
      P08592_A279CliNom = new String[] {""} ;
      P08592_A252CliCod = new int[1] ;
      P08592_A4606AlbRHEn = new java.util.Date[] {GXutil.nullDate()} ;
      P08592_n4606AlbRHEn = new boolean[] {false} ;
      P08592_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P08592_A5806AlbREnt2 = new String[] {""} ;
      P08592_A46AlbREnt = new String[] {""} ;
      P08592_A44AlbRecCod = new int[1] ;
      P08592_A47AlbREst = new byte[1] ;
      P08592_A55AlbRReo = new String[] {""} ;
      P08592_A56AlbRUni = new String[] {""} ;
      A396EmprCod = "" ;
      GXt_dtime6 = GXutil.resetTime( GXutil.nullDate() );
      AV44UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV41ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV39GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV108TFAlbRUni_SelsJson = "" ;
      AV91TFAlbRReo_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.talbdetwwexport__default(),
         new Object[] {
             new Object[] {
            P08592_A396EmprCod, P08592_A60AlbRUniUti, P08592_A54AlbRPieUti, P08592_A50AlbRLoc, P08592_A52AlbRPieEnt, P08592_A58AlbRUniEnt, P08592_A1291AlbRDes, P08592_A1212TipEntNom, P08592_n1212TipEntNom, P08592_A1211TipEntCod,
            P08592_n1211TipEntCod, P08592_A841TrnNom, P08592_n841TrnNom, P08592_A840TrnCod, P08592_n840TrnCod, P08592_A971ProceNom, P08592_n971ProceNom, P08592_A970ProceCod, P08592_n970ProceCod, P08592_A3613AlbRefDsc,
            P08592_A45AlbRef, P08592_A279CliNom, P08592_A252CliCod, P08592_A4606AlbRHEn, P08592_n4606AlbRHEn, P08592_A49AlbRFen, P08592_A5806AlbREnt2, P08592_A46AlbREnt, P08592_A44AlbRecCod, P08592_A47AlbREst,
            P08592_A55AlbRReo, P08592_A56AlbRUni
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV99AlbREst1 ;
   private byte AV101AlbREst2 ;
   private byte AV103AlbREst3 ;
   private byte AV119Talbdetwwds_3_albrest1 ;
   private byte AV122Talbdetwwds_6_albrest2 ;
   private byte AV125Talbdetwwds_9_albrest3 ;
   private byte A47AlbREst ;
   private short AV69TFProceCod ;
   private short AV70TFProceCod_To ;
   private short AV73TFTrnCod ;
   private short AV74TFTrnCod_To ;
   private short AV77TFTipEntCod ;
   private short AV78TFTipEntCod_To ;
   private short GXv_int3[] ;
   private short A970ProceCod ;
   private short A840TrnCod ;
   private short A1211TipEntCod ;
   private short AV142Talbdetwwds_26_tfprocecod ;
   private short AV143Talbdetwwds_27_tfprocecod_to ;
   private short AV146Talbdetwwds_30_tftrncod ;
   private short AV147Talbdetwwds_31_tftrncod_to ;
   private short AV150Talbdetwwds_34_tftipentcod ;
   private short AV151Talbdetwwds_35_tftipentcod_to ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV51TFAlbRecCod ;
   private int AV52TFAlbRecCod_To ;
   private int AV61TFCliCod ;
   private int AV62TFCliCod_To ;
   private int AV113GXV1 ;
   private int AV87TFAlbRPieEnt ;
   private int AV88TFAlbRPieEnt_To ;
   private int AV114GXV2 ;
   private int AV94TFAlbRPieUti ;
   private int AV95TFAlbRPieUti_To ;
   private int AV115GXV3 ;
   private int A44AlbRecCod ;
   private int A252CliCod ;
   private int A52AlbRPieEnt ;
   private int A54AlbRPieUti ;
   private int AV126Talbdetwwds_10_tfalbreccod ;
   private int AV127Talbdetwwds_11_tfalbreccod_to ;
   private int AV134Talbdetwwds_18_tfclicod ;
   private int AV135Talbdetwwds_19_tfclicod_to ;
   private int AV159Talbdetwwds_43_tfalbrpieent ;
   private int AV160Talbdetwwds_44_tfalbrpieent_to ;
   private int AV164Talbdetwwds_48_tfalbrpieuti ;
   private int AV165Talbdetwwds_49_tfalbrpieuti_to ;
   private int AV158Talbdetwwds_42_tfalbruni_sels_size ;
   private int AV163Talbdetwwds_47_tfalbrreo_sels_size ;
   private int AV168GXV4 ;
   private long AV98i ;
   private long AV48VisibleColumnCount ;
   private java.math.BigDecimal AV83TFAlbRUniEnt ;
   private java.math.BigDecimal AV84TFAlbRUniEnt_To ;
   private java.math.BigDecimal AV96TFAlbRUniUti ;
   private java.math.BigDecimal AV97TFAlbRUniUti_To ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal AV156Talbdetwwds_40_tfalbrunient ;
   private java.math.BigDecimal AV157Talbdetwwds_41_tfalbrunient_to ;
   private java.math.BigDecimal AV166Talbdetwwds_50_tfalbruniuti ;
   private java.math.BigDecimal AV167Talbdetwwds_51_tfalbruniuti_to ;
   private String AV54TFAlbREnt_Sel ;
   private String AV53TFAlbREnt ;
   private String AV56TFAlbREnt2_Sel ;
   private String AV55TFAlbREnt2 ;
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
   private String A46AlbREnt ;
   private String A5806AlbREnt2 ;
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
   private String AV128Talbdetwwds_12_tfalbrent ;
   private String AV129Talbdetwwds_13_tfalbrent_sel ;
   private String AV130Talbdetwwds_14_tfalbrent2 ;
   private String AV131Talbdetwwds_15_tfalbrent2_sel ;
   private String AV136Talbdetwwds_20_tfclinom ;
   private String AV137Talbdetwwds_21_tfclinom_sel ;
   private String AV138Talbdetwwds_22_tfalbref ;
   private String AV139Talbdetwwds_23_tfalbref_sel ;
   private String AV140Talbdetwwds_24_tfalbrefdsc ;
   private String AV141Talbdetwwds_25_tfalbrefdsc_sel ;
   private String AV144Talbdetwwds_28_tfprocenom ;
   private String AV145Talbdetwwds_29_tfprocenom_sel ;
   private String AV148Talbdetwwds_32_tftrnnom ;
   private String AV149Talbdetwwds_33_tftrnnom_sel ;
   private String AV152Talbdetwwds_36_tftipentnom ;
   private String AV153Talbdetwwds_37_tftipentnom_sel ;
   private String AV154Talbdetwwds_38_tfalbrdes ;
   private String AV155Talbdetwwds_39_tfalbrdes_sel ;
   private String AV161Talbdetwwds_45_tfalbrloc ;
   private String AV162Talbdetwwds_46_tfalbrloc_sel ;
   private String scmdbuf ;
   private String lV128Talbdetwwds_12_tfalbrent ;
   private String lV130Talbdetwwds_14_tfalbrent2 ;
   private String lV136Talbdetwwds_20_tfclinom ;
   private String lV138Talbdetwwds_22_tfalbref ;
   private String lV140Talbdetwwds_24_tfalbrefdsc ;
   private String lV144Talbdetwwds_28_tfprocenom ;
   private String lV148Talbdetwwds_32_tftrnnom ;
   private String lV152Talbdetwwds_36_tftipentnom ;
   private String lV154Talbdetwwds_38_tfalbrdes ;
   private String lV161Talbdetwwds_45_tfalbrloc ;
   private String A396EmprCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date AV59TFAlbRHEn ;
   private java.util.Date A4606AlbRHEn ;
   private java.util.Date AV133Talbdetwwds_17_tfalbrhen ;
   private java.util.Date GXt_dtime6 ;
   private java.util.Date AV57TFAlbRFen ;
   private java.util.Date A49AlbRFen ;
   private java.util.Date AV132Talbdetwwds_16_tfalbrfen ;
   private boolean returnInSub ;
   private boolean AV23DynamicFiltersEnabled2 ;
   private boolean AV29DynamicFiltersEnabled3 ;
   private boolean AV120Talbdetwwds_4_dynamicfiltersenabled2 ;
   private boolean AV123Talbdetwwds_7_dynamicfiltersenabled3 ;
   private boolean AV17OrderedDsc ;
   private boolean n1212TipEntNom ;
   private boolean n1211TipEntCod ;
   private boolean n841TrnNom ;
   private boolean n840TrnCod ;
   private boolean n971ProceNom ;
   private boolean n970ProceCod ;
   private boolean n4606AlbRHEn ;
   private String AV43ColumnsSelectorXML ;
   private String AV44UserCustomValue ;
   private String AV108TFAlbRUni_SelsJson ;
   private String AV91TFAlbRReo_SelsJson ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV110FilterFullText ;
   private String AV18DynamicFiltersSelector1 ;
   private String AV24DynamicFiltersSelector2 ;
   private String AV30DynamicFiltersSelector3 ;
   private String AV117Talbdetwwds_1_filterfulltext ;
   private String AV118Talbdetwwds_2_dynamicfiltersselector1 ;
   private String AV121Talbdetwwds_5_dynamicfiltersselector2 ;
   private String AV124Talbdetwwds_8_dynamicfiltersselector3 ;
   private String lV117Talbdetwwds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV36Session ;
   private GXSimpleCollection<String> AV109TFAlbRUni_Sels ;
   private GXSimpleCollection<String> AV92TFAlbRReo_Sels ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P08592_A396EmprCod ;
   private java.math.BigDecimal[] P08592_A60AlbRUniUti ;
   private int[] P08592_A54AlbRPieUti ;
   private String[] P08592_A50AlbRLoc ;
   private int[] P08592_A52AlbRPieEnt ;
   private java.math.BigDecimal[] P08592_A58AlbRUniEnt ;
   private String[] P08592_A1291AlbRDes ;
   private String[] P08592_A1212TipEntNom ;
   private boolean[] P08592_n1212TipEntNom ;
   private short[] P08592_A1211TipEntCod ;
   private boolean[] P08592_n1211TipEntCod ;
   private String[] P08592_A841TrnNom ;
   private boolean[] P08592_n841TrnNom ;
   private short[] P08592_A840TrnCod ;
   private boolean[] P08592_n840TrnCod ;
   private String[] P08592_A971ProceNom ;
   private boolean[] P08592_n971ProceNom ;
   private short[] P08592_A970ProceCod ;
   private boolean[] P08592_n970ProceCod ;
   private String[] P08592_A3613AlbRefDsc ;
   private String[] P08592_A45AlbRef ;
   private String[] P08592_A279CliNom ;
   private int[] P08592_A252CliCod ;
   private java.util.Date[] P08592_A4606AlbRHEn ;
   private boolean[] P08592_n4606AlbRHEn ;
   private java.util.Date[] P08592_A49AlbRFen ;
   private String[] P08592_A5806AlbREnt2 ;
   private String[] P08592_A46AlbREnt ;
   private int[] P08592_A44AlbRecCod ;
   private byte[] P08592_A47AlbREst ;
   private String[] P08592_A55AlbRReo ;
   private String[] P08592_A56AlbRUni ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private GXSimpleCollection<String> AV158Talbdetwwds_42_tfalbruni_sels ;
   private GXSimpleCollection<String> AV163Talbdetwwds_47_tfalbrreo_sels ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV38GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV39GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPGridState_DynamicFilter AV35GridStateDynamicFilter ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV40ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV41ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV42ColumnsSelector_Column ;
}

final  class talbdetwwexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08592( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV158Talbdetwwds_42_tfalbruni_sels ,
                                          String A55AlbRReo ,
                                          GXSimpleCollection<String> AV163Talbdetwwds_47_tfalbrreo_sels ,
                                          String AV118Talbdetwwds_2_dynamicfiltersselector1 ,
                                          boolean AV120Talbdetwwds_4_dynamicfiltersenabled2 ,
                                          String AV121Talbdetwwds_5_dynamicfiltersselector2 ,
                                          boolean AV123Talbdetwwds_7_dynamicfiltersenabled3 ,
                                          String AV124Talbdetwwds_8_dynamicfiltersselector3 ,
                                          int AV126Talbdetwwds_10_tfalbreccod ,
                                          int AV127Talbdetwwds_11_tfalbreccod_to ,
                                          String AV129Talbdetwwds_13_tfalbrent_sel ,
                                          String AV128Talbdetwwds_12_tfalbrent ,
                                          String AV131Talbdetwwds_15_tfalbrent2_sel ,
                                          String AV130Talbdetwwds_14_tfalbrent2 ,
                                          java.util.Date AV132Talbdetwwds_16_tfalbrfen ,
                                          java.util.Date AV133Talbdetwwds_17_tfalbrhen ,
                                          int AV134Talbdetwwds_18_tfclicod ,
                                          int AV135Talbdetwwds_19_tfclicod_to ,
                                          String AV137Talbdetwwds_21_tfclinom_sel ,
                                          String AV136Talbdetwwds_20_tfclinom ,
                                          String AV139Talbdetwwds_23_tfalbref_sel ,
                                          String AV138Talbdetwwds_22_tfalbref ,
                                          String AV141Talbdetwwds_25_tfalbrefdsc_sel ,
                                          String AV140Talbdetwwds_24_tfalbrefdsc ,
                                          short AV142Talbdetwwds_26_tfprocecod ,
                                          short AV143Talbdetwwds_27_tfprocecod_to ,
                                          String AV145Talbdetwwds_29_tfprocenom_sel ,
                                          String AV144Talbdetwwds_28_tfprocenom ,
                                          short AV146Talbdetwwds_30_tftrncod ,
                                          short AV147Talbdetwwds_31_tftrncod_to ,
                                          String AV149Talbdetwwds_33_tftrnnom_sel ,
                                          String AV148Talbdetwwds_32_tftrnnom ,
                                          short AV150Talbdetwwds_34_tftipentcod ,
                                          short AV151Talbdetwwds_35_tftipentcod_to ,
                                          String AV153Talbdetwwds_37_tftipentnom_sel ,
                                          String AV152Talbdetwwds_36_tftipentnom ,
                                          String AV155Talbdetwwds_39_tfalbrdes_sel ,
                                          String AV154Talbdetwwds_38_tfalbrdes ,
                                          java.math.BigDecimal AV156Talbdetwwds_40_tfalbrunient ,
                                          java.math.BigDecimal AV157Talbdetwwds_41_tfalbrunient_to ,
                                          int AV158Talbdetwwds_42_tfalbruni_sels_size ,
                                          int AV159Talbdetwwds_43_tfalbrpieent ,
                                          int AV160Talbdetwwds_44_tfalbrpieent_to ,
                                          String AV162Talbdetwwds_46_tfalbrloc_sel ,
                                          String AV161Talbdetwwds_45_tfalbrloc ,
                                          int AV163Talbdetwwds_47_tfalbrreo_sels_size ,
                                          int AV164Talbdetwwds_48_tfalbrpieuti ,
                                          int AV165Talbdetwwds_49_tfalbrpieuti_to ,
                                          java.math.BigDecimal AV166Talbdetwwds_50_tfalbruniuti ,
                                          java.math.BigDecimal AV167Talbdetwwds_51_tfalbruniuti_to ,
                                          byte A47AlbREst ,
                                          byte AV119Talbdetwwds_3_albrest1 ,
                                          byte AV122Talbdetwwds_6_albrest2 ,
                                          byte AV125Talbdetwwds_9_albrest3 ,
                                          int A44AlbRecCod ,
                                          String A46AlbREnt ,
                                          String A5806AlbREnt2 ,
                                          java.util.Date A49AlbRFen ,
                                          java.util.Date A4606AlbRHEn ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A45AlbRef ,
                                          String A3613AlbRefDsc ,
                                          short A970ProceCod ,
                                          String A971ProceNom ,
                                          short A840TrnCod ,
                                          String A841TrnNom ,
                                          short A1211TipEntCod ,
                                          String A1212TipEntNom ,
                                          String A1291AlbRDes ,
                                          java.math.BigDecimal A58AlbRUniEnt ,
                                          int A52AlbRPieEnt ,
                                          String A50AlbRLoc ,
                                          int A54AlbRPieUti ,
                                          java.math.BigDecimal A60AlbRUniUti ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV117Talbdetwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[46];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.AlbRUniUti, T1.AlbRPieUti, T1.AlbRLoc, T1.AlbRPieEnt, T1.AlbRUniEnt, T1.AlbRDes, T2.TipEntNom, T1.TipEntCod, T3.TrnNom, T1.TrnCod, T4.ProceNom," ;
      scmdbuf += " T1.ProceCod, T1.AlbRefDsc, T1.AlbRef, T5.CliNom, T1.CliCod, T1.AlbRHEn, T1.AlbRFen, T1.AlbREnt2, T1.AlbREnt, T1.AlbRecCod, T1.AlbREst, T1.AlbRReo, T1.AlbRUni FROM" ;
      scmdbuf += " ((((TXPALBREC T1 LEFT JOIN TXPENTRAD T2 ON T2.EmprCod = T1.EmprCod AND T2.TipEntCod = T1.TipEntCod) LEFT JOIN TXPTRANSP T3 ON T3.EmprCod = T1.EmprCod AND T3.TrnCod" ;
      scmdbuf += " = T1.TrnCod) LEFT JOIN TXPPROCED T4 ON T4.EmprCod = T1.EmprCod AND T4.ProceCod = T1.ProceCod) INNER JOIN TXPCLIENT T5 ON T5.EmprCod = T1.EmprCod AND T5.CliCod =" ;
      scmdbuf += " T1.CliCod)" ;
      if ( GXutil.strcmp(AV118Talbdetwwds_2_dynamicfiltersselector1, httpContext.getMessage( "ALBREST", "")) == 0 )
      {
         addWhere(sWhereString, "(T1.AlbREst = ? or ? = 9)");
      }
      else
      {
         GXv_int9[0] = (byte)(1) ;
         GXv_int9[1] = (byte)(1) ;
      }
      if ( AV120Talbdetwwds_4_dynamicfiltersenabled2 && ( GXutil.strcmp(AV121Talbdetwwds_5_dynamicfiltersselector2, httpContext.getMessage( "ALBREST", "")) == 0 ) )
      {
         addWhere(sWhereString, "(T1.AlbREst = ? or ? = 9)");
      }
      else
      {
         GXv_int9[2] = (byte)(1) ;
         GXv_int9[3] = (byte)(1) ;
      }
      if ( AV123Talbdetwwds_7_dynamicfiltersenabled3 && ( GXutil.strcmp(AV124Talbdetwwds_8_dynamicfiltersselector3, httpContext.getMessage( "ALBREST", "")) == 0 ) )
      {
         addWhere(sWhereString, "(T1.AlbREst = ? or ? = 9)");
      }
      else
      {
         GXv_int9[4] = (byte)(1) ;
         GXv_int9[5] = (byte)(1) ;
      }
      if ( ! (0==AV126Talbdetwwds_10_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int9[6] = (byte)(1) ;
      }
      if ( ! (0==AV127Talbdetwwds_11_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int9[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Talbdetwwds_13_tfalbrent_sel)==0) && ( ! (GXutil.strcmp("", AV128Talbdetwwds_12_tfalbrent)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbREnt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Talbdetwwds_13_tfalbrent_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbREnt = ?)");
      }
      else
      {
         GXv_int9[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV131Talbdetwwds_15_tfalbrent2_sel)==0) && ( ! (GXutil.strcmp("", AV130Talbdetwwds_14_tfalbrent2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbREnt2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV131Talbdetwwds_15_tfalbrent2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbREnt2 = ?)");
      }
      else
      {
         GXv_int9[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV132Talbdetwwds_16_tfalbrfen)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int9[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV133Talbdetwwds_17_tfalbrhen) )
      {
         addWhere(sWhereString, "(T1.AlbRHEn >= ?)");
      }
      else
      {
         GXv_int9[13] = (byte)(1) ;
      }
      if ( ! (0==AV134Talbdetwwds_18_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int9[14] = (byte)(1) ;
      }
      if ( ! (0==AV135Talbdetwwds_19_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int9[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV137Talbdetwwds_21_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV136Talbdetwwds_20_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV137Talbdetwwds_21_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.CliNom = ?)");
      }
      else
      {
         GXv_int9[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV139Talbdetwwds_23_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV138Talbdetwwds_22_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV139Talbdetwwds_23_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef = ?)");
      }
      else
      {
         GXv_int9[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV141Talbdetwwds_25_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV140Talbdetwwds_24_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV141Talbdetwwds_25_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int9[21] = (byte)(1) ;
      }
      if ( ! (0==AV142Talbdetwwds_26_tfprocecod) )
      {
         addWhere(sWhereString, "(T1.ProceCod >= ?)");
      }
      else
      {
         GXv_int9[22] = (byte)(1) ;
      }
      if ( ! (0==AV143Talbdetwwds_27_tfprocecod_to) )
      {
         addWhere(sWhereString, "(T1.ProceCod <= ?)");
      }
      else
      {
         GXv_int9[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV145Talbdetwwds_29_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV144Talbdetwwds_28_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV145Talbdetwwds_29_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProceNom = ?)");
      }
      else
      {
         GXv_int9[25] = (byte)(1) ;
      }
      if ( ! (0==AV146Talbdetwwds_30_tftrncod) )
      {
         addWhere(sWhereString, "(T1.TrnCod >= ?)");
      }
      else
      {
         GXv_int9[26] = (byte)(1) ;
      }
      if ( ! (0==AV147Talbdetwwds_31_tftrncod_to) )
      {
         addWhere(sWhereString, "(T1.TrnCod <= ?)");
      }
      else
      {
         GXv_int9[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV149Talbdetwwds_33_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV148Talbdetwwds_32_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV149Talbdetwwds_33_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TrnNom = ?)");
      }
      else
      {
         GXv_int9[29] = (byte)(1) ;
      }
      if ( ! (0==AV150Talbdetwwds_34_tftipentcod) )
      {
         addWhere(sWhereString, "(T1.TipEntCod >= ?)");
      }
      else
      {
         GXv_int9[30] = (byte)(1) ;
      }
      if ( ! (0==AV151Talbdetwwds_35_tftipentcod_to) )
      {
         addWhere(sWhereString, "(T1.TipEntCod <= ?)");
      }
      else
      {
         GXv_int9[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV153Talbdetwwds_37_tftipentnom_sel)==0) && ( ! (GXutil.strcmp("", AV152Talbdetwwds_36_tftipentnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipEntNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV153Talbdetwwds_37_tftipentnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipEntNom = ?)");
      }
      else
      {
         GXv_int9[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV155Talbdetwwds_39_tfalbrdes_sel)==0) && ( ! (GXutil.strcmp("", AV154Talbdetwwds_38_tfalbrdes)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRDes) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV155Talbdetwwds_39_tfalbrdes_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRDes = ?)");
      }
      else
      {
         GXv_int9[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV156Talbdetwwds_40_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int9[36] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV157Talbdetwwds_41_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int9[37] = (byte)(1) ;
      }
      if ( AV158Talbdetwwds_42_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV158Talbdetwwds_42_tfalbruni_sels, "T1.AlbRUni IN (", ")")+")");
      }
      if ( ! (0==AV159Talbdetwwds_43_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int9[38] = (byte)(1) ;
      }
      if ( ! (0==AV160Talbdetwwds_44_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int9[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV162Talbdetwwds_46_tfalbrloc_sel)==0) && ( ! (GXutil.strcmp("", AV161Talbdetwwds_45_tfalbrloc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRLoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV162Talbdetwwds_46_tfalbrloc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRLoc = ?)");
      }
      else
      {
         GXv_int9[41] = (byte)(1) ;
      }
      if ( AV163Talbdetwwds_47_tfalbrreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV163Talbdetwwds_47_tfalbrreo_sels, "T1.AlbRReo IN (", ")")+")");
      }
      if ( ! (0==AV164Talbdetwwds_48_tfalbrpieuti) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti >= ?)");
      }
      else
      {
         GXv_int9[42] = (byte)(1) ;
      }
      if ( ! (0==AV165Talbdetwwds_49_tfalbrpieuti_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti <= ?)");
      }
      else
      {
         GXv_int9[43] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV166Talbdetwwds_50_tfalbruniuti)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti >= ?)");
      }
      else
      {
         GXv_int9[44] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV167Talbdetwwds_51_tfalbruniuti_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti <= ?)");
      }
      else
      {
         GXv_int9[45] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRFen" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRFen DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRecCod" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRecCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbREnt" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbREnt DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbREnt2" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbREnt2 DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRHEn" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRHEn DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T5.CliNom" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T5.CliNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRef" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRef DESC" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRefDsc" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRefDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ProceCod" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ProceCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.ProceNom" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.ProceNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TrnCod" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TrnCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 13 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.TrnNom" ;
      }
      else if ( ( AV16OrderedBy == 13 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.TrnNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 14 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TipEntCod" ;
      }
      else if ( ( AV16OrderedBy == 14 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TipEntCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 15 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.TipEntNom" ;
      }
      else if ( ( AV16OrderedBy == 15 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.TipEntNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 16 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRDes" ;
      }
      else if ( ( AV16OrderedBy == 16 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRDes DESC" ;
      }
      else if ( ( AV16OrderedBy == 17 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRUniEnt" ;
      }
      else if ( ( AV16OrderedBy == 17 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRUniEnt DESC" ;
      }
      else if ( ( AV16OrderedBy == 18 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRUni" ;
      }
      else if ( ( AV16OrderedBy == 18 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRUni DESC" ;
      }
      else if ( ( AV16OrderedBy == 19 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRPieEnt" ;
      }
      else if ( ( AV16OrderedBy == 19 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRPieEnt DESC" ;
      }
      else if ( ( AV16OrderedBy == 20 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRLoc" ;
      }
      else if ( ( AV16OrderedBy == 20 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRLoc DESC" ;
      }
      else if ( ( AV16OrderedBy == 21 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRReo" ;
      }
      else if ( ( AV16OrderedBy == 21 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRReo DESC" ;
      }
      else if ( ( AV16OrderedBy == 22 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRPieUti" ;
      }
      else if ( ( AV16OrderedBy == 22 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRPieUti DESC" ;
      }
      else if ( ( AV16OrderedBy == 23 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRUniUti" ;
      }
      else if ( ( AV16OrderedBy == 23 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRUniUti DESC" ;
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
                  return conditional_P08592(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , ((Boolean) dynConstraints[5]).booleanValue() , (String)dynConstraints[6] , ((Boolean) dynConstraints[7]).booleanValue() , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).shortValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).shortValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).intValue() , ((Number) dynConstraints[48]).intValue() , (java.math.BigDecimal)dynConstraints[49] , (java.math.BigDecimal)dynConstraints[50] , ((Number) dynConstraints[51]).byteValue() , ((Number) dynConstraints[52]).byteValue() , ((Number) dynConstraints[53]).byteValue() , ((Number) dynConstraints[54]).byteValue() , ((Number) dynConstraints[55]).intValue() , (String)dynConstraints[56] , (String)dynConstraints[57] , (java.util.Date)dynConstraints[58] , (java.util.Date)dynConstraints[59] , ((Number) dynConstraints[60]).intValue() , (String)dynConstraints[61] , (String)dynConstraints[62] , (String)dynConstraints[63] , ((Number) dynConstraints[64]).shortValue() , (String)dynConstraints[65] , ((Number) dynConstraints[66]).shortValue() , (String)dynConstraints[67] , ((Number) dynConstraints[68]).shortValue() , (String)dynConstraints[69] , (String)dynConstraints[70] , (java.math.BigDecimal)dynConstraints[71] , ((Number) dynConstraints[72]).intValue() , (String)dynConstraints[73] , ((Number) dynConstraints[74]).intValue() , (java.math.BigDecimal)dynConstraints[75] , ((Number) dynConstraints[76]).shortValue() , ((Boolean) dynConstraints[77]).booleanValue() , (String)dynConstraints[78] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08592", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getString(7, 20);
               ((String[]) buf[7])[0] = rslt.getString(8, 25);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(11);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(13);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(14, 26);
               ((String[]) buf[20])[0] = rslt.getString(15, 16);
               ((String[]) buf[21])[0] = rslt.getString(16, 30);
               ((int[]) buf[22])[0] = rslt.getInt(17);
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDateTime(18);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDate(19);
               ((String[]) buf[26])[0] = rslt.getString(20, 20);
               ((String[]) buf[27])[0] = rslt.getString(21, 8);
               ((int[]) buf[28])[0] = rslt.getInt(22);
               ((byte[]) buf[29])[0] = rslt.getByte(23);
               ((String[]) buf[30])[0] = rslt.getString(24, 2);
               ((String[]) buf[31])[0] = rslt.getString(25, 1);
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
                  stmt.setByte(sIdx, ((Number) parms[46]).byteValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[47]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[48]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[49]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[50]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[51]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 8);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 8);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 20);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 20);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[58]);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[59], false);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[68]).shortValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[69]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[72]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[73]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 30);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 30);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[76]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[77]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 25);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 25);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 20);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 20);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[82], 2);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[83], 2);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[85]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 10);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 10);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[88]).intValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[89]).intValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[90], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[91], 2);
               }
               return;
      }
   }

}

